package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ch")
public abstract class class102 implements Runnable {

    @ObfuscatedName("ch.c")
    public final Thread field1354 = new Thread(this);

    @ObfuscatedName("ch.p")
    public volatile boolean field1353;

    @ObfuscatedName("ch.f")
    public Queue field1352 = new LinkedList();

    @ObfuscatedName("ch.n")
    public int field1355;

    public class102(int arg0) {
        this.field1354.setPriority(1);
        this.field1354.start();
        this.field1355 = arg0;
    }

    public void run() {
        while (!this.field1353) {
            try {
                class104 var2;
                synchronized (this) {
                    var2 = (class104) this.field1352.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2568(var2);
            } catch (Exception var8) {
                Statics.method3146((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ch.p(Ljava/net/URLConnection;I)V")
    public void method2556(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1355);
    }

    @ObfuscatedName("ch.f(Ljava/net/URLConnection;Lcm;B)V")
    public void method2557(URLConnection arg0, class104 arg1) {
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
                byte[] var6 = class355.method3113(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class355.method4288(var6);
            }
            arg1.field1368 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("ch.n(Ljava/net/URL;I)Lcm;")
    public class104 method2554(URL arg0) {
        class104 var2 = new class104(arg0);
        synchronized (this) {
            this.field1352.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ch.k(I)V")
    public void method2574() {
        this.field1353 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1354.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ch.c(Lcm;B)V")
    public abstract void method2568(class104 arg0) throws IOException;
}
