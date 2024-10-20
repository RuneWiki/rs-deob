package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dp")
public class class127 implements Runnable {

    @ObfuscatedName("dp.i")
    public class48 field1966;

    @ObfuscatedName("dp.k")
    public class137 field1965 = null;

    @ObfuscatedName("dp.h")
    public class137 field1976 = null;

    @ObfuscatedName("dp.p")
    public Thread field1969;

    @ObfuscatedName("dp.n")
    public boolean field1970 = false;

    @ObfuscatedName("dp.o")
    public EventQueue field1971;

    public class127() {
        Statics.field1968 = "Unknown";
        Statics.field1964 = "1.1";
        try {
            Statics.field1968 = System.getProperty("java.vendor");
            Statics.field1964 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1971 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1970 = false;
        this.field1969 = new Thread(this);
        this.field1969.setPriority(10);
        this.field1969.setDaemon(true);
        this.field1969.start();
    }

    @ObfuscatedName("dp.e(B)V")
    public final void method2493() {
        synchronized (this) {
            this.field1970 = true;
            this.notifyAll();
        }
        try {
            this.field1969.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class137 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1970) {
                        return;
                    }
                    if (this.field1965 != null) {
                        var2 = this.field1965;
                        this.field1965 = this.field1965.field2083;
                        if (this.field1965 == null) {
                            this.field1976 = null;
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
                int var5 = var2.field2086;
                if (var5 == 1) {
                    var2.field2089 = new Socket(InetAddress.getByName((String) var2.field2081), var2.field2087);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2081);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2087);
                    var2.field2089 = var6;
                } else if (var5 == 4) {
                    var2.field2089 = new DataInputStream(((URL) var2.field2081).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2087 >> 24 & 0xFF) + "." + (var2.field2087 >> 16 & 0xFF) + "." + (var2.field2087 >> 8 & 0xFF) + "." + (var2.field2087 & 0xFF);
                    var2.field2089 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2088 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2088 = 2;
            }
        }
    }

    @ObfuscatedName("dp.i(IIILjava/lang/Object;I)Lek;")
    public final class137 method2500(int arg0, int arg1, int arg2, Object arg3) {
        class137 var5 = new class137();
        var5.field2086 = arg0;
        var5.field2087 = arg1;
        var5.field2081 = arg3;
        synchronized (this) {
            if (this.field1976 == null) {
                this.field1976 = this.field1965 = var5;
            } else {
                this.field1976.field2083 = var5;
                this.field1976 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dp.k(Ljava/lang/String;II)Lek;")
    public final class137 method2506(String arg0, int arg1) {
        return this.method2500(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dp.h(Ljava/lang/Runnable;IB)Lek;")
    public final class137 method2496(Runnable arg0, int arg1) {
        return this.method2500(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dp.p(II)Lek;")
    public final class137 method2508(int arg0) {
        return this.method2500(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dp.n(Ljava/net/URL;I)Lek;")
    public final class137 method2498(URL arg0) {
        return this.method2500(4, 0, 0, arg0);
    }

    @ObfuscatedName("dp.o(I)Laz;")
    public final class48 method2499() {
        return this.field1966;
    }
}
