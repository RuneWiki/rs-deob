import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class226 extends class544 {

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "Lae;")
    private class209 field2794;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Lcba;")
    private class469 field2772;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lmh;")
    private class537 field2785;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field2784;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    private int field2780;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field2781;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[[F")
    private float[][] field2787;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[[F")
    private float[][] field2788;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "[[F")
    private float[][] field2778;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lro;")
    private class2 field2779;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lqo;")
    private class21 field2793;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lro;")
    private class2 field2786;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Lwj;")
    private class332 field2782;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Los;")
    private class374 field2776;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lgt;")
    private class385 field2770;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Lpt;")
    private class451 field2775;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
    public static final void method1291(int arg0, String arg1, File arg2) {
        class416.field5399.put(arg1, arg2);
        if (arg0 == 0) {
            field2790++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)Ldj;")
    public static final class287 method1292(int arg0, int arg1) {
        int var2 = -106 / ((-arg0 - 82) / 33);
        field2792++;
        if (arg1 == 0) {
            if ((double) class353.field4602 == 3.0D) {
                return class185.field2240;
            }
            if ((double) class353.field4602 == 4.0D) {
                return class516.field7284;
            }
            if ((double) class353.field4602 == 6.0D) {
                return class461.field6362;
            }
            if ((double) class353.field4602 >= 8.0D) {
                return class145.field1749;
            }
        } else if (arg1 == 1) {
            if ((double) class353.field4602 == 3.0D) {
                return class461.field6362;
            }
            if ((double) class353.field4602 == 4.0D) {
                return class145.field1749;
            }
            if ((double) class353.field4602 == 6.0D) {
                return class438.field6043;
            }
            if ((double) class353.field4602 >= 8.0D) {
                return class467.field6533;
            }
        } else if (arg1 == 2) {
            if ((double) class353.field4602 == 3.0D) {
                return class438.field6043;
            }
            if ((double) class353.field4602 == 4.0D) {
                return class467.field6533;
            }
            if ((double) class353.field4602 == 6.0D) {
                return class298.field3834;
            }
            if ((double) class353.field4602 >= 8.0D) {
                return class533.field7497;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III[[ZI)V")
    public final void method1293(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field2783++;
        if (this.field2782 == null || this.field2784 > (arg0 + arg2) || (arg2 - arg0) > this.field2777) {
            return;
        }
        if (arg4 != -8170) {
            method1291(-81, null, null);
        }
        if (arg0 + arg1 < this.field2780 || this.field2781 < arg1 - arg0) {
            return;
        }
        for (int var6 = this.field2780; var6 <= this.field2781; var6++) {
            for (int var7 = this.field2784; var7 <= this.field2777; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (var8 > (-arg0) && arg0 > var8 && var9 > -arg0 && var9 < arg0 && arg3[var8 + arg0][var9 + arg0]) {
                    this.field2785.method3059(65280, (int) (this.field2772.method2734((byte) -37) * 255.0F) << 24);
                    this.field2785.method3131(null, this.field2786, (byte) -109, this.field2779, null);
                    this.field2785.method3120(-5727, this.field2774, 4, this.field2782, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)V")
    private final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2773++;
        if (arg3 <= 125) {
            return;
        }
        long var8 = -1L;
        int var10 = arg6 + (arg5 << this.field2794.field2111);
        int var11 = (arg0 << this.field2794.field2111) + arg2;
        int var12 = this.field2794.method847(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class544 var13 = this.field2775.method2645(var8, (byte) -82);
            if (var13 != null) {
                this.method1295((byte) 88, ((class492) var13).field6867);
                return;
            }
        }
        short var14 = (short) (this.field2771++);
        if (var8 != -1L) {
            this.field2775.method2640(1, var8, new class492(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field2788[arg4][arg1];
            var16 = this.field2778[arg4][arg1];
            var17 = this.field2787[arg4][arg1];
        } else if (this.field2794.field2115 == arg6 && arg2 == 0) {
            var15 = this.field2788[arg4 + 1][arg1];
            var17 = this.field2787[arg4 + 1][arg1];
            var16 = this.field2778[arg4 + 1][arg1];
        } else if (this.field2794.field2115 == arg6 && this.field2794.field2115 == arg2) {
            var15 = this.field2788[arg4 + 1][arg1 + 1];
            var16 = this.field2778[arg4 + 1][arg1 + 1];
            var17 = this.field2787[arg4 + 1][arg1 + 1];
        } else if (arg6 == 0 && this.field2794.field2115 == arg2) {
            var16 = this.field2778[arg4][arg1 + 1];
            var17 = this.field2787[arg4][arg1 + 1];
            var15 = this.field2788[arg4][arg1 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field2794.field2115;
            float var19 = (float) arg2 / (float) this.field2794.field2115;
            float var20 = this.field2778[arg4][arg1];
            float var21 = this.field2788[arg4][arg1];
            float var22 = this.field2787[arg4][arg1];
            float var23 = this.field2778[arg4 + 1][arg1];
            float var24 = this.field2788[arg4 + 1][arg1];
            float var25 = (this.field2778[arg4][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field2778[arg4 + 1][arg1 + 1] - var23) * var18 + var23;
            float var27 = (this.field2787[arg4][arg1 + 1] - var22) * var18 + var22;
            float var28 = (this.field2788[arg4][arg1 + 1] - var21) * var18 + var21;
            float var29 = (this.field2788[arg4 + 1][arg1 + 1] - var24) * var18 + var24;
            float var30 = this.field2787[arg4 + 1][arg1];
            var16 = (var26 - var25) * var19 + var25;
            var15 = (var29 - var28) * var19 + var28;
            float var31 = (this.field2787[arg4 + 1][arg1 + 1] - var30) * var18 + var30;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field2772.method2731((byte) -96) - var10);
        float var33 = (float) (this.field2772.method2730(-1) - var12);
        float var34 = (float) (this.field2772.method2737((byte) -86) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2772.method2735((byte) 104);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2772.method2736((byte) -80);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFCF) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2785.field7754) {
            this.field2770.method2221(-128, (float) var10);
            this.field2770.method2221(-128, (float) var12);
            this.field2770.method2221(-128, (float) var11);
        } else {
            this.field2770.method2220(-73, (float) var10);
            this.field2770.method2220(-61, (float) var12);
            this.field2770.method2220(-88, (float) var11);
        }
        this.field2770.method2093(var45, -117);
        this.field2770.method2093(var46, -118);
        this.field2770.method2093(var47, -107);
        this.field2770.method2093(255, -103);
        this.method1295((byte) 88, var14);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BS)V")
    private final void method1295(byte arg0, short arg1) {
        if (arg0 != 88) {
            this.method1295((byte) 77, (short) -127);
        }
        field2791++;
        if (this.field2785.field7754) {
            this.field2776.method2115(arg1, arg0 + 3236);
        } else {
            this.field2776.method2097(-985, arg1);
        }
        this.field2774++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z[Let;I)V")
    public static final void method1296(boolean arg0, class509[] arg1, int arg2) {
        field2789++;
        if (arg0) {
            method1292(21, -69);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class509 var4 = arg1[var3];
            if (var4 != null && var4.field7054 == arg2 && !client.method1407(var4)) {
                if (var4.field7197 == 0) {
                    method1296(false, arg1, var4.field7045);
                    if (var4.field7101 != null) {
                        method1296(false, var4.field7101, var4.field7045);
                    }
                    class565 var5 = (class565) class309.field3937.method2645((long) var4.field7045, (byte) -126);
                    if (var5 != null) {
                        class104.method616(var5.field8297, -1);
                    }
                }
                if (var4.field7197 == 6 && var4.field7141 != -1) {
                    class502 var6 = class393.field5190.method770(var4.field7141, -61);
                    if (var6 != null) {
                        var4.field7084 += class590.field8557;
                        while (var6.field6952[var4.field7047] < var4.field7084) {
                            var4.field7084 -= var6.field6952[var4.field7047];
                            var4.field7047++;
                            if (var4.field7047 >= var6.field6944.length) {
                                var4.field7047 -= var6.field6966;
                                if (var4.field7047 < 0 || var4.field7047 >= var6.field6944.length) {
                                    var4.field7047 = 0;
                                }
                            }
                            var4.field7063 = var4.field7047 + 1;
                            if (var4.field7063 >= var6.field6944.length) {
                                var4.field7063 -= var6.field6966;
                                if (var4.field7063 < 0 || var6.field6944.length <= var4.field7063) {
                                    var4.field7063 = -1;
                                }
                            }
                            class87.method508(127, var4);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lmh;Lae;Lcba;[I)V")
    public class226(class537 arg0, class209 arg1, class469 arg2, int[] arg3) {
        this.field2794 = arg1;
        this.field2772 = arg2;
        this.field2785 = arg0;
        int var5 = this.field2772.method2735((byte) 124) - (arg1.field2115 >> 1);
        this.field2784 = this.field2772.method2731((byte) -96) - var5 >> arg1.field2111;
        this.field2777 = this.field2772.method2731((byte) -96) + var5 >> arg1.field2111;
        this.field2780 = this.field2772.method2737((byte) -86) - var5 >> arg1.field2111;
        this.field2781 = this.field2772.method2737((byte) -86) + var5 >> arg1.field2111;
        int var6 = this.field2777 + 1 - this.field2784;
        int var7 = this.field2781 + 1 - this.field2780;
        this.field2787 = new float[var6 + 1][var7 + 1];
        this.field2788 = new float[var6 + 1][var7 + 1];
        this.field2778 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = var8 + this.field2780;
            if (var24 > 0 && (this.field2794.field2114 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field2784 + var25;
                    if (var26 > 0 && var26 < (this.field2794.field2116 - 1)) {
                        int var27 = arg1.method855(var26 + 1, var24) - arg1.method855(var26 - 1, var24);
                        int var28 = arg1.method855(var26, var24 + 1) - arg1.method855(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field2778[var25][var8] = (float) var27 * var29;
                        this.field2788[var25][var8] = var29 * -256.0F;
                        this.field2787[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2780; var11 <= this.field2781; var11++) {
            if (var11 >= 0 && arg1.field2114 > var11) {
                for (int var21 = this.field2784; var21 <= this.field2777; var21++) {
                    if (var21 >= 0 && var21 < arg1.field2116) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field2526[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field2777 - this.field2784;
            }
        }
        if (var9 <= 0) {
            this.field2779 = null;
            this.field2793 = null;
            this.field2786 = null;
            this.field2782 = null;
        } else {
            this.field2776 = new class374(var9 * 2);
            this.field2770 = new class385(var9 * 16);
            this.field2775 = new class451(class129.method731(var9, -27265));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2780; var14 <= this.field2781; var14++) {
                if (var14 >= 0 && arg1.field2114 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field2784; var16 <= this.field2777; var16++) {
                        if (var16 >= 0 && arg1.field2116 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field2526[var16][var14];
                            int[] var19 = arg1.field2506[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1294(var14, var12, var19[var20], 127, var15, var16, var18[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1294(var14, var12, 0, 126, var15, var16, 0);
                                    this.method1294(var14, var12, 0, 127, var15, var16, arg1.field2115);
                                    this.method1294(var14, var12, arg1.field2115, 126, var15, var16, 0);
                                } else if (var17 == 2) {
                                    this.method1294(var14, var12, 0, 126, var15, var16, arg1.field2115);
                                    this.method1294(var14, var12, arg1.field2115, 127, var15, var16, arg1.field2115);
                                    this.method1294(var14, var12, 0, 126, var15, var16, 0);
                                } else if (var17 == 5) {
                                    this.method1294(var14, var12, arg1.field2115, 126, var15, var16, arg1.field2115);
                                    this.method1294(var14, var12, arg1.field2115, 126, var15, var16, 0);
                                    this.method1294(var14, var12, 0, 126, var15, var16, arg1.field2115);
                                } else if (var17 == 4) {
                                    this.method1294(var14, var12, arg1.field2115, 127, var15, var16, 0);
                                    this.method1294(var14, var12, 0, 127, var15, var16, 0);
                                    this.method1294(var14, var12, arg1.field2115, 127, var15, var16, arg1.field2115);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field2777 - this.field2784;
                }
                var12++;
            }
            this.field2782 = this.field2785.method3137(this.field2776.field4929, 5123, -82, false, this.field2776.field4966);
            this.field2793 = this.field2785.method3132(this.field2770.field4966, 16, 1365, this.field2770.field4929, false);
            this.field2779 = new class2(this.field2793, 5126, 3, 0);
            this.field2786 = new class2(this.field2793, 5121, 4, 12);
        }
        this.field2775 = null;
        this.field2770 = null;
        this.field2776 = null;
        this.field2778 = this.field2788 = this.field2787 = null;
    }
}
