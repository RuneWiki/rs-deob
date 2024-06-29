import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class228 extends class117 {

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field4110 = 0;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    private int field4117 = 4096;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Lpg;")
    public static class81[] field4116 = new class81[2048];

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Lhh;")
    public static class163 field4114 = class137.method1065("Schrifts-=tze geladen)3", 17);

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "Lhh;")
    public static class163 field4120 = class137.method1065("", 17);

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Lhh;")
    public static class163 field4115 = class137.method1065("", 17);

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ld", name = "fb", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lv;")
    public static class22 field4108;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "[[[I")
    public static int[][][] field4107;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)I")
    public static final int method1588(int arg0, int arg1, int arg2) {
        ++field4112;
        if (~arg2 > ~arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        if (arg0 != -12021) {
            field4108 = null;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class228() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field4113;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (arg0 != -21393) {
            return null;
        } else {
            if (super.field2218.field2587) {
                int[] var4 = this.method932(arg1, false, 0);
                for (int var5 = 0; var5 < class143.field2702; ++var5) {
                    int var6 = var4[var5];
                    if (this.field4110 > var6) {
                        var3[var5] = this.field4110;
                    } else if (~var6 < ~this.field4117) {
                        var3[var5] = this.field4117;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method1589(boolean arg0) {
        field4107 = null;
        field4108 = null;
        field4120 = null;
        field4115 = null;
        if (!arg0) {
            method1591(103);
        }
        field4116 = null;
        field4114 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field4109;
        if (arg0 != 0) {
            field4120 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field2208 = arg2.method622(true) == 1;
                }
            } else {
                this.field4117 = arg2.method658(118);
            }
        } else {
            this.field4110 = arg2.method658(-92);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        ++field4111;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -81);
        if (!arg1) {
            this.method90(-75, false);
        }
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, 92, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class143.field2702 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var8[var11];
                if (var12 < this.field4110) {
                    var7[var11] = this.field4110;
                } else if (~var12 >= ~this.field4117) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field4117;
                }
                if (~var13 > ~this.field4110) {
                    var9[var11] = this.field4110;
                } else if (~var13 < ~this.field4117) {
                    var9[var11] = this.field4117;
                } else {
                    var9[var11] = var13;
                }
                if (this.field4110 <= var14) {
                    if (var14 <= this.field4117) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field4117;
                    }
                } else {
                    var10[var11] = this.field4110;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZII)V")
    public static final void method1590(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field4121;
        for (class247 var5 = (class247) class21.field334.method1017(48); var5 != null; var5 = (class247) class21.field334.method1016((byte) -31)) {
            class215.method1532(var5, arg0, 119, arg1, arg3, arg4);
        }
        for (class247 var6 = (class247) class57.field943.method1017(126); var6 != null; var6 = (class247) class57.field943.method1016((byte) -31)) {
            byte var10 = 1;
            if (var6.field4374.field3670 != var6.field4374.field3664) {
                if (var6.field4374.field3664 == var6.field4374.field3638) {
                    var10 = 2;
                }
            } else {
                var10 = 0;
            }
            if (~var6.field4344 != ~var10) {
                int var11 = class116.method926(var6.field4374, 10);
                if (var6.field4370 != var11) {
                    if (var6.field4366 != null) {
                        class225.field4085.method594(var6.field4366);
                        var6.field4366 = null;
                    }
                    var6.field4370 = var11;
                }
                var6.field4344 = var10;
            }
            var6.field4361 = var6.field4374.field3633;
            var6.field4373 = var6.field4374.field3615;
            var6.field4356 = var6.field4374.field3633 - -(var6.field4374.field3645 * 64);
            var6.field4364 = var6.field4374.field3645 * 64 + var6.field4374.field3615;
            class215.method1532(var6, arg0, 120, arg1, arg3, arg4);
        }
        if (!arg2) {
            field4107 = null;
        }
        for (class247 var7 = (class247) class39.field649.method1747((byte) 118); var7 != null; var7 = (class247) class39.field649.method1745(-32496)) {
            byte var8 = 1;
            if (var7.field4350.field3670 == var7.field4350.field3664) {
                var8 = 0;
            } else if (~var7.field4350.field3664 == ~var7.field4350.field3638) {
                var8 = 2;
            }
            if (~var7.field4344 != ~var8) {
                int var9 = class223.method1574(11770, var7.field4350);
                if (var7.field4370 != var9) {
                    if (var7.field4366 != null) {
                        class225.field4085.method594(var7.field4366);
                        var7.field4366 = null;
                    }
                    var7.field4370 = var9;
                }
                var7.field4344 = var8;
            }
            var7.field4364 = var7.field4350.field3645 * 64 + var7.field4350.field3615;
            var7.field4361 = var7.field4350.field3633;
            var7.field4373 = var7.field4350.field3615;
            var7.field4356 = var7.field4350.field3645 * 64 + var7.field4350.field3633;
            class215.method1532(var7, arg0, 103, arg1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        ++field4119;
        try {
            if (~class157.field2919 == -2) {
                int var1 = class115.field2191.method718((byte) 119);
                if (var1 > 0 && class115.field2191.method713(-1624116568)) {
                    int var2 = var1 - class75.field1404;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class115.field2191.method714(-9352, var2);
                    return;
                }
                class115.field2191.method730(true);
                class115.field2191.method715(-49);
                class145.field2760 = null;
                if (class13.field212 != null) {
                    class157.field2919 = 2;
                } else {
                    class157.field2919 = 0;
                }
                class126.field2447 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class115.field2191.method730(true);
            class13.field212 = null;
            class126.field2447 = null;
            class157.field2919 = 0;
            class145.field2760 = null;
        }
        int var4 = 31 % ((4 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lsa;Lsa;B)V")
    public static final void method1592(class137 arg0, class137 arg1, byte arg2) {
        if (arg1.field2648 != null) {
            arg1.method1063(84);
        }
        ++field4118;
        arg1.field2648 = arg0.field2648;
        arg1.field2645 = arg0;
        arg1.field2648.field2645 = arg1;
        if (arg2 < 104) {
            field4107 = null;
        }
        arg1.field2645.field2648 = arg1;
    }
}
