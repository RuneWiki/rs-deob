import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class16 extends class4 {

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "Lvt;")
    public static class344 field166 = new class344("K", "T", "K", "K");

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "[I")
    public static int[] field168 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "Lkr;")
    public static class329 field170;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
    public static void method74(byte arg0) {
        field166 = null;
        field168 = null;
        if (arg0 > -109) {
            field168 = null;
        }
        field170 = null;
    }

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "(I)V")
    public static final void method75(int arg0) {
        class598.field8638 = 0;
        class281.field3673 = -1;
        class308.field3942 = -1;
        class64.field868 = -1;
        if (arg0 < 62) {
            field170 = null;
        }
        ++field167;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field169;
        if (arg0 != 10) {
            return null;
        } else {
            int[] var3 = super.field31.method2252(arg1, 11);
            if (super.field31.field5127) {
                int[][] var4 = this.method22(arg1, (byte) -95, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; var8 < class132.field1627; ++var8) {
                    var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, true);
    }
}
