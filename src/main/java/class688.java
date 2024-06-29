import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class688 extends class376 {

    @OriginalMember(owner = "client!fw", name = "x", descriptor = "[I")
    public static int[] field9759 = new int[32];

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "[I")
    public static int[] field9749 = new int[4096];

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "F")
    public float field9753;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "F")
    public float field9755;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "F")
    public float field9756;

    @OriginalMember(owner = "client!fw", name = "w", descriptor = "F")
    public float field9758;

    @OriginalMember(owner = "client!fw", name = "B", descriptor = "F")
    public float field9763;

    @OriginalMember(owner = "client!fw", name = "C", descriptor = "F")
    public float field9764;

    @OriginalMember(owner = "client!fw", name = "J", descriptor = "F")
    public float field9771;

    @OriginalMember(owner = "client!fw", name = "L", descriptor = "F")
    public float field9773;

    @OriginalMember(owner = "client!fw", name = "M", descriptor = "F")
    public float field9774;

    @OriginalMember(owner = "client!fw", name = "N", descriptor = "F")
    public float field9775;

    @OriginalMember(owner = "client!fw", name = "O", descriptor = "F")
    public float field9776;

    @OriginalMember(owner = "client!fw", name = "U", descriptor = "F")
    public float field9782;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field9750;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
    public static int field9762;

    @OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!fw", name = "F", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!fw", name = "H", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!fw", name = "K", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!fw", name = "P", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!fw", name = "Q", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!fw", name = "R", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!fw", name = "S", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!fw", name = "T", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!fw", name = "W", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!fw", name = "X", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!fw", name = "Y", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!fw", name = "V", descriptor = "Lac;")
    public static class712 field9783;

    @OriginalMember(owner = "client!fw", name = "z", descriptor = "[I")
    public static int[] field9761;

    @OriginalMember(owner = "client!fw", name = "E", descriptor = "[[B")
    public static byte[][] field9766;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "()Lwc;", line = 3)
    public final class376 method1965() {
        field9750++;
        class688 var1 = new class688();
        var1.field9771 = this.field9771;
        var1.field9775 = this.field9775;
        var1.field9764 = this.field9764;
        var1.field9776 = this.field9776;
        var1.field9758 = this.field9758;
        var1.field9774 = this.field9774;
        var1.field9756 = this.field9756;
        var1.field9763 = this.field9763;
        var1.field9753 = this.field9753;
        var1.field9782 = this.field9782;
        var1.field9773 = this.field9773;
        var1.field9755 = this.field9755;
        return var1;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(III)V", line = 26)
    public final void method1973(int arg0, int arg1, int arg2) {
        this.field9774 += arg2;
        this.field9782 += arg0;
        this.field9775 += arg1;
        field9762++;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIII)V", line = 36)
    public final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9746++;
        float var7 = class555.field7786[arg3 & 0x3FFF];
        float var8 = class555.field7796[arg3 & 0x3FFF];
        float var9 = class555.field7786[arg4 & 0x3FFF];
        float var10 = class555.field7796[arg4 & 0x3FFF];
        float var11 = class555.field7786[arg5 & 0x3FFF];
        float var12 = class555.field7796[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field9763 = var9 * var11 + var10 * var14;
        this.field9756 = var7 * var9;
        this.field9776 = var7 * var10;
        this.field9764 = -var8;
        this.field9771 = var7 * var11;
        this.field9753 = -var9 * var12 + var10 * var13;
        this.field9755 = var7 * var12;
        this.field9773 = -var10 * var11 + var9 * var14;
        this.field9758 = var9 * var13 + var10 * var12;
        this.field9774 = (float) (-arg0) * this.field9776 - (float) arg1 * this.field9764 - ((float) arg2 * this.field9756);
        this.field9782 = (float) (-arg0) * this.field9763 - (float) arg1 * this.field9755 - ((float) arg2 * this.field9773);
        this.field9775 = (float) (-arg0) * this.field9753 - (float) arg1 * this.field9771 - (float) arg2 * this.field9758;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V", line = 73)
    public final void method1975(int arg0) {
        field9786++;
        float var2 = class555.field7786[arg0 & 0x3FFF];
        float var3 = class555.field7796[arg0 & 0x3FFF];
        float var4 = this.field9753;
        float var5 = this.field9771;
        float var6 = this.field9758;
        float var7 = this.field9775;
        this.field9753 = var2 * var4 - this.field9776 * var3;
        this.field9771 = var2 * var5 - this.field9764 * var3;
        this.field9776 = this.field9776 * var2 + var3 * var4;
        this.field9758 = var2 * var6 - (this.field9756 * var3);
        this.field9764 = this.field9764 * var2 + var3 * var5;
        this.field9775 = var2 * var7 - this.field9774 * var3;
        this.field9756 = this.field9756 * var2 + var3 * var6;
        this.field9774 = this.field9774 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V", line = 101)
    public final void method1963(int arg0, int arg1, int arg2) {
        this.field9782 = arg0;
        this.field9753 = this.field9776 = this.field9755 = this.field9764 = this.field9773 = this.field9758 = 0.0F;
        this.field9775 = arg1;
        this.field9763 = this.field9771 = this.field9756 = 1.0F;
        field9752++;
        this.field9774 = arg2;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lwc;B)V", line = 115)
    public final void method3844(class376 arg0, byte arg1) {
        field9772++;
        class688 var3 = (class688) arg0;
        this.field9773 = var3.field9776;
        this.field9763 = var3.field9763;
        this.field9755 = var3.field9753;
        this.field9771 = var3.field9771;
        this.field9753 = var3.field9755;
        this.field9776 = var3.field9773;
        this.field9758 = var3.field9764;
        this.field9782 = -(this.field9773 * var3.field9774 + this.field9763 * var3.field9782 + this.field9755 * var3.field9775);
        this.field9764 = var3.field9758;
        if (arg1 > 99) {
            this.field9756 = var3.field9756;
            this.field9775 = -(this.field9758 * var3.field9774 + this.field9771 * var3.field9775 + this.field9753 * var3.field9782);
            this.field9774 = -(this.field9756 * var3.field9774 + this.field9776 * var3.field9782 + this.field9764 * var3.field9775);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lwc;)V", line = 143)
    public final void method1961(class376 arg0) {
        field9777++;
        class688 var2 = (class688) arg0;
        this.field9753 = var2.field9753;
        this.field9756 = var2.field9756;
        this.field9775 = var2.field9775;
        this.field9782 = var2.field9782;
        this.field9755 = var2.field9755;
        this.field9773 = var2.field9773;
        this.field9764 = var2.field9764;
        this.field9774 = var2.field9774;
        this.field9776 = var2.field9776;
        this.field9763 = var2.field9763;
        this.field9758 = var2.field9758;
        this.field9771 = var2.field9771;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(III[I)V", line = 167)
    public final void method1974(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field9782);
        int var6 = (int) ((float) arg1 - this.field9775);
        field9780++;
        int var7 = (int) ((float) arg2 - this.field9774);
        arg3[2] = (int) ((float) var7 * this.field9756 + (float) var5 * this.field9773 + (float) var6 * this.field9758);
        arg3[0] = (int) ((float) var7 * this.field9776 + (float) var5 * this.field9763 + (float) var6 * this.field9753);
        arg3[1] = (int) ((float) var7 * this.field9764 + (float) var5 * this.field9755 + (float) var6 * this.field9771);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)[F", line = 181)
    public final float[] method3845(boolean arg0) {
        class214.field2714[6] = this.field9764;
        field9779++;
        class214.field2714[0] = this.field9763;
        class214.field2714[5] = this.field9771;
        class214.field2714[10] = this.field9756;
        class214.field2714[12] = 0.0F;
        class214.field2714[1] = this.field9753;
        class214.field2714[9] = this.field9758;
        class214.field2714[2] = this.field9776;
        class214.field2714[13] = 0.0F;
        class214.field2714[8] = this.field9773;
        if (arg0) {
            this.field9756 = 0.13402383F;
        }
        class214.field2714[14] = 0.0F;
        class214.field2714[4] = this.field9755;
        return class214.field2714;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V", line = 207)
    public final void method1972(int arg0) {
        field9784++;
        float var2 = class555.field7786[arg0 & 0x3FFF];
        float var3 = class555.field7796[arg0 & 0x3FFF];
        float var4 = this.field9763;
        float var5 = this.field9755;
        float var6 = this.field9773;
        float var7 = this.field9782;
        this.field9763 = var2 * var4 - this.field9753 * var3;
        this.field9755 = var2 * var5 - (this.field9771 * var3);
        this.field9753 = this.field9753 * var2 + var3 * var4;
        this.field9773 = var2 * var6 - (this.field9758 * var3);
        this.field9771 = this.field9771 * var2 + var3 * var5;
        this.field9758 = this.field9758 * var2 + var3 * var6;
        this.field9782 = var2 * var7 - (this.field9775 * var3);
        this.field9775 = this.field9775 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "(I)V", line = 237)
    public final void method1976(int arg0) {
        this.field9771 = 1.0F;
        field9767++;
        this.field9763 = this.field9756 = class555.field7786[arg0 & 0x3FFF];
        this.field9773 = class555.field7796[arg0 & 0x3FFF];
        this.field9755 = this.field9782 = this.field9753 = this.field9758 = this.field9775 = this.field9764 = this.field9774 = 0.0F;
        this.field9776 = -this.field9773;
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V", line = 250)
    public final void method3846(int arg0) {
        this.field9774 = -this.field9774;
        this.field9756 = -this.field9756;
        this.field9776 = -this.field9776;
        this.field9758 = -this.field9758;
        field9747++;
        this.field9771 = -this.field9771;
        this.field9764 = -this.field9764;
        this.field9753 = -this.field9753;
        this.field9775 = -this.field9775;
        if (arg0 != 2) {
            this.field9763 = 1.0018165F;
        }
    }

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "(I)V", line = 268)
    public final void method1959(int arg0) {
        field9754++;
        float var2 = class555.field7786[arg0 & 0x3FFF];
        float var3 = class555.field7796[arg0 & 0x3FFF];
        float var4 = this.field9763;
        float var5 = this.field9755;
        float var6 = this.field9773;
        this.field9763 = this.field9776 * var3 + var2 * var4;
        float var7 = this.field9782;
        this.field9755 = this.field9764 * var3 + var2 * var5;
        this.field9776 = this.field9776 * var2 - var3 * var4;
        this.field9764 = this.field9764 * var2 - var3 * var5;
        this.field9773 = this.field9756 * var3 + var2 * var6;
        this.field9756 = this.field9756 * var2 - var3 * var6;
        this.field9782 = this.field9774 * var3 + var2 * var7;
        this.field9774 = this.field9774 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "(I)[F", line = 298)
    public final float[] method3847(int arg0) {
        class214.field2714[arg0] = this.field9753;
        class214.field2714[5] = this.field9771;
        class214.field2714[4] = this.field9755;
        class214.field2714[10] = this.field9756;
        class214.field2714[12] = this.field9782;
        class214.field2714[0] = this.field9763;
        class214.field2714[9] = this.field9758;
        class214.field2714[14] = this.field9774;
        field9778++;
        class214.field2714[6] = this.field9764;
        class214.field2714[13] = this.field9775;
        class214.field2714[2] = this.field9776;
        class214.field2714[8] = this.field9773;
        return class214.field2714;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[I)V", line = 320)
    public final void method1977(int arg0, int arg1, int arg2, int[] arg3) {
        field9757++;
        arg3[1] = (int) ((float) arg2 * this.field9758 + (float) arg0 * this.field9753 + (float) arg1 * this.field9771);
        arg3[2] = (int) ((float) arg2 * this.field9756 + (float) arg0 * this.field9776 + (float) arg1 * this.field9764);
        arg3[0] = (int) ((float) arg2 * this.field9773 + (float) arg0 * this.field9763 + (float) arg1 * this.field9755);
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V", line = 335)
    public final void method1967(int arg0) {
        field9769++;
        this.field9756 = 1.0F;
        this.field9763 = this.field9771 = class555.field7786[arg0 & 0x3FFF];
        this.field9753 = class555.field7796[arg0 & 0x3FFF];
        this.field9773 = this.field9782 = this.field9758 = this.field9775 = this.field9776 = this.field9764 = this.field9774 = 0.0F;
        this.field9755 = -this.field9753;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([I)V", line = 351)
    public final void method1968(int[] arg0) {
        field9785++;
        float var2 = (float) arg0[0] - this.field9782;
        float var3 = (float) arg0[1] - this.field9775;
        float var4 = (float) arg0[2] - this.field9774;
        arg0[0] = (int) (this.field9776 * var4 + this.field9763 * var2 + this.field9753 * var3);
        arg0[2] = (int) (this.field9756 * var4 + this.field9773 * var2 + this.field9758 * var3);
        arg0[1] = (int) (this.field9764 * var4 + this.field9771 * var3 + this.field9755 * var2);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B[FFFFF)V", line = 372)
    public final void method3848(byte arg0, float[] arg1, float arg2, float arg3, float arg4, float arg5) {
        field9751++;
        arg1[2] = this.field9756 * arg3 + this.field9776 * arg2 + this.field9764 * arg5;
        float var8;
        float var9;
        float var10;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var12 = -arg4 / arg2;
            var10 = this.field9763 * var12 + this.field9782;
            var8 = this.field9753 * var12 + this.field9775;
            var9 = this.field9776 * var12 + this.field9774;
        } else if ((arg5 > 0.00390625F) || (arg5 < -0.00390625F)) {
            float var11 = -arg4 / arg5;
            var9 = this.field9764 * var11 + this.field9774;
            var8 = this.field9771 * var11 + this.field9775;
            var10 = this.field9755 * var11 + this.field9782;
        } else {
            float var7 = -arg4 / arg3;
            var8 = this.field9758 * var7 + this.field9775;
            var9 = this.field9756 * var7 + this.field9774;
            var10 = this.field9773 * var7 + this.field9782;
        }
        arg1[1] = this.field9758 * arg3 + this.field9771 * arg5 + this.field9753 * arg2;
        arg1[0] = this.field9773 * arg3 + this.field9763 * arg2 + this.field9755 * arg5;
        arg1[3] = -(arg1[2] * var9 + arg1[1] * var8 + arg1[0] * var10);
        if (arg0 < 32) {
            method3851(-121, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "(I)V", line = 416)
    public static void method3849(int arg0) {
        field9749 = null;
        field9759 = null;
        field9766 = null;
        if (arg0 == -1) {
            field9783 = null;
            field9761 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "()V", line = 431)
    public final void method1962() {
        this.field9753 = this.field9776 = this.field9755 = this.field9764 = this.field9773 = this.field9758 = this.field9782 = this.field9775 = this.field9774 = 0.0F;
        field9770++;
        this.field9763 = this.field9771 = this.field9756 = 1.0F;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(FIFIFII)V", line = 444)
    public final void method3850(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6) {
        if (arg5 == 0) {
            this.field9756 = 1.0F;
            this.field9763 = arg1;
            this.field9771 = arg6;
            this.field9753 = this.field9776 = this.field9755 = this.field9764 = this.field9773 = this.field9758 = 0.0F;
        } else {
            float var8 = class555.field7786[arg5 & 0x3FFF];
            float var9 = class555.field7796[arg5 & 0x3FFF];
            this.field9755 = (float) arg6 * -var9;
            this.field9753 = (float) arg1 * var9;
            this.field9756 = 1.0F;
            this.field9776 = this.field9764 = this.field9773 = this.field9758 = 0.0F;
            this.field9771 = (float) arg6 * var8;
            this.field9763 = (float) arg1 * var8;
        }
        if (arg3 > -25) {
            this.method1973(58, 114, -80);
        }
        field9760++;
        this.field9775 = arg0;
        this.field9774 = arg4;
        this.field9782 = arg2;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V", line = 481)
    public final void method1964(int arg0) {
        field9768++;
        this.field9763 = 1.0F;
        this.field9771 = this.field9756 = class555.field7786[arg0 & 0x3FFF];
        this.field9764 = class555.field7796[arg0 & 0x3FFF];
        this.field9755 = this.field9773 = this.field9782 = this.field9753 = this.field9775 = this.field9776 = this.field9774 = 0.0F;
        this.field9758 = -this.field9764;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IB)V", line = 495)
    public static final void method3851(int arg0, byte arg1) {
        if (arg1 != 80) {
            field9761 = null;
        }
        field9748++;
        class345.field4470 = -1;
        class758.field10552 = arg0;
        class345.field4470 = -1;
        class608.method3333((byte) -61);
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(III[I)V", line = 514)
    public final void method1971(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field9773 + (float) arg0 * this.field9763 + (float) arg1 * this.field9755 + this.field9782);
        field9765++;
        arg3[1] = (int) ((float) arg2 * this.field9758 + (float) arg0 * this.field9753 + (float) arg1 * this.field9771 + this.field9775);
        arg3[2] = (int) ((float) arg2 * this.field9756 + (float) arg0 * this.field9776 + (float) arg1 * this.field9764 + this.field9774);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V", line = 524)
    public class688() {
        this.method1962();
    }
}
