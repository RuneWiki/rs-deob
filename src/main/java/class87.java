import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class87 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[J")
    public static long[] field1314 = new long[200];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lkb;II)[Lag;", line = 4)
    public static final class123[] method630(class39 arg0, int arg1, int arg2) {
        if (arg1 != -28306) {
            field1314 = (long[]) null;
        }
        field1313++;
        return class221.method1609(arg0, arg1 + 33588, arg2) ? class81.method597((byte) -70) : null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V", line = 19)
    public static final void method631(int arg0, byte arg1) {
        if (arg1 == 2) {
            field1315++;
            class283.field4467.method1625(arg0, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIZIIIIII)V", line = 31)
    public static final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg7 - arg6;
        field1312++;
        if (arg11 != -21890) {
            method630((class39) null, 80, 5);
        }
        int var13 = arg1 - arg10;
        int var14 = -1;
        if (class198.field3246 > 0) {
            if (class232.field3713 > 10) {
                var14 = (10 + 10 - class232.field3713) * 5;
            } else {
                var14 = class232.field3713 * 5;
            }
        }
        int var15 = 983040 / arg8;
        int var16 = 983040 / arg0;
        for (int var17 = -var16; var17 < var12 + var16; var17++) {
            int var18 = arg0 * var17 + arg4 >> 16;
            int var19 = (var17 + 1) * arg0 + arg4 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg3 + var19;
                int var22 = arg3 + var18;
                int var23 = var17 + arg6 >> 6;
                if (var23 >= 0 && var23 <= (class34.field456.length - 1)) {
                    int[][] var24 = class34.field456[var23];
                    for (int var25 = -var15; var25 < var13 + var15; var25++) {
                        int var26 = (var25 + 1) * arg8 + arg9 >> 16;
                        int var27 = arg8 * var25 + arg9 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            int var29 = arg2 + var27;
                            var10000 = arg2 + var26;
                            int var31 = arg10 + var25 >> 6;
                            if (var31 >= 0 && var31 <= var24.length - 1 && var24[var31] != null) {
                                int var32 = (arg10 + var25 & 0x3F << 6) + (arg6 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class149 var34 = class291.method2043(var33 - 1, 23006);
                                    if (!class231.field3700[var34.field2227]) {
                                        if (var14 != -1 && class272.field4327 == var34.field2227) {
                                            class115 var35 = new class115();
                                            var35.field1728 = var22;
                                            var35.field1727 = var29;
                                            var35.field1735 = var34.field2227;
                                            class98.field1493.method1815((byte) -128, var35);
                                        } else {
                                            class157.field2425[var34.field2227].method84(var22 - 7, var29 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class115 var36 = (class115) class98.field1493.method1807((byte) 121); var36 != null; var36 = (class115) class98.field1493.method1808(18051)) {
            class216.method1576(var36.field1728, var36.field1727, 15, 16776960, var14);
            class216.method1576(var36.field1728, var36.field1727, 13, 16776960, var14);
            class216.method1576(var36.field1728, var36.field1727, 11, 16776960, var14);
            class216.method1576(var36.field1728, var36.field1727, 9, 16776960, var14);
            class157.field2425[var36.field1735].method84(var36.field1728 - 7, var36.field1727 - 7);
        }
        class98.field1493.method1811((byte) 25);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILok;I)V", line = 160)
    public static final void method633(int arg0, int arg1, int arg2, class160 arg3, int arg4) {
        if (class186.field2991) {
            class344.method2376(arg0, arg4, arg3.field2458 + arg0, arg3.field2590 + arg4);
        }
        if (class258.field4087 >= 3) {
            if (class186.field2991) {
                class321 var5 = arg3.method1100(false, 127);
                if (var5 != null) {
                    var5.method84(arg0, arg4);
                }
            } else {
                class216.method1581(arg0, arg4, 0, arg3.field2569, arg3.field2438);
            }
        } else if (class186.field2991) {
            ((class14) class4.field32).method91(arg0, arg4, arg3.field2458, arg3.field2590, class4.field32.field5040 / 2, class4.field32.field5030 / 2, (int) class312.field4862, 256, (class14) arg3.method1100(false, arg2 + 121));
        } else {
            ((class298) class4.field32).method604(arg0, arg4, arg3.field2458, arg3.field2590, class4.field32.field5040 / 2, class4.field32.field5030 / 2, (int) class312.field4862, 256, arg3.field2569, arg3.field2438);
        }
        if (arg2 != 2) {
            field1314 = (long[]) null;
        }
        field1317++;
        class237.field3748[arg1] = true;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)I", line = 201)
    public static final int method634(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & arg1;
        field1318++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V", line = 226)
    public static final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1316++;
        int var7 = arg3 + arg5;
        int var8 = arg0 - arg3;
        int var9 = arg2 + arg3;
        if (arg1 != 3) {
            method634(39, -13, -1, -128);
        }
        int var10 = arg6 - arg3;
        for (int var11 = arg5; var11 < var7; var11++) {
            class245.method1738(48, class310.field4841[var11], arg6, arg2, arg4);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class245.method1738(48, class310.field4841[var12], arg6, arg2, arg4);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class310.field4841[var13];
            class245.method1738(arg1 + 45, var14, var9, arg2, arg4);
            class245.method1738(48, var14, arg6, var10, arg4);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 270)
    public static void method636(int arg0) {
        if (arg0 != 256) {
            method631(16, (byte) 47);
        }
        field1314 = null;
    }
}
