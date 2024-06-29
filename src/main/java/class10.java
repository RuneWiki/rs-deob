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

@OriginalClass("mapview!ea")
public class class10 implements Runnable {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "I")
    public int field135 = 0;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lka;")
    public class12 field141 = null;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Ljava/lang/String;")
    private String field137 = null;

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Z")
    private boolean field142 = false;

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lba;")
    private class4 field146 = null;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lka;")
    public class12 field136 = null;

    @OriginalMember(owner = "mapview!ea", name = "s", descriptor = "Ljava/lang/String;")
    private String field153 = null;

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lba;")
    private class4 field144 = null;

    @OriginalMember(owner = "mapview!ea", name = "p", descriptor = "Ljava/lang/String;")
    public String field150 = null;

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Ljava/lang/String;")
    public String field147 = null;

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field145 = null;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field138;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "[Lka;")
    public class12[] field140;

    @OriginalMember(owner = "mapview!ea", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field154;

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "I")
    public static int field143 = 3;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Ljava/lang/String;")
    public static String field139;

    @OriginalMember(owner = "mapview!ea", name = "q", descriptor = "Ljava/lang/String;")
    public static String field151;

    @OriginalMember(owner = "mapview!ea", name = "r", descriptor = "Ljava/lang/String;")
    private static String field152;

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field148;

    @OriginalMember(owner = "mapview!ea", name = "o", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field149;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lba;", line = 8)
    public final class4 method68(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 22781) {
            this.method68(null, 8, -12);
        }
        return this.method75((byte) 125, 0, 2, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IB)Lba;", line = 27)
    public final class4 method69(int arg0, byte arg1) {
        return arg1 >= -50 ? (class4) null : this.method75((byte) 117, 0, 1, null, arg0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lba;", line = 38)
    public final class4 method70(String arg0, Class arg1, int arg2) {
        if (arg2 != 10) {
            this.method74(null, 5, null, null);
        }
        return this.method75((byte) -51, 0, 10, new Object[] { arg1, arg0 }, 0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 48)
    private final void method71(String arg0, int arg1, int arg2) {
        if (field152 == null) {
            field152 = "~/";
        }
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String var4 = ".file_store_" + arg2;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field152, "/tmp/", "" };
        for (int var6 = arg1; var6 < var5.length; var6++) {
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
                    if (arg0.length() > 0) {
                        var9 = new File(var9, arg0);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field147 = this.field137 = var9.getParent() + "/";
                    this.field150 = this.field153 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var11) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 119)
    public final void method72(int arg0) {
        synchronized (this) {
            this.field142 = true;
            if (arg0 <= 92) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field154.join();
        } catch (InterruptedException var12) {
        }
        if (this.field136 != null) {
            try {
                this.field136.method87((byte) 112);
            } catch (IOException var11) {
            }
        }
        if (this.field141 != null) {
            try {
                this.field141.method87((byte) 69);
            } catch (IOException var10) {
            }
        }
        if (this.field140 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field140.length; var7++) {
            if (this.field140[var7] != null) {
                try {
                    this.field140[var7].method87((byte) 91);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(II)Lba;", line = 172)
    public final class4 method73(int arg0, int arg1) {
        return arg0 == 0 ? this.method75((byte) 126, 0, 3, null, arg1) : (class4) null;
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 424)
    public class10(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field139 = "Unknown";
        field151 = "1.1";
        this.field138 = arg2;
        this.field145 = arg1;
        try {
            field139 = System.getProperty("java.vendor");
            field151 = System.getProperty("java.version");
            field152 = System.getProperty("user.home");
            if (field152 != null) {
                field152 = field152 + "/";
            }
        } catch (Exception var13) {
        }
        try {
            if (arg1 == null) {
                field149 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field149 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field148 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field148 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method71(arg4, 0, arg3);
            this.field136 = new class12(new File(this.field153 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field140 = new class12[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field140[var10] = new class12(new File(this.field153 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.field141 = new class12(new File(this.field153 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method77(10);
        }
        this.field142 = false;
        this.field154 = new Thread(this);
        this.field154.setPriority(10);
        this.field154.setDaemon(true);
        this.field154.start();
    }

    @OriginalMember(owner = "mapview!ea", name = "run", descriptor = "()V", line = 206)
    public final void run() {
        while (true) {
            class4 var2;
            synchronized (this) {
                while (true) {
                    if (this.field142) {
                        return;
                    }
                    if (this.field146 != null) {
                        var2 = this.field146;
                        this.field146 = this.field146.field85;
                        if (this.field146 == null) {
                            this.field144 = null;
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
                int var5 = var2.field86;
                if (var5 == 1) {
                    var2.field82 = new Socket(this.field138, var2.field84);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field83);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field84);
                    var2.field82 = var6;
                } else if (var5 == 4) {
                    var2.field82 = new DataInputStream(((URL) var2.field83).openStream());
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) var2.field83;
                    var2.field82 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) var7[2]);
                } else if (var5 == 10) {
                    Object[] var8 = (Object[]) var2.field83;
                    var2.field82 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field81 = 1;
            } catch (Exception var10) {
                var2.field81 = 2;
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lba;", line = 295)
    public final class4 method74(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != 0) {
            this.field141 = null;
        }
        return this.method75((byte) 116, 0, 9, new Object[] { arg2, arg0, arg3 }, 0);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BIILjava/lang/Object;I)Lba;", line = 314)
    private final class4 method75(byte arg0, int arg1, int arg2, Object arg3, int arg4) {
        class4 var6 = new class4();
        var6.field84 = arg4;
        var6.field86 = arg2;
        var6.field83 = arg3;
        synchronized (this) {
            int var8 = 8 / ((arg0 - 53) / 62);
            if (this.field144 == null) {
                this.field144 = this.field146 = var6;
            } else {
                this.field144.field85 = var6;
                this.field144 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/net/URL;I)Lba;", line = 344)
    public final class4 method76(URL arg0, int arg1) {
        if (arg1 <= 25) {
            this.method69(10, (byte) 16);
        }
        return this.method75((byte) 119, 0, 4, arg0, 0);
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)V", line = 357)
    private final void method77(int arg0) {
        try {
            File var2 = new File(this.field137 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field137 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var8) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field137 + "uid.dat"));
            if (arg0 != 10) {
                this.run();
            }
            this.field135 = var5.readInt() + 1;
            var5.close();
        } catch (Exception var7) {
        }
    }
}
