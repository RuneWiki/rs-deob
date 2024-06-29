import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class635 extends class642 {

    @OriginalMember(owner = "client!hda", name = "D", descriptor = "Lvf;")
    public static class87 field9152 = new class87();

    @OriginalMember(owner = "client!hda", name = "F", descriptor = "Lvg;")
    public static class622 field9154 = new class622(37, 0);

    @OriginalMember(owner = "client!hda", name = "C", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!hda", name = "E", descriptor = "Lut;")
    public static class616 field9153;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
    public static void method3636(byte arg0) {
        field9154 = null;
        field9152 = null;
        field9153 = null;
        int var1 = -19 / ((arg0 - 86) / 32);
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field9151;
        int[] var3 = super.field9216.method1185(arg0, -95);
        if (arg1 != -9) {
            return null;
        } else {
            if (super.field9216.field2418) {
                int[][] var4 = this.method3657(arg0, true, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class338.field4909 > var8; ++var8) {
                    var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "()V")
    public class635() {
        super(1, true);
    }
}
