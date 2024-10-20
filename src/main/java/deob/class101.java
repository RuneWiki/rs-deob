package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cu")
public abstract class class101 implements Runnable {

    @ObfuscatedName("cu.s")
    public final Thread field1345 = new Thread(this);

    @ObfuscatedName("cu.h")
    public volatile boolean field1344;

    @ObfuscatedName("cu.w")
    public Queue field1346 = new LinkedList();

    @ObfuscatedName("cu.v")
    public int field1350;

    public class101(int arg0) {
        this.field1345.setPriority(1);
        this.field1345.start();
        this.field1350 = arg0;
    }

    public void run() {
        while (!this.field1344) {
            try {
                class103 var2;
                synchronized (this) {
                    var2 = (class103) this.field1346.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2350(var2);
            } catch (Exception var8) {
                class468.method566((String) null, var8);
            }
        }
    }

    @ObfuscatedName("cu.h(Ljava/net/URLConnection;I)V")
    public void method2352(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1350);
    }

    @ObfuscatedName("cu.w(Ljava/net/URLConnection;Lcv;I)V")
    public void method2353(URLConnection arg0, class103 arg1) {
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
                byte[] var6 = class354.method5132(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class354.method4398(var6);
            }
            arg1.field1355 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("cu.v(Ljava/net/URL;I)Lcv;")
    public class103 method2369(URL arg0) {
        class103 var2 = new class103(arg0);
        synchronized (this) {
            this.field1346.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cu.c(S)V")
    public void method2355() {
        this.field1344 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1345.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("cu.s(Lcv;B)V")
    public abstract void method2350(class103 arg0) throws IOException;
}
