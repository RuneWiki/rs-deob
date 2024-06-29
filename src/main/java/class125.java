import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class125 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[Llf;")
    public static class143[] field1772 = new class143[2048];

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public static int[] field1771 = new int[500];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field1774 = -1;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1776 = "wave:";

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "F")
    public static float field1777;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[S")
    public static short[] field1773;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V", line = 7)
    public static final void method855(boolean arg0, int arg1) {
        field1775++;
        class282.field4498 = null;
        class258.field4083 = -1;
        class28.field330 = 1;
        class24.field281 = arg1;
        class19.field231 = -1;
        class2.field23 = 0;
        class203.field3094 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V", line = 41)
    public static final void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1778++;
        if (arg0 == arg7 && arg4 == arg6 && arg2 == arg9 && arg3 == arg8) {
            class321.method2237(arg5, arg2, arg8, (byte) 66, arg7, arg4);
        } else {
            int var10 = arg7;
            int var11 = arg7 * 3;
            int var12 = arg4;
            int var13 = arg4 * 3;
            int var14 = arg0 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg3 * 3;
            int var18 = arg8 + var15 - var17 - arg4;
            int var19 = arg2 - (var16 - var14) - arg7;
            int var20 = var11 + var16 - var14 - var14;
            int var21 = var15 - var13;
            int var22 = var17 - (var15 + var15 - var13);
            int var23 = var14 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var22 * var25;
                int var29 = var19 * var26;
                int var30 = var20 * var25;
                int var31 = var21 * var24;
                int var32 = (var27 + var28 + var31 >> 12) + arg4;
                int var33 = var23 * var24;
                int var34 = (var29 + var33 + var30 >> 12) + arg7;
                class321.method2237(arg5, var34, var32, (byte) 114, var10, var12);
                var12 = var32;
                var10 = var34;
            }
        }
        if (arg1 != 1558) {
            field1777 = 0.2653537F;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 124)
    public static void method857(boolean arg0) {
        if (!arg0) {
            field1773 = (short[]) null;
        }
        field1771 = null;
        field1772 = null;
        field1776 = null;
        field1773 = null;
    }
}
