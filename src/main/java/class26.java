import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
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
public class class26 implements Runnable {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "La;")
    public class275 field283 = null;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field285 = null;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lqm;")
    private class233 field291 = null;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "La;")
    public class275 field281 = null;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "La;")
    public class275 field288 = null;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lqm;")
    private class233 field296 = null;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field287;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field293;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field298 = 3;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "J")
    public static volatile long field301;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lfj;")
    private class240 field292;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Ljava/lang/String;")
    public static String field284;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Ljava/lang/String;")
    private static String field286;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/lang/String;")
    public static String field290;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Ljava/lang/String;")
    public static String field294;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Ljava/lang/String;")
    public static String field295;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljava/lang/String;")
    public static String field297;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Ljava/lang/String;")
    public static String field299;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field300;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field302;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[La;")
    public class275[] field289;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILjava/awt/Component;)Lqm;", line = 5)
    public final class233 method158(boolean arg0, int arg1, Component arg2) {
        if (arg1 != 0) {
            this.field289 = (class275[]) null;
        }
        return this.method168(arg2, 0, 49, arg0 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)Lqm;", line = 15)
    public final class233 method159(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method169((byte) 103);
        }
        return this.method168(arg1, 0, 79, 0, 16);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 27)
    public final void method160(int arg0) {
        synchronized (this) {
            this.field282 = true;
            this.notifyAll();
        }
        try {
            this.field293.join();
            if (arg0 != 0) {
                field295 = (String) null;
            }
        } catch (InterruptedException var14) {
        }
        if (this.field283 != null) {
            try {
                this.field283.method1921(arg0 ^ 0x0);
            } catch (IOException var13) {
            }
        }
        if (this.field281 != null) {
            try {
                this.field281.method1921(arg0);
            } catch (IOException var12) {
            }
        }
        if (this.field289 != null) {
            for (int var7 = 0; var7 < this.field289.length; var7++) {
                if (this.field289[var7] != null) {
                    try {
                        this.field289[var7].method1921(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field288 != null) {
            try {
                this.field288.method1921(arg0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lqm;", line = 85)
    public final class233 method161(Class arg0, String arg1, byte arg2) {
        if (arg2 != -13) {
            this.field289 = (class275[]) null;
        }
        return this.method168(new Object[] { arg0, arg1 }, 0, arg2 ^ 0xFFFFFFF9, 0, 9);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLjava/lang/String;)Lqm;", line = 95)
    public final class233 method162(int arg0, byte arg1, String arg2) {
        if (arg1 >= -48) {
            this.method165(-28);
        }
        return this.method168(arg2, 0, 34, arg0, 1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLjava/lang/Runnable;)Lqm;", line = 106)
    public final class233 method163(int arg0, byte arg1, Runnable arg2) {
        if (arg1 >= -17) {
            this.method177(94, (Component) null, (Point) null, -99, (int[]) null, true);
        }
        return this.method168(arg2, 0, -124, arg0, 2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lqm;", line = 118)
    public final class233 method164(int arg0, int arg1) {
        return arg1 > -45 ? (class233) null : this.method168((Object) null, 0, -117, arg0, 3);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lqm;", line = 129)
    public final class233 method165(int arg0) {
        if (arg0 != 14) {
            field284 = (String) null;
        }
        return this.method168((Object) null, 0, -120, 0, 5);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 455)
    public class26(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field297 = "Unknown";
        field290 = "1.1";
        this.field285 = arg0;
        try {
            field297 = System.getProperty("java.vendor");
            field290 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field295 = System.getProperty("os.name");
        } catch (Exception var19) {
            field295 = "Unknown";
        }
        field294 = field295.toLowerCase();
        try {
            field284 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field284 = "";
        }
        try {
            field299 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field299 = "";
        }
        try {
            field286 = System.getProperty("user.home");
            if (field286 != null) {
                field286 = field286 + "/";
            }
        } catch (Exception var16) {
        }
        if (field286 == null) {
            field286 = "~/";
        }
        try {
            this.field287 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field300 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field300 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field302 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field302 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field282 = false;
        this.field293 = new Thread(this);
        this.field293.setPriority(10);
        this.field293.setDaemon(true);
        this.field293.start();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Frame;I)Lqm;", line = 147)
    public final class233 method166(Frame arg0, int arg1) {
        if (arg1 != 7) {
            this.method160(94);
        }
        return this.method168(arg0, 0, 106, 0, 7);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;I)Lqm;", line = 157)
    public final class233 method167(Class arg0, int arg1) {
        if (arg1 != 4567) {
            field299 = (String) null;
        }
        return this.method168(arg0, 0, -114, 0, 10);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lqm;", line = 186)
    private final class233 method168(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class233 var6 = new class233();
        var6.field3588 = arg3;
        var6.field3587 = arg4;
        var6.field3586 = arg0;
        int var7 = 102 / ((arg2 + 52) / 50);
        synchronized (this) {
            if (this.field296 == null) {
                this.field296 = this.field291 = var6;
            } else {
                this.field296.field3589 = var6;
                this.field296 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Lfj;", line = 214)
    public final class240 method169(byte arg0) {
        if (arg0 <= 76) {
            this.method177(98, (Component) null, (Point) null, -19, (int[]) null, false);
        }
        return this.field292;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILjava/awt/Component;)Lqm;", line = 227)
    public final class233 method170(int arg0, int arg1, int arg2, Component arg3) {
        int var5 = -48 / ((1 - arg1) / 46);
        Point var6 = arg3.getLocationOnScreen();
        return this.method168((Object) null, arg2 + var6.y, -120, var6.x + arg0, 14);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 238)
    public final void method171(boolean arg0) {
        if (arg0) {
            this.field283 = (class275) null;
        }
        field301 = class234.method1650((byte) 124) + 5000L;
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 258)
    public final void run() {
        while (true) {
            class233 var2;
            synchronized (this) {
                while (true) {
                    if (this.field282) {
                        return;
                    }
                    if (this.field291 != null) {
                        var2 = this.field291;
                        this.field291 = this.field291.field3589;
                        if (this.field291 == null) {
                            this.field296 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field3587;
                if (var5 == 1) {
                    if (field301 > class234.method1650((byte) -127)) {
                        throw new IOException();
                    }
                    var2.field3590 = new Socket(InetAddress.getByName((String) var2.field3586), var2.field3588);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3586);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3588);
                    var2.field3590 = var6;
                } else if (var5 == 4) {
                    if (class234.method1650((byte) 103) < field301) {
                        throw new IOException();
                    }
                    var2.field3590 = new DataInputStream(((URL) var2.field3586).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3586);
                    var2.field3590 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field3586);
                    var2.field3590 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field3585 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3585 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)Lqm;", line = 363)
    public final class233 method172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg1 <= 37 ? (class233) null : this.method168((Object) null, (arg2 << 16) + arg0, -120, (arg4 << 16) + arg3, 6);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Class;)Lqm;", line = 377)
    public final class233 method173(int arg0, Class arg1) {
        if (arg0 != 30004) {
            this.field293 = (Thread) null;
        }
        return this.method168(arg1, 0, 13, 0, 11);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;I)Lqm;", line = 387)
    public final class233 method174(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.method169((byte) -75);
        }
        return this.method168(arg0, 0, 86, 0, 4);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;B)Lqm;", line = 403)
    public final class233 method175(String arg0, byte arg1) {
        int var3 = 41 % ((arg1) / 62);
        return this.method168(arg0, 0, -128, 0, 12);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Z", line = 421)
    public final boolean method176(int arg0) {
        if (arg0 != -5) {
            this.field292 = (class240) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;I[IZ)Lqm;", line = 434)
    public final class233 method177(int arg0, Component arg1, Point arg2, int arg3, int[] arg4, boolean arg5) {
        if (!arg5) {
            field297 = (String) null;
        }
        return this.method168(new Object[] { arg1, arg4, arg2 }, arg3, -120, arg0, 17);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lqm;", line = 445)
    public final class233 method178(int arg0, Class[] arg1, Class arg2, String arg3) {
        if (arg0 != 0) {
            this.method175((String) null, (byte) 46);
        }
        return this.method168(new Object[] { arg2, arg3, arg1 }, 0, -121, 0, 8);
    }

    static {
        new Hashtable(16);
        field301 = 0L;
    }
}
