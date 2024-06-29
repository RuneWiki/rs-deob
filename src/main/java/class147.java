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

@OriginalClass("client!vh")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Ld;")
    private class60 field2710 = null;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Z")
    private boolean field2707 = false;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Le;")
    public class222 field2714 = null;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Le;")
    public class222 field2713 = null;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Le;")
    public class222 field2719 = null;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field2705 = null;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Ld;")
    private class60 field2723 = null;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2716;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field2717;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field2708 = 3;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "J")
    public static volatile long field2725;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lgl;")
    private class258 field2712;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2706;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2709;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2711;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2715;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2718;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2720;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Ljava/lang/String;")
    private static String field2722;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2724;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2726;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[Le;")
    public class222[] field2721;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Ld;", line = 9)
    public final class60 method1088(int arg0, int arg1) {
        int var3 = -126 % ((73 - arg0) / 47);
        return this.method1106((Object) null, 3, 0, arg1, (byte) -61);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Ld;", line = 17)
    public final class60 method1089(boolean arg0, String arg1, Class arg2) {
        if (!arg0) {
            this.field2710 = (class60) null;
        }
        return this.method1106(new Object[] { arg2, arg1 }, 9, 0, 0, (byte) -80);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBILjava/awt/Component;)Ld;", line = 28)
    public final class60 method1090(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 < 69) {
            return (class60) null;
        } else {
            Point var5 = arg3.getLocationOnScreen();
            return this.method1106((Object) null, 14, var5.y + arg0, var5.x + arg2, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 42)
    public final void method1091(int arg0) {
        synchronized (this) {
            this.field2707 = true;
            this.notifyAll();
        }
        try {
            this.field2717.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2719 != null) {
            try {
                this.field2719.method1525(0);
            } catch (IOException var13) {
            }
        }
        if (arg0 <= 15) {
            field2715 = (String) null;
        }
        if (this.field2714 != null) {
            try {
                this.field2714.method1525(0);
            } catch (IOException var12) {
            }
        }
        if (this.field2721 != null) {
            for (int var7 = 0; var7 < this.field2721.length; var7++) {
                if (this.field2721[var7] != null) {
                    try {
                        this.field2721[var7].method1525(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2713 != null) {
            try {
                this.field2713.method1525(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;Z)Ld;", line = 100)
    public final class60 method1092(int arg0, String arg1, boolean arg2) {
        if (!arg2) {
            this.method1090(-47, (byte) 25, 42, (Component) null);
        }
        return this.method1106(arg1, 1, 0, arg0, (byte) -55);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 111)
    public final void method1093(byte arg0) {
        if (arg0 != -26) {
            this.method1101(9, (Component) null, true);
        }
        field2725 = class261.method1765(16299) + 5000L;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z", line = 124)
    public final boolean method1094(int arg0) {
        return arg0 < 19;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/Class;)Ld;", line = 137)
    public final class60 method1095(int arg0, Class arg1) {
        int var3 = -34 % ((3 - arg0) / 56);
        return this.method1106(arg1, 11, 0, 0, (byte) -117);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/Class;Z[Ljava/lang/Class;Ljava/lang/String;)Ld;", line = 148)
    public final class60 method1096(Class arg0, boolean arg1, Class[] arg2, String arg3) {
        if (!arg1) {
            this.field2721 = (class222[]) null;
        }
        return this.method1106(new Object[] { arg0, arg3, arg2 }, 8, 0, 0, (byte) -21);
    }

    @OriginalMember(owner = "client!vh", name = "run", descriptor = "()V", line = 166)
    public final void run() {
        while (true) {
            class60 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2707) {
                        return;
                    }
                    if (this.field2710 != null) {
                        var2 = this.field2710;
                        this.field2710 = this.field2710.field966;
                        if (this.field2710 == null) {
                            this.field2723 = null;
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
                int var5 = var2.field968;
                if (var5 == 1) {
                    if (field2725 > class261.method1765(16299)) {
                        throw new IOException();
                    }
                    var2.field967 = new Socket(InetAddress.getByName((String) var2.field964), var2.field969);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field964);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field969);
                    var2.field967 = var8;
                } else if (var5 == 4) {
                    if (field2725 > class261.method1765(16299)) {
                        throw new IOException();
                    }
                    var2.field967 = new DataInputStream(((URL) var2.field964).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field964);
                    var2.field967 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field964);
                    var2.field967 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field965 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field965 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)Lgl;", line = 262)
    public final class258 method1097(int arg0) {
        return arg0 == 0 ? this.field2712 : (class258) null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Ld;", line = 277)
    public final class60 method1098(int[] arg0, int arg1, int arg2, Component arg3, byte arg4, Point arg5) {
        if (arg4 != 76) {
            this.method1099((Class) null, (byte) -10);
        }
        return this.method1106(new Object[] { arg3, arg0, arg5 }, 17, arg1, arg2, (byte) -116);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/Class;B)Ld;", line = 292)
    public final class60 method1099(Class arg0, byte arg1) {
        return arg1 >= -57 ? (class60) null : this.method1106(arg0, 10, 0, 0, (byte) -48);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)Ld;", line = 308)
    public final class60 method1100(byte arg0, String arg1) {
        return arg0 == 74 ? this.method1106(arg1, 12, 0, 0, (byte) -24) : (class60) null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/awt/Component;Z)Ld;", line = 319)
    public final class60 method1101(int arg0, Component arg1, boolean arg2) {
        if (arg0 != -2) {
            this.field2713 = (class222) null;
        }
        return this.method1106(arg1, 15, 0, arg2 ? 1 : 0, (byte) -109);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 467)
    public class147(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2706 = "Unknown";
        this.field2705 = arg0;
        field2711 = "1.1";
        try {
            field2706 = System.getProperty("java.vendor");
            field2711 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2720 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2720 = "Unknown";
        }
        field2715 = field2720.toLowerCase();
        try {
            field2709 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2709 = "";
        }
        try {
            field2718 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2718 = "";
        }
        try {
            field2722 = System.getProperty("user.home");
            if (field2722 != null) {
                field2722 = field2722 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2722 == null) {
            field2722 = "~/";
        }
        try {
            this.field2716 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2724 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2724 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2726 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2726 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2707 = false;
        this.field2717 = new Thread(this);
        this.field2717.setPriority(10);
        this.field2717.setDaemon(true);
        this.field2717.start();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Ld;", line = 332)
    public final class60 method1102(int arg0, String arg1) {
        if (arg0 != 0) {
            this.method1100((byte) -11, (String) null);
        }
        return this.method1106(arg1, 16, 0, 0, (byte) -43);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/awt/Frame;I)Ld;", line = 345)
    public final class60 method1103(Frame arg0, int arg1) {
        return arg1 == 4148 ? this.method1106(arg0, 7, 0, 0, (byte) -33) : (class60) null;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Ld;", line = 355)
    public final class60 method1104(int arg0) {
        if (arg0 != 0) {
            field2720 = (String) null;
        }
        return this.method1106((Object) null, 5, 0, 0, (byte) -40);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/Runnable;I)Ld;", line = 365)
    public final class60 method1105(int arg0, Runnable arg1, int arg2) {
        return arg0 == 8 ? this.method1106(arg1, 2, 0, arg2, (byte) -66) : (class60) null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Ld;", line = 381)
    private final class60 method1106(Object arg0, int arg1, int arg2, int arg3, byte arg4) {
        class60 var6 = new class60();
        var6.field968 = arg1;
        var6.field969 = arg3;
        var6.field964 = arg0;
        synchronized (this) {
            if (this.field2723 == null) {
                this.field2723 = this.field2710 = var6;
            } else {
                this.field2723.field966 = var6;
                this.field2723 = var6;
            }
            this.notify();
        }
        return arg4 > -4 ? (class60) null : var6;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/net/URL;I)Ld;", line = 426)
    public final class60 method1107(URL arg0, int arg1) {
        if (arg1 != -2) {
            this.method1098((int[]) null, 65, -88, (Component) null, (byte) 44, (Point) null);
        }
        return this.method1106(arg0, 4, 0, 0, (byte) -75);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIII)Ld;", line = 440)
    public final class60 method1108(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 < 50 ? (class60) null : this.method1106((Object) null, 6, (arg3 << 16) + arg1, (arg4 << 16) - -arg2, (byte) -117);
    }

    static {
        new Hashtable(16);
        field2725 = 0L;
    }
}
