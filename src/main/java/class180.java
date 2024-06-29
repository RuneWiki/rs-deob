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

@OriginalClass("client!ki")
public class class180 implements Runnable {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lia;")
    public class14 field2704 = null;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lsf;")
    private class197 field2711 = null;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lia;")
    public class14 field2712 = null;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lsf;")
    private class197 field2715 = null;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lia;")
    public class14 field2714 = null;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Z")
    private boolean field2713 = false;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field2721 = null;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2720;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field2708;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2718 = 3;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "J")
    public static volatile long field2724;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ldh;")
    private class138 field2707;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ljava/lang/String;")
    private static String field2703;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2705;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2706;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2709;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2710;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2717;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2719;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2722;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2723;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[Lia;")
    public class14[] field2716;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)Lsf;", line = 4)
    public final class197 method1275(int arg0, String arg1) {
        if (arg0 != 5600) {
            this.method1291(-15, -48, (Runnable) null);
        }
        return this.method1276(12, 0, 109, 0, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIILjava/lang/Object;)Lsf;", line = 28)
    private final class197 method1276(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class197 var6 = new class197();
        var6.field2960 = arg3;
        var6.field2958 = arg0;
        var6.field2955 = arg4;
        synchronized (this) {
            if (this.field2711 == null) {
                this.field2711 = this.field2715 = var6;
            } else {
                this.field2711.field2957 = var6;
                this.field2711 = var6;
            }
            if (arg2 <= 67) {
                return (class197) null;
            } else {
                this.notify();
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Class;Z)Lsf;", line = 55)
    public final class197 method1277(Class arg0, boolean arg1) {
        if (!arg1) {
            this.method1284(-78, (Component) null, (Point) null, false, (int[]) null, -67);
        }
        return this.method1276(10, 0, 91, 0, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 465)
    public class180(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2721 = arg0;
        field2705 = "1.1";
        field2706 = "Unknown";
        try {
            field2706 = System.getProperty("java.vendor");
            field2705 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2717 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2717 = "Unknown";
        }
        field2719 = field2717.toLowerCase();
        try {
            field2710 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2710 = "";
        }
        try {
            field2709 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2709 = "";
        }
        try {
            field2703 = System.getProperty("user.home");
            if (field2703 != null) {
                field2703 = field2703 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2703 == null) {
            field2703 = "~/";
        }
        try {
            this.field2720 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2723 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2723 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2722 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2722 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2713 = false;
        this.field2708 = new Thread(this);
        this.field2708.setPriority(10);
        this.field2708.setDaemon(true);
        this.field2708.start();
    }

    @OriginalMember(owner = "client!ki", name = "run", descriptor = "()V", line = 75)
    public final void run() {
        while (true) {
            class197 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2713) {
                        return;
                    }
                    if (this.field2715 != null) {
                        var2 = this.field2715;
                        this.field2715 = this.field2715.field2957;
                        if (this.field2715 == null) {
                            this.field2711 = null;
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
                int var5 = var2.field2958;
                if (var5 == 1) {
                    if (field2724 > class102.method743((byte) 103)) {
                        throw new IOException();
                    }
                    var2.field2959 = new Socket(InetAddress.getByName((String) var2.field2955), var2.field2960);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2955);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2960);
                    var2.field2959 = var8;
                } else if (var5 == 4) {
                    if (class102.method743((byte) 111) < field2724) {
                        throw new IOException();
                    }
                    var2.field2959 = new DataInputStream(((URL) var2.field2955).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2955);
                    var2.field2959 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2955);
                    var2.field2959 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2956 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2956 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIBI)Lsf;", line = 171)
    public final class197 method1278(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -41) {
            this.method1286(-14, (String) null, -34);
        }
        return this.method1276(6, (arg2 << 16) + arg0, 97, (arg1 << 16) + arg4, (Object) null);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Lsf;", line = 181)
    public final class197 method1279(Class arg0, String arg1, byte arg2, Class[] arg3) {
        if (arg2 >= -101) {
            field2710 = (String) null;
        }
        return this.method1276(8, 0, 91, 0, new Object[] { arg0, arg1, arg3 });
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lsf;", line = 191)
    public final class197 method1280(Component arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.method1285(-40);
        }
        return this.method1276(15, 0, 117, arg2 ? 1 : 0, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 206)
    public final void method1281(boolean arg0) {
        if (!arg0) {
            field2724 = class102.method743((byte) 95) + 5000L;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;I)Lsf;", line = 218)
    public final class197 method1282(String arg0, int arg1) {
        int var3 = 17 % ((arg1 - 67) / 36);
        return this.method1276(16, 0, 95, 0, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/awt/Component;BI)Lsf;", line = 228)
    public final class197 method1283(int arg0, Component arg1, byte arg2, int arg3) {
        if (arg2 != -30) {
            field2722 = (Method) null;
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1276(14, var5.y + arg0, 77, var5.x + arg3, (Object) null);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;Z[II)Lsf;", line = 239)
    public final class197 method1284(int arg0, Component arg1, Point arg2, boolean arg3, int[] arg4, int arg5) {
        return arg3 ? (class197) null : this.method1276(17, arg5, 112, arg0, new Object[] { arg1, arg4, arg2 });
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 253)
    public final void method1285(int arg0) {
        synchronized (this) {
            this.field2713 = true;
            this.notifyAll();
        }
        try {
            this.field2708.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2714 != null) {
            try {
                this.field2714.method102((byte) 18);
            } catch (IOException var13) {
            }
        }
        if (this.field2712 != null) {
            try {
                this.field2712.method102((byte) 18);
            } catch (IOException var12) {
            }
        }
        if (arg0 < 10) {
            this.field2713 = true;
        }
        if (this.field2716 != null) {
            for (int var7 = 0; var7 < this.field2716.length; var7++) {
                if (this.field2716[var7] != null) {
                    try {
                        this.field2716[var7].method102((byte) 18);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2704 != null) {
            try {
                this.field2704.method102((byte) 18);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;I)Lsf;", line = 315)
    public final class197 method1286(int arg0, String arg1, int arg2) {
        int var4 = -115 % ((-arg2 - 50) / 54);
        return this.method1276(1, 0, 97, arg0, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)Z", line = 327)
    public final boolean method1287(int arg0) {
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)Lsf;", line = 338)
    public final class197 method1288(byte arg0, int arg1) {
        return arg0 < 116 ? (class197) null : this.method1276(3, 0, 74, arg1, (Object) null);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Ldh;", line = 352)
    public final class138 method1289(int arg0) {
        if (arg0 != 12210) {
            this.method1287(64);
        }
        return this.field2707;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Frame;I)Lsf;", line = 363)
    public final class197 method1290(Frame arg0, int arg1) {
        int var3 = -55 / ((arg1 - 24) / 52);
        return this.method1276(7, 0, 89, 0, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILjava/lang/Runnable;)Lsf;", line = 375)
    public final class197 method1291(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 24229) {
            this.method1290((Frame) null, -67);
        }
        return this.method1276(2, 0, 99, arg0, arg2);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/Class;)Lsf;", line = 391)
    public final class197 method1292(boolean arg0, Class arg1) {
        if (!arg0) {
            this.field2707 = (class138) null;
        }
        return this.method1276(11, 0, 106, 0, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lsf;", line = 401)
    public final class197 method1293(String arg0, int arg1, Class arg2) {
        if (arg1 != 0) {
            this.method1275(-55, (String) null);
        }
        return this.method1276(9, 0, arg1 ^ 0x6D, 0, new Object[] { arg2, arg0 });
    }

    static {
        new Hashtable(16);
        field2724 = 0L;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)Lsf;", line = 439)
    public final class197 method1294(int arg0) {
        if (arg0 != 15) {
            this.method1287(-26);
        }
        return this.method1276(5, 0, arg0 ^ 0x5E, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/net/URL;Z)Lsf;", line = 449)
    public final class197 method1295(URL arg0, boolean arg1) {
        if (!arg1) {
            this.field2716 = (class14[]) null;
        }
        return this.method1276(4, 0, 92, 0, arg0);
    }
}
