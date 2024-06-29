import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class475 extends class326 {

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field6535 = 0;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field6540 = 0;

    @OriginalMember(owner = "client!pg", name = "Q", descriptor = "[B")
    public static byte[] field6538 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "Lh;")
    public static class434 field6541 = new class434(92, 6);

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
    public static int[] field6542 = new int[25];

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V", line = 21)
    public static void method2776(int arg0) {
        field6538 = null;
        field6541 = null;
        field6542 = null;
        if (arg0 != 1) {
            field6540 = 108;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method30(byte arg0, int arg1) {
        ++field6537;
        int[] var3 = super.field4344.method130(arg1, 122);
        if (arg0 > -6) {
            method2777(9);
        }
        if (super.field4344.field286) {
            int[][] var4 = this.method1828(0, true, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class181.field2495; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 71)
    public class475() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Lac;", line = 74)
    public static final class348 method2777(int arg0) {
        ++field6536;
        if (arg0 >= -104) {
            return null;
        } else {
            return ~class159.field2195.length < ~class374.field5165 ? class159.field2195[class374.field5165++] : null;
        }
    }
}
