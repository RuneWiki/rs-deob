import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class495 extends class325 {

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "I")
    public static int field6845 = 100;

    @OriginalMember(owner = "client!cq", name = "E", descriptor = "[F")
    public static float[] field6847 = new float[4];

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "[Lada;")
    public static class174[] field6850 = new class174[1024];

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "Lb;")
    public static class354 field6846;

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "Lke;")
    public static class625 field6848;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method100(byte arg0, int arg1) {
        ++field6849;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 < 21) {
            field6850 = null;
        }
        if (super.field4727.field6067) {
            int[][] var4 = this.method2063(0, 1, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class261.field3874; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 49)
    public class495() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(B)V", line = 66)
    public static void method2868(byte arg0) {
        field6848 = null;
        if (arg0 != 44) {
            field6848 = null;
        }
        field6846 = null;
        field6850 = null;
        field6847 = null;
    }
}
