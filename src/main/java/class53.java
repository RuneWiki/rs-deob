import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class53 extends class144 {

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field601 = 0;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    private int field604 = 0;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    private int field611 = 0;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static volatile int field613 = 0;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Loc;")
    public static class232[] field617;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "[[[B")
    public static byte[][][] field602;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V")
    public static void method319(int arg0) {
        field617 = null;
        field602 = null;
        if (arg0 <= 76) {
            method319(0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        int[][] var3 = super.field2053.method1542(111, arg1);
        if (arg0 != 5) {
            this.method321(-13, -106, -5, 68);
        }
        ++field607;
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class104.field1411 < ~var11; ++var11) {
                this.method320((byte) 118, var5[var11], var7[var11], var6[var11]);
                this.field610 += this.field611;
                if (this.field610 < 0) {
                    this.field610 = 0;
                }
                this.field614 += this.field601;
                this.field615 += this.field604;
                if (this.field610 > 4096) {
                    this.field610 = 4096;
                }
                if (~this.field614 > -1) {
                    this.field614 = 0;
                }
                if (this.field614 > 4096) {
                    this.field614 = 4096;
                }
                while (this.field615 < 0) {
                    this.field615 += 4096;
                }
                while (~this.field615 < -4097) {
                    this.field615 -= 4096;
                }
                this.method321(this.field610, this.field614, this.field615, -98);
                var8[var11] = this.field606;
                var10[var11] = this.field609;
                var9[var11] = this.field608;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIII)V")
    private final void method320(byte arg0, int arg1, int arg2, int arg3) {
        ++field612;
        if (arg0 >= 63) {
            int var5 = ~arg1 >= ~arg3 ? arg3 : arg1;
            int var6 = ~var5 <= ~arg2 ? var5 : arg2;
            int var7 = arg1 < arg3 ? arg1 : arg3;
            int var8 = arg2 >= var7 ? var7 : arg2;
            int var9 = -var8 + var6;
            this.field610 = (var6 + var8) / 2;
            if (this.field610 > 0 && ~this.field610 > -4097) {
                this.field614 = (var9 << 12) / (~this.field610 >= -2049 ? this.field610 * 2 : -(this.field610 * 2) + 8192);
            } else {
                this.field614 = 0;
            }
            if (~var9 < -1) {
                int var10 = (var6 - arg3 << 12) / var9;
                int var11 = (-arg1 + var6 << 12) / var9;
                int var12 = (var6 - arg2 << 12) / var9;
                if (arg1 != var6) {
                    if (arg3 == var6) {
                        this.field615 = ~arg2 != ~var8 ? -var12 + 12288 : var11 + 4096;
                    } else {
                        this.field615 = arg1 != var8 ? -var11 + 20480 : var10 + 12288;
                    }
                } else {
                    this.field615 = arg3 == var8 ? var12 + 20480 : -var10 + 4096;
                }
                this.field615 /= 6;
            } else {
                this.field615 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            this.method320((byte) -86, 14, -71, 105);
        }
        ++field603;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field611 = (arg1.method1355(true) << 12) / 100;
                }
            } else {
                this.field601 = (arg1.method1355(true) << 12) / 100;
            }
        } else {
            this.field604 = arg1.method1357((byte) 50);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V")
    private final void method321(int arg0, int arg1, int arg2, int arg3) {
        ++field616;
        int var5 = arg0 > 2048 ? -(arg0 * arg1 >> 12) + arg1 + arg0 : (arg1 + 4096) * arg0 >> 12;
        if (~var5 >= -1) {
            this.field606 = this.field609 = this.field608 = arg0;
        } else {
            int var6 = arg0 + arg0 - var5;
            int var7 = arg2 * 6;
            int var8 = (var5 - var6 << 12) / var5;
            int var9 = var7 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = -(var9 << 12) + var7;
            int var13 = var11 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field608 = var15;
                                    this.field609 = var6;
                                    this.field606 = var5;
                                }
                            } else {
                                this.field608 = var5;
                                this.field606 = var14;
                                this.field609 = var6;
                            }
                        } else {
                            this.field606 = var6;
                            this.field609 = var15;
                            this.field608 = var5;
                        }
                    } else {
                        this.field606 = var6;
                        this.field608 = var14;
                        this.field609 = var5;
                    }
                } else {
                    this.field606 = var15;
                    this.field608 = var6;
                    this.field609 = var5;
                }
            } else {
                this.field608 = var6;
                this.field606 = var5;
                this.field609 = var14;
            }
        }
        int var17 = -20 / ((-51 - arg3) / 42);
    }
}
