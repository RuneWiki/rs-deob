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

@OriginalClass("client!lb")
public abstract class class132 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
    private boolean field1871 = false;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[Lpg;")
    public static class77[] field1867 = new class77[6];

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1872 = "Attack";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Z")
    public static boolean field1891;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method892(int arg0) {
        if (arg0 != -244) {
            method897(-52, 61);
        }
        field1867 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1860++;
        class82.field1113 = false;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public abstract void method893(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method894(String arg0, byte arg1) {
        field1865++;
        if (this.field1871) {
            return;
        }
        this.field1871 = true;
        System.out.println("error_game_" + arg0);
        try {
            class259.method1722("loggedout", 3787, class200.field2784.field3715);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
            if (arg1 > -18) {
                this.run();
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1868++;
        if (class17.field179 == null) {
            return class200.field2784 == null || class200.field2784.field3715 == this ? super.getParameter(arg0) : class200.field2784.field3715.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
    public final void method895(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1887++;
        try {
            if (class187.field2574 == null) {
                class187.field2574 = this;
                if (arg2 > -27) {
                    field1867 = null;
                }
                class226.field3433 = arg0;
                class110.field1531 = 0;
                class197.field2739 = arg1;
                client.field2194 = arg1;
                class275.field4263 = arg3;
                class33.field501 = arg3;
                class233.field3521 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class200.field2784 == null) {
                    class296.field4657 = class200.field2784 = new class244(this, arg4, (String) null, 0);
                }
                class117 var7 = class200.field2784.method1638(2, this, 1);
                while (var7.field1663 == 0) {
                    class28.method182(10L, 126);
                }
            } else {
                class284.field4418++;
                if (class284.field4418 >= 3) {
                    this.method894("alreadyloaded", (byte) -29);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class221.method1426((String) null, -1, var9);
            this.method894("crash", (byte) -76);
        }
    }

    @OriginalMember(owner = "client!lb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1859++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!lb", name = "stop", descriptor = "()V")
    public final void stop() {
        field1878++;
        if (class187.field2574 == this && !class170.field2360) {
            class66.field895 = class223.method1433((byte) 91) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "providesignlink", descriptor = "(Ld;)V")
    public static final void providesignlink(class244 arg0) {
        class200.field2784 = arg0;
        class296.field4657 = arg0;
        field1879++;
    }

    @OriginalMember(owner = "client!lb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1880++;
        if (class17.field179 == null) {
            return class200.field2784 == null || class200.field2784.field3715 == this ? super.getAppletContext() : class200.field2784.field3715.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1882++;
    }

    @OriginalMember(owner = "client!lb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1875++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V")
    private final void method896(boolean arg0, boolean arg1) {
        field1886++;
        synchronized (this) {
            if (class170.field2360) {
                return;
            }
            class170.field2360 = true;
        }
        if (class200.field2784.field3715 != null) {
            class200.field2784.field3715.destroy();
        }
        try {
            this.method898(1);
        } catch (Exception var9) {
        }
        if (arg0) {
            return;
        }
        if (class156.field2177 != null) {
            try {
                class156.field2177.removeFocusListener(this);
                class156.field2177.getParent().remove(class156.field2177);
            } catch (Exception var8) {
            }
        }
        if (class200.field2784 != null) {
            try {
                class200.field2784.method1641(-113);
            } catch (Exception var7) {
            }
        }
        this.method904((byte) -118);
        if (class17.field179 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
    public static final int method897(int arg0, int arg1) {
        if (arg1 <= 118) {
            return 95;
        }
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field1861++;
        double var4 = (double) ((arg0 & 0xFFD1) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = 0.0D;
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        double var12 = 0.0D;
        if (var6 > var10) {
            var10 = var6;
        }
        double var14 = var2;
        if (var2 > var4) {
            var14 = var4;
        }
        if (var14 > var6) {
            var14 = var6;
        }
        double var16 = (var10 + var14) / 2.0D;
        if (var10 != var14) {
            if (var16 < 0.5D) {
                var12 = (var10 - var14) / (var10 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var14) / (2.0D - var10 - var14);
            }
            if (var2 == var10) {
                var8 = (var4 - var6) / (var10 - var14);
            } else if (var4 == var10) {
                var8 = (var6 - var2) / (var10 - var14) + 2.0D;
            } else if (var6 == var10) {
                var8 = (var2 - var4) / (var10 - var14) + 4.0D;
            }
        }
        double var18 = var8 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        return (var20 >> 1) + (var21 >> 2 << 10) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!lb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1889++;
        if (class17.field179 == null) {
            return class200.field2784 == null || class200.field2784.field3715 == this ? super.getDocumentBase() : class200.field2784.field3715.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1856++;
        if (class17.field179 == null) {
            return class200.field2784 == null || class200.field2784.field3715 == this ? super.getCodeBase() : class200.field2784.field3715.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!lb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1884++;
    }

    @OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1885++;
        class82.field1113 = true;
        class210.field3001 = true;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public abstract void method898(int arg0);

    @OriginalMember(owner = "client!lb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1881++;
        if (class187.field2574 != this || class170.field2360) {
            return;
        }
        class210.field3001 = true;
        if (class295.field4651 && class223.method1433((byte) -107) - class295.field4635 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class33.field501 && var2.height >= client.field2194) {
                class37.field562 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public static final void method899(int arg0) {
        field1866++;
        class274.field4241 = -3;
        class20.field284 = 0;
        class230.field3492 = -1;
        class229.field3477 = false;
        class225.field3424 = 0;
        class292.field4589 = 0;
        class103.field1441 = 1;
        if (arg0 != 6266) {
            field1883 = -125;
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
    public abstract void method900(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    private final void method901(byte arg0) {
        if (arg0 != 1) {
            field1873 = 42;
        }
        field1874++;
        long var2 = class223.method1433((byte) -125);
        long var4 = class181.field2536[class255.field3905];
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class181.field2536[class255.field3905] = var2;
        class255.field3905 = class255.field3905 + 1 & 0x1F;
        synchronized (this) {
            class169.field2343 = class82.field1113;
        }
        this.method908(true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZILjava/lang/String;IIZII)V")
    public final void method902(boolean arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1877++;
        try {
            class275.field4263 = arg6;
            class33.field501 = arg6;
            class110.field1531 = 0;
            class233.field3521 = 0;
            class197.field2739 = arg1;
            client.field2194 = arg1;
            class226.field3433 = arg4;
            class187.field2574 = this;
            class17.field179 = new Frame();
            class17.field179.setTitle("Jagex");
            class17.field179.setResizable(true);
            class17.field179.addWindowListener(this);
            class17.field179.setVisible(arg5);
            class17.field179.toFront();
            Insets var9 = class17.field179.getInsets();
            class17.field179.setSize(class33.field501 + var9.right + var9.left, client.field2194 + var9.bottom + var9.top);
            class296.field4657 = class200.field2784 = new class244((Applet) null, arg3, arg2, arg7);
            class117 var10 = class200.field2784.method1638(2, this, 1);
            while (var10.field1663 == 0) {
                class28.method182(10L, 126);
            }
        } catch (Exception var12) {
            class221.method1426((String) null, -1, var12);
        }
    }

    @OriginalMember(owner = "client!lb", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1858++;
        if (class187.field2574 == this && !class170.field2360) {
            class66.field895 = class223.method1433((byte) -82);
            class28.method182(5000L, 121);
            class296.field4657 = null;
            this.method896(false, false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    private final void method903(int arg0) {
        long var2 = class223.method1433((byte) -84);
        field1869++;
        long var4 = class39.field575[class277.field4296];
        class39.field575[class277.field4296] = var2;
        if (arg0 != -180) {
            return;
        }
        class277.field4296 = class277.field4296 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class135.field1894 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class17.field174++) > 50) {
            class17.field174 -= 50;
            class210.field3001 = true;
            class156.field2177.setSize(class275.field4263, class197.field2739);
            class156.field2177.setVisible(true);
            if (class17.field179 != null && class11.field110 == null) {
                Insets var7 = class17.field179.getInsets();
                class156.field2177.setLocation(class233.field3521 + var7.left, var7.top - -class110.field1531);
            } else {
                class156.field2177.setLocation(class233.field3521, class110.field1531);
            }
        }
        this.method893(104);
    }

    @OriginalMember(owner = "client!lb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1890++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public abstract void method904(byte arg0);

    @OriginalMember(owner = "client!lb", name = "start", descriptor = "()V")
    public final void start() {
        field1876++;
        if (class187.field2574 == this && !class170.field2360) {
            class66.field895 = 0L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Lgj;")
    public static final class240 method905(boolean arg0, int arg1) {
        field1870++;
        class240 var2 = (class240) class221.field3319.method540((byte) -120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (!arg0) {
            method892(84);
        }
        byte[] var3 = class286.field4517.method1576(-85, class251.method1682(arg1, 15), class290.method1949(127, arg1));
        class240 var4 = new class240();
        var4.field3676 = arg1;
        if (var3 != null) {
            var4.method1604((byte) 22, new class224(var3));
        }
        var4.method1603(0);
        class221.field3319.method543(var4, (long) arg1, 858993459);
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1862++;
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
    public final synchronized void method906(int arg0) {
        field1855++;
        if (class156.field2177 != null) {
            class156.field2177.removeFocusListener(this);
            class156.field2177.getParent().remove(class156.field2177);
        }
        Container var2;
        if (class11.field110 != null) {
            var2 = class11.field110;
        } else if (class17.field179 == null) {
            var2 = class200.field2784.field3715;
        } else {
            var2 = class17.field179;
        }
        var2.setLayout((LayoutManager) null);
        class156.field2177 = new class15(this);
        var2.add(class156.field2177);
        class156.field2177.setSize(class275.field4263, class197.field2739);
        int var3 = 38 / ((-arg0 - 71) / 36);
        class156.field2177.setVisible(true);
        if (class17.field179 == var2) {
            Insets var4 = class17.field179.getInsets();
            class156.field2177.setLocation(class233.field3521 + var4.left, class110.field1531 + var4.top);
        } else {
            class156.field2177.setLocation(class233.field3521, class110.field1531);
        }
        class156.field2177.addFocusListener(this);
        class156.field2177.requestFocus();
        class169.field2343 = true;
        class82.field1113 = true;
        class210.field3001 = true;
        class37.field562 = false;
        class295.field4635 = class223.method1433((byte) 28);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Z")
    public final boolean method907(boolean arg0) {
        field1864++;
        if (arg0) {
            this.method902(true, 122, (String) null, -117, -45, true, 114, -110);
        }
        String var2 = this.getDocumentBase().getHost().toLowerCase();
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
            } else {
                this.method894("invalidhost", (byte) -92);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1857++;
    }

    @OriginalMember(owner = "client!lb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1863++;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public abstract void method908(boolean arg0);

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
    public final void run() {
        field1888++;
        try {
            if (class244.field3719 != null) {
                String var1 = class244.field3719.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class244.field3727;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method894("wrongjava", (byte) -57);
                        return;
                    }
                    class105.field1462 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class244.field3727 == null || class244.field3727.equals("1.4.2"))) {
                    this.method894("wrongjava", (byte) -50);
                    return;
                }
            }
            if (class244.field3727 != null && class244.field3727.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class244.field3727.length()) {
                    char var5 = class244.field3727.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class295.field4651 = true;
                }
            }
            if (class200.field2784.field3715 != null) {
                Method var6 = class244.field3734;
                if (var6 != null) {
                    try {
                        var6.invoke(class200.field2784.field3715, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class197.method1254((byte) 12);
            this.method906(-20);
            class207.field2889 = class10.method66(class156.field2177, 125, class275.field4263, class197.field2739);
            this.method900(256);
            class137.field1917 = class237.method1588(-105);
            while (class66.field895 == 0L || class223.method1433((byte) 101) < class66.field895) {
                class1.field6 = class137.field1917.method77(class105.field1462, (byte) 78, class193.field2671);
                for (int var7 = 0; var7 < class1.field6; var7++) {
                    this.method901((byte) 1);
                }
                this.method903(-180);
                class186.method1194(class156.field2177, (byte) 13, class200.field2784);
            }
        } catch (Exception var10) {
            class221.method1426((String) null, -1, var10);
            this.method894("crash", (byte) -103);
        }
        this.method896(false, true);
    }
}
