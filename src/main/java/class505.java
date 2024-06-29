import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class505 extends class52 {

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "Lhr;")
    public class446 field7021;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public int field7000;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field6998 = 0;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field7003 = 0;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field7013 = 0;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field7019 = 0;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    public static int field7020 = 0;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    private static int field7017 = 0;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    private static int field7008 = 0;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6999 = 0;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    private static int field6993;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public int field6995;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public int field7002;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    private static int field7005;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    private static int field7006;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    private static int field7012;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "[I")
    private int[] field6994;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "(IIIIIII)V", line = 4)
    public final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7021.method2609()) {
            throw new IllegalStateException();
        }
        if (this.field6994 == null) {
            this.field6994 = new int[4];
        }
        this.field7021.method1183(this.field6994);
        this.field7021.method1119(this.field7021.field6187, this.field7021.field6150, arg0 + arg2, arg1 + arg3);
        int var8 = this.method292();
        int var9 = this.method286();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method3(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field7021.method1107(this.field6994[0], this.field6994[1], this.field6994[2], this.field6994[3]);
    }

    @OriginalMember(owner = "client!ot", name = "ma", descriptor = "()I", line = 57)
    public final int method286() {
        return this.field7016 + this.field7009 + this.field6995;
    }

    @OriginalMember(owner = "client!ot", name = "la", descriptor = "()I", line = 68)
    public final int method290() {
        return this.field7016;
    }

    @OriginalMember(owner = "client!ot", name = "KA", descriptor = "(IIII)V", line = 76)
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        this.field7002 = arg0;
        this.field7009 = arg1;
        this.field7022 = arg2;
        this.field6995 = arg3;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FFFFFF)Z", line = 88)
    private final boolean method2911(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field7002 + this.field7000 + this.field7022;
        int var8 = this.field7016 + this.field7009 + this.field6995;
        if (this.field7000 != var7 || this.field7016 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field7009 * var11;
            float var14 = (float) this.field7009 * var12;
            float var15 = (float) this.field7002 * var9;
            float var16 = (float) this.field7002 * var10;
            float var17 = (float) this.field7022 * -var9;
            float var18 = (float) this.field7022 * -var10;
            float var19 = (float) this.field6995 * -var11;
            float var20 = (float) this.field6995 * -var12;
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
        if (var23 < (float) this.field7021.field6187) {
            var23 = this.field7021.field6187;
        }
        if (var24 > (float) this.field7021.field6184) {
            var24 = this.field7021.field6184;
        }
        if (var25 < (float) this.field7021.field6150) {
            var25 = this.field7021.field6150;
        }
        if (var26 > (float) this.field7021.field6167) {
            var26 = this.field7021.field6167;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field6996 = this.field7021.field6171;
        field7011 = (int) ((float) ((int) var25 * field6996) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field7018 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field7000 / var29);
        field6997 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field7016 / var30);
        field7024 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field7000 / var30);
        field7023 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field7016 / var29);
        field7012 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field7006 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field7010 = (this.field7000 >> 1 << 12) + (field7024 * field7006 >> 4);
        field7015 = (this.field7016 >> 1 << 12) + (field7023 * field7006 >> 4);
        field7014 = field7018 * field7012 >> 4;
        field7025 = field7012 * field6997 >> 4;
        field7005 = (int) var23;
        field7007 = (int) var27;
        field6993 = (int) var25;
        field7001 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ot", name = "CA", descriptor = "(FFFFFFIII)V", line = 233)
    public final void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field7021.method2609()) {
            throw new IllegalStateException();
        } else if (this.method2911(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field7004 = arg7;
            if (arg6 != 1) {
                field6998 = arg7 >>> 24;
                field7019 = 256 - field6998;
                if (arg6 == 0) {
                    field7020 = (arg7 & 0xFF0000) >> 16;
                    field7003 = (arg7 & 0xFF00) >> 8;
                    field7013 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field7008 = arg7 >>> 24;
                    field7017 = 256 - field7008;
                    int var10 = (arg7 & 0xFF00FF) * field7017 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field7017 & 0xFF0000;
                    field6999 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "EA", descriptor = "()I", line = 331)
    public final int method292() {
        return this.field7002 + this.field7000 + this.field7022;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "()I", line = 335)
    public final int method291() {
        return this.field7000;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lhr;II)V", line = 347)
    public class505(class446 arg0, int arg1, int arg2) {
        this.field7021 = arg0;
        this.field7000 = arg1;
        this.field7016 = arg2;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 357)
    public final void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8) {
        if (this.field7021.method2609()) {
            throw new IllegalStateException();
        } else if (this.method2911(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class300 var10 = (class300) arg6;
            this.method2(var10.field3849, var10.field3845, field7005 - arg7, -arg8 - (field7001 - field6993));
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
    public abstract void method1(int arg0, int arg1);

    @OriginalMember(owner = "client!ot", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([I[III)V")
    public abstract void method2(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ot", name = "DA", descriptor = "(IIIII)V")
    public abstract void method3(int arg0, int arg1, int arg2, int arg3, int arg4);
}
