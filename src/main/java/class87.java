import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class87 extends class117 {

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Z")
    private boolean field1620 = true;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Z")
    private boolean field1618 = true;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field1621 = 10;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "[Z")
    public static boolean[] field1619 = new boolean[100];

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "Lmi;")
    public static class128 field1625 = new class128();

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "[S")
    public static short[] field1631 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "Lqh;")
    public static class69 field1630;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII[[[Leg;IZ)Z")
    public static final boolean method683(boolean arg0, int arg1, int arg2, class144[][][] arg3, int arg4, boolean arg5) {
        ++field1626;
        byte var6 = !arg0 ? (byte) (class114.field2145 & 255) : 1;
        if (class125.field2411[class20.field323][arg2][arg4] == var6) {
            return false;
        } else if ((class123.field2344[class20.field323][arg2][arg4] & 4) == 0) {
            return false;
        } else {
            if (arg5) {
                method686(-103);
            }
            byte var7 = 0;
            class197.field3552[var7] = arg2;
            int var31 = var7 + 1;
            class96.field1816[var7] = arg4;
            class125.field2411[class20.field323][arg2][arg4] = var6;
            int var8 = 0;
            while (~var31 != ~var8) {
                int var9 = class197.field3552[var8] >> 16 & 255;
                int var10 = class197.field3552[var8] & 65535;
                int var11 = 255 & class197.field3552[var8] >> 24;
                int var12 = 255 & class96.field1816[var8] >> 16;
                int var13 = class96.field1816[var8] & 65535;
                boolean var14 = false;
                boolean var15 = false;
                var8 = 4095 & var8 + 1;
                if ((class123.field2344[class20.field323][var10][var13] & 4) == 0) {
                    var14 = true;
                }
                label229: for (int var16 = class20.field323 + 1; ~var16 >= -4; ++var16) {
                    if ((8 & class123.field2344[var16][var10][var13]) == 0) {
                        if (var14 && arg3[var16][var10][var13] != null) {
                            if (arg3[var16][var10][var13].field2731 != null) {
                                int var19 = class183.method1354(var9, -15);
                                if (arg3[var16][var10][var13].field2731.field2935 == var19 || arg3[var16][var10][var13].field2731.field2928 == var19) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var20 = class183.method1354(var11, -117);
                                    if (~arg3[var16][var10][var13].field2731.field2935 == ~var20 || ~arg3[var16][var10][var13].field2731.field2928 == ~var20) {
                                        continue;
                                    }
                                }
                                if (~var12 != -1) {
                                    int var21 = class183.method1354(var12, -123);
                                    if (arg3[var16][var10][var13].field2731.field2935 == var21 || ~arg3[var16][var10][var13].field2731.field2928 == ~var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var10][var13].field2746 != null) {
                                for (int var22 = 0; arg3[var16][var10][var13].field2741 > var22; ++var22) {
                                    int var23 = (int) (63L & arg3[var16][var10][var13].field2746[var22].field2568 >> 14);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (3L & arg3[var16][var10][var13].field2746[var22].field2568 >> 20);
                                    int var25 = var23 | var24 << 6;
                                    if (~var9 == ~var25 || var11 != 0 && var11 == var25 || ~var12 != -1 && ~var12 == ~var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class144 var26 = arg3[var16][var10][var13];
                        if (var26 != null && var26.field2741 > 0) {
                            for (int var27 = 0; var27 < var26.field2741; ++var27) {
                                class132 var28 = var26.field2746[var27];
                                if (var28.field2565 != var28.field2555 || ~var28.field2551 != ~var28.field2550) {
                                    for (int var29 = var28.field2555; var28.field2565 >= var29; ++var29) {
                                        for (int var30 = var28.field2550; ~var30 >= ~var28.field2551; ++var30) {
                                            class125.field2411[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class125.field2411[var16][var10][var13] = var6;
                    }
                }
                if (var15) {
                    int var17 = var13 << 7;
                    if (class215.field3921[arg1] < class228.field4107[class20.field323 - -1][var10][var13]) {
                        class215.field3921[arg1] = class228.field4107[class20.field323 + 1][var10][var13];
                    }
                    int var18 = var10 << 7;
                    if (class106.field2013[arg1] <= var18) {
                        if (~var18 < ~class235.field4197[arg1]) {
                            class235.field4197[arg1] = var18;
                        }
                    } else {
                        class106.field2013[arg1] = var18;
                    }
                    if (~class134.field2598[arg1] >= ~var17) {
                        if (~class258.field4510[arg1] > ~var17) {
                            class258.field4510[arg1] = var17;
                        }
                    } else {
                        class134.field2598[arg1] = var17;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && ~class125.field2411[class20.field323][var10 + -1][var13] != ~var6) {
                        class197.field3552[var31] = class3.method27(class3.method27(var10 + -1, 1179648), -754974720);
                        class96.field1816[var31] = class3.method27(var13, 1245184);
                        class125.field2411[class20.field323][var10 + -1][var13] = var6;
                        var31 = var31 + 1 & 4095;
                    }
                    ++var13;
                    if (var13 < 104) {
                        if (var10 - 1 >= 0 && ~class125.field2411[class20.field323][var10 + -1][var13] != ~var6 && ~(4 & class123.field2344[class20.field323][var10][var13]) == -1 && (4 & class123.field2344[class20.field323][var10 + -1][var13 + -1]) == 0) {
                            class197.field3552[var31] = class3.method27(1375731712, class3.method27(var10 - 1, 1179648));
                            class96.field1816[var31] = class3.method27(1245184, var13);
                            var31 = var31 + 1 & 4095;
                            class125.field2411[class20.field323][var10 - 1][var13] = var6;
                        }
                        if (class125.field2411[class20.field323][var10][var13] != var6) {
                            class197.field3552[var31] = class3.method27(class3.method27(5373952, var10), 318767104);
                            class96.field1816[var31] = class3.method27(5439488, var13);
                            class125.field2411[class20.field323][var10][var13] = var6;
                            var31 = 4095 & var31 - -1;
                        }
                        if (~(var10 + 1) > -105 && class125.field2411[class20.field323][var10 + 1][var13] != var6 && ~(class123.field2344[class20.field323][var10][var13] & 4) == -1 && ~(class123.field2344[class20.field323][var10 - -1][var13 + -1] & 4) == -1) {
                            class197.field3552[var31] = class3.method27(class3.method27(5373952, var10 - -1), -1845493760);
                            class96.field1816[var31] = class3.method27(5439488, var13);
                            var31 = var31 + 1 & 4095;
                            class125.field2411[class20.field323][var10 + 1][var13] = var6;
                        }
                    }
                    --var13;
                    if (var10 + 1 < 104 && class125.field2411[class20.field323][var10 + 1][var13] != var6) {
                        class197.field3552[var31] = class3.method27(class3.method27(var10 + 1, 9568256), 1392508928);
                        class96.field1816[var31] = class3.method27(var13, 9633792);
                        class125.field2411[class20.field323][var10 - -1][var13] = var6;
                        var31 = var31 + 1 & 4095;
                    }
                    --var13;
                    if (var13 >= 0) {
                        if (~(var10 - 1) <= -1 && class125.field2411[class20.field323][var10 + -1][var13] != var6 && (class123.field2344[class20.field323][var10][var13] & 4) == 0 && ~(4 & class123.field2344[class20.field323][var10 + -1][var13 + 1]) == -1) {
                            class197.field3552[var31] = class3.method27(class3.method27(13762560, var10 + -1), 301989888);
                            class96.field1816[var31] = class3.method27(13828096, var13);
                            class125.field2411[class20.field323][var10 - 1][var13] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                        if (class125.field2411[class20.field323][var10][var13] != var6) {
                            class197.field3552[var31] = class3.method27(-1828716544, class3.method27(13762560, var10));
                            class96.field1816[var31] = class3.method27(var13, 13828096);
                            var31 = 4095 & var31 + 1;
                            class125.field2411[class20.field323][var10][var13] = var6;
                        }
                        if (var10 + 1 < 104 && ~class125.field2411[class20.field323][var10 + 1][var13] != ~var6 && ~(class123.field2344[class20.field323][var10][var13] & 4) == -1 && (4 & class123.field2344[class20.field323][var10 + 1][var13 + 1]) == 0) {
                            class197.field3552[var31] = class3.method27(-771751936, class3.method27(9568256, var10 + 1));
                            class96.field1816[var31] = class3.method27(9633792, var13);
                            class125.field2411[class20.field323][var10 + 1][var13] = var6;
                            var31 = var31 + 1 & 4095;
                        }
                    }
                }
            }
            if (class215.field3921[arg1] != -1000000) {
                class215.field3921[arg1] += 10;
                class106.field2013[arg1] -= 50;
                class235.field4197[arg1] += 50;
                class258.field4510[arg1] += 50;
                class134.field2598[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lhh;ZZ)V")
    public static final void method684(class163 arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            if (!arg1) {
                try {
                    class163.field3008.getAppletContext().showDocument(arg0.method1183(0, class163.field3008.getCodeBase()), "_top");
                } catch (Exception var4) {
                }
            } else {
                try {
                    class163.field3008.getAppletContext().showDocument(arg0.method1183(0, class163.field3008.getCodeBase()), "_blank");
                } catch (Exception var3) {
                }
            }
            ++field1629;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field2208 = arg2.method622(true) == 1;
                }
            } else {
                this.field1618 = ~arg2.method622(true) == -2;
            }
        } else {
            this.field1620 = arg2.method622(true) == 1;
        }
        if (arg0 == 0) {
            ++field1627;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII)V")
    public static final void method685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1623;
        int var7 = 0;
        class106.method859(false, arg3);
        int var8 = -arg6 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        if (arg4 != 787) {
            field1630 = null;
        }
        int var11 = var8;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var8;
        int[] var15 = class85.field1605[arg2];
        int var16 = arg1 + var8;
        int var17 = arg1 - var8;
        class227.method1585(arg1 - arg3, (byte) -66, arg0, var15, var17);
        class227.method1585(var17, (byte) -66, arg5, var15, var16);
        class227.method1585(var16, (byte) -66, arg0, var15, arg1 + arg3);
        while (var9 > var7) {
            var13 += 2;
            var14 += var13;
            if (var14 >= 0 && ~var11 <= -2) {
                class240.field4282[var11] = var7;
                --var11;
                var14 -= var11 << 1;
            }
            var12 += 2;
            ++var7;
            var10 += var12;
            if (var10 >= 0) {
                --var9;
                if (var8 > var9) {
                    int[] var18 = class85.field1605[-var9 + arg2];
                    int[] var19 = class85.field1605[arg2 + var9];
                    int var20 = class240.field4282[var9];
                    int var21 = arg1 + var7;
                    int var22 = -var7 + arg1;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class227.method1585(var22, (byte) -66, arg0, var19, var24);
                    class227.method1585(var24, (byte) -66, arg5, var19, var23);
                    class227.method1585(var23, (byte) -66, arg0, var19, var21);
                    class227.method1585(var22, (byte) -66, arg0, var18, var24);
                    class227.method1585(var24, (byte) -66, arg5, var18, var23);
                    class227.method1585(var23, (byte) -66, arg0, var18, var21);
                } else {
                    int[] var25 = class85.field1605[arg2 - -var9];
                    int var26 = arg1 + var7;
                    int var27 = -var7 + arg1;
                    int[] var28 = class85.field1605[-var9 + arg2];
                    class227.method1585(var27, (byte) -66, arg0, var25, var26);
                    class227.method1585(var27, (byte) -66, arg0, var28, var26);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class85.field1605[arg2 + var7];
            int[] var30 = class85.field1605[-var7 + arg2];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var8 > var7) {
                int var33 = var11 >= var7 ? var11 : class240.field4282[var7];
                int var34 = arg1 + var33;
                int var35 = -var33 + arg1;
                class227.method1585(var32, (byte) -66, arg0, var29, var35);
                class227.method1585(var35, (byte) -66, arg5, var29, var34);
                class227.method1585(var34, (byte) -66, arg0, var29, var31);
                class227.method1585(var32, (byte) -66, arg0, var30, var35);
                class227.method1585(var35, (byte) -66, arg5, var30, var34);
                class227.method1585(var34, (byte) -66, arg0, var30, var31);
            } else {
                class227.method1585(var32, (byte) -66, arg0, var29, var31);
                class227.method1585(var32, (byte) -66, arg0, var30, var31);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field1628;
        int[] var3 = super.field2218.method1044(arg1, arg0 + 21393);
        if (arg0 != -21393) {
            method685(-40, -74, 37, 73, 87, -52, -120);
        }
        if (super.field2218.field2587) {
            int[] var4 = this.method932(this.field1618 ? class258.field4520 - arg1 : arg1, false, 0);
            if (this.field1620) {
                for (int var5 = 0; ~var5 > ~class143.field2702; ++var5) {
                    var3[var5] = var4[-var5 + class54.field884];
                }
            } else {
                class241.method1666(var4, 0, var3, 0, class143.field2702);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1619 = null;
        field1631 = null;
        field1625 = null;
        if (arg0 >= -49) {
            method686(-30);
        }
        field1630 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field1624;
        if (!arg1) {
            field1619 = null;
        }
        int[][] var3 = super.field2228.method1304(arg0, (byte) 117);
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(this.field1618 ? -arg0 + class258.field4520 : arg0, 72, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            if (!this.field1620) {
                for (int var11 = 0; ~class143.field2702 < ~var11; ++var11) {
                    var10[var11] = var6[var11];
                    var9[var11] = var5[var11];
                    var8[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class143.field2702; ++var12) {
                    var10[var12] = var6[-var12 + class54.field884];
                    var9[var12] = var5[class54.field884 - var12];
                    var8[var12] = var7[class54.field884 - var12];
                }
            }
        }
        return var3;
    }
}
