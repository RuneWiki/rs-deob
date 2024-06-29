import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class339 {

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5269 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[Z")
    public static boolean[] field5266 = new boolean[100];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field5261;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field5265;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field5271;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public int field5272;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field5273;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field5274;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field5276;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public int field5277;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 10)
    public static void method2360(boolean arg0) {
        if (arg0) {
            method2363(58, 100, -126, -77, -33, 58);
        }
        field5266 = null;
        field5269 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIZ)I", line = 28)
    public static final int method2361(int arg0, int arg1, int arg2, boolean arg3) {
        field5257++;
        int var4 = arg2 & 0x3;
        if (!arg3) {
            method2360(true);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 65)
    public static final void method2362(int arg0, int arg1) {
        class173.field2790.method741(arg0, (byte) 116);
        class233.field3540.method741(arg0, (byte) 127);
        if (arg1 != 0) {
            field5269 = (String) null;
        }
        field5275++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIII)V", line = 95)
    public static final void method2363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5281++;
        class7.method72(arg2 + arg4, -7, -arg4 + arg2, class79.field1178[arg3], arg1);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg4 * arg4;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = var8 << 2;
        int var14 = (1 - var12) * var8 + var10;
        int var15 = var9 - (var12 - 1) * var11;
        int var16 = var9 << 2;
        if (arg0 >= -61) {
            method2364(-89, (byte) -114, 29, -98, 78);
        }
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var13;
        while (var7 > 0) {
            var7--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var17;
                    var17 += var16;
                    var15 += var19;
                    var6++;
                    var19 += var16;
                }
            }
            if (var15 < 0) {
                var6++;
                var14 += var17;
                var17 += var16;
                var15 += var19;
                var19 += var16;
            }
            var14 += -var20;
            var15 += -var18;
            int var21 = arg3 + var7;
            int var22 = arg3 - var7;
            int var23 = arg2 + var6;
            var20 -= var13;
            var18 -= var13;
            int var24 = arg2 - var6;
            class7.method72(var23, -7, var24, class79.field1178[var22], arg1);
            class7.method72(var23, -7, var24, class79.field1178[var21], arg1);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIII)V", line = 178)
    public static final void method2364(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 108) {
            return;
        }
        field5263++;
        int var5 = arg0;
        class7.method72(arg0 + arg3, arg1 + -115, arg3 - arg0, class79.field1178[arg2], arg4);
        int var6 = 0;
        int var7 = -arg0;
        int var8 = -1;
        while (var5 > var6) {
            var6++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                int var9 = arg3 + var6;
                var5--;
                int[] var10 = class79.field1178[arg2 - var5];
                var7 -= var5 << 1;
                int[] var11 = class79.field1178[arg2 + var5];
                int var12 = arg3 - var6;
                class7.method72(var9, -7, var12, var11, arg4);
                class7.method72(var9, arg1 ^ 0xFFFFFF95, var12, var10, arg4);
            }
            int var13 = arg3 + var5;
            int var14 = arg3 - var5;
            int[] var15 = class79.field1178[arg2 + var6];
            int[] var16 = class79.field1178[arg2 - var6];
            class7.method72(var13, -7, var14, var15, arg4);
            class7.method72(var13, -7, var14, var16, arg4);
        }
    }
}
