import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class665 extends class330 {

    @OriginalMember(owner = "client!gka", name = "G", descriptor = "I")
    private int field9341 = 0;

    @OriginalMember(owner = "client!gka", name = "H", descriptor = "I")
    private int field9342 = 0;

    @OriginalMember(owner = "client!gka", name = "I", descriptor = "I")
    private int field9343 = 0;

    @OriginalMember(owner = "client!gka", name = "F", descriptor = "Ljn;")
    public static class134 field9340 = new class134(32, -1);

    @OriginalMember(owner = "client!gka", name = "O", descriptor = "[I")
    public static int[] field9349 = new int[200];

    @OriginalMember(owner = "client!gka", name = "U", descriptor = "I")
    public static int field9355 = -2;

    @OriginalMember(owner = "client!gka", name = "C", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!gka", name = "D", descriptor = "I")
    private int field9338;

    @OriginalMember(owner = "client!gka", name = "E", descriptor = "I")
    private int field9339;

    @OriginalMember(owner = "client!gka", name = "J", descriptor = "I")
    private int field9344;

    @OriginalMember(owner = "client!gka", name = "K", descriptor = "I")
    private int field9345;

    @OriginalMember(owner = "client!gka", name = "L", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!gka", name = "M", descriptor = "I")
    private int field9347;

    @OriginalMember(owner = "client!gka", name = "N", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!gka", name = "P", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!gka", name = "Q", descriptor = "I")
    public static int field9351;

    @OriginalMember(owner = "client!gka", name = "S", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!gka", name = "T", descriptor = "I")
    private int field9354;

    @OriginalMember(owner = "client!gka", name = "R", descriptor = "[[[I")
    public static int[][][] field9352;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field9353;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            this.field9339 = 1;
        }
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(arg1, 0, arg0 + 126);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class80.field901; ++var11) {
                this.method3793(var5[var11], var6[var11], arg0 ^ 101, var7[var11]);
                this.field9344 += this.field9343;
                this.field9338 += this.field9342;
                this.field9347 += this.field9341;
                while (~this.field9338 > -1) {
                    this.field9338 += 4096;
                }
                if (~this.field9347 > -1) {
                    this.field9347 = 0;
                }
                while (this.field9338 > 4096) {
                    this.field9338 -= 4096;
                }
                if (~this.field9344 > -1) {
                    this.field9344 = 0;
                }
                if (this.field9347 > 4096) {
                    this.field9347 = 4096;
                }
                if (this.field9344 > 4096) {
                    this.field9344 = 4096;
                }
                this.method3790((byte) 125, this.field9344, this.field9347, this.field9338);
                var8[var11] = this.field9339;
                var9[var11] = this.field9354;
                var10[var11] = this.field9345;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(III[BI[BIII)V")
    public static final void method3789(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        ++field9351;
        int var9 = -(arg1 >> 2);
        int var10 = -(3 & arg1);
        if (arg6 != 4096) {
            field9349 = null;
        }
        for (int var11 = -arg4; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; ~var12 > -1; ++var12) {
                var10001 = arg8++;
                arg5[var10001] += arg3[arg2++];
                int var14 = arg8++;
                arg5[var14] += arg3[arg2++];
                int var15 = arg8++;
                arg5[var15] += arg3[arg2++];
                int var16 = arg8++;
                arg5[var16] += arg3[arg2++];
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg8++;
                arg5[var10001] += arg3[arg2++];
            }
            arg2 += arg0;
            arg8 += arg7;
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(BIII)V")
    private final void method3790(byte arg0, int arg1, int arg2, int arg3) {
        ++field9348;
        int var5 = arg1 > 2048 ? -(arg1 * arg2 >> 12) + arg2 + arg1 : (arg2 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field9339 = var5;
                                    this.field9345 = var15;
                                    this.field9354 = var7;
                                }
                            } else {
                                this.field9345 = var5;
                                this.field9354 = var7;
                                this.field9339 = var14;
                            }
                        } else {
                            this.field9354 = var15;
                            this.field9345 = var5;
                            this.field9339 = var7;
                        }
                    } else {
                        this.field9345 = var14;
                        this.field9354 = var5;
                        this.field9339 = var7;
                    }
                } else {
                    this.field9354 = var5;
                    this.field9339 = var15;
                    this.field9345 = var7;
                }
            } else {
                this.field9354 = var14;
                this.field9339 = var5;
                this.field9345 = var7;
            }
        } else {
            this.field9339 = this.field9354 = this.field9345 = arg1;
        }
        if (arg0 != 125) {
            this.field9343 = -80;
        }
    }

    @OriginalMember(owner = "client!gka", name = "<init>", descriptor = "()V")
    public class665() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Loq;III)V")
    public static final void method3791(class230 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class414.field5796) {
            class472 var4 = class59.field688[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field6540 != null && var4.field6540.method83(false)) {
                arg0.method73(var4.field6540, class179.field2263, true, 0, class139.field1781, 0, 117);
            }
        }
        if (arg3 < class414.field5796) {
            class472 var5 = class59.field688[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field6540 != null && var5.field6540.method83(false)) {
                arg0.method73(var5.field6540, 0, true, 0, class139.field1781, class179.field2263, 112);
            }
        }
        if (arg2 < class414.field5796 && arg3 < class704.field9799) {
            class472 var6 = class59.field688[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field6540 != null && var6.field6540.method83(false)) {
                arg0.method73(var6.field6540, class179.field2263, true, 0, class139.field1781, class179.field2263, 100);
            }
        }
        if (arg2 < class414.field5796 && arg3 > 0) {
            class472 var7 = class59.field688[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field6540 != null && var7.field6540.method83(false)) {
                arg0.method73(var7.field6540, class179.field2263, true, 0, class139.field1781, -class179.field2263, 100);
            }
        }
    }

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "(Z)V")
    public static void method3792(boolean arg0) {
        field9349 = null;
        field9352 = null;
        if (arg0) {
            field9340 = null;
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIII)V")
    private final void method3793(int arg0, int arg1, int arg2, int arg3) {
        ++field9346;
        int var5 = arg0 > arg1 ? arg0 : arg1;
        int var6 = var5 < arg3 ? arg3 : var5;
        int var7 = ~arg0 > ~arg1 ? arg0 : arg1;
        int var8 = ~var7 >= ~arg3 ? var7 : arg3;
        this.field9344 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field9338 = ~arg1 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (~arg1 != ~var6) {
                this.field9338 = arg0 != var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field9338 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field9338 /= 6;
        } else {
            this.field9338 = 0;
        }
        if (this.field9344 > 0 && this.field9344 < 4096) {
            this.field9347 = (var9 << 12) / (this.field9344 <= 2048 ? this.field9344 * 2 : -(this.field9344 * 2) + 8192);
        } else {
            this.field9347 = 0;
        }
        int var13 = 60 % ((arg2 - 57) / 38);
    }

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "(Z)V")
    public static final void method3794(boolean arg0) {
        class477.field6611 = 0;
        if (arg0) {
            ++field9337;
            int var1 = (class724.field10031.field3470 >> 9) + class444.field6151;
            int var2 = (class724.field10031.field3460 >> 9) + class236.field3535;
            if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && ~var2 >= -3137) {
                class477.field6611 = 1;
            }
            if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && var2 <= 9535) {
                class477.field6611 = 1;
            }
            if (class477.field6611 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
                class477.field6611 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = 87 % ((arg2 - -41) / 42);
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field9343 = (arg0.method3030(-25984) << 12) / 100;
                }
            } else {
                this.field9341 = (arg0.method3030(-25984) << 12) / 100;
            }
        } else {
            this.field9342 = arg0.method3034(1);
        }
        ++field9350;
    }
}
