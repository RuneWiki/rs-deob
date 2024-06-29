import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class600 {

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Lpea;")
    private class641 field8213;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lle;")
    private class517 field8212;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public int field8210;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    private int field8208;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "[B")
    public byte[] field8219;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    private int field8223;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    private int field8214;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    private int field8222;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "[[Lad;")
    private class171[][] field8215;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ldga;Z)V")
    public static final void method3323(class138 arg0, boolean arg1) {
        field8218++;
        if (arg0.field1712.length - arg0.field1745 < 1) {
            return;
        }
        int var2 = arg0.method957((byte) -64);
        if (var2 < 0 || var2 > 1 || (arg0.field1712.length - arg0.field1745) < 2) {
            return;
        }
        int var3 = arg0.method922((byte) -127);
        if (arg1) {
            method3323(null, true);
        }
        if ((arg0.field1712.length - arg0.field1745) < (var3 * 6)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method922((byte) -117);
            int var6 = arg0.method943(-90);
            if (var5 < class85.field1042.length && class521.field7223[var5] && (class383.field5570.method178(var5, 57).field4849 != '1' || var6 >= -1 && var6 <= 1)) {
                class85.field1042[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public final void method3324(int arg0) {
        this.field8215 = new class171[this.field8214][this.field8222];
        field8221++;
        int var2 = -23 / ((arg0 + 10) / 48);
        for (int var3 = 0; var3 < this.field8222; var3++) {
            for (int var4 = 0; var4 < this.field8214; var4++) {
                this.field8215[var4][var3] = new class171(this.field8213, this, this.field8212, var4, var3, this.field8223, var4 * 128 + 1, var3 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)V")
    private final void method3325(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8217++;
        if (this.field8215 == null) {
            return;
        }
        int var6 = 33 / ((76 - arg4) / 35);
        int var7 = arg2 - 1 >> 7;
        int var8 = arg0 + arg2 - 1 - 1 >> 7;
        int var9 = arg1 - 1 >> 7;
        int var10 = arg1 - (1 - arg3) - 1 >> 7;
        for (int var11 = var7; var11 <= var8; var11++) {
            class171[] var12 = this.field8215[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                var12[var13].field2137 = true;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILw;BI)V")
    public final void method3326(int arg0, class451 arg1, byte arg2, int arg3) {
        field8209++;
        class441 var5 = (class441) arg1;
        int var6 = var5.field6076 + arg0 + 1;
        int var7 = var5.field6068 + arg3 + 1;
        int var8 = this.field8210 * var7 + var6;
        int var9 = -83 % ((9 - arg2) / 62);
        int var10 = 0;
        int var11 = var5.field6071;
        int var12 = var5.field6073;
        int var13 = this.field8210 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var8 += this.field8210 * var15;
            var11 -= var15;
            var10 += var12 * var15;
            var7 = 1;
        }
        if (this.field8208 <= var7 + var11) {
            int var16 = var7 + var11 + 1 - this.field8208;
            var11 -= var16;
        }
        if (var6 <= 0) {
            int var17 = 1 - var6;
            var10 += var17;
            var13 += var17;
            var12 -= var17;
            var8 += var17;
            var14 += var17;
            var6 = 1;
        }
        if (this.field8210 <= var6 + var12) {
            int var18 = var6 + var12 - (this.field8210 - 1);
            var14 += var18;
            var12 -= var18;
            var13 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class16.method87(var11, var14, var5.field6070, var13, this.field8219, 3, var10, var12, var8);
            this.method3325(var12, var7, var6, var11, -104);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[ZIZIB)V")
    public final void method3327(int arg0, boolean[][] arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        if (arg5 < 106) {
            return;
        }
        this.field8213.method3520((byte) -127, false);
        field8220++;
        this.field8213.method3505(-783, false);
        this.field8213.method3530(-2, 69);
        this.field8213.method3524(1, 14);
        this.field8213.method3547(1, true);
        float var7 = 1.0F / (float) (this.field8213.field8940 * 128);
        if (arg3) {
            for (int var8 = 0; var8 < this.field8222; var8++) {
                int var9 = var8 << this.field8223;
                int var10 = var8 + 1 << this.field8223;
                label135: for (int var11 = 0; var11 < this.field8214; var11++) {
                    int var12 = var11 << this.field8223;
                    int var13 = var11 + 1 << this.field8223;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg2) >= (-arg0) && arg0 >= var14 - arg2) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg0) <= (var15 - arg4) && var15 - arg4 <= arg0 && arg1[var14 + arg0 - arg2][var15 + arg0 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field8215[var11][var8].method1145(-68);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field8222; var16++) {
                int var17 = var16 << this.field8223;
                int var18 = var16 + 1 << this.field8223;
                for (int var19 = 0; var19 < this.field8214; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field8223;
                    int var22 = var19 + 1 << this.field8223;
                    class457 var23 = this.field8213.field9078;
                    var23.field1745 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg0) <= (var24 - arg4) && arg0 >= (var24 - arg4)) {
                            int var25 = this.field8212.field2214 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg0 <= var26 - arg2 && arg0 >= var26 - arg2 && arg1[var26 + arg0 - arg2][var24 + arg0 - arg4]) {
                                    short[] var27 = this.field8212.field7101[var25];
                                    if (var27 != null) {
                                        if (this.field8213.field8968) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method915(var27[var28] & 0xFFFF, 1502242504);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method954(var27[var29] & 0xFFFF, -89);
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
                        this.field8215[var19][var16].method1144(true, var20, var23.field1712, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lw;III)V")
    public final void method3328(class451 arg0, int arg1, int arg2, int arg3) {
        field8211++;
        class441 var5 = (class441) arg0;
        int var6 = var5.field6068 + arg1 + 1;
        int var7 = var5.field6076 + arg2 + 1;
        int var8 = this.field8210 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field6071;
        int var11 = var5.field6073;
        int var12 = this.field8210 - var11;
        int var13 = 0;
        if (arg3 > -116) {
            this.field8223 = -73;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var8 += this.field8210 * var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field8208 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field8208;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var9 += var16;
            var13 += var16;
            var7 = 1;
            var8 += var16;
            var12 += var16;
        }
        if (this.field8210 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field8210;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class569.method3211(var5.field6070, var13, var9, var8, var11, var10, this.field8219, 96, var12);
            this.method3325(var11, var6, var7, var10, 113);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLw;II)Z")
    public final boolean method3329(byte arg0, class451 arg1, int arg2, int arg3) {
        field8216++;
        class441 var5 = (class441) arg1;
        int var6 = var5.field6068 + arg2 + 1;
        int var7 = var5.field6076 + arg3 + 1;
        int var8 = this.field8210 * var6 + var7;
        int var9 = var5.field6071;
        int var10 = var5.field6073;
        int var11 = this.field8210 - var10;
        if (arg0 >= -74) {
            return true;
        }
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field8210 * var12;
            var6 = 1;
            var9 -= var12;
        }
        if (this.field8208 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field8208;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var7 = 1;
            var11 += var14;
        }
        if (this.field8210 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8210;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8210 + var11;
            return class612.method3367(var10, var17, var16, var8, 107, var9, this.field8219);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lpea;Lle;)V")
    public class600(class641 arg0, class517 arg1) {
        this.field8213 = arg0;
        this.field8212 = arg1;
        this.field8210 = (this.field8212.field2214 * this.field8212.field2210 >> this.field8213.field8939) + 2;
        this.field8208 = (this.field8212.field2215 * this.field8212.field2210 >> this.field8213.field8939) + 2;
        this.field8219 = new byte[this.field8210 * this.field8208];
        this.field8223 = this.field8213.field8939 + 7 - this.field8212.field2212;
        this.field8214 = this.field8212.field2214 >> this.field8223;
        this.field8222 = this.field8212.field2215 >> this.field8223;
    }
}
