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

@OriginalClass("client!ud")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lan;")
    public class377 field18 = null;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lan;")
    public class377 field27 = null;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
    private boolean field15 = false;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lor;")
    private class296 field23 = null;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field29 = null;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lan;")
    public class377 field26 = null;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lor;")
    private class296 field28 = null;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field31;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field14;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field22 = 3;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "J")
    public static volatile long field32;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lmf;")
    private class14 field16;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
    public static String field13;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/lang/String;")
    public static String field17;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Ljava/lang/String;")
    public static String field19;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Ljava/lang/String;")
    public static String field20;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Ljava/lang/String;")
    public static String field21;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Ljava/lang/String;")
    private static String field24;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljava/lang/String;")
    public static String field30;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field33;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field34;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[Lan;")
    public class377[] field25;

    static {
        new Hashtable(16);
        field32 = 0L;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lor;", line = 5)
    public final class296 method4(int arg0) {
        if (arg0 != 16389) {
            field20 = null;
        }
        return this.method8(1774773648, 0, (Object) null, 13, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/Class;I)Lor;", line = 15)
    public final class296 method5(Class arg0, int arg1) {
        return arg1 == 10 ? this.method8(1774773648, 0, arg0, 10, 0) : null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lor;", line = 28)
    public final class296 method6(byte arg0, String arg1, Class arg2) {
        if (arg0 <= 70) {
            field17 = null;
        }
        return this.method8(1774773648, 0, new Object[] { arg2, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IILjava/awt/Point;ILjava/awt/Component;I)Lor;", line = 39)
    public final class296 method7(int[] arg0, int arg1, Point arg2, int arg3, Component arg4, int arg5) {
        return arg5 >= -121 ? null : this.method8(1774773648, arg1, new Object[] { arg4, arg0, arg2 }, 17, arg3);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/Object;II)Lor;", line = 56)
    private final class296 method8(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class296 var6 = new class296();
        if (arg0 != 1774773648) {
            return null;
        }
        var6.field4260 = arg1;
        var6.field4261 = arg3;
        var6.field4263 = arg2;
        synchronized (this) {
            if (this.field28 == null) {
                this.field28 = this.field23 = var6;
            } else {
                this.field28.field4264 = var6;
                this.field28 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/net/URL;)Lor;", line = 87)
    public final class296 method9(byte arg0, URL arg1) {
        if (arg0 != 91) {
            this.method13((String) null, (Class[]) null, -15, (Class) null);
        }
        return this.method8(1774773648, 0, arg1, 4, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lor;", line = 102)
    public final class296 method10(int arg0, Transferable arg1) {
        if (arg0 > -94) {
            this.field23 = null;
        }
        return this.method8(1774773648, 0, arg1, 19, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/Object;III)Lor;", line = 113)
    private final class296 method11(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class296 var6 = new class296();
        synchronized (var6) {
            var6.field4261 = arg4;
            var6.field4260 = arg0;
            var6.field4263 = arg1;
            synchronized (this) {
                if (this.field28 == null) {
                    this.field28 = this.field23 = var6;
                } else {
                    this.field28.field4264 = var6;
                    this.field28 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
        }
        return arg2 == 0 ? var6 : null;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Lmf;", line = 150)
    public final class14 method12(int arg0) {
        return arg0 == -2 ? this.field16 : null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lor;", line = 160)
    public final class296 method13(String arg0, Class[] arg1, int arg2, Class arg3) {
        if (arg2 >= -19) {
            this.field14 = null;
        }
        return this.method8(1774773648, 0, new Object[] { arg3, arg0, arg1 }, 8, 0);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 512)
    public class2(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field29 = arg0;
        field13 = "Unknown";
        field30 = "1.1";
        try {
            field13 = System.getProperty("java.vendor");
            field30 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field20 = System.getProperty("os.name");
        } catch (Exception var11) {
            field20 = "Unknown";
        }
        field17 = field20.toLowerCase();
        try {
            field19 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field19 = "";
        }
        try {
            field21 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field21 = "";
        }
        try {
            field24 = System.getProperty("user.home");
            if (field24 != null) {
                field24 = field24 + "/";
            }
        } catch (Exception var8) {
        }
        if (field24 == null) {
            field24 = "~/";
        }
        try {
            this.field31 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field33 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field33 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field34 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field34 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field15 = false;
        this.field14 = new Thread(this);
        this.field14.setPriority(10);
        this.field14.setDaemon(true);
        this.field14.start();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;BI)Lor;", line = 173)
    public final class296 method14(String arg0, byte arg1, int arg2) {
        if (arg1 < 113) {
            this.method8(-8, -84, (Object) null, -78, -26);
        }
        return this.method8(1774773648, arg2, arg0, 1, 0);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z", line = 188)
    public final boolean method15(int arg0) {
        if (arg0 != 1774773648) {
            this.field14 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Frame;I)Lor;", line = 206)
    public final class296 method16(Frame arg0, int arg1) {
        if (arg1 < 109) {
            field21 = null;
        }
        return this.method8(1774773648, 0, arg0, 7, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;I)Lor;", line = 221)
    public final class296 method17(String arg0, int arg1) {
        return arg1 < 80 ? null : this.method8(1774773648, 0, arg0, 16, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)Lor;", line = 240)
    public final class296 method18(byte arg0, int arg1) {
        if (arg0 != -26) {
            field24 = null;
        }
        return this.method8(arg0 + 1774773674, arg1, (Object) null, 3, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/String;)Lor;", line = 257)
    public final class296 method19(byte arg0, String arg1) {
        if (arg0 <= 59) {
            this.method16((Frame) null, 27);
        }
        return this.method8(1774773648, 0, arg1, 21, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 269)
    public final byte[] method20(String arg0, boolean arg1) {
        class296 var3 = this.method11(0, arg0, 0, 0, 21);
        if (arg1) {
            this.field29 = null;
        }
        return (byte[]) var3.field4262;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(Ljava/lang/Class;I)Lor;", line = 281)
    public final class296 method21(Class arg0, int arg1) {
        return arg1 < 56 ? null : this.method8(1774773648, 0, arg0, 11, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)Lor;", line = 291)
    public final class296 method22(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -37) {
            this.method20((String) null, true);
        }
        return this.method8(arg2 + 1774773685, (arg0 << 16) + arg4, (Object) null, 6, (arg3 << 16) + arg1);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Lor;", line = 304)
    public final class296 method23(int arg0) {
        if (arg0 != 5929) {
            field34 = null;
        }
        return this.method8(arg0 + 1774767719, 0, (Object) null, 18, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLjava/awt/Component;I)Lor;", line = 317)
    public final class296 method24(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            this.method11(-65, (Object) null, 124, 117, -56);
        }
        return this.method8(arg2 ^ 0x69C8E590, arg0 ? 1 : 0, arg1, 15, 0);
    }

    @OriginalMember(owner = "client!ud", name = "run", descriptor = "()V", line = 327)
    public final void run() {
        while (true) {
            class296 var2;
            synchronized (this) {
                while (true) {
                    if (this.field15) {
                        return;
                    }
                    if (this.field23 != null) {
                        var2 = this.field23;
                        this.field23 = this.field23.field4264;
                        if (this.field23 == null) {
                            this.field28 = null;
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
                int var3 = var2.field4261;
                if (var3 == 1) {
                    if (class55.method375(-3913) < field32) {
                        throw new IOException();
                    }
                    var2.field4262 = new Socket(InetAddress.getByName((String) var2.field4263), var2.field4260);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4263);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4260);
                    var2.field4262 = var4;
                } else if (var3 == 4) {
                    if (class55.method375(-3913) < field32) {
                        throw new IOException();
                    }
                    var2.field4262 = new DataInputStream(((URL) var2.field4263).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4263;
                    var2.field4262 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4263;
                    var2.field4262 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4262 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field4263;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field4259 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4259 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lor;", line = 446)
    public final class296 method25(byte arg0, Runnable arg1, int arg2) {
        if (arg0 != 107) {
            this.field27 = null;
        }
        return this.method8(1774773648, arg2, arg1, 2, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILjava/awt/Component;)Lor;", line = 459)
    public final class296 method26(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 == 14) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method8(1774773648, var5.x + arg2, (Object) null, 14, var5.y + arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/lang/Class;)Lor;", line = 474)
    public final class296 method27(int arg0, Class arg1) {
        int var3 = -125 / ((arg0 + 13) / 51);
        return this.method8(1774773648, 0, arg1, 20, 0);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Lor;", line = 489)
    public final class296 method28(int arg0) {
        if (arg0 != -1) {
            this.method9((byte) -12, (URL) null);
        }
        return this.method8(1774773648, 0, (Object) null, 12, 0);
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 592)
    public final void method29(int arg0) {
        if (arg0 == 10) {
            field32 = class55.method375(-3913) + 5000L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 602)
    public final void method30(int arg0) {
        synchronized (this) {
            this.field15 = true;
            this.notifyAll();
        }
        try {
            this.field14.join();
        } catch (InterruptedException var8) {
        }
        if (this.field27 != null) {
            try {
                this.field27.method2499(1);
            } catch (IOException var7) {
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field18 != null) {
            try {
                this.field18.method2499(1);
            } catch (IOException var6) {
            }
        }
        if (this.field25 != null) {
            for (int var3 = 0; var3 < this.field25.length; var3++) {
                if (this.field25[var3] != null) {
                    try {
                        this.field25[var3].method2499(1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field26 != null) {
            try {
                this.field26.method2499(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)Lor;", line = 665)
    public final class296 method31(int arg0) {
        if (arg0 != 14) {
            this.method9((byte) 88, (URL) null);
        }
        return this.method8(1774773648, 0, (Object) null, 5, 0);
    }
}
