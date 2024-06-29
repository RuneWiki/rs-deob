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

@OriginalClass("client!jp")
public abstract class class359 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "Z")
    private boolean field5024 = false;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "Z")
    private boolean field5033 = false;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "Lhda;")
    public static class752 field5021 = new class752(82, 0);

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "Lkaa;")
    public static class47 field5042 = new class47(74, 7);

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "Lhda;")
    public static class752 field5043 = new class752(68, 6);

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field5044 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!jp", name = "U", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!jp", name = "V", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!jp", name = "W", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!jp", name = "bb", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!jp", name = "cb", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!jp", name = "db", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!jp", name = "eb", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!jp", name = "fb", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "Z")
    public static boolean field5046;

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "Z")
    public static boolean field5048;

    @OriginalMember(owner = "client!jp", name = "R", descriptor = "Z")
    public static boolean field5049;

    @OriginalMember(owner = "client!jp", name = "S", descriptor = "Z")
    public static boolean field5050;

    @OriginalMember(owner = "client!jp", name = "T", descriptor = "Z")
    public static boolean field5051;

    @OriginalMember(owner = "client!jp", name = "X", descriptor = "Z")
    public static boolean field5055;

    @OriginalMember(owner = "client!jp", name = "Y", descriptor = "Z")
    public static boolean field5056;

    @OriginalMember(owner = "client!jp", name = "Z", descriptor = "Z")
    public static boolean field5057;

    @OriginalMember(owner = "client!jp", name = "ab", descriptor = "Z")
    public static boolean field5058;

    @OriginalMember(owner = "client!jp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 13)
    public final void windowOpened(WindowEvent arg0) {
        field5032++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;IIIBI)V", line = 20)
    public final void method2123(int arg0, String arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5025++;
        try {
            if (class670.field9145 == null) {
                if (arg5 != -24) {
                    this.windowIconified(null);
                }
                class199.field2993 = arg4;
                class749.field10428 = arg4;
                class348.field4882 = 0;
                class733.field10148 = 0;
                class304.field4319 = arg2;
                class670.field9145 = this;
                class333.field4731 = class514.field6818;
                class228.field3251 = arg3;
                class201.field3018 = arg3;
                class42.field553 = class66.field828 = new class192(arg0, arg1, arg6, class514.field6818 != null);
                class198 var8 = class66.field828.method1311(this, 1, 0);
                while (var8.field2987 == 0) {
                    class226.method1447((byte) -124, 10L);
                }
            } else {
                class719.field10016++;
                if (class719.field10016 >= 3) {
                    this.method2127(32673, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class135.method1056(null, var10, 1);
            this.method2127(arg5 ^ 0xFFFF8049, "crash");
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 68)
    public synchronized void method1870(int arg0) {
        field5026++;
        if (class295.field4217 != null) {
            class295.field4217.removeFocusListener(this);
            class295.field4217.getParent().setBackground(Color.black);
            class295.field4217.getParent().remove(class295.field4217);
        }
        Container var2;
        if (class200.field3012 != null) {
            var2 = class200.field3012;
        } else if (class218.field3143 != null) {
            var2 = class218.field3143;
        } else if (class514.field6818 == null) {
            var2 = class670.field9145;
        } else {
            var2 = class514.field6818;
        }
        var2.setLayout(null);
        class295.field4217 = new class148(this);
        var2.add(class295.field4217);
        class295.field4217.setSize(class228.field3251, class199.field2993);
        if (arg0 != -6515) {
            return;
        }
        class295.field4217.setVisible(true);
        if (class218.field3143 == var2) {
            Insets var3 = class218.field3143.getInsets();
            class295.field4217.setLocation(class348.field4882 + var3.left, var3.top - -class733.field10148);
        } else {
            class295.field4217.setLocation(class348.field4882, class733.field10148);
        }
        class295.field4217.addFocusListener(this);
        class295.field4217.requestFocus();
        class194.field2928 = true;
        class709.field9831 = true;
        class690.field9598 = true;
        class762.field10613 = false;
        class462.field6339 = class375.method2193(arg0 + 6631);
    }

    @OriginalMember(owner = "client!jp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 121)
    public final void windowDeactivated(WindowEvent arg0) {
        field5030++;
    }

    @OriginalMember(owner = "client!jp", name = "stop", descriptor = "()V", line = 128)
    public final void stop() {
        field5018++;
        if (class670.field9145 == this && !class170.field2615) {
            class574.field7544 = class375.method2193(116) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jp", name = "run", descriptor = "()V", line = 141)
    public final void run() {
        field5017++;
        try {
            if (class192.field2899 != null) {
                String var1 = class192.field2899.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class192.field2879;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method2127(32673, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class192.field2879 == null || class192.field2879.equals("1.4.2"))) {
                    this.method2127(32673, "wrongjava");
                    return;
                }
            }
            if (class192.field2879 != null && class192.field2879.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class192.field2879.length()) {
                    char var5 = class192.field2879.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class573.field7527 = true;
                }
            }
            Applet var6 = class670.field9145;
            if (class514.field6818 != null) {
                var6 = class514.field6818;
            }
            Method var7 = class192.field2896;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class603.method3283(3);
            class749.method4191(true);
            this.method1870(-6515);
            this.method1881(20);
            class238.field3352 = class148.method1110((byte) 103);
            while (class574.field7544 == 0L || class574.field7544 > class375.method2193(116)) {
                class167.field2587 = class238.field3352.method3087((byte) 87, class677.field9400);
                for (int var8 = 0; var8 < class167.field2587; var8++) {
                    this.method2129(-2006);
                }
                this.method2126((byte) -107);
                class29.method259(class66.field828, 0, class295.field4217);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class135.method1056(this.method1882(2), var20, 1);
            this.method2127(32673, "crash");
        } finally {
            Object var13 = null;
            this.method2133(true, true);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;ZIIIII)V", line = 264)
    public final void method2124(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class304.field4319 = arg4;
            class733.field10148 = 0;
            class199.field2993 = arg5;
            class749.field10428 = arg5;
            class333.field4731 = null;
            class670.field9145 = this;
            class348.field4882 = 0;
            class228.field3251 = arg0;
            class201.field3018 = arg0;
            class218.field3143 = new Frame();
            class218.field3143.setTitle("Jagex");
            class218.field3143.setResizable(true);
            class218.field3143.addWindowListener(this);
            class218.field3143.setVisible(true);
            class218.field3143.toFront();
            Insets var9 = class218.field3143.getInsets();
            class218.field3143.setSize(class201.field3018 - (-var9.left - var9.right), class749.field10428 + var9.top + var9.bottom);
            if (arg7 >= -106) {
                return;
            }
            class42.field553 = class66.field828 = new class192(arg6, arg1, arg3, true);
            class198 var10 = class66.field828.method1311(this, 1, 0);
            while (var10.field2987 == 0) {
                class226.method1447((byte) -124, 10L);
            }
        } catch (Exception var12) {
            class135.method1056(null, var12, 1);
        }
        field5008++;
    }

    @OriginalMember(owner = "client!jp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 311)
    public final void windowDeiconified(WindowEvent arg0) {
        field5015++;
    }

    @OriginalMember(owner = "client!jp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 320)
    public final void focusGained(FocusEvent arg0) {
        field5038++;
        class194.field2928 = true;
        class690.field9598 = true;
    }

    @OriginalMember(owner = "client!jp", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 329)
    public final URL getCodeBase() {
        field5029++;
        if (class218.field3143 == null) {
            return class514.field6818 == null || class514.field6818 == this ? super.getCodeBase() : class514.field6818.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 345)
    public final void windowClosed(WindowEvent arg0) {
        field5027++;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)Z", line = 356)
    public final boolean method2125(int arg0) {
        field5035++;
        if (arg0 <= 110) {
            this.field5033 = true;
        }
        return class702.method3952(-104, "jagtheora");
    }

    @OriginalMember(owner = "client!jp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 368)
    public final void windowActivated(WindowEvent arg0) {
        field5036++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 377)
    private final void method2126(byte arg0) {
        field5040++;
        long var2 = class375.method2193(116);
        long var4 = class298.field4239[class68.field834];
        class298.field4239[class68.field834] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class662.field8734 = ((var6 >> 1) + 32000) / var6;
        }
        class68.field834 = class68.field834 + 1 & 0x1F;
        if ((class644.field8564++) > 50) {
            class690.field9598 = true;
            class644.field8564 -= 50;
            class295.field4217.setSize(class228.field3251, class199.field2993);
            class295.field4217.setVisible(true);
            if (class218.field3143 != null && class200.field3012 == null) {
                Insets var7 = class218.field3143.getInsets();
                class295.field4217.setLocation(class348.field4882 + var7.left, class733.field10148 + var7.top);
            } else {
                class295.field4217.setLocation(class348.field4882, class733.field10148);
            }
        }
        this.method1860((byte) 59);
        int var8 = -61 % ((49 - arg0) / 35);
    }

    @OriginalMember(owner = "client!jp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 419)
    public final AppletContext getAppletContext() {
        field5023++;
        if (class218.field3143 == null) {
            return class514.field6818 == null || class514.field6818 == this ? super.getAppletContext() : class514.field6818.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)V", line = 435)
    public final void method2127(int arg0, String arg1) {
        field5028++;
        if (this.field5024) {
            return;
        }
        this.field5024 = true;
        System.out.println("error_game_" + arg1);
        try {
            if (arg0 != 32673) {
                this.method1865(false);
            }
            class124.method987("loggedout", -8364, class514.field6818);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)Z", line = 463)
    public final boolean method2128(int arg0) {
        field5037++;
        int var2 = 75 / ((arg0 + 57) / 49);
        String var3 = this.getDocumentBase().getHost().toLowerCase();
        if (var3.equals("jagex.com") || var3.endsWith(".jagex.com")) {
            return true;
        } else if (var3.equals("runescape.com") || var3.endsWith(".runescape.com")) {
            return true;
        } else if (var3.equals("stellardawn.com") || var3.endsWith(".stellardawn.com")) {
            return true;
        } else if (var3.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var3.length() > 0 && var3.charAt(var3.length() - 1) >= '0' && var3.charAt(var3.length() - 1) <= '9') {
                var3 = var3.substring(0, var3.length() - 1);
            }
            if (var3.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method2127(32673, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V", line = 499)
    private final void method2129(int arg0) {
        field5007++;
        long var2 = class375.method2193(116);
        long var4 = class433.field5954[class99.field1270];
        class433.field5954[class99.field1270] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != -2006) {
            this.method1881(-125);
        }
        class99.field1270 = class99.field1270 + 1 & 0x1F;
        synchronized (this) {
            class709.field9831 = class194.field2928;
        }
        this.method1861((byte) -95);
    }

    @OriginalMember(owner = "client!jp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 532)
    public final void windowIconified(WindowEvent arg0) {
        field5016++;
    }

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)Ljava/lang/String;", line = 539)
    public String method1882(int arg0) {
        field5039++;
        int var2 = -38 / ((43 - arg0) / 32);
        return null;
    }

    @OriginalMember(owner = "client!jp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 549)
    public final synchronized void paint(Graphics arg0) {
        field5010++;
        if (class670.field9145 != this || class170.field2615) {
            return;
        }
        class690.field9598 = true;
        if (class573.field7527 && class375.method2193(116) - class462.field6339 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class201.field3018 && var2.height >= class749.field10428) {
                class762.field10613 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V", line = 572)
    public static void method2130(byte arg0) {
        field5043 = null;
        field5042 = null;
        field5021 = null;
        if (arg0 > -74) {
            field5021 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Z", line = 584)
    public final boolean method2131(byte arg0) {
        int var2 = 95 / ((-arg0 - 78) / 37);
        field5011++;
        return class702.method3952(111, "jagmisc");
    }

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "(I)Z", line = 600)
    public final boolean method2132(int arg0) {
        field5009++;
        return arg0 == 7 ? class702.method3952(-112, "jaclib") : true;
    }

    @OriginalMember(owner = "client!jp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 611)
    public final void focusLost(FocusEvent arg0) {
        class194.field2928 = false;
        field5041++;
    }

    @OriginalMember(owner = "client!jp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 620)
    public final void windowClosing(WindowEvent arg0) {
        field5019++;
        this.destroy();
    }

    @OriginalMember(owner = "client!jp", name = "destroy", descriptor = "()V", line = 628)
    public final void destroy() {
        field5006++;
        if (class670.field9145 == this && !class170.field2615) {
            class574.field7544 = class375.method2193(116);
            class226.method1447((byte) -124, 5000L);
            class42.field553 = null;
            this.method2133(true, false);
        }
    }

    @OriginalMember(owner = "client!jp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 647)
    public final String getParameter(String arg0) {
        field5020++;
        if (class218.field3143 == null) {
            return class514.field6818 == null || class514.field6818 == this ? super.getParameter(arg0) : class514.field6818.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 664)
    public static final void provideLoaderApplet(Applet arg0) {
        field5012++;
        class514.field6818 = arg0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ)V", line = 675)
    private final void method2133(boolean arg0, boolean arg1) {
        field5031++;
        synchronized (this) {
            if (class170.field2615) {
                return;
            }
            class170.field2615 = arg0;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class514.field6818 != null) {
            class514.field6818.destroy();
        }
        try {
            this.method1865(false);
        } catch (Exception var9) {
        }
        if (this.field5033) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field5033 = false;
        }
        class521.method2892(true, 117);
        class584.method3190(120);
        if (class295.field4217 != null) {
            try {
                class295.field4217.removeFocusListener(this);
                class295.field4217.getParent().remove(class295.field4217);
            } catch (Exception var7) {
            }
        }
        if (class66.field828 != null) {
            try {
                class66.field828.method1303((byte) 127);
            } catch (Exception var6) {
            }
        }
        this.method1864(-15260);
        if (class218.field3143 != null) {
            class218.field3143.setVisible(false);
            class218.field3143.dispose();
            class218.field3143 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!jp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 747)
    public final URL getDocumentBase() {
        field5013++;
        if (class218.field3143 == null) {
            return class514.field6818 == null || class514.field6818 == this ? super.getDocumentBase() : class514.field6818.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 763)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5022++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(CI)Z", line = 781)
    public static final boolean method2134(char arg0, int arg1) {
        field5014++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class540.field7158;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return arg1 >= -44;
    }

    @OriginalMember(owner = "client!jp", name = "start", descriptor = "()V", line = 815)
    public final void start() {
        field5034++;
        if (class670.field9145 == this && !class170.field2615) {
            class574.field7544 = 0L;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
    public abstract void method1865(boolean arg0);

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public abstract void method1861(byte arg0);

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public abstract void method1864(int arg0);

    @OriginalMember(owner = "client!jp", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
    public abstract void method1881(int arg0);

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)V")
    public abstract void method1860(byte arg0);
}
