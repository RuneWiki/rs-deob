import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class628 {

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lep;")
    private class371 field8975;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Ldn;")
    private class375 field8966;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field8965;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    private int field8964;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[B")
    public byte[] field8959;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    private int field8960;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    private int field8974;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    private int field8969;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Lju;")
    public static class102 field8963 = new class102(6, -1);

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
    public static int[] field8973 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "[[Lqo;")
    private class644[][] field8972;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lr;IBI)V", line = 4)
    public final void method3663(class706 arg0, int arg1, byte arg2, int arg3) {
        field8961++;
        class668 var5 = (class668) arg0;
        if (arg2 <= 64) {
            return;
        }
        int var6 = var5.field9405 + arg1 + 1;
        int var7 = var5.field9404 + arg3 + 1;
        int var8 = this.field8965 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9411;
        int var11 = var5.field9410;
        int var12 = this.field8965 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var10 -= var14;
            var6 = 1;
            var8 += this.field8965 * var14;
        }
        if ((var6 + var10) >= this.field8964) {
            int var15 = var6 + var10 + 1 - this.field8964;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
            var13 += var16;
        }
        if (var7 + var11 >= this.field8965) {
            int var17 = var7 + var11 + 1 - this.field8965;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class504.method3013(this.field8959, var10, var5.field9409, var12, var9, (byte) -25, var13, var11, var8);
            this.method3668(var11, var6, var10, var7, 8);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZI[[ZII)V", line = 80)
    public final void method3664(int arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4, int arg5) {
        field8962++;
        this.field8975.method2197(false, (byte) -88);
        this.field8975.method2192(-73, false);
        this.field8975.method2103((byte) 125, -2);
        this.field8975.method2208(1, 6406);
        this.field8975.method2121(1, 1);
        float var7 = 1.0F / (float) (this.field8975.field4952 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field8969; var8++) {
                int var9 = var8 << this.field8960;
                int var10 = var8 + 1 << this.field8960;
                label136: for (int var11 = 0; var11 < this.field8974; var11++) {
                    int var12 = var11 << this.field8960;
                    int var13 = var11 + 1 << this.field8960;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg4) >= (-arg2) && arg2 >= (var14 - arg4)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg2) <= (var15 - arg0) && var15 - arg0 <= arg2 && arg3[var14 + arg2 - arg4][var15 + arg2 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field8972[var11][var8].method3736(54);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field8969; var16++) {
                int var17 = var16 << this.field8960;
                int var18 = var16 + 1 << this.field8960;
                for (int var19 = 0; var19 < this.field8974; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field8960;
                    int var22 = var19 + 1 << this.field8960;
                    class128 var23 = this.field8975.field5033;
                    var23.field330 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg0) >= (-arg2) && arg2 >= (var24 - arg0)) {
                            int var25 = this.field8966.field4344 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg2 <= var26 - arg4 && var26 - arg4 <= arg2 && arg3[var26 + arg2 - arg4][var24 + arg2 - arg0]) {
                                    short[] var27 = this.field8966.field5179[var25];
                                    if (var27 != null) {
                                        if (this.field8975.field4992) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method147((byte) 53, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method139(var27[var28] & 0xFFFF, -111);
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
                        this.field8972[var19][var16].method3737(-17881, var23.field279, var20, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        if (arg5 != 7) {
            method3665(49, 124, 120, 77, -69);
        }
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)Z", line = 269)
    public static final boolean method3665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8968++;
        if (!class57.field802 || !class238.field3315) {
            return false;
        } else if (class129.field1762 < 100) {
            return false;
        } else {
            if (arg0 != 65535) {
                field8963 = null;
            }
            if (!class614.method3603(arg3, false, arg2, arg4)) {
                return false;
            }
            int var5 = arg2 << class509.field7106;
            int var6 = arg3 << class509.field7106;
            if (class141.method909(var6, class96.field1402, var5, arg1, arg0 - 65658, class96.field1402, class52.field741[arg4].method1959(arg0 ^ 0xFF80, arg3, arg2))) {
                class158.field2144++;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILr;)V", line = 304)
    public final void method3666(int arg0, int arg1, int arg2, class706 arg3) {
        field8970++;
        class668 var5 = (class668) arg3;
        int var6 = var5.field9405 + arg1 + 1;
        int var7 = var5.field9404 + arg0 + 1;
        int var8 = this.field8965 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field9411;
        int var11 = var5.field9410;
        int var12 = this.field8965 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field8965 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field8964 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field8964;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var7 = 1;
            var8 += var16;
        }
        int var17 = -27 % ((arg2 - 63) / 54);
        if (this.field8965 <= var7 + var11) {
            int var18 = var7 + var11 + 1 - this.field8965;
            var11 -= var18;
            var12 += var18;
            var14 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class384.method2349(var5.field9409, this.field8959, var9, var11, var8, (byte) -98, var12, var10, var14);
            this.method3668(var11, var6, var10, var7, 8);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 373)
    public static void method3667(int arg0) {
        field8973 = null;
        field8963 = null;
        if (arg0 != -101) {
            field8973 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IIIII)V", line = 393)
    private final void method3668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8967++;
        if (this.field8972 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg0 - 2 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg2 - 2 >> 7;
        if (arg4 != 8) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class644[] var11 = this.field8972[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field9133 = true;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 431)
    public final void method3669(int arg0) {
        if (arg0 <= 108) {
            return;
        }
        this.field8972 = new class644[this.field8974][this.field8969];
        field8958++;
        for (int var2 = 0; var2 < this.field8969; var2++) {
            for (int var3 = 0; var3 < this.field8974; var3++) {
                this.field8972[var3][var2] = new class644(this.field8975, this, this.field8966, var3, var2, this.field8960, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lr;III)Z", line = 459)
    public final boolean method3670(class706 arg0, int arg1, int arg2, int arg3) {
        field8971++;
        class668 var5 = (class668) arg0;
        int var6 = var5.field9404 + arg1 + 1;
        int var7 = var5.field9405 + arg2 + 1;
        int var8 = this.field8965 * var7 + var6;
        int var9 = var5.field9411;
        if (arg3 != -13500) {
            this.field8959 = null;
        }
        int var10 = var5.field9410;
        int var11 = this.field8965 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var8 += this.field8965 * var12;
            var7 = 1;
        }
        if (var7 + var9 >= this.field8964) {
            int var13 = var7 + var9 + 1 - this.field8964;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
            var6 = 1;
        }
        if (this.field8965 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field8965;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8965 + var11;
            return class387.method2359((byte) 61, var16, this.field8959, var8, var10, var9, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lep;Ldn;)V", line = 537)
    public class628(class371 arg0, class375 arg1) {
        this.field8975 = arg0;
        this.field8966 = arg1;
        this.field8965 = (this.field8966.field4346 * this.field8966.field4344 >> this.field8975.field4953) + 2;
        this.field8964 = (this.field8966.field4348 * this.field8966.field4346 >> this.field8975.field4953) + 2;
        this.field8959 = new byte[this.field8965 * this.field8964];
        this.field8960 = this.field8975.field4953 + 7 - this.field8966.field4349;
        this.field8974 = this.field8966.field4344 >> this.field8960;
        this.field8969 = this.field8966.field4348 >> this.field8960;
    }
}
