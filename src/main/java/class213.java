import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class213 {

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Le;")
    private class376 field3013;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lnq;")
    private class325 field3009;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "[B")
    public byte[] field3021;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Lof;")
    public static class446 field3015 = new class446("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!en", name = "q", descriptor = "[I")
    public static int[] field3023 = new int[25];

    @OriginalMember(owner = "client!en", name = "t", descriptor = "F")
    public static float field3026;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "Z")
    public static boolean field3022;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
    public static int[] field3024;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "[[Lfs;")
    private class395[][] field3020;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILia;)V")
    public final void method1464(int arg0, int arg1, int arg2, class423 arg3) {
        field3019++;
        class184 var5 = (class184) arg3;
        int var6 = var5.field2498 + arg2 + 1;
        int var7 = var5.field2499 + arg0 + arg1;
        int var8 = this.field3011 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2493;
        int var11 = var5.field2490;
        int var12 = this.field3011 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field3011 * var14;
            var6 = 1;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field3007) {
            int var15 = var6 + var10 + 1 - this.field3007;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var12 += var16;
            var8 += var16;
        }
        if (this.field3011 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field3011;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class201.method1362(var11, 0, var9, var10, this.field3021, var5.field2491, var8, var12, var13);
            this.method1470(var11, var10, var6, var7, 7);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ[[ZIB)V")
    public final void method1465(int arg0, int arg1, boolean arg2, boolean[][] arg3, int arg4, byte arg5) {
        field3016++;
        this.field3009.method2018(false, (byte) 99);
        this.field3009.method2083((byte) -60, false);
        this.field3009.method2015(-2, (byte) -121);
        this.field3009.method2045(34023, 1);
        this.field3009.method2087(1, 16711935);
        if (arg5 > -94) {
            this.field3009 = null;
        }
        float var7 = 1.0F / (float) (this.field3009.field4897 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field3012; var8++) {
                int var9 = var8 << this.field3025;
                int var10 = var8 + 1 << this.field3025;
                label135: for (int var11 = 0; var11 < this.field3017; var11++) {
                    int var12 = var11 << this.field3025;
                    int var13 = var11 + 1 << this.field3025;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg0 <= var14 - arg4 && var14 - arg4 <= arg0) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg0 <= var15 - arg1 && arg0 >= (var15 - arg1) && arg3[var14 + arg0 - arg4][arg0 + var15 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field3020[var11][var8].method2460(93);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field3012; var16++) {
                int var17 = var16 << this.field3025;
                int var18 = var16 + 1 << this.field3025;
                for (int var19 = 0; var19 < this.field3017; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field3025;
                    int var22 = var19 + 1 << this.field3025;
                    class283 var23 = this.field3009.field4943;
                    var23.field2185 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg1) >= (-arg0) && arg0 >= var24 - arg1) {
                            int var25 = this.field3013.field340 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg4) >= (-arg0) && var26 - arg4 <= arg0 && arg3[arg0 + var26 - arg4][arg0 + var24 - arg1]) {
                                    short[] var27 = this.field3013.field5734[var25];
                                    if (var27 != null) {
                                        if (this.field3009.field4974) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1114(var27[var28] & 0xFFFF, 99);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1111(var27[var29] & 0xFFFF, 21251);
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
                        this.field3020[var19][var16].method2455(var20, 2, var23.field2219, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public final void method1466(int arg0) {
        this.field3020 = new class395[this.field3017][this.field3012];
        field3018++;
        if (arg0 <= 7) {
            this.field3013 = null;
        }
        for (int var2 = 0; var2 < this.field3012; var2++) {
            for (int var3 = 0; var3 < this.field3017; var3++) {
                this.field3020[var3][var2] = new class395(this.field3009, this, this.field3013, var3, var2, this.field3025, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public static void method1467(boolean arg0) {
        field3015 = null;
        field3024 = null;
        if (arg0) {
            method1467(false);
        }
        field3023 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBILia;)Z")
    public final boolean method1468(int arg0, byte arg1, int arg2, class423 arg3) {
        field3008++;
        class184 var5 = (class184) arg3;
        int var6 = var5.field2499 + arg0 + 1;
        int var7 = var5.field2498 + arg2 + 1;
        int var8 = this.field3011 * var7 + var6;
        int var9 = var5.field2493;
        int var10 = var5.field2490;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var9 -= var11;
            var8 += this.field3011 * var11;
        }
        int var12 = this.field3011 - var10;
        if (var7 + var9 >= this.field3007) {
            int var13 = var9 + var7 + 1 - this.field3007;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var12 += var14;
            var6 = 1;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field3011) {
            int var15 = var6 + var10 + 1 - this.field3011;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        if (arg1 > -28) {
            this.method1466(-127);
        }
        int var17 = (var16 - 1) * this.field3011 + var12;
        return class243.method1589((byte) 99, var8, var9, var16, var17, var10, this.field3021);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIILia;)V")
    public final void method1469(int arg0, int arg1, int arg2, class423 arg3) {
        field3014++;
        class184 var5 = (class184) arg3;
        int var6 = var5.field2499 + arg0 + 1;
        int var7 = var5.field2498 + arg1 + 1;
        int var8 = var6 + (this.field3011 * var7);
        int var9 = 0;
        int var10 = var5.field2493;
        int var11 = var5.field2490;
        int var12 = this.field3011 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var10 -= var14;
            var8 += this.field3011 * var14;
        }
        if (this.field3007 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field3007;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var13 += var16;
            var9 += var16;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field3011) {
            int var17 = var6 + var11 + 1 - this.field3011;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class193.method1304(this.field3021, var13, var9, false, var5.field2491, var12, var10, var8, var11);
            int var18 = 85 / ((arg2 - 70) / 46);
            this.method1470(var11, var10, var7, var6, 7);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
    private final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3010++;
        if (this.field3020 == null || arg4 != 7) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg0 + arg3 - 2 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg1 + arg2 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class395[] var11 = this.field3020[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6033 = true;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lnq;Le;)V")
    public class213(class325 arg0, class376 arg1) {
        this.field3013 = arg1;
        this.field3009 = arg0;
        this.field3011 = (this.field3013.field340 * this.field3013.field336 >> this.field3009.field4895) + 2;
        this.field3007 = (this.field3013.field337 * this.field3013.field336 >> this.field3009.field4895) + 2;
        this.field3025 = this.field3009.field4895 + 7 - this.field3013.field341;
        this.field3021 = new byte[this.field3011 * this.field3007];
        this.field3017 = this.field3013.field340 >> this.field3025;
        this.field3012 = this.field3013.field337 >> this.field3025;
    }
}
