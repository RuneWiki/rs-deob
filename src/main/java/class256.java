import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class256 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
    private int[] field4488;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[I")
    private int[] field4491;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ln;")
    private class135 field4490;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Ln;")
    private class135 field4489;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Ln;")
    private class135[] field4487;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field4492 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ls;")
    public static class227 field4497 = new class227(100);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field4498 = 50;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[Lqj;")
    public static class196[] field4503 = new class196[100];

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "J")
    public static long field4500 = 0L;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lqj;")
    public static class196 field4506 = class80.method502("runes", -48);

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lqj;")
    public static class196 field4504 = class80.method502(" loggt sich aus)3", -48);

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILbk;BI)Lub;")
    public static final class43 method1718(int arg0, class136 arg1, byte arg2, int arg3) {
        if (arg2 <= 115) {
            method1723(-119, false, 113, -86, -20);
        }
        field4493++;
        return class84.method528(arg1, arg3, arg0, 0) ? class143.method882(0) : null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lbk;Lkc;B)Z")
    public final boolean method1719(class136 arg0, class222 arg1, byte arg2) {
        field4495++;
        for (int var4 = 0; var4 < this.field4491.length; var4++) {
            if (!arg0.method838((byte) 23, this.field4491[var4])) {
                return false;
            }
        }
        int var5 = 0;
        if (arg2 != -65) {
            this.method1719(null, null, (byte) 9);
        }
        while (this.field4488.length > var5) {
            if (!arg1.method1213(this.field4488[var5], (byte) -52)) {
                return false;
            }
            var5++;
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILkc;IZZLbk;DZ)[I")
    public final int[] method1720(int arg0, class222 arg1, int arg2, boolean arg3, boolean arg4, class136 arg5, double arg6, boolean arg7) {
        class51.method268(arg6, -2894);
        class18.field215 = arg5;
        field4499++;
        class216.field3890 = arg1;
        int[] var10 = new int[arg0 * arg2];
        class84.method525(arg7, arg0, arg2);
        for (int var11 = 0; var11 < this.field4487.length; var11++) {
            this.field4487[var11].method814(arg0, -256, arg2);
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var13 = -1;
            var14 = arg2 - 1;
            var12 = -1;
        } else {
            var12 = arg2;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4490.field1962) {
                int[] var22 = this.field4490.method99(var16, false);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field4490.method164(260028743, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var21[var23] >> 4;
                int var26 = var19[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class183.field3217[var24];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class183.field3217[var26];
                int var29 = class183.field3217[var25];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg3) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4487.length; var17++) {
            this.field4487[var17].method517(!arg7);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method1721(int arg0) {
        field4503 = null;
        field4506 = null;
        field4504 = null;
        if (arg0 != 0) {
            field4506 = null;
        }
        field4497 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lca;")
    public static final class116 method1722(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        return var3 == null || var3.field818 == null ? null : var3.field818;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZIII)V")
    public static final void method1723(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4494++;
        for (class72 var5 = (class72) class62.field852.method1651((byte) -93); var5 != null; var5 = (class72) class62.field852.method1656(-25)) {
            class226.method1527(arg2, arg0, arg4, arg3, (byte) 50, var5);
        }
        if (arg1) {
            return;
        }
        for (class72 var6 = (class72) class223.field3995.method1651((byte) -13); var6 != null; var6 = (class72) class223.field3995.method1656(-117)) {
            byte var10 = 1;
            if (var6.field1042.field2091 == var6.field1042.field2063) {
                var10 = 0;
            } else if (var6.field1042.field2065 == var6.field1042.field2063) {
                var10 = 2;
            }
            if (var6.field1029 != var10) {
                int var11 = class90.method554(var6.field1042, 123);
                if (var6.field1039 != var11) {
                    if (var6.field1019 != null) {
                        class161.field2589.method690(var6.field1019);
                        var6.field1019 = null;
                    }
                    var6.field1039 = var11;
                }
                var6.field1029 = var10;
            }
            var6.field1033 = var6.field1042.field2049 * 64 + var6.field1042.field2085;
            var6.field1047 = var6.field1042.field2049 * 64 + var6.field1042.field2081;
            var6.field1021 = var6.field1042.field2081;
            var6.field1028 = var6.field1042.field2085;
            class226.method1527(arg2, arg0, arg4, arg3, (byte) 50, var6);
        }
        for (class72 var7 = (class72) class35.field423.method1554(6539); var7 != null; var7 = (class72) class35.field423.method1547(342)) {
            byte var8 = 1;
            if (var7.field1016.field2091 == var7.field1016.field2063) {
                var8 = 0;
            } else if (var7.field1016.field2065 == var7.field1016.field2063) {
                var8 = 2;
            }
            if (var7.field1029 != var8) {
                int var9 = class201.method1357(-78, var7.field1016);
                if (var7.field1039 != var9) {
                    if (var7.field1019 != null) {
                        class161.field2589.method690(var7.field1019);
                        var7.field1019 = null;
                    }
                    var7.field1039 = var9;
                }
                var7.field1029 = var8;
            }
            var7.field1028 = var7.field1016.field2085;
            var7.field1047 = var7.field1016.field2049 * 64 + var7.field1016.field2081;
            var7.field1021 = var7.field1016.field2081;
            var7.field1033 = var7.field1016.field2049 * 64 + var7.field1016.field2085;
            class226.method1527(arg2, arg0, arg4, arg3, (byte) 50, var7);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class118.method721((byte) 116, arg1);
        field4502++;
        int var7 = 0;
        int var8 = arg1 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        if (arg6 != 23433) {
            return;
        }
        int var11 = -var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = var8;
        int[] var15 = class95.field1380[arg5];
        int var16 = arg0 - var8;
        int var17 = arg0 + var8;
        class25.method147(arg2, 7, arg0 - arg1, var15, var16);
        class25.method147(arg4, 7, var16, var15, var17);
        class25.method147(arg2, 7, var17, var15, arg0 + arg1);
        while (var9 > var7) {
            var12 += 2;
            var13 += 2;
            var10 += var13;
            var11 += var12;
            if (var11 >= 0 && var14 >= 1) {
                class188.field3297[var14] = var7;
                var14--;
                var11 -= var14 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class95.field1380[arg5 + var9];
                    int var19 = arg0 + var7;
                    int[] var20 = class95.field1380[arg5 - var9];
                    int var21 = class188.field3297[var9];
                    int var22 = arg0 + var21;
                    int var23 = arg0 - var21;
                    int var24 = arg0 - var7;
                    class25.method147(arg2, 7, var24, var18, var23);
                    class25.method147(arg4, 7, var23, var18, var22);
                    class25.method147(arg2, 7, var22, var18, var19);
                    class25.method147(arg2, arg6 ^ 0x5B8E, var24, var20, var23);
                    class25.method147(arg4, arg6 - 23426, var23, var20, var22);
                    class25.method147(arg2, 7, var22, var20, var19);
                } else {
                    int[] var25 = class95.field1380[arg5 + var9];
                    int[] var26 = class95.field1380[arg5 - var9];
                    int var27 = arg0 + var7;
                    int var28 = arg0 - var7;
                    class25.method147(arg2, 7, var28, var25, var27);
                    class25.method147(arg2, arg6 ^ 0x5B8E, var28, var26, var27);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class95.field1380[arg5 + var7];
            int[] var30 = class95.field1380[arg5 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var14 ? var14 : class188.field3297[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class25.method147(arg2, 7, var32, var29, var35);
                class25.method147(arg4, 7, var35, var29, var34);
                class25.method147(arg2, 7, var34, var29, var31);
                class25.method147(arg2, arg6 - 23426, var32, var30, var35);
                class25.method147(arg4, 7, var35, var30, var34);
                class25.method147(arg2, 7, var34, var30, var31);
            } else {
                class25.method147(arg2, 7, var32, var29, var31);
                class25.method147(arg2, 7, var32, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method1725(byte arg0) {
        if (arg0 != -72) {
            return;
        }
        class177 var1 = (class177) class91.field1328.method1651((byte) -92);
        field4496++;
        while (var1 != null) {
            class51 var2 = var1.field2978;
            if (class27.field335 != var2.field604 || var2.field632 < class171.field2879) {
                var1.method797((byte) 107);
            } else if (class171.field2879 >= var2.field612) {
                if (var2.field607 > 0) {
                    class164 var3 = class153.field2482[var2.field607 - 1];
                    if (var3 != null && var3.field2081 >= 0 && var3.field2081 < 13312 && var3.field2085 >= 0 && var3.field2085 < 13312) {
                        var2.method271(var3.field2081, class74.method470(var3.field2085, var2.field604, 103, var3.field2081) - var2.field611, class171.field2879, (byte) -126, var3.field2085);
                    }
                }
                if (var2.field607 < 0) {
                    int var4 = -var2.field607 - 1;
                    class134 var5;
                    if (class31.field395 == var4) {
                        var5 = class102.field1477;
                    } else {
                        var5 = class247.field4397[var4];
                    }
                    if (var5 != null && var5.field2081 >= 0 && var5.field2081 < 13312 && var5.field2085 >= 0 && var5.field2085 < 13312) {
                        var2.method271(var5.field2081, class74.method470(var5.field2085, var2.field604, arg0 ^ 0xFFFFFFDF, var5.field2081) - var2.field611, class171.field2879, (byte) -126, var5.field2085);
                    }
                }
                var2.method270(class113.field1658, false);
                class87.method543(class27.field335, (int) var2.field614, (int) var2.field625, (int) var2.field609, 60, var2, var2.field641, -1L, false);
            }
            var1 = (class177) class91.field1328.method1656(-113);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILnb;IIIZ)V")
    public static final void method1726(byte arg0, int arg1, class95 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4505++;
        long var7 = (long) ((arg3 << 16) + arg5);
        class182 var9 = (class182) class236.field4196.method1551(32768, var7);
        if (var9 != null) {
            return;
        }
        int var10 = -77 % ((arg1 - 37) / 55);
        class182 var11 = (class182) class45.field534.method1551(32768, var7);
        if (var11 != null) {
            return;
        }
        class182 var12 = (class182) class105.field1518.method1551(32768, var7);
        if (var12 == null) {
            if (!arg6) {
                class182 var13 = (class182) class203.field3656.method1551(32768, var7);
                if (var13 != null) {
                    return;
                }
            }
            class182 var14 = new class182();
            var14.field3210 = arg0;
            var14.field3215 = arg4;
            var14.field3213 = arg2;
            if (arg6) {
                class236.field4196.method1552(var14, var7, 0);
                class45.field542++;
            } else {
                class234.field4154.method33(var14, (byte) -33);
                class105.field1518.method1552(var14, var7, 0);
                class192.field3366++;
            }
        } else if (arg6) {
            var12.method920(-2);
            class236.field4196.method1552(var12, var7, 0);
            class192.field3366--;
            class45.field542++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class256() {
        this.field4488 = new int[0];
        this.field4491 = new int[0];
        this.field4490 = new class23();
        this.field4490.field1945 = 1;
        this.field4489 = new class23();
        this.field4487 = new class135[] { this.field4490, this.field4489 };
        this.field4489.field1945 = 1;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lp;)V")
    public class256(class56 arg0) {
        int var2 = arg0.method367(1);
        this.field4487 = new class135[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class135 var16 = class163.method1028(-107, arg0);
            if (var16.method515(-26001) >= 0) {
                var3++;
            }
            if (var16.method815(-28861) >= 0) {
                var4++;
            }
            int var17 = var16.field1956.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method367(1);
            }
            this.field4487[var6] = var16;
        }
        this.field4488 = new int[var4];
        int var7 = 0;
        this.field4491 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class135 var11 = this.field4487[var9];
            int var12 = var11.field1956.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1956[var13] = this.field4487[var5[var9][var13]];
            }
            int var14 = var11.method515(-26001);
            int var15 = var11.method815(-28861);
            if (var14 > 0) {
                this.field4491[var8++] = var14;
            }
            if (var15 > 0) {
                this.field4488[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field4490 = this.field4487[arg0.method367(1)];
        this.field4489 = this.field4487[arg0.method367(1)];
        Object var10 = null;
    }
}
