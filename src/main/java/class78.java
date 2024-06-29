import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class78 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field1291 = null;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Luc;")
    private class115 field1301 = null;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    private boolean field1302 = false;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Luc;")
    private class115 field1295 = null;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lme;")
    public class39 field1292 = null;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lme;")
    public class39 field1305 = null;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lme;")
    public class39 field1304 = null;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1303;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field1298;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1306 = 3;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "J")
    public static volatile long field1310;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lbi;")
    private class214 field1293;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1290;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1294;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1296;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1297;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1299;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1300;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1307;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1308;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1309;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[Lme;")
    public class39[] field1289;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Object;IIII)Luc;")
    private final class115 method625(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class115 var6 = new class115();
        var6.field1935 = arg1;
        var6.field1934 = arg4;
        var6.field1933 = arg0;
        synchronized (this) {
            if (this.field1295 == null) {
                this.field1295 = this.field1301 = var6;
            } else {
                this.field1295.field1938 = var6;
                this.field1295 = var6;
            }
            this.notify();
        }
        int var8 = -17 / ((15 - arg2) / 51);
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;I[II)Luc;")
    public final class115 method626(int arg0, Point arg1, Component arg2, int arg3, int[] arg4, int arg5) {
        return arg0 == 30685 ? this.method625(new Object[] { arg2, arg4, arg1 }, 17, 69, arg5, arg3) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/net/URL;I)Luc;")
    public final class115 method627(URL arg0, int arg1) {
        if (arg1 != 4) {
            this.method638((Class) null, (String) null, true);
        }
        return this.method625(arg0, 4, -53, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class115 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1302) {
                        return;
                    }
                    if (this.field1301 != null) {
                        var2 = this.field1301;
                        this.field1301 = this.field1301.field1938;
                        if (this.field1301 == null) {
                            this.field1295 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var3 = var2.field1935;
                if (var3 == 1) {
                    if (class62.method472(17) < field1310) {
                        throw new IOException();
                    }
                    var2.field1936 = new Socket(InetAddress.getByName((String) var2.field1933), var2.field1934);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1933);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1934);
                    var2.field1936 = var6;
                } else if (var3 == 4) {
                    if (class62.method472(27) < field1310) {
                        throw new IOException();
                    }
                    var2.field1936 = new DataInputStream(((URL) var2.field1933).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1933;
                    var2.field1936 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field1933;
                    var2.field1936 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1937 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1937 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/Runnable;B)Luc;")
    public final class115 method628(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != 82) {
            this.field1301 = null;
        }
        return this.method625(arg1, 2, -63, 0, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Luc;")
    public final class115 method629(int arg0, int arg1) {
        int var3 = 73 % ((arg1 - 20) / 56);
        return this.method625((Object) null, 3, 84, 0, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/awt/Component;Z)Luc;")
    public final class115 method630(boolean arg0, Component arg1, boolean arg2) {
        if (arg0) {
            this.field1291 = null;
        }
        return this.method625(arg1, 15, 120, 0, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILjava/awt/Component;)Luc;")
    public final class115 method631(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg2 == 14 ? this.method625((Object) null, 14, 67, arg1 + var5.y, var5.x + arg0) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;B)Luc;")
    public final class115 method632(String arg0, byte arg1) {
        return arg1 == -111 ? this.method625(arg0, 16, arg1 ^ 0xFFFFFFED, 0, 0) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lbi;")
    public final class214 method633(int arg0) {
        int var2 = 39 % ((77 - arg0) / 48);
        return this.field1293;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Luc;")
    public final class115 method634(String arg0, Class[] arg1, int arg2, Class arg3) {
        if (arg2 != 3) {
            this.field1303 = null;
        }
        return this.method625(new Object[] { arg3, arg0, arg1 }, 8, arg2 ^ 0xFFFFFFC3, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)Luc;")
    public final class115 method635(byte arg0, String arg1) {
        return arg0 <= 125 ? null : this.method625(arg1, 12, 125, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method636(int arg0) {
        field1310 = class62.method472(arg0 + 22) + 5000L;
        if (arg0 != 1) {
            this.method628(-80, (Runnable) null, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;IB)Luc;")
    public final class115 method637(String arg0, int arg1, byte arg2) {
        int var4 = -111 % ((arg2 - 72) / 43);
        return this.method625(arg0, 1, -88, 0, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Luc;")
    public final class115 method638(Class arg0, String arg1, boolean arg2) {
        return arg2 ? null : this.method625(new Object[] { arg0, arg1 }, 9, 124, 0, 0);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final void method639(int arg0) {
        synchronized (this) {
            this.field1302 = true;
            this.notifyAll();
        }
        try {
            this.field1298.join();
            if (arg0 != 0) {
                field1308 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field1305 != null) {
            try {
                this.field1305.method325((byte) -96);
            } catch (IOException var7) {
            }
        }
        if (this.field1292 != null) {
            try {
                this.field1292.method325((byte) -96);
            } catch (IOException var6) {
            }
        }
        if (this.field1289 != null) {
            for (int var3 = 0; var3 < this.field1289.length; var3++) {
                if (this.field1289[var3] != null) {
                    try {
                        this.field1289[var3].method325((byte) -96);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1304 != null) {
            try {
                this.field1304.method325((byte) -96);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class78(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1296 = "1.1";
        field1297 = "Unknown";
        this.field1291 = arg0;
        try {
            field1297 = System.getProperty("java.vendor");
            field1296 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1299 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1299 = "Unknown";
        }
        field1300 = field1299.toLowerCase();
        try {
            field1290 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1290 = "";
        }
        try {
            field1307 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1307 = "";
        }
        try {
            field1294 = System.getProperty("user.home");
            if (field1294 != null) {
                field1294 = field1294 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1294 == null) {
            field1294 = "~/";
        }
        try {
            this.field1303 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1308 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1308 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1309 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1309 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1302 = false;
        this.field1298 = new Thread(this);
        this.field1298.setPriority(10);
        this.field1298.setDaemon(true);
        this.field1298.start();
    }

    static {
        new Hashtable(16);
        field1310 = 0L;
    }
}
