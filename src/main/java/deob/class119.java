package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ex")
public abstract class class119 implements Runnable {

    @ObfuscatedName("ex.ap")
    public final Thread field1486 = new Thread(this);

    @ObfuscatedName("ex.aw")
    public volatile boolean field1487;

    @ObfuscatedName("ex.ak")
    public Queue field1488 = new LinkedList();

    @ObfuscatedName("ex.aj")
    public int field1491;

    public class119(int arg0) {
        this.field1486.setPriority(1);
        this.field1486.start();
        this.field1491 = arg0;
    }

    public void run() {
        while (!this.field1487) {
            try {
                class121 var2;
                synchronized (this) {
                    var2 = (class121) this.field1488.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method3075(var2);
            } catch (Exception var8) {
                class584.method8201((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ex.aw(Ljava/net/URLConnection;I)I")
    public int method3092(URLConnection arg0) {
        int var2 = class121.field1498;
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

    @ObfuscatedName("ex.ak(Ljava/net/URLConnection;B)V")
    public void method3076(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1491);
    }

    @ObfuscatedName("ex.aj(Ljava/net/URLConnection;Lei;B)V")
    public void method3077(URLConnection arg0, class121 arg1) {
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
                byte[] var6 = class454.method8061(5000, false);
                byte[] var7 = var6;
                for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                    byte[] var9 = new byte[var5.length + var8];
                    System.arraycopy(var5, 0, var9, 0, var5.length);
                    System.arraycopy(var7, 0, var9, var5.length, var8);
                    var5 = var9;
                }
                class454.method6932(var7);
            }
            arg1.field1500 = var5;
        } catch (IOException var17) {
            arg1.field1500 = null;
        } finally {
            arg1.field1497 = this.method3092(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var16) {
            }
        }
    }

    @ObfuscatedName("ex.ai(Ljava/net/URL;S)Lei;")
    public class121 method3078(URL arg0) {
        class121 var2 = new class121(arg0);
        synchronized (this) {
            this.field1488.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ex.ay(B)V")
    public void method3079() {
        this.field1487 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1486.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ex.ap(Lei;I)V")
    public abstract void method3075(class121 arg0) throws IOException;
}
