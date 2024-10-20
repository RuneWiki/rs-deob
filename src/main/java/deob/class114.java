package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("el")
public abstract class class114 implements Runnable {

    @ObfuscatedName("el.aq")
    public final Thread field1440 = new Thread(this);

    @ObfuscatedName("el.aw")
    public volatile boolean field1444;

    @ObfuscatedName("el.al")
    public Queue field1439 = new LinkedList();

    @ObfuscatedName("el.ai")
    public int field1442;

    public class114(int arg0) {
        this.field1440.setPriority(1);
        this.field1440.start();
        this.field1442 = arg0;
    }

    public void run() {
        while (!this.field1444) {
            try {
                class116 var2;
                synchronized (this) {
                    var2 = (class116) this.field1439.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2757(var2);
            } catch (Exception var8) {
                Statics.method5453((String) null, var8);
            }
        }
    }

    @ObfuscatedName("el.aw(Ljava/net/URLConnection;B)I")
    public int method2758(URLConnection arg0) {
        int var2 = class116.field1446;
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

    @ObfuscatedName("el.al(Ljava/net/URLConnection;I)V")
    public void method2770(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1442);
    }

    @ObfuscatedName("el.ai(Ljava/net/URLConnection;Leb;B)V")
    public void method2759(URLConnection arg0, class116 arg1) {
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
                byte[] var6 = class431.method5800(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class431.method3046(var6);
            }
            arg1.field1450 = var5;
        } catch (IOException var16) {
            arg1.field1450 = null;
        } finally {
            arg1.field1449 = this.method2758(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("el.ar(Ljava/net/URL;B)Leb;")
    public class116 method2761(URL arg0) {
        class116 var2 = new class116(arg0);
        synchronized (this) {
            this.field1439.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("el.as(I)V")
    public void method2756() {
        this.field1444 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1440.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("el.aq(Leb;I)V")
    public abstract void method2757(class116 arg0) throws IOException;
}
