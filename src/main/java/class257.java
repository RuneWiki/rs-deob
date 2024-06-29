import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class257 extends class145 {

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
    private boolean field3470 = true;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "Z")
    private boolean field3480 = true;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field3472 = 0;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "[Z")
    public static boolean[] field3475;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 3)
    public static void method1671(int arg0) {
        if (arg0 == 0) {
            field3475 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I", line = 13)
    public static final int method1672(int arg0, int arg1) {
        ++field3478;
        double var2 = (double) (arg0 >> 16 & 255) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = (double) arg1;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 != var10) {
                if (var4 == var10) {
                    var12 = (-var2 + var6) / (-var8 + var10) + 2.0D;
                } else if (var6 == var10) {
                    var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (var4 - var6) / (var10 - var8);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 > -1) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 4;
        } else if (var22 > 217) {
            var21 >>= 3;
        } else if (var22 > 192) {
            var21 >>= 2;
        } else if (~var22 < -180) {
            var21 >>= 1;
        }
        return (var22 >> 1) + ((255 & var20) >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lap;BI)V", line = 111)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field3477;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field2205 = arg0.method1861((byte) -72) == 1;
                }
            } else {
                this.field3480 = arg0.method1861((byte) -72) == 1;
            }
        } else {
            this.field3470 = arg0.method1861((byte) -72) == 1;
        }
        int var5 = 11 / ((11 - arg1) / 52);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 531)
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZZIZIII)V", line = 171)
    public static final void method1673(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field3476;
        if (arg2 || class38.field578 != arg5 || class296.field3990 != arg3 || ~class329.field4471 != ~arg6 && !class339.method2153(9)) {
            class296.field3990 = arg3;
            class38.field578 = arg5;
            class329.field4471 = arg6;
            if (class339.method2153(9)) {
                class329.field4471 = 0;
            }
            if (!arg1) {
                class29.method340(25, (byte) -58);
            } else {
                class29.method340(28, (byte) -58);
            }
            class422.method2599(class22.field414, class338.field4607, -119, arg4);
            int var8 = class283.field3794;
            class283.field3794 = (-(class116.field1621 >> 4) + class38.field578) * 8;
            int var9 = class296.field3988;
            class296.field3988 = (-(class385.field5425 >> 4) + class296.field3990) * 8;
            class84.field1273 = class99.method833(class38.field578 * 8, class296.field3990 * 8);
            class264.field3549 = null;
            int var10 = -var8 + class283.field3794;
            int var11 = class296.field3988 - var9;
            if (!arg1) {
                for (int var12 = 0; ~var12 > -32769; ++var12) {
                    class127 var13 = class298.field4012[var12];
                    if (var13 != null) {
                        for (int var14 = 0; ~var14 > -11; ++var14) {
                            var13.field5005[var14] -= var10;
                            var13.field4998[var14] -= var11;
                        }
                        var13.field3167 -= var11 * 128;
                        var13.field3176 -= var10 * 128;
                    }
                }
            } else {
                class221.field3055 = 0;
                int var15 = class116.field1621 * 128 + -128;
                int var16 = (class385.field5425 + -1) * 128;
                for (int var17 = 0; var17 < 32768; ++var17) {
                    class127 var22 = class298.field4012[var17];
                    if (var22 != null) {
                        var22.field3176 -= var10 * 128;
                        var22.field3167 -= var11 * 128;
                        if (var22.field3176 >= 0 && ~var15 <= ~var22.field3176 && var22.field3167 >= 0 && ~var16 <= ~var22.field3167) {
                            boolean var23 = true;
                            for (int var24 = 0; ~var24 > -11; ++var24) {
                                var22.field5005[var24] -= var10;
                                var22.field4998[var24] -= var11;
                                if (~var22.field5005[var24] > -1 || ~class116.field1621 >= ~var22.field5005[var24] || var22.field4998[var24] < 0 || var22.field4998[var24] >= class385.field5425) {
                                    var23 = false;
                                }
                            }
                            if (!var23) {
                                class298.field4012[var17].method993((class15) null, 128);
                                class298.field4012[var17] = null;
                            } else {
                                class209.field2891[class221.field3055++] = var17;
                            }
                        } else {
                            class298.field4012[var17].method993((class15) null, 128);
                            class298.field4012[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class338 var20 = class220.field3044[var18];
                if (var20 != null) {
                    for (int var21 = 0; ~var21 > -11; ++var21) {
                        var20.field5005[var21] -= var10;
                        var20.field4998[var21] -= var11;
                    }
                    var20.field3167 -= var11 * 128;
                    var20.field3176 -= var10 * 128;
                }
            }
            class69.field1046 = arg6;
            class95.field1379.method2149(arg0, false, class69.field1046, 85, arg7);
            class213.method1453((byte) -58, var10, var11);
            for (class128 var19 = (class128) class399.field5584.method1240((byte) -118); var19 != null; var19 = (class128) class399.field5584.method1245(1)) {
                var19.field1816 -= var11;
                var19.field1827 -= var10;
                if (var19.field1827 < 0 || var19.field1816 < 0 || class116.field1621 <= var19.field1827 || class385.field5425 <= var19.field1816) {
                    var19.method2367(5);
                }
            }
            class384.field5399 = 0;
            if (~class338.field4605 != -1) {
                class335.field4543 -= var11;
                class338.field4605 -= var10;
            }
            if (arg1) {
                class19.field371 -= var11;
                class374.field5261 -= var11 * 128;
                class325.field4416 -= var11;
                class360.field4896 -= var10;
                class361.field4910 -= var10;
                class356.field4842 -= var10 * 128;
                if (Math.abs(var10) > class116.field1621 || ~Math.abs(var11) < ~class385.field5425) {
                    class361.method2268(111);
                }
            } else if (class184.field2675 != 4) {
                class184.field2675 = 1;
            } else {
                class325.field4411 -= var11 * 128;
                class267.field3598 -= var10 * 128;
                class153.field2327 -= var11 * 128;
                class241.field3334 -= var10 * 128;
            }
            class69.method596(123);
            class323.field4395.method1250(10346);
            class75.field1119.method1250(10346);
            class121.field1698.method894(114);
            class435.method2697(124);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[I", line = 386)
    public final int[] method3(int arg0, int arg1) {
        ++field3473;
        int[] var3 = super.field2218.method1614(55, arg0);
        int var4 = -71 / ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, this.field3480 ? -arg0 + class402.field5610 : arg0);
            if (this.field3470) {
                for (int var6 = 0; class156.field2364 > var6; ++var6) {
                    var3[var6] = var5[-var6 + class40.field606];
                }
            } else {
                class152.method1172(var5, 0, var3, 0, class156.field2364);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)Z", line = 433)
    public static final boolean method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3479;
        int var6 = arg1;
        if (arg4 != 19720) {
            return false;
        } else {
            while (~var6 >= ~arg0) {
                for (int var7 = arg5; ~var7 >= ~arg2; ++var7) {
                    if (~class183.field2660[var6][var7] == ~arg3 && class269.field3627[var6][var7] <= 1) {
                        return true;
                    }
                }
                ++var6;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)[[I", line = 466)
    public final int[][] method4(boolean arg0, int arg1) {
        ++field3474;
        if (!arg0) {
            method1673(66, true, true, 94, true, -14, 120, -102);
        }
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(!this.field3480 ? arg1 : -arg1 + class402.field5610, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3470) {
                for (int var11 = 0; ~var11 > ~class156.field2364; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class156.field2364; ++var12) {
                    var8[var12] = var5[class40.field606 - var12];
                    var9[var12] = var6[-var12 + class40.field606];
                    var10[var12] = var7[-var12 + class40.field606];
                }
            }
        }
        return var3;
    }
}
