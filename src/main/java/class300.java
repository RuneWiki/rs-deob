import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class300 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[I")
    public static int[] field4611 = new int[1];

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
    public static boolean field4612 = false;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lep;")
    public static class314 field4608;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Lo;")
    public static class363 field4609;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1997(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4607++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class17.field187 - class454.field6754) * var8 / 100 + class454.field6754;
        if (arg2 != 61) {
            field4610 = 10;
        }
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class58.field891[var11] * -var10 >> 15;
            var15 = class58.field889[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class58.field891[var12] * var15 >> 15;
            var15 = class58.field889[var12] * var15 >> 15;
        }
        class128.field1917 = arg3 - var13;
        class21.field242 = 0;
        class406.field5999 = arg4 - var15;
        class505.field7344 = arg1 - var14;
        class430.field6377 = arg0;
        class536.field7863 = arg7;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLcv;)Lcv;")
    public abstract class484 method1998(boolean arg0, class484 arg1);

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static void method1999(int arg0) {
        field4609 = null;
        field4608 = null;
        field4611 = null;
        if (arg0 != -296218648) {
            method1999(-86);
        }
    }
}
