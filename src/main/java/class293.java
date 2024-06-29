import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class293 extends class270 {

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "[[I")
    public static int[][] field4142;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "Lap;")
    public static class310 field4143;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "Lkg;")
    public static class194 field4144;

    static {
        new class151(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field4142 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
        new class151("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field4143 = new class310(75, 0);
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V", line = 3)
    public static void method1913(int arg0) {
        if (arg0 < -22) {
            field4144 = null;
            field4143 = null;
            field4142 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V", line = 15)
    public static final void method1914(int arg0) {
        field4141++;
        class27.field280 = -3;
        class419.field5817 = -1;
        class271.field3944 = 0;
        if (arg0 != 7) {
            field4143 = null;
        }
        class161.field2327 = 0;
        class336.field4667 = 1;
        class341.field4717 = 0;
        class225.field3246 = false;
    }
}
