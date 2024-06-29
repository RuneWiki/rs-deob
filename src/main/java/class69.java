import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class69 extends class131 {

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Llr;")
    public class749 field719;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public int field713;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field701 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    private static int field703 = 0;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field722 = 0;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private static int field708 = 0;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field726 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    private static int field706;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    private static int field718;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    private static int field725;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    private static int field733;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[I")
    private int[] field724;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 7)
    public final void method500(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class485 arg7, int arg8, int arg9) {
        if (this.field719.method4170()) {
            throw new IllegalStateException();
        } else if (this.method507(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class303 var11 = (class303) arg7;
            this.method504(var11.field3791, var11.field3788, field718 - arg8, -arg9 - (field729 - field725));
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()I", line = 23)
    public final int method501() {
        return this.field720 + this.field714 + this.field710;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "()I", line = 31)
    public final int method503() {
        return this.field714;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFFIIII)V", line = 66)
    public final void method506(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field719.method4170()) {
            throw new IllegalStateException();
        } else if (this.method507(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field723 = arg7;
            if (arg6 != 1) {
                field727 = arg7 >>> 24;
                field715 = 256 - field727;
                if (arg6 == 0) {
                    field722 = (arg7 & 0xFF0000) >> 16;
                    field704 = (arg7 & 0xFF00) >> 8;
                    field726 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field703 = arg7 >>> 24;
                    field708 = 256 - field703;
                    int var11 = (arg7 & 0xFF00FF) * field708 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field708 & 0xFF0000;
                    field701 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method499(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method499(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method499(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method499(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method499(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method499(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(FFFFFF)Z", line = 170)
    private final boolean method507(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field720 + this.field714 + this.field710;
        int var8 = this.field713 + this.field712 + this.field705;
        if (this.field714 != var7 || this.field713 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field712 * var11;
            float var14 = (float) this.field712 * var12;
            float var15 = (float) this.field720 * var9;
            float var16 = (float) this.field720 * var10;
            float var17 = (float) this.field710 * -var9;
            float var18 = (float) this.field710 * -var10;
            float var19 = (float) this.field705 * -var11;
            float var20 = (float) this.field705 * -var12;
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
        if (var23 < (float) this.field719.field10445) {
            var23 = this.field719.field10445;
        }
        if (var24 > (float) this.field719.field10470) {
            var24 = this.field719.field10470;
        }
        if (var25 < (float) this.field719.field10455) {
            var25 = this.field719.field10455;
        }
        if (var26 > (float) this.field719.field10458) {
            var26 = this.field719.field10458;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field732 = this.field719.field10479;
        field731 = (int) ((float) ((int) var25 * field732) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field702 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field714 / var29);
        field728 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field713 / var30);
        field717 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field714 / var30);
        field716 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field713 / var29);
        field733 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field706 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field711 = (this.field714 >> 1 << 12) + (field717 * field706 >> 4);
        field709 = (this.field713 >> 1 << 12) + (field716 * field706 >> 4);
        field707 = field733 * field702 >> 4;
        field730 = field733 * field728 >> 4;
        field718 = (int) var23;
        field721 = (int) var27;
        field725 = (int) var25;
        field729 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()I", line = 311)
    public final int method509() {
        return this.field713;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Llr;II)V", line = 314)
    public class69(class749 arg0, int arg1, int arg2) {
        this.field719 = arg0;
        this.field714 = arg1;
        this.field713 = arg2;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "()I", line = 320)
    public final int method510() {
        return this.field713 + this.field712 + this.field705;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V", line = 323)
    public final void method511(int arg0, int arg1, int arg2, int arg3) {
        this.field720 = arg0;
        this.field712 = arg1;
        this.field710 = arg2;
        this.field705 = arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 331)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field719.method4170()) {
            throw new IllegalStateException();
        }
        if (this.field724 == null) {
            this.field724 = new int[4];
        }
        this.field719.method354(this.field724);
        this.field719.method438(this.field719.field10445, this.field719.field10455, arg0 + arg2, arg1 + arg3);
        int var8 = this.method501();
        int var9 = this.method510();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method512(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field719.method432(this.field724[0], this.field724[1], this.field724[2], this.field724[3]);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
    public abstract void method499(int arg0, int arg1);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method502(int arg0, int arg1, class485 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([I[III)V")
    public abstract void method504(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4);
}
