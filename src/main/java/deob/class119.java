package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("en")
public abstract class class119 implements Runnable {

    @ObfuscatedName("en.ac")
    public final Thread field1496 = new Thread(this);

    @ObfuscatedName("en.ae")
    public volatile boolean field1497;

    @ObfuscatedName("en.ag")
    public Queue field1495 = new LinkedList();

    @ObfuscatedName("en.am")
    public int field1498;

    public class119(int arg0) {
        this.field1496.setPriority(1);
        this.field1496.start();
        this.field1498 = arg0;
    }

    public void run() {
        while (!this.field1497) {
            try {
                class121 var2;
                synchronized (this) {
                    var2 = (class121) this.field1495.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2983(var2);
            } catch (Exception var8) {
                class577.method3409((String) null, var8);
            }
        }
    }

    @ObfuscatedName("en.ae(Ljava/net/URLConnection;I)I")
    public int method2968(URLConnection arg0) {
        int var2 = class121.field1504;
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

    @ObfuscatedName("en.ag(Ljava/net/URLConnection;I)V")
    public void method2969(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1498);
    }

    @ObfuscatedName("en.am(Ljava/net/URLConnection;Lek;I)V")
    public void method2970(URLConnection arg0, class121 arg1) {
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
                byte[] var6 = class453.method6934(5000);
                for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class453.method2426(var6);
            }
            arg1.field1510 = var5;
        } catch (IOException var16) {
            arg1.field1510 = null;
        } finally {
            arg1.field1505 = this.method2968(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var15) {
            }
        }
    }

    @ObfuscatedName("en.ax(Ljava/net/URL;I)Lek;")
    public class121 method2971(URL arg0) {
        class121 var2 = new class121(arg0);
        synchronized (this) {
            this.field1495.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("en.aq(B)V")
    public void method2973() {
        this.field1497 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1496.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("en.ac(Lek;I)V")
    public abstract void method2983(class121 arg0) throws IOException;
}
