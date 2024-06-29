import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class460 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Ler;")
    private class92 field6878;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Ltv;")
    private class521 field6884;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field6893;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "[B")
    public byte[] field6888;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    private int field6886;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    private int field6879;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "[[Llba;")
    private class510[][] field6890;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)I")
    public static final int method2879(int arg0, int arg1, int arg2) {
        field6892++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 > -27) {
            return 55;
        } else if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    private final void method2880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6880++;
        if (this.field6890 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg0 + arg4 - 1 - 1 >> 7;
        if (arg1 != 0) {
            this.method2880(-125, -27, 51, 30, -122);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class510[] var11 = this.field6890[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7446 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZIILha;)V")
    public final void method2881(boolean arg0, int arg1, int arg2, class54 arg3) {
        field6889++;
        class156 var5 = (class156) arg3;
        int var6 = var5.field2668 + arg1 + 1;
        int var7 = var5.field2670 + arg2 + 1;
        if (arg0) {
            return;
        }
        int var8 = this.field6893 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field2675;
        int var11 = var5.field2679;
        int var12 = this.field6893 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
            var8 += this.field6893 * var14;
        }
        if (this.field6883 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field6883;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var11 -= var16;
        }
        if (var7 + var11 >= this.field6893) {
            int var17 = var7 + var11 + 1 - this.field6893;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class75.method752(var9, var8, var11, var12, var5.field2673, this.field6888, var10, var13, 0);
            this.method2880(var10, 0, var11, var7, var6);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method2882(int arg0) {
        this.field6890 = new class510[this.field6886][this.field6879];
        field6881++;
        int var2 = 0;
        if (arg0 != 128) {
            return;
        }
        while (var2 < this.field6879) {
            for (int var3 = 0; var3 < this.field6886; var3++) {
                this.field6890[var3][var2] = new class510(this.field6878, this, this.field6884, var3, var2, this.field6887, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIB[[ZI)V")
    public final void method2883(int arg0, boolean arg1, int arg2, byte arg3, boolean[][] arg4, int arg5) {
        this.field6878.method866(false, -8);
        field6885++;
        this.field6878.method877(false, -32);
        this.field6878.method887(2, -2);
        int var7 = -58 / ((arg3 + 45) / 63);
        this.field6878.method816(1, -116);
        this.field6878.method889(77, 1);
        float var8 = 1.0F / (float) (this.field6878.field1324 * 128);
        if (arg1) {
            for (int var23 = 0; var23 < this.field6879; var23++) {
                int var24 = var23 << this.field6887;
                int var25 = var23 + 1 << this.field6887;
                label85: for (int var26 = 0; var26 < this.field6886; var26++) {
                    int var27 = var26 << this.field6887;
                    int var28 = var26 + 1 << this.field6887;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg0) >= (-arg5) && (var29 - arg0) <= arg5) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (var30 - arg2 >= -arg5 && arg5 >= var30 - arg2 && arg4[arg5 + var29 - arg0][arg5 + var30 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6890[var26][var23].method3093(0);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6879; var9++) {
                int var10 = var9 << this.field6887;
                int var11 = var9 + 1 << this.field6887;
                for (int var12 = 0; var12 < this.field6886; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6887;
                    int var15 = var12 + 1 << this.field6887;
                    class148 var16 = this.field6878.field1468;
                    var16.field57 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (var17 - arg2 >= -arg5 && arg5 >= var17 - arg2) {
                            int var18 = this.field6884.field510 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (var19 - arg0 >= -arg5 && arg5 >= var19 - arg0 && arg4[var19 + arg5 - arg0][var17 + arg5 - arg2]) {
                                    short[] var20 = this.field6884.field7541[var18];
                                    if (var20 != null) {
                                        if (this.field6878.field1410) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method25(true, var20[var21] & 0xFFFF);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method49(-1060492440, var20[var22] & 0xFFFF);
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var8, var8, 1.0F);
                        OpenGL.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6890[var12][var9].method3096(var13, var16.field96, 5123, false);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ler;Ltv;)V")
    public class460(class92 arg0, class521 arg1) {
        this.field6878 = arg0;
        this.field6884 = arg1;
        this.field6893 = (this.field6884.field516 * this.field6884.field510 >> this.field6878.field1328) + 2;
        this.field6883 = (this.field6884.field516 * this.field6884.field513 >> this.field6878.field1328) + 2;
        this.field6888 = new byte[this.field6893 * this.field6883];
        this.field6887 = this.field6878.field1328 + 7 - this.field6884.field515;
        this.field6886 = this.field6884.field510 >> this.field6887;
        this.field6879 = this.field6884.field513 >> this.field6887;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lha;IBI)V")
    public final void method2884(class54 arg0, int arg1, byte arg2, int arg3) {
        field6882++;
        class156 var5 = (class156) arg0;
        int var6 = var5.field2670 + arg3 + 1;
        if (arg2 < 9) {
            this.method2882(59);
        }
        int var7 = var5.field2668 + arg1 + 1;
        int var8 = this.field6893 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2675;
        int var11 = var5.field2679;
        int var12 = this.field6893 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field6893 * var13;
            var9 += var11 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (this.field6883 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field6883;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var9 += var16;
            var14 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field6893) {
            int var17 = var6 + var11 + 1 - this.field6893;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class682.method3883(var5.field2673, var10, var9, var14, var12, var11, this.field6888, 22794, var8);
            this.method2880(var10, 0, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method2885(int arg0, int arg1, class54 arg2, int arg3) {
        field6891++;
        class156 var5 = (class156) arg2;
        int var6 = var5.field2670 + arg3 + 1;
        int var7 = var5.field2668 + arg0 + 1;
        int var8 = this.field6893 * var7 + var6;
        int var9 = var5.field2675;
        int var10 = var5.field2679;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field6893 * var11;
        }
        int var12 = this.field6893 - var10;
        if (this.field6883 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field6883;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var12 += var14;
            var10 -= var14;
        }
        if ((var6 + var10) >= this.field6893) {
            int var15 = var6 + var10 + 1 - this.field6893;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - arg1) * this.field6893 + var12;
            return class475.method2947((byte) 102, this.field6888, var17, var9, var8, var16, var10);
        } else {
            return false;
        }
    }
}
