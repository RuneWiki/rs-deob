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

@OriginalClass("client!lc")
public abstract class class79 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "Z")
    private boolean field1725 = false;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1703 = 1;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lje;")
    private static class67 field1718 = class85.method592(255, "Login server offline)3");

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lje;")
    public static class67 field1713 = field1718;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Lje;")
    private static class67 field1742 = class85.method592(255, "glow1:");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lje;")
    public static class67 field1706 = field1742;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lje;")
    public static class67 field1701 = field1742;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Luf;")
    public static class145 field1705 = new class145(32);

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "[I")
    public static int[] field1743 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "Lje;")
    public static class67 field1744 = class85.method592(255, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "Lob;")
    public static class99 field1746 = new class99(64);

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Lje;")
    public static class67 field1749 = class85.method592(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
    public static int[] field1751 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "Z")
    public static boolean field1750 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
    public static boolean field1752;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "[[[B")
    public static byte[][][] field1745;

    @OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class80.field1782 = false;
        field1717++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public abstract void method147(byte arg0);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            if (arg2 < 39) {
                return;
            }
            class107.field2456 = arg5;
            class17.field305 = arg3;
            class126.field2769 = this;
            class155.field3537 = arg6;
            class27.field489 = new Frame();
            class27.field489.setTitle("Jagex");
            class27.field489.setResizable(false);
            class27.field489.addWindowListener(this);
            class27.field489.setVisible(true);
            class27.field489.toFront();
            Insets var8 = class27.field489.getInsets();
            class27.field489.setSize(arg5 + var8.left + var8.right, var8.top + var8.bottom + arg3);
            class159.field3647 = class154.field3519 = new class111(true, null, arg1, arg4, arg0);
            class154.field3519.method875(1, this, 2);
        } catch (Exception var10) {
            class112.method887(-32453, var10, null);
        }
        field1704++;
    }

    @OriginalMember(owner = "client!lc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1741++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLfd;Lfd;I)Lmc;")
    public static final class86 method557(int arg0, boolean arg1, class40 arg2, class40 arg3, int arg4) {
        field1740++;
        boolean var5 = true;
        int[] var6 = arg3.method265(arg0, (byte) 116);
        int var7 = 0;
        if (arg4 != -6926) {
            field1713 = null;
        }
        while (var6.length > var7) {
            byte[] var8 = arg3.method258(arg0, var6[var7], (byte) -88);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method258(0, var9, (byte) -88);
                } else {
                    var10 = arg2.method258(var9, 0, (byte) -88);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class86(arg3, arg2, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class80.field1782 = true;
        field1728++;
        class9.field210 = true;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    private final void method558(int arg0) {
        field1711++;
        long var2 = class150.method1148(arg0 - 85822885);
        long var4 = class38.field679[class117.field2647];
        class38.field679[class117.field2647] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class117.field2647 = class117.field2647 + 1 & 0x1F;
        if (arg0 == 14540) {
            synchronized (this) {
                class140.field3152 = class80.field1782;
            }
            this.method143(-3);
        }
    }

    @OriginalMember(owner = "client!lc", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!lc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1702++;
    }

    @OriginalMember(owner = "client!lc", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1715++;
        if (class126.field2769 == this && !class155.field3526) {
            class61.field1219 = class150.method1148(-85808345);
            class104.method822(-128, 5000L);
            class159.field3647 = null;
            this.method569(false);
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1722++;
    }

    @OriginalMember(owner = "client!lc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1724++;
        if (class27.field489 == null) {
            return class154.field3519 == null || class154.field3519.field2500 == this ? super.getAppletContext() : class154.field3519.field2500.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static void method559(byte arg0) {
        field1746 = null;
        field1751 = null;
        field1745 = null;
        field1706 = null;
        field1743 = null;
        field1744 = null;
        if (arg0 != 127) {
            field1705 = null;
        }
        field1713 = null;
        field1718 = null;
        field1701 = null;
        field1742 = null;
        field1705 = null;
        field1749 = null;
    }

    @OriginalMember(owner = "client!lc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1698++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lkc;ZI)V")
    public static final void method560(class72[] arg0, boolean arg1, int arg2) {
        field1721++;
        if (!arg1) {
            method562(-4, 80);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class72 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1546 == 0) {
                    if (var4.field1494 != null) {
                        method560(var4.field1494, arg1, arg2);
                    }
                    class60 var5 = (class60) class76.field1634.method1119(28254, (long) var4.field1508);
                    if (var5 != null) {
                        class91.method636(arg2, var5.field1201, -7771);
                    }
                }
                if (arg2 == 0 && var4.field1532 != null) {
                    class35 var6 = new class35();
                    var6.field630 = var4.field1532;
                    var6.field640 = var4;
                    class71.method513((byte) -118, var6);
                }
                if (arg2 == 1 && var4.field1514 != null) {
                    if (var4.field1540 >= 0) {
                        class72 var7 = class67.method467((byte) -13, var4.field1508);
                        if (var7 == null || var7.field1494 == null || var7.field1494.length <= var4.field1540 || var7.field1494[var4.field1540] != var4) {
                            continue;
                        }
                    }
                    class35 var8 = new class35();
                    var8.field640 = var4;
                    var8.field630 = var4.field1514;
                    class71.method513((byte) 120, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1734++;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public abstract void method143(int arg0);

    @OriginalMember(owner = "client!lc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1736++;
        if (class126.field2769 != this || class155.field3526) {
            return;
        }
        class9.field210 = true;
        if (class111.field2504 != null && class111.field2504.startsWith("1.5") && class150.method1148(-85808345) - class141.field3183 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class107.field2456 <= var2.width && var2.height >= class17.field305) {
                class152.field3492 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public final void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1699++;
        try {
            if (class126.field2769 == null) {
                class17.field305 = arg4;
                class155.field3537 = arg1;
                class107.field2456 = arg2;
                class126.field2769 = this;
                if (class154.field3519 == null) {
                    class159.field3647 = class154.field3519 = new class111(false, this, arg0, null, 0);
                }
                if (arg3 >= -44) {
                    this.method146(41);
                }
                class154.field3519.method875(1, this, 2);
            } else {
                class68.field1380++;
                if (class68.field1380 >= 3) {
                    this.method570((byte) -89, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class112.method887(-32453, var7, null);
            this.method570((byte) -89, "crash");
        }
    }

    @OriginalMember(owner = "client!lc", name = "start", descriptor = "()V")
    public final void start() {
        field1732++;
        if (class126.field2769 == this && !class155.field3526) {
            class61.field1219 = 0L;
        }
    }

    @OriginalMember(owner = "client!lc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1737++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
    public static final boolean method562(int arg0, int arg1) {
        int var2 = 58 % ((arg1 - 58) / 53);
        field1733++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
    public abstract void method146(int arg0);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!lc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1707++;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public abstract void method148(byte arg0);

    @OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
    public final void run() {
        field1710++;
        try {
            if (class111.field2506 != null) {
                String var1 = class111.field2506.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class111.field2504;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method570((byte) -89, "wrongjava");
                        return;
                    }
                    class50.field960 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class111.field2504 == null || class111.field2504.equals("1.4.2"))) {
                    this.method570((byte) -89, "wrongjava");
                    return;
                }
            }
            if (class154.field3519.field2500 != null) {
                Method var3 = class111.field2510;
                if (var3 != null) {
                    try {
                        var3.invoke(class154.field3519.field2500, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method567(125);
            class81.field1792 = class114.method926(class17.field305, (byte) 112, class98.field2193, class107.field2456);
            this.method148((byte) -89);
            class126.field2774 = class55.method386(256);
            while (class61.field1219 == 0L || class150.method1148(-85808345) < class61.field1219) {
                class27.field500 = class126.field2774.method175((byte) 36, class95.field2135, class50.field960);
                for (int var4 = 0; var4 < class27.field500; var4++) {
                    this.method558(14540);
                }
                this.method565(-110);
                class60.method418(class98.field2193, 9, class154.field3519);
            }
        } catch (Exception var7) {
            class112.method887(-32453, var7, null);
            this.method570((byte) -89, "crash");
        }
        this.method569(false);
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
    public final boolean method563(int arg0) {
        field1708++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        int var3 = -45 / ((arg0 - 51) / 48);
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
                this.method570((byte) -89, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1719++;
        if (class27.field489 == null) {
            return class154.field3519 == null || class154.field3519.field2500 == this ? super.getParameter(arg0) : class154.field3519.field2500.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "providesignlink", descriptor = "(Lq;)V")
    public static final void providesignlink(class111 arg0) {
        class154.field3519 = arg0;
        class159.field3647 = arg0;
        field1723++;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public static final void method564(int arg0) {
        field1730++;
        if (!class12.field222) {
            class101.field2267[0] = 1005;
            class55.field1095[0] = class75.field1626;
            class69.field1419 = 1;
            class31.field543[0] = class52.field1030;
        }
        if (class112.field2519 != -1) {
            class143.method1105(111, class112.field2519);
        }
        int var1 = -4 / ((arg0 + 8) / 60);
        for (int var2 = 0; var2 < class86.field1918; var2++) {
            if (class80.field1774[var2]) {
                class103.field2301[var2] = true;
            }
            class61.field1220[var2] = class80.field1774[var2];
            class80.field1774[var2] = false;
        }
        class152.field3482 = class34.field627;
        class133.field3003 = -1;
        class26.field466 = -1;
        class122.field2734 = null;
        if (class112.field2519 != -1) {
            class86.field1918 = 0;
            class148.method1141(0, class112.field2519, 0, -1, 0, (byte) -60, 0, 765, 503);
        }
        class8.method64();
        class45.method293((byte) -87);
        if (class12.field222) {
            class128.method978((byte) 38);
        } else if (class26.field466 != -1) {
            class92.method677(class133.field3003, (byte) -111, class26.field466);
        }
        if (field1739 == 3) {
            for (int var3 = 0; var3 < class86.field1918; var3++) {
                if (class61.field1220[var3]) {
                    class8.method74(class75.field1625[var3], class30.field540[var3], class56.field1114[var3], class141.field3228[var3], 16711935, 128);
                } else if (class103.field2301[var3]) {
                    class8.method74(class75.field1625[var3], class30.field540[var3], class56.field1114[var3], class141.field3228[var3], 16711680, 128);
                }
            }
        }
        class93.method681(class37.field667.field2957, class37.field667.field2963, class60.field1204, (byte) -88, class128.field2817);
        class60.field1204 = 0;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    private final void method565(int arg0) {
        field1712++;
        long var2 = class37.field676[class135.field3060];
        long var4 = class150.method1148(-85808345);
        if (arg0 >= -109) {
            return;
        }
        class37.field676[class135.field3060] = var4;
        class135.field3060 = class135.field3060 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            field1748 = ((var6 >> 1) + 32000) / var6;
        }
        if (class155.field3527++ > 50) {
            class155.field3527 -= 50;
            class9.field210 = true;
            class98.field2193.setSize(class107.field2456, class17.field305);
            class98.field2193.setVisible(true);
            if (class27.field489 == null) {
                class98.field2193.setLocation(0, 0);
            } else {
                Insets var7 = class27.field489.getInsets();
                class98.field2193.setLocation(var7.left, var7.top);
            }
        }
        this.method146(1000);
    }

    @OriginalMember(owner = "client!lc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1714++;
        if (class27.field489 == null) {
            return class154.field3519 == null || class154.field3519.field2500 == this ? super.getDocumentBase() : class154.field3519.field2500.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)Lue;")
    public static final class144 method566(int arg0, boolean arg1) {
        field1735++;
        class144 var2 = (class144) class118.field2657.method764((long) arg0, 24182);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class107.field2455.method267((byte) -124, arg0, 13);
        class144 var4 = new class144();
        var4.field3297 = arg0;
        if (var3 != null) {
            var4.method1114(6841, new class91(var3));
        }
        class118.field2657.method765((long) arg0, var4, (byte) -74);
        if (arg1) {
            field1748 = 93;
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
    public final synchronized void method567(int arg0) {
        field1726++;
        Container var2;
        if (class27.field489 == null) {
            var2 = class154.field3519.field2500;
        } else {
            var2 = class27.field489;
        }
        if (class98.field2193 != null) {
            class98.field2193.removeFocusListener(this);
            var2.remove(class98.field2193);
        }
        if (arg0 < 81) {
            return;
        }
        class98.field2193 = new class46(this);
        var2.add(class98.field2193);
        class98.field2193.setSize(class107.field2456, class17.field305);
        class98.field2193.setVisible(true);
        if (class27.field489 == null) {
            class98.field2193.setLocation(0, 0);
        } else {
            Insets var3 = class27.field489.getInsets();
            class98.field2193.setLocation(var3.left, var3.top);
        }
        class98.field2193.addFocusListener(this);
        class98.field2193.requestFocus();
        class9.field210 = true;
        class152.field3492 = false;
        class141.field3183 = class150.method1148(-85808345);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lfd;ILfd;)V")
    public static final void method568(class40 arg0, int arg1, class40 arg2) {
        field1729++;
        class133.field3002 = arg2;
        if (arg1 > -113) {
            method564(-33);
        }
        class76.field1628 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    private final synchronized void method569(boolean arg0) {
        field1716++;
        if (class155.field3526) {
            return;
        }
        class155.field3526 = true;
        try {
            class98.field2193.removeFocusListener(this);
        } catch (Exception var5) {
        }
        try {
            if (arg0) {
                this.field1725 = true;
            }
            this.method147((byte) 38);
        } catch (Exception var4) {
        }
        if (class27.field489 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class154.field3519 != null) {
            try {
                class154.field3519.method879(2830);
            } catch (Exception var2) {
            }
        }
        this.method150(0);
    }

    @OriginalMember(owner = "client!lc", name = "stop", descriptor = "()V")
    public final void stop() {
        field1720++;
        if (class126.field2769 == this && !class155.field3526) {
            class61.field1219 = class150.method1148(-85808345) + 4000L;
        }
    }

    @OriginalMember(owner = "client!lc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1700++;
        if (class27.field489 == null) {
            return class154.field3519 == null || class154.field3519.field2500 == this ? super.getCodeBase() : class154.field3519.field2500.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1738++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method570(byte arg0, String arg1) {
        if (arg0 != -89) {
            this.windowActivated(null);
        }
        field1709++;
        if (this.field1725) {
            return;
        }
        this.field1725 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }
}
