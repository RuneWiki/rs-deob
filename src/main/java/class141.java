import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class141 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "[Ls;")
    public static class273[] field2185 = new class273[4];

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "J")
    public static long field2182;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1061(int arg0) {
        if (arg0 != 10) {
            method1064(-123, 8, 43, 61, (byte) 4);
        }
        field2185 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIIII)V", line = 22)
    public static final void method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2179++;
        if (arg3 != 935664710) {
            method1061(114);
        }
        int var11 = arg10 - arg8;
        int var12 = arg6 - arg9;
        int var13 = -1;
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg4;
        if (class261.field3862 > 0) {
            if (class27.field313 <= 10) {
                var13 = class27.field313 * 5;
            } else {
                var13 = (10 + 10 - class27.field313) * 5;
            }
        }
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var17 = arg7 * var16 + arg0 >> 16;
            int var18 = (var16 + 1) * arg7 + arg0 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg1 + var17;
                int var10000 = arg1 + var18;
                int var22 = arg8 + var16 >> 6;
                if (var22 >= 0 && var22 <= (class124.field1961.length - 1)) {
                    int[][] var23 = class124.field1961[var22];
                    for (int var24 = -var15; var24 < (var12 + var15); var24++) {
                        int var25 = (var24 + 1) * arg4 + arg5 >> 16;
                        int var26 = arg5 + (arg4 * var24) >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            int var28 = arg9 + var24 >> 6;
                            var10000 = arg2 + var25;
                            int var30 = arg2 + var26;
                            if (var28 >= 0 && var28 <= (var23.length - 1) && var23[var28] != null) {
                                int var31 = ((arg9 + var24 & 0x3F) << 6) + (var16 + arg8 & 0x3F);
                                int var32 = var23[var28][var31];
                                if (var32 != 0) {
                                    class101 var33 = class281.method1984(var32 - 1, false);
                                    if (!class322.field4997[var33.field1566]) {
                                        if (var13 != -1 && class107.field1644 == var33.field1566) {
                                            class113 var34 = new class113();
                                            var34.field1780 = var30;
                                            var34.field1782 = var33.field1566;
                                            var34.field1774 = var20;
                                            class59.field882.method977(4, var34);
                                        } else {
                                            class213.field3382[var33.field1566].method186(var20 - 7, var30 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class113 var35 = (class113) class59.field882.method986(false); var35 != null; var35 = (class113) class59.field882.method982(14877)) {
            class168.method1229(var35.field1774, var35.field1780, 15, 16776960, var13);
            class168.method1229(var35.field1774, var35.field1780, 13, 16776960, var13);
            class168.method1229(var35.field1774, var35.field1780, 11, 16776960, var13);
            class168.method1229(var35.field1774, var35.field1780, 9, 16776960, var13);
            class213.field3382[var35.field1782].method186(var35.field1774 - 7, var35.field1780 + -7);
        }
        class59.field882.method980(1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIILgd;IJZ)Z", line = 147)
    public static final boolean method1063(int arg0, int arg1, int arg2, int arg3, int arg4, class310 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class73.method605(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V", line = 182)
    public static final void method1064(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2183++;
        if (arg4 != 105) {
            field2182 = 7L;
        }
        for (int var5 = 0; var5 < class112.field1762; var5++) {
            if ((class245.field3687[var5] + class154.field2331[var5]) > arg1 && arg0 + arg1 > class154.field2331[var5] && (class304.field4765[var5] + class266.field3990[var5]) > arg2 && arg2 + arg3 > class304.field4765[var5]) {
                class40.field597[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 206)
    public static final void method1065(byte arg0) {
        int var1 = 96 % ((-arg0 - 43) / 49);
        field2180++;
        for (class152 var2 = (class152) class310.field4833.method986(false); var2 != null; var2 = (class152) class310.field4833.method982(14877)) {
            if (var2.field2284 == -1) {
                var2.field2282 = 0;
                class179.method1296(false, var2);
            } else {
                var2.method1554((byte) -35);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Z", line = 232)
    public static final boolean method1066(byte arg0, int arg1) {
        field2181++;
        if (arg0 >= -12) {
            field2185 = (class273[]) null;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)I", line = 244)
    public static final int method1067(byte arg0, int arg1) {
        field2184++;
        if (arg1 < 0) {
            return 0;
        }
        class278 var2 = (class278) class171.field2547.method203(1710, (long) arg1);
        if (var2 == null) {
            return class86.method714(arg1, (byte) -61).field1272;
        }
        int var3 = 0;
        if (arg0 != 112) {
            method1066((byte) 85, 52);
        }
        for (int var4 = 0; var4 < var2.field4272.length; var4++) {
            if (var2.field4272[var4] == -1) {
                var3++;
            }
        }
        return var3 + class86.method714(arg1, (byte) -58).field1272 - var2.field4272.length;
    }
}
