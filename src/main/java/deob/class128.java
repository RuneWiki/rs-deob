package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dy")
public class class128 implements Runnable {

    @ObfuscatedName("dy.g")
    public class49 field1977;

    @ObfuscatedName("dy.u")
    public class138 field1978 = null;

    @ObfuscatedName("dy.q")
    public class138 field1975 = null;

    @ObfuscatedName("dy.r")
    public Thread field1980;

    @ObfuscatedName("dy.v")
    public boolean field1981 = false;

    @ObfuscatedName("dy.y")
    public EventQueue field1982;

    public class128() {
        Statics.field1984 = "Unknown";
        Statics.field1976 = "1.1";
        try {
            Statics.field1984 = System.getProperty("java.vendor");
            Statics.field1976 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1982 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1981 = false;
        this.field1980 = new Thread(this);
        this.field1980.setPriority(10);
        this.field1980.setDaemon(true);
        this.field1980.start();
    }

    @ObfuscatedName("dy.g(I)V")
    public final void method2624() {
        synchronized (this) {
            this.field1981 = true;
            this.notifyAll();
        }
        try {
            this.field1980.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1981) {
                        return;
                    }
                    if (this.field1978 != null) {
                        var2 = this.field1978;
                        this.field1978 = this.field1978.field2103;
                        if (this.field1978 == null) {
                            this.field1975 = null;
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
                int var5 = var2.field2102;
                if (var5 == 1) {
                    var2.field2101 = new Socket(InetAddress.getByName((String) var2.field2108), var2.field2107);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2108);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2107);
                    var2.field2101 = var6;
                } else if (var5 == 4) {
                    var2.field2101 = new DataInputStream(((URL) var2.field2108).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2107 >> 24 & 0xFF) + "." + (var2.field2107 >> 16 & 0xFF) + "." + (var2.field2107 >> 8 & 0xFF) + "." + (var2.field2107 & 0xFF);
                    var2.field2101 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2105 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2105 = 2;
            }
        }
    }

    @ObfuscatedName("dy.u(IIILjava/lang/Object;B)Leq;")
    public final class138 method2609(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2102 = arg0;
        var5.field2107 = arg1;
        var5.field2108 = arg3;
        synchronized (this) {
            if (this.field1975 == null) {
                this.field1975 = this.field1978 = var5;
            } else {
                this.field1975.field2103 = var5;
                this.field1975 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dy.q(Ljava/lang/String;II)Leq;")
    public final class138 method2606(String arg0, int arg1) {
        return this.method2609(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.r(Ljava/lang/Runnable;II)Leq;")
    public final class138 method2607(Runnable arg0, int arg1) {
        return this.method2609(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dy.v(IB)Leq;")
    public final class138 method2608(int arg0) {
        return this.method2609(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dy.y(Ljava/net/URL;I)Leq;")
    public final class138 method2617(URL arg0) {
        return this.method2609(4, 0, 0, arg0);
    }

    @ObfuscatedName("dy.k(I)Lau;")
    public final class49 method2610() {
        return this.field1977;
    }
}
