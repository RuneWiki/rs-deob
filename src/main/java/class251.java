import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class251 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Lbd;")
    public static class162 field4191 = class17.method142(0, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "S")
    public static short field4200 = 32767;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
    public static boolean field4203 = true;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lbd;")
    private static class162 field4193 = class17.method142(0, "glow3:");

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Lbd;")
    public static class162 field4198 = field4193;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lbd;")
    public static class162 field4202 = field4193;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[I")
    public static int[] field4190;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "[Ldc;")
    public static class71[] field4187;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[[Z")
    public static boolean[][] field4196;

    @OriginalMember(owner = "client!fe", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4186++;
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class253.field4218 = arg0.getX();
            class264.field4397 = arg0.getY();
            class207.field3492 = class300.method2048((byte) 18);
            if (arg0.isMetaDown()) {
                class266.field4441 = 2;
                class297.field4972 = 2;
            } else {
                class266.field4441 = 1;
                class297.field4972 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 57)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class62.field969 = arg0.getX();
            class228.field3794 = arg0.getY();
        }
        field4188++;
    }

    @OriginalMember(owner = "client!fe", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 75)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class297.field4972 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field4185++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 113)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class62.field969 = -1;
            class228.field3794 = -1;
        }
        field4199++;
    }

    @OriginalMember(owner = "client!fe", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 135)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4192++;
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class62.field969 = arg0.getX();
            class228.field3794 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fe", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 162)
    public final void mouseClicked(MouseEvent arg0) {
        field4184++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)I", line = 178)
    public static final int method1754(byte arg0) {
        field4194++;
        if (arg0 != -126) {
            return 41;
        } else if (class168.field2950 != null) {
            return 3;
        } else if (class117.field2159 && class158.field2778) {
            return 2;
        } else if (class117.field2159 && !class158.field2778) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 205)
    public final void focusGained(FocusEvent arg0) {
        field4189++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILda;)V", line = 221)
    public static final void method1755(int arg0, class143 arg1) {
        field4197++;
        if (class293.field4930) {
            return;
        }
        if (arg0 < 39) {
            method1754((byte) -125);
        }
        if (class117.field2159) {
            class16.method126();
        } else {
            class316.method2171();
        }
        class97.field1766 = class42.method314((byte) -107, arg1, class186.field3203);
        int var2 = class252.field4205;
        int var3 = var2 * 956 / 503;
        class97.field1766.method518((field4201 - var3) / 2, 0, var3, var2);
        class137.field2444 = class156.method1210(class263.field4393, (byte) 46, arg1);
        class137.field2444.method266(field4201 / 2 - (class137.field2444.field556 / 2), 18);
        class293.field4930 = true;
    }

    @OriginalMember(owner = "client!fe", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 252)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4183++;
        if (class240.field3998 != null) {
            class297.field4972 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 263)
    public static void method1756(int arg0) {
        field4193 = null;
        field4196 = (boolean[][]) null;
        if (arg0 != -1) {
            method1754((byte) 109);
        }
        field4202 = null;
        field4198 = null;
        field4191 = null;
        field4187 = null;
        field4190 = null;
    }

    @OriginalMember(owner = "client!fe", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 285)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4182++;
        if (class240.field3998 != null) {
            class305.field5141 = 0;
            class62.field969 = arg0.getX();
            class228.field3794 = arg0.getY();
        }
    }
}
