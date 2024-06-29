import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
    public static int[] field2 = new int[6];

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lni;")
    public class522 field1;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V")
    public static void method1(boolean arg0) {
        if (!arg0) {
            method1(false);
        }
        field2 = null;
    }
}
