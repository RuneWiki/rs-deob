import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class209 extends class37 {

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "[I")
    private int[] field4137 = new int[3];

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    private int field4148 = 4096;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    private int field4151 = 4096;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    private int field4150 = 4096;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field4142 = 409;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field4149 = 1;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Ldd;")
    private static class35 field4147 = class180.method1196((byte) 127, "Click to switch");

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Ldd;")
    public static class35 field4143 = field4147;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Ldd;")
    private static class35 field4135 = class180.method1196((byte) 127, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Ldd;")
    public static class35 field4140 = field4135;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Ldd;")
    private static class35 field4145 = class180.method1196((byte) -52, "Drop");

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Ldd;")
    public static class35 field4146 = field4145;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method1375(int arg0) {
        field4135 = null;
        field4146 = null;
        field4143 = null;
        if (arg0 == 2248) {
            field4147 = null;
            field4145 = null;
            field4140 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    public static final void method1376(int arg0) {
        if (arg0 > 76) {
            for (int var1 = -1; ~class72.field1714 < ~var1; ++var1) {
                int var2;
                if (var1 != -1) {
                    var2 = class35.field748[var1];
                } else {
                    var2 = 2047;
                }
                class102 var3 = class51.field1154[var2];
                if (var3 != null) {
                    class201.method1335(1, var3, 127);
                }
            }
            ++field4139;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 < 5) {
            return null;
        } else {
            int[][] var3 = super.field832.method653(-30711, arg0);
            ++field4144;
            if (super.field832.field1978) {
                int[][] var4 = this.method370(arg0, 0, 3);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class72.field1719 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var12 - this.field4137[0];
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field4142) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field4137[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~this.field4142 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field4137[2];
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field4142 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field4148 * var12 >> 12;
                                var9[var11] = this.field4150 * var14 >> 12;
                                var10[var11] = this.field4151 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public static final void method1377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; ~class137.field2935 < ~var5; ++var5) {
            if (~(class204.field4057[var5] + class146.field3083[var5]) < ~arg3 && arg1 + arg3 > class204.field4057[var5] && ~arg4 > ~(class135.field2893[var5] - -client.field627[var5]) && class135.field2893[var5] < arg4 - -arg0) {
                class158.field3228[var5] = true;
            }
        }
        if (arg2 != 5488) {
            method1377(124, -115, 6, 30, -23);
        }
        ++field4138;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
    public static final void method1378(int arg0, boolean arg1) {
        if (arg0 != 104) {
            method1375(96);
        }
        ++field4141;
        if (class71.field1704.field1664 >> 7 == class55.field1352 && ~(class71.field1704.field1676 >> 7) == ~class79.field1858) {
            class55.field1352 = 0;
        }
        int var2 = class72.field1714;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var2 > var3; ++var3) {
            long var4;
            class102 var6;
            if (!arg1) {
                var4 = (long) class35.field748[var3] << 32;
                var6 = class51.field1154[class35.field748[var3]];
            } else {
                var4 = 8791798054912L;
                var6 = class71.field1704;
            }
            if (var6 != null && var6.method169((byte) -73)) {
                int var7 = var6.field1664 >> 7;
                var6.field2288 = false;
                if ((class35.field781 && class72.field1714 > 50 || class72.field1714 > 200) && !arg1 && var6.field1658 == var6.field1645) {
                    var6.field2288 = true;
                }
                int var8 = var6.field1676 >> 7;
                if (~var7 <= -1 && var7 < 104 && ~var8 <= -1 && ~var8 > -105) {
                    if (var6.field2268 != null && var6.field2253 <= class89.field1988 && ~var6.field2276 < ~class89.field1988) {
                        var6.field2288 = false;
                        var6.field1622 = class73.method583(class175.field3585, var6.field1676, var6.field1664, (byte) 1);
                        class197.method1297(class175.field3585, var6.field1664, var6.field1676, var6.field1622, var6, var6.field1618, var4, var6.field2258, var6.field2290, var6.field2271, var6.field2291);
                    } else {
                        if (~(var6.field1664 & 127) == -65 && ~(127 & var6.field1676) == -65) {
                            if (class95.field2090[var7][var8] == class40.field890) {
                                continue;
                            }
                            class95.field2090[var7][var8] = class40.field890;
                        }
                        var6.field1622 = class73.method583(class175.field3585, var6.field1676, var6.field1664, (byte) 1);
                        class48.method430(class175.field3585, var6.field1664, var6.field1676, var6.field1622, 60, var6, var6.field1618, var4, var6.field1656);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class209() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field4136;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method232(arg1 + 123);
                            this.field4137[0] = class208.method1372(var5 << 4, 267386880);
                            this.field4137[1] = class208.method1372(var5 >> 4, 4080);
                            this.field4137[2] = class208.method1372(0, var5 >> 12);
                        }
                    } else {
                        this.field4148 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field4150 = arg2.method256((byte) -78);
                }
            } else {
                this.field4151 = arg2.method256((byte) -78);
            }
        } else {
            this.field4142 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            field4146 = null;
        }
    }
}
