import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class70 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static volatile int field1059 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1058 = 0;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[S")
    public static short[] field1061 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1062 = -1;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
    public static int[] field1060 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 20)
    public static void method565(byte arg0) {
        if (arg0 != 98) {
            field1062 = 54;
        }
        field1061 = null;
        field1060 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method566(boolean arg0) {
        field1063++;
        for (int var1 = 0; var1 < class88.field1420; var1++) {
            int var2 = class251.field3708[var1];
            class92 var3 = class74.field1140[var2];
            int var4 = class80.field1248.method15((byte) -28);
            if ((var4 & 0x4) != 0) {
                var4 += class80.field1248.method15((byte) -46) << 8;
            }
            class221.method1609(var4, true, var3, var2);
        }
        if (!arg0) {
            field1059 = 89;
        }
    }
}
