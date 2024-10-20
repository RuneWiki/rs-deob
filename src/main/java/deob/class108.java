package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("et")
public abstract class class108 implements Runnable {

    @ObfuscatedName("et.af")
    public final Thread field1400 = new Thread(this);

    @ObfuscatedName("et.an")
    public volatile boolean field1397;

    @ObfuscatedName("et.aw")
    public Queue field1398 = new LinkedList();

    @ObfuscatedName("et.ac")
    public int field1399;

    public class108(int arg0) {
        this.field1400.setPriority(1);
        this.field1400.start();
        this.field1399 = arg0;
    }

    public void run() {
        while (!this.field1397) {
            try {
                class110 var2;
                synchronized (this) {
                    var2 = (class110) this.field1398.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2671(var2);
            } catch (Exception var8) {
                class516.method6950((String) null, var8);
            }
        }
    }

    @ObfuscatedName("et.an(Ljava/net/URLConnection;I)I")
    public int method2672(URLConnection arg0) {
        int var2 = class110.field1407;
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

    @ObfuscatedName("et.aw(Ljava/net/URLConnection;I)V")
    public void method2688(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1399);
    }

    @ObfuscatedName("et.ac(Ljava/net/URLConnection;Lez;B)V")
    public void method2691(URLConnection arg0, class110 arg1) {
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
                byte[] var6 = Statics.method4975(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class387.method2145(var6);
            }
            arg1.field1410 = var5;
        } catch (IOException var16) {
            arg1.field1410 = null;
        } finally {
            arg1.field1406 = this.method2672(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("et.au(Ljava/net/URL;I)Lez;")
    public class110 method2679(URL arg0) {
        class110 var2 = new class110(arg0);
        synchronized (this) {
            this.field1398.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("et.ab(I)V")
    public void method2676() {
        this.field1397 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1400.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("et.af(Lez;B)V")
    public abstract void method2671(class110 arg0) throws IOException;
}
