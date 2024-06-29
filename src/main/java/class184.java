import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class184 extends class392 {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2238++;
        int var8 = class105.method716(false, class29.field238, class759.field10576, arg6);
        int var9 = class105.method716(false, class29.field238, class759.field10576, arg1);
        int var10 = class105.method716(false, class165.field2070, class122.field1604, arg2);
        int var11 = class105.method716(false, class165.field2070, class122.field1604, arg4);
        int var12 = class105.method716(false, class29.field238, class759.field10576, arg3 + arg6);
        int var13 = class105.method716(false, class29.field238, class759.field10576, arg1 - arg3);
        for (int var14 = var8; var14 < var12; var14++) {
            class168.method980(arg0, class300.field4036[var14], var10, var11, (byte) 103);
        }
        if (arg5 != -18907) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class168.method980(arg0, class300.field4036[var15], var10, var11, (byte) 126);
        }
        int var16 = class105.method716(false, class165.field2070, class122.field1604, arg2 + arg3);
        int var17 = class105.method716(false, class165.field2070, class122.field1604, arg4 - arg3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class300.field4036[var18];
            class168.method980(arg0, var19, var10, var16, (byte) 112);
            class168.method980(arg7, var19, var16, var17, (byte) -128);
            class168.method980(arg0, var19, var17, var11, (byte) 3);
        }
    }
}
