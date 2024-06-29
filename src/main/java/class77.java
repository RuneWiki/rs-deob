import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class77 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lvf;")
    public static class265 field1473 = class87.method582(-46, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Z")
    public static boolean field1474 = false;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lvf;")
    public static class265 field1468 = class87.method582(-46, "Nehmen");

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lvf;")
    private static class265 field1472 = class87.method582(-46, "Loading sprites )2 ");

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lvf;")
    public static class265 field1470 = field1472;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "[S")
    public static short[] field1476 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZIJ)Lvf;")
    public static final class265 method539(int arg0, int arg1, boolean arg2, int arg3, long arg4) {
        field1471++;
        class265 var6 = class254.method1675(0, (byte) 18);
        if (arg4 < 0L) {
            var6.method1807((byte) 114, class69.field1308);
            arg4 = -arg4;
        }
        class265 var7 = class201.field3586;
        class265 var8 = class56.field1149;
        if (arg0 == 1) {
            var8 = class201.field3586;
            var7 = class56.field1149;
        }
        if (arg0 == 2) {
            var7 = class249.field4315;
            var8 = class201.field3586;
        }
        if (arg0 == 3) {
            var7 = class56.field1149;
            var8 = class201.field3586;
        }
        class265 var9 = class254.method1675(0, (byte) 18);
        class265 var10 = class254.method1675(0, (byte) 18);
        for (int var11 = 0; var11 < arg3; var11++) {
            var10.method1807((byte) 122, class241.method1609(true, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class53.field1095;
        }
        int var12 = 0;
        if (arg1 != 10) {
            field1476 = null;
        }
        while (arg4 > 0L) {
            if (arg2 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1807((byte) 120, var7);
            }
            var12++;
            var9.method1807((byte) 119, class241.method1609(true, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (var10.method1808((byte) -15) > 0) {
            var10.method1807((byte) 122, var8);
        }
        return class148.method1022(10, new class265[] { var6, var9.method1795(-121), var10.method1795(-102) });
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method540(int arg0) {
        field1473 = null;
        field1476 = null;
        field1470 = null;
        if (arg0 < 17) {
            method540(-10);
        }
        field1472 = null;
        field1468 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
    public static final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1477++;
        int var6 = class219.method1507(class205.field3681, class81.field1521, arg4, 0);
        int var7 = class219.method1507(class205.field3681, class81.field1521, arg1, arg3 + arg3);
        int var8 = class219.method1507(class79.field1510, class107.field1890, arg2, 0);
        int var9 = class219.method1507(class79.field1510, class107.field1890, arg5, arg3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class203.method1394(class44.field973[var10], var8, var9, -7249, arg0);
        }
    }
}
