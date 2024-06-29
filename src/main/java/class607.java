import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class607 extends class738 {

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "Lbh;")
    public static class37 field8585 = new class37("LIVE", "", "", 0);

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "[Lao;")
    public static class288[] field8593 = new class288[14];

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "F")
    public float field8558;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "F")
    public float field8562;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "F")
    public float field8563;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "F")
    public float field8564;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "F")
    public float field8567;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "F")
    public float field8572;

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "F")
    public float field8575;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "F")
    public float field8578;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "F")
    public float field8581;

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "F")
    public float field8583;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "F")
    public float field8590;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "F")
    public float field8591;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
    public static int field8579;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!ou", name = "O", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(FIFF[FF)V")
    public final void method3518(float arg0, int arg1, float arg2, float arg3, float[] arg4, float arg5) {
        field8568++;
        if (arg1 != 16383) {
            return;
        }
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg0 / arg3;
            var9 = this.field8578 * var12 + this.field8590;
            var8 = this.field8562 * var12 + this.field8575;
            var10 = this.field8583 * var12 + this.field8563;
        } else if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var11 = -arg0 / arg2;
            var8 = this.field8572 * var11 + this.field8575;
            var9 = this.field8564 * var11 + this.field8590;
            var10 = this.field8567 * var11 + this.field8563;
        } else {
            float var7 = -arg0 / arg5;
            var8 = this.field8591 * var7 + this.field8575;
            var9 = this.field8558 * var7 + this.field8590;
            var10 = this.field8581 * var7 + this.field8563;
        }
        arg4[1] = this.field8558 * arg5 + this.field8578 * arg3 + this.field8564 * arg2;
        arg4[2] = this.field8581 * arg5 + this.field8583 * arg3 + this.field8567 * arg2;
        arg4[0] = this.field8591 * arg5 + this.field8572 * arg2 + this.field8562 * arg3;
        arg4[3] = -(arg4[2] * var10 + arg4[1] * var9 + arg4[0] * var8);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(III[I)V")
    public final void method767(int arg0, int arg1, int arg2, int[] arg3) {
        field8584++;
        arg3[2] = (int) ((float) arg2 * this.field8581 + (float) arg0 * this.field8583 + (float) arg1 * this.field8567 + this.field8563);
        arg3[0] = (int) ((float) arg2 * this.field8591 + (float) arg0 * this.field8562 + (float) arg1 * this.field8572 + this.field8575);
        arg3[1] = (int) ((float) arg2 * this.field8558 + (float) arg0 * this.field8578 + (float) arg1 * this.field8564 + this.field8590);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V")
    public static void method3519(boolean arg0) {
        if (!arg0) {
            method3519(false);
        }
        field8593 = null;
        field8585 = null;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)[F")
    public final float[] method3520(byte arg0) {
        field8577++;
        class135.field1804[0] = this.field8562;
        class135.field1804[5] = this.field8564;
        class135.field1804[13] = this.field8590;
        class135.field1804[2] = this.field8583;
        class135.field1804[6] = this.field8567;
        class135.field1804[1] = this.field8578;
        class135.field1804[4] = this.field8572;
        class135.field1804[9] = this.field8558;
        class135.field1804[14] = this.field8563;
        class135.field1804[12] = this.field8575;
        if (arg0 == -120) {
            class135.field1804[8] = this.field8591;
            class135.field1804[10] = this.field8581;
            return class135.field1804;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
    public final void method774(int arg0, int arg1, int arg2) {
        this.field8578 = this.field8583 = this.field8572 = this.field8567 = this.field8591 = this.field8558 = 0.0F;
        this.field8590 = arg1;
        this.field8562 = this.field8564 = this.field8581 = 1.0F;
        field8566++;
        this.field8563 = arg2;
        this.field8575 = arg0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
    public final void method769() {
        this.field8578 = this.field8583 = this.field8572 = this.field8567 = this.field8591 = this.field8558 = this.field8575 = this.field8590 = this.field8563 = 0.0F;
        this.field8562 = this.field8564 = this.field8581 = 1.0F;
        field8559++;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(III[I)V")
    public final void method776(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field8581 + (float) arg0 * this.field8583 + (float) arg1 * this.field8567);
        field8561++;
        arg3[1] = (int) ((float) arg2 * this.field8558 + (float) arg0 * this.field8578 + (float) arg1 * this.field8564);
        arg3[0] = (int) ((float) arg2 * this.field8591 + (float) arg0 * this.field8562 + (float) arg1 * this.field8572);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([I)V")
    public final void method771(int[] arg0) {
        field8586++;
        float var2 = (float) arg0[0] - this.field8575;
        float var3 = (float) arg0[1] - this.field8590;
        float var4 = (float) arg0[2] - this.field8563;
        arg0[2] = (int) (this.field8581 * var4 + this.field8591 * var2 + this.field8558 * var3);
        arg0[0] = (int) (this.field8583 * var4 + this.field8578 * var3 + this.field8562 * var2);
        arg0[1] = (int) (this.field8567 * var4 + this.field8572 * var2 + this.field8564 * var3);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILql;)V")
    public final void method3521(int arg0, class738 arg1) {
        field8565++;
        class607 var3 = (class607) arg1;
        this.field8572 = var3.field8578;
        this.field8591 = var3.field8583;
        this.field8562 = var3.field8562;
        this.field8583 = var3.field8591;
        this.field8558 = var3.field8567;
        this.field8564 = var3.field8564;
        this.field8578 = var3.field8572;
        this.field8575 = -(this.field8591 * var3.field8563 + this.field8572 * var3.field8590 + this.field8562 * var3.field8575);
        this.field8581 = var3.field8581;
        this.field8567 = var3.field8558;
        if (arg0 != 8) {
            this.field8572 = 0.76214176F;
        }
        this.field8590 = -(this.field8558 * var3.field8563 + this.field8578 * var3.field8575 + this.field8564 * var3.field8590);
        this.field8563 = -(this.field8581 * var3.field8563 + this.field8583 * var3.field8575 + this.field8567 * var3.field8590);
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(B)[F")
    public final float[] method3522(byte arg0) {
        class135.field1804[2] = this.field8583;
        class135.field1804[10] = this.field8581;
        class135.field1804[6] = this.field8567;
        class135.field1804[5] = this.field8564;
        class135.field1804[13] = 0.0F;
        class135.field1804[1] = this.field8578;
        if (arg0 != 8) {
            return null;
        }
        class135.field1804[8] = this.field8591;
        class135.field1804[14] = 0.0F;
        class135.field1804[9] = this.field8558;
        class135.field1804[12] = 0.0F;
        class135.field1804[4] = this.field8572;
        class135.field1804[0] = this.field8562;
        field8576++;
        return class135.field1804;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lql;)V")
    public final void method772(class738 arg0) {
        field8574++;
        class607 var2 = (class607) arg0;
        this.field8564 = var2.field8564;
        this.field8590 = var2.field8590;
        this.field8558 = var2.field8558;
        this.field8563 = var2.field8563;
        this.field8575 = var2.field8575;
        this.field8581 = var2.field8581;
        this.field8583 = var2.field8583;
        this.field8572 = var2.field8572;
        this.field8567 = var2.field8567;
        this.field8591 = var2.field8591;
        this.field8562 = var2.field8562;
        this.field8578 = var2.field8578;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public final void method765(int arg0) {
        field8570++;
        this.field8562 = 1.0F;
        this.field8564 = this.field8581 = class241.field3510[arg0 & 0x3FFF];
        this.field8567 = class241.field3509[arg0 & 0x3FFF];
        this.field8558 = -this.field8567;
        this.field8572 = this.field8591 = this.field8575 = this.field8578 = this.field8590 = this.field8583 = this.field8563 = 0.0F;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()Lql;")
    public final class738 method759() {
        field8560++;
        class607 var1 = new class607();
        var1.field8578 = this.field8578;
        var1.field8591 = this.field8591;
        var1.field8567 = this.field8567;
        var1.field8558 = this.field8558;
        var1.field8583 = this.field8583;
        var1.field8562 = this.field8562;
        var1.field8563 = this.field8563;
        var1.field8581 = this.field8581;
        var1.field8590 = this.field8590;
        var1.field8575 = this.field8575;
        var1.field8572 = this.field8572;
        var1.field8564 = this.field8564;
        return var1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III[I)V")
    public final void method766(int arg0, int arg1, int arg2, int[] arg3) {
        field8569++;
        int var5 = (int) ((float) arg1 - this.field8590);
        int var6 = (int) ((float) arg0 - this.field8575);
        int var7 = (int) ((float) arg2 - this.field8563);
        arg3[0] = (int) ((float) var7 * this.field8583 + (float) var5 * this.field8578 + (float) var6 * this.field8562);
        arg3[1] = (int) ((float) var7 * this.field8567 + (float) var5 * this.field8564 + (float) var6 * this.field8572);
        arg3[2] = (int) ((float) var7 * this.field8581 + (float) var5 * this.field8558 + (float) var6 * this.field8591);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIII)V")
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8587++;
        float var7 = class241.field3510[arg3 & 0x3FFF];
        float var8 = class241.field3509[arg3 & 0x3FFF];
        float var9 = class241.field3510[arg4 & 0x3FFF];
        float var10 = class241.field3509[arg4 & 0x3FFF];
        float var11 = class241.field3510[arg5 & 0x3FFF];
        float var12 = class241.field3509[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field8578 = -var9 * var12 + var10 * var13;
        this.field8572 = var7 * var12;
        this.field8583 = var7 * var10;
        this.field8591 = -var10 * var11 + var9 * var14;
        this.field8581 = var7 * var9;
        this.field8558 = var9 * var13 + var10 * var12;
        this.field8564 = var7 * var11;
        this.field8562 = var9 * var11 + var10 * var14;
        this.field8567 = -var8;
        this.field8590 = (float) (-arg0) * this.field8578 - (float) arg1 * this.field8564 - ((float) arg2 * this.field8558);
        this.field8563 = (float) (-arg0) * this.field8583 - (float) arg1 * this.field8567 - (float) arg2 * this.field8581;
        this.field8575 = (float) (-arg0) * this.field8562 - (float) arg1 * this.field8572 - ((float) arg2 * this.field8591);
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
    public final void method764(int arg0) {
        this.field8564 = 1.0F;
        field8594++;
        this.field8562 = this.field8581 = class241.field3510[arg0 & 0x3FFF];
        this.field8591 = class241.field3509[arg0 & 0x3FFF];
        this.field8583 = -this.field8591;
        this.field8572 = this.field8575 = this.field8578 = this.field8558 = this.field8590 = this.field8567 = this.field8563 = 0.0F;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IFFIFII)V")
    public final void method3523(int arg0, float arg1, float arg2, int arg3, float arg4, int arg5, int arg6) {
        field8592++;
        if (arg5 == 0) {
            this.field8578 = this.field8583 = this.field8572 = this.field8567 = this.field8591 = this.field8558 = 0.0F;
            this.field8562 = arg3;
            this.field8581 = 1.0F;
            this.field8564 = arg6;
        } else {
            float var8 = class241.field3510[arg5 & 0x3FFF];
            float var9 = class241.field3509[arg5 & 0x3FFF];
            this.field8572 = (float) arg6 * -var9;
            this.field8578 = (float) arg3 * var9;
            this.field8564 = (float) arg6 * var8;
            this.field8562 = (float) arg3 * var8;
            this.field8583 = this.field8567 = this.field8591 = this.field8558 = 0.0F;
            this.field8581 = 1.0F;
        }
        if (arg0 < 1) {
            this.field8558 = 1.3591331F;
        }
        this.field8575 = arg4;
        this.field8563 = arg2;
        this.field8590 = arg1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public final void method763(int arg0) {
        field8588++;
        float var2 = class241.field3510[arg0 & 0x3FFF];
        float var3 = class241.field3509[arg0 & 0x3FFF];
        float var4 = this.field8578;
        float var5 = this.field8564;
        float var6 = this.field8558;
        float var7 = this.field8590;
        this.field8578 = var2 * var4 - (this.field8583 * var3);
        this.field8583 = this.field8583 * var2 + var3 * var4;
        this.field8564 = var2 * var5 - this.field8567 * var3;
        this.field8567 = this.field8567 * var2 + var3 * var5;
        this.field8558 = var2 * var6 - (this.field8581 * var3);
        this.field8590 = var2 * var7 - this.field8563 * var3;
        this.field8581 = this.field8581 * var2 + var3 * var6;
        this.field8563 = this.field8563 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "(I)V")
    public final void method3524(int arg0) {
        this.field8583 = -this.field8583;
        this.field8567 = -this.field8567;
        this.field8564 = -this.field8564;
        this.field8581 = -this.field8581;
        if (arg0 != 3) {
            this.method777(-44);
        }
        this.field8563 = -this.field8563;
        this.field8578 = -this.field8578;
        field8571++;
        this.field8590 = -this.field8590;
        this.field8558 = -this.field8558;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
    public final void method777(int arg0) {
        this.field8581 = 1.0F;
        field8589++;
        this.field8562 = this.field8564 = class241.field3510[arg0 & 0x3FFF];
        this.field8578 = class241.field3509[arg0 & 0x3FFF];
        this.field8572 = -this.field8578;
        this.field8591 = this.field8575 = this.field8558 = this.field8590 = this.field8583 = this.field8567 = this.field8563 = 0.0F;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(III)V")
    public final void method758(int arg0, int arg1, int arg2) {
        field8582++;
        this.field8575 += arg0;
        this.field8563 += arg2;
        this.field8590 += arg1;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
    public final void method768(int arg0) {
        field8579++;
        float var2 = class241.field3510[arg0 & 0x3FFF];
        float var3 = class241.field3509[arg0 & 0x3FFF];
        float var4 = this.field8562;
        float var5 = this.field8572;
        float var6 = this.field8591;
        float var7 = this.field8575;
        this.field8562 = this.field8583 * var3 + var2 * var4;
        this.field8572 = this.field8567 * var3 + var2 * var5;
        this.field8583 = this.field8583 * var2 - var3 * var4;
        this.field8567 = this.field8567 * var2 - (var3 * var5);
        this.field8591 = this.field8581 * var3 + var2 * var6;
        this.field8575 = this.field8563 * var3 + var2 * var7;
        this.field8581 = this.field8581 * var2 - var3 * var6;
        this.field8563 = this.field8563 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)V")
    public final void method760(int arg0) {
        field8580++;
        float var2 = class241.field3510[arg0 & 0x3FFF];
        float var3 = class241.field3509[arg0 & 0x3FFF];
        float var4 = this.field8562;
        float var5 = this.field8572;
        float var6 = this.field8591;
        float var7 = this.field8575;
        this.field8562 = var2 * var4 - this.field8578 * var3;
        this.field8578 = this.field8578 * var2 + var3 * var4;
        this.field8572 = var2 * var5 - this.field8564 * var3;
        this.field8564 = this.field8564 * var2 + var3 * var5;
        this.field8591 = var2 * var6 - (this.field8558 * var3);
        this.field8575 = var2 * var7 - this.field8590 * var3;
        this.field8558 = this.field8558 * var2 + var3 * var6;
        this.field8590 = this.field8590 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
    public class607() {
        this.method769();
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
    public static final void method3525(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        field8573++;
        if (arg3 != -58) {
            method3525(-64, null, 36, (byte) -33, -27);
        }
        class46 var5 = class700.method3972(arg0, arg2, true);
        if (var5 == null) {
            return;
        }
        if (var5.field608 != null) {
            class177 var6 = new class177();
            var6.field2743 = var5;
            var6.field2751 = arg1;
            var6.field2737 = var5.field608;
            var6.field2735 = arg4;
            class709.method4025(var6);
        }
        if (class87.field1246 != 10 || !client.method1886(var5).method1556(arg4 - 1, arg3 ^ 0xFFFFFFB4)) {
            return;
        }
        if (arg4 == 1) {
            class355.field5160++;
            class468 var7 = class93.method734(class29.field284, class627.field8772, arg3 ^ 0xFFFFE028);
            class386.method2489(0, arg2, var5.field687, var7, arg0);
            class120.method872((byte) 33, var7);
        }
        if (arg4 == 2) {
            class77.field1071++;
            class468 var8 = class93.method734(class29.field284, class170.field2654, 8174);
            class386.method2489(0, arg2, var5.field687, var8, arg0);
            class120.method872((byte) 99, var8);
        }
        if (arg4 == 3) {
            class38.field392++;
            class468 var9 = class93.method734(class29.field284, class51.field736, 8174);
            class386.method2489(0, arg2, var5.field687, var9, arg0);
            class120.method872((byte) 107, var9);
        }
        if (arg4 == 4) {
            class443.field6589++;
            class468 var10 = class93.method734(class29.field284, class384.field5810, 8174);
            class386.method2489(0, arg2, var5.field687, var10, arg0);
            class120.method872((byte) -55, var10);
        }
        if (arg4 == 5) {
            class8.field98++;
            class468 var11 = class93.method734(class29.field284, class702.field9789, 8174);
            class386.method2489(0, arg2, var5.field687, var11, arg0);
            class120.method872((byte) 70, var11);
        }
        if (arg4 == 6) {
            class383.field5790++;
            class468 var12 = class93.method734(class29.field284, class33.field348, 8174);
            class386.method2489(0, arg2, var5.field687, var12, arg0);
            class120.method872((byte) 78, var12);
        }
        if (arg4 == 7) {
            class128.field1717++;
            class468 var13 = class93.method734(class29.field284, class391.field5892, 8174);
            class386.method2489(0, arg2, var5.field687, var13, arg0);
            class120.method872((byte) -59, var13);
        }
        if (arg4 == 8) {
            class710.field10003++;
            class468 var14 = class93.method734(class29.field284, class712.field10046, arg3 ^ 0xFFFFE028);
            class386.method2489(0, arg2, var5.field687, var14, arg0);
            class120.method872((byte) 127, var14);
        }
        if (arg4 == 9) {
            class402.field5983++;
            class468 var15 = class93.method734(class29.field284, class353.field5135, arg3 + 8232);
            class386.method2489(0, arg2, var5.field687, var15, arg0);
            class120.method872((byte) -55, var15);
        }
        if (arg4 == 10) {
            class739.field10363++;
            class468 var16 = class93.method734(class29.field284, class10.field153, 8174);
            class386.method2489(0, arg2, var5.field687, var16, arg0);
            class120.method872((byte) -123, var16);
        }
    }
}
