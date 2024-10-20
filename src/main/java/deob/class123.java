package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dd")
public class class123 implements Runnable {

    @ObfuscatedName("dd.v")
    public class47 field1963;

    @ObfuscatedName("dd.o")
    public class133 field1960 = null;

    @ObfuscatedName("dd.k")
    public class133 field1961 = null;

    @ObfuscatedName("dd.m")
    public Thread field1962;

    @ObfuscatedName("dd.i")
    public boolean field1972 = false;

    @ObfuscatedName("dd.t")
    public EventQueue field1964;

    public class123() {
        Statics.field1970 = "Unknown";
        Statics.field1958 = "1.1";
        try {
            Statics.field1970 = System.getProperty("java.vendor");
            Statics.field1958 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1964 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1972 = false;
        this.field1962 = new Thread(this);
        this.field1962.setPriority(10);
        this.field1962.setDaemon(true);
        this.field1962.start();
    }

    @ObfuscatedName("dd.v(I)V")
    public final void method2413() {
        synchronized (this) {
            this.field1972 = true;
            this.notifyAll();
        }
        try {
            this.field1962.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1972) {
                        return;
                    }
                    if (this.field1960 != null) {
                        var2 = this.field1960;
                        this.field1960 = this.field1960.field2085;
                        if (this.field1960 == null) {
                            this.field1961 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2081;
                if (var5 == 1) {
                    var2.field2086 = new Socket(InetAddress.getByName((String) var2.field2088), var2.field2087);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2088);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2087);
                    var2.field2086 = var6;
                } else if (var5 == 4) {
                    var2.field2086 = new DataInputStream(((URL) var2.field2088).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2087 >> 24 & 0xFF) + "." + (var2.field2087 >> 16 & 0xFF) + "." + (var2.field2087 >> 8 & 0xFF) + "." + (var2.field2087 & 0xFF);
                    var2.field2086 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2089 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2089 = 2;
            }
        }
    }

    @ObfuscatedName("dd.o(IIILjava/lang/Object;B)Leg;")
    public final class133 method2436(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2081 = arg0;
        var5.field2087 = arg1;
        var5.field2088 = arg3;
        synchronized (this) {
            if (this.field1961 == null) {
                this.field1961 = this.field1960 = var5;
            } else {
                this.field1961.field2085 = var5;
                this.field1961 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dd.k(Ljava/lang/String;II)Leg;")
    public final class133 method2414(String arg0, int arg1) {
        return this.method2436(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dd.m(Ljava/lang/Runnable;II)Leg;")
    public final class133 method2418(Runnable arg0, int arg1) {
        return this.method2436(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dd.i(IB)Leg;")
    public final class133 method2415(int arg0) {
        return this.method2436(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dd.t(Ljava/net/URL;B)Leg;")
    public final class133 method2416(URL arg0) {
        return this.method2436(4, 0, 0, arg0);
    }

    @ObfuscatedName("dd.l(I)Laa;")
    public final class47 method2417() {
        return this.field1963;
    }
}
