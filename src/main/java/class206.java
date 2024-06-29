import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class206 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2432 = 2;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "[Lcl;")
    public static class265[] field2433 = new class265[100];

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "[I")
    public static int[] field2434 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V", line = 4)
    public static void method1231(byte arg0) {
        field2433 = null;
        field2434 = null;
        int var1 = 80 / ((31 - arg0) / 54);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILka;ILlca;I)V", line = 20)
    public static final void method1232(int arg0, int arg1, class470 arg2, int arg3, class642 arg4, int arg5) {
        int var6 = -106 / ((arg5 - 26) / 48);
        field2431++;
        if (arg2 != null) {
            arg4.method3661(arg3, arg2.method193(), arg2.method238(), arg2.method221(), arg2.method203(), arg2.method234(), 135678185, arg2.method190(), arg1, arg2.method222(), arg0);
        }
    }
}
