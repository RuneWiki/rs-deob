package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("eb")
public abstract class class110 implements Runnable {

    @ObfuscatedName("eb.aj")
    public final Thread field1394 = new Thread(this);

    @ObfuscatedName("eb.al")
    public volatile boolean field1395;

    @ObfuscatedName("eb.ac")
    public Queue field1396 = new LinkedList();

    @ObfuscatedName("eb.ab")
    public int field1393;

    public class110(int arg0) {
        this.field1394.setPriority(1);
        this.field1394.start();
        this.field1393 = arg0;
    }

    public void run() {
        while (!this.field1395) {
            try {
                class112 var2;
                synchronized (this) {
                    var2 = (class112) this.field1396.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2674(var2);
            } catch (Exception var8) {
                class504.method6263((String) null, var8);
            }
        }
    }

    @ObfuscatedName("eb.al(Ljava/net/URLConnection;B)I")
    public int method2659(URLConnection arg0) {
        int var2 = -1;
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

    @ObfuscatedName("eb.ac(Ljava/net/URLConnection;I)V")
    public void method2660(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1393);
    }

    @ObfuscatedName("eb.ab(Ljava/net/URLConnection;Leo;I)V")
    public void method2671(URLConnection arg0, class112 arg1) {
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
                byte[] var6 = class383.method1055(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class383.method6280(var6);
            }
            arg1.field1407 = var5;
        } catch (IOException var16) {
            arg1.field1407 = null;
        } finally {
            arg1.field1403 = this.method2659(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("eb.an(Ljava/net/URL;I)Leo;")
    public class112 method2663(URL arg0) {
        class112 var2 = new class112(arg0);
        synchronized (this) {
            this.field1396.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("eb.ao(B)V")
    public void method2658() {
        this.field1395 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1394.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("eb.aj(Leo;I)V")
    public abstract void method2674(class112 arg0) throws IOException;
}
