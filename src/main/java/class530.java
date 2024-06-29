import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class530 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lrk;")
    private class30 field6686;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Ljaa;")
    private class576 field6683;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field6682;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    private int field6696;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    private int field6685;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[B")
    public byte[] field6693;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    private int field6691;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field6689;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field6684 = -1;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Ln;")
    public static class17 field6699;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "[[Lmu;")
    private class280[][] field6688;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILw;B)V")
    public final void method2857(int arg0, int arg1, class279 arg2, byte arg3) {
        field6700++;
        class266 var5 = (class266) arg2;
        int var6 = var5.field3366 + arg1 + 1;
        int var7 = var5.field3371 + arg0 + 1;
        int var8 = this.field6682 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3363;
        int var11 = var5.field3362;
        int var12 = -87 / ((47 - arg3) / 41);
        int var13 = this.field6682 - var11;
        int var14 = 0;
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var9 += var11 * var15;
            var10 -= var15;
            var6 = 1;
            var8 += this.field6682 * var15;
        }
        if ((var6 + var10) >= this.field6696) {
            int var16 = var10 + var6 + 1 - this.field6696;
            var10 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var9 += var17;
            var11 -= var17;
            var7 = 1;
            var13 += var17;
            var8 += var17;
            var14 += var17;
        }
        if ((var7 + var11) >= this.field6682) {
            int var18 = var11 + var7 + 1 - this.field6682;
            var14 += var18;
            var13 += var18;
            var11 -= var18;
        }
        if (var11 > 0 && var10 > 0) {
            class112.method778(var11, this.field6693, 24, var10, var14, var5.field3365, var8, var9, var13);
            this.method2863(var7, var10, var6, var11, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method2858(int arg0) {
        field6699 = null;
        if (arg0 != 0) {
            field6699 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public final void method2859(int arg0) {
        field6695++;
        int var2 = 8 / ((arg0 - 23) / 61);
        this.field6688 = new class280[this.field6691][this.field6689];
        for (int var3 = 0; var3 < this.field6689; var3++) {
            for (int var4 = 0; var4 < this.field6691; var4++) {
                this.field6688[var4][var3] = new class280(this.field6683, this, this.field6686, var4, var3, this.field6685, var4 * 128 + 1, var3 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
    public static final int method2860(int arg0, int arg1) {
        if (arg1 != 5890) {
            return -87;
        }
        field6698++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI[[ZIII)V")
    public final void method2861(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field6690++;
        this.field6683.method3130(3156, false);
        this.field6683.method3174(false, -32);
        this.field6683.method3171(arg4 + 103, -2);
        this.field6683.method3134(-89, arg4);
        this.field6683.method3146(7261, 1);
        float var7 = 1.0F / (float) (this.field6683.field7589 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field6689; var8++) {
                int var9 = var8 << this.field6685;
                int var10 = var8 + 1 << this.field6685;
                label132: for (int var11 = 0; var11 < this.field6691; var11++) {
                    int var12 = var11 << this.field6685;
                    int var13 = var11 + 1 << this.field6685;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg5) >= (-arg3) && arg3 >= var14 - arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg3 <= var15 - arg1 && arg3 >= var15 - arg1 && arg2[var14 + arg3 - arg5][arg3 + var15 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6688[var11][var8].method1686(3287);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field6689; var16++) {
                int var17 = var16 << this.field6685;
                int var18 = var16 + 1 << this.field6685;
                for (int var19 = 0; var19 < this.field6691; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field6685;
                    int var22 = var19 + 1 << this.field6685;
                    class113 var23 = this.field6683.field7738;
                    var23.field7313 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg3 <= var24 - arg1 && arg3 >= var24 - arg1) {
                            int var25 = this.field6686.field1685 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg3 <= var26 - arg5 && var26 - arg5 <= arg3 && arg2[arg3 + var26 - arg5][var24 + arg3 - arg1]) {
                                    short[] var27 = this.field6686.field388[var25];
                                    if (var27 != null) {
                                        if (this.field6683.field7643) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method3080((byte) -113, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method3060(-32768, var27[var29] & 0xFFFF);
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
                        this.field6688[var19][var16].method1683((byte) -47, var23.field7318, var20, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBILw;)V")
    public final void method2862(int arg0, byte arg1, int arg2, class279 arg3) {
        field6692++;
        class266 var5 = (class266) arg3;
        int var6 = var5.field3371 + arg2 + 1;
        int var7 = var5.field3366 + arg0 + 1;
        int var8 = this.field6682 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3363;
        int var11 = var5.field3362;
        int var12 = this.field6682 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field6682 * var14;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
        }
        if (arg1 < 17) {
            this.method2861(false, 62, null, -105, 10, -7);
        }
        if ((var7 + var10) >= this.field6696) {
            int var15 = var7 + var10 + 1 - this.field6696;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var12 += var16;
            var6 = 1;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
        }
        if (this.field6682 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field6682;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class329.method1891(var8, this.field6693, var11, var12, var5.field3365, 817, var13, var10, var9);
            this.method2863(var6, var10, var7, var11, (byte) -21);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIB)V")
    private final void method2863(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6687++;
        if (this.field6688 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        if (arg4 != -21) {
            this.field6685 = -40;
        }
        int var7 = arg0 + arg3 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg1 + arg2 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class280[] var11 = this.field6688[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3549 = true;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljaa;Lrk;)V")
    public class530(class576 arg0, class30 arg1) {
        this.field6686 = arg1;
        this.field6683 = arg0;
        this.field6682 = (this.field6686.field1686 * this.field6686.field1685 >> this.field6683.field7592) + 2;
        this.field6696 = (this.field6686.field1686 * this.field6686.field1684 >> this.field6683.field7592) + 2;
        this.field6685 = this.field6683.field7592 + 7 - this.field6686.field1683;
        this.field6693 = new byte[this.field6696 * this.field6682];
        this.field6691 = this.field6686.field1685 >> this.field6685;
        this.field6689 = this.field6686.field1684 >> this.field6685;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILw;II)Z")
    public final boolean method2864(int arg0, class279 arg1, int arg2, int arg3) {
        field6697++;
        class266 var5 = (class266) arg1;
        int var6 = var5.field3371 + arg0 + 1;
        int var7 = var5.field3366 + arg2 + 1;
        int var8 = this.field6682 * var7 + var6;
        int var9 = var5.field3363;
        int var10 = var5.field3362;
        int var11 = this.field6682 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var8 += this.field6682 * var12;
            var7 = 1;
        }
        if (var7 + var9 >= this.field6696) {
            int var13 = var9 + var7 + 1 - this.field6696;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
        }
        if (this.field6682 <= (var6 + var10)) {
            int var15 = var6 - (-var10 - 1) - this.field6682;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            int var16 = -22 / ((47 - arg3) / 51);
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field6682 + var11;
            return class608.method3382(4, var8, var10, var18, this.field6693, var17, var9);
        } else {
            return false;
        }
    }
}
