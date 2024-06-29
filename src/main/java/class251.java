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

@OriginalClass("client!ui")
public class class251 implements Runnable {

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lwg;")
    public class274 field4260 = null;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ldj;")
    private class310 field4252 = null;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
    private boolean field4259 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lwg;")
    public class274 field4258 = null;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Ldj;")
    private class310 field4268 = null;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lwg;")
    public class274 field4266 = null;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Ljava/applet/Applet;")
    public Applet field4272 = null;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Ljava/lang/String;")
    private String field4261;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    private int field4251;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4254;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[Lwg;")
    public class274[] field4267;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field4253;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4257 = 3;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field4265 = new Hashtable(16);

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Lsi;")
    private class300 field4269;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4255;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4256;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4262;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4263;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4264;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "Ljava/lang/String;")
    private static String field4270;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4271;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4273;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4274;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/lang/Runnable;)Ldj;", line = 6)
    public final class310 method1691(int arg0, int arg1, Runnable arg2) {
        return arg1 == 25 ? this.method1703(0, 2, (byte) 106, arg2, arg0) : (class310) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;II)Ldj;", line = 21)
    public final class310 method1692(String arg0, int arg1, int arg2) {
        if (arg2 <= 47) {
            method1694((String) null, 48, (String) null, -115);
        }
        return this.method1703(0, 1, (byte) 121, arg0, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ldj;", line = 35)
    public final class310 method1693(int arg0, String arg1, Class arg2) {
        return arg0 == 9 ? this.method1703(0, 9, (byte) 115, new Object[] { arg2, arg1 }, 0) : (class310) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 46)
    private static final File method1694(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field4265.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4270, "/tmp/", "" };
        if (arg1 != 1) {
            method1694((String) null, 16, (String) null, 19);
        }
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
                                field4265.put(arg0, var12);
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

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Component;II)Ldj;", line = 139)
    public final class310 method1695(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg3 == 14924 ? this.method1703(var5.y + arg2, 14, (byte) 124, (Object) null, arg0 + var5.x) : (class310) null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZLjava/awt/Component;)Ldj;", line = 150)
    public final class310 method1696(byte arg0, boolean arg1, Component arg2) {
        if (arg0 > -34) {
            this.field4266 = (class274) null;
        }
        return this.method1703(0, 15, (byte) 126, arg2, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/Class;I)Ldj;", line = 160)
    public final class310 method1697(Class arg0, int arg1) {
        if (arg1 != 20922) {
            field4264 = (String) null;
        }
        return this.method1703(0, 11, (byte) -46, arg0, 0);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 512)
    public class251(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        this.field4261 = arg3;
        this.field4251 = arg2;
        this.field4272 = arg1;
        field4256 = "Unknown";
        field4264 = "1.1";
        try {
            field4256 = System.getProperty("java.vendor");
            field4264 = System.getProperty("java.version");
        } catch (Exception var26) {
        }
        try {
            field4271 = System.getProperty("os.name");
        } catch (Exception var25) {
            field4271 = "Unknown";
        }
        field4263 = field4271.toLowerCase();
        try {
            field4262 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var24) {
            field4262 = "";
        }
        try {
            field4255 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var23) {
            field4255 = "";
        }
        try {
            field4270 = System.getProperty("user.home");
            if (field4270 != null) {
                field4270 = field4270 + "/";
            }
        } catch (Exception var22) {
        }
        if (field4270 == null) {
            field4270 = "~/";
        }
        try {
            this.field4254 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var21) {
        }
        try {
            if (arg1 == null) {
                field4274 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4274 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var20) {
        }
        try {
            if (arg1 == null) {
                field4273 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4273 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var19) {
        }
        if (arg0) {
            this.field4258 = new class274(method1694("random.dat", 1, (String) null, this.field4251), "rw", 25L);
            this.field4260 = new class274(method1694("main_file_cache.dat2", 1, this.field4261, this.field4251), "rw", 104857600L);
            this.field4266 = new class274(method1694("main_file_cache.idx255", 1, this.field4261, this.field4251), "rw", 1048576L);
            this.field4267 = new class274[arg4];
            for (int var14 = 0; var14 < arg4; var14++) {
                this.field4267[var14] = new class274(method1694("main_file_cache.idx" + var14, 1, this.field4261, this.field4251), "rw", 1048576L);
            }
        }
        if (arg0) {
            ThreadGroup var15 = Thread.currentThread().getThreadGroup();
            ThreadGroup var16 = var15.getParent();
            Thread[] var17 = new Thread[1000];
            while (var16 != null) {
                var15 = var16;
                var16 = var16.getParent();
            }
            var15.enumerate(var17);
            for (int var18 = 0; var18 < var17.length; var18++) {
                if (var17[var18] != null && var17[var18].getName().startsWith("AWT")) {
                    var17[var18].setPriority(1);
                }
            }
        }
        this.field4259 = false;
        this.field4253 = new Thread(this);
        this.field4253.setPriority(10);
        this.field4253.setDaemon(true);
        this.field4253.start();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Ldj;", line = 178)
    public final class310 method1698(int arg0, int arg1) {
        if (arg1 < 21) {
            this.method1710(-54, (URL) null);
        }
        return this.method1703(0, 3, (byte) -112, (Object) null, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lsi;", line = 188)
    public final class300 method1699(int arg0) {
        if (arg0 != 16) {
            field4273 = (Method) null;
        }
        return this.field4269;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ldj;", line = 199)
    public final class310 method1700(int arg0, String arg1, Class arg2, Class[] arg3) {
        return arg0 >= -114 ? (class310) null : this.method1703(0, 8, (byte) 115, new Object[] { arg2, arg1, arg3 }, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Frame;I)Ldj;", line = 209)
    public final class310 method1701(Frame arg0, int arg1) {
        if (arg1 != 1) {
            field4270 = (String) null;
        }
        return this.method1703(0, 7, (byte) -5, arg0, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)Ldj;", line = 232)
    public final class310 method1702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 779) {
            this.method1691(54, -54, (Runnable) null);
        }
        return this.method1703((arg4 << 16) + arg1, 6, (byte) -98, (Object) null, (arg0 << 16) + arg2);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIBLjava/lang/Object;I)Ldj;", line = 243)
    private final class310 method1703(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class310 var6 = new class310();
        var6.field5295 = arg1;
        var6.field5297 = arg3;
        var6.field5292 = arg4;
        synchronized (this) {
            if (this.field4252 == null) {
                this.field4252 = this.field4268 = var6;
            } else {
                this.field4252.field5294 = var6;
                this.field4252 = var6;
            }
            this.notify();
        }
        int var9 = 120 % ((61 - arg2) / 42);
        return var6;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)Ldj;", line = 280)
    public final class310 method1704(int arg0, String arg1) {
        int var3 = 121 % ((-arg0 - 48) / 61);
        return this.method1703(0, 12, (byte) 118, arg1, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Ldj;", line = 288)
    public final class310 method1705(byte arg0) {
        if (arg0 <= 83) {
            field4262 = (String) null;
        }
        return this.method1703(0, 5, (byte) 116, (Object) null, 0);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 299)
    public final void method1706(byte arg0) {
        synchronized (this) {
            if (arg0 > -13) {
                this.method1710(110, (URL) null);
            }
            this.field4259 = true;
            this.notifyAll();
        }
        try {
            this.field4253.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4260 != null) {
            try {
                this.field4260.method1843(-127);
            } catch (IOException var13) {
            }
        }
        if (this.field4266 != null) {
            try {
                this.field4266.method1843(-118);
            } catch (IOException var12) {
            }
        }
        if (this.field4267 != null) {
            for (int var7 = 0; var7 < this.field4267.length; var7++) {
                if (this.field4267[var7] != null) {
                    try {
                        this.field4267[var7].method1843(-124);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4258 != null) {
            try {
                this.field4258.method1843(-113);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Ljava/lang/Class;I)Ldj;", line = 354)
    public final class310 method1707(Class arg0, int arg1) {
        if (arg1 != -17547) {
            this.method1707((Class) null, -67);
        }
        return this.method1703(0, 10, (byte) -74, arg0, 0);
    }

    @OriginalMember(owner = "client!ui", name = "run", descriptor = "()V", line = 385)
    public final void run() {
        while (true) {
            class310 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4259) {
                        return;
                    }
                    if (this.field4268 != null) {
                        var2 = this.field4268;
                        this.field4268 = this.field4268.field5294;
                        if (this.field4268 == null) {
                            this.field4252 = null;
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
                int var5 = var2.field5295;
                if (var5 == 1) {
                    var2.field5296 = new Socket(InetAddress.getByName((String) var2.field5297), var2.field5292);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field5297);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field5292);
                    var2.field5296 = var8;
                } else if (var5 == 4) {
                    var2.field5296 = new DataInputStream(((URL) var2.field5297).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field5297);
                    var2.field5296 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field5297);
                    var2.field5296 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field5293 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field5293 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)Z", line = 477)
    public final boolean method1708(byte arg0) {
        return arg0 >= -4;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(ILjava/lang/String;)Ldj;", line = 491)
    public final class310 method1709(int arg0, String arg1) {
        if (arg0 < 87) {
            this.method1710(-34, (URL) null);
        }
        return this.method1703(0, 16, (byte) 112, arg1, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/net/URL;)Ldj;", line = 645)
    public final class310 method1710(int arg0, URL arg1) {
        return arg0 == 0 ? this.method1703(0, 4, (byte) -126, arg1, 0) : (class310) null;
    }
}
