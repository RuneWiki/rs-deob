package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ea")
public abstract class class112 implements Runnable {

    @ObfuscatedName("ea.at")
    public final Thread field1396 = new Thread(this);

    @ObfuscatedName("ea.an")
    public volatile boolean field1399;

    @ObfuscatedName("ea.av")
    public Queue field1397 = new LinkedList();

    @ObfuscatedName("ea.as")
    public int field1398;

    public class112(int arg0) {
        this.field1396.setPriority(1);
        this.field1396.start();
        this.field1398 = arg0;
    }

    public void run() {
        while (!this.field1399) {
            try {
                class114 var2;
                synchronized (this) {
                    var2 = (class114) this.field1397.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2659(var2);
            } catch (Exception var8) {
                class528.method4947((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ea.an(Ljava/net/URLConnection;I)I")
    public int method2660(URLConnection arg0) {
        int var2 = class114.field1406;
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

    @ObfuscatedName("ea.av(Ljava/net/URLConnection;I)V")
    public void method2661(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1398);
    }

    @ObfuscatedName("ea.as(Ljava/net/URLConnection;Let;I)V")
    public void method2662(URLConnection arg0, class114 arg1) {
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
                byte[] var6 = class400.method5014(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class400.method5365(var6);
            }
            arg1.field1409 = var5;
        } catch (IOException var16) {
            arg1.field1409 = null;
        } finally {
            arg1.field1404 = this.method2660(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("ea.ax(Ljava/net/URL;I)Let;")
    public class114 method2663(URL arg0) {
        class114 var2 = new class114(arg0);
        synchronized (this) {
            this.field1397.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ea.ap(I)V")
    public void method2664() {
        this.field1399 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1396.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ea.at(Let;I)V")
    public abstract void method2659(class114 arg0) throws IOException;
}
