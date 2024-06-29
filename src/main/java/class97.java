import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class97 {

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public int field1746 = -1;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1744 = -1;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Z")
    public static boolean field1748 = false;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public int field1752;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
    public int field1753;

    @OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III[BIII)V")
    public static final void method737(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field1754++;
        if (arg1 > 0 && !class110.method789(arg1, 1135345664)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class110.method789(arg4, 1135345664)) {
            int var7 = class287.method1746(arg5 ^ 0x22022181, arg2);
            int var8 = 0;
            int var9 = arg1 < arg4 ? arg1 : arg4;
            if (arg5 != -570565119) {
                method737(115, 121, 90, null, -118, -87, -47);
            }
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg3;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg0, arg1, arg4, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
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
                arg4 = var11;
                var12 = var16;
                arg1 = var10;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
