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

@OriginalClass("client!de")
public class class364 implements Runnable {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lcs;")
    public class408 field5374 = null;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lcs;")
    public class408 field5380 = null;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lvc;")
    private class225 field5383 = null;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field5381 = null;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lcs;")
    public class408 field5389 = null;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Z")
    private boolean field5385 = false;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lvc;")
    private class225 field5393 = null;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5390;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field5373;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field5387 = 3;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "J")
    public static volatile long field5392;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lla;")
    private class221 field5377;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/lang/String;")
    private static String field5375;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5376;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5378;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5379;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5384;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5386;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5388;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5391;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5394;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[Lcs;")
    public class408[] field5382;

    static {
        new Hashtable(16);
        field5392 = 0L;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lvc;", line = 4)
    public final class225 method2384(byte arg0, Transferable arg1) {
        return arg0 > -94 ? null : this.method2387(arg1, 0, 0, 19, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;)Lvc;", line = 15)
    public final class225 method2385(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            field5394 = null;
        }
        return this.method2387(arg2, 0, 0, 1, arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIILjava/lang/Object;)Lvc;", line = 34)
    private final class225 method2386(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class225 var6 = new class225();
        synchronized (var6) {
            var6.field3106 = arg1;
            var6.field3103 = arg2;
            var6.field3102 = arg4;
            synchronized (this) {
                if (this.field5383 == null) {
                    this.field5383 = this.field5393 = var6;
                } else {
                    this.field5383.field3107 = var6;
                    this.field5383 = var6;
                }
                if (arg0 != -41) {
                    field5388 = null;
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

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lvc;", line = 74)
    private final class225 method2387(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class225 var6 = new class225();
        var6.field3102 = arg0;
        var6.field3106 = arg3;
        var6.field3103 = arg4;
        synchronized (this) {
            if (this.field5383 == null) {
                this.field5383 = this.field5393 = var6;
            } else {
                this.field5383.field3107 = var6;
                this.field5383 = var6;
            }
            this.notify();
            if (arg1 != 0) {
                this.method2389(69);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 106)
    public final void method2388(int arg0) {
        synchronized (this) {
            this.field5385 = true;
            if (arg0 != 0) {
                this.field5377 = null;
            }
            this.notifyAll();
        }
        try {
            this.field5373.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5374 != null) {
            try {
                this.field5374.method2584((byte) -108);
            } catch (IOException var7) {
            }
        }
        if (this.field5380 != null) {
            try {
                this.field5380.method2584((byte) -89);
            } catch (IOException var6) {
            }
        }
        if (this.field5382 != null) {
            for (int var3 = 0; var3 < this.field5382.length; var3++) {
                if (this.field5382[var3] != null) {
                    try {
                        this.field5382[var3].method2584((byte) -75);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5389 != null) {
            try {
                this.field5389.method2584((byte) -56);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lvc;", line = 161)
    public final class225 method2389(int arg0) {
        if (arg0 != 0) {
            this.field5393 = null;
        }
        return this.method2387((Object) null, 0, 0, 12, 0);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 589)
    public class364(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field5381 = arg0;
        field5386 = "Unknown";
        field5376 = "1.1";
        try {
            field5386 = System.getProperty("java.vendor");
            field5376 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5388 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5388 = "Unknown";
        }
        field5378 = field5388.toLowerCase();
        try {
            field5384 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5384 = "";
        }
        try {
            field5379 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5379 = "";
        }
        try {
            field5375 = System.getProperty("user.home");
            if (field5375 != null) {
                field5375 = field5375 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5375 == null) {
            field5375 = "~/";
        }
        try {
            this.field5390 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5394 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5394 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5391 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5391 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5385 = false;
        this.field5373 = new Thread(this);
        this.field5373.setPriority(10);
        this.field5373.setDaemon(true);
        this.field5373.start();
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z", line = 185)
    public final boolean method2390(int arg0) {
        return arg0 > -43;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Frame;I)Lvc;", line = 199)
    public final class225 method2391(Frame arg0, int arg1) {
        int var3 = 98 % ((arg1 - 26) / 33);
        return this.method2387(arg0, 0, 0, 7, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lvc;", line = 212)
    public final class225 method2392(int arg0, String arg1, Class arg2) {
        if (arg0 != 9236) {
            this.field5380 = null;
        }
        return this.method2387(new Object[] { arg2, arg1 }, 0, 0, 9, 0);
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V", line = 224)
    public final void run() {
        while (true) {
            class225 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5385) {
                        return;
                    }
                    if (this.field5393 != null) {
                        var2 = this.field5393;
                        this.field5393 = this.field5393.field3107;
                        if (this.field5393 == null) {
                            this.field5383 = null;
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
                int var3 = var2.field3106;
                if (var3 == 1) {
                    if (class98.method768((byte) -111) < field5392) {
                        throw new IOException();
                    }
                    var2.field3105 = new Socket(InetAddress.getByName((String) var2.field3102), var2.field3103);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3102);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3103);
                    var2.field3105 = var4;
                } else if (var3 == 4) {
                    if (field5392 > class98.method768((byte) 40)) {
                        throw new IOException();
                    }
                    var2.field3105 = new DataInputStream(((URL) var2.field3102).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3102;
                    var2.field3105 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field3102;
                    var2.field3105 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3105 = var8.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3102;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3104 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3104 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 349)
    public final byte[] method2393(String arg0, boolean arg1) {
        if (!arg1) {
            this.field5393 = null;
        }
        class225 var3 = this.method2386((byte) -41, 21, 0, 0, arg0);
        return (byte[]) var3.field3105;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Component;ILjava/awt/Point;I[I)Lvc;", line = 362)
    public final class225 method2394(int arg0, Component arg1, int arg2, Point arg3, int arg4, int[] arg5) {
        if (arg2 < 88) {
            this.method2409(false);
        }
        return this.method2387(new Object[] { arg1, arg5, arg3 }, 0, arg4, 17, arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/awt/Component;II)Lvc;", line = 372)
    public final class225 method2395(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg0 == 4949 ? this.method2387((Object) null, arg0 ^ 0x1355, arg3 + var5.y, 14, var5.x + arg2) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Lvc;", line = 384)
    public final class225 method2396(boolean arg0) {
        return arg0 ? this.method2387((Object) null, 0, 0, 13, 0) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lvc;", line = 394)
    public final class225 method2397(Runnable arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method2384((byte) -83, (Transferable) null);
        }
        return this.method2387(arg0, 0, 0, 2, arg2);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Lvc;", line = 405)
    public final class225 method2398(boolean arg0, int arg1) {
        if (!arg0) {
            field5387 = -61;
        }
        return this.method2387((Object) null, 0, 0, 3, arg1);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/net/URL;I)Lvc;", line = 415)
    public final class225 method2399(URL arg0, int arg1) {
        return arg1 == 10000 ? this.method2387(arg0, 0, 0, 4, 0) : null;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 426)
    public final void method2400(int arg0) {
        if (arg0 >= -70) {
            field5378 = null;
        }
        field5392 = class98.method768((byte) 29) + 5000L;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)Lvc;", line = 444)
    public final class225 method2401(int arg0, String arg1) {
        if (arg0 < 73) {
            this.field5389 = null;
        }
        return this.method2387(arg1, 0, 0, 16, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;I)Lvc;", line = 457)
    public final class225 method2402(Class arg0, int arg1) {
        return arg1 == 0 ? this.method2387(arg0, 0, 0, 10, 0) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIB)Lvc;", line = 468)
    public final class225 method2403(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = 62 / ((-arg4 - 21) / 43);
        return this.method2387((Object) null, 0, (arg1 << 16) + arg0, 6, (arg3 << 16) + arg2);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;I)Lvc;", line = 477)
    public final class225 method2404(String arg0, int arg1) {
        if (arg1 > -47) {
            field5378 = null;
        }
        return this.method2387(arg0, 0, 0, 21, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLjava/lang/Class;)Lvc;", line = 488)
    public final class225 method2405(boolean arg0, Class arg1) {
        return arg0 ? this.method2387(arg1, 0, 0, 11, 0) : null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Ljava/lang/Class;I)Lvc;", line = 498)
    public final class225 method2406(Class arg0, int arg1) {
        if (arg1 != 13) {
            this.field5373 = null;
        }
        return this.method2387(arg0, 0, 0, 20, 0);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)Lvc;", line = 509)
    public final class225 method2407(int arg0) {
        if (arg0 != 7782) {
            this.field5381 = null;
        }
        return this.method2387((Object) null, 0, 0, 18, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;Z)Lvc;", line = 519)
    public final class225 method2408(String arg0, Class arg1, Class[] arg2, boolean arg3) {
        return arg3 ? null : this.method2387(new Object[] { arg1, arg0, arg2 }, 0, 0, 8, 0);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)Lla;", line = 542)
    public final class221 method2409(boolean arg0) {
        return arg0 ? null : this.field5377;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Lvc;", line = 558)
    public final class225 method2410(byte arg0) {
        int var2 = 61 % ((-arg0 - 16) / 51);
        return this.method2387((Object) null, 0, 0, 5, 0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BZLjava/awt/Component;)Lvc;", line = 568)
    public final class225 method2411(byte arg0, boolean arg1, Component arg2) {
        int var4 = -105 % ((arg0 + 11) / 36);
        return this.method2387(arg2, 0, 0, 15, arg1 ? 1 : 0);
    }
}
