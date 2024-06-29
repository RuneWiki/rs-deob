import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class95 extends class335 {

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "Leba;")
    public static class550 field1146 = new class550(86, 10);

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Leba;")
    public static class550 field1149 = new class550(53, -1);

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "[I")
    public static int[] field1150 = new int[32];

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V", line = 3)
    public static void method539(int arg0) {
        field1149 = null;
        if (arg0 >= 96) {
            field1150 = null;
            field1146 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V", line = 16)
    public static final void method540(int arg0) {
        ++field1147;
        class610.field8468.method1041(((float) class602.field8408.field4303 * 0.1F + 0.7F) * 1.1523438F);
        class610.field8468.method1060(class381.field5038, 0.69921875F, 1.2F, (float) arg0, -240.0F, -200.0F);
        class610.field8468.method1073(class129.field1801, -1, 0);
        class610.field8468.method1048(class59.field745);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)[I", line = 28)
    public final int[] method3(boolean arg0, int arg1) {
        ++field1145;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            class2.method8(var3, 0, class649.field8968, class686.field9697[arg1]);
        }
        if (!arg0) {
            field1150 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 51)
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(III)Z", line = 67)
    public static final boolean method541(int arg0, int arg1, int arg2) {
        if (arg2 <= 25) {
            field1149 = null;
        }
        ++field1148;
        return class689.method3898(arg0, -1100, arg1) || class300.method1769((byte) -122, arg0, arg1);
    }
}
