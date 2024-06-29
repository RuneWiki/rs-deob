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

@OriginalClass("client!nf")
public class class61 implements Runnable {

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Loe;")
    public class10 field886 = null;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field878 = null;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Loe;")
    public class10 field888 = null;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Loe;")
    public class10 field891 = null;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Laj;")
    private class210 field892 = null;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Z")
    private boolean field893 = false;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Laj;")
    private class210 field894 = null;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field883;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field885;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field890 = 3;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "J")
    public static volatile long field898;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lhd;")
    private class162 field896;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field879;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Ljava/lang/String;")
    private static String field880;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field882;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field884;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Ljava/lang/String;")
    public static String field887;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field889;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field895;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field897;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field899;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[Loe;")
    public class10[] field881;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Laj;", line = 4)
    public final class210 method478(Class arg0, int arg1, Class[] arg2, String arg3) {
        if (arg1 != 0) {
            this.field892 = (class210) null;
        }
        return this.method497(0, (byte) 62, new Object[] { arg0, arg3, arg2 }, 0, 8);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z", line = 17)
    public final boolean method479(int arg0) {
        if (arg0 != 0) {
            field897 = (Method) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/String;)Laj;", line = 38)
    public final class210 method480(int arg0, String arg1) {
        return arg0 < 61 ? (class210) null : this.method497(0, (byte) 70, arg1, 0, 16);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 48)
    public final void method481(byte arg0) {
        synchronized (this) {
            this.field893 = true;
            this.notifyAll();
        }
        try {
            this.field885.join();
        } catch (InterruptedException var14) {
        }
        if (this.field888 != null) {
            try {
                this.field888.method59(1);
            } catch (IOException var13) {
            }
        }
        if (this.field886 != null) {
            try {
                this.field886.method59(1);
            } catch (IOException var12) {
            }
        }
        if (arg0 != 94) {
            this.method487((Transferable) null, (byte) -95);
        }
        if (this.field881 != null) {
            for (int var7 = 0; var7 < this.field881.length; var7++) {
                if (this.field881[var7] != null) {
                    try {
                        this.field881[var7].method59(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field891 != null) {
            try {
                this.field891.method59(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/Class;)Laj;", line = 107)
    public final class210 method482(byte arg0, Class arg1) {
        int var3 = -82 % ((arg0 + 48) / 59);
        return this.method497(0, (byte) 63, arg1, 0, 10);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Laj;", line = 116)
    public final class210 method483(int arg0) {
        if (arg0 >= -50) {
            this.method499((String) null, (byte) -30);
        }
        return this.method497(0, (byte) 83, (Object) null, 0, 5);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Component;ZI)Laj;", line = 128)
    public final class210 method484(Component arg0, boolean arg1, int arg2) {
        int var4 = 47 / ((arg2 - 4) / 61);
        return this.method497(0, (byte) 62, arg0, arg1 ? 1 : 0, 15);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 136)
    public final void method485(byte arg0) {
        if (arg0 == 39) {
            field898 = class176.method1234(5574) + 5000L;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLjava/lang/String;)Laj;", line = 148)
    public final class210 method486(int arg0, byte arg1, String arg2) {
        if (arg1 != 85) {
            field882 = (String) null;
        }
        return this.method497(0, (byte) 74, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Laj;", line = 160)
    public final class210 method487(Transferable arg0, byte arg1) {
        if (arg1 >= -120) {
            field884 = (String) null;
        }
        return this.method497(0, (byte) 104, arg0, 0, 19);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Frame;I)Laj;", line = 172)
    public final class210 method488(Frame arg0, int arg1) {
        if (arg1 != -10584) {
            field882 = (String) null;
        }
        return this.method497(0, (byte) 83, arg0, 0, 7);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Lhd;", line = 185)
    public final class162 method489(int arg0) {
        return arg0 == 0 ? this.field896 : (class162) null;
    }

    @OriginalMember(owner = "client!nf", name = "run", descriptor = "()V", line = 199)
    public final void run() {
        while (true) {
            class210 var2;
            synchronized (this) {
                while (true) {
                    if (this.field893) {
                        return;
                    }
                    if (this.field894 != null) {
                        var2 = this.field894;
                        this.field894 = this.field894.field3060;
                        if (this.field894 == null) {
                            this.field892 = null;
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
                int var5 = var2.field3055;
                if (var5 == 1) {
                    if (field898 > class176.method1234(5574)) {
                        throw new IOException();
                    }
                    var2.field3058 = new Socket(InetAddress.getByName((String) var2.field3059), var2.field3057);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3059);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3057);
                    var2.field3058 = var6;
                } else if (var5 == 4) {
                    if (class176.method1234(5574) < field898) {
                        throw new IOException();
                    }
                    var2.field3058 = new DataInputStream(((URL) var2.field3059).openStream());
                } else if (var5 == 8) {
                    Object[] var11 = (Object[]) ((Object[]) var2.field3059);
                    var2.field3058 = ((Class) var11[0]).getDeclaredMethod((String) var11[1], (Class[]) ((Class[]) var11[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3059);
                    var2.field3058 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var5 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3058 = var8.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var9 = (Transferable) var2.field3059;
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var9, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field3056 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field3056 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/lang/Runnable;)Laj;", line = 315)
    public final class210 method490(int arg0, int arg1, Runnable arg2) {
        return arg0 == 2 ? this.method497(0, (byte) 101, arg2, arg1, 2) : (class210) null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)Laj;", line = 327)
    public final class210 method491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -3174) {
            field898 = 99L;
        }
        return this.method497((arg3 << 16) + arg2, (byte) 126, (Object) null, (arg4 << 16) + arg0, 6);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/net/URL;)Laj;", line = 337)
    public final class210 method492(int arg0, URL arg1) {
        if (arg0 <= 109) {
            field890 = 9;
        }
        return this.method497(0, (byte) 115, arg1, 0, 4);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Laj;", line = 347)
    public final class210 method493(Point arg0, int[] arg1, int arg2, Component arg3, int arg4, int arg5) {
        if (arg5 != 17) {
            field897 = (Method) null;
        }
        return this.method497(arg4, (byte) 106, new Object[] { arg3, arg1, arg0 }, arg2, 17);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 513)
    public class61(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field878 = arg0;
        field882 = "Unknown";
        field879 = "1.1";
        try {
            field882 = System.getProperty("java.vendor");
            field879 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field895 = System.getProperty("os.name");
        } catch (Exception var19) {
            field895 = "Unknown";
        }
        field887 = field895.toLowerCase();
        try {
            field884 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field884 = "";
        }
        try {
            field889 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field889 = "";
        }
        try {
            field880 = System.getProperty("user.home");
            if (field880 != null) {
                field880 = field880 + "/";
            }
        } catch (Exception var16) {
        }
        if (field880 == null) {
            field880 = "~/";
        }
        try {
            this.field883 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field899 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field899 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field897 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field897 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field893 = false;
        this.field885 = new Thread(this);
        this.field885.setPriority(10);
        this.field885.setDaemon(true);
        this.field885.start();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/Class;Z)Laj;", line = 361)
    public final class210 method494(Class arg0, boolean arg1) {
        if (arg1) {
            this.method497(3, (byte) -82, (Object) null, -16, -40);
        }
        return this.method497(0, (byte) 94, arg0, 0, 11);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)Laj;", line = 375)
    public final class210 method495(int arg0) {
        return arg0 > -38 ? (class210) null : this.method497(0, (byte) 121, (Object) null, 0, 18);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)Laj;", line = 385)
    public final class210 method496(int arg0, byte arg1) {
        if (arg1 > -43) {
            field897 = (Method) null;
        }
        return this.method497(0, (byte) 102, (Object) null, arg0, 3);
    }

    static {
        new Hashtable(16);
        field898 = 0L;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLjava/lang/Object;II)Laj;", line = 432)
    private final class210 method497(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        class210 var6 = new class210();
        var6.field3055 = arg4;
        var6.field3059 = arg2;
        var6.field3057 = arg3;
        synchronized (this) {
            if (arg1 < 59) {
                return (class210) null;
            }
            if (this.field892 == null) {
                this.field892 = this.field894 = var6;
            } else {
                this.field892.field3060 = var6;
                this.field892 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLjava/lang/Class;)Laj;", line = 467)
    public final class210 method498(boolean arg0, Class arg1) {
        if (!arg0) {
            this.method486(-46, (byte) 96, (String) null);
        }
        return this.method497(0, (byte) 109, arg1, 0, 20);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;B)Laj;", line = 477)
    public final class210 method499(String arg0, byte arg1) {
        if (arg1 != 47) {
            this.method481((byte) 57);
        }
        return this.method497(0, (byte) 78, arg0, 0, 12);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIILjava/awt/Component;)Laj;", line = 488)
    public final class210 method500(byte arg0, int arg1, int arg2, Component arg3) {
        int var5 = 109 / ((52 - arg0) / 42);
        Point var6 = arg3.getLocationOnScreen();
        return this.method497(var6.y + arg1, (byte) 110, (Object) null, var6.x + arg2, 14);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Laj;", line = 498)
    public final class210 method501(byte arg0, String arg1, Class arg2) {
        return arg0 == -114 ? this.method497(0, (byte) 127, new Object[] { arg2, arg1 }, 0, 9) : (class210) null;
    }
}
