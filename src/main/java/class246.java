import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class246 extends class337 {

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    private int field3864 = 4096;

    @OriginalMember(owner = "client!uv", name = "E", descriptor = "I")
    private int field3867 = 4096;

    @OriginalMember(owner = "client!uv", name = "F", descriptor = "I")
    private int field3868 = 4096;

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "Lqu;")
    public static class65 field3865 = new class65(12, 0, 1, 0);

    @OriginalMember(owner = "client!uv", name = "D", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!uv", name = "G", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!uv", name = "H", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method673(int arg0, int arg1) {
        ++field3866;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[][] var4 = this.method2123(arg0, 0, -122);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class402.field5977 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3864 * var12 >> 12;
                    var9[var11] = this.field3867 * var13 >> 12;
                    var10[var11] = this.field3868 * var14 >> 12;
                } else {
                    var8[var11] = this.field3864;
                    var9[var11] = this.field3867;
                    var10[var11] = this.field3868;
                }
            }
        }
        int var15 = -72 / ((arg1 - -41) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V", line = 81)
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "(I)V", line = 70)
    public static void method1668(int arg0) {
        if (arg0 != 26198) {
            method1669(-120, 76, (byte) -25, 18);
        }
        field3865 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIBI)V", line = 91)
    public static final void method1669(int arg0, int arg1, byte arg2, int arg3) {
        class71.field1020.method1566(true, arg1);
        ++field3870;
        int var4 = 65 / ((arg2 - 50) / 58);
        class71.field1020.method1542(arg0, -2756);
        class71.field1020.method1542(arg3, -2756);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BILhp;)V", line = 107)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 123 % ((82 - arg0) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3868 = arg2.method1511(114);
                }
            } else {
                this.field3867 = arg2.method1511(114);
            }
        } else {
            this.field3864 = arg2.method1511(-88);
        }
        ++field3869;
    }
}
