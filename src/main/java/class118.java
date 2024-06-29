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

@OriginalClass("client!jb")
public abstract class class118 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "Z")
    private boolean field1708 = false;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lec;")
    public static class178 field1698 = null;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "Lqj;")
    public static class196 field1722 = class80.method502(" )2> <col=ffffff>", -48);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
    public static boolean field1727;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Z")
    public static boolean field1729;

    @OriginalMember(owner = "client!jb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1702++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method708(byte arg0) {
        if (arg0 >= -14) {
            field1690 = -92;
        }
        field1698 = null;
        field1722 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method709(int arg0, String arg1) {
        field1701++;
        if (this.field1708) {
            return;
        }
        if (arg0 != 48) {
            this.stop();
        }
        this.field1708 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
    private final void method710(int arg0, boolean arg1) {
        field1724++;
        synchronized (this) {
            if (class87.field1286) {
                return;
            }
            class87.field1286 = true;
            if (arg0 != 16382) {
                this.method709(110, null);
            }
        }
        if (class168.field2844.field3696 != null) {
            class168.field2844.field3696.destroy();
        }
        try {
            this.method617(arg0 - 16382);
        } catch (Exception var9) {
        }
        if (class52.field643 != null) {
            try {
                class52.field643.removeFocusListener(this);
                class52.field643.getParent().remove(class52.field643);
            } catch (Exception var8) {
            }
        }
        if (class168.field2844 != null) {
            try {
                class168.field2844.method1396(-24464);
            } catch (Exception var7) {
            }
        }
        this.method623(-30);
        if (class229.field4079 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Leb;)V")
    public static final void method711(class200 arg0) {
        for (int var1 = arg0.field3549; var1 <= arg0.field3539; var1++) {
            for (int var2 = arg0.field3548; var2 <= arg0.field3556; var2++) {
                class61 var3 = class249.field4410[arg0.field3553][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field836; var4++) {
                        if (var3.field823[var4] == arg0) {
                            var3.field836--;
                            for (int var5 = var4; var5 < var3.field836; var5++) {
                                var3.field823[var5] = var3.field823[var5 + 1];
                                var3.field820[var5] = var3.field820[var5 + 1];
                            }
                            var3.field823[var3.field836] = null;
                            break;
                        }
                    }
                    var3.field831 = 0;
                    for (int var6 = 0; var6 < var3.field836; var6++) {
                        var3.field831 |= var3.field820[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
    public final void method712(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        try {
            class249.field4407 = arg2;
            class237.field4213 = arg5;
            class61.field815 = arg1;
            class58.field789 = this;
            class229.field4079 = new Frame();
            class229.field4079.setTitle("Jagex");
            class229.field4079.setResizable(false);
            class229.field4079.addWindowListener(this);
            class229.field4079.setVisible(true);
            class229.field4079.toFront();
            Insets var8 = class229.field4079.getInsets();
            class229.field4079.setSize(var8.right + arg2 + var8.left, var8.top + arg1 + var8.bottom);
            class27.field341 = class168.field2844 = new class205(true, null, arg0, arg4, arg6);
            class168.field2844.method1398(1, arg3 + 16319, this);
            if (arg3 != -16319) {
                this.focusLost(null);
            }
        } catch (Exception var10) {
            class165.method1054(35, null, var10);
        }
        field1712++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)I")
    public static final int method713(boolean arg0, int arg1) {
        if (arg0) {
            return -118;
        } else {
            field1719++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!jb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1699++;
    }

    @OriginalMember(owner = "client!jb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1710++;
        if (class58.field789 != this || class87.field1286) {
            return;
        }
        class30.field372 = true;
        if (class205.field3697 != null && class205.field3697.startsWith("1.5") && class183.method1195((byte) 117) - class130.field1852 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class249.field4407 && class61.field815 <= var2.height) {
                class180.field3179 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public abstract void method620(byte arg0);

    @OriginalMember(owner = "client!jb", name = "providesignlink", descriptor = "(Llj;)V")
    public static final void providesignlink(class205 arg0) {
        class168.field2844 = arg0;
        class27.field341 = arg0;
        field1721++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg5;
            arg5 = var7;
        }
        field1718++;
        int var8 = arg2 & 0x3;
        if (arg6 != 5173) {
            return -72;
        } else if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg4;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V")
    public final void run() {
        field1720++;
        try {
            if (class205.field3683 != null) {
                String var1 = class205.field3683.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class205.field3697;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method709(48, "wrongjava");
                        return;
                    }
                    class199.field3534 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class205.field3697 == null || class205.field3697.equals("1.4.2"))) {
                    this.method709(48, "wrongjava");
                    return;
                }
            }
            if (class168.field2844.field3696 != null) {
                Method var3 = class205.field3691;
                if (var3 != null) {
                    try {
                        var3.invoke(class168.field2844.field3696, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method717(-16555);
            class43.field490 = class186.method1215(class61.field815, (byte) -17, class52.field643, class249.field4407);
            this.method625(true);
            class132.field1891 = class154.method979(-9834);
            while (class30.field373 == 0L || class30.field373 > class183.method1195((byte) 124)) {
                class21.field267 = class132.field1891.method150(class199.field3534, class85.field1246, -1);
                for (int var4 = 0; var4 < class21.field267; var4++) {
                    this.method722(19);
                }
                this.method716((byte) 107);
                class45.method243(-31656, class52.field643, class168.field2844);
            }
        } catch (Exception var7) {
            class165.method1054(35, null, var7);
            this.method709(48, "crash");
        }
        this.method710(16382, true);
    }

    @OriginalMember(owner = "client!jb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1700++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIII)V")
    public final void method715(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1711++;
        try {
            if (class58.field789 == null) {
                class249.field4407 = arg1;
                class61.field815 = arg2;
                if (arg0 != -46) {
                    this.method709(-111, null);
                }
                class58.field789 = this;
                class237.field4213 = arg3;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class168.field2844 == null) {
                    class27.field341 = class168.field2844 = new class205(false, this, arg4, null, 0);
                }
                class168.field2844.method1398(1, 0, this);
            } else {
                class81.field1172++;
                if (class81.field1172 >= 3) {
                    this.method709(48, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var8) {
            class165.method1054(35, null, var8);
            this.method709(48, "crash");
        }
    }

    @OriginalMember(owner = "client!jb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1713++;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V")
    private final void method716(byte arg0) {
        field1705++;
        long var2 = class183.method1195((byte) 119);
        if (arg0 != 107) {
            field1698 = null;
        }
        long var4 = class160.field2579[class125.field1779];
        class160.field2579[class125.field1779] = var2;
        class125.field1779 = class125.field1779 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class44.field524 = ((var6 >> 1) + 32000) / var6;
        }
        if (class91.field1332++ > 50) {
            class30.field372 = true;
            class91.field1332 -= 50;
            class52.field643.setSize(class249.field4407, class61.field815);
            class52.field643.setVisible(true);
            if (class229.field4079 != null && class125.field1769 == null) {
                Insets var7 = class229.field4079.getInsets();
                class52.field643.setLocation(var7.left, class155.field2505 + var7.top);
            } else {
                class52.field643.setLocation(0, class155.field2505);
            }
        }
        this.method621(-29883);
    }

    @OriginalMember(owner = "client!jb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1694++;
    }

    @OriginalMember(owner = "client!jb", name = "stop", descriptor = "()V")
    public final void stop() {
        field1709++;
        if (class58.field789 == this && !class87.field1286) {
            class30.field373 = class183.method1195((byte) 122) + 4000L;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final synchronized void method717(int arg0) {
        if (arg0 != -16555) {
            method719(21, 84);
        }
        if (class52.field643 != null) {
            class52.field643.removeFocusListener(this);
            class52.field643.getParent().remove(class52.field643);
        }
        field1704++;
        if (class206.field3704 != null) {
            class206.field3704.getParent().remove(class206.field3704);
            class206.field3704 = null;
        }
        Container var2;
        if (class125.field1769 != null) {
            var2 = class125.field1769;
        } else if (class229.field4079 == null) {
            var2 = class168.field2844.field3696;
        } else {
            var2 = class229.field4079;
        }
        var2.setLayout(null);
        if (class155.field2505 != 0) {
            class206.field3704 = new class49(this);
            var2.add(class206.field3704);
            class206.field3704.setSize(class249.field4407, class155.field2505);
            class206.field3704.setVisible(true);
            if (class229.field4079 == var2) {
                Insets var3 = class229.field4079.getInsets();
                class206.field3704.setLocation(var3.left, var3.top);
            } else {
                class206.field3704.setLocation(0, 0);
            }
        }
        class52.field643 = new class49(this);
        var2.add(class52.field643);
        class52.field643.setSize(class249.field4407, class61.field815);
        class52.field643.setVisible(true);
        if (class229.field4079 == var2) {
            Insets var4 = class229.field4079.getInsets();
            class52.field643.setLocation(var4.left, class155.field2505 + var4.top);
        } else {
            class52.field643.setLocation(0, class155.field2505);
        }
        class52.field643.addFocusListener(this);
        class52.field643.requestFocus();
        class135.field1967 = true;
        class202.field3584 = true;
        class30.field372 = true;
        class180.field3179 = false;
        class130.field1852 = class183.method1195((byte) 126);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public static final int method718(int arg0, int arg1) {
        if (arg1 < 20) {
            return -17;
        } else {
            field1695++;
            return arg0 >>> 7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1691++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
    public static final void method719(int arg0, int arg1) {
        if (arg1 < 92) {
            field1690 = -65;
        }
        field1697++;
        class172 var2 = class14.method62(-1204912992, 1, arg0);
        var2.method1126(2);
    }

    @OriginalMember(owner = "client!jb", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1726++;
        if (class58.field789 == this && !class87.field1286) {
            class30.field373 = class183.method1195((byte) 124);
            class73.method464((byte) 78, 5000L);
            class27.field341 = null;
            this.method710(16382, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Z")
    public final boolean method720(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1706++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 >= -119) {
                this.method625(false);
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method709(48, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public abstract void method623(int arg0);

    @OriginalMember(owner = "client!jb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1696++;
        if (class229.field4079 == null) {
            return class168.field2844 == null || class168.field2844.field3696 == this ? super.getParameter(arg0) : class168.field2844.field3696.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1714++;
        if (class229.field4079 == null) {
            return class168.field2844 == null || class168.field2844.field3696 == this ? super.getCodeBase() : class168.field2844.field3696.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
    public static final void method721(byte arg0, int arg1) {
        if (arg0 != 116) {
            method714(-124, 127, 5, 127, -42, 45, -22);
        }
        field1692++;
        if (class188.field3297 == null || arg1 > class188.field3297.length) {
            class188.field3297 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!jb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1723++;
        class202.field3584 = false;
    }

    @OriginalMember(owner = "client!jb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        field1707++;
        this.destroy();
    }

    @OriginalMember(owner = "client!jb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1715++;
        if (class229.field4079 == null) {
            return class168.field2844 == null || class168.field2844.field3696 == this ? super.getAppletContext() : class168.field2844.field3696.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "start", descriptor = "()V")
    public final void start() {
        field1725++;
        if (class58.field789 == this && !class87.field1286) {
            class30.field373 = 0L;
        }
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public abstract void method617(int arg0);

    @OriginalMember(owner = "client!jb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1693++;
        if (class229.field4079 == null) {
            return class168.field2844 == null || class168.field2844.field3696 == this ? super.getDocumentBase() : class168.field2844.field3696.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1716++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    private final void method722(int arg0) {
        field1688++;
        long var2 = class183.method1195((byte) 118);
        long var4 = class240.field4267[class223.field4003];
        class240.field4267[class223.field4003] = var2;
        boolean var10000;
        if (var4 == 0L || var2 <= var4) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class223.field4003 = class223.field4003 + 1 & 0x1F;
        synchronized (this) {
            class135.field1967 = class202.field3584;
            if (arg0 != 19) {
                this.destroy();
            }
        }
        this.method620((byte) -38);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public abstract void method625(boolean arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lec;IIB)V")
    public static final void method723(class178 arg0, int arg1, int arg2, byte arg3) {
        field1703++;
        if (arg0.field3148 == 1) {
            class235.method1577(class152.field2450, arg0.field3117, (short) 47, -1709, 0, 0L, arg0.field3050);
            class81.field1175++;
        }
        if (arg0.field3148 == 2 && !class171.field2883) {
            class196 var4 = class12.method55(false, arg0);
            if (var4 != null) {
                class235.method1577(class93.method572(-73, new class196[] { class52.field644, arg0.field3036 }), arg0.field3117, (short) 19, -1709, -1, 0L, var4);
                class147.field2323++;
            }
        }
        if (arg0.field3148 == 3) {
            class16.field180++;
            class235.method1577(class152.field2450, arg0.field3117, (short) 10, -1709, 0, 0L, class145.field2290);
        }
        if (arg0.field3148 == 4) {
            class235.method1577(class152.field2450, arg0.field3117, (short) 11, -1709, 0, 0L, arg0.field3050);
            class132.field1876++;
        }
        if (arg3 >= -89) {
            field1722 = null;
        }
        if (arg0.field3148 == 5) {
            class235.method1577(class152.field2450, arg0.field3117, (short) 21, -1709, 0, 0L, arg0.field3050);
            class212.field3806++;
        }
        if (arg0.field3148 == 6 && class30.field387 == null) {
            class235.method1577(class152.field2450, arg0.field3117, (short) 12, -1709, -1, 0L, arg0.field3050);
            class224.field4011++;
        }
        if (arg0.field3123 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field3082; var6++) {
                for (int var7 = 0; var7 < arg0.field2995; var7++) {
                    int var8 = (arg0.field3115 + 32) * var7;
                    int var9 = (arg0.field3100 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field3110[var5];
                        var8 += arg0.field3149[var5];
                    }
                    if (var8 <= arg2 && var9 <= arg1 && arg2 < var8 + 32 && arg1 < var9 + 32) {
                        class80.field1159 = arg0;
                        class189.field3309 = var5;
                        if (arg0.field3045[var5] > 0) {
                            class202 var10 = class178.method1154(false, arg0.field3045[var5] - 1);
                            if (class34.field416 == 1 && class174.method1138((byte) -125, client.method614(arg0))) {
                                if (class127.field1799 != arg0.field3117 || class104.field1512 != var5) {
                                    class235.method1577(class93.method572(-75, new class196[] { class232.field4135, class39.field444, var10.field3613 }), arg0.field3117, (short) 46, -1709, var5, (long) var10.field3569, class80.field1150);
                                    class72.field1034++;
                                }
                            } else if (!class171.field2883 || !class174.method1138((byte) -125, client.method614(arg0))) {
                                class82.field1187++;
                                class196[] var11 = var10.field3628;
                                if (class171.field2882) {
                                    var11 = class90.method557(119, var11);
                                }
                                if (class174.method1138((byte) -125, client.method614(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 30;
                                            } else {
                                                var13 = 9;
                                            }
                                            class235.method1577(class93.method572(-82, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, var13, -1709, var5, (long) var10.field3569, var11[var12]);
                                            class178.field3098++;
                                        } else if (var12 == 4) {
                                            class105.field1517++;
                                            class235.method1577(class93.method572(-82, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, (short) 9, -1709, var5, (long) var10.field3569, class154.field2497);
                                        }
                                    }
                                }
                                if (class236.method1587(client.method614(arg0), (byte) 116)) {
                                    class235.method1577(class93.method572(-103, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, (short) 5, -1709, var5, (long) var10.field3569, class80.field1150);
                                    class247.field4391++;
                                }
                                if (class174.method1138((byte) -125, client.method614(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class109.field1556++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 32;
                                            }
                                            if (var14 == 1) {
                                                var15 = 2;
                                            }
                                            if (var14 == 2) {
                                                var15 = 16;
                                            }
                                            class235.method1577(class93.method572(-79, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, var15, -1709, var5, (long) var10.field3569, var11[var14]);
                                        }
                                    }
                                }
                                class196[] var16 = arg0.field3075;
                                if (class171.field2882) {
                                    var16 = class90.method557(115, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class21.field261++;
                                            if (var17 == 0) {
                                                var18 = 26;
                                            }
                                            if (var17 == 1) {
                                                var18 = 8;
                                            }
                                            if (var17 == 2) {
                                                var18 = 6;
                                            }
                                            if (var17 == 3) {
                                                var18 = 18;
                                            }
                                            if (var17 == 4) {
                                                var18 = 48;
                                            }
                                            class235.method1577(class93.method572(-101, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, var18, -1709, var5, (long) var10.field3569, var16[var17]);
                                        }
                                    }
                                }
                                class235.method1577(class93.method572(-70, new class196[] { class7.field57, var10.field3613 }), arg0.field3117, (short) 1005, -1709, var5, (long) var10.field3569, class220.field3961);
                            } else if ((class62.field848 & 0x10) == 16) {
                                class235.method1577(class93.method572(-80, new class196[] { class206.field3706, class39.field444, var10.field3613 }), arg0.field3117, (short) 3, -1709, var5, (long) var10.field3569, class57.field764);
                                class201.field3566++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field3030) {
            return;
        }
        if (!class171.field2883) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class196 var23 = class64.method404(arg0, -99, var19);
                if (var23 != null) {
                    class27.field331++;
                    class235.method1577(arg0.field3133, arg0.field3117, (short) 1001, -1709, arg0.field3062, (long) (var19 + 1), var23);
                }
            }
            class196 var20 = class12.method55(false, arg0);
            if (var20 != null) {
                class147.field2323++;
                class235.method1577(arg0.field3133, arg0.field3117, (short) 19, -1709, arg0.field3062, 0L, var20);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class196 var22 = class64.method404(arg0, -89, var21);
                if (var22 != null) {
                    class235.method1577(arg0.field3133, arg0.field3117, (short) 20, -1709, arg0.field3062, (long) (var21 + 1), var22);
                    class27.field331++;
                }
            }
            if (!class187.method1225(client.method614(arg0), 1)) {
                return;
            }
            class224.field4011++;
            class235.method1577(class152.field2450, arg0.field3117, (short) 12, -1709, arg0.field3062, 0L, class103.field1482);
        } else if (class103.method633((byte) 9, client.method614(arg0)) && (class62.field848 & 0x20) == 32) {
            class235.method1577(class93.method572(-118, new class196[] { class206.field3706, class176.field2966, arg0.field3133 }), arg0.field3117, (short) 36, -1709, arg0.field3062, 0L, class57.field764);
            class224.field4016++;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public abstract void method621(int arg0);

    @OriginalMember(owner = "client!jb", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!jb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1717++;
        class202.field3584 = true;
        class30.field372 = true;
    }
}
