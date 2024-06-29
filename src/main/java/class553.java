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

@OriginalClass("client!efa")
public abstract class class553 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "Z")
    private boolean field7012 = false;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "Z")
    private boolean field7002 = false;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "Z")
    public static boolean field7004 = false;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field7018 = 0;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
    public static int field7021 = 0;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!efa", name = "G", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "I")
    public static int field7029;

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!efa", name = "L", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!efa", name = "M", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!efa", name = "N", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!efa", name = "O", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!efa", name = "P", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!efa", name = "U", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!efa", name = "V", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!efa", name = "W", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!efa", name = "Z", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!efa", name = "eb", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!efa", name = "fb", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!efa", name = "Q", descriptor = "Z")
    public static boolean field7038;

    @OriginalMember(owner = "client!efa", name = "R", descriptor = "Z")
    public static boolean field7039;

    @OriginalMember(owner = "client!efa", name = "S", descriptor = "Z")
    public static boolean field7040;

    @OriginalMember(owner = "client!efa", name = "T", descriptor = "Z")
    public static boolean field7041;

    @OriginalMember(owner = "client!efa", name = "X", descriptor = "Z")
    public static boolean field7045;

    @OriginalMember(owner = "client!efa", name = "Y", descriptor = "Z")
    public static boolean field7046;

    @OriginalMember(owner = "client!efa", name = "ab", descriptor = "Z")
    public static boolean field7048;

    @OriginalMember(owner = "client!efa", name = "bb", descriptor = "Z")
    public static boolean field7049;

    @OriginalMember(owner = "client!efa", name = "cb", descriptor = "Z")
    public static boolean field7050;

    @OriginalMember(owner = "client!efa", name = "db", descriptor = "Z")
    public static boolean field7051;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method2997(int arg0) {
        field7026++;
        if (arg0 != 11) {
            this.destroy();
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
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
                this.method3000(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "stop", descriptor = "()V", line = 42)
    public final void stop() {
        field7006++;
        if (class29.field265 == this && !class607.field7684) {
            class26.field228 = class502.method2786(-7114) + 4000L;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIILjava/lang/String;)V", line = 54)
    public final void method2998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field7023++;
        try {
            if (class29.field265 == null) {
                class463.field6021 = arg3;
                class310.field3886 = arg3;
                class29.field265 = this;
                class143.field1858 = arg2;
                class257.field3477 = 0;
                class372.field4550 = arg0;
                class773.field10518 = arg0;
                class144.field1866 = class80.field1134;
                class483.field6237 = 0;
                int var8 = -21 % ((arg1 - 34) / 44);
                class370.field4537 = class740.field10014 = new class775(arg4, arg6, arg5, class80.field1134 != null);
                class339 var9 = class740.field10014.method4248(this, 0, 1);
                while (var9.field4144 == 0) {
                    class591.method3181(10L, 0);
                }
            } else {
                class96.field1308++;
                if (class96.field1308 >= 3) {
                    this.method3000(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var11) {
            class416.method2401(1, var11, null);
            this.method3000(false, "crash");
        }
    }

    @OriginalMember(owner = "client!efa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 99)
    public final void windowDeiconified(WindowEvent arg0) {
        field7031++;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Z", line = 107)
    public final boolean method2999(int arg0) {
        if (arg0 != -3063) {
            this.method3001(12, (byte) 7, 94, 75, null, 2, -42, true);
        }
        field7008++;
        return class382.method2194("jagtheora", 31749);
    }

    @OriginalMember(owner = "client!efa", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 119)
    public final URL getCodeBase() {
        field7019++;
        if (class340.field4176 == null) {
            return class80.field1134 == null || class80.field1134 == this ? super.getCodeBase() : class80.field1134.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 137)
    public final URL getDocumentBase() {
        field7028++;
        if (class340.field4176 == null) {
            return class80.field1134 == null || class80.field1134 == this ? super.getDocumentBase() : class80.field1134.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Ljava/lang/String;", line = 153)
    public String method2621(byte arg0) {
        if (arg0 < 117) {
            this.method2622(113);
        }
        field7013++;
        return null;
    }

    @OriginalMember(owner = "client!efa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 164)
    public final AppletContext getAppletContext() {
        field7005++;
        if (class340.field4176 == null) {
            return class80.field1134 == null || class80.field1134 == this ? super.getAppletContext() : class80.field1134.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 181)
    public final void windowClosing(WindowEvent arg0) {
        field7027++;
        this.destroy();
    }

    @OriginalMember(owner = "client!efa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 190)
    public final void windowDeactivated(WindowEvent arg0) {
        field7003++;
    }

    @OriginalMember(owner = "client!efa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 197)
    public final void focusLost(FocusEvent arg0) {
        field7032++;
        class585.field7410 = false;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 206)
    public final void method3000(boolean arg0, String arg1) {
        field7009++;
        if (this.field7002) {
            return;
        }
        if (arg0) {
            this.method3006(-88);
        }
        this.field7002 = true;
        System.out.println("error_game_" + arg1);
        try {
            class586.method3137(8259, "loggedout", class80.field1134);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!efa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 232)
    public final String getParameter(String arg0) {
        field7017++;
        if (class340.field4176 == null) {
            return class80.field1134 == null || class80.field1134 == this ? super.getParameter(arg0) : class80.field1134.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 246)
    public final void windowActivated(WindowEvent arg0) {
        field7011++;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBIILjava/lang/String;IIZ)V", line = 253)
    public final void method3001(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6, boolean arg7) {
        try {
            class463.field6021 = arg5;
            class310.field3886 = arg5;
            class144.field1866 = null;
            class143.field1858 = arg6;
            class29.field265 = this;
            class372.field4550 = arg3;
            class773.field10518 = arg3;
            class257.field3477 = 0;
            class483.field6237 = 0;
            class340.field4176 = new Frame();
            class340.field4176.setTitle("Jagex");
            class340.field4176.setResizable(true);
            class340.field4176.addWindowListener(this);
            class340.field4176.setVisible(true);
            class340.field4176.toFront();
            Insets var9 = class340.field4176.getInsets();
            if (arg1 != 39) {
                this.windowClosing(null);
            }
            class340.field4176.setSize(class773.field10518 + var9.left + var9.right, var9.top + var9.bottom + class310.field3886);
            class370.field4537 = class740.field10014 = new class775(arg0, arg4, arg2, true);
            class339 var10 = class740.field10014.method4248(this, 0, 1);
            while (var10.field4144 == 0) {
                class591.method3181(10L, 0);
            }
        } catch (Exception var12) {
            class416.method2401(1, var12, null);
        }
        field7014++;
    }

    @OriginalMember(owner = "client!efa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 296)
    public final void windowOpened(WindowEvent arg0) {
        field7029++;
    }

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)Z", line = 303)
    public final boolean method3002(byte arg0) {
        if (arg0 >= -104) {
            provideLoaderApplet(null);
        }
        field7010++;
        return class382.method2194("jaclib", 31749);
    }

    @OriginalMember(owner = "client!efa", name = "run", descriptor = "()V", line = 320)
    public final void run() {
        field6999++;
        try {
            if (class775.field10583 != null) {
                String var1 = class775.field10583.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class775.field10565;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3000(false, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class775.field10565 == null || class775.field10565.equals("1.4.2"))) {
                    this.method3000(false, "wrongjava");
                    return;
                }
            }
            if (class775.field10565 != null && class775.field10565.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class775.field10565.length()) {
                    char var5 = class775.field10565.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
                if (var4 >= 5) {
                    class614.field7748 = true;
                }
            }
            Applet var6 = class29.field265;
            if (class80.field1134 != null) {
                var6 = class80.field1134;
            }
            Method var7 = class775.field10580;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class571.method3082(0);
            class116.method680(0);
            this.method2639(-107);
            this.method2640((byte) -104);
            class259.field3487 = class168.method1069(5123);
            while (class26.field228 == 0L || class502.method2786(-7114) < class26.field228) {
                class48.field615 = class259.field3487.method3271(class507.field6481, 0);
                for (int var8 = 0; var8 < class48.field615; var8++) {
                    this.method3007((byte) 36);
                }
                this.method3006(-77);
                class705.method3815(false, class678.field8763, class740.field10014);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class416.method2401(1, var20, this.method2621((byte) 120));
            this.method3000(false, "crash");
        } finally {
            Object var13 = null;
            this.method3004(29890, true);
        }
    }

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Z", line = 453)
    public final boolean method3003(byte arg0) {
        int var2 = -29 / ((13 - arg0) / 56);
        field7020++;
        return class382.method2194("jagmisc", 31749);
    }

    @OriginalMember(owner = "client!efa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V", line = 467)
    public static final void provideLoaderApplet(Applet arg0) {
        class80.field1134 = arg0;
        field6996++;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IZ)V", line = 476)
    private final void method3004(int arg0, boolean arg1) {
        field7034++;
        synchronized (this) {
            if (class607.field7684) {
                return;
            }
            class607.field7684 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class80.field1134 != null) {
            class80.field1134.destroy();
        }
        try {
            if (arg0 != 29890) {
                field7018 = -50;
            }
            this.method2645(false);
        } catch (Exception var9) {
        }
        if (this.field7012) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field7012 = false;
        }
        class18.method84(-112, true);
        class420.method2429(true);
        if (class678.field8763 != null) {
            try {
                class678.field8763.removeFocusListener(this);
                class678.field8763.getParent().remove(class678.field8763);
            } catch (Exception var7) {
            }
        }
        if (class740.field10014 != null) {
            try {
                class740.field10014.method4247((byte) 71);
            } catch (Exception var6) {
            }
        }
        this.method2622(arg0 - 30004);
        if (class340.field4176 != null) {
            class340.field4176.setVisible(false);
            class340.field4176.dispose();
            class340.field4176 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!efa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 557)
    public final void focusGained(FocusEvent arg0) {
        field7024++;
        class585.field7410 = true;
        class192.field2684 = true;
    }

    @OriginalMember(owner = "client!efa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 567)
    public final void windowIconified(WindowEvent arg0) {
        field7025++;
    }

    @OriginalMember(owner = "client!efa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 585)
    public final void windowClosed(WindowEvent arg0) {
        field7016++;
    }

    @OriginalMember(owner = "client!efa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 592)
    public final void update(Graphics arg0) {
        field6997++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(I)V", line = 605)
    public static final void method3005(int arg0) {
        field7000++;
        class423.field5567 = arg0;
        int var1 = (class422.field5564.field2896 >> 9) + class714.field9407;
        int var2 = (class422.field5564.field2900 >> 9) + class240.field3293;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class423.field5567 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class423.field5567 = 1;
        }
        if (class423.field5567 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class423.field5567 = 0;
        }
    }

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(I)V", line = 635)
    private final void method3006(int arg0) {
        field6998++;
        if (arg0 >= -73) {
            field7004 = true;
        }
        long var2 = class502.method2786(-7114);
        long var4 = class346.field4234[class223.field3034];
        class346.field4234[class223.field3034] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class92.field1254 = ((var6 >> 1) + 32000) / var6;
        }
        class223.field3034 = class223.field3034 + 1 & 0x1F;
        if (class699.field9271++ > 50) {
            class192.field2684 = true;
            class699.field9271 -= 50;
            class678.field8763.setSize(class372.field4550, class463.field6021);
            class678.field8763.setVisible(true);
            if (class340.field4176 != null && class9.field80 == null) {
                Insets var7 = class340.field4176.getInsets();
                class678.field8763.setLocation(class483.field6237 + var7.left, var7.top - -class257.field3477);
            } else {
                class678.field8763.setLocation(class483.field6237, class257.field3477);
            }
        }
        this.method2624((byte) 97);
    }

    @OriginalMember(owner = "client!efa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 679)
    public final synchronized void paint(Graphics arg0) {
        field7015++;
        if (class29.field265 != this || class607.field7684) {
            return;
        }
        class192.field2684 = true;
        if (class614.field7748 && class502.method2786(-7114) - class309.field3866 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class773.field10518 <= var2.width && var2.height >= class310.field3886) {
                class569.field7188 = true;
            }
        }
    }

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)V", line = 699)
    public synchronized void method2639(int arg0) {
        if (class678.field8763 != null) {
            class678.field8763.removeFocusListener(this);
            class678.field8763.getParent().setBackground(Color.black);
            class678.field8763.getParent().remove(class678.field8763);
        }
        field7007++;
        Container var2;
        if (class9.field80 != null) {
            var2 = class9.field80;
        } else if (class340.field4176 != null) {
            var2 = class340.field4176;
        } else if (class80.field1134 == null) {
            var2 = class29.field265;
        } else {
            var2 = class80.field1134;
        }
        var2.setLayout(null);
        class678.field8763 = new class290(this);
        var2.add(class678.field8763);
        class678.field8763.setSize(class372.field4550, class463.field6021);
        class678.field8763.setVisible(true);
        if (class340.field4176 == var2) {
            Insets var3 = class340.field4176.getInsets();
            class678.field8763.setLocation(class483.field6237 + var3.left, class257.field3477 + var3.top);
        } else {
            class678.field8763.setLocation(class483.field6237, class257.field3477);
        }
        class678.field8763.addFocusListener(this);
        class678.field8763.requestFocus();
        int var4 = 7 % ((arg0 + 47) / 60);
        class522.field6651 = true;
        class585.field7410 = true;
        class192.field2684 = true;
        class569.field7188 = false;
        class309.field3866 = class502.method2786(-7114);
    }

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "(B)V", line = 751)
    private final void method3007(byte arg0) {
        field7030++;
        long var2 = class502.method2786(arg0 ^ 0xFFFFE412);
        long var4 = class678.field8777[class704.field9312];
        class678.field8777[class704.field9312] = var2;
        if (arg0 != 36) {
            return;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class704.field9312 = class704.field9312 + 1 & 0x1F;
        synchronized (this) {
            class522.field6651 = class585.field7410;
        }
        this.method2632(4);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)Z", line = 784)
    public static final boolean method3008(int arg0, int arg1) {
        if (arg0 != -22038) {
            method3008(-69, -40);
        }
        field7001++;
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!efa", name = "destroy", descriptor = "()V", line = 796)
    public final void destroy() {
        field7033++;
        if (class29.field265 == this && !class607.field7684) {
            class26.field228 = class502.method2786(-7114);
            class591.method3181(5000L, 0);
            class370.field4537 = null;
            this.method3004(29890, false);
        }
    }

    @OriginalMember(owner = "client!efa", name = "start", descriptor = "()V", line = 811)
    public final void start() {
        field7022++;
        if (class29.field265 == this && !class607.field7684) {
            class26.field228 = 0L;
        }
    }

    @OriginalMember(owner = "client!efa", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
    public abstract void method2632(int arg0);

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
    public abstract void method2645(boolean arg0);

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)V")
    public abstract void method2624(byte arg0);

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "(B)V")
    public abstract void method2640(byte arg0);

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "(I)V")
    public abstract void method2622(int arg0);
}
