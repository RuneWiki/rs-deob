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

@OriginalClass("client!vf")
public class class152 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Loe;")
    public class102 field3425 = null;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Ljava/io/File;")
    private File field3428 = null;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field3430 = null;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lbd;")
    private class12 field3429 = null;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Loe;")
    public class102 field3434 = null;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lbd;")
    private class12 field3427 = null;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Z")
    private boolean field3423 = false;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Ljava/io/File;")
    public File field3433 = null;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Loe;")
    public class102 field3437 = null;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3431;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field3432;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field3436 = 3;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Luf;")
    private class145 field3426;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3435;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "Ljava/lang/String;")
    private static String field3438;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3440;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3424;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3439;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[Loe;")
    public class102[] field3422;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lbd;")
    public final class12 method1123(int arg0, int arg1) {
        return arg0 == 1048576 ? this.method1132(3, null, (byte) 113, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILjava/lang/String;I)V")
    private final void method1124(int arg0, int arg1, String arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3438, "/tmp/", "" };
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        int var7 = 1 / ((-arg3 - 78) / 34);
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
                        if (this.field3437 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field3437 = new class102(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field3437 = null;
                            }
                        }
                        if (this.field3428 == null) {
                            try {
                                File var15 = new File(var12, arg2);
                                if (var8 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var8 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field3425 = new class102(var17, "rw", 52428800L);
                                this.field3422 = new class102[arg1];
                                for (int var18 = 0; var18 < arg1; var18++) {
                                    this.field3422[var18] = new class102(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field3434 = new class102(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3433 = this.field3428 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field3425.method782((byte) 60);
                                    for (int var19 = 0; var19 < arg1; var19++) {
                                        this.field3422[var19].method782((byte) 88);
                                    }
                                    this.field3434.method782((byte) 48);
                                } catch (Exception var20) {
                                }
                                this.field3425 = this.field3434 = null;
                                this.field3433 = this.field3428 = null;
                                this.field3422 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field3437 != null && this.field3428 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3428 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/net/URL;I)Lbd;")
    public final class12 method1125(URL arg0, int arg1) {
        return arg1 == 32729 ? this.method1132(4, arg0, (byte) 78, 0, 0) : null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lbd;")
    public final class12 method1126(Class[] arg0, int arg1, Class arg2, String arg3) {
        if (arg1 != -31554) {
            this.method1132(126, null, (byte) 35, 18, 67);
        }
        return this.method1132(8, new Object[] { arg2, arg3, arg0 }, (byte) 94, 0, 0);
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class12 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3423) {
                        return;
                    }
                    if (this.field3429 != null) {
                        var2 = this.field3429;
                        this.field3429 = this.field3429.field267;
                        if (this.field3429 == null) {
                            this.field3427 = null;
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
                int var3 = var2.field266;
                if (var3 == 1) {
                    var2.field269 = new Socket(InetAddress.getByName((String) var2.field271), var2.field270);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field271);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field270);
                    var2.field269 = var6;
                } else if (var3 == 4) {
                    var2.field269 = new DataInputStream(((URL) var2.field271).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field271;
                    var2.field269 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field271;
                    var2.field269 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field268 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field268 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;BI)Lbd;")
    public final class12 method1127(String arg0, byte arg1, int arg2) {
        int var4 = -30 % ((64 - arg1) / 47);
        return this.method1132(1, arg0, (byte) 65, 0, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lbd;")
    public final class12 method1128(int arg0, Runnable arg1, int arg2) {
        if (arg0 != -17306) {
            this.field3437 = null;
        }
        return this.method1132(2, arg1, (byte) 97, 0, arg2);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public final void method1129(boolean arg0) {
        synchronized (this) {
            this.field3423 = arg0;
            this.notifyAll();
        }
        try {
            this.field3432.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3425 != null) {
            try {
                this.field3425.method782((byte) 82);
            } catch (IOException var7) {
            }
        }
        if (this.field3434 != null) {
            try {
                this.field3434.method782((byte) -101);
            } catch (IOException var6) {
            }
        }
        if (this.field3422 != null) {
            for (int var3 = 0; var3 < this.field3422.length; var3++) {
                if (this.field3422[var3] != null) {
                    try {
                        this.field3422[var3].method782((byte) 86);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3437 != null) {
            try {
                this.field3437.method782((byte) 73);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lbd;")
    public final class12 method1130(Class arg0, String arg1, int arg2) {
        if (arg2 > -17) {
            this.method1126(null, 22, null, null);
        }
        return this.method1132(9, new Object[] { arg0, arg1 }, (byte) 43, 0, 0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Luf;")
    public final class145 method1131(int arg0) {
        return arg0 < 80 ? null : this.field3426;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILjava/lang/Object;BII)Lbd;")
    private final class12 method1132(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 29) {
            this.field3430 = null;
        }
        class12 var6 = new class12();
        var6.field270 = arg4;
        var6.field266 = arg0;
        var6.field271 = arg1;
        synchronized (this) {
            if (this.field3427 == null) {
                this.field3427 = this.field3429 = var6;
            } else {
                this.field3427.field267 = var6;
                this.field3427 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class152(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3435 = "Unknown";
        this.field3430 = arg1;
        field3440 = "1.1";
        try {
            field3435 = System.getProperty("java.vendor");
            field3440 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3438 = System.getProperty("user.home");
            if (field3438 != null) {
                field3438 = field3438 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3438 == null) {
            field3438 = "~/";
        }
        try {
            this.field3431 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3424 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3424 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3439 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3439 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1124(arg2, arg4, arg3, -126);
        }
        this.field3423 = false;
        this.field3432 = new Thread(this);
        this.field3432.setPriority(10);
        this.field3432.setDaemon(true);
        this.field3432.start();
    }
}
