import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public abstract class class219 extends class458 {

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "Luq;")
    public class148 field2651;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    private static int field2643 = 0;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    private static int field2650 = 0;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2636 = 0;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field2642 = 0;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field2640 = 0;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    private static int field2637;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    private static int field2645;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    private static int field2655;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    private static int field2659;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "[I")
    private int[] field2649;

    @OriginalMember(owner = "client!dt", name = "AA", descriptor = "()I", line = 4)
    public final int method418() {
        return this.field2652 + this.field2633 + this.field2648;
    }

    @OriginalMember(owner = "client!dt", name = "ba", descriptor = "(IIIIIII)V", line = 23)
    public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2651.method812()) {
            throw new IllegalStateException();
        }
        if (this.field2649 == null) {
            this.field2649 = new int[4];
        }
        this.field2651.method274(this.field2649);
        this.field2651.method330(this.field2651.field1667, this.field2651.field1669, arg0 + arg2, arg1 + arg3);
        int var8 = this.method418();
        int var9 = this.method408();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method416(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2651.method314(this.field2649[0], this.field2649[1], this.field2649[2], this.field2649[3]);
    }

    @OriginalMember(owner = "client!dt", name = "QA", descriptor = "()I", line = 64)
    public final int method415() {
        return this.field2652;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "()I", line = 71)
    public final int method417() {
        return this.field2631;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(FFFFFF)Z", line = 82)
    private final boolean method1290(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2652 + this.field2633 + this.field2648;
        int var8 = this.field2644 + this.field2631 + this.field2639;
        if (this.field2652 != var7 || this.field2631 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2644 * var11;
            float var14 = (float) this.field2644 * var12;
            float var15 = (float) this.field2633 * var9;
            float var16 = (float) this.field2633 * var10;
            float var17 = (float) this.field2648 * -var9;
            float var18 = (float) this.field2648 * -var10;
            float var19 = (float) this.field2639 * -var11;
            float var20 = (float) this.field2639 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field2651.field1667) {
            var23 = this.field2651.field1667;
        }
        if (var24 > (float) this.field2651.field1676) {
            var24 = this.field2651.field1676;
        }
        if (var25 < (float) this.field2651.field1669) {
            var25 = this.field2651.field1669;
        }
        if (var26 > (float) this.field2651.field1692) {
            var26 = this.field2651.field1692;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field2635 = this.field2651.field1694;
        field2660 = (int) ((float) ((int) var25 * field2635) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2632 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2652 / var29);
        field2634 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2631 / var30);
        field2638 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2652 / var30);
        field2658 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2631 / var29);
        field2655 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2637 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2630 = (this.field2652 >> 1 << 12) + (field2638 * field2637 >> 4);
        field2657 = (this.field2631 >> 1 << 12) + (field2658 * field2637 >> 4);
        field2641 = field2655 * field2632 >> 4;
        field2647 = field2655 * field2634 >> 4;
        field2659 = (int) var23;
        field2646 = (int) var27;
        field2645 = (int) var25;
        field2653 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!dt", name = "EA", descriptor = "(IIII)V", line = 228)
    public final void method409(int arg0, int arg1, int arg2, int arg3) {
        this.field2633 = arg0;
        this.field2644 = arg1;
        this.field2648 = arg2;
        this.field2639 = arg3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "()I", line = 242)
    public final int method408() {
        return this.field2644 + this.field2631 + this.field2639;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Luq;II)V", line = 245)
    public class219(class148 arg0, int arg1, int arg2) {
        this.field2651 = arg0;
        this.field2652 = arg1;
        this.field2631 = arg2;
    }

    @OriginalMember(owner = "client!dt", name = "sa", descriptor = "(FFFFFFIII)V", line = 251)
    public final void method419(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field2651.method812()) {
            throw new IllegalStateException();
        } else if (this.method1290(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field2654 = arg7;
            if (arg6 != 1) {
                field2640 = arg7 >>> 24;
                field2642 = 256 - field2640;
                if (arg6 == 0) {
                    field2656 = (arg7 & 0xFF0000) >> 16;
                    field2661 = (arg7 & 0xFF00) >> 8;
                    field2662 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field2643 = arg7 >>> 24;
                    field2650 = 256 - field2643;
                    int var10 = (arg7 & 0xFF00FF) * field2650 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field2650 & 0xFF0000;
                    field2636 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method735(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method735(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method735(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method735(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method735(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method735(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method735(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method735(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method735(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method735(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method735(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method735(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 353)
    public final void method421(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class213 arg6, int arg7, int arg8) {
        if (this.field2651.method812()) {
            throw new IllegalStateException();
        } else if (this.method1290(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class624 var10 = (class624) arg6;
            this.method734(var10.field8840, var10.field8838, field2659 - arg7, -arg8 - (field2653 - field2645));
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
    public abstract void method735(int arg0, int arg1);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method410(int arg0, int arg1, class213 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "(IIIII)V")
    public abstract void method416(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!dt", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "([I[III)V")
    public abstract void method734(int[] arg0, int[] arg1, int arg2, int arg3);
}
