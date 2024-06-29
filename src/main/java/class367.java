import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class367 extends class111 {

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Z")
    public static boolean field5274 = false;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field5273 = 0;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lvi;")
    public static class560 field5272 = new class560(64);

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "F")
    public float field5258;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "F")
    public float field5259;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "F")
    public float field5262;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "F")
    public float field5264;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "F")
    public float field5266;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "F")
    public float field5267;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "F")
    public float field5269;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "F")
    public float field5270;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "F")
    public float field5276;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "F")
    public float field5279;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "F")
    public float field5286;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "F")
    public float field5291;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "[Lxa;")
    public static class424[] field5293;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "(III[I)V")
    public final void method598(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5266 + (float) arg0 * this.field5291 + (float) arg1 * this.field5264);
        arg3[0] = (int) ((float) arg2 * this.field5262 + (float) arg0 * this.field5286 + (float) arg1 * this.field5276);
        field5257++;
        arg3[2] = (int) ((float) arg2 * this.field5267 + (float) arg0 * this.field5270 + (float) arg1 * this.field5258);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)[F")
    public final float[] method2257(byte arg0) {
        class52.field684[13] = this.field5259;
        class52.field684[1] = this.field5291;
        class52.field684[9] = this.field5266;
        class52.field684[14] = this.field5279;
        class52.field684[12] = this.field5269;
        class52.field684[8] = this.field5262;
        field5260++;
        int var2 = -122 / ((arg0 - 49) / 56);
        class52.field684[10] = this.field5267;
        class52.field684[2] = this.field5270;
        class52.field684[5] = this.field5264;
        class52.field684[6] = this.field5258;
        class52.field684[0] = this.field5286;
        class52.field684[4] = this.field5276;
        return class52.field684;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIFFFII)V")
    public final void method2258(byte arg0, int arg1, float arg2, float arg3, float arg4, int arg5, int arg6) {
        field5292++;
        if (arg6 == 0) {
            this.field5264 = arg1;
            this.field5286 = arg5;
            this.field5267 = 1.0F;
            this.field5291 = this.field5270 = this.field5276 = this.field5258 = this.field5262 = this.field5266 = 0.0F;
        } else {
            float var8 = class144.field1837[arg6 & 0x3FFF];
            float var9 = class144.field1838[arg6 & 0x3FFF];
            this.field5267 = 1.0F;
            this.field5291 = (float) arg5 * var9;
            this.field5286 = (float) arg5 * var8;
            this.field5270 = this.field5258 = this.field5262 = this.field5266 = 0.0F;
            this.field5264 = (float) arg1 * var8;
            this.field5276 = (float) arg1 * -var9;
        }
        this.field5259 = arg3;
        this.field5279 = arg4;
        this.field5269 = arg2;
        int var10 = -43 % ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLq;)V")
    public final void method2259(boolean arg0, class111 arg1) {
        field5288++;
        class367 var3 = (class367) arg1;
        this.field5276 = var3.field5291;
        this.field5286 = var3.field5286;
        this.field5262 = var3.field5270;
        this.field5270 = var3.field5262;
        this.field5291 = var3.field5276;
        this.field5264 = var3.field5264;
        this.field5266 = var3.field5258;
        this.field5267 = var3.field5267;
        if (!arg0) {
            this.field5258 = 0.7172714F;
        }
        this.field5269 = -(this.field5262 * var3.field5279 + this.field5286 * var3.field5269 + this.field5276 * var3.field5259);
        this.field5258 = var3.field5266;
        this.field5259 = -(this.field5266 * var3.field5279 + this.field5291 * var3.field5269 + this.field5264 * var3.field5259);
        this.field5279 = -(this.field5267 * var3.field5279 + this.field5270 * var3.field5269 + this.field5258 * var3.field5259);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)[F")
    public final float[] method2260(byte arg0) {
        class52.field684[12] = 0.0F;
        class52.field684[0] = this.field5286;
        class52.field684[1] = this.field5291;
        class52.field684[13] = 0.0F;
        class52.field684[2] = this.field5270;
        class52.field684[6] = this.field5258;
        field5282++;
        if (arg0 != 27) {
            this.field5286 = -0.22140738F;
        }
        class52.field684[9] = this.field5266;
        class52.field684[4] = this.field5276;
        class52.field684[10] = this.field5267;
        class52.field684[14] = 0.0F;
        class52.field684[8] = this.field5262;
        class52.field684[5] = this.field5264;
        return class52.field684;
    }

    @OriginalMember(owner = "client!gb", name = "XA", descriptor = "(I)V")
    public final void method603(int arg0) {
        field5277++;
        this.field5286 = 1.0F;
        this.field5264 = this.field5267 = class144.field1837[arg0 & 0x3FFF];
        this.field5258 = class144.field1838[arg0 & 0x3FFF];
        this.field5276 = this.field5262 = this.field5269 = this.field5291 = this.field5259 = this.field5270 = this.field5279 = 0.0F;
        this.field5266 = -this.field5258;
    }

    @OriginalMember(owner = "client!gb", name = "la", descriptor = "(Lq;)V")
    public final void method597(class111 arg0) {
        field5287++;
        class367 var2 = (class367) arg0;
        this.field5269 = var2.field5269;
        this.field5286 = var2.field5286;
        this.field5258 = var2.field5258;
        this.field5267 = var2.field5267;
        this.field5276 = var2.field5276;
        this.field5262 = var2.field5262;
        this.field5279 = var2.field5279;
        this.field5270 = var2.field5270;
        this.field5266 = var2.field5266;
        this.field5264 = var2.field5264;
        this.field5259 = var2.field5259;
        this.field5291 = var2.field5291;
    }

    @OriginalMember(owner = "client!gb", name = "GA", descriptor = "(III)V")
    public final void method609(int arg0, int arg1, int arg2) {
        this.field5291 = this.field5270 = this.field5276 = this.field5258 = this.field5262 = this.field5266 = 0.0F;
        this.field5269 = arg0;
        field5290++;
        this.field5259 = arg1;
        this.field5279 = arg2;
        this.field5286 = this.field5264 = this.field5267 = 1.0F;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Lq;")
    public final class111 method596() {
        field5275++;
        class367 var1 = new class367();
        var1.field5291 = this.field5291;
        var1.field5276 = this.field5276;
        var1.field5264 = this.field5264;
        var1.field5269 = this.field5269;
        var1.field5258 = this.field5258;
        var1.field5270 = this.field5270;
        var1.field5259 = this.field5259;
        var1.field5286 = this.field5286;
        var1.field5262 = this.field5262;
        var1.field5266 = this.field5266;
        var1.field5279 = this.field5279;
        var1.field5267 = this.field5267;
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "([I)V")
    public final void method599(int[] arg0) {
        field5261++;
        float var2 = (float) arg0[0] - this.field5269;
        float var3 = (float) arg0[1] - this.field5259;
        float var4 = (float) arg0[2] - this.field5279;
        arg0[2] = (int) (this.field5267 * var4 + this.field5266 * var3 + this.field5262 * var2);
        arg0[0] = (int) (this.field5270 * var4 + this.field5291 * var3 + this.field5286 * var2);
        arg0[1] = (int) (this.field5258 * var4 + this.field5276 * var2 + this.field5264 * var3);
    }

    @OriginalMember(owner = "client!gb", name = "pa", descriptor = "(IIIIII)V")
    public final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5263++;
        float var7 = class144.field1837[arg3 & 0x3FFF];
        float var8 = class144.field1838[arg3 & 0x3FFF];
        float var9 = class144.field1837[arg4 & 0x3FFF];
        float var10 = class144.field1838[arg4 & 0x3FFF];
        float var11 = class144.field1837[arg5 & 0x3FFF];
        float var12 = class144.field1838[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5270 = var7 * var10;
        this.field5291 = -var9 * var12 + var10 * var13;
        this.field5276 = var7 * var12;
        this.field5262 = -var10 * var11 + var9 * var14;
        this.field5267 = var7 * var9;
        this.field5264 = var7 * var11;
        this.field5258 = -var8;
        this.field5286 = var9 * var11 + var10 * var14;
        this.field5266 = var9 * var13 + var10 * var12;
        this.field5259 = (float) (-arg0) * this.field5291 - ((float) arg1 * this.field5264) - (float) arg2 * this.field5266;
        this.field5279 = (float) (-arg0) * this.field5270 - (float) arg1 * this.field5258 - (float) arg2 * this.field5267;
        this.field5269 = (float) (-arg0) * this.field5286 - (float) arg1 * this.field5276 - ((float) arg2 * this.field5262);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method604(int arg0) {
        field5268++;
        this.field5264 = 1.0F;
        this.field5286 = this.field5267 = class144.field1837[arg0 & 0x3FFF];
        this.field5262 = class144.field1838[arg0 & 0x3FFF];
        this.field5270 = -this.field5262;
        this.field5276 = this.field5269 = this.field5291 = this.field5266 = this.field5259 = this.field5258 = this.field5279 = 0.0F;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
    public static final void method2261(int arg0, byte arg1) {
        field5283++;
        class522.field7230 = -1;
        if (arg1 > 113) {
            class52.field677 = arg0;
            class92.field1131 = -1;
            class511.method2892(-1);
        }
    }

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "(III)V")
    public final void method595(int arg0, int arg1, int arg2) {
        this.field5269 += arg0;
        field5280++;
        this.field5259 += arg1;
        this.field5279 += arg2;
    }

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "(I)V")
    public final void method601(int arg0) {
        field5285++;
        float var2 = class144.field1837[arg0 & 0x3FFF];
        float var3 = class144.field1838[arg0 & 0x3FFF];
        float var4 = this.field5286;
        float var5 = this.field5276;
        float var6 = this.field5262;
        float var7 = this.field5269;
        this.field5286 = this.field5270 * var3 + var2 * var4;
        this.field5276 = this.field5258 * var3 + var2 * var5;
        this.field5270 = this.field5270 * var2 - (var3 * var4);
        this.field5262 = this.field5267 * var3 + var2 * var6;
        this.field5258 = this.field5258 * var2 - var3 * var5;
        this.field5267 = this.field5267 * var2 - (var3 * var6);
        this.field5269 = this.field5279 * var3 + var2 * var7;
        this.field5279 = this.field5279 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method2262(boolean arg0) {
        field5289++;
        class428 var1 = null;
        try {
            class280 var2 = class495.field6687.method625(arg0, -25857, "3");
            while (var2.field3773 == 0) {
                class660.method3668(-1, 1L);
            }
            if (var2.field3773 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class428) var2.field3772;
            byte[] var3 = new byte[(int) var1.method2468(0)];
            if (var3.length == 0) {
                class438.field6042 = "";
                class487.field6576 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2466(var3, (byte) -60, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class138 var6 = new class138(var3);
                int var7 = var6.method957((byte) -98);
                if (var7 > 60) {
                    throw new RuntimeException("Bad length");
                }
                var6.field1745 = var7 + 1;
                if (!var6.method940(4)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field1745 = 1;
                int var8 = var6.method957((byte) -66);
                if (var8 > 2) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class438.field6042 = var6.method926(2);
                class487.field6576 = var6.method926(2);
                if (var8 >= 1) {
                    class421.field5873 = var6.method922((byte) -121);
                } else {
                    class421.field5873 = class625.field8511;
                }
                if (var8 < 2) {
                    class216.field2787 = class636.field8670;
                } else {
                    class216.field2787 = var6.method949(110);
                }
            }
        } catch (Exception var10) {
            class438.field6042 = "";
            class487.field6576 = "";
        }
        try {
            if (var1 != null) {
                var1.method2467((byte) 106);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "(I)V")
    public final void method606(int arg0) {
        field5278++;
        float var2 = class144.field1837[arg0 & 0x3FFF];
        float var3 = class144.field1838[arg0 & 0x3FFF];
        float var4 = this.field5291;
        float var5 = this.field5264;
        float var6 = this.field5266;
        float var7 = this.field5259;
        this.field5291 = var2 * var4 - this.field5270 * var3;
        this.field5264 = var2 * var5 - (this.field5258 * var3);
        this.field5270 = this.field5270 * var2 + var3 * var4;
        this.field5266 = var2 * var6 - (this.field5267 * var3);
        this.field5258 = this.field5258 * var2 + var3 * var5;
        this.field5267 = this.field5267 * var2 + var3 * var6;
        this.field5259 = var2 * var7 - (this.field5279 * var3);
        this.field5279 = this.field5279 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
    public static final int method2263(int arg0, int arg1) {
        if (arg0 != 16383) {
            method2261(62, (byte) 109);
        }
        field5284++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I)V")
    public final void method608(int arg0, int arg1, int arg2, int[] arg3) {
        field5271++;
        arg3[2] = (int) ((float) arg2 * this.field5267 + (float) arg0 * this.field5270 + (float) arg1 * this.field5258 + this.field5279);
        arg3[0] = (int) ((float) arg2 * this.field5262 + (float) arg0 * this.field5286 + (float) arg1 * this.field5276 + this.field5269);
        arg3[1] = (int) ((float) arg2 * this.field5266 + (float) arg0 * this.field5291 + (float) arg1 * this.field5264 + this.field5259);
    }

    @OriginalMember(owner = "client!gb", name = "ra", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.field5267 = 1.0F;
        field5281++;
        this.field5286 = this.field5264 = class144.field1837[arg0 & 0x3FFF];
        this.field5291 = class144.field1838[arg0 & 0x3FFF];
        this.field5276 = -this.field5291;
        this.field5262 = this.field5269 = this.field5266 = this.field5259 = this.field5270 = this.field5258 = this.field5279 = 0.0F;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field5293 = null;
        field5272 = null;
        int var1 = -61 % ((arg0 - 61) / 59);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class367() {
        this.method600();
    }

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "()V")
    public final void method600() {
        this.field5291 = this.field5270 = this.field5276 = this.field5258 = this.field5262 = this.field5266 = this.field5269 = this.field5259 = this.field5279 = 0.0F;
        field5265++;
        this.field5286 = this.field5264 = this.field5267 = 1.0F;
    }
}
