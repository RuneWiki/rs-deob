import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 extends class204 {

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "[I")
    public static int[] field634 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public static int field635 = 1;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "I")
    public static int field637 = 0;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Ljava/lang/String;")
    public static String field636 = "K";

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Lqj;")
    public static class238 field640;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "[[[B")
    public static byte[][][] field639;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 15)
    public static final void method308(int arg0) {
        class57.field821 = arg0;
        for (int var1 = 0; var1 < class308.field4403; var1++) {
            for (int var2 = 0; var2 < class413.field6175; var2++) {
                if (class343.field5032[arg0][var1][var2] == null) {
                    class343.field5032[arg0][var1][var2] = new class10(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(BI)V", line = 45)
    public static final void method309(byte arg0, int arg1) {
        field638++;
        if (arg0 == 99) {
            class115.field1564 = -1;
            class133.field1778 = arg1;
            class115.field1564 = -1;
            class363.method2383(127);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 59)
    public static void method310(boolean arg0) {
        field640 = null;
        field636 = null;
        if (!arg0) {
            field640 = null;
        }
        field634 = null;
        field639 = null;
    }
}
