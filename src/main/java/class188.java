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

@OriginalClass("client!ag")
public abstract class class188 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
    private boolean field2859 = false;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
    public static int[] field2873 = new int[4096];

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    public static int[] field2875 = new int[1000];

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "[I")
    public static int[] field2886 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Z")
    public static boolean field2871 = false;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field2889 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Z")
    public static boolean field2891;

    @OriginalMember(owner = "client!ag", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2853++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public abstract void method970(byte arg0);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    private final void method1170(int arg0) {
        field2866++;
        long var2 = class263.method1754(127);
        long var4 = class22.field268[class10.field140];
        if (arg0 != -1) {
            return;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class22.field268[class10.field140] = var2;
        class10.field140 = class10.field140 + 1 & 0x1F;
        synchronized (this) {
            class221.field3328 = class197.field3001;
        }
        this.method958(false);
    }

    @OriginalMember(owner = "client!ag", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2864++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1171(String arg0, byte arg1) {
        field2890++;
        if (this.field2859) {
            return;
        }
        this.field2859 = true;
        if (arg1 != 68) {
            return;
        }
        System.out.println("error_game_" + arg0);
        try {
            class73.method498(class209.field3147.field150, "loggedout", (byte) 126);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2874++;
        if (class210.field3152 == null) {
            return class209.field3147 == null || class209.field3147.field150 == this ? super.getCodeBase() : class209.field3147.field150.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2863++;
        if (class210.field3152 == null) {
            return class209.field3147 == null || class209.field3147.field150 == this ? super.getParameter(arg0) : class209.field3147.field150.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field2862++;
        class197.field3001 = false;
    }

    @OriginalMember(owner = "client!ag", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2877++;
        if (client.field2385 != this || class122.field1857) {
            return;
        }
        class211.field3174 = true;
        if (class146.field2136 && (class263.method1754(-124) - class62.field975) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class107.field1676 && var2.height >= class26.field321) {
                class287.field4302 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public abstract void method974(int arg0);

    @OriginalMember(owner = "client!ag", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2870++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
    private final void method1172(int arg0, boolean arg1) {
        field2865++;
        synchronized (this) {
            if (class122.field1857) {
                return;
            }
            class122.field1857 = true;
        }
        if (class209.field3147.field150 != null) {
            class209.field3147.field150.destroy();
        }
        try {
            this.method974(600);
        } catch (Exception var9) {
        }
        if (class47.field762 != null) {
            try {
                class47.field762.removeFocusListener(this);
                class47.field762.getParent().remove(class47.field762);
            } catch (Exception var8) {
            }
        }
        if (class209.field3147 != null) {
            try {
                class209.field3147.method60((byte) -126);
            } catch (Exception var7) {
            }
        }
        this.method969(false);
        if (class210.field3152 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (arg0 == 0) {
            System.out.println("Shutdown complete - clean:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        if (arg0 != -2) {
            field2886 = null;
        }
        field2857++;
        for (class192 var1 = (class192) class228.field3432.method983(arg0 + 9); var1 != null; var1 = (class192) class228.field3432.method985((byte) 127)) {
            if (var1.field2946 > 0) {
                var1.field2946--;
            }
            if (var1.field2946 != 0) {
                if (var1.field2943 > 0) {
                    var1.field2943--;
                }
                if (var1.field2943 == 0 && var1.field2948 >= 1 && var1.field2944 >= 1 && var1.field2948 <= 102 && var1.field2944 <= 102 && (var1.field2941 < 0 || class123.method782(72, var1.field2942, var1.field2941))) {
                    class175.method1088(var1.field2948, var1.field2944, var1.field2955, var1.field2942, var1.field2950, var1.field2941, 1, var1.field2947);
                    var1.field2943 = -1;
                    if (var1.field2951 == var1.field2941 && var1.field2951 == -1) {
                        var1.method538(88);
                    } else if (var1.field2951 == var1.field2941 && var1.field2957 == var1.field2947 && var1.field2954 == var1.field2942) {
                        var1.method538(arg0 + 105);
                    }
                }
            } else if (var1.field2951 < 0 || class123.method782(73, var1.field2954, var1.field2951)) {
                class175.method1088(var1.field2948, var1.field2944, var1.field2955, var1.field2954, var1.field2950, var1.field2951, 1, var1.field2957);
                var1.method538(78);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2854++;
        if (client.field2385 == this && !class122.field1857) {
            class157.field2364 = class263.method1754(127);
            class250.method1643(1, 5000L);
            class123.field1863 = null;
            this.method1172(0, false);
        }
    }

    @OriginalMember(owner = "client!ag", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2855++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public abstract void method969(boolean arg0);

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z")
    public final boolean method1174(byte arg0) {
        field2867++;
        if (arg0 < 121) {
            this.update((Graphics) null);
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
                this.method1171("invalidhost", (byte) 68);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field2882++;
    }

    @OriginalMember(owner = "client!ag", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2887++;
        if (class210.field3152 == null) {
            return class209.field3147 == null || class209.field3147.field150 == this ? super.getAppletContext() : class209.field3147.field150.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
    public abstract void method959(byte arg0);

    @OriginalMember(owner = "client!ag", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2875 = null;
        if (arg0 == 10) {
            field2873 = null;
            field2886 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2885++;
        this.destroy();
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    private final void method1176(int arg0) {
        field2880++;
        long var2 = class263.method1754(126);
        long var4 = class297.field4697[class296.field4685];
        class297.field4697[class296.field4685] = var2;
        class296.field4685 = class296.field4685 + 1 & 0x1F;
        if (arg0 < 97) {
            return;
        }
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class232.field3505 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class261.field3961++) > 50) {
            class211.field3174 = true;
            class261.field3961 -= 50;
            class47.field762.setSize(class77.field1245, class180.field2748);
            class47.field762.setVisible(true);
            if (class210.field3152 != null && class244.field3657 == null) {
                Insets var7 = class210.field3152.getInsets();
                class47.field762.setLocation(class272.field4090 + var7.left, class214.field3191 + var7.top);
            } else {
                class47.field762.setLocation(class272.field4090, class214.field3191);
            }
        }
        this.method959((byte) 119);
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public final synchronized void method1177(int arg0) {
        field2869++;
        if (class47.field762 != null) {
            class47.field762.removeFocusListener(this);
            class47.field762.getParent().remove(class47.field762);
        }
        Container var2;
        if (class244.field3657 != null) {
            var2 = class244.field3657;
        } else if (class210.field3152 == null) {
            var2 = class209.field3147.field150;
        } else {
            var2 = class210.field3152;
        }
        var2.setLayout((LayoutManager) null);
        class47.field762 = new class37(this);
        var2.add(class47.field762);
        class47.field762.setSize(class77.field1245, class180.field2748);
        class47.field762.setVisible(true);
        if (class210.field3152 == var2) {
            Insets var3 = class210.field3152.getInsets();
            class47.field762.setLocation(class272.field4090 + var3.left, class214.field3191 + var3.top);
        } else {
            class47.field762.setLocation(class272.field4090, class214.field3191);
        }
        class47.field762.addFocusListener(this);
        class47.field762.requestFocus();
        class221.field3328 = true;
        class197.field3001 = true;
        class211.field3174 = true;
        class287.field4302 = false;
        if (arg0 == -7518) {
            class62.field975 = class263.method1754(23);
        }
    }

    @OriginalMember(owner = "client!ag", name = "run", descriptor = "()V")
    public final void run() {
        field2868++;
        try {
            if (class12.field157 != null) {
                String var1 = class12.field157.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class12.field151;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1171("wrongjava", (byte) 68);
                        return;
                    }
                    class110.field1706 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class12.field151 == null || class12.field151.equals("1.4.2"))) {
                    this.method1171("wrongjava", (byte) 68);
                    return;
                }
            }
            if (class12.field151 != null && class12.field151.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class12.field151.length() > var3) {
                    char var5 = class12.field151.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
                if (var4 >= 5) {
                    class146.field2136 = true;
                }
            }
            if (class209.field3147.field150 != null) {
                Method var6 = class12.field167;
                if (var6 != null) {
                    try {
                        var6.invoke(class209.field3147.field150, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class122.method776((byte) -93);
            this.method1177(-7518);
            class273.field4109 = class274.method1818(1563430796, class77.field1245, class180.field2748, class47.field762);
            this.method970((byte) 127);
            class282.field4212 = class142.method871(-127);
            while (class157.field2364 == 0L || class263.method1754(-41) < class157.field2364) {
                class235.field3547 = class282.field4212.method501(class110.field1706, class246.field3680, 25912);
                for (int var7 = 0; var7 < class235.field3547; var7++) {
                    this.method1170(-1);
                }
                this.method1176(125);
                class122.method775(61, class47.field762, class209.field3147);
            }
        } catch (Exception var10) {
            class275.method1822((String) null, (byte) -103, var10);
            this.method1171("crash", (byte) 68);
        }
        this.method1172(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2879++;
        try {
            if (client.field2385 == null) {
                class214.field3191 = 0;
                class180.field2748 = arg2;
                class26.field321 = arg2;
                if (arg0 != -2) {
                    this.windowOpened((WindowEvent) null);
                }
                class272.field4090 = 0;
                class295.field4679 = arg1;
                class77.field1245 = arg3;
                class107.field1676 = arg3;
                client.field2385 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class209.field3147 == null) {
                    class123.field1863 = class209.field3147 = new class12(this, arg4, (String) null, 0);
                }
                class78 var7 = class209.field3147.method71(2, 1, this);
                while (var7.field1249 == 0) {
                    class250.method1643(1, 10L);
                }
            } else {
                class229.field3458++;
                if (class229.field3458 >= 3) {
                    this.method1171("alreadyloaded", (byte) 68);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class275.method1822((String) null, (byte) -110, var9);
            this.method1171("crash", (byte) 68);
        }
    }

    @OriginalMember(owner = "client!ag", name = "stop", descriptor = "()V")
    public final void stop() {
        field2858++;
        if (client.field2385 == this && !class122.field1857) {
            class157.field2364 = class263.method1754(2) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ag", name = "providesignlink", descriptor = "(Lfg;)V")
    public static final void providesignlink(class12 arg0) {
        field2888++;
        class209.field3147 = arg0;
        class123.field1863 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2881++;
    }

    @OriginalMember(owner = "client!ag", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2876++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIILjava/lang/String;IZ)V")
    public final void method1179(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7) {
        try {
            class77.field1245 = arg4;
            class107.field1676 = arg4;
            class272.field4090 = 0;
            class180.field2748 = arg0;
            class26.field321 = arg0;
            class214.field3191 = 0;
            class295.field4679 = arg6;
            client.field2385 = this;
            class210.field3152 = new Frame();
            class210.field3152.setTitle("Jagex");
            class210.field3152.setResizable(true);
            class210.field3152.addWindowListener(this);
            class210.field3152.setVisible(true);
            class210.field3152.toFront();
            if (arg2 <= 60) {
                return;
            }
            Insets var9 = class210.field3152.getInsets();
            class210.field3152.setSize(var9.right + var9.left + class107.field1676, class26.field321 - -var9.top + var9.bottom);
            class123.field1863 = class209.field3147 = new class12((Applet) null, arg3, arg5, arg1);
            class78 var10 = class209.field3147.method71(2, 1, this);
            while (var10.field1249 == 0) {
                class250.method1643(1, 10L);
            }
        } catch (Exception var12) {
            class275.method1822((String) null, (byte) -107, var12);
        }
        field2860++;
    }

    @OriginalMember(owner = "client!ag", name = "start", descriptor = "()V")
    public final void start() {
        field2861++;
        if (client.field2385 == this && !class122.field1857) {
            class157.field2364 = 0L;
        }
    }

    @OriginalMember(owner = "client!ag", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2884++;
        class197.field3001 = true;
        class211.field3174 = true;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)V")
    public abstract void method958(boolean arg0);

    @OriginalMember(owner = "client!ag", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2856++;
        if (class210.field3152 == null) {
            return class209.field3147 == null || class209.field3147.field150 == this ? super.getDocumentBase() : class209.field3147.field150.getDocumentBase();
        } else {
            return null;
        }
    }
}
