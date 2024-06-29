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

@OriginalClass("client!c")
public class class15 implements Runnable {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field314 = null;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lda;")
    public class23 field319 = null;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ljava/lang/String;")
    public String field320 = null;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Z")
    private boolean field318 = false;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "Ljd;")
    private class62 field331 = null;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Ljd;")
    private class62 field329 = null;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ljava/lang/String;")
    private String field330 = null;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Ljava/lang/String;")
    private String field322 = null;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/lang/String;")
    public String field335 = null;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lda;")
    public class23 field334 = null;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field333 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field324;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[Lda;")
    public class23[] field326;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field316;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field317 = 3;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lbe;")
    private class13 field321;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Lhe;")
    private class51 field332;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Ljava/lang/String;")
    public static String field323;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Ljava/lang/String;")
    public static String field325;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Ljava/lang/String;")
    private static String field328;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field315;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field327;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Ljd;", line = 3)
    public final class62 method123(int arg0, int arg1) {
        return arg0 == 0 ? this.method133(arg1, 3, null, 0, 0) : null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 452)
    public class15(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field325 = "Unknown";
        this.field324 = arg2;
        this.field314 = arg1;
        field323 = "1.1";
        try {
            field325 = System.getProperty("java.vendor");
            field323 = System.getProperty("java.version");
            field328 = System.getProperty("user.home");
            if (field328 != null) {
                field328 = field328 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field327 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field327 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field315 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field315 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method125((byte) -85, arg4, arg3);
            this.field334 = new class23(new File(this.field322 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field326 = new class23[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field326[var7] = new class23(new File(this.field322 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field319 = new class23(new File(this.field322 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method127(true);
        }
        this.field318 = false;
        this.field316 = new Thread(this);
        this.field316.setPriority(10);
        this.field316.setDaemon(true);
        this.field316.start();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 28)
    public final void method124(byte arg0) {
        synchronized (this) {
            this.field318 = true;
            this.notifyAll();
        }
        try {
            this.field316.join();
        } catch (InterruptedException var7) {
        }
        if (arg0 > -30) {
            this.method131((byte) -80, null, null);
        }
        if (this.field332 != null) {
            this.field332.method424(-114);
        }
        if (this.field334 != null) {
            try {
                this.field334.method179(4220);
            } catch (IOException var6) {
            }
        }
        if (this.field319 != null) {
            try {
                this.field319.method179(4220);
            } catch (IOException var5) {
            }
        }
        if (this.field326 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field326.length; var3++) {
            if (this.field326[var3] != null) {
                try {
                    this.field326[var3].method179(4220);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;I)V", line = 85)
    private final void method125(byte arg0, String arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String var4 = ".file_store_" + arg2;
        if (field328 == null) {
            field328 = "~/";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field328, "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            try {
                String var7 = var5[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var4);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field320 = this.field330 = var9.getParent() + "/";
                    this.field335 = this.field322 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        if (arg0 >= -58) {
            this.field324 = null;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Ljd;", line = 160)
    public final class62 method126(byte arg0) {
        return arg0 >= -33 ? null : null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 177)
    private final void method127(boolean arg0) {
        try {
            File var2 = new File(this.field330 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field330 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field330 + "uid.dat"));
            if (!arg0) {
                this.method130(120, null, -73);
            }
            this.field333 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Lbe;", line = 213)
    public final class13 method128(boolean arg0) {
        if (arg0) {
            this.field321 = null;
        }
        return this.field321;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/net/URL;)Ljd;", line = 223)
    public final class62 method129(byte arg0, URL arg1) {
        if (arg0 != -72) {
            this.field329 = null;
        }
        return this.method133(0, 4, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/lang/Runnable;I)Ljd;", line = 239)
    public final class62 method130(int arg0, Runnable arg1, int arg2) {
        return arg2 == -10870 ? this.method133(arg0, 2, arg1, 0, 0) : null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Ljd;", line = 258)
    public final class62 method131(byte arg0, String arg1, Class arg2) {
        if (arg0 != -23) {
            field323 = null;
        }
        return this.method133(0, 10, new Object[] { arg2, arg1 }, 0, 0);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Ljd;", line = 275)
    public final class62 method132(Class arg0, Class[] arg1, String arg2, int arg3) {
        return arg3 <= 28 ? null : this.method133(0, 9, new Object[] { arg0, arg2, arg1 }, 0, 0);
    }

    @OriginalMember(owner = "client!c", name = "run", descriptor = "()V", line = 285)
    public final void run() {
        while (true) {
            class62 var2;
            synchronized (this) {
                while (true) {
                    if (this.field318) {
                        return;
                    }
                    if (this.field329 != null) {
                        var2 = this.field329;
                        this.field329 = this.field329.field1463;
                        if (this.field329 == null) {
                            this.field331 = null;
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
                int var3 = var2.field1468;
                if (var3 == 1) {
                    var2.field1467 = new Socket(this.field324, var2.field1465);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1466);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1465);
                    var2.field1467 = var4;
                } else if (var3 == 4) {
                    var2.field1467 = new DataInputStream(((URL) var2.field1466).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1466;
                    var2.field1467 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var6 = (Object[]) var2.field1466;
                    var2.field1467 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1464 = 1;
            } catch (Exception var9) {
                var2.field1464 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILjava/lang/Object;II)Ljd;", line = 376)
    private final class62 method133(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class62 var6 = new class62();
        var6.field1468 = arg1;
        if (arg3 != 0) {
            this.method133(-75, 0, null, -111, -106);
        }
        var6.field1466 = arg2;
        var6.field1465 = arg0;
        synchronized (this) {
            if (this.field331 == null) {
                this.field331 = this.field329 = var6;
            } else {
                this.field331.field1463 = var6;
                this.field331 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)Lhe;", line = 411)
    public final class51 method134(boolean arg0) {
        if (arg0) {
            this.method133(110, -81, null, 84, 50);
        }
        return this.field332;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Ljd;", line = 520)
    public final class62 method135(int arg0, int arg1) {
        return arg1 == 0 ? this.method133(arg0, 1, null, arg1, 0) : null;
    }
}
