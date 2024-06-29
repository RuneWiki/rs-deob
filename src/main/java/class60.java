import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class60 extends class89 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    private int field1008 = 3072;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    private int field1004 = 2048;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field1010 = 1024;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1009 = 0;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lda;")
    public static class275 field1011 = class255.method1672(103, "Cabbage");

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "Lda;")
    public static class275 field1003 = class255.method1672(102, "leuchten1:");

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Z")
    public static boolean field1012 = false;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lda;")
    public static class275 field1005 = class255.method1672(102, "k");

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method377(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1017;
        if (class267.method1755(0, arg1)) {
            int var5 = 17 % ((33 - arg0) / 40);
            class93.method671(arg2, arg3, false, arg4, class173.field3005[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method378(boolean arg0) {
        field1005 = null;
        field1003 = null;
        field1011 = null;
        if (arg0) {
            field1012 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        this.field1004 = -this.field1010 + this.field1008;
        if (arg0 != 1) {
            this.method239(76, false);
        }
        ++field1013;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field1002;
        if (!arg0) {
            field1016 = -5;
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(arg0, 0, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class65.field1070 < ~var11; ++var11) {
                var9[var11] = this.field1010 - -(var7[var11] * this.field1004 >> 12);
                var8[var11] = (var6[var11] * this.field1004 >> 12) + this.field1010;
                var10[var11] = (var5[var11] * this.field1004 >> 12) + this.field1010;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 == -20503) {
            ++field1015;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        super.field1508 = arg1.method564((byte) 101) == 1;
                    }
                } else {
                    this.field1008 = arg1.method608(arg0 + 20603);
                }
            } else {
                this.field1010 = arg1.method608(118);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field1014;
        if (arg1) {
            method380((byte) -30, (class85) null);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -92);
        if (super.field1503.field664) {
            int[] var4 = this.method645(-25, 0, arg0);
            for (int var5 = 0; ~var5 > ~class65.field1070; ++var5) {
                var3[var5] = this.field1010 - -(var4[var5] * this.field1004 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)V")
    public static final void method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1007;
        class184 var5 = class147.method1044(10, (byte) 100, arg2);
        var5.method1226((byte) 26);
        var5.field3145 = arg1;
        var5.field3151 = arg4;
        var5.field3148 = arg0;
        if (arg3 < 10) {
            method380((byte) -123, (class85) null);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLij;)V")
    public static final void method380(byte arg0, class85 arg1) {
        ++field1006;
        int var2 = class135.field2388 >> 2 << 10;
        int var3 = class235.field4095 >> 1;
        byte[][] var4 = new byte[class255.field4497][class5.field67];
        while (arg1.field1381.length > arg1.field1392) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (~arg1.method564((byte) 57) == -2) {
                var34 = true;
                var35 = arg1.method564((byte) 99);
                var33 = arg1.method564((byte) 101);
            }
            int var36 = arg1.method564((byte) 71);
            int var37 = arg1.method564((byte) 104);
            int var38 = class5.field67 + -1 - (var37 * 64 + -class106.field1841);
            int var39 = var36 * 64 + -class18.field255;
            if (~var39 <= -1 && ~(var38 + -63) <= -1 && class255.field4497 > var39 + 63 && ~var38 > ~class5.field67) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; ++var42) {
                        if (!var34 || var35 * 8 <= var40 && ~var40 > ~(var35 * 8 + 8) && var33 * 8 <= var42 && var42 < var33 * 8 + 8) {
                            var41[-var42 + var38] = arg1.method581(8);
                        }
                    }
                }
            } else if (var34) {
                arg1.field1392 += 64;
            } else {
                arg1.field1392 += 4096;
            }
        }
        if (arg0 <= 55) {
            method377(86, -57, -8, 112, false);
        }
        int var5 = class5.field67;
        int[] var6 = new int[var5];
        int var7 = class255.field4497;
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        for (int var12 = -5; ~var7 < ~var12; ++var12) {
            for (int var13 = 0; ~var5 < ~var13; ++var13) {
                int var27 = var12 + 5;
                int var10002;
                if (~var27 > ~var7) {
                    int var28 = var4[var27][var13] & 255;
                    if (~var28 < -1) {
                        class35 var29 = class57.method357(var28 + -1, true);
                        var6[var13] += var29.field572;
                        var10[var13] += var29.field569;
                        var9[var13] += var29.field563;
                        var11[var13] += var29.field581;
                        var10002 = var8[var13]++;
                    }
                }
                int var30 = var12 + -5;
                if (~var30 <= -1) {
                    int var31 = var4[var30][var13] & 255;
                    if (~var31 < -1) {
                        class35 var32 = class57.method357(var31 + -1, true);
                        var6[var13] -= var32.field572;
                        var10[var13] -= var32.field569;
                        var9[var13] -= var32.field563;
                        var11[var13] -= var32.field581;
                        var10002 = var8[var13]--;
                    }
                }
            }
            if (~var12 <= -1) {
                int[][] var14 = class262.field4556[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var5 > var20; ++var20) {
                    int var21 = var20 - -5;
                    if (var5 > var21) {
                        var18 += var11[var21];
                        var15 += var6[var21];
                        var19 += var8[var21];
                        var16 += var10[var21];
                        var17 += var9[var21];
                    }
                    int var22 = var20 + -5;
                    if (~var22 <= -1) {
                        var15 -= var6[var22];
                        var16 -= var10[var22];
                        var19 -= var8[var22];
                        var17 -= var9[var22];
                        var18 -= var11[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 != 0 ? class151.method1072(var16 / var19, var15 * 256 / var18, (byte) 120, var17 / var19) : 0;
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (127 & var24) + var3;
                            if (var25 >= 0) {
                                if (var25 > 127) {
                                    var25 = 127;
                                }
                            } else {
                                var25 = 0;
                            }
                            int var26 = (64512 & var24 - -var2) + (896 & var24) + var25;
                            var23[class19.method98(63, var12) + (class19.method98(63, var20) << 6)] = class223.field3777[class235.method1530(var26, 122, 96)];
                        } else if (var23 != null) {
                            var23[(class19.method98(63, var20) << 6) - -class19.method98(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }
}
