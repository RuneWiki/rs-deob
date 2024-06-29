import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class134 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Len;")
    private class289 field1889;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lot;")
    private class540 field1888;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    private int field1892;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[B")
    public byte[] field1893;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    private int field1901;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field1890;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Luc;")
    public static class27 field1895 = new class27(68, 11);

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "[[I")
    public static int[][] field1900 = new int[128][128];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Z")
    public static boolean field1897;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[[Lii;")
    private class508[][] field1896;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILw;II)Z")
    public final boolean method955(int arg0, class271 arg1, int arg2, int arg3) {
        field1903++;
        class341 var5 = (class341) arg1;
        int var6 = var5.field4955 + arg0 + 1;
        int var7 = var5.field4948 + arg3 + 1;
        if (arg2 != 7) {
            return true;
        }
        int var8 = this.field1882 * var7 + var6;
        int var9 = var5.field4949;
        int var10 = var5.field4957;
        int var11 = this.field1882 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var8 += this.field1882 * var12;
            var9 -= var12;
        }
        if (this.field1892 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field1892;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
            var11 += var14;
        }
        if (this.field1882 <= (var6 + var10)) {
            int var15 = var6 + var10 + (1 - this.field1882);
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1882 + var11;
            return class73.method587(var16, this.field1893, var10, var17, 116, var8, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lql;IB)Z")
    public static final boolean method956(class674 arg0, int arg1, byte arg2) {
        field1894++;
        int var3 = arg0.method3726(2, 8);
        if (var3 == 0) {
            if (arg0.method3726(1, 8) != 0) {
                method956(arg0, arg1, (byte) -76);
            }
            int var4 = arg0.method3726(6, 8);
            int var5 = arg0.method3726(6, 8);
            boolean var6 = arg0.method3726(1, arg2 + 84) == 1;
            if (var6) {
                class93.field1229[class1.field11++] = arg1;
            }
            if (class495.field6821[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class460 var7 = class471.field6572[arg1];
            class286 var8 = class495.field6821[arg1] = new class286();
            var8.field6388 = arg1;
            if (class474.field6627[arg1] != null) {
                var8.method1727((byte) 90, class474.field6627[arg1]);
            }
            var8.method2644(-101, var7.field6511, true);
            var8.field6391 = var7.field6503;
            int var9 = var7.field6506;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            var8.field3983 = var7.field6509;
            var8.field6482[0] = class491.field6782[arg1];
            var8.field520 = (byte) var10;
            var8.method1718((var11 << 6) + var4 - class511.field6989, (var12 << 6) + var5 + -class124.field1726, (byte) -122);
            var8.field3961 = false;
            class471.field6572[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method3726(2, arg2 + 84);
            int var14 = class471.field6572[arg1].field6506;
            class471.field6572[arg1].field6506 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method3726(5, 8);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class471.field6572[arg1].field6506;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class471.field6572[arg1].field6506 = (var19 << 28) + (var20 << 14) + var21;
            return false;
        } else {
            int var22 = arg0.method3726(18, 8);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFFF3) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class471.field6572[arg1].field6506;
            if (arg2 != -76) {
                method956(null, -21, (byte) -61);
            }
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class471.field6572[arg1].field6506 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    private final void method957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1883++;
        if (this.field1896 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = -41 / ((-arg1 - 67) / 49);
        int var10 = arg4 + arg3 - 1 - 1 >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class508[] var12 = this.field1896[var11];
            for (int var13 = var8; var13 <= var10; var13++) {
                var12[var13].field6965 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method958(int arg0) {
        field1898++;
        this.field1896 = new class508[this.field1901][this.field1890];
        for (int var2 = arg0; var2 < this.field1890; var2++) {
            for (int var3 = 0; var3 < this.field1901; var3++) {
                this.field1896[var3][var2] = new class508(this.field1889, this, this.field1888, var3, var2, this.field1886, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIIIII)I")
    public static final int method959(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg0;
            arg0 = var8;
        }
        if (arg1) {
            field1895 = null;
        }
        field1887++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg2 - arg6;
        } else if (var7 == 2) {
            return 7 - arg4 - (arg0 - 1);
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lw;IBI)V")
    public final void method960(class271 arg0, int arg1, byte arg2, int arg3) {
        field1884++;
        class341 var5 = (class341) arg0;
        int var6 = var5.field4955 + arg1 + 1;
        int var7 = var5.field4948 + arg3 + 1;
        int var8 = this.field1882 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4949;
        int var11 = -47 % ((arg2 + 61) / 38);
        int var12 = var5.field4957;
        int var13 = this.field1882 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var8 += this.field1882 * var15;
            var10 -= var15;
            var9 += var12 * var15;
            var7 = 1;
        }
        if (this.field1892 <= (var7 + var10)) {
            int var16 = var7 + var10 + 1 - this.field1892;
            var10 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var14 += var17;
            var12 -= var17;
            var8 += var17;
            var6 = 1;
            var13 += var17;
            var9 += var17;
        }
        if (var6 + var12 >= this.field1882) {
            int var18 = var6 + var12 + 1 - this.field1882;
            var13 += var18;
            var12 -= var18;
            var14 += var18;
        }
        if (var12 > 0 && var10 > 0) {
            class689.method3792(-74, var8, this.field1893, var9, var10, var14, var13, var12, var5.field4954);
            this.method957(var6, -116, var12, var10, var7);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method961(byte arg0) {
        field1895 = null;
        field1900 = null;
        if (arg0 >= -33) {
            method961((byte) -118);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIJI)V")
    public static final void method962(int arg0, int arg1, long arg2, int arg3) {
        field1885++;
        if (arg3 != 10392) {
            method959(-120, true, 87, -47, 77, 7, -70);
        }
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x35442A) >> 20;
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class524.method2903(0, 0, true, var5, arg0, arg3 ^ 0x2898, var6, 0, arg1);
            return;
        }
        class620 var8 = class164.field2499.method2013(var7, false);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field8566;
            var9 = var8.field8582;
        } else {
            var9 = var8.field8566;
            var10 = var8.field8582;
        }
        int var11 = var8.field8650;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class524.method2903(var9, var10, true, 0, arg0, arg3 - 10392, 0, var11, arg1);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[[ZIIIZ)V")
    public final void method963(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1899++;
        this.field1889.method1777(false, -113);
        this.field1889.method1805(false, (byte) 58);
        this.field1889.method1789((byte) -51, -2);
        this.field1889.method1801(1, 34166);
        if (arg3 != 0) {
            this.field1893 = null;
        }
        this.field1889.method1768(1, -22);
        float var7 = 1.0F / (float) (this.field1889.field4223 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field1890; var8++) {
                int var9 = var8 << this.field1886;
                int var10 = var8 + 1 << this.field1886;
                label135: for (int var11 = 0; var11 < this.field1901; var11++) {
                    int var12 = var11 << this.field1886;
                    int var13 = var11 + 1 << this.field1886;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg4) <= (var14 - arg0) && var14 - arg0 <= arg4) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg4 <= var15 - arg2 && arg4 >= (var15 - arg2) && arg1[var14 + arg4 - arg0][var15 + arg4 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1896[var11][var8].method2825((byte) -126);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field1890; var16++) {
                int var17 = var16 << this.field1886;
                int var18 = var16 + 1 << this.field1886;
                for (int var19 = 0; var19 < this.field1901; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field1886;
                    int var22 = var19 + 1 << this.field1886;
                    class57 var23 = this.field1889.field4289;
                    var23.field1301 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg2) >= (-arg4) && var24 - arg2 <= arg4) {
                            int var25 = this.field1888.field1918 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg0 >= -arg4 && arg4 >= (var26 - arg0) && arg1[arg4 + var26 - arg0][var24 + arg4 - arg2]) {
                                    short[] var27 = this.field1888.field7347[var25];
                                    if (var27 != null) {
                                        if (this.field1889.field4362) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method731(-2045573048, var27[var28] & 0xFFFF);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method720(4, var27[var29] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1896[var19][var16].method2826(var23.field1316, false, 5123, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lw;III)V")
    public final void method964(class271 arg0, int arg1, int arg2, int arg3) {
        field1891++;
        class341 var5 = (class341) arg0;
        int var6 = var5.field4948 + arg3 + 1;
        int var7 = var5.field4955 + arg1 + 1;
        int var8 = this.field1882 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4949;
        int var11 = var5.field4957;
        int var12 = this.field1882 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field1882 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field1892) {
            int var15 = var6 + var10 + 1 - this.field1892;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var12 += var16;
            var9 += var16;
            var11 -= var16;
            var7 = 1;
            var8 += var16;
        }
        if (this.field1882 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field1882;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > arg2 && var10 > 0) {
            class535.method2957(var8, var9, 11297, var12, var11, var10, this.field1893, var5.field4954, var14);
            this.method957(var7, 88, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Len;Lot;)V")
    public class134(class289 arg0, class540 arg1) {
        this.field1889 = arg0;
        this.field1888 = arg1;
        this.field1882 = (this.field1888.field1919 * this.field1888.field1918 >> this.field1889.field4219) + 2;
        this.field1892 = (this.field1888.field1919 * this.field1888.field1916 >> this.field1889.field4219) + 2;
        this.field1886 = this.field1889.field4219 + 7 - this.field1888.field1921;
        this.field1893 = new byte[this.field1892 * this.field1882];
        this.field1901 = this.field1888.field1918 >> this.field1886;
        this.field1890 = this.field1888.field1916 >> this.field1886;
    }
}
