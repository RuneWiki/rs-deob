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

@OriginalClass("client!ve")
public class class151 implements Runnable {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Z")
    private boolean field3447 = false;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lpc;")
    public class107 field3446 = null;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljava/io/File;")
    private File field3451 = null;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field3453 = null;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lpc;")
    public class107 field3456 = null;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lke;")
    private class74 field3459 = null;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lpc;")
    public class107 field3448 = null;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Ljava/io/File;")
    public File field3460 = null;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lke;")
    private class74 field3462 = null;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3452;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3458;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3450 = 3;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lic;")
    private class59 field3455;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3454;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ljava/lang/String;")
    private static String field3457;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3463;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3449;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3461;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lpc;")
    public class107[] field3445;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Lke;")
    public final class74 method1168(String arg0, Class arg1, Class[] arg2, int arg3) {
        if (arg3 < 77) {
            this.method1172(104, -62, null);
        }
        return this.method1175(8, 1048576, new Object[] { arg1, arg0, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lke;")
    public final class74 method1169(Class arg0, byte arg1, String arg2) {
        int var4 = 65 / ((arg1 - 17) / 63);
        return this.method1175(9, 1048576, new Object[] { arg0, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/Runnable;)Lke;")
    public final class74 method1170(int arg0, int arg1, Runnable arg2) {
        return arg1 == 20919 ? this.method1175(2, 1048576, arg2, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lke;")
    public final class74 method1171(int arg0, int arg1) {
        return arg1 == 3 ? this.method1175(3, 1048576, null, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/String;)Lke;")
    public final class74 method1172(int arg0, int arg1, String arg2) {
        if (arg0 < 102) {
            this.method1169(null, (byte) -101, null);
        }
        return this.method1175(1, 1048576, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/net/URL;I)Lke;")
    public final class74 method1173(URL arg0, int arg1) {
        return arg1 <= 97 ? null : this.method1175(4, 1048576, arg0, 0, 0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public final void method1174(int arg0) {
        synchronized (this) {
            this.field3447 = true;
            if (arg0 != 0) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field3458.join();
        } catch (InterruptedException var10) {
        }
        if (this.field3448 != null) {
            try {
                this.field3448.method769((byte) -9);
            } catch (IOException var9) {
            }
        }
        if (this.field3456 != null) {
            try {
                this.field3456.method769((byte) -11);
            } catch (IOException var8) {
            }
        }
        if (this.field3445 != null) {
            for (int var3 = 0; var3 < this.field3445.length; var3++) {
                if (this.field3445[var3] != null) {
                    try {
                        this.field3445[var3].method769((byte) -52);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field3446 != null) {
            try {
                this.field3446.method769((byte) -28);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/Object;II)Lke;")
    private final class74 method1175(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class74 var6 = new class74();
        var6.field1595 = arg0;
        var6.field1593 = arg4;
        if (arg1 != 1048576) {
            field3454 = null;
        }
        var6.field1594 = arg2;
        synchronized (this) {
            if (this.field3462 == null) {
                this.field3462 = this.field3459 = var6;
            } else {
                this.field3462.field1592 = var6;
                this.field3462 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class74 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3447) {
                        return;
                    }
                    if (this.field3459 != null) {
                        var2 = this.field3459;
                        this.field3459 = this.field3459.field1592;
                        if (this.field3459 == null) {
                            this.field3462 = null;
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
                int var3 = var2.field1595;
                if (var3 == 1) {
                    var2.field1590 = new Socket(InetAddress.getByName((String) var2.field1594), var2.field1593);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1594);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1593);
                    var2.field1590 = var6;
                } else if (var3 == 4) {
                    var2.field1590 = new DataInputStream(((URL) var2.field1594).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1594;
                    var2.field1590 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1594;
                    var2.field1590 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1591 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1591 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lic;")
    public final class59 method1176(int arg0) {
        int var2 = -62 / ((-arg0 - 64) / 44);
        return this.field3455;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILjava/lang/String;I)V")
    private final void method1177(int arg0, int arg1, String arg2, int arg3) {
        if (arg1 != 1) {
            this.method1176(-15);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3457, "/tmp/", "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
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
                        if (this.field3446 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3446 = new class107(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3446 = null;
                            }
                        }
                        if (this.field3451 == null) {
                            try {
                                File var14 = new File(var11, arg2);
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
                                this.field3448 = new class107(var16, "rw", 52428800L);
                                this.field3445 = new class107[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field3445[var17] = new class107(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3456 = new class107(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3460 = this.field3451 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3448.method769((byte) -82);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field3445[var18].method769((byte) -32);
                                    }
                                    this.field3456.method769((byte) -126);
                                } catch (Exception var19) {
                                }
                                this.field3445 = null;
                                this.field3460 = this.field3451 = null;
                                this.field3448 = this.field3456 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3446 != null && this.field3451 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3451 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class151(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field3453 = arg1;
        field3463 = "Unknown";
        field3454 = "1.1";
        try {
            field3463 = System.getProperty("java.vendor");
            field3454 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3457 = System.getProperty("user.home");
            if (field3457 != null) {
                field3457 = field3457 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3457 == null) {
            field3457 = "~/";
        }
        try {
            this.field3452 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3449 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3449 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3461 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3461 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1177(arg2, 1, arg3, arg4);
        }
        this.field3447 = false;
        this.field3458 = new Thread(this);
        this.field3458.setPriority(10);
        this.field3458.setDaemon(true);
        this.field3458.start();
    }
}
