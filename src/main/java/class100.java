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

@OriginalClass("client!mi")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Lej;")
    public class254 field1838 = null;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Z")
    private boolean field1842 = false;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Ljava/io/File;")
    public File field1836 = null;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lfa;")
    private class176 field1845 = null;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Ljava/io/File;")
    private File field1849 = null;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lfa;")
    private class176 field1844 = null;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Lej;")
    public class254 field1854 = null;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lej;")
    public class254 field1852 = null;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Ljava/applet/Applet;")
    public Applet field1855 = null;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1847;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field1853;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field1843 = 3;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Luj;")
    private class48 field1846;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1839;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1840;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1841;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1850;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1837;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1851;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[Lej;")
    public class254[] field1848;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lfa;")
    public final class176 method709(String arg0, int arg1, Class[] arg2, Class arg3) {
        int var5 = -99 % ((arg1 - 43) / 33);
        return this.method720(new Object[] { arg3, arg0, arg2 }, 8, (byte) -127, 0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lfa;")
    public final class176 method710(Runnable arg0, byte arg1, int arg2) {
        if (arg1 != -121) {
            this.field1844 = null;
        }
        return this.method720(arg0, 2, (byte) -99, 0, arg2);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;I)Lfa;")
    public final class176 method711(String arg0, int arg1) {
        if (arg1 > -7) {
            this.field1845 = null;
        }
        return this.method720(arg0, 12, (byte) -56, 0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Class;I)Lfa;")
    public final class176 method712(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.field1854 = null;
        }
        return this.method720(arg0, 13, (byte) -64, 0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Ljava/lang/Class;I)Lfa;")
    public final class176 method713(Class arg0, int arg1) {
        return arg1 == 2 ? this.method720(arg0, 11, (byte) -60, 0, 0) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/net/URL;I)Lfa;")
    public final class176 method714(URL arg0, int arg1) {
        if (arg1 < 63) {
            field1851 = null;
        }
        return this.method720(arg0, 4, (byte) -63, 0, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;BII)V")
    private final void method715(String arg0, byte arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1839, "/tmp/", "" };
        int var7 = 0;
        int var8 = -11 / ((-arg1 - 52) / 36);
        while (var7 < 2) {
            for (int var9 = 0; var9 < var5.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    try {
                        String var11 = var6[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var5[var9]);
                        if (var7 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (this.field1852 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var7 == 1 || var14.exists()) {
                                    this.field1852 = new class254(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field1852 = null;
                            }
                        }
                        if (this.field1849 == null) {
                            try {
                                File var15 = new File(var12, arg0);
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
                                this.field1854 = new class254(var17, "rw", 104857600L);
                                this.field1848 = new class254[arg2];
                                for (int var18 = 0; var18 < arg2; var18++) {
                                    this.field1848[var18] = new class254(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field1838 = new class254(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field1836 = this.field1849 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field1854.method1658(13198);
                                    for (int var19 = 0; var19 < arg2; var19++) {
                                        this.field1848[var19].method1658(13198);
                                    }
                                    this.field1838.method1658(13198);
                                } catch (Exception var20) {
                                }
                                this.field1836 = this.field1849 = null;
                                this.field1854 = this.field1838 = null;
                                this.field1848 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field1852 != null && this.field1849 != null) {
                        return;
                    }
                }
            }
            var7++;
        }
        if (this.field1849 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lfa;")
    public final class176 method716(Class arg0, byte arg1, String arg2) {
        return arg1 == -104 ? this.method720(new Object[] { arg0, arg2 }, 9, (byte) -125, 0, 0) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lfa;")
    public final class176 method717(byte arg0, int arg1) {
        if (arg0 != -27) {
            this.method712((Class) null, 93);
        }
        return this.method720((Object) null, 3, (byte) -97, 0, arg1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;IB)Lfa;")
    public final class176 method718(String arg0, int arg1, byte arg2) {
        return arg2 >= -98 ? null : this.method720(arg0, 1, (byte) -85, 0, arg1);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Luj;")
    public final class48 method719(int arg0) {
        return arg0 >= -98 ? null : this.field1846;
    }

    @OriginalMember(owner = "client!mi", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class176 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1842) {
                        return;
                    }
                    if (this.field1845 != null) {
                        var2 = this.field1845;
                        this.field1845 = this.field1845.field2999;
                        if (this.field1845 == null) {
                            this.field1844 = null;
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
                int var3 = var2.field2997;
                if (var3 == 1) {
                    var2.field3001 = new Socket(InetAddress.getByName((String) var2.field2996), var2.field2998);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2996);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2998);
                    var2.field3001 = var4;
                } else if (var3 == 4) {
                    var2.field3001 = new DataInputStream(((URL) var2.field2996).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field2996;
                    var2.field3001 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2996;
                    var2.field3001 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3000 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3000 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/Object;IBII)Lfa;")
    private final class176 method720(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class176 var6 = new class176();
        if (arg2 > -30) {
            this.field1847 = null;
        }
        var6.field2998 = arg4;
        var6.field2996 = arg0;
        var6.field2997 = arg1;
        synchronized (this) {
            if (this.field1844 == null) {
                this.field1844 = this.field1845 = var6;
            } else {
                this.field1844.field2999 = var6;
                this.field1844 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    public final void method721(boolean arg0) {
        synchronized (this) {
            this.field1842 = arg0;
            this.notifyAll();
        }
        try {
            this.field1853.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1854 != null) {
            try {
                this.field1854.method1658(13198);
            } catch (IOException var7) {
            }
        }
        if (this.field1838 != null) {
            try {
                this.field1838.method1658(13198);
            } catch (IOException var6) {
            }
        }
        if (this.field1848 != null) {
            for (int var3 = 0; var3 < this.field1848.length; var3++) {
                if (this.field1848[var3] != null) {
                    try {
                        this.field1848[var3].method1658(13198);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1852 != null) {
            try {
                this.field1852.method1658(13198);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class100(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field1840 = "Unknown";
        field1841 = "1.1";
        this.field1855 = arg1;
        try {
            field1840 = System.getProperty("java.vendor");
            field1841 = System.getProperty("java.version");
        } catch (Exception var11) {
        }
        try {
            field1850 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var10) {
            field1850 = "unknown";
        }
        try {
            field1839 = System.getProperty("user.home");
            if (field1839 != null) {
                field1839 = field1839 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1839 == null) {
            field1839 = "~/";
        }
        try {
            this.field1847 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field1837 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1837 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1851 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1851 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method715(arg3, (byte) 45, arg4, arg2);
        }
        this.field1842 = false;
        this.field1853 = new Thread(this);
        this.field1853.setPriority(10);
        this.field1853.setDaemon(true);
        this.field1853.start();
    }
}
