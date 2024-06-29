import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class675 {

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "F")
    public static float field9508 = 0.0F;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "Lqk;")
    public static class148 field9506 = new class148(10, -2);

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field9512 = 0;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field9510 = -1;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field9511 = 0;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "Lgca;")
    public static class209 field9509 = new class209(16);

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIB[Lpaa;IZ)V", line = 6)
    public static final void method3868(int arg0, int arg1, byte arg2, class712[] arg3, int arg4, boolean arg5) {
        field9507++;
        if (arg2 >= -116) {
            field9506 = null;
        }
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class712 var7 = arg3[var6];
            if (var7 != null && var7.field10030 == arg4) {
                class242.method1540(arg0, arg5, -124, var7, arg1);
                class665.method3816(arg0, arg1, var7, (byte) 50);
                if (var7.field9971 > var7.field10097 - var7.field9966) {
                    var7.field9971 = var7.field10097 - var7.field9966;
                }
                if (var7.field9971 < 0) {
                    var7.field9971 = 0;
                }
                if (var7.field10014 > (var7.field10002 - var7.field10011)) {
                    var7.field10014 = var7.field10002 - var7.field10011;
                }
                if (var7.field10014 < 0) {
                    var7.field10014 = 0;
                }
                if (var7.field10039 == 0) {
                    class645.method3740(arg5, (byte) -21, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V", line = 58)
    public static void method3869(int arg0) {
        if (arg0 != 12830) {
            field9510 = -104;
        }
        field9509 = null;
        field9506 = null;
    }
}
