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

@OriginalClass("mapview!ua")
public class class39 implements Runnable {

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Lw;")
    private class41 field497 = null;

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "Lh;")
    public class15 field498 = null;

    @OriginalMember(owner = "mapview!ua", name = "i", descriptor = "Lw;")
    private class41 field505 = null;

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "Lh;")
    public class15 field503 = null;

    @OriginalMember(owner = "mapview!ua", name = "q", descriptor = "Z")
    private boolean field513 = false;

    @OriginalMember(owner = "mapview!ua", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field514 = null;

    @OriginalMember(owner = "mapview!ua", name = "l", descriptor = "Ljava/io/File;")
    private File field508 = null;

    @OriginalMember(owner = "mapview!ua", name = "m", descriptor = "Ljava/io/File;")
    public File field509 = null;

    @OriginalMember(owner = "mapview!ua", name = "o", descriptor = "Lh;")
    public class15 field511 = null;

    @OriginalMember(owner = "mapview!ua", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field512;

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field500;

    @OriginalMember(owner = "mapview!ua", name = "k", descriptor = "I")
    public static int field507 = 3;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Ljava/lang/String;")
    public static String field499;

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "Ljava/lang/String;")
    public static String field501;

    @OriginalMember(owner = "mapview!ua", name = "n", descriptor = "Ljava/lang/String;")
    private static String field510;

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field504;

    @OriginalMember(owner = "mapview!ua", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field506;

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "[Lh;")
    public class15[] field502;

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 485)
    public class39(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field514 = arg1;
        field501 = "1.1";
        field499 = "Unknown";
        try {
            field499 = System.getProperty("java.vendor");
            field501 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field510 = System.getProperty("user.home");
            if (field510 != null) {
                field510 = field510 + "/";
            }
        } catch (Exception var14) {
        }
        if (field510 == null) {
            field510 = "~/";
        }
        try {
            this.field512 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field504 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field504 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field506 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field506 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method251(124, arg2, arg4, arg3);
        }
        this.field513 = false;
        this.field500 = new Thread(this);
        this.field500.setPriority(10);
        this.field500.setDaemon(true);
        this.field500.start();
    }

    @OriginalMember(owner = "mapview!ua", name = "run", descriptor = "()V", line = 16)
    public final void run() {
        while (true) {
            class41 var2;
            synchronized (this) {
                while (true) {
                    if (this.field513) {
                        return;
                    }
                    if (this.field497 != null) {
                        var2 = this.field497;
                        this.field497 = this.field497.field525;
                        if (this.field497 == null) {
                            this.field505 = null;
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
                int var5 = var2.field526;
                if (var5 == 1) {
                    var2.field522 = new Socket(InetAddress.getByName((String) var2.field527), var2.field523);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field527);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field523);
                    var2.field522 = var6;
                } else if (var5 == 4) {
                    var2.field522 = new DataInputStream(((URL) var2.field527).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) var2.field527;
                    var2.field522 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field527;
                    var2.field522 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field524 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field524 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lw;", line = 108)
    public final class41 method245(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            this.field498 = null;
        }
        return this.method250(0, 3, arg0, 2, arg2);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lw;", line = 122)
    public final class41 method246(int arg0, Class arg1, String arg2) {
        return arg0 == -1898 ? this.method250(0, arg0 ^ 0xFFFFF895, new Object[] { arg1, arg2 }, 9, 0) : (class41) null;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lw;", line = 138)
    public final class41 method247(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 != -119) {
            field499 = null;
        }
        return this.method250(0, 3, new Object[] { arg2, arg1, arg3 }, 8, 0);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/net/URL;I)Lw;", line = 152)
    public final class41 method248(URL arg0, int arg1) {
        return arg1 == -4155 ? this.method250(0, arg1 + 4158, arg0, 4, 0) : (class41) null;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(ILjava/lang/String;I)Lw;", line = 169)
    public final class41 method249(int arg0, String arg1, int arg2) {
        return arg2 == -10298 ? this.method250(0, 3, arg1, 1, arg0) : (class41) null;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IILjava/lang/Object;II)Lw;", line = 180)
    private final class41 method250(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class41 var6 = new class41();
        var6.field523 = arg4;
        var6.field527 = arg2;
        var6.field526 = arg3;
        synchronized (this) {
            if (this.field505 == null) {
                this.field505 = this.field497 = var6;
            } else {
                this.field505.field525 = var6;
                this.field505 = var6;
            }
            if (arg1 == 3) {
                this.notify();
                return var6;
            } else {
                return (class41) null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IIILjava/lang/String;)V", line = 217)
    private final void method251(int arg0, int arg1, int arg2, String arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field510, "/tmp/", "" };
        int var7 = 0;
        if (arg0 <= 122) {
            this.method249(-120, null, 60);
        }
        while (var7 < 2) {
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
                        if (this.field503 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field503 = new class15(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field503 = null;
                            }
                        }
                        if (this.field508 == null) {
                            try {
                                File var15 = new File(var11, arg3);
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
                                this.field511 = new class15(var17, "rw", 52428800L);
                                this.field502 = new class15[arg2];
                                for (int var18 = 0; var18 < arg2; var18++) {
                                    this.field502[var18] = new class15(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field498 = new class15(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field509 = this.field508 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field511.method85(-1);
                                    for (int var20 = 0; var20 < arg2; var20++) {
                                        this.field502[var20].method85(-1);
                                    }
                                    this.field498.method85(-1);
                                } catch (Exception var23) {
                                }
                                this.field509 = this.field508 = null;
                                this.field502 = null;
                                this.field511 = this.field498 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field503 != null && this.field508 != null) {
                        return;
                    }
                }
            }
            var7++;
        }
        if (this.field508 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)V", line = 394)
    public final void method252(byte arg0) {
        synchronized (this) {
            this.field513 = true;
            this.notifyAll();
        }
        try {
            this.field500.join();
        } catch (InterruptedException var14) {
        }
        if (this.field511 != null) {
            try {
                this.field511.method85(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field498 != null) {
            try {
                this.field498.method85(-1);
            } catch (IOException var12) {
            }
        }
        if (this.field502 != null) {
            for (int var7 = 0; var7 < this.field502.length; var7++) {
                if (this.field502[var7] != null) {
                    try {
                        this.field502[var7].method85(-1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (arg0 >= -124) {
            this.field505 = null;
        }
        if (this.field503 != null) {
            try {
                this.field503.method85(-1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(BI)Lw;", line = 463)
    public final class41 method253(byte arg0, int arg1) {
        if (arg0 != 65) {
            this.method251(-71, 77, -6, null);
        }
        return this.method250(0, 3, null, 3, arg1);
    }
}
