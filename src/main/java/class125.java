import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class125 {

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lfn;")
    public static class52 field1717 = new class52(30, 12);

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lcs;")
    public static class351 field1719 = new class351(53, 5);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lmd;")
    public class389 field1715;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    public int[] field1718;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method761(boolean arg0) {
        field1717 = null;
        field1719 = null;
        if (!arg0) {
            method761(false);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIZI)Lvf;")
    public static final class465 method762(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1716++;
        class465 var5 = new class465();
        var5.field6530 = arg1;
        var5.field6527 = arg4;
        class231.field3258.method2620((long) arg0, var5, false);
        class248.method1536(false, arg4);
        class363 var6 = class292.method1804((byte) -57, arg0);
        if (var6 != null) {
            class356.method2141(arg2 ^ 0xFFFF8195, var6);
        }
        if (class422.field5806 != null) {
            class356.method2141(-87, class422.field5806);
            class422.field5806 = null;
        }
        class68.method480((byte) 43);
        if (arg2 != 32313) {
            field1719 = null;
        }
        if (var6 != null) {
            class265.method1674(var6, (byte) 28, !arg3);
        }
        if (!arg3) {
            class212.method1333(arg4);
        }
        if (!arg3 && class182.field2652 != -1) {
            class64.method463(class182.field2652, 1, 1);
        }
        return var5;
    }
}
