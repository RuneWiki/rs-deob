import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class109 implements Runnable {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljava/io/File;")
    public File field1985 = null;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lhh;")
    public class72 field1983 = null;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field1986 = null;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
    private boolean field1982 = false;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lsh;")
    private class170 field1996 = null;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lhh;")
    public class72 field1995 = null;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lsh;")
    private class170 field1991 = null;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Ljava/io/File;")
    private File field1999 = null;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lhh;")
    public class72 field1998 = null;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1990;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field1989;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1988 = 3;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lve;")
    private class194 field1997;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1984;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1987;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1993;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1992;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1994;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lhh;")
    public class72[] field2000;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;I)Lsh;")
    public final class170 method671(int arg0, String arg1, int arg2) {
        int var4 = -107 % (arg2 / 61);
        return this.method677(arg0, 0, arg1, -2472, 1);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/net/URL;)Lsh;")
    public final class170 method672(byte arg0, URL arg1) {
        if (arg0 >= -92) {
            field1984 = null;
        }
        return this.method677(0, 0, arg1, -2472, 4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public final void method673(int arg0) {
        synchronized (this) {
            this.field1982 = true;
            if (arg0 != 15993) {
                this.method679(65, null, 87, (byte) -24);
            }
            this.notifyAll();
        }
        try {
            this.field1989.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1995 != null) {
            try {
                this.field1995.method444(arg0 ^ 0xFFFFC1FA);
            } catch (IOException var7) {
            }
        }
        if (this.field1998 != null) {
            try {
                this.field1998.method444(-121);
            } catch (IOException var6) {
            }
        }
        if (this.field2000 != null) {
            for (int var3 = 0; var3 < this.field2000.length; var3++) {
                if (this.field2000[var3] != null) {
                    try {
                        this.field2000[var3].method444(-122);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1983 != null) {
            try {
                this.field1983.method444(-127);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lsh;")
    public final class170 method674(boolean arg0, Class arg1, Class[] arg2, String arg3) {
        if (arg0) {
            this.method675(68);
        }
        return this.method677(0, 0, new Object[] { arg1, arg3, arg2 }, -2472, 8);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lve;")
    public final class194 method675(int arg0) {
        int var2 = -115 / ((arg0 + 64) / 56);
        return this.field1997;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lsh;")
    public final class170 method676(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 0) {
            this.field2000 = null;
        }
        return this.method677(arg2, 0, arg1, -2472, 2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/lang/Object;II)Lsh;")
    private final class170 method677(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg3 != -2472) {
            this.field1995 = null;
        }
        class170 var6 = new class170();
        var6.field3297 = arg0;
        var6.field3301 = arg2;
        var6.field3300 = arg4;
        synchronized (this) {
            if (this.field1991 == null) {
                this.field1991 = this.field1996 = var6;
            } else {
                this.field1991.field3298 = var6;
                this.field1991 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lsh;")
    public final class170 method678(int arg0, String arg1, Class arg2) {
        if (arg0 != -3666) {
            this.field1986 = null;
        }
        return this.method677(0, 0, new Object[] { arg2, arg1 }, -2472, 9);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;IB)V")
    private final void method679(int arg0, String arg1, int arg2, byte arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1987, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field1983 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field1983 = new class72(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field1983 = null;
                            }
                        }
                        if (this.field1999 == null) {
                            try {
                                File var14 = new File(var11, arg1);
                                if (var7 == 1 && !var14.exists()) {
                                    boolean var15 = var14.mkdir();
                                    if (!var15) {
                                        continue;
                                    }
                                }
                                File var16 = new File(var14, "main_file_cache.dat2");
                                if (var7 == 0 && !var16.exists()) {
                                    continue;
                                }
                                this.field1995 = new class72(var16, "rw", 104857600L);
                                this.field2000 = new class72[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field2000[var17] = new class72(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field1998 = new class72(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1985 = this.field1999 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field1995.method444(-120);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field2000[var18].method444(-121);
                                    }
                                    this.field1998.method444(-122);
                                } catch (Exception var19) {
                                }
                                this.field1995 = this.field1998 = null;
                                this.field2000 = null;
                                this.field1985 = this.field1999 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field1983 != null && this.field1999 != null) {
                        return;
                    }
                }
            }
        }
        if (arg3 < 15) {
            field1987 = null;
        }
        if (this.field1999 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class170 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1982) {
                        return;
                    }
                    if (this.field1996 != null) {
                        var2 = this.field1996;
                        this.field1996 = this.field1996.field3298;
                        if (this.field1996 == null) {
                            this.field1991 = null;
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
                int var3 = var2.field3300;
                if (var3 == 1) {
                    var2.field3299 = new Socket(InetAddress.getByName((String) var2.field3301), var2.field3297);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3301);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3297);
                    var2.field3299 = var6;
                } else if (var3 == 4) {
                    var2.field3299 = new DataInputStream(((URL) var2.field3301).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3301;
                    var2.field3299 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3301;
                    var2.field3299 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3296 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3296 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lsh;")
    public final class170 method680(byte arg0, int arg1) {
        if (arg0 != -110) {
            this.field1982 = true;
        }
        return this.method677(arg1, 0, null, -2472, 3);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class109(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field1986 = arg1;
        field1993 = "Unknown";
        field1984 = "1.1";
        try {
            field1993 = System.getProperty("java.vendor");
            field1984 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1987 = System.getProperty("user.home");
            if (field1987 != null) {
                field1987 = field1987 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1987 == null) {
            field1987 = "~/";
        }
        try {
            this.field1990 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1994 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1994 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1992 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1992 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method679(arg2, arg3, arg4, (byte) 23);
        }
        this.field1982 = false;
        this.field1989 = new Thread(this);
        this.field1989.setPriority(10);
        this.field1989.setDaemon(true);
        this.field1989.start();
    }
}
