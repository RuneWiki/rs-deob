import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class97 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "S")
    public static short field1313 = 320;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1312 = 0;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1315 = "glow3:";

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Lkm;")
    public static class133 field1311;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lkm;")
    public static class133 field1314;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 8)
    public static void method707(boolean arg0) {
        field1311 = null;
        field1314 = null;
        if (!arg0) {
            field1315 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V", line = 22)
    public static final void method708(int arg0, int arg1) {
        class204.field2938--;
        field1309++;
        if (class204.field2938 == arg0) {
            return;
        }
        class281.method1945(class111.field1487, arg0 + 1, class111.field1487, arg0, class204.field2938 - arg0);
        class281.method1945(class88.field1251, arg0 + 1, class88.field1251, arg0, class204.field2938 - arg0);
        class281.method1940(class135.field1868, arg0 + 1, class135.field1868, arg0, class204.field2938 - arg0);
        int var2 = 51 % ((-arg1 - 45) / 59);
        class281.method1938(class54.field722, arg0 + 1, class54.field722, arg0, class204.field2938 - arg0);
        class281.method1942(class230.field3264, arg0 + 1, class230.field3264, arg0, class204.field2938 - arg0);
        class281.method1940(class334.field5049, arg0 + 1, class334.field5049, arg0, class204.field2938 - arg0);
        class281.method1940(class20.field252, arg0 + 1, class20.field252, arg0, class204.field2938 - arg0);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIB)I", line = 44)
    public static final int method709(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 95) {
            return -80;
        } else {
            int var5 = 65536 - class184.field2532[arg0 * 1024 / arg2] >> 1;
            field1310++;
            return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
        }
    }
}
