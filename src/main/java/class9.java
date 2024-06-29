import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
    public static int[] field161 = new int[4];

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Lag;")
    public static class97 field165 = new class97();

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "F")
    public static float field166;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method85(int arg0) {
        if (arg0 == 0) {
            field161 = null;
            field165 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static final void method86(byte arg0) {
        if (arg0 != 94) {
            method85(-21);
        }
        field163++;
        if (class192.field2752) {
            class211.field3034 = null;
            class104.field1543 = null;
            class192.field2752 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static final void method87(boolean arg0) {
        if (arg0) {
            class202.field2917.method257(false);
            field162++;
        }
    }
}
