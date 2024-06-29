import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class308 extends class751 {

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    private int field4584 = 0;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    private int field4586 = 0;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    private int field4595 = 0;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "[Lco;")
    public static class129[] field4587 = new class129[14];

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    private int field4582;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILrv;I)V", line = 7)
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = -25 % ((25 - arg0) / 63);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field4584 = (arg1.method877(-252) << 12) / 100;
                }
            } else {
                this.field4586 = (arg1.method877(-252) << 12) / 100;
            }
        } else {
            this.field4595 = arg1.method838(true);
        }
        ++field4588;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Z", line = 49)
    public static final boolean method2019(int arg0) {
        ++field4581;
        if (arg0 != 11473) {
            field4587 = null;
        }
        if (class777.field10722) {
            try {
                class150.method1035(-19253, "showVideoAd", class535.field7544);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 75)
    public class308() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V", line = 93)
    public static void method2020(byte arg0) {
        if (arg0 >= 42) {
            field4587 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)[[I", line = 104)
    public final int[][] method147(int arg0, byte arg1) {
        if (arg1 != 57) {
            this.field4582 = -87;
        }
        ++field4585;
        int[][] var3 = super.field10409.method3474(arg1 + 2075, arg0);
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, arg1 + -56);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class673.field9452; ++var11) {
                this.method2022(var7[var11], var5[var11], (byte) 112, var6[var11]);
                this.field4591 += this.field4586;
                this.field4582 += this.field4584;
                for (this.field4589 += this.field4595; this.field4589 < 0; this.field4589 += 4096) {
                }
                if (this.field4591 < 0) {
                    this.field4591 = 0;
                }
                while (~this.field4589 < -4097) {
                    this.field4589 -= 4096;
                }
                if (~this.field4582 > -1) {
                    this.field4582 = 0;
                }
                if (~this.field4591 < -4097) {
                    this.field4591 = 4096;
                }
                if (~this.field4582 < -4097) {
                    this.field4582 = 4096;
                }
                this.method2021(this.field4589, this.field4591, 12288, this.field4582);
                var8[var11] = this.field4583;
                var9[var11] = this.field4593;
                var10[var11] = this.field4592;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V", line = 175)
    private final void method2021(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 12288) {
            this.field4589 = 95;
        }
        ++field4594;
        int var5 = arg3 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg1 + 4096) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 == -1) {
                this.field4593 = var14;
                this.field4592 = var7;
                this.field4583 = var5;
                return;
            }
            if (var9 == 1) {
                this.field4592 = var7;
                this.field4593 = var5;
                this.field4583 = var15;
                return;
            }
            if (~var9 == -3) {
                this.field4593 = var5;
                this.field4592 = var14;
                this.field4583 = var7;
                return;
            }
            if (~var9 == -4) {
                this.field4592 = var5;
                this.field4593 = var15;
                this.field4583 = var7;
                return;
            }
            if (var9 == 4) {
                this.field4592 = var5;
                this.field4583 = var14;
                this.field4593 = var7;
                return;
            }
            if (var9 == 5) {
                this.field4583 = var5;
                this.field4593 = var7;
                this.field4592 = var15;
                return;
            }
        } else {
            this.field4583 = this.field4593 = this.field4592 = arg3;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBI)V", line = 279)
    private final void method2022(int arg0, int arg1, byte arg2, int arg3) {
        ++field4590;
        int var5 = ~arg3 <= ~arg1 ? arg3 : arg1;
        if (arg2 == 112) {
            int var6 = ~var5 <= ~arg0 ? var5 : arg0;
            int var7 = ~arg3 >= ~arg1 ? arg3 : arg1;
            int var8 = ~arg0 <= ~var7 ? var7 : arg0;
            this.field4582 = (var8 - -var6) / 2;
            int var9 = var6 - var8;
            if (~var9 < -1) {
                int var10 = (var6 - arg1 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                int var12 = (-arg0 + var6 << 12) / var9;
                if (~arg1 != ~var6) {
                    if (~arg3 != ~var6) {
                        this.field4589 = arg1 != var8 ? 20480 - var10 : 12288 - -var11;
                    } else {
                        this.field4589 = arg0 != var8 ? -var12 + 12288 : var10 + 4096;
                    }
                } else {
                    this.field4589 = ~arg3 == ~var8 ? var12 + 20480 : -var11 + 4096;
                }
                this.field4589 /= 6;
            } else {
                this.field4589 = 0;
            }
            if (~this.field4582 < -1 && ~this.field4582 > -4097) {
                this.field4591 = (var9 << 12) / (~this.field4582 < -2049 ? -(this.field4582 * 2) + 8192 : this.field4582 * 2);
            } else {
                this.field4591 = 0;
            }
        }
    }
}
