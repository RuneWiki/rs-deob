import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class246 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3855 = "Close";

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "F")
    public static float field3863;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[[[B")
    public static byte[][][] field3861;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method1662(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3860++;
        if (arg1 <= arg0) {
            class253.method1704(arg1, arg0, arg4, class175.field2675[arg2], 7);
        } else {
            class253.method1704(arg0, arg1, arg4, class175.field2675[arg2], 7);
        }
        if (arg3 != -5758) {
            field3859 = 55;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V", line = 31)
    public static final void method1663(int arg0, int arg1, int arg2) {
        field3864++;
        class96.field1474 = class14.field144[arg2][arg0].field1813;
        class193.field2912 = class14.field144[arg2][arg0].field1824;
        class63.field877 = class14.field144[arg2][arg0].field1810;
        class326.method2212((float) class96.field1474, (float) class193.field2912, (float) class63.field877);
        int var3 = -116 / ((arg1 + 31) / 47);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 44)
    public static void method1664(int arg0) {
        field3855 = null;
        if (arg0 != -27386) {
            field3855 = (String) null;
        }
        field3861 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 57)
    public static final void method1665(byte arg0) {
        field3856++;
        int var1 = class286.field4380.method1247(class82.field1224);
        if (arg0 >= -3) {
            field3863 = -0.2037546F;
        }
        for (int var2 = 0; var2 < class168.field2565; var2++) {
            int var3 = class286.field4380.method1247(class234.method1597(0, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class168.field2565 * 15 + 21;
        int var5 = class308.field4847;
        if (class174.field2644 < (var5 + var4)) {
            var5 = class174.field2644 - var4;
        }
        int var6 = class302.field4661 - (var1 / 2);
        if (var5 < 0) {
            var5 = 0;
        }
        if (class334.field5203 < (var1 + var6)) {
            var6 = class334.field5203 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class310.field4923 == 1) {
            if (class302.field4661 == class286.field4384 && class308.field4847 == class255.field3984) {
                class116.field1797 = class168.field2565 * 15 + (class151.field2373 ? 26 : 22);
                class260.field4036 = true;
                class179.field2748 = var1;
                class307.field4832 = var5;
                field3858 = var6;
                class310.field4923 = 0;
            }
        } else if (class85.field1295 == class302.field4661 && class7.field81 == class308.field4847) {
            field3858 = var6;
            class260.field4036 = true;
            class179.field2748 = var1;
            class116.field1797 = (class151.field2373 ? 26 : 22) + class168.field2565 * 15;
            class307.field4832 = var5;
            class310.field4923 = 0;
        } else {
            class286.field4384 = class85.field1295;
            class255.field3984 = class7.field81;
            class310.field4923 = 1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILfe;Lfe;IIIIJ)V", line = 148)
    public static final void method1666(int arg0, int arg1, int arg2, int arg3, class94 arg4, class94 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class152 var12 = new class152();
        var12.field2392 = arg10;
        var12.field2398 = arg1 * 128 + 64;
        var12.field2396 = arg2 * 128 + 64;
        var12.field2393 = arg3;
        var12.field2405 = arg4;
        var12.field2406 = arg5;
        var12.field2403 = arg6;
        var12.field2390 = arg7;
        var12.field2404 = arg8;
        var12.field2389 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class90.field1375[var13][arg1][arg2] == null) {
                class90.field1375[var13][arg1][arg2] = new class174(var13, arg1, arg2);
            }
        }
        class90.field1375[arg0][arg1][arg2].field2650 = var12;
    }
}
