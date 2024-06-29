import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class495 extends class517 {

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "[I")
    public static int[] field7223 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "F")
    public float field7209;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "F")
    public float field7210;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "F")
    public float field7214;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "F")
    public float field7216;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "F")
    public float field7221;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "F")
    public float field7229;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "F")
    public float field7230;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "F")
    public float field7231;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "F")
    public float field7233;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "F")
    public float field7235;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "F")
    public float field7236;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "F")
    public float field7237;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!gl", name = "wa", descriptor = "([I)V")
    public final void method958(int[] arg0) {
        field7222++;
        float var2 = (float) arg0[0] - this.field7216;
        float var3 = (float) arg0[1] - this.field7210;
        float var4 = (float) arg0[2] - this.field7229;
        arg0[1] = (int) (this.field7221 * var4 + this.field7236 * var3 + this.field7235 * var2);
        arg0[0] = (int) (this.field7214 * var4 + this.field7233 * var2 + this.field7231 * var3);
        arg0[2] = (int) (this.field7237 * var4 + this.field7230 * var2 + this.field7209 * var3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)[F")
    public final float[] method2964(byte arg0) {
        class377.field5567[2] = this.field7214;
        class377.field5567[9] = this.field7209;
        class377.field5567[6] = this.field7221;
        class377.field5567[5] = this.field7236;
        class377.field5567[4] = this.field7235;
        class377.field5567[10] = this.field7237;
        class377.field5567[8] = this.field7230;
        class377.field5567[0] = this.field7233;
        class377.field5567[1] = this.field7231;
        field7232++;
        class377.field5567[12] = 0.0F;
        class377.field5567[13] = 0.0F;
        int var2 = -63 / ((arg0 - 70) / 38);
        class377.field5567[14] = 0.0F;
        return class377.field5567;
    }

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "(III)V")
    public final void method957(int arg0, int arg1, int arg2) {
        this.field7210 += arg1;
        this.field7216 += arg0;
        field7224++;
        this.field7229 += arg2;
    }

    @OriginalMember(owner = "client!gl", name = "ha", descriptor = "(Lc;)V")
    public final void method962(class517 arg0) {
        field7212++;
        class495 var2 = (class495) arg0;
        this.field7230 = var2.field7230;
        this.field7237 = var2.field7237;
        this.field7236 = var2.field7236;
        this.field7231 = var2.field7231;
        this.field7209 = var2.field7209;
        this.field7210 = var2.field7210;
        this.field7229 = var2.field7229;
        this.field7221 = var2.field7221;
        this.field7216 = var2.field7216;
        this.field7233 = var2.field7233;
        this.field7235 = var2.field7235;
        this.field7214 = var2.field7214;
    }

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "()V")
    public final void method964() {
        field7217++;
        this.field7231 = this.field7214 = this.field7235 = this.field7221 = this.field7230 = this.field7209 = this.field7216 = this.field7210 = this.field7229 = 0.0F;
        this.field7233 = this.field7236 = this.field7237 = 1.0F;
    }

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "(III[I)V")
    public final void method965(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7237 + (float) arg0 * this.field7214 + (float) arg1 * this.field7221);
        field7225++;
        arg3[1] = (int) ((float) arg2 * this.field7209 + (float) arg0 * this.field7231 + (float) arg1 * this.field7236);
        arg3[0] = (int) ((float) arg2 * this.field7230 + (float) arg0 * this.field7233 + (float) arg1 * this.field7235);
    }

    @OriginalMember(owner = "client!gl", name = "EA", descriptor = "(I)V")
    public final void method952(int arg0) {
        field7211++;
        float var2 = class275.field4328[arg0 & 0x3FFF];
        float var3 = class275.field4327[arg0 & 0x3FFF];
        float var4 = this.field7233;
        float var5 = this.field7235;
        float var6 = this.field7230;
        this.field7233 = this.field7214 * var3 + var2 * var4;
        float var7 = this.field7216;
        this.field7235 = this.field7221 * var3 + var2 * var5;
        this.field7214 = this.field7214 * var2 - (var3 * var4);
        this.field7221 = this.field7221 * var2 - var3 * var5;
        this.field7230 = this.field7237 * var3 + var2 * var6;
        this.field7237 = this.field7237 * var2 - var3 * var6;
        this.field7216 = this.field7229 * var3 + var2 * var7;
        this.field7229 = this.field7229 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static final void method2965(byte arg0) {
        field7226++;
        if (arg0 != -105) {
            method2965((byte) -15);
        }
        if (class517.field7509 <= 0) {
            class406.field6002 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class86.field1415.length; var2++) {
            if (class86.field1415[var2].startsWith("--> ")) {
                int var10000 = ~class517.field7509;
                var1++;
                if (var10000 == ~var1) {
                    class406.field6002 = class86.field1415[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()Lc;")
    public final class517 method950() {
        field7207++;
        class495 var1 = new class495();
        var1.field7221 = this.field7221;
        var1.field7237 = this.field7237;
        var1.field7214 = this.field7214;
        var1.field7230 = this.field7230;
        var1.field7209 = this.field7209;
        var1.field7231 = this.field7231;
        var1.field7210 = this.field7210;
        var1.field7229 = this.field7229;
        var1.field7235 = this.field7235;
        var1.field7233 = this.field7233;
        var1.field7236 = this.field7236;
        var1.field7216 = this.field7216;
        return var1;
    }

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "(III)V")
    public final void method951(int arg0, int arg1, int arg2) {
        field7208++;
        this.field7210 = arg1;
        this.field7231 = this.field7214 = this.field7235 = this.field7221 = this.field7230 = this.field7209 = 0.0F;
        this.field7229 = arg2;
        this.field7233 = this.field7236 = this.field7237 = 1.0F;
        this.field7216 = arg0;
    }

    @OriginalMember(owner = "client!gl", name = "ca", descriptor = "(I)V")
    public final void method960(int arg0) {
        this.field7236 = 1.0F;
        field7219++;
        this.field7233 = this.field7237 = class275.field4328[arg0 & 0x3FFF];
        this.field7230 = class275.field4327[arg0 & 0x3FFF];
        this.field7214 = -this.field7230;
        this.field7235 = this.field7216 = this.field7231 = this.field7209 = this.field7210 = this.field7221 = this.field7229 = 0.0F;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(FIBFIIF)V")
    public final void method2966(float arg0, int arg1, byte arg2, float arg3, int arg4, int arg5, float arg6) {
        if (arg5 == 0) {
            this.field7233 = arg4;
            this.field7231 = this.field7214 = this.field7235 = this.field7221 = this.field7230 = this.field7209 = 0.0F;
            this.field7236 = arg1;
            this.field7237 = 1.0F;
        } else {
            float var8 = class275.field4328[arg5 & 0x3FFF];
            float var9 = class275.field4327[arg5 & 0x3FFF];
            this.field7231 = (float) arg4 * var9;
            this.field7236 = (float) arg1 * var8;
            this.field7237 = 1.0F;
            this.field7214 = this.field7221 = this.field7230 = this.field7209 = 0.0F;
            this.field7235 = (float) arg1 * -var9;
            this.field7233 = (float) arg4 * var8;
        }
        field7239++;
        if (arg2 <= -87) {
            this.field7210 = arg3;
            this.field7229 = arg6;
            this.field7216 = arg0;
        }
    }

    @OriginalMember(owner = "client!gl", name = "YA", descriptor = "(IIIIII)V")
    public final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7218++;
        float var7 = class275.field4328[arg3 & 0x3FFF];
        float var8 = class275.field4327[arg3 & 0x3FFF];
        float var9 = class275.field4328[arg4 & 0x3FFF];
        float var10 = class275.field4327[arg4 & 0x3FFF];
        float var11 = class275.field4328[arg5 & 0x3FFF];
        float var12 = class275.field4327[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7237 = var7 * var9;
        this.field7221 = -var8;
        this.field7233 = var9 * var11 + var10 * var14;
        this.field7214 = var7 * var10;
        this.field7230 = -var10 * var11 + var9 * var14;
        this.field7209 = var9 * var13 + var10 * var12;
        this.field7236 = var7 * var11;
        this.field7231 = -var9 * var12 + var10 * var13;
        this.field7235 = var7 * var12;
        this.field7229 = (float) (-arg0) * this.field7214 - (float) arg1 * this.field7221 - ((float) arg2 * this.field7237);
        this.field7216 = (float) (-arg0) * this.field7233 - (float) arg1 * this.field7235 - (float) arg2 * this.field7230;
        this.field7210 = (float) (-arg0) * this.field7231 - ((float) arg1 * this.field7236) - ((float) arg2 * this.field7209);
    }

    @OriginalMember(owner = "client!gl", name = "ea", descriptor = "(I)V")
    public final void method959(int arg0) {
        field7215++;
        float var2 = class275.field4328[arg0 & 0x3FFF];
        float var3 = class275.field4327[arg0 & 0x3FFF];
        float var4 = this.field7231;
        float var5 = this.field7236;
        float var6 = this.field7209;
        this.field7231 = var2 * var4 - this.field7214 * var3;
        float var7 = this.field7210;
        this.field7214 = this.field7214 * var2 + var3 * var4;
        this.field7236 = var2 * var5 - this.field7221 * var3;
        this.field7209 = var2 * var6 - (this.field7237 * var3);
        this.field7221 = this.field7221 * var2 + var3 * var5;
        this.field7237 = this.field7237 * var2 + var3 * var6;
        this.field7210 = var2 * var7 - (this.field7229 * var3);
        this.field7229 = this.field7229 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILum;IIZI)V")
    public static final void method2967(int arg0, int arg1, class83 arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class215.field3250 = arg5;
        class134.field1992 = arg2;
        class367.field5417 = arg6;
        class169.field2569 = arg0;
        field7213++;
        class40.field655 = arg1;
        class386.field5678 = 1;
        class439.field6547 = class192.field2954.method2385((byte) -128) / arg4;
        if (class439.field6547 < arg3) {
            class439.field6547 = 1;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILc;)V")
    public final void method2968(int arg0, class517 arg1) {
        field7238++;
        class495 var3 = (class495) arg1;
        this.field7233 = var3.field7233;
        this.field7230 = var3.field7214;
        this.field7235 = var3.field7231;
        this.field7236 = var3.field7236;
        this.field7209 = var3.field7221;
        this.field7214 = var3.field7230;
        this.field7231 = var3.field7235;
        this.field7216 = -(this.field7230 * var3.field7229 + this.field7235 * var3.field7210 + this.field7233 * var3.field7216);
        if (arg0 != 1121) {
            this.method962(null);
        }
        this.field7237 = var3.field7237;
        this.field7221 = var3.field7209;
        this.field7210 = -(this.field7209 * var3.field7229 + this.field7236 * var3.field7210 + this.field7231 * var3.field7216);
        this.field7229 = -(this.field7237 * var3.field7229 + this.field7221 * var3.field7210 + this.field7214 * var3.field7216);
    }

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "(I)V")
    public final void method954(int arg0) {
        field7228++;
        this.field7237 = 1.0F;
        this.field7233 = this.field7236 = class275.field4328[arg0 & 0x3FFF];
        this.field7231 = class275.field4327[arg0 & 0x3FFF];
        this.field7230 = this.field7216 = this.field7209 = this.field7210 = this.field7214 = this.field7221 = this.field7229 = 0.0F;
        this.field7235 = -this.field7231;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)[F")
    public final float[] method2969(int arg0) {
        class377.field5567[5] = this.field7236;
        class377.field5567[1] = this.field7231;
        if (arg0 != -1) {
            this.method961(5, -109, 37, null);
        }
        class377.field5567[0] = this.field7233;
        class377.field5567[9] = this.field7209;
        class377.field5567[14] = this.field7229;
        class377.field5567[2] = this.field7214;
        class377.field5567[8] = this.field7230;
        class377.field5567[12] = this.field7216;
        class377.field5567[6] = this.field7221;
        class377.field5567[13] = this.field7210;
        class377.field5567[4] = this.field7235;
        class377.field5567[10] = this.field7237;
        field7227++;
        return class377.field5567;
    }

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V")
    public final void method963(int arg0) {
        field7234++;
        this.field7233 = 1.0F;
        this.field7236 = this.field7237 = class275.field4328[arg0 & 0x3FFF];
        this.field7221 = class275.field4327[arg0 & 0x3FFF];
        this.field7209 = -this.field7221;
        this.field7235 = this.field7230 = this.field7216 = this.field7231 = this.field7210 = this.field7214 = this.field7229 = 0.0F;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public static void method2970(int arg0) {
        field7223 = null;
        if (arg0 >= -46) {
            method2965((byte) 114);
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class495() {
        this.method964();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III[I)V")
    public final void method961(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field7230 + (float) arg0 * this.field7233 + (float) arg1 * this.field7235 + this.field7216);
        arg3[1] = (int) ((float) arg2 * this.field7209 + (float) arg0 * this.field7231 + (float) arg1 * this.field7236 + this.field7210);
        arg3[2] = (int) ((float) arg2 * this.field7237 + (float) arg0 * this.field7214 + (float) arg1 * this.field7221 + this.field7229);
        field7220++;
    }
}
