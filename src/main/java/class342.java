import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class342 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4597 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lo;")
    public static class29 field4599 = new class29();

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[I")
    public static int[] field4598;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lji;I)Ldv;")
    public static final class658 method2013(class611 arg0, int arg1) {
        field4596++;
        if (arg1 < 12) {
            field4600 = -116;
        }
        class263 var2 = class60.method413(9342, arg0);
        int var3 = arg0.method3426((byte) -1);
        return new class658(var2.field3441, var2.field3444, var2.field3446, var2.field3447, var2.field3448, var3);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILs;)V")
    public static final void method2014(int arg0, class281 arg1) {
        class25.field188[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method2015(int arg0) {
        field4599 = null;
        field4598 = null;
        field4597 = null;
        if (arg0 != 100) {
            field4600 = 77;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Lit;")
    public static final class646 method2016(byte arg0, int arg1) {
        if (arg0 != 49) {
            field4599 = null;
        }
        field4595++;
        return arg1 >= 0 && arg1 < 100 ? class309.field4193[arg1] : null;
    }
}
