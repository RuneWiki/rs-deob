import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class289 extends class215 {

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    private int field4611 = 32768;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "Z")
    public static boolean field4601 = false;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field4602 = -1;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Z")
    public static volatile boolean field4603 = false;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "Ljj;")
    public static class40 field4609;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "[[[I")
    public static int[][][] field4604;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        class247.method1716(arg0 ^ -305);
        ++field4606;
        if (arg0 != -49) {
            method1946((class230) null, 122);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)La;")
    public static final class245 method1942(boolean arg0, int arg1) {
        if (!arg0) {
            field4609 = null;
        }
        ++field4607;
        class245 var2 = (class245) class14.field175.method1469(8288, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class210.field3375.method928(arg1, (byte) 109, 0);
            if (var3 == null) {
                return null;
            } else {
                class245 var4 = new class245();
                class96 var5 = new class96(var3);
                var5.field1228 = var5.field1218.length + -2;
                int var6 = var5.method549(255);
                int var7 = var5.field1218.length - var6 + -14;
                var5.field1228 = var7;
                int var8 = var5.method597(-1197332568);
                var4.field4030 = var5.method549(255);
                var4.field4027 = var5.method549(255);
                var4.field4025 = var5.method549(255);
                var4.field4024 = var5.method549(255);
                int var9 = var5.method584(255);
                if (~var9 < -1) {
                    var4.field4028 = new class110[var9];
                    for (int var10 = 0; var9 > var10; ++var10) {
                        int var11 = var5.method549(255);
                        class110 var12 = new class110(class137.method923(-113, var11));
                        var4.field4028[var10] = var12;
                        while (var11-- > 0) {
                            int var13 = var5.method597(-1197332568);
                            int var14 = var5.method597(-1197332568);
                            var12.method707((long) var13, new class122(var14), (byte) 120);
                        }
                    }
                }
                var5.field1228 = 0;
                var4.field4019 = var5.method538((byte) -97);
                int var15 = 0;
                var4.field4020 = new String[var8];
                var4.field4022 = new int[var8];
                var4.field4032 = new int[var8];
                while (var5.field1228 < var7) {
                    int var16 = var5.method549(255);
                    if (~var16 != -4) {
                        if (~var16 > -101 && ~var16 != -22 && ~var16 != -39 && ~var16 != -40) {
                            var4.field4022[var15] = var5.method597(-1197332568);
                        } else {
                            var4.field4022[var15] = var5.method584(255);
                        }
                    } else {
                        var4.field4020[var15] = var5.method588(false).intern();
                    }
                    var4.field4032[var15++] = var16;
                }
                class14.field175.method1467((byte) -119, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = super.field3445.method1755(arg0, (byte) 99);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(-1, 1, arg0);
            int[] var5 = this.method1503(-1, 2, arg0);
            for (int var6 = 0; class244.field4015 > var6; ++var6) {
                int var7 = (var4[var6] & 4092) >> 4;
                int var8 = var5[var6] * this.field4611 >> 12;
                int var9 = class36.field468[var7] * var8 >> 12;
                int var10 = class177.field2810[var7] * var8 >> 12;
                int var11 = (var10 >> 12) + arg0 & class83.field1026;
                int var12 = class118.field1673 & (var9 >> 12) + var6;
                int[] var13 = this.method1503(arg1 + -256, 0, var11);
                var3[var6] = var13[var12];
            }
        }
        ++field4608;
        if (arg1 != 255) {
            this.method45(74, -44, (class96) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg0 != 1521146348) {
            method1947(-80);
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field3453 = ~arg2.method584(arg0 + -1521146093) == -2;
            }
        } else {
            this.field4611 = arg2.method549(arg0 ^ 1521146131) << 4;
        }
        ++field4612;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lec;ZZ)V")
    public static final void method1943(class86 arg0, boolean arg1, boolean arg2) {
        ++field4605;
        int var3 = arg0.field1064;
        if (arg1) {
            method1946((class230) null, -80);
        }
        int var4 = (int) arg0.field3923;
        arg0.method1673(14510);
        if (arg2) {
            class14.method74(var3, true);
        }
        class19.method107(-24783, var3);
        class123 var5 = class61.method358(var4, -123);
        if (var5 != null) {
            class129.method875((byte) -21, var5);
        }
        int var6 = class34.field437;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class179.method1246((byte) 126, class155.field2423[var7])) {
                class44.method243(var7, -16729);
            }
        }
        if (~class34.field437 != -2) {
            class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
            int var8 = class280.field4439.method692(class2.field11);
            for (int var9 = 0; ~var9 > ~class34.field437; ++var9) {
                int var10 = class280.field4439.method692(class132.method895(var9, 0));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class67.field850 = class34.field437 * 15 - -(class164.field2607 ? 26 : 22);
            class103.field1392 = var8 + 8;
        } else {
            class262.field4250 = false;
            class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
        }
        if (~class164.field2602 != 0) {
            class185.method1294(-95, 1, class164.field2602);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
    public static final int method1944(int arg0, byte arg1) {
        if (arg1 != -40) {
            field4602 = 123;
        }
        ++field4614;
        if (arg0 > 0) {
            return 1;
        } else {
            return ~arg0 > -1 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class289() {
        super(3, false);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field4613;
        if (arg0 != -1) {
            field4602 = -17;
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[] var4 = this.method1503(-1, 1, arg1);
            int[] var5 = this.method1503(-1, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; class244.field4015 > var9; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field4611 >> 12;
                int var12 = class36.field468[var10] * var11 >> 12;
                int var13 = class177.field2810[var10] * var11 >> 12;
                int var14 = (var13 >> 12) + arg1 & class83.field1026;
                int var15 = (var12 >> 12) + var9 & class118.field1673;
                int[][] var16 = this.method1504(-117, 0, var14);
                var6[var9] = var16[0][var15];
                var8[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)Lef;")
    public static final class187 method1945(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = var3.field4046;
            var3.field4046 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lid;I)V")
    public static final void method1946(class230 arg0, int arg1) {
        if (arg1 == -2) {
            ++field4610;
            class154 var2 = arg0.method1636(0);
            arg0.field3793 = var2.field2405;
            if (arg0.field3791 != 0) {
                if (arg0.field3827 != -1 && ~arg0.field3765 == -1) {
                    class165 var3 = class208.method1458((byte) 104, arg0.field3827);
                    if (arg0.field3784 > 0 && ~var3.field2649 == -1) {
                        ++arg0.field3821;
                        return;
                    }
                    if (arg0.field3784 <= 0 && var3.field2619 == 0) {
                        ++arg0.field3821;
                        return;
                    }
                }
                if (~arg0.field3757 != 0 && arg0.field3779 <= class73.field924) {
                    class98 var4 = class79.method440(arg0.field3757, (byte) 14);
                    if (var4.field1311 && var4.field1318 != -1) {
                        class165 var5 = class208.method1458((byte) -114, var4.field1318);
                        if (arg0.field3784 > 0 && ~var5.field2649 == -1) {
                            ++arg0.field3821;
                            return;
                        }
                        if (~arg0.field3784 >= -1 && var5.field2619 == 0) {
                            ++arg0.field3821;
                            return;
                        }
                    }
                }
                int var6 = arg0.field3818;
                int var7 = arg0.field3820;
                int var8 = arg0.field3829[arg0.field3791 + -1] * 128 + 64 * arg0.method1638(arg1 ^ 6377);
                int var9 = arg0.field3836[arg0.field3791 + -1] * 128 + 64 * arg0.method1638(-6377);
                if (~(-var6 + var8) < -257 || var8 - var6 < -256 || var9 - var7 > 256 || ~(var9 - var7) > 255) {
                    arg0.field3818 = var8;
                    arg0.field3820 = var9;
                    return;
                }
                if (~var8 >= ~var6) {
                    if (var6 <= var8) {
                        if (~var9 < ~var7) {
                            arg0.field3835 = 1024;
                        } else if (var7 > var9) {
                            arg0.field3835 = 0;
                        }
                    } else if (~var7 > ~var9) {
                        arg0.field3835 = 768;
                    } else if (~var9 > ~var7) {
                        arg0.field3835 = 256;
                    } else {
                        arg0.field3835 = 512;
                    }
                } else if (~var9 < ~var7) {
                    arg0.field3835 = 1280;
                } else if (var9 >= var7) {
                    arg0.field3835 = 1536;
                } else {
                    arg0.field3835 = 1792;
                }
                int var10 = var2.field2394;
                int var11 = 4;
                int var12 = 2047 & -arg0.field3751 + arg0.field3835;
                byte var13 = 1;
                boolean var14 = true;
                if (~var12 < -1025) {
                    var12 -= 2048;
                }
                if (~var12 <= 255 && ~var12 >= -257) {
                    var10 = var2.field2396;
                } else if (~var12 <= -257 && var12 < 768) {
                    var10 = var2.field2412;
                } else if (~var12 <= 767 && ~var12 >= 255) {
                    var10 = var2.field2380;
                }
                if (~var10 == 0) {
                    var10 = var2.field2396;
                }
                arg0.field3793 = var10;
                if (arg0 instanceof class200) {
                    var14 = ((class200) arg0).field3166.field3045;
                }
                if (!var14) {
                    if (~arg0.field3791 < -2) {
                        var11 = 6;
                    }
                    if (arg0.field3791 > 2) {
                        var11 = 8;
                    }
                    if (arg0.field3821 > 0 && arg0.field3791 > 1) {
                        var11 = 8;
                        --arg0.field3821;
                    }
                } else {
                    if (~arg0.field3835 != ~arg0.field3751 && ~arg0.field3812 == 0 && arg0.field3769 != 0) {
                        var11 = 2;
                    }
                    if (~arg0.field3791 < -3) {
                        var11 = 6;
                    }
                    if (~arg0.field3791 < -4) {
                        var11 = 8;
                    }
                    if (arg0.field3821 > 0 && ~arg0.field3791 < -2) {
                        --arg0.field3821;
                        var11 = 8;
                    }
                }
                if (arg0.field3756[arg0.field3791 + -1] == 2) {
                    var11 <<= 1;
                    var13 = 2;
                } else if (~arg0.field3756[arg0.field3791 + -1] == -1) {
                    var11 >>= 1;
                    var13 = 0;
                }
                if (var11 >= 8 && var2.field2385 != -1) {
                    if (~arg0.field3793 == ~var2.field2394 && var2.field2382 != -1) {
                        arg0.field3793 = var2.field2382;
                    } else if (~arg0.field3793 == ~var2.field2380 && var2.field2389 != -1) {
                        arg0.field3793 = var2.field2389;
                    } else if (arg0.field3793 == var2.field2412 && ~var2.field2397 != 0) {
                        arg0.field3793 = var2.field2397;
                    } else {
                        arg0.field3793 = var2.field2385;
                    }
                } else if (~var2.field2390 != 0 && ~var13 == -1) {
                    if (arg0.field3793 == var2.field2394 && var2.field2416 != -1) {
                        arg0.field3793 = var2.field2416;
                    } else if (arg0.field3793 == var2.field2380 && var2.field2400 != -1) {
                        arg0.field3793 = var2.field2400;
                    } else if (~arg0.field3793 == ~var2.field2412 && ~var2.field2421 != 0) {
                        arg0.field3793 = var2.field2421;
                    } else {
                        arg0.field3793 = var2.field2390;
                    }
                }
                if (var2.field2391 != -1) {
                    int var15 = var11 << 7;
                    if (~arg0.field3791 == -2) {
                        int var16 = (~var9 > ~arg0.field3820 ? arg0.field3820 - var9 : -arg0.field3820 + var9) << 7;
                        int var17 = arg0.field3802 * arg0.field3802;
                        int var18 = (~var8 <= ~arg0.field3818 ? var8 - arg0.field3818 : -var8 + arg0.field3818) << 7;
                        int var19 = ~var16 <= ~var18 ? var16 : var18;
                        int var20 = var2.field2391 * 2 * var19;
                        if (var20 >= var17) {
                            if (var19 >= var17 / 2) {
                                if (~arg0.field3802 > ~var15) {
                                    arg0.field3802 += var2.field2391;
                                    if (arg0.field3802 > var15) {
                                        arg0.field3802 = var15;
                                    }
                                }
                            } else {
                                arg0.field3802 -= var2.field2391;
                                if (~arg0.field3802 > -1) {
                                    arg0.field3802 = 0;
                                }
                            }
                        } else {
                            arg0.field3802 /= 2;
                        }
                    } else if (arg0.field3802 >= var15) {
                        if (arg0.field3802 > 0) {
                            arg0.field3802 -= var2.field2391;
                            if (~arg0.field3802 > -1) {
                                arg0.field3802 = 0;
                            }
                        }
                    } else {
                        arg0.field3802 += var2.field2391;
                        if (~arg0.field3802 < ~var15) {
                            arg0.field3802 = var15;
                        }
                    }
                    var11 = arg0.field3802 >> 7;
                    if (var11 < 1) {
                        var11 = 1;
                    }
                }
                if (var8 <= var6) {
                    if (~var8 > ~var6) {
                        arg0.field3818 -= var11;
                        if (~var8 < ~arg0.field3818) {
                            arg0.field3818 = var8;
                        }
                    }
                } else {
                    arg0.field3818 += var11;
                    if (var8 < arg0.field3818) {
                        arg0.field3818 = var8;
                    }
                }
                if (~var9 < ~var7) {
                    arg0.field3820 += var11;
                    if (~arg0.field3820 < ~var9) {
                        arg0.field3820 = var9;
                    }
                } else if (~var7 < ~var9) {
                    arg0.field3820 -= var11;
                    if (arg0.field3820 < var9) {
                        arg0.field3820 = var9;
                    }
                }
                if (~arg0.field3818 == ~var8 && ~arg0.field3820 == ~var9) {
                    --arg0.field3791;
                    if (~arg0.field3784 < -1) {
                        --arg0.field3784;
                        return;
                    }
                }
            } else {
                arg0.field3821 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field4604 = null;
        field4609 = null;
        if (arg0 != -1) {
            method1945(93, -33, -95);
        }
    }
}
