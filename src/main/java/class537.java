import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class537 extends class424 {

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field6989 = 0;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
    private static short[] field6992 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field6990 = 0;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "[S")
    private static short[] field6996 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!as", name = "w", descriptor = "[S")
    private static short[] field6993 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!as", name = "q", descriptor = "[[S")
    public static short[][] field6987 = new short[][] { field6992, field6993, field6996 };

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public int field6984;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public int field6991;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "[I")
    public int[] field6985;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[I")
    public int[] field6988;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[I")
    public int[] field6995;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "[Ldn;")
    public class548[] field6994;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "[Ldn;")
    public class548[] field6998;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[[[B")
    public byte[][][] field6986;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V", line = 12)
    public static void method2855(boolean arg0) {
        field6993 = null;
        field6987 = null;
        field6996 = null;
        field6992 = null;
        if (!arg0) {
            method2855(false);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII[III)V", line = 33)
    public static final void method2856(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field6997++;
        if (arg1 > 0 && !class386.method2202(-46, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class386.method2202(-64, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var8 = 0;
            int var9 = arg4 <= arg1 ? arg4 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg5;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var8, arg7, arg1, arg4, 0, arg6, arg0, var12, 0);
                if (var9 <= 1) {
                    int var40 = -77 % ((arg3 + 46) / 46);
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg1 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var12[var16++];
                        int var24 = var20 & 0xFF;
                        int var25 = (var20 & 0xFFFEF9) >> 16;
                        int var26 = var20 >> 8 & 0xFF;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var22 >> 16 & 0xFF) + var25;
                        int var29 = (var22 >> 8 & 0xFF) + var26;
                        int var30 = (var22 >> 24 & 0xFF) + var27;
                        int var31 = (var22 & 0xFF) + var24;
                        int var32 = (var21 >> 24 & 0xFF) + var30;
                        int var33 = ((var21 & 0xFF8391) >> 16) + var28;
                        int var34 = (var21 & 0xFF) + var31;
                        int var35 = (var21 >> 8 & 0xFF) + var29;
                        int var36 = (var23 >> 24 & 0xFF) + var32;
                        int var37 = (var23 >> 8 & 0xFF) + var35;
                        int var38 = ((var23 & 0xFF914F) >> 16) + var33;
                        int var39 = (var23 & 0xFF) + var34;
                        var13[var14++] = class131.method954(class131.method954(class131.method954(class597.method3238(var36 << 22, -16777216), class597.method3238(var38 << 14, 16711680)), class597.method3238(var37, 1020) << 6), class597.method3238(var39 >> 2, 255));
                    }
                    var16 += arg1;
                    var15 += arg1;
                }
                int[] var18 = var13;
                var13 = var12;
                var12 = var18;
                arg1 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
