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

@OriginalClass("client!d")
public class class22 implements Runnable {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Ljava/io/File;")
    private File field464 = null;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lw;")
    private class150 field473 = null;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lce;")
    public class20 field465 = null;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public int field479 = 0;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field476 = null;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Z")
    private boolean field481 = false;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lce;")
    public class20 field469 = null;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Ljava/io/File;")
    public File field474 = null;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lw;")
    private class150 field482 = null;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field475;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field468;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field471 = 3;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lid;")
    private class60 field477;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/lang/String;")
    private static String field467;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ljava/lang/String;")
    public static String field472;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Ljava/lang/String;")
    public static String field480;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field470;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field478;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[Lce;")
    public class20[] field466;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lw;")
    public final class150 method178(boolean arg0, String arg1, Class arg2) {
        if (!arg0) {
            this.field477 = null;
        }
        return this.method184(9, new Object[] { arg2, arg1 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/net/URL;)Lw;")
    public final class150 method179(int arg0, URL arg1) {
        if (arg0 != -30036) {
            this.field479 = -45;
        }
        return this.method184(4, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method180(String arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            this.field475 = null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field467, "/tmp/", "" };
        boolean var6 = false;
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
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
                                    this.field479 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field464 == null) {
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
                                this.field465 = new class20(var21, "rw", 52428800L);
                                this.field466 = new class20[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field466[var22] = new class20(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field469 = new class20(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field474 = this.field464 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field465.method151(arg1 - 9963);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field466[var23].method151(arg1 - 9963);
                                    }
                                    this.field469.method151(-9962);
                                } catch (Exception var24) {
                                }
                                this.field474 = this.field464 = null;
                                this.field466 = null;
                                this.field465 = this.field469 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var6 && this.field464 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field464 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        synchronized (this) {
            this.field481 = true;
            this.notifyAll();
        }
        int var3 = 56 % ((arg0 - 5) / 58);
        try {
            this.field468.join();
        } catch (InterruptedException var8) {
        }
        if (this.field465 != null) {
            try {
                this.field465.method151(-9962);
            } catch (IOException var7) {
            }
        }
        if (this.field469 != null) {
            try {
                this.field469.method151(-9962);
            } catch (IOException var6) {
            }
        }
        if (this.field466 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field466.length; var4++) {
            if (this.field466[var4] != null) {
                try {
                    this.field466[var4].method151(-9962);
                } catch (IOException var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;IB)Lw;")
    public final class150 method182(String arg0, int arg1, byte arg2) {
        if (arg2 != 62) {
            this.method184(-110, null, 52, 9, -53);
        }
        return this.method184(1, arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lid;")
    public final class60 method183(int arg0) {
        if (arg0 != 2708) {
            this.field474 = null;
        }
        return this.field477;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Object;III)Lw;")
    private final class150 method184(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class150 var6 = new class150();
        var6.field3438 = arg0;
        var6.field3437 = arg1;
        var6.field3439 = arg4;
        synchronized (this) {
            if (arg3 != 0) {
                this.field464 = null;
            }
            if (this.field473 == null) {
                this.field473 = this.field482 = var6;
            } else {
                this.field473.field3440 = var6;
                this.field473 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lw;")
    public final class150 method185(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 0) {
            this.field481 = true;
        }
        return this.method184(2, arg1, 0, 0, arg2);
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class150 var2;
            synchronized (this) {
                while (true) {
                    if (this.field481) {
                        return;
                    }
                    if (this.field482 != null) {
                        var2 = this.field482;
                        this.field482 = this.field482.field3440;
                        if (this.field482 == null) {
                            this.field473 = null;
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
                int var3 = var2.field3438;
                if (var3 == 1) {
                    var2.field3441 = new Socket(InetAddress.getByName((String) var2.field3437), var2.field3439);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3437);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3439);
                    var2.field3441 = var4;
                } else if (var3 == 4) {
                    var2.field3441 = new DataInputStream(((URL) var2.field3437).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3437;
                    var2.field3441 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field3437;
                    var2.field3441 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field3442 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3442 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lw;")
    public final class150 method186(int arg0, int arg1) {
        if (arg0 != 5) {
            this.field477 = null;
        }
        return this.method184(3, null, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lw;")
    public final class150 method187(byte arg0, Class arg1, String arg2, Class[] arg3) {
        if (arg0 != -56) {
            this.field479 = 88;
        }
        return this.method184(8, new Object[] { arg1, arg2, arg3 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class22(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field476 = arg1;
        field480 = "1.1";
        field472 = "Unknown";
        try {
            field472 = System.getProperty("java.vendor");
            field480 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field467 = System.getProperty("user.home");
            if (field467 != null) {
                field467 = field467 + "/";
            }
        } catch (Exception var9) {
        }
        if (field467 == null) {
            field467 = "~/";
        }
        try {
            this.field475 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field470 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field470 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field478 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field478 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method180(arg3, 1, arg2, arg4);
        }
        this.field481 = false;
        this.field468 = new Thread(this);
        this.field468.setPriority(10);
        this.field468.setDaemon(true);
        this.field468.start();
    }
}
