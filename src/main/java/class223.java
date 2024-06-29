import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class223 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
    public static int[] field3467 = new int[2];

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3471 = "Loading fonts - ";

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ll;")
    public static class66 field3465 = new class66(50);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lue;Lrn;ILrn;Lrn;)Z", line = 6)
    public static final boolean method1673(class13 arg0, class18 arg1, int arg2, class18 arg3, class18 arg4) {
        class266.field4128 = arg1;
        class356.field5674 = arg3;
        class214.field3354 = arg4;
        if (arg2 != -31771) {
            method1674(-115);
        }
        field3466++;
        class128.field2122 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 26)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3462++;
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class194.field3050 = arg0.getX();
            class13.field202 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 44)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class53.field803 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        field3463++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 81)
    public final void focusGained(FocusEvent arg0) {
        field3475++;
    }

    @OriginalMember(owner = "client!ee", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 93)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class194.field3050 = -1;
            class13.field202 = -1;
        }
        field3477++;
    }

    @OriginalMember(owner = "client!ee", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 110)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3468++;
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class194.field3050 = arg0.getX();
            class13.field202 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 132)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3474++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 142)
    public static void method1674(int arg0) {
        field3471 = null;
        field3465 = null;
        field3467 = null;
        if (arg0 != 2) {
            field3471 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lrn;B)I", line = 156)
    public static final int method1675(class18 arg0, byte arg1) {
        field3469++;
        int var2 = 0;
        if (arg0.method199(arg1 ^ 0x8EF, class337.field5181)) {
            var2++;
        }
        if (arg0.method199(2209, class44.field704)) {
            var2++;
        }
        if (arg0.method199(2209, class36.field546)) {
            var2++;
        }
        if (arg0.method199(2209, class227.field3536)) {
            var2++;
        }
        if (arg0.method199(2209, class148.field2411)) {
            var2++;
        }
        if (arg0.method199(arg1 ^ 0x8EF, class264.field4100)) {
            var2++;
        }
        if (arg0.method199(2209, class288.field4473)) {
            var2++;
        }
        if (arg1 != 78) {
            field3471 = (String) null;
        }
        if (arg0.method199(2209, class59.field915)) {
            var2++;
        }
        if (arg0.method199(arg1 + 2131, class162.field2574)) {
            var2++;
        }
        if (arg0.method199(2209, class53.field806)) {
            var2++;
        }
        if (arg0.method199(arg1 ^ 0x8EF, class362.field5739)) {
            var2++;
        }
        if (arg0.method199(2209, class215.field3368)) {
            var2++;
        }
        if (arg0.method199(2209, class209.field3213)) {
            var2++;
        }
        if (arg0.method199(arg1 + 2131, class29.field466)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 228)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3476++;
        if (class236.field3674 != null) {
            class53.field803 = 0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 242)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class194.field3050 = arg0.getX();
            class13.field202 = arg0.getY();
        }
        field3472++;
    }

    @OriginalMember(owner = "client!ee", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 258)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3464++;
        if (class236.field3674 != null) {
            class214.field3346 = 0;
            class112.field1723 = arg0.getX();
            class194.field3047 = arg0.getY();
            class320.field4931 = class156.method1273((byte) -28);
            if (arg0.isMetaDown()) {
                class359.field5701 = 2;
                class53.field803 = 2;
            } else {
                class359.field5701 = 1;
                class53.field803 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIILqf;IJ)Z", line = 315)
    public static final boolean method1676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class64 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class174.method1365(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 327)
    public static final void method1677(int arg0) {
        if (arg0 != -10890) {
            method1673((class13) null, (class18) null, 35, (class18) null, (class18) null);
        }
        for (int var1 = 0; var1 < class243.field3786; var1++) {
            class75 var2 = class123.method1063(16, var1);
            if (var2 != null && var2.field1108 == 0) {
                class329.field5058[var1] = 0;
                class160.field2538[var1] = 0;
            }
        }
        field3473++;
        class68.field1045 = new class37(16);
    }
}
