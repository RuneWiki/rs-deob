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

@OriginalClass("client!ml")
public class class241 implements Runnable {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field3209 = null;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lrl;")
    public class468 field3214 = null;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lcc;")
    private class474 field3205 = null;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lrl;")
    public class468 field3206 = null;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Lrl;")
    public class468 field3217 = null;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
    private boolean field3218 = false;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lcc;")
    private class474 field3223 = null;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3215;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field3219;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field3211 = 3;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "J")
    public static volatile long field3226;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Lfc;")
    private class156 field3222;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/String;")
    private static String field3207;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3208;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3210;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3212;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3213;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3216;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3221;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3224;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3225;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[Lrl;")
    public class468[] field3220;

    static {
        new Hashtable(16);
        field3226 = 0L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Object;ZII)Lcc;", line = 6)
    private final class474 method1328(int arg0, Object arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.method1337(7, (String) null);
        }
        class474 var6 = new class474();
        synchronized (var6) {
            var6.field6532 = arg1;
            var6.field6533 = arg4;
            var6.field6531 = arg3;
            synchronized (this) {
                if (this.field3223 == null) {
                    this.field3223 = this.field3205 = var6;
                } else {
                    this.field3223.field6530 = var6;
                    this.field3223 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/awt/Component;Z)Lcc;", line = 46)
    public final class474 method1329(int arg0, int arg1, Component arg2, boolean arg3) {
        if (arg3) {
            this.field3214 = null;
        }
        Point var5 = arg2.getLocationOnScreen();
        return this.method1349((Object) null, -8257, var5.x + arg0, 14, arg1 + var5.y);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lcc;", line = 62)
    public final class474 method1330(Class arg0, int arg1, String arg2, Class[] arg3) {
        if (arg1 != 0) {
            this.field3222 = null;
        }
        return this.method1349(new Object[] { arg0, arg2, arg3 }, arg1 ^ 0xFFFFDFBF, 0, 8, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZI)Lcc;", line = 74)
    public final class474 method1331(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field3206 = null;
        }
        return this.method1349((Object) null, -8257, (arg1 << 16) + arg2, 6, (arg4 << 16) + arg0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lcc;", line = 84)
    public final class474 method1332(int arg0) {
        if (arg0 <= 6) {
            this.field3215 = null;
        }
        return this.method1349((Object) null, -8257, 0, 12, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;II)Lcc;", line = 94)
    public final class474 method1333(String arg0, int arg1, int arg2) {
        return arg2 == 1 ? this.method1349(arg0, -8257, arg1, 1, 0) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/Class;)Lcc;", line = 109)
    public final class474 method1334(int arg0, Class arg1) {
        if (arg0 != 0) {
            field3210 = null;
        }
        return this.method1349(arg1, -8257, 0, 20, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)Lcc;", line = 124)
    public final class474 method1335(byte arg0, String arg1) {
        int var3 = -95 / ((32 - arg0) / 42);
        return this.method1349(arg1, -8257, 0, 21, 0);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 592)
    public class241(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3216 = "1.1";
        this.field3209 = arg0;
        field3213 = "Unknown";
        try {
            field3213 = System.getProperty("java.vendor");
            field3216 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3221 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3221 = "Unknown";
        }
        field3208 = field3221.toLowerCase();
        try {
            field3210 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3210 = "";
        }
        try {
            field3212 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3212 = "";
        }
        try {
            field3207 = System.getProperty("user.home");
            if (field3207 != null) {
                field3207 = field3207 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3207 == null) {
            field3207 = "~/";
        }
        try {
            this.field3215 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3224 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3224 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3225 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3225 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3218 = false;
        this.field3219 = new Thread(this);
        this.field3219.setPriority(10);
        this.field3219.setDaemon(true);
        this.field3219.start();
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(ILjava/lang/Class;)Lcc;", line = 138)
    public final class474 method1336(int arg0, Class arg1) {
        int var3 = -64 % ((arg0 + 39) / 42);
        return this.method1349(arg1, -8257, 0, 10, 0);
    }

    @OriginalMember(owner = "client!ml", name = "run", descriptor = "()V", line = 147)
    public final void run() {
        while (true) {
            class474 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3218) {
                        return;
                    }
                    if (this.field3205 != null) {
                        var2 = this.field3205;
                        this.field3205 = this.field3205.field6530;
                        if (this.field3205 == null) {
                            this.field3223 = null;
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
                int var3 = var2.field6531;
                if (var3 == 1) {
                    if (class440.method2583(25267) < field3226) {
                        throw new IOException();
                    }
                    var2.field6529 = new Socket(InetAddress.getByName((String) var2.field6532), var2.field6533);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6532);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6533);
                    var2.field6529 = var4;
                } else if (var3 == 4) {
                    if (class440.method2583(25267) < field3226) {
                        throw new IOException();
                    }
                    var2.field6529 = new DataInputStream(((URL) var2.field6532).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field6532;
                    var2.field6529 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field6532;
                    var2.field6529 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6529 = var5.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field6532;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field6534 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6534 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 268)
    public final byte[] method1337(int arg0, String arg1) {
        if (arg0 != -30696) {
            this.method1349((Object) null, -36, -97, 116, -128);
        }
        class474 var3 = this.method1328(0, arg1, true, 21, 0);
        return (byte[]) var3.field6529;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lcc;", line = 288)
    public final class474 method1338(byte arg0) {
        if (arg0 >= -125) {
            this.field3205 = null;
        }
        return this.method1349((Object) null, -8257, 0, 13, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lcc;", line = 303)
    public final class474 method1339(byte arg0, int arg1) {
        int var3 = 43 / ((21 - arg0) / 62);
        return this.method1349((Object) null, -8257, arg1, 3, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZILjava/awt/Component;)Lcc;", line = 315)
    public final class474 method1340(boolean arg0, int arg1, Component arg2) {
        if (arg1 > -88) {
            field3212 = null;
        }
        return this.method1349(arg2, -8257, arg0 ? 1 : 0, 15, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lcc;", line = 326)
    public final class474 method1341(Transferable arg0, int arg1) {
        if (arg1 != 0) {
            field3226 = -121L;
        }
        return this.method1349(arg0, -8257, 0, 19, 0);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 336)
    public final void method1342(byte arg0) {
        field3226 = class440.method2583(25267) + 5000L;
        int var2 = -26 % (-arg0 / 40);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)Lcc;", line = 346)
    public final class474 method1343(String arg0, byte arg1) {
        if (arg1 < 125) {
            field3208 = null;
        }
        return this.method1349(arg0, -8257, 0, 16, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Lcc;", line = 358)
    public final class474 method1344(Class arg0, String arg1, byte arg2) {
        int var4 = -120 / ((arg2 + 12) / 58);
        return this.method1349(new Object[] { arg0, arg1 }, -8257, 0, 9, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Frame;I)Lcc;", line = 368)
    public final class474 method1345(Frame arg0, int arg1) {
        if (arg1 != 12) {
            this.field3217 = null;
        }
        return this.method1349(arg0, -8257, 0, 7, 0);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lfc;", line = 380)
    public final class156 method1346(int arg0) {
        if (arg0 != 16) {
            this.run();
        }
        return this.field3222;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z", line = 394)
    public final boolean method1347(int arg0) {
        if (arg0 != -8719) {
            field3225 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/net/URL;)Lcc;", line = 408)
    public final class474 method1348(boolean arg0, URL arg1) {
        return arg0 ? this.method1349(arg1, -8257, 0, 4, 0) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lcc;", line = 429)
    private final class474 method1349(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class474 var6 = new class474();
        var6.field6532 = arg0;
        var6.field6531 = arg3;
        var6.field6533 = arg2;
        if (arg1 != -8257) {
            this.method1339((byte) 86, -12);
        }
        synchronized (this) {
            if (this.field3223 == null) {
                this.field3223 = this.field3205 = var6;
            } else {
                this.field3223.field6530 = var6;
                this.field3223 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 459)
    public final void method1350(int arg0) {
        synchronized (this) {
            this.field3218 = true;
            this.notifyAll();
        }
        try {
            this.field3219.join();
            if (arg0 != 0) {
                this.field3218 = false;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field3214 != null) {
            try {
                this.field3214.method2748((byte) 117);
            } catch (IOException var7) {
            }
        }
        if (this.field3217 != null) {
            try {
                this.field3217.method2748((byte) 122);
            } catch (IOException var6) {
            }
        }
        if (this.field3220 != null) {
            for (int var3 = 0; var3 < this.field3220.length; var3++) {
                if (this.field3220[var3] != null) {
                    try {
                        this.field3220[var3].method2748((byte) 110);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3206 != null) {
            try {
                this.field3206.method2748((byte) 113);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Runnable;)Lcc;", line = 517)
    public final class474 method1351(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 7000) {
            this.field3223 = null;
        }
        return this.method1349(arg2, -8257, arg0, 2, 0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Point;I[ILjava/awt/Component;I)Lcc;", line = 530)
    public final class474 method1352(int arg0, Point arg1, int arg2, int[] arg3, Component arg4, int arg5) {
        if (arg2 != 0) {
            this.field3214 = null;
        }
        return this.method1349(new Object[] { arg4, arg3, arg1 }, -8257, arg0, 17, arg5);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(ILjava/lang/Class;)Lcc;", line = 541)
    public final class474 method1353(int arg0, Class arg1) {
        return arg0 == 11 ? this.method1349(arg1, -8257, 0, 11, 0) : null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Lcc;", line = 557)
    public final class474 method1354(byte arg0) {
        return arg0 <= 22 ? null : this.method1349((Object) null, -8257, 0, 5, 0);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Lcc;", line = 567)
    public final class474 method1355(byte arg0) {
        if (arg0 != 112) {
            this.method1345((Frame) null, 31);
        }
        return this.method1349((Object) null, -8257, 0, 18, 0);
    }
}
