import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class144 extends class19 {

    @OriginalMember(owner = "client!qa", name = "Dc", descriptor = "I")
    public int field3002 = -1;

    @OriginalMember(owner = "client!qa", name = "Ic", descriptor = "I")
    public int field3007 = 0;

    @OriginalMember(owner = "client!qa", name = "wc", descriptor = "I")
    public int field2995 = 0;

    @OriginalMember(owner = "client!qa", name = "Nc", descriptor = "Z")
    public boolean field3012 = false;

    @OriginalMember(owner = "client!qa", name = "Mc", descriptor = "I")
    public int field3011 = 0;

    @OriginalMember(owner = "client!qa", name = "Kc", descriptor = "I")
    public int field3009 = -1;

    @OriginalMember(owner = "client!qa", name = "Sc", descriptor = "I")
    public int field3017 = 0;

    @OriginalMember(owner = "client!qa", name = "rc", descriptor = "I")
    public int field2990 = 0;

    @OriginalMember(owner = "client!qa", name = "Ec", descriptor = "Lea;")
    private static class38 field3003 = class9.method46((byte) 117, "Loaded textures");

    @OriginalMember(owner = "client!qa", name = "Bc", descriptor = "Lea;")
    public static class38 field3000 = class9.method46((byte) 103, ")3runescape)3com");

    @OriginalMember(owner = "client!qa", name = "qc", descriptor = "Lea;")
    public static class38 field2989 = class9.method46((byte) 102, " )2> ");

    @OriginalMember(owner = "client!qa", name = "Oc", descriptor = "[I")
    public static int[] field3013 = new int[4000];

    @OriginalMember(owner = "client!qa", name = "Wc", descriptor = "Lea;")
    public static class38 field3021 = class9.method46((byte) 110, ")1p");

    @OriginalMember(owner = "client!qa", name = "Uc", descriptor = "Lea;")
    public static class38 field3019 = class9.method46((byte) 118, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!qa", name = "Vc", descriptor = "Lea;")
    public static class38 field3020 = class9.method46((byte) 117, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!qa", name = "vc", descriptor = "Lea;")
    public static class38 field2994 = field3003;

    @OriginalMember(owner = "client!qa", name = "Hc", descriptor = "I")
    public static int field3006 = -1;

    @OriginalMember(owner = "client!qa", name = "Jc", descriptor = "Lea;")
    public static class38 field3008 = class9.method46((byte) 106, "mod_icons");

    @OriginalMember(owner = "client!qa", name = "sc", descriptor = "I")
    public int field2991;

    @OriginalMember(owner = "client!qa", name = "tc", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!qa", name = "uc", descriptor = "I")
    public int field2993;

    @OriginalMember(owner = "client!qa", name = "yc", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!qa", name = "zc", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!qa", name = "Ac", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!qa", name = "Cc", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!qa", name = "Fc", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!qa", name = "Gc", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!qa", name = "Lc", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!qa", name = "Qc", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!qa", name = "Rc", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!qa", name = "Tc", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!qa", name = "bd", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!qa", name = "xc", descriptor = "Lrg;")
    public class159 field2996;

    @OriginalMember(owner = "client!qa", name = "Xc", descriptor = "Lea;")
    public class38 field3022;

    @OriginalMember(owner = "client!qa", name = "Pc", descriptor = "Lia;")
    public class73 field3014;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(Z)V")
    public static final void method1035(boolean arg0) {
        if (!arg0) {
            for (int var1 = 0; ~class177.field3593 < ~var1; ++var1) {
                int var2 = class170.field3488[var1];
                class102 var3 = class105.field2343[var2];
                if (var3 != null) {
                    class17.method98(var3.field2298.field3173, var3, 101);
                }
            }
            ++field3015;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZZII)Lk;")
    public static final class89 method1036(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        long var6 = ((long) arg4 << 16) + (((long) arg1 << 38) - -((long) arg5 << 40)) + (long) arg0;
        ++field2997;
        if (!arg3) {
            class89 var8 = (class89) class190.field3760.method1078((byte) 95, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class2 var9 = class117.method908(arg0, (byte) 93);
        if (arg4 > 1 && var9.field55 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; ++var11) {
                if (var9.field58[var11] <= arg4 && var9.field58[var11] != 0) {
                    var10 = var9.field55[var11];
                }
            }
            if (var10 != -1) {
                var9 = class117.method908(var10, (byte) 100);
            }
        }
        class159 var12 = var9.method11((byte) -107, 1);
        if (var12 == null) {
            return null;
        } else {
            class89 var13 = null;
            if (var9.field42 != -1) {
                var13 = method1036(var9.field4, 1, false, true, 10, 0);
                if (var13 == null) {
                    return null;
                }
            }
            int[] var14 = class71.field1759;
            int var15 = class71.field1755;
            int var16 = class71.field1758;
            int[] var17 = new int[4];
            class71.method574(var17);
            class89 var18 = new class89(36, 32);
            class71.method567(var18.field2045, 36, 32);
            class71.method559();
            class93.method788();
            class93.method782(16, 16);
            if (arg2) {
                field3000 = null;
            }
            class93.field2102 = false;
            int var19 = var9.field49;
            if (arg3) {
                var19 = (int) ((double) var19 * 1.5D);
            } else if (~arg1 == -3) {
                var19 = (int) ((double) var19 * 1.04D);
            }
            int var20 = class93.field2091[var9.field13] * var19 >> 16;
            int var21 = class93.field2110[var9.field13] * var19 >> 16;
            var12.method1151();
            var12.method353(0, var9.field11, var9.field97, var9.field13, var9.field20, var20 - -(var12.field1328 / 2) + var9.field87, var21 - -var9.field87);
            if (~arg1 <= -2) {
                var18.method731(1);
            }
            if (arg1 >= 2) {
                var18.method731(16777215);
            }
            if (arg5 != 0) {
                var18.method757(arg5);
            }
            class71.method567(var18.field2045, 36, 32);
            if (~var9.field42 != 0) {
                var13.method755(0, 0);
            }
            if (!arg3 && (~var9.field73 == -2 || arg4 != 1) && ~arg4 != 0) {
                class103.field2305.method646(class2.method2(arg4, false), 0, 9, 16776960, 1);
            }
            if (!arg3) {
                class190.field3760.method1076(var6, -4, var18);
            }
            class71.method567(var14, var15, var16);
            class71.method571(var17);
            class93.method788();
            class93.field2102 = true;
            return var18;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field3000 = null;
        field3008 = null;
        field2994 = null;
        field3013 = null;
        field3003 = null;
        field2989 = null;
        field3021 = null;
        field3020 = null;
        field3019 = null;
        int var1 = -27 / ((arg0 - 35) / 35);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lhc;I)V")
    public final void method1038(class66 arg0, int arg1) {
        arg0.field1620 = 0;
        int var3 = -1;
        ++field3026;
        int[] var4 = new int[12];
        int var5 = arg0.method509(126);
        this.field3002 = arg0.method513((byte) 94);
        this.field3009 = arg0.method513((byte) 111);
        this.field3017 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method509(118);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg0.method509(126);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var3 = arg0.method511(37);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var12 = class117.method908(var4[var6] + -512, (byte) 112).field84;
                    if (~var12 != -1) {
                        this.field3017 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg0.method509(117);
            if (var11 < 0 || class19.field442[var10].length <= var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field441 = arg0.method511(-119);
        if (~super.field441 == -65536) {
            super.field441 = -1;
        }
        super.field426 = arg0.method511(-123);
        if (~super.field426 == -65536) {
            super.field426 = -1;
        }
        super.field436 = super.field426;
        super.field397 = arg0.method511(-120);
        if (super.field397 == 65535) {
            super.field397 = -1;
        }
        super.field400 = arg0.method511(34);
        if (super.field400 == 65535) {
            super.field400 = -1;
        }
        super.field416 = arg0.method511(-125);
        if (super.field416 == arg1) {
            super.field416 = -1;
        }
        super.field418 = arg0.method511(43);
        if (~super.field418 == -65536) {
            super.field418 = -1;
        }
        super.field438 = arg0.method511(67);
        if (super.field438 == 65535) {
            super.field438 = -1;
        }
        this.field3022 = class143.method1034(arg1 + -65498, arg0.method502(false)).method268(70);
        this.field3007 = arg0.method509(126);
        this.field2990 = arg0.method511(-22);
        if (this.field3014 == null) {
            this.field3014 = new class73();
        }
        this.field3014.method585(var4, var5 == 1, (byte) -96, var9, var3);
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Z)Lrg;")
    public final class159 method220(boolean arg0) {
        ++field2999;
        if (this.field3014 == null) {
            return null;
        } else {
            class140 var2 = ~super.field395 != 0 && ~super.field429 == -1 ? class139.method997(-17, super.field395) : null;
            class140 var3 = super.field387 == -1 || this.field3012 || super.field441 == super.field387 && var2 != null ? null : class139.method997(123, super.field387);
            class159 var4 = this.field3014.method587(var2, super.field378, -256, super.field417, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method1151();
                super.field431 = var4.field1328;
                if (!this.field3012 && ~super.field376 != 0 && ~super.field394 != 0) {
                    class159 var5 = class177.method1224((byte) 87, super.field376).method1304(super.field394, arg0);
                    if (var5 != null) {
                        var5.method1144(0, -super.field433, 0);
                        var4 = var4.method349(var5);
                    }
                }
                if (!this.field3012 && this.field2996 != null) {
                    if (~class45.field1098 <= ~this.field2995) {
                        this.field2996 = null;
                    }
                    if (this.field3011 <= class45.field1098 && class45.field1098 < this.field2995) {
                        class159 var6 = this.field2996;
                        var6.method1144(-super.field406 + this.field3016, this.field2993 - this.field3025, -super.field382 + this.field3024);
                        if (~super.field421 == -513) {
                            var6.method1149();
                            var6.method1149();
                            var6.method1149();
                        } else if (~super.field421 != -1025) {
                            if (~super.field421 == -1537) {
                                var6.method1149();
                            }
                        } else {
                            var6.method1149();
                            var6.method1149();
                        }
                        var4 = var4.method349(var6);
                        if (super.field421 == 512) {
                            var6.method1149();
                        } else if (~super.field421 == -1025) {
                            var6.method1149();
                            var6.method1149();
                        } else if (super.field421 == 1536) {
                            var6.method1149();
                            var6.method1149();
                            var6.method1149();
                        }
                        var6.method1144(-this.field3016 + super.field406, -this.field2993 + this.field3025, -this.field3024 + super.field382);
                    }
                }
                var4.field3335 = arg0;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z")
    public final boolean method108(int arg0) {
        if (arg0 != 20542) {
            this.method108(-14);
        }
        ++field3001;
        return this.field3014 != null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Lea;")
    public static final class38 method1039(int arg0, int arg1) {
        ++field2992;
        if (arg1 <= 45) {
            method1037((byte) -86);
        }
        return ~class205.field4031[arg0].method276((byte) 38) < -1 ? class163.method1168(-4, new class38[] { class98.field2186[arg0], class101.field2248, class205.field4031[arg0] }) : class98.field2186[arg0];
    }
}
