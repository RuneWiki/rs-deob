import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class281 {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field4962 = 0;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lvf;")
    private static class265 field4958 = class87.method582(-46, "Hidden");

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lvf;")
    private static class265 field4953 = class87.method582(-46, "");

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lvf;")
    public static class265 field4963 = field4953;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    public static int[] field4964 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lvf;")
    public static class265 field4960 = field4958;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lve;")
    public static class226 field4957;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Z")
    public static boolean field4956;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4959++;
        if (class202.method1390(2, arg3)) {
            if (arg4 < -97) {
                class80.field1517 = null;
                class231.method1559(-117, arg0, arg6, class178.field3174[arg3], arg5, arg7, arg8, arg2, -1, arg1);
                if (class80.field1517 != null) {
                    class231.method1559(-128, arg0, arg6, class80.field1517, arg5, class63.field1242, arg8, field4952, -1412584499, arg1);
                    class80.field1517 = null;
                }
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class135.field2481[var9] = true;
            }
        } else {
            class135.field2481[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method1913(boolean arg0) {
        field4953 = null;
        field4964 = null;
        if (arg0) {
            method1914(34, 101);
        }
        field4958 = null;
        field4960 = null;
        field4963 = null;
        field4957 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method1914(int arg0, int arg1) {
        field4954++;
        if (!class202.method1390(arg0 + 3, arg1)) {
            return;
        }
        class6[] var2 = class178.field3174[arg1];
        if (arg0 != -1) {
            field4953 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4 != null) {
                var4.field174 = 0;
                var4.field152 = 0;
            }
        }
    }
}
