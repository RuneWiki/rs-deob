import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class258 extends class11 {

    @OriginalMember(owner = "client!vd", name = "qc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3597 = new Hashtable();

    @OriginalMember(owner = "client!vd", name = "je", descriptor = "I")
    public int field3694 = 128;

    @OriginalMember(owner = "client!vd", name = "he", descriptor = "Lw;")
    private class69 field3692 = new class69();

    @OriginalMember(owner = "client!vd", name = "me", descriptor = "Lhs;")
    private class446 field3697 = new class446();

    @OriginalMember(owner = "client!vd", name = "oe", descriptor = "Lhs;")
    public class446 field3699 = new class446();

    @OriginalMember(owner = "client!vd", name = "te", descriptor = "Z")
    private boolean field3704 = false;

    @OriginalMember(owner = "client!vd", name = "qe", descriptor = "I")
    public int field3701 = 3;

    @OriginalMember(owner = "client!vd", name = "re", descriptor = "I")
    public int field3702 = 8;

    @OriginalMember(owner = "client!vd", name = "ye", descriptor = "Lfr;")
    private class497 field3709 = new class497();

    @OriginalMember(owner = "client!vd", name = "Ge", descriptor = "[Lmd;")
    private class212[] field3717 = new class212[4];

    @OriginalMember(owner = "client!vd", name = "Ce", descriptor = "I")
    private int field3713 = -1;

    @OriginalMember(owner = "client!vd", name = "He", descriptor = "I")
    private int field3718 = -1;

    @OriginalMember(owner = "client!vd", name = "Fe", descriptor = "[Lmd;")
    private class212[] field3716 = new class212[4];

    @OriginalMember(owner = "client!vd", name = "Ee", descriptor = "[Lmd;")
    private class212[] field3715 = new class212[4];

    @OriginalMember(owner = "client!vd", name = "Ae", descriptor = "I")
    private int field3711 = -1;

    @OriginalMember(owner = "client!vd", name = "Je", descriptor = "Lfr;")
    private class497 field3720;

    @OriginalMember(owner = "client!vd", name = "Me", descriptor = "Lfr;")
    private class497 field3723;

    @OriginalMember(owner = "client!vd", name = "Ne", descriptor = "Lfr;")
    private class497 field3724;

    @OriginalMember(owner = "client!vd", name = "Oe", descriptor = "Lfr;")
    private class497 field3725;

    @OriginalMember(owner = "client!vd", name = "Pe", descriptor = "Lfr;")
    private class497 field3726;

    @OriginalMember(owner = "client!vd", name = "Qe", descriptor = "Lfr;")
    private class497 field3727;

    @OriginalMember(owner = "client!vd", name = "Re", descriptor = "Lfr;")
    private class497 field3728;

    @OriginalMember(owner = "client!vd", name = "Te", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!vd", name = "cf", descriptor = "F")
    public float field3739;

    @OriginalMember(owner = "client!vd", name = "rf", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!vd", name = "lf", descriptor = "I")
    public int field3747;

    @OriginalMember(owner = "client!vd", name = "Nf", descriptor = "F")
    public float field3775;

    @OriginalMember(owner = "client!vd", name = "Df", descriptor = "[Lwr;")
    private class531[] field3765;

    @OriginalMember(owner = "client!vd", name = "Wf", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!vd", name = "Cf", descriptor = "[F")
    private float[] field3764;

    @OriginalMember(owner = "client!vd", name = "Rf", descriptor = "I")
    public int field3779;

    @OriginalMember(owner = "client!vd", name = "Ze", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!vd", name = "bg", descriptor = "I")
    private int field3789;

    @OriginalMember(owner = "client!vd", name = "qf", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!vd", name = "df", descriptor = "F")
    private float field3740;

    @OriginalMember(owner = "client!vd", name = "ef", descriptor = "F")
    private float field3741;

    @OriginalMember(owner = "client!vd", name = "Qf", descriptor = "F")
    public float field3778;

    @OriginalMember(owner = "client!vd", name = "lg", descriptor = "[F")
    private float[] field3799;

    @OriginalMember(owner = "client!vd", name = "Se", descriptor = "F")
    public float field3729;

    @OriginalMember(owner = "client!vd", name = "ug", descriptor = "F")
    private float field3808;

    @OriginalMember(owner = "client!vd", name = "xf", descriptor = "[F")
    private float[] field3759;

    @OriginalMember(owner = "client!vd", name = "xg", descriptor = "F")
    public float field3811;

    @OriginalMember(owner = "client!vd", name = "Bg", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!vd", name = "Bf", descriptor = "I")
    private int field3763;

    @OriginalMember(owner = "client!vd", name = "Dg", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!vd", name = "Ig", descriptor = "[F")
    private float[] field3822;

    @OriginalMember(owner = "client!vd", name = "zg", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!vd", name = "Og", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!vd", name = "eg", descriptor = "I")
    private int field3792;

    @OriginalMember(owner = "client!vd", name = "Rg", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!vd", name = "Jg", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!vd", name = "Tf", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!vd", name = "Tg", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!vd", name = "Vg", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!vd", name = "Ng", descriptor = "F")
    public float field3827;

    @OriginalMember(owner = "client!vd", name = "ah", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!vd", name = "Hf", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!vd", name = "Kg", descriptor = "Z")
    private boolean field3824;

    @OriginalMember(owner = "client!vd", name = "dh", descriptor = "F")
    public float field3843;

    @OriginalMember(owner = "client!vd", name = "qg", descriptor = "[F")
    public float[] field3804;

    @OriginalMember(owner = "client!vd", name = "bf", descriptor = "F")
    public float field3738;

    @OriginalMember(owner = "client!vd", name = "We", descriptor = "Lpb;")
    public class299 field3733;

    @OriginalMember(owner = "client!vd", name = "kh", descriptor = "[I")
    public int[] field3850;

    @OriginalMember(owner = "client!vd", name = "jh", descriptor = "[B")
    public byte[] field3849;

    @OriginalMember(owner = "client!vd", name = "hh", descriptor = "[I")
    public int[] field3847;

    @OriginalMember(owner = "client!vd", name = "mh", descriptor = "[I")
    public int[] field3852;

    @OriginalMember(owner = "client!vd", name = "Gb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3561;

    @OriginalMember(owner = "client!vd", name = "Vd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3680;

    @OriginalMember(owner = "client!vd", name = "le", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!vd", name = "Hb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3562;

    @OriginalMember(owner = "client!vd", name = "kd", descriptor = "J")
    private long field3643;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
    private long field3497;

    @OriginalMember(owner = "client!vd", name = "Hg", descriptor = "Z")
    public boolean field3821;

    @OriginalMember(owner = "client!vd", name = "gh", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!vd", name = "uf", descriptor = "Ljava/lang/String;")
    private String field3756;

    @OriginalMember(owner = "client!vd", name = "kg", descriptor = "Z")
    public boolean field3798;

    @OriginalMember(owner = "client!vd", name = "cg", descriptor = "Z")
    private boolean field3790;

    @OriginalMember(owner = "client!vd", name = "ig", descriptor = "Z")
    public boolean field3796;

    @OriginalMember(owner = "client!vd", name = "hf", descriptor = "Z")
    public boolean field3744;

    @OriginalMember(owner = "client!vd", name = "bh", descriptor = "Z")
    private boolean field3841;

    @OriginalMember(owner = "client!vd", name = "Gf", descriptor = "Z")
    public boolean field3768;

    @OriginalMember(owner = "client!vd", name = "Pf", descriptor = "Ljava/lang/String;")
    private String field3777;

    @OriginalMember(owner = "client!vd", name = "yg", descriptor = "Z")
    public boolean field3812;

    @OriginalMember(owner = "client!vd", name = "zf", descriptor = "Z")
    private boolean field3761;

    @OriginalMember(owner = "client!vd", name = "ke", descriptor = "Lwp;")
    public class333 field3695;

    @OriginalMember(owner = "client!vd", name = "xe", descriptor = "Lab;")
    public class230 field3708;

    @OriginalMember(owner = "client!vd", name = "ge", descriptor = "Lfk;")
    private class92 field3691;

    @OriginalMember(owner = "client!vd", name = "fe", descriptor = "Lnr;")
    private class110 field3690;

    @OriginalMember(owner = "client!vd", name = "ie", descriptor = "Lvv;")
    private class530 field3693;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Ldp;")
    public static class347 field3517 = new class347("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!vd", name = "ee", descriptor = "Laa;")
    public static class76 field3689 = new class76(79, 2);

    @OriginalMember(owner = "client!vd", name = "ne", descriptor = "Ldp;")
    public static class347 field3698;

    @OriginalMember(owner = "client!vd", name = "ue", descriptor = "[[I")
    public static int[][] field3705;

    @OriginalMember(owner = "client!vd", name = "ve", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!vd", name = "ze", descriptor = "[I")
    public static int[] field3710;

    @OriginalMember(owner = "client!vd", name = "Ue", descriptor = "F")
    private float field3731;

    @OriginalMember(owner = "client!vd", name = "mf", descriptor = "F")
    public float field3748;

    @OriginalMember(owner = "client!vd", name = "sf", descriptor = "F")
    public float field3754;

    @OriginalMember(owner = "client!vd", name = "vf", descriptor = "F")
    public float field3757;

    @OriginalMember(owner = "client!vd", name = "Jf", descriptor = "F")
    public float field3771;

    @OriginalMember(owner = "client!vd", name = "Kf", descriptor = "F")
    private float field3772;

    @OriginalMember(owner = "client!vd", name = "Lf", descriptor = "F")
    private float field3773;

    @OriginalMember(owner = "client!vd", name = "mg", descriptor = "F")
    public float field3800;

    @OriginalMember(owner = "client!vd", name = "sg", descriptor = "F")
    public float field3806;

    @OriginalMember(owner = "client!vd", name = "Wg", descriptor = "F")
    public float field3836;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!vd", name = "lb", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!vd", name = "mb", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!vd", name = "nb", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!vd", name = "ob", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!vd", name = "pb", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!vd", name = "qb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!vd", name = "rb", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!vd", name = "sb", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!vd", name = "tb", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!vd", name = "ub", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!vd", name = "vb", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!vd", name = "wb", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!vd", name = "xb", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!vd", name = "yb", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!vd", name = "zb", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!vd", name = "Ab", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!vd", name = "Bb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!vd", name = "Cb", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!vd", name = "Db", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!vd", name = "Eb", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!vd", name = "Fb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!vd", name = "Ib", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!vd", name = "Jb", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!vd", name = "Kb", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!vd", name = "Lb", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!vd", name = "Mb", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!vd", name = "Nb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!vd", name = "Ob", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!vd", name = "Pb", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!vd", name = "Qb", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!vd", name = "Rb", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!vd", name = "Sb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!vd", name = "Tb", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!vd", name = "Ub", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!vd", name = "Vb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!vd", name = "Wb", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!vd", name = "Xb", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!vd", name = "Yb", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!vd", name = "Zb", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!vd", name = "ac", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!vd", name = "bc", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!vd", name = "cc", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!vd", name = "dc", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!vd", name = "ec", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!vd", name = "fc", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!vd", name = "gc", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!vd", name = "hc", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!vd", name = "ic", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!vd", name = "jc", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!vd", name = "kc", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!vd", name = "lc", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!vd", name = "mc", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!vd", name = "nc", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!vd", name = "oc", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!vd", name = "pc", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!vd", name = "rc", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!vd", name = "sc", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!vd", name = "tc", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!vd", name = "uc", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!vd", name = "vc", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!vd", name = "wc", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!vd", name = "xc", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!vd", name = "yc", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!vd", name = "zc", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!vd", name = "Ac", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!vd", name = "Bc", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!vd", name = "Cc", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!vd", name = "Dc", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!vd", name = "Ec", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!vd", name = "Fc", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!vd", name = "Gc", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!vd", name = "Hc", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!vd", name = "Ic", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!vd", name = "Jc", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!vd", name = "Kc", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!vd", name = "Lc", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!vd", name = "Mc", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!vd", name = "Nc", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!vd", name = "Oc", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!vd", name = "Pc", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!vd", name = "Qc", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!vd", name = "Rc", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!vd", name = "Sc", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!vd", name = "Tc", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!vd", name = "Uc", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!vd", name = "Vc", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!vd", name = "Wc", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!vd", name = "Xc", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!vd", name = "Yc", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!vd", name = "Zc", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!vd", name = "ad", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!vd", name = "bd", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!vd", name = "cd", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!vd", name = "dd", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!vd", name = "ed", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!vd", name = "fd", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!vd", name = "gd", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!vd", name = "hd", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!vd", name = "id", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!vd", name = "jd", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!vd", name = "ld", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!vd", name = "md", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!vd", name = "nd", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!vd", name = "od", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!vd", name = "pd", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!vd", name = "qd", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!vd", name = "rd", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!vd", name = "sd", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!vd", name = "td", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!vd", name = "ud", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!vd", name = "vd", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!vd", name = "wd", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!vd", name = "xd", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!vd", name = "yd", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!vd", name = "zd", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!vd", name = "Ad", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!vd", name = "Bd", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!vd", name = "Cd", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!vd", name = "Dd", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!vd", name = "Ed", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!vd", name = "Fd", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!vd", name = "Gd", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!vd", name = "Hd", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!vd", name = "Id", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!vd", name = "Jd", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!vd", name = "Kd", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!vd", name = "Ld", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!vd", name = "Md", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!vd", name = "Nd", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!vd", name = "Od", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!vd", name = "Pd", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!vd", name = "Qd", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!vd", name = "Rd", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!vd", name = "Sd", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!vd", name = "Td", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!vd", name = "Ud", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!vd", name = "Wd", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!vd", name = "Xd", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!vd", name = "Yd", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!vd", name = "Zd", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!vd", name = "ae", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!vd", name = "be", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!vd", name = "ce", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!vd", name = "de", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!vd", name = "se", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!vd", name = "Ie", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!vd", name = "Ke", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!vd", name = "Le", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!vd", name = "ff", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!vd", name = "kf", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!vd", name = "nf", descriptor = "I")
    private int field3749;

    @OriginalMember(owner = "client!vd", name = "of", descriptor = "I")
    private int field3750;

    @OriginalMember(owner = "client!vd", name = "pf", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!vd", name = "If", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!vd", name = "Yf", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!vd", name = "hg", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!vd", name = "ng", descriptor = "I")
    private int field3801;

    @OriginalMember(owner = "client!vd", name = "pg", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!vd", name = "tg", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!vd", name = "vg", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!vd", name = "Ag", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!vd", name = "Gg", descriptor = "I")
    private int field3820;

    @OriginalMember(owner = "client!vd", name = "Zg", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!vd", name = "ih", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!vd", name = "lh", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!vd", name = "Sf", descriptor = "J")
    private long field3780;

    @OriginalMember(owner = "client!vd", name = "Be", descriptor = "Lmd;")
    private class212 field3712;

    @OriginalMember(owner = "client!vd", name = "De", descriptor = "Lmd;")
    private class212 field3714;

    @OriginalMember(owner = "client!vd", name = "rg", descriptor = "Llm;")
    private class246 field3805;

    @OriginalMember(owner = "client!vd", name = "Yg", descriptor = "Llm;")
    private class246 field3838;

    @OriginalMember(owner = "client!vd", name = "ch", descriptor = "Ltj;")
    private class24 field3842;

    @OriginalMember(owner = "client!vd", name = "Sg", descriptor = "Lwq;")
    private class283 field3832;

    @OriginalMember(owner = "client!vd", name = "Ve", descriptor = "Lsg;")
    public class324 field3732;

    @OriginalMember(owner = "client!vd", name = "gf", descriptor = "Lsg;")
    public class324 field3743;

    @OriginalMember(owner = "client!vd", name = "Mf", descriptor = "Lsg;")
    public class324 field3774;

    @OriginalMember(owner = "client!vd", name = "Uf", descriptor = "Lsg;")
    public class324 field3782;

    @OriginalMember(owner = "client!vd", name = "Vf", descriptor = "Lsg;")
    public class324 field3783;

    @OriginalMember(owner = "client!vd", name = "Xf", descriptor = "Lsg;")
    public class324 field3785;

    @OriginalMember(owner = "client!vd", name = "fg", descriptor = "Lsg;")
    public class324 field3793;

    @OriginalMember(owner = "client!vd", name = "jg", descriptor = "Lsg;")
    public class324 field3797;

    @OriginalMember(owner = "client!vd", name = "Pg", descriptor = "Lsg;")
    public class324 field3829;

    @OriginalMember(owner = "client!vd", name = "eh", descriptor = "Lsg;")
    public class324 field3844;

    @OriginalMember(owner = "client!vd", name = "yf", descriptor = "Loj;")
    private class416 field3760;

    @OriginalMember(owner = "client!vd", name = "Af", descriptor = "Lft;")
    public class426 field3762;

    @OriginalMember(owner = "client!vd", name = "Mg", descriptor = "Lft;")
    public class426 field3826;

    @OriginalMember(owner = "client!vd", name = "af", descriptor = "Lhs;")
    public class446 field3737;

    @OriginalMember(owner = "client!vd", name = "Cg", descriptor = "Lhs;")
    public class446 field3816;

    @OriginalMember(owner = "client!vd", name = "Lg", descriptor = "Les;")
    public class476 field3825;

    @OriginalMember(owner = "client!vd", name = "we", descriptor = "Lok;")
    public static class74 field3707;

    @OriginalMember(owner = "client!vd", name = "ag", descriptor = "Lud;")
    public class94 field3788;

    @OriginalMember(owner = "client!vd", name = "pe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3700;

    @OriginalMember(owner = "client!vd", name = "Xe", descriptor = "Z")
    public boolean field3734;

    @OriginalMember(owner = "client!vd", name = "Ye", descriptor = "Z")
    public boolean field3735;

    @OriginalMember(owner = "client!vd", name = "tf", descriptor = "Z")
    public boolean field3755;

    @OriginalMember(owner = "client!vd", name = "wf", descriptor = "Z")
    public boolean field3758;

    @OriginalMember(owner = "client!vd", name = "Ef", descriptor = "Z")
    private boolean field3766;

    @OriginalMember(owner = "client!vd", name = "Ff", descriptor = "Z")
    public boolean field3767;

    @OriginalMember(owner = "client!vd", name = "Of", descriptor = "Z")
    private boolean field3776;

    @OriginalMember(owner = "client!vd", name = "Zf", descriptor = "Z")
    private boolean field3787;

    @OriginalMember(owner = "client!vd", name = "dg", descriptor = "Z")
    private boolean field3791;

    @OriginalMember(owner = "client!vd", name = "gg", descriptor = "Z")
    public boolean field3794;

    @OriginalMember(owner = "client!vd", name = "og", descriptor = "Z")
    private boolean field3802;

    @OriginalMember(owner = "client!vd", name = "wg", descriptor = "Z")
    public boolean field3810;

    @OriginalMember(owner = "client!vd", name = "Eg", descriptor = "Z")
    private boolean field3818;

    @OriginalMember(owner = "client!vd", name = "Fg", descriptor = "Z")
    private boolean field3819;

    @OriginalMember(owner = "client!vd", name = "Qg", descriptor = "Z")
    private boolean field3830;

    @OriginalMember(owner = "client!vd", name = "Ug", descriptor = "Z")
    private boolean field3834;

    @OriginalMember(owner = "client!vd", name = "Xg", descriptor = "Z")
    private boolean field3837;

    @OriginalMember(owner = "client!vd", name = "fh", descriptor = "Z")
    public boolean field3845;

    @OriginalMember(owner = "client!vd", name = "jf", descriptor = "[Lew;")
    private class271[] field3745;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "(F)V")
    public final void method90(float arg0) {
        if (this.field3771 != arg0) {
            this.field3771 = arg0;
            this.method1620((byte) 79);
        }
        ++field3639;
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
    private final void method1536(int arg0) {
        if (this.field3837) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3837 = false;
        }
        ++field3534;
        if (arg0 != 5890) {
            this.field3770 = -125;
        }
    }

    @OriginalMember(owner = "client!vd", name = "ea", descriptor = "(Lc;)V")
    public final void method55(class511 arg0) {
        this.field3737 = (class446) arg0;
        ++field3496;
        this.field3816.method2616(0, this.field3737);
        if (this.field3749 != 1) {
            this.method1593(-113);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V")
    private final void method1537(boolean arg0) {
        ++field3661;
        float[] var2 = this.field3799;
        if (!arg0) {
            this.field3770 = 80;
        }
        float var3 = (float) (-this.field3779 * this.field3747) / (float) this.field3835;
        float var4 = (float) ((-this.field3779 + this.field3595) * this.field3747) / (float) this.field3835;
        float var5 = (float) (this.field3828 * this.field3747) / (float) this.field3784;
        float var6 = (float) ((-this.field3610 + this.field3828) * this.field3747) / (float) this.field3784;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field3747 * 2.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[5] = var7 / (-var6 + var5);
            var2[1] = 0.0F;
            var2[10] = this.field3772 = (float) (-(this.field3817 - -this.field3747)) / (float) (-this.field3747 + this.field3817);
            var2[14] = this.field3773 = -((float) this.field3817 * var7) / (float) (-this.field3747 + this.field3817);
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[15] = 0.0F;
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
        } else {
            var2[2] = 0.0F;
            var2[1] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = 1.0F;
            var2[7] = 0.0F;
            var2[10] = 1.0F;
            var2[5] = 1.0F;
            var2[9] = 0.0F;
            var2[8] = 0.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[13] = 0.0F;
            var2[14] = 0.0F;
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[3] = 0.0F;
        }
        this.method1618((byte) 3);
    }

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "()Z")
    public final boolean method112() {
        ++field3684;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method1538(byte arg0) {
        ++field3524;
        OpenGL.glLightfv(16384, 4611, this.field3804, 0);
        if (arg0 > -4) {
            this.field3741 = -1.0966586F;
        }
        OpenGL.glLightfv(16385, 4611, this.field3764, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3555;
        this.method71(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lio;IIII)Lt;")
    public final class398 method150(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3518;
        return new class324(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZIIZ)V")
    public final void method1539(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (~this.field3807 != ~arg1) {
            if (~arg1 > -1) {
                this.method1536(5890);
                this.method1546(-2, (class271) null);
                this.method1582(0, true);
                if (!this.field3767) {
                    this.field3693.method3147(0, Integer.MAX_VALUE, arg3, arg0);
                }
            } else {
                class94 var5 = this.field3695.method2053(false, arg1);
                class161 var6 = super.field101.method1480(arg1, 14270);
                if (~var6.field2410 == -1 && ~var6.field2403 == -1) {
                    this.method1536(5890);
                } else {
                    int var7 = var6.field2421 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method1604((float) (this.field3703 % var8 * var6.field2410) / (float) var8, 0.0F, (byte) 117, (float) (this.field3703 % var8 * var6.field2403) / (float) var8);
                }
                if (!this.field3767) {
                    this.field3693.method3147(var6.field2412, Integer.MAX_VALUE, arg3, arg0);
                    this.field3693.method3144(var6.field2411, 120, var6.field2417);
                    if (!this.field3693.method3146((byte) -81, var5, var6.field2425)) {
                        this.method1546(-2, var5);
                        this.method1582(var6.field2425, true);
                    }
                } else {
                    this.field3693.method3147(3, Integer.MAX_VALUE, arg3, arg0);
                    this.method1546(-2, var5);
                    this.method1582(var6.field2425, true);
                }
            }
            this.field3807 = arg1;
        }
        ++field3624;
        if (arg2 >= 48) {
            this.field3786 &= -8;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3587;
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
    private final void method1540(int arg0) {
        if (arg0 != 0) {
            this.field3782 = null;
        }
        if (this.field3680 != null) {
            Dimension var2 = this.field3680.getSize();
            this.field3685 = var2.height;
            this.field3566 = var2.width;
        } else {
            this.field3566 = this.field3685 = 0;
        }
        ++field3583;
        if (this.field3714 == null) {
            this.field3595 = this.field3566;
            this.field3610 = this.field3685;
            this.method1563((byte) 67);
        }
        this.method1544(1097841176);
        this.method94();
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V")
    public final void method1541(int arg0) {
        ++field3607;
        if (arg0 < -61) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "()Z")
    public final boolean method118() {
        ++field3646;
        return this.field3834 && (!this.method124() || this.field3776);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    private final void method1542(byte arg0) {
        if (arg0 <= 20) {
            this.field3839 = 34;
        }
        this.field3748 = (float) (-this.field3779 + this.field3813);
        this.field3800 = (float) (this.field3781 - this.field3828);
        this.field3836 = (float) (-this.field3779 + this.field3736);
        this.field3754 = (float) (-this.field3828 + this.field3752);
        ++field3565;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
    private final void method1543(byte arg0) {
        if (arg0 >= -28) {
            this.method130(true);
        }
        ++field3569;
        if (this.field3787 && ~this.field3831 <= -1 | this.field3767) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "(I)V")
    public final void method1544(int arg0) {
        if (~this.field3749 != -1) {
            this.field3749 = 0;
            this.field3786 &= -32;
        }
        if (arg0 == 1097841176) {
            ++field3548;
        }
    }

    @OriginalMember(owner = "client!vd", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3529;
        float var10;
        float var11;
        if (this.field3832 != null && ~arg2 >= ~this.field3832.field1457 && this.field3832.field1459 >= arg3) {
            this.field3832.method735(6406, 3317, 0, arg6, 0, 0, arg2, 0, false, arg3);
            var10 = (float) arg3 * this.field3832.field4283 / (float) this.field3832.field1459;
            var11 = (float) arg2 * this.field3832.field4272 / (float) this.field3832.field1457;
        } else {
            this.field3832 = class292.method1814(arg2, 6406, 6406, arg3, this, 3557, false, arg6);
            this.field3832.method741(false, false, (byte) -92);
            var11 = this.field3832.field4272;
            var10 = this.field3832.field4283;
        }
        this.method1561((byte) 120);
        this.method1546(-2, this.field3832);
        this.method1594(arg8, 256);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1579((byte) -94, arg5);
        this.method1576(34165, 34165, (byte) 61);
        this.method1590(768, 34166, true, 0);
        this.method1590(770, 5890, true, 2);
        this.method1556(770, 34166, 0, 34184);
        this.method1556(770, 5890, 2, 34184);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method1590(768, 5890, true, 0);
        this.method1590(770, 34166, true, 2);
        this.method1556(770, 5890, 0, 34184);
        this.method1556(770, 34166, 2, 34184);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)I")
    public final int method1545(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3700 = null;
        }
        ++field3504;
        if (~arg0 == -2) {
            return 7681;
        } else if (~arg0 != -1) {
            if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 == -4) {
                return 260;
            } else if (~arg0 == -5) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 8448;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
    public final void method94() {
        this.field3752 = this.field3610;
        this.field3813 = this.field3595;
        ++field3543;
        this.field3736 = 0;
        this.field3781 = 0;
        OpenGL.glDisable(3089);
        this.method1542((byte) 121);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILew;)V")
    public final void method1546(int arg0, class271 arg1) {
        ++field3540;
        class271 var3 = this.field3745[this.field3750];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (arg1.field4033 != var3.field4033) {
                        OpenGL.glDisable(var3.field4033);
                        OpenGL.glEnable(arg1.field4033);
                    }
                } else {
                    OpenGL.glEnable(arg1.field4033);
                }
                OpenGL.glBindTexture(arg1.field4033, arg1.method1692(-123));
            } else {
                OpenGL.glDisable(var3.field4033);
            }
            this.field3745[this.field3750] = arg1;
        }
        this.field3786 &= arg0;
    }

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "()Z")
    public final boolean method126() {
        ++field3546;
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method108(Canvas arg0) {
        ++field3579;
        this.field3497 = 0L;
        this.field3680 = null;
        if (arg0 != null && this.field3561 != arg0) {
            if (this.field3597.containsKey(arg0)) {
                Long var2 = (Long) this.field3597.get(arg0);
                this.field3497 = var2;
                this.field3680 = arg0;
            }
        } else {
            this.field3680 = this.field3561;
            this.field3497 = this.field3643;
        }
        if (this.field3680 != null && this.field3497 != 0L) {
            this.field3562.setSurface(this.field3497);
            this.method1540(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
    public final int method100() {
        ++field3519;
        return this.field3747;
    }

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "()Z")
    public final boolean method156() {
        ++field3532;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILoj;II)V")
    public final void method1547(int arg0, int arg1, class416 arg2, int arg3, int arg4) {
        ++field3647;
        int var6 = arg2.method1199(arg0 ^ 9383);
        int var7 = arg3 * this.method1588(var6, (byte) 126);
        this.method1599(arg0 + 10975, arg2);
        if (arg0 != 23988) {
            this.field3820 = -106;
        }
        OpenGL.glDrawElements(arg1, arg4, var6, (long) var7 + arg2.method1200(-21691));
    }

    @OriginalMember(owner = "client!vd", name = "ca", descriptor = "(ILma;II)V")
    public final void method132(int arg0, class249 arg1, int arg2, int arg3) {
        ++field3586;
        class40 var5 = (class40) arg1;
        class283 var6 = var5.field527;
        this.method1561((byte) 120);
        this.method1546(-2, var5.field527);
        this.method1594(1, 256);
        this.method1576(7681, 8448, (byte) -76);
        this.method1590(768, 34167, true, 0);
        float var7 = var6.field4272 / (float) var6.field4273;
        float var8 = var6.field4283 / (float) var6.field4277;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3736) * var7, (float) (-arg3 + this.field3781) * var8);
        OpenGL.glVertex2i(this.field3736, this.field3781);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3736) * var7, (float) (-arg3 + this.field3752) * var8);
        OpenGL.glVertex2i(this.field3736, this.field3752);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3813) * var7, (float) (-arg3 + this.field3752) * var8);
        OpenGL.glVertex2i(this.field3813, this.field3752);
        OpenGL.glTexCoord2f((float) (this.field3813 - arg2) * var7, (float) (-arg3 + this.field3781) * var8);
        OpenGL.glVertex2i(this.field3813, this.field3781);
        OpenGL.glEnd();
        this.method1590(768, 5890, true, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([IIIII)Ll;")
    public final class127 method103(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3606;
        return new class348(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method129(Canvas arg0) {
        ++field3600;
        if (this.field3561 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3597.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3562.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3597.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V")
    public final void method1548(boolean arg0, byte arg1) {
        if (arg1 > 44) {
            if (!this.field3766 != !arg0) {
                this.field3766 = arg0;
                this.method1581(true);
            }
            ++field3509;
        }
    }

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "()Z")
    public final boolean method95() {
        ++field3527;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "()V")
    public final void method139() {
        ++field3505;
        for (class115 var1 = this.field3709.method2957(92); var1 != null; var1 = this.field3709.method2947(62)) {
            ((class206) var1).method1346(-92);
        }
        if (this.field3691 != null) {
            this.field3691.method729(1);
        }
        if (this.field3562 != null) {
            this.method1586((byte) -101);
            Enumeration var2 = this.field3597.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3597.get(var3);
                this.field3562.releaseSurface(var3, var4);
            }
            this.field3562.release();
            this.field3562 = null;
        }
        if (this.field3704) {
            class303.method1889(false, true, (byte) 15);
            this.field3704 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "(I)V")
    private final void method1549(int arg0) {
        if (this.field3749 != 2) {
            this.field3749 = 2;
            this.method1619(5274);
            this.method1593(-115);
            this.field3786 &= -8;
        }
        int var2 = -59 / ((arg0 - -35) / 60);
        ++field3580;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFZFF)V")
    public final void method1550(float arg0, float arg1, boolean arg2, float arg3, float arg4) {
        if (arg2) {
            this.method1611(74, 65, -68);
        }
        class377.field5688[1] = arg4;
        class377.field5688[3] = arg0;
        ++field3664;
        class377.field5688[0] = arg3;
        class377.field5688[2] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class377.field5688, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmd;B)V")
    public final void method1551(class212 arg0, byte arg1) {
        ++field3578;
        if (this.field3711 >= 0 && this.field3715[this.field3711] == arg0) {
            this.field3715[this.field3711--] = null;
            arg0.method1365(12318);
            if (arg1 != 123) {
                this.method66();
            }
            if (this.field3711 < 0) {
                this.field3714 = null;
            } else {
                this.field3714 = this.field3715[this.field3711];
                this.field3714.method1366((byte) 117);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public final synchronized void method1552(int arg0, int arg1, int arg2) {
        ++field3645;
        class221 var4 = new class221(arg2);
        var4.field1739 = (long) arg0;
        int var5 = 47 % ((-4 - arg1) / 56);
        this.field3724.method2958(var4, (byte) 68);
    }

    @OriginalMember(owner = "client!vd", name = "AA", descriptor = "(IIII)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        this.field3833 = arg3;
        this.field3823 = arg1;
        ++field3523;
        this.field3795 = arg0;
        this.field3730 = arg2;
        this.field3767 = true;
        this.field3693.method3147(3, Integer.MAX_VALUE, false, false);
        this.field3693.field7812.method22((byte) 114);
        this.method1606(1024);
        this.method1543((byte) -76);
    }

    @OriginalMember(owner = "client!vd", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3665;
        float var7 = (float) arg2 * this.field3737.field6568 + (float) arg0 * this.field3737.field6590 + (float) arg1 * this.field3737.field6586 + this.field3737.field6566;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3737.field6568 + (float) arg3 * this.field3737.field6590 + (float) arg4 * this.field3737.field6586 + this.field3737.field6566;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field3747) || !(var8 < (float) this.field3747)) && (!(var7 > (float) this.field3817) || !((float) this.field3817 < var8))) {
            int var9 = (int) (((float) arg2 * this.field3737.field6597 + (float) arg0 * this.field3737.field6598 + (float) arg1 * this.field3737.field6577 + this.field3737.field6574) * (float) this.field3835 / var7);
            int var10 = (int) (((float) arg5 * this.field3737.field6597 + (float) arg3 * this.field3737.field6598 + (float) arg4 * this.field3737.field6577 + this.field3737.field6574) * (float) this.field3835 / var8);
            if (this.field3836 > (float) var9 && this.field3836 > (float) var10 || (float) var9 > this.field3748 && this.field3748 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3737.field6581 + (float) arg0 * this.field3737.field6567 + (float) arg1 * this.field3737.field6565 + this.field3737.field6589) * (float) this.field3784 / var7);
                int var12 = (int) (((float) arg5 * this.field3737.field6581 + (float) arg3 * this.field3737.field6567 + (float) arg4 * this.field3737.field6565 + this.field3737.field6589) * (float) this.field3784 / var8);
                return (!((float) var11 < this.field3800) || !((float) var12 < this.field3800)) && (!((float) var11 > this.field3754) || !(this.field3754 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)V")
    public final void method1553(int arg0, int arg1) {
        ++field3567;
        if (arg1 == -8156) {
            if (~this.field3750 != ~arg0) {
                OpenGL.glActiveTexture(arg0 + 33984);
                this.field3750 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmd;I)V")
    public final void method1554(class212 arg0, int arg1) {
        ++field3556;
        if (arg1 != 12644) {
            this.method1602((byte) 96);
        }
        if (this.field3794) {
            this.method1621((byte) 54, arg0);
            this.method1551(arg0, (byte) 123);
        } else if (this.field3713 >= 0 && this.field3716[this.field3713] == arg0) {
            this.field3716[this.field3713--] = null;
            arg0.method1367(arg1 ^ 6008);
            if (~this.field3713 > -1) {
                this.field3712 = this.field3714 = null;
            } else {
                this.field3712 = this.field3714 = this.field3716[this.field3713];
                this.field3712.method1370(true);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method99(Canvas arg0) {
        ++field3558;
        long var2 = 0L;
        if (arg0 != null && this.field3561 != arg0) {
            if (this.field3597.containsKey(arg0)) {
                Long var4 = (Long) this.field3597.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3643;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field3562.surfaceResized(var2);
            if (this.field3680 == arg0) {
                this.method1540(0);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IF)V")
    public final void method1555(int arg0, float arg1) {
        ++field3640;
        if (arg0 < 53) {
            this.method1601((byte) -120);
        }
        if (this.field3741 != arg1) {
            this.field3741 = arg1;
            if (this.field3749 == 3) {
                this.method1598(-31);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class337 method70(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3568;
        return new class138(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V")
    public final void method1556(int arg0, int arg1, int arg2, int arg3) {
        ++field3609;
        OpenGL.glTexEnvi(8960, arg2 + arg3, arg1);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IZ)V")
    public final void method1557(int arg0, boolean arg1) {
        if (!arg1 != !this.field3818) {
            this.field3818 = arg1;
            this.method1591(true);
            this.field3786 &= -32;
        }
        ++field3608;
        if (arg0 != 18546) {
            this.method1612(-88, (byte) 45, false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "()Z")
    public final boolean method113() {
        ++field3619;
        if (this.field3690 != null) {
            if (!this.field3690.method1227(-112)) {
                if (!this.field3691.method728(this.field3690, (byte) -7)) {
                    return false;
                }
                this.field3695.method2054((byte) 88);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "xa", descriptor = "()F")
    public final float method82() {
        ++field3551;
        return this.field3806;
    }

    @OriginalMember(owner = "client!vd", name = "MA", descriptor = "(I)V")
    public final void method143(int arg0) {
        ++field3672;
        this.field3701 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field3701;
        }
        this.field3702 = 1 << this.field3701;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lu;)V")
    public final void method137(class346 arg0) {
        this.field3700 = ((class206) arg0).field2990;
        ++field3603;
        if (this.field3838 == null) {
            class299 var2 = new class299(80);
            if (!this.field3821) {
                var2.method1854((byte) -80, -1.0F);
                var2.method1854((byte) -80, -1.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, -1.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, -1.0F);
                var2.method1854((byte) -80, 1.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 0.0F);
                var2.method1854((byte) -80, 0.0F);
            } else {
                var2.method1856(-1.0F, 191);
                var2.method1856(-1.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(-1.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(-1.0F, 191);
                var2.method1856(1.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(0.0F, 191);
                var2.method1856(0.0F, 191);
            }
            this.field3838 = this.method1615(-109, var2.field6868, false, 20, var2.field6830);
            this.field3826 = new class426(this.field3838, 5126, 3, 0);
            this.field3762 = new class426(this.field3838, 5126, 2, 12);
            this.field3692.method481(this, 5121);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method81(Canvas arg0) {
        ++field3669;
        if (this.field3561 == arg0) {
            throw new RuntimeException();
        } else if (this.field3597.containsKey(arg0)) {
            Long var2 = (Long) this.field3597.get(arg0);
            this.field3562.releaseSurface(arg0, var2);
            this.field3597.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "(IIII)[I")
    public final int[] method102(int arg0, int arg1, int arg2, int arg3) {
        ++field3625;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field3610 + -arg1, arg2, 1, 32993, this.field3846, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljaggl/memory/NativeBuffer;ZIII)Llm;")
    public final class246 method1558(NativeBuffer arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3528;
        if (!this.field3790 || arg1 && !this.field3841) {
            if (arg4 != 8960) {
                this.method1563((byte) 4);
            }
            return new class450(this, arg3, arg0);
        } else {
            return new class173(this, arg3, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
    public final synchronized void method1559(boolean arg0, int arg1) {
        ++field3512;
        class115 var3 = new class115();
        var3.field1739 = (long) arg1;
        if (arg0) {
            this.method1550(-0.63568974F, -0.92117447F, true, -1.020933F, -0.3732575F);
        }
        this.field3727.method2958(var3, (byte) 82);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3503;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method1595(1);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1594(arg5, 256);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3834) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3834) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "(I)V")
    public static final void method1560(int arg0) {
        if (arg0 > -5) {
            field3705 = null;
        }
        ++field3570;
        class276.field4117 = true;
    }

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "()Z")
    public final boolean method146() {
        ++field3637;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "GA", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
        ++field3631;
        if (!this.field3767) {
            throw new RuntimeException("");
        } else {
            this.field3730 = arg2;
            this.field3833 = arg3;
            this.field3823 = arg1;
            this.field3795 = arg0;
            this.field3693.field7812.method22((byte) 111);
            this.method1606(1024);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
    public final void method1561(byte arg0) {
        if (arg0 != 120) {
            this.method1617(-46, 115, false);
        }
        ++field3594;
        if (~this.field3786 != -3) {
            this.method1575((byte) -89);
            this.method1596(false, false);
            this.method1574(false, arg0 + -241);
            this.method1571(true, false);
            this.method1557(18546, false);
            this.method1613(-2, -1);
            this.field3786 = 2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIII)V")
    public final void method60(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3522;
        this.method1595(1);
        this.method1594(arg4, 256);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLlm;)V")
    public final void method1562(byte arg0, class246 arg1) {
        if (this.field3805 != arg1) {
            if (this.field3790) {
                OpenGL.glBindBufferARB(34962, arg1.method1187(-1407));
            }
            this.field3805 = arg1;
        }
        ++field3622;
        int var3 = 122 / ((arg0 - -1) / 60);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    private final void method1563(byte arg0) {
        ++field3544;
        if (arg0 > 43) {
            OpenGL.glViewport(this.field3753, this.field3789, this.field3595, this.field3610);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
    private final void method1564(byte arg0) {
        ++field3590;
        int var2 = 0;
        if (arg0 >= -24) {
            this.field3738 = -1.7899494F;
        }
        while (!this.field3562.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class389.method2332(-99, 1000L);
        }
    }

    @OriginalMember(owner = "client!vd", name = "IA", descriptor = "()I")
    public final int method80() {
        ++field3525;
        return this.field3722 + this.field3721 + this.field3719;
    }

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "(III[I)V")
    public final void method92(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3628;
        float var5 = (float) arg2 * this.field3737.field6568 + (float) arg0 * this.field3737.field6590 + (float) arg1 * this.field3737.field6586 + this.field3737.field6566;
        if (!(var5 < (float) this.field3747) && !(var5 > (float) this.field3817)) {
            int var6 = (int) (((float) arg2 * this.field3737.field6597 + (float) arg0 * this.field3737.field6598 + (float) arg1 * this.field3737.field6577 + this.field3737.field6574) * (float) this.field3835 / var5);
            int var7 = (int) (((float) arg2 * this.field3737.field6581 + (float) arg0 * this.field3737.field6567 + (float) arg1 * this.field3737.field6565 + this.field3737.field6589) * (float) this.field3784 / var5);
            if (this.field3836 <= (float) var6 && (float) var6 <= this.field3748 && (float) var7 >= this.field3800 && this.field3754 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field3800);
                arg3[0] = (int) ((float) var6 + -this.field3836);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqs;)V")
    public final void method148(class50 arg0) {
        this.field3842 = (class24) arg0;
        ++field3511;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFF)V")
    public final void method63(float arg0, float arg1, float arg2) {
        ++field3652;
        class254.field3455 = arg2;
        class58.field799 = arg0;
        class159.field2388 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ldu;[Lul;Z)Lla;")
    public final class307 method61(class443 arg0, class319[] arg1, boolean arg2) {
        ++field3602;
        return new class485(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method147(Rectangle[] arg0, int arg1) {
        this.method161();
        ++field3520;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BZII)Loj;")
    public final class416 method1565(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 != -6407) {
            return null;
        } else {
            ++field3589;
            return (class416) (!this.field3790 || arg2 && !this.field3841 ? new class448(this, arg0, arg1, arg3) : new class176(this, arg0, arg1, arg3, arg2));
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(B)V")
    public final void method1566(byte arg0) {
        ++field3623;
        if (this.field3786 != 8) {
            this.method1549(-126);
            this.method1596(false, true);
            this.method1571(true, true);
            this.method1557(18546, true);
            this.method1594(1, 256);
            this.method1582(0, true);
            this.field3786 = 8;
        }
        if (arg0 < 126) {
            this.method1553(42, -54);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lmd;B)V")
    public final void method1567(class212 arg0, byte arg1) {
        ++field3591;
        if (this.field3718 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field3718 <= -1) {
                this.field3717[this.field3718].method1368(-1470);
            }
            this.field3712 = this.field3717[++this.field3718] = arg0;
            if (arg1 != -36) {
                this.method1568((class212) null, 13);
            }
            this.field3712.method1369((byte) 113);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[I[I)Lma;")
    public final class249 method78(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3656;
        return class55.method405(-122, arg0, this, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lmd;I)V")
    public final void method1568(class212 arg0, int arg1) {
        if (arg1 <= 84) {
            this.field3702 = -29;
        }
        ++field3657;
        if (!this.field3794) {
            if (this.field3713 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field3713 >= 0) {
                    this.field3716[this.field3713].method1367(9756);
                }
                this.field3712 = this.field3714 = this.field3716[++this.field3713] = arg0;
                this.field3712.method1370(true);
            }
        } else {
            this.method1567(arg0, (byte) -36);
            this.method1587(-122, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "()Z")
    public final boolean method138() {
        ++field3577;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
    public final void method130(boolean arg0) {
        ++field3627;
    }

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "()Z")
    public final boolean method124() {
        ++field3651;
        return this.field3690 != null && this.field3690.method1227(-125);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)I")
    public final int method1569(int arg0, byte arg1) {
        ++field3547;
        if (~arg0 != -6407 && ~arg0 != -6410) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 != -34844) {
                            if (arg0 != 34842) {
                                if (arg0 != 6402) {
                                    if (~arg0 == -6402) {
                                        return 1;
                                    } else {
                                        int var3 = 12 % ((63 - arg1) / 55);
                                        throw new IllegalArgumentException("");
                                    }
                                } else {
                                    return 3;
                                }
                            } else {
                                return 8;
                            }
                        } else {
                            return 6;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "(I)V")
    public final void method1570(int arg0) {
        if (arg0 != 7377) {
            this.field3748 = -1.2868525F;
        }
        OpenGL.glPopMatrix();
        ++field3687;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
    public final void method1571(boolean arg0, boolean arg1) {
        if (!arg1 != !this.field3819) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field3786 &= -32;
            this.field3819 = arg1;
        }
        ++field3515;
        if (!arg0) {
            this.field3741 = -0.052581932F;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lpv;)V")
    public final void method105(class46 arg0) {
        ++field3673;
        this.field3692.method484(17970, arg0, this);
    }

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "(I)V")
    public final void method1572(int arg0) {
        if (arg0 != 12770) {
            this.field3697 = null;
        }
        ++field3658;
        if (~this.field3786 != -17) {
            this.method1602((byte) -43);
            this.method1596(false, true);
            this.method1571(true, true);
            this.method1557(arg0 ^ 31120, true);
            this.method1594(1, 256);
            this.method1582(0, true);
            this.field3786 = 16;
        }
    }

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "(IIII)V")
    public final void method59(int arg0, int arg1, int arg2, int arg3) {
        this.field3779 = arg0;
        ++field3572;
        this.field3784 = arg3;
        this.field3828 = arg1;
        this.field3835 = arg2;
        this.method1537(true);
        this.method1542((byte) 43);
        if (~this.field3749 != -4) {
            if (this.field3749 == 2) {
                this.method1619(5274);
                return;
            }
        } else {
            this.method1598(-28);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BFF)V")
    public final void method1573(byte arg0, float arg1, float arg2) {
        this.field3808 = arg2;
        ++field3564;
        if (arg0 < 92) {
            this.field3758 = true;
        }
        this.field3740 = arg1;
        if (!this.field3767) {
            this.method1606(1024);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(ZI)V")
    public final void method1574(boolean arg0, int arg1) {
        ++field3513;
        if (arg0 == !this.field3791) {
            this.field3791 = arg0;
            this.method1581(true);
            this.field3786 &= -8;
        }
        if (arg1 > -50) {
            this.field3848 = 113;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[Lwr;)V")
    public final void method114(int arg0, class531[] arg1) {
        ++field3641;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field3765[var3] = arg1[var3];
        }
        this.field3820 = arg0;
        if (this.field3749 != 1) {
            this.method1614(121);
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)Lu;")
    public final class346 method151(int arg0) {
        ++field3601;
        class206 var2 = new class206(arg0);
        this.field3709.method2958(var2, (byte) 37);
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(B)V")
    private final void method1575(byte arg0) {
        if (~this.field3749 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3595 < -1 && ~this.field3610 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3595, (double) this.field3610, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3749 = 1;
            this.field3786 &= -25;
        }
        ++field3626;
        if (arg0 >= -72) {
            this.field3723 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
    public final void method1576(int arg0, int arg1, byte arg2) {
        int var4 = 48 % ((-15 - arg2) / 50);
        ++field3683;
        if (~this.field3750 == -1) {
            boolean var5 = false;
            if (this.field3792 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var5 = true;
                this.field3792 = arg0;
            }
            if (~this.field3769 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field3769 = arg1;
                var5 = true;
            }
            if (var5) {
                this.field3786 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)V")
    public final synchronized void method1577(int arg0, byte arg1, int arg2) {
        ++field3599;
        if (arg1 > -14) {
            this.method1546(-53, (class271) null);
        }
        class221 var4 = new class221(arg2);
        var4.field1739 = (long) arg0;
        this.field3723.method2958(var4, (byte) 84);
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(FF)V")
    public final void method154(float arg0, float arg1) {
        ++field3508;
        if (this.field3729 != arg0 || this.field3806 != arg1) {
            this.field3806 = arg1;
            this.field3729 = arg0;
            this.method1618((byte) 3);
            if (~this.field3749 == -4) {
                this.method1598(-116);
                return;
            }
            if (~this.field3749 != -3) {
                return;
            }
            this.method1619(5274);
        }
    }

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "(I)Z")
    public static final boolean method1578(int arg0) {
        ++field3536;
        if (class274.field4095 != 0) {
            return true;
        } else {
            if (arg0 != 10105) {
                method1578(-28);
            }
            return class111.field1697.method3119(arg0 + -10097);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)V")
    public final void method1579(byte arg0, int arg1) {
        ++field3612;
        class377.field5688[1] = (float) class140.method1023(65280, arg1) / 65280.0F;
        class377.field5688[0] = (float) class140.method1023(16711680, arg1) / 1.671168E7F;
        class377.field5688[3] = (float) (arg1 >>> 24) / 255.0F;
        class377.field5688[2] = (float) class140.method1023(255, arg1) / 255.0F;
        int var3 = 122 % ((arg0 - 68) / 43);
        OpenGL.glTexEnvfv(8960, 8705, class377.field5688, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class127 method153(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3549;
        return new class348(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "(I)V")
    private final void method1580(int arg0) {
        ++field3632;
        if (~this.field3813 <= ~this.field3736 && this.field3752 >= this.field3781) {
            OpenGL.glScissor(this.field3753 + this.field3736, this.field3789 - this.field3752 + this.field3610, -this.field3736 + this.field3813, -this.field3781 + this.field3752);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != -20032) {
            this.method1620((byte) -38);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(Z)V")
    private final void method1581(boolean arg0) {
        if (arg0) {
            if (this.field3791 && !this.field3766) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field3668;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IZ)V")
    public final void method1582(int arg0, boolean arg1) {
        ++field3630;
        if (~arg0 == -2) {
            this.method1576(7681, 7681, (byte) 103);
        } else if (arg0 != 0) {
            if (arg0 != 2) {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method1576(34023, 34023, (byte) 83);
                    }
                } else {
                    this.method1576(260, 8448, (byte) 103);
                }
            } else {
                this.method1576(34165, 7681, (byte) -109);
            }
        } else {
            this.method1576(8448, 8448, (byte) 116);
        }
        if (!arg1) {
            this.method140(-16, 46, -118, 84);
        }
    }

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "()Z")
    public final boolean method125() {
        ++field3686;
        return this.field3690 != null && (this.field3696 <= 1 || this.field3776);
    }

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "(I)V")
    public static final void method1583(int arg0) {
        class495.field7350 = false;
        if (arg0 == -12144) {
            ++field3514;
            class490.method2924(class27.field396, class274.field4094, class88.field1383, class148.field2227, 122);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)V")
    public final synchronized void method1584(byte arg0, int arg1) {
        if (arg0 <= -30) {
            ++field3500;
            class221 var3 = new class221(arg1);
            this.field3725.method2958(var3, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "()Z")
    public final boolean method87() {
        ++field3559;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "()Z")
    public final boolean method152() {
        ++field3616;
        return this.field3693.method3148((byte) -118, 3);
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "(B)I")
    private final int method1585(byte arg0) {
        ++field3611;
        int var2 = 0;
        this.field3777 = OpenGL.glGetString(7936).toLowerCase();
        this.field3756 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field3777.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field3777.indexOf("brian paul") != -1 || ~this.field3777.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class167.method1164(var3.replace('.', ' '), (byte) 73, ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class164.method1153(var4[0], arg0 ^ -29);
                int var6 = class164.method1153(var4[1], arg0 ^ -29);
                this.field3746 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field3746 < 12) {
            var2 |= 2;
        }
        if (!this.field3562.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3562.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        if (arg0 != -23) {
            this.method1569(1, (byte) 81);
        }
        this.field3809 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3770 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3839 = var7[0];
        if (~this.field3809 > -3 || ~this.field3770 > -3 || this.field3839 < 2) {
            var2 |= 16;
        }
        this.field3821 = NativeStream.method2853();
        this.field3562.arePbuffersAvailable();
        this.field3790 = this.field3562.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3834 = this.field3562.isExtensionAvailable("GL_ARB_multisample");
        this.field3755 = this.field3562.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3562.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3734 = this.field3562.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3735 = this.field3562.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3798 = this.field3562.isExtensionAvailable("GL_EXT_texture3D");
        this.field3744 = this.field3562.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3810 = this.field3562.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3796 = this.field3562.isExtensionAvailable("GL_ARB_texture_float");
        this.field3845 = false;
        this.field3812 = this.field3562.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field3794 = this.field3562.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field3758 = this.field3562.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field3776 = this.field3794 & this.field3758;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "(B)V")
    private final void method1586(byte arg0) {
        this.field3562.detach();
        ++field3592;
        if (arg0 >= -76) {
            this.method71(109, 9, 55, -118, 84, 98);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILmd;)V")
    public final void method1587(int arg0, class212 arg1) {
        if (arg0 < -117) {
            ++field3533;
            if (~this.field3711 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field3711 >= 0) {
                    this.field3715[this.field3711].method1365(12318);
                }
                this.field3714 = this.field3715[++this.field3711] = arg1;
                this.field3714.method1366((byte) -20);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "da", descriptor = "([I)V")
    public final void method109(int[] arg0) {
        arg0[2] = this.field3813;
        arg0[0] = this.field3736;
        ++field3675;
        arg0[3] = this.field3752;
        arg0[1] = this.field3781;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IB)I")
    public final int method1588(int arg0, byte arg1) {
        if (arg1 < 86) {
            method1600(61);
        }
        ++field3581;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (~arg0 != -5126 && ~arg0 != -5125 && arg0 != 5126) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
        ++field3676;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3) {
        ++field3545;
        this.field3691.method720(arg2, arg3, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
    public final void method134(boolean arg0) {
        ++field3563;
        this.field3824 = arg0;
        this.method1591(true);
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "(B)Lui;")
    public final class487 method1589(byte arg0) {
        ++field3654;
        if (arg0 > -82) {
            return null;
        } else {
            return this.field3842 != null ? this.field3842.method244(0) : null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "TA", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1595(1);
        ++field3531;
        this.method1594(arg4, 256);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "()F")
    public final float method157() {
        ++field3584;
        return this.field3729;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public final void method149(int arg0) {
        ++field3530;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field3694 = arg0;
            this.field3695.method2054((byte) 73);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZI)V")
    public final void method1590(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3667;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, arg1);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg0);
        if (!arg2) {
            this.field3829 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(Z)V")
    private final void method1591(boolean arg0) {
        ++field3614;
        if (!arg0) {
            this.method101(49, -1, 80, -40, 103, -110);
        }
        OpenGL.glDepthMask(this.field3818 && this.field3824);
    }

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "()V")
    public final void method88() {
        ++field3588;
        this.field3691.method721((byte) -48);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lt;Lpv;Lc;Lqb;I)V")
    public final void method73(class398 arg0, class46 arg1, class511 arg2, class518 arg3, int arg4) {
        ++field3617;
        arg0.method640(arg2, arg3, arg4);
        this.method105(arg1);
    }

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "(I)V")
    public static final void method1592(int arg0) {
        ++field3671;
        if (arg0 == -6402) {
            if (!class119.method899(class411.field6213, -3) && !class11.method106(class411.field6213, -127)) {
                int var1 = class410.field6198.field6065[0] >> 3;
                int var2 = class410.field6198.field6068[0] >> 3;
                if (~var1 <= -1 && ~var1 > ~(class50.field640 >> 3) && var2 >= 0 && var2 < class448.field6611 >> 3) {
                    class462.method2678(-11339, 5000, var1, var2);
                } else {
                    class462.method2678(-11339, 0, class50.field640 >> 4, class448.field6611 >> 4);
                }
            } else {
                class462.method2678(-11339, 5000, class282.field4263 >> 10, class393.field5897 >> 10);
            }
            class206.method1349(false);
            class36.method308((byte) 120);
            class348.method2104(arg0 ^ -6658);
            class110.method844((byte) -115);
        }
    }

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "(I)V")
    private final void method1593(int arg0) {
        ++field3560;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field3737.method2619((byte) 107), 0);
        if (arg0 >= -102) {
            this.method60(-71, 57, 103, -118, -37);
        }
        if (this.field3767) {
            this.field3693.field7812.method22((byte) 119);
        }
        this.method1538((byte) -21);
        this.method1614(-126);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(II)V")
    public final void method1594(int arg0, int arg1) {
        if (arg1 != 256) {
            this.method61((class443) null, (class319[]) null, true);
        }
        ++field3499;
        if (this.field3751 != arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 == 2) {
                    var3 = 2;
                    var4 = false;
                    var5 = true;
                } else if (~arg0 == -129) {
                    var3 = 3;
                    var5 = true;
                    var4 = true;
                } else {
                    var3 = 0;
                    var4 = false;
                    var5 = true;
                }
            } else {
                var3 = 1;
                var5 = true;
                var4 = true;
            }
            if (this.field3802 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field3802 = var5;
            }
            if (this.field3830 != var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field3830 = var4;
            }
            if (this.field3801 != var3) {
                if (~var3 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var3 != -3) {
                    if (var3 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field3801 = var3;
            }
            this.field3751 = arg0;
            this.field3786 &= -29;
        }
    }

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "(IFFFFF)V")
    public final void method122(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3634;
        boolean var7 = ~this.field3763 != ~arg0;
        if (var7 || this.field3811 != arg1 || this.field3827 != arg2) {
            this.field3811 = arg1;
            this.field3827 = arg2;
            this.field3763 = arg0;
            if (var7) {
                this.field3778 = (float) (this.field3763 & 16711680) / 1.671168E7F;
                this.field3739 = (float) (this.field3763 & 65280) / 65280.0F;
                this.field3775 = (float) (255 & this.field3763) / 255.0F;
                this.method1620((byte) 62);
            }
            this.method1610((byte) -125);
        }
        if (this.field3759[0] != arg3 || this.field3759[1] != arg4 || this.field3759[2] != arg5) {
            this.field3759[0] = arg3;
            this.field3759[2] = arg5;
            this.field3759[1] = arg4;
            this.field3822[0] = -arg3;
            this.field3822[2] = -arg5;
            this.field3822[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3804[2] = arg5 * var8;
            this.field3804[1] = arg4 * var8;
            this.field3804[0] = arg3 * var8;
            this.field3764[2] = -this.field3804[2];
            this.field3764[1] = -this.field3804[1];
            this.field3764[0] = -this.field3804[0];
            this.method1538((byte) -10);
            this.field3742 = (int) (arg3 * 256.0F / arg4);
            this.field3803 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "(I)V")
    private final void method1595(int arg0) {
        if (~this.field3786 != -2) {
            this.method1575((byte) -89);
            this.method1596(false, false);
            this.method1574(false, -100);
            this.method1571(true, false);
            this.method1557(18546, false);
            this.method1546(arg0 + -3, (class271) null);
            this.method1613(-2, -1);
            this.method1582(1, true);
            this.field3786 = 1;
        }
        ++field3521;
        if (arg0 != 1) {
            this.field3699 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "UA", descriptor = "(III)V")
    public final void method141(int arg0, int arg1, int arg2) {
        ++field3621;
        if (~this.field3840 != ~arg0 || this.field3831 != arg1 || ~this.field3815 != ~arg2) {
            this.field3831 = arg1;
            this.field3815 = arg2;
            this.field3840 = arg0;
            if (this.field3767) {
                return;
            }
            this.method1606(1024);
            this.method1543((byte) -73);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lt;Lc;[Lqb;I)V")
    public final void method135(class398[] arg0, class511 arg1, class518[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method640(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field3573;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;ILec;)V")
    public class258(int arg0, Canvas arg1, class243 arg2, int arg3, class109 arg4) {
        super(arg0, arg2);
        new class275();
        new class517(16);
        this.field3720 = new class497();
        this.field3723 = new class497();
        this.field3724 = new class497();
        this.field3725 = new class497();
        this.field3726 = new class497();
        this.field3727 = new class497();
        this.field3728 = new class497();
        this.field3730 = -1;
        this.field3739 = 1.0F;
        this.field3753 = 0;
        this.field3747 = 50;
        this.field3775 = 1.0F;
        this.field3765 = new class531[class471.field6900];
        this.field3784 = 512;
        this.field3764 = new float[4];
        this.field3779 = 0;
        this.field3736 = 0;
        this.field3789 = 0;
        this.field3752 = 0;
        this.field3740 = 0.0F;
        this.field3741 = 1.0F;
        this.field3778 = 1.0F;
        this.field3799 = new float[16];
        this.field3729 = 3000.0F;
        this.field3808 = 1.0F;
        this.field3759 = new float[4];
        this.field3811 = -1.0F;
        this.field3815 = 0;
        this.field3763 = -1;
        this.field3817 = 3584;
        this.field3822 = new float[4];
        this.field3813 = 0;
        this.field3828 = 0;
        this.field3792 = 8448;
        this.field3831 = -1;
        this.field3823 = -1;
        this.field3781 = 0;
        this.field3833 = 0;
        this.field3835 = 512;
        this.field3827 = -1.0F;
        this.field3840 = -1;
        this.field3769 = 8448;
        this.field3824 = true;
        this.field3843 = 3584.0F;
        this.field3804 = new float[4];
        this.field3738 = 3584.0F;
        this.field3733 = new class299(8192);
        this.field3850 = new int[1];
        this.field3849 = new byte[16384];
        this.field3847 = new int[1];
        this.field3852 = new int[1];
        this.field3680 = this.field3561 = arg1;
        this.field3696 = arg3;
        try {
            if (class167.field2477 == null || !class167.field2477) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class167.field2477 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method818("libjaggl.jnilib", (byte) -127).toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method818("jaggl.dll", (byte) -127).toString());
                        }
                    } else {
                        System.load(arg4.method818("libjaggl.so", (byte) -127).toString());
                    }
                    class167.field2477 = Boolean.TRUE;
                }
            }
            if (class167.field2477 != null && class167.field2477) {
                this.field3562 = new OpenGL();
                this.field3497 = this.field3643 = this.field3562.init(arg1, 8, 8, 8, 24, 0, this.field3696);
                if (this.field3643 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1564((byte) -90);
                    int var7 = this.method1585((byte) -23);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field3846 = this.field3821 ? 33639 : 5121;
                        if (~this.field3756.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class167.method1164(this.field3756.replace('/', ' '), (byte) 73, ' ');
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && ~var13.length() <= -4 && class36.method300(var13.substring(1, 3), (byte) 0)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (var13.length() >= 4 && class36.method300(var13.substring(0, 4), (byte) 0)) {
                                                var8 = class164.method1153(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field3798 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -8000) {
                                    this.field3790 = false;
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field3796 = false;
                            }
                            this.field3744 &= this.field3562.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field3841 = this.field3790;
                            this.field3768 = true;
                        }
                        if (~this.field3777.indexOf("intel") != 0) {
                            this.field3812 = false;
                        }
                        this.field3761 = !this.field3777.equals("s3 graphics");
                        if (this.field3790) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class68.method478(true, 0, false);
                        this.field3704 = true;
                        this.field3695 = new class333(this, super.field101);
                        this.method1601((byte) -128);
                        this.field3708 = new class230(this);
                        this.field3691 = new class92(this);
                        if (this.field3691.method730((byte) 38)) {
                            this.field3690 = new class110(this);
                            if (!this.field3690.method856((byte) -49)) {
                                this.field3690.method849((byte) -3);
                                this.field3690 = null;
                            }
                        }
                        this.field3693 = new class530(this);
                        this.method1608(516);
                        this.method1540(0);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field3562.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class389.method2332(-5, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
            this.method139();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()Z")
    public final boolean method65() {
        ++field3629;
        return false;
    }

    @OriginalMember(owner = "client!vd", name = "ia", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        if (~this.field3747 != ~arg0 || ~this.field3817 != ~arg1) {
            this.field3817 = arg1;
            this.field3747 = arg0;
            this.method1537(true);
            this.method1606(1024);
            if (this.field3749 != 3) {
                if (~this.field3749 == -3) {
                    this.method1619(5274);
                }
            } else {
                this.method1598(-90);
            }
        }
        ++field3663;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lt;Lpv;Lc;[Lqb;I)V")
    public final void method119(class398[] arg0, class46 arg1, class511 arg2, class518[] arg3, int arg4) {
        ++field3662;
        this.method135(arg0, arg2, arg3, arg4);
        this.method105(arg1);
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()I")
    public final int method72() {
        ++field3615;
        return 4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lqs;Lqs;FLqs;)Lqs;")
    public final class50 method117(class50 arg0, class50 arg1, float arg2, class50 arg3) {
        ++field3526;
        if (arg0 != null && arg1 != null && this.field3810 && this.field3812) {
            class458 var5 = null;
            class24 var6 = (class24) arg0;
            class24 var7 = (class24) arg1;
            class487 var8 = var6.method244(0);
            class487 var9 = var7.method244(0);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field7244 < ~var9.field7244 ? var8.field7244 : var9.field7244;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class458) {
                    class458 var11 = (class458) arg3;
                    if (~var11.method2657((byte) 103) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class458(this, var10);
                }
                if (var5.method2659(var8, 1, arg2, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZZ)V")
    public final void method1596(boolean arg0, boolean arg1) {
        if (this.field3787 != arg1) {
            this.field3787 = arg1;
            this.method1543((byte) -91);
            this.field3786 &= -32;
        }
        if (arg0) {
            this.method125();
        }
        ++field3575;
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "()Lc;")
    public final class511 method75() {
        ++field3650;
        return new class446();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class249 arg6, int arg7, int arg8) {
        ++field3682;
        class40 var10 = (class40) arg6;
        class283 var11 = var10.field527;
        this.method1561((byte) 120);
        this.method1546(-2, var10.field527);
        this.method1594(arg5, 256);
        this.method1576(7681, 8448, (byte) -121);
        this.method1590(768, 34167, true, 0);
        float var12 = var11.field4272 / (float) var11.field4273;
        float var13 = var11.field4283 / (float) var11.field4277;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1590(768, 5890, true, 0);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
    public final int method160(int arg0, int arg1) {
        ++field3507;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lft;Lft;ILft;Lft;)V")
    public final void method1597(class426 arg0, class426 arg1, int arg2, class426 arg3, class426 arg4) {
        if (arg0 != null) {
            this.method1562((byte) 99, arg0.field6343);
            OpenGL.glVertexPointer(arg0.field6354, arg0.field6344, this.field3805.method1190(arg2 + -1738), this.field3805.method1189(false) + (long) arg0.field6348);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field3552;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method1562((byte) 115, arg3.field6343);
            OpenGL.glNormalPointer(arg3.field6344, this.field3805.method1190(-1739), this.field3805.method1189(false) - -((long) arg3.field6348));
            OpenGL.glEnableClientState(32885);
        }
        if (arg1 != null) {
            this.method1562((byte) -117, arg1.field6343);
            OpenGL.glColorPointer(arg1.field6354, arg1.field6344, this.field3805.method1190(-1739), this.field3805.method1189(false) - -((long) arg1.field6348));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 == -1) {
            if (arg4 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method1562((byte) -128, arg4.field6343);
                OpenGL.glTexCoordPointer(arg4.field6354, arg4.field6344, this.field3805.method1190(-1739), this.field3805.method1189(false) + (long) arg4.field6348);
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "(I)V")
    private final void method1598(int arg0) {
        ++field3576;
        float var2 = (float) (-this.field3779) * this.field3741 / (float) this.field3835;
        if (arg0 >= -24) {
            this.field3743 = null;
        }
        float var3 = (float) (-this.field3828) * this.field3741 / (float) this.field3784;
        float var4 = (float) (this.field3595 - this.field3779) * this.field3741 / (float) this.field3835;
        float var5 = (float) (-this.field3828 + this.field3610) * this.field3741 / (float) this.field3784;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field3747 + -this.field3806), (double) ((float) this.field3817 - this.field3806));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILoj;)V")
    public final void method1599(int arg0, class416 arg1) {
        if (arg0 != 34963) {
            this.method162(59, 96, 29, -54, -42, 47);
        }
        ++field3642;
        if (this.field3760 != arg1) {
            if (this.field3790) {
                OpenGL.glBindBufferARB(34963, arg1.method1204(-1124));
            }
            this.field3760 = arg1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "(I)V")
    public static void method1600(int arg0) {
        field3705 = null;
        field3707 = null;
        field3698 = null;
        field3517 = null;
        field3689 = null;
        int var1 = 14 % ((-56 - arg0) / 61);
        field3710 = null;
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "(B)V")
    private final void method1601(byte arg0) {
        ++field3585;
        this.field3737 = new class446();
        this.field3816 = new class446();
        this.field3745 = new class271[this.field3809];
        this.field3788 = new class94(this, 3553, 6408, 1, 1);
        new class94(this, 3553, 6408, 1, 1);
        new class94(this, 3553, 6408, 1, 1);
        this.field3743 = new class324(this);
        this.field3829 = new class324(this);
        this.field3793 = new class324(this);
        this.field3732 = new class324(this);
        this.field3774 = new class324(this);
        this.field3844 = new class324(this);
        this.field3797 = new class324(this);
        this.field3782 = new class324(this);
        this.field3783 = new class324(this);
        if (arg0 > -23) {
            this.field3766 = false;
        }
        this.field3785 = new class324(this);
        if (this.field3812) {
            this.field3825 = new class476(this);
            new class476(this);
        }
    }

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "()I")
    public final int method115() {
        ++field3550;
        int var1 = this.field3848;
        this.field3848 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "(B)V")
    private final void method1602(byte arg0) {
        if (~this.field3749 != -4) {
            this.field3749 = 3;
            this.method1598(-33);
            this.method1593(-104);
            this.field3786 &= -8;
        }
        if (arg0 != -43) {
            this.field3767 = false;
        }
        ++field3681;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIF)Lwr;")
    public final class531 method136(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3538;
        return new class247(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vd", name = "OA", descriptor = "(IIII)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        ++field3574;
        if (~arg2 < ~this.field3595) {
            arg2 = this.field3595;
        }
        if (~arg3 < ~this.field3610) {
            arg3 = this.field3610;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field3813 = arg2;
        this.field3781 = arg1;
        this.field3752 = arg3;
        this.field3736 = arg0;
        OpenGL.glEnable(3089);
        this.method1542((byte) 63);
        this.method1580(-20032);
    }

    @OriginalMember(owner = "client!vd", name = "ZA", descriptor = "()I")
    public final int method110() {
        ++field3655;
        int var1 = this.field3851;
        this.field3851 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field3638;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()Lc;")
    public final class511 method66() {
        ++field3571;
        return this.field3697;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final synchronized void method83(int arg0) {
        ++field3620;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3723.method2954((byte) -122)) {
            class221 var12 = (class221) this.field3723.method2951((byte) -66);
            class402.field6076[var2++] = (int) var12.field1739;
            this.field3719 -= var12.field3155;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class402.field6076, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class402.field6076, 0);
            var2 = 0;
        }
        while (!this.field3724.method2954((byte) -60)) {
            class221 var11 = (class221) this.field3724.method2951((byte) -53);
            class402.field6076[var2++] = (int) var11.field1739;
            this.field3721 -= var11.field3155;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class402.field6076, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class402.field6076, 0);
            var2 = 0;
        }
        while (!this.field3725.method2954((byte) -107)) {
            class221 var10 = (class221) this.field3725.method2951((byte) 78);
            class402.field6076[var2++] = var10.field3155;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class402.field6076, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class402.field6076, 0);
            var2 = 0;
        }
        while (!this.field3726.method2954((byte) 116)) {
            class221 var9 = (class221) this.field3726.method2951((byte) -50);
            class402.field6076[var2++] = (int) var9.field1739;
            this.field3722 -= var9.field3155;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class402.field6076, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class402.field6076, 0);
            boolean var4 = false;
        }
        while (!this.field3720.method2954((byte) 71)) {
            class221 var8 = (class221) this.field3720.method2951((byte) 73);
            OpenGL.glDeleteLists((int) var8.field1739, var8.field3155);
        }
        while (!this.field3727.method2954((byte) -47)) {
            class115 var7 = this.field3727.method2951((byte) -126);
            OpenGL.glDeleteProgramARB((int) var7.field1739);
        }
        while (!this.field3728.method2954((byte) -36)) {
            class115 var6 = this.field3728.method2951((byte) -70);
            OpenGL.glDeleteObjectARB(var6.field1739);
        }
        while (!this.field3720.method2954((byte) -113)) {
            class221 var5 = (class221) this.field3720.method2951((byte) -49);
            OpenGL.glDeleteLists((int) var5.field1739, var5.field3155);
        }
        this.field3695.method2056((byte) -117);
        if (this.method80() > 100663296 && this.field3780 - -60000L < class381.method2281((byte) 109)) {
            System.gc();
            this.field3780 = class381.method2281((byte) 38);
        }
        this.field3703 = var3;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "()V")
    public final void method74() {
        ++field3644;
        if (this.field3761 && ~this.field3595 < -1 && this.field3610 > 0) {
            int var1 = this.field3736;
            int var2 = this.field3813;
            int var3 = this.field3781;
            int var4 = this.field3752;
            this.method94();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1544(1097841176);
            this.method1596(false, false);
            this.method1574(false, -98);
            this.method1571(true, false);
            this.method1557(18546, false);
            this.method1546(-2, (class271) null);
            this.method1613(-2, -1);
            this.method1582(1, true);
            this.method1594(0, 256);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3595, this.field3610, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method84(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!vd", name = "fa", descriptor = "(IIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3) {
        ++field3498;
        if (this.field3781 < arg1) {
            this.field3781 = arg1;
        }
        if (arg3 < this.field3752) {
            this.field3752 = arg3;
        }
        if (~this.field3813 < ~arg2) {
            this.field3813 = arg2;
        }
        if (~this.field3736 > ~arg0) {
            this.field3736 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method1542((byte) 46);
        this.method1580(-20032);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        this.method1564((byte) -47);
        ++field3516;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLhs;)V")
    public final void method1603(byte arg0, class446 arg1) {
        if (arg0 <= 26) {
            this.field3816 = null;
        }
        OpenGL.glPushMatrix();
        ++field3633;
        OpenGL.glMultMatrixf(arg1.method2619((byte) 107), 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFBF)V")
    private final void method1604(float arg0, float arg1, byte arg2, float arg3) {
        if (arg2 <= 75) {
            this.field3817 = 14;
        }
        ++field3501;
        OpenGL.glMatrixMode(5890);
        if (this.field3837) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg1);
        OpenGL.glMatrixMode(5888);
        this.field3837 = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lul;Z)Ll;")
    public final class127 method98(class319 arg0, boolean arg1) {
        ++field3539;
        int[] var3 = new int[arg0.field4922 * arg0.field4920];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4917 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field4920; ++var6) {
                for (int var7 = 0; var7 < arg0.field4922; ++var7) {
                    int var8 = arg0.field4923[arg0.field4921[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class390.method2340(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field4920; ++var9) {
                for (int var11 = 0; arg0.field4922 > var11; ++var11) {
                    var3[var5++] = class390.method2340(arg0.field4917[var4] << 24, arg0.field4923[class140.method1023(arg0.field4921[var4], 255)]);
                    ++var4;
                }
            }
        }
        class127 var10 = this.method103(var3, 0, arg0.field4922, arg0.field4922, arg0.field4920);
        var10.method464(arg0.field4918, arg0.field4925, arg0.field4919, arg0.field4924);
        return var10;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIIIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1595(1);
        ++field3677;
        this.method1594(arg5, 256);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V")
    public final void method1605(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -93 % ((-31 - arg2) / 52);
        ++field3678;
        OpenGL.glDrawArrays(arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "(I)V")
    private final void method1606(int arg0) {
        ++field3679;
        int var2;
        if (this.field3767) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field3823;
        } else {
            this.field3731 = (float) (-this.field3815 + this.field3817) + -this.field3740;
            this.field3757 = this.field3731 - (float) this.field3831 * this.field3808;
            if ((float) this.field3747 > this.field3757) {
                this.field3757 = (float) this.field3747;
            }
            OpenGL.glFogf(2915, this.field3757);
            OpenGL.glFogf(2916, this.field3731);
            var2 = this.field3840;
        }
        if (arg0 != 1024) {
            this.method154(0.639865F, -0.5955176F);
        }
        class377.field5688[2] = (float) class140.method1023(var2, 255) / 255.0F;
        class377.field5688[0] = (float) class140.method1023(var2, 16711680) / 1.671168E7F;
        class377.field5688[1] = (float) class140.method1023(65280, var2) / 65280.0F;
        OpenGL.glFogfv(2918, class377.field5688, 0);
        if (this.field3767) {
            this.field3693.field7812.method23(-1280);
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(Z)V")
    public final void method1607(boolean arg0) {
        ++field3688;
        if (this.field3786 != 4) {
            this.method1575((byte) -102);
            this.method1596(!arg0, false);
            this.method1574(false, -87);
            this.method1571(arg0, false);
            this.method1557(18546, false);
            this.method1613(-2, -1);
            this.method1594(1, 256);
            this.method1582(0, true);
            this.field3786 = 4;
        }
        if (!arg0) {
            this.method1617(-47, -91, true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "(I)V")
    private final void method1608(int arg0) {
        this.method1613(-2, -1);
        ++field3537;
        for (int var2 = this.field3809 - 1; ~var2 <= -1; --var2) {
            this.method1553(var2, arg0 + -8672);
            this.method1546(-2, (class271) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1576(8448, 8448, (byte) -120);
        this.method1590(770, 34168, true, 2);
        this.method1536(5890);
        this.field3751 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field3801 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(arg0, 0.0F);
        this.field3830 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field3802 = true;
        this.method1596(false, true);
        this.method1574(true, -97);
        this.method1571(true, true);
        this.method1557(18546, true);
        this.method1544(arg0 ^ 1097840668);
        this.field3562.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; ~var4 > -9; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field3763 = this.field3840 = -1;
        this.method94();
    }

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "(IIIIII)V")
    public final void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3648;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1595(1);
        this.method1594(arg5, 256);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3834) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3834) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JI)V")
    public final synchronized void method1609(long arg0, int arg1) {
        ++field3605;
        class115 var4 = new class115();
        var4.field1739 = arg0;
        this.field3728.method2958(var4, (byte) 106);
        if (arg1 != -15490) {
            this.field3597 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "YA", descriptor = "()I")
    public final int method128() {
        ++field3506;
        return this.field3817;
    }

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "(B)V")
    private final void method1610(byte arg0) {
        class377.field5688[0] = this.field3811 * this.field3778;
        class377.field5688[3] = 1.0F;
        class377.field5688[2] = this.field3811 * this.field3775;
        class377.field5688[1] = this.field3811 * this.field3739;
        if (arg0 >= -122) {
            this.field3768 = true;
        }
        ++field3502;
        OpenGL.glLightfv(16384, 4609, class377.field5688, 0);
        class377.field5688[3] = 1.0F;
        class377.field5688[2] = -this.field3827 * this.field3775;
        class377.field5688[1] = -this.field3827 * this.field3739;
        class377.field5688[0] = -this.field3827 * this.field3778;
        OpenGL.glLightfv(16385, 4609, class377.field5688, 0);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public final void method1611(int arg0, int arg1, int arg2) {
        this.field3789 = arg1;
        if (arg0 == 18113) {
            this.field3753 = arg2;
            ++field3557;
            this.method1563((byte) 83);
            this.method1580(-20032);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBZ)V")
    public final void method1612(int arg0, byte arg1, boolean arg2) {
        if (arg1 > 89) {
            ++field3593;
            this.method1539(arg2, arg0, 57, true);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(II)V")
    public final void method1613(int arg0, int arg1) {
        this.method1612(arg0, (byte) 110, true);
        ++field3542;
        if (arg1 != -1) {
            this.method142(-93, 103, 10, 97, -26, -98, (class249) null, 27, -49);
        }
    }

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "()V")
    public final void method161() {
        ++field3636;
        try {
            this.field3562.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "(I)V")
    private final void method1614(int arg0) {
        ++field3510;
        int var2;
        for (var2 = 0; this.field3820 > var2; ++var2) {
            class531 var4 = this.field3765[var2];
            class306.field4573[0] = (float) var4.method3157(-64);
            int var5 = var2 + 16386;
            class306.field4573[1] = (float) var4.method3154(false);
            class306.field4573[2] = (float) var4.method3150((byte) 107);
            class306.field4573[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class306.field4573, 0);
            int var6 = var4.method3152(7);
            float var7 = var4.method3151((byte) -28) / 255.0F;
            class306.field4573[2] = (float) class140.method1023(var6, 255) * var7;
            class306.field4573[0] = var7 * (float) class140.method1023(255, var6 >> 16);
            class306.field4573[1] = (float) (class140.method1023(var6, 65412) >> 8) * var7;
            OpenGL.glLightfv(var5, 4609, class306.field4573, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method3156(90) * var4.method3156(-90)));
            OpenGL.glEnable(var5);
        }
        int var3 = 20 % ((-65 - arg0) / 43);
        while (var2 < this.field3814) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field3814 = this.field3820;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I[BZII)Llm;")
    public final class246 method1615(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field3635;
        if (!this.field3790 || arg2 && !this.field3841) {
            int var6 = -46 % ((arg0 - -65) / 32);
            return new class450(this, arg3, arg1, arg4);
        } else {
            return new class173(this, arg3, arg1, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhs;I)V")
    public final void method1616(class446 arg0, int arg1) {
        if (arg1 != -26305) {
            this.field3680 = null;
        }
        OpenGL.glLoadMatrixf(arg0.method2619((byte) 107), 0);
        ++field3670;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V")
    public final void method56() {
        ++field3598;
        this.method1557(18546, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "(I)V")
    public final void method85(int arg0) {
        this.method1594(0, 256);
        ++field3660;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "()V")
    public final void method62() {
        ++field3659;
        this.field3767 = false;
        this.field3693.method3147(0, Integer.MAX_VALUE, false, false);
        this.method1606(1024);
        this.method1543((byte) -81);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method1617(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field3770 = -70;
        }
        ++field3541;
        class221 var4 = new class221(arg0);
        var4.field1739 = (long) arg1;
        this.field3726.method2958(var4, (byte) 78);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I")
    public final int method120(int arg0, int arg1) {
        ++field3582;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "()V")
    public final void method86() {
        ++field3674;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public final void method96(int arg0) {
        ++field3596;
        this.method1586((byte) -95);
    }

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "(B)V")
    private final void method1618(byte arg0) {
        ++field3604;
        if (this.field3806 == 0.0F) {
            this.field3799[10] = this.field3772;
            this.field3799[14] = this.field3773;
        } else {
            float var2 = this.field3729 / (this.field3806 + this.field3729);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field3773 * (1.0F - var2) / this.field3806;
            this.field3799[14] = this.field3773 * var3;
            this.field3799[10] = this.field3772 + var4;
        }
        if (arg0 == 3) {
            this.field3738 = (this.field3799[14] + (float) (-this.field3817)) / this.field3799[10];
            this.field3843 = (float) this.field3817 - this.field3806;
        }
    }

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "(I)V")
    private final void method1619(int arg0) {
        ++field3618;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field3799, 0);
        if (arg0 != 5274) {
            this.field3697 = null;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(IIIIII)Lqs;")
    public final class50 method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3653;
        return !this.field3810 ? null : new class435(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V")
    public final void method64() {
        ++field3649;
        if (this.field3690 != null && this.field3690.method1227(67)) {
            this.field3691.method723(this.field3690, (byte) 65);
            this.field3695.method2054((byte) 119);
        }
    }

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "()Z")
    public final boolean method97() {
        ++field3553;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "(B)V")
    private final void method1620(byte arg0) {
        class377.field5688[3] = 1.0F;
        class377.field5688[1] = this.field3771 * this.field3739;
        ++field3535;
        class377.field5688[0] = this.field3778 * this.field3771;
        class377.field5688[2] = this.field3775 * this.field3771;
        int var2 = -77 / ((arg0 - -1) / 60);
        OpenGL.glLightModelfv(2899, class377.field5688, 0);
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "()Z")
    public final boolean method77() {
        ++field3666;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "NA", descriptor = "(IIIII)V")
    public final void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3554;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLmd;)V")
    public final void method1621(byte arg0, class212 arg1) {
        ++field3613;
        if (~this.field3718 <= -1 && this.field3717[this.field3718] == arg1) {
            this.field3717[this.field3718--] = null;
            int var3 = 77 % ((-12 - arg0) / 51);
            arg1.method1368(-1470);
            if (~this.field3718 > -1) {
                this.field3712 = null;
            } else {
                this.field3712 = this.field3717[this.field3718];
                this.field3712.method1369((byte) -15);
            }
        } else {
            throw new RuntimeException();
        }
    }

    static {
        new class347("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field3698 = new class347("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        field3705 = new int[6][];
        field3706 = 0;
        field3710 = new int[64];
    }
}
