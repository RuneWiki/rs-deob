import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class6 extends class461 {

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lfv;")
    public class107 field41;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private static int field43 = 0;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    private static int field52 = 0;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private static int field27;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private static int field28;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    private static int field40;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private static int field55;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
    private int[] field36;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 6)
    public final void method22(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class212 arg6, int arg7, int arg8) {
        if (this.field41.method813()) {
            throw new IllegalStateException();
        } else if (this.method28(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class291 var10 = (class291) arg6;
            this.method25(var10.field4386, var10.field4384, field27 - arg7, -arg8 - (field34 - field28));
        }
    }

    @OriginalMember(owner = "client!ie", name = "sa", descriptor = "(FFFFFFIII)V", line = 22)
    public final void method24(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field41.method813()) {
            throw new IllegalStateException();
        } else if (this.method28(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field38 = arg7;
            if (arg6 != 1) {
                field48 = arg7 >>> 24;
                field45 = 256 - field48;
                if (arg6 == 0) {
                    field31 = (arg7 & 0xFF0000) >> 16;
                    field33 = (arg7 & 0xFF00) >> 8;
                    field53 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field43 = arg7 >>> 24;
                    field52 = 256 - field43;
                    int var10 = (arg7 & 0xFF00FF) * field52 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field52 & 0xFF0000;
                    field42 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method27(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method27(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method27(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method27(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method27(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method27(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method27(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method27(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method27(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method27(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method27(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method27(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I", line = 126)
    public final int method26() {
        return this.field26;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(FFFFFF)Z", line = 137)
    private final boolean method28(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field46 + this.field32 + this.field47;
        int var8 = this.field37 + this.field26 + this.field44;
        if (this.field46 != var7 || this.field26 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field37 * var11;
            float var14 = (float) this.field37 * var12;
            float var15 = (float) this.field32 * var9;
            float var16 = (float) this.field32 * var10;
            float var17 = (float) this.field47 * -var9;
            float var18 = (float) this.field47 * -var10;
            float var19 = (float) this.field44 * -var11;
            float var20 = (float) this.field44 * -var12;
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
        if (var23 < (float) this.field41.field1440) {
            var23 = this.field41.field1440;
        }
        if (var24 > (float) this.field41.field1446) {
            var24 = this.field41.field1446;
        }
        if (var25 < (float) this.field41.field1470) {
            var25 = this.field41.field1470;
        }
        if (var26 > (float) this.field41.field1450) {
            var26 = this.field41.field1450;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field50 = this.field41.field1453;
        field35 = (int) ((float) ((int) var25 * field50) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field54 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field46 / var29);
        field29 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field26 / var30);
        field51 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field46 / var30);
        field57 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field26 / var29);
        field40 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field55 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field39 = (this.field46 >> 1 << 12) + (field55 * field51 >> 4);
        field56 = (this.field26 >> 1 << 12) + (field57 * field55 >> 4);
        field49 = field54 * field40 >> 4;
        field58 = field40 * field29 >> 4;
        field27 = (int) var23;
        field30 = (int) var27;
        field28 = (int) var25;
        field34 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()I", line = 281)
    public final int method29() {
        return this.field37 + this.field26 + this.field44;
    }

    @OriginalMember(owner = "client!ie", name = "QA", descriptor = "()I", line = 290)
    public final int method31() {
        return this.field46;
    }

    @OriginalMember(owner = "client!ie", name = "ba", descriptor = "(IIIIIII)V", line = 299)
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field41.method813()) {
            throw new IllegalStateException();
        }
        if (this.field36 == null) {
            this.field36 = new int[4];
        }
        this.field41.method416(this.field36);
        this.field41.method433(this.field41.field1440, this.field41.field1470, arg0 + arg2, arg1 + arg3);
        int var8 = this.method33();
        int var9 = this.method29();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method30(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field41.method442(this.field36[0], this.field36[1], this.field36[2], this.field36[3]);
    }

    @OriginalMember(owner = "client!ie", name = "AA", descriptor = "()I", line = 340)
    public final int method33() {
        return this.field46 + this.field32 + this.field47;
    }

    @OriginalMember(owner = "client!ie", name = "EA", descriptor = "(IIII)V", line = 350)
    public final void method34(int arg0, int arg1, int arg2, int arg3) {
        this.field32 = arg0;
        this.field37 = arg1;
        this.field47 = arg2;
        this.field44 = arg3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lfv;II)V", line = 361)
    public class6(class107 arg0, int arg1, int arg2) {
        this.field41 = arg0;
        this.field46 = arg1;
        this.field26 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILfa;II)V")
    public abstract void method23(int arg0, int arg1, class212 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[III)V")
    public abstract void method25(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
    public abstract void method27(int arg0, int arg1);

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "(IIIII)V")
    public abstract void method30(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ie", name = "KA", descriptor = "(IIIIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
