package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ea")
public abstract class class117 implements Runnable {

    @ObfuscatedName("ea.aq")
    public final Thread field1474 = new Thread(this);

    @ObfuscatedName("ea.ad")
    public volatile boolean field1470;

    @ObfuscatedName("ea.ag")
    public Queue field1471 = new LinkedList();

    @ObfuscatedName("ea.ak")
    public int field1472;

    public class117(int arg0) {
        this.field1474.setPriority(1);
        this.field1474.start();
        this.field1472 = arg0;
    }

    public void run() {
        while (!this.field1470) {
            try {
                class119 var2;
                synchronized (this) {
                    var2 = (class119) this.field1471.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2793(var2);
            } catch (Exception var8) {
                class572.method7807((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ea.ad(Ljava/net/URLConnection;B)I")
    public int method2799(URLConnection arg0) {
        int var2 = class119.field1486;
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

    @ObfuscatedName("ea.ag(Ljava/net/URLConnection;B)V")
    public void method2792(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1472);
    }

    @ObfuscatedName("ea.ak(Ljava/net/URLConnection;Lez;B)V")
    public void method2794(URLConnection arg0, class119 arg1) {
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
                byte[] var6 = class450.method4665(5000, false);
                byte[] var7 = var6;
                for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
                    byte[] var9 = new byte[var5.length + var8];
                    System.arraycopy(var5, 0, var9, 0, var5.length);
                    System.arraycopy(var7, 0, var9, var5.length, var8);
                    var5 = var9;
                }
                class450.method2333(var7);
            }
            arg1.field1479 = var5;
        } catch (IOException var17) {
            arg1.field1479 = null;
        } finally {
            arg1.field1483 = this.method2799(arg0);
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var16) {
            }
        }
    }

    @ObfuscatedName("ea.ap(Ljava/net/URL;I)Lez;")
    public class119 method2797(URL arg0) {
        class119 var2 = new class119(arg0);
        synchronized (this) {
            this.field1471.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ea.an(I)V")
    public void method2800() {
        this.field1470 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1474.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ea.aq(Lez;I)V")
    public abstract void method2793(class119 arg0) throws IOException;
}
