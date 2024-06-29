import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class145 extends class276 {

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lcg;")
    public static class247 field2474 = new class247(0, 0);

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "[I")
    public static int[] field2477 = new int[500];

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "[I")
    public static int[] field2478 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field2475 = 0;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field2476 = 0;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field2480 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2482 = "M";

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "[I")
    public static int[] field2483 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Lvh;")
    public static class108 field2481;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[Lcj;")
    public static class74[] field2479;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2471++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var8 << 1;
        int var11 = arg0 << 1;
        int var12 = var9 - ((var11 - 1) * var10);
        int var13 = var8 << 2;
        int var14 = var9 << 2;
        int var15 = (var6 + 1) * var14;
        int var16 = var9 << 1;
        int var17 = (1 - var11) * var8 + var16;
        int var18 = ((arg0 << 1) + arg5) * var10;
        if (arg2 >= class118.field2094 && class89.field1582 >= arg2) {
            int var19 = class160.method1090(arg3 + arg4, (byte) 16, class118.field2098, class126.field2222);
            int var20 = class160.method1090(arg4 - arg3, (byte) 16, class118.field2098, class126.field2222);
            class93.method598(-7, var19, var20, class167.field2735[arg2], arg1);
        }
        int var21 = (arg0 - 1) * var13;
        int var22 = ((var6 << 1) + 3) * var16;
        while (var7 > 0) {
            if (var17 < 0) {
                while (var17 < 0) {
                    var17 += var22;
                    var22 += var14;
                    var12 += var15;
                    var15 += var14;
                    var6++;
                }
            }
            if (var12 < 0) {
                var12 += var15;
                var15 += var14;
                var6++;
                var17 += var22;
                var22 += var14;
            }
            var17 += -var21;
            var12 += -var18;
            var18 -= var13;
            var21 -= var13;
            var7--;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (var24 >= class118.field2094 && class89.field1582 >= var23) {
                int var25 = class160.method1090(arg4 + var6, (byte) 16, class118.field2098, class126.field2222);
                int var26 = class160.method1090(arg4 - var6, (byte) 16, class118.field2098, class126.field2222);
                if (var23 >= class118.field2094) {
                    class93.method598(-7, var25, var26, class167.field2735[var23], arg1);
                }
                if (class89.field1582 >= var24) {
                    class93.method598(-7, var25, var26, class167.field2735[var24], arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        field2472++;
        if (arg0 <= 39) {
            field2483 = null;
        }
        return class175.field2883;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lvh;III)[Lcj;")
    public static final class74[] method1006(class108 arg0, int arg1, int arg2, int arg3) {
        field2473++;
        if (class127.method876(arg2, arg0, arg3, arg1 - 8632)) {
            if (arg1 != -3) {
                method1005(-1, 28, 48, -6, 27, 11);
            }
            return class208.method1393(-8573);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
    public static void method1007(byte arg0) {
        field2482 = null;
        field2474 = null;
        field2479 = null;
        field2481 = null;
        field2483 = null;
        int var1 = -92 / ((12 - arg0) / 62);
        field2477 = null;
        field2480 = null;
        field2478 = null;
    }
}
