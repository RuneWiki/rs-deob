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

@OriginalClass("mapview!ea")
public class class9 implements Runnable {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Z")
    private boolean field82 = false;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Loa;")
    private class29 field83 = null;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Ljava/io/File;")
    private File field90 = null;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Ljava/io/File;")
    public File field87 = null;

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Loa;")
    private class29 field92 = null;

    @OriginalMember(owner = "mapview!ea", name = "o", descriptor = "Lh;")
    public class14 field96 = null;

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lh;")
    public class14 field93 = null;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Lh;")
    public class14 field85 = null;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ljava/applet/Applet;")
    public Applet field84 = null;

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field95;

    @OriginalMember(owner = "mapview!ea", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field97;

    @OriginalMember(owner = "mapview!ea", name = "r", descriptor = "I")
    public static int field99 = 3;

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Ljava/lang/String;")
    public static String field89;

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Ljava/lang/String;")
    private static String field94;

    @OriginalMember(owner = "mapview!ea", name = "q", descriptor = "Ljava/lang/String;")
    public static String field98;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field88;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field91;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "[Lh;")
    public class14[] field86;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILjava/lang/String;I)Loa;", line = 10)
    public final class29 method46(int arg0, String arg1, int arg2) {
        if (arg2 <= 30) {
            this.field92 = null;
        }
        return this.method50(0, 1, arg1, arg0, (byte) 124);
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 491)
    public class9(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field98 = "1.1";
        field89 = "Unknown";
        this.field84 = arg1;
        try {
            field89 = System.getProperty("java.vendor");
            field98 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field94 = System.getProperty("user.home");
            if (field94 != null) {
                field94 = field94 + "/";
            }
        } catch (Exception var14) {
        }
        if (field94 == null) {
            field94 = "~/";
        }
        try {
            this.field95 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field88 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field88 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field91 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field91 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method48(arg3, (byte) 112, arg2, arg4);
        }
        this.field82 = false;
        this.field97 = new Thread(this);
        this.field97.setPriority(10);
        this.field97.setDaemon(true);
        this.field97.start();
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/net/URL;I)Loa;", line = 31)
    public final class29 method47(URL arg0, int arg1) {
        if (arg1 != 0) {
            field88 = null;
        }
        return this.method50(0, 4, arg0, 0, (byte) 124);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;BII)V", line = 48)
    private final void method48(String arg0, byte arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field94, "/tmp/", "" };
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
                        if (this.field96 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field96 = new class14(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field96 = null;
                            }
                        }
                        if (this.field90 == null) {
                            try {
                                File var15 = new File(var11, arg0);
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
                                this.field93 = new class14(var17, "rw", 104857600L);
                                this.field86 = new class14[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field86[var18] = new class14(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field85 = new class14(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field87 = this.field90 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field93.method102((byte) -45);
                                    for (int var20 = 0; var20 < arg3; var20++) {
                                        this.field86[var20].method102((byte) -45);
                                    }
                                    this.field85.method102((byte) -45);
                                } catch (Exception var23) {
                                }
                                this.field93 = this.field85 = null;
                                this.field86 = null;
                                this.field87 = this.field90 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field96 != null && this.field90 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field90 == null) {
            throw new RuntimeException();
        } else if (arg1 < 104) {
            this.method46(-125, null, 54);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BI)Loa;", line = 218)
    public final class29 method49(byte arg0, int arg1) {
        if (arg0 >= -52) {
            this.field85 = null;
        }
        return this.method50(0, 3, null, arg1, (byte) 124);
    }

    @OriginalMember(owner = "mapview!ea", name = "run", descriptor = "()V", line = 231)
    public final void run() {
        while (true) {
            class29 var2;
            synchronized (this) {
                while (true) {
                    if (this.field82) {
                        return;
                    }
                    if (this.field92 != null) {
                        var2 = this.field92;
                        this.field92 = this.field92.field404;
                        if (this.field92 == null) {
                            this.field83 = null;
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
                int var5 = var2.field400;
                if (var5 == 1) {
                    var2.field401 = new Socket(InetAddress.getByName((String) var2.field403), var2.field402);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field403);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field402);
                    var2.field401 = var6;
                } else if (var5 == 4) {
                    var2.field401 = new DataInputStream(((URL) var2.field403).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) var2.field403;
                    var2.field401 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field403;
                    var2.field401 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field399 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field399 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IILjava/lang/Object;IB)Loa;", line = 329)
    private final class29 method50(int arg0, int arg1, Object arg2, int arg3, byte arg4) {
        class29 var6 = new class29();
        if (arg4 != 124) {
            this.field93 = null;
        }
        var6.field400 = arg1;
        var6.field402 = arg3;
        var6.field403 = arg2;
        synchronized (this) {
            if (this.field83 == null) {
                this.field83 = this.field92 = var6;
            } else {
                this.field83.field404 = var6;
                this.field83 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 363)
    public final void method51(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                return;
            }
            this.field82 = true;
            this.notifyAll();
        }
        try {
            this.field97.join();
        } catch (InterruptedException var14) {
        }
        if (this.field93 != null) {
            try {
                this.field93.method102((byte) -45);
            } catch (IOException var13) {
            }
        }
        if (this.field85 != null) {
            try {
                this.field85.method102((byte) -45);
            } catch (IOException var12) {
            }
        }
        if (this.field86 != null) {
            for (int var7 = 0; var7 < this.field86.length; var7++) {
                if (this.field86[var7] != null) {
                    try {
                        this.field86[var7].method102((byte) -45);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field96 != null) {
            try {
                this.field96.method102((byte) -45);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IILjava/lang/Runnable;)Loa;", line = 427)
    public final class29 method52(int arg0, int arg1, Runnable arg2) {
        if (arg0 < 110) {
            this.method47(null, 25);
        }
        return this.method50(0, 2, arg2, arg1, (byte) 124);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Loa;", line = 447)
    public final class29 method53(String arg0, Class arg1, int arg2) {
        int var4 = 35 / ((59 - arg2) / 46);
        return this.method50(0, 9, new Object[] { arg1, arg0 }, 0, (byte) 124);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Loa;", line = 461)
    public final class29 method54(String arg0, int arg1, Class arg2, Class[] arg3) {
        return arg1 == 12392 ? this.method50(0, 8, new Object[] { arg2, arg0, arg3 }, 0, (byte) 124) : (class29) null;
    }
}
