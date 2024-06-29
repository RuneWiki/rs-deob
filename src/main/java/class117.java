import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class117 extends class223 {

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Lie;")
    public static class32 field1726;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)V")
    public static final void method778(int arg0, byte arg1) {
        class63.field888 = arg0;
        class10.field147 = 20;
        int var2 = -116 % ((-arg1 - 28) / 41);
        class78.field1111 = 3;
        field1725++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method779(boolean arg0) {
        field1726 = null;
        if (arg0) {
            method778(-4, (byte) 116);
        }
    }
}
