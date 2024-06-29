import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class64 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
    public static int[] field1614 = new int[1000];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static volatile int field1615 = 0;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Z")
    public static boolean field1626 = false;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[Lhb;")
    public static class44[] field1624 = new class44[100];

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[Lhb;")
    public static class44[] field1625 = new class44[500];

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lhb;")
    private static class44 field1634 = class102.method810("Offline", -28606);

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lhb;")
    public static class44 field1629 = class102.method810(" steht bereits auf Ihrer Freunde)2Liste(Q", -28606);

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lhb;")
    public static class44 field1636 = field1634;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[Lhb;")
    public static class44[] field1616 = new class44[5];

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lhb;")
    private static class44 field1635 = class102.method810("Prepared visibility map", -28606);

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1632 = -1;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[[[I")
    public static int[][][] field1620 = new int[4][105][105];

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Lhb;")
    public static class44 field1631 = field1635;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
    public static boolean field1637 = false;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "Lhb;")
    public static class44 field1641 = class102.method810("oberen Rand der Webseite ausw-=hlen)3", -28606);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "[I")
    public static int[] field1619;

    @OriginalMember(owner = "client!kd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 21)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class84.field2130 = 0;
        }
        field1617++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I", line = 41)
    public static final int method568(int arg0) {
        int var1 = 59 % ((-arg0 - 35) / 63);
        field1642++;
        return 19;
    }

    @OriginalMember(owner = "client!kd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 58)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class4.field111 = arg0.getX();
            class23.field487 = arg0.getY();
        }
        field1623++;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 79)
    public static final void method569(int arg0) {
        field1640++;
        int var1 = -56 / ((-arg0 - 56) / 52);
        class2.field47 = new class47();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ltd;IIBI)[B", line = 89)
    public static final byte[] method570(class116 arg0, int arg1, int arg2, byte arg3, int arg4) {
        long var5 = ((long) arg4 << 32) + ((long) (arg2 * 37 + arg1 & 0xFFFF)) + (long) (arg2 << 16);
        field1622++;
        if (arg3 > -90) {
            field1620 = null;
        }
        if (class1.field22 != null) {
            class109 var7 = (class109) class1.field22.method330(var5, -1);
            if (var7 != null) {
                return var7.field2733;
            }
        }
        byte[] var8 = arg0.method892(arg2, arg1, false);
        if (var8 == null) {
            return null;
        } else {
            if (class1.field22 != null) {
                class1.field22.method332(new class109(var8), 0, var5);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!kd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 131)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1633++;
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class4.field111 = arg0.getX();
            class23.field487 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 146)
    public static void method571(int arg0) {
        field1631 = null;
        field1636 = null;
        field1619 = null;
        field1629 = null;
        field1616 = null;
        field1624 = null;
        field1614 = null;
        field1634 = null;
        field1635 = null;
        field1625 = null;
        if (arg0 >= 22) {
            field1641 = null;
            field1620 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 176)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class4.field111 = -1;
            class23.field487 = -1;
        }
        field1628++;
    }

    @OriginalMember(owner = "client!kd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 192)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class4.field111 = arg0.getX();
            class23.field487 = arg0.getY();
        }
        field1630++;
    }

    @OriginalMember(owner = "client!kd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1621++;
        if (class57.field1506 != null) {
            class77.field1947 = 0;
            class1.field2 = arg0.getX();
            class98.field2489 = arg0.getY();
            class131.field3165 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                field1615 = 2;
                class84.field2130 = 2;
            } else {
                field1615 = 1;
                class84.field2130 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Li;", line = 242)
    public static final class48 method572(Throwable arg0, String arg1) {
        field1638++;
        class48 var2;
        if (arg0 instanceof class48) {
            var2 = (class48) arg0;
            var2.field1197 = var2.field1197 + ' ' + arg1;
        } else {
            var2 = new class48(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 284)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1627++;
    }
}
