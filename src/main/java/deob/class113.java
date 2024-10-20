package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ej")
public abstract class class113 implements Runnable {

    @ObfuscatedName("ej.aw")
    public final Thread field1425 = new Thread(this);

    @ObfuscatedName("ej.ay")
    public volatile boolean field1426;

    @ObfuscatedName("ej.ar")
    public Queue field1427 = new LinkedList();

    @ObfuscatedName("ej.am")
    public int field1428;

    public class113(int arg0) {
        this.field1425.setPriority(1);
        this.field1425.start();
        this.field1428 = arg0;
    }

    public void run() {
        while (!this.field1426) {
            try {
                class115 var2;
                synchronized (this) {
                    var2 = (class115) this.field1427.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2676(var2);
            } catch (Exception var8) {
                class541.method5458((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ej.ay(Ljava/net/URLConnection;I)I")
    public int method2677(URLConnection arg0) {
        int var2 = class115.field1442;
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

    @ObfuscatedName("ej.ar(Ljava/net/URLConnection;I)V")
    public void method2678(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1428);
    }

    @ObfuscatedName("ej.am(Ljava/net/URLConnection;Lei;I)V")
    public void method2679(URLConnection arg0, class115 arg1) {
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
                byte[] var6 = Statics.method5478(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class413.method6316(var6);
            }
            arg1.field1439 = var5;
        } catch (IOException var16) {
            arg1.field1439 = null;
        } finally {
            arg1.field1438 = this.method2677(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("ej.as(Ljava/net/URL;I)Lei;")
    public class115 method2686(URL arg0) {
        class115 var2 = new class115(arg0);
        synchronized (this) {
            this.field1427.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ej.aj(S)V")
    public void method2692() {
        this.field1426 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1425.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ej.aw(Lei;I)V")
    public abstract void method2676(class115 arg0) throws IOException;
}
