import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class452 extends class142 {

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "[I")
    public static int[] field6291 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "Lad;")
    public static class11 field6297 = new class11(4);

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Lpb;")
    public static class296 field6319 = new class296("", 12);

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "F")
    public float field6286;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "F")
    public float field6288;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "F")
    public float field6289;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "F")
    public float field6290;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "F")
    public float field6294;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "F")
    public float field6301;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "F")
    public float field6306;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "F")
    public float field6309;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "F")
    public float field6313;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "F")
    public float field6316;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "F")
    public float field6317;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "F")
    public float field6318;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!sf", name = "ma", descriptor = "(I)V", line = 3)
    public final void method985(int arg0) {
        field6304++;
        this.field6294 = 1.0F;
        this.field6289 = this.field6316 = class92.field1278[arg0 & 0x3FFF];
        this.field6318 = class92.field1275[arg0 & 0x3FFF];
        this.field6290 = this.field6309 = this.field6313 = this.field6317 = this.field6301 = this.field6288 = this.field6286 = 0.0F;
        this.field6306 = -this.field6318;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[I)V", line = 18)
    public final void method992(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field6290 + (float) arg0 * this.field6289 + (float) arg1 * this.field6306 + this.field6309);
        arg3[2] = (int) ((float) arg2 * this.field6294 + (float) arg0 * this.field6301 + (float) arg1 * this.field6288 + this.field6286);
        arg3[1] = (int) ((float) arg2 * this.field6313 + (float) arg0 * this.field6318 + (float) arg1 * this.field6316 + this.field6317);
        field6287++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 29)
    public static void method2675(boolean arg0) {
        if (!arg0) {
            field6320 = 70;
        }
        field6319 = null;
        field6297 = null;
        field6291 = null;
    }

    @OriginalMember(owner = "client!sf", name = "YA", descriptor = "(I)V", line = 42)
    public final void method991(int arg0) {
        field6315++;
        this.field6289 = 1.0F;
        this.field6316 = this.field6294 = class92.field1278[arg0 & 0x3FFF];
        this.field6288 = class92.field1275[arg0 & 0x3FFF];
        this.field6313 = -this.field6288;
        this.field6306 = this.field6290 = this.field6309 = this.field6318 = this.field6317 = this.field6301 = this.field6286 = 0.0F;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lia;I)V", line = 54)
    public final void method2676(class142 arg0, int arg1) {
        field6293++;
        class452 var3 = (class452) arg0;
        this.field6290 = var3.field6301;
        this.field6289 = var3.field6289;
        if (arg1 != 8) {
            this.method2678((byte) -118);
        }
        this.field6306 = var3.field6318;
        this.field6318 = var3.field6306;
        this.field6316 = var3.field6316;
        this.field6313 = var3.field6288;
        this.field6301 = var3.field6290;
        this.field6309 = -(this.field6290 * var3.field6286 + this.field6306 * var3.field6317 + this.field6289 * var3.field6309);
        this.field6294 = var3.field6294;
        this.field6288 = var3.field6313;
        this.field6317 = -(this.field6313 * var3.field6286 + this.field6318 * var3.field6309 + this.field6316 * var3.field6317);
        this.field6286 = -(this.field6294 * var3.field6286 + this.field6301 * var3.field6309 + this.field6288 * var3.field6317);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)V", line = 78)
    public static final void method2677(int arg0, int arg1, boolean arg2) {
        field6305++;
        class436 var3 = class459.method2712(14, arg1, -1759243680);
        if (!arg2) {
            method2675(false);
        }
        var3.method2574((byte) 115);
        var3.field5980 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 94)
    public final void method990(int arg0) {
        field6303++;
        float var2 = class92.field1278[arg0 & 0x3FFF];
        float var3 = class92.field1275[arg0 & 0x3FFF];
        float var4 = this.field6289;
        float var5 = this.field6306;
        float var6 = this.field6290;
        float var7 = this.field6309;
        this.field6289 = this.field6301 * var3 + var2 * var4;
        this.field6306 = this.field6288 * var3 + var2 * var5;
        this.field6301 = this.field6301 * var2 - var3 * var4;
        this.field6288 = this.field6288 * var2 - var3 * var5;
        this.field6290 = this.field6294 * var3 + var2 * var6;
        this.field6294 = this.field6294 * var2 - var3 * var6;
        this.field6309 = this.field6286 * var3 + var2 * var7;
        this.field6286 = this.field6286 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "(III[I)V", line = 122)
    public final void method980(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field6313 + (float) arg0 * this.field6318 + (float) arg1 * this.field6316);
        arg3[0] = (int) ((float) arg2 * this.field6290 + (float) arg0 * this.field6289 + (float) arg1 * this.field6306);
        field6308++;
        arg3[2] = (int) ((float) arg2 * this.field6294 + (float) arg0 * this.field6301 + (float) arg1 * this.field6288);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Lia;", line = 137)
    public final class142 method977() {
        field6285++;
        class452 var1 = new class452();
        var1.field6306 = this.field6306;
        var1.field6309 = this.field6309;
        var1.field6290 = this.field6290;
        var1.field6316 = this.field6316;
        var1.field6313 = this.field6313;
        var1.field6289 = this.field6289;
        var1.field6294 = this.field6294;
        var1.field6288 = this.field6288;
        var1.field6318 = this.field6318;
        var1.field6317 = this.field6317;
        var1.field6301 = this.field6301;
        var1.field6286 = this.field6286;
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "([I)V", line = 160)
    public final void method983(int[] arg0) {
        field6298++;
        float var2 = (float) arg0[0] - this.field6309;
        float var3 = (float) arg0[1] - this.field6317;
        float var4 = (float) arg0[2] - this.field6286;
        arg0[0] = (int) (this.field6301 * var4 + this.field6318 * var3 + this.field6289 * var2);
        arg0[1] = (int) (this.field6288 * var4 + this.field6316 * var3 + this.field6306 * var2);
        arg0[2] = (int) (this.field6294 * var4 + this.field6313 * var3 + this.field6290 * var2);
    }

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "(I)V", line = 177)
    public final void method986(int arg0) {
        this.field6316 = 1.0F;
        field6314++;
        this.field6289 = this.field6294 = class92.field1278[arg0 & 0x3FFF];
        this.field6290 = class92.field1275[arg0 & 0x3FFF];
        this.field6306 = this.field6309 = this.field6318 = this.field6313 = this.field6317 = this.field6288 = this.field6286 = 0.0F;
        this.field6301 = -this.field6290;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)[F", line = 189)
    public final float[] method2678(byte arg0) {
        class56.field756[2] = this.field6301;
        if (arg0 != -40) {
            this.method993(-9, -120, 57);
        }
        class56.field756[14] = 0.0F;
        class56.field756[0] = this.field6289;
        class56.field756[13] = 0.0F;
        class56.field756[9] = this.field6313;
        class56.field756[5] = this.field6316;
        field6295++;
        class56.field756[4] = this.field6306;
        class56.field756[12] = 0.0F;
        class56.field756[1] = this.field6318;
        class56.field756[6] = this.field6288;
        class56.field756[10] = this.field6294;
        class56.field756[8] = this.field6290;
        return class56.field756;
    }

    @OriginalMember(owner = "client!sf", name = "ba", descriptor = "(Lia;)V", line = 212)
    public final void method988(class142 arg0) {
        field6299++;
        class452 var2 = (class452) arg0;
        this.field6318 = var2.field6318;
        this.field6290 = var2.field6290;
        this.field6288 = var2.field6288;
        this.field6316 = var2.field6316;
        this.field6313 = var2.field6313;
        this.field6286 = var2.field6286;
        this.field6309 = var2.field6309;
        this.field6294 = var2.field6294;
        this.field6289 = var2.field6289;
        this.field6317 = var2.field6317;
        this.field6301 = var2.field6301;
        this.field6306 = var2.field6306;
    }

    @OriginalMember(owner = "client!sf", name = "ZA", descriptor = "(III)V", line = 235)
    public final void method993(int arg0, int arg1, int arg2) {
        this.field6286 += arg2;
        this.field6309 += arg0;
        this.field6317 += arg1;
        field6292++;
    }

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "(III)V", line = 252)
    public final void method982(int arg0, int arg1, int arg2) {
        this.field6289 = this.field6316 = this.field6294 = 1.0F;
        this.field6309 = arg0;
        this.field6286 = arg2;
        field6311++;
        this.field6317 = arg1;
        this.field6318 = this.field6301 = this.field6306 = this.field6288 = this.field6290 = this.field6313 = 0.0F;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lbn;", line = 264)
    public static final class301 method2679(int arg0) {
        int var1 = 118 / ((arg0 - 60) / 39);
        field6300++;
        try {
            return (class301) Class.forName("pv").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FIFIBFI)V", line = 282)
    public final void method2680(float arg0, int arg1, float arg2, int arg3, byte arg4, float arg5, int arg6) {
        int var8 = 94 / ((63 - arg4) / 41);
        if (arg6 == 0) {
            this.field6318 = this.field6301 = this.field6306 = this.field6288 = this.field6290 = this.field6313 = 0.0F;
            this.field6289 = arg1;
            this.field6316 = arg3;
            this.field6294 = 1.0F;
        } else {
            float var9 = class92.field1278[arg6 & 0x3FFF];
            float var10 = class92.field1275[arg6 & 0x3FFF];
            this.field6318 = (float) arg1 * var10;
            this.field6306 = (float) arg3 * -var10;
            this.field6301 = this.field6288 = this.field6290 = this.field6313 = 0.0F;
            this.field6289 = (float) arg1 * var9;
            this.field6316 = (float) arg3 * var9;
            this.field6294 = 1.0F;
        }
        field6302++;
        this.field6309 = arg5;
        this.field6317 = arg0;
        this.field6286 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "HA", descriptor = "()V", line = 322)
    public final void method979() {
        this.field6318 = this.field6301 = this.field6306 = this.field6288 = this.field6290 = this.field6313 = this.field6309 = this.field6317 = this.field6286 = 0.0F;
        this.field6289 = this.field6316 = this.field6294 = 1.0F;
        field6312++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)[F", line = 336)
    public final float[] method2681(byte arg0) {
        class56.field756[4] = this.field6306;
        class56.field756[13] = this.field6317;
        class56.field756[6] = this.field6288;
        class56.field756[5] = this.field6316;
        class56.field756[0] = this.field6289;
        class56.field756[12] = this.field6309;
        class56.field756[8] = this.field6290;
        field6310++;
        class56.field756[1] = this.field6318;
        class56.field756[14] = this.field6286;
        class56.field756[2] = this.field6301;
        if (arg0 <= 84) {
            this.method983(null);
        }
        class56.field756[9] = this.field6313;
        class56.field756[10] = this.field6294;
        return class56.field756;
    }

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "(IIIIII)V", line = 360)
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6296++;
        float var7 = class92.field1278[arg3 & 0x3FFF];
        float var8 = class92.field1275[arg3 & 0x3FFF];
        float var9 = class92.field1278[arg4 & 0x3FFF];
        float var10 = class92.field1275[arg4 & 0x3FFF];
        float var11 = class92.field1278[arg5 & 0x3FFF];
        float var12 = class92.field1275[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6294 = var7 * var9;
        this.field6290 = -var10 * var11 + var9 * var14;
        this.field6301 = var7 * var10;
        this.field6313 = var9 * var13 + var10 * var12;
        this.field6288 = -var8;
        this.field6316 = var7 * var11;
        this.field6306 = var7 * var12;
        this.field6289 = var9 * var11 + var10 * var14;
        this.field6318 = -var9 * var12 + var10 * var13;
        this.field6309 = (float) (-arg0) * this.field6289 - (float) arg1 * this.field6306 - ((float) arg2 * this.field6290);
        this.field6286 = (float) (-arg0) * this.field6301 - (float) arg1 * this.field6288 - ((float) arg2 * this.field6294);
        this.field6317 = (float) (-arg0) * this.field6318 - ((float) arg1 * this.field6316) - ((float) arg2 * this.field6313);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 399)
    public class452() {
        this.method979();
    }

    @OriginalMember(owner = "client!sf", name = "na", descriptor = "(I)V", line = 409)
    public final void method981(int arg0) {
        field6307++;
        float var2 = class92.field1278[arg0 & 0x3FFF];
        float var3 = class92.field1275[arg0 & 0x3FFF];
        float var4 = this.field6318;
        float var5 = this.field6316;
        float var6 = this.field6313;
        this.field6318 = var2 * var4 - this.field6301 * var3;
        float var7 = this.field6317;
        this.field6301 = this.field6301 * var2 + var3 * var4;
        this.field6316 = var2 * var5 - (this.field6288 * var3);
        this.field6313 = var2 * var6 - this.field6294 * var3;
        this.field6288 = this.field6288 * var2 + var3 * var5;
        this.field6317 = var2 * var7 - this.field6286 * var3;
        this.field6294 = this.field6294 * var2 + var3 * var6;
        this.field6286 = this.field6286 * var2 + var3 * var7;
    }
}
