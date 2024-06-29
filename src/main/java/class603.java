import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class603 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Leo;")
    private class296 field8572;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "Lnv;")
    private class417 field8581;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public int field8584;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    private int field8585;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "[B")
    public byte[] field8576;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    private int field8574;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    private int field8589;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    private int field8590;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "[Lqfa;")
    public static class98[] field8577 = new class98[2048];

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "Z")
    public static boolean field8592 = false;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Lpia;")
    public static class94 field8579 = new class94(34, 7);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field8578;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field8583;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "[[Lsd;")
    private class93[][] field8591;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZI[[ZII)V", line = 4)
    public final void method3419(int arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        this.field8581.method2625((byte) 113, false);
        field8578++;
        this.field8581.method2556(false, -89);
        this.field8581.method2624(-2, arg5 + 3);
        this.field8581.method2573(1, false);
        this.field8581.method2606(1, -24754);
        float var7 = 1.0F / (float) (this.field8581.field5917 * 128);
        if (arg1) {
            for (int var22 = 0; var22 < this.field8590; var22++) {
                int var23 = var22 << this.field8574;
                int var24 = var22 + 1 << this.field8574;
                label89: for (int var25 = 0; var25 < this.field8589; var25++) {
                    int var26 = var25 << this.field8574;
                    int var27 = var25 + 1 << this.field8574;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((-arg0) <= (var28 - arg4) && arg0 >= var28 - arg4) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (-arg0 <= var29 - arg2 && var29 - arg2 <= arg0 && arg3[var28 + arg0 - arg4][var29 + arg0 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field8591[var25][var22].method629(-86);
                                    continue label89;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field8590; var8++) {
                int var9 = var8 << this.field8574;
                int var10 = var8 + 1 << this.field8574;
                for (int var11 = 0; var11 < this.field8589; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field8574;
                    int var14 = var11 + 1 << this.field8574;
                    class685 var15 = this.field8581.field6059;
                    var15.field2903 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg0 <= var16 - arg2 && arg0 >= (var16 - arg2)) {
                            int var17 = this.field8572.field3410 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((-arg0) <= (var18 - arg4) && (var18 - arg4) <= arg0 && arg3[var18 + arg0 - arg4][var16 + arg0 - arg2]) {
                                    short[] var19 = this.field8572.field3671[var17];
                                    if (var19 != null) {
                                        if (this.field8581.field5992) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method1446(var19[var20] & 0xFFFF, true);
                                                var12++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method1432(var19[var21] & 0xFFFF, (byte) 126);
                                                var12++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field8591[var11][var8].method627(var12, 5123, true, var15.field2912);
                    }
                }
            }
        }
        if (arg5 == -1) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILr;I)V", line = 187)
    public final void method3420(int arg0, int arg1, class182 arg2, int arg3) {
        field8593++;
        class396 var5 = (class396) arg2;
        int var6 = var5.field5426 + arg1 + arg0;
        int var7 = var5.field5423 + arg3 + 1;
        int var8 = this.field8584 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5428;
        int var11 = var5.field5433;
        int var12 = this.field8584 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field8584 * var13;
            var10 -= var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field8585 <= var6 + var10) {
            int var15 = var6 - this.field8585 - (-var10 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var7 = 1;
        }
        if (this.field8584 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field8584;
            var12 += var17;
            var11 -= var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class722.method4025(var14, var5.field5431, var9, this.field8576, var10, (byte) -116, var12, var8, var11);
            this.method3428(var7, var11, (byte) -128, var6, var10);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 258)
    public static void method3421(int arg0) {
        field8577 = null;
        field8579 = null;
        if (arg0 != 23153) {
            method3422(122, null);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILtp;)Ljava/lang/String;", line = 269)
    public static final String method3422(int arg0, class532 arg1) {
        field8575++;
        if (client.method1779(arg1).method4186(false) == 0) {
            return null;
        } else if (arg1.field7566 == null || arg1.field7566.trim().length() == 0) {
            return class19.field164 ? "Hidden-use" : null;
        } else if (arg0 == 1) {
            return arg1.field7566;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V", line = 300)
    public static final void method3423(byte arg0, int arg1) {
        field8588++;
        int var2 = -17 % ((26 - arg1) / 45);
        if (class637.field9155 == null) {
            class637.field9155 = new byte[4][class489.field6976][class153.field1677];
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class489.field6976; var4++) {
                for (int var5 = 0; var5 < class153.field1677; var5++) {
                    class637.field9155[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILr;BI)Z", line = 335)
    public final boolean method3424(int arg0, class182 arg1, byte arg2, int arg3) {
        field8580++;
        class396 var5 = (class396) arg1;
        int var6 = var5.field5426 + arg3 + 1;
        int var7 = var5.field5423 + arg0 + 1;
        int var8 = this.field8584 * var6 + var7;
        int var9 = var5.field5428;
        int var10 = var5.field5433;
        int var11 = this.field8584 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var9 -= var12;
            var8 += this.field8584 * var12;
        }
        if (this.field8585 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field8585;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
            var8 += var14;
        }
        if (var7 + var10 >= this.field8584) {
            int var15 = var10 + var7 + 1 - this.field8584;
            var10 -= var15;
            var11 += var15;
        }
        if (arg2 != -38) {
            this.method3420(-43, -124, null, 98);
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8584 + var11;
            return class579.method3339((byte) -122, var10, var8, var16, this.field8576, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V", line = 407)
    public final void method3425(boolean arg0) {
        field8583++;
        this.field8591 = new class93[this.field8589][this.field8590];
        if (arg0) {
            field8573 = -11;
        }
        for (int var2 = 0; var2 < this.field8590; var2++) {
            for (int var3 = 0; var3 < this.field8589; var3++) {
                this.field8591[var3][var2] = new class93(this.field8581, this, this.field8572, var3, var2, this.field8574, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Lv;", line = 436)
    public static final class577 method3426(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9731;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lr;III)V", line = 443)
    public final void method3427(class182 arg0, int arg1, int arg2, int arg3) {
        field8587++;
        class396 var5 = (class396) arg0;
        int var6 = var5.field5426 + arg3 + 1;
        int var7 = var5.field5423 + arg2 + arg1;
        int var8 = this.field8584 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field5428;
        int var11 = var5.field5433;
        int var12 = this.field8584 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field8584 * var14;
            var6 = 1;
        }
        if (this.field8585 <= (var6 + var10)) {
            int var15 = var10 + var6 + 1 - this.field8585;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var13 += var16;
            var7 = 1;
            var12 += var16;
            var9 += var16;
            var8 += var16;
        }
        if (this.field8584 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field8584;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class371.method2161(var9, var5.field5431, var12, var11, var10, var8, this.field8576, var13, (byte) -116);
            this.method3428(var7, var11, (byte) -128, var6, var10);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIBII)V", line = 511)
    private final void method3428(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field8582++;
        if (this.field8591 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 - (1 - arg1) - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        if (arg2 > -127) {
            method3426(-84, 55, -105);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class93[] var11 = this.field8591[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field980 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lnv;Leo;)V", line = 559)
    public class603(class417 arg0, class296 arg1) {
        this.field8572 = arg1;
        this.field8581 = arg0;
        this.field8584 = (this.field8572.field3413 * this.field8572.field3410 >> this.field8581.field5920) + 2;
        this.field8585 = (this.field8572.field3413 * this.field8572.field3408 >> this.field8581.field5920) + 2;
        this.field8576 = new byte[this.field8585 * this.field8584];
        this.field8574 = this.field8581.field5920 + 7 - this.field8572.field3409;
        this.field8589 = this.field8572.field3410 >> this.field8574;
        this.field8590 = this.field8572.field3408 >> this.field8574;
    }
}
