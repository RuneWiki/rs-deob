import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class4 extends class81 {

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field45 = 0;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lr;")
    public static class66 field46 = class93.method641(43, ")3");

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "S")
    public static short field48 = 32767;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "Z")
    public static boolean field47 = false;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "[[I")
    public static int[][] field51 = new int[5][5000];

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "[I")
    public static int[] field49 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIBI)V")
    public static final void method15(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = arg2;
        field43++;
        int var7 = 0;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        if (arg4 != 47) {
            field48 = -19;
        }
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = (1 - var12) * var8 + var10;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg2 << 1) - 3) * var11;
        int var18 = ((var7 << 1) + 3) * var10;
        int var19 = (var7 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        if (class241.field4186 <= arg1 && class222.field3788 >= arg1) {
            int var21 = class54.method368(arg0 + arg3, class215.field3706, (byte) 114, class165.field2972);
            int var22 = class54.method368(arg0 - arg3, class215.field3706, (byte) 114, class165.field2972);
            class194.method1266(var22, (byte) -17, arg5, class15.field183[arg1], var21);
        }
        while (var6 > 0) {
            var6--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var13 += var19;
                    var19 += var16;
                    var18 += var16;
                    var7++;
                }
            }
            int var23 = arg1 - var6;
            int var24 = arg1 + var6;
            if (var13 < 0) {
                var7++;
                var14 += var18;
                var13 += var19;
                var19 += var16;
                var18 += var16;
            }
            var14 += -var20;
            var13 += -var17;
            if (class241.field4186 <= var24 && class222.field3788 >= var23) {
                int var25 = class54.method368(arg0 + var7, class215.field3706, (byte) 114, class165.field2972);
                int var26 = class54.method368(arg0 - var7, class215.field3706, (byte) 114, class165.field2972);
                if (class241.field4186 <= var23) {
                    class194.method1266(var26, (byte) -17, arg5, class15.field183[var23], var25);
                }
                if (var24 <= class222.field3788) {
                    class194.method1266(var26, (byte) -17, arg5, class15.field183[var24], var25);
                }
            }
            var17 -= var15;
            var20 -= var15;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method16(int arg0) {
        if (arg0 != 1) {
            method15(81, -116, -60, 54, (byte) -84, -25);
        }
        field46 = null;
        field49 = null;
        field51 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
    public static final void method17(boolean arg0, int arg1) {
        field44++;
        if (arg1 == 1) {
            class76.field1514 = arg0;
            class8.field87 = !class88.method625(24781);
        }
    }
}
