import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class157 {

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "Lpn;")
    public static class49 field2406 = new class49(42, -1);

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "F")
    public static float field2407;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
    public static int field2405;

    static {
        new class179("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 3)
    public static void method1140(int arg0) {
        if (arg0 <= 49) {
            method1140(-39);
        }
        field2406 = null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLfi;)V", line = 16)
    public static final void method1141(byte arg0, class38 arg1) {
        field2405++;
        if (class456.field6782 == arg1.field593) {
            if (class116.field1781.field7437 == null) {
                arg1.field491 = 0;
                arg1.field632 = 0;
            } else {
                arg1.field572 = 150;
                arg1.field611 = (int) (Math.sin((double) class446.field6625 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field640 = 5;
                arg1.field491 = class517.field7513;
                arg1.field632 = class522.method3116(class116.field1781.field7437, 6157);
                arg1.field509 = 0;
                arg1.field486 = class116.field1781.field7586;
                arg1.field487 = class116.field1781.field7605;
                arg1.field553 = class116.field1781.field7590;
            }
        } else if (arg0 <= 95) {
            field2406 = null;
        }
    }
}
