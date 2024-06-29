import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class247 extends class377 {

    @OriginalMember(owner = "client!rr", name = "db", descriptor = "I")
    private int field3635 = 0;

    @OriginalMember(owner = "client!rr", name = "sb", descriptor = "I")
    private int field3650 = 0;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "Z")
    private boolean field3605 = true;

    @OriginalMember(owner = "client!rr", name = "Hb", descriptor = "I")
    private int field3665 = 0;

    @OriginalMember(owner = "client!rr", name = "fc", descriptor = "Z")
    private boolean field3689 = false;

    @OriginalMember(owner = "client!rr", name = "ub", descriptor = "I")
    private int field3652 = 0;

    @OriginalMember(owner = "client!rr", name = "wc", descriptor = "I")
    private int field3706 = 0;

    @OriginalMember(owner = "client!rr", name = "Ib", descriptor = "Lih;")
    private class503 field3666;

    @OriginalMember(owner = "client!rr", name = "V", descriptor = "Lff;")
    private class9 field3627;

    @OriginalMember(owner = "client!rr", name = "nc", descriptor = "Lff;")
    private class9 field3697;

    @OriginalMember(owner = "client!rr", name = "Eb", descriptor = "Lff;")
    private class9 field3662;

    @OriginalMember(owner = "client!rr", name = "mc", descriptor = "Lff;")
    private class9 field3696;

    @OriginalMember(owner = "client!rr", name = "gb", descriptor = "Llh;")
    private class372 field3638;

    @OriginalMember(owner = "client!rr", name = "ob", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!rr", name = "fb", descriptor = "[I")
    private int[] field3637;

    @OriginalMember(owner = "client!rr", name = "dc", descriptor = "[I")
    private int[] field3687;

    @OriginalMember(owner = "client!rr", name = "Jb", descriptor = "[S")
    private short[] field3667;

    @OriginalMember(owner = "client!rr", name = "kc", descriptor = "[I")
    private int[] field3694;

    @OriginalMember(owner = "client!rr", name = "bb", descriptor = "[I")
    private int[] field3633;

    @OriginalMember(owner = "client!rr", name = "ic", descriptor = "[Lck;")
    private class462[] field3692;

    @OriginalMember(owner = "client!rr", name = "Ob", descriptor = "[Lsd;")
    private class63[] field3672;

    @OriginalMember(owner = "client!rr", name = "Lb", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!rr", name = "hb", descriptor = "[Lid;")
    private class421[] field3639;

    @OriginalMember(owner = "client!rr", name = "Fb", descriptor = "[Lov;")
    private class126[] field3663;

    @OriginalMember(owner = "client!rr", name = "Ub", descriptor = "[B")
    private byte[] field3678;

    @OriginalMember(owner = "client!rr", name = "jc", descriptor = "[S")
    private short[] field3693;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "[S")
    private short[] field3608;

    @OriginalMember(owner = "client!rr", name = "Cb", descriptor = "[S")
    private short[] field3660;

    @OriginalMember(owner = "client!rr", name = "Zb", descriptor = "[B")
    private byte[] field3683;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "[F")
    private float[] field3613;

    @OriginalMember(owner = "client!rr", name = "oc", descriptor = "[S")
    private short[] field3698;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "[S")
    private short[] field3606;

    @OriginalMember(owner = "client!rr", name = "tb", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "S")
    private short field3596;

    @OriginalMember(owner = "client!rr", name = "ac", descriptor = "[F")
    private float[] field3684;

    @OriginalMember(owner = "client!rr", name = "hc", descriptor = "[S")
    private short[] field3691;

    @OriginalMember(owner = "client!rr", name = "T", descriptor = "[S")
    private short[] field3625;

    @OriginalMember(owner = "client!rr", name = "wb", descriptor = "[S")
    private short[] field3654;

    @OriginalMember(owner = "client!rr", name = "Wb", descriptor = "[S")
    private short[] field3680;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "S")
    private short field3600;

    @OriginalMember(owner = "client!rr", name = "qb", descriptor = "[I")
    private int[] field3648;

    @OriginalMember(owner = "client!rr", name = "cc", descriptor = "[[I")
    private int[][] field3686;

    @OriginalMember(owner = "client!rr", name = "sc", descriptor = "[[I")
    private int[][] field3702;

    @OriginalMember(owner = "client!rr", name = "nb", descriptor = "[[I")
    private int[][] field3645;

    @OriginalMember(owner = "client!rr", name = "Qb", descriptor = "Lkn;")
    public static class530 field3674 = new class530("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!rr", name = "yc", descriptor = "Ltn;")
    public static class60 field3708 = new class60(25, -1);

    @OriginalMember(owner = "client!rr", name = "Ac", descriptor = "Lkn;")
    public static class530 field3710 = new class530(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!rr", name = "yb", descriptor = "B")
    private byte field3656;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!rr", name = "U", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!rr", name = "W", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!rr", name = "Y", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!rr", name = "Z", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!rr", name = "ab", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!rr", name = "cb", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!rr", name = "eb", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!rr", name = "ib", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!rr", name = "jb", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!rr", name = "kb", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!rr", name = "rb", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!rr", name = "vb", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!rr", name = "xb", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!rr", name = "zb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!rr", name = "Ab", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!rr", name = "Bb", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!rr", name = "Gb", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!rr", name = "Kb", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!rr", name = "Mb", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!rr", name = "Nb", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!rr", name = "Pb", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!rr", name = "Rb", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!rr", name = "Sb", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!rr", name = "Tb", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!rr", name = "Vb", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!rr", name = "Xb", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!rr", name = "Yb", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!rr", name = "gc", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!rr", name = "pc", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!rr", name = "qc", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!rr", name = "rc", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!rr", name = "tc", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!rr", name = "uc", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!rr", name = "vc", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!rr", name = "xc", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!rr", name = "zc", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!rr", name = "Bc", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!rr", name = "X", descriptor = "Lik;")
    private class142 field3629;

    @OriginalMember(owner = "client!rr", name = "bc", descriptor = "Ltg;")
    private class157 field3685;

    @OriginalMember(owner = "client!rr", name = "Db", descriptor = "Lnq;")
    private class325 field3661;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "S")
    private short field3610;

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "S")
    private short field3622;

    @OriginalMember(owner = "client!rr", name = "lb", descriptor = "S")
    private short field3643;

    @OriginalMember(owner = "client!rr", name = "mb", descriptor = "S")
    private short field3644;

    @OriginalMember(owner = "client!rr", name = "pb", descriptor = "S")
    private short field3647;

    @OriginalMember(owner = "client!rr", name = "ec", descriptor = "S")
    private short field3688;

    @OriginalMember(owner = "client!rr", name = "lc", descriptor = "S")
    private short field3695;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method1562(class377 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3676++;
        class247 var6 = (class247) arg0;
        if (this.field3635 == 0 || var6.field3635 == 0) {
            return;
        }
        int var7 = var6.field3706;
        int[] var8 = var6.field3687;
        int[] var9 = var6.field3633;
        int[] var10 = var6.field3694;
        short[] var11 = var6.field3660;
        short[] var12 = var6.field3651;
        short[] var13 = var6.field3698;
        byte[] var14 = var6.field3683;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field3661 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field3661.field4745;
            var17 = this.field3661.field4743;
            var15 = this.field3661.field4741;
            var16 = this.field3661.field4742;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field3661 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field3661.field4743;
            var22 = var6.field3661.field4745;
            var20 = var6.field3661.field4741;
            var19 = var6.field3661.field4742;
        }
        int[] var23 = var6.field3637;
        short[] var24 = var6.field3654;
        if (!var6.field3689) {
            var6.method1588((byte) 123);
        }
        short var25 = var6.field3643;
        short var26 = var6.field3647;
        short var27 = var6.field3695;
        short var28 = var6.field3644;
        short var29 = var6.field3622;
        short var30 = var6.field3610;
        for (int var31 = 0; var31 < this.field3706; var31++) {
            int var32 = this.field3633[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field3687[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3694[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field3637[var31];
                        int var37 = this.field3637[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3654[var38] - 1;
                            if (var35 == -1 || this.field3683[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var16 == null) {
                                            this.field3661 = new class325();
                                            var16 = this.field3661.field4742 = class364.method2151((byte) -21, this.field3660);
                                            var18 = this.field3661.field4745 = class364.method2151((byte) -21, this.field3651);
                                            var15 = this.field3661.field4741 = class364.method2151((byte) -21, this.field3698);
                                            var17 = this.field3661.field4743 = class522.method3084(0, this.field3683);
                                        }
                                        if (var19 == null) {
                                            class325 var44 = var6.field3661 = new class325();
                                            var19 = var44.field4742 = class364.method2151((byte) -21, var11);
                                            var22 = var44.field4745 = class364.method2151((byte) -21, var12);
                                            var20 = var44.field4741 = class364.method2151((byte) -21, var13);
                                            var21 = var44.field4743 = class522.method3084(0, var14);
                                        }
                                        short var45 = this.field3660[var35];
                                        short var46 = this.field3651[var35];
                                        short var47 = this.field3698[var35];
                                        byte var48 = this.field3683[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field3637[var31 + 1];
                                        short var54 = var11[var41];
                                        byte var55 = var14[var41];
                                        short var56 = var12[var41];
                                        int var57 = this.field3637[var31];
                                        short var58 = var13[var41];
                                        for (int var59 = var57; var59 < var53; var59++) {
                                            int var60 = this.field3654[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var54;
                                                var18[var60] += var56;
                                                var15[var60] += var58;
                                                var17[var60] += var55;
                                            }
                                        }
                                        if (this.field3662 == null && this.field3696 != null) {
                                            this.field3696.field133 = null;
                                        }
                                        if (this.field3662 != null) {
                                            this.field3662.field133 = null;
                                        }
                                        if (var6.field3662 == null && var6.field3696 != null) {
                                            var6.field3696.field133 = null;
                                        }
                                        if (var6.field3662 != null) {
                                            var6.field3662.field133 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lkr;I)V")
    private final void method1563(class535 arg0, int arg1) {
        if (this.field3650 > this.field3666.field7458.length) {
            this.field3666.field7458 = new int[this.field3650];
            this.field3666.field7456 = new int[this.field3650];
        }
        field3599++;
        int[] var3 = this.field3666.field7458;
        int[] var4 = this.field3666.field7456;
        for (int var5 = 0; var5 < this.field3706; var5++) {
            int var16 = (this.field3687[var5] - (this.field3633[var5] * this.field3666.field7398 >> 8) >> this.field3666.field7311) - arg0.field7833;
            int var17 = (this.field3694[var5] - (this.field3633[var5] * this.field3666.field7349 >> 8) >> this.field3666.field7311) - arg0.field7835;
            int var18 = this.field3637[var5];
            int var19 = this.field3637[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field3654[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        int var6 = 0;
        if (arg1 != -14105) {
            return;
        }
        while (var6 < this.field3652) {
            if (this.field3678 == null || this.field3678[var6] <= 128) {
                short var7 = this.field3693[var6];
                short var8 = this.field3606[var6];
                short var9 = this.field3691[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11))) > 0) {
                    arg0.method3151((byte) 58, var14, var10, var13, var11, var15, var12);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
    private final void method1564(byte arg0) {
        field3623++;
        if (!this.field3605) {
            return;
        }
        this.field3605 = false;
        if (this.field3692 == null && this.field3672 == null && this.field3663 == null) {
            if (this.field3687 != null && !class520.method3079(this.field3646, this.field3620, (byte) 105)) {
                if (this.field3627 != null && this.field3627.field133 == null) {
                    this.field3605 = true;
                } else {
                    if (!this.field3689) {
                        this.method1588((byte) 120);
                    }
                    this.field3687 = null;
                }
            }
            if (this.field3633 != null && !class243.method1531(this.field3620, this.field3646, 109)) {
                if (this.field3627 != null && this.field3627.field133 == null) {
                    this.field3605 = true;
                } else {
                    if (!this.field3689) {
                        this.method1588((byte) 121);
                    }
                    this.field3633 = null;
                }
            }
            if (this.field3694 != null && !class145.method899(this.field3646, 458752, this.field3620)) {
                if (this.field3627 != null && this.field3627.field133 == null) {
                    this.field3605 = true;
                } else {
                    if (!this.field3689) {
                        this.method1588((byte) 119);
                    }
                    this.field3694 = null;
                }
            }
        }
        if (this.field3654 != null && this.field3687 == null && this.field3633 == null && this.field3694 == null) {
            this.field3654 = null;
            this.field3637 = null;
        }
        if (this.field3683 != null && !class178.method1108(this.field3620, this.field3646, (byte) -43)) {
            if (this.field3662 == null) {
                if (this.field3696 != null && this.field3696.field133 == null) {
                    this.field3605 = true;
                } else {
                    this.field3683 = null;
                    this.field3660 = this.field3651 = this.field3698 = null;
                }
            } else if (this.field3662.field133 == null) {
                this.field3605 = true;
            } else {
                this.field3660 = this.field3651 = this.field3698 = null;
                this.field3683 = null;
            }
        }
        if (this.field3625 != null && !class288.method1778(this.field3620, 50, this.field3646)) {
            if (this.field3696 != null && this.field3696.field133 == null) {
                this.field3605 = true;
            } else {
                this.field3625 = null;
            }
        }
        int var2 = 35 % ((60 - arg0) / 51);
        if (this.field3678 != null && !class403.method2318(this.field3620, this.field3646, -167852368)) {
            if (this.field3696 != null && this.field3696.field133 == null) {
                this.field3605 = true;
            } else {
                this.field3678 = null;
            }
        }
        if (this.field3613 != null && !class78.method598(this.field3646, this.field3620, 1)) {
            if (this.field3697 != null && this.field3697.field133 == null) {
                this.field3605 = true;
            } else {
                this.field3613 = this.field3684 = null;
            }
        }
        if (this.field3608 != null && !class504.method3006(122, this.field3620, this.field3646)) {
            if (this.field3696 != null && this.field3696.field133 == null) {
                this.field3605 = true;
            } else {
                this.field3608 = null;
            }
        }
        if (this.field3693 != null && !class301.method1838(this.field3646, this.field3620, 0)) {
            if ((this.field3638 == null || this.field3638.field5296 != null) && (this.field3696 == null || this.field3696.field133 != null)) {
                this.field3693 = this.field3606 = this.field3691 = null;
            } else {
                this.field3605 = true;
            }
        }
        if (this.field3645 != null && !class275.method1726(this.field3620, 0, this.field3646)) {
            this.field3680 = null;
            this.field3645 = null;
        }
        if (this.field3686 != null && !class290.method1798(this.field3620, -15605, this.field3646)) {
            this.field3686 = null;
            this.field3667 = null;
        }
        if (this.field3702 != null && !class312.method1888(this.field3646, 0, this.field3620)) {
            this.field3702 = null;
        }
        if (this.field3648 != null && (this.field3620 & 0x800) == 0 && (this.field3620 & 0x40000) == 0) {
            this.field3648 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)V")
    public static final void method1565(int arg0, int arg1, boolean arg2) {
        field3603++;
        if ((class245.field3556 < class245.field3555)) {
            class245.field3556 = (float) ((double) class245.field3556 / 30.0D + (double) class245.field3556);
            if (class245.field3555 < class245.field3556) {
                class245.field3556 = class245.field3555;
            }
            class516.method3066(100);
            class245.field3563 = (int) class245.field3556 >> 1;
            class245.field3557 = class322.method1940(class245.field3563, (byte) 93);
        } else if (class245.field3555 < class245.field3556) {
            class245.field3556 = (float) ((double) class245.field3556 - (double) class245.field3556 / 30.0D);
            if (class245.field3556 < class245.field3555) {
                class245.field3556 = class245.field3555;
            }
            class516.method3066(124);
            class245.field3563 = (int) class245.field3556 >> 1;
            class245.field3557 = class322.method1940(class245.field3563, (byte) 91);
        }
        if (arg2) {
            method1572(null, -60, 72, null, (byte) -96);
        }
        if (class97.field1278 != -1 && class409.field5787 != -1) {
            int var3 = class97.field1278 - class307.field4455;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class409.field5787 - class421.field5935;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class307.field4455 += var3;
            class421.field5935 += var4;
            if (var3 == 0 && var4 == 0) {
                class409.field5787 = -1;
                class97.field1278 = -1;
            }
            class516.method3066(108);
        }
        if (class367.field5246 <= 0) {
            class163.field2416 = -1;
            class205.field2969 = -1;
        } else {
            class515.field7594--;
            if (class515.field7594 == 0) {
                class515.field7594 = 100;
                class367.field5246--;
            }
        }
        if (!class30.field359 || class382.field5382 == null) {
            return;
        }
        for (class369 var5 = (class369) class382.field5382.method2655(15152); var5 != null; var5 = (class369) class382.field5382.method2660((byte) 67)) {
            class156 var6 = class245.field3553.method1316((byte) -68, var5.field5260.field3126);
            if (var5.method2175(arg0, arg1, Integer.MAX_VALUE)) {
                if (var6.field2319 != null) {
                    if (var6.field2319[4] != null) {
                        class509.method3042((long) var5.field5260.field3126, var6.field2319[4], 6, var6.field2312, var6.field2332, -1, false, 0, 1007, true, -1);
                    }
                    if (var6.field2319[3] != null) {
                        class509.method3042((long) var5.field5260.field3126, var6.field2319[3], 6, var6.field2312, var6.field2332, -1, false, 0, 1011, true, -1);
                    }
                    if (var6.field2319[2] != null) {
                        class509.method3042((long) var5.field5260.field3126, var6.field2319[2], 6, var6.field2312, var6.field2332, -1, false, 0, 1012, true, -1);
                    }
                    if (var6.field2319[1] != null) {
                        class509.method3042((long) var5.field5260.field3126, var6.field2319[1], 6, var6.field2312, var6.field2332, -1, false, 0, 1003, true, -1);
                    }
                    if (var6.field2319[0] != null) {
                        class509.method3042((long) var5.field5260.field3126, var6.field2319[0], 6, var6.field2312, var6.field2332, -1, false, 0, 1008, true, -1);
                    }
                }
                if (!var5.field5260.field3129) {
                    var5.field5260.field3129 = true;
                    class495.method2873(class436.field6120, var5.field5260.field3126, var6.field2332);
                }
                if (var5.field5260.field3129) {
                    class495.method2873(class269.field3923, var5.field5260.field3126, var6.field2332);
                }
            } else if (var5.field5260.field3129) {
                var5.field5260.field3129 = false;
                class495.method2873(class236.field3439, var5.field5260.field3126, var6.field2332);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lc;Lwp;I)V")
    public final void method1566(class125 arg0, class122 arg1, int arg2) {
        field3601++;
        if (this.field3650 == 0) {
            return;
        }
        class275 var4 = this.field3666.field7360;
        class275 var5 = (class275) arg0;
        if (!this.field3689) {
            this.method1588((byte) 127);
        }
        this.method1601(-36, var5);
        class471.field6569 = var4.field4069 * var5.field4091 + var4.field4079 * var5.field4059 + var4.field4061 * var5.field4077 + var4.field4091;
        class177.field2541 = var4.field4069 * var5.field4061 + var4.field4079 * var5.field4068 + var4.field4061 * var5.field4078;
        float var6 = (float) this.field3643 * class177.field2541 + class471.field6569;
        float var7 = (float) this.field3647 * class177.field2541 + class471.field6569;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var8 = (float) this.field3688 + var6;
            var9 = (float) (-this.field3688) + var7;
        } else {
            var8 = (float) this.field3688 + var7;
            var9 = (float) (-this.field3688) + var6;
        }
        if ((this.field3666.field7353 <= var9) || ((float) this.field3666.field7434 >= var8)) {
            return;
        }
        class529.field7758 = var4.field4084 * var5.field4091 + var4.field4068 * var5.field4077 + var4.field4062 * var5.field4059 + var4.field4059;
        class226.field3257 = var4.field4084 * var5.field4061 + var4.field4068 * var5.field4078 + var4.field4062 * var5.field4068;
        float var10 = (float) this.field3643 * class226.field3257 + class529.field7758;
        float var11 = (float) this.field3647 * class226.field3257 + class529.field7758;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = (var11 - (float) this.field3688) * (float) this.field3666.field7410;
            var13 = ((float) this.field3688 + var10) * (float) this.field3666.field7410;
        } else {
            var13 = ((float) this.field3688 + var11) * (float) this.field3666.field7410;
            var12 = ((float) (-this.field3688) + var10) * (float) this.field3666.field7410;
        }
        if ((this.field3666.field7377 <= var12 / var8) || (this.field3666.field7356 >= var13 / var8)) {
            return;
        }
        class133.field1749 = var4.field4088 * var5.field4061 + var4.field4082 * var5.field4068 + var4.field4078 * var5.field4078;
        class523.field7695 = var4.field4088 * var5.field4091 + var4.field4082 * var5.field4059 + var4.field4078 * var5.field4077 + var4.field4077;
        float var14 = (float) this.field3643 * class133.field1749 + class523.field7695;
        float var15 = (float) this.field3647 * class133.field1749 + class523.field7695;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = ((float) this.field3688 + var14) * (float) this.field3666.field7400;
            var17 = (var15 - (float) this.field3688) * (float) this.field3666.field7400;
        } else {
            var16 = ((float) this.field3688 + var15) * (float) this.field3666.field7400;
            var17 = (var14 - (float) this.field3688) * (float) this.field3666.field7400;
        }
        if ((this.field3666.field7367 <= var17 / var8) || (this.field3666.field7399 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field3663 != null) {
            class471.field6572 = var4.field4084 * var5.field4079 + var4.field4068 * var5.field4082 + var4.field4062 * var5.field4062;
            class493.field6969 = var4.field4084 * var5.field4069 + var4.field4068 * var5.field4088 + var4.field4062 * var5.field4084;
            class12.field161 = var4.field4069 * var5.field4069 + var4.field4079 * var5.field4084 + var4.field4061 * var5.field4088;
            class47.field543 = var4.field4088 * var5.field4069 + var4.field4082 * var5.field4084 + var4.field4078 * var5.field4088;
            class435.field6117 = var4.field4088 * var5.field4079 + var4.field4082 * var5.field4062 + var4.field4078 * var5.field4082;
            class497.field7042 = var4.field4069 * var5.field4079 + var4.field4079 * var5.field4062 + var4.field4061 * var5.field4082;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3695 + this.field3644 >> 1;
            int var21 = this.field3622 + this.field3610 >> 1;
            int var22 = (int) ((float) var21 * class493.field6969 + (float) this.field3643 * class226.field3257 + (float) var20 * class471.field6572 + class529.field7758);
            int var23 = (int) ((float) var21 * class47.field543 + (float) this.field3643 * class133.field1749 + (float) var20 * class435.field6117 + class523.field7695);
            int var24 = (int) ((float) var21 * class12.field161 + (float) this.field3643 * class177.field2541 + (float) var20 * class497.field7042 + class471.field6569);
            if (this.field3666.field7434 > var24) {
                var18 = true;
            } else {
                arg1.field1675 = this.field3666.field7410 * var22 / var24 + this.field3666.field7396;
                arg1.field1671 = this.field3666.field7359 + (this.field3666.field7400 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class493.field6969 + (float) this.field3647 * class226.field3257 + (float) var20 * class471.field6572 + class529.field7758);
            int var26 = (int) ((float) var21 * class47.field543 + (float) this.field3647 * class133.field1749 + (float) var20 * class435.field6117 + class523.field7695);
            int var27 = (int) ((float) var21 * class12.field161 + (float) this.field3647 * class177.field2541 + (float) var20 * class497.field7042 + class471.field6569);
            if (var27 < this.field3666.field7434) {
                var18 = true;
            } else {
                arg1.field1674 = this.field3666.field7400 * var26 / var27 + this.field3666.field7359;
                arg1.field1673 = this.field3666.field7410 * var25 / var27 + this.field3666.field7396;
            }
            if (var18) {
                if (this.field3666.field7434 > var24 && this.field3666.field7434 > var27) {
                    var19 = false;
                } else if (var24 < this.field3666.field7434) {
                    int var28 = (var27 - this.field3666.field7434 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field1675 = this.field3666.field7410 * var29 / this.field3666.field7434 + this.field3666.field7396;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1671 = this.field3666.field7400 * var30 / this.field3666.field7434 + this.field3666.field7359;
                } else if (this.field3666.field7434 > var27) {
                    int var31 = (var24 - this.field3666.field7434 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field1675 = this.field3666.field7410 * var32 / this.field3666.field7434 + this.field3666.field7396;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field1671 = this.field3666.field7400 * var33 / this.field3666.field7434 + this.field3666.field7359;
                }
            }
            if (var19) {
                arg1.field1672 = true;
                if (var27 >= var24) {
                    arg1.field1676 = (this.field3688 + var25) * this.field3666.field7410 / var27 + this.field3666.field7396 - arg1.field1673;
                } else {
                    arg1.field1676 = (this.field3688 + var22) * this.field3666.field7410 / var24 + this.field3666.field7396 - arg1.field1675;
                }
            }
        }
        this.field3666.method2986(-15);
        this.field3666.method2953(var5, (byte) 119);
        this.method1569((byte) 81);
        this.field3666.method2938(0);
        this.method1602(105);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(ZI)V")
    private final void method1567(boolean arg0, int arg1) {
        field3673++;
        boolean var3 = this.field3696 != null && this.field3696.field133 == null;
        boolean var4 = this.field3662 != null && this.field3662.field133 == null;
        boolean var5 = this.field3627 != null && this.field3627.field133 == null;
        boolean var6 = this.field3697 != null && this.field3697.field133 == null;
        if (arg0) {
            var5 &= (this.field3656 & 0x1) != 0;
            var6 &= (this.field3656 & 0x8) != 0;
            var3 &= (this.field3656 & 0x2) != 0;
            var4 &= (this.field3656 & 0x4) != 0;
        }
        if (arg1 != -22947) {
            return;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field3666.field7451.field5663.length >= this.field3650 * var7) {
            this.field3666.field7451.field5665 = 0;
        } else {
            this.field3666.field7451 = new class141((this.field3650 + 100) * var7);
        }
        class141 var12 = this.field3666.field7451;
        if (var5) {
            if (this.field3666.field7340) {
                for (int var13 = 0; var13 < this.field3706; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field3687[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field3633[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field3694[var13]);
                    int var17 = this.field3637[var13];
                    int var18 = this.field3637[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3654[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5665 = var7 * var20;
                        var12.method2354(var14, false);
                        var12.method2354(var15, false);
                        var12.method2354(var16, false);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3706; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field3687[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field3633[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field3694[var21]);
                    int var25 = this.field3637[var21];
                    int var26 = this.field3637[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3654[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5665 = var7 * var28;
                        var12.method2355(arg1 - 336329645, var22);
                        var12.method2355(-336352592, var23);
                        var12.method2355(-336352592, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3662 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field3661 == null) {
                    var31 = this.field3683;
                    var32 = this.field3651;
                    var33 = this.field3660;
                    var34 = this.field3698;
                } else {
                    var33 = this.field3661.field4742;
                    var32 = this.field3661.field4745;
                    var34 = this.field3661.field4741;
                    var31 = this.field3661.field4743;
                }
                float var35 = this.field3666.field7374[0];
                float var36 = this.field3666.field7374[1];
                float var37 = this.field3666.field7374[2];
                float var38 = this.field3666.field7344;
                float var39 = this.field3666.field7448 * 768.0F / (float) this.field3600;
                float var40 = this.field3666.field7414 * 768.0F / (float) this.field3600;
                for (int var41 = 0; var41 < this.field3635; var41++) {
                    int var42 = this.method1577(this.field3596, 0, this.field3608[var41], this.field3678[var41], this.field3625[var41]);
                    float var43 = (float) (var42 >>> 24) * this.field3666.field7437;
                    short var44 = this.field3693[var41];
                    float var45 = (float) (var42 >> 16 & 0xFF) * this.field3666.field7415;
                    float var46 = (float) ((var42 & 0xFF20) >> 8) * this.field3666.field7341;
                    short var47 = (short) var31[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var44] * var37 + (float) var32[var44] * var36 + (float) var33[var44] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var44] * var37 + (float) var32[var44] * var36 + (float) var33[var44] * var35) / (float) (var47 * 256);
                    }
                    float var49 = (var48 < 0.0F ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var43 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var45 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    int var52 = (int) (var46 * var49);
                    var12.field5665 = var7 * var44 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method2376((byte) 122, var50);
                    var12.method2376((byte) 122, var51);
                    var12.method2376((byte) 122, var52);
                    var12.method2376((byte) 122, 255 - (this.field3678[var41] & 0xFF));
                    short var53 = this.field3606[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var32[var53] * var36 + (float) var33[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var32[var53] * var36 + (float) var33[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = ((var55 < 0.0F) ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var43 * var56);
                    int var58 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var46 * var56);
                    var12.field5665 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2376((byte) 122, var57);
                    var12.method2376((byte) 122, var58);
                    var12.method2376((byte) 122, var59);
                    var12.method2376((byte) 122, 255 - (this.field3678[var41] & 0xFF));
                    short var60 = this.field3691[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var32[var60] * var36 + (float) var33[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var32[var60] * var36 + (float) var33[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                    int var64 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var45 * var63);
                    int var66 = (int) (var46 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field5665 = var7 * var60 + var9;
                    var12.method2376((byte) 122, var64);
                    var12.method2376((byte) 122, var65);
                    var12.method2376((byte) 122, var66);
                    var12.method2376((byte) 122, 255 - (this.field3678[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field3635; var29++) {
                    int var30 = this.method1577(this.field3596, 0, this.field3608[var29], this.field3678[var29], this.field3625[var29]);
                    var12.field5665 = var9 + (this.field3693[var29] * var7);
                    var12.method2354(var30, false);
                    var12.field5665 = this.field3606[var29] * var7 + var9;
                    var12.method2354(var30, false);
                    var12.field5665 = this.field3691[var29] * var7 + var9;
                    var12.method2354(var30, false);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field3661 == null) {
                var67 = this.field3683;
                var69 = this.field3660;
                var68 = this.field3651;
                var70 = this.field3698;
            } else {
                var67 = this.field3661.field4743;
                var68 = this.field3661.field4745;
                var69 = this.field3661.field4742;
                var70 = this.field3661.field4741;
            }
            float var71 = 3.0F / (float) this.field3600;
            var12.field5665 = var10;
            float var72 = 3.0F / (float) (this.field3600 / 2 + this.field3600);
            if (this.field3666.field7340) {
                for (int var76 = 0; var76 < this.field3650; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method886(arg1 ^ 0xFFFFA65D, (float) var69[var76] * var72);
                        var12.method886(0, (float) var68[var76] * var72);
                        var12.method886(arg1 + 22947, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method886(0, (float) var69[var76] * var78);
                        var12.method886(0, (float) var68[var76] * var78);
                        var12.method886(0, (float) var70[var76] * var78);
                    }
                    var12.field5665 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3650; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method882(-1491643256, (float) var69[var73] * var72);
                        var12.method882(-1491643256, (float) var68[var73] * var72);
                        var12.method882(-1491643256, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method882(-1491643256, (float) var69[var73] * var75);
                        var12.method882(-1491643256, (float) var68[var73] * var75);
                        var12.method882(-1491643256, (float) var70[var73] * var75);
                    }
                    var12.field5665 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5665 = var11;
            if (this.field3666.field7340) {
                for (int var79 = 0; var79 < this.field3650; var79++) {
                    var12.method886(0, this.field3613[var79]);
                    var12.method886(arg1 ^ 0xFFFFA65D, this.field3684[var79]);
                    var12.field5665 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field3650; var80++) {
                    var12.method882(-1491643256, this.field3613[var80]);
                    var12.method882(-1491643256, this.field3684[var80]);
                    var12.field5665 += var7 - 8;
                }
            }
        }
        var12.field5665 = this.field3650 * var7;
        class157 var81;
        if (arg0) {
            if (this.field3685 == null) {
                this.field3685 = this.field3666.method2923(var7, true, 0, var12.field5665, var12.field5663);
            } else {
                this.field3685.method466(var7, var12.field5665, var12.field5663, arg1 - 3043);
            }
            this.field3656 = 0;
            var81 = this.field3685;
        } else {
            var81 = this.field3666.method2923(var7, false, 0, var12.field5665, var12.field5663);
            this.field3605 = true;
        }
        if (var5) {
            this.field3627.field133 = var81;
            this.field3627.field137 = var8;
        }
        if (var6) {
            this.field3697.field133 = var81;
            this.field3697.field137 = var11;
        }
        if (var3) {
            this.field3696.field137 = var9;
            this.field3696.field133 = var81;
        }
        if (var4) {
            this.field3662.field133 = var81;
            this.field3662.field137 = var10;
        }
    }

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "()I")
    public final int method1568() {
        field3703++;
        if (!this.field3689) {
            this.method1588((byte) 126);
        }
        return this.field3643;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
    private final void method1569(byte arg0) {
        field3699++;
        if (this.field3652 == 0) {
            return;
        }
        if (this.field3656 != 0) {
            this.method1567(true, -22947);
        }
        this.method1567(false, -22947);
        if (this.field3638 != null) {
            if (this.field3638.field5296 == null) {
                this.method1608(arg0 ^ 0xFFFFFFD9, (this.field3656 & 0x10) != 0);
            }
            if (this.field3638.field5296 != null) {
                this.field3666.method2962(1, this.field3662 != null);
                this.field3666.method2939(this.field3697, this.field3662, 16063, this.field3696, this.field3627);
                int var2 = this.field3648.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3648[var3];
                    int var5 = this.field3648[var3 + 1];
                    int var6 = this.field3608[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3666.method2924(var6, this.field3662 != null, (byte) -104);
                    this.field3666.method2998(var4 * 3, 4, this.field3638.field5296, 76, (var5 - var4) * 3);
                }
            }
        }
        this.method1564((byte) 116);
        if (arg0 != 81) {
            this.field3680 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "(SS)V")
    public final void method1570(short arg0, short arg1) {
        field3624++;
        for (int var3 = 0; var3 < this.field3635; var3++) {
            if (this.field3625[var3] == arg0) {
                this.field3625[var3] = arg1;
            }
        }
        if (this.field3663 != null) {
            for (int var4 = 0; var4 < this.field3669; var4++) {
                class126 var5 = this.field3663[var4];
                class421 var6 = this.field3639[var4];
                var6.field5936 = class391.field5502[this.field3625[var5.field1696] & 0xFFFF] & 0xFFFFFF | var6.field5936 & 0xFF000000;
            }
        }
        if (this.field3696 != null) {
            this.field3696.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1571(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            field3710 = null;
        }
        field3631++;
        int var8 = arg6 + arg0;
        int var9 = arg4 - arg0;
        for (int var10 = arg6; var10 < var8; var10++) {
            class447.method2605(-7, arg1, arg3, arg5, class112.field1523[var10]);
        }
        for (int var11 = arg4; var11 > var9; var11--) {
            class447.method2605(-7, arg1, arg3, arg5, class112.field1523[var11]);
        }
        int var12 = arg5 - arg0;
        int var13 = arg0 + arg1;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class112.field1523[var14];
            class447.method2605(-7, arg1, arg3, var13, var15);
            class447.method2605(-7, var13, arg7, var12, var15);
            class447.method2605(-7, var12, arg3, arg5, var15);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([III[IB)V")
    public static final void method1572(int[] arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        field3630++;
        if (arg4 != -79) {
            method1603(13);
        }
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if ((var10 & var9) + var7 > arg0[var10]) {
                int var11 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6] = var11;
                int var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method1572(arg0, arg1, var6 - 1, arg3, (byte) -79);
        method1572(arg0, var6 + 1, arg2, arg3, (byte) -79);
    }

    @OriginalMember(owner = "client!rr", name = "pa", descriptor = "()I")
    public final int method1573() {
        field3636++;
        return this.field3600;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIIIIIIII)Z")
    private final boolean method1574(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3681++;
        if (arg3 < arg5 && arg1 > arg3 && arg6 > arg3) {
            return false;
        }
        if (arg0 != -34) {
            this.method1569((byte) 105);
        }
        if (arg3 > arg5 && arg3 > arg1 && arg6 < arg3) {
            return false;
        } else if (arg4 < arg7 && arg4 < arg8 && arg2 > arg4) {
            return false;
        } else {
            return arg4 <= arg7 || arg8 >= arg4 || arg4 <= arg2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lrr;ILrr;BZZ)Le;")
    private final class377 method1575(class247 arg0, int arg1, class247 arg2, byte arg3, boolean arg4, boolean arg5) {
        arg2.field3665 = this.field3665;
        arg2.field3600 = this.field3600;
        arg2.field3652 = this.field3652;
        arg2.field3669 = this.field3669;
        arg2.field3635 = this.field3635;
        arg2.field3620 = arg1;
        arg2.field3596 = this.field3596;
        arg2.field3656 = 0;
        arg2.field3706 = this.field3706;
        arg2.field3650 = this.field3650;
        arg2.field3646 = this.field3646;
        field3668++;
        boolean var7 = class476.method2743(this.field3646, (byte) 90, arg1);
        boolean var8 = class220.method1364(arg1, (byte) -3, this.field3646);
        boolean var9 = class426.method2524(arg1, 96, this.field3646);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field3687 = this.field3687;
            } else if (arg0.field3687 == null || arg0.field3687.length < this.field3665) {
                arg2.field3687 = arg0.field3687 = new int[this.field3665];
            } else {
                arg2.field3687 = arg0.field3687;
            }
            if (!var8) {
                arg2.field3633 = this.field3633;
            } else if (arg0.field3633 == null || arg0.field3633.length < this.field3665) {
                arg2.field3633 = arg0.field3633 = new int[this.field3665];
            } else {
                arg2.field3633 = arg0.field3633;
            }
            if (!var9) {
                arg2.field3694 = this.field3694;
            } else if (arg0.field3694 == null || arg0.field3694.length < this.field3665) {
                arg2.field3694 = arg0.field3694 = new int[this.field3665];
            } else {
                arg2.field3694 = arg0.field3694;
            }
            for (int var11 = 0; var11 < this.field3665; var11++) {
                if (var7) {
                    arg2.field3687[var11] = this.field3687[var11];
                }
                if (var8) {
                    arg2.field3633[var11] = this.field3633[var11];
                }
                if (var9) {
                    arg2.field3694[var11] = this.field3694[var11];
                }
            }
        } else {
            arg2.field3694 = this.field3694;
            arg2.field3687 = this.field3687;
            arg2.field3633 = this.field3633;
        }
        if (class508.method3031(this.field3646, arg1, (byte) -2)) {
            arg2.field3627 = arg0.field3627;
            if (arg4) {
                arg2.field3656 = (byte) (arg2.field3656 | 0x1);
            }
            arg2.field3627.field137 = this.field3627.field137;
            arg2.field3627.field133 = this.field3627.field133;
        } else if (class342.method2037(arg3 + 2170, this.field3646, arg1)) {
            arg2.field3627 = this.field3627;
        } else {
            arg2.field3627 = null;
        }
        if (class57.method474((byte) 29, arg1, this.field3646)) {
            if (arg0.field3625 == null || arg0.field3625.length < this.field3635) {
                arg2.field3625 = arg0.field3625 = new short[this.field3635];
            } else {
                arg2.field3625 = arg0.field3625;
            }
            for (int var12 = 0; var12 < this.field3635; var12++) {
                arg2.field3625[var12] = this.field3625[var12];
            }
        } else {
            arg2.field3625 = this.field3625;
        }
        if (class377.method2198(this.field3646, 62, arg1)) {
            if (arg0.field3678 == null || this.field3635 > arg0.field3678.length) {
                arg2.field3678 = arg0.field3678 = new byte[this.field3635];
            } else {
                arg2.field3678 = arg0.field3678;
            }
            for (int var13 = 0; var13 < this.field3635; var13++) {
                arg2.field3678[var13] = this.field3678[var13];
            }
        } else {
            arg2.field3678 = this.field3678;
        }
        if (class414.method2453(this.field3646, arg1, -123)) {
            arg2.field3696 = arg0.field3696;
            if (arg4) {
                arg2.field3656 = (byte) (arg2.field3656 | 0x2);
            }
            arg2.field3696.field137 = this.field3696.field137;
            arg2.field3696.field133 = this.field3696.field133;
        } else if (class73.method544((byte) 84, this.field3646, arg1)) {
            arg2.field3696 = this.field3696;
        } else {
            arg2.field3696 = null;
        }
        if (class82.method608(this.field3646, arg1, arg3 + 76)) {
            if (arg0.field3660 == null || arg0.field3660.length < this.field3650) {
                int var14 = this.field3650;
                arg2.field3651 = arg0.field3651 = new short[var14];
                arg2.field3660 = arg0.field3660 = new short[var14];
                arg2.field3698 = arg0.field3698 = new short[var14];
            } else {
                arg2.field3651 = arg0.field3651;
                arg2.field3660 = arg0.field3660;
                arg2.field3698 = arg0.field3698;
            }
            if (this.field3661 == null) {
                for (int var15 = 0; var15 < this.field3650; var15++) {
                    arg2.field3660[var15] = this.field3660[var15];
                    arg2.field3651[var15] = this.field3651[var15];
                    arg2.field3698[var15] = this.field3698[var15];
                }
            } else {
                if (arg0.field3661 == null) {
                    arg0.field3661 = new class325();
                }
                class325 var16 = arg2.field3661 = arg0.field3661;
                if (var16.field4742 == null || this.field3650 > var16.field4742.length) {
                    int var17 = this.field3650;
                    var16.field4741 = new short[var17];
                    var16.field4745 = new short[var17];
                    var16.field4742 = new short[var17];
                    var16.field4743 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field3650; var18++) {
                    arg2.field3660[var18] = this.field3660[var18];
                    arg2.field3651[var18] = this.field3651[var18];
                    arg2.field3698[var18] = this.field3698[var18];
                    var16.field4742[var18] = this.field3661.field4742[var18];
                    var16.field4745[var18] = this.field3661.field4745[var18];
                    var16.field4741[var18] = this.field3661.field4741[var18];
                    var16.field4743[var18] = this.field3661.field4743[var18];
                }
            }
            arg2.field3683 = this.field3683;
        } else {
            arg2.field3660 = this.field3660;
            arg2.field3683 = this.field3683;
            arg2.field3661 = this.field3661;
            arg2.field3651 = this.field3651;
            arg2.field3698 = this.field3698;
        }
        if (class68.method532(arg1, this.field3646, arg3 + 12)) {
            arg2.field3662 = arg0.field3662;
            if (arg4) {
                arg2.field3656 = (byte) (arg2.field3656 | 0x4);
            }
            arg2.field3662.field133 = this.field3662.field133;
            arg2.field3662.field137 = this.field3662.field137;
        } else if (class487.method2807(this.field3646, arg1, -127)) {
            arg2.field3662 = this.field3662;
        } else {
            arg2.field3662 = null;
        }
        if (class375.method2190((byte) 84, arg1, this.field3646)) {
            if (arg0.field3613 == null || this.field3635 > arg0.field3613.length) {
                int var19 = this.field3650;
                arg2.field3684 = arg0.field3684 = new float[var19];
                arg2.field3613 = arg0.field3613 = new float[var19];
            } else {
                arg2.field3684 = arg0.field3684;
                arg2.field3613 = arg0.field3613;
            }
            for (int var20 = 0; var20 < this.field3650; var20++) {
                arg2.field3613[var20] = this.field3613[var20];
                arg2.field3684[var20] = this.field3684[var20];
            }
        } else {
            arg2.field3613 = this.field3613;
            arg2.field3684 = this.field3684;
        }
        if (class279.method1743(8, arg1, this.field3646)) {
            if (arg4) {
                arg2.field3656 = (byte) (arg2.field3656 | 0x8);
            }
            arg2.field3697 = arg0.field3697;
            arg2.field3697.field133 = this.field3697.field133;
            arg2.field3697.field137 = this.field3697.field137;
        } else if (class431.method2551((byte) 20, this.field3646, arg1)) {
            arg2.field3697 = this.field3697;
        } else {
            arg2.field3697 = null;
        }
        if (class290.method1800(this.field3646, arg1, arg3 + 4138)) {
            if (arg0.field3693 == null || this.field3635 > arg0.field3693.length) {
                int var21 = this.field3635;
                arg2.field3606 = arg0.field3606 = new short[var21];
                arg2.field3693 = arg0.field3693 = new short[var21];
                arg2.field3691 = arg0.field3691 = new short[var21];
            } else {
                arg2.field3693 = arg0.field3693;
                arg2.field3691 = arg0.field3691;
                arg2.field3606 = arg0.field3606;
            }
            for (int var22 = 0; var22 < this.field3635; var22++) {
                arg2.field3693[var22] = this.field3693[var22];
                arg2.field3606[var22] = this.field3606[var22];
                arg2.field3691[var22] = this.field3691[var22];
            }
        } else {
            arg2.field3693 = this.field3693;
            arg2.field3691 = this.field3691;
            arg2.field3606 = this.field3606;
        }
        if (class191.method1219((byte) 121, this.field3646, arg1)) {
            if (arg4) {
                arg2.field3656 = (byte) (arg2.field3656 | 0x10);
            }
            arg2.field3638 = arg0.field3638;
            arg2.field3638.field5296 = this.field3638.field5296;
        } else if (class77.method595(0, arg1, this.field3646)) {
            arg2.field3638 = this.field3638;
        } else {
            arg2.field3638 = null;
        }
        if (class519.method3073(this.field3646, arg1, (byte) 125)) {
            if (arg0.field3608 == null || this.field3635 > arg0.field3608.length) {
                int var23 = this.field3635;
                arg2.field3608 = arg0.field3608 = new short[var23];
            } else {
                arg2.field3608 = arg0.field3608;
            }
            for (int var24 = 0; var24 < this.field3635; var24++) {
                arg2.field3608[var24] = this.field3608[var24];
            }
        } else {
            arg2.field3608 = this.field3608;
        }
        if (!class102.method706(false, arg1, this.field3646)) {
            arg2.field3639 = this.field3639;
        } else if (arg0.field3639 == null || this.field3669 > arg0.field3639.length) {
            int var26 = this.field3669;
            arg2.field3639 = arg0.field3639 = new class421[var26];
            for (int var27 = 0; var27 < this.field3669; var27++) {
                arg2.field3639[var27] = this.field3639[var27].method2498(arg3 + 210);
            }
        } else {
            arg2.field3639 = arg0.field3639;
            for (int var25 = 0; var25 < this.field3669; var25++) {
                arg2.field3639[var25].method2499((byte) 40, this.field3639[var25]);
            }
        }
        arg2.field3663 = this.field3663;
        arg2.field3672 = this.field3672;
        arg2.field3692 = this.field3692;
        arg2.field3667 = this.field3667;
        if (this.field3689) {
            arg2.field3644 = this.field3644;
            arg2.field3610 = this.field3610;
            arg2.field3689 = true;
            arg2.field3695 = this.field3695;
            arg2.field3688 = this.field3688;
            arg2.field3643 = this.field3643;
            arg2.field3622 = this.field3622;
            arg2.field3647 = this.field3647;
        } else {
            arg2.field3689 = false;
        }
        if (arg3 != -122) {
            this.method1564((byte) 58);
        }
        arg2.field3637 = this.field3637;
        arg2.field3702 = this.field3702;
        arg2.field3686 = this.field3686;
        arg2.field3645 = this.field3645;
        arg2.field3648 = this.field3648;
        arg2.field3680 = this.field3680;
        arg2.field3654 = this.field3654;
        return arg2;
    }

    @OriginalMember(owner = "client!rr", name = "ta", descriptor = "()I")
    public final int method1576() {
        if (!this.field3689) {
            this.method1588((byte) 124);
        }
        field3670++;
        return this.field3695;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IISBI)I")
    private final int method1577(int arg0, int arg1, short arg2, byte arg3, int arg4) {
        if (arg1 != 0) {
            return -82;
        }
        field3621++;
        int var6 = class391.field5502[class126.method833(arg0, -125, arg4)];
        if (arg2 != -1) {
            class222 var7 = this.field3666.field4246.method83(arg2 & 0xFFFF, 109);
            int var8 = var7.field3201 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field3191 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF00C4) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3) {
        field3616++;
        for (int var5 = 0; var5 < this.field3635; var5++) {
            int var9 = this.field3625[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD37) >> 10;
            int var11 = (var9 & 0x3F6) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3625[var5] = (short) class170.method1067(var12, class170.method1067(var11 << 7, var10 << 10));
        }
        if (this.field3663 != null) {
            for (int var6 = 0; var6 < this.field3669; var6++) {
                class126 var7 = this.field3663[var6];
                class421 var8 = this.field3639[var6];
                var8.field5936 = var8.field5936 & 0xFF000000 | class391.field5502[this.field3625[var7.field1696] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3696 != null) {
            this.field3696.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()[Lsd;")
    public final class63[] method1579() {
        field3711++;
        return this.field3672;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)V")
    public final void method1580(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3706; var4++) {
            if (arg0 != 0) {
                this.field3687[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3633[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3694[var4] += arg2;
            }
        }
        field3649++;
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "X", descriptor = "(I)V")
    public final void method1581(int arg0) {
        this.field3596 = (short) arg0;
        field3657++;
        if (this.field3696 != null) {
            this.field3696.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "(SS)V")
    public final void method1582(short arg0, short arg1) {
        field3664++;
        class16 var3 = this.field3666.field4246;
        for (int var4 = 0; var4 < this.field3635; var4++) {
            if (this.field3608[var4] == arg0) {
                this.field3608[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class222 var7 = var3.method83(arg0 & 0xFFFF, 52);
            var6 = var7.field3191;
            var5 = var7.field3201;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class222 var10 = var3.method83(arg1 & 0xFFFF, 58);
            var8 = var10.field3201;
            var9 = var10.field3191;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3663 != null) {
            for (int var11 = 0; var11 < this.field3669; var11++) {
                class126 var12 = this.field3663[var11];
                class421 var13 = this.field3639[var11];
                var13.field5936 = var13.field5936 & 0xFF000000 | class391.field5502[this.field3625[var12.field1696] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3696 != null) {
            this.field3696.field133 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "()I")
    public final int method1583() {
        field3617++;
        if (!this.field3689) {
            this.method1588((byte) 118);
        }
        return this.field3688;
    }

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "()I")
    public final int method1584() {
        if (!this.field3689) {
            this.method1588((byte) 119);
        }
        field3679++;
        return this.field3647;
    }

    @OriginalMember(owner = "client!rr", name = "Y", descriptor = "()I")
    public final int method1585() {
        field3704++;
        return this.field3596;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method1586(int arg0, int arg1, class125 arg2, boolean arg3) {
        field3705++;
        class275 var5 = (class275) arg2;
        class275 var6 = this.field3666.field7360;
        float var7 = var5.field4091 * var6.field4084 + var5.field4077 * var6.field4068 + var5.field4059 * var6.field4062 + var6.field4059;
        float var8 = var5.field4091 * var6.field4088 + var5.field4077 * var6.field4078 + var5.field4059 * var6.field4082 + var6.field4077;
        class471.field6572 = var5.field4079 * var6.field4084 + var5.field4082 * var6.field4068 + var5.field4062 * var6.field4062;
        class497.field7042 = var5.field4079 * var6.field4069 + var5.field4082 * var6.field4061 + var5.field4062 * var6.field4079;
        class226.field3257 = var5.field4061 * var6.field4084 + var5.field4078 * var6.field4068 + var5.field4068 * var6.field4062;
        class177.field2541 = var5.field4061 * var6.field4069 + var5.field4078 * var6.field4061 + var5.field4068 * var6.field4079;
        class493.field6969 = var5.field4069 * var6.field4084 + var5.field4088 * var6.field4068 + var5.field4084 * var6.field4062;
        class133.field1749 = var5.field4061 * var6.field4088 + var5.field4078 * var6.field4078 + var5.field4068 * var6.field4082;
        class47.field543 = var5.field4069 * var6.field4088 + var5.field4088 * var6.field4078 + var5.field4084 * var6.field4082;
        class12.field161 = var5.field4069 * var6.field4069 + var5.field4088 * var6.field4061 + var5.field4084 * var6.field4079;
        class435.field6117 = var5.field4079 * var6.field4088 + var5.field4082 * var6.field4078 + var5.field4062 * var6.field4082;
        float var9 = var5.field4091 * var6.field4069 + var5.field4077 * var6.field4061 + var5.field4059 * var6.field4079 + var6.field4091;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field3666.field7410;
        int var16 = this.field3666.field7400;
        if (!this.field3689) {
            this.method1588((byte) 122);
        }
        class107.field1417[0] = this.field3695;
        class323.field4721[0] = this.field3643;
        class107.field1417[1] = this.field3644;
        class239.field3476[0] = this.field3622;
        class323.field4721[1] = this.field3643;
        class107.field1417[2] = this.field3695;
        class239.field3476[1] = this.field3622;
        class323.field4721[2] = this.field3647;
        class107.field1417[3] = this.field3644;
        class239.field3476[2] = this.field3622;
        class323.field4721[3] = this.field3647;
        class239.field3476[3] = this.field3622;
        class107.field1417[4] = this.field3695;
        class323.field4721[4] = this.field3643;
        class107.field1417[5] = this.field3644;
        class239.field3476[4] = this.field3610;
        class323.field4721[5] = this.field3643;
        class239.field3476[5] = this.field3610;
        class107.field1417[6] = this.field3695;
        class323.field4721[6] = this.field3647;
        class239.field3476[6] = this.field3610;
        class107.field1417[7] = this.field3644;
        class323.field4721[7] = this.field3647;
        class239.field3476[7] = this.field3610;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class323.field4721[var17];
            float var39 = (float) class107.field1417[var17];
            float var40 = (float) class239.field3476[var17];
            float var41 = class12.field161 * var40 + class497.field7042 * var39 + class177.field2541 * var38 + var9;
            float var42 = class47.field543 * var40 + class435.field6117 * var39 + class133.field1749 * var38 + var8;
            float var43 = class493.field6969 * var40 + class471.field6572 * var39 + class226.field3257 * var38 + var7;
            if ((float) this.field3666.field7434 <= var41) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field3666.field7396;
                float var45 = (float) var16 * var42 / var41 + (float) this.field3666.field7359;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var12 < var44) {
                    var12 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field3666.field7458.length < this.field3650) {
                this.field3666.field7456 = new int[this.field3650];
                this.field3666.field7458 = new int[this.field3650];
            }
            int[] var18 = this.field3666.field7458;
            int[] var19 = this.field3666.field7456;
            for (int var20 = 0; var20 < this.field3706; var20++) {
                float var22 = (float) this.field3633[var20];
                float var23 = (float) this.field3694[var20];
                float var24 = (float) this.field3687[var20];
                float var25 = class47.field543 * var23 + class435.field6117 * var24 + class133.field1749 * var22 + var8;
                float var26 = class493.field6969 * var23 + class471.field6572 * var24 + class226.field3257 * var22 + var7;
                float var27 = class12.field161 * var23 + class497.field7042 * var24 + class177.field2541 * var22 + var9;
                if ((var27 >= (float) this.field3666.field7434)) {
                    int var32 = (int) ((float) var15 * var26 / var27 + (float) this.field3666.field7396);
                    int var33 = (int) ((float) var16 * var25 / var27 + (float) this.field3666.field7359);
                    int var34 = this.field3637[var20];
                    int var35 = this.field3637[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3654[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field3637[var20];
                    int var29 = this.field3637[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field3654[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field3654[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3635; var21++) {
                if (var18[this.field3693[var21]] != -999999 && var18[this.field3606[var21]] != -999999 && var18[this.field3691[var21]] != -999999 && this.method1574((byte) -34, var19[this.field3606[var21]], var18[this.field3691[var21]], arg1, arg0, var19[this.field3693[var21]], var19[this.field3691[var21]], var18[this.field3693[var21]], var18[this.field3606[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "()V")
    public final void method1587() {
        field3619++;
        if (this.field3650 <= 0 || this.field3652 <= 0) {
            return;
        }
        this.method1567(false, -22947);
        if ((this.field3656 & 0x10) == 0 && this.field3638.field5296 == null) {
            this.method1608(-92, false);
        }
        this.method1564((byte) -71);
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
    private final void method1588(byte arg0) {
        field3700++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        if (arg0 < 116) {
            return;
        }
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3706; var10++) {
            int var11 = this.field3687[var10];
            int var12 = this.field3633[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field3694[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field3695 = (short) var2;
        this.field3622 = (short) var4;
        this.field3644 = (short) var5;
        this.field3643 = (short) var3;
        this.field3610 = (short) var7;
        this.field3647 = (short) var6;
        this.field3688 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field3689 = true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static final void method1589(int arg0) {
        field3602++;
        for (int var1 = arg0; var1 < class368.field5253.length; var1++) {
            for (int var2 = 0; var2 < class368.field5253[0].length; var2++) {
                for (int var3 = 0; var3 < class368.field5253[0][0].length; var3++) {
                    class368.field5253[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIZ)Le;")
    public final class377 method1590(byte arg0, int arg1, boolean arg2) {
        field3675++;
        class247 var4;
        class247 var5;
        if (arg0 == 1) {
            var4 = this.field3666.field7397;
            var5 = this.field3666.field7422;
        } else if (arg0 == 2) {
            var4 = this.field3666.field7452;
            var5 = this.field3666.field7431;
        } else if (arg0 == 3) {
            var5 = this.field3666.field7418;
            var4 = this.field3666.field7447;
        } else if (arg0 == 4) {
            var4 = this.field3666.field7406;
            var5 = this.field3666.field7362;
        } else if (arg0 == 5) {
            var4 = this.field3666.field7425;
            var5 = this.field3666.field7335;
        } else {
            var5 = var4 = new class247(this.field3666);
        }
        return this.method1575(var4, arg1, var5, (byte) -122, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "za", descriptor = "(IIII)V")
    public final void method1591(int arg0, int arg1, int arg2, int arg3) {
        field3607++;
        if (arg0 == 0) {
            class74.field905 = 0;
            int var5 = 0;
            class19.field226 = 0;
            class443.field6220 = 0;
            for (int var6 = 0; var6 < this.field3706; var6++) {
                class74.field905 += this.field3687[var6];
                class19.field226 += this.field3633[var6];
                class443.field6220 += this.field3694[var6];
                var5++;
            }
            if (var5 <= 0) {
                class19.field226 = arg2;
                class74.field905 = arg1;
                class443.field6220 = arg3;
            } else {
                class74.field905 = class74.field905 / var5 + arg1;
                class443.field6220 = class443.field6220 / var5 + arg3;
                class19.field226 = class19.field226 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3706; var7++) {
                this.field3687[var7] += arg1;
                this.field3633[var7] += arg2;
                this.field3694[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3706; var8++) {
                this.field3687[var8] -= class74.field905;
                this.field3633[var8] -= class19.field226;
                this.field3694[var8] -= class443.field6220;
                if (arg3 != 0) {
                    int var9 = class95.field1242[arg3];
                    int var10 = class95.field1241[arg3];
                    int var11 = this.field3633[var8] * var9 + (this.field3687[var8] * var10) + 32767 >> 15;
                    this.field3633[var8] = this.field3633[var8] * var10 + 32767 - this.field3687[var8] * var9 >> 15;
                    this.field3687[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class95.field1242[arg1];
                    int var13 = class95.field1241[arg1];
                    int var14 = this.field3633[var8] * var13 + 32767 - (this.field3694[var8] * var12) >> 15;
                    this.field3694[var8] = this.field3694[var8] * var13 + this.field3633[var8] * var12 + 32767 >> 15;
                    this.field3633[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class95.field1242[arg2];
                    int var16 = class95.field1241[arg2];
                    int var17 = this.field3694[var8] * var15 + this.field3687[var8] * var16 + 32767 >> 15;
                    this.field3694[var8] = this.field3694[var8] * var16 + 32767 - this.field3687[var8] * var15 >> 15;
                    this.field3687[var8] = var17;
                }
                this.field3687[var8] += class74.field905;
                this.field3633[var8] += class19.field226;
                this.field3694[var8] += class443.field6220;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3706; var18++) {
                this.field3687[var18] -= class74.field905;
                this.field3633[var18] -= class19.field226;
                this.field3694[var18] -= class443.field6220;
                this.field3687[var18] = this.field3687[var18] * arg1 / 128;
                this.field3633[var18] = this.field3633[var18] * arg2 / 128;
                this.field3694[var18] = this.field3694[var18] * arg3 / 128;
                this.field3687[var18] += class74.field905;
                this.field3633[var18] += class19.field226;
                this.field3694[var18] += class443.field6220;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3635; var19++) {
                int var23 = (this.field3678[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3678[var19] = (byte) var23;
            }
            if (this.field3696 != null) {
                this.field3696.field133 = null;
            }
            if (this.field3663 != null) {
                for (int var20 = 0; var20 < this.field3669; var20++) {
                    class126 var21 = this.field3663[var20];
                    class421 var22 = this.field3639[var20];
                    var22.field5936 = 255 - (this.field3678[var21.field1696] & 0xFF) << 24 | var22.field5936 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3635; var24++) {
                int var28 = this.field3625[var24] & 0xFFFF;
                int var29 = (var28 & 0xFFD1) >> 10;
                int var30 = (var28 & 0x3A4) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var32;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3625[var24] = (short) class170.method1067(class170.method1067(var33 << 7, var31 << 10), var34);
            }
            if (this.field3696 != null) {
                this.field3696.field133 = null;
            }
            if (this.field3663 != null) {
                for (int var25 = 0; var25 < this.field3669; var25++) {
                    class126 var26 = this.field3663[var25];
                    class421 var27 = this.field3639[var25];
                    var27.field5936 = class391.field5502[this.field3625[var26.field1696] & 0xFFFF] & 0xFFFFFF | var27.field5936 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3669; var35++) {
                class421 var36 = this.field3639[var35];
                var36.field5930 += arg1;
                var36.field5937 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3669; var37++) {
                class421 var38 = this.field3639[var37];
                var38.field5939 = var38.field5939 * arg2 >> 7;
                var38.field5932 = var38.field5932 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3669; var39++) {
                class421 var40 = this.field3639[var39];
                var40.field5934 = var40.field5934 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method1592(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6) {
        field3690++;
        if (!this.field3689) {
            this.method1588((byte) 127);
        }
        int var8 = arg4 + this.field3695;
        int var9 = this.field3644 + arg4;
        int var10 = this.field3622 + arg6;
        int var11 = this.field3610 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field416 + var9 >> arg2.field414 >= arg2.field411 || var10 < 0 || arg2.field413 <= arg2.field416 + var11 >> arg2.field414) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field411 <= arg3.field416 + var9 >> arg3.field414 || var10 < 0 || (var11 + arg3.field416 >> arg3.field414) >= arg3.field413) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field414;
            int var13 = arg2.field416 + var9 - 1 >> arg2.field414;
            int var14 = var10 >> arg2.field414;
            int var15 = -(-arg2.field416 - var11) - 1 >> arg2.field414;
            if (arg5 == arg2.method10(var12, var14) && arg5 == arg2.method10(var13, var14) && arg5 == arg2.method10(var12, var15) && arg5 == arg2.method10(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field3706; var16++) {
                this.field3633[var16] = this.field3633[var16] + arg2.method11(this.field3687[var16] + arg4, this.field3694[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field3643;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field3706; var18++) {
                int var19 = (this.field3633[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field3633[var18] += (arg1 - var19) * (arg2.method11(this.field3687[var18] + arg4, this.field3694[var18] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = (arg1 & 0xFFCC30) >> 16 << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var20 >> 1) < 0 || (arg2.field411 << arg2.field414) <= (arg4 + (var20 >> 1) + arg2.field416) || arg6 - (var21 >> 1) < 0 || (arg6 - (-(var21 >> 1) - arg2.field416)) >= (arg2.field413 << arg2.field414)) {
                return;
            }
            this.method2203(var20, var21, -77, var23, arg6, var22, arg2, arg4, arg5);
        } else if (arg0 == 4) {
            int var31 = this.field3647 - this.field3643;
            for (int var32 = 0; var32 < this.field3706; var32++) {
                this.field3633[var32] = var31 + (this.field3633[var32] - (arg5 - arg3.method11(this.field3687[var32] + arg4, this.field3694[var32] + arg6)));
            }
        } else if (arg0 == 5) {
            int var24 = this.field3647 - this.field3643;
            for (int var25 = 0; var25 < this.field3706; var25++) {
                int var26 = this.field3687[var25] + arg4;
                int var27 = this.field3694[var25] + arg6;
                int var28 = arg2.method11(var26, var27);
                int var29 = arg3.method11(var26, var27);
                int var30 = var28 - var29;
                this.field3633[var25] = ((this.field3633[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        this.field3689 = false;
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "()[Lck;")
    public final class462[] method1593() {
        field3614++;
        return this.field3692;
    }

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "(I)V")
    public final void method1594(int arg0) {
        field3604++;
        int var2 = class95.field1242[arg0];
        int var3 = class95.field1241[arg0];
        for (int var4 = 0; var4 < this.field3706; var4++) {
            int var5 = this.field3633[var4] * var2 + (this.field3687[var4] * var3) >> 15;
            this.field3633[var4] = this.field3633[var4] * var3 - (this.field3687[var4] * var2) >> 15;
            this.field3687[var4] = var5;
        }
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "(I)V")
    public final void method1595(int arg0) {
        this.field3600 = (short) arg0;
        field3653++;
        if (this.field3696 != null) {
            this.field3696.field133 = null;
        }
        if (this.field3662 != null) {
            this.field3662.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "()V")
    public final void method1596() {
        field3642++;
        for (int var1 = 0; var1 < this.field3706; var1++) {
            this.field3694[var1] = -this.field3694[var1];
        }
        for (int var2 = 0; var2 < this.field3650; var2++) {
            this.field3698[var2] = (short) (-this.field3698[var2]);
        }
        for (int var3 = 0; var3 < this.field3635; var3++) {
            short var4 = this.field3693[var3];
            this.field3693[var3] = this.field3691[var3];
            this.field3691[var3] = var4;
        }
        if (this.field3662 == null && this.field3696 != null) {
            this.field3696.field133 = null;
        }
        if (this.field3662 != null) {
            this.field3662.field133 = null;
        }
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        if (this.field3638 != null) {
            this.field3638.field5296 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "Z", descriptor = "()I")
    public final int method1597() {
        if (!this.field3689) {
            this.method1588((byte) 120);
        }
        field3658++;
        return this.field3622;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lc;Lwp;II)V")
    public final void method1598(class125 arg0, class122 arg1, int arg2, int arg3) {
        field3598++;
        if (this.field3650 == 0) {
            return;
        }
        class275 var5 = this.field3666.field7360;
        if (!this.field3689) {
            this.method1588((byte) 127);
        }
        class275 var6 = (class275) arg0;
        class471.field6569 = var5.field4069 * var6.field4091 + var5.field4079 * var6.field4059 + var5.field4061 * var6.field4077 + var5.field4091;
        class177.field2541 = var5.field4069 * var6.field4061 + var5.field4079 * var6.field4068 + var5.field4061 * var6.field4078;
        float var7 = (float) this.field3643 * class177.field2541 + class471.field6569;
        float var8 = (float) this.field3647 * class177.field2541 + class471.field6569;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field3688) + var8;
            var10 = (float) this.field3688 + var7;
        } else {
            var9 = (float) (-this.field3688) + var7;
            var10 = (float) this.field3688 + var8;
        }
        if ((this.field3666.field7376 <= var9) || ((float) this.field3666.field7434 >= var10)) {
            return;
        }
        class226.field3257 = var5.field4084 * var6.field4061 + var5.field4068 * var6.field4078 + var5.field4062 * var6.field4068;
        class529.field7758 = var5.field4084 * var6.field4091 + var5.field4068 * var6.field4077 + var5.field4062 * var6.field4059 + var5.field4059;
        float var11 = (float) this.field3643 * class226.field3257 + class529.field7758;
        float var12 = (float) this.field3647 * class226.field3257 + class529.field7758;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) (-this.field3688) + var12) * (float) this.field3666.field7410;
            var14 = ((float) this.field3688 + var11) * (float) this.field3666.field7410;
        } else {
            var14 = ((float) this.field3688 + var12) * (float) this.field3666.field7410;
            var13 = ((float) (-this.field3688) + var11) * (float) this.field3666.field7410;
        }
        if ((this.field3666.field7377 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field3666.field7356)) {
            return;
        }
        class523.field7695 = var5.field4088 * var6.field4091 + var5.field4082 * var6.field4059 + var5.field4078 * var6.field4077 + var5.field4077;
        class133.field1749 = var5.field4088 * var6.field4061 + var5.field4082 * var6.field4068 + var5.field4078 * var6.field4078;
        float var15 = (float) this.field3643 * class133.field1749 + class523.field7695;
        float var16 = (float) this.field3647 * class133.field1749 + class523.field7695;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = (var16 - (float) this.field3688) * (float) this.field3666.field7400;
            var18 = ((float) this.field3688 + var15) * (float) this.field3666.field7400;
        } else {
            var17 = (var15 - (float) this.field3688) * (float) this.field3666.field7400;
            var18 = ((float) this.field3688 + var16) * (float) this.field3666.field7400;
        }
        if ((var17 / (float) arg2 >= this.field3666.field7367) || (var18 / (float) arg2 <= this.field3666.field7399)) {
            return;
        }
        if (arg1 != null || this.field3663 != null) {
            class12.field161 = var5.field4069 * var6.field4069 + var5.field4079 * var6.field4084 + var5.field4061 * var6.field4088;
            class497.field7042 = var5.field4069 * var6.field4079 + var5.field4079 * var6.field4062 + var5.field4061 * var6.field4082;
            class493.field6969 = var5.field4084 * var6.field4069 + var5.field4068 * var6.field4088 + var5.field4062 * var6.field4084;
            class471.field6572 = var5.field4084 * var6.field4079 + var5.field4068 * var6.field4082 + var5.field4062 * var6.field4062;
            class435.field6117 = var5.field4088 * var6.field4079 + var5.field4082 * var6.field4062 + var5.field4078 * var6.field4082;
            class47.field543 = var5.field4088 * var6.field4069 + var5.field4082 * var6.field4084 + var5.field4078 * var6.field4088;
        }
        if (arg1 != null) {
            int var19 = this.field3695 + this.field3644 >> 1;
            int var20 = this.field3622 + this.field3610 >> 1;
            int var21 = (int) ((float) var20 * class493.field6969 + (float) this.field3643 * class226.field3257 + (float) var19 * class471.field6572 + class529.field7758);
            int var22 = (int) ((float) var20 * class47.field543 + (float) this.field3643 * class133.field1749 + (float) var19 * class435.field6117 + class523.field7695);
            int var23 = (int) ((float) var20 * class12.field161 + (float) this.field3643 * class177.field2541 + (float) var19 * class497.field7042 + class471.field6569);
            int var24 = (int) ((float) var20 * class493.field6969 + (float) this.field3647 * class226.field3257 + (float) var19 * class471.field6572 + class529.field7758);
            int var25 = (int) ((float) var20 * class47.field543 + (float) this.field3647 * class133.field1749 + (float) var19 * class435.field6117 + class523.field7695);
            int var26 = (int) ((float) var20 * class12.field161 + (float) this.field3647 * class177.field2541 + (float) var19 * class497.field7042 + class471.field6569);
            arg1.field1675 = this.field3666.field7396 + (this.field3666.field7410 * var21 / arg2);
            arg1.field1673 = this.field3666.field7396 + (this.field3666.field7410 * var24 / arg2);
            arg1.field1671 = this.field3666.field7359 + (this.field3666.field7400 * var22 / arg2);
            arg1.field1674 = this.field3666.field7359 + (this.field3666.field7400 * var25 / arg2);
            if (var23 < this.field3666.field7434 && this.field3666.field7434 > var26) {
                arg1.field1672 = true;
                arg1.field1676 = (this.field3688 + var21) * this.field3666.field7410 / arg2 + this.field3666.field7396 - arg1.field1675;
            }
        }
        this.field3666.method2929(75, (float) arg2);
        this.field3666.method2955(16);
        this.field3666.method2953(var6, (byte) -48);
        this.method1569((byte) 81);
        this.field3666.method2938(0);
        this.method1602(116);
    }

    @OriginalMember(owner = "client!rr", name = "W", descriptor = "(I)V")
    public final void method1599(int arg0) {
        field3677++;
        int var2 = class95.field1242[arg0];
        int var3 = class95.field1241[arg0];
        for (int var4 = 0; var4 < this.field3706; var4++) {
            int var5 = this.field3633[var4] * var3 - (this.field3694[var4] * var2) >> 15;
            this.field3694[var4] = this.field3633[var4] * var2 + (this.field3694[var4] * var3) >> 15;
            this.field3633[var4] = var5;
        }
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method1600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3701++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class74.field905 = 0;
            int var12 = 0;
            class443.field6220 = 0;
            class19.field226 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3686.length) {
                    int[] var15 = this.field3686[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class74.field905 += this.field3687[var17];
                        class19.field226 += this.field3633[var17];
                        var12++;
                        class443.field6220 += this.field3694[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class19.field226 = var9;
                class443.field6220 = var10;
                class74.field905 = var11;
            } else {
                class74.field905 = class74.field905 / var12 + var11;
                class19.field226 = class19.field226 / var12 + var9;
                class443.field6220 = class443.field6220 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field3686.length > var22) {
                    int[] var23 = this.field3686[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3687[var25] += var19;
                        this.field3633[var25] += var20;
                        this.field3694[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3686.length > var45) {
                    int[] var46 = this.field3686[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3687[var48] -= class74.field905;
                            this.field3633[var48] -= class19.field226;
                            this.field3694[var48] -= class443.field6220;
                            if (arg4 != 0) {
                                int var49 = class95.field1242[arg4];
                                int var50 = class95.field1241[arg4];
                                int var51 = this.field3687[var48] * var50 + this.field3633[var48] * var49 + 32767 >> 15;
                                this.field3633[var48] = this.field3633[var48] * var50 + 32767 - (this.field3687[var48] * var49) >> 15;
                                this.field3687[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class95.field1242[arg2];
                                int var53 = class95.field1241[arg2];
                                int var54 = this.field3633[var48] * var53 + 32767 - (this.field3694[var48] * var52) >> 15;
                                this.field3694[var48] = this.field3694[var48] * var53 + this.field3633[var48] * var52 + 32767 >> 15;
                                this.field3633[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class95.field1242[arg3];
                                int var56 = class95.field1241[arg3];
                                int var57 = this.field3694[var48] * var55 + (this.field3687[var48] * var56) + 32767 >> 15;
                                this.field3694[var48] = this.field3694[var48] * var56 + 32767 - (this.field3687[var48] * var55) >> 15;
                                this.field3687[var48] = var57;
                            }
                            this.field3687[var48] += class74.field905;
                            this.field3633[var48] += class19.field226;
                            this.field3694[var48] += class443.field6220;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3687[var59] -= class74.field905;
                            this.field3633[var59] -= class19.field226;
                            this.field3694[var59] -= class443.field6220;
                            if (arg2 != 0) {
                                int var60 = class95.field1242[arg2];
                                int var61 = class95.field1241[arg2];
                                int var62 = this.field3633[var59] * var61 + (32767 - (this.field3694[var59] * var60)) >> 15;
                                this.field3694[var59] = this.field3633[var59] * var60 + (this.field3694[var59] * var61) + 32767 >> 15;
                                this.field3633[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class95.field1242[arg4];
                                int var64 = class95.field1241[arg4];
                                int var65 = this.field3687[var59] * var64 + this.field3633[var59] * var63 + 32767 >> 15;
                                this.field3633[var59] = this.field3633[var59] * var64 + 32767 - (this.field3687[var59] * var63) >> 15;
                                this.field3687[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class95.field1242[arg3];
                                int var67 = class95.field1241[arg3];
                                int var68 = this.field3694[var59] * var66 + this.field3687[var59] * var67 + 32767 >> 15;
                                this.field3694[var59] = this.field3694[var59] * var67 + 32767 - this.field3687[var59] * var66 >> 15;
                                this.field3687[var59] = var68;
                            }
                            this.field3687[var59] += class74.field905;
                            this.field3633[var59] += class19.field226;
                            this.field3694[var59] += class443.field6220;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field3686.length) {
                        int[] var29 = this.field3686[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3637[var31];
                            int var33 = this.field3637[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3654[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class95.field1242[arg4];
                                    int var37 = class95.field1241[arg4];
                                    int var38 = this.field3651[var35] * var36 + (this.field3660[var35] * var37) + 32767 >> 15;
                                    this.field3651[var35] = (short) (this.field3651[var35] * var37 + 32767 - (this.field3660[var35] * var36) >> 15);
                                    this.field3660[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class95.field1242[arg2];
                                    int var40 = class95.field1241[arg2];
                                    int var41 = this.field3651[var35] * var40 - (this.field3698[var35] * var39 - 32767) >> 15;
                                    this.field3698[var35] = (short) (this.field3698[var35] * var40 + this.field3651[var35] * var39 + 32767 >> 15);
                                    this.field3651[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class95.field1242[arg3];
                                    int var43 = class95.field1241[arg3];
                                    int var44 = this.field3698[var35] * var42 + this.field3660[var35] * var43 + 32767 >> 15;
                                    this.field3698[var35] = (short) (this.field3698[var35] * var43 + 32767 - (this.field3660[var35] * var42) >> 15);
                                    this.field3660[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3662 == null && this.field3696 != null) {
                    this.field3696.field133 = null;
                }
                if (this.field3662 != null) {
                    this.field3662.field133 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field3686.length) {
                    int[] var71 = this.field3686[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3687[var73] -= class74.field905;
                        this.field3633[var73] -= class19.field226;
                        this.field3694[var73] -= class443.field6220;
                        this.field3687[var73] = this.field3687[var73] * arg2 >> 7;
                        this.field3633[var73] = this.field3633[var73] * arg3 >> 7;
                        this.field3694[var73] = this.field3694[var73] * arg4 >> 7;
                        this.field3687[var73] += class74.field905;
                        this.field3633[var73] += class19.field226;
                        this.field3694[var73] += class443.field6220;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3645 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field3645.length > var78) {
                        int[] var79 = this.field3645[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3678[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3678[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3696 != null) {
                            this.field3696.field133 = null;
                        }
                    }
                }
                if (this.field3663 != null) {
                    for (int var75 = 0; var75 < this.field3669; var75++) {
                        class126 var76 = this.field3663[var75];
                        class421 var77 = this.field3639[var75];
                        var77.field5936 = var77.field5936 & 0xFFFFFF | 255 - (this.field3678[var76.field1696] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3645 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field3645.length > var87) {
                        int[] var88 = this.field3645[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3625[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD20) >> 10;
                            int var93 = (var91 & 0x382) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3625[var90] = (short) class170.method1067(var97, class170.method1067(var95 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field3696 != null) {
                            this.field3696.field133 = null;
                        }
                    }
                }
                if (this.field3663 != null) {
                    for (int var84 = 0; var84 < this.field3669; var84++) {
                        class126 var85 = this.field3663[var84];
                        class421 var86 = this.field3639[var84];
                        var86.field5936 = var86.field5936 & 0xFF000000 | class391.field5502[this.field3625[var85.field1696] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3702 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field3702.length) {
                        int[] var100 = this.field3702[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class421 var102 = this.field3639[var100[var101]];
                            var102.field5930 += arg2;
                            var102.field5937 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3702 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field3702.length > var104) {
                        int[] var105 = this.field3702[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class421 var107 = this.field3639[var105[var106]];
                            var107.field5932 = var107.field5932 * arg2 >> 7;
                            var107.field5939 = var107.field5939 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3702 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field3702.length) {
                    int[] var110 = this.field3702[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class421 var112 = this.field3639[var110[var111]];
                        var112.field5934 = var112.field5934 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILhf;)V")
    private final void method1601(int arg0, class275 arg1) {
        if (this.field3692 != null) {
            for (int var3 = 0; var3 < this.field3692.length; var3++) {
                class462 var4 = this.field3692[var3];
                class462 var5 = var4;
                if (var4.field6457 != null) {
                    var5 = var4.field6457;
                }
                var5.field6454 = (int) ((float) this.field3694[var4.field6462] * arg1.field4084 + (float) this.field3687[var4.field6462] * arg1.field4062 + (float) this.field3633[var4.field6462] * arg1.field4068 + arg1.field4059);
                var5.field6467 = (int) ((float) this.field3694[var4.field6462] * arg1.field4088 + (float) this.field3687[var4.field6462] * arg1.field4082 + (float) this.field3633[var4.field6462] * arg1.field4078 + arg1.field4077);
                var5.field6453 = (int) ((float) this.field3694[var4.field6462] * arg1.field4069 + (float) this.field3687[var4.field6462] * arg1.field4079 + (float) this.field3633[var4.field6462] * arg1.field4061 + arg1.field4091);
                var5.field6463 = (int) ((float) this.field3694[var4.field6460] * arg1.field4084 + (float) this.field3687[var4.field6460] * arg1.field4062 + (float) this.field3633[var4.field6460] * arg1.field4068 + arg1.field4059);
                var5.field6455 = (int) ((float) this.field3694[var4.field6460] * arg1.field4088 + (float) this.field3687[var4.field6460] * arg1.field4082 + (float) this.field3633[var4.field6460] * arg1.field4078 + arg1.field4077);
                var5.field6469 = (int) ((float) this.field3694[var4.field6460] * arg1.field4069 + (float) this.field3687[var4.field6460] * arg1.field4079 + (float) this.field3633[var4.field6460] * arg1.field4061 + arg1.field4091);
                var5.field6456 = (int) ((float) this.field3694[var4.field6449] * arg1.field4084 + (float) this.field3687[var4.field6449] * arg1.field4062 + (float) this.field3633[var4.field6449] * arg1.field4068 + arg1.field4059);
                var5.field6459 = (int) ((float) this.field3694[var4.field6449] * arg1.field4088 + (float) this.field3687[var4.field6449] * arg1.field4082 + (float) this.field3633[var4.field6449] * arg1.field4078 + arg1.field4077);
                var5.field6466 = (int) ((float) this.field3694[var4.field6449] * arg1.field4069 + (float) this.field3687[var4.field6449] * arg1.field4079 + (float) this.field3633[var4.field6449] * arg1.field4061 + arg1.field4091);
            }
        }
        int var6 = 78 / ((arg0 - 73) / 33);
        field3671++;
        if (this.field3672 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field3672.length; var7++) {
            class63 var8 = this.field3672[var7];
            class63 var9 = var8;
            if (var8.field794 != null) {
                var9 = var8.field794;
            }
            if (var8.field800 == null) {
                var8.field800 = arg1.method827();
            } else {
                var8.field800.method828(arg1);
            }
            var9.field798 = (int) ((float) this.field3694[var8.field797] * arg1.field4084 + (float) this.field3687[var8.field797] * arg1.field4062 + (float) this.field3633[var8.field797] * arg1.field4068 + arg1.field4059);
            var9.field787 = (int) ((float) this.field3694[var8.field797] * arg1.field4088 + (float) this.field3687[var8.field797] * arg1.field4082 + (float) this.field3633[var8.field797] * arg1.field4078 + arg1.field4077);
            var9.field785 = (int) ((float) this.field3694[var8.field797] * arg1.field4069 + (float) this.field3687[var8.field797] * arg1.field4079 + (float) this.field3633[var8.field797] * arg1.field4061 + arg1.field4091);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    private final void method1602(int arg0) {
        if (arg0 <= 96) {
            this.method1562(null, -1, 103, 28, false);
        }
        if (this.field3663 != null) {
            class275 var2 = this.field3666.field7307;
            float var3 = this.field3666.method388();
            float var4 = this.field3666.method386();
            this.field3666.method2919(66);
            this.field3666.method297(false);
            this.field3666.method2962(1, false);
            this.field3666.method2939(this.field3666.field7352, null, 16063, null, this.field3666.field7386);
            for (int var5 = 0; var5 < this.field3669; var5++) {
                class126 var6 = this.field3663[var5];
                class421 var7 = this.field3639[var5];
                if (!var6.field1692 || !this.field3666.method327()) {
                    float var8 = (float) (this.field3687[var6.field1706] + this.field3687[var6.field1702] + this.field3687[var6.field1693]) * 0.3333333F;
                    float var9 = (float) (this.field3633[var6.field1706] + this.field3633[var6.field1693] + this.field3633[var6.field1702]) * 0.3333333F;
                    float var10 = (float) (this.field3694[var6.field1702] + this.field3694[var6.field1693] + this.field3694[var6.field1706]) * 0.3333333F;
                    float var11 = class493.field6969 * var10 + class471.field6572 * var8 + class226.field3257 * var9 + class529.field7758;
                    float var12 = class47.field543 * var10 + class435.field6117 * var8 + class133.field1749 * var9 + class523.field7695;
                    float var13 = class12.field161 * var10 + class497.field7042 * var8 + class177.field2541 * var9 + class471.field6569;
                    var2.method1729(-29478, var6.field1699 * var7.field5939 >> 7, (float) var7.field5937 - var12, -var13, var7.field5934, var6.field1698 * var7.field5932 >> 7, (float) var7.field5930 + var11);
                    this.field3666.method2973(106, var2);
                    this.field3666.method365(var4, var3 - ((float) var6.field1694 * 1.5F));
                    int var14 = var7.field5936;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field3666.method2995(var6.field1701, (byte) 96);
                    this.field3666.method2967(var6.field1695, 120);
                    this.field3666.method2999(var6.field1704, 100);
                    this.field3666.method2916(0, 4, 916736984, 7);
                }
            }
            this.field3666.method365(var4, var3);
            this.field3666.method297(true);
            this.field3666.method2938(0);
        }
        field3640++;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static void method1603(int arg0) {
        field3710 = null;
        field3708 = null;
        if (arg0 >= -50) {
            field3710 = null;
        }
        field3674 = null;
    }

    @OriginalMember(owner = "client!rr", name = "KA", descriptor = "()V")
    public final void method1604() {
        for (int var1 = 0; var1 < this.field3665; var1++) {
            this.field3687[var1] = this.field3687[var1] + 7 >> 4;
            this.field3633[var1] = this.field3633[var1] + 7 >> 4;
            this.field3694[var1] = this.field3694[var1] + 7 >> 4;
        }
        field3618++;
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "RA", descriptor = "()I")
    public final int method1605() {
        field3709++;
        return this.field3620;
    }

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "(I)V")
    public final void method1606(int arg0) {
        field3597++;
        this.field3620 = arg0;
        this.field3605 = true;
        if (this.field3661 != null && (this.field3620 & 0x10000) == 0) {
            this.field3651 = this.field3661.field4745;
            this.field3660 = this.field3661.field4742;
            this.field3683 = this.field3661.field4743;
            this.field3698 = this.field3661.field4741;
            this.field3661 = null;
        }
        this.method1564((byte) -15);
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "()Z")
    public final boolean method1607() {
        field3611++;
        if (this.field3686 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3665; var1++) {
            this.field3687[var1] <<= 0x4;
            this.field3633[var1] <<= 0x4;
            this.field3694[var1] <<= 0x4;
        }
        class443.field6220 = 0;
        class74.field905 = 0;
        class19.field226 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
    private final void method1608(int arg0, boolean arg1) {
        field3634++;
        if (this.field3652 * 6 > this.field3666.field7451.field5663.length) {
            this.field3666.field7451 = new class141((this.field3652 + 100) * 6);
        } else {
            this.field3666.field7451.field5665 = 0;
        }
        class141 var3 = this.field3666.field7451;
        if (this.field3666.field7340) {
            for (int var4 = 0; var4 < this.field3652; var4++) {
                var3.method2372(this.field3693[var4], 121);
                var3.method2372(this.field3606[var4], 66);
                var3.method2372(this.field3691[var4], -126);
            }
        } else {
            for (int var5 = 0; var5 < this.field3652; var5++) {
                var3.method2378(-1784786264, this.field3693[var5]);
                var3.method2378(-1784786264, this.field3606[var5]);
                var3.method2378(-1784786264, this.field3691[var5]);
            }
        }
        if (arg0 >= -85 || var3.field5665 == 0) {
            return;
        }
        if (arg1) {
            if (this.field3629 == null) {
                this.field3629 = this.field3666.method2975(var3.field5663, true, 5123, 0, var3.field5665);
            } else {
                this.field3629.method454(var3.field5665, (byte) 60, var3.field5663, 5123);
            }
            this.field3638.field5296 = this.field3629;
        } else {
            this.field3638.field5296 = this.field3666.method2975(var3.field5663, false, 5123, 0, var3.field5665);
        }
        if (!arg1) {
            this.field3605 = true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V")
    public static final void method1609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class4.field81.field1423 != 0 && arg0 != 0 && class10.field140 < 50 && arg2 != -1) {
            class289.field4229[class10.field140++] = new class78((byte) 1, arg2, arg0, arg5, arg1, arg3);
        }
        field3655++;
        if (arg4 != 0) {
            method1565(84, -83, false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "(III)V")
    public final void method1610(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3706; var4++) {
            if (arg0 != 128) {
                this.field3687[var4] = this.field3687[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3633[var4] = this.field3633[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3694[var4] = this.field3694[var4] * arg2 >> 7;
            }
        }
        field3628++;
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method1611(char arg0, int arg1, String arg2) {
        field3626++;
        if (arg1 <= 6) {
            method1565(-117, 122, true);
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "ma", descriptor = "(I)V")
    public final void method1612(int arg0) {
        field3612++;
        int var2 = class95.field1242[arg0];
        int var3 = class95.field1241[arg0];
        for (int var4 = 0; var4 < this.field3706; var4++) {
            int var5 = this.field3694[var4] * var2 + this.field3687[var4] * var3 >> 15;
            this.field3694[var4] = this.field3694[var4] * var3 - (this.field3687[var4] * var2) >> 15;
            this.field3687[var4] = var5;
        }
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
        this.field3689 = false;
    }

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "()I")
    public final int method1613() {
        field3609++;
        if (!this.field3689) {
            this.method1588((byte) 125);
        }
        return this.field3610;
    }

    @OriginalMember(owner = "client!rr", name = "EA", descriptor = "(Li;)Li;")
    public final class31 method1614(class31 arg0) {
        field3659++;
        if (this.field3650 == 0) {
            return null;
        }
        if (!this.field3689) {
            this.method1588((byte) 127);
        }
        int var2;
        int var3;
        if (this.field3666.field7398 > 0) {
            var2 = this.field3695 - (this.field3666.field7398 * this.field3647 >> 8) >> this.field3666.field7311;
            var3 = this.field3644 - (this.field3666.field7398 * this.field3643 >> 8) >> this.field3666.field7311;
        } else {
            var2 = this.field3695 - (this.field3666.field7398 * this.field3643 >> 8) >> this.field3666.field7311;
            var3 = this.field3644 - (this.field3666.field7398 * this.field3647 >> 8) >> this.field3666.field7311;
        }
        int var4;
        int var5;
        if (this.field3666.field7349 > 0) {
            var4 = this.field3622 - (this.field3666.field7349 * this.field3647 >> 8) >> this.field3666.field7311;
            var5 = this.field3610 - (this.field3666.field7349 * this.field3643 >> 8) >> this.field3666.field7311;
        } else {
            var4 = this.field3622 - (this.field3666.field7349 * this.field3643 >> 8) >> this.field3666.field7311;
            var5 = this.field3610 - (this.field3666.field7349 * this.field3647 >> 8) >> this.field3666.field7311;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class535 var8 = (class535) arg0;
        class535 var9;
        if (var8 != null && var8.method3145(var7, var6, (byte) 69)) {
            var9 = var8;
            var8.method3146(2084241616);
        } else {
            var9 = new class535(this.field3666, var6, var7);
        }
        var9.method3150(var5, (byte) 127, var2, var4, var3);
        this.method1563(var9, -14105);
        return var9;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IFIJIIFLld;II)S")
    private final short method1615(int arg0, float arg1, int arg2, long arg3, int arg4, int arg5, float arg6, class117 arg7, int arg8, int arg9) {
        field3641++;
        int var12 = this.field3637[arg9];
        int var13 = this.field3637[arg9 + 1];
        if (arg2 != 9) {
            this.method1618(67);
        }
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3654[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class541.field7916[var15] == arg3) {
                return (short) (var16 - 1);
            }
        }
        this.field3654[var14] = (short) (this.field3650 + 1);
        class541.field7916[var14] = arg3;
        this.field3660[this.field3650] = (short) arg4;
        this.field3651[this.field3650] = (short) arg0;
        this.field3698[this.field3650] = (short) arg5;
        this.field3683[this.field3650] = (byte) arg8;
        this.field3613[this.field3650] = arg1;
        this.field3684[this.field3650] = arg6;
        return (short) (this.field3650++);
    }

    @OriginalMember(owner = "client!rr", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method1616(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3682++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class74.field905 = 0;
            class443.field6220 = 0;
            int var13 = 0;
            class19.field226 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3686.length) {
                    int[] var16 = this.field3686[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3667 == null || (this.field3667[var18] & arg6) != 0) {
                            class74.field905 += this.field3687[var18];
                            class19.field226 += this.field3633[var18];
                            var13++;
                            class443.field6220 += this.field3694[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class443.field6220 = var11;
                class74.field905 = var12;
                class19.field226 = var10;
            } else {
                class410.field5798 = true;
                class443.field6220 = class443.field6220 / var13 + var11;
                class74.field905 = class74.field905 / var13 + var12;
                class19.field226 = class19.field226 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 - (-(arg7[2] * arg4) - 16384) >> 15;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 - (-(arg7[5] * arg4) - 16384) >> 15;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 + (arg7[7] * arg3) + 16384) >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3686.length) {
                    int[] var27 = this.field3686[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3667 == null || (this.field3667[var29] & arg6) != 0) {
                            this.field3687[var29] += var24;
                            this.field3633[var29] += var22;
                            this.field3694[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field3686.length) {
                        int[] var110 = this.field3686[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field3667 == null || (arg6 & this.field3667[var112]) != 0) {
                                this.field3687[var112] -= class74.field905;
                                this.field3633[var112] -= class19.field226;
                                this.field3694[var112] -= class443.field6220;
                                if (arg4 != 0) {
                                    int var113 = class95.field1242[arg4];
                                    int var114 = class95.field1241[arg4];
                                    int var115 = this.field3687[var112] * var114 + this.field3633[var112] * var113 + 32767 >> 15;
                                    this.field3633[var112] = this.field3633[var112] * var114 + 32767 - this.field3687[var112] * var113 >> 15;
                                    this.field3687[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class95.field1242[arg2];
                                    int var117 = class95.field1241[arg2];
                                    int var118 = this.field3633[var112] * var117 + 32767 - (this.field3694[var112] * var116) >> 15;
                                    this.field3694[var112] = this.field3633[var112] * var116 + (this.field3694[var112] * var117) + 32767 >> 15;
                                    this.field3633[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class95.field1242[arg3];
                                    int var120 = class95.field1241[arg3];
                                    int var121 = this.field3687[var112] * var120 + this.field3694[var112] * var119 + 32767 >> 15;
                                    this.field3694[var112] = this.field3694[var112] * var120 + 32767 - (this.field3687[var112] * var119) >> 15;
                                    this.field3687[var112] = var121;
                                }
                                this.field3687[var112] += class74.field905;
                                this.field3633[var112] += class19.field226;
                                this.field3694[var112] += class443.field6220;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field3686.length > var92) {
                            int[] var93 = this.field3686[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field3667 == null || (arg6 & this.field3667[var95]) != 0) {
                                    int var96 = this.field3637[var95];
                                    int var97 = this.field3637[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field3654[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class95.field1242[arg4];
                                            int var101 = class95.field1241[arg4];
                                            int var102 = this.field3660[var99] * var101 + this.field3651[var99] * var100 + 32767 >> 15;
                                            this.field3651[var99] = (short) (this.field3651[var99] * var101 + 32767 - (this.field3660[var99] * var100) >> 15);
                                            this.field3660[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class95.field1242[arg2];
                                            int var104 = class95.field1241[arg2];
                                            int var105 = this.field3651[var99] * var104 + 32767 - (this.field3698[var99] * var103) >> 15;
                                            this.field3698[var99] = (short) (this.field3698[var99] * var104 + this.field3651[var99] * var103 + 32767 >> 15);
                                            this.field3651[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class95.field1242[arg3];
                                            int var107 = class95.field1241[arg3];
                                            int var108 = this.field3698[var99] * var106 + (this.field3660[var99] * var107 + 32767) >> 15;
                                            this.field3698[var99] = (short) (this.field3698[var99] * var107 + 32767 - (this.field3660[var99] * var106) >> 15);
                                            this.field3660[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3662 == null && this.field3696 != null) {
                        this.field3696.field133 = null;
                    }
                    if (this.field3662 != null) {
                        this.field3662.field133 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class410.field5798) {
                    int var36 = arg7[6] * class443.field6220 + arg7[3] * class19.field226 + arg7[0] * class74.field905 + 16384 >> 15;
                    int var37 = arg7[7] * class443.field6220 + arg7[1] * class74.field905 + arg7[4] * class19.field226 + 16384 >> 15;
                    int var38 = var33 + var36;
                    int var39 = arg7[2] * class74.field905 + (arg7[5] * class19.field226 + (arg7[8] * class443.field6220) + 16384) >> 15;
                    int var40 = var34 + var37;
                    class74.field905 = var38;
                    class19.field226 = var40;
                    int var41 = var35 + var39;
                    class443.field6220 = var41;
                    class410.field5798 = false;
                }
                int[] var42 = new int[9];
                int var43 = class95.field1241[arg2];
                int var44 = class95.field1242[arg2];
                int var45 = class95.field1241[arg3];
                int var46 = class95.field1242[arg3];
                int var47 = class95.field1241[arg4];
                int var48 = class95.field1242[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var46 * var50 + (var45 * var47 + 16384) >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[7] = var46 * var48 - (-(var45 * var49) - 16384) >> 15;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                int var51 = var42[1] * -class19.field226 + var42[0] * -class74.field905 + var42[2] * -class443.field6220 + 16384 >> 15;
                int var52 = var42[3] * -class74.field905 + (var42[4] * -class19.field226) + (var42[5] * -class443.field6220) + 16384 >> 15;
                int var53 = var42[6] * -class74.field905 + (var42[8] * -class443.field6220) + var42[7] * -class19.field226 + 16384 >> 15;
                int var54 = class74.field905 + var51;
                int var55 = class19.field226 + var52;
                int var56 = class443.field6220 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[1] * var34 + (var42[2] * var35) + var42[0] * var33 + 16384 >> 15;
                int var60 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var61 = var54 + var59;
                int var62 = var42[7] * var34 + (var42[6] * var33 + (var42[8] * var35)) + 16384 >> 15;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[0] * var61 + (arg7[1] * var63 + (arg7[2] * var64)) + 16384 >> 15;
                int var68 = arg7[4] * var63 + arg7[3] * var61 - (-(arg7[5] * var64) - 16384) >> 15;
                int var69 = var31 + var68;
                int var70 = arg7[8] * var64 + (arg7[6] * var61 + (arg7[7] * var63)) + 16384 >> 15;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field3686.length) {
                        int[] var75 = this.field3686[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field3667 == null || (this.field3667[var77] & arg6) != 0) {
                                int var78 = this.field3633[var77] * var65[1] + this.field3694[var77] * var65[2] + this.field3687[var77] * var65[0] + 16384 >> 15;
                                int var79 = this.field3694[var77] * var65[5] + this.field3687[var77] * var65[3] + (this.field3633[var77] * var65[4]) + 16384 >> 15;
                                int var80 = var69 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field3687[var77] * var65[6] + (this.field3633[var77] * var65[7] + (this.field3694[var77] * var65[8]) + 16384) >> 15;
                                this.field3687[var77] = var81;
                                int var83 = var72 + var82;
                                this.field3633[var77] = var80;
                                this.field3694[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3686.length) {
                        int[] var174 = this.field3686[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3667 == null || (this.field3667[var176] & arg6) != 0) {
                                this.field3687[var176] -= class74.field905;
                                this.field3633[var176] -= class19.field226;
                                this.field3694[var176] -= class443.field6220;
                                this.field3687[var176] = this.field3687[var176] * arg2 >> 7;
                                this.field3633[var176] = this.field3633[var176] * arg3 >> 7;
                                this.field3694[var176] = this.field3694[var176] * arg4 >> 7;
                                this.field3687[var176] += class74.field905;
                                this.field3633[var176] += class19.field226;
                                this.field3694[var176] += class443.field6220;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class410.field5798) {
                    int var128 = arg7[6] * class443.field6220 + arg7[0] * class74.field905 + (arg7[3] * class19.field226) + 16384 >> 15;
                    int var129 = arg7[4] * class19.field226 + arg7[7] * class443.field6220 + arg7[1] * class74.field905 + 16384 >> 15;
                    int var130 = arg7[2] * class74.field905 + arg7[8] * class443.field6220 + arg7[5] * class19.field226 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    class74.field905 = var131;
                    class19.field226 = var132;
                    class443.field6220 = var133;
                    class410.field5798 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class74.field905 * var134 + 16384 >> 15;
                int var138 = -class19.field226 * var135 + 16384 >> 15;
                int var139 = -class443.field6220 * var136 + 16384 >> 15;
                int var140 = class74.field905 + var137;
                int var141 = class19.field226 + var138;
                int var142 = var139 + class443.field6220;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var141 + var145;
                int var148 = var127 * var136 + 16384 >> 15;
                int var149 = var142 + var148;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[1] * var147 + arg7[2] * var149 + arg7[0] * var146 + 16384 >> 15;
                int var153 = arg7[4] * var147 + arg7[3] * var146 + (arg7[5] * var149) + 16384 >> 15;
                int var154 = var123 + var153;
                int var155 = arg7[6] * var146 + arg7[8] * var149 + arg7[7] * var147 + 16384 >> 15;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field3686.length > var159) {
                        int[] var160 = this.field3686[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field3667 == null || (arg6 & this.field3667[var162]) != 0) {
                                int var163 = this.field3687[var162] * var150[0] + this.field3633[var162] * var150[1] + (this.field3694[var162] * var150[2]) + 16384 >> 15;
                                int var164 = this.field3694[var162] * var150[5] + this.field3687[var162] * var150[3] + (this.field3633[var162] * var150[4]) + 16384 >> 15;
                                int var165 = this.field3633[var162] * var150[7] + this.field3694[var162] * var150[8] + this.field3687[var162] * var150[6] + 16384 >> 15;
                                int var166 = var154 + var164;
                                int var167 = var156 + var163;
                                int var168 = var157 + var165;
                                this.field3687[var162] = var167;
                                this.field3633[var162] = var166;
                                this.field3694[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3645 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field3645.length) {
                        int[] var182 = this.field3645[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3680 == null || (arg6 & this.field3680[var184]) != 0) {
                                int var185 = (this.field3678[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3678[var184] = (byte) var185;
                                if (this.field3696 != null) {
                                    this.field3696.field133 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3663 != null) {
                    for (int var178 = 0; var178 < this.field3669; var178++) {
                        class126 var179 = this.field3663[var178];
                        class421 var180 = this.field3639[var178];
                        var180.field5936 = var180.field5936 & 0xFFFFFF | 255 - (this.field3678[var179.field1696] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3645 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field3645.length > var190) {
                        int[] var191 = this.field3645[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3680 == null || (this.field3680[var193] & arg6) != 0) {
                                int var194 = this.field3625[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3D7) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3625[var193] = (short) class170.method1067(class170.method1067(var197 << 10, var198 << 7), var200);
                                if (this.field3696 != null) {
                                    this.field3696.field133 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3663 != null) {
                    for (int var187 = 0; var187 < this.field3669; var187++) {
                        class126 var188 = this.field3663[var187];
                        class421 var189 = this.field3639[var187];
                        var189.field5936 = class391.field5502[this.field3625[var188.field1696] & 0xFFFF] & 0xFFFFFF | var189.field5936 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3702 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field3702.length > var202) {
                        int[] var203 = this.field3702[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class421 var205 = this.field3639[var203[var204]];
                            var205.field5937 += arg3;
                            var205.field5930 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3702 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field3702.length) {
                        int[] var208 = this.field3702[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class421 var210 = this.field3639[var208[var209]];
                            var210.field5932 = var210.field5932 * arg2 >> 7;
                            var210.field5939 = var210.field5939 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3702 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3702.length) {
                    int[] var213 = this.field3702[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class421 var215 = this.field3639[var213[var214]];
                        var215.field5934 = var215.field5934 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "MA", descriptor = "()I")
    public final int method1617() {
        field3615++;
        if (!this.field3689) {
            this.method1588((byte) 124);
        }
        return this.field3644;
    }

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "(I)V")
    public final void method1618(int arg0) {
        field3707++;
        int var2 = class95.field1242[arg0];
        int var3 = class95.field1241[arg0];
        for (int var4 = 0; var4 < this.field3706; var4++) {
            int var7 = this.field3694[var4] * var2 + this.field3687[var4] * var3 >> 15;
            this.field3694[var4] = this.field3694[var4] * var3 - this.field3687[var4] * var2 >> 15;
            this.field3687[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3650; var5++) {
            int var6 = this.field3698[var5] * var2 + this.field3660[var5] * var3 >> 15;
            this.field3698[var5] = (short) (this.field3698[var5] * var3 - (this.field3660[var5] * var2) >> 15);
            this.field3660[var5] = (short) var6;
        }
        if (this.field3662 == null && this.field3696 != null) {
            this.field3696.field133 = null;
        }
        if (this.field3662 != null) {
            this.field3662.field133 = null;
        }
        this.field3689 = false;
        if (this.field3627 != null) {
            this.field3627.field133 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lih;)V")
    public class247(class503 arg0) {
        this.field3666 = arg0;
        this.field3627 = new class9(null, 5126, 3, 0);
        this.field3697 = new class9(null, 5126, 2, 0);
        this.field3662 = new class9(null, 5126, 3, 0);
        this.field3696 = new class9(null, 5121, 4, 0);
        this.field3638 = new class372();
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "()Z")
    public final boolean method1619() {
        field3632++;
        if (this.field3608 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3608.length; var1++) {
            if (this.field3608[var1] != -1 && !this.field3666.field4246.method82(this.field3608[var1], -18226)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lih;Lld;IIII)V")
    public class247(class503 arg0, class117 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3646 = arg5;
        this.field3620 = arg2;
        this.field3666 = arg0;
        if (class342.method2037(2048, arg5, arg2)) {
            this.field3627 = new class9(null, 5126, 3, 0);
        }
        if (class431.method2551((byte) 20, arg5, arg2)) {
            this.field3697 = new class9(null, 5126, 2, 0);
        }
        if (class487.method2807(arg5, arg2, -122)) {
            this.field3662 = new class9(null, 5126, 3, 0);
        }
        if (class73.method544((byte) 84, arg5, arg2)) {
            this.field3696 = new class9(null, 5121, 4, 0);
        }
        if (class77.method595(0, arg2, arg5)) {
            this.field3638 = new class372();
        }
        class16 var7 = arg0.field4246;
        this.field3637 = new int[arg1.field1609 + 1];
        int[] var8 = new int[arg1.field1615];
        for (int var9 = 0; var9 < arg1.field1615; var9++) {
            if ((arg1.field1597 == null || arg1.field1597[var9] != 2) && (arg1.field1606 == null || arg1.field1606[var9] == -1 || !var7.method83(arg1.field1606[var9] & 0xFFFF, 111).field3190)) {
                var8[this.field3635++] = var9;
                this.field3637[arg1.field1610[var9]]++;
                this.field3637[arg1.field1591[var9]]++;
                this.field3637[arg1.field1621[var9]]++;
            }
        }
        this.field3652 = this.field3635;
        long[] var10 = new long[this.field3635];
        boolean var11 = (this.field3620 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field3635; var12++) {
            int var180 = var8[var12];
            class222 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1632 != null) {
                for (int var186 = 0; var186 < arg1.field1632.length; var186++) {
                    class492 var187 = arg1.field1632[var186];
                    if (var187.field6962 == var180) {
                        class29 var188 = class454.method2652((byte) -92, var187.field6963);
                        if (var188.field343) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3652--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1606 != null) {
                var189 = arg1.field1606[var180];
                if (var189 != -1) {
                    var181 = var7.method83(var189 & 0xFFFF, 101);
                    var184 = var181.field3197;
                    var185 = var181.field3195;
                }
            }
            boolean var190 = arg1.field1616 != null && arg1.field1616[var180] != 0 || var181 != null && var181.field3185 | !var181.field3189;
            if ((var11 || var190) && arg1.field1607 != null) {
                var182 += arg1.field1607[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class66.method523(0, var10, var8);
        this.field3706 = arg1.field1609;
        this.field3687 = arg1.field1627;
        this.field3665 = arg1.field1596;
        this.field3667 = arg1.field1590;
        this.field3694 = arg1.field1595;
        this.field3633 = arg1.field1598;
        this.field3692 = arg1.field1612;
        class497[] var13 = new class497[this.field3706];
        this.field3672 = arg1.field1614;
        if (arg1.field1632 != null) {
            this.field3669 = arg1.field1632.length;
            this.field3639 = new class421[this.field3669];
            this.field3663 = new class126[this.field3669];
            for (int var14 = 0; var14 < this.field3669; var14++) {
                class492 var15 = arg1.field1632[var14];
                class29 var16 = class454.method2652((byte) -88, var15.field6963);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3635; var18++) {
                    if (var8[var18] == var15.field6962) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class391.field5502[arg1.field1623[var15.field6962] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1616 == null ? 0 : arg1.field1616[var15.field6962]) << 24;
                this.field3663[var14] = new class126(var17, arg1.field1610[var15.field6962], arg1.field1591[var15.field6962], arg1.field1621[var15.field6962], var16.field350, var16.field348, var16.field355, var16.field346, var16.field354, var16.field343, var16.field352, var15.field6961);
                this.field3639[var14] = new class421(var20);
            }
        }
        int var21 = this.field3635 * 3;
        this.field3678 = new byte[this.field3635];
        this.field3693 = new short[this.field3635];
        this.field3608 = new short[this.field3635];
        this.field3660 = new short[var21];
        this.field3683 = new byte[var21];
        this.field3613 = new float[var21];
        this.field3698 = new short[var21];
        this.field3606 = new short[this.field3635];
        this.field3651 = new short[var21];
        this.field3596 = (short) arg3;
        this.field3684 = new float[var21];
        this.field3691 = new short[this.field3635];
        class541.field7916 = new long[var21];
        this.field3625 = new short[this.field3635];
        this.field3654 = new short[var21];
        if (arg1.field1604 != null) {
            this.field3680 = new short[this.field3635];
        }
        this.field3600 = (short) arg4;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1609; var23++) {
            int var179 = this.field3637[var23];
            this.field3637[var23] = var22;
            var13[var23] = new class497();
            var22 += var179;
        }
        this.field3637[arg1.field1609] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1586 != null) {
            int var28 = arg1.field1579;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var26 = new int[var28];
            var27 = new float[var28][];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field3635; var36++) {
                int var43 = var8[var36];
                if (arg1.field1586[var43] != -1) {
                    int var44 = arg1.field1586[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1610[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1591[var43];
                        } else {
                            var46 = arg1.field1621[var43];
                        }
                        int var47 = arg1.field1627[var46];
                        int var48 = arg1.field1598[var46];
                        int var49 = arg1.field1595[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1582[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1628[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var40 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) (-var39) / 1024.0F;
                            var40 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field1620[var37];
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field1628[var37];
                        var42 = 64.0F / (float) arg1.field1620[var37];
                        var40 = 64.0F / (float) arg1.field1588[var37];
                    } else {
                        var42 = (float) arg1.field1620[var37] / 1024.0F;
                        var40 = (float) arg1.field1588[var37] / 1024.0F;
                        var41 = (float) arg1.field1628[var37] / 1024.0F;
                    }
                    var27[var37] = class30.method186(false, var41, var40, arg1.field1624[var37], arg1.field1592[var37], arg1.field1625[var37], class239.method1507(arg1.field1593[var37], 255), var42);
                }
            }
        }
        class104[] var50 = new class104[arg1.field1615];
        for (int var51 = 0; var51 < arg1.field1615; var51++) {
            short var158 = arg1.field1610[var51];
            short var159 = arg1.field1591[var51];
            short var160 = arg1.field1621[var51];
            int var161 = this.field3687[var159] - this.field3687[var158];
            int var162 = this.field3633[var159] - this.field3633[var158];
            int var163 = this.field3694[var159] - this.field3694[var158];
            int var164 = this.field3687[var160] - this.field3687[var158];
            int var165 = this.field3633[var160] - this.field3633[var158];
            int var166 = this.field3694[var160] - this.field3694[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field1597 == null ? 0 : arg1.field1597[var51];
            if (var174 == 0) {
                class497 var175 = var13[var158];
                var175.field7045 += var171;
                var175.field7047++;
                var175.field7046 += var173;
                var175.field7041 += var172;
                class497 var176 = var13[var159];
                var176.field7046 += var173;
                var176.field7047++;
                var176.field7041 += var172;
                var176.field7045 += var171;
                class497 var177 = var13[var160];
                var177.field7047++;
                var177.field7045 += var171;
                var177.field7046 += var173;
                var177.field7041 += var172;
            } else if (var174 == 1) {
                class104 var178 = var50[var51] = new class104();
                var178.field1370 = var171;
                var178.field1367 = var172;
                var178.field1368 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field3635; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1623[var68] & 0xFFFF;
            short var70;
            if (arg1.field1606 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1606[var68];
            }
            int var71;
            if (arg1.field1586 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1586[var68];
            }
            int var72;
            if (arg1.field1616 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1616[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var80 = 2;
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1582[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1610[var68];
                        short var84 = arg1.field1591[var68];
                        short var85 = arg1.field1621[var68];
                        short var86 = arg1.field1592[var71];
                        short var87 = arg1.field1625[var71];
                        short var88 = arg1.field1624[var71];
                        float var89 = (float) arg1.field1627[var86];
                        float var90 = (float) arg1.field1598[var86];
                        float var91 = (float) arg1.field1595[var86];
                        float var92 = (float) arg1.field1627[var87] - var89;
                        float var93 = (float) arg1.field1598[var87] - var90;
                        float var94 = (float) arg1.field1595[var87] - var91;
                        float var95 = (float) arg1.field1627[var88] - var89;
                        float var96 = (float) arg1.field1598[var88] - var90;
                        float var97 = (float) arg1.field1595[var88] - var91;
                        float var98 = (float) arg1.field1627[var83] - var89;
                        float var99 = (float) arg1.field1598[var83] - var90;
                        float var100 = (float) arg1.field1595[var83] - var91;
                        float var101 = (float) arg1.field1627[var84] - var89;
                        float var102 = (float) arg1.field1598[var84] - var90;
                        float var103 = (float) arg1.field1595[var84] - var91;
                        float var104 = (float) arg1.field1627[var85] - var89;
                        float var105 = (float) arg1.field1598[var85] - var90;
                        float var106 = (float) arg1.field1595[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var94 * var107 - var92 * var109;
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var114 + var95 * var116 + var96 * var115);
                        var74 = (var100 * var114 + var98 * var116 + var99 * var115) * var117;
                        var76 = (var103 * var114 + var101 * var116 + var102 * var115) * var117;
                        var78 = (var106 * var114 + var104 * var116 + var105 * var115) * var117;
                    } else {
                        short var118 = arg1.field1610[var68];
                        short var119 = arg1.field1591[var68];
                        short var120 = arg1.field1621[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1601[var71];
                        float var126 = (float) arg1.field1599[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field1588[var71] / 1024.0F;
                            class418.method2475(var144, var125, arg1.field1595[var118], var126, var124, 7, var123, var121, arg1.field1598[var118], var122, arg1.field1627[var118]);
                            var74 = class389.field5472;
                            var73 = class441.field6173;
                            class418.method2475(var144, var125, arg1.field1595[var119], var126, var124, 7, var123, var121, arg1.field1598[var119], var122, arg1.field1627[var119]);
                            var75 = class441.field6173;
                            var76 = class389.field5472;
                            class418.method2475(var144, var125, arg1.field1595[var120], var126, var124, 7, var123, var121, arg1.field1598[var120], var122, arg1.field1627[var120]);
                            var77 = class441.field6173;
                            var78 = class389.field5472;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var145 < var77 - var73) {
                                    var77 -= var144;
                                    var80 = 1;
                                } else if (var73 - var77 > var145) {
                                    var80 = 2;
                                    var77 += var144;
                                }
                                if (var75 - var73 > var145) {
                                    var75 -= var144;
                                    var79 = 1;
                                } else if (var73 - var75 > var145) {
                                    var79 = 2;
                                    var75 += var144;
                                }
                            } else {
                                if ((var76 - var74 > var145)) {
                                    var79 = 1;
                                    var76 -= var144;
                                } else if (var74 - var76 > var145) {
                                    var76 += var144;
                                    var79 = 2;
                                }
                                if (var78 - var74 > var145) {
                                    var80 = 1;
                                    var78 -= var144;
                                } else if (var145 < var74 - var78) {
                                    var78 += var144;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field1589[var71] / 256.0F;
                            float var128 = (float) arg1.field1583[var71] / 256.0F;
                            int var129 = arg1.field1627[var119] - arg1.field1627[var118];
                            int var130 = arg1.field1598[var119] - arg1.field1598[var118];
                            int var131 = arg1.field1595[var119] - arg1.field1595[var118];
                            int var132 = arg1.field1627[var120] - arg1.field1627[var118];
                            int var133 = arg1.field1598[var120] - arg1.field1598[var118];
                            int var134 = arg1.field1595[var120] - arg1.field1595[var118];
                            int var135 = var130 * var134 - var131 * var133;
                            int var136 = var131 * var132 - var129 * var134;
                            int var137 = var129 * var133 - (var130 * var132);
                            float var138 = 64.0F / (float) arg1.field1628[var71];
                            float var139 = 64.0F / (float) arg1.field1620[var71];
                            float var140 = 64.0F / (float) arg1.field1588[var71];
                            float var141 = (var124[2] * (float) var137 + var124[1] * (float) var136 + var124[0] * (float) var135) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[3] * (float) var135 + var124[4] * (float) var136) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[6] * (float) var135 + var124[7] * (float) var136) / var140;
                            var81 = class373.method2184(var142, var141, var143, 1);
                            class207.method1323(-126, var126, var122, var123, var121, var127, arg1.field1598[var118], var124, var128, var81, arg1.field1627[var118], var125, arg1.field1595[var118]);
                            var73 = class435.field6119;
                            var74 = class270.field3970;
                            class207.method1323(-117, var126, var122, var123, var121, var127, arg1.field1598[var119], var124, var128, var81, arg1.field1627[var119], var125, arg1.field1595[var119]);
                            var75 = class435.field6119;
                            var76 = class270.field3970;
                            class207.method1323(-112, var126, var122, var123, var121, var127, arg1.field1598[var120], var124, var128, var81, arg1.field1627[var120], var125, arg1.field1595[var120]);
                            var78 = class270.field3970;
                            var77 = class435.field6119;
                        } else if (var82 == 3) {
                            class380.method2212(arg1.field1598[var118], var122, arg1.field1595[var118], var121, var125, var126, arg1.field1627[var118], var123, -126, var124);
                            var74 = class209.field3047;
                            var73 = class104.field1369;
                            class380.method2212(arg1.field1598[var119], var122, arg1.field1595[var119], var121, var125, var126, arg1.field1627[var119], var123, -98, var124);
                            var75 = class104.field1369;
                            var76 = class209.field3047;
                            class380.method2212(arg1.field1598[var120], var122, arg1.field1595[var120], var121, var125, var126, arg1.field1627[var120], var123, -93, var124);
                            var77 = class104.field1369;
                            var78 = class209.field3047;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field1597 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1597[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                short var152 = arg1.field1610[var68];
                short var153 = arg1.field1591[var68];
                short var154 = arg1.field1621[var68];
                class497 var155 = var13[var152];
                this.field3693[var52] = this.method1615(var155.field7045, var73, 9, var150, var155.field7041, var155.field7046, var74, arg1, var155.field7047, var152);
                class497 var156 = var13[var153];
                this.field3606[var52] = this.method1615(var156.field7045, var75, 9, (long) var79 + var150, var156.field7041, var156.field7046, var76, arg1, var156.field7047, var153);
                class497 var157 = var13[var154];
                this.field3691[var52] = this.method1615(var157.field7045, var77, 9, (long) var80 + var150, var157.field7041, var157.field7046, var78, arg1, var157.field7047, var154);
            } else if (var146 == 1) {
                class104 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field1367 > 0 ? 1024 : 2048) + ((var147.field1370 + 256 << 12) + (var71 << 2) + (var147.field1368 - -256 << 22)));
                this.field3693[var52] = this.method1615(var147.field1370, var73, 9, var148, var147.field1367, var147.field1368, var74, arg1, 0, arg1.field1610[var68]);
                this.field3606[var52] = this.method1615(var147.field1370, var75, 9, (long) var79 + var148, var147.field1367, var147.field1368, var76, arg1, 0, arg1.field1591[var68]);
                this.field3691[var52] = this.method1615(var147.field1370, var77, 9, (long) var80 + var148, var147.field1367, var147.field1368, var78, arg1, 0, arg1.field1621[var68]);
            }
            if (arg1.field1606 == null) {
                this.field3608[var52] = -1;
            } else {
                this.field3608[var52] = arg1.field1606[var68];
            }
            if (arg1.field1616 != null) {
                this.field3678[var52] = arg1.field1616[var68];
            }
            if (arg1.field1604 != null) {
                this.field3680[var52] = arg1.field1604[var68];
            }
            this.field3625[var52] = arg1.field1623[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3652; var55++) {
            short var67 = this.field3608[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field3648 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field3652; var58++) {
            short var66 = this.field3608[var58];
            if (var57 != var66) {
                this.field3648[var56++] = var58;
                var57 = var66;
            }
        }
        this.field3648[var56] = this.field3652;
        class541.field7916 = null;
        this.field3660 = class359.method2122(this.field3650, 0, this.field3660);
        this.field3651 = class359.method2122(this.field3650, 0, this.field3651);
        this.field3698 = class359.method2122(this.field3650, 0, this.field3698);
        this.field3683 = class389.method2256(0, this.field3683, this.field3650);
        this.field3613 = class92.method655(true, this.field3650, this.field3613);
        this.field3684 = class92.method655(true, this.field3650, this.field3684);
        if (arg1.field1626 != null && class290.method1798(arg2, -15605, this.field3646)) {
            this.field3686 = arg1.method782(-10248);
        }
        if (arg1.field1632 != null && class312.method1888(this.field3646, 0, arg2)) {
            this.field3702 = arg1.method792(0);
        }
        if (arg1.field1630 != null && class275.method1726(arg2, 0, this.field3646)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3635; var61++) {
                int var65 = arg1.field1630[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field3645 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3645[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3635; var63++) {
                int var64 = arg1.field1630[var8[var63]];
                if (var64 >= 0) {
                    this.field3645[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
