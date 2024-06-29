import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class124 extends class372 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lra;")
    public static class361 field1604 = new class361(112, 8);

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lra;")
    public static class361 field1605 = new class361(8, 8);

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lgaa;")
    public static class432 field1606 = new class432();

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[[B")
    public static byte[][] field1607;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method913(int arg0) {
        if (arg0 > 82) {
            field1605 = null;
            field1604 = null;
            field1607 = null;
            field1606 = null;
        }
    }
}
