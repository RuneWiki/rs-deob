import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class153 {

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field1946 = 500;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lvd;")
    public static class635 field1947 = null;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 7)
    public static void method1110(int arg0) {
        if (arg0 != 500) {
            method1110(-43);
        }
        field1947 = null;
    }
}
