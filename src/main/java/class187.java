import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class187 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public int field2623 = -1;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[Lna;")
    public static class206[] field2632;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static final void method1316(byte arg0) {
        field2627++;
        if (arg0 != -125) {
            return;
        }
        for (int var1 = 0; var1 < class98.field1415.length; var1++) {
            for (int var2 = 0; var2 < class98.field1415[var1].length; var2++) {
                class98.field1415[var1][var2] = class202.field2840;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method1317(int arg0) {
        field2632 = null;
        if (arg0 < 12) {
            field2632 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLns;IIIII)V")
    public static final void method1318(boolean arg0, class438 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class30.field464 = 1;
        field2625++;
        class369.field5667 = arg4;
        class466.field6795 = arg1;
        if (arg5 != 2034) {
            field2632 = null;
        }
        class225.field3230 = arg3;
        class388.field5899 = arg2;
        class32.field496 = arg0;
        class123.field1772 = class295.field4368.method1528(-77) / arg6;
        if (class123.field1772 < 1) {
            class123.field1772 = 1;
        }
    }
}
