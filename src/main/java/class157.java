import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class157 implements Runnable {

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lme;")
    private class210 field2657 = null;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Lme;")
    private class210 field2649 = null;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field2658 = null;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lmc;")
    public class203 field2653 = null;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Z")
    private boolean field2665 = false;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lmc;")
    public class203 field2656 = null;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Lmc;")
    public class203 field2664 = null;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2647;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2660;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field2662 = 3;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "J")
    public static volatile long field2668;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lrd;")
    private class193 field2650;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ljava/lang/String;")
    private static String field2648;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2651;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2652;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2654;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2659;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2661;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2663;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2666;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2667;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[Lmc;")
    public class203[] field2655;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lrd;", line = 4)
    public final class193 method1109(int arg0) {
        if (arg0 != 28458) {
            field2668 = 68L;
        }
        return this.field2650;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)Lme;", line = 18)
    public final class210 method1110(int arg0) {
        return arg0 <= 61 ? (class210) null : this.method1118(18, 0, (byte) -120, (Object) null, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/Class;)Lme;", line = 28)
    public final class210 method1111(int arg0, Class arg1) {
        if (arg0 >= -76) {
            field2662 = -29;
        }
        return this.method1118(10, 0, (byte) 23, arg1, 0);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 38)
    public final void method1112(int arg0) {
        if (arg0 != 3916) {
            this.field2665 = true;
        }
        field2668 = class218.method1520((byte) 118) + 5000L;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lme;", line = 52)
    public final class210 method1113(int arg0, Transferable arg1) {
        if (arg0 != -32531) {
            this.field2657 = (class210) null;
        }
        return this.method1118(19, 0, (byte) 112, arg1, 0);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/Class;)Lme;", line = 62)
    public final class210 method1114(int arg0, Class arg1) {
        return arg0 == 0 ? this.method1118(11, 0, (byte) -98, arg1, 0) : (class210) null;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V", line = 73)
    public final void method1115(int arg0) {
        synchronized (this) {
            this.field2665 = true;
            this.notifyAll();
        }
        try {
            this.field2660.join();
        } catch (InterruptedException var14) {
        }
        if (arg0 != 0) {
            this.method1132(-126, -61, (Runnable) null);
        }
        if (this.field2664 != null) {
            try {
                this.field2664.method1390(0);
            } catch (IOException var13) {
            }
        }
        if (this.field2656 != null) {
            try {
                this.field2656.method1390(0);
            } catch (IOException var12) {
            }
        }
        if (this.field2655 != null) {
            for (int var7 = 0; var7 < this.field2655.length; var7++) {
                if (this.field2655[var7] != null) {
                    try {
                        this.field2655[var7].method1390(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2653 != null) {
            try {
                this.field2653.method1390(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)Lme;", line = 136)
    public final class210 method1116(int arg0) {
        int var2 = -80 / ((arg0 + 51) / 62);
        return this.method1118(5, 0, (byte) -67, (Object) null, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/Component;II)Lme;", line = 145)
    public final class210 method1117(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 <= 106) {
            return (class210) null;
        } else {
            Point var5 = arg1.getLocationOnScreen();
            return this.method1118(14, arg3 + var5.x, (byte) -82, (Object) null, var5.y + arg2);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lme;", line = 160)
    private final class210 method1118(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        int var6 = -44 / ((-arg2 - 29) / 38);
        class210 var7 = new class210();
        var7.field3503 = arg0;
        var7.field3505 = arg1;
        var7.field3502 = arg3;
        synchronized (this) {
            if (this.field2649 == null) {
                this.field2649 = this.field2657 = var7;
            } else {
                this.field2649.field3506 = var7;
                this.field2649 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Z", line = 187)
    public final boolean method1119(int arg0) {
        if (arg0 != 7173) {
            field2652 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;I)Lme;", line = 202)
    public final class210 method1120(int arg0, String arg1, int arg2) {
        if (arg2 != -31246) {
            this.method1123(-18, (Class) null);
        }
        return this.method1118(1, arg0, (byte) -100, arg1, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lme;", line = 215)
    public final class210 method1121(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2650 = (class193) null;
        }
        return this.method1118(3, arg1, (byte) 15, (Object) null, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lme;", line = 225)
    public final class210 method1122(Class[] arg0, String arg1, Class arg2, int arg3) {
        return arg3 == 8 ? this.method1118(8, 0, (byte) -117, new Object[] { arg2, arg1, arg0 }, 0) : (class210) null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(ILjava/lang/Class;)Lme;", line = 238)
    public final class210 method1123(int arg0, Class arg1) {
        return arg0 == 0 ? this.method1118(20, 0, (byte) 93, arg1, 0) : (class210) null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lme;", line = 250)
    public final class210 method1124(Component arg0, boolean arg1, int arg2) {
        if (arg2 < 65) {
            this.field2653 = (class203) null;
        }
        return this.method1118(15, arg1 ? 1 : 0, (byte) 108, arg0, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/awt/Component;[ILjava/awt/Point;II)Lme;", line = 263)
    public final class210 method1125(int arg0, Component arg1, int[] arg2, Point arg3, int arg4, int arg5) {
        if (arg4 != 17) {
            field2652 = (String) null;
        }
        return this.method1118(17, arg5, (byte) -111, new Object[] { arg1, arg2, arg3 }, arg0);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 517)
    public class157(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2651 = "Unknown";
        field2652 = "1.1";
        this.field2658 = arg0;
        try {
            field2651 = System.getProperty("java.vendor");
            field2652 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2663 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2663 = "Unknown";
        }
        field2661 = field2663.toLowerCase();
        try {
            field2654 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2654 = "";
        }
        try {
            field2659 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2659 = "";
        }
        try {
            field2648 = System.getProperty("user.home");
            if (field2648 != null) {
                field2648 = field2648 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2648 == null) {
            field2648 = "~/";
        }
        try {
            this.field2647 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2666 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2666 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2667 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2667 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2665 = false;
        this.field2660 = new Thread(this);
        this.field2660.setPriority(10);
        this.field2660.setDaemon(true);
        this.field2660.start();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)Lme;", line = 282)
    public final class210 method1126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 85) {
            field2667 = (Method) null;
        }
        return this.method1118(6, (arg4 << 16) + arg1, (byte) 95, (Object) null, (arg0 << 16) + arg2);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lme;", line = 292)
    public final class210 method1127(Class arg0, String arg1, int arg2) {
        if (arg2 != 11) {
            this.run();
        }
        return this.method1118(9, 0, (byte) 45, new Object[] { arg0, arg1 }, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Frame;I)Lme;", line = 310)
    public final class210 method1128(Frame arg0, int arg1) {
        int var3 = 76 % ((-arg1 - 12) / 47);
        return this.method1118(7, 0, (byte) 25, arg0, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Lme;", line = 326)
    public final class210 method1129(String arg0, int arg1) {
        return arg1 <= 12 ? (class210) null : this.method1118(16, 0, (byte) -97, arg0, 0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)Lme;", line = 340)
    public final class210 method1130(String arg0, boolean arg1) {
        return arg1 ? (class210) null : this.method1118(12, 0, (byte) -106, arg0, 0);
    }

    @OriginalMember(owner = "client!la", name = "run", descriptor = "()V", line = 353)
    public final void run() {
        while (true) {
            class210 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2665) {
                        return;
                    }
                    if (this.field2657 != null) {
                        var2 = this.field2657;
                        this.field2657 = this.field2657.field3506;
                        if (this.field2657 == null) {
                            this.field2649 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var16) {
                    }
                }
            }
            try {
                int var5 = var2.field3503;
                if (var5 == 1) {
                    if (class218.method1520((byte) 44) < field2668) {
                        throw new IOException();
                    }
                    var2.field3501 = new Socket(InetAddress.getByName((String) var2.field3502), var2.field3505);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field3502);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field3505);
                    var2.field3501 = var11;
                } else if (var5 == 4) {
                    if (class218.method1520((byte) 96) < field2668) {
                        throw new IOException();
                    }
                    var2.field3501 = new DataInputStream(((URL) var2.field3502).openStream());
                } else if (var5 == 8) {
                    Object[] var10 = (Object[]) ((Object[]) var2.field3502);
                    var2.field3501 = ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) ((Class[]) var10[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field3502);
                    var2.field3501 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var5 == 18) {
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3501 = var9.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var7 = (Transferable) var2.field3502;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field3504 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field3504 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/net/URL;I)Lme;", line = 468)
    public final class210 method1131(URL arg0, int arg1) {
        return arg1 == 15216 ? this.method1118(4, 0, (byte) 38, arg0, 0) : (class210) null;
    }

    static {
        new Hashtable(16);
        field2668 = 0L;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILjava/lang/Runnable;)Lme;", line = 488)
    public final class210 method1132(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            field2667 = (Method) null;
        }
        return this.method1118(2, arg0, (byte) -86, arg2, 0);
    }
}
