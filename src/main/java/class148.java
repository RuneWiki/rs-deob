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

@OriginalClass("client!vb")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/io/File;")
    public File field3331 = null;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ll;")
    public class76 field3333 = null;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/io/File;")
    private File field3336 = null;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ll;")
    public class76 field3332 = null;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lgd;")
    private class46 field3335 = null;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lgd;")
    private class46 field3340 = null;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field3347 = 0;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
    private boolean field3348 = false;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field3349 = null;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3338;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field3337;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field3344 = 3;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ldc;")
    private class25 field3341;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3334;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/lang/String;")
    private static String field3339;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3343;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3342;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3345;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "[Ll;")
    public class76[] field3346;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lgd;")
    public final class46 method1119(Class[] arg0, byte arg1, String arg2, Class arg3) {
        if (arg1 <= 120) {
            field3342 = null;
        }
        return this.method1124(new Object[] { arg3, arg2, arg0 }, 8, 0, 0, 0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lgd;")
    public final class46 method1120(byte arg0, Class arg1, String arg2) {
        return arg0 == -104 ? this.method1124(new Object[] { arg1, arg2 }, 9, 0, 0, 0) : null;
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class46 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3348) {
                        return;
                    }
                    if (this.field3340 != null) {
                        var2 = this.field3340;
                        this.field3340 = this.field3340.field1144;
                        if (this.field3340 == null) {
                            this.field3335 = null;
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
                int var3 = var2.field1140;
                if (var3 == 1) {
                    var2.field1143 = new Socket(InetAddress.getByName((String) var2.field1142), var2.field1141);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1142);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1141);
                    var2.field1143 = var6;
                } else if (var3 == 4) {
                    var2.field1143 = new DataInputStream(((URL) var2.field1142).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1142;
                    var2.field1143 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1142;
                    var2.field1143 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1145 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1145 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lgd;")
    public final class46 method1121(Runnable arg0, int arg1, int arg2) {
        return arg2 < 6 ? null : this.method1124(arg0, 2, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/net/URL;)Lgd;")
    public final class46 method1122(int arg0, URL arg1) {
        if (arg0 >= -127) {
            this.method1123(113);
        }
        return this.method1124(arg1, 4, 0, 0, 0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method1123(int arg0) {
        if (arg0 != 0) {
            field3344 = -99;
        }
        synchronized (this) {
            this.field3348 = true;
            this.notifyAll();
        }
        try {
            this.field3337.join();
        } catch (InterruptedException var7) {
        }
        if (this.field3333 != null) {
            try {
                this.field3333.method584(0);
            } catch (IOException var6) {
            }
        }
        if (this.field3332 != null) {
            try {
                this.field3332.method584(0);
            } catch (IOException var5) {
            }
        }
        if (this.field3346 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3346.length; var3++) {
            if (this.field3346[var3] != null) {
                try {
                    this.field3346[var3].method584(0);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lgd;")
    private final class46 method1124(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class46 var6 = new class46();
        var6.field1141 = arg3;
        var6.field1142 = arg0;
        var6.field1140 = arg1;
        synchronized (this) {
            if (this.field3335 == null) {
                this.field3335 = this.field3340 = var6;
            } else {
                this.field3335.field1144 = var6;
                this.field3335 = var6;
            }
            this.notify();
        }
        return arg4 == 0 ? var6 : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;I)Lgd;")
    public final class46 method1125(byte arg0, String arg1, int arg2) {
        if (arg0 <= 83) {
            this.method1119(null, (byte) 46, null, null);
        }
        return this.method1124(arg1, 1, 0, arg2, 0);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Ldc;")
    public final class25 method1126(int arg0) {
        if (arg0 > -112) {
            this.field3348 = false;
        }
        return this.field3341;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method1127(int arg0, String arg1, int arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3339, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
                                    Random var15 = new Random();
                                    int var16;
                                    for (var16 = -1; var16 == -1; var16 = var15.nextInt()) {
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var16);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field3347 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var27) {
                            }
                        }
                        if (this.field3336 == null) {
                            try {
                                File var19 = new File(var12, arg1);
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
                                this.field3333 = new class76(var21, "rw", 52428800L);
                                this.field3346 = new class76[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field3346[var22] = new class76(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3332 = new class76(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3331 = this.field3336 = var19;
                            } catch (Exception var26) {
                                try {
                                    this.field3333.method584(0);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field3346[var23].method584(0);
                                    }
                                    this.field3332.method584(0);
                                } catch (Exception var25) {
                                }
                                this.field3346 = null;
                                this.field3333 = this.field3332 = null;
                                this.field3331 = this.field3336 = null;
                            }
                        }
                    } catch (Exception var28) {
                    }
                    if (var7 && this.field3336 != null) {
                        return;
                    }
                }
            }
        }
        int var24 = 34 / ((arg2 - 45) / 50);
        if (this.field3336 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lgd;")
    public final class46 method1128(int arg0, int arg1) {
        int var3 = 96 % ((-arg1 - 21) / 62);
        return this.method1124(null, 3, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class148(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3343 = "1.1";
        this.field3349 = arg1;
        field3334 = "Unknown";
        try {
            field3334 = System.getProperty("java.vendor");
            field3343 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3339 = System.getProperty("user.home");
            if (field3339 != null) {
                field3339 = field3339 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3339 == null) {
            field3339 = "~/";
        }
        try {
            this.field3338 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3342 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3342 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3345 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3345 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1127(arg2, arg3, -47, arg4);
        }
        this.field3348 = false;
        this.field3337 = new Thread(this);
        this.field3337.setPriority(10);
        this.field3337.setDaemon(true);
        this.field3337.start();
    }
}
