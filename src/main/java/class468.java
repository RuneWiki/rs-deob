import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class468 {

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Lna;")
    private class211 field7167;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lhk;")
    private class102 field7172;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public int field7162;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    private int field7168;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    private int field7166;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[B")
    public byte[] field7174;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "I")
    private int field7179;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field7165;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field7161 = 0;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "S")
    public static short field7169 = 32767;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Lbi;")
    public static class104 field7173 = new class104(5, 12);

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Lbi;")
    public static class104 field7176 = new class104(96, 6);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "[Lo;")
    public static class139[] field7178;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "[[Lws;")
    private class384[][] field7170;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLi;II)V")
    public final void method2916(byte arg0, class521 arg1, int arg2, int arg3) {
        field7160++;
        class283 var5 = (class283) arg1;
        int var6 = var5.field4466 + arg2 + 1;
        int var7 = var5.field4461 + arg3 + 1;
        int var8 = this.field7162 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4468;
        int var11 = var5.field4465;
        int var12 = this.field7162 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field7162 * var13;
            var9 += var11 * var13;
            var6 = 1;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field7168 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field7168;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
            var7 = 1;
            var14 += var16;
            var8 += var16;
        }
        if (this.field7162 <= (var7 + var11)) {
            int var17 = var11 + var7 + 1 - this.field7162;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class259.method1768(var12, var10, var11, this.field7174, var8, true, var9, var5.field4458, var14);
        this.method2919(var6, var7, var11, var10, 0);
        if (arg0 != -39) {
            this.field7170 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method2917(int arg0) {
        this.field7170 = new class384[this.field7179][this.field7165];
        field7175++;
        for (int var2 = arg0; var2 < this.field7165; var2++) {
            for (int var3 = 0; var3 < this.field7179; var3++) {
                this.field7170[var3][var2] = new class384(this.field7167, this, this.field7172, var3, var2, this.field7166, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public static void method2918(int arg0) {
        field7178 = null;
        field7173 = null;
        field7176 = null;
        if (arg0 != 1) {
            method2923(79);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
    private final void method2919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7177++;
        if (this.field7170 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg2 + arg1 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg3 + arg0 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class384[] var11 = this.field7170[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field5867 = true;
            }
        }
        if (arg4 != 0) {
            this.method2921(null, 36, 2, 112);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZZII[[Z)V")
    public final void method2920(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, boolean[][] arg5) {
        field7159++;
        this.field7167.method1504(false, -2414);
        this.field7167.method1571(false, (byte) -73);
        this.field7167.method1553(-2, arg1);
        if (!arg1) {
            return;
        }
        this.field7167.method1494(1, -25951);
        this.field7167.method1566((byte) 95, 1);
        float var7 = 1.0F / (float) (this.field7167.field3482 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field7165; var8++) {
                int var9 = var8 << this.field7166;
                int var10 = var8 + 1 << this.field7166;
                label135: for (int var11 = 0; var11 < this.field7179; var11++) {
                    int var12 = var11 << this.field7166;
                    int var13 = var11 + 1 << this.field7166;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg3) <= (var14 - arg4) && arg3 >= var14 - arg4) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg3) <= (var15 - arg0) && arg3 >= (var15 - arg0) && arg5[var14 + arg3 - arg4][var15 + arg3 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field7170[var11][var8].method2474(1);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field7165; var16++) {
                int var17 = var16 << this.field7166;
                int var18 = var16 + 1 << this.field7166;
                for (int var19 = 0; var19 < this.field7179; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field7166;
                    int var22 = var19 + 1 << this.field7166;
                    class302 var23 = this.field7167.field3617;
                    var23.field3162 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg0 >= -arg3 && var24 - arg0 <= arg3) {
                            int var25 = this.field7172.field3755 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg4) >= (-arg3) && arg3 >= var26 - arg4 && arg5[var26 + arg3 - arg4][var24 + arg3 - arg0]) {
                                    short[] var27 = this.field7172.field1461[var25];
                                    if (var27 != null) {
                                        if (this.field7167.field3560) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method1437(var27[var29] & 0xFFFF, 0);
                                                var20++;
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method1467((byte) 23, var27[var28] & 0xFFFF);
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
                        this.field7170[var19][var16].method2475(var23.field3193, var20, 5123, 128);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Li;III)V")
    public final void method2921(class521 arg0, int arg1, int arg2, int arg3) {
        field7164++;
        class283 var5 = (class283) arg0;
        int var6 = var5.field4466 + arg2 + 1;
        int var7 = var5.field4461 + arg1 + 1;
        int var8 = this.field7162 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4468;
        int var11 = var5.field4465;
        int var12 = this.field7162 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var6 = 1;
            var8 += this.field7162 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field7168 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field7168;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var7 = 1;
            var14 += var16;
            var8 += var16;
            var12 += var16;
            var11 -= var16;
        }
        if ((var7 + var11) >= this.field7162) {
            int var17 = var7 + var11 + 1 - this.field7162;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class172.method1088(var10, var5.field4458, this.field7174, var9, -1030608414, var14, var12, var8, var11);
            this.method2919(var6, var7, var11, var10, arg3 ^ arg3);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILi;B)Z")
    public final boolean method2922(int arg0, int arg1, class521 arg2, byte arg3) {
        field7171++;
        class283 var5 = (class283) arg2;
        int var6 = 18 % ((arg3 + 54) / 41);
        int var7 = var5.field4466 + arg0 + 1;
        int var8 = var5.field4461 + arg1 + 1;
        int var9 = var8 + (this.field7162 * var7);
        int var10 = var5.field4468;
        int var11 = var5.field4465;
        int var12 = this.field7162 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += this.field7162 * var13;
            var7 = 1;
            var10 -= var13;
        }
        if (this.field7168 <= var7 + var10) {
            int var14 = var10 + var7 + 1 - this.field7168;
            var10 -= var14;
        }
        if (var8 <= 0) {
            int var15 = 1 - var8;
            var8 = 1;
            var11 -= var15;
            var9 += var15;
            var12 += var15;
        }
        if ((var8 + var11) >= this.field7162) {
            int var16 = var11 + var8 + 1 - this.field7162;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field7162 + var12;
            return class302.method2033(var9, var17, var10, this.field7174, var18, 1671601056, var11);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public static final void method2923(int arg0) {
        field7163++;
        class198.method1361((byte) -52);
        class471.method2930(22050, 2, class141.field1911.field6122, -16919);
        class119.field1631 = class4.method43(0, 22050, class339.field5294, class320.field4980, -3869);
        class119.field1631.method1800(class332.field5191, 13845);
        class164.field2370 = class4.method43(arg0, 2048, class339.field5294, class320.field4980, -3869);
        class164.field2370.method1800(class411.field6231, 13845);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lna;Lhk;)V")
    public class468(class211 arg0, class102 arg1) {
        this.field7167 = arg0;
        this.field7172 = arg1;
        this.field7162 = (this.field7172.field3755 * this.field7172.field3754 >> this.field7167.field3483) + 2;
        this.field7168 = (this.field7172.field3754 * this.field7172.field3752 >> this.field7167.field3483) + 2;
        this.field7166 = this.field7167.field3483 + 7 - this.field7172.field3753;
        this.field7174 = new byte[this.field7168 * this.field7162];
        this.field7179 = this.field7172.field3755 >> this.field7166;
        this.field7165 = this.field7172.field3752 >> this.field7166;
    }
}
