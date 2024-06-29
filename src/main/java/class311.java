import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class311 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lfd;")
    private class365 field4425;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Loq;")
    private class240 field4437;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private int field4424;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    private int field4434;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[B")
    public byte[] field4426;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    private int field4435;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lsl;")
    public static class318 field4427 = new class318(20, 8);

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4438 = 0;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Z")
    public static boolean field4441 = false;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lbg;")
    public static class324 field4440 = new class324(88, -1);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lek;")
    public static class349 field4442;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[[Lkh;")
    private class13[][] field4429;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLba;II)Z")
    public final boolean method1934(byte arg0, class263 arg1, int arg2, int arg3) {
        field4436++;
        class80 var5 = (class80) arg1;
        if (arg0 != -128) {
            method1940(111);
        }
        int var6 = var5.field1071 + arg3 + 1;
        int var7 = var5.field1069 + arg2 + 1;
        int var8 = this.field4432 * var7 + var6;
        int var9 = var5.field1066;
        int var10 = var5.field1073;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var9 -= var11;
            var8 += this.field4432 * var11;
        }
        int var12 = this.field4432 - var10;
        if (var7 + var9 >= this.field4424) {
            int var13 = var7 + var9 + 1 - this.field4424;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var12 += var14;
            var8 += var14;
            var10 -= var14;
            var6 = 1;
        }
        if ((var6 + var10) >= this.field4432) {
            int var15 = var6 + var10 + 1 - this.field4432;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4432 + var12;
            return class111.method906(var16, var8, var10, -120, this.field4426, var17, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII[[ZIZ)V")
    public final void method1935(boolean arg0, int arg1, int arg2, boolean[][] arg3, int arg4, boolean arg5) {
        field4430++;
        this.field4425.method2189(false, 90);
        this.field4425.method2194(-32, false);
        this.field4425.method2240(arg5, -2);
        this.field4425.method2183(7681, 1);
        this.field4425.method2241(119, 1);
        float var7 = 1.0F / (float) (this.field4425.field5304 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field4431; var8++) {
                int var9 = var8 << this.field4434;
                int var10 = var8 + 1 << this.field4434;
                label132: for (int var11 = 0; var11 < this.field4435; var11++) {
                    int var12 = var11 << this.field4434;
                    int var13 = var11 + 1 << this.field4434;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg2) >= (-arg4) && arg4 >= (var14 - arg2)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (-arg4 <= var15 - arg1 && arg4 >= var15 - arg1 && arg3[var14 + arg4 - arg2][var15 + arg4 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4429[var11][var8].method86((byte) -33);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4431; var16++) {
                int var17 = var16 << this.field4434;
                int var18 = var16 + 1 << this.field4434;
                for (int var19 = 0; var19 < this.field4435; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4434;
                    int var22 = var19 + 1 << this.field4434;
                    class65 var23 = class132.field1913;
                    var23.field827 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg1) >= (-arg4) && arg4 >= var24 - arg1) {
                            int var25 = this.field4437.field2007 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((-arg4) <= (var26 - arg2) && arg4 >= (var26 - arg2) && arg3[var26 + arg4 - arg2][arg4 + var24 - arg1]) {
                                    short[] var27 = this.field4437.field3547[var25];
                                    if (var27 != null) {
                                        if (this.field4425.field5443) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method611((byte) 67, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method628((byte) -74, var27[var28] & 0xFFFF);
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
                        this.field4429[var19][var16].method87((byte) 43, var23.field783, 5123, var20);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
    private final void method1936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4423++;
        if (this.field4429 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class13[] var11 = this.field4429[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field152 = true;
            }
        }
        if (arg2 <= 97) {
            this.method1935(true, 103, -57, null, 109, true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method1937(int arg0) {
        this.field4429 = new class13[this.field4435][this.field4431];
        if (arg0 != -1) {
            this.method1934((byte) -121, null, -60, -97);
        }
        field4428++;
        for (int var2 = 0; var2 < this.field4431; var2++) {
            for (int var3 = 0; var3 < this.field4435; var3++) {
                this.field4429[var3][var2] = new class13(this.field4425, this, this.field4437, var3, var2, this.field4434, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILba;B)V")
    public final void method1938(int arg0, int arg1, class263 arg2, byte arg3) {
        field4439++;
        class80 var5 = (class80) arg2;
        int var6 = var5.field1069 + arg0 + 1;
        int var7 = var5.field1071 + arg1 + 1;
        int var8 = this.field4432 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field1066;
        int var11 = var5.field1073;
        int var12 = this.field4432 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var9 += var11 * var13;
            var8 += this.field4432 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (var6 + var10 >= this.field4424) {
            int var15 = var6 + var10 + 1 - this.field4424;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var7 = 1;
            var9 += var16;
        }
        if ((var7 + var11) >= this.field4432) {
            int var17 = var11 + var7 + 1 - this.field4432;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class274.method1767(var8, var5.field1072, var12, this.field4426, var9, var11, var14, (byte) -112, var10);
        if (arg3 != 57) {
            this.method1935(false, 51, 76, null, -92, true);
        }
        this.method1936(var11, var7, arg3 ^ 0x45, var6, var10);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILba;)V")
    public final void method1939(int arg0, int arg1, int arg2, class263 arg3) {
        field4433++;
        class80 var5 = (class80) arg3;
        int var6 = var5.field1071 + arg2 + 1;
        int var7 = var5.field1069 + arg1 + 1;
        int var8 = var6 + (this.field4432 * var7);
        int var9 = 0;
        int var10 = var5.field1066;
        int var11 = var5.field1073;
        int var12 = this.field4432 - var11;
        if (arg0 >= -23) {
            this.method1935(true, 80, 63, null, 97, false);
        }
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
            var8 += this.field4432 * var13;
        }
        int var14 = 0;
        if (this.field4424 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field4424;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var6 = 1;
            var12 += var16;
            var14 += var16;
            var9 += var16;
            var8 += var16;
        }
        if (this.field4432 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field4432;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class392.method2405(var10, var8, this.field4426, var11, var9, var14, -1, var12, var5.field1072);
            this.method1936(var11, var6, 99, var7, var10);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1940(int arg0) {
        int var1 = 28 % ((arg0 + 76) / 36);
        field4427 = null;
        field4442 = null;
        field4440 = null;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lfd;Loq;)V")
    public class311(class365 arg0, class240 arg1) {
        this.field4425 = arg0;
        this.field4437 = arg1;
        this.field4432 = (this.field4437.field2007 * this.field4437.field2006 >> this.field4425.field5307) + 2;
        this.field4424 = (this.field4437.field2006 * this.field4437.field2003 >> this.field4425.field5307) + 2;
        this.field4434 = this.field4425.field5307 + 7 - this.field4437.field2001;
        this.field4426 = new byte[this.field4432 * this.field4424];
        this.field4435 = this.field4437.field2007 >> this.field4434;
        this.field4431 = this.field4437.field2003 >> this.field4434;
    }
}
