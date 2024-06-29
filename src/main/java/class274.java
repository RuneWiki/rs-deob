import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class274 extends class214 {

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    private int field3791 = 10;

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
    private int field3798 = 0;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "I")
    private int field3797 = 2048;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "Ltm;")
    public static class112 field3794 = new class112("M", "M", "M", "M");

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "[I")
    public static int[] field3799 = new int[14];

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "[I")
    public static int[] field3801 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!eq", name = "W", descriptor = "[I")
    public static int[] field3800 = new int[5];

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "[I")
    private int[] field3788;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "[I")
    private int[] field3790;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V", line = 10)
    private final void method1720(byte arg0) {
        ++field3795;
        this.field3790 = new int[this.field3791 + 1];
        this.field3788 = new int[this.field3791 - -1];
        int var2 = 0;
        if (arg0 < -38) {
            int var3 = 4096 / this.field3791;
            int var4 = this.field3797 * var3 >> 12;
            for (int var5 = 0; ~this.field3791 < ~var5; ++var5) {
                this.field3788[var5] = var2;
                this.field3790[var5] = var2 - -var4;
                var2 += var3;
            }
            this.field3788[this.field3791] = 4096;
            this.field3790[this.field3791] = this.field3790[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V", line = 270)
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Llk;II)V", line = 48)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3798 = arg0.method2503(true);
                }
            } else {
                this.field3797 = arg0.method2508(true);
            }
        } else {
            this.field3791 = arg0.method2503(true);
        }
        ++field3792;
        if (arg1 > -114) {
            this.method14((byte) -115, 123);
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)Lvk;", line = 94)
    public static final class272 method1721(int arg0, int arg1, int arg2) {
        ++field3789;
        class272 var3 = new class272();
        var3.field3761 = -1;
        var3.field3772 = arg0 - -1 + 5;
        var3.field3751 = -1;
        var3.field3759 = arg2 + 1 + arg1;
        var3.field3756 = new int[var3.field3772][var3.field3759];
        var3.method1704(true);
        return var3;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)[I", line = 119)
    public final int[] method14(byte arg0, int arg1) {
        ++field3796;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            field3801 = null;
        }
        if (super.field3024.field6135) {
            int var4 = class56.field909[arg1];
            if (~this.field3798 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field3791; ++var6) {
                    if (var4 >= this.field3788[var6] && ~var4 > ~this.field3788[var6 + 1]) {
                        if (var4 < this.field3790[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class415.method2422(var3, 0, class399.field5585, var5);
            } else {
                for (int var7 = 0; var7 < class399.field5585; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class436.field5989[var7];
                    int var11 = this.field3798;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field3791 > var12; ++var12) {
                        if (~var8 <= ~this.field3788[var12] && ~var8 > ~this.field3788[var12 - -1]) {
                            if (~this.field3790[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V", line = 238)
    public static void method1722(int arg0) {
        if (arg0 != 65535) {
            field3794 = null;
        }
        field3800 = null;
        field3794 = null;
        field3801 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V", line = 258)
    public final void method12(int arg0) {
        this.method1720((byte) -68);
        if (arg0 == 27108) {
            ++field3787;
        }
    }
}
