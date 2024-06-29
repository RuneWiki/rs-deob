import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class27 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ljava/lang/String;")
    public static String field372 = "flash3:";

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Lcg;")
    public static class49 field369;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZLjc;I)V", line = 8)
    public static final void method246(boolean arg0, class323 arg1, int arg2) {
        if (arg2 != -151) {
            field372 = (String) null;
        }
        if (class43.field680 || arg0) {
            int var3 = class188.field3152;
            int var4 = var3 * 956 / 503;
            class38.field566.method1251((class313.field4973 - var4) / 2, 0, var4, var3);
            class202.field3436.method1596(class313.field4973 / 2 - (class202.field3436.field4054 / 2), 18);
        }
        field370++;
        arg1.method2237(class72.field1199 == 1 ? class277.field4411 : class11.field132, class313.field4973 / 2, class188.field3152 / 2 - 26, 16777215, -1);
        int var5 = class188.field3152 / 2 - 18;
        if (class43.field680) {
            class169.method1325(class313.field4973 / 2 - 152, var5, 304, 34, 9179409);
            class169.method1325(class313.field4973 / 2 - 151, var5 + 1, 302, 32, 0);
            class169.method1337(class313.field4973 / 2 - 150, var5 + 2, class215.field3618 * 3, 30, 9179409);
            class169.method1337(class313.field4973 / 2 + class215.field3618 * 3 - 150, var5 + 2, 300 - (class215.field3618 * 3), 30, 0);
        } else {
            class47.method416(class313.field4973 / 2 - 152, var5, 304, 34, 9179409);
            class47.method416(class313.field4973 / 2 - 151, var5 + 1, 302, 32, 0);
            class47.method422(class313.field4973 / 2 - 150, var5 - -2, class215.field3618 * 3, 30, 9179409);
            class47.method422(class313.field4973 / 2 + class215.field3618 * 3 - 150, var5 + 2, 300 - (class215.field3618 * 3), 30, 0);
        }
        arg1.method2237(class317.field5034, class313.field4973 / 2, class188.field3152 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 51)
    public static void method247(int arg0) {
        field369 = null;
        if (arg0 != 0) {
            method249((class137) null, 126);
        }
        field372 = null;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 66)
    public static final void method248(int arg0) {
        int var1 = 53 / ((arg0 + 38) / 51);
        for (class228 var2 = (class228) class172.field2972.method736(2); var2 != null; var2 = (class228) class172.field2972.method727((byte) -110)) {
            int var3 = var2.field3833;
            if (class272.method1863(-671591600, var3)) {
                boolean var4 = true;
                class137[] var5 = class109.field1852[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field2402;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field5062;
                    class137 var8 = class146.method1167(1169843632, var7);
                    if (var8 != null) {
                        class258.method1793(var8, 0);
                    }
                }
            }
        }
        field373++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Llg;I)Z", line = 118)
    public static final boolean method249(class137 arg0, int arg1) {
        field371++;
        if (arg1 != -4) {
            method246(false, (class323) null, -24);
        }
        if (arg0.field2518 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field2518.length; var2++) {
            int var3 = class113.method966(arg0, var2, -121);
            int var4 = arg0.field2414[var2];
            if (arg0.field2518[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field2518[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field2518[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 176)
    public static final void method250(byte arg0) {
        field374++;
        class354.field5601.method466(-1);
        class293.field4695.method466(-1);
        class64.field1009.method466(-1);
        class286.field4562.method466(-1);
        if (arg0 != -122) {
            method246(false, (class323) null, -56);
        }
    }
}
