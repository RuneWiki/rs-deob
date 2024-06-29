import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class185 extends class440 {

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
    private int field2589 = 0;

    @OriginalMember(owner = "client!tw", name = "K", descriptor = "I")
    private int field2597 = 0;

    @OriginalMember(owner = "client!tw", name = "Q", descriptor = "I")
    private int field2602 = 0;

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "[Lfu;")
    public static class355[] field2592 = null;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "I")
    public static int field2593 = 52;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
    private int field2591;

    @OriginalMember(owner = "client!tw", name = "H", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!tw", name = "I", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!tw", name = "J", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!tw", name = "L", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!tw", name = "M", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!tw", name = "N", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!tw", name = "P", descriptor = "I")
    private int field2601;

    @OriginalMember(owner = "client!tw", name = "R", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!tw", name = "S", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILmo;I)V", line = 4)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (arg0 != 5) {
            this.field2602 = 109;
        }
        ++field2599;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2597 = (arg1.method3827((byte) 92) << 12) / 100;
                }
            } else {
                this.field2602 = (arg1.method3827((byte) 47) << 12) / 100;
            }
        } else {
            this.field2589 = arg1.method3814(false);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIZ)V", line = 50)
    private final void method1236(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2595;
        int var5 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (4096 - -arg1) * arg0 >> 12;
        if (arg3) {
            method1237(-118, 98, -97);
        }
        if (~var5 >= -1) {
            this.field2596 = this.field2604 = this.field2591 = arg0;
        } else {
            int var6 = arg2 * 6;
            int var7 = arg0 + arg0 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field2591 = var15;
                                    this.field2604 = var7;
                                    this.field2596 = var5;
                                }
                            } else {
                                this.field2604 = var7;
                                this.field2596 = var14;
                                this.field2591 = var5;
                            }
                        } else {
                            this.field2604 = var15;
                            this.field2591 = var5;
                            this.field2596 = var7;
                        }
                    } else {
                        this.field2591 = var14;
                        this.field2596 = var7;
                        this.field2604 = var5;
                    }
                } else {
                    this.field2596 = var15;
                    this.field2604 = var5;
                    this.field2591 = var7;
                }
            } else {
                this.field2596 = var5;
                this.field2591 = var7;
                this.field2604 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V", line = 159)
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(III)Z", line = 163)
    public static final boolean method1237(int arg0, int arg1, int arg2) {
        if (arg2 != 1027) {
            method1237(30, 26, 111);
        }
        ++field2598;
        return ~(34 & arg1) != -1;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V", line = 179)
    private final void method1238(int arg0, int arg1, int arg2, int arg3) {
        ++field2594;
        int var5 = ~arg3 < ~arg1 ? arg3 : arg1;
        int var6 = var5 < arg2 ? arg2 : var5;
        int var7 = ~arg1 >= ~arg3 ? arg1 : arg3;
        int var8 = ~var7 < ~arg2 ? arg2 : var7;
        int var9 = -var8 + var6;
        this.field2600 = (var8 - -var6) / arg0;
        if (this.field2600 > 0 && this.field2600 < 4096) {
            this.field2603 = (var9 << 12) / (this.field2600 <= 2048 ? this.field2600 * 2 : -(this.field2600 * 2) + 8192);
        } else {
            this.field2603 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg3 != var6) {
                if (~arg1 != ~var6) {
                    this.field2601 = ~arg3 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                } else {
                    this.field2601 = arg2 != var8 ? -var12 + 12288 : 4096 - -var10;
                }
            } else {
                this.field2601 = ~arg1 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field2601 /= 6;
        } else {
            this.field2601 = 0;
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)[[I", line = 235)
    public final int[][] method763(int arg0, int arg1) {
        ++field2590;
        int[][] var3 = super.field6417.method3769(arg1, -26435);
        if (arg0 != -5766) {
            this.method1238(-63, 16, 89, -96);
        }
        if (super.field6417.field9606) {
            int[][] var4 = this.method2606(arg1, 0, -1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class549.field7715 < ~var11; ++var11) {
                this.method1238(2, var6[var11], var7[var11], var5[var11]);
                this.field2603 += this.field2602;
                this.field2601 += this.field2589;
                this.field2600 += this.field2597;
                while (this.field2601 < 0) {
                    this.field2601 += 4096;
                }
                while (this.field2601 > 4096) {
                    this.field2601 -= 4096;
                }
                if (~this.field2603 > -1) {
                    this.field2603 = 0;
                }
                if (~this.field2603 < -4097) {
                    this.field2603 = 4096;
                }
                if (~this.field2600 > -1) {
                    this.field2600 = 0;
                }
                if (~this.field2600 < -4097) {
                    this.field2600 = 4096;
                }
                this.method1236(this.field2600, this.field2603, this.field2601, false);
                var8[var11] = this.field2596;
                var9[var11] = this.field2604;
                var10[var11] = this.field2591;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)V", line = 314)
    public static void method1239(byte arg0) {
        if (arg0 >= 31) {
            field2592 = null;
        }
    }
}
