import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class503 extends class86 {

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "Luw;")
    public static class208 field6446 = new class208(26, 6);

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "Luw;")
    public static class208 field6448 = new class208(113, -2);

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "Lpf;")
    public static class759 field6450 = new class759();

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
    public static int[] field6451 = new int[2048];

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Z")
    public static boolean field6453;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method2787(int arg0) {
        int var2 = 32 / ((-57 - arg0) / 57);
        ++field6445;
        return !super.field1203.method2981(-14);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)I", line = 18)
    public final int method73(int arg0) {
        ++field6447;
        if (arg0 != 0) {
            field6450 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILfda;I)V", line = 33)
    public static final void method2788(int arg0, int arg1, int arg2, class381 arg3, int arg4) {
        ++field6441;
        if (arg0 > -83) {
            field6446 = null;
        }
        class68 var5 = arg3.method2169(0);
        int var6 = -arg3.field4728.field6462 + arg3.field4734 & 16383;
        if (arg4 == -1) {
            if (var6 == 0 && arg3.field4732 <= 25) {
                if (!arg3.field4715 || !var5.method395(arg3.field4696, -100)) {
                    arg3.field4696 = var5.method398(true);
                    arg3.field4715 = arg3.field4696 != -1;
                }
            } else {
                if (arg1 < 0 && ~var5.field910 != 0) {
                    arg3.field4696 = var5.field910;
                    arg3.field4715 = false;
                } else if (~arg1 < -1 && var5.field904 != -1) {
                    arg3.field4696 = var5.field904;
                } else {
                    arg3.field4696 = var5.field936;
                }
                arg3.field4715 = false;
            }
        } else if (~arg3.field4723 != 0 && (var6 >= 10240 || ~var6 >= -2049)) {
            int var7 = 16383 & class145.field1869[arg2] + -arg3.field4728.field6462;
            if (~arg4 == -3 && var5.field915 != -1) {
                if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field918 != 0) {
                    arg3.field4696 = var5.field918;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field911 != -1) {
                    arg3.field4696 = var5.field911;
                } else if (~var7 < -6145 && var7 < 10240 && ~var5.field931 != 0) {
                    arg3.field4696 = var5.field931;
                } else {
                    arg3.field4696 = var5.field915;
                }
            } else if (arg4 == 0 && ~var5.field897 != 0) {
                if (~var7 < -2049 && var7 <= 6144 && var5.field898 != -1) {
                    arg3.field4696 = var5.field898;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field890 != -1) {
                    arg3.field4696 = var5.field890;
                } else if (~var7 < -6145 && var7 < 10240 && ~var5.field894 != 0) {
                    arg3.field4696 = var5.field894;
                } else {
                    arg3.field4696 = var5.field897;
                }
            } else if (var7 > 2048 && var7 <= 6144 && ~var5.field927 != 0) {
                arg3.field4696 = var5.field927;
            } else if (var7 >= 10240 && var7 < 14336 && ~var5.field906 != 0) {
                arg3.field4696 = var5.field906;
            } else if (~var7 < -6145 && var7 < 10240 && var5.field934 != -1) {
                arg3.field4696 = var5.field934;
            } else {
                arg3.field4696 = var5.field936;
            }
            arg3.field4715 = false;
        } else if (~var6 == -1 && ~arg3.field4732 >= -26) {
            arg3.field4715 = false;
            if (~arg4 == -3 && var5.field915 != -1) {
                arg3.field4696 = var5.field915;
            } else if (~arg4 == -1 && var5.field897 != -1) {
                arg3.field4696 = var5.field897;
            } else {
                arg3.field4696 = var5.field936;
            }
        } else {
            if (~arg4 == -3 && var5.field915 != -1) {
                if (~arg1 > -1 && var5.field924 != -1) {
                    arg3.field4696 = var5.field924;
                } else if (~arg1 < -1 && ~var5.field940 != 0) {
                    arg3.field4696 = var5.field940;
                } else {
                    arg3.field4696 = var5.field915;
                }
            } else if (~arg4 == -1 && var5.field897 != -1) {
                if (arg1 < 0 && ~var5.field941 != 0) {
                    arg3.field4696 = var5.field941;
                } else if (~arg1 < -1 && ~var5.field932 != 0) {
                    arg3.field4696 = var5.field932;
                } else {
                    arg3.field4696 = var5.field897;
                }
            } else if (~arg1 > -1 && var5.field888 != -1) {
                arg3.field4696 = var5.field888;
            } else if (arg1 > 0 && var5.field914 != -1) {
                arg3.field4696 = var5.field914;
            } else {
                arg3.field4696 = var5.field936;
            }
            arg3.field4715 = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V", line = 196)
    public final void method76(int arg0, boolean arg1) {
        ++field6452;
        super.field1200 = arg0;
        if (arg1) {
            this.method73(127);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I", line = 207)
    public final int method2789(boolean arg0) {
        if (arg0) {
            method2788(-85, -116, 67, (class381) null, -55);
        }
        ++field6449;
        return super.field1200;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(ILsf;)V", line = 218)
    public class503(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)I", line = 221)
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            return -1;
        } else {
            ++field6442;
            return super.field1203.method2981(-14) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 239)
    public final void method71(byte arg0) {
        ++field6444;
        if (super.field1203.method2981(arg0 + 51)) {
            super.field1200 = 0;
        }
        if (arg0 == -65) {
            if (super.field1200 != 1 && super.field1200 != 0) {
                super.field1200 = this.method73(arg0 + 65);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 263)
    public static void method2790(int arg0) {
        field6451 = null;
        if (arg0 <= 78) {
            field6446 = null;
        }
        field6450 = null;
        field6446 = null;
        field6448 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lsf;)V", line = 276)
    public class503(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)I", line = 288)
    public static final int method2791(byte arg0) {
        ++field6443;
        if (class536.field6770 == 0) {
            class641.field8193.method3470(new class243("jaclib"), true);
            if (class641.field8193.method3471(1).method256(false) != 100) {
                return 1;
            }
            if (!((class243) class641.field8193.method3471(1)).method1598((byte) 126)) {
                class102.field1382.method3002((byte) -116);
            }
            class536.field6770 = 1;
        }
        if (~class536.field6770 == -2) {
            class374.field4582 = class641.method3468((byte) 124);
            class641.field8191.method3470(new class730(class273.field3577), true);
            class641.field8201.method3470(new class243("jaggl"), true);
            class641.field8202.method3470(new class243("jagdx"), true);
            class641.field8203.method3470(new class243("jagmisc"), true);
            class641.field8204.method3470(new class243("sw3d"), true);
            class641.field8205.method3470(new class243("hw3d"), true);
            class641.field8206.method3470(new class243("jagtheora"), true);
            class641.field8207.method3470(new class730(class790.field10813), true);
            class641.field8208.method3470(new class730(class526.field6686), true);
            class641.field8209.method3470(new class730(class735.field9972), true);
            class641.field8210.method3470(new class730(class381.field4740), true);
            class641.field8211.method3470(new class730(class151.field1918), true);
            class641.field8212.method3470(new class730(class655.field8450), true);
            class641.field8213.method3470(new class730(class410.field5436), true);
            class641.field8214.method3470(new class730(class29.field254), true);
            class641.field8215.method3470(new class730(class654.field8390), true);
            class641.field8216.method3470(new class730(class169.field2248), true);
            class641.field8217.method3470(new class730(class325.field4006), true);
            class641.field8218.method3470(new class730(class356.field4344), true);
            class641.field8219.method3470(new class730(class740.field10029), true);
            class641.field8220.method3470(new class730(class580.field7337), true);
            class641.field8221.method3470(new class540(class778.field10633, "huffman"), true);
            class641.field8222.method3470(new class730(class622.field7868), true);
            class641.field8223.method3470(new class730(class67.field884), true);
            class641.field8224.method3470(new class730(class171.field2264), true);
            class641.field8225.method3470(new class42(class162.field2163, "details"), true);
            for (int var1 = 0; ~var1 > ~class374.field4582.length; ++var1) {
                if (class374.field4582[var1].method3471(1) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class641[] var3 = class374.field4582;
            for (int var4 = 0; var3.length > var4; ++var4) {
                class641 var5 = var3[var4];
                int var6 = var5.method3467(-118);
                int var7 = var5.method3471(arg0 ^ -81).method256(false);
                var2 += var6 * var7 / 100;
            }
            class553.field7018 = var2;
            class536.field6770 = 2;
        }
        if (class374.field4582 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class641[] var11 = class374.field4582;
            for (int var12 = 0; var11.length > var12; ++var12) {
                class641 var16 = var11[var12];
                int var17 = var16.method3467(81);
                int var18 = var16.method3471(arg0 ^ -81).method256(false);
                var9 += var17 * var18 / 100;
                if (~var18 > -101) {
                    var10 = false;
                }
                var8 += var17;
            }
            if (var10) {
                if (!((class243) class641.field8203.method3471(1)).method1598((byte) -98)) {
                    class102.field1382.method3003((byte) -103);
                }
                if (!((class243) class641.field8206.method3471(1)).method1598((byte) -108)) {
                    class560.field7119 = class102.field1382.method2999(-3063);
                }
                class374.field4582 = null;
            }
            int var13 = var8 - class553.field7018;
            int var14 = var9 - class553.field7018;
            int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
            if (arg0 != -82) {
                field6450 = null;
            }
            if (!var10 && var15 > 99) {
                var15 = 99;
            }
            return var15;
        }
    }
}
