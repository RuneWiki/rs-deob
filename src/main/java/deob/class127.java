package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("df")
public class class127 implements Runnable {

    @ObfuscatedName("df.d")
    public class48 field1955;

    @ObfuscatedName("df.c")
    public class137 field1953 = null;

    @ObfuscatedName("df.r")
    public class137 field1951 = null;

    @ObfuscatedName("df.f")
    public Thread field1952;

    @ObfuscatedName("df.z")
    public boolean field1949 = false;

    @ObfuscatedName("df.o")
    public EventQueue field1950;

    public class127() {
        Statics.field1756 = "Unknown";
        Statics.field3045 = "1.1";
        try {
            Statics.field1756 = System.getProperty("java.vendor");
            Statics.field3045 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1950 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1949 = false;
        this.field1952 = new Thread(this);
        this.field1952.setPriority(10);
        this.field1952.setDaemon(true);
        this.field1952.start();
    }

    @ObfuscatedName("df.r(I)V")
    public final void method2484() {
        synchronized (this) {
            this.field1949 = true;
            this.notifyAll();
        }
        try {
            this.field1952.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class137 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1949) {
                        return;
                    }
                    if (this.field1953 != null) {
                        var2 = this.field1953;
                        this.field1953 = this.field1953.field2071;
                        if (this.field1953 == null) {
                            this.field1951 = null;
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
                int var5 = var2.field2075;
                if (var5 == 1) {
                    var2.field2078 = new Socket(InetAddress.getByName((String) var2.field2077), var2.field2076);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2077);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2076);
                    var2.field2078 = var6;
                } else if (var5 == 4) {
                    var2.field2078 = new DataInputStream(((URL) var2.field2077).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2076 >> 24 & 0xFF) + "." + (var2.field2076 >> 16 & 0xFF) + "." + (var2.field2076 >> 8 & 0xFF) + "." + (var2.field2076 & 0xFF);
                    var2.field2078 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2074 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2074 = 2;
            }
        }
    }

    @ObfuscatedName("df.f(IIILjava/lang/Object;B)Leb;")
    public final class137 method2486(int arg0, int arg1, int arg2, Object arg3) {
        class137 var5 = new class137();
        var5.field2075 = arg0;
        var5.field2076 = arg1;
        var5.field2077 = arg3;
        synchronized (this) {
            if (this.field1951 == null) {
                this.field1951 = this.field1953 = var5;
            } else {
                this.field1951.field2071 = var5;
                this.field1951 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("df.z(Ljava/lang/String;II)Leb;")
    public final class137 method2483(String arg0, int arg1) {
        return this.method2486(1, arg1, 0, arg0);
    }

    @ObfuscatedName("df.o(Ljava/lang/Runnable;II)Leb;")
    public final class137 method2500(Runnable arg0, int arg1) {
        return this.method2486(2, arg1, 0, arg0);
    }

    @ObfuscatedName("df.k(II)Leb;")
    public final class137 method2487(int arg0) {
        return this.method2486(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("df.s(Ljava/net/URL;I)Leb;")
    public final class137 method2488(URL arg0) {
        return this.method2486(4, 0, 0, arg0);
    }

    @ObfuscatedName("df.h(I)Lay;")
    public final class48 method2489() {
        return this.field1955;
    }
}
