import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
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

@OriginalClass("client!cl")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lbi;")
    private class77 field2067 = null;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lbi;")
    private class77 field2068 = null;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field2072 = null;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Lde;")
    public class58 field2078 = null;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lde;")
    public class58 field2082 = null;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Lde;")
    public class58 field2074 = null;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Z")
    private boolean field2084 = false;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    private int field2075;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/lang/String;")
    private String field2063;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2077;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[Lde;")
    public class58[] field2081;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field2064;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2065 = 3;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2079 = new Hashtable(16);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lcf;")
    private class122 field2073;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2066;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2069;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2070;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2071;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2076;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2080;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Ljava/lang/String;")
    private static String field2083;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2085;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2086;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lbi;", line = 4)
    public final class77 method933(Frame arg0, boolean arg1) {
        if (arg1) {
            this.field2075 = 40;
        }
        return this.method943(0, 0, 7, -29188, arg0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)Lbi;", line = 17)
    public final class77 method934(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 1818742992) {
            this.method933((Frame) null, true);
        }
        return this.method943((arg0 << 16) + arg4, (arg3 << 16) + arg1, 6, -29188, (Object) null);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Z)Lbi;", line = 27)
    public final class77 method935(String arg0, boolean arg1) {
        return arg1 ? this.method943(0, 0, 12, -29188, arg0) : (class77) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Z", line = 41)
    public final boolean method936(byte arg0) {
        int var2 = 1 / ((19 - arg0) / 51);
        return false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;I)Lbi;", line = 51)
    public final class77 method937(int arg0, String arg1, int arg2) {
        return arg0 == 1 ? this.method943(0, arg2, 1, arg0 - 29189, arg1) : (class77) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLjava/awt/Component;I)Lbi;", line = 61)
    public final class77 method938(boolean arg0, Component arg1, int arg2) {
        if (arg2 != 0) {
            this.method951(-123);
        }
        return this.method943(0, arg0 ? 1 : 0, 15, -29188, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Lbi;", line = 72)
    public final class77 method939(boolean arg0) {
        if (arg0) {
            this.field2078 = (class58) null;
        }
        return this.method943(0, 0, 5, -29188, (Object) null);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)Lcf;", line = 84)
    public final class122 method940(byte arg0) {
        return arg0 == 96 ? this.field2073 : (class122) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILjava/awt/Component;)Lbi;", line = 96)
    public final class77 method941(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 > -14) {
            return (class77) null;
        } else {
            Point var5 = arg3.getLocationOnScreen();
            return this.method943(var5.y + arg2, var5.x + arg1, 14, -29188, (Object) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/Class;)Lbi;", line = 119)
    public final class77 method942(int arg0, Class arg1) {
        return arg0 == 4 ? this.method943(0, 0, 11, -29188, arg1) : (class77) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIILjava/lang/Object;)Lbi;", line = 131)
    private final class77 method943(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class77 var6 = new class77();
        var6.field1327 = arg4;
        var6.field1331 = arg2;
        var6.field1326 = arg1;
        synchronized (this) {
            if (arg3 != -29188) {
                return (class77) null;
            }
            if (this.field2068 == null) {
                this.field2068 = this.field2067 = var6;
            } else {
                this.field2068.field1328 = var6;
                this.field2068 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Lbi;", line = 161)
    public final class77 method944(String arg0, boolean arg1, Class arg2) {
        if (arg1) {
            field2086 = (Method) null;
        }
        return this.method943(0, 0, 9, -29188, new Object[] { arg2, arg0 });
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lbi;", line = 173)
    public final class77 method945(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 != 25) {
            this.method936((byte) 104);
        }
        return this.method943(0, 0, 8, -29188, new Object[] { arg0, arg1, arg2 });
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 518)
    public class124(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field2072 = arg1;
        field2066 = "1.1";
        field2080 = "Unknown";
        this.field2075 = arg2;
        this.field2063 = arg3;
        try {
            field2080 = System.getProperty("java.vendor");
            field2066 = System.getProperty("java.version");
        } catch (Exception var26) {
        }
        try {
            field2071 = System.getProperty("os.name");
        } catch (Exception var25) {
            field2071 = "Unknown";
        }
        field2070 = field2071.toLowerCase();
        try {
            field2076 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var24) {
            field2076 = "";
        }
        try {
            field2069 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var23) {
            field2069 = "";
        }
        try {
            field2083 = System.getProperty("user.home");
            if (field2083 != null) {
                field2083 = field2083 + "/";
            }
        } catch (Exception var22) {
        }
        if (field2083 == null) {
            field2083 = "~/";
        }
        try {
            this.field2077 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var21) {
        }
        try {
            if (arg1 == null) {
                field2085 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2085 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var20) {
        }
        try {
            if (arg1 == null) {
                field2086 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2086 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var19) {
        }
        if (arg0) {
            this.field2082 = new class58(method946((String) null, -18795, "random.dat", this.field2075), "rw", 25L);
            this.field2074 = new class58(method946(this.field2063, -18795, "main_file_cache.dat2", this.field2075), "rw", 104857600L);
            this.field2078 = new class58(method946(this.field2063, -18795, "main_file_cache.idx255", this.field2075), "rw", 1048576L);
            this.field2081 = new class58[arg4];
            for (int var14 = 0; var14 < arg4; var14++) {
                this.field2081[var14] = new class58(method946(this.field2063, -18795, "main_file_cache.idx" + var14, this.field2075), "rw", 1048576L);
            }
        }
        if (arg0) {
            Thread[] var15 = new Thread[1000];
            ThreadGroup var16 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var17 = var16.getParent(); var17 != null; var17 = var17.getParent()) {
                var16 = var17;
            }
            var16.enumerate(var15);
            for (int var18 = 0; var18 < var15.length; var18++) {
                if (var15[var18] != null && var15[var18].getName().startsWith("AWT")) {
                    var15[var18].setPriority(1);
                }
            }
        }
        this.field2084 = false;
        this.field2064 = new Thread(this);
        this.field2064.setPriority(10);
        this.field2064.setDaemon(true);
        this.field2064.start();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 198)
    private static final File method946(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field2079.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2083, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg1 != -18795) {
            method946((String) null, -15, (String) null, -51);
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field2079.put(arg2, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var19) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var16 = null;
                            }
                        } catch (Exception var18) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lbi;", line = 289)
    public final class77 method947(int arg0, Runnable arg1, int arg2) {
        return arg0 == 0 ? this.method943(0, arg2, 2, -29188, arg1) : (class77) null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/Class;)Lbi;", line = 300)
    public final class77 method948(byte arg0, Class arg1) {
        if (arg0 < 92) {
            field2069 = (String) null;
        }
        return this.method943(0, 0, 10, -29188, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Lbi;", line = 310)
    public final class77 method949(int arg0, byte arg1) {
        if (arg1 != -99) {
            this.method948((byte) -121, (Class) null);
        }
        return this.method943(0, arg0, 3, -29188, (Object) null);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/net/URL;B)Lbi;", line = 330)
    public final class77 method950(URL arg0, byte arg1) {
        int var3 = -84 % ((-arg1 - 9) / 52);
        return this.method943(0, 0, 4, -29188, arg0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 338)
    public final void method951(int arg0) {
        synchronized (this) {
            this.field2084 = true;
            this.notifyAll();
        }
        try {
            this.field2064.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2074 != null) {
            try {
                this.field2074.method465(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field2078 != null) {
            try {
                this.field2078.method465(-1);
            } catch (IOException var12) {
            }
        }
        if (this.field2081 != null) {
            for (int var7 = 0; var7 < this.field2081.length; var7++) {
                if (this.field2081[var7] != null) {
                    try {
                        this.field2081[var7].method465(-1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2082 != null) {
            try {
                this.field2082.method465(arg0 - 20486);
            } catch (IOException var10) {
            }
        }
        if (arg0 != 20485) {
            this.field2072 = (Applet) null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLjava/lang/String;)Lbi;", line = 392)
    public final class77 method952(boolean arg0, String arg1) {
        if (!arg0) {
            this.method947(38, (Runnable) null, -53);
        }
        return this.method943(0, 0, 16, -29188, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "run", descriptor = "()V", line = 419)
    public final void run() {
        while (true) {
            class77 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2084) {
                        return;
                    }
                    if (this.field2067 != null) {
                        var2 = this.field2067;
                        this.field2067 = this.field2067.field1328;
                        if (this.field2067 == null) {
                            this.field2068 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field1331;
                if (var5 == 1) {
                    var2.field1329 = new Socket(InetAddress.getByName((String) var2.field1327), var2.field1326);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1327);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1326);
                    var2.field1329 = var6;
                } else if (var5 == 4) {
                    var2.field1329 = new DataInputStream(((URL) var2.field1327).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field1327);
                    var2.field1329 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1327);
                    var2.field1329 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field1330 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1330 = 2;
            }
        }
    }
}
