import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class210 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lwe;")
    public static class147 field3729 = new class147(64);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Leg;")
    public static class33 field3730 = null;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Le;")
    public static class191 field3731 = class54.method368("(U0a )2 non)2existant gosub script)2num: ", 2047);

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        if (arg0 != -49) {
            field3729 = null;
        }
        field3731 = null;
        field3730 = null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Le;Z)V")
    public static final void method1447(class191 arg0, boolean arg1) {
        field3728++;
        if (class181.field3106 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1352(65);
        if (var3 == 0L) {
            return;
        }
        while (class181.field3106.length > var2 && class181.field3106[var2].field1713 != var3) {
            var2++;
        }
        if (class181.field3106.length > var2 && class181.field3106[var2] != null) {
            class36.field656++;
            class53.field963.method1096(68, 0);
            class53.field963.method1589(class181.field3106[var2].field1713, arg1);
        }
    }
}
