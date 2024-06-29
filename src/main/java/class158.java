import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class158 extends class89 {

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field2807 = 1;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field2806 = 1;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    private int field2816 = 204;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lha;")
    public static class46 field2810 = class271.method1828("Eingabeprozedur geladen)3", -46);

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lha;")
    public static class46 field2809 = class271.method1828("<)4col> x", -46);

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lha;")
    public static class46 field2815 = class271.method1828("<col=ffff00>", -46);

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "Lha;")
    public static class46 field2813 = class271.method1828("Ablegen", -46);

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "[Lpa;")
    public static class258[] field2818 = new class258[27];

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "[I")
    public static int[] field2808;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V")
    public static void method1160(byte arg0) {
        field2809 = null;
        field2818 = null;
        if (arg0 != -108) {
            field2818 = null;
        }
        field2815 = null;
        field2808 = null;
        field2810 = null;
        field2813 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILha;Lha;Lha;)V")
    public static final void method1161(int arg0, int arg1, class46 arg2, class46 arg3, class46 arg4) {
        class92.method720((byte) 79, arg4, arg2, arg1, arg0, arg3);
        ++field2814;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lha;I)Z")
    public static final boolean method1162(class46 arg0, int arg1) {
        ++field2811;
        if (arg0 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg1 != 1) {
                field2812 = -73;
            }
            while (~var2 > ~class97.field1806) {
                if (arg0.method315((byte) -38, class3.field37[var2])) {
                    return true;
                }
                ++var2;
            }
            return arg0.method315((byte) -38, class277.field4824.field1528);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            field2815 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2816 = arg0.method545((byte) -105);
                }
            } else {
                this.field2806 = arg0.method558(1);
            }
        } else {
            this.field2807 = arg0.method558(1);
        }
        ++field2817;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -116 % ((51 - arg1) / 44);
        ++field2819;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            for (int var5 = 0; ~var5 > ~class241.field4284; ++var5) {
                int var6 = class259.field4523[var5];
                int var7 = class87.field1652[arg0];
                int var8 = this.field2807 * var6 >> 12;
                int var9 = var7 % (4096 / this.field2806) * this.field2806;
                int var10 = var6 % (4096 / this.field2807) * this.field2807;
                int var11 = this.field2806 * var7 >> 12;
                if (var9 < this.field2816) {
                    for (var8 -= var11; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (var10 < this.field2816) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (~var10 > ~this.field2816) {
                    int var12;
                    for (var12 = var8 - var11; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }
}
