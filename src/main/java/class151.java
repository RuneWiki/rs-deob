import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class151 extends class105 {

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    private int field2950 = 1;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    private int field2952 = 1;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "Lpa;")
    public static class136 field2955 = new class136(260);

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "Leh;")
    public static class47 field2959 = class195.method1282((byte) -4, "<col=ff0000>");

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field2958 = 2;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "Lwg;")
    public static class205 field2961 = new class205();

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "Lpa;")
    public static class136 field2962 = new class136(128);

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "Leh;")
    public static class47 field2963 = class195.method1282((byte) -4, "welle:");

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            field2963 = null;
        }
        ++field2951;
        int[] var3 = super.field2192.method336(-127, arg0);
        if (super.field2192.field770) {
            int var4 = this.field2950 - -1 + this.field2950;
            int[][] var5 = new int[var4][];
            int var6 = this.field2952 + this.field2952 - -1;
            for (int var7 = -this.field2950 + arg0; var7 <= arg0 - -this.field2950; ++var7) {
                int var11 = 0;
                int[] var12 = this.method851(0, true, var7 & class122.field2468);
                for (int var13 = -this.field2952; var13 <= this.field2952; ++var13) {
                    var11 += var12[class121.field2453 & var13];
                }
                int[] var14 = new int[class149.field2928];
                int var15 = 0;
                while (class149.field2928 > var15) {
                    var14[var15] = var11 / var6;
                    int var16 = var11 - var12[class121.field2453 & -this.field2952 + var15];
                    ++var15;
                    var11 = var12[class121.field2453 & this.field2952 + var15] + var16;
                }
                var5[var7 - (-this.field2950 - -arg0)] = var14;
            }
            for (int var8 = 0; class149.field2928 > var8; ++var8) {
                int var9 = 0;
                for (int var10 = 0; ~var10 > ~var4; ++var10) {
                    var9 += var5[var10][var8];
                }
                var3[var8] = var9 / var4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public static void method1060(int arg0) {
        field2962 = null;
        field2955 = null;
        field2963 = null;
        if (arg0 != 1) {
            method1060(97);
        }
        field2961 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILkb;J)V")
    public static final void method1061(int arg0, int arg1, int arg2, int arg3, class92 arg4, long arg5) {
        if (arg4 != null) {
            class200 var7 = new class200();
            var7.field3894 = arg4;
            var7.field3899 = arg1 * 128 + 64;
            var7.field3898 = arg2 * 128 + 64;
            var7.field3900 = arg3;
            var7.field3895 = arg5;
            if (class173.field3351[arg0][arg1][arg2] == null) {
                class173.field3351[arg0][arg1][arg2] = new class152(arg0, arg1, arg2);
            }
            class173.field3351[arg0][arg1][arg2].field2989 = var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2179 = arg1.method604((byte) -125) == 1;
                }
            } else {
                this.field2950 = arg1.method604((byte) -126);
            }
        } else {
            this.field2952 = arg1.method604((byte) -127);
        }
        if (arg2 != -256) {
            field2963 = null;
        }
        ++field2954;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field2957;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int var4 = this.field2950 - -this.field2950 + 1;
            int[][][] var5 = new int[var4][][];
            int var6 = this.field2952 + this.field2952 - -1;
            for (int var7 = -this.field2950 + arg0; var7 <= this.field2950 + arg0; ++var7) {
                int[][] var17 = this.method854(0, (byte) 119, var7 & class122.field2468);
                int[][] var18 = new int[3][class149.field2928];
                int var19 = 0;
                int var20 = 0;
                int var21 = 0;
                int[] var22 = var17[2];
                int[] var23 = var17[0];
                int[] var24 = var17[1];
                for (int var25 = -this.field2952; ~this.field2952 <= ~var25; ++var25) {
                    int var35 = class121.field2453 & var25;
                    var19 += var23[var35];
                    var21 += var22[var35];
                    var20 += var24[var35];
                }
                int[] var26 = var18[0];
                int[] var27 = var18[1];
                int[] var28 = var18[2];
                int var29 = 0;
                while (class149.field2928 > var29) {
                    var26[var29] = var19 / var6;
                    var27[var29] = var20 / var6;
                    var28[var29] = var21 / var6;
                    int var30 = class121.field2453 & var29 - this.field2952;
                    int var31 = var21 - var22[var30];
                    int var32 = var20 - var24[var30];
                    int var33 = var19 - var23[var30];
                    ++var29;
                    int var34 = class121.field2453 & this.field2952 + var29;
                    var21 = var22[var34] + var31;
                    var20 = var24[var34] + var32;
                    var19 = var23[var34] + var33;
                }
                var5[this.field2950 - arg0 + var7] = var18;
            }
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; class149.field2928 > var11; ++var11) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 0; var15 < var4; ++var15) {
                    int[][] var16 = var5[var15];
                    var13 += var16[1][var11];
                    var14 += var16[2][var11];
                    var12 += var16[0][var11];
                }
                var10[var11] = var12 / var4;
                var9[var11] = var13 / var4;
                var8[var11] = var14 / var4;
            }
        }
        if (!arg1) {
            field2961 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public static final void method1062(int arg0, int arg1) {
        ++field2953;
        if (~arg0 <= -1) {
            int var2 = class25.field478[arg0];
            int var3 = class9.field210[arg0];
            int var4 = class55.field1063[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            int var5 = (int) class173.field3341[arg0];
            long var6 = class173.field3341[arg0];
            if (~var2 == -42) {
                class72 var8 = class133.field2626[var5];
                if (var8 != null) {
                    class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var8.field3310[0], class123.field2489.field3317[0], 0, 2, var8.field3317[0], (byte) 51, 0);
                    class90.field1898 = 2;
                    class201.field3907 = 0;
                    class167.field3231 = class3.field29;
                    class148.field2907 = class185.field3546;
                    class60.field1174.method657(arg1 ^ -26412, 241);
                    class60.field1174.method574(class44.field889, 93);
                    ++class2.field18;
                    class60.field1174.method590(class201.field3917, -1848441912);
                    class60.field1174.method573(19634, var5);
                }
            }
            if (~var2 == -49) {
                boolean var9 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 65, 0);
                if (!var9) {
                    class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 124, 0);
                }
                class201.field3907 = 0;
                class167.field3231 = class3.field29;
                class148.field2907 = class185.field3546;
                class90.field1898 = 2;
                class60.field1174.method657(28182, 168);
                ++class109.field2259;
                class60.field1174.method562(class201.field3917, arg1 ^ -2432);
                class60.field1174.method562(var5, arg1 ^ -2385);
                class60.field1174.method590(class127.field2536 + var3, arg1 + -1848439546);
                class60.field1174.method583(-68041368, class34.field649 + var4);
                class60.field1174.method572(arg1 + 2402, class44.field889);
            }
            if (var2 == 45 && class94.method751(var6, (byte) -125, var3, var4)) {
                class60.field1174.method657(28182, 246);
                class60.field1174.method562(class201.field3917, 88);
                ++class51.field987;
                class60.field1174.method590((int) (var6 >>> 32) & Integer.MAX_VALUE, arg1 + -1848439546);
                class60.field1174.method574(class44.field889, 75);
                class60.field1174.method573(19634, class34.field649 + var4);
                class60.field1174.method562(class127.field2536 + var3, arg1 + 2480);
            }
            if (var2 == 17) {
                class72 var11 = class133.field2626[var5];
                if (var11 != null) {
                    ++class121.field2445;
                    class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var11.field3310[0], class123.field2489.field3317[0], 0, 2, var11.field3317[0], (byte) 106, 0);
                    class90.field1898 = 2;
                    class148.field2907 = class185.field3546;
                    class201.field3907 = 0;
                    class167.field3231 = class3.field29;
                    class60.field1174.method657(28182, 193);
                    class60.field1174.method573(19634, class8.field160);
                    class60.field1174.method590(var5, -1848441912);
                    class60.field1174.method583(arg1 ^ 68039594, class186.field3591);
                    class60.field1174.method572(arg1 + 2402, class192.field3721);
                }
            }
            if (~var2 == -45 && class200.field3905 == null) {
                class116.method913(-1, var3, var4);
                class200.field3905 = class32.method278((byte) -124, var4, var3);
                class20.method204(class200.field3905, (byte) -5);
            }
            if (~var2 == -52) {
                class32 var12 = class40.field795[var5];
                if (var12 != null) {
                    ++class149.field2920;
                    class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var12.field3310[0], class123.field2489.field3317[0], 0, 2, var12.field3317[0], (byte) 66, 0);
                    class148.field2907 = class185.field3546;
                    class167.field3231 = class3.field29;
                    class90.field1898 = 2;
                    class201.field3907 = 0;
                    class60.field1174.method657(28182, 2);
                    class60.field1174.method562(var5, arg1 + 2462);
                }
            }
            if (~var2 == -39) {
                class72 var13 = class133.field2626[var5];
                if (var13 != null) {
                    class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var13.field3310[0], class123.field2489.field3317[0], 0, 2, var13.field3317[0], (byte) 57, 0);
                    class148.field2907 = class185.field3546;
                    class90.field1898 = 2;
                    ++class179.field3440;
                    class201.field3907 = 0;
                    class167.field3231 = class3.field29;
                    class60.field1174.method657(28182, 87);
                    class60.field1174.method573(19634, var5);
                }
            }
            if (arg1 == -2366) {
                if (~var2 == -59) {
                    class191.method1256(0);
                }
                if (~var2 == -1008) {
                    class61 var14 = class23.method224(var4, 484111152);
                    if (var14 != null && ~var14.field1310[var3] <= -100001) {
                        class60.method506(38, class181.field3472, 0, class5.method24(new class47[] { class167.method1133(var14.field1310[var3], (byte) 51), class144.field2822, class87.method713(-72, var5).field1563 }, (byte) 71));
                    } else {
                        ++class14.field293;
                        class60.field1174.method657(28182, 231);
                        class60.field1174.method583(-68041368, var5);
                    }
                    class178.field3417 = 0;
                    class184.field3523 = class23.method224(var4, arg1 + 484113518);
                    class23.field457 = var3;
                }
                if (~var2 == -38 || ~var2 == -1002) {
                    class148.method1039(var4, class80.field1731[arg0], var3, var5, (byte) -74);
                }
                if (var2 == 1002) {
                    ++class149.field2926;
                    class94.method751(var6, (byte) -127, var3, var4);
                    class60.field1174.method657(arg1 ^ -26412, 158);
                    class60.field1174.method590((int) (var6 >>> 32) & Integer.MAX_VALUE, -1848441912);
                    class60.field1174.method590(class34.field649 + var4, -1848441912);
                    class60.field1174.method562(class127.field2536 + var3, arg1 + 2488);
                }
                if (~var2 == -48) {
                    ++class85.field1808;
                    class60.field1174.method657(28182, 236);
                    class60.field1174.method572(84, var4);
                    class60.field1174.method590(var3, -1848441912);
                    class60.field1174.method583(-68041368, var5);
                    class178.field3417 = 0;
                    class184.field3523 = class23.method224(var4, 484111152);
                    class23.field457 = var3;
                }
                if (var2 == 3) {
                    class61 var15 = class23.method224(var4, arg1 + 484113518);
                    boolean var16 = true;
                    if (var15.field1225 > 0) {
                        var16 = class73.method644(85, var15);
                    }
                    if (var16) {
                        ++class40.field784;
                        class60.field1174.method657(28182, 90);
                        class60.field1174.method606(var4, -1424429928);
                    }
                }
                if (~var2 == -16) {
                    class72 var17 = class133.field2626[var5];
                    if (var17 != null) {
                        class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var17.field3310[0], class123.field2489.field3317[0], 0, 2, var17.field3317[0], (byte) 77, 0);
                        class167.field3231 = class3.field29;
                        ++class155.field3029;
                        class90.field1898 = 2;
                        class201.field3907 = 0;
                        class148.field2907 = class185.field3546;
                        class60.field1174.method657(arg1 ^ -26412, 85);
                        class60.field1174.method583(-68041368, var5);
                    }
                }
                if (~var2 == -3) {
                    class60.field1174.method657(28182, 191);
                    class60.field1174.method574(var4, 97);
                    ++class198.field3864;
                    class60.field1174.method562(var5, 43);
                    class60.field1174.method562(var3, arg1 ^ -2386);
                    class178.field3417 = 0;
                    class184.field3523 = class23.method224(var4, 484111152);
                    class23.field457 = var3;
                }
                if (var2 == 29) {
                    ++class40.field784;
                    class60.field1174.method657(28182, 90);
                    class60.field1174.method606(var4, -1424429928);
                    class61 var18 = class23.method224(var4, 484111152);
                    if (var18.field1242 != null && var18.field1242[0][0] == 5) {
                        int var19 = var18.field1242[0][1];
                        class83.field1778[var19] = -class83.field1778[var19] + 1;
                        class126.method952(var19, arg1 ^ 2374);
                    }
                }
                if (~var2 == -5) {
                    class72 var20 = class133.field2626[var5];
                    if (var20 != null) {
                        class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var20.field3310[0], class123.field2489.field3317[0], 0, 2, var20.field3317[0], (byte) 90, 0);
                        class148.field2907 = class185.field3546;
                        class167.field3231 = class3.field29;
                        class201.field3907 = 0;
                        ++class187.field3604;
                        class90.field1898 = 2;
                        class60.field1174.method657(28182, 167);
                        class60.field1174.method573(19634, var5);
                    }
                }
                if (var2 == 25) {
                    class32 var21 = class40.field795[var5];
                    if (var21 != null) {
                        ++class122.field2462;
                        class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var21.field3310[0], class123.field2489.field3317[0], 0, 2, var21.field3317[0], (byte) 115, 0);
                        class148.field2907 = class185.field3546;
                        class90.field1898 = 2;
                        class201.field3907 = 0;
                        class167.field3231 = class3.field29;
                        class60.field1174.method657(28182, 176);
                        class60.field1174.method583(-68041368, var5);
                    }
                }
                if (~var2 == -1005) {
                    class201.field3907 = 0;
                    ++class14.field293;
                    class167.field3231 = class3.field29;
                    class148.field2907 = class185.field3546;
                    class90.field1898 = 2;
                    class60.field1174.method657(28182, 231);
                    class60.field1174.method583(arg1 ^ 68039594, var5);
                }
                if (var2 == 12) {
                    ++class167.field3236;
                    class60.field1174.method657(28182, 8);
                    class60.field1174.method573(19634, var3);
                    class60.field1174.method583(-68041368, var5);
                    class60.field1174.method598(var4, (byte) -99);
                    class178.field3417 = 0;
                    class184.field3523 = class23.method224(var4, 484111152);
                    class23.field457 = var3;
                }
                if (~var2 == -35) {
                    class61 var22 = class32.method278((byte) 48, var4, var3);
                    if (var22 != null) {
                        class87.method718((byte) -107);
                        class64.method536(var3, var4, class186.method1237(129109, class5.method25(var22, (byte) 104)), (byte) -87);
                        class109.field2268 = 0;
                        class35.field686 = class198.method1297(arg1 ^ -2389, var22);
                        if (class35.field686 == null) {
                            class35.field686 = class21.field401;
                        }
                        if (var22.field1313) {
                            class117.field2371 = class5.method24(new class47[] { var22.field1235, class76.field1644 }, (byte) 87);
                            return;
                        }
                        class117.field2371 = class5.method24(new class47[] { class193.field3747, var22.field1300, class76.field1644 }, (byte) 85);
                    }
                } else {
                    if (~var2 == -50 && class94.method751(var6, (byte) -120, var3, var4)) {
                        ++class27.field522;
                        class60.field1174.method657(28182, 28);
                        class60.field1174.method590(class8.field160, -1848441912);
                        class60.field1174.method574(class192.field3721, 119);
                        class60.field1174.method562(class127.field2536 + var3, 124);
                        class60.field1174.method590(Integer.MAX_VALUE & (int) (var6 >>> 32), arg1 + -1848439546);
                        class60.field1174.method562(class186.field3591, 64);
                        class60.field1174.method583(-68041368, class34.field649 + var4);
                    }
                    if (var2 == 57) {
                        class60.field1174.method657(28182, 101);
                        class60.field1174.method598(var4, (byte) -99);
                        ++class40.field779;
                        class60.field1174.method573(19634, var3);
                        class60.field1174.method583(-68041368, var5);
                        class178.field3417 = 0;
                        class184.field3523 = class23.method224(var4, 484111152);
                        class23.field457 = var3;
                    }
                    if (~var2 == -51) {
                        class32 var23 = class40.field795[var5];
                        if (var23 != null) {
                            class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var23.field3310[0], class123.field2489.field3317[0], 0, 2, var23.field3317[0], (byte) 110, 0);
                            class90.field1898 = 2;
                            class167.field3231 = class3.field29;
                            class201.field3907 = 0;
                            ++class174.field3364;
                            class148.field2907 = class185.field3546;
                            class60.field1174.method657(arg1 ^ -26412, 32);
                            class60.field1174.method590(var5, -1848441912);
                        }
                    }
                    if (~var2 == -47) {
                        ++class158.field3069;
                        boolean var24 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 92, 0);
                        if (!var24) {
                            class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 123, 0);
                        }
                        class167.field3231 = class3.field29;
                        class90.field1898 = 2;
                        class148.field2907 = class185.field3546;
                        class201.field3907 = 0;
                        class60.field1174.method657(28182, 104);
                        class60.field1174.method590(var5, arg1 ^ 1848440074);
                        class60.field1174.method573(19634, class8.field160);
                        class60.field1174.method590(class186.field3591, arg1 ^ 1848440074);
                        class60.field1174.method562(class127.field2536 + var3, arg1 + 2472);
                        class60.field1174.method573(arg1 + 22000, class34.field649 + var4);
                        class60.field1174.method574(class192.field3721, arg1 ^ -2389);
                    }
                    if (~var2 == -10) {
                        class72 var26 = class133.field2626[var5];
                        if (var26 != null) {
                            ++class167.field3240;
                            class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var26.field3310[0], class123.field2489.field3317[0], 0, 2, var26.field3317[0], (byte) 61, 0);
                            class148.field2907 = class185.field3546;
                            class90.field1898 = 2;
                            class201.field3907 = 0;
                            class167.field3231 = class3.field29;
                            class60.field1174.method657(28182, 13);
                            class60.field1174.method562(var5, 94);
                        }
                    }
                    if (var2 == 21) {
                        ++class62.field1329;
                        class60.field1174.method657(28182, 134);
                        class60.field1174.method573(arg1 + 22000, var3);
                        class60.field1174.method598(var4, (byte) -99);
                        class60.field1174.method583(arg1 + -68039002, var5);
                        class178.field3417 = 0;
                        class184.field3523 = class23.method224(var4, 484111152);
                        class23.field457 = var3;
                    }
                    if (~var2 == -8) {
                        class87.method718((byte) -107);
                        class61 var27 = class23.method224(var4, 484111152);
                        class186.field3591 = var3;
                        class8.field160 = var5;
                        class192.field3721 = var4;
                        class109.field2268 = 1;
                        class20.method204(var27, (byte) -5);
                        class179.field3435 = class5.method24(new class47[] { class34.field667, class87.method713(120, var5).field1563, class76.field1644 }, (byte) 79);
                        if (class179.field3435 == null) {
                            class179.field3435 = class59.field1148;
                        }
                    } else {
                        if (var2 == 32) {
                            ++class181.field3476;
                            class60.field1174.method657(arg1 + 30548, 195);
                            class60.field1174.method562(var3, 86);
                            class60.field1174.method574(var4, 126);
                            class60.field1174.method573(19634, class201.field3917);
                            class60.field1174.method572(90, class44.field889);
                        }
                        if (~var2 == -1006) {
                            class90.field1898 = 2;
                            class148.field2907 = class185.field3546;
                            class167.field3231 = class3.field29;
                            class201.field3907 = 0;
                            class72 var28 = class133.field2626[var5];
                            if (var28 != null) {
                                class56 var29 = var28.field1547;
                                if (var29.field1074 != null) {
                                    var29 = var29.method485((byte) -76);
                                }
                                if (var29 != null) {
                                    class60.field1174.method657(arg1 + 30548, 159);
                                    ++class124.field2494;
                                    class60.field1174.method583(arg1 + -68039002, var29.field1077);
                                }
                            }
                        }
                        if (~var2 == -32) {
                            class32 var30 = class40.field795[var5];
                            if (var30 != null) {
                                ++class198.field3862;
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var30.field3310[0], class123.field2489.field3317[0], 0, 2, var30.field3317[0], (byte) 100, 0);
                                class201.field3907 = 0;
                                class90.field1898 = 2;
                                class148.field2907 = class185.field3546;
                                class167.field3231 = class3.field29;
                                class60.field1174.method657(28182, 171);
                                class60.field1174.method583(-68041368, var5);
                            }
                        }
                        if (~var2 == -2) {
                            ++class18.field357;
                            class60.field1174.method657(28182, 185);
                            class60.field1174.method583(-68041368, var5);
                            class60.field1174.method598(var4, (byte) -99);
                            class60.field1174.method590(var3, -1848441912);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, 484111152);
                            class23.field457 = var3;
                        }
                        if (~var2 == -24) {
                            class60.field1174.method657(28182, 161);
                            ++class136.field2661;
                            class60.field1174.method590(var5, -1848441912);
                            class60.field1174.method562(class8.field160, arg1 + 2465);
                            class60.field1174.method606(class192.field3721, arg1 ^ 1424431706);
                            class60.field1174.method598(var4, (byte) -99);
                            class60.field1174.method590(class186.field3591, -1848441912);
                            class60.field1174.method583(-68041368, var3);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, 484111152);
                            class23.field457 = var3;
                        }
                        if (var2 == 14) {
                            class88.method720(class196.field3827, var3, var4);
                        }
                        if (~var2 == -29) {
                            ++class2.field17;
                            boolean var31 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 52, 0);
                            if (!var31) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 74, 0);
                            }
                            class167.field3231 = class3.field29;
                            class90.field1898 = 2;
                            class148.field2907 = class185.field3546;
                            class201.field3907 = 0;
                            class60.field1174.method657(28182, 26);
                            class60.field1174.method590(var3 - -class127.field2536, arg1 + -1848439546);
                            class60.field1174.method562(class34.field649 + var4, 56);
                            class60.field1174.method562(var5, 84);
                        }
                        if (var2 == 43) {
                            class32 var33 = class40.field795[var5];
                            if (var33 != null) {
                                ++client.field546;
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var33.field3310[0], class123.field2489.field3317[0], 0, 2, var33.field3317[0], (byte) 62, 0);
                                class148.field2907 = class185.field3546;
                                class167.field3231 = class3.field29;
                                class90.field1898 = 2;
                                class201.field3907 = 0;
                                class60.field1174.method657(28182, 0);
                                class60.field1174.method562(class8.field160, 73);
                                class60.field1174.method583(-68041368, var5);
                                class60.field1174.method574(class192.field3721, 90);
                                class60.field1174.method562(class186.field3591, 93);
                            }
                        }
                        if (var2 == 40) {
                            class32 var34 = class40.field795[var5];
                            if (var34 != null) {
                                ++class117.field2377;
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var34.field3310[0], class123.field2489.field3317[0], 0, 2, var34.field3317[0], (byte) 68, 0);
                                class90.field1898 = 2;
                                class148.field2907 = class185.field3546;
                                class167.field3231 = class3.field29;
                                class201.field3907 = 0;
                                class60.field1174.method657(28182, 163);
                                class60.field1174.method573(arg1 + 22000, var5);
                            }
                        }
                        if (var2 == 6) {
                            ++class87.field1864;
                            class94.method751(var6, (byte) -127, var3, var4);
                            class60.field1174.method657(28182, 54);
                            class60.field1174.method562(class127.field2536 + var3, 83);
                            class60.field1174.method583(-68041368, class34.field649 + var4);
                            class60.field1174.method562((int) (var6 >>> 32) & Integer.MAX_VALUE, arg1 ^ -2375);
                        }
                        if (var2 == 33) {
                            class60.field1174.method657(28182, 69);
                            ++class110.field2279;
                            class60.field1174.method562(var5, 65);
                            class60.field1174.method590(var3, arg1 ^ 1848440074);
                            class60.field1174.method606(var4, -1424429928);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, 484111152);
                            class23.field457 = var3;
                        }
                        if (var2 == 1006) {
                            class201.field3907 = 0;
                            class148.field2907 = class185.field3546;
                            class167.field3231 = class3.field29;
                            ++class204.field4009;
                            class90.field1898 = 2;
                            class60.field1174.method657(28182, 214);
                            class60.field1174.method583(-68041368, var5);
                        }
                        if (~var2 == -43) {
                            ++class9.field193;
                            class94.method751(var6, (byte) -119, var3, var4);
                            class60.field1174.method657(28182, 155);
                            class60.field1174.method562((int) (var6 >>> 32) & Integer.MAX_VALUE, 82);
                            class60.field1174.method583(-68041368, var3 - -class127.field2536);
                            class60.field1174.method583(-68041368, var4 - -class34.field649);
                        }
                        if (var2 == 30) {
                            class32 var35 = class40.field795[var5];
                            if (var35 != null) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var35.field3310[0], class123.field2489.field3317[0], 0, 2, var35.field3317[0], (byte) 100, 0);
                                class148.field2907 = class185.field3546;
                                class201.field3907 = 0;
                                class167.field3231 = class3.field29;
                                class90.field1898 = 2;
                                class60.field1174.method657(arg1 + 30548, 65);
                                ++class64.field1398;
                                class60.field1174.method583(-68041368, var5);
                            }
                        }
                        if (~var2 == -25) {
                            ++class40.field784;
                            class60.field1174.method657(arg1 ^ -26412, 90);
                            class60.field1174.method606(var4, arg1 ^ 1424431706);
                            class61 var36 = class23.method224(var4, 484111152);
                            if (var36.field1242 != null && var36.field1242[0][0] == 5) {
                                int var37 = var36.field1242[0][1];
                                if (class83.field1778[var37] != var36.field1218[0]) {
                                    class83.field1778[var37] = var36.field1218[0];
                                    class126.method952(var37, -128);
                                }
                            }
                        }
                        if (~var2 == -6) {
                            ++class125.field2510;
                            class60.field1174.method657(arg1 + 30548, 106);
                            class60.field1174.method573(arg1 + 22000, var3);
                            class60.field1174.method572(53, var4);
                            class60.field1174.method573(19634, var5);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, 484111152);
                            class23.field457 = var3;
                        }
                        if (var2 == 36) {
                            ++class170.field3278;
                            boolean var38 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 121, 0);
                            if (!var38) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 48, 0);
                            }
                            class201.field3907 = 0;
                            class90.field1898 = 2;
                            class167.field3231 = class3.field29;
                            class148.field2907 = class185.field3546;
                            class60.field1174.method657(28182, 60);
                            class60.field1174.method562(var5, 98);
                            class60.field1174.method562(class127.field2536 + var3, 84);
                            class60.field1174.method562(class34.field649 + var4, arg1 + 2450);
                        }
                        if (~var2 == -19) {
                            class32 var40 = class40.field795[var5];
                            if (var40 != null) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var40.field3310[0], class123.field2489.field3317[0], 0, 2, var40.field3317[0], (byte) 119, 0);
                                class201.field3907 = 0;
                                ++class160.field3103;
                                class167.field3231 = class3.field29;
                                class90.field1898 = 2;
                                class148.field2907 = class185.field3546;
                                class60.field1174.method657(28182, 74);
                                class60.field1174.method590(var5, arg1 ^ 1848440074);
                            }
                        }
                        if (~var2 == -11) {
                            class94.method751(var6, (byte) -126, var3, var4);
                            ++class206.field4045;
                            class60.field1174.method657(28182, 105);
                            class60.field1174.method573(arg1 + 22000, var4 - -class34.field649);
                            class60.field1174.method562((int) (var6 >>> 32) & Integer.MAX_VALUE, arg1 + 2428);
                            class60.field1174.method590(class127.field2536 + var3, arg1 ^ 1848440074);
                        }
                        if (var2 == 11) {
                            class72 var41 = class133.field2626[var5];
                            if (var41 != null) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var41.field3310[0], class123.field2489.field3317[0], 0, 2, var41.field3317[0], (byte) 49, 0);
                                class148.field2907 = class185.field3546;
                                ++class87.field1867;
                                class167.field3231 = class3.field29;
                                class201.field3907 = 0;
                                class90.field1898 = 2;
                                class60.field1174.method657(arg1 ^ -26412, 223);
                                class60.field1174.method583(-68041368, var5);
                            }
                        }
                        if (~var2 == -21) {
                            ++class37.field736;
                            class94.method751(var6, (byte) -126, var3, var4);
                            class60.field1174.method657(28182, 180);
                            class60.field1174.method562(var4 - -class34.field649, 70);
                            class60.field1174.method590((int) (var6 >>> 32) & Integer.MAX_VALUE, -1848441912);
                            class60.field1174.method590(class127.field2536 + var3, -1848441912);
                        }
                        if (~var2 == -17) {
                            ++class23.field451;
                            boolean var42 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 127, 0);
                            if (!var42) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 66, 0);
                            }
                            class167.field3231 = class3.field29;
                            class148.field2907 = class185.field3546;
                            class90.field1898 = 2;
                            class201.field3907 = 0;
                            class60.field1174.method657(arg1 + 30548, 179);
                            class60.field1174.method590(var5, -1848441912);
                            class60.field1174.method583(-68041368, class34.field649 + var4);
                            class60.field1174.method583(arg1 + -68039002, class127.field2536 + var3);
                        }
                        if (~var2 == -23) {
                            class60.field1174.method657(28182, 110);
                            ++class67.field1434;
                            class60.field1174.method562(var3, 96);
                            class60.field1174.method606(var4, -1424429928);
                            class60.field1174.method583(-68041368, var5);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, 484111152);
                            class23.field457 = var3;
                        }
                        if (~var2 == -9) {
                            class32 var44 = class40.field795[var5];
                            if (var44 != null) {
                                ++class5.field77;
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var44.field3310[0], class123.field2489.field3317[0], 0, 2, var44.field3317[0], (byte) 46, 0);
                                class148.field2907 = class185.field3546;
                                class90.field1898 = 2;
                                class201.field3907 = 0;
                                class167.field3231 = class3.field29;
                                class60.field1174.method657(28182, 12);
                                class60.field1174.method573(arg1 + 22000, var5);
                            }
                        }
                        if (var2 == 13) {
                            ++class106.field2221;
                            class60.field1174.method657(28182, 232);
                            class60.field1174.method590(var5, arg1 + -1848439546);
                            class60.field1174.method562(class201.field3917, arg1 ^ -2315);
                            class60.field1174.method606(class44.field889, -1424429928);
                            class60.field1174.method583(arg1 + -68039002, var3);
                            class60.field1174.method572(24, var4);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, arg1 + 484113518);
                            class23.field457 = var3;
                        }
                        if (~var2 == -27) {
                            ++class131.field2587;
                            boolean var45 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 117, 0);
                            if (!var45) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 120, 0);
                            }
                            class201.field3907 = 0;
                            class167.field3231 = class3.field29;
                            class148.field2907 = class185.field3546;
                            class90.field1898 = 2;
                            class60.field1174.method657(28182, 221);
                            class60.field1174.method590(class127.field2536 + var3, arg1 ^ 1848440074);
                            class60.field1174.method573(19634, class34.field649 + var4);
                            class60.field1174.method562(var5, 101);
                        }
                        if (var2 == 35) {
                            class32 var47 = class40.field795[var5];
                            if (var47 != null) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var47.field3310[0], class123.field2489.field3317[0], 0, 2, var47.field3317[0], (byte) 95, 0);
                                class201.field3907 = 0;
                                ++class96.field1995;
                                class90.field1898 = 2;
                                class148.field2907 = class185.field3546;
                                class167.field3231 = class3.field29;
                                class60.field1174.method657(28182, 46);
                                class60.field1174.method573(19634, var5);
                                class60.field1174.method583(arg1 ^ 68039594, class201.field3917);
                                class60.field1174.method598(class44.field889, (byte) -99);
                            }
                        }
                        if (var2 == 19) {
                            class60.field1174.method657(28182, 190);
                            ++class74.field1624;
                            class60.field1174.method573(19634, var5);
                            class60.field1174.method562(var3, 95);
                            class60.field1174.method598(var4, (byte) -99);
                            class178.field3417 = 0;
                            class184.field3523 = class23.method224(var4, arg1 + 484113518);
                            class23.field457 = var3;
                        }
                        if (var2 == 39) {
                            ++class92.field1927;
                            boolean var48 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 75, 0);
                            if (!var48) {
                                class204.method1337(0, class123.field2489.field3310[0], 1, 1, false, var3, class123.field2489.field3317[0], 0, 2, var4, (byte) 127, 0);
                            }
                            class148.field2907 = class185.field3546;
                            class90.field1898 = 2;
                            class201.field3907 = 0;
                            class167.field3231 = class3.field29;
                            class60.field1174.method657(28182, 170);
                            class60.field1174.method583(-68041368, class127.field2536 + var3);
                            class60.field1174.method583(arg1 ^ 68039594, var5);
                            class60.field1174.method562(class34.field649 + var4, 43);
                        }
                        if (~class109.field2268 != -1) {
                            class109.field2268 = 0;
                            class20.method204(class23.method224(class192.field3721, 484111152), (byte) -5);
                        }
                        if (class78.field1688) {
                            class87.method718((byte) -107);
                        }
                        if (class184.field3523 != null && class178.field3417 == 0) {
                            class20.method204(class184.field3523, (byte) -5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class151() {
        super(1, false);
    }
}
