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

@OriginalClass("client!ca")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "Z")
    private boolean field1275 = false;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lqc;")
    public class4 field1280 = null;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lqc;")
    public class4 field1278 = null;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field1273 = null;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lbh;")
    private class239 field1274 = null;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lqc;")
    public class4 field1269 = null;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lbh;")
    private class239 field1282 = null;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1283;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field1271;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field1286 = 3;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "J")
    public static volatile long field1288;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lpe;")
    private class85 field1277;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1270;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1272;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1279;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1281;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1284;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1285;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1287;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1289;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1290;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[Lqc;")
    public class4[] field1276;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZLjava/awt/Component;)Lbh;")
    public final class239 method548(int arg0, boolean arg1, Component arg2) {
        if (arg0 <= 50) {
            field1281 = null;
        }
        return this.method551(15, arg2, 0, false, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lbh;")
    public final class239 method549(byte arg0, Class arg1, String arg2) {
        if (arg0 != 47) {
            this.field1269 = null;
        }
        return this.method551(9, new Object[] { arg1, arg2 }, 0, false, 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;II)Lbh;")
    public final class239 method550(String arg0, int arg1, int arg2) {
        if (arg1 != 32606) {
            this.method554((URL) null, 31);
        }
        return this.method551(1, arg0, 0, false, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/Object;IZI)Lbh;")
    private final class239 method551(int arg0, Object arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method555(-42, (Point) null, (Component) null, -58, (int[]) null, -26);
        }
        class239 var6 = new class239();
        var6.field3586 = arg1;
        var6.field3584 = arg4;
        var6.field3587 = arg0;
        synchronized (this) {
            if (this.field1282 == null) {
                this.field1282 = this.field1274 = var6;
            } else {
                this.field1282.field3583 = var6;
                this.field1282 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class239 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1275) {
                        return;
                    }
                    if (this.field1274 != null) {
                        var2 = this.field1274;
                        this.field1274 = this.field1274.field3583;
                        if (this.field1274 == null) {
                            this.field1282 = null;
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
                int var3 = var2.field3587;
                if (var3 == 1) {
                    if (field1288 > class287.method1928(27332)) {
                        throw new IOException();
                    }
                    var2.field3585 = new Socket(InetAddress.getByName((String) var2.field3586), var2.field3584);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3586);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3584);
                    var2.field3585 = var4;
                } else if (var3 == 4) {
                    if (class287.method1928(27332) < field1288) {
                        throw new IOException();
                    }
                    var2.field3585 = new DataInputStream(((URL) var2.field3586).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3586;
                    var2.field3585 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3586;
                    var2.field3585 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3588 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3588 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BIILjava/awt/Component;)Lbh;")
    public final class239 method552(byte arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg0 == 19 ? this.method551(14, (Object) null, var5.y + arg1, false, arg2 + var5.x) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lbh;")
    public final class239 method553(Runnable arg0, boolean arg1, int arg2) {
        return arg1 ? null : this.method551(2, arg0, 0, false, arg2);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/net/URL;I)Lbh;")
    public final class239 method554(URL arg0, int arg1) {
        return arg1 == 0 ? this.method551(4, arg0, 0, false, 0) : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Point;Ljava/awt/Component;I[II)Lbh;")
    public final class239 method555(int arg0, Point arg1, Component arg2, int arg3, int[] arg4, int arg5) {
        if (arg5 != 17) {
            field1286 = 49;
        }
        return this.method551(17, new Object[] { arg2, arg4, arg1 }, arg3, false, arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)Lbh;")
    public final class239 method556(boolean arg0, int arg1) {
        if (arg0) {
            this.method556(true, -35);
        }
        return this.method551(3, (Object) null, 0, false, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/lang/String;)Lbh;")
    public final class239 method557(byte arg0, String arg1) {
        if (arg0 <= 66) {
            this.method558(-121);
        }
        return this.method551(16, arg1, 0, false, 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lpe;")
    public final class85 method558(int arg0) {
        if (arg0 != 16) {
            this.field1275 = true;
        }
        return this.field1277;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;)Lbh;")
    public final class239 method559(int arg0, String arg1) {
        if (arg0 != 12) {
            this.field1283 = null;
        }
        return this.method551(12, arg1, 0, false, 0);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method560(int arg0) {
        field1288 = class287.method1928(27332) + 5000L;
        if (arg0 != 5000) {
            this.method551(46, (Object) null, -73, false, 98);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lbh;")
    public final class239 method561(int arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 != 0) {
            this.method553((Runnable) null, false, 59);
        }
        return this.method551(8, new Object[] { arg2, arg1, arg3 }, 0, false, 0);
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class83(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1272 = "1.1";
        this.field1273 = arg0;
        field1279 = "Unknown";
        try {
            field1279 = System.getProperty("java.vendor");
            field1272 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1285 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1285 = "Unknown";
        }
        field1270 = field1285.toLowerCase();
        try {
            field1281 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1281 = "";
        }
        try {
            field1284 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1284 = "";
        }
        try {
            field1287 = System.getProperty("user.home");
            if (field1287 != null) {
                field1287 = field1287 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1287 == null) {
            field1287 = "~/";
        }
        try {
            this.field1283 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1290 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1290 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1289 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1289 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1275 = false;
        this.field1271 = new Thread(this);
        this.field1271.setPriority(10);
        this.field1271.setDaemon(true);
        this.field1271.start();
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method562(int arg0) {
        synchronized (this) {
            if (arg0 < 96) {
                return;
            }
            this.field1275 = true;
            this.notifyAll();
        }
        try {
            this.field1271.join();
        } catch (InterruptedException var10) {
        }
        if (this.field1280 != null) {
            try {
                this.field1280.method50(1);
            } catch (IOException var9) {
            }
        }
        if (this.field1278 != null) {
            try {
                this.field1278.method50(1);
            } catch (IOException var8) {
            }
        }
        if (this.field1276 != null) {
            for (int var3 = 0; var3 < this.field1276.length; var3++) {
                if (this.field1276[var3] != null) {
                    try {
                        this.field1276[var3].method50(1);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field1269 != null) {
            try {
                this.field1269.method50(1);
            } catch (IOException var6) {
            }
        }
    }

    static {
        new Hashtable(16);
        field1288 = 0L;
    }
}
