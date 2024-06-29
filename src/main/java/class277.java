import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class277 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field3939;

    static {
        new class446("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1783(int arg0) {
        field3938++;
        for (class119 var1 = (class119) class460.field6887.method445(33); var1 != null; var1 = (class119) class460.field6887.method451(false)) {
            if (var1.field1637 > 0) {
                var1.field1637--;
            }
            if (var1.field1637 != 0) {
                if (var1.field1639 > 0) {
                    var1.field1639--;
                }
                if (var1.field1639 == 0 && var1.field1638 >= 1 && var1.field1640 >= 1 && var1.field1638 <= (class398.field6071 - 2) && var1.field1640 <= (class528.field7734 - 2) && (var1.field1636 < 0 || class496.method2961(true, var1.field1630, var1.field1636))) {
                    class159.method1030(var1.field1629, -1, var1.field1638, var1.field1636, var1.field1640, var1.field1631, var1.field1634, var1.field1630, 1);
                    var1.field1639 = -1;
                    if (var1.field1636 == var1.field1633 && var1.field1633 == -1) {
                        var1.method25(-13489);
                    } else if (var1.field1636 == var1.field1633 && var1.field1634 == var1.field1628 && var1.field1635 == var1.field1630) {
                        var1.method25(-13489);
                    }
                }
            } else if (var1.field1633 < 0 || class496.method2961(true, var1.field1635, var1.field1633)) {
                class159.method1030(var1.field1629, -1, var1.field1638, var1.field1633, var1.field1640, var1.field1631, var1.field1628, var1.field1635, 1);
                var1.method25(-13489);
            }
        }
        if (arg0 == 6509) {
            ;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLuu;)V", line = 95)
    public static final void method1784(byte arg0, class191 arg1) {
        if (arg0 <= -39) {
            field3939++;
            class418.field6372 = arg1;
        }
    }
}
