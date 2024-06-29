import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class15 extends class115 {

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "Ljl;")
    public static class231 field224 = new class231(64);

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "[I")
    public static int[] field225 = new int[14];

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Z")
    public static boolean field229 = true;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "Lve;")
    public static class233 field219;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Lha;")
    public static class267 field221;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "[S")
    public static short[] field226;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field222;
        int[] var3 = super.field1705.method463(arg1, false);
        if (arg0 != 242152972) {
            field224 = null;
        }
        if (super.field1705.field1072) {
            int[][] var4 = this.method798(0, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class77.field1178; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method117(int arg0, int arg1, boolean arg2, int arg3) {
        ++field220;
        if (arg1 >= 2 && ~arg1 >= -37) {
            if (arg2 && ~arg0 <= -1) {
                int var4 = 2;
                if (arg3 != -1) {
                    field226 = null;
                }
                int var5 = arg0 / arg1;
                while (~var5 != -1) {
                    var5 /= arg1;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                for (int var7 = var4 - 1; ~var7 < -1; --var7) {
                    int var8 = arg0;
                    arg0 /= arg1;
                    int var9 = -(arg0 * arg1) + var8;
                    if (var9 < 10) {
                        var6[var7] = (char) (var9 + 48);
                    } else {
                        var6[var7] = (char) (var9 + 87);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg0, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjh;)V")
    public static final void method118(byte arg0, class234 arg1) {
        ++field228;
        class121.method826(200000, 88, arg1);
        if (arg0 <= 53) {
            field226 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class15() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILha;)V")
    public static final void method119(int arg0, int arg1, int arg2, class267 arg3) {
        ++field223;
        if (arg3.field4064 == 1) {
            class180.method1167(arg3.field4178, "", -1, arg3.field4113, (short) 48, 0L, 122, 0);
            ++class202.field2913;
        }
        if (arg3.field4064 == 2 && !class275.field4406) {
            String var4 = class47.method312(-1, arg3);
            if (var4 != null) {
                class180.method1167(var4, "<col=00ff00>" + arg3.field4127, -1, arg3.field4113, (short) 51, 0L, 121, -1);
                ++class159.field2307;
            }
        }
        if (arg3.field4064 == 3) {
            class180.method1167(class260.field3926, "", -1, arg3.field4113, (short) 23, 0L, 120, 0);
            ++class204.field2961;
        }
        if (arg1 <= 68) {
            method119(-2, -128, 56, (class267) null);
        }
        if (~arg3.field4064 == -5) {
            ++class248.field3721;
            class180.method1167(arg3.field4178, "", -1, arg3.field4113, (short) 31, 0L, 123, 0);
        }
        if (~arg3.field4064 == -6) {
            ++class214.field3086;
            class180.method1167(arg3.field4178, "", -1, arg3.field4113, (short) 25, 0L, -82, 0);
        }
        if (~arg3.field4064 == -7 && class101.field1508 == null) {
            ++class250.field3814;
            class180.method1167(arg3.field4178, "", -1, arg3.field4113, (short) 20, 0L, 119, -1);
        }
        if (arg3.field4149 == 2) {
            int var5 = 0;
            for (int var6 = 0; ~arg3.field4105 < ~var6; ++var6) {
                for (int var7 = 0; var7 < arg3.field4187; ++var7) {
                    int var8 = (arg3.field4026 + 32) * var7;
                    int var9 = (arg3.field4106 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field4179[var5];
                        var8 += arg3.field4122[var5];
                    }
                    if (var8 <= arg2 && arg0 >= var9 && ~arg2 > ~(var8 + 32) && ~arg0 > ~(var9 + 32)) {
                        class246.field3678 = var5;
                        class141.field2034 = arg3;
                        if (arg3.field4107[var5] > 0) {
                            class92 var10 = client.method1439(arg3);
                            class273 var11 = class259.method1735(arg3.field4107[var5] - 1, -14667);
                            if (class204.field2963 == 1 && var10.method621(-17417)) {
                                if (class91.field1387 != arg3.field4113 || class151.field2169 != var5) {
                                    class180.method1167(class240.field3609, class207.field3002 + " -> <col=ff9040>" + var11.field4375, -1, arg3.field4113, (short) 50, (long) var11.field4380, 119, var5);
                                    ++class283.field4510;
                                }
                            } else if (class275.field4406 && var10.method621(-17417)) {
                                class228 var12 = ~class67.field1043 == 0 ? null : class102.method678((byte) -126, class67.field1043);
                                if (~(class136.field1970 & 16) != -1 && (var12 == null || ~var11.method1835((byte) -97, var12.field3410, class67.field1043) != ~var12.field3410)) {
                                    class180.method1167(class214.field3087, class14.field214 + " -> <col=ff9040>" + var11.field4375, class255.field3866, arg3.field4113, (short) 30, (long) var11.field4380, 127, var5);
                                    ++class202.field2908;
                                }
                            } else {
                                String[] var13 = var11.field4377;
                                ++class13.field196;
                                if (class100.field1488) {
                                    var13 = class170.method1121(var13, (byte) 84);
                                }
                                if (var10.method621(-17417)) {
                                    for (int var14 = 4; ~var14 <= -4; --var14) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (~var14 != -4) {
                                                var15 = 11;
                                            } else {
                                                var15 = 5;
                                            }
                                            ++class273.field4322;
                                            class180.method1167(var13[var14], "<col=ff9040>" + var11.field4375, -1, arg3.field4113, var15, (long) var11.field4380, -92, var5);
                                        }
                                    }
                                }
                                if (var10.method628((byte) -79)) {
                                    class180.method1167(class240.field3609, "<col=ff9040>" + var11.field4375, class269.field4217, arg3.field4113, (short) 22, (long) var11.field4380, 127, var5);
                                    ++class84.field1291;
                                }
                                if (var10.method621(-17417) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; --var16) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 57;
                                            }
                                            ++class202.field2920;
                                            if (~var16 == -2) {
                                                var17 = 32;
                                            }
                                            if (var16 == 2) {
                                                var17 = 14;
                                            }
                                            class180.method1167(var13[var16], "<col=ff9040>" + var11.field4375, -1, arg3.field4113, var17, (long) var11.field4380, 123, var5);
                                        }
                                    }
                                }
                                String[] var18 = arg3.field4043;
                                if (class100.field1488) {
                                    var18 = class170.method1121(var18, (byte) 117);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; ~var19 <= -1; --var19) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (~var19 == -1) {
                                                var20 = 45;
                                            }
                                            ++class131.field1924;
                                            if (var19 == 1) {
                                                var20 = 4;
                                            }
                                            if (~var19 == -3) {
                                                var20 = 49;
                                            }
                                            if (var19 == 3) {
                                                var20 = 46;
                                            }
                                            if (var19 == 4) {
                                                var20 = 34;
                                            }
                                            class180.method1167(var18[var19], "<col=ff9040>" + var11.field4375, -1, arg3.field4113, var20, (long) var11.field4380, -81, var5);
                                        }
                                    }
                                }
                                class180.method1167(class55.field830, "<col=ff9040>" + var11.field4375, class206.field2976, arg3.field4113, (short) 1001, (long) var11.field4380, -112, var5);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg3.field4039) {
            if (class275.field4406) {
                if (client.method1439(arg3).method630(1) && (class136.field1970 & 32) != 0) {
                    ++class218.field3222;
                    class180.method1167(class214.field3087, class14.field214 + " -> " + arg3.field4093, class255.field3866, arg3.field4113, (short) 40, 0L, -15, arg3.field4058);
                    return;
                }
            } else {
                for (int var21 = 9; ~var21 <= -6; --var21) {
                    String var25 = class13.method111(arg3, var21, 68);
                    if (var25 != null) {
                        ++class91.field1383;
                        class180.method1167(var25, arg3.field4093, class282.method1898(arg3, -48, var21), arg3.field4113, (short) 1003, (long) (var21 + 1), 120, arg3.field4058);
                    }
                }
                String var22 = class47.method312(-1, arg3);
                if (var22 != null) {
                    ++class159.field2307;
                    class180.method1167(var22, arg3.field4093, -1, arg3.field4113, (short) 51, 0L, -53, arg3.field4058);
                }
                for (int var23 = 4; ~var23 <= -1; --var23) {
                    String var24 = class13.method111(arg3, var23, 70);
                    if (var24 != null) {
                        ++class91.field1383;
                        class180.method1167(var24, arg3.field4093, class282.method1898(arg3, -85, var23), arg3.field4113, (short) 44, (long) (var23 - -1), -69, arg3.field4058);
                    }
                }
                if (!client.method1439(arg3).method623(true)) {
                    return;
                }
                ++class250.field3814;
                class180.method1167(class135.field1955, "", -1, arg3.field4113, (short) 20, 0L, 120, arg3.field4058);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field226 = null;
        field221 = null;
        field219 = null;
        field225 = null;
        int var1 = -17 / ((arg0 - 70) / 43);
        field224 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)Z")
    public static final boolean method121(boolean arg0) {
        ++field227;
        if (!arg0) {
            return true;
        } else {
            return ~class184.field2620 != -1 ? true : class138.field1995.method429(0);
        }
    }
}
