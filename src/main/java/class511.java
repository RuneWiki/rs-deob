import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class511 extends class512 {

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
    public static boolean field7470 = false;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Ljava/lang/String;")
    public static String field7488 = null;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "F")
    public float field7468;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
    public float field7469;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "F")
    public float field7471;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "F")
    public float field7472;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "F")
    public float field7473;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "F")
    public float field7477;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "F")
    public float field7479;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "F")
    public float field7481;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "F")
    public float field7484;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "F")
    public float field7486;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "F")
    public float field7487;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "F")
    public float field7498;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIFFII)V")
    public final void method3028(int arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6) {
        field7491++;
        if (arg0 != -5189) {
            return;
        }
        if (arg6 == 0) {
            this.field7487 = arg5;
            this.field7486 = this.field7471 = this.field7469 = this.field7498 = this.field7481 = this.field7477 = 0.0F;
            this.field7468 = arg2;
            this.field7473 = 1.0F;
        } else {
            float var8 = class365.field5239[arg6 & 0x3FFF];
            float var9 = class365.field5246[arg6 & 0x3FFF];
            this.field7473 = 1.0F;
            this.field7486 = (float) arg2 * var9;
            this.field7487 = (float) arg5 * var8;
            this.field7468 = (float) arg2 * var8;
            this.field7469 = (float) arg5 * -var9;
            this.field7471 = this.field7498 = this.field7481 = this.field7477 = 0.0F;
        }
        this.field7479 = arg1;
        this.field7472 = arg4;
        this.field7484 = arg3;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)[F")
    public final float[] method3029(int arg0) {
        class169.field2575[13] = 0.0F;
        class169.field2575[0] = this.field7468;
        class169.field2575[14] = 0.0F;
        class169.field2575[6] = this.field7498;
        class169.field2575[5] = this.field7487;
        class169.field2575[4] = this.field7469;
        int var2 = -71 / ((15 - arg0) / 32);
        class169.field2575[10] = this.field7473;
        class169.field2575[1] = this.field7486;
        class169.field2575[12] = 0.0F;
        class169.field2575[9] = this.field7477;
        field7499++;
        class169.field2575[8] = this.field7481;
        class169.field2575[2] = this.field7471;
        return class169.field2575;
    }

    @OriginalMember(owner = "client!sh", name = "wa", descriptor = "([I)V")
    public final void method941(int[] arg0) {
        field7482++;
        float var2 = (float) arg0[0] - this.field7479;
        float var3 = (float) arg0[1] - this.field7472;
        float var4 = (float) arg0[2] - this.field7484;
        arg0[0] = (int) (this.field7471 * var4 + this.field7486 * var3 + this.field7468 * var2);
        arg0[1] = (int) (this.field7498 * var4 + this.field7487 * var3 + this.field7469 * var2);
        arg0[2] = (int) (this.field7473 * var4 + this.field7481 * var2 + this.field7477 * var3);
    }

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "(III[I)V")
    public final void method945(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7473 + (float) arg0 * this.field7471 + (float) arg1 * this.field7498);
        field7494++;
        arg3[1] = (int) ((float) arg2 * this.field7477 + (float) arg0 * this.field7486 + (float) arg1 * this.field7487);
        arg3[0] = (int) ((float) arg2 * this.field7481 + (float) arg0 * this.field7468 + (float) arg1 * this.field7469);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)[F")
    public final float[] method3030(boolean arg0) {
        class169.field2575[5] = this.field7487;
        class169.field2575[8] = this.field7481;
        class169.field2575[6] = this.field7498;
        class169.field2575[10] = this.field7473;
        if (arg0) {
            this.method945(-54, 110, 48, null);
        }
        class169.field2575[13] = this.field7472;
        field7496++;
        class169.field2575[1] = this.field7486;
        class169.field2575[2] = this.field7471;
        class169.field2575[0] = this.field7468;
        class169.field2575[9] = this.field7477;
        class169.field2575[12] = this.field7479;
        class169.field2575[14] = this.field7484;
        class169.field2575[4] = this.field7469;
        return class169.field2575;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([BFIFIIILp;IFFIF)V")
    public static final void method3031(byte[] arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, class185 arg7, int arg8, float arg9, float arg10, int arg11, float arg12) {
        for (int var13 = arg6; var13 < arg8; var13++) {
            class129.method930(true, arg3, arg11, arg7, arg2, arg0, arg9, arg10, arg8, var13, arg1, arg12, arg5, arg4);
            arg5 += arg4 * arg11;
        }
        field7497++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lza;B)V")
    public static final void method3032(class295 arg0, byte arg1) {
        if (arg1 != -18) {
            return;
        }
        if (class526.field7677) {
            class312.method1799(arg0, (byte) 108);
        } else {
            class315.method1813(arg0, (byte) 7);
        }
        field7476++;
    }

    @OriginalMember(owner = "client!sh", name = "ea", descriptor = "(I)V")
    public final void method940(int arg0) {
        field7490++;
        float var2 = class365.field5239[arg0 & 0x3FFF];
        float var3 = class365.field5246[arg0 & 0x3FFF];
        float var4 = this.field7486;
        float var5 = this.field7487;
        float var6 = this.field7477;
        float var7 = this.field7472;
        this.field7486 = var2 * var4 - this.field7471 * var3;
        this.field7487 = var2 * var5 - (this.field7498 * var3);
        this.field7471 = this.field7471 * var2 + var3 * var4;
        this.field7498 = this.field7498 * var2 + var3 * var5;
        this.field7477 = var2 * var6 - this.field7473 * var3;
        this.field7472 = var2 * var7 - this.field7484 * var3;
        this.field7473 = this.field7473 * var2 + var3 * var6;
        this.field7484 = this.field7484 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!sh", name = "ca", descriptor = "(I)V")
    public final void method953(int arg0) {
        this.field7487 = 1.0F;
        field7478++;
        this.field7468 = this.field7473 = class365.field5239[arg0 & 0x3FFF];
        this.field7481 = class365.field5246[arg0 & 0x3FFF];
        this.field7471 = -this.field7481;
        this.field7469 = this.field7479 = this.field7486 = this.field7477 = this.field7472 = this.field7498 = this.field7484 = 0.0F;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLc;)V")
    public final void method3033(boolean arg0, class512 arg1) {
        field7483++;
        class511 var3 = (class511) arg1;
        this.field7469 = var3.field7486;
        this.field7481 = var3.field7471;
        this.field7468 = var3.field7468;
        this.field7486 = var3.field7469;
        this.field7477 = var3.field7498;
        this.field7487 = var3.field7487;
        this.field7471 = var3.field7481;
        if (!arg0) {
            this.method3028(16, 0.016839223F, -59, 0.595474F, -0.6993814F, -71, 1);
        }
        this.field7479 = -(this.field7481 * var3.field7484 + this.field7469 * var3.field7472 + this.field7468 * var3.field7479);
        this.field7498 = var3.field7477;
        this.field7473 = var3.field7473;
        this.field7472 = -(this.field7477 * var3.field7484 + this.field7487 * var3.field7472 + this.field7486 * var3.field7479);
        this.field7484 = -(this.field7473 * var3.field7484 + this.field7498 * var3.field7472 + this.field7471 * var3.field7479);
    }

    @OriginalMember(owner = "client!sh", name = "YA", descriptor = "(IIIIII)V")
    public final void method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7495++;
        float var7 = class365.field5239[arg3 & 0x3FFF];
        float var8 = class365.field5246[arg3 & 0x3FFF];
        float var9 = class365.field5239[arg4 & 0x3FFF];
        float var10 = class365.field5246[arg4 & 0x3FFF];
        float var11 = class365.field5239[arg5 & 0x3FFF];
        float var12 = class365.field5246[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7477 = var9 * var13 + var10 * var12;
        this.field7473 = var7 * var9;
        this.field7468 = var9 * var11 + var10 * var14;
        this.field7469 = var7 * var12;
        this.field7487 = var7 * var11;
        this.field7498 = -var8;
        this.field7486 = -var9 * var12 + var10 * var13;
        this.field7471 = var7 * var10;
        this.field7481 = -var10 * var11 + var9 * var14;
        this.field7472 = (float) (-arg0) * this.field7486 - (float) arg1 * this.field7487 - ((float) arg2 * this.field7477);
        this.field7484 = (float) (-arg0) * this.field7471 - (float) arg1 * this.field7498 - (float) arg2 * this.field7473;
        this.field7479 = (float) (-arg0) * this.field7468 - ((float) arg1 * this.field7469) - ((float) arg2 * this.field7481);
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static void method3034(int arg0) {
        if (arg0 != 23257) {
            method3032(null, (byte) 35);
        }
        field7488 = null;
    }

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "()V")
    public final void method954() {
        field7492++;
        this.field7468 = this.field7487 = this.field7473 = 1.0F;
        this.field7486 = this.field7471 = this.field7469 = this.field7498 = this.field7481 = this.field7477 = this.field7479 = this.field7472 = this.field7484 = 0.0F;
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
    public final void method942(int arg0) {
        field7500++;
        this.field7468 = 1.0F;
        this.field7487 = this.field7473 = class365.field5239[arg0 & 0x3FFF];
        this.field7498 = class365.field5246[arg0 & 0x3FFF];
        this.field7469 = this.field7481 = this.field7479 = this.field7486 = this.field7472 = this.field7471 = this.field7484 = 0.0F;
        this.field7477 = -this.field7498;
    }

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "(I)V")
    public final void method950(int arg0) {
        this.field7473 = 1.0F;
        field7489++;
        this.field7468 = this.field7487 = class365.field5239[arg0 & 0x3FFF];
        this.field7486 = class365.field5246[arg0 & 0x3FFF];
        this.field7481 = this.field7479 = this.field7477 = this.field7472 = this.field7471 = this.field7498 = this.field7484 = 0.0F;
        this.field7469 = -this.field7486;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[I)V")
    public final void method946(int arg0, int arg1, int arg2, int[] arg3) {
        field7485++;
        arg3[1] = (int) ((float) arg2 * this.field7477 + (float) arg0 * this.field7486 + (float) arg1 * this.field7487 + this.field7472);
        arg3[0] = (int) ((float) arg2 * this.field7481 + (float) arg0 * this.field7468 + (float) arg1 * this.field7469 + this.field7479);
        arg3[2] = (int) ((float) arg2 * this.field7473 + (float) arg0 * this.field7471 + (float) arg1 * this.field7498 + this.field7484);
    }

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "(III)V")
    public final void method948(int arg0, int arg1, int arg2) {
        this.field7479 += arg0;
        this.field7472 += arg1;
        this.field7484 += arg2;
        field7475++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()Lc;")
    public final class512 method947() {
        field7493++;
        class511 var1 = new class511();
        var1.field7481 = this.field7481;
        var1.field7479 = this.field7479;
        var1.field7473 = this.field7473;
        var1.field7471 = this.field7471;
        var1.field7484 = this.field7484;
        var1.field7468 = this.field7468;
        var1.field7469 = this.field7469;
        var1.field7498 = this.field7498;
        var1.field7487 = this.field7487;
        var1.field7477 = this.field7477;
        var1.field7486 = this.field7486;
        var1.field7472 = this.field7472;
        return var1;
    }

    @OriginalMember(owner = "client!sh", name = "EA", descriptor = "(I)V")
    public final void method949(int arg0) {
        field7467++;
        float var2 = class365.field5239[arg0 & 0x3FFF];
        float var3 = class365.field5246[arg0 & 0x3FFF];
        float var4 = this.field7468;
        float var5 = this.field7469;
        float var6 = this.field7481;
        this.field7468 = this.field7471 * var3 + var2 * var4;
        float var7 = this.field7479;
        this.field7469 = this.field7498 * var3 + var2 * var5;
        this.field7471 = this.field7471 * var2 - (var3 * var4);
        this.field7498 = this.field7498 * var2 - (var3 * var5);
        this.field7481 = this.field7473 * var3 + var2 * var6;
        this.field7479 = this.field7484 * var3 + var2 * var7;
        this.field7473 = this.field7473 * var2 - var3 * var6;
        this.field7484 = this.field7484 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!sh", name = "ha", descriptor = "(Lc;)V")
    public final void method944(class512 arg0) {
        field7474++;
        class511 var2 = (class511) arg0;
        this.field7468 = var2.field7468;
        this.field7487 = var2.field7487;
        this.field7498 = var2.field7498;
        this.field7472 = var2.field7472;
        this.field7469 = var2.field7469;
        this.field7484 = var2.field7484;
        this.field7486 = var2.field7486;
        this.field7471 = var2.field7471;
        this.field7477 = var2.field7477;
        this.field7479 = var2.field7479;
        this.field7473 = var2.field7473;
        this.field7481 = var2.field7481;
    }

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "(III)V")
    public final void method955(int arg0, int arg1, int arg2) {
        this.field7484 = arg2;
        this.field7479 = arg0;
        this.field7472 = arg1;
        this.field7468 = this.field7487 = this.field7473 = 1.0F;
        field7480++;
        this.field7486 = this.field7471 = this.field7469 = this.field7498 = this.field7481 = this.field7477 = 0.0F;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class511() {
        this.method954();
    }
}
