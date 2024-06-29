import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class52 extends class326 {

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    private int field693 = 0;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    private int field692 = 0;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    private int field686 = 0;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lmc;")
    public static class78 field684 = new class78(48, 11);

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lh;")
    public static class434 field698 = new class434(18, -2);

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "Z")
    public static boolean field700 = false;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    private int field683;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    private int field694;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)[[I", line = 6)
    public final int[][] method48(int arg0, byte arg1) {
        if (arg1 >= -52) {
            this.field691 = 35;
        }
        ++field687;
        int[][] var3 = super.field4343.method2356(arg0, 124);
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class181.field2495 < ~var11; ++var11) {
                this.method363(-107, var7[var11], var6[var11], var5[var11]);
                this.field691 += this.field693;
                this.field695 += this.field686;
                for (this.field683 += this.field692; ~this.field683 > -1; this.field683 += 4096) {
                }
                if (this.field695 < 0) {
                    this.field695 = 0;
                }
                while (this.field683 > 4096) {
                    this.field683 -= 4096;
                }
                if (this.field691 < 0) {
                    this.field691 = 0;
                }
                if (this.field695 > 4096) {
                    this.field695 = 4096;
                }
                if (this.field691 > 4096) {
                    this.field691 = 4096;
                }
                this.method362(this.field683, this.field691, this.field695, false);
                var8[var11] = this.field685;
                var9[var11] = this.field694;
                var10[var11] = this.field697;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 81)
    public static void method361(byte arg0) {
        field684 = null;
        if (arg0 <= -83) {
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 93)
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILbt;I)V", line = 98)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field690;
        if (arg2 >= -3) {
            this.method362(67, -8, -74, false);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field693 = (arg1.method211(29861) << 12) / 100;
                }
            } else {
                this.field686 = (arg1.method211(29861) << 12) / 100;
            }
        } else {
            this.field692 = arg1.method209((byte) 35);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZ)V", line = 143)
    private final void method362(int arg0, int arg1, int arg2, boolean arg3) {
        ++field696;
        int var5 = arg1 > 2048 ? -(arg1 * arg2 >> 12) + arg1 + arg2 : (4096 - -arg2) * arg1 >> 12;
        if (!arg3) {
            if (var5 > 0) {
                int var6 = arg0 * 6;
                int var7 = -var5 + arg1 + arg1;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field685 = var5;
                    this.field697 = var7;
                    this.field694 = var14;
                    return;
                }
                if (~var9 == -2) {
                    this.field685 = var15;
                    this.field694 = var5;
                    this.field697 = var7;
                    return;
                }
                if (~var9 == -3) {
                    this.field685 = var7;
                    this.field697 = var14;
                    this.field694 = var5;
                    return;
                }
                if (var9 == 3) {
                    this.field694 = var15;
                    this.field685 = var7;
                    this.field697 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field685 = var14;
                    this.field694 = var7;
                    this.field697 = var5;
                    return;
                }
                if (var9 == 5) {
                    this.field697 = var15;
                    this.field694 = var7;
                    this.field685 = var5;
                    return;
                }
            } else {
                this.field685 = this.field694 = this.field697 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)V", line = 264)
    private final void method363(int arg0, int arg1, int arg2, int arg3) {
        ++field689;
        int var5 = ~arg2 > ~arg3 ? arg3 : arg2;
        int var6 = ~arg1 >= ~var5 ? var5 : arg1;
        int var7 = ~arg2 >= ~arg3 ? arg2 : arg3;
        int var8 = ~arg1 <= ~var7 ? var7 : arg1;
        int var9 = var6 - var8;
        this.field691 = (var6 + var8) / 2;
        if (arg0 > -61) {
            field684 = null;
        }
        if (~var9 < -1) {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (~arg3 == ~var6) {
                this.field683 = arg2 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg2 != ~var6) {
                this.field683 = arg3 != var8 ? 20480 - var10 : var11 + 12288;
            } else {
                this.field683 = arg1 != var8 ? 12288 - var12 : var10 + 4096;
            }
            this.field683 /= 6;
        } else {
            this.field683 = 0;
        }
        if (~this.field691 < -1 && ~this.field691 > -4097) {
            this.field695 = (var9 << 12) / (this.field691 <= 2048 ? this.field691 * 2 : -(this.field691 * 2) + 8192);
        } else {
            this.field695 = 0;
        }
    }
}
