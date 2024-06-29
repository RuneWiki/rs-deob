import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class68 extends class223 {

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "Z")
    private boolean field1078 = true;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "Z")
    private boolean field1083 = true;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1082 = new String[500];

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Lub;")
    public static class92 field1076;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field1081;
        if (arg0 < 14) {
            this.method40((byte) -2, -63);
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[] var4 = this.method1533(0, !this.field1078 ? arg1 : class75.field1168 - arg1, -91);
            if (!this.field1083) {
                class81.method637(var4, 0, var3, 0, class250.field4008);
            } else {
                for (int var5 = 0; class250.field4008 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class280.field4430];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lha;I)Ljm;")
    public static final class110 method548(class31 arg0, int arg1) {
        int var2 = 49 % ((arg1 - -52) / 41);
        ++field1074;
        return new class110(arg0.method308((byte) -127), arg0.method308((byte) -124), arg0.method308((byte) -3), arg0.method308((byte) 44), arg0.method304((byte) 84), arg0.method304((byte) 84), arg0.method265(-101));
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
    public static void method549(byte arg0) {
        if (arg0 >= -115) {
            field1075 = 42;
        }
        field1076 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIZZ)V")
    public static final void method550(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field1080;
        int var10002;
        for (int var4 = 0; class117.field1782 > var4; ++var4) {
            class161 var21 = class116.field1781[class255.field4084[var4]];
            if (var21 != null && var21.method1006(-1) && var21.field2421.method748((byte) -111)) {
                int var22 = var21.method1013(arg1 ^ 20194);
                if (!arg2) {
                    if (var21.field2421.field1526 != arg3 || arg0 != 0 && arg0 != var22) {
                        continue;
                    }
                } else if (!var21.field2421.field1549) {
                    continue;
                }
                if (var22 == 1) {
                    if ((127 & var21.field4725) == 64 && (var21.field4709 & 127) == 64) {
                        int var29 = var21.field4709 >> 7;
                        int var30 = var21.field4725 >> 7;
                        if (var30 >= 0 && var30 < 104 && var29 >= 0 && var29 < 104) {
                            var10002 = class184.field2909[var30][var29]++;
                        }
                    }
                } else if ((~(var22 & 1) != -1 || ~(var21.field4725 & 127) == -1 && (var21.field4709 & 127) == 0) && (~(var22 & 1) != -2 || ~(var21.field4725 & 127) == -65 && (127 & var21.field4709) == 64)) {
                    int var23 = -(var22 * 64) + var21.field4709 >> 7;
                    int var24 = -(var22 * 64) + var21.field4725 >> 7;
                    int var25 = var24 + var21.method1013(0);
                    if (~var24 > -1) {
                        var24 = 0;
                    }
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    int var26 = var23 - -var21.method1013(arg1 + -20194);
                    if (~var26 < -105) {
                        var26 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    for (int var27 = var24; var27 < var25; ++var27) {
                        for (int var28 = var23; var26 > var28; ++var28) {
                            var10002 = class184.field2909[var27][var28]++;
                        }
                    }
                }
            }
        }
        if (arg1 == 20194) {
            label201: for (int var5 = 0; var5 < class117.field1782; ++var5) {
                long var6 = (long) class255.field4084[var5] << 32 | 536870912L;
                class161 var8 = class116.field1781[class255.field4084[var5]];
                if (var8 != null && var8.method1006(-1) && var8.field2421.method748((byte) -120)) {
                    int var9 = var8.method1013(0);
                    if (!arg2) {
                        if (var8.field2421.field1526 != arg3 || ~arg0 != -1 && arg0 != var9) {
                            continue;
                        }
                    } else if (!var8.field2421.field1549) {
                        continue;
                    }
                    var8.field4687 = true;
                    if (var9 == 1) {
                        if ((127 & var8.field4725) == 64 && (127 & var8.field4709) == 64) {
                            int var10 = var8.field4709 >> 7;
                            int var11 = var8.field4725 >> 7;
                            if (var11 < 0 || var11 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (~class184.field2909[var11][var10] < -2) {
                                var10002 = class184.field2909[var11][var10]--;
                                continue;
                            }
                        }
                    } else if (~(var9 & 1) == -1 && ~(var8.field4725 & 127) == -1 && (127 & var8.field4709) == 0 || (var9 & 1) == 1 && (var8.field4725 & 127) == 64 && ~(127 & var8.field4709) == -65) {
                        int var12 = var8.field4709 - var9 * 64 >> 7;
                        int var13 = -(var9 * 64) + var8.field4725 >> 7;
                        int var14 = var9 + var13;
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        if (~var13 > -1) {
                            var13 = 0;
                        }
                        int var15 = var9 + var12;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        if (var15 > 104) {
                            var15 = 104;
                        }
                        boolean var16 = true;
                        for (int var17 = var13; ~var17 > ~var14; ++var17) {
                            for (int var20 = var12; ~var20 > ~var15; ++var20) {
                                if (class184.field2909[var17][var20] <= 1) {
                                    var16 = false;
                                    break;
                                }
                            }
                        }
                        if (var16) {
                            int var18 = var13;
                            while (true) {
                                if (~var18 <= ~var14) {
                                    continue label201;
                                }
                                for (int var19 = var12; var19 < var15; ++var19) {
                                    var10002 = class184.field2909[var18][var19]--;
                                }
                                ++var18;
                            }
                        }
                    }
                    var8.field4687 = false;
                    if (!var8.field2421.field1518) {
                        var6 |= Long.MIN_VALUE;
                    }
                    var8.field4767 = class254.method1721(-580808345, class130.field1941, var8.field4709, var8.field4725);
                    class147.method1071(class130.field1941, var8.field4725, var8.field4709, var8.field4767, (var9 - 1) * 64 + 60, var8, var8.field4719, var6, var8.field4769);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            field1075 = -116;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field3583 = arg0.method265(-115) == 1;
                }
            } else {
                this.field1078 = ~arg0.method265(-86) == -2;
            }
        } else {
            this.field1083 = ~arg0.method265(-98) == -2;
        }
        ++field1079;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field1077;
        if (arg0 <= 0) {
            field1075 = 40;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[][] var4 = this.method1534(false, 0, !this.field1078 ? arg1 : -arg1 + class75.field1168);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var4[1];
            if (!this.field1083) {
                for (int var11 = 0; class250.field4008 > var11; ++var11) {
                    var5[var11] = var7[var11];
                    var9[var11] = var10[var11];
                    var6[var11] = var8[var11];
                }
            } else {
                for (int var12 = 0; class250.field4008 > var12; ++var12) {
                    var5[var12] = var7[-var12 + class280.field4430];
                    var9[var12] = var10[-var12 + class280.field4430];
                    var6[var12] = var8[class280.field4430 - var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }
}
