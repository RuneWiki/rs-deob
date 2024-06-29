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

@OriginalClass("client!qi")
public abstract class class215 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    private boolean field3037 = false;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "Z")
    private boolean field3068 = false;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lbt;")
    public static class363 field3047 = new class363(64);

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "Z")
    public static boolean field3067 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "Z")
    public static boolean field3070;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "Z")
    public static boolean field3073;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "Z")
    public static boolean field3074;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "[Lui;")
    public static class378[] field3069;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "[[B")
    public static byte[][] field3066;

    @OriginalMember(owner = "client!qi", name = "stop", descriptor = "()V")
    public final void stop() {
        field3058++;
        if (class370.field5418 == this && !class55.field674) {
            class337.field4968 = class43.method364(-16756) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public abstract void method1473(byte arg0);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public abstract void method1474(byte arg0);

    @OriginalMember(owner = "client!qi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qi", name = "start", descriptor = "()V")
    public final void start() {
        field3053++;
        if (class370.field5418 == this && !class55.field674) {
            class337.field4968 = 0L;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        field3047 = null;
        if (arg0 > -99) {
            field3067 = false;
        }
        field3066 = null;
        field3069 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public abstract void method1476(int arg0);

    @OriginalMember(owner = "client!qi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3051++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)I")
    public static final int method1477(int arg0, int arg1, int arg2) {
        field3036++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 << 13 ^ var3;
        if (arg2 != -27631) {
            method1475((byte) -105);
        }
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!qi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3063++;
    }

    @OriginalMember(owner = "client!qi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3050++;
        if (class279.field4116 == null) {
            return class267.field3963 == null || class267.field3963.field5023 == this ? super.getCodeBase() : class267.field3963.field5023.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public final void method1478(int arg0) {
        if (arg0 <= 41) {
            return;
        }
        field3038++;
        if (this.field3037) {
            return;
        }
        try {
            class350 var2 = class267.field3963.method2207(0, class370.field5418.getClass());
            while (var2.field5134 == 0) {
                class418.method2587(false, 100L);
            }
            if (var2.field5129 != null) {
                throw (Throwable) var2.field5129;
            }
            jagmisc.init();
            this.field3037 = true;
            class237.field3528 = class427.method2617(-100);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3065++;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    private final void method1479(int arg0) {
        field3041++;
        long var2 = class43.method364(-16756);
        long var4 = class313.field4592[class376.field5485];
        class313.field4592[class376.field5485] = var2;
        class376.field5485 = class376.field5485 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class392.field5704 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class37.field530++) > 50) {
            class37.field530 -= 50;
            class36.field508 = true;
            class270.field4004.setSize(class214.field3016, class375.field5473);
            class270.field4004.setVisible(true);
            if (class279.field4116 != null && class359.field5222 == null) {
                Insets var7 = class279.field4116.getInsets();
                class270.field4004.setLocation(class31.field433 + var7.left, var7.top - -class263.field3898);
            } else {
                class270.field4004.setLocation(class31.field433, class263.field3898);
            }
        }
        this.method1473((byte) -92);
        int var8 = -75 / ((arg0 - 20) / 35);
    }

    @OriginalMember(owner = "client!qi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3034++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BZ)V")
    private final void method1480(byte arg0, boolean arg1) {
        if (arg0 > -12) {
            return;
        }
        field3046++;
        synchronized (this) {
            if (class55.field674) {
                return;
            }
            class55.field674 = true;
        }
        if (class267.field3963.field5023 != null) {
            class267.field3963.field5023.destroy();
        }
        try {
            this.method1487(-31);
        } catch (Exception var11) {
        }
        if (this.field3037) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field3037 = false;
        }
        class350 var4 = class267.field3963.method2211(class370.field5418.getClass(), (byte) -56);
        while (var4.field5134 == 0) {
            class418.method2587(false, 100L);
        }
        if (class270.field4004 != null) {
            try {
                class270.field4004.removeFocusListener(this);
                class270.field4004.getParent().remove(class270.field4004);
            } catch (Exception var9) {
            }
        }
        if (class267.field3963 != null) {
            try {
                class267.field3963.method2201(10000);
            } catch (Exception var8) {
            }
        }
        this.method1474((byte) 61);
        if (class279.field4116 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
    private final void method1481(byte arg0) {
        if (arg0 != -112) {
            field3066 = null;
        }
        field3049++;
        long var2 = class43.method364(-16756);
        long var4 = class37.field522[class199.field2801];
        class37.field522[class199.field2801] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class199.field2801 = class199.field2801 + 1 & 0x1F;
        synchronized (this) {
            class129.field1722 = class451.field6662;
        }
        this.method1484((byte) -85);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public final synchronized void method1482(boolean arg0) {
        field3061++;
        if (class270.field4004 != null) {
            class270.field4004.removeFocusListener(this);
            class270.field4004.getParent().remove(class270.field4004);
        }
        Container var2;
        if (class359.field5222 != null) {
            var2 = class359.field5222;
        } else if (class279.field4116 == null) {
            var2 = class267.field3963.field5023;
        } else {
            var2 = class279.field4116;
        }
        var2.setLayout((LayoutManager) null);
        class270.field4004 = new class356(this);
        var2.add(class270.field4004);
        class270.field4004.setSize(class214.field3016, class375.field5473);
        class270.field4004.setVisible(true);
        if (class279.field4116 == var2) {
            Insets var3 = class279.field4116.getInsets();
            class270.field4004.setLocation(class31.field433 + var3.left, class263.field3898 + var3.top);
        } else {
            class270.field4004.setLocation(class31.field433, class263.field3898);
        }
        class270.field4004.addFocusListener(this);
        class270.field4004.requestFocus();
        class129.field1722 = arg0;
        class451.field6662 = true;
        class36.field508 = true;
        class431.field6283 = false;
        class28.field395 = class43.method364(-16756);
    }

    @OriginalMember(owner = "client!qi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3052++;
    }

    @OriginalMember(owner = "client!qi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3035++;
        if (class279.field4116 == null) {
            return class267.field3963 == null || class267.field3963.field5023 == this ? super.getAppletContext() : class267.field3963.field5023.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3054++;
    }

    @OriginalMember(owner = "client!qi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3039++;
        if (class370.field5418 != this || class55.field674) {
            return;
        }
        class36.field508 = true;
        if (class422.field6106 && (class43.method364(-16756) - class28.field395) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class266.field3946 && class252.field3699 <= var2.height) {
                class431.field6283 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Z")
    public final boolean method1483(int arg0) {
        field3044++;
        if (arg0 != 1376312589) {
            return true;
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
                this.method1488(true, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class451.field6662 = true;
        field3056++;
        class36.field508 = true;
    }

    @OriginalMember(owner = "client!qi", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3057++;
        if (class370.field5418 == this && !class55.field674) {
            class337.field4968 = class43.method364(-16756);
            class418.method2587(false, 5000L);
            class363.field5258 = null;
            this.method1480((byte) -14, false);
        }
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
    public abstract void method1484(byte arg0);

    @OriginalMember(owner = "client!qi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3055++;
        if (class279.field4116 == null) {
            return class267.field3963 == null || class267.field3963.field5023 == this ? super.getDocumentBase() : class267.field3963.field5023.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBZLjava/lang/String;IIII)V")
    public final void method1485(int arg0, byte arg1, boolean arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class375.field5473 = arg4;
            class252.field3699 = arg4;
            class263.field3898 = 0;
            class31.field433 = 0;
            class125.field1664 = arg0;
            class370.field5418 = this;
            class214.field3016 = arg5;
            class266.field3946 = arg5;
            class279.field4116 = new Frame();
            class279.field4116.setTitle("Jagex");
            class279.field4116.setResizable(true);
            class279.field4116.addWindowListener(this);
            class279.field4116.setVisible(true);
            class279.field4116.toFront();
            Insets var9 = class279.field4116.getInsets();
            class279.field4116.setSize(class266.field3946 + var9.right + var9.left, var9.top + var9.bottom + class252.field3699);
            class363.field5258 = class267.field3963 = new class341((Applet) null, arg6, arg3, arg7);
            class350 var10 = class267.field3963.method2213(1, this, 26744);
            while (var10.field5134 == 0) {
                class418.method2587(false, 10L);
            }
        } catch (Exception var12) {
            class365.method2331((String) null, var12, 28692);
        }
        field3059++;
        if (arg1 < 82) {
            this.getAppletContext();
        }
    }

    @OriginalMember(owner = "client!qi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3042++;
        if (class279.field4116 == null) {
            return class267.field3963 == null || class267.field3963.field5023 == this ? super.getParameter(arg0) : class267.field3963.field5023.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3045++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3060++;
    }

    @OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
    public final void run() {
        field3032++;
        try {
            label111: {
                if (class341.field5020 != null) {
                    String var1 = class341.field5020.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class341.field5018;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method1488(true, "wrongjava");
                            break label111;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class341.field5018 == null || class341.field5018.equals("1.4.2"))) {
                        this.method1488(true, "wrongjava");
                        break label111;
                    }
                }
                if (class341.field5018 != null && class341.field5018.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (class341.field5018.length() > var3) {
                        char var5 = class341.field5018.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class422.field6106 = true;
                    }
                }
                if (class267.field3963.field5023 != null) {
                    Method var6 = class341.field5025;
                    if (var6 != null) {
                        try {
                            var6.invoke(class267.field3963.field5023, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class322.method2114((byte) -127);
                class153.method1046((byte) -30);
                this.method1482(true);
                this.method1476(-2980);
                class237.field3528 = class427.method2617(-100);
                this.method1478(107);
                while (class337.field4968 == 0L || class337.field4968 > class43.method364(-16756)) {
                    class404.field5850 = class237.field3528.method301(-9862, class191.field2673);
                    for (int var7 = 0; var7 < class404.field5850; var7++) {
                        this.method1481((byte) -112);
                    }
                    this.method1479(-100);
                    class149.method1025(class267.field3963, class270.field4004, 20897);
                }
            }
        } catch (Exception var10) {
            class365.method2331((String) null, var10, 28692);
            this.method1488(true, "crash");
        }
        this.method1480((byte) -110, true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
    public final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3048++;
        try {
            if (class370.field5418 == null) {
                class214.field3016 = arg2;
                class266.field3946 = arg2;
                class375.field5473 = arg4;
                class252.field3699 = arg4;
                class263.field3898 = 0;
                class31.field433 = arg0;
                class125.field1664 = arg3;
                class370.field5418 = this;
                if (class267.field3963 == null) {
                    class363.field5258 = class267.field3963 = new class341(this, arg1, (String) null, 0);
                }
                class350 var6 = class267.field3963.method2213(1, this, 26744);
                while (var6.field5134 == 0) {
                    class418.method2587(false, 10L);
                }
            } else {
                class204.field2867++;
                if (class204.field2867 >= 3) {
                    this.method1488(true, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class365.method2331((String) null, var8, 28692);
            this.method1488(true, "crash");
        }
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
    public abstract void method1487(int arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method1488(boolean arg0, String arg1) {
        field3031++;
        if (this.field3068) {
            return;
        }
        this.field3068 = arg0;
        System.out.println("error_game_" + arg1);
        try {
            class73.method521(arg0, class267.field3963.field5023, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class451.field6662 = false;
        field3040++;
    }

    @OriginalMember(owner = "client!qi", name = "providesignlink", descriptor = "(Lgt;)V")
    public static final void providesignlink(class341 arg0) {
        class267.field3963 = arg0;
        class363.field5258 = arg0;
        field3043++;
    }

    static {
        new class409("Use", "Benutzen", "Utiliser", "Usar");
    }
}
