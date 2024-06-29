import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class32 implements Runnable {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lfd;")
    public class124 field471 = null;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lfd;")
    public class124 field478 = null;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field479 = null;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lfd;")
    public class124 field475 = null;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lgd;")
    private class76 field486 = null;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Z")
    private boolean field473 = false;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Lgd;")
    private class76 field489 = null;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field480;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field482;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field468 = 3;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "J")
    public static volatile long field488;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Leb;")
    private class247 field469;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Ljava/lang/String;")
    private static String field470;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
    public static String field472;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljava/lang/String;")
    public static String field474;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Ljava/lang/String;")
    public static String field476;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/lang/String;")
    public static String field477;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Ljava/lang/String;")
    public static String field481;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljava/lang/String;")
    public static String field484;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field485;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field487;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[Lfd;")
    public class124[] field483;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;IZ)Lgd;")
    public final class76 method246(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method257(54, (Runnable) null, (byte) -94);
        }
        return this.method254(arg1, arg0, 1, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lgd;")
    public final class76 method247(String arg0, Class arg1, int arg2) {
        if (arg2 != 0) {
            field481 = null;
        }
        return this.method254(0, new Object[] { arg1, arg0 }, 9, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Class;)Lgd;")
    public final class76 method248(Class[] arg0, String arg1, byte arg2, Class arg3) {
        return arg2 == -55 ? this.method254(0, new Object[] { arg3, arg1, arg0 }, 8, 0, -10304) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;B)Lgd;")
    public final class76 method249(URL arg0, byte arg1) {
        if (arg1 != -16) {
            this.method257(117, (Runnable) null, (byte) 99);
        }
        return this.method254(0, arg0, 4, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)Lgd;")
    public final class76 method250(int arg0, String arg1) {
        if (arg0 != 16) {
            this.method246((String) null, -72, false);
        }
        return this.method254(0, arg1, 16, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;[III)Lgd;")
    public final class76 method251(int arg0, Component arg1, Point arg2, int[] arg3, int arg4, int arg5) {
        if (arg0 != 6263) {
            field472 = null;
        }
        return this.method254(arg5, new Object[] { arg1, arg3, arg2 }, 17, arg4, -10304);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method252(int arg0) {
        synchronized (this) {
            this.field473 = true;
            this.notifyAll();
        }
        try {
            this.field482.join();
        } catch (InterruptedException var8) {
        }
        if (this.field478 != null) {
            try {
                this.field478.method863((byte) 118);
            } catch (IOException var7) {
            }
        }
        if (this.field475 != null) {
            try {
                this.field475.method863((byte) 120);
            } catch (IOException var6) {
            }
        }
        if (this.field483 != null) {
            for (int var3 = 0; var3 < this.field483.length; var3++) {
                if (this.field483[var3] != null) {
                    try {
                        this.field483[var3].method863((byte) 69);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field471 != null) {
            try {
                this.field471.method863((byte) 96);
            } catch (IOException var4) {
            }
        }
        if (arg0 != -12529) {
            this.method248((Class[]) null, (String) null, (byte) -115, (Class) null);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Leb;")
    public final class247 method253(byte arg0) {
        int var2 = 8 % ((-arg0 - 59) / 62);
        return this.field469;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Object;III)Lgd;")
    private final class76 method254(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class76 var6 = new class76();
        var6.field1254 = arg2;
        if (arg4 != -10304) {
            return null;
        }
        var6.field1253 = arg0;
        var6.field1257 = arg1;
        synchronized (this) {
            if (this.field489 == null) {
                this.field489 = this.field486 = var6;
            } else {
                this.field489.field1256 = var6;
                this.field489 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Lgd;")
    public final class76 method255(int arg0, boolean arg1) {
        if (!arg1) {
            field485 = null;
        }
        return this.method254(arg0, (Object) null, 3, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(ILjava/lang/String;)Lgd;")
    public final class76 method256(int arg0, String arg1) {
        return arg0 == 12 ? this.method254(0, arg1, 12, 0, -10304) : null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lgd;")
    public final class76 method257(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != -13) {
            this.method251(66, (Component) null, (Point) null, (int[]) null, -56, 105);
        }
        return this.method254(arg0, arg1, 2, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class76 var2;
            synchronized (this) {
                while (true) {
                    if (this.field473) {
                        return;
                    }
                    if (this.field486 != null) {
                        var2 = this.field486;
                        this.field486 = this.field486.field1256;
                        if (this.field486 == null) {
                            this.field489 = null;
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
                int var3 = var2.field1254;
                if (var3 == 1) {
                    if (field488 > class134.method924(false)) {
                        throw new IOException();
                    }
                    var2.field1258 = new Socket(InetAddress.getByName((String) var2.field1257), var2.field1253);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1257);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1253);
                    var2.field1258 = var6;
                } else if (var3 == 4) {
                    if (field488 > class134.method924(false)) {
                        throw new IOException();
                    }
                    var2.field1258 = new DataInputStream(((URL) var2.field1257).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1257;
                    var2.field1258 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1257;
                    var2.field1258 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1255 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1255 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBILjava/awt/Component;)Lgd;")
    public final class76 method258(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 != -46) {
            this.field469 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method254(var5.x + arg0, (Object) null, 14, var5.y + arg2, -10304);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public final void method259(byte arg0) {
        int var2 = 42 / ((48 - arg0) / 37);
        field488 = class134.method924(false) + 5000L;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lgd;")
    public final class76 method260(Component arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.method260((Component) null, true, true);
        }
        return this.method254(arg2 ? 1 : 0, arg0, 15, 0, -10304);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class32(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field476 = "1.1";
        this.field479 = arg0;
        field484 = "Unknown";
        try {
            field484 = System.getProperty("java.vendor");
            field476 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field474 = System.getProperty("os.name");
        } catch (Exception var11) {
            field474 = "Unknown";
        }
        field477 = field474.toLowerCase();
        try {
            field481 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field481 = "";
        }
        try {
            field472 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field472 = "";
        }
        try {
            field470 = System.getProperty("user.home");
            if (field470 != null) {
                field470 = field470 + "/";
            }
        } catch (Exception var8) {
        }
        if (field470 == null) {
            field470 = "~/";
        }
        try {
            this.field480 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field487 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field487 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field485 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field485 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field473 = false;
        this.field482 = new Thread(this);
        this.field482.setPriority(10);
        this.field482.setDaemon(true);
        this.field482.start();
    }

    static {
        new Hashtable(16);
        field488 = 0L;
    }
}
