import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class256 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "F")
    public static float field3781 = 0.0F;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
    public static boolean field3782 = false;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
    public static boolean field3785 = false;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lju;")
    public static class388[] field3783;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILib;BII)V", line = 11)
    public static final void method1705(int arg0, class723 arg1, byte arg2, int arg3, int arg4) {
        field3784++;
        int var5 = arg1.field9219[0];
        int var6 = arg1.field9214[0];
        if (arg3 != 30201) {
            method1706(82);
        }
        if (var5 < 0 || class741.field10208 <= var5 || var6 < 0 || var6 >= class525.field7224 || arg4 < 0 || class741.field10208 <= arg4 || arg0 < 0 || class525.field7224 <= arg0) {
            return;
        }
        int var7 = class400.method2460(var5, arg0, 0, class468.field6495, var6, arg1.method3744(1), 0, 0, arg4, -4, client.field1305[arg1.field3467], true, -86, 0, class194.field2596);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method4024(0, class194.field2596[var8], class468.field6495[var8], arg2);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 51)
    public static void method1706(int arg0) {
        if (arg0 == -11373) {
            field3783 = null;
        }
    }
}
