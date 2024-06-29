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

@OriginalClass("client!ed")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ljava/lang/String;")
    private String field750 = null;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Ljava/lang/String;")
    private String field753 = null;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/lang/String;")
    public String field752 = null;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lsc;")
    private class112 field749 = null;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lsc;")
    private class112 field762 = null;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Ljava/lang/String;")
    public String field758 = null;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
    private boolean field756 = false;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lbe;")
    public class13 field763 = null;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field766 = null;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field760 = 0;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Lbe;")
    public class13 field761 = null;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field768;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "[Lbe;")
    public class13[] field769;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field755;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field765 = 3;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Luc;")
    private class124 field754;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lnd;")
    private class84 field759;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Ljava/lang/String;")
    public static String field751;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Ljava/lang/String;")
    public static String field757;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Ljava/lang/String;")
    private static String field764;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field748;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field767;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/net/URL;)Lsc;", line = 10)
    public final class112 method277(byte arg0, URL arg1) {
        if (arg0 != -71) {
            field765 = 29;
        }
        return this.method282(0, 4, 0, arg1, (byte) 38);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 453)
    public class31(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field751 = "Unknown";
        field757 = "1.1";
        this.field766 = arg1;
        this.field768 = arg2;
        try {
            field751 = System.getProperty("java.vendor");
            field757 = System.getProperty("java.version");
            field764 = System.getProperty("user.home");
            if (field764 != null) {
                field764 = field764 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field748 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field748 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field767 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field767 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method281(arg4, -33, arg3);
            this.field763 = new class13(new File(this.field750 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field769 = new class13[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field769[var7] = new class13(new File(this.field750 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field761 = new class13(new File(this.field750 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method287(false);
        }
        this.field756 = false;
        this.field755 = new Thread(this);
        this.field755.setPriority(10);
        this.field755.setDaemon(true);
        this.field755.start();
    }

    @OriginalMember(owner = "client!ed", name = "run", descriptor = "()V", line = 26)
    public final void run() {
        while (true) {
            class112 var2;
            synchronized (this) {
                while (true) {
                    if (this.field756) {
                        return;
                    }
                    if (this.field749 != null) {
                        var2 = this.field749;
                        this.field749 = this.field749.field2683;
                        if (this.field749 == null) {
                            this.field762 = null;
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
                int var3 = var2.field2685;
                if (var3 == 1) {
                    var2.field2687 = new Socket(this.field768, var2.field2688);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2684);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2688);
                    var2.field2687 = var6;
                } else if (var3 == 4) {
                    var2.field2687 = new DataInputStream(((URL) var2.field2684).openStream());
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field2684;
                    var2.field2687 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2684;
                    var2.field2687 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2686 = 1;
            } catch (Exception var9) {
                var2.field2686 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Luc;", line = 123)
    public final class124 method278(byte arg0) {
        if (arg0 != 32) {
            this.run();
        }
        return this.field754;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lnd;", line = 134)
    public final class84 method279(int arg0) {
        if (arg0 != 0) {
            this.field766 = null;
        }
        return this.field759;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lsc;", line = 146)
    public final class112 method280(int arg0, Runnable arg1, int arg2) {
        int var4 = 115 % ((-arg0 - 2) / 40);
        return this.method282(0, 2, arg2, arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 157)
    private final void method281(String arg0, int arg1, int arg2) {
        if (~arg2 > arg1 || arg2 > 34) {
            arg2 = 32;
        }
        if (field764 == null) {
            field764 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field764, "/tmp/", "" };
        String var5 = ".file_store_" + arg2;
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
                    if (arg0.length() > 0) {
                        var9 = new File(var9, arg0);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field758 = this.field753 = var9.getParent() + "/";
                    this.field752 = this.field750 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILjava/lang/Object;B)Lsc;", line = 232)
    private final class112 method282(int arg0, int arg1, int arg2, Object arg3, byte arg4) {
        class112 var6 = new class112();
        var6.field2684 = arg3;
        if (arg4 < 25) {
            return null;
        }
        var6.field2685 = arg1;
        var6.field2688 = arg2;
        synchronized (this) {
            if (this.field762 == null) {
                this.field762 = this.field749 = var6;
            } else {
                this.field762.field2683 = var6;
                this.field762 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lsc;", line = 273)
    public final class112 method283(int arg0, int arg1) {
        if (arg1 != 4) {
            this.method287(true);
        }
        return this.method282(0, 1, arg0, null, (byte) 108);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lsc;", line = 298)
    public final class112 method284(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method282(-127, -76, -46, null, (byte) -27);
        }
        return this.method282(0, 3, arg0, null, (byte) 92);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 313)
    public final void method285(byte arg0) {
        synchronized (this) {
            this.field756 = true;
            this.notifyAll();
        }
        try {
            this.field755.join();
        } catch (InterruptedException var7) {
        }
        if (this.field759 != null) {
            this.field759.method720((byte) 72);
        }
        if (this.field763 != null) {
            try {
                this.field763.method132((byte) -119);
            } catch (IOException var6) {
            }
        }
        if (arg0 != 117) {
            this.method284(-115, 123);
        }
        if (this.field761 != null) {
            try {
                this.field761.method132((byte) -80);
            } catch (IOException var5) {
            }
        }
        if (this.field769 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field769.length; var3++) {
            if (this.field769[var3] != null) {
                try {
                    this.field769[var3].method132((byte) 126);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lsc;", line = 379)
    public final class112 method286(byte arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 > -95) {
            field757 = null;
        }
        return this.method282(0, 9, 0, new Object[] { arg3, arg1, arg2 }, (byte) 50);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 392)
    private final void method287(boolean arg0) {
        try {
            if (arg0) {
                this.field766 = null;
            }
            File var2 = new File(this.field753 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field753 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field753 + "uid.dat"));
            this.field760 = var4.readInt() + 1;
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Lsc;", line = 423)
    public final class112 method288(byte arg0) {
        int var2 = 50 / ((-arg0 - 28) / 53);
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lsc;", line = 441)
    public final class112 method289(Class arg0, String arg1, int arg2) {
        int var4 = -16 / ((arg2 + 53) / 35);
        return this.method282(0, 10, 0, new Object[] { arg0, arg1 }, (byte) 107);
    }
}
