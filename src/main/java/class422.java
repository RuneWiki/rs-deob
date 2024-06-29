import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class422 extends class396 {

    @OriginalMember(owner = "client!td", name = "O", descriptor = "[[I")
    public static int[][] field6107 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field6096 = -1;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Ljava/lang/String;")
    public static String field6110 = null;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "F")
    public float field6075;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "F")
    public float field6077;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "F")
    public float field6078;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "F")
    public float field6079;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "F")
    public float field6081;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "F")
    public float field6083;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "F")
    public float field6099;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "F")
    public float field6100;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "F")
    public float field6101;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "F")
    public float field6102;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "F")
    public float field6109;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "F")
    public float field6112;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLqh;)Lfba;")
    public static final class24 method2566(boolean arg0, class61 arg1) {
        field6082++;
        class673 var2 = class318.method2049(arg1, 20107);
        int var3 = arg1.method751(255);
        if (!arg0) {
            field6107 = null;
        }
        return new class24(var2.field9584, var2.field9586, var2.field9575, var2.field9578, var2.field9577, var3);
    }

    @OriginalMember(owner = "client!td", name = "w", descriptor = "(I)V")
    public final void method894(int arg0) {
        field6092++;
        float var2 = class384.field5650[arg0 & 0x3FFF];
        float var3 = class384.field5651[arg0 & 0x3FFF];
        float var4 = this.field6112;
        float var5 = this.field6079;
        float var6 = this.field6083;
        this.field6112 = var2 * var4 - (this.field6078 * var3);
        float var7 = this.field6109;
        this.field6078 = this.field6078 * var2 + var3 * var4;
        this.field6079 = var2 * var5 - this.field6081 * var3;
        this.field6083 = var2 * var6 - (this.field6075 * var3);
        this.field6081 = this.field6081 * var2 + var3 * var5;
        this.field6109 = var2 * var7 - (this.field6077 * var3);
        this.field6075 = this.field6075 * var2 + var3 * var6;
        this.field6077 = this.field6077 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLq;)V")
    public final void method2567(byte arg0, class396 arg1) {
        field6080++;
        class422 var3 = (class422) arg1;
        this.field6101 = var3.field6101;
        this.field6102 = var3.field6112;
        if (arg0 > -107) {
            this.field6112 = 0.3305889F;
        }
        this.field6100 = var3.field6078;
        this.field6112 = var3.field6102;
        this.field6078 = var3.field6100;
        this.field6083 = var3.field6081;
        this.field6079 = var3.field6079;
        this.field6075 = var3.field6075;
        this.field6081 = var3.field6083;
        this.field6099 = -(this.field6100 * var3.field6077 + this.field6102 * var3.field6109 + this.field6101 * var3.field6099);
        this.field6109 = -(this.field6083 * var3.field6077 + this.field6112 * var3.field6099 + this.field6079 * var3.field6109);
        this.field6077 = -(this.field6075 * var3.field6077 + this.field6081 * var3.field6109 + this.field6078 * var3.field6099);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()Lq;")
    public final class396 method904() {
        field6094++;
        class422 var1 = new class422();
        var1.field6112 = this.field6112;
        var1.field6101 = this.field6101;
        var1.field6078 = this.field6078;
        var1.field6083 = this.field6083;
        var1.field6100 = this.field6100;
        var1.field6075 = this.field6075;
        var1.field6079 = this.field6079;
        var1.field6077 = this.field6077;
        var1.field6109 = this.field6109;
        var1.field6102 = this.field6102;
        var1.field6081 = this.field6081;
        var1.field6099 = this.field6099;
        return var1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[F")
    public final float[] method2568(int arg0) {
        class393.field5754[12] = 0.0F;
        class393.field5754[9] = this.field6083;
        class393.field5754[13] = 0.0F;
        class393.field5754[5] = this.field6079;
        class393.field5754[1] = this.field6112;
        class393.field5754[arg0] = this.field6101;
        class393.field5754[14] = 0.0F;
        class393.field5754[10] = this.field6075;
        field6088++;
        class393.field5754[6] = this.field6081;
        class393.field5754[2] = this.field6078;
        class393.field5754[8] = this.field6100;
        class393.field5754[4] = this.field6102;
        return class393.field5754;
    }

    @OriginalMember(owner = "client!td", name = "M", descriptor = "(Lq;)V")
    public final void method896(class396 arg0) {
        field6091++;
        class422 var2 = (class422) arg0;
        this.field6100 = var2.field6100;
        this.field6099 = var2.field6099;
        this.field6101 = var2.field6101;
        this.field6081 = var2.field6081;
        this.field6079 = var2.field6079;
        this.field6075 = var2.field6075;
        this.field6112 = var2.field6112;
        this.field6078 = var2.field6078;
        this.field6077 = var2.field6077;
        this.field6102 = var2.field6102;
        this.field6109 = var2.field6109;
        this.field6083 = var2.field6083;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public final void method2569(byte arg0) {
        this.field6077 = -this.field6077;
        this.field6083 = -this.field6083;
        this.field6078 = -this.field6078;
        int var2 = 28 % ((arg0 - 16) / 63);
        field6108++;
        this.field6112 = -this.field6112;
        this.field6079 = -this.field6079;
        this.field6081 = -this.field6081;
        this.field6109 = -this.field6109;
        this.field6075 = -this.field6075;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method2570(int arg0) {
        field6107 = null;
        field6110 = null;
        if (arg0 != -15952) {
            method2566(true, null);
        }
    }

    @OriginalMember(owner = "client!td", name = "oa", descriptor = "(I)V")
    public final void method893(int arg0) {
        this.field6101 = 1.0F;
        field6087++;
        this.field6079 = this.field6075 = class384.field5650[arg0 & 0x3FFF];
        this.field6081 = class384.field5651[arg0 & 0x3FFF];
        this.field6083 = -this.field6081;
        this.field6102 = this.field6100 = this.field6099 = this.field6112 = this.field6109 = this.field6078 = this.field6077 = 0.0F;
    }

    @OriginalMember(owner = "client!td", name = "AA", descriptor = "(I)V")
    public final void method897(int arg0) {
        field6095++;
        float var2 = class384.field5650[arg0 & 0x3FFF];
        float var3 = class384.field5651[arg0 & 0x3FFF];
        float var4 = this.field6101;
        float var5 = this.field6102;
        float var6 = this.field6100;
        float var7 = this.field6099;
        this.field6101 = var2 * var4 - this.field6112 * var3;
        this.field6112 = this.field6112 * var2 + var3 * var4;
        this.field6102 = var2 * var5 - (this.field6079 * var3);
        this.field6079 = this.field6079 * var2 + var3 * var5;
        this.field6100 = var2 * var6 - (this.field6083 * var3);
        this.field6083 = this.field6083 * var2 + var3 * var6;
        this.field6099 = var2 * var7 - (this.field6109 * var3);
        this.field6109 = this.field6109 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lr;IB)Ldaa;")
    public static final class11 method2571(class167 arg0, int arg1, byte arg2) {
        field6093++;
        class505 var3 = class370.method2346(true, (byte) -116, arg1, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 > -44) {
                method2571(null, 61, (byte) 102);
            }
            return var3.field7170;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
    public static final boolean method2572(int arg0, int arg1, int arg2) {
        field6086++;
        if (arg1 != 384) {
            method2572(-21, -48, 25);
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!td", name = "wa", descriptor = "(III[I)V")
    public final void method899(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6075 + (float) arg0 * this.field6078 + (float) arg1 * this.field6081);
        field6098++;
        arg3[0] = (int) ((float) arg2 * this.field6100 + (float) arg0 * this.field6101 + (float) arg1 * this.field6102);
        arg3[1] = (int) ((float) arg2 * this.field6083 + (float) arg0 * this.field6112 + (float) arg1 * this.field6079);
    }

    @OriginalMember(owner = "client!td", name = "J", descriptor = "(I)V")
    public final void method903(int arg0) {
        this.field6075 = 1.0F;
        field6090++;
        this.field6101 = this.field6079 = class384.field5650[arg0 & 0x3FFF];
        this.field6112 = class384.field5651[arg0 & 0x3FFF];
        this.field6100 = this.field6099 = this.field6083 = this.field6109 = this.field6078 = this.field6081 = this.field6077 = 0.0F;
        this.field6102 = -this.field6112;
    }

    @OriginalMember(owner = "client!td", name = "U", descriptor = "(III)V")
    public final void method891(int arg0, int arg1, int arg2) {
        field6111++;
        this.field6077 += arg2;
        this.field6099 += arg0;
        this.field6109 += arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(FZIIFFI)V")
    public final void method2573(float arg0, boolean arg1, int arg2, int arg3, float arg4, float arg5, int arg6) {
        if (arg6 == 0) {
            this.field6079 = arg3;
            this.field6075 = 1.0F;
            this.field6112 = this.field6078 = this.field6102 = this.field6081 = this.field6100 = this.field6083 = 0.0F;
            this.field6101 = arg2;
        } else {
            float var8 = class384.field5650[arg6 & 0x3FFF];
            float var9 = class384.field5651[arg6 & 0x3FFF];
            this.field6075 = 1.0F;
            this.field6078 = this.field6081 = this.field6100 = this.field6083 = 0.0F;
            this.field6101 = (float) arg2 * var8;
            this.field6102 = (float) arg3 * -var9;
            this.field6112 = (float) arg2 * var9;
            this.field6079 = (float) arg3 * var8;
        }
        field6097++;
        if (!arg1) {
            this.field6109 = arg0;
            this.field6077 = arg4;
            this.field6099 = arg5;
        }
    }

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "()V")
    public final void method895() {
        this.field6101 = this.field6079 = this.field6075 = 1.0F;
        field6104++;
        this.field6112 = this.field6078 = this.field6102 = this.field6081 = this.field6100 = this.field6083 = this.field6099 = this.field6109 = this.field6077 = 0.0F;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([FFFFFI)V")
    public final void method2574(float[] arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
        field6085++;
        arg0[0] = this.field6100 * arg2 + this.field6102 * arg4 + this.field6101 * arg1;
        float var8;
        float var9;
        float var10;
        if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg3 / arg1;
            var8 = this.field6112 * var12 + this.field6109;
            var10 = this.field6101 * var12 + this.field6099;
            var9 = this.field6078 * var12 + this.field6077;
        } else if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var11 = -arg3 / arg4;
            var9 = this.field6081 * var11 + this.field6077;
            var10 = this.field6102 * var11 + this.field6099;
            var8 = this.field6079 * var11 + this.field6109;
        } else {
            float var7 = -arg3 / arg2;
            var8 = this.field6083 * var7 + this.field6109;
            var9 = this.field6075 * var7 + this.field6077;
            var10 = this.field6100 * var7 + this.field6099;
        }
        arg0[1] = this.field6083 * arg2 + this.field6112 * arg1 + this.field6079 * arg4;
        arg0[arg5] = this.field6075 * arg2 + this.field6081 * arg4 + this.field6078 * arg1;
        arg0[3] = -(arg0[2] * var9 + arg0[1] * var8 + arg0[0] * var10);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)[F")
    public final float[] method2575(boolean arg0) {
        field6076++;
        class393.field5754[10] = this.field6075;
        class393.field5754[4] = this.field6102;
        class393.field5754[14] = this.field6077;
        class393.field5754[6] = this.field6081;
        class393.field5754[5] = this.field6079;
        class393.field5754[12] = this.field6099;
        class393.field5754[9] = this.field6083;
        if (arg0) {
            this.method2573(0.6466044F, false, 38, -38, -0.14528655F, -1.279149F, 122);
        }
        class393.field5754[0] = this.field6101;
        class393.field5754[2] = this.field6078;
        class393.field5754[13] = this.field6109;
        class393.field5754[8] = this.field6100;
        class393.field5754[1] = this.field6112;
        return class393.field5754;
    }

    @OriginalMember(owner = "client!td", name = "na", descriptor = "(IIIIII)V")
    public final void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6084++;
        float var7 = class384.field5650[arg3 & 0x3FFF];
        float var8 = class384.field5651[arg3 & 0x3FFF];
        float var9 = class384.field5650[arg4 & 0x3FFF];
        float var10 = class384.field5651[arg4 & 0x3FFF];
        float var11 = class384.field5650[arg5 & 0x3FFF];
        float var12 = class384.field5651[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6078 = var7 * var10;
        this.field6101 = var9 * var11 + var10 * var14;
        this.field6102 = var7 * var12;
        this.field6079 = var7 * var11;
        this.field6075 = var7 * var9;
        this.field6083 = var9 * var13 + var10 * var12;
        this.field6112 = -var9 * var12 + var10 * var13;
        this.field6100 = -var10 * var11 + var9 * var14;
        this.field6081 = -var8;
        this.field6077 = (float) (-arg0) * this.field6078 - (float) arg1 * this.field6081 - ((float) arg2 * this.field6075);
        this.field6099 = (float) (-arg0) * this.field6101 - (float) arg1 * this.field6102 - (float) arg2 * this.field6100;
        this.field6109 = (float) (-arg0) * this.field6112 - (float) arg1 * this.field6079 - ((float) arg2 * this.field6083);
    }

    @OriginalMember(owner = "client!td", name = "o", descriptor = "(I)V")
    public final void method900(int arg0) {
        this.field6079 = 1.0F;
        field6103++;
        this.field6101 = this.field6075 = class384.field5650[arg0 & 0x3FFF];
        this.field6100 = class384.field5651[arg0 & 0x3FFF];
        this.field6078 = -this.field6100;
        this.field6102 = this.field6099 = this.field6112 = this.field6083 = this.field6109 = this.field6081 = this.field6077 = 0.0F;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III[I)V")
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6100 + (float) arg0 * this.field6101 + (float) arg1 * this.field6102 + this.field6099);
        arg3[2] = (int) ((float) arg2 * this.field6075 + (float) arg0 * this.field6078 + (float) arg1 * this.field6081 + this.field6077);
        arg3[1] = (int) ((float) arg2 * this.field6083 + (float) arg0 * this.field6112 + (float) arg1 * this.field6079 + this.field6109);
        field6105++;
    }

    @OriginalMember(owner = "client!td", name = "ZA", descriptor = "(I)V")
    public final void method901(int arg0) {
        field6106++;
        float var2 = class384.field5650[arg0 & 0x3FFF];
        float var3 = class384.field5651[arg0 & 0x3FFF];
        float var4 = this.field6101;
        float var5 = this.field6102;
        float var6 = this.field6100;
        this.field6101 = this.field6078 * var3 + var2 * var4;
        float var7 = this.field6099;
        this.field6078 = this.field6078 * var2 - var3 * var4;
        this.field6102 = this.field6081 * var3 + var2 * var5;
        this.field6100 = this.field6075 * var3 + var2 * var6;
        this.field6081 = this.field6081 * var2 - (var3 * var5);
        this.field6099 = this.field6077 * var3 + var2 * var7;
        this.field6075 = this.field6075 * var2 - var3 * var6;
        this.field6077 = this.field6077 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!td", name = "NA", descriptor = "(III)V")
    public final void method905(int arg0, int arg1, int arg2) {
        this.field6109 = arg1;
        this.field6101 = this.field6079 = this.field6075 = 1.0F;
        this.field6077 = arg2;
        this.field6099 = arg0;
        field6089++;
        this.field6112 = this.field6078 = this.field6102 = this.field6081 = this.field6100 = this.field6083 = 0.0F;
    }

    @OriginalMember(owner = "client!td", name = "YA", descriptor = "([I)V")
    public final void method898(int[] arg0) {
        field6113++;
        float var2 = (float) arg0[0] - this.field6099;
        float var3 = (float) arg0[1] - this.field6109;
        float var4 = (float) arg0[2] - this.field6077;
        arg0[2] = (int) (this.field6075 * var4 + this.field6100 * var2 + this.field6083 * var3);
        arg0[0] = (int) (this.field6078 * var4 + this.field6112 * var3 + this.field6101 * var2);
        arg0[1] = (int) (this.field6081 * var4 + this.field6102 * var2 + this.field6079 * var3);
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class422() {
        this.method895();
    }
}
