import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class59 {

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Led;")
    private class707 field819;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "Lbi;")
    private class483 field822;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    private int field824;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "[B")
    public byte[] field813;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lsf;")
    public static class526 field825 = new class526("", 13);

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "[I")
    public static int[] field827 = new int[50];

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "[I")
    public static int[] field826 = new int[1];

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "[[Llca;")
    private class646[][] field816;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method424(int arg0, class185 arg1, int arg2, int arg3) {
        int var5 = 105 % ((41 - arg3) / 36);
        field811++;
        class289 var6 = (class289) arg1;
        int var7 = var6.field3790 + arg0 + 1;
        int var8 = var6.field3792 + arg2 + 1;
        int var9 = this.field828 * var7 + var8;
        int var10 = var6.field3785;
        int var11 = var6.field3787;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var10 -= var12;
            var9 += this.field828 * var12;
        }
        int var13 = this.field828 - var11;
        if ((var7 + var10) >= this.field824) {
            int var14 = var7 - (this.field824 - var10 - 1);
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var13 += var15;
            var9 += var15;
            var11 -= var15;
            var8 = 1;
        }
        if ((var8 + var11) >= this.field828) {
            int var16 = var8 + var11 + 1 - this.field828;
            var13 += var16;
            var11 -= var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field828 + var13;
            return class722.method4030(var17, var18, this.field813, var11, var10, var9, (byte) 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method425(int arg0) {
        field826 = null;
        field827 = null;
        field825 = null;
        if (arg0 != -1) {
            method425(-93);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([[ZZIIII)V")
    public final void method426(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field822.method2776(1, false);
        field814++;
        if (arg2 != -28167) {
            return;
        }
        this.field822.method2816((byte) -10, false);
        this.field822.method2777(-2, 1);
        this.field822.method2800(1, 127);
        this.field822.method2844(124, 1);
        float var7 = 1.0F / (float) (this.field822.field6774 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field812; var8++) {
                int var9 = var8 << this.field817;
                int var10 = var8 + 1 << this.field817;
                label135: for (int var11 = 0; var11 < this.field818; var11++) {
                    int var12 = var11 << this.field817;
                    int var13 = var11 + 1 << this.field817;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg4 >= -arg5 && (var14 - arg4) <= arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg5 <= var15 - arg3 && var15 - arg3 <= arg5 && arg0[var14 + arg5 - arg4][var15 + arg5 - arg3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field816[var11][var8].method3626(arg2 + 18787);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field812; var16++) {
                int var17 = var16 << this.field817;
                int var18 = var16 + 1 << this.field817;
                for (int var19 = 0; var19 < this.field818; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field817;
                    int var22 = var19 + 1 << this.field817;
                    class736 var23 = this.field822.field6845;
                    var23.field6193 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg5 <= var24 - arg3 && (var24 - arg3) <= arg5) {
                            int var25 = this.field819.field3561 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg4 >= -arg5 && arg5 >= var26 - arg4 && arg0[var26 + arg5 - arg4][var24 + arg5 - arg3]) {
                                    short[] var27 = this.field819.field9813[var25];
                                    if (var27 != null) {
                                        if (this.field822.field6903) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2620(var27[var28] & 0xFFFF, false);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2619(var27[var29] & 0xFFFF, -1);
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
                        this.field816[var19][var16].method3622(arg2 ^ 0x6E6F, 5123, var20, var23.field6180);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lr;IIB)V")
    public final void method427(class185 arg0, int arg1, int arg2, byte arg3) {
        field815++;
        class289 var5 = (class289) arg0;
        int var6 = var5.field3790 + arg1 + 1;
        int var7 = var5.field3792 + arg2 + 1;
        int var8 = this.field828 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3785;
        if (arg3 > -24) {
            this.field817 = 100;
        }
        int var11 = var5.field3787;
        int var12 = this.field828 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var8 += this.field828 * var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if (this.field824 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field824;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var7 = 1;
        }
        if ((var7 + var11) >= this.field828) {
            int var17 = var7 + var11 + 1 - this.field828;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class197.method1305(var9, var5.field3791, this.field813, -1131291358, var10, var12, var11, var8, var13);
            this.method428(var6, var10, var7, (byte) 38, var11);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIBI)V")
    private final void method428(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field823++;
        if (this.field816 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg1 - 1 - 1 >> 7;
        if (arg3 <= 27) {
            this.method424(-112, null, 114, 79);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class646[] var11 = this.field816[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field8948 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public final void method429(int arg0) {
        this.field816 = new class646[this.field818][this.field812];
        field820++;
        for (int var2 = 0; var2 < this.field812; var2++) {
            for (int var3 = 0; var3 < this.field818; var3++) {
                this.field816[var3][var2] = new class646(this.field822, this, this.field819, var3, var2, this.field817, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != 1) {
            field826 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILr;)V")
    public final void method430(int arg0, int arg1, int arg2, class185 arg3) {
        field821++;
        class289 var5 = (class289) arg3;
        int var6 = var5.field3790 + arg0 + 1;
        int var7 = var5.field3792 + arg2 + 1;
        int var8 = this.field828 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3785;
        int var11 = var5.field3787;
        int var12 = this.field828 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var6 = 1;
            var8 += this.field828 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field824 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field824;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
        }
        if (var7 + var11 >= this.field828) {
            int var17 = var7 + var11 + 1 - this.field828;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (arg1 != 5123) {
            this.method428(-78, 48, 78, (byte) 16, -110);
        }
        if (var11 > 0 && var10 > 0) {
            class98.method789(var8, var5.field3791, false, this.field813, var11, var14, var9, var10, var12);
            this.method428(var6, var10, var7, (byte) 103, var11);
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lbi;Led;)V")
    public class59(class483 arg0, class707 arg1) {
        this.field819 = arg1;
        this.field822 = arg0;
        this.field828 = (this.field819.field3561 * this.field819.field3557 >> this.field822.field6775) + 2;
        this.field824 = (this.field819.field3557 * this.field819.field3555 >> this.field822.field6775) + 2;
        this.field813 = new byte[this.field828 * this.field824];
        this.field817 = this.field822.field6775 + 7 - this.field819.field3550;
        this.field818 = this.field819.field3561 >> this.field817;
        this.field812 = this.field819.field3555 >> this.field817;
    }
}
