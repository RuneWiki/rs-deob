import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class81 {

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Loh;")
    public static class263 field1607 = class253.method1681(-123, ")1o");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Llb;")
    public static class127 field1605 = new class127(64);

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Loh;")
    private static class263 field1612 = class253.method1681(-118, "Created gameworld");

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Loh;")
    public static class263 field1608 = field1612;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lqf;")
    public static class235 field1610;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lue;")
    public static class86 field1609;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Z")
    public static boolean field1611;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method547(int arg0) {
        field1607 = null;
        if (arg0 < 11) {
            field1608 = null;
        }
        field1605 = null;
        field1612 = null;
        field1608 = null;
        field1610 = null;
        field1609 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method548(boolean arg0, int arg1) {
        field1606++;
        if (arg1 == 100 && class266.field4642 > 0) {
            byte[] var2 = class75.field1547[--class266.field4642];
            class75.field1547[class266.field4642] = null;
            return var2;
        } else if (arg1 == 5000 && class173.field3152 > 0) {
            byte[] var3 = class177.field3252[--class173.field3152];
            class177.field3252[class173.field3152] = null;
            return var3;
        } else if (arg1 == 30000 && class8.field176 > 0) {
            byte[] var4 = class261.field4544[--class8.field176];
            class261.field4544[class8.field176] = null;
            return var4;
        } else {
            if (!arg0) {
                field1611 = true;
            }
            return new byte[arg1];
        }
    }
}
