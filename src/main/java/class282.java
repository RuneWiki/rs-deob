import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Frame;
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

@OriginalClass("client!lh")
public class class282 implements Runnable {

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lsk;")
    public class133 field4652 = null;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Ljava/io/File;")
    private File field4658 = null;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lsk;")
    public class133 field4661 = null;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lth;")
    private class275 field4650 = null;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Z")
    private boolean field4665 = false;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Ljava/io/File;")
    public File field4663 = null;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lth;")
    private class275 field4666 = null;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lsk;")
    public class133 field4668 = null;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field4664 = null;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4654;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4660;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field4667 = 3;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lfd;")
    private class219 field4659;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4649;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4651;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Ljava/lang/String;")
    private static String field4655;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4656;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4657;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4662;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[Lsk;")
    public class133[] field4653;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Z", line = 7)
    public final boolean method1865(boolean arg0) {
        if (!arg0) {
            this.field4659 = (class219) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V", line = 21)
    public final void method1866(byte arg0) {
        synchronized (this) {
            this.field4665 = true;
            this.notifyAll();
        }
        try {
            this.field4660.join();
        } catch (InterruptedException var14) {
        }
        if (arg0 != -84) {
            this.method1865(false);
        }
        if (this.field4652 != null) {
            try {
                this.field4652.method879(arg0 ^ 0xFFFFC9DB);
            } catch (IOException var13) {
            }
        }
        if (this.field4668 != null) {
            try {
                this.field4668.method879(13943);
            } catch (IOException var12) {
            }
        }
        if (this.field4653 != null) {
            for (int var7 = 0; var7 < this.field4653.length; var7++) {
                if (this.field4653[var7] != null) {
                    try {
                        this.field4653[var7].method879(13943);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4661 != null) {
            try {
                this.field4661.method879(13943);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/net/URL;B)Lth;", line = 83)
    public final class275 method1867(URL arg0, byte arg1) {
        int var3 = 35 / ((arg1 + 61) / 56);
        return this.method1880(0, 0, -105, arg0, 4);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Frame;I)Lth;", line = 93)
    public final class275 method1868(Frame arg0, int arg1) {
        if (arg1 > -59) {
            this.method1869(-16, (Class) null);
        }
        return this.method1880(0, 0, -78, arg0, 7);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/Class;)Lth;", line = 105)
    public final class275 method1869(int arg0, Class arg1) {
        if (arg0 != 0) {
            field4667 = 24;
        }
        return this.method1880(0, 0, -122, arg1, 13);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Lth;", line = 119)
    public final class275 method1870(byte arg0, int arg1) {
        int var3 = 89 % ((-arg0 - 84) / 33);
        return this.method1880(0, arg1, -93, (Object) null, 3);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;I)Lth;", line = 133)
    public final class275 method1871(int arg0, String arg1, int arg2) {
        if (arg0 != 0) {
            this.method1877(false, (Class) null, (String) null);
        }
        return this.method1880(0, arg2, arg0 - 79, arg1, 1);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Lfd;", line = 145)
    public final class219 method1872(byte arg0) {
        int var2 = 79 / ((50 - arg0) / 60);
        return this.field4659;
    }

    @OriginalMember(owner = "client!lh", name = "run", descriptor = "()V", line = 156)
    public final void run() {
        while (true) {
            class275 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4665) {
                        return;
                    }
                    if (this.field4650 != null) {
                        var2 = this.field4650;
                        this.field4650 = this.field4650.field4501;
                        if (this.field4650 == null) {
                            this.field4666 = null;
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
                int var5 = var2.field4498;
                if (var5 == 1) {
                    var2.field4499 = new Socket(InetAddress.getByName((String) var2.field4497), var2.field4500);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4497);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4500);
                    var2.field4499 = var6;
                } else if (var5 == 4) {
                    var2.field4499 = new DataInputStream(((URL) var2.field4497).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4497);
                    var2.field4499 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field4497);
                    var2.field4499 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field4496 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4496 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Class;I)Lth;", line = 244)
    public final class275 method1873(Class arg0, int arg1) {
        if (arg1 != 4) {
            this.method1871(37, (String) null, 70);
        }
        return this.method1880(0, 0, -120, arg0, 10);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;B[Ljava/lang/Class;)Lth;", line = 255)
    public final class275 method1874(String arg0, Class arg1, byte arg2, Class[] arg3) {
        if (arg2 < 75) {
            this.method1865(true);
        }
        return this.method1880(0, 0, -102, new Object[] { arg1, arg0, arg3 }, 8);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Lth;", line = 266)
    public final class275 method1875(byte arg0) {
        int var2 = 13 % ((arg0 + 26) / 43);
        return this.method1880(0, 0, -78, (Object) null, 5);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBII)Lth;", line = 275)
    public final class275 method1876(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = 28 / ((72 - arg2) / 37);
        return this.method1880((arg3 << 16) + arg4, (arg1 << 16) + arg0, -82, (Object) null, 6);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lth;", line = 283)
    public final class275 method1877(boolean arg0, Class arg1, String arg2) {
        if (arg0) {
            this.field4668 = (class133) null;
        }
        return this.method1880(0, 0, -84, new Object[] { arg1, arg2 }, 9);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/Class;)Lth;", line = 298)
    public final class275 method1878(byte arg0, Class arg1) {
        int var3 = 9 % ((-arg0 - 14) / 42);
        return this.method1880(0, 0, -103, arg1, 11);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 571)
    public class282(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field4656 = "Unknown";
        field4649 = "1.1";
        this.field4664 = arg1;
        try {
            field4656 = System.getProperty("java.vendor");
            field4649 = System.getProperty("java.version");
        } catch (Exception var21) {
        }
        try {
            field4651 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var20) {
            field4651 = "unknown";
        }
        try {
            field4655 = System.getProperty("user.home");
            if (field4655 != null) {
                field4655 = field4655 + "/";
            }
        } catch (Exception var19) {
        }
        if (field4655 == null) {
            field4655 = "~/";
        }
        try {
            this.field4654 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var18) {
        }
        try {
            if (arg1 == null) {
                field4657 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4657 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var17) {
        }
        try {
            if (arg1 == null) {
                field4662 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4662 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var16) {
        }
        if (arg0) {
            this.method1881(-128, arg2, arg3, arg4);
        }
        if (arg0) {
            Thread[] var12 = new Thread[1000];
            ThreadGroup var13 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var14 = var13.getParent(); var14 != null; var14 = var14.getParent()) {
                var13 = var14;
            }
            var13.enumerate(var12);
            for (int var15 = 0; var15 < var12.length; var15++) {
                if (var12[var15] != null && var12[var15].getName().startsWith("AWT")) {
                    var12[var15].setPriority(1);
                }
            }
        }
        this.field4665 = false;
        this.field4660 = new Thread(this);
        this.field4660.setPriority(10);
        this.field4660.setDaemon(true);
        this.field4660.start();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/Runnable;)Lth;", line = 319)
    public final class275 method1879(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 2) {
            this.method1877(true, (Class) null, (String) null);
        }
        return this.method1880(0, arg1, -125, arg2, 2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILjava/lang/Object;I)Lth;", line = 333)
    private final class275 method1880(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class275 var6 = new class275();
        var6.field4498 = arg4;
        if (arg2 > -76) {
            this.field4658 = (File) null;
        }
        var6.field4497 = arg3;
        var6.field4500 = arg1;
        synchronized (this) {
            if (this.field4666 == null) {
                this.field4666 = this.field4650 = var6;
            } else {
                this.field4666.field4501 = var6;
                this.field4666 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILjava/lang/String;I)V", line = 363)
    private final void method1881(int arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field4655, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        if (arg0 >= -112) {
            this.field4663 = (File) null;
        }
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
                        if (this.field4661 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field4661 = new class133(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field4661 = null;
                            }
                        }
                        if (this.field4658 == null) {
                            try {
                                File var15 = new File(var11, arg2);
                                if (var7 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var7 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field4652 = new class133(var17, "rw", 104857600L);
                                this.field4653 = new class133[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field4653[var18] = new class133(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field4668 = new class133(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field4663 = this.field4658 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field4652.method879(13943);
                                    for (int var20 = 0; var20 < arg3; var20++) {
                                        this.field4653[var20].method879(13943);
                                    }
                                    this.field4668.method879(13943);
                                } catch (Exception var23) {
                                }
                                this.field4652 = this.field4668 = null;
                                this.field4663 = this.field4658 = null;
                                this.field4653 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field4661 != null && this.field4658 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field4658 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)Lth;", line = 543)
    public final class275 method1882(int arg0, String arg1) {
        return arg0 == 8 ? this.method1880(0, 0, -123, arg1, 12) : (class275) null;
    }
}
