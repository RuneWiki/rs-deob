import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class134 {

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field2326 = -1;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2321 = 0;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Leg;")
    public static class37 field2327 = class174.method1167("weiss:", 72);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2325 = 2;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Leg;")
    public static class37 field2332 = class174.method1167("null", 110);

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Leg;")
    public static class37 field2329 = class174.method1167("Chargement des textures )2 ", -101);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field2328;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public int field2330;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[Lwc;")
    public static class27[] field2320;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method963(byte arg0) {
        if (arg0 >= -112) {
            method964(-98, 104, -125);
        }
        field2327 = null;
        field2320 = null;
        field2332 = null;
        field2329 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lqk;")
    public static final class7 method964(int arg0, int arg1, int arg2) {
        field2322++;
        class7 var3 = (class7) class78.field1212.method1566(-3);
        if (arg0 != -8239) {
            field2321 = 86;
        }
        while (var3 != null) {
            if (var3.field123 && var3.method42(true, arg1, arg2)) {
                return var3;
            }
            var3 = (class7) class78.field1212.method1570(3);
        }
        return null;
    }
}
