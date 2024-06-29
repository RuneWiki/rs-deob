import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class106 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ljj;")
    public static class398 field1272 = new class398(11, 3);

    @OriginalMember(owner = "client!so", name = "b", descriptor = "Ljv;")
    public static class606 field1273 = new class606(8, 1);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method565(int arg0) {
        field1272 = null;
        field1273 = null;
        if (arg0 != 0) {
            method565(-65);
        }
    }
}
