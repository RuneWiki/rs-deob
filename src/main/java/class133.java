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

@OriginalClass("client!be")
public abstract class class133 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Z")
    private boolean field1726 = false;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
    private boolean field1731 = false;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lnn;")
    public static class151 field1695 = new class151("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!be", name = "I", descriptor = "[I")
    public static int[] field1729 = new int[30];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Liq;")
    public static class134 field1727;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "Z")
    public static boolean field1732;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Z")
    public static boolean field1735;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Z")
    public static boolean field1736;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z")
    public final boolean method788(int arg0) {
        if (arg0 < 5) {
            return false;
        }
        field1725++;
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
                this.method802(27, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1704++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBILjava/lang/String;IIIZ)V")
    public final void method789(int arg0, byte arg1, int arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1716++;
        try {
            class221.field3368 = arg4;
            class71.field933 = arg4;
            class32.field411 = this;
            class145.field1980 = arg2;
            class161.field2232 = arg6;
            class204.field3063 = arg6;
            class184.field2777 = 0;
            class113.field1498 = 0;
            class143.field1914 = new Frame();
            class143.field1914.setTitle("Jagex");
            class143.field1914.setResizable(true);
            class143.field1914.addWindowListener(this);
            class143.field1914.setVisible(true);
            class143.field1914.toFront();
            Insets var9 = class143.field1914.getInsets();
            class143.field1914.setSize(class71.field933 + var9.left + var9.right, class204.field3063 - -var9.top - -var9.bottom);
            class364.field5351 = class79.field1043 = new class239((Applet) null, arg0, arg3, arg5);
            class211 var10 = class79.field1043.method1438(false, 1, this);
            while (var10.field3172 == 0) {
                class109.method674((byte) 99, 10L);
            }
            if (arg1 > -85) {
                this.init();
            }
        } catch (Exception var12) {
            class288.method1783((String) null, var12, -5);
        }
    }

    @OriginalMember(owner = "client!be", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1706++;
        if (class32.field411 != this || class312.field4703) {
            return;
        }
        class207.field3094 = true;
        if (class162.field2246 && (class445.method2750(-27580) - class335.field4984) > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class71.field933 && class204.field3063 <= var2.height) {
                class57.field758 = true;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
    public static final void method790(int[] arg0, Object[] arg1, int arg2) {
        field1712++;
        class435.method2674(arg2, arg0.length - 1, arg0, arg1, 2);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public abstract void method791(int arg0);

    @OriginalMember(owner = "client!be", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1702++;
    }

    @OriginalMember(owner = "client!be", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!be", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class303.field4579 = true;
        field1720++;
        class207.field3094 = true;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    private final void method792(int arg0) {
        field1728++;
        long var2 = class445.method2750(-27580);
        long var4 = class320.field4835[class134.field1778];
        class320.field4835[class134.field1778] = var2;
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class134.field1778 = class134.field1778 + 1 & 0x1F;
        synchronized (this) {
            class351.field5211 = class303.field4579;
        }
        if (arg0 == -16098) {
            this.method800((byte) 80);
        }
    }

    @OriginalMember(owner = "client!be", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1724++;
        if (class143.field1914 == null) {
            return class79.field1043 == null || class79.field1043.field3583 == this ? super.getAppletContext() : class79.field1043.field3583.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method793(boolean arg0) {
        if (!arg0) {
            method803(-87, 88);
        }
        field1727 = null;
        field1729 = null;
        field1695 = null;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public abstract void method794(int arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public final synchronized void method795(byte arg0) {
        if (class170.field2631 != null) {
            class170.field2631.removeFocusListener(this);
            class170.field2631.getParent().remove(class170.field2631);
        }
        field1698++;
        Container var2;
        if (class90.field1277 != null) {
            var2 = class90.field1277;
        } else if (class143.field1914 == null) {
            var2 = class79.field1043.field3583;
        } else {
            var2 = class143.field1914;
        }
        var2.setLayout((LayoutManager) null);
        class170.field2631 = new class36(this);
        var2.add(class170.field2631);
        class170.field2631.setSize(class221.field3368, class161.field2232);
        class170.field2631.setVisible(true);
        if (arg0 >= -31) {
            this.destroy();
        }
        if (class143.field1914 == var2) {
            Insets var3 = class143.field1914.getInsets();
            class170.field2631.setLocation(class184.field2777 + var3.left, class113.field1498 + var3.top);
        } else {
            class170.field2631.setLocation(class184.field2777, class113.field1498);
        }
        class170.field2631.addFocusListener(this);
        class170.field2631.requestFocus();
        class351.field5211 = true;
        class303.field4579 = true;
        class207.field3094 = true;
        class57.field758 = false;
        class335.field4984 = class445.method2750(-27580);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
    private final void method796(byte arg0, boolean arg1) {
        field1708++;
        synchronized (this) {
            if (arg0 != -103) {
                field1729 = null;
            }
            if (class312.field4703) {
                return;
            }
            class312.field4703 = true;
        }
        if (class79.field1043.field3583 != null) {
            class79.field1043.field3583.destroy();
        }
        try {
            this.method798(-109);
        } catch (Exception var11) {
        }
        if (this.field1726) {
            try {
                jagmisc.quit();
            } catch (Throwable var10) {
            }
            this.field1726 = false;
        }
        class211 var4 = class79.field1043.method1440((byte) 85, class32.field411.getClass());
        while (var4.field3172 == 0) {
            class109.method674((byte) 99, 100L);
        }
        if (class170.field2631 != null) {
            try {
                class170.field2631.removeFocusListener(this);
                class170.field2631.getParent().remove(class170.field2631);
            } catch (Exception var9) {
            }
        }
        if (class79.field1043 != null) {
            try {
                class79.field1043.method1459(0);
            } catch (Exception var8) {
            }
        }
        this.method794(arg0 + 230);
        if (class143.field1914 != null) {
            try {
                System.exit(0);
            } catch (Throwable var7) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public final void method797(byte arg0) {
        field1718++;
        if (!this.field1726) {
            try {
                class211 var2 = class79.field1043.method1452(class32.field411.getClass(), 0);
                while (var2.field3172 == 0) {
                    class109.method674((byte) 99, 100L);
                }
                if (var2.field3175 != null) {
                    throw (Throwable) var2.field3175;
                }
                jagmisc.init();
                this.field1726 = true;
                class37.field452 = class183.method1116(21671);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -85) {
            this.stop();
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public abstract void method798(int arg0);

    @OriginalMember(owner = "client!be", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1699++;
    }

    @OriginalMember(owner = "client!be", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1722++;
    }

    @OriginalMember(owner = "client!be", name = "run", descriptor = "()V")
    public final void run() {
        try {
            label107: {
                if (class239.field3575 != null) {
                    String var1 = class239.field3575.toLowerCase();
                    if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                        String var2 = class239.field3571;
                        if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                            this.method802(46, "wrongjava");
                            break label107;
                        }
                    } else if (var1.indexOf("ibm") != -1 && (class239.field3571 == null || class239.field3571.equals("1.4.2"))) {
                        this.method802(43, "wrongjava");
                        break label107;
                    }
                }
                if (class239.field3571 != null && class239.field3571.startsWith("1.")) {
                    int var3 = 2;
                    int var4 = 0;
                    while (var3 < class239.field3571.length()) {
                        char var5 = class239.field3571.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var3++;
                        var4 = var4 * 10 + var5 - 48;
                    }
                    if (var4 >= 5) {
                        class162.field2246 = true;
                    }
                }
                if (class79.field1043.field3583 != null) {
                    Method var6 = class239.field3592;
                    if (var6 != null) {
                        try {
                            var6.invoke(class79.field1043.field3583, Boolean.TRUE);
                        } catch (Throwable var9) {
                        }
                    }
                }
                class426.method2624(-116);
                class313.method1913(131072);
                this.method795((byte) -49);
                this.method791(0);
                class37.field452 = class183.method1116(21671);
                this.method797((byte) -85);
                while (class334.field4980 == 0L || class334.field4980 > class445.method2750(-27580)) {
                    class80.field1051 = class37.field452.method151(-34, class422.field6216);
                    for (int var7 = 0; var7 < class80.field1051; var7++) {
                        this.method792(-16098);
                    }
                    this.method804(89);
                    class363.method2182((byte) 125, class170.field2631, class79.field1043);
                }
            }
        } catch (Exception var10) {
            class288.method1783((String) null, var10, 120);
            this.method802(18, "crash");
        }
        field1696++;
        this.method796((byte) -103, true);
    }

    @OriginalMember(owner = "client!be", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1701++;
        if (class143.field1914 == null) {
            return class79.field1043 == null || class79.field1043.field3583 == this ? super.getParameter(arg0) : class79.field1043.field3583.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Lmr;")
    public static final class145 method799(int arg0, int arg1, int arg2, int arg3) {
        field1700++;
        class13 var4 = class277.field4216[arg1][arg0][arg2];
        if (var4 == null) {
            return null;
        }
        class145 var5 = null;
        int var6 = -1;
        if (arg3 != 1) {
            method793(true);
        }
        for (class466 var7 = var4.field151; var7 != null; var7 = var7.field6853) {
            class141 var8 = var7.field6862;
            if (var8 instanceof class145) {
                class145 var9 = (class145) var8;
                int var10 = (var9.method911(0) - 1) * 64 + 60;
                int var11 = var9.field1900 - var10 >> 7;
                int var12 = var9.field1892 - var10 >> 7;
                int var13 = var9.field1900 + var10 >> 7;
                int var14 = var9.field1892 + var10 >> 7;
                if (arg0 >= var11 && var12 <= arg2 && arg0 <= var13 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg0);
                    if (var6 < var15) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "start", descriptor = "()V")
    public final void start() {
        field1715++;
        if (class32.field411 == this && !class312.field4703) {
            class334.field4980 = 0L;
        }
    }

    @OriginalMember(owner = "client!be", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1709++;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public abstract void method800(byte arg0);

    @OriginalMember(owner = "client!be", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1703++;
    }

    @OriginalMember(owner = "client!be", name = "stop", descriptor = "()V")
    public final void stop() {
        field1713++;
        if (class32.field411 == this && !class312.field4703) {
            class334.field4980 = class445.method2750(-27580) + 4000L;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
    public abstract void method801(byte arg0);

    @OriginalMember(owner = "client!be", name = "providesignlink", descriptor = "(Lsc;)V")
    public static final void providesignlink(class239 arg0) {
        field1723++;
        class79.field1043 = arg0;
        class364.field5351 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method802(int arg0, String arg1) {
        field1711++;
        if (this.field1731 || arg0 < 2) {
            return;
        }
        this.field1731 = true;
        System.out.println("error_game_" + arg1);
        try {
            class232.method1404(class79.field1043.field3583, 79, "loggedout");
        } catch (Throwable var4) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!be", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1717++;
        if (class32.field411 == this && !class312.field4703) {
            class334.field4980 = class445.method2750(-27580);
            class109.method674((byte) 99, 5000L);
            class364.field5351 = null;
            this.method796((byte) -103, false);
        }
    }

    @OriginalMember(owner = "client!be", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1721++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method803(int arg0, int arg1) {
        field1710++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 == -12131) {
            class25.field325 = arg0;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    private final void method804(int arg0) {
        field1730++;
        long var2 = class445.method2750(-27580);
        long var4 = class57.field765[class281.field4302];
        class57.field765[class281.field4302] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class388.field5733 = ((var6 >> 1) + 32000) / var6;
        }
        class281.field4302 = class281.field4302 + 1 & 0x1F;
        if (arg0 <= 54) {
            this.method798(76);
        }
        if (class334.field4981++ > 50) {
            class207.field3094 = true;
            class334.field4981 -= 50;
            class170.field2631.setSize(class221.field3368, class161.field2232);
            class170.field2631.setVisible(true);
            if (class143.field1914 != null && class90.field1277 == null) {
                Insets var7 = class143.field1914.getInsets();
                class170.field2631.setLocation(class184.field2777 + var7.left, class113.field1498 + var7.top);
            } else {
                class170.field2631.setLocation(class184.field2777, class113.field1498);
            }
        }
        this.method801((byte) 120);
    }

    @OriginalMember(owner = "client!be", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1697++;
        if (class143.field1914 == null) {
            return class79.field1043 == null || class79.field1043.field3583 == this ? super.getCodeBase() : class79.field1043.field3583.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1705++;
    }

    @OriginalMember(owner = "client!be", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1719++;
        class303.field4579 = false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIII)V")
    public final void method805(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -103) {
            this.field1726 = true;
        }
        field1714++;
        try {
            if (class32.field411 == null) {
                class221.field3368 = arg2;
                class71.field933 = arg2;
                class184.field2777 = 0;
                class145.field1980 = arg4;
                class161.field2232 = arg3;
                class204.field3063 = arg3;
                class32.field411 = this;
                class113.field1498 = 0;
                if (class79.field1043 == null) {
                    class364.field5351 = class79.field1043 = new class239(this, arg0, (String) null, 0);
                }
                class211 var6 = class79.field1043.method1438(false, 1, this);
                while (var6.field3172 == 0) {
                    class109.method674((byte) 99, 10L);
                }
            } else {
                class379.field5525++;
                if (class379.field5525 >= 3) {
                    this.method802(125, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class288.method1783((String) null, var8, 126);
            this.method802(39, "crash");
        }
    }

    @OriginalMember(owner = "client!be", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1707++;
        if (class143.field1914 == null) {
            return class79.field1043 == null || class79.field1043.field3583 == this ? super.getDocumentBase() : class79.field1043.field3583.getDocumentBase();
        } else {
            return null;
        }
    }
}
