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

@OriginalClass("client!fb")
public class class33 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field767 = null;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lgd;")
    private class40 field764 = null;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/lang/String;")
    private String field766 = null;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lgd;")
    private class40 field775 = null;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public int field768 = 0;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lid;")
    public class52 field780 = null;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lid;")
    public class52 field769 = null;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Ljava/lang/String;")
    public String field779 = null;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Ljava/lang/String;")
    public String field783 = null;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
    private boolean field782 = false;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/lang/String;")
    private String field773 = null;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field776;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[Lid;")
    public class52[] field777;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field772;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field774 = 3;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lac;")
    private class4 field784;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lld;")
    private class70 field763;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field765;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
    private static String field770;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field771;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field778;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field781;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lgd;", line = 3)
    private final class40 method307(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class40 var6 = new class40();
        if (arg2 != -35) {
            return null;
        }
        var6.field915 = arg1;
        var6.field919 = arg4;
        var6.field917 = arg0;
        synchronized (this) {
            if (this.field764 == null) {
                this.field764 = this.field775 = var6;
            } else {
                this.field764.field920 = var6;
                this.field764 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 35)
    private final void method308(boolean arg0, String arg1, int arg2) {
        if (field770 == null) {
            field770 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field770, "/tmp/", "" };
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String var5 = ".file_store_" + arg2;
        if (!arg0) {
            field778 = null;
        }
        for (int var6 = 0; var6 < var4.length; var6++) {
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
                    this.field783 = this.field773 = var9.getParent() + "/";
                    this.field779 = this.field766 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lgd;", line = 111)
    public final class40 method309(int arg0, int arg1) {
        return arg1 == 27307 ? this.method307(null, 1, -35, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lgd;", line = 126)
    public final class40 method310(boolean arg0) {
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lld;", line = 141)
    public final class70 method311(int arg0) {
        return arg0 < 122 ? null : this.field763;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lgd;", line = 152)
    public final class40 method312(byte arg0, Class arg1, Class[] arg2, String arg3) {
        if (arg0 >= -72) {
            this.field764 = null;
        }
        return this.method307(new Object[] { arg1, arg3, arg2 }, 9, -35, 0, 0);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lgd;", line = 162)
    public final class40 method313(int arg0, int arg1) {
        return arg0 > -67 ? null : this.method307(null, 3, -35, 0, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 458)
    public class33(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field767 = arg1;
        this.field776 = arg2;
        field765 = "1.1";
        field771 = "Unknown";
        try {
            field771 = System.getProperty("java.vendor");
            field765 = System.getProperty("java.version");
            field770 = System.getProperty("user.home");
            if (field770 != null) {
                field770 = field770 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field781 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field781 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field778 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field778 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method308(true, arg4, arg3);
            this.field769 = new class52(new File(this.field766 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field777 = new class52[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field777[var7] = new class52(new File(this.field766 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field780 = new class52(new File(this.field766 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method316(3);
        }
        this.field782 = false;
        this.field772 = new Thread(this);
        this.field772.setPriority(10);
        this.field772.setDaemon(true);
        this.field772.start();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/net/URL;B)Lgd;", line = 180)
    public final class40 method314(URL arg0, byte arg1) {
        if (arg1 > -31) {
            field765 = null;
        }
        return this.method307(arg0, 4, -35, 0, 0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lgd;", line = 194)
    public final class40 method315(Class arg0, String arg1, int arg2) {
        if (arg2 != -31083) {
            this.field763 = null;
        }
        return this.method307(new Object[] { arg0, arg1 }, 10, arg2 + 31048, 0, 0);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 225)
    private final void method316(int arg0) {
        try {
            File var2 = new File(this.field773 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field773 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        if (arg0 != 3) {
            return;
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field773 + "uid.dat"));
            this.field768 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lac;", line = 279)
    public final class4 method317(byte arg0) {
        int var2 = 104 % ((arg0 + 15) / 49);
        return this.field784;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILjava/lang/Runnable;)Lgd;", line = 292)
    public final class40 method318(int arg0, int arg1, Runnable arg2) {
        if (arg1 > -63) {
            this.field783 = null;
        }
        return this.method307(arg2, 2, -35, 0, arg0);
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V", line = 308)
    public final void run() {
        while (true) {
            class40 var2;
            synchronized (this) {
                while (true) {
                    if (this.field782) {
                        return;
                    }
                    if (this.field775 != null) {
                        var2 = this.field775;
                        this.field775 = this.field775.field920;
                        if (this.field775 == null) {
                            this.field764 = null;
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
                int var3 = var2.field915;
                if (var3 == 1) {
                    var2.field918 = new Socket(this.field776, var2.field919);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field917);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field919);
                    var2.field918 = var4;
                } else if (var3 == 4) {
                    var2.field918 = new DataInputStream(((URL) var2.field917).openStream());
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field917;
                    var2.field918 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field917;
                    var2.field918 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field916 = 1;
            } catch (Exception var9) {
                var2.field916 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V", line = 399)
    public final void method319(boolean arg0) {
        synchronized (this) {
            this.field782 = true;
            this.notifyAll();
            if (arg0) {
                this.method316(57);
            }
        }
        try {
            this.field772.join();
        } catch (InterruptedException var7) {
        }
        if (this.field784 != null) {
            this.field784.method39(-61);
        }
        if (this.field769 != null) {
            try {
                this.field769.method406((byte) 26);
            } catch (IOException var6) {
            }
        }
        if (this.field780 != null) {
            try {
                this.field780.method406((byte) 26);
            } catch (IOException var5) {
            }
        }
        if (this.field777 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field777.length; var3++) {
            if (this.field777[var3] != null) {
                try {
                    this.field777[var3].method406((byte) 26);
                } catch (IOException var4) {
                }
            }
        }
    }
}
