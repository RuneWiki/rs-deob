import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class283 {

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "Lmh;")
    private class634 field4014;

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "Lwh;")
    private class148 field4028;

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
    private int field4019;

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "[B")
    public byte[] field4020;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
    private int field4025;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    private int field4013;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
    public static int field4021 = 16777215;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!wha", name = "g", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "[[Llg;")
    private class414[][] field4017;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIB)V", line = 3)
    private final void method1809(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4027++;
        if (this.field4017 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg0 - 1 - 1 >> 7;
        if (arg4 != 87) {
            return;
        }
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class414[] var11 = this.field4017[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6228 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Lr;III)V", line = 43)
    public final void method1810(class183 arg0, int arg1, int arg2, int arg3) {
        field4026++;
        class265 var5 = (class265) arg0;
        int var6 = var5.field3791 + arg3 + 1;
        int var7 = var5.field3792 + arg2 + 1;
        int var8 = this.field4015 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3790;
        int var11 = var5.field3787;
        int var12 = this.field4015 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var8 += this.field4015 * var13;
            var10 -= var13;
        }
        int var14 = arg1;
        if (this.field4019 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field4019;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var14 = arg1 + var16;
            var7 = 1;
            var8 += var16;
            var9 += var16;
            var12 += var16;
        }
        if (this.field4015 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field4015;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class187.method1309(this.field4020, var12, var11, var8, var9, true, var10, var14, var5.field3793);
            this.method1809(var11, var6, var7, var10, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(Lr;III)V", line = 116)
    public final void method1811(class183 arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 63) {
            this.field4016 = 42;
        }
        field4024++;
        class265 var5 = (class265) arg0;
        int var6 = var5.field3792 + arg2 + 1;
        int var7 = var5.field3791 + arg1 + 1;
        int var8 = this.field4015 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3790;
        int var11 = var5.field3787;
        int var12 = this.field4015 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field4015 * var14;
            var7 = 1;
        }
        if (this.field4019 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field4019;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var11 -= var16;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
        }
        if (var6 + var11 >= this.field4015) {
            int var17 = var6 + var11 + 1 - this.field4015;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class594.method3467(this.field4020, var5.field3793, var13, var10, var9, var8, var12, 0, var11);
            this.method1809(var11, var7, var6, var10, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 187)
    public static final boolean method1812(byte arg0, String arg1) {
        if (arg0 > -97) {
            return false;
        } else {
            field4012++;
            return class445.field6614.containsKey(arg1);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IILr;I)Z", line = 198)
    public final boolean method1813(int arg0, int arg1, class183 arg2, int arg3) {
        field4018++;
        class265 var5 = (class265) arg2;
        int var6 = var5.field3791 + arg3 + 1;
        int var7 = var5.field3792 + arg1 + 1;
        int var8 = this.field4015 * var6 + var7;
        int var9 = var5.field3790;
        int var10 = -50 % ((arg0 + 83) / 36);
        int var11 = var5.field3787;
        int var12 = this.field4015 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 -= var13;
            var8 += this.field4015 * var13;
            var6 = 1;
        }
        if (var6 + var9 >= this.field4019) {
            int var14 = var9 + var6 + 1 - this.field4019;
            var9 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var12 += var15;
            var11 -= var15;
            var8 += var15;
            var7 = 1;
        }
        if (var7 + var11 >= this.field4015) {
            int var16 = var7 + var11 + 1 - this.field4015;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field4015 + var12;
            return class302.method1908(var18, var17, this.field4020, var11, var9, var8, 50);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(III[[ZZI)V", line = 272)
    public final void method1814(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        if (arg2 <= 11) {
            method1812((byte) 111, null);
        }
        field4023++;
        this.field4028.method1089(false, 116);
        this.field4028.method1027(false, true);
        this.field4028.method1058(-2, 87);
        this.field4028.method1066(1, 260);
        this.field4028.method1039(false, 1);
        float var7 = 1.0F / (float) (this.field4028.field2168 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field4016; var22++) {
                int var23 = var22 << this.field4025;
                int var24 = var22 + 1 << this.field4025;
                label88: for (int var25 = 0; var25 < this.field4013; var25++) {
                    int var26 = var25 << this.field4025;
                    int var27 = var25 + 1 << this.field4025;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (-arg0 <= var28 - arg1 && var28 - arg1 <= arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if ((-arg0) <= (var29 - arg5) && arg0 >= (var29 - arg5) && arg3[arg0 + var28 - arg1][var29 - (arg5 - arg0)]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4017[var25][var22].method2625(true);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4016; var8++) {
                int var9 = var8 << this.field4025;
                int var10 = var8 + 1 << this.field4025;
                for (int var11 = 0; var11 < this.field4013; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field4025;
                    int var14 = var11 + 1 << this.field4025;
                    class699 var15 = this.field4028.field2313;
                    var15.field9084 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg0 <= var16 - arg5 && arg0 >= var16 - arg5) {
                            int var17 = this.field4014.field3963 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((var18 - arg1) >= (-arg0) && arg0 >= var18 - arg1 && arg3[arg0 + var18 - arg1][arg0 + var16 - arg5]) {
                                    short[] var19 = this.field4014.field8889[var17];
                                    if (var19 != null) {
                                        if (this.field4028.field2211) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method3702(var19[var21] & 0xFFFF, (byte) -110);
                                                var12++;
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method3758(var19[var20] & 0xFFFF, 1394247496);
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
                        this.field4017[var11][var8].method2623((byte) 91, 5123, var12, var15.field9068);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V", line = 462)
    public final void method1815(byte arg0) {
        if (arg0 != -43) {
            this.field4028 = null;
        }
        field4022++;
        this.field4017 = new class414[this.field4013][this.field4016];
        for (int var2 = 0; var2 < this.field4016; var2++) {
            for (int var3 = 0; var3 < this.field4013; var3++) {
                this.field4017[var3][var2] = new class414(this.field4028, this, this.field4014, var3, var2, this.field4025, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lwh;Lmh;)V", line = 492)
    public class283(class148 arg0, class634 arg1) {
        this.field4014 = arg1;
        this.field4028 = arg0;
        this.field4015 = (this.field4014.field3965 * this.field4014.field3963 >> this.field4028.field2171) + 2;
        this.field4019 = (this.field4014.field3965 * this.field4014.field3962 >> this.field4028.field2171) + 2;
        this.field4020 = new byte[this.field4019 * this.field4015];
        this.field4025 = this.field4028.field2171 + 7 - this.field4014.field3955;
        this.field4013 = this.field4014.field3963 >> this.field4025;
        this.field4016 = this.field4014.field3962 >> this.field4025;
    }
}
