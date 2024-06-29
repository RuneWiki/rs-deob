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

@OriginalClass("client!ih")
public class class214 extends class491 {

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3411 = new Hashtable();

    @OriginalMember(owner = "client!ih", name = "ie", descriptor = "I")
    public int field3594 = 128;

    @OriginalMember(owner = "client!ih", name = "ce", descriptor = "Lkb;")
    private class338 field3588 = new class338();

    @OriginalMember(owner = "client!ih", name = "je", descriptor = "Lnb;")
    private class246 field3595 = new class246();

    @OriginalMember(owner = "client!ih", name = "ke", descriptor = "Lnb;")
    public class246 field3596 = new class246();

    @OriginalMember(owner = "client!ih", name = "me", descriptor = "Z")
    private boolean field3598 = false;

    @OriginalMember(owner = "client!ih", name = "oe", descriptor = "I")
    public int field3600 = 8;

    @OriginalMember(owner = "client!ih", name = "pe", descriptor = "I")
    public int field3601 = 3;

    @OriginalMember(owner = "client!ih", name = "ne", descriptor = "Lpu;")
    private class411 field3599 = new class411();

    @OriginalMember(owner = "client!ih", name = "te", descriptor = "I")
    private int field3605 = -1;

    @OriginalMember(owner = "client!ih", name = "se", descriptor = "I")
    private int field3604 = -1;

    @OriginalMember(owner = "client!ih", name = "xe", descriptor = "[Lh;")
    private class161[] field3609 = new class161[4];

    @OriginalMember(owner = "client!ih", name = "ze", descriptor = "[Lh;")
    private class161[] field3611 = new class161[4];

    @OriginalMember(owner = "client!ih", name = "ue", descriptor = "I")
    private int field3606 = -1;

    @OriginalMember(owner = "client!ih", name = "we", descriptor = "[Lh;")
    private class161[] field3608 = new class161[4];

    @OriginalMember(owner = "client!ih", name = "Be", descriptor = "Lpu;")
    private class411 field3613;

    @OriginalMember(owner = "client!ih", name = "Ee", descriptor = "Lpu;")
    private class411 field3616;

    @OriginalMember(owner = "client!ih", name = "Fe", descriptor = "Lpu;")
    private class411 field3617;

    @OriginalMember(owner = "client!ih", name = "Ge", descriptor = "Lpu;")
    private class411 field3618;

    @OriginalMember(owner = "client!ih", name = "He", descriptor = "Lpu;")
    private class411 field3619;

    @OriginalMember(owner = "client!ih", name = "Ie", descriptor = "Lpu;")
    private class411 field3620;

    @OriginalMember(owner = "client!ih", name = "Je", descriptor = "Lpu;")
    private class411 field3621;

    @OriginalMember(owner = "client!ih", name = "Xe", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!ih", name = "Me", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!ih", name = "pf", descriptor = "F")
    public float field3652;

    @OriginalMember(owner = "client!ih", name = "Ye", descriptor = "I")
    public int field3636;

    @OriginalMember(owner = "client!ih", name = "Re", descriptor = "I")
    private int field3629;

    @OriginalMember(owner = "client!ih", name = "Ke", descriptor = "F")
    public float field3622;

    @OriginalMember(owner = "client!ih", name = "Kf", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!ih", name = "Ff", descriptor = "[Lja;")
    private class450[] field3668;

    @OriginalMember(owner = "client!ih", name = "rf", descriptor = "[F")
    private float[] field3654;

    @OriginalMember(owner = "client!ih", name = "Ef", descriptor = "[F")
    private float[] field3667;

    @OriginalMember(owner = "client!ih", name = "hf", descriptor = "F")
    public float field3645;

    @OriginalMember(owner = "client!ih", name = "Ne", descriptor = "I")
    private int field3625;

    @OriginalMember(owner = "client!ih", name = "Qe", descriptor = "I")
    public int field3628;

    @OriginalMember(owner = "client!ih", name = "gf", descriptor = "[F")
    private float[] field3644;

    @OriginalMember(owner = "client!ih", name = "bf", descriptor = "F")
    public float field3639;

    @OriginalMember(owner = "client!ih", name = "Te", descriptor = "I")
    private int field3631;

    @OriginalMember(owner = "client!ih", name = "lf", descriptor = "I")
    private int field3648;

    @OriginalMember(owner = "client!ih", name = "Oe", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!ih", name = "gg", descriptor = "[F")
    public float[] field3695;

    @OriginalMember(owner = "client!ih", name = "pg", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!ih", name = "sf", descriptor = "F")
    private float field3655;

    @OriginalMember(owner = "client!ih", name = "xf", descriptor = "F")
    private float field3660;

    @OriginalMember(owner = "client!ih", name = "ig", descriptor = "F")
    public float field3697;

    @OriginalMember(owner = "client!ih", name = "Eg", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!ih", name = "Jf", descriptor = "F")
    public float field3672;

    @OriginalMember(owner = "client!ih", name = "Yf", descriptor = "Z")
    private boolean field3687;

    @OriginalMember(owner = "client!ih", name = "Kg", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!ih", name = "df", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!ih", name = "Lg", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ih", name = "Mg", descriptor = "I")
    private int field3727;

    @OriginalMember(owner = "client!ih", name = "Pg", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!ih", name = "ef", descriptor = "F")
    public float field3642;

    @OriginalMember(owner = "client!ih", name = "Ug", descriptor = "F")
    private float field3735;

    @OriginalMember(owner = "client!ih", name = "uf", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!ih", name = "Qg", descriptor = "F")
    public float field3731;

    @OriginalMember(owner = "client!ih", name = "Tg", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!ih", name = "Og", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!ih", name = "Cf", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!ih", name = "Xg", descriptor = "[F")
    private float[] field3738;

    @OriginalMember(owner = "client!ih", name = "tf", descriptor = "Lct;")
    public class364 field3656;

    @OriginalMember(owner = "client!ih", name = "Zg", descriptor = "[I")
    public int[] field3740;

    @OriginalMember(owner = "client!ih", name = "ah", descriptor = "[I")
    public int[] field3741;

    @OriginalMember(owner = "client!ih", name = "eh", descriptor = "[I")
    public int[] field3745;

    @OriginalMember(owner = "client!ih", name = "dh", descriptor = "[B")
    public byte[] field3744;

    @OriginalMember(owner = "client!ih", name = "sb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3448;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3400;

    @OriginalMember(owner = "client!ih", name = "he", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!ih", name = "be", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3587;

    @OriginalMember(owner = "client!ih", name = "ed", descriptor = "J")
    private long field3538;

    @OriginalMember(owner = "client!ih", name = "Hc", descriptor = "J")
    private long field3515;

    @OriginalMember(owner = "client!ih", name = "tg", descriptor = "Z")
    public boolean field3708;

    @OriginalMember(owner = "client!ih", name = "If", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!ih", name = "Rf", descriptor = "Ljava/lang/String;")
    private String field3680;

    @OriginalMember(owner = "client!ih", name = "vf", descriptor = "Z")
    public boolean field3658;

    @OriginalMember(owner = "client!ih", name = "yf", descriptor = "Z")
    private boolean field3661;

    @OriginalMember(owner = "client!ih", name = "Hf", descriptor = "Z")
    public boolean field3670;

    @OriginalMember(owner = "client!ih", name = "Df", descriptor = "Z")
    public boolean field3666;

    @OriginalMember(owner = "client!ih", name = "fg", descriptor = "Z")
    private boolean field3694;

    @OriginalMember(owner = "client!ih", name = "Ue", descriptor = "Z")
    public boolean field3632;

    @OriginalMember(owner = "client!ih", name = "nf", descriptor = "Ljava/lang/String;")
    private String field3650;

    @OriginalMember(owner = "client!ih", name = "Jg", descriptor = "Z")
    public boolean field3724;

    @OriginalMember(owner = "client!ih", name = "bg", descriptor = "Z")
    private boolean field3690;

    @OriginalMember(owner = "client!ih", name = "fe", descriptor = "Lhm;")
    public class163 field3591;

    @OriginalMember(owner = "client!ih", name = "le", descriptor = "Lhp;")
    public class252 field3597;

    @OriginalMember(owner = "client!ih", name = "ge", descriptor = "Ljr;")
    private class222 field3592;

    @OriginalMember(owner = "client!ih", name = "ee", descriptor = "Llm;")
    private class31 field3590;

    @OriginalMember(owner = "client!ih", name = "de", descriptor = "Lcg;")
    private class10 field3589;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field3405 = -1;

    @OriginalMember(owner = "client!ih", name = "We", descriptor = "F")
    public float field3634;

    @OriginalMember(owner = "client!ih", name = "kf", descriptor = "F")
    public float field3647;

    @OriginalMember(owner = "client!ih", name = "qf", descriptor = "F")
    public float field3653;

    @OriginalMember(owner = "client!ih", name = "zf", descriptor = "F")
    private float field3662;

    @OriginalMember(owner = "client!ih", name = "kg", descriptor = "F")
    public float field3699;

    @OriginalMember(owner = "client!ih", name = "lg", descriptor = "F")
    private float field3700;

    @OriginalMember(owner = "client!ih", name = "qg", descriptor = "F")
    public float field3705;

    @OriginalMember(owner = "client!ih", name = "rg", descriptor = "F")
    public float field3706;

    @OriginalMember(owner = "client!ih", name = "xg", descriptor = "F")
    public float field3712;

    @OriginalMember(owner = "client!ih", name = "yg", descriptor = "F")
    private float field3713;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ih", name = "ub", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ih", name = "vb", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ih", name = "wb", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ih", name = "xb", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ih", name = "yb", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ih", name = "zb", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ih", name = "Ab", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ih", name = "Bb", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ih", name = "Cb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ih", name = "Db", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ih", name = "Eb", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ih", name = "Fb", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!ih", name = "Ib", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ih", name = "Kb", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ih", name = "Lb", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!ih", name = "Nb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!ih", name = "Pb", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!ih", name = "Sb", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!ih", name = "Tb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ih", name = "Ub", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ih", name = "Vb", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ih", name = "Wb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ih", name = "Xb", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ih", name = "Yb", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ih", name = "Zb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ih", name = "ac", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ih", name = "bc", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ih", name = "cc", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ih", name = "dc", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ih", name = "ec", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ih", name = "fc", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ih", name = "gc", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ih", name = "hc", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ih", name = "ic", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ih", name = "jc", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ih", name = "kc", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ih", name = "lc", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ih", name = "mc", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!ih", name = "nc", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!ih", name = "oc", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ih", name = "pc", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ih", name = "qc", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ih", name = "rc", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ih", name = "sc", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ih", name = "tc", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ih", name = "uc", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ih", name = "vc", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ih", name = "wc", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ih", name = "xc", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ih", name = "yc", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ih", name = "zc", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ih", name = "Ac", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ih", name = "Bc", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ih", name = "Cc", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ih", name = "Dc", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ih", name = "Ec", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ih", name = "Fc", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ih", name = "Gc", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ih", name = "Ic", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ih", name = "Jc", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ih", name = "Kc", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ih", name = "Lc", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ih", name = "Mc", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ih", name = "Nc", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ih", name = "Pc", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ih", name = "Qc", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ih", name = "Rc", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ih", name = "Sc", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ih", name = "Tc", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ih", name = "Uc", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ih", name = "Vc", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ih", name = "Wc", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ih", name = "Xc", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ih", name = "Yc", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ih", name = "Zc", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ih", name = "bd", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!ih", name = "cd", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ih", name = "dd", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ih", name = "fd", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ih", name = "gd", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ih", name = "hd", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ih", name = "id", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ih", name = "jd", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ih", name = "kd", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!ih", name = "ld", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ih", name = "md", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ih", name = "nd", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ih", name = "od", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ih", name = "pd", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ih", name = "qd", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ih", name = "rd", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ih", name = "sd", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ih", name = "td", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ih", name = "ud", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ih", name = "vd", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ih", name = "wd", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ih", name = "xd", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ih", name = "yd", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ih", name = "zd", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ih", name = "Ad", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ih", name = "Bd", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ih", name = "Cd", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!ih", name = "Dd", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!ih", name = "Ed", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ih", name = "Fd", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ih", name = "Gd", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ih", name = "Hd", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ih", name = "Id", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ih", name = "Jd", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!ih", name = "Kd", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ih", name = "Ld", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ih", name = "Md", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ih", name = "Nd", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ih", name = "Od", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ih", name = "Pd", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ih", name = "Qd", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ih", name = "Rd", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ih", name = "Sd", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ih", name = "Td", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ih", name = "Ud", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ih", name = "Vd", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ih", name = "Wd", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ih", name = "Xd", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ih", name = "Yd", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ih", name = "Zd", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ih", name = "ae", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ih", name = "qe", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!ih", name = "Ae", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!ih", name = "Ce", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!ih", name = "De", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!ih", name = "Le", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!ih", name = "Pe", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!ih", name = "Se", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!ih", name = "ff", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!ih", name = "Bf", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!ih", name = "Nf", descriptor = "I")
    private int field3676;

    @OriginalMember(owner = "client!ih", name = "Pf", descriptor = "I")
    private int field3678;

    @OriginalMember(owner = "client!ih", name = "Xf", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!ih", name = "Zf", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!ih", name = "jg", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!ih", name = "og", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!ih", name = "Ag", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!ih", name = "Dg", descriptor = "I")
    private int field3718;

    @OriginalMember(owner = "client!ih", name = "Hg", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!ih", name = "Ng", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!ih", name = "bh", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!ih", name = "ch", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!ih", name = "of", descriptor = "J")
    private long field3651;

    @OriginalMember(owner = "client!ih", name = "jf", descriptor = "Lat;")
    public class106 field3646;

    @OriginalMember(owner = "client!ih", name = "Af", descriptor = "Lat;")
    public class106 field3663;

    @OriginalMember(owner = "client!ih", name = "Gf", descriptor = "Lat;")
    public class106 field3669;

    @OriginalMember(owner = "client!ih", name = "Lf", descriptor = "Lat;")
    public class106 field3674;

    @OriginalMember(owner = "client!ih", name = "Of", descriptor = "Lat;")
    public class106 field3677;

    @OriginalMember(owner = "client!ih", name = "Tf", descriptor = "Lat;")
    public class106 field3682;

    @OriginalMember(owner = "client!ih", name = "wg", descriptor = "Lat;")
    public class106 field3711;

    @OriginalMember(owner = "client!ih", name = "Ig", descriptor = "Lat;")
    public class106 field3723;

    @OriginalMember(owner = "client!ih", name = "Rg", descriptor = "Lat;")
    public class106 field3732;

    @OriginalMember(owner = "client!ih", name = "Vg", descriptor = "Lat;")
    public class106 field3736;

    @OriginalMember(owner = "client!ih", name = "ve", descriptor = "Lh;")
    private class161 field3607;

    @OriginalMember(owner = "client!ih", name = "ye", descriptor = "Lh;")
    private class161 field3610;

    @OriginalMember(owner = "client!ih", name = "hg", descriptor = "Lah;")
    public class187 field3696;

    @OriginalMember(owner = "client!ih", name = "Mf", descriptor = "Lnb;")
    public class246 field3675;

    @OriginalMember(owner = "client!ih", name = "Wf", descriptor = "Lnb;")
    public class246 field3685;

    @OriginalMember(owner = "client!ih", name = "Uf", descriptor = "Loi;")
    private class43 field3683;

    @OriginalMember(owner = "client!ih", name = "cg", descriptor = "Lnn;")
    public class45 field3691;

    @OriginalMember(owner = "client!ih", name = "mg", descriptor = "Lnn;")
    public class45 field3701;

    @OriginalMember(owner = "client!ih", name = "Qf", descriptor = "Lon;")
    private class508 field3679;

    @OriginalMember(owner = "client!ih", name = "mf", descriptor = "Ljk;")
    public class533 field3649;

    @OriginalMember(owner = "client!ih", name = "dg", descriptor = "Lgq;")
    private class536 field3692;

    @OriginalMember(owner = "client!ih", name = "af", descriptor = "Lig;")
    private class92 field3638;

    @OriginalMember(owner = "client!ih", name = "Bg", descriptor = "Lig;")
    private class92 field3716;

    @OriginalMember(owner = "client!ih", name = "re", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3603;

    @OriginalMember(owner = "client!ih", name = "Ve", descriptor = "Z")
    public boolean field3633;

    @OriginalMember(owner = "client!ih", name = "Ze", descriptor = "Z")
    private boolean field3637;

    @OriginalMember(owner = "client!ih", name = "cf", descriptor = "Z")
    private boolean field3640;

    @OriginalMember(owner = "client!ih", name = "wf", descriptor = "Z")
    private boolean field3659;

    @OriginalMember(owner = "client!ih", name = "Sf", descriptor = "Z")
    public boolean field3681;

    @OriginalMember(owner = "client!ih", name = "Vf", descriptor = "Z")
    public boolean field3684;

    @OriginalMember(owner = "client!ih", name = "ag", descriptor = "Z")
    private boolean field3689;

    @OriginalMember(owner = "client!ih", name = "eg", descriptor = "Z")
    public boolean field3693;

    @OriginalMember(owner = "client!ih", name = "ng", descriptor = "Z")
    private boolean field3702;

    @OriginalMember(owner = "client!ih", name = "sg", descriptor = "Z")
    private boolean field3707;

    @OriginalMember(owner = "client!ih", name = "ug", descriptor = "Z")
    private boolean field3709;

    @OriginalMember(owner = "client!ih", name = "vg", descriptor = "Z")
    private boolean field3710;

    @OriginalMember(owner = "client!ih", name = "zg", descriptor = "Z")
    private boolean field3714;

    @OriginalMember(owner = "client!ih", name = "Fg", descriptor = "Z")
    public boolean field3720;

    @OriginalMember(owner = "client!ih", name = "Gg", descriptor = "Z")
    public boolean field3721;

    @OriginalMember(owner = "client!ih", name = "Sg", descriptor = "Z")
    private boolean field3733;

    @OriginalMember(owner = "client!ih", name = "Wg", descriptor = "Z")
    public boolean field3737;

    @OriginalMember(owner = "client!ih", name = "Yg", descriptor = "Z")
    public boolean field3739;

    @OriginalMember(owner = "client!ih", name = "Cg", descriptor = "[Lkk;")
    private class179[] field3717;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnb;B)V")
    public final void method1404(class246 arg0, byte arg1) {
        int var3 = -41 % ((arg1 - 67) / 53);
        ++field3490;
        OpenGL.glLoadMatrixf(arg0.method1675(-112), 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
    public final void method1405(int arg0, boolean arg1) {
        if (this.field3714 != arg1) {
            this.field3714 = arg1;
            this.method1464((byte) 18);
            this.field3627 &= -32;
        }
        if (arg0 < -26) {
            ++field3559;
        }
    }

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z")
    public final boolean method817() {
        ++field3495;
        return this.field3590 != null && (~this.field3593 >= -2 || this.field3710);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILnn;Lnn;Lnn;Lnn;)V")
    public final void method1406(int arg0, class45 arg1, class45 arg2, class45 arg3, class45 arg4) {
        ++field3578;
        if (arg4 != null) {
            this.method1411(arg4.field731, 79);
            OpenGL.glVertexPointer(arg4.field733, arg4.field736, this.field3638.method514(-10228), this.field3638.method512(false) + (long) arg4.field735);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg0 != 32888) {
            this.field3696 = null;
        }
        if (arg2 != null) {
            this.method1411(arg2.field731, 95);
            OpenGL.glNormalPointer(arg2.field736, this.field3638.method514(-10228), this.field3638.method512(false) + (long) arg2.field735);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1411(arg3.field731, 62);
            OpenGL.glColorPointer(arg3.field733, arg3.field736, this.field3638.method514(-10228), this.field3638.method512(false) - -((long) arg3.field735));
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 != null) {
            this.method1411(arg1.field731, 71);
            OpenGL.glTexCoordPointer(arg1.field733, arg1.field736, this.field3638.method514(arg0 + -43116), this.field3638.method512(false) - -((long) arg1.field735));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
    public final int method902(int arg0, int arg1) {
        ++field3459;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILoi;I)V")
    public final void method1407(int arg0, byte arg1, int arg2, class43 arg3, int arg4) {
        ++field3478;
        int var6 = -33 % ((arg1 - 29) / 45);
        int var7 = arg3.method316((byte) -107);
        int var8 = arg4 * this.method1462((byte) 83, var7);
        this.method1469(arg3, (byte) -126);
        OpenGL.glDrawElements(arg2, arg0, var7, arg3.method313(-4241) + (long) var8);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public final void method1408(byte arg0) {
        if (arg0 != 6) {
            this.method1414(false, 100L);
        }
        if (~this.field3664 != -1) {
            this.field3627 &= -32;
            this.field3664 = 0;
        }
        ++field3480;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method846(Canvas arg0) {
        ++field3418;
        if (this.field3448 == arg0) {
            throw new RuntimeException();
        } else if (this.field3411.containsKey(arg0)) {
            Long var2 = (Long) this.field3411.get(arg0);
            this.field3587.releaseSurface(arg0, var2);
            this.field3411.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V")
    private final void method1409(int arg0) {
        ++field3474;
        OpenGL.glLoadIdentity();
        int var2 = 35 / ((-5 - arg0) / 56);
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field3685.method1675(-124), 0);
        if (this.field3693) {
            this.field3589.field99.method1586(-16998);
        }
        this.method1422((byte) -59);
        this.method1457(-123);
    }

    @OriginalMember(owner = "client!ih", name = "ra", descriptor = "(ILta;II)V")
    public final void method825(int arg0, class448 arg1, int arg2, int arg3) {
        ++field3560;
        class485 var5 = (class485) arg1;
        class536 var6 = var5.field7119;
        this.method1425((byte) 86);
        this.method1471(true, var5.field7119);
        this.method1486(1, (byte) 113);
        this.method1482(7681, 8960, 8448);
        this.method1474(0, 34167, -5000, 768);
        float var7 = var6.field7867 / (float) var6.field7877;
        float var8 = var6.field7871 / (float) var6.field7880;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3727) * var7, (float) (-arg3 + this.field3631) * var8);
        OpenGL.glVertex2i(this.field3727, this.field3631);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3727) * var7, (float) (-arg3 + this.field3625) * var8);
        OpenGL.glVertex2i(this.field3727, this.field3625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3624) * var7, (float) (-arg3 + this.field3625) * var8);
        OpenGL.glVertex2i(this.field3624, this.field3625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3624) * var7, (float) (-arg3 + this.field3631) * var8);
        OpenGL.glVertex2i(this.field3624, this.field3631);
        OpenGL.glEnd();
        this.method1474(0, 5890, -5000, 768);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
    public final void method1410(int arg0, int arg1) {
        if (arg1 != 7681) {
            this.method875((class227) null, -98, 80, 24, 25);
        }
        ++field3576;
        if (~arg0 != -2) {
            if (~arg0 != -1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.method1482(34023, 8960, 34023);
                            return;
                        }
                    } else {
                        this.method1482(260, 8960, 8448);
                    }
                } else {
                    this.method1482(34165, 8960, 7681);
                }
            } else {
                this.method1482(8448, 8960, 8448);
            }
        } else {
            this.method1482(7681, 8960, 7681);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lig;I)V")
    public final void method1411(class92 arg0, int arg1) {
        ++field3557;
        if (this.field3638 != arg0) {
            if (this.field3661) {
                OpenGL.glBindBufferARB(34962, arg0.method517((byte) -95));
            }
            this.field3638 = arg0;
        }
        if (arg1 <= 60) {
            this.field3609 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)I")
    public static final int method1412(int arg0, int arg1) {
        int var2 = -12 / ((-34 - arg1) / 63);
        ++field3473;
        if (~arg0 != -6407) {
            if (~arg0 == -6410) {
                return 1;
            } else if (arg0 != 32841) {
                if (~arg0 != -6411) {
                    if (arg0 != 6407) {
                        if (~arg0 == -6409) {
                            return 4;
                        } else {
                            throw new IllegalArgumentException("");
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
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "ZA", descriptor = "(IIIII)V")
    public final void method840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3401;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    private final void method1413(byte arg0) {
        ++field3468;
        if (this.field3709 && !this.field3659) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 18) {
            this.method1446((class246) null, -111);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)V")
    public final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3454;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1444((byte) -122);
        this.method1486(arg5, (byte) 118);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3637) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3637) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Ln;")
    public final class511 method874(int arg0) {
        ++field3407;
        class95 var2 = new class95(arg0);
        this.field3599.method2541(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZJ)V")
    public final synchronized void method1414(boolean arg0, long arg1) {
        if (!arg0) {
            this.method1406(107, (class45) null, (class45) null, (class45) null, (class45) null);
        }
        ++field3506;
        class276 var4 = new class276();
        var4.field4542 = arg1;
        this.field3621.method2541(0, var4);
    }

    @OriginalMember(owner = "client!ih", name = "da", descriptor = "(FF)V")
    public final void method877(float arg0, float arg1) {
        ++field3510;
        if (this.field3645 != arg0 || this.field3653 != arg1) {
            this.field3645 = arg0;
            this.field3653 = arg1;
            this.method1426(-17604);
            if (this.field3664 == 3) {
                this.method1458(-1);
                return;
            }
            if (~this.field3664 != -3) {
                return;
            }
            this.method1466(255);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZ)V")
    public final void method1415(int arg0, int arg1, boolean arg2) {
        this.field3635 = arg0;
        if (arg2) {
            ++field3479;
            this.field3719 = arg1;
            this.method1439(2);
            this.method1418((byte) 63);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method890(Canvas arg0) {
        ++field3513;
        if (this.field3448 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3411.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3587.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3411.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "MA", descriptor = "([I)V")
    public final void method908(int[] arg0) {
        arg0[3] = this.field3625;
        ++field3583;
        arg0[2] = this.field3624;
        arg0[0] = this.field3727;
        arg0[1] = this.field3631;
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "()V")
    public final void method888() {
        ++field3581;
        if (this.field3690 && ~this.field3442 < -1 && this.field3569 > 0) {
            int var1 = this.field3727;
            int var2 = this.field3624;
            int var3 = this.field3631;
            int var4 = this.field3625;
            this.method848();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1408((byte) 6);
            this.method1405(-47, false);
            this.method1417(false, false);
            this.method1481(true, false);
            this.method1473(-120, false);
            this.method1471(true, (class179) null);
            this.method1463(-2, (byte) 109);
            this.method1410(1, 7681);
            this.method1486(0, (byte) 124);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3442, this.field3569, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method829(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lh;I)V")
    public final void method1416(class161 arg0, int arg1) {
        ++field3419;
        if (this.field3720) {
            this.method1438(arg0, false);
            this.method1431(false, arg0);
        } else {
            if (this.field3605 < 0 || this.field3611[this.field3605] != arg0) {
                throw new RuntimeException();
            }
            this.field3611[this.field3605--] = null;
            arg0.method1118(-83);
            if (~this.field3605 <= -1) {
                this.field3607 = this.field3610 = this.field3611[this.field3605];
                this.field3607.method1119(-28104);
            } else {
                this.field3607 = this.field3610 = null;
            }
        }
        int var3 = -5 % ((arg1 - -63) / 51);
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "()Z")
    public final boolean method861() {
        ++field3546;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
    public final void method1417(boolean arg0, boolean arg1) {
        if (this.field3709 != arg0) {
            this.field3709 = arg0;
            this.method1413((byte) 18);
            this.field3627 &= -8;
        }
        ++field3541;
        if (arg1) {
            this.field3677 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    public final void method897(int arg0) {
        ++field3483;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field3594 = arg0;
            this.field3591.method1126(-31228);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method901(Rectangle[] arg0, int arg1) {
        this.method844();
        ++field3438;
    }

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "()V")
    public final void method836() {
        ++field3476;
        this.field3592.method1528(true);
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "(III[I)V")
    public final void method819(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3437;
        float var5 = (float) arg2 * this.field3685.field4222 + (float) arg0 * this.field3685.field4212 + (float) arg1 * this.field3685.field4234 + this.field3685.field4213;
        if (!(var5 < (float) this.field3628) && !((float) this.field3626 < var5)) {
            int var6 = (int) (((float) arg2 * this.field3685.field4219 + (float) arg0 * this.field3685.field4207 + (float) arg1 * this.field3685.field4205 + this.field3685.field4220) * (float) this.field3636 / var5);
            int var7 = (int) (((float) arg2 * this.field3685.field4211 + (float) arg0 * this.field3685.field4216 + (float) arg1 * this.field3685.field4235 + this.field3685.field4223) * (float) this.field3665 / var5);
            if (this.field3706 <= (float) var6 && this.field3705 >= (float) var6 && (float) var7 >= this.field3699 && this.field3634 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field3699);
                arg3[0] = (int) ((float) var6 + -this.field3706);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    private final void method1418(byte arg0) {
        if (this.field3624 >= this.field3727 && this.field3625 >= this.field3631) {
            OpenGL.glScissor(this.field3635 - -this.field3727, -this.field3625 + this.field3719 + this.field3569, -this.field3727 + this.field3624, -this.field3631 + this.field3625);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field3471;
        if (arg0 != 63) {
            this.method841();
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
    public final synchronized void method1419(int arg0, int arg1, int arg2) {
        if (arg1 != 8192) {
            this.method898();
        }
        ++field3481;
        class22 var4 = new class22(arg2);
        var4.field4542 = (long) arg0;
        this.field3617.method2541(0, var4);
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
    public final void method1420(int arg0) {
        ++field3580;
        if (this.field3627 != 16) {
            this.method1430((byte) 120);
            this.method1405(-55, true);
            this.method1481(true, true);
            this.method1473(-109, true);
            this.method1486(1, (byte) 126);
            this.method1410(0, 7681);
            this.field3627 = 16;
        }
        if (arg0 <= 6) {
            this.method878(-105, 51);
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
    private final void method1421(byte arg0) {
        ++field3562;
        int var2 = -31 % ((-23 - arg0) / 47);
        if (~this.field3664 != -3) {
            this.field3664 = 2;
            this.method1466(255);
            this.method1409(-68);
            this.field3627 &= -8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method863(Canvas arg0) {
        this.field3515 = 0L;
        this.field3400 = null;
        ++field3496;
        if (arg0 != null && this.field3448 != arg0) {
            if (this.field3411.containsKey(arg0)) {
                Long var2 = (Long) this.field3411.get(arg0);
                this.field3515 = var2;
                this.field3400 = arg0;
            }
        } else {
            this.field3515 = this.field3538;
            this.field3400 = this.field3448;
        }
        if (this.field3400 != null && this.field3515 != 0L) {
            this.field3587.setSurface(this.field3515);
            this.method1441((byte) -12);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)V")
    public final void method1422(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field3695, 0);
        ++field3465;
        if (arg0 != -59) {
            this.method817();
        }
        OpenGL.glLightfv(16385, 4611, this.field3738, 0);
    }

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
    public final void method847(int arg0, int arg1, int arg2) {
        if (~this.field3641 != ~arg0 || ~this.field3726 != ~arg1 || this.field3729 != arg2) {
            this.field3729 = arg2;
            this.field3726 = arg1;
            this.field3641 = arg0;
            if (!this.field3693) {
                this.method1460(5889);
                this.method1464((byte) 18);
            }
        }
        ++field3414;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lo;")
    public final class138 method834(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3568;
        return new class263(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZLjaggl/memory/NativeBuffer;)Lig;")
    public final class92 method1423(int arg0, int arg1, int arg2, boolean arg3, NativeBuffer arg4) {
        ++field3551;
        if (arg1 != -32527) {
            this.field3682 = null;
        }
        return (class92) (!this.field3661 || arg3 && !this.field3694 ? new class216(this, arg0, arg4) : new class72(this, arg0, arg4, arg2, arg3));
    }

    @OriginalMember(owner = "client!ih", name = "IA", descriptor = "(IIIII)V")
    public final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1444((byte) -124);
        ++field3456;
        this.method1486(arg4, (byte) 117);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lta;")
    public final class448 method887(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3426;
        return class480.method2826(arg2, arg1, arg0, (byte) -98, this, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZZI)V")
    public final void method1424(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field3728 != arg3) {
            if (arg3 < 0) {
                this.method1476(-2);
                this.method1471(true, (class179) null);
                this.method1410(0, 7681);
                if (!this.field3693) {
                    this.field3589.method58(0, arg2, 0, 0, -30, arg0);
                }
            } else {
                class187 var5 = this.field3591.method1125(arg3, 127);
                class320 var6 = super.field7179.method195(arg3, (byte) -105);
                if (~var6.field5034 == -1 && ~var6.field5021 == -1) {
                    this.method1476(-2);
                } else {
                    int var7 = var6.field5020 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method1450((float) (this.field3602 % var8 * var6.field5021) / (float) var8, 5888, 0.0F, (float) (this.field3602 % var8 * var6.field5034) / (float) var8);
                }
                if (!this.field3693) {
                    this.field3589.method58(var6.field5026, arg2, var6.field5038, var6.field5037, 113, arg0);
                    if (!this.field3589.method56(var5, var6.field5036, (byte) -116)) {
                        this.method1471(true, var5);
                        this.method1410(var6.field5036, 7681);
                    }
                } else {
                    this.method1471(!arg1, var5);
                    this.method1410(var6.field5036, 7681);
                }
            }
            this.field3728 = arg3;
        }
        ++field3514;
        if (arg1) {
            this.method1484(-60, 104, -83, 15);
        }
        this.field3627 &= -8;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public final synchronized void method864(int arg0) {
        ++field3444;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field3616.method2544((byte) 61)) {
            class22 var12 = (class22) this.field3616.method2539(0);
            class324.field5076[var3++] = (int) var12.field4542;
            this.field3612 -= var12.field238;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class324.field5076, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class324.field5076, 0);
            var3 = 0;
        }
        while (!this.field3617.method2544((byte) 61)) {
            class22 var11 = (class22) this.field3617.method2539(0);
            class324.field5076[var3++] = (int) var11.field4542;
            this.field3614 -= var11.field238;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class324.field5076, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class324.field5076, 0);
            var3 = 0;
        }
        while (!this.field3618.method2544((byte) 61)) {
            class22 var10 = (class22) this.field3618.method2539(0);
            class324.field5076[var3++] = var10.field238;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class324.field5076, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class324.field5076, 0);
            var3 = 0;
        }
        while (!this.field3619.method2544((byte) 61)) {
            class22 var9 = (class22) this.field3619.method2539(0);
            class324.field5076[var3++] = (int) var9.field4542;
            this.field3615 -= var9.field238;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class324.field5076, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class324.field5076, 0);
            boolean var4 = false;
        }
        while (!this.field3613.method2544((byte) 61)) {
            class22 var8 = (class22) this.field3613.method2539(0);
            OpenGL.glDeleteLists((int) var8.field4542, var8.field238);
        }
        while (!this.field3620.method2544((byte) 61)) {
            class276 var7 = this.field3620.method2539(0);
            OpenGL.glDeleteProgramARB((int) var7.field4542);
        }
        while (!this.field3621.method2544((byte) 61)) {
            class276 var6 = this.field3621.method2539(0);
            OpenGL.glDeleteObjectARB(var6.field4542);
        }
        while (!this.field3613.method2544((byte) 61)) {
            class22 var5 = (class22) this.field3613.method2539(0);
            OpenGL.glDeleteLists((int) var5.field4542, var5.field238);
        }
        this.field3591.method1123((byte) -109);
        if (~this.method823() < -100663297 && ~(this.field3651 + 60000L) > ~class19.method91((byte) 118)) {
            System.gc();
            this.field3651 = class19.method91((byte) 117);
        }
        this.field3602 = var2;
    }

    @OriginalMember(owner = "client!ih", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3502;
        float var7 = (float) arg2 * this.field3685.field4222 + (float) arg0 * this.field3685.field4212 + (float) arg1 * this.field3685.field4234 + this.field3685.field4213;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3685.field4222 + (float) arg3 * this.field3685.field4212 + (float) arg4 * this.field3685.field4234 + this.field3685.field4213;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field3628) || !((float) this.field3628 > var8)) && (!((float) this.field3626 < var7) || !(var8 > (float) this.field3626))) {
            int var9 = (int) (((float) arg2 * this.field3685.field4219 + (float) arg0 * this.field3685.field4207 + (float) arg1 * this.field3685.field4205 + this.field3685.field4220) * (float) this.field3636 / var7);
            int var10 = (int) (((float) arg5 * this.field3685.field4219 + (float) arg3 * this.field3685.field4207 + (float) arg4 * this.field3685.field4205 + this.field3685.field4220) * (float) this.field3636 / var8);
            if (this.field3706 > (float) var9 && (float) var10 < this.field3706 || this.field3705 < (float) var9 && this.field3705 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3685.field4211 + (float) arg0 * this.field3685.field4216 + (float) arg1 * this.field3685.field4235 + this.field3685.field4223) * (float) this.field3665 / var7);
                int var12 = (int) (((float) arg5 * this.field3685.field4211 + (float) arg3 * this.field3685.field4216 + (float) arg4 * this.field3685.field4235 + this.field3685.field4223) * (float) this.field3665 / var8);
                return (!(this.field3699 > (float) var11) || !(this.field3699 > (float) var12)) && (!((float) var11 > this.field3634) || !((float) var12 > this.field3634));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILnv;)V")
    public class214(int arg0, Canvas arg1, class196 arg2, int arg3, class493 arg4) {
        super(arg0, arg2);
        new class516();
        new class407(16);
        this.field3613 = new class411();
        this.field3616 = new class411();
        this.field3617 = new class411();
        this.field3618 = new class411();
        this.field3619 = new class411();
        this.field3620 = new class411();
        this.field3621 = new class411();
        this.field3635 = 0;
        this.field3624 = 0;
        this.field3652 = 1.0F;
        this.field3636 = 512;
        this.field3629 = 8448;
        this.field3622 = 3584.0F;
        this.field3673 = -1;
        this.field3668 = new class450[class304.field4860];
        this.field3654 = new float[16];
        this.field3667 = new float[4];
        this.field3645 = 3000.0F;
        this.field3625 = 0;
        this.field3628 = 50;
        this.field3644 = new float[4];
        this.field3639 = 3584.0F;
        this.field3631 = 0;
        this.field3648 = 8448;
        this.field3626 = 3584;
        this.field3695 = new float[4];
        this.field3704 = -1;
        this.field3655 = 1.0F;
        this.field3660 = 1.0F;
        this.field3697 = 1.0F;
        this.field3719 = 0;
        this.field3672 = 1.0F;
        this.field3687 = true;
        this.field3725 = -1;
        this.field3641 = -1;
        this.field3726 = -1;
        this.field3727 = 0;
        this.field3730 = 0;
        this.field3642 = -1.0F;
        this.field3735 = 0.0F;
        this.field3657 = 0;
        this.field3731 = -1.0F;
        this.field3734 = 0;
        this.field3729 = 0;
        this.field3665 = 512;
        this.field3738 = new float[4];
        this.field3656 = new class364(8192);
        this.field3740 = new int[1];
        this.field3741 = new int[1];
        this.field3745 = new int[1];
        this.field3744 = new byte[16384];
        this.field3400 = this.field3448 = arg1;
        this.field3593 = arg3;
        try {
            if (class172.field2768 == null || !class172.field2768) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2879(0, "jaggl.dll").toString());
                        } else {
                            System.load(arg4.method2879(0, "libjaggl.jnilib").toString());
                        }
                    } else {
                        System.load(arg4.method2879(0, "libjaggl.so").toString());
                    }
                    class172.field2768 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class172.field2768 = Boolean.TRUE;
                }
            }
            if (class172.field2768 != null && class172.field2768) {
                this.field3587 = new OpenGL();
                this.field3515 = this.field3538 = this.field3587.init(arg1, 8, 8, 8, 24, 0, this.field3593);
                if (~this.field3538 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1483(-17827);
                    int var7 = this.method1485(false);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field3671 = this.field3708 ? 33639 : 5121;
                        if (~this.field3680.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class241.method1661(' ', -20326, this.field3680.replace('/', ' '));
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (~var13.charAt(0) == -121 && ~var13.length() <= -4 && class516.method3051(var13.substring(1, 3), 10)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (~var13.length() <= -5 && class516.method3051(var13.substring(0, 4), 10)) {
                                                var8 = class508.method2990(var13.substring(0, 4), 23403);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field3658 = false;
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field3661 = false;
                                }
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field3670 = false;
                                }
                            }
                            this.field3666 &= this.field3587.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field3694 = this.field3661;
                            this.field3632 = true;
                        }
                        if (~this.field3650.indexOf("intel") != 0) {
                            this.field3724 = false;
                        }
                        this.field3690 = !this.field3650.equals("s3 graphics");
                        if (this.field3661) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class213.method1402(true, 640, false);
                        this.field3598 = true;
                        this.field3591 = new class163(this, super.field7179);
                        this.method1453(16087);
                        this.field3597 = new class252(this);
                        this.field3592 = new class222(this);
                        if (this.field3592.method1535(-117)) {
                            this.field3590 = new class31(this);
                            if (!this.field3590.method241(107)) {
                                this.field3590.method247((byte) -80);
                                this.field3590 = null;
                            }
                        }
                        this.field3589 = new class10(this);
                        this.method1454(false);
                        this.method1441((byte) -12);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field3587.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class444.method2667(-28210, 100L);
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
            this.method884();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
    public final void method810(boolean arg0) {
        ++field3543;
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "()V")
    public final void method913() {
        ++field3555;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(B)V")
    public final void method1425(byte arg0) {
        if (arg0 <= 57) {
            this.method1479(92);
        }
        ++field3452;
        if (this.field3627 != 2) {
            this.method1443((byte) 84);
            this.method1405(-92, false);
            this.method1417(false, false);
            this.method1481(true, false);
            this.method1473(-121, false);
            this.method1463(-2, (byte) 90);
            this.field3627 = 2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()Z")
    public final boolean method912() {
        ++field3579;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "()I")
    public final int method883() {
        ++field3429;
        return 4;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
    public final int method878(int arg0, int arg1) {
        ++field3451;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
    private final void method1426(int arg0) {
        if (arg0 == -17604) {
            if (this.field3653 == 0.0F) {
                this.field3654[10] = this.field3713;
                this.field3654[14] = this.field3700;
            } else {
                float var2 = this.field3645 / (this.field3653 + this.field3645);
                float var3 = var2 * var2;
                float var4 = (-var2 + 1.0F) * -this.field3700 * (1.0F - var2) / this.field3653;
                this.field3654[10] = this.field3713 + var4;
                this.field3654[14] = this.field3700 * var3;
            }
            ++field3396;
            this.field3622 = (this.field3654[14] - (float) this.field3626) / this.field3654[10];
            this.field3639 = (float) this.field3626 + -this.field3653;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
    public final void method1427(int arg0, boolean arg1) {
        ++field3406;
        class394.field6034[1] = (float) class344.method2224(65280, arg0) / 65280.0F;
        if (arg1) {
            this.method1440(-73, -68);
        }
        class394.field6034[3] = (float) (arg0 >>> 24) / 255.0F;
        class394.field6034[0] = (float) class344.method2224(arg0, 16711680) / 1.671168E7F;
        class394.field6034[2] = (float) class344.method2224(255, arg0) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class394.field6034, 0);
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
    public final void method891(int arg0) {
        ++field3503;
        this.method1486(0, (byte) 124);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ih", name = "OA", descriptor = "()I")
    public final int method879() {
        ++field3507;
        int var1 = this.field3742;
        this.field3742 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
    public final synchronized void method1428(int arg0, int arg1, int arg2) {
        int var4 = 115 / ((-52 - arg2) / 54);
        ++field3412;
        class22 var5 = new class22(arg1);
        var5.field4542 = (long) arg0;
        this.field3616.method2541(0, var5);
    }

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "()Z")
    public final boolean method881() {
        ++field3410;
        return this.field3589.method57(94, 3);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public final void method886(boolean arg0) {
        this.field3687 = arg0;
        ++field3457;
        this.method1461(22899);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILh;)V")
    public final void method1429(int arg0, class161 arg1) {
        ++field3558;
        if (arg0 == 0) {
            if (!this.field3720) {
                if (~this.field3605 <= -4) {
                    throw new RuntimeException();
                } else {
                    if (this.field3605 >= 0) {
                        this.field3611[this.field3605].method1118(-57);
                    }
                    this.field3607 = this.field3610 = this.field3611[++this.field3605] = arg1;
                    this.field3607.method1119(-28104);
                }
            } else {
                this.method1456(arg0 ^ 3, arg1);
                this.method1465((byte) -77, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(B)V")
    private final void method1430(byte arg0) {
        if (~this.field3664 != -4) {
            this.field3664 = 3;
            this.method1458(arg0 ^ -121);
            this.method1409(arg0 + -234);
            this.field3627 &= -8;
        }
        ++field3531;
        if (arg0 != 120) {
            this.method911((class202) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lwh;Z)Lo;")
    public final class138 method837(class523 arg0, boolean arg1) {
        ++field3423;
        int[] var3 = new int[arg0.field7709 * arg0.field7707];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7708 == null) {
            for (int var6 = 0; ~arg0.field7709 < ~var6; ++var6) {
                for (int var7 = 0; arg0.field7707 > var7; ++var7) {
                    int var8 = arg0.field7712[arg0.field7705[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class338.method2141(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field7709; ++var9) {
                for (int var11 = 0; arg0.field7707 > var11; ++var11) {
                    var3[var5++] = class338.method2141(arg0.field7708[var4] << 24, arg0.field7712[class344.method2224(255, arg0.field7705[var4])]);
                    ++var4;
                }
            }
        }
        class138 var10 = this.method834(var3, 0, arg0.field7707, arg0.field7707, arg0.field7709);
        var10.method209(arg0.field7710, arg0.field7711, arg0.field7704, arg0.field7706);
        return var10;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLh;)V")
    public final void method1431(boolean arg0, class161 arg1) {
        ++field3575;
        if (~this.field3606 <= -1 && this.field3609[this.field3606] == arg1) {
            if (arg0) {
                this.field3592 = null;
            }
            this.field3609[this.field3606--] = null;
            arg1.method1116(-10395);
            if (this.field3606 < 0) {
                this.field3610 = null;
            } else {
                this.field3610 = this.field3609[this.field3606];
                this.field3610.method1117(31988);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)I")
    public static final int method1432(int arg0, int arg1) {
        return class526.field7761 != null ? class526.field7761[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V")
    public final void method873(float arg0, float arg1, float arg2) {
        class3.field25 = arg0;
        class46.field749 = arg2;
        class203.field3210 = arg1;
        ++field3460;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIB)V")
    public final void method1433(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 32) {
            this.field3682 = null;
        }
        ++field3547;
        OpenGL.glDrawArrays(arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "HA", descriptor = "(IIII)V")
    public final void method868(int arg0, int arg1, int arg2, int arg3) {
        ++field3525;
        if (this.field3727 < arg0) {
            this.field3727 = arg0;
        }
        if (~this.field3631 > ~arg1) {
            this.field3631 = arg1;
        }
        if (~this.field3624 < ~arg2) {
            this.field3624 = arg2;
        }
        if (this.field3625 > arg3) {
            this.field3625 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method1459(true);
        this.method1418((byte) 63);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lko;IIII)Le;")
    public final class530 method875(class227 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3535;
        return new class106(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
    public final void method862(int arg0, int arg1) {
        if (~this.field3628 != ~arg0 || ~this.field3626 != ~arg1) {
            this.field3628 = arg0;
            this.field3626 = arg1;
            this.method1488((byte) -43);
            this.method1460(5889);
            if (~this.field3664 != -4) {
                if (this.field3664 == 2) {
                    this.method1466(255);
                }
            } else {
                this.method1458(-1);
            }
        }
        ++field3477;
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(B)V")
    public final void method1434(byte arg0) {
        if (arg0 != 72) {
            this.method1413((byte) -4);
        }
        OpenGL.glPopMatrix();
        ++field3526;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)Lhg;")
    public final class358 method1435(boolean arg0) {
        if (arg0) {
            this.method1483(83);
        }
        ++field3436;
        return this.field3679 == null ? null : this.field3679.method373(-33);
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(B)V")
    public static final void method1436(byte arg0) {
        ++field3532;
        class129.field2225 = true;
        int var1 = 81 / ((67 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lug;)V")
    public final void method894(class322 arg0) {
        ++field3570;
        this.field3679 = (class508) arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lug;Lug;FLug;)Lug;")
    public final class322 method812(class322 arg0, class322 arg1, float arg2, class322 arg3) {
        ++field3450;
        if (arg0 != null && arg1 != null && this.field3633 && this.field3724) {
            class53 var5 = null;
            class508 var6 = (class508) arg0;
            class508 var7 = (class508) arg1;
            class358 var8 = var6.method373(-50);
            class358 var9 = var7.method373(-81);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field5571 <= ~var8.field5571 ? var9.field5571 : var8.field5571;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class53) {
                    class53 var11 = (class53) arg3;
                    if (~var11.method372(-32) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class53(this, var10);
                }
                if (var5.method371(8040, arg2, var9, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(B)V")
    private final void method1437(byte arg0) {
        class394.field6034[3] = 1.0F;
        ++field3398;
        class394.field6034[2] = this.field3712 * this.field3652;
        class394.field6034[0] = this.field3712 * this.field3697;
        if (arg0 >= 93) {
            class394.field6034[1] = this.field3712 * this.field3672;
            OpenGL.glLightModelfv(2899, class394.field6034, 0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lh;Z)V")
    public final void method1438(class161 arg0, boolean arg1) {
        ++field3501;
        if (arg1) {
            this.field3741 = null;
        }
        if (~this.field3604 <= -1 && this.field3608[this.field3604] == arg0) {
            this.field3608[this.field3604--] = null;
            arg0.method1115((byte) 105);
            if (this.field3604 >= 0) {
                this.field3607 = this.field3608[this.field3604];
                this.field3607.method1114(-5376);
            } else {
                this.field3607 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
    private final void method1439(int arg0) {
        ++field3425;
        OpenGL.glViewport(this.field3635, this.field3719, this.field3442, this.field3569);
        if (arg0 != 2) {
            this.field3729 = -116;
        }
    }

    @OriginalMember(owner = "client!ih", name = "pa", descriptor = "()I")
    public final int method823() {
        ++field3497;
        return this.field3615 + this.field3612 - -this.field3614;
    }

    @OriginalMember(owner = "client!ih", name = "ma", descriptor = "(IIIII)V")
    public final void method854(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1444((byte) -118);
        ++field3455;
        this.method1486(arg4, (byte) 116);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()Z")
    public final boolean method896() {
        ++field3432;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V")
    public final void method1440(int arg0, int arg1) {
        if (~this.field3715 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field3715 = arg0;
        }
        if (arg1 != 0) {
            this.field3691 = null;
        }
        ++field3505;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Le;Ld;Lc;Ltq;I)V")
    public final void method853(class530 arg0, class66 arg1, class202 arg2, class273 arg3, int arg4) {
        ++field3585;
        arg0.method736(arg2, arg3, arg4);
        this.method885(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "(B)V")
    private final void method1441(byte arg0) {
        if (this.field3400 == null) {
            this.field3463 = this.field3421 = 0;
        } else {
            Dimension var2 = this.field3400.getSize();
            this.field3421 = var2.height;
            this.field3463 = var2.width;
        }
        if (arg0 != -12) {
            this.field3740 = null;
        }
        ++field3458;
        if (this.field3610 == null) {
            this.field3569 = this.field3421;
            this.field3442 = this.field3463;
            this.method1439(arg0 ^ -10);
        }
        this.method1408((byte) 6);
        this.method848();
    }

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "(IIIIII)V")
    public final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3427;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1444((byte) -117);
        float var10 = (float) arg3 + var8;
        this.method1486(arg5, (byte) 119);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3637) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3637) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class448 arg6, int arg7, int arg8) {
        ++field3527;
        class485 var10 = (class485) arg6;
        class536 var11 = var10.field7119;
        this.method1425((byte) 84);
        this.method1471(true, var10.field7119);
        this.method1486(arg5, (byte) 114);
        this.method1482(7681, 8960, 8448);
        this.method1474(0, 34167, -5000, 768);
        float var12 = var11.field7867 / (float) var11.field7877;
        float var13 = var11.field7871 / (float) var11.field7880;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1474(0, 5890, -5000, 768);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI[BBI)Lig;")
    public final class92 method1442(boolean arg0, int arg1, byte[] arg2, byte arg3, int arg4) {
        ++field3462;
        if (!this.field3661 || arg0 && !this.field3694) {
            int var6 = -84 % ((arg3 - 75) / 48);
            return new class216(this, arg4, arg2, arg1);
        } else {
            return new class72(this, arg4, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)Lug;")
    public final class322 method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3567;
        return this.field3633 ? new class178(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "()Z")
    public final boolean method822() {
        ++field3409;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "(B)V")
    private final void method1443(byte arg0) {
        if (arg0 <= 4) {
            this.field3587 = null;
        }
        ++field3544;
        if (~this.field3664 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3442 < -1 && ~this.field3569 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3442, (double) this.field3569, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3664 = 1;
            this.field3627 &= -25;
        }
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z")
    public final boolean method903() {
        ++field3537;
        return this.field3590 != null && this.field3590.method1689(1);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "()Z")
    public final boolean method833() {
        ++field3553;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public final void method852(int arg0) {
        ++field3586;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "()I")
    public final int method905() {
        ++field3402;
        int var1 = this.field3743;
        this.field3743 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "(B)V")
    private final void method1444(byte arg0) {
        if (~this.field3627 != -2) {
            this.method1443((byte) 17);
            this.method1405(-39, false);
            this.method1417(false, false);
            this.method1481(true, false);
            this.method1473(-118, false);
            this.method1471(true, (class179) null);
            this.method1463(-2, (byte) 91);
            this.method1410(1, 7681);
            this.field3627 = 1;
        }
        if (arg0 > -113) {
            this.method895(-104, -5, -91, -58, 38, -0.037692145F);
        }
        ++field3397;
    }

    @OriginalMember(owner = "client!ih", name = "JA", descriptor = "(F)V")
    public final void method910(float arg0) {
        ++field3511;
        if (this.field3712 != arg0) {
            this.field3712 = arg0;
            this.method1437((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ln;)V")
    public final void method849(class511 arg0) {
        ++field3536;
        this.field3603 = ((class95) arg0).field1603;
        if (this.field3716 == null) {
            class364 var2 = new class364(80);
            if (!this.field3708) {
                var2.method2323(-1.0F, (byte) -86);
                var2.method2323(-1.0F, (byte) -122);
                var2.method2323(0.0F, (byte) -59);
                var2.method2323(0.0F, (byte) -63);
                var2.method2323(1.0F, (byte) -111);
                var2.method2323(1.0F, (byte) -75);
                var2.method2323(-1.0F, (byte) -113);
                var2.method2323(0.0F, (byte) -93);
                var2.method2323(1.0F, (byte) -100);
                var2.method2323(1.0F, (byte) -68);
                var2.method2323(1.0F, (byte) -99);
                var2.method2323(1.0F, (byte) -71);
                var2.method2323(0.0F, (byte) -124);
                var2.method2323(1.0F, (byte) -80);
                var2.method2323(0.0F, (byte) -88);
                var2.method2323(-1.0F, (byte) -74);
                var2.method2323(1.0F, (byte) -77);
                var2.method2323(0.0F, (byte) -128);
                var2.method2323(0.0F, (byte) -73);
                var2.method2323(0.0F, (byte) -93);
            } else {
                var2.method2319(-1.0F, 2177);
                var2.method2319(-1.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(-1.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(-1.0F, 2177);
                var2.method2319(1.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(0.0F, 2177);
                var2.method2319(0.0F, 2177);
            }
            this.field3716 = this.method1442(false, var2.field301, var2.field302, (byte) -20, 20);
            this.field3691 = new class45(this.field3716, 5126, 3, 0);
            this.field3701 = new class45(this.field3716, 5126, 2, 12);
            this.field3588.method2140(this, false);
        }
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "(B)V")
    public final void method1445(byte arg0) {
        int var2 = -96 % ((19 - arg0) / 46);
        ++field3487;
        if (~this.field3627 != -9) {
            this.method1421((byte) 49);
            this.method1405(-87, true);
            this.method1481(true, true);
            this.method1473(-124, true);
            this.method1486(1, (byte) 123);
            this.method1410(0, 7681);
            this.field3627 = 8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lnb;I)V")
    public final void method1446(class246 arg0, int arg1) {
        OpenGL.glPushMatrix();
        ++field3521;
        OpenGL.glMultMatrixf(arg0.method1675(83), 0);
        if (arg1 != 8960) {
            this.field3649 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lja;)V")
    public final void method870(int arg0, class450[] arg1) {
        ++field3399;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3668[var3] = arg1[var3];
        }
        this.field3630 = arg0;
        if (~this.field3664 != -2) {
            this.method1457(-115);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V")
    public final void method1447(byte arg0, boolean arg1) {
        ++field3441;
        if (this.field3659 == !arg1) {
            this.field3659 = arg1;
            this.method1413((byte) 18);
        }
        int var3 = 8 / ((20 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3561;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()Z")
    public final boolean method827() {
        ++field3539;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqm;[Lwh;Z)Lla;")
    public final class296 method892(class331 arg0, class523[] arg1, boolean arg2) {
        ++field3524;
        return new class211(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)I")
    public final int method1448(int arg0, int arg1) {
        ++field3530;
        if (arg0 >= -11) {
            this.field3699 = 0.9691158F;
        }
        if (arg1 != 6406 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 != -6409 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (~arg1 != -34843) {
                            if (~arg1 == -6403) {
                                return 3;
                            } else if (arg1 == 6401) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
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
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIF)V")
    public final void method1449(float arg0, int arg1, float arg2) {
        this.field3655 = arg2;
        ++field3528;
        this.field3735 = arg0;
        if (arg1 != -22222) {
            this.field3616 = null;
        }
        if (!this.field3693) {
            this.method1460(arg1 ^ -16845);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIFF)V")
    private final void method1450(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field3548;
        if (this.field3640) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg2);
        OpenGL.glMatrixMode(arg1);
        this.field3640 = true;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
    public final synchronized void method1451(int arg0, boolean arg1) {
        ++field3440;
        class276 var3 = new class276();
        var3.field4542 = (long) arg0;
        this.field3620.method2541(0, var3);
        if (!arg1) {
            this.field3657 = 61;
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public final void method855(int arg0) {
        this.method1483(-17827);
        ++field3420;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IF)V")
    public final void method1452(int arg0, float arg1) {
        if (this.field3660 != arg1) {
            this.field3660 = arg1;
            if (this.field3664 == 3) {
                this.method1458(-1);
            }
        }
        ++field3492;
        if (arg0 >= -42) {
            this.method870(-33, (class450[]) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "SA", descriptor = "(Lc;)V")
    public final void method911(class202 arg0) {
        this.field3685 = (class246) arg0;
        ++field3534;
        this.field3675.method1678(-103, this.field3685);
        if (this.field3664 != 1) {
            this.method1409(-94);
        }
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "()Z")
    public final boolean method808() {
        ++field3549;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)V")
    private final void method1453(int arg0) {
        ++field3484;
        this.field3685 = new class246();
        this.field3675 = new class246();
        this.field3717 = new class179[this.field3722];
        this.field3696 = new class187(this, 3553, 6408, 1, 1);
        new class187(this, 3553, 6408, 1, 1);
        new class187(this, 3553, 6408, 1, 1);
        if (arg0 != 16087) {
            method1436((byte) -49);
        }
        this.field3669 = new class106(this);
        this.field3723 = new class106(this);
        this.field3677 = new class106(this);
        this.field3732 = new class106(this);
        this.field3674 = new class106(this);
        this.field3736 = new class106(this);
        this.field3646 = new class106(this);
        this.field3711 = new class106(this);
        this.field3682 = new class106(this);
        this.field3663 = new class106(this);
        if (this.field3724) {
            this.field3649 = new class533(this);
            new class533(this);
        }
    }

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3565;
        float var10;
        float var11;
        if (this.field3692 != null && ~this.field3692.field2920 <= ~arg2 && ~arg3 >= ~this.field3692.field2914) {
            this.field3692.method1268(arg2, (byte) 125, false, 0, arg6, arg3, 6406, 0, 0, 0);
            var10 = (float) arg3 * this.field3692.field7871 / (float) this.field3692.field2914;
            var11 = (float) arg2 * this.field3692.field7867 / (float) this.field3692.field2920;
        } else {
            this.field3692 = class330.method2075(arg6, arg2, arg3, false, this, 6406, 6406, (byte) 105);
            this.field3692.method1262(-1, false, false);
            var11 = this.field3692.field7867;
            var10 = this.field3692.field7871;
        }
        this.method1425((byte) 63);
        this.method1471(true, this.field3692);
        this.method1486(arg8, (byte) 125);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1427(arg5, false);
        this.method1482(34165, 8960, 34165);
        this.method1474(0, 34166, -5000, 768);
        this.method1474(2, 5890, -5000, 770);
        this.method1484(34166, 0, 770, 34184);
        this.method1484(5890, 2, 770, 34184);
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
        this.method1474(0, 5890, -5000, 768);
        this.method1474(2, 34166, -5000, 770);
        this.method1484(5890, 0, 770, 34184);
        this.method1484(34166, 2, 770, 34184);
    }

    @OriginalMember(owner = "client!ih", name = "aa", descriptor = "()F")
    public final float method898() {
        ++field3428;
        return this.field3653;
    }

    @OriginalMember(owner = "client!ih", name = "AA", descriptor = "()I")
    public final int method845() {
        ++field3489;
        return this.field3628;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Le;Lc;[Ltq;I)V")
    public final void method880(class530[] arg0, class202 arg1, class273[] arg2, int arg3) {
        ++field3403;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method736(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V")
    public final void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1444((byte) -127);
        ++field3512;
        this.method1486(arg5, (byte) 116);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "()V")
    public final void method858() {
        ++field3499;
        this.field3693 = false;
        this.field3589.method58(0, false, 0, 0, -43, false);
        this.method1460(5889);
        this.method1464((byte) 18);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIF)Lja;")
    public final class450 method895(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3577;
        return new class160(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "()I")
    public final int method816() {
        ++field3430;
        return this.field3626;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ld;)V")
    public final void method885(class66 arg0) {
        this.field3588.method2132((byte) 43, this, arg0);
        ++field3416;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V")
    private final void method1454(boolean arg0) {
        this.method1463(-2, (byte) 125);
        ++field3574;
        for (int var2 = this.field3722 - 1; ~var2 <= -1; --var2) {
            this.method1440(var2, 0);
            this.method1471(true, (class179) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1482(8448, 8960, 8448);
        this.method1474(2, 34168, -5000, 770);
        this.method1476(-2);
        this.field3678 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field3676 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field3689 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field3707 = true;
        this.method1405(-83, true);
        this.method1417(true, arg0);
        this.method1481(true, true);
        this.method1473(-125, true);
        this.method1408((byte) 6);
        this.field3587.setSwapInterval(0);
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
        for (int var4 = 0; var4 < 8; ++var4) {
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
        this.field3704 = this.field3641 = -1;
        this.method848();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FIFFF)V")
    public final void method1455(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class394.field6034[1] = arg3;
        class394.field6034[0] = arg4;
        if (arg1 > -113) {
            this.field3664 = -81;
        }
        ++field3466;
        class394.field6034[3] = arg2;
        class394.field6034[2] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class394.field6034, 0);
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "()Lc;")
    public final class202 method835() {
        ++field3422;
        return new class246();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILh;)V")
    public final void method1456(int arg0, class161 arg1) {
        ++field3504;
        if (this.field3604 >= arg0) {
            throw new RuntimeException();
        } else {
            if (~this.field3604 <= -1) {
                this.field3608[this.field3604].method1115((byte) 105);
            }
            this.field3607 = this.field3608[++this.field3604] = arg1;
            this.field3607.method1114(-5376);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Le;Ld;Lc;[Ltq;I)V")
    public final void method838(class530[] arg0, class66 arg1, class202 arg2, class273[] arg3, int arg4) {
        ++field3485;
        this.method880(arg0, arg2, arg3, arg4);
        this.method885(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V")
    private final void method1457(int arg0) {
        ++field3545;
        int var2 = 0;
        if (arg0 >= -88) {
            this.field3700 = -0.39890826F;
        }
        while (var2 < this.field3630) {
            class450 var3 = this.field3668[var2];
            int var4 = 16386 - -var2;
            class206.field3256[0] = (float) var3.method2700(false);
            class206.field3256[1] = (float) var3.method2697(123);
            class206.field3256[2] = (float) var3.method2696((byte) 125);
            class206.field3256[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class206.field3256, 0);
            int var5 = var3.method2695((byte) -96);
            float var6 = var3.method2698(1865) / 255.0F;
            class206.field3256[1] = var6 * (float) class344.method2224(255, var5 >> 8);
            class206.field3256[0] = (float) (class344.method2224(var5, 16766557) >> 16) * var6;
            class206.field3256[2] = var6 * (float) class344.method2224(255, var5);
            OpenGL.glLightfv(var4, 4609, class206.field3256, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2694(false) * var3.method2694(false)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (~this.field3698 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field3698 = this.field3630;
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V")
    private final void method1458(int arg0) {
        ++field3550;
        float var2 = (float) (-this.field3734) * this.field3660 / (float) this.field3636;
        float var3 = (float) (-this.field3657) * this.field3660 / (float) this.field3665;
        float var4 = (float) (this.field3442 - this.field3734) * this.field3660 / (float) this.field3636;
        float var5 = (float) (-this.field3657 + this.field3569) * this.field3660 / (float) this.field3665;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field3628 - this.field3653), (double) ((float) this.field3626 - this.field3653));
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != -1) {
            this.method1410(-47, -49);
        }
    }

    @OriginalMember(owner = "client!ih", name = "ba", descriptor = "(IIII)V")
    public final void method829(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field3569 > ~arg3) {
            arg3 = this.field3569;
        }
        ++field3408;
        if (~this.field3442 > ~arg2) {
            arg2 = this.field3442;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field3624 = arg2;
        this.field3625 = arg3;
        this.field3631 = arg1;
        this.field3727 = arg0;
        OpenGL.glEnable(3089);
        this.method1459(true);
        this.method1418((byte) 63);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V")
    private final void method1459(boolean arg0) {
        if (!arg0) {
            this.method1419(-2, 80, 55);
        }
        ++field3520;
        this.field3634 = (float) (-this.field3657 + this.field3625);
        this.field3706 = (float) (-this.field3734 + this.field3727);
        this.field3705 = (float) (-this.field3734 + this.field3624);
        this.field3699 = (float) (-this.field3657 + this.field3631);
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V")
    private final void method1460(int arg0) {
        ++field3475;
        int var2;
        if (this.field3693) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field3673;
        } else {
            this.field3662 = (float) (this.field3626 - this.field3729) - this.field3735;
            this.field3647 = -((float) this.field3726 * this.field3655) + this.field3662;
            if (this.field3647 < (float) this.field3628) {
                this.field3647 = (float) this.field3628;
            }
            OpenGL.glFogf(2915, this.field3647);
            OpenGL.glFogf(2916, this.field3662);
            var2 = this.field3641;
        }
        class394.field6034[0] = (float) class344.method2224(var2, 16711680) / 1.671168E7F;
        class394.field6034[2] = (float) class344.method2224(var2, 255) / 255.0F;
        class394.field6034[1] = (float) class344.method2224(var2, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class394.field6034, 0);
        if (arg0 != 5889) {
            this.field3717 = null;
        }
        if (this.field3693) {
            this.field3589.field99.method1584(arg0 ^ -5901);
        }
    }

    @OriginalMember(owner = "client!ih", name = "va", descriptor = "()V")
    public final void method848() {
        this.field3625 = this.field3569;
        this.field3631 = 0;
        this.field3624 = this.field3442;
        ++field3413;
        this.field3727 = 0;
        OpenGL.glDisable(3089);
        this.method1459(true);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)V")
    private final void method1461(int arg0) {
        OpenGL.glDepthMask(this.field3702 && this.field3687);
        ++field3540;
        if (arg0 != 22899) {
            this.field3744 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)I")
    public final int method1462(byte arg0, int arg1) {
        ++field3417;
        if (arg0 <= 80) {
            return -126;
        } else if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (arg1 != 5125 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "()Z")
    public final boolean method906() {
        ++field3518;
        if (this.field3590 != null) {
            if (!this.field3590.method1689(1)) {
                if (!this.field3592.method1526(-1, this.field3590)) {
                    return false;
                }
                this.field3591.method1126(-31228);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public final void method1463(int arg0, byte arg1) {
        ++field3494;
        if (arg1 < 76) {
            this.field3604 = 52;
        }
        this.method1477(true, true, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "(B)V")
    private final void method1464(byte arg0) {
        if (this.field3714 && ~this.field3726 <= -1 | this.field3693) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field3445;
        if (arg0 != 18) {
            this.method883();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
    public final void method884() {
        for (class276 var1 = this.field3599.method2538(-3); var1 != null; var1 = this.field3599.method2535((byte) -54)) {
            ((class95) var1).method665(-127);
        }
        ++field3493;
        if (this.field3592 != null) {
            this.field3592.method1529(false);
        }
        if (this.field3587 != null) {
            this.method1472((byte) 117);
            Enumeration var2 = this.field3411.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3411.get(var3);
                this.field3587.releaseSurface(var3, var4);
            }
            this.field3587.release();
            this.field3587 = null;
        }
        if (this.field3598) {
            class276.method1823(-1, true, false);
            this.field3598 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "()Z")
    public final boolean method831() {
        ++field3453;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "()F")
    public final float method850() {
        ++field3446;
        return this.field3645;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public final void method826(int arg0, int arg1, int arg2, int arg3) {
        ++field3571;
        if (!this.field3693) {
            throw new RuntimeException("");
        } else {
            this.field3673 = arg1;
            this.field3730 = arg3;
            this.field3725 = arg2;
            this.field3688 = arg0;
            this.field3589.field99.method1586(-16998);
            this.method1460(5889);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLh;)V")
    public final void method1465(byte arg0, class161 arg1) {
        ++field3472;
        if (this.field3606 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field3606 <= -1) {
                this.field3609[this.field3606].method1116(-10395);
            }
            this.field3610 = this.field3609[++this.field3606] = arg1;
            if (arg0 >= -58) {
                this.field3682 = null;
            }
            this.field3610.method1117(31988);
        }
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V")
    private final void method1466(int arg0) {
        ++field3523;
        if (arg0 != 255) {
            this.field3662 = 0.033365943F;
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field3654, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "(B)V")
    public final void method1467(byte arg0) {
        OpenGL.glPushMatrix();
        ++field3582;
        if (arg0 >= -92) {
            this.method1417(true, true);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "()V")
    public final void method828() {
        ++field3404;
        this.method1473(-101, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ih", name = "sa", descriptor = "(IIII)[I")
    public final int[] method811(int arg0, int arg1, int arg2, int arg3) {
        ++field3573;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field3569 + -arg1, arg2, 1, 32993, this.field3671, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)Z")
    public static final boolean method1468(int arg0, int arg1, int arg2) {
        if (arg2 != 458752) {
            field3405 = 31;
        }
        ++field3552;
        return class243.method1663(arg1, -364, arg0) | (458752 & arg1) != 0 || class163.method1122(arg1, 16619, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "GA", descriptor = "(IIII)V")
    public final void method857(int arg0, int arg1, int arg2, int arg3) {
        this.field3734 = arg0;
        this.field3665 = arg3;
        ++field3533;
        this.field3636 = arg2;
        this.field3657 = arg1;
        this.method1488((byte) -43);
        this.method1459(true);
        if (~this.field3664 == -4) {
            this.method1458(-1);
        } else if (~this.field3664 == -3) {
            this.method1466(255);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Loi;B)V")
    public final void method1469(class43 arg0, byte arg1) {
        ++field3486;
        if (this.field3683 != arg0) {
            if (this.field3661) {
                OpenGL.glBindBufferARB(34963, arg0.method315((byte) -21));
            }
            this.field3683 = arg0;
        }
        int var3 = 44 % ((-69 - arg1) / 57);
    }

    @OriginalMember(owner = "client!ih", name = "ya", descriptor = "(I)V")
    public final void method866(int arg0) {
        this.field3601 = 0;
        ++field3443;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field3601;
        }
        this.field3600 = 1 << this.field3601;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class220 method814(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3554;
        return new class412(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
    public final void method900(boolean arg0) {
        ++field3467;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)I")
    public final int method1470(byte arg0, int arg1) {
        ++field3415;
        if (arg0 > -30) {
            this.field3569 = 112;
        }
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        return 260;
                    } else if (arg1 == 4) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLkk;)V")
    public final void method1471(boolean arg0, class179 arg1) {
        if (arg0) {
            ++field3563;
            class179 var3 = this.field3717[this.field3715];
            if (arg1 != var3) {
                if (arg1 == null) {
                    OpenGL.glDisable(var3.field2829);
                } else {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field2829);
                    } else if (arg1.field2829 != var3.field2829) {
                        OpenGL.glDisable(var3.field2829);
                        OpenGL.glEnable(arg1.field2829);
                    }
                    OpenGL.glBindTexture(arg1.field2829, arg1.method1204(!arg0));
                }
                this.field3717[this.field3715] = arg1;
            }
            this.field3627 &= -2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "(B)V")
    private final void method1472(byte arg0) {
        ++field3491;
        int var2 = 75 % ((-25 - arg0) / 57);
        this.field3587.detach();
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IZ)V")
    public final void method1473(int arg0, boolean arg1) {
        if (this.field3702 != arg1) {
            this.field3702 = arg1;
            this.method1461(22899);
            this.field3627 &= -32;
        }
        ++field3434;
        if (arg0 >= -99) {
            this.method854(21, 118, -13, -94, 30);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V")
    public final void method1474(int arg0, int arg1, int arg2, int arg3) {
        ++field3433;
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg1);
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg3);
        if (arg2 != -5000) {
            this.method905();
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method916(Canvas arg0) {
        ++field3482;
        long var2 = 0L;
        if (arg0 != null && this.field3448 != arg0) {
            if (this.field3411.containsKey(arg0)) {
                Long var4 = (Long) this.field3411.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3538;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field3587.surfaceResized(var2);
            if (this.field3400 == arg0) {
                this.method1441((byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V")
    private final void method1475(int arg0) {
        class394.field6034[0] = this.field3731 * this.field3697;
        class394.field6034[1] = this.field3731 * this.field3672;
        class394.field6034[2] = this.field3731 * this.field3652;
        ++field3464;
        class394.field6034[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class394.field6034, 0);
        class394.field6034[1] = -this.field3642 * this.field3672;
        class394.field6034[2] = -this.field3642 * this.field3652;
        class394.field6034[0] = -this.field3642 * this.field3697;
        class394.field6034[3] = 1.0F;
        if (arg0 >= 10) {
            OpenGL.glLightfv(16385, 4609, class394.field6034, 0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "()V")
    public final void method842() {
        if (this.field3590 != null && this.field3590.method1689(1)) {
            this.field3592.method1525(0, this.field3590);
            this.field3591.method1126(-31228);
        }
        ++field3435;
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "(IFFFFF)V")
    public final void method859(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3564;
        boolean var7 = ~this.field3704 != ~arg0;
        if (var7 || this.field3731 != arg1 || this.field3642 != arg2) {
            this.field3642 = arg2;
            this.field3704 = arg0;
            this.field3731 = arg1;
            if (var7) {
                this.field3672 = (float) (this.field3704 & 65280) / 65280.0F;
                this.field3697 = (float) (16711680 & this.field3704) / 1.671168E7F;
                this.field3652 = (float) (this.field3704 & 255) / 255.0F;
                this.method1437((byte) 113);
            }
            this.method1475(123);
        }
        if (this.field3667[0] != arg3 || this.field3667[1] != arg4 || this.field3667[2] != arg5) {
            this.field3667[2] = arg5;
            this.field3667[1] = arg4;
            this.field3667[0] = arg3;
            this.field3644[1] = -arg4;
            this.field3644[2] = -arg5;
            this.field3644[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3695[2] = arg5 * var8;
            this.field3695[1] = arg4 * var8;
            this.field3695[0] = arg3 * var8;
            this.field3738[0] = -this.field3695[0];
            this.field3738[1] = -this.field3695[1];
            this.field3738[2] = -this.field3695[2];
            this.method1422((byte) -59);
            this.field3703 = (int) (arg3 * 256.0F / arg4);
            this.field3643 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)V")
    private final void method1476(int arg0) {
        ++field3431;
        if (arg0 != -2) {
            this.field3694 = true;
        }
        if (this.field3640) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3640 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method889(int arg0) {
        this.method1472((byte) -96);
        ++field3470;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZI)V")
    public final void method1477(boolean arg0, boolean arg1, int arg2) {
        ++field3508;
        this.method1424(arg0, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(II)V")
    public final synchronized void method1478(int arg0, int arg1) {
        int var3 = 108 % ((44 - arg1) / 32);
        ++field3542;
        class22 var4 = new class22(arg0);
        this.field3618.method2541(0, var4);
    }

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "()V")
    public final void method844() {
        ++field3516;
        try {
            this.field3587.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "(I)V")
    public final void method1479(int arg0) {
        if (~this.field3627 != -5) {
            this.method1443((byte) 10);
            this.method1405(-71, false);
            this.method1417(false, false);
            this.method1481(true, false);
            this.method1473(-105, false);
            this.method1463(-2, (byte) 102);
            this.method1486(1, (byte) 115);
            this.method1410(0, 7681);
            this.field3627 = 4;
        }
        ++field3517;
        if (arg0 != 4615) {
            this.method1471(true, (class179) null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public final void method856(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3519;
        OpenGL.glLineWidth((float) arg5);
        this.method839(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "()Lc;")
    public final class202 method820() {
        ++field3522;
        return this.field3595;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class138 method843(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3439;
        return new class263(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BZIII)Loi;")
    public final class43 method1480(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3566;
        if (arg3 < 23) {
            this.method1455(0.5046143F, -78, -7.272608E-4F, 1.1803063F, 0.6712922F);
        }
        return (class43) (!this.field3661 || arg1 && !this.field3694 ? new class498(this, arg2, arg0, arg4) : new class309(this, arg2, arg0, arg4, arg1));
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
    public final void method813(int arg0, int arg1, int arg2, int arg3) {
        ++field3498;
        this.field3592.method1531(arg3, (byte) -116, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZZ)V")
    public final void method1481(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field3447;
            if (this.field3733 != arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field3627 &= -32;
                this.field3733 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(IIII)V")
    public final void method871(int arg0, int arg1, int arg2, int arg3) {
        this.field3693 = true;
        this.field3725 = arg2;
        this.field3673 = arg1;
        this.field3730 = arg3;
        ++field3488;
        this.field3688 = arg0;
        this.field3589.method58(3, false, 0, 0, -84, false);
        this.field3589.field99.method1586(-16998);
        this.method1460(5889);
        this.method1464((byte) 18);
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "()Z")
    public final boolean method841() {
        ++field3509;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(III)V")
    public final void method1482(int arg0, int arg1, int arg2) {
        ++field3556;
        if (~this.field3715 == -1) {
            boolean var4 = false;
            if (~this.field3629 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field3629 = arg0;
            }
            if (~this.field3648 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field3648 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field3627 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
        if (arg1 != 8960) {
            this.field3616 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "(I)V")
    private final void method1483(int arg0) {
        if (arg0 == -17827) {
            ++field3469;
            int var2 = 0;
            while (!this.field3587.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class444.method2667(arg0 ^ 11155, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V")
    public final void method1484(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + arg3, arg0);
        ++field3449;
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)I")
    private final int method1485(boolean arg0) {
        ++field3584;
        int var2 = 0;
        this.field3650 = OpenGL.glGetString(7936).toLowerCase();
        this.field3680 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field3650.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field3650.indexOf("brian paul") != -1 || this.field3650.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class241.method1661(' ', -20326, var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class508.method2990(var4[0], 23403);
                int var6 = class508.method2990(var4[1], 23403);
                this.field3623 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field3623 > -13) {
            var2 |= 2;
        }
        if (!this.field3587.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3587.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3722 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3718 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3686 = var7[0];
        if (this.field3722 < 2 || ~this.field3718 > -3 || ~this.field3686 > -3) {
            var2 |= 16;
        }
        this.field3708 = NativeStream.method96();
        this.field3587.arePbuffersAvailable();
        this.field3661 = this.field3587.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3637 = this.field3587.isExtensionAvailable("GL_ARB_multisample");
        this.field3684 = this.field3587.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3587.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3681 = this.field3587.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3721 = this.field3587.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3670 = this.field3587.isExtensionAvailable("GL_EXT_texture3D");
        this.field3666 = this.field3587.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3633 = this.field3587.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3658 = this.field3587.isExtensionAvailable("GL_ARB_texture_float");
        this.field3739 = arg0;
        this.field3724 = this.field3587.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field3720 = this.field3587.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field3737 = this.field3587.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field3710 = this.field3737 & this.field3720;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "()Z")
    public final boolean method807() {
        ++field3424;
        return this.field3637 && (!this.method903() || this.field3710);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V")
    public final void method1486(int arg0, byte arg1) {
        if (~this.field3678 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    var3 = true;
                    var4 = false;
                    var5 = 2;
                } else if (arg0 != 128) {
                    var3 = true;
                    var5 = 0;
                    var4 = false;
                } else {
                    var5 = 3;
                    var4 = true;
                    var3 = true;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = 1;
            }
            if (!var3 != !this.field3707) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field3707 = var3;
            }
            if (this.field3689 != var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field3689 = var4;
            }
            if (~this.field3676 != ~var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var5 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var5 == -4) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field3676 = var5;
            }
            this.field3678 = arg0;
            this.field3627 &= -29;
        }
        ++field3461;
        if (arg1 < 110) {
            this.field3634 = 0.52746075F;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(III)V")
    public final synchronized void method1487(int arg0, int arg1, int arg2) {
        ++field3529;
        class22 var4 = new class22(arg0);
        var4.field4542 = (long) arg2;
        this.field3619.method2541(arg1 ^ arg1, var4);
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(B)V")
    private final void method1488(byte arg0) {
        ++field3572;
        float[] var2 = this.field3654;
        float var3 = (float) (-this.field3734 * this.field3628) / (float) this.field3636;
        if (arg0 == -43) {
            float var4 = (float) ((this.field3442 - this.field3734) * this.field3628) / (float) this.field3636;
            float var5 = (float) (this.field3657 * this.field3628) / (float) this.field3665;
            float var6 = (float) ((-this.field3569 + this.field3657) * this.field3628) / (float) this.field3665;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field3628 * 2.0F;
                var2[3] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = this.field3700 = -((float) this.field3626 * var7) / (float) (this.field3626 - this.field3628);
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = this.field3713 = (float) (-(this.field3626 - -this.field3628)) / (float) (-this.field3628 + this.field3626);
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[11] = -1.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[15] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
            }
            this.method1426(arg0 ^ 17641);
        }
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z")
    public final boolean method815() {
        ++field3500;
        return true;
    }
}
