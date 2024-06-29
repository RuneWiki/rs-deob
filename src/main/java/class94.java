import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class94 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
    public static boolean field1550 = true;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lff;")
    public static class3 field1549;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static int method657(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1549 = null;
        int var1 = 99 % ((arg0 - 43) / 32);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZB)V")
    public static final void method659(boolean arg0, byte arg1) {
        field1552++;
        class21.method154(-100, class232.field3979, class107.field1825, class168.field2954, arg0);
        if (arg1 != 123) {
            method663(-44, -29, 102, true, -105, 26, 90, -54);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
    public static final int method660(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method661(-101, 109);
        }
        field1551++;
        int var3 = class67.method463(arg1 + 45365, true, 4, arg0 + 91923) + ((class67.method463(arg1 + 10294, true, 2, arg0 - -37821) + -128 >> 1) - -(class67.method463(arg1, true, 1, arg0) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    public static final void method661(int arg0, int arg1) {
        field1546++;
        class43 var2 = class270.method1847(arg1, -10277, 1);
        var2.method339(true);
        if (arg0 > -84) {
            field1549 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static final void method662(int arg0) {
        if (class137.field2456 < 0) {
            class137.field2456 = 0;
            class95.field1556 = -1;
            class27.field455 = -1;
        }
        field1547++;
        if (class137.field2456 > class140.field2500) {
            class137.field2456 = class140.field2500;
            class95.field1556 = -1;
            class27.field455 = -1;
        }
        if (arg0 < ~class200.field3481) {
            class95.field1556 = -1;
            class27.field455 = -1;
            class200.field3481 = 0;
        }
        if (class200.field3481 > class176.field3068) {
            class27.field455 = -1;
            class95.field1556 = -1;
            class200.field3481 = class176.field3068;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method663(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1548++;
        int var8 = 2048 - arg6 & 0x7FF;
        int var9 = 2048 - arg5 & 0x7FF;
        int var10 = 0;
        int var11 = arg2;
        int var12 = 0;
        if (var9 != 0) {
            int var13 = class240.field4162[var9];
            var12 = -arg2 * var13 >> 16;
            int var14 = class240.field4176[var9];
            var11 = arg2 * var14 >> 16;
        }
        if (var8 != 0) {
            int var15 = class240.field4162[var8];
            var10 = var11 * var15 >> 16;
            int var16 = class240.field4176[var8];
            var11 = var11 * var16 >> 16;
        }
        class140.field2501 = arg5;
        class178.field3078 = arg1 - var10;
        if (!arg3) {
            method662(-121);
        }
        class105.field1767 = arg4 - var12;
        class22.field389 = arg0 - var11;
        class23.field392 = arg6;
    }
}
