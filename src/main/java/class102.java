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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class102 implements Runnable {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lu;")
    private class123 field2423 = null;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ltc;")
    public class116 field2421 = null;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Ljava/lang/String;")
    private String field2434 = null;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field2435 = null;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field2424 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lu;")
    private class123 field2436 = null;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Ljava/lang/String;")
    public String field2426 = null;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Ljava/lang/String;")
    public String field2438 = null;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Ljava/lang/String;")
    private String field2437 = null;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
    private boolean field2441 = false;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Ltc;")
    public class116 field2440 = null;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field2422;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "[Ltc;")
    public class116[] field2427;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field2431;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2420 = 3;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lt;")
    private class117 field2433;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lcd;")
    private class17 field2429;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2428;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2430;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljava/lang/String;")
    private static String field2439;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2425;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2432;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Lu;", line = 11)
    public final class123 method713(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method714(-90);
        }
        return this.method718(3, arg1 ^ 0xFFFFBAA0, arg0, null, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 21)
    private final void method714(int arg0) {
        try {
            if (arg0 != -1) {
                this.method720(null, 56, null);
            }
            File var2 = new File(this.field2437 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field2437 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field2437 + "uid.dat"));
            this.field2424 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 455)
    public class102(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field2428 = "Unknown";
        this.field2422 = arg2;
        field2430 = "1.1";
        this.field2435 = arg1;
        try {
            field2428 = System.getProperty("java.vendor");
            field2430 = System.getProperty("java.version");
            field2439 = System.getProperty("user.home");
            if (field2439 != null) {
                field2439 = field2439 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field2425 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2425 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field2432 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2432 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method719(arg3, arg4, 0);
            this.field2440 = new class116(new File(this.field2434 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field2427 = new class116[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field2427[var7] = new class116(new File(this.field2434 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field2421 = new class116(new File(this.field2434 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method714(-1);
        }
        this.field2441 = false;
        this.field2431 = new Thread(this);
        this.field2431.setPriority(10);
        this.field2431.setDaemon(true);
        this.field2431.start();
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lu;", line = 60)
    public final class123 method715(int arg0) {
        return arg0 == -22826 ? null : null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Ljava/lang/Class;ZLjava/lang/Class;Ljava/lang/String;)Lu;", line = 75)
    public final class123 method716(Class[] arg0, boolean arg1, Class arg2, String arg3) {
        if (!arg1) {
            this.field2429 = null;
        }
        return this.method718(9, -17757, 0, new Object[] { arg2, arg3, arg0 }, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/net/URL;Z)Lu;", line = 87)
    public final class123 method717(URL arg0, boolean arg1) {
        if (arg1) {
            this.method721(-68);
        }
        return this.method718(4, -17757, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILjava/lang/Object;I)Lu;", line = 119)
    private final class123 method718(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class123 var6 = new class123();
        var6.field2886 = arg2;
        var6.field2883 = arg0;
        var6.field2884 = arg3;
        synchronized (this) {
            if (this.field2436 == null) {
                this.field2436 = this.field2423 = var6;
            } else {
                this.field2436.field2888 = var6;
                this.field2436 = var6;
            }
            if (arg1 != -17757) {
                this.field2429 = null;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 155)
    private final void method719(int arg0, String arg1, int arg2) {
        if (field2439 == null) {
            field2439 = "~/";
        }
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field2439, "/tmp/", "" };
        String var5 = ".file_store_" + arg0;
        for (int var6 = arg2; var6 < var4.length; var6++) {
            try {
                String var7 = var4[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var5);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field2426 = this.field2437 = var9.getParent() + "/";
                    this.field2438 = this.field2434 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lu;", line = 234)
    public final class123 method720(String arg0, int arg1, Class arg2) {
        if (arg1 > -124) {
            field2439 = null;
        }
        return this.method718(10, -17757, 0, new Object[] { arg2, arg0 }, 0);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 252)
    public final void method721(int arg0) {
        synchronized (this) {
            this.field2441 = true;
            this.notifyAll();
        }
        try {
            this.field2431.join();
        } catch (InterruptedException var7) {
        }
        if (this.field2429 != null) {
            this.field2429.method101(-20581);
        }
        if (this.field2440 != null) {
            try {
                this.field2440.method897(1);
            } catch (IOException var6) {
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field2421 != null) {
            try {
                this.field2421.method897(1);
            } catch (IOException var5) {
            }
        }
        if (this.field2427 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2427.length; var3++) {
            if (this.field2427[var3] != null) {
                try {
                    this.field2427[var3].method897(1);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)Lu;", line = 306)
    public final class123 method722(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2438 = null;
        }
        return this.method718(1, -17757, arg1, null, 0);
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)Lt;", line = 321)
    public final class117 method723(int arg0) {
        if (arg0 != 0) {
            this.field2421 = null;
        }
        return this.field2433;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Lcd;", line = 336)
    public final class17 method724(int arg0) {
        int var2 = -117 % ((arg0 + 7) / 48);
        return this.field2429;
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V", line = 351)
    public final void run() {
        while (true) {
            class123 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2441) {
                        return;
                    }
                    if (this.field2423 != null) {
                        var2 = this.field2423;
                        this.field2423 = this.field2423.field2888;
                        if (this.field2423 == null) {
                            this.field2436 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                    }
                }
            }
            try {
                int var3 = var2.field2883;
                if (var3 == 1) {
                    var2.field2887 = new Socket(this.field2422, var2.field2886);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2884);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2886);
                    var2.field2887 = var6;
                } else if (var3 == 4) {
                    var2.field2887 = new DataInputStream(((URL) var2.field2884).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2884;
                    var2.field2887 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2884;
                    var2.field2887 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2885 = 1;
            } catch (Exception var9) {
                var2.field2885 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILjava/lang/Runnable;)Lu;", line = 444)
    public final class123 method725(byte arg0, int arg1, Runnable arg2) {
        int var4 = -43 % ((arg0 - 8) / 50);
        return this.method718(2, -17757, arg1, arg2, 0);
    }
}
