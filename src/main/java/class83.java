import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class83 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    public static int[] field1586 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lvd;")
    public static class222 field1585 = class212.method1357("Null", 10731);

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Lvd;")
    public static class222 field1587 = class212.method1357("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 10731);

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lvd;")
    public static class222 field1591 = class212.method1357("VOLL", 10731);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lvd;")
    public static class222 field1588 = class212.method1357("mod_icons", 10731);

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lvd;")
    public static class222 field1595 = class212.method1357("Geben Sie Ihren Benutzernamen", 10731);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
    public static boolean field1596 = false;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "J")
    public static long field1593;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lve;")
    public static class223 field1590;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[I")
    public static int[] field1584;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)Z")
    public static final boolean method540(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class186.field3431 * arg2 + class120.field2275 * arg0 >> 16;
        int var5 = class120.field2275 * arg2 - class186.field3431 * arg0 >> 16;
        int var6 = class69.field1302 * var5 + class60.field1118 * arg1 >> 16;
        int var7 = class69.field1302 * arg1 - class60.field1118 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class47.field953;
            int var9 = (var7 << 9) / var6 + class36.field786;
            return var8 >= class14.field402 && var8 <= class235.field4393 && var9 >= class217.field4038 && var9 <= class112.field2110;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lab;Lab;I)V")
    public static final void method541(class3 arg0, class3 arg1, int arg2) {
        class122.field2343 = arg1;
        class159.field3034 = arg0;
        field1589++;
        if (arg2 != 1) {
            field1593 = -125L;
        }
        class197.field3589 = class122.field2343.method38(5, 3);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)Lvd;")
    public static final class222 method542(byte arg0, int arg1) {
        class222 var2 = class56.method414(-121, arg1);
        for (int var3 = var2.method1444(-46) - 3; var3 > 0; var3 -= 3) {
            var2 = class234.method1531(new class222[] { var2.method1419(var3, 2, 0), class237.field4415, var2.method1443(21120, var3) }, -10949);
        }
        field1594++;
        if (var2.method1444(-29) > 9) {
            return class234.method1531(new class222[] { class55.field1039, var2.method1419(var2.method1444(-111) - 8, 2, 0), class52.field1005, class151.field2915, var2, class47.field966 }, -10949);
        } else if (var2.method1444(-85) > 6) {
            return class234.method1531(new class222[] { class35.field771, var2.method1419(var2.method1444(-74) - 4, 2, 0), class22.field524, class151.field2915, var2, class47.field966 }, -10949);
        } else if (arg0 < 75) {
            return null;
        } else {
            return class234.method1531(new class222[] { class187.field3467, var2, class221.field4101 }, -10949);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method543(int arg0) {
        if (arg0 != 16) {
            method544(-92, 36, -47, -56, (byte) -104, -100);
        }
        field1584 = null;
        field1586 = null;
        field1587 = null;
        field1588 = null;
        field1585 = null;
        field1591 = null;
        field1590 = null;
        field1595 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBI)V")
    public static final void method544(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1592++;
        int var6 = arg2 - arg5;
        int var7 = arg3 - arg1;
        if (arg4 != 5) {
            field1585 = null;
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class176.method1110(arg3, arg1, arg5, 32357, arg0);
            }
        } else if (var7 == 0) {
            class35.method292(arg4 - 92, arg2, arg1, arg5, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class112.field2107) {
                var10 = class112.field2107;
                var11 = (class112.field2107 * var8 >> 12) + var9;
            } else if (arg2 > class127.field2448) {
                var10 = class127.field2448;
                var11 = var9 + (class127.field2448 * var8 >> 12);
            } else {
                var10 = arg2;
                var11 = arg3;
            }
            if (var11 < class129.field2514) {
                var10 = (class129.field2514 - var9 << 12) / var8;
                var11 = class129.field2514;
            } else if (var11 > class230.field4322) {
                var11 = class230.field4322;
                var10 = (class230.field4322 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg5 < class112.field2107) {
                var12 = class112.field2107;
                var13 = (class112.field2107 * var8 >> 12) + var9;
            } else if (class127.field2448 >= arg5) {
                var12 = arg5;
                var13 = arg1;
            } else {
                var13 = (class127.field2448 * var8 >> 12) + var9;
                var12 = class127.field2448;
            }
            if (var13 < class129.field2514) {
                var13 = class129.field2514;
                var12 = (class129.field2514 - var9 << 12) / var8;
            } else if (class230.field4322 < var13) {
                var13 = class230.field4322;
                var12 = (class230.field4322 - var9 << 12) / var8;
            }
            class66.method453(var10, var13, var11, var12, arg0, 1866);
        }
    }
}
