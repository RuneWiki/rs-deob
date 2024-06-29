import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class192 extends class386 {

    @OriginalMember(owner = "client!su", name = "G", descriptor = "I")
    private int field2340 = 0;

    @OriginalMember(owner = "client!su", name = "E", descriptor = "I")
    private int field2338 = 0;

    @OriginalMember(owner = "client!su", name = "K", descriptor = "I")
    private int field2344 = 0;

    @OriginalMember(owner = "client!su", name = "C", descriptor = "[Lbca;")
    public static class612[] field2336 = new class612[14];

    @OriginalMember(owner = "client!su", name = "D", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!su", name = "F", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!su", name = "H", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!su", name = "I", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!su", name = "J", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!su", name = "L", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!su", name = "M", descriptor = "I")
    private int field2346;

    @OriginalMember(owner = "client!su", name = "N", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!su", name = "O", descriptor = "I")
    private int field2348;

    @OriginalMember(owner = "client!su", name = "P", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIII)V", line = 4)
    private final void method1180(int arg0, int arg1, int arg2, int arg3) {
        ++field2342;
        int var5 = ~arg1 >= ~arg3 ? arg3 : arg1;
        if (arg0 != 23400) {
            this.method645(89, 110);
        }
        int var6 = ~arg2 >= ~var5 ? var5 : arg2;
        int var7 = ~arg1 <= ~arg3 ? arg3 : arg1;
        int var8 = arg2 >= var7 ? var7 : arg2;
        this.field2349 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 <= 0) {
            this.field2343 = 0;
        } else {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (~arg3 != ~var6) {
                    this.field2343 = arg1 != var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field2343 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
                }
            } else {
                this.field2343 = ~arg3 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field2343 /= 6;
        }
        if (~this.field2349 < -1 && ~this.field2349 > -4097) {
            this.field2348 = (var9 << 12) / (~this.field2349 < -2049 ? -(this.field2349 * 2) + 8192 : this.field2349 * 2);
        } else {
            this.field2348 = 0;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V", line = 63)
    public class192() {
        super(1, false);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Z)V", line = 73)
    public static void method1181(boolean arg0) {
        field2336 = null;
        if (!arg0) {
            method1181(false);
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(IIII)V", line = 83)
    private final void method1182(int arg0, int arg1, int arg2, int arg3) {
        ++field2341;
        if (arg0 == 5761) {
            int var5 = ~arg1 < -2049 ? -(arg1 * arg3 >> 12) + arg3 + arg1 : (arg3 + 4096) * arg1 >> 12;
            if (~var5 >= -1) {
                this.field2346 = this.field2345 = this.field2337 = arg1;
            } else {
                int var6 = arg2 * 6;
                int var7 = -var5 + arg1 + arg1;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 != 3) {
                                if (~var9 != -5) {
                                    if (~var9 == -6) {
                                        this.field2346 = var5;
                                        this.field2337 = var15;
                                        this.field2345 = var7;
                                    }
                                } else {
                                    this.field2346 = var14;
                                    this.field2337 = var5;
                                    this.field2345 = var7;
                                }
                            } else {
                                this.field2337 = var5;
                                this.field2345 = var15;
                                this.field2346 = var7;
                            }
                        } else {
                            this.field2346 = var7;
                            this.field2345 = var5;
                            this.field2337 = var14;
                        }
                    } else {
                        this.field2345 = var5;
                        this.field2337 = var7;
                        this.field2346 = var15;
                    }
                } else {
                    this.field2337 = var7;
                    this.field2346 = var5;
                    this.field2345 = var14;
                }
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)[[I", line = 199)
    public final int[][] method645(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field2347;
            int[][] var3 = super.field5148.method1054(arg0, 16257);
            if (super.field5148.field2041) {
                int[][] var4 = this.method2211(arg0, 0, -104);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class599.field8643 > var11; ++var11) {
                    this.method1180(23400, var5[var11], var7[var11], var6[var11]);
                    this.field2348 += this.field2338;
                    this.field2349 += this.field2344;
                    for (this.field2343 += this.field2340; ~this.field2343 > -1; this.field2343 += 4096) {
                    }
                    if (~this.field2348 > -1) {
                        this.field2348 = 0;
                    }
                    while (~this.field2343 < -4097) {
                        this.field2343 -= 4096;
                    }
                    if (~this.field2348 < -4097) {
                        this.field2348 = 4096;
                    }
                    if (this.field2349 < 0) {
                        this.field2349 = 0;
                    }
                    if (~this.field2349 < -4097) {
                        this.field2349 = 4096;
                    }
                    this.method1182(arg1 ^ 5762, this.field2349, this.field2343, this.field2348);
                    var8[var11] = this.field2346;
                    var9[var11] = this.field2345;
                    var10[var11] = this.field2337;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IBLun;)V", line = 275)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2344 = (arg2.method2249((byte) -70) << 12) / 100;
                }
            } else {
                this.field2338 = (arg2.method2249((byte) -70) << 12) / 100;
            }
        } else {
            this.field2340 = arg2.method2270((byte) 71);
        }
        if (arg1 < 111) {
            this.method355(-22, (byte) -99, (class389) null);
        }
        ++field2339;
    }
}
