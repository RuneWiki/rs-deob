package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("eq")
public class class131 implements Runnable {

    @ObfuscatedName("eq.z")
    public class52 field1987;

    @ObfuscatedName("eq.l")
    public class141 field1983 = null;

    @ObfuscatedName("eq.w")
    public class141 field1982 = null;

    @ObfuscatedName("eq.d")
    public Thread field1985;

    @ObfuscatedName("eq.f")
    public boolean field1986 = false;

    @ObfuscatedName("eq.i")
    public EventQueue field1984;

    public class131() {
        Statics.field2829 = "Unknown";
        Statics.field1988 = "1.1";
        try {
            Statics.field2829 = System.getProperty("java.vendor");
            Statics.field1988 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1984 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1986 = false;
        this.field1985 = new Thread(this);
        this.field1985.setPriority(10);
        this.field1985.setDaemon(true);
        this.field1985.start();
    }

    @ObfuscatedName("eq.y(I)V")
    public final void method2708() {
        synchronized (this) {
            this.field1986 = true;
            this.notifyAll();
        }
        try {
            this.field1985.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class141 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1986) {
                        return;
                    }
                    if (this.field1983 != null) {
                        var2 = this.field1983;
                        this.field1983 = this.field1983.field2119;
                        if (this.field1983 == null) {
                            this.field1982 = null;
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
                int var5 = var2.field2123;
                if (var5 == 1) {
                    var2.field2118 = new Socket(InetAddress.getByName((String) var2.field2125), var2.field2122);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2125);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2122);
                    var2.field2118 = var6;
                } else if (var5 == 4) {
                    var2.field2118 = new DataInputStream(((URL) var2.field2125).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2122 >> 24 & 0xFF) + "." + (var2.field2122 >> 16 & 0xFF) + "." + (var2.field2122 >> 8 & 0xFF) + "." + (var2.field2122 & 0xFF);
                    var2.field2118 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2124 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2124 = 2;
            }
        }
    }

    @ObfuscatedName("eq.z(IIILjava/lang/Object;I)Lem;")
    public final class141 method2690(int arg0, int arg1, int arg2, Object arg3) {
        class141 var5 = new class141();
        var5.field2123 = arg0;
        var5.field2122 = arg1;
        var5.field2125 = arg3;
        synchronized (this) {
            if (this.field1982 == null) {
                this.field1982 = this.field1983 = var5;
            } else {
                this.field1982.field2119 = var5;
                this.field1982 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("eq.l(Ljava/lang/String;IB)Lem;")
    public final class141 method2691(String arg0, int arg1) {
        return this.method2690(1, arg1, 0, arg0);
    }

    @ObfuscatedName("eq.w(Ljava/lang/Runnable;II)Lem;")
    public final class141 method2697(Runnable arg0, int arg1) {
        return this.method2690(2, arg1, 0, arg0);
    }

    @ObfuscatedName("eq.d(II)Lem;")
    public final class141 method2693(int arg0) {
        return this.method2690(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("eq.f(Ljava/net/URL;I)Lem;")
    public final class141 method2703(URL arg0) {
        return this.method2690(4, 0, 0, arg0);
    }

    @ObfuscatedName("eq.i(I)Lah;")
    public final class52 method2689() {
        return this.field1987;
    }
}
