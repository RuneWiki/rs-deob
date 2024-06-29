import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class133 implements Runnable {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lle;")
    private class81 field3352 = null;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Lbc;")
    public class11 field3351 = null;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field3360 = 0;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lle;")
    private class81 field3361 = null;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
    private boolean field3362 = false;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/io/File;")
    private File field3359 = null;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field3365 = null;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Lbc;")
    public class11 field3363 = null;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Ljava/io/File;")
    public File field3364 = null;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3356;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field3353;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3358 = 3;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lgf;")
    private class48 field3366;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3350;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Ljava/lang/String;")
    private static String field3354;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3357;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3349;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3355;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "[Lbc;")
    public class11[] field3367;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;I)V", line = 4)
    private final void method1078(int arg0, int arg1, String arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        if (arg1 < 17) {
            this.method1080(54, 11);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field3354, "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        boolean var7 = false;
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var7) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    int var15 = -1;
                                    Random var16 = new Random();
                                    while (var15 == -1) {
                                        var15 = var16.nextInt();
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var15);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    var7 = true;
                                    this.field3360 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field3359 == null) {
                            try {
                                File var19 = new File(var12, arg2);
                                if (var8 == 1 && !var19.exists()) {
                                    boolean var20 = var19.mkdir();
                                    if (!var20) {
                                        continue;
                                    }
                                }
                                File var21 = new File(var19, "main_file_cache.dat2");
                                if (var8 == 0 && !var21.exists()) {
                                    continue;
                                }
                                this.field3363 = new class11(var21, "rw", 52428800L);
                                this.field3367 = new class11[arg0];
                                for (int var22 = 0; var22 < arg0; var22++) {
                                    this.field3367[var22] = new class11(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3351 = new class11(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3364 = this.field3359 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field3363.method145(-1);
                                    for (int var23 = 0; var23 < arg0; var23++) {
                                        this.field3367[var23].method145(-1);
                                    }
                                    this.field3351.method145(-1);
                                } catch (Exception var24) {
                                }
                                this.field3367 = null;
                                this.field3363 = this.field3351 = null;
                                this.field3364 = this.field3359 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field3359 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3359 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tc", name = "run", descriptor = "()V", line = 198)
    public final void run() {
        while (true) {
            class81 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3362) {
                        return;
                    }
                    if (this.field3361 != null) {
                        var2 = this.field3361;
                        this.field3361 = this.field3361.field1818;
                        if (this.field3361 == null) {
                            this.field3352 = null;
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
                int var3 = var2.field1817;
                if (var3 == 1) {
                    var2.field1820 = new Socket(InetAddress.getByName((String) var2.field1815), var2.field1819);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1815);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1819);
                    var2.field1820 = var4;
                } else if (var3 == 4) {
                    var2.field1820 = new DataInputStream(((URL) var2.field1815).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1815;
                    var2.field1820 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1815;
                    var2.field1820 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1816 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1816 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lle;", line = 292)
    public final class81 method1079(Class arg0, int arg1, String arg2) {
        if (arg1 < 8) {
            field3354 = null;
        }
        return this.method1082(9, 8, 0, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lle;", line = 303)
    public final class81 method1080(int arg0, int arg1) {
        return arg0 == 0 ? this.method1082(3, 8, arg1, 0, null) : null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Lgf;", line = 316)
    public final class48 method1081(int arg0) {
        if (arg0 >= -13) {
            this.field3352 = null;
        }
        return this.field3366;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 508)
    public class133(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3350 = "1.1";
        field3357 = "Unknown";
        this.field3365 = arg1;
        try {
            field3357 = System.getProperty("java.vendor");
            field3350 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3354 = System.getProperty("user.home");
            if (field3354 != null) {
                field3354 = field3354 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3354 == null) {
            field3354 = "~/";
        }
        try {
            this.field3356 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3349 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3349 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3355 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3355 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1078(arg4, 100, arg3, arg2);
        }
        this.field3362 = false;
        this.field3353 = new Thread(this);
        this.field3353.setPriority(10);
        this.field3353.setDaemon(true);
        this.field3353.start();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/lang/Object;)Lle;", line = 335)
    private final class81 method1082(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class81 var6 = new class81();
        var6.field1815 = arg4;
        var6.field1817 = arg0;
        var6.field1819 = arg2;
        synchronized (this) {
            if (this.field3352 == null) {
                this.field3352 = this.field3361 = var6;
            } else {
                this.field3352.field1818 = var6;
                this.field3352 = var6;
            }
            if (arg1 == 8) {
                this.notify();
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/String;I)Lle;", line = 370)
    public final class81 method1083(int arg0, String arg1, int arg2) {
        int var4 = 117 / ((-arg2 - 57) / 58);
        return this.method1082(1, 8, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lle;", line = 387)
    public final class81 method1084(Class arg0, int arg1, Class[] arg2, String arg3) {
        if (arg1 != 0) {
            this.method1079(null, 6, null);
        }
        return this.method1082(8, 8, 0, 0, new Object[] { arg0, arg3, arg2 });
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/net/URL;)Lle;", line = 397)
    public final class81 method1085(int arg0, URL arg1) {
        return arg0 == 2699 ? this.method1082(4, 8, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 412)
    public final void method1086(int arg0) {
        if (arg0 != 11621) {
            return;
        }
        synchronized (this) {
            this.field3362 = true;
            this.notifyAll();
        }
        try {
            this.field3353.join();
        } catch (InterruptedException var7) {
        }
        if (this.field3363 != null) {
            try {
                this.field3363.method145(arg0 - 11622);
            } catch (IOException var6) {
            }
        }
        if (this.field3351 != null) {
            try {
                this.field3351.method145(arg0 - 11622);
            } catch (IOException var5) {
            }
        }
        if (this.field3367 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3367.length; var3++) {
            if (this.field3367[var3] != null) {
                try {
                    this.field3367[var3].method145(-1);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lle;", line = 466)
    public final class81 method1087(int arg0, Runnable arg1, byte arg2) {
        if (arg2 != 125) {
            this.method1084(null, 122, null, null);
        }
        return this.method1082(2, 8, arg0, 0, arg1);
    }
}
