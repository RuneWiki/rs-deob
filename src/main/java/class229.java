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

@OriginalClass("client!up")
public abstract class class229 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!up", name = "h", descriptor = "Z")
    private boolean field2815 = false;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Z")
    private boolean field2827 = false;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "F")
    public static float field2840;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "Z")
    public static boolean field2843;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "Z")
    public static boolean field2846;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
    public static boolean field2849;

    @OriginalMember(owner = "client!up", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2825++;
        if (class431.field5843 == null) {
            return class74.field873 == null || class74.field873.field2014 == this ? super.getCodeBase() : class74.field873.field2014.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2820++;
        class225.field2768 = true;
        class191.field2306 = true;
    }

    @OriginalMember(owner = "client!up", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public abstract void method1302(int arg0);

    @OriginalMember(owner = "client!up", name = "stop", descriptor = "()V")
    public final void stop() {
        field2837++;
        if (class282.field3708 == this && !class376.field5015) {
            class53.field449 = class190.method1030(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Z")
    public final boolean method1303(boolean arg0) {
        field2839++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.equals("stellardawn.com") || var2.endsWith(".stellardawn.com")) {
            return true;
        } else if (!arg0) {
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
                this.method1306(false, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "start", descriptor = "()V")
    public final void start() {
        field2809++;
        if (class282.field3708 == this && !class376.field5015) {
            class53.field449 = 0L;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method1304(byte arg0) {
        field2824++;
        return arg0 >= -108 ? null : null;
    }

    @OriginalMember(owner = "client!up", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2819++;
    }

    @OriginalMember(owner = "client!up", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2811++;
        if (class431.field5843 == null) {
            return class74.field873 == null || class74.field873.field2014 == this ? super.getAppletContext() : class74.field873.field2014.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Z")
    public final boolean method1305(int arg0) {
        field2816++;
        if (arg0 != -1) {
            this.method1305(-105);
        }
        return class136.method757(0, "jaclib");
    }

    @OriginalMember(owner = "client!up", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2834++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1306(boolean arg0, String arg1) {
        field2812++;
        if (this.field2815) {
            return;
        }
        this.field2815 = true;
        System.out.println("error_game_" + arg1);
        try {
            class47.method249("loggedout", class74.field873.field2014, (byte) 115);
        } catch (Throwable var4) {
        }
        if (!arg0) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2813++;
    }

    @OriginalMember(owner = "client!up", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2841++;
        if (class431.field5843 == null) {
            return class74.field873 == null || class74.field873.field2014 == this ? super.getDocumentBase() : class74.field873.field2014.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "providesignlink", descriptor = "(Lpq;)V")
    public static final void providesignlink(class165 arg0) {
        class74.field873 = arg0;
        class337.field4386 = arg0;
        field2823++;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    private final void method1307(int arg0) {
        field2822++;
        if (arg0 > -52) {
            field2840 = 0.9864623F;
        }
        long var2 = class190.method1030(false);
        long var4 = class466.field6527[class31.field246];
        class466.field6527[class31.field246] = var2;
        class31.field246 = class31.field246 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class368.field4862 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class636.field9144++) > 50) {
            class636.field9144 -= 50;
            class191.field2306 = true;
            class41.field331.setSize(class185.field2239, class426.field5495);
            class41.field331.setVisible(true);
            if (class431.field5843 != null && class110.field1367 == null) {
                Insets var7 = class431.field5843.getInsets();
                class41.field331.setLocation(class157.field1906 + var7.left, var7.top - -class244.field3133);
            } else {
                class41.field331.setLocation(class157.field1906, class244.field3133);
            }
        }
        this.method1312(2);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
    public final void method1308(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2808++;
        try {
            if (class282.field3708 == null) {
                class426.field5495 = arg4;
                class202.field2423 = arg4;
                class185.field2239 = arg2;
                class7.field56 = arg2;
                class398.field5248 = arg1;
                class282.field3708 = this;
                class244.field3133 = 0;
                if (arg3 != -12435) {
                    this.windowIconified(null);
                }
                class157.field1906 = 0;
                if (class74.field873 == null) {
                    class337.field4386 = class74.field873 = new class165(this, arg0, null, 0);
                }
                class506 var6 = class74.field873.method901((byte) -88, 1, this);
                while (var6.field7031 == 0) {
                    class462.method2688(10L, (byte) 110);
                }
            } else {
                class484.field6771++;
                if (class484.field6771 >= 3) {
                    this.method1306(false, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class443.method2597(var8, null, (byte) 81);
            this.method1306(false, "crash");
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
    public abstract void method1309(int arg0);

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public final synchronized void method1310(int arg0) {
        field2833++;
        if (class41.field331 != null) {
            class41.field331.removeFocusListener(this);
            class41.field331.getParent().remove(class41.field331);
        }
        Container var2;
        if (class110.field1367 != null) {
            var2 = class110.field1367;
        } else if (class431.field5843 == null) {
            var2 = class74.field873.field2014;
        } else {
            var2 = class431.field5843;
        }
        var2.setLayout(null);
        class41.field331 = new class569(this);
        var2.add(class41.field331);
        class41.field331.setSize(class185.field2239, class426.field5495);
        class41.field331.setVisible(true);
        if (class431.field5843 == var2) {
            Insets var3 = class431.field5843.getInsets();
            class41.field331.setLocation(class157.field1906 + var3.left, class244.field3133 + var3.top);
        } else {
            class41.field331.setLocation(class157.field1906, class244.field3133);
        }
        class41.field331.addFocusListener(this);
        class41.field331.requestFocus();
        class55.field481 = true;
        class225.field2768 = true;
        class191.field2306 = true;
        class130.field1593 = false;
        if (arg0 != -129) {
            this.method1313(2, false);
        }
        class327.field4190 = class190.method1030(false);
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
    public abstract void method1311(int arg0);

    @OriginalMember(owner = "client!up", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2821++;
    }

    @OriginalMember(owner = "client!up", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2838++;
    }

    @OriginalMember(owner = "client!up", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2829++;
        if (class282.field3708 == this && !class376.field5015) {
            class53.field449 = class190.method1030(false);
            class462.method2688(5000L, (byte) 110);
            class337.field4386 = null;
            this.method1313(-3494, false);
        }
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V")
    public abstract void method1312(int arg0);

    @OriginalMember(owner = "client!up", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2836++;
    }

    @OriginalMember(owner = "client!up", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2818++;
        if (class431.field5843 == null) {
            return class74.field873 == null || class74.field873.field2014 == this ? super.getParameter(arg0) : class74.field873.field2014.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
    private final void method1313(int arg0, boolean arg1) {
        field2826++;
        synchronized (this) {
            if (class376.field5015) {
                return;
            }
            class376.field5015 = true;
        }
        if (class74.field873.field2014 != null) {
            class74.field873.field2014.destroy();
        }
        try {
            this.method1311(2);
        } catch (Exception var10) {
        }
        if (this.field2827) {
            try {
                jagmisc.quit();
            } catch (Throwable var9) {
            }
            this.field2827 = false;
        }
        class49.method260((byte) 125, true);
        class356.method2004(-114);
        if (class41.field331 != null) {
            try {
                class41.field331.removeFocusListener(this);
                class41.field331.getParent().remove(class41.field331);
            } catch (Exception var8) {
            }
        }
        if (class74.field873 != null) {
            try {
                class74.field873.method906(false);
            } catch (Exception var7) {
            }
        }
        if (arg0 != -3494) {
            return;
        }
        this.method1302(126);
        if (class431.field5843 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!up", name = "h", descriptor = "(I)V")
    private final void method1314(int arg0) {
        field2817++;
        long var2 = class190.method1030(false);
        long var4 = class205.field2449[class491.field6862];
        class205.field2449[class491.field6862] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != -32416) {
            this.windowClosed(null);
        }
        class491.field6862 = class491.field6862 + 1 & 0x1F;
        synchronized (this) {
            class55.field481 = class225.field2768;
        }
        this.method1316(arg0 ^ 0x7E9D);
    }

    @OriginalMember(owner = "client!up", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class225.field2768 = false;
        field2828++;
    }

    @OriginalMember(owner = "client!up", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2830++;
    }

    @OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
    public final void run() {
        field2835++;
        try {
            label115: {
                if (class165.field2016 != null) {
                    String var1 = class165.field2016.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class165.field2030;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1306(false, "wrongjava");
                            break label115;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class165.field2030 == null || class165.field2030.equals("1.4.2"))) {
                        this.method1306(false, "wrongjava");
                        break label115;
                    }
                }
                if (class165.field2030 != null && class165.field2030.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class165.field2030.length()) {
                        char var5 = class165.field2030.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class438.field6051 = true;
                    }
                }
                if (class74.field873.field2014 != null) {
                    Method var6 = class165.field2031;
                    if (var6 != null) {
                        try {
                            var6.invoke(class74.field873.field2014, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class441.method2589(0);
                class554.method3242(0);
                this.method1310(-129);
                this.method1309(0);
                class611.field8871 = class415.method2370(255);
                while (class53.field449 == 0L || class190.method1030(false) < class53.field449) {
                    class433.field5862 = class611.field8871.method3695(0, class6.field48);
                    for (int var7 = 0; var7 < class433.field5862; var7++) {
                        this.method1314(-32416);
                    }
                    this.method1307(-63);
                    class428.method2485(class74.field873, class41.field331, -124);
                }
            }
        } catch (Throwable var10) {
            class443.method2597(var10, this.method1304((byte) -127), (byte) 90);
            this.method1306(false, "crash");
        }
        this.method1313(-3494, true);
    }

    @OriginalMember(owner = "client!up", name = "i", descriptor = "(I)Z")
    public final boolean method1315(int arg0) {
        field2831++;
        int var2 = 18 / ((arg0 + 29) / 39);
        return class136.method757(0, "jagmisc");
    }

    @OriginalMember(owner = "client!up", name = "j", descriptor = "(I)V")
    public abstract void method1316(int arg0);

    @OriginalMember(owner = "client!up", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2810++;
        if (class282.field3708 != this || class376.field5015) {
            return;
        }
        class191.field2306 = true;
        if (class438.field6051 && class190.method1030(false) - class327.field4190 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class7.field56 && var2.height >= class202.field2423) {
                class130.field1593 = true;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2832++;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZLjava/lang/String;IIZI)V")
    public final void method1317(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5, boolean arg6, int arg7) {
        try {
            class244.field3133 = 0;
            class398.field5248 = arg4;
            class185.field2239 = arg5;
            class7.field56 = arg5;
            class157.field1906 = 0;
            class282.field3708 = this;
            class426.field5495 = arg0;
            class202.field2423 = arg0;
            class431.field5843 = new Frame();
            class431.field5843.setTitle("Jagex");
            if (arg6) {
                this.field2827 = false;
            }
            class431.field5843.setResizable(true);
            class431.field5843.addWindowListener(this);
            class431.field5843.setVisible(true);
            class431.field5843.toFront();
            Insets var9 = class431.field5843.getInsets();
            class431.field5843.setSize(class7.field56 + var9.left + var9.right, class202.field2423 + var9.top - -var9.bottom);
            class337.field4386 = class74.field873 = new class165(null, arg1, arg3, arg7);
            class506 var10 = class74.field873.method901((byte) -121, 1, this);
            while (var10.field7031 == 0) {
                class462.method2688(10L, (byte) 110);
            }
        } catch (Exception var12) {
            class443.method2597(var12, null, (byte) 94);
        }
        field2814++;
    }

    static {
        new class180("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field2842 = -1;
    }
}
