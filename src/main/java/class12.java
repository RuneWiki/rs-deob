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

@OriginalClass("mapview!fa")
public class class12 implements Runnable {

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field98 = null;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lh;")
    public class15 field97 = null;

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lh;")
    public class15 field96 = null;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Ljava/io/File;")
    private File field101 = null;

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "Lp;")
    private class29 field95 = null;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Z")
    private boolean field102 = false;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "Lp;")
    private class29 field100 = null;

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "Lh;")
    public class15 field108 = null;

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "Ljava/io/File;")
    public File field110 = null;

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field105;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field94;

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "I")
    public static int field103 = 3;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field104;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "Ljava/lang/String;")
    public static String field106;

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "Ljava/lang/String;")
    private static String field99;

    @OriginalMember(owner = "mapview!fa", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field109;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field93;

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "[Lh;")
    public class15[] field107;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lp;", line = 4)
    public final class29 method86(Runnable arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method91(false, -18);
        }
        return this.method88(0, 2, arg0, 0, arg2);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IZLjava/lang/String;)Lp;", line = 30)
    public final class29 method87(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method89((byte) 122);
        }
        return this.method88(0, 1, arg2, 0, arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 485)
    public class12(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field106 = "1.1";
        this.field98 = arg1;
        field104 = "Unknown";
        try {
            field104 = System.getProperty("java.vendor");
            field106 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field99 = System.getProperty("user.home");
            if (field99 != null) {
                field99 = field99 + "/";
            }
        } catch (Exception var14) {
        }
        if (field99 == null) {
            field99 = "~/";
        }
        try {
            this.field105 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field109 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field109 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field93 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field93 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method92(arg2, arg3, false, arg4);
        }
        this.field102 = false;
        this.field94 = new Thread(this);
        this.field94.setPriority(10);
        this.field94.setDaemon(true);
        this.field94.start();
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IILjava/lang/Object;II)Lp;", line = 48)
    private final class29 method88(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class29 var6 = new class29();
        var6.field412 = arg4;
        var6.field415 = arg2;
        if (arg3 != 0) {
            field106 = null;
        }
        var6.field414 = arg1;
        synchronized (this) {
            if (this.field100 == null) {
                this.field100 = this.field95 = var6;
            } else {
                this.field100.field416 = var6;
                this.field100 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 75)
    public final void method89(byte arg0) {
        synchronized (this) {
            this.field102 = true;
            this.notifyAll();
        }
        try {
            this.field94.join();
        } catch (InterruptedException var14) {
        }
        if (arg0 < 39) {
            return;
        }
        if (this.field97 != null) {
            try {
                this.field97.method108((byte) 58);
            } catch (IOException var13) {
            }
        }
        if (this.field108 != null) {
            try {
                this.field108.method108((byte) 42);
            } catch (IOException var12) {
            }
        }
        if (this.field107 != null) {
            for (int var7 = 0; var7 < this.field107.length; var7++) {
                if (this.field107[var7] != null) {
                    try {
                        this.field107[var7].method108((byte) 90);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field96 != null) {
            try {
                this.field96.method108((byte) 61);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lp;", line = 132)
    public final class29 method90(Class arg0, int arg1, String arg2) {
        if (arg1 < 69) {
            this.method90(null, -103, null);
        }
        return this.method88(0, 9, new Object[] { arg0, arg2 }, 0, 0);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZI)Lp;", line = 149)
    public final class29 method91(boolean arg0, int arg1) {
        if (arg0) {
            this.field108 = null;
        }
        return this.method88(0, 3, null, 0, arg1);
    }

    @OriginalMember(owner = "mapview!fa", name = "run", descriptor = "()V", line = 165)
    public final void run() {
        while (true) {
            class29 var2;
            synchronized (this) {
                while (true) {
                    if (this.field102) {
                        return;
                    }
                    if (this.field95 != null) {
                        var2 = this.field95;
                        this.field95 = this.field95.field416;
                        if (this.field95 == null) {
                            this.field100 = null;
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
                int var5 = var2.field414;
                if (var5 == 1) {
                    var2.field413 = new Socket(InetAddress.getByName((String) var2.field415), var2.field412);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field415);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field412);
                    var2.field413 = var8;
                } else if (var5 == 4) {
                    var2.field413 = new DataInputStream(((URL) var2.field415).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) var2.field415;
                    var2.field413 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field415;
                    var2.field413 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field417 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field417 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/lang/String;ZI)V", line = 256)
    private final void method92(int arg0, String arg1, boolean arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field99, "/tmp/", "" };
        if (arg2) {
            field93 = null;
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
                        if (this.field96 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field96 = new class15(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field96 = null;
                            }
                        }
                        if (this.field101 == null) {
                            try {
                                File var15 = new File(var11, arg1);
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
                                this.field97 = new class15(var17, "rw", 52428800L);
                                this.field107 = new class15[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field107[var18] = new class15(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field108 = new class15(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field110 = this.field101 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field97.method108((byte) 120);
                                    for (int var20 = 0; var20 < arg3; var20++) {
                                        this.field107[var20].method108((byte) 87);
                                    }
                                    this.field108.method108((byte) 127);
                                } catch (Exception var23) {
                                }
                                this.field97 = this.field108 = null;
                                this.field107 = null;
                                this.field110 = this.field101 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field96 != null && this.field101 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field101 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lp;", line = 425)
    public final class29 method93(Class[] arg0, Class arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            this.method86(null, true, 47);
        }
        return this.method88(0, 8, new Object[] { arg1, arg2, arg0 }, 0, 0);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ILjava/net/URL;)Lp;", line = 469)
    public final class29 method94(int arg0, URL arg1) {
        int var3 = 16 % ((arg0 + 48) / 33);
        return this.method88(0, 4, arg1, 0, 0);
    }
}
