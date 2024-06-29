import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class610 {

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public int field8319;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "[I")
    public int[] field8320;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "[I")
    public int[] field8318;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field8316 = 0;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIIIZII)V", line = 4)
    public static final void method3362(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field8314++;
        if (arg6 > 0 && !class144.method986(arg6, (byte) -108)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class144.method986(arg2, (byte) -102)) {
            int var7 = class661.method3672(arg5, -6411);
            int var8 = 0;
            int var9 = arg6 >= arg2 ? arg2 : arg6;
            if (!arg4) {
                method3363((byte) 86, -126, -41);
            }
            int var10 = arg6 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg0;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg1, arg6, arg2, 0, arg5, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg6 = var10;
                arg2 = var11;
                var8++;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)Z", line = 107)
    public static final boolean method3363(byte arg0, int arg1, int arg2) {
        if (arg0 < 2) {
            field8316 = -69;
        }
        field8315++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V", line = 122)
    public class610(int arg0) {
        this.field8319 = arg0;
        this.field8320 = new int[this.field8319];
        this.field8318 = new int[this.field8319];
    }
}
