import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class241 extends class55 {

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field3552 = 0;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
    private boolean field3546 = false;

    @OriginalMember(owner = "client!mb", name = "zb", descriptor = "I")
    private int field3606 = 0;

    @OriginalMember(owner = "client!mb", name = "Cb", descriptor = "I")
    private int field3609 = 0;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    private int field3597 = 0;

    @OriginalMember(owner = "client!mb", name = "nc", descriptor = "I")
    private int field3646 = 0;

    @OriginalMember(owner = "client!mb", name = "vc", descriptor = "Z")
    private boolean field3654 = false;

    @OriginalMember(owner = "client!mb", name = "Cc", descriptor = "Z")
    private boolean field3661 = true;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lus;")
    private class1 field3579;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "Lrca;")
    private class423 field3559;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "Lrca;")
    private class423 field3554;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Lrca;")
    private class423 field3570;

    @OriginalMember(owner = "client!mb", name = "hc", descriptor = "Lrca;")
    private class423 field3640;

    @OriginalMember(owner = "client!mb", name = "wc", descriptor = "Ljj;")
    private class104 field3655;

    @OriginalMember(owner = "client!mb", name = "yc", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!mb", name = "Kb", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!mb", name = "Wb", descriptor = "[I")
    private int[] field3629;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "[I")
    private int[] field3562;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
    private int[] field3581;

    @OriginalMember(owner = "client!mb", name = "cc", descriptor = "[I")
    private int[] field3635;

    @OriginalMember(owner = "client!mb", name = "sc", descriptor = "[S")
    private short[] field3651;

    @OriginalMember(owner = "client!mb", name = "jc", descriptor = "[Laq;")
    private class146[] field3642;

    @OriginalMember(owner = "client!mb", name = "pc", descriptor = "[Ltk;")
    private class317[] field3648;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "[Ljd;")
    private class211[] field3557;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "[Lkba;")
    private class91[] field3600;

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "S")
    private short field3594;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "[S")
    private short[] field3589;

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "[S")
    private short[] field3598;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[S")
    private short[] field3547;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "[S")
    private short[] field3574;

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "[S")
    private short[] field3587;

    @OriginalMember(owner = "client!mb", name = "ac", descriptor = "[F")
    private float[] field3633;

    @OriginalMember(owner = "client!mb", name = "Ec", descriptor = "[S")
    private short[] field3663;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "[S")
    private short[] field3569;

    @OriginalMember(owner = "client!mb", name = "Ob", descriptor = "[S")
    private short[] field3621;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[S")
    private short[] field3548;

    @OriginalMember(owner = "client!mb", name = "Yb", descriptor = "[F")
    private float[] field3631;

    @OriginalMember(owner = "client!mb", name = "Pb", descriptor = "[B")
    private byte[] field3622;

    @OriginalMember(owner = "client!mb", name = "bc", descriptor = "S")
    private short field3634;

    @OriginalMember(owner = "client!mb", name = "gc", descriptor = "[B")
    private byte[] field3639;

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[S")
    private short[] field3568;

    @OriginalMember(owner = "client!mb", name = "mc", descriptor = "[I")
    private int[] field3645;

    @OriginalMember(owner = "client!mb", name = "yb", descriptor = "[[I")
    private int[][] field3605;

    @OriginalMember(owner = "client!mb", name = "Bb", descriptor = "[[I")
    private int[][] field3608;

    @OriginalMember(owner = "client!mb", name = "Ac", descriptor = "[[I")
    private int[][] field3659;

    @OriginalMember(owner = "client!mb", name = "dc", descriptor = "B")
    private byte field3636;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!mb", name = "vb", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!mb", name = "wb", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!mb", name = "xb", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!mb", name = "Ab", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!mb", name = "Db", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!mb", name = "Eb", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!mb", name = "Hb", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!mb", name = "Jb", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!mb", name = "Lb", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!mb", name = "Mb", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!mb", name = "Nb", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!mb", name = "Qb", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!mb", name = "Rb", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!mb", name = "Sb", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!mb", name = "Tb", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!mb", name = "Ub", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!mb", name = "Vb", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!mb", name = "Xb", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!mb", name = "ec", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!mb", name = "fc", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!mb", name = "ic", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!mb", name = "kc", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!mb", name = "lc", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!mb", name = "rc", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!mb", name = "tc", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!mb", name = "uc", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!mb", name = "xc", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!mb", name = "zc", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!mb", name = "Dc", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!mb", name = "oc", descriptor = "Lq;")
    public static class396 field3647;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Lel;")
    private class510 field3555;

    @OriginalMember(owner = "client!mb", name = "Zb", descriptor = "Lcv;")
    private class529 field3632;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "Lau;")
    private class685 field3563;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "S")
    private short field3553;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "S")
    private short field3560;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "S")
    private short field3578;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "S")
    private short field3591;

    @OriginalMember(owner = "client!mb", name = "Fb", descriptor = "S")
    private short field3612;

    @OriginalMember(owner = "client!mb", name = "Gb", descriptor = "S")
    private short field3613;

    @OriginalMember(owner = "client!mb", name = "qc", descriptor = "S")
    private short field3649;

    @OriginalMember(owner = "client!mb", name = "Bc", descriptor = "S")
    private short field3660;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()[Laq;")
    public final class146[] method348() {
        field3567++;
        return this.field3642;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()[Ltk;")
    public final class317[] method362() {
        field3650++;
        return this.field3648;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 25475) {
            this.method1606(93, 37, null, 15, -36, false);
        }
        field3662++;
        if (arg1 > arg5 && arg5 < arg3 && arg0 > arg5) {
            return false;
        } else if (arg1 < arg5 && arg5 > arg3 && arg0 < arg5) {
            return false;
        } else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg4) {
            return false;
        } else {
            return arg7 >= arg2 || arg8 >= arg2 || arg4 >= arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    private final void method1593(int arg0) {
        field3565++;
        if (this.field3552 == 0) {
            return;
        }
        if (~this.field3636 != arg0) {
            this.method1599(true, (byte) -100);
        }
        this.method1599(false, (byte) -100);
        if (this.field3655 != null) {
            if (this.field3655.field1845 == null) {
                this.method1600((byte) 84, (this.field3636 & 0x10) != 0);
            }
            if (this.field3655.field1845 != null) {
                this.field3579.method172(this.field3570 != null, 4);
                this.field3579.method184(this.field3554, this.field3559, this.field3640, this.field3570, (byte) 52);
                int var2 = this.field3645.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3645[var3];
                    int var5 = this.field3645[var3 + 1];
                    int var6 = this.field3589[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3579.method21(2, this.field3570 != null, var6);
                    this.field3579.method9(this.field3655.field1845, var4 * 3, 4, (byte) 90, (var5 - var4) * 3);
                }
            }
        }
        this.method1603((byte) 109);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method1594(boolean arg0) {
        field3647 = null;
        if (arg0) {
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method320(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        field3626++;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        int var8 = this.field3553 + arg4;
        int var9 = this.field3591 + arg4;
        int var10 = this.field3612 + arg6;
        int var11 = this.field3649 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field1041 <= (arg2.field1040 + var9 >> arg2.field1038) || var10 < 0 || arg2.field1040 + var11 >> arg2.field1038 >= arg2.field1043) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1040 + var9 >> arg3.field1038 >= arg3.field1041 || var10 < 0 || arg3.field1040 + var11 >> arg3.field1038 >= arg3.field1043) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1038;
            int var13 = var9 + arg2.field1040 - 1 >> arg2.field1038;
            int var14 = var10 >> arg2.field1038;
            int var15 = var11 + arg2.field1040 - 1 >> arg2.field1038;
            if (arg5 == arg2.method551(var12, var14, (byte) -97) && arg5 == arg2.method551(var13, var14, (byte) -121) && arg5 == arg2.method551(var12, var15, (byte) -114) && arg2.method551(var13, var15, (byte) -110) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field3606; var16++) {
                this.field3635[var16] = this.field3635[var16] + arg2.method552(1, this.field3581[var16] + arg4, this.field3562[var16] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field3660;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field3606; var18++) {
                int var19 = (this.field3635[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field3635[var18] -= -((arg2.method552(1, this.field3581[var18] + arg4, this.field3562[var18] + arg6) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = (arg1 >> 16 & 0xFF) << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || ((var20 >> 1) + arg2.field1040 + arg4) >= (arg2.field1041 << arg2.field1038) || arg6 - (var21 >> 1) < 0 || (arg2.field1043 << arg2.field1038) <= (arg2.field1040 + arg6 + (var21 >> 1))) {
                return;
            }
            this.method645(arg5, var22, var23, var21, var20, arg2, arg6, 0, arg4);
        } else if (arg0 == 4) {
            int var24 = this.field3560 - this.field3660;
            for (int var25 = 0; var25 < this.field3606; var25++) {
                this.field3635[var25] = var24 + this.field3635[var25] + arg3.method552(1, this.field3581[var25] + arg4, this.field3562[var25] - -arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var26 = this.field3560 - this.field3660;
            for (int var27 = 0; var27 < this.field3606; var27++) {
                int var28 = this.field3581[var27] + arg4;
                int var29 = this.field3562[var27] + arg6;
                int var30 = arg2.method552(1, var28, var29);
                int var31 = arg3.method552(1, var28, var29);
                int var32 = var30 - arg1 - var31;
                this.field3635[var27] = ((this.field3635[var27] << 8) / var26 * var32 >> 8) + var30 - arg5;
            }
        }
        this.field3654 = false;
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLmb;Lmb;ZII)Lda;")
    private final class55 method1595(boolean arg0, class241 arg1, class241 arg2, boolean arg3, int arg4, int arg5) {
        arg2.field3636 = 0;
        arg2.field3609 = this.field3609;
        arg2.field3583 = this.field3583;
        arg2.field3594 = this.field3594;
        arg2.field3606 = this.field3606;
        arg2.field3646 = this.field3646;
        arg2.field3634 = this.field3634;
        field3638++;
        if ((arg5 & 0x100) == 0) {
            arg2.field3546 = this.field3546;
        } else {
            arg2.field3546 = true;
        }
        arg2.field3617 = arg5;
        arg2.field3657 = this.field3657;
        arg2.field3552 = this.field3552;
        arg2.field3597 = this.field3597;
        boolean var7 = class478.method2905(-7484, arg5, this.field3657);
        boolean var8 = class167.method1268(this.field3657, arg5, 111);
        boolean var9 = class454.method2736((byte) -119, arg5, this.field3657);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg2.field3581 = this.field3581;
            } else if (arg1.field3581 == null || arg1.field3581.length < this.field3646) {
                arg2.field3581 = arg1.field3581 = new int[this.field3646];
            } else {
                arg2.field3581 = arg1.field3581;
            }
            if (!var8) {
                arg2.field3635 = this.field3635;
            } else if (arg1.field3635 == null || this.field3646 > arg1.field3635.length) {
                arg2.field3635 = arg1.field3635 = new int[this.field3646];
            } else {
                arg2.field3635 = arg1.field3635;
            }
            if (!var9) {
                arg2.field3562 = this.field3562;
            } else if (arg1.field3562 == null || arg1.field3562.length < this.field3646) {
                arg2.field3562 = arg1.field3562 = new int[this.field3646];
            } else {
                arg2.field3562 = arg1.field3562;
            }
            for (int var11 = 0; var11 < this.field3646; var11++) {
                if (var7) {
                    arg2.field3581[var11] = this.field3581[var11];
                }
                if (var8) {
                    arg2.field3635[var11] = this.field3635[var11];
                }
                if (var9) {
                    arg2.field3562[var11] = this.field3562[var11];
                }
            }
        } else {
            arg2.field3562 = this.field3562;
            arg2.field3635 = this.field3635;
            arg2.field3581 = this.field3581;
        }
        if (class637.method3635(this.field3657, arg5, (byte) 100)) {
            if (arg0) {
                arg2.field3636 = (byte) (arg2.field3636 | 0x1);
            }
            arg2.field3559 = arg1.field3559;
            arg2.field3559.field6120 = this.field3559.field6120;
            arg2.field3559.field6119 = this.field3559.field6119;
        } else if (class437.method2648((byte) 41, this.field3657, arg5)) {
            arg2.field3559 = this.field3559;
        } else {
            arg2.field3559 = null;
        }
        if (class183.method1340(arg4 + 523078, this.field3657, arg5)) {
            if (arg1.field3548 == null || arg1.field3548.length < this.field3597) {
                arg2.field3548 = arg1.field3548 = new short[this.field3597];
            } else {
                arg2.field3548 = arg1.field3548;
            }
            for (int var12 = 0; var12 < this.field3597; var12++) {
                arg2.field3548[var12] = this.field3548[var12];
            }
        } else {
            arg2.field3548 = this.field3548;
        }
        if (class284.method1876(arg5, this.field3657, 0)) {
            if (arg1.field3622 == null || arg1.field3622.length < this.field3597) {
                arg2.field3622 = arg1.field3622 = new byte[this.field3597];
            } else {
                arg2.field3622 = arg1.field3622;
            }
            for (int var13 = 0; var13 < this.field3597; var13++) {
                arg2.field3622[var13] = this.field3622[var13];
            }
        } else {
            arg2.field3622 = this.field3622;
        }
        if (class629.method3599(arg5, -126, this.field3657)) {
            if (arg0) {
                arg2.field3636 = (byte) (arg2.field3636 | 0x2);
            }
            arg2.field3640 = arg1.field3640;
            arg2.field3640.field6119 = this.field3640.field6119;
            arg2.field3640.field6120 = this.field3640.field6120;
        } else if (class597.method3399(arg5, (byte) 88, this.field3657)) {
            arg2.field3640 = this.field3640;
        } else {
            arg2.field3640 = null;
        }
        if (class594.method3395(this.field3657, arg5, false)) {
            if (arg1.field3587 == null || this.field3609 > arg1.field3587.length) {
                int var14 = this.field3609;
                arg2.field3621 = arg1.field3621 = new short[var14];
                arg2.field3587 = arg1.field3587 = new short[var14];
                arg2.field3663 = arg1.field3663 = new short[var14];
            } else {
                arg2.field3587 = arg1.field3587;
                arg2.field3621 = arg1.field3621;
                arg2.field3663 = arg1.field3663;
            }
            if (this.field3563 == null) {
                for (int var15 = 0; var15 < this.field3609; var15++) {
                    arg2.field3587[var15] = this.field3587[var15];
                    arg2.field3621[var15] = this.field3621[var15];
                    arg2.field3663[var15] = this.field3663[var15];
                }
            } else {
                if (arg1.field3563 == null) {
                    arg1.field3563 = new class685();
                }
                class685 var16 = arg2.field3563 = arg1.field3563;
                if (var16.field9714 == null || var16.field9714.length < this.field3609) {
                    int var17 = this.field3609;
                    var16.field9715 = new short[var17];
                    var16.field9718 = new byte[var17];
                    var16.field9716 = new short[var17];
                    var16.field9714 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field3609; var18++) {
                    arg2.field3587[var18] = this.field3587[var18];
                    arg2.field3621[var18] = this.field3621[var18];
                    arg2.field3663[var18] = this.field3663[var18];
                    var16.field9714[var18] = this.field3563.field9714[var18];
                    var16.field9716[var18] = this.field3563.field9716[var18];
                    var16.field9715[var18] = this.field3563.field9715[var18];
                    var16.field9718[var18] = this.field3563.field9718[var18];
                }
            }
            arg2.field3639 = this.field3639;
        } else {
            arg2.field3639 = this.field3639;
            arg2.field3563 = this.field3563;
            arg2.field3663 = this.field3663;
            arg2.field3587 = this.field3587;
            arg2.field3621 = this.field3621;
        }
        if (class634.method3614(this.field3657, arg5, arg4 - 17818)) {
            arg2.field3570 = arg1.field3570;
            if (arg0) {
                arg2.field3636 = (byte) (arg2.field3636 | 0x4);
            }
            arg2.field3570.field6120 = this.field3570.field6120;
            arg2.field3570.field6119 = this.field3570.field6119;
        } else if (class109.method984(arg5, this.field3657, (byte) 40)) {
            arg2.field3570 = this.field3570;
        } else {
            arg2.field3570 = null;
        }
        if (class562.method3210(55, this.field3657, arg5)) {
            if (arg1.field3631 == null || this.field3597 > arg1.field3631.length) {
                int var19 = this.field3609;
                arg2.field3633 = arg1.field3633 = new float[var19];
                arg2.field3631 = arg1.field3631 = new float[var19];
            } else {
                arg2.field3633 = arg1.field3633;
                arg2.field3631 = arg1.field3631;
            }
            for (int var20 = 0; var20 < this.field3609; var20++) {
                arg2.field3631[var20] = this.field3631[var20];
                arg2.field3633[var20] = this.field3633[var20];
            }
        } else {
            arg2.field3633 = this.field3633;
            arg2.field3631 = this.field3631;
        }
        if (class572.method3290(true, this.field3657, arg5)) {
            arg2.field3554 = arg1.field3554;
            if (arg0) {
                arg2.field3636 = (byte) (arg2.field3636 | 0x8);
            }
            arg2.field3554.field6119 = this.field3554.field6119;
            arg2.field3554.field6120 = this.field3554.field6120;
        } else if (class30.method500(this.field3657, arg4 - 17836, arg5)) {
            arg2.field3554 = this.field3554;
        } else {
            arg2.field3554 = null;
        }
        if (class314.method2037(-48, arg5, this.field3657)) {
            if (arg1.field3574 == null || arg1.field3574.length < this.field3597) {
                int var21 = this.field3597;
                arg2.field3547 = arg1.field3547 = new short[var21];
                arg2.field3574 = arg1.field3574 = new short[var21];
                arg2.field3598 = arg1.field3598 = new short[var21];
            } else {
                arg2.field3574 = arg1.field3574;
                arg2.field3598 = arg1.field3598;
                arg2.field3547 = arg1.field3547;
            }
            for (int var22 = 0; var22 < this.field3597; var22++) {
                arg2.field3574[var22] = this.field3574[var22];
                arg2.field3598[var22] = this.field3598[var22];
                arg2.field3547[var22] = this.field3547[var22];
            }
        } else {
            arg2.field3574 = this.field3574;
            arg2.field3598 = this.field3598;
            arg2.field3547 = this.field3547;
        }
        if (class677.method3808(arg5, 1, this.field3657)) {
            arg2.field3655 = arg1.field3655;
            if (arg0) {
                arg2.field3636 = (byte) (arg2.field3636 | 0x10);
            }
            arg2.field3655.field1845 = this.field3655.field1845;
        } else if (class414.method2529(95, this.field3657, arg5)) {
            arg2.field3655 = this.field3655;
        } else {
            arg2.field3655 = null;
        }
        if (class370.method2341(arg5, this.field3657, -31)) {
            if (arg1.field3589 == null || this.field3597 > arg1.field3589.length) {
                int var23 = this.field3597;
                arg2.field3589 = arg1.field3589 = new short[var23];
            } else {
                arg2.field3589 = arg1.field3589;
            }
            for (int var24 = 0; var24 < this.field3597; var24++) {
                arg2.field3589[var24] = this.field3589[var24];
            }
        } else {
            arg2.field3589 = this.field3589;
        }
        if (!class342.method2196(arg5, this.field3657, arg4 ^ 0xFFFF8EE8)) {
            arg2.field3600 = this.field3600;
        } else if (arg1.field3600 == null || arg1.field3600.length < this.field3583) {
            int var26 = this.field3583;
            arg2.field3600 = arg1.field3600 = new class91[var26];
            for (int var27 = 0; var27 < this.field3583; var27++) {
                arg2.field3600[var27] = this.field3600[var27].method880((byte) 119);
            }
        } else {
            arg2.field3600 = arg1.field3600;
            for (int var25 = 0; var25 < this.field3583; var25++) {
                arg2.field3600[var25].method883(0, this.field3600[var25]);
            }
        }
        arg2.field3557 = this.field3557;
        arg2.field3568 = this.field3568;
        arg2.field3569 = this.field3569;
        arg2.field3608 = this.field3608;
        arg2.field3629 = this.field3629;
        arg2.field3642 = this.field3642;
        arg2.field3648 = this.field3648;
        arg2.field3605 = this.field3605;
        if (this.field3654) {
            arg2.field3660 = this.field3660;
            arg2.field3649 = this.field3649;
            arg2.field3560 = this.field3560;
            arg2.field3613 = this.field3613;
            arg2.field3591 = this.field3591;
            arg2.field3654 = true;
            arg2.field3553 = this.field3553;
            arg2.field3612 = this.field3612;
            arg2.field3578 = this.field3578;
        } else {
            arg2.field3654 = false;
        }
        arg2.field3659 = this.field3659;
        arg2.field3645 = this.field3645;
        if (arg4 != 17722) {
            this.method1601(9);
        }
        arg2.field3651 = this.field3651;
        return arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lq;Lql;II)V")
    public final void method317(class396 arg0, class684 arg1, int arg2, int arg3) {
        field3627++;
        if (this.field3609 == 0) {
            return;
        }
        class422 var5 = this.field3579.field244;
        class422 var6 = (class422) arg0;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        class500.field7118 = var5.field6075 * var6.field6077 + var5.field6081 * var6.field6109 + var5.field6078 * var6.field6099 + var5.field6077;
        class408.field5907 = var5.field6075 * var6.field6081 + var5.field6081 * var6.field6079 + var5.field6078 * var6.field6102;
        float var7 = (float) this.field3660 * class408.field5907 + class500.field7118;
        float var8 = (float) this.field3560 * class408.field5907 + class500.field7118;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field3613) + var8;
            var10 = (float) this.field3613 + var7;
        } else {
            var10 = (float) this.field3613 + var8;
            var9 = var7 - (float) this.field3613;
        }
        if ((this.field3579.field272 <= var9) || ((float) this.field3579.field304 >= var10)) {
            return;
        }
        class136.field2420 = var5.field6100 * var6.field6081 + var5.field6102 * var6.field6079 + var5.field6101 * var6.field6102;
        class142.field2502 = var5.field6100 * var6.field6077 + var5.field6102 * var6.field6109 + var5.field6101 * var6.field6099 + var5.field6099;
        float var11 = (float) this.field3660 * class136.field2420 + class142.field2502;
        float var12 = (float) this.field3560 * class136.field2420 + class142.field2502;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = ((float) this.field3613 + var11) * (float) this.field3579.field310;
            var13 = (var12 - (float) this.field3613) * (float) this.field3579.field310;
        } else {
            var13 = (var11 - (float) this.field3613) * (float) this.field3579.field310;
            var14 = ((float) this.field3613 + var12) * (float) this.field3579.field310;
        }
        if ((this.field3579.field306 <= var13 / (float) arg2) || (this.field3579.field252 >= var14 / (float) arg2)) {
            return;
        }
        class550.field7800 = var5.field6083 * var6.field6077 + var5.field6112 * var6.field6099 + var5.field6079 * var6.field6109 + var5.field6109;
        class474.field6715 = var5.field6083 * var6.field6081 + var5.field6112 * var6.field6102 + var5.field6079 * var6.field6079;
        float var15 = (float) this.field3660 * class474.field6715 + class550.field7800;
        float var16 = (float) this.field3560 * class474.field6715 + class550.field7800;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = (var16 - (float) this.field3613) * (float) this.field3579.field327;
            var17 = ((float) this.field3613 + var15) * (float) this.field3579.field327;
        } else {
            var17 = ((float) this.field3613 + var16) * (float) this.field3579.field327;
            var18 = ((float) (-this.field3613) + var15) * (float) this.field3579.field327;
        }
        if ((this.field3579.field273 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field3579.field257)) {
            return;
        }
        if (arg1 != null || this.field3557 != null) {
            class288.field4292 = var5.field6083 * var6.field6078 + var5.field6112 * var6.field6101 + var5.field6079 * var6.field6112;
            class210.field3214 = var5.field6075 * var6.field6078 + var5.field6081 * var6.field6112 + var5.field6078 * var6.field6101;
            class203.field3123 = var5.field6100 * var6.field6078 + var5.field6102 * var6.field6112 + var5.field6101 * var6.field6101;
            class65.field1442 = var5.field6083 * var6.field6075 + var5.field6112 * var6.field6100 + var5.field6079 * var6.field6083;
            class228.field3408 = var5.field6100 * var6.field6075 + var5.field6102 * var6.field6083 + var5.field6101 * var6.field6100;
            class600.field8607 = var5.field6075 * var6.field6075 + var5.field6081 * var6.field6083 + var5.field6078 * var6.field6100;
        }
        if (arg1 != null) {
            int var19 = this.field3591 + this.field3553 >> 1;
            int var20 = this.field3649 + this.field3612 >> 1;
            int var21 = (int) ((float) var20 * class228.field3408 + (float) this.field3660 * class136.field2420 + (float) var19 * class203.field3123 + class142.field2502);
            int var22 = (int) ((float) var20 * class65.field1442 + (float) this.field3660 * class474.field6715 + (float) var19 * class288.field4292 + class550.field7800);
            int var23 = (int) ((float) var20 * class600.field8607 + (float) this.field3660 * class408.field5907 + (float) var19 * class210.field3214 + class500.field7118);
            int var24 = (int) ((float) var20 * class228.field3408 + (float) this.field3560 * class136.field2420 + (float) var19 * class203.field3123 + class142.field2502);
            int var25 = (int) ((float) var20 * class65.field1442 + (float) this.field3560 * class474.field6715 + (float) var19 * class288.field4292 + class550.field7800);
            arg1.field9710 = this.field3579.field327 * var22 / arg2 + this.field3579.field288;
            arg1.field9705 = this.field3579.field310 * var21 / arg2 + this.field3579.field291;
            arg1.field9706 = this.field3579.field291 + (this.field3579.field310 * var24 / arg2);
            arg1.field9708 = this.field3579.field327 * var25 / arg2 + this.field3579.field288;
            int var26 = (int) ((float) var20 * class600.field8607 + (float) this.field3560 * class408.field5907 + (float) var19 * class210.field3214 + class500.field7118);
            if (this.field3579.field304 <= var23 || this.field3579.field304 <= var26) {
                arg1.field9707 = true;
                arg1.field9709 = (this.field3613 + var21) * this.field3579.field310 / arg2 + this.field3579.field291 - arg1.field9705;
            }
        }
        this.field3579.method78(0, (float) arg2);
        this.field3579.method3(12787);
        this.field3579.method51(3042, var6);
        this.method1593(-1);
        this.field3579.method164(false);
        this.method1601(0);
    }

    @OriginalMember(owner = "client!mb", name = "fa", descriptor = "(I)V")
    public final void method344(int arg0) {
        field3601++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var7 = this.field3581[var4] * var3 + this.field3562[var4] * var2 >> 14;
            this.field3562[var4] = this.field3562[var4] * var3 - (this.field3581[var4] * var2) >> 14;
            this.field3581[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3609; var5++) {
            int var6 = this.field3663[var5] * var2 + this.field3587[var5] * var3 >> 14;
            this.field3663[var5] = (short) (this.field3663[var5] * var3 - (this.field3587[var5] * var2) >> 14);
            this.field3587[var5] = (short) var6;
        }
        if (this.field3570 == null && this.field3640 != null) {
            this.field3640.field6120 = null;
        }
        if (this.field3570 != null) {
            this.field3570.field6120 = null;
        }
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
        this.field3654 = false;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lffa;I)V")
    private final void method1596(class170 arg0, int arg1) {
        if (this.field3609 > this.field3579.field364.length) {
            this.field3579.field362 = new int[this.field3609];
            this.field3579.field364 = new int[this.field3609];
        }
        field3607++;
        int[] var3 = this.field3579.field364;
        int[] var4 = this.field3579.field362;
        for (int var5 = 0; var5 < this.field3606; var5++) {
            int var17 = (this.field3581[var5] - (this.field3635[var5] * this.field3579.field334 >> 8) >> this.field3579.field212) - arg0.field2825;
            int var18 = (this.field3562[var5] - (this.field3635[var5] * this.field3579.field330 >> 8) >> this.field3579.field212) - arg0.field2828;
            int var19 = this.field3629[var5];
            int var20 = this.field3629[var5 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field3569[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var3[var22] = var17;
                var4[var22] = var18;
            }
        }
        for (int var6 = 0; var6 < this.field3552; var6++) {
            if (this.field3622 == null || this.field3622[var6] <= 128) {
                short var8 = this.field3574[var6];
                short var9 = this.field3598[var6];
                short var10 = this.field3547[var6];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var3[var10];
                int var14 = var4[var8];
                int var15 = var4[var9];
                int var16 = var4[var10];
                if ((var11 - var12) * (var15 - var16) - (var13 - var12) * (var15 - var14) > 0) {
                    arg0.method1284(var15, var11, var14, var16, var13, 0, var12);
                }
            }
        }
        int var7 = -15 % ((-arg1 - 1) / 61);
    }

    @OriginalMember(owner = "client!mb", name = "KA", descriptor = "()I")
    public final int method369() {
        if (!this.field3654) {
            this.method1607(-2169);
        }
        field3580++;
        return this.field3553;
    }

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method316(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3558++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class367.field5441 = 0;
            class686.field9723 = 0;
            class370.field5496 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3605.length > var15) {
                    int[] var16 = this.field3605[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3651 == null || (this.field3651[var18] & arg6) != 0) {
                            class686.field9723 += this.field3581[var18];
                            class367.field5441 += this.field3635[var18];
                            class370.field5496 += this.field3562[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class370.field5496 = class370.field5496 / var13 + var11;
                class74.field1518 = true;
                class367.field5441 = class367.field5441 / var13 + var12;
                class686.field9723 = class686.field9723 / var13 + var10;
            } else {
                class367.field5441 = var12;
                class686.field9723 = var10;
                class370.field5496 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + (arg7[0] * arg2 - (-(arg7[1] * arg3) - 8192)) >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3605.length) {
                    int[] var27 = this.field3605[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3651 == null || (this.field3651[var29] & arg6) != 0) {
                            this.field3581[var29] += var22;
                            this.field3635[var29] += var23;
                            this.field3562[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field3605.length) {
                        int[] var50 = this.field3605[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3651 == null || (this.field3651[var52] & arg6) != 0) {
                                this.field3581[var52] -= class686.field9723;
                                this.field3635[var52] -= class367.field5441;
                                this.field3562[var52] -= class370.field5496;
                                if (arg4 != 0) {
                                    int var53 = class509.field7210[arg4];
                                    int var54 = class509.field7220[arg4];
                                    int var55 = this.field3635[var52] * var53 + this.field3581[var52] * var54 + 16383 >> 14;
                                    this.field3635[var52] = this.field3635[var52] * var54 + 16383 - (this.field3581[var52] * var53) >> 14;
                                    this.field3581[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class509.field7210[arg2];
                                    int var57 = class509.field7220[arg2];
                                    int var58 = this.field3635[var52] * var57 - (this.field3562[var52] * var56 - 16383) >> 14;
                                    this.field3562[var52] = this.field3635[var52] * var56 + this.field3562[var52] * var57 + 16383 >> 14;
                                    this.field3635[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class509.field7210[arg3];
                                    int var60 = class509.field7220[arg3];
                                    int var61 = this.field3581[var52] * var60 + (this.field3562[var52] * var59 + 16383) >> 14;
                                    this.field3562[var52] = this.field3562[var52] * var60 + 16383 - this.field3581[var52] * var59 >> 14;
                                    this.field3581[var52] = var61;
                                }
                                this.field3581[var52] += class686.field9723;
                                this.field3635[var52] += class367.field5441;
                                this.field3562[var52] += class370.field5496;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field3605.length > var32) {
                            int[] var33 = this.field3605[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3651 == null || (arg6 & this.field3651[var35]) != 0) {
                                    int var36 = this.field3629[var35];
                                    int var37 = this.field3629[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3569[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class509.field7210[arg4];
                                            int var41 = class509.field7220[arg4];
                                            int var42 = this.field3621[var39] * var40 + this.field3587[var39] * var41 + 16383 >> 14;
                                            this.field3621[var39] = (short) (this.field3621[var39] * var41 + 16383 - (this.field3587[var39] * var40) >> 14);
                                            this.field3587[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class509.field7210[arg2];
                                            int var44 = class509.field7220[arg2];
                                            int var45 = this.field3621[var39] * var44 + 16383 - this.field3663[var39] * var43 >> 14;
                                            this.field3663[var39] = (short) (this.field3663[var39] * var44 + this.field3621[var39] * var43 + 16383 >> 14);
                                            this.field3621[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class509.field7210[arg3];
                                            int var47 = class509.field7220[arg3];
                                            int var48 = this.field3663[var39] * var46 + (this.field3587[var39] * var47) + 16383 >> 14;
                                            this.field3663[var39] = (short) (this.field3663[var39] * var47 + 16383 - (this.field3587[var39] * var46) >> 14);
                                            this.field3587[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3570 == null && this.field3640 != null) {
                        this.field3640.field6120 = null;
                    }
                    if (this.field3570 != null) {
                        this.field3570.field6120 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class74.field1518) {
                    int var68 = arg7[0] * class686.field9723 + arg7[3] * class367.field5441 - (-(arg7[6] * class370.field5496) - 8192) >> 14;
                    int var69 = arg7[1] * class686.field9723 + arg7[7] * class370.field5496 + arg7[4] * class367.field5441 + 8192 >> 14;
                    int var70 = arg7[2] * class686.field9723 + (arg7[5] * class367.field5441) - (-(arg7[8] * class370.field5496) - 8192) >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    class367.field5441 = var71;
                    int var73 = var67 + var70;
                    class686.field9723 = var72;
                    class370.field5496 = var73;
                    class74.field1518 = false;
                }
                int[] var74 = new int[9];
                int var75 = class509.field7220[arg2];
                int var76 = class509.field7210[arg2];
                int var77 = class509.field7220[arg3];
                int var78 = class509.field7210[arg3];
                int var79 = class509.field7220[arg4];
                int var80 = class509.field7210[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[7] = var78 * var80 - (-(var77 * var81) - 8192) >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                int var83 = var74[0] * -class686.field9723 + var74[2] * -class370.field5496 + (var74[1] * -class367.field5441) + 8192 >> 14;
                int var84 = var74[3] * -class686.field9723 + var74[5] * -class370.field5496 + (var74[4] * -class367.field5441) + 8192 >> 14;
                int var85 = var74[7] * -class367.field5441 + var74[6] * -class686.field9723 + var74[8] * -class370.field5496 + 8192 >> 14;
                int var86 = var83 + class686.field9723;
                int var87 = class367.field5441 + var84;
                int var88 = var85 + class370.field5496;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 + var74[1] * var66 - (-(var74[2] * var67) - 8192) >> 14;
                int var92 = var74[5] * var67 + var74[3] * var65 - (-(var74[4] * var66) + -8192) >> 14;
                int var93 = var86 + var91;
                int var94 = var74[8] * var67 + var74[6] * var65 + var74[7] * var66 + 8192 >> 14;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[0] * var93 + arg7[1] * var95 + 8192 >> 14;
                int var100 = arg7[4] * var95 + arg7[3] * var93 + (arg7[5] * var96) + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[6] * var93 + (arg7[8] * var96) + arg7[7] * var95 + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field3605.length) {
                        int[] var107 = this.field3605[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3651 == null || (this.field3651[var109] & arg6) != 0) {
                                int var110 = this.field3635[var109] * var97[1] + this.field3581[var109] * var97[0] + (this.field3562[var109] * var97[2]) + 8192 >> 14;
                                int var111 = this.field3562[var109] * var97[5] + this.field3635[var109] * var97[4] + this.field3581[var109] * var97[3] + 8192 >> 14;
                                int var112 = var101 + var110;
                                int var113 = this.field3581[var109] * var97[6] + this.field3635[var109] * var97[7] + this.field3562[var109] * var97[8] + 8192 >> 14;
                                int var114 = var102 + var111;
                                this.field3581[var109] = var112;
                                int var115 = var104 + var113;
                                this.field3635[var109] = var114;
                                this.field3562[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3605.length) {
                        int[] var174 = this.field3605[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3651 == null || (this.field3651[var176] & arg6) != 0) {
                                this.field3581[var176] -= class686.field9723;
                                this.field3635[var176] -= class367.field5441;
                                this.field3562[var176] -= class370.field5496;
                                this.field3581[var176] = this.field3581[var176] * arg2 >> 7;
                                this.field3635[var176] = this.field3635[var176] * arg3 >> 7;
                                this.field3562[var176] = this.field3562[var176] * arg4 >> 7;
                                this.field3581[var176] += class686.field9723;
                                this.field3635[var176] += class367.field5441;
                                this.field3562[var176] += class370.field5496;
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
                if (class74.field1518) {
                    int var128 = arg7[3] * class367.field5441 + arg7[0] * class686.field9723 - (-(arg7[6] * class370.field5496) + -8192) >> 14;
                    int var129 = arg7[7] * class370.field5496 + arg7[1] * class686.field9723 + arg7[4] * class367.field5441 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[2] * class686.field9723 + arg7[8] * class370.field5496 + (arg7[5] * class367.field5441) + 8192 >> 14;
                    int var133 = var127 + var132;
                    class367.field5441 = var130;
                    class686.field9723 = var131;
                    class370.field5496 = var133;
                    class74.field1518 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class686.field9723 * var134 + 8192 >> 14;
                int var138 = -class367.field5441 * var135 + 8192 >> 14;
                int var139 = -class370.field5496 * var136 + 8192 >> 14;
                int var140 = class686.field9723 + var137;
                int var141 = var138 + class367.field5441;
                int var142 = var139 + class370.field5496;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var140 + var144;
                int var147 = var141 + var145;
                int var148 = var127 * var136 + 8192 >> 14;
                int var149 = var142 + var148;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += var143[var169 + (var171 * 3)] * arg7[var151 * 3 + var171];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[0] * var146 + arg7[2] * var149 + (arg7[1] * var147) + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var146 + (arg7[4] * var147) + 8192 >> 14;
                int var154 = arg7[8] * var149 + arg7[7] * var147 + arg7[6] * var146 + 8192 >> 14;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field3605.length > var159) {
                        int[] var160 = this.field3605[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field3651 == null || (this.field3651[var162] & arg6) != 0) {
                                int var163 = this.field3581[var162] * var150[0] + this.field3635[var162] * var150[1] + this.field3562[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field3581[var162] * var150[3] + (this.field3635[var162] * var150[4]) + (this.field3562[var162] * var150[5] - -8192) >> 14;
                                int var165 = var156 + var164;
                                int var166 = var155 + var163;
                                int var167 = this.field3635[var162] * var150[7] + this.field3581[var162] * var150[6] + this.field3562[var162] * var150[8] + 8192 >> 14;
                                int var168 = var157 + var167;
                                this.field3581[var162] = var166;
                                this.field3635[var162] = var165;
                                this.field3562[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3659 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field3659.length > var181) {
                        int[] var182 = this.field3659[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3568 == null || (arg6 & this.field3568[var184]) != 0) {
                                int var185 = (this.field3622[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3622[var184] = (byte) var185;
                                if (this.field3640 != null) {
                                    this.field3640.field6120 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3557 != null) {
                    for (int var178 = 0; var178 < this.field3583; var178++) {
                        class211 var179 = this.field3557[var178];
                        class91 var180 = this.field3600[var178];
                        var180.field1661 = var180.field1661 & 0xFFFFFF | 255 - (this.field3622[var179.field3233] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3659 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field3659.length) {
                        int[] var191 = this.field3659[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3568 == null || (this.field3568[var193] & arg6) != 0) {
                                int var194 = this.field3548[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC87) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3548[var193] = (short) class2.method189(class2.method189(var197 << 7, var199 << 10), var200);
                                if (this.field3640 != null) {
                                    this.field3640.field6120 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3557 != null) {
                    for (int var187 = 0; var187 < this.field3583; var187++) {
                        class211 var188 = this.field3557[var187];
                        class91 var189 = this.field3600[var187];
                        var189.field1661 = class492.field7038[this.field3548[var188.field3233] & 0xFFFF] & 0xFFFFFF | var189.field1661 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3608 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field3608.length) {
                        int[] var203 = this.field3608[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class91 var205 = this.field3600[var203[var204]];
                            var205.field1667 += arg2;
                            var205.field1662 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3608 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field3608.length) {
                        int[] var208 = this.field3608[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class91 var210 = this.field3600[var208[var209]];
                            var210.field1657 = var210.field1657 * arg2 >> 7;
                            var210.field1660 = var210.field1660 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3608 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3608.length) {
                    int[] var213 = this.field3608[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class91 var215 = this.field3600[var213[var214]];
                        var215.field1666 = var215.field1666 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method357(byte arg0, int arg1, boolean arg2) {
        field3564++;
        class241 var4;
        class241 var5;
        if (arg0 == 1) {
            var4 = this.field3579.field280;
            var5 = this.field3579.field351;
        } else if (arg0 == 2) {
            var4 = this.field3579.field264;
            var5 = this.field3579.field293;
        } else if (arg0 == 3) {
            var5 = this.field3579.field313;
            var4 = this.field3579.field335;
        } else if (arg0 == 4) {
            var4 = this.field3579.field354;
            var5 = this.field3579.field279;
        } else if (arg0 == 5) {
            var5 = this.field3579.field356;
            var4 = this.field3579.field250;
        } else {
            var4 = var5 = new class241(this.field3579);
        }
        return this.method1595(arg0 != 0, var5, var4, arg2, 17722, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
    public final void method312() {
        field3577++;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        field3599++;
        class194.method1397((long) class336.field5031, class623.field9017, 0);
        if (class361.field5368 != -1) {
            class437.method2647(1, class361.field5368);
        }
        for (int var1 = 0; var1 < class152.field2587; var1++) {
            if (class248.field3731[var1]) {
                class480.field6901[var1] = true;
            }
            class338.field5050[var1] = class248.field3731[var1];
            class248.field3731[var1] = false;
        }
        class545.field7632 = class336.field5031;
        if (class361.field5368 != arg0) {
            class152.field2587 = 0;
            class363.method2309((byte) 110);
        }
        class623.field9017.method107();
        class461.method2760(arg0 + 2, class623.field9017);
        int var2 = class141.method1143(0);
        if (var2 == -1) {
            var2 = class139.field2461;
        }
        if (var2 == -1) {
            var2 = class617.field8961;
        }
        class605.method3474(var2, 23637);
        class620.field8990 = 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method318(int arg0, int arg1, class396 arg2, boolean arg3, int arg4) {
        field3653++;
        return this.method1606(arg1, arg4, arg2, -999999, arg0, arg3);
    }

    @OriginalMember(owner = "client!mb", name = "ga", descriptor = "(I)V")
    public final void method308(int arg0) {
        if (this.field3640 != null) {
            this.field3640.field6120 = null;
        }
        field3623++;
        this.field3594 = (short) arg0;
        if (this.field3570 != null) {
            this.field3570.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method325(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3585++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class370.field5496 = 0;
            class686.field9723 = 0;
            int var12 = 0;
            class367.field5441 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3605.length) {
                    int[] var15 = this.field3605[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class686.field9723 += this.field3581[var17];
                        class367.field5441 += this.field3635[var17];
                        var12++;
                        class370.field5496 += this.field3562[var17];
                    }
                }
            }
            if (var12 > 0) {
                class686.field9723 = class686.field9723 / var12 + var9;
                class370.field5496 = class370.field5496 / var12 + var10;
                class367.field5441 = class367.field5441 / var12 + var11;
            } else {
                class370.field5496 = var10;
                class367.field5441 = var11;
                class686.field9723 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field3605.length > var22) {
                    int[] var23 = this.field3605[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3581[var25] += var18;
                        this.field3635[var25] += var20;
                        this.field3562[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3605.length > var45) {
                    int[] var46 = this.field3605[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3581[var59] -= class686.field9723;
                            this.field3635[var59] -= class367.field5441;
                            this.field3562[var59] -= class370.field5496;
                            if (arg4 != 0) {
                                int var60 = class509.field7210[arg4];
                                int var61 = class509.field7220[arg4];
                                int var62 = this.field3635[var59] * var60 - (-(this.field3581[var59] * var61) - 16383) >> 14;
                                this.field3635[var59] = this.field3635[var59] * var61 + 16383 - (this.field3581[var59] * var60) >> 14;
                                this.field3581[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class509.field7210[arg2];
                                int var64 = class509.field7220[arg2];
                                int var65 = this.field3635[var59] * var64 + 16383 - this.field3562[var59] * var63 >> 14;
                                this.field3562[var59] = this.field3635[var59] * var63 + this.field3562[var59] * var64 + 16383 >> 14;
                                this.field3635[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class509.field7210[arg3];
                                int var67 = class509.field7220[arg3];
                                int var68 = this.field3581[var59] * var67 + this.field3562[var59] * var66 + 16383 >> 14;
                                this.field3562[var59] = this.field3562[var59] * var67 + 16383 - (this.field3581[var59] * var66) >> 14;
                                this.field3581[var59] = var68;
                            }
                            this.field3581[var59] += class686.field9723;
                            this.field3635[var59] += class367.field5441;
                            this.field3562[var59] += class370.field5496;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3581[var48] -= class686.field9723;
                            this.field3635[var48] -= class367.field5441;
                            this.field3562[var48] -= class370.field5496;
                            if (arg2 != 0) {
                                int var49 = class509.field7210[arg2];
                                int var50 = class509.field7220[arg2];
                                int var51 = this.field3635[var48] * var50 + 16383 - (this.field3562[var48] * var49) >> 14;
                                this.field3562[var48] = this.field3635[var48] * var49 + this.field3562[var48] * var50 + 16383 >> 14;
                                this.field3635[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class509.field7210[arg4];
                                int var53 = class509.field7220[arg4];
                                int var54 = this.field3635[var48] * var52 + (this.field3581[var48] * var53) + 16383 >> 14;
                                this.field3635[var48] = this.field3635[var48] * var53 + 16383 - this.field3581[var48] * var52 >> 14;
                                this.field3581[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class509.field7210[arg3];
                                int var56 = class509.field7220[arg3];
                                int var57 = this.field3562[var48] * var55 + this.field3581[var48] * var56 + 16383 >> 14;
                                this.field3562[var48] = this.field3562[var48] * var56 + 16383 - this.field3581[var48] * var55 >> 14;
                                this.field3581[var48] = var57;
                            }
                            this.field3581[var48] += class686.field9723;
                            this.field3635[var48] += class367.field5441;
                            this.field3562[var48] += class370.field5496;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field3605.length) {
                        int[] var29 = this.field3605[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3629[var31];
                            int var33 = this.field3629[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3569[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class509.field7210[arg4];
                                    int var37 = class509.field7220[arg4];
                                    int var38 = this.field3621[var35] * var36 + this.field3587[var35] * var37 + 16383 >> 14;
                                    this.field3621[var35] = (short) (this.field3621[var35] * var37 + 16383 - (this.field3587[var35] * var36) >> 14);
                                    this.field3587[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class509.field7210[arg2];
                                    int var40 = class509.field7220[arg2];
                                    int var41 = this.field3621[var35] * var40 + 16383 - (this.field3663[var35] * var39) >> 14;
                                    this.field3663[var35] = (short) (this.field3621[var35] * var39 + this.field3663[var35] * var40 + 16383 >> 14);
                                    this.field3621[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class509.field7210[arg3];
                                    int var43 = class509.field7220[arg3];
                                    int var44 = this.field3663[var35] * var42 + this.field3587[var35] * var43 + 16383 >> 14;
                                    this.field3663[var35] = (short) (this.field3663[var35] * var43 + 16383 - (this.field3587[var35] * var42) >> 14);
                                    this.field3587[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3570 == null && this.field3640 != null) {
                    this.field3640.field6120 = null;
                }
                if (this.field3570 != null) {
                    this.field3570.field6120 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field3605.length > var70) {
                    int[] var71 = this.field3605[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3581[var73] -= class686.field9723;
                        this.field3635[var73] -= class367.field5441;
                        this.field3562[var73] -= class370.field5496;
                        this.field3581[var73] = this.field3581[var73] * arg2 >> 7;
                        this.field3635[var73] = this.field3635[var73] * arg3 >> 7;
                        this.field3562[var73] = this.field3562[var73] * arg4 >> 7;
                        this.field3581[var73] += class686.field9723;
                        this.field3635[var73] += class367.field5441;
                        this.field3562[var73] += class370.field5496;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3659 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field3659.length > var78) {
                        int[] var79 = this.field3659[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3622[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3622[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3640 != null) {
                            this.field3640.field6120 = null;
                        }
                    }
                }
                if (this.field3557 != null) {
                    for (int var75 = 0; var75 < this.field3583; var75++) {
                        class211 var76 = this.field3557[var75];
                        class91 var77 = this.field3600[var75];
                        var77.field1661 = var77.field1661 & 0xFFFFFF | 255 - (this.field3622[var76.field3233] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3659 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field3659.length > var87) {
                        int[] var88 = this.field3659[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3548[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC57) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3548[var90] = (short) class2.method189(class2.method189(var95 << 10, var96 << 7), var97);
                        }
                        if (var88.length > 0 && this.field3640 != null) {
                            this.field3640.field6120 = null;
                        }
                    }
                }
                if (this.field3557 != null) {
                    for (int var84 = 0; var84 < this.field3583; var84++) {
                        class211 var85 = this.field3557[var84];
                        class91 var86 = this.field3600[var84];
                        var86.field1661 = var86.field1661 & 0xFF000000 | class492.field7038[this.field3548[var85.field3233] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3608 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field3608.length > var99) {
                        int[] var100 = this.field3608[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class91 var102 = this.field3600[var100[var101]];
                            var102.field1662 += arg3;
                            var102.field1667 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3608 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field3608.length) {
                        int[] var105 = this.field3608[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class91 var107 = this.field3600[var105[var106]];
                            var107.field1657 = var107.field1657 * arg2 >> 7;
                            var107.field1660 = var107.field1660 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3608 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field3608.length > var109) {
                    int[] var110 = this.field3608[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class91 var112 = this.field3600[var110[var111]];
                        var112.field1666 = var112.field1666 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method1598(byte arg0) {
        field3652++;
        class287 var1 = class33.field964;
        synchronized (class33.field964) {
            class33.field964.method1913(true);
            if (arg0 >= -35) {
                method1594(true);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "()Z")
    public final boolean method341() {
        field3549++;
        if (this.field3605 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3646; var1++) {
            this.field3581[var1] <<= 0x4;
            this.field3635[var1] <<= 0x4;
            this.field3562[var1] <<= 0x4;
        }
        class367.field5441 = 0;
        class686.field9723 = 0;
        class370.field5496 = 0;
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "DA", descriptor = "(SS)V")
    public final void method364(short arg0, short arg1) {
        field3556++;
        class214 var3 = this.field3579.field2768;
        for (int var4 = 0; var4 < this.field3597; var4++) {
            if (this.field3589[var4] == arg0) {
                this.field3589[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class699 var7 = var3.method1500(arg0 & 0xFFFF, -10);
            var5 = var7.field9843;
            var6 = var7.field9838;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class699 var10 = var3.method1500(arg1 & 0xFFFF, -10);
            var8 = var10.field9843;
            var9 = var10.field9838;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3557 != null) {
            for (int var11 = 0; var11 < this.field3583; var11++) {
                class211 var12 = this.field3557[var11];
                class91 var13 = this.field3600[var11];
                var13.field1661 = class492.field7038[this.field3548[var12.field3233] & 0xFFFF] & 0xFFFFFF | var13.field1661 & 0xFF000000;
            }
        }
        if (this.field3640 != null) {
            this.field3640.field6120 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method358(int arg0, int arg1, class396 arg2, boolean arg3) {
        field3644++;
        return this.method1606(arg1, -1, arg2, -999999, arg0, arg3);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZB)V")
    private final void method1599(boolean arg0, byte arg1) {
        field3641++;
        boolean var3 = this.field3640 != null && this.field3640.field6120 == null;
        boolean var4 = this.field3570 != null && this.field3570.field6120 == null;
        boolean var5 = this.field3559 != null && this.field3559.field6120 == null;
        boolean var6 = this.field3554 != null && this.field3554.field6120 == null;
        if (arg0) {
            var4 &= (this.field3636 & 0x4) != 0;
            var5 &= (this.field3636 & 0x1) != 0;
            var6 &= (this.field3636 & 0x8) != 0;
            var3 &= (this.field3636 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -100) {
            this.field3649 = -21;
        }
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
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
        if (this.field3579.field333.field1397.length < (this.field3609 * var7)) {
            this.field3579.field333 = new class424((this.field3609 + 100) * var7);
        } else {
            this.field3579.field333.field1393 = 0;
        }
        class424 var12 = this.field3579.field333;
        if (var5) {
            if (this.field3579.field267) {
                for (int var13 = 0; var13 < this.field3606; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field3581[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field3635[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field3562[var13]);
                    int var17 = this.field3629[var13];
                    int var18 = this.field3629[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3569[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1393 = var7 * var20;
                        var12.method715(var14, 1949991176);
                        var12.method715(var15, 1949991176);
                        var12.method715(var16, arg1 ^ 0x8BC57E94);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3606; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field3581[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field3635[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field3562[var21]);
                    int var25 = this.field3629[var21];
                    int var26 = this.field3629[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3569[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1393 = var7 * var28;
                        var12.method716(114, var22);
                        var12.method716(42, var23);
                        var12.method716(44, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3570 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field3563 == null) {
                    var29 = this.field3587;
                    var30 = this.field3639;
                    var31 = this.field3663;
                    var32 = this.field3621;
                } else {
                    var29 = this.field3563.field9714;
                    var32 = this.field3563.field9716;
                    var30 = this.field3563.field9718;
                    var31 = this.field3563.field9715;
                }
                float var33 = this.field3579.field268[0];
                float var34 = this.field3579.field268[1];
                float var35 = this.field3579.field268[2];
                float var36 = this.field3579.field296;
                float var37 = this.field3579.field300 * 768.0F / (float) this.field3594;
                float var38 = this.field3579.field338 * 768.0F / (float) this.field3594;
                for (int var39 = 0; var39 < this.field3597; var39++) {
                    int var40 = this.method1604(this.field3548[var39], this.field3589[var39], this.field3622[var39], this.field3634, 0);
                    short var41 = this.field3574[var39];
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field3579.field290;
                    float var43 = (float) ((var40 & 0xFFA43B) >> 16) * this.field3579.field319;
                    float var44 = (float) (var40 >>> 24) * this.field3579.field321;
                    short var45 = (short) var30[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var41] * var35 + (float) var29[var41] * var33 + (float) var32[var41] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var41] * var35 + (float) var29[var41] * var33 + (float) var32[var41] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var46 * ((var46 < 0.0F) ? var38 : var37) + var36;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    var12.field1393 = var9 + (var7 * var41);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method693((byte) 106, var48);
                    var12.method693((byte) 106, var49);
                    var12.method693((byte) 106, var50);
                    var12.method693((byte) 106, 255 - (this.field3622[var39] & 0xFF));
                    short var51 = this.field3598[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                    int var55 = (int) (var44 * var54);
                    int var56 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field1393 = var7 * var51 + var9;
                    var12.method693((byte) 106, var55);
                    var12.method693((byte) 106, var56);
                    var12.method693((byte) 106, var57);
                    var12.method693((byte) 106, 255 - (this.field3622[var39] & 0xFF));
                    short var58 = this.field3547[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * ((var60 < 0.0F) ? var38 : var37);
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field1393 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method693((byte) 106, var62);
                    var12.method693((byte) 106, var63);
                    var12.method693((byte) 106, var64);
                    var12.method693((byte) 106, 255 - (this.field3622[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field3597; var65++) {
                    int var66 = this.method1604(this.field3548[var65], this.field3589[var65], this.field3622[var65], this.field3634, 0);
                    var12.field1393 = this.field3574[var65] * var7 + var9;
                    var12.method715(var66, 1949991176);
                    var12.field1393 = this.field3598[var65] * var7 + var9;
                    var12.method715(var66, 1949991176);
                    var12.field1393 = this.field3547[var65] * var7 + var9;
                    var12.method715(var66, arg1 ^ 0x8BC57E94);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field3563 == null) {
                var70 = this.field3621;
                var68 = this.field3663;
                var67 = this.field3587;
                var69 = this.field3639;
            } else {
                var67 = this.field3563.field9714;
                var68 = this.field3563.field9715;
                var69 = this.field3563.field9718;
                var70 = this.field3563.field9716;
            }
            float var71 = 3.0F / (float) this.field3594;
            float var72 = 3.0F / (float) (this.field3594 / 2 + this.field3594);
            var12.field1393 = var10;
            if (this.field3579.field267) {
                for (int var76 = 0; var76 < this.field3609; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2583((float) var67[var76] * var72, -119);
                        var12.method2583((float) var70[var76] * var72, arg1 ^ 0x1E);
                        var12.method2583((float) var68[var76] * var72, -90);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2583((float) var67[var76] * var78, -88);
                        var12.method2583((float) var70[var76] * var78, arg1 + 10);
                        var12.method2583((float) var68[var76] * var78, -105);
                    }
                    var12.field1393 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3609; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2584(0, (float) var67[var73] * var72);
                        var12.method2584(0, (float) var70[var73] * var72);
                        var12.method2584(0, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2584(0, (float) var67[var73] * var75);
                        var12.method2584(0, (float) var70[var73] * var75);
                        var12.method2584(0, (float) var68[var73] * var75);
                    }
                    var12.field1393 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1393 = var11;
            if (this.field3579.field267) {
                for (int var80 = 0; var80 < this.field3609; var80++) {
                    var12.method2583(this.field3631[var80], -125);
                    var12.method2583(this.field3633[var80], arg1 + 24);
                    var12.field1393 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field3609; var79++) {
                    var12.method2584(0, this.field3631[var79]);
                    var12.method2584(arg1 ^ 0xFFFFFF9C, this.field3633[var79]);
                    var12.field1393 += var7 - 8;
                }
            }
        }
        var12.field1393 = this.field3609 * var7;
        class510 var81;
        if (arg0) {
            if (this.field3555 == null) {
                this.field3555 = this.field3579.method49(var12.field1397, var7, var12.field1393, true, 11645);
            } else {
                this.field3555.method2000(var12.field1397, var12.field1393, var7, (byte) -114);
            }
            var81 = this.field3555;
            this.field3636 = 0;
        } else {
            var81 = this.field3579.method49(var12.field1397, var7, var12.field1393, false, 11645);
            this.field3661 = true;
        }
        if (var5) {
            this.field3559.field6120 = var81;
            this.field3559.field6119 = var8;
        }
        if (var6) {
            this.field3554.field6120 = var81;
            this.field3554.field6119 = var11;
        }
        if (var3) {
            this.field3640.field6119 = var9;
            this.field3640.field6120 = var81;
        }
        if (var4) {
            this.field3570.field6119 = var10;
            this.field3570.field6120 = var81;
        }
    }

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "(I)V")
    public final void method366(int arg0) {
        field3590++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3635[var4] * var2 + (this.field3581[var4] * var3) >> 14;
            this.field3635[var4] = this.field3635[var4] * var3 - (this.field3581[var4] * var2) >> 14;
            this.field3581[var4] = var5;
        }
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
        this.field3654 = false;
    }

    @OriginalMember(owner = "client!mb", name = "PA", descriptor = "()I")
    public final int method352() {
        field3593++;
        return this.field3617;
    }

    @OriginalMember(owner = "client!mb", name = "RA", descriptor = "()I")
    public final int method368() {
        if (!this.field3654) {
            this.method1607(-2169);
        }
        field3630++;
        return this.field3578;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)V")
    private final void method1600(byte arg0, boolean arg1) {
        if ((this.field3552 * 6) <= this.field3579.field333.field1397.length) {
            this.field3579.field333.field1393 = 0;
        } else {
            this.field3579.field333 = new class424(this.field3552 * 6 + 600);
        }
        field3596++;
        class424 var3 = this.field3579.field333;
        if (this.field3579.field267) {
            for (int var4 = 0; var4 < this.field3552; var4++) {
                var3.method745(this.field3574[var4], arg0 + 44);
                var3.method745(this.field3598[var4], 128);
                var3.method745(this.field3547[var4], 128);
            }
        } else {
            for (int var5 = 0; var5 < this.field3552; var5++) {
                var3.method689(this.field3574[var5], true);
                var3.method689(this.field3598[var5], true);
                var3.method689(this.field3547[var5], true);
            }
        }
        if (arg0 != 84) {
            this.field3570 = null;
        }
        if (var3.field1393 == 0) {
            return;
        }
        if (arg1) {
            if (this.field3632 == null) {
                this.field3632 = this.field3579.method150(true, 5123, var3.field1397, 79, var3.field1393);
            } else {
                this.field3632.method263(arg0 ^ 0xFFFFFFC5, var3.field1397, var3.field1393, 5123);
            }
            this.field3655.field1845 = this.field3632;
        } else {
            this.field3655.field1845 = this.field3579.method150(false, 5123, var3.field1397, 47, var3.field1393);
        }
        if (!arg1) {
            this.field3661 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "(I)V")
    public final void method349(int arg0) {
        field3550++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3581[var4] * var3 + this.field3562[var4] * var2 >> 14;
            this.field3562[var4] = this.field3562[var4] * var3 - (this.field3581[var4] * var2) >> 14;
            this.field3581[var4] = var5;
        }
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
        this.field3654 = false;
    }

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "(I)V")
    public final void method310(int arg0) {
        field3656++;
        if (this.field3640 != null) {
            this.field3640.field6120 = null;
        }
        this.field3634 = (short) arg0;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(SS)V")
    public final void method365(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3597; var3++) {
            if (this.field3548[var3] == arg0) {
                this.field3548[var3] = arg1;
            }
        }
        field3592++;
        if (this.field3557 != null) {
            for (int var4 = 0; var4 < this.field3583; var4++) {
                class211 var5 = this.field3557[var4];
                class91 var6 = this.field3600[var4];
                var6.field1661 = var6.field1661 & 0xFF000000 | class492.field7038[this.field3548[var5.field3233] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3640 != null) {
            this.field3640.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "FA", descriptor = "()V")
    public final void method340() {
        field3624++;
        for (int var1 = 0; var1 < this.field3606; var1++) {
            this.field3562[var1] = -this.field3562[var1];
        }
        for (int var2 = 0; var2 < this.field3609; var2++) {
            this.field3663[var2] = (short) (-this.field3663[var2]);
        }
        for (int var3 = 0; var3 < this.field3597; var3++) {
            short var4 = this.field3574[var3];
            this.field3574[var3] = this.field3547[var3];
            this.field3547[var3] = var4;
        }
        if (this.field3570 == null && this.field3640 != null) {
            this.field3640.field6120 = null;
        }
        if (this.field3570 != null) {
            this.field3570.field6120 = null;
        }
        if (this.field3655 != null) {
            this.field3655.field1845 = null;
        }
        this.field3654 = false;
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "(Lha;)Lha;")
    public final class54 method311(class54 arg0) {
        field3616++;
        if (this.field3609 == 0) {
            return null;
        }
        if (!this.field3654) {
            this.method1607(-2169);
        }
        int var2;
        int var3;
        if (this.field3579.field334 > 0) {
            var2 = this.field3553 - (this.field3579.field334 * this.field3560 >> 8) >> this.field3579.field212;
            var3 = this.field3591 - (this.field3579.field334 * this.field3660 >> 8) >> this.field3579.field212;
        } else {
            var2 = this.field3553 - (this.field3579.field334 * this.field3660 >> 8) >> this.field3579.field212;
            var3 = this.field3591 - (this.field3579.field334 * this.field3560 >> 8) >> this.field3579.field212;
        }
        int var4;
        int var5;
        if (this.field3579.field330 > 0) {
            var4 = this.field3612 - (this.field3579.field330 * this.field3560 >> 8) >> this.field3579.field212;
            var5 = this.field3649 - (this.field3579.field330 * this.field3660 >> 8) >> this.field3579.field212;
        } else {
            var4 = this.field3612 - (this.field3579.field330 * this.field3660 >> 8) >> this.field3579.field212;
            var5 = this.field3649 - (this.field3579.field330 * this.field3560 >> 8) >> this.field3579.field212;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class170 var8 = (class170) arg0;
        class170 var9;
        if (var8 != null && var8.method1285(var7, var6, -126)) {
            var9 = var8;
            var8.method1289(52);
        } else {
            var9 = new class170(this.field3579, var6, var7);
        }
        var9.method1286(var4, 64, var5, var2, var3);
        this.method1596(var9, 72);
        return var9;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    private final void method1601(int arg0) {
        if (arg0 != 0) {
            this.method352();
        }
        if (this.field3557 != null) {
            class422 var2 = this.field3579.field208;
            this.field3579.method20(-65);
            this.field3579.method81(false);
            this.field3579.method172(false, 4);
            this.field3579.method184(this.field3579.field253, this.field3579.field286, null, null, (byte) 71);
            for (int var3 = 0; var3 < this.field3583; var3++) {
                class211 var4 = this.field3557[var3];
                class91 var5 = this.field3600[var3];
                if (!var4.field3234 || !this.field3579.method162()) {
                    float var6 = (float) (this.field3581[var4.field3238] + this.field3581[var4.field3237] + this.field3581[var4.field3240]) * 0.3333333F;
                    float var7 = (float) (this.field3635[var4.field3238] + this.field3635[var4.field3237] + this.field3635[var4.field3240]) * 0.3333333F;
                    float var8 = (float) (this.field3562[var4.field3240] + this.field3562[var4.field3238] + this.field3562[var4.field3237]) * 0.3333333F;
                    float var9 = class228.field3408 * var8 + class203.field3123 * var6 + class136.field2420 * var7 + class142.field2502;
                    float var10 = class65.field1442 * var8 + class474.field6715 * var7 + class288.field4292 * var6 + class550.field7800;
                    float var11 = class600.field8607 * var8 + class408.field5907 * var7 + class210.field3214 * var6 + class500.field7118;
                    var2.method2573((float) var5.field1662 - var10, false, var4.field3231 * var5.field1657 >> 7, var4.field3228 * var5.field1660 >> 7, (float) var4.field3235 - var11, (float) var5.field1667 + var9, var5.field1666);
                    this.field3579.method30(-32754, var2);
                    int var12 = var5.field1661;
                    OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                    this.field3579.method161(-45, var4.field3236);
                    this.field3579.method7(var4.field3229, (byte) 76);
                    this.field3579.method91(7, (byte) -73, 0, 4);
                }
            }
            this.field3579.method81(true);
            this.field3579.method164(false);
        }
        field3584++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljq;[Lpm;B)Lkg;")
    public static final class249 method1602(class475 arg0, class542[] arg1, byte arg2) {
        field3576++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field7563 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg2 <= 103) {
            field3647 = null;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field7563);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class143.field2507, 0);
        if (class143.field2507[0] == 0) {
            if (class143.field2507[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class143.field2507, 1);
            if (class143.field2507[1] > 1) {
                byte[] var7 = new byte[class143.field2507[1]];
                OpenGL.glGetInfoLogARB(var4, class143.field2507[1], class143.field2507, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class143.field2507[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field7563);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class249(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
    private final void method1603(byte arg0) {
        field3619++;
        if (!this.field3661) {
            return;
        }
        this.field3661 = false;
        if (this.field3648 == null && this.field3642 == null && this.field3557 == null) {
            if (this.field3581 != null && !class616.method3533(this.field3657, this.field3617, 458752)) {
                if (this.field3559 != null && this.field3559.field6120 == null) {
                    this.field3661 = true;
                } else {
                    if (!this.field3654) {
                        this.method1607(-2169);
                    }
                    this.field3581 = null;
                }
            }
            if (this.field3635 != null && !class403.method2462(this.field3657, this.field3617, (byte) 1)) {
                if (this.field3559 != null && this.field3559.field6120 == null) {
                    this.field3661 = true;
                } else {
                    if (!this.field3654) {
                        this.method1607(-2169);
                    }
                    this.field3635 = null;
                }
            }
            if (this.field3562 != null && !class593.method3379((byte) -71, this.field3657, this.field3617)) {
                if (this.field3559 != null && this.field3559.field6120 == null) {
                    this.field3661 = true;
                } else {
                    if (!this.field3654) {
                        this.method1607(-2169);
                    }
                    this.field3562 = null;
                }
            }
        }
        if (this.field3569 != null && this.field3581 == null && this.field3635 == null && this.field3562 == null) {
            this.field3569 = null;
            this.field3629 = null;
        }
        if (this.field3639 != null && !class545.method3147(this.field3617, this.field3657, true)) {
            if (this.field3570 == null) {
                if (this.field3640 != null && this.field3640.field6120 == null) {
                    this.field3661 = true;
                } else {
                    this.field3587 = this.field3621 = this.field3663 = null;
                    this.field3639 = null;
                }
            } else if (this.field3570.field6120 == null) {
                this.field3661 = true;
            } else {
                this.field3639 = null;
                this.field3587 = this.field3621 = this.field3663 = null;
            }
        }
        if (this.field3548 != null && !class462.method2762(this.field3657, this.field3617, (byte) -126)) {
            if (this.field3640 != null && this.field3640.field6120 == null) {
                this.field3661 = true;
            } else {
                this.field3548 = null;
            }
        }
        int var2 = 121 % ((-arg0 - 64) / 44);
        if (this.field3622 != null && !class119.method1042(this.field3617, (byte) 83, this.field3657)) {
            if (this.field3640 != null && this.field3640.field6120 == null) {
                this.field3661 = true;
            } else {
                this.field3622 = null;
            }
        }
        if (this.field3631 != null && !class681.method3828(this.field3617, this.field3657, 2)) {
            if (this.field3554 != null && this.field3554.field6120 == null) {
                this.field3661 = true;
            } else {
                this.field3631 = this.field3633 = null;
            }
        }
        if (this.field3589 != null && !class507.method3011(45, this.field3617, this.field3657)) {
            if (this.field3640 != null && this.field3640.field6120 == null) {
                this.field3661 = true;
            } else {
                this.field3589 = null;
            }
        }
        if (this.field3574 != null && !class314.method2035(this.field3657, -7, this.field3617)) {
            if ((this.field3655 == null || this.field3655.field1845 != null) && (this.field3640 == null || this.field3640.field6120 != null)) {
                this.field3574 = this.field3598 = this.field3547 = null;
            } else {
                this.field3661 = true;
            }
        }
        if (this.field3659 != null && !class422.method2572(this.field3617, 384, this.field3657)) {
            this.field3659 = null;
            this.field3568 = null;
        }
        if (this.field3605 != null && !class454.method2739(this.field3617, this.field3657, (byte) 120)) {
            this.field3651 = null;
            this.field3605 = null;
        }
        if (this.field3608 != null && !class682.method3836(1024, this.field3657, this.field3617)) {
            this.field3608 = null;
        }
        if (this.field3645 != null && (this.field3617 & 0x800) == 0 && (this.field3617 & 0x40000) == 0) {
            this.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "(III)V")
    public final void method346(int arg0, int arg1, int arg2) {
        field3603++;
        for (int var4 = 0; var4 < this.field3606; var4++) {
            if (arg0 != 128) {
                this.field3581[var4] = this.field3581[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3635[var4] = this.field3635[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3562[var4] = this.field3562[var4] * arg2 >> 7;
            }
        }
        this.field3654 = false;
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "TA", descriptor = "()I")
    public final int method329() {
        field3551++;
        return this.field3634;
    }

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "()V")
    public final void method336() {
        field3610++;
        for (int var1 = 0; var1 < this.field3646; var1++) {
            this.field3581[var1] = this.field3581[var1] + 7 >> 4;
            this.field3635[var1] = this.field3635[var1] + 7 >> 4;
            this.field3562[var1] = this.field3562[var1] + 7 >> 4;
        }
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
        this.field3654 = false;
    }

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "()I")
    public final int method315() {
        field3628++;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        return this.field3660;
    }

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "()I")
    public final int method330() {
        if (!this.field3654) {
            this.method1607(-2169);
        }
        field3611++;
        return this.field3591;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        field3614++;
        for (int var5 = 0; var5 < this.field3597; var5++) {
            int var9 = this.field3548[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3E4) >> 7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3548[var5] = (short) class2.method189(var12, class2.method189(var11 << 7, var10 << 10));
        }
        if (this.field3557 != null) {
            for (int var6 = 0; var6 < this.field3583; var6++) {
                class211 var7 = this.field3557[var6];
                class91 var8 = this.field3600[var6];
                var8.field1661 = var8.field1661 & 0xFF000000 | class492.field7038[this.field3548[var7.field3233] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3640 != null) {
            this.field3640.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lq;Lql;I)V")
    public final void method334(class396 arg0, class684 arg1, int arg2) {
        field3620++;
        if (this.field3609 == 0) {
            return;
        }
        class422 var4 = this.field3579.field244;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        class422 var5 = (class422) arg0;
        class408.field5907 = var4.field6075 * var5.field6081 + var4.field6081 * var5.field6079 + var4.field6078 * var5.field6102;
        class500.field7118 = var4.field6075 * var5.field6077 + var4.field6081 * var5.field6109 + var4.field6078 * var5.field6099 + var4.field6077;
        float var6 = (float) this.field3660 * class408.field5907 + class500.field7118;
        float var7 = (float) this.field3560 * class408.field5907 + class500.field7118;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = var7 - (float) this.field3613;
            var8 = (float) this.field3613 + var6;
        } else {
            var8 = (float) this.field3613 + var7;
            var9 = var6 - (float) this.field3613;
        }
        if ((var9 >= this.field3579.field275) || (var8 <= (float) this.field3579.field304)) {
            return;
        }
        class142.field2502 = var4.field6100 * var5.field6077 + var4.field6102 * var5.field6109 + var4.field6101 * var5.field6099 + var4.field6099;
        class136.field2420 = var4.field6100 * var5.field6081 + var4.field6102 * var5.field6079 + var4.field6101 * var5.field6102;
        float var10 = (float) this.field3660 * class136.field2420 + class142.field2502;
        float var11 = (float) this.field3560 * class136.field2420 + class142.field2502;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) (-this.field3613) + var11) * (float) this.field3579.field310;
            var13 = ((float) this.field3613 + var10) * (float) this.field3579.field310;
        } else {
            var12 = (var10 - (float) this.field3613) * (float) this.field3579.field310;
            var13 = ((float) this.field3613 + var11) * (float) this.field3579.field310;
        }
        if ((this.field3579.field306 <= var12 / var8) || (var13 / var8 <= this.field3579.field252)) {
            return;
        }
        class474.field6715 = var4.field6083 * var5.field6081 + var4.field6112 * var5.field6102 + var4.field6079 * var5.field6079;
        class550.field7800 = var4.field6083 * var5.field6077 + var4.field6112 * var5.field6099 + var4.field6079 * var5.field6109 + var4.field6109;
        float var14 = (float) this.field3660 * class474.field6715 + class550.field7800;
        float var15 = (float) this.field3560 * class474.field6715 + class550.field7800;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field3613 + var14) * (float) this.field3579.field327;
            var17 = (var15 - (float) this.field3613) * (float) this.field3579.field327;
        } else {
            var17 = (var14 - (float) this.field3613) * (float) this.field3579.field327;
            var16 = ((float) this.field3613 + var15) * (float) this.field3579.field327;
        }
        if ((this.field3579.field273 <= var17 / var8) || (var16 / var8 <= this.field3579.field257)) {
            return;
        }
        if (arg1 != null || this.field3557 != null) {
            class203.field3123 = var4.field6100 * var5.field6078 + var4.field6102 * var5.field6112 + var4.field6101 * var5.field6101;
            class288.field4292 = var4.field6083 * var5.field6078 + var4.field6112 * var5.field6101 + var4.field6079 * var5.field6112;
            class600.field8607 = var4.field6075 * var5.field6075 + var4.field6081 * var5.field6083 + var4.field6078 * var5.field6100;
            class210.field3214 = var4.field6075 * var5.field6078 + var4.field6081 * var5.field6112 + var4.field6078 * var5.field6101;
            class65.field1442 = var4.field6083 * var5.field6075 + var4.field6112 * var5.field6100 + var4.field6079 * var5.field6083;
            class228.field3408 = var4.field6100 * var5.field6075 + var4.field6102 * var5.field6083 + var4.field6101 * var5.field6100;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3591 + this.field3553 >> 1;
            int var21 = this.field3612 + this.field3649 >> 1;
            int var22 = (int) ((float) var21 * class228.field3408 + (float) this.field3660 * class136.field2420 + (float) var20 * class203.field3123 + class142.field2502);
            int var23 = (int) ((float) var21 * class65.field1442 + (float) this.field3660 * class474.field6715 + (float) var20 * class288.field4292 + class550.field7800);
            int var24 = (int) ((float) var21 * class600.field8607 + (float) this.field3660 * class408.field5907 + (float) var20 * class210.field3214 + class500.field7118);
            if (this.field3579.field304 <= var24) {
                arg1.field9710 = this.field3579.field288 + (this.field3579.field327 * var23 / var24);
                arg1.field9705 = this.field3579.field310 * var22 / var24 + this.field3579.field291;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class228.field3408 + (float) this.field3560 * class136.field2420 + (float) var20 * class203.field3123 + class142.field2502);
            int var26 = (int) ((float) var21 * class65.field1442 + (float) this.field3560 * class474.field6715 + (float) var20 * class288.field4292 + class550.field7800);
            int var27 = (int) ((float) var21 * class600.field8607 + (float) this.field3560 * class408.field5907 + (float) var20 * class210.field3214 + class500.field7118);
            if (this.field3579.field304 > var27) {
                var18 = true;
            } else {
                arg1.field9708 = this.field3579.field327 * var26 / var27 + this.field3579.field288;
                arg1.field9706 = this.field3579.field310 * var25 / var27 + this.field3579.field291;
            }
            if (var18) {
                if (this.field3579.field304 > var24 && var27 < this.field3579.field304) {
                    var19 = false;
                } else if (var24 < this.field3579.field304) {
                    int var31 = (var27 - this.field3579.field304 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field9705 = this.field3579.field291 + (this.field3579.field310 * var32 / this.field3579.field304);
                    arg1.field9710 = this.field3579.field327 * var33 / this.field3579.field304 + this.field3579.field288;
                } else if (var27 < this.field3579.field304) {
                    int var28 = (var24 - this.field3579.field304 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field9705 = this.field3579.field310 * var29 / this.field3579.field304 + this.field3579.field291;
                    arg1.field9710 = this.field3579.field288 + (this.field3579.field327 * var30 / this.field3579.field304);
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field9709 = this.field3579.field291 - (arg1.field9705 - ((this.field3613 + var22) * this.field3579.field310 / var24));
                } else {
                    arg1.field9709 = (this.field3613 + var25) * this.field3579.field310 / var27 + this.field3579.field291 - arg1.field9706;
                }
                arg1.field9707 = true;
            }
        }
        this.field3579.method8(97);
        this.field3579.method51(3042, var5);
        this.method1593(-1);
        this.field3579.method164(false);
        this.method1601(0);
    }

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "()I")
    public final int method354() {
        field3545++;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        return this.field3613;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ISBII)I")
    private final int method1604(int arg0, short arg1, byte arg2, int arg3, int arg4) {
        field3595++;
        int var6 = class492.field7038[class13.method331(arg3, false, arg0)];
        if (~arg1 != arg4) {
            class699 var7 = this.field3579.field2768.method1500(arg1 & 0xFFFF, arg4 ^ 0xFFFFFFAE);
            int var8 = var7.field9843 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field9838 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF007D) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg2 & 0xFF);
    }

    @OriginalMember(owner = "client!mb", name = "oa", descriptor = "(III)V")
    public final void method337(int arg0, int arg1, int arg2) {
        field3573++;
        for (int var4 = 0; var4 < this.field3606; var4++) {
            if (arg0 != 0) {
                this.field3581[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3635[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3562[var4] += arg2;
            }
        }
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
        this.field3654 = false;
    }

    @OriginalMember(owner = "client!mb", name = "MA", descriptor = "(I)V")
    public final void method356(int arg0) {
        field3575++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field3606; var4++) {
            int var5 = this.field3635[var4] * var3 - (this.field3562[var4] * var2) >> 14;
            this.field3562[var4] = this.field3635[var4] * var2 + this.field3562[var4] * var3 >> 14;
            this.field3635[var4] = var5;
        }
        this.field3654 = false;
        if (this.field3559 != null) {
            this.field3559.field6120 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "za", descriptor = "()I")
    public final int method327() {
        if (!this.field3654) {
            this.method1607(-2169);
        }
        field3602++;
        return this.field3649;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()Z")
    public final boolean method338() {
        field3571++;
        if (this.field3589 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3589.length; var1++) {
            if (this.field3589[var1] != -1 && !this.field3579.field2768.method1499(this.field3589[var1], -24052)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
    public final void method314() {
        field3615++;
        if (this.field3609 <= 0 || this.field3552 <= 0) {
            return;
        }
        this.method1599(false, (byte) -100);
        if ((this.field3636 & 0x10) == 0 && this.field3655.field1845 == null) {
            this.method1600((byte) 84, false);
        }
        this.method1603((byte) -122);
    }

    @OriginalMember(owner = "client!mb", name = "OA", descriptor = "()I")
    public final int method328() {
        field3582++;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        return this.field3612;
    }

    @OriginalMember(owner = "client!mb", name = "na", descriptor = "()I")
    public final int method342() {
        field3586++;
        return this.field3594;
    }

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "()I")
    public final int method343() {
        if (!this.field3654) {
            this.method1607(-2169);
        }
        field3572++;
        return this.field3560;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method326(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3604++;
        class241 var6 = (class241) arg0;
        if (this.field3597 == 0 || var6.field3597 == 0) {
            return;
        }
        int var7 = var6.field3606;
        int[] var8 = var6.field3581;
        int[] var9 = var6.field3635;
        int[] var10 = var6.field3562;
        short[] var11 = var6.field3587;
        short[] var12 = var6.field3621;
        short[] var13 = var6.field3663;
        byte[] var14 = var6.field3639;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3563 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3563.field9718;
            var16 = this.field3563.field9716;
            var18 = this.field3563.field9714;
            var17 = this.field3563.field9715;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field3563 == null) {
            var19 = null;
            var22 = null;
            var21 = null;
            var20 = null;
        } else {
            var19 = var6.field3563.field9716;
            var20 = var6.field3563.field9715;
            var21 = var6.field3563.field9718;
            var22 = var6.field3563.field9714;
        }
        int[] var23 = var6.field3629;
        short[] var24 = var6.field3569;
        if (!var6.field3654) {
            var6.method1607(-2169);
        }
        short var25 = var6.field3660;
        short var26 = var6.field3560;
        short var27 = var6.field3553;
        short var28 = var6.field3591;
        short var29 = var6.field3612;
        short var30 = var6.field3649;
        for (int var31 = 0; var31 < this.field3606; var31++) {
            int var32 = this.field3635[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3581[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field3562[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3629[var31];
                        int var37 = this.field3629[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3569[var38] - 1;
                            if (var35 == -1 || this.field3639[var35] != 0) {
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
                                        if (var18 == null) {
                                            this.field3563 = new class685();
                                            var18 = this.field3563.field9714 = class150.method1186(-4, this.field3587);
                                            var16 = this.field3563.field9716 = class150.method1186(-4, this.field3621);
                                            var17 = this.field3563.field9715 = class150.method1186(-4, this.field3663);
                                            var15 = this.field3563.field9718 = class275.method1800(this.field3639, (byte) 114);
                                        }
                                        if (var22 == null) {
                                            class685 var44 = var6.field3563 = new class685();
                                            var22 = var44.field9714 = class150.method1186(-4, var11);
                                            var19 = var44.field9716 = class150.method1186(-4, var12);
                                            var20 = var44.field9715 = class150.method1186(-4, var13);
                                            var21 = var44.field9718 = class275.method1800(var14, (byte) -71);
                                        }
                                        short var45 = this.field3587[var35];
                                        short var46 = this.field3621[var35];
                                        short var47 = this.field3663[var35];
                                        byte var48 = this.field3639[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        byte var53 = var14[var41];
                                        int var54 = this.field3629[var31 + 1];
                                        short var55 = var12[var41];
                                        int var56 = this.field3629[var31];
                                        short var57 = var11[var41];
                                        short var58 = var13[var41];
                                        for (int var59 = var56; var59 < var54; var59++) {
                                            int var60 = this.field3569[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var18[var60] += var57;
                                                var16[var60] += var55;
                                                var17[var60] += var58;
                                                var15[var60] += var53;
                                            }
                                        }
                                        if (this.field3570 == null && this.field3640 != null) {
                                            this.field3640.field6120 = null;
                                        }
                                        if (this.field3570 != null) {
                                            this.field3570.field6120 = null;
                                        }
                                        if (var6.field3570 == null && var6.field3640 != null) {
                                            var6.field3640.field6120 = null;
                                        }
                                        if (var6.field3570 != null) {
                                            var6.field3570.field6120 = null;
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

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(FIFJIIIILnda;I)S")
    private final short method1605(float arg0, int arg1, float arg2, long arg3, int arg4, int arg5, int arg6, int arg7, class519 arg8, int arg9) {
        field3658++;
        int var12 = this.field3629[arg7];
        int var13 = this.field3629[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3569[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class679.field9630[var15] == arg3) {
                return (short) (var16 - 1);
            }
        }
        if (arg6 != -4117) {
            this.method361(86);
        }
        this.field3569[var14] = (short) (this.field3609 + 1);
        class679.field9630[var14] = arg3;
        this.field3587[this.field3609] = (short) arg4;
        this.field3621[this.field3609] = (short) arg1;
        this.field3663[this.field3609] = (short) arg5;
        this.field3639[this.field3609] = (byte) arg9;
        this.field3631[this.field3609] = arg2;
        this.field3633[this.field3609] = arg0;
        return (short) (this.field3609++);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILq;IIZ)Z")
    private final boolean method1606(int arg0, int arg1, class396 arg2, int arg3, int arg4, boolean arg5) {
        field3588++;
        class422 var7 = (class422) arg2;
        class422 var8 = this.field3579.field244;
        float var9 = var7.field6077 * var8.field6100 + var7.field6109 * var8.field6102 + var7.field6099 * var8.field6101 + var8.field6099;
        float var10 = var7.field6077 * var8.field6083 + var7.field6109 * var8.field6079 + var7.field6099 * var8.field6112 + var8.field6109;
        class203.field3123 = var7.field6078 * var8.field6100 + var7.field6112 * var8.field6102 + var7.field6101 * var8.field6101;
        class136.field2420 = var7.field6081 * var8.field6100 + var7.field6102 * var8.field6101 + var7.field6079 * var8.field6102;
        class288.field4292 = var7.field6078 * var8.field6083 + var7.field6112 * var8.field6079 + var7.field6101 * var8.field6112;
        class228.field3408 = var7.field6075 * var8.field6100 + var7.field6100 * var8.field6101 + var7.field6083 * var8.field6102;
        class600.field8607 = var7.field6075 * var8.field6075 + var7.field6100 * var8.field6078 + var7.field6083 * var8.field6081;
        class65.field1442 = var7.field6075 * var8.field6083 + var7.field6100 * var8.field6112 + var7.field6083 * var8.field6079;
        class408.field5907 = var7.field6081 * var8.field6075 + var7.field6102 * var8.field6078 + var7.field6079 * var8.field6081;
        class210.field3214 = var7.field6078 * var8.field6075 + var7.field6112 * var8.field6081 + var7.field6101 * var8.field6078;
        class474.field6715 = var7.field6081 * var8.field6083 + var7.field6102 * var8.field6112 + var7.field6079 * var8.field6079;
        float var11 = var7.field6077 * var8.field6075 + var7.field6109 * var8.field6081 + var7.field6099 * var8.field6078 + var8.field6077;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field3579.field310;
        int var18 = this.field3579.field327;
        if (!this.field3654) {
            this.method1607(-2169);
        }
        class59.field1338[0] = this.field3553;
        class381.field5633[0] = this.field3660;
        class59.field1338[1] = this.field3591;
        class237.field3519[0] = this.field3612;
        class381.field5633[1] = this.field3660;
        class237.field3519[1] = this.field3612;
        class59.field1338[2] = this.field3553;
        class381.field5633[2] = this.field3560;
        class59.field1338[3] = this.field3591;
        class237.field3519[2] = this.field3612;
        class381.field5633[3] = this.field3560;
        class59.field1338[4] = this.field3553;
        class237.field3519[3] = this.field3612;
        class381.field5633[4] = this.field3660;
        class237.field3519[4] = this.field3649;
        if (arg3 != -999999) {
            return true;
        }
        class59.field1338[5] = this.field3591;
        class381.field5633[5] = this.field3660;
        class59.field1338[6] = this.field3553;
        class237.field3519[5] = this.field3649;
        class381.field5633[6] = this.field3560;
        class59.field1338[7] = this.field3591;
        class237.field3519[6] = this.field3649;
        class381.field5633[7] = this.field3560;
        class237.field3519[7] = this.field3649;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class237.field3519[var19];
            float var41 = (float) class381.field5633[var19];
            float var42 = (float) class59.field1338[var19];
            float var43 = class600.field8607 * var40 + class408.field5907 * var41 + class210.field3214 * var42 + var11;
            float var44 = class65.field1442 * var40 + class474.field6715 * var41 + class288.field4292 * var42 + var10;
            float var45 = class228.field3408 * var40 + class203.field3123 * var42 + class136.field2420 * var41 + var9;
            if (var43 >= (float) this.field3579.field304) {
                if (arg1 > 0) {
                    var43 = arg1;
                }
                float var46 = (float) var17 * var45 / var43 + (float) this.field3579.field291;
                if (var46 > var14) {
                    var14 = var46;
                }
                if (var46 < var13) {
                    var13 = var46;
                }
                float var47 = (float) var18 * var44 / var43 + (float) this.field3579.field288;
                if (var15 > var47) {
                    var15 = var47;
                }
                var12 = true;
                if (var16 < var47) {
                    var16 = var47;
                }
            }
        }
        if (var12 && (float) arg4 > var13 && (float) arg4 < var14 && (float) arg0 > var15 && (float) arg0 < var16) {
            if (arg5) {
                return true;
            }
            if (this.field3609 > this.field3579.field364.length) {
                this.field3579.field364 = new int[this.field3609];
                this.field3579.field362 = new int[this.field3609];
            }
            int[] var20 = this.field3579.field364;
            int[] var21 = this.field3579.field362;
            for (int var22 = 0; var22 < this.field3606; var22++) {
                float var24 = (float) this.field3562[var22];
                float var25 = (float) this.field3635[var22];
                float var26 = (float) this.field3581[var22];
                float var27 = class228.field3408 * var24 + class203.field3123 * var26 + class136.field2420 * var25 + var9;
                float var28 = class65.field1442 * var24 + class474.field6715 * var25 + class288.field4292 * var26 + var10;
                float var29 = class600.field8607 * var24 + class408.field5907 * var25 + class210.field3214 * var26 + var11;
                if ((float) this.field3579.field304 <= var29) {
                    if (arg1 > 0) {
                        var29 = arg1;
                    }
                    int var30 = (int) ((float) var17 * var27 / var29 + (float) this.field3579.field291);
                    int var31 = (int) ((float) var18 * var28 / var29 + (float) this.field3579.field288);
                    int var32 = this.field3629[var22];
                    int var33 = this.field3629[var22 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field3569[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        var20[var35] = var30;
                        var21[var35] = var31;
                    }
                } else {
                    int var36 = this.field3629[var22];
                    int var37 = this.field3629[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field3569[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[this.field3569[var38] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field3597; var23++) {
                if (var20[this.field3574[var23]] != -999999 && var20[this.field3598[var23]] != -999999 && var20[this.field3547[var23]] != -999999 && this.method1592(var21[this.field3547[var23]], var21[this.field3574[var23]], arg4, var21[this.field3598[var23]], var20[this.field3547[var23]], arg0, 25475, var20[this.field3574[var23]], var20[this.field3598[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
    public final void method319() {
        field3561++;
    }

    @OriginalMember(owner = "client!mb", name = "SA", descriptor = "(I)V")
    public final void method361(int arg0) {
        field3625++;
        this.field3617 = arg0;
        if (this.field3563 != null && (this.field3617 & 0x10000) == 0) {
            this.field3587 = this.field3563.field9714;
            this.field3621 = this.field3563.field9716;
            this.field3663 = this.field3563.field9715;
            this.field3639 = this.field3563.field9718;
            this.field3563 = null;
        }
        this.field3661 = true;
        this.method1603((byte) -113);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    private final void method1607(int arg0) {
        field3618++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        if (arg0 != -2169) {
            return;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3606; var10++) {
            int var11 = this.field3581[var10];
            int var12 = this.field3635[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field3562[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field3649 = (short) var7;
        this.field3612 = (short) var4;
        this.field3553 = (short) var2;
        this.field3591 = (short) var5;
        this.field3560 = (short) var6;
        this.field3660 = (short) var3;
        this.field3613 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field3578 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field3654 = true;
    }

    @OriginalMember(owner = "client!mb", name = "WA", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        field3643++;
        if (arg0 == 0) {
            class686.field9723 = 0;
            class367.field5441 = 0;
            class370.field5496 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field3606; var6++) {
                class686.field9723 += this.field3581[var6];
                class367.field5441 += this.field3635[var6];
                class370.field5496 += this.field3562[var6];
                var5++;
            }
            if (var5 > 0) {
                class367.field5441 = class367.field5441 / var5 + arg2;
                class370.field5496 = class370.field5496 / var5 + arg3;
                class686.field9723 = class686.field9723 / var5 + arg1;
            } else {
                class686.field9723 = arg1;
                class367.field5441 = arg2;
                class370.field5496 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3606; var7++) {
                this.field3581[var7] += arg1;
                this.field3635[var7] += arg2;
                this.field3562[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3606; var8++) {
                this.field3581[var8] -= class686.field9723;
                this.field3635[var8] -= class367.field5441;
                this.field3562[var8] -= class370.field5496;
                if (arg3 != 0) {
                    int var9 = class509.field7210[arg3];
                    int var10 = class509.field7220[arg3];
                    int var11 = this.field3635[var8] * var9 + (this.field3581[var8] * var10) + 16383 >> 14;
                    this.field3635[var8] = this.field3635[var8] * var10 + 16383 - this.field3581[var8] * var9 >> 14;
                    this.field3581[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class509.field7210[arg1];
                    int var13 = class509.field7220[arg1];
                    int var14 = this.field3635[var8] * var13 + 16383 - (this.field3562[var8] * var12) >> 14;
                    this.field3562[var8] = this.field3635[var8] * var12 + this.field3562[var8] * var13 + 16383 >> 14;
                    this.field3635[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class509.field7210[arg2];
                    int var16 = class509.field7220[arg2];
                    int var17 = this.field3581[var8] * var16 + this.field3562[var8] * var15 + 16383 >> 14;
                    this.field3562[var8] = this.field3562[var8] * var16 + 16383 - (this.field3581[var8] * var15) >> 14;
                    this.field3581[var8] = var17;
                }
                this.field3581[var8] += class686.field9723;
                this.field3635[var8] += class367.field5441;
                this.field3562[var8] += class370.field5496;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3606; var18++) {
                this.field3581[var18] -= class686.field9723;
                this.field3635[var18] -= class367.field5441;
                this.field3562[var18] -= class370.field5496;
                this.field3581[var18] = this.field3581[var18] * arg1 / 128;
                this.field3635[var18] = this.field3635[var18] * arg2 / 128;
                this.field3562[var18] = this.field3562[var18] * arg3 / 128;
                this.field3581[var18] += class686.field9723;
                this.field3635[var18] += class367.field5441;
                this.field3562[var18] += class370.field5496;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3597; var19++) {
                int var23 = (this.field3622[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3622[var19] = (byte) var23;
            }
            if (this.field3640 != null) {
                this.field3640.field6120 = null;
            }
            if (this.field3557 != null) {
                for (int var20 = 0; var20 < this.field3583; var20++) {
                    class211 var21 = this.field3557[var20];
                    class91 var22 = this.field3600[var20];
                    var22.field1661 = var22.field1661 & 0xFFFFFF | 255 - (this.field3622[var21.field3233] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3597; var24++) {
                int var28 = this.field3548[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3548[var24] = (short) class2.method189(var34, class2.method189(var33 << 7, var31 << 10));
            }
            if (this.field3640 != null) {
                this.field3640.field6120 = null;
            }
            if (this.field3557 != null) {
                for (int var25 = 0; var25 < this.field3583; var25++) {
                    class211 var26 = this.field3557[var25];
                    class91 var27 = this.field3600[var25];
                    var27.field1661 = var27.field1661 & 0xFF000000 | class492.field7038[this.field3548[var26.field3233] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3583; var35++) {
                class91 var36 = this.field3600[var35];
                var36.field1667 += arg1;
                var36.field1662 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3583; var37++) {
                class91 var38 = this.field3600[var37];
                var38.field1660 = var38.field1660 * arg2 >> 7;
                var38.field1657 = var38.field1657 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3583; var39++) {
                class91 var40 = this.field3600[var39];
                var40.field1666 = var40.field1666 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lq;)V")
    public final void method313(class396 arg0) {
        field3566++;
        class422 var2 = (class422) arg0;
        if (this.field3648 != null) {
            for (int var3 = 0; var3 < this.field3648.length; var3++) {
                class317 var4 = this.field3648[var3];
                class317 var5 = var4;
                if (var4.field4665 != null) {
                    var5 = var4.field4665;
                }
                var5.field4679 = (int) ((float) this.field3562[var4.field4667] * var2.field6100 + (float) this.field3635[var4.field4667] * var2.field6102 + (float) this.field3581[var4.field4667] * var2.field6101 + var2.field6099);
                var5.field4670 = (int) ((float) this.field3562[var4.field4667] * var2.field6083 + (float) this.field3635[var4.field4667] * var2.field6079 + (float) this.field3581[var4.field4667] * var2.field6112 + var2.field6109);
                var5.field4664 = (int) ((float) this.field3562[var4.field4667] * var2.field6075 + (float) this.field3635[var4.field4667] * var2.field6081 + (float) this.field3581[var4.field4667] * var2.field6078 + var2.field6077);
                var5.field4673 = (int) ((float) this.field3562[var4.field4675] * var2.field6100 + (float) this.field3635[var4.field4675] * var2.field6102 + (float) this.field3581[var4.field4675] * var2.field6101 + var2.field6099);
                var5.field4666 = (int) ((float) this.field3562[var4.field4675] * var2.field6083 + (float) this.field3635[var4.field4675] * var2.field6079 + (float) this.field3581[var4.field4675] * var2.field6112 + var2.field6109);
                var5.field4682 = (int) ((float) this.field3562[var4.field4675] * var2.field6075 + (float) this.field3635[var4.field4675] * var2.field6081 + (float) this.field3581[var4.field4675] * var2.field6078 + var2.field6077);
                var5.field4660 = (int) ((float) this.field3562[var4.field4678] * var2.field6100 + (float) this.field3635[var4.field4678] * var2.field6102 + (float) this.field3581[var4.field4678] * var2.field6101 + var2.field6099);
                var5.field4680 = (int) ((float) this.field3562[var4.field4678] * var2.field6083 + (float) this.field3635[var4.field4678] * var2.field6079 + (float) this.field3581[var4.field4678] * var2.field6112 + var2.field6109);
                var5.field4676 = (int) ((float) this.field3562[var4.field4678] * var2.field6075 + (float) this.field3635[var4.field4678] * var2.field6081 + (float) this.field3581[var4.field4678] * var2.field6078 + var2.field6077);
            }
        }
        if (this.field3642 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3642.length; var6++) {
            class146 var7 = this.field3642[var6];
            class146 var8 = var7;
            if (var7.field2536 != null) {
                var8 = var7.field2536;
            }
            if (var7.field2537 == null) {
                var7.field2537 = var2.method904();
            } else {
                var7.field2537.method896(var2);
            }
            var8.field2544 = (int) ((float) this.field3562[var7.field2543] * var2.field6100 + (float) this.field3635[var7.field2543] * var2.field6102 + (float) this.field3581[var7.field2543] * var2.field6101 + var2.field6099);
            var8.field2529 = (int) ((float) this.field3562[var7.field2543] * var2.field6083 + (float) this.field3635[var7.field2543] * var2.field6079 + (float) this.field3581[var7.field2543] * var2.field6112 + var2.field6109);
            var8.field2533 = (int) ((float) this.field3562[var7.field2543] * var2.field6075 + (float) this.field3635[var7.field2543] * var2.field6081 + (float) this.field3581[var7.field2543] * var2.field6078 + var2.field6077);
        }
    }

    @OriginalMember(owner = "client!mb", name = "LA", descriptor = "()Z")
    public final boolean method363() {
        field3637++;
        return this.field3546;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lus;)V")
    public class241(class1 arg0) {
        this.field3579 = arg0;
        this.field3559 = new class423(null, 5126, 3, 0);
        this.field3554 = new class423(null, 5126, 2, 0);
        this.field3570 = new class423(null, 5126, 3, 0);
        this.field3640 = new class423(null, 5121, 4, 0);
        this.field3655 = new class104();
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lus;Lnda;IIII)V")
    public class241(class1 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3657 = arg5;
        this.field3579 = arg0;
        this.field3617 = arg2;
        if (class437.method2648((byte) 41, arg5, arg2)) {
            this.field3559 = new class423(null, 5126, 3, 0);
        }
        if (class30.method500(arg5, -106, arg2)) {
            this.field3554 = new class423(null, 5126, 2, 0);
        }
        if (class109.method984(arg2, arg5, (byte) 71)) {
            this.field3570 = new class423(null, 5126, 3, 0);
        }
        if (class597.method3399(arg2, (byte) 88, arg5)) {
            this.field3640 = new class423(null, 5121, 4, 0);
        }
        if (class414.method2529(99, arg5, arg2)) {
            this.field3655 = new class104();
        }
        class214 var7 = arg0.field2768;
        int[] var8 = new int[arg1.field7317];
        this.field3629 = new int[arg1.field7325 + 1];
        for (int var9 = 0; var9 < arg1.field7317; var9++) {
            if ((arg1.field7321 == null || arg1.field7321[var9] != 2) && (arg1.field7347 == null || arg1.field7347[var9] == -1 || !var7.method1500(arg1.field7347[var9] & 0xFFFF, -90).field9839)) {
                var8[this.field3597++] = var9;
                this.field3629[arg1.field7314[var9]]++;
                this.field3629[arg1.field7318[var9]]++;
                this.field3629[arg1.field7324[var9]]++;
            }
        }
        this.field3552 = this.field3597;
        long[] var10 = new long[this.field3597];
        boolean var11 = (this.field3617 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field3597; var12++) {
            int var180 = var8[var12];
            class699 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7333 != null) {
                for (int var186 = 0; var186 < arg1.field7333.length; var186++) {
                    class638 var187 = arg1.field7333[var186];
                    if (var187.field9194 == var180) {
                        class535 var188 = class572.method3291(var187.field9192, (byte) 65);
                        if (var188.field7493) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3552--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7347 != null) {
                var189 = arg1.field7347[var180];
                if (var189 != -1) {
                    var181 = var7.method1500(var189 & 0xFFFF, -71);
                    var185 = var181.field9849;
                    var184 = var181.field9829;
                }
            }
            boolean var190 = arg1.field7351 != null && arg1.field7351[var180] != 0 || var181 != null && var181.field9840 | !var181.field9846;
            if ((var11 || var190) && arg1.field7326 != null) {
                var182 += arg1.field7326[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + ((long) var194);
            this.field3546 |= var190;
        }
        class446.method2682(var8, var10, false);
        this.field3646 = arg1.field7361;
        this.field3562 = arg1.field7319;
        this.field3581 = arg1.field7346;
        this.field3606 = arg1.field7325;
        this.field3635 = arg1.field7334;
        this.field3651 = arg1.field7335;
        this.field3642 = arg1.field7352;
        this.field3648 = arg1.field7331;
        class534[] var13 = new class534[this.field3606];
        if (arg1.field7333 != null) {
            this.field3583 = arg1.field7333.length;
            this.field3557 = new class211[this.field3583];
            this.field3600 = new class91[this.field3583];
            for (int var14 = 0; var14 < this.field3583; var14++) {
                class638 var15 = arg1.field7333[var14];
                class535 var16 = class572.method3291(var15.field9192, (byte) 87);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3597; var18++) {
                    if (var8[var18] == var15.field9194) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class492.field7038[arg1.field7344[var15.field9194] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7351 == null ? 0 : arg1.field7351[var15.field9194]) << 24;
                this.field3557[var14] = new class211(var17, arg1.field7314[var15.field9194], arg1.field7318[var15.field9194], arg1.field7324[var15.field9194], var16.field7503, var16.field7499, var16.field7492, var16.field7501, var16.field7500, var16.field7493, var16.field7496, var15.field9188);
                this.field3600[var14] = new class91(var20);
            }
        }
        int var21 = this.field3597 * 3;
        this.field3594 = (short) arg4;
        this.field3589 = new short[this.field3597];
        this.field3598 = new short[this.field3597];
        this.field3547 = new short[this.field3597];
        this.field3574 = new short[this.field3597];
        this.field3587 = new short[var21];
        this.field3633 = new float[var21];
        this.field3663 = new short[var21];
        this.field3569 = new short[var21];
        this.field3621 = new short[var21];
        this.field3548 = new short[this.field3597];
        this.field3631 = new float[var21];
        this.field3622 = new byte[this.field3597];
        this.field3634 = (short) arg3;
        class679.field9630 = new long[var21];
        this.field3639 = new byte[var21];
        if (arg1.field7337 != null) {
            this.field3568 = new short[this.field3597];
        }
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7325; var23++) {
            int var179 = this.field3629[var23];
            this.field3629[var23] = var22;
            var13[var23] = new class534();
            var22 += var179;
        }
        this.field3629[arg1.field7325] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7339 != null) {
            int var28 = arg1.field7353;
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
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field3597; var36++) {
                int var43 = var8[var36];
                if (arg1.field7339[var43] != -1) {
                    int var44 = arg1.field7339[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7314[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7318[var43];
                        } else {
                            var46 = arg1.field7324[var43];
                        }
                        int var47 = arg1.field7346[var46];
                        int var48 = arg1.field7334[var46];
                        int var49 = arg1.field7319[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7320[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7345[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = (float) var42 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var39 = 1.0F;
                            var41 = (float) (-var42) / 1024.0F;
                        }
                        var40 = 64.0F / (float) arg1.field7359[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7332[var37];
                        var40 = 64.0F / (float) arg1.field7359[var37];
                        var41 = 64.0F / (float) arg1.field7345[var37];
                    } else {
                        var41 = (float) arg1.field7345[var37] / 1024.0F;
                        var39 = (float) arg1.field7332[var37] / 1024.0F;
                        var40 = (float) arg1.field7359[var37] / 1024.0F;
                    }
                    var27[var37] = class418.method2540(var40, var41, arg1.field7355[var37], arg1.field7356[var37], class481.method2919(arg1.field7362[var37], 255), var39, arg1.field7330[var37], 124);
                }
            }
        }
        class593[] var50 = new class593[arg1.field7317];
        for (int var51 = 0; var51 < arg1.field7317; var51++) {
            short var158 = arg1.field7314[var51];
            short var159 = arg1.field7318[var51];
            short var160 = arg1.field7324[var51];
            int var161 = this.field3581[var159] - this.field3581[var158];
            int var162 = this.field3635[var159] - this.field3635[var158];
            int var163 = this.field3562[var159] - this.field3562[var158];
            int var164 = this.field3581[var160] - this.field3581[var158];
            int var165 = this.field3635[var160] - this.field3635[var158];
            int var166 = this.field3562[var160] - this.field3562[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field7321 == null ? 0 : arg1.field7321[var51];
            if (var174 == 0) {
                class534 var176 = var13[var158];
                var176.field7485 += var173;
                var176.field7489 += var172;
                var176.field7490 += var171;
                var176.field7488++;
                class534 var177 = var13[var159];
                var177.field7489 += var172;
                var177.field7490 += var171;
                var177.field7488++;
                var177.field7485 += var173;
                class534 var178 = var13[var160];
                var178.field7485 += var173;
                var178.field7488++;
                var178.field7490 += var171;
                var178.field7489 += var172;
            } else if (var174 == 1) {
                class593 var175 = var50[var51] = new class593();
                var175.field8524 = var171;
                var175.field8528 = var172;
                var175.field8526 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field3597; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7344[var68] & 0xFFFF;
            short var70;
            if (arg1.field7347 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7347[var68];
            }
            int var71;
            if (arg1.field7339 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7339[var68];
            }
            int var72;
            if (arg1.field7351 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7351[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var79 = 1;
                    var80 = 2;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var74 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7320[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7314[var68];
                        short var112 = arg1.field7318[var68];
                        short var113 = arg1.field7324[var68];
                        short var114 = arg1.field7356[var71];
                        short var115 = arg1.field7330[var71];
                        short var116 = arg1.field7355[var71];
                        float var117 = (float) arg1.field7346[var114];
                        float var118 = (float) arg1.field7334[var114];
                        float var119 = (float) arg1.field7319[var114];
                        float var120 = (float) arg1.field7346[var115] - var117;
                        float var121 = (float) arg1.field7334[var115] - var118;
                        float var122 = (float) arg1.field7319[var115] - var119;
                        float var123 = (float) arg1.field7346[var116] - var117;
                        float var124 = (float) arg1.field7334[var116] - var118;
                        float var125 = (float) arg1.field7319[var116] - var119;
                        float var126 = (float) arg1.field7346[var111] - var117;
                        float var127 = (float) arg1.field7334[var111] - var118;
                        float var128 = (float) arg1.field7319[var111] - var119;
                        float var129 = (float) arg1.field7346[var112] - var117;
                        float var130 = (float) arg1.field7334[var112] - var118;
                        float var131 = (float) arg1.field7319[var112] - var119;
                        float var132 = (float) arg1.field7346[var113] - var117;
                        float var133 = (float) arg1.field7334[var113] - var118;
                        float var134 = (float) arg1.field7319[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var121 * var137 - (var122 * var136);
                        float var143 = var120 * var136 - var121 * var135;
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                        var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                        var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                        var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                    } else {
                        short var83 = arg1.field7314[var68];
                        short var84 = arg1.field7318[var68];
                        short var85 = arg1.field7324[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7315[var71];
                        float var91 = (float) arg1.field7338[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field7332[var71] / 1024.0F;
                            class604.method3455(103, var90, var91, var89, var86, var92, var88, var87, arg1.field7346[var83], arg1.field7334[var83], arg1.field7319[var83]);
                            var73 = class501.field7125;
                            var74 = class150.field2564;
                            class604.method3455(89, var90, var91, var89, var86, var92, var88, var87, arg1.field7346[var84], arg1.field7334[var84], arg1.field7319[var84]);
                            var76 = class150.field2564;
                            var75 = class501.field7125;
                            class604.method3455(82, var90, var91, var89, var86, var92, var88, var87, arg1.field7346[var85], arg1.field7334[var85], arg1.field7319[var85]);
                            var78 = class150.field2564;
                            var77 = class501.field7125;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var93 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var93 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                                if (var77 - var73 > var93) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                            } else {
                                if (var93 < var78 - var74) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var93 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                                if (var93 < var76 - var74) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var74 - var76 > var93) {
                                    var79 = 2;
                                    var76 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field7328[var71] / 256.0F;
                            float var95 = (float) arg1.field7316[var71] / 256.0F;
                            int var96 = arg1.field7346[var84] - arg1.field7346[var83];
                            int var97 = arg1.field7334[var84] - arg1.field7334[var83];
                            int var98 = arg1.field7319[var84] - arg1.field7319[var83];
                            int var99 = arg1.field7346[var85] - arg1.field7346[var83];
                            int var100 = arg1.field7334[var85] - arg1.field7334[var83];
                            int var101 = arg1.field7319[var85] - arg1.field7319[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field7345[var71];
                            float var106 = 64.0F / (float) arg1.field7359[var71];
                            float var107 = 64.0F / (float) arg1.field7332[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class669.method3786(var109, var110, -4979, var108);
                            class70.method779(var94, var89, var91, var86, arg1.field7334[var83], var81, var88, var90, arg1.field7319[var83], -5503, var95, var87, arg1.field7346[var83]);
                            var74 = class163.field2742;
                            var73 = class236.field3514;
                            class70.method779(var94, var89, var91, var86, arg1.field7334[var84], var81, var88, var90, arg1.field7319[var84], -5503, var95, var87, arg1.field7346[var84]);
                            var76 = class163.field2742;
                            var75 = class236.field3514;
                            class70.method779(var94, var89, var91, var86, arg1.field7334[var85], var81, var88, var90, arg1.field7319[var85], -5503, var95, var87, arg1.field7346[var85]);
                            var77 = class236.field3514;
                            var78 = class163.field2742;
                        } else if (var82 == 3) {
                            class221.method1527(arg1.field7346[var83], var91, arg1.field7334[var83], var88, var89, var90, var86, var87, (byte) 110, arg1.field7319[var83]);
                            var73 = class514.field7264;
                            var74 = class703.field9875;
                            class221.method1527(arg1.field7346[var84], var91, arg1.field7334[var84], var88, var89, var90, var86, var87, (byte) 48, arg1.field7319[var84]);
                            var75 = class514.field7264;
                            var76 = class703.field9875;
                            class221.method1527(arg1.field7346[var85], var91, arg1.field7334[var85], var88, var89, var90, var86, var87, (byte) 101, arg1.field7319[var85]);
                            var78 = class703.field9875;
                            var77 = class514.field7264;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7321 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7321[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var81 << 24) + ((long) (var69 << 8)) + (long) var72 << 32);
                short var152 = arg1.field7314[var68];
                short var153 = arg1.field7318[var68];
                short var154 = arg1.field7324[var68];
                class534 var155 = var13[var152];
                this.field3574[var52] = this.method1605(var74, var155.field7489, var73, var150, var155.field7485, var155.field7490, -4117, var152, arg1, var155.field7488);
                class534 var156 = var13[var153];
                this.field3598[var52] = this.method1605(var76, var156.field7489, var75, (long) var79 + var150, var156.field7485, var156.field7490, -4117, var153, arg1, var156.field7488);
                class534 var157 = var13[var154];
                this.field3547[var52] = this.method1605(var78, var157.field7489, var77, (long) var80 + var150, var157.field7485, var157.field7490, -4117, var154, arg1, var157.field7488);
            } else if (var146 == 1) {
                class593 var147 = var50[var68];
                long var148 = (long) ((var147.field8524 + 256 << 22) + (var147.field8528 + 256 << 12) + (var71 << 2) + (var147.field8526 <= 0 ? 2048 : 1024)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field3574[var52] = this.method1605(var74, var147.field8528, var73, var148, var147.field8526, var147.field8524, -4117, arg1.field7314[var68], arg1, 0);
                this.field3598[var52] = this.method1605(var76, var147.field8528, var75, (long) var79 + var148, var147.field8526, var147.field8524, -4117, arg1.field7318[var68], arg1, 0);
                this.field3547[var52] = this.method1605(var78, var147.field8528, var77, (long) var80 + var148, var147.field8526, var147.field8524, -4117, arg1.field7324[var68], arg1, 0);
            }
            if (arg1.field7347 == null) {
                this.field3589[var52] = -1;
            } else {
                this.field3589[var52] = arg1.field7347[var68];
            }
            if (arg1.field7351 != null) {
                this.field3622[var52] = arg1.field7351[var68];
            }
            if (arg1.field7337 != null) {
                this.field3568[var52] = arg1.field7337[var68];
            }
            this.field3548[var52] = arg1.field7344[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3552; var55++) {
            short var67 = this.field3589[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field3645 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field3552; var58++) {
            short var66 = this.field3589[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field3645[var57++] = var58;
            }
        }
        this.field3645[var57] = this.field3552;
        class679.field9630 = null;
        this.field3587 = class705.method3939((byte) 77, this.field3587, this.field3609);
        this.field3621 = class705.method3939((byte) -70, this.field3621, this.field3609);
        this.field3663 = class705.method3939((byte) 116, this.field3663, this.field3609);
        this.field3639 = class706.method3940(-128, this.field3639, this.field3609);
        this.field3631 = class589.method3364((byte) -109, this.field3609, this.field3631);
        this.field3633 = class589.method3364((byte) -102, this.field3609, this.field3633);
        if (arg1.field7360 != null && class454.method2739(arg2, this.field3657, (byte) -119)) {
            this.field3605 = arg1.method3048((byte) -120, false);
        }
        if (arg1.field7333 != null && class682.method3836(1024, this.field3657, arg2)) {
            this.field3608 = arg1.method3058((byte) -42);
        }
        if (arg1.field7336 != null && class422.method2572(arg2, 384, this.field3657)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3597; var61++) {
                int var65 = arg1.field7336[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field3659 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3659[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3597; var63++) {
                int var64 = arg1.field7336[var8[var63]];
                if (var64 >= 0) {
                    this.field3659[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
