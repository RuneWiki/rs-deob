import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class224 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Z")
    public static boolean field3551 = false;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[J")
    public static long[] field3566 = new long[500];

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[Lvg;")
    public static class303[] field3570 = new class303[4];

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field3556 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "J")
    public static long field3561;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 4)
    public static void method1585(int arg0) {
        field3570 = null;
        field3566 = null;
        int var1 = -124 / ((19 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZ)V", line = 14)
    public static final void method1586(boolean arg0, boolean arg1) {
        field3559++;
        byte[][] var2;
        byte var3;
        if (class94.field1516 && arg0) {
            var2 = class128.field2027;
            var3 = 1;
        } else {
            var2 = class170.field2566;
            var3 = 4;
        }
        if (arg1) {
            method1588((class220) null, (byte) -38);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class170.method1225((byte) -97);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class315.field4897[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3865DBB) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFD) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class331.field5158.length; var13++) {
                                if (class331.field5158[var13] == var12 && var2[var13] != null) {
                                    class169.method1216((var11 & 0x7) * 8, (var10 & 0x7) * 8, var2[var13], var4, arg0, var6 * 8, var8, var5 * 8, field3570, var9, (byte) 107);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 100)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3565++;
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class17.field234 = arg0.getX();
            class23.field384 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 123)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class17.field234 = arg0.getX();
            class23.field384 = arg0.getY();
        }
        field3555++;
    }

    @OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 140)
    public final void focusGained(FocusEvent arg0) {
        field3569++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V", line = 147)
    public static final void method1587(int arg0, int arg1, byte arg2) {
        if (arg2 != -49) {
            method1585(-35);
        }
        class264.field4105 = class98.field1568[arg0][arg1].field820;
        field3571++;
        class321.field5016 = class98.field1568[arg0][arg1].field831;
        class333.field5219 = class98.field1568[arg0][arg1].field826;
        class250.method1734((float) class264.field4105, (float) class321.field5016, (float) class333.field5219);
    }

    @OriginalMember(owner = "client!ee", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3563++;
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class17.field234 = arg0.getX();
            class23.field384 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 184)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3560++;
    }

    @OriginalMember(owner = "client!ee", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 201)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3562++;
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class17.field234 = -1;
            class23.field384 = -1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 226)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class318.field4968 != null) {
            class203.field3046 = 0;
        }
        field3553++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ltb;B)Z", line = 248)
    public static final boolean method1588(class220 arg0, byte arg1) {
        if (arg1 != 33) {
            return false;
        }
        field3554++;
        if (arg0.field3373 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3373.length; var2++) {
            int var3 = class218.method1537(arg0, var2, 20);
            int var4 = arg0.field3388[var2];
            if (arg0.field3373[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field3373[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field3373[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 304)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class203.field3046 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3552++;
    }

    @OriginalMember(owner = "client!ee", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 342)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class318.field4968 != null) {
            class333.field5200 = 0;
            class70.field1133 = arg0.getX();
            class231.field3664 = arg0.getY();
            class345.field5349 = class102.method743((byte) 113);
            if (arg0.isMetaDown()) {
                class199.field2974 = 2;
                class203.field3046 = 2;
            } else {
                class199.field2974 = 1;
                class203.field3046 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        field3564++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
