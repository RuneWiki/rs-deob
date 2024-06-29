import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class416 {

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "Lqo;")
    private class22 field6015;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "Led;")
    private class704 field6021;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
    public int field6023;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
    private int field6011;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    private int field6012;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "[B")
    public byte[] field6016;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    private int field6017;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
    private int field6024;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "Lsd;")
    public static class95 field6019 = new class95();

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "[I")
    public static int[] field6025 = new int[1];

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "Lin;")
    public static class91 field6026;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "[[Lsm;")
    private class285[][] field6022;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lr;III)V", line = 3)
    public final void method2562(class184 arg0, int arg1, int arg2, int arg3) {
        field6018++;
        class28 var5 = (class28) arg0;
        int var6 = var5.field754 + arg1 + 1;
        int var7 = var5.field749 + arg2 + 1;
        int var8 = this.field6023 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field752;
        int var11 = var5.field747;
        int var12 = this.field6023 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
            var8 += this.field6023 * var14;
        }
        if (this.field6011 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field6011;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
            var13 += var16;
            var9 += var16;
        }
        if (this.field6023 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field6023;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        int var18 = 101 / ((-arg3 - 30) / 62);
        if (var11 > 0 && var10 > 0) {
            class295.method1929(var9, this.field6016, var10, var8, var12, var13, var5.field751, var11, (byte) 121);
            this.method2563(var10, var11, var6, -1, var7);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V", line = 77)
    private final void method2563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6028++;
        if (this.field6022 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg1 - 1 - 1 >> 7;
        int var8 = arg3 + arg4 >> 7;
        int var9 = arg0 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class285[] var11 = this.field6022[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3983 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V", line = 119)
    public static void method2564(byte arg0) {
        field6025 = null;
        field6026 = null;
        field6019 = null;
        if (arg0 != 9) {
            field6019 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBILr;)Z", line = 131)
    public final boolean method2565(int arg0, byte arg1, int arg2, class184 arg3) {
        field6029++;
        class28 var5 = (class28) arg3;
        int var6 = var5.field749 + arg2 + 1;
        if (arg1 != 88) {
            this.field6022 = null;
        }
        int var7 = var5.field754 + arg0 + 1;
        int var8 = this.field6023 * var6 + var7;
        int var9 = var5.field752;
        int var10 = var5.field747;
        int var11 = this.field6023 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field6023 * var12;
        }
        if (this.field6011 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field6011;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var8 += var14;
            var11 += var14;
            var7 = 1;
        }
        if (this.field6023 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field6023;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6023 + var11;
            return class241.method1670(var17, var9, (byte) 112, var16, var10, var8, this.field6016);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)Z", line = 206)
    public static final boolean method2566(int arg0, int arg1) {
        if (arg0 != 22311) {
            field6019 = null;
        }
        field6014++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI[[ZIII)V", line = 217)
    public final void method2567(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        this.field6015.method173(false, 114);
        int var7 = 80 / ((arg1 - 15) / 60);
        field6013++;
        this.field6015.method205(0, false);
        this.field6015.method229(-2, -119);
        this.field6015.method237(0, 1);
        this.field6015.method222(1, 1);
        float var8 = 1.0F / (float) (this.field6015.field555 * 128);
        if (arg0) {
            for (int var23 = 0; var23 < this.field6024; var23++) {
                int var24 = var23 << this.field6012;
                int var25 = var23 + 1 << this.field6012;
                label85: for (int var26 = 0; var26 < this.field6017; var26++) {
                    int var27 = var26 << this.field6012;
                    int var28 = var26 + 1 << this.field6012;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((var29 - arg5) >= (-arg3) && arg3 >= var29 - arg5) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if (-arg3 <= var30 - arg4 && var30 - arg4 <= arg3 && arg2[arg3 + var29 - arg5][arg3 + var30 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6022[var26][var23].method1865((byte) -121);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6024; var9++) {
                int var10 = var9 << this.field6012;
                int var11 = var9 + 1 << this.field6012;
                for (int var12 = 0; var12 < this.field6017; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6012;
                    int var15 = var12 + 1 << this.field6012;
                    class548 var16 = this.field6015.field620;
                    var16.field3109 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if ((var17 - arg4) >= (-arg3) && var17 - arg4 <= arg3) {
                            int var18 = this.field6021.field3937 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if ((var19 - arg5) >= (-arg3) && var19 - arg5 <= arg3 && arg2[arg3 + var19 - arg5][arg3 + var17 - arg4]) {
                                    short[] var20 = this.field6021.field9524[var18];
                                    if (var20 != null) {
                                        if (this.field6015.field597) {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method1485((byte) 107, var20[var22] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method1545(111, var20[var21] & 0xFFFF);
                                                var13++;
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
                        this.field6022[var12][var9].method1864(var16.field3066, 5123, var13, (byte) 70);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 403)
    public final void method2568(int arg0) {
        field6027++;
        this.field6022 = new class285[this.field6017][this.field6024];
        for (int var2 = arg0; var2 < this.field6024; var2++) {
            for (int var3 = 0; var3 < this.field6017; var3++) {
                this.field6022[var3][var2] = new class285(this.field6015, this, this.field6021, var3, var2, this.field6012, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZILd;ILjava/awt/Canvas;Lin;)Lha;", line = 430)
    public static final class59 method2569(boolean arg0, int arg1, class152 arg2, int arg3, Canvas arg4, class91 arg5) {
        if (!arg0) {
            field6019 = null;
        }
        field6009++;
        int var6 = 0;
        int var7 = 0;
        if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class59.method628(arg3, var7, var6, arg5, 0, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIBLr;)V", line = 455)
    public final void method2570(int arg0, int arg1, byte arg2, class184 arg3) {
        field6020++;
        class28 var5 = (class28) arg3;
        int var6 = var5.field749 + arg1 + 1;
        int var7 = var5.field754 + arg0 + 1;
        int var8 = this.field6023 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field752;
        int var11 = var5.field747;
        if (arg2 < 67) {
            this.method2568(-40);
        }
        int var12 = this.field6023 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var10 -= var13;
            var6 = 1;
            var8 += this.field6023 * var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field6011) {
            int var15 = var6 + var10 + 1 - this.field6011;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var8 += var16;
            var7 = 1;
            var14 += var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field6023 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field6023;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class103.method950(var14, var9, 256, var5.field751, var11, this.field6016, var10, var8, var12);
            this.method2563(var10, var11, var7, -1, var6);
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)V", line = 527)
    public static final void method2571(int arg0) {
        class266.field3769.method110(-128);
        field6010++;
        class539.field7455 = null;
        class326.field4513 = arg0;
        class37.field915 = null;
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lqo;Led;)V", line = 540)
    public class416(class22 arg0, class704 arg1) {
        this.field6015 = arg0;
        this.field6021 = arg1;
        this.field6023 = (this.field6021.field3942 * this.field6021.field3937 >> this.field6015.field553) + 2;
        this.field6011 = (this.field6021.field3942 * this.field6021.field3940 >> this.field6015.field553) + 2;
        this.field6012 = this.field6015.field553 + 7 - this.field6021.field3938;
        this.field6016 = new byte[this.field6023 * this.field6011];
        this.field6017 = this.field6021.field3937 >> this.field6012;
        this.field6024 = this.field6021.field3940 >> this.field6012;
    }
}
