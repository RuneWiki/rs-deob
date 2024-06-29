import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class84 {

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lkn;")
    public static class530 field1063 = new class530("M", "M", "M", "M");

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1060;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 0) {
            return;
        }
        if (arg0 == arg3 && arg1 == arg8 && arg4 == arg6 && arg2 == arg5) {
            class389.method2254(arg4, arg2, arg9, 23261, arg1, arg3);
        } else {
            int var10 = arg3;
            int var11 = arg1;
            int var12 = arg3 * 3;
            int var13 = arg1 * 3;
            int var14 = arg0 * 3;
            int var15 = arg8 * 3;
            int var16 = arg6 * 3;
            int var17 = arg5 * 3;
            int var18 = arg4 + var14 - var16 - arg3;
            int var19 = var15 + arg2 - arg1 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg3 + (var27 - (-var29 - var31) >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg1;
                class389.method2254(var33, var34, arg9, 23261, var11, var10);
                var11 = var34;
                var10 = var33;
            }
        }
        field1062++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)[B", line = 81)
    public static final byte[] method612(int arg0, byte[] arg1) {
        if (arg0 != 17801) {
            method613(51);
        }
        field1059++;
        class403 var2 = new class403(arg1);
        int var3 = var2.method2357((byte) 122);
        int var4 = var2.method2319((byte) 126);
        if (var4 < 0 || class184.field2665 != 0 && class184.field2665 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2379(var4, -124, var5, 0);
            return var5;
        } else {
            int var6 = var2.method2319((byte) 84);
            if (var6 < 0 || !(class184.field2665 == 0 || class184.field2665 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class425.method2516(var7, var6, arg1, var4, 9);
            } else {
                class330.field4819.method1931(var2, -1, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 142)
    public static void method613(int arg0) {
        field1060 = null;
        if (arg0 == 4096) {
            field1063 = null;
        }
    }
}
