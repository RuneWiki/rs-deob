import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class376 extends class75 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field4887 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Liaa;I)Lhba;", line = 5)
    public static final class10 method2065(class452 arg0, int arg1) {
        field4886++;
        return arg1 == -8 ? new class10(arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2549((byte) 32), arg0.method2524(3), arg0.method2524(3), arg0.method2541(104)) : null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)I", line = 24)
    public static final int method2066(byte arg0) {
        field4890++;
        if (arg0 != 1) {
            method2068(-30, (byte) 114);
        }
        return class533.field7631;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII[BII)V", line = 35)
    public static final void method2067(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field4889++;
        if (arg0 > 0 && !class644.method3612(false, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class644.method3612(false, arg3)) {
            int var7 = class488.method2824(arg2, arg6 ^ 0x2A36);
            int var8 = 0;
            int var9 = arg0 < arg3 ? arg0 : arg3;
            int var10 = arg0 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg5, arg0, arg3, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    if (arg6 != 1) {
                        field4887 = 10;
                        return;
                    }
                    return;
                }
                int var14 = arg0 * var7;
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
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg3 = var11;
                var12 = var15;
                arg0 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Z", line = 132)
    public static final boolean method2068(int arg0, byte arg1) {
        if (arg1 <= 92) {
            method2066((byte) -6);
        }
        field4888++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }
}
