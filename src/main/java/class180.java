import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class180 extends class203 {

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "[F")
    private static float[] field2445 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "F")
    public float field2433;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "F")
    public float field2434;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "F")
    public float field2435;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "F")
    public float field2436;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "F")
    public float field2437;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "F")
    public float field2438;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "F")
    public float field2439;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "F")
    public float field2440;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "F")
    public float field2441;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "F")
    public float field2442;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "F")
    public float field2443;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "F")
    public float field2444;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([I)V", line = 6)
    public final void method1019(int[] arg0) {
        float var2 = (float) arg0[0] - this.field2443;
        float var3 = (float) arg0[1] - this.field2436;
        float var4 = (float) arg0[2] - this.field2442;
        arg0[2] = (int) (this.field2437 * var4 + this.field2440 * var2 + this.field2439 * var3);
        arg0[0] = (int) (this.field2434 * var4 + this.field2444 * var3 + this.field2438 * var2);
        arg0[1] = (int) (this.field2441 * var4 + this.field2435 * var3 + this.field2433 * var2);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 19)
    public final void method1020(int arg0) {
        this.field2435 = 1.0F;
        this.field2438 = this.field2437 = class303.field4032[arg0 & 0x3FFF];
        this.field2440 = class303.field4033[arg0 & 0x3FFF];
        this.field2434 = -this.field2440;
        this.field2433 = this.field2443 = this.field2444 = this.field2439 = this.field2436 = this.field2441 = this.field2442 = 0.0F;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILon;)V", line = 32)
    public final void method1021(int arg0, class203 arg1) {
        class180 var3 = (class180) arg1;
        this.field2440 = var3.field2434;
        if (arg0 < 1) {
            this.field2443 = -1.1942676F;
        }
        this.field2433 = var3.field2444;
        this.field2438 = var3.field2438;
        this.field2434 = var3.field2440;
        this.field2435 = var3.field2435;
        this.field2439 = var3.field2441;
        this.field2444 = var3.field2433;
        this.field2437 = var3.field2437;
        this.field2441 = var3.field2439;
        this.field2443 = -(this.field2440 * var3.field2442 + this.field2438 * var3.field2443 + this.field2433 * var3.field2436);
        this.field2436 = -(this.field2439 * var3.field2442 + this.field2444 * var3.field2443 + this.field2435 * var3.field2436);
        this.field2442 = -(this.field2437 * var3.field2442 + this.field2441 * var3.field2436 + this.field2434 * var3.field2443);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[I)V", line = 55)
    public final void method1022(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field2437 + (float) arg0 * this.field2434 + (float) arg1 * this.field2441 + this.field2442);
        arg3[0] = (int) ((float) arg2 * this.field2440 + (float) arg0 * this.field2438 + (float) arg1 * this.field2433 + this.field2443);
        arg3[1] = (int) ((float) arg2 * this.field2439 + (float) arg0 * this.field2444 + (float) arg1 * this.field2435 + this.field2436);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "()V", line = 67)
    public final void method1023() {
        this.field2438 = this.field2435 = this.field2437 = 1.0F;
        this.field2444 = this.field2434 = this.field2433 = this.field2441 = this.field2440 = this.field2439 = this.field2443 = this.field2436 = this.field2442 = 0.0F;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lon;)V", line = 77)
    public final void method1024(class203 arg0) {
        class180 var2 = (class180) arg0;
        this.field2441 = var2.field2441;
        this.field2437 = var2.field2437;
        this.field2442 = var2.field2442;
        this.field2434 = var2.field2434;
        this.field2435 = var2.field2435;
        this.field2440 = var2.field2440;
        this.field2439 = var2.field2439;
        this.field2438 = var2.field2438;
        this.field2444 = var2.field2444;
        this.field2443 = var2.field2443;
        this.field2436 = var2.field2436;
        this.field2433 = var2.field2433;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "()Lmu;", line = 98)
    public final class180 method1025() {
        class180 var1 = new class180();
        var1.field2442 = this.field2442;
        var1.field2444 = this.field2444;
        var1.field2433 = this.field2433;
        var1.field2438 = this.field2438;
        var1.field2436 = this.field2436;
        var1.field2443 = this.field2443;
        var1.field2437 = this.field2437;
        var1.field2434 = this.field2434;
        var1.field2435 = this.field2435;
        var1.field2440 = this.field2440;
        var1.field2439 = this.field2439;
        var1.field2441 = this.field2441;
        return var1;
    }

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)[F", line = 118)
    public final float[] method1026(int arg0) {
        field2445[0] = this.field2438;
        field2445[1] = this.field2444;
        field2445[2] = this.field2434;
        field2445[8] = this.field2440;
        field2445[14] = 0.0F;
        field2445[12] = 0.0F;
        field2445[9] = this.field2439;
        field2445[10] = this.field2437;
        field2445[5] = this.field2435;
        field2445[arg0] = 0.0F;
        field2445[6] = this.field2441;
        field2445[4] = this.field2433;
        return field2445;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V", line = 138)
    public final void method1027(int arg0, int arg1, int arg2) {
        this.field2436 += (float) arg1;
        this.field2443 += (float) arg0;
        this.field2442 += (float) arg2;
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V", line = 150)
    public final void method1028(int arg0) {
        this.field2437 = 1.0F;
        this.field2438 = this.field2435 = class303.field4032[arg0 & 0x3FFF];
        this.field2444 = class303.field4033[arg0 & 0x3FFF];
        this.field2433 = -this.field2444;
        this.field2440 = this.field2443 = this.field2439 = this.field2436 = this.field2434 = this.field2441 = this.field2442 = 0.0F;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V", line = 161)
    public final void method1029(int arg0, int arg1, int arg2) {
        this.field2442 = (float) arg2;
        this.field2444 = this.field2434 = this.field2433 = this.field2441 = this.field2440 = this.field2439 = 0.0F;
        this.field2436 = (float) arg1;
        this.field2443 = (float) arg0;
        this.field2438 = this.field2435 = this.field2437 = 1.0F;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIII)V", line = 173)
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = class303.field4032[arg3 & 0x3FFF];
        float var8 = class303.field4033[arg3 & 0x3FFF];
        float var9 = class303.field4032[arg4 & 0x3FFF];
        float var10 = class303.field4033[arg4 & 0x3FFF];
        float var11 = class303.field4032[arg5 & 0x3FFF];
        float var12 = class303.field4033[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field2435 = var7 * var11;
        this.field2437 = var7 * var9;
        this.field2433 = var7 * var12;
        this.field2444 = -var9 * var12 + var10 * var13;
        this.field2441 = -var8;
        this.field2434 = var7 * var10;
        this.field2438 = var9 * var11 + var10 * var14;
        this.field2439 = var9 * var13 + var10 * var12;
        this.field2440 = -var10 * var11 + var9 * var14;
        this.field2436 = (float) (-arg0) * this.field2444 - ((float) arg1 * this.field2435) - (float) arg2 * this.field2439;
        this.field2442 = (float) (-arg0) * this.field2434 - (float) arg1 * this.field2441 - (float) arg2 * this.field2437;
        this.field2443 = (float) (-arg0) * this.field2438 - (float) arg1 * this.field2433 - (float) arg2 * this.field2440;
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V", line = 208)
    public final void method1031(int arg0) {
        this.field2438 = 1.0F;
        this.field2435 = this.field2437 = class303.field4032[arg0 & 0x3FFF];
        this.field2441 = class303.field4033[arg0 & 0x3FFF];
        this.field2433 = this.field2440 = this.field2443 = this.field2444 = this.field2436 = this.field2434 = this.field2442 = 0.0F;
        this.field2439 = -this.field2441;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 221)
    public final void method1032(int arg0) {
        float var2 = class303.field4032[arg0 & 0x3FFF];
        float var3 = class303.field4033[arg0 & 0x3FFF];
        float var4 = this.field2438;
        float var5 = this.field2433;
        float var6 = this.field2440;
        float var7 = this.field2443;
        this.field2438 = this.field2434 * var3 + var2 * var4;
        this.field2434 = this.field2434 * var2 - var3 * var4;
        this.field2433 = this.field2441 * var3 + var2 * var5;
        this.field2441 = this.field2441 * var2 - (var3 * var5);
        this.field2440 = this.field2437 * var3 + var2 * var6;
        this.field2443 = this.field2442 * var3 + var2 * var7;
        this.field2437 = this.field2437 * var2 - var3 * var6;
        this.field2442 = this.field2442 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)[F", line = 248)
    public final float[] method1033(byte arg0) {
        field2445[12] = this.field2443;
        field2445[13] = this.field2436;
        if (arg0 != -39) {
            this.method1033((byte) -47);
        }
        field2445[0] = this.field2438;
        field2445[9] = this.field2439;
        field2445[2] = this.field2434;
        field2445[8] = this.field2440;
        field2445[14] = this.field2442;
        field2445[10] = this.field2437;
        field2445[4] = this.field2433;
        field2445[6] = this.field2441;
        field2445[5] = this.field2435;
        field2445[1] = this.field2444;
        return field2445;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V", line = 269)
    public class180() {
        this.method1023();
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V", line = 284)
    public final void method1034(int arg0) {
        float var2 = class303.field4032[arg0 & 0x3FFF];
        float var3 = class303.field4033[arg0 & 0x3FFF];
        float var4 = this.field2444;
        float var5 = this.field2435;
        float var6 = this.field2439;
        float var7 = this.field2436;
        this.field2444 = var2 * var4 - this.field2434 * var3;
        this.field2435 = var2 * var5 - this.field2441 * var3;
        this.field2434 = this.field2434 * var2 + var3 * var4;
        this.field2439 = var2 * var6 - (this.field2437 * var3);
        this.field2441 = this.field2441 * var2 + var3 * var5;
        this.field2436 = var2 * var7 - (this.field2442 * var3);
        this.field2437 = this.field2437 * var2 + var3 * var6;
        this.field2442 = this.field2442 * var2 + var3 * var7;
    }
}
