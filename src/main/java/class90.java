import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class90 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lqe;")
    public static class168 field1397 = class66.method448("<)4col>", -116);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lqe;")
    public static class168 field1402 = class66.method448(" ", 44);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lqe;")
    private static class168 field1400 = class66.method448("Use", -111);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[J")
    public static long[] field1405 = new long[256];

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lqe;")
    public static class168 field1398 = field1400;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lqe;")
    public static class168 field1401 = class66.method448(" steht bereits auf Ihrer Freunde)2Liste(Q", 94);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lvc;")
    public static class104 field1399;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1400 = null;
        field1405 = null;
        field1401 = null;
        if (arg0 == 32560) {
            field1402 = null;
            field1399 = null;
            field1398 = null;
            field1397 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIII)V")
    public static final void method594(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1404++;
        if (class236.field4021 < 100) {
            class241.method1575(arg1 + 90);
        }
        if (arg1 != -80) {
            return;
        }
        class216.method1403(arg3, arg2, arg0 + arg3, arg2 + arg4);
        if (class236.field4021 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg3;
            int var7 = arg2 + arg4 / 2 - var5 - 18;
            class216.method1405(arg3, arg2, arg0, arg4, 0);
            class216.method1395(var6 - 152, var7, 304, 34, 9179409);
            class216.method1395(var6 - 151, var7 + 1, 302, 32, 0);
            class216.method1405(var6 - 150, var7 + 2, class236.field4021 * 3, 30, 9179409);
            class216.method1405(class236.field4021 * 3 + var6 - 150, var7 - -2, 300 - class236.field4021 * 3, 30, 0);
            class123.field2028.method925(class83.field1259, var6, var7 + var5, 16777215, -1);
            return;
        }
        class180.field3207 = (int) ((double) (arg0 * 2) / class167.field2852);
        class76.field1142 = class91.field1423 - (int) ((double) arg4 / class167.field2852);
        class153.field2650 = (int) ((double) (arg4 * 2) / class167.field2852);
        class133.field2332 = class151.field2629 - (int) ((double) arg0 / class167.field2852);
        int var8 = class151.field2629 - (int) ((double) arg0 / class167.field2852);
        int var9 = class91.field1423 - (int) ((double) arg4 / class167.field2852);
        int var10 = (int) ((double) arg4 / class167.field2852) + class91.field1423;
        int var11 = (int) ((double) arg0 / class167.field2852) + class151.field2629;
        class131.method889(arg3, var10, var9, arg0 + arg3, var8, var11, arg1 ^ 0xFFFFFFC5, arg2, arg2 + arg4);
        class202.method1304(arg2, arg2 + arg4, var11, (byte) -122, var9, var8, arg0 + arg3, var10, arg3);
        if (class80.field1206 > 0) {
            class80.field1206--;
        }
        if (!class70.field1028) {
            return;
        }
        int var12 = arg3 + arg0 - 5;
        int var13 = arg2 + arg4 - 8;
        int var14 = 16776960;
        class199.field3434.method916(class50.method347(arg1 ^ 0xFFFFFFB2, new class168[] { class230.field3917, class128.method867((byte) 101, class132.field2319) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class199.field3434.method916(class50.method347(2, new class168[] { client.field529, class128.method867((byte) 104, var16), class101.field1597 }), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([IBJI)Lqe;")
    public static final class168 method595(int[] arg0, byte arg1, long arg2, int arg3) {
        field1403++;
        if (class91.field1411 != null) {
            class168 var5 = class91.field1411.method40(arg2, (byte) -123, arg3, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 <= 17) {
            method594(50, (byte) -60, 44, 93, -103);
        }
        return arg3 == 5 ? class80.method532(arg2, (byte) 124).method1116(0) : class170.method1131(26, arg2);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1405[var0] = var1;
        }
    }
}
