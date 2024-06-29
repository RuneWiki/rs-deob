import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class154 extends class170 {

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "Ldd;")
    public static class132 field2667 = new class132();

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "[Lrd;")
    public static class265[] field2671 = new class265[6];

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field2672 = -2;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "Lmd;")
    public static class220 field2673 = null;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lpk;")
    public static class99 field2670;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBIIIIZ)V")
    public static final void method1105(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field2669;
        if (class89.field1602 != arg3 || ~class199.field3500 != ~arg0 || class141.field2446 != arg2 && !class212.method1512(-106)) {
            class89.field1602 = arg3;
            class199.field3500 = arg0;
            class141.field2446 = arg2;
            if (class212.method1512(arg1 + -36)) {
                class141.field2446 = 0;
            }
            if (!arg6) {
                class193.method1345(arg1 + -4, 25);
            } else {
                class193.method1345(arg1 + -4, 28);
            }
            if (arg1 != 14) {
                method1106(-13);
            }
            class284.method1926(class285.field4999, (byte) 72, true);
            int var7 = class180.field3231;
            int var8 = class21.field349;
            class180.field3231 = arg0 * 8 + -48;
            class21.field349 = (arg3 + -6) * 8;
            class101.field1830 = class285.method1937(false, class199.field3500 * 8, class89.field1602 * 8);
            int var9 = class21.field349 - var8;
            int var10 = class21.field349;
            int var11 = class180.field3231 - var7;
            int var12 = class180.field3231;
            class202.field3570 = null;
            if (arg6) {
                class138.field2390 = 0;
                for (int var13 = 0; ~var13 > -32769; ++var13) {
                    class256 var14 = class79.field1449[var13];
                    if (var14 != null) {
                        var14.field5104 -= var9 * 128;
                        var14.field5072 -= var11 * 128;
                        if (~var14.field5104 <= -1 && ~var14.field5104 >= -13185 && ~var14.field5072 <= -1 && var14.field5072 <= 13184) {
                            for (int var15 = 0; ~var15 > -11; ++var15) {
                                var14.field5022[var15] -= var9;
                                var14.field5074[var15] -= var11;
                            }
                            class117.field2036[class138.field2390++] = var13;
                        } else {
                            class79.field1449[var13].method1780((byte) 57, (class72) null);
                            class79.field1449[var13] = null;
                        }
                    }
                }
            } else {
                for (int var16 = 0; var16 < 32768; ++var16) {
                    class256 var32 = class79.field1449[var16];
                    if (var32 != null) {
                        for (int var33 = 0; var33 < 10; ++var33) {
                            var32.field5022[var33] -= var9;
                            var32.field5074[var33] -= var11;
                        }
                        var32.field5104 -= var9 * 128;
                        var32.field5072 -= var11 * 128;
                    }
                }
            }
            for (int var17 = 0; ~var17 > -2049; ++var17) {
                class14 var30 = class169.field2953[var17];
                if (var30 != null) {
                    for (int var31 = 0; var31 < 10; ++var31) {
                        var30.field5022[var31] -= var9;
                        var30.field5074[var31] -= var11;
                    }
                    var30.field5072 -= var11 * 128;
                    var30.field5104 -= var9 * 128;
                }
            }
            class93.field1645 = arg2;
            class202.field3565.method88((byte) -99, false, arg4, arg5);
            byte var18 = 0;
            byte var19 = 104;
            byte var20 = 0;
            byte var21 = 104;
            byte var22 = 1;
            if (~var11 > -1) {
                var21 = -1;
                var20 = 103;
                var22 = -1;
            }
            byte var23 = 1;
            if (var9 < 0) {
                var19 = -1;
                var23 = -1;
                var18 = 103;
            }
            for (int var24 = var18; ~var19 != ~var24; var24 += var23) {
                for (int var26 = var20; var21 != var26; var26 += var22) {
                    int var27 = var26 - -var11;
                    int var28 = var24 - -var9;
                    for (int var29 = 0; ~var29 > -5; ++var29) {
                        if (~var28 <= -1 && var27 >= 0 && var28 < 104 && var27 < 104) {
                            class276.field4844[var29][var24][var26] = class276.field4844[var29][var28][var27];
                        } else {
                            class276.field4844[var29][var24][var26] = null;
                        }
                    }
                }
            }
            for (class196 var25 = (class196) class250.field4527.method922((byte) 110); var25 != null; var25 = (class196) class250.field4527.method928(105)) {
                var25.field3451 -= var11;
                var25.field3448 -= var9;
                if (~var25.field3448 > -1 || ~var25.field3451 > -1 || var25.field3448 >= 104 || var25.field3451 >= 104) {
                    var25.method1346((byte) -16);
                }
            }
            if (class117.field2015 != 0) {
                class233.field4282 -= var11;
                class117.field2015 -= var9;
            }
            class78.field1429 = -1;
            class242.field4404 = 0;
            if (!arg6) {
                class132.field2290 = 1;
            } else {
                class90.field1616 -= var11;
                class209.field3702 -= var9 * 128;
                class111.field1939 -= var11 * 128;
                class25.field531 -= var11;
                class55.field1034 -= var9;
                class157.field2789 -= var9;
            }
            class43.field838.method924(arg1 + -30879);
            class167.field2933.method924(-30865);
        }
    }

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field2667 = null;
        field2671 = null;
        field2670 = null;
        if (arg0 != -1) {
            method1105(0, (byte) -86, -127, -4, -56, -88, true);
        }
        field2673 = null;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class154() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field2668;
        int[] var3 = super.field3001.method1538(arg0 ^ -87, arg1);
        if (super.field3001.field3835) {
            int[][] var4 = this.method1223(0, 88, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; class88.field1595 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return arg0 != -30 ? null : var3;
    }
}
