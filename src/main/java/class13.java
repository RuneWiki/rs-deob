import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class13 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field296 = 1;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Z")
    public static boolean field300 = false;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "Luc;")
    public static class211 field291 = new class211(64);

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "Loc;")
    public static class151 field310 = class137.method873(2, "Weiter");

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Z")
    public static boolean field309 = false;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "J")
    private static volatile long field312 = 0L;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "Z")
    public static boolean field313;

    @OriginalMember(owner = "client!ba", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field292++;
    }

    @OriginalMember(owner = "client!ba", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field276++;
        if (class229.field4068 == this && !class174.field3149) {
            class164.field2965 = class217.method1351(-127);
            class156.method1027(0, 5000L);
            class188.field3335 = null;
            this.method110(false, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field289++;
        try {
            class36.field751 = arg1;
            class155.field2805 = arg2;
            class229.field4068 = this;
            class202.field3602 = arg6;
            class189.field3348 = new Frame();
            class189.field3348.setTitle("Jagex");
            class189.field3348.setResizable(false);
            class189.field3348.addWindowListener(this);
            class189.field3348.setVisible(true);
            class189.field3348.toFront();
            Insets var8 = class189.field3348.getInsets();
            class189.field3348.setSize(arg6 + var8.left + var8.right, var8.top + arg1 + var8.bottom);
            class188.field3335 = class174.field3151 = new class35(true, null, arg4, arg5, arg3);
            class174.field3151.method263(this, arg0, false);
        } catch (Exception var10) {
            class123.method746(var10, null, -12134);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
    public final boolean method101(byte arg0) {
        field298++;
        if (arg0 != 76) {
            this.method101((byte) -116);
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
                this.method103(4, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field294++;
        class205.field3636 = true;
        class200.field3535 = true;
    }

    @OriginalMember(owner = "client!ba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field301++;
        class205.field3636 = false;
    }

    @OriginalMember(owner = "client!ba", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field303++;
        if (class189.field3348 == null) {
            return class174.field3151 == null || class174.field3151.field724 == this ? super.getAppletContext() : class174.field3151.field724.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field280++;
    }

    @OriginalMember(owner = "client!ba", name = "start", descriptor = "()V")
    public final void start() {
        field282++;
        if (class229.field4068 == this && !class174.field3149) {
            class164.field2965 = 0L;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILsd;Lsd;Lsd;)V")
    public static final void method102(int arg0, class192 arg1, class192 arg2, class192 arg3) {
        field278++;
        class120.field2162 = arg3.method1198(25128, class210.field3683);
        class83.field1583 = arg1.method1198(25128, class107.field1892);
        class116.field2091 = arg1.method1198(25128, class95.field1769);
        class106.field1879 = arg1.method1198(25128, class235.field4347);
        class3.field75 = arg1.method1198(25128, class45.field927);
        class91.field1665 = arg1.method1198(25128, class101.field1825);
        class74.field1439 = arg1.method1198(25128, class220.field3818);
        class116.field2081 = arg1.method1198(25128, class155.field2802);
        if (arg0 >= 59) {
            class120.field2159 = arg1.method1198(25128, class235.field4370);
            class139.field2546 = arg1.method1198(25128, class51.field1036);
            class20.field442 = arg1.method1198(25128, class159.field2856);
            class156.field2819 = arg2.method1198(25128, class39.field796);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method103(int arg0, String arg1) {
        field295++;
        if (this.field286) {
            return;
        }
        if (arg0 != 4) {
            field312 = -99L;
        }
        this.field286 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ba", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ba", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field281++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public abstract void method105(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public abstract void method106(boolean arg0);

    @OriginalMember(owner = "client!ba", name = "stop", descriptor = "()V")
    public final void stop() {
        field297++;
        if (class229.field4068 == this && !class174.field3149) {
            class164.field2965 = class217.method1351(108) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z")
    public static final boolean method107(int arg0, int arg1) {
        field288++;
        if (arg1 != -1266182753) {
            field310 = null;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field285++;
        if (class189.field3348 == null) {
            return class174.field3151 == null || class174.field3151.field724 == this ? super.getParameter(arg0) : class174.field3151.field724.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field283++;
    }

    @OriginalMember(owner = "client!ba", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field293++;
        if (class189.field3348 == null) {
            return class174.field3151 == null || class174.field3151.field724 == this ? super.getCodeBase() : class174.field3151.field724.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public abstract void method108(byte arg0);

    @OriginalMember(owner = "client!ba", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field311++;
        if (class189.field3348 == null) {
            return class174.field3151 == null || class174.field3151.field724 == this ? super.getDocumentBase() : class174.field3151.field724.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field307++;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    private final void method109(int arg0) {
        field279++;
        if (arg0 != 19098) {
            field300 = false;
        }
        long var2 = class217.method1351(90);
        long var4 = class116.field2093[class95.field1767];
        class116.field2093[class95.field1767] = var2;
        class95.field1767 = class95.field1767 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class93.field1737 = ((var6 >> 1) + 32000) / var6;
        }
        if (class91.field1664++ > 50) {
            class91.field1664 -= 50;
            class200.field3535 = true;
            class39.field798.setSize(class202.field3602, class36.field751);
            class39.field798.setVisible(true);
            if (class189.field3348 == null) {
                class39.field798.setLocation(0, 0);
            } else {
                Insets var7 = class189.field3348.getInsets();
                class39.field798.setLocation(var7.left, var7.top);
            }
        }
        this.method116(30);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZB)V")
    private final void method110(boolean arg0, byte arg1) {
        field305++;
        synchronized (this) {
            if (arg1 != -46) {
                this.windowIconified(null);
            }
            if (class174.field3149) {
                return;
            }
            class174.field3149 = true;
        }
        if (class174.field3151.field724 != null) {
            class174.field3151.field724.destroy();
        }
        if (class39.field798 != null) {
            try {
                class39.field798.removeFocusListener(this);
                Container var4;
                if (class189.field3348 == null) {
                    var4 = class174.field3151.field724;
                } else {
                    var4 = class189.field3348;
                }
                var4.remove(class39.field798);
            } catch (Exception var10) {
            }
        }
        try {
            this.method105(arg1 + 4223);
        } catch (Exception var9) {
        }
        if (class174.field3151 != null) {
            try {
                class174.field3151.method257(0);
            } catch (Exception var8) {
            }
        }
        this.method108((byte) 121);
        if (class189.field3348 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ba", name = "providesignlink", descriptor = "(Lda;)V")
    public static final void providesignlink(class35 arg0) {
        field304++;
        class174.field3151 = arg0;
        class188.field3335 = arg0;
    }

    @OriginalMember(owner = "client!ba", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field299++;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    private final synchronized void method111(int arg0) {
        Container var2;
        if (class189.field3348 == null) {
            var2 = class174.field3151.field724;
        } else {
            var2 = class189.field3348;
        }
        if (class39.field798 != null) {
            class39.field798.removeFocusListener(this);
            var2.remove(class39.field798);
        }
        field290++;
        class39.field798 = new class64(this);
        var2.add(class39.field798);
        class39.field798.setSize(class202.field3602, class36.field751);
        class39.field798.setVisible(true);
        if (class189.field3348 == null) {
            class39.field798.setLocation(0, 0);
        } else {
            Insets var3 = class189.field3348.getInsets();
            class39.field798.setLocation(var3.left, var3.top);
        }
        class39.field798.addFocusListener(this);
        class39.field798.requestFocus();
        class200.field3535 = true;
        if (arg0 > -64) {
            this.windowOpened(null);
        }
        field312 = class217.method1351(108);
    }

    @OriginalMember(owner = "client!ba", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field284++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public static final void method112(int arg0, int arg1, int arg2, int arg3) {
        class72 var4 = class95.field1776[arg0][arg1][arg2];
        if (var4 != null) {
            class95.field1776[arg0][arg1][arg2].field1402 = arg3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method113(int arg0) {
        if (arg0 != -7425) {
            field312 = 34L;
        }
        field291 = null;
        field310 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field302++;
        try {
            if (class229.field4068 == null) {
                class155.field2805 = arg1;
                class202.field3602 = arg0;
                class229.field4068 = this;
                class36.field751 = arg3;
                if (arg2 != 3) {
                    field296 = 74;
                }
                if (class174.field3151 == null) {
                    class188.field3335 = class174.field3151 = new class35(false, this, arg4, null, 0);
                }
                class174.field3151.method263(this, 1, false);
            } else {
                class132.field2420++;
                if (class132.field2420 >= 3) {
                    this.method103(4, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class123.method746(var7, null, -12134);
            this.method103(4, "crash");
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)I")
    public static final int method115(boolean arg0) {
        if (!arg0) {
            method102(57, null, null, null);
        }
        int var1 = 3;
        field287++;
        if (class37.field779 < 310) {
            int var2 = class181.field3267 >> 7;
            int var3 = class90.field1650 >> 7;
            if ((class122.field2191[class234.field4325][var3][var2] & 0x4) != 0) {
                var1 = class234.field4325;
            }
            int var4 = class228.field3975.field3976 >> 7;
            int var5 = class228.field3975.field4029 >> 7;
            int var6;
            if (var2 < var5) {
                var6 = var5 - var2;
            } else {
                var6 = var2 - var5;
            }
            int var7;
            if (var3 >= var4) {
                var7 = var3 - var4;
            } else {
                var7 = var4 - var3;
            }
            if (var7 <= var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var5) {
                    var9 += var8;
                    if (var2 < var5) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    if ((class122.field2191[class234.field4325][var3][var2] & 0x4) != 0) {
                        var1 = class234.field4325;
                    }
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var4 > var3) {
                            var3++;
                        } else if (var3 > var4) {
                            var3--;
                        }
                        if ((class122.field2191[class234.field4325][var3][var2] & 0x4) != 0) {
                            var1 = class234.field4325;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var4) {
                    var11 += var10;
                    if (var3 < var4) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    if ((class122.field2191[class234.field4325][var3][var2] & 0x4) != 0) {
                        var1 = class234.field4325;
                    }
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class122.field2191[class234.field4325][var3][var2] & 0x4) != 0) {
                            var1 = class234.field4325;
                        }
                    }
                }
            }
        }
        if ((class122.field2191[class234.field4325][class228.field3975.field3976 >> 7][class228.field3975.field4029 >> 7] & 0x4) != 0) {
            var1 = class234.field4325;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
    public abstract void method116(int arg0);

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
    public final void run() {
        field306++;
        try {
            if (class35.field715 != null) {
                String var1 = class35.field715.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class35.field726;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method103(4, "wrongjava");
                        return;
                    }
                    class181.field3277 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class35.field726 == null || class35.field726.equals("1.4.2"))) {
                    this.method103(4, "wrongjava");
                    return;
                }
            }
            if (class174.field3151.field724 != null) {
                Method var3 = class35.field720;
                if (var3 != null) {
                    try {
                        var3.invoke(class174.field3151.field724, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method111(-109);
            class215.field3764 = class78.method505((byte) 111, class36.field751, class39.field798, class202.field3602);
            this.method104(45);
            class57.field1140 = class57.method384(4);
            while (class164.field2965 == 0L || class164.field2965 > class217.method1351(85)) {
                class133.field2422 = class57.field1140.method320(class181.field3277, class44.field916, 123);
                for (int var4 = 0; var4 < class133.field2422; var4++) {
                    this.method117((byte) 125);
                }
                this.method109(19098);
                class121.method735(class39.field798, class174.field3151, 31047);
            }
        } catch (Exception var7) {
            class123.method746(var7, null, -12134);
            this.method103(4, "crash");
        }
        this.method110(true, (byte) -46);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    private final void method117(byte arg0) {
        field308++;
        long var2 = class217.method1351(-124);
        long var4 = class27.field578[class225.field3925];
        class27.field578[class225.field3925] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class225.field3925 = class225.field3925 + 1 & 0x1F;
        if (arg0 < 98) {
            this.method108((byte) -103);
        }
        synchronized (this) {
            class43.field879 = class205.field3636;
        }
        this.method106(false);
    }

    @OriginalMember(owner = "client!ba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field277++;
        if (class229.field4068 != this || class174.field3149) {
            return;
        }
        class200.field3535 = true;
        if (class35.field726 == null || !class35.field726.startsWith("1.5") || class217.method1351(-88) - field312 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        boolean var10000;
        if (var2 == null || var2.width >= class202.field3602 && class36.field751 <= var2.height) {
            var10000 = true;
        } else {
            var10000 = false;
        }
    }

    @OriginalMember(owner = "client!ba", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field275++;
    }
}
