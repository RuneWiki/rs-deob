import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class462 {

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Leba;")
    public static class550 field6064 = new class550(35, -2);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public int field6063;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public int field6065;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public int field6067;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V", line = 7)
    public static final void method2585(byte arg0) {
        field6062++;
        if (class642.field8877 != null) {
            for (int var1 = 0; var1 < class408.field5370; var1++) {
                class642.field8877[var1] = null;
            }
            class642.field8877 = null;
        }
        if (class688.field9712 != null) {
            for (int var2 = 0; var2 < class174.field2469; var2++) {
                class688.field9712[var2] = null;
            }
            class688.field9712 = null;
        }
        if (class64.field805 != null) {
            for (int var3 = 0; var3 < class113.field1433; var3++) {
                class64.field805[var3] = null;
            }
            class64.field805 = null;
        }
        if (arg0 >= -11) {
            method2585((byte) -58);
        }
        class50.field584 = null;
        class442.field5873 = -1;
        class6.field65 = -1;
        class685.field9689 = null;
        class429.field5777 = null;
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(B)V", line = 65)
    public static void method2586(byte arg0) {
        field6064 = null;
        if (arg0 <= 3) {
            method2585((byte) 122);
        }
    }
}
