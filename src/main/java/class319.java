import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class319 {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "Lsb;")
    public static class266 field4692 = new class266(57, 8);

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "Lhga;")
    public static class158 field4694 = new class158();

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Laj;")
    public static class287 field4696 = new class287(5);

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "Lqfa;")
    public static class85 field4697 = new class85(55, 10);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)[Lph;")
    public static final class598[] method2053(byte arg0) {
        if (arg0 < 82) {
            return null;
        } else {
            field4693++;
            return new class598[] { class157.field2681, class654.field9411, class82.field1599, class343.field5107, class699.field9833, class147.field2548, class624.field9022, class230.field3462, class536.field7507, class165.field2754 };
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method2054(int arg0) {
        field4697 = null;
        field4694 = null;
        if (arg0 != -7300) {
            field4692 = null;
        }
        field4692 = null;
        field4696 = null;
    }

    @OriginalMember(owner = "client!ow", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4695++;
        throw new IllegalStateException();
    }
}
