import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class79 extends class167 {

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    private int field1496 = 4096;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "[I")
    public static int[] field1488 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lkh;")
    public static class117 field1497 = class224.method1450((byte) 114, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Lai;")
    public static class10 field1492;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Lai;")
    public static class10 field1498;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lvb;")
    public static class232 field1489;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            field1488 = null;
        }
        for (int var6 = arg1; ~var6 >= ~(arg1 + arg4); ++var6) {
            for (int var11 = arg3; ~(arg2 + arg3) <= ~var11; ++var11) {
                if (~var11 <= -1 && var11 < 104 && ~var6 <= -1 && ~var6 > -105) {
                    class225.field4049[arg0][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg1; ~(arg1 + arg4) < ~var7; ++var7) {
            for (int var10 = arg3; var10 < arg2 + arg3; ++var10) {
                if (~var10 <= -1 && ~var10 > -105 && var7 >= 0 && var7 < 104) {
                    class156.field2839[arg0][var10][var7] = arg0 <= 0 ? 0 : class156.field2839[arg0 + -1][var10][var7];
                }
            }
        }
        ++field1499;
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg1 + 1; ~(arg1 + arg4) < ~var8; ++var8) {
                if (var8 >= 0 && ~var8 > -105) {
                    class156.field2839[arg0][arg3][var8] = class156.field2839[arg0][arg3 + -1][var8];
                }
            }
        }
        if (arg1 > 0 && ~arg1 > -105) {
            for (int var9 = arg3 + 1; ~var9 > ~(arg2 + arg3); ++var9) {
                if (~var9 <= -1 && var9 < 104) {
                    class156.field2839[arg0][var9][arg1] = class156.field2839[arg0][var9][arg1 - 1];
                }
            }
        }
        if (arg3 >= 0 && arg1 >= 0 && arg3 < 104 && arg1 < 104) {
            if (arg0 == 0) {
                if (~arg3 < -1 && ~class156.field2839[arg0][arg3 + -1][arg1] != -1) {
                    class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3 + -1][arg1];
                    return;
                }
                if (arg1 > 0 && ~class156.field2839[arg0][arg3][arg1 + -1] != -1) {
                    class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3][arg1 + -1];
                    return;
                }
                if (arg3 > 0 && ~arg1 < -1 && class156.field2839[arg0][arg3 + -1][arg1 - 1] != 0) {
                    class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3 + -1][arg1 - 1];
                    return;
                }
            } else {
                if (arg3 > 0 && ~class156.field2839[arg0 - 1][arg3 - 1][arg1] != ~class156.field2839[arg0][arg3 + -1][arg1]) {
                    class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3 + -1][arg1];
                    return;
                }
                if (~arg1 >= -1 || ~class156.field2839[arg0 + -1][arg3][arg1 - 1] == ~class156.field2839[arg0][arg3][arg1 + -1]) {
                    if (~arg3 < -1 && ~arg1 < -1 && class156.field2839[arg0 - 1][arg3 - 1][arg1 + -1] != class156.field2839[arg0][arg3 - 1][arg1 + -1]) {
                        class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3 + -1][arg1 + -1];
                        return;
                    }
                    return;
                }
                class156.field2839[arg0][arg3][arg1] = class156.field2839[arg0][arg3][arg1 - 1];
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field1490;
        if (!arg1) {
            if (~arg2 == -1) {
                this.field1496 = arg0.method1049((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIJB)Z")
    public static final boolean method548(int arg0, int arg1, long arg2, byte arg3) {
        ++field1495;
        int var5 = 31 & (int) arg2 >> 14;
        int var6 = 17 % ((31 - arg3) / 39);
        int var7 = (3393578 & (int) arg2) >> 20;
        int var8 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && var5 != 11 && var5 != 22) {
            class169.method1190(arg1, 2, var7, true, var5 + 1, (byte) 105, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, arg0, 0, 0);
        } else {
            class211 var9 = class48.method379(109, var8);
            int var10;
            int var11;
            if (~var7 != -1 && var7 != 2) {
                var10 = var9.field3814;
                var11 = var9.field3804;
            } else {
                var11 = var9.field3814;
                var10 = var9.field3804;
            }
            int var12 = var9.field3827;
            if (~var7 != -1) {
                var12 = (var12 >> -var7 + 4) + (15 & var12 << var7);
            }
            class169.method1190(arg1, 2, 0, true, 0, (byte) 101, class93.field1712.field4266[0], class93.field1712.field4259[0], var11, arg0, var10, var12);
        }
        class145.field2641 = class187.field3353;
        class137.field2472 = class41.field929;
        class166.field2997 = 2;
        class174.field3131 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    public static final void method549(int arg0, boolean arg1) {
        ++field1494;
        if (~(class93.field1712.field4244 >> 7) == ~class61.field1233 && class93.field1712.field4221 >> 7 == class193.field3448) {
            class61.field1233 = 0;
        }
        int var2 = class229.field4121;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 != 50) {
            method548(-39, -50, -71L, (byte) 88);
        }
        for (int var3 = 0; var2 > var3; ++var3) {
            long var4;
            class56 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class93.field1712;
            } else {
                var4 = (long) class139.field2539[var3] << 32;
                var6 = class43.field950[class139.field2539[var3]];
            }
            if (var6 != null && var6.method425(arg0 + -178)) {
                var6.field1125 = false;
                if ((class167.field3021 && class229.field4121 > 50 || ~class229.field4121 < -201) && !arg1 && var6.field4251 == var6.field4224) {
                    var6.field1125 = true;
                }
                int var7 = var6.field4244 >> 7;
                int var8 = var6.field4221 >> 7;
                if (~var7 <= -1 && ~var7 > -105 && var8 >= 0 && ~var8 > -105) {
                    if (var6.field1139 != null && class44.field966 >= var6.field1157 && ~class44.field966 > ~var6.field1144) {
                        var6.field1125 = false;
                        var6.field4246 = class186.method1265(true, var6.field4221, class203.field3675, var6.field4244);
                        class158.method1120(class203.field3675, var6.field4244, var6.field4221, var6.field4246, var6, var6.field4232, var4, var6.field1137, var6.field1127, var6.field1130, var6.field1140);
                    } else {
                        if (~(127 & var6.field4244) == -65 && ~(127 & var6.field4221) == -65) {
                            if (class8.field136[var7][var8] == class21.field564) {
                                continue;
                            }
                            class8.field136[var7][var8] = class21.field564;
                        }
                        var6.field4246 = class186.method1265(true, var6.field4221, class203.field3675, var6.field4244);
                        class58.method438(class203.field3675, var6.field4244, var6.field4221, var6.field4246, 60, var6, var6.field4232, var4, var6.field4223);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field1493;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (arg0 != -96) {
            return null;
        } else {
            if (super.field3013.field4085) {
                int[] var4 = this.method1186(class101.field1839 & arg1 + -1, 0, 0);
                int[] var5 = this.method1186(arg1, 0, 0);
                int[] var6 = this.method1186(arg1 + 1 & class101.field1839, arg0 ^ -96, 0);
                for (int var7 = 0; ~class115.field2146 < ~var7; ++var7) {
                    int var8 = (var5[var7 + 1 & class34.field801] + -var5[var7 + -1 & class34.field801]) * this.field1496;
                    int var9 = (var6[var7] - var4[var7]) * this.field1496;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)));
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1497 = null;
        field1488 = null;
        field1489 = null;
        field1492 = null;
        field1498 = null;
        if (arg0 > -98) {
            method549(-124, false);
        }
    }
}
