package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("en")
public abstract class class115 implements Runnable {

    @ObfuscatedName("en.ac")
    public final Thread field1441 = new Thread(this);

    @ObfuscatedName("en.al")
    public volatile boolean field1440;

    @ObfuscatedName("en.ak")
    public Queue field1435 = new LinkedList();

    @ObfuscatedName("en.ax")
    public int field1438;

    public class115(int arg0) {
        this.field1441.setPriority(1);
        this.field1441.start();
        this.field1438 = arg0;
    }

    public void run() {
        while (!this.field1440) {
            try {
                class117 var2;
                synchronized (this) {
                    var2 = (class117) this.field1435.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2697(var2);
            } catch (Exception var8) {
                class556.method3321((String) null, var8);
            }
        }
    }

    @ObfuscatedName("en.al(Ljava/net/URLConnection;B)I")
    public int method2713(URLConnection arg0) {
        int var2 = class117.field1447;
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

    @ObfuscatedName("en.ak(Ljava/net/URLConnection;I)V")
    public void method2716(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1438);
    }

    @ObfuscatedName("en.ax(Ljava/net/URLConnection;Leq;S)V")
    public void method2709(URLConnection arg0, class117 arg1) {
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
                byte[] var6 = class427.method2993(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class427.method2026(var6);
            }
            arg1.field1443 = var5;
        } catch (IOException var16) {
            arg1.field1443 = null;
        } finally {
            arg1.field1446 = this.method2713(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("en.ao(Ljava/net/URL;I)Leq;")
    public class117 method2701(URL arg0) {
        class117 var2 = new class117(arg0);
        synchronized (this) {
            this.field1435.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("en.ah(I)V")
    public void method2715() {
        this.field1440 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1441.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("en.ac(Leq;I)V")
    public abstract void method2697(class117 arg0) throws IOException;
}
