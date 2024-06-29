import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class474 extends class601 {

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
    private int field6502 = 1;

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "I")
    private int field6505 = 1;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!maa", name = "K", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lee;BI)V", line = 5)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 != -61) {
            method2672((byte) -76, 22);
        }
        ++field6496;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field7897 = ~arg0.method3821((byte) -104) == -2;
                }
            } else {
                this.field6502 = arg0.method3821((byte) -80);
            }
        } else {
            this.field6505 = arg0.method3821((byte) 78);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZJ)V", line = 53)
    public static final void method2668(boolean arg0, long arg1) {
        ++field6504;
        int var3 = class513.field6808;
        int var4 = class248.field3439;
        if (~class425.field5854 != ~var3) {
            int var5 = var3 - class425.field5854;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 != 0) {
                if (~var6 < ~var5) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class425.field5854 += var6;
        }
        class578.field7586 += (float) arg1 * class394.field5492 / 40.0F * 8.0F;
        class547.field7230 += (float) arg1 * class528.field7009 / 40.0F * 8.0F;
        if (~class116.field1879 != ~var4) {
            int var7 = -class116.field1879 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (var8 != 0) {
                    if (var7 < var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class116.field1879 += var8;
        }
        if (!arg0) {
            class614.method3341(98);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Lpda;", line = 134)
    public static final class630 method2669(byte arg0) {
        ++field6503;
        if (class744.field10345 != null && class468.field6423 != null) {
            class468.field6423.method4007(-2, class744.field10345);
            if (arg0 >= -66) {
                return null;
            } else {
                class630 var1 = (class630) class468.field6423.method4010(true);
                if (var1 == null) {
                    return null;
                } else {
                    class325 var2 = class744.field10338.method3192((byte) 59, var1.field8387);
                    return var2 != null && var2.field4609 && var2.method1968((byte) -14, class744.field10340) ? var1 : class506.method2842((byte) -24);
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V", line = 161)
    public class474() {
        super(1, false);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IFIIIIZI)[I", line = 164)
    public static final int[] method2670(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        ++field6501;
        int[] var8 = new int[arg7];
        int var9 = 39 % ((arg0 - -43) / 59);
        class684 var10 = new class684();
        var10.field9550 = (int) (arg1 * 4096.0F);
        var10.field9556 = arg3;
        var10.field9555 = arg5;
        var10.field9547 = arg2;
        var10.field9548 = arg4;
        var10.field9544 = arg6;
        var10.method108(8351);
        class626.method3443(1, false, arg7);
        var10.method3855((byte) 117, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BI)[I", line = 187)
    public final int[] method5(byte arg0, int arg1) {
        ++field6497;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            return null;
        } else {
            if (super.field7902.field704) {
                int var4 = this.field6502 - -1 + this.field6502;
                int var5 = 65536 / var4;
                int var6 = this.field6505 + this.field6505 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field6502 + arg1; ~(this.field6502 + arg1) <= ~var9; ++var9) {
                    int[] var13 = this.method3266((byte) 64, class112.field1855 & var9, 0);
                    int[] var14 = new int[class171.field2624];
                    int var15 = 0;
                    for (int var16 = -this.field6505; this.field6505 >= var16; ++var16) {
                        var15 += var13[var16 & class445.field6116];
                    }
                    int var17 = 0;
                    while (~class171.field2624 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[var17 - this.field6505 & class445.field6116];
                        ++var17;
                        var15 = var13[var17 - -this.field6505 & class445.field6116] + var18;
                    }
                    var8[this.field6502 + var9 + -arg1] = var14;
                }
                for (int var10 = 0; var10 < class171.field2624; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZLfs;)V", line = 274)
    public static final void method2671(boolean arg0, class556 arg1) {
        ++field6499;
        for (class461 var2 = (class461) class681.field9519.method21(2); var2 != null; var2 = (class461) class681.field9519.method9(-128)) {
            if (var2.field6304 == arg1) {
                if (var2.field6305 != null) {
                    class603.field7927.method1612(var2.field6305);
                    var2.field6305 = null;
                }
                var2.method3564(true);
                return;
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(BI)Z", line = 311)
    public static final boolean method2672(byte arg0, int arg1) {
        ++field6500;
        if (arg0 <= 111) {
            return false;
        } else {
            return ~arg1 == -1 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(IZ)[[I", line = 329)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field6498;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int var4 = this.field6502 + this.field6502 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field6505 + this.field6505 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field6502; ~var9 >= ~(this.field6502 + arg0); ++var9) {
                int[][] var19 = this.method3268(var9 & class112.field1855, 0, 65535);
                int[][] var20 = new int[3][class171.field2624];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field6505; this.field6505 >= var27; ++var27) {
                    int var37 = class445.field6116 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class171.field2624) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field6505 + var31 & class445.field6116;
                    int var33 = var23 - var26[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = class445.field6116 & var31 - -this.field6505;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var33;
                    var21 = var24[var36] + var35;
                }
                var8[-arg0 + this.field6502 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class171.field2624 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (!arg1) {
            method2670(-68, -1.2303699F, -75, -29, -46, -13, false, -109);
        }
        return var3;
    }
}
