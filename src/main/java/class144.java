import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class class144 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
    private boolean field1879 = false;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "Z")
    private boolean field1884 = false;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "Lmia;")
    public static class63 field1893 = new class63(45, 2);

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "Loi;")
    public static class73 field1909 = new class73("", 12);

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!mr", name = "Q", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!mr", name = "R", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!mr", name = "S", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!mr", name = "V", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!mr", name = "W", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!mr", name = "X", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!mr", name = "Y", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!mr", name = "Z", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!mr", name = "ab", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!mr", name = "bb", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!mr", name = "db", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "Z")
    public static boolean field1910;

    @OriginalMember(owner = "client!mr", name = "N", descriptor = "Z")
    public static boolean field1912;

    @OriginalMember(owner = "client!mr", name = "O", descriptor = "Z")
    public static boolean field1913;

    @OriginalMember(owner = "client!mr", name = "P", descriptor = "Z")
    public static boolean field1914;

    @OriginalMember(owner = "client!mr", name = "T", descriptor = "Z")
    public static boolean field1918;

    @OriginalMember(owner = "client!mr", name = "U", descriptor = "Z")
    public static boolean field1919;

    @OriginalMember(owner = "client!mr", name = "cb", descriptor = "Z")
    public static boolean field1927;

    @OriginalMember(owner = "client!mr", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void update(Graphics arg0) {
        field1894++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 19)
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field1900++;
        try {
            if (class176.field2729 == null) {
                class474.field6897 = arg2;
                class37.field381 = 0;
                class238.field3466 = 0;
                class510.field7263 = arg4;
                class455.field6702 = arg4;
                class176.field2729 = this;
                class501.field7123 = arg1;
                class153.field2475 = arg1;
                class87.field1248 = class466.field6830;
                class629.field8792 = class179.field2759 = new class711(arg0, arg6, arg5, class466.field6830 != null);
                class197 var8 = class179.field2759.method4056(this, 63, 1);
                while (var8.field2986 == 0) {
                    class277.method1759(10L, 34);
                }
                if (arg3 != 48) {
                    this.field1884 = false;
                }
            } else {
                class42.field460++;
                if (class42.field460 >= 3) {
                    this.method1008("alreadyloaded", false);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class326.method2072(arg3 - 3801, var10, null);
            this.method1008("crash", false);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 66)
    private final void method996(int arg0) {
        field1885++;
        long var2 = class524.method3075(18);
        long var4 = class742.field10409[class644.field9024];
        class742.field10409[class644.field9024] = var2;
        class644.field9024 = class644.field9024 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            if (arg0 <= 26) {
                this.method1009(-121);
            }
            class201.field3018 = class106.field1486;
        }
        this.method1004(0);
    }

    @OriginalMember(owner = "client!mr", name = "stop", descriptor = "()V", line = 100)
    public final void stop() {
        field1880++;
        if (class176.field2729 == this && !class567.field8048) {
            class732.field10254 = class524.method3075(18) + 4000L;
        }
    }

    @OriginalMember(owner = "client!mr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 112)
    public final void focusGained(FocusEvent arg0) {
        class106.field1486 = true;
        field1876++;
        class72.field1017 = true;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Ljava/lang/String;", line = 124)
    public String method997(int arg0) {
        field1883++;
        return arg0 == 5200 ? null : null;
    }

    @OriginalMember(owner = "client!mr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 137)
    public final URL getDocumentBase() {
        field1886++;
        if (class169.field2648 == null) {
            return class466.field6830 == null || class466.field6830 == this ? super.getDocumentBase() : class466.field6830.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V", line = 152)
    private final void method998(boolean arg0, int arg1) {
        field1874++;
        synchronized (this) {
            if (class567.field8048) {
                return;
            }
            class567.field8048 = true;
        }
        System.out.println("Shutdown start - clean:" + arg0);
        if (class466.field6830 != null) {
            class466.field6830.destroy();
        }
        try {
            if (arg1 != 1) {
                this.run();
            }
            this.method994((byte) -127);
        } catch (Exception var9) {
        }
        if (this.field1879) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field1879 = false;
        }
        class161.method1177((byte) -99, true);
        class86.method701((byte) 124);
        if (class106.field1476 != null) {
            try {
                class106.field1476.removeFocusListener(this);
                class106.field1476.getParent().remove(class106.field1476);
            } catch (Exception var7) {
            }
        }
        if (class179.field2759 != null) {
            try {
                class179.field2759.method4058(arg1 + 25);
            } catch (Exception var6) {
            }
        }
        this.method1000(50);
        if (class169.field2648 != null) {
            class169.field2648.setVisible(false);
            class169.field2648.dispose();
            class169.field2648 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V", line = 226)
    private final void method999(int arg0) {
        field1888++;
        long var2 = class524.method3075(18);
        long var4 = class458.field6750[class76.field1066];
        class458.field6750[class76.field1066] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class195.field2953 = ((var6 >> 1) + 32000) / var6;
        }
        class76.field1066 = class76.field1066 + 1 & 0x1F;
        if ((class603.field8526++) > 50) {
            class603.field8526 -= 50;
            class72.field1017 = true;
            class106.field1476.setSize(class501.field7123, class510.field7263);
            class106.field1476.setVisible(true);
            if (class169.field2648 != null && class183.field2801 == null) {
                Insets var7 = class169.field2648.getInsets();
                class106.field1476.setLocation(class238.field3466 + var7.left, class37.field381 + var7.top);
            } else {
                class106.field1476.setLocation(class238.field3466, class37.field381);
            }
        }
        if (arg0 == 57) {
            this.method1005(-105);
        }
    }

    @OriginalMember(owner = "client!mr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 273)
    public final void windowIconified(WindowEvent arg0) {
        field1889++;
    }

    @OriginalMember(owner = "client!mr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 282)
    public final void windowDeiconified(WindowEvent arg0) {
        field1897++;
    }

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z", line = 289)
    public final boolean method1001(int arg0) {
        field1896++;
        if (arg0 != 0) {
            field1893 = null;
        }
        return class383.method2462((byte) 119, "jaclib");
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 304)
    public synchronized void method1002(byte arg0) {
        if (class106.field1476 != null) {
            class106.field1476.removeFocusListener(this);
            class106.field1476.getParent().setBackground(Color.black);
            class106.field1476.getParent().remove(class106.field1476);
        }
        field1877++;
        Container var2;
        if (class183.field2801 != null) {
            var2 = class183.field2801;
        } else if (class169.field2648 != null) {
            var2 = class169.field2648;
        } else if (class466.field6830 == null) {
            var2 = class176.field2729;
        } else {
            var2 = class466.field6830;
        }
        if (arg0 <= 21) {
            this.method1006((byte) 89);
        }
        var2.setLayout(null);
        class106.field1476 = new class580(this);
        var2.add(class106.field1476);
        class106.field1476.setSize(class501.field7123, class510.field7263);
        class106.field1476.setVisible(true);
        if (class169.field2648 == var2) {
            Insets var3 = class169.field2648.getInsets();
            class106.field1476.setLocation(class238.field3466 + var3.left, class37.field381 + var3.top);
        } else {
            class106.field1476.setLocation(class238.field3466, class37.field381);
        }
        class106.field1476.addFocusListener(this);
        class106.field1476.requestFocus();
        class106.field1486 = true;
        class201.field3018 = true;
        class72.field1017 = true;
        class398.field5953 = false;
        class742.field10405 = class524.method3075(18);
    }

    @OriginalMember(owner = "client!mr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 358)
    public final AppletContext getAppletContext() {
        field1878++;
        if (class169.field2648 == null) {
            return class466.field6830 == null || class466.field6830 == this ? super.getAppletContext() : class466.field6830.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 373)
    public static final void provideLoaderApplet(Applet arg0) {
        field1902++;
        class466.field6830 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)V", line = 381)
    public static void method1003(int arg0) {
        field1893 = null;
        field1909 = null;
        int var1 = -6 % ((-arg0 - 19) / 60);
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Z", line = 395)
    public final boolean method1006(byte arg0) {
        int var2 = 66 / ((57 - arg0) / 53);
        field1903++;
        return class383.method2462((byte) 70, "jagtheora");
    }

    @OriginalMember(owner = "client!mr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 405)
    public final void windowDeactivated(WindowEvent arg0) {
        field1908++;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)V", line = 412)
    public static final void method1007(int arg0, byte arg1) {
        class242.field3529 = arg0;
        if (arg1 != 25) {
            provideLoaderApplet(null);
        }
        field1887++;
        class581.field8257 = -1;
        class347.field5018 = -1;
        class2.field18 = null;
        class354.field5152 = null;
        class706.field9945 = false;
        class758.field10600 = 0;
        class152.field2350 = 1;
    }

    @OriginalMember(owner = "client!mr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 435)
    public final void windowClosing(WindowEvent arg0) {
        field1906++;
        this.destroy();
    }

    @OriginalMember(owner = "client!mr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 443)
    public final void windowClosed(WindowEvent arg0) {
        field1891++;
    }

    @OriginalMember(owner = "client!mr", name = "run", descriptor = "()V", line = 456)
    public final void run() {
        field1907++;
        try {
            if (class711.field10023 != null) {
                String var1 = class711.field10023.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class711.field10035;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1008("wrongjava", false);
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class711.field10035 == null || class711.field10035.equals("1.4.2"))) {
                    this.method1008("wrongjava", false);
                    return;
                }
            }
            if (class711.field10035 != null && class711.field10035.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class711.field10035.length()) {
                    char var5 = class711.field10035.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var5 - (48 - var4 * 10);
                }
                if (var4 >= 5) {
                    class750.field10488 = true;
                }
            }
            Applet var6 = class176.field2729;
            if (class466.field6830 != null) {
                var6 = class466.field6830;
            }
            Method var7 = class711.field10030;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class145.method1014(94);
            class753.method4198(false);
            this.method1002((byte) 101);
            this.method1009(51);
            class184.field2813 = class676.method3887(-1001);
            while (class732.field10254 == 0L || class524.method3075(18) < class732.field10254) {
                class272.field3876 = class184.field2813.method2775(class362.field5234, (byte) 117);
                for (int var8 = 0; var8 < class272.field3876; var8++) {
                    this.method996(80);
                }
                this.method999(57);
                class340.method2163((byte) 78, class179.field2759, class106.field1476);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class326.method2072(-3753, var20, this.method997(5200));
            this.method1008("crash", false);
        } finally {
            Object var13 = null;
            this.method998(true, 1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 577)
    public final void method1008(String arg0, boolean arg1) {
        if (arg1) {
            field1893 = null;
        }
        field1904++;
        if (this.field1884) {
            return;
        }
        this.field1884 = true;
        System.out.println("error_game_" + arg0);
        try {
            class121.method877(class466.field6830, "loggedout", -22421);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!mr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 605)
    public final void windowOpened(WindowEvent arg0) {
        field1901++;
    }

    @OriginalMember(owner = "client!mr", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 616)
    public final URL getCodeBase() {
        field1882++;
        if (class169.field2648 == null) {
            return class466.field6830 == null || class466.field6830 == this ? super.getCodeBase() : class466.field6830.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "start", descriptor = "()V", line = 641)
    public final void start() {
        field1881++;
        if (class176.field2729 == this && !class567.field8048) {
            class732.field10254 = 0L;
        }
    }

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "(I)Z", line = 654)
    public final boolean method1010(int arg0) {
        field1905++;
        if (arg0 != 0) {
            field1893 = null;
        }
        return class383.method2462((byte) 29, "jagmisc");
    }

    @OriginalMember(owner = "client!mr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 667)
    public final void windowActivated(WindowEvent arg0) {
        field1895++;
    }

    @OriginalMember(owner = "client!mr", name = "destroy", descriptor = "()V", line = 678)
    public final void destroy() {
        field1873++;
        if (class176.field2729 == this && !class567.field8048) {
            class732.field10254 = class524.method3075(18);
            class277.method1759(5000L, -111);
            class629.field8792 = null;
            this.method998(false, 1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIILjava/lang/String;IZ)V", line = 694)
    public final void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7) {
        try {
            class238.field3466 = arg2;
            class474.field6897 = arg1;
            class501.field7123 = arg0;
            class153.field2475 = arg0;
            class510.field7263 = arg6;
            class455.field6702 = arg6;
            class37.field381 = 0;
            class87.field1248 = null;
            class176.field2729 = this;
            class169.field2648 = new Frame();
            class169.field2648.setTitle("Jagex");
            class169.field2648.setResizable(true);
            class169.field2648.addWindowListener(this);
            class169.field2648.setVisible(true);
            class169.field2648.toFront();
            Insets var9 = class169.field2648.getInsets();
            class169.field2648.setSize(var9.right + var9.left + class153.field2475, class455.field6702 + var9.bottom + var9.top);
            class629.field8792 = class179.field2759 = new class711(arg4, arg5, arg3, true);
            class197 var10 = class179.field2759.method4056(this, 98, 1);
            while (var10.field2986 == 0) {
                class277.method1759(10L, arg2 ^ 0x58);
            }
        } catch (Exception var12) {
            class326.method2072(arg2 - 3753, var12, null);
        }
        field1899++;
    }

    @OriginalMember(owner = "client!mr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 733)
    public final void focusLost(FocusEvent arg0) {
        class106.field1486 = false;
        field1892++;
    }

    @OriginalMember(owner = "client!mr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 741)
    public final String getParameter(String arg0) {
        field1890++;
        if (class169.field2648 == null) {
            return class466.field6830 == null || class466.field6830 == this ? super.getParameter(arg0) : class466.field6830.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 759)
    public final synchronized void paint(Graphics arg0) {
        field1898++;
        if (class176.field2729 != this || class567.field8048) {
            return;
        }
        class72.field1017 = true;
        if (class750.field10488 && (class524.method3075(18) - class742.field10405) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class153.field2475 && var2.height >= class455.field6702) {
                class398.field5953 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)Z", line = 785)
    public final boolean method1012(byte arg0) {
        field1875++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (arg0 != -32) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1008("invalidhost", false);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public abstract void method994(byte arg0);

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
    public abstract void method1000(int arg0);

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "(I)V")
    public abstract void method1004(int arg0);

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "(I)V")
    public abstract void method1005(int arg0);

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "(I)V")
    public abstract void method1009(int arg0);
}
