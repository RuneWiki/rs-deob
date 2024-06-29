import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class205 extends class108 {

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lsg;")
    private static class30 field3671 = class167.method1221((byte) 33, " ");

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field3676 = 0;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lsg;")
    public static class30 field3672 = field3671;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "[I")
    public static int[] field3674 = new int[100];

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lsg;")
    public class30 field3665;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lsg;")
    public class30 field3669;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
    public static boolean field3675;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Lt;")
    public final class211 method1443(byte arg0) {
        if (arg0 != 117) {
            method1445(-19, -120, -103, 41, -36, (byte) -62);
        }
        ++field3666;
        return class102.field2076[super.field2181];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class194.method1405(true, class121.field2390[arg5], arg0 + arg4, -arg4 + arg0, arg1);
        ++field3668;
        int var6 = 0;
        int var7 = arg4 * arg4;
        int var8 = arg2 * arg2;
        int var9 = var8 << 1;
        int var10 = arg2;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        if (arg3 != -3771) {
            field3671 = null;
        }
        int var13 = (-var12 + 1) * var7 + var9;
        int var14 = -((var12 + -1) * var11) + var8;
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((arg2 << 1) + -3) * var11;
        int var18 = (var6 - -1) * var16;
        int var19 = ((var6 << 1) + 3) * var9;
        int var20 = (arg2 - 1) * var15;
        while (~var10 < -1) {
            --var10;
            if (var13 < 0) {
                while (~var13 > -1) {
                    ++var6;
                    var13 += var19;
                    var14 += var18;
                    var18 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                ++var6;
                var14 += var18;
                var13 += var19;
                var18 += var16;
                var19 += var16;
            }
            var13 += -var20;
            int var21 = -var10 + arg5;
            var14 += -var17;
            var20 -= var15;
            var17 -= var15;
            int var22 = arg0 - -var6;
            int var23 = arg5 - -var10;
            int var24 = -var6 + arg0;
            class194.method1405(true, class121.field2390[var21], var22, var24, arg1);
            class194.method1405(true, class121.field2390[var23], var22, var24, arg1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field3670;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg4 * arg4;
        int var9 = arg1 * arg1;
        int var10 = arg1 << 1;
        int var11 = var8 << 1;
        int var12 = var9 << 1;
        int var13 = (-var10 + 1) * var8 + var12;
        int var14 = var8 << 2;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var12;
        int var17 = -((var10 - 1) * var11) + var9;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var15;
        int var20 = 123 % ((-63 - arg5) / 33);
        int var21 = (arg1 + -1) * var14;
        if (arg3 >= class275.field4804 && ~class167.field3064 <= ~arg3) {
            int var22 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - -arg4);
            int var23 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 - arg4);
            class194.method1405(true, class121.field2390[arg3], var22, var23, arg2);
        }
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var17 += var19;
                    ++var6;
                    var13 += var16;
                    var16 += var15;
                    var19 += var15;
                }
            }
            if (var17 < 0) {
                ++var6;
                var17 += var19;
                var19 += var15;
                var13 += var16;
                var16 += var15;
            }
            --var7;
            var17 += -var18;
            int var24 = arg3 - -var7;
            var13 += -var21;
            var18 -= var14;
            var21 -= var14;
            int var25 = -var7 + arg3;
            if (var24 >= class275.field4804 && var25 <= class167.field3064) {
                int var26 = class68.method609(class48.field1096, 22050, class252.field4458, arg0 + var6);
                int var27 = class68.method609(class48.field1096, 22050, class252.field4458, -var6 + arg0);
                if (~class275.field4804 >= ~var25) {
                    class194.method1405(true, class121.field2390[var25], var26, var27, arg2);
                }
                if (~var24 >= ~class167.field3064) {
                    class194.method1405(true, class121.field2390[var24], var26, var27, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        if (arg0 > -13) {
            method1444(-10, 77, -45, 0, -47, -127);
        }
        field3674 = null;
        field3671 = null;
        field3672 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)V")
    public static final void method1447(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 86) {
            field3676 = 55;
        }
        ++field3677;
        if (~class36.field868 == -2) {
            class102.field2068[class108.field2179 / 100].method446(class150.field2847 + -8, class44.field1035 + -8);
        }
        if (~class36.field868 == -3) {
            class102.field2068[class108.field2179 / 100 + 4].method446(class150.field2847 + -8, class44.field1035 + -8);
        }
        class121.method920((byte) -71);
    }
}
