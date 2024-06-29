import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class205 extends class72 {

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "[I")
    private int[] field2853 = new int[this.field964];

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "F")
    public static float field2851;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "[B")
    private byte[] field2848;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method536(int arg0, int arg1, byte arg2) {
        this.field2846 += this.field2853[arg0] * arg1 >> 12;
        field2854++;
        if (arg2 >= -17) {
            method1492((class104) null, 60, 96, -23, -83, 95, -53, 52, true);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 17)
    public final void method531(byte arg0) {
        this.field2846 = Math.abs(this.field2846);
        field2852++;
        if (this.field2846 >= 4096) {
            this.field2846 = 4095;
        }
        this.method562(this.field2847++, (byte) (this.field2846 >> 4));
        int var2 = 3 % ((arg0 - 61) / 35);
        this.field2846 = 0;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V", line = 33)
    public static final void method1488(byte arg0) {
        class48.field637 = null;
        class297.field4308 = -1;
        if (arg0 >= 51) {
            field2855++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V", line = 45)
    public void method562(int arg0, byte arg1) {
        field2858++;
        this.field2848[this.field2847++] = (byte) (class335.method2339(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([JBII[Ljava/lang/Object;)V", line = 54)
    public static final void method1489(long[] arg0, byte arg1, int arg2, int arg3, Object[] arg4) {
        int var5 = 82 / ((74 - arg1) / 47);
        field2857++;
        if (arg3 >= arg2) {
            return;
        }
        int var6 = (arg2 + arg3) / 2;
        int var7 = arg3;
        long var8 = arg0[var6];
        arg0[var6] = arg0[arg2];
        arg0[arg2] = var8;
        Object var10 = arg4[var6];
        arg4[var6] = arg4[arg2];
        arg4[arg2] = var10;
        for (int var11 = arg3; var11 < arg2; var11++) {
            if (arg0[var11] < ((long) (var11 & 0x1) + var8)) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7++] = var14;
            }
        }
        arg0[arg2] = arg0[var7];
        arg0[var7] = var8;
        arg4[arg2] = arg4[var7];
        arg4[var7] = var10;
        method1489(arg0, (byte) -50, var7 - 1, arg3, arg4);
        method1489(arg0, (byte) -71, arg2, var7 + 1, arg4);
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V", line = 106)
    public static final void method1490(byte arg0) {
        if (arg0 > -93) {
            method1489((long[]) null, (byte) -86, -80, 101, (Object[]) null);
        }
        class292.field4250 = null;
        field2850++;
        class154.field2142 = null;
        class336.field5255 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 121)
    public final void method534(int arg0) {
        field2849++;
        this.field2847 = 0;
        if (arg0 != 255) {
            this.field2853 = (int[]) null;
        }
        this.field2846 = 0;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILfh;)V", line = 140)
    public static final void method1491(int arg0, class140 arg1) {
        class304.field4451 = arg1.method1079(false, "titlebg");
        if (arg0 != -2232) {
            method1491(115, (class140) null);
        }
        field2856++;
        class32.field382 = arg1.method1079(false, "logo");
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lqf;IIIIIIIZ)V", line = 157)
    public static final void method1492(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class181.field2479;
        int var11;
        int var12 = var11 = (arg7 << 7) - class338.field5269;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class74.field978[arg1][arg6][arg7] - class125.field1659;
        int var18 = class74.field978[arg1][arg6 + 1][arg7] - class125.field1659;
        int var19 = class74.field978[arg1][arg6 + 1][arg7 + 1] - class125.field1659;
        int var20 = class74.field978[arg1][arg6][arg7 + 1] - class125.field1659;
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
        int var45 = (var21 << 9) / var25 + class350.field5461;
        int var46 = (var24 << 9) / var25 + class350.field5464;
        int var47 = (var27 << 9) / var31 + class350.field5461;
        int var48 = (var30 << 9) / var31 + class350.field5464;
        int var49 = (var33 << 9) / var37 + class350.field5461;
        int var50 = (var36 << 9) / var37 + class350.field5464;
        int var51 = (var39 << 9) / var43 + class350.field5461;
        int var52 = (var42 << 9) / var43 + class350.field5464;
        class350.field5469 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class95.field1242 && class49.method385(class350.field5461 + class32.field373, class350.field5464 + class102.field1325, var50, var52, var48, var49, var51, var47)) {
                class327.field4773 = arg6;
                class336.field5258 = arg7;
            }
            if (!class47.field623 && !arg8) {
                class350.field5466 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class350.field5477 || var51 > class350.field5477 || var47 > class350.field5477) {
                    class350.field5466 = true;
                }
                if (arg0.field1349 == -1) {
                    if (arg0.field1352 != 12345678) {
                        class350.method2426(var50, var52, var48, var49, var51, var47, arg0.field1352, arg0.field1355, arg0.field1348);
                    }
                } else if (!class40.field506) {
                    int var53 = class350.field5467.method907(arg0.field1349, 65535);
                    class350.method2426(var50, var52, var48, var49, var51, var47, class32.method201(var53, arg0.field1352), class32.method201(var53, arg0.field1355), class32.method201(var53, arg0.field1348));
                } else if (arg0.field1354) {
                    class350.method2441(var50, var52, var48, var49, var51, var47, arg0.field1352, arg0.field1355, arg0.field1348, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1349);
                } else {
                    class350.method2441(var50, var52, var48, var49, var51, var47, arg0.field1352, arg0.field1355, arg0.field1348, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1349);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class95.field1242 && class49.method385(class350.field5461 + class32.field373, class350.field5464 + class102.field1325, var46, var48, var52, var45, var47, var51)) {
            class327.field4773 = arg6;
            class336.field5258 = arg7;
        }
        if (class47.field623 || arg8) {
            return;
        }
        class350.field5466 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class350.field5477 || var47 > class350.field5477 || var51 > class350.field5477) {
            class350.field5466 = true;
        }
        if (arg0.field1349 == -1) {
            if (arg0.field1350 != 12345678) {
                class350.method2426(var46, var48, var52, var45, var47, var51, arg0.field1350, arg0.field1348, arg0.field1355);
            }
        } else if (class40.field506) {
            class350.method2441(var46, var48, var52, var45, var47, var51, arg0.field1350, arg0.field1348, arg0.field1355, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1349);
        } else {
            int var54 = class350.field5467.method907(arg0.field1349, 65535);
            class350.method2426(var46, var48, var52, var45, var47, var51, class32.method201(var54, arg0.field1350), class32.method201(var54, arg0.field1348), class32.method201(var54, arg0.field1355));
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIF)V", line = 321)
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field964; var7++) {
            this.field2853[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}
