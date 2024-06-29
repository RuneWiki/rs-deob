import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class415 extends class501 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lnba;")
    public class249 field5631;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
    public static int[] field5634 = new int[32];

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Lada;")
    public static class144 field5633 = new class144(65, 28);

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lada;")
    public static class144 field5635 = new class144(70, 0);

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Llu;")
    public static class610 field5636 = new class610(15, 2);

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Lada;")
    public static class144 field5637 = new class144(50, 6);

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lkda;I)V")
    public static final void method2445(class328 arg0, int arg1) {
        field5632++;
        class507.field7166 = arg0.method1967(-1, "titlebg");
        class87.field1313 = arg0.method1967(-1, "logo");
        if (arg1 >= -59) {
            field5633 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2446(int arg0);

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)Z")
    public abstract boolean method2447(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method2448(byte arg0) {
        if (class607.field9016 < 0) {
            class451.field6372 = -1;
            class607.field9016 = 0;
            class485.field6906 = -1;
        }
        field5630++;
        if (class607.field9016 > class339.field4690) {
            class485.field6906 = -1;
            class607.field9016 = class339.field4690;
            class451.field6372 = -1;
        }
        if (arg0 != -34) {
            return;
        }
        if (class177.field2703 < 0) {
            class485.field6906 = -1;
            class451.field6372 = -1;
            class177.field2703 = 0;
        }
        if (class339.field4682 < class177.field2703) {
            class485.field6906 = -1;
            class177.field2703 = class339.field4682;
            class451.field6372 = -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lnba;I)V")
    public class415(class249 arg0, int arg1) {
        this.field5631 = arg0;
        this.field5629 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
    public static void method2449(int arg0) {
        field5634 = null;
        field5636 = null;
        field5637 = null;
        field5635 = null;
        if (arg0 == 6) {
            field5633 = null;
        }
    }
}
