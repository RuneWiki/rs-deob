import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 extends class557 {

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!uja", name = "o", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!uja", name = "n", descriptor = "J")
    private long field396;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(BLdt;)V", line = 4)
    public final void method30(byte arg0, class254 arg1) {
        if (arg0 == 110) {
            this.field398 = arg1.method1672(arg0 ^ 0xFFFFBF12);
            field395++;
            this.field396 = arg1.method1723(arg0 + 21685);
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "([FIIIIII)V", line = 17)
    public static final void method217(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field399++;
        if (arg6 > 0 && !class439.method2627(0, arg6)) {
            throw new IllegalArgumentException("");
        }
        int var7 = -64 % ((arg3 - 3) / 39);
        if (arg1 > 0 && !class439.method2627(0, arg1)) {
            throw new IllegalArgumentException("");
        }
        int var8 = class478.method2826(arg2, (byte) 95);
        int var9 = 0;
        int var10 = arg6 >= arg1 ? arg1 : arg6;
        int var11 = arg6 >> 1;
        int var12 = arg1 >> 1;
        float[] var13 = arg0;
        float[] var14 = new float[var11 * var12 * var8];
        while (true) {
            OpenGL.glTexImage2Df(arg4, var9, arg5, arg6, arg1, 0, arg2, 5126, var13, 0);
            if (var10 <= 1) {
                return;
            }
            int var15 = arg6 * var8;
            float[] var16 = var14;
            for (int var17 = 0; var17 < var8; var17++) {
                int var18 = var17;
                int var19 = var17;
                int var20 = var17 + var15;
                for (int var21 = 0; var21 < var12; var21++) {
                    for (int var22 = 0; var22 < var11; var22++) {
                        float var23 = var13[var19];
                        int var24 = var8 + var19;
                        float var25 = var13[var24] + var23;
                        float var26 = var13[var20] + var25;
                        var19 = var8 + var24;
                        int var27 = var8 + var20;
                        float var28 = var13[var27] + var26;
                        var14[var18] = var28 * 0.25F;
                        var20 = var8 + var27;
                        var18 += var8;
                    }
                    var20 += var15;
                    var19 += var15;
                }
            }
            var14 = var13;
            arg1 = var12;
            arg6 = var11;
            var13 = var16;
            var11 >>= 0x1;
            var10 >>= 0x1;
            var9++;
            var12 >>= 0x1;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ltn;I)V", line = 125)
    public final void method32(class95 arg0, int arg1) {
        field397++;
        if (arg1 == -29265) {
            arg0.method733(arg1 + 29265, this.field396, this.field398);
        }
    }
}
