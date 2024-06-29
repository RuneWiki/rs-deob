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

@OriginalClass("client!na")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Len;")
    private class192 field2344 = null;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Laf;")
    public class18 field2346 = null;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field2350 = null;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Len;")
    private class192 field2353 = null;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Laf;")
    public class18 field2351 = null;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Laf;")
    public class18 field2357 = null;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Z")
    private boolean field2364 = false;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2358;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field2354;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2343 = 3;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "J")
    public static volatile long field2362;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lqg;")
    private class144 field2348;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2347;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2349;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Ljava/lang/String;")
    private static String field2352;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2355;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2356;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2359;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2360;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2361;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2363;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[Laf;")
    public class18[] field2345;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Len;", line = 5)
    public final class192 method1112(byte arg0) {
        if (arg0 < 2) {
            this.method1114((byte) 37, -50, (Runnable) null);
        }
        return this.method1123(0, 0, (Object) null, 1, 18);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)Len;", line = 15)
    public final class192 method1113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -5) {
            this.field2353 = (class192) null;
        }
        return this.method1123((arg1 << 16) + arg4, (arg0 << 16) - -arg3, (Object) null, 1, 6);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BILjava/lang/Runnable;)Len;", line = 25)
    public final class192 method1114(byte arg0, int arg1, Runnable arg2) {
        if (arg0 != 97) {
            this.method1119((Class) null, (String) null, 19);
        }
        return this.method1123(arg1, 0, arg2, 1, 2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/awt/Component;Ljava/awt/Point;BI[I)Len;", line = 36)
    public final class192 method1115(int arg0, Component arg1, Point arg2, byte arg3, int arg4, int[] arg5) {
        return arg3 < 109 ? (class192) null : this.method1123(arg4, arg0, new Object[] { arg1, arg5, arg2 }, 1, 17);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 50)
    public final void method1116(byte arg0) {
        field2362 = class47.method371(73) + 5000L;
        if (arg0 > -81) {
            this.field2344 = (class192) null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/String;)Len;", line = 62)
    public final class192 method1117(byte arg0, String arg1) {
        return arg0 == 44 ? this.method1123(0, 0, arg1, arg0 - 43, 16) : (class192) null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/net/URL;I)Len;", line = 74)
    public final class192 method1118(URL arg0, int arg1) {
        return arg1 == 4 ? this.method1123(0, 0, arg0, arg1 ^ 0x5, 4) : (class192) null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Len;", line = 86)
    public final class192 method1119(Class arg0, String arg1, int arg2) {
        int var4 = -18 / ((arg2 + 56) / 63);
        return this.method1123(0, 0, new Object[] { arg0, arg1 }, 1, 9);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 518)
    public class145(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2350 = arg0;
        field2347 = "1.1";
        field2349 = "Unknown";
        try {
            field2349 = System.getProperty("java.vendor");
            field2347 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2356 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2356 = "Unknown";
        }
        field2360 = field2356.toLowerCase();
        try {
            field2355 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2355 = "";
        }
        try {
            field2359 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2359 = "";
        }
        try {
            field2352 = System.getProperty("user.home");
            if (field2352 != null) {
                field2352 = field2352 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2352 == null) {
            field2352 = "~/";
        }
        try {
            this.field2358 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2361 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2361 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2363 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2363 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2364 = false;
        this.field2354 = new Thread(this);
        this.field2354.setPriority(10);
        this.field2354.setDaemon(true);
        this.field2354.start();
    }

    static {
        new Hashtable(16);
        field2362 = 0L;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B[Ljava/lang/Class;)Len;", line = 105)
    public final class192 method1120(Class arg0, String arg1, byte arg2, Class[] arg3) {
        if (arg2 != -35) {
            this.method1131((Transferable) null, -101);
        }
        return this.method1123(0, 0, new Object[] { arg0, arg1, arg3 }, 1, 8);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lqg;", line = 115)
    public final class144 method1121(int arg0) {
        if (arg0 >= -22) {
            this.method1119((Class) null, (String) null, 94);
        }
        return this.field2348;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Len;", line = 128)
    public final class192 method1122(int arg0, int arg1) {
        if (arg0 > -37) {
            field2352 = (String) null;
        }
        return this.method1123(arg1, 0, (Object) null, 1, 3);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/Object;II)Len;", line = 143)
    private final class192 method1123(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class192 var6 = new class192();
        var6.field3061 = arg0;
        if (arg3 != 1) {
            this.method1128((Frame) null, (byte) 113);
        }
        var6.field3065 = arg4;
        var6.field3062 = arg2;
        synchronized (this) {
            if (this.field2344 == null) {
                this.field2344 = this.field2353 = var6;
            } else {
                this.field2344.field3063 = var6;
                this.field2344 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;II)Len;", line = 171)
    public final class192 method1124(String arg0, int arg1, int arg2) {
        int var4 = -60 / ((-arg1 - 20) / 37);
        return this.method1123(arg2, 0, arg0, 1, 1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLjava/awt/Component;Z)Len;", line = 179)
    public final class192 method1125(boolean arg0, Component arg1, boolean arg2) {
        return arg2 ? (class192) null : this.method1123(arg0 ? 1 : 0, 0, arg1, 1, 15);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBILjava/awt/Component;)Len;", line = 190)
    public final class192 method1126(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 != 47) {
            this.method1122(-127, 109);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method1123(var5.x + arg2, var5.y + arg0, (Object) null, 1, 14);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/Class;B)Len;", line = 231)
    public final class192 method1127(Class arg0, byte arg1) {
        if (arg1 <= 110) {
            this.method1119((Class) null, (String) null, 34);
        }
        return this.method1123(0, 0, arg0, 1, 20);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Frame;B)Len;", line = 243)
    public final class192 method1128(Frame arg0, byte arg1) {
        if (arg1 != 113) {
            this.field2357 = (class18) null;
        }
        return this.method1123(0, 0, arg0, 1, 7);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Z", line = 257)
    public final boolean method1129(byte arg0) {
        if (arg0 >= -81) {
            this.field2351 = (class18) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 270)
    public final void method1130(int arg0) {
        synchronized (this) {
            this.field2364 = true;
            if (arg0 != 0) {
                field2352 = (String) null;
            }
            this.notifyAll();
        }
        try {
            this.field2354.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2357 != null) {
            try {
                this.field2357.method101(false);
            } catch (IOException var13) {
            }
        }
        if (this.field2351 != null) {
            try {
                this.field2351.method101(false);
            } catch (IOException var12) {
            }
        }
        if (this.field2345 != null) {
            for (int var7 = 0; var7 < this.field2345.length; var7++) {
                if (this.field2345[var7] != null) {
                    try {
                        this.field2345[var7].method101(false);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2346 != null) {
            try {
                this.field2346.method101(false);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Len;", line = 339)
    public final class192 method1131(Transferable arg0, int arg1) {
        if (arg1 != 26409) {
            field2360 = (String) null;
        }
        return this.method1123(0, 0, arg0, arg1 - 26408, 19);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/Class;)Len;", line = 353)
    public final class192 method1132(int arg0, Class arg1) {
        return arg0 >= -104 ? (class192) null : this.method1123(0, 0, arg1, 1, 10);
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 368)
    public final void run() {
        while (true) {
            class192 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2364) {
                        return;
                    }
                    if (this.field2353 != null) {
                        var2 = this.field2353;
                        this.field2353 = this.field2353.field3063;
                        if (this.field2353 == null) {
                            this.field2344 = null;
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
                int var5 = var2.field3065;
                if (var5 == 1) {
                    if (class47.method371(-101) < field2362) {
                        throw new IOException();
                    }
                    var2.field3066 = new Socket(InetAddress.getByName((String) var2.field3062), var2.field3061);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3062);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3061);
                    var2.field3066 = var6;
                } else if (var5 == 4) {
                    if (field2362 > class47.method371(113)) {
                        throw new IOException();
                    }
                    var2.field3066 = new DataInputStream(((URL) var2.field3062).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3062);
                    var2.field3066 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var11 = (Object[]) ((Object[]) var2.field3062);
                    var2.field3066 = ((Class) var11[0]).getDeclaredField((String) var11[1]);
                } else if (var5 == 18) {
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3066 = var10.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var8 = (Transferable) var2.field3062;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field3064 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field3064 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Len;", line = 483)
    public final class192 method1133(byte arg0) {
        int var2 = -75 % ((31 - arg0) / 36);
        return this.method1123(0, 0, (Object) null, 1, 5);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)Len;", line = 492)
    public final class192 method1134(int arg0, String arg1) {
        if (arg0 <= 95) {
            this.field2353 = (class192) null;
        }
        return this.method1123(0, 0, arg1, 1, 12);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/lang/Class;)Len;", line = 502)
    public final class192 method1135(byte arg0, Class arg1) {
        if (arg0 < 60) {
            this.method1129((byte) -68);
        }
        return this.method1123(0, 0, arg1, 1, 11);
    }
}
