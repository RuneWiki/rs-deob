package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("el")
public abstract class class113 implements Runnable {

    @ObfuscatedName("el.at")
    public final Thread field1419 = new Thread(this);

    @ObfuscatedName("el.ah")
    public volatile boolean field1422;

    @ObfuscatedName("el.ar")
    public Queue field1421 = new LinkedList();

    @ObfuscatedName("el.ao")
    public int field1420;

    public class113(int arg0) {
        this.field1419.setPriority(1);
        this.field1419.start();
        this.field1420 = arg0;
    }

    public void run() {
        while (!this.field1422) {
            try {
                class115 var2;
                synchronized (this) {
                    var2 = (class115) this.field1421.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2751(var2);
            } catch (Exception var8) {
                class553.method6436((String) null, var8);
            }
        }
    }

    @ObfuscatedName("el.ah(Ljava/net/URLConnection;B)I")
    public int method2740(URLConnection arg0) {
        int var2 = class115.field1433;
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

    @ObfuscatedName("el.ar(Ljava/net/URLConnection;I)V")
    public void method2757(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1420);
    }

    @ObfuscatedName("el.ao(Ljava/net/URLConnection;Lea;I)V")
    public void method2742(URLConnection arg0, class115 arg1) {
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
                byte[] var6 = class424.method6208(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                Statics.method7121(var6);
            }
            arg1.field1432 = var5;
        } catch (IOException var16) {
            arg1.field1432 = null;
        } finally {
            arg1.field1428 = this.method2740(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("el.ab(Ljava/net/URL;I)Lea;")
    public class115 method2741(URL arg0) {
        class115 var2 = new class115(arg0);
        synchronized (this) {
            this.field1421.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("el.au(I)V")
    public void method2761() {
        this.field1422 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1419.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("el.at(Lea;I)V")
    public abstract void method2751(class115 arg0) throws IOException;
}
