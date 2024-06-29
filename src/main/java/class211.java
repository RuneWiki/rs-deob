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

@OriginalClass("client!m")
public abstract class class211 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
    private boolean field3184 = false;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field3157 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lhl;")
    public static class139 field3148 = new class139(64);

    @OriginalMember(owner = "client!m", name = "L", descriptor = "[I")
    public static int[] field3183 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Z")
    public static boolean field3182 = false;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field3185 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lpk;")
    public static class237 field3161;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "Lpk;")
    public static class237 field3181;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Ljk;")
    public static class297 field3177;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "Z")
    public static boolean field3186;

    @OriginalMember(owner = "client!m", name = "stop", descriptor = "()V")
    public final void stop() {
        field3156++;
        if (class112.field1717 == this && !class190.field2881) {
            class285.field4373 = class257.method1736(14361) + 4000L;
        }
    }

    @OriginalMember(owner = "client!m", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3146++;
        if (class167.field2459 == null) {
            return class217.field3338 == null || class217.field3338.field505 == this ? super.getAppletContext() : class217.field3338.field505.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3180++;
        if (class112.field1717 != this || class190.field2881) {
            return;
        }
        class100.field1456 = true;
        if (class286.field4388 && (class257.method1736(14361) - class228.field3554) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class145.field2099 && var2.height >= class23.field385) {
                class197.field2980 = true;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public abstract void method326(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1387(String arg0, int arg1) {
        field3152++;
        int var3 = 86 / ((arg1 + 47) / 58);
        if (this.field3184) {
            return;
        }
        this.field3184 = true;
        System.out.println("error_game_" + arg0);
        try {
            class238.method1634("loggedout", (byte) -109, class217.field3338.field505);
        } catch (Throwable var5) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!m", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3151++;
    }

    @OriginalMember(owner = "client!m", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3179++;
        this.destroy();
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public abstract void method324(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIBIZ)V")
    public final void method1388(String arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        try {
            class292.field4429 = arg2;
            class199.field2989 = 0;
            class85.field1311 = arg3;
            class23.field385 = arg3;
            class126.field1854 = arg6;
            class145.field2099 = arg6;
            class208.field3118 = 0;
            class112.field1717 = this;
            class167.field2459 = new Frame();
            class167.field2459.setTitle("Jagex");
            class167.field2459.setResizable(true);
            class167.field2459.addWindowListener(this);
            class167.field2459.setVisible(true);
            class167.field2459.toFront();
            Insets var9 = class167.field2459.getInsets();
            class167.field2459.setSize(var9.right + var9.left + class145.field2099, class23.field385 + var9.top + var9.bottom);
            class166.field2452 = class217.field3338 = new class26((Applet) null, arg1, arg0, arg4);
            class40 var10 = class217.field3338.method181(this, 1, (byte) -107);
            while (var10.field713 == 0) {
                client.method323(10L, -127);
            }
            if (arg5 != 49) {
                field3182 = false;
            }
        } catch (Exception var12) {
            class121.method860((byte) 102, (String) null, var12);
        }
        field3160++;
    }

    @OriginalMember(owner = "client!m", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3147++;
        if (class167.field2459 == null) {
            return class217.field3338 == null || class217.field3338.field505 == this ? super.getDocumentBase() : class217.field3338.field505.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZB)V")
    private final void method1389(boolean arg0, byte arg1) {
        field3172++;
        if (arg1 != -54) {
            field3177 = null;
        }
        synchronized (this) {
            if (class190.field2881) {
                return;
            }
            class190.field2881 = true;
        }
        if (class217.field3338.field505 != null) {
            class217.field3338.field505.destroy();
        }
        try {
            this.method332(97);
        } catch (Exception var9) {
        }
        if (class297.field4569 != null) {
            try {
                class297.field4569.removeFocusListener(this);
                class297.field4569.getParent().remove(class297.field4569);
            } catch (Exception var8) {
            }
        }
        if (class217.field3338 != null) {
            try {
                class217.field3338.method179(36);
            } catch (Exception var7) {
            }
        }
        this.method324(arg1 ^ 0xFFFFFFCA);
        if (class167.field2459 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!m", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3176++;
        if (class112.field1717 == this && !class190.field2881) {
            class285.field4373 = class257.method1736(14361);
            client.method323(5000L, -114);
            class166.field2452 = null;
            this.method1389(false, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZI)V")
    public final void method1390(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3178++;
        try {
            if (class112.field1717 == null) {
                class292.field4429 = arg4;
                class208.field3118 = 0;
                class85.field1311 = arg0;
                class23.field385 = arg0;
                class126.field1854 = arg2;
                class145.field2099 = arg2;
                if (!arg3) {
                    this.windowClosed((WindowEvent) null);
                }
                class199.field2989 = 0;
                class112.field1717 = this;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class217.field3338 == null) {
                    class166.field2452 = class217.field3338 = new class26(this, arg1, (String) null, 0);
                }
                class40 var7 = class217.field3338.method181(this, 1, (byte) 50);
                while (var7.field713 == 0) {
                    client.method323(10L, -128);
                }
            } else {
                class89.field1348++;
                if (class89.field1348 >= 3) {
                    this.method1387("alreadyloaded", 58);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class121.method860((byte) 55, (String) null, var9);
            this.method1387("crash", -107);
        }
    }

    @OriginalMember(owner = "client!m", name = "providesignlink", descriptor = "(Lgf;)V")
    public static final void providesignlink(class26 arg0) {
        class217.field3338 = arg0;
        class166.field2452 = arg0;
        field3170++;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    private final void method1391(int arg0) {
        field3155++;
        long var2 = class257.method1736(arg0 ^ 0x7EA6);
        long var4 = class61.field1028[class278.field4293];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class61.field1028[class278.field4293] = var2;
        class278.field4293 = class278.field4293 + 1 & 0x1F;
        synchronized (this) {
            class103.field1512 = class89.field1343;
        }
        if (arg0 == 18111) {
            this.method326(arg0 - 18207);
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field3177 = null;
        if (arg0 == -32415) {
            field3183 = null;
            field3181 = null;
            field3161 = null;
            field3148 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Z")
    public final boolean method1393(int arg0) {
        field3168++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (arg0 > -91) {
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
                this.method1387("invalidhost", 69);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3165++;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public final synchronized void method1394(int arg0) {
        int var2 = -72 / ((arg0 - 77) / 33);
        field3163++;
        if (class297.field4569 != null) {
            class297.field4569.removeFocusListener(this);
            class297.field4569.getParent().remove(class297.field4569);
        }
        Container var3;
        if (class247.field3838 != null) {
            var3 = class247.field3838;
        } else if (class167.field2459 == null) {
            var3 = class217.field3338.field505;
        } else {
            var3 = class167.field2459;
        }
        var3.setLayout((LayoutManager) null);
        class297.field4569 = new class90(this);
        var3.add(class297.field4569);
        class297.field4569.setSize(class126.field1854, class85.field1311);
        class297.field4569.setVisible(true);
        if (class167.field2459 == var3) {
            Insets var4 = class167.field2459.getInsets();
            class297.field4569.setLocation(class208.field3118 + var4.left, class199.field2989 + var4.top);
        } else {
            class297.field4569.setLocation(class208.field3118, class199.field2989);
        }
        class297.field4569.addFocusListener(this);
        class297.field4569.requestFocus();
        class103.field1512 = true;
        class89.field1343 = true;
        class100.field1456 = true;
        class197.field2980 = false;
        class228.field3554 = class257.method1736(14361);
    }

    @OriginalMember(owner = "client!m", name = "run", descriptor = "()V")
    public final void run() {
        field3167++;
        try {
            if (class26.field509 != null) {
                String var1 = class26.field509.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class26.field499;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1387("wrongjava", 115);
                        return;
                    }
                    class224.field3506 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class26.field499 == null || class26.field499.equals("1.4.2"))) {
                    this.method1387("wrongjava", -110);
                    return;
                }
            }
            if (class26.field499 != null && class26.field499.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class26.field499.length()) {
                    char var5 = class26.field499.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class286.field4388 = true;
                }
            }
            if (class217.field3338.field505 != null) {
                Method var6 = class26.field517;
                if (var6 != null) {
                    try {
                        var6.invoke(class217.field3338.field505, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class21.method148(true);
            this.method1394(114);
            class148.field2148 = class162.method1101((byte) 84, class126.field1854, class297.field4569, class85.field1311);
            this.method318(24);
            class213.field3275 = class11.method82(true);
            while (class285.field4373 == 0L || class257.method1736(14361) < class285.field4373) {
                class20.field342 = class213.field3275.method547(class224.field3506, (byte) -41, class246.field3828);
                for (int var7 = 0; var7 < class20.field342; var7++) {
                    this.method1391(18111);
                }
                this.method1396((byte) -106);
                class107.method779((byte) 68, class297.field4569, class217.field3338);
            }
        } catch (Exception var10) {
            class121.method860((byte) 127, (String) null, var10);
            this.method1387("crash", 45);
        }
        this.method1389(true, (byte) -54);
    }

    @OriginalMember(owner = "client!m", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3173++;
    }

    @OriginalMember(owner = "client!m", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class89.field1343 = false;
        field3158++;
    }

    @OriginalMember(owner = "client!m", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3159++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method1395(int arg0, int arg1) {
        class4.field53.method938(arg0, (byte) -123);
        class237.field3673.method938(arg0, (byte) -123);
        if (arg1 > 33) {
            class59.field975.method938(arg0, (byte) -123);
            field3164++;
        }
    }

    @OriginalMember(owner = "client!m", name = "start", descriptor = "()V")
    public final void start() {
        field3153++;
        if (class112.field1717 == this && !class190.field2881) {
            class285.field4373 = 0L;
        }
    }

    @OriginalMember(owner = "client!m", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3171++;
        class89.field1343 = true;
        class100.field1456 = true;
    }

    @OriginalMember(owner = "client!m", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3169++;
    }

    @OriginalMember(owner = "client!m", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3175++;
    }

    @OriginalMember(owner = "client!m", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3150++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    private final void method1396(byte arg0) {
        field3166++;
        long var2 = class257.method1736(14361);
        if (arg0 >= -94) {
            field3161 = null;
        }
        long var4 = class131.field1942[class17.field305];
        class131.field1942[class17.field305] = var2;
        class17.field305 = class17.field305 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class123.field1825 = ((var6 >> 1) + 32000) / var6;
        }
        if (class109.field1625++ > 50) {
            class100.field1456 = true;
            class109.field1625 -= 50;
            class297.field4569.setSize(class126.field1854, class85.field1311);
            class297.field4569.setVisible(true);
            if (class167.field2459 != null && class247.field3838 == null) {
                Insets var7 = class167.field2459.getInsets();
                class297.field4569.setLocation(class208.field3118 + var7.left, class199.field2989 + var7.top);
            } else {
                class297.field4569.setLocation(class208.field3118, class199.field2989);
            }
        }
        this.method320((byte) 19);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public abstract void method320(byte arg0);

    @OriginalMember(owner = "client!m", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3154++;
        if (class167.field2459 == null) {
            return class217.field3338 == null || class217.field3338.field505 == this ? super.getCodeBase() : class217.field3338.field505.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3162++;
        if (class167.field2459 == null) {
            return class217.field3338 == null || class217.field3338.field505 == this ? super.getParameter(arg0) : class217.field3338.field505.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public abstract void method318(int arg0);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public abstract void method332(int arg0);
}
