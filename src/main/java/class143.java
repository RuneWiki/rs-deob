import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class143 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field3465 = 0;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    private int field3469 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[I")
    private int[] field3473 = new int[5];

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
    private int[] field3471 = new int[5];

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "[I")
    private int[] field3480 = new int[5];

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3486 = 500;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3487 = 100;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
    private static int[] field3464 = new int[32768];

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private static int[] field3474;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[I")
    private static int[] field3468;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
    private static int[] field3479;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[I")
    private static int[] field3481;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "[I")
    private static int[] field3488;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "[I")
    private static int[] field3478;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    private static int[] field3485;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Ls;")
    private class122 field3475;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lnb;")
    private class92 field3466;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lnb;")
    private class92 field3467;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lnb;")
    private class92 field3470;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lnb;")
    private class92 field3472;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Lnb;")
    private class92 field3476;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lnb;")
    private class92 field3477;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lnb;")
    private class92 field3482;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lnb;")
    private class92 field3483;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "Lnb;")
    private class92 field3484;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
    public static void method1153() {
        field3468 = null;
        field3464 = null;
        field3474 = null;
        field3488 = null;
        field3481 = null;
        field3479 = null;
        field3485 = null;
        field3478 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lb;)V")
    public final void method1154(class8 arg0) {
        this.field3467 = new class92();
        this.field3467.method747(arg0);
        this.field3472 = new class92();
        this.field3472.method747(arg0);
        int var2 = arg0.method62((byte) 82);
        if (var2 != 0) {
            arg0.field182--;
            this.field3483 = new class92();
            this.field3483.method747(arg0);
            this.field3482 = new class92();
            this.field3482.method747(arg0);
        }
        int var3 = arg0.method62((byte) 120);
        if (var3 != 0) {
            arg0.field182--;
            this.field3470 = new class92();
            this.field3470.method747(arg0);
            this.field3477 = new class92();
            this.field3477.method747(arg0);
        }
        int var4 = arg0.method62((byte) 103);
        if (var4 != 0) {
            arg0.field182--;
            this.field3476 = new class92();
            this.field3476.method747(arg0);
            this.field3484 = new class92();
            this.field3484.method747(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method103(-23734);
            if (var6 == 0) {
                break;
            }
            this.field3480[var5] = var6;
            this.field3473[var5] = arg0.method61(false);
            this.field3471[var5] = arg0.method103(-23734);
        }
        this.field3469 = arg0.method103(-23734);
        this.field3487 = arg0.method103(-23734);
        this.field3486 = arg0.method68(-2);
        this.field3465 = arg0.method68(-2);
        this.field3475 = new class122();
        this.field3466 = new class92();
        this.field3475.method968(arg0, this.field3466);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
    private final int method1155(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field3474[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field3464[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[I")
    public final int[] method1156(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field3468[var3] = 0;
        }
        if (arg1 < 10) {
            return field3468;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field3467.method749();
        this.field3472.method749();
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field3483 != null) {
            this.field3483.method749();
            this.field3482.method749();
            var6 = (int) ((double) (this.field3483.field2119 - this.field3483.field2120) * 32.768D / var4);
            var7 = (int) ((double) this.field3483.field2120 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field3470 != null) {
            this.field3470.method749();
            this.field3477.method749();
            var9 = (int) ((double) (this.field3470.field2119 - this.field3470.field2120) * 32.768D / var4);
            var10 = (int) ((double) this.field3470.field2120 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field3480[var12] != 0) {
                field3488[var12] = 0;
                field3481[var12] = (int) ((double) this.field3471[var12] * var4);
                field3479[var12] = (this.field3480[var12] << 14) / 100;
                field3485[var12] = (int) ((double) (this.field3467.field2119 - this.field3467.field2120) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field3473[var12]) / var4);
                field3478[var12] = (int) ((double) this.field3467.field2120 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var40 = this.field3467.method748(arg0);
            int var41 = this.field3472.method748(arg0);
            if (this.field3483 != null) {
                int var42 = this.field3483.method748(arg0);
                int var43 = this.field3482.method748(arg0);
                var40 += this.method1155(var8, var43, this.field3483.field2122) >> 1;
                var8 += (var6 * var42 >> 16) + var7;
            }
            if (this.field3470 != null) {
                int var44 = this.field3470.method748(arg0);
                int var45 = this.field3477.method748(arg0);
                var41 = var41 * ((this.method1155(var11, var45, this.field3470.field2122) >> 1) + 32768) >> 15;
                var11 += (var9 * var44 >> 16) + var10;
            }
            for (int var46 = 0; var46 < 5; var46++) {
                if (this.field3480[var46] != 0) {
                    int var47 = field3481[var46] + var13;
                    if (var47 < arg0) {
                        field3468[var47] += this.method1155(field3488[var46], field3479[var46] * var41 >> 15, this.field3467.field2122);
                        field3488[var46] += (field3485[var46] * var40 >> 16) + field3478[var46];
                    }
                }
            }
        }
        if (this.field3476 != null) {
            this.field3476.method749();
            this.field3484.method749();
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field3476.method748(arg0);
                int var19 = this.field3484.method748(arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field3476.field2119 - this.field3476.field2120) * var18 >> 8) + this.field3476.field2120;
                } else {
                    var20 = ((this.field3476.field2119 - this.field3476.field2120) * var19 >> 8) + this.field3476.field2120;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field3468[var17] = 0;
                }
            }
        }
        if (this.field3469 > 0 && this.field3487 > 0) {
            int var21 = (int) ((double) this.field3469 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field3468[var22] += field3468[var22 - var21] * this.field3487 / 100;
            }
        }
        if (this.field3475.field2723[0] > 0 || this.field3475.field2723[1] > 0) {
            this.field3466.method749();
            int var23 = this.field3466.method748(arg0 + 1);
            int var24 = this.field3475.method966(0, (float) var23 / 65536.0F);
            int var25 = this.field3475.method966(1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var36 = (int) ((long) field3468[var24 + var26] * (long) class122.field2722 >> 16);
                    for (int var37 = 0; var37 < var24; var37++) {
                        var36 += (int) ((long) field3468[var24 + var26 - var37 - 1] * (long) class122.field2718[0][var37] >> 16);
                    }
                    for (int var38 = 0; var38 < var26; var38++) {
                        var36 -= (int) ((long) field3468[var26 - var38 - 1] * (long) class122.field2718[1][var38] >> 16);
                    }
                    field3468[var26] = var36;
                    var23 = this.field3466.method748(arg0 + 1);
                    var26++;
                }
                int var28 = 128;
                while (true) {
                    if (var28 > arg0 - var24) {
                        var28 = arg0 - var24;
                    }
                    while (var26 < var28) {
                        int var33 = (int) ((long) field3468[var24 + var26] * (long) class122.field2722 >> 16);
                        for (int var34 = 0; var34 < var24; var34++) {
                            var33 += (int) ((long) field3468[var24 + var26 - var34 - 1] * (long) class122.field2718[0][var34] >> 16);
                        }
                        for (int var35 = 0; var35 < var25; var35++) {
                            var33 -= (int) ((long) field3468[var26 - var35 - 1] * (long) class122.field2718[1][var35] >> 16);
                        }
                        field3468[var26] = var33;
                        var23 = this.field3466.method748(arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var29 = 0;
                            for (int var30 = var24 + var26 - arg0; var30 < var24; var30++) {
                                var29 += (int) ((long) field3468[var24 + var26 - var30 - 1] * (long) class122.field2718[0][var30] >> 16);
                            }
                            for (int var31 = 0; var31 < var25; var31++) {
                                var29 -= (int) ((long) field3468[var26 - var31 - 1] * (long) class122.field2718[1][var31] >> 16);
                            }
                            field3468[var26] = var29;
                            this.field3466.method748(arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field3475.method966(0, (float) var23 / 65536.0F);
                    var25 = this.field3475.method966(1, (float) var23 / 65536.0F);
                    var28 += 128;
                }
            }
        }
        for (int var39 = 0; var39 < arg0; var39++) {
            if (field3468[var39] < -32768) {
                field3468[var39] = -32768;
            }
            if (field3468[var39] > 32767) {
                field3468[var39] = 32767;
            }
        }
        return field3468;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field3464[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field3474 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field3474[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field3468 = new int[220500];
        field3479 = new int[5];
        field3481 = new int[5];
        field3488 = new int[5];
        field3478 = new int[5];
        field3485 = new int[5];
    }
}
