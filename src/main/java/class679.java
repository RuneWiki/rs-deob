import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class679 {

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "Leq;")
    private class357 field9220;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "Lqh;")
    private class74 field9212;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
    public int field9221;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    private int field9216;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "[B")
    public byte[] field9217;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    private int field9214;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    private int field9213;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    private int field9211;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "Lqia;")
    public static class547 field9210 = new class547();

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "Lkh;")
    public static class354 field9223 = new class354();

    @OriginalMember(owner = "client!jia", name = "q", descriptor = "Z")
    public static boolean field9225 = false;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "[[Lnfa;")
    private class714[][] field9209;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public final void method3643(byte arg0) {
        this.field9209 = new class714[this.field9213][this.field9211];
        field9218++;
        for (int var2 = 0; var2 < this.field9211; var2++) {
            for (int var3 = 0; var3 < this.field9213; var3++) {
                this.field9209[var3][var2] = new class714(this.field9220, this, this.field9212, var3, var2, this.field9214, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != 111) {
            this.field9220 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILr;II)Z")
    public final boolean method3644(int arg0, class108 arg1, int arg2, int arg3) {
        field9215++;
        if (arg2 > -43) {
            return true;
        }
        class8 var5 = (class8) arg1;
        int var6 = var5.field78 + arg0 + 1;
        int var7 = var5.field79 + arg3 + 1;
        int var8 = var6 + (this.field9221 * var7);
        int var9 = var5.field84;
        int var10 = var5.field86;
        int var11 = this.field9221 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var8 += this.field9221 * var12;
            var7 = 1;
            var9 -= var12;
        }
        if (var7 + var9 >= this.field9216) {
            int var13 = var9 + var7 + 1 - this.field9216;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var8 += var14;
            var11 += var14;
        }
        if (this.field9221 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field9221;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9221 + var11;
            return class346.method2034(var17, var9, var8, this.field9217, var16, var10, -1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIBI)V")
    private final void method3645(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 117) {
            this.field9209 = null;
        }
        field9219++;
        if (this.field9209 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg2 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg1 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class714[] var11 = this.field9209[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field10053 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lr;III)V")
    public final void method3646(class108 arg0, int arg1, int arg2, int arg3) {
        field9226++;
        class8 var5 = (class8) arg0;
        int var6 = var5.field79 + arg2 + 1;
        int var7 = var5.field78 + arg3 + 1;
        int var8 = var7 + (this.field9221 * var6);
        int var9 = 0;
        int var10 = var5.field84;
        int var11 = var5.field86;
        int var12 = this.field9221 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field9221 * var14;
            var6 = 1;
        }
        if (var6 + var10 >= this.field9216) {
            int var15 = var10 + var6 + 1 - this.field9216;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var13 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
        }
        if (this.field9221 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field9221;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class172.method1073(var10, var5.field81, 3536, var9, var11, var12, var13, var8, this.field9217);
        if (arg1 > -62) {
            this.method3643((byte) 72);
        }
        this.method3645(var7, var10, var11, (byte) 117, var6);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIILr;)V")
    public final void method3647(int arg0, int arg1, int arg2, class108 arg3) {
        field9224++;
        class8 var5 = (class8) arg3;
        int var6 = var5.field78 + arg0 + 1;
        int var7 = var5.field79 + arg2 + 1;
        int var8 = this.field9221 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field84;
        int var11 = var5.field86;
        if (arg1 >= -89) {
            this.field9220 = null;
        }
        int var12 = this.field9221 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field9221 * var14;
        }
        if (this.field9216 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field9216;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var9 += var16;
            var6 = 1;
            var13 += var16;
        }
        if (this.field9221 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field9221;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class224.method1451(var12, var11, var8, var9, var10, false, var13, this.field9217, var5.field81);
            this.method3645(var6, var10, var11, (byte) 117, var7);
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)V")
    public static void method3648(byte arg0) {
        field9210 = null;
        field9223 = null;
        if (arg0 <= 68) {
            method3648((byte) 89);
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Leq;Lqh;)V")
    public class679(class357 arg0, class74 arg1) {
        this.field9220 = arg0;
        this.field9212 = arg1;
        this.field9221 = (this.field9212.field5569 * this.field9212.field5561 >> this.field9220.field4956) + 2;
        this.field9216 = (this.field9212.field5562 * this.field9212.field5561 >> this.field9220.field4956) + 2;
        this.field9217 = new byte[this.field9221 * this.field9216];
        this.field9214 = this.field9220.field4956 + 7 - this.field9212.field5570;
        this.field9213 = this.field9212.field5569 >> this.field9214;
        this.field9211 = this.field9212.field5562 >> this.field9214;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I[[ZIZZI)V")
    public final void method3649(int arg0, boolean[][] arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        this.field9220.method2188(false, arg3);
        field9222++;
        this.field9220.method2125(0, false);
        this.field9220.method2140(0, -2);
        this.field9220.method2153(91, 1);
        this.field9220.method2195(-115, 1);
        float var7 = 1.0F / (float) (this.field9220.field4959 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field9211; var22++) {
                int var23 = var22 << this.field9214;
                int var24 = var22 + 1 << this.field9214;
                label85: for (int var25 = 0; var25 < this.field9213; var25++) {
                    int var26 = var25 << this.field9214;
                    int var27 = var25 + 1 << this.field9214;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if ((var28 - arg5) >= (-arg2) && arg2 >= var28 - arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg2) <= (var29 - arg0) && arg2 >= (var29 - arg0) && arg1[var28 + arg2 - arg5][var29 + arg2 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field9209[var25][var22].method3955(57);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field9211; var8++) {
                int var9 = var8 << this.field9214;
                int var10 = var8 + 1 << this.field9214;
                for (int var11 = 0; var11 < this.field9213; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field9214;
                    int var14 = var11 + 1 << this.field9214;
                    class552 var15 = this.field9220.field5044;
                    var15.field2354 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg0 >= -arg2 && arg2 >= (var16 - arg0)) {
                            int var17 = this.field9212.field5569 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg2 <= var18 - arg5 && arg2 >= (var18 - arg5) && arg1[var18 + arg2 - arg5][arg2 + var16 - arg0]) {
                                    short[] var19 = this.field9212.field983[var17];
                                    if (var19 != null) {
                                        if (this.field9220.field5025) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var15.method1157(var19[var20] & 0xFFFF, (byte) 124);
                                                var12++;
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method1098(var19[var21] & 0xFFFF, (byte) -34);
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
                        this.field9209[var11][var8].method3961(var12, var15.field2325, 20795, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }
}
