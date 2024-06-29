import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class172 extends class28 {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[C")
    public static char[] field2155 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[[B")
    public static byte[][] field2151 = new byte[1000][];

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
    public static boolean field2156 = false;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "[Lxa;")
    public static class424[] field2152;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III[FIII)V", line = 5)
    public static final void method1146(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field2158++;
        if (arg1 > 0 && !class144.method986(arg1, (byte) -99)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class144.method986(arg0, (byte) -101)) {
            int var7 = class661.method3672(arg4, -6411);
            int var8 = arg6;
            int var9 = arg0 <= arg1 ? arg0 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg2, arg1, arg0, 0, arg4, 5126, var12, 0);
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
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
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
                float[] var16 = var13;
                var13 = var12;
                arg0 = var11;
                arg1 = var10;
                var12 = var16;
                var9 >>= 0x1;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 102)
    public static void method1147(int arg0) {
        field2155 = null;
        field2152 = null;
        field2151 = null;
        if (arg0 != -1) {
            field2152 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B[B)[B", line = 118)
    public static final byte[] method1148(byte arg0, byte[] arg1) {
        field2154++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class657.method3639(arg1, 0, var2, 0, arg1.length);
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 139)
    public static final void method1149(int arg0) {
        field2153++;
        if (arg0 < 12) {
            method1146(-105, 77, 94, null, 93, -48, -43);
        }
        class175.field2203.method3142(false);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V", line = 156)
    public class172(int arg0, int arg1) {
        this.field2150 = arg0;
        this.field2157 = arg1;
    }
}
