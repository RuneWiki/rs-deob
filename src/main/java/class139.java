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

@OriginalClass("client!ue")
public class class139 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field3253 = 0;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/io/File;")
    private File field3257 = null;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Lwe;")
    public class151 field3250 = null;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Loc;")
    private class100 field3258 = null;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field3255 = null;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Loc;")
    private class100 field3247 = null;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lwe;")
    public class151 field3261 = null;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
    private boolean field3264 = false;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Ljava/io/File;")
    public File field3256 = null;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3252;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field3246;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3248 = 3;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lma;")
    private class84 field3260;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3249;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Ljava/lang/String;")
    private static String field3254;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3259;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3251;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3262;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[Lwe;")
    public class151[] field3263;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Loc;")
    public final class100 method1023(int arg0, int arg1) {
        return arg0 == 24392 ? this.method1028(arg1, null, 3, -14292, 0) : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;)Loc;")
    public final class100 method1024(int arg0, int arg1, String arg2) {
        if (arg0 != -19452) {
            this.method1029((byte) -77);
        }
        return this.method1028(arg1, arg2, 1, -14292, 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method1025(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        boolean var6 = false;
        String[] var7 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field3254, "" };
        if (arg1 > -55) {
            this.method1032(-95);
        }
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var5.length; var9++) {
                for (int var10 = 0; var10 < var7.length; var10++) {
                    try {
                        String var11 = var7[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var5[var9]);
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
                                    this.field3253 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field3257 == null) {
                            try {
                                File var19 = new File(var12, arg0);
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
                                this.field3250 = new class151(var21, "rw", 52428800L);
                                this.field3263 = new class151[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field3263[var22] = new class151(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field3261 = new class151(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3256 = this.field3257 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field3250.method1212((byte) 121);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field3263[var23].method1212((byte) 109);
                                    }
                                    this.field3261.method1212((byte) 121);
                                } catch (Exception var24) {
                                }
                                this.field3263 = null;
                                this.field3256 = this.field3257 = null;
                                this.field3250 = this.field3261 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var6 && this.field3257 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3257 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;BLjava/lang/String;)Loc;")
    public final class100 method1026(Class arg0, Class[] arg1, byte arg2, String arg3) {
        return arg2 < 56 ? null : this.method1028(0, new Object[] { arg0, arg3, arg1 }, 9, -14292, 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Loc;")
    public final class100 method1027(String arg0, boolean arg1, Class arg2) {
        return arg1 ? this.method1028(0, new Object[] { arg2, arg0 }, 10, -14292, 0) : null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/Object;III)Loc;")
    private final class100 method1028(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class100 var6 = new class100();
        var6.field2285 = arg2;
        var6.field2283 = arg0;
        var6.field2284 = arg1;
        if (arg3 != -14292) {
            return null;
        }
        synchronized (this) {
            if (this.field3247 == null) {
                this.field3247 = this.field3258 = var6;
            } else {
                this.field3247.field2286 = var6;
                this.field3247 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final void method1029(byte arg0) {
        synchronized (this) {
            this.field3264 = true;
            this.notifyAll();
        }
        try {
            this.field3246.join();
        } catch (InterruptedException var7) {
        }
        if (this.field3250 != null) {
            try {
                this.field3250.method1212((byte) 126);
            } catch (IOException var6) {
            }
        }
        if (this.field3261 != null) {
            try {
                this.field3261.method1212((byte) 113);
            } catch (IOException var5) {
            }
        }
        if (arg0 >= -55) {
            this.field3257 = null;
        }
        if (this.field3263 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3263.length; var3++) {
            if (this.field3263[var3] != null) {
                try {
                    this.field3263[var3].method1212((byte) 112);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/net/URL;)Loc;")
    public final class100 method1030(int arg0, URL arg1) {
        if (arg0 != -11251) {
            field3262 = null;
        }
        return this.method1028(0, arg1, 4, -14292, 0);
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class100 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3264) {
                        return;
                    }
                    if (this.field3258 != null) {
                        var2 = this.field3258;
                        this.field3258 = this.field3258.field2286;
                        if (this.field3258 == null) {
                            this.field3247 = null;
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
                int var3 = var2.field2285;
                if (var3 == 1) {
                    var2.field2282 = new Socket(InetAddress.getByName((String) var2.field2284), var2.field2283);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2284);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2283);
                    var2.field2282 = var4;
                } else if (var3 == 4) {
                    var2.field2282 = new DataInputStream(((URL) var2.field2284).openStream());
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2284;
                    var2.field2282 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2284;
                    var2.field2282 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2281 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2281 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/Runnable;I)Loc;")
    public final class100 method1031(int arg0, Runnable arg1, int arg2) {
        return arg2 <= 44 ? null : this.method1028(arg0, arg1, 2, -14292, 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Lma;")
    public final class84 method1032(int arg0) {
        int var2 = 30 / ((16 - arg0) / 63);
        return this.field3260;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class139(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field3255 = arg1;
        field3259 = "1.1";
        field3249 = "Unknown";
        try {
            field3249 = System.getProperty("java.vendor");
            field3259 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3254 = System.getProperty("user.home");
            if (field3254 != null) {
                field3254 = field3254 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3254 == null) {
            field3254 = "~/";
        }
        try {
            this.field3252 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3251 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3251 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3262 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3262 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1025(arg3, -118, arg2, arg4);
        }
        this.field3264 = false;
        this.field3246 = new Thread(this);
        this.field3246.setPriority(10);
        this.field3246.setDaemon(true);
        this.field3246.start();
    }
}
