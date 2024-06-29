import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class40 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lhh;")
    public static class163 field661 = class137.method1065("details", 17);

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field665 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "[I")
    public static int[] field666 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lmi;")
    public static class128 field662 = new class128();

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Z")
    public static boolean field669 = false;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
    public static boolean field670 = false;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lhh;")
    public static class163 field672 = class137.method1065("<)4col>", 17);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lpa;I)V")
    public static final void method278(class123 arg0, int arg1) {
        class45.field757 = arg0.method983(24108, class115.field2179);
        class59.field976 = arg0.method983(arg1 + 653676490, class171.field3145);
        field663++;
        class58.field947 = arg0.method983(arg1 + 653676490, class10.field161);
        class73.field1376 = arg0.method983(arg1 ^ 0xD90A504E, class50.field852);
        class122.field2329 = arg0.method983(24108, class225.field4074);
        class259.field4543 = arg0.method983(24108, class194.field3526);
        class93.field1760 = arg0.method983(24108, class89.field1641);
        class164.field3032 = arg0.method983(24108, class143.field2706);
        class168.field3085 = arg0.method983(24108, class8.field144);
        class177.field3226 = arg0.method983(24108, class179.field3254);
        class256.field4477 = arg0.method983(24108, class265.field4618);
        class169.field3094 = arg0.method983(arg1 + 653676490, class252.field4412);
        class252.field4409 = arg0.method983(arg1 + 653676490, class205.field3707);
        if (arg1 != -653652382) {
            method278((class123) null, -93);
        }
        class203.field3685 = arg0.method983(24108, class38.field644);
        class235.field4204 = arg0.method983(arg1 + 653676490, class179.field3253);
        class253.field4439 = arg0.method983(24108, class37.field624);
        arg0.method983(24108, class165.field3045);
        class71.field1347 = arg0.method983(arg1 + 653676490, class250.field4403);
        class145.field2749 = arg0.method983(24108, class174.field3173);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method279(byte arg0) {
        field672 = null;
        field662 = null;
        if (arg0 < 45) {
            field667 = -7;
        }
        field661 = null;
        field666 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lpg;B)V")
    public static final void method280(class81 arg0, byte arg1) {
        field668++;
        int var2 = class114.field2143 >> 2 << 10;
        int var3 = class176.field3218 >> 1;
        byte[][] var4 = new byte[class124.field2395][class58.field952];
        while (arg0.field1541 < arg0.field1562.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method622(true) == 1) {
                var33 = true;
                var34 = arg0.method622(true);
                var35 = arg0.method622(true);
            }
            int var36 = arg0.method622(true);
            int var37 = arg0.method622(true);
            int var38 = var36 * 64 - class54.field892;
            int var39 = class218.field3965 + class58.field952 - (var37 * 64) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && (var38 + 63) < class124.field2395 && class58.field952 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= var34 * 8 && (var34 * 8 + 8) > var40 && var42 >= (var35 * 8) && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg0.method635(-76);
                        }
                    }
                }
            } else if (var33) {
                arg0.field1541 += 64;
            } else {
                arg0.field1541 += 4096;
            }
        }
        int var5 = class124.field2395;
        if (arg1 >= -1) {
            method280((class81) null, (byte) -88);
        }
        int var6 = class58.field952;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class95 var29 = class115.method919(var28 - 1, -50);
                        var7[var13] += var29.field1798;
                        var10[var13] += var29.field1794;
                        var11[var13] += var29.field1792;
                        var9[var13] += var29.field1803;
                        var10002 = var8[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class95 var32 = class115.method919(var31 - 1, -97);
                        var7[var13] -= var32.field1798;
                        var10[var13] -= var32.field1794;
                        var11[var13] -= var32.field1792;
                        var9[var13] -= var32.field1803;
                        var10002 = var8[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class215.field3917[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var18 += var8[var21];
                        var19 += var11[var21];
                        var14 += var7[var21];
                        var17 += var9[var21];
                        var16 += var10[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var17 -= var9[var22];
                        var16 -= var10[var22];
                        var19 -= var11[var22];
                        var14 -= var7[var22];
                        var18 -= var8[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class234.method1621(var14 * 256 / var17, var19 / var18, -1, var16 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[(class7.method50(63, var20) << 6) + class7.method50(63, var12)] = class98.field1850[class211.method1507(96, (byte) 118, var26)];
                        } else if (var23 != null) {
                            var23[class7.method50(63, var12) + (class7.method50(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lpa;B)V")
    public static final void method281(class123 arg0, byte arg1) {
        if (arg1 != -51) {
            method278((class123) null, 72);
        }
        client.field1994 = arg0.method983(24108, class29.field462);
        field660++;
        class214.field3910 = arg0.method983(24108, class256.field4481);
        class196.field3539 = arg0.method983(24108, class159.field2938);
        class186.field3417 = arg0.method983(24108, class169.field3097);
    }
}
