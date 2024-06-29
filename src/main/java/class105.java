import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class105 {

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Lkr;")
    public static class602 field1432 = new class602(55, -1);

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 5)
    public static void method689(int arg0) {
        field1432 = null;
        int var1 = -123 % ((arg0 - 10) / 57);
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)Ldga;", line = 22)
    public static final class479 method690(int arg0) {
        field1431++;
        if (arg0 != 26402) {
            field1432 = null;
        }
        return class65.method524(95, 1);
    }
}
