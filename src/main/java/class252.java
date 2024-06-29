import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class252 extends class33 {

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "J")
    public static long field3641 = 0L;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[B")
    public static byte[] field3621;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "F")
    public float field3615;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "F")
    public float field3617;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "F")
    public float field3618;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "F")
    public float field3623;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "F")
    public float field3625;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "F")
    public float field3628;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "F")
    public float field3629;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "F")
    public float field3638;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "F")
    public float field3640;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "F")
    public float field3643;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "F")
    public float field3644;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "F")
    public float field3650;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "Lho;")
    public static class97 field3649;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)[F")
    public final float[] method1576(byte arg0) {
        class466.field6739[13] = 0.0F;
        class466.field6739[1] = this.field3628;
        class466.field6739[10] = this.field3644;
        field3631++;
        class466.field6739[5] = this.field3640;
        class466.field6739[0] = this.field3615;
        class466.field6739[8] = this.field3617;
        class466.field6739[4] = this.field3629;
        class466.field6739[14] = 0.0F;
        class466.field6739[6] = this.field3625;
        class466.field6739[12] = 0.0F;
        class466.field6739[2] = this.field3650;
        if (arg0 != -42) {
            this.field3623 = -0.50987434F;
        }
        class466.field6739[9] = this.field3638;
        return class466.field6739;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
    public final void method278(int arg0, int arg1, int arg2) {
        field3626++;
        this.field3643 = arg0;
        this.field3623 = arg1;
        this.field3618 = arg2;
        this.field3615 = this.field3640 = this.field3644 = 1.0F;
        this.field3628 = this.field3650 = this.field3629 = this.field3625 = this.field3617 = this.field3638 = 0.0F;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lgs;I)V")
    public final void method1577(class33 arg0, int arg1) {
        field3635++;
        class252 var3 = (class252) arg0;
        if (arg1 != 1) {
            return;
        }
        this.field3617 = var3.field3650;
        this.field3629 = var3.field3628;
        this.field3615 = var3.field3615;
        this.field3650 = var3.field3617;
        this.field3628 = var3.field3629;
        this.field3638 = var3.field3625;
        this.field3640 = var3.field3640;
        this.field3644 = var3.field3644;
        this.field3643 = -(this.field3617 * var3.field3618 + this.field3629 * var3.field3623 + this.field3615 * var3.field3643);
        this.field3625 = var3.field3638;
        this.field3623 = -(this.field3638 * var3.field3618 + this.field3640 * var3.field3623 + this.field3628 * var3.field3643);
        this.field3618 = -(this.field3644 * var3.field3618 + this.field3650 * var3.field3643 + this.field3625 * var3.field3623);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lgs;)V")
    public final void method266(class33 arg0) {
        field3620++;
        class252 var2 = (class252) arg0;
        this.field3618 = var2.field3618;
        this.field3640 = var2.field3640;
        this.field3629 = var2.field3629;
        this.field3628 = var2.field3628;
        this.field3615 = var2.field3615;
        this.field3638 = var2.field3638;
        this.field3650 = var2.field3650;
        this.field3625 = var2.field3625;
        this.field3617 = var2.field3617;
        this.field3623 = var2.field3623;
        this.field3644 = var2.field3644;
        this.field3643 = var2.field3643;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()Lgs;")
    public final class33 method1578() {
        field3627++;
        class252 var1 = new class252();
        var1.field3640 = this.field3640;
        var1.field3638 = this.field3638;
        var1.field3623 = this.field3623;
        var1.field3629 = this.field3629;
        var1.field3643 = this.field3643;
        var1.field3617 = this.field3617;
        var1.field3618 = this.field3618;
        var1.field3650 = this.field3650;
        var1.field3628 = this.field3628;
        var1.field3615 = this.field3615;
        var1.field3625 = this.field3625;
        var1.field3644 = this.field3644;
        return var1;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III[I)V")
    public final void method273(int arg0, int arg1, int arg2, int[] arg3) {
        field3637++;
        arg3[1] = (int) ((float) arg2 * this.field3638 + (float) arg0 * this.field3628 + (float) arg1 * this.field3640 + this.field3623);
        arg3[2] = (int) ((float) arg2 * this.field3644 + (float) arg0 * this.field3650 + (float) arg1 * this.field3625 + this.field3618);
        arg3[0] = (int) ((float) arg2 * this.field3617 + (float) arg0 * this.field3615 + (float) arg1 * this.field3629 + this.field3643);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)[F")
    public final float[] method1579(byte arg0) {
        class466.field6739[4] = this.field3629;
        class466.field6739[8] = this.field3617;
        class466.field6739[10] = this.field3644;
        field3645++;
        class466.field6739[6] = this.field3625;
        class466.field6739[1] = this.field3628;
        class466.field6739[5] = this.field3640;
        if (arg0 != -53) {
            field3621 = null;
        }
        class466.field6739[9] = this.field3638;
        class466.field6739[13] = this.field3623;
        class466.field6739[14] = this.field3618;
        class466.field6739[0] = this.field3615;
        class466.field6739[2] = this.field3650;
        class466.field6739[12] = this.field3643;
        return class466.field6739;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method267(int arg0) {
        this.field3615 = 1.0F;
        field3630++;
        this.field3640 = this.field3644 = class331.field4802[arg0 & 0x3FFF];
        this.field3625 = class331.field4808[arg0 & 0x3FFF];
        this.field3638 = -this.field3625;
        this.field3629 = this.field3617 = this.field3643 = this.field3628 = this.field3623 = this.field3650 = this.field3618 = 0.0F;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public final void method276(int arg0) {
        field3616++;
        this.field3640 = 1.0F;
        this.field3615 = this.field3644 = class331.field4802[arg0 & 0x3FFF];
        this.field3617 = class331.field4808[arg0 & 0x3FFF];
        this.field3629 = this.field3643 = this.field3628 = this.field3638 = this.field3623 = this.field3625 = this.field3618 = 0.0F;
        this.field3650 = -this.field3617;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
    public static void method1580(byte arg0) {
        field3649 = null;
        field3621 = null;
        int var1 = -63 % ((arg0 + 16) / 58);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public final void method268(int arg0) {
        field3624++;
        this.field3644 = 1.0F;
        this.field3615 = this.field3640 = class331.field4802[arg0 & 0x3FFF];
        this.field3628 = class331.field4808[arg0 & 0x3FFF];
        this.field3617 = this.field3643 = this.field3638 = this.field3623 = this.field3650 = this.field3625 = this.field3618 = 0.0F;
        this.field3629 = -this.field3628;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
    public final void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3639++;
        float var7 = class331.field4802[arg3 & 0x3FFF];
        float var8 = class331.field4808[arg3 & 0x3FFF];
        float var9 = class331.field4802[arg4 & 0x3FFF];
        float var10 = class331.field4808[arg4 & 0x3FFF];
        float var11 = class331.field4802[arg5 & 0x3FFF];
        float var12 = class331.field4808[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3625 = -var8;
        this.field3617 = -var10 * var11 + var9 * var14;
        this.field3629 = var7 * var12;
        this.field3650 = var7 * var10;
        this.field3628 = -var9 * var12 + var10 * var13;
        this.field3615 = var9 * var11 + var10 * var14;
        this.field3640 = var7 * var11;
        this.field3638 = var9 * var13 + var10 * var12;
        this.field3644 = var7 * var9;
        this.field3618 = (float) (-arg0) * this.field3650 - (float) arg1 * this.field3625 - (float) arg2 * this.field3644;
        this.field3623 = (float) (-arg0) * this.field3628 - (float) arg1 * this.field3640 - ((float) arg2 * this.field3638);
        this.field3643 = (float) (-arg0) * this.field3615 - ((float) arg1 * this.field3629) - (float) arg2 * this.field3617;
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
    public static final void method1581(int arg0) {
        field3632++;
        if (class31.field518 != null) {
            return;
        }
        class31.field518 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 13 / ((arg0 - 43) / 50);
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if (var9 < 0.5D) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - var7 * var9;
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if (var25 < 0.0D) {
                    var25++;
                }
                if (var21 * 6.0D < 1.0D) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if ((var21 * 2.0D < 1.0D)) {
                    var11 = var17;
                } else if (var21 * 3.0D < 2.0D) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var5 * 6.0D < 1.0D) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if (var5 * 2.0D < 1.0D) {
                    var13 = var17;
                } else if (var5 * 3.0D < 2.0D) {
                    var13 = (0.6666666666666666D - var5) * (var17 - var19) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if ((var25 * 2.0D < 1.0D)) {
                    var15 = var17;
                } else if (var25 * 3.0D < 2.0D) {
                    var15 = (0.6666666666666666D - var25) * (var17 - var19) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class31.field518[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
    public final void method274() {
        field3647++;
        this.field3628 = this.field3650 = this.field3629 = this.field3625 = this.field3617 = this.field3638 = this.field3643 = this.field3623 = this.field3618 = 0.0F;
        this.field3615 = this.field3640 = this.field3644 = 1.0F;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public final void method270(int arg0) {
        field3619++;
        float var2 = class331.field4802[arg0 & 0x3FFF];
        float var3 = class331.field4808[arg0 & 0x3FFF];
        float var4 = this.field3628;
        float var5 = this.field3640;
        float var6 = this.field3638;
        this.field3628 = var2 * var4 - this.field3650 * var3;
        float var7 = this.field3623;
        this.field3650 = this.field3650 * var2 + var3 * var4;
        this.field3640 = var2 * var5 - (this.field3625 * var3);
        this.field3625 = this.field3625 * var2 + var3 * var5;
        this.field3638 = var2 * var6 - (this.field3644 * var3);
        this.field3644 = this.field3644 * var2 + var3 * var6;
        this.field3623 = var2 * var7 - (this.field3618 * var3);
        this.field3618 = this.field3618 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[I)V")
    public final void method271(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field3617 + (float) arg0 * this.field3615 + (float) arg1 * this.field3629);
        field3622++;
        arg3[2] = (int) ((float) arg2 * this.field3644 + (float) arg0 * this.field3650 + (float) arg1 * this.field3625);
        arg3[1] = (int) ((float) arg2 * this.field3638 + (float) arg0 * this.field3628 + (float) arg1 * this.field3640);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(FFFIIII)V")
    public final void method1582(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6) {
        field3646++;
        if (arg6 != 65536) {
            this.method1577(null, 73);
        }
        if (arg5 == 0) {
            this.field3628 = this.field3650 = this.field3629 = this.field3625 = this.field3617 = this.field3638 = 0.0F;
            this.field3640 = arg4;
            this.field3644 = 1.0F;
            this.field3615 = arg3;
        } else {
            float var8 = class331.field4802[arg5 & 0x3FFF];
            float var9 = class331.field4808[arg5 & 0x3FFF];
            this.field3640 = (float) arg4 * var8;
            this.field3628 = (float) arg3 * var9;
            this.field3615 = (float) arg3 * var8;
            this.field3629 = (float) arg4 * -var9;
            this.field3644 = 1.0F;
            this.field3650 = this.field3625 = this.field3617 = this.field3638 = 0.0F;
        }
        this.field3618 = arg2;
        this.field3643 = arg0;
        this.field3623 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([I)V")
    public final void method272(int[] arg0) {
        field3633++;
        float var2 = (float) arg0[0] - this.field3643;
        float var3 = (float) arg0[1] - this.field3623;
        float var4 = (float) arg0[2] - this.field3618;
        arg0[1] = (int) (this.field3625 * var4 + this.field3640 * var3 + this.field3629 * var2);
        arg0[0] = (int) (this.field3650 * var4 + this.field3628 * var3 + this.field3615 * var2);
        arg0[2] = (int) (this.field3644 * var4 + this.field3638 * var3 + this.field3617 * var2);
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    public final void method279(int arg0) {
        field3634++;
        float var2 = class331.field4802[arg0 & 0x3FFF];
        float var3 = class331.field4808[arg0 & 0x3FFF];
        float var4 = this.field3615;
        float var5 = this.field3629;
        float var6 = this.field3617;
        this.field3615 = this.field3650 * var3 + var2 * var4;
        float var7 = this.field3643;
        this.field3650 = this.field3650 * var2 - (var3 * var4);
        this.field3629 = this.field3625 * var3 + var2 * var5;
        this.field3625 = this.field3625 * var2 - var3 * var5;
        this.field3617 = this.field3644 * var3 + var2 * var6;
        this.field3644 = this.field3644 * var2 - (var3 * var6);
        this.field3643 = this.field3618 * var3 + var2 * var7;
        this.field3618 = this.field3618 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        field3642++;
        this.field3623 += arg1;
        this.field3618 += arg2;
        this.field3643 += arg0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class252() {
        this.method274();
    }

    static {
        int var0 = 0;
        field3621 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3621[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
