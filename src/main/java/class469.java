import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class469 extends class135 {

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "I")
    public static int field6702 = -1;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "Lpfa;")
    public static class295 field6700 = new class295(32);

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Loh;Loh;Lgo;)V")
    public class469(class404 arg0, class404 arg1, class626 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(I)Ldba;")
    public static final class92 method2835(int arg0) {
        ++field6704;
        return arg0 <= 110 ? null : class656.field9357;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIIBI)V")
    public final void method870(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 21) {
            field6700 = null;
        }
        ++field6703;
        int var6 = super.field1530.method501();
        int var7 = ((class626) super.field2375).field8990 * class668.method3794(0) / 10 % var6;
        super.field1530.method819(arg0 + var7 - var6, arg2, arg4 - -var6 - var7, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "(I)V")
    public static void method2836(int arg0) {
        int var1 = 25 % ((-5 - arg0) / 48);
        field6700 = null;
    }
}
