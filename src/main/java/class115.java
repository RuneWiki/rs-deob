import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class115 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "Z")
    private boolean field2106 = false;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lsg;")
    private static class169 field2094 = class165.method1060("Please try using a different world)3", 1536);

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
    public static int[] field2128 = new int[4000];

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lsg;")
    public static class169 field2125 = class165.method1060("<col=00ff00>", 1536);

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field2118 = 0;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lsg;")
    public static class169 field2095 = field2094;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "Lsg;")
    public static class169 field2130 = field2094;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lsg;")
    public static class169 field2097 = field2094;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Lsg;")
    public static class169 field2127 = field2094;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Lsg;")
    public static class169 field2107 = field2094;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "Lsg;")
    public static class169 field2134 = field2094;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[I")
    public static int[] field2090 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lsg;")
    private static class169 field2136 = class165.method1060("Walk here", 1536);

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lsg;")
    public static class169 field2104 = field2136;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lgd;")
    public static class59 field2103;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lke;")
    public static class95 field2105;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    private final synchronized void method700(boolean arg0) {
        field2092++;
        if (class11.field261) {
            return;
        }
        class11.field261 = arg0;
        try {
            class1.field4.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            this.method198(765);
        } catch (Exception var4) {
        }
        if (class164.field3148 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class163.field3134 != null) {
            try {
                class163.field3134.method673(15993);
            } catch (Exception var2) {
            }
        }
        this.method196(2);
    }

    @OriginalMember(owner = "client!mg", name = "start", descriptor = "()V")
    public final void start() {
        field2123++;
        if (class7.field208 == this && !class11.field261) {
            class1.field6 = 0L;
        }
    }

    @OriginalMember(owner = "client!mg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2120++;
        if (class7.field208 == this && !class11.field261) {
            class1.field6 = class116.method712((byte) -93);
            client.method203(5000L, (byte) -128);
            class150.field2828 = null;
            this.method700(true);
        }
    }

    @OriginalMember(owner = "client!mg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2114++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method701(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field2089++;
        try {
            class135.field2519 = arg1;
            class7.field208 = this;
            class9.field246 = arg5;
            class82.field1511 = arg0;
            class164.field3148 = new Frame();
            class164.field3148.setTitle("Jagex");
            class164.field3148.setResizable(false);
            class164.field3148.addWindowListener(this);
            class164.field3148.setVisible(true);
            class164.field3148.toFront();
            Insets var8 = class164.field3148.getInsets();
            if (arg2 <= 59) {
                field2105 = null;
            }
            class164.field3148.setSize(arg1 + var8.left + var8.right, arg5 - (-var8.top + -var8.bottom));
            class150.field2828 = class163.field3134 = new class109(true, null, arg6, arg4, arg3);
            class163.field3134.method676(0, this, 1);
        } catch (Exception var10) {
            class21.method142(-98, null, var10);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
    public final boolean method702(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field2099++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            }
            this.method708("invalidhost", 0);
            if (arg0 < 65) {
                field2097 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2108++;
        if (class7.field208 != this || class11.field261) {
            return;
        }
        class180.field3513 = true;
        if (class109.field1984 != null && class109.field1984.startsWith("1.5") && class116.method712((byte) -68) - class174.field3363 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class135.field2519 <= var2.width && class9.field246 <= var2.height) {
                class185.field3615 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2101++;
        if (class164.field3148 == null) {
            return class163.field3134 == null || class163.field3134.field1986 == this ? super.getDocumentBase() : class163.field3134.field1986.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public abstract void method196(int arg0);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
    private final void method703(boolean arg0) {
        field2110++;
        long var2 = class116.method712((byte) -104);
        long var4 = class26.field533[class28.field565];
        class26.field533[class28.field565] = var2;
        class28.field565 = class28.field565 + 1 & 0x1F;
        synchronized (this) {
            class45.field839 = class121.field2232;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (!arg0) {
            this.method701(95, -55, 17, -71, null, -123, 60);
        }
        this.method195(7604);
    }

    @OriginalMember(owner = "client!mg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2132++;
        if (class164.field3148 == null) {
            return class163.field3134 == null || class163.field3134.field1986 == this ? super.getCodeBase() : class163.field3134.field1986.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    public final void method704(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2126++;
        if (arg2 != 3617) {
            field2130 = null;
        }
        try {
            if (class7.field208 == null) {
                class135.field2519 = arg0;
                class7.field208 = this;
                class9.field246 = arg3;
                class82.field1511 = arg4;
                if (class163.field3134 == null) {
                    class150.field2828 = class163.field3134 = new class109(false, this, arg1, null, 0);
                }
                class163.field3134.method676(0, this, 1);
            } else {
                class95.field1809++;
                if (class95.field1809 >= 3) {
                    this.method708("alreadyloaded", 0);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class21.method142(-78, null, var7);
            this.method708("crash", 0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2100++;
    }

    @OriginalMember(owner = "client!mg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!mg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2096++;
    }

    @OriginalMember(owner = "client!mg", name = "providesignlink", descriptor = "(Lma;)V")
    public static final void providesignlink(class109 arg0) {
        field2091++;
        class163.field3134 = arg0;
        class150.field2828 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    private final void method705(int arg0) {
        long var2 = class116.method712((byte) -101);
        long var4 = class125.field2289[class121.field2225];
        class125.field2289[class121.field2225] = var2;
        if (arg0 <= 51) {
            this.windowOpened(null);
        }
        class121.field2225 = class121.field2225 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class158.field3018 = ((var6 >> 1) + 32000) / var6;
        }
        if (class197.field3880++ > 50) {
            class180.field3513 = true;
            class197.field3880 -= 50;
            class1.field4.setSize(class135.field2519, class9.field246);
            class1.field4.setVisible(true);
            if (class164.field3148 == null) {
                class1.field4.setLocation(0, 0);
            } else {
                Insets var7 = class164.field3148.getInsets();
                class1.field4.setLocation(var7.left, var7.top);
            }
        }
        field2121++;
        this.method197(5);
    }

    @OriginalMember(owner = "client!mg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2116++;
    }

    @OriginalMember(owner = "client!mg", name = "stop", descriptor = "()V")
    public final void stop() {
        field2119++;
        if (class7.field208 == this && !class11.field261) {
            class1.field6 = class116.method712((byte) -119) + 4000L;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLsg;I)V")
    public static final void method706(boolean arg0, class169 arg1, int arg2) {
        if (!arg0) {
            field2128 = null;
        }
        field2129++;
        class169 var3 = arg1.method1118(-13).method1127((byte) 73);
        boolean var4 = false;
        for (int var5 = 0; var5 < class141.field2631; var5++) {
            class196 var6 = class65.field1213[class202.field3932[var5]];
            if (var6 != null && var6.field3856 != null && var6.field3856.method1110(var3, 70)) {
                class161.method1037(false, -17868, class4.field79.field3734[0], var6.field3734[0], 2, 1, class4.field79.field3729[0], 0, 0, 0, var6.field3729[0], 1);
                if (arg2 == 1) {
                    class141.field2621.method1024(100, (byte) -94);
                    class142.field2643++;
                    class141.field2621.method801(class202.field3932[var5], (byte) 87);
                } else if (arg2 == 4) {
                    class141.field2621.method1024(181, (byte) -94);
                    class141.field2621.method828((byte) -61, class202.field3932[var5]);
                    class31.field665++;
                } else if (arg2 == 6) {
                    class141.field2621.method1024(203, (byte) -94);
                    class141.field2621.method828((byte) -61, class202.field3932[var5]);
                    class76.field1434++;
                } else if (arg2 == 7) {
                    class141.field2621.method1024(119, (byte) -94);
                    class141.field2621.method828((byte) -61, class202.field3932[var5]);
                    class120.field2207++;
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class199.method1307((byte) 120, class45.field838, class165.method1058(0, new class169[] { class204.field3998, var3 }), 0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2124++;
        if (class164.field3148 == null) {
            return class163.field3134 == null || class163.field3134.field1986 == this ? super.getAppletContext() : class163.field3134.field1986.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2111++;
        class121.field2232 = false;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!mg", name = "run", descriptor = "()V")
    public final void run() {
        field2117++;
        try {
            if (class109.field1993 != null) {
                String var1 = class109.field1993.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class109.field1984;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method708("wrongjava", 0);
                        return;
                    }
                    class86.field1579 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class109.field1984 == null || class109.field1984.equals("1.4.2"))) {
                    this.method708("wrongjava", 0);
                    return;
                }
            }
            if (class163.field3134.field1986 != null) {
                Method var3 = class109.field1992;
                if (var3 != null) {
                    try {
                        var3.invoke(class163.field3134.field1986, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method707(true);
            class174.field3354 = class41.method269(19771, class1.field4, class135.field2519, class9.field246);
            this.method201(0);
            class174.field3374 = class101.method594(0);
            while (class1.field6 == 0L || class116.method712((byte) -67) < class1.field6) {
                class81.field1492 = class174.field3374.method270(class152.field2930, class86.field1579, 107);
                for (int var4 = 0; var4 < class81.field1492; var4++) {
                    this.method703(true);
                }
                this.method705(106);
                class138.method926(class163.field3134, class1.field4, 1);
            }
        } catch (Exception var7) {
            class21.method142(-80, null, var7);
            this.method708("crash", 0);
        }
        this.method700(true);
    }

    @OriginalMember(owner = "client!mg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class121.field2232 = true;
        class180.field3513 = true;
        field2122++;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(Z)V")
    public final synchronized void method707(boolean arg0) {
        field2098++;
        Container var2;
        if (class164.field3148 == null) {
            var2 = class163.field3134.field1986;
        } else {
            var2 = class164.field3148;
        }
        if (class1.field4 != null) {
            class1.field4.removeFocusListener(this);
            var2.remove(class1.field4);
        }
        class1.field4 = new class171(this);
        var2.add(class1.field4);
        class1.field4.setSize(class135.field2519, class9.field246);
        class1.field4.setVisible(true);
        if (class164.field3148 == null) {
            class1.field4.setLocation(0, 0);
        } else {
            Insets var3 = class164.field3148.getInsets();
            class1.field4.setLocation(var3.left, var3.top);
        }
        class1.field4.addFocusListener(this);
        class1.field4.requestFocus();
        class180.field3513 = arg0;
        class185.field3615 = false;
        class174.field3363 = class116.method712((byte) -63);
    }

    @OriginalMember(owner = "client!mg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2102++;
        if (class164.field3148 == null) {
            return class163.field3134 == null || class163.field3134.field1986 == this ? super.getParameter(arg0) : class163.field3134.field1986.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2113++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method708(String arg0, int arg1) {
        field2131++;
        if (this.field2106) {
            return;
        }
        this.field2106 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 0) {
                field2095 = null;
            }
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method709(int arg0) {
        field2104 = null;
        field2097 = null;
        if (arg0 != 30) {
            field2103 = null;
        }
        field2090 = null;
        field2094 = null;
        field2105 = null;
        field2128 = null;
        field2103 = null;
        field2136 = null;
        field2134 = null;
        field2130 = null;
        field2125 = null;
        field2107 = null;
        field2127 = null;
        field2095 = null;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V")
    public abstract void method201(int arg0);

    @OriginalMember(owner = "client!mg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2112++;
    }

    @OriginalMember(owner = "client!mg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2093++;
    }

    @OriginalMember(owner = "client!mg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2109++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V")
    public abstract void method195(int arg0);
}
