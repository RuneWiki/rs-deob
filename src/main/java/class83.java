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

@OriginalClass("client!ci")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lff;")
    public class305 field1371 = null;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lnd;")
    private class191 field1372 = null;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lff;")
    public class305 field1370 = null;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lff;")
    public class305 field1377 = null;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
    private boolean field1376 = false;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lnd;")
    private class191 field1379 = null;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field1380 = null;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1367;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1364;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field1378 = 3;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "J")
    public static volatile long field1383;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Lgi;")
    private class39 field1369;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1363;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1365;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1368;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1373;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1374;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1375;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1381;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1382;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1384;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[Lff;")
    public class305[] field1366;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLjava/awt/Component;I)Lnd;")
    public final class191 method570(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            this.field1377 = null;
        }
        return this.method571(15, arg1, arg2 ^ 0xFFFFFF80, 0, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class191 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1376) {
                        return;
                    }
                    if (this.field1372 != null) {
                        var2 = this.field1372;
                        this.field1372 = this.field1372.field3090;
                        if (this.field1372 == null) {
                            this.field1379 = null;
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
                int var3 = var2.field3088;
                if (var3 == 1) {
                    if (field1383 > class188.method1355(80)) {
                        throw new IOException();
                    }
                    var2.field3089 = new Socket(InetAddress.getByName((String) var2.field3086), var2.field3087);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field3086);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field3087);
                    var2.field3089 = var9;
                } else if (var3 == 4) {
                    if (field1383 > class188.method1355(-121)) {
                        throw new IOException();
                    }
                    var2.field3089 = new DataInputStream(((URL) var2.field3086).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3086;
                    var2.field3089 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3086;
                    var2.field3089 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3089 = var8.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3086;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, (ClipboardOwner) null);
                } else {
                    throw new Exception();
                }
                var2.field3091 = 1;
            } catch (ThreadDeath var13) {
                throw var13;
            } catch (Throwable var14) {
                var2.field3091 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/Object;III)Lnd;")
    private final class191 method571(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class191 var6 = new class191();
        var6.field3087 = arg4;
        var6.field3086 = arg1;
        var6.field3088 = arg0;
        synchronized (this) {
            if (this.field1379 == null) {
                this.field1379 = this.field1372 = var6;
            } else {
                this.field1379.field3090 = var6;
                this.field1379 = var6;
            }
            this.notify();
        }
        if (arg2 >= -115) {
            field1373 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLjava/lang/String;)Lnd;")
    public final class191 method572(int arg0, byte arg1, String arg2) {
        if (arg1 != -111) {
            this.method583((byte) 38, (Runnable) null, 34);
        }
        return this.method571(1, arg2, arg1 - 15, 0, arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lnd;")
    public final class191 method573(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1366 = null;
        }
        return this.method571(3, (Object) null, -116, 0, arg1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/Class;)Lnd;")
    public final class191 method574(byte arg0, Class arg1) {
        return arg0 == 19 ? this.method571(20, arg1, -120, 0, 0) : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/net/URL;Z)Lnd;")
    public final class191 method575(URL arg0, boolean arg1) {
        if (!arg1) {
            this.field1369 = null;
        }
        return this.method571(4, arg0, -126, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lnd;")
    public final class191 method576(int arg0) {
        return arg0 >= -63 ? null : this.method571(18, (Object) null, -116, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/Class;B)Lnd;")
    public final class191 method577(Class arg0, byte arg1) {
        if (arg1 != 87) {
            this.method583((byte) 5, (Runnable) null, -114);
        }
        return this.method571(11, arg0, -122, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lgi;")
    public final class39 method578(int arg0) {
        if (arg0 != -8492) {
            field1381 = null;
        }
        return this.field1369;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lnd;")
    public final class191 method579(int arg0, Transferable arg1) {
        if (arg0 != 19) {
            this.field1380 = null;
        }
        return this.method571(19, arg1, -116, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lnd;")
    public final class191 method580(Class arg0, String arg1, boolean arg2) {
        return arg2 ? null : this.method571(9, new Object[] { arg0, arg1 }, -118, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public final void method581(int arg0) {
        synchronized (this) {
            this.field1376 = true;
            this.notifyAll();
        }
        try {
            if (arg0 >= -123) {
                return;
            }
            this.field1364.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1377 != null) {
            try {
                this.field1377.method2070((byte) -116);
            } catch (IOException var7) {
            }
        }
        if (this.field1370 != null) {
            try {
                this.field1370.method2070((byte) -108);
            } catch (IOException var6) {
            }
        }
        if (this.field1366 != null) {
            for (int var3 = 0; var3 < this.field1366.length; var3++) {
                if (this.field1366[var3] != null) {
                    try {
                        this.field1366[var3].method2070((byte) -125);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1371 != null) {
            try {
                this.field1371.method2070((byte) 124);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;III[ILjava/awt/Point;)Lnd;")
    public final class191 method582(Component arg0, int arg1, int arg2, int arg3, int[] arg4, Point arg5) {
        if (arg1 != -22925) {
            this.method584((String) null, (Class) null, 103, (Class[]) null);
        }
        return this.method571(17, new Object[] { arg0, arg4, arg5 }, -116, arg3, arg2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lnd;")
    public final class191 method583(byte arg0, Runnable arg1, int arg2) {
        int var4 = 125 % ((62 - arg0) / 44);
        return this.method571(2, arg1, -127, 0, arg2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lnd;")
    public final class191 method584(String arg0, Class arg1, int arg2, Class[] arg3) {
        if (arg2 != 0) {
            this.method580((Class) null, (String) null, false);
        }
        return this.method571(8, new Object[] { arg1, arg0, arg3 }, -125, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)Lnd;")
    public final class191 method585(byte arg0, String arg1) {
        if (arg0 < 114) {
            this.method583((byte) 65, (Runnable) null, 44);
        }
        return this.method571(16, arg1, -118, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;B)Lnd;")
    public final class191 method586(String arg0, byte arg1) {
        if (arg1 > -24) {
            field1363 = null;
        }
        return this.method571(12, arg0, -122, 0, 0);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public final void method587(int arg0) {
        field1383 = class188.method1355(56) + (long) arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lnd;")
    public final class191 method588(Component arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method571(14, (Object) null, -116, var5.y + arg1, var5.x + arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class83(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1380 = arg0;
        field1375 = "Unknown";
        field1368 = "1.1";
        try {
            field1375 = System.getProperty("java.vendor");
            field1368 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1365 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1365 = "Unknown";
        }
        field1374 = field1365.toLowerCase();
        try {
            field1373 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1373 = "";
        }
        try {
            field1363 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1363 = "";
        }
        try {
            field1381 = System.getProperty("user.home");
            if (field1381 != null) {
                field1381 = field1381 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1381 == null) {
            field1381 = "~/";
        }
        try {
            this.field1367 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1384 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1384 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1382 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1382 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1376 = false;
        this.field1364 = new Thread(this);
        this.field1364.setPriority(10);
        this.field1364.setDaemon(true);
        this.field1364.start();
    }

    static {
        new Hashtable(16);
        field1383 = 0L;
    }
}
