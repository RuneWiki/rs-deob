import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DZFLZLPS")
public class class15 {

    @OriginalMember(owner = "DZFLZLPS", name = "a", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "DZFLZLPS", name = "b", descriptor = "I")
    private int field674 = -353;

    @OriginalMember(owner = "DZFLZLPS", name = "k", descriptor = "[I")
    private int[] field683 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "l", descriptor = "[I")
    private int[] field684 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "m", descriptor = "[I")
    private int[] field685 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "o", descriptor = "I")
    private int field687 = 100;

    @OriginalMember(owner = "DZFLZLPS", name = "r", descriptor = "I")
    public int field690 = 500;

    @OriginalMember(owner = "DZFLZLPS", name = "w", descriptor = "[I")
    private static int[] field695 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "x", descriptor = "[I")
    private static int[] field696 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "y", descriptor = "[I")
    private static int[] field697 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "z", descriptor = "[I")
    private static int[] field698 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "A", descriptor = "[I")
    private static int[] field699 = new int[5];

    @OriginalMember(owner = "DZFLZLPS", name = "n", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "DZFLZLPS", name = "s", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "DZFLZLPS", name = "p", descriptor = "LDJKDKZEW;")
    private class13 field688;

    @OriginalMember(owner = "DZFLZLPS", name = "c", descriptor = "LENGZWEMK;")
    private class17 field675;

    @OriginalMember(owner = "DZFLZLPS", name = "d", descriptor = "LENGZWEMK;")
    private class17 field676;

    @OriginalMember(owner = "DZFLZLPS", name = "e", descriptor = "LENGZWEMK;")
    private class17 field677;

    @OriginalMember(owner = "DZFLZLPS", name = "f", descriptor = "LENGZWEMK;")
    private class17 field678;

    @OriginalMember(owner = "DZFLZLPS", name = "g", descriptor = "LENGZWEMK;")
    private class17 field679;

    @OriginalMember(owner = "DZFLZLPS", name = "h", descriptor = "LENGZWEMK;")
    private class17 field680;

    @OriginalMember(owner = "DZFLZLPS", name = "i", descriptor = "LENGZWEMK;")
    private class17 field681;

    @OriginalMember(owner = "DZFLZLPS", name = "j", descriptor = "LENGZWEMK;")
    private class17 field682;

    @OriginalMember(owner = "DZFLZLPS", name = "q", descriptor = "LENGZWEMK;")
    private class17 field689;

    @OriginalMember(owner = "DZFLZLPS", name = "t", descriptor = "[I")
    private static int[] field692;

    @OriginalMember(owner = "DZFLZLPS", name = "u", descriptor = "[I")
    private static int[] field693;

    @OriginalMember(owner = "DZFLZLPS", name = "v", descriptor = "[I")
    private static int[] field694;

    @OriginalMember(owner = "DZFLZLPS", name = "a", descriptor = "()V")
    public static final void method217() {
        field693 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field693[var0] = 1;
            } else {
                field693[var0] = -1;
            }
        }
        field694 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field694[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field692 = new int[220500];
    }

    @OriginalMember(owner = "DZFLZLPS", name = "a", descriptor = "(II)[I")
    public final int[] method218(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field692[var3] = 0;
        }
        if (arg1 < 10) {
            return field692;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field675.method223((byte) -88);
        this.field676.method223((byte) -88);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field677 != null) {
            this.field677.method223((byte) -88);
            this.field678.method223((byte) -88);
            var6 = (int) ((double) (this.field677.field755 - this.field677.field754) * 32.768D / var4);
            var7 = (int) ((double) this.field677.field754 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field679 != null) {
            this.field679.method223((byte) -88);
            this.field680.method223((byte) -88);
            var9 = (int) ((double) (this.field679.field755 - this.field679.field754) * 32.768D / var4);
            var10 = (int) ((double) this.field679.field754 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field683[var12] != 0) {
                field695[var12] = 0;
                field696[var12] = (int) ((double) this.field685[var12] * var4);
                field697[var12] = (this.field683[var12] << 14) / 100;
                field698[var12] = (int) ((double) (this.field675.field755 - this.field675.field754) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field684[var12]) / var4);
                field699[var12] = (int) ((double) this.field675.field754 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field675.method224(9, arg0);
            int var42 = this.field676.method224(9, arg0);
            if (this.field677 != null) {
                int var43 = this.field677.method224(9, arg0);
                int var44 = this.field678.method224(9, arg0);
                var41 += this.method219(this.field677.field756, var44, var8, 3) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field679 != null) {
                int var45 = this.field679.method224(9, arg0);
                int var46 = this.field680.method224(9, arg0);
                var42 = var42 * ((this.method219(this.field679.field756, var46, var11, 3) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field683[var47] != 0) {
                    int var48 = field696[var47] + var13;
                    if (var48 < arg0) {
                        field692[var48] += this.method219(this.field675.field756, field697[var47] * var42 >> 15, field695[var47], 3);
                        field695[var47] += (field698[var47] * var41 >> 16) + field699[var47];
                    }
                }
            }
        }
        if (this.field681 != null) {
            this.field681.method223((byte) -88);
            this.field682.method223((byte) -88);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field681.method224(9, arg0);
                int var19 = this.field682.method224(9, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field681.field755 - this.field681.field754) * var18 >> 8) + this.field681.field754;
                } else {
                    var20 = ((this.field681.field755 - this.field681.field754) * var19 >> 8) + this.field681.field754;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field692[var17] = 0;
                }
            }
        }
        if (this.field686 > 0 && this.field687 > 0) {
            int var21 = (int) ((double) this.field686 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field692[var22] += field692[var22 - var21] * this.field687 / 100;
            }
        }
        if (this.field688.field646[0] > 0 || this.field688.field646[1] > 0) {
            this.field689.method223((byte) -88);
            int var23 = this.field689.method224(9, arg0 + 1);
            int var24 = this.field688.method212((float) var23 / 65536.0F, true, 0);
            int var25 = this.field688.method212((float) var23 / 65536.0F, true, 1);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field692[var24 + var26] * (long) class13.field653 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field692[var24 + var26 - var38 - 1] * (long) class13.field651[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field692[var26 - var39 - 1] * (long) class13.field651[1][var39] >> 16);
                    }
                    field692[var26] = var37;
                    var23 = this.field689.method224(9, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field692[var24 + var26] * (long) class13.field653 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field692[var24 + var26 - var35 - 1] * (long) class13.field651[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field692[var26 - var36 - 1] * (long) class13.field651[1][var36] >> 16);
                        }
                        field692[var26] = var34;
                        var23 = this.field689.method224(9, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field692[var24 + var26 - var31 - 1] * (long) class13.field651[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field692[var26 - var32 - 1] * (long) class13.field651[1][var32] >> 16);
                            }
                            field692[var26] = var30;
                            this.field689.method224(9, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field688.method212((float) var23 / 65536.0F, true, 0);
                    var25 = this.field688.method212((float) var23 / 65536.0F, true, 1);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field692[var40] < -32768) {
                field692[var40] = -32768;
            }
            if (field692[var40] > 32767) {
                field692[var40] = 32767;
            }
        }
        return field692;
    }

    @OriginalMember(owner = "DZFLZLPS", name = "a", descriptor = "(IIII)I")
    private final int method219(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 3 || arg3 > 3) {
            return 1;
        } else if (arg0 == 1) {
            return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg0 == 2) {
            return field694[arg2 & 0x7FFF] * arg1 >> 14;
        } else if (arg0 == 3) {
            return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg0 == 4) {
            return field693[arg2 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "DZFLZLPS", name = "a", descriptor = "(LPKHWFJLM;Z)V")
    public final void method220(class43 arg0, boolean arg1) {
        if (!arg1) {
            this.field674 = 171;
        }
        this.field675 = new class17();
        this.field675.method221(arg0, this.field673);
        this.field676 = new class17();
        this.field676.method221(arg0, this.field673);
        int var3 = arg0.method330();
        if (var3 != 0) {
            arg0.field1105--;
            this.field677 = new class17();
            this.field677.method221(arg0, this.field673);
            this.field678 = new class17();
            this.field678.method221(arg0, this.field673);
        }
        int var4 = arg0.method330();
        if (var4 != 0) {
            arg0.field1105--;
            this.field679 = new class17();
            this.field679.method221(arg0, this.field673);
            this.field680 = new class17();
            this.field680.method221(arg0, this.field673);
        }
        int var5 = arg0.method330();
        if (var5 != 0) {
            arg0.field1105--;
            this.field681 = new class17();
            this.field681.method221(arg0, this.field673);
            this.field682 = new class17();
            this.field682.method221(arg0, this.field673);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method344();
            if (var7 == 0) {
                break;
            }
            this.field683[var6] = var7;
            this.field684[var6] = arg0.method343();
            this.field685[var6] = arg0.method344();
        }
        this.field686 = arg0.method344();
        this.field687 = arg0.method344();
        this.field690 = arg0.method332();
        this.field691 = arg0.method332();
        this.field688 = new class13();
        this.field689 = new class17();
        this.field688.method213(this.field689, arg0, -376);
    }
}
