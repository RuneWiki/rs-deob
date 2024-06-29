import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class27 {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lfp;")
    public static class437 field390 = new class437(7, 0, 1, 1);

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lya;")
    public static class11 field395;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lqu;")
    public static class295 field392;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
    public static int[] field393;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        if (arg0 < -64) {
            field395 = null;
            field393 = null;
            field390 = null;
            field392 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBZIIIIII)Z")
    public static final boolean method262(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field391++;
        int var9 = class410.field6198.field6065[0];
        int var10 = class410.field6198.field6068[0];
        if (arg1 > -115) {
            method261(-36);
        }
        if (var9 < 0 || class50.field640 <= var9 || var10 < 0 || var10 >= class448.field6611) {
            return false;
        } else if (arg7 >= 0 && arg7 < class50.field640 && arg3 >= 0 && class448.field6611 > arg3) {
            int var11 = class282.method1758(class410.field6198.method2419((byte) 104), var9, class476.field7013, arg4, arg3, class25.field373, arg6, arg2, arg5, arg8, class151.field2300[class410.field6198.field7686], var10, 87, arg0, arg7);
            if (var11 < 1) {
                return false;
            }
            class504.field7423 = class25.field373[var11 - 1];
            class182.field2702 = class476.field7013[var11 - 1];
            class94.field1462 = false;
            class125.method920(15);
            return true;
        } else {
            return false;
        }
    }
}
