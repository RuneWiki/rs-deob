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

@OriginalClass("client!ng")
public class class153 implements Runnable {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field2125 = null;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lvl;")
    public class223 field2122 = null;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
    private boolean field2133 = false;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "Liu;")
    private class397 field2132 = null;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lvl;")
    public class223 field2126 = null;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "Liu;")
    private class397 field2134 = null;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lvl;")
    public class223 field2124 = null;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2128;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2130;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2137 = 3;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "J")
    public static volatile long field2140;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lrb;")
    private class265 field2120;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2121;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2123;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2127;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2129;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2135;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Ljava/lang/String;")
    private static String field2136;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2138;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2139;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2141;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[Lvl;")
    public class223[] field2131;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/lang/Class;)Liu;")
    public final class397 method1024(byte arg0, Class arg1) {
        if (arg0 != -21) {
            this.method1028(91, (Object) null, 25, -105, 99);
        }
        return this.method1049(arg1, 10, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/net/URL;)Liu;")
    public final class397 method1025(byte arg0, URL arg1) {
        if (arg0 < 97) {
            field2139 = null;
        }
        return this.method1049(arg1, 4, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method1026(int arg0) {
        if (arg0 != -1309) {
            this.method1040(-1, 30, (Runnable) null);
        }
        field2140 = class435.method2539(-10659) + 5000L;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)Liu;")
    public final class397 method1027(int arg0) {
        return arg0 < 13 ? null : this.method1049((Object) null, 13, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Object;III)Liu;")
    private final class397 method1028(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class397 var6 = new class397();
        synchronized (var6) {
            var6.field5824 = arg4;
            var6.field5820 = arg0;
            var6.field5819 = arg1;
            synchronized (this) {
                if (this.field2132 == null) {
                    this.field2132 = this.field2134 = var6;
                } else {
                    this.field2132.field5821 = var6;
                    this.field2132 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            if (arg3 != 0) {
                this.method1027(68);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/Class;)Liu;")
    public final class397 method1029(int arg0, Class arg1) {
        return arg0 < 76 ? null : this.method1049(arg1, 20, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Liu;")
    public final class397 method1030(int arg0) {
        if (arg0 != -8026) {
            this.run();
        }
        return this.method1049((Object) null, 12, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Liu;")
    public final class397 method1031(byte arg0, Transferable arg1) {
        return arg0 < 45 ? null : this.method1049(arg1, 19, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Liu;")
    public final class397 method1032(String arg0, Class arg1, Class[] arg2, boolean arg3) {
        if (!arg3) {
            this.method1047(107, -26);
        }
        return this.method1049(new Object[] { arg1, arg0, arg2 }, 8, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Liu;")
    public final class397 method1033(int arg0, int arg1, int arg2, int[] arg3, Point arg4, Component arg5) {
        return arg1 == 17 ? this.method1049(new Object[] { arg5, arg3, arg4 }, 17, arg2, arg0, arg1 - 4033) : null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z")
    public final boolean method1034(boolean arg0) {
        return arg0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;III)Liu;")
    public final class397 method1035(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            this.method1051(57, -2, (String) null);
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method1049((Object) null, 14, var5.y + arg1, var5.x + arg3, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Class;Z)Liu;")
    public final class397 method1036(Class arg0, boolean arg1) {
        if (!arg1) {
            this.field2132 = null;
        }
        return this.method1049(arg0, 11, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLjava/lang/String;)Liu;")
    public final class397 method1037(byte arg0, String arg1) {
        if (arg0 > -81) {
            this.method1034(true);
        }
        return this.method1049(arg1, 21, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)Liu;")
    public final class397 method1038(byte arg0) {
        int var2 = -9 / ((-arg0 - 10) / 52);
        return this.method1049((Object) null, 5, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Liu;")
    public final class397 method1039(int arg0) {
        if (arg0 != 0) {
            this.field2132 = null;
        }
        return this.method1049((Object) null, 18, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/lang/Runnable;)Liu;")
    public final class397 method1040(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 2) {
            this.method1041((Class) null, -48, (String) null);
        }
        return this.method1049(arg2, 2, 0, arg1, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Liu;")
    public final class397 method1041(Class arg0, int arg1, String arg2) {
        if (arg1 >= -4) {
            this.method1036((Class) null, true);
        }
        return this.method1049(new Object[] { arg0, arg2 }, 9, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
    public final void method1042(int arg0) {
        synchronized (this) {
            this.field2133 = true;
            this.notifyAll();
        }
        try {
            this.field2130.join();
        } catch (InterruptedException var9) {
        }
        int var3 = -88 / ((arg0 - 60) / 37);
        if (this.field2126 != null) {
            try {
                this.field2126.method1458((byte) -63);
            } catch (IOException var8) {
            }
        }
        if (this.field2122 != null) {
            try {
                this.field2122.method1458((byte) -101);
            } catch (IOException var7) {
            }
        }
        if (this.field2131 != null) {
            for (int var4 = 0; var4 < this.field2131.length; var4++) {
                if (this.field2131[var4] != null) {
                    try {
                        this.field2131[var4].method1458((byte) 78);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field2124 != null) {
            try {
                this.field2124.method1458((byte) 118);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)Lrb;")
    public final class265 method1043(int arg0) {
        if (arg0 != 0) {
            this.method1043(89);
        }
        return this.field2120;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLjava/lang/String;)[B")
    public final byte[] method1044(boolean arg0, String arg1) {
        class397 var3 = this.method1028(0, arg1, 0, 0, 21);
        return arg0 ? null : (byte[]) var3.field5823;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZIII)Liu;")
    public final class397 method1045(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            field2139 = null;
        }
        return this.method1049((Object) null, 6, (arg0 << 16) + arg3, (arg2 << 16) - -arg4, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)Liu;")
    public final class397 method1046(String arg0, int arg1) {
        if (arg1 != 0) {
            field2121 = null;
        }
        return this.method1049(arg0, 16, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Liu;")
    public final class397 method1047(int arg0, int arg1) {
        if (arg1 > -119) {
            this.method1029(19, (Class) null);
        }
        return this.method1049((Object) null, 3, 0, arg0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class397 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2133) {
                        return;
                    }
                    if (this.field2134 != null) {
                        var2 = this.field2134;
                        this.field2134 = this.field2134.field5821;
                        if (this.field2134 == null) {
                            this.field2132 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field5824;
                if (var3 == 1) {
                    if (class435.method2539(-10659) < field2140) {
                        throw new IOException();
                    }
                    var2.field5823 = new Socket(InetAddress.getByName((String) var2.field5819), var2.field5820);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field5819);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field5820);
                    var2.field5823 = var4;
                } else if (var3 == 4) {
                    if (class435.method2539(-10659) < field2140) {
                        throw new IOException();
                    }
                    var2.field5823 = new DataInputStream(((URL) var2.field5819).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field5819;
                    var2.field5823 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field5819;
                    var2.field5823 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5823 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field5819;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field5822 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5822 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/awt/Frame;)Liu;")
    public final class397 method1048(int arg0, Frame arg1) {
        if (arg0 != 1095) {
            this.method1030(39);
        }
        return this.method1049(arg1, 7, 0, 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/Object;IIII)Liu;")
    private final class397 method1049(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class397 var6 = new class397();
        if (arg4 != -4016) {
            return null;
        }
        var6.field5824 = arg1;
        var6.field5820 = arg3;
        var6.field5819 = arg0;
        synchronized (this) {
            if (this.field2132 == null) {
                this.field2132 = this.field2134 = var6;
            } else {
                this.field2132.field5821 = var6;
                this.field2132 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;ZB)Liu;")
    public final class397 method1050(Component arg0, boolean arg1, byte arg2) {
        return arg2 > -3 ? null : this.method1049(arg0, 15, 0, arg1 ? 1 : 0, -4016);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/lang/String;)Liu;")
    public final class397 method1051(int arg0, int arg1, String arg2) {
        if (arg1 != -4655) {
            this.method1037((byte) -104, (String) null);
        }
        return this.method1049(arg2, 1, 0, arg0, arg1 + 639);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class153(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2129 = "Unknown";
        this.field2125 = arg0;
        field2127 = "1.1";
        try {
            field2129 = System.getProperty("java.vendor");
            field2127 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2138 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2138 = "Unknown";
        }
        field2123 = field2138.toLowerCase();
        try {
            field2121 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2121 = "";
        }
        try {
            field2135 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2135 = "";
        }
        try {
            field2136 = System.getProperty("user.home");
            if (field2136 != null) {
                field2136 = field2136 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2136 == null) {
            field2136 = "~/";
        }
        try {
            this.field2128 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2139 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2139 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2141 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2141 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2133 = false;
        this.field2130 = new Thread(this);
        this.field2130.setPriority(10);
        this.field2130.setDaemon(true);
        this.field2130.start();
    }

    static {
        new Hashtable(16);
        field2140 = 0L;
    }
}
