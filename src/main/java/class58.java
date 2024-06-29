import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class58 extends class534 {

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Lcc;")
    public class468 field597;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field587 = 0;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    private static int field607 = 0;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    private static int field600 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private static int field577;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private static int field598;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    private static int field601;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    private static int field602;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[I")
    private int[] field595;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFILua;II)V", line = 8)
    public final void method302(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class598 arg7, int arg8, int arg9) {
        if (this.field597.method2700()) {
            throw new IllegalStateException();
        } else if (this.method308(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class409 var11 = (class409) arg7;
            this.method309(var11.field5466, var11.field5467, field598 - arg8, -arg9 - (field603 - field602));
        }
    }

    @OriginalMember(owner = "client!kg", name = "ca", descriptor = "()I", line = 22)
    public final int method304() {
        return this.field596 + this.field593 + this.field604;
    }

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "()I", line = 29)
    public final int method306() {
        return this.field593;
    }

    @OriginalMember(owner = "client!kg", name = "DA", descriptor = "(IIIIIII)V", line = 43)
    public final void method307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field597.method2700()) {
            throw new IllegalStateException();
        }
        if (this.field595 == null) {
            this.field595 = new int[4];
        }
        this.field597.method963(this.field595);
        this.field597.method941(this.field597.field6675, this.field597.field6676, arg0 + arg2, arg1 + arg3);
        int var8 = this.method312();
        int var9 = this.method304();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method314(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field597.method982(this.field595[0], this.field595[1], this.field595[2], this.field595[3]);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFF)Z", line = 82)
    private final boolean method308(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field586 + this.field581 + this.field584;
        int var8 = this.field596 + this.field593 + this.field604;
        if (this.field586 != var7 || this.field593 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field596 * var11;
            float var14 = (float) this.field596 * var12;
            float var15 = (float) this.field581 * var9;
            float var16 = (float) this.field581 * var10;
            float var17 = (float) this.field584 * -var9;
            float var18 = (float) this.field584 * -var10;
            float var19 = (float) this.field604 * -var11;
            float var20 = (float) this.field604 * -var12;
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
        if (var23 < (float) this.field597.field6675) {
            var23 = this.field597.field6675;
        }
        if (var24 > (float) this.field597.field6678) {
            var24 = this.field597.field6678;
        }
        if (var25 < (float) this.field597.field6676) {
            var25 = this.field597.field6676;
        }
        if (var26 > (float) this.field597.field6690) {
            var26 = this.field597.field6690;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field582 = this.field597.field6667;
        field575 = (int) ((float) ((int) var25 * field582) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field590 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field586 / var29);
        field606 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field593 / var30);
        field578 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field586 / var30);
        field580 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field593 / var29);
        field601 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field577 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field594 = (this.field586 >> 1 << 12) + (field578 * field577 >> 4);
        field591 = (this.field593 >> 1 << 12) + (field580 * field577 >> 4);
        field599 = field601 * field590 >> 4;
        field589 = field606 * field601 >> 4;
        field598 = (int) var23;
        field605 = (int) var27;
        field602 = (int) var25;
        field603 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!kg", name = "qa", descriptor = "(FFFFFFIIII)V", line = 226)
    public final void method310(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field597.method2700()) {
            throw new IllegalStateException();
        } else if (this.method308(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field588 = arg7;
            if (arg6 != 1) {
                field579 = arg7 >>> 24;
                field583 = 256 - field579;
                if (arg6 == 0) {
                    field576 = (arg7 & 0xFF0000) >> 16;
                    field587 = (arg7 & 0xFF00) >> 8;
                    field585 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field600 = arg7 >>> 24;
                    field607 = 256 - field600;
                    int var11 = (arg7 & 0xFF00FF) * field607 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field607 & 0xFF0000;
                    field592 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method305(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method305(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method305(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method305(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method305(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method305(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method305(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method305(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method305(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method305(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method305(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method305(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "()I", line = 332)
    public final int method312() {
        return this.field586 + this.field581 + this.field584;
    }

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "(IIII)V", line = 337)
    public final void method313(int arg0, int arg1, int arg2, int arg3) {
        this.field581 = arg0;
        this.field596 = arg1;
        this.field584 = arg2;
        this.field604 = arg3;
    }

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "()I", line = 353)
    public final int method315() {
        return this.field586;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lcc;II)V", line = 371)
    public class58(class468 arg0, int arg1, int arg2) {
        this.field597 = arg0;
        this.field586 = arg1;
        this.field593 = arg2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILua;II)V")
    public abstract void method301(int arg0, int arg1, class598 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public abstract void method305(int arg0, int arg1);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([I[III)V")
    public abstract void method309(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kg", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "(IIIII)V")
    public abstract void method314(int arg0, int arg1, int arg2, int arg3, int arg4);
}
