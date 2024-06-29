import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class624 extends class165 {

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field8956 = 0;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field8934 = 1403;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "[[I")
    public static int[][] field8960 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "F")
    public float field8939;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "F")
    public float field8940;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "F")
    public float field8942;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "F")
    public float field8944;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "F")
    public float field8951;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "F")
    public float field8954;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "F")
    public float field8955;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "F")
    public float field8958;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "F")
    public float field8959;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "F")
    public float field8961;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "F")
    public float field8962;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "F")
    public float field8968;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Ldfa;")
    public static class165 field8947;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[I)V", line = 4)
    public final void method1020(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field8955);
        int var6 = (int) ((float) arg0 - this.field8939);
        int var7 = (int) ((float) arg1 - this.field8944);
        field8971++;
        arg3[1] = (int) ((float) var5 * this.field8940 + (float) var6 * this.field8951 + (float) var7 * this.field8968);
        arg3[2] = (int) ((float) var5 * this.field8962 + (float) var6 * this.field8961 + (float) var7 * this.field8942);
        arg3[0] = (int) ((float) var5 * this.field8959 + (float) var6 * this.field8954 + (float) var7 * this.field8958);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ldfa;)V", line = 18)
    public final void method1028(class165 arg0) {
        field8946++;
        class624 var2 = (class624) arg0;
        this.field8962 = var2.field8962;
        this.field8961 = var2.field8961;
        this.field8959 = var2.field8959;
        this.field8942 = var2.field8942;
        this.field8968 = var2.field8968;
        this.field8954 = var2.field8954;
        this.field8958 = var2.field8958;
        this.field8939 = var2.field8939;
        this.field8951 = var2.field8951;
        this.field8955 = var2.field8955;
        this.field8944 = var2.field8944;
        this.field8940 = var2.field8940;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V", line = 42)
    public final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8936++;
        float var7 = class247.field3003[arg3 & 0x3FFF];
        float var8 = class247.field3004[arg3 & 0x3FFF];
        float var9 = class247.field3003[arg4 & 0x3FFF];
        float var10 = class247.field3004[arg4 & 0x3FFF];
        float var11 = class247.field3003[arg5 & 0x3FFF];
        float var12 = class247.field3004[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8940 = -var8;
        this.field8959 = var7 * var10;
        this.field8958 = -var9 * var12 + var10 * var13;
        this.field8942 = var9 * var13 + var10 * var12;
        this.field8954 = var9 * var11 + var10 * var14;
        this.field8962 = var7 * var9;
        this.field8961 = -var10 * var11 + var9 * var14;
        this.field8968 = var7 * var11;
        this.field8951 = var7 * var12;
        this.field8944 = (float) (-arg0) * this.field8958 - ((float) arg1 * this.field8968) - (float) arg2 * this.field8942;
        this.field8939 = (float) (-arg0) * this.field8954 - (float) arg1 * this.field8951 - ((float) arg2 * this.field8961);
        this.field8955 = (float) (-arg0) * this.field8959 - (float) arg1 * this.field8940 - (float) arg2 * this.field8962;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 77)
    public static final void method3573(int arg0, String arg1) {
        System.out.println("Error: " + class317.method1906("%0a", "\n", arg1, 0));
        field8935++;
        if (arg0 != 2) {
            field8934 = 116;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 89)
    public final void method1022(int arg0) {
        field8938++;
        this.field8954 = 1.0F;
        this.field8968 = this.field8962 = class247.field3003[arg0 & 0x3FFF];
        this.field8940 = class247.field3004[arg0 & 0x3FFF];
        this.field8951 = this.field8961 = this.field8939 = this.field8958 = this.field8944 = this.field8959 = this.field8955 = 0.0F;
        this.field8942 = -this.field8940;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 103)
    public static void method3574(int arg0) {
        if (arg0 >= -53) {
            field8960 = null;
        }
        field8960 = null;
        field8947 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFIIIFI)V", line = 116)
    public final void method3575(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6) {
        if (arg2 == 0) {
            this.field8954 = arg6;
            this.field8962 = 1.0F;
            this.field8968 = arg4;
            this.field8958 = this.field8959 = this.field8951 = this.field8940 = this.field8961 = this.field8942 = 0.0F;
        } else {
            float var8 = class247.field3003[arg2 & 0x3FFF];
            float var9 = class247.field3004[arg2 & 0x3FFF];
            this.field8954 = (float) arg6 * var8;
            this.field8958 = (float) arg6 * var9;
            this.field8959 = this.field8940 = this.field8961 = this.field8942 = 0.0F;
            this.field8951 = (float) arg4 * -var9;
            this.field8962 = 1.0F;
            this.field8968 = (float) arg4 * var8;
        }
        field8949++;
        if (arg3 != 2) {
            this.method1028(null);
        }
        this.field8955 = arg5;
        this.field8939 = arg1;
        this.field8944 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 152)
    public final void method1019(int arg0, int arg1, int arg2) {
        this.field8958 = this.field8959 = this.field8951 = this.field8940 = this.field8961 = this.field8942 = 0.0F;
        field8974++;
        this.field8954 = this.field8968 = this.field8962 = 1.0F;
        this.field8939 = arg0;
        this.field8955 = arg2;
        this.field8944 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)Ljba;", line = 167)
    public static final class398 method3576(int arg0, int arg1, int arg2) {
        class691 var3 = class638.field9170[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9739;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZ)I", line = 175)
    public static final int method3577(byte arg0, boolean arg1) {
        field8963++;
        int var2 = class3.field27;
        if (var2 == 0) {
            return arg1 ? 0 : class305.field3808;
        } else if (var2 == 1) {
            return class305.field3808;
        } else if (var2 == 2) {
            return 0;
        } else {
            if (arg0 <= 93) {
                field8956 = 87;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III)V", line = 219)
    public final void method1033(int arg0, int arg1, int arg2) {
        this.field8955 += arg2;
        field8952++;
        this.field8944 += arg1;
        this.field8939 += arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()Ldfa;", line = 229)
    public final class165 method1024() {
        field8953++;
        class624 var1 = new class624();
        var1.field8958 = this.field8958;
        var1.field8942 = this.field8942;
        var1.field8944 = this.field8944;
        var1.field8939 = this.field8939;
        var1.field8959 = this.field8959;
        var1.field8968 = this.field8968;
        var1.field8962 = this.field8962;
        var1.field8951 = this.field8951;
        var1.field8954 = this.field8954;
        var1.field8961 = this.field8961;
        var1.field8940 = this.field8940;
        var1.field8955 = this.field8955;
        return var1;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V", line = 252)
    public static final void method3578(byte arg0) {
        field8965++;
        int var1 = class585.field8256;
        if (arg0 <= 23) {
            method3573(116, null);
        }
        int[] var2 = class399.field5459;
        for (int var3 = 0; var3 < var1; var3++) {
            class183 var4 = class75.field792[var2[var3]];
            if (var4 != null) {
                class606.method3440(var4, (byte) -93, var4.method1128(-1));
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)[F", line = 281)
    public final float[] method3579(int arg0) {
        class293.field3611[6] = this.field8940;
        class293.field3611[13] = this.field8944;
        class293.field3611[1] = this.field8958;
        if (arg0 < 25) {
            this.field8940 = -0.5825895F;
        }
        class293.field3611[9] = this.field8942;
        class293.field3611[14] = this.field8955;
        class293.field3611[0] = this.field8954;
        class293.field3611[4] = this.field8951;
        class293.field3611[12] = this.field8939;
        class293.field3611[5] = this.field8968;
        class293.field3611[8] = this.field8961;
        class293.field3611[2] = this.field8959;
        class293.field3611[10] = this.field8962;
        field8970++;
        return class293.field3611;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(III[I)V", line = 305)
    public final void method1023(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field8961 + (float) arg0 * this.field8954 + (float) arg1 * this.field8951);
        arg3[1] = (int) ((float) arg2 * this.field8942 + (float) arg0 * this.field8958 + (float) arg1 * this.field8968);
        arg3[2] = (int) ((float) arg2 * this.field8962 + (float) arg0 * this.field8959 + (float) arg1 * this.field8940);
        field8966++;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III[I)V", line = 317)
    public final void method1030(int arg0, int arg1, int arg2, int[] arg3) {
        field8950++;
        arg3[1] = (int) ((float) arg2 * this.field8942 + (float) arg0 * this.field8958 + (float) arg1 * this.field8968 + this.field8944);
        arg3[0] = (int) ((float) arg2 * this.field8961 + (float) arg0 * this.field8954 + (float) arg1 * this.field8951 + this.field8939);
        arg3[2] = (int) ((float) arg2 * this.field8962 + (float) arg0 * this.field8959 + (float) arg1 * this.field8940 + this.field8955);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 330)
    public final void method3580(byte arg0) {
        this.field8940 = -this.field8940;
        this.field8955 = -this.field8955;
        this.field8942 = -this.field8942;
        this.field8968 = -this.field8968;
        this.field8962 = -this.field8962;
        this.field8959 = -this.field8959;
        this.field8958 = -this.field8958;
        if (arg0 != 31) {
            this.field8939 = 1.5707743F;
        }
        this.field8944 = -this.field8944;
        field8943++;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)[F", line = 360)
    public final float[] method3581(byte arg0) {
        class293.field3611[4] = this.field8951;
        class293.field3611[6] = this.field8940;
        class293.field3611[0] = this.field8954;
        class293.field3611[14] = 0.0F;
        class293.field3611[5] = this.field8968;
        class293.field3611[13] = 0.0F;
        int var2 = -1 % ((arg0 - 68) / 47);
        class293.field3611[2] = this.field8959;
        class293.field3611[9] = this.field8942;
        class293.field3611[8] = this.field8961;
        class293.field3611[12] = 0.0F;
        class293.field3611[10] = this.field8962;
        field8967++;
        class293.field3611[1] = this.field8958;
        return class293.field3611;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V", line = 383)
    public final void method1035(int arg0) {
        this.field8968 = 1.0F;
        field8948++;
        this.field8954 = this.field8962 = class247.field3003[arg0 & 0x3FFF];
        this.field8961 = class247.field3004[arg0 & 0x3FFF];
        this.field8951 = this.field8939 = this.field8958 = this.field8942 = this.field8944 = this.field8940 = this.field8955 = 0.0F;
        this.field8959 = -this.field8961;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I)V", line = 395)
    public final void method1027(int[] arg0) {
        field8969++;
        float var2 = (float) arg0[0] - this.field8939;
        float var3 = (float) arg0[1] - this.field8944;
        float var4 = (float) arg0[2] - this.field8955;
        arg0[2] = (int) (this.field8962 * var4 + this.field8961 * var2 + this.field8942 * var3);
        arg0[1] = (int) (this.field8940 * var4 + this.field8968 * var3 + this.field8951 * var2);
        arg0[0] = (int) (this.field8959 * var4 + this.field8958 * var3 + this.field8954 * var2);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 412)
    public final void method1032(int arg0) {
        field8964++;
        float var2 = class247.field3003[arg0 & 0x3FFF];
        float var3 = class247.field3004[arg0 & 0x3FFF];
        float var4 = this.field8954;
        float var5 = this.field8951;
        float var6 = this.field8961;
        this.field8954 = var2 * var4 - this.field8958 * var3;
        float var7 = this.field8939;
        this.field8951 = var2 * var5 - this.field8968 * var3;
        this.field8958 = this.field8958 * var2 + var3 * var4;
        this.field8968 = this.field8968 * var2 + var3 * var5;
        this.field8961 = var2 * var6 - (this.field8942 * var3);
        this.field8942 = this.field8942 * var2 + var3 * var6;
        this.field8939 = var2 * var7 - (this.field8944 * var3);
        this.field8944 = this.field8944 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 439)
    public final void method1021(int arg0) {
        this.field8962 = 1.0F;
        field8937++;
        this.field8954 = this.field8968 = class247.field3003[arg0 & 0x3FFF];
        this.field8958 = class247.field3004[arg0 & 0x3FFF];
        this.field8951 = -this.field8958;
        this.field8961 = this.field8939 = this.field8942 = this.field8944 = this.field8959 = this.field8940 = this.field8955 = 0.0F;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 459)
    public final void method1025(int arg0) {
        field8957++;
        float var2 = class247.field3003[arg0 & 0x3FFF];
        float var3 = class247.field3004[arg0 & 0x3FFF];
        float var4 = this.field8958;
        float var5 = this.field8968;
        float var6 = this.field8942;
        this.field8958 = var2 * var4 - (this.field8959 * var3);
        float var7 = this.field8944;
        this.field8968 = var2 * var5 - this.field8940 * var3;
        this.field8959 = this.field8959 * var2 + var3 * var4;
        this.field8942 = var2 * var6 - this.field8962 * var3;
        this.field8940 = this.field8940 * var2 + var3 * var5;
        this.field8944 = var2 * var7 - this.field8955 * var3;
        this.field8962 = this.field8962 * var2 + var3 * var6;
        this.field8955 = this.field8955 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLdfa;)V", line = 490)
    public final void method3582(byte arg0, class165 arg1) {
        field8973++;
        class624 var3 = (class624) arg1;
        this.field8951 = var3.field8958;
        this.field8961 = var3.field8959;
        this.field8954 = var3.field8954;
        this.field8942 = var3.field8940;
        this.field8958 = var3.field8951;
        this.field8959 = var3.field8961;
        this.field8968 = var3.field8968;
        this.field8939 = -(this.field8961 * var3.field8955 + this.field8954 * var3.field8939 + this.field8951 * var3.field8944);
        this.field8940 = var3.field8942;
        if (arg0 != 31) {
            field8956 = 8;
        }
        this.field8962 = var3.field8962;
        this.field8944 = -(this.field8942 * var3.field8955 + this.field8968 * var3.field8944 + this.field8958 * var3.field8939);
        this.field8955 = -(this.field8962 * var3.field8955 + this.field8959 * var3.field8939 + this.field8940 * var3.field8944);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 516)
    public class624() {
        this.method1026();
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 526)
    public final void method1036(int arg0) {
        field8941++;
        float var2 = class247.field3003[arg0 & 0x3FFF];
        float var3 = class247.field3004[arg0 & 0x3FFF];
        float var4 = this.field8954;
        float var5 = this.field8951;
        float var6 = this.field8961;
        float var7 = this.field8939;
        this.field8954 = this.field8959 * var3 + var2 * var4;
        this.field8959 = this.field8959 * var2 - (var3 * var4);
        this.field8951 = this.field8940 * var3 + var2 * var5;
        this.field8940 = this.field8940 * var2 - var3 * var5;
        this.field8961 = this.field8962 * var3 + var2 * var6;
        this.field8962 = this.field8962 * var2 - (var3 * var6);
        this.field8939 = this.field8955 * var3 + var2 * var7;
        this.field8955 = this.field8955 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 555)
    public final void method1026() {
        field8945++;
        this.field8958 = this.field8959 = this.field8951 = this.field8940 = this.field8961 = this.field8942 = this.field8939 = this.field8944 = this.field8955 = 0.0F;
        this.field8954 = this.field8968 = this.field8962 = 1.0F;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FF[FFBF)V", line = 564)
    public final void method3583(float arg0, float arg1, float[] arg2, float arg3, byte arg4, float arg5) {
        field8972++;
        float var8;
        float var9;
        float var10;
        if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg3 / arg1;
            var10 = this.field8954 * var12 + this.field8939;
            var8 = this.field8958 * var12 + this.field8944;
            var9 = this.field8959 * var12 + this.field8955;
        } else if ((arg5 > 0.00390625F) || (arg5 < -0.00390625F)) {
            float var11 = -arg3 / arg5;
            var8 = this.field8968 * var11 + this.field8944;
            var10 = this.field8951 * var11 + this.field8939;
            var9 = this.field8940 * var11 + this.field8955;
        } else {
            float var7 = -arg3 / arg0;
            var8 = this.field8942 * var7 + this.field8944;
            var9 = this.field8962 * var7 + this.field8955;
            var10 = this.field8961 * var7 + this.field8939;
        }
        arg2[1] = this.field8942 * arg0 + this.field8968 * arg5 + this.field8958 * arg1;
        arg2[2] = this.field8962 * arg0 + this.field8959 * arg1 + this.field8940 * arg5;
        arg2[0] = this.field8961 * arg0 + this.field8954 * arg1 + this.field8951 * arg5;
        if (arg4 == 24) {
            arg2[3] = -(arg2[2] * var9 + arg2[0] * var10 + arg2[1] * var8);
        }
    }
}
