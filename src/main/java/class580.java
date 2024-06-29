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

@OriginalClass("client!fi")
public abstract class class580 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Z")
    private boolean field8196 = false;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Z")
    private boolean field8220 = false;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Ljo;")
    public static class351 field8219 = new class351(65, 0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "I")
    public static int field8222;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Z")
    public static boolean field8224;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Z")
    public static boolean field8228;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "Z")
    public static boolean field8229;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Z")
    public static boolean field8233;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "Z")
    public static boolean field8234;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "Z")
    public static boolean field8235;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
    public static boolean field8236;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "Z")
    public static boolean field8237;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "Z")
    public static boolean field8240;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "Z")
    public static boolean field8241;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "Z")
    public static boolean field8242;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public abstract void method2042(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBII)I")
    public static final int method3366(int arg0, byte arg1, int arg2, int arg3) {
        field8216++;
        if (arg1 != -95) {
            return 63;
        } else if (class622.field8777 == null) {
            return 0;
        } else {
            int var4 = arg3 >> 9;
            int var5 = arg2 >> 9;
            if (var4 < 0 || var5 < 0 || (class109.field1314 - 1) < var4 || (class760.field10479 - 1) < var5) {
                return 0;
            }
            int var6 = arg0;
            if (arg0 < 3 && (class617.field8700[1][var4][var5] & 0x2) != 0) {
                var6 = arg0 + 1;
            }
            return class622.field8777[var6].method1977((byte) -104, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field8188++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    private final void method3367(int arg0) {
        field8200++;
        long var2 = class109.method731(21);
        long var4 = class364.field5266[class526.field7493];
        class364.field5266[class526.field7493] = var2;
        class526.field7493 = class526.field7493 + 1 & 0x1F;
        if (arg0 != -2615) {
            return;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        synchronized (this) {
            class130.field1709 = class405.field5711;
        }
        this.method2050(73);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Ljava/lang/String;")
    public String method2065(byte arg0) {
        if (arg0 == -29) {
            field8190++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field8211++;
        if (class119.field1498 != this || class399.field5662) {
            return;
        }
        class241.field3464 = true;
        if (class165.field2418 && class109.method731(33) - class373.field5369 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class133.field1735 && var2.height >= class711.field10013) {
                class206.field3026 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method3368(int arg0) {
        field8187++;
        return arg0 == 15324 ? class291.method1971("jaclib", 0) : false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;IIZIIII)V")
    public final void method3369(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class457.field6547 = 0;
            class269.field3782 = null;
            class273.field3812 = 0;
            class638.field8980 = arg5;
            class133.field1735 = arg5;
            class512.field7325 = arg2;
            class711.field10013 = arg2;
            class119.field1498 = this;
            if (arg6 > -80) {
                field8207 = 9;
            }
            class717.field10085 = arg1;
            class463.field6617 = new Frame();
            class463.field6617.setTitle("Jagex");
            class463.field6617.setResizable(true);
            class463.field6617.addWindowListener(this);
            class463.field6617.setVisible(true);
            class463.field6617.toFront();
            Insets var9 = class463.field6617.getInsets();
            class463.field6617.setSize(var9.left + var9.right + class133.field1735, class711.field10013 - (-var9.top - var9.bottom));
            class617.field8708 = class27.field395 = new class590(arg7, arg0, arg4, true);
            class370 var10 = class27.field395.method3426(118, this, 1);
            while (var10.field5314 == 0) {
                class117.method820(false, 10L);
            }
        } catch (Exception var12) {
            class329.method2129(null, false, var12);
        }
        field8210++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    public abstract void method2044(byte arg0);

    @OriginalMember(owner = "client!fi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
    public final boolean method3370(int arg0) {
        field8198++;
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
                this.method3372(arg0 + 30696, "invalidhost");
                return arg0 != -30697;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field8215++;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    public abstract void method2062(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public static void method3371(boolean arg0) {
        if (!arg0) {
            field8207 = 75;
        }
        field8219 = null;
    }

    @OriginalMember(owner = "client!fi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field8214++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3372(int arg0, String arg1) {
        field8205++;
        if (this.field8196) {
            return;
        }
        this.field8196 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != -1) {
            this.windowDeiconified(null);
        }
        try {
            class150.method1035(arg0 - 19252, "loggedout", class535.field7544);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field8195++;
        if (class119.field1498 == this && !class399.field5662) {
            class275.field3826 = class109.method731(105);
            class117.method820(false, 5000L);
            class617.field8708 = null;
            this.method3374(1000, false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field8218++;
        if (class463.field6617 == null) {
            return class535.field7544 == null || class535.field7544 == this ? super.getCodeBase() : class535.field7544.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public abstract void method2050(int arg0);

    @OriginalMember(owner = "client!fi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field8199++;
    }

    @OriginalMember(owner = "client!fi", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
    public static final void provideLoaderApplet(Applet arg0) {
        class535.field7544 = arg0;
        field8191++;
    }

    @OriginalMember(owner = "client!fi", name = "start", descriptor = "()V")
    public final void start() {
        field8217++;
        if (class119.field1498 == this && !class399.field5662) {
            class275.field3826 = 0L;
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field8192++;
    }

    @OriginalMember(owner = "client!fi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class405.field5711 = false;
        field8223++;
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
    public abstract void method2046(int arg0);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
    private final void method3373(int arg0) {
        field8202++;
        long var2 = class109.method731(37);
        if (arg0 != -2018) {
            return;
        }
        long var4 = class581.field8249[class631.field8918];
        class581.field8249[class631.field8918] = var2;
        class631.field8918 = class631.field8918 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class100.field1260 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class772.field10657++) > 50) {
            class241.field3464 = true;
            class772.field10657 -= 50;
            class359.field5219.setSize(class638.field8980, class512.field7325);
            class359.field5219.setVisible(true);
            if (class463.field6617 != null && class677.field9637 == null) {
                Insets var7 = class463.field6617.getInsets();
                class359.field5219.setLocation(var7.left + class457.field6547, class273.field3812 + var7.top);
            } else {
                class359.field5219.setLocation(class457.field6547, class273.field3812);
            }
        }
        this.method2044((byte) 108);
    }

    @OriginalMember(owner = "client!fi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field8208++;
    }

    @OriginalMember(owner = "client!fi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field8189++;
    }

    @OriginalMember(owner = "client!fi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field8213++;
        if (class463.field6617 == null) {
            return class535.field7544 == null || class535.field7544 == this ? super.getDocumentBase() : class535.field7544.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field8209++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
    private final void method3374(int arg0, boolean arg1) {
        field8212++;
        synchronized (this) {
            if (arg0 != 1000) {
                field8219 = null;
            }
            if (class399.field5662) {
                return;
            }
            class399.field5662 = true;
        }
        System.out.println("Shutdown start - clean:" + arg1);
        if (class535.field7544 != null) {
            class535.field7544.destroy();
        }
        try {
            this.method2046(arg0 ^ 0x505);
        } catch (Exception var9) {
        }
        if (this.field8220) {
            try {
                jagmisc.quit();
            } catch (Throwable var8) {
            }
            this.field8220 = false;
        }
        class349.method2205((byte) -121, true);
        class504.method2939(arg0 ^ 0x383);
        if (class359.field5219 != null) {
            try {
                class359.field5219.removeFocusListener(this);
                class359.field5219.getParent().remove(class359.field5219);
            } catch (Exception var7) {
            }
        }
        if (class27.field395 != null) {
            try {
                class27.field395.method3423(arg0 - 878);
            } catch (Exception var6) {
            }
        }
        this.method2062(arg0 - 918);
        if (class463.field6617 != null) {
            class463.field6617.setVisible(false);
            class463.field6617.dispose();
            class463.field6617 = null;
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!fi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field8221++;
        if (class463.field6617 == null) {
            return class535.field7544 == null || class535.field7544 == this ? super.getParameter(arg0) : class535.field7544.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
    public final boolean method3375(byte arg0) {
        field8203++;
        return arg0 == 119 ? class291.method1971("jagtheora", 0) : true;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
    public final void method3376(String arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field8204++;
        try {
            if (class119.field1498 == null) {
                class269.field3782 = class535.field7544;
                if (arg2 > 72) {
                    class717.field10085 = arg5;
                    class512.field7325 = arg3;
                    class711.field10013 = arg3;
                    class119.field1498 = this;
                    class638.field8980 = arg4;
                    class133.field1735 = arg4;
                    class273.field3812 = 0;
                    class457.field6547 = 0;
                    class617.field8708 = class27.field395 = new class590(arg1, arg0, arg6, class535.field7544 != null);
                    class370 var8 = class27.field395.method3426(90, this, 1);
                    while (var8.field5314 == 0) {
                        class117.method820(false, 10L);
                    }
                }
            } else {
                class339.field5039++;
                if (class339.field5039 >= 3) {
                    this.method3372(-1, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var10) {
            class329.method2129(null, false, var10);
            this.method3372(-1, "crash");
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
    public final boolean method3377(byte arg0) {
        field8206++;
        if (arg0 < 115) {
            this.field8220 = false;
        }
        return class291.method1971("jagmisc", 0);
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
    public synchronized void method2052(int arg0) {
        if (class359.field5219 != null) {
            class359.field5219.removeFocusListener(this);
            class359.field5219.getParent().setBackground(Color.black);
            class359.field5219.getParent().remove(class359.field5219);
        }
        field8222++;
        Container var2;
        if (class677.field9637 != null) {
            var2 = class677.field9637;
        } else if (class463.field6617 != null) {
            var2 = class463.field6617;
        } else if (class535.field7544 == null) {
            var2 = class119.field1498;
        } else {
            var2 = class535.field7544;
        }
        var2.setLayout(null);
        class359.field5219 = new class477(this);
        var2.add(class359.field5219);
        if (arg0 != 6532) {
            return;
        }
        class359.field5219.setSize(class638.field8980, class512.field7325);
        class359.field5219.setVisible(true);
        if (class463.field6617 == var2) {
            Insets var3 = class463.field6617.getInsets();
            class359.field5219.setLocation(class457.field6547 + var3.left, class273.field3812 + var3.top);
        } else {
            class359.field5219.setLocation(class457.field6547, class273.field3812);
        }
        class359.field5219.addFocusListener(this);
        class359.field5219.requestFocus();
        class130.field1709 = true;
        class405.field5711 = true;
        class241.field3464 = true;
        class206.field3026 = false;
        class373.field5369 = class109.method731(83);
    }

    @OriginalMember(owner = "client!fi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field8193++;
        class405.field5711 = true;
        class241.field3464 = true;
    }

    @OriginalMember(owner = "client!fi", name = "run", descriptor = "()V")
    public final void run() {
        field8194++;
        try {
            if (class590.field8336 != null) {
                String var1 = class590.field8336.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class590.field8326;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method3372(-1, "wrongjava");
                        return;
                    }
                } else if (var1.indexOf("ibm") != -1 && (class590.field8326 == null || class590.field8326.equals("1.4.2"))) {
                    this.method3372(-1, "wrongjava");
                    return;
                }
            }
            if (class590.field8326 != null && class590.field8326.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class590.field8326.length()) {
                    char var5 = class590.field8326.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class165.field2418 = true;
                }
            }
            Applet var6 = class119.field1498;
            if (class535.field7544 != null) {
                var6 = class535.field7544;
            }
            Method var7 = class590.field8349;
            if (var7 != null) {
                try {
                    var7.invoke(var6, Boolean.TRUE);
                } catch (Throwable var18) {
                }
            }
            class200.method1441((byte) 103);
            class188.method1394(82);
            this.method2052(6532);
            this.method2042(64);
            class31.field424 = class361.method2266(true);
            while (class275.field3826 == 0L || class275.field3826 > class109.method731(58)) {
                class684.field9710 = class31.field424.method1022(class345.field5083, (byte) 44);
                for (int var8 = 0; var8 < class684.field9710; var8++) {
                    this.method3367(-2615);
                }
                this.method3373(-2018);
                class656.method3758(class27.field395, 1, class359.field5219);
            }
        } catch (ThreadDeath var19) {
            throw var19;
        } catch (Throwable var20) {
            class329.method2129(this.method2065((byte) -29), false, var20);
            this.method3372(-1, "crash");
        } finally {
            Object var13 = null;
            this.method3374(1000, true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "stop", descriptor = "()V")
    public final void stop() {
        field8197++;
        if (class119.field1498 == this && !class399.field5662) {
            class275.field3826 = class109.method731(46) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field8201++;
        if (class463.field6617 == null) {
            return class535.field7544 == null || class535.field7544 == this ? super.getAppletContext() : class535.field7544.getAppletContext();
        } else {
            return null;
        }
    }
}
