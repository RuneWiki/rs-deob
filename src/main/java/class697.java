import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class697 extends class667 {

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field9804 = -1;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Lpu;")
    public static class559 field9801 = new class559(4, 19);

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[[B")
    public static byte[][] field9800;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method117(byte arg0, int arg1) {
        ++field9803;
        if (arg0 > -87) {
            field9800 = null;
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class77.field1455 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V", line = 44)
    public static void method3915(boolean arg0) {
        field9801 = null;
        if (!arg0) {
            field9800 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ldm;I)V", line = 56)
    public static final void method3916(class50 arg0, int arg1) {
        ++field9802;
        class50 var2 = class202.method1412(13493, arg0);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field830;
            var4 = var2.field783;
        } else {
            var3 = class363.field5105;
            var4 = class206.field2956;
        }
        class284.method1857(var4, var3, false, arg0, -1031130194);
        if (arg1 != 1) {
            field9800 = null;
        }
        class47.method430(var4, true, var3, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 83)
    public static final void method3917(byte arg0) {
        class545.field7692.method3048(false);
        ++field9805;
        if (arg0 >= -111) {
            field9801 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 103)
    public class697() {
        super(1, true);
    }
}
