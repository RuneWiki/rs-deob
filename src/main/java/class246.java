import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class246 extends class65 {

    @OriginalMember(owner = "client!dia", name = "wd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3479 = new Hashtable();

    @OriginalMember(owner = "client!dia", name = "fe", descriptor = "I")
    public int field3514 = 128;

    @OriginalMember(owner = "client!dia", name = "he", descriptor = "Lfka;")
    private class743 field3516 = new class743();

    @OriginalMember(owner = "client!dia", name = "se", descriptor = "Lra;")
    private class118 field3527 = new class118();

    @OriginalMember(owner = "client!dia", name = "te", descriptor = "Lra;")
    public class118 field3528 = new class118();

    @OriginalMember(owner = "client!dia", name = "ue", descriptor = "I")
    public int field3529 = 3;

    @OriginalMember(owner = "client!dia", name = "we", descriptor = "Z")
    private boolean field3531 = false;

    @OriginalMember(owner = "client!dia", name = "ze", descriptor = "I")
    public int field3534 = 8;

    @OriginalMember(owner = "client!dia", name = "Ae", descriptor = "Ltm;")
    private class412 field3535 = new class412();

    @OriginalMember(owner = "client!dia", name = "Be", descriptor = "I")
    private int field3536 = -1;

    @OriginalMember(owner = "client!dia", name = "He", descriptor = "I")
    private int field3542 = -1;

    @OriginalMember(owner = "client!dia", name = "Fe", descriptor = "[Lhga;")
    private class185[] field3540 = new class185[4];

    @OriginalMember(owner = "client!dia", name = "Ge", descriptor = "[Lhga;")
    private class185[] field3541 = new class185[4];

    @OriginalMember(owner = "client!dia", name = "Ie", descriptor = "[Lhga;")
    private class185[] field3543 = new class185[4];

    @OriginalMember(owner = "client!dia", name = "Je", descriptor = "I")
    private int field3544 = -1;

    @OriginalMember(owner = "client!dia", name = "Le", descriptor = "Ltm;")
    private class412 field3546;

    @OriginalMember(owner = "client!dia", name = "Pe", descriptor = "Ltm;")
    private class412 field3550;

    @OriginalMember(owner = "client!dia", name = "Qe", descriptor = "Ltm;")
    private class412 field3551;

    @OriginalMember(owner = "client!dia", name = "Re", descriptor = "Ltm;")
    private class412 field3552;

    @OriginalMember(owner = "client!dia", name = "Se", descriptor = "Ltm;")
    private class412 field3553;

    @OriginalMember(owner = "client!dia", name = "Te", descriptor = "Ltm;")
    private class412 field3554;

    @OriginalMember(owner = "client!dia", name = "Ue", descriptor = "Ltm;")
    private class412 field3555;

    @OriginalMember(owner = "client!dia", name = "cf", descriptor = "Lra;")
    public class118 field3563;

    @OriginalMember(owner = "client!dia", name = "ef", descriptor = "Lra;")
    public class118 field3565;

    @OriginalMember(owner = "client!dia", name = "ff", descriptor = "Lra;")
    public class118 field3566;

    @OriginalMember(owner = "client!dia", name = "jf", descriptor = "I")
    private int field3569;

    @OriginalMember(owner = "client!dia", name = "wf", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!dia", name = "uf", descriptor = "F")
    private float field3580;

    @OriginalMember(owner = "client!dia", name = "Zf", descriptor = "[F")
    public float[] field3611;

    @OriginalMember(owner = "client!dia", name = "sf", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!dia", name = "Wf", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!dia", name = "Qf", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!dia", name = "cg", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!dia", name = "qg", descriptor = "I")
    private int field3628;

    @OriginalMember(owner = "client!dia", name = "ig", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!dia", name = "jg", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!dia", name = "vg", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!dia", name = "Of", descriptor = "[Luca;")
    private class540[] field3600;

    @OriginalMember(owner = "client!dia", name = "Ag", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!dia", name = "Fg", descriptor = "F")
    public float field3643;

    @OriginalMember(owner = "client!dia", name = "Sf", descriptor = "I")
    private int field3604;

    @OriginalMember(owner = "client!dia", name = "tg", descriptor = "[F")
    private float[] field3631;

    @OriginalMember(owner = "client!dia", name = "hg", descriptor = "[F")
    private float[] field3619;

    @OriginalMember(owner = "client!dia", name = "Af", descriptor = "F")
    public float field3586;

    @OriginalMember(owner = "client!dia", name = "Ng", descriptor = "F")
    public float field3651;

    @OriginalMember(owner = "client!dia", name = "rg", descriptor = "F")
    private float field3629;

    @OriginalMember(owner = "client!dia", name = "Hf", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!dia", name = "bg", descriptor = "Z")
    private boolean field3613;

    @OriginalMember(owner = "client!dia", name = "og", descriptor = "F")
    public float field3626;

    @OriginalMember(owner = "client!dia", name = "pf", descriptor = "[F")
    private float[] field3575;

    @OriginalMember(owner = "client!dia", name = "Xg", descriptor = "I")
    private int field3661;

    @OriginalMember(owner = "client!dia", name = "lg", descriptor = "[F")
    private float[] field3623;

    @OriginalMember(owner = "client!dia", name = "Ig", descriptor = "F")
    public float field3646;

    @OriginalMember(owner = "client!dia", name = "Qg", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!dia", name = "Lg", descriptor = "F")
    private float field3649;

    @OriginalMember(owner = "client!dia", name = "mg", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!dia", name = "yg", descriptor = "I")
    private int field3636;

    @OriginalMember(owner = "client!dia", name = "Sg", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!dia", name = "Ef", descriptor = "Z")
    private boolean field3590;

    @OriginalMember(owner = "client!dia", name = "jh", descriptor = "F")
    public float field3673;

    @OriginalMember(owner = "client!dia", name = "gh", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!dia", name = "lh", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!dia", name = "Yg", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!dia", name = "kf", descriptor = "F")
    public float field3570;

    @OriginalMember(owner = "client!dia", name = "mh", descriptor = "F")
    private float field3676;

    @OriginalMember(owner = "client!dia", name = "nh", descriptor = "F")
    private float field3677;

    @OriginalMember(owner = "client!dia", name = "Bg", descriptor = "Luj;")
    public class406 field3639;

    @OriginalMember(owner = "client!dia", name = "rh", descriptor = "[I")
    public int[] field3681;

    @OriginalMember(owner = "client!dia", name = "ph", descriptor = "[I")
    public int[] field3679;

    @OriginalMember(owner = "client!dia", name = "qh", descriptor = "[I")
    public int[] field3680;

    @OriginalMember(owner = "client!dia", name = "sh", descriptor = "[B")
    public byte[] field3682;

    @OriginalMember(owner = "client!dia", name = "Md", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3495;

    @OriginalMember(owner = "client!dia", name = "Ib", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3387;

    @OriginalMember(owner = "client!dia", name = "de", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!dia", name = "Ab", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3379;

    @OriginalMember(owner = "client!dia", name = "Kc", descriptor = "J")
    private long field3441;

    @OriginalMember(owner = "client!dia", name = "Hc", descriptor = "J")
    private long field3438;

    @OriginalMember(owner = "client!dia", name = "Cf", descriptor = "Z")
    public boolean field3588;

    @OriginalMember(owner = "client!dia", name = "Kf", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!dia", name = "ng", descriptor = "Ljava/lang/String;")
    private String field3625;

    @OriginalMember(owner = "client!dia", name = "yf", descriptor = "Z")
    public boolean field3584;

    @OriginalMember(owner = "client!dia", name = "zf", descriptor = "Z")
    private boolean field3585;

    @OriginalMember(owner = "client!dia", name = "Df", descriptor = "Z")
    public boolean field3589;

    @OriginalMember(owner = "client!dia", name = "Pg", descriptor = "Z")
    public boolean field3653;

    @OriginalMember(owner = "client!dia", name = "ah", descriptor = "Z")
    private boolean field3664;

    @OriginalMember(owner = "client!dia", name = "kh", descriptor = "Z")
    public boolean field3674;

    @OriginalMember(owner = "client!dia", name = "Uf", descriptor = "Ljava/lang/String;")
    private String field3606;

    @OriginalMember(owner = "client!dia", name = "fg", descriptor = "Z")
    public boolean field3617;

    @OriginalMember(owner = "client!dia", name = "gf", descriptor = "Z")
    private boolean field3567;

    @OriginalMember(owner = "client!dia", name = "ke", descriptor = "Lgp;")
    private class52 field3519;

    @OriginalMember(owner = "client!dia", name = "ve", descriptor = "Llu;")
    public class742 field3530;

    @OriginalMember(owner = "client!dia", name = "ce", descriptor = "Lfw;")
    private class62 field3511;

    @OriginalMember(owner = "client!dia", name = "be", descriptor = "Lbb;")
    private class353 field3510;

    @OriginalMember(owner = "client!dia", name = "ie", descriptor = "Ldk;")
    private class538 field3517;

    @OriginalMember(owner = "client!dia", name = "vb", descriptor = "[Ljava/lang/String;")
    public static String[] field3374 = new String[200];

    @OriginalMember(owner = "client!dia", name = "Ld", descriptor = "I")
    public static int field3494 = -1;

    @OriginalMember(owner = "client!dia", name = "vf", descriptor = "F")
    public float field3581;

    @OriginalMember(owner = "client!dia", name = "Lf", descriptor = "F")
    public float field3597;

    @OriginalMember(owner = "client!dia", name = "Rf", descriptor = "F")
    private float field3603;

    @OriginalMember(owner = "client!dia", name = "eg", descriptor = "F")
    public float field3616;

    @OriginalMember(owner = "client!dia", name = "gg", descriptor = "F")
    private float field3618;

    @OriginalMember(owner = "client!dia", name = "wg", descriptor = "F")
    public float field3634;

    @OriginalMember(owner = "client!dia", name = "Tg", descriptor = "F")
    public float field3657;

    @OriginalMember(owner = "client!dia", name = "Wg", descriptor = "F")
    public float field3660;

    @OriginalMember(owner = "client!dia", name = "bh", descriptor = "F")
    private float field3665;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!dia", name = "B", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!dia", name = "C", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!dia", name = "D", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!dia", name = "E", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!dia", name = "F", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!dia", name = "G", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!dia", name = "H", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!dia", name = "I", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!dia", name = "J", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!dia", name = "K", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!dia", name = "L", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!dia", name = "M", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!dia", name = "N", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!dia", name = "O", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!dia", name = "P", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!dia", name = "Q", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!dia", name = "R", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!dia", name = "S", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!dia", name = "T", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!dia", name = "U", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!dia", name = "V", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!dia", name = "W", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!dia", name = "X", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!dia", name = "Y", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!dia", name = "Z", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!dia", name = "ab", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!dia", name = "bb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!dia", name = "cb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!dia", name = "db", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!dia", name = "eb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!dia", name = "fb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!dia", name = "gb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!dia", name = "hb", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!dia", name = "ib", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!dia", name = "jb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!dia", name = "kb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!dia", name = "lb", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!dia", name = "mb", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!dia", name = "nb", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!dia", name = "ob", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!dia", name = "pb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!dia", name = "qb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!dia", name = "rb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!dia", name = "sb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!dia", name = "tb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!dia", name = "ub", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!dia", name = "wb", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!dia", name = "xb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!dia", name = "yb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!dia", name = "zb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!dia", name = "Bb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!dia", name = "Cb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!dia", name = "Db", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!dia", name = "Eb", descriptor = "I")
    private int field3383;

    @OriginalMember(owner = "client!dia", name = "Fb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!dia", name = "Gb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!dia", name = "Hb", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!dia", name = "Jb", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!dia", name = "Kb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!dia", name = "Lb", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!dia", name = "Mb", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!dia", name = "Nb", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!dia", name = "Ob", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!dia", name = "Pb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!dia", name = "Qb", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!dia", name = "Rb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!dia", name = "Sb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!dia", name = "Tb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!dia", name = "Ub", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!dia", name = "Vb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!dia", name = "Wb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!dia", name = "Xb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!dia", name = "Yb", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!dia", name = "Zb", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!dia", name = "ac", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!dia", name = "bc", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!dia", name = "cc", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!dia", name = "dc", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!dia", name = "ec", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!dia", name = "fc", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!dia", name = "gc", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!dia", name = "hc", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!dia", name = "ic", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!dia", name = "jc", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!dia", name = "kc", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!dia", name = "lc", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!dia", name = "mc", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!dia", name = "nc", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!dia", name = "oc", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!dia", name = "pc", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!dia", name = "qc", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!dia", name = "rc", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!dia", name = "sc", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dia", name = "tc", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!dia", name = "uc", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!dia", name = "vc", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!dia", name = "wc", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!dia", name = "xc", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!dia", name = "yc", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!dia", name = "zc", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!dia", name = "Ac", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!dia", name = "Bc", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!dia", name = "Cc", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!dia", name = "Dc", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!dia", name = "Ec", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!dia", name = "Fc", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!dia", name = "Gc", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!dia", name = "Ic", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!dia", name = "Jc", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!dia", name = "Lc", descriptor = "I")
    public int field3442;

    @OriginalMember(owner = "client!dia", name = "Mc", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!dia", name = "Nc", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!dia", name = "Oc", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!dia", name = "Pc", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!dia", name = "Qc", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!dia", name = "Rc", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!dia", name = "Sc", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!dia", name = "Tc", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!dia", name = "Uc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!dia", name = "Vc", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!dia", name = "Wc", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!dia", name = "Xc", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!dia", name = "Yc", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!dia", name = "Zc", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!dia", name = "ad", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!dia", name = "bd", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!dia", name = "cd", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!dia", name = "dd", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!dia", name = "ed", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!dia", name = "fd", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!dia", name = "gd", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!dia", name = "hd", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!dia", name = "id", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!dia", name = "jd", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!dia", name = "kd", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!dia", name = "ld", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!dia", name = "md", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!dia", name = "nd", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!dia", name = "od", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!dia", name = "pd", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!dia", name = "qd", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!dia", name = "rd", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dia", name = "sd", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!dia", name = "td", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!dia", name = "ud", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!dia", name = "vd", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!dia", name = "xd", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dia", name = "yd", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!dia", name = "zd", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!dia", name = "Ad", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!dia", name = "Bd", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!dia", name = "Cd", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!dia", name = "Dd", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dia", name = "Ed", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!dia", name = "Fd", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!dia", name = "Gd", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!dia", name = "Hd", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!dia", name = "Id", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!dia", name = "Jd", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!dia", name = "Kd", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!dia", name = "Nd", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!dia", name = "Od", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!dia", name = "Pd", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!dia", name = "Qd", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!dia", name = "Rd", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!dia", name = "Sd", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!dia", name = "Td", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!dia", name = "Ud", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!dia", name = "Vd", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!dia", name = "Wd", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!dia", name = "Xd", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!dia", name = "Yd", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!dia", name = "Zd", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!dia", name = "ae", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!dia", name = "ee", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!dia", name = "ge", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!dia", name = "je", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!dia", name = "le", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!dia", name = "me", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!dia", name = "ne", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!dia", name = "oe", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!dia", name = "pe", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!dia", name = "qe", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!dia", name = "re", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!dia", name = "xe", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!dia", name = "Me", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!dia", name = "Ne", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!dia", name = "Oe", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!dia", name = "Ze", descriptor = "I")
    private int field3560;

    @OriginalMember(owner = "client!dia", name = "bf", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!dia", name = "df", descriptor = "I")
    private int field3564;

    @OriginalMember(owner = "client!dia", name = "hf", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!dia", name = "Jf", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!dia", name = "Mf", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!dia", name = "Tf", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!dia", name = "ag", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!dia", name = "dg", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!dia", name = "kg", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!dia", name = "sg", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!dia", name = "ug", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!dia", name = "Jg", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!dia", name = "Og", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!dia", name = "ch", descriptor = "I")
    private int field3666;

    @OriginalMember(owner = "client!dia", name = "oh", descriptor = "I")
    private int field3678;

    @OriginalMember(owner = "client!dia", name = "th", descriptor = "I")
    private int field3683;

    @OriginalMember(owner = "client!dia", name = "Ve", descriptor = "J")
    private long field3556;

    @OriginalMember(owner = "client!dia", name = "zg", descriptor = "Ltca;")
    public class184 field3637;

    @OriginalMember(owner = "client!dia", name = "Ee", descriptor = "Lhga;")
    private class185 field3539;

    @OriginalMember(owner = "client!dia", name = "Ke", descriptor = "Lhga;")
    private class185 field3545;

    @OriginalMember(owner = "client!dia", name = "Eg", descriptor = "Lm;")
    private class204 field3642;

    @OriginalMember(owner = "client!dia", name = "Zg", descriptor = "Lme;")
    private class207 field3663;

    @OriginalMember(owner = "client!dia", name = "Dg", descriptor = "Lgf;")
    private class293 field3641;

    @OriginalMember(owner = "client!dia", name = "Gf", descriptor = "Lnha;")
    public class342 field3592;

    @OriginalMember(owner = "client!dia", name = "If", descriptor = "Lnha;")
    public class342 field3594;

    @OriginalMember(owner = "client!dia", name = "Pf", descriptor = "Lnha;")
    public class342 field3601;

    @OriginalMember(owner = "client!dia", name = "Vf", descriptor = "Lnha;")
    public class342 field3607;

    @OriginalMember(owner = "client!dia", name = "Yf", descriptor = "Lnha;")
    public class342 field3610;

    @OriginalMember(owner = "client!dia", name = "Cg", descriptor = "Lnha;")
    public class342 field3640;

    @OriginalMember(owner = "client!dia", name = "Gg", descriptor = "Lnha;")
    public class342 field3644;

    @OriginalMember(owner = "client!dia", name = "Rg", descriptor = "Lnha;")
    public class342 field3655;

    @OriginalMember(owner = "client!dia", name = "dh", descriptor = "Lnha;")
    public class342 field3667;

    @OriginalMember(owner = "client!dia", name = "fh", descriptor = "Lnha;")
    public class342 field3669;

    @OriginalMember(owner = "client!dia", name = "mf", descriptor = "Lfha;")
    private class401 field3572;

    @OriginalMember(owner = "client!dia", name = "Ff", descriptor = "Lfha;")
    private class401 field3591;

    @OriginalMember(owner = "client!dia", name = "tf", descriptor = "Lwe;")
    public class430 field3579;

    @OriginalMember(owner = "client!dia", name = "Bf", descriptor = "Lwe;")
    public class430 field3587;

    @OriginalMember(owner = "client!dia", name = "De", descriptor = "Lrp;")
    private class463 field3538;

    @OriginalMember(owner = "client!dia", name = "Ce", descriptor = "Lmj;")
    private class682 field3537;

    @OriginalMember(owner = "client!dia", name = "pg", descriptor = "Lmj;")
    public class682 field3627;

    @OriginalMember(owner = "client!dia", name = "ye", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3533;

    @OriginalMember(owner = "client!dia", name = "We", descriptor = "Z")
    private boolean field3557;

    @OriginalMember(owner = "client!dia", name = "Xe", descriptor = "Z")
    private boolean field3558;

    @OriginalMember(owner = "client!dia", name = "Ye", descriptor = "Z")
    private boolean field3559;

    @OriginalMember(owner = "client!dia", name = "af", descriptor = "Z")
    private boolean field3561;

    @OriginalMember(owner = "client!dia", name = "lf", descriptor = "Z")
    private boolean field3571;

    @OriginalMember(owner = "client!dia", name = "nf", descriptor = "Z")
    private boolean field3573;

    @OriginalMember(owner = "client!dia", name = "of", descriptor = "Z")
    private boolean field3574;

    @OriginalMember(owner = "client!dia", name = "qf", descriptor = "Z")
    public boolean field3576;

    @OriginalMember(owner = "client!dia", name = "rf", descriptor = "Z")
    private boolean field3577;

    @OriginalMember(owner = "client!dia", name = "xf", descriptor = "Z")
    public boolean field3583;

    @OriginalMember(owner = "client!dia", name = "Nf", descriptor = "Z")
    public boolean field3599;

    @OriginalMember(owner = "client!dia", name = "Xf", descriptor = "Z")
    public boolean field3609;

    @OriginalMember(owner = "client!dia", name = "xg", descriptor = "Z")
    public boolean field3635;

    @OriginalMember(owner = "client!dia", name = "Hg", descriptor = "Z")
    public boolean field3645;

    @OriginalMember(owner = "client!dia", name = "Kg", descriptor = "Z")
    public boolean field3648;

    @OriginalMember(owner = "client!dia", name = "Ug", descriptor = "Z")
    private boolean field3658;

    @OriginalMember(owner = "client!dia", name = "Vg", descriptor = "Z")
    private boolean field3659;

    @OriginalMember(owner = "client!dia", name = "eh", descriptor = "Z")
    private boolean field3668;

    @OriginalMember(owner = "client!dia", name = "hh", descriptor = "Z")
    public boolean field3671;

    @OriginalMember(owner = "client!dia", name = "ih", descriptor = "Z")
    public boolean field3672;

    @OriginalMember(owner = "client!dia", name = "Mg", descriptor = "[Lil;")
    private class7[] field3650;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZIZI)V", line = 11)
    public final void method1580(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (this.field3647 != arg3 || this.field3613 != this.field3583) {
            class184 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field3583 ? 0 : 3;
            if (arg3 < 0) {
                this.method1584((byte) -122);
            } else {
                var5 = this.field3519.method382(arg3, (byte) 45);
                class662 var10 = super.field912.method1174(arg3, true);
                if (~var10.field9152 == -1 && ~var10.field9157 == -1) {
                    this.method1584((byte) -84);
                } else {
                    int var11 = !var10.field9143 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method1635((float) (this.field3532 % var12 * var10.field9157) / (float) var12, 0.0F, (float) (this.field3532 % var12 * var10.field9152) / (float) var12, -16777216);
                }
                var6 = var10.field9141;
                if (!this.field3583) {
                    var7 = var10.field9149;
                    var9 = var10.field9140;
                    var8 = var10.field9154;
                }
            }
            this.field3517.method3074(var7, -3912, arg0, var9, var8, arg2);
            if (!this.field3517.method3073(var5, arg1 + 49900, var6)) {
                this.method1653((byte) 120, var5);
                this.method1589(-4, var6);
            }
            this.field3647 = arg3;
            this.field3613 = this.field3583;
        }
        ++field3368;
        this.field3562 &= -8;
        if (arg1 != -32055) {
            this.field3641 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(Z)V", line = 80)
    private final void method1581(boolean arg0) {
        if (arg0) {
            this.field3527 = null;
        }
        if (~this.field3608 <= ~this.field3624 && ~this.field3628 >= ~this.field3661) {
            OpenGL.glScissor(this.field3624 + this.field3620, this.field3621 + this.field3500 + -this.field3661, this.field3608 - this.field3624, -this.field3628 + this.field3661);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field3350;
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(Z)V", line = 95)
    private final void method1582(boolean arg0) {
        ++field3357;
        this.method1640(-2, -116);
        for (int var2 = this.field3605 + -1; ~var2 <= -1; --var2) {
            this.method1637(33984, var2);
            this.method1653((byte) 81, (class7) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1622(8448, 8448, (byte) 125);
        this.method1641(34168, 770, 2, 34192);
        this.method1584((byte) -113);
        this.field3560 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field3564 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field3558 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field3559 = true;
        this.method1642(3723, true);
        this.method1617(true, (byte) 102);
        this.method1587(!arg0, arg0);
        this.method1583((byte) -68, true);
        this.method1629((byte) -54);
        this.field3379.setSwapInterval(0);
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
        this.field3604 = this.field3593 = -1;
        this.method543();
    }

    @OriginalMember(owner = "client!dia", name = "F", descriptor = "(II)V", line = 164)
    public final void method492(int arg0, int arg1) {
        ++field3397;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZ)V", line = 175)
    public final void method1583(byte arg0, boolean arg1) {
        ++field3430;
        if (this.field3557 != arg1) {
            this.field3557 = arg1;
            this.method1639(34846);
            this.field3562 &= -32;
        }
        if (arg0 != -68) {
            this.field3514 = 96;
        }
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(B)V", line = 193)
    private final void method1584(byte arg0) {
        if (arg0 >= -33) {
            this.field3673 = -0.41146773F;
        }
        ++field3347;
        if (this.field3658) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3658 = false;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Leia;[Leu;Z)Lda;", line = 211)
    public final class66 method545(class255 arg0, class508[] arg1, boolean arg2) {
        ++field3476;
        return new class137(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)V", line = 225)
    public final synchronized void method1585(int arg0, byte arg1) {
        int var3 = -120 / ((-36 - arg1) / 44);
        ++field3375;
        class101 var4 = new class101();
        var4.field1409 = (long) arg0;
        this.field3554.method2545(-127, var4);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lm;IIZI)V", line = 238)
    public final void method1586(class204 arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field3489;
        int var6 = arg0.method1374((byte) -70);
        if (!arg3) {
            this.field3683 = 20;
        }
        int var7 = arg4 * this.method1658(120, var6);
        this.method1652(-12, arg0);
        OpenGL.glDrawElements(arg2, arg1, var6, (long) var7 + arg0.method1375(23163));
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "()Z", line = 256)
    public final boolean method461() {
        ++field3417;
        return this.field3510 != null && this.field3510.method2516(917);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII)V", line = 264)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        ++field3501;
        this.field3511.method436(arg0, arg2, arg1, true, arg3);
    }

    @OriginalMember(owner = "client!dia", name = "E", descriptor = "()I", line = 274)
    public final int method567() {
        ++field3475;
        return this.field3549 - (-this.field3548 - this.field3547);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lef;)V", line = 282)
    public final void method524(class515 arg0) {
        this.field3516.method4118(64, arg0, -1, this);
        ++field3439;
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "()V", line = 291)
    public final void method468() {
        ++field3447;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V", line = 299)
    public final void method469(int arg0) {
        ++field3385;
        this.method1633((byte) -20);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 309)
    public final void method448(Canvas arg0, int arg1, int arg2) {
        ++field3410;
        long var4 = 0L;
        if (arg0 != null && this.field3495 != arg0) {
            if (this.field3479.containsKey(arg0)) {
                Long var6 = (Long) this.field3479.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field3441;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field3379.surfaceResized(var4);
            if (this.field3387 == arg0) {
                this.method1630((byte) 59);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "(II)V", line = 345)
    public final void method466(int arg0, int arg1) {
        if (this.field3602 != arg0 || ~this.field3633 != ~arg1) {
            this.field3602 = arg0;
            this.field3633 = arg1;
            this.method1647(29021);
            this.method1626(255);
            if (this.field3666 == 3) {
                this.method1619(124);
            } else if (~this.field3666 == -3) {
                this.method1649((byte) -40);
            }
        }
        ++field3440;
    }

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "()Z", line = 370)
    public final boolean method560() {
        ++field3321;
        if (this.field3510 != null) {
            if (!this.field3510.method2516(917)) {
                if (!this.field3511.method434(this.field3510, (byte) 122)) {
                    return false;
                }
                this.field3519.method380((byte) -21);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZZ)V", line = 394)
    public final void method1587(boolean arg0, boolean arg1) {
        if (this.field3561 != arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field3562 &= -32;
            this.field3561 = arg1;
        }
        ++field3509;
        if (arg0) {
            this.method1587(false, false);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Leu;Z)Lvr;", line = 418)
    public final class147 method477(class508 arg0, boolean arg1) {
        ++field3394;
        int[] var3 = new int[arg0.field7017 * arg0.field7014];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7019 != null) {
            for (int var6 = 0; var6 < arg0.field7014; ++var6) {
                for (int var7 = 0; ~arg0.field7017 < ~var7; ++var7) {
                    var3[var5++] = class213.method1409(arg0.field7019[var4] << 24, arg0.field7013[class440.method2643(arg0.field7018[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field7014; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field7017; ++var10) {
                    int var11 = arg0.field7013[arg0.field7018[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class213.method1409(-16777216, var11) : 0;
                }
            }
        }
        class147 var9 = this.method499(arg0.field7017, var3, true, 0, arg0.field7014, arg0.field7017);
        var9.method1112(arg0.field7020, arg0.field7016, arg0.field7015, arg0.field7021);
        return var9;
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "(B)V", line = 480)
    public final void method1588(byte arg0) {
        ++field3334;
        if (~this.field3562 != -9) {
            this.method1620(2);
            this.method1642(3723, true);
            this.method1587(false, true);
            this.method1583((byte) -68, true);
            this.method1648(0, 1);
            this.field3562 = 8;
        }
        int var2 = -68 % ((arg0 - 44) / 59);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 500)
    public final void method476(Canvas arg0) {
        ++field3446;
        if (this.field3495 == arg0) {
            throw new RuntimeException();
        } else if (this.field3479.containsKey(arg0)) {
            Long var2 = (Long) this.field3479.get(arg0);
            this.field3379.releaseSurface(arg0, var2);
            this.field3479.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "()I", line = 518)
    public final int method539() {
        ++field3484;
        return this.field3602;
    }

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "(II)V", line = 534)
    public final void method1589(int arg0, int arg1) {
        ++field3463;
        if (arg0 != -4) {
            this.field3510 = null;
        }
        if (arg1 == 1) {
            this.method1622(7681, 7681, (byte) 28);
        } else {
            if (arg1 != 0) {
                if (~arg1 == -3) {
                    this.method1622(7681, 34165, (byte) -99);
                    return;
                }
                if (~arg1 == -4) {
                    this.method1622(8448, 260, (byte) -114);
                    return;
                }
                if (~arg1 == -5) {
                    this.method1622(34023, 34023, (byte) -39);
                    return;
                }
            } else {
                this.method1622(8448, 8448, (byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "(B)V", line = 572)
    private final void method1590(byte arg0) {
        if (arg0 != 78) {
            this.method516(-84, -99, -60, 19);
        }
        ++field3420;
        OpenGL.glViewport(this.field3620, this.field3621, this.field3442, this.field3500);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZ)V", line = 584)
    public final void method1591(int arg0, boolean arg1) {
        class447.field6263[2] = (float) class440.method2643(255, arg0) / 255.0F;
        class447.field6263[1] = (float) class440.method2643(65280, arg0) / 65280.0F;
        class447.field6263[3] = (float) (arg0 >>> 24) / 255.0F;
        ++field3353;
        class447.field6263[0] = (float) class440.method2643(16711680, arg0) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class447.field6263, 0);
        if (arg1) {
            this.method1657((byte) -28, -33, -103, 54);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;", line = 603)
    public final class345 method566(class390 arg0, class656 arg1) {
        ++field3486;
        return null;
    }

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "(B)V", line = 611)
    private final void method1592(byte arg0) {
        if (this.field3666 != 3) {
            this.field3666 = 3;
            this.method1619(-62);
            this.method1628((byte) 117);
            this.field3562 &= -8;
        }
        ++field3320;
        int var2 = -54 / ((arg0 - -50) / 41);
    }

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "(B)V", line = 628)
    public final void method1593(byte arg0) {
        if (arg0 <= 125) {
            this.method525(120, -121, 43, -50, 6, -43, (class514) null, -118, -100, 33, 26, -33);
        }
        ++field3409;
        if (this.field3562 != 4) {
            this.method1634(false);
            this.method1642(3723, false);
            this.method1617(false, (byte) 109);
            this.method1587(false, false);
            this.method1583((byte) -68, false);
            this.method1640(-2, 59);
            this.method1648(0, 1);
            this.field3562 = 4;
        }
    }

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "()Z", line = 654)
    public final boolean method513() {
        ++field3369;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(I)I", line = 662)
    private final int method1594(int arg0) {
        ++field3480;
        int var2 = 0;
        this.field3606 = OpenGL.glGetString(7936).toLowerCase();
        this.field3625 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field3606.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field3606.indexOf("brian paul") != -1 || ~this.field3606.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class46.method355(var3.replace('.', ' '), 0, ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class334.method2123(1, var4[0]);
                int var6 = class334.method2123(1, var4[1]);
                this.field3630 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field3630 < 12) {
            var2 |= 2;
        }
        if (!this.field3379.method3636("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3379.method3636("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3605 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3622 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3598 = var7[0];
        if (this.field3605 < 2 || this.field3622 < 2 || this.field3598 < 2) {
            var2 |= 16;
        }
        this.field3588 = Stream.method3926();
        this.field3659 = this.field3379.arePbuffersAvailable();
        this.field3585 = this.field3379.method3636("GL_ARB_vertex_buffer_object");
        this.field3668 = this.field3379.method3636("GL_ARB_multisample");
        this.field3671 = this.field3379.method3636("GL_ARB_vertex_program");
        this.field3379.method3636("GL_ARB_fragment_program");
        this.field3599 = this.field3379.method3636("GL_ARB_vertex_shader");
        this.field3635 = this.field3379.method3636("GL_ARB_fragment_shader");
        this.field3589 = this.field3379.method3636("GL_EXT_texture3D");
        this.field3653 = this.field3379.method3636("GL_ARB_texture_rectangle");
        if (arg0 < 77) {
            this.method1646(116, -37, -62);
        }
        this.field3672 = this.field3379.method3636("GL_ARB_texture_cube_map");
        this.field3584 = this.field3379.method3636("GL_ARB_texture_float");
        this.field3609 = false;
        this.field3617 = this.field3379.method3636("GL_EXT_framebuffer_object");
        this.field3645 = this.field3379.method3636("GL_EXT_framebuffer_blit");
        this.field3648 = this.field3379.method3636("GL_EXT_framebuffer_multisample");
        this.field3573 = this.field3648 & this.field3645;
        this.field3576 = class483.field6674.startsWith("mac");
        OpenGL.glGetFloatv(2834, class447.field6263, 0);
        this.field3580 = class447.field6263[1];
        this.field3676 = class447.field6263[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!dia", name = "Q", descriptor = "(IIIIII[BII)V", line = 750)
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3434;
        float var10;
        float var11;
        if (this.field3663 != null && arg2 <= this.field3663.field2476 && ~arg3 >= ~this.field3663.field2465) {
            this.field3663.method1277(arg2, 0, false, 127, arg3, arg6, 6406, 0, 0, 0);
            var10 = (float) arg3 * this.field3663.field2708 / (float) this.field3663.field2465;
            var11 = (float) arg2 * this.field3663.field2710 / (float) this.field3663.field2476;
        } else {
            this.field3663 = class125.method1023(arg6, 6406, arg3, this, arg2, 6406, false, (byte) -123);
            this.field3663.method1274(false, false, 10242);
            var11 = this.field3663.field2710;
            var10 = this.field3663.field2708;
        }
        this.method1603(127);
        this.method1653((byte) 108, this.field3663);
        this.method1648(0, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1591(arg5, false);
        this.method1622(34165, 34165, (byte) 127);
        this.method1641(34166, 768, 0, 34192);
        this.method1641(5890, 770, 2, 34192);
        this.method1657((byte) 90, 770, 0, 34166);
        this.method1657((byte) 90, 770, 2, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method1641(5890, 768, 0, 34192);
        this.method1641(34166, 770, 2, 34192);
        this.method1657((byte) 90, 770, 0, 5890);
        this.method1657((byte) 90, 770, 2, 34166);
    }

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "()Z", line = 807)
    public final boolean method485() {
        ++field3444;
        return this.field3668 && (!this.method461() || this.field3573);
    }

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "(I)V", line = 815)
    private final void method1595(int arg0) {
        ++field3457;
        if (arg0 == 2910) {
            this.field3379.method3635();
        }
    }

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "()Z", line = 832)
    public final boolean method542() {
        ++field3520;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[BZI)Lfha;", line = 842)
    public final class401 method1596(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg0 != 0) {
            this.method508(-85, -72, false);
        }
        ++field3363;
        return (class401) (!this.field3585 || arg3 && !this.field3664 ? new class478(this, arg4, arg2, arg1) : new class636(this, arg4, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IZIZ[B)Lm;", line = 860)
    public final class204 method1597(int arg0, boolean arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg3) {
            this.method1600((class430) null, (class430) null, (class430) null, (byte) 59, (class430) null);
        }
        ++field3433;
        return (class204) (!this.field3585 || arg1 && !this.field3664 ? new class757(this, arg2, arg4, arg0) : new class473(this, arg2, arg4, arg0, arg1));
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(II)I", line = 878)
    public final int method517(int arg0, int arg1) {
        ++field3470;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "(B)V", line = 886)
    private final void method1598(byte arg0) {
        this.field3616 = (float) (-this.field3654 + this.field3628);
        if (arg0 > -28) {
            this.field3581 = -0.12362388F;
        }
        this.field3634 = (float) (-this.field3675 + this.field3624);
        this.field3597 = (float) (-this.field3675 + this.field3608);
        ++field3349;
        this.field3581 = (float) (this.field3661 - this.field3654);
    }

    @OriginalMember(owner = "client!dia", name = "K", descriptor = "([I)V", line = 900)
    public final void method494(int[] arg0) {
        arg0[1] = this.field3628;
        arg0[2] = this.field3608;
        arg0[0] = this.field3624;
        ++field3452;
        arg0[3] = this.field3661;
    }

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "(I)V", line = 913)
    public final void method1599(int arg0) {
        OpenGL.glPopMatrix();
        ++field3384;
        int var2 = 18 / ((72 - arg0) / 53);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ldn;)V", line = 928)
    public final void method473(class544 arg0) {
        ++field3326;
        this.field3641 = (class293) arg0;
    }

    @OriginalMember(owner = "client!dia", name = "GA", descriptor = "(I)V", line = 938)
    public final void method458(int arg0) {
        this.method1648(0, 0);
        ++field3483;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lwe;Lwe;Lwe;BLwe;)V", line = 952)
    public final void method1600(class430 arg0, class430 arg1, class430 arg2, byte arg3, class430 arg4) {
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1651(-105, arg2.field6116);
            OpenGL.glVertexPointer(arg2.field6114, arg2.field6117, this.field3591.method2502((byte) 114), this.field3591.method2503(1932) + (long) arg2.field6113);
            OpenGL.glEnableClientState(32884);
        }
        ++field3340;
        if (arg0 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method1651(-118, arg0.field6116);
            OpenGL.glNormalPointer(arg0.field6117, this.field3591.method2502((byte) 92), this.field3591.method2503(1932) - -((long) arg0.field6113));
            OpenGL.glEnableClientState(32885);
        }
        if (arg1 != null) {
            this.method1651(-108, arg1.field6116);
            OpenGL.glColorPointer(arg1.field6114, arg1.field6117, this.field3591.method2502((byte) 126), this.field3591.method2503(1932) + (long) arg1.field6113);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg4 != null) {
            this.method1651(-127, arg4.field6116);
            OpenGL.glTexCoordPointer(arg4.field6114, arg4.field6117, this.field3591.method2502((byte) 93), this.field3591.method2503(1932) - -((long) arg4.field6113));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
        if (arg3 < 27) {
            this.field3531 = false;
        }
    }

    @OriginalMember(owner = "client!dia", name = "EA", descriptor = "(IIII)V", line = 1005)
    public final void method557(int arg0, int arg1, int arg2, int arg3) {
        ++field3478;
        if (!this.field3583) {
            throw new RuntimeException("");
        } else {
            this.field3656 = arg3;
            this.field3670 = arg2;
            this.field3662 = arg1;
            this.field3632 = arg0;
            if (this.field3613) {
                this.field3517.field7318.method1407(928);
                this.field3517.field7318.method1406((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIB)V", line = 1030)
    public final synchronized void method1601(int arg0, int arg1, byte arg2) {
        ++field3507;
        class119 var4 = new class119(arg0);
        var4.field1409 = (long) arg1;
        int var5 = 79 / ((50 - arg2) / 41);
        this.field3553.method2545(-126, var4);
    }

    @OriginalMember(owner = "client!dia", name = "ya", descriptor = "()V", line = 1046)
    public final void method483() {
        ++field3462;
        this.method1583((byte) -68, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "()Z", line = 1057)
    public final boolean method478() {
        ++field3396;
        return this.field3510 != null && (~this.field3512 >= -2 || this.field3573);
    }

    @OriginalMember(owner = "client!dia", name = "DA", descriptor = "(IIII)V", line = 1065)
    public final void method540(int arg0, int arg1, int arg2, int arg3) {
        this.field3675 = arg0;
        this.field3582 = arg2;
        ++field3432;
        this.field3638 = arg3;
        this.field3654 = arg1;
        this.method1647(29021);
        this.method1598((byte) -103);
        if (~this.field3666 != -4) {
            if (~this.field3666 == -3) {
                this.method1649((byte) -30);
                return;
            }
        } else {
            this.method1619(127);
        }
    }

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "(B)V", line = 1095)
    public final void method1602(byte arg0) {
        ++field3518;
        OpenGL.glLightfv(16384, 4611, this.field3611, 0);
        OpenGL.glLightfv(16385, 4611, this.field3619, 0);
        if (arg0 < 124) {
            this.field3620 = 18;
        }
    }

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "(I)V", line = 1107)
    public final void method1603(int arg0) {
        if (arg0 < 35) {
            this.method466(88, 41);
        }
        if (this.field3562 != 2) {
            this.method1634(false);
            this.method1642(3723, false);
            this.method1617(false, (byte) 39);
            this.method1587(false, false);
            this.method1583((byte) -68, false);
            this.method1640(-2, -110);
            this.field3562 = 2;
        }
        ++field3471;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(FIF)V", line = 1130)
    public final void method1604(float arg0, int arg1, float arg2) {
        this.field3677 = arg0;
        if (arg1 != 32884) {
            this.method511();
        }
        ++field3370;
        this.field3629 = arg2;
        this.method1626(arg1 ^ 32907);
    }

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "(I)V", line = 1143)
    private final void method1605(int arg0) {
        if (arg0 == 2896) {
            ++field3436;
            if (this.field3577 && !this.field3574) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)Lza;", line = 1158)
    public final class437 method482(int arg0) {
        ++field3526;
        class82 var2 = new class82(arg0);
        this.field3535.method2545(-127, var2);
        return var2;
    }

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "(I)V", line = 1169)
    private final void method1606(int arg0) {
        class447.field6263[3] = 1.0F;
        class447.field6263[2] = this.field3657 * this.field3570;
        if (arg0 == -1) {
            class447.field6263[1] = this.field3657 * this.field3643;
            ++field3425;
            class447.field6263[0] = this.field3657 * this.field3626;
            OpenGL.glLightModelfv(2899, class447.field6263, 0);
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIB)V", line = 1184)
    public final void method1607(int arg0, int arg1, byte arg2) {
        if (arg2 == 103) {
            ++field3389;
            this.field3621 = arg1;
            this.field3620 = arg0;
            this.method1590((byte) 78);
            this.method1581(false);
        }
    }

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "(II)I", line = 1199)
    public final int method1608(int arg0, int arg1) {
        ++field3373;
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                return 8448;
            } else if (arg0 != 2) {
                if (arg0 != 3) {
                    if (arg0 == 4) {
                        return 34023;
                    } else {
                        int var3 = 35 / ((-87 - arg1) / 35);
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "()Luu;", line = 1230)
    public final class303 method450() {
        ++field3411;
        return this.field3527;
    }

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "(I)V", line = 1238)
    private final void method1609(int arg0) {
        ++field3437;
        if (~this.field3562 != -2) {
            this.method1634(false);
            this.method1642(3723, false);
            this.method1617(false, (byte) -88);
            this.method1587(false, false);
            this.method1583((byte) -68, false);
            this.method1653((byte) 77, (class7) null);
            this.method1640(-2, -106);
            this.method1589(-4, 1);
            this.field3562 = 1;
        }
        if (arg0 != 0) {
            this.method489(-7, 84, 38, -72, 39, 114, (byte[]) null, -127, -117);
        }
    }

    @OriginalMember(owner = "client!dia", name = "HA", descriptor = "(IIII[I)V", line = 1262)
    public final void method527(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3352;
        float var6 = (float) arg2 * this.field3563.field1708 + (float) arg0 * this.field3563.field1690 + (float) arg1 * this.field3563.field1715 + this.field3563.field1709;
        if (!(var6 < (float) this.field3602) && !((float) this.field3633 < var6)) {
            int var7 = (int) (((float) arg2 * this.field3563.field1710 + (float) arg0 * this.field3563.field1697 + (float) arg1 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field3563.field1717 + (float) arg0 * this.field3563.field1695 + (float) arg1 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / (float) arg3);
            if (this.field3634 <= (float) var7 && this.field3597 >= (float) var7 && (float) var8 >= this.field3616 && (float) var8 <= this.field3581) {
                arg4[0] = (int) ((float) var7 + -this.field3634);
                arg4[1] = (int) ((float) var8 - this.field3616);
                arg4[2] = (int) var6;
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IB)V", line = 1293)
    public final synchronized void method1610(int arg0, byte arg1) {
        ++field3346;
        class119 var3 = new class119(arg0);
        this.field3552.method2545(-128, var3);
        if (arg1 != 11) {
            this.field3662 = 8;
        }
    }

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "(B)V", line = 1306)
    public final void method1611(byte arg0) {
        OpenGL.glPushMatrix();
        if (arg0 >= -102) {
            this.field3607 = null;
        }
        ++field3337;
    }

    @OriginalMember(owner = "client!dia", name = "P", descriptor = "(IIIII)V", line = 1317)
    public final void method520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1609(0);
        ++field3342;
        this.method1648(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "()V", line = 1337)
    public final void method568() {
        ++field3403;
        this.field3511.method437(0);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFFIF)V", line = 1347)
    public final void method1612(float arg0, float arg1, float arg2, int arg3, float arg4) {
        ++field3365;
        class447.field6263[1] = arg4;
        class447.field6263[0] = arg0;
        class447.field6263[2] = arg1;
        if (arg3 <= 113) {
            this.method1641(-68, -105, 56, -59);
        }
        class447.field6263[3] = arg2;
        OpenGL.glTexEnvfv(8960, 8705, class447.field6263, 0);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IF)V", line = 1362)
    public final void method1613(int arg0, float arg1) {
        if (this.field3649 != arg1) {
            this.field3649 = arg1;
            if (~this.field3666 == -4) {
                this.method1619(127);
            }
        }
        ++field3402;
        if (arg0 != 20980) {
            this.field3574 = true;
        }
    }

    @OriginalMember(owner = "client!dia", name = "ra", descriptor = "(IIII)V", line = 1382)
    public final void method552(int arg0, int arg1, int arg2, int arg3) {
        this.field3662 = arg1;
        ++field3335;
        this.field3632 = arg0;
        this.field3583 = true;
        this.field3656 = arg3;
        this.field3670 = arg2;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)V", line = 1400)
    public final void method504(int arg0, int arg1) throws class566 {
        ++field3503;
        try {
            this.field3379.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZII)V", line = 1420)
    public final void method1614(boolean arg0, int arg1, int arg2) {
        this.method1580(true, -32055, arg0, arg1);
        ++field3506;
        if (arg2 != 1) {
            this.field3579 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "(IIIIIII)I", line = 1432)
    public final int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3382;
        float var8 = (float) arg2 * this.field3563.field1708 + (float) arg0 * this.field3563.field1690 + (float) arg1 * this.field3563.field1715 + this.field3563.field1709;
        float var9 = (float) arg5 * this.field3563.field1708 + (float) arg3 * this.field3563.field1690 + (float) arg4 * this.field3563.field1715 + this.field3563.field1709;
        int var10 = 0;
        if ((float) this.field3602 > var8 && var9 < (float) this.field3602) {
            var10 |= 16;
        } else if (var8 > (float) this.field3633 && (float) this.field3633 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3563.field1710 + (float) arg0 * this.field3563.field1697 + (float) arg1 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3563.field1710 + (float) arg3 * this.field3563.field1697 + (float) arg4 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / (float) arg6);
        if (this.field3634 > (float) var11 && this.field3634 > (float) var12) {
            var10 |= 1;
        } else if (this.field3597 < (float) var11 && (float) var12 > this.field3597) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3563.field1717 + (float) arg0 * this.field3563.field1695 + (float) arg1 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3563.field1717 + (float) arg3 * this.field3563.field1695 + (float) arg4 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / (float) arg6);
        if (this.field3616 > (float) var13 && (float) var14 < this.field3616) {
            var10 |= 4;
        } else if ((float) var13 > this.field3581 && (float) var14 > this.field3581) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "(I)V", line = 1479)
    private final void method1615(int arg0) {
        this.field3650 = new class7[this.field3605];
        ++field3339;
        this.field3637 = new class184(this, 3553, 6408, arg0, 1);
        new class184(this, 3553, 6408, 1, 1);
        new class184(this, 3553, 6408, 1, 1);
        this.field3610 = new class342(this);
        this.field3607 = new class342(this);
        this.field3667 = new class342(this);
        this.field3640 = new class342(this);
        this.field3601 = new class342(this);
        this.field3669 = new class342(this);
        this.field3655 = new class342(this);
        this.field3644 = new class342(this);
        this.field3592 = new class342(this);
        this.field3594 = new class342(this);
        if (this.field3617) {
            this.field3627 = new class682(this);
            new class682(this);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lhga;I)V", line = 1516)
    public final void method1616(class185 arg0, int arg1) {
        ++field3388;
        if (this.field3542 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field3542 <= arg1) {
                this.field3540[this.field3542].method1282(-4055);
            }
            this.field3545 = this.field3540[++this.field3542] = arg0;
            this.field3545.method1284((byte) 89);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lgfa;IIII)Lka;", line = 1531)
    public final class500 method510(class782 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3376;
        return new class342(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIIID)V", line = 1541)
    public final void method447(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field3469;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZB)V", line = 1550)
    public final void method1617(boolean arg0, byte arg1) {
        ++field3521;
        if (!this.field3577 != !arg0) {
            this.field3577 = arg0;
            this.method1605(2896);
            this.field3562 &= -8;
        }
        int var3 = 70 / ((arg1 - -13) / 51);
    }

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "(I)Lefa;", line = 1569)
    public final class196 method1618(int arg0) {
        ++field3429;
        if (arg0 != 1) {
            this.method1657((byte) 53, 29, -101, -46);
        }
        return this.field3641 != null ? this.field3641.method1852(arg0 ^ 16825) : null;
    }

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "(I)V", line = 1581)
    private final void method1619(int arg0) {
        int var2 = 126 / ((arg0 - 76) / 48);
        ++field3460;
        float var3 = (float) (-this.field3675) * this.field3649 / (float) this.field3582;
        float var4 = (float) (-this.field3654) * this.field3649 / (float) this.field3638;
        float var5 = (float) (-this.field3675 + this.field3442) * this.field3649 / (float) this.field3582;
        float var6 = (float) (-this.field3654 + this.field3500) * this.field3649 / (float) this.field3638;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var3 != var5 && var4 != var6) {
            OpenGL.glOrtho((double) var3, (double) var5, (double) (-var6), (double) (-var4), (double) this.field3602, (double) this.field3633);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V", line = 1604)
    public final void method459(int arg0) {
        ++field3435;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIIIII)V", line = 1611)
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3330;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1609(0);
        this.method1648(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3668) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3668) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "(I)V", line = 1646)
    private final void method1620(int arg0) {
        if (this.field3666 != arg0) {
            this.field3666 = 2;
            this.method1649((byte) -111);
            this.method1628((byte) 122);
            this.field3562 &= -8;
        }
        ++field3390;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lhga;Z)V", line = 1662)
    public final void method1621(class185 arg0, boolean arg1) {
        if (arg1) {
            this.method1635(-0.6727019F, 0.5287709F, -1.4773127F, 15);
        }
        ++field3459;
        if (!this.field3645) {
            if (~this.field3536 <= -1 && this.field3541[this.field3536] == arg0) {
                this.field3541[this.field3536--] = null;
                arg0.method1283(15427);
                if (this.field3536 >= 0) {
                    this.field3545 = this.field3539 = this.field3541[this.field3536];
                    this.field3545.method1286((byte) -122);
                } else {
                    this.field3545 = this.field3539 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method1654(2, arg0);
            this.method1655(arg0, true);
        }
    }

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "()Lcja;", line = 1697)
    public final class45 method558() {
        ++field3458;
        int var1 = -1;
        if (~this.field3606.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field3606.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (~this.field3606.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class45(var1, "OpenGL", this.field3630, this.field3625, 0L);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Luu;)V", line = 1719)
    public final void method526(class303 arg0) {
        this.field3563.method986(arg0);
        ++field3485;
        this.field3565.method986(this.field3563);
        this.field3565.method980(126);
        this.field3566.method966((byte) -121, this.field3565);
        if (~this.field3666 != -2) {
            this.method1628((byte) 118);
        }
    }

    @OriginalMember(owner = "client!dia", name = "M", descriptor = "()I", line = 1735)
    public final int method453() {
        ++field3377;
        int var1 = this.field3678;
        this.field3678 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIB)V", line = 1749)
    public final void method1622(int arg0, int arg1, byte arg2) {
        if (this.field3595 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        } else {
            boolean var4 = false;
            if (this.field3636 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field3636 = arg1;
                var4 = true;
            }
            if (~this.field3569 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field3569 = arg0;
            }
            if (var4) {
                this.field3562 &= -30;
            }
        }
        ++field3395;
        int var5 = -4 % ((arg2 - 76) / 48);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(JZ)V", line = 1796)
    public final synchronized void method1623(long arg0, boolean arg1) {
        if (!arg1) {
            ++field3381;
            class101 var4 = new class101();
            var4.field1409 = arg0;
            this.field3555.method2545(-128, var4);
        }
    }

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "(I)V", line = 1810)
    private final void method1624(int arg0) {
        class447.field6263[1] = this.field3651 * this.field3643;
        class447.field6263[0] = this.field3651 * this.field3626;
        class447.field6263[2] = this.field3651 * this.field3570;
        if (arg0 == 20) {
            ++field3505;
            class447.field6263[3] = 1.0F;
            OpenGL.glLightfv(16384, 4609, class447.field6263, 0);
            class447.field6263[1] = -this.field3586 * this.field3643;
            class447.field6263[0] = -this.field3586 * this.field3626;
            class447.field6263[2] = -this.field3586 * this.field3570;
            class447.field6263[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, class447.field6263, 0);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[I[I)Laa;", line = 1832)
    public final class514 method523(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3380;
        return class42.method288(this, arg1, arg2, arg0, arg3, 0);
    }

    @OriginalMember(owner = "client!dia", name = "X", descriptor = "(I)V", line = 1840)
    public final void method481(int arg0) {
        ++field3344;
        this.field3529 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field3529;
        }
        this.field3534 = 1 << this.field3529;
    }

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "()Z", line = 1856)
    public final boolean method534() {
        ++field3386;
        return this.field3517.method3076((byte) 72, 3);
    }

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "(I)V", line = 1864)
    private final void method1625(int arg0) {
        ++field3467;
        this.field3575[14] = this.field3603;
        this.field3575[10] = this.field3665;
        this.field3646 = (this.field3575[14] - (float) this.field3633) / this.field3575[10];
        if (arg0 != 22545) {
            this.method453();
        }
        this.field3673 = (float) this.field3633;
    }

    @OriginalMember(owner = "client!dia", name = "KA", descriptor = "(IIII)V", line = 1883)
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field3442) {
            arg2 = this.field3442;
        }
        ++field3398;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg3 < ~this.field3500) {
            arg3 = this.field3500;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field3608 = arg2;
        this.field3624 = arg0;
        this.field3661 = arg3;
        this.field3628 = arg1;
        OpenGL.glEnable(3089);
        this.method1598((byte) -73);
        this.method1581(false);
    }

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "(I)V", line = 1912)
    private final void method1626(int arg0) {
        this.field3618 = (float) (this.field3633 - this.field3614) + -this.field3677;
        ++field3449;
        this.field3660 = this.field3618 - (float) this.field3578 * this.field3629;
        if (this.field3660 < (float) this.field3602) {
            this.field3660 = (float) this.field3602;
        }
        OpenGL.glFogf(2915, this.field3660);
        OpenGL.glFogf(2916, this.field3618);
        class447.field6263[2] = (float) class440.method2643(this.field3593, arg0) / 255.0F;
        class447.field6263[0] = (float) class440.method2643(this.field3593, 16711680) / 1.671168E7F;
        class447.field6263[1] = (float) class440.method2643(65280, this.field3593) / 65280.0F;
        OpenGL.glFogfv(2918, class447.field6263, 0);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIII)V", line = 1931)
    public final void method1627(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 7) {
            ++field3461;
            OpenGL.glDrawArrays(arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "(B)V", line = 1944)
    private final void method1628(byte arg0) {
        ++field3354;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field3565.method983(false), 0);
        if (this.field3613) {
            this.field3517.field7318.method1407(928);
        }
        this.method1602((byte) 127);
        if (arg0 >= 115) {
            this.method1644(82);
        }
    }

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "(B)V", line = 1961)
    public final void method1629(byte arg0) {
        ++field3393;
        if (~this.field3666 != -1) {
            this.field3666 = 0;
            this.field3562 &= -32;
        }
        if (arg0 > -22) {
            this.field3530 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "la", descriptor = "()V", line = 1980)
    public final void method543() {
        this.field3661 = this.field3500;
        this.field3624 = 0;
        this.field3608 = this.field3442;
        ++field3487;
        this.field3628 = 0;
        OpenGL.glDisable(3089);
        this.method1598((byte) -71);
    }

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "(B)V", line = 1997)
    private final void method1630(byte arg0) {
        if (arg0 == 59) {
            if (this.field3387 != null) {
                Dimension var2 = this.field3387.getSize();
                this.field3383 = var2.height;
                this.field3318 = var2.width;
            } else {
                this.field3318 = this.field3383 = 0;
            }
            ++field3492;
            if (this.field3539 == null) {
                this.field3500 = this.field3383;
                this.field3442 = this.field3318;
                this.method1590((byte) 78);
            }
            this.method1629((byte) -122);
            this.method543();
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 2029)
    public final void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566 {
        ++field3399;
        this.method504(arg2, arg3);
    }

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "()Z", line = 2039)
    public final boolean method484() {
        ++field3391;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "pa", descriptor = "()V", line = 2047)
    public final void method555() {
        this.field3583 = false;
        ++field3493;
    }

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "(I)V", line = 2057)
    private final void method1631(int arg0) {
        ++field3455;
        if (this.field3571 && ~this.field3578 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != -17489) {
            this.method1633((byte) -113);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIZ)Lvr;", line = 2072)
    public final class147 method508(int arg0, int arg1, boolean arg2) {
        ++field3371;
        return new class463(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(ZZ)V", line = 2080)
    public final void method1632(boolean arg0, boolean arg1) {
        if (!arg0 != !this.field3574) {
            this.field3574 = arg0;
            this.method1605(2896);
        }
        if (arg1) {
            this.field3622 = 102;
        }
        ++field3508;
    }

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "(B)V", line = 2097)
    private final void method1633(byte arg0) {
        if (arg0 != -20) {
            this.method1609(20);
        }
        ++field3358;
        int var2 = 0;
        while (!this.field3379.method3637()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class438.method2636(true, 1000L);
        }
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "(Z)V", line = 2121)
    private final void method1634(boolean arg0) {
        ++field3362;
        if (arg0) {
            this.method1611((byte) -118);
        }
        if (this.field3666 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3442 < -1 && ~this.field3500 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3442, (double) this.field3500, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3562 &= -25;
            this.field3666 = 1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "za", descriptor = "(IIIII)V", line = 2147)
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field3453;
        if (arg0 + arg2 >= this.field3624 && -arg2 + arg0 <= this.field3608 && ~(arg1 + arg2) <= ~this.field3628 && ~(-arg2 + arg1) >= ~this.field3661) {
            this.method1609(0);
            this.method1648(0, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field3676 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field3580 >= (float) var8) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class37.method261(var9, false);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class744.field10275[var11] * (float) arg2 + var6, class744.field10272[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "C", descriptor = "(Z)V", line = 2222)
    public final void method474(boolean arg0) {
        this.field3590 = arg0;
        ++field3343;
        this.method1639(34846);
    }

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "(ILaa;II)V", line = 2236)
    public final void method518(int arg0, class514 arg1, int arg2, int arg3) {
        ++field3499;
        class148 var5 = (class148) arg1;
        class207 var6 = var5.field2076;
        this.method1603(118);
        this.method1653((byte) 96, var5.field2076);
        this.method1648(0, 1);
        this.method1622(8448, 7681, (byte) 125);
        this.method1641(34167, 768, 0, 34192);
        float var7 = var6.field2710 / (float) var6.field2712;
        float var8 = var6.field2708 / (float) var6.field2704;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3624) * var7, (float) (-arg3 + this.field3628) * var8);
        OpenGL.glVertex2i(this.field3624, this.field3628);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3624) * var7, (float) (-arg3 + this.field3661) * var8);
        OpenGL.glVertex2i(this.field3624, this.field3661);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3608) * var7, (float) (-arg3 + this.field3661) * var8);
        OpenGL.glVertex2i(this.field3608, this.field3661);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3608) * var7, (float) (-arg3 + this.field3628) * var8);
        OpenGL.glVertex2i(this.field3608, this.field3628);
        OpenGL.glEnd();
        this.method1641(5890, 768, 0, 34192);
    }

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "()V", line = 2270)
    public final void method503() {
        ++field3372;
        if (this.field3510 != null && this.field3510.method2516(917)) {
            this.field3511.method444(this.field3510, (byte) -19);
            this.field3519.method380((byte) -52);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFFI)V", line = 2286)
    private final void method1635(float arg0, float arg1, float arg2, int arg3) {
        ++field3466;
        OpenGL.glMatrixMode(5890);
        if (this.field3658) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        if (arg3 == -16777216) {
            OpenGL.glMatrixMode(5888);
            this.field3658 = true;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLhga;)V", line = 2307)
    public final void method1636(byte arg0, class185 arg1) {
        ++field3465;
        if (arg0 >= 124) {
            if (~this.field3544 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field3544 >= 0) {
                    this.field3543[this.field3544].method1285(-16250);
                }
                this.field3539 = this.field3543[++this.field3544] = arg1;
                this.field3539.method1287(-114);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "U", descriptor = "(IIIII)V", line = 2325)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3351;
        this.method1609(0);
        this.method1648(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I[Luca;)V", line = 2348)
    public final void method486(int arg0, class540[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3600[var3] = arg1[var3];
        }
        ++field3328;
        this.field3615 = arg0;
        if (~this.field3666 != -2) {
            this.method1644(109);
        }
    }

    @OriginalMember(owner = "client!dia", name = "L", descriptor = "(III)V", line = 2369)
    public final void method550(int arg0, int arg1, int arg2) {
        if (this.field3593 != arg0 || this.field3578 != arg1 || ~this.field3614 != ~arg2) {
            this.field3593 = arg0;
            this.field3578 = arg1;
            this.field3614 = arg2;
            this.method1626(255);
            this.method1631(-17489);
        }
        ++field3418;
    }

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "(II)V", line = 2388)
    public final void method1637(int arg0, int arg1) {
        if (this.field3595 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field3595 = arg1;
        }
        if (arg0 != 33984) {
            this.field3678 = -117;
        }
        ++field3456;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(BLhga;)V", line = 2406)
    public final void method1638(byte arg0, class185 arg1) {
        ++field3428;
        if (arg0 <= -3) {
            if (!this.field3645) {
                if (this.field3536 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (this.field3536 >= 0) {
                        this.field3541[this.field3536].method1283(15427);
                    }
                    this.field3545 = this.field3539 = this.field3541[++this.field3536] = arg1;
                    this.field3545.method1286((byte) -100);
                }
            } else {
                this.method1616(arg1, -1);
                this.method1636((byte) 125, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "(I)V", line = 2435)
    private final void method1639(int arg0) {
        ++field3325;
        if (arg0 != 34846) {
            this.field3540 = null;
        }
        OpenGL.glDepthMask(this.field3557 && this.field3590);
    }

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "()V", line = 2448)
    public final void method500() {
        ++field3414;
        if (this.field3567 && ~this.field3442 < -1 && this.field3500 > 0) {
            int var1 = this.field3624;
            int var2 = this.field3608;
            int var3 = this.field3628;
            int var4 = this.field3661;
            this.method543();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1629((byte) -85);
            this.method1642(3723, false);
            this.method1617(false, (byte) -99);
            this.method1587(false, false);
            this.method1583((byte) -68, false);
            this.method1653((byte) 119, (class7) null);
            this.method1640(-2, 93);
            this.method1589(-4, 1);
            this.method1648(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3442, this.field3500, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method456(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "(II)V", line = 2492)
    public final void method1640(int arg0, int arg1) {
        this.method1614(true, arg0, 1);
        ++field3515;
        int var3 = 0 / ((-48 - arg1) / 58);
    }

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "()V", line = 2502)
    public final void method511() {
        ++field3472;
        if (!this.field3617) {
            if (!this.field3659) {
                throw new RuntimeException("");
            }
            this.field3538.method1082(0, 0, this.field3442, this.field3500, 0, 0);
            this.field3379.setSurface(this.field3438);
        } else {
            if (this.field3537 != this.field3539) {
                throw new RuntimeException();
            }
            this.field3537.method3792(0, -10604);
            this.field3537.method3792(8, -10604);
            this.method1621(this.field3537, false);
        }
        this.field3442 = this.field3318;
        this.field3538 = null;
        this.field3500 = this.field3383;
        this.method1629((byte) -57);
        this.method1590((byte) 78);
        this.method543();
    }

    @OriginalMember(owner = "client!dia", name = "ZA", descriptor = "(IFFFFF)V", line = 2536)
    public final void method533(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3491;
        boolean var7 = this.field3604 != arg0;
        if (var7 || this.field3651 != arg1 || this.field3586 != arg2) {
            this.field3651 = arg1;
            this.field3604 = arg0;
            this.field3586 = arg2;
            if (var7) {
                this.field3570 = (float) (255 & this.field3604) / 255.0F;
                this.field3643 = (float) (65280 & this.field3604) / 65280.0F;
                this.field3626 = (float) (this.field3604 & 16711680) / 1.671168E7F;
                this.method1606(-1);
            }
            this.method1624(20);
        }
        if (this.field3623[0] != arg3 || this.field3623[1] != arg4 || this.field3623[2] != arg5) {
            this.field3623[2] = arg5;
            this.field3623[0] = arg3;
            this.field3623[1] = arg4;
            this.field3631[1] = -arg4;
            this.field3631[0] = -arg3;
            this.field3631[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3611[0] = arg3 * var8;
            this.field3611[1] = arg4 * var8;
            this.field3611[2] = arg5 * var8;
            this.field3619[2] = -this.field3611[2];
            this.field3619[0] = -this.field3611[0];
            this.field3619[1] = -this.field3611[1];
            this.method1602((byte) 126);
            this.field3568 = (int) (arg3 * 256.0F / arg4);
            this.field3612 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lvv;)V", line = 2585)
    public final void method549(class345 arg0) {
        ++field3424;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIII)V", line = 2592)
    public final void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3454;
        this.method559(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(IIII)V", line = 2606)
    public final void method1641(int arg0, int arg1, int arg2, int arg3) {
        ++field3356;
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
        OpenGL.glTexEnvi(8960, arg2 + arg3, arg1);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IZ)V", line = 2617)
    public final void method1642(int arg0, boolean arg1) {
        if (!this.field3571 == arg1) {
            this.field3571 = arg1;
            this.method1631(-17489);
            this.field3562 &= -32;
        }
        ++field3345;
        if (arg0 != 3723) {
            this.field3644 = null;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([IIIIIZ)Lvr;", line = 2634)
    public final class147 method544(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3525;
        return new class463(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "(I)V", line = 2643)
    public final void method493(int arg0) {
        this.method1595(2910);
        ++field3477;
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "()Luu;", line = 2651)
    public final class303 method565() {
        ++field3445;
        return this.field3563;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lef;I)V", line = 2663)
    public final void method532(class515 arg0, int arg1) {
        this.field3516.method4118(64, arg0, arg1, this);
        ++field3443;
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "()V", line = 2671)
    public final void method465() {
        ++field3490;
        for (class101 var1 = this.field3535.method2551((byte) -108); var1 != null; var1 = this.field3535.method2542(-119)) {
            ((class82) var1).method686((byte) -125);
        }
        if (this.field3511 != null) {
            this.field3511.method435(-115);
        }
        if (this.field3379 != null) {
            this.method1595(2910);
            Enumeration var2 = this.field3479.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3479.get(var3);
                this.field3379.releaseSurface(var3, var4);
            }
            this.field3379.release();
            this.field3379 = null;
        }
        if (this.field3531) {
            class182.method1269(true, -11692, false);
            this.field3531 = false;
        }
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(IIIIII)V", line = 2716)
    public final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1609(0);
        ++field3426;
        this.method1648(0, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILra;)V", line = 2753)
    public final void method1643(int arg0, class118 arg1) {
        OpenGL.glPushMatrix();
        int var3 = -127 / ((-52 - arg0) / 35);
        ++field3415;
        OpenGL.glMultMatrixf(arg1.method983(false), 0);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "()I", line = 2764)
    public final int method451() {
        ++field3408;
        return 4;
    }

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "()Z", line = 2774)
    public final boolean method491() {
        ++field3361;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(FFF)V", line = 2785)
    public final void method512(float arg0, float arg1, float arg2) {
        class341.field4925 = arg2;
        class442.field6222 = arg1;
        class133.field1963 = arg0;
        ++field3423;
    }

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "(I)V", line = 2797)
    private final void method1644(int arg0) {
        ++field3431;
        if (arg0 > 43) {
            int var2;
            for (var2 = 0; ~var2 > ~this.field3615; ++var2) {
                class540 var3 = this.field3600[var2];
                int var4 = var2 + 16386;
                class490.field6805[0] = (float) var3.method3085(24859);
                class490.field6805[1] = (float) var3.method3082(-127);
                class490.field6805[2] = (float) var3.method3084((byte) -16);
                class490.field6805[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class490.field6805, 0);
                int var5 = var3.method3080((byte) -122);
                float var6 = var3.method3083((byte) -41) / 255.0F;
                class490.field6805[1] = (float) (class440.method2643(65453, var5) >> 8) * var6;
                class490.field6805[0] = (float) (class440.method2643(16723648, var5) >> 16) * var6;
                class490.field6805[2] = var6 * (float) class440.method2643(255, var5);
                OpenGL.glLightfv(var4, 4609, class490.field6805, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3081(7036) * var3.method3081(7036)));
                OpenGL.glEnable(var4);
            }
            while (this.field3652 > var2) {
                OpenGL.glDisable(16386 - -var2);
                ++var2;
            }
            this.field3652 = this.field3615;
        }
    }

    @OriginalMember(owner = "client!dia", name = "T", descriptor = "(IIII)V", line = 2842)
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 < ~this.field3628) {
            this.field3628 = arg1;
        }
        if (this.field3661 > arg3) {
            this.field3661 = arg3;
        }
        ++field3427;
        if (~this.field3608 < ~arg2) {
            this.field3608 = arg2;
        }
        if (this.field3624 < arg0) {
            this.field3624 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method1598((byte) -52);
        this.method1581(false);
    }

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "(II)I", line = 2867)
    public final int method1645(int arg0, int arg1) {
        ++field3482;
        if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && ~arg0 != -34845) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (~arg0 != -6409 && ~arg0 != -34848) {
                    if (~arg0 != -34844) {
                        if (~arg0 == -34843) {
                            return 8;
                        } else if (arg0 != 6402) {
                            if (arg0 == 6401) {
                                return 1;
                            } else if (arg1 != 6) {
                                return 122;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
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

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)V", line = 2911)
    public final synchronized void method1646(int arg0, int arg1, int arg2) {
        ++field3416;
        if (arg2 != -24937) {
            this.field3383 = 84;
        }
        class119 var4 = new class119(arg1);
        var4.field1409 = (long) arg0;
        this.field3550.method2545(-128, var4);
    }

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "()Luu;", line = 2925)
    public final class303 method472() {
        ++field3322;
        return new class118();
    }

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "(I)V", line = 2933)
    public final void method506(int arg0) {
        ++field3524;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field3514 = arg0;
            this.field3519.method380((byte) -101);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(IIIIII)Ldn;", line = 2945)
    public final class544 method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3504;
        return this.field3672 ? new class436(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2953)
    public final class296 method547(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3468;
        return new class156(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "(I)V", line = 2961)
    private final void method1647(int arg0) {
        ++field3323;
        float[] var2 = this.field3575;
        float var3 = (float) (-this.field3675 * this.field3602) / (float) this.field3582;
        if (arg0 != 29021) {
            this.method1606(-73);
        }
        float var4 = (float) ((this.field3442 - this.field3675) * this.field3602) / (float) this.field3582;
        float var5 = (float) (this.field3654 * this.field3602) / (float) this.field3638;
        float var6 = (float) ((-this.field3500 + this.field3654) * this.field3602) / (float) this.field3638;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field3602 * 2.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[14] = this.field3603 = -((float) this.field3633 * var7) / (float) (-this.field3602 + this.field3633);
            var2[0] = var7 / (-var3 + var4);
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[10] = this.field3665 = (float) (-(this.field3633 + this.field3602)) / (float) (this.field3633 - this.field3602);
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
        } else {
            var2[0] = 1.0F;
            var2[13] = 0.0F;
            var2[5] = 1.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[15] = 1.0F;
            var2[3] = 0.0F;
            var2[6] = 0.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[10] = 1.0F;
            var2[7] = 0.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
        }
        this.method1625(22545);
    }

    @OriginalMember(owner = "client!dia", name = "l", descriptor = "(II)V", line = 3023)
    public final void method1648(int arg0, int arg1) {
        if (~this.field3560 != ~arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg1 == 1) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (~arg1 != -3) {
                if (~arg1 == -129) {
                    var3 = 3;
                    var4 = true;
                    var5 = true;
                } else {
                    var5 = false;
                    var3 = 0;
                    var4 = true;
                }
            } else {
                var3 = 2;
                var5 = false;
                var4 = true;
            }
            if (this.field3559 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field3559 = var4;
            }
            if (!this.field3558 != !var5) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field3558 = var5;
            }
            if (this.field3564 != var3) {
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
                this.field3564 = var3;
            }
            this.field3562 &= -29;
            this.field3560 = arg1;
        }
        if (arg0 != 0) {
            this.field3610 = null;
        }
        ++field3522;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)V", line = 3116)
    public final void method531(boolean arg0) {
        ++field3419;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIF)Luca;", line = 3123)
    public final class540 method530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3329;
        return new class213(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I", line = 3137)
    public final int method498(int arg0, int arg1) {
        ++field3413;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "(B)V", line = 3146)
    private final void method1649(byte arg0) {
        ++field3450;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field3575, 0);
        if (arg0 > -25) {
            this.method532((class515) null, 82);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "(B)V", line = 3160)
    public final void method1650(byte arg0) {
        int var2 = 29 % ((arg0 - -73) / 46);
        ++field3400;
        if (~this.field3562 != -17) {
            this.method1592((byte) 99);
            this.method1642(3723, true);
            this.method1587(false, true);
            this.method1583((byte) -68, true);
            this.method1648(0, 1);
            this.field3562 = 16;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILfha;)V", line = 3182)
    public final void method1651(int arg0, class401 arg1) {
        if (this.field3591 != arg1) {
            if (this.field3585) {
                OpenGL.glBindBufferARB(34962, arg1.method2504(4180));
            }
            this.field3591 = arg1;
        }
        ++field3327;
        if (arg0 > -74) {
            this.method1634(false);
        }
    }

    @OriginalMember(owner = "client!dia", name = "JA", descriptor = "(IIIIII)I", line = 3202)
    public final int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3366;
        int var7 = 0;
        float var8 = (float) arg2 * this.field3563.field1708 + (float) arg0 * this.field3563.field1690 + (float) arg1 * this.field3563.field1715 + this.field3563.field1709;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3563.field1708 + (float) arg3 * this.field3563.field1690 + (float) arg4 * this.field3563.field1715 + this.field3563.field1709;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field3602 && (float) this.field3602 > var9) {
            var7 |= 16;
        } else if ((float) this.field3633 < var8 && (float) this.field3633 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3563.field1710 + (float) arg0 * this.field3563.field1697 + (float) arg1 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / var8);
        int var11 = (int) (((float) arg5 * this.field3563.field1710 + (float) arg3 * this.field3563.field1697 + (float) arg4 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / var9);
        if ((float) var10 < this.field3634 && this.field3634 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field3597 && (float) var11 > this.field3597) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3563.field1717 + (float) arg0 * this.field3563.field1695 + (float) arg1 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / var8);
        int var13 = (int) (((float) arg5 * this.field3563.field1717 + (float) arg3 * this.field3563.field1695 + (float) arg4 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / var9);
        if ((float) var12 < this.field3616 && (float) var13 < this.field3616) {
            var7 |= 4;
        } else if ((float) var12 > this.field3581 && (float) var13 > this.field3581) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3254)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3406;
        if (arg0 != arg2 || arg1 != arg3) {
            class148 var13 = (class148) arg6;
            class207 var14 = var13.field2076;
            this.method1603(93);
            this.method1653((byte) 121, var13.field2076);
            this.method1648(0, arg5);
            this.method1622(8448, 7681, (byte) 125);
            this.method1641(34167, 768, 0, 34192);
            float var15 = var14.field2710 / (float) var14.field2712;
            float var16 = var14.field2708 / (float) var14.field2704;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var20 = var17 * var19;
            int var21 = arg11 % (arg9 + arg10);
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (arg9 >= var21) {
                var27 = (float) (arg9 - var21) * var20;
                var28 = (float) (-var21 + arg9) * var22;
            } else {
                var26 = (float) (arg10 - var21 + arg9) * var22;
                var25 = (float) (-var21 + arg9 + arg10) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (arg0 < arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg1 >= arg3) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                var30 += var28 + var32;
                OpenGL.glEnd();
                var27 = var23;
                var28 = var24;
            }
            this.method1641(5890, 768, 0, 34192);
        }
    }

    @OriginalMember(owner = "client!dia", name = "xa", descriptor = "(F)V", line = 3379)
    public final void method452(float arg0) {
        ++field3360;
        if (this.field3657 != arg0) {
            this.field3657 = arg0;
            this.method1606(-1);
        }
    }

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "()Z", line = 3396)
    public final boolean method501() {
        ++field3451;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIIIII)V", line = 3405)
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3404;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            this.method1609(0);
            this.method1648(0, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            float var14 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (var15 > arg6) {
                var19 = (float) (arg6 + arg7 - var15) * var13;
                var18 = (float) (arg6 + arg7 + -var15) * var14;
            } else {
                var21 = (float) (-var15 + arg6) * var13;
                var20 = (float) (arg6 - var15) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (arg2 <= arg0) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg1 > ~arg3) {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                OpenGL.glEnd();
                var23 += var21 + var25;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "I", descriptor = "()I", line = 3516)
    public final int method490() {
        ++field3464;
        int var1 = this.field3683;
        this.field3683 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILm;)V", line = 3531)
    public final void method1652(int arg0, class204 arg1) {
        int var3 = -109 % ((arg0 - -71) / 54);
        ++field3348;
        if (this.field3642 != arg1) {
            if (this.field3585) {
                OpenGL.glBindBufferARB(34963, arg1.method1376(false));
            }
            this.field3642 = arg1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLil;)V", line = 3550)
    public final void method1653(byte arg0, class7 arg1) {
        ++field3481;
        class7 var3 = this.field3650[this.field3595];
        if (arg0 <= 76) {
            this.field3660 = 1.1613998F;
        }
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (~arg1.field68 != ~var3.field68) {
                        OpenGL.glDisable(var3.field68);
                        OpenGL.glEnable(arg1.field68);
                    }
                } else {
                    OpenGL.glEnable(arg1.field68);
                }
                OpenGL.glBindTexture(arg1.field68, arg1.method46((byte) -7));
            } else {
                OpenGL.glDisable(var3.field68);
            }
            this.field3650[this.field3595] = arg1;
        }
        this.field3562 &= -2;
    }

    @OriginalMember(owner = "client!dia", name = "XA", descriptor = "()I", line = 3591)
    public final int method457() {
        ++field3401;
        return this.field3633;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILhga;)V", line = 3599)
    public final void method1654(int arg0, class185 arg1) {
        if (arg0 != 2) {
            this.field3586 = -1.2559083F;
        }
        ++field3332;
        if (~this.field3542 <= -1 && this.field3540[this.field3542] == arg1) {
            this.field3540[this.field3542--] = null;
            arg1.method1282(-4055);
            if (~this.field3542 > -1) {
                this.field3545 = null;
            } else {
                this.field3545 = this.field3540[this.field3542];
                this.field3545.method1284((byte) 78);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIZ)Lvr;", line = 3623)
    public final class147 method562(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3338;
        return new class463(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(Lhga;Z)V", line = 3633)
    public final void method1655(class185 arg0, boolean arg1) {
        ++field3359;
        if (~this.field3544 <= -1 && this.field3543[this.field3544] == arg0) {
            this.field3543[this.field3544--] = null;
            arg0.method1285(-16250);
            if (arg1) {
                if (this.field3544 < 0) {
                    this.field3539 = null;
                } else {
                    this.field3539 = this.field3543[this.field3544];
                    this.field3539.method1287(-106);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3657)
    public final void method460(Canvas arg0) {
        this.field3438 = 0L;
        ++field3422;
        this.field3387 = null;
        if (arg0 != null && this.field3495 != arg0) {
            if (this.field3479.containsKey(arg0)) {
                Long var2 = (Long) this.field3479.get(arg0);
                this.field3438 = var2;
                this.field3387 = arg0;
            }
        } else {
            this.field3387 = this.field3495;
            this.field3438 = this.field3441;
        }
        if (this.field3387 != null && ~this.field3438 != -1L) {
            this.field3379.setSurface(this.field3438);
            this.method1630((byte) 59);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 3688)
    public class246(Canvas arg0, class161 arg1, int arg2) {
        super(arg1);
        new class84();
        new class706(16);
        this.field3546 = new class412();
        this.field3550 = new class412();
        this.field3551 = new class412();
        this.field3552 = new class412();
        this.field3553 = new class412();
        this.field3554 = new class412();
        this.field3555 = new class412();
        this.field3563 = new class118();
        this.field3565 = new class118();
        this.field3566 = new class118();
        this.field3569 = 8448;
        this.field3582 = 512;
        this.field3580 = -1.0F;
        this.field3611 = new float[4];
        this.field3578 = -1;
        this.field3608 = 0;
        this.field3602 = 50;
        this.field3614 = 0;
        this.field3628 = 0;
        this.field3620 = 0;
        this.field3621 = 0;
        this.field3633 = 3584;
        this.field3600 = new class540[class653.field9063];
        this.field3638 = 512;
        this.field3643 = 1.0F;
        this.field3604 = -1;
        this.field3631 = new float[4];
        this.field3619 = new float[4];
        this.field3586 = -1.0F;
        this.field3651 = -1.0F;
        this.field3629 = 1.0F;
        this.field3593 = -1;
        this.field3613 = false;
        this.field3626 = 1.0F;
        this.field3575 = new float[16];
        this.field3661 = 0;
        this.field3623 = new float[4];
        this.field3646 = 3584.0F;
        this.field3654 = 0;
        this.field3649 = 1.0F;
        this.field3624 = 0;
        this.field3636 = 8448;
        this.field3656 = 0;
        this.field3590 = true;
        this.field3673 = 3584.0F;
        this.field3670 = -1;
        this.field3675 = 0;
        this.field3662 = -1;
        this.field3570 = 1.0F;
        this.field3676 = -1.0F;
        this.field3677 = 0.0F;
        this.field3639 = new class406(8192);
        this.field3681 = new int[1];
        this.field3679 = new int[1];
        this.field3680 = new int[1];
        this.field3682 = new byte[16384];
        this.field3387 = this.field3495 = arg0;
        this.field3512 = arg2;
        if (!class295.method1877(60, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class295.method1877(126, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field3379 = new OpenGL();
                this.field3438 = this.field3441 = this.field3379.init(arg0, 8, 8, 8, 24, 0, this.field3512);
                if (this.field3441 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1633((byte) -20);
                    int var4 = this.method1594(100);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field3596 = this.field3588 ? 33639 : 5121;
                        if (~this.field3625.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class46.method355(this.field3625.replace('/', ' '), 0, ' ');
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class732.method4062(var10.substring(1, 3), 0)) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class732.method4062(var10.substring(0, 4), 0)) {
                                                var5 = class334.method2123(1, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field3584 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field3585 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field3589 = false;
                                }
                            }
                            this.field3653 &= this.field3379.method3636("GL_ARB_half_float_pixel");
                            this.field3664 = this.field3585;
                            this.field3674 = true;
                        }
                        if (~this.field3606.indexOf("intel") != 0) {
                            this.field3617 = false;
                        }
                        this.field3567 = !this.field3606.equals("s3 graphics");
                        if (this.field3585) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class679.method3753(true, false, true);
                        this.field3531 = true;
                        this.field3519 = new class52(this, super.field912);
                        this.method1615(1);
                        this.field3530 = new class742(this);
                        this.field3511 = new class62(this);
                        if (this.field3511.method439((byte) -73)) {
                            this.field3510 = new class353(this);
                            if (!this.field3510.method2227(256)) {
                                this.field3510.method2228(-82);
                                this.field3510 = null;
                            }
                        }
                        this.field3517 = new class538(this);
                        this.method1582(true);
                        this.method1630((byte) 59);
                        this.method500();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method465();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljaclib/memory/Buffer;ZIII)Lfha;", line = 3838)
    public final class401 method1656(Buffer arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3341;
        if (!this.field3585 || arg1 && !this.field3664) {
            if (arg3 != 7) {
                this.method525(-31, 3, -115, -95, 101, -35, (class514) null, -111, -110, -16, 47, -29);
            }
            return new class478(this, arg4, arg0);
        } else {
            return new class636(this, arg4, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "(II)Ltq;", line = 3861)
    public final class656 method536(int arg0, int arg1) {
        ++field3502;
        return null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BIII)V", line = 3869)
    public final void method1657(byte arg0, int arg1, int arg2, int arg3) {
        ++field3412;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
        if (arg0 == 90) {
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([I)V", line = 3884)
    public final void method561(int[] arg0) {
        arg0[0] = this.field3442;
        arg0[1] = this.field3500;
        ++field3378;
    }

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "(II)I", line = 3893)
    public final int method1658(int arg0, int arg1) {
        ++field3421;
        int var3 = -124 / ((arg0 - 73) / 40);
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (arg1 != 5125 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "()Z", line = 3913)
    public final boolean method522() {
        ++field3474;
        return false;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;", line = 3921)
    public final class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3) {
        ++field3497;
        if (arg0 != null && arg1 != null && this.field3672 && this.field3617) {
            class341 var5 = null;
            class293 var6 = (class293) arg0;
            class293 var7 = (class293) arg1;
            class196 var8 = var6.method1852(16824);
            class196 var9 = var7.method1852(16824);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2623 > var9.field2623 ? var8.field2623 : var9.field2623;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class341) {
                    class341 var11 = (class341) arg3;
                    if (var11.method2161(65534) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class341(this, var10);
                }
                if (var5.method2162(-65534, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "()V", line = 3967)
    public final void method529() {
        ++field3496;
    }

    @OriginalMember(owner = "client!dia", name = "aa", descriptor = "(IIIIII)V", line = 3976)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3336;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1609(0);
        this.method1648(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3668) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3668) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "(I)V", line = 4009)
    public static void method1659(int arg0) {
        field3374 = null;
        if (arg0 != 13785) {
            method1659(-99);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIILaa;II)V", line = 4023)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        ++field3498;
        class148 var10 = (class148) arg6;
        class207 var11 = var10.field2076;
        this.method1603(101);
        this.method1653((byte) 95, var10.field2076);
        this.method1648(0, arg5);
        this.method1622(8448, 7681, (byte) -13);
        this.method1641(34167, 768, 0, 34192);
        float var12 = var11.field2710 / (float) var11.field2712;
        float var13 = var11.field2708 / (float) var11.field2704;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method1641(5890, 768, 0, 34192);
    }

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "(II)Lbfa;", line = 4061)
    public final class390 method528(int arg0, int arg1) {
        ++field3331;
        return null;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(ILra;)V", line = 4072)
    public final void method1660(int arg0, class118 arg1) {
        if (arg0 != 23111) {
            this.field3560 = -55;
        }
        OpenGL.glLoadMatrixf(arg1.method983(false), 0);
        ++field3392;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(III)V", line = 4083)
    public final synchronized void method1661(int arg0, int arg1, int arg2) {
        ++field3513;
        class119 var4 = new class119(arg1);
        if (arg2 != -2) {
            this.method488(-90, 4, -14, 27, 37);
        }
        var4.field1409 = (long) arg0;
        this.field3551.method2545(-128, var4);
    }

    @OriginalMember(owner = "client!dia", name = "da", descriptor = "(III[I)V", line = 4099)
    public final void method455(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3448;
        float var5 = (float) arg2 * this.field3563.field1708 + (float) arg0 * this.field3563.field1690 + (float) arg1 * this.field3563.field1715 + this.field3563.field1709;
        if (!(var5 < (float) this.field3602) && !(var5 > (float) this.field3633)) {
            int var6 = (int) (((float) arg2 * this.field3563.field1710 + (float) arg0 * this.field3563.field1697 + (float) arg1 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / var5);
            int var7 = (int) (((float) arg2 * this.field3563.field1717 + (float) arg0 * this.field3563.field1695 + (float) arg1 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / var5);
            if (this.field3634 <= (float) var6 && (float) var6 <= this.field3597 && (float) var7 >= this.field3616 && (float) var7 <= this.field3581) {
                arg3[1] = (int) ((float) var7 + -this.field3616);
                arg3[0] = (int) ((float) var6 + -this.field3634);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "(I)V", line = 4130)
    public final synchronized void method546(int arg0) {
        ++field3364;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3550.method2540(false)) {
            class119 var12 = (class119) this.field3550.method2543(-15114);
            class52.field755[var2++] = (int) var12.field1409;
            this.field3549 -= var12.field1725;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class52.field755, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class52.field755, 0);
            var2 = 0;
        }
        while (!this.field3551.method2540(false)) {
            class119 var11 = (class119) this.field3551.method2543(-15114);
            class52.field755[var2++] = (int) var11.field1409;
            this.field3548 -= var11.field1725;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class52.field755, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class52.field755, 0);
            var2 = 0;
        }
        while (!this.field3552.method2540(false)) {
            class119 var10 = (class119) this.field3552.method2543(-15114);
            class52.field755[var2++] = var10.field1725;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class52.field755, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class52.field755, 0);
            var2 = 0;
        }
        while (!this.field3553.method2540(false)) {
            class119 var9 = (class119) this.field3553.method2543(-15114);
            class52.field755[var2++] = (int) var9.field1409;
            this.field3547 -= var9.field1725;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class52.field755, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class52.field755, 0);
            boolean var4 = false;
        }
        while (!this.field3546.method2540(false)) {
            class119 var8 = (class119) this.field3546.method2543(-15114);
            OpenGL.glDeleteLists((int) var8.field1409, var8.field1725);
        }
        while (!this.field3554.method2540(false)) {
            class101 var7 = this.field3554.method2543(-15114);
            OpenGL.glDeleteProgramARB((int) var7.field1409);
        }
        while (!this.field3555.method2540(false)) {
            class101 var6 = this.field3555.method2543(-15114);
            OpenGL.glDeleteObjectARB(var6.field1409);
        }
        while (!this.field3546.method2540(false)) {
            class119 var5 = (class119) this.field3546.method2543(-15114);
            OpenGL.glDeleteLists((int) var5.field1409, var5.field1725);
        }
        this.field3519.method381(-18254);
        if (this.method567() > 100663296 && this.field3556 - -60000L < class302.method1910(0)) {
            System.gc();
            this.field3556 = class302.method1910(0);
        }
        this.field3532 = var3;
    }

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "(I)V", line = 4295)
    public final void method554(int arg0) {
        ++field3473;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 4307)
    public final void method480(Canvas arg0, int arg1, int arg2) {
        ++field3367;
        if (this.field3495 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3479.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field3379.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3479.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!dia", name = "H", descriptor = "(III[I)V", line = 4345)
    public final void method551(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3405;
        float var5 = (float) arg2 * this.field3563.field1708 + (float) arg0 * this.field3563.field1690 + (float) arg1 * this.field3563.field1715 + this.field3563.field1709;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field3563.field1710 + (float) arg0 * this.field3563.field1697 + (float) arg1 * this.field3563.field1705 + this.field3563.field1702) * (float) this.field3582 / var5);
            int var7 = (int) (((float) arg2 * this.field3563.field1717 + (float) arg0 * this.field3563.field1695 + (float) arg1 * this.field3563.field1693 + this.field3563.field1719) * (float) this.field3638 / var5);
            arg3[0] = (int) ((float) var6 - this.field3634);
            arg3[1] = (int) ((float) var7 - this.field3616);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!dia", name = "Y", descriptor = "()[I", line = 4369)
    public final int[] method496() {
        ++field3324;
        return new int[] { this.field3675, this.field3654, this.field3582, this.field3638 };
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lza;)V", line = 4377)
    public final void method449(class437 arg0) {
        this.field3533 = ((class82) arg0).field1160;
        ++field3523;
        if (this.field3572 == null) {
            class406 var2 = new class406(80);
            if (!this.field3588) {
                var2.method2524(61, -1.0F);
                var2.method2524(107, -1.0F);
                var2.method2524(-85, 0.0F);
                var2.method2524(-81, 0.0F);
                var2.method2524(-46, 1.0F);
                var2.method2524(-66, 1.0F);
                var2.method2524(-81, -1.0F);
                var2.method2524(76, 0.0F);
                var2.method2524(-70, 1.0F);
                var2.method2524(63, 1.0F);
                var2.method2524(95, 1.0F);
                var2.method2524(-56, 1.0F);
                var2.method2524(-69, 0.0F);
                var2.method2524(-81, 1.0F);
                var2.method2524(-85, 0.0F);
                var2.method2524(-52, -1.0F);
                var2.method2524(75, 1.0F);
                var2.method2524(-85, 0.0F);
                var2.method2524(-76, 0.0F);
                var2.method2524(59, 0.0F);
            } else {
                var2.method2523(-4231, -1.0F);
                var2.method2523(-4231, -1.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, -1.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, -1.0F);
                var2.method2523(-4231, 1.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 0.0F);
                var2.method2523(-4231, 0.0F);
            }
            this.field3572 = this.method1596(0, var2.field5459, var2.field5518, false, 20);
            this.field3587 = new class430(this.field3572, 5126, 3, 0);
            this.field3579 = new class430(this.field3572, 5126, 2, 12);
            this.field3516.method4115(this, 98);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 4442)
    public final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3407;
        this.method1609(0);
        this.method1648(0, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "()Z", line = 4464)
    public final boolean method535() {
        ++field3319;
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "()Z", line = 4475)
    public final boolean method519() {
        ++field3333;
        return false;
    }

    @OriginalMember(owner = "client!dia", name = "na", descriptor = "(IIII)[I", line = 4483)
    public final int[] method521(int arg0, int arg1, int arg2, int arg3) {
        ++field3355;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field3500, arg2, 1, 32993, this.field3596, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(Z)V", line = 4504)
    public final void method541(boolean arg0) {
        ++field3488;
    }
}
