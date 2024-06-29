import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class154 extends class425 {

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2608 = 328;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "[[S")
    public static short[][] field2612;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BIIIIII)V")
    public static final void method1196(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2611++;
        if (arg5 > 0 && !class141.method1144(0, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class141.method1144(0, arg6)) {
            int var7 = class680.method3826(arg2 ^ 0x609B9587, arg3);
            int var8 = 0;
            int var9 = arg6 <= arg5 ? arg6 : arg5;
            if (arg2 != -1620809119) {
                method1197(false);
            }
            int var10 = arg5 >> 1;
            int var11 = arg6 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var8, arg4, arg5, arg6, 0, arg3, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
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
                var13 = var12;
                arg5 = var10;
                var12 = var15;
                arg6 = var11;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method1197(boolean arg0) {
        if (arg0) {
            field2608 = -91;
        }
        field2612 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
    public class154(int arg0, int arg1) {
        this.field2610 = arg1;
        this.field2609 = arg0;
    }
}
