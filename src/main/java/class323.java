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

@OriginalClass("client!ua")
public class class323 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Luh;")
    private class95 field4963 = null;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
    private boolean field4974 = false;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Luh;")
    private class95 field4967 = null;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lhe;")
    public class5 field4960 = null;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lhe;")
    public class5 field4973 = null;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field4975 = null;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lhe;")
    public class5 field4972 = null;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4976;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field4959;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4971 = 3;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "J")
    public static volatile long field4979;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lbo;")
    private class269 field4964;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4961;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4962;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4965;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4966;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Ljava/lang/String;")
    private static String field4968;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4969;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4977;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4978;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4980;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lhe;")
    public class5[] field4970;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method2271(int arg0) {
        if (arg0 != -30627) {
            this.method2274(-98);
        }
        return false;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/Object;IIB)Luh;", line = 27)
    private final class95 method2272(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 10) {
            return (class95) null;
        }
        class95 var6 = new class95();
        var6.field1444 = arg0;
        var6.field1445 = arg3;
        var6.field1448 = arg1;
        synchronized (this) {
            if (this.field4963 == null) {
                this.field4963 = this.field4967 = var6;
            } else {
                this.field4963.field1449 = var6;
                this.field4963 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 56)
    public final void method2273(int arg0) {
        field4979 = class156.method1273((byte) -64) + 5000L;
        if (arg0 >= -52) {
            field4969 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)Luh;", line = 67)
    public final class95 method2274(int arg0) {
        return arg0 == 0 ? this.method2272(0, (Object) null, 0, 5, (byte) 20) : (class95) null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/Class;I)Luh;", line = 77)
    public final class95 method2275(Class arg0, int arg1) {
        if (arg1 != 20) {
            this.method2273(-38);
        }
        return this.method2272(0, arg0, 0, 20, (byte) 44);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/lang/Class;)Luh;", line = 90)
    public final class95 method2276(boolean arg0, Class arg1) {
        return arg0 ? (class95) null : this.method2272(0, arg1, 0, 10, (byte) 126);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)Lbo;", line = 101)
    public final class269 method2277(int arg0) {
        if (arg0 != 15) {
            this.method2281((Frame) null, (byte) 49);
        }
        return this.field4964;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;Z)Luh;", line = 114)
    public final class95 method2278(String arg0, boolean arg1) {
        if (arg1) {
            field4961 = (String) null;
        }
        return this.method2272(0, arg0, 0, 12, (byte) 33);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Luh;", line = 128)
    public final class95 method2279(boolean arg0, Transferable arg1) {
        return arg0 ? this.method2272(0, arg1, 0, 19, (byte) 71) : (class95) null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Luh;", line = 138)
    public final class95 method2280(int arg0, Class arg1, String arg2) {
        return arg0 == 24491 ? this.method2272(0, new Object[] { arg1, arg2 }, 0, 9, (byte) 64) : (class95) null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Frame;B)Luh;", line = 150)
    public final class95 method2281(Frame arg0, byte arg1) {
        if (arg1 > -73) {
            this.field4964 = (class269) null;
        }
        return this.method2272(0, arg0, 0, 7, (byte) 60);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/net/URL;)Luh;", line = 164)
    public final class95 method2282(byte arg0, URL arg1) {
        int var3 = 7 % ((arg0 + 52) / 55);
        return this.method2272(0, arg1, 0, 4, (byte) 89);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/Component;Z)Luh;", line = 179)
    public final class95 method2283(int arg0, Component arg1, boolean arg2) {
        if (arg0 != -30126) {
            this.field4963 = (class95) null;
        }
        return this.method2272(arg2 ? 1 : 0, arg1, 0, 15, (byte) 75);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/String;)Luh;", line = 194)
    public final class95 method2284(byte arg0, String arg1) {
        return arg0 >= -84 ? (class95) null : this.method2272(0, arg1, 0, 16, (byte) 105);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)Luh;", line = 206)
    public final class95 method2285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 == 8 ? this.method2272((arg3 << 16) + arg1, (Object) null, (arg4 << 16) + arg2, 6, (byte) 28) : (class95) null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 511)
    public class323(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4969 = "1.1";
        field4966 = "Unknown";
        this.field4975 = arg0;
        try {
            field4966 = System.getProperty("java.vendor");
            field4969 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field4965 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4965 = "Unknown";
        }
        field4961 = field4965.toLowerCase();
        try {
            field4977 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4977 = "";
        }
        try {
            field4962 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4962 = "";
        }
        try {
            field4968 = System.getProperty("user.home");
            if (field4968 != null) {
                field4968 = field4968 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4968 == null) {
            field4968 = "~/";
        }
        try {
            this.field4976 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field4980 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4980 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field4978 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4978 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field4974 = false;
        this.field4959 = new Thread(this);
        this.field4959.setPriority(10);
        this.field4959.setDaemon(true);
        this.field4959.start();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Luh;", line = 221)
    public final class95 method2286(Class[] arg0, byte arg1, String arg2, Class arg3) {
        int var5 = 76 % ((arg1 - 58) / 40);
        return this.method2272(0, new Object[] { arg3, arg2, arg0 }, 0, 8, (byte) 41);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/Component;II)Luh;", line = 233)
    public final class95 method2287(int arg0, Component arg1, int arg2, int arg3) {
        if (arg3 == -24780) {
            Point var5 = arg1.getLocationOnScreen();
            return this.method2272(var5.x + arg0, (Object) null, var5.y + arg2, 14, (byte) 49);
        } else {
            return (class95) null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;II)Luh;", line = 245)
    public final class95 method2288(String arg0, int arg1, int arg2) {
        int var4 = -105 / ((-arg2 - 58) / 62);
        return this.method2272(arg1, arg0, 0, 1, (byte) 69);
    }

    static {
        new Hashtable(16);
        field4979 = 0L;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/Class;)Luh;", line = 257)
    public final class95 method2289(byte arg0, Class arg1) {
        if (arg0 > -69) {
            field4961 = (String) null;
        }
        return this.method2272(0, arg1, 0, 11, (byte) 18);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/Runnable;I)Luh;", line = 274)
    public final class95 method2290(byte arg0, Runnable arg1, int arg2) {
        if (arg0 >= -84) {
            this.field4970 = (class5[]) null;
        }
        return this.method2272(arg2, arg1, 0, 2, (byte) 19);
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Luh;", line = 291)
    public final class95 method2291(int arg0) {
        int var2 = 84 % ((12 - arg0) / 56);
        return this.method2272(0, (Object) null, 0, 18, (byte) 87);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Luh;", line = 300)
    public final class95 method2292(int[] arg0, int arg1, int arg2, Component arg3, Point arg4, int arg5) {
        if (arg5 != 17) {
            this.method2276(false, (Class) null);
        }
        return this.method2272(arg2, new Object[] { arg3, arg0, arg4 }, arg1, 17, (byte) 19);
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V", line = 318)
    public final void run() {
        while (true) {
            class95 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4974) {
                        return;
                    }
                    if (this.field4967 != null) {
                        var2 = this.field4967;
                        this.field4967 = this.field4967.field1449;
                        if (this.field4967 == null) {
                            this.field4963 = null;
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
                int var5 = var2.field1445;
                if (var5 == 1) {
                    if (class156.method1273((byte) -123) < field4979) {
                        throw new IOException();
                    }
                    var2.field1446 = new Socket(InetAddress.getByName((String) var2.field1448), var2.field1444);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1448);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1444);
                    var2.field1446 = var6;
                } else if (var5 == 4) {
                    if (class156.method1273((byte) -83) < field4979) {
                        throw new IOException();
                    }
                    var2.field1446 = new DataInputStream(((URL) var2.field1448).openStream());
                } else if (var5 == 8) {
                    Object[] var11 = (Object[]) ((Object[]) var2.field1448);
                    var2.field1446 = ((Class) var11[0]).getDeclaredMethod((String) var11[1], (Class[]) ((Class[]) var11[2]));
                } else if (var5 == 9) {
                    Object[] var10 = (Object[]) ((Object[]) var2.field1448);
                    var2.field1446 = ((Class) var10[0]).getDeclaredField((String) var10[1]);
                } else if (var5 == 18) {
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1446 = var9.getContents((Object) null);
                } else if (var5 == 19) {
                    Transferable var7 = (Transferable) var2.field1448;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field1447 = 1;
            } catch (ThreadDeath var14) {
                throw var14;
            } catch (Throwable var15) {
                var2.field1447 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 439)
    public final void method2293(int arg0) {
        synchronized (this) {
            this.field4974 = true;
            this.notifyAll();
        }
        try {
            this.field4959.join();
            if (arg0 != 0) {
                this.run();
            }
        } catch (InterruptedException var14) {
        }
        if (this.field4973 != null) {
            try {
                this.field4973.method37(0);
            } catch (IOException var13) {
            }
        }
        if (this.field4972 != null) {
            try {
                this.field4972.method37(0);
            } catch (IOException var12) {
            }
        }
        if (this.field4970 != null) {
            for (int var7 = 0; var7 < this.field4970.length; var7++) {
                if (this.field4970[var7] != null) {
                    try {
                        this.field4970[var7].method37(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4960 != null) {
            try {
                this.field4960.method37(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)Luh;", line = 503)
    public final class95 method2294(byte arg0, int arg1) {
        if (arg0 > -121) {
            this.method2294((byte) 22, 17);
        }
        return this.method2272(arg1, (Object) null, 0, 3, (byte) 81);
    }
}
