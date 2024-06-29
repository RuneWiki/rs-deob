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

@OriginalClass("client!bf")
public abstract class class185 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Z")
    private boolean field3200 = false;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Z")
    public static boolean field3181 = false;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static volatile int field3185 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lkh;")
    public static class5 field3202;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Ltg;")
    public static class75 field3201;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Z")
    public static boolean field3203;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Z")
    public static boolean field3204;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Z")
    public static boolean field3205;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public final synchronized void method1272(int arg0) {
        if (arg0 != 57) {
            this.focusGained((FocusEvent) null);
        }
        field3174++;
        if (class85.field1504 != null) {
            class85.field1504.removeFocusListener(this);
            class85.field1504.getParent().remove(class85.field1504);
        }
        Container var2;
        if (class14.field263 != null) {
            var2 = class14.field263;
        } else if (class72.field1195 == null) {
            var2 = class119.field2145.field76;
        } else {
            var2 = class72.field1195;
        }
        var2.setLayout((LayoutManager) null);
        class85.field1504 = new class249(this);
        var2.add(class85.field1504);
        class85.field1504.setSize(class121.field2227, class180.field3111);
        class85.field1504.setVisible(true);
        if (class72.field1195 == var2) {
            Insets var3 = class72.field1195.getInsets();
            class85.field1504.setLocation(var3.left + class216.field3692, class87.field1551 + var3.top);
        } else {
            class85.field1504.setLocation(class216.field3692, class87.field1551);
        }
        class85.field1504.addFocusListener(this);
        class85.field1504.requestFocus();
        class120.field2157 = true;
        class132.field2340 = true;
        class199.field3424 = true;
        class11.field230 = false;
        class244.field4230 = class164.method1183((byte) 80);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public abstract void method776(byte arg0);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)Z")
    public final boolean method1273(int arg0) {
        if (arg0 != -1) {
            this.field3200 = false;
        }
        field3188++;
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
                this.method1275("invalidhost", (byte) -43);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3194++;
        this.destroy();
    }

    @OriginalMember(owner = "client!bf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3187++;
        if (class245.field4263 != this || class254.field4441) {
            return;
        }
        class199.field3424 = true;
        if (class5.field82 != null && class5.field82.startsWith("1.5") && (class164.method1183((byte) 80) - class244.field4230) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class227.field3915 <= var2.width && class265.field4638 <= var2.height) {
                class11.field230 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3183++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public final void method1274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3169++;
        try {
            if (class245.field4263 != null) {
                class143.field2523++;
                if (class143.field2523 >= 3) {
                    this.method1275("alreadyloaded", (byte) -120);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            } else if (arg3 < -31) {
                class248.field4368 = arg4;
                class245.field4263 = this;
                class216.field3692 = 0;
                class180.field3111 = arg1;
                class265.field4638 = arg1;
                class121.field2227 = arg2;
                class227.field3915 = arg2;
                class87.field1551 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class119.field2145 == null) {
                    field3202 = class119.field2145 = new class5(false, this, arg0, (String) null, 0);
                }
                class119.field2145.method32(this, 1, (byte) -121);
            }
        } catch (Exception var8) {
            class243.method1678((String) null, var8, (byte) -122);
            this.method1275("crash", (byte) -125);
        }
    }

    @OriginalMember(owner = "client!bf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3180++;
        if (class72.field1195 == null) {
            return class119.field2145 == null || class119.field2145.field76 == this ? super.getCodeBase() : class119.field2145.field76.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3189++;
        class132.field2340 = true;
        class199.field3424 = true;
    }

    @OriginalMember(owner = "client!bf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3190++;
    }

    @OriginalMember(owner = "client!bf", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3195++;
        if (class245.field4263 == this && !class254.field4441) {
            class198.field3405 = class164.method1183((byte) 80);
            class234.method1603(5000L, 33);
            field3202 = null;
            this.method1278(false, 0);
        }
    }

    @OriginalMember(owner = "client!bf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3176++;
        if (class72.field1195 == null) {
            return class119.field2145 == null || class119.field2145.field76 == this ? super.getParameter(arg0) : class119.field2145.field76.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3196++;
    }

    @OriginalMember(owner = "client!bf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3193++;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public abstract void method769(int arg0);

    @OriginalMember(owner = "client!bf", name = "stop", descriptor = "()V")
    public final void stop() {
        field3184++;
        if (class245.field4263 == this && !class254.field4441) {
            class198.field3405 = class164.method1183((byte) 80) + 4000L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1275(String arg0, byte arg1) {
        field3198++;
        if (arg1 > -22) {
            this.init();
        }
        if (this.field3200) {
            return;
        }
        this.field3200 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public abstract void method774(boolean arg0);

    @OriginalMember(owner = "client!bf", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!bf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3172++;
    }

    @OriginalMember(owner = "client!bf", name = "start", descriptor = "()V")
    public final void start() {
        field3191++;
        if (class245.field4263 == this && !class254.field4441) {
            class198.field3405 = 0L;
        }
    }

    @OriginalMember(owner = "client!bf", name = "providesignlink", descriptor = "(Lkh;)V")
    public static final void providesignlink(class5 arg0) {
        class119.field2145 = arg0;
        field3202 = arg0;
        field3179++;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
    private final void method1276(byte arg0) {
        if (arg0 <= 73) {
            this.run();
        }
        long var2 = class164.method1183((byte) 80);
        field3175++;
        long var4 = class250.field4385[class258.field4551];
        class250.field4385[class258.field4551] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class258.field4551 = class258.field4551 + 1 & 0x1F;
        synchronized (this) {
            class120.field2157 = class132.field2340;
        }
        this.method774(true);
    }

    @OriginalMember(owner = "client!bf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3170++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    private final void method1277(int arg0) {
        field3178++;
        long var2 = class164.method1183((byte) 80);
        long var4 = class140.field2475[class34.field592];
        class140.field2475[class34.field592] = var2;
        if ((long) arg0 != var4 && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class14.field271 = ((var6 >> 1) + 32000) / var6;
        }
        class34.field592 = class34.field592 + 1 & 0x1F;
        if (class234.field4050++ > 50) {
            class199.field3424 = true;
            class234.field4050 -= 50;
            class85.field1504.setSize(class121.field2227, class180.field3111);
            class85.field1504.setVisible(true);
            if (class72.field1195 != null && class14.field263 == null) {
                Insets var7 = class72.field1195.getInsets();
                class85.field1504.setLocation(class216.field3692 + var7.left, class87.field1551 + var7.top);
            } else {
                class85.field1504.setLocation(class216.field3692, class87.field1551);
            }
        }
        this.method768(14051);
    }

    @OriginalMember(owner = "client!bf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3186++;
        if (class72.field1195 == null) {
            return class119.field2145 == null || class119.field2145.field76 == this ? super.getDocumentBase() : class119.field2145.field76.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "run", descriptor = "()V")
    public final void run() {
        field3177++;
        try {
            if (class5.field72 != null) {
                String var1 = class5.field72.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class5.field82;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1275("wrongjava", (byte) -92);
                        return;
                    }
                    class148.field2732 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class5.field82 == null || class5.field82.equals("1.4.2"))) {
                    this.method1275("wrongjava", (byte) -79);
                    return;
                }
            }
            if (class119.field2145.field76 != null) {
                Method var3 = class5.field83;
                if (var3 != null) {
                    try {
                        var3.invoke(class119.field2145.field76, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method1272(57);
            class189.field3278 = class144.method1067(2, class121.field2227, class180.field3111, class85.field1504);
            this.method776((byte) -113);
            class103.field1836 = class145.method1076(0);
            while (class198.field3405 == 0L || class198.field3405 > class164.method1183((byte) 80)) {
                class184.field3164 = class103.field1836.method12(class148.field2732, class222.field3835, (byte) -95);
                for (int var4 = 0; var4 < class184.field3164; var4++) {
                    this.method1276((byte) 123);
                }
                this.method1277(0);
                class215.method1432(true, class119.field2145, class85.field1504);
            }
        } catch (Exception var7) {
            class243.method1678((String) null, var7, (byte) -105);
            this.method1275("crash", (byte) -101);
        }
        this.method1278(true, 0);
    }

    @OriginalMember(owner = "client!bf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3197++;
        if (class72.field1195 == null) {
            return class119.field2145 == null || class119.field2145.field76 == this ? super.getAppletContext() : class119.field2145.field76.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
    private final void method1278(boolean arg0, int arg1) {
        field3199++;
        synchronized (this) {
            if (class254.field4441) {
                return;
            }
            class254.field4441 = true;
        }
        if (class119.field2145.field76 != null) {
            class119.field2145.field76.destroy();
        }
        try {
            this.method769(arg1);
        } catch (Exception var9) {
        }
        if (class85.field1504 != null) {
            try {
                class85.field1504.removeFocusListener(this);
                class85.field1504.getParent().remove(class85.field1504);
            } catch (Exception var8) {
            }
        }
        if (class119.field2145 != null) {
            try {
                class119.field2145.method31(32431);
            } catch (Exception var7) {
            }
        }
        this.method763((byte) 122);
        if (class72.field1195 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public abstract void method763(byte arg0);

    @OriginalMember(owner = "client!bf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3182++;
    }

    @OriginalMember(owner = "client!bf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class132.field2340 = false;
        field3192++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
    public final void method1279(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 2094) {
            return;
        }
        try {
            class216.field3692 = 0;
            class248.field4368 = arg4;
            class245.field4263 = this;
            class121.field2227 = arg6;
            class227.field3915 = arg6;
            class180.field3111 = arg0;
            class265.field4638 = arg0;
            class87.field1551 = 0;
            class72.field1195 = new Frame();
            class72.field1195.setTitle("Jagex");
            class72.field1195.setResizable(true);
            class72.field1195.addWindowListener(this);
            class72.field1195.setVisible(true);
            class72.field1195.toFront();
            Insets var8 = class72.field1195.getInsets();
            class72.field1195.setSize(class227.field3915 + var8.left + var8.right, class265.field4638 - (-var8.top + -var8.bottom));
            field3202 = class119.field2145 = new class5(true, (Applet) null, arg2, arg3, arg1);
            class119.field2145.method32(this, 1, (byte) -121);
        } catch (Exception var10) {
            class243.method1678((String) null, var10, (byte) -116);
        }
        field3171++;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method1280(int arg0) {
        field3202 = null;
        field3201 = null;
        if (arg0 != 0) {
            field3185 = -97;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public abstract void method768(int arg0);
}
