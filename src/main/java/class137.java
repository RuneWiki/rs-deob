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

@OriginalClass("client!u")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Laf;")
    private class7 field3262 = null;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/io/File;")
    public File field3258 = null;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public int field3270 = 0;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Led;")
    public class33 field3265 = null;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Laf;")
    private class7 field3264 = null;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field3267 = null;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    private boolean field3259 = false;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Led;")
    public class33 field3276 = null;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Ljava/io/File;")
    private File field3266 = null;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3275;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field3261;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3268 = 3;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Lwe;")
    private class154 field3274;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3263;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Ljava/lang/String;")
    private static String field3272;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3273;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3260;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3269;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "[Led;")
    public class33[] field3271;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public final void method1064(int arg0) {
        synchronized (this) {
            this.field3259 = true;
            this.notifyAll();
        }
        try {
            this.field3261.join();
            if (arg0 != 0) {
                this.method1067(-96, null, null);
            }
        } catch (InterruptedException var7) {
        }
        if (this.field3276 != null) {
            try {
                this.field3276.method263(-113);
            } catch (IOException var6) {
            }
        }
        if (this.field3265 != null) {
            try {
                this.field3265.method263(22);
            } catch (IOException var5) {
            }
        }
        if (this.field3271 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3271.length; var3++) {
            if (this.field3271[var3] != null) {
                try {
                    this.field3271[var3].method263(arg0 ^ 0x78);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILjava/lang/Object;I)Laf;")
    private final class7 method1065(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class7 var6 = new class7();
        var6.field109 = arg3;
        if (arg0 != 0) {
            this.method1071(null, null, -15, null);
        }
        var6.field105 = arg4;
        var6.field110 = arg1;
        synchronized (this) {
            if (this.field3262 == null) {
                this.field3262 = this.field3264 = var6;
            } else {
                this.field3262.field107 = var6;
                this.field3262 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/Runnable;II)Laf;")
    public final class7 method1066(Runnable arg0, int arg1, int arg2) {
        if (arg1 != -23553) {
            this.method1072(-38, true);
        }
        return this.method1065(0, 2, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Laf;")
    public final class7 method1067(int arg0, String arg1, Class arg2) {
        if (arg0 != 0) {
            this.method1065(-88, -106, 29, null, 85);
        }
        return this.method1065(0, 9, 0, new Object[] { arg2, arg1 }, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILjava/lang/String;I)V")
    private final void method1068(int arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 95) {
            this.method1073(-19);
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3272, "/tmp/", "" };
        boolean var6 = false;
        String[] var7 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var6) {
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
                                    var6 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field3270 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field3266 == null) {
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
                                this.field3276 = new class33(var21, "rw", 52428800L);
                                this.field3271 = new class33[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field3271[var22] = new class33(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3265 = new class33(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3258 = this.field3266 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field3276.method263(-118);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field3271[var23].method263(2);
                                    }
                                    this.field3265.method263(-62);
                                } catch (Exception var24) {
                                }
                                this.field3271 = null;
                                this.field3258 = this.field3266 = null;
                                this.field3276 = this.field3265 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var6 && this.field3266 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3266 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/net/URL;)Laf;")
    public final class7 method1069(int arg0, URL arg1) {
        if (arg0 < 112) {
            field3268 = 48;
        }
        return this.method1065(0, 4, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;IB)Laf;")
    public final class7 method1070(String arg0, int arg1, byte arg2) {
        if (arg2 != -69) {
            this.method1071(null, null, -52, null);
        }
        return this.method1065(0, 1, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Laf;")
    public final class7 method1071(Class[] arg0, String arg1, int arg2, Class arg3) {
        if (arg2 != 21417) {
            this.method1071(null, null, 31, null);
        }
        return this.method1065(0, 8, 0, new Object[] { arg3, arg1, arg0 }, 0);
    }

    @OriginalMember(owner = "client!u", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class7 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3259) {
                        return;
                    }
                    if (this.field3264 != null) {
                        var2 = this.field3264;
                        this.field3264 = this.field3264.field107;
                        if (this.field3264 == null) {
                            this.field3262 = null;
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
                int var3 = var2.field110;
                if (var3 == 1) {
                    var2.field106 = new Socket(InetAddress.getByName((String) var2.field109), var2.field105);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field109);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field105);
                    var2.field106 = var4;
                } else if (var3 == 4) {
                    var2.field106 = new DataInputStream(((URL) var2.field109).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field109;
                    var2.field106 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field109;
                    var2.field106 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field108 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field108 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Laf;")
    public final class7 method1072(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1071(null, null, -4, null);
        }
        return this.method1065(0, 3, 0, null, arg0);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lwe;")
    public final class154 method1073(int arg0) {
        if (arg0 > -81) {
            this.run();
        }
        return this.field3274;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class137(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3273 = "1.1";
        this.field3267 = arg1;
        field3263 = "Unknown";
        try {
            field3263 = System.getProperty("java.vendor");
            field3273 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3272 = System.getProperty("user.home");
            if (field3272 != null) {
                field3272 = field3272 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3272 == null) {
            field3272 = "~/";
        }
        try {
            this.field3275 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3260 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3260 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3269 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3269 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1068(arg2, 127, arg3, arg4);
        }
        this.field3259 = false;
        this.field3261 = new Thread(this);
        this.field3261.setPriority(10);
        this.field3261.setDaemon(true);
        this.field3261.start();
    }
}
