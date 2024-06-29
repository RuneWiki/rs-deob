import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class514 extends class320 {

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public int field7551 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field7554 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public int field7552 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field7550 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public int field7557 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public int field7555 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public int field7560 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public int field7561 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Ljq;")
    public class353 field7559;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "[S")
    public static short[] field7562 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Liv;")
    public static class64 field7556 = new class64(14, -2);

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
    public static boolean field7563 = false;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field7564 = 0;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljq;)V", line = 193)
    public class514(class353 arg0) {
        this.field7559 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V", line = 21)
    public static void method3067(int arg0) {
        field7556 = null;
        if (arg0 > 82) {
            field7562 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Lvm;", line = 34)
    public static final class481 method3068(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class481 var4 = var3.field6385;
            var3.field6385 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Z", line = 45)
    public final boolean method3069(int arg0, int arg1, int arg2) {
        field7553++;
        if (arg2 >= this.field7560 && arg2 <= this.field7554 && arg1 >= this.field7555 && this.field7551 >= arg1) {
            return true;
        } else {
            if (arg0 != 14) {
                field7563 = true;
            }
            return this.field7557 <= arg2 && arg2 <= this.field7552 && this.field7561 <= arg1 && arg1 <= this.field7550;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V", line = 66)
    public static final void method3070() {
        for (int var0 = 0; var0 < class256.field3696; var0++) {
            class417 var1 = class123.field1993[var0];
            class214.method1431(var1);
            class123.field1993[var0] = null;
        }
        class256.field3696 = 0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIIIII)V", line = 91)
    public static final void method3071(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field7558++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class228.field3241 - class361.field5468) * var6 / arg4 + class361.field5468;
        if (var7 < class157.field2459) {
            var7 = class157.field2459;
        } else if (class130.field2059 < var7) {
            var7 = class130.field2059;
        }
        int var8 = arg1 * 512 * var7 / (arg2 * 334);
        if (var8 < class159.field2473) {
            short var9 = class159.field2473;
            var7 = var9 * 334 * arg2 / (arg1 * 512);
            if (class130.field2059 < var7) {
                var7 = class130.field2059;
                int var10 = arg1 * var7 * 512 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg0) {
                    class4.field109.method258();
                    class4.field109.method1200(-16777216, arg1, arg5, arg3, var11, 10);
                    class4.field109.method1200(-16777216, arg1, arg2 + arg5 - var11, arg3, var11, arg4 ^ 0x6E);
                }
                arg2 -= var11 * 2;
                arg5 += var11;
            }
        } else if (class331.field5014 < var8) {
            short var12 = class331.field5014;
            var7 = var12 * 334 * arg2 / (arg1 * 512);
            if (var7 < class157.field2459) {
                var7 = class157.field2459;
                int var13 = var12 * 334 * arg2 / (var7 * 512);
                int var14 = (arg1 - var13) / 2;
                if (arg0) {
                    class4.field109.method258();
                    class4.field109.method1200(-16777216, var14, arg5, arg3, arg2, 10);
                    class4.field109.method1200(-16777216, var14, arg5, arg1 + arg3 - var14, arg2, 10);
                }
                arg3 += var14;
                arg1 -= var14 * 2;
            }
        }
        class12.field206 = arg5;
        class348.field5208 = arg3;
        class289.field4117 = (short) arg2;
        class183.field2735 = (short) arg1;
        class50.field902 = arg1 * var7 / 334;
    }
}
