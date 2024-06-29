import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class124 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field2207 = 0;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field2205 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1071(boolean arg0) {
        field2205 = null;
        if (arg0) {
            field2205 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V", line = 17)
    public static final void method1072(boolean arg0, int arg1) {
        field2204++;
        class111.field1911.method2823(true, class111.field1911.field6756, 0);
        class111.field1911.method2823(true, class111.field1911.field6734, 0);
        class111.field1911.method2823(true, class111.field1911.field6728, 1);
        class111.field1911.method2823(true, class111.field1911.field6722, 1);
        class111.field1911.method2823(true, class111.field1911.field6716, 0);
        class111.field1911.method2823(true, class111.field1911.field6765, 0);
        class111.field1911.method2823(true, class111.field1911.field6754, 0);
        class111.field1911.method2823(true, class111.field1911.field6739, 0);
        class111.field1911.method2823(true, class111.field1911.field6718, 0);
        class111.field1911.method2823(true, class111.field1911.field6742, 0);
        class111.field1911.method2823(true, class111.field1911.field6717, 0);
        class111.field1911.method2823(true, class111.field1911.field6743, 0);
        class111.field1911.method2823(true, class111.field1911.field6749, 0);
        class111.field1911.method2823(true, class111.field1911.field6735, 0);
        int var2 = -17 / ((-arg1 - 82) / 35);
        class111.field1911.method2823(true, class111.field1911.field6715, 0);
        class111.field1911.method2823(true, class111.field1911.field6744, 0);
        class111.field1911.method2823(true, class111.field1911.field6733, 0);
        class111.field1911.method2823(true, class111.field1911.field6764, 0);
        class111.field1911.method2823(true, class111.field1911.field6760, 0);
        class421.method2480((byte) -61);
        class111.field1911.method2823(true, class111.field1911.field6758, 2);
        class111.field1911.method2823(true, class111.field1911.field6750, 1);
        class463.method2677(-53);
        class596.method3394(9);
        class235.field3375 = true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 53)
    public static final int method1073(String arg0, int arg1) {
        field2206++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 >= -71) {
            return 40;
        } else {
            for (int var4 = 0; var4 < var2; var4++) {
                var3 = (var3 << 5) - (var3 - class687.method3863(arg0.charAt(var4), (byte) -106));
            }
            return var3;
        }
    }
}
