import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class163 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[[I")
    private int[][] field3059;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    private int field3060;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljd;")
    public static class86 field3061 = class122.method868("::replacecanvas", true);

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3065 = -1;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public final int method1180(int arg0, int arg1) {
        if (arg0 != 50) {
            method1182(-94);
        }
        field3057++;
        if (this.field3059 != null) {
            arg1 = (int) ((long) this.field3060 * (long) arg1 / (long) this.field3056) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lbj;III)Z")
    public static final boolean method1181(class151 arg0, int arg1, int arg2, int arg3) {
        field3064++;
        byte[] var4 = arg0.method1084((byte) -126, arg1, arg3);
        if (var4 == null) {
            return false;
        } else {
            class143.method1021(0, var4);
            return arg2 == 10475;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field3061 = null;
        int var1 = 51 / ((11 - arg0) / 32);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljb;ILjb;)V")
    public static final void method1183(class256 arg0, int arg1, class256 arg2) {
        if (arg2.field4546 != null) {
            arg2.method1728(1000);
        }
        field3066++;
        if (arg1 != 7) {
            method1184((class236) null, -92, -112, 105, 75, -20, -70, -38, true);
        }
        arg2.field4545 = arg0.field4545;
        arg2.field4546 = arg0;
        arg2.field4546.field4545 = arg2;
        arg2.field4545.field4546 = arg2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lpj;IIIIIIIZ)V")
    public static final void method1184(class236 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class81.field1591;
        int var11;
        int var12 = var11 = (arg7 << 7) - class191.field3389;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class35.field796[arg1][arg6][arg7] - class205.field3697;
        int var18 = class35.field796[arg1][arg6 + 1][arg7] - class205.field3697;
        int var19 = class35.field796[arg1][arg6 + 1][arg7 + 1] - class205.field3697;
        int var20 = class35.field796[arg1][arg6][arg7 + 1] - class205.field3697;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class145.field2752;
        int var46 = (var24 << 9) / var25 + class145.field2758;
        int var47 = (var27 << 9) / var31 + class145.field2752;
        int var48 = (var30 << 9) / var31 + class145.field2758;
        int var49 = (var33 << 9) / var37 + class145.field2752;
        int var50 = (var36 << 9) / var37 + class145.field2758;
        int var51 = (var39 << 9) / var43 + class145.field2752;
        int var52 = (var42 << 9) / var43 + class145.field2758;
        class145.field2755 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class243.field4352 && class39.method326(class145.field2752 + class139.field2651, class160.field3007 + class145.field2758, var50, var52, var48, var49, var51, var47)) {
                class38.field897 = arg6;
                class46.field1026 = arg7;
            }
            if (!arg8) {
                class145.field2749 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class145.field2753 || var51 > class145.field2753 || var47 > class145.field2753) {
                    class145.field2749 = true;
                }
                if (arg0.field4266 == -1) {
                    if (arg0.field4264 != 12345678) {
                        class145.method1041(var50, var52, var48, var49, var51, var47, arg0.field4264, arg0.field4263, arg0.field4268);
                    }
                } else if (!class107.field2061) {
                    int var53 = class145.field2756.method188((byte) -96, arg0.field4266);
                    class145.method1041(var50, var52, var48, var49, var51, var47, class247.method1677(var53, arg0.field4264), class247.method1677(var53, arg0.field4263), class247.method1677(var53, arg0.field4268));
                } else if (arg0.field4258) {
                    class145.method1037(var50, var52, var48, var49, var51, var47, arg0.field4264, arg0.field4263, arg0.field4268, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4266);
                } else {
                    class145.method1037(var50, var52, var48, var49, var51, var47, arg0.field4264, arg0.field4263, arg0.field4268, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4266);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class243.field4352 && class39.method326(class145.field2752 + class139.field2651, class160.field3007 + class145.field2758, var46, var48, var52, var45, var47, var51)) {
            class38.field897 = arg6;
            class46.field1026 = arg7;
        }
        if (arg8) {
            return;
        }
        class145.field2749 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class145.field2753 || var47 > class145.field2753 || var51 > class145.field2753) {
            class145.field2749 = true;
        }
        if (arg0.field4266 != -1) {
            if (class107.field2061) {
                class145.method1037(var46, var48, var52, var45, var47, var51, arg0.field4267, arg0.field4268, arg0.field4263, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4266);
                return;
            }
            int var54 = class145.field2756.method188((byte) -119, arg0.field4266);
            class145.method1041(var46, var48, var52, var45, var47, var51, class247.method1677(var54, arg0.field4267), class247.method1677(var54, arg0.field4268), class247.method1677(var54, arg0.field4263));
        } else if (arg0.field4267 != 12345678) {
            class145.method1041(var46, var48, var52, var45, var47, var51, arg0.field4267, arg0.field4268, arg0.field4263);
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
    public final int method1185(int arg0, byte arg1) {
        if (arg1 > -27) {
            return 24;
        }
        field3062++;
        if (this.field3059 != null) {
            arg0 = (int) ((long) this.field3060 * (long) arg0 / (long) this.field3056);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1186(int arg0, byte[] arg1) {
        if (arg0 < 37) {
            return null;
        }
        if (this.field3059 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3060 / (long) this.field3056) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field3059[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field3060 + var6;
                int var14 = var13 / this.field3056;
                var6 = var13 - this.field3056 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field3058++;
        return arg1;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
    public class163(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class30.method200(-1, arg0, arg1);
            int var4 = arg0 / var3;
            this.field3056 = var4;
            this.field3059 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field3060 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field3059[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
