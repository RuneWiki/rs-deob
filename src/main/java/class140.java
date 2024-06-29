import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class140 {

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lhj;")
    private static class69 field2620 = class181.method1318("Attack", (byte) -115);

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lhj;")
    public static class69 field2621 = field2620;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lhj;")
    public static class69 field2614 = class181.method1318("m", (byte) -107);

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lhj;")
    public static class69 field2624 = class181.method1318("m-Ochte mit Ihnen handeln)3", (byte) -127);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[[[S")
    public static short[][][] field2616;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1075(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2622++;
        class115.field2204 = arg0;
        class217.field3939 = arg5;
        class100.field1885 = arg2;
        class230.field4220 = arg1;
        class213.field3868 = arg4;
        if (arg6 > -100) {
            return;
        }
        if (arg3 && class213.field3868 >= 100) {
            class123.field2291 = class115.field2204 * 128 + 64;
            class127.field2327 = class217.field3939 * 128 + 64;
            class31.field427 = class156.method1179(class127.field2327, class123.field2291, 90, class52.field927) - class100.field1885;
        }
        class265.field4711 = 2;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1076(int arg0) {
        if (arg0 != 25111) {
            return;
        }
        field2620 = null;
        field2614 = null;
        field2616 = null;
        field2624 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1077(int arg0, int arg1, int arg2) {
        field2623++;
        class135 var3 = class8.method38((byte) 113, 12, arg1);
        if (arg2 >= -47) {
            field2614 = null;
        }
        var3.method1011((byte) 122);
        var3.field2539 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method1078(byte arg0) {
        field2618++;
        if (arg0 != 122) {
            method1076(99);
        }
        class72.field1397.method1709((byte) -106);
    }
}
