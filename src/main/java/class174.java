import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class174 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Z")
    private boolean field3011 = false;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Lbe;")
    public static class283 field2979 = class153.method941(125, " )2>");

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "[[B")
    public static byte[][] field3001 = new byte[50][];

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Lqb;")
    public static class95 field3009 = null;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Lbe;")
    private static class283 field2993 = class153.method941(-106, "Close");

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "Lbe;")
    public static class283 field3010 = field2993;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "Z")
    public static boolean field3014;

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Z")
    public static boolean field3015;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
    public static int[] field2978;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILek;)I", line = 6)
    public static final int method1133(int arg0, class172 arg1) {
        int var2 = arg0;
        if (arg1.method1109((byte) -106, class110.field1861)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1109((byte) -124, class90.field1522)) {
            var2++;
        }
        field3006++;
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 26)
    public final void windowDeactivated(WindowEvent arg0) {
        field2972++;
    }

    @OriginalMember(owner = "client!nm", name = "providesignlink", descriptor = "(Lui;)V", line = 36)
    public static final void providesignlink(class251 arg0) {
        class150.field2460 = arg0;
        class242.field4088 = arg0;
        field3003++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lmg;", line = 47)
    public static final class145 method1135(int arg0, int arg1) {
        if (arg1 <= 29) {
            field3010 = (class283) null;
        }
        class145 var2 = (class145) class261.field4431.method1629(70, (long) arg0);
        field2973++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field86.method1107(4, arg0, 127);
        class145 var4 = new class145();
        if (var3 != null) {
            var4.method912(0, arg0, new class229(var3));
        }
        class261.field4431.method1630(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 73)
    public final void method1136(String arg0, int arg1) {
        field2994++;
        if (this.field3011) {
            return;
        }
        this.field3011 = true;
        if (arg1 != 20504) {
            return;
        }
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!nm", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 95)
    public final String getParameter(String arg0) {
        field3004++;
        if (class164.field2711 == null) {
            return class150.field2460 == null || class150.field2460.field4272 == this ? super.getParameter(arg0) : class150.field2460.field4272.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "run", descriptor = "()V", line = 121)
    public final void run() {
        field2996++;
        try {
            if (class251.field4256 != null) {
                String var1 = class251.field4256.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class251.field4264;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1136("wrongjava", 20504);
                        return;
                    }
                    class182.field3123 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class251.field4264 == null || class251.field4264.equals("1.4.2"))) {
                    this.method1136("wrongjava", 20504);
                    return;
                }
            }
            if (class150.field2460.field4272 != null) {
                Method var3 = class251.field4273;
                if (var3 != null) {
                    try {
                        var3.invoke(class150.field2460.field4272, Boolean.TRUE);
                    } catch (Throwable var7) {
                    }
                }
            }
            this.method1138(-1733);
            this.method1148(false);
            class182.field3132 = class248.method1685(1);
            while (class67.field950 == 0L || class67.field950 > class216.method1426(255)) {
                class182.field3128 = class182.field3132.method936((byte) 34, class123.field2047, class182.field3123);
                for (int var5 = 0; var5 < class182.field3128; var5++) {
                    this.method1145(20308);
                }
                this.method1140(-1);
                class65.method419(class150.field2460, class264.field4487, 1);
            }
        } catch (Exception var8) {
            class296.method2011(true, (String) null, var8);
            this.method1136("crash", 20504);
        }
        this.method1141(true, 120);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 202)
    public static void method1137(byte arg0) {
        field3001 = (byte[][]) null;
        if (arg0 != 124) {
            providesignlink((class251) null);
        }
        field2978 = null;
        field2979 = null;
        field2993 = null;
        field3009 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!nm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 217)
    public final void focusGained(FocusEvent arg0) {
        class48.field665 = true;
        field2971++;
        class142.field2364 = true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 229)
    private final synchronized void method1138(int arg0) {
        if (class264.field4487 != null) {
            class264.field4487.removeFocusListener(this);
            class264.field4487.getParent().remove(class264.field4487);
        }
        field3007++;
        Container var2;
        if (class1.field2 != null) {
            var2 = class1.field2;
        } else if (class164.field2711 == null) {
            var2 = class150.field2460.field4272;
        } else {
            var2 = class164.field2711;
        }
        var2.setLayout((LayoutManager) null);
        class264.field4487 = new class309(this);
        class264.field4487.setIgnoreRepaint(true);
        var2.add(class264.field4487);
        class264.field4487.setSize(class115.field1945, class48.field655);
        class264.field4487.setVisible(true);
        if (class164.field2711 == var2) {
            Insets var3 = class164.field2711.getInsets();
            class264.field4487.setLocation(class6.field62 + var3.left, class282.field4767 + var3.top);
        } else {
            class264.field4487.setLocation(class6.field62, class282.field4767);
        }
        class264.field4487.addFocusListener(this);
        class264.field4487.requestFocus();
        class18.field222 = true;
        class48.field665 = true;
        class142.field2364 = true;
        class67.field941 = false;
        class194.field3322 = class216.method1426(255);
        if (arg0 != -1733) {
            this.windowClosed((WindowEvent) null);
        }
    }

    @OriginalMember(owner = "client!nm", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 279)
    public final void windowClosed(WindowEvent arg0) {
        field2982++;
    }

    @OriginalMember(owner = "client!nm", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 286)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2976++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)I", line = 294)
    public static final int method1139(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field3010 = (class283) null;
        }
        field2984++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!nm", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 307)
    public final void windowDeiconified(WindowEvent arg0) {
        field2980++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 316)
    private final void method1140(int arg0) {
        field2992++;
        long var2 = class45.field612[class304.field5153];
        long var4 = class216.method1426(arg0 + 256);
        class45.field612[class304.field5153] = var4;
        if (var2 != 0L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class109.field1848 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != -1) {
            return;
        }
        class304.field5153 = class304.field5153 + 1 & 0x1F;
        if ((class192.field3297++) > 50) {
            class142.field2364 = true;
            class192.field3297 -= 50;
            class264.field4487.setSize(class115.field1945, class48.field655);
            class264.field4487.setVisible(true);
            if (class164.field2711 != null && class1.field2 == null) {
                Insets var7 = class164.field2711.getInsets();
                class264.field4487.setLocation(class6.field62 + var7.left, class282.field4767 + var7.top);
            } else {
                class264.field4487.setLocation(class6.field62, class282.field4767);
            }
        }
        this.method1146(50);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V", line = 358)
    private final void method1141(boolean arg0, int arg1) {
        field3012++;
        synchronized (this) {
            if (arg1 <= 119) {
                return;
            }
            if (class140.field2340) {
                return;
            }
            class140.field2340 = true;
        }
        if (class150.field2460.field4272 != null) {
            class150.field2460.field4272.destroy();
        }
        try {
            this.method1143(0);
        } catch (Exception var12) {
        }
        if (class264.field4487 != null) {
            try {
                class264.field4487.removeFocusListener(this);
                class264.field4487.getParent().remove(class264.field4487);
            } catch (Exception var11) {
            }
        }
        if (class150.field2460 != null) {
            try {
                class150.field2460.method1706((byte) -45);
            } catch (Exception var10) {
            }
        }
        this.method1147((byte) 116);
        if (class164.field2711 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!nm", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 418)
    public final URL getDocumentBase() {
        field2999++;
        if (class164.field2711 == null) {
            return class150.field2460 == null || class150.field2460.field4272 == this ? super.getDocumentBase() : class150.field2460.field4272.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/lang/String;IIIZI)V", line = 435)
    public final void method1142(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            class282.field4767 = 0;
            class145.field2403 = this;
            class48.field655 = arg3;
            class103.field1757 = arg3;
            class137.field2281 = arg4;
            class115.field1945 = arg6;
            class1.field1 = arg6;
            class6.field62 = 0;
            class164.field2711 = new Frame();
            class164.field2711.setTitle("Jagex");
            class164.field2711.setResizable(true);
            class164.field2711.addWindowListener(this);
            class164.field2711.setVisible(arg5);
            class164.field2711.toFront();
            Insets var8 = class164.field2711.getInsets();
            class164.field2711.setSize(class1.field1 + var8.left + var8.right, class103.field1757 + var8.top + var8.bottom);
            class242.field4088 = class150.field2460 = new class251(true, (Applet) null, arg2, arg1, arg0);
            class150.field2460.method1691(5, 25, this);
        } catch (Exception var10) {
            class296.method2011(arg5, (String) null, var10);
        }
        field2998++;
    }

    @OriginalMember(owner = "client!nm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 468)
    public final void focusLost(FocusEvent arg0) {
        field2987++;
        class48.field665 = false;
    }

    @OriginalMember(owner = "client!nm", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 476)
    public final AppletContext getAppletContext() {
        field2981++;
        if (class164.field2711 == null) {
            return class150.field2460 == null || class150.field2460.field4272 == this ? super.getAppletContext() : class150.field2460.field4272.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "stop", descriptor = "()V", line = 491)
    public final void stop() {
        field3000++;
        if (class145.field2403 == this && !class140.field2340) {
            class67.field950 = class216.method1426(255) + 4000L;
        }
    }

    @OriginalMember(owner = "client!nm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 507)
    public final synchronized void paint(Graphics arg0) {
        field2991++;
        if (class145.field2403 == this && !class140.field2340) {
            class142.field2364 = true;
            if (class251.field4264 != null && class251.field4264.startsWith("1.5")) {
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V", line = 539)
    public final void method1144(String arg0, String arg1, boolean arg2) {
        field2985++;
        if (arg2) {
            field3008 = -110;
        }
        if (this.field3011) {
            return;
        }
        this.field3011 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws?" + arg0), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nm", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 562)
    public final URL getCodeBase() {
        field2997++;
        if (class164.field2711 == null) {
            return class150.field2460 == null || class150.field2460.field4272 == this ? super.getCodeBase() : class150.field2460.field4272.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 576)
    public final void update(Graphics arg0) {
        field2990++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!nm", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 584)
    public final void windowOpened(WindowEvent arg0) {
        field2995++;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 593)
    private final void method1145(int arg0) {
        field2989++;
        if (arg0 != 20308) {
            field3010 = (class283) null;
        }
        long var2 = class216.method1426(255);
        long var4 = class157.field2586[class132.field2228];
        if (var4 != 0L && var4 < var2) {
        }
        class157.field2586[class132.field2228] = var2;
        class132.field2228 = class132.field2228 + 1 & 0x1F;
        synchronized (this) {
            class18.field222 = class48.field665;
        }
        this.method1134((byte) -94);
    }

    @OriginalMember(owner = "client!nm", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 628)
    public final void windowIconified(WindowEvent arg0) {
        field3005++;
    }

    @OriginalMember(owner = "client!nm", name = "start", descriptor = "()V", line = 643)
    public final void start() {
        field2975++;
        if (class145.field2403 == this && !class140.field2340) {
            class67.field950 = 0L;
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)Z", line = 654)
    public final boolean method1149(int arg0) {
        field2986++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = -112 % ((-arg0) / 57);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1136("invalidhost", 20504);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(SI)Z", line = 690)
    public static final boolean method1150(short arg0, int arg1) {
        field3002++;
        if (arg0 == 50 || arg0 == 12 || arg0 == 16 || arg0 == 32 || arg0 == 23 || arg0 == 29 || arg0 == 51 || arg0 == 31) {
            return true;
        } else if (arg0 == 43 || arg0 == 17 || arg0 == 1001 || arg0 == 1005) {
            return true;
        } else if (arg0 == 58 || arg0 == 8 || arg0 == 15 || arg0 == 40 || arg0 == 11) {
            return true;
        } else {
            int var2 = -51 / ((-arg1 - 20) / 61);
            return arg0 == 5 || arg0 == 45 || arg0 == 47 || arg0 == 22 || arg0 == 39 || arg0 == 14;
        }
    }

    @OriginalMember(owner = "client!nm", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 714)
    public final void windowActivated(WindowEvent arg0) {
        field2974++;
    }

    @OriginalMember(owner = "client!nm", name = "destroy", descriptor = "()V", line = 730)
    public final void destroy() {
        field2988++;
        if (class145.field2403 == this && !class140.field2340) {
            class67.field950 = class216.method1426(255);
            class2.method11((byte) -20, 5000L);
            class242.field4088 = null;
            this.method1141(false, 126);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIBII)V", line = 749)
    public final void method1151(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2977++;
        try {
            int var6 = 124 / ((arg2 + 22) / 63);
            if (class145.field2403 != null) {
                class64.field885++;
                if (class64.field885 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method1136("alreadyloaded", 20504);
                return;
            }
            class282.field4767 = 0;
            class115.field1945 = arg3;
            class1.field1 = arg3;
            class48.field655 = arg4;
            class103.field1757 = arg4;
            class137.field2281 = arg1;
            class145.field2403 = this;
            class6.field62 = 0;
            String var7 = this.getParameter("openwinjs");
            if (var7 != null && var7.equals("1")) {
                class168.field2819 = true;
            } else {
                class168.field2819 = false;
            }
            if (class150.field2460 == null) {
                class242.field4088 = class150.field2460 = new class251(false, this, arg0, (String) null, 0);
            }
            class150.field2460.method1691(5, 25, this);
        } catch (Exception var9) {
            class296.method2011(true, (String) null, var9);
            this.method1136("crash", 20504);
        }
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V", line = 799)
    public static final void method1152(int arg0) {
        field2983++;
        class145.field2403.method1138(-1733);
        if (arg0 != 29840) {
            method1133(52, (class172) null);
        }
    }

    @OriginalMember(owner = "client!nm", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public abstract void method1134(byte arg0);

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
    public abstract void method1143(int arg0);

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V")
    public abstract void method1146(int arg0);

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public abstract void method1147(byte arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
    public abstract void method1148(boolean arg0);
}
