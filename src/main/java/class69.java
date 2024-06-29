import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lsc;")
    public static class128 field1537 = class129.method1017(false, "::");

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lsc;")
    private static class128 field1543 = class129.method1017(false, "Please contact customer support)3");

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lsc;")
    public static class128 field1545 = field1543;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lsc;")
    public static class128 field1559 = class129.method1017(false, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lsc;")
    private static class128 field1538 = class129.method1017(false, "OFF");

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lsc;")
    public static class128 field1539 = field1538;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1544 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field1561 = 0;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lmc;")
    public static class86 field1562 = new class86(8);

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!k", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1550++;
    }

    @OriginalMember(owner = "client!k", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1548++;
    }

    @OriginalMember(owner = "client!k", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class9.field151 = arg0.getX();
            class72.field1611 = arg0.getY();
        }
        field1558++;
    }

    @OriginalMember(owner = "client!k", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1541++;
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class9.field151 = arg0.getX();
            class72.field1611 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Lid;")
    public static final class60 method518(boolean arg0, int arg1) {
        field1540++;
        class60 var2 = (class60) class132.field3072.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class70.field1567.method1023(arg1, 9, (byte) -35);
        class60 var4 = new class60();
        var4.field1311 = arg1;
        if (var3 != null) {
            var4.method459(new class86(var3), 8912);
        }
        if (arg0) {
            var4.method454(-1);
            class132.field3072.method913((long) arg1, var4, (byte) -73);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1553++;
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class9.field151 = -1;
            class72.field1611 = -1;
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1555++;
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class104.field2357 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class9.field151 = arg0.getX();
            class72.field1611 = arg0.getY();
        }
        field1557++;
    }

    @OriginalMember(owner = "client!k", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1556++;
        if (class148.field3417 != null) {
            class104.field2357 = 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)I")
    public static final int method519(int arg0, int arg1, byte arg2) {
        class159 var3 = (class159) class46.field858.method969((long) arg1, -65);
        field1542++;
        if (arg2 != 104) {
            method521(62);
        }
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field3647.length) {
            return var3.field3647[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method520(int arg0, boolean arg1, byte[] arg2) {
        if (arg0 != 2) {
            method521(44);
        }
        field1549++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class2.field17) {
            try {
                class113 var3 = (class113) Class.forName("ke").getDeclaredConstructor().newInstance();
                var3.method553(arg0 ^ 0xFFFFFFFA, arg2);
                return var3;
            } catch (Throwable var4) {
                class2.field17 = true;
            }
        }
        return arg1 ? class99.method758(-2, arg2) : arg2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method521(int arg0) {
        field1552++;
        if (!class65.field1459) {
            return;
        }
        if (arg0 <= 82) {
            method522((byte) 70);
        }
        class54 var1 = class152.method1210(class113.field2549, false, class31.field615);
        if (var1 != null && var1.field1159 != null) {
            class18 var2 = new class18();
            var2.field314 = var1;
            var2.field321 = var1.field1159;
            class46.method341(var2, -2601);
        }
        class65.field1459 = false;
        class89.method696(var1, 1);
    }

    @OriginalMember(owner = "client!k", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class148.field3417 != null) {
            class154.field3539 = 0;
            class157.field3610 = arg0.getX();
            class102.field2324 = arg0.getY();
            class104.field2362 = class68.method516(false);
            if (arg0.isMetaDown()) {
                class159.field3661 = 2;
                class104.field2357 = 2;
            } else {
                class159.field3661 = 1;
                class104.field2357 = 1;
            }
        }
        field1547++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field1537 = null;
        field1539 = null;
        if (arg0 != 102) {
            method520(62, true, null);
        }
        field1538 = null;
        field1559 = null;
        field1562 = null;
        field1544 = null;
        field1543 = null;
        field1545 = null;
    }
}
