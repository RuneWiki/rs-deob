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

@OriginalClass("mapview!v")
public class class40 implements Runnable {

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Le;")
    public class8 field502 = null;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "Z")
    private boolean field510 = false;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Ljava/io/File;")
    private File field506 = null;

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field511 = null;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Ljava/io/File;")
    public File field505 = null;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Le;")
    public class8 field507 = null;

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "Loa;")
    private class28 field516 = null;

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "Loa;")
    private class28 field518 = null;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "Le;")
    public class8 field515 = null;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field514;

    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field519;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "I")
    public static int field504 = 3;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "Ljava/lang/String;")
    public static String field503;

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Ljava/lang/String;")
    public static String field509;

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "Ljava/lang/String;")
    private static String field513;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field512;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field517;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "[Le;")
    public class8[] field508;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II)Loa;", line = 8)
    public final class28 method251(int arg0, int arg1) {
        if (arg0 >= -95) {
            this.method251(-3, 39);
        }
        return this.method254(3, null, (byte) -74, arg1, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 481)
    public class40(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field511 = arg1;
        field503 = "Unknown";
        field509 = "1.1";
        try {
            field503 = System.getProperty("java.vendor");
            field509 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field513 = System.getProperty("user.home");
            if (field513 != null) {
                field513 = field513 + "/";
            }
        } catch (Exception var14) {
        }
        if (field513 == null) {
            field513 = "~/";
        }
        try {
            this.field514 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field517 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field517 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field512 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field512 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method259(arg4, 0, arg3, arg2);
        }
        this.field510 = false;
        this.field519 = new Thread(this);
        this.field519.setPriority(10);
        this.field519.setDaemon(true);
        this.field519.start();
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IILjava/lang/Runnable;)Loa;", line = 23)
    public final class28 method252(int arg0, int arg1, Runnable arg2) {
        return arg1 == 0 ? this.method254(2, arg2, (byte) -74, arg0, 0) : (class28) null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/net/URL;I)Loa;", line = 40)
    public final class28 method253(URL arg0, int arg1) {
        if (arg1 != 707) {
            this.method255(-13);
        }
        return this.method254(4, arg0, (byte) -74, 0, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/lang/Object;BII)Loa;", line = 61)
    private final class28 method254(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class28 var6 = new class28();
        var6.field382 = arg1;
        var6.field383 = arg3;
        var6.field380 = arg0;
        synchronized (this) {
            if (this.field516 == null) {
                this.field516 = this.field518 = var6;
            } else {
                this.field516.field384 = var6;
                this.field516 = var6;
            }
            this.notify();
        }
        if (arg2 != -74) {
            this.field518 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 101)
    public final void method255(int arg0) {
        synchronized (this) {
            this.field510 = true;
            this.notifyAll();
        }
        try {
            this.field519.join();
        } catch (InterruptedException var14) {
        }
        if (this.field515 != null) {
            try {
                this.field515.method73(-100);
            } catch (IOException var13) {
            }
        }
        if (this.field507 != null) {
            try {
                this.field507.method73(arg0 ^ 0xFFFFFFA9);
            } catch (IOException var12) {
            }
        }
        if (this.field508 != null) {
            for (int var7 = 0; var7 < this.field508.length; var7++) {
                if (this.field508[var7] != null) {
                    try {
                        this.field508[var7].method73(arg0 ^ 0xFFFFFF94);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (arg0 != 10) {
            this.method255(23);
        }
        if (this.field502 != null) {
            try {
                this.field502.method73(arg0 ^ 0xFFFFFFB0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Loa;", line = 158)
    public final class28 method256(Class arg0, String arg1, boolean arg2) {
        if (arg2) {
            this.field516 = null;
        }
        return this.method254(9, new Object[] { arg0, arg1 }, (byte) -74, 0, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IILjava/lang/String;)Loa;", line = 171)
    public final class28 method257(int arg0, int arg1, String arg2) {
        if (arg0 < 78) {
            this.field519 = null;
        }
        return this.method254(1, arg2, (byte) -74, arg1, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "run", descriptor = "()V", line = 184)
    public final void run() {
        while (true) {
            class28 var2;
            synchronized (this) {
                while (true) {
                    if (this.field510) {
                        return;
                    }
                    if (this.field518 != null) {
                        var2 = this.field518;
                        this.field518 = this.field518.field384;
                        if (this.field518 == null) {
                            this.field516 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field380;
                if (var5 == 1) {
                    var2.field379 = new Socket(InetAddress.getByName((String) var2.field382), var2.field383);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field382);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field383);
                    var2.field379 = var8;
                } else if (var5 == 4) {
                    var2.field379 = new DataInputStream(((URL) var2.field382).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) var2.field382;
                    var2.field379 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field382;
                    var2.field379 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field381 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field381 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;BLjava/lang/Class;)Loa;", line = 283)
    public final class28 method258(String arg0, Class[] arg1, byte arg2, Class arg3) {
        int var5 = 38 % ((arg2 - 44) / 53);
        return this.method254(8, new Object[] { arg3, arg0, arg1 }, (byte) -74, 0, 0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IILjava/lang/String;I)V", line = 293)
    private final void method259(int arg0, int arg1, String arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field513, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = arg1; var7 < 2; var7++) {
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
                        if (this.field502 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field502 = new class8(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field502 = null;
                            }
                        }
                        if (this.field506 == null) {
                            try {
                                File var15 = new File(var11, arg2);
                                if (var7 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var7 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field515 = new class8(var17, "rw", 52428800L);
                                this.field508 = new class8[arg0];
                                for (int var18 = 0; var18 < arg0; var18++) {
                                    this.field508[var18] = new class8(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field507 = new class8(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field505 = this.field506 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field515.method73(-115);
                                    for (int var20 = 0; var20 < arg0; var20++) {
                                        this.field508[var20].method73(-87);
                                    }
                                    this.field507.method73(arg1 ^ 0xFFFFFF80);
                                } catch (Exception var23) {
                                }
                                this.field505 = this.field506 = null;
                                this.field508 = null;
                                this.field515 = this.field507 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field502 != null && this.field506 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field506 == null) {
            throw new RuntimeException();
        }
    }
}
