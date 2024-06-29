import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class112 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
    public static int[] field1594 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public static int[] field1596 = new int[14];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Leh;")
    public static class137 field1599;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1599 = null;
        field1594 = null;
        if (arg0 > -117) {
            field1598 = -115;
        }
        field1596 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method721(int arg0) {
        field1595++;
        class28.field396.method1699(arg0 + arg0);
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
    public static final void method722(int arg0) {
        class124.field1929.method1701((byte) 43);
        class206.field3290.method1701((byte) 98);
        field1600++;
        class189.field3067.method1701((byte) 125);
        if (arg0 != 1) {
            field1594 = null;
        }
    }
}
