import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class93 extends class12 {

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Lvf;")
    public class265 field1654;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Lvf;")
    private static class265 field1645 = class87.method582(-46, "Continue");

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "[I")
    public static int[] field1646 = new int[32768];

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
    public static int[] field1652 = new int[2048];

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Lvf;")
    public static class265 field1647 = class87.method582(-46, " de votre liste noire)3");

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1655 = 0;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lvf;")
    public static class265 field1649 = class87.method582(-46, "mapscene");

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "[[I")
    public static int[][] field1657 = new int[104][104];

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lvf;")
    public static class265 field1658 = field1645;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "Lvf;")
    public static class265 field1660 = class87.method582(-46, ":duelfriend:");

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[I")
    public static int[] field1651;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public static final void method637(int arg0, int arg1, int arg2) {
        field1656++;
        if (arg2 != 104) {
            method638(42);
        }
        if (class202.method1390(2, arg1)) {
            class11.method92(arg0, 8, class178.field3174[arg1]);
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1651 = null;
        field1649 = null;
        field1647 = null;
        field1660 = null;
        field1646 = null;
        field1658 = null;
        field1657 = null;
        field1645 = null;
        field1652 = null;
        if (arg0 != 0) {
            method638(-95);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class93() {
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lvf;)V")
    public class93(class265 arg0) {
        this.field1654 = arg0;
    }
}
