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

@OriginalClass("client!t")
public class class189 implements Runnable {

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lgd;")
    public class64 field3657 = null;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Ljava/io/File;")
    private File field3654 = null;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lgd;")
    public class64 field3658 = null;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "Ljava/io/File;")
    public File field3660 = null;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Z")
    private boolean field3653 = false;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lgd;")
    public class64 field3665 = null;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lfd;")
    private class55 field3656 = null;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lfd;")
    private class55 field3655 = null;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field3661 = null;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3667;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3652;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field3663 = 3;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Luf;")
    private class205 field3649;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "Ljava/lang/String;")
    private static String field3651;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3659;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3666;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3662;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3664;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[Lgd;")
    public class64[] field3650;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/net/URL;)Lfd;")
    public final class55 method1251(int arg0, URL arg1) {
        if (arg0 > -7) {
            this.method1259(null, 1, 123);
        }
        return this.method1254(0, 0, arg1, 4, 14176);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Luf;")
    public final class205 method1252(int arg0) {
        if (arg0 != 0) {
            this.method1252(-97);
        }
        return this.field3649;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public final void method1253(boolean arg0) {
        synchronized (this) {
            this.field3653 = arg0;
            this.notifyAll();
        }
        try {
            this.field3652.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3658 != null) {
            try {
                this.field3658.method424((byte) 49);
            } catch (IOException var7) {
            }
        }
        if (this.field3665 != null) {
            try {
                this.field3665.method424((byte) 67);
            } catch (IOException var6) {
            }
        }
        if (this.field3650 != null) {
            for (int var3 = 0; var3 < this.field3650.length; var3++) {
                if (this.field3650[var3] != null) {
                    try {
                        this.field3650[var3].method424((byte) -92);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3657 != null) {
            try {
                this.field3657.method424((byte) 62);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/lang/Object;II)Lfd;")
    private final class55 method1254(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        if (arg4 != 14176) {
            this.method1260(null, null, true);
        }
        class55 var6 = new class55();
        var6.field1088 = arg1;
        var6.field1086 = arg2;
        var6.field1091 = arg3;
        synchronized (this) {
            if (this.field3656 == null) {
                this.field3656 = this.field3655 = var6;
            } else {
                this.field3656.field1087 = var6;
                this.field3656 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Lfd;")
    public final class55 method1255(int arg0, byte arg1) {
        return arg1 < 20 ? null : this.method1254(0, arg0, null, 3, 14176);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILjava/lang/Runnable;)Lfd;")
    public final class55 method1256(int arg0, int arg1, Runnable arg2) {
        return arg0 == 3360 ? this.method1254(0, arg1, arg2, 2, arg0 ^ 0x3A40) : null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lfd;")
    public final class55 method1257(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 >= -101) {
            this.method1252(-89);
        }
        return this.method1254(0, 0, new Object[] { arg2, arg1, arg3 }, 8, 14176);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
    private final void method1258(String arg0, int arg1, byte arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3651, "/tmp/", "" };
        if (arg2 != -46) {
            return;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    try {
                        String var10 = var6[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var5[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field3657 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3657 = new class64(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3657 = null;
                            }
                        }
                        if (this.field3654 == null) {
                            try {
                                File var14 = new File(var11, arg0);
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
                                this.field3658 = new class64(var16, "rw", 104857600L);
                                this.field3650 = new class64[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field3650[var17] = new class64(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3665 = new class64(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3660 = this.field3654 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3658.method424((byte) -90);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field3650[var18].method424((byte) 101);
                                    }
                                    this.field3665.method424((byte) 70);
                                } catch (Exception var19) {
                                }
                                this.field3660 = this.field3654 = null;
                                this.field3658 = this.field3665 = null;
                                this.field3650 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3657 != null && this.field3654 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3654 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class55 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3653) {
                        return;
                    }
                    if (this.field3655 != null) {
                        var2 = this.field3655;
                        this.field3655 = this.field3655.field1087;
                        if (this.field3655 == null) {
                            this.field3656 = null;
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
                int var3 = var2.field1091;
                if (var3 == 1) {
                    var2.field1090 = new Socket(InetAddress.getByName((String) var2.field1086), var2.field1088);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1086);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1088);
                    var2.field1090 = var4;
                } else if (var3 == 4) {
                    var2.field1090 = new DataInputStream(((URL) var2.field1086).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1086;
                    var2.field1090 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1086;
                    var2.field1090 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1089 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1089 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;II)Lfd;")
    public final class55 method1259(String arg0, int arg1, int arg2) {
        int var4 = -4 % ((arg2 + 28) / 41);
        return this.method1254(0, arg1, arg0, 1, 14176);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Lfd;")
    public final class55 method1260(String arg0, Class arg1, boolean arg2) {
        return arg2 ? null : this.method1254(0, 0, new Object[] { arg1, arg0 }, 9, 14176);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class189(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3666 = "Unknown";
        this.field3661 = arg1;
        field3659 = "1.1";
        try {
            field3666 = System.getProperty("java.vendor");
            field3659 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3651 = System.getProperty("user.home");
            if (field3651 != null) {
                field3651 = field3651 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3651 == null) {
            field3651 = "~/";
        }
        try {
            this.field3667 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3662 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3662 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3664 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3664 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1258(arg3, arg4, (byte) -46, arg2);
        }
        this.field3653 = false;
        this.field3652 = new Thread(this);
        this.field3652.setPriority(10);
        this.field3652.setDaemon(true);
        this.field3652.start();
    }
}
