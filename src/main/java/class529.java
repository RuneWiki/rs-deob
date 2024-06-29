import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class529 extends class581 {

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lcba;")
    public class576 field7706;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public int field7695;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field7684;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field7677 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field7676 = 0;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field7685 = 0;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    private static int field7698 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field7675 = 0;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field7705 = 0;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    private static int field7701 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field7707 = 0;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field7678;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public int field7679;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field7683;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    private static int field7693;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private static int field7697;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    private static int field7700;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private static int field7702;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[I")
    private int[] field7682;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()I", line = 8)
    public final int method997() {
        return this.field7684 + this.field7678 + this.field7696;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIIII)V", line = 18)
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7706.method4293()) {
            throw new IllegalStateException();
        }
        if (this.field7682 == null) {
            this.field7682 = new int[4];
        }
        this.field7706.method543(this.field7682);
        this.field7706.method522(this.field7706.field8547, this.field7706.field8521, arg0 + arg2, arg1 + arg3);
        int var8 = this.method988();
        int var9 = this.method997();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method999(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field7706.method489(this.field7682[0], this.field7682[1], this.field7682[2], this.field7682[3]);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I", line = 57)
    public final int method986() {
        return this.field7684;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([I)V", line = 64)
    public final void method994(int[] arg0) {
        arg0[0] = this.field7679;
        arg0[1] = this.field7678;
        arg0[2] = this.field7683;
        arg0[3] = this.field7696;
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()I", line = 71)
    public final int method991() {
        return this.field7695;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIII)V", line = 79)
    public final void method990(int arg0, int arg1, int arg2, int arg3) {
        this.field7679 = arg0;
        this.field7678 = arg1;
        this.field7683 = arg2;
        this.field7696 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 97)
    public final void method1001(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        if (this.field7706.method4293()) {
            throw new IllegalStateException();
        } else if (this.method3993(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class360 var11 = (class360) arg7;
            this.method3470(var11.field5504, var11.field5499, field7697 - arg8, -arg9 - (field7688 - field7700));
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()I", line = 120)
    public final int method988() {
        return this.field7695 + this.field7679 + this.field7683;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFF)Z", line = 125)
    private final boolean method3993(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field7695 + this.field7679 + this.field7683;
        int var8 = this.field7684 + this.field7678 + this.field7696;
        if (this.field7695 != var7 || this.field7684 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field7678 * var11;
            float var14 = (float) this.field7678 * var12;
            float var15 = (float) this.field7679 * var9;
            float var16 = (float) this.field7679 * var10;
            float var17 = (float) this.field7683 * -var9;
            float var18 = (float) this.field7683 * -var10;
            float var19 = (float) this.field7696 * -var11;
            float var20 = (float) this.field7696 * -var12;
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
        if (var23 < (float) this.field7706.field8547) {
            var23 = this.field7706.field8547;
        }
        if (var24 > (float) this.field7706.field8528) {
            var24 = this.field7706.field8528;
        }
        if (var25 < (float) this.field7706.field8521) {
            var25 = this.field7706.field8521;
        }
        if (var26 > (float) this.field7706.field8536) {
            var26 = this.field7706.field8536;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field7691 = this.field7706.field8533;
        field7692 = (int) ((float) ((int) var25 * field7691) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field7681 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field7695 / var29);
        field7680 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field7684 / var30);
        field7694 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field7695 / var30);
        field7699 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field7684 / var29);
        field7702 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field7693 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field7687 = (this.field7695 >> 1 << 12) + (field7694 * field7693 >> 4);
        field7686 = (this.field7684 >> 1 << 12) + (field7699 * field7693 >> 4);
        field7704 = field7702 * field7681 >> 4;
        field7690 = field7702 * field7680 >> 4;
        field7697 = (int) var23;
        field7689 = (int) var27;
        field7700 = (int) var25;
        field7688 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFFFFFIIII)V", line = 276)
    public final void method1000(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field7706.method4293()) {
            throw new IllegalStateException();
        } else if (this.method3993(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field7703 = arg7;
            if (arg6 != 1) {
                field7705 = arg7 >>> 24;
                field7675 = 256 - field7705;
                if (arg6 == 0) {
                    field7707 = (arg7 & 0xFF0000) >> 16;
                    field7677 = (arg7 & 0xFF00) >> 8;
                    field7685 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field7698 = arg7 >>> 24;
                    field7701 = 256 - field7698;
                    int var11 = (arg7 & 0xFF00FF) * field7701 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field7701 & 0xFF0000;
                    field7676 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method3472(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3472(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3472(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method3472(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3472(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3472(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method3472(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3472(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3472(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method3472(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method3472(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method3472(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lcba;II)V", line = 376)
    public class529(class576 arg0, int arg1, int arg2) {
        this.field7706 = arg0;
        this.field7695 = arg1;
        this.field7684 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method3471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([I[III)V")
    public abstract void method3470(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)V")
    public abstract void method3472(int arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
    public abstract void method999(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method989(int arg0, int arg1, class512 arg2, int arg3, int arg4);
}
