import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class277 extends class56 {

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Lht;")
    public static class581 field3919 = new class581();

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "Lqfa;")
    public static class98 field3921 = new class98(106, 6);

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "D")
    public static double field3924;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Lvl;")
    public static class13 field3922;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZI)I", line = 5)
    private final int method1805(int arg0, boolean arg1, int arg2) {
        ++field3918;
        int var4 = arg2 * 57 + arg0;
        if (!arg1) {
            return 56;
        } else {
            int var5 = var4 ^ var4 << 1;
            return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)[I", line = 19)
    public final int[] method24(int arg0, boolean arg1) {
        ++field3923;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            field3924 = 1.4861288448381387D;
        }
        if (super.field673.field8073) {
            int var4 = class720.field10000[arg0];
            for (int var5 = 0; ~var5 > ~class328.field4576; ++var5) {
                var3[var5] = this.method1805(class132.field1945[var5], true, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 52)
    public static void method1806(int arg0) {
        int var1 = 17 / ((arg0 - -13) / 34);
        field3919 = null;
        field3922 = null;
        field3921 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIB)V", line = 63)
    public static final void method1807(int arg0, int arg1, byte arg2) {
        ++field3920;
        class592 var3 = class682.method3825(-652872096, 16, arg1);
        var3.method3351(0);
        if (arg2 <= -99) {
            var3.field8337 = arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 83)
    public class277() {
        super(0, true);
    }
}
