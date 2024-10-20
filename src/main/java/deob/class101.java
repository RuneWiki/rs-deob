package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cd")
public abstract class class101 implements Runnable {

    @ObfuscatedName("cd.c")
    public final Thread field1364 = new Thread(this);

    @ObfuscatedName("cd.v")
    public volatile boolean field1359;

    @ObfuscatedName("cd.q")
    public Queue field1358 = new LinkedList();

    @ObfuscatedName("cd.f")
    public int field1361;

    public class101(int arg0) {
        this.field1364.setPriority(1);
        this.field1364.start();
        this.field1361 = arg0;
    }

    public void run() {
        while (!this.field1359) {
            try {
                class103 var2;
                synchronized (this) {
                    var2 = (class103) this.field1358.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2400(var2);
            } catch (Exception var8) {
                class467.method4655((String) null, var8);
            }
        }
    }

    @ObfuscatedName("cd.v(Ljava/net/URLConnection;I)V")
    public void method2399(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1361);
    }

    @ObfuscatedName("cd.q(Ljava/net/URLConnection;Lct;I)V")
    public void method2401(URLConnection arg0, class103 arg1) {
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
                byte[] var6 = class353.method5071(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class353.method2287(var6);
            }
            arg1.field1371 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("cd.f(Ljava/net/URL;I)Lct;")
    public class103 method2402(URL arg0) {
        class103 var2 = new class103(arg0);
        synchronized (this) {
            this.field1358.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cd.j(I)V")
    public void method2407() {
        this.field1359 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1364.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("cd.c(Lct;I)V")
    public abstract void method2400(class103 arg0) throws IOException;
}
