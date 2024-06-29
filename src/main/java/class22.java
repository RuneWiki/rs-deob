import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class22 extends class436 {

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    private int field283 = 819;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
    private int field291 = 1024;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    private int field286 = 409;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    private int field288 = 0;

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    private int field292 = 2048;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    private int field294 = 1024;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    private int field297 = 0;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "I")
    private int field298 = 1024;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "I")
    private int field300 = 1024;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[Z")
    public static boolean[] field289 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "Z")
    public static boolean field295 = false;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static void method146(int arg0) {
        field289 = null;
        int var1 = -54 / ((20 - arg0) / 42);
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        ++field290;
        if (arg0 != -14) {
            this.field283 = 65;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lde;")
    public static final class311 method147(int arg0, int arg1) {
        ++field285;
        class311 var2 = (class311) class249.field3445.method1246((byte) -110, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class223.field3006.method1920(arg0, false, 31);
            if (arg1 != 2) {
                method146(10);
            }
            class311 var4 = new class311();
            if (var3 != null) {
                var4.method1969(new class371(var3), arg0, 114);
            }
            class249.field3445.method1247((long) arg0, (byte) 70, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field287;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field291 = arg2.method2403((byte) 70);
                                        }
                                    } else {
                                        this.field298 = arg2.method2403((byte) 124);
                                    }
                                } else {
                                    this.field297 = arg2.method2429(0);
                                }
                            } else {
                                this.field300 = arg2.method2403((byte) 118);
                            }
                        } else {
                            this.field283 = arg2.method2403((byte) 95);
                        }
                    } else {
                        this.field286 = arg2.method2403((byte) 43);
                    }
                } else {
                    this.field292 = arg2.method2403((byte) 41);
                }
            } else {
                this.field294 = arg2.method2403((byte) 54);
            }
        } else {
            this.field288 = arg2.method2429(0);
        }
        if (arg0 != 34) {
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != 18338) {
            return null;
        } else {
            ++field299;
            int[] var3 = super.field6258.method2688((byte) -69, arg0);
            if (super.field6258.field6138) {
                int[][] var4 = super.field6258.method2687(0);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class43.field653 * this.field294 >> 12;
                int var15 = class43.field653 * this.field292 >> 12;
                int var16 = class123.field1728 * this.field286 >> 12;
                int var17 = class123.field1728 * this.field283 >> 12;
                if (~var17 >= -2) {
                    return var4[arg0];
                } else {
                    this.field293 = class43.field653 / 8 * this.field300 >> 12;
                    int var18 = class43.field653 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field288);
                    while (true) {
                        while (true) {
                            int var22 = var14 + class99.method704(var21, -var14 + var15, (byte) -10);
                            int var23 = var16 + class99.method704(var21, var17 - var16, (byte) -10);
                            int var24 = var8 + var22;
                            if (~var24 < ~class43.field653) {
                                var22 = class43.field653 - var8;
                                var24 = class43.field653;
                            }
                            int var25;
                            if (var11) {
                                var25 = 0;
                            } else {
                                int var26 = var9;
                                int[] var27 = var20[var9];
                                int var28 = 0;
                                int var29 = var5 + var24;
                                if (var29 < 0) {
                                    var29 += class43.field653;
                                }
                                if (~class43.field653 > ~var29) {
                                    var29 -= class43.field653;
                                }
                                while (true) {
                                    int[] var30 = var20[var26];
                                    if (var29 >= var30[0] && var29 <= var30[1]) {
                                        var25 = var27[2];
                                        if (~var9 != ~var26) {
                                            int var31 = var8 - -var5;
                                            if (~var31 > -1) {
                                                var31 += class43.field653;
                                            }
                                            if (var31 > class43.field653) {
                                                var31 -= class43.field653;
                                            }
                                            for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                                int[] var40 = var20[(var9 - -var32) % var12];
                                                var25 = Math.max(var25, var40[2]);
                                            }
                                            for (int var33 = 0; var28 >= var33; ++var33) {
                                                int[] var34 = var20[(var9 + var33) % var12];
                                                int var35 = var34[2];
                                                if (var25 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (~var31 <= ~var29) {
                                                        if (~var36 == -1) {
                                                            var38 = Math.min(var29, var37);
                                                            var39 = 0;
                                                        } else {
                                                            var39 = Math.max(var31, var36);
                                                            var38 = class43.field653;
                                                        }
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = Math.min(var29, var37);
                                                    }
                                                    this.method148(var7 + var39, arg1 + -18432, -var35 + var25, -var39 + var38, var21, var35, var4);
                                                }
                                            }
                                        }
                                        var9 = var26;
                                        break;
                                    }
                                    ++var26;
                                    if (var12 <= var26) {
                                        var26 = 0;
                                    }
                                    ++var28;
                                }
                            }
                            if (~(var23 + var25) >= ~class123.field1728) {
                                var10 = false;
                            } else {
                                var23 = -var25 + class123.field1728;
                            }
                            if (class43.field653 != var24) {
                                int[] var41 = var19[var13++];
                                var41[1] = var24;
                                var41[0] = var8;
                                var41[2] = var23 + var25;
                                this.method148(var6 + var8, arg1 + -18372, var23, var22, var21, var25, var4);
                                var8 = var24;
                            } else {
                                this.method148(var6 + var8, -121, var23, var22, var21, var25, var4);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var42 = var19[var13++];
                                var42[1] = var24;
                                var42[2] = var23 + var25;
                                var42[0] = var8;
                                int[][] var43 = var20;
                                var20 = var19;
                                var12 = var13;
                                var19 = var43;
                                var13 = 0;
                                var7 = var6;
                                var6 = class99.method704(var21, class43.field653, (byte) -10);
                                var8 = 0;
                                var5 = var6 - var7;
                                int var44 = var5;
                                if (~var5 > -1) {
                                    var44 = class43.field653 + var5;
                                }
                                var9 = 0;
                                if (~var44 < ~class43.field653) {
                                    var44 -= class43.field653;
                                }
                                while (true) {
                                    int[] var45 = var20[var9];
                                    if (~var44 <= ~var45[0] && var45[1] >= var44) {
                                        var11 = false;
                                        break;
                                    }
                                    ++var9;
                                    if (~var9 <= ~var12) {
                                        var9 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIILjava/util/Random;I[[I)V")
    private final void method148(int arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int[][] arg6) {
        ++field296;
        int var8 = ~this.field291 >= -1 ? 4096 : 4096 + -class99.method704(arg4, this.field291, (byte) -10);
        int var9 = -23 % ((37 - arg1) / 60);
        int var10 = this.field298 * this.field293 >> 12;
        int var11 = this.field293 + -(var10 > 0 ? class99.method704(arg4, var10, (byte) -10) : 0);
        if (~class43.field653 >= ~arg0) {
            arg0 -= class43.field653;
        }
        if (var11 <= 0) {
            if (class43.field653 < arg0 + arg3) {
                int var12 = -arg0 + class43.field653;
                for (int var13 = 0; arg2 > var13; ++var13) {
                    int[] var14 = arg6[arg5 - -var13];
                    class150.method1021(var14, arg0, var12, var8);
                    class150.method1021(var14, 0, arg3 - var12, var8);
                }
            } else {
                for (int var15 = 0; ~var15 > ~arg2; ++var15) {
                    class150.method1021(arg6[arg5 - -var15], arg0, arg3, var8);
                }
            }
        } else if (~arg2 < -1 && ~arg3 < -1) {
            int var16 = arg3 / 2;
            int var17 = arg2 / 2;
            int var18 = var16 < var11 ? var16 : var11;
            int var19 = var17 >= var11 ? var11 : var17;
            int var20 = arg0 - -var18;
            int var21 = -(var18 * 2) + arg3;
            for (int var22 = 0; var22 < arg2; ++var22) {
                int[] var23 = arg6[arg5 + var22];
                if (var22 < var19) {
                    int var24 = var8 * var22 / var19;
                    if (~this.field297 != -1) {
                        for (int var25 = 0; var18 > var25; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class318.method2028(arg0 - -var25, class278.field3758)] = var23[class318.method2028(arg0 + arg3 - (var25 + 1), class278.field3758)] = ~var24 >= ~var26 ? var24 : var26;
                        }
                    } else {
                        for (int var27 = 0; var18 > var27; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class318.method2028(arg0 + var27, class278.field3758)] = var23[class318.method2028(class278.field3758, arg0 + arg3 + -var27 + -1)] = var24 * var29 >> 12;
                        }
                    }
                    if (var20 + var21 > class43.field653) {
                        int var28 = -var20 + class43.field653;
                        class150.method1021(var23, var20, var28, var24);
                        class150.method1021(var23, 0, var21 - var28, var24);
                    } else {
                        class150.method1021(var23, var20, var21, var24);
                    }
                } else {
                    int var30 = arg2 - (var22 + 1);
                    if (var19 > var30) {
                        int var31 = var8 * var30 / var19;
                        if (~this.field297 == -1) {
                            for (int var32 = 0; var32 < var18; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class318.method2028(arg0 + var32, class278.field3758)] = var23[class318.method2028(arg0 - (-arg3 - -var32) + -1, class278.field3758)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; ~var18 < ~var34; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class318.method2028(class278.field3758, arg0 + var34)] = var23[class318.method2028(-var34 + -1 + arg0 + arg3, class278.field3758)] = ~var31 >= ~var36 ? var31 : var36;
                            }
                        }
                        if (~class43.field653 > ~(var20 + var21)) {
                            int var35 = class43.field653 - var20;
                            class150.method1021(var23, var20, var35, var31);
                            class150.method1021(var23, 0, -var35 + var21, var31);
                        } else {
                            class150.method1021(var23, var20, var21, var31);
                        }
                    } else {
                        for (int var37 = 0; var18 > var37; ++var37) {
                            var23[class318.method2028(arg0 - -var37, class278.field3758)] = var23[class318.method2028(class278.field3758, arg3 + -1 + arg0 + -var37)] = var8 * var37 / var18;
                        }
                        if (~class43.field653 > ~(var20 - -var21)) {
                            int var38 = -var20 + class43.field653;
                            class150.method1021(var23, var20, var38, var8);
                            class150.method1021(var23, 0, -var38 + var21, var8);
                        } else {
                            class150.method1021(var23, var20, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V")
    public static final void method149(int arg0, boolean arg1) {
        if (arg0 <= -33) {
            ++field284;
            if (!class364.field5105 == arg1) {
                class364.field5105 = arg1;
                class64.method438((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class22() {
        super(0, true);
    }
}
