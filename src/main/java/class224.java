import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class224 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public int field3077 = 0;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field3083 = 500;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    private int[] field3078 = new int[5];

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
    private int[] field3091 = new int[5];

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    private int field3085 = 0;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field3086 = 100;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
    private int[] field3098 = new int[5];

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[I")
    private static int[] field3092 = new int[32768];

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
    private static int[] field3087;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[I")
    private static int[] field3093;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
    private static int[] field3099;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
    private static int[] field3097;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    private static int[] field3096;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    private static int[] field3100;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
    private static int[] field3101;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lfs;")
    private class12 field3079;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lfs;")
    private class12 field3080;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lfs;")
    private class12 field3081;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lfs;")
    private class12 field3082;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lfs;")
    private class12 field3084;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lfs;")
    private class12 field3088;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lfs;")
    private class12 field3089;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lfs;")
    private class12 field3094;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lfs;")
    private class12 field3095;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Luo;")
    private class313 field3090;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lfb;)V")
    public final void method1460(class341 arg0) {
        this.field3095 = new class12();
        this.field3095.method94(arg0);
        this.field3079 = new class12();
        this.field3079.method94(arg0);
        int var2 = arg0.method2233((byte) 104);
        if (var2 != 0) {
            arg0.field5049--;
            this.field3080 = new class12();
            this.field3080.method94(arg0);
            this.field3088 = new class12();
            this.field3088.method94(arg0);
        }
        int var3 = arg0.method2233((byte) 104);
        if (var3 != 0) {
            arg0.field5049--;
            this.field3094 = new class12();
            this.field3094.method94(arg0);
            this.field3082 = new class12();
            this.field3082.method94(arg0);
        }
        int var4 = arg0.method2233((byte) 104);
        if (var4 != 0) {
            arg0.field5049--;
            this.field3081 = new class12();
            this.field3081.method94(arg0);
            this.field3089 = new class12();
            this.field3089.method94(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method2223(-1);
            if (var6 == 0) {
                break;
            }
            this.field3078[var5] = var6;
            this.field3091[var5] = arg0.method2247((byte) 71);
            this.field3098[var5] = arg0.method2223(-1);
        }
        this.field3085 = arg0.method2223(-1);
        this.field3086 = arg0.method2223(-1);
        this.field3083 = arg0.method2239(-1076227960);
        this.field3077 = arg0.method2239(-1076227960);
        this.field3090 = new class313();
        this.field3084 = new class12();
        this.field3090.method2061(arg0, this.field3084);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    public final int[] method1461(int arg0, int arg1) {
        class206.method1355(field3093, 0, arg0);
        if (arg1 < 10) {
            return field3093;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3095.method95();
        this.field3079.method95();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field3080 != null) {
            this.field3080.method95();
            this.field3088.method95();
            var5 = (int) ((double) (this.field3080.field195 - this.field3080.field198) * 32.768D / var3);
            var6 = (int) ((double) this.field3080.field198 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field3094 != null) {
            this.field3094.method95();
            this.field3082.method95();
            var8 = (int) ((double) (this.field3094.field195 - this.field3094.field198) * 32.768D / var3);
            var9 = (int) ((double) this.field3094.field198 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3078[var11] != 0) {
                field3096[var11] = 0;
                field3097[var11] = (int) ((double) this.field3098[var11] * var3);
                field3101[var11] = (this.field3078[var11] << 14) / 100;
                field3100[var11] = (int) ((double) (this.field3095.field195 - this.field3095.field198) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3091[var11]) / var3);
                field3099[var11] = (int) ((double) this.field3095.field198 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field3095.method93(arg0);
            int var40 = this.field3079.method93(arg0);
            if (this.field3080 != null) {
                int var41 = this.field3080.method93(arg0);
                int var42 = this.field3088.method93(arg0);
                var39 += this.method1462(var7, var42, this.field3080.field196) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field3094 != null) {
                int var43 = this.field3094.method93(arg0);
                int var44 = this.field3082.method93(arg0);
                var40 = var40 * ((this.method1462(var10, var44, this.field3094.field196) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field3078[var45] != 0) {
                    int var46 = field3097[var45] + var12;
                    if (var46 < arg0) {
                        field3093[var46] += this.method1462(field3096[var45], field3101[var45] * var40 >> 15, this.field3095.field196);
                        field3096[var45] += (field3100[var45] * var39 >> 16) + field3099[var45];
                    }
                }
            }
        }
        if (this.field3081 != null) {
            this.field3081.method95();
            this.field3089.method95();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field3081.method93(arg0);
                int var18 = this.field3089.method93(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field3081.field195 - this.field3081.field198) * var17 >> 8) + this.field3081.field198;
                } else {
                    var19 = ((this.field3081.field195 - this.field3081.field198) * var18 >> 8) + this.field3081.field198;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field3093[var16] = 0;
                }
            }
        }
        if (this.field3085 > 0 && this.field3086 > 0) {
            int var20 = (int) ((double) this.field3085 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field3093[var21] += field3093[var21 - var20] * this.field3086 / 100;
            }
        }
        if (this.field3090.field4609[0] > 0 || this.field3090.field4609[1] > 0) {
            this.field3084.method95();
            int var22 = this.field3084.method93(arg0 + 1);
            int var23 = this.field3090.method2062(0, (float) var22 / 65536.0F);
            int var24 = this.field3090.method2062(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field3093[var23 + var25] * (long) class313.field4608 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field3093[var23 + var25 - var36 - 1] * (long) class313.field4610[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field3093[var25 - var37 - 1] * (long) class313.field4610[1][var37] >> 16);
                    }
                    field3093[var25] = var35;
                    var22 = this.field3084.method93(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field3093[var23 + var25] * (long) class313.field4608 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field3093[var23 + var25 - var33 - 1] * (long) class313.field4610[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field3093[var25 - var34 - 1] * (long) class313.field4610[1][var34] >> 16);
                        }
                        field3093[var25] = var32;
                        var22 = this.field3084.method93(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field3093[var23 + var25 - var29 - 1] * (long) class313.field4610[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field3093[var25 - var30 - 1] * (long) class313.field4610[1][var30] >> 16);
                            }
                            field3093[var25] = var28;
                            this.field3084.method93(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field3090.method2062(0, (float) var22 / 65536.0F);
                    var24 = this.field3090.method2062(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field3093[var38] < -32768) {
                field3093[var38] = -32768;
            }
            if (field3093[var38] > 32767) {
                field3093[var38] = 32767;
            }
        }
        return field3093;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    private final int method1462(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3087[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3092[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public static void method1463() {
        field3093 = null;
        field3092 = null;
        field3087 = null;
        field3096 = null;
        field3097 = null;
        field3101 = null;
        field3100 = null;
        field3099 = null;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3092[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3087 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3087[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3093 = new int[220500];
        field3099 = new int[5];
        field3097 = new int[5];
        field3096 = new int[5];
        field3100 = new int[5];
        field3101 = new int[5];
    }
}
