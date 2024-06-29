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

@OriginalClass("client!qf")
public class class150 implements Runnable {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lkc;")
    public class93 field2932 = null;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljava/io/File;")
    private File field2931 = null;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Ljava/io/File;")
    public File field2940 = null;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    private boolean field2936 = false;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lkc;")
    public class93 field2934 = null;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Loc;")
    private class129 field2935 = null;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lkc;")
    public class93 field2942 = null;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Loc;")
    private class129 field2938 = null;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field2947 = null;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2943;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2944;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2949 = 3;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lf;")
    private class48 field2945;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2937;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Ljava/lang/String;")
    private static String field2941;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2948;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2939;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2946;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lkc;")
    public class93[] field2933;

    @OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class129 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2936) {
                        return;
                    }
                    if (this.field2935 != null) {
                        var2 = this.field2935;
                        this.field2935 = this.field2935.field2544;
                        if (this.field2935 == null) {
                            this.field2938 = null;
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
                int var3 = var2.field2545;
                if (var3 == 1) {
                    var2.field2548 = new Socket(InetAddress.getByName((String) var2.field2547), var2.field2546);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2547);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2546);
                    var2.field2548 = var6;
                } else if (var3 == 4) {
                    var2.field2548 = new DataInputStream(((URL) var2.field2547).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2547;
                    var2.field2548 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2547;
                    var2.field2548 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field2543 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2543 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Loc;")
    public final class129 method1050(Class arg0, String arg1, int arg2) {
        return arg2 == 23292 ? this.method1051(9, 0, (byte) 53, 0, new Object[] { arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBILjava/lang/Object;)Loc;")
    private final class129 method1051(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        class129 var6 = new class129();
        if (arg2 != 53) {
            this.method1058(null, null, null, (byte) 34);
        }
        var6.field2545 = arg0;
        var6.field2546 = arg1;
        var6.field2547 = arg4;
        synchronized (this) {
            if (this.field2938 == null) {
                this.field2938 = this.field2935 = var6;
            } else {
                this.field2938.field2544 = var6;
                this.field2938 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/Runnable;)Loc;")
    public final class129 method1052(int arg0, int arg1, Runnable arg2) {
        if (arg0 != 2) {
            this.method1052(89, 108, null);
        }
        return this.method1051(2, arg1, (byte) 53, 0, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZILjava/lang/String;I)V")
    private final void method1053(boolean arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2941, "/tmp/", "" };
        if (!arg0) {
            this.field2944 = null;
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
                        if (this.field2932 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2932 = new class93(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2932 = null;
                            }
                        }
                        if (this.field2931 == null) {
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
                                this.field2934 = new class93(var16, "rw", 104857600L);
                                this.field2933 = new class93[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field2933[var17] = new class93(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2942 = new class93(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2940 = this.field2931 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2934.method746(-72);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field2933[var18].method746(-115);
                                    }
                                    this.field2942.method746(-68);
                                } catch (Exception var19) {
                                }
                                this.field2940 = this.field2931 = null;
                                this.field2934 = this.field2942 = null;
                                this.field2933 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2932 != null && this.field2931 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2931 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lf;")
    public final class48 method1054(byte arg0) {
        if (arg0 != -115) {
            this.method1054((byte) 126);
        }
        return this.field2945;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/lang/String;)Loc;")
    public final class129 method1055(int arg0, int arg1, String arg2) {
        if (arg1 != 1) {
            field2939 = null;
        }
        return this.method1051(1, arg0, (byte) 53, 0, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public final void method1056(byte arg0) {
        synchronized (this) {
            this.field2936 = true;
            this.notifyAll();
        }
        if (arg0 > -56) {
            return;
        }
        try {
            this.field2944.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2934 != null) {
            try {
                this.field2934.method746(-102);
            } catch (IOException var7) {
            }
        }
        if (this.field2942 != null) {
            try {
                this.field2942.method746(-60);
            } catch (IOException var6) {
            }
        }
        if (this.field2933 != null) {
            for (int var3 = 0; var3 < this.field2933.length; var3++) {
                if (this.field2933[var3] != null) {
                    try {
                        this.field2933[var3].method746(-87);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2932 != null) {
            try {
                this.field2932.method746(-81);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Loc;")
    public final class129 method1057(int arg0, byte arg1) {
        return arg1 == 22 ? this.method1051(3, arg0, (byte) 53, 0, null) : null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;B)Loc;")
    public final class129 method1058(Class[] arg0, String arg1, Class arg2, byte arg3) {
        if (arg3 != 58) {
            this.method1051(77, 2, (byte) 4, -118, null);
        }
        return this.method1051(8, 0, (byte) 53, 0, new Object[] { arg2, arg1, arg0 });
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class150(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2937 = "1.1";
        this.field2947 = arg1;
        field2948 = "Unknown";
        try {
            field2948 = System.getProperty("java.vendor");
            field2937 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2941 = System.getProperty("user.home");
            if (field2941 != null) {
                field2941 = field2941 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2941 == null) {
            field2941 = "~/";
        }
        try {
            this.field2943 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2939 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2939 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2946 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2946 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1053(true, arg2, arg3, arg4);
        }
        this.field2936 = false;
        this.field2944 = new Thread(this);
        this.field2944.setPriority(10);
        this.field2944.setDaemon(true);
        this.field2944.start();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/net/URL;I)Loc;")
    public final class129 method1059(URL arg0, int arg1) {
        if (arg1 < 59) {
            this.field2944 = null;
        }
        return this.method1051(4, 0, (byte) 53, 0, arg0);
    }
}
