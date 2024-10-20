package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ex")
public abstract class class117 implements Runnable {

    @ObfuscatedName("ex.ab")
    public final Thread field1461 = new Thread(this);

    @ObfuscatedName("ex.ay")
    public volatile boolean field1466;

    @ObfuscatedName("ex.an")
    public Queue field1462 = new LinkedList();

    @ObfuscatedName("ex.au")
    public int field1463;

    public class117(int arg0) {
        this.field1461.setPriority(1);
        this.field1461.start();
        this.field1463 = arg0;
    }

    public void run() {
        while (!this.field1466) {
            try {
                class119 var2;
                synchronized (this) {
                    var2 = (class119) this.field1462.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2853(var2);
            } catch (Exception var8) {
                class575.method2216((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ex.ay(Ljava/net/URLConnection;B)I")
    public int method2855(URLConnection arg0) {
        int var2 = class119.field1473;
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

    @ObfuscatedName("ex.an(Ljava/net/URLConnection;B)V")
    public void method2854(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1463);
    }

    @ObfuscatedName("ex.au(Ljava/net/URLConnection;Lee;I)V")
    public void method2851(URLConnection arg0, class119 arg1) {
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
                byte[] var6 = class451.method6784(5000, false);
                byte[] var7 = var6;
                for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                    byte[] var9 = new byte[var5.length + var8];
                    System.arraycopy(var5, 0, var9, 0, var5.length);
                    System.arraycopy(var7, 0, var9, var5.length, var8);
                    var5 = var9;
                }
                class451.method292(var7);
            }
            arg1.field1477 = var5;
        } catch (IOException var17) {
            arg1.field1477 = null;
        } finally {
            arg1.field1471 = this.method2855(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var16) {
            }
        }
    }

    @ObfuscatedName("ex.ax(Ljava/net/URL;I)Lee;")
    public class119 method2856(URL arg0) {
        class119 var2 = new class119(arg0);
        synchronized (this) {
            this.field1462.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ex.ao(I)V")
    public void method2857() {
        this.field1466 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1461.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ex.ab(Lee;I)V")
    public abstract void method2853(class119 arg0) throws IOException;
}
