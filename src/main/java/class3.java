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
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 implements Runnable {

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Ljava/applet/Applet;")
    public Applet field17 = null;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ljava/io/File;")
    private File field19 = null;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Ls;")
    private class34 field26 = null;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "I")
    public int field16 = 0;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Ls;")
    private class34 field21 = null;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "Z")
    private boolean field30 = false;

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "Lqa;")
    public class32 field32 = null;

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "Ljava/io/File;")
    public File field29 = null;

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "Lqa;")
    public class32 field31 = null;

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field33;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field28;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "I")
    public static int field27 = 3;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Ljava/lang/String;")
    private static String field22;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Ljava/lang/String;")
    public static String field24;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Ljava/lang/String;")
    public static String field25;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field20;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field23;

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[Lqa;")
    public class32[] field18;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/net/URL;)Ls;", line = 5)
    public final class34 method13(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.field31 = null;
        }
        return this.method20(arg1, 0, 0, 4, (byte) 65);
    }

    @OriginalMember(owner = "mapview!b", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        while (true) {
            class34 var2;
            synchronized (this) {
                while (true) {
                    if (this.field30) {
                        return;
                    }
                    if (this.field21 != null) {
                        var2 = this.field21;
                        this.field21 = this.field21.field457;
                        if (this.field21 == null) {
                            this.field26 = null;
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
                int var5 = var2.field456;
                if (var5 == 1) {
                    var2.field458 = new Socket(this.field33, var2.field459);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field461);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field459);
                    var2.field458 = var6;
                } else if (var5 == 4) {
                    var2.field458 = new DataInputStream(((URL) var2.field461).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field461;
                    var2.field458 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var8 = (Object[]) var2.field461;
                    var2.field458 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field460 = 1;
            } catch (Exception var10) {
                var2.field460 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Ls;", line = 118)
    public final class34 method14(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != 9) {
            this.run();
        }
        return this.method20(new Object[] { arg2, arg0, arg3 }, 0, 0, 9, (byte) 71);
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 512)
    public class3(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        this.field33 = arg2;
        field24 = "1.1";
        field25 = "Unknown";
        this.field17 = arg1;
        try {
            field25 = System.getProperty("java.vendor");
            field24 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field22 = System.getProperty("user.home");
            if (field22 != null) {
                field22 = field22 + "/";
            }
        } catch (Exception var13) {
        }
        if (field22 == null) {
            field22 = "~/";
        }
        try {
            if (arg1 == null) {
                field23 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field23 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field20 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field20 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method21(7, arg5, arg4, arg3);
        }
        this.field30 = false;
        this.field28 = new Thread(this);
        this.field28.setPriority(10);
        this.field28.setDaemon(true);
        this.field28.start();
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IB)Ls;", line = 134)
    public final class34 method15(int arg0, byte arg1) {
        if (arg1 != 105) {
            this.method17(null, -110, null);
        }
        return this.method20(null, 0, arg0, 1, (byte) 34);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)Ls;", line = 146)
    public final class34 method16(int arg0, int arg1) {
        if (arg1 != 0) {
            field22 = null;
        }
        return this.method20(null, 0, arg0, 3, (byte) 97);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ls;", line = 167)
    public final class34 method17(Class arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.field30 = true;
        }
        return this.method20(new Object[] { arg0, arg2 }, 0, 0, 10, (byte) 61);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ILjava/lang/Runnable;I)Ls;", line = 182)
    public final class34 method18(int arg0, Runnable arg1, int arg2) {
        return arg0 == 2 ? this.method20(arg1, 0, arg2, 2, (byte) 53) : (class34) null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 194)
    public final void method19(byte arg0) {
        synchronized (this) {
            this.field30 = true;
            this.notifyAll();
        }
        if (arg0 <= 120) {
            this.field21 = null;
        }
        try {
            this.field28.join();
        } catch (InterruptedException var12) {
        }
        if (this.field32 != null) {
            try {
                this.field32.method225((byte) 71);
            } catch (IOException var11) {
            }
        }
        if (this.field31 != null) {
            try {
                this.field31.method225((byte) 71);
            } catch (IOException var10) {
            }
        }
        if (this.field18 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field18.length; var7++) {
            if (this.field18[var7] != null) {
                try {
                    this.field18[var7].method225((byte) 71);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Ls;", line = 260)
    private final class34 method20(Object arg0, int arg1, int arg2, int arg3, byte arg4) {
        class34 var6 = new class34();
        var6.field459 = arg2;
        var6.field461 = arg0;
        var6.field456 = arg3;
        if (arg4 < 24) {
            field23 = null;
        }
        synchronized (this) {
            if (this.field26 == null) {
                this.field26 = this.field21 = var6;
            } else {
                this.field26.field457 = var6;
                this.field26 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IILjava/lang/String;I)V", line = 322)
    private final void method21(int arg0, int arg1, String arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field22, "" };
        if (arg0 != 7) {
            this.field28 = null;
        }
        boolean var6 = false;
        String[] var7 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
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
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    var6 = true;
                                    this.field16 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var30) {
                            }
                        }
                        if (this.field19 == null) {
                            try {
                                File var20 = new File(var12, arg2);
                                if (var8 == 1 && !var20.exists()) {
                                    boolean var21 = var20.mkdir();
                                    if (!var21) {
                                        continue;
                                    }
                                }
                                File var22 = new File(var20, "main_file_cache.dat2");
                                if (var8 == 0 && !var22.exists()) {
                                    continue;
                                }
                                this.field32 = new class32(var22, "rw", 52428800L);
                                this.field18 = new class32[arg1];
                                for (int var23 = 0; var23 < arg1; var23++) {
                                    this.field18[var23] = new class32(new File(var20, "main_file_cache.idx" + var23), "rw", 1048576L);
                                }
                                this.field31 = new class32(new File(var20, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field29 = this.field19 = var20;
                            } catch (Exception var29) {
                                try {
                                    this.field32.method225((byte) 71);
                                    for (int var25 = 0; var25 < arg1; var25++) {
                                        this.field18[var25].method225((byte) 71);
                                    }
                                    this.field31.method225((byte) 71);
                                } catch (Exception var28) {
                                }
                                this.field29 = this.field19 = null;
                                this.field18 = null;
                                this.field32 = this.field31 = null;
                            }
                        }
                    } catch (Exception var31) {
                    }
                    if (var6 && this.field19 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field19 == null) {
            throw new RuntimeException();
        }
    }
}
