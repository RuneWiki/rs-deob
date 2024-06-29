import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class291 {

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "Lhda;")
    public static class750 field3849 = new class750(2, 2);

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "[I")
    public static int[] field3852 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Luaa;")
    public static class119 field3851;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 27)
    public static void method1734(int arg0) {
        int var1 = -57 / ((61 - arg0) / 51);
        field3852 = null;
        field3851 = null;
        field3849 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;)V", line = 40)
    public static final void method1735(String arg0, int arg1, String arg2, String arg3, int arg4, String arg5, byte arg6, int arg7, String arg8) {
        field3848++;
        class646 var9 = class309.field4193[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class309.field4193[var10] = class309.field4193[var10 - 1];
        }
        if (arg6 > -50) {
            method1734(-6);
        }
        if (var9 == null) {
            var9 = new class646(arg1, arg7, arg2, arg8, arg0, arg5, arg4, arg3);
        } else {
            var9.method3642(arg4, arg3, arg2, arg5, arg7, arg8, arg1, arg0, -30991);
        }
        class494.field6729++;
        class309.field4193[0] = var9;
        class369.field5173 = class292.field3876;
    }
}
