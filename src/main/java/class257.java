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

@OriginalClass("client!rg")
public abstract class class257 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Z")
    private boolean field3739 = false;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3719 = 0;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3729 = "red:";

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lbc;")
    public static class282 field3709;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Z")
    public static boolean field3745;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "[Lwj;")
    public static class130[] field3725;

    @OriginalMember(owner = "client!rg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field3741++;
        if (class202.field2858 == null) {
            return class115.field1592 == null || class115.field1592.field664 == this ? super.getParameter(arg0) : class115.field1592.field664.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field3744++;
        class114.field1572 = false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public abstract void method1636(int arg0);

    @OriginalMember(owner = "client!rg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field3730++;
    }

    @OriginalMember(owner = "client!rg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field3718++;
    }

    @OriginalMember(owner = "client!rg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field3711++;
    }

    @OriginalMember(owner = "client!rg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field3712++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
    public final boolean method1637(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field3743++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            int var3 = 116 % ((28 - arg0) / 48);
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1647((byte) 90, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field3722++;
        if (class288.field4486 == this && !class145.field2110) {
            class200.field2846 = class86.method509(false);
            class247.method1595(5000L, (byte) -83);
            class136.field1981 = null;
            this.method1649((byte) -114, false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    private final void method1638(int arg0) {
        field3720++;
        long var2 = class86.method509(false);
        long var4 = class129.field1860[class49.field565];
        class129.field1860[class49.field565] = var2;
        class49.field565 = class49.field565 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class266.field3833 = ((var6 >> 1) + 32000) / var6;
        }
        if (class287.field4476++ > 50) {
            class26.field315 = true;
            class287.field4476 -= 50;
            class181.field2574.setSize(class84.field1166, client.field4437);
            class181.field2574.setVisible(true);
            if (class202.field2858 != null && class48.field553 == null) {
                Insets var7 = class202.field2858.getInsets();
                class181.field2574.setLocation(class30.field369 + var7.left, class45.field539 + var7.top);
            } else {
                class181.field2574.setLocation(class30.field369, class45.field539);
            }
        }
        if (arg0 != -22399) {
            this.method1639(-5);
        }
        this.method1639(arg0 ^ 0x5716);
    }

    @OriginalMember(owner = "client!rg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field3716++;
        if (class288.field4486 != this || class145.field2110) {
            return;
        }
        class26.field315 = true;
        if (class282.field4275 && (class86.method509(false) - class274.field4098) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class98.field1311 && var2.height >= class35.field404) {
                class107.field1443 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public abstract void method1639(int arg0);

    @OriginalMember(owner = "client!rg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field3733++;
        if (class202.field2858 == null) {
            return class115.field1592 == null || class115.field1592.field664 == this ? super.getAppletContext() : class115.field1592.field664.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public abstract void method1640(byte arg0);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public abstract void method1641(int arg0);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public final synchronized void method1642(byte arg0) {
        if (class181.field2574 != null) {
            class181.field2574.removeFocusListener(this);
            class181.field2574.getParent().remove(class181.field2574);
        }
        field3714++;
        Container var2;
        if (class48.field553 != null) {
            var2 = class48.field553;
        } else if (class202.field2858 == null) {
            var2 = class115.field1592.field664;
        } else {
            var2 = class202.field2858;
        }
        var2.setLayout((LayoutManager) null);
        class181.field2574 = new class75(this);
        var2.add(class181.field2574);
        class181.field2574.setSize(class84.field1166, client.field4437);
        class181.field2574.setVisible(true);
        if (class202.field2858 == var2) {
            Insets var3 = class202.field2858.getInsets();
            class181.field2574.setLocation(var3.left + class30.field369, var3.top - -class45.field539);
        } else {
            class181.field2574.setLocation(class30.field369, class45.field539);
        }
        class181.field2574.addFocusListener(this);
        int var4 = 58 % ((arg0 + 77) / 38);
        class181.field2574.requestFocus();
        class114.field1572 = true;
        class26.field315 = true;
        class82.field1140 = true;
        class107.field1443 = false;
        class274.field4098 = class86.method509(false);
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public static void method1643(int arg0) {
        int var1 = 94 / ((arg0 + 20) / 46);
        field3725 = null;
        field3729 = null;
        field3709 = null;
    }

    @OriginalMember(owner = "client!rg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field3708++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIII)V")
    public final void method1644(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3735++;
        try {
            if (class288.field4486 == null) {
                class84.field1166 = arg0;
                class98.field1311 = arg0;
                class30.field369 = 0;
                class15.field190 = arg3;
                class45.field539 = 0;
                if (arg1) {
                    this.windowOpened((WindowEvent) null);
                }
                class288.field4486 = this;
                client.field4437 = arg2;
                class35.field404 = arg2;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class115.field1592 == null) {
                    class136.field1981 = class115.field1592 = new class56(this, arg4, (String) null, 0);
                }
                class81 var7 = class115.field1592.method341(11569, 1, this);
                while (var7.field960 == 0) {
                    class247.method1595(10L, (byte) -83);
                }
            } else {
                class197.field2809++;
                if (class197.field2809 >= 3) {
                    this.method1647((byte) 90, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class142.method918(-1, var9, (String) null);
            this.method1647((byte) 90, "crash");
        }
    }

    @OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
    public final void run() {
        field3736++;
        try {
            if (class56.field653 != null) {
                String var1 = class56.field653.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class56.field668;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1647((byte) 90, "wrongjava");
                        return;
                    }
                    class209.field2942 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class56.field668 == null || class56.field668.equals("1.4.2"))) {
                    this.method1647((byte) 90, "wrongjava");
                    return;
                }
            }
            if (class56.field668 != null && class56.field668.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class56.field668.length() > var3) {
                    char var5 = class56.field668.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class282.field4275 = true;
                }
            }
            if (class115.field1592.field664 != null) {
                Method var6 = class56.field670;
                if (var6 != null) {
                    try {
                        var6.invoke(class115.field1592.field664, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class44.method281(false);
            this.method1642((byte) -23);
            class74.field890 = class30.method185(class181.field2574, -256, class84.field1166, client.field4437);
            this.method1641(80);
            class55.field648 = class129.method846(126);
            while (class200.field2846 == 0L || class200.field2846 > class86.method509(false)) {
                class33.field384 = class55.field648.method840(class209.field2942, class72.field867, 0);
                for (int var7 = 0; var7 < class33.field384; var7++) {
                    this.method1648((byte) -42);
                }
                this.method1638(-22399);
                class21.method126(32488, class181.field2574, class115.field1592);
            }
        } catch (Exception var10) {
            class142.method918(-1, var10, (String) null);
            this.method1647((byte) 90, "crash");
        }
        this.method1649((byte) -125, true);
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public abstract void method1645(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;ZBIIIII)V")
    public final void method1646(String arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class84.field1166 = arg5;
            class98.field1311 = arg5;
            class30.field369 = 0;
            if (arg2 != 100) {
                field3709 = null;
            }
            class45.field539 = 0;
            client.field4437 = arg3;
            class35.field404 = arg3;
            class15.field190 = arg4;
            class288.field4486 = this;
            class202.field2858 = new Frame();
            class202.field2858.setTitle("Jagex");
            class202.field2858.setResizable(true);
            class202.field2858.addWindowListener(this);
            class202.field2858.setVisible(true);
            class202.field2858.toFront();
            Insets var9 = class202.field2858.getInsets();
            class202.field2858.setSize(class98.field1311 + var9.left + var9.right, var9.top + var9.bottom + class35.field404);
            class136.field1981 = class115.field1592 = new class56((Applet) null, arg6, arg0, arg7);
            class81 var10 = class115.field1592.method341(11569, 1, this);
            while (var10.field960 == 0) {
                class247.method1595(10L, (byte) -83);
            }
        } catch (Exception var12) {
            class142.method918(-1, var12, (String) null);
        }
        field3724++;
    }

    @OriginalMember(owner = "client!rg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field3740++;
        if (class202.field2858 == null) {
            return class115.field1592 == null || class115.field1592.field664 == this ? super.getCodeBase() : class115.field1592.field664.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1647(byte arg0, String arg1) {
        field3732++;
        if (this.field3739 || arg0 != 90) {
            return;
        }
        this.field3739 = true;
        System.out.println("error_game_" + arg1);
        try {
            class208.method1328(-24232, class115.field1592.field664, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
    private final void method1648(byte arg0) {
        long var2 = class86.method509(false);
        long var4 = class107.field1446[class204.field2907];
        class107.field1446[class204.field2907] = var2;
        class204.field2907 = class204.field2907 + 1 & 0x1F;
        field3717++;
        synchronized (this) {
            class82.field1140 = class114.field1572;
        }
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        if (arg0 != -42) {
            field3713 = -40;
        }
        this.method1636(93);
    }

    @OriginalMember(owner = "client!rg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field3728++;
        if (class202.field2858 == null) {
            return class115.field1592 == null || class115.field1592.field664 == this ? super.getDocumentBase() : class115.field1592.field664.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "stop", descriptor = "()V")
    public final void stop() {
        field3742++;
        if (class288.field4486 == this && !class145.field2110) {
            class200.field2846 = class86.method509(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!rg", name = "start", descriptor = "()V")
    public final void start() {
        field3723++;
        if (class288.field4486 == this && !class145.field2110) {
            class200.field2846 = 0L;
        }
    }

    @OriginalMember(owner = "client!rg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field3731++;
    }

    @OriginalMember(owner = "client!rg", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!rg", name = "providesignlink", descriptor = "(Lsi;)V")
    public static final void providesignlink(class56 arg0) {
        field3710++;
        class115.field1592 = arg0;
        class136.field1981 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3738++;
        class114.field1572 = true;
        class26.field315 = true;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BZ)V")
    private final void method1649(byte arg0, boolean arg1) {
        field3715++;
        synchronized (this) {
            if (class145.field2110) {
                return;
            }
            class145.field2110 = true;
        }
        if (class115.field1592.field664 != null) {
            class115.field1592.field664.destroy();
        }
        try {
            if (arg0 >= -83) {
                field3709 = null;
            }
            this.method1640((byte) -14);
        } catch (Exception var9) {
        }
        if (class181.field2574 != null) {
            try {
                class181.field2574.removeFocusListener(this);
                class181.field2574.getParent().remove(class181.field2574);
            } catch (Exception var8) {
            }
        }
        if (class115.field1592 != null) {
            try {
                class115.field1592.method344((byte) -66);
            } catch (Exception var7) {
            }
        }
        this.method1645(-2);
        if (class202.field2858 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!rg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field3721++;
    }

    @OriginalMember(owner = "client!rg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field3726++;
        this.destroy();
    }
}
