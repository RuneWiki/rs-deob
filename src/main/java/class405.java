import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class405 {

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    public static int[] field6100 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field6101 = 1339;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field6102 = -1;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 15)
    public static void method2517(int arg0) {
        field6100 = null;
        if (arg0 != -26) {
            field6100 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lig;I)I", line = 28)
    public static final int method2518(class163 arg0, int arg1) {
        field6103++;
        class51 var2 = arg0.field2613;
        if (var2.field1038 != null) {
            var2 = var2.method475(class402.field6080, -1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1041;
        class166 var4 = arg0.method3169((byte) 23);
        if (arg0.field7781) {
            var3 = var2.field1037;
        } else if (arg0.field7800 == var4.field2684 || arg0.field7800 == var4.field2671 || arg0.field7800 == var4.field2644 || arg0.field7800 == var4.field2677) {
            var3 = var2.field1016;
        } else if (arg0.field7800 == var4.field2681 || arg0.field7800 == var4.field2659 || arg0.field7800 == var4.field2663 || arg0.field7800 == var4.field2640) {
            var3 = var2.field1031;
        }
        if (arg1 != -5662) {
            method2518(null, -98);
        }
        return var3;
    }
}
