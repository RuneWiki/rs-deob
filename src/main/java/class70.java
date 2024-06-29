import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class70 {

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Llk;")
    private class417 field995;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Lkd;")
    private class188 field985;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "[B")
    public byte[] field997;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    private int field989;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lgu;")
    public static class412 field993 = new class412(8);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "Lhp;")
    public static class217 field998;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "[[Lff;")
    private class9[][] field994;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[BI)I")
    public static final int method606(int arg0, byte[] arg1, int arg2) {
        if (arg0 == 0) {
            field988++;
            return class95.method765(0, arg2, 255, arg1);
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field998 = null;
        field993 = null;
        if (arg0 != -17) {
            method607((byte) -56);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public final void method608(byte arg0) {
        this.field994 = new class9[this.field984][this.field992];
        field986++;
        if (arg0 < 97) {
            this.field994 = null;
        }
        for (int var2 = 0; var2 < this.field992; var2++) {
            for (int var3 = 0; var3 < this.field984; var3++) {
                this.field994[var3][var2] = new class9(this.field985, this, this.field995, var3, var2, this.field989, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lba;III)V")
    public final void method609(class265 arg0, int arg1, int arg2, int arg3) {
        field982++;
        class339 var5 = (class339) arg0;
        int var6 = var5.field5049 + arg2 + 1;
        int var7 = var5.field5045 + arg3 + 1;
        int var8 = this.field990 * var7 + var6;
        int var9 = arg1;
        int var10 = var5.field5053;
        int var11 = var5.field5056;
        int var12 = this.field990 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var8 += this.field990 * var14;
            var9 = var11 * var14 + arg1;
        }
        if (this.field996 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field996;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var8 += var16;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (this.field990 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field990;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            client.method1386(var9, var5.field5050, var12, var10, var13, var8, var11, (byte) -1, this.field997);
            this.method612(-126, var10, var6, var11, var7);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILba;II)Z")
    public final boolean method610(int arg0, class265 arg1, int arg2, int arg3) {
        field991++;
        class339 var5 = (class339) arg1;
        int var6 = var5.field5049 + arg3 + 1;
        int var7 = var5.field5045 + arg2 + 1;
        int var8 = this.field990 * var7 + var6;
        int var9 = var5.field5053;
        int var10 = var5.field5056;
        int var11 = this.field990 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var7 = 1;
            var8 += this.field990 * var12;
        }
        int var13 = -93 / ((arg0 - 40) / 56);
        if (this.field996 <= var7 + var9) {
            int var14 = var7 + var9 - (this.field996 + -1);
            var9 -= var14;
        }
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var8 += var15;
            var11 += var15;
            var6 = 1;
            var10 -= var15;
        }
        if ((var6 + var10) >= this.field990) {
            int var16 = var6 + var10 + 1 - this.field990;
            var11 += var16;
            var10 -= var16;
        }
        if (var10 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field990 + var11;
            return class122.method911(var9, (byte) 87, var18, var17, this.field997, var10, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZZ[[ZIII)V")
    public final void method611(boolean arg0, boolean arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field983++;
        this.field985.method1272(false, -106);
        this.field985.method1294(false, 34165);
        this.field985.method1304(-26349, -2);
        this.field985.method1248(1, arg1);
        this.field985.method1291(1, !arg1);
        float var7 = 1.0F / (float) (this.field985.field3025 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field992; var8++) {
                int var9 = var8 << this.field989;
                int var10 = var8 + 1 << this.field989;
                label136: for (int var11 = 0; var11 < this.field984; var11++) {
                    int var12 = var11 << this.field989;
                    int var13 = var11 + 1 << this.field989;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg3) >= (-arg4) && arg4 >= var14 - arg3) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg4) <= (var15 - arg5) && (var15 - arg5) <= arg4 && arg2[var14 - (arg3 - arg4)][var15 + arg4 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field994[var11][var8].method65(0);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field992; var16++) {
                int var17 = var16 << this.field989;
                int var18 = var16 + 1 << this.field989;
                for (int var19 = 0; var19 < this.field984; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field989;
                    int var22 = var19 + 1 << this.field989;
                    class23 var23 = this.field985.field3055;
                    var23.field3556 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg5) >= (-arg4) && arg4 >= var24 - arg5) {
                            int var25 = this.field995.field2207 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg3) >= (-arg4) && (var26 - arg3) <= arg4 && arg2[var26 + arg4 - arg3][var24 + arg4 - arg5]) {
                                    short[] var27 = this.field995.field6228[var25];
                                    if (var27 != null) {
                                        if (this.field985.field3141) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1542(var27[var28] & 0xFFFF, -2756);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1504((byte) 104, var27[var29] & 0xFFFF);
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
                        this.field994[var19][var16].method66(var20, 5123, 0, var23.field3572);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lkd;Llk;)V")
    public class70(class188 arg0, class417 arg1) {
        this.field995 = arg1;
        this.field985 = arg0;
        this.field990 = (this.field995.field2210 * this.field995.field2207 >> this.field985.field3028) + 2;
        this.field996 = (this.field995.field2211 * this.field995.field2210 >> this.field985.field3028) + 2;
        this.field997 = new byte[this.field996 * this.field990];
        this.field989 = this.field985.field3028 + 7 - this.field995.field2206;
        this.field984 = this.field995.field2207 >> this.field989;
        this.field992 = this.field995.field2211 >> this.field989;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)V")
    private final void method612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field981++;
        if (this.field994 == null) {
            return;
        }
        if (arg0 > -22) {
            this.field996 = -93;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 - (1 - arg3) - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class9[] var11 = this.field994[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field126 = true;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILba;I)V")
    public final void method613(boolean arg0, int arg1, class265 arg2, int arg3) {
        field987++;
        class339 var5 = (class339) arg2;
        if (arg0) {
            this.field990 = 32;
        }
        int var6 = var5.field5045 + arg1 + 1;
        int var7 = var5.field5049 + arg3 + 1;
        int var8 = this.field990 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5053;
        int var11 = var5.field5056;
        int var12 = this.field990 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field990 * var14;
            var6 = 1;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if ((var6 + var10) >= this.field996) {
            int var15 = var6 + var10 + 1 - this.field996;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var9 += var16;
            var13 += var16;
            var7 = 1;
            var11 -= var16;
            var8 += var16;
        }
        if ((var7 + var11) >= this.field990) {
            int var17 = var11 + var7 + 1 - this.field990;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class336.method2120(var8, var9, var5.field5050, var11, (byte) -59, var10, var13, var12, this.field997);
            this.method612(-51, var10, var7, var11, var6);
        }
    }
}
