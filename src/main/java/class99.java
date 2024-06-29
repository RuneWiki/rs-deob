import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class99 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1364 = -1;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Liq;")
    public static class134 field1368;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lkr;")
    public static class234 field1362;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[[I")
    public static int[][] field1363;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        if (arg0 == 7) {
            field1368 = null;
            field1363 = null;
            field1362 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)I")
    public static final int method634(int arg0, int arg1, int arg2, int arg3) {
        field1365++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        }
        int var5 = 49 / ((arg1 + 63) / 55);
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)Ldh;")
    public static final class227 method635(int arg0) {
        field1367++;
        if (class223.field3386 == null || class164.field2290 == null) {
            return null;
        }
        for (class227 var1 = (class227) class164.field2290.method1061(arg0 ^ 0xFFFFD0FA); var1 != null; var1 = (class227) class164.field2290.method1061(arg0 + 12038)) {
            class228 var2 = class20.method125(var1.field3437, 36);
            if (var2 != null && var2.field3450 && var2.method1387(arg0 ^ 0xFFFFD0B1)) {
                return var1;
            }
        }
        if (arg0 != -12037) {
            field1363 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public static final int method636(int arg0, int arg1) {
        field1366++;
        return arg0 == -28156 ? arg1 & 0xFF : 55;
    }
}
