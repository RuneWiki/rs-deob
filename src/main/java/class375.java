import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class375 extends class337 {

    @OriginalMember(owner = "client!ts", name = "H", descriptor = "I")
    private int field5620 = 0;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
    private int field5629 = 0;

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    private int field5630 = 0;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "Lqd;")
    public static class315 field5617 = new class315("", 13);

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "Lob;")
    public static class521 field5625 = new class521(38, -1);

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    private int field5616;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "I")
    private int field5619;

    @OriginalMember(owner = "client!ts", name = "I", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ts", name = "J", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
    private int field5626;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ts", name = "S", descriptor = "I")
    private int field5631;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method673(int arg0, int arg1) {
        ++field5622;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        int var4 = 37 % ((arg1 - -41) / 49);
        if (super.field5011.field3346) {
            int[][] var5 = this.method2123(arg0, 0, -122);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class402.field5977 > var12; ++var12) {
                this.method2356(var6[var12], (byte) -127, var8[var12], var7[var12]);
                this.field5623 += this.field5620;
                this.field5631 += this.field5630;
                for (this.field5626 += this.field5629; ~this.field5626 > -1; this.field5626 += 4096) {
                }
                while (~this.field5626 < -4097) {
                    this.field5626 -= 4096;
                }
                if (~this.field5623 > -1) {
                    this.field5623 = 0;
                }
                if (this.field5623 > 4096) {
                    this.field5623 = 4096;
                }
                if (this.field5631 < 0) {
                    this.field5631 = 0;
                }
                if (this.field5631 > 4096) {
                    this.field5631 = 4096;
                }
                this.method2359(this.field5623, 5, this.field5626, this.field5631);
                var9[var12] = this.field5619;
                var10[var12] = this.field5616;
                var11[var12] = this.field5614;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBII)V", line = 80)
    private final void method2356(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -127) {
            this.field5631 = 44;
        }
        ++field5627;
        int var5 = ~arg3 > ~arg0 ? arg0 : arg3;
        int var6 = ~var5 > ~arg2 ? arg2 : var5;
        int var7 = ~arg3 >= ~arg0 ? arg3 : arg0;
        int var8 = ~var7 >= ~arg2 ? var7 : arg2;
        this.field5631 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (var9 <= 0) {
            this.field5626 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field5626 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (~arg3 == ~var6) {
                this.field5626 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
            } else {
                this.field5626 = arg0 != var8 ? 20480 - var10 : var11 + 12288;
            }
            this.field5626 /= 6;
        }
        if (this.field5631 > 0 && ~this.field5631 > -4097) {
            this.field5623 = (var9 << 12) / (~this.field5631 >= -2049 ? this.field5631 * 2 : -(this.field5631 * 2) + 8192);
        } else {
            this.field5623 = 0;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V", line = 338)
    public class375() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BILhp;)V", line = 141)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -54 % ((82 - arg0) / 40);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field5630 = (arg2.method1565(true) << 12) / 100;
                }
            } else {
                this.field5620 = (arg2.method1565(true) << 12) / 100;
            }
        } else {
            this.field5629 = arg2.method1529((byte) 101);
        }
        ++field5624;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V", line = 192)
    public static final void method2357(int arg0, int arg1, byte arg2) {
        ++field5621;
        int var3 = 10 / ((60 - arg2) / 55);
        class211 var4 = class452.method2749(16, -92, arg0);
        var4.method1463(0);
        var4.field3441 = arg1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 207)
    public static void method2358(boolean arg0) {
        if (arg0) {
            method2357(124, -124, (byte) 27);
        }
        field5617 = null;
        field5625 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V", line = 224)
    private final void method2359(int arg0, int arg1, int arg2, int arg3) {
        ++field5618;
        if (arg1 != 5) {
            this.field5620 = 11;
        }
        int var5 = arg3 <= 2048 ? (4096 - -arg0) * arg3 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg3 + arg3 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field5619 = var5;
                this.field5614 = var7;
                this.field5616 = var14;
                return;
            }
            if (~var9 == -2) {
                this.field5619 = var15;
                this.field5614 = var7;
                this.field5616 = var5;
                return;
            }
            if (var9 == 2) {
                this.field5614 = var14;
                this.field5619 = var7;
                this.field5616 = var5;
                return;
            }
            if (~var9 == -4) {
                this.field5614 = var5;
                this.field5616 = var15;
                this.field5619 = var7;
                return;
            }
            if (var9 == 4) {
                this.field5614 = var5;
                this.field5616 = var7;
                this.field5619 = var14;
                return;
            }
            if (var9 == 5) {
                this.field5619 = var5;
                this.field5614 = var15;
                this.field5616 = var7;
                return;
            }
        } else {
            this.field5619 = this.field5616 = this.field5614 = arg3;
        }
    }
}
