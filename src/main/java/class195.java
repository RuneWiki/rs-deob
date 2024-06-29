import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class195 extends class33 {

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    private int field3783 = 4096;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    private int field3790 = 409;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
    private int[] field3789 = new int[3];

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
    private int field3800 = 4096;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
    private int field3801 = 4096;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field3786 = 0;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lrd;")
    public static class173 field3787 = class133.method843("Update)2Liste geladen)3", 33);

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field3792 = 0;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "[I")
    public static int[] field3784 = new int[100];

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "Luf;")
    public static class204 field3788;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIB)I")
    public static final int method1292(int arg0, int arg1, int arg2, byte arg3) {
        ++field3791;
        if (arg3 != -15) {
            return 59;
        } else {
            if (arg0 > 243) {
                arg2 >>= 4;
            } else if (~arg0 < -218) {
                arg2 >>= 3;
            } else if (arg0 > 192) {
                arg2 >>= 2;
            } else if (arg0 > 179) {
                arg2 >>= 1;
            }
            return (arg2 >> 5 << 7) + (arg1 >> 2 << 10) + (arg0 >> 1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field3798;
        int var8 = 65 % ((32 - arg6) / 50);
        int var9 = class68.method421(arg7, class37.field790, -97, class20.field445);
        int var10 = class68.method421(arg2, class37.field790, 95, class20.field445);
        int var11 = class68.method421(arg3, class194.field3778, -59, class96.field1766);
        int var12 = class68.method421(arg4, class194.field3778, -107, class96.field1766);
        int var13 = class68.method421(arg5 + arg7, class37.field790, -95, class20.field445);
        int var14 = class68.method421(-arg5 + arg2, class37.field790, 63, class20.field445);
        for (int var15 = var9; ~var13 < ~var15; ++var15) {
            class51.method350(var11, arg0, (byte) -122, class107.field1998[var15], var12);
        }
        for (int var16 = var10; var14 < var16; --var16) {
            class51.method350(var11, arg0, (byte) -128, class107.field1998[var16], var12);
        }
        int var17 = class68.method421(arg3 + arg5, class194.field3778, 47, class96.field1766);
        int var18 = class68.method421(-arg5 + arg4, class194.field3778, -80, class96.field1766);
        for (int var19 = var13; ~var14 <= ~var19; ++var19) {
            int[] var20 = class107.field1998[var19];
            class51.method350(var11, arg0, (byte) -126, var20, var17);
            class51.method350(var17, arg1, (byte) -120, var20, var18);
            class51.method350(var18, arg0, (byte) -125, var20, var12);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 >= -99) {
            field3792 = 12;
        }
        ++field3795;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method780(16711680);
                            this.field3789[0] = class209.method1383(var5, 16711680) << 4;
                            this.field3789[2] = class209.method1383(var5 >> 12, 0);
                            this.field3789[1] = class209.method1383(var5 >> 4, 4080);
                        }
                    } else {
                        this.field3801 = arg2.method755((byte) -108);
                    }
                } else {
                    this.field3800 = arg2.method755((byte) -52);
                }
            } else {
                this.field3783 = arg2.method755((byte) -57);
            }
        } else {
            this.field3790 = arg2.method755((byte) -45);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLqf;)Lqf;")
    public static final class165 method1294(byte arg0, class165 arg1) {
        int var2 = 0 / ((-19 - arg0) / 45);
        class165 var3 = class26.method203(25485, arg1);
        ++field3794;
        if (var3 == null) {
            var3 = arg1.field3168;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)I")
    public static final int method1295(int arg0, int arg1, int arg2) {
        if (arg2 != -1140) {
            field3792 = -105;
        }
        ++field3797;
        int var3 = 1;
        while (arg1 > 1) {
            if (~(arg1 & 1) != -1) {
                var3 = arg0 * var3;
            }
            arg1 >>= 1;
            arg0 *= arg0;
        }
        if (~arg1 == -2) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method1296(boolean arg0) {
        field3788 = null;
        field3784 = null;
        if (!arg0) {
            field3784 = null;
        }
        field3787 = null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
    public static int method1297(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)Lbh;")
    public static final class19 method1298(int arg0, int arg1) {
        class19 var2 = (class19) class182.field3571.method46((long) arg1, 26580);
        ++field3793;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class216.field4179.method142(class29.method229((byte) -107, arg1), class125.method803(arg1, 255), (byte) 2);
            class19 var4 = new class19();
            var4.field391 = arg1;
            if (var3 != null) {
                var4.method165(new class121(var3), false);
            }
            var4.method174((byte) -48);
            if (~var4.field408 != 0) {
                var4.method164(-1, method1298(1639, var4.field408), method1298(arg0, var4.field421));
            }
            if (!class169.field3255 && var4.field386) {
                var4.field407 = null;
                var4.field385 = false;
                var4.field395 = null;
                var4.field399 = class131.field2482;
                var4.field389 = 0;
            }
            class182.field3571.method52(-3583, var4, (long) arg1);
            if (arg0 != 1639) {
                field3788 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field3802;
        int[][] var3 = super.field731.method1340(121, arg1);
        if (arg0 <= 112) {
            return null;
        } else {
            if (super.field731.field3925) {
                int[][] var4 = this.method259(0, -9, arg1);
                int[] var5 = var4[0];
                int[] var6 = var3[0];
                int[] var7 = var4[1];
                int[] var8 = var3[2];
                int[] var9 = var4[2];
                int[] var10 = var3[1];
                for (int var11 = 0; var11 < class117.field2173; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field3789[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~this.field3790 > ~var13) {
                        var6[var11] = var12;
                        var10[var11] = var7[var11];
                        var8[var11] = var9[var11];
                    } else {
                        int var14 = var7[var11];
                        int var15 = -this.field3789[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var15 < ~this.field3790) {
                            var6[var11] = var12;
                            var10[var11] = var14;
                            var8[var11] = var9[var11];
                        } else {
                            int var16 = var9[var11];
                            int var17 = -this.field3789[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field3790 < var17) {
                                var6[var11] = var12;
                                var10[var11] = var14;
                                var8[var11] = var16;
                            } else {
                                var6[var11] = this.field3801 * var12 >> 12;
                                var10[var11] = this.field3800 * var14 >> 12;
                                var8[var11] = this.field3783 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }
}
