import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class91 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Ltg;")
    public static class184 field1696 = class135.method812("welle:", 3);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ltg;")
    public static class184 field1695 = class135.method812("<col=c0ff00>", 3);

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ltg;")
    private static class184 field1698 = class135.method812("Attack", 3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Ltg;")
    public static class184 field1697 = field1698;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Ltg;")
    public static class184 field1701 = class135.method812("Lade Sprites )2 ", 3);

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[Z")
    public static boolean[] field1702 = new boolean[8];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method530(int arg0) {
        int var1 = -37 / ((-arg0 - 23) / 47);
        if (class90.field1667 != null) {
            class90.field1667.method1338(6555);
        }
        if (class157.field2820 != null) {
            class157.field2820.method1338(6555);
        }
        field1699++;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static void method531(int arg0) {
        if (arg0 > -61) {
            method530(127);
        }
        field1696 = null;
        field1701 = null;
        field1697 = null;
        field1702 = null;
        field1698 = null;
        field1695 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILud;Lpb;I)V")
    public static final void method532(int arg0, class190 arg1, class143 arg2, int arg3) {
        field1703++;
        class15 var4 = new class15();
        var4.field281 = arg2;
        var4.field292 = arg0;
        var4.field2393 = arg3;
        var4.field285 = arg1;
        class69 var5 = class157.field2806;
        synchronized (class157.field2806) {
            class157.field2806.method402(16777215, var4);
        }
        class44.method260(-1);
    }
}
