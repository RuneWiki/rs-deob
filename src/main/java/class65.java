import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class65 extends class631 {

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field911 = -1;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "F")
    public float field905;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "F")
    public float field906;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "F")
    public float field913;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "F")
    public float field914;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "F")
    public float field915;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "F")
    public float field916;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "F")
    public float field921;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "F")
    public float field925;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "F")
    public float field927;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "F")
    public float field935;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "F")
    public float field936;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "F")
    public float field937;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 6)
    public final void method590(int arg0) {
        field931++;
        this.field915 = 1.0F;
        this.field925 = this.field913 = class303.field3964[arg0 & 0x3FFF];
        this.field935 = class303.field3966[arg0 & 0x3FFF];
        this.field936 = this.field916 = this.field914 = this.field937 = this.field921 = this.field905 = this.field927 = 0.0F;
        this.field906 = -this.field935;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(FIFIIIF)V", line = 19)
    public final void method591(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6) {
        if (arg1 == 0) {
            this.field937 = this.field905 = this.field936 = this.field935 = this.field916 = this.field906 = 0.0F;
            this.field915 = arg3;
            this.field913 = 1.0F;
            this.field925 = arg4;
        } else {
            float var8 = class303.field3964[arg1 & 0x3FFF];
            float var9 = class303.field3966[arg1 & 0x3FFF];
            this.field936 = (float) arg4 * -var9;
            this.field913 = 1.0F;
            this.field925 = (float) arg4 * var8;
            this.field915 = (float) arg3 * var8;
            this.field937 = (float) arg3 * var9;
            this.field905 = this.field935 = this.field916 = this.field906 = 0.0F;
        }
        field909++;
        this.field927 = arg0;
        this.field914 = arg6;
        this.field921 = arg2;
        if (arg5 != 16383) {
            this.method602(32, null);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIII)V", line = 56)
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field902++;
        float var7 = class303.field3964[arg3 & 0x3FFF];
        float var8 = class303.field3966[arg3 & 0x3FFF];
        float var9 = class303.field3964[arg4 & 0x3FFF];
        float var10 = class303.field3966[arg4 & 0x3FFF];
        float var11 = class303.field3964[arg5 & 0x3FFF];
        float var12 = class303.field3966[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field925 = var7 * var11;
        this.field906 = var9 * var13 + var10 * var12;
        this.field916 = -var10 * var11 + var9 * var14;
        this.field937 = -var9 * var12 + var10 * var13;
        this.field913 = var7 * var9;
        this.field935 = -var8;
        this.field936 = var7 * var12;
        this.field915 = var9 * var11 + var10 * var14;
        this.field905 = var7 * var10;
        this.field921 = (float) (-arg0) * this.field937 - (float) arg1 * this.field925 - ((float) arg2 * this.field906);
        this.field927 = (float) (-arg0) * this.field905 - ((float) arg1 * this.field935) - ((float) arg2 * this.field913);
        this.field914 = (float) (-arg0) * this.field915 - ((float) arg1 * this.field936) - ((float) arg2 * this.field916);
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(III[I)V", line = 94)
    public final void method593(int arg0, int arg1, int arg2, int[] arg3) {
        field912++;
        arg3[0] = (int) ((float) arg2 * this.field916 + (float) arg0 * this.field915 + (float) arg1 * this.field936);
        arg3[2] = (int) ((float) arg2 * this.field913 + (float) arg0 * this.field905 + (float) arg1 * this.field935);
        arg3[1] = (int) ((float) arg2 * this.field906 + (float) arg0 * this.field937 + (float) arg1 * this.field925);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 107)
    public final void method594(int arg0) {
        field926++;
        float var2 = class303.field3964[arg0 & 0x3FFF];
        float var3 = class303.field3966[arg0 & 0x3FFF];
        float var4 = this.field915;
        float var5 = this.field936;
        float var6 = this.field916;
        float var7 = this.field914;
        this.field915 = this.field905 * var3 + var2 * var4;
        this.field905 = this.field905 * var2 - (var3 * var4);
        this.field936 = this.field935 * var3 + var2 * var5;
        this.field935 = this.field935 * var2 - var3 * var5;
        this.field916 = this.field913 * var3 + var2 * var6;
        this.field913 = this.field913 * var2 - var3 * var6;
        this.field914 = this.field927 * var3 + var2 * var7;
        this.field927 = this.field927 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V", line = 135)
    public final void method595() {
        this.field915 = this.field925 = this.field913 = 1.0F;
        this.field937 = this.field905 = this.field936 = this.field935 = this.field916 = this.field906 = this.field914 = this.field921 = this.field927 = 0.0F;
        field933++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V", line = 144)
    public final void method596(int arg0, int arg1, int arg2) {
        this.field915 = this.field925 = this.field913 = 1.0F;
        this.field914 = arg0;
        field919++;
        this.field921 = arg1;
        this.field937 = this.field905 = this.field936 = this.field935 = this.field916 = this.field906 = 0.0F;
        this.field927 = arg2;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)V", line = 158)
    public final void method597(int[] arg0) {
        field928++;
        float var2 = (float) arg0[0] - this.field914;
        float var3 = (float) arg0[1] - this.field921;
        float var4 = (float) arg0[2] - this.field927;
        arg0[2] = (int) (this.field913 * var4 + this.field916 * var2 + this.field906 * var3);
        arg0[1] = (int) (this.field935 * var4 + this.field936 * var2 + this.field925 * var3);
        arg0[0] = (int) (this.field905 * var4 + this.field937 * var3 + this.field915 * var2);
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 184)
    public final void method598(int arg0) {
        field907++;
        this.field925 = 1.0F;
        this.field915 = this.field913 = class303.field3964[arg0 & 0x3FFF];
        this.field916 = class303.field3966[arg0 & 0x3FFF];
        this.field936 = this.field914 = this.field937 = this.field906 = this.field921 = this.field935 = this.field927 = 0.0F;
        this.field905 = -this.field916;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III[I)V", line = 196)
    public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field914);
        int var6 = (int) ((float) arg2 - this.field927);
        field929++;
        int var7 = (int) ((float) arg1 - this.field921);
        arg3[0] = (int) ((float) var6 * this.field905 + (float) var5 * this.field915 + (float) var7 * this.field937);
        arg3[2] = (int) ((float) var6 * this.field913 + (float) var5 * this.field916 + (float) var7 * this.field906);
        arg3[1] = (int) ((float) var6 * this.field935 + (float) var5 * this.field936 + (float) var7 * this.field925);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)V", line = 209)
    public final void method600(int arg0, int arg1, int arg2) {
        this.field921 += arg1;
        this.field914 += arg0;
        field934++;
        this.field927 += arg2;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 220)
    public final void method601(int arg0) {
        field908++;
        float var2 = class303.field3964[arg0 & 0x3FFF];
        float var3 = class303.field3966[arg0 & 0x3FFF];
        float var4 = this.field937;
        float var5 = this.field925;
        float var6 = this.field906;
        float var7 = this.field921;
        this.field937 = var2 * var4 - (this.field905 * var3);
        this.field925 = var2 * var5 - this.field935 * var3;
        this.field905 = this.field905 * var2 + var3 * var4;
        this.field935 = this.field935 * var2 + var3 * var5;
        this.field906 = var2 * var6 - this.field913 * var3;
        this.field921 = var2 * var7 - (this.field927 * var3);
        this.field913 = this.field913 * var2 + var3 * var6;
        this.field927 = this.field927 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILpda;)V", line = 248)
    public final void method602(int arg0, class631 arg1) {
        field932++;
        class65 var3 = (class65) arg1;
        this.field916 = var3.field905;
        this.field915 = var3.field915;
        this.field936 = var3.field937;
        if (arg0 != 16383) {
            this.field937 = 0.41614938F;
        }
        this.field925 = var3.field925;
        this.field905 = var3.field916;
        this.field906 = var3.field935;
        this.field937 = var3.field936;
        this.field935 = var3.field906;
        this.field913 = var3.field913;
        this.field914 = -(this.field916 * var3.field927 + this.field936 * var3.field921 + this.field915 * var3.field914);
        this.field921 = -(this.field906 * var3.field927 + this.field937 * var3.field914 + this.field925 * var3.field921);
        this.field927 = -(this.field913 * var3.field927 + this.field935 * var3.field921 + this.field905 * var3.field914);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZZIIII)V", line = 273)
    public static final void method603(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < arg4) {
            int var7 = (arg3 + arg4) / 2;
            int var8 = arg3;
            class138 var9 = class411.field5232[var7];
            class411.field5232[var7] = class411.field5232[arg4];
            class411.field5232[arg4] = var9;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if (class74.method672(true, arg1, arg0, var9, arg6, arg2, class411.field5232[var10]) <= 0) {
                    class138 var11 = class411.field5232[var10];
                    class411.field5232[var10] = class411.field5232[var8];
                    class411.field5232[var8++] = var11;
                }
            }
            class411.field5232[arg4] = class411.field5232[var8];
            class411.field5232[var8] = var9;
            method603(arg0, arg1, arg2, arg3, var8 - 1, -81, arg6);
            method603(arg0, arg1, arg2, var8 + 1, arg4, -127, arg6);
        }
        if (arg5 >= -48) {
            method603(86, true, false, -88, -16, 69, -44);
        }
        field924++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lpda;)V", line = 316)
    public final void method604(class631 arg0) {
        field903++;
        class65 var2 = (class65) arg0;
        this.field921 = var2.field921;
        this.field906 = var2.field906;
        this.field937 = var2.field937;
        this.field905 = var2.field905;
        this.field914 = var2.field914;
        this.field915 = var2.field915;
        this.field935 = var2.field935;
        this.field936 = var2.field936;
        this.field916 = var2.field916;
        this.field925 = var2.field925;
        this.field927 = var2.field927;
        this.field913 = var2.field913;
    }

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "(I)[F", line = 343)
    public final float[] method605(int arg0) {
        class39.field603[13] = this.field921;
        class39.field603[8] = this.field916;
        field910++;
        int var2 = -128 % ((arg0 + 55) / 33);
        class39.field603[0] = this.field915;
        class39.field603[12] = this.field914;
        class39.field603[6] = this.field935;
        class39.field603[9] = this.field906;
        class39.field603[10] = this.field913;
        class39.field603[4] = this.field936;
        class39.field603[2] = this.field905;
        class39.field603[14] = this.field927;
        class39.field603[5] = this.field925;
        class39.field603[1] = this.field937;
        return class39.field603;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[I)V", line = 365)
    public final void method606(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field913 + (float) arg0 * this.field905 + (float) arg1 * this.field935 + this.field927);
        field920++;
        arg3[0] = (int) ((float) arg2 * this.field916 + (float) arg0 * this.field915 + (float) arg1 * this.field936 + this.field914);
        arg3[1] = (int) ((float) arg2 * this.field906 + (float) arg0 * this.field937 + (float) arg1 * this.field925 + this.field921);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(FF[FZFF)V", line = 375)
    public final void method607(float arg0, float arg1, float[] arg2, boolean arg3, float arg4, float arg5) {
        field901++;
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg1 / arg4;
            var10 = this.field905 * var12 + this.field927;
            var8 = this.field937 * var12 + this.field921;
            var9 = this.field915 * var12 + this.field914;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg1 / arg0;
            var10 = this.field935 * var11 + this.field927;
            var8 = this.field925 * var11 + this.field921;
            var9 = this.field936 * var11 + this.field914;
        } else {
            float var7 = -arg1 / arg5;
            var8 = this.field906 * var7 + this.field921;
            var9 = this.field916 * var7 + this.field914;
            var10 = this.field913 * var7 + this.field927;
        }
        if (!arg3) {
            this.field914 = 0.92137057F;
        }
        arg2[0] = this.field916 * arg5 + this.field936 * arg0 + this.field915 * arg4;
        arg2[1] = this.field906 * arg5 + this.field937 * arg4 + this.field925 * arg0;
        arg2[2] = this.field913 * arg5 + this.field935 * arg0 + this.field905 * arg4;
        arg2[3] = -(arg2[2] * var10 + arg2[0] * var9 + arg2[1] * var8);
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V", line = 421)
    public final void method608(int arg0) {
        field922++;
        float var2 = class303.field3964[arg0 & 0x3FFF];
        float var3 = class303.field3966[arg0 & 0x3FFF];
        float var4 = this.field915;
        float var5 = this.field936;
        float var6 = this.field916;
        float var7 = this.field914;
        this.field915 = var2 * var4 - this.field937 * var3;
        this.field937 = this.field937 * var2 + var3 * var4;
        this.field936 = var2 * var5 - (this.field925 * var3);
        this.field916 = var2 * var6 - this.field906 * var3;
        this.field925 = this.field925 * var2 + var3 * var5;
        this.field906 = this.field906 * var2 + var3 * var6;
        this.field914 = var2 * var7 - (this.field921 * var3);
        this.field921 = this.field921 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "(I)[F", line = 449)
    public final float[] method609(int arg0) {
        class39.field603[arg0] = 0.0F;
        class39.field603[5] = this.field925;
        class39.field603[1] = this.field937;
        class39.field603[8] = this.field916;
        class39.field603[13] = 0.0F;
        field904++;
        class39.field603[0] = this.field915;
        class39.field603[4] = this.field936;
        class39.field603[6] = this.field935;
        class39.field603[2] = this.field905;
        class39.field603[10] = this.field913;
        class39.field603[9] = this.field906;
        class39.field603[14] = 0.0F;
        return class39.field603;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V", line = 470)
    public final void method610(int arg0) {
        field923++;
        this.field913 = 1.0F;
        this.field915 = this.field925 = class303.field3964[arg0 & 0x3FFF];
        this.field937 = class303.field3966[arg0 & 0x3FFF];
        this.field916 = this.field914 = this.field906 = this.field921 = this.field905 = this.field935 = this.field927 = 0.0F;
        this.field936 = -this.field937;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()Lpda;", line = 487)
    public final class631 method611() {
        field918++;
        class65 var1 = new class65();
        var1.field914 = this.field914;
        var1.field925 = this.field925;
        var1.field916 = this.field916;
        var1.field915 = this.field915;
        var1.field927 = this.field927;
        var1.field906 = this.field906;
        var1.field935 = this.field935;
        var1.field937 = this.field937;
        var1.field936 = this.field936;
        var1.field905 = this.field905;
        var1.field913 = this.field913;
        var1.field921 = this.field921;
        return var1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 512)
    public final void method612(boolean arg0) {
        this.field927 = -this.field927;
        this.field935 = -this.field935;
        this.field906 = -this.field906;
        field917++;
        this.field913 = -this.field913;
        this.field937 = -this.field937;
        this.field905 = -this.field905;
        if (!arg0) {
            this.method596(44, -36, 105);
        }
        this.field925 = -this.field925;
        this.field921 = -this.field921;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 530)
    public class65() {
        this.method595();
    }
}
