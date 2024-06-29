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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class78 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    private boolean field1797 = false;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
    public static int[] field1819 = new int[256];

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lva;")
    public static class121 field1814 = class107.method797(" @yel@", -10983);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "[I")
    public static int[] field1804 = new int[50];

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lva;")
    private static class121 field1810 = class107.method797("World", -10983);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lva;")
    public static class121 field1795 = field1810;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Lva;")
    public static class121 field1827 = class107.method797("mapscene", -10983);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[Lva;")
    public static class121[] field1800 = new class121[5];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "Z")
    public static boolean field1833;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Z")
    public static boolean field1834;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    public static int[] field1828;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1819[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final void focusLost(FocusEvent arg0) {
        field1824++;
        class118.field2691 = false;
    }

    @OriginalMember(owner = "client!n", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 12)
    public final URL getCodeBase() {
        field1806++;
        if (class126.field2863 == null) {
            return class1.field18 == null || class1.field18.field2418 == this ? super.getCodeBase() : class1.field18.field2418.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 37)
    public final synchronized void method532(byte arg0) {
        System.out.println("addcanvas");
        field1809++;
        Container var2;
        if (class126.field2863 == null) {
            var2 = class1.field18.field2418;
        } else {
            var2 = class126.field2863;
        }
        if (arg0 != -33) {
            return;
        }
        if (class46.field1079 != null) {
            class46.field1079.removeFocusListener(this);
            var2.remove(class46.field1079);
        }
        class46.field1079 = new class20(this);
        var2.add(class46.field1079);
        class46.field1079.setSize(class42.field962, class63.field1537);
        class46.field1079.setVisible(true);
        if (class126.field2863 == null) {
            class46.field1079.setLocation(0, 0);
        } else {
            Insets var3 = class126.field2863.getInsets();
            class46.field1079.setLocation(var3.left, var3.top);
        }
        class46.field1079.addFocusListener(this);
        class46.field1079.requestFocus();
        class48.field1149 = true;
        class60.field1440 = false;
        class11.field180 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;IILjava/net/InetAddress;III)V", line = 81)
    public final void method533(int arg0, String arg1, int arg2, int arg3, InetAddress arg4, int arg5, int arg6, int arg7) {
        try {
            class63.field1537 = arg7;
            class116.field2637 = this;
            class67.field1613 = arg2;
            class42.field962 = arg0;
            int var9 = 54 / ((arg6 + 41) / 48);
            class126.field2863 = new Frame();
            class126.field2863.setTitle("Jagex");
            class126.field2863.setResizable(false);
            class126.field2863.addWindowListener(this);
            class126.field2863.setVisible(true);
            class126.field2863.toFront();
            Insets var10 = class126.field2863.getInsets();
            class126.field2863.setSize(var10.right + var10.left + arg0, arg7 - -var10.top - -var10.bottom);
            class92.field2085 = class1.field18 = new class105(true, null, arg4, arg5, arg1, arg3);
            class1.field18.method780(this, 0, 1);
        } catch (Exception var12) {
            class119.method920(true, null, var12);
        }
        field1802++;
    }

    @OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 116)
    public final void focusGained(FocusEvent arg0) {
        field1822++;
        class118.field2691 = true;
        class48.field1149 = true;
    }

    @OriginalMember(owner = "client!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 127)
    public final synchronized void paint(Graphics arg0) {
        field1808++;
        if (class116.field2637 != this || class40.field908) {
            return;
        }
        class48.field1149 = true;
        if (class105.field2406 == null || !class105.field2406.startsWith("1.5") || System.currentTimeMillis() - class11.field180 <= 1000L) {
            return;
        }
        Rectangle var2 = arg0.getClipBounds();
        if (var2 == null) {
            System.out.println("Rect: null");
        } else {
            System.out.println("Rect: " + var2.x + "," + var2.y + "," + var2.width + "," + var2.height);
        }
        if (var2 == null || class42.field962 <= var2.width && class63.field1537 <= var2.height) {
            class60.field1440 = true;
        }
    }

    @OriginalMember(owner = "client!n", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 157)
    public final void windowDeactivated(WindowEvent arg0) {
        field1811++;
    }

    @OriginalMember(owner = "client!n", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 168)
    public final void windowOpened(WindowEvent arg0) {
        field1794++;
    }

    @OriginalMember(owner = "client!n", name = "start", descriptor = "()V", line = 176)
    public final void start() {
        field1793++;
        if (class116.field2637 == this && !class40.field908) {
            class46.field1067 = 0L;
        }
    }

    @OriginalMember(owner = "client!n", name = "stop", descriptor = "()V", line = 187)
    public final void stop() {
        field1813++;
        if (class116.field2637 == this && !class40.field908) {
            class46.field1067 = System.currentTimeMillis() + 4000L;
        }
    }

    @OriginalMember(owner = "client!n", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 198)
    public final void windowDeiconified(WindowEvent arg0) {
        field1817++;
    }

    @OriginalMember(owner = "client!n", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 205)
    public final void windowClosed(WindowEvent arg0) {
        field1805++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 212)
    public final void method534(String arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field1816++;
        if (this.field1797) {
            return;
        }
        this.field1797 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!n", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 238)
    public final void windowClosing(WindowEvent arg0) {
        field1826++;
        this.destroy();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 246)
    private final void method535(int arg0) {
        field1818++;
        long var2 = System.currentTimeMillis();
        long var4 = class76.field1754[class61.field1484];
        boolean var10000;
        if ((long) arg0 == var4 || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class76.field1754[class61.field1484] = var2;
        class61.field1484 = class61.field1484 + 1 & 0x1F;
        synchronized (this) {
            class71.field1676 = class118.field2691;
        }
        this.method159((byte) -113);
    }

    @OriginalMember(owner = "client!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 280)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1799++;
    }

    @OriginalMember(owner = "client!n", name = "providesignlink", descriptor = "(Ls;)V", line = 292)
    public static final void providesignlink(class105 arg0) {
        class1.field18 = arg0;
        class92.field2085 = arg0;
        field1831++;
    }

    @OriginalMember(owner = "client!n", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 301)
    public final String getParameter(String arg0) {
        field1830++;
        if (class126.field2863 == null) {
            return class1.field18 == null || class1.field18.field2418 == this ? super.getParameter(arg0) : class1.field18.field2418.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Z", line = 317)
    public final boolean method536(int arg0) {
        if (arg0 != 32000) {
            this.method166(-56);
        }
        field1803++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.endsWith("jagex.com")) {
            return true;
        } else if (var2.endsWith("runescape.com")) {
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
                this.method534("invalidhost", arg0 ^ 0x7D01);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V", line = 349)
    public final void run() {
        field1820++;
        try {
            if (class105.field2404 != null) {
                String var1 = class105.field2404.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class105.field2406;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method534("wrongjava", 1);
                        return;
                    }
                    class16.field326 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class105.field2406 == null || class105.field2406.equals("1.4.2"))) {
                    this.method534("wrongjava", 1);
                    return;
                }
            }
            this.method532((byte) -33);
            class119.field2731 = class11.method86(class46.field1079, class63.field1537, class42.field962, false);
            this.method167((byte) 107);
            class69.field1657 = class95.method640((byte) 78);
            class69.field1657.method42(false);
            while (class46.field1067 == 0L || System.currentTimeMillis() < class46.field1067) {
                class58.field1345 = class69.field1657.method41(class16.field326, 9104, class8.field118);
                for (int var3 = 0; var3 < class58.field1345; var3++) {
                    this.method535(0);
                }
                this.method540((byte) 27);
            }
        } catch (Exception var5) {
            class119.method920(true, null, var5);
            this.method534("crash", 1);
        }
        this.method539(32000);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 414)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1801++;
        try {
            if (class116.field2637 == null) {
                class116.field2637 = this;
                class67.field1613 = arg3;
                class42.field962 = arg0;
                class63.field1537 = arg2;
                if (arg1 != 0) {
                    field1804 = null;
                }
                if (class1.field18 == null) {
                    class92.field2085 = class1.field18 = new class105(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg4, null, 0);
                }
                class1.field18.method780(this, arg1, 1);
            } else {
                this.method534("alreadyloaded", arg1 ^ 0x1);
            }
        } catch (Exception var7) {
            class119.method920(true, null, var7);
            this.method534("crash", 1);
        }
    }

    @OriginalMember(owner = "client!n", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 462)
    public final URL getDocumentBase() {
        field1829++;
        if (class126.field2863 == null) {
            return class1.field18 == null || class1.field18.field2418 == this ? super.getDocumentBase() : class1.field18.field2418.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V", line = 491)
    public static void method538(byte arg0) {
        if (arg0 != 116) {
            return;
        }
        field1828 = null;
        field1827 = null;
        field1800 = null;
        field1804 = null;
        field1819 = null;
        field1814 = null;
        field1795 = null;
        field1810 = null;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V", line = 509)
    private final synchronized void method539(int arg0) {
        field1821++;
        if (class40.field908) {
            return;
        }
        class40.field908 = true;
        try {
            class46.field1079.removeFocusListener(this);
            if (arg0 != 32000) {
                field1827 = null;
            }
        } catch (Exception var5) {
        }
        try {
            this.method160(9585);
        } catch (Exception var4) {
        }
        if (class126.field2863 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class1.field18 != null) {
            try {
                class1.field18.method778((byte) 109);
            } catch (Exception var2) {
            }
        }
        this.method166(0);
    }

    @OriginalMember(owner = "client!n", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 558)
    public final void windowActivated(WindowEvent arg0) {
        field1812++;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(B)V", line = 572)
    private final void method540(byte arg0) {
        field1798++;
        if (arg0 != 27) {
            return;
        }
        long var2 = System.currentTimeMillis();
        long var4 = class37.field872[class57.field1319];
        class37.field872[class57.field1319] = var2;
        class57.field1319 = class57.field1319 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class61.field1483 = ((var6 >> 1) + 32000) / var6;
        }
        if (class11.field181++ > 50) {
            class11.field181 -= 50;
            class48.field1149 = true;
            class46.field1079.setSize(class42.field962, class63.field1537);
            class46.field1079.setVisible(true);
            if (class126.field2863 == null) {
                class46.field1079.setLocation(0, 0);
            } else {
                Insets var7 = class126.field2863.getInsets();
                class46.field1079.setLocation(var7.left, var7.top);
            }
        }
        this.method163(-37);
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V", line = 620)
    public static final void method541(int arg0) {
        field1815++;
        class34.field816.method347(true);
        class50.field1172.method347(true);
        if (arg0 != -571) {
            method541(-52);
        }
    }

    @OriginalMember(owner = "client!n", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 636)
    public final AppletContext getAppletContext() {
        field1796++;
        if (class126.field2863 == null) {
            return class1.field18 == null || class1.field18.field2418 == this ? super.getAppletContext() : class1.field18.field2418.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "destroy", descriptor = "()V", line = 655)
    public final void destroy() {
        field1823++;
        if (class116.field2637 == this && !class40.field908) {
            class46.field1067 = System.currentTimeMillis();
            class113.method833(5000L, true);
            class92.field2085 = null;
            this.method539(32000);
        }
    }

    @OriginalMember(owner = "client!n", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 670)
    public final void windowIconified(WindowEvent arg0) {
        field1825++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public abstract void method160(int arg0);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!n", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public abstract void method167(byte arg0);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public abstract void method159(byte arg0);

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public abstract void method166(int arg0);
}
