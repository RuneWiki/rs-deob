import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class206 {

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "Ljj;")
    private class66 field2923;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Lvh;")
    private class247 field2900;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "[B")
    public byte[] field2896;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    private int field2908;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Lpp;")
    public static class464 field2898 = new class464(82, 4);

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Liu;")
    public static class517 field2904 = new class517(14, 16);

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field2918 = 50;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "[I")
    public static int[] field2914 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "[I")
    public static int[] field2920 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "[I")
    public static int[] field2912 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "A", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!mr", name = "y", descriptor = "[I")
    public static int[] field2919 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "B", descriptor = "[I")
    public static int[] field2922 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2911 = new String[field2918];

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "[I")
    public static int[] field2910 = new int[field2918];

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Lgp;")
    public static class561 field2901;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "[I")
    public static int[] field2924;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "[Lbo;")
    public static class225[] field2916;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[[Lka;")
    private class571[][] field2897;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 3)
    public final void method1321(byte arg0) {
        field2913++;
        this.field2897 = new class571[this.field2908][this.field2899];
        int var2 = 0;
        if (arg0 != -18) {
            field2922 = null;
        }
        while (var2 < this.field2899) {
            for (int var3 = 0; var3 < this.field2908; var3++) {
                this.field2897[var3][var2] = new class571(this.field2923, this, this.field2900, var3, var2, this.field2902, var3 * 128 + 1, var2 * 128 - -1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V", line = 33)
    public static void method1322(byte arg0) {
        field2901 = null;
        field2910 = null;
        field2898 = null;
        field2922 = null;
        field2924 = null;
        field2920 = null;
        field2912 = null;
        field2911 = null;
        if (arg0 > 118) {
            field2919 = null;
            field2916 = null;
            field2914 = null;
            field2904 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIII)V", line = 54)
    private final void method1323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2917++;
        if (this.field2897 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg3 - 2 >> 7;
        if (arg2 != -8645) {
            this.method1326(-18, null, -56, 3);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class571[] var11 = this.field2897[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8138 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI[[ZIII)V", line = 94)
    public final void method1324(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field2905++;
        this.field2923.method578(110, false);
        this.field2923.method616(false, 0);
        this.field2923.method514(-2, true);
        this.field2923.method634(29, 1);
        this.field2923.method598(1, (byte) -95);
        float var7 = 1.0F / (float) (this.field2923.field1137 * 128);
        if (arg1 < 64) {
            return;
        }
        if (arg0) {
            for (int var8 = 0; var8 < this.field2899; var8++) {
                int var9 = var8 << this.field2902;
                int var10 = var8 + 1 << this.field2902;
                label135: for (int var11 = 0; var11 < this.field2908; var11++) {
                    int var12 = var11 << this.field2902;
                    int var13 = var11 + 1 << this.field2902;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg3 >= -arg5 && (var14 - arg3) <= arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg5 <= var15 - arg4 && arg5 >= (var15 - arg4) && arg2[var14 + arg5 - arg3][var15 + arg5 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2897[var11][var8].method3265(2);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2899; var16++) {
                int var17 = var16 << this.field2902;
                int var18 = var16 + 1 << this.field2902;
                for (int var19 = 0; var19 < this.field2908; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2902;
                    int var22 = var19 + 1 << this.field2902;
                    class583 var23 = this.field2923.field1220;
                    var23.field3913 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg5 <= var24 - arg4 && arg5 >= var24 - arg4) {
                            int var25 = this.field2900.field7541 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg3) >= (-arg5) && arg5 >= (var26 - arg3) && arg2[var26 + arg5 - arg3][var24 + arg5 - arg4]) {
                                    short[] var27 = this.field2900.field3559[var25];
                                    if (var27 != null) {
                                        if (this.field2923.field1187) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method1699(true, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1713((byte) 118, var27[var29] & 0xFFFF);
                                                var20++;
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
                        this.field2897[var19][var16].method3266(var20, var23.field3952, true, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lk;BII)V", line = 286)
    public final void method1325(class88 arg0, byte arg1, int arg2, int arg3) {
        field2903++;
        class141 var5 = (class141) arg0;
        int var6 = var5.field2203 + arg2 + 1;
        int var7 = var5.field2205 + arg3 + 1;
        int var8 = this.field2915 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2201;
        int var11 = var5.field2202;
        int var12 = this.field2915 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field2915 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if (var6 + var10 >= this.field2906) {
            int var15 = var10 + var6 + 1 - this.field2906;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var13 += var16;
            var7 = 1;
        }
        if (arg1 != 30) {
            return;
        }
        if (this.field2915 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field2915;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class114.method939(var9, var12, var13, var5.field2200, var11, 3, var10, var8, this.field2896);
            this.method1323(var6, var7, -8645, var10, var11);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILk;II)Z", line = 361)
    public final boolean method1326(int arg0, class88 arg1, int arg2, int arg3) {
        field2909++;
        class141 var5 = (class141) arg1;
        int var6 = var5.field2203 + arg2 + 1;
        int var7 = var5.field2205 + arg0 + 1;
        int var8 = this.field2915 * var6 + var7;
        int var9 = var5.field2201;
        int var10 = var5.field2202;
        if (arg3 <= ~var6) {
            int var11 = 1 - var6;
            var8 += this.field2915 * var11;
            var9 -= var11;
            var6 = 1;
        }
        int var12 = this.field2915 - var10;
        if (this.field2906 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field2906;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
            var12 += var14;
        }
        if ((var7 + var10) >= this.field2915) {
            int var15 = var7 + var10 + 1 - this.field2915;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2915 + var12;
            return class648.method3728(var9, var17, var16, this.field2896, var8, 124, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V", line = 442)
    public static final void method1327(byte arg0) {
        field2895++;
        if (arg0 != 2) {
            return;
        }
        class382.method2327(false, (byte) 99);
        if (class545.field7582 >= 0 && class545.field7582 != 0) {
            class471.method2738(127, class545.field7582);
            class545.field7582 = -1;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIBLk;)V", line = 466)
    public final void method1328(int arg0, int arg1, byte arg2, class88 arg3) {
        field2907++;
        class141 var5 = (class141) arg3;
        int var6 = var5.field2203 + arg0 + 1;
        int var7 = var5.field2205 + arg1 + 1;
        int var8 = this.field2915 * var6 + var7;
        if (arg2 > -78) {
            this.method1323(32, -81, -26, 113, -42);
        }
        int var9 = 0;
        int var10 = var5.field2201;
        int var11 = var5.field2202;
        int var12 = this.field2915 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field2915 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field2906) {
            int var15 = var6 + var10 + 1 - this.field2906;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
            var14 += var16;
            var7 = 1;
            var9 += var16;
        }
        if (this.field2915 <= var7 + var11) {
            int var17 = var7 - this.field2915 - (-var11 + -1);
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class68.method670(var14, var9, var11, var5.field2200, -83, var10, var8, var12, this.field2896);
            this.method1323(var6, var7, -8645, var10, var11);
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljj;Lvh;)V", line = 556)
    public class206(class66 arg0, class247 arg1) {
        this.field2923 = arg0;
        this.field2900 = arg1;
        this.field2915 = (this.field2900.field7544 * this.field2900.field7541 >> this.field2923.field1134) + 2;
        this.field2906 = (this.field2900.field7544 * this.field2900.field7539 >> this.field2923.field1134) + 2;
        this.field2896 = new byte[this.field2915 * this.field2906];
        this.field2902 = this.field2923.field1134 + 7 - this.field2900.field7537;
        this.field2908 = this.field2900.field7541 >> this.field2902;
        this.field2899 = this.field2900.field7539 >> this.field2902;
    }
}
