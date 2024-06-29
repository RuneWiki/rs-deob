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

@OriginalClass("client!wd")
public class class36 implements Runnable {

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
    private boolean field506 = false;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Ltj;")
    private class429 field514 = null;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Ltj;")
    private class429 field515 = null;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lim;")
    public class350 field505 = null;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lim;")
    public class350 field504 = null;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lim;")
    public class350 field510 = null;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field519 = null;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field509;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field512;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field511 = 3;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "J")
    public static volatile long field523;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lci;")
    private class387 field517;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field503;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field507;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljava/lang/String;")
    private static String field508;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field513;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field516;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field518;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field520;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field521;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field522;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[Lim;")
    public class350[] field502;

    static {
        new Hashtable(16);
        field523 = 0L;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLjava/awt/Component;II)Ltj;", line = 7)
    public final class429 method240(boolean arg0, Component arg1, int arg2, int arg3) {
        if (arg0) {
            Point var5 = arg1.getLocationOnScreen();
            return this.method255((Object) null, 14, var5.x + arg2, arg3 - -var5.y, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "run", descriptor = "()V", line = 19)
    public final void run() {
        while (true) {
            class429 var2;
            synchronized (this) {
                while (true) {
                    if (this.field506) {
                        return;
                    }
                    if (this.field514 != null) {
                        var2 = this.field514;
                        this.field514 = this.field514.field6305;
                        if (this.field514 == null) {
                            this.field515 = null;
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
                int var3 = var2.field6310;
                if (var3 == 1) {
                    if (class114.method735(98) < field523) {
                        throw new IOException();
                    }
                    var2.field6309 = new Socket(InetAddress.getByName((String) var2.field6306), var2.field6307);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6306);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6307);
                    var2.field6309 = var4;
                } else if (var3 == 4) {
                    if (class114.method735(105) < field523) {
                        throw new IOException();
                    }
                    var2.field6309 = new DataInputStream(((URL) var2.field6306).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field6306;
                    var2.field6309 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field6306;
                    var2.field6309 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6309 = var9.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field6306;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field6308 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6308 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Ltj;", line = 141)
    public final class429 method241(int arg0, int arg1) {
        int var3 = 85 % ((61 - arg0) / 59);
        return this.method255((Object) null, 3, arg1, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Ltj;", line = 151)
    public final class429 method242(Runnable arg0, byte arg1, int arg2) {
        if (arg1 != -102) {
            this.method265(32);
        }
        return this.method255(arg0, 2, arg2, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Ltj;", line = 164)
    public final class429 method243(int arg0) {
        if (arg0 != 0) {
            this.field512 = null;
        }
        return this.method255((Object) null, 13, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Class;I)Ltj;", line = 175)
    public final class429 method244(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.method252(115);
        }
        return this.method255(arg0, 20, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBI)Ltj;", line = 185)
    public final class429 method245(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 55) {
            field513 = null;
        }
        return this.method255((Object) null, 6, (arg0 << 16) + arg2, (arg1 << 16) + arg4, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Frame;B)Ltj;", line = 198)
    public final class429 method246(Frame arg0, byte arg1) {
        if (arg1 != -90) {
            field508 = null;
        }
        return this.method255(arg0, 7, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 213)
    public final void method247(boolean arg0) {
        if (arg0) {
            field523 = class114.method735(104) + 5000L;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 586)
    public class36(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field507 = "Unknown";
        this.field519 = arg0;
        field518 = "1.1";
        try {
            field507 = System.getProperty("java.vendor");
            field518 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field503 = System.getProperty("os.name");
        } catch (Exception var11) {
            field503 = "Unknown";
        }
        field516 = field503.toLowerCase();
        try {
            field513 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field513 = "";
        }
        try {
            field520 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field520 = "";
        }
        try {
            field508 = System.getProperty("user.home");
            if (field508 != null) {
                field508 = field508 + "/";
            }
        } catch (Exception var8) {
        }
        if (field508 == null) {
            field508 = "~/";
        }
        try {
            this.field509 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field522 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field522 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field521 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field521 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field506 = false;
        this.field512 = new Thread(this);
        this.field512.setPriority(10);
        this.field512.setDaemon(true);
        this.field512.start();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)Ltj;", line = 229)
    public final class429 method248(String arg0, int arg1) {
        int var3 = 84 / ((-arg1 - 40) / 47);
        return this.method255(arg0, 16, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/net/URL;I)Ltj;", line = 240)
    public final class429 method249(URL arg0, int arg1) {
        if (arg1 >= -68) {
            field513 = null;
        }
        return this.method255(arg0, 4, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lci;", line = 251)
    public final class387 method250(byte arg0) {
        if (arg0 >= -72) {
            this.field509 = null;
        }
        return this.field517;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/String;I)Ltj;", line = 262)
    public final class429 method251(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field506 = false;
        }
        return this.method255(arg0, 21, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 278)
    public final void method252(int arg0) {
        if (arg0 != -32636) {
            this.method259((Class) null, (byte) 79, (Class[]) null, (String) null);
        }
        synchronized (this) {
            this.field506 = true;
            this.notifyAll();
        }
        try {
            this.field512.join();
        } catch (InterruptedException var8) {
        }
        if (this.field505 != null) {
            try {
                this.field505.method2304(-17644);
            } catch (IOException var7) {
            }
        }
        if (this.field504 != null) {
            try {
                this.field504.method2304(arg0 + 14992);
            } catch (IOException var6) {
            }
        }
        if (this.field502 != null) {
            for (int var3 = 0; var3 < this.field502.length; var3++) {
                if (this.field502[var3] != null) {
                    try {
                        this.field502[var3].method2304(-17644);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field510 != null) {
            try {
                this.field510.method2304(-17644);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/Class;I)Ltj;", line = 333)
    public final class429 method253(Class arg0, int arg1) {
        if (arg1 != 10000) {
            field516 = null;
        }
        return this.method255(arg0, 11, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 345)
    public final byte[] method254(String arg0, boolean arg1) {
        class429 var3 = this.method264(arg0, 21, 8, 0, 0);
        if (arg1) {
            field523 = 86L;
        }
        return (byte[]) var3.field6309;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Object;IIIZ)Ltj;", line = 357)
    private final class429 method255(Object arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            this.method260(-122, (byte) 89, (int[]) null, 32, (Point) null, (Component) null);
        }
        class429 var6 = new class429();
        var6.field6306 = arg0;
        var6.field6307 = arg2;
        var6.field6310 = arg1;
        synchronized (this) {
            if (this.field515 == null) {
                this.field515 = this.field514 = var6;
            } else {
                this.field515.field6305 = var6;
                this.field515 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Ltj;", line = 391)
    public final class429 method256(int arg0) {
        return arg0 == 1503 ? this.method255((Object) null, 5, 0, 0, true) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ltj;", line = 404)
    public final class429 method257(int arg0, String arg1, Class arg2) {
        if (arg0 != 9) {
            this.method243(-28);
        }
        return this.method255(new Object[] { arg2, arg1 }, 9, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Ltj;", line = 414)
    public final class429 method258(Transferable arg0, boolean arg1) {
        if (arg1) {
            this.field505 = null;
        }
        return this.method255(arg0, 19, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Ltj;", line = 424)
    public final class429 method259(Class arg0, byte arg1, Class[] arg2, String arg3) {
        if (arg1 != 67) {
            this.method244((Class) null, 90);
        }
        return this.method255(new Object[] { arg0, arg3, arg2 }, 8, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB[IILjava/awt/Point;Ljava/awt/Component;)Ltj;", line = 443)
    public final class429 method260(int arg0, byte arg1, int[] arg2, int arg3, Point arg4, Component arg5) {
        if (arg1 != -125) {
            field511 = -100;
        }
        return this.method255(new Object[] { arg5, arg2, arg4 }, 17, arg3, arg0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/lang/String;)Ltj;", line = 454)
    public final class429 method261(int arg0, int arg1, String arg2) {
        if (arg0 != -5159) {
            this.field504 = null;
        }
        return this.method255(arg2, 1, arg1, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Ltj;", line = 464)
    public final class429 method262(int arg0) {
        return arg0 == 0 ? this.method255((Object) null, 18, 0, 0, true) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;IZ)Ltj;", line = 486)
    public final class429 method263(Component arg0, int arg1, boolean arg2) {
        int var4 = 8 % ((44 - arg1) / 48);
        return this.method255(arg0, 15, arg2 ? 1 : 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ltj;", line = 502)
    private final class429 method264(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class429 var6 = new class429();
        synchronized (var6) {
            var6.field6307 = arg3;
            if (arg2 != 8) {
                this.method244((Class) null, -87);
            }
            var6.field6306 = arg0;
            var6.field6310 = arg1;
            synchronized (this) {
                if (this.field515 == null) {
                    this.field515 = this.field514 = var6;
                } else {
                    this.field515.field6305 = var6;
                    this.field515 = var6;
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

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Z", line = 539)
    public final boolean method265(int arg0) {
        if (arg0 != 18) {
            field507 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ltj;", line = 567)
    public final class429 method266(byte arg0) {
        if (arg0 != 44) {
            field522 = null;
        }
        return this.method255((Object) null, 12, 0, 0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/Class;)Ltj;", line = 577)
    public final class429 method267(byte arg0, Class arg1) {
        int var3 = -80 % ((arg0 - 48) / 40);
        return this.method255(arg1, 10, 0, 0, true);
    }
}
