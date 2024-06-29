import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class175 {

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2063 = null;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2062 = 0;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII[B)Z", line = 5)
    public static final boolean method1082(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2060++;
        boolean var6 = true;
        class244 var7 = new class244(arg5);
        if (arg2 != 63) {
            return true;
        }
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method1435(true);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class316 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1463(3010);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method1423(arg2 - 174);
                                    }
                                    int var12 = var7.method1463(3010);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method1423(-12) >> 2;
                                    var16 = arg1 + var14;
                                    var17 = arg3 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg0 - 1) <= var16);
                    } while (var17 >= (arg4 - 1));
                    var18 = class445.field6442.method3972((byte) 113, var8);
                } while (var15 == 22 && class654.field9334.field9855.method2962(-122) == 0 && var18.field4001 == 0 && var18.field4046 != 1 && !var18.field4052);
                var11 = true;
                if (!var18.method1888(0)) {
                    class491.field6992++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V", line = 88)
    public static void method1083(int arg0) {
        if (arg0 != -21065) {
            method1082(31, 92, 119, -10, 66, null);
        }
        field2063 = null;
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([FIIIIII)V", line = 102)
    public static final void method1084(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2064++;
        if (arg5 < arg2 && !class560.method3273(-3469, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class560.method3273(-3469, arg4)) {
            int var7 = class99.method688((byte) -52, arg1);
            int var8 = 0;
            int var9 = arg4 <= arg2 ? arg4 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg6, var8, arg3, arg2, arg4, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg2 = var10;
                arg4 = var11;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
