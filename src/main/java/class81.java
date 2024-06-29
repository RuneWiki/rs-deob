import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Loj;")
    public class155 field1469 = null;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lhj;")
    private class69 field1462 = null;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lhj;")
    private class69 field1475 = null;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Loj;")
    public class155 field1474 = null;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field1478 = null;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "Loj;")
    public class155 field1476 = null;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "Z")
    private boolean field1483 = false;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/lang/String;")
    private String field1471;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1461;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[Loj;")
    public class155[] field1470;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field1460;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1464 = 3;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1465 = new Hashtable(16);

    @OriginalMember(owner = "client!b", name = "h", descriptor = "La;")
    private class46 field1467;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1463;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1466;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/lang/String;")
    private static String field1468;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1472;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1477;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1479;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1480;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1481;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1482;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/net/URL;)Lhj;")
    public final class69 method551(boolean arg0, URL arg1) {
        if (arg0) {
            field1466 = null;
        }
        return this.method564(0, 4, arg1, 105, 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Ljava/io/File;")
    private static final File method552(String arg0, byte arg1, String arg2, int arg3) {
        File var4 = (File) field1465.get(arg0);
        if (var4 != null) {
            return var4;
        } else if (arg1 > -41) {
            return null;
        } else {
            String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1468, "/tmp/", "" };
            String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
            for (int var7 = 0; var7 < 2; var7++) {
                for (int var8 = 0; var8 < var6.length; var8++) {
                    for (int var9 = 0; var9 < var5.length; var9++) {
                        String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
                        RandomAccessFile var11 = null;
                        try {
                            File var12 = new File(var10);
                            if (var7 != 0 || var12.exists()) {
                                String var13 = var5[var9];
                                if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                    (new File(var5[var9] + var6[var8])).mkdir();
                                    if (arg2 != null) {
                                        (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                    }
                                    var11 = new RandomAccessFile(var12, "rw");
                                    int var14 = var11.read();
                                    var11.seek(0L);
                                    var11.write(var14);
                                    var11.seek(0L);
                                    var11.close();
                                    field1465.put(arg0, var12);
                                    return var12;
                                }
                            }
                        } catch (Exception var17) {
                            try {
                                if (var11 != null) {
                                    var11.close();
                                    Object var15 = null;
                                }
                            } catch (Exception var16) {
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBILjava/awt/Component;)Lhj;")
    public final class69 method553(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 != 106) {
            this.method563((Class) null, (String) null, 97, (Class[]) null);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method564(arg2 + var5.y, 14, (Object) null, 118, var5.x + arg0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/String;)Lhj;")
    public final class69 method554(byte arg0, String arg1) {
        if (arg0 != 73) {
            field1472 = null;
        }
        return this.method564(0, 12, arg1, 112, 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/lang/Runnable;)Lhj;")
    public final class69 method555(int arg0, int arg1, Runnable arg2) {
        if (arg0 != -26915) {
            field1477 = null;
        }
        return this.method564(0, 2, arg2, arg0 ^ 0xFFFF96A4, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lhj;")
    public final class69 method556(String arg0, Class arg1, int arg2) {
        return arg2 == 3 ? this.method564(0, 9, new Object[] { arg1, arg0 }, 107, 0) : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)Lhj;")
    public final class69 method557(String arg0, int arg1) {
        if (arg1 < 83) {
            field1480 = null;
        }
        return this.method564(0, 16, arg0, 112, 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lhj;")
    public final class69 method558(Component arg0, byte arg1, boolean arg2) {
        return arg1 == -68 ? this.method564(0, 15, arg0, 117, arg2 ? 1 : 0) : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BILjava/lang/String;)Lhj;")
    public final class69 method559(byte arg0, int arg1, String arg2) {
        if (arg0 != 60) {
            this.method558((Component) null, (byte) 24, true);
        }
        return this.method564(0, 1, arg2, 119, arg1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)La;")
    public final class46 method560(byte arg0) {
        if (arg0 != 75) {
            field1465 = null;
        }
        return this.field1467;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method561(int arg0) {
        synchronized (this) {
            this.field1483 = true;
            this.notifyAll();
        }
        try {
            this.field1460.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1469 != null) {
            try {
                this.field1469.method1018(true);
            } catch (IOException var7) {
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field1474 != null) {
            try {
                this.field1474.method1018(true);
            } catch (IOException var6) {
            }
        }
        if (this.field1470 != null) {
            for (int var3 = 0; var3 < this.field1470.length; var3++) {
                if (this.field1470[var3] != null) {
                    try {
                        this.field1470[var3].method1018(true);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1476 != null) {
            try {
                this.field1476.method1018(true);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Class;I)Lhj;")
    public final class69 method562(Class arg0, int arg1) {
        return arg1 == 0 ? this.method564(0, 11, arg0, 115, 0) : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lhj;")
    public final class69 method563(Class arg0, String arg1, int arg2, Class[] arg3) {
        if (arg2 < 111) {
            this.method562((Class) null, 42);
        }
        return this.method564(0, 8, new Object[] { arg0, arg1, arg3 }, 125, 0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/lang/Object;II)Lhj;")
    private final class69 method564(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class69 var6 = new class69();
        var6.field1294 = arg1;
        var6.field1295 = arg4;
        var6.field1297 = arg2;
        if (arg3 <= 104) {
            return null;
        }
        synchronized (this) {
            if (this.field1475 == null) {
                this.field1475 = this.field1462 = var6;
            } else {
                this.field1475.field1293 = var6;
                this.field1475 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lhj;")
    public final class69 method565(int arg0, int arg1) {
        return arg0 == 3 ? this.method564(0, 3, (Object) null, 114, arg1) : null;
    }

    @OriginalMember(owner = "client!b", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class69 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1483) {
                        return;
                    }
                    if (this.field1462 != null) {
                        var2 = this.field1462;
                        this.field1462 = this.field1462.field1293;
                        if (this.field1462 == null) {
                            this.field1475 = null;
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
                int var3 = var2.field1294;
                if (var3 == 1) {
                    var2.field1292 = new Socket(InetAddress.getByName((String) var2.field1297), var2.field1295);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1297);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1295);
                    var2.field1292 = var6;
                } else if (var3 == 4) {
                    var2.field1292 = new DataInputStream(((URL) var2.field1297).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1297;
                    var2.field1292 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1297;
                    var2.field1292 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1296 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1296 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class81(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field1471 = arg3;
        field1463 = "1.1";
        this.field1478 = arg1;
        field1477 = "Unknown";
        this.field1473 = arg2;
        try {
            field1477 = System.getProperty("java.vendor");
            field1463 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field1479 = System.getProperty("os.name");
        } catch (Exception var13) {
            field1479 = "Unknown";
        }
        field1472 = field1479.toLowerCase();
        try {
            field1466 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var12) {
            field1466 = "";
        }
        try {
            field1480 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var11) {
            field1480 = "";
        }
        try {
            field1468 = System.getProperty("user.home");
            if (field1468 != null) {
                field1468 = field1468 + "/";
            }
        } catch (Exception var10) {
        }
        if (field1468 == null) {
            field1468 = "~/";
        }
        try {
            this.field1461 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var9) {
        }
        try {
            if (arg1 == null) {
                field1482 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1482 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        try {
            if (arg1 == null) {
                field1481 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1481 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        if (arg0) {
            this.field1476 = new class155(method552("random.dat", (byte) -101, (String) null, this.field1473), "rw", 25L);
            this.field1469 = new class155(method552("main_file_cache.dat2", (byte) -125, this.field1471, this.field1473), "rw", 104857600L);
            this.field1474 = new class155(method552("main_file_cache.idx255", (byte) -104, this.field1471, this.field1473), "rw", 1048576L);
            this.field1470 = new class155[arg4];
            for (int var6 = 0; var6 < arg4; var6++) {
                this.field1470[var6] = new class155(method552("main_file_cache.idx" + var6, (byte) -94, this.field1471, this.field1473), "rw", 1048576L);
            }
        }
        this.field1483 = false;
        this.field1460 = new Thread(this);
        this.field1460.setPriority(10);
        this.field1460.setDaemon(true);
        this.field1460.start();
    }
}
