import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class295 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3806 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljs;")
    public static class275 field3805 = new class275(1, 2, 2, 0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[Ljv;")
    public static class68[] field3807;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method1646(int arg0, byte arg1) {
        field3804++;
        class557 var2 = class93.method564(11, -14073, arg0);
        if (arg1 >= -93) {
            method1646(-122, (byte) 76);
        }
        var2.method3264(-1037624096);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method1647(boolean arg0) {
        if (arg0) {
            method1647(true);
        }
        field3807 = null;
        field3805 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[IBLmh;Z)Lwo;")
    public static final class632 method1648(int arg0, int arg1, int[] arg2, byte arg3, class537 arg4, boolean arg5) {
        field3803++;
        if (arg3 != -45) {
            field3805 = null;
        }
        if (!arg4.field7777 && (!class415.method2366(-127, arg0) || !class415.method2366(arg3 ^ 0x51, arg1))) {
            return arg4.field7795 ? new class632(arg4, 34037, arg0, arg1, arg5, arg2) : new class632(arg4, arg0, arg1, class129.method731(arg0, -27265), class129.method731(arg1, -27265), arg2);
        } else {
            return new class632(arg4, 3553, arg0, arg1, arg5, arg2);
        }
    }
}
