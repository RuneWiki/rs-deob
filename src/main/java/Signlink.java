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

@OriginalClass("mapview!u")
public class Signlink implements Runnable {

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "I")
    public int field448 = 0;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lka;")
    private PrivilegedRequest field454 = null;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Ljava/io/File;")
    private File field451 = null;

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field452 = null;

    @OriginalMember(owner = "mapview!u", name = "m", descriptor = "Lr;")
    public FileOnDisk field460 = null;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Z")
    private boolean field449 = false;

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Ljava/io/File;")
    public File field450 = null;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "Lr;")
    public FileOnDisk field455 = null;

    @OriginalMember(owner = "mapview!u", name = "p", descriptor = "Lka;")
    private PrivilegedRequest field463 = null;

    @OriginalMember(owner = "mapview!u", name = "o", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field462;

    @OriginalMember(owner = "mapview!u", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field465;

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "I")
    public static int field458 = 3;

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Ljava/lang/String;")
    public static String field457;

    @OriginalMember(owner = "mapview!u", name = "n", descriptor = "Ljava/lang/String;")
    public static String field461;

    @OriginalMember(owner = "mapview!u", name = "q", descriptor = "Ljava/lang/String;")
    private static String field464;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field453;

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field456;

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "[Lr;")
    public FileOnDisk[] field459;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lka;", line = 17)
    public final PrivilegedRequest method221(String arg0, int arg1, Class[] arg2, Class arg3) {
        return arg1 == 0 ? this.method222(8, 0, new Object[] { arg3, arg0, arg2 }, (byte) -62, 0) : (PrivilegedRequest) null;
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V", line = 495)
    public Signlink(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field461 = "Unknown";
        this.field452 = arg1;
        field457 = "1.1";
        try {
            field461 = System.getProperty("java.vendor");
            field457 = System.getProperty("java.version");
        } catch (Exception var15) {
        }
        try {
            field464 = System.getProperty("user.home");
            if (field464 != null) {
                field464 = field464 + "/";
            }
        } catch (Exception var14) {
        }
        if (field464 == null) {
            field464 = "~/";
        }
        try {
            this.field462 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var13) {
        }
        try {
            if (arg1 == null) {
                field456 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field456 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field453 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field453 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method225(arg4, arg2, 29, arg3);
        }
        this.field449 = false;
        this.field465 = new Thread(this);
        this.field465.setPriority(10);
        this.field465.setDaemon(true);
        this.field465.start();
    }

    @OriginalMember(owner = "mapview!u", name = "run", descriptor = "()V", line = 37)
    public final void run() {
        while (true) {
            PrivilegedRequest var2;
            synchronized (this) {
                while (true) {
                    if (this.field449) {
                        return;
                    }
                    if (this.field454 != null) {
                        var2 = this.field454;
                        this.field454 = this.field454.field174;
                        if (this.field454 == null) {
                            this.field463 = null;
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
                int var5 = var2.field171;
                if (var5 == 1) {
                    var2.field175 = new Socket(InetAddress.getByName((String) var2.field173), var2.field176);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field173);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field176);
                    var2.field175 = var8;
                } else if (var5 == 4) {
                    var2.field175 = new DataInputStream(((URL) var2.field173).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) var2.field173;
                    var2.field175 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field173;
                    var2.field175 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field172 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field172 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/lang/Object;BI)Lka;", line = 138)
    private final PrivilegedRequest method222(int arg0, int arg1, Object arg2, byte arg3, int arg4) {
        PrivilegedRequest var6 = new PrivilegedRequest();
        var6.field173 = arg2;
        var6.field176 = arg1;
        var6.field171 = arg0;
        if (arg3 > -41) {
            field458 = -124;
        }
        synchronized (this) {
            if (this.field463 == null) {
                this.field463 = this.field454 = var6;
            } else {
                this.field463.field174 = var6;
                this.field463 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lka;", line = 172)
    public final PrivilegedRequest method223(Runnable arg0, int arg1, int arg2) {
        if (arg2 != -29292) {
            this.method224((byte) 95);
        }
        return this.method222(2, arg1, arg0, (byte) -98, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 185)
    public final void method224(byte arg0) {
        synchronized (this) {
            this.field449 = true;
            this.notifyAll();
        }
        try {
            this.field465.join();
        } catch (InterruptedException var12) {
        }
        if (this.field460 != null) {
            try {
                this.field460.close(true);
            } catch (IOException var11) {
            }
        }
        if (arg0 <= 48) {
            this.method225(-118, 107, -67, null);
        }
        if (this.field455 != null) {
            try {
                this.field455.close(true);
            } catch (IOException var10) {
            }
        }
        if (this.field459 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field459.length; var7++) {
            if (this.field459[var7] != null) {
                try {
                    this.field459[var7].close(true);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IIILjava/lang/String;)V", line = 237)
    private final void method225(int arg0, int arg1, int arg2, String arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field464, "/tmp/", "" };
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        boolean var7 = false;
        int var8 = 13 % ((arg2 + 45) / 44);
        for (int var9 = 0; var9 < 2; var9++) {
            for (int var10 = 0; var10 < var6.length; var10++) {
                for (int var11 = 0; var11 < var5.length; var11++) {
                    try {
                        String var12 = var5[var11];
                        if (var12.length() > 0 && !(new File(var12)).exists()) {
                            continue;
                        }
                        File var13 = new File(var12 + var6[var10]);
                        if (var9 == 1 && !var13.exists()) {
                            boolean var14 = var13.mkdir();
                            if (!var14) {
                                continue;
                            }
                        }
                        if (!var7) {
                            try {
                                File var15 = new File(var13, "uid.dat");
                                if (var9 == 1 && (!var15.exists() || var15.length() < 4L)) {
                                    int var16 = -1;
                                    Random var17 = new Random();
                                    while (var16 == -1) {
                                        var16 = var17.nextInt();
                                    }
                                    DataOutputStream var18 = new DataOutputStream(new FileOutputStream(var15));
                                    var18.writeInt(var16);
                                    var18.close();
                                }
                                if (var15.exists()) {
                                    var7 = true;
                                    DataInputStream var19 = new DataInputStream(new FileInputStream(var15));
                                    this.field448 = var19.readInt() + 1;
                                    var19.close();
                                }
                            } catch (Exception var31) {
                            }
                        }
                        if (this.field451 == null) {
                            try {
                                File var21 = new File(var13, arg3);
                                if (var9 == 1 && !var21.exists()) {
                                    boolean var22 = var21.mkdir();
                                    if (!var22) {
                                        continue;
                                    }
                                }
                                File var23 = new File(var21, "main_file_cache.dat2");
                                if (var9 == 0 && !var23.exists()) {
                                    continue;
                                }
                                this.field460 = new FileOnDisk(var23, "rw", 52428800L);
                                this.field459 = new FileOnDisk[arg0];
                                for (int var24 = 0; var24 < arg0; var24++) {
                                    this.field459[var24] = new FileOnDisk(new File(var21, "main_file_cache.idx" + var24), "rw", 1048576L);
                                }
                                this.field455 = new FileOnDisk(new File(var21, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field450 = this.field451 = var21;
                            } catch (Exception var30) {
                                try {
                                    this.field460.close(true);
                                    for (int var26 = 0; var26 < arg0; var26++) {
                                        this.field459[var26].close(true);
                                    }
                                    this.field455.close(true);
                                } catch (Exception var29) {
                                }
                                this.field450 = this.field451 = null;
                                this.field459 = null;
                                this.field460 = this.field455 = null;
                            }
                        }
                    } catch (Exception var32) {
                    }
                    if (var7 && this.field451 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field451 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(ILjava/lang/String;I)Lka;", line = 426)
    public final PrivilegedRequest method226(int arg0, String arg1, int arg2) {
        if (arg0 != 1) {
            field457 = null;
        }
        return this.method222(1, arg2, arg1, (byte) -127, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lka;", line = 459)
    public final PrivilegedRequest method227(int arg0, String arg1, Class arg2) {
        int var4 = -112 % ((-arg0 - 59) / 46);
        return this.method222(9, 0, new Object[] { arg2, arg1 }, (byte) -57, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)Lka;", line = 467)
    public final PrivilegedRequest method228(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field452 = null;
        }
        return this.method222(3, arg1, null, (byte) -87, 0);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/net/URL;I)Lka;", line = 481)
    public final PrivilegedRequest method229(URL arg0, int arg1) {
        if (arg1 != 1048576) {
            this.method226(-5, null, 112);
        }
        return this.method222(4, 0, arg0, (byte) -92, 0);
    }
}
