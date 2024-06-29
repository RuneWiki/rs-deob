import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class352 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Llc;")
    public static class435 field5209 = new class435(31, 12);

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field5212 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Llc;")
    public static class435 field5211 = new class435(34, -1);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ljc;")
    public static class168 field5213 = new class168(7500);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V", line = 3)
    public static void method2242(int arg0) {
        field5209 = null;
        if (arg0 >= 7) {
            field5211 = null;
            field5213 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I", line = 24)
    public static final int method2243(int arg0) {
        int var1 = 106 % ((-arg0 - 5) / 53);
        field5210++;
        return class270.field3833 == 1 ? class72.field1098 : 0;
    }
}
