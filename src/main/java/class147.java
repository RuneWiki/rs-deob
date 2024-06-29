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

@OriginalClass("client!qj")
public abstract class class147 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Z")
    private boolean field2185 = false;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "J")
    private static volatile long field2172 = 0L;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2162 = -1;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "Z")
    public static boolean field2194;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method971(int arg0, int arg1) {
        field2190++;
        if (arg1 >= -101) {
            field2157 = -112;
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFF1461) >> 16) + "." + ((arg0 & 0xFF20) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field2159++;
        if (class85.field1324 != this || class41.field554) {
            return;
        }
        class83.field1311 = true;
        if (class245.field3915 && (class260.method1785((byte) -127) - field2172) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class99.field1542 && class19.field223 <= var2.height) {
                class82.field1199 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    private final void method972(byte arg0) {
        field2192++;
        long var2 = class260.method1785((byte) -101);
        long var4 = class243.field3889[class194.field3048];
        if (arg0 != 86) {
            return;
        }
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class243.field3889[class194.field3048] = var2;
        class194.field3048 = class194.field3048 + 1 & 0x1F;
        synchronized (this) {
            class270.field4301 = class71.field1009;
        }
        this.method978(arg0 - 209);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static final void method973(boolean arg0) {
        if (!arg0) {
            class118.field1728.method1430(-1);
            field2163++;
            class111.field1682.method1430(-1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public abstract void method974(byte arg0);

    @OriginalMember(owner = "client!qj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field2180++;
    }

    @OriginalMember(owner = "client!qj", name = "start", descriptor = "()V")
    public final void start() {
        field2179++;
        if (class85.field1324 == this && !class41.field554) {
            class44.field563 = 0L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIZI)V")
    public final void method975(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2178++;
        try {
            if (class85.field1324 == null) {
                class85.field1324 = this;
                class135.field1960 = arg0;
                class99.field1542 = arg0;
                class82.field1234 = 0;
                class98.field1510 = arg2;
                class19.field223 = arg2;
                class216.field3533 = 0;
                if (!arg3) {
                    method971(-113, 70);
                }
                class155.field2301 = arg4;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class2.field23 == null) {
                    class69.field977 = class2.field23 = new class20(this, arg1, (String) null, 0);
                }
                class208 var7 = class2.field23.method134((byte) 7, 1, this);
                while (var7.field3247 == 0) {
                    class170.method1183(10L, (byte) 125);
                }
            } else {
                class125.field1857++;
                if (class125.field1857 >= 3) {
                    this.method979((byte) 47, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class48.method359(1, var9, (String) null);
            this.method979((byte) 47, "crash");
        }
    }

    @OriginalMember(owner = "client!qj", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field2183++;
        if (class85.field1324 == this && !class41.field554) {
            class44.field563 = class260.method1785((byte) -126);
            class170.method1183(5000L, (byte) -71);
            class69.field977 = null;
            this.method988(false, 13549);
        }
    }

    @OriginalMember(owner = "client!qj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field2175++;
        if (class215.field3519 == null) {
            return class2.field23 == null || class2.field23.field237 == this ? super.getDocumentBase() : class2.field23.field237.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIBIILjava/lang/String;IZ)V")
    public final void method976(int arg0, int arg1, byte arg2, int arg3, int arg4, String arg5, int arg6, boolean arg7) {
        field2164++;
        try {
            class135.field1960 = arg4;
            class99.field1542 = arg4;
            class216.field3533 = 0;
            class98.field1510 = arg0;
            class19.field223 = arg0;
            class82.field1234 = 0;
            class155.field2301 = arg6;
            class85.field1324 = this;
            class215.field3519 = new Frame();
            class215.field3519.setTitle("Jagex");
            class215.field3519.setResizable(true);
            class215.field3519.addWindowListener(this);
            if (arg2 != 114) {
                field2162 = -32;
            }
            class215.field3519.setVisible(true);
            class215.field3519.toFront();
            Insets var9 = class215.field3519.getInsets();
            class215.field3519.setSize(var9.right + var9.left + class99.field1542, class19.field223 - (-var9.top - var9.bottom));
            class69.field977 = class2.field23 = new class20((Applet) null, arg1, arg5, arg3);
            class208 var10 = class2.field23.method134((byte) -25, 1, this);
            while (var10.field3247 == 0) {
                class170.method1183(10L, (byte) 119);
            }
        } catch (Exception var12) {
            class48.method359(1, var12, (String) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)Z")
    public final boolean method977(boolean arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (!arg0) {
            field2172 = -94L;
        }
        field2166++;
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
                this.method979((byte) 47, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public abstract void method978(int arg0);

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
    public final void run() {
        field2184++;
        try {
            if (class20.field240 != null) {
                String var1 = class20.field240.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class20.field249;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method979((byte) 47, "wrongjava");
                        return;
                    }
                    class164.field2555 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class20.field249 == null || class20.field249.equals("1.4.2"))) {
                    this.method979((byte) 47, "wrongjava");
                    return;
                }
            }
            if (class20.field249 != null && class20.field249.startsWith("1.")) {
                int var3 = 0;
                int var4 = 2;
                while (var4 < class20.field249.length()) {
                    char var5 = class20.field249.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4++;
                    var3 = var3 * 10 + var5 - 48;
                }
                if (var3 >= 5) {
                    class245.field3915 = true;
                }
            }
            if (class2.field23.field237 != null) {
                Method var6 = class20.field252;
                if (var6 != null) {
                    try {
                        var6.invoke(class2.field23.field237, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class149.method1000((byte) -84);
            this.method983(-105);
            class26.field369 = class5.method24(0, class135.field1960, class98.field1510, class86.field1364);
            this.method974((byte) -124);
            class270.field4300 = class211.method1426(1577271969);
            while (class44.field563 == 0L || class260.method1785((byte) -115) < class44.field563) {
                class276.field4396 = class270.field4300.method514(class6.field90, class164.field2555, (byte) -115);
                for (int var7 = 0; var7 < class276.field4396; var7++) {
                    this.method972((byte) 86);
                }
                this.method980(true);
                class151.method1005((byte) 76, class86.field1364, class2.field23);
            }
        } catch (Exception var10) {
            class48.method359(1, var10, (String) null);
            this.method979((byte) 47, "crash");
        }
        this.method988(true, 13549);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method979(byte arg0, String arg1) {
        field2189++;
        if (this.field2185) {
            return;
        }
        this.field2185 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
        if (arg0 != 47) {
            method981((byte) 111);
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field2158++;
    }

    @OriginalMember(owner = "client!qj", name = "providesignlink", descriptor = "(Lbk;)V")
    public static final void providesignlink(class20 arg0) {
        class2.field23 = arg0;
        class69.field977 = arg0;
        field2186++;
    }

    @OriginalMember(owner = "client!qj", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!qj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field2176++;
        if (class215.field3519 == null) {
            return class2.field23 == null || class2.field23.field237 == this ? super.getAppletContext() : class2.field23.field237.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
    private final void method980(boolean arg0) {
        long var2 = class60.field847[class74.field1058];
        long var4 = class260.method1785((byte) -111);
        field2161++;
        class60.field847[class74.field1058] = var4;
        class74.field1058 = class74.field1058 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class19.field222 = ((var6 >> 1) + 32000) / var6;
        }
        if (!arg0) {
            field2162 = 55;
        }
        if ((class115.field1707++) > 50) {
            class83.field1311 = true;
            class115.field1707 -= 50;
            class86.field1364.setSize(class135.field1960, class98.field1510);
            class86.field1364.setVisible(true);
            if (class215.field3519 != null && class154.field2291 == null) {
                Insets var7 = class215.field3519.getInsets();
                class86.field1364.setLocation(class82.field1234 + var7.left, class216.field3533 + var7.top);
            } else {
                class86.field1364.setLocation(class82.field1234, class216.field3533);
            }
        }
        this.method985(70);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    public static final void method981(byte arg0) {
        class209.field3255.method1420(-1);
        field2182++;
        if (arg0 <= 49) {
            field2162 = -86;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIILhi;IJ)Z")
    public static final boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class3.method9(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final synchronized void method983(int arg0) {
        if (class86.field1364 != null) {
            class86.field1364.removeFocusListener(this);
            class86.field1364.getParent().remove(class86.field1364);
        }
        field2181++;
        Container var2;
        if (class154.field2291 != null) {
            var2 = class154.field2291;
        } else if (class215.field3519 == null) {
            var2 = class2.field23.field237;
        } else {
            var2 = class215.field3519;
        }
        var2.setLayout((LayoutManager) null);
        class86.field1364 = new class247(this);
        var2.add(class86.field1364);
        class86.field1364.setSize(class135.field1960, class98.field1510);
        class86.field1364.setVisible(true);
        if (class215.field3519 == var2) {
            Insets var3 = class215.field3519.getInsets();
            class86.field1364.setLocation(class82.field1234 + var3.left, class216.field3533 + var3.top);
        } else {
            class86.field1364.setLocation(class82.field1234, class216.field3533);
        }
        if (arg0 != -105) {
            this.method987((byte) -101);
        }
        class86.field1364.addFocusListener(this);
        class86.field1364.requestFocus();
        class270.field4301 = true;
        class71.field1009 = true;
        class83.field1311 = true;
        class82.field1199 = false;
        field2172 = class260.method1785((byte) -126);
    }

    @OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class71.field1009 = false;
        field2171++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public static final void method984(byte arg0) {
        field2168++;
        if (class240.field3833 != null) {
            class240.field3833.method1842(false);
            class240.field3833 = null;
        }
        class25.method169(56);
        class190.method1335();
        for (int var1 = 0; var1 < 4; var1++) {
            class290.field4574[var1].method546((byte) -12);
        }
        class195.method1353(-118, false);
        System.gc();
        class140.method943((byte) 53, 2);
        class284.field4509 = false;
        class37.field488 = -1;
        class192.method1345(17621, true);
        class138.field2043 = 0;
        class224.field3615 = false;
        class179.field2794 = 0;
        class126.field1869 = 0;
        class246.field3943 = 0;
        for (int var2 = 0; var2 < class144.field2129.length; var2++) {
            class144.field2129[var2] = null;
        }
        class236.field3774 = 0;
        class73.field1040 = 0;
        int var3 = 73 % ((arg0 - 54) / 36);
        for (int var4 = 0; var4 < 2048; var4++) {
            class153.field2277[var4] = null;
            class231.field3724[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class100.field1566[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class243.field3891[var6][var7][var8] = null;
                }
            }
        }
        class136.method917((byte) 78);
        class246.field3949 = 0;
        class6.method30(0);
        class162.method1111(-99, true);
    }

    @OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2174++;
        class71.field1009 = true;
        class83.field1311 = true;
    }

    @OriginalMember(owner = "client!qj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field2160++;
    }

    @OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2177++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public abstract void method985(int arg0);

    @OriginalMember(owner = "client!qj", name = "stop", descriptor = "()V")
    public final void stop() {
        field2167++;
        if (class85.field1324 == this && !class41.field554) {
            class44.field563 = class260.method1785((byte) -120) + 4000L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field2187++;
    }

    @OriginalMember(owner = "client!qj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field2188++;
    }

    @OriginalMember(owner = "client!qj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field2191++;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
    public abstract void method986(byte arg0);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
    public abstract void method987(byte arg0);

    @OriginalMember(owner = "client!qj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field2165++;
        this.destroy();
    }

    @OriginalMember(owner = "client!qj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field2173++;
        if (class215.field3519 == null) {
            return class2.field23 == null || class2.field23.field237 == this ? super.getCodeBase() : class2.field23.field237.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V")
    private final void method988(boolean arg0, int arg1) {
        field2169++;
        synchronized (this) {
            if (class41.field554) {
                return;
            }
            class41.field554 = true;
            if (arg1 != 13549) {
                this.windowDeiconified((WindowEvent) null);
            }
        }
        if (class2.field23.field237 != null) {
            class2.field23.field237.destroy();
        }
        try {
            this.method986((byte) 119);
        } catch (Exception var9) {
        }
        if (class86.field1364 != null) {
            try {
                class86.field1364.removeFocusListener(this);
                class86.field1364.getParent().remove(class86.field1364);
            } catch (Exception var8) {
            }
        }
        if (class2.field23 != null) {
            try {
                class2.field23.method136((byte) -116);
            } catch (Exception var7) {
            }
        }
        this.method987((byte) 125);
        if (class215.field3519 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!qj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field2170++;
        if (class215.field3519 == null) {
            return class2.field23 == null || class2.field23.field237 == this ? super.getParameter(arg0) : class2.field23.field237.getParameter(arg0);
        } else {
            return null;
        }
    }
}
