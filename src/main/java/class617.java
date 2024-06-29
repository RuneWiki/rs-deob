import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class617 {

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lkl;")
    public static class468 field8727 = new class468(3);

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "Lbv;")
    public static class567 field8729 = new class567("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Lfaa;")
    public static class273 field8730 = new class273();

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field8731 = 0;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field8728;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static void method3494(byte arg0) {
        field8727 = null;
        field8729 = null;
        if (arg0 != 5) {
            field8732 = 108;
        }
        field8730 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
    public static final void method3495(int arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field8728++;
        class507.field7055 = arg1;
        class72.field1359 = new class585[class531.field7380[class507.field7055] + 1];
        class33.field448 = 0;
        if (arg0 != 950562888) {
            field8732 = -28;
        }
        class47.field653 = 0;
    }
}
