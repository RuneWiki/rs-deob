import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class238 extends class111 {

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    private int field3498 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
    public boolean field3510 = false;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Z")
    private boolean field3505 = false;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lhq;")
    public class88 field3494;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "Lnl;")
    public class328 field3507;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "J")
    private long field3492;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "Ltg;")
    public class126 field3515;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Lcl;")
    public class145 field3486;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lpm;")
    public static class349 field3496 = new class349("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Lpm;")
    public static class349 field3519 = new class349("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field3520 = 0;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "[B")
    public static byte[] field3522;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    private int field3485;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field3488;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    private int field3489;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    private int field3497;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    private int field3502;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public int field3504;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    private int field3512;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field3521;

    static {
        new class349("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field3522 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILvq;[[IZ)V", line = 6)
    public static final void method1621(boolean arg0, int arg1, class269 arg2, int[][] arg3, boolean arg4) {
        field3495++;
        int var5 = 0;
        if (!arg4) {
            method1621(false, 123, (class269) null, (int[][]) null, true);
        }
        while (var5 < arg1) {
            int[][] var6;
            if (arg3 == null) {
                var6 = null;
            } else {
                var6 = new int[class80.field1034 + 1][class381.field5414 + 1];
                for (int var7 = 0; var7 <= class381.field5414; var7++) {
                    for (int var8 = 0; var8 <= class80.field1034; var8++) {
                        var6[var8][var7] = class207.field2975[var5][var8][var7] - arg3[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg0) {
                if (class51.field664) {
                    var10 |= 0x8;
                }
                if (class120.field1626) {
                    var9 |= 0x2;
                }
                if (class194.field2802 != 0) {
                    if (var5 == 0 || class306.field4461 >= 96) {
                        var10 |= 0x10;
                    }
                    var9 |= 0x1;
                }
            }
            if (class120.field1626) {
                var10 |= 0x7;
            }
            class92 var11 = arg2.method997(class80.field1034, class381.field5414, class207.field2975[var5], var6, 128, var9, var10);
            class355.method2324(var5, var11);
            var5++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ)V", line = 94)
    public final void method1622(int arg0, long arg1) {
        field3516++;
        for (class12 var4 = (class12) this.field3486.method1082(114); var4 != null; var4 = (class12) this.field3486.method1078(false)) {
            var4.method66(arg1);
        }
        if (arg0 != -1) {
            method1626(-104);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lvq;Lhq;Lnl;J)V", line = 406)
    public class238(class269 arg0, class88 arg1, class328 arg2, long arg3) {
        this.field3494 = arg1;
        this.field3507 = arg2;
        this.field3492 = arg3;
        this.field3515 = class92.method547(this.field3494.field1149, (byte) 18);
        if (!arg0.method1026() && this.field3515.field1721 != -1) {
            this.field3515 = class92.method547(this.field3515.field1721, (byte) 18);
        }
        this.field3486 = new class145();
        this.field3498 = (int) ((double) this.field3498 + Math.random() * 64.0D);
        this.method1624(105);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZLvq;ZJ)V", line = 120)
    public final void method1623(int arg0, boolean arg1, class269 arg2, boolean arg3, long arg4) {
        if (this.field3510) {
            arg1 = false;
        } else if (this.field3515.field1718 > class96.field1230) {
            arg1 = false;
        } else if (class140.field2138 > class80.field1038[class96.field1230]) {
            arg1 = false;
        } else if (this.field3505) {
            arg1 = false;
        } else if (this.field3515.field1702 != -1) {
            int var7 = (int) (arg4 - this.field3492);
            if (this.field3515.field1726 || var7 <= this.field3515.field1702) {
                var7 %= this.field3515.field1702;
            } else {
                arg1 = false;
            }
            if (!this.field3515.field1740 && var7 < this.field3515.field1686) {
                arg1 = false;
            }
            if (this.field3515.field1740 && this.field3515.field1686 <= var7) {
                arg1 = false;
            }
        }
        field3506++;
        if (arg1) {
            this.field3498 += (int) (((double) this.field3515.field1684 + Math.random() * (double) (this.field3515.field1742 - this.field3515.field1684)) * (double) arg0);
            if (this.field3498 > 63) {
                int var8 = this.field3498 >> 6;
                this.field3498 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3515.field1731 <= 0 && this.field3515.field1709 <= 0) {
                        var10 = this.field3501;
                        var11 = this.field3514;
                        var12 = this.field3513;
                    } else {
                        int var13 = this.field3508 + (int) (Math.random() * (double) this.field3489);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class447.field6381[var14];
                        int var16 = class447.field6390[var14];
                        int var17 = (int) ((double) this.field3502 * Math.random()) + this.field3499;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class447.field6381[var18];
                        int var20 = class447.field6390[var18];
                        var12 = var16 * var19 >> 15;
                        var11 = var20 * -1;
                        var10 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3497 * var21 - (-(this.field3517 * var22) - this.field3512 * var23) >> 16;
                    int var25 = this.field3518 * var23 + this.field3491 * var21 + this.field3488 * var22 >> 16;
                    int var26 = this.field3500 * var23 + this.field3509 * var21 + this.field3485 * var22 >> 16;
                    int var27 = this.field3515.field1749 + (int) ((double) (this.field3515.field1753 - this.field3515.field1749) * Math.random());
                    int var28 = this.field3515.field1752 + (int) (Math.random() * (double) (this.field3515.field1745 - this.field3515.field1752));
                    int var29 = (int) (Math.random() * (double) (this.field3515.field1751 - this.field3515.field1733)) + this.field3515.field1733;
                    int var32;
                    if (this.field3515.field1683) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field3515.field1712 * var30 + (double) this.field3515.field1730) << 16 | (int) ((double) this.field3515.field1728 * var30 + (double) this.field3515.field1724) << 8 | (int) ((double) this.field3515.field1692 * var30 + (double) this.field3515.field1737) | (int) ((double) this.field3515.field1748 * var30 + (double) this.field3515.field1710) << 24;
                    } else {
                        var32 = (int) ((double) this.field3515.field1710 + Math.random() * (double) this.field3515.field1748) << 24 | (int) ((double) this.field3515.field1728 * Math.random() + (double) this.field3515.field1724) << 8 | (int) ((double) this.field3515.field1730 + Math.random() * (double) this.field3515.field1712) << 16 | (int) (Math.random() * (double) this.field3515.field1692 + (double) this.field3515.field1737);
                    }
                    int var33 = this.field3515.field1719;
                    if (!arg2.method1026() && !this.field3515.field1755) {
                        var33 = -1;
                    }
                    if (class430.field6118 == class327.field4748) {
                        new class12(this, var24, var25, var26, var12, var11, var10, var27, var28, var32, var29, var33, this.field3515.field1687);
                    } else {
                        class12 var34 = class355.field5143[class327.field4748];
                        class327.field4748 = class327.field4748 + 1 & 0x3FF;
                        var34.method67(this, var24, var25, var26, var12, var11, var10, var27, var28, var32, var29, var33, this.field3515.field1687);
                    }
                }
            }
        }
        this.field3504 = 0;
        if (!arg3) {
            this.field3515 = null;
        }
        for (class12 var36 = (class12) this.field3486.method1082(117); var36 != null; var36 = (class12) this.field3486.method1078(false)) {
            var36.method68(arg4, arg0);
            this.field3504++;
        }
        class56.field748 += this.field3504;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 298)
    public final void method1624(int arg0) {
        this.field3512 = this.field3494.field1137;
        this.field3488 = this.field3494.field1142;
        this.field3518 = this.field3494.field1138;
        this.field3500 = this.field3494.field1147;
        this.field3497 = this.field3494.field1153;
        this.field3517 = this.field3494.field1150;
        field3493++;
        this.field3509 = this.field3494.field1141;
        this.field3491 = this.field3494.field1139;
        if (arg0 < 30) {
            return;
        }
        this.field3485 = this.field3494.field1146;
        if (this.field3517 == this.field3497 && this.field3517 == this.field3512 && this.field3491 == this.field3488 && this.field3518 == this.field3488 && this.field3509 == this.field3485 && this.field3500 == this.field3485) {
            this.field3505 = true;
            return;
        }
        this.field3505 = false;
        int var2 = (this.field3517 + this.field3497 + this.field3512) / 3;
        int var3 = (this.field3518 + this.field3488 + this.field3491) / 3;
        int var4 = (this.field3509 + this.field3500 + this.field3485) / 3;
        if (this.field3511 == var2 && this.field3490 == var3 && this.field3487 == var4) {
            return;
        }
        this.field3511 = var2;
        this.field3487 = var4;
        this.field3490 = var3;
        int var5 = this.field3517 - this.field3497;
        int var6 = this.field3488 - this.field3491;
        int var7 = this.field3485 - this.field3509;
        int var8 = this.field3512 - this.field3497;
        int var9 = this.field3518 - this.field3491;
        int var10 = this.field3500 - this.field3509;
        this.field3514 = var7 * var8 - (var5 * var10);
        this.field3501 = var5 * var9 - (var6 * var8);
        this.field3513 = var6 * var10 - var7 * var9;
        while (this.field3513 > 32767 || this.field3514 > 32767 || this.field3501 > 32767 || this.field3513 < -32767 || this.field3514 < -32767 || this.field3501 < -32767) {
            this.field3501 >>= 0x1;
            this.field3513 >>= 0x1;
            this.field3514 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3501 * this.field3501 + this.field3514 * this.field3514 + this.field3513 * this.field3513));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3514 = this.field3514 * 32767 / var11;
        this.field3513 = this.field3513 * 32767 / var11;
        this.field3501 = this.field3501 * 32767 / var11;
        if (this.field3515.field1731 <= 0 && this.field3515.field1709 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3501, (double) this.field3513) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3514, Math.sqrt((double) (this.field3513 * this.field3513 + this.field3501 * this.field3501))) * 2607.5945876176133D);
        this.field3489 = this.field3515.field1731 - this.field3515.field1747;
        this.field3508 = var12 + this.field3515.field1747 - (this.field3489 >> 1);
        this.field3502 = this.field3515.field1709 - this.field3515.field1750;
        this.field3499 = this.field3515.field1750 + var13 - (this.field3502 >> 1);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V", line = 387)
    public static final void method1625(boolean arg0, int arg1) {
        class399.field5615 = arg0;
        field3503++;
        if (arg1 >= -13) {
            method1626(79);
        }
        class327.field4742 = !class296.method2000((byte) -73);
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 427)
    public static void method1626(int arg0) {
        field3496 = null;
        if (arg0 == 16) {
            field3519 = null;
            field3522 = null;
        }
    }
}
