import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class69 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lig;")
    public static class206 field747 = new class206(29, 3);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        field746++;
        if (arg0 < 111) {
            field747 = null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII[BI)V")
    public static final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field748++;
        if (arg0 >= -34) {
            field747 = null;
        }
        if (arg2 > 0 && !class229.method1482(arg2, 91)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class229.method1482(arg1, 111)) {
            int var7 = class525.method3093(arg3, (byte) 85);
            int var8 = 0;
            int var9 = arg2 >= arg1 ? arg1 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg5;
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var8, arg6, arg2, arg1, 0, arg3, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
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
                byte[] var16 = var13;
                var13 = var12;
                arg1 = var11;
                var12 = var16;
                arg2 = var10;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method466(byte arg0) {
        field747 = null;
        if (arg0 != -23) {
            field747 = null;
        }
    }
}
