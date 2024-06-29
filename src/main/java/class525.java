import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class525 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Z")
    public static boolean[] field6963 = new boolean[100];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6964 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lqr;")
    public static class65 field6962 = new class65(30);

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
    public static boolean field6968 = false;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Ljn;")
    public static class720 field6967;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2902(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6966++;
        if (arg4 != 75) {
            return;
        }
        int var7 = class10.method99(class431.field5944, 76, class380.field5289, arg5);
        int var8 = class10.method99(class431.field5944, 37, class380.field5289, arg3);
        int var9 = class10.method99(class209.field3090, 9, class261.field3632, arg2);
        int var10 = class10.method99(class209.field3090, 117, class261.field3632, arg1);
        int var11 = class10.method99(class431.field5944, 91, class380.field5289, arg0 + arg5);
        int var12 = class10.method99(class431.field5944, 29, class380.field5289, arg3 - arg0);
        for (int var13 = var7; var13 < var11; var13++) {
            class717.method4012(arg6, arg4 - 164, var9, class690.field9616[var13], var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class717.method4012(arg6, arg4 ^ 0xFFFFFFD4, var9, class690.field9616[var14], var10);
        }
        int var15 = class10.method99(class209.field3090, 47, class261.field3632, arg0 + arg2);
        int var16 = class10.method99(class209.field3090, 69, class261.field3632, arg1 - arg0);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class690.field9616[var17];
            class717.method4012(arg6, arg4 ^ 0xFFFFFF8A, var9, var18, var15);
            class717.method4012(arg6, arg4 ^ 0xFFFFFFF4, var16, var18, var10);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method2903(int arg0) {
        field6965++;
        class302 var1 = (class302) class409.field5677.method21(2);
        if (arg0 != 2249) {
            method2902(28, -115, 84, -80, (byte) 24, 124, -5);
        }
        while (var1 != null) {
            class711.method3995(arg0 ^ 0xFFFFF75E, false, var1);
            var1 = (class302) class409.field5677.method9(arg0 - 2377);
        }
        for (class302 var2 = (class302) class271.field3785.method21(2); var2 != null; var2 = (class302) class271.field3785.method9(arg0 - 2377)) {
            class711.method3995(12, true, var2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
    public static void method2904(int arg0) {
        field6967 = null;
        if (arg0 != 100) {
            method2902(-53, 48, 101, 24, (byte) -42, -114, 3);
        }
        field6962 = null;
        field6963 = null;
    }
}
