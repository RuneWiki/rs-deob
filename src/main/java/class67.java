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

@OriginalClass("client!af")
public class class67 implements Runnable {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field1306 = null;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Ljj;")
    private class103 field1309 = null;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Ljj;")
    private class103 field1316 = null;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Laa;")
    public class165 field1321 = null;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Laa;")
    public class165 field1317 = null;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Laa;")
    public class165 field1319 = null;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Z")
    private boolean field1322 = false;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1318;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field1312;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1311 = 3;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lik;")
    private class248 field1304;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1305;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1307;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1308;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1313;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1314;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1315;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1320;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1323;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1324;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[Laa;")
    public class165[] field1310;

    @OriginalMember(owner = "client!af", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1322) {
                        return;
                    }
                    if (this.field1316 != null) {
                        var2 = this.field1316;
                        this.field1316 = this.field1316.field1827;
                        if (this.field1316 == null) {
                            this.field1309 = null;
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
                int var3 = var2.field1828;
                if (var3 == 1) {
                    var2.field1826 = new Socket(InetAddress.getByName((String) var2.field1825), var2.field1824);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1825);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1824);
                    var2.field1826 = var4;
                } else if (var3 == 4) {
                    var2.field1826 = new DataInputStream(((URL) var2.field1825).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1825;
                    var2.field1826 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1825;
                    var2.field1826 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1823 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1823 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;III)Ljj;")
    public final class103 method541(Component arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -9752) {
            field1324 = null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method544((Object) null, arg3 + var5.y, var5.x + arg1, 14, -120);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Runnable;II)Ljj;")
    public final class103 method542(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1322 = false;
        }
        return this.method544(arg0, 0, arg2, 2, -119);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;IB)Ljj;")
    public final class103 method543(String arg0, int arg1, byte arg2) {
        if (arg2 >= -103) {
            this.field1316 = null;
        }
        return this.method544(arg0, 0, arg1, 1, -127);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ljj;")
    private final class103 method544(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class103 var6 = new class103();
        int var7 = -11 % ((arg4 + 66) / 52);
        var6.field1828 = arg3;
        var6.field1824 = arg2;
        var6.field1825 = arg0;
        synchronized (this) {
            if (this.field1309 == null) {
                this.field1309 = this.field1316 = var6;
            } else {
                this.field1309.field1827 = var6;
                this.field1309 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lik;")
    public final class248 method545(int arg0) {
        if (arg0 != 27104) {
            this.field1310 = null;
        }
        return this.field1304;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Ljj;")
    public final class103 method546(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method542((Runnable) null, -12, 49);
        }
        return this.method544((Object) null, 0, arg0, 3, 119);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljj;")
    public final class103 method547(Class arg0, int arg1, String arg2) {
        return arg1 == 4765 ? this.method544(new Object[] { arg0, arg2 }, 0, 0, 9, -122) : null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;I)Ljj;")
    public final class103 method548(String arg0, int arg1) {
        return arg1 <= 92 ? null : this.method544(arg0, 0, 0, 12, -121);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z[Ljava/lang/Class;)Ljj;")
    public final class103 method549(String arg0, Class arg1, boolean arg2, Class[] arg3) {
        return arg2 ? null : this.method544(new Object[] { arg1, arg0, arg3 }, 0, 0, 8, 26);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/net/URL;)Ljj;")
    public final class103 method550(int arg0, URL arg1) {
        if (arg0 >= -22) {
            field1305 = null;
        }
        return this.method544(arg1, 0, 0, 4, 55);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLjava/awt/Component;)Ljj;")
    public final class103 method551(int arg0, boolean arg1, Component arg2) {
        if (arg0 != -8427) {
            this.method552((byte) -8);
        }
        return this.method544(arg2, 0, arg1 ? 1 : 0, 15, -118);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public final void method552(byte arg0) {
        synchronized (this) {
            this.field1322 = true;
            this.notifyAll();
        }
        try {
            this.field1312.join();
            if (arg0 != -12) {
                field1313 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field1319 != null) {
            try {
                this.field1319.method1153((byte) -11);
            } catch (IOException var7) {
            }
        }
        if (this.field1321 != null) {
            try {
                this.field1321.method1153((byte) -11);
            } catch (IOException var6) {
            }
        }
        if (this.field1310 != null) {
            for (int var3 = 0; var3 < this.field1310.length; var3++) {
                if (this.field1310[var3] != null) {
                    try {
                        this.field1310[var3].method1153((byte) -11);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1317 != null) {
            try {
                this.field1317.method1153((byte) -11);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Ljava/lang/String;I)Ljj;")
    public final class103 method553(String arg0, int arg1) {
        int var3 = 67 % ((arg1 + 37) / 41);
        return this.method544(arg0, 0, 0, 16, -120);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class67(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1305 = "1.1";
        this.field1306 = arg0;
        field1313 = "Unknown";
        try {
            field1313 = System.getProperty("java.vendor");
            field1305 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1314 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1314 = "Unknown";
        }
        field1320 = field1314.toLowerCase();
        try {
            field1315 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1315 = "";
        }
        try {
            field1308 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1308 = "";
        }
        try {
            field1307 = System.getProperty("user.home");
            if (field1307 != null) {
                field1307 = field1307 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1307 == null) {
            field1307 = "~/";
        }
        try {
            this.field1318 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1323 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1323 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1324 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1324 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1322 = false;
        this.field1312 = new Thread(this);
        this.field1312.setPriority(10);
        this.field1312.setDaemon(true);
        this.field1312.start();
    }

    static {
        new Hashtable(16);
    }
}
