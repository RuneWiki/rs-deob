import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class466 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "S")
    public static short field6924 = 320;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lev;")
    public static class107 field6923 = new class107(0, 0);

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lvv;")
    public static class313 field6925 = new class313(105, -2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II[BIIII)V", line = 5)
    public static final void method2770(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field6922++;
        if (arg5 > 0 && !class137.method1029(arg5, false)) {
            throw new IllegalArgumentException("");
        } else if (arg4 >= arg0 || class137.method1029(arg0, false)) {
            int var7 = class214.method1412(arg1, 61);
            int var8 = 0;
            int var9 = arg0 <= arg5 ? arg0 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg2;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg3, arg5, arg0, 0, arg1, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg5 = var10;
                arg0 = var11;
                var12 = var15;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 99)
    public static void method2771(byte arg0) {
        field6925 = null;
        field6923 = null;
        if (arg0 != -74) {
            field6923 = null;
        }
    }
}
