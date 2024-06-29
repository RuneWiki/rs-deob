import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class50 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "[S")
    public static short[] field686 = new short[500];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lde;")
    public static class68[] field685 = new class68[4];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field690 = 20;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field687 = -1;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field689 = "";

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[I")
    public static int[] field688 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 4)
    public static void method346(int arg0) {
        field688 = null;
        field686 = null;
        field689 = null;
        field685 = null;
        if (arg0 != 1) {
            method348(75);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLok;II)V", line = 38)
    public static final void method347(int arg0, boolean arg1, class160 arg2, int arg3, int arg4) {
        int var5 = arg2.field2458;
        field691++;
        if (arg4 != 23739) {
            return;
        }
        if (arg2.field2609 == 0) {
            arg2.field2458 = arg2.field2448;
        } else if (arg2.field2609 == 1) {
            arg2.field2458 = arg0 - arg2.field2448;
        } else if (arg2.field2609 == 2) {
            arg2.field2458 = arg2.field2448 * arg0 >> 14;
        } else if (arg2.field2609 == 3) {
            if (arg2.field2608 == 2) {
                arg2.field2458 = (arg2.field2448 - 1) * arg2.field2604 + arg2.field2448 * 32;
            } else if (arg2.field2608 == 7) {
                arg2.field2458 = (arg2.field2448 - 1) * arg2.field2604 + arg2.field2448 * 115;
            }
        }
        int var6 = arg2.field2590;
        if (arg2.field2584 == 0) {
            arg2.field2590 = arg2.field2552;
        } else if (arg2.field2584 == 1) {
            arg2.field2590 = arg3 - arg2.field2552;
        } else if (arg2.field2584 == 2) {
            arg2.field2590 = arg2.field2552 * arg3 >> 14;
        } else if (arg2.field2584 == 3) {
            if (arg2.field2608 == 2) {
                arg2.field2590 = (arg2.field2552 - 1) * arg2.field2610 + arg2.field2552 * 32;
            } else if (arg2.field2608 == 7) {
                arg2.field2590 = (arg2.field2552 - 1) * arg2.field2610 + arg2.field2552 * 12;
            }
        }
        if (arg2.field2609 == 4) {
            arg2.field2458 = arg2.field2590 * arg2.field2548 / arg2.field2616;
        }
        if (arg2.field2584 == 4) {
            arg2.field2590 = arg2.field2616 * arg2.field2458 / arg2.field2548;
        }
        if (class147.field2201 && (client.method1913(arg2).field2725 != 0 || arg2.field2608 == 0)) {
            if (arg2.field2590 < 5 && arg2.field2458 < 5) {
                arg2.field2590 = 5;
                arg2.field2458 = 5;
            } else {
                if (arg2.field2458 <= 0) {
                    arg2.field2458 = 5;
                }
                if (arg2.field2590 <= 0) {
                    arg2.field2590 = 5;
                }
            }
        }
        if (arg2.field2461 == 1337) {
            class339.field5273 = arg2;
        }
        if (arg1 && arg2.field2558 != null && (arg2.field2458 != var5 || arg2.field2590 != var6)) {
            class247 var7 = new class247();
            var7.field3931 = arg2;
            var7.field3925 = arg2.field2558;
            class95.field1459.method1815((byte) -23, var7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 146)
    public static final void method348(int arg0) {
        field695++;
        Container var1;
        if (class113.field1688 != null) {
            var1 = class113.field1688;
        } else if (class161.field2635 == null) {
            var1 = class264.field4183.field68;
        } else {
            var1 = class161.field2635;
        }
        class71.field910 = var1.getSize().width;
        class35.field460 = var1.getSize().height;
        if (class161.field2635 == var1) {
            Insets var2 = class161.field2635.getInsets();
            class71.field910 -= var2.right + var2.left;
            class35.field460 -= var2.top + var2.bottom;
        }
        if (class60.method416(-76) >= 2) {
            class170.field2711 = 0;
            class210.field3432 = class35.field460;
            class160.field2601 = class71.field910;
            class28.field398 = 0;
        } else {
            class28.field398 = 0;
            class170.field2711 = (class71.field910 - 765) / 2;
            class160.field2601 = 765;
            class210.field3432 = 503;
        }
        if (class186.field2991) {
            class186.method1304(class160.field2601, class210.field3432);
        }
        class338.field5247.setSize(class160.field2601, class210.field3432);
        if (arg0 != 2) {
            method348(32);
        }
        if (class161.field2635 == var1) {
            Insets var3 = class161.field2635.getInsets();
            class338.field5247.setLocation(class170.field2711 + var3.left, var3.top - -class28.field398);
        } else {
            class338.field5247.setLocation(class170.field2711, class28.field398);
        }
        if (class246.field3904 != -1) {
            class242.method1713(true, arg0 + 113);
        }
        class80.method589((byte) -126);
    }
}
