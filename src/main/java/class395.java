import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class395 extends class333 {

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "F")
    public float field5496;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "F")
    public float field5498;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "F")
    public float field5501;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "F")
    public float field5504;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "F")
    public float field5507;

    @OriginalMember(owner = "client!fu", name = "t", descriptor = "F")
    public float field5509;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "F")
    public float field5513;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "F")
    public float field5515;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "F")
    public float field5518;

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "F")
    public float field5519;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "F")
    public float field5520;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "F")
    public float field5523;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!fu", name = "v", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III[I)V")
    public final void method1708(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field5520 + (float) arg0 * this.field5515 + (float) arg1 * this.field5513 + this.field5496);
        field5506++;
        arg3[1] = (int) ((float) arg2 * this.field5518 + (float) arg0 * this.field5523 + (float) arg1 * this.field5519 + this.field5498);
        arg3[0] = (int) ((float) arg2 * this.field5504 + (float) arg0 * this.field5509 + (float) arg1 * this.field5501 + this.field5507);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
    public final void method1730(int arg0, int arg1, int arg2) {
        field5505++;
        this.field5498 += arg1;
        this.field5496 += arg2;
        this.field5507 += arg0;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIII)V")
    public final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5503++;
        float var7 = class202.field3027[arg3 & 0x3FFF];
        float var8 = class202.field3029[arg3 & 0x3FFF];
        float var9 = class202.field3027[arg4 & 0x3FFF];
        float var10 = class202.field3029[arg4 & 0x3FFF];
        float var11 = class202.field3027[arg5 & 0x3FFF];
        float var12 = class202.field3029[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field5519 = var7 * var11;
        this.field5523 = -var9 * var12 + var10 * var13;
        this.field5504 = -var10 * var11 + var9 * var14;
        this.field5520 = var7 * var9;
        this.field5501 = var7 * var12;
        this.field5515 = var7 * var10;
        this.field5518 = var9 * var13 + var10 * var12;
        this.field5509 = var9 * var11 + var10 * var14;
        this.field5513 = -var8;
        this.field5498 = (float) (-arg0) * this.field5523 - (float) arg1 * this.field5519 - (float) arg2 * this.field5518;
        this.field5496 = (float) (-arg0) * this.field5515 - ((float) arg1 * this.field5513) - (float) arg2 * this.field5520;
        this.field5507 = (float) (-arg0) * this.field5509 - (float) arg1 * this.field5501 - ((float) arg2 * this.field5504);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "()Lofa;")
    public final class333 method1703() {
        field5499++;
        class395 var1 = new class395();
        var1.field5520 = this.field5520;
        var1.field5513 = this.field5513;
        var1.field5504 = this.field5504;
        var1.field5498 = this.field5498;
        var1.field5496 = this.field5496;
        var1.field5509 = this.field5509;
        var1.field5515 = this.field5515;
        var1.field5501 = this.field5501;
        var1.field5523 = this.field5523;
        var1.field5518 = this.field5518;
        var1.field5519 = this.field5519;
        var1.field5507 = this.field5507;
        return var1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public final void method1713(int arg0) {
        field5510++;
        this.field5519 = 1.0F;
        this.field5509 = this.field5520 = class202.field3027[arg0 & 0x3FFF];
        this.field5504 = class202.field3029[arg0 & 0x3FFF];
        this.field5501 = this.field5507 = this.field5523 = this.field5518 = this.field5498 = this.field5513 = this.field5496 = 0.0F;
        this.field5515 = -this.field5504;
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
    public final void method1718(int arg0) {
        field5512++;
        float var2 = class202.field3027[arg0 & 0x3FFF];
        float var3 = class202.field3029[arg0 & 0x3FFF];
        float var4 = this.field5523;
        float var5 = this.field5519;
        float var6 = this.field5518;
        float var7 = this.field5498;
        this.field5523 = var2 * var4 - this.field5515 * var3;
        this.field5519 = var2 * var5 - (this.field5513 * var3);
        this.field5515 = this.field5515 * var2 + var3 * var4;
        this.field5518 = var2 * var6 - (this.field5520 * var3);
        this.field5513 = this.field5513 * var2 + var3 * var5;
        this.field5498 = var2 * var7 - this.field5496 * var3;
        this.field5520 = this.field5520 * var2 + var3 * var6;
        this.field5496 = this.field5496 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "(I)V")
    public static final void method2329(int arg0) {
        field5508++;
        class392.method2321(0);
        if (arg0 != -787) {
            method2329(-72);
        }
        class24.field412 = false;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public final void method1710(int arg0) {
        field5516++;
        float var2 = class202.field3027[arg0 & 0x3FFF];
        float var3 = class202.field3029[arg0 & 0x3FFF];
        float var4 = this.field5509;
        float var5 = this.field5501;
        float var6 = this.field5504;
        float var7 = this.field5507;
        this.field5509 = this.field5515 * var3 + var2 * var4;
        this.field5515 = this.field5515 * var2 - (var3 * var4);
        this.field5501 = this.field5513 * var3 + var2 * var5;
        this.field5513 = this.field5513 * var2 - var3 * var5;
        this.field5504 = this.field5520 * var3 + var2 * var6;
        this.field5507 = this.field5496 * var3 + var2 * var7;
        this.field5520 = this.field5520 * var2 - var3 * var6;
        this.field5496 = this.field5496 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
    public final void method1727(int arg0, int arg1, int arg2) {
        this.field5507 = arg0;
        this.field5523 = this.field5515 = this.field5501 = this.field5513 = this.field5504 = this.field5518 = 0.0F;
        this.field5496 = arg2;
        field5521++;
        this.field5509 = this.field5519 = this.field5520 = 1.0F;
        this.field5498 = arg1;
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
    public final void method1705(int arg0) {
        field5511++;
        this.field5509 = 1.0F;
        this.field5519 = this.field5520 = class202.field3027[arg0 & 0x3FFF];
        this.field5513 = class202.field3029[arg0 & 0x3FFF];
        this.field5501 = this.field5504 = this.field5507 = this.field5523 = this.field5498 = this.field5515 = this.field5496 = 0.0F;
        this.field5518 = -this.field5513;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III[I)V")
    public final void method1728(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field5518 + (float) arg0 * this.field5523 + (float) arg1 * this.field5519);
        field5517++;
        arg3[0] = (int) ((float) arg2 * this.field5504 + (float) arg0 * this.field5509 + (float) arg1 * this.field5501);
        arg3[2] = (int) ((float) arg2 * this.field5520 + (float) arg0 * this.field5515 + (float) arg1 * this.field5513);
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    public final void method1700(int arg0) {
        this.field5520 = 1.0F;
        field5514++;
        this.field5509 = this.field5519 = class202.field3027[arg0 & 0x3FFF];
        this.field5523 = class202.field3029[arg0 & 0x3FFF];
        this.field5504 = this.field5507 = this.field5518 = this.field5498 = this.field5515 = this.field5513 = this.field5496 = 0.0F;
        this.field5501 = -this.field5523;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([I)V")
    public final void method1709(int[] arg0) {
        field5522++;
        float var2 = (float) arg0[0] - this.field5507;
        float var3 = (float) arg0[1] - this.field5498;
        float var4 = (float) arg0[2] - this.field5496;
        arg0[0] = (int) (this.field5515 * var4 + this.field5523 * var3 + this.field5509 * var2);
        arg0[1] = (int) (this.field5513 * var4 + this.field5519 * var3 + this.field5501 * var2);
        arg0[2] = (int) (this.field5520 * var4 + this.field5518 * var3 + this.field5504 * var2);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(III[I)V")
    public final void method1723(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field5507);
        int var6 = (int) ((float) arg1 - this.field5498);
        int var7 = (int) ((float) arg2 - this.field5496);
        field5500++;
        arg3[2] = (int) ((float) var7 * this.field5520 + (float) var5 * this.field5504 + (float) var6 * this.field5518);
        arg3[0] = (int) ((float) var7 * this.field5515 + (float) var5 * this.field5509 + (float) var6 * this.field5523);
        arg3[1] = (int) ((float) var7 * this.field5513 + (float) var5 * this.field5501 + (float) var6 * this.field5519);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lofa;)V")
    public final void method1712(class333 arg0) {
        field5524++;
        class395 var2 = (class395) arg0;
        this.field5498 = var2.field5498;
        this.field5501 = var2.field5501;
        this.field5523 = var2.field5523;
        this.field5520 = var2.field5520;
        this.field5509 = var2.field5509;
        this.field5519 = var2.field5519;
        this.field5518 = var2.field5518;
        this.field5513 = var2.field5513;
        this.field5507 = var2.field5507;
        this.field5496 = var2.field5496;
        this.field5504 = var2.field5504;
        this.field5515 = var2.field5515;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "()V")
    public final void method1725() {
        field5497++;
        this.field5523 = this.field5515 = this.field5501 = this.field5513 = this.field5504 = this.field5518 = this.field5507 = this.field5498 = this.field5496 = 0.0F;
        this.field5509 = this.field5519 = this.field5520 = 1.0F;
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
    public final void method1716(int arg0) {
        field5502++;
        float var2 = class202.field3027[arg0 & 0x3FFF];
        float var3 = class202.field3029[arg0 & 0x3FFF];
        float var4 = this.field5509;
        float var5 = this.field5501;
        float var6 = this.field5504;
        float var7 = this.field5507;
        this.field5509 = var2 * var4 - this.field5523 * var3;
        this.field5501 = var2 * var5 - this.field5519 * var3;
        this.field5523 = this.field5523 * var2 + var3 * var4;
        this.field5519 = this.field5519 * var2 + var3 * var5;
        this.field5504 = var2 * var6 - this.field5518 * var3;
        this.field5518 = this.field5518 * var2 + var3 * var6;
        this.field5507 = var2 * var7 - this.field5498 * var3;
        this.field5498 = this.field5498 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class395() {
        this.method1725();
    }
}
