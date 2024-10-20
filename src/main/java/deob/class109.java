package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("dl")
public abstract class class109 implements Runnable {

    @ObfuscatedName("dl.h")
    public final Thread field1441 = new Thread(this);

    @ObfuscatedName("dl.e")
    public volatile boolean field1439;

    @ObfuscatedName("dl.v")
    public Queue field1440 = new LinkedList();

    @ObfuscatedName("dl.x")
    public int field1438;

    public class109(int arg0) {
        this.field1441.setPriority(1);
        this.field1441.start();
        this.field1438 = arg0;
    }

    public void run() {
        while (!this.field1439) {
            try {
                class111 var2;
                synchronized (this) {
                    var2 = (class111) this.field1440.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2605(var2);
            } catch (Exception var8) {
                class493.method2879((String) null, var8);
            }
        }
    }

    @ObfuscatedName("dl.e(Ljava/net/URLConnection;I)V")
    public void method2606(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1438);
    }

    @ObfuscatedName("dl.v(Ljava/net/URLConnection;Ldm;B)V")
    public void method2613(URLConnection arg0, class111 arg1) {
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
                byte[] var6 = class376.method2120(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class376.method3729(var6);
            }
            arg1.field1451 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("dl.x(Ljava/net/URL;B)Ldm;")
    public class111 method2608(URL arg0) {
        class111 var2 = new class111(arg0);
        synchronized (this) {
            this.field1440.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("dl.m(I)V")
    public void method2624() {
        this.field1439 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1441.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("dl.h(Ldm;I)V")
    public abstract void method2605(class111 arg0) throws IOException;
}
