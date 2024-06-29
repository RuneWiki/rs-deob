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

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Ljava/io/File;")
    private File field16 = null;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "I")
    public int field21 = 0;

    @OriginalMember(owner = "mapview!b", name = "l", descriptor = "Lj;")
    public class19 field25 = null;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Ljava/io/File;")
    public File field14 = null;

    @OriginalMember(owner = "mapview!b", name = "q", descriptor = "Lna;")
    private class27 field30 = null;

    @OriginalMember(owner = "mapview!b", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field28 = null;

    @OriginalMember(owner = "mapview!b", name = "r", descriptor = "Z")
    private boolean field31 = false;

    @OriginalMember(owner = "mapview!b", name = "n", descriptor = "Lna;")
    private class27 field27 = null;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lj;")
    public class19 field24 = null;

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field22;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field15;

    @OriginalMember(owner = "mapview!b", name = "p", descriptor = "I")
    public static int field29 = 3;

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Ljava/lang/String;")
    private static String field18;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Ljava/lang/String;")
    public static String field19;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Ljava/lang/String;")
    public static String field20;

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field17;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field23;

    @OriginalMember(owner = "mapview!b", name = "m", descriptor = "[Lj;")
    public class19[] field26;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IILjava/lang/Runnable;)Lna;", line = 7)
    public final class27 method15(int arg0, int arg1, Runnable arg2) {
        int var4 = 68 % ((arg0 + 54) / 48);
        return this.method21(arg2, 0, 127, arg1, 2);
    }

    @OriginalMember(owner = "mapview!b", name = "run", descriptor = "()V", line = 25)
    public final void run() {
        while (true) {
            class27 var2;
            synchronized (this) {
                while (true) {
                    if (this.field31) {
                        return;
                    }
                    if (this.field30 != null) {
                        var2 = this.field30;
                        this.field30 = this.field30.field409;
                        if (this.field30 == null) {
                            this.field27 = null;
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
                int var5 = var2.field410;
                if (var5 == 1) {
                    var2.field408 = new Socket(this.field22, var2.field411);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field412);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field411);
                    var2.field408 = var8;
                } else if (var5 == 4) {
                    var2.field408 = new DataInputStream(((URL) var2.field412).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field412;
                    var2.field408 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field412;
                    var2.field408 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field413 = 1;
            } catch (Exception var10) {
                var2.field413 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)Lna;", line = 119)
    public final class27 method16(int arg0, int arg1) {
        if (arg1 >= -50) {
            field23 = null;
        }
        return this.method21(null, 0, 83, arg0, 1);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IB)Lna;", line = 132)
    public final class27 method17(int arg0, byte arg1) {
        return arg1 < 96 ? (class27) null : this.method21(null, 0, 83, arg0, 3);
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 513)
    public class3(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        this.field28 = arg1;
        field20 = "1.1";
        field19 = "Unknown";
        this.field22 = arg2;
        try {
            field19 = System.getProperty("java.vendor");
            field20 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field18 = System.getProperty("user.home");
            if (field18 != null) {
                field18 = field18 + "/";
            }
        } catch (Exception var13) {
        }
        if (field18 == null) {
            field18 = "~/";
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
                field17 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field17 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method22(arg4, arg5, (byte) -40, arg3);
        }
        this.field31 = false;
        this.field15 = new Thread(this);
        this.field15.setPriority(10);
        this.field15.setDaemon(true);
        this.field15.start();
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 166)
    public final void method18(byte arg0) {
        synchronized (this) {
            this.field31 = true;
            this.notifyAll();
        }
        try {
            this.field15.join();
        } catch (InterruptedException var12) {
        }
        if (arg0 != 122) {
            return;
        }
        if (this.field24 != null) {
            try {
                this.field24.method120(arg0 ^ 0xFFFFD3B1);
            } catch (IOException var11) {
            }
        }
        if (this.field25 != null) {
            try {
                this.field25.method120(-11317);
            } catch (IOException var10) {
            }
        }
        if (this.field26 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field26.length; var7++) {
            if (this.field26[var7] != null) {
                try {
                    this.field26[var7].method120(arg0 ^ 0xFFFFD3B1);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I[Ljava/lang/Class;)Lna;", line = 226)
    public final class27 method19(Class arg0, String arg1, int arg2, Class[] arg3) {
        if (arg2 != 24311) {
            this.method22(null, -24, (byte) -124, -76);
        }
        return this.method21(new Object[] { arg0, arg1, arg3 }, 0, 114, 0, 9);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/net/URL;Z)Lna;", line = 236)
    public final class27 method20(URL arg0, boolean arg1) {
        return arg1 ? (class27) null : this.method21(arg0, 0, 86, 0, 4);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lna;", line = 250)
    private final class27 method21(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class27 var6 = new class27();
        var6.field411 = arg3;
        var6.field410 = arg4;
        var6.field412 = arg0;
        synchronized (this) {
            if (arg2 <= 79) {
                return (class27) null;
            }
            if (this.field27 == null) {
                this.field27 = this.field30 = var6;
            } else {
                this.field27.field409 = var6;
                this.field27 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/String;IBI)V", line = 286)
    private final void method22(String arg0, int arg1, byte arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field18, "" };
        boolean var6 = false;
        String[] var7 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        int var8 = 0;
        if (arg2 != -40) {
            return;
        }
        while (var8 < 2) {
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
                                    Random var15 = new Random();
                                    int var16;
                                    for (var16 = -1; var16 == -1; var16 = var15.nextInt()) {
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var16);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field21 = var18.readInt() + 1;
                                    var6 = true;
                                    var18.close();
                                }
                            } catch (Exception var30) {
                            }
                        }
                        if (this.field16 == null) {
                            try {
                                File var20 = new File(var12, arg0);
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
                                this.field24 = new class19(var22, "rw", 52428800L);
                                this.field26 = new class19[arg1];
                                for (int var23 = 0; var23 < arg1; var23++) {
                                    this.field26[var23] = new class19(new File(var20, "main_file_cache.idx" + var23), "rw", 1048576L);
                                }
                                this.field25 = new class19(new File(var20, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field14 = this.field16 = var20;
                            } catch (Exception var29) {
                                try {
                                    this.field24.method120(-11317);
                                    for (int var25 = 0; var25 < arg1; var25++) {
                                        this.field26[var25].method120(-11317);
                                    }
                                    this.field25.method120(-11317);
                                } catch (Exception var28) {
                                }
                                this.field14 = this.field16 = null;
                                this.field26 = null;
                                this.field24 = this.field25 = null;
                            }
                        }
                    } catch (Exception var31) {
                    }
                    if (var6 && this.field16 != null) {
                        return;
                    }
                }
            }
            var8++;
        }
        if (this.field16 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Lna;", line = 480)
    public final class27 method23(Class arg0, boolean arg1, String arg2) {
        if (!arg1) {
            this.field24 = null;
        }
        return this.method21(new Object[] { arg0, arg2 }, 0, 102, 0, 10);
    }
}
