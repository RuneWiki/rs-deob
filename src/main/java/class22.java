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

@OriginalClass("client!rj")
public class class22 implements Runnable {

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lon;")
    public class81 field246 = null;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lon;")
    public class81 field252 = null;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lon;")
    public class81 field256 = null;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Lvd;")
    private class153 field260 = null;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Z")
    private boolean field259 = false;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field254 = null;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Lvd;")
    private class153 field261 = null;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field244;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field245;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field253 = 3;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "J")
    public static volatile long field263;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lik;")
    private class286 field250;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field247;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field248;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field249;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field251;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/lang/String;")
    private static String field255;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field258;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field262;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field264;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field265;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "[Lon;")
    public class81[] field257;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Class;)Lvd;", line = 7)
    public final class153 method153(int arg0, Class arg1) {
        if (arg0 != 27520) {
            this.method153(-111, (Class) null);
        }
        return this.method174(10, 0, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([ILjava/awt/Point;Ljava/awt/Component;III)Lvd;", line = 21)
    public final class153 method154(int[] arg0, Point arg1, Component arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 15) {
            this.method176(false);
        }
        return this.method174(17, arg3, (byte) -94, new Object[] { arg2, arg0, arg1 }, arg5);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 518)
    public class22(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field254 = arg0;
        field248 = "1.1";
        field249 = "Unknown";
        try {
            field249 = System.getProperty("java.vendor");
            field248 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field258 = System.getProperty("os.name");
        } catch (Exception var19) {
            field258 = "Unknown";
        }
        field262 = field258.toLowerCase();
        try {
            field251 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field251 = "";
        }
        try {
            field247 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field247 = "";
        }
        try {
            field255 = System.getProperty("user.home");
            if (field255 != null) {
                field255 = field255 + "/";
            }
        } catch (Exception var16) {
        }
        if (field255 == null) {
            field255 = "~/";
        }
        try {
            this.field244 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field264 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field264 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field265 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field265 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field259 = false;
        this.field245 = new Thread(this);
        this.field245.setPriority(10);
        this.field245.setDaemon(true);
        this.field245.start();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lvd;", line = 35)
    public final class153 method155(int arg0, Runnable arg1, int arg2) {
        if (arg2 != -3) {
            field247 = (String) null;
        }
        return this.method174(2, arg0, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lvd;", line = 50)
    public final class153 method156(int arg0, Component arg1, boolean arg2) {
        return arg0 == 0 ? this.method174(15, arg2 ? 1 : 0, (byte) -94, arg1, 0) : (class153) null;
    }

    @OriginalMember(owner = "client!rj", name = "run", descriptor = "()V", line = 63)
    public final void run() {
        while (true) {
            class153 var2;
            synchronized (this) {
                while (true) {
                    if (this.field259) {
                        return;
                    }
                    if (this.field260 != null) {
                        var2 = this.field260;
                        this.field260 = this.field260.field2424;
                        if (this.field260 == null) {
                            this.field261 = null;
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
                int var5 = var2.field2423;
                if (var5 == 1) {
                    if (class9.method57(-14133) < field263) {
                        throw new IOException();
                    }
                    var2.field2421 = new Socket(InetAddress.getByName((String) var2.field2420), var2.field2422);
                } else if (var5 == 2) {
                    Thread var11 = new Thread((Runnable) var2.field2420);
                    var11.setDaemon(true);
                    var11.start();
                    var11.setPriority(var2.field2422);
                    var2.field2421 = var11;
                } else if (var5 == 4) {
                    if (field263 > class9.method57(-14133)) {
                        throw new IOException();
                    }
                    var2.field2421 = new DataInputStream(((URL) var2.field2420).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2420);
                    var2.field2421 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2420);
                    var2.field2421 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var5 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2421 = var8.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var9 = (Transferable) var2.field2420;
                    Clipboard var10 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var10.setContents(var9, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field2419 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field2419 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Lvd;", line = 180)
    public final class153 method157(int arg0) {
        return arg0 > -126 ? (class153) null : this.method174(5, 0, (byte) -94, (Object) null, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)Lvd;", line = 191)
    public final class153 method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 6) {
            this.method164((URL) null, -36);
        }
        return this.method174(6, (arg2 << 16) + arg3, (byte) -94, (Object) null, (arg1 << 16) + arg4);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lvd;", line = 201)
    public final class153 method159(byte arg0, String arg1, Class arg2) {
        if (arg0 <= 58) {
            this.method162(true, (Class) null);
        }
        return this.method174(9, 0, (byte) -94, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Class;I)Lvd;", line = 212)
    public final class153 method160(Class arg0, int arg1) {
        if (arg1 != 11) {
            this.method166((byte) 97, (String) null, 30);
        }
        return this.method174(11, 0, (byte) -94, arg0, 0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 223)
    public final void method161(int arg0) {
        if (arg0 == 11191) {
            field263 = class9.method57(-14133) + 5000L;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLjava/lang/Class;)Lvd;", line = 234)
    public final class153 method162(boolean arg0, Class arg1) {
        if (!arg0) {
            this.method173(5);
        }
        return this.method174(20, 0, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 244)
    public final void method163(int arg0) {
        synchronized (this) {
            this.field259 = true;
            int var3 = 95 / ((arg0 + 38) / 54);
            this.notifyAll();
        }
        try {
            this.field245.join();
        } catch (InterruptedException var15) {
        }
        if (this.field256 != null) {
            try {
                this.field256.method532((byte) 124);
            } catch (IOException var14) {
            }
        }
        if (this.field246 != null) {
            try {
                this.field246.method532((byte) 101);
            } catch (IOException var13) {
            }
        }
        if (this.field257 != null) {
            for (int var8 = 0; var8 < this.field257.length; var8++) {
                if (this.field257[var8] != null) {
                    try {
                        this.field257[var8].method532((byte) 122);
                    } catch (IOException var12) {
                    }
                }
            }
        }
        if (this.field252 != null) {
            try {
                this.field252.method532((byte) 98);
            } catch (IOException var11) {
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/net/URL;I)Lvd;", line = 297)
    public final class153 method164(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.field259 = false;
        }
        return this.method174(4, 0, (byte) -94, arg0, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lvd;", line = 310)
    public final class153 method165(byte arg0, Transferable arg1) {
        int var3 = 104 / ((arg0 - 67) / 44);
        return this.method174(19, 0, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;I)Lvd;", line = 319)
    public final class153 method166(byte arg0, String arg1, int arg2) {
        int var4 = -123 % ((-arg0) / 58);
        return this.method174(1, arg2, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)Lvd;", line = 328)
    public final class153 method167(String arg0, int arg1) {
        return arg1 == 7 ? this.method174(12, 0, (byte) -94, arg0, 0) : (class153) null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Frame;)Lvd;", line = 340)
    public final class153 method168(int arg0, Frame arg1) {
        if (arg0 >= -99) {
            this.field256 = (class81) null;
        }
        return this.method174(7, 0, (byte) -94, arg1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Ljava/lang/String;I)Lvd;", line = 352)
    public final class153 method169(String arg0, int arg1) {
        if (arg1 != 0) {
            this.run();
        }
        return this.method174(16, 0, (byte) -94, arg0, 0);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z", line = 372)
    public final boolean method170(int arg0) {
        if (arg0 != 0) {
            field264 = (Method) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lvd;", line = 387)
    public final class153 method171(String arg0, Class arg1, Class[] arg2, int arg3) {
        return arg3 <= 72 ? (class153) null : this.method174(8, 0, (byte) -94, new Object[] { arg1, arg0, arg2 }, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;II)Lvd;", line = 409)
    public final class153 method172(int arg0, Component arg1, int arg2, int arg3) {
        int var5 = 78 % ((-arg0 - 79) / 36);
        Point var6 = arg1.getLocationOnScreen();
        return this.method174(14, arg3 + var6.x, (byte) -94, (Object) null, var6.y + arg2);
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)Lik;", line = 420)
    public final class286 method173(int arg0) {
        return arg0 == 0 ? this.field250 : (class286) null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lvd;", line = 441)
    private final class153 method174(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        if (arg2 != -94) {
            this.field244 = (EventQueue) null;
        }
        class153 var6 = new class153();
        var6.field2423 = arg0;
        var6.field2420 = arg3;
        var6.field2422 = arg1;
        synchronized (this) {
            if (this.field261 == null) {
                this.field261 = this.field260 = var6;
            } else {
                this.field261.field2424 = var6;
                this.field261 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lvd;", line = 484)
    public final class153 method175(int arg0, int arg1) {
        if (arg1 >= -33) {
            this.method161(73);
        }
        return this.method174(3, arg0, (byte) -94, (Object) null, 0);
    }

    static {
        new Hashtable(16);
        field263 = 0L;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Lvd;", line = 508)
    public final class153 method176(boolean arg0) {
        return arg0 ? (class153) null : this.method174(18, 0, (byte) -94, (Object) null, 0);
    }
}
