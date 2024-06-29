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

@OriginalClass("client!lf")
public class class250 extends class66 {

    @OriginalMember(owner = "client!lf", name = "mb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3334 = new Hashtable();

    @OriginalMember(owner = "client!lf", name = "De", descriptor = "I")
    public int field3507 = 128;

    @OriginalMember(owner = "client!lf", name = "ue", descriptor = "Llk;")
    private class612 field3498 = new class612();

    @OriginalMember(owner = "client!lf", name = "Ie", descriptor = "Lpo;")
    private class584 field3512 = new class584();

    @OriginalMember(owner = "client!lf", name = "Je", descriptor = "Lpo;")
    public class584 field3513 = new class584();

    @OriginalMember(owner = "client!lf", name = "Ne", descriptor = "I")
    public int field3517 = 3;

    @OriginalMember(owner = "client!lf", name = "Le", descriptor = "I")
    public int field3515 = 8;

    @OriginalMember(owner = "client!lf", name = "Qe", descriptor = "Z")
    private boolean field3520 = false;

    @OriginalMember(owner = "client!lf", name = "Ke", descriptor = "Lqw;")
    private class84 field3514 = new class84();

    @OriginalMember(owner = "client!lf", name = "Te", descriptor = "[Lvk;")
    private class387[] field3523 = new class387[4];

    @OriginalMember(owner = "client!lf", name = "Re", descriptor = "I")
    private int field3521 = -1;

    @OriginalMember(owner = "client!lf", name = "Xe", descriptor = "I")
    private int field3527 = -1;

    @OriginalMember(owner = "client!lf", name = "Ye", descriptor = "I")
    private int field3528 = -1;

    @OriginalMember(owner = "client!lf", name = "af", descriptor = "[Lvk;")
    private class387[] field3530 = new class387[4];

    @OriginalMember(owner = "client!lf", name = "Ze", descriptor = "[Lvk;")
    private class387[] field3529 = new class387[4];

    @OriginalMember(owner = "client!lf", name = "df", descriptor = "Lqw;")
    private class84 field3533;

    @OriginalMember(owner = "client!lf", name = "ff", descriptor = "Lqw;")
    private class84 field3535;

    @OriginalMember(owner = "client!lf", name = "gf", descriptor = "Lqw;")
    private class84 field3536;

    @OriginalMember(owner = "client!lf", name = "hf", descriptor = "Lqw;")
    private class84 field3537;

    @OriginalMember(owner = "client!lf", name = "jf", descriptor = "Lqw;")
    private class84 field3538;

    @OriginalMember(owner = "client!lf", name = "kf", descriptor = "Lqw;")
    private class84 field3539;

    @OriginalMember(owner = "client!lf", name = "lf", descriptor = "Lqw;")
    private class84 field3540;

    @OriginalMember(owner = "client!lf", name = "qf", descriptor = "Lpo;")
    public class584 field3545;

    @OriginalMember(owner = "client!lf", name = "vf", descriptor = "Lpo;")
    public class584 field3550;

    @OriginalMember(owner = "client!lf", name = "wf", descriptor = "Lpo;")
    public class584 field3551;

    @OriginalMember(owner = "client!lf", name = "Sf", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!lf", name = "dg", descriptor = "F")
    public float field3584;

    @OriginalMember(owner = "client!lf", name = "xg", descriptor = "I")
    private int field3604;

    @OriginalMember(owner = "client!lf", name = "Bg", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!lf", name = "xf", descriptor = "[F")
    public float[] field3552;

    @OriginalMember(owner = "client!lf", name = "Df", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!lf", name = "rg", descriptor = "F")
    private float field3598;

    @OriginalMember(owner = "client!lf", name = "Ag", descriptor = "I")
    private int field3607;

    @OriginalMember(owner = "client!lf", name = "Tf", descriptor = "[F")
    private float[] field3574;

    @OriginalMember(owner = "client!lf", name = "Ef", descriptor = "[F")
    private float[] field3559;

    @OriginalMember(owner = "client!lf", name = "sg", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!lf", name = "Tg", descriptor = "I")
    public int field3626;

    @OriginalMember(owner = "client!lf", name = "Pf", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!lf", name = "Kg", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!lf", name = "yg", descriptor = "F")
    public float field3605;

    @OriginalMember(owner = "client!lf", name = "Dg", descriptor = "F")
    public float field3610;

    @OriginalMember(owner = "client!lf", name = "Xg", descriptor = "Z")
    private boolean field3630;

    @OriginalMember(owner = "client!lf", name = "ag", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!lf", name = "Nf", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!lf", name = "Hg", descriptor = "F")
    private float field3614;

    @OriginalMember(owner = "client!lf", name = "ph", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!lf", name = "Sg", descriptor = "I")
    public int field3625;

    @OriginalMember(owner = "client!lf", name = "jh", descriptor = "F")
    private float field3642;

    @OriginalMember(owner = "client!lf", name = "zg", descriptor = "[F")
    private float[] field3606;

    @OriginalMember(owner = "client!lf", name = "rh", descriptor = "F")
    public float field3650;

    @OriginalMember(owner = "client!lf", name = "sh", descriptor = "[F")
    private float[] field3651;

    @OriginalMember(owner = "client!lf", name = "nh", descriptor = "F")
    private float field3646;

    @OriginalMember(owner = "client!lf", name = "eh", descriptor = "[Luaa;")
    private class127[] field3637;

    @OriginalMember(owner = "client!lf", name = "yf", descriptor = "F")
    public float field3553;

    @OriginalMember(owner = "client!lf", name = "lh", descriptor = "F")
    public float field3644;

    @OriginalMember(owner = "client!lf", name = "og", descriptor = "Z")
    private boolean field3595;

    @OriginalMember(owner = "client!lf", name = "yh", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!lf", name = "ih", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!lf", name = "Yg", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!lf", name = "wh", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!lf", name = "Qf", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!lf", name = "vh", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!lf", name = "ah", descriptor = "F")
    private float field3633;

    @OriginalMember(owner = "client!lf", name = "xh", descriptor = "F")
    public float field3656;

    @OriginalMember(owner = "client!lf", name = "kh", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!lf", name = "gh", descriptor = "I")
    public int field3639;

    @OriginalMember(owner = "client!lf", name = "Qg", descriptor = "Luba;")
    public class453 field3623;

    @OriginalMember(owner = "client!lf", name = "Fh", descriptor = "[I")
    public int[] field3664;

    @OriginalMember(owner = "client!lf", name = "Hh", descriptor = "[I")
    public int[] field3666;

    @OriginalMember(owner = "client!lf", name = "Eh", descriptor = "[I")
    public int[] field3663;

    @OriginalMember(owner = "client!lf", name = "Ih", descriptor = "[B")
    public byte[] field3667;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3311;

    @OriginalMember(owner = "client!lf", name = "Tb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3367;

    @OriginalMember(owner = "client!lf", name = "He", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!lf", name = "Od", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3466;

    @OriginalMember(owner = "client!lf", name = "Sd", descriptor = "J")
    private long field3470;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "J")
    private long field3305;

    @OriginalMember(owner = "client!lf", name = "Gf", descriptor = "Z")
    public boolean field3561;

    @OriginalMember(owner = "client!lf", name = "Bh", descriptor = "I")
    public int field3660;

    @OriginalMember(owner = "client!lf", name = "Rg", descriptor = "Ljava/lang/String;")
    private String field3624;

    @OriginalMember(owner = "client!lf", name = "fg", descriptor = "Z")
    public boolean field3586;

    @OriginalMember(owner = "client!lf", name = "Rf", descriptor = "Z")
    private boolean field3572;

    @OriginalMember(owner = "client!lf", name = "ug", descriptor = "Z")
    public boolean field3601;

    @OriginalMember(owner = "client!lf", name = "Jg", descriptor = "Z")
    public boolean field3616;

    @OriginalMember(owner = "client!lf", name = "oh", descriptor = "Z")
    public boolean field3647;

    @OriginalMember(owner = "client!lf", name = "Lf", descriptor = "Z")
    private boolean field3566;

    @OriginalMember(owner = "client!lf", name = "Hf", descriptor = "Ljava/lang/String;")
    private String field3562;

    @OriginalMember(owner = "client!lf", name = "th", descriptor = "Z")
    public boolean field3652;

    @OriginalMember(owner = "client!lf", name = "Xf", descriptor = "Z")
    private boolean field3578;

    @OriginalMember(owner = "client!lf", name = "Ge", descriptor = "Loha;")
    private class771 field3510;

    @OriginalMember(owner = "client!lf", name = "Me", descriptor = "Llaa;")
    public class131 field3516;

    @OriginalMember(owner = "client!lf", name = "qe", descriptor = "Lbo;")
    private class759 field3494;

    @OriginalMember(owner = "client!lf", name = "ye", descriptor = "Lnia;")
    private class670 field3502;

    @OriginalMember(owner = "client!lf", name = "se", descriptor = "Lpfa;")
    private class312 field3496;

    @OriginalMember(owner = "client!lf", name = "Mc", descriptor = "Lmw;")
    public static class517 field3412 = new class517(34, 8);

    @OriginalMember(owner = "client!lf", name = "ie", descriptor = "Lhaa;")
    public static class89 field3486 = new class89(0, 0);

    @OriginalMember(owner = "client!lf", name = "Ce", descriptor = "Z")
    public static boolean field3506 = false;

    @OriginalMember(owner = "client!lf", name = "Yf", descriptor = "F")
    private float field3579;

    @OriginalMember(owner = "client!lf", name = "cg", descriptor = "F")
    public float field3583;

    @OriginalMember(owner = "client!lf", name = "jg", descriptor = "F")
    public float field3590;

    @OriginalMember(owner = "client!lf", name = "pg", descriptor = "F")
    private float field3596;

    @OriginalMember(owner = "client!lf", name = "qg", descriptor = "F")
    public float field3597;

    @OriginalMember(owner = "client!lf", name = "Eg", descriptor = "F")
    public float field3611;

    @OriginalMember(owner = "client!lf", name = "Gg", descriptor = "F")
    public float field3613;

    @OriginalMember(owner = "client!lf", name = "Pg", descriptor = "F")
    private float field3622;

    @OriginalMember(owner = "client!lf", name = "Ug", descriptor = "F")
    public float field3627;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!lf", name = "jb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!lf", name = "kb", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!lf", name = "lb", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!lf", name = "ob", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!lf", name = "rb", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!lf", name = "tb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!lf", name = "ub", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!lf", name = "vb", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!lf", name = "wb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!lf", name = "xb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!lf", name = "yb", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!lf", name = "zb", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!lf", name = "Bb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!lf", name = "Cb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lf", name = "Db", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!lf", name = "Eb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!lf", name = "Fb", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!lf", name = "Gb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!lf", name = "Hb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!lf", name = "Ib", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!lf", name = "Kb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!lf", name = "Lb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!lf", name = "Mb", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!lf", name = "Nb", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!lf", name = "Ob", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!lf", name = "Pb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!lf", name = "Qb", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!lf", name = "Rb", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!lf", name = "Sb", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!lf", name = "Ub", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!lf", name = "Vb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!lf", name = "Wb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!lf", name = "Xb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!lf", name = "Yb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!lf", name = "Zb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!lf", name = "ac", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!lf", name = "bc", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!lf", name = "cc", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!lf", name = "dc", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!lf", name = "ec", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!lf", name = "fc", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!lf", name = "gc", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!lf", name = "hc", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!lf", name = "ic", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!lf", name = "jc", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!lf", name = "kc", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!lf", name = "lc", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!lf", name = "mc", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!lf", name = "nc", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!lf", name = "oc", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!lf", name = "pc", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!lf", name = "qc", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!lf", name = "rc", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!lf", name = "sc", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!lf", name = "tc", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!lf", name = "uc", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!lf", name = "vc", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!lf", name = "wc", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!lf", name = "xc", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!lf", name = "yc", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!lf", name = "zc", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!lf", name = "Ac", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!lf", name = "Bc", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!lf", name = "Cc", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!lf", name = "Dc", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!lf", name = "Ec", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!lf", name = "Fc", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!lf", name = "Gc", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!lf", name = "Hc", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!lf", name = "Ic", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!lf", name = "Jc", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!lf", name = "Kc", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!lf", name = "Lc", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!lf", name = "Nc", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!lf", name = "Oc", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!lf", name = "Pc", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!lf", name = "Qc", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!lf", name = "Rc", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!lf", name = "Sc", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!lf", name = "Tc", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!lf", name = "Uc", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!lf", name = "Vc", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!lf", name = "Wc", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!lf", name = "Xc", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!lf", name = "Yc", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!lf", name = "Zc", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!lf", name = "ad", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!lf", name = "bd", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!lf", name = "cd", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!lf", name = "dd", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!lf", name = "ed", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!lf", name = "fd", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!lf", name = "gd", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!lf", name = "hd", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!lf", name = "id", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!lf", name = "jd", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!lf", name = "kd", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!lf", name = "ld", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!lf", name = "md", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!lf", name = "nd", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!lf", name = "od", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!lf", name = "pd", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!lf", name = "qd", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!lf", name = "rd", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!lf", name = "sd", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!lf", name = "td", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!lf", name = "ud", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!lf", name = "vd", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!lf", name = "wd", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!lf", name = "xd", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!lf", name = "yd", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!lf", name = "zd", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!lf", name = "Ad", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!lf", name = "Cd", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!lf", name = "Dd", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!lf", name = "Ed", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!lf", name = "Fd", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!lf", name = "Gd", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!lf", name = "Hd", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!lf", name = "Id", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!lf", name = "Jd", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!lf", name = "Kd", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!lf", name = "Ld", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!lf", name = "Md", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!lf", name = "Nd", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!lf", name = "Pd", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lf", name = "Qd", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!lf", name = "Rd", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!lf", name = "Td", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!lf", name = "Ud", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!lf", name = "Vd", descriptor = "I")
    private int field3473;

    @OriginalMember(owner = "client!lf", name = "Wd", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!lf", name = "Xd", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!lf", name = "Yd", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!lf", name = "Zd", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!lf", name = "ae", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!lf", name = "be", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!lf", name = "ce", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!lf", name = "de", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!lf", name = "ee", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!lf", name = "fe", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!lf", name = "ge", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!lf", name = "he", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!lf", name = "je", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!lf", name = "ke", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!lf", name = "le", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!lf", name = "me", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!lf", name = "ne", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!lf", name = "oe", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!lf", name = "pe", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!lf", name = "re", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!lf", name = "te", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!lf", name = "we", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!lf", name = "xe", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!lf", name = "ze", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!lf", name = "Ae", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!lf", name = "Be", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!lf", name = "Ee", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!lf", name = "Fe", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!lf", name = "Pe", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!lf", name = "bf", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!lf", name = "cf", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!lf", name = "ef", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!lf", name = "nf", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!lf", name = "of", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!lf", name = "sf", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!lf", name = "Cf", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!lf", name = "If", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!lf", name = "Of", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!lf", name = "Uf", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!lf", name = "Wf", descriptor = "I")
    private int field3577;

    @OriginalMember(owner = "client!lf", name = "kg", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!lf", name = "tg", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!lf", name = "Ig", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!lf", name = "Ng", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!lf", name = "Zg", descriptor = "I")
    private int field3632;

    @OriginalMember(owner = "client!lf", name = "qh", descriptor = "I")
    private int field3649;

    @OriginalMember(owner = "client!lf", name = "Dh", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!lf", name = "Gh", descriptor = "I")
    private int field3665;

    @OriginalMember(owner = "client!lf", name = "Jh", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!lf", name = "mf", descriptor = "J")
    private long field3541;

    @OriginalMember(owner = "client!lf", name = "Bd", descriptor = "Ldaa;")
    public static class12 field3453;

    @OriginalMember(owner = "client!lf", name = "Zf", descriptor = "Lut;")
    public class135 field3580;

    @OriginalMember(owner = "client!lf", name = "Mg", descriptor = "Lut;")
    public class135 field3619;

    @OriginalMember(owner = "client!lf", name = "Ah", descriptor = "Lvv;")
    private class343 field3659;

    @OriginalMember(owner = "client!lf", name = "Ue", descriptor = "Lvk;")
    private class387 field3524;

    @OriginalMember(owner = "client!lf", name = "We", descriptor = "Lvk;")
    private class387 field3526;

    @OriginalMember(owner = "client!lf", name = "mg", descriptor = "Lfu;")
    private class411 field3593;

    @OriginalMember(owner = "client!lf", name = "uh", descriptor = "Lwl;")
    private class429 field3653;

    @OriginalMember(owner = "client!lf", name = "Vf", descriptor = "Lrba;")
    public class456 field3576;

    @OriginalMember(owner = "client!lf", name = "Bf", descriptor = "Lsca;")
    public class50 field3556;

    @OriginalMember(owner = "client!lf", name = "bg", descriptor = "Lsca;")
    public class50 field3582;

    @OriginalMember(owner = "client!lf", name = "gg", descriptor = "Lsca;")
    public class50 field3587;

    @OriginalMember(owner = "client!lf", name = "ng", descriptor = "Lsca;")
    public class50 field3594;

    @OriginalMember(owner = "client!lf", name = "vg", descriptor = "Lsca;")
    public class50 field3602;

    @OriginalMember(owner = "client!lf", name = "Fg", descriptor = "Lsca;")
    public class50 field3612;

    @OriginalMember(owner = "client!lf", name = "Lg", descriptor = "Lsca;")
    public class50 field3618;

    @OriginalMember(owner = "client!lf", name = "bh", descriptor = "Lsca;")
    public class50 field3634;

    @OriginalMember(owner = "client!lf", name = "zh", descriptor = "Lsca;")
    public class50 field3658;

    @OriginalMember(owner = "client!lf", name = "Ch", descriptor = "Lsca;")
    public class50 field3661;

    @OriginalMember(owner = "client!lf", name = "Ve", descriptor = "Laea;")
    private class56 field3525;

    @OriginalMember(owner = "client!lf", name = "Wg", descriptor = "Lot;")
    private class615 field3629;

    @OriginalMember(owner = "client!lf", name = "mh", descriptor = "Lot;")
    private class615 field3645;

    @OriginalMember(owner = "client!lf", name = "Se", descriptor = "Lgea;")
    private class82 field3522;

    @OriginalMember(owner = "client!lf", name = "Vg", descriptor = "Lgea;")
    public class82 field3628;

    @OriginalMember(owner = "client!lf", name = "Oe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3518;

    @OriginalMember(owner = "client!lf", name = "ve", descriptor = "Z")
    public static boolean field3499;

    @OriginalMember(owner = "client!lf", name = "pf", descriptor = "Z")
    private boolean field3544;

    @OriginalMember(owner = "client!lf", name = "rf", descriptor = "Z")
    private boolean field3546;

    @OriginalMember(owner = "client!lf", name = "tf", descriptor = "Z")
    private boolean field3548;

    @OriginalMember(owner = "client!lf", name = "uf", descriptor = "Z")
    private boolean field3549;

    @OriginalMember(owner = "client!lf", name = "zf", descriptor = "Z")
    public boolean field3554;

    @OriginalMember(owner = "client!lf", name = "Af", descriptor = "Z")
    private boolean field3555;

    @OriginalMember(owner = "client!lf", name = "Ff", descriptor = "Z")
    public boolean field3560;

    @OriginalMember(owner = "client!lf", name = "Jf", descriptor = "Z")
    public boolean field3564;

    @OriginalMember(owner = "client!lf", name = "Kf", descriptor = "Z")
    private boolean field3565;

    @OriginalMember(owner = "client!lf", name = "eg", descriptor = "Z")
    private boolean field3585;

    @OriginalMember(owner = "client!lf", name = "hg", descriptor = "Z")
    public boolean field3588;

    @OriginalMember(owner = "client!lf", name = "ig", descriptor = "Z")
    public boolean field3589;

    @OriginalMember(owner = "client!lf", name = "lg", descriptor = "Z")
    public boolean field3592;

    @OriginalMember(owner = "client!lf", name = "wg", descriptor = "Z")
    public boolean field3603;

    @OriginalMember(owner = "client!lf", name = "Cg", descriptor = "Z")
    private boolean field3609;

    @OriginalMember(owner = "client!lf", name = "Og", descriptor = "Z")
    private boolean field3621;

    @OriginalMember(owner = "client!lf", name = "ch", descriptor = "Z")
    private boolean field3635;

    @OriginalMember(owner = "client!lf", name = "dh", descriptor = "Z")
    public boolean field3636;

    @OriginalMember(owner = "client!lf", name = "fh", descriptor = "Z")
    public boolean field3638;

    @OriginalMember(owner = "client!lf", name = "hh", descriptor = "Z")
    private boolean field3640;

    @OriginalMember(owner = "client!lf", name = "Mf", descriptor = "[Lru;")
    private class205[] field3567;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)V", line = 4)
    public final synchronized void method1561(int arg0, byte arg1, int arg2) {
        ++field3495;
        class445 var4 = new class445(arg0);
        int var5 = -50 / ((arg1 - 29) / 46);
        var4.field2146 = (long) arg2;
        this.field3535.method689(var4, -104);
    }

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "(II)V", line = 22)
    public final void method497(int arg0, int arg1) {
        ++field3366;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 29)
    private final void method1562(byte arg0) {
        class782.field10749[2] = this.field3644 * this.field3583;
        class782.field10749[1] = this.field3584 * this.field3583;
        if (arg0 != -58) {
            this.method494();
        }
        ++field3471;
        class782.field10749[0] = this.field3650 * this.field3583;
        class782.field10749[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class782.field10749, 0);
    }

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "(IIII)V", line = 44)
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3608 < arg1) {
            this.field3608 = arg1;
        }
        if (this.field3655 < arg0) {
            this.field3655 = arg0;
        }
        ++field3382;
        if (~arg3 > ~this.field3643) {
            this.field3643 = arg3;
        }
        if (~arg2 > ~this.field3617) {
            this.field3617 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method1625(5126);
        this.method1582(4609);
    }

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "()I", line = 73)
    public final int method496() {
        ++field3373;
        return this.field3532 - -this.field3534 - -this.field3531;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIII)V", line = 81)
    public final void method1563(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg1, arg2, arg3);
        ++field3474;
        if (arg0 < 38) {
            this.field3575 = -41;
        }
    }

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "()V", line = 94)
    public final void method482() {
        ++field3404;
        if (this.field3578 && ~this.field3461 < -1 && this.field3421 > 0) {
            int var1 = this.field3655;
            int var2 = this.field3617;
            int var3 = this.field3608;
            int var4 = this.field3643;
            this.method526();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1575((byte) -116);
            this.method1570((byte) 104, false);
            this.method1639(false, -8);
            this.method1593((byte) 29, false);
            this.method1572(false, false);
            this.method1595((byte) 103, (class205) null);
            this.method1580((byte) -52, -2);
            this.method1601(25456, 1);
            this.method1564(0, (byte) 107);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3461, this.field3421, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method453(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "(I)V", line = 138)
    public final void method477(int arg0) {
        this.field3517 = 0;
        ++field3444;
        while (arg0 > 1) {
            ++this.field3517;
            arg0 >>= 1;
        }
        this.field3515 = 1 << this.field3517;
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V", line = 157)
    public final void method537(int arg0) {
        this.method1607((byte) 103);
        ++field3491;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()Z", line = 165)
    public final boolean method448() {
        ++field3353;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "(III[I)V", line = 173)
    public final void method552(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3456;
        float var5 = (float) arg2 * this.field3545.field7955 + (float) arg0 * this.field3545.field7953 + (float) arg1 * this.field3545.field7963 + this.field3545.field7956;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field3545.field7934 + (float) arg0 * this.field3545.field7950 + (float) arg1 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / var5);
            arg3[0] = (int) ((float) var6 + -this.field3611);
            int var7 = (int) (((float) arg2 * this.field3545.field7932 + (float) arg0 * this.field3545.field7929 + (float) arg1 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field3590);
        }
    }

    @OriginalMember(owner = "client!lf", name = "JA", descriptor = "(IIIIII)I", line = 196)
    public final int method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3426;
        int var7 = 0;
        float var8 = (float) arg2 * this.field3545.field7955 + (float) arg0 * this.field3545.field7953 + (float) arg1 * this.field3545.field7963 + this.field3545.field7956;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3545.field7955 + (float) arg3 * this.field3545.field7953 + (float) arg4 * this.field3545.field7963 + this.field3545.field7956;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field3631 && var9 < (float) this.field3631) {
            var7 |= 16;
        } else if (var8 > (float) this.field3568 && (float) this.field3568 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3545.field7934 + (float) arg0 * this.field3545.field7950 + (float) arg1 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / var8);
        int var11 = (int) (((float) arg5 * this.field3545.field7934 + (float) arg3 * this.field3545.field7950 + (float) arg4 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / var9);
        if ((float) var10 < this.field3611 && this.field3611 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field3627 && (float) var11 > this.field3627) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3545.field7932 + (float) arg0 * this.field3545.field7929 + (float) arg1 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / var8);
        int var13 = (int) (((float) arg5 * this.field3545.field7932 + (float) arg3 * this.field3545.field7929 + (float) arg4 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / var9);
        if (this.field3590 > (float) var12 && (float) var13 < this.field3590) {
            var7 |= 4;
        } else if ((float) var12 > this.field3613 && (float) var13 > this.field3613) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(Z)V", line = 250)
    public final void method485(boolean arg0) {
        ++field3449;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V", line = 259)
    public final void method1564(int arg0, byte arg1) {
        if (arg1 >= 35) {
            if (~this.field3547 != ~arg0) {
                boolean var3;
                boolean var4;
                byte var5;
                if (arg0 == 1) {
                    var3 = true;
                    var4 = true;
                    var5 = 1;
                } else if (~arg0 == -3) {
                    var5 = 2;
                    var4 = true;
                    var3 = false;
                } else if (~arg0 != -129) {
                    var3 = false;
                    var4 = true;
                    var5 = 0;
                } else {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                }
                if (this.field3549 != var4) {
                    OpenGL.glColorMask(var4, var4, var4, true);
                    this.field3549 = var4;
                }
                if (!this.field3546 != !var3) {
                    if (!var3) {
                        OpenGL.glDisable(3008);
                    } else {
                        OpenGL.glEnable(3008);
                    }
                    this.field3546 = var3;
                }
                if (~this.field3542 != ~var5) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 != -4) {
                                OpenGL.glDisable(3042);
                            } else {
                                OpenGL.glEnable(3042);
                                OpenGL.glBlendFunc(774, 1);
                            }
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(1, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    }
                    this.field3542 = var5;
                }
                this.field3547 = arg0;
                this.field3543 &= -29;
            }
            ++field3336;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)V", line = 353)
    public final synchronized void method1565(int arg0, int arg1) {
        if (arg1 >= 95) {
            ++field3308;
            class159 var3 = new class159();
            var3.field2146 = (long) arg0;
            this.field3539.method689(var3, 104);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFIF)V", line = 367)
    private final void method1566(float arg0, float arg1, int arg2, float arg3) {
        ++field3302;
        OpenGL.glMatrixMode(5890);
        if (this.field3585) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg1);
        if (arg2 != 3382) {
            this.method487(50, -2, 31, 92, 61, -110);
        }
        OpenGL.glMatrixMode(5888);
        this.field3585 = true;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()Z", line = 384)
    public final boolean method450() {
        ++field3361;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lvk;I)V", line = 392)
    public final void method1567(class387 arg0, int arg1) {
        if (arg1 > -82) {
            this.field3654 = 108;
        }
        ++field3324;
        if (this.field3564) {
            this.method1606(arg0, -117);
            this.method1609((byte) -83, arg0);
        } else if (~this.field3527 <= -1 && this.field3523[this.field3527] == arg0) {
            this.field3523[this.field3527--] = null;
            arg0.method653(-49);
            if (~this.field3527 <= -1) {
                this.field3526 = this.field3524 = this.field3523[this.field3527];
                this.field3526.method662(false);
            } else {
                this.field3526 = this.field3524 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIIILvv;)V", line = 426)
    public final void method1568(boolean arg0, int arg1, int arg2, int arg3, class343 arg4) {
        ++field3372;
        int var6 = arg4.method1765(1);
        int var7 = arg1 * this.method1587(var6, (byte) 53);
        this.method1640(34963, arg4);
        OpenGL.glDrawElements(arg2, arg3, var6, arg4.method1766((byte) -120) + (long) var7);
        if (arg0) {
            this.field3662 = -121;
        }
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(II)V", line = 443)
    public final synchronized void method1569(int arg0, int arg1) {
        if (arg0 >= 124) {
            ++field3397;
            class445 var3 = new class445(arg1);
            this.field3537.method689(var3, 104);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V", line = 458)
    public final void method1570(byte arg0, boolean arg1) {
        if (!this.field3555 == arg1) {
            this.field3555 = arg1;
            this.method1589(5703);
            this.field3543 &= -32;
        }
        if (arg0 > 47) {
            ++field3394;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V", line = 477)
    private final void method1571(byte arg0) {
        int var2 = 112 / ((arg0 - 8) / 60);
        ++field3467;
        int var3;
        for (var3 = 0; var3 < this.field3600; ++var3) {
            class127 var4 = this.field3637[var3];
            class651.field8776[0] = (float) var4.method899(true);
            int var5 = var3 + 16386;
            class651.field8776[1] = (float) var4.method904(20);
            class651.field8776[2] = (float) var4.method901((byte) -115);
            class651.field8776[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class651.field8776, 0);
            int var6 = var4.method898(-104);
            float var7 = var4.method902(0) / 255.0F;
            class651.field8776[0] = var7 * (float) class519.method3018(255, var6 >> 16);
            class651.field8776[2] = (float) class519.method3018(var6, 255) * var7;
            class651.field8776[1] = var7 * (float) (class519.method3018(65519, var6) >> 8);
            OpenGL.glLightfv(var5, 4609, class651.field8776, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method903((byte) -117) * var4.method903((byte) -115)));
            OpenGL.glEnable(var5);
        }
        while (this.field3575 > var3) {
            OpenGL.glDisable(var3 + 16386);
            ++var3;
        }
        this.field3575 = this.field3600;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V", line = 521)
    public final void method1572(boolean arg0, boolean arg1) {
        ++field3393;
        if (!arg0) {
            if (this.field3544 == !arg1) {
                this.field3544 = arg1;
                this.method1629(127);
                this.field3543 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JZ)V", line = 538)
    public final synchronized void method1573(long arg0, boolean arg1) {
        ++field3362;
        if (arg1) {
            this.method1603(-45);
        }
        class159 var4 = new class159();
        var4.field2146 = arg0;
        this.field3540.method689(var4, -36);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)V", line = 552)
    private final void method1574(boolean arg0) {
        if (arg0) {
            this.method549(2.5028257F, 0.28008342F, 1.7056166F);
        }
        this.field3574[10] = this.field3622;
        this.field3574[14] = this.field3596;
        ++field3327;
        this.field3553 = (float) this.field3568;
        this.field3605 = (this.field3574[14] - (float) this.field3568) / this.field3574[10];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIII)V", line = 571)
    public final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3448;
        if (arg0 != arg2 || arg1 != arg3) {
            this.method1592(25338);
            this.method1564(arg5, (byte) 126);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg6 + arg7);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var14 = var11 * var12;
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var13 >= ~arg6) {
                var21 = (float) (-var13 + arg6) * var14;
                var20 = (float) (-var13 + arg6) * var15;
            } else {
                var18 = (float) (arg6 - -arg7 - var13) * var15;
                var19 = (float) (-var13 + arg6 + arg7) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg0 >= arg2) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (arg3 <= arg1) {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V", line = 679)
    public final void method1575(byte arg0) {
        ++field3370;
        if (this.field3591 != 0) {
            this.field3543 &= -32;
            this.field3591 = 0;
        }
        int var2 = 17 % ((arg0 - -42) / 48);
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 694)
    private final void method1576(int arg0) {
        if (this.field3591 != 3) {
            this.field3591 = 3;
            this.method1585(-58);
            this.method1611(-101);
            this.field3543 &= -8;
        }
        if (arg0 <= 36) {
            this.field3531 = -64;
        }
        ++field3503;
    }

    @OriginalMember(owner = "client!lf", name = "HA", descriptor = "(IIII[I)V", line = 712)
    public final void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3304;
        float var6 = (float) arg2 * this.field3545.field7955 + (float) arg0 * this.field3545.field7953 + (float) arg1 * this.field3545.field7963 + this.field3545.field7956;
        if (!((float) this.field3631 > var6) && !(var6 > (float) this.field3568)) {
            int var7 = (int) (((float) arg2 * this.field3545.field7934 + (float) arg0 * this.field3545.field7950 + (float) arg1 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field3545.field7932 + (float) arg0 * this.field3545.field7929 + (float) arg1 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / (float) arg3);
            if (this.field3611 <= (float) var7 && (float) var7 <= this.field3627 && this.field3590 <= (float) var8 && (float) var8 <= this.field3613) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 - this.field3590);
                arg4[0] = (int) ((float) var7 + -this.field3611);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "()Z", line = 743)
    public final boolean method536() {
        ++field3428;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "()I", line = 751)
    public final int method507() {
        ++field3451;
        return this.field3631;
    }

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "()V", line = 759)
    public final void method535() {
        ++field3331;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "([I)V", line = 768)
    public final void method467(int[] arg0) {
        arg0[3] = this.field3643;
        arg0[2] = this.field3617;
        arg0[0] = this.field3655;
        arg0[1] = this.field3608;
        ++field3497;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(Z)Liv;", line = 779)
    public final class107 method1577(boolean arg0) {
        ++field3476;
        if (!arg0) {
            this.field3624 = null;
        }
        return this.field3653 != null ? this.field3653.method1(25155) : null;
    }

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "()Z", line = 792)
    public final boolean method479() {
        ++field3487;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 806)
    public final void method556(Canvas arg0) {
        this.field3305 = 0L;
        ++field3435;
        this.field3367 = null;
        if (arg0 != null && this.field3311 != arg0) {
            if (this.field3334.containsKey(arg0)) {
                Long var2 = (Long) this.field3334.get(arg0);
                this.field3305 = var2;
                this.field3367 = arg0;
            }
        } else {
            this.field3367 = this.field3311;
            this.field3305 = this.field3470;
        }
        if (this.field3367 != null && this.field3305 != 0L) {
            this.field3466.setSurface(this.field3305);
            this.method1644(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIZ[BI)Lot;", line = 842)
    public final class615 method1578(byte arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field3386;
        if (!this.field3572 || arg2 && !this.field3566) {
            return arg0 != 61 ? null : new class631(this, arg4, arg3, arg1);
        } else {
            return new class616(this, arg4, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBIIII)V", line = 862)
    public static final void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~class297.field4199 >= ~arg6 && class45.field472 >= arg6 && ~arg2 <= ~class297.field4199 && ~class45.field472 <= ~arg2 && arg9 >= class297.field4199 && arg9 <= class45.field472 && class297.field4199 <= arg8 && arg8 <= class45.field472 && ~class291.field4156 >= ~arg4 && ~arg4 >= ~class233.field3099 && ~class291.field4156 >= ~arg3 && class233.field3099 >= arg3 && ~class291.field4156 >= ~arg7 && class233.field3099 >= arg7 && ~arg0 <= ~class291.field4156 && arg0 <= class233.field3099) {
            class520.method3027(arg1, arg6, arg0, 3, arg7, arg2, arg3, arg4, arg8, arg9);
        } else {
            class522.method3035(arg1, arg9, arg6, arg0, arg7, (byte) 126, arg4, arg3, arg2, arg8);
        }
        if (arg5 > 89) {
            ++field3437;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)V", line = 879)
    public final void method1580(byte arg0, int arg1) {
        if (arg0 != -52) {
            this.method1622(-0.53071415F, (byte) -114);
        }
        this.method1628(true, 24166, arg1);
        ++field3307;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIII)V", line = 890)
    public final void method1581(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 13112) {
            this.field3642 = -0.8866078F;
        }
        ++field3450;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)V", line = 902)
    private final void method1582(int arg0) {
        ++field3350;
        if (~this.field3617 <= ~this.field3655 && this.field3608 <= this.field3643) {
            OpenGL.glScissor(this.field3655 + this.field3558, -this.field3643 + this.field3607 + this.field3421, -this.field3655 + this.field3617, -this.field3608 + this.field3643);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 4609) {
            this.field3656 = -0.36569107F;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(Z)V", line = 917)
    private final void method1583(boolean arg0) {
        ++field3298;
        float[] var2 = this.field3574;
        float var3 = (float) (-this.field3639 * this.field3631) / (float) this.field3641;
        float var4 = (float) ((-this.field3639 + this.field3461) * this.field3631) / (float) this.field3641;
        float var5 = (float) (this.field3631 * this.field3599) / (float) this.field3626;
        float var6 = (float) ((-this.field3421 + this.field3599) * this.field3631) / (float) this.field3626;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field3631 * 2.0F;
            var2[4] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[1] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[15] = 0.0F;
            var2[11] = -1.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[10] = this.field3622 = (float) (-(this.field3631 + this.field3568)) / (float) (this.field3568 - this.field3631);
            var2[13] = 0.0F;
            var2[14] = this.field3596 = -((float) this.field3568 * var7) / (float) (this.field3568 - this.field3631);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[12] = 0.0F;
            var2[3] = 0.0F;
        } else {
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[8] = 0.0F;
            var2[0] = 1.0F;
            var2[6] = 0.0F;
            var2[12] = 0.0F;
            var2[15] = 1.0F;
            var2[3] = 0.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = 1.0F;
            var2[14] = 0.0F;
            var2[10] = 1.0F;
        }
        this.method1574(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V", line = 977)
    public final void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1592(25338);
        ++field3303;
        this.method1564(arg5, (byte) 96);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)V", line = 1010)
    private final void method1584(int arg0) {
        this.field3579 = (float) (this.field3568 - this.field3573) + -this.field3614;
        ++field3430;
        this.field3597 = this.field3579 - (float) this.field3625 * this.field3646;
        if (this.field3597 < (float) this.field3631) {
            this.field3597 = (float) this.field3631;
        }
        OpenGL.glFogf(2915, this.field3597);
        if (arg0 <= 120) {
            this.method552(47, -68, 48, (int[]) null);
        }
        OpenGL.glFogf(2916, this.field3579);
        class782.field10749[2] = (float) class519.method3018(this.field3657, 255) / 255.0F;
        class782.field10749[0] = (float) class519.method3018(this.field3657, 16711680) / 1.671168E7F;
        class782.field10749[1] = (float) class519.method3018(65280, this.field3657) / 65280.0F;
        OpenGL.glFogfv(2918, class782.field10749, 0);
    }

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)V", line = 1032)
    private final void method1585(int arg0) {
        ++field3401;
        float var2 = (float) (-this.field3639) * this.field3642 / (float) this.field3641;
        if (arg0 > -33) {
            this.method1616(36, true);
        }
        float var3 = (float) (-this.field3599) * this.field3642 / (float) this.field3626;
        float var4 = (float) (-this.field3639 + this.field3461) * this.field3642 / (float) this.field3641;
        float var5 = (float) (-this.field3599 + this.field3421) * this.field3642 / (float) this.field3626;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field3631, (double) this.field3568);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILvk;)V", line = 1056)
    public final void method1586(int arg0, class387 arg1) {
        ++field3398;
        if (arg0 != -19803) {
            this.field3530 = null;
        }
        if (~this.field3528 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field3528 >= 0) {
                this.field3529[this.field3528].method657((byte) -45);
            }
            this.field3526 = this.field3529[++this.field3528] = arg1;
            this.field3526.method668(682);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)I", line = 1075)
    public final int method1587(int arg0, byte arg1) {
        ++field3433;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                int var3 = -38 % (arg1 / 32);
                if (~arg0 != -5126 && arg0 != 5124 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!lf", name = "ya", descriptor = "()V", line = 1095)
    public final void method547() {
        this.method1572(false, true);
        ++field3315;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!lf", name = "GA", descriptor = "(I)V", line = 1106)
    public final void method493(int arg0) {
        ++field3341;
        this.method1564(0, (byte) 65);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "(I)V", line = 1118)
    private final void method1588(int arg0) {
        this.field3567 = new class205[this.field3569];
        ++field3405;
        this.field3576 = new class456(this, 3553, 6408, 1, 1);
        new class456(this, 3553, 6408, arg0, 1);
        new class456(this, 3553, 6408, 1, 1);
        this.field3582 = new class50(this);
        this.field3602 = new class50(this);
        this.field3661 = new class50(this);
        this.field3594 = new class50(this);
        this.field3612 = new class50(this);
        this.field3618 = new class50(this);
        this.field3658 = new class50(this);
        this.field3587 = new class50(this);
        this.field3634 = new class50(this);
        this.field3556 = new class50(this);
        if (this.field3652) {
            this.field3628 = new class82(this);
            new class82(this);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[Luaa;)V", line = 1154)
    public final void method481(int arg0, class127[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field3637[var3] = arg1[var3];
        }
        ++field3410;
        this.field3600 = arg0;
        if (~this.field3591 != -2) {
            this.method1571((byte) -83);
        }
    }

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "()Lal;", line = 1177)
    public final class109 method475() {
        ++field3360;
        return this.field3512;
    }

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "()Z", line = 1185)
    public final boolean method480() {
        ++field3391;
        return this.field3609 && (!this.method472() || this.field3635);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I", line = 1193)
    public final int method473(int arg0, int arg1) {
        ++field3395;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "(I)V", line = 1201)
    private final void method1589(int arg0) {
        if (this.field3555 && this.field3625 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 5703) {
            this.field3562 = null;
        }
        ++field3379;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()Lal;", line = 1217)
    public final class109 method444() {
        ++field3459;
        return this.field3545;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([IIIIIZ)Lhh;", line = 1225)
    public final class140 method462(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3505;
        return new class56(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(II)I", line = 1241)
    public final int method1590(int arg0, int arg1) {
        ++field3489;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && arg1 != 34846 && arg1 != 34844) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 != -6409 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (arg1 == 34842) {
                            return 8;
                        } else if (arg1 == 6402) {
                            return 3;
                        } else if (~arg1 == -6402) {
                            return 1;
                        } else {
                            int var3 = 111 % ((arg0 - -47) / 40);
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V", line = 1283)
    public final void method1591(byte arg0) {
        ++field3390;
        OpenGL.glLightfv(16384, 4611, this.field3552, 0);
        int var2 = 121 / ((arg0 - 56) / 39);
        OpenGL.glLightfv(16385, 4611, this.field3559, 0);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V", line = 1295)
    public final void method495(int arg0) {
        ++field3420;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "(I)V", line = 1306)
    private final void method1592(int arg0) {
        ++field3328;
        if (this.field3543 != 1) {
            this.method1638(arg0 ^ -25221);
            this.method1570((byte) 71, false);
            this.method1639(false, -8);
            this.method1593((byte) 29, false);
            this.method1572(false, false);
            this.method1595((byte) 95, (class205) null);
            this.method1580((byte) -52, -2);
            this.method1601(arg0 + 118, 1);
            this.field3543 = 1;
        }
        if (arg0 != 25338) {
            this.method505(-116);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(BZ)V", line = 1330)
    public final void method1593(byte arg0, boolean arg1) {
        ++field3447;
        if (arg0 != 29) {
            this.field3568 = -94;
        }
        if (this.field3548 != arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field3543 &= -32;
            this.field3548 = arg1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lvk;B)V", line = 1353)
    public final void method1594(class387 arg0, byte arg1) {
        if (arg1 > -5) {
            this.method1621(-123, 23, 99);
        }
        ++field3432;
        if (!this.field3564) {
            if (~this.field3527 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field3527 >= 0) {
                    this.field3523[this.field3527].method653(-7);
                }
                this.field3526 = this.field3524 = this.field3523[++this.field3527] = arg0;
                this.field3526.method662(false);
            }
        } else {
            this.method1586(-19803, arg0);
            this.method1636(0, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "(IIIIII[BII)V", line = 1386)
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3479;
        float var10;
        float var11;
        if (this.field3593 != null && this.field3593.field6523 >= arg2 && ~arg3 >= ~this.field3593.field6528) {
            this.field3593.method2707(arg6, 6406, 0, 0, 0, 0, true, false, arg3, arg2);
            var10 = (float) arg2 * this.field3593.field5834 / (float) this.field3593.field6523;
            var11 = (float) arg3 * this.field3593.field5836 / (float) this.field3593.field6528;
        } else {
            this.field3593 = class596.method3340(arg2, arg6, 6406, 3553, arg3, 6406, false, this);
            this.field3593.method2708((byte) -126, false, false);
            var10 = this.field3593.field5834;
            var11 = this.field3593.field5836;
        }
        this.method1598(-8556);
        this.method1595((byte) 87, this.field3593);
        this.method1564(arg8, (byte) 65);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1624(5634, arg5);
        this.method1630(34165, 34165, 109);
        this.method1600(17104, 34166, 0, 768);
        this.method1600(17104, 5890, 2, 770);
        this.method1581(770, 13112, 0, 34166);
        this.method1581(770, 13112, 2, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method1600(17104, 5890, 0, 768);
        this.method1600(17104, 34166, 2, 770);
        this.method1581(770, 13112, 0, 5890);
        this.method1581(770, 13112, 2, 34166);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;", line = 1447)
    public final class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3) {
        ++field3389;
        if (arg0 != null && arg1 != null && this.field3603 && this.field3652) {
            class1 var5 = null;
            class429 var6 = (class429) arg0;
            class429 var7 = (class429) arg1;
            class107 var8 = var6.method1(25155);
            class107 var9 = var7.method1(25155);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field1502 > ~var8.field1502 ? var8.field1502 : var9.field1502;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class1) {
                    class1 var11 = (class1) arg3;
                    if (var11.method2(false) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class1(this, var10);
                }
                if (var5.method3(var9, -123, var8, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1493)
    public class250(Canvas arg0, class161 arg1, int arg2) {
        super(arg1);
        new class26();
        new class184(16);
        this.field3533 = new class84();
        this.field3535 = new class84();
        this.field3536 = new class84();
        this.field3537 = new class84();
        this.field3538 = new class84();
        this.field3539 = new class84();
        this.field3540 = new class84();
        this.field3545 = new class584();
        this.field3550 = new class584();
        this.field3551 = new class584();
        this.field3573 = 0;
        this.field3584 = 1.0F;
        this.field3604 = -1;
        this.field3608 = 0;
        this.field3552 = new float[4];
        this.field3558 = 0;
        this.field3598 = -1.0F;
        this.field3607 = 0;
        this.field3574 = new float[16];
        this.field3559 = new float[4];
        this.field3599 = 0;
        this.field3626 = 512;
        this.field3570 = -1;
        this.field3617 = 0;
        this.field3605 = 3584.0F;
        this.field3610 = -1.0F;
        this.field3630 = false;
        this.field3581 = -1;
        this.field3568 = 3584;
        this.field3614 = 0.0F;
        this.field3648 = 0;
        this.field3625 = -1;
        this.field3642 = 1.0F;
        this.field3606 = new float[4];
        this.field3650 = 1.0F;
        this.field3651 = new float[4];
        this.field3646 = 1.0F;
        this.field3637 = new class127[class379.field5526];
        this.field3553 = 3584.0F;
        this.field3644 = 1.0F;
        this.field3595 = true;
        this.field3657 = -1;
        this.field3641 = 512;
        this.field3631 = 50;
        this.field3655 = 0;
        this.field3571 = 8448;
        this.field3654 = 8448;
        this.field3633 = -1.0F;
        this.field3656 = -1.0F;
        this.field3643 = 0;
        this.field3639 = 0;
        this.field3623 = new class453(8192);
        this.field3664 = new int[1];
        this.field3666 = new int[1];
        this.field3663 = new int[1];
        this.field3667 = new byte[16384];
        this.field3367 = this.field3311 = arg0;
        this.field3511 = arg2;
        if (!class289.method1854((byte) -105, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class289.method1854((byte) -122, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field3466 = new OpenGL();
                this.field3305 = this.field3470 = this.field3466.init(arg0, 8, 8, 8, 24, 0, this.field3511);
                if (this.field3470 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1645(false);
                    int var4 = this.method1641(6574);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field3660 = !this.field3561 ? 5121 : 33639;
                        if (this.field3624.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class684.method3748(-2242, this.field3624.replace('/', ' '), ' ');
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class398.method2429((byte) 56, var10.substring(1, 3))) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class398.method2429((byte) 55, var10.substring(0, 4))) {
                                                var5 = class469.method2750((byte) 68, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field3586 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field3572 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field3601 = false;
                            }
                            this.field3616 &= this.field3466.method3610("GL_ARB_half_float_pixel");
                            this.field3647 = true;
                            this.field3566 = this.field3572;
                        }
                        if (~this.field3562.indexOf("intel") != 0) {
                            this.field3652 = false;
                        }
                        this.field3578 = !this.field3562.equals("s3 graphics");
                        if (this.field3572) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class96.method761(true, true, false);
                        this.field3520 = true;
                        this.field3510 = new class771(this, super.field913);
                        this.method1588(1);
                        this.field3516 = new class131(this);
                        this.field3494 = new class759(this);
                        if (this.field3494.method4168(120)) {
                            this.field3502 = new class670(this);
                            if (!this.field3502.method3696(256)) {
                                this.field3502.method1310(-23544);
                                this.field3502 = null;
                            }
                        }
                        this.field3496 = new class312(this);
                        this.method1603(-1);
                        this.method1644(0);
                        this.method482();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method476();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "(IIIIIII)I", line = 1643)
    public final int method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3383;
        float var8 = (float) arg2 * this.field3545.field7955 + (float) arg0 * this.field3545.field7953 + (float) arg1 * this.field3545.field7963 + this.field3545.field7956;
        float var9 = (float) arg5 * this.field3545.field7955 + (float) arg3 * this.field3545.field7953 + (float) arg4 * this.field3545.field7963 + this.field3545.field7956;
        int var10 = 0;
        if (var8 < (float) this.field3631 && (float) this.field3631 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field3568 && (float) this.field3568 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3545.field7934 + (float) arg0 * this.field3545.field7950 + (float) arg1 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3545.field7934 + (float) arg3 * this.field3545.field7950 + (float) arg4 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / (float) arg6);
        if ((float) var11 < this.field3611 && this.field3611 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field3627 && this.field3627 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3545.field7932 + (float) arg0 * this.field3545.field7929 + (float) arg1 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3545.field7932 + (float) arg3 * this.field3545.field7929 + (float) arg4 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / (float) arg6);
        if ((float) var13 < this.field3590 && (float) var14 < this.field3590) {
            var10 |= 4;
        } else if ((float) var13 > this.field3613 && this.field3613 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLru;)V", line = 1691)
    public final void method1595(byte arg0, class205 arg1) {
        ++field3340;
        if (arg0 < 70) {
            this.field3522 = null;
        }
        class205 var3 = this.field3567[this.field3577];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2649);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field2649);
                } else if (arg1.field2649 != var3.field2649) {
                    OpenGL.glDisable(var3.field2649);
                    OpenGL.glEnable(arg1.field2649);
                }
                OpenGL.glBindTexture(arg1.field2649, arg1.method1346((byte) 86));
            }
            this.field3567[this.field3577] = arg1;
        }
        this.field3543 &= -2;
    }

    @OriginalMember(owner = "client!lf", name = "EA", descriptor = "(IIII)V", line = 1737)
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        ++field3319;
        if (!this.field3638) {
            throw new RuntimeException("");
        } else {
            this.field3570 = arg1;
            this.field3648 = arg3;
            this.field3620 = arg0;
            this.field3581 = arg2;
            if (this.field3630) {
                this.field3496.field4417.method2746(34820);
                this.field3496.field4417.method2747((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "()Z", line = 1761)
    public final boolean method538() {
        ++field3431;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "(I)V", line = 1769)
    private final void method1596(int arg0) {
        ++field3509;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field3574, 0);
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "(I)V", line = 1785)
    private final void method1597(int arg0) {
        if (this.field3585) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3585 = false;
        }
        ++field3358;
        if (arg0 != 5888) {
            this.field3572 = true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lgl;IIII)Lka;", line = 1807)
    public final class497 method484(class625 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3407;
        return new class50(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 1815)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3416;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            class756 var13 = (class756) arg6;
            class411 var14 = var13.field10228;
            this.method1598(-8556);
            this.method1595((byte) 109, var13.field10228);
            this.method1564(arg5, (byte) 91);
            this.method1630(7681, 8448, 106);
            this.method1600(17104, 34167, 0, 768);
            float var15 = var14.field5834 / (float) var14.field5837;
            float var16 = var14.field5836 / (float) var14.field5830;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg10 - -arg9);
            float var21 = var18 * var19;
            float var22 = var17 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~var20 >= ~arg9) {
                var28 = (float) (-var20 + arg9) * var21;
                var27 = (float) (-var20 + arg9) * var22;
            } else {
                var25 = (float) (arg9 + arg10 - var20) * var22;
                var26 = (float) (arg9 + arg10 - var20) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (~arg2 >= ~arg0) {
                    if (var29 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 > ~arg3) {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method1600(17104, 5890, 0, 768);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "()Z", line = 1941)
    public final boolean method455() {
        ++field3462;
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "XA", descriptor = "()I", line = 1950)
    public final int method469() {
        ++field3380;
        return this.field3568;
    }

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "(I)V", line = 1960)
    public final void method1598(int arg0) {
        if (~this.field3543 != -3) {
            this.method1638(arg0 ^ 8468);
            this.method1570((byte) 76, false);
            this.method1639(false, -8);
            this.method1593((byte) 29, false);
            this.method1572(false, false);
            this.method1580((byte) -52, -2);
            this.field3543 = 2;
        }
        if (arg0 != -8556) {
            this.field3574 = null;
        }
        ++field3442;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 1984)
    public final void method546(Canvas arg0, int arg1, int arg2) {
        ++field3478;
        long var4 = 0L;
        if (arg0 != null && this.field3311 != arg0) {
            if (this.field3334.containsKey(arg0)) {
                Long var6 = (Long) this.field3334.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field3470;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field3466.surfaceResized(var4);
            if (this.field3367 == arg0) {
                this.method1644(0);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2013)
    public final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
        ++field3320;
        class756 var10 = (class756) arg6;
        class411 var11 = var10.field10228;
        this.method1598(-8556);
        this.method1595((byte) 87, var10.field10228);
        this.method1564(arg5, (byte) 117);
        this.method1630(7681, 8448, 106);
        this.method1600(17104, 34167, 0, 768);
        float var12 = var11.field5834 / (float) var11.field5837;
        float var13 = var11.field5836 / (float) var11.field5830;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method1600(17104, 5890, 0, 768);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lcj;)V", line = 2051)
    public final void method440(class720 arg0) {
        ++field3408;
        this.field3653 = (class429) arg0;
    }

    @OriginalMember(owner = "client!lf", name = "ZA", descriptor = "(IFFFFF)V", line = 2059)
    public final void method555(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3333;
        boolean var7 = ~this.field3604 != ~arg0;
        if (var7 || this.field3656 != arg1 || this.field3610 != arg2) {
            this.field3656 = arg1;
            this.field3610 = arg2;
            this.field3604 = arg0;
            if (var7) {
                this.field3644 = (float) (this.field3604 & 255) / 255.0F;
                this.field3584 = (float) (65280 & this.field3604) / 65280.0F;
                this.field3650 = (float) (this.field3604 & 16711680) / 1.671168E7F;
                this.method1562((byte) -58);
            }
            this.method1614((byte) -100);
        }
        if (this.field3606[0] != arg3 || this.field3606[1] != arg4 || this.field3606[2] != arg5) {
            this.field3606[0] = arg3;
            this.field3606[1] = arg4;
            this.field3606[2] = arg5;
            this.field3651[1] = -arg4;
            this.field3651[0] = -arg3;
            this.field3651[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3552[2] = arg5 * var8;
            this.field3552[1] = arg4 * var8;
            this.field3552[0] = arg3 * var8;
            this.field3559[2] = -this.field3552[2];
            this.field3559[0] = -this.field3552[0];
            this.field3559[1] = -this.field3552[1];
            this.method1591((byte) -11);
            this.field3557 = (int) (arg3 * 256.0F / arg4);
            this.field3563 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lpo;I)V", line = 2110)
    public final void method1599(class584 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method3286(arg1 + -114), arg1);
        ++field3483;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 2120)
    public final void method442(int arg0) {
        ++field3330;
    }

    @OriginalMember(owner = "client!lf", name = "DA", descriptor = "(IIII)V", line = 2128)
    public final void method436(int arg0, int arg1, int arg2, int arg3) {
        ++field3424;
        this.field3626 = arg3;
        this.field3639 = arg0;
        this.field3599 = arg1;
        this.field3641 = arg2;
        this.method1583(false);
        this.method1625(5126);
        if (~this.field3591 != -4) {
            if (this.field3591 == 2) {
                this.method1596(5888);
                return;
            }
        } else {
            this.method1585(-37);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(IIII)V", line = 2150)
    public final void method1600(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg2, arg1);
        if (arg0 != 17104) {
            this.field3535 = null;
        }
        ++field3469;
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg3);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltv;I)V", line = 2163)
    public final void method524(class586 arg0, int arg1) {
        this.field3498.method3403(-24125, this, arg0, arg1);
        ++field3436;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 2171)
    public final void method470(boolean arg0) {
        ++field3427;
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)V", line = 2178)
    public final void method1601(int arg0, int arg1) {
        ++field3384;
        if (arg0 != 25456) {
            this.field3616 = true;
        }
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.method1630(260, 8448, arg0 + -25350);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.method1630(34023, 34023, arg0 + -25337);
                        return;
                    }
                } else {
                    this.method1630(34165, 7681, 92);
                }
            } else {
                this.method1630(8448, 8448, 115);
            }
        } else {
            this.method1630(7681, 7681, 121);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Leb;[Lvf;Z)Lda;", line = 2207)
    public final class67 method502(class651 arg0, class162[] arg1, boolean arg2) {
        ++field3460;
        return new class185(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIID)V", line = 2215)
    public final void method499(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field3492;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIF)Luaa;", line = 2222)
    public final class127 method551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3418;
        return new class789(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "()[I", line = 2239)
    public final int[] method532() {
        ++field3434;
        return new int[] { this.field3639, this.field3599, this.field3641, this.field3626 };
    }

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "()Z", line = 2247)
    public final boolean method510() {
        ++field3429;
        if (this.field3502 != null) {
            if (!this.field3502.method1319(0)) {
                if (!this.field3494.method4178(this.field3502, -1)) {
                    return false;
                }
                this.field3510.method4241(70);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "()V", line = 2272)
    public final void method476() {
        ++field3369;
        for (class159 var1 = this.field3514.method679((byte) -86); var1 != null; var1 = this.field3514.method681(-68)) {
            ((class356) var1).method2260(119);
        }
        if (this.field3494 != null) {
            this.field3494.method4172(2);
        }
        if (this.field3466 != null) {
            this.method1607((byte) 121);
            Enumeration var2 = this.field3334.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3334.get(var3);
                this.field3466.releaseSurface(var3, var4);
            }
            this.field3466.release();
            this.field3466 = null;
        }
        if (this.field3520) {
            class186.method1251(false, true, (byte) -80);
            this.field3520 = false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "na", descriptor = "(IIII)[I", line = 2317)
    public final int[] method439(int arg0, int arg1, int arg2, int arg3) {
        ++field3388;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field3421 - arg1 + -var6, arg2, 1, 32993, this.field3660, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(Z)V", line = 2338)
    private final void method1602(boolean arg0) {
        if (arg0) {
            OpenGL.glViewport(this.field3558, this.field3607, this.field3461, this.field3421);
            ++field3400;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)Lhh;", line = 2349)
    public final class140 method488(int arg0, int arg1, boolean arg2) {
        ++field3409;
        return new class56(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFF)V", line = 2357)
    public final void method549(float arg0, float arg1, float arg2) {
        ++field3406;
        class573.field7816 = arg2;
        class425.field6186 = arg1;
        class501.field7017 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "(I)V", line = 2376)
    private final void method1603(int arg0) {
        ++field3419;
        this.method1580((byte) -52, -2);
        for (int var2 = this.field3569 - 1; var2 >= 0; --var2) {
            this.method1631(var2, arg0 + 15);
            this.method1595((byte) 75, (class205) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1630(8448, 8448, 106);
        this.method1600(17104, 34168, 2, 770);
        this.method1597(5888);
        this.field3547 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field3542 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field3546 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field3549 = true;
        this.method1570((byte) 79, true);
        this.method1639(true, -8);
        this.method1593((byte) 29, true);
        this.method1572(false, true);
        this.method1575((byte) -112);
        this.field3466.setSwapInterval(0);
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
        this.field3604 = this.field3657 = arg0;
        this.method526();
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(Z)V", line = 2445)
    public final void method1604(boolean arg0) {
        ++field3351;
        if (this.field3543 != 8) {
            this.method1610(81);
            this.method1570((byte) 65, true);
            this.method1593((byte) 29, true);
            this.method1572(false, true);
            this.method1564(1, (byte) 54);
            this.field3543 = 8;
        }
        if (arg0) {
            this.method1567((class387) null, -58);
        }
    }

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "(IIIII)V", line = 2466)
    public final void method451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3318;
        this.method1592(25338);
        this.method1564(arg4, (byte) 40);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(B)V", line = 2486)
    public final void method1605(byte arg0) {
        ++field3500;
        if (arg0 <= -21) {
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lvk;I)V", line = 2499)
    public final void method1606(class387 arg0, int arg1) {
        ++field3299;
        if (~this.field3528 <= -1 && this.field3529[this.field3528] == arg0) {
            if (arg1 > -114) {
                this.method504(54, -6, (int[]) null, (int[]) null);
            }
            this.field3529[this.field3528--] = null;
            arg0.method657((byte) -45);
            if (~this.field3528 > -1) {
                this.field3526 = null;
            } else {
                this.field3526 = this.field3529[this.field3528];
                this.field3526.method668(682);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(B)V", line = 2523)
    private final void method1607(byte arg0) {
        if (arg0 <= 99) {
            this.field3590 = -0.09493439F;
        }
        ++field3417;
        this.field3466.method3611();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZIZ)V", line = 2535)
    public final void method1608(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (this.field3615 != arg0 || !this.field3630 == this.field3638) {
            class456 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field3638 ? 3 : 0;
            if (arg0 < 0) {
                this.method1597(arg2 ^ 5888);
            } else {
                var5 = this.field3510.method4240(2, arg0);
                class577 var10 = super.field913.method1114(arg0, -98);
                if (~var10.field7861 == -1 && var10.field7852 == 0) {
                    this.method1597(arg2 + 5888);
                } else {
                    int var11 = var10.field7853 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method1566((float) (this.field3519 % var12 * var10.field7852) / (float) var12, 0.0F, 3382, (float) (this.field3519 % var12 * var10.field7861) / (float) var12);
                }
                var6 = var10.field7869;
                if (!this.field3638) {
                    var8 = var10.field7876;
                    var7 = var10.field7867;
                    var9 = var10.field7855;
                }
            }
            this.field3496.method2005(var8, arg1, var9, var7, arg3, arg2 ^ -10);
            if (!this.field3496.method2003(var6, var5, 0)) {
                this.method1595((byte) 127, var5);
                this.method1601(25456, var6);
            }
            this.field3615 = arg0;
            this.field3630 = this.field3638;
        }
        ++field3475;
        this.field3543 &= -8;
        if (arg2 != 0) {
            this.method514();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLvk;)V", line = 2599)
    public final void method1609(byte arg0, class387 arg1) {
        int var3 = 44 / ((5 - arg0) / 60);
        ++field3396;
        if (~this.field3521 <= -1 && this.field3530[this.field3521] == arg1) {
            this.field3530[this.field3521--] = null;
            arg1.method666(false);
            if (this.field3521 < 0) {
                this.field3524 = null;
            } else {
                this.field3524 = this.field3530[this.field3521];
                this.field3524.method664(false);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "(I)V", line = 2626)
    private final void method1610(int arg0) {
        int var2 = 1 % ((arg0 - -32) / 55);
        if (this.field3591 != 2) {
            this.field3591 = 2;
            this.method1596(5888);
            this.method1611(-104);
            this.field3543 &= -8;
        }
        ++field3508;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lal;)V", line = 2646)
    public final void method509(class109 arg0) {
        this.field3545.method816(arg0);
        ++field3413;
        this.field3550.method816(this.field3545);
        this.field3550.method3289(7540);
        this.field3551.method3292(this.field3550, (byte) 95);
        if (~this.field3591 != -2) {
            this.method1611(-38);
        }
    }

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "(I)V", line = 2663)
    private final void method1611(int arg0) {
        ++field3323;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field3550.method3286(-98), 0);
        int var2 = 49 % ((arg0 - 42) / 56);
        if (this.field3630) {
            this.field3496.field4417.method2746(34820);
        }
        this.method1591((byte) 121);
        this.method1571((byte) 99);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lrr;", line = 2679)
    public final class381 method437(int arg0, int arg1) {
        ++field3490;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lza;", line = 2692)
    public final class434 method478(int arg0) {
        ++field3457;
        class356 var2 = new class356(arg0);
        this.field3514.method689(var2, -119);
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "(I)V", line = 2703)
    public final void method1612(int arg0) {
        if (this.field3543 != arg0) {
            this.method1576(87);
            this.method1570((byte) 69, true);
            this.method1593((byte) 29, true);
            this.method1572(false, true);
            this.method1564(1, (byte) 70);
            this.field3543 = 16;
        }
        ++field3375;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLot;)V", line = 2722)
    public final void method1613(byte arg0, class615 arg1) {
        ++field3312;
        if (this.field3645 != arg1) {
            if (this.field3572) {
                OpenGL.glBindBufferARB(34962, arg1.method3415(101));
            }
            this.field3645 = arg1;
        }
        int var3 = -43 / ((arg0 - 6) / 52);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2739)
    public final void method543(Canvas arg0) {
        ++field3371;
        if (this.field3311 == arg0) {
            throw new RuntimeException();
        } else if (this.field3334.containsKey(arg0)) {
            Long var2 = (Long) this.field3334.get(arg0);
            this.field3466.releaseSurface(arg0, var2);
            this.field3334.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "()V", line = 2763)
    public final void method490() {
        ++field3355;
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(B)V", line = 2772)
    private final void method1614(byte arg0) {
        class782.field10749[1] = this.field3656 * this.field3584;
        class782.field10749[2] = this.field3656 * this.field3644;
        class782.field10749[3] = 1.0F;
        if (arg0 == -100) {
            class782.field10749[0] = this.field3656 * this.field3650;
            ++field3297;
            OpenGL.glLightfv(16384, 4609, class782.field10749, 0);
            class782.field10749[2] = -this.field3610 * this.field3644;
            class782.field10749[3] = 1.0F;
            class782.field10749[0] = -this.field3610 * this.field3650;
            class782.field10749[1] = -this.field3610 * this.field3584;
            OpenGL.glLightfv(16385, 4609, class782.field10749, 0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "la", descriptor = "()V", line = 2796)
    public final void method526() {
        ++field3346;
        this.field3643 = this.field3421;
        this.field3608 = 0;
        this.field3617 = this.field3461;
        this.field3655 = 0;
        OpenGL.glDisable(3089);
        this.method1625(5126);
    }

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "()V", line = 2811)
    public final void method511() {
        if (this.field3502 != null && this.field3502.method1319(0)) {
            this.field3494.method4169(this.field3502, 16383);
            this.field3510.method4241(50);
        }
        ++field3368;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 2826)
    public final void method505(int arg0) {
        this.method1645(false);
        ++field3441;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V", line = 2834)
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        ++field3337;
        this.field3494.method4173(arg1, arg2, arg0, 120, arg3);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BIZII)Lvv;", line = 2845)
    public final class343 method1615(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.field3466 = null;
        }
        ++field3387;
        return (class343) (!this.field3572 || arg2 && !this.field3566 ? new class561(this, arg1, arg0, arg4) : new class260(this, arg1, arg0, arg4, arg2));
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "()Z", line = 2861)
    public final boolean method458() {
        ++field3314;
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V", line = 2872)
    public final void method1616(int arg0, boolean arg1) {
        if (arg0 != 875882616) {
            this.method1632((byte) 118);
        }
        ++field3411;
        if (this.field3640 != arg1) {
            this.field3640 = arg1;
            this.method1632((byte) -127);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 2894)
    public final class295 method516(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3365;
        return new class34(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FFI)V", line = 2903)
    public final void method1617(float arg0, float arg1, int arg2) {
        if (arg2 != 34161) {
            this.method1642(48);
        }
        ++field3480;
        this.field3614 = arg0;
        this.field3646 = arg1;
        this.method1584(arg2 + -34035);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I)Laa;", line = 2916)
    public final class512 method504(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3335;
        return class90.method716(arg0, 0, arg1, this, arg3, arg2);
    }

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "(III)V", line = 2926)
    public final void method540(int arg0, int arg1, int arg2) {
        ++field3443;
        if (~this.field3657 != ~arg0 || this.field3625 != arg1 || this.field3573 != arg2) {
            this.field3657 = arg0;
            this.field3573 = arg2;
            this.field3625 = arg1;
            this.method1584(127);
            this.method1589(5703);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V", line = 2944)
    public final synchronized void method1618(byte arg0, int arg1, int arg2) {
        ++field3357;
        class445 var4 = new class445(arg2);
        var4.field2146 = (long) arg1;
        if (arg0 != -63) {
            this.method1581(89, -45, 45, -19);
        }
        this.field3538.method689(var4, -75);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "()Z", line = 2958)
    public final boolean method459() {
        ++field3484;
        return this.field3496.method2007(3, 9);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 2967)
    public final void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283 {
        this.method471(arg2, arg3);
        ++field3438;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjaclib/memory/Buffer;IZB)Lot;", line = 2980)
    public final class615 method1619(int arg0, Buffer arg1, int arg2, boolean arg3, byte arg4) {
        ++field3446;
        if (arg4 != -49) {
            return null;
        } else {
            return (class615) (!this.field3572 || arg3 && !this.field3566 ? new class631(this, arg2, arg1) : new class616(this, arg2, arg1, arg0, arg3));
        }
    }

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "()V", line = 2997)
    public final void method514() {
        ++field3440;
        if (!this.field3652) {
            if (!this.field3565) {
                throw new RuntimeException("");
            }
            this.field3525.method341(0, 0, this.field3461, this.field3421, 0, 0);
            this.field3466.setSurface(this.field3305);
        } else {
            if (this.field3522 != this.field3524) {
                throw new RuntimeException();
            }
            this.field3522.method661((byte) 12, 0);
            this.field3522.method661((byte) 12, 8);
            this.method1567(this.field3522, -90);
        }
        this.field3461 = this.field3329;
        this.field3525 = null;
        this.field3421 = this.field3473;
        this.method1575((byte) -108);
        this.method1602(true);
        this.method526();
    }

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "()I", line = 3029)
    public final int method445() {
        ++field3342;
        int var1 = this.field3668;
        this.field3668 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIZ)Lhh;", line = 3040)
    public final class140 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3326;
        return new class56(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "(I)V", line = 3049)
    public final void method1620(int arg0) {
        OpenGL.glPushMatrix();
        int var2 = 88 / ((-14 - arg0) / 47);
        ++field3488;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V", line = 3060)
    public final void method1621(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            this.field3607 = arg2;
            ++field3338;
            this.field3558 = arg1;
            this.method1602(true);
            this.method1582(4609);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FB)V", line = 3075)
    public final void method1622(float arg0, byte arg1) {
        ++field3399;
        if (this.field3642 != arg0) {
            this.field3642 = arg0;
            if (~this.field3591 == -4) {
                this.method1585(arg1 ^ -4);
            }
        }
        if (arg1 != 51) {
            method1579(-53, 83, 120, -79, -40, (byte) 66, -33, -7, -78, 4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 3095)
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method1592(25338);
        ++field3321;
        this.method1564(arg12, (byte) 82);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lf", name = "ra", descriptor = "(IIII)V", line = 3114)
    public final void method550(int arg0, int arg1, int arg2, int arg3) {
        this.field3638 = true;
        this.field3648 = arg3;
        this.field3570 = arg1;
        this.field3620 = arg0;
        ++field3347;
        this.field3581 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IIIIII)Lcj;", line = 3131)
    public final class720 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3349;
        return this.field3603 ? new class479(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILpo;)V", line = 3139)
    public final void method1623(int arg0, class584 arg1) {
        OpenGL.glPushMatrix();
        ++field3439;
        OpenGL.glMultMatrixf(arg1.method3286(arg0 ^ -118), arg0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lio;Lrr;)Lhg;", line = 3148)
    public final class718 method461(class461 arg0, class381 arg1) {
        ++field3452;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "xa", descriptor = "(F)V", line = 3156)
    public final void method468(float arg0) {
        ++field3477;
        if (this.field3583 != arg0) {
            this.field3583 = arg0;
            this.method1562((byte) -58);
        }
    }

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)V", line = 3172)
    public final void method1624(int arg0, int arg1) {
        class782.field10749[3] = (float) (arg1 >>> 24) / 255.0F;
        class782.field10749[1] = (float) class519.method3018(65280, arg1) / 65280.0F;
        ++field3464;
        if (arg0 != 5634) {
            this.field3623 = null;
        }
        class782.field10749[2] = (float) class519.method3018(255, arg1) / 255.0F;
        class782.field10749[0] = (float) class519.method3018(16711680, arg1) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class782.field10749, 0);
    }

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "(I)V", line = 3187)
    private final void method1625(int arg0) {
        ++field3458;
        if (arg0 == 5126) {
            this.field3611 = (float) (-this.field3639 + this.field3655);
            this.field3613 = (float) (-this.field3599 + this.field3643);
            this.field3590 = (float) (-this.field3599 + this.field3608);
            this.field3627 = (float) (-this.field3639 + this.field3617);
        }
    }

    @OriginalMember(owner = "client!lf", name = "aa", descriptor = "(IIIIII)V", line = 3203)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3313;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1592(25338);
        float var10 = (float) arg3 + var8;
        this.method1564(arg5, (byte) 110);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3609) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3609) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "(II)I", line = 3244)
    public final int method1626(int arg0, int arg1) {
        ++field3481;
        if (arg0 == 1) {
            return 7681;
        } else if (~arg0 == -1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else if (arg0 == 3) {
            return 260;
        } else if (~arg0 == -5) {
            return 34023;
        } else {
            int var3 = -102 % ((-74 - arg1) / 49);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII)V", line = 3280)
    public final void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3356;
        this.method487(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "()Z", line = 3292)
    public final boolean method460() {
        ++field3310;
        return this.field3502 != null && (~this.field3511 >= -2 || this.field3635);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IFFFF)V", line = 3302)
    public final void method1627(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class782.field10749[0] = arg4;
        class782.field10749[3] = arg3;
        class782.field10749[1] = arg2;
        class782.field10749[2] = arg1;
        ++field3322;
        if (arg0 == 21315) {
            OpenGL.glTexEnvfv(8960, 8705, class782.field10749, 0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V", line = 3318)
    public final void method1628(boolean arg0, int arg1, int arg2) {
        if (arg1 == 24166) {
            ++field3348;
            this.method1608(arg2, true, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(IIIIII)V", line = 3335)
    public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3316;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method1592(25338);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1564(arg5, (byte) 58);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3609) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3609) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Lio;", line = 3367)
    public final class461 method498(int arg0, int arg1) {
        ++field3354;
        return null;
    }

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "(I)V", line = 3375)
    private final void method1629(int arg0) {
        ++field3445;
        int var2 = 69 % ((arg0 - 64) / 33);
        OpenGL.glDepthMask(this.field3544 && this.field3595);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)V", line = 3387)
    public final void method1630(int arg0, int arg1, int arg2) {
        if (~this.field3577 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field3571 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field3571 = arg0;
            }
            if (this.field3654 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field3654 = arg1;
                var4 = true;
            }
            if (var4) {
                this.field3543 &= -30;
            }
        }
        ++field3343;
        if (arg2 <= 89) {
            this.method1613((byte) -54, (class615) null);
        }
    }

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "()Z", line = 3433)
    public final boolean method503() {
        ++field3344;
        return false;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lza;)V", line = 3446)
    public final void method501(class434 arg0) {
        this.field3518 = ((class356) arg0).field5190;
        ++field3339;
        if (this.field3629 == null) {
            class453 var2 = new class453(80);
            if (!this.field3561) {
                var2.method2693(-1.0F, -1001058736);
                var2.method2693(-1.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(-1.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(-1.0F, -1001058736);
                var2.method2693(1.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
                var2.method2693(0.0F, -1001058736);
            } else {
                var2.method2692(-128, -1.0F);
                var2.method2692(-117, -1.0F);
                var2.method2692(-108, 0.0F);
                var2.method2692(-71, 0.0F);
                var2.method2692(-103, 1.0F);
                var2.method2692(-104, 1.0F);
                var2.method2692(-112, -1.0F);
                var2.method2692(-95, 0.0F);
                var2.method2692(-121, 1.0F);
                var2.method2692(-100, 1.0F);
                var2.method2692(-62, 1.0F);
                var2.method2692(-86, 1.0F);
                var2.method2692(-61, 0.0F);
                var2.method2692(-108, 1.0F);
                var2.method2692(-119, 0.0F);
                var2.method2692(-98, -1.0F);
                var2.method2692(-71, 1.0F);
                var2.method2692(-102, 0.0F);
                var2.method2692(-105, 0.0F);
                var2.method2692(-97, 0.0F);
            }
            this.field3629 = this.method1578((byte) 61, var2.field3725, false, var2.field3789, 20);
            this.field3619 = new class135(this.field3629, 5126, 3, 0);
            this.field3580 = new class135(this.field3629, 5126, 2, 12);
            this.field3498.method3406(this, -122);
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 3512)
    public final void method528(int arg0) {
        ++field3414;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field3507 = arg0;
            this.field3510.method4241(42);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "(II)V", line = 3525)
    public final void method1631(int arg0, int arg1) {
        int var3 = 67 % ((-32 - arg1) / 34);
        if (~this.field3577 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field3577 = arg0;
        }
        ++field3482;
    }

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "(B)V", line = 3540)
    private final void method1632(byte arg0) {
        if (arg0 <= -52) {
            if (this.field3621 && !this.field3640) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field3392;
        }
    }

    @OriginalMember(owner = "client!lf", name = "za", descriptor = "(IIIII)V", line = 3555)
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field3415;
        if (arg0 + arg2 >= this.field3655 && ~this.field3617 <= ~(-arg2 + arg0) && ~(arg1 + arg2) <= ~this.field3608 && -arg2 + arg1 <= this.field3643) {
            this.method1592(25338);
            this.method1564(arg4, (byte) 108);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field3633) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field3598 >= (float) var8) {
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
                if (var9 <= 64) {
                    var9 = 64;
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class263.method1773(32051, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class311.field4399[var11] * (float) arg2 + var6, class311.field4400[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)V", line = 3629)
    public final void method518(int arg0, int arg1) {
        ++field3422;
        if (this.field3631 != arg0 || this.field3568 != arg1) {
            this.field3631 = arg0;
            this.field3568 = arg1;
            this.method1583(false);
            this.method1584(122);
            if (~this.field3591 != -4) {
                if (~this.field3591 == -3) {
                    this.method1596(5888);
                    return;
                }
            } else {
                this.method1585(-64);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JIII)V", line = 3654)
    public static final void method1633(long arg0, int arg1, int arg2, int arg3) {
        ++field3493;
        int var5 = (int) arg0 >> 14 & 31;
        int var6 = (int) arg0 >> 20 & 3;
        if (arg3 != 0) {
            field3454 = 104;
        }
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (~var5 != -11 && ~var5 != -12 && ~var5 != -23) {
            class307.method1985(var5, arg1, 0, 0, var6, true, 0, arg2, true);
        } else {
            class412 var8 = class210.field2705.method1362(0, var7);
            int var9;
            int var10;
            if (~var6 != -1 && ~var6 != -3) {
                var9 = var8.field5851;
                var10 = var8.field5853;
            } else {
                var9 = var8.field5853;
                var10 = var8.field5851;
            }
            int var11 = var8.field5930;
            if (var6 != 0) {
                var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
            }
            class307.method1985(0, arg1, var9, var10, 0, true, var11, arg2, true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([I)V", line = 3699)
    public final void method447(int[] arg0) {
        arg0[1] = this.field3421;
        ++field3468;
        arg0[0] = this.field3461;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)I", line = 3709)
    public final int method520(int arg0, int arg1) {
        ++field3403;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V", line = 3717)
    public final void method471(int arg0, int arg1) throws class283 {
        try {
            this.field3466.swapBuffers();
        } catch (Exception var3) {
        }
        ++field3309;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lut;Lut;Lut;Lut;B)V", line = 3734)
    public final void method1634(class135 arg0, class135 arg1, class135 arg2, class135 arg3, byte arg4) {
        ++field3317;
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method1613((byte) -123, arg1.field1837);
            OpenGL.glVertexPointer(arg1.field1838, arg1.field1839, this.field3645.method3414(false), this.field3645.method3416(false) - -((long) arg1.field1835));
            OpenGL.glEnableClientState(32884);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method1613((byte) 71, arg3.field1837);
            OpenGL.glNormalPointer(arg3.field1839, this.field3645.method3414(false), this.field3645.method3416(false) - -((long) arg3.field1835));
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method1613((byte) -93, arg2.field1837);
            OpenGL.glColorPointer(arg2.field1838, arg2.field1839, this.field3645.method3414(false), this.field3645.method3416(false) - -((long) arg2.field1835));
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method1613((byte) 62, arg0.field1837);
            OpenGL.glTexCoordPointer(arg0.field1838, arg0.field1839, this.field3645.method3414(false), this.field3645.method3416(false) - -((long) arg0.field1835));
            OpenGL.glEnableClientState(32888);
        }
        if (arg4 != 11) {
            this.method503();
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltv;)V", line = 3781)
    public final void method534(class586 arg0) {
        ++field3352;
        this.field3498.method3403(-24125, this, arg0, -1);
    }

    @OriginalMember(owner = "client!lf", name = "KA", descriptor = "(IIII)V", line = 3791)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field3465;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field3461 < arg2) {
            arg2 = this.field3461;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~this.field3421 > ~arg3) {
            arg3 = this.field3421;
        }
        this.field3655 = arg0;
        this.field3608 = arg1;
        this.field3617 = arg2;
        this.field3643 = arg3;
        OpenGL.glEnable(3089);
        this.method1625(5126);
        this.method1582(4609);
    }

    @OriginalMember(owner = "client!lf", name = "pa", descriptor = "()V", line = 3822)
    public final void method500() {
        ++field3504;
        this.field3638 = false;
    }

    @OriginalMember(owner = "client!lf", name = "da", descriptor = "(III[I)V", line = 3834)
    public final void method530(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3472;
        float var5 = (float) arg2 * this.field3545.field7955 + (float) arg0 * this.field3545.field7953 + (float) arg1 * this.field3545.field7963 + this.field3545.field7956;
        if (!((float) this.field3631 > var5) && !((float) this.field3568 < var5)) {
            int var6 = (int) (((float) arg2 * this.field3545.field7934 + (float) arg0 * this.field3545.field7950 + (float) arg1 * this.field3545.field7951 + this.field3545.field7952) * (float) this.field3641 / var5);
            int var7 = (int) (((float) arg2 * this.field3545.field7932 + (float) arg0 * this.field3545.field7929 + (float) arg1 * this.field3545.field7927 + this.field3545.field7940) * (float) this.field3626 / var5);
            if (this.field3611 <= (float) var6 && (float) var6 <= this.field3627 && this.field3590 <= (float) var7 && this.field3613 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field3590);
                arg3[0] = (int) ((float) var6 + -this.field3611);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "(IIIII)V", line = 3866)
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1592(25338);
        ++field3306;
        this.method1564(arg4, (byte) 118);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "()Lal;", line = 3888)
    public final class109 method541() {
        ++field3463;
        return new class584();
    }

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "(II)I", line = 3896)
    public static int method1635(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILvk;)V", line = 3907)
    public final void method1636(int arg0, class387 arg1) {
        ++field3300;
        if (this.field3521 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg0 <= this.field3521) {
                this.field3530[this.field3521].method666(false);
            }
            this.field3524 = this.field3530[++this.field3521] = arg1;
            this.field3524.method664(false);
        }
    }

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "()I", line = 3933)
    public final int method489() {
        ++field3301;
        return 4;
    }

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "(I)V", line = 3941)
    public static void method1637(int arg0) {
        field3486 = null;
        field3412 = null;
        field3453 = null;
        if (arg0 != 29406) {
            method1633(75L, 100, 86, 91);
        }
    }

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "()Ldca;", line = 3955)
    public final class189 method542() {
        ++field3455;
        int var1 = -1;
        if (~this.field3562.indexOf("nvidia") == 0) {
            if (~this.field3562.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (~this.field3562.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class189(var1, "OpenGL", this.field3632, this.field3624, 0L);
    }

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "(ILaa;II)V", line = 3979)
    public final void method449(int arg0, class512 arg1, int arg2, int arg3) {
        ++field3296;
        class756 var5 = (class756) arg1;
        class411 var6 = var5.field10228;
        this.method1598(-8556);
        this.method1595((byte) 111, var5.field10228);
        this.method1564(1, (byte) 111);
        this.method1630(7681, 8448, 116);
        this.method1600(17104, 34167, 0, 768);
        float var7 = var6.field5834 / (float) var6.field5837;
        float var8 = var6.field5836 / (float) var6.field5830;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3655) * var7, (float) (-arg3 + this.field3608) * var8);
        OpenGL.glVertex2i(this.field3655, this.field3608);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3655) * var7, (float) (-arg3 + this.field3643) * var8);
        OpenGL.glVertex2i(this.field3655, this.field3643);
        OpenGL.glTexCoord2f((float) (this.field3617 - arg2) * var7, (float) (this.field3643 - arg3) * var8);
        OpenGL.glVertex2i(this.field3617, this.field3643);
        OpenGL.glTexCoord2f((float) (this.field3617 - arg2) * var7, (float) (this.field3608 - arg3) * var8);
        OpenGL.glVertex2i(this.field3617, this.field3608);
        OpenGL.glEnd();
        this.method1600(17104, 5890, 0, 768);
    }

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "(I)V", line = 4012)
    private final void method1638(int arg0) {
        if (this.field3591 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3461 < -1 && ~this.field3421 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3461, (double) this.field3421, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3591 = 1;
            this.field3543 &= -25;
        }
        if (arg0 >= -126) {
            this.method1581(-54, 48, 71, -63);
        }
        ++field3374;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 4035)
    public final void method1639(boolean arg0, int arg1) {
        if (arg1 != -8) {
            this.method1630(127, -52, 121);
        }
        if (arg0 == !this.field3621) {
            this.field3621 = arg0;
            this.method1632((byte) -69);
            this.field3543 &= -8;
        }
        ++field3364;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILvv;)V", line = 4053)
    public final void method1640(int arg0, class343 arg1) {
        if (arg0 == 34963) {
            ++field3425;
            if (this.field3659 != arg1) {
                if (this.field3572) {
                    OpenGL.glBindBufferARB(34963, arg1.method1761(107));
                }
                this.field3659 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "()Z", line = 4084)
    public final boolean method472() {
        ++field3325;
        return this.field3502 != null && this.field3502.method1319(0);
    }

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "(Z)V", line = 4101)
    public final void method508(boolean arg0) {
        this.field3595 = arg0;
        ++field3385;
        this.method1629(126);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 4113)
    public final void method492(Canvas arg0, int arg1, int arg2) {
        ++field3402;
        if (this.field3311 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3334.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field3466.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field3334.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lvf;Z)Lhh;", line = 4146)
    public final class140 method466(class162 arg0, boolean arg1) {
        ++field3376;
        int[] var3 = new int[arg0.field2156 * arg0.field2155];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2157 == null) {
            for (int var6 = 0; ~arg0.field2155 < ~var6; ++var6) {
                for (int var7 = 0; var7 < arg0.field2156; ++var7) {
                    int var8 = arg0.field2160[arg0.field2154[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class670.method3699(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field2155 < ~var9; ++var9) {
                for (int var11 = 0; ~arg0.field2156 < ~var11; ++var11) {
                    var3[var5++] = class670.method3699(arg0.field2160[class519.method3018(arg0.field2154[var4], 255)], arg0.field2157[var4] << 24);
                    ++var4;
                }
            }
        }
        class140 var10 = this.method446(var3, 126, arg0.field2156, arg0.field2155, arg0.field2156, 0);
        var10.method347(arg0.field2159, arg0.field2161, arg0.field2158, arg0.field2162);
        return var10;
    }

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "(I)I", line = 4207)
    private final int method1641(int arg0) {
        ++field3359;
        this.field3562 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field3624 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field3562.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field3562.indexOf("brian paul") != -1 || ~this.field3562.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class684.method3748(-2242, var3.replace('.', ' '), ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class469.method2750((byte) 54, var4[0]);
                int var6 = class469.method2750((byte) 101, var4[1]);
                this.field3632 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field3632 > -13) {
            var2 |= 2;
        }
        if (!this.field3466.method3610("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3466.method3610("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3569 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3662 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3649 = var7[0];
        if (~this.field3569 > -3 || ~this.field3662 > -3 || ~this.field3649 > -3) {
            var2 |= 16;
        }
        this.field3561 = Stream.method3798();
        this.field3565 = this.field3466.arePbuffersAvailable();
        this.field3572 = this.field3466.method3610("GL_ARB_vertex_buffer_object");
        this.field3609 = this.field3466.method3610("GL_ARB_multisample");
        this.field3636 = this.field3466.method3610("GL_ARB_vertex_program");
        this.field3466.method3610("GL_ARB_fragment_program");
        this.field3554 = this.field3466.method3610("GL_ARB_vertex_shader");
        this.field3589 = this.field3466.method3610("GL_ARB_fragment_shader");
        this.field3586 = this.field3466.method3610("GL_EXT_texture3D");
        this.field3616 = this.field3466.method3610("GL_ARB_texture_rectangle");
        this.field3603 = this.field3466.method3610("GL_ARB_texture_cube_map");
        this.field3601 = this.field3466.method3610("GL_ARB_texture_float");
        this.field3588 = false;
        this.field3652 = this.field3466.method3610("GL_EXT_framebuffer_object");
        this.field3564 = this.field3466.method3610("GL_EXT_framebuffer_blit");
        this.field3592 = this.field3466.method3610("GL_EXT_framebuffer_multisample");
        this.field3635 = this.field3564 & this.field3592;
        this.field3560 = class519.field7225.startsWith("mac");
        if (arg0 != 6574) {
            this.field3658 = null;
        }
        OpenGL.glGetFloatv(2834, class782.field10749, 0);
        this.field3633 = class782.field10749[0];
        this.field3598 = class782.field10749[1];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "()V", line = 4292)
    public final void method527() {
        this.field3494.method4174(true);
        ++field3332;
    }

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "(I)V", line = 4306)
    public final void method1642(int arg0) {
        if (arg0 == 29179) {
            if (~this.field3543 != -5) {
                this.method1638(-127);
                this.method1570((byte) 76, false);
                this.method1639(false, -8);
                this.method1593((byte) 29, false);
                this.method1572(false, false);
                this.method1580((byte) -52, -2);
                this.method1564(1, (byte) 103);
                this.field3543 = 4;
            }
            ++field3363;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V", line = 4328)
    public final synchronized void method1643(int arg0, int arg1, int arg2) {
        ++field3377;
        class445 var4 = new class445(arg0);
        if (arg2 <= -19) {
            var4.field2146 = (long) arg1;
            this.field3536.method689(var4, -108);
        }
    }

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "(I)V", line = 4342)
    private final void method1644(int arg0) {
        ++field3345;
        if (this.field3367 != null) {
            Dimension var2 = this.field3367.getSize();
            this.field3329 = var2.width;
            this.field3473 = var2.height;
        } else {
            this.field3329 = this.field3473 = 0;
        }
        if (this.field3524 == null) {
            this.field3461 = this.field3329;
            this.field3421 = this.field3473;
            this.method1602(true);
        }
        this.method1575((byte) -112);
        if (arg0 != 0) {
            this.method1616(-33, true);
        }
        this.method526();
    }

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "()I", line = 4379)
    public final int method494() {
        ++field3378;
        int var1 = this.field3665;
        this.field3665 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhg;)V", line = 4396)
    public final void method554(class718 arg0) {
        ++field3423;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V", line = 4403)
    public final synchronized void method533(int arg0) {
        ++field3381;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3535.method688(-55)) {
            class445 var12 = (class445) this.field3535.method687((byte) -79);
            class628.field8503[var2++] = (int) var12.field2146;
            this.field3532 -= var12.field6408;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class628.field8503, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class628.field8503, 0);
            var2 = 0;
        }
        while (!this.field3536.method688(-49)) {
            class445 var11 = (class445) this.field3536.method687((byte) -121);
            class628.field8503[var2++] = (int) var11.field2146;
            this.field3534 -= var11.field6408;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class628.field8503, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class628.field8503, 0);
            var2 = 0;
        }
        while (!this.field3537.method688(119)) {
            class445 var10 = (class445) this.field3537.method687((byte) -107);
            class628.field8503[var2++] = var10.field6408;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class628.field8503, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class628.field8503, 0);
            var2 = 0;
        }
        while (!this.field3538.method688(105)) {
            class445 var9 = (class445) this.field3538.method687((byte) -97);
            class628.field8503[var2++] = (int) var9.field2146;
            this.field3531 -= var9.field6408;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class628.field8503, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class628.field8503, 0);
            boolean var4 = false;
        }
        while (!this.field3533.method688(109)) {
            class445 var8 = (class445) this.field3533.method687((byte) -85);
            OpenGL.glDeleteLists((int) var8.field2146, var8.field6408);
        }
        while (!this.field3539.method688(110)) {
            class159 var7 = this.field3539.method687((byte) -73);
            OpenGL.glDeleteProgramARB((int) var7.field2146);
        }
        while (!this.field3540.method688(-126)) {
            class159 var6 = this.field3540.method687((byte) -73);
            OpenGL.glDeleteObjectARB(var6.field2146);
        }
        while (!this.field3533.method688(-65)) {
            class445 var5 = (class445) this.field3533.method687((byte) -68);
            OpenGL.glDeleteLists((int) var5.field2146, var5.field6408);
        }
        this.field3510.method4242(-100);
        if (this.method496() > 100663296 && this.field3541 + 60000L < class401.method2440(false)) {
            System.gc();
            this.field3541 = class401.method2440(false);
        }
        this.field3519 = var3;
    }

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "(Z)V", line = 4571)
    private final void method1645(boolean arg0) {
        if (arg0) {
            this.field3616 = false;
        }
        ++field3485;
        int var2 = 0;
        while (!this.field3466.method3609()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class171.method1152(1000L, false);
        }
    }
}
