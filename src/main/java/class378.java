import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class378 {

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lhca;")
    private class453 field5047;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Llj;")
    private class565 field5054;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field5045;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "[B")
    public byte[] field5056;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    private int field5040;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "[Ljo;")
    public static class305[] field5057 = new class305[128];

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field5038 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Llh;")
    public static class487 field5048 = new class487(53, -1);

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "F")
    public static float field5050;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "F")
    public static float field5058;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lsea;")
    public static class648 field5060;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[[Lol;")
    private class257[][] field5042;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V", line = 5)
    public static final void method2161(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class706.method3954(var3.field5525);
        class706.method3954(var3.field5529);
        if (var3.field5525 != null) {
            var3.field5525 = null;
        }
        if (var3.field5529 != null) {
            var3.field5529 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZIIII)V", line = 21)
    private final void method2162(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5041++;
        if (arg0) {
            field5050 = 1.3352933F;
        }
        if (this.field5042 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 + arg3 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class257[] var11 = this.field5042[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field3504 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 64)
    public static void method2163(int arg0) {
        field5048 = null;
        if (arg0 < 69) {
            field5057 = null;
        }
        field5060 = null;
        field5057 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILha;BI)V", line = 76)
    public final void method2164(int arg0, class54 arg1, byte arg2, int arg3) {
        field5044++;
        class310 var5 = (class310) arg1;
        int var6 = var5.field4284 + arg0 + 1;
        int var7 = var5.field4289 + arg3 + 1;
        int var8 = this.field5046 * var6 + var7;
        int var9 = 0;
        if (arg2 <= 23) {
            return;
        }
        int var10 = var5.field4281;
        int var11 = var5.field4285;
        int var12 = this.field5046 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field5046 * var14;
            var6 = 1;
        }
        if (this.field5055 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field5055;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
            var9 += var16;
            var8 += var16;
        }
        if (this.field5046 <= (var7 + var11)) {
            int var17 = var7 - this.field5046 - (-var11 - 1);
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class119.method843(var11, var5.field4286, this.field5056, var8, -128, var13, var10, var9, var12);
            this.method2162(false, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZIB[[Z)V", line = 148)
    public final void method2165(int arg0, int arg1, boolean arg2, int arg3, byte arg4, boolean[][] arg5) {
        this.field5054.method3195((byte) 92, false);
        field5051++;
        if (arg4 != 111) {
            this.method2169(null, -48, 83, -74);
        }
        this.field5054.method3213(false, -113);
        this.field5054.method3238(arg4 - 7167, -2);
        this.field5054.method3205(arg4 ^ 0x146C, 1);
        this.field5054.method3237(arg4 + 15904, 1);
        float var7 = 1.0F / (float) (this.field5054.field7831 * 128);
        if (arg2) {
            for (int var8 = 0; var8 < this.field5059; var8++) {
                int var9 = var8 << this.field5045;
                int var10 = var8 + 1 << this.field5045;
                label135: for (int var11 = 0; var11 < this.field5040; var11++) {
                    int var12 = var11 << this.field5045;
                    int var13 = var11 + 1 << this.field5045;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg3) <= (var14 - arg0) && arg3 >= (var14 - arg0)) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg1 >= -arg3 && arg3 >= (var15 - arg1) && arg5[var14 + arg3 - arg0][var15 + arg3 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field5042[var11][var8].method1581((byte) -114);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field5059; var16++) {
                int var17 = var16 << this.field5045;
                int var18 = var16 + 1 << this.field5045;
                for (int var19 = 0; var19 < this.field5040; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field5045;
                    int var22 = var19 + 1 << this.field5045;
                    class340 var23 = this.field5054.field7899;
                    var23.field6892 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg1) >= (-arg3) && arg3 >= (var24 - arg1)) {
                            int var25 = this.field5047.field446 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg0 >= -arg3 && var26 - arg0 <= arg3 && arg5[arg3 + var26 - arg0][arg3 + var24 - arg1]) {
                                    short[] var27 = this.field5047.field6250[var25];
                                    if (var27 != null) {
                                        if (this.field5054.field7921) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2837(var27[var28] & 0xFFFF, arg4 - 113);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2848((byte) -112, var27[var29] & 0xFFFF);
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
                        this.field5042[var19][var16].method1579(var23.field6855, 5123, var20, true);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 333)
    public final void method2166(int arg0) {
        if (arg0 != 128) {
            method2167(-97, null);
        }
        this.field5042 = new class257[this.field5040][this.field5059];
        field5052++;
        for (int var2 = 0; var2 < this.field5059; var2++) {
            for (int var3 = 0; var3 < this.field5040; var3++) {
                this.field5042[var3][var2] = new class257(this.field5054, this, this.field5047, var3, var2, this.field5045, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 364)
    public static final String method2167(int arg0, String arg1) {
        field5043++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (arg0 != 1) {
            field5038 = 97;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lsea;ILsea;[I)V", line = 415)
    public static final void method2168(class648 arg0, int arg1, class648 arg2, int[] arg3) {
        if (arg3 != null) {
            class523.field7103 = arg3;
        }
        field5039++;
        class417.field5891 = arg0;
        if (arg1 != -2) {
            field5058 = -0.41919485F;
        }
        class587.field8255 = arg2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lha;III)Z", line = 440)
    public final boolean method2169(class54 arg0, int arg1, int arg2, int arg3) {
        field5049++;
        class310 var5 = (class310) arg0;
        int var6 = var5.field4284 + arg3 + 1;
        int var7 = var5.field4289 + arg1 + 1;
        int var8 = var7 + (this.field5046 * var6);
        if (arg2 > -44) {
            this.field5042 = null;
        }
        int var9 = var5.field4281;
        int var10 = var5.field4285;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var6 = 1;
            var9 -= var11;
            var8 += this.field5046 * var11;
        }
        int var12 = this.field5046 - var10;
        if (this.field5055 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field5055;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var12 += var14;
            var8 += var14;
        }
        if (var7 + var10 >= this.field5046) {
            int var15 = var7 + var10 - (this.field5046 + -1);
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field5046 + var12;
            return class341.method1995(this.field5056, var17, var9, var10, var8, var16, (byte) -84);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILha;I)V", line = 517)
    public final void method2170(int arg0, int arg1, class54 arg2, int arg3) {
        field5053++;
        class310 var5 = (class310) arg2;
        int var6 = var5.field4284 + arg1 + 1;
        int var7 = var5.field4289 + arg3 + 1;
        int var8 = this.field5046 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4281;
        int var11 = var5.field4285;
        int var12 = -34 % ((-arg0 - 44) / 50);
        int var13 = this.field5046 - var11;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field5046 * var14;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        int var15 = 0;
        if ((var6 + var10) >= this.field5055) {
            int var16 = var6 + var10 + 1 - this.field5055;
            var10 -= var16;
        }
        if (var7 <= 0) {
            int var17 = 1 - var7;
            var11 -= var17;
            var7 = 1;
            var15 += var17;
            var8 += var17;
            var9 += var17;
            var13 += var17;
        }
        if (this.field5046 <= (var7 + var11)) {
            int var18 = var7 + var11 + 1 - this.field5046;
            var11 -= var18;
            var13 += var18;
            var15 += var18;
        }
        if (var11 > 0 && var10 > 0) {
            class227.method1439((byte) -41, var8, this.field5056, var15, var9, var11, var13, var10, var5.field4286);
            this.method2162(false, var6, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Llj;Lhca;)V", line = 586)
    public class378(class565 arg0, class453 arg1) {
        this.field5047 = arg1;
        this.field5054 = arg0;
        this.field5046 = (this.field5047.field446 * this.field5047.field441 >> this.field5054.field7830) + 2;
        this.field5055 = (this.field5047.field441 * this.field5047.field438 >> this.field5054.field7830) + 2;
        this.field5045 = this.field5054.field7830 + 7 - this.field5047.field447;
        this.field5056 = new byte[this.field5055 * this.field5046];
        this.field5040 = this.field5047.field446 >> this.field5045;
        this.field5059 = this.field5047.field438 >> this.field5045;
    }
}
