import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class96 extends class105 {

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    private int field1685 = 32768;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "Lvf;")
    public static class265 field1689 = class87.method582(-46, "Shift)2click ENABLED(Q");

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field1691 = 2;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Lvf;")
    public static class265 field1688 = class87.method582(-46, "cookieprefix");

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
    private static int[] field1695 = new int[5];

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "Lvf;")
    public static class265 field1696 = class87.method582(-46, "details");

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field1699 = 0;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "[[I")
    public static int[][] field1692;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V")
    public static void method643(byte arg0) {
        field1696 = null;
        field1689 = null;
        field1688 = null;
        field1695 = null;
        field1692 = null;
        if (arg0 <= 120) {
            method644(79, (class192) null);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILfl;)I")
    public static final int method644(int arg0, class192 arg1) {
        if (arg0 != -3614) {
            method643((byte) 42);
        }
        ++field1684;
        int var2 = 0;
        if (arg1.method1330(class98.field1725, (byte) -59)) {
            ++var2;
        }
        if (arg1.method1330(class62.field1231, (byte) -25)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        int[] var3 = super.field1862.method458(arg1, false);
        if (arg0 != 8055) {
            method644(72, (class192) null);
        }
        ++field1687;
        if (super.field1862.field1236) {
            int[] var4 = this.method705(arg1, (byte) -104, 1);
            int[] var5 = this.method705(arg1, (byte) -31, 2);
            for (int var6 = 0; class94.field1668 > var6; ++var6) {
                int var7 = (4087 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field1685 >> 12;
                int var9 = class227.field4029[var7] * var8 >> 12;
                int var10 = class264.field4604[var7] * var8 >> 12;
                int var11 = class11.field377 & (var10 >> 12) + arg1;
                int var12 = (var9 >> 12) + var6 & class1.field20;
                int[] var13 = this.method705(var11, (byte) -121, 0);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field1698;
        if (arg1 >= -110) {
            this.field1685 = -60;
        }
        int[][] var3 = super.field1870.method569((byte) 18, arg0);
        if (super.field1870.field1567) {
            int[] var4 = this.method705(arg0, (byte) -119, 1);
            int[] var5 = this.method705(arg0, (byte) -111, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class94.field1668; ++var9) {
                int var10 = (1045696 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field1685 >> 12;
                int var12 = class227.field4029[var10] * var11 >> 12;
                int var13 = class264.field4604[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class1.field20;
                int var15 = class11.field377 & (var13 >> 12) + arg0;
                int[][] var16 = this.method702((byte) 94, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        class123.method831(123);
        if (!arg0) {
            ++field1694;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 == 255) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    super.field1853 = ~arg2.method920((byte) 86) == -2;
                }
            } else {
                this.field1685 = arg2.method927(126) << 4;
            }
            ++field1693;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class96() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBLra;)V")
    public static final void method645(int arg0, byte arg1, class277 arg2) {
        ++field1686;
        Object[] var3 = arg2.field4883;
        int var4 = (Integer) var3[0];
        class26 var5 = class252.method1671(var4, 74);
        if (var5 != null) {
            int var6 = 0;
            class203.field3634 = 0;
            int var7 = 0;
            int var8 = -1;
            int[] var9 = var5.field712;
            int[] var10 = var5.field714;
            byte var11 = -1;
            if (arg1 < 110) {
                method643((byte) 57);
            }
            try {
                class201.field3605 = new class265[var5.field705];
                int var12 = 0;
                int var13 = 0;
                class153.field2849 = new int[var5.field710];
                for (int var14 = 1; var3.length > var14; ++var14) {
                    if (!(var3[var14] instanceof Integer)) {
                        if (var3[var14] instanceof class265) {
                            class265 var15 = (class265) var3[var14];
                            if (var15.method1776((byte) -125, class105.field1857)) {
                                var15 = arg2.field4902;
                            }
                            class201.field3605[var13++] = var15;
                        }
                    } else {
                        int var16 = (Integer) var3[var14];
                        if (~var16 == 2147483646) {
                            var16 = arg2.field4896;
                        }
                        if (~var16 == 2147483645) {
                            var16 = arg2.field4900;
                        }
                        if (~var16 == 2147483644) {
                            var16 = arg2.field4901 != null ? arg2.field4901.field219 : -1;
                        }
                        if (var16 == -2147483644) {
                            var16 = arg2.field4882;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg2.field4901 != null ? arg2.field4901.field233 : -1;
                        }
                        if (~var16 == 2147483641) {
                            var16 = arg2.field4899 == null ? -1 : arg2.field4899.field219;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg2.field4899 != null ? arg2.field4899.field233 : -1;
                        }
                        if (var16 == -2147483640) {
                            var16 = arg2.field4887;
                        }
                        if (~var16 == 2147483638) {
                            var16 = arg2.field4893;
                        }
                        class153.field2849[var12++] = var16;
                    }
                }
                int var17 = 0;
                label3879: while (true) {
                    ++var17;
                    if (var17 > arg0) {
                        throw new RuntimeException("slow");
                    }
                    ++var8;
                    int var503 = var10[var8];
                    if (~var503 > -101) {
                        if (~var503 == -1) {
                            class276.field4869[var6++] = var9[var8];
                            continue;
                        }
                        if (var503 == 1) {
                            int var18 = var9[var8];
                            class276.field4869[var6++] = class256.field4385[var18];
                            continue;
                        }
                        if (~var503 == -3) {
                            int var19 = var9[var8];
                            --var6;
                            class230.method1555(class276.field4869[var6], var19, -16358);
                            continue;
                        }
                        if (var503 == 3) {
                            class50.field1063[var7++] = var5.field700[var8];
                            continue;
                        }
                        if (~var503 == -7) {
                            var8 += var9[var8];
                            continue;
                        }
                        if (var503 == 7) {
                            var6 -= 2;
                            if (class276.field4869[var6 + 1] != class276.field4869[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var503 == -9) {
                            var6 -= 2;
                            if (~class276.field4869[var6 + 1] == ~class276.field4869[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var503 == -10) {
                            var6 -= 2;
                            if (~class276.field4869[var6 - -1] < ~class276.field4869[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var503 == -11) {
                            var6 -= 2;
                            if (~class276.field4869[var6 + 1] > ~class276.field4869[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var503 == -22) {
                            if (class203.field3634 == 0) {
                                return;
                            }
                            class72 var20 = class204.field3651[--class203.field3634];
                            class153.field2849 = var20.field1386;
                            class201.field3605 = var20.field1385;
                            var8 = var20.field1373;
                            var5 = var20.field1380;
                            var10 = var5.field714;
                            var9 = var5.field712;
                            continue;
                        }
                        if (var503 == 25) {
                            int var21 = var9[var8];
                            class276.field4869[var6++] = class13.method101(-1, var21);
                            continue;
                        }
                        if (~var503 == -28) {
                            int var22 = var9[var8];
                            --var6;
                            class23.method225(var22, class276.field4869[var6], 17371);
                            continue;
                        }
                        if (var503 == 31) {
                            var6 -= 2;
                            if (class276.field4869[var6 + 1] >= class276.field4869[var6]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (~var503 == -33) {
                            var6 -= 2;
                            if (~class276.field4869[var6] <= ~class276.field4869[var6 + 1]) {
                                var8 += var9[var8];
                            }
                            continue;
                        }
                        if (var503 == 33) {
                            class276.field4869[var6++] = class153.field2849[var9[var8]];
                            continue;
                        }
                        int var10001;
                        if (~var503 == -35) {
                            var10001 = var9[var8];
                            --var6;
                            class153.field2849[var10001] = class276.field4869[var6];
                            continue;
                        }
                        if (var503 == 35) {
                            class50.field1063[var7++] = class201.field3605[var9[var8]];
                            continue;
                        }
                        if (~var503 == -37) {
                            var10001 = var9[var8];
                            --var7;
                            class201.field3605[var10001] = class50.field1063[var7];
                            continue;
                        }
                        if (~var503 == -38) {
                            int var23 = var9[var8];
                            var7 -= var23;
                            class265 var24 = class189.method1290(35, var23, var7, class50.field1063);
                            class50.field1063[var7++] = var24;
                            continue;
                        }
                        if (~var503 == -39) {
                            --var6;
                            continue;
                        }
                        if (var503 == 39) {
                            --var7;
                            continue;
                        }
                        if (~var503 == -41) {
                            int var25 = var9[var8];
                            class26 var26 = class252.method1671(var25, -124);
                            int[] var27 = new int[var26.field710];
                            class265[] var28 = new class265[var26.field705];
                            for (int var29 = 0; var29 < var26.field715; ++var29) {
                                var27[var29] = class276.field4869[-var26.field715 + var29 + var6];
                            }
                            for (int var30 = 0; var30 < var26.field704; ++var30) {
                                var28[var30] = class50.field1063[-var26.field704 + var7 + var30];
                            }
                            var6 -= var26.field715;
                            var7 -= var26.field704;
                            class72 var31 = new class72();
                            var31.field1385 = class201.field3605;
                            var31.field1386 = class153.field2849;
                            var31.field1380 = var5;
                            var31.field1373 = var8;
                            if (class204.field3651.length <= class203.field3634) {
                                throw new RuntimeException();
                            }
                            class204.field3651[class203.field3634++] = var31;
                            var8 = -1;
                            class153.field2849 = var27;
                            var5 = var26;
                            class201.field3605 = var28;
                            var10 = var26.field714;
                            var9 = var26.field712;
                            continue;
                        }
                        if (~var503 == -43) {
                            class276.field4869[var6++] = class112.field1955[var9[var8]];
                            continue;
                        }
                        if (~var503 == -44) {
                            int var32 = var9[var8];
                            --var6;
                            class112.field1955[var32] = class276.field4869[var6];
                            class71.method501(false, var32);
                            continue;
                        }
                        if (var503 == 44) {
                            int var33 = var9[var8] >> 16;
                            int var34 = var9[var8] & 65535;
                            --var6;
                            int var35 = class276.field4869[var6];
                            if (var35 >= 0 && var35 <= 5000) {
                                field1695[var33] = var35;
                                byte var36 = -1;
                                if (~var34 == -106) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (~var35 >= ~var37) {
                                        continue label3879;
                                    }
                                    class125.field2239[var33][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var503 == -46) {
                            int var38 = var9[var8];
                            --var6;
                            int var39 = class276.field4869[var6];
                            if (var39 >= 0 && var39 < field1695[var38]) {
                                class276.field4869[var6++] = class125.field2239[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var503 == -47) {
                            int var40 = var9[var8];
                            var6 -= 2;
                            int var41 = class276.field4869[var6];
                            if (~var41 <= -1 && ~var41 > ~field1695[var40]) {
                                class125.field2239[var40][var41] = class276.field4869[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var503 == 47) {
                            class265 var42 = class1.field7[var9[var8]];
                            if (var42 == null) {
                                var42 = class55.field1124;
                            }
                            class50.field1063[var7++] = var42;
                            continue;
                        }
                        if (var503 == 48) {
                            int var43 = var9[var8];
                            --var7;
                            class1.field7[var43] = class50.field1063[var7];
                            class148.method1020(2048, var43);
                            continue;
                        }
                        if (var503 == 51) {
                            class269 var44 = var5.field701[var9[var8]];
                            --var6;
                            class203 var45 = (class203) var44.method1842(-1, (long) class276.field4869[var6]);
                            if (var45 != null) {
                                var8 += var45.field3640;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (~var9[var8] != -2) {
                        var46 = false;
                    } else {
                        var46 = true;
                    }
                    if (var503 < 300) {
                        if (~var503 == -101) {
                            var6 -= 3;
                            int var47 = class276.field4869[var6 - -1];
                            int var48 = class276.field4869[var6 - -2];
                            int var49 = class276.field4869[var6];
                            if (var47 == 0) {
                                throw new RuntimeException();
                            }
                            class6 var50 = class21.method204(var49, -16257);
                            if (var50.field160 == null) {
                                var50.field160 = new class6[var48 - -1];
                            }
                            if (var48 >= var50.field160.length) {
                                class6[] var51 = new class6[var48 + 1];
                                for (int var52 = 0; var52 < var50.field160.length; ++var52) {
                                    var51[var52] = var50.field160[var52];
                                }
                                var50.field160 = var51;
                            }
                            if (~var48 < -1 && var50.field160[var48 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class6 var53 = new class6();
                            var53.field226 = true;
                            var53.field142 = var53.field219 = var50.field219;
                            var53.field187 = var47;
                            var53.field233 = var48;
                            var50.field160[var48] = var53;
                            if (var46) {
                                class52.field1089 = var53;
                            } else {
                                class161.field2943 = var53;
                            }
                            class176.method1145((byte) 49, var50);
                            continue;
                        }
                        if (var503 == 101) {
                            class6 var54 = var46 ? class52.field1089 : class161.field2943;
                            if (var54.field233 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class6 var55 = class21.method204(var54.field219, -16257);
                            var55.field160[var54.field233] = null;
                            class176.method1145((byte) 114, var55);
                            continue;
                        }
                        if (var503 == 102) {
                            --var6;
                            class6 var56 = class21.method204(class276.field4869[var6], -16257);
                            var56.field160 = null;
                            class176.method1145((byte) 81, var56);
                            continue;
                        }
                        if (var503 == 200) {
                            var6 -= 2;
                            int var57 = class276.field4869[var6 + 1];
                            int var58 = class276.field4869[var6];
                            class6 var59 = class12.method98(var58, var57, (byte) -124);
                            if (var59 != null && var57 != -1) {
                                class276.field4869[var6++] = 1;
                                if (!var46) {
                                    class161.field2943 = var59;
                                } else {
                                    class52.field1089 = var59;
                                }
                                continue;
                            }
                            class276.field4869[var6++] = 0;
                            continue;
                        }
                        if (~var503 == -202) {
                            --var6;
                            int var60 = class276.field4869[var6];
                            class6 var61 = class21.method204(var60, -16257);
                            if (var61 == null) {
                                class276.field4869[var6++] = 0;
                            } else {
                                class276.field4869[var6++] = 1;
                                if (var46) {
                                    class52.field1089 = var61;
                                } else {
                                    class161.field2943 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (~var503 > -501) {
                        if (var503 == 403) {
                            var6 -= 2;
                            int var62 = class276.field4869[var6];
                            int var63 = class276.field4869[var6 - -1];
                            if (~var62 <= -8) {
                                var62 -= 7;
                            }
                            class214.field3827.field2194.method523(var63, 0, var62);
                            continue;
                        }
                        if (~var503 == -405) {
                            var6 -= 2;
                            int var64 = class276.field4869[var6];
                            int var65 = class276.field4869[var6 + 1];
                            class214.field3827.field2194.method518(var65, var64, 16);
                            continue;
                        }
                        if (~var503 == -411) {
                            --var6;
                            boolean var66 = class276.field4869[var6] != 0;
                            class214.field3827.field2194.method521(45, var66);
                            continue;
                        }
                    } else if (var503 >= 1000 && var503 < 1100 || var503 >= 2000 && var503 < 2100) {
                        class6 var67;
                        if (~var503 <= -2001) {
                            var503 -= 1000;
                            --var6;
                            var67 = class21.method204(class276.field4869[var6], -16257);
                        } else {
                            var67 = !var46 ? class161.field2943 : class52.field1089;
                        }
                        if (var503 == 1000) {
                            var6 -= 4;
                            var67.field87 = class276.field4869[var6];
                            var67.field216 = class276.field4869[var6 + 1];
                            int var68 = class276.field4869[var6 + 2];
                            if (~var68 <= -1) {
                                if (var68 > 5) {
                                    var68 = 5;
                                }
                            } else {
                                var68 = 0;
                            }
                            int var69 = class276.field4869[var6 + 3];
                            var67.field184 = (byte) var68;
                            if (var69 < 0) {
                                var69 = 0;
                            } else if (var69 > 5) {
                                var69 = 5;
                            }
                            var67.field79 = (byte) var69;
                            class176.method1145((byte) 127, var67);
                            class273.method1871(var67, -25);
                            if (~var67.field233 == 0) {
                                class54.method420(var67.field219, 11);
                            }
                            continue;
                        }
                        if (~var503 == -1002) {
                            var6 -= 4;
                            var67.field161 = class276.field4869[var6];
                            var67.field105 = class276.field4869[var6 + 1];
                            var67.field163 = 0;
                            var67.field232 = 0;
                            int var70 = class276.field4869[var6 + 2];
                            int var71 = class276.field4869[var6 - -3];
                            if (var71 >= 0) {
                                if (~var71 < -5) {
                                    var71 = 4;
                                }
                            } else {
                                var71 = 0;
                            }
                            if (var70 >= 0) {
                                if (~var70 < -5) {
                                    var70 = 4;
                                }
                            } else {
                                var70 = 0;
                            }
                            var67.field238 = (byte) var71;
                            var67.field237 = (byte) var70;
                            class176.method1145((byte) -87, var67);
                            class273.method1871(var67, -65);
                            if (~var67.field187 == -1) {
                                class126.method841(false, (byte) 110, var67);
                            }
                            continue;
                        }
                        if (var503 == 1003) {
                            --var6;
                            boolean var72 = ~class276.field4869[var6] == -2;
                            if (!var72 != !var67.field241) {
                                var67.field241 = var72;
                                class176.method1145((byte) 74, var67);
                            }
                            if (~var67.field233 == 0) {
                                class116.method781(var67.field219, (byte) -51);
                            }
                            continue;
                        }
                        if (~var503 == -1005) {
                            var6 -= 2;
                            var67.field121 = class276.field4869[var6];
                            var67.field95 = class276.field4869[var6 - -1];
                            class176.method1145((byte) 47, var67);
                            class273.method1871(var67, -10);
                            if (~var67.field187 == -1) {
                                class126.method841(false, (byte) 95, var67);
                            }
                            continue;
                        }
                        if (~var503 == -1006) {
                            --var6;
                            var67.field130 = class276.field4869[var6] == 1;
                            continue;
                        }
                    } else if ((~var503 > -1101 || ~var503 <= -1201) && (~var503 > -2101 || var503 >= 2200)) {
                        if (var503 >= 1200 && var503 < 1300 || var503 >= 2200 && ~var503 > -2301) {
                            class6 var490;
                            if (~var503 > -2001) {
                                var490 = var46 ? class52.field1089 : class161.field2943;
                            } else {
                                --var6;
                                var490 = class21.method204(class276.field4869[var6], -16257);
                                var503 -= 1000;
                            }
                            class176.method1145((byte) 102, var490);
                            if (var503 == 1200 || var503 == 1205) {
                                var6 -= 2;
                                int var491 = class276.field4869[var6];
                                int var492 = class276.field4869[var6 + 1];
                                if (~var490.field233 == 0) {
                                    class27.method236((byte) -14, var490.field219);
                                    class213.method1454(-10520, var490.field219);
                                    class138.method957(true, var490.field219);
                                }
                                if (~var491 == 0) {
                                    var490.field222 = -1;
                                    var490.field102 = 1;
                                    var490.field167 = -1;
                                } else {
                                    var490.field167 = var491;
                                    var490.field148 = var492;
                                    class261 var493 = class54.method418(var491, 0);
                                    var490.field77 = var493.field4569;
                                    var490.field123 = var493.field4511;
                                    var490.field124 = var493.field4514;
                                    var490.field235 = var493.field4526;
                                    if (~var490.field232 < -1) {
                                        var490.field235 = var490.field235 * 32 / var490.field232;
                                    } else if (var490.field161 > 0) {
                                        var490.field235 = var490.field235 * 32 / var490.field161;
                                    }
                                    var490.field178 = var493.field4549;
                                    if (var503 != 1205) {
                                        var490.field205 = true;
                                    } else {
                                        var490.field205 = false;
                                    }
                                    var490.field132 = var493.field4501;
                                }
                                continue;
                            }
                            if (~var503 == -1202) {
                                var490.field102 = 2;
                                --var6;
                                var490.field222 = class276.field4869[var6];
                                if (var490.field233 == -1) {
                                    class275.method1880(-1, var490.field219);
                                }
                                continue;
                            }
                            if (var503 == 1202) {
                                var490.field102 = 3;
                                var490.field222 = class214.field3827.field2194.method516(1854271604);
                                if (var490.field233 == -1) {
                                    class275.method1880(-1, var490.field219);
                                }
                                continue;
                            }
                            if (~var503 == -1204) {
                                var490.field102 = 6;
                                --var6;
                                var490.field222 = class276.field4869[var6];
                                if (var490.field233 == -1) {
                                    class275.method1880(-1, var490.field219);
                                }
                                continue;
                            }
                            if (~var503 == -1205) {
                                var490.field102 = 5;
                                --var6;
                                var490.field222 = class276.field4869[var6];
                                if (~var490.field233 == 0) {
                                    class275.method1880(-1, var490.field219);
                                }
                                continue;
                            }
                        } else if ((~var503 > -1301 || var503 >= 1400) && (var503 < 2300 || ~var503 <= -2401)) {
                            if (var503 >= 1400 && var503 < 1500 || var503 >= 2400 && var503 < 2500) {
                                class6 var73;
                                if (~var503 > -2001) {
                                    var73 = var46 ? class52.field1089 : class161.field2943;
                                } else {
                                    --var6;
                                    var73 = class21.method204(class276.field4869[var6], -16257);
                                    var503 -= 1000;
                                }
                                --var7;
                                class265 var74 = class50.field1063[var7];
                                int[] var75 = null;
                                if (var74.method1808((byte) -15) > 0 && var74.method1799(-1 + var74.method1808((byte) -15), -1) == 89) {
                                    --var6;
                                    int var76 = class276.field4869[var6];
                                    if (~var76 < -1) {
                                        var75 = new int[var76];
                                        while (var76-- > 0) {
                                            --var6;
                                            var75[var76] = class276.field4869[var6];
                                        }
                                    }
                                    var74 = var74.method1772(var74.method1808((byte) -15) + -1, 0, (byte) 69);
                                }
                                Object[] var77 = new Object[var74.method1808((byte) -15) + 1];
                                for (int var78 = var77.length + -1; var78 >= 1; --var78) {
                                    if (~var74.method1799(var78 + -1, -1) != -116) {
                                        --var6;
                                        var77[var78] = new Integer(class276.field4869[var6]);
                                    } else {
                                        --var7;
                                        var77[var78] = class50.field1063[var7];
                                    }
                                }
                                --var6;
                                int var79 = class276.field4869[var6];
                                if (~var79 == 0) {
                                    var77 = null;
                                } else {
                                    var77[0] = new Integer(var79);
                                }
                                if (var503 == 1400) {
                                    var73.field196 = var77;
                                } else if (var503 != 1401) {
                                    if (~var503 == -1403) {
                                        var73.field120 = var77;
                                    } else if (var503 != 1403) {
                                        if (var503 == 1404) {
                                            var73.field82 = var77;
                                        } else if (var503 == 1405) {
                                            var73.field136 = var77;
                                        } else if (~var503 != -1407) {
                                            if (~var503 == -1408) {
                                                var73.field159 = var75;
                                                var73.field112 = var77;
                                            } else if (~var503 == -1409) {
                                                var73.field181 = var77;
                                            } else if (var503 == 1409) {
                                                var73.field166 = var77;
                                            } else if (var503 != 1410) {
                                                if (var503 != 1411) {
                                                    if (var503 != 1412) {
                                                        if (var503 != 1414) {
                                                            if (var503 != 1415) {
                                                                if (var503 == 1416) {
                                                                    var73.field104 = var77;
                                                                } else if (var503 != 1417) {
                                                                    if (~var503 != -1419) {
                                                                        if (var503 != 1419) {
                                                                            if (~var503 != -1421) {
                                                                                if (var503 == 1421) {
                                                                                    var73.field108 = var77;
                                                                                } else if (var503 != 1422) {
                                                                                    if (var503 == 1423) {
                                                                                        var73.field201 = var77;
                                                                                    } else if (var503 == 1424) {
                                                                                        var73.field155 = var77;
                                                                                    } else if (~var503 != -1426) {
                                                                                        if (var503 == 1426) {
                                                                                            var73.field115 = var77;
                                                                                        } else if (var503 == 1427) {
                                                                                            var73.field211 = var77;
                                                                                        } else if (var503 == 1428) {
                                                                                            var73.field134 = var77;
                                                                                            var73.field221 = var75;
                                                                                        } else if (var503 == 1429) {
                                                                                            var73.field119 = var77;
                                                                                            var73.field169 = var75;
                                                                                        }
                                                                                    } else {
                                                                                        var73.field224 = var77;
                                                                                    }
                                                                                } else {
                                                                                    var73.field85 = var77;
                                                                                }
                                                                            } else {
                                                                                var73.field90 = var77;
                                                                            }
                                                                        } else {
                                                                            var73.field192 = var77;
                                                                        }
                                                                    } else {
                                                                        var73.field229 = var77;
                                                                    }
                                                                } else {
                                                                    var73.field106 = var77;
                                                                }
                                                            } else {
                                                                var73.field162 = var75;
                                                                var73.field209 = var77;
                                                            }
                                                        } else {
                                                            var73.field186 = var75;
                                                            var73.field189 = var77;
                                                        }
                                                    } else {
                                                        var73.field113 = var77;
                                                    }
                                                } else {
                                                    var73.field137 = var77;
                                                }
                                            } else {
                                                var73.field245 = var77;
                                            }
                                        } else {
                                            var73.field188 = var77;
                                        }
                                    } else {
                                        var73.field191 = var77;
                                    }
                                } else {
                                    var73.field107 = var77;
                                }
                                var73.field213 = true;
                                continue;
                            }
                            if (~var503 <= -1601) {
                                if (~var503 <= -1701) {
                                    if (~var503 <= -1801) {
                                        if (var503 >= 1900) {
                                            if (var503 < 2600) {
                                                --var6;
                                                class6 var80 = class21.method204(class276.field4869[var6], -16257);
                                                if (var503 == 2500) {
                                                    class276.field4869[var6++] = var80.field153;
                                                    continue;
                                                }
                                                if (~var503 == -2502) {
                                                    class276.field4869[var6++] = var80.field204;
                                                    continue;
                                                }
                                                if (var503 == 2502) {
                                                    class276.field4869[var6++] = var80.field89;
                                                    continue;
                                                }
                                                if (~var503 == -2504) {
                                                    class276.field4869[var6++] = var80.field84;
                                                    continue;
                                                }
                                                if (var503 == 2504) {
                                                    class276.field4869[var6++] = var80.field241 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var503 == 2505) {
                                                    class276.field4869[var6++] = var80.field142;
                                                    continue;
                                                }
                                            } else if (~var503 > -2701) {
                                                --var6;
                                                class6 var81 = class21.method204(class276.field4869[var6], -16257);
                                                if (~var503 == -2601) {
                                                    class276.field4869[var6++] = var81.field109;
                                                    continue;
                                                }
                                                if (var503 == 2601) {
                                                    class276.field4869[var6++] = var81.field193;
                                                    continue;
                                                }
                                                if (var503 == 2602) {
                                                    class50.field1063[var7++] = var81.field103;
                                                    continue;
                                                }
                                                if (~var503 == -2604) {
                                                    class276.field4869[var6++] = var81.field223;
                                                    continue;
                                                }
                                                if (var503 == 2604) {
                                                    class276.field4869[var6++] = var81.field195;
                                                    continue;
                                                }
                                                if (var503 == 2605) {
                                                    class276.field4869[var6++] = var81.field235;
                                                    continue;
                                                }
                                                if (var503 == 2606) {
                                                    class276.field4869[var6++] = var81.field124;
                                                    continue;
                                                }
                                                if (~var503 == -2608) {
                                                    class276.field4869[var6++] = var81.field77;
                                                    continue;
                                                }
                                                if (~var503 == -2609) {
                                                    class276.field4869[var6++] = var81.field123;
                                                    continue;
                                                }
                                                if (var503 == 2609) {
                                                    class276.field4869[var6++] = var81.field138;
                                                    continue;
                                                }
                                                if (var503 == 2610) {
                                                    class276.field4869[var6++] = var81.field132;
                                                    continue;
                                                }
                                                if (var503 == 2611) {
                                                    class276.field4869[var6++] = var81.field178;
                                                    continue;
                                                }
                                                if (~var503 == -2613) {
                                                    class276.field4869[var6++] = var81.field183;
                                                    continue;
                                                }
                                            } else if (var503 >= 2800) {
                                                if (var503 < 2900) {
                                                    --var6;
                                                    class6 var82 = class21.method204(class276.field4869[var6], -16257);
                                                    if (~var503 == -2801) {
                                                        class276.field4869[var6++] = class172.method1132(client.method1474(var82), (byte) 97);
                                                        continue;
                                                    }
                                                    if (var503 == 2801) {
                                                        --var6;
                                                        int var83 = class276.field4869[var6];
                                                        int var504 = var83 - 1;
                                                        if (var82.field228 != null && ~var82.field228.length < ~var504 && var82.field228[var504] != null) {
                                                            class50.field1063[var7++] = var82.field228[var504];
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (var503 == 2802) {
                                                        if (var82.field231 != null) {
                                                            class50.field1063[var7++] = var82.field231;
                                                        } else {
                                                            class50.field1063[var7++] = class112.field1962;
                                                        }
                                                        continue;
                                                    }
                                                } else if (var503 < 3200) {
                                                    if (var503 == 3100) {
                                                        --var7;
                                                        class265 var84 = class50.field1063[var7];
                                                        class259.method1725(-71, var84, 0, class112.field1962);
                                                        continue;
                                                    }
                                                    if (~var503 == -3102) {
                                                        var6 -= 2;
                                                        class153.method1045(class276.field4869[var6], class214.field3827, class276.field4869[var6 + 1], (byte) 121);
                                                        continue;
                                                    }
                                                    if (~var503 == -3104) {
                                                        class162.method1074(-120);
                                                        continue;
                                                    }
                                                    if (~var503 == -3105) {
                                                        ++class167.field3012;
                                                        int var85 = 0;
                                                        --var7;
                                                        class265 var86 = class50.field1063[var7];
                                                        if (var86.method1768(true)) {
                                                            var85 = var86.method1801(-90);
                                                        }
                                                        class55.field1133.method1863(true, 234);
                                                        class55.field1133.method898((byte) 42, var85);
                                                        continue;
                                                    }
                                                    if (~var503 == -3106) {
                                                        --var7;
                                                        class265 var87 = class50.field1063[var7];
                                                        class55.field1133.method1863(true, 253);
                                                        ++class71.field1362;
                                                        class55.field1133.method911(0, var87.method1793(43));
                                                        continue;
                                                    }
                                                    if (var503 == 3106) {
                                                        ++class242.field4223;
                                                        --var7;
                                                        class265 var88 = class50.field1063[var7];
                                                        class55.field1133.method1863(true, 58);
                                                        class55.field1133.method903((byte) 36, 1 + var88.method1808((byte) -15));
                                                        class55.field1133.method941(var88, (byte) -58);
                                                        continue;
                                                    }
                                                    if (~var503 == -3108) {
                                                        --var7;
                                                        class265 var89 = class50.field1063[var7];
                                                        --var6;
                                                        int var90 = class276.field4869[var6];
                                                        class267.method1814((byte) 33, var89, var90);
                                                        continue;
                                                    }
                                                    if (~var503 == -3109) {
                                                        var6 -= 3;
                                                        int var91 = class276.field4869[var6];
                                                        int var92 = class276.field4869[var6 - -1];
                                                        int var93 = class276.field4869[var6 - -2];
                                                        class6 var94 = class21.method204(var93, -16257);
                                                        class31.method258(var92, (byte) -77, var94, var91);
                                                        continue;
                                                    }
                                                    if (var503 == 3109) {
                                                        var6 -= 2;
                                                        int var95 = class276.field4869[var6];
                                                        class6 var96 = var46 ? class52.field1089 : class161.field2943;
                                                        int var97 = class276.field4869[var6 - -1];
                                                        class31.method258(var97, (byte) -77, var96, var95);
                                                        continue;
                                                    }
                                                    if (~var503 == -3111) {
                                                        --var6;
                                                        int var98 = class276.field4869[var6];
                                                        class55.field1133.method1863(true, 167);
                                                        class55.field1133.method921(102, var98);
                                                        ++class30.field763;
                                                        continue;
                                                    }
                                                } else if (var503 < 3300) {
                                                    if (var503 == 3200) {
                                                        var6 -= 3;
                                                        class1.method8(class276.field4869[var6 + 1], class276.field4869[var6 - -2], 0, class276.field4869[var6]);
                                                        continue;
                                                    }
                                                    if (~var503 == -3202) {
                                                        --var6;
                                                        class14.method105(true, class276.field4869[var6]);
                                                        continue;
                                                    }
                                                    if (var503 == 3202) {
                                                        var6 -= 2;
                                                        class239.method1598(class276.field4869[var6 + 1], 0, class276.field4869[var6]);
                                                        continue;
                                                    }
                                                } else if (var503 < 3400) {
                                                    if (var503 == 3300) {
                                                        class276.field4869[var6++] = class93.field1655;
                                                        continue;
                                                    }
                                                    if (var503 == 3301) {
                                                        var6 -= 2;
                                                        int var99 = class276.field4869[var6];
                                                        int var100 = class276.field4869[var6 + 1];
                                                        class276.field4869[var6++] = class272.method1859(var99, (byte) -77, var100);
                                                        continue;
                                                    }
                                                    if (~var503 == -3303) {
                                                        var6 -= 2;
                                                        int var101 = class276.field4869[var6 + 1];
                                                        int var102 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class131.method869((byte) 27, var101, var102);
                                                        continue;
                                                    }
                                                    if (~var503 == -3304) {
                                                        var6 -= 2;
                                                        int var103 = class276.field4869[var6];
                                                        int var104 = class276.field4869[var6 + 1];
                                                        class276.field4869[var6++] = class51.method407((byte) 10, var104, var103);
                                                        continue;
                                                    }
                                                    if (~var503 == -3305) {
                                                        --var6;
                                                        int var105 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class43.method361(var105, true).field4171;
                                                        continue;
                                                    }
                                                    if (~var503 == -3306) {
                                                        --var6;
                                                        int var106 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class50.field1055[var106];
                                                        continue;
                                                    }
                                                    if (var503 == 3306) {
                                                        --var6;
                                                        int var107 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class39.field904[var107];
                                                        continue;
                                                    }
                                                    if (var503 == 3307) {
                                                        --var6;
                                                        int var108 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class49.field1036[var108];
                                                        continue;
                                                    }
                                                    if (var503 == 3308) {
                                                        int var109 = class216.field3902;
                                                        int var110 = (class214.field3827.field2600 >> 7) - -class64.field1248;
                                                        int var111 = (class214.field3827.field2564 >> 7) + class231.field4073;
                                                        class276.field4869[var6++] = (var109 << 28) + (var110 << 14) - -var111;
                                                        continue;
                                                    }
                                                    if (var503 == 3309) {
                                                        --var6;
                                                        int var112 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class203.method1395(var112, 268424181) >> 14;
                                                        continue;
                                                    }
                                                    if (var503 == 3310) {
                                                        --var6;
                                                        int var113 = class276.field4869[var6];
                                                        class276.field4869[var6++] = var113 >> 28;
                                                        continue;
                                                    }
                                                    if (var503 == 3311) {
                                                        --var6;
                                                        int var114 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class203.method1395(16383, var114);
                                                        continue;
                                                    }
                                                    if (~var503 == -3313) {
                                                        class276.field4869[var6++] = !class91.field1632 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var503 == -3314) {
                                                        var6 -= 2;
                                                        int var115 = class276.field4869[var6] - -32768;
                                                        int var116 = class276.field4869[var6 - -1];
                                                        class276.field4869[var6++] = class272.method1859(var115, (byte) -77, var116);
                                                        continue;
                                                    }
                                                    if (var503 == 3314) {
                                                        var6 -= 2;
                                                        int var117 = class276.field4869[var6] + 32768;
                                                        int var118 = class276.field4869[var6 + 1];
                                                        class276.field4869[var6++] = class131.method869((byte) 101, var118, var117);
                                                        continue;
                                                    }
                                                    if (var503 == 3315) {
                                                        var6 -= 2;
                                                        int var119 = class276.field4869[var6] + 32768;
                                                        int var120 = class276.field4869[var6 + 1];
                                                        class276.field4869[var6++] = class51.method407((byte) 10, var120, var119);
                                                        continue;
                                                    }
                                                    if (~var503 == -3317) {
                                                        if (class30.field773 >= 2) {
                                                            class276.field4869[var6++] = class30.field773;
                                                        } else {
                                                            class276.field4869[var6++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (var503 == 3317) {
                                                        class276.field4869[var6++] = class263.field4585;
                                                        continue;
                                                    }
                                                    if (~var503 == -3319) {
                                                        class276.field4869[var6++] = class206.field3700;
                                                        continue;
                                                    }
                                                    if (var503 == 3321) {
                                                        class276.field4869[var6++] = class15.field448;
                                                        continue;
                                                    }
                                                    if (var503 == 3322) {
                                                        class276.field4869[var6++] = class200.field3579;
                                                        continue;
                                                    }
                                                    if (~var503 == -3324) {
                                                        if (class98.field1737 >= 5 && ~class98.field1737 >= -10) {
                                                            class276.field4869[var6++] = 1;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3324) {
                                                        if (~class98.field1737 <= -6 && class98.field1737 <= 9) {
                                                            class276.field4869[var6++] = class98.field1737;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3326) {
                                                        class276.field4869[var6++] = !class102.field1820 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var503 == -3327) {
                                                        class276.field4869[var6++] = class214.field3827.field2177;
                                                        continue;
                                                    }
                                                    if (var503 == 3327) {
                                                        class276.field4869[var6++] = class214.field3827.field2194.field1411 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3328) {
                                                        class276.field4869[var6++] = class262.field4583 && !class203.field3632 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3329) {
                                                        class276.field4869[var6++] = class101.field1792 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3330) {
                                                        --var6;
                                                        int var121 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class236.method1576(var121, 0);
                                                        continue;
                                                    }
                                                    if (var503 == 3331) {
                                                        var6 -= 2;
                                                        int var122 = class276.field4869[var6 + 1];
                                                        int var123 = class276.field4869[var6];
                                                        class276.field4869[var6++] = class101.method678(var122, var123, (byte) 13, false);
                                                        continue;
                                                    }
                                                    if (~var503 == -3333) {
                                                        var6 -= 2;
                                                        int var124 = class276.field4869[var6];
                                                        int var125 = class276.field4869[var6 + 1];
                                                        class276.field4869[var6++] = class101.method678(var125, var124, (byte) 44, true);
                                                        continue;
                                                    }
                                                    if (var503 == 3333) {
                                                        class276.field4869[var6++] = class239.field4176;
                                                        continue;
                                                    }
                                                    if (~var503 == -3336) {
                                                        class276.field4869[var6++] = class44.field971;
                                                        continue;
                                                    }
                                                    if (var503 == 3336) {
                                                        var6 -= 4;
                                                        int var126 = class276.field4869[var6 + 1];
                                                        int var127 = class276.field4869[var6];
                                                        int var128 = (var126 << 14) + var127;
                                                        int var129 = class276.field4869[var6 - -2];
                                                        int var130 = (var129 << 28) + var128;
                                                        int var131 = class276.field4869[var6 + 3];
                                                        int var132 = var130 + var131;
                                                        class276.field4869[var6++] = var132;
                                                        continue;
                                                    }
                                                    if (~var503 == -3338) {
                                                        class276.field4869[var6++] = class23.field675;
                                                        continue;
                                                    }
                                                } else if (~var503 > -3501) {
                                                    if (var503 == 3400) {
                                                        var6 -= 2;
                                                        int var133 = class276.field4869[var6];
                                                        int var134 = class276.field4869[var6 - -1];
                                                        class36 var135 = class203.method1396(var133, (byte) 114);
                                                        class50.field1063[var7++] = var135.method304(var134, (byte) -90);
                                                        continue;
                                                    }
                                                    if (var503 == 3408) {
                                                        var6 -= 4;
                                                        int var136 = class276.field4869[var6];
                                                        int var137 = class276.field4869[var6 - -1];
                                                        int var138 = class276.field4869[var6 + 3];
                                                        int var139 = class276.field4869[var6 + 2];
                                                        class36 var140 = class203.method1396(var139, (byte) 86);
                                                        if (var140.field847 == var136 && ~var140.field856 == ~var137) {
                                                            if (var137 == 115) {
                                                                class50.field1063[var7++] = var140.method304(var138, (byte) -112);
                                                            } else {
                                                                class276.field4869[var6++] = var140.method309(-1240, var138);
                                                            }
                                                            continue;
                                                        }
                                                        throw new RuntimeException("C3408-1");
                                                    }
                                                    if (~var503 == -3410) {
                                                        var6 -= 3;
                                                        int var141 = class276.field4869[var6 + 2];
                                                        int var142 = class276.field4869[var6 - -1];
                                                        int var143 = class276.field4869[var6];
                                                        if (var142 == -1) {
                                                            throw new RuntimeException("C3409-2");
                                                        }
                                                        class36 var144 = class203.method1396(var142, (byte) 112);
                                                        if (var144.field856 != var143) {
                                                            throw new RuntimeException("C3409-1");
                                                        }
                                                        class276.field4869[var6++] = !var144.method307(var141, -27427) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var503 == -3411) {
                                                        --var6;
                                                        int var145 = class276.field4869[var6];
                                                        --var7;
                                                        class265 var146 = class50.field1063[var7];
                                                        if (~var145 == 0) {
                                                            throw new RuntimeException("C3410-2");
                                                        }
                                                        class36 var147 = class203.method1396(var145, (byte) 88);
                                                        if (var147.field856 != 115) {
                                                            throw new RuntimeException("C3410-1");
                                                        }
                                                        class276.field4869[var6++] = !var147.method311(var146, 7625) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var503 == -3412) {
                                                        --var6;
                                                        int var148 = class276.field4869[var6];
                                                        class36 var149 = class203.method1396(var148, (byte) 102);
                                                        class276.field4869[var6++] = var149.field854.method1839((byte) 119);
                                                        continue;
                                                    }
                                                } else if (var503 >= 3700) {
                                                    if (var503 < 4000) {
                                                        if (var503 == 3903) {
                                                            --var6;
                                                            int var150 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var150].method1284((byte) -127);
                                                            continue;
                                                        }
                                                        if (var503 == 3904) {
                                                            --var6;
                                                            int var151 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var151].field3389;
                                                            continue;
                                                        }
                                                        if (var503 == 3905) {
                                                            --var6;
                                                            int var152 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var152].field3394;
                                                            continue;
                                                        }
                                                        if (~var503 == -3907) {
                                                            --var6;
                                                            int var153 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var153].field3387;
                                                            continue;
                                                        }
                                                        if (var503 == 3907) {
                                                            --var6;
                                                            int var154 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var154].field3391;
                                                            continue;
                                                        }
                                                        if (var503 == 3908) {
                                                            --var6;
                                                            int var155 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class167.field3037[var155].field3386;
                                                            continue;
                                                        }
                                                        if (var503 == 3910) {
                                                            --var6;
                                                            int var156 = class276.field4869[var6];
                                                            int var157 = class167.field3037[var156].method1281((byte) 124);
                                                            class276.field4869[var6++] = var157 != 0 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var503 == 3911) {
                                                            --var6;
                                                            int var158 = class276.field4869[var6];
                                                            int var159 = class167.field3037[var158].method1281((byte) 115);
                                                            class276.field4869[var6++] = var159 == 2 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var503 == -3913) {
                                                            --var6;
                                                            int var160 = class276.field4869[var6];
                                                            int var161 = class167.field3037[var160].method1281((byte) 121);
                                                            class276.field4869[var6++] = ~var161 != -6 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (var503 == 3913) {
                                                            --var6;
                                                            int var162 = class276.field4869[var6];
                                                            int var163 = class167.field3037[var162].method1281((byte) 116);
                                                            class276.field4869[var6++] = ~var163 != -2 ? 0 : 1;
                                                            continue;
                                                        }
                                                    } else if (~var503 <= -4101) {
                                                        if (var503 < 4200) {
                                                            if (~var503 == -4101) {
                                                                --var7;
                                                                class265 var164 = class50.field1063[var7];
                                                                --var6;
                                                                int var165 = class276.field4869[var6];
                                                                class50.field1063[var7++] = class148.method1022(10, new class265[] { var164, class241.method1609(true, var165) });
                                                                continue;
                                                            }
                                                            if (~var503 == -4102) {
                                                                var7 -= 2;
                                                                class265 var166 = class50.field1063[var7];
                                                                class265 var167 = class50.field1063[var7 - -1];
                                                                class50.field1063[var7++] = class148.method1022(10, new class265[] { var166, var167 });
                                                                continue;
                                                            }
                                                            if (~var503 == -4103) {
                                                                --var7;
                                                                class265 var168 = class50.field1063[var7];
                                                                --var6;
                                                                int var169 = class276.field4869[var6];
                                                                class50.field1063[var7++] = class148.method1022(10, new class265[] { var168, class38.method313((byte) -126, true, var169) });
                                                                continue;
                                                            }
                                                            if (~var503 == -4104) {
                                                                --var7;
                                                                class265 var170 = class50.field1063[var7];
                                                                class50.field1063[var7++] = var170.method1804(124);
                                                                continue;
                                                            }
                                                            if (~var503 == -4105) {
                                                                --var6;
                                                                int var171 = class276.field4869[var6];
                                                                long var172 = (long) var171 * 86400000L + 1014768000000L;
                                                                class221.field3964.setTime(new Date(var172));
                                                                int var174 = class221.field3964.get(5);
                                                                int var175 = class221.field3964.get(2);
                                                                int var176 = class221.field3964.get(1);
                                                                class50.field1063[var7++] = class148.method1022(10, new class265[] { class241.method1609(true, var174), class214.field3846, class75.field1431[var175], class214.field3846, class241.method1609(true, var176) });
                                                                continue;
                                                            }
                                                            if (var503 == 4105) {
                                                                var7 -= 2;
                                                                class265 var177 = class50.field1063[var7];
                                                                class265 var178 = class50.field1063[var7 + 1];
                                                                if (class214.field3827.field2194 != null && class214.field3827.field2194.field1411) {
                                                                    class50.field1063[var7++] = var178;
                                                                    continue;
                                                                }
                                                                class50.field1063[var7++] = var177;
                                                                continue;
                                                            }
                                                            if (~var503 == -4107) {
                                                                --var6;
                                                                int var179 = class276.field4869[var6];
                                                                class50.field1063[var7++] = class241.method1609(true, var179);
                                                                continue;
                                                            }
                                                            if (~var503 == -4108) {
                                                                var7 -= 2;
                                                                class276.field4869[var6++] = class50.field1063[var7].method1802(false, class50.field1063[var7 + 1]);
                                                                continue;
                                                            }
                                                            if (var503 == 4108) {
                                                                var6 -= 2;
                                                                --var7;
                                                                class265 var180 = class50.field1063[var7];
                                                                int var181 = class276.field4869[var6];
                                                                int var182 = class276.field4869[var6 + 1];
                                                                class276.field4869[var6++] = class239.method1600(true, var182).method755(var180, var181);
                                                                continue;
                                                            }
                                                            if (~var503 == -4110) {
                                                                var6 -= 2;
                                                                --var7;
                                                                class265 var183 = class50.field1063[var7];
                                                                int var184 = class276.field4869[var6];
                                                                int var185 = class276.field4869[var6 + 1];
                                                                class276.field4869[var6++] = class239.method1600(true, var185).method771(var183, var184);
                                                                continue;
                                                            }
                                                            if (var503 == 4110) {
                                                                var7 -= 2;
                                                                class265 var186 = class50.field1063[var7];
                                                                class265 var187 = class50.field1063[var7 + 1];
                                                                --var6;
                                                                if (~class276.field4869[var6] == -2) {
                                                                    class50.field1063[var7++] = var186;
                                                                } else {
                                                                    class50.field1063[var7++] = var187;
                                                                }
                                                                continue;
                                                            }
                                                            if (var503 == 4111) {
                                                                --var7;
                                                                class265 var188 = class50.field1063[var7];
                                                                class50.field1063[var7++] = class115.method751(var188);
                                                                continue;
                                                            }
                                                            if (var503 == 4112) {
                                                                --var7;
                                                                class265 var189 = class50.field1063[var7];
                                                                --var6;
                                                                int var190 = class276.field4869[var6];
                                                                if (var190 == -1) {
                                                                    throw new RuntimeException("null char");
                                                                }
                                                                class50.field1063[var7++] = var189.method1769((byte) 58, var190);
                                                                continue;
                                                            }
                                                            if (var503 == 4113) {
                                                                --var6;
                                                                int var191 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class56.method428(var191, -50) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var503 == -4115) {
                                                                --var6;
                                                                int var192 = class276.field4869[var6];
                                                                class276.field4869[var6++] = !class79.method550(var192, 123) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var503 == 4115) {
                                                                --var6;
                                                                int var193 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class242.method1615(var193, -12) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var503 == -4117) {
                                                                --var6;
                                                                int var194 = class276.field4869[var6];
                                                                class276.field4869[var6++] = !class113.method746(var194, 3878) ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (~var503 == -4118) {
                                                                --var7;
                                                                class265 var195 = class50.field1063[var7];
                                                                if (var195 != null) {
                                                                    class276.field4869[var6++] = var195.method1808((byte) -15);
                                                                } else {
                                                                    class276.field4869[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var503 == -4119) {
                                                                --var7;
                                                                class265 var196 = class50.field1063[var7];
                                                                var6 -= 2;
                                                                int var197 = class276.field4869[var6];
                                                                int var198 = class276.field4869[var6 + 1];
                                                                class50.field1063[var7++] = var196.method1772(var198, var197, (byte) 67);
                                                                continue;
                                                            }
                                                            if (var503 == 4119) {
                                                                --var7;
                                                                class265 var199 = class50.field1063[var7];
                                                                boolean var200 = false;
                                                                class265 var201 = class254.method1675(var199.method1808((byte) -15), (byte) 18);
                                                                for (int var202 = 0; var199.method1808((byte) -15) > var202; ++var202) {
                                                                    int var203 = var199.method1799(var202, -1);
                                                                    if (~var203 != -61) {
                                                                        if (var203 == 62) {
                                                                            var200 = false;
                                                                        } else if (!var200) {
                                                                            var201.method1806(-33, var203);
                                                                        }
                                                                    } else {
                                                                        var200 = true;
                                                                    }
                                                                }
                                                                var201.method1809((byte) 118);
                                                                class50.field1063[var7++] = var201;
                                                                continue;
                                                            }
                                                            if (var503 == 4120) {
                                                                var6 -= 2;
                                                                --var7;
                                                                class265 var204 = class50.field1063[var7];
                                                                int var205 = class276.field4869[var6];
                                                                int var206 = class276.field4869[var6 + 1];
                                                                class276.field4869[var6++] = var204.method1784(var205, var206, -103);
                                                                continue;
                                                            }
                                                            if (~var503 == -4122) {
                                                                --var6;
                                                                int var207 = class276.field4869[var6];
                                                                var7 -= 2;
                                                                class265 var208 = class50.field1063[var7 + 1];
                                                                class265 var209 = class50.field1063[var7];
                                                                class276.field4869[var6++] = var209.method1790(var207, var208, -117);
                                                                continue;
                                                            }
                                                            if (var503 == 4122) {
                                                                --var6;
                                                                int var210 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class53.method414(24962, var210);
                                                                continue;
                                                            }
                                                            if (var503 == 4123) {
                                                                --var6;
                                                                int var211 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class172.method1135((byte) 106, var211);
                                                                continue;
                                                            }
                                                            if (var503 == 4124) {
                                                                --var6;
                                                                boolean var212 = ~class276.field4869[var6] != -1;
                                                                --var6;
                                                                int var213 = class276.field4869[var6];
                                                                class50.field1063[var7++] = class77.method539(class44.field971, 10, var212, 0, (long) var213);
                                                                continue;
                                                            }
                                                        } else if (var503 < 4300) {
                                                            if (~var503 == -4201) {
                                                                --var6;
                                                                int var214 = class276.field4869[var6];
                                                                class50.field1063[var7++] = class54.method418(var214, 0).field4548;
                                                                continue;
                                                            }
                                                            if (var503 == 4201) {
                                                                var6 -= 2;
                                                                int var215 = class276.field4869[var6];
                                                                int var216 = class276.field4869[var6 + 1];
                                                                class261 var217 = class54.method418(var215, 0);
                                                                if (~var216 <= -2 && ~var216 >= -6 && var217.field4551[var216 + -1] != null) {
                                                                    class50.field1063[var7++] = var217.field4551[var216 + -1];
                                                                    continue;
                                                                }
                                                                class50.field1063[var7++] = class112.field1962;
                                                                continue;
                                                            }
                                                            if (~var503 == -4203) {
                                                                var6 -= 2;
                                                                int var218 = class276.field4869[var6];
                                                                int var219 = class276.field4869[var6 + 1];
                                                                class261 var220 = class54.method418(var218, 0);
                                                                if (~var219 <= -2 && ~var219 >= -6 && var220.field4496[var219 + -1] != null) {
                                                                    class50.field1063[var7++] = var220.field4496[var219 + -1];
                                                                    continue;
                                                                }
                                                                class50.field1063[var7++] = class112.field1962;
                                                                continue;
                                                            }
                                                            if (var503 == 4203) {
                                                                --var6;
                                                                int var221 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class54.method418(var221, 0).field4510;
                                                                continue;
                                                            }
                                                            if (var503 == 4204) {
                                                                --var6;
                                                                int var222 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class54.method418(var222, 0).field4565 == 1 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var503 == 4205) {
                                                                --var6;
                                                                int var223 = class276.field4869[var6];
                                                                class261 var224 = class54.method418(var223, 0);
                                                                if (var224.field4505 == -1 && var224.field4568 >= 0) {
                                                                    class276.field4869[var6++] = var224.field4568;
                                                                    continue;
                                                                }
                                                                class276.field4869[var6++] = var223;
                                                                continue;
                                                            }
                                                            if (~var503 == -4207) {
                                                                --var6;
                                                                int var225 = class276.field4869[var6];
                                                                class261 var226 = class54.method418(var225, 0);
                                                                if (~var226.field4505 <= -1 && ~var226.field4568 <= -1) {
                                                                    class276.field4869[var6++] = var226.field4568;
                                                                    continue;
                                                                }
                                                                class276.field4869[var6++] = var225;
                                                                continue;
                                                            }
                                                            if (var503 == 4207) {
                                                                --var6;
                                                                int var227 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class54.method418(var227, 0).field4533 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var503 == 4208) {
                                                                var6 -= 2;
                                                                int var228 = class276.field4869[var6];
                                                                int var229 = class276.field4869[var6 + 1];
                                                                class223 var230 = class98.method650(var229, -125);
                                                                if (var230.method1516(-127)) {
                                                                    class50.field1063[var7++] = class54.method418(var228, 0).method1737(var230.field3980, (byte) 123, var229);
                                                                } else {
                                                                    class276.field4869[var6++] = class54.method418(var228, 0).method1742(var229, var230.field3985, (byte) 42);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var503 == -4211) {
                                                                --var6;
                                                                int var231 = class276.field4869[var6];
                                                                --var7;
                                                                class265 var232 = class50.field1063[var7];
                                                                class183.method1233(0, var232, var231 == 1);
                                                                class276.field4869[var6++] = class120.field2110;
                                                                continue;
                                                            }
                                                            if (var503 == 4211) {
                                                                if (class127.field2276 != null && class242.field4219 < class120.field2110) {
                                                                    class276.field4869[var6++] = class203.method1395(65535, class127.field2276[class242.field4219++]);
                                                                    continue;
                                                                }
                                                                class276.field4869[var6++] = -1;
                                                                continue;
                                                            }
                                                            if (var503 == 4212) {
                                                                class242.field4219 = 0;
                                                                continue;
                                                            }
                                                        } else if (~var503 > -4401) {
                                                            if (~var503 == -4301) {
                                                                var6 -= 2;
                                                                int var233 = class276.field4869[var6];
                                                                int var234 = class276.field4869[var6 + 1];
                                                                class223 var235 = class98.method650(var234, -128);
                                                                if (var235.method1516(-114)) {
                                                                    class50.field1063[var7++] = class98.method654(var233, -1).method1837(var234, var235.field3980, 124);
                                                                } else {
                                                                    class276.field4869[var6++] = class98.method654(var233, -1).method1833(var235.field3985, var234, -10849);
                                                                }
                                                                continue;
                                                            }
                                                            if (~var503 == -4302) {
                                                                --var6;
                                                                int var236 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var236, -1).field4765;
                                                                continue;
                                                            }
                                                            if (var503 == 4302) {
                                                                --var6;
                                                                int var237 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var237, -1).field4751;
                                                                continue;
                                                            }
                                                            if (var503 == 4303) {
                                                                --var6;
                                                                int var238 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var238, -1).field4768;
                                                                continue;
                                                            }
                                                            if (~var503 == -4305) {
                                                                --var6;
                                                                int var239 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var239, -1).field4777;
                                                                continue;
                                                            }
                                                            if (var503 == 4305) {
                                                                --var6;
                                                                int var240 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var240, -1).field4742;
                                                                continue;
                                                            }
                                                            if (var503 == 4306) {
                                                                --var6;
                                                                int var241 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var241, -1).field4771;
                                                                continue;
                                                            }
                                                            if (~var503 == -4308) {
                                                                --var6;
                                                                int var242 = class276.field4869[var6];
                                                                class276.field4869[var6++] = class98.method654(var242, -1).field4727;
                                                                continue;
                                                            }
                                                        } else if (~var503 > -4501) {
                                                            if (var503 == 4400) {
                                                                var6 -= 2;
                                                                int var243 = class276.field4869[var6];
                                                                int var244 = class276.field4869[var6 + 1];
                                                                class223 var245 = class98.method650(var244, -128);
                                                                if (!var245.method1516(-47)) {
                                                                    class276.field4869[var6++] = class84.method574(54, var243).method868(var245.field3985, var244, true);
                                                                } else {
                                                                    class50.field1063[var7++] = class84.method574(4, var243).method863(var244, var245.field3980, true);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (var503 >= 4600) {
                                                            if (var503 >= 5100) {
                                                                if (~var503 > -5201) {
                                                                    if (~var503 == -5101) {
                                                                        if (class69.field1311[86]) {
                                                                            class276.field4869[var6++] = 1;
                                                                        } else {
                                                                            class276.field4869[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5101) {
                                                                        if (class69.field1311[82]) {
                                                                            class276.field4869[var6++] = 1;
                                                                        } else {
                                                                            class276.field4869[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5102) {
                                                                        if (class69.field1311[81]) {
                                                                            class276.field4869[var6++] = 1;
                                                                        } else {
                                                                            class276.field4869[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (~var503 <= -5301) {
                                                                    if (~var503 <= -5401) {
                                                                        if (var503 < 5500) {
                                                                            if (~var503 == -5401) {
                                                                                ++class196.field3504;
                                                                                var7 -= 2;
                                                                                class265 var246 = class50.field1063[var7];
                                                                                class265 var247 = class50.field1063[var7 - -1];
                                                                                --var6;
                                                                                int var248 = class276.field4869[var6];
                                                                                class55.field1133.method1863(true, 182);
                                                                                class55.field1133.method903((byte) 36, 1 + class155.method1052((byte) 126, var246) - -class155.method1052((byte) -125, var247));
                                                                                class55.field1133.method941(var246, (byte) -58);
                                                                                class55.field1133.method941(var247, (byte) -58);
                                                                                class55.field1133.method903((byte) 36, var248);
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5402) {
                                                                                var6 -= 2;
                                                                                class265.field4610[class276.field4869[var6]] = (short) class238.method1592(class276.field4869[var6 + 1], (byte) -42);
                                                                                class174.method1144(-5436);
                                                                                class231.method1558((byte) 115);
                                                                                class113.method747(-58);
                                                                                class188.method1286(true);
                                                                                class227.method1540(-32514);
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5405) {
                                                                                var6 -= 2;
                                                                                int var249 = class276.field4869[var6];
                                                                                int var250 = class276.field4869[var6 - -1];
                                                                                if (var249 >= 0 && var249 < 2) {
                                                                                    class243.field4235[var249] = new int[var250 << 1][4];
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5407) {
                                                                                var6 -= 7;
                                                                                int var251 = class276.field4869[var6];
                                                                                int var252 = class276.field4869[var6 + 1] << 1;
                                                                                int var253 = class276.field4869[var6 - -2];
                                                                                int var254 = class276.field4869[var6 + 4];
                                                                                int var255 = class276.field4869[var6 - -3];
                                                                                int var256 = class276.field4869[var6 + 6];
                                                                                int var257 = class276.field4869[var6 + 5];
                                                                                if (~var251 <= -1 && var251 < 2 && class243.field4235[var251] != null && ~var252 <= -1 && ~var252 > ~class243.field4235[var251].length) {
                                                                                    class243.field4235[var251][var252] = new int[] { (class203.method1395(268421633, var253) >> 14) * 128, var255, 128 * class203.method1395(16383, var253), var256 };
                                                                                    class243.field4235[var251][var252 + 1] = new int[] { (class203.method1395(268431602, var254) >> 14) * 128, var257, class203.method1395(16383, var254) * 128 };
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5407) {
                                                                                --var6;
                                                                                int var258 = class243.field4235[class276.field4869[var6]].length >> 1;
                                                                                class276.field4869[var6++] = var258;
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5412) {
                                                                                if (class49.field1044 != null) {
                                                                                    System.exit(0);
                                                                                } else {
                                                                                    class105.method703((byte) 106, false, class223.method1513(-1));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5419) {
                                                                                class265 var259 = class112.field1962;
                                                                                if (class59.field1192 != null) {
                                                                                    var259 = class54.method417((byte) -15, class59.field1192.field2000);
                                                                                    try {
                                                                                        if (class59.field1192.field1997 != null) {
                                                                                            byte[] var260 = ((String) class59.field1192.field1997).getBytes("ISO-8859-1");
                                                                                            var259 = class7.method51(0, 12047, var260.length, var260);
                                                                                        }
                                                                                    } catch (UnsupportedEncodingException var501) {
                                                                                    }
                                                                                }
                                                                                class50.field1063[var7++] = var259;
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5420) {
                                                                                class276.field4869[var6++] = ~class226.field4010 == -4 ? 1 : 0;
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5421) {
                                                                                --var7;
                                                                                class265 var261 = class50.field1063[var7];
                                                                                --var6;
                                                                                boolean var262 = class276.field4869[var6] == 1;
                                                                                class265 var263 = class148.method1022(10, new class265[] { class223.method1513(-1), var261 });
                                                                                if (class49.field1044 != null || var262 && class226.field4010 != 3 && class226.field4011.startsWith("win") && !class56.field1137) {
                                                                                    class236.field4126 = var263;
                                                                                    class10.field340 = var262;
                                                                                    class119.field2106 = class281.field4957.method1536(30581, new String(var263.method1787(0), "ISO-8859-1"));
                                                                                    continue;
                                                                                }
                                                                                class105.method703((byte) -54, var262, var263);
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5423) {
                                                                                var7 -= 2;
                                                                                class265 var264 = class50.field1063[var7 + 1];
                                                                                --var6;
                                                                                int var265 = class276.field4869[var6];
                                                                                class265 var266 = class50.field1063[var7];
                                                                                if (~var266.method1808((byte) -15) < -1) {
                                                                                    if (class112.field1967 == null) {
                                                                                        class112.field1967 = new class265[class32.field809[class229.field4051]];
                                                                                    }
                                                                                    class112.field1967[var265] = var266;
                                                                                }
                                                                                if (~var264.method1808((byte) -15) < -1) {
                                                                                    if (class210.field3778 == null) {
                                                                                        class210.field3778 = new class265[class32.field809[class229.field4051]];
                                                                                    }
                                                                                    class210.field3778[var265] = var264;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5423) {
                                                                                --var7;
                                                                                class50.field1063[var7].method1770((byte) 9);
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5424) {
                                                                                var6 -= 11;
                                                                                class203.field3636 = class276.field4869[var6];
                                                                                class281.field4955 = class276.field4869[var6 + 1];
                                                                                field1697 = class276.field4869[var6 + 2];
                                                                                class1.field25 = class276.field4869[var6 + 3];
                                                                                class58.field1187 = class276.field4869[var6 + 4];
                                                                                class189.field3398 = class276.field4869[var6 + 5];
                                                                                class50.field1060 = class276.field4869[var6 + 6];
                                                                                class61.field1218 = class276.field4869[var6 + 7];
                                                                                class260.field4489 = class276.field4869[var6 - -8];
                                                                                class51.field1073 = class276.field4869[var6 + 9];
                                                                                class51.field1068 = class276.field4869[var6 - -10];
                                                                                class243.field4236.method1330(class58.field1187, (byte) -48);
                                                                                class243.field4236.method1330(class189.field3398, (byte) -11);
                                                                                class243.field4236.method1330(class50.field1060, (byte) -106);
                                                                                class243.field4236.method1330(class61.field1218, (byte) -74);
                                                                                class243.field4236.method1330(class260.field4489, (byte) -51);
                                                                                class97.field1711 = true;
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5425) {
                                                                                class70.method498(823277998);
                                                                                class97.field1711 = false;
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5426) {
                                                                                --var6;
                                                                                class133.field2409 = class276.field4869[var6];
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5427) {
                                                                                var6 -= 2;
                                                                                class104.field1846 = class276.field4869[var6];
                                                                                class277.field4885 = class276.field4869[var6 - -1];
                                                                                continue;
                                                                            }
                                                                        } else if (var503 >= 5600) {
                                                                            if (~var503 <= -5701) {
                                                                                if (~var503 <= -6101) {
                                                                                    if (~var503 <= -6201) {
                                                                                        if (var503 < 6300) {
                                                                                            if (~var503 == -6201) {
                                                                                                var6 -= 2;
                                                                                                class84.field1579 = (short) class276.field4869[var6];
                                                                                                if (~class84.field1579 >= -1) {
                                                                                                    class84.field1579 = 256;
                                                                                                }
                                                                                                class148.field2759 = (short) class276.field4869[var6 + 1];
                                                                                                if (~class148.field2759 >= -1) {
                                                                                                    class148.field2759 = 205;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6201) {
                                                                                                var6 -= 2;
                                                                                                class160.field2933 = (short) class276.field4869[var6];
                                                                                                if (class160.field2933 <= 0) {
                                                                                                    class160.field2933 = 256;
                                                                                                }
                                                                                                class87.field1585 = (short) class276.field4869[var6 + 1];
                                                                                                if (~class87.field1585 >= -1) {
                                                                                                    class87.field1585 = 320;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6202) {
                                                                                                var6 -= 4;
                                                                                                class7.field265 = (short) class276.field4869[var6];
                                                                                                if (class7.field265 <= 0) {
                                                                                                    class7.field265 = 1;
                                                                                                }
                                                                                                class84.field1570 = (short) class276.field4869[var6 + 1];
                                                                                                if (~class84.field1570 < -1) {
                                                                                                    if (~class7.field265 < ~class84.field1570) {
                                                                                                        class84.field1570 = class7.field265;
                                                                                                    }
                                                                                                } else {
                                                                                                    class84.field1570 = 32767;
                                                                                                }
                                                                                                class28.field732 = (short) class276.field4869[var6 + 2];
                                                                                                if (class28.field732 <= 0) {
                                                                                                    class28.field732 = 1;
                                                                                                }
                                                                                                class61.field1217 = (short) class276.field4869[var6 + 3];
                                                                                                if (class61.field1217 > 0) {
                                                                                                    if (~class61.field1217 > ~class28.field732) {
                                                                                                        class61.field1217 = class28.field732;
                                                                                                    }
                                                                                                } else {
                                                                                                    class61.field1217 = 32767;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6203) {
                                                                                                class83.method571(class278.field4912.field89, false, 26379, 0, 0, class278.field4912.field84);
                                                                                                class276.field4869[var6++] = class201.field3611;
                                                                                                class276.field4869[var6++] = class245.field4269;
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6204) {
                                                                                                class276.field4869[var6++] = class160.field2933;
                                                                                                class276.field4869[var6++] = class87.field1585;
                                                                                                continue;
                                                                                            }
                                                                                            if (~var503 == -6206) {
                                                                                                class276.field4869[var6++] = class84.field1579;
                                                                                                class276.field4869[var6++] = class148.field2759;
                                                                                                continue;
                                                                                            }
                                                                                        } else if (~var503 > -6401) {
                                                                                            if (~var503 == -6301) {
                                                                                                class276.field4869[var6++] = (int) (class136.method950(8954) / 60000L);
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6301) {
                                                                                                class276.field4869[var6++] = -11745 + (int) (class136.method950(8954) / 86400000L);
                                                                                                continue;
                                                                                            }
                                                                                            if (~var503 == -6303) {
                                                                                                var6 -= 3;
                                                                                                int var267 = class276.field4869[var6 - -1];
                                                                                                int var268 = class276.field4869[var6];
                                                                                                int var269 = class276.field4869[var6 - -2];
                                                                                                class221.field3964.clear();
                                                                                                class221.field3964.set(11, 12);
                                                                                                class221.field3964.set(var269, var267, var268);
                                                                                                class276.field4869[var6++] = -11745 + (int) (class221.field3964.getTime().getTime() / 86400000L);
                                                                                                continue;
                                                                                            }
                                                                                            if (~var503 == -6304) {
                                                                                                class221.field3964.clear();
                                                                                                class221.field3964.setTime(new Date(class136.method950(8954)));
                                                                                                class276.field4869[var6++] = class221.field3964.get(1);
                                                                                                continue;
                                                                                            }
                                                                                            if (var503 == 6304) {
                                                                                                boolean var270 = true;
                                                                                                --var6;
                                                                                                int var271 = class276.field4869[var6];
                                                                                                if (var271 < 0) {
                                                                                                    var270 = ~((var271 - -1) % 4) == -1;
                                                                                                } else if (~var271 <= -1583) {
                                                                                                    if (~(var271 % 4) == -1) {
                                                                                                        if (~(var271 % 100) == -1) {
                                                                                                            if (~(var271 % 400) != -1) {
                                                                                                                var270 = false;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var270 = true;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var270 = false;
                                                                                                    }
                                                                                                } else {
                                                                                                    var270 = ~(var271 % 4) == -1;
                                                                                                }
                                                                                                class276.field4869[var6++] = !var270 ? 0 : 1;
                                                                                                continue;
                                                                                            }
                                                                                        } else if (~var503 <= -6501) {
                                                                                            if (~var503 <= -6601) {
                                                                                                if (var503 < 6700) {
                                                                                                    if (var503 == 6600) {
                                                                                                        --var6;
                                                                                                        class253.field4359 = class276.field4869[var6] == 1;
                                                                                                        class7.method53(class281.field4957, (byte) -125);
                                                                                                        continue;
                                                                                                    }
                                                                                                    if (~var503 == -6602) {
                                                                                                        class276.field4869[var6++] = !class253.field4359 ? 0 : 1;
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (var503 == 6500) {
                                                                                                    if (~class246.field4281 == -11 && ~class283.field4985 == -1 && class122.field2189 == 0 && ~class141.field2626 == -1) {
                                                                                                        class276.field4869[var6++] = class229.method1553((byte) 111) != -1 ? 1 : 0;
                                                                                                        continue;
                                                                                                    }
                                                                                                    class276.field4869[var6++] = 1;
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var503 == -6502) {
                                                                                                    class229 var272 = class68.method487(-114);
                                                                                                    if (var272 != null) {
                                                                                                        class276.field4869[var6++] = var272.field4055;
                                                                                                        class276.field4869[var6++] = var272.field1835;
                                                                                                        class50.field1063[var7++] = var272.field4054;
                                                                                                        class230 var273 = var272.method1550(100);
                                                                                                        class276.field4869[var6++] = var273.field4067;
                                                                                                        class50.field1063[var7++] = var273.field4063;
                                                                                                        class276.field4869[var6++] = var272.field1824;
                                                                                                    } else {
                                                                                                        class276.field4869[var6++] = -1;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var503 == -6503) {
                                                                                                    class229 var274 = class210.method1438(-70);
                                                                                                    if (var274 == null) {
                                                                                                        class276.field4869[var6++] = -1;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                    } else {
                                                                                                        class276.field4869[var6++] = var274.field4055;
                                                                                                        class276.field4869[var6++] = var274.field1835;
                                                                                                        class50.field1063[var7++] = var274.field4054;
                                                                                                        class230 var275 = var274.method1550(100);
                                                                                                        class276.field4869[var6++] = var275.field4067;
                                                                                                        class50.field1063[var7++] = var275.field4063;
                                                                                                        class276.field4869[var6++] = var274.field1824;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var503 == -6504) {
                                                                                                    --var6;
                                                                                                    int var276 = class276.field4869[var6];
                                                                                                    if (~class246.field4281 == -11 && class283.field4985 == 0 && ~class122.field2189 == -1 && class141.field2626 == 0) {
                                                                                                        class276.field4869[var6++] = class182.method1215((byte) -128, var276) ? 1 : 0;
                                                                                                        continue;
                                                                                                    }
                                                                                                    class276.field4869[var6++] = 0;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var503 == 6504) {
                                                                                                    --var6;
                                                                                                    class77.field1469 = class276.field4869[var6];
                                                                                                    class7.method53(class281.field4957, (byte) -123);
                                                                                                    continue;
                                                                                                }
                                                                                                if (~var503 == -6506) {
                                                                                                    class276.field4869[var6++] = class77.field1469;
                                                                                                    continue;
                                                                                                }
                                                                                                if (var503 == 6506) {
                                                                                                    --var6;
                                                                                                    int var277 = class276.field4869[var6];
                                                                                                    class229 var278 = class258.method1703((byte) -87, var277);
                                                                                                    if (var278 != null) {
                                                                                                        class276.field4869[var6++] = var278.field1835;
                                                                                                        class50.field1063[var7++] = var278.field4054;
                                                                                                        class230 var279 = var278.method1550(100);
                                                                                                        class276.field4869[var6++] = var279.field4067;
                                                                                                        class50.field1063[var7++] = var279.field4063;
                                                                                                        class276.field4869[var6++] = var278.field1824;
                                                                                                    } else {
                                                                                                        class276.field4869[var6++] = -1;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                        class50.field1063[var7++] = class112.field1962;
                                                                                                        class276.field4869[var6++] = 0;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                if (var503 == 6507) {
                                                                                                    var6 -= 4;
                                                                                                    int var280 = class276.field4869[var6];
                                                                                                    boolean var281 = class276.field4869[var6 - -1] == 1;
                                                                                                    int var282 = class276.field4869[var6 - -2];
                                                                                                    boolean var283 = class276.field4869[var6 + 3] == 1;
                                                                                                    class130.method856(var283, var282, (byte) 114, var280, var281);
                                                                                                    continue;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (var503 == 6405) {
                                                                                                class276.field4869[var6++] = class51.method404(-1) ? 1 : 0;
                                                                                                continue;
                                                                                            }
                                                                                            if (~var503 == -6407) {
                                                                                                class276.field4869[var6++] = !class131.method874(-111502399) ? 0 : 1;
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (var503 == 6101) {
                                                                                            class276.field4869[var6++] = class124.field2227;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6103) {
                                                                                            class276.field4869[var6++] = !class231.method1561(25088) ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6104) {
                                                                                            class276.field4869[var6++] = class117.field2077 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6106) {
                                                                                            class276.field4869[var6++] = !client.field3855 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6106) {
                                                                                            class276.field4869[var6++] = class19.field498 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6107) {
                                                                                            class276.field4869[var6++] = !class61.field1219 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6109) {
                                                                                            class276.field4869[var6++] = class70.field1360 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6109) {
                                                                                            class276.field4869[var6++] = class196.field3505 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6110) {
                                                                                            class276.field4869[var6++] = !class214.field3830 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6111) {
                                                                                            class276.field4869[var6++] = class107.field1895;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6113) {
                                                                                            class276.field4869[var6++] = class258.field4428 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6115) {
                                                                                            class276.field4869[var6++] = class23.field688 ? 1 : 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6115) {
                                                                                            class276.field4869[var6++] = !class245.field4270 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6116) {
                                                                                            class276.field4869[var6++] = class243.field4246;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6117) {
                                                                                            class276.field4869[var6++] = !class127.field2273 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6118) {
                                                                                            class276.field4869[var6++] = class43.field959;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6120) {
                                                                                            class276.field4869[var6++] = class105.field1868;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6120) {
                                                                                            class276.field4869[var6++] = class172.field3095;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6121) {
                                                                                            class276.field4869[var6++] = 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6123) {
                                                                                            class276.field4869[var6++] = class255.method1677();
                                                                                            continue;
                                                                                        }
                                                                                        if (~var503 == -6125) {
                                                                                            class276.field4869[var6++] = class54.field1119;
                                                                                            continue;
                                                                                        }
                                                                                        if (var503 == 6128) {
                                                                                            class276.field4869[var6++] = !class110.field1924 ? 0 : 1;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (var503 == 6001) {
                                                                                        --var6;
                                                                                        int var284 = class276.field4869[var6];
                                                                                        if (~var284 > -2) {
                                                                                            var284 = 1;
                                                                                        }
                                                                                        if (var284 > 4) {
                                                                                            var284 = 4;
                                                                                        }
                                                                                        class124.field2227 = var284;
                                                                                        if (~class124.field2227 == -2) {
                                                                                            class247.method1647(0.9F);
                                                                                        }
                                                                                        if (~class124.field2227 == -3) {
                                                                                            class247.method1647(0.8F);
                                                                                        }
                                                                                        if (~class124.field2227 == -4) {
                                                                                            class247.method1647(0.7F);
                                                                                        }
                                                                                        if (class124.field2227 == 4) {
                                                                                            class247.method1647(0.6F);
                                                                                        }
                                                                                        class231.method1558((byte) 121);
                                                                                        class7.method53(class281.field4957, (byte) -128);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6003) {
                                                                                        --var6;
                                                                                        class162.method1072(81, class276.field4869[var6] == 1);
                                                                                        class237.method1580((byte) -3);
                                                                                        class261.method1744((byte) 62);
                                                                                        client.method1469((byte) 0);
                                                                                        class7.method53(class281.field4957, (byte) -126);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6004) {
                                                                                        --var6;
                                                                                        class117.field2077 = ~class276.field4869[var6] == -2;
                                                                                        client.method1469((byte) 0);
                                                                                        class7.method53(class281.field4957, (byte) -128);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6005) {
                                                                                        --var6;
                                                                                        client.field3855 = class276.field4869[var6] == 1;
                                                                                        class261.method1744((byte) 62);
                                                                                        class7.method53(class281.field4957, (byte) -128);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6007) {
                                                                                        --var6;
                                                                                        class19.field498 = class276.field4869[var6] == 1;
                                                                                        ((class9) class247.field4292).method69(!class19.field498, -609);
                                                                                        class7.method53(class281.field4957, (byte) -124);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6008) {
                                                                                        --var6;
                                                                                        class61.field1219 = ~class276.field4869[var6] == -2;
                                                                                        class7.method53(class281.field4957, (byte) -125);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6008) {
                                                                                        --var6;
                                                                                        class70.field1360 = ~class276.field4869[var6] == -2;
                                                                                        class7.method53(class281.field4957, (byte) -127);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6009) {
                                                                                        --var6;
                                                                                        class196.field3505 = class276.field4869[var6] == 1;
                                                                                        class7.method53(class281.field4957, (byte) -124);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6011) {
                                                                                        --var6;
                                                                                        class214.field3830 = ~class276.field4869[var6] == -2;
                                                                                        class7.method53(class281.field4957, (byte) -123);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6012) {
                                                                                        --var6;
                                                                                        int var285 = class276.field4869[var6];
                                                                                        if (var285 < 0 || var285 > 2) {
                                                                                            var285 = 0;
                                                                                        }
                                                                                        class107.field1895 = var285;
                                                                                        class7.method53(class281.field4957, (byte) -128);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6012) {
                                                                                        --var6;
                                                                                        class258.field4428 = ~class276.field4869[var6] == -2;
                                                                                        if (~class124.field2227 == -2) {
                                                                                            class247.method1647(0.9F);
                                                                                        }
                                                                                        if (class124.field2227 == 2) {
                                                                                            class247.method1647(0.8F);
                                                                                        }
                                                                                        if (~class124.field2227 == -4) {
                                                                                            class247.method1647(0.7F);
                                                                                        }
                                                                                        if (class124.field2227 == 4) {
                                                                                            class247.method1647(0.6F);
                                                                                        }
                                                                                        class261.method1744((byte) 62);
                                                                                        class7.method53(class281.field4957, (byte) -124);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6014) {
                                                                                        --var6;
                                                                                        class23.field688 = ~class276.field4869[var6] == -2;
                                                                                        class7.method53(class281.field4957, (byte) -125);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6016) {
                                                                                        --var6;
                                                                                        class245.field4270 = ~class276.field4869[var6] == -2;
                                                                                        class7.method53(class281.field4957, (byte) -123);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6016) {
                                                                                        --var6;
                                                                                        int var286 = class276.field4869[var6];
                                                                                        if (var286 < 0 || ~var286 < -3) {
                                                                                            var286 = 0;
                                                                                        }
                                                                                        class243.field4246 = var286;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6017) {
                                                                                        --var6;
                                                                                        class127.field2273 = class276.field4869[var6] == 1;
                                                                                        class197.method1361(10);
                                                                                        class7.method53(class281.field4957, (byte) -122);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6018) {
                                                                                        --var6;
                                                                                        int var287 = class276.field4869[var6];
                                                                                        if (var287 < 0) {
                                                                                            var287 = 0;
                                                                                        }
                                                                                        if (~var287 < -128) {
                                                                                            var287 = 127;
                                                                                        }
                                                                                        class43.field959 = var287;
                                                                                        class7.method53(class281.field4957, (byte) -124);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6019) {
                                                                                        --var6;
                                                                                        int var288 = class276.field4869[var6];
                                                                                        if (~var288 > -1) {
                                                                                            var288 = 0;
                                                                                        }
                                                                                        if (var288 > 255) {
                                                                                            var288 = 255;
                                                                                        }
                                                                                        if (~class105.field1868 != ~var288) {
                                                                                            if (~class105.field1868 == -1 && ~class44.field980 != 0) {
                                                                                                class171.method1131(0, false, 10000, class44.field980, class14.field427, var288);
                                                                                                class112.field1964 = false;
                                                                                            } else if (~var288 == -1) {
                                                                                                class97.method649(-4706);
                                                                                                class112.field1964 = false;
                                                                                            } else {
                                                                                                class72.method509(0, var288);
                                                                                            }
                                                                                            class105.field1868 = var288;
                                                                                        }
                                                                                        class7.method53(class281.field4957, (byte) -123);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6020) {
                                                                                        --var6;
                                                                                        int var289 = class276.field4869[var6];
                                                                                        if (~var289 > -1) {
                                                                                            var289 = 0;
                                                                                        }
                                                                                        if (~var289 < -128) {
                                                                                            var289 = 127;
                                                                                        }
                                                                                        class172.field3095 = var289;
                                                                                        class7.method53(class281.field4957, (byte) -127);
                                                                                        class106.field1884 = false;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6022) {
                                                                                        --var6;
                                                                                        class171.field3092 = ~class276.field4869[var6] == -2;
                                                                                        client.method1469((byte) 0);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var503 == -6024) {
                                                                                        --var6;
                                                                                        int var290 = class276.field4869[var6];
                                                                                        if (var290 < 0) {
                                                                                            var290 = 0;
                                                                                        }
                                                                                        boolean var291 = false;
                                                                                        if (~var290 < -3) {
                                                                                            var290 = 2;
                                                                                        }
                                                                                        if (~class105.field1851 > -97) {
                                                                                            var291 = true;
                                                                                            var290 = 0;
                                                                                        }
                                                                                        class255.method1679(var290);
                                                                                        class7.method53(class281.field4957, (byte) -123);
                                                                                        class106.field1884 = false;
                                                                                        class276.field4869[var6++] = var291 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6024) {
                                                                                        --var6;
                                                                                        int var292 = class276.field4869[var6];
                                                                                        if (var292 < 0 || ~var292 < -3) {
                                                                                            var292 = 0;
                                                                                        }
                                                                                        class54.field1119 = var292;
                                                                                        class7.method53(class281.field4957, (byte) -128);
                                                                                        continue;
                                                                                    }
                                                                                    if (var503 == 6028) {
                                                                                        --var6;
                                                                                        class110.field1924 = class276.field4869[var6] != 0;
                                                                                        class7.method53(class281.field4957, (byte) -124);
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (~var503 == -5601) {
                                                                                    var7 -= 2;
                                                                                    class265 var293 = class50.field1063[var7];
                                                                                    class265 var294 = class50.field1063[var7 + 1];
                                                                                    --var6;
                                                                                    int var295 = class276.field4869[var6];
                                                                                    if (class246.field4281 == 10 && class283.field4985 == 0 && ~class122.field2189 == -1 && ~class141.field2626 == -1 && ~class7.field262 == -1) {
                                                                                        class18.method125((byte) -127, var295, var293, var294);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var503 == 5601) {
                                                                                    client.method1479(2048);
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5603) {
                                                                                    if (class122.field2189 == 0) {
                                                                                        class102.field1798 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5604) {
                                                                                    var6 -= 4;
                                                                                    if (~class246.field4281 == -11 && ~class283.field4985 == -1 && class122.field2189 == 0 && ~class141.field2626 == -1 && class7.field262 == 0) {
                                                                                        class126.method840((byte) -111, class276.field4869[var6], class276.field4869[var6 + 3], class276.field4869[var6 + 1], class276.field4869[var6 + 2]);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5605) {
                                                                                    --var7;
                                                                                    if (~class246.field4281 == -11 && ~class283.field4985 == -1 && class122.field2189 == 0 && class141.field2626 == 0 && ~class7.field262 == -1) {
                                                                                        class243.method1617(class50.field1063[var7].method1793(43), (byte) 113);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5606) {
                                                                                    var6 -= 4;
                                                                                    var7 -= 2;
                                                                                    if (class246.field4281 == 10 && class283.field4985 == 0 && ~class122.field2189 == -1 && ~class141.field2626 == -1 && ~class7.field262 == -1) {
                                                                                        class72.method505(-30881, class276.field4869[var6], class276.field4869[var6 - -1], class276.field4869[var6 - -3], class276.field4869[var6 + 2], class50.field1063[var7 + 1], class50.field1063[var7].method1793(43));
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var503 == 5606) {
                                                                                    if (class141.field2626 == 0) {
                                                                                        class277.field4892 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5608) {
                                                                                    class276.field4869[var6++] = class102.field1798;
                                                                                    continue;
                                                                                }
                                                                                if (var503 == 5608) {
                                                                                    class276.field4869[var6++] = class82.field1547;
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5610) {
                                                                                    class276.field4869[var6++] = class277.field4892;
                                                                                    continue;
                                                                                }
                                                                                if (~var503 == -5611) {
                                                                                    for (int var296 = 0; ~var296 > -6; ++var296) {
                                                                                        class50.field1063[var7++] = class49.field1045.length <= var296 ? class112.field1962 : class49.field1045[var296].method1765(true);
                                                                                    }
                                                                                    class49.field1045 = null;
                                                                                    continue;
                                                                                }
                                                                                if (var503 == 5611) {
                                                                                    class276.field4869[var6++] = class204.field3656;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (~var503 == -5501) {
                                                                                var6 -= 4;
                                                                                int var297 = class276.field4869[var6];
                                                                                int var298 = class276.field4869[var6 - -1];
                                                                                int var299 = class276.field4869[var6 - -2];
                                                                                int var300 = class276.field4869[var6 + 3];
                                                                                class1.method6(var300, var298, false, -2180, var299, (16383 & var297) - class231.field4073, (16383 & var297 >> 14) + -class64.field1248);
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5502) {
                                                                                var6 -= 4;
                                                                                int var301 = class276.field4869[var6 + 1];
                                                                                int var302 = class276.field4869[var6];
                                                                                int var303 = class276.field4869[var6 + 2];
                                                                                int var304 = class276.field4869[var6 + 3];
                                                                                class122.method813(var303, var304, (var302 >> 14 & 16383) + -class64.field1248, (var302 & 16383) + -class231.field4073, var301, false);
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5502) {
                                                                                var6 -= 6;
                                                                                int var305 = class276.field4869[var6];
                                                                                if (var305 >= 2) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class243.field4244 = var305;
                                                                                int var306 = class276.field4869[var6 + 1];
                                                                                if (~(class243.field4235[class243.field4244].length >> 1) >= ~(var306 - -1)) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class150.field2774 = var306;
                                                                                class53.field1101 = 0;
                                                                                class100.field1786 = class276.field4869[var6 + 2];
                                                                                class36.field857 = class276.field4869[var6 - -3];
                                                                                int var307 = class276.field4869[var6 - -4];
                                                                                if (var307 >= 2) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class71.field1366 = var307;
                                                                                int var308 = class276.field4869[var6 - -5];
                                                                                if (~(class243.field4235[class71.field1366].length >> 1) >= ~(var308 + 1)) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class225.field4000 = var308;
                                                                                class254.field4361 = 3;
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5504) {
                                                                                class39.method328((byte) 124);
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5504) {
                                                                                var6 -= 2;
                                                                                class118.field2087 = class276.field4869[var6];
                                                                                class79.field1500 = class276.field4869[var6 - -1];
                                                                                if (class254.field4361 == 2) {
                                                                                    class202.field3613 = class118.field2087;
                                                                                    class8.field272 = class79.field1500;
                                                                                }
                                                                                class16.method118(-4);
                                                                                continue;
                                                                            }
                                                                            if (~var503 == -5506) {
                                                                                class276.field4869[var6++] = class118.field2087;
                                                                                continue;
                                                                            }
                                                                            if (var503 == 5506) {
                                                                                class276.field4869[var6++] = class79.field1500;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var503 == 5300) {
                                                                            var6 -= 2;
                                                                            class276.field4869[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5301) {
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5302) {
                                                                            class276.field4869[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5303) {
                                                                            --var6;
                                                                            class276.field4869[var6++] = 0;
                                                                            class276.field4869[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5305) {
                                                                            byte var309 = -1;
                                                                            class276.field4869[var6++] = var309;
                                                                            continue;
                                                                        }
                                                                        if (~var503 == -5307) {
                                                                            class276.field4869[var6++] = class232.method1565((byte) 105);
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5307) {
                                                                            --var6;
                                                                            int var310 = class276.field4869[var6];
                                                                            if (~var310 > -1 || ~var310 < -3) {
                                                                                var310 = 0;
                                                                            }
                                                                            class57.method430(var310, -1, false, 0, -1);
                                                                            continue;
                                                                        }
                                                                        if (var503 == 5308) {
                                                                            class276.field4869[var6++] = class50.field1058;
                                                                            continue;
                                                                        }
                                                                        if (~var503 == -5310) {
                                                                            --var6;
                                                                            int var311 = class276.field4869[var6];
                                                                            if (var311 < 0 || ~var311 < -3) {
                                                                                var311 = 0;
                                                                            }
                                                                            class50.field1058 = var311;
                                                                            class7.method53(class281.field4957, (byte) -127);
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var503 == -5201) {
                                                                        --var6;
                                                                        class229.method1554(true, class276.field4869[var6]);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5202) {
                                                                        class276.field4869[var6++] = class17.method124(22124);
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5202) {
                                                                        --var6;
                                                                        class22.method219(class276.field4869[var6], 0);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5204) {
                                                                        --var7;
                                                                        class10.method82(false, class50.field1063[var7]);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5205) {
                                                                        class50.field1063[var7 + -1] = class184.method1241(-24463, class50.field1063[var7 - 1]);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5206) {
                                                                        --var7;
                                                                        class112.method741(18188, class50.field1063[var7]);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5207) {
                                                                        --var6;
                                                                        int var312 = class276.field4869[var6];
                                                                        class13 var313 = class17.method119(var312 >> 14 & 16383, -13, 16383 & var312);
                                                                        if (var313 != null) {
                                                                            class50.field1063[var7++] = var313.field410;
                                                                        } else {
                                                                            class50.field1063[var7++] = class112.field1962;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5207) {
                                                                        --var7;
                                                                        class13 var314 = class100.method672(12, class50.field1063[var7]);
                                                                        if (var314 != null && var314.field409 != null) {
                                                                            class50.field1063[var7++] = var314.field409;
                                                                            continue;
                                                                        }
                                                                        class50.field1063[var7++] = class112.field1962;
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5209) {
                                                                        class276.field4869[var6++] = class39.field891;
                                                                        class276.field4869[var6++] = class262.field4577;
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5210) {
                                                                        class276.field4869[var6++] = class278.field4911 + class269.field4796;
                                                                        class276.field4869[var6++] = -1 - class263.field4590 + class176.field3141 + class155.field2871;
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5211) {
                                                                        class13 var315 = class116.method780(82);
                                                                        if (var315 == null) {
                                                                            class276.field4869[var6++] = 0;
                                                                            class276.field4869[var6++] = 0;
                                                                        } else {
                                                                            class276.field4869[var6++] = var315.field415 * 64;
                                                                            class276.field4869[var6++] = var315.field408 * 64;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5212) {
                                                                        class13 var316 = class116.method780(116);
                                                                        if (var316 == null) {
                                                                            class276.field4869[var6++] = 0;
                                                                            class276.field4869[var6++] = 0;
                                                                        } else {
                                                                            class276.field4869[var6++] = var316.field404 - var316.field416;
                                                                            class276.field4869[var6++] = -var316.field402 + var316.field413;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5213) {
                                                                        int var317 = 0;
                                                                        int var318 = class2.method13(65536);
                                                                        class265 var319;
                                                                        if (var318 != -1) {
                                                                            var319 = class126.field2260.field2702[var318];
                                                                            var317 = class126.field2260.method997((byte) -116, var318);
                                                                        } else {
                                                                            var319 = class112.field1962;
                                                                        }
                                                                        class265 var320 = var319.method1763(class113.field1979, 255, class6.field220);
                                                                        class50.field1063[var7++] = var320;
                                                                        class276.field4869[var6++] = var317;
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5214) {
                                                                        int var321 = class216.method1489(-27081);
                                                                        int var322 = 0;
                                                                        class265 var323;
                                                                        if (~var321 != 0) {
                                                                            var323 = class126.field2260.field2702[var321];
                                                                            var322 = class126.field2260.method997((byte) -113, var321);
                                                                        } else {
                                                                            var323 = class112.field1962;
                                                                        }
                                                                        class265 var324 = var323.method1763(class113.field1979, 255, class6.field220);
                                                                        class50.field1063[var7++] = var324;
                                                                        class276.field4869[var6++] = var322;
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5215) {
                                                                        --var6;
                                                                        int var325 = class276.field4869[var6];
                                                                        class113.method745(var325 & 16383, true, var325 >> 14 & 16383);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5216) {
                                                                        --var7;
                                                                        class265 var326 = class50.field1063[var7];
                                                                        boolean var327 = false;
                                                                        --var6;
                                                                        int var328 = class276.field4869[var6];
                                                                        class177 var329 = class7.method54(var328 & 16383, var328 >> 14 & 16383, (byte) 126);
                                                                        for (class13 var330 = (class13) var329.method1148(-121); var330 != null; var330 = (class13) var329.method1153(100)) {
                                                                            if (var330.field410.method1791(var326, (byte) -98)) {
                                                                                var327 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!var327) {
                                                                            class276.field4869[var6++] = 0;
                                                                        } else {
                                                                            class276.field4869[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5216) {
                                                                        --var6;
                                                                        int var331 = class276.field4869[var6];
                                                                        class40.method334(100, var331);
                                                                        continue;
                                                                    }
                                                                    if (~var503 == -5218) {
                                                                        --var6;
                                                                        int var332 = class276.field4869[var6];
                                                                        if (!class227.method1541(116, var332)) {
                                                                            class276.field4869[var6++] = 0;
                                                                        } else {
                                                                            class276.field4869[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5218) {
                                                                        class13 var333 = class116.method780(87);
                                                                        if (var333 != null) {
                                                                            class276.field4869[var6++] = var333.field405;
                                                                        } else {
                                                                            class276.field4869[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var503 == 5219) {
                                                                        --var7;
                                                                        class258.method1705((byte) -102, class50.field1063[var7]);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (var503 == 5000) {
                                                                    class276.field4869[var6++] = class281.field4962;
                                                                    continue;
                                                                }
                                                                if (~var503 == -5002) {
                                                                    var6 -= 3;
                                                                    ++class6.field208;
                                                                    class281.field4962 = class276.field4869[var6];
                                                                    class111.field1936 = class276.field4869[var6 + 1];
                                                                    class125.field2244 = class276.field4869[var6 + 2];
                                                                    class55.field1133.method1863(true, 146);
                                                                    class55.field1133.method903((byte) 36, class281.field4962);
                                                                    class55.field1133.method903((byte) 36, class111.field1936);
                                                                    class55.field1133.method903((byte) 36, class125.field2244);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5003) {
                                                                    ++class210.field3767;
                                                                    var6 -= 2;
                                                                    --var7;
                                                                    class265 var334 = class50.field1063[var7];
                                                                    int var335 = class276.field4869[var6 + 1];
                                                                    int var336 = class276.field4869[var6];
                                                                    class55.field1133.method1863(true, 185);
                                                                    class55.field1133.method911(0, var334.method1793(43));
                                                                    class55.field1133.method903((byte) 36, var336 + -1);
                                                                    class55.field1133.method903((byte) 36, var335);
                                                                    continue;
                                                                }
                                                                if (var503 == 5003) {
                                                                    --var6;
                                                                    int var337 = class276.field4869[var6];
                                                                    class265 var338 = null;
                                                                    if (var337 < 100) {
                                                                        var338 = class59.field1194[var337];
                                                                    }
                                                                    if (var338 == null) {
                                                                        var338 = class112.field1962;
                                                                    }
                                                                    class50.field1063[var7++] = var338;
                                                                    continue;
                                                                }
                                                                if (var503 == 5004) {
                                                                    --var6;
                                                                    int var339 = class276.field4869[var6];
                                                                    int var340 = -1;
                                                                    if (~var339 > -101 && class59.field1194[var339] != null) {
                                                                        var340 = class104.field1845[var339];
                                                                    }
                                                                    class276.field4869[var6++] = var340;
                                                                    continue;
                                                                }
                                                                if (var503 == 5005) {
                                                                    class276.field4869[var6++] = class111.field1936;
                                                                    continue;
                                                                }
                                                                if (var503 == 5008) {
                                                                    --var7;
                                                                    class265 var341 = class50.field1063[var7];
                                                                    if (var341.method1785(0, class124.field2235)) {
                                                                        class80.method554((byte) 71, var341);
                                                                        continue;
                                                                    }
                                                                    if (~class30.field773 == -1 && (class262.field4583 && !class203.field3632 || class101.field1792)) {
                                                                        continue;
                                                                    }
                                                                    byte var342 = 0;
                                                                    byte var343 = 0;
                                                                    ++class277.field4881;
                                                                    class265 var344 = var341.method1804(-98);
                                                                    if (!var344.method1785(0, class14.field431)) {
                                                                        if (var344.method1785(0, class19.field511)) {
                                                                            var341 = var341.method1810(-1, class19.field511.method1808((byte) -15));
                                                                            var342 = 1;
                                                                        } else if (!var344.method1785(0, class72.field1371)) {
                                                                            if (var344.method1785(0, class198.field3537)) {
                                                                                var342 = 3;
                                                                                var341 = var341.method1810(-1, class198.field3537.method1808((byte) -15));
                                                                            } else if (var344.method1785(0, class134.field2410)) {
                                                                                var341 = var341.method1810(-1, class134.field2410.method1808((byte) -15));
                                                                                var342 = 4;
                                                                            } else if (!var344.method1785(0, class195.field3487)) {
                                                                                if (!var344.method1785(0, class166.field2990)) {
                                                                                    if (var344.method1785(0, class174.field3133)) {
                                                                                        var342 = 7;
                                                                                        var341 = var341.method1810(-1, class174.field3133.method1808((byte) -15));
                                                                                    } else if (var344.method1785(0, class45.field1001)) {
                                                                                        var342 = 8;
                                                                                        var341 = var341.method1810(-1, class45.field1001.method1808((byte) -15));
                                                                                    } else if (var344.method1785(0, class238.field4152)) {
                                                                                        var342 = 9;
                                                                                        var341 = var341.method1810(-1, class238.field4152.method1808((byte) -15));
                                                                                    } else if (var344.method1785(0, class158.field2901)) {
                                                                                        var341 = var341.method1810(-1, class158.field2901.method1808((byte) -15));
                                                                                        var342 = 10;
                                                                                    } else if (!var344.method1785(0, class190.field3420)) {
                                                                                        if (~class44.field971 != -1) {
                                                                                            if (!var344.method1785(0, class14.field426)) {
                                                                                                if (!var344.method1785(0, class19.field513)) {
                                                                                                    if (!var344.method1785(0, class72.field1384)) {
                                                                                                        if (var344.method1785(0, class198.field3539)) {
                                                                                                            var341 = var341.method1810(-1, class198.field3539.method1808((byte) -15));
                                                                                                            var342 = 3;
                                                                                                        } else if (var344.method1785(0, class134.field2418)) {
                                                                                                            var341 = var341.method1810(-1, class134.field2418.method1808((byte) -15));
                                                                                                            var342 = 4;
                                                                                                        } else if (var344.method1785(0, class195.field3499)) {
                                                                                                            var341 = var341.method1810(-1, class195.field3499.method1808((byte) -15));
                                                                                                            var342 = 5;
                                                                                                        } else if (var344.method1785(0, class166.field2999)) {
                                                                                                            var341 = var341.method1810(-1, class166.field2999.method1808((byte) -15));
                                                                                                            var342 = 6;
                                                                                                        } else if (!var344.method1785(0, class174.field3120)) {
                                                                                                            if (var344.method1785(0, class45.field1009)) {
                                                                                                                var341 = var341.method1810(-1, class45.field1009.method1808((byte) -15));
                                                                                                                var342 = 8;
                                                                                                            } else if (var344.method1785(0, class238.field4158)) {
                                                                                                                var341 = var341.method1810(-1, class238.field4158.method1808((byte) -15));
                                                                                                                var342 = 9;
                                                                                                            } else if (!var344.method1785(0, class158.field2909)) {
                                                                                                                if (var344.method1785(0, class190.field3408)) {
                                                                                                                    var341 = var341.method1810(-1, class190.field3408.method1808((byte) -15));
                                                                                                                    var342 = 11;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var342 = 10;
                                                                                                                var341 = var341.method1810(-1, class158.field2909.method1808((byte) -15));
                                                                                                            }
                                                                                                        } else {
                                                                                                            var342 = 7;
                                                                                                            var341 = var341.method1810(-1, class174.field3120.method1808((byte) -15));
                                                                                                        }
                                                                                                    } else {
                                                                                                        var342 = 2;
                                                                                                        var341 = var341.method1810(-1, class72.field1384.method1808((byte) -15));
                                                                                                    }
                                                                                                } else {
                                                                                                    var341 = var341.method1810(-1, class19.field513.method1808((byte) -15));
                                                                                                    var342 = 1;
                                                                                                }
                                                                                            } else {
                                                                                                var342 = 0;
                                                                                                var341 = var341.method1810(-1, class14.field426.method1808((byte) -15));
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var342 = 11;
                                                                                        var341 = var341.method1810(-1, class190.field3420.method1808((byte) -15));
                                                                                    }
                                                                                } else {
                                                                                    var342 = 6;
                                                                                    var341 = var341.method1810(-1, class166.field2990.method1808((byte) -15));
                                                                                }
                                                                            } else {
                                                                                var342 = 5;
                                                                                var341 = var341.method1810(-1, class195.field3487.method1808((byte) -15));
                                                                            }
                                                                        } else {
                                                                            var341 = var341.method1810(-1, class72.field1371.method1808((byte) -15));
                                                                            var342 = 2;
                                                                        }
                                                                    } else {
                                                                        var342 = 0;
                                                                        var341 = var341.method1810(-1, class14.field431.method1808((byte) -15));
                                                                    }
                                                                    class265 var345 = var341.method1804(124);
                                                                    if (var345.method1785(0, class19.field515)) {
                                                                        var343 = 1;
                                                                        var341 = var341.method1810(-1, class19.field515.method1808((byte) -15));
                                                                    } else if (var345.method1785(0, class36.field831)) {
                                                                        var343 = 2;
                                                                        var341 = var341.method1810(-1, class36.field831.method1808((byte) -15));
                                                                    } else if (!var345.method1785(0, class236.field4115)) {
                                                                        if (var345.method1785(0, class57.field1176)) {
                                                                            var341 = var341.method1810(-1, class57.field1176.method1808((byte) -15));
                                                                            var343 = 4;
                                                                        } else if (var345.method1785(0, class257.field4420)) {
                                                                            var341 = var341.method1810(-1, class257.field4420.method1808((byte) -15));
                                                                            var343 = 5;
                                                                        } else if (~class44.field971 != -1) {
                                                                            if (var345.method1785(0, class19.field517)) {
                                                                                var343 = 1;
                                                                                var341 = var341.method1810(-1, class19.field517.method1808((byte) -15));
                                                                            } else if (!var345.method1785(0, class36.field848)) {
                                                                                if (!var345.method1785(0, class236.field4116)) {
                                                                                    if (!var345.method1785(0, class57.field1156)) {
                                                                                        if (var345.method1785(0, class257.field4395)) {
                                                                                            var341 = var341.method1810(-1, class257.field4395.method1808((byte) -15));
                                                                                            var343 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var341 = var341.method1810(-1, class57.field1156.method1808((byte) -15));
                                                                                        var343 = 4;
                                                                                    }
                                                                                } else {
                                                                                    var343 = 3;
                                                                                    var341 = var341.method1810(-1, class236.field4116.method1808((byte) -15));
                                                                                }
                                                                            } else {
                                                                                var341 = var341.method1810(-1, class36.field848.method1808((byte) -15));
                                                                                var343 = 2;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var341 = var341.method1810(-1, class236.field4115.method1808((byte) -15));
                                                                        var343 = 3;
                                                                    }
                                                                    class55.field1133.method1863(true, 38);
                                                                    class55.field1133.method903((byte) 36, 0);
                                                                    int var346 = class55.field1133.field2449;
                                                                    class55.field1133.method903((byte) 36, var342);
                                                                    class55.field1133.method903((byte) 36, var343);
                                                                    class110.method723(var341, class55.field1133, 119);
                                                                    class55.field1133.method926(-129, -var346 + class55.field1133.field2449);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5010) {
                                                                    var7 -= 2;
                                                                    class265 var347 = class50.field1063[var7];
                                                                    class265 var348 = class50.field1063[var7 + 1];
                                                                    if (~class30.field773 != -1 || (!class262.field4583 || class203.field3632) && !class101.field1792) {
                                                                        ++class110.field1918;
                                                                        class55.field1133.method1863(true, 177);
                                                                        class55.field1133.method903((byte) 36, 0);
                                                                        int var349 = class55.field1133.field2449;
                                                                        class55.field1133.method911(0, var347.method1793(43));
                                                                        class110.method723(var348, class55.field1133, 119);
                                                                        class55.field1133.method926(-129, class55.field1133.field2449 - var349);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var503 == 5010) {
                                                                    class265 var350 = null;
                                                                    --var6;
                                                                    int var351 = class276.field4869[var6];
                                                                    if (~var351 > -101) {
                                                                        var350 = class78.field1486[var351];
                                                                    }
                                                                    if (var350 == null) {
                                                                        var350 = class112.field1962;
                                                                    }
                                                                    class50.field1063[var7++] = var350;
                                                                    continue;
                                                                }
                                                                if (var503 == 5011) {
                                                                    --var6;
                                                                    int var352 = class276.field4869[var6];
                                                                    class265 var353 = null;
                                                                    if (var352 < 100) {
                                                                        var353 = class267.field4707[var352];
                                                                    }
                                                                    if (var353 == null) {
                                                                        var353 = class112.field1962;
                                                                    }
                                                                    class50.field1063[var7++] = var353;
                                                                    continue;
                                                                }
                                                                if (var503 == 5012) {
                                                                    int var354 = -1;
                                                                    --var6;
                                                                    int var355 = class276.field4869[var6];
                                                                    if (~var355 > -101) {
                                                                        var354 = class123.field2223[var355];
                                                                    }
                                                                    class276.field4869[var6++] = var354;
                                                                    continue;
                                                                }
                                                                if (var503 == 5015) {
                                                                    class265 var356;
                                                                    if (class214.field3827 != null && class214.field3827.field2163 != null) {
                                                                        var356 = class214.field3827.method824((byte) 75);
                                                                    } else {
                                                                        var356 = class4.field51;
                                                                    }
                                                                    class50.field1063[var7++] = var356;
                                                                    continue;
                                                                }
                                                                if (var503 == 5016) {
                                                                    class276.field4869[var6++] = class125.field2244;
                                                                    continue;
                                                                }
                                                                if (var503 == 5017) {
                                                                    class276.field4869[var6++] = class268.field4783;
                                                                    continue;
                                                                }
                                                                if (var503 == 5050) {
                                                                    --var6;
                                                                    int var357 = class276.field4869[var6];
                                                                    class50.field1063[var7++] = class6.method42(var357, (byte) -81).field3497;
                                                                    continue;
                                                                }
                                                                if (~var503 == -5052) {
                                                                    --var6;
                                                                    int var358 = class276.field4869[var6];
                                                                    class195 var359 = class6.method42(var358, (byte) -81);
                                                                    if (var359.field3492 == null) {
                                                                        class276.field4869[var6++] = 0;
                                                                    } else {
                                                                        class276.field4869[var6++] = var359.field3492.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var503 == 5052) {
                                                                    var6 -= 2;
                                                                    int var360 = class276.field4869[var6 - -1];
                                                                    int var361 = class276.field4869[var6];
                                                                    class195 var362 = class6.method42(var361, (byte) -81);
                                                                    int var363 = var362.field3492[var360];
                                                                    class276.field4869[var6++] = var363;
                                                                    continue;
                                                                }
                                                                if (~var503 == -5054) {
                                                                    --var6;
                                                                    int var364 = class276.field4869[var6];
                                                                    class195 var365 = class6.method42(var364, (byte) -81);
                                                                    if (var365.field3498 == null) {
                                                                        class276.field4869[var6++] = 0;
                                                                    } else {
                                                                        class276.field4869[var6++] = var365.field3498.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var503 == -5055) {
                                                                    var6 -= 2;
                                                                    int var366 = class276.field4869[var6 + 1];
                                                                    int var367 = class276.field4869[var6];
                                                                    class276.field4869[var6++] = class6.method42(var367, (byte) -81).field3498[var366];
                                                                    continue;
                                                                }
                                                                if (~var503 == -5056) {
                                                                    --var6;
                                                                    int var368 = class276.field4869[var6];
                                                                    class50.field1063[var7++] = class145.method1004(var368, 14015).method331(-59);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5057) {
                                                                    --var6;
                                                                    int var369 = class276.field4869[var6];
                                                                    class39 var370 = class145.method1004(var369, 14015);
                                                                    if (var370.field907 == null) {
                                                                        class276.field4869[var6++] = 0;
                                                                    } else {
                                                                        class276.field4869[var6++] = var370.field907.length;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var503 == -5058) {
                                                                    var6 -= 2;
                                                                    int var371 = class276.field4869[var6 - -1];
                                                                    int var372 = class276.field4869[var6];
                                                                    class276.field4869[var6++] = class145.method1004(var372, 14015).field907[var371];
                                                                    continue;
                                                                }
                                                                if (var503 == 5058) {
                                                                    class11.field376 = new class116();
                                                                    --var6;
                                                                    class11.field376.field2059 = class276.field4869[var6];
                                                                    class11.field376.field2058 = class145.method1004(class11.field376.field2059, 14015);
                                                                    class11.field376.field2050 = new int[class11.field376.field2058.method332(-10502)];
                                                                    continue;
                                                                }
                                                                if (~var503 == -5060) {
                                                                    ++class277.field4884;
                                                                    class55.field1133.method1863(true, 231);
                                                                    class55.field1133.method903((byte) 36, 0);
                                                                    int var373 = class55.field1133.field2449;
                                                                    class55.field1133.method903((byte) 36, 0);
                                                                    class55.field1133.method921(121, class11.field376.field2059);
                                                                    class11.field376.field2058.method322(class55.field1133, (byte) 15, class11.field376.field2050);
                                                                    class55.field1133.method926(-129, class55.field1133.field2449 - var373);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5061) {
                                                                    ++class140.field2569;
                                                                    --var7;
                                                                    class265 var374 = class50.field1063[var7];
                                                                    class55.field1133.method1863(true, 171);
                                                                    class55.field1133.method903((byte) 36, 0);
                                                                    int var375 = class55.field1133.field2449;
                                                                    class55.field1133.method911(0, var374.method1793(43));
                                                                    class55.field1133.method921(104, class11.field376.field2059);
                                                                    class11.field376.field2058.method322(class55.field1133, (byte) 15, class11.field376.field2050);
                                                                    class55.field1133.method926(-129, -var375 + class55.field1133.field2449);
                                                                    continue;
                                                                }
                                                                if (var503 == 5061) {
                                                                    class55.field1133.method1863(true, 231);
                                                                    ++class277.field4884;
                                                                    class55.field1133.method903((byte) 36, 0);
                                                                    int var376 = class55.field1133.field2449;
                                                                    class55.field1133.method903((byte) 36, 1);
                                                                    class55.field1133.method921(108, class11.field376.field2059);
                                                                    class11.field376.field2058.method322(class55.field1133, (byte) 15, class11.field376.field2050);
                                                                    class55.field1133.method926(-129, -var376 + class55.field1133.field2449);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5063) {
                                                                    var6 -= 2;
                                                                    int var377 = class276.field4869[var6 + 1];
                                                                    int var378 = class276.field4869[var6];
                                                                    class276.field4869[var6++] = class6.method42(var378, (byte) -81).field3482[var377];
                                                                    continue;
                                                                }
                                                                if (~var503 == -5064) {
                                                                    var6 -= 2;
                                                                    int var379 = class276.field4869[var6];
                                                                    int var380 = class276.field4869[var6 + 1];
                                                                    class276.field4869[var6++] = class6.method42(var379, (byte) -81).field3496[var380];
                                                                    continue;
                                                                }
                                                                if (~var503 == -5065) {
                                                                    var6 -= 2;
                                                                    int var381 = class276.field4869[var6];
                                                                    int var382 = class276.field4869[var6 + 1];
                                                                    if (~var382 != 0) {
                                                                        class276.field4869[var6++] = class6.method42(var381, (byte) -81).method1352(-7498, var382);
                                                                    } else {
                                                                        class276.field4869[var6++] = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var503 == -5066) {
                                                                    var6 -= 2;
                                                                    int var383 = class276.field4869[var6];
                                                                    int var384 = class276.field4869[var6 + 1];
                                                                    if (~var384 == 0) {
                                                                        class276.field4869[var6++] = -1;
                                                                    } else {
                                                                        class276.field4869[var6++] = class6.method42(var383, (byte) -81).method1355(-1, var384);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var503 == -5067) {
                                                                    --var6;
                                                                    int var385 = class276.field4869[var6];
                                                                    class276.field4869[var6++] = class145.method1004(var385, 14015).method332(-10502);
                                                                    continue;
                                                                }
                                                                if (~var503 == -5068) {
                                                                    var6 -= 2;
                                                                    int var386 = class276.field4869[var6 + 1];
                                                                    int var387 = class276.field4869[var6];
                                                                    int var388 = class145.method1004(var387, 14015).method330(9080, var386);
                                                                    class276.field4869[var6++] = var388;
                                                                    continue;
                                                                }
                                                                if (var503 == 5068) {
                                                                    var6 -= 2;
                                                                    int var389 = class276.field4869[var6 + 1];
                                                                    int var390 = class276.field4869[var6];
                                                                    class11.field376.field2050[var390] = var389;
                                                                    continue;
                                                                }
                                                                if (~var503 == -5070) {
                                                                    var6 -= 2;
                                                                    int var391 = class276.field4869[var6 + 1];
                                                                    int var392 = class276.field4869[var6];
                                                                    class11.field376.field2050[var392] = var391;
                                                                    continue;
                                                                }
                                                                if (~var503 == -5071) {
                                                                    var6 -= 3;
                                                                    int var393 = class276.field4869[var6];
                                                                    int var394 = class276.field4869[var6 - -1];
                                                                    int var395 = class276.field4869[var6 + 2];
                                                                    class39 var396 = class145.method1004(var393, 14015);
                                                                    if (var396.method330(9080, var394) != 0) {
                                                                        throw new RuntimeException("bad command");
                                                                    }
                                                                    class276.field4869[var6++] = var396.method321(var394, var395, (byte) 127);
                                                                    continue;
                                                                }
                                                                if (var503 == 5071) {
                                                                    --var7;
                                                                    class265 var397 = class50.field1063[var7];
                                                                    --var6;
                                                                    boolean var398 = class276.field4869[var6] == 1;
                                                                    class153.method1047(var398, 79, var397);
                                                                    class276.field4869[var6++] = class120.field2110;
                                                                    continue;
                                                                }
                                                                if (var503 == 5072) {
                                                                    if (class127.field2276 != null && class242.field4219 < class120.field2110) {
                                                                        class276.field4869[var6++] = class203.method1395(class127.field2276[class242.field4219++], 65535);
                                                                        continue;
                                                                    }
                                                                    class276.field4869[var6++] = -1;
                                                                    continue;
                                                                }
                                                                if (var503 == 5073) {
                                                                    class242.field4219 = 0;
                                                                    continue;
                                                                }
                                                            }
                                                        } else if (var503 == 4500) {
                                                            var6 -= 2;
                                                            int var399 = class276.field4869[var6];
                                                            int var400 = class276.field4869[var6 + 1];
                                                            class223 var401 = class98.method650(var400, -122);
                                                            if (var401.method1516(-55)) {
                                                                class50.field1063[var7++] = class189.method1288(var399, 26529).method1119((byte) 51, var401.field3980, var400);
                                                            } else {
                                                                class276.field4869[var6++] = class189.method1288(var399, 26529).method1121(var400, 20, var401.field3985);
                                                            }
                                                            continue;
                                                        }
                                                    } else {
                                                        if (var503 == 4000) {
                                                            var6 -= 2;
                                                            int var402 = class276.field4869[var6];
                                                            int var403 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = var402 + var403;
                                                            continue;
                                                        }
                                                        if (var503 == 4001) {
                                                            var6 -= 2;
                                                            int var404 = class276.field4869[var6 + 1];
                                                            int var405 = class276.field4869[var6];
                                                            class276.field4869[var6++] = var405 - var404;
                                                            continue;
                                                        }
                                                        if (~var503 == -4003) {
                                                            var6 -= 2;
                                                            int var406 = class276.field4869[var6 - -1];
                                                            int var407 = class276.field4869[var6];
                                                            class276.field4869[var6++] = var406 * var407;
                                                            continue;
                                                        }
                                                        if (var503 == 4003) {
                                                            var6 -= 2;
                                                            int var408 = class276.field4869[var6];
                                                            int var409 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = var408 / var409;
                                                            continue;
                                                        }
                                                        if (~var503 == -4005) {
                                                            --var6;
                                                            int var410 = class276.field4869[var6];
                                                            class276.field4869[var6++] = (int) ((double) var410 * Math.random());
                                                            continue;
                                                        }
                                                        if (var503 == 4005) {
                                                            --var6;
                                                            int var411 = class276.field4869[var6];
                                                            class276.field4869[var6++] = (int) ((double) (var411 - -1) * Math.random());
                                                            continue;
                                                        }
                                                        if (~var503 == -4007) {
                                                            var6 -= 5;
                                                            int var412 = class276.field4869[var6 + 1];
                                                            int var413 = class276.field4869[var6];
                                                            int var414 = class276.field4869[var6 - -4];
                                                            int var415 = class276.field4869[var6 - -2];
                                                            int var416 = class276.field4869[var6 - -3];
                                                            class276.field4869[var6++] = (-var413 + var412) * (-var415 + var414) / (-var415 + var416) + var413;
                                                            continue;
                                                        }
                                                        if (var503 == 4007) {
                                                            var6 -= 2;
                                                            long var417 = (long) class276.field4869[var6];
                                                            long var419 = (long) class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = (int) (var417 - -(var417 * var419 / 100L));
                                                            continue;
                                                        }
                                                        if (var503 == 4008) {
                                                            var6 -= 2;
                                                            int var421 = class276.field4869[var6];
                                                            int var422 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = class144.method992(var421, 1 << var422);
                                                            continue;
                                                        }
                                                        if (var503 == 4009) {
                                                            var6 -= 2;
                                                            int var423 = class276.field4869[var6 + 1];
                                                            int var424 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class203.method1395(var424, -(1 << var423) + -1);
                                                            continue;
                                                        }
                                                        if (var503 == 4010) {
                                                            var6 -= 2;
                                                            int var425 = class276.field4869[var6];
                                                            int var426 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = ~class203.method1395(var425, 1 << var426) == -1 ? 0 : 1;
                                                            continue;
                                                        }
                                                        if (~var503 == -4012) {
                                                            var6 -= 2;
                                                            int var427 = class276.field4869[var6 + 1];
                                                            int var428 = class276.field4869[var6];
                                                            class276.field4869[var6++] = var428 % var427;
                                                            continue;
                                                        }
                                                        if (~var503 == -4013) {
                                                            var6 -= 2;
                                                            int var429 = class276.field4869[var6];
                                                            int var430 = class276.field4869[var6 + 1];
                                                            if (var429 != 0) {
                                                                class276.field4869[var6++] = (int) Math.pow((double) var429, (double) var430);
                                                            } else {
                                                                class276.field4869[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var503 == -4014) {
                                                            var6 -= 2;
                                                            int var431 = class276.field4869[var6 - -1];
                                                            int var432 = class276.field4869[var6];
                                                            if (var432 == 0) {
                                                                class276.field4869[var6++] = 0;
                                                            } else if (var431 == 0) {
                                                                class276.field4869[var6++] = Integer.MAX_VALUE;
                                                            } else {
                                                                class276.field4869[var6++] = (int) Math.pow((double) var432, 1.0D / (double) var431);
                                                            }
                                                            continue;
                                                        }
                                                        if (var503 == 4014) {
                                                            var6 -= 2;
                                                            int var433 = class276.field4869[var6 + 1];
                                                            int var434 = class276.field4869[var6];
                                                            class276.field4869[var6++] = class203.method1395(var433, var434);
                                                            continue;
                                                        }
                                                        if (~var503 == -4016) {
                                                            var6 -= 2;
                                                            int var435 = class276.field4869[var6];
                                                            int var436 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = class144.method992(var436, var435);
                                                            continue;
                                                        }
                                                        if (var503 == 4016) {
                                                            var6 -= 2;
                                                            int var437 = class276.field4869[var6 - -1];
                                                            int var438 = class276.field4869[var6];
                                                            class276.field4869[var6++] = var437 > var438 ? var438 : var437;
                                                            continue;
                                                        }
                                                        if (~var503 == -4018) {
                                                            var6 -= 2;
                                                            int var439 = class276.field4869[var6];
                                                            int var440 = class276.field4869[var6 + 1];
                                                            class276.field4869[var6++] = ~var439 >= ~var440 ? var440 : var439;
                                                            continue;
                                                        }
                                                        if (var503 == 4018) {
                                                            var6 -= 3;
                                                            long var441 = (long) class276.field4869[var6];
                                                            long var443 = (long) class276.field4869[var6 + 1];
                                                            long var445 = (long) class276.field4869[var6 - -2];
                                                            class276.field4869[var6++] = (int) (var441 * var445 / var443);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (var503 == 3600) {
                                                        if (~class273.field4845 == -1) {
                                                            class276.field4869[var6++] = -2;
                                                        } else if (~class273.field4845 == -2) {
                                                            class276.field4869[var6++] = -1;
                                                        } else {
                                                            class276.field4869[var6++] = class89.field1603;
                                                        }
                                                        continue;
                                                    }
                                                    if (var503 == 3601) {
                                                        --var6;
                                                        int var447 = class276.field4869[var6];
                                                        if (~class273.field4845 == -3 && var447 < class89.field1603) {
                                                            class50.field1063[var7++] = class198.field3530[var447];
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (var503 == 3602) {
                                                        --var6;
                                                        int var448 = class276.field4869[var6];
                                                        if (~class273.field4845 == -3 && class89.field1603 > var448) {
                                                            class276.field4869[var6++] = class196.field3508[var448];
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3603) {
                                                        --var6;
                                                        int var449 = class276.field4869[var6];
                                                        if (class273.field4845 == 2 && var449 < class89.field1603) {
                                                            class276.field4869[var6++] = class58.field1182[var449];
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var503 == 3604) {
                                                        --var7;
                                                        class265 var450 = class50.field1063[var7];
                                                        --var6;
                                                        int var451 = class276.field4869[var6];
                                                        class39.method320(var451, var450, 123);
                                                        continue;
                                                    }
                                                    if (~var503 == -3606) {
                                                        --var7;
                                                        class265 var452 = class50.field1063[var7];
                                                        class61.method452(77, var452.method1793(43));
                                                        continue;
                                                    }
                                                    if (~var503 == -3607) {
                                                        --var7;
                                                        class265 var453 = class50.field1063[var7];
                                                        class1.method4((byte) 113, var453.method1793(43));
                                                        continue;
                                                    }
                                                    if (~var503 == -3608) {
                                                        --var7;
                                                        class265 var454 = class50.field1063[var7];
                                                        class9.method61((byte) -11, var454.method1793(43));
                                                        continue;
                                                    }
                                                    if (var503 == 3608) {
                                                        --var7;
                                                        class265 var455 = class50.field1063[var7];
                                                        class153.method1048(var455.method1793(43), (byte) 102);
                                                        continue;
                                                    }
                                                    if (~var503 == -3610) {
                                                        --var7;
                                                        class265 var456 = class50.field1063[var7];
                                                        if (var456.method1785(0, class75.field1432) || var456.method1785(0, class169.field3068)) {
                                                            var456 = var456.method1810(-1, 7);
                                                        }
                                                        class276.field4869[var6++] = class209.method1437(-107, var456) ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3611) {
                                                        --var6;
                                                        int var457 = class276.field4869[var6];
                                                        if (class273.field4845 == 2 && ~class89.field1603 < ~var457) {
                                                            class50.field1063[var7++] = class58.field1183[var457];
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (var503 == 3611) {
                                                        if (class45.field1014 != null) {
                                                            class50.field1063[var7++] = class45.field1014.method1765(true);
                                                        } else {
                                                            class50.field1063[var7++] = class112.field1962;
                                                        }
                                                        continue;
                                                    }
                                                    if (var503 == 3612) {
                                                        if (class45.field1014 != null) {
                                                            class276.field4869[var6++] = class154.field2856;
                                                        } else {
                                                            class276.field4869[var6++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var503 == -3614) {
                                                        --var6;
                                                        int var458 = class276.field4869[var6];
                                                        if (class45.field1014 != null && class154.field2856 > var458) {
                                                            class50.field1063[var7++] = class198.field3547[var458].field1987.method1765(true);
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (var503 == 3614) {
                                                        --var6;
                                                        int var459 = class276.field4869[var6];
                                                        if (class45.field1014 != null && class154.field2856 > var459) {
                                                            class276.field4869[var6++] = class198.field3547[var459].field1989;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3616) {
                                                        --var6;
                                                        int var460 = class276.field4869[var6];
                                                        if (class45.field1014 != null && class154.field2856 > var460) {
                                                            class276.field4869[var6++] = class198.field3547[var460].field1993;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3617) {
                                                        class276.field4869[var6++] = class196.field3507;
                                                        continue;
                                                    }
                                                    if (var503 == 3617) {
                                                        --var7;
                                                        class265 var461 = class50.field1063[var7];
                                                        class7.method50(var461, (byte) -70);
                                                        continue;
                                                    }
                                                    if (~var503 == -3619) {
                                                        class276.field4869[var6++] = class236.field4123;
                                                        continue;
                                                    }
                                                    if (var503 == 3619) {
                                                        --var7;
                                                        class265 var462 = class50.field1063[var7];
                                                        class147.method1015((byte) 73, var462.method1793(43));
                                                        continue;
                                                    }
                                                    if (~var503 == -3621) {
                                                        class269.method1840((byte) -26);
                                                        continue;
                                                    }
                                                    if (var503 == 3621) {
                                                        if (~class273.field4845 == -1) {
                                                            class276.field4869[var6++] = -1;
                                                        } else {
                                                            class276.field4869[var6++] = class262.field4582;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var503 == -3623) {
                                                        --var6;
                                                        int var463 = class276.field4869[var6];
                                                        if (~class273.field4845 != -1 && class262.field4582 > var463) {
                                                            class50.field1063[var7++] = class103.method691(class4.field55[var463], 22723).method1765(true);
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (var503 == 3623) {
                                                        --var7;
                                                        class265 var464 = class50.field1063[var7];
                                                        if (var464.method1785(0, class75.field1432) || var464.method1785(0, class169.field3068)) {
                                                            var464 = var464.method1810(-1, 7);
                                                        }
                                                        class276.field4869[var6++] = !class237.method1582(var464, 52) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var503 == 3624) {
                                                        --var6;
                                                        int var465 = class276.field4869[var6];
                                                        if (class198.field3547 != null && class154.field2856 > var465 && class198.field3547[var465].field1987.method1791(class214.field3827.field2163, (byte) -98)) {
                                                            class276.field4869[var6++] = 1;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3626) {
                                                        if (class212.field3810 == null) {
                                                            class50.field1063[var7++] = class112.field1962;
                                                        } else {
                                                            class50.field1063[var7++] = class212.field3810.method1765(true);
                                                        }
                                                        continue;
                                                    }
                                                    if (~var503 == -3627) {
                                                        --var6;
                                                        int var466 = class276.field4869[var6];
                                                        if (class45.field1014 != null && class154.field2856 > var466) {
                                                            class50.field1063[var7++] = class198.field3547[var466].field1985;
                                                            continue;
                                                        }
                                                        class50.field1063[var7++] = class112.field1962;
                                                        continue;
                                                    }
                                                    if (~var503 == -3628) {
                                                        --var6;
                                                        int var467 = class276.field4869[var6];
                                                        if (class273.field4845 == 2 && var467 >= 0 && class89.field1603 > var467) {
                                                            class276.field4869[var6++] = !class73.field1392[var467] ? 0 : 1;
                                                            continue;
                                                        }
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var503 == -3629) {
                                                        --var7;
                                                        class265 var468 = class50.field1063[var7];
                                                        if (var468.method1785(0, class75.field1432) || var468.method1785(0, class169.field3068)) {
                                                            var468 = var468.method1810(-1, 7);
                                                        }
                                                        class276.field4869[var6++] = class130.method853((byte) 126, var468);
                                                        continue;
                                                    }
                                                    if (var503 == 3629) {
                                                        class276.field4869[var6++] = class170.field3075;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var503 == 2700) {
                                                    --var6;
                                                    class6 var469 = class21.method204(class276.field4869[var6], -16257);
                                                    class276.field4869[var6++] = var469.field167;
                                                    continue;
                                                }
                                                if (var503 == 2701) {
                                                    --var6;
                                                    class6 var470 = class21.method204(class276.field4869[var6], -16257);
                                                    if (~var470.field167 == 0) {
                                                        class276.field4869[var6++] = 0;
                                                    } else {
                                                        class276.field4869[var6++] = var470.field148;
                                                    }
                                                    continue;
                                                }
                                                if (~var503 == -2703) {
                                                    --var6;
                                                    int var471 = class276.field4869[var6];
                                                    class181 var472 = (class181) class49.field1042.method1842(-1, (long) var471);
                                                    if (var472 == null) {
                                                        class276.field4869[var6++] = 0;
                                                    } else {
                                                        class276.field4869[var6++] = 1;
                                                    }
                                                    continue;
                                                }
                                                if (var503 == 2703) {
                                                    --var6;
                                                    class6 var473 = class21.method204(class276.field4869[var6], -16257);
                                                    if (var473.field160 == null) {
                                                        class276.field4869[var6++] = 0;
                                                        continue;
                                                    }
                                                    int var474 = var473.field160.length;
                                                    for (int var475 = 0; ~var473.field160.length < ~var475; ++var475) {
                                                        if (var473.field160[var475] == null) {
                                                            var474 = var475;
                                                            break;
                                                        }
                                                    }
                                                    class276.field4869[var6++] = var474;
                                                    continue;
                                                }
                                                if (var503 == 2704 || var503 == 2705) {
                                                    var6 -= 2;
                                                    int var476 = class276.field4869[var6];
                                                    int var477 = class276.field4869[var6 + 1];
                                                    class181 var478 = (class181) class49.field1042.method1842(-1, (long) var476);
                                                    if (var478 != null && ~var478.field3217 == ~var477) {
                                                        class276.field4869[var6++] = 1;
                                                        continue;
                                                    }
                                                    class276.field4869[var6++] = 0;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class6 var479 = var46 ? class52.field1089 : class161.field2943;
                                            if (~var503 == -1801) {
                                                class276.field4869[var6++] = class172.method1132(client.method1474(var479), (byte) 82);
                                                continue;
                                            }
                                            if (var503 == 1801) {
                                                --var6;
                                                int var480 = class276.field4869[var6];
                                                int var505 = var480 - 1;
                                                if (var479.field228 != null && ~var479.field228.length < ~var505 && var479.field228[var505] != null) {
                                                    class50.field1063[var7++] = var479.field228[var505];
                                                    continue;
                                                }
                                                class50.field1063[var7++] = class112.field1962;
                                                continue;
                                            }
                                            if (var503 == 1802) {
                                                if (var479.field231 != null) {
                                                    class50.field1063[var7++] = var479.field231;
                                                } else {
                                                    class50.field1063[var7++] = class112.field1962;
                                                }
                                                continue;
                                            }
                                        }
                                    } else {
                                        class6 var481 = !var46 ? class161.field2943 : class52.field1089;
                                        if (var503 == 1700) {
                                            class276.field4869[var6++] = var481.field167;
                                            continue;
                                        }
                                        if (var503 == 1701) {
                                            if (~var481.field167 == 0) {
                                                class276.field4869[var6++] = 0;
                                            } else {
                                                class276.field4869[var6++] = var481.field148;
                                            }
                                            continue;
                                        }
                                        if (var503 == 1702) {
                                            class276.field4869[var6++] = var481.field233;
                                            continue;
                                        }
                                    }
                                } else {
                                    class6 var482 = !var46 ? class161.field2943 : class52.field1089;
                                    if (var503 == 1600) {
                                        class276.field4869[var6++] = var482.field109;
                                        continue;
                                    }
                                    if (~var503 == -1602) {
                                        class276.field4869[var6++] = var482.field193;
                                        continue;
                                    }
                                    if (~var503 == -1603) {
                                        class50.field1063[var7++] = var482.field103;
                                        continue;
                                    }
                                    if (var503 == 1603) {
                                        class276.field4869[var6++] = var482.field223;
                                        continue;
                                    }
                                    if (var503 == 1604) {
                                        class276.field4869[var6++] = var482.field195;
                                        continue;
                                    }
                                    if (var503 == 1605) {
                                        class276.field4869[var6++] = var482.field235;
                                        continue;
                                    }
                                    if (~var503 == -1607) {
                                        class276.field4869[var6++] = var482.field124;
                                        continue;
                                    }
                                    if (~var503 == -1608) {
                                        class276.field4869[var6++] = var482.field77;
                                        continue;
                                    }
                                    if (~var503 == -1609) {
                                        class276.field4869[var6++] = var482.field123;
                                        continue;
                                    }
                                    if (~var503 == -1610) {
                                        class276.field4869[var6++] = var482.field138;
                                        continue;
                                    }
                                    if (~var503 == -1611) {
                                        class276.field4869[var6++] = var482.field132;
                                        continue;
                                    }
                                    if (~var503 == -1612) {
                                        class276.field4869[var6++] = var482.field178;
                                        continue;
                                    }
                                    if (var503 == 1612) {
                                        class276.field4869[var6++] = var482.field183;
                                        continue;
                                    }
                                }
                            } else {
                                class6 var483 = var46 ? class52.field1089 : class161.field2943;
                                if (var503 == 1500) {
                                    class276.field4869[var6++] = var483.field153;
                                    continue;
                                }
                                if (~var503 == -1502) {
                                    class276.field4869[var6++] = var483.field204;
                                    continue;
                                }
                                if (~var503 == -1503) {
                                    class276.field4869[var6++] = var483.field89;
                                    continue;
                                }
                                if (var503 == 1503) {
                                    class276.field4869[var6++] = var483.field84;
                                    continue;
                                }
                                if (~var503 == -1505) {
                                    class276.field4869[var6++] = var483.field241 ? 1 : 0;
                                    continue;
                                }
                                if (var503 == 1505) {
                                    class276.field4869[var6++] = var483.field142;
                                    continue;
                                }
                            }
                        } else {
                            class6 var484;
                            if (var503 >= 2000) {
                                --var6;
                                var484 = class21.method204(class276.field4869[var6], -16257);
                                var503 -= 1000;
                            } else {
                                var484 = var46 ? class52.field1089 : class161.field2943;
                            }
                            if (~var503 == -1301) {
                                --var6;
                                int var485 = class276.field4869[var6] - 1;
                                if (var485 >= 0 && var485 <= 9) {
                                    --var7;
                                    var484.method44(class50.field1063[var7], var485, 4);
                                    continue;
                                }
                                --var7;
                                continue;
                            }
                            if (~var503 == -1302) {
                                var6 -= 2;
                                int var486 = class276.field4869[var6];
                                int var487 = class276.field4869[var6 + 1];
                                var484.field179 = class12.method98(var486, var487, (byte) -124);
                                continue;
                            }
                            if (var503 == 1302) {
                                --var6;
                                var484.field96 = class276.field4869[var6] == 1;
                                continue;
                            }
                            if (var503 == 1303) {
                                --var6;
                                var484.field206 = class276.field4869[var6];
                                continue;
                            }
                            if (var503 == 1304) {
                                --var6;
                                var484.field164 = class276.field4869[var6];
                                continue;
                            }
                            if (var503 == 1305) {
                                --var7;
                                var484.field231 = class50.field1063[var7];
                                continue;
                            }
                            if (~var503 == -1307) {
                                --var7;
                                var484.field78 = class50.field1063[var7];
                                continue;
                            }
                            if (~var503 == -1308) {
                                var484.field228 = null;
                                continue;
                            }
                            if (~var503 == -1310) {
                                --var6;
                                int var488 = class276.field4869[var6];
                                --var6;
                                int var489 = class276.field4869[var6];
                                if (~var489 <= -2 && var489 <= 10) {
                                    var484.method36(4, var489 + -1, var488);
                                }
                                continue;
                            }
                        }
                    } else {
                        class6 var494;
                        if (var503 < 2000) {
                            var494 = !var46 ? class161.field2943 : class52.field1089;
                        } else {
                            var503 -= 1000;
                            --var6;
                            var494 = class21.method204(class276.field4869[var6], -16257);
                        }
                        if (var503 == 1100) {
                            var6 -= 2;
                            var494.field109 = class276.field4869[var6];
                            if (~(var494.field223 - var494.field89) > ~var494.field109) {
                                var494.field109 = -var494.field89 + var494.field223;
                            }
                            if (var494.field109 < 0) {
                                var494.field109 = 0;
                            }
                            var494.field193 = class276.field4869[var6 + 1];
                            if (var494.field193 > -var494.field84 + var494.field195) {
                                var494.field193 = -var494.field84 + var494.field195;
                            }
                            if (var494.field193 < 0) {
                                var494.field193 = 0;
                            }
                            class176.method1145((byte) -36, var494);
                            if (var494.field233 == -1) {
                                class4.method25(0, var494.field219);
                            }
                            continue;
                        }
                        if (var503 == 1101) {
                            --var6;
                            var494.field168 = class276.field4869[var6];
                            class176.method1145((byte) -30, var494);
                            if (var494.field233 == -1) {
                                class195.method1348((byte) -100, var494.field219);
                            }
                            continue;
                        }
                        if (~var503 == -1103) {
                            --var6;
                            var494.field94 = ~class276.field4869[var6] == -2;
                            class176.method1145((byte) -98, var494);
                            continue;
                        }
                        if (~var503 == -1104) {
                            --var6;
                            var494.field138 = class276.field4869[var6];
                            class176.method1145((byte) -33, var494);
                            continue;
                        }
                        if (~var503 == -1105) {
                            --var6;
                            var494.field151 = class276.field4869[var6];
                            class176.method1145((byte) 56, var494);
                            continue;
                        }
                        if (var503 == 1105) {
                            --var6;
                            var494.field183 = class276.field4869[var6];
                            class176.method1145((byte) 61, var494);
                            continue;
                        }
                        if (var503 == 1106) {
                            --var6;
                            var494.field207 = class276.field4869[var6];
                            class176.method1145((byte) -86, var494);
                            continue;
                        }
                        if (var503 == 1107) {
                            --var6;
                            var494.field185 = ~class276.field4869[var6] == -2;
                            class176.method1145((byte) 85, var494);
                            continue;
                        }
                        if (~var503 == -1109) {
                            var494.field102 = 1;
                            --var6;
                            var494.field222 = class276.field4869[var6];
                            class176.method1145((byte) -91, var494);
                            if (var494.field233 == -1) {
                                class275.method1880(-1, var494.field219);
                            }
                            continue;
                        }
                        if (var503 == 1109) {
                            var6 -= 6;
                            var494.field132 = class276.field4869[var6];
                            var494.field178 = class276.field4869[var6 + 1];
                            var494.field124 = class276.field4869[var6 - -2];
                            var494.field123 = class276.field4869[var6 + 3];
                            var494.field77 = class276.field4869[var6 + 4];
                            var494.field235 = class276.field4869[var6 + 5];
                            class176.method1145((byte) 107, var494);
                            if (~var494.field233 == 0) {
                                class213.method1454(-10520, var494.field219);
                                class138.method957(true, var494.field219);
                            }
                            continue;
                        }
                        if (~var503 == -1111) {
                            --var6;
                            int var495 = class276.field4869[var6];
                            if (~var494.field150 != ~var495) {
                                var494.field174 = 0;
                                var494.field150 = var495;
                                var494.field152 = 0;
                                class176.method1145((byte) -121, var494);
                            }
                            if (~var494.field233 == 0) {
                                class239.method1597((byte) -28, var494.field219);
                            }
                            continue;
                        }
                        if (var503 == 1111) {
                            --var6;
                            var494.field225 = ~class276.field4869[var6] == -2;
                            class176.method1145((byte) -34, var494);
                            continue;
                        }
                        if (var503 == 1112) {
                            --var7;
                            class265 var496 = class50.field1063[var7];
                            if (!var496.method1776((byte) -114, var494.field103)) {
                                var494.field103 = var496;
                                class176.method1145((byte) -57, var494);
                            }
                            if (~var494.field233 == 0) {
                                class141.method972(var494.field219, 16944);
                            }
                            continue;
                        }
                        if (var503 == 1113) {
                            --var6;
                            var494.field194 = class276.field4869[var6];
                            class176.method1145((byte) 51, var494);
                            continue;
                        }
                        if (var503 == 1114) {
                            var6 -= 3;
                            var494.field242 = class276.field4869[var6];
                            var494.field118 = class276.field4869[var6 + 1];
                            var494.field117 = class276.field4869[var6 - -2];
                            class176.method1145((byte) -41, var494);
                            continue;
                        }
                        if (~var503 == -1116) {
                            --var6;
                            var494.field126 = ~class276.field4869[var6] == -2;
                            class176.method1145((byte) 90, var494);
                            continue;
                        }
                        if (var503 == 1116) {
                            --var6;
                            var494.field122 = class276.field4869[var6];
                            class176.method1145((byte) 85, var494);
                            continue;
                        }
                        if (~var503 == -1118) {
                            --var6;
                            var494.field129 = class276.field4869[var6];
                            class176.method1145((byte) 97, var494);
                            continue;
                        }
                        if (var503 == 1118) {
                            --var6;
                            var494.field210 = class276.field4869[var6] == 1;
                            class176.method1145((byte) 77, var494);
                            continue;
                        }
                        if (~var503 == -1120) {
                            --var6;
                            var494.field114 = class276.field4869[var6] == 1;
                            class176.method1145((byte) -112, var494);
                            continue;
                        }
                        if (var503 == 1120) {
                            var6 -= 2;
                            var494.field223 = class276.field4869[var6];
                            var494.field195 = class276.field4869[var6 + 1];
                            class176.method1145((byte) -32, var494);
                            if (~var494.field187 == -1) {
                                class126.method841(false, (byte) -58, var494);
                            }
                            continue;
                        }
                        if (~var503 == -1122) {
                            class176.method1145((byte) 115, var494);
                            var6 -= 2;
                            continue;
                        }
                        if (~var503 == -1123) {
                            --var6;
                            var494.field240 = ~class276.field4869[var6] == -2;
                            class176.method1145((byte) 52, var494);
                            continue;
                        }
                        if (var503 == 1123) {
                            --var6;
                            var494.field235 = class276.field4869[var6];
                            class176.method1145((byte) 82, var494);
                            if (var494.field233 == -1) {
                                class213.method1454(-10520, var494.field219);
                            }
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var502) {
                if (var5.field713 != null) {
                    class265 var498 = class254.method1675(30, (byte) 18);
                    var498.method1807((byte) 117, class38.field876).method1807((byte) 119, var5.field713);
                    for (int var499 = class203.field3634 - 1; ~var499 <= -1; --var499) {
                        var498.method1807((byte) 118, class179.field3185).method1807((byte) 115, class204.field3651[var499].field1380.field713);
                    }
                    if (var11 == 40) {
                        int var500 = var9[var8];
                        var498.method1807((byte) 117, class202.field3616).method1807((byte) 123, class241.method1609(true, var500));
                    }
                    if (class264.field4601 != 0) {
                        class259.method1725(-109, class148.method1022(10, new class265[] { class258.field4443, var5.field713 }), 0, class112.field1962);
                    }
                    class4.method28(-49, var502, "CS2 - scr:" + var5.field393 + " op:" + var11 + new String(var498.method1787(0)));
                } else {
                    if (class264.field4601 != 0) {
                        class259.method1725(-102, class237.field4128, 0, class112.field1962);
                    }
                    class4.method28(-127, var502, "CS2 - scr:" + var5.field393 + " op:" + var11);
                }
            }
        }
    }
}
