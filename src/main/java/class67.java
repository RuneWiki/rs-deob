import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class67 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ljd;")
    public static class86 field1319 = class122.method868("_", true);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Ljd;")
    public static class86 field1324 = class122.method868("blaugr-Un:", true);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    public static int[] field1325;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static final void method474(boolean arg0) {
        class137.field2609.method703((byte) 122);
        if (arg0) {
            field1319 = null;
        }
        field1317++;
        class4.field60.method703((byte) 122);
        class158.field2973.method703((byte) 122);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static void method475(boolean arg0) {
        if (arg0) {
            field1324 = null;
            field1319 = null;
            field1325 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BII)V")
    public static final void method476(byte arg0, int arg1, int arg2) {
        field1321++;
        if (class179.method1258(arg2, (byte) -36) && arg0 >= 25) {
            class260.method1777((byte) 63, arg1, class108.field2070[arg2]);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    public static final void method477(byte arg0, int arg1) {
        field1320++;
        class41.method336((byte) 104);
        class204.method1457(125);
        int var2 = class92.method684(arg1, 8609).field3784;
        if (var2 == 0) {
            return;
        }
        if (arg0 < 123) {
            method478(-63, 100);
        }
        int var3 = class273.field4805[arg1];
        if (var2 == 9) {
            class134.field2538 = var3;
        }
        if (var2 == 6) {
            class233.field4218 = var3;
        }
        if (var2 == 5) {
            class141.field2670 = var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method478(int arg0, int arg1) {
        if (arg0 <= -60) {
            field1322++;
            class161 var2 = class204.method1456(true, 10, arg1);
            var2.method1173(true);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBI)Lwf;")
    public static final class1 method479(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -119) {
            method474(true);
        }
        field1323++;
        class1 var4 = new class1();
        var4.field2 = arg3;
        var4.field3 = arg1;
        class1.field15.method1699(arg2 - 28288, var4, (long) arg0);
        class171.method1228((byte) 89, arg3);
        class6 var5 = class25.method178(65, arg0);
        if (var5 != null) {
            class62.method441(-29481, var5);
        }
        if (class162.field3045 != null) {
            class62.method441(-29481, class162.field3045);
            class162.field3045 = null;
        }
        int var6 = class16.field463;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class81.method569(class273.field4784[var7], -90)) {
                class165.method1193(var7, 10120);
            }
        }
        if (class16.field463 == 1) {
            class195.field3506 = false;
            class186.method1280(class202.field3642, true, class112.field2144, class127.field2462, class108.field2080);
        } else {
            class186.method1280(class202.field3642, true, class112.field2144, class127.field2462, class108.field2080);
            int var8 = class141.field2684.method1767(class198.field3524);
            for (int var9 = 0; var9 < class16.field463; var9++) {
                int var10 = class141.field2684.method1767(class127.method896(12307, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class127.field2462 = class16.field463 * 15 + 22;
            class108.field2080 = var8 + 8;
        }
        if (var5 != null) {
            class142.method1010(var5, false, -126);
        }
        class244.method1663(false, arg3);
        if (class178.field3225 != -1) {
            method476((byte) 100, 1, class178.field3225);
        }
        return var4;
    }
}
