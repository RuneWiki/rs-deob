import java.applet.Applet;
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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 implements Runnable {

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lma;")
    private class25 field132 = null;

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "I")
    public int field129 = 0;

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Lk;")
    public class19 field136 = null;

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field130 = null;

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "Lma;")
    private class25 field137 = null;

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "Lk;")
    public class19 field138 = null;

    @OriginalMember(owner = "mapview!da", name = "m", descriptor = "Z")
    private boolean field139 = false;

    @OriginalMember(owner = "mapview!da", name = "p", descriptor = "Ljava/lang/String;")
    private String field142 = null;

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Ljava/lang/String;")
    public String field128 = null;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ljava/lang/String;")
    public String field127 = null;

    @OriginalMember(owner = "mapview!da", name = "s", descriptor = "Ljava/lang/String;")
    private String field145 = null;

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field135;

    @OriginalMember(owner = "mapview!da", name = "n", descriptor = "[Lk;")
    public class19[] field140;

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field133;

    @OriginalMember(owner = "mapview!da", name = "q", descriptor = "I")
    public static int field143 = 3;

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Ljava/lang/String;")
    public static String field131;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Ljava/lang/String;")
    private static String field134;

    @OriginalMember(owner = "mapview!da", name = "t", descriptor = "Ljava/lang/String;")
    public static String field146;

    @OriginalMember(owner = "mapview!da", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field141;

    @OriginalMember(owner = "mapview!da", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field144;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(II)Lma;", line = 4)
    public final class25 method75(int arg0, int arg1) {
        if (arg0 >= -127) {
            this.method78(-1, null);
        }
        return this.method82(1, 0, (byte) 120, null, arg1);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lma;", line = 17)
    public final class25 method76(int arg0, Class arg1, String arg2) {
        if (arg0 != 7) {
            this.field140 = null;
        }
        return this.method82(10, 0, (byte) -119, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(II)Lma;", line = 37)
    public final class25 method77(int arg0, int arg1) {
        return arg0 == 3 ? this.method82(3, 0, (byte) -10, null, arg1) : (class25) null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ILjava/net/URL;)Lma;", line = 47)
    public final class25 method78(int arg0, URL arg1) {
        if (arg0 > -115) {
            this.method84(-43, null, null, null);
        }
        return this.method82(4, 0, (byte) 115, arg1, 0);
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 57)
    private final void method79(String arg0, byte arg1, int arg2) {
        if (field134 == null) {
            field134 = "~/";
        }
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field134, "/tmp/", "" };
        String var5 = ".file_store_" + arg2;
        for (int var6 = 0; var6 < var4.length; var6++) {
            try {
                String var7 = var4[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var5);
                if (var9.exists() || var9.mkdir()) {
                    if (arg0.length() > 0) {
                        var9 = new File(var9, arg0);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field127 = this.field145 = var9.getParent() + "/";
                    this.field128 = this.field142 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        if (arg1 != 62) {
            this.method84(-75, null, null, null);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!da", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 426)
    public class8(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field131 = "1.1";
        this.field130 = arg1;
        field146 = "Unknown";
        this.field135 = arg2;
        try {
            field146 = System.getProperty("java.vendor");
            field131 = System.getProperty("java.version");
            field134 = System.getProperty("user.home");
            if (field134 != null) {
                field134 = field134 + "/";
            }
        } catch (Exception var13) {
        }
        try {
            if (arg1 == null) {
                field144 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field144 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field141 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field141 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method79(arg4, (byte) 62, arg3);
            this.field138 = new class19(new File(this.field142 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field140 = new class19[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field140[var10] = new class19(new File(this.field142 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field136 = new class19(new File(this.field142 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method80(99999999);
        }
        this.field139 = false;
        this.field133 = new Thread(this);
        this.field133.setPriority(10);
        this.field133.setDaemon(true);
        this.field133.start();
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 150)
    private final void method80(int arg0) {
        try {
            File var2 = new File(this.field145 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field145 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            if (arg0 != 99999999) {
                field144 = null;
            }
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field145 + "uid.dat"));
            this.field129 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)V", line = 181)
    public final void method81(int arg0) {
        synchronized (this) {
            this.field139 = true;
            this.notifyAll();
        }
        try {
            this.field133.join();
            if (arg0 != -722) {
                this.method80(-11);
            }
        } catch (InterruptedException var12) {
        }
        if (this.field138 != null) {
            try {
                this.field138.method130(arg0 + 29686);
            } catch (IOException var11) {
            }
        }
        if (this.field136 != null) {
            try {
                this.field136.method130(28964);
            } catch (IOException var10) {
            }
        }
        if (this.field140 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field140.length; var7++) {
            if (this.field140[var7] != null) {
                try {
                    this.field140[var7].method130(28964);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!da", name = "run", descriptor = "()V", line = 246)
    public final void run() {
        while (true) {
            class25 var2;
            synchronized (this) {
                while (true) {
                    if (this.field139) {
                        return;
                    }
                    if (this.field137 != null) {
                        var2 = this.field137;
                        this.field137 = this.field137.field298;
                        if (this.field137 == null) {
                            this.field132 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field302;
                if (var5 == 1) {
                    var2.field299 = new Socket(this.field135, var2.field301);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field303);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field301);
                    var2.field299 = var8;
                } else if (var5 == 4) {
                    var2.field299 = new DataInputStream(((URL) var2.field303).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field303;
                    var2.field299 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field303;
                    var2.field299 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field300 = 1;
            } catch (Exception var10) {
                var2.field300 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lma;", line = 336)
    private final class25 method82(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class25 var6 = new class25();
        var6.field301 = arg4;
        var6.field303 = arg3;
        int var7 = 89 / ((67 - arg2) / 42);
        var6.field302 = arg0;
        synchronized (this) {
            if (this.field132 == null) {
                this.field132 = this.field137 = var6;
            } else {
                this.field132.field298 = var6;
                this.field132 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lma;", line = 369)
    public final class25 method83(int arg0, Runnable arg1, int arg2) {
        return arg2 == 2 ? this.method82(2, 0, (byte) 122, arg1, arg0) : (class25) null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lma;", line = 397)
    public final class25 method84(int arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != -10434) {
            this.field130 = null;
        }
        return this.method82(9, 0, (byte) 110, new Object[] { arg3, arg1, arg2 }, 0);
    }
}
