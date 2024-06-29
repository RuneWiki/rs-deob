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

@OriginalClass("client!os")
public abstract class class387 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
    private boolean field5550 = false;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
    private boolean field5554 = false;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field5536 = 0;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Lhi;")
    public static class45 field5534 = new class45(0, 7);

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field5569 = 0;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "[I")
    public static int[] field5568 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "Ldk;")
    public static class421 field5570;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Lat;")
    public static class444 field5556;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "Lsp;")
    public static class514 field5572;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "Z")
    public static boolean field5573;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "Z")
    public static boolean field5577;

    @OriginalMember(owner = "client!os", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 5)
    public final void windowActivated(WindowEvent arg0) {
        field5562++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V", line = 12)
    public final void method2285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5553++;
        try {
            if (class33.field518 == null) {
                class74.field1046 = 0;
                class66.field953 = arg2;
                class233.field3246 = arg2;
                class122.field1894 = 0;
                class391.field5639 = arg1;
                class33.field518 = this;
                class348.field5033 = arg4;
                class389.field5618 = arg4;
                if (class346.field4985 == null) {
                    class56.field820 = class346.field4985 = new class173(this, arg0, null, 0);
                }
                class464 var6 = class346.field4985.method1182(this, (byte) -121, 1);
                while (var6.field6699 == 0) {
                    class334.method2047(10L, 0);
                }
                if (arg3 >= -67) {
                    this.getAppletContext();
                }
            } else {
                class120.field1875++;
                if (class120.field1875 >= 3) {
                    this.method2295("alreadyloaded", (byte) 42);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Throwable var8) {
            class187.method1255(var8, null, -71);
            this.method2295("crash", (byte) 42);
        }
    }

    @OriginalMember(owner = "client!os", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 64)
    public final void windowIconified(WindowEvent arg0) {
        field5547++;
    }

    @OriginalMember(owner = "client!os", name = "start", descriptor = "()V", line = 71)
    public final void start() {
        field5545++;
        if (class33.field518 == this && !class399.field5720) {
            class92.field1514 = 0L;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZ)V", line = 83)
    private final void method2287(boolean arg0, boolean arg1) {
        field5557++;
        synchronized (this) {
            if (class399.field5720) {
                return;
            }
            class399.field5720 = true;
        }
        if (class346.field4985.field2623 != null) {
            class346.field4985.field2623.destroy();
        }
        try {
            this.method2297(28502);
            if (arg0) {
                this.getAppletContext();
            }
        } catch (Exception var11) {
        }
        if (this.field5550) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field5550 = false;
        }
        class260.method1544(true, 10260);
        class464 var4 = class346.field4985.method1196(class33.field518.getClass(), 10);
        while (var4.field6699 == 0) {
            class334.method2047(100L, 0);
        }
        if (class415.field6025 != null) {
            try {
                class415.field6025.removeFocusListener(this);
                class415.field6025.getParent().remove(class415.field6025);
            } catch (Exception var9) {
            }
        }
        if (class346.field4985 != null) {
            try {
                class346.field4985.method1183(21230);
            } catch (Exception var8) {
            }
        }
        this.method2299((byte) 108);
        if (class391.field5642 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V", line = 168)
    public final void method2288(int arg0) {
        field5551++;
        if (!this.field5550) {
            try {
                class464 var2 = class346.field4985.method1190(class33.field518.getClass(), 69);
                while (var2.field6699 == 0) {
                    class334.method2047(100L, 0);
                }
                if (var2.field6695 != null) {
                    throw (Throwable) var2.field6695;
                }
                jagmisc.init();
                this.field5550 = true;
                class294.field3973 = class417.method2466(19648);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != 0) {
            this.field5554 = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V", line = 200)
    public final synchronized void method2289(int arg0) {
        field5552++;
        if (class415.field6025 != null) {
            class415.field6025.removeFocusListener(this);
            class415.field6025.getParent().remove(class415.field6025);
        }
        Container var2;
        if (class26.field358 != null) {
            var2 = class26.field358;
        } else if (class391.field5642 == null) {
            var2 = class346.field4985.field2623;
        } else {
            var2 = class391.field5642;
        }
        var2.setLayout(null);
        class415.field6025 = new class298(this);
        var2.add(class415.field6025);
        class415.field6025.setSize(class66.field953, class348.field5033);
        class415.field6025.setVisible(true);
        if (class391.field5642 == var2) {
            Insets var3 = class391.field5642.getInsets();
            class415.field6025.setLocation(class122.field1894 + var3.left, class74.field1046 + var3.top);
        } else {
            class415.field6025.setLocation(class122.field1894, class74.field1046);
        }
        class415.field6025.addFocusListener(this);
        if (arg0 != -28354) {
            field5536 = 31;
        }
        class415.field6025.requestFocus();
        class508.field7419 = true;
        class16.field254 = true;
        class77.field1095 = true;
        class169.field2573 = false;
        class301.field4110 = class254.method1522((byte) -51);
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V", line = 248)
    private final void method2290(int arg0) {
        field5561++;
        long var2 = class254.method1522((byte) -51);
        long var4 = class24.field334[class483.field6964];
        class24.field334[class483.field6964] = var2;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class244.field3350 = ((var6 >> 1) + 32000) / var6;
        }
        class483.field6964 = class483.field6964 + 1 & 0x1F;
        if (class384.field5513++ > 50) {
            class384.field5513 -= 50;
            class77.field1095 = true;
            class415.field6025.setSize(class66.field953, class348.field5033);
            class415.field6025.setVisible(true);
            if (class391.field5642 != null && class26.field358 == null) {
                Insets var7 = class391.field5642.getInsets();
                class415.field6025.setLocation(class122.field1894 + var7.left, class74.field1046 + var7.top);
            } else {
                class415.field6025.setLocation(class122.field1894, class74.field1046);
            }
        }
        this.method2293(70);
        if (arg0 != -4014) {
            field5566 = -70;
        }
    }

    @OriginalMember(owner = "client!os", name = "providesignlink", descriptor = "(Lor;)V", line = 294)
    public static final void providesignlink(class173 arg0) {
        field5548++;
        class346.field4985 = arg0;
        class56.field820 = arg0;
    }

    @OriginalMember(owner = "client!os", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 302)
    public final URL getDocumentBase() {
        field5537++;
        if (class391.field5642 == null) {
            return class346.field4985 == null || class346.field4985.field2623 == this ? super.getDocumentBase() : class346.field4985.field2623.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)Z", line = 321)
    public final boolean method2291(int arg0) {
        field5564++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != 0) {
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
                this.method2295("invalidhost", (byte) 42);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 357)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5565++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 366)
    public static void method2292(byte arg0) {
        field5568 = null;
        field5572 = null;
        field5570 = null;
        field5556 = null;
        field5534 = null;
        int var1 = -21 % ((85 - arg0) / 40);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)Z", line = 381)
    public static final boolean method2294(int arg0, int arg1, int arg2, int arg3) {
        if (!class491.method2908(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class295.field3991;
        int var5 = arg2 << class295.field3991;
        int var6 = class492.field7122[arg0].method85(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class295.field3991 - 7);
        int var8 = var6 - (0xE6 << class295.field3991 - 7);
        int var9 = var6 - (0xEE << class295.field3991 - 7);
        if (arg3 == 1) {
            if (var4 > class104.field1714) {
                if (!class24.method150(var4, var6, var5)) {
                    return false;
                }
                if (!class24.method150(var4, var6, class392.field5656 + var5)) {
                    return false;
                }
                if (!class24.method150(var4, var6, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class24.method150(var4, var7, var5)) {
                    return false;
                }
                if (!class24.method150(var4, var7, class392.field5656 + var5)) {
                    return false;
                }
                if (!class24.method150(var4, var7, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (!class24.method150(var4, var8, var5)) {
                return false;
            } else if (class24.method150(var4, var8, class392.field5656 + var5)) {
                return class24.method150(var4, var8, class117.field1845 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class257.field3495) {
                if (!class24.method150(var4, var6, class117.field1845 + var5)) {
                    return false;
                }
                if (!class24.method150(class392.field5656 + var4, var6, class117.field1845 + var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var6, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class24.method150(var4, var7, class117.field1845 + var5)) {
                    return false;
                }
                if (!class24.method150(class392.field5656 + var4, var7, class117.field1845 + var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var7, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (!class24.method150(var4, var8, class117.field1845 + var5)) {
                return false;
            } else if (class24.method150(class392.field5656 + var4, var8, class117.field1845 + var5)) {
                return class24.method150(class117.field1845 + var4, var8, class117.field1845 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class104.field1714) {
                if (!class24.method150(class117.field1845 + var4, var6, var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var6, class392.field5656 + var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var6, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class24.method150(class117.field1845 + var4, var7, var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var7, class392.field5656 + var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var7, class117.field1845 + var5)) {
                    return false;
                }
            }
            if (!class24.method150(class117.field1845 + var4, var8, var5)) {
                return false;
            } else if (class24.method150(class117.field1845 + var4, var8, class392.field5656 + var5)) {
                return class24.method150(class117.field1845 + var4, var8, class117.field1845 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class257.field3495) {
                if (!class24.method150(var4, var6, var5)) {
                    return false;
                }
                if (!class24.method150(class392.field5656 + var4, var6, var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class24.method150(var4, var7, var5)) {
                    return false;
                }
                if (!class24.method150(class392.field5656 + var4, var7, var5)) {
                    return false;
                }
                if (!class24.method150(class117.field1845 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class24.method150(var4, var8, var5)) {
                return false;
            } else if (class24.method150(class392.field5656 + var4, var8, var5)) {
                return class24.method150(class117.field1845 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class24.method150(class392.field5656 + var4, var9, class392.field5656 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class24.method150(var4, var8, class117.field1845 + var5);
        } else if (arg3 == 32) {
            return class24.method150(class117.field1845 + var4, var8, class117.field1845 + var5);
        } else if (arg3 == 64) {
            return class24.method150(class117.field1845 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class24.method150(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 598)
    public final void method2295(String arg0, byte arg1) {
        field5559++;
        if (this.field5554) {
            return;
        }
        this.field5554 = true;
        System.out.println("error_game_" + arg0);
        try {
            if (arg1 != 42) {
                field5536 = 11;
            }
            class344.method2077(false, "loggedout", class346.field4985.field2623);
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!os", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 624)
    public final void windowDeiconified(WindowEvent arg0) {
        field5540++;
    }

    @OriginalMember(owner = "client!os", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 632)
    public final void windowClosed(WindowEvent arg0) {
        field5560++;
    }

    @OriginalMember(owner = "client!os", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 639)
    public final void focusLost(FocusEvent arg0) {
        field5571++;
        class16.field254 = false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 647)
    public String method2296(boolean arg0) {
        if (arg0) {
            this.method2290(-101);
        }
        field5539++;
        return null;
    }

    @OriginalMember(owner = "client!os", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 661)
    public final String getParameter(String arg0) {
        field5549++;
        if (class391.field5642 == null) {
            return class346.field4985 == null || class346.field4985.field2623 == this ? super.getParameter(arg0) : class346.field4985.field2623.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "destroy", descriptor = "()V", line = 676)
    public final void destroy() {
        field5541++;
        if (class33.field518 == this && !class399.field5720) {
            class92.field1514 = class254.method1522((byte) -51);
            class334.method2047(5000L, 0);
            class56.field820 = null;
            this.method2287(false, false);
        }
    }

    @OriginalMember(owner = "client!os", name = "stop", descriptor = "()V", line = 692)
    public final void stop() {
        field5546++;
        if (class33.field518 == this && !class399.field5720) {
            class92.field1514 = class254.method1522((byte) -51) + 4000L;
        }
    }

    @OriginalMember(owner = "client!os", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 704)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5542++;
    }

    @OriginalMember(owner = "client!os", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 715)
    public final synchronized void paint(Graphics arg0) {
        field5535++;
        if (class33.field518 != this || class399.field5720) {
            return;
        }
        class77.field1095 = true;
        if (class209.field2995 && class254.method1522((byte) -51) - class301.field4110 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class233.field3246 && class389.field5618 <= var2.height) {
                class169.field2573 = true;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 736)
    public final void windowOpened(WindowEvent arg0) {
        field5533++;
    }

    @OriginalMember(owner = "client!os", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 750)
    public final void focusGained(FocusEvent arg0) {
        class16.field254 = true;
        field5538++;
        class77.field1095 = true;
    }

    @OriginalMember(owner = "client!os", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 761)
    public final void windowDeactivated(WindowEvent arg0) {
        field5563++;
    }

    @OriginalMember(owner = "client!os", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 772)
    public final URL getCodeBase() {
        field5567++;
        if (class391.field5642 == null) {
            return class346.field4985 == null || class346.field4985.field2623 == this ? super.getCodeBase() : class346.field4985.field2623.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 788)
    public final AppletContext getAppletContext() {
        field5543++;
        if (class391.field5642 == null) {
            return class346.field4985 == null || class346.field4985.field2623 == this ? super.getAppletContext() : class346.field4985.field2623.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ltn;)V", line = 815)
    public static final void method2300(class434 arg0) {
        for (int var1 = arg0.field6290; var1 <= arg0.field6288; var1++) {
            for (int var2 = arg0.field6277; var2 <= arg0.field6282; var2++) {
                class532 var3 = class103.field1632[arg0.field6279][var1][var2];
                if (var3 != null) {
                    class201 var4 = var3.field7828;
                    class201 var5 = null;
                    while (var4 != null) {
                        if (var4.field2915 == arg0) {
                            if (var5 == null) {
                                var3.field7828 = var4.field2918;
                            } else {
                                var5.field2918 = var4.field2918;
                            }
                            var4.method1307((byte) 83);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2918;
                    }
                    var3.field7826 = 0;
                    for (class201 var6 = var3.field7828; var6 != null; var6 = var6.field2918) {
                        var3.field7826 = (byte) (var3.field7826 | var6.field2917);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "run", descriptor = "()V", line = 870)
    public final void run() {
        try {
            label107: {
                if (class173.field2619 != null) {
                    String var1 = class173.field2619.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class173.field2620;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method2295("wrongjava", (byte) 42);
                            break label107;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class173.field2620 == null || class173.field2620.equals("1.4.2"))) {
                        this.method2295("wrongjava", (byte) 42);
                        break label107;
                    }
                }
                if (class173.field2620 != null && class173.field2620.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class173.field2620.length()) {
                        char var5 = class173.field2620.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var4 * 10 - (48 - var5);
                        var3++;
                    }
                    if (var4 >= 5) {
                        class209.field2995 = true;
                    }
                }
                if (class346.field4985.field2623 != null) {
                    Method var6 = class173.field2637;
                    if (var6 != null) {
                        try {
                            var6.invoke(class346.field4985.field2623, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class182.method1237((byte) -80);
                class520.method3098(true);
                this.method2289(-28354);
                this.method2288(0);
                this.method2286(115);
                class294.field3973 = class417.method2466(19648);
                this.method2288(0);
                while (class92.field1514 == 0L || class254.method1522((byte) -51) < class92.field1514) {
                    class278.field3778 = class294.field3973.method151((byte) -80, class135.field2054);
                    for (int var7 = 0; var7 < class278.field3778; var7++) {
                        this.method2302((byte) 69);
                    }
                    this.method2290(-4014);
                    class522.method3103(8, class346.field4985, class415.field6025);
                }
            }
        } catch (Throwable var10) {
            class187.method1255(var10, this.method2296(false), -128);
            this.method2295("crash", (byte) 42);
        }
        field5555++;
        this.method2287(false, true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V", line = 989)
    public final void method2301(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class348.field5033 = arg4;
            class389.field5618 = arg4;
            class122.field1894 = arg3;
            class391.field5639 = arg7;
            class74.field1046 = 0;
            class33.field518 = this;
            class66.field953 = arg0;
            class233.field3246 = arg0;
            class391.field5642 = new Frame();
            class391.field5642.setTitle("Jagex");
            class391.field5642.setResizable(true);
            class391.field5642.addWindowListener(this);
            class391.field5642.setVisible(true);
            class391.field5642.toFront();
            Insets var9 = class391.field5642.getInsets();
            class391.field5642.setSize(class233.field3246 + var9.left + var9.right, class389.field5618 + var9.top + var9.bottom);
            class56.field820 = class346.field4985 = new class173(null, arg2, arg6, arg5);
            class464 var10 = class346.field4985.method1182(this, (byte) -121, 1);
            while (var10.field6699 == 0) {
                class334.method2047(10L, 0);
            }
        } catch (Exception var12) {
            class187.method1255(var12, null, -21);
        }
        field5558++;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V", line = 1028)
    private final void method2302(byte arg0) {
        field5544++;
        if (arg0 != 69) {
            this.method2289(84);
        }
        long var2 = class254.method1522((byte) -51);
        long var4 = class266.field3582[class66.field956];
        class266.field3582[class66.field956] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class66.field956 = class66.field956 + 1 & 0x1F;
        synchronized (this) {
            class508.field7419 = class16.field254;
        }
        this.method2298((byte) -86);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public abstract void method2286(int arg0);

    @OriginalMember(owner = "client!os", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public abstract void method2293(int arg0);

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
    public abstract void method2297(int arg0);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    public abstract void method2298(byte arg0);

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
    public abstract void method2299(byte arg0);
}
