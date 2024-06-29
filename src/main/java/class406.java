import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class406 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field5540 = 0;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "[I")
    public static int[] field5543 = new int[5];

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Ljd;")
    public static class383 field5544 = new class383("WTQA", 2);

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "Ldh;")
    public class183 field5541;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Ln;")
    public class468 field5545;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Lrj;")
    public static class481 field5546;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Lml;")
    public static final class21 method2432(int arg0, int arg1) {
        field5542++;
        if (arg0 > -21) {
            field5543 = null;
        }
        return class6.field36 && class262.field3772 <= arg1 && class150.field2079 >= arg1 ? class162.field2364[arg1 - class262.field3772] : null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method2433(int arg0) {
        field5543 = null;
        field5544 = null;
        if (arg0 == 5) {
            field5546 = null;
        }
    }
}
