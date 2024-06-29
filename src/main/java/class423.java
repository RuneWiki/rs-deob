import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class423 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method2520(byte arg0, int arg1) {
        int var2 = 67 % ((-arg0 - 6) / 35);
        field6100++;
        if (arg1 != -1 && class92.field1150[arg1]) {
            class101.field1229.method2751(arg1, (byte) -18);
            class284.field4130[arg1] = null;
            class92.field1150[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2521(byte arg0) {
        class223.field3099 = 0;
        if (arg0 > -51) {
            method2521((byte) -34);
        }
        field6101++;
        class485.field6882.method813(0);
        class385.field5517 = false;
    }
}
