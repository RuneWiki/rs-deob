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

@OriginalClass("mapview!p")
public class class30 implements Runnable {

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Lwa;")
    public class44 field386 = null;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lc;")
    private class6 field390 = null;

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lc;")
    private class6 field388 = null;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "Lwa;")
    public class44 field400 = null;

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Ljava/io/File;")
    public File field398 = null;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field389 = null;

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "Ljava/io/File;")
    private File field401 = null;

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "Lwa;")
    public class44 field402 = null;

    @OriginalMember(owner = "mapview!p", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field394;

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field396;

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "I")
    public static int field397 = 3;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Ljava/lang/String;")
    private static String field387;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ljava/lang/String;")
    public static String field391;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Ljava/lang/String;")
    public static String field395;

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field399;

    @OriginalMember(owner = "mapview!p", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field403;

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "[Lwa;")
    public class44[] field393;

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 487)
    public class30(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field395 = "1.1";
        field391 = "Unknown";
        this.field389 = arg1;
        try {
            field391 = System.getProperty("java.vendor");
            field395 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field387 = System.getProperty("user.home");
            if (field387 != null) {
                field387 = field387 + "/";
            }
        } catch (Exception var14) {
        }
        if (field387 == null) {
            field387 = "~/";
        }
        try {
            this.field394 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field399 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field399 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field403 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field403 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method189(-70, arg2, arg4, arg3);
        }
        this.field392 = false;
        this.field396 = new Thread(this);
        this.field396.setPriority(10);
        this.field396.setDaemon(true);
        this.field396.start();
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lc;", line = 16)
    public final class6 method181(byte arg0, Class arg1, String arg2) {
        return arg0 <= 125 ? (class6) null : this.method186(0, false, new Object[] { arg1, arg2 }, 0, 9);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(II)Lc;", line = 32)
    public final class6 method182(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method181((byte) 2, null, null);
        }
        return this.method186(0, false, null, arg1, 3);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 46)
    public final void method183(int arg0) {
        synchronized (this) {
            this.field392 = true;
            this.notifyAll();
            if (arg0 != 2) {
                this.method182(-10, 103);
            }
        }
        try {
            this.field396.join();
        } catch (InterruptedException var14) {
        }
        if (this.field402 != null) {
            try {
                this.field402.method270(false);
            } catch (IOException var13) {
            }
        }
        if (this.field386 != null) {
            try {
                this.field386.method270(false);
            } catch (IOException var12) {
            }
        }
        if (this.field393 != null) {
            for (int var7 = 0; var7 < this.field393.length; var7++) {
                if (this.field393[var7] != null) {
                    try {
                        this.field393[var7].method270(false);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field400 != null) {
            try {
                this.field400.method270(false);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ILjava/lang/String;I)Lc;", line = 105)
    public final class6 method184(int arg0, String arg1, int arg2) {
        int var4 = -14 / ((9 - arg2) / 47);
        return this.method186(0, false, arg1, arg0, 1);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(BLjava/lang/Runnable;I)Lc;", line = 126)
    public final class6 method185(byte arg0, Runnable arg1, int arg2) {
        int var4 = 98 / ((-arg0 - 18) / 37);
        return this.method186(0, false, arg1, arg2, 2);
    }

    @OriginalMember(owner = "mapview!p", name = "run", descriptor = "()V", line = 143)
    public final void run() {
        while (true) {
            class6 var2;
            synchronized (this) {
                while (true) {
                    if (this.field392) {
                        return;
                    }
                    if (this.field390 != null) {
                        var2 = this.field390;
                        this.field390 = this.field390.field77;
                        if (this.field390 == null) {
                            this.field388 = null;
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
                int var5 = var2.field75;
                if (var5 == 1) {
                    var2.field76 = new Socket(InetAddress.getByName((String) var2.field78), var2.field79);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field78);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field79);
                    var2.field76 = var8;
                } else if (var5 == 4) {
                    var2.field76 = new DataInputStream(((URL) var2.field78).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) var2.field78;
                    var2.field76 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field78;
                    var2.field76 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field74 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field74 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IZLjava/lang/Object;II)Lc;", line = 237)
    private final class6 method186(int arg0, boolean arg1, Object arg2, int arg3, int arg4) {
        if (arg1) {
            this.run();
        }
        class6 var6 = new class6();
        var6.field78 = arg2;
        var6.field79 = arg3;
        var6.field75 = arg4;
        synchronized (this) {
            if (this.field388 == null) {
                this.field388 = this.field390 = var6;
            } else {
                this.field388.field77 = var6;
                this.field388 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(ZLjava/net/URL;)Lc;", line = 271)
    public final class6 method187(boolean arg0, URL arg1) {
        return arg0 ? (class6) null : this.method186(0, false, arg1, 0, 4);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lc;", line = 284)
    public final class6 method188(Class arg0, byte arg1, String arg2, Class[] arg3) {
        if (arg1 != -1) {
            this.field394 = null;
        }
        return this.method186(0, false, new Object[] { arg0, arg2, arg3 }, 0, 8);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIILjava/lang/String;)V", line = 325)
    private final void method189(int arg0, int arg1, int arg2, String arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        int var6 = 86 % ((arg0 - 18) / 59);
        String[] var7 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field387, "/tmp/", "" };
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
                        if (this.field400 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field400 = new class44(var14, "rw", 25L);
                                }
                            } catch (Exception var26) {
                                this.field400 = null;
                            }
                        }
                        if (this.field401 == null) {
                            try {
                                File var16 = new File(var12, arg3);
                                if (var8 == 1 && !var16.exists()) {
                                    boolean var17 = var16.mkdir();
                                    if (!var17) {
                                        continue;
                                    }
                                }
                                File var18 = new File(var16, "main_file_cache.dat2");
                                if (var8 == 0 && !var18.exists()) {
                                    continue;
                                }
                                this.field402 = new class44(var18, "rw", 104857600L);
                                this.field393 = new class44[arg2];
                                for (int var19 = 0; var19 < arg2; var19++) {
                                    this.field393[var19] = new class44(new File(var16, "main_file_cache.idx" + var19), "rw", 1048576L);
                                }
                                this.field386 = new class44(new File(var16, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field398 = this.field401 = var16;
                            } catch (Exception var25) {
                                try {
                                    this.field402.method270(false);
                                    for (int var21 = 0; var21 < arg2; var21++) {
                                        this.field393[var21].method270(false);
                                    }
                                    this.field386.method270(false);
                                } catch (Exception var24) {
                                }
                                this.field393 = null;
                                this.field402 = this.field386 = null;
                                this.field398 = this.field401 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (this.field400 != null && this.field401 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field401 == null) {
            throw new RuntimeException();
        }
    }
}
