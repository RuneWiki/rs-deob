import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class210 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lmga;")
    public static class739 field2781 = new class739(37, 2);

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "F")
    public static float field2780;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V")
    public static final void method1395(boolean arg0, int arg1) {
        field2779++;
        if (class704.field9864.length() == 0) {
            return;
        }
        class164.method1188((byte) -112, "--> " + class704.field9864);
        if (arg1 != -18422) {
            method1395(false, 51);
        }
        class739.method4093(class704.field9864, false, arg0, -1);
        class226.field3100 = 0;
        class704.field9864 = "";
        class643.field8926 = 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method1396(int arg0) {
        int var1 = -112 % ((-arg0 - 54) / 53);
        field2781 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2782++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        if (arg2 >= -28) {
            field2781 = null;
        }
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (arg0 >= class523.field7178 && arg0 <= class495.field6845) {
            int var21 = class573.method3204(arg1 + arg4, class174.field2335, 124915076, class751.field10402);
            int var22 = class573.method3204(arg4 - arg1, class174.field2335, 124915076, class751.field10402);
            class138.method1069(class785.field10808[arg0], (byte) 88, var22, var21, arg5);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (class523.field7178 <= var24 && var23 <= class495.field6845) {
                int var25 = class573.method3204(arg4 + var6, class174.field2335, 124915076, class751.field10402);
                int var26 = class573.method3204(arg4 - var6, class174.field2335, 124915076, class751.field10402);
                if (class523.field7178 <= var23) {
                    class138.method1069(class785.field10808[var23], (byte) 90, var26, var25, arg5);
                }
                if (var24 <= class495.field6845) {
                    class138.method1069(class785.field10808[var24], (byte) 124, var26, var25, arg5);
                }
            }
        }
    }
}
