import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class246 extends class202 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field4214 = new String[8];

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "F")
    public float field4205;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "F")
    public float field4207;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "F")
    public float field4211;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "F")
    public float field4212;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "F")
    public float field4213;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "F")
    public float field4216;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "F")
    public float field4219;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "F")
    public float field4220;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "F")
    public float field4222;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "F")
    public float field4223;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "F")
    public float field4234;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "F")
    public float field4235;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Luq;")
    public static class346 field4203;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lza;")
    public static class491 field4225;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)[F")
    public final float[] method1675(int arg0) {
        int var2 = -53 / ((arg0 + 32) / 35);
        class1.field11[6] = this.field4234;
        class1.field11[1] = this.field4216;
        class1.field11[13] = this.field4223;
        class1.field11[9] = this.field4211;
        class1.field11[8] = this.field4219;
        class1.field11[5] = this.field4235;
        class1.field11[0] = this.field4207;
        class1.field11[4] = this.field4205;
        class1.field11[10] = this.field4222;
        field4204++;
        class1.field11[14] = this.field4213;
        class1.field11[2] = this.field4212;
        class1.field11[12] = this.field4220;
        return class1.field11;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1676(byte arg0) {
        field4214 = null;
        int var1 = 5 / ((arg0 + 70) / 55);
        field4225 = null;
        field4203 = null;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V")
    public final void method1239(int arg0) {
        this.field4207 = 1.0F;
        field4218++;
        this.field4235 = this.field4222 = class302.field4842[arg0 & 0x3FFF];
        this.field4234 = class302.field4843[arg0 & 0x3FFF];
        this.field4205 = this.field4219 = this.field4220 = this.field4216 = this.field4223 = this.field4212 = this.field4213 = 0.0F;
        this.field4211 = -this.field4234;
    }

    @OriginalMember(owner = "client!nb", name = "EA", descriptor = "(I)V")
    public final void method1245(int arg0) {
        field4229++;
        float var2 = class302.field4842[arg0 & 0x3FFF];
        float var3 = class302.field4843[arg0 & 0x3FFF];
        float var4 = this.field4207;
        float var5 = this.field4205;
        float var6 = this.field4219;
        this.field4207 = this.field4212 * var3 + var2 * var4;
        float var7 = this.field4220;
        this.field4205 = this.field4234 * var3 + var2 * var5;
        this.field4212 = this.field4212 * var2 - (var3 * var4);
        this.field4219 = this.field4222 * var3 + var2 * var6;
        this.field4234 = this.field4234 * var2 - (var3 * var5);
        this.field4220 = this.field4213 * var3 + var2 * var7;
        this.field4222 = this.field4222 * var2 - var3 * var6;
        this.field4213 = this.field4213 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "()V")
    public final void method1244() {
        field4208++;
        this.field4207 = this.field4235 = this.field4222 = 1.0F;
        this.field4216 = this.field4212 = this.field4205 = this.field4234 = this.field4219 = this.field4211 = this.field4220 = this.field4223 = this.field4213 = 0.0F;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method1677(int arg0, int arg1, int arg2) {
        field4224++;
        class266 var3 = class308.method1961(true, arg2, 6);
        if (arg1 <= -106) {
            var3.method1781((byte) 95);
            var3.field4454 = arg0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "(III[I)V")
    public final void method1249(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field4222 + (float) arg0 * this.field4212 + (float) arg1 * this.field4234);
        field4226++;
        arg3[1] = (int) ((float) arg2 * this.field4211 + (float) arg0 * this.field4216 + (float) arg1 * this.field4235);
        arg3[0] = (int) ((float) arg2 * this.field4219 + (float) arg0 * this.field4207 + (float) arg1 * this.field4205);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILc;)V")
    public final void method1678(int arg0, class202 arg1) {
        field4210++;
        class246 var3 = (class246) arg1;
        this.field4205 = var3.field4216;
        this.field4207 = var3.field4207;
        this.field4219 = var3.field4212;
        this.field4216 = var3.field4205;
        this.field4212 = var3.field4219;
        this.field4211 = var3.field4234;
        int var4 = -94 / ((arg0 - 38) / 44);
        this.field4235 = var3.field4235;
        this.field4234 = var3.field4211;
        this.field4222 = var3.field4222;
        this.field4220 = -(this.field4219 * var3.field4213 + this.field4207 * var3.field4220 + this.field4205 * var3.field4223);
        this.field4223 = -(this.field4211 * var3.field4213 + this.field4235 * var3.field4223 + this.field4216 * var3.field4220);
        this.field4213 = -(this.field4222 * var3.field4213 + this.field4234 * var3.field4223 + this.field4212 * var3.field4220);
    }

    @OriginalMember(owner = "client!nb", name = "wa", descriptor = "([I)V")
    public final void method1240(int[] arg0) {
        field4232++;
        float var2 = (float) arg0[0] - this.field4220;
        float var3 = (float) arg0[1] - this.field4223;
        float var4 = (float) arg0[2] - this.field4213;
        arg0[1] = (int) (this.field4234 * var4 + this.field4235 * var3 + this.field4205 * var2);
        arg0[0] = (int) (this.field4212 * var4 + this.field4216 * var3 + this.field4207 * var2);
        arg0[2] = (int) (this.field4222 * var4 + this.field4219 * var2 + this.field4211 * var3);
    }

    @OriginalMember(owner = "client!nb", name = "ea", descriptor = "(I)V")
    public final void method1243(int arg0) {
        field4228++;
        float var2 = class302.field4842[arg0 & 0x3FFF];
        float var3 = class302.field4843[arg0 & 0x3FFF];
        float var4 = this.field4216;
        float var5 = this.field4235;
        float var6 = this.field4211;
        this.field4216 = var2 * var4 - this.field4212 * var3;
        float var7 = this.field4223;
        this.field4235 = var2 * var5 - this.field4234 * var3;
        this.field4212 = this.field4212 * var2 + var3 * var4;
        this.field4211 = var2 * var6 - (this.field4222 * var3);
        this.field4234 = this.field4234 * var2 + var3 * var5;
        this.field4223 = var2 * var7 - (this.field4213 * var3);
        this.field4222 = this.field4222 * var2 + var3 * var6;
        this.field4213 = this.field4213 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "(III)V")
    public final void method1237(int arg0, int arg1, int arg2) {
        this.field4213 += arg2;
        this.field4223 += arg1;
        field4227++;
        this.field4220 += arg0;
    }

    @OriginalMember(owner = "client!nb", name = "ca", descriptor = "(I)V")
    public final void method1250(int arg0) {
        field4209++;
        this.field4235 = 1.0F;
        this.field4207 = this.field4222 = class302.field4842[arg0 & 0x3FFF];
        this.field4219 = class302.field4843[arg0 & 0x3FFF];
        this.field4205 = this.field4220 = this.field4216 = this.field4211 = this.field4223 = this.field4234 = this.field4213 = 0.0F;
        this.field4212 = -this.field4219;
    }

    @OriginalMember(owner = "client!nb", name = "ha", descriptor = "(Lc;)V")
    public final void method1241(class202 arg0) {
        field4221++;
        class246 var2 = (class246) arg0;
        this.field4207 = var2.field4207;
        this.field4223 = var2.field4223;
        this.field4216 = var2.field4216;
        this.field4211 = var2.field4211;
        this.field4220 = var2.field4220;
        this.field4212 = var2.field4212;
        this.field4219 = var2.field4219;
        this.field4205 = var2.field4205;
        this.field4222 = var2.field4222;
        this.field4234 = var2.field4234;
        this.field4235 = var2.field4235;
        this.field4213 = var2.field4213;
    }

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "(I)V")
    public final void method1248(int arg0) {
        field4206++;
        this.field4222 = 1.0F;
        this.field4207 = this.field4235 = class302.field4842[arg0 & 0x3FFF];
        this.field4216 = class302.field4843[arg0 & 0x3FFF];
        this.field4205 = -this.field4216;
        this.field4219 = this.field4220 = this.field4211 = this.field4223 = this.field4212 = this.field4234 = this.field4213 = 0.0F;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(FIFIIFI)V")
    public final void method1679(float arg0, int arg1, float arg2, int arg3, int arg4, float arg5, int arg6) {
        if (arg4 == 0) {
            this.field4207 = arg3;
            this.field4235 = arg1;
            this.field4222 = 1.0F;
            this.field4216 = this.field4212 = this.field4205 = this.field4234 = this.field4219 = this.field4211 = 0.0F;
        } else {
            float var8 = class302.field4842[arg4 & 0x3FFF];
            float var9 = class302.field4843[arg4 & 0x3FFF];
            this.field4222 = 1.0F;
            this.field4216 = (float) arg3 * var9;
            this.field4207 = (float) arg3 * var8;
            this.field4235 = (float) arg1 * var8;
            this.field4205 = (float) arg1 * -var9;
            this.field4212 = this.field4234 = this.field4219 = this.field4211 = 0.0F;
        }
        field4233++;
        if (arg6 <= 12) {
            this.method1244();
        }
        this.field4213 = arg5;
        this.field4223 = arg2;
        this.field4220 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "YA", descriptor = "(IIIIII)V")
    public final void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4215++;
        float var7 = class302.field4842[arg3 & 0x3FFF];
        float var8 = class302.field4843[arg3 & 0x3FFF];
        float var9 = class302.field4842[arg4 & 0x3FFF];
        float var10 = class302.field4843[arg4 & 0x3FFF];
        float var11 = class302.field4842[arg5 & 0x3FFF];
        float var12 = class302.field4843[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field4222 = var7 * var9;
        this.field4234 = -var8;
        this.field4207 = var9 * var11 + var10 * var14;
        this.field4219 = -var10 * var11 + var9 * var14;
        this.field4212 = var7 * var10;
        this.field4235 = var7 * var11;
        this.field4205 = var7 * var12;
        this.field4211 = var9 * var13 + var10 * var12;
        this.field4216 = -var9 * var12 + var10 * var13;
        this.field4213 = (float) (-arg0) * this.field4212 - (float) arg1 * this.field4234 - ((float) arg2 * this.field4222);
        this.field4223 = (float) (-arg0) * this.field4216 - (float) arg1 * this.field4235 - ((float) arg2 * this.field4211);
        this.field4220 = (float) (-arg0) * this.field4207 - ((float) arg1 * this.field4205) - ((float) arg2 * this.field4219);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)[F")
    public final float[] method1680(int arg0) {
        class1.field11[2] = this.field4212;
        field4236++;
        class1.field11[14] = 0.0F;
        class1.field11[12] = 0.0F;
        class1.field11[13] = 0.0F;
        if (arg0 != 13528) {
            this.field4213 = 0.69322675F;
        }
        class1.field11[4] = this.field4205;
        class1.field11[5] = this.field4235;
        class1.field11[0] = this.field4207;
        class1.field11[6] = this.field4234;
        class1.field11[8] = this.field4219;
        class1.field11[1] = this.field4216;
        class1.field11[9] = this.field4211;
        class1.field11[10] = this.field4222;
        return class1.field11;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lc;")
    public final class202 method1242() {
        field4230++;
        class246 var1 = new class246();
        var1.field4223 = this.field4223;
        var1.field4205 = this.field4205;
        var1.field4211 = this.field4211;
        var1.field4220 = this.field4220;
        var1.field4235 = this.field4235;
        var1.field4219 = this.field4219;
        var1.field4213 = this.field4213;
        var1.field4222 = this.field4222;
        var1.field4234 = this.field4234;
        var1.field4212 = this.field4212;
        var1.field4207 = this.field4207;
        var1.field4216 = this.field4216;
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[I)V")
    public final void method1238(int arg0, int arg1, int arg2, int[] arg3) {
        field4231++;
        arg3[2] = (int) ((float) arg2 * this.field4222 + (float) arg0 * this.field4212 + (float) arg1 * this.field4234 + this.field4213);
        arg3[0] = (int) ((float) arg2 * this.field4219 + (float) arg0 * this.field4207 + (float) arg1 * this.field4205 + this.field4220);
        arg3[1] = (int) ((float) arg2 * this.field4211 + (float) arg0 * this.field4216 + (float) arg1 * this.field4235 + this.field4223);
    }

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "(III)V")
    public final void method1246(int arg0, int arg1, int arg2) {
        field4217++;
        this.field4207 = this.field4235 = this.field4222 = 1.0F;
        this.field4216 = this.field4212 = this.field4205 = this.field4234 = this.field4219 = this.field4211 = 0.0F;
        this.field4223 = arg1;
        this.field4213 = arg2;
        this.field4220 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class246() {
        this.method1244();
    }
}
