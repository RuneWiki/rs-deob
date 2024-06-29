import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class90 extends class165 {

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "S")
    public static short field1250 = 320;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "Ldb;")
    public static class102 field1246 = new class102(64);

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 7)
    public static void method606(int arg0) {
        if (arg0 == 3) {
            field1246 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIBIII)V", line = 31)
    public static final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg5 && arg4 == arg8 && arg2 == arg3 && arg0 == arg9) {
            class25.method144(arg1, 28060, arg0, arg3, arg7, arg4);
        } else {
            int var10 = arg4;
            int var11 = arg1;
            int var12 = arg4 * 3;
            int var13 = arg1 * 3;
            int var14 = arg8 * 3;
            int var15 = arg5 * 3;
            int var16 = arg2 * 3;
            int var17 = arg9 * 3;
            int var18 = arg3 - var16 - (-var15 + arg1);
            int var19 = arg0 - (arg4 - var14) - var17;
            int var20 = var16 + var13 - var15 - var15;
            int var21 = var12 + var17 - var14 - var14;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var32 + var28 >> 12) + arg1;
                int var34 = (var27 - (-var30 - var31) >> 12) + arg4;
                class25.method144(var11, 28060, var34, var33, arg7, var10);
                var10 = var34;
                var11 = var33;
            }
        }
        field1248++;
        if (arg6 > -97) {
            field1246 = (class102) null;
        }
    }
}
