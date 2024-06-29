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

@OriginalClass("client!na")
public class class211 extends class497 {

    @OriginalMember(owner = "client!na", name = "Hb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3346 = new Hashtable();

    @OriginalMember(owner = "client!na", name = "fe", descriptor = "I")
    public int field3474 = 128;

    @OriginalMember(owner = "client!na", name = "ge", descriptor = "Lpq;")
    private class129 field3475 = new class129();

    @OriginalMember(owner = "client!na", name = "he", descriptor = "Lnf;")
    private class89 field3476 = new class89();

    @OriginalMember(owner = "client!na", name = "ie", descriptor = "Lnf;")
    public class89 field3477 = new class89();

    @OriginalMember(owner = "client!na", name = "ne", descriptor = "I")
    public int field3482 = 8;

    @OriginalMember(owner = "client!na", name = "ke", descriptor = "Z")
    private boolean field3479 = false;

    @OriginalMember(owner = "client!na", name = "oe", descriptor = "I")
    public int field3483 = 3;

    @OriginalMember(owner = "client!na", name = "me", descriptor = "Lnj;")
    private class317 field3481 = new class317();

    @OriginalMember(owner = "client!na", name = "qe", descriptor = "[Lpv;")
    private class125[] field3485 = new class125[4];

    @OriginalMember(owner = "client!na", name = "re", descriptor = "[Lpv;")
    private class125[] field3486 = new class125[4];

    @OriginalMember(owner = "client!na", name = "ve", descriptor = "[Lpv;")
    private class125[] field3490 = new class125[4];

    @OriginalMember(owner = "client!na", name = "we", descriptor = "I")
    private int field3491 = -1;

    @OriginalMember(owner = "client!na", name = "te", descriptor = "I")
    private int field3488 = -1;

    @OriginalMember(owner = "client!na", name = "ue", descriptor = "I")
    private int field3489 = -1;

    @OriginalMember(owner = "client!na", name = "Be", descriptor = "Lnj;")
    private class317 field3496;

    @OriginalMember(owner = "client!na", name = "Ce", descriptor = "Lnj;")
    private class317 field3497;

    @OriginalMember(owner = "client!na", name = "De", descriptor = "Lnj;")
    private class317 field3498;

    @OriginalMember(owner = "client!na", name = "Ee", descriptor = "Lnj;")
    private class317 field3499;

    @OriginalMember(owner = "client!na", name = "Fe", descriptor = "Lnj;")
    private class317 field3500;

    @OriginalMember(owner = "client!na", name = "Ge", descriptor = "Lnj;")
    private class317 field3501;

    @OriginalMember(owner = "client!na", name = "He", descriptor = "Lnj;")
    private class317 field3502;

    @OriginalMember(owner = "client!na", name = "Ne", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!na", name = "Ve", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!na", name = "Re", descriptor = "F")
    public float field3512;

    @OriginalMember(owner = "client!na", name = "af", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!na", name = "vf", descriptor = "I")
    public int field3541;

    @OriginalMember(owner = "client!na", name = "qf", descriptor = "F")
    private float field3536;

    @OriginalMember(owner = "client!na", name = "sf", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!na", name = "Ie", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!na", name = "kf", descriptor = "F")
    public float field3530;

    @OriginalMember(owner = "client!na", name = "Ff", descriptor = "[F")
    private float[] field3551;

    @OriginalMember(owner = "client!na", name = "tf", descriptor = "F")
    public float field3539;

    @OriginalMember(owner = "client!na", name = "Rf", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!na", name = "Nf", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!na", name = "Mf", descriptor = "F")
    public float field3558;

    @OriginalMember(owner = "client!na", name = "of", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!na", name = "hg", descriptor = "I")
    public int field3579;

    @OriginalMember(owner = "client!na", name = "dg", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!na", name = "gf", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!na", name = "If", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!na", name = "Ef", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!na", name = "mg", descriptor = "[Las;")
    private class415[] field3584;

    @OriginalMember(owner = "client!na", name = "pg", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!na", name = "wg", descriptor = "I")
    private int field3594;

    @OriginalMember(owner = "client!na", name = "fg", descriptor = "[F")
    private float[] field3577;

    @OriginalMember(owner = "client!na", name = "Sf", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!na", name = "qg", descriptor = "F")
    private float field3588;

    @OriginalMember(owner = "client!na", name = "zg", descriptor = "F")
    public float field3597;

    @OriginalMember(owner = "client!na", name = "ag", descriptor = "[F")
    public float[] field3572;

    @OriginalMember(owner = "client!na", name = "xg", descriptor = "F")
    private float field3595;

    @OriginalMember(owner = "client!na", name = "Ag", descriptor = "F")
    public float field3598;

    @OriginalMember(owner = "client!na", name = "Ze", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!na", name = "Yf", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!na", name = "Mg", descriptor = "[F")
    private float[] field3610;

    @OriginalMember(owner = "client!na", name = "rf", descriptor = "Z")
    private boolean field3537;

    @OriginalMember(owner = "client!na", name = "jg", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!na", name = "Ng", descriptor = "F")
    public float field3611;

    @OriginalMember(owner = "client!na", name = "Rg", descriptor = "F")
    public float field3615;

    @OriginalMember(owner = "client!na", name = "tg", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!na", name = "Vg", descriptor = "[F")
    private float[] field3619;

    @OriginalMember(owner = "client!na", name = "Tg", descriptor = "Lwm;")
    public class302 field3617;

    @OriginalMember(owner = "client!na", name = "Xg", descriptor = "[I")
    public int[] field3621;

    @OriginalMember(owner = "client!na", name = "bh", descriptor = "[I")
    public int[] field3625;

    @OriginalMember(owner = "client!na", name = "Zg", descriptor = "[I")
    public int[] field3623;

    @OriginalMember(owner = "client!na", name = "ch", descriptor = "[B")
    public byte[] field3626;

    @OriginalMember(owner = "client!na", name = "be", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!na", name = "Db", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3342;

    @OriginalMember(owner = "client!na", name = "zd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3442;

    @OriginalMember(owner = "client!na", name = "rc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field3382;

    @OriginalMember(owner = "client!na", name = "Jc", descriptor = "J")
    private long field3400;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "J")
    private long field3289;

    @OriginalMember(owner = "client!na", name = "Of", descriptor = "Z")
    public boolean field3560;

    @OriginalMember(owner = "client!na", name = "Lg", descriptor = "I")
    public int field3609;

    @OriginalMember(owner = "client!na", name = "Oe", descriptor = "Ljava/lang/String;")
    private String field3509;

    @OriginalMember(owner = "client!na", name = "Cg", descriptor = "Z")
    public boolean field3600;

    @OriginalMember(owner = "client!na", name = "Qf", descriptor = "Z")
    private boolean field3562;

    @OriginalMember(owner = "client!na", name = "Tf", descriptor = "Z")
    public boolean field3565;

    @OriginalMember(owner = "client!na", name = "Df", descriptor = "Z")
    public boolean field3549;

    @OriginalMember(owner = "client!na", name = "wf", descriptor = "Z")
    private boolean field3542;

    @OriginalMember(owner = "client!na", name = "Og", descriptor = "Z")
    public boolean field3612;

    @OriginalMember(owner = "client!na", name = "bf", descriptor = "Ljava/lang/String;")
    private String field3522;

    @OriginalMember(owner = "client!na", name = "jf", descriptor = "Z")
    public boolean field3529;

    @OriginalMember(owner = "client!na", name = "Qe", descriptor = "Z")
    private boolean field3511;

    @OriginalMember(owner = "client!na", name = "Xd", descriptor = "Lki;")
    public class280 field3466;

    @OriginalMember(owner = "client!na", name = "je", descriptor = "Lqk;")
    public class1 field3478;

    @OriginalMember(owner = "client!na", name = "Zd", descriptor = "Lje;")
    private class62 field3468;

    @OriginalMember(owner = "client!na", name = "Yd", descriptor = "Lcd;")
    private class429 field3467;

    @OriginalMember(owner = "client!na", name = "ae", descriptor = "Lia;")
    private class23 field3469;

    @OriginalMember(owner = "client!na", name = "Gc", descriptor = "Lbi;")
    public static class104 field3397 = new class104(23, 14);

    @OriginalMember(owner = "client!na", name = "Td", descriptor = "Lof;")
    public static class328 field3462 = new class328(260);

    @OriginalMember(owner = "client!na", name = "Me", descriptor = "F")
    private float field3507;

    @OriginalMember(owner = "client!na", name = "Pe", descriptor = "F")
    public float field3510;

    @OriginalMember(owner = "client!na", name = "Te", descriptor = "F")
    public float field3514;

    @OriginalMember(owner = "client!na", name = "Ye", descriptor = "F")
    public float field3519;

    @OriginalMember(owner = "client!na", name = "uf", descriptor = "F")
    public float field3540;

    @OriginalMember(owner = "client!na", name = "Vf", descriptor = "F")
    public float field3567;

    @OriginalMember(owner = "client!na", name = "eg", descriptor = "F")
    private float field3576;

    @OriginalMember(owner = "client!na", name = "kg", descriptor = "F")
    public float field3582;

    @OriginalMember(owner = "client!na", name = "og", descriptor = "F")
    private float field3586;

    @OriginalMember(owner = "client!na", name = "Pg", descriptor = "F")
    public float field3613;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!na", name = "nb", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!na", name = "ob", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!na", name = "pb", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!na", name = "qb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!na", name = "rb", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
    private int field3331;

    @OriginalMember(owner = "client!na", name = "tb", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!na", name = "ub", descriptor = "I")
    private int field3333;

    @OriginalMember(owner = "client!na", name = "vb", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!na", name = "wb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!na", name = "xb", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!na", name = "yb", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!na", name = "zb", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!na", name = "Ab", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!na", name = "Bb", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!na", name = "Cb", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!na", name = "Eb", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!na", name = "Fb", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!na", name = "Gb", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!na", name = "Ib", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!na", name = "Jb", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!na", name = "Kb", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!na", name = "Lb", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!na", name = "Mb", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!na", name = "Nb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!na", name = "Ob", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!na", name = "Pb", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!na", name = "Qb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!na", name = "Rb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!na", name = "Sb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!na", name = "Tb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!na", name = "Ub", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!na", name = "Vb", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!na", name = "Wb", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!na", name = "Xb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!na", name = "Yb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!na", name = "Zb", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!na", name = "ac", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!na", name = "bc", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!na", name = "cc", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!na", name = "dc", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!na", name = "ec", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!na", name = "fc", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!na", name = "hc", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!na", name = "ic", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!na", name = "jc", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!na", name = "kc", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!na", name = "lc", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!na", name = "mc", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!na", name = "nc", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!na", name = "oc", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!na", name = "pc", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!na", name = "qc", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!na", name = "sc", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!na", name = "tc", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!na", name = "uc", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!na", name = "vc", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!na", name = "wc", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!na", name = "xc", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!na", name = "yc", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!na", name = "zc", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!na", name = "Ac", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!na", name = "Bc", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!na", name = "Cc", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!na", name = "Dc", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!na", name = "Ec", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!na", name = "Fc", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!na", name = "Hc", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!na", name = "Ic", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!na", name = "Kc", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!na", name = "Lc", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!na", name = "Mc", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!na", name = "Nc", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!na", name = "Oc", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!na", name = "Pc", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!na", name = "Qc", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!na", name = "Rc", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!na", name = "Sc", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!na", name = "Tc", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!na", name = "Uc", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!na", name = "Vc", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!na", name = "Wc", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!na", name = "Xc", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!na", name = "Yc", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!na", name = "Zc", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!na", name = "ad", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!na", name = "bd", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!na", name = "cd", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!na", name = "dd", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!na", name = "ed", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!na", name = "fd", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!na", name = "gd", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!na", name = "hd", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!na", name = "id", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!na", name = "jd", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!na", name = "kd", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!na", name = "ld", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!na", name = "md", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!na", name = "nd", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!na", name = "od", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!na", name = "pd", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!na", name = "qd", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!na", name = "rd", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!na", name = "sd", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!na", name = "td", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!na", name = "ud", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!na", name = "vd", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!na", name = "wd", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!na", name = "xd", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!na", name = "yd", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!na", name = "Ad", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!na", name = "Bd", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!na", name = "Cd", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!na", name = "Dd", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!na", name = "Ed", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!na", name = "Fd", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!na", name = "Gd", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!na", name = "Hd", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!na", name = "Id", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!na", name = "Jd", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!na", name = "Kd", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!na", name = "Ld", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!na", name = "Md", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!na", name = "Nd", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!na", name = "Od", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!na", name = "Pd", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!na", name = "Qd", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!na", name = "Rd", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!na", name = "Sd", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!na", name = "Ud", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!na", name = "Vd", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!na", name = "Wd", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!na", name = "ce", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!na", name = "de", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!na", name = "ee", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!na", name = "pe", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!na", name = "ye", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!na", name = "ze", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!na", name = "Ae", descriptor = "I")
    private int field3495;

    @OriginalMember(owner = "client!na", name = "Le", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!na", name = "pf", descriptor = "I")
    public int field3535;

    @OriginalMember(owner = "client!na", name = "yf", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!na", name = "Bf", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!na", name = "Jf", descriptor = "I")
    private int field3555;

    @OriginalMember(owner = "client!na", name = "Kf", descriptor = "I")
    public int field3556;

    @OriginalMember(owner = "client!na", name = "Uf", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!na", name = "bg", descriptor = "I")
    private int field3573;

    @OriginalMember(owner = "client!na", name = "gg", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!na", name = "ug", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!na", name = "yg", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!na", name = "Bg", descriptor = "I")
    private int field3599;

    @OriginalMember(owner = "client!na", name = "Dg", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!na", name = "Ig", descriptor = "I")
    private int field3606;

    @OriginalMember(owner = "client!na", name = "Sg", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!na", name = "Yg", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!na", name = "ah", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!na", name = "Fg", descriptor = "J")
    private long field3603;

    @OriginalMember(owner = "client!na", name = "se", descriptor = "Lpv;")
    private class125 field3487;

    @OriginalMember(owner = "client!na", name = "xe", descriptor = "Lpv;")
    private class125 field3492;

    @OriginalMember(owner = "client!na", name = "Wf", descriptor = "Ldg;")
    public class146 field3568;

    @OriginalMember(owner = "client!na", name = "Ke", descriptor = "Lto;")
    public class161 field3505;

    @OriginalMember(owner = "client!na", name = "cf", descriptor = "Lto;")
    public class161 field3523;

    @OriginalMember(owner = "client!na", name = "hf", descriptor = "Lto;")
    public class161 field3528;

    @OriginalMember(owner = "client!na", name = "Af", descriptor = "Lto;")
    public class161 field3546;

    @OriginalMember(owner = "client!na", name = "Pf", descriptor = "Lto;")
    public class161 field3561;

    @OriginalMember(owner = "client!na", name = "Zf", descriptor = "Lto;")
    public class161 field3571;

    @OriginalMember(owner = "client!na", name = "ig", descriptor = "Lto;")
    public class161 field3580;

    @OriginalMember(owner = "client!na", name = "lg", descriptor = "Lto;")
    public class161 field3583;

    @OriginalMember(owner = "client!na", name = "Jg", descriptor = "Lto;")
    public class161 field3607;

    @OriginalMember(owner = "client!na", name = "Wg", descriptor = "Lto;")
    public class161 field3620;

    @OriginalMember(owner = "client!na", name = "rg", descriptor = "Lnm;")
    private class296 field3589;

    @OriginalMember(owner = "client!na", name = "df", descriptor = "Ltb;")
    private class347 field3524;

    @OriginalMember(owner = "client!na", name = "We", descriptor = "Lui;")
    private class383 field3517;

    @OriginalMember(owner = "client!na", name = "vg", descriptor = "Lui;")
    private class383 field3593;

    @OriginalMember(owner = "client!na", name = "Kg", descriptor = "Lme;")
    private class508 field3608;

    @OriginalMember(owner = "client!na", name = "mf", descriptor = "Lsa;")
    public class532 field3532;

    @OriginalMember(owner = "client!na", name = "Cf", descriptor = "Ldb;")
    public class67 field3548;

    @OriginalMember(owner = "client!na", name = "Hg", descriptor = "Ldb;")
    public class67 field3605;

    @OriginalMember(owner = "client!na", name = "Ue", descriptor = "Lnf;")
    public class89 field3515;

    @OriginalMember(owner = "client!na", name = "ng", descriptor = "Lnf;")
    public class89 field3585;

    @OriginalMember(owner = "client!na", name = "le", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field3480;

    @OriginalMember(owner = "client!na", name = "Je", descriptor = "Z")
    public boolean field3504;

    @OriginalMember(owner = "client!na", name = "Se", descriptor = "Z")
    public boolean field3513;

    @OriginalMember(owner = "client!na", name = "Xe", descriptor = "Z")
    public boolean field3518;

    @OriginalMember(owner = "client!na", name = "ef", descriptor = "Z")
    public boolean field3525;

    @OriginalMember(owner = "client!na", name = "ff", descriptor = "Z")
    private boolean field3526;

    @OriginalMember(owner = "client!na", name = "lf", descriptor = "Z")
    public boolean field3531;

    @OriginalMember(owner = "client!na", name = "nf", descriptor = "Z")
    private boolean field3533;

    @OriginalMember(owner = "client!na", name = "zf", descriptor = "Z")
    public boolean field3545;

    @OriginalMember(owner = "client!na", name = "Gf", descriptor = "Z")
    private boolean field3552;

    @OriginalMember(owner = "client!na", name = "Hf", descriptor = "Z")
    private boolean field3553;

    @OriginalMember(owner = "client!na", name = "Lf", descriptor = "Z")
    private boolean field3557;

    @OriginalMember(owner = "client!na", name = "Xf", descriptor = "Z")
    private boolean field3569;

    @OriginalMember(owner = "client!na", name = "cg", descriptor = "Z")
    public boolean field3574;

    @OriginalMember(owner = "client!na", name = "sg", descriptor = "Z")
    private boolean field3590;

    @OriginalMember(owner = "client!na", name = "Eg", descriptor = "Z")
    private boolean field3602;

    @OriginalMember(owner = "client!na", name = "Gg", descriptor = "Z")
    private boolean field3604;

    @OriginalMember(owner = "client!na", name = "Qg", descriptor = "Z")
    private boolean field3614;

    @OriginalMember(owner = "client!na", name = "Ug", descriptor = "Z")
    public boolean field3618;

    @OriginalMember(owner = "client!na", name = "xf", descriptor = "[Led;")
    private class427[] field3543;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "()Lc;")
    public final class205 method1254() {
        ++field3344;
        return new class89();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIF)Las;")
    public final class415 method1333(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3401;
        return new class33(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class139 method1311(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3301;
        return new class311(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(F)V")
    public final void method1301(float arg0) {
        ++field3337;
        if (this.field3613 != arg0) {
            this.field3613 = arg0;
            this.method1554((byte) 117);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final synchronized void method1287(int arg0) {
        ++field3374;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3497.method2122(-12191)) {
            class330 var12 = (class330) this.field3497.method2127(-116);
            class132.field1788[var2++] = (int) var12.field7780;
            this.field3493 -= var12.field5185;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class132.field1788, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class132.field1788, 0);
            var2 = 0;
        }
        while (!this.field3498.method2122(-12191)) {
            class330 var11 = (class330) this.field3498.method2127(-121);
            class132.field1788[var2++] = (int) var11.field7780;
            this.field3494 -= var11.field5185;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class132.field1788, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class132.field1788, 0);
            var2 = 0;
        }
        while (!this.field3499.method2122(-12191)) {
            class330 var10 = (class330) this.field3499.method2127(-120);
            class132.field1788[var2++] = var10.field5185;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class132.field1788, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class132.field1788, 0);
            var2 = 0;
        }
        while (!this.field3500.method2122(-12191)) {
            class330 var9 = (class330) this.field3500.method2127(-110);
            class132.field1788[var2++] = (int) var9.field7780;
            this.field3495 -= var9.field5185;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class132.field1788, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class132.field1788, 0);
            boolean var4 = false;
        }
        while (!this.field3496.method2122(-12191)) {
            class330 var8 = (class330) this.field3496.method2127(-118);
            OpenGL.glDeleteLists((int) var8.field7780, var8.field5185);
        }
        while (!this.field3501.method2122(-12191)) {
            class529 var7 = this.field3501.method2127(-116);
            OpenGL.glDeleteProgramARB((int) var7.field7780);
        }
        while (!this.field3502.method2122(-12191)) {
            class529 var6 = this.field3502.method2127(-112);
            OpenGL.glDeleteObjectARB(var6.field7780);
        }
        while (!this.field3496.method2122(-12191)) {
            class330 var5 = (class330) this.field3496.method2127(-108);
            OpenGL.glDeleteLists((int) var5.field7780, var5.field5185);
        }
        this.field3466.method1882(-10289);
        if (~this.method1258() < -100663297 && ~(this.field3603 - -60000L) > ~class246.method1705((byte) 28)) {
            System.gc();
            this.field3603 = class246.method1705((byte) 28);
        }
        this.field3484 = var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()Z")
    public final boolean method1238() {
        ++field3361;
        if (this.field3467 != null) {
            if (!this.field3467.method2360((byte) -84)) {
                if (!this.field3468.method460(-124, this.field3467)) {
                    return false;
                }
                this.field3466.method1884(0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(II)I")
    public final int method1493(int arg0, int arg1) {
        if (arg0 < 70) {
            return 44;
        } else {
            ++field3412;
            if (arg1 != 6406 && ~arg1 != -6410) {
                if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                    if (~arg1 != -6408) {
                        if (arg1 != 6408 && arg1 != 34847) {
                            if (~arg1 != -34844) {
                                if (~arg1 == -34843) {
                                    return 8;
                                } else if (arg1 == 6402) {
                                    return 3;
                                } else if (arg1 == 6401) {
                                    return 1;
                                } else {
                                    throw new IllegalArgumentException("");
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
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(II)V")
    public final void method1494(int arg0, int arg1) {
        if (arg1 == -25951) {
            if (~arg0 != -2) {
                if (~arg0 == -1) {
                    this.method1568(8448, arg1 + 28847, 8448);
                } else if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.method1568(8448, 2896, 260);
                    } else if (~arg0 == -5) {
                        this.method1568(34023, 2896, 34023);
                    }
                } else {
                    this.method1568(7681, 2896, 34165);
                }
            } else {
                this.method1568(7681, arg1 ^ -28175, 7681);
            }
            ++field3396;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lmt;Lmt;FLmt;)Lmt;")
    public final class321 method1286(class321 arg0, class321 arg1, float arg2, class321 arg3) {
        ++field3443;
        if (arg0 != null && arg1 != null && this.field3525 && this.field3529) {
            class526 var5 = null;
            class296 var6 = (class296) arg0;
            class296 var7 = (class296) arg1;
            class15 var8 = var6.method1080((byte) 118);
            class15 var9 = var7.method1080((byte) 112);
            if (var8 != null && var9 != null) {
                int var10 = var8.field156 <= var9.field156 ? var9.field156 : var8.field156;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class526) {
                    class526 var11 = (class526) arg3;
                    if (~var11.method3139(false) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class526(this, var10);
                }
                if (var5.method3136(var8, (byte) -119, var9, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    private final void method1495(byte arg0) {
        if (arg0 > -70) {
            this.field3498 = null;
        }
        ++field3369;
        if (~this.field3573 != -3) {
            this.field3573 = 2;
            this.method1575((byte) 117);
            this.method1531(8);
            this.field3592 &= -8;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1282(Canvas arg0) {
        ++field3336;
        if (this.field3342 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3346.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3382.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3346.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "GA", descriptor = "(IIII)V")
    public final void method1277(int arg0, int arg1, int arg2, int arg3) {
        ++field3317;
        this.field3538 = arg1;
        this.field3579 = arg2;
        this.field3520 = arg0;
        this.field3591 = arg3;
        this.method1516(15915);
        this.method1523(true);
        if (~this.field3573 == -4) {
            this.method1505((byte) -98);
        } else if (this.field3573 == 2) {
            this.method1575((byte) 104);
        }
    }

    @OriginalMember(owner = "client!na", name = "t", descriptor = "(I)V")
    public final void method1317(int arg0) {
        ++field3354;
        this.method1566((byte) 95, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I)Lta;")
    public final class453 method1334(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3370;
        return class379.method2454(arg3, arg1, 1, arg2, arg0, this);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public final void method1496(boolean arg0, int arg1) {
        if (!this.field3557 != !arg0) {
            this.field3557 = arg0;
            this.method1528(arg1 ^ 30585);
        }
        ++field3362;
        if (arg1 != 0) {
            this.method1240(true);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Le;Lc;[Lkk;I)V")
    public final void method1289(class536[] arg0, class205 arg1, class182[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method295(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field3284;
    }

    @OriginalMember(owner = "client!na", name = "sa", descriptor = "(IIII)[I")
    public final int[] method1251(int arg0, int arg1, int arg2, int arg3) {
        ++field3311;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field3433, arg2, 1, 32993, this.field3609, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZI)V")
    public final void method1497(int arg0, boolean arg1, int arg2) {
        this.method1519(true, arg2, arg1, 26649);
        if (arg0 != 22387) {
            this.method1559(-123);
        }
        ++field3447;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(IIII)V")
    public final void method1498(int arg0, int arg1, int arg2, int arg3) {
        ++field3281;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
        OpenGL.glTexEnvi(8960, arg0 + arg1, arg3);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ln;)V")
    public final void method1295(class517 arg0) {
        ++field3450;
        this.field3480 = ((class457) arg0).field7051;
        if (this.field3517 == null) {
            class302 var2 = new class302(80);
            if (this.field3560) {
                var2.method2030(-1.0F, 9);
                var2.method2030(-1.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(-1.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(-1.0F, 9);
                var2.method2030(1.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(0.0F, 9);
                var2.method2030(0.0F, 9);
            } else {
                var2.method2034(-1.0F, false);
                var2.method2034(-1.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(-1.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(-1.0F, false);
                var2.method2034(1.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(0.0F, false);
                var2.method2034(0.0F, false);
            }
            this.field3517 = this.method1544(false, 20, var2.field3162, var2.field3193, false);
            this.field3548 = new class67(this.field3517, 5126, 3, 0);
            this.field3605 = new class67(this.field3517, 5126, 2, 12);
            this.field3475.method803(this, false);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1308(Canvas arg0) {
        ++field3473;
        if (this.field3342 == arg0) {
            throw new RuntimeException();
        } else if (this.field3346.containsKey(arg0)) {
            Long var2 = (Long) this.field3346.get(arg0);
            this.field3382.releaseSurface(arg0, var2);
            this.field3346.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1253(Canvas arg0) {
        ++field3339;
        long var2 = 0L;
        if (arg0 != null && this.field3342 != arg0) {
            if (this.field3346.containsKey(arg0)) {
                Long var4 = (Long) this.field3346.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3400;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field3382.surfaceResized(var2);
            if (this.field3442 == arg0) {
                this.method1552(true);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "pa", descriptor = "()I")
    public final int method1258() {
        ++field3432;
        return this.field3495 + this.field3493 + this.field3494;
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "(I)V")
    private final void method1499(int arg0) {
        if (arg0 != 1) {
            this.method1239();
        }
        if (~this.field3592 != -2) {
            this.method1509(true);
            this.method1563(1205, false);
            this.method1504(false, -2414);
            this.method1572(false, -32);
            this.method1571(false, (byte) -30);
            this.method1540(116, (class427) null);
            this.method1553(-2, true);
            this.method1494(1, arg0 + -25952);
            this.field3592 = 1;
        }
        ++field3292;
    }

    @OriginalMember(owner = "client!na", name = "l", descriptor = "(I)V")
    public static void method1500(int arg0) {
        field3462 = null;
        if (arg0 != 6) {
            field3462 = null;
        }
        field3397 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lnf;I)V")
    public final void method1501(class89 arg0, int arg1) {
        if (arg1 != -21399) {
            this.method1266();
        }
        OpenGL.glPushMatrix();
        ++field3444;
        OpenGL.glMultMatrixf(arg0.method612(false), 0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZLjaggl/memory/NativeBuffer;II)Lui;")
    public final class383 method1502(int arg0, boolean arg1, NativeBuffer arg2, int arg3, int arg4) {
        ++field3389;
        if (!this.field3562 || arg1 && !this.field3542) {
            if (arg4 != -3875) {
                this.method1511(119, (byte) -36);
            }
            return new class260(this, arg3, arg2);
        } else {
            return new class21(this, arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!na", name = "r", descriptor = "()I")
    public final int method1259() {
        ++field3279;
        return this.field3516;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILpv;)V")
    public final void method1503(int arg0, class125 arg1) {
        ++field3409;
        if (arg0 == 8) {
            if (this.field3518) {
                this.method1515((byte) -116, arg1);
                this.method1565(arg1, 90);
            } else if (~this.field3489 <= -1 && this.field3490[this.field3489] == arg1) {
                this.field3490[this.field3489--] = null;
                arg1.method780(arg0 + -13676);
                if (this.field3489 < 0) {
                    this.field3492 = this.field3487 = null;
                } else {
                    this.field3492 = this.field3487 = this.field3490[this.field3489];
                    this.field3492.method783(-66);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public final void method1292(boolean arg0) {
        ++field3410;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lmt;)V")
    public final void method1252(class321 arg0) {
        ++field3377;
        this.field3589 = (class296) arg0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(ZI)V")
    public final void method1504(boolean arg0, int arg1) {
        ++field3329;
        if (arg1 != -2414) {
            this.field3506 = 105;
        }
        if (!arg0 == this.field3569) {
            this.field3569 = arg0;
            this.method1528(30585);
            this.field3592 &= -8;
        }
    }

    @OriginalMember(owner = "client!na", name = "P", descriptor = "(IIIIII)V")
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3458;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method1499(1);
        float var10 = (float) arg3 + var8;
        this.method1566((byte) 95, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3614) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3614) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    private final void method1505(byte arg0) {
        ++field3426;
        if (arg0 == -98) {
            float var2 = (float) (-this.field3520) * this.field3588 / (float) this.field3579;
            float var3 = (float) (-this.field3538) * this.field3588 / (float) this.field3591;
            float var4 = (float) (this.field3368 - this.field3520) * this.field3588 / (float) this.field3579;
            float var5 = (float) (-this.field3538 + this.field3433) * this.field3588 / (float) this.field3591;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field3550 - this.field3510), (double) ((float) this.field3516 + -this.field3510));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([IIIII)Lo;")
    public final class139 method1232(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3415;
        return new class311(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(ILpv;)V")
    public final void method1506(int arg0, class125 arg1) {
        ++field3384;
        if (~this.field3491 <= -4) {
            throw new RuntimeException();
        } else {
            int var3 = -114 % ((arg0 - -24) / 55);
            if (this.field3491 >= 0) {
                this.field3485[this.field3491].method779(-23670);
            }
            this.field3487 = this.field3485[++this.field3491] = arg1;
            this.field3487.method782(-78);
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(II)V")
    public final void method1507(int arg0, int arg1) {
        if (arg1 == 0) {
            if (~this.field3601 != ~arg0) {
                OpenGL.glActiveTexture(arg0 + 33984);
                this.field3601 = arg0;
            }
            ++field3334;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    private final void method1508(byte arg0) {
        ++field3288;
        if (arg0 > -100) {
            this.method1244(-124);
        }
        this.field3585 = new class89();
        this.field3515 = new class89();
        this.field3543 = new class427[this.field3556];
        this.field3532 = new class532(this, 3553, 6408, 1, 1);
        new class532(this, 3553, 6408, 1, 1);
        new class532(this, 3553, 6408, 1, 1);
        this.field3580 = new class161(this);
        this.field3607 = new class161(this);
        this.field3528 = new class161(this);
        this.field3505 = new class161(this);
        this.field3583 = new class161(this);
        this.field3546 = new class161(this);
        this.field3620 = new class161(this);
        this.field3523 = new class161(this);
        this.field3571 = new class161(this);
        this.field3561 = new class161(this);
        if (this.field3529) {
            this.field3568 = new class146(this);
            new class146(this);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V")
    private final void method1509(boolean arg0) {
        ++field3451;
        if (!arg0) {
            this.field3618 = false;
        }
        if (~this.field3573 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3368 < -1 && ~this.field3433 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field3368, (double) this.field3433, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3592 &= -25;
            this.field3573 = 1;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
    private final void method1510(byte arg0) {
        if (~this.field3573 != -4) {
            this.field3573 = 3;
            this.method1505((byte) -98);
            this.method1531(8);
            this.field3592 &= -8;
        }
        ++field3315;
        if (arg0 > -115) {
            this.method1334(-121, 91, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)V")
    public final synchronized void method1511(int arg0, byte arg1) {
        ++field3413;
        class330 var3 = new class330(arg0);
        this.field3499.method2124(var3, (byte) 94);
        if (arg1 != -18) {
            this.field3554 = -46;
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public final void method1316() {
        ++field3307;
        this.method1571(true, (byte) -117);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)I")
    public final int method1299(int arg0, int arg1) {
        ++field3373;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IFF)V")
    public final void method1512(int arg0, float arg1, float arg2) {
        ++field3464;
        if (arg0 != 8) {
            this.method1324();
        }
        this.field3536 = arg1;
        this.field3595 = arg2;
        if (!this.field3574) {
            this.method1513((byte) -11);
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
    private final void method1513(byte arg0) {
        ++field3328;
        int var2;
        if (this.field3574) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field3559;
        } else {
            this.field3586 = (float) (-this.field3564 + this.field3516) + -this.field3595;
            this.field3582 = -((float) this.field3563 * this.field3536) + this.field3586;
            if ((float) this.field3550 > this.field3582) {
                this.field3582 = (float) this.field3550;
            }
            OpenGL.glFogf(2915, this.field3582);
            OpenGL.glFogf(2916, this.field3586);
            var2 = this.field3508;
        }
        if (arg0 == -11) {
            class4.field43[0] = (float) class272.method1842(var2, 16711680) / 1.671168E7F;
            class4.field43[2] = (float) class272.method1842(var2, 255) / 255.0F;
            class4.field43[1] = (float) class272.method1842(65280, var2) / 65280.0F;
            OpenGL.glFogfv(2918, class4.field43, 0);
            if (this.field3574) {
                this.field3469.field260.method1594((byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "o", descriptor = "()Z")
    public final boolean method1313() {
        ++field3411;
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ[B)Ltb;")
    public final class347 method1514(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        if (arg1 != 16711680) {
            this.field3481 = null;
        }
        ++field3425;
        return (class347) (!this.field3562 || arg3 && !this.field3542 ? new class264(this, arg2, arg4, arg0) : new class116(this, arg2, arg4, arg0, arg3));
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLpv;)V")
    public final void method1515(byte arg0, class125 arg1) {
        if (arg0 >= -95) {
            this.field3495 = -48;
        }
        ++field3372;
        if (~this.field3488 <= -1 && this.field3486[this.field3488] == arg1) {
            this.field3486[this.field3488--] = null;
            arg1.method778(71);
            if (this.field3488 >= 0) {
                this.field3492 = this.field3486[this.field3488];
                this.field3492.method781((byte) -70);
            } else {
                this.field3492 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()Z")
    public final boolean method1266() {
        ++field3322;
        return this.field3469.method145((byte) 92, 3);
    }

    @OriginalMember(owner = "client!na", name = "m", descriptor = "(I)V")
    private final void method1516(int arg0) {
        ++field3446;
        if (arg0 != 15915) {
            this.field3517 = null;
        }
        float[] var2 = this.field3551;
        float var3 = (float) (-this.field3520 * this.field3550) / (float) this.field3579;
        float var4 = (float) ((-this.field3520 + this.field3368) * this.field3550) / (float) this.field3579;
        float var5 = (float) (this.field3550 * this.field3538) / (float) this.field3591;
        float var6 = (float) ((-this.field3433 + this.field3538) * this.field3550) / (float) this.field3591;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field3550 * 2.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[10] = this.field3576 = (float) (-(this.field3516 - -this.field3550)) / (float) (-this.field3550 + this.field3516);
            var2[3] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[13] = 0.0F;
            var2[14] = this.field3507 = -((float) this.field3516 * var7) / (float) (-this.field3550 + this.field3516);
            var2[15] = 0.0F;
        } else {
            var2[10] = 1.0F;
            var2[11] = 0.0F;
            var2[14] = 0.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[0] = 1.0F;
            var2[15] = 1.0F;
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = 1.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
        }
        this.method1546((byte) 61);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()Z")
    public final boolean method1275() {
        ++field3431;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "j", descriptor = "()Z")
    public final boolean method1256() {
        ++field3304;
        return this.field3614 && (!this.method1239() || this.field3526);
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(B)Lea;")
    public final class15 method1517(byte arg0) {
        if (arg0 != 115) {
            this.method1529(78);
        }
        ++field3293;
        return this.field3589 == null ? null : this.field3589.method1080((byte) 92);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(Z)V")
    private final void method1518(boolean arg0) {
        if (arg0) {
            OpenGL.glViewport(this.field3581, this.field3594, this.field3368, this.field3433);
            ++field3383;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZIZI)V")
    public final void method1519(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field3454;
        if (arg3 != 26649) {
            this.method1531(-105);
        }
        if (~this.field3566 != ~arg1) {
            if (arg1 < 0) {
                this.method1569(-127);
                this.method1540(104, (class427) null);
                this.method1494(0, -25951);
                if (!this.field3574) {
                    this.field3469.method144(0, 0, 0, arg0, 17101, arg2);
                }
            } else {
                class532 var5 = this.field3466.method1886(true, arg1);
                class476 var6 = super.field7480.method1366(arg1, (byte) -124);
                if (var6.field7272 == 0 && ~var6.field7279 == -1) {
                    this.method1569(-128);
                } else {
                    int var7 = !var6.field7295 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method1536((byte) -91, (float) (this.field3484 % var8 * var6.field7279) / (float) var8, 0.0F, (float) (this.field3484 % var8 * var6.field7272) / (float) var8);
                }
                if (this.field3574) {
                    this.method1540(79, var5);
                    this.method1494(var6.field7275, arg3 + -52600);
                } else {
                    this.field3469.method144(var6.field7274, var6.field7288, var6.field7282, arg0, arg3 ^ 10964, arg2);
                    if (!this.field3469.method147((byte) 101, var6.field7275, var5)) {
                        this.method1540(arg3 + -26545, var5);
                        this.method1494(var6.field7275, -25951);
                    }
                }
            }
            this.field3566 = arg1;
        }
        this.field3592 &= -8;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldm;)V")
    public final void method1306(class519 arg0) {
        ++field3429;
        this.field3475.method807(this, -122, arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltb;Z)V")
    public final void method1520(class347 arg0, boolean arg1) {
        if (this.field3524 != arg0) {
            if (this.field3562) {
                OpenGL.glBindBufferARB(34963, arg0.method746((byte) 117));
            }
            this.field3524 = arg0;
        }
        if (arg1) {
            ++field3360;
        }
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(B)V")
    public final void method1521(byte arg0) {
        ++field3282;
        if (this.field3592 != 4) {
            this.method1509(true);
            this.method1563(1205, false);
            this.method1504(false, -2414);
            this.method1572(false, arg0 ^ 27);
            this.method1571(false, (byte) -125);
            this.method1553(-2, true);
            this.method1566((byte) 95, 1);
            this.method1494(0, -25951);
            this.field3592 = 4;
        }
        if (arg0 != -5) {
            this.field3470 = 76;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()Z")
    public final boolean method1318() {
        ++field3424;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lfc;IIII)Le;")
    public final class536 method1337(class438 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3300;
        return new class161(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZLpv;)V")
    public final void method1522(boolean arg0, class125 arg1) {
        if (!arg0) {
            this.method1316();
        }
        ++field3296;
        if (!this.field3518) {
            if (~this.field3489 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field3489 >= 0) {
                    this.field3490[this.field3489].method780(-13668);
                }
                this.field3492 = this.field3487 = this.field3490[++this.field3489] = arg1;
                this.field3492.method783(95);
            }
        } else {
            this.method1538((byte) 74, arg1);
            this.method1506(-96, arg1);
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(Z)V")
    private final void method1523(boolean arg0) {
        this.field3540 = (float) (-this.field3538 + this.field3503);
        if (arg0) {
            ++field3306;
            this.field3567 = (float) (this.field3554 - this.field3520);
            this.field3519 = (float) (-this.field3538 + this.field3587);
            this.field3514 = (float) (this.field3527 - this.field3520);
        }
    }

    @OriginalMember(owner = "client!na", name = "s", descriptor = "(IIII)V")
    public final void method1326(int arg0, int arg1, int arg2, int arg3) {
        this.field3541 = arg3;
        ++field3295;
        this.field3547 = arg0;
        this.field3559 = arg1;
        this.field3570 = arg2;
        this.field3574 = true;
        this.field3469.method144(0, 0, 3, false, 17101, false);
        this.field3469.field260.method1593(-110);
        this.method1513((byte) -11);
        this.method1558(1);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)V")
    public final void method1240(boolean arg0) {
        this.field3537 = arg0;
        ++field3414;
        this.method1555(1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lui;I)V")
    public final void method1524(class383 arg0, int arg1) {
        ++field3353;
        if (this.field3593 != arg0) {
            if (this.field3562) {
                OpenGL.glBindBufferARB(34962, arg0.method132(123));
            }
            this.field3593 = arg0;
        }
        if (arg1 != 1) {
            this.field3488 = 118;
        }
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(Z)V")
    public static final void method1525(boolean arg0) {
        ++field3378;
        class7.field82.method1128(-55);
        class136.field1848.method1128(36);
        if (arg0) {
            field3397 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3) {
        ++field3393;
        if (!this.field3574) {
            throw new RuntimeException("");
        } else {
            this.field3570 = arg2;
            this.field3541 = arg3;
            this.field3559 = arg1;
            this.field3547 = arg0;
            this.field3469.field260.method1593(-128);
            this.method1513((byte) -11);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)Ln;")
    public final class517 method1285(int arg0) {
        ++field3356;
        class457 var2 = new class457(arg0);
        this.field3481.method2124(var2, (byte) -37);
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Laq;[Lok;Z)Lla;")
    public final class299 method1246(class340 arg0, class175[] arg1, boolean arg2) {
        ++field3294;
        return new class43(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(B)V")
    private final void method1526(byte arg0) {
        if (arg0 < -126) {
            ++field3449;
            this.method1553(-2, true);
            for (int var2 = this.field3556 - 1; var2 >= 0; --var2) {
                this.method1507(var2, 0);
                this.method1540(80, (class427) null);
                OpenGL.glTexEnvi(8960, 8704, 34160);
            }
            this.method1568(8448, 2896, 8448);
            this.method1498(34192, 2, 34168, 770);
            this.method1569(-128);
            this.field3544 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field3606 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field3552 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field3590 = true;
            this.method1563(1205, true);
            this.method1504(true, -2414);
            this.method1572(true, -32);
            this.method1571(true, (byte) -58);
            this.method1561(93);
            this.field3382.setSwapInterval(0);
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
            this.field3521 = this.field3508 = -1;
            this.method1228();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FFF)V")
    public final void method1325(float arg0, float arg1, float arg2) {
        ++field3297;
        class108.field1550 = arg2;
        class168.field2455 = arg1;
        class368.field5685 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "v", descriptor = "(III[I)V")
    public final void method1305(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3407;
        float var5 = (float) arg2 * this.field3585.field1299 + (float) arg0 * this.field3585.field1297 + (float) arg1 * this.field3585.field1310 + this.field3585.field1287;
        if (!((float) this.field3550 > var5) && !(var5 > (float) this.field3516)) {
            int var6 = (int) (((float) arg2 * this.field3585.field1292 + (float) arg0 * this.field3585.field1296 + (float) arg1 * this.field3585.field1289 + this.field3585.field1288) * (float) this.field3579 / var5);
            int var7 = (int) (((float) arg2 * this.field3585.field1312 + (float) arg0 * this.field3585.field1301 + (float) arg1 * this.field3585.field1305 + this.field3585.field1307) * (float) this.field3591 / var5);
            if ((float) var6 >= this.field3514 && (float) var6 <= this.field3567 && (float) var7 >= this.field3519 && this.field3540 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field3519);
                arg3[0] = (int) ((float) var6 + -this.field3514);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I[Las;)V")
    public final void method1242(int arg0, class415[] arg1) {
        ++field3277;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3584[var3] = arg1[var3];
        }
        this.field3506 = arg0;
        if (this.field3573 != 1) {
            this.method1527(-13118);
        }
    }

    @OriginalMember(owner = "client!na", name = "aa", descriptor = "()F")
    public final float method1328() {
        ++field3423;
        return this.field3510;
    }

    @OriginalMember(owner = "client!na", name = "n", descriptor = "(I)V")
    private final void method1527(int arg0) {
        ++field3352;
        int var2;
        for (var2 = 0; var2 < this.field3506; ++var2) {
            class415 var3 = this.field3584[var2];
            class443.field6881[0] = (float) var3.method2650(119);
            int var4 = var2 + 16386;
            class443.field6881[1] = (float) var3.method2645(121);
            class443.field6881[2] = (float) var3.method2654(0);
            class443.field6881[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class443.field6881, 0);
            int var5 = var3.method2647(arg0 + 13082);
            float var6 = var3.method2648(false) / 255.0F;
            class443.field6881[0] = var6 * (float) (class272.method1842(16724321, var5) >> 16);
            class443.field6881[1] = var6 * (float) class272.method1842(255, var5 >> 8);
            class443.field6881[2] = (float) class272.method1842(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class443.field6881, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2651(-114) * var3.method2651(-118)));
            OpenGL.glEnable(var4);
        }
        if (arg0 == -13118) {
            while (~var2 > ~this.field3596) {
                OpenGL.glDisable(16386 - -var2);
                ++var2;
            }
            this.field3596 = this.field3506;
        }
    }

    @OriginalMember(owner = "client!na", name = "o", descriptor = "(I)V")
    private final void method1528(int arg0) {
        ++field3303;
        if (this.field3569 && !this.field3557) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 30585) {
            this.method1290(121, 69, 26, 6);
        }
    }

    @OriginalMember(owner = "client!na", name = "w", descriptor = "()Z")
    public final boolean method1267() {
        ++field3309;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "p", descriptor = "(I)V")
    public final void method1529(int arg0) {
        if (arg0 == 34166) {
            if (this.field3592 != 2) {
                this.method1509(true);
                this.method1563(1205, false);
                this.method1504(false, -2414);
                this.method1572(false, -32);
                this.method1571(false, (byte) -101);
                this.method1553(-2, true);
                this.field3592 = 2;
            }
            ++field3323;
        }
    }

    @OriginalMember(owner = "client!na", name = "va", descriptor = "()V")
    public final void method1228() {
        this.field3527 = 0;
        this.field3503 = this.field3433;
        this.field3587 = 0;
        this.field3554 = this.field3368;
        ++field3434;
        OpenGL.glDisable(3089);
        this.method1523(true);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    public final int method1294(int arg0, int arg1) {
        ++field3347;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(II)I")
    public final int method1530(int arg0, int arg1) {
        ++field3387;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg1 != 5126) {
                this.method1547(-25, -92, false);
            }
            if (arg0 != 5123 && ~arg0 != -5123) {
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

    @OriginalMember(owner = "client!na", name = "i", descriptor = "()V")
    public final void method1319() {
        if (this.field3467 != null && this.field3467.method2360((byte) -84)) {
            this.field3468.method466(this.field3467, 2);
            this.field3466.method1884(0);
        }
        ++field3427;
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "()Z")
    public final boolean method1239() {
        ++field3391;
        return this.field3467 != null && this.field3467.method2360((byte) -84);
    }

    @OriginalMember(owner = "client!na", name = "AA", descriptor = "()I")
    public final int method1298() {
        ++field3335;
        return this.field3550;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    public final void method1274(int arg0) {
        ++field3371;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()Z")
    public final boolean method1279() {
        ++field3408;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "v", descriptor = "()V")
    public final void method1310() {
        for (class529 var1 = this.field3481.method2123(122); var1 != null; var1 = this.field3481.method2126((byte) 61)) {
            ((class457) var1).method2868(-7273);
        }
        ++field3291;
        if (this.field3468 != null) {
            this.field3468.method455(115);
        }
        if (this.field3382 != null) {
            this.method1574(true);
            Enumeration var2 = this.field3346.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3346.get(var3);
                this.field3382.releaseSurface(var3, var4);
            }
            this.field3382.release();
            this.field3382 = null;
        }
        if (this.field3479) {
            class269.method1825(true, 1, false);
            this.field3479 = false;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3340;
    }

    @OriginalMember(owner = "client!na", name = "z", descriptor = "()Z")
    public final boolean method1312() {
        ++field3390;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIII)V")
    public final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3440;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method1499(1);
        this.method1566((byte) 95, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3614) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3614) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!na", name = "u", descriptor = "()Z")
    public final boolean method1296() {
        ++field3316;
        return this.field3467 != null && (this.field3470 <= 1 || this.field3526);
    }

    @OriginalMember(owner = "client!na", name = "A", descriptor = "()Z")
    public final boolean method1304() {
        ++field3455;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "q", descriptor = "(I)V")
    private final void method1531(int arg0) {
        OpenGL.glLoadIdentity();
        ++field3320;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field3585.method612(false), 0);
        if (arg0 != 8) {
            this.method1538((byte) -38, (class125) null);
        }
        if (this.field3574) {
            this.field3469.field260.method1593(arg0 ^ -88);
        }
        this.method1532(-105);
        this.method1527(-13118);
    }

    @OriginalMember(owner = "client!na", name = "r", descriptor = "(I)V")
    public final void method1532(int arg0) {
        ++field3324;
        OpenGL.glLightfv(16384, 4611, this.field3572, 0);
        OpenGL.glLightfv(16385, 4611, this.field3619, 0);
        if (arg0 >= -94) {
            this.method1280(55, 104, 91, 62, 87, -53, -93);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILnf;)V")
    public final void method1533(int arg0, class89 arg1) {
        ++field3430;
        OpenGL.glLoadMatrixf(arg1.method612(false), arg0);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)I")
    public final int method1534(int arg0, byte arg1) {
        if (arg1 < 109) {
            return -89;
        } else {
            ++field3319;
            if (arg0 == 1) {
                return 7681;
            } else if (arg0 != 0) {
                if (arg0 == 2) {
                    return 34165;
                } else if (arg0 == 3) {
                    return 260;
                } else if (arg0 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "s", descriptor = "(I)V")
    private final void method1535(int arg0) {
        if (arg0 == 1000) {
            ++field3416;
            int var2 = 0;
            while (!this.field3382.attach()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class208.method1464((byte) -99, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "ra", descriptor = "(ILta;II)V")
    public final void method1323(int arg0, class453 arg1, int arg2, int arg3) {
        ++field3359;
        class387 var5 = (class387) arg1;
        class508 var6 = var5.field5904;
        this.method1529(34166);
        this.method1540(73, var5.field5904);
        this.method1566((byte) 95, 1);
        this.method1568(8448, 2896, 7681);
        this.method1498(34192, 0, 34167, 768);
        float var7 = var6.field7578 / (float) var6.field7575;
        float var8 = var6.field7580 / (float) var6.field7581;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3527) * var7, (float) (-arg3 + this.field3587) * var8);
        OpenGL.glVertex2i(this.field3527, this.field3587);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3527) * var7, (float) (-arg3 + this.field3503) * var8);
        OpenGL.glVertex2i(this.field3527, this.field3503);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3554) * var7, (float) (-arg3 + this.field3503) * var8);
        OpenGL.glVertex2i(this.field3554, this.field3503);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3554) * var7, (float) (this.field3587 - arg3) * var8);
        OpenGL.glVertex2i(this.field3554, this.field3587);
        OpenGL.glEnd();
        this.method1498(34192, 0, 5890, 768);
    }

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lc;)V")
    public final void method1314(class205 arg0) {
        ++field3461;
        this.field3585 = (class89) arg0;
        this.field3515.method611(this.field3585, 16156);
        if (this.field3573 != 1) {
            this.method1531(8);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BFFF)V")
    private final void method1536(byte arg0, float arg1, float arg2, float arg3) {
        ++field3417;
        OpenGL.glMatrixMode(5890);
        if (this.field3604) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg1, arg2);
        if (arg0 == -91) {
            OpenGL.glMatrixMode(5888);
            this.field3604 = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltb;IIII)V")
    public final void method1537(class347 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3302;
        int var6 = arg0.method749(51);
        int var7 = arg1 * this.method1530(var6, 5126);
        this.method1520(arg0, true);
        OpenGL.glDrawElements(arg4, arg3, var6, arg0.method744((byte) -108) - -((long) var7));
        if (arg2 != 0) {
            this.method1557(0.108729124F, -127);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lok;Z)Lo;")
    public final class139 method1278(class175 arg0, boolean arg1) {
        ++field3395;
        int[] var3 = new int[arg0.field2577 * arg0.field2576];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2572 != null) {
            for (int var6 = 0; arg0.field2577 > var6; ++var6) {
                for (int var7 = 0; arg0.field2576 > var7; ++var7) {
                    var3[var5++] = class410.method2621(arg0.field2571[class272.method1842(255, arg0.field2574[var4])], arg0.field2572[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field2577; ++var8) {
                for (int var10 = 0; ~arg0.field2576 < ~var10; ++var10) {
                    int var11 = arg0.field2571[arg0.field2574[var4++] & 255];
                    var3[var5++] = var11 != 0 ? class410.method2621(var11, -16777216) : 0;
                }
            }
        }
        class139 var9 = this.method1232(var3, 0, arg0.field2576, arg0.field2576, arg0.field2577);
        var9.method627(arg0.field2575, arg0.field2579, arg0.field2573, arg0.field2578);
        return var9;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BLpv;)V")
    public final void method1538(byte arg0, class125 arg1) {
        ++field3428;
        if (this.field3488 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field3488 >= 0) {
                this.field3486[this.field3488].method778(14);
            }
            if (arg0 > 13) {
                this.field3492 = this.field3486[++this.field3488] = arg1;
                this.field3492.method781((byte) -70);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public final void method1265(int arg0) {
        ++field3376;
        this.method1535(1000);
    }

    @OriginalMember(owner = "client!na", name = "ya", descriptor = "(I)V")
    public final void method1335(int arg0) {
        ++field3280;
        this.field3483 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field3483;
        }
        this.field3482 = 1 << this.field3483;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIB)V")
    public final void method1539(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 114) {
            this.field3535 = 54;
        }
        ++field3405;
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILed;)V")
    public final void method1540(int arg0, class427 arg1) {
        ++field3445;
        class427 var3 = this.field3543[this.field3601];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (~arg1.field6455 != ~var3.field6455) {
                        OpenGL.glDisable(var3.field6455);
                        OpenGL.glEnable(arg1.field6455);
                    }
                } else {
                    OpenGL.glEnable(arg1.field6455);
                }
                OpenGL.glBindTexture(arg1.field6455, arg1.method2706(28722));
            } else {
                OpenGL.glDisable(var3.field6455);
            }
            this.field3543[this.field3601] = arg1;
        }
        if (arg0 <= 34) {
            this.field3556 = 18;
        }
        this.field3592 &= -2;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
    public final void method1250(boolean arg0) {
        ++field3330;
    }

    @OriginalMember(owner = "client!na", name = "u", descriptor = "(I)V")
    public final void method1541(int arg0) {
        ++field3402;
        OpenGL.glPopMatrix();
        if (arg0 > -119) {
            this.method1287(-1);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(IIIIII)Lmt;")
    public final class321 method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3453;
        return !this.field3525 ? null : new class171(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILpb;)V")
    public class211(int arg0, Canvas arg1, class199 arg2, int arg3, class2 arg4) {
        super(arg0, arg2);
        new class434();
        new class177(16);
        this.field3496 = new class317();
        this.field3497 = new class317();
        this.field3498 = new class317();
        this.field3499 = new class317();
        this.field3500 = new class317();
        this.field3501 = new class317();
        this.field3502 = new class317();
        this.field3508 = -1;
        this.field3516 = 3584;
        this.field3512 = 1.0F;
        this.field3521 = -1;
        this.field3541 = 0;
        this.field3536 = 1.0F;
        this.field3538 = 0;
        this.field3503 = 0;
        this.field3530 = 3000.0F;
        this.field3551 = new float[16];
        this.field3539 = 1.0F;
        this.field3563 = -1;
        this.field3559 = -1;
        this.field3558 = -1.0F;
        this.field3534 = 8448;
        this.field3579 = 512;
        this.field3575 = 8448;
        this.field3527 = 0;
        this.field3554 = 0;
        this.field3550 = 50;
        this.field3584 = new class415[class34.field354];
        this.field3587 = 0;
        this.field3594 = 0;
        this.field3577 = new float[4];
        this.field3564 = 0;
        this.field3588 = 1.0F;
        this.field3597 = 3584.0F;
        this.field3572 = new float[4];
        this.field3595 = 0.0F;
        this.field3598 = -1.0F;
        this.field3520 = 0;
        this.field3570 = -1;
        this.field3610 = new float[4];
        this.field3537 = true;
        this.field3581 = 0;
        this.field3611 = 1.0F;
        this.field3615 = 3584.0F;
        this.field3591 = 512;
        this.field3619 = new float[4];
        this.field3617 = new class302(8192);
        this.field3621 = new int[1];
        this.field3625 = new int[1];
        this.field3623 = new int[1];
        this.field3626 = new byte[16384];
        this.field3470 = arg3;
        this.field3442 = this.field3342 = arg1;
        try {
            if (class79.field1181 == null || !class79.field1181) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class79.field1181 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method10(8, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method10(8, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method10(8, "libjaggl.so").toString());
                    }
                    class79.field1181 = Boolean.TRUE;
                }
            }
            if (class79.field1181 != null && class79.field1181) {
                this.field3382 = new OpenGL();
                this.field3289 = this.field3400 = this.field3382.init(arg1, 8, 8, 8, 24, 0, this.field3470);
                if (this.field3400 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method1535(1000);
                    int var7 = this.method1562((byte) 90);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field3609 = !this.field3560 ? 5121 : 33639;
                        if (this.field3509.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class506.method3074((byte) 127, this.field3509.replace('/', ' '), ' ');
                            for (int var12 = 0; var11.length > var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class471.method2929(true, var13.substring(1, 3))) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (var13.length() >= 4 && class471.method2929(true, var13.substring(0, 4))) {
                                                var8 = class170.method1078(-108, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field3600 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field3562 = false;
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field3565 = false;
                            }
                            this.field3549 &= this.field3382.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field3542 = this.field3562;
                            this.field3612 = true;
                        }
                        if (this.field3522.indexOf("intel") != -1) {
                            this.field3529 = false;
                        }
                        this.field3511 = !this.field3522.equals("s3 graphics");
                        if (this.field3562) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class279.method1873(25503, true, false);
                        this.field3479 = true;
                        this.field3466 = new class280(this, super.field7480);
                        this.method1508((byte) -107);
                        this.field3478 = new class1(this);
                        this.field3468 = new class62(this);
                        if (this.field3468.method463(-126)) {
                            this.field3467 = new class429(this);
                            if (!this.field3467.method2717(-19)) {
                                this.field3467.method2359((byte) 83);
                                this.field3467 = null;
                            }
                        }
                        this.field3469 = new class23(this);
                        this.method1526((byte) -128);
                        this.method1552(true);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field3382.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class208.method1464((byte) -74, 100L);
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
            this.method1310();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!na", name = "v", descriptor = "(I)V")
    public final void method1542(int arg0) {
        if (this.field3592 != arg0) {
            this.method1510((byte) -117);
            this.method1563(1205, true);
            this.method1572(true, -32);
            this.method1571(true, (byte) -101);
            this.method1566((byte) 95, 1);
            this.method1494(0, -25951);
            this.field3592 = 16;
        }
        ++field3386;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IIII)V")
    public final void method1281(int arg0, int arg1, int arg2, int arg3) {
        this.field3468.method462(arg0, true, arg1, arg2, arg3);
        ++field3345;
    }

    @OriginalMember(owner = "client!na", name = "q", descriptor = "()V")
    public final void method1264() {
        ++field3380;
        this.field3468.method465((byte) -91);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class453 arg6, int arg7, int arg8) {
        ++field3435;
        class387 var10 = (class387) arg6;
        class508 var11 = var10.field5904;
        this.method1529(34166);
        this.method1540(114, var10.field5904);
        this.method1566((byte) 95, arg5);
        this.method1568(8448, 2896, 7681);
        this.method1498(34192, 0, 34167, 768);
        float var12 = var11.field7578 / (float) var11.field7575;
        float var13 = var11.field7580 / (float) var11.field7581;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method1498(34192, 0, 5890, 768);
    }

    @OriginalMember(owner = "client!na", name = "n", descriptor = "()V")
    public final void method1245() {
        this.field3574 = false;
        ++field3321;
        this.field3469.method144(0, 0, 0, false, 17101, false);
        this.method1513((byte) -11);
        this.method1558(1);
    }

    @OriginalMember(owner = "client!na", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3465;
        float var10;
        float var11;
        if (this.field3608 != null && ~arg2 >= ~this.field3608.field7799 && ~this.field3608.field7803 <= ~arg3) {
            this.field3608.method3164(0, arg2, 0, 6406, arg6, false, arg3, 0, 0, true);
            var10 = (float) arg2 * this.field3608.field7578 / (float) this.field3608.field7799;
            var11 = (float) arg3 * this.field3608.field7580 / (float) this.field3608.field7803;
        } else {
            this.field3608 = class502.method3056(false, this, 6406, 6406, arg6, arg2, arg3, (byte) -82);
            this.field3608.method3160(false, (byte) 50, false);
            var11 = this.field3608.field7580;
            var10 = this.field3608.field7578;
        }
        this.method1529(34166);
        this.method1540(56, this.field3608);
        this.method1566((byte) 95, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1550((byte) -122, arg5);
        this.method1568(34165, 2896, 34165);
        this.method1498(34192, 0, 34166, 768);
        this.method1498(34192, 2, 5890, 770);
        this.method1539(0, 34166, 770, (byte) 120);
        this.method1539(2, 5890, 770, (byte) 122);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method1498(34192, 0, 5890, 768);
        this.method1498(34192, 2, 34166, 770);
        this.method1539(0, 5890, 770, (byte) 117);
        this.method1539(2, 34166, 770, (byte) 127);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Le;Ldm;Lc;Lkk;I)V")
    public final void method1291(class536 arg0, class519 arg1, class205 arg2, class182 arg3, int arg4) {
        ++field3419;
        arg0.method295(arg2, arg3, arg4);
        this.method1306(arg1);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public final void method1288(int arg0) {
        ++field3310;
        this.method1574(true);
    }

    @OriginalMember(owner = "client!na", name = "i", descriptor = "(B)V")
    private final void method1543(byte arg0) {
        int var2 = -18 % ((-42 - arg0) / 49);
        ++field3463;
        if (~this.field3527 >= ~this.field3554 && ~this.field3587 >= ~this.field3503) {
            OpenGL.glScissor(this.field3581 + this.field3527, -this.field3503 + this.field3594 + this.field3433, -this.field3527 + this.field3554, -this.field3587 + this.field3503);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII[BZ)Lui;")
    public final class383 method1544(boolean arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field3452;
        if (arg0) {
            this.method1302((class536[]) null, (class519) null, (class205) null, (class182[]) null, 11);
        }
        return (class383) (!this.field3562 || arg4 && !this.field3542 ? new class260(this, arg1, arg3, arg2) : new class21(this, arg1, arg3, arg2, arg4));
    }

    @OriginalMember(owner = "client!na", name = "ma", descriptor = "(IIIII)V")
    public final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1499(1);
        ++field3420;
        this.method1566((byte) 95, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!na", name = "j", descriptor = "(B)V")
    private final void method1545(byte arg0) {
        class4.field43[1] = this.field3598 * this.field3512;
        ++field3398;
        class4.field43[3] = 1.0F;
        class4.field43[2] = this.field3598 * this.field3539;
        class4.field43[0] = this.field3611 * this.field3598;
        OpenGL.glLightfv(16384, 4609, class4.field43, 0);
        class4.field43[3] = 1.0F;
        if (arg0 >= 21) {
            class4.field43[0] = -this.field3558 * this.field3611;
            class4.field43[1] = -this.field3558 * this.field3512;
            class4.field43[2] = -this.field3558 * this.field3539;
            OpenGL.glLightfv(16385, 4609, class4.field43, 0);
        }
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "(B)V")
    private final void method1546(byte arg0) {
        if (this.field3510 == 0.0F) {
            this.field3551[10] = this.field3576;
            this.field3551[14] = this.field3507;
        } else {
            float var2 = this.field3530 / (this.field3530 + this.field3510);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field3507 * (-var2 + 1.0F) / this.field3510;
            this.field3551[14] = this.field3507 * var3;
            this.field3551[10] = this.field3576 + var4;
        }
        ++field3456;
        if (arg0 != 61) {
            this.method1235(86, 75, -97, -43, -83);
        }
        this.field3597 = (this.field3551[14] - (float) this.field3516) / this.field3551[10];
        this.field3615 = (float) this.field3516 - this.field3510;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method1547(int arg0, int arg1, boolean arg2) {
        ++field3436;
        if (!arg2) {
            this.method1335(45);
        }
        class330 var4 = new class330(arg1);
        var4.field7780 = (long) arg0;
        this.field3500.method2124(var4, (byte) 101);
    }

    @OriginalMember(owner = "client!na", name = "x", descriptor = "()Z")
    public final boolean method1283() {
        ++field3278;
        return false;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldb;Ldb;Ldb;ILdb;)V")
    public final void method1548(class67 arg0, class67 arg1, class67 arg2, int arg3, class67 arg4) {
        if (arg3 == 32886) {
            ++field3394;
            if (arg1 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method1524(arg1.field1022, arg3 ^ 32887);
                OpenGL.glVertexPointer(arg1.field1024, arg1.field1029, this.field3593.method135((byte) -116), this.field3593.method133((byte) -111) - -((long) arg1.field1023));
                OpenGL.glEnableClientState(32884);
            }
            if (arg4 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method1524(arg4.field1022, 1);
                OpenGL.glNormalPointer(arg4.field1029, this.field3593.method135((byte) -113), this.field3593.method133((byte) -103) + (long) arg4.field1023);
                OpenGL.glEnableClientState(32885);
            }
            if (arg0 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method1524(arg0.field1022, 1);
                OpenGL.glColorPointer(arg0.field1024, arg0.field1029, this.field3593.method135((byte) -122), this.field3593.method133((byte) -114) + (long) arg0.field1023);
                OpenGL.glEnableClientState(32886);
            }
            if (arg2 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method1524(arg2.field1022, 1);
                OpenGL.glTexCoordPointer(arg2.field1024, arg2.field1029, this.field3593.method135((byte) 23), this.field3593.method133((byte) -95) - -((long) arg2.field1023));
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "(III)V")
    public final void method1297(int arg0, int arg1, int arg2) {
        ++field3308;
        if (~this.field3508 != ~arg0 || this.field3563 != arg1 || this.field3564 != arg2) {
            this.field3508 = arg0;
            this.field3564 = arg2;
            this.field3563 = arg1;
            if (this.field3574) {
                return;
            }
            this.method1513((byte) -11);
            this.method1558(1);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(II)V")
    public final void method1257(int arg0, int arg1) {
        ++field3283;
        if (~this.field3550 != ~arg0 || this.field3516 != arg1) {
            this.field3516 = arg1;
            this.field3550 = arg0;
            this.method1516(15915);
            this.method1513((byte) -11);
            if (~this.field3573 != -4) {
                if (this.field3573 == 2) {
                    this.method1575((byte) 120);
                    return;
                }
            } else {
                this.method1505((byte) -98);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "()I")
    public final int method1276() {
        ++field3437;
        int var1 = this.field3624;
        this.field3624 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "OA", descriptor = "()I")
    public final int method1327() {
        ++field3314;
        int var1 = this.field3622;
        this.field3622 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3381;
        OpenGL.glLineWidth((float) arg5);
        this.method1262(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BII)V")
    public final synchronized void method1549(byte arg0, int arg1, int arg2) {
        ++field3312;
        class330 var4 = new class330(arg1);
        var4.field7780 = (long) arg2;
        this.field3498.method2124(var4, (byte) 109);
        if (arg0 <= 86) {
            this.method1296();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
    public final void method1550(byte arg0, int arg1) {
        ++field3441;
        class4.field43[2] = (float) class272.method1842(255, arg1) / 255.0F;
        class4.field43[3] = (float) (arg1 >>> 24) / 255.0F;
        if (arg0 != -122) {
            this.field3503 = -89;
        }
        class4.field43[1] = (float) class272.method1842(arg1, 65280) / 65280.0F;
        class4.field43[0] = (float) class272.method1842(arg1, 16711680) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class4.field43, 0);
    }

    @OriginalMember(owner = "client!na", name = "m", descriptor = "()Lc;")
    public final class205 method1231() {
        ++field3404;
        return this.field3476;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public final void method1244(int arg0) {
        ++field3406;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field3474 = arg0;
            this.field3466.method1884(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BII)V")
    public final synchronized void method1551(byte arg0, int arg1, int arg2) {
        ++field3460;
        class330 var4 = new class330(arg2);
        var4.field7780 = (long) arg1;
        if (arg0 == -44) {
            this.field3497.method2124(var4, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(Z)V")
    private final void method1552(boolean arg0) {
        if (!arg0) {
            this.method1256();
        }
        if (this.field3442 == null) {
            this.field3331 = this.field3333 = 0;
        } else {
            Dimension var2 = this.field3442.getSize();
            this.field3331 = var2.width;
            this.field3333 = var2.height;
        }
        ++field3299;
        if (this.field3487 == null) {
            this.field3433 = this.field3333;
            this.field3368 = this.field3331;
            this.method1518(true);
        }
        this.method1561(-84);
        this.method1228();
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "()Z")
    public final boolean method1241() {
        ++field3385;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "T", descriptor = "()F")
    public final float method1268() {
        ++field3355;
        return this.field3530;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class223 method1236(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3459;
        return new class102(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
    public final void method1553(int arg0, boolean arg1) {
        ++field3285;
        this.method1497(22387, arg1, arg0);
    }

    @OriginalMember(owner = "client!na", name = "l", descriptor = "(B)V")
    private final void method1554(byte arg0) {
        class4.field43[2] = this.field3613 * this.field3539;
        class4.field43[1] = this.field3613 * this.field3512;
        ++field3326;
        class4.field43[3] = 1.0F;
        class4.field43[0] = this.field3613 * this.field3611;
        if (arg0 < 116) {
            this.method1534(72, (byte) -15);
        }
        OpenGL.glLightModelfv(2899, class4.field43, 0);
    }

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(I)V")
    private final void method1555(int arg0) {
        OpenGL.glDepthMask(this.field3553 && this.field3537);
        ++field3375;
        if (arg0 != 1) {
            this.field3520 = 90;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JB)V")
    public final synchronized void method1556(long arg0, byte arg1) {
        if (arg1 != -64) {
            this.method1273(-26, -94, 20, 99, -98, 78);
        }
        ++field3287;
        class529 var4 = new class529();
        var4.field7780 = arg0;
        this.field3502.method2124(var4, (byte) 127);
    }

    @OriginalMember(owner = "client!na", name = "s", descriptor = "()I")
    public final int method1324() {
        ++field3418;
        return 4;
    }

    @OriginalMember(owner = "client!na", name = "IA", descriptor = "(IIIII)V")
    public final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3422;
        this.method1499(1);
        this.method1566((byte) 95, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!na", name = "ba", descriptor = "(IIII)V")
    public final void method1307(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field3433 > ~arg3) {
            arg3 = this.field3433;
        }
        if (arg2 > this.field3368) {
            arg2 = this.field3368;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field3438;
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field3554 = arg2;
        this.field3587 = arg1;
        this.field3503 = arg3;
        this.field3527 = arg0;
        OpenGL.glEnable(3089);
        this.method1523(true);
        this.method1543((byte) 32);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FI)V")
    public final void method1557(float arg0, int arg1) {
        int var3 = -29 / ((arg1 - 66) / 57);
        ++field3365;
        if (this.field3588 != arg0) {
            this.field3588 = arg0;
            if (this.field3573 == 3) {
                this.method1505((byte) -98);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "l", descriptor = "()V")
    public final void method1255() {
        ++field3290;
        try {
            this.field3382.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!na", name = "x", descriptor = "(I)V")
    private final void method1558(int arg0) {
        ++field3457;
        if (arg0 == 1) {
            if (this.field3533 && this.field3574 | ~this.field3563 <= -1) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "y", descriptor = "(I)V")
    public final void method1559(int arg0) {
        if (arg0 != -15631) {
            this.method1230((Canvas) null);
        }
        if (this.field3592 != 8) {
            this.method1495((byte) -81);
            this.method1563(1205, true);
            this.method1572(true, -32);
            this.method1571(true, (byte) -84);
            this.method1566((byte) 95, 1);
            this.method1494(0, -25951);
            this.field3592 = 8;
        }
        ++field3367;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
    public final void method1560(int arg0, int arg1, int arg2) {
        this.field3581 = arg1;
        ++field3379;
        this.field3594 = arg0;
        this.method1518(true);
        this.method1543((byte) 60);
        if (arg2 != -29807) {
            this.field3555 = 83;
        }
    }

    @OriginalMember(owner = "client!na", name = "z", descriptor = "(I)V")
    public final void method1561(int arg0) {
        int var2 = -108 % ((arg0 - -31) / 45);
        if (~this.field3573 != -1) {
            this.field3573 = 0;
            this.field3592 &= -32;
        }
        ++field3313;
    }

    @OriginalMember(owner = "client!na", name = "m", descriptor = "(B)I")
    private final int method1562(byte arg0) {
        ++field3357;
        int var2 = 0;
        this.field3522 = OpenGL.glGetString(7936).toLowerCase();
        this.field3509 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field3522.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field3522.indexOf("brian paul") != -1 || this.field3522.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class506.method3074((byte) 123, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class170.method1078(-87, var4[0]);
                int var6 = class170.method1078(-96, var4[1]);
                this.field3616 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field3616 < 12) {
            var2 |= 2;
        }
        if (!this.field3382.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3382.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3556 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3555 = var7[0];
        if (arg0 != 90) {
            this.field3331 = -5;
        }
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3599 = var7[0];
        if (~this.field3556 > -3 || ~this.field3555 > -3 || this.field3599 < 2) {
            var2 |= 16;
        }
        this.field3560 = NativeStream.method114();
        this.field3382.arePbuffersAvailable();
        this.field3562 = this.field3382.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3614 = this.field3382.isExtensionAvailable("GL_ARB_multisample");
        this.field3513 = this.field3382.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3382.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3504 = this.field3382.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3545 = this.field3382.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3600 = this.field3382.isExtensionAvailable("GL_EXT_texture3D");
        this.field3549 = this.field3382.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3525 = this.field3382.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3565 = this.field3382.isExtensionAvailable("GL_ARB_texture_float");
        this.field3618 = false;
        this.field3529 = this.field3382.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field3518 = this.field3382.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field3531 = this.field3382.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field3526 = this.field3518 & this.field3531;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IZ)V")
    public final void method1563(int arg0, boolean arg1) {
        if (!this.field3533 == arg1) {
            this.field3533 = arg1;
            this.method1558(1);
            this.field3592 &= -32;
        }
        ++field3332;
        if (arg0 != 1205) {
            this.field3368 = 36;
        }
    }

    @OriginalMember(owner = "client!na", name = "h", descriptor = "(II)V")
    public final synchronized void method1564(int arg0, int arg1) {
        ++field3305;
        class529 var3 = new class529();
        int var4 = 90 / ((-58 - arg1) / 56);
        var3.field7780 = (long) arg0;
        this.field3501.method2124(var3, (byte) -109);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lpv;I)V")
    public final void method1565(class125 arg0, int arg1) {
        int var3 = -27 / ((arg1 - -60) / 57);
        ++field3364;
        if (this.field3491 >= 0 && this.field3485[this.field3491] == arg0) {
            this.field3485[this.field3491--] = null;
            arg0.method779(-23670);
            if (this.field3491 < 0) {
                this.field3487 = null;
            } else {
                this.field3487 = this.field3485[this.field3491];
                this.field3487.method782(-110);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIII)V")
    public final void method1262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3276;
        this.method1499(1);
        this.method1566((byte) 95, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1230(Canvas arg0) {
        ++field3439;
        this.field3289 = 0L;
        this.field3442 = null;
        if (arg0 != null && this.field3342 != arg0) {
            if (this.field3346.containsKey(arg0)) {
                Long var2 = (Long) this.field3346.get(arg0);
                this.field3289 = var2;
                this.field3442 = arg0;
            }
        } else {
            this.field3442 = this.field3342;
            this.field3289 = this.field3400;
        }
        if (this.field3442 != null && ~this.field3289 != -1L) {
            this.field3382.setSurface(this.field3289);
            this.method1552(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!na", name = "t", descriptor = "()V")
    public final void method1315() {
        ++field3403;
        if (this.field3511 && ~this.field3368 < -1 && ~this.field3433 < -1) {
            int var1 = this.field3527;
            int var2 = this.field3554;
            int var3 = this.field3587;
            int var4 = this.field3503;
            this.method1228();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1561(-105);
            this.method1563(1205, false);
            this.method1504(false, -2414);
            this.method1572(false, -32);
            this.method1571(false, (byte) -76);
            this.method1540(117, (class427) null);
            this.method1553(-2, true);
            this.method1494(1, -25951);
            this.method1566((byte) 95, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3368, this.field3433, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1307(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!na", name = "k", descriptor = "()V")
    public final void method1293() {
        ++field3327;
    }

    @OriginalMember(owner = "client!na", name = "da", descriptor = "(FF)V")
    public final void method1309(float arg0, float arg1) {
        if (this.field3530 != arg0 || this.field3510 != arg1) {
            this.field3530 = arg0;
            this.field3510 = arg1;
            this.method1546((byte) 61);
            if (this.field3573 != 3) {
                if (~this.field3573 == -3) {
                    this.method1575((byte) 110);
                }
            } else {
                this.method1505((byte) -98);
            }
        }
        ++field3318;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1243(Rectangle[] arg0, int arg1) {
        ++field3448;
        this.method1255();
    }

    @OriginalMember(owner = "client!na", name = "MA", descriptor = "([I)V")
    public final void method1237(int[] arg0) {
        arg0[1] = this.field3587;
        ++field3351;
        arg0[2] = this.field3554;
        arg0[3] = this.field3503;
        arg0[0] = this.field3527;
    }

    @OriginalMember(owner = "client!na", name = "HA", descriptor = "(IIII)V")
    public final void method1290(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3503 > arg3) {
            this.field3503 = arg3;
        }
        if (~arg2 > ~this.field3554) {
            this.field3554 = arg2;
        }
        if (this.field3527 < arg0) {
            this.field3527 = arg0;
        }
        if (this.field3587 < arg1) {
            this.field3587 = arg1;
        }
        ++field3341;
        OpenGL.glEnable(3089);
        this.method1523(true);
        this.method1543((byte) -119);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(BI)V")
    public final void method1566(byte arg0, int arg1) {
        ++field3366;
        if (arg0 == 95) {
            if (this.field3544 != arg1) {
                boolean var3;
                boolean var4;
                byte var5;
                if (~arg1 == -2) {
                    var3 = true;
                    var4 = true;
                    var5 = 1;
                } else if (arg1 == 2) {
                    var4 = false;
                    var5 = 2;
                    var3 = true;
                } else if (~arg1 == -129) {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                } else {
                    var3 = true;
                    var4 = false;
                    var5 = 0;
                }
                if (!this.field3590 == var3) {
                    OpenGL.glColorMask(var3, var3, var3, true);
                    this.field3590 = var3;
                }
                if (!var4 == this.field3552) {
                    if (!var4) {
                        OpenGL.glDisable(3008);
                    } else {
                        OpenGL.glEnable(3008);
                    }
                    this.field3552 = var4;
                }
                if (this.field3606 != var5) {
                    if (~var5 == -2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    } else if (~var5 != -3) {
                        if (var5 != 3) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                    this.field3606 = var5;
                }
                this.field3592 &= -29;
                this.field3544 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "B", descriptor = "()Z")
    public final boolean method1233() {
        ++field3392;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(IIII)V")
    public final void method1567(int arg0, int arg1, int arg2, int arg3) {
        ++field3388;
        if (arg1 != -100663297) {
            this.method1244(116);
        }
        OpenGL.glDrawArrays(arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
    public final void method1568(int arg0, int arg1, int arg2) {
        if (~this.field3601 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        } else {
            boolean var4 = false;
            if (~this.field3575 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field3575 = arg2;
                var4 = true;
            }
            if (~this.field3534 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                this.field3534 = arg0;
                var4 = true;
            }
            if (var4) {
                this.field3592 &= -30;
            }
        }
        if (arg1 != 2896) {
            this.method1328();
        }
        ++field3399;
    }

    @OriginalMember(owner = "client!na", name = "A", descriptor = "(I)V")
    private final void method1569(int arg0) {
        ++field3358;
        if (this.field3604) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3604 = false;
        }
        if (arg0 > -126) {
            this.field3523 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "B", descriptor = "(I)V")
    public final void method1570(int arg0) {
        ++field3363;
        if (arg0 == 16711680) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZB)V")
    public final void method1571(boolean arg0, byte arg1) {
        if (arg1 >= 0) {
            this.method1286((class321) null, (class321) null, 1.9395279F, (class321) null);
        }
        if (arg0 == !this.field3553) {
            this.field3553 = arg0;
            this.method1555(1);
            this.field3592 &= -32;
        }
        ++field3325;
    }

    @OriginalMember(owner = "client!na", name = "B", descriptor = "(IFFFFF)V")
    public final void method1249(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3286;
        boolean var7 = this.field3521 != arg0;
        if (var7 || this.field3598 != arg1 || this.field3558 != arg2) {
            this.field3558 = arg2;
            this.field3521 = arg0;
            this.field3598 = arg1;
            if (var7) {
                this.field3512 = (float) (this.field3521 & 65280) / 65280.0F;
                this.field3539 = (float) (255 & this.field3521) / 255.0F;
                this.field3611 = (float) (16711680 & this.field3521) / 1.671168E7F;
                this.method1554((byte) 122);
            }
            this.method1545((byte) 40);
        }
        if (this.field3577[0] != arg3 || this.field3577[1] != arg4 || this.field3577[2] != arg5) {
            this.field3577[1] = arg4;
            this.field3577[2] = arg5;
            this.field3577[0] = arg3;
            this.field3610[2] = -arg5;
            this.field3610[1] = -arg4;
            this.field3610[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3572[0] = arg3 * var8;
            this.field3572[2] = arg5 * var8;
            this.field3572[1] = arg4 * var8;
            this.field3619[0] = -this.field3572[0];
            this.field3619[2] = -this.field3572[2];
            this.field3619[1] = -this.field3572[1];
            this.method1532(-115);
            this.field3535 = (int) (arg3 * 256.0F / arg4);
            this.field3578 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(ZI)V")
    public final void method1572(boolean arg0, int arg1) {
        if (!this.field3602 == arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field3602 = arg0;
            this.field3592 &= -32;
        }
        if (arg1 != -32) {
            this.field3613 = 0.7222352F;
        }
        ++field3349;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(FFFIF)V")
    public final void method1573(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class4.field43[2] = arg0;
        class4.field43[3] = arg4;
        int var6 = 45 / ((10 - arg3) / 60);
        ++field3298;
        class4.field43[1] = arg2;
        class4.field43[0] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class4.field43, 0);
    }

    @OriginalMember(owner = "client!na", name = "i", descriptor = "(Z)V")
    private final void method1574(boolean arg0) {
        this.field3382.detach();
        if (!arg0) {
            this.field3524 = null;
        }
        ++field3348;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Le;Ldm;Lc;[Lkk;I)V")
    public final void method1302(class536[] arg0, class519 arg1, class205 arg2, class182[] arg3, int arg4) {
        this.method1289(arg0, arg2, arg3, arg4);
        ++field3350;
        this.method1306(arg1);
    }

    @OriginalMember(owner = "client!na", name = "ZA", descriptor = "(IIIII)V")
    public final void method1235(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3343;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!na", name = "n", descriptor = "(B)V")
    private final void method1575(byte arg0) {
        if (arg0 > 68) {
            OpenGL.glMatrixMode(5889);
            ++field3471;
            OpenGL.glLoadMatrixf(this.field3551, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!na", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3338;
        float var7 = (float) arg2 * this.field3585.field1299 + (float) arg0 * this.field3585.field1297 + (float) arg1 * this.field3585.field1310 + this.field3585.field1287;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3585.field1299 + (float) arg3 * this.field3585.field1297 + (float) arg4 * this.field3585.field1310 + this.field3585.field1287;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field3550 > var7) || !(var8 < (float) this.field3550)) && (!(var7 > (float) this.field3516) || !((float) this.field3516 < var8))) {
            int var9 = (int) (((float) arg2 * this.field3585.field1292 + (float) arg0 * this.field3585.field1296 + (float) arg1 * this.field3585.field1289 + this.field3585.field1288) * (float) this.field3579 / var7);
            int var10 = (int) (((float) arg5 * this.field3585.field1292 + (float) arg3 * this.field3585.field1296 + (float) arg4 * this.field3585.field1289 + this.field3585.field1288) * (float) this.field3579 / var8);
            if (this.field3514 > (float) var9 && this.field3514 > (float) var10 || this.field3567 < (float) var9 && (float) var10 > this.field3567) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3585.field1312 + (float) arg0 * this.field3585.field1301 + (float) arg1 * this.field3585.field1305 + this.field3585.field1307) * (float) this.field3591 / var7);
                int var12 = (int) (((float) arg5 * this.field3585.field1312 + (float) arg3 * this.field3585.field1301 + (float) arg4 * this.field3585.field1305 + this.field3585.field1307) * (float) this.field3591 / var8);
                return (!((float) var11 < this.field3519) || !(this.field3519 > (float) var12)) && (!(this.field3540 < (float) var11) || !((float) var12 > this.field3540));
            }
        } else {
            return false;
        }
    }
}
