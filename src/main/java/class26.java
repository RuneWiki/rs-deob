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

@OriginalClass("mapview!n")
public class class26 implements Runnable {

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Le;")
    private class9 field344 = null;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Ljava/io/File;")
    private File field350 = null;

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "Lk;")
    public class20 field356 = null;

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Ljava/io/File;")
    public File field346 = null;

    @OriginalMember(owner = "mapview!n", name = "q", descriptor = "Lk;")
    public class20 field359 = null;

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "Le;")
    private class9 field357 = null;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field355 = null;

    @OriginalMember(owner = "mapview!n", name = "r", descriptor = "I")
    public int field360 = 0;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field354;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field345;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public static int field348 = 3;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "Ljava/lang/String;")
    public static String field347;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Ljava/lang/String;")
    private static String field349;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Ljava/lang/String;")
    public static String field351;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field343;

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field358;

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "[Lk;")
    public class20[] field352;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IB)Le;", line = 10)
    public final class9 method191(int arg0, byte arg1) {
        int var3 = -84 % ((42 - arg1) / 57);
        return this.method197(3, -122, arg0, 0, null);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILjava/net/URL;)Le;", line = 22)
    public final class9 method192(int arg0, URL arg1) {
        return arg0 == -1079 ? this.method197(4, -88, 0, 0, arg1) : (class9) null;
    }

    @OriginalMember(owner = "mapview!n", name = "run", descriptor = "()V", line = 35)
    public final void run() {
        while (true) {
            class9 var2;
            synchronized (this) {
                while (true) {
                    if (this.field353) {
                        return;
                    }
                    if (this.field344 != null) {
                        var2 = this.field344;
                        this.field344 = this.field344.field74;
                        if (this.field344 == null) {
                            this.field357 = null;
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
                int var5 = var2.field73;
                if (var5 == 1) {
                    var2.field71 = new Socket(this.field354, var2.field69);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field70);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field69);
                    var2.field71 = var8;
                } else if (var5 == 4) {
                    var2.field71 = new DataInputStream(((URL) var2.field70).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field70;
                    var2.field71 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var6 = (Object[]) var2.field70;
                    var2.field71 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field72 = 1;
            } catch (Exception var10) {
                var2.field72 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 125)
    public final void method193(int arg0) {
        synchronized (this) {
            this.field353 = true;
            this.notifyAll();
        }
        try {
            this.field345.join();
        } catch (InterruptedException var12) {
        }
        if (this.field356 != null) {
            try {
                this.field356.method120(10179);
            } catch (IOException var11) {
            }
        }
        if (this.field359 != null) {
            try {
                this.field359.method120(10179);
            } catch (IOException var10) {
            }
        }
        if (this.field352 != null) {
            for (int var7 = 0; var7 < this.field352.length; var7++) {
                if (this.field352[var7] != null) {
                    try {
                        this.field352[var7].method120(10179);
                    } catch (IOException var9) {
                    }
                }
            }
        }
        if (arg0 != 0) {
            field348 = 29;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II)Le;", line = 180)
    public final class9 method194(int arg0, int arg1) {
        return arg1 >= -70 ? (class9) null : this.method197(1, -124, arg0, 0, null);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IILjava/lang/Runnable;)Le;", line = 196)
    public final class9 method195(int arg0, int arg1, Runnable arg2) {
        return arg1 < 59 ? (class9) null : this.method197(2, -126, arg0, 0, arg2);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;I)Le;", line = 211)
    public final class9 method196(String arg0, Class arg1, Class[] arg2, int arg3) {
        return arg3 == 9 ? this.method197(9, -89, 0, 0, new Object[] { arg1, arg0, arg2 }) : (class9) null;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 513)
    public class26(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) {
        field351 = "Unknown";
        this.field355 = arg1;
        field347 = "1.1";
        this.field354 = arg2;
        try {
            field351 = System.getProperty("java.vendor");
            field347 = System.getProperty("java.version");
        } catch (Exception var14) {
        }
        try {
            field349 = System.getProperty("user.home");
            if (field349 != null) {
                field349 = field349 + "/";
            }
        } catch (Exception var13) {
        }
        if (field349 == null) {
            field349 = "~/";
        }
        try {
            if (arg1 == null) {
                field358 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field358 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field343 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field343 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method199((byte) 76, arg3, arg5, arg4);
        }
        this.field353 = false;
        this.field345 = new Thread(this);
        this.field345.setPriority(10);
        this.field345.setDaemon(true);
        this.field345.start();
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIILjava/lang/Object;)Le;", line = 241)
    private final class9 method197(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class9 var6 = new class9();
        var6.field70 = arg4;
        var6.field69 = arg2;
        var6.field73 = arg0;
        synchronized (this) {
            if (this.field357 == null) {
                this.field357 = this.field344 = var6;
            } else {
                this.field357.field74 = var6;
                this.field357 = var6;
            }
            this.notify();
        }
        if (arg1 > -77) {
            field347 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Le;", line = 276)
    public final class9 method198(Class arg0, String arg1, byte arg2) {
        return arg2 == 23 ? this.method197(10, -126, 0, 0, new Object[] { arg0, arg1 }) : (class9) null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(BIILjava/lang/String;)V", line = 298)
    private final void method199(byte arg0, int arg1, int arg2, String arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field349, "" };
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        boolean var7 = false;
        int var8 = 0;
        if (arg0 != 76) {
            this.field344 = null;
        }
        while (var8 < 2) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var7) {
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
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field360 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var30) {
                            }
                        }
                        if (this.field350 == null) {
                            try {
                                File var20 = new File(var12, arg3);
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
                                this.field356 = new class20(var22, "rw", 52428800L);
                                this.field352 = new class20[arg2];
                                for (int var23 = 0; var23 < arg2; var23++) {
                                    this.field352[var23] = new class20(new File(var20, "main_file_cache.idx" + var23), "rw", 1048576L);
                                }
                                this.field359 = new class20(new File(var20, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field346 = this.field350 = var20;
                            } catch (Exception var29) {
                                try {
                                    this.field356.method120(arg0 + 10103);
                                    for (int var25 = 0; var25 < arg2; var25++) {
                                        this.field352[var25].method120(10179);
                                    }
                                    this.field359.method120(10179);
                                } catch (Exception var28) {
                                }
                                this.field346 = this.field350 = null;
                                this.field352 = null;
                                this.field356 = this.field359 = null;
                            }
                        }
                    } catch (Exception var31) {
                    }
                    if (var7 && this.field350 != null) {
                        return;
                    }
                }
            }
            var8++;
        }
        if (this.field350 == null) {
            throw new RuntimeException();
        }
    }
}
