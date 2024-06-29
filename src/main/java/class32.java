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

@OriginalClass("mapview!q")
public class class32 implements Runnable {

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Lh;")
    public class15 field450 = null;

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Ljava/io/File;")
    public File field453 = null;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Laa;")
    private class2 field446 = null;

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Lh;")
    public class15 field452 = null;

    @OriginalMember(owner = "mapview!q", name = "p", descriptor = "Ljava/io/File;")
    private File field461 = null;

    @OriginalMember(owner = "mapview!q", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field459 = null;

    @OriginalMember(owner = "mapview!q", name = "m", descriptor = "Lh;")
    public class15 field458 = null;

    @OriginalMember(owner = "mapview!q", name = "o", descriptor = "Laa;")
    private class2 field460 = null;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field456;

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field448;

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "I")
    public static int field451 = 3;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "Ljava/lang/String;")
    public static String field454;

    @OriginalMember(owner = "mapview!q", name = "q", descriptor = "Ljava/lang/String;")
    private static String field462;

    @OriginalMember(owner = "mapview!q", name = "r", descriptor = "Ljava/lang/String;")
    public static String field463;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field455;

    @OriginalMember(owner = "mapview!q", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field457;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "[Lh;")
    public class15[] field449;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 4)
    public final void method210(int arg0) {
        synchronized (this) {
            this.field447 = true;
            this.notifyAll();
        }
        try {
            this.field448.join();
        } catch (InterruptedException var14) {
        }
        if (this.field452 != null) {
            try {
                this.field452.method64((byte) -107);
            } catch (IOException var13) {
            }
        }
        if (this.field450 != null) {
            try {
                this.field450.method64((byte) -107);
            } catch (IOException var12) {
            }
        }
        if (this.field449 != null) {
            for (int var7 = 0; var7 < this.field449.length; var7++) {
                if (this.field449[var7] != null) {
                    try {
                        this.field449[var7].method64((byte) -107);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (arg0 != 2) {
            this.method210(-122);
        }
        if (this.field458 != null) {
            try {
                this.field458.method64((byte) -107);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Laa;", line = 61)
    public final class2 method211(int arg0, Class arg1, String arg2) {
        int var4 = -2 / ((74 - arg0) / 52);
        return this.method216(9, 0, 0, new Object[] { arg1, arg2 }, -1092094288);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IILjava/lang/Runnable;)Laa;", line = 73)
    public final class2 method212(int arg0, int arg1, Runnable arg2) {
        if (arg1 >= -116) {
            this.method212(-53, 58, null);
        }
        return this.method216(2, arg0, 0, arg2, -1092094288);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(II)Laa;", line = 84)
    public final class2 method213(int arg0, int arg1) {
        int var3 = -39 % ((arg0 - 10) / 38);
        return this.method216(3, arg1, 0, null, -1092094288);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Laa;", line = 97)
    public final class2 method214(String arg0, Class arg1, Class[] arg2, int arg3) {
        return arg3 == 5 ? this.method216(8, 0, 0, new Object[] { arg1, arg0, arg2 }, -1092094288) : (class2) null;
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 479)
    public class32(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field454 = "1.1";
        this.field459 = arg1;
        field463 = "Unknown";
        try {
            field463 = System.getProperty("java.vendor");
            field454 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field462 = System.getProperty("user.home");
            if (field462 != null) {
                field462 = field462 + "/";
            }
        } catch (Exception var14) {
        }
        if (field462 == null) {
            field462 = "~/";
        }
        try {
            this.field456 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field455 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field455 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field457 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field457 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method218(arg3, arg2, 0, arg4);
        }
        this.field447 = false;
        this.field448 = new Thread(this);
        this.field448.setPriority(10);
        this.field448.setDaemon(true);
        this.field448.start();
    }

    @OriginalMember(owner = "mapview!q", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        while (true) {
            class2 var2;
            synchronized (this) {
                while (true) {
                    if (this.field447) {
                        return;
                    }
                    if (this.field446 != null) {
                        var2 = this.field446;
                        this.field446 = this.field446.field24;
                        if (this.field446 == null) {
                            this.field460 = null;
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
                int var5 = var2.field19;
                if (var5 == 1) {
                    var2.field23 = new Socket(InetAddress.getByName((String) var2.field21), var2.field22);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field21);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field22);
                    var2.field23 = var6;
                } else if (var5 == 4) {
                    var2.field23 = new DataInputStream(((URL) var2.field21).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) var2.field21;
                    var2.field23 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field21;
                    var2.field23 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field20 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field20 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(BLjava/lang/String;I)Laa;", line = 222)
    public final class2 method215(byte arg0, String arg1, int arg2) {
        return arg0 == 34 ? this.method216(1, arg2, 0, arg1, -1092094288) : (class2) null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIILjava/lang/Object;I)Laa;", line = 244)
    private final class2 method216(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg4 != -1092094288) {
            this.method216(124, -28, -124, null, 103);
        }
        class2 var6 = new class2();
        var6.field22 = arg1;
        var6.field19 = arg0;
        var6.field21 = arg3;
        synchronized (this) {
            if (this.field460 == null) {
                this.field460 = this.field446 = var6;
            } else {
                this.field460.field24 = var6;
                this.field460 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/net/URL;B)Laa;", line = 285)
    public final class2 method217(URL arg0, byte arg1) {
        return arg1 == -19 ? this.method216(4, 0, 0, arg0, arg1 - 1092094269) : (class2) null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Ljava/lang/String;III)V", line = 314)
    private final void method218(String arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field462, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = arg2; var7 < 2; var7++) {
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
                        if (this.field458 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field458 = new class15(var13, "rw", 25L);
                                }
                            } catch (Exception var25) {
                                this.field458 = null;
                            }
                        }
                        if (this.field461 == null) {
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
                                this.field452 = new class15(var17, "rw", 104857600L);
                                this.field449 = new class15[arg3];
                                for (int var18 = 0; var18 < arg3; var18++) {
                                    this.field449[var18] = new class15(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field450 = new class15(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field453 = this.field461 = var15;
                            } catch (Exception var24) {
                                try {
                                    this.field452.method64((byte) -107);
                                    for (int var20 = 0; var20 < arg3; var20++) {
                                        this.field449[var20].method64((byte) -107);
                                    }
                                    this.field450.method64((byte) -107);
                                } catch (Exception var23) {
                                }
                                this.field453 = this.field461 = null;
                                this.field452 = this.field450 = null;
                                this.field449 = null;
                            }
                        }
                    } catch (Exception var26) {
                    }
                    if (this.field458 != null && this.field461 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field461 == null) {
            throw new RuntimeException();
        }
    }
}
