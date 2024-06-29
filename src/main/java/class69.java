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

@OriginalClass("client!bk")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Ldd;")
    public class265 field1044 = null;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Ldd;")
    public class265 field1038 = null;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    private boolean field1040 = false;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ldd;")
    public class265 field1052 = null;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lub;")
    private class23 field1036 = null;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Ljava/applet/Applet;")
    public Applet field1037 = null;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lub;")
    private class23 field1045 = null;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1041;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field1051;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1039 = 3;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "J")
    public static volatile long field1057;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lgi;")
    private class231 field1043;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1042;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1046;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1047;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1048;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1049;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Ljava/lang/String;")
    private static String field1050;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1054;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1055;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1056;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[Ldd;")
    public class265[] field1053;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;I)Lub;", line = 5)
    public final class23 method542(String arg0, int arg1) {
        return arg1 == 3 ? this.method543((byte) -127, 0, arg0, 12, 0) : (class23) null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BILjava/lang/Object;II)Lub;", line = 18)
    private final class23 method543(byte arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg0 != -127) {
            this.method560((String) null, false);
        }
        class23 var6 = new class23();
        var6.field407 = arg3;
        var6.field406 = arg1;
        var6.field404 = arg2;
        synchronized (this) {
            if (this.field1036 == null) {
                this.field1036 = this.field1045 = var6;
            } else {
                this.field1036.field408 = var6;
                this.field1036 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZII)Lub;", line = 51)
    public final class23 method544(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.method542((String) null, -108);
        }
        return this.method543((byte) -127, (arg3 << 16) + arg4, (Object) null, 6, (arg1 << 16) + arg0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lub;", line = 69)
    public final class23 method545(byte arg0) {
        return arg0 == -47 ? this.method543((byte) -127, 0, (Object) null, 5, 0) : (class23) null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Point;I[IZILjava/awt/Component;)Lub;", line = 79)
    public final class23 method546(Point arg0, int arg1, int[] arg2, boolean arg3, int arg4, Component arg5) {
        if (arg3) {
            field1054 = (String) null;
        }
        return this.method543((byte) -127, arg1, new Object[] { arg5, arg2, arg0 }, 17, arg4);
    }

    @OriginalMember(owner = "client!bk", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        while (true) {
            class23 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1040) {
                        return;
                    }
                    if (this.field1045 != null) {
                        var2 = this.field1045;
                        this.field1045 = this.field1045.field408;
                        if (this.field1045 == null) {
                            this.field1036 = null;
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
                int var5 = var2.field407;
                if (var5 == 1) {
                    if (field1057 > class212.method1543(22326)) {
                        throw new IOException();
                    }
                    var2.field409 = new Socket(InetAddress.getByName((String) var2.field404), var2.field406);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field404);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field406);
                    var2.field409 = var6;
                } else if (var5 == 4) {
                    if (class212.method1543(22326) < field1057) {
                        throw new IOException();
                    }
                    var2.field409 = new DataInputStream(((URL) var2.field404).openStream());
                } else if (var5 == 8) {
                    Object[] var11 = (Object[]) ((Object[]) var2.field404);
                    var2.field409 = ((Class) var11[0]).getDeclaredMethod((String) var11[1], (Class[]) ((Class[]) var11[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field404);
                    var2.field409 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var5 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field409 = var8.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var9 = (Transferable) var2.field404;
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var9, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field405 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field405 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lgi;", line = 214)
    public final class231 method547(boolean arg0) {
        if (!arg0) {
            field1055 = (Method) null;
        }
        return this.field1043;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)Lub;", line = 224)
    public final class23 method548(int arg0) {
        if (arg0 != 0) {
            this.field1043 = (class231) null;
        }
        return this.method543((byte) -127, 0, (Object) null, 18, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;IB)Lub;", line = 243)
    public final class23 method549(String arg0, int arg1, byte arg2) {
        if (arg2 <= 67) {
            this.field1041 = (EventQueue) null;
        }
        return this.method543((byte) -127, arg1, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 253)
    public final void method550(byte arg0) {
        if (arg0 != -7) {
            this.method559((Transferable) null, true);
        }
        field1057 = class212.method1543(arg0 + 22333) + 5000L;
    }

    static {
        new Hashtable(16);
        field1057 = 0L;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)Z", line = 267)
    public final boolean method551(byte arg0) {
        if (arg0 > -22) {
            this.method542((String) null, 63);
        }
        return false;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lub;", line = 284)
    public final class23 method552(String arg0, int arg1, Class arg2) {
        int var4 = 66 % ((49 - arg1) / 61);
        return this.method543((byte) -127, 0, new Object[] { arg2, arg0 }, 9, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lub;", line = 296)
    public final class23 method553(Runnable arg0, byte arg1, int arg2) {
        if (arg1 <= 66) {
            this.field1053 = (class265[]) null;
        }
        return this.method543((byte) -127, arg2, arg0, 2, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Class;Z)Lub;", line = 307)
    public final class23 method554(Class arg0, boolean arg1) {
        return arg1 ? (class23) null : this.method543((byte) -127, 0, arg0, 11, 0);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 499)
    public class69(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1054 = "Unknown";
        field1049 = "1.1";
        this.field1037 = arg0;
        try {
            field1054 = System.getProperty("java.vendor");
            field1049 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field1046 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1046 = "Unknown";
        }
        field1047 = field1046.toLowerCase();
        try {
            field1048 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1048 = "";
        }
        try {
            field1042 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1042 = "";
        }
        try {
            field1050 = System.getProperty("user.home");
            if (field1050 != null) {
                field1050 = field1050 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1050 == null) {
            field1050 = "~/";
        }
        try {
            this.field1041 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field1056 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1056 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field1055 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1055 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field1040 = false;
        this.field1051 = new Thread(this);
        this.field1051.setPriority(10);
        this.field1051.setDaemon(true);
        this.field1051.start();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/net/URL;)Lub;", line = 323)
    public final class23 method555(int arg0, URL arg1) {
        if (arg0 != -3080) {
            this.field1043 = (class231) null;
        }
        return this.method543((byte) -127, 0, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V", line = 333)
    public final void method556(byte arg0) {
        synchronized (this) {
            this.field1040 = true;
            this.notifyAll();
        }
        try {
            this.field1051.join();
        } catch (InterruptedException var14) {
        }
        if (this.field1044 != null) {
            try {
                this.field1044.method1829(-120);
            } catch (IOException var13) {
            }
        }
        if (this.field1038 != null) {
            try {
                this.field1038.method1829(-124);
            } catch (IOException var12) {
            }
        }
        if (this.field1053 != null) {
            for (int var7 = 0; var7 < this.field1053.length; var7++) {
                if (this.field1053[var7] != null) {
                    try {
                        this.field1053[var7].method1829(-128);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field1052 != null) {
            try {
                this.field1052.method1829(-115);
            } catch (IOException var10) {
            }
        }
        if (arg0 >= -119) {
            this.field1051 = (Thread) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lub;", line = 389)
    public final class23 method557(int arg0, int arg1) {
        if (arg0 != -11140) {
            this.method551((byte) 127);
        }
        return this.method543((byte) -127, arg1, (Object) null, 3, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjava/awt/Frame;)Lub;", line = 400)
    public final class23 method558(boolean arg0, Frame arg1) {
        return arg0 ? this.method543((byte) -127, 0, arg1, 7, 0) : (class23) null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lub;", line = 411)
    public final class23 method559(Transferable arg0, boolean arg1) {
        if (arg1) {
            this.method547(true);
        }
        return this.method543((byte) -127, 0, arg0, 19, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;Z)Lub;", line = 421)
    public final class23 method560(String arg0, boolean arg1) {
        if (arg1) {
            this.method563(false, (Component) null, false);
        }
        return this.method543((byte) -127, 0, arg0, 16, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;III)Lub;", line = 447)
    public final class23 method561(Component arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 14) {
            this.method553((Runnable) null, (byte) -122, -28);
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method543((byte) -127, var5.x + arg1, (Object) null, 14, var5.y + arg2);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lub;", line = 459)
    public final class23 method562(Class arg0, String arg1, int arg2, Class[] arg3) {
        if (arg2 > -93) {
            field1050 = (String) null;
        }
        return this.method543((byte) -127, 0, new Object[] { arg0, arg1, arg3 }, 8, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lub;", line = 469)
    public final class23 method563(boolean arg0, Component arg1, boolean arg2) {
        if (!arg0) {
            this.field1041 = (EventQueue) null;
        }
        return this.method543((byte) -127, arg2 ? 1 : 0, arg1, 15, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/lang/Class;)Lub;", line = 481)
    public final class23 method564(int arg0, Class arg1) {
        if (arg0 != -31216) {
            this.method554((Class) null, true);
        }
        return this.method543((byte) -127, 0, arg1, 10, 0);
    }
}
