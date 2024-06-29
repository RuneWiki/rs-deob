import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class216 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3329 = 0;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3333 = 2;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lui;")
    public static class98 field3325 = new class98(50);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lnm;")
    public static class221 field3334;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
    public static int[] field3338;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 5)
    public static void method1464(int arg0) {
        field3338 = null;
        field3334 = null;
        field3325 = null;
        if (arg0 != 0) {
            method1466(52, -126, 0);
        }
    }

    @OriginalMember(owner = "client!bg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 18)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class319.field5259 = arg0.getX();
            class223.field3441 = arg0.getY();
        }
        field3336++;
    }

    @OriginalMember(owner = "client!bg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 37)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3326++;
    }

    @OriginalMember(owner = "client!bg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 53)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3330++;
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class117.field1711 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V", line = 88)
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3335++;
        int var7 = class34.method288(3, arg4, class33.field505, class278.field4586);
        int var8 = class34.method288(3, arg6, class33.field505, class278.field4586);
        int var9 = class34.method288(3, arg0, class341.field5494, class196.field3001);
        int var10 = class34.method288(3, arg1, class341.field5494, class196.field3001);
        int var11 = class34.method288(3, arg4 + arg2, class33.field505, class278.field4586);
        int var12 = class34.method288(3, arg6 - arg2, class33.field505, class278.field4586);
        for (int var13 = var7; var13 < var11; var13++) {
            class270.method1906(arg5, var10, var9, class306.field4998[var13], 122);
        }
        if (arg3 < 91) {
            return;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class270.method1906(arg5, var10, var9, class306.field4998[var14], 122);
        }
        int var15 = class34.method288(3, arg0 + arg2, class341.field5494, class196.field3001);
        int var16 = class34.method288(3, arg1 - arg2, class341.field5494, class196.field3001);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class306.field4998[var17];
            class270.method1906(arg5, var15, var9, var18, 118);
            class270.method1906(arg5, var10, var16, var18, 125);
        }
    }

    @OriginalMember(owner = "client!bg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 140)
    public final void focusGained(FocusEvent arg0) {
        field3337++;
    }

    @OriginalMember(owner = "client!bg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 149)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class275.field4544 != null) {
            class117.field1711 = 0;
        }
        field3328++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lea;", line = 167)
    public static final class257 method1466(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        return var3 == null ? null : var3.field732;
    }

    @OriginalMember(owner = "client!bg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 182)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class319.field5259 = -1;
            class223.field3441 = -1;
        }
        field3339++;
    }

    @OriginalMember(owner = "client!bg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 199)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class84.field1205 = arg0.getX();
            class11.field123 = arg0.getY();
            class283.field4651 = class19.method122(-12169);
            if (arg0.isMetaDown()) {
                class26.field394 = 2;
                class117.field1711 = 2;
            } else {
                class26.field394 = 1;
                class117.field1711 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3332++;
    }

    @OriginalMember(owner = "client!bg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 250)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3331++;
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class319.field5259 = arg0.getX();
            class223.field3441 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!bg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 268)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3327++;
        if (class275.field4544 != null) {
            class3.field24 = 0;
            class319.field5259 = arg0.getX();
            class223.field3441 = arg0.getY();
        }
    }
}
