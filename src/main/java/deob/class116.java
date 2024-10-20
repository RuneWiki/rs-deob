package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eb")
public abstract class class116 implements Runnable {

    @ObfuscatedName("eb.ak")
    public final Thread field1480 = new Thread(this);

    @ObfuscatedName("eb.al")
    public volatile boolean field1478;

    @ObfuscatedName("eb.aj")
    public Queue field1481 = new LinkedList();

    @ObfuscatedName("eb.az")
    public int field1479;

    public class116(int arg0) {
        this.field1480.setPriority(1);
        this.field1480.start();
        this.field1479 = arg0;
    }

    public void run() {
        while (!this.field1478) {
            try {
                class118 var2;
                synchronized (this) {
                    var2 = (class118) this.field1481.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2785(var2);
            } catch (Exception var8) {
                class571.method8083((String) null, var8);
            }
        }
    }

    @ObfuscatedName("eb.al(Ljava/net/URLConnection;I)I")
    public int method2768(URLConnection arg0) {
        int var2 = class118.field1487;
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

    @ObfuscatedName("eb.aj(Ljava/net/URLConnection;B)V")
    public void method2788(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1479);
    }

    @ObfuscatedName("eb.az(Ljava/net/URLConnection;Lea;I)V")
    public void method2775(URLConnection arg0, class118 arg1) {
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
                byte[] var6 = class449.method1145(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class449.method3367(var6);
            }
            arg1.field1491 = var5;
        } catch (IOException var16) {
            arg1.field1491 = null;
        } finally {
            arg1.field1490 = this.method2768(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("eb.af(Ljava/net/URL;I)Lea;")
    public class118 method2771(URL arg0) {
        class118 var2 = new class118(arg0);
        synchronized (this) {
            this.field1481.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eb.aa(I)V")
    public void method2769() {
        this.field1478 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1480.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("eb.ak(Lea;B)V")
    public abstract void method2785(class118 arg0) throws IOException;
}
