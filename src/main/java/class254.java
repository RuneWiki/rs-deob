import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class254 implements Runnable {

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Ljj;")
    public class103 field4515 = null;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljava/applet/Applet;")
    public Applet field4514 = null;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Ljj;")
    public class103 field4518 = null;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lwb;")
    private class26 field4512 = null;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lwb;")
    private class26 field4517 = null;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Ljj;")
    public class103 field4520 = null;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
    private boolean field4523 = false;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4508;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field4516;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4522 = 3;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Loh;")
    private class261 field4525;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4507;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Ljava/lang/String;")
    private static String field4509;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4510;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4511;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4513;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4519;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4521;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4526;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4527;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[Ljj;")
    public class103[] field4524;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Loh;")
    public final class261 method1712(int arg0) {
        int var2 = 4 % ((arg0 + 28) / 45);
        return this.field4525;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;B)Lwb;")
    public final class26 method1713(String arg0, byte arg1) {
        if (arg1 != -114) {
            this.field4523 = false;
        }
        return this.method1717(0, 12, arg0, arg1 + 112, 0);
    }

    @OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class26 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4523) {
                        return;
                    }
                    if (this.field4517 != null) {
                        var2 = this.field4517;
                        this.field4517 = this.field4517.field609;
                        if (this.field4517 == null) {
                            this.field4512 = null;
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
                int var3 = var2.field610;
                if (var3 == 1) {
                    var2.field611 = new Socket(InetAddress.getByName((String) var2.field608), var2.field612);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field608);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field612);
                    var2.field611 = var4;
                } else if (var3 == 4) {
                    var2.field611 = new DataInputStream(((URL) var2.field608).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field608;
                    var2.field611 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field608;
                    var2.field611 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field613 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field613 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lwb;")
    public final class26 method1714(boolean arg0, Class[] arg1, Class arg2, String arg3) {
        if (arg0) {
            this.field4517 = null;
        }
        return this.method1717(0, 8, new Object[] { arg2, arg3, arg1 }, -2, 0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;IZ)Lwb;")
    public final class26 method1715(String arg0, int arg1, boolean arg2) {
        return arg2 ? this.method1717(arg1, 1, arg0, -2, 0) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjava/awt/Component;)Lwb;")
    public final class26 method1716(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg1 == 14 ? this.method1717(arg0 + var5.x, 14, (Object) null, -2, var5.y + arg2) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/lang/Object;II)Lwb;")
    private final class26 method1717(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class26 var6 = new class26();
        var6.field612 = arg0;
        var6.field608 = arg2;
        var6.field610 = arg1;
        synchronized (this) {
            if (this.field4512 == null) {
                this.field4512 = this.field4517 = var6;
            } else {
                this.field4512.field609 = var6;
                this.field4512 = var6;
            }
            this.notify();
        }
        return arg3 == -2 ? var6 : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILjava/awt/Component;)Lwb;")
    public final class26 method1718(boolean arg0, int arg1, Component arg2) {
        if (arg1 >= -15) {
            this.field4514 = null;
        }
        return this.method1717(arg0 ? 1 : 0, 15, arg2, -2, 0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/net/URL;)Lwb;")
    public final class26 method1719(int arg0, URL arg1) {
        return arg0 == -8216 ? this.method1717(0, 4, arg1, arg0 ^ 0x2016, 0) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lwb;")
    public final class26 method1720(byte arg0, String arg1, Class arg2) {
        int var4 = 29 % ((-arg0 - 52) / 41);
        return this.method1717(0, 9, new Object[] { arg2, arg1 }, -2, 0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public final void method1721(byte arg0) {
        synchronized (this) {
            if (arg0 < 94) {
                return;
            }
            this.field4523 = true;
            this.notifyAll();
        }
        try {
            this.field4516.join();
        } catch (InterruptedException var10) {
        }
        if (this.field4518 != null) {
            try {
                this.field4518.method740(1);
            } catch (IOException var9) {
            }
        }
        if (this.field4520 != null) {
            try {
                this.field4520.method740(1);
            } catch (IOException var8) {
            }
        }
        if (this.field4524 != null) {
            for (int var3 = 0; var3 < this.field4524.length; var3++) {
                if (this.field4524[var3] != null) {
                    try {
                        this.field4524[var3].method740(1);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field4515 != null) {
            try {
                this.field4515.method740(1);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lwb;")
    public final class26 method1722(int arg0, int arg1) {
        return arg1 == 3 ? this.method1717(arg0, 3, (Object) null, -2, 0) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)Lwb;")
    public final class26 method1723(int arg0, String arg1) {
        if (arg0 != 5) {
            this.method1716(16, 99, 112, (Component) null);
        }
        return this.method1717(0, 16, arg1, arg0 ^ 0xFFFFFFFB, 0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lwb;")
    public final class26 method1724(boolean arg0, int arg1, Runnable arg2) {
        if (!arg0) {
            this.field4524 = null;
        }
        return this.method1717(arg1, 2, arg2, -2, 0);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class254(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4510 = "1.1";
        this.field4514 = arg0;
        field4513 = "Unknown";
        try {
            field4513 = System.getProperty("java.vendor");
            field4510 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4519 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4519 = "Unknown";
        }
        field4511 = field4519.toLowerCase();
        try {
            field4507 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4507 = "";
        }
        try {
            field4521 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4521 = "";
        }
        try {
            field4509 = System.getProperty("user.home");
            if (field4509 != null) {
                field4509 = field4509 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4509 == null) {
            field4509 = "~/";
        }
        try {
            this.field4508 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4527 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4527 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4526 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4526 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4523 = false;
        this.field4516 = new Thread(this);
        this.field4516.setPriority(10);
        this.field4516.setDaemon(true);
        this.field4516.start();
    }

    static {
        new Hashtable(16);
    }
}
