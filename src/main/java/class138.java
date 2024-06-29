import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class138 extends class303 {

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    private int field2191 = 1;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    private int field2197 = 1;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "[Lpe;")
    public static class101[] field2193 = new class101[2048];

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "[Lhk;")
    public static class305[] field2196 = new class305[32768];

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2189 = null;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "[I")
    public static int[] field2190;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[I", line = 13)
    public final int[] method67(int arg0, int arg1) {
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int var4 = this.field2197 + this.field2197 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2191 + this.field2191 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field2197; var9 <= this.field2197 + arg1; var9++) {
                int var10 = 0;
                int[] var11 = this.method2107(class12.field240 & var9, arg0 ^ 0xFFFFFFFD, 0);
                int[] var12 = new int[class70.field1108];
                for (int var13 = -this.field2191; var13 <= this.field2191; var13++) {
                    var10 += var11[var13 & class40.field724];
                }
                int var14 = 0;
                while (class70.field1108 > var14) {
                    var12[var14] = var8 * var10 >> 16;
                    int var15 = var10 - var11[class40.field724 & var14 - this.field2191];
                    var14++;
                    var10 = var11[class40.field724 & this.field2191 + var14] + var15;
                }
                var7[var9 + this.field2197 - arg1] = var12;
            }
            for (int var16 = 0; var16 < class70.field1108; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        if (arg0 != -3) {
            method1056((byte) 32);
        }
        field2188++;
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILpe;I)V", line = 96)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field2194++;
        if (arg0 != -4004) {
            this.method74(-69, -22);
        }
        if (arg2 == 0) {
            this.field2191 = arg1.method741(arg0 + 4061);
        } else if (arg2 == 1) {
            this.field2197 = arg1.method741(arg0 ^ 0xFFFFF03A);
        } else if (arg2 == 2) {
            this.field4773 = arg1.method741(arg0 + 4100) == 1;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(BII)V", line = 146)
    public static final void method1055(byte arg0, int arg1, int arg2) {
        field2192++;
        class4 var3 = class67.method510(1, 5, arg1);
        if (arg0 >= -22) {
            field2196 = (class305[]) null;
        }
        var3.method14(24710);
        var3.field20 = arg2;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 191)
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V", line = 178)
    public static void method1056(byte arg0) {
        field2189 = null;
        field2190 = null;
        field2193 = null;
        field2196 = null;
        int var1 = -37 % ((arg0 + 8) / 51);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[[I", line = 200)
    public final int[][] method74(int arg0, int arg1) {
        int[][] var3 = this.field4772.method1175(-68, arg0);
        if (this.field4772.field2488) {
            int var4 = this.field2197 + this.field2197 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2191 - (-this.field2191 - 1);
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2197; var9 <= (this.field2197 + arg0); var9++) {
                int[][] var10 = this.method2106(class12.field240 & var9, 0, arg1 + 4);
                int[][] var11 = new int[3][class70.field1108];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field2191; var18 <= this.field2191; var18++) {
                    int var19 = class40.field724 & var18;
                    var12 += var15[var19];
                    var14 += var16[var19];
                    var13 += var17[var19];
                }
                int[] var20 = var11[1];
                int[] var21 = var11[0];
                int[] var22 = var11[2];
                int var23 = 0;
                while (var23 < class70.field1108) {
                    var21[var23] = var7 * var12 >> 16;
                    var20[var23] = var7 * var14 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = var23 - this.field2191 & class40.field724;
                    var23++;
                    int var25 = var13 - var17[var24];
                    int var26 = var14 - var16[var24];
                    int var27 = var12 - var15[var24];
                    int var28 = this.field2191 + var23 & class40.field724;
                    var13 = var17[var28] + var25;
                    var12 = var15[var28] + var27;
                    var14 = var16[var28] + var26;
                }
                var8[this.field2197 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class70.field1108; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var33 += var37[0][var32];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        field2195++;
        return arg1 == 82 ? var3 : (int[][]) ((int[][]) null);
    }
}
