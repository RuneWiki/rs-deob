import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class241 {

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lse;")
    public static class162 field3353 = new class162(14, 0);

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lse;")
    public static class162 field3356 = new class162(15, 4);

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lse;")
    public static class162 field3357 = new class162(16, -2);

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lse;")
    public static class162 field3358 = new class162(17, 0);

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lse;")
    public static class162 field3359 = new class162(18, -2);

    @OriginalMember(owner = "client!up", name = "h", descriptor = "Lse;")
    public static class162 field3360 = new class162(19, -2);

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lse;")
    public static class162 field3361 = new class162(20, 6);

    @OriginalMember(owner = "client!up", name = "j", descriptor = "Lse;")
    public static class162 field3362 = new class162(21, 9);

    @OriginalMember(owner = "client!up", name = "k", descriptor = "Lse;")
    public static class162 field3363 = new class162(22, -2);

    @OriginalMember(owner = "client!up", name = "l", descriptor = "Lse;")
    public static class162 field3364 = new class162(23, 4);

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Lse;")
    public static class162 field3365 = new class162(24, -1);

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Lse;")
    public static class162 field3366 = new class162(26, 0);

    @OriginalMember(owner = "client!up", name = "o", descriptor = "Lse;")
    public static class162 field3367 = new class162(27, 0);

    @OriginalMember(owner = "client!up", name = "p", descriptor = "Lse;")
    public static class162 field3368 = new class162(28, -2);

    @OriginalMember(owner = "client!up", name = "q", descriptor = "[Lse;")
    private static class162[] field3369 = new class162[32];

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3355;

    static {
        class162[] var0 = class284.method1697(-9564);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3369[var0[var1].field2237] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method1533(boolean arg0) {
        field3355++;
        if (class213.field3004 == 9) {
            class647.method3754(5, true);
        } else if (class213.field3004 == 5 || class213.field3004 == 6) {
            class647.method3754(3, !arg0);
        } else if (class213.field3004 == 12) {
            class647.method3754(3, true);
        }
        if (arg0) {
            field3357 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIIII)V", line = 64)
    public static final void method1534(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3354++;
        int var6 = arg4 - arg5;
        int var7 = arg0 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class614.method3599(arg3, -66, arg2, arg5, arg0);
            }
        } else if (var7 == 0) {
            class723.method4053(arg4, arg3, arg2, 25531, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            if (!arg1) {
                field3362 = null;
            }
            int var9 = arg2 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class490.field6592 > arg4) {
                var10 = class490.field6592;
                var11 = (class490.field6592 * var8 >> 12) + var9;
            } else if (class116.field1628 < arg4) {
                var10 = class116.field1628;
                var11 = (class116.field1628 * var8 >> 12) + var9;
            } else {
                var11 = arg0;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (class490.field6592 > arg5) {
                var12 = class490.field6592;
                var13 = (class490.field6592 * var8 >> 12) + var9;
            } else if (arg5 > class116.field1628) {
                var13 = var9 + (class116.field1628 * var8 >> 12);
                var12 = class116.field1628;
            } else {
                var13 = arg2;
                var12 = arg5;
            }
            if (var11 < class675.field9512) {
                var10 = (class675.field9512 - var9 << 12) / var8;
                var11 = class675.field9512;
            } else if (var11 > class395.field5484) {
                var11 = class395.field5484;
                var10 = (class395.field5484 - var9 << 12) / var8;
            }
            if (class675.field9512 > var13) {
                var13 = class675.field9512;
                var12 = (class675.field9512 - var9 << 12) / var8;
            } else if (var13 > class395.field5484) {
                var13 = class395.field5484;
                var12 = (class395.field5484 - var9 << 12) / var8;
            }
            class128.method823(var12, var13, var11, arg3, var10, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "()V", line = 166)
    public static final void method1535() {
        class101.method684(1, class214.field3021);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 205)
    public static void method1536(int arg0) {
        field3367 = null;
        field3368 = null;
        field3358 = null;
        field3356 = null;
        field3361 = null;
        field3363 = null;
        field3369 = null;
        field3365 = null;
        field3357 = null;
        field3359 = null;
        field3353 = null;
        field3360 = null;
        field3366 = null;
        field3362 = null;
        field3364 = null;
        if (arg0 != 65) {
            field3364 = null;
        }
    }
}
