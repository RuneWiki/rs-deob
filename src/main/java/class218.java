import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class218 extends class89 {

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    private int field3850 = 4096;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "Lha;")
    public static class46 field3846 = class271.method1828("::qa_op_test", -46);

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "Lha;")
    private static class46 field3855 = class271.method1828("K", -46);

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "Lha;")
    public static class46 field3847 = field3855;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "Lha;")
    public static class46 field3849 = field3855;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "Lha;")
    public static class46 field3854 = class271.method1828("sch-Utteln:", -46);

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "[I")
    public static int[] field3856 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "[Lhh;")
    public static class263[] field3848;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "[[[B")
    public static byte[][][] field3852;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field3844;
        int var3 = 113 / ((51 - arg1) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(52, arg0 + -1 & class231.field4015, 0);
            int[] var6 = this.method685(78, arg0, 0);
            int[] var7 = this.method685(-99, arg0 + 1 & class231.field4015, 0);
            for (int var8 = 0; class241.field4284 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field3850;
                int var10 = (var6[class115.field2177 & var8 - -1] - var6[var8 + -1 & class115.field2177]) * this.field3850;
                int var11 = var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = var11 * var11 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 - -var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 == -1 ? 0 : 16777216 / var15;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static void method1519(int arg0) {
        if (arg0 >= 48) {
            field3854 = null;
            field3849 = null;
            field3855 = null;
            field3856 = null;
            field3847 = null;
            field3846 = null;
            field3852 = null;
            field3848 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3850 = arg0.method545((byte) -96);
        }
        ++field3845;
        if (arg1 != -641641492) {
            field3855 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIII)I")
    public static final int method1520(int arg0, int arg1, int arg2, int arg3) {
        ++field3857;
        if ((8 & class111.field2081[arg2][arg0][arg1]) != 0) {
            return 0;
        } else if (arg2 > 0 && ~(class111.field2081[1][arg0][arg1] & 2) != -1) {
            return arg2 + -1;
        } else {
            return arg3 != 21944 ? -1 : arg2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class218() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method1521(int arg0, int arg1) {
        class194.field3490 = arg1;
        if (arg0 != 0) {
            field3854 = null;
        }
        ++field3851;
        class146.field2644 = -1;
        class146.field2644 = -1;
        class212.method1498(-111);
    }
}
