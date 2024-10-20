package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ea")
public abstract class class114 implements Runnable {

    @ObfuscatedName("ea.az")
    public final Thread field1456 = new Thread(this);

    @ObfuscatedName("ea.ah")
    public volatile boolean field1450;

    @ObfuscatedName("ea.af")
    public Queue field1451 = new LinkedList();

    @ObfuscatedName("ea.at")
    public int field1449;

    public class114(int arg0) {
        this.field1456.setPriority(1);
        this.field1456.start();
        this.field1449 = arg0;
    }

    public void run() {
        while (!this.field1450) {
            try {
                class116 var2;
                synchronized (this) {
                    var2 = (class116) this.field1451.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2695(var2);
            } catch (Exception var8) {
                class561.method3291((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ea.ah(Ljava/net/URLConnection;I)I")
    public int method2674(URLConnection arg0) {
        int var2 = class116.field1465;
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

    @ObfuscatedName("ea.af(Ljava/net/URLConnection;I)V")
    public void method2675(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1449);
    }

    @ObfuscatedName("ea.at(Ljava/net/URLConnection;Lel;B)V")
    public void method2676(URLConnection arg0, class116 arg1) {
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
                byte[] var6 = class432.method3418(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class432.method5159(var6);
            }
            arg1.field1467 = var5;
        } catch (IOException var16) {
            arg1.field1467 = null;
        } finally {
            arg1.field1466 = this.method2674(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("ea.an(Ljava/net/URL;B)Lel;")
    public class116 method2677(URL arg0) {
        class116 var2 = new class116(arg0);
        synchronized (this) {
            this.field1451.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ea.ao(B)V")
    public void method2689() {
        this.field1450 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1456.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ea.az(Lel;I)V")
    public abstract void method2695(class116 arg0) throws IOException;
}
