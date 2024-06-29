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

@OriginalClass("client!dq")
public class class14 implements Runnable {

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "La;")
    private class420 field223 = null;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "Lsb;")
    public class169 field227 = null;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field234 = null;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "La;")
    private class420 field235 = null;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "Lsb;")
    public class169 field236 = null;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lsb;")
    public class169 field225 = null;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field239;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field224;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field222 = 3;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "J")
    public static volatile long field238;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Lrj;")
    private class25 field229;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field220;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field221;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Ljava/lang/String;")
    private static String field226;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Ljava/lang/String;")
    public static String field228;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Ljava/lang/String;")
    public static String field230;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "Ljava/lang/String;")
    public static String field231;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Ljava/lang/String;")
    public static String field233;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field237;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field240;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "[Lsb;")
    public class169[] field232;

    static {
        new Hashtable(16);
        field238 = 0L;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Runnable;BI)La;", line = 8)
    public final class420 method115(Runnable arg0, byte arg1, int arg2) {
        return arg1 == 76 ? this.method119(2, arg0, arg2, arg1 - 75, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "run", descriptor = "()V", line = 19)
    public final void run() {
        while (true) {
            class420 var2;
            synchronized (this) {
                while (true) {
                    if (this.field219) {
                        return;
                    }
                    if (this.field235 != null) {
                        var2 = this.field235;
                        this.field235 = this.field235.field5790;
                        if (this.field235 == null) {
                            this.field223 = null;
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
                int var3 = var2.field5792;
                if (var3 == 1) {
                    if (field238 > class193.method1237(-9581)) {
                        throw new IOException();
                    }
                    var2.field5791 = new Socket(InetAddress.getByName((String) var2.field5793), var2.field5788);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field5793);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5788);
                    var2.field5791 = var9;
                } else if (var3 == 4) {
                    if (field238 > class193.method1237(-9581)) {
                        throw new IOException();
                    }
                    var2.field5791 = new DataInputStream(((URL) var2.field5793).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field5793;
                    var2.field5791 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field5793;
                    var2.field5791 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5791 = var4.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field5793;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field5789 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5789 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)La;", line = 142)
    public final class420 method116(int arg0) {
        int var2 = 92 / ((-arg0 - 70) / 33);
        return this.method119(12, (Object) null, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;BII)La;", line = 151)
    public final class420 method117(Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -21) {
            this.method121(122, true, -1, 118, -54);
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method119(14, (Object) null, var5.x + arg3, 1, arg2 + var5.y);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 592)
    public class14(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field220 = "1.1";
        field221 = "Unknown";
        this.field234 = arg0;
        try {
            field221 = System.getProperty("java.vendor");
            field220 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field233 = System.getProperty("os.name");
        } catch (Exception var11) {
            field233 = "Unknown";
        }
        field231 = field233.toLowerCase();
        try {
            field230 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field230 = "";
        }
        try {
            field228 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field228 = "";
        }
        try {
            field226 = System.getProperty("user.home");
            if (field226 != null) {
                field226 = field226 + "/";
            }
        } catch (Exception var8) {
        }
        if (field226 == null) {
            field226 = "~/";
        }
        try {
            this.field239 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field237 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field237 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field240 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field240 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field219 = false;
        this.field224 = new Thread(this);
        this.field224.setPriority(10);
        this.field224.setDaemon(true);
        this.field224.start();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)La;", line = 167)
    public final class420 method118(int arg0, int arg1) {
        if (arg0 != 9434) {
            this.method122(true);
        }
        return this.method119(3, (Object) null, arg1, arg0 ^ 0x24DB, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Object;III)La;", line = 181)
    private final class420 method119(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class420 var6 = new class420();
        var6.field5793 = arg1;
        var6.field5792 = arg0;
        var6.field5788 = arg2;
        synchronized (this) {
            if (this.field223 == null) {
                this.field223 = this.field235 = var6;
            } else {
                this.field223.field5790 = var6;
                this.field223 = var6;
            }
            if (arg3 != 1) {
                this.method142((String) null, (Class) null, false);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/lang/Object;ZI)La;", line = 216)
    private final class420 method120(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        class420 var6 = new class420();
        synchronized (var6) {
            var6.field5788 = arg0;
            var6.field5793 = arg2;
            var6.field5792 = arg4;
            synchronized (this) {
                if (this.field223 == null) {
                    this.field223 = this.field235 = var6;
                } else {
                    this.field223.field5790 = var6;
                    this.field223 = var6;
                }
                if (!arg3) {
                    field226 = null;
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

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZIII)La;", line = 253)
    public final class420 method121(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method129(36);
        }
        return this.method119(6, (Object) null, (arg2 << 16) + arg4, 1, (arg0 << 16) + arg3);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)Z", line = 265)
    public final boolean method122(boolean arg0) {
        if (arg0) {
            field221 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)La;", line = 279)
    public final class420 method123(boolean arg0) {
        if (arg0) {
            this.method120(-18, 38, (Object) null, true, 50);
        }
        return this.method119(13, (Object) null, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 290)
    public final void method124(byte arg0) {
        synchronized (this) {
            this.field219 = true;
            this.notifyAll();
        }
        try {
            this.field224.join();
        } catch (InterruptedException var8) {
        }
        if (this.field225 != null) {
            try {
                this.field225.method1044(true);
            } catch (IOException var7) {
            }
        }
        if (this.field236 != null) {
            try {
                this.field236.method1044(true);
            } catch (IOException var6) {
            }
        }
        if (arg0 != -107) {
            this.field224 = null;
        }
        if (this.field232 != null) {
            for (int var3 = 0; var3 < this.field232.length; var3++) {
                if (this.field232[var3] != null) {
                    try {
                        this.field232[var3].method1044(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field227 != null) {
            try {
                this.field227.method1044(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;I)La;", line = 346)
    public final class420 method125(byte arg0, String arg1, int arg2) {
        return arg0 <= 6 ? null : this.method119(1, arg1, arg2, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 357)
    public final byte[] method126(String arg0, int arg1) {
        class420 var3 = this.method120(0, 0, arg0, true, arg1);
        return (byte[]) var3.field5791;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/net/URL;B)La;", line = 366)
    public final class420 method127(URL arg0, byte arg1) {
        return arg1 == 105 ? this.method119(4, arg0, 0, 1, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Class;I)La;", line = 377)
    public final class420 method128(Class arg0, int arg1) {
        if (arg1 != 0) {
            field233 = null;
        }
        return this.method119(10, arg0, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 389)
    public final void method129(int arg0) {
        field238 = class193.method1237(-9581) + 5000L;
        if (arg0 != -26348) {
            this.field234 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)La;", line = 407)
    public final class420 method130(byte arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 >= -81) {
            this.field227 = null;
        }
        return this.method119(8, new Object[] { arg3, arg1, arg2 }, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;BZ)La;", line = 422)
    public final class420 method131(Component arg0, byte arg1, boolean arg2) {
        return arg1 == -4 ? this.method119(15, arg0, arg2 ? 1 : 0, 1, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Ljava/lang/String;I)La;", line = 432)
    public final class420 method132(String arg0, int arg1) {
        if (arg1 != 0) {
            field230 = null;
        }
        return this.method119(16, arg0, 0, arg1 ^ 0x1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)La;", line = 446)
    public final class420 method133(int arg0, Transferable arg1) {
        if (arg0 != 0) {
            field222 = 44;
        }
        return this.method119(19, arg1, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/awt/Component;I[ILjava/awt/Point;)La;", line = 458)
    public final class420 method134(int arg0, int arg1, Component arg2, int arg3, int[] arg4, Point arg5) {
        int var7 = -32 % ((-arg1 - 61) / 56);
        return this.method119(17, new Object[] { arg2, arg4, arg5 }, arg3, 1, arg0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)Lrj;", line = 471)
    public final class25 method135(byte arg0) {
        if (arg0 != 27) {
            field221 = null;
        }
        return this.field229;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Class;Z)La;", line = 482)
    public final class420 method136(Class arg0, boolean arg1) {
        return arg1 ? this.method119(11, arg0, 0, 1, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)La;", line = 498)
    public final class420 method137(Frame arg0, int arg1) {
        if (arg1 != -1614) {
            this.method134(-30, 28, (Component) null, 14, (int[]) null, (Point) null);
        }
        return this.method119(7, arg0, 0, arg1 + 1615, 0);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)La;", line = 517)
    public final class420 method138(int arg0) {
        if (arg0 != 12) {
            field238 = 61L;
        }
        return this.method119(5, (Object) null, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)La;", line = 528)
    public final class420 method139(boolean arg0) {
        return arg0 ? this.method119(18, (Object) null, 0, 1, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Ljava/lang/Class;I)La;", line = 539)
    public final class420 method140(Class arg0, int arg1) {
        if (arg1 != 28191) {
            field222 = 79;
        }
        return this.method119(20, arg0, 0, 1, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)La;", line = 554)
    public final class420 method141(byte arg0, String arg1) {
        if (arg0 != -108) {
            field231 = null;
        }
        return this.method119(21, arg1, 0, arg0 + 109, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)La;", line = 564)
    public final class420 method142(String arg0, Class arg1, boolean arg2) {
        return arg2 ? null : this.method119(9, new Object[] { arg1, arg0 }, 0, 1, 0);
    }
}
