import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class163 extends class115 {

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field2790 = 1365;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field2791 = 20;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    private int field2789 = 0;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    private int field2802 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "Lqe;")
    public static class168 field2796 = class66.method448("<img=1>", 83);

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Lug;")
    public static class57 field2797 = new class57();

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field2798 = -1;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lqe;")
    public static class168 field2799 = class66.method448("null", -118);

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "[I")
    public static int[] field2800 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lmj;")
    public static class129 field2801 = null;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Loe;IILoe;I)Lnc;")
    public static final class136 method1054(class256 arg0, int arg1, int arg2, class256 arg3, int arg4) {
        if (arg2 != -137675668) {
            field2798 = 118;
        }
        ++field2794;
        return !class9.method34(arg4, arg3, (byte) -16, arg1) ? null : class3.method20(arg0.method1712(arg1, arg4, -1), -44);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field2789 = arg1.method731(false);
                    }
                } else {
                    this.field2802 = arg1.method731(false);
                }
            } else {
                this.field2791 = arg1.method731(false);
            }
        } else {
            this.field2790 = arg1.method731(false);
        }
        if (arg0 == 107) {
            ++field2793;
        }
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V")
    public static void method1055(int arg0) {
        field2797 = null;
        field2796 = null;
        field2801 = null;
        field2800 = null;
        if (arg0 == 0) {
            field2799 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method1056(Random arg0, int arg1, int arg2) {
        ++field2804;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg2 <= 93) {
                field2792 = -7;
            }
            if (class240.method1566(arg1, false)) {
                return (int) (((long) arg0.nextInt() & 4294967295L) * (long) arg1 >> 32);
            } else {
                int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (~var3 >= ~var4);
                return class107.method704(-114, arg1, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 < 37) {
            field2796 = null;
        }
        ++field2795;
        int[] var3 = super.field1872.method182((byte) -105, arg0);
        if (super.field1872.field341) {
            for (int var4 = 0; ~var4 > ~class130.field2297; ++var4) {
                int var5 = (class170.field2963[arg0] << 12) / this.field2790 + this.field2789;
                int var6 = (class193.field3367[var4] << 12) / this.field2790 + this.field2802;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && ~this.field2791 < ~var13) {
                    ++var13;
                    var10 = (var8 * var10 >> 12) * 2 + var7;
                    var8 = -var12 + var11 + var9;
                    var11 = var8 * var8 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field2791 + -1) ? (var13 << 12) / this.field2791 : 0;
            }
        }
        return var3;
    }
}
