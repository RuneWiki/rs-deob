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

@OriginalClass("client!l")
public abstract class class76 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Z")
    private boolean field1569 = false;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lpe;")
    public static class109 field1534 = class141.method1120("mapedge", 0);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lpe;")
    private static class109 field1541 = class141.method1120("", 0);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lpe;")
    public static class109 field1533 = field1541;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lpe;")
    public static class109 field1540 = field1541;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Lpe;")
    public static class109 field1559 = field1541;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lpe;")
    public static class109 field1524 = field1541;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lpe;")
    public static class109 field1537 = field1541;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "Lpe;")
    public static class109 field1572 = field1541;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lpe;")
    public static class109 field1545 = field1541;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lpe;")
    public static class109 field1522 = field1541;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Lpe;")
    public static class109 field1575 = field1541;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Lpe;")
    public static class109 field1565 = field1541;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lpe;")
    public static class109 field1532 = field1541;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lpe;")
    public static class109 field1525 = field1541;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lpe;")
    public static class109 field1528 = field1541;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "Lpe;")
    public static class109 field1564 = field1541;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "Lpe;")
    public static class109 field1574 = field1541;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Lpe;")
    public static class109 field1551 = field1541;

    @OriginalMember(owner = "client!l", name = "gb", descriptor = "Lpe;")
    public static class109 field1580 = field1541;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "Lpe;")
    public static class109 field1562 = field1541;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lpe;")
    public static class109 field1539 = field1541;

    @OriginalMember(owner = "client!l", name = "hb", descriptor = "Lpe;")
    public static class109 field1581 = field1541;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lpe;")
    public static class109 field1570 = field1541;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "Lpe;")
    public static class109 field1566 = field1541;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lpe;")
    public static class109 field1535 = field1541;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lpe;")
    public static class109 field1538 = field1541;

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "Lpe;")
    public static class109 field1583 = field1541;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "Lpe;")
    public static class109 field1576 = field1541;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lpe;")
    public static class109 field1573 = field1541;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lpe;")
    public static class109 field1536 = field1541;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lpe;")
    public static class109 field1542 = field1541;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lpe;")
    public static class109 field1523 = field1541;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Lpe;")
    public static class109 field1560 = field1541;

    @OriginalMember(owner = "client!l", name = "qb", descriptor = "Lpe;")
    private static class109 field1590 = class141.method1120("flash3:", 0);

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "Lpe;")
    public static class109 field1584 = field1541;

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "Lpe;")
    public static class109 field1582 = field1541;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Lpe;")
    public static class109 field1567 = field1541;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "Lpe;")
    public static class109 field1586 = field1590;

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!l", name = "wb", descriptor = "Lpe;")
    public static class109 field1596 = field1541;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
    public static int[] field1530 = new int[25];

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lpe;")
    public static class109 field1543 = field1590;

    @OriginalMember(owner = "client!l", name = "xb", descriptor = "Lpe;")
    public static class109 field1597 = field1541;

    @OriginalMember(owner = "client!l", name = "yb", descriptor = "Lpe;")
    public static class109 field1598 = field1541;

    @OriginalMember(owner = "client!l", name = "tb", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!l", name = "nb", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!l", name = "ob", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!l", name = "pb", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!l", name = "rb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!l", name = "sb", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!l", name = "ub", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!l", name = "vb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Z")
    public static boolean field1531;

    @OriginalMember(owner = "client!l", name = "zb", descriptor = "Z")
    public static boolean field1599;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public abstract void method208(byte arg0);

    @OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field1592++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method594(int arg0) {
        if (arg0 != 8900) {
            field1535 = null;
        }
        if (class28.field643.toLowerCase().indexOf("microsoft") == -1) {
            class41.field857[47] = 73;
            class41.field857[46] = 72;
            class41.field857[44] = 71;
            class41.field857[92] = 74;
            class41.field857[61] = 27;
            class41.field857[59] = 57;
            class41.field857[91] = 42;
            class41.field857[45] = 26;
            class41.field857[93] = 43;
            if (class28.field648 == null) {
                class41.field857[192] = 58;
                class41.field857[222] = 59;
            } else {
                class41.field857[520] = 59;
                class41.field857[192] = 28;
                class41.field857[222] = 58;
            }
        } else {
            class41.field857[223] = 28;
            class41.field857[221] = 43;
            class41.field857[222] = 59;
            class41.field857[188] = 71;
            class41.field857[220] = 74;
            class41.field857[190] = 72;
            class41.field857[189] = 26;
            class41.field857[186] = 57;
            class41.field857[187] = 27;
            class41.field857[219] = 42;
            class41.field857[192] = 58;
            class41.field857[191] = 73;
        }
        field1546++;
    }

    @OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1568++;
    }

    @OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field1577++;
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
    public final void run() {
        field1527++;
        try {
            if (class28.field643 != null) {
                String var1 = class28.field643.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class28.field645;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method600("wrongjava", 4);
                        return;
                    }
                    class71.field1436 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class28.field645 == null || class28.field645.equals("1.4.2"))) {
                    this.method600("wrongjava", 4);
                    return;
                }
            }
            if (class35.field755.field651 != null) {
                Method var3 = class28.field644;
                if (var3 != null) {
                    try {
                        var3.invoke(class35.field755.field651, Boolean.TRUE);
                    } catch (Throwable var6) {
                    }
                }
            }
            this.method599((byte) 104);
            class75.field1510 = class153.method1178(class137.field2980, class41.field859, class62.field1272, true);
            this.method207(false);
            class121.field2673 = class125.method1014(-1);
            while (class115.field2539 == 0L || class94.method779(-33) < class115.field2539) {
                class64.field1321 = class121.field2673.method175(class126.field2807, -108, class71.field1436);
                for (int var4 = 0; var4 < class64.field1321; var4++) {
                    this.method596(-1);
                }
                this.method605(1);
                class95.method786(class35.field755, 1, class137.field2980);
            }
        } catch (Exception var7) {
            class112.method921(null, false, var7);
            this.method600("crash", 4);
        }
        this.method602(-32446);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method595(int arg0) {
        field1523 = null;
        field1564 = null;
        field1575 = null;
        field1542 = null;
        field1574 = null;
        field1538 = null;
        field1522 = null;
        field1540 = null;
        field1596 = null;
        field1570 = null;
        field1524 = null;
        field1567 = null;
        field1525 = null;
        field1598 = null;
        field1537 = null;
        field1534 = null;
        field1551 = null;
        field1572 = null;
        field1566 = null;
        field1535 = null;
        field1528 = null;
        field1573 = null;
        field1562 = null;
        field1583 = null;
        field1545 = null;
        field1586 = null;
        field1536 = null;
        field1597 = null;
        field1582 = null;
        field1565 = null;
        field1560 = null;
        field1584 = null;
        field1580 = null;
        field1530 = null;
        field1533 = null;
        if (arg0 != -26929) {
            return;
        }
        field1543 = null;
        field1590 = null;
        field1576 = null;
        field1541 = null;
        field1559 = null;
        field1581 = null;
        field1532 = null;
        field1539 = null;
    }

    @OriginalMember(owner = "client!l", name = "providesignlink", descriptor = "(Ldf;)V")
    public static final void providesignlink(class28 arg0) {
        class35.field755 = arg0;
        class60.field1177 = arg0;
        field1529++;
    }

    @OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field1589++;
    }

    @OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field1594++;
        if (class12.field278 == null) {
            return class35.field755 == null || class35.field755.field651 == this ? super.getParameter(arg0) : class35.field755.field651.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "start", descriptor = "()V")
    public final void start() {
        field1555++;
        if (class4.field89 == this && !class75.field1508) {
            class115.field2539 = 0L;
        }
    }

    @OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class2.field33 = true;
        class53.field1088 = true;
        field1526++;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
    private final void method596(int arg0) {
        field1550++;
        long var2 = class139.field3034[class108.field2261];
        long var4 = class94.method779(123);
        boolean var10000;
        if (var2 == 0L || var4 <= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class139.field3034[class108.field2261] = var4;
        class108.field2261 = class108.field2261 - arg0 & 0x1F;
        synchronized (this) {
            class89.field1886 = class2.field33;
        }
        this.method215((byte) 124);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIII)V")
    public final void method597(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1561++;
        try {
            if (class4.field89 == null) {
                class41.field859 = arg4;
                class114.field2522 = arg2;
                class4.field89 = this;
                class62.field1272 = arg0;
                if (class35.field755 == null) {
                    class60.field1177 = class35.field755 = new class28(false, this, arg3, null, 0);
                }
                class35.field755.method252(1, (byte) 34, this);
                if (arg1 >= -113) {
                    this.windowClosed(null);
                }
            } else {
                class71.field1435++;
                if (class71.field1435 >= 3) {
                    this.method600("alreadyloaded", 4);
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var7) {
            class112.method921(null, false, var7);
            this.method600("crash", 4);
        }
    }

    @OriginalMember(owner = "client!l", name = "stop", descriptor = "()V")
    public final void stop() {
        field1578++;
        if (class4.field89 == this && !class75.field1508) {
            class115.field2539 = class94.method779(-109) + 4000L;
        }
    }

    @OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field1558++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public abstract void method207(boolean arg0);

    @OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field1595++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public abstract void method215(byte arg0);

    @OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public static int method598(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field1549++;
        if (class4.field89 != this || class75.field1508) {
            return;
        }
        class53.field1088 = true;
        if (class28.field645 != null && class28.field645.startsWith("1.5") && class94.method779(-106) - class49.field1015 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class62.field1272 && var2.height >= class41.field859) {
                class116.field2582 = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        field1548++;
        class2.field33 = false;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public final synchronized void method599(byte arg0) {
        Container var2;
        if (class12.field278 == null) {
            var2 = class35.field755.field651;
        } else {
            var2 = class12.field278;
        }
        field1571++;
        if (class137.field2980 != null) {
            class137.field2980.removeFocusListener(this);
            var2.remove(class137.field2980);
        }
        class137.field2980 = new class92(this);
        var2.add(class137.field2980);
        class137.field2980.setSize(class62.field1272, class41.field859);
        class137.field2980.setVisible(true);
        if (class12.field278 == null) {
            class137.field2980.setLocation(0, 0);
        } else {
            Insets var3 = class12.field278.getInsets();
            class137.field2980.setLocation(var3.left, var3.top);
        }
        if (arg0 <= 83) {
            return;
        }
        class137.field2980.addFocusListener(this);
        class137.field2980.requestFocus();
        class53.field1088 = true;
        class116.field2582 = false;
        class49.field1015 = class94.method779(-56);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method600(String arg0, int arg1) {
        if (arg1 != 4) {
            field1533 = null;
        }
        field1547++;
        if (this.field1569) {
            return;
        }
        this.field1569 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field1563++;
        if (class4.field89 == this && !class75.field1508) {
            class115.field2539 = class94.method779(-91);
            class99.method797(5000L, false);
            class60.field1177 = null;
            this.method602(-32446);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
    public final void method601(int arg0, String arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class4.field89 = this;
            class41.field859 = arg5;
            class62.field1272 = arg3;
            class114.field2522 = arg0;
            class12.field278 = new Frame();
            class12.field278.setTitle("Jagex");
            class12.field278.setResizable(false);
            class12.field278.addWindowListener(this);
            class12.field278.setVisible(true);
            class12.field278.toFront();
            Insets var8 = class12.field278.getInsets();
            class12.field278.setSize(var8.right + var8.left + arg3, arg5 - -var8.top + var8.bottom);
            class60.field1177 = class35.field755 = new class28(true, null, arg4, arg1, arg6);
            class35.field755.method252(1, (byte) 34, this);
        } catch (Exception var11) {
            class112.method921(null, false, var11);
        }
        int var10 = -63 / ((57 - arg2) / 40);
        field1554++;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    private final synchronized void method602(int arg0) {
        field1588++;
        if (class75.field1508) {
            return;
        }
        class75.field1508 = true;
        try {
            class137.field2980.removeFocusListener(this);
            if (arg0 != -32446) {
                field1573 = null;
            }
        } catch (Exception var5) {
        }
        try {
            this.method213((byte) 118);
        } catch (Exception var4) {
        }
        if (class12.field278 != null) {
            try {
                System.exit(0);
            } catch (Throwable var3) {
            }
        }
        if (class35.field755 != null) {
            try {
                class35.field755.method250(arg0 + 32542);
            } catch (Exception var2) {
            }
        }
        this.method208((byte) 123);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
    public abstract void method212(boolean arg0);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
    public abstract void method213(byte arg0);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)Z")
    public final boolean method603(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1544++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != -64) {
                this.update(null);
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
                this.method600("invalidhost", arg0 + 68);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field1553++;
        if (class12.field278 == null) {
            return class35.field755 == null || class35.field755.field651 == this ? super.getDocumentBase() : class35.field755.field651.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field1557++;
        if (class12.field278 == null) {
            return class35.field755 == null || class35.field755.field651 == this ? super.getCodeBase() : class35.field755.field651.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field1556++;
    }

    @OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field1552++;
        if (class12.field278 == null) {
            return class35.field755 == null || class35.field755.field651 == this ? super.getAppletContext() : class35.field755.field651.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ll;I)V")
    public static final void method604(class76 arg0, int arg1) {
        field1591++;
        if (class19.field484 == 1) {
            short var2 = 280;
            if (var2 <= class115.field2538 && class115.field2538 <= var2 + 14 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(0, 84, 0);
                return;
            }
            if (class115.field2538 >= var2 + 15 && var2 + 80 >= class115.field2538 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(1, 78, 0);
                return;
            }
            short var3 = 390;
            if (var3 <= class115.field2538 && var3 + 14 >= class115.field2538 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(0, 89, 1);
                return;
            }
            if (var3 + 15 <= class115.field2538 && class115.field2538 <= var3 + 80 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(1, 81, 1);
                return;
            }
            short var4 = 500;
            if (class115.field2538 >= var4 && var4 + 14 >= class115.field2538 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(0, 116, 2);
                return;
            }
            if (var4 + 15 <= class115.field2538 && var4 + 80 >= class115.field2538 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(1, -75, 2);
                return;
            }
            short var5 = 610;
            if (var5 <= class115.field2538 && class115.field2538 <= var5 + 14 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(0, 101, 3);
                return;
            }
            if (var5 + 15 <= class115.field2538 && var5 + 80 >= class115.field2538 && class120.field2671 >= 4 && class120.field2671 <= 18) {
                class141.method1123(1, 101, 3);
                return;
            }
            if (class115.field2538 >= 708 && class120.field2671 >= 4 && class115.field2538 <= 758 && class120.field2671 <= 20) {
                class79.field1660 = false;
                class94.field2033.method264(0, 0);
                class78.field1637.method264(382, 0);
                class149.field3300.method539(382 - class149.field3300.field1386 / 2, 18);
                return;
            }
            if (class48.field989 != -1) {
                class144 var6 = class55.field1126[class48.field989];
                if (class63.field1291 == var6.field3157) {
                    byte[] var7 = class44.method405(new class109[] { var6.field3168, class139.field3020 }, (byte) -74).method874(123);
                    class53.field1093 = new String(var7, 0, var7.length);
                    class79.field1660 = false;
                    class19.field474 = var6.field3161;
                    if (class83.field1774 != 0) {
                        class136.field2971 = 43594;
                        class72.field1458 = 43594;
                        class83.field1774 = 0;
                        class89.field1888 = 443;
                    }
                    class94.field2033.method264(0, 0);
                    class78.field1637.method264(382, 0);
                    class149.field3300.method539(382 - class149.field3300.field1386 / 2, 18);
                    return;
                }
                class109 var8 = class44.method405(new class109[] { class79.field1664, var6.field3168, class139.field3020, class131.field2873, class13.field325, class143.method1132(class62.field1269 ? 1 : 0, 101), class91.field1909, class143.method1132(class86.field1833, 80), class124.field2751, class143.method1132(class99.field2071, 122) }, (byte) -74);
                try {
                    arg0.getAppletContext().showDocument(var8.method894((byte) 41), "_self");
                } catch (Exception var10) {
                }
            }
        }
        int var9 = 71 % ((38 - arg1) / 48);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    private final void method605(int arg0) {
        field1585++;
        long var2 = class94.method779(arg0 + 114);
        long var4 = class62.field1264[class52.field1073];
        class62.field1264[class52.field1073] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class123.field2723 = ((var6 >> 1) + 32000) / var6;
        }
        class52.field1073 = class52.field1073 + arg0 & 0x1F;
        if (class27.field639++ > 50) {
            class27.field639 -= 50;
            class53.field1088 = true;
            class137.field2980.setSize(class62.field1272, class41.field859);
            class137.field2980.setVisible(true);
            if (class12.field278 == null) {
                class137.field2980.setLocation(0, 0);
            } else {
                Insets var7 = class12.field278.getInsets();
                class137.field2980.setLocation(var7.left, var7.top);
            }
        }
        this.method212(false);
    }

    @OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field1587++;
    }
}
