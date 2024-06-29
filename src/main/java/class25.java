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

@OriginalClass("client!dc")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
    private boolean field451 = false;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lcc;")
    private class18 field450 = null;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lcc;")
    private class18 field462 = null;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field458 = null;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Llb;")
    public class78 field460 = null;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Ljava/io/File;")
    private File field463 = null;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Ljava/io/File;")
    public File field467 = null;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Llb;")
    public class78 field454 = null;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Llb;")
    public class78 field468 = null;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field459;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field453;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field465 = 3;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Ld;")
    private class22 field461;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/lang/String;")
    private static String field456;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field457;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field464;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field452;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field466;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[Llb;")
    public class78[] field455;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lcc;")
    public final class18 method173(boolean arg0, Class arg1, String arg2) {
        return arg0 ? this.method182(2, 0, 0, new Object[] { arg1, arg2 }, 9) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method174(int arg0, String arg1, int arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field456, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
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
                        if (this.field468 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field468 = new class78(var13, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field468 = null;
                            }
                        }
                        if (this.field463 == null) {
                            try {
                                File var14 = new File(var11, arg1);
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
                                this.field454 = new class78(var16, "rw", 52428800L);
                                this.field455 = new class78[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field455[var17] = new class78(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field460 = new class78(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field467 = this.field463 = var14;
                            } catch (Exception var21) {
                                try {
                                    this.field454.method625(0);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field455[var18].method625(0);
                                    }
                                    this.field460.method625(0);
                                } catch (Exception var20) {
                                }
                                this.field455 = null;
                                this.field454 = this.field460 = null;
                                this.field467 = this.field463 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field468 != null && this.field463 != null) {
                        return;
                    }
                }
            }
        }
        int var19 = -39 % ((arg2 + 53) / 53);
        if (this.field463 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lcc;")
    public final class18 method175(int arg0, Runnable arg1, int arg2) {
        return arg2 <= 101 ? null : this.method182(2, arg0, 0, arg1, 2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public final void method176(int arg0) {
        synchronized (this) {
            this.field451 = true;
            this.notifyAll();
        }
        if (arg0 != 4) {
            return;
        }
        try {
            this.field453.join();
        } catch (InterruptedException var8) {
        }
        if (this.field454 != null) {
            try {
                this.field454.method625(0);
            } catch (IOException var7) {
            }
        }
        if (this.field460 != null) {
            try {
                this.field460.method625(0);
            } catch (IOException var6) {
            }
        }
        if (this.field455 != null) {
            for (int var3 = 0; var3 < this.field455.length; var3++) {
                if (this.field455[var3] != null) {
                    try {
                        this.field455[var3].method625(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field468 != null) {
            try {
                this.field468.method625(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class18 var2;
            synchronized (this) {
                while (true) {
                    if (this.field451) {
                        return;
                    }
                    if (this.field450 != null) {
                        var2 = this.field450;
                        this.field450 = this.field450.field354;
                        if (this.field450 == null) {
                            this.field462 = null;
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
                int var3 = var2.field356;
                if (var3 == 1) {
                    var2.field352 = new Socket(InetAddress.getByName((String) var2.field357), var2.field353);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field357);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field353);
                    var2.field352 = var4;
                } else if (var3 == 4) {
                    var2.field352 = new DataInputStream(((URL) var2.field357).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field357;
                    var2.field352 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field357;
                    var2.field352 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field355 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field355 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Ld;")
    public final class22 method177(int arg0) {
        if (arg0 != -945) {
            this.method181(null, 76, -63);
        }
        return this.field461;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLjava/net/URL;)Lcc;")
    public final class18 method178(byte arg0, URL arg1) {
        if (arg0 != 45) {
            this.method175(85, null, -79);
        }
        return this.method182(2, 0, 0, arg1, 4);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lcc;")
    public final class18 method179(Class[] arg0, String arg1, int arg2, Class arg3) {
        return arg2 == 8 ? this.method182(arg2 - 6, 0, 0, new Object[] { arg3, arg1, arg0 }, 8) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lcc;")
    public final class18 method180(int arg0, int arg1) {
        if (arg1 >= -114) {
            field464 = null;
        }
        return this.method182(2, arg0, 0, null, 3);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;II)Lcc;")
    public final class18 method181(String arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field459 = null;
        }
        return this.method182(arg2, arg1, 0, arg0, 1);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILjava/lang/Object;I)Lcc;")
    private final class18 method182(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg0 != 2) {
            this.method180(126, 57);
        }
        class18 var6 = new class18();
        var6.field356 = arg4;
        var6.field357 = arg3;
        var6.field353 = arg1;
        synchronized (this) {
            if (this.field462 == null) {
                this.field462 = this.field450 = var6;
            } else {
                this.field462.field354 = var6;
                this.field462 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class25(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field458 = arg1;
        field464 = "Unknown";
        field457 = "1.1";
        try {
            field464 = System.getProperty("java.vendor");
            field457 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field456 = System.getProperty("user.home");
            if (field456 != null) {
                field456 = field456 + "/";
            }
        } catch (Exception var9) {
        }
        if (field456 == null) {
            field456 = "~/";
        }
        try {
            this.field459 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field452 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field452 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field466 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field466 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method174(arg2, arg3, -127, arg4);
        }
        this.field451 = false;
        this.field453 = new Thread(this);
        this.field453.setPriority(10);
        this.field453.setDaemon(true);
        this.field453.start();
    }
}
