package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eg")
public abstract class class113 implements Runnable {

    @ObfuscatedName("eg.am")
    public final Thread field1425 = new Thread(this);

    @ObfuscatedName("eg.ap")
    public volatile boolean field1420;

    @ObfuscatedName("eg.af")
    public Queue field1421 = new LinkedList();

    @ObfuscatedName("eg.aj")
    public int field1422;

    public class113(int arg0) {
        this.field1425.setPriority(1);
        this.field1425.start();
        this.field1422 = arg0;
    }

    public void run() {
        while (!this.field1420) {
            try {
                class115 var2;
                synchronized (this) {
                    var2 = (class115) this.field1421.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2756(var2);
            } catch (Exception var8) {
                class557.method6332((String) null, var8);
            }
        }
    }

    @ObfuscatedName("eg.ap(Ljava/net/URLConnection;B)I")
    public int method2776(URLConnection arg0) {
        int var2 = class115.field1436;
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

    @ObfuscatedName("eg.af(Ljava/net/URLConnection;I)V")
    public void method2758(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1422);
    }

    @ObfuscatedName("eg.aj(Ljava/net/URLConnection;Lee;I)V")
    public void method2759(URLConnection arg0, class115 arg1) {
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
                byte[] var6 = class428.method3007(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class428.method3077(var6);
            }
            arg1.field1438 = var5;
        } catch (IOException var16) {
            arg1.field1438 = null;
        } finally {
            arg1.field1437 = this.method2776(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("eg.aq(Ljava/net/URL;I)Lee;")
    public class115 method2760(URL arg0) {
        class115 var2 = new class115(arg0);
        synchronized (this) {
            this.field1421.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eg.ar(I)V")
    public void method2769() {
        this.field1420 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1425.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("eg.am(Lee;I)V")
    public abstract void method2756(class115 arg0) throws IOException;
}
