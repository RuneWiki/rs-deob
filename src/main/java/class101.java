import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class101 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Llk;")
    public static class232 field2060 = new class232(64);

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Llk;")
    public static class232 field2063 = new class232(4);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lgi;")
    public static class179 field2061;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lie;")
    public static class69 field2064;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method820(int arg0) {
        field2060 = null;
        field2061 = null;
        field2063 = null;
        field2064 = null;
        int var1 = 36 % ((arg0 + 61) / 41);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2057++;
        if (arg1 != -5715) {
            field2063 = null;
        }
        for (class91 var5 = (class91) class167.field3084.method478(0); var5 != null; var5 = (class91) class167.field3084.method476((byte) 13)) {
            class20.method189(arg3, var5, arg4, arg2, arg0, false);
        }
        for (class91 var6 = (class91) class239.field4254.method478(0); var6 != null; var6 = (class91) class239.field4254.method476((byte) 13)) {
            byte var10 = 1;
            if (var6.field1838.field1370 == var6.field1838.field1362) {
                var10 = 0;
            } else if (var6.field1838.field1370 == var6.field1838.field1359) {
                var10 = 2;
            }
            if (var6.field1832 != var10) {
                int var11 = class31.method316(var6.field1838, arg1 + 5714);
                if (var6.field1836 != var11) {
                    if (var6.field1829 != null) {
                        class127.field2469.method186(var6.field1829);
                        var6.field1829 = null;
                    }
                    var6.field1836 = var11;
                }
                var6.field1832 = var10;
            }
            var6.field1834 = var6.field1838.field1360;
            var6.field1846 = var6.field1838.field1360 + var6.field1838.method574(true) * 64;
            var6.field1828 = var6.field1838.field1336;
            var6.field1850 = var6.field1838.field1336 + var6.field1838.method574(true) * 64;
            class20.method189(arg3, var6, arg4, arg2, arg0, false);
        }
        for (class91 var7 = (class91) class68.field1482.method1178(true); var7 != null; var7 = (class91) class68.field1482.method1176((byte) 22)) {
            byte var8 = 1;
            if (var7.field1843.field1370 == var7.field1843.field1362) {
                var8 = 0;
            } else if (var7.field1843.field1370 == var7.field1843.field1359) {
                var8 = 2;
            }
            if (var7.field1832 != var8) {
                int var9 = class201.method1426(arg1 + 5609, var7.field1843);
                if (var7.field1836 != var9) {
                    if (var7.field1829 != null) {
                        class127.field2469.method186(var7.field1829);
                        var7.field1829 = null;
                    }
                    var7.field1836 = var9;
                }
                var7.field1832 = var8;
            }
            var7.field1834 = var7.field1843.field1360;
            var7.field1846 = var7.field1843.field1360 + (var7.field1843.method574(true) * 64);
            var7.field1828 = var7.field1843.field1336;
            var7.field1850 = var7.field1843.field1336 + var7.field1843.method574(true) * 64;
            class20.method189(arg3, var7, arg4, arg2, arg0, false);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)Z")
    public static final boolean method822(int arg0, int arg1) {
        field2062++;
        if (arg0 > arg1) {
            return false;
        }
        int var2 = class30.field602[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)V")
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 23) {
            return;
        }
        field2058++;
        if (class275.field4804 <= arg3 && class167.field3064 >= arg3) {
            int var5 = class68.method609(class48.field1096, arg1 ^ 0x5635, class252.field4458, arg2);
            int var6 = class68.method609(class48.field1096, 22050, class252.field4458, arg0);
            class108.method859(var5, false, arg3, var6, arg4);
        }
    }
}
