import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class530 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7164 = null;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
    public static int[] field7166 = new int[1000];

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 3)
    public static void method2878(int arg0) {
        if (arg0 < 3) {
            field7163 = -121;
        }
        field7166 = null;
        field7164 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V", line = 18)
    public static final void method2879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7165++;
        int var6 = -110 % ((-arg2 - 26) / 34);
        for (int var7 = arg1; var7 <= arg3; var7++) {
            class57.method362(arg0, class550.field7650[var7], arg4, arg5, 51);
        }
    }
}
