import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class121 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Luv;")
    public static class3 field1527 = new class3(14, 2);

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
    public static int[] field1528;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method661(int arg0) {
        if (class287.field3757 != null) {
            class287.field3757.method920(-33);
            class287.field3757 = null;
            class167.field2119 = null;
        }
        field1529++;
        if (arg0 != 6625) {
            field1528 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1530++;
        if (arg2 != 14) {
            field1527 = null;
        }
        int var7 = arg0 + arg6;
        int var8 = arg4 - arg0;
        for (int var9 = arg6; var9 < var7; var9++) {
            class373.method2275((byte) -9, arg5, arg1, arg3, class256.field3173[var9]);
        }
        for (int var10 = arg4; var10 > var8; var10--) {
            class373.method2275((byte) -9, arg5, arg1, arg3, class256.field3173[var10]);
        }
        int var11 = arg5 - arg0;
        int var12 = arg3 + arg0;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class256.field3173[var13];
            class373.method2275((byte) -9, var12, arg1, arg3, var14);
            class373.method2275((byte) -9, arg5, arg1, var11, var14);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1528 = null;
        if (arg0 > 30) {
            field1527 = null;
        }
    }
}
