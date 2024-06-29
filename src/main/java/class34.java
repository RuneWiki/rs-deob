import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class34 extends class496 {

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Loe;")
    public static class127 field482 = new class127(99, 7);

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "F")
    public float field456;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "F")
    public float field459;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "F")
    public float field467;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "F")
    public float field471;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "F")
    public float field472;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "F")
    public float field473;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "F")
    public float field475;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "F")
    public float field476;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "F")
    public float field477;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "F")
    public float field478;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "F")
    public float field479;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "F")
    public float field488;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
    public static int[] field485;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 4)
    public final void method185(int arg0) {
        this.field488 = 1.0F;
        field465++;
        this.field478 = this.field467 = class402.field5856[arg0 & 0x3FFF];
        this.field472 = class402.field5848[arg0 & 0x3FFF];
        this.field476 = -this.field472;
        this.field471 = this.field479 = this.field459 = this.field475 = this.field473 = this.field477 = this.field456 = 0.0F;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III[I)V", line = 16)
    public final void method186(int arg0, int arg1, int arg2, int[] arg3) {
        field464++;
        arg3[0] = (int) ((float) arg2 * this.field479 + (float) arg0 * this.field488 + (float) arg1 * this.field471 + this.field459);
        arg3[1] = (int) ((float) arg2 * this.field476 + (float) arg0 * this.field475 + (float) arg1 * this.field478 + this.field473);
        arg3[2] = (int) ((float) arg2 * this.field467 + (float) arg0 * this.field477 + (float) arg1 * this.field472 + this.field456);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lql;)V", line = 31)
    public final void method187(class496 arg0) {
        field466++;
        class34 var2 = (class34) arg0;
        this.field478 = var2.field478;
        this.field456 = var2.field456;
        this.field473 = var2.field473;
        this.field488 = var2.field488;
        this.field476 = var2.field476;
        this.field471 = var2.field471;
        this.field459 = var2.field459;
        this.field479 = var2.field479;
        this.field475 = var2.field475;
        this.field472 = var2.field472;
        this.field467 = var2.field467;
        this.field477 = var2.field477;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([I)V", line = 55)
    public final void method188(int[] arg0) {
        field486++;
        float var2 = (float) arg0[0] - this.field459;
        float var3 = (float) arg0[1] - this.field473;
        float var4 = (float) arg0[2] - this.field456;
        arg0[2] = (int) (this.field467 * var4 + this.field479 * var2 + this.field476 * var3);
        arg0[1] = (int) (this.field472 * var4 + this.field478 * var3 + this.field471 * var2);
        arg0[0] = (int) (this.field477 * var4 + this.field488 * var2 + this.field475 * var3);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lql;I)V", line = 71)
    public final void method189(class496 arg0, int arg1) {
        field481++;
        class34 var3 = (class34) arg0;
        this.field488 = var3.field488;
        this.field479 = var3.field477;
        this.field471 = var3.field475;
        if (arg1 != -30919) {
            this.method192(-37, 37, -35, -97, 90, 20);
        }
        this.field478 = var3.field478;
        this.field477 = var3.field479;
        this.field475 = var3.field471;
        this.field476 = var3.field472;
        this.field467 = var3.field467;
        this.field459 = -(this.field479 * var3.field456 + this.field488 * var3.field459 + this.field471 * var3.field473);
        this.field472 = var3.field476;
        this.field473 = -(this.field476 * var3.field456 + this.field478 * var3.field473 + this.field475 * var3.field459);
        this.field456 = -(this.field467 * var3.field456 + this.field477 * var3.field459 + this.field472 * var3.field473);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[I)V", line = 97)
    public final void method190(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field479 + (float) arg0 * this.field488 + (float) arg1 * this.field471);
        arg3[1] = (int) ((float) arg2 * this.field476 + (float) arg0 * this.field475 + (float) arg1 * this.field478);
        arg3[2] = (int) ((float) arg2 * this.field467 + (float) arg0 * this.field477 + (float) arg1 * this.field472);
        field460++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)[F", line = 108)
    public final float[] method191(boolean arg0) {
        class199.field3149[8] = this.field479;
        class199.field3149[4] = this.field471;
        class199.field3149[14] = 0.0F;
        field469++;
        class199.field3149[6] = this.field472;
        class199.field3149[12] = 0.0F;
        if (arg0) {
            this.field479 = -0.53075093F;
        }
        class199.field3149[13] = 0.0F;
        class199.field3149[10] = this.field467;
        class199.field3149[9] = this.field476;
        class199.field3149[5] = this.field478;
        class199.field3149[0] = this.field488;
        class199.field3149[1] = this.field475;
        class199.field3149[2] = this.field477;
        return class199.field3149;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V", line = 131)
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field457++;
        float var7 = class402.field5856[arg3 & 0x3FFF];
        float var8 = class402.field5848[arg3 & 0x3FFF];
        float var9 = class402.field5856[arg4 & 0x3FFF];
        float var10 = class402.field5848[arg4 & 0x3FFF];
        float var11 = class402.field5856[arg5 & 0x3FFF];
        float var12 = class402.field5848[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field488 = var9 * var11 + var10 * var14;
        this.field477 = var7 * var10;
        this.field467 = var7 * var9;
        this.field476 = var9 * var13 + var10 * var12;
        this.field479 = -var10 * var11 + var9 * var14;
        this.field478 = var7 * var11;
        this.field471 = var7 * var12;
        this.field472 = -var8;
        this.field475 = -var9 * var12 + var10 * var13;
        this.field459 = (float) (-arg0) * this.field488 - ((float) arg1 * this.field471) - ((float) arg2 * this.field479);
        this.field473 = (float) (-arg0) * this.field475 - (float) arg1 * this.field478 - (float) arg2 * this.field476;
        this.field456 = (float) (-arg0) * this.field477 - ((float) arg1 * this.field472) - ((float) arg2 * this.field467);
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)[F", line = 166)
    public final float[] method193(int arg0) {
        class199.field3149[13] = this.field473;
        class199.field3149[1] = this.field475;
        class199.field3149[8] = this.field479;
        class199.field3149[14] = this.field456;
        class199.field3149[arg0] = this.field488;
        class199.field3149[4] = this.field471;
        class199.field3149[5] = this.field478;
        class199.field3149[6] = this.field472;
        class199.field3149[9] = this.field476;
        class199.field3149[12] = this.field459;
        class199.field3149[2] = this.field477;
        field463++;
        class199.field3149[10] = this.field467;
        return class199.field3149;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 186)
    public final void method194(int arg0) {
        field480++;
        this.field478 = 1.0F;
        this.field488 = this.field467 = class402.field5856[arg0 & 0x3FFF];
        this.field479 = class402.field5848[arg0 & 0x3FFF];
        this.field471 = this.field459 = this.field475 = this.field476 = this.field473 = this.field472 = this.field456 = 0.0F;
        this.field477 = -this.field479;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V", line = 200)
    public final void method195() {
        this.field488 = this.field478 = this.field467 = 1.0F;
        field470++;
        this.field475 = this.field477 = this.field471 = this.field472 = this.field479 = this.field476 = this.field459 = this.field473 = this.field456 = 0.0F;
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V", line = 217)
    public final void method196(int arg0) {
        field462++;
        float var2 = class402.field5856[arg0 & 0x3FFF];
        float var3 = class402.field5848[arg0 & 0x3FFF];
        float var4 = this.field488;
        float var5 = this.field471;
        float var6 = this.field479;
        float var7 = this.field459;
        this.field488 = this.field477 * var3 + var2 * var4;
        this.field471 = this.field472 * var3 + var2 * var5;
        this.field477 = this.field477 * var2 - var3 * var4;
        this.field479 = this.field467 * var3 + var2 * var6;
        this.field472 = this.field472 * var2 - var3 * var5;
        this.field459 = this.field456 * var3 + var2 * var7;
        this.field467 = this.field467 * var2 - (var3 * var6);
        this.field456 = this.field456 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V", line = 245)
    public static void method197(boolean arg0) {
        if (!arg0) {
            method200(-51, 99);
        }
        field485 = null;
        field482 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V", line = 262)
    public final void method198(int arg0, int arg1, int arg2) {
        this.field473 = arg1;
        this.field488 = this.field478 = this.field467 = 1.0F;
        this.field456 = arg2;
        field461++;
        this.field459 = arg0;
        this.field475 = this.field477 = this.field471 = this.field472 = this.field479 = this.field476 = 0.0F;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 276)
    public final void method199(int arg0) {
        field468++;
        float var2 = class402.field5856[arg0 & 0x3FFF];
        float var3 = class402.field5848[arg0 & 0x3FFF];
        float var4 = this.field475;
        float var5 = this.field478;
        float var6 = this.field476;
        this.field475 = var2 * var4 - (this.field477 * var3);
        float var7 = this.field473;
        this.field477 = this.field477 * var2 + var3 * var4;
        this.field478 = var2 * var5 - this.field472 * var3;
        this.field476 = var2 * var6 - (this.field467 * var3);
        this.field472 = this.field472 * var2 + var3 * var5;
        this.field467 = this.field467 * var2 + var3 * var6;
        this.field473 = var2 * var7 - (this.field456 * var3);
        this.field456 = this.field456 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Z", line = 308)
    public static final boolean method200(int arg0, int arg1) {
        field487++;
        if (arg0 == 12 || arg0 == 49 || arg0 == 23 || arg0 == 46 || arg0 == 1006) {
            return true;
        } else {
            int var2 = 6 / ((arg1 - 6) / 53);
            return arg0 == 50 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V", line = 328)
    public final void method201(int arg0, int arg1, int arg2) {
        this.field459 += arg0;
        this.field473 += arg1;
        field474++;
        this.field456 += arg2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZFIFIF)V", line = 339)
    public final void method202(int arg0, boolean arg1, float arg2, int arg3, float arg4, int arg5, float arg6) {
        if (arg0 == 0) {
            this.field488 = arg3;
            this.field467 = 1.0F;
            this.field478 = arg5;
            this.field475 = this.field477 = this.field471 = this.field472 = this.field479 = this.field476 = 0.0F;
        } else {
            float var8 = class402.field5856[arg0 & 0x3FFF];
            float var9 = class402.field5848[arg0 & 0x3FFF];
            this.field477 = this.field472 = this.field479 = this.field476 = 0.0F;
            this.field467 = 1.0F;
            this.field475 = (float) arg3 * var9;
            this.field471 = (float) arg5 * -var9;
            this.field478 = (float) arg5 * var8;
            this.field488 = (float) arg3 * var8;
        }
        field484++;
        this.field456 = arg6;
        this.field459 = arg4;
        if (!arg1) {
            this.field473 = arg2;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()Lql;", line = 375)
    public final class496 method203() {
        field483++;
        class34 var1 = new class34();
        var1.field473 = this.field473;
        var1.field478 = this.field478;
        var1.field476 = this.field476;
        var1.field477 = this.field477;
        var1.field456 = this.field456;
        var1.field488 = this.field488;
        var1.field475 = this.field475;
        var1.field467 = this.field467;
        var1.field479 = this.field479;
        var1.field471 = this.field471;
        var1.field472 = this.field472;
        var1.field459 = this.field459;
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 399)
    public final void method204(int arg0) {
        field458++;
        this.field467 = 1.0F;
        this.field488 = this.field478 = class402.field5856[arg0 & 0x3FFF];
        this.field475 = class402.field5848[arg0 & 0x3FFF];
        this.field471 = -this.field475;
        this.field479 = this.field459 = this.field476 = this.field473 = this.field477 = this.field472 = this.field456 = 0.0F;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 412)
    public class34() {
        this.method195();
    }
}
