import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class458 extends class649 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lih;")
    public static class741 field6650;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method2799(byte arg0) {
        ++field6648;
        if (class654.field9289.field5404.method136(3) == 2) {
            byte var1 = (byte) (class475.field6901 - 4 & 255);
            int var2 = class475.field6901 % class191.field3229;
            for (int var3 = 0; ~var3 > -5; ++var3) {
                for (int var19 = 0; ~class314.field4720 < ~var19; ++var19) {
                    class327.field4817[var3][var2][var19] = var1;
                }
            }
            if (class582.field8234 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class596.field8450[var4] = -1000000;
                    class642.field9111[var4] = 1000000;
                    class670.field9489[var4] = 0;
                    class555.field7915[var4] = 1000000;
                    class311.field4689[var4] = 0;
                }
                int var5 = 93 / ((arg0 - -17) / 32);
                int var6 = class145.field2251.field9477;
                int var7 = class145.field2251.field9475;
                if (class639.field8978 != 1 && class87.field1279 == -1) {
                    int var8 = class232.method1611(class329.field4857, class497.field7212, class582.field8234, (byte) 100);
                    if (~(-class101.field1507 + var8) > -3201 && ~(4 & class434.field6341[class582.field8234][class497.field7212 >> 9][class329.field4857 >> 9]) != -1) {
                        class273.method1795(class329.field4857 >> 9, false, class497.field7212 >> 9, 1, (byte) 124, class488.field7062);
                        return;
                    }
                } else {
                    if (class639.field8978 != 1) {
                        var6 = class87.field1279;
                        var7 = class275.field4202;
                    }
                    if (~(class434.field6341[class582.field8234][var6 >> 9][var7 >> 9] & 4) != -1) {
                        class273.method1795(var7 >> 9, false, var6 >> 9, 0, (byte) 126, class488.field7062);
                    }
                    if (~class81.field1167 > -2561) {
                        int var9 = class497.field7212 >> 9;
                        int var10 = class329.field4857 >> 9;
                        int var11 = var6 >> 9;
                        int var12 = var7 >> 9;
                        int var13;
                        if (var11 > var9) {
                            var13 = -var9 + var11;
                        } else {
                            var13 = -var11 + var9;
                        }
                        int var14;
                        if (~var10 > ~var12) {
                            var14 = -var10 + var12;
                        } else {
                            var14 = var10 - var12;
                        }
                        if ((var13 != 0 || var14 != 0) && -class191.field3229 < var13 && var13 < class191.field3229 && var14 > -class314.field4720 && class314.field4720 > var14) {
                            if (~var13 >= ~var14) {
                                int var15 = var13 * 65536 / var14;
                                int var16 = 32768;
                                while (~var10 != ~var12) {
                                    if (~var12 < ~var10) {
                                        ++var10;
                                    } else if (var12 < var10) {
                                        --var10;
                                    }
                                    if ((4 & class434.field6341[class582.field8234][var9][var10]) != 0) {
                                        class273.method1795(var10, false, var9, 1, (byte) 104, class488.field7062);
                                        return;
                                    }
                                    var16 += var15;
                                    if (~var16 <= -65537) {
                                        if (~var11 < ~var9) {
                                            ++var9;
                                        } else if (var11 < var9) {
                                            --var9;
                                        }
                                        var16 -= 65536;
                                        if ((class434.field6341[class582.field8234][var9][var10] & 4) != 0) {
                                            class273.method1795(var10, false, var9, 1, (byte) 104, class488.field7062);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var17 = var14 * 65536 / var13;
                            int var18 = 32768;
                            while (var9 != var11) {
                                if (var9 >= var11) {
                                    if (~var11 > ~var9) {
                                        --var9;
                                    }
                                } else {
                                    ++var9;
                                }
                                if ((4 & class434.field6341[class582.field8234][var9][var10]) != 0) {
                                    class273.method1795(var10, false, var9, 1, (byte) 119, class488.field7062);
                                    return;
                                }
                                var18 += var17;
                                if (~var18 <= -65537) {
                                    var18 -= 65536;
                                    if (~var12 < ~var10) {
                                        ++var10;
                                    } else if (var12 < var10) {
                                        --var10;
                                    }
                                    if (~(class434.field6341[class582.field8234][var9][var10] & 4) != -1) {
                                        class273.method1795(var10, false, var9, 1, (byte) 109, class488.field7062);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class333.method2135((Throwable) null, "RC: " + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class265.field4123 + "," + class723.field10155, -90);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 <= -120) {
            ++field6643;
            super.field9223 = arg0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public static final void method2800(int arg0) {
        ++field6640;
        int var1 = arg0;
        for (int var2 = 0; class191.field3229 > var2; ++var2) {
            for (int var3 = 0; class314.field4720 > var3; ++var3) {
                if (class273.method1795(var3, true, var2, var1, (byte) 111, class488.field7062)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)I")
    public final int method2801(int arg0) {
        if (arg0 != 3) {
            return -120;
        } else {
            ++field6647;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field6654;
        if (arg0 != 1) {
            this.method2801(3);
        }
        if (super.field9224.method2294((byte) -116)) {
            super.field9223 = 0;
        }
        if (super.field9224.field5448.method3596(3) == 0) {
            super.field9223 = 0;
        }
        if (~super.field9223 > -1 || super.field9223 > 2) {
            super.field9223 = this.method135(arg0 + 72);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
    public static final int method2802(int arg0, int arg1) {
        ++field6651;
        if (arg0 != -1791676761) {
            field6645 = -100;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public static void method2803(byte arg0) {
        field6650 = null;
        if (arg0 != 80) {
            field6645 = 23;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static final void method2804(int arg0) {
        ++field6642;
        class599.method3443(true);
        if (arg0 == 255) {
            class193.field3337 = null;
            class121.field1865 = null;
            class103.field1529 = null;
            class565.field8015 = null;
            class142.field2217 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lhs;)V")
    public class458(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpe;B)V")
    public static final void method2805(class109 arg0, byte arg1) {
        ++field6649;
        if (arg1 != 102) {
            field6645 = 114;
        }
        boolean var2 = false;
        if (class199.field3403 != arg0.field1660 && arg0.field1695 != -1 && arg0.field1686 == 0) {
            class82 var3 = class83.field1219.method2358((byte) 88, arg0.field1695);
            if (var3.field1184 || arg0.field1600 - -1 > var3.field1211[arg0.field1626]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg0.field1645 + arg0.field1660;
            int var5 = class199.field3403 - arg0.field1645;
            int var6 = arg0.field1608 * 512 - -(256 * arg0.method878(-5740));
            int var7 = arg0.field1619 * 512 + 256 * arg0.method878(arg1 ^ -5646);
            int var8 = arg0.field1685 * 512 - -(256 * arg0.method878(-5740));
            int var9 = arg0.field1592 * 512 + 256 * arg0.method878(-5740);
            arg0.field9477 = ((-var5 + var4) * var6 + var5 * var8) / var4;
            arg0.field9475 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field1703 = 0;
        if (~arg0.field1666 == -1) {
            arg0.method884(false, 8192, 30934);
        }
        if (~arg0.field1666 == -2) {
            arg0.method884(false, 12288, 30934);
        }
        if (~arg0.field1666 == -3) {
            arg0.method884(false, 0, 30934);
        }
        if (arg0.field1666 == 3) {
            arg0.method884(false, 4096, 30934);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(ILhs;)V")
    public class458(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static final void method2806(int arg0) {
        ++field6652;
        class186.field3110.method76(-92);
        int var1 = -103 / ((arg0 - -8) / 33);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field6644;
        int var2 = -34 / ((-18 - arg0) / 50);
        return 2;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)V")
    public static final void method2807(int arg0, int arg1) {
        ++field6646;
        class118 var2 = class86.method755(true, 17, arg1);
        var2.method936(0);
        if (arg0 != 32768) {
            field6645 = -112;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field6653;
        if (arg0 != 18648) {
            field6650 = null;
        }
        if (super.field9224.method2294((byte) -121)) {
            return 3;
        } else {
            return ~super.field9224.field5448.method3596(3) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)Z")
    public final boolean method2808(int arg0) {
        ++field6641;
        if (super.field9224.method2294((byte) -106)) {
            return false;
        } else if (~super.field9224.field5448.method3596(3) == -1) {
            return false;
        } else {
            return arg0 == -16181;
        }
    }
}
