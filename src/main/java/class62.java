import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class62 extends class778 {

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Lqk;")
    public static class1 field702 = new class1(25, 12);

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "Lqk;")
    public static class1 field704 = new class1(70, 1);

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
    public static void method492(int arg0) {
        field704 = null;
        field702 = null;
        if (arg0 != 10) {
            method492(-71);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
    public final void method493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field703;
        if (arg0 == -200) {
            int var6 = super.field10704.method749();
            int var7 = ((class708) super.field6598).field9827 * class248.method1674((byte) -104) / 10 % var6;
            super.field10704.method2031(arg2 + var7 + -var6, arg4, -var7 + arg1 + var6, arg3);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lae;Lae;Ldd;)V")
    public class62(class283 arg0, class283 arg1, class708 arg2) {
        super(arg0, arg1, arg2);
    }
}
