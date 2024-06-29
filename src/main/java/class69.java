import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1102 = 2;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[I")
    public static int[] field1108 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Z")
    public static boolean field1101 = true;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[Z")
    public static boolean[] field1105 = new boolean[100];

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lsb;")
    public static class98 field1103 = class47.method368("slr2)3ws?order=LPWM", 0);

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lsb;")
    private static class98 field1109 = class47.method368("shake:", 0);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lsb;")
    public static class98 field1106 = field1109;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Lsb;")
    public static class98 field1104 = field1109;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method476(int arg0) {
        field1109 = null;
        field1105 = null;
        field1108 = null;
        field1104 = null;
        field1103 = null;
        if (arg0 != 2) {
            field1108 = null;
        }
        field1106 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
    public static final void method477(int arg0, boolean arg1) {
        class88.field1552 = 99;
        class162.field2925 = new int[104];
        class72.field1191 = new int[104];
        class226.field3889 = new int[104];
        class203.field3479 = new int[104];
        field1107++;
        class255.field4530 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class117.field2098 = new byte[var2][104][104];
        class233.field4006 = new byte[var2][104][104];
        class228.field3924 = new byte[var2][104][104];
        class103.field1834 = new byte[var2][104][104];
        class216.field3683 = new int[var2][105][105];
        if (arg0 <= 87) {
            field1106 = null;
        }
        class135.field2392 = new byte[var2][105][105];
    }
}
