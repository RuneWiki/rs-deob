import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class53 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[J")
    public static long[] field684 = new long[100];

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Leh;")
    public static class137 field683;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static void method303(boolean arg0) {
        if (!arg0) {
            method303(true);
        }
        field683 = null;
        field684 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method304(byte arg0) {
        class88.field1082.method1699(arg0 + 65);
        field685++;
        if (arg0 == -65) {
            class234.field3867.method1699(arg0 + 65);
        }
    }
}
