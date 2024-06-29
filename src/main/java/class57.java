import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class57 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "J")
    public static long field1054 = 0L;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1058 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "Z")
    public static volatile boolean field1053 = true;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lma;")
    public static class187 field1052;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method422(int arg0) {
        if (arg0 < 99) {
            return;
        }
        class43.field855 = null;
        class163.field2875 = null;
        class133.field2316 = null;
        class131.field2268 = null;
        class278.field4881 = null;
        class92.field1632 = null;
        class266.field4719 = null;
        class255.field4563 = null;
        class192.field3384 = null;
        class217.field3850 = null;
        class282.field4961 = null;
        field1057++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method423(byte arg0) {
        field1055++;
        int var1 = 105 % ((18 - arg0) / 53);
        if (class229.field4206.toLowerCase().indexOf("microsoft") != -1) {
            class71.field1267[187] = 27;
            class71.field1267[223] = 28;
            class71.field1267[220] = 74;
            class71.field1267[191] = 73;
            class71.field1267[219] = 42;
            class71.field1267[192] = 58;
            class71.field1267[190] = 72;
            class71.field1267[221] = 43;
            class71.field1267[222] = 59;
            class71.field1267[188] = 71;
            class71.field1267[189] = 26;
            class71.field1267[186] = 57;
            return;
        }
        class71.field1267[47] = 73;
        class71.field1267[91] = 42;
        class71.field1267[46] = 72;
        class71.field1267[61] = 27;
        class71.field1267[93] = 43;
        if (class229.field4209 == null) {
            class71.field1267[222] = 59;
            class71.field1267[192] = 58;
        } else {
            class71.field1267[222] = 58;
            class71.field1267[520] = 59;
            class71.field1267[192] = 28;
        }
        class71.field1267[44] = 71;
        class71.field1267[45] = 26;
        class71.field1267[92] = 74;
        class71.field1267[59] = 57;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method424(int arg0) {
        if (arg0 != 47) {
            field1052 = null;
        }
        field1052 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static final void method425(boolean arg0) {
        field1056++;
        int var1 = class17.field262.method773(8, arg0);
        if (arg0) {
            method424(-108);
        }
        if (var1 < class31.field629) {
            for (int var2 = var1; var2 < class31.field629; var2++) {
                class11.field150[class160.field2838++] = class10.field149[var2];
            }
        }
        if (class31.field629 < var1) {
            throw new RuntimeException("gppov1");
        }
        class31.field629 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class10.field149[var3];
            class14 var5 = class169.field2953[var4];
            int var6 = class17.field262.method773(1, false);
            if (var6 == 0) {
                class10.field149[class31.field629++] = var4;
                var5.field5034 = class160.field2844;
            } else {
                int var7 = class17.field262.method773(2, false);
                if (var7 == 0) {
                    class10.field149[class31.field629++] = var4;
                    var5.field5034 = class160.field2844;
                    class180.field3233[class65.field1179++] = var4;
                } else if (var7 == 1) {
                    class10.field149[class31.field629++] = var4;
                    var5.field5034 = class160.field2844;
                    int var8 = class17.field262.method773(3, false);
                    var5.method1940(1, var8, 9366);
                    int var9 = class17.field262.method773(1, false);
                    if (var9 == 1) {
                        class180.field3233[class65.field1179++] = var4;
                    }
                } else if (var7 == 2) {
                    class10.field149[class31.field629++] = var4;
                    var5.field5034 = class160.field2844;
                    if (class17.field262.method773(1, false) == 1) {
                        int var11 = class17.field262.method773(3, false);
                        var5.method1940(2, var11, 9366);
                        int var12 = class17.field262.method773(3, false);
                        var5.method1940(2, var12, 9366);
                    } else {
                        int var10 = class17.field262.method773(3, false);
                        var5.method1940(0, var10, 9366);
                    }
                    int var13 = class17.field262.method773(1, false);
                    if (var13 == 1) {
                        class180.field3233[class65.field1179++] = var4;
                    }
                } else if (var7 == 3) {
                    class11.field150[class160.field2838++] = var4;
                }
            }
        }
    }
}
