import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class255 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    public static int[] field4071 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4075 = 2301979;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field4082 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[I")
    public static int[] field4084 = new int[32768];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "[I")
    public static int[] field4080;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)Lrc;")
    public static final class69 method1723(byte arg0, int arg1, int arg2) {
        field4079++;
        class69 var3 = (class69) class185.field2915.method2043((long) arg2 << 32 | (long) arg1, -1);
        if (arg0 != 32) {
            field4080 = null;
        }
        if (var3 == null) {
            var3 = new class69(arg2, arg1);
            class185.field2915.method2046(var3, -93, var3.field2009);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field4069++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg1 - arg2;
        if (arg7) {
            method1723((byte) -96, -66, -110);
        }
        int var12 = arg0 * arg0;
        int var13 = arg0 - arg2;
        int var14 = arg1 * arg1;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var12 << 1;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var14 + var17;
        int var24 = (1 - var22) * var16 + var20;
        int var25 = var15 - ((var22 - 1) * var18);
        int var26 = var12 - ((var21 - 1) * var19);
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = (var21 - 3) * var19;
        int var32 = var15 << 2;
        int var33 = (var22 - 3) * var18;
        int var34 = var20 * 3;
        int var35 = var28;
        int var36 = (var13 - 1) * var29;
        int var37 = (arg0 - 1) * var27;
        int var38 = var32;
        int[] var39 = class55.field872[arg5];
        class173.method1240((byte) -90, arg6 - var11, var39, arg3, arg6 - arg1);
        class173.method1240((byte) -84, arg6 + var11, var39, arg4, arg6 - var11);
        class173.method1240((byte) -125, arg6 + arg1, var39, arg3, arg6 + var11);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var26 += var35;
                    var30 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            boolean var40 = var9 <= var13;
            var9--;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var25 += var38;
                        var38 += var32;
                        var24 += var34;
                        var34 += var32;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var25 += var38;
                    var38 += var32;
                    var24 += var34;
                    var34 += var32;
                }
                var25 += -var33;
                var33 -= var29;
                var24 += -var36;
                var36 -= var29;
            }
            int var41 = arg5 + var9;
            if (var26 < 0) {
                var8++;
                var23 += var30;
                var30 += var28;
                var26 += var35;
                var35 += var28;
            }
            var23 += -var37;
            int var42 = arg5 - var9;
            var37 -= var27;
            var26 += -var31;
            var31 -= var27;
            int var43 = arg6 - var8;
            int var44 = arg6 + var8;
            if (var40) {
                int var45 = arg6 - var10;
                class173.method1240((byte) -74, var45, class55.field872[var42], arg3, var43);
                int var46 = arg6 + var10;
                class173.method1240((byte) -68, var46, class55.field872[var42], arg4, var45);
                class173.method1240((byte) -84, var44, class55.field872[var42], arg3, var46);
                class173.method1240((byte) -47, var45, class55.field872[var41], arg3, var43);
                class173.method1240((byte) -84, var46, class55.field872[var41], arg4, var45);
                class173.method1240((byte) -113, var44, class55.field872[var41], arg3, var46);
            } else {
                class173.method1240((byte) -90, var44, class55.field872[var42], arg3, var43);
                class173.method1240((byte) -68, var44, class55.field872[var41], arg3, var43);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4074++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1725(int arg0) {
        field4071 = null;
        field4080 = null;
        field4084 = null;
        if (arg0 != 1) {
            method1726(-46, -39);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1726(int arg0, int arg1) {
        field4077++;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else {
            if (arg1 != 1859425602) {
                field4084 = null;
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!s", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class284.field4476 = arg0.getX();
            class246.field3913 = arg0.getY();
            class204.field3142 = class242.method1650(60);
            if (arg0.isMetaDown()) {
                class307.field4929 = 2;
                class7.field126 = 2;
            } else {
                class307.field4929 = 1;
                class7.field126 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field4073++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4078++;
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class7.field126 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4076++;
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class48.field794 = arg0.getX();
            class145.field2150 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4067++;
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class48.field794 = arg0.getX();
            class145.field2150 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4068++;
    }

    @OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class240.field3813 != null) {
            class7.field126 = 0;
        }
        field4072++;
    }

    @OriginalMember(owner = "client!s", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class48.field794 = arg0.getX();
            class145.field2150 = arg0.getY();
        }
        field4081++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I")
    public static final int method1727(byte arg0, int arg1) {
        if (arg0 > -20) {
            return 107;
        } else {
            field4083++;
            return arg1 & 0x7F;
        }
    }

    @OriginalMember(owner = "client!s", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4066++;
        if (class240.field3813 != null) {
            class160.field2408 = 0;
            class48.field794 = -1;
            class145.field2150 = -1;
        }
    }
}
