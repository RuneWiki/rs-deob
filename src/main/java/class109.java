import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.FontMetrics;
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

@OriginalClass("client!fi")
public abstract class class109 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Z")
    private boolean field1798 = false;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lka;")
    public static class253 field1794 = new class253(128);

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "[J")
    public static long[] field1823 = new long[256];

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "[I")
    public static int[] field1826;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Lak;")
    public static class137 field1825;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1827;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "Z")
    public static boolean field1830;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "Z")
    public static boolean field1831;

    @OriginalMember(owner = "client!fi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1811++;
        if (class153.field2656 == null) {
            return class118.field2117 == null || class118.field2117.field3473 == this ? super.getAppletContext() : class118.field2117.field3473.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1824++;
    }

    @OriginalMember(owner = "client!fi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1815++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public final synchronized void method762(boolean arg0) {
        if (class41.field707 != null) {
            class41.field707.removeFocusListener(this);
            class41.field707.getParent().remove(class41.field707);
        }
        field1819++;
        Container var2;
        if (class129.field2237 != null) {
            var2 = class129.field2237;
        } else if (class153.field2656 == null) {
            var2 = class118.field2117.field3473;
        } else {
            var2 = class153.field2656;
        }
        var2.setLayout((LayoutManager) null);
        class41.field707 = new class104(this);
        var2.add(class41.field707);
        class41.field707.setSize(class190.field3328, class103.field1724);
        class41.field707.setVisible(true);
        if (class153.field2656 == var2) {
            Insets var3 = class153.field2656.getInsets();
            class41.field707.setLocation(var3.left + class160.field2789, class35.field648 + var3.top);
        } else {
            class41.field707.setLocation(class160.field2789, class35.field648);
        }
        class41.field707.addFocusListener(this);
        class41.field707.requestFocus();
        class31.field578 = true;
        class227.field3926 = true;
        class14.field272 = true;
        class264.field4661 = arg0;
        class148.field2570 = class77.method569((byte) -115);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
    public static void method763(int arg0) {
        field1827 = null;
        field1794 = null;
        field1823 = null;
        field1825 = null;
        field1826 = null;
        if (arg0 != 31) {
            field1828 = -128;
        }
    }

    @OriginalMember(owner = "client!fi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1802++;
        class227.field3926 = true;
        class14.field272 = true;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public abstract void method764(boolean arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZIII)V")
    public final void method765(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1820++;
        try {
            if (class130.field2303 == null) {
                class130.field2303 = this;
                if (!arg1) {
                    field1825 = null;
                }
                class160.field2789 = 0;
                class40.field691 = arg3;
                class103.field1724 = arg4;
                class126.field2202 = arg4;
                class190.field3328 = arg2;
                class145.field2527 = arg2;
                class35.field648 = 0;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class118.field2117 == null) {
                    class252.field4409 = class118.field2117 = new class198(this, arg0, (String) null, 0);
                }
                class174 var7 = class118.field2117.method1361(this, 4, 1);
                while (var7.field3025 == 0) {
                    class159.method1130(10L, 0);
                }
            } else {
                class184.field3236++;
                if (class184.field3236 >= 3) {
                    this.method767("alreadyloaded", -7078);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class207.method1398((String) null, -62, var9);
            this.method767("crash", -7078);
        }
    }

    @OriginalMember(owner = "client!fi", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1813++;
        if (class130.field2303 == this && !class250.field4380) {
            class222.field3855 = class77.method569((byte) -122);
            class159.method1130(5000L, 0);
            class252.field4409 = null;
            this.method766(false, 48);
        }
    }

    @OriginalMember(owner = "client!fi", name = "stop", descriptor = "()V")
    public final void stop() {
        field1808++;
        if (class130.field2303 == this && !class250.field4380) {
            class222.field3855 = class77.method569((byte) -114) + 4000L;
        }
    }

    @OriginalMember(owner = "client!fi", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
    private final void method766(boolean arg0, int arg1) {
        if (arg1 != 48) {
            return;
        }
        field1800++;
        synchronized (this) {
            if (class250.field4380) {
                return;
            }
            class250.field4380 = true;
        }
        if (class118.field2117.field3473 != null) {
            class118.field2117.field3473.destroy();
        }
        try {
            this.method769((byte) -17);
        } catch (Exception var9) {
        }
        if (class41.field707 != null) {
            try {
                class41.field707.removeFocusListener(this);
                class41.field707.getParent().remove(class41.field707);
            } catch (Exception var8) {
            }
        }
        if (class118.field2117 != null) {
            try {
                class118.field2117.method1352(arg1 - 48);
            } catch (Exception var7) {
            }
        }
        this.method771(true);
        if (class153.field2656 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method767(String arg0, int arg1) {
        field1821++;
        if (arg1 != -7078 || this.field1798) {
            return;
        }
        this.field1798 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1817++;
    }

    @OriginalMember(owner = "client!fi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class227.field3926 = false;
        field1804++;
    }

    @OriginalMember(owner = "client!fi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1807++;
        if (class153.field2656 == null) {
            return class118.field2117 == null || class118.field2117.field3473 == this ? super.getCodeBase() : class118.field2117.field3473.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public abstract void method768(int arg0);

    @OriginalMember(owner = "client!fi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1801++;
        if (class153.field2656 == null) {
            return class118.field2117 == null || class118.field2117.field3473 == this ? super.getDocumentBase() : class118.field2117.field3473.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public abstract void method769(byte arg0);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
    public final boolean method770(int arg0) {
        field1812++;
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
            }
            if (arg0 > -62) {
                field1829 = 41;
            }
            this.method767("invalidhost", -7078);
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1814++;
        if (class130.field2303 != this || class250.field4380) {
            return;
        }
        class14.field272 = true;
        if (class157.field2743 && class77.method569((byte) 70) - class148.field2570 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class145.field2527 && class126.field2202 <= var2.height) {
                class264.field4661 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)V")
    public abstract void method771(boolean arg0);

    @OriginalMember(owner = "client!fi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1816++;
    }

    @OriginalMember(owner = "client!fi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1803++;
        if (class153.field2656 == null) {
            return class118.field2117 == null || class118.field2117.field3473 == this ? super.getParameter(arg0) : class118.field2117.field3473.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "start", descriptor = "()V")
    public final void start() {
        field1809++;
        if (class130.field2303 == this && !class250.field4380) {
            class222.field3855 = 0L;
        }
    }

    @OriginalMember(owner = "client!fi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1795++;
    }

    @OriginalMember(owner = "client!fi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1810++;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public abstract void method772(int arg0);

    @OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1793++;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
    private final void method773(int arg0) {
        field1818++;
        long var2 = class77.method569((byte) 13);
        if (arg0 > -33) {
            this.windowOpened((WindowEvent) null);
        }
        long var4 = class194.field3421[class29.field556];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class194.field3421[class29.field556] = var2;
        class29.field556 = class29.field556 + 1 & 0x1F;
        synchronized (this) {
            class31.field578 = class227.field3926;
        }
        this.method772(-128);
    }

    @OriginalMember(owner = "client!fi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1799++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
    private final void method774(byte arg0) {
        int var2 = 35 % ((-arg0 - 64) / 32);
        field1806++;
        long var3 = class228.field3954[class73.field1208];
        long var5 = class77.method569((byte) -7);
        class228.field3954[class73.field1208] = var5;
        class73.field1208 = class73.field1208 + 1 & 0x1F;
        if (var3 != 0L && var5 > var3) {
            int var7 = (int) (var5 - var3);
            class189.field3316 = ((var7 >> 1) + 32000) / var7;
        }
        if (class161.field2829++ > 50) {
            class161.field2829 -= 50;
            class14.field272 = true;
            class41.field707.setSize(class190.field3328, class103.field1724);
            class41.field707.setVisible(true);
            if (class153.field2656 != null && class129.field2237 == null) {
                Insets var8 = class153.field2656.getInsets();
                class41.field707.setLocation(class160.field2789 + var8.left, var8.top - -class35.field648);
            } else {
                class41.field707.setLocation(class160.field2789, class35.field648);
            }
        }
        this.method768(-21877);
    }

    @OriginalMember(owner = "client!fi", name = "run", descriptor = "()V")
    public final void run() {
        field1805++;
        try {
            if (class198.field3462 != null) {
                String var1 = class198.field3462.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class198.field3474;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method767("wrongjava", -7078);
                        return;
                    }
                    class76.field1254 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class198.field3474 == null || class198.field3474.equals("1.4.2"))) {
                    this.method767("wrongjava", -7078);
                    return;
                }
            }
            if (class198.field3474 != null && class198.field3474.startsWith("1.")) {
                int var3 = 0;
                for (int var4 = 2; class198.field3474.length() > var4; var4++) {
                    char var5 = class198.field3474.charAt(var4);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3 = var5 - (48 - var3 * 10);
                }
                if (var3 >= 5) {
                    class157.field2743 = true;
                }
            }
            if (class118.field2117.field3473 != null) {
                Method var6 = class198.field3475;
                if (var6 != null) {
                    try {
                        var6.invoke(class118.field2117.field3473, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class15.method117((byte) 106);
            this.method762(false);
            class152.field2629 = class200.method1374((byte) 111, class41.field707, class103.field1724, class190.field3328);
            this.method764(false);
            class103.field1721 = class255.method1724((byte) -114);
            while (class222.field3855 == 0L || class222.field3855 > class77.method569((byte) -126)) {
                class253.field4442 = class103.field1721.method101(71, class264.field4659, class76.field1254);
                for (int var7 = 0; var7 < class253.field4442; var7++) {
                    this.method773(-35);
                }
                this.method774((byte) -124);
                class245.method1664(class41.field707, class118.field2117, 8);
            }
        } catch (Exception var10) {
            class207.method1398((String) null, -22, var10);
            this.method767("crash", -7078);
        }
        this.method766(true, 48);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBZIILjava/lang/String;I)V")
    public final void method775(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, String arg6, int arg7) {
        field1822++;
        try {
            class103.field1724 = arg5;
            class126.field2202 = arg5;
            class130.field2303 = this;
            class40.field691 = arg4;
            class190.field3328 = arg0;
            class145.field2527 = arg0;
            if (arg2 != -74) {
                field1794 = null;
            }
            class160.field2789 = 0;
            class35.field648 = 0;
            class153.field2656 = new Frame();
            class153.field2656.setTitle("Jagex");
            class153.field2656.setResizable(true);
            class153.field2656.addWindowListener(this);
            class153.field2656.setVisible(true);
            class153.field2656.toFront();
            Insets var9 = class153.field2656.getInsets();
            class153.field2656.setSize(class145.field2527 + var9.right + var9.left, class126.field2202 + var9.top + var9.bottom);
            class252.field4409 = class118.field2117 = new class198((Applet) null, arg7, arg6, arg1);
            class174 var10 = class118.field2117.method1361(this, 4, 1);
            while (var10.field3025 == 0) {
                class159.method1130(10L, 0);
            }
        } catch (Exception var12) {
            class207.method1398((String) null, arg2 ^ 0x76, var12);
        }
    }

    @OriginalMember(owner = "client!fi", name = "providesignlink", descriptor = "(Lug;)V")
    public static final void providesignlink(class198 arg0) {
        field1792++;
        class118.field2117 = arg0;
        class252.field4409 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1823[var0] = var1;
        }
        field1826 = new int[2];
        field1828 = -1;
        field1829 = 1;
    }
}
