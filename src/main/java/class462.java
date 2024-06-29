import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class462 extends class34 {

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "Lpga;")
    public class491 field6732;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field6703 = 0;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    private static int field6710 = 0;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field6705 = 0;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field6714 = 0;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field6730 = 0;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    private static int field6721 = 0;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field6717 = 0;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field6704 = 0;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    private static int field6706;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    private static int field6708;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    private static int field6709;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field6712;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public int field6727;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public int field6728;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public int field6729;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    private static int field6735;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    private int[] field6715;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 3)
    public final void method180(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class570 arg7, int arg8, int arg9) {
        if (this.field6732.method2989()) {
            throw new IllegalStateException();
        } else if (this.method2832(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class169 var11 = (class169) arg7;
            this.method50(var11.field2929, var11.field2931, field6708 - arg8, -arg9 - (field6720 - field6735));
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFF)Z", line = 19)
    private final boolean method2832(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6728 + this.field6711 + this.field6712;
        int var8 = this.field6729 + this.field6725 + this.field6727;
        if (this.field6711 != var7 || this.field6725 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6729 * var11;
            float var14 = (float) this.field6729 * var12;
            float var15 = (float) this.field6728 * var9;
            float var16 = (float) this.field6728 * var10;
            float var17 = (float) this.field6712 * -var9;
            float var18 = (float) this.field6712 * -var10;
            float var19 = (float) this.field6727 * -var11;
            float var20 = (float) this.field6727 * -var12;
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
        if (var23 < (float) this.field6732.field7122) {
            var23 = this.field6732.field7122;
        }
        if (var24 > (float) this.field6732.field7088) {
            var24 = this.field6732.field7088;
        }
        if (var25 < (float) this.field6732.field7115) {
            var25 = this.field6732.field7115;
        }
        if (var26 > (float) this.field6732.field7095) {
            var26 = this.field6732.field7095;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field6724 = this.field6732.field7119;
        field6734 = (int) ((float) ((int) var25 * field6724) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6726 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6711 / var29);
        field6713 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6725 / var30);
        field6722 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6711 / var30);
        field6731 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6725 / var29);
        field6706 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6709 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6719 = (this.field6711 >> 1 << 12) + (field6722 * field6709 >> 4);
        field6723 = (this.field6725 >> 1 << 12) + (field6731 * field6709 >> 4);
        field6733 = field6726 * field6706 >> 4;
        field6716 = field6713 * field6706 >> 4;
        field6708 = (int) var23;
        field6718 = (int) var27;
        field6735 = (int) var25;
        field6720 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFIIII)V", line = 159)
    public final void method173(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field6732.method2989()) {
            throw new IllegalStateException();
        } else if (this.method2832(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field6707 = arg7;
            if (arg6 != 1) {
                field6704 = arg7 >>> 24;
                field6705 = 256 - field6704;
                if (arg6 == 0) {
                    field6717 = (arg7 & 0xFF0000) >> 16;
                    field6730 = (arg7 & 0xFF00) >> 8;
                    field6714 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field6710 = arg7 >>> 24;
                    field6721 = 256 - field6710;
                    int var11 = (arg7 & 0xFF00FF) * field6721 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field6721 & 0xFF0000;
                    field6703 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method45(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method45(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method45(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method45(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method45(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method45(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method45(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method45(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method45(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method45(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method45(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method45(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()I", line = 256)
    public final int method179() {
        return this.field6725;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V", line = 263)
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        this.field6728 = arg0;
        this.field6729 = arg1;
        this.field6712 = arg2;
        this.field6727 = arg3;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()I", line = 279)
    public final int method184() {
        return this.field6729 + this.field6725 + this.field6727;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()I", line = 290)
    public final int method177() {
        return this.field6728 + this.field6711 + this.field6712;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([I)V", line = 315)
    public final void method186(int[] arg0) {
        arg0[0] = this.field6728;
        arg0[1] = this.field6729;
        arg0[2] = this.field6712;
        arg0[3] = this.field6727;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()I", line = 327)
    public final int method175() {
        return this.field6711;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V", line = 339)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6732.method2989()) {
            throw new IllegalStateException();
        }
        if (this.field6715 == null) {
            this.field6715 = new int[4];
        }
        this.field6732.method331(this.field6715);
        this.field6732.method298(this.field6732.field7122, this.field6732.field7115, arg0 + arg2, arg1 + arg3);
        int var8 = this.method177();
        int var9 = this.method184();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method48(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6732.method240(this.field6715[0], this.field6715[1], this.field6715[2], this.field6715[3]);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lpga;II)V", line = 376)
    public class462(class491 arg0, int arg1, int arg2) {
        this.field6732 = arg0;
        this.field6711 = arg1;
        this.field6725 = arg2;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method52(int arg0, int arg1, class570 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([I[III)V")
    public abstract void method50(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
    public abstract void method48(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)V")
    public abstract void method45(int arg0, int arg1);
}
