import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class609 implements class169 {

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field8755;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lvn;")
    public class186 field8760;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field8748;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lmf;")
    public class409 field8757;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Z")
    public static boolean field8751 = false;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "F")
    public static float field8756 = 0.0F;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field8749 = -1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljb;")
    public static class666 field8746 = new class666(1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lvo;")
    public static class345 field8758;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
    public static int[] field8759;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 4)
    public static final void method3457(int arg0) {
        class333.field4644 = new class302[2000];
        class576.field8442 = 0;
        class550.field8071 = 0;
        class316.field4374 = new class302[500];
        class465.field6718 = 0;
        class375.field5203 = class457.field6576;
        class117.field1847 = new class302[1000];
        field8752++;
        class82.field1262 = class457.field6576;
        class305.field4261 = false;
        class596.field8630 = new class302[500];
        class203.field3148 = 0;
        class682.field9711 = new int[class596.field8626][class33.field474 + 1][class687.field9758 + 1];
        if (arg0 != 100) {
            method3459(null, null, null, null, -50, -45, null, 111, -48, -70, 41, -61);
        }
        if (class490.field7029 instanceof class261) {
            class155.field2557 = false;
        } else {
            class155.field2557 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILr;I)Lda;", line = 33)
    public static final class397 method3458(int arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, int arg6) {
        field8754++;
        long var7 = (long) arg4;
        class397 var9 = (class397) class681.field9691.method941(var7, 0);
        short var10 = 2055;
        int var11 = -53 % ((72 - arg6) / 35);
        if (var9 == null) {
            class163 var12 = class84.method639(class205.field3168, -4341, arg4, 0);
            if (var12 == null) {
                return null;
            }
            if (var12.field2677 < 13) {
                var12.method1243(1, 2);
            }
            var9 = arg5.method795(var12, var10, class189.field2957, 64, 768);
            class681.field9691.method949(var7, true, var9);
        }
        class397 var13 = var9.method475((byte) 2, var10, true);
        if (arg3 != 0) {
            var13.method474(arg3);
        }
        if (arg2 != 0) {
            var13.method436(arg2);
        }
        if (arg0 != 0) {
            var13.method458(arg0);
        }
        if (arg1 != 0) {
            var13.method455(0, arg1, 0);
        }
        return var13;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lkq;", line = 98)
    public class696 method726(int arg0) {
        field8753++;
        if (arg0 != -17) {
            method3459(null, null, null, null, 90, 90, null, 115, -50, -42, -80, -45);
        }
        return class126.field2066;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lll;Lis;Lua;Lla;IILjava/lang/String;IIIII)V", line = 115)
    public static final void method3459(class490 arg0, class101 arg1, class591 arg2, class395 arg3, int arg4, int arg5, String arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg5 >= -82) {
            field8749 = 82;
        }
        field8747++;
        int var12;
        if (class40.field544 == 4) {
            var12 = (int) class473.field6790 & 0x3FFF;
        } else {
            var12 = (int) class473.field6790 + class419.field5957 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field1604 / 2, arg1.field1651 / 2) + 10;
        int var14 = arg4 * arg4 + arg10 * arg10;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class302.field4241[var12];
        int var16 = class302.field4242[var12];
        if (class40.field544 != 4) {
            var15 = var15 * 256 / (class239.field3523 + 256);
            var16 = var16 * 256 / (class239.field3523 + 256);
        }
        int var17 = arg4 * var16 + arg10 * var15 >> 14;
        int var18 = arg10 * var16 - (arg4 * var15) >> 14;
        int var19 = arg0.method2862(100, null, 59, arg6);
        int var20 = var17 - var19 / 2;
        int var21 = arg0.method2872(100, 0, 96, arg6, null);
        if (var20 >= -arg1.field1604 && arg1.field1604 >= var20 && var18 >= -arg1.field1651 && arg1.field1651 >= var18) {
            arg3.method2402(1, null, arg2, 50, arg8, (byte) 90, arg9, 0, 0, arg1.field1651 / 2 + arg9 - var21 - var18 - arg11, var19, arg7, arg6, 0, null, var20 + (arg1.field1604 / 2) + arg8);
        }
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 169)
    public static void method3460(int arg0) {
        field8758 = null;
        if (arg0 != 64) {
            field8758 = null;
        }
        field8759 = null;
        field8746 = null;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(ILvn;Lmf;II)V", line = 181)
    public class609(int arg0, class186 arg1, class409 arg2, int arg3, int arg4) {
        this.field8755 = arg3;
        this.field8760 = arg1;
        this.field8748 = arg4;
        this.field8757 = arg2;
        this.field8750 = arg0;
    }
}
