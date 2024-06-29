import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class138 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "[I")
    private int[] field2181 = new int[5];

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public int field2186 = 0;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
    private int[] field2183 = new int[5];

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    private int field2192 = 100;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    private int[] field2185 = new int[5];

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public int field2191 = 500;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    private int field2196 = 0;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[I")
    private static int[] field2197 = new int[32768];

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
    private static int[] field2187;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
    private static int[] field2195;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[I")
    private static int[] field2198;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    private static int[] field2200;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
    private static int[] field2202;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "[I")
    private static int[] field2201;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "[I")
    private static int[] field2199;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lra;")
    private class122 field2179;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lra;")
    private class122 field2180;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lra;")
    private class122 field2182;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lra;")
    private class122 field2184;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lra;")
    private class122 field2188;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "Lra;")
    private class122 field2190;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Lra;")
    private class122 field2193;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Lra;")
    private class122 field2194;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lra;")
    private class122 field2203;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lsh;")
    private class300 field2189;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I")
    public final int[] method965(int arg0, int arg1) {
        class157.method1067(field2195, 0, arg0);
        if (arg1 < 10) {
            return field2195;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field2188.method861();
        this.field2193.method861();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field2179 != null) {
            this.field2179.method861();
            this.field2182.method861();
            var5 = (int) ((double) (this.field2179.field1942 - this.field2179.field1941) * 32.768D / var3);
            var6 = (int) ((double) this.field2179.field1941 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field2190 != null) {
            this.field2190.method861();
            this.field2184.method861();
            var8 = (int) ((double) (this.field2190.field1942 - this.field2190.field1941) * 32.768D / var3);
            var9 = (int) ((double) this.field2190.field1941 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2185[var11] != 0) {
                field2198[var11] = 0;
                field2202[var11] = (int) ((double) this.field2181[var11] * var3);
                field2200[var11] = (this.field2185[var11] << 14) / 100;
                field2199[var11] = (int) ((double) (this.field2188.field1942 - this.field2188.field1941) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field2183[var11]) / var3);
                field2201[var11] = (int) ((double) this.field2188.field1941 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field2188.method862(arg0);
            int var40 = this.field2193.method862(arg0);
            if (this.field2179 != null) {
                int var41 = this.field2179.method862(arg0);
                int var42 = this.field2182.method862(arg0);
                var39 += this.method968(var7, var42, this.field2179.field1939) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field2190 != null) {
                int var43 = this.field2190.method862(arg0);
                int var44 = this.field2184.method862(arg0);
                var40 = var40 * ((this.method968(var10, var44, this.field2190.field1939) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2185[var45] != 0) {
                    int var46 = field2202[var45] + var12;
                    if (var46 < arg0) {
                        field2195[var46] += this.method968(field2198[var45], field2200[var45] * var40 >> 15, this.field2188.field1939);
                        field2198[var45] += (field2199[var45] * var39 >> 16) + field2201[var45];
                    }
                }
            }
        }
        if (this.field2180 != null) {
            this.field2180.method861();
            this.field2194.method861();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field2180.method862(arg0);
                int var18 = this.field2194.method862(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field2180.field1942 - this.field2180.field1941) * var17 >> 8) + this.field2180.field1941;
                } else {
                    var19 = ((this.field2180.field1942 - this.field2180.field1941) * var18 >> 8) + this.field2180.field1941;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field2195[var16] = 0;
                }
            }
        }
        if (this.field2196 > 0 && this.field2192 > 0) {
            int var20 = (int) ((double) this.field2196 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field2195[var21] += field2195[var21 - var20] * this.field2192 / 100;
            }
        }
        if (this.field2189.field4810[0] > 0 || this.field2189.field4810[1] > 0) {
            this.field2203.method861();
            int var22 = this.field2203.method862(arg0 + 1);
            int var23 = this.field2189.method1987(0, (float) var22 / 65536.0F);
            int var24 = this.field2189.method1987(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field2195[var23 + var25] * (long) class300.field4808 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field2195[var23 + var25 - var36 - 1] * (long) class300.field4806[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field2195[var25 - var37 - 1] * (long) class300.field4806[1][var37] >> 16);
                    }
                    field2195[var25] = var35;
                    var22 = this.field2203.method862(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field2195[var23 + var25] * (long) class300.field4808 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field2195[var23 + var25 - var33 - 1] * (long) class300.field4806[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field2195[var25 - var34 - 1] * (long) class300.field4806[1][var34] >> 16);
                        }
                        field2195[var25] = var32;
                        var22 = this.field2203.method862(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field2195[var23 + var25 - var29 - 1] * (long) class300.field4806[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field2195[var25 - var30 - 1] * (long) class300.field4806[1][var30] >> 16);
                            }
                            field2195[var25] = var28;
                            this.field2203.method862(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field2189.method1987(0, (float) var22 / 65536.0F);
                    var24 = this.field2189.method1987(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field2195[var38] < -32768) {
                field2195[var38] = -32768;
            }
            if (field2195[var38] > 32767) {
                field2195[var38] = 32767;
            }
        }
        return field2195;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
    public static void method966() {
        field2195 = null;
        field2197 = null;
        field2187 = null;
        field2198 = null;
        field2202 = null;
        field2200 = null;
        field2199 = null;
        field2201 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lwd;)V")
    public final void method967(class162 arg0) {
        this.field2188 = new class122();
        this.field2188.method860(arg0);
        this.field2193 = new class122();
        this.field2193.method860(arg0);
        int var2 = arg0.method1133((byte) 53);
        if (var2 != 0) {
            arg0.field2568--;
            this.field2179 = new class122();
            this.field2179.method860(arg0);
            this.field2182 = new class122();
            this.field2182.method860(arg0);
        }
        int var3 = arg0.method1133((byte) 53);
        if (var3 != 0) {
            arg0.field2568--;
            this.field2190 = new class122();
            this.field2190.method860(arg0);
            this.field2184 = new class122();
            this.field2184.method860(arg0);
        }
        int var4 = arg0.method1133((byte) 53);
        if (var4 != 0) {
            arg0.field2568--;
            this.field2180 = new class122();
            this.field2180.method860(arg0);
            this.field2194 = new class122();
            this.field2194.method860(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method1114((byte) -13);
            if (var6 == 0) {
                break;
            }
            this.field2185[var5] = var6;
            this.field2183[var5] = arg0.method1162(false);
            this.field2181[var5] = arg0.method1114((byte) -13);
        }
        this.field2196 = arg0.method1114((byte) -13);
        this.field2192 = arg0.method1114((byte) -13);
        this.field2191 = arg0.method1142(-18970);
        this.field2186 = arg0.method1142(-18970);
        this.field2189 = new class300();
        this.field2203 = new class122();
        this.field2189.method1982(arg0, this.field2203);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
    private final int method968(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field2187[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field2197[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field2197[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field2187 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field2187[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field2195 = new int[220500];
        field2198 = new int[5];
        field2200 = new int[5];
        field2202 = new int[5];
        field2201 = new int[5];
        field2199 = new int[5];
    }
}
