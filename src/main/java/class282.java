import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class282 {

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3867 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lng;")
    public static class190 field3866 = new class190(64);

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3868 = "M";

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1827(int arg0) {
        field3868 = null;
        field3866 = null;
        if (arg0 != -1) {
            method1827(89);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZI)I")
    public static final int method1828(int arg0, int arg1, boolean arg2, int arg3) {
        field3865++;
        class124 var4 = (class124) class71.field1103.method1412((byte) -54, (long) arg0);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg1; var6 < var4.field1744.length; var6++) {
            if (var4.field1744[var6] >= 0 && class113.field1661 > var4.field1744[var6]) {
                class389 var7 = class347.method2222(var4.field1744[var6], 18682);
                int var8 = var7.method2544(28633, arg3, class313.method1983(arg1 - 119, arg3).field4191);
                if (arg2) {
                    var5 += var4.field1740[var6] * var8;
                } else {
                    var5 += var8;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static final void method1829(int arg0) {
        class394.field5764 = arg0;
        class184.field2575 = -1;
        class254.field3486 = 0;
        field3864++;
    }
}
