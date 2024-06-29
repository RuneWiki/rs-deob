import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class90 {

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "[Lo;")
    private class15[] field1418;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[[S")
    public static short[][] field1408 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Lce;")
    private static class126 field1405 = class206.method1445(-7923, "Sat");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lce;")
    private static class126 field1410 = class206.method1445(-7923, "Wed");

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lce;")
    public static class126 field1409 = class206.method1445(-7923, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lce;")
    public static class126 field1406 = class206.method1445(-7923, "::cardmem");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lce;")
    private static class126 field1404 = class206.method1445(-7923, "Mon");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lce;")
    private static class126 field1411 = class206.method1445(-7923, "Fri");

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lce;")
    private static class126 field1417 = class206.method1445(-7923, "Tue");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lce;")
    private static class126 field1412 = class206.method1445(-7923, "Loading textures )2 ");

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lce;")
    public static class126 field1420 = class206.method1445(-7923, "; Expires=");

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "Lce;")
    public static class126 field1416 = field1412;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lce;")
    private static class126 field1407 = class206.method1445(-7923, "Sun");

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lce;")
    private static class126 field1421 = class206.method1445(-7923, "Thu");

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "Lce;")
    public static class126 field1419 = class206.method1445(-7923, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "[Lce;")
    public static class126[] field1414 = new class126[] { field1407, field1404, field1417, field1410, field1421, field1411, field1405 };

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 23)
    public static void method627(boolean arg0) {
        field1410 = null;
        field1405 = null;
        field1408 = (short[][]) null;
        field1416 = null;
        field1412 = null;
        field1411 = null;
        field1404 = null;
        field1417 = null;
        field1406 = null;
        field1414 = null;
        field1419 = null;
        if (arg0) {
            field1407 = (class126) null;
        }
        field1421 = null;
        field1407 = null;
        field1409 = null;
        field1420 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILce;I)V", line = 84)
    public static final void method628(int arg0, class126 arg1, int arg2) {
        field1413++;
        class82.field1318++;
        class103.field1645.method1238(137, 72);
        class103.field1645.method976(arg2, -13817);
        class103.field1645.method962(-123, arg1.method845((byte) -118));
        if (arg0 <= 85) {
            method627(true);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 133)
    public class90(int arg0) {
        this.field1418 = new class15[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class15 var3 = this.field1418[var2] = new class15();
            var3.field205 = var3;
            var3.field203 = var3;
        }
    }
}
