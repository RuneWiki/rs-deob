import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class174 extends class132 {

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
    public static int[] field3273 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Z")
    public static boolean field3275 = false;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "[B")
    public static byte[] field3269 = new byte[32896];

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Lvd;")
    public static class222 field3278;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Ls;")
    public class188 field3268;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lve;")
    public class223 field3264;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "[B")
    public byte[] field3274;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
    public static int[] field3266;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "[I")
    public static int[] field3279;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class81.method532(arg5 - arg3, arg0, class156.field2981[arg1], arg3 + arg5, -7);
        field3276++;
        int var6 = 0;
        int var7 = arg3 * arg3;
        int var8 = arg4 * arg4;
        int var9 = arg4;
        int var10 = var8 << 1;
        if (arg2 != -32612) {
            method1099(40, 99, -109, -3);
        }
        int var11 = arg4 << 1;
        int var12 = var7 << 1;
        int var13 = (1 - var11) * var7 + var10;
        int var14 = var8 - (var11 - 1) * var12;
        int var15 = ((arg4 << 1) - 3) * var12;
        int var16 = var7 << 2;
        int var17 = (arg4 - 1) * var16;
        int var18 = var8 << 2;
        int var19 = ((var6 << 1) + 3) * var10;
        int var20 = (var6 + 1) * var18;
        while (var9 > 0) {
            var9--;
            int var21 = arg1 - var9;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var19;
                    var19 += var18;
                    var6++;
                    var14 += var20;
                    var20 += var18;
                }
            }
            int var22 = arg1 + var9;
            if (var14 < 0) {
                var14 += var20;
                var20 += var18;
                var13 += var19;
                var6++;
                var19 += var18;
            }
            int var23 = arg5 + var6;
            var13 += -var17;
            int var24 = arg5 - var6;
            var14 += -var15;
            class81.method532(var24, arg0, class156.field2981[var21], var23, arg2 + 32605);
            class81.method532(var24, arg0, class156.field2981[var22], var23, -7);
            var17 -= var16;
            var15 -= var16;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3) {
        field3271++;
        if (arg3 != -421473367) {
            field3269 = null;
        }
        if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            class10.field199 = -1;
            class26.field597 = -1;
            return;
        }
        int var4 = class71.method482(arg0, arg2, class217.field4036, (byte) 124) - arg1;
        int var5 = arg2 - class211.field3923;
        int var6 = arg0 - class110.field2059;
        int var7 = class199.field3640[class11.field213];
        int var8 = var4 - class118.field2243;
        int var9 = class199.field3624[class11.field213];
        int var10 = class199.field3640[class54.field1021];
        int var11 = class199.field3624[class54.field1021];
        int var12 = var5 * var11 + var6 * var10 >> 16;
        int var13 = var6 * var11 - var5 * var10 >> 16;
        int var15 = var8 * var9 - var7 * var13 >> 16;
        int var16 = var7 * var8 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class26.field597 = (var12 << 9) / var16 + 256;
            class10.field199 = (var15 << 9) / var16 + 167;
        } else {
            class10.field199 = -1;
            class26.field597 = -1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public static final int method1100(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field3278 = null;
        field3273 = null;
        field3266 = null;
        field3269 = null;
        if (arg0 <= 15) {
            field3266 = null;
        }
        field3279 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lfj;")
    public static final class65 method1102(int arg0, int arg1) {
        field3265++;
        class65 var2 = (class65) class110.field2060.method601((long) arg0, arg1 ^ 0x7F);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class222.field4122.method33(-29616, class216.method1373(-125, arg0), class217.method1377(arg1 + 104, arg0));
        if (arg1 != 0) {
            method1099(86, 81, -118, 14);
        }
        class65 var4 = new class65();
        var4.field1179 = arg0;
        if (var3 != null) {
            var4.method442((byte) 99, new class109(var3));
        }
        var4.method440(-1915469064);
        if (var4.field1235) {
            var4.field1189 = false;
            var4.field1225 = 0;
        }
        class110.field2060.method593((long) arg0, var4, (byte) -12);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3) {
        class121 var4 = class204.field3800[arg0][arg1][arg2];
        if (var4 != null) {
            class204.field3800[arg0][arg1][arg2].field2292 = arg3;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3269[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F)));
            }
        }
        field3278 = class212.method1357("Ung-Ultiger Benutzername", 10731);
    }
}
