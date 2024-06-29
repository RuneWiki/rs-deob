import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class426 extends class42 {

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public int field5819;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public int field5827;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[Z")
    public boolean[] field5821;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "[I")
    public int[] field5825;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "[[I")
    public int[][] field5829;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "[I")
    public int[] field5826;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "[I")
    public static int[] field5818 = new int[2];

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "F")
    public static float field5820 = 1024.0F;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field5823 = -1;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Lcu;")
    public static class145 field5828 = new class145(0, 0);

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZIIIIII)V", line = 11)
    public static final void method2457(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class233.method1449(arg5, 127);
        field5822++;
        int var7 = 0;
        int var8 = arg5 - arg3;
        if (arg0) {
            return;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class457.field6299[arg4];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class427.method2465(var15, var16, arg1 - arg5, -7, arg2);
        class427.method2465(var15, var17, var16, -7, arg6);
        class427.method2465(var15, arg1 + arg5, var17, -7, arg2);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class522.field7720[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class457.field6299[arg4 + var9];
                    int[] var19 = class457.field6299[arg4 - var9];
                    int var20 = class522.field7720[var9];
                    int var21 = arg1 + var7;
                    int var22 = arg1 - var7;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class427.method2465(var18, var24, var22, -7, arg2);
                    class427.method2465(var18, var23, var24, -7, arg6);
                    class427.method2465(var18, var21, var23, -7, arg2);
                    class427.method2465(var19, var24, var22, -7, arg2);
                    class427.method2465(var19, var23, var24, -7, arg6);
                    class427.method2465(var19, var21, var23, -7, arg2);
                } else {
                    int[] var25 = class457.field6299[arg4 + var9];
                    int[] var26 = class457.field6299[arg4 - var9];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class427.method2465(var25, var27, var28, -7, arg2);
                    class427.method2465(var26, var27, var28, -7, arg2);
                }
            }
            int[] var29 = class457.field6299[arg4 + var7];
            int[] var30 = class457.field6299[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class522.field7720[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class427.method2465(var29, var35, var32, -7, arg2);
                class427.method2465(var29, var34, var35, -7, arg6);
                class427.method2465(var29, var31, var34, -7, arg2);
                class427.method2465(var30, var35, var32, -7, arg2);
                class427.method2465(var30, var34, var35, -7, arg6);
                class427.method2465(var30, var31, var34, -7, arg2);
            } else {
                class427.method2465(var29, var31, var32, -7, arg2);
                class427.method2465(var30, var31, var32, -7, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 145)
    public static void method2458(int arg0) {
        if (arg0 == -5254) {
            field5818 = null;
            field5828 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(I[B)V", line = 163)
    public class426(int arg0, byte[] arg1) {
        this.field5819 = arg0;
        class379 var3 = new class379(arg1);
        this.field5827 = var3.method2238(255);
        this.field5821 = new boolean[this.field5827];
        this.field5825 = new int[this.field5827];
        this.field5829 = new int[this.field5827][];
        this.field5826 = new int[this.field5827];
        for (int var4 = 0; var4 < this.field5827; var4++) {
            this.field5825[var4] = var3.method2238(255);
        }
        for (int var5 = 0; var5 < this.field5827; var5++) {
            this.field5821[var5] = var3.method2238(255) == 1;
        }
        for (int var6 = 0; var6 < this.field5827; var6++) {
            this.field5826[var6] = var3.method2212((byte) 83);
        }
        for (int var7 = 0; var7 < this.field5827; var7++) {
            this.field5829[var7] = new int[var3.method2238(255)];
        }
        for (int var8 = 0; var8 < this.field5827; var8++) {
            for (int var9 = 0; var9 < this.field5829[var8].length; var9++) {
                this.field5829[var8][var9] = var3.method2238(255);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z", line = 224)
    public static final boolean method2459(int arg0, int arg1, int arg2) {
        field5824++;
        if (arg0 < 116) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }
}
