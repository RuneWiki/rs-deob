import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class447 extends class121 {

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "F")
    public float field6367;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "F")
    public float field6372;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "F")
    public float field6373;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "F")
    public float field6374;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "F")
    public float field6375;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "F")
    public float field6379;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "F")
    public float field6381;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "F")
    public float field6383;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "F")
    public float field6384;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "F")
    public float field6391;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "F")
    public float field6393;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "F")
    public float field6394;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V")
    public final void method852(int arg0) {
        field6377++;
        float var2 = class472.field6698[arg0 & 0x3FFF];
        float var3 = class472.field6699[arg0 & 0x3FFF];
        float var4 = this.field6391;
        float var5 = this.field6384;
        float var6 = this.field6375;
        this.field6391 = this.field6379 * var3 + var2 * var4;
        float var7 = this.field6383;
        this.field6384 = this.field6381 * var3 + var2 * var5;
        this.field6379 = this.field6379 * var2 - (var3 * var4);
        this.field6375 = this.field6373 * var3 + var2 * var6;
        this.field6381 = this.field6381 * var2 - var3 * var5;
        this.field6373 = this.field6373 * var2 - var3 * var6;
        this.field6383 = this.field6372 * var3 + var2 * var7;
        this.field6372 = this.field6372 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()V")
    public final void method851() {
        this.field6394 = this.field6379 = this.field6384 = this.field6381 = this.field6375 = this.field6393 = this.field6383 = this.field6367 = this.field6372 = 0.0F;
        field6380++;
        this.field6391 = this.field6374 = this.field6373 = 1.0F;
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)V")
    public final void method858(int arg0) {
        this.field6373 = 1.0F;
        field6376++;
        this.field6391 = this.field6374 = class472.field6698[arg0 & 0x3FFF];
        this.field6394 = class472.field6699[arg0 & 0x3FFF];
        this.field6384 = -this.field6394;
        this.field6375 = this.field6383 = this.field6393 = this.field6367 = this.field6379 = this.field6381 = this.field6372 = 0.0F;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([I)V")
    public final void method846(int[] arg0) {
        field6371++;
        float var2 = (float) arg0[0] - this.field6383;
        float var3 = (float) arg0[1] - this.field6367;
        float var4 = (float) arg0[2] - this.field6372;
        arg0[0] = (int) (this.field6379 * var4 + this.field6394 * var3 + this.field6391 * var2);
        arg0[1] = (int) (this.field6381 * var4 + this.field6384 * var2 + this.field6374 * var3);
        arg0[2] = (int) (this.field6373 * var4 + this.field6393 * var3 + this.field6375 * var2);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public final void method842(int arg0) {
        field6385++;
        this.field6391 = 1.0F;
        this.field6374 = this.field6373 = class472.field6698[arg0 & 0x3FFF];
        this.field6381 = class472.field6699[arg0 & 0x3FFF];
        this.field6384 = this.field6375 = this.field6383 = this.field6394 = this.field6367 = this.field6379 = this.field6372 = 0.0F;
        this.field6393 = -this.field6381;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIII)V")
    public final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6366++;
        float var7 = class472.field6698[arg3 & 0x3FFF];
        float var8 = class472.field6699[arg3 & 0x3FFF];
        float var9 = class472.field6698[arg4 & 0x3FFF];
        float var10 = class472.field6699[arg4 & 0x3FFF];
        float var11 = class472.field6698[arg5 & 0x3FFF];
        float var12 = class472.field6699[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6373 = var7 * var9;
        this.field6393 = var9 * var13 + var10 * var12;
        this.field6375 = -var10 * var11 + var9 * var14;
        this.field6381 = -var8;
        this.field6391 = var9 * var11 + var10 * var14;
        this.field6394 = -var9 * var12 + var10 * var13;
        this.field6384 = var7 * var12;
        this.field6374 = var7 * var11;
        this.field6379 = var7 * var10;
        this.field6372 = (float) (-arg0) * this.field6379 - ((float) arg1 * this.field6381) - ((float) arg2 * this.field6373);
        this.field6367 = (float) (-arg0) * this.field6394 - (float) arg1 * this.field6374 - ((float) arg2 * this.field6393);
        this.field6383 = (float) (-arg0) * this.field6391 - ((float) arg1 * this.field6384) - ((float) arg2 * this.field6375);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)I")
    public static final int method2720(boolean arg0) {
        field6388++;
        int var1 = class145.field1962.method2844((byte) -49);
        if (arg0) {
            return -2;
        } else {
            if (var1 < class591.field8407.length - 1) {
                class145.field1962 = class591.field8407[var1 + 1];
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V")
    public final void method860(int arg0) {
        field6389++;
        float var2 = class472.field6698[arg0 & 0x3FFF];
        float var3 = class472.field6699[arg0 & 0x3FFF];
        float var4 = this.field6394;
        float var5 = this.field6374;
        float var6 = this.field6393;
        float var7 = this.field6367;
        this.field6394 = var2 * var4 - this.field6379 * var3;
        this.field6374 = var2 * var5 - this.field6381 * var3;
        this.field6379 = this.field6379 * var2 + var3 * var4;
        this.field6393 = var2 * var6 - (this.field6373 * var3);
        this.field6381 = this.field6381 * var2 + var3 * var5;
        this.field6367 = var2 * var7 - (this.field6372 * var3);
        this.field6373 = this.field6373 * var2 + var3 * var6;
        this.field6372 = this.field6372 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III[I)V")
    public final void method848(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field6393 + (float) arg0 * this.field6394 + (float) arg1 * this.field6374);
        arg3[0] = (int) ((float) arg2 * this.field6375 + (float) arg0 * this.field6391 + (float) arg1 * this.field6384);
        arg3[2] = (int) ((float) arg2 * this.field6373 + (float) arg0 * this.field6379 + (float) arg1 * this.field6381);
        field6395++;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V")
    public final void method845(int arg0, int arg1, int arg2) {
        this.field6383 = arg0;
        this.field6391 = this.field6374 = this.field6373 = 1.0F;
        this.field6394 = this.field6379 = this.field6384 = this.field6381 = this.field6375 = this.field6393 = 0.0F;
        this.field6367 = arg1;
        field6369++;
        this.field6372 = arg2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lsk;)V")
    public final void method841(class121 arg0) {
        field6370++;
        class447 var2 = (class447) arg0;
        this.field6383 = var2.field6383;
        this.field6372 = var2.field6372;
        this.field6394 = var2.field6394;
        this.field6375 = var2.field6375;
        this.field6374 = var2.field6374;
        this.field6367 = var2.field6367;
        this.field6391 = var2.field6391;
        this.field6379 = var2.field6379;
        this.field6373 = var2.field6373;
        this.field6384 = var2.field6384;
        this.field6393 = var2.field6393;
        this.field6381 = var2.field6381;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)Z")
    public static final boolean method2721(byte arg0, int arg1) {
        field6378++;
        if (arg0 == -82) {
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
    public final void method844(int arg0) {
        this.field6374 = 1.0F;
        field6386++;
        this.field6391 = this.field6373 = class472.field6698[arg0 & 0x3FFF];
        this.field6375 = class472.field6699[arg0 & 0x3FFF];
        this.field6384 = this.field6383 = this.field6394 = this.field6393 = this.field6367 = this.field6381 = this.field6372 = 0.0F;
        this.field6379 = -this.field6375;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V")
    public final void method857(int arg0) {
        field6382++;
        float var2 = class472.field6698[arg0 & 0x3FFF];
        float var3 = class472.field6699[arg0 & 0x3FFF];
        float var4 = this.field6391;
        float var5 = this.field6384;
        float var6 = this.field6375;
        float var7 = this.field6383;
        this.field6391 = var2 * var4 - (this.field6394 * var3);
        this.field6394 = this.field6394 * var2 + var3 * var4;
        this.field6384 = var2 * var5 - (this.field6374 * var3);
        this.field6374 = this.field6374 * var2 + var3 * var5;
        this.field6375 = var2 * var6 - (this.field6393 * var3);
        this.field6393 = this.field6393 * var2 + var3 * var6;
        this.field6383 = var2 * var7 - this.field6367 * var3;
        this.field6367 = this.field6367 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "()Lsk;")
    public final class121 method853() {
        field6368++;
        class447 var1 = new class447();
        var1.field6394 = this.field6394;
        var1.field6372 = this.field6372;
        var1.field6384 = this.field6384;
        var1.field6381 = this.field6381;
        var1.field6379 = this.field6379;
        var1.field6393 = this.field6393;
        var1.field6374 = this.field6374;
        var1.field6375 = this.field6375;
        var1.field6383 = this.field6383;
        var1.field6367 = this.field6367;
        var1.field6391 = this.field6391;
        var1.field6373 = this.field6373;
        return var1;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(III[I)V")
    public final void method855(int arg0, int arg1, int arg2, int[] arg3) {
        field6387++;
        int var5 = (int) ((float) arg0 - this.field6383);
        int var6 = (int) ((float) arg1 - this.field6367);
        int var7 = (int) ((float) arg2 - this.field6372);
        arg3[1] = (int) ((float) var7 * this.field6381 + (float) var5 * this.field6384 + (float) var6 * this.field6374);
        arg3[2] = (int) ((float) var7 * this.field6373 + (float) var5 * this.field6375 + (float) var6 * this.field6393);
        arg3[0] = (int) ((float) var7 * this.field6379 + (float) var5 * this.field6391 + (float) var6 * this.field6394);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(III[I)V")
    public final void method859(int arg0, int arg1, int arg2, int[] arg3) {
        field6390++;
        arg3[0] = (int) ((float) arg2 * this.field6375 + (float) arg0 * this.field6391 + (float) arg1 * this.field6384 + this.field6383);
        arg3[1] = (int) ((float) arg2 * this.field6393 + (float) arg0 * this.field6394 + (float) arg1 * this.field6374 + this.field6367);
        arg3[2] = (int) ((float) arg2 * this.field6373 + (float) arg0 * this.field6379 + (float) arg1 * this.field6381 + this.field6372);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V")
    public final void method849(int arg0, int arg1, int arg2) {
        this.field6383 += arg0;
        field6392++;
        this.field6367 += arg1;
        this.field6372 += arg2;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
    public class447() {
        this.method851();
    }
}
