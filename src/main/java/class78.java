import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Loa;")
    public static class98 field1709 = class38.method349(255, "Lade Freunde)2Liste)3)3)3");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1703 = 2301979;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Loa;")
    private static class98 field1707 = class38.method349(255, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Loa;")
    public static class98 field1712 = class38.method349(255, "*6n");

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Loa;")
    public static class98 field1698 = class38.method349(255, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Loa;")
    private static class98 field1717 = class38.method349(255, "Sorry invited players only)3");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Loa;")
    public static class98 field1711 = field1707;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "Loa;")
    public static class98 field1721 = field1717;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Loc;")
    public static class100 field1708;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lde;")
    public static class27 field1706;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "[I")
    public static int[] field1722;

    @OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1700++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method630(int arg0) {
        field1702++;
        if (arg0 != 10764) {
            method631((byte) -110);
        }
        while (true) {
            class63 var1 = class53.field1184;
            class117 var2;
            synchronized (class53.field1184) {
                var2 = (class117) class19.field426.method522((byte) -93);
            }
            if (var2 == null) {
                return;
            }
            var2.field2616.method599(var2.field2621, var2.field2614, (int) var2.field2729, false, false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1715++;
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class98.field2302 = -1;
            class149.field3681 = -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1710++;
        if (class53.field1166 != null) {
            class97.field2235 = 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class98.field2302 = arg0.getX();
            class149.field3681 = arg0.getY();
        }
        field1716++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method631(byte arg0) {
        field1708 = null;
        field1721 = null;
        field1707 = null;
        field1717 = null;
        if (arg0 != -49) {
            field1709 = null;
        }
        field1722 = null;
        field1711 = null;
        field1712 = null;
        field1698 = null;
        field1706 = null;
        field1709 = null;
    }

    @OriginalMember(owner = "client!lb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1720++;
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class74.field1589 = arg0.getX();
            class123.field2746 = arg0.getY();
            class125.field2785 = class44.method375((byte) 20);
            if (arg0.isMetaDown()) {
                class35.field872 = 2;
                class97.field2235 = 2;
            } else {
                class35.field872 = 1;
                class97.field2235 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1701++;
    }

    @OriginalMember(owner = "client!lb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1719++;
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class98.field2302 = arg0.getX();
            class149.field3681 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method632(int arg0) {
        field1714++;
        if (!class127.field2839) {
            return;
        }
        class52.field1139 = null;
        client.field505 = null;
        class140.field3430 = null;
        class6.field103 = null;
        class57.field1261 = null;
        class105.field2408 = null;
        class79.field1738 = null;
        class118.field2637 = null;
        class88.field2018 = null;
        class147.field3581 = null;
        class58.field1280 = null;
        class139.field3409 = null;
        class123.field2740 = null;
        class58.field1303 = null;
        class35.field859 = null;
        class90.field2060 = null;
        client.field508 = null;
        class26.field622 = null;
        class48.field1092 = null;
        client.field488 = null;
        class37.field920 = null;
        class25.method274(2, (byte) 116);
        class18.method173(true, (byte) 113);
        if (arg0 != 1) {
            field1707 = null;
        }
        class127.field2839 = false;
    }

    @OriginalMember(owner = "client!lb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1704++;
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class98.field2302 = arg0.getX();
            class149.field3681 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!lb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1718++;
        if (class53.field1166 != null) {
            class6.field106 = 0;
            class97.field2235 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
