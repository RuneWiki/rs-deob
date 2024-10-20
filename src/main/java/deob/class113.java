package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ev")
public abstract class class113 implements Runnable {

    @ObfuscatedName("ev.au")
    public final Thread field1447 = new Thread(this);

    @ObfuscatedName("ev.ae")
    public volatile boolean field1442;

    @ObfuscatedName("ev.ao")
    public Queue field1441 = new LinkedList();

    @ObfuscatedName("ev.at")
    public int field1444;

    public class113(int arg0) {
        this.field1447.setPriority(1);
        this.field1447.start();
        this.field1444 = arg0;
    }

    public void run() {
        while (!this.field1442) {
            try {
                class115 var2;
                synchronized (this) {
                    var2 = (class115) this.field1441.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2687(var2);
            } catch (Exception var8) {
                Statics.method2661((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ev.ae(Ljava/net/URLConnection;B)I")
    public int method2699(URLConnection arg0) {
        int var2 = class115.field1456;
        if (arg0 != null) {
            try {
                if (arg0 instanceof HttpURLConnection) {
                    var2 = ((HttpURLConnection) arg0).getResponseCode();
                }
            } catch (IOException var4) {
            }
        }
        return var2;
    }

    @ObfuscatedName("ev.ao(Ljava/net/URLConnection;B)V")
    public void method2701(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1444);
    }

    @ObfuscatedName("ev.at(Ljava/net/URLConnection;Let;I)V")
    public void method2690(URLConnection arg0, class115 arg1) {
        DataInputStream var3 = null;
        try {
            int var4 = arg0.getContentLength();
            var3 = new DataInputStream(arg0.getInputStream());
            byte[] var5;
            if (var4 >= 0) {
                var5 = new byte[var4];
                var3.readFully(var5);
            } else {
                var5 = new byte[0];
                byte[] var6 = class412.method2801(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class412.method6064(var6);
            }
            arg1.field1458 = var5;
        } catch (IOException var16) {
            arg1.field1458 = null;
        } finally {
            arg1.field1457 = this.method2699(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("ev.ac(Ljava/net/URL;B)Let;")
    public class115 method2691(URL arg0) {
        class115 var2 = new class115(arg0);
        synchronized (this) {
            this.field1441.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ev.ai(I)V")
    public void method2692() {
        this.field1442 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1447.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ev.au(Let;B)V")
    public abstract void method2687(class115 arg0) throws IOException;
}
