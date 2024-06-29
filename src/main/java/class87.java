import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class87 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Lha;")
    public static class46 field1653 = class271.method1828("Benutzen", -46);

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lha;")
    public static class46 field1664 = class271.method1828("p11_full", -46);

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "J")
    public static long field1660;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
    public static int[] field1652;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "[[B")
    public static byte[][] field1650;

    @OriginalMember(owner = "client!ng", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class54.field928 != null) {
            class14.field210 = 0;
            class182.field3276 = arg0.getX();
            class100.field1846 = arg0.getY();
        }
        field1657++;
    }

    @OriginalMember(owner = "client!ng", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class54.field928 != null) {
            class14.field210 = 0;
            class182.field3276 = arg0.getX();
            class100.field1846 = arg0.getY();
        }
        field1659++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lha;I)Z")
    public static final boolean method678(class46 arg0, int arg1) {
        field1656++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class42.field714; var2++) {
            if (arg0.method315((byte) -38, class221.field3891[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ng", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1651++;
        if (class54.field928 != null) {
            class163.field2882 = 0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class54.field928 != null) {
            class14.field210 = 0;
            class182.field3276 = -1;
            class100.field1846 = -1;
        }
        field1663++;
    }

    @OriginalMember(owner = "client!ng", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class54.field928 != null) {
            class14.field210 = 0;
            class126.field2319 = arg0.getX();
            class85.field1615 = arg0.getY();
            class40.field700 = class223.method1537(-26619);
            if (arg0.isMetaDown()) {
                class244.field4337 = 2;
                class163.field2882 = 2;
            } else {
                class244.field4337 = 1;
                class163.field2882 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field1655++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ng", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class54.field928 != null) {
            class14.field210 = 0;
            class163.field2882 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1665++;
    }

    @OriginalMember(owner = "client!ng", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1661++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[Luf;ZIII[BIIBI)V")
    public static final void method679(int arg0, class154[] arg1, boolean arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, byte arg9, int arg10) {
        field1658++;
        if (arg9 <= 15) {
            return;
        }
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg2) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && (arg3 + var12) < 103 && (arg8 + var13) > 0 && (arg8 + var13) < 103) {
                        arg1[arg0].field2718[arg3 + var12][arg8 + var13] = class50.method369(arg1[arg0].field2718[arg3 + var12][arg8 + var13], -16777217);
                    }
                }
            }
        }
        class75 var14 = new class75(arg6);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && arg4 <= var16 && var16 < arg4 + 8 && arg5 <= var17 && var17 < arg5 + 8) {
                        class60.method404(0, var14, arg8 + class98.method763(true, var16 & 0x7, arg10, var17 & 0x7), arg10, arg2, arg0, 0, (byte) -94, class161.method1177(arg10, var17 & 0x7, var16 & 0x7, -101) + arg3);
                    } else {
                        class60.method404(0, var14, -1, 0, arg2, 0, 0, (byte) -94, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1648++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static void method680(int arg0) {
        field1652 = null;
        field1653 = null;
        if (arg0 != 0) {
            method678((class46) null, 109);
        }
        field1650 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static final void method681(boolean arg0) {
        class17.field255 = 0;
        class167.field2943 = 0;
        class33.field616 = 1;
        class40.field698 = -3;
        class38.field667 = 0;
        class140.field2507 = arg0;
        field1662++;
        class105.field1879 = -1;
    }

    @OriginalMember(owner = "client!ng", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1649++;
        if (class54.field928 != null) {
            class14.field210 = 0;
            class182.field3276 = arg0.getX();
            class100.field1846 = arg0.getY();
        }
    }
}
