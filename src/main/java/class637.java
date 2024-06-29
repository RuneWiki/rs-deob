import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class637 {

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "Lqfa;")
    private class106 field8941;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "Lre;")
    private class626 field8948;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public int field8937;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    private int field8950;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "[B")
    public byte[] field8952;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    private int field8951;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    private int field8953;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public static int field8946 = 0;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "[[Lpv;")
    private class76[][] field8942;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 4)
    public final void method3642(int arg0) {
        field8949++;
        this.field8942 = new class76[this.field8951][this.field8953];
        for (int var2 = 0; var2 < this.field8953; var2++) {
            for (int var3 = 0; var3 < this.field8951; var3++) {
                this.field8942[var3][var2] = new class76(this.field8941, this, this.field8948, var3, var2, this.field8940, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0 != -1) {
            this.method3645(-124, null, -2, -60);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIII)V", line = 37)
    private final void method3643(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8947++;
        if (this.field8942 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg2 - arg3 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class76[] var11 = this.field8942[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field859 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZILr;)V", line = 74)
    public final void method3644(int arg0, boolean arg1, int arg2, class194 arg3) {
        field8939++;
        class45 var5 = (class45) arg3;
        int var6 = var5.field564 + arg2 + 1;
        int var7 = var5.field562 + arg0 + 1;
        int var8 = this.field8937 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field568;
        if (!arg1) {
            return;
        }
        int var11 = var5.field570;
        int var12 = this.field8937 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field8937 * var13;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field8950) {
            int var15 = var10 + var7 + 1 - this.field8950;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field8937) {
            int var17 = var11 + var6 + 1 - this.field8937;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class303.method1966(var12, var8, -95, this.field8952, var5.field563, var14, var9, var10, var11);
            this.method3643(var7, var6, var10, 1, var11);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILr;II)Z", line = 144)
    public final boolean method3645(int arg0, class194 arg1, int arg2, int arg3) {
        field8943++;
        if (arg0 != -7389) {
            this.field8953 = -37;
        }
        class45 var5 = (class45) arg1;
        int var6 = var5.field564 + arg3 + 1;
        int var7 = var5.field562 + arg2 + 1;
        int var8 = var6 + (this.field8937 * var7);
        int var9 = var5.field568;
        int var10 = var5.field570;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field8937 * var11;
        }
        int var12 = this.field8937 - var10;
        if (this.field8950 <= (var7 + var9)) {
            int var13 = var7 - (-var9 - 1) - this.field8950;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var12 += var14;
            var6 = 1;
            var8 += var14;
        }
        if (var6 + var10 >= this.field8937) {
            int var15 = var6 + var10 + (1 - this.field8937);
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8937 + var12;
            return class256.method1668(var10, var16, var17, var9, this.field8952, (byte) 28, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([[ZIIBZI)V", line = 216)
    public final void method3646(boolean[][] arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field8945++;
        this.field8941.method756(false, 107);
        this.field8941.method791(false, true);
        this.field8941.method747(-2, -2142656808);
        this.field8941.method795(1, 34023);
        this.field8941.method800(1, 28276);
        float var7 = 1.0F / (float) (this.field8941.field1441 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field8953; var8++) {
                int var9 = var8 << this.field8940;
                int var10 = var8 + 1 << this.field8940;
                label136: for (int var11 = 0; var11 < this.field8951; var11++) {
                    int var12 = var11 << this.field8940;
                    int var13 = var11 + 1 << this.field8940;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg5 <= var14 - arg2 && arg5 >= (var14 - arg2)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg1) >= (-arg5) && arg5 >= (var15 - arg1) && arg0[arg5 + var14 - arg2][var15 + arg5 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field8942[var11][var8].method595((byte) -41);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field8953; var16++) {
                int var17 = var16 << this.field8940;
                int var18 = var16 + 1 << this.field8940;
                for (int var19 = 0; var19 < this.field8951; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field8940;
                    int var22 = var19 + 1 << this.field8940;
                    class538 var23 = this.field8941.field1485;
                    var23.field7042 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg1 >= -arg5 && (var24 - arg1) <= arg5) {
                            int var25 = this.field8948.field4289 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg2 >= -arg5 && arg5 >= var26 - arg2 && arg0[arg5 + var26 - arg2][arg5 + var24 - arg1]) {
                                    short[] var27 = this.field8948.field8792[var25];
                                    if (var27 != null) {
                                        if (this.field8941.field1514) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2957(var27[var29] & 0xFFFF, 1267307848);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method2965(var27[var28] & 0xFFFF, (byte) 58);
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
                        this.field8942[var19][var16].method598(var20, -30020, 5123, var23.field7050);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg3 <= 13) {
            this.method3646(null, -12, -63, (byte) 117, true, 87);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lr;III)V", line = 403)
    public final void method3647(class194 arg0, int arg1, int arg2, int arg3) {
        field8938++;
        class45 var5 = (class45) arg0;
        int var6 = var5.field562 + arg3 + 1;
        int var7 = var5.field564 + arg1 + 1;
        int var8 = var7 + (this.field8937 * var6);
        if (arg2 != -1) {
            this.method3645(-84, null, 69, 3);
        }
        int var9 = 0;
        int var10 = var5.field568;
        int var11 = var5.field570;
        int var12 = this.field8937 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field8937 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field8950) {
            int var15 = var6 + var10 + 1 - this.field8950;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var7 = 1;
            var8 += var16;
            var13 += var16;
        }
        if (var7 + var11 >= this.field8937) {
            int var17 = var7 + var11 + 1 - this.field8937;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class369.method2301(var5.field563, var12, var9, var8, 0, this.field8952, var13, var11, var10);
            this.method3643(var6, var7, var10, 1, var11);
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lqfa;Lre;)V", line = 489)
    public class637(class106 arg0, class626 arg1) {
        this.field8941 = arg0;
        this.field8948 = arg1;
        this.field8937 = (this.field8948.field4289 * this.field8948.field4284 >> this.field8941.field1439) + 2;
        this.field8950 = (this.field8948.field4290 * this.field8948.field4284 >> this.field8941.field1439) + 2;
        this.field8952 = new byte[this.field8950 * this.field8937];
        this.field8940 = this.field8941.field1439 + 7 - this.field8948.field4285;
        this.field8951 = this.field8948.field4289 >> this.field8940;
        this.field8953 = this.field8948.field4290 >> this.field8940;
    }
}
