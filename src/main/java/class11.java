import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class11 extends class149 {

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    private int field180 = 1024;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    private int field179 = 1024;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    private int field182 = 1024;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field169 = 819;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field173 = 1024;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    private int field172 = 409;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    private int field187 = 0;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    private int field178 = 2048;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "I")
    private int field188 = 0;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field184 = -1;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Lcm;")
    public static class449 field175 = new class449(80, 4);

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lob;")
    public static class266 field186 = new class266("RC", 1);

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "Lik;")
    public static class78 field189 = class144.method958(-13300);

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "Lcm;")
    public static class449 field190 = new class449(63, -1);

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "[[Z")
    public static boolean[][] field171;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method92(int arg0, int arg1) {
        ++field170;
        if (arg0 != -10835) {
            this.field172 = -54;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 75);
        if (super.field2152.field7051) {
            int[][] var4 = super.field2152.method2888(-128);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class316.field4838 * this.field182 >> 12;
            int var15 = class316.field4838 * this.field178 >> 12;
            int var16 = class150.field2159 * this.field172 >> 12;
            int var17 = class150.field2159 * this.field169 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field177 = class316.field4838 / 8 * this.field180 >> 12;
                int var18 = class316.field4838 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field188);
                while (true) {
                    while (true) {
                        int var22 = var14 + class455.method2740(arg0 + 10827, var21, -var14 + var15);
                        int var23 = class455.method2740(-8, var21, -var16 + var17) + var16;
                        int var24 = var8 - -var22;
                        if (~class316.field4838 > ~var24) {
                            var24 = class316.field4838;
                            var22 = class316.field4838 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (~var29 > -1) {
                                var29 += class316.field4838;
                            }
                            if (class316.field4838 < var29) {
                                var29 -= class316.field4838;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class316.field4838;
                                        }
                                        if (class316.field4838 < var31) {
                                            var31 -= class316.field4838;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class316.field4838;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method95(-var35 + var25, var7 + var38, var4, var35, arg0 ^ -14931, var21, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var23 + var25) >= ~class150.field2159) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class150.field2159;
                        }
                        if (~class316.field4838 == ~var24) {
                            this.method95(var23, var6 + var8, var4, var25, 4096, var21, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class455.method2740(arg0 + 10827, var21, class316.field4838);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class316.field4838 + var5;
                            }
                            var9 = 0;
                            if (class316.field4838 < var43) {
                                var43 -= class316.field4838;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && ~var43 >= ~var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var23 + var25;
                            var45[1] = var24;
                            var45[0] = var8;
                            this.method95(var23, var6 + var8, var4, var25, 4096, var21, var22);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLtl;)V", line = 255)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field183;
        if (arg1 != 35) {
            this.method99(-9);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field179 = arg2.method631(10494);
                                        }
                                    } else {
                                        this.field173 = arg2.method631(10494);
                                    }
                                } else {
                                    this.field187 = arg2.method618((byte) 100);
                                }
                            } else {
                                this.field180 = arg2.method631(10494);
                            }
                        } else {
                            this.field169 = arg2.method631(10494);
                        }
                    } else {
                        this.field172 = arg2.method631(arg1 + 10459);
                    }
                } else {
                    this.field178 = arg2.method631(10494);
                }
            } else {
                this.field182 = arg2.method631(10494);
            }
        } else {
            this.field188 = arg2.method618((byte) 100);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIII)V", line = 353)
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            method98(76);
        }
        ++field176;
        class377 var5 = class99.method672(arg4, false, 10);
        var5.method2340((byte) 126);
        var5.field5763 = arg3;
        var5.field5762 = arg1;
        var5.field5759 = arg2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V", line = 369)
    private final void method95(int arg0, int arg1, int[][] arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field174;
        int var8 = this.field179 > 0 ? 4096 + -class455.method2740(arg4 ^ -4104, arg5, this.field179) : 4096;
        int var9 = this.field177 * this.field173 >> 12;
        if (arg4 != 4096) {
            method97(-42, (byte) 9);
        }
        int var10 = this.field177 - (~var9 >= -1 ? 0 : class455.method2740(-8, arg5, var9));
        if (class316.field4838 <= arg1) {
            arg1 -= class316.field4838;
        }
        if (var10 <= 0) {
            if (arg1 + arg6 > class316.field4838) {
                int var11 = -arg1 + class316.field4838;
                for (int var12 = 0; arg0 > var12; ++var12) {
                    int[] var13 = arg2[arg3 - -var12];
                    class361.method2283(var13, arg1, var11, var8);
                    class361.method2283(var13, 0, -var11 + arg6, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                    class361.method2283(arg2[arg3 + var14], arg1, arg6, var8);
                }
            }
        } else if (arg0 > 0 && arg6 > 0) {
            int var15 = arg6 / 2;
            int var16 = arg0 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg1 + var17;
            int var20 = -(var17 * 2) + arg6;
            for (int var21 = 0; arg0 > var21; ++var21) {
                int[] var22 = arg2[arg3 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field187 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class494.method2942(arg1 + var24, class320.field4897)] = var22[class494.method2942(-var24 + arg6 + arg1 + -1, class320.field4897)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class494.method2942(arg1 - -var26, class320.field4897)] = var22[class494.method2942(arg6 - 1 + -var26 + arg1, class320.field4897)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) >= ~class316.field4838) {
                        class361.method2283(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class316.field4838;
                        class361.method2283(var22, var19, var27, var23);
                        class361.method2283(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg0;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field187 != 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class494.method2942(class320.field4897, arg1 + var31)] = var22[class494.method2942(class320.field4897, arg1 + arg6 - 1 + -var31)] = ~var32 <= ~var30 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class494.method2942(arg1 - -var33, class320.field4897)] = var22[class494.method2942(arg1 - -arg6 + -var33 + -1, class320.field4897)] = var30 * var35 >> 12;
                            }
                        }
                        if (class316.field4838 >= var19 + var20) {
                            class361.method2283(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class316.field4838;
                            class361.method2283(var22, var19, var34, var30);
                            class361.method2283(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class494.method2942(arg1 + var36, class320.field4897)] = var22[class494.method2942(arg1 + arg6 + -1 + -var36, class320.field4897)] = var8 * var36 / var17;
                        }
                        if (~class316.field4838 <= ~(var19 + var20)) {
                            class361.method2283(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class316.field4838;
                            class361.method2283(var22, var19, var37, var8);
                            class361.method2283(var22, 0, var20 - var37, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 567)
    public static final void method96(int arg0) {
        ++field185;
        if (class437.field6478) {
            class437.field6478 = false;
            class328.field5023 = null;
            class223.field3152 = null;
            if (arg0 != 0) {
                method98(-104);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 631)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V", line = 599)
    public static final void method97(int arg0, byte arg1) {
        ++field168;
        if (arg1 < -79) {
            if (arg0 == 37) {
                class135.field1966 = 3.0F;
            } else if (~arg0 != -51) {
                if (arg0 == 75) {
                    class135.field1966 = 6.0F;
                } else if (arg0 == 100) {
                    class135.field1966 = 8.0F;
                } else if (~arg0 == -201) {
                    class135.field1966 = 16.0F;
                }
            } else {
                class135.field1966 = 4.0F;
            }
            class276.field3835 = -1;
            class276.field3835 = -1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V", line = 634)
    public static void method98(int arg0) {
        field175 = null;
        field171 = null;
        field189 = null;
        field190 = null;
        if (arg0 == 14195) {
            field186 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 667)
    public final void method99(int arg0) {
        if (arg0 < -86) {
            ++field181;
        }
    }
}
