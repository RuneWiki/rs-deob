import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class332 extends class101 {

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Lct;")
    private class156 field4788;

    @OriginalMember(owner = "client!vn", name = "P", descriptor = "Luca;")
    private class540 field4807;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Ldia;")
    private class246 field4779;

    @OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
    private int field4790;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
    private int field4785;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "[[F")
    private float[][] field4782;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "[[F")
    private float[][] field4780;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "[[F")
    private float[][] field4781;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    private int field4800;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "Ljp;")
    private class376 field4796;

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "Luj;")
    private class406 field4795;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "Lee;")
    private class706 field4783;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "Lm;")
    private class204 field4799;

    @OriginalMember(owner = "client!vn", name = "A", descriptor = "Lfha;")
    private class401 field4792;

    @OriginalMember(owner = "client!vn", name = "Q", descriptor = "Lwe;")
    private class430 field4808;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "Lwe;")
    private class430 field4786;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field4784 = 0;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "[S")
    private static short[] field4789 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "[S")
    private static short[] field4803 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!vn", name = "C", descriptor = "[S")
    private static short[] field4794 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!vn", name = "R", descriptor = "[S")
    private static short[] field4809 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "[[S")
    public static short[][] field4787 = new short[][] { field4794, field4809, field4789, field4803 };

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "Ljda;")
    public static class239 field4802 = new class239(260);

    @OriginalMember(owner = "client!vn", name = "S", descriptor = "[I")
    public static int[] field4810 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IS)V", line = 8)
    private final void method2081(int arg0, short arg1) {
        if (arg0 != -1) {
            this.field4801 = -95;
        }
        field4804++;
        if (this.field4779.field3588) {
            this.field4796.method2415(false, arg1);
        } else {
            this.field4796.method2368(127, arg1);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 30)
    public static final void method2082(int arg0) {
        class778.method4305(-1);
        field4797++;
        int var1 = class712.field9959.field1323.method3651(39);
        if (var1 == 2) {
            class350.method2205((byte) -126, 100, 100, class379.field5542, class140.field2048, class593.field8019);
        } else if (var1 == 3) {
            class692.method3834(class140.field2048, class494.field6842, 2, class379.field5542, 53, class462.field6397, class593.field8019, 2);
        }
        if (arg0 < 20) {
            method2084(3);
        }
        if (class712.field9959.field1323.method3655((byte) 39)) {
            class733.method4068(class706.field9894, (byte) -122);
        }
        if (class379.field5542 != null) {
            class560.method3149((byte) -109);
        }
        class200.field2658 = class712.field9959.field1323.method3651(25) != 0;
        class130.field1934 = class712.field9959.field1323.method3655((byte) -120);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[[ZII)V", line = 105)
    public final void method2083(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field4798++;
        if (this.field4799 == null || arg3 + arg1 < this.field4801 || this.field4790 < (arg3 - arg1) || this.field4791 > (arg1 + arg4) || this.field4785 < arg4 - arg1 || arg0 <= 77) {
            return;
        }
        for (int var6 = this.field4791; var6 <= this.field4785; var6++) {
            for (int var7 = this.field4801; var7 <= this.field4790; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg4;
                if (var8 > (-arg1) && var8 < arg1 && var9 > -arg1 && var9 < arg1 && arg2[var8 + arg1][arg1 + var9]) {
                    this.field4779.method1591((int) (this.field4807.method3083((byte) -41) * 255.0F) << 24, false);
                    this.field4779.method1600(null, this.field4786, this.field4808, (byte) 63, null);
                    this.field4779.method1586(this.field4799, this.field4800, 4, true, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 165)
    public static void method2084(int arg0) {
        field4789 = null;
        field4794 = null;
        field4802 = null;
        field4810 = null;
        field4803 = null;
        if (arg0 != -2174) {
            method2082(-43);
        }
        field4809 = null;
        field4787 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V", line = 181)
    private final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4806++;
        if (arg2 != -12551) {
            return;
        }
        long var8 = -1L;
        int var10 = (arg3 << this.field4788.field4297) + arg0;
        int var11 = arg6 + (arg4 << this.field4788.field4297);
        int var12 = this.field4788.method1882(var11, 0, var10);
        if ((arg0 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class101 var13 = this.field4783.method3953(var8, 14);
            if (var13 != null) {
                this.method2081(-1, ((class172) var13).field2301);
                return;
            }
        }
        short var14 = (short) (this.field4793++);
        if (var8 != -1L) {
            this.field4783.method3962(var8, new class172(var14), -116);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg6 == 0) {
            var15 = this.field4782[arg5][arg1];
            var16 = this.field4780[arg5][arg1];
            var17 = this.field4781[arg5][arg1];
        } else if (this.field4788.field4295 == arg0 && arg6 == 0) {
            var17 = this.field4781[arg5 + 1][arg1];
            var15 = this.field4782[arg5 + 1][arg1];
            var16 = this.field4780[arg5 + 1][arg1];
        } else if (this.field4788.field4295 == arg0 && this.field4788.field4295 == arg6) {
            var15 = this.field4782[arg5 + 1][arg1 + 1];
            var16 = this.field4780[arg5 + 1][arg1 + 1];
            var17 = this.field4781[arg5 + 1][arg1 + 1];
        } else if (arg0 == 0 && this.field4788.field4295 == arg6) {
            var17 = this.field4781[arg5][arg1 + 1];
            var16 = this.field4780[arg5][arg1 + 1];
            var15 = this.field4782[arg5][arg1 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field4788.field4295;
            float var19 = (float) arg6 / (float) this.field4788.field4295;
            float var20 = this.field4781[arg5][arg1];
            float var21 = this.field4782[arg5][arg1];
            float var22 = this.field4780[arg5][arg1];
            float var23 = this.field4781[arg5 + 1][arg1];
            float var24 = this.field4782[arg5 + 1][arg1];
            float var25 = (this.field4781[arg5 + 1][arg1 + 1] - var23) * var18 + var23;
            float var26 = this.field4780[arg5 + 1][arg1];
            float var27 = (this.field4782[arg5][arg1 + 1] - var21) * var18 + var21;
            float var28 = (this.field4780[arg5][arg1 + 1] - var22) * var18 + var22;
            float var29 = (this.field4781[arg5][arg1 + 1] - var20) * var18 + var20;
            float var30 = (this.field4782[arg5 + 1][arg1 + 1] - var24) * var18 + var24;
            var15 = (var30 - var27) * var19 + var27;
            var17 = (var25 - var29) * var19 + var29;
            float var31 = (this.field4780[arg5 + 1][arg1 + 1] - var26) * var18 + var26;
            var16 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field4807.method3085(24859) - var10);
        float var33 = (float) (this.field4807.method3082(arg2 + 12437) - var12);
        float var34 = (float) (this.field4807.method3084((byte) -16) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field4807.method3081(arg2 + 19587);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var37 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field4807.method3080((byte) -118);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF00) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field4779.field3588) {
            this.field4795.method2523(-4231, (float) var10);
            this.field4795.method2523(-4231, (float) var12);
            this.field4795.method2523(arg2 ^ 0x2180, (float) var11);
        } else {
            this.field4795.method2524(-116, (float) var10);
            this.field4795.method2524(76, (float) var12);
            this.field4795.method2524(75, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field4795.method2380(65280, var45);
        this.field4795.method2380(65280, var46);
        this.field4795.method2380(65280, var47);
        this.field4795.method2380(arg2 ^ 0xFFFF31F9, 255);
        this.method2081(-1, var14);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 351)
    public static final String method2086(int arg0, Throwable arg1) throws IOException {
        field4805++;
        String var2;
        if ((arg1 instanceof class85)) {
            class85 var3 = (class85) arg1;
            var2 = var3.field1187 + " | ";
            arg1 = var3.field1190;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 != -177) {
            field4810 = null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ldia;Lct;Luca;[I)V", line = 429)
    public class332(class246 arg0, class156 arg1, class540 arg2, int[] arg3) {
        this.field4788 = arg1;
        this.field4807 = arg2;
        this.field4779 = arg0;
        int var5 = this.field4807.method3081(7036) - (arg1.field4295 >> 1);
        this.field4801 = this.field4807.method3085(24859) - var5 >> arg1.field4297;
        this.field4790 = this.field4807.method3085(24859) + var5 >> arg1.field4297;
        this.field4791 = this.field4807.method3084((byte) -16) - var5 >> arg1.field4297;
        this.field4785 = var5 + this.field4807.method3084((byte) -16) >> arg1.field4297;
        int var6 = this.field4790 + 1 - this.field4801;
        int var7 = this.field4785 + 1 - this.field4791;
        this.field4782 = new float[var6 + 1][var7 + 1];
        this.field4780 = new float[var6 + 1][var7 + 1];
        this.field4781 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field4791 + var8;
            if (var25 > 0 && (this.field4788.field4300 - 1) > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field4801 + var26;
                    if (var27 > 0 && (this.field4788.field4301 - 1) > var27) {
                        int var28 = arg1.method1880(var27 + 1, false, var25) - arg1.method1880(var27 - 1, false, var25);
                        int var29 = arg1.method1880(var27, false, var25 + 1) - arg1.method1880(var27, false, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var28 * var28 + 65536))));
                        this.field4781[var26][var8] = (float) var28 * var30;
                        this.field4782[var26][var8] = var30 * -256.0F;
                        this.field4780[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4791; var10 <= this.field4785; var10++) {
            if (var10 >= 0 && arg1.field4300 > var10) {
                for (int var21 = this.field4801; var21 <= this.field4790; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4301) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field2148[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field4800 += 3;
                                    }
                                }
                            } else {
                                this.field4800 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4790 - this.field4801;
            }
        }
        if (this.field4800 > 0) {
            this.field4796 = new class376(this.field4800 * 2);
            this.field4795 = new class406(this.field4800 * 16);
            this.field4783 = new class706(class719.method4014(this.field4800, (byte) -100));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field4791; var13 <= this.field4785; var13++) {
                if (var13 >= 0 && var13 < arg1.field4300) {
                    int var14 = 0;
                    for (int var15 = this.field4801; var15 <= this.field4790; var15++) {
                        if (var15 >= 0 && arg1.field4301 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field2148[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field2131[var15][var13];
                                    int[] var19 = arg1.field2125[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2085(var18[var20], var11, -12551, var15, var13, var14, var19[var20]);
                                                var20++;
                                                this.method2085(var18[var20], var11, -12551, var15, var13, var14, var19[var20]);
                                                var20++;
                                                this.method2085(var18[var20], var11, -12551, var15, var13, var14, var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2085(0, var11, -12551, var15, var13, var14, 0);
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, 0);
                                    this.method2085(0, var11, -12551, var15, var13, var14, arg1.field4295);
                                } else if (var16 == 2) {
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, 0);
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, arg1.field4295);
                                    this.method2085(0, var11, -12551, var15, var13, var14, 0);
                                } else if (var16 == 5) {
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, arg1.field4295);
                                    this.method2085(0, var11, -12551, var15, var13, var14, arg1.field4295);
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, 0);
                                } else if (var16 == 4) {
                                    this.method2085(0, var11, -12551, var15, var13, var14, arg1.field4295);
                                    this.method2085(0, var11, -12551, var15, var13, var14, 0);
                                    this.method2085(arg1.field4295, var11, -12551, var15, var13, var14, arg1.field4295);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field4790 - this.field4801;
                }
                var11++;
            }
            this.field4799 = this.field4779.method1597(this.field4796.field5459, false, 5123, false, this.field4796.field5518);
            this.field4792 = this.field4779.method1596(0, this.field4795.field5459, this.field4795.field5518, false, 16);
            this.field4808 = new class430(this.field4792, 5126, 3, 0);
            this.field4786 = new class430(this.field4792, 5121, 4, 12);
        } else {
            this.field4792 = null;
            this.field4799 = null;
            this.field4808 = null;
            this.field4786 = null;
        }
        this.field4781 = this.field4782 = this.field4780 = null;
        this.field4783 = null;
        this.field4796 = null;
        this.field4795 = null;
    }
}
