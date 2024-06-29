import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Lae;")
    private class209 field29;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lmh;")
    private class537 field30;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[B")
    public byte[] field40;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    private int field33;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    private int field38;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lrg;")
    public static class548 field34 = new class548(21, -1);

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lvj;")
    public static class373 field41 = new class373(5, -1);

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Lui;")
    public static class193 field43 = new class193();

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[Lwf;")
    public static class115[] field45 = new class115[100];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[[B")
    public static byte[][] field44;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[[Laj;")
    private class260[][] field23;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    private final void method26(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field32++;
        if (this.field23 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg0 + arg3 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        if (arg1 != -28558) {
            return;
        }
        int var9 = arg4 - (1 - arg2) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class260[] var11 = this.field23[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3350 = true;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIILk;)V")
    public final void method27(byte arg0, int arg1, int arg2, class483 arg3) {
        field24++;
        class343 var5 = (class343) arg3;
        int var6 = var5.field4423 + arg2 + 1;
        int var7 = var5.field4420 + arg1 + 1;
        int var8 = var7 + (this.field36 * var6);
        int var9 = 0;
        int var10 = var5.field4411;
        int var11 = var5.field4418;
        int var12 = this.field36 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += this.field36 * var14;
            var9 += var11 * var14;
        }
        if (this.field26 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field26;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var11 -= var16;
            var13 += var16;
            var7 = 1;
            var12 += var16;
        }
        if (this.field36 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field36;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (arg0 != -37) {
            field43 = null;
        }
        if (var11 > 0 && var10 > 0) {
            class541.method3149(var11, this.field40, var8, var9, var12, var10, var5.field4413, (byte) 110, var13);
            this.method26(var11, -28558, var10, var7, var6);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method28(int arg0) {
        field34 = null;
        field43 = null;
        field44 = null;
        field45 = null;
        field41 = null;
        if (arg0 > -102) {
            field43 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([[ZZIIII)V")
    public final void method29(boolean[][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field37++;
        this.field30.method3106(true, false);
        this.field30.method3101(false, arg5 ^ 0x170A);
        this.field30.method3071(105, -2);
        this.field30.method3063(1, (byte) -107);
        this.field30.method3058((byte) -128, 1);
        float var7 = 1.0F / (float) (this.field30.field7729 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field28; var8++) {
                int var9 = var8 << this.field33;
                int var10 = var8 + 1 << this.field33;
                label132: for (int var11 = 0; var11 < this.field38; var11++) {
                    int var12 = var11 << this.field33;
                    int var13 = var11 + 1 << this.field33;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg3 <= var14 - arg2 && arg3 >= (var14 - arg2)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg4 >= -arg3 && var15 - arg4 <= arg3 && arg0[var14 + arg3 - arg2][var15 + arg3 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field23[var11][var8].method1459(-128);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field28; var16++) {
                int var17 = var16 << this.field33;
                int var18 = var16 + 1 << this.field33;
                for (int var19 = 0; var19 < this.field38; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field33;
                    int var22 = var19 + 1 << this.field33;
                    class385 var23 = this.field30.field7852;
                    var23.field4966 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg4 >= -arg3 && arg3 >= (var24 - arg4)) {
                            int var25 = this.field29.field2116 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg2) >= (-arg3) && var26 - arg2 <= arg3 && arg0[arg3 + var26 - arg2][var24 + arg3 - arg4]) {
                                    short[] var27 = this.field29.field2510[var25];
                                    if (var27 != null) {
                                        if (this.field30.field7754) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2115(var27[var29] & 0xFFFF, 3324);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2097(-985, var27[var28] & 0xFFFF);
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
                        this.field23[var19][var16].method1462(0, var23.field4929, var20, 5123);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(arg5);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILk;II)Z")
    public final boolean method30(int arg0, class483 arg1, int arg2, int arg3) {
        field27++;
        class343 var5 = (class343) arg1;
        if (arg3 != 21608) {
            this.method26(-91, -109, -85, -105, -15);
        }
        int var6 = var5.field4423 + arg0 + 1;
        int var7 = var5.field4420 + arg2 + 1;
        int var8 = this.field36 * var6 + var7;
        int var9 = var5.field4411;
        int var10 = var5.field4418;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var8 += this.field36 * var11;
            var9 -= var11;
        }
        int var12 = this.field36 - var10;
        if (this.field26 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field26;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var12 += var14;
            var8 += var14;
        }
        if (var7 + var10 >= this.field36) {
            int var15 = var7 + var10 + 1 - this.field36;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field36 + var12;
            return class96.method596(this.field40, var10, var16, var9, (byte) -45, var17, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method31(int arg0, short[] arg1, int arg2) {
        field42++;
        int var3 = -80 / ((-arg0 - 8) / 62);
        short[] var4 = new short[arg2];
        class345.method1933(arg1, 0, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method32(int arg0) {
        field35++;
        class512.field7236.method1120(class357.field4693, class565.field8299.field2178 ? class314.field4010 + 256 << 0 : -1, 256);
        if (arg0 != 1) {
            field45 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method33(String arg0, int arg1, byte arg2) {
        if (arg2 != 84) {
            method33(null, 2, (byte) 14);
        }
        field31++;
        class418.method2378(arg2 ^ 0x4614, class558.field8220);
        class418.field5432++;
        class136.field1663.method2093(class88.method528((byte) -75, arg0) + 1, arg2 + -197);
        class136.field1663.method2106(arg2 ^ 0xFFFFFF84, arg0);
        class136.field1663.method2142(false, arg1);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public final void method34(int arg0) {
        field25++;
        this.field23 = new class260[this.field38][this.field28];
        if (arg0 != 31594) {
            return;
        }
        for (int var2 = 0; var2 < this.field28; var2++) {
            for (int var3 = 0; var3 < this.field38; var3++) {
                this.field23[var3][var2] = new class260(this.field30, this, this.field29, var3, var2, this.field33, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lmh;Lae;)V")
    public class5(class537 arg0, class209 arg1) {
        this.field29 = arg1;
        this.field30 = arg0;
        this.field36 = (this.field29.field2116 * this.field29.field2115 >> this.field30.field7732) + 2;
        this.field26 = (this.field29.field2115 * this.field29.field2114 >> this.field30.field7732) + 2;
        this.field40 = new byte[this.field36 * this.field26];
        this.field33 = this.field30.field7732 + 7 - this.field29.field2111;
        this.field38 = this.field29.field2116 >> this.field33;
        this.field28 = this.field29.field2114 >> this.field33;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILk;I)V")
    public final void method35(int arg0, int arg1, class483 arg2, int arg3) {
        field39++;
        class343 var5 = (class343) arg2;
        int var6 = var5.field4423 + arg1 + 1;
        int var7 = var5.field4420 + arg0 + 1;
        int var8 = var7 + (this.field36 * var6);
        if (arg3 != 17479) {
            field43 = null;
        }
        int var9 = 0;
        int var10 = var5.field4411;
        int var11 = var5.field4418;
        int var12 = this.field36 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field36 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (this.field26 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field26;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var13 += var16;
            var8 += var16;
        }
        if (this.field36 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field36;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class373.method2080(var8, var9, (byte) 4, var10, this.field40, var13, var12, var11, var5.field4413);
            this.method26(var11, -28558, var10, var7, var6);
        }
    }
}
