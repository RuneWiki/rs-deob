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

@OriginalClass("client!sm")
public class class120 implements Runnable {

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lqk;")
    public class8 field2115 = null;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field2109 = null;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Lag;")
    private class301 field2116 = null;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lqk;")
    public class8 field2123 = null;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lag;")
    private class301 field2111 = null;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lqk;")
    public class8 field2124 = null;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Z")
    private boolean field2108 = false;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2121;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field2114;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2113 = 3;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "J")
    public static volatile long field2128;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lnf;")
    private class252 field2107;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2110;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2117;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2118;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2119;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2120;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Ljava/lang/String;")
    private static String field2122;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2125;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2126;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2127;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[Lqk;")
    public class8[] field2112;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 4)
    public final void method812(int arg0) {
        field2128 = (long) arg0 + class57.method391(19211);
    }

    @OriginalMember(owner = "client!sm", name = "run", descriptor = "()V", line = 15)
    public final void run() {
        while (true) {
            class301 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2108) {
                        return;
                    }
                    if (this.field2111 != null) {
                        var2 = this.field2111;
                        this.field2111 = this.field2111.field5120;
                        if (this.field2111 == null) {
                            this.field2116 = null;
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
                int var5 = var2.field5124;
                if (var5 == 1) {
                    if (field2128 > class57.method391(19211)) {
                        throw new IOException();
                    }
                    var2.field5122 = new Socket(InetAddress.getByName((String) var2.field5125), var2.field5123);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field5125);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field5123);
                    var2.field5122 = var8;
                } else if (var5 == 4) {
                    if (field2128 > class57.method391(19211)) {
                        throw new IOException();
                    }
                    var2.field5122 = new DataInputStream(((URL) var2.field5125).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field5125);
                    var2.field5122 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field5125);
                    var2.field5122 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field5121 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field5121 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 111)
    public final void method813(byte arg0) {
        synchronized (this) {
            this.field2108 = true;
            this.notifyAll();
        }
        try {
            this.field2114.join();
            if (arg0 >= -21) {
                this.method822((Component) null, true, false);
            }
        } catch (InterruptedException var14) {
        }
        if (this.field2115 != null) {
            try {
                this.field2115.method48(45);
            } catch (IOException var13) {
            }
        }
        if (this.field2123 != null) {
            try {
                this.field2123.method48(123);
            } catch (IOException var12) {
            }
        }
        if (this.field2112 != null) {
            for (int var7 = 0; var7 < this.field2112.length; var7++) {
                if (this.field2112[var7] != null) {
                    try {
                        this.field2112[var7].method48(118);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2124 != null) {
            try {
                this.field2124.method48(84);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)Lag;", line = 172)
    public final class301 method814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 120 % ((40 - arg4) / 38);
        return this.method817(6, 0, (arg1 << 16) + arg2, (Object) null, (arg0 << 16) + arg3);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Lnf;", line = 180)
    public final class252 method815(int arg0) {
        if (arg0 != 3672) {
            this.method817(80, -2, 2, (Object) null, -106);
        }
        return this.field2107;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/net/URL;)Lag;", line = 190)
    public final class301 method816(int arg0, URL arg1) {
        return arg0 == 0 ? this.method817(4, 0, 0, arg1, 0) : (class301) null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIILjava/lang/Object;I)Lag;", line = 203)
    private final class301 method817(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg1 != 0) {
            this.field2107 = (class252) null;
        }
        class301 var6 = new class301();
        var6.field5123 = arg4;
        var6.field5125 = arg3;
        var6.field5124 = arg0;
        synchronized (this) {
            if (this.field2116 == null) {
                this.field2116 = this.field2111 = var6;
            } else {
                this.field2116.field5120 = var6;
                this.field2116 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Frame;B)Lag;", line = 242)
    public final class301 method818(Frame arg0, byte arg1) {
        if (arg1 >= -40) {
            this.field2111 = (class301) null;
        }
        return this.method817(7, 0, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/Class;)Lag;", line = 253)
    public final class301 method819(byte arg0, Class arg1) {
        if (arg0 != 99) {
            this.field2107 = (class252) null;
        }
        return this.method817(10, 0, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILjava/awt/Component;I)Lag;", line = 265)
    public final class301 method820(int arg0, int arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        if (arg3 != 1) {
            this.method826((byte) 76, -126);
        }
        return this.method817(14, 0, var5.y + arg0, (Object) null, var5.x + arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lag;", line = 281)
    public final class301 method821(Runnable arg0, int arg1, byte arg2) {
        if (arg2 != -34) {
            this.method820(-108, 30, (Component) null, -18);
        }
        return this.method817(2, 0, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lag;", line = 292)
    public final class301 method822(Component arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.method818((Frame) null, (byte) 67);
        }
        return this.method817(15, 0, 0, arg0, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)Lag;", line = 302)
    public final class301 method823(int arg0) {
        if (arg0 != 29984) {
            this.field2112 = (class8[]) null;
        }
        return this.method817(5, 0, 0, (Object) null, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lag;", line = 316)
    public final class301 method824(String arg0, Class arg1, int arg2, Class[] arg3) {
        return arg2 == 9526 ? this.method817(8, arg2 ^ 0x2536, 0, new Object[] { arg1, arg0, arg3 }, 0) : (class301) null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z", line = 333)
    public final boolean method825(boolean arg0) {
        if (!arg0) {
            field2122 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)Lag;", line = 344)
    public final class301 method826(byte arg0, int arg1) {
        return arg0 == -10 ? this.method817(3, 0, 0, (Object) null, arg1) : (class301) null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lag;", line = 357)
    public final class301 method827(byte arg0, String arg1, Class arg2) {
        if (arg0 < 44) {
            this.run();
        }
        return this.method817(9, 0, 0, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 447)
    public class120(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2110 = "1.1";
        field2120 = "Unknown";
        this.field2109 = arg0;
        try {
            field2120 = System.getProperty("java.vendor");
            field2110 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2125 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2125 = "Unknown";
        }
        field2119 = field2125.toLowerCase();
        try {
            field2117 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2117 = "";
        }
        try {
            field2118 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2118 = "";
        }
        try {
            field2122 = System.getProperty("user.home");
            if (field2122 != null) {
                field2122 = field2122 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2122 == null) {
            field2122 = "~/";
        }
        try {
            this.field2121 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2126 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2126 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2127 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2127 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2108 = false;
        this.field2114 = new Thread(this);
        this.field2114.setPriority(10);
        this.field2114.setDaemon(true);
        this.field2114.start();
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;)Lag;", line = 378)
    public final class301 method828(byte arg0, String arg1) {
        return arg0 > -82 ? (class301) null : this.method817(16, 0, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;)Lag;", line = 394)
    public final class301 method829(int arg0, String arg1) {
        int var3 = -96 / ((arg0 + 29) / 39);
        return this.method817(12, 0, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/Class;I)Lag;", line = 405)
    public final class301 method830(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.method819((byte) 124, (Class) null);
        }
        return this.method817(11, 0, 0, arg0, 0);
    }

    static {
        new Hashtable(16);
        field2128 = 0L;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBLjava/lang/String;)Lag;", line = 426)
    public final class301 method831(int arg0, byte arg1, String arg2) {
        return arg1 == 118 ? this.method817(1, 0, 0, arg2, arg0) : (class301) null;
    }
}
