import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!vd")
public class class4 implements Runnable {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field63 = null;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lwc;")
    public class245 field66 = null;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lac;")
    private class139 field62 = null;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lac;")
    private class139 field68 = null;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lwc;")
    public class245 field72 = null;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lwc;")
    public class245 field69 = null;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Z")
    private boolean field76 = false;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field71;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field64;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field60 = 3;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "J")
    public static volatile long field73;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Lqe;")
    private class100 field65;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/lang/String;")
    private static String field55;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field56;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Ljava/lang/String;")
    public static String field58;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field59;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field61;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field67;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field70;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field74;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field75;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Lwc;")
    public class245[] field57;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)Lac;")
    public final class139 method17(boolean arg0, int arg1) {
        if (!arg0) {
            field58 = null;
        }
        return this.method28(7, (Object) null, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/lang/Class;)Lac;")
    public final class139 method18(boolean arg0, Class arg1) {
        if (arg0) {
            this.method31((URL) null, (byte) 19);
        }
        return this.method28(7, arg1, 0, 0, 20);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method19(byte arg0) {
        if (arg0 == -73) {
            field73 = class242.method1650(17) + 5000L;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lac;")
    public final class139 method20(byte arg0, Transferable arg1) {
        return arg0 <= 97 ? null : this.method28(7, arg1, 0, 0, 19);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/Class;)Lac;")
    public final class139 method21(byte arg0, Class arg1) {
        int var3 = -49 % ((-arg0 - 13) / 40);
        return this.method28(7, arg1, 0, 0, 11);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;)Lac;")
    public final class139 method22(int arg0, String arg1) {
        return arg0 == 0 ? this.method28(7, arg1, 0, 0, 16) : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method23(int arg0) {
        synchronized (this) {
            this.field76 = true;
            this.notifyAll();
        }
        if (arg0 != 17) {
            field60 = 49;
        }
        try {
            this.field64.join();
        } catch (InterruptedException var8) {
        }
        if (this.field69 != null) {
            try {
                this.field69.method1663(1);
            } catch (IOException var7) {
            }
        }
        if (this.field66 != null) {
            try {
                this.field66.method1663(arg0 ^ 0x10);
            } catch (IOException var6) {
            }
        }
        if (this.field57 != null) {
            for (int var3 = 0; var3 < this.field57.length; var3++) {
                if (this.field57[var3] != null) {
                    try {
                        this.field57[var3].method1663(arg0 - 16);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field72 != null) {
            try {
                this.field72.method1663(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)Lac;")
    public final class139 method24(byte arg0, String arg1) {
        if (arg0 >= -63) {
            this.field72 = null;
        }
        return this.method28(7, arg1, 0, 0, 12);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/lang/Runnable;I)Lac;")
    public final class139 method25(boolean arg0, Runnable arg1, int arg2) {
        if (arg0) {
            this.method18(false, (Class) null);
        }
        return this.method28(7, arg1, arg2, 0, 2);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Lac;")
    public final class139 method26(boolean arg0) {
        if (!arg0) {
            this.method30((String) null, -100, (byte) -90);
        }
        return this.method28(7, (Object) null, 0, 0, 18);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLjava/awt/Component;I)Lac;")
    public final class139 method27(int arg0, boolean arg1, Component arg2, int arg3) {
        if (arg1) {
            field59 = null;
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method28(7, (Object) null, var5.x + arg0, var5.y + arg3, 14);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/Object;III)Lac;")
    private final class139 method28(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class139 var6 = new class139();
        if (arg0 != 7) {
            field70 = null;
        }
        var6.field2079 = arg4;
        var6.field2083 = arg2;
        var6.field2084 = arg1;
        synchronized (this) {
            if (this.field62 == null) {
                this.field62 = this.field68 = var6;
            } else {
                this.field62.field2081 = var6;
                this.field62 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/awt/Component;B)Lac;")
    public final class139 method29(boolean arg0, Component arg1, byte arg2) {
        return arg2 > -16 ? null : this.method28(7, arg1, arg0 ? 1 : 0, 0, 15);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;IB)Lac;")
    public final class139 method30(String arg0, int arg1, byte arg2) {
        if (arg2 != 3) {
            this.method26(true);
        }
        return this.method28(7, arg0, arg1, 0, 1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/net/URL;B)Lac;")
    public final class139 method31(URL arg0, byte arg1) {
        if (arg1 >= -97) {
            this.field71 = null;
        }
        return this.method28(7, arg0, 0, 0, 4);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/Component;[IILjava/awt/Point;I)Lac;")
    public final class139 method32(byte arg0, Component arg1, int[] arg2, int arg3, Point arg4, int arg5) {
        return arg0 >= -117 ? null : this.method28(7, new Object[] { arg1, arg2, arg4 }, arg5, arg3, 17);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ZLjava/lang/String;)Lac;")
    public final class139 method33(Class arg0, Class[] arg1, boolean arg2, String arg3) {
        if (arg2) {
            this.field64 = null;
        }
        return this.method28(7, new Object[] { arg0, arg3, arg1 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Lac;")
    public final class139 method34(Class arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method32((byte) -115, (Component) null, (int[]) null, 127, (Point) null, -84);
        }
        return this.method28(7, new Object[] { arg0, arg2 }, 0, 0, 9);
    }

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class139 var2;
            synchronized (this) {
                while (true) {
                    if (this.field76) {
                        return;
                    }
                    if (this.field68 != null) {
                        var2 = this.field68;
                        this.field68 = this.field68.field2081;
                        if (this.field68 == null) {
                            this.field62 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var15) {
                    }
                }
            }
            try {
                int var3 = var2.field2079;
                if (var3 == 1) {
                    if (class242.method1650(106) < field73) {
                        throw new IOException();
                    }
                    var2.field2080 = new Socket(InetAddress.getByName((String) var2.field2084), var2.field2083);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field2084);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field2083);
                    var2.field2080 = var9;
                } else if (var3 == 4) {
                    if (class242.method1650(57) < field73) {
                        throw new IOException();
                    }
                    var2.field2080 = new DataInputStream(((URL) var2.field2084).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field2084;
                    var2.field2080 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field2084;
                    var2.field2080 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2080 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field2084;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2082 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field2082 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lqe;")
    public final class100 method35(int arg0) {
        if (arg0 >= -101) {
            field58 = null;
        }
        return this.field65;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class4(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field70 = "1.1";
        field67 = "Unknown";
        this.field63 = arg0;
        try {
            field67 = System.getProperty("java.vendor");
            field70 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field56 = System.getProperty("os.name");
        } catch (Exception var11) {
            field56 = "Unknown";
        }
        field59 = field56.toLowerCase();
        try {
            field58 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field58 = "";
        }
        try {
            field61 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field61 = "";
        }
        try {
            field55 = System.getProperty("user.home");
            if (field55 != null) {
                field55 = field55 + "/";
            }
        } catch (Exception var8) {
        }
        if (field55 == null) {
            field55 = "~/";
        }
        try {
            this.field71 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field74 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field74 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field75 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field75 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field76 = false;
        this.field64 = new Thread(this);
        this.field64.setPriority(10);
        this.field64.setDaemon(true);
        this.field64.start();
    }

    static {
        new Hashtable(16);
        field73 = 0L;
    }
}
