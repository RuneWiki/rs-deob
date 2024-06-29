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

@OriginalClass("client!bb")
public class class10 implements Runnable {

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field159 = null;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lie;")
    private class61 field162 = null;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Ljava/io/File;")
    public File field163 = null;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lpe;")
    public class109 field165 = null;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lpe;")
    public class109 field155 = null;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lie;")
    private class61 field169 = null;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Z")
    private boolean field171 = false;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lpe;")
    public class109 field158 = null;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Ljava/io/File;")
    private File field168 = null;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field172;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field156;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field167 = 3;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Ld;")
    private class22 field164;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Ljava/lang/String;")
    private static String field160;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field170;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field173;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field157;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field166;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[Lpe;")
    public class109[] field161;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lie;")
    public final class61 method77(int arg0, boolean arg1) {
        return arg1 ? null : this.method83(-78, arg0, 0, 3, null);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lie;")
    public final class61 method78(int arg0, Class arg1, Class[] arg2, String arg3) {
        if (arg0 <= 14) {
            this.method78(-58, null, null, null);
        }
        return this.method83(-40, 0, 0, 8, new Object[] { arg1, arg3, arg2 });
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public final void method79(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                return;
            }
            this.field171 = true;
            this.notifyAll();
        }
        try {
            this.field156.join();
        } catch (InterruptedException var10) {
        }
        if (this.field158 != null) {
            try {
                this.field158.method844(0);
            } catch (IOException var9) {
            }
        }
        if (this.field155 != null) {
            try {
                this.field155.method844(arg0);
            } catch (IOException var8) {
            }
        }
        if (this.field161 != null) {
            for (int var3 = 0; var3 < this.field161.length; var3++) {
                if (this.field161[var3] != null) {
                    try {
                        this.field161[var3].method844(0);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field165 != null) {
            try {
                this.field165.method844(0);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lie;")
    public final class61 method80(Class arg0, int arg1, String arg2) {
        if (arg1 != 2911) {
            field170 = null;
        }
        return this.method83(-47, 0, 0, 9, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Ld;")
    public final class22 method81(int arg0) {
        if (arg0 != -13684) {
            this.field164 = null;
        }
        return this.field164;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/lang/String;B)Lie;")
    public final class61 method82(int arg0, String arg1, byte arg2) {
        int var4 = -109 / ((64 - arg2) / 35);
        return this.method83(-100, arg0, 0, 1, arg1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILjava/lang/Object;)Lie;")
    private final class61 method83(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class61 var6 = new class61();
        if (arg0 >= -38) {
            this.method84(-66, (byte) -49, null, -80);
        }
        var6.field1318 = arg1;
        var6.field1316 = arg3;
        var6.field1317 = arg4;
        synchronized (this) {
            if (this.field162 == null) {
                this.field162 = this.field169 = var6;
            } else {
                this.field162.field1321 = var6;
                this.field162 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/lang/String;I)V")
    private final void method84(int arg0, byte arg1, String arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field160, "/tmp/", "" };
        if (arg1 != -75) {
            this.method83(-16, -1, -100, -41, null);
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
                        if (this.field165 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field165 = new class109(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field165 = null;
                            }
                        }
                        if (this.field168 == null) {
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
                                this.field158 = new class109(var16, "rw", 52428800L);
                                this.field161 = new class109[arg0];
                                for (int var17 = 0; var17 < arg0; var17++) {
                                    this.field161[var17] = new class109(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field155 = new class109(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field163 = this.field168 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field158.method844(0);
                                    for (int var18 = 0; var18 < arg0; var18++) {
                                        this.field161[var18].method844(0);
                                    }
                                    this.field155.method844(0);
                                } catch (Exception var19) {
                                }
                                this.field158 = this.field155 = null;
                                this.field161 = null;
                                this.field163 = this.field168 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field165 != null && this.field168 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field168 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class61 var2;
            synchronized (this) {
                while (true) {
                    if (this.field171) {
                        return;
                    }
                    if (this.field169 != null) {
                        var2 = this.field169;
                        this.field169 = this.field169.field1321;
                        if (this.field169 == null) {
                            this.field162 = null;
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
                int var3 = var2.field1316;
                if (var3 == 1) {
                    var2.field1319 = new Socket(InetAddress.getByName((String) var2.field1317), var2.field1318);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1317);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1318);
                    var2.field1319 = var4;
                } else if (var3 == 4) {
                    var2.field1319 = new DataInputStream(((URL) var2.field1317).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1317;
                    var2.field1319 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field1317;
                    var2.field1319 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1320 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1320 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/net/URL;I)Lie;")
    public final class61 method85(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.method84(11, (byte) -35, null, -66);
        }
        return this.method83(-94, 0, 0, 4, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class10(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field170 = "1.1";
        this.field159 = arg1;
        field173 = "Unknown";
        try {
            field173 = System.getProperty("java.vendor");
            field170 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field160 = System.getProperty("user.home");
            if (field160 != null) {
                field160 = field160 + "/";
            }
        } catch (Exception var9) {
        }
        if (field160 == null) {
            field160 = "~/";
        }
        try {
            this.field172 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field166 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field166 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field157 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field157 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method84(arg4, (byte) -75, arg3, arg2);
        }
        this.field171 = false;
        this.field156 = new Thread(this);
        this.field156.setPriority(10);
        this.field156.setDaemon(true);
        this.field156.start();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lie;")
    public final class61 method86(Runnable arg0, int arg1, int arg2) {
        if (arg1 <= 81) {
            this.method84(45, (byte) -55, null, 21);
        }
        return this.method83(-75, arg2, 0, 2, arg0);
    }
}
