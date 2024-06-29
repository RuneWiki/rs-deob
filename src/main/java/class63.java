import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lic;")
    public static class59 field1599 = class59.method433(0, "<br>(X");

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lic;")
    private static class59 field1611 = class59.method433(0, "Attack");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lic;")
    public static class59 field1607 = class59.method433(0, "Spieler");

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Lic;")
    public static class59 field1616 = field1611;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lic;")
    public static class59 field1618 = class59.method433(0, "gleiten:");

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lic;")
    public static class59 field1620 = class59.method433(0, "Fertigkeit)2");

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lic;")
    public static class59 field1619 = class59.method433(0, "Neuer Benutzer");

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Z")
    public static volatile boolean field1617 = true;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field1614 = new Object();

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "Lic;")
    public static class59 field1622 = class59.method433(0, "sl_flags");

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1624 = 0;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "[[I")
    public static int[][] field1626 = new int[104][104];

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "Lic;")
    public static class59 field1627 = class59.method433(0, "<col=80ff00>");

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "Z")
    public static boolean field1625 = false;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "Lic;")
    public static class59 field1623 = class59.method433(0, "m");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Lbe;")
    public static class13 field1621;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "[[[B")
    public static byte[][][] field1628;

    @OriginalMember(owner = "client!ja", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class149.field3262 != null) {
            class139.field3106 = 0;
        }
        field1604++;
    }

    @OriginalMember(owner = "client!ja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1602++;
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class89.field2244 = arg0.getX();
            class31.field844 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIZZ)Lmd;")
    public static final class87 method523(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field1606++;
        class108 var5 = null;
        if (class7.field133 != null) {
            var5 = new class108(arg2, class7.field133, class143.field3129[arg2], 1000000);
        }
        return arg0 == 1000000 ? new class87(var5, class46.field1185, arg2, arg1, arg4, arg3) : null;
    }

    @OriginalMember(owner = "client!ja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1600++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class147.field3195 = arg0.getX();
            class42.field1069 = arg0.getY();
            class147.field3206 = class29.method235(-329);
            if (arg0.isMetaDown()) {
                class118.field2742 = 2;
                class139.field3106 = 2;
            } else {
                class118.field2742 = 1;
                class139.field3106 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1601++;
    }

    @OriginalMember(owner = "client!ja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1612++;
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class89.field2244 = arg0.getX();
            class31.field844 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1610++;
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class89.field2244 = -1;
            class31.field844 = -1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lme;")
    public static final class88 method524(int arg0, int arg1) {
        field1608++;
        if (arg1 != -31647) {
            method524(8, -12);
        }
        class88 var2 = (class88) class114.field2695.method675((long) arg0, 26431);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2847.method193(false, arg0, 16);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method726(0, new class157(var3));
        }
        class114.field2695.method672(-30464, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class89.field2244 = arg0.getX();
            class31.field844 = arg0.getY();
        }
        field1605++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        if (arg0 != -12979) {
            field1622 = null;
        }
        field1607 = null;
        field1627 = null;
        field1614 = null;
        field1620 = null;
        field1619 = null;
        field1618 = null;
        field1599 = null;
        field1616 = null;
        field1628 = null;
        field1621 = null;
        field1623 = null;
        field1622 = null;
        field1626 = null;
        field1611 = null;
    }

    @OriginalMember(owner = "client!ja", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1597++;
    }

    @OriginalMember(owner = "client!ja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1615++;
        if (class149.field3262 != null) {
            class153.field3321 = 0;
            class139.field3106 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public static final void method526(int arg0) {
        field1598++;
        int var1 = class159.field3646;
        int var2 = class128.field2895;
        int var3 = class138.field3081;
        int var4 = 6116423;
        int var5 = class30.field781;
        class129.method988(var1, var2, var3, var5, var4);
        class129.method988(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class129.method997(var1 + 1, var2 + 18, var3 - 2, var5 - 19, 0);
        class43.field1105.method1134(class98.field2443, var1 + 3, var2 + 14, var4, -1);
        int var6 = class145.field3166;
        int var7 = class16.field325;
        if (arg0 != -13475) {
            return;
        }
        for (int var8 = 0; var8 < class107.field2557; var8++) {
            int var9 = (class107.field2557 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && var9 - 13 < var6 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class43.field1105.method1134(class4.method22(var8, false), var1 + 3, var9, var10, 0);
        }
        class26.method197(class128.field2895, class30.field781, class138.field3081, class159.field3646, arg0 + 13475);
    }
}
