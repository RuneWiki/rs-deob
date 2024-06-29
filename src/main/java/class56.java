import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class56 extends class23 {

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lmf;")
    public static class136 field1073 = null;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Ldj;")
    public static class44 field1075;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Ldj;")
    public static class44 field1076;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field1076 = null;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -111);
        if (super.field405.field4114) {
            int[][] var4 = this.method159(0, (byte) -60, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class199.field3705; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        ++field1074;
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1075 = null;
        if (arg0 == 1) {
            field1073 = null;
            field1076 = null;
        }
    }
}
