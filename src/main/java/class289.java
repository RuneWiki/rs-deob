import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class289 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "[[Z")
    public static boolean[][] field4069 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4072 = 0;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static final void method1868(int arg0) {
        field4068++;
        if (arg0 != 0) {
            field4072 = -107;
        }
        class158.field2369 = null;
        class705.field9872 = null;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V")
    public static void method1869(int arg0) {
        if (arg0 == 5121) {
            field4069 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIII)V")
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 19) {
            field4072 = -46;
        }
        field4071++;
        if (arg1 != 8 && arg1 != 16) {
            class416 var5 = class390.field5454[arg3][arg4][arg2];
            if (var5 != null) {
                if (arg1 == 1) {
                    var5.field5833 = 0;
                } else if (arg1 == 2) {
                    var5.field5836 = 0;
                }
            }
            class80.method786((byte) 45);
            return;
        }
        for (int var6 = 0; var6 < class650.field9180; var6++) {
            class433 var7 = class27.field380[var6];
            if (var7.field6044 == arg1 && var7.field6046 == arg4 && var7.field6050 == arg2 || var7.field6048 == arg4 && var7.field6050 == arg2) {
                if (class650.field9180 != var6) {
                    class622.method3594(class27.field380, var6 + 1, class27.field380, var6, -(var6 - class27.field380.length) - 1);
                }
                class650.field9180--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIII[B)V")
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field4070++;
        if (arg4 > 0 && !class278.method1826((byte) 126, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class278.method1826((byte) 125, arg3)) {
            int var7 = class209.method1468(-6411, arg1);
            if (arg0 != -2130771968) {
                field4072 = -14;
            }
            int var8 = 0;
            int var9 = arg4 < arg3 ? arg4 : arg3;
            int var10 = arg4 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg2, arg4, arg3, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg4 = var10;
                arg3 = var11;
                var12 = var16;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
