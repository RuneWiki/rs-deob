import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    public static int[] field1639 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!sl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 8)
    public final void mouseClicked(MouseEvent arg0) {
        field1640++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class122.field1956 = arg0.getX();
            class291.field4425 = arg0.getY();
            class273.field4254 = class154.method1172((byte) 112);
            if (arg0.isMetaDown()) {
                class136.field2170 = 2;
                class124.field1988 = 2;
            } else {
                class136.field2170 = 1;
                class124.field1988 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        field1633++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 71)
    public static void method715(byte arg0) {
        if (arg0 != -53) {
            field1639 = (int[]) null;
        }
        field1639 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 83)
    public static final void method716(int arg0, String arg1, String arg2, int arg3, String arg4) {
        field1636++;
        class107.method818((byte) -26, arg1, arg4, arg2, arg3, -1);
        if (arg0 < 71) {
            field1639 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 95)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class17.field338 = arg0.getX();
            class269.field4194 = arg0.getY();
        }
        field1642++;
    }

    @OriginalMember(owner = "client!sl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 118)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class17.field338 = arg0.getX();
            class269.field4194 = arg0.getY();
        }
        field1635++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lie;", line = 135)
    public static final class87 method717(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null || var3.field4213 == null ? null : var3.field4213;
    }

    @OriginalMember(owner = "client!sl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 143)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class124.field1988 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1632++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIBIII)V", line = 182)
    public static final void method718(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1630++;
        if (arg5 < 128 || arg3 < 128 || arg5 > 13056 || arg3 > 13056) {
            class326.field5065 = -1;
            class67.field1080 = -1;
            return;
        }
        int var8 = class48.method374(arg3, arg5, 117, class41.field734) - arg6;
        int var9 = var8 - class48.field801;
        int var10 = arg5 - class140.field2223;
        int var11 = class174.field2731[class181.field2891];
        int var12 = arg3 - class312.field4904;
        int var13 = class174.field2732[class181.field2891];
        int var14 = class174.field2731[class103.field1746];
        int var15 = class174.field2732[class103.field1746];
        int var16 = var10 * var15 + var12 * var14 >> 16;
        if (arg4 != -67) {
            method717(-9, -59, -43);
        }
        int var17 = var12 * var15 - (var10 * var14) >> 16;
        int var19 = var9 * var13 - var11 * var17 >> 16;
        int var20 = var9 * var11 + var13 * var17 >> 16;
        if (var20 < 50) {
            class67.field1080 = -1;
            class326.field5065 = -1;
        } else if (class265.field4126) {
            int var22 = arg1 * 512 >> 8;
            int var23 = arg2 * 512 >> 8;
            class326.field5065 = arg0 + (var16 * var22 / var20);
            class67.field1080 = var19 * var23 / var20 + arg7;
        } else {
            class326.field5065 = (var16 << 9) / var20 + arg0;
            class67.field1080 = (var19 << 9) / var20 + arg7;
        }
    }

    @OriginalMember(owner = "client!sl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 245)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1634++;
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class17.field338 = -1;
            class269.field4194 = -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 262)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class114.field1862 != null) {
            class16.field319 = 0;
            class17.field338 = arg0.getX();
            class269.field4194 = arg0.getY();
        }
        field1641++;
    }

    @OriginalMember(owner = "client!sl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 278)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1637++;
        if (class114.field1862 != null) {
            class124.field1988 = 0;
        }
    }

    @OriginalMember(owner = "client!sl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 289)
    public final void focusGained(FocusEvent arg0) {
        field1631++;
    }
}
