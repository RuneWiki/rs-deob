import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class108 {

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "Lbu;")
    public static class21 field1603 = new class21(122, -1);

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I[ILwia;Lwia;)V")
    public static final void method831(int arg0, int[] arg1, class791 arg2, class791 arg3) {
        if (arg0 != 21322) {
            method832((byte) -122);
        }
        class452.field6351 = arg3;
        if (arg1 != null) {
            class63.field756 = arg1;
        }
        class268.field3900 = arg2;
        field1604++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method832(byte arg0) {
        field1603 = null;
        int var1 = -33 / ((24 - arg0) / 33);
    }
}
