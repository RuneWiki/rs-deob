import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class211 {

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lhk;")
    private class111 field3154;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lvca;")
    private class297 field3159;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    private int field3158;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[B")
    public byte[] field3160;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    private int field3152;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    private int field3157;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Ljia;")
    public static class645 field3155 = new class645();

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[[Lkd;")
    private class298[][] field3156;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([[ZIIZII)V", line = 8)
    public final void method1483(boolean[][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field3154.method956(false, 88);
        if (arg2 != -24638) {
            this.field3156 = null;
        }
        field3165++;
        this.field3154.method936(false, -128);
        this.field3154.method1006(1, -2);
        this.field3154.method999(true, 1);
        this.field3154.method973(arg2 + 24639, 1);
        float var7 = 1.0F / (float) (this.field3154.field1934 * 128);
        if (arg3) {
            for (int var22 = 0; var22 < this.field3157; var22++) {
                int var23 = var22 << this.field3158;
                int var24 = var22 + 1 << this.field3158;
                label88: for (int var25 = 0; var25 < this.field3152; var25++) {
                    int var26 = var25 << this.field3158;
                    int var27 = var25 + 1 << this.field3158;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg1 >= -arg4 && arg4 >= (var28 - arg1)) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg5 >= -arg4 && arg4 >= (var29 - arg5) && arg0[var28 + arg4 - arg1][arg4 + var29 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field3156[var25][var22].method1916((byte) -126);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3157; var8++) {
                int var9 = var8 << this.field3158;
                int var10 = var8 + 1 << this.field3158;
                for (int var11 = 0; var11 < this.field3152; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field3158;
                    int var14 = var11 + 1 << this.field3158;
                    class335 var15 = this.field3154.field2042;
                    var15.field1442 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((-arg4) <= (var16 - arg5) && arg4 >= (var16 - arg5)) {
                            int var17 = this.field3159.field4037 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg4 <= var18 - arg1 && var18 - arg1 <= arg4 && arg0[var18 + arg4 - arg1][arg4 + var16 - arg5]) {
                                    short[] var19 = this.field3159.field4055[var17];
                                    if (var19 != null) {
                                        if (this.field3154.field2000) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method781(arg2 + 24690, var19[var21] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method748(255, var19[var20] & 0xFFFF);
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
                        this.field3156[var11][var8].method1919(false, var15.field1413, var12, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BII)I", line = 194)
    public static final int method1484(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = 72 / ((arg0 - 23) / 32);
        field3151++;
        int var5 = -1;
        for (int var6 = arg3; var6 < arg2; var6++) {
            var5 = class183.field2848[(arg1[var6] ^ var5) & 0xFF] ^ var5 >>> 8;
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V", line = 219)
    private final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3149++;
        if (arg1 != 65535) {
            method1486(-91);
        }
        if (this.field3156 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg4 + arg0 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class298[] var11 = this.field3156[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field4103 = true;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 260)
    public static void method1486(int arg0) {
        field3155 = null;
        if (arg0 != 1) {
            field3161 = -99;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILr;)V", line = 270)
    public final void method1487(int arg0, int arg1, int arg2, class196 arg3) {
        field3150++;
        class60 var5 = (class60) arg3;
        int var6 = var5.field822 + arg2 + 1;
        int var7 = var5.field819 + arg0 + 1;
        int var8 = this.field3148 * var7 + var6;
        int var9 = 0;
        if (arg1 <= 36) {
            return;
        }
        int var10 = var5.field825;
        int var11 = var5.field824;
        int var12 = this.field3148 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var10 -= var13;
            var7 = 1;
            var8 += this.field3148 * var13;
        }
        int var14 = 0;
        if (this.field3164 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field3164;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var11 -= var16;
            var14 += var16;
        }
        if ((var6 + var11) >= this.field3148) {
            int var17 = var6 + 1 - (-var11 + this.field3148);
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class784.method4277(var10, var14, var5.field826, -128, var9, var11, var8, var12, this.field3160);
            this.method1485(var6, 65535, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILr;I)V", line = 348)
    public final void method1488(int arg0, int arg1, class196 arg2, int arg3) {
        field3163++;
        class60 var5 = (class60) arg2;
        int var6 = var5.field822 + arg3 + 1;
        int var7 = var5.field819 + arg0 + 1;
        int var8 = this.field3148 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field825;
        int var11 = var5.field824;
        int var12 = this.field3148 - var11;
        int var13 = 0;
        if (arg1 <= ~var7) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += this.field3148 * var14;
            var9 += var11 * var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field3164) {
            int var15 = var7 + var10 + 1 - this.field3164;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var9 += var16;
            var8 += var16;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
        }
        if ((var6 + var11) >= this.field3148) {
            int var17 = var6 + var11 + 1 - this.field3148;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class257.method1679(var8, var13, var11, this.field3160, -1, var12, var9, var5.field826, var10);
            this.method1485(var6, 65535, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 418)
    public final void method1489(int arg0) {
        this.field3156 = new class298[this.field3152][this.field3157];
        field3153++;
        if (arg0 != -1) {
            return;
        }
        for (int var2 = 0; var2 < this.field3157; var2++) {
            for (int var3 = 0; var3 < this.field3152; var3++) {
                this.field3156[var3][var2] = new class298(this.field3154, this, this.field3159, var3, var2, this.field3158, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lhk;Lvca;)V", line = 453)
    public class211(class111 arg0, class297 arg1) {
        this.field3154 = arg0;
        this.field3159 = arg1;
        this.field3148 = (this.field3159.field4037 * this.field3159.field4035 >> this.field3154.field1936) + 2;
        this.field3164 = (this.field3159.field4035 * this.field3159.field4034 >> this.field3154.field1936) + 2;
        this.field3158 = this.field3154.field1936 + 7 - this.field3159.field4036;
        this.field3160 = new byte[this.field3164 * this.field3148];
        this.field3152 = this.field3159.field4037 >> this.field3158;
        this.field3157 = this.field3159.field4034 >> this.field3158;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIILr;)Z", line = 469)
    public final boolean method1490(int arg0, int arg1, int arg2, class196 arg3) {
        field3162++;
        class60 var5 = (class60) arg3;
        int var6 = var5.field822 + arg0 + 1;
        int var7 = var5.field819 + arg2 + 1;
        int var8 = this.field3148 * var7 + var6;
        int var9 = var5.field825;
        int var10 = var5.field824;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var8 += this.field3148 * var11;
            var7 = 1;
            var9 -= var11;
        }
        int var12 = this.field3148 - var10;
        if ((var7 + var9) >= this.field3164) {
            int var13 = var7 + var9 + 1 - this.field3164;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var12 += var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field3148) {
            int var15 = var6 + var10 + 1 - this.field3148;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return false;
        }
        byte var16 = 8;
        if (arg1 > -43) {
            return true;
        } else {
            int var17 = (var16 - 1) * this.field3148 + var12;
            return class542.method3059(var9, var10, var16, var8, var17, (byte) -10, this.field3160);
        }
    }
}
