import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
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

@OriginalClass("client!gd")
public abstract class class188 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
    private boolean field2572 = false;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Z")
    private boolean field2574 = false;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lkn;")
    public static class442 field2564 = new class442("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "[I")
    public static int[] field2598 = new int[13];

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field2599 = -1;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field2596 = 0;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lms;")
    public static class453 field2600 = null;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Lec;")
    public static class129 field2593 = new class129(16);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Z")
    public static boolean field2604;

    @OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2584++;
        class45.field635 = false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public abstract void method1086(int arg0);

    @OriginalMember(owner = "client!gd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2578++;
        this.destroy();
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    private final void method1217(int arg0) {
        field2588++;
        long var2 = class385.method2442(-6631);
        long var4 = class212.field2971[class155.field2190];
        class212.field2971[class155.field2190] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class70.field1030 = ((var6 >> 1) + 32000) / var6;
        }
        class155.field2190 = class155.field2190 + 1 & 0x1F;
        if (class99.field1376++ > 50) {
            class99.field1376 -= 50;
            class181.field2482 = true;
            class304.field4191.setSize(class47.field661, class214.field2993);
            class304.field4191.setVisible(true);
            if (class79.field1119 != null && class217.field2997 == null) {
                Insets var7 = class79.field1119.getInsets();
                class304.field4191.setLocation(class180.field2469 + var7.left, class237.field3366 + var7.top);
            } else {
                class304.field4191.setLocation(class180.field2469, class237.field3366);
            }
        }
        int var8 = -32 % ((arg0 - 73) / 34);
        this.method1098(49);
    }

    @OriginalMember(owner = "client!gd", name = "start", descriptor = "()V")
    public final void start() {
        field2575++;
        if (class412.field5846 == this && !class243.field3442) {
            class74.field1067 = 0L;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
    public static final void method1218(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6) {
        field2569++;
        class293 var7 = new class293();
        var7.field4107 = arg6;
        var7.field4101 = class276.field3837 + arg4;
        var7.field4099 = arg1;
        var7.field4105 = arg5;
        if (arg0 > 122) {
            var7.field4100 = arg3;
            var7.field4103 = arg2;
            class62.field855.method1009(var7, false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2579++;
        if (class79.field1119 == null) {
            return class241.field3426 == null || class241.field3426.field4121 == this ? super.getParameter(arg0) : class241.field3426.field4121.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    private final void method1219(int arg0, boolean arg1) {
        field2587++;
        synchronized (this) {
            if (class243.field3442) {
                return;
            }
            class243.field3442 = true;
        }
        if (class241.field3426.field4121 != null) {
            class241.field3426.field4121.destroy();
        }
        try {
            this.method1088(-1);
        } catch (Exception var11) {
        }
        if (this.field2574) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field2574 = false;
        }
        class283 var4 = class241.field3426.method1896(class412.field5846.getClass(), 102);
        while (var4.field3998 == 0) {
            class349.method2219(100L, -51);
        }
        if (arg0 >= -16) {
            this.method1224((byte) 108);
        }
        if (class304.field4191 != null) {
            try {
                class304.field4191.removeFocusListener(this);
                class304.field4191.getParent().remove(class304.field4191);
            } catch (Exception var9) {
            }
        }
        if (class241.field3426 != null) {
            try {
                class241.field3426.method1902(22805);
            } catch (Exception var8) {
            }
        }
        this.method1086(0);
        if (class79.field1119 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!gd", name = "providesignlink", descriptor = "(Lko;)V")
    public static final void providesignlink(class294 arg0) {
        class241.field3426 = arg0;
        class229.field3330 = arg0;
        field2592++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V")
    public final void method1220(String arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class418.field5936 = arg7;
            class180.field2469 = 0;
            class412.field5846 = this;
            class47.field661 = arg3;
            class197.field2713 = arg3;
            class214.field2993 = arg2;
            class335.field4614 = arg2;
            class237.field3366 = 0;
            class79.field1119 = new Frame();
            class79.field1119.setTitle("Jagex");
            class79.field1119.setResizable(true);
            if (arg5 != -1) {
                this.field2572 = false;
            }
            class79.field1119.addWindowListener(this);
            class79.field1119.setVisible(true);
            class79.field1119.toFront();
            Insets var9 = class79.field1119.getInsets();
            class79.field1119.setSize(var9.right + var9.left + class197.field2713, class335.field4614 - -var9.top + var9.bottom);
            class229.field3330 = class241.field3426 = new class294((Applet) null, arg4, arg0, arg6);
            class283 var10 = class241.field3426.method1916((byte) -63, 1, this);
            while (var10.field3998 == 0) {
                class349.method2219(10L, -38);
            }
        } catch (Exception var12) {
            class271.method1776(-2296, var12, (String) null);
        }
        field2567++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1221(int arg0, int arg1, int arg2) {
        field2583++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (arg0 > -53) {
            return null;
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2563++;
    }

    @OriginalMember(owner = "client!gd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2595++;
    }

    @OriginalMember(owner = "client!gd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2568++;
    }

    @OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2577++;
        class45.field635 = true;
        class181.field2482 = true;
    }

    @OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2581++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!gd", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2565++;
        if (class412.field5846 == this && !class243.field3442) {
            class74.field1067 = class385.method2442(-6631);
            class349.method2219(5000L, -42);
            class229.field3330 = null;
            this.method1219(-49, false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2580++;
    }

    @OriginalMember(owner = "client!gd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2573++;
    }

    @OriginalMember(owner = "client!gd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2562++;
        if (class79.field1119 == null) {
            return class241.field3426 == null || class241.field3426.field4121 == this ? super.getDocumentBase() : class241.field3426.field4121.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2585++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final synchronized void method1222(int arg0) {
        if (arg0 != 0) {
            this.windowDeiconified((WindowEvent) null);
        }
        field2571++;
        if (class304.field4191 != null) {
            class304.field4191.removeFocusListener(this);
            class304.field4191.getParent().remove(class304.field4191);
        }
        Container var2;
        if (class217.field2997 != null) {
            var2 = class217.field2997;
        } else if (class79.field1119 == null) {
            var2 = class241.field3426.field4121;
        } else {
            var2 = class79.field1119;
        }
        var2.setLayout((LayoutManager) null);
        class304.field4191 = new class47(this);
        var2.add(class304.field4191);
        class304.field4191.setSize(class47.field661, class214.field2993);
        class304.field4191.setVisible(true);
        if (class79.field1119 == var2) {
            Insets var3 = class79.field1119.getInsets();
            class304.field4191.setLocation(class180.field2469 + var3.left, class237.field3366 + var3.top);
        } else {
            class304.field4191.setLocation(class180.field2469, class237.field3366);
        }
        class304.field4191.addFocusListener(this);
        class304.field4191.requestFocus();
        class295.field4130 = true;
        class45.field635 = true;
        class181.field2482 = true;
        class144.field2062 = false;
        class378.field5409 = class385.method2442(-6631);
    }

    @OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label112: {
                if (class294.field4116 != null) {
                    String var1 = class294.field4116.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class294.field4123;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1225("wrongjava", 10);
                            break label112;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class294.field4123 == null || class294.field4123.equals("1.4.2"))) {
                        this.method1225("wrongjava", 10);
                        break label112;
                    }
                }
                if (class294.field4123 != null && class294.field4123.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class294.field4123.length() > var3) {
                        char var5 = class294.field4123.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class205.field2826 = true;
                    }
                }
                if (class241.field3426.field4121 != null) {
                    Method var6 = class294.field4128;
                    if (var6 != null) {
                        try {
                            var6.invoke(class241.field3426.field4121, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class198.method1297(-1766);
                class274.method1786(18865);
                this.method1222(0);
                this.method1084((byte) 18);
                class163.field2261 = class360.method2302((byte) -36);
                this.method1227(true);
                while (class74.field1067 == 0L || class74.field1067 > class385.method2442(-6631)) {
                    class240.field3422 = class163.field2261.method1195(class410.field5802, (byte) -115);
                    for (int var7 = 0; var7 < class240.field3422; var7++) {
                        this.method1224((byte) -112);
                    }
                    this.method1217(109);
                    class346.method2196(-109, class304.field4191, class241.field3426);
                }
            }
        } catch (Exception var10) {
            class271.method1776(-2296, var10, (String) null);
            this.method1225("crash", 10);
        }
        field2570++;
        this.method1219(-111, true);
    }

    @OriginalMember(owner = "client!gd", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
    public final boolean method1223(byte arg0) {
        field2594++;
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
            if (arg0 > -53) {
                field2593 = null;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1225("invalidhost", 10);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    private final void method1224(byte arg0) {
        field2589++;
        long var2 = class385.method2442(-6631);
        long var4 = class348.field4770[class61.field838];
        class348.field4770[class61.field838] = var2;
        class61.field838 = class61.field838 + 1 & 0x1F;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class295.field4130 = class45.field635;
        }
        this.method1102(-10);
        int var7 = 40 % ((arg0 - 46) / 42);
    }

    @OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2576++;
        if (class412.field5846 != this || class243.field3442) {
            return;
        }
        class181.field2482 = true;
        if (class205.field2826 && class385.method2442(-6631) - class378.field5409 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class197.field2713 <= var2.width && var2.height >= class335.field4614) {
                class144.field2062 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public abstract void method1098(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1225(String arg0, int arg1) {
        field2590++;
        if (this.field2572) {
            return;
        }
        this.field2572 = true;
        if (arg1 != 10) {
            this.getDocumentBase();
        }
        System.out.println("error_game_" + arg0);
        try {
            class262.method1715("loggedout", class241.field3426.field4121, (byte) -112);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
    public final void method1226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2582++;
        try {
            if (class412.field5846 != null) {
                class404.field5737++;
                if (class404.field5737 >= 3) {
                    this.method1225("alreadyloaded", 10);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg0 == 21669) {
                class237.field3366 = 0;
                class412.field5846 = this;
                class47.field661 = arg1;
                class197.field2713 = arg1;
                class180.field2469 = 0;
                class214.field2993 = arg3;
                class335.field4614 = arg3;
                class418.field5936 = arg4;
                if (class241.field3426 == null) {
                    class229.field3330 = class241.field3426 = new class294(this, arg2, (String) null, 0);
                }
                class283 var6 = class241.field3426.method1916((byte) -63, 1, this);
                while (var6.field3998 == 0) {
                    class349.method2219(10L, -114);
                }
            }
        } catch (Exception var8) {
            class271.method1776(arg0 ^ 0xFFFFA3AD, var8, (String) null);
            this.method1225("crash", arg0 - 21659);
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public abstract void method1088(int arg0);

    @OriginalMember(owner = "client!gd", name = "stop", descriptor = "()V")
    public final void stop() {
        field2561++;
        if (class412.field5846 == this && !class243.field3442) {
            class74.field1067 = class385.method2442(-6631) + 4000L;
        }
    }

    @OriginalMember(owner = "client!gd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2566++;
        if (class79.field1119 == null) {
            return class241.field3426 == null || class241.field3426.field4121 == this ? super.getCodeBase() : class241.field3426.field4121.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public abstract void method1102(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method1227(boolean arg0) {
        field2591++;
        if (!this.field2574) {
            try {
                class283 var2 = class241.field3426.method1922(class412.field5846.getClass(), (byte) -84);
                while (var2.field3998 == 0) {
                    class349.method2219(100L, -89);
                }
                if (var2.field3999 != null) {
                    throw (Throwable) var2.field3999;
                }
                jagmisc.init();
                this.field2574 = true;
                class163.field2261 = class360.method2302((byte) -115);
            } catch (Throwable var3) {
            }
        }
        if (!arg0) {
            field2601 = 113;
        }
    }

    @OriginalMember(owner = "client!gd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2586++;
        if (class79.field1119 == null) {
            return class241.field3426 == null || class241.field3426.field4121 == this ? super.getAppletContext() : class241.field3426.field4121.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public abstract void method1084(byte arg0);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        field2598 = null;
        field2593 = null;
        field2564 = null;
        field2600 = null;
        int var1 = -113 % ((15 - arg0) / 52);
    }
}
