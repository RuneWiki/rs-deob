import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2618 = -1;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lc;")
    public static class15 field2617 = new class15(512);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ltd;")
    private static class136 field2619 = class145.method1172("Select a world", 45);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Ltd;")
    public static class136 field2624 = class145.method1172("<br>", 45);

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Ltd;")
    public static class136 field2626 = class145.method1172("mapdots", 45);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Z")
    public static boolean field2627 = false;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ltd;")
    public static class136 field2625 = class145.method1172("(U0a )2 non)2existant gosub script)2num: ", 45);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Ltd;")
    public static class136 field2628 = field2619;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "Lkb;")
    public static class71 field2620;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[Lbb;")
    public static class10[] field2621;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "[Lbb;")
    public static class10[] field2623;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)[Lbb;")
    public static final class10[] method882(int arg0) {
        field2616++;
        class10[] var1 = new class10[class76.field1717];
        if (arg0 != 512) {
            return null;
        }
        for (int var2 = 0; var2 < class76.field1717; var2++) {
            class10 var3 = var1[var2] = new class10();
            var3.field173 = class96.field2252;
            var3.field170 = class64.field1381;
            var3.field171 = class71.field1511[var2];
            var3.field174 = class81.field1905[var2];
            var3.field172 = class3.field59[var2];
            var3.field175 = class65.field1408[var2];
            byte[] var4 = class124.field2887[var2];
            int var5 = var3.field175 * var3.field172;
            var3.field169 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field169[var6] = class127.field2953[class154.method1207(255, var4[var6])];
            }
        }
        class124.method957(arg0 ^ 0x248);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lwd;")
    public static final class154 method883(int arg0, int arg1) {
        field2615++;
        class154 var2 = (class154) class87.field2059.method1162((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class149.field3424.method669(arg1, 4, arg0 ^ 0xFFFFFF2F);
        class154 var4 = new class154();
        if (var3 != null) {
            var4.method1208(new class127(var3), arg1, (byte) -50);
        }
        if (arg0 != 255) {
            method884((byte) 54);
        }
        var4.method1204((byte) 0);
        class87.field2059.method1164((long) arg1, var4, (byte) 127);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field2628 = null;
        if (arg0 <= 74) {
            method882(-87);
        }
        field2625 = null;
        field2619 = null;
        field2617 = null;
        field2623 = null;
        field2626 = null;
        field2624 = null;
        field2620 = null;
        field2621 = null;
    }
}
