import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class250 extends class615 {

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    private int field3454 = 4096;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "I")
    private int field3458 = 0;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "Ljv;")
    public static class73 field3452 = new class73("", 15);

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field3456 = new Random();

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method8(int arg0, byte arg1) {
        ++field3457;
        int[] var3 = super.field8125.method298(arg0, arg1 ^ -20);
        if (super.field8125.field579) {
            int[] var4 = this.method3366(0, 997, arg0);
            for (int var5 = 0; ~class505.field6740 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field3458 > var6) {
                    var3[var5] = this.field3458;
                } else if (~var6 < ~this.field3454) {
                    var3[var5] = this.field3454;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        if (arg1 != -18) {
            this.field3454 = 116;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)[[I", line = 47)
    public final int[][] method223(int arg0, int arg1) {
        ++field3453;
        if (arg0 != 2) {
            method1529((byte) 15);
        }
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[][] var4 = this.method3368(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class505.field6740 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 > ~this.field3458) {
                    var8[var11] = this.field3458;
                } else if (var12 > this.field3454) {
                    var8[var11] = this.field3454;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 <= ~this.field3458) {
                    if (this.field3454 < var13) {
                        var9[var11] = this.field3454;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field3458;
                }
                if (this.field3458 <= var14) {
                    if (this.field3454 >= var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field3454;
                    }
                } else {
                    var10[var11] = this.field3458;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)V", line = 130)
    public static void method1529(byte arg0) {
        if (arg0 != 79) {
            field3456 = null;
        }
        field3456 = null;
        field3452 = null;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V", line = 152)
    public class250() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BILeh;)V", line = 158)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field8118 = arg2.method2034(255) == 1;
                }
            } else {
                this.field3454 = arg2.method2001((byte) -83);
            }
        } else {
            this.field3458 = arg2.method2001((byte) -83);
        }
        ++field3455;
        if (arg0 < 44) {
            this.method8(85, (byte) -51);
        }
    }
}
