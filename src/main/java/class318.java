import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class318 extends class191 {

    @OriginalMember(owner = "client!hb", name = "kb", descriptor = "[I")
    public static int[] field4903 = new int[1000];

    @OriginalMember(owner = "client!hb", name = "lb", descriptor = "[Ljava/lang/String;")
    public static String[] field4904 = new String[500];

    @OriginalMember(owner = "client!hb", name = "ob", descriptor = "J")
    public static long field4907 = 0L;

    @OriginalMember(owner = "client!hb", name = "pb", descriptor = "[Ld;")
    public static class40[] field4908 = new class40[4];

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "F")
    public static float field4902;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!hb", name = "mb", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!hb", name = "nb", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 6)
    public static final void method2246(byte arg0) {
        int var1 = class243.method1832((byte) 95);
        if (var1 == 0) {
            class157.field2521 = (byte[][][]) null;
            class360.method2524(1172, 0);
        } else if (var1 == 1) {
            class119.method1010((byte) 0, (byte) -125);
            class360.method2524(1172, 512);
            if (class146.field2386 != null) {
                class293.method2118(arg0 ^ 0x40086421);
            }
        } else {
            class119.method1010((byte) (class192.field3027 - 4 & 0xFF), (byte) -122);
            class360.method2524(1172, 2);
        }
        if (arg0 != 0) {
            field4907 = 115L;
        }
        class50.field781 = class119.field1826;
        field4901++;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V", line = 51)
    public static void method2247(byte arg0) {
        field4903 = null;
        int var1 = -71 / ((arg0 + 16) / 60);
        field4904 = null;
        field4908 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIII)V", line = 67)
    public static final void method2248(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -55) {
            field4908 = (class40[]) null;
        }
        if (arg3 >= class43.field693 && class128.field2130 >= arg3) {
            int var5 = class268.method1965(arg4, class284.field4385, class328.field5042, -91);
            int var6 = class268.method1965(arg2, class284.field4385, class328.field5042, -84);
            class104.method904(arg3, var5, 1, var6, arg1);
        }
        field4905++;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)[[I", line = 85)
    public final int[][] method156(int arg0, byte arg1) {
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 >= -126) {
            this.method156(-60, (byte) 51);
        }
        if (this.field1227.field4277 && this.method1459(0)) {
            int[] var4 = var3[0];
            int var5 = arg0 % this.field2995 * this.field2995;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class93.field1424; var8++) {
                int var9 = this.field2997[var8 % this.field2999 + var5];
                var6[var8] = class301.method2169(var9 << 4, 4080);
                var7[var8] = class301.method2169(4080, var9 >> 4);
                var4[var8] = class301.method2169(4080, var9 >> 12);
            }
        }
        field4909++;
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V", line = 150)
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4899++;
        class283.method2059(arg4, class133.field2235[arg2], (byte) 102, arg0 + arg3, -arg0 + arg3);
        int var5 = 0;
        if (arg1 != 50) {
            field4904 = (String[]) null;
        }
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class133.field2235[arg2 + var6];
                var7 -= var6 << 1;
                int var10 = arg3 + var5;
                int var11 = arg3 - var5;
                int[] var12 = class133.field2235[arg2 - var6];
                class283.method2059(arg4, var9, (byte) 103, var10, var11);
                class283.method2059(arg4, var12, (byte) 90, var10, var11);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class133.field2235[arg2 + var5];
            int[] var16 = class133.field2235[arg2 - var5];
            class283.method2059(arg4, var15, (byte) 112, var13, var14);
            class283.method2059(arg4, var16, (byte) 90, var13, var14);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lmd;IIIIIIIZ)V", line = 205)
    public static final void method2250(class348 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class205.field3165;
        int var11;
        int var12 = var11 = (arg7 << 7) - class190.field2977;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class277.field4290[arg1][arg6][arg7] - class215.field3371;
        int var18 = class277.field4290[arg1][arg6 + 1][arg7] - class215.field3371;
        int var19 = class277.field4290[arg1][arg6 + 1][arg7 + 1] - class215.field3371;
        int var20 = class277.field4290[arg1][arg6][arg7 + 1] - class215.field3371;
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
        int var45 = (var21 << 9) / var25 + class107.field1617;
        int var46 = (var24 << 9) / var25 + class107.field1614;
        int var47 = (var27 << 9) / var31 + class107.field1617;
        int var48 = (var30 << 9) / var31 + class107.field1614;
        int var49 = (var33 << 9) / var37 + class107.field1617;
        int var50 = (var36 << 9) / var37 + class107.field1614;
        int var51 = (var39 << 9) / var43 + class107.field1617;
        int var52 = (var42 << 9) / var43 + class107.field1614;
        class107.field1607 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class197.field3081 && class22.method233(class226.field3533 + class107.field1617, class91.field1352 + class107.field1614, var50, var52, var48, var49, var51, var47)) {
                class282.field4366 = arg6;
                class274.field4254 = arg7;
            }
            if (!class240.field3737 && !arg8) {
                class107.field1609 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class107.field1608 || var51 > class107.field1608 || var47 > class107.field1608) {
                    class107.field1609 = true;
                }
                if (arg0.field5526 == -1) {
                    if (arg0.field5532 != 12345678) {
                        class107.method934(var50, var52, var48, var49, var51, var47, arg0.field5532, arg0.field5531, arg0.field5520);
                    }
                } else if (!class290.field4504) {
                    int var53 = class107.field1619.method760(arg0.field5526, 1);
                    class107.method934(var50, var52, var48, var49, var51, var47, class138.method1149(var53, arg0.field5532), class138.method1149(var53, arg0.field5531), class138.method1149(var53, arg0.field5520));
                } else if (arg0.field5527) {
                    class107.method938(var50, var52, var48, var49, var51, var47, arg0.field5532, arg0.field5531, arg0.field5520, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5526);
                } else {
                    class107.method938(var50, var52, var48, var49, var51, var47, arg0.field5532, arg0.field5531, arg0.field5520, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field5526);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class197.field3081 && class22.method233(class226.field3533 + class107.field1617, class91.field1352 + class107.field1614, var46, var48, var52, var45, var47, var51)) {
            class282.field4366 = arg6;
            class274.field4254 = arg7;
        }
        if (class240.field3737 || arg8) {
            return;
        }
        class107.field1609 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class107.field1608 || var47 > class107.field1608 || var51 > class107.field1608) {
            class107.field1609 = true;
        }
        if (arg0.field5526 == -1) {
            if (arg0.field5522 != 12345678) {
                class107.method934(var46, var48, var52, var45, var47, var51, arg0.field5522, arg0.field5520, arg0.field5531);
            }
        } else if (class290.field4504) {
            class107.method938(var46, var48, var52, var45, var47, var51, arg0.field5522, arg0.field5520, arg0.field5531, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field5526);
        } else {
            int var54 = class107.field1619.method760(arg0.field5526, 1);
            class107.method934(var46, var48, var52, var45, var47, var51, class138.method1149(var54, arg0.field5522), class138.method1149(var54, arg0.field5520), class138.method1149(var54, arg0.field5531));
        }
    }
}
