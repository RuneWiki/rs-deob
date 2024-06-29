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

@OriginalClass("client!cj")
public class class75 implements Runnable {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lba;")
    public class286 field986 = null;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field1000 = null;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Lhj;")
    private class112 field1001 = null;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lhj;")
    private class112 field987 = null;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
    private boolean field999 = false;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lba;")
    public class286 field997 = null;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Lba;")
    public class286 field1003 = null;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Ljava/lang/String;")
    private String field992;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    private int field990;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field988;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[Lba;")
    public class286[] field991;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field998;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field994 = 3;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field993 = new Hashtable(16);

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Log;")
    private class41 field995;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1002;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1004;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1005;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1006;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1007;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field989;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Ljava/lang/String;")
    private static String field996;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1008;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1009;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)Lhj;", line = 5)
    public final class112 method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 == 16 ? this.method437((Object) null, 6, 2146, (arg0 << 16) + arg3, (arg4 << 16) + arg1) : (class112) null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Lhj;", line = 16)
    public final class112 method419(int arg0) {
        if (arg0 > -12) {
            this.field999 = true;
        }
        return this.method437((Object) null, 5, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLjava/lang/Class;)Lhj;", line = 26)
    public final class112 method420(boolean arg0, Class arg1) {
        if (arg0) {
            this.method424(15, (byte) 94);
        }
        return this.method437(arg1, 10, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Log;", line = 42)
    public final class41 method421(byte arg0) {
        if (arg0 != -4) {
            this.method431(70);
        }
        return this.field995;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)Z", line = 58)
    public final boolean method422(boolean arg0) {
        if (!arg0) {
            field996 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLjava/awt/Component;B)Lhj;", line = 74)
    public final class112 method423(boolean arg0, Component arg1, byte arg2) {
        int var4 = -111 / ((arg2 + 19) / 42);
        return this.method437(arg1, 15, 2146, arg0 ? 1 : 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lhj;", line = 88)
    public final class112 method424(int arg0, byte arg1) {
        int var3 = 23 % ((arg1 - 22) / 49);
        return this.method437((Object) null, 3, 2146, arg0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lhj;", line = 100)
    public final class112 method425(String arg0, int arg1, Class arg2) {
        if (arg1 != 0) {
            this.method433((byte) -62, (Class) null);
        }
        return this.method437(new Object[] { arg2, arg0 }, 9, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/net/URL;Z)Lhj;", line = 112)
    public final class112 method426(URL arg0, boolean arg1) {
        return arg1 ? (class112) null : this.method437(arg0, 4, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Component;BII)Lhj;", line = 122)
    public final class112 method427(Component arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 52) {
            this.field988 = (EventQueue) null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method437((Object) null, 14, 2146, arg3 + var5.x, arg2 - -var5.y);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;II)Lhj;", line = 138)
    public final class112 method428(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field995 = (class41) null;
        }
        return this.method437(arg0, 1, arg1 + 2146, arg2, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lhj;", line = 150)
    public final class112 method429(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field990 = 58;
        }
        return this.method437(arg0, 2, 2146, arg2, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Frame;I)Lhj;", line = 163)
    public final class112 method430(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.method428((String) null, 66, -118);
        }
        return this.method437(arg0, 7, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 177)
    public final void method431(int arg0) {
        if (arg0 != 0) {
            return;
        }
        synchronized (this) {
            this.field999 = true;
            this.notifyAll();
        }
        try {
            this.field998.join();
        } catch (InterruptedException var14) {
        }
        if (this.field997 != null) {
            try {
                this.field997.method1977(arg0 + 121);
            } catch (IOException var13) {
            }
        }
        if (this.field986 != null) {
            try {
                this.field986.method1977(94);
            } catch (IOException var12) {
            }
        }
        if (this.field991 != null) {
            for (int var7 = 0; var7 < this.field991.length; var7++) {
                if (this.field991[var7] != null) {
                    try {
                        this.field991[var7].method1977(88);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field1003 != null) {
            try {
                this.field1003.method1977(127);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 520)
    public class75(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) throws Exception {
        field989 = "Unknown";
        this.field992 = arg3;
        field1002 = "1.1";
        this.field1000 = arg1;
        this.field990 = arg2;
        try {
            field989 = System.getProperty("java.vendor");
            field1002 = System.getProperty("java.version");
        } catch (Exception var26) {
        }
        try {
            field1004 = System.getProperty("os.name");
        } catch (Exception var25) {
            field1004 = "Unknown";
        }
        field1005 = field1004.toLowerCase();
        try {
            field1007 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var24) {
            field1007 = "";
        }
        try {
            field1006 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var23) {
            field1006 = "";
        }
        try {
            field996 = System.getProperty("user.home");
            if (field996 != null) {
                field996 = field996 + "/";
            }
        } catch (Exception var22) {
        }
        if (field996 == null) {
            field996 = "~/";
        }
        try {
            this.field988 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var21) {
        }
        try {
            if (arg1 == null) {
                field1008 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1008 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var20) {
        }
        try {
            if (arg1 == null) {
                field1009 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1009 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var19) {
        }
        if (arg0) {
            this.field1003 = new class286(method432("random.dat", 16, this.field990, (String) null), "rw", 25L);
            this.field997 = new class286(method432("main_file_cache.dat2", 16, this.field990, this.field992), "rw", 104857600L);
            this.field986 = new class286(method432("main_file_cache.idx255", 16, this.field990, this.field992), "rw", 1048576L);
            this.field991 = new class286[arg4];
            for (int var14 = 0; var14 < arg4; var14++) {
                this.field991[var14] = new class286(method432("main_file_cache.idx" + var14, 16, this.field990, this.field992), "rw", 1048576L);
            }
        }
        if (arg0) {
            ThreadGroup var15 = Thread.currentThread().getThreadGroup();
            Thread[] var16 = new Thread[1000];
            for (ThreadGroup var17 = var15.getParent(); var17 != null; var17 = var17.getParent()) {
                var15 = var17;
            }
            var15.enumerate(var16);
            for (int var18 = 0; var18 < var16.length; var18++) {
                if (var16[var18] != null && var16[var18].getName().startsWith("AWT")) {
                    var16[var18].setPriority(1);
                }
            }
        }
        this.field999 = false;
        this.field998 = new Thread(this);
        this.field998.setPriority(10);
        this.field998.setDaemon(true);
        this.field998.start();
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 242)
    private static final File method432(String arg0, int arg1, int arg2, String arg3) {
        File var4 = (File) field993.get(arg0);
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 16) {
            field1007 = (String) null;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field996, "/tmp/", "" };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    RandomAccessFile var10 = null;
                    String var11 = var6[var9] + var5[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg0;
                    try {
                        File var12 = new File(var11);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var6[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var6[var9] + var5[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var6[var9] + var5[var8] + "/" + arg3)).mkdir();
                                }
                                var10 = new RandomAccessFile(var12, "rw");
                                int var14 = var10.read();
                                var10.seek(0L);
                                var10.write(var14);
                                var10.seek(0L);
                                var10.close();
                                field993.put(arg0, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var19) {
                        try {
                            if (var10 != null) {
                                var10.close();
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

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjava/lang/Class;)Lhj;", line = 343)
    public final class112 method433(byte arg0, Class arg1) {
        if (arg0 > -51) {
            this.method437((Object) null, -43, 50, 8, 82);
        }
        return this.method437(arg1, 11, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "run", descriptor = "()V", line = 356)
    public final void run() {
        while (true) {
            class112 var2;
            synchronized (this) {
                while (true) {
                    if (this.field999) {
                        return;
                    }
                    if (this.field987 != null) {
                        var2 = this.field987;
                        this.field987 = this.field987.field1745;
                        if (this.field987 == null) {
                            this.field1001 = null;
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
                int var5 = var2.field1747;
                if (var5 == 1) {
                    var2.field1742 = new Socket(InetAddress.getByName((String) var2.field1744), var2.field1743);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1744);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1743);
                    var2.field1742 = var6;
                } else if (var5 == 4) {
                    var2.field1742 = new DataInputStream(((URL) var2.field1744).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field1744);
                    var2.field1742 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1744);
                    var2.field1742 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field1746 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1746 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Z)Lhj;", line = 445)
    public final class112 method434(String arg0, boolean arg1) {
        return arg1 ? this.method437(arg0, 16, 2146, 0, 0) : (class112) null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lhj;", line = 459)
    public final class112 method435(String arg0, int arg1, Class[] arg2, Class arg3) {
        int var5 = 50 % ((46 - arg1) / 35);
        return this.method437(new Object[] { arg3, arg0, arg2 }, 8, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)Lhj;", line = 473)
    public final class112 method436(int arg0, String arg1) {
        if (arg0 != -27632) {
            this.field990 = 45;
        }
        return this.method437(arg1, 12, 2146, 0, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lhj;", line = 490)
    private final class112 method437(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class112 var6 = new class112();
        var6.field1744 = arg0;
        if (arg2 != 2146) {
            return (class112) null;
        }
        var6.field1747 = arg1;
        var6.field1743 = arg3;
        synchronized (this) {
            if (this.field1001 == null) {
                this.field1001 = this.field987 = var6;
            } else {
                this.field1001.field1745 = var6;
                this.field1001 = var6;
            }
            this.notify();
            return var6;
        }
    }
}
