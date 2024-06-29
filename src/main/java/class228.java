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

@OriginalClass("client!ok")
public class class228 extends class166 {

    @OriginalMember(owner = "client!ok", name = "Ib", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3266 = new Hashtable();

    @OriginalMember(owner = "client!ok", name = "de", descriptor = "I")
    public int field3391 = 128;

    @OriginalMember(owner = "client!ok", name = "je", descriptor = "Lmi;")
    private class458 field3397 = new class458();

    @OriginalMember(owner = "client!ok", name = "le", descriptor = "Lhda;")
    private class696 field3399 = new class696();

    @OriginalMember(owner = "client!ok", name = "me", descriptor = "Lhda;")
    public class696 field3400 = new class696();

    @OriginalMember(owner = "client!ok", name = "oe", descriptor = "I")
    public int field3402 = 8;

    @OriginalMember(owner = "client!ok", name = "qe", descriptor = "I")
    public int field3404 = 3;

    @OriginalMember(owner = "client!ok", name = "te", descriptor = "Z")
    private boolean field3407 = false;

    @OriginalMember(owner = "client!ok", name = "ne", descriptor = "Lwba;")
    private class46 field3401 = new class46();

    @OriginalMember(owner = "client!ok", name = "Ae", descriptor = "I")
    private int field3414 = -1;

    @OriginalMember(owner = "client!ok", name = "Ce", descriptor = "[Ldba;")
    private class79[] field3416 = new class79[4];

    @OriginalMember(owner = "client!ok", name = "xe", descriptor = "I")
    private int field3411 = -1;

    @OriginalMember(owner = "client!ok", name = "ue", descriptor = "I")
    private int field3408 = -1;

    @OriginalMember(owner = "client!ok", name = "we", descriptor = "[Ldba;")
    private class79[] field3410 = new class79[4];

    @OriginalMember(owner = "client!ok", name = "Ee", descriptor = "[Ldba;")
    private class79[] field3418 = new class79[4];

    @OriginalMember(owner = "client!ok", name = "ve", descriptor = "Lgm;")
    private class108 field3409 = new class108();

    @OriginalMember(owner = "client!ok", name = "Fe", descriptor = "Lkea;")
    private class213 field3419 = new class213(16);

    @OriginalMember(owner = "client!ok", name = "Ie", descriptor = "Lwba;")
    private class46 field3422 = new class46();

    @OriginalMember(owner = "client!ok", name = "Le", descriptor = "Lwba;")
    private class46 field3425 = new class46();

    @OriginalMember(owner = "client!ok", name = "Me", descriptor = "Lwba;")
    private class46 field3426 = new class46();

    @OriginalMember(owner = "client!ok", name = "Ne", descriptor = "Lwba;")
    private class46 field3427 = new class46();

    @OriginalMember(owner = "client!ok", name = "Oe", descriptor = "Lwba;")
    private class46 field3428 = new class46();

    @OriginalMember(owner = "client!ok", name = "Pe", descriptor = "Lwba;")
    private class46 field3429 = new class46();

    @OriginalMember(owner = "client!ok", name = "Qe", descriptor = "Lwba;")
    private class46 field3430 = new class46();

    @OriginalMember(owner = "client!ok", name = "Ue", descriptor = "Lhda;")
    public class696 field3434 = new class696();

    @OriginalMember(owner = "client!ok", name = "af", descriptor = "Lhda;")
    public class696 field3440 = new class696();

    @OriginalMember(owner = "client!ok", name = "bf", descriptor = "Lhda;")
    public class696 field3441 = new class696();

    @OriginalMember(owner = "client!ok", name = "qf", descriptor = "F")
    public float field3455 = -1.0F;

    @OriginalMember(owner = "client!ok", name = "cf", descriptor = "I")
    public int field3442 = -1;

    @OriginalMember(owner = "client!ok", name = "of", descriptor = "F")
    private float field3453 = -1.0F;

    @OriginalMember(owner = "client!ok", name = "Mf", descriptor = "F")
    public float field3477 = 3584.0F;

    @OriginalMember(owner = "client!ok", name = "fg", descriptor = "I")
    private int field3496 = 0;

    @OriginalMember(owner = "client!ok", name = "gg", descriptor = "F")
    public float field3497 = 1.0F;

    @OriginalMember(owner = "client!ok", name = "nf", descriptor = "I")
    public int field3452 = 512;

    @OriginalMember(owner = "client!ok", name = "Sf", descriptor = "I")
    public int field3483 = 0;

    @OriginalMember(owner = "client!ok", name = "Rf", descriptor = "F")
    private float field3482 = 1.0F;

    @OriginalMember(owner = "client!ok", name = "pg", descriptor = "I")
    public int field3506 = -1;

    @OriginalMember(owner = "client!ok", name = "qg", descriptor = "I")
    public int field3507 = 512;

    @OriginalMember(owner = "client!ok", name = "Xf", descriptor = "I")
    private int field3488 = 0;

    @OriginalMember(owner = "client!ok", name = "tf", descriptor = "I")
    private int field3458 = 8448;

    @OriginalMember(owner = "client!ok", name = "vg", descriptor = "I")
    public int field3512 = 0;

    @OriginalMember(owner = "client!ok", name = "og", descriptor = "F")
    private float field3505 = 0.0F;

    @OriginalMember(owner = "client!ok", name = "mg", descriptor = "F")
    public float field3503 = 1.0F;

    @OriginalMember(owner = "client!ok", name = "hg", descriptor = "Z")
    private boolean field3498 = true;

    @OriginalMember(owner = "client!ok", name = "Hg", descriptor = "[F")
    private float[] field3524 = new float[16];

    @OriginalMember(owner = "client!ok", name = "mf", descriptor = "F")
    public float field3451 = 1.0F;

    @OriginalMember(owner = "client!ok", name = "sg", descriptor = "I")
    public int field3509 = 0;

    @OriginalMember(owner = "client!ok", name = "Ag", descriptor = "[F")
    public float[] field3517 = new float[4];

    @OriginalMember(owner = "client!ok", name = "wg", descriptor = "I")
    private int field3513 = 3584;

    @OriginalMember(owner = "client!ok", name = "Mg", descriptor = "F")
    private float field3529 = 1.0F;

    @OriginalMember(owner = "client!ok", name = "Df", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!ok", name = "rf", descriptor = "I")
    public int field3456 = 0;

    @OriginalMember(owner = "client!ok", name = "ug", descriptor = "[F")
    private float[] field3511 = new float[4];

    @OriginalMember(owner = "client!ok", name = "wf", descriptor = "I")
    private int field3461 = -1;

    @OriginalMember(owner = "client!ok", name = "rg", descriptor = "F")
    private float field3508 = -1.0F;

    @OriginalMember(owner = "client!ok", name = "Uf", descriptor = "I")
    private int field3485 = 8448;

    @OriginalMember(owner = "client!ok", name = "Zg", descriptor = "I")
    private int field3542 = 0;

    @OriginalMember(owner = "client!ok", name = "Bf", descriptor = "F")
    public float field3466 = -1.0F;

    @OriginalMember(owner = "client!ok", name = "kf", descriptor = "I")
    private int field3449 = 0;

    @OriginalMember(owner = "client!ok", name = "gf", descriptor = "I")
    private int field3446 = 0;

    @OriginalMember(owner = "client!ok", name = "Kf", descriptor = "[F")
    private float[] field3475 = new float[4];

    @OriginalMember(owner = "client!ok", name = "Tf", descriptor = "[Lrc;")
    private class498[] field3484 = new class498[class414.field6013];

    @OriginalMember(owner = "client!ok", name = "hh", descriptor = "F")
    public float field3550 = 3584.0F;

    @OriginalMember(owner = "client!ok", name = "Wf", descriptor = "I")
    public int field3487 = -1;

    @OriginalMember(owner = "client!ok", name = "Rg", descriptor = "Z")
    private boolean field3534 = false;

    @OriginalMember(owner = "client!ok", name = "Tg", descriptor = "I")
    public int field3536 = 50;

    @OriginalMember(owner = "client!ok", name = "Pg", descriptor = "[F")
    private float[] field3532 = new float[4];

    @OriginalMember(owner = "client!ok", name = "ch", descriptor = "I")
    public int field3545 = -1;

    @OriginalMember(owner = "client!ok", name = "tg", descriptor = "Lpd;")
    public class231 field3510 = new class231(8192);

    @OriginalMember(owner = "client!ok", name = "kh", descriptor = "[B")
    public byte[] field3553 = new byte[16384];

    @OriginalMember(owner = "client!ok", name = "oh", descriptor = "[I")
    public int[] field3557 = new int[1];

    @OriginalMember(owner = "client!ok", name = "mh", descriptor = "[I")
    public int[] field3555 = new int[1];

    @OriginalMember(owner = "client!ok", name = "nh", descriptor = "[I")
    public int[] field3556 = new int[1];

    @OriginalMember(owner = "client!ok", name = "ge", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3223;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3230;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field3220;

    @OriginalMember(owner = "client!ok", name = "ad", descriptor = "J")
    private long field3336;

    @OriginalMember(owner = "client!ok", name = "Hd", descriptor = "J")
    private long field3369;

    @OriginalMember(owner = "client!ok", name = "xg", descriptor = "Z")
    public boolean field3514;

    @OriginalMember(owner = "client!ok", name = "eh", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!ok", name = "Cf", descriptor = "Ljava/lang/String;")
    private String field3467;

    @OriginalMember(owner = "client!ok", name = "Wg", descriptor = "Z")
    private boolean field3539;

    @OriginalMember(owner = "client!ok", name = "dg", descriptor = "Z")
    public boolean field3494;

    @OriginalMember(owner = "client!ok", name = "Fg", descriptor = "Z")
    public boolean field3522;

    @OriginalMember(owner = "client!ok", name = "Gf", descriptor = "Z")
    public boolean field3471;

    @OriginalMember(owner = "client!ok", name = "jf", descriptor = "Z")
    private boolean field3448;

    @OriginalMember(owner = "client!ok", name = "ng", descriptor = "Z")
    public boolean field3504;

    @OriginalMember(owner = "client!ok", name = "Og", descriptor = "Ljava/lang/String;")
    private String field3531;

    @OriginalMember(owner = "client!ok", name = "yg", descriptor = "Z")
    public boolean field3515;

    @OriginalMember(owner = "client!ok", name = "ff", descriptor = "Z")
    private boolean field3445;

    @OriginalMember(owner = "client!ok", name = "ke", descriptor = "Lnj;")
    private class219 field3398;

    @OriginalMember(owner = "client!ok", name = "pe", descriptor = "Lbr;")
    public class358 field3403;

    @OriginalMember(owner = "client!ok", name = "he", descriptor = "Lnk;")
    private class667 field3395;

    @OriginalMember(owner = "client!ok", name = "ie", descriptor = "Lbl;")
    private class601 field3396;

    @OriginalMember(owner = "client!ok", name = "ee", descriptor = "Ljg;")
    private class307 field3392;

    @OriginalMember(owner = "client!ok", name = "pf", descriptor = "F")
    public float field3454;

    @OriginalMember(owner = "client!ok", name = "xf", descriptor = "F")
    private float field3462;

    @OriginalMember(owner = "client!ok", name = "Af", descriptor = "F")
    private float field3465;

    @OriginalMember(owner = "client!ok", name = "Pf", descriptor = "F")
    public float field3480;

    @OriginalMember(owner = "client!ok", name = "Zf", descriptor = "F")
    public float field3490;

    @OriginalMember(owner = "client!ok", name = "ig", descriptor = "F")
    private float field3499;

    @OriginalMember(owner = "client!ok", name = "kg", descriptor = "F")
    public float field3501;

    @OriginalMember(owner = "client!ok", name = "Cg", descriptor = "F")
    public float field3519;

    @OriginalMember(owner = "client!ok", name = "Vg", descriptor = "F")
    public float field3538;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ok", name = "ib", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ok", name = "jb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ok", name = "kb", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ok", name = "mb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ok", name = "nb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ok", name = "ob", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ok", name = "pb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ok", name = "qb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ok", name = "rb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ok", name = "sb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ok", name = "tb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ok", name = "ub", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ok", name = "vb", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!ok", name = "wb", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ok", name = "xb", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ok", name = "yb", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ok", name = "zb", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ok", name = "Ab", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ok", name = "Bb", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ok", name = "Cb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ok", name = "Db", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ok", name = "Eb", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ok", name = "Fb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ok", name = "Gb", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ok", name = "Hb", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ok", name = "Jb", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ok", name = "Kb", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ok", name = "Lb", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ok", name = "Mb", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ok", name = "Nb", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ok", name = "Ob", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ok", name = "Pb", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ok", name = "Qb", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ok", name = "Rb", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ok", name = "Sb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ok", name = "Tb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ok", name = "Ub", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ok", name = "Vb", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ok", name = "Wb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ok", name = "Xb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ok", name = "Yb", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ok", name = "Zb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ok", name = "bc", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ok", name = "cc", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ok", name = "dc", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ok", name = "ec", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ok", name = "fc", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ok", name = "gc", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ok", name = "hc", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ok", name = "ic", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ok", name = "jc", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ok", name = "kc", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ok", name = "lc", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ok", name = "mc", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ok", name = "nc", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ok", name = "oc", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ok", name = "pc", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ok", name = "qc", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ok", name = "rc", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ok", name = "sc", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ok", name = "tc", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ok", name = "uc", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ok", name = "vc", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ok", name = "wc", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!ok", name = "xc", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ok", name = "yc", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ok", name = "zc", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ok", name = "Ac", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ok", name = "Bc", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ok", name = "Cc", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ok", name = "Dc", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ok", name = "Ec", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ok", name = "Fc", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ok", name = "Gc", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ok", name = "Hc", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ok", name = "Ic", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ok", name = "Jc", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ok", name = "Kc", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ok", name = "Lc", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ok", name = "Mc", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ok", name = "Nc", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ok", name = "Oc", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ok", name = "Pc", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ok", name = "Qc", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ok", name = "Rc", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ok", name = "Sc", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ok", name = "Tc", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ok", name = "Uc", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ok", name = "Vc", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ok", name = "Wc", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!ok", name = "Xc", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ok", name = "Yc", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ok", name = "Zc", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ok", name = "bd", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ok", name = "cd", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ok", name = "dd", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ok", name = "ed", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!ok", name = "fd", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ok", name = "gd", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ok", name = "hd", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ok", name = "id", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ok", name = "jd", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ok", name = "kd", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ok", name = "ld", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ok", name = "md", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ok", name = "nd", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ok", name = "od", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ok", name = "pd", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ok", name = "qd", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!ok", name = "rd", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ok", name = "sd", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ok", name = "td", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ok", name = "ud", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ok", name = "vd", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ok", name = "wd", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ok", name = "xd", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!ok", name = "yd", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ok", name = "zd", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ok", name = "Ad", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ok", name = "Bd", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ok", name = "Cd", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ok", name = "Dd", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ok", name = "Ed", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ok", name = "Fd", descriptor = "I")
    private int field3367;

    @OriginalMember(owner = "client!ok", name = "Gd", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ok", name = "Id", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ok", name = "Jd", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ok", name = "Kd", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ok", name = "Ld", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ok", name = "Md", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ok", name = "Nd", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ok", name = "Od", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ok", name = "Pd", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ok", name = "Qd", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ok", name = "Rd", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ok", name = "Sd", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ok", name = "Td", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ok", name = "Ud", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ok", name = "Vd", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ok", name = "Wd", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ok", name = "Xd", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ok", name = "Yd", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ok", name = "Zd", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ok", name = "ae", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ok", name = "be", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ok", name = "ce", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ok", name = "fe", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ok", name = "re", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!ok", name = "Ge", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!ok", name = "He", descriptor = "I")
    private int field3421;

    @OriginalMember(owner = "client!ok", name = "Je", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!ok", name = "Ke", descriptor = "I")
    private int field3424;

    @OriginalMember(owner = "client!ok", name = "Se", descriptor = "I")
    private int field3432;

    @OriginalMember(owner = "client!ok", name = "We", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!ok", name = "Ye", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!ok", name = "df", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!ok", name = "hf", descriptor = "I")
    private int field3447;

    @OriginalMember(owner = "client!ok", name = "uf", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!ok", name = "vf", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!ok", name = "Ff", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!ok", name = "Lf", descriptor = "I")
    private int field3476;

    @OriginalMember(owner = "client!ok", name = "jg", descriptor = "I")
    private int field3500;

    @OriginalMember(owner = "client!ok", name = "zg", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!ok", name = "Bg", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ok", name = "Dg", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!ok", name = "Lg", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!ok", name = "ah", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!ok", name = "jh", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!ok", name = "lh", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!ok", name = "Ve", descriptor = "J")
    private long field3435;

    @OriginalMember(owner = "client!ok", name = "ze", descriptor = "Lfn;")
    private class123 field3413;

    @OriginalMember(owner = "client!ok", name = "ye", descriptor = "Lfaa;")
    private class139 field3412;

    @OriginalMember(owner = "client!ok", name = "Vf", descriptor = "Lfaa;")
    public class139 field3486;

    @OriginalMember(owner = "client!ok", name = "Gg", descriptor = "Lcd;")
    private class283 field3523;

    @OriginalMember(owner = "client!ok", name = "gh", descriptor = "Lcd;")
    private class283 field3549;

    @OriginalMember(owner = "client!ok", name = "Jg", descriptor = "Lvu;")
    private class306 field3526;

    @OriginalMember(owner = "client!ok", name = "ac", descriptor = "Lmn;")
    public static class333 field3284;

    @OriginalMember(owner = "client!ok", name = "ih", descriptor = "Lmv;")
    private class340 field3551;

    @OriginalMember(owner = "client!ok", name = "Ef", descriptor = "Llq;")
    public class512 field3469;

    @OriginalMember(owner = "client!ok", name = "If", descriptor = "Llq;")
    public class512 field3473;

    @OriginalMember(owner = "client!ok", name = "lf", descriptor = "Lot;")
    private class546 field3450;

    @OriginalMember(owner = "client!ok", name = "ef", descriptor = "Lqf;")
    public class633 field3444;

    @OriginalMember(owner = "client!ok", name = "sf", descriptor = "Lqf;")
    public class633 field3457;

    @OriginalMember(owner = "client!ok", name = "bg", descriptor = "Lqf;")
    public class633 field3492;

    @OriginalMember(owner = "client!ok", name = "lg", descriptor = "Lqf;")
    public class633 field3502;

    @OriginalMember(owner = "client!ok", name = "Ig", descriptor = "Lqf;")
    public class633 field3525;

    @OriginalMember(owner = "client!ok", name = "Kg", descriptor = "Lqf;")
    public class633 field3527;

    @OriginalMember(owner = "client!ok", name = "Ng", descriptor = "Lqf;")
    public class633 field3530;

    @OriginalMember(owner = "client!ok", name = "Qg", descriptor = "Lqf;")
    public class633 field3533;

    @OriginalMember(owner = "client!ok", name = "Sg", descriptor = "Lqf;")
    public class633 field3535;

    @OriginalMember(owner = "client!ok", name = "fh", descriptor = "Lqf;")
    public class633 field3548;

    @OriginalMember(owner = "client!ok", name = "bh", descriptor = "Lwn;")
    public class673 field3544;

    @OriginalMember(owner = "client!ok", name = "Be", descriptor = "Ldba;")
    private class79 field3415;

    @OriginalMember(owner = "client!ok", name = "De", descriptor = "Ldba;")
    private class79 field3417;

    @OriginalMember(owner = "client!ok", name = "se", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3406;

    @OriginalMember(owner = "client!ok", name = "Re", descriptor = "Z")
    private boolean field3431;

    @OriginalMember(owner = "client!ok", name = "Te", descriptor = "Z")
    private boolean field3433;

    @OriginalMember(owner = "client!ok", name = "Xe", descriptor = "Z")
    private boolean field3437;

    @OriginalMember(owner = "client!ok", name = "Ze", descriptor = "Z")
    private boolean field3439;

    @OriginalMember(owner = "client!ok", name = "yf", descriptor = "Z")
    private boolean field3463;

    @OriginalMember(owner = "client!ok", name = "zf", descriptor = "Z")
    public boolean field3464;

    @OriginalMember(owner = "client!ok", name = "Hf", descriptor = "Z")
    private boolean field3472;

    @OriginalMember(owner = "client!ok", name = "Jf", descriptor = "Z")
    private boolean field3474;

    @OriginalMember(owner = "client!ok", name = "Nf", descriptor = "Z")
    private boolean field3478;

    @OriginalMember(owner = "client!ok", name = "Of", descriptor = "Z")
    public boolean field3479;

    @OriginalMember(owner = "client!ok", name = "Qf", descriptor = "Z")
    public boolean field3481;

    @OriginalMember(owner = "client!ok", name = "Yf", descriptor = "Z")
    public boolean field3489;

    @OriginalMember(owner = "client!ok", name = "cg", descriptor = "Z")
    public boolean field3493;

    @OriginalMember(owner = "client!ok", name = "eg", descriptor = "Z")
    private boolean field3495;

    @OriginalMember(owner = "client!ok", name = "Eg", descriptor = "Z")
    public boolean field3521;

    @OriginalMember(owner = "client!ok", name = "Ug", descriptor = "Z")
    private boolean field3537;

    @OriginalMember(owner = "client!ok", name = "Xg", descriptor = "Z")
    private boolean field3540;

    @OriginalMember(owner = "client!ok", name = "Yg", descriptor = "Z")
    public boolean field3541;

    @OriginalMember(owner = "client!ok", name = "dh", descriptor = "Z")
    public boolean field3546;

    @OriginalMember(owner = "client!ok", name = "lb", descriptor = "[I")
    public static int[] field3243;

    @OriginalMember(owner = "client!ok", name = "ag", descriptor = "[Lip;")
    private class657[] field3491;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method1493(boolean arg0, int arg1) {
        if (!arg0 != !this.field3495) {
            this.field3495 = arg0;
            this.method1507((byte) -29);
            this.field3438 &= -8;
        }
        if (arg1 >= -25) {
            this.field3432 = -15;
        }
        ++field3329;
    }

    @OriginalMember(owner = "client!ok", name = "ra", descriptor = "(F)V", line = 24)
    public final void method132(float arg0) {
        ++field3206;
        if (this.field3538 != arg0) {
            this.field3538 = arg0;
            this.method1564((byte) -29);
        }
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)V", line = 41)
    public final void method1494(int arg0) {
        int var2 = -115 % ((arg0 - 54) / 40);
        ++field3368;
        if (~this.field3438 != -3) {
            this.method1512((byte) 75);
            this.method1539(false, false);
            this.method1493(false, -50);
            this.method1571(false, 1);
            this.method1534(104, false);
            this.method1510((byte) -112, -2);
            this.field3438 = 2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "()Z", line = 61)
    public final boolean method123() {
        ++field3390;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Le;)V", line = 69)
    public final void method196(class492 arg0) {
        ++field3259;
        this.field3406 = ((class705) arg0).field9921;
        if (this.field3523 == null) {
            class231 var2 = new class231(80);
            if (this.field3514) {
                var2.method1592(false, -1.0F);
                var2.method1592(false, -1.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, -1.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, -1.0F);
                var2.method1592(false, 1.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 0.0F);
                var2.method1592(false, 0.0F);
            } else {
                var2.method1593((byte) 33, -1.0F);
                var2.method1593((byte) 40, -1.0F);
                var2.method1593((byte) 52, 0.0F);
                var2.method1593((byte) 105, 0.0F);
                var2.method1593((byte) 52, 1.0F);
                var2.method1593((byte) 45, 1.0F);
                var2.method1593((byte) 122, -1.0F);
                var2.method1593((byte) 45, 0.0F);
                var2.method1593((byte) 80, 1.0F);
                var2.method1593((byte) 67, 1.0F);
                var2.method1593((byte) 87, 1.0F);
                var2.method1593((byte) 104, 1.0F);
                var2.method1593((byte) 67, 0.0F);
                var2.method1593((byte) 120, 1.0F);
                var2.method1593((byte) 109, 0.0F);
                var2.method1593((byte) 111, -1.0F);
                var2.method1593((byte) 53, 1.0F);
                var2.method1593((byte) 96, 0.0F);
                var2.method1593((byte) 39, 0.0F);
                var2.method1593((byte) 79, 0.0F);
            }
            this.field3523 = this.method1573(false, var2.field9761, 20, false, var2.field9796);
            this.field3473 = new class512(this.field3523, 5126, 3, 0);
            this.field3469 = new class512(this.field3523, 5126, 2, 12);
            this.field3397.method2695(24, this);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 135)
    private final void method1495(byte arg0) {
        if (~this.field3543 != -3) {
            this.field3543 = 2;
            this.method1568(0);
            this.method1516((byte) -96);
            this.field3438 &= -8;
        }
        if (arg0 != -74) {
            this.method1564((byte) -33);
        }
        ++field3261;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BZI)V", line = 154)
    public final void method1496(byte arg0, boolean arg1, int arg2) {
        this.method1570(true, 0, arg2, arg1);
        if (arg0 < 32) {
            this.method202(-110, -40, -63, 12, 57);
        }
        ++field3348;
    }

    @OriginalMember(owner = "client!ok", name = "oa", descriptor = "([I)V", line = 166)
    public final void method204(int[] arg0) {
        arg0[1] = this.field3446;
        arg0[3] = this.field3449;
        ++field3198;
        arg0[0] = this.field3468;
        arg0[2] = this.field3488;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 179)
    public final void method1497(int arg0, byte arg1) {
        ++field3231;
        if (arg0 == 1) {
            this.method1527(arg1 ^ -30, 7681, 7681);
        } else if (~arg0 == -1) {
            this.method1527(1, 8448, 8448);
        } else if (~arg0 == -3) {
            this.method1527(arg1 ^ -30, 34165, 7681);
        } else if (~arg0 == -4) {
            this.method1527(1, 260, 8448);
        } else if (arg0 == 4) {
            this.method1527(1, 34023, 34023);
        }
        if (arg1 != -29) {
            this.method158();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljba;Ljba;FLjba;)Ljba;", line = 210)
    public final class363 method190(class363 arg0, class363 arg1, float arg2, class363 arg3) {
        ++field3215;
        if (arg0 != null && arg1 != null && this.field3493 && this.field3515) {
            class80 var5 = null;
            class340 var6 = (class340) arg0;
            class340 var7 = (class340) arg1;
            class431 var8 = var6.method733((byte) 20);
            class431 var9 = var7.method733((byte) 20);
            if (var8 != null && var9 != null) {
                int var10 = var8.field6317 > var9.field6317 ? var8.field6317 : var9.field6317;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class80) {
                    class80 var11 = (class80) arg3;
                    if (~var10 == ~var11.method731((byte) 82)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class80(this, var10);
                }
                if (var5.method729(true, arg2, var9, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()Z", line = 258)
    public final boolean method106() {
        ++field3195;
        return this.field3540 && (!this.method127() || this.field3537);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ldba;I)V", line = 267)
    public final void method1498(class79 arg0, int arg1) {
        ++field3242;
        if (~this.field3408 <= -4) {
            throw new RuntimeException();
        } else {
            if (arg1 != 17741) {
                this.method1518(-84, -122, (byte) -32);
            }
            if (this.field3408 >= 0) {
                this.field3410[this.field3408].method725((byte) -127);
            }
            this.field3415 = this.field3410[++this.field3408] = arg0;
            this.field3415.method727(false);
        }
    }

    @OriginalMember(owner = "client!ok", name = "FA", descriptor = "(ILua;II)V", line = 290)
    public final void method169(int arg0, class617 arg1, int arg2, int arg3) {
        ++field3252;
        class448 var5 = (class448) arg1;
        class546 var6 = var5.field6481;
        this.method1494(-99);
        this.method1505(-2, var5.field6481);
        this.method1536(0, 1);
        this.method1527(1, 7681, 8448);
        this.method1503(0, 34167, (byte) 2, 768);
        float var7 = var6.field7676 / (float) var6.field7681;
        float var8 = var6.field7682 / (float) var6.field7677;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field3468 - arg2) * var7, (float) (-arg3 + this.field3446) * var8);
        OpenGL.glVertex2i(this.field3468, this.field3446);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field3468) * var7, (float) (-arg3 + this.field3449) * var8);
        OpenGL.glVertex2i(this.field3468, this.field3449);
        OpenGL.glTexCoord2f((float) (this.field3488 - arg2) * var7, (float) (this.field3449 - arg3) * var8);
        OpenGL.glVertex2i(this.field3488, this.field3449);
        OpenGL.glTexCoord2f((float) (this.field3488 - arg2) * var7, (float) (-arg3 + this.field3446) * var8);
        OpenGL.glVertex2i(this.field3488, this.field3446);
        OpenGL.glEnd();
        this.method1503(0, 5890, (byte) 2, 768);
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V", line = 322)
    public final void method1499(int arg0) {
        if (~this.field3438 != -17) {
            this.method1537(3);
            this.method1539(true, false);
            this.method1571(true, arg0);
            this.method1534(94, true);
            this.method1536(0, 1);
            this.field3438 = 16;
        }
        ++field3270;
        if (arg0 != 1) {
            this.method1515(4, 52);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 345)
    public final void method198(Rectangle[] arg0, int arg1) throws class621 {
        ++field3240;
        this.method203();
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V", line = 354)
    public final void method1500(int arg0, int arg1) {
        if (~this.field3447 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field3447 = arg1;
        }
        if (arg0 == 33984) {
            ++field3225;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FFFI)V", line = 378)
    private final void method1501(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field3249;
        if (this.field3463) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg2, arg1);
        OpenGL.glMatrixMode(5888);
        this.field3463 = true;
        if (arg3 != 1) {
            this.field3367 = 15;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILdba;)V", line = 395)
    public final void method1502(int arg0, class79 arg1) {
        ++field3276;
        if (this.field3414 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field3414 <= arg0) {
                this.field3418[this.field3414].method728((byte) -51);
            }
            this.field3417 = this.field3418[++this.field3414] = arg1;
            this.field3417.method723((byte) 38);
        }
    }

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "()Lq;", line = 411)
    public final class391 method153() {
        ++field3208;
        return this.field3434;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIII)Lf;", line = 419)
    public final class702 method209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3357;
        return new class123(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()V", line = 430)
    public final void method174() {
        ++field3289;
        this.field3395.method3691((byte) -77);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)V", line = 440)
    public final void method1503(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
        ++field3218;
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg3);
        if (arg2 != 2) {
            this.method166();
        }
    }

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "(I)V", line = 452)
    public final void method1504(int arg0) {
        if (arg0 == 8448) {
            ++field3331;
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILip;)V", line = 467)
    public final void method1505(int arg0, class657 arg1) {
        ++field3233;
        class657 var3 = this.field3491[this.field3447];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field9226);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field9226);
                } else if (arg1.field9226 != var3.field9226) {
                    OpenGL.glDisable(var3.field9226);
                    OpenGL.glEnable(arg1.field9226);
                }
                OpenGL.glBindTexture(arg1.field9226, arg1.method3615(-10615));
            }
            this.field3491[this.field3447] = arg1;
        }
        this.field3438 &= arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([I)V", line = 502)
    public final void method208(int[] arg0) {
        ++field3380;
        arg0[1] = this.field3332;
        arg0[0] = this.field3232;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "()Z", line = 511)
    public final boolean method186() {
        ++field3343;
        if (this.field3396 != null) {
            if (!this.field3396.method1136(-8857)) {
                if (!this.field3395.method3695(this.field3396, 0)) {
                    return false;
                }
                this.field3398.method1434(102);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "()V", line = 536)
    public final void method150() {
        ++field3216;
        if (this.field3396 != null && this.field3396.method1136(-8857)) {
            this.field3395.method3696((byte) -116, this.field3396);
            this.field3398.method1434(76);
        }
    }

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "()Z", line = 552)
    public final boolean method109() {
        ++field3237;
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "ja", descriptor = "(I)V", line = 560)
    public final void method139(int arg0) {
        this.method1536(0, 0);
        ++field3346;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 574)
    public final synchronized void method1506(int arg0, int arg1, int arg2) {
        ++field3234;
        class111 var4 = new class111(arg1);
        if (arg0 != -31936) {
            this.field3394 = 119;
        }
        var4.field9386 = (long) arg2;
        this.field3426.method474(var4, 6);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(IIIIII)V", line = 588)
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3269;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1546((byte) -47);
        this.method1536(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3540) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3540) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V", line = 621)
    private final void method1507(byte arg0) {
        if (arg0 < -8) {
            ++field3352;
            if (this.field3495 && !this.field3474) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)I", line = 637)
    public final int method1508(int arg0, int arg1) {
        ++field3305;
        if (~arg0 == -2) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (~arg0 != -3) {
            if (arg0 != 3) {
                if (~arg0 == -5) {
                    return 34023;
                } else {
                    int var3 = 84 % ((arg1 - -59) / 53);
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 666)
    public final void method143(Canvas arg0) {
        ++field3374;
        this.field3230 = null;
        this.field3369 = 0L;
        if (arg0 != null && this.field3223 != arg0) {
            if (this.field3266.containsKey(arg0)) {
                Long var2 = (Long) this.field3266.get(arg0);
                this.field3369 = var2;
                this.field3230 = arg0;
            }
        } else {
            this.field3369 = this.field3336;
            this.field3230 = this.field3223;
        }
        if (this.field3230 != null && ~this.field3369 != -1L) {
            this.field3220.setSurface(this.field3369);
            this.method1513(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lhda;I)V", line = 699)
    public final void method1509(class696 arg0, int arg1) {
        ++field3312;
        OpenGL.glPushMatrix();
        if (arg1 != 1) {
            this.method157();
        }
        OpenGL.glMultMatrixf(arg0.method3886(arg1 ^ 11231), 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V", line = 725)
    public final void method1510(byte arg0, int arg1) {
        ++field3315;
        this.method1496((byte) 109, true, arg1);
        int var3 = -107 % ((89 - arg0) / 36);
    }

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "()V", line = 740)
    public final void method158() {
        ++field3359;
        for (class665 var1 = this.field3401.method472((byte) -65); var1 != null; var1 = this.field3401.method482(118)) {
            ((class705) var1).method3924(-8);
        }
        if (this.field3395 != null) {
            this.field3395.method3693((byte) 60);
        }
        if (this.field3220 != null) {
            this.method1563((byte) -2);
            Enumeration var2 = this.field3266.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field3266.get(var3);
                this.field3220.releaseSurface(var3, var4);
            }
            this.field3220.release();
            this.field3220 = null;
        }
        if (this.field3407) {
            class618.method3427(false, true, -76);
            this.field3407 = false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(IIII)[I", line = 785)
    public final int[] method193(int arg0, int arg1, int arg2, int arg3) {
        ++field3262;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field3332 - arg1 + -var6, arg2, 1, 32993, this.field3547, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IF)V", line = 808)
    public final void method1511(int arg0, float arg1) {
        if (arg0 != 31313) {
            this.method163(56);
        }
        if (this.field3529 != arg1) {
            this.field3529 = arg1;
            if (this.field3543 == 3) {
                this.method1530(-13900);
            }
        }
        ++field3301;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 827)
    private final void method1512(byte arg0) {
        if (this.field3543 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field3232 < -1 && this.field3332 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field3232, (double) this.field3332, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field3543 = 1;
            this.field3438 &= -25;
        }
        int var2 = -52 % ((arg0 - 11) / 63);
        ++field3283;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V", line = 852)
    public final void method113(int arg0) {
        ++field3248;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "()Z", line = 863)
    public final boolean method129() {
        ++field3196;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "(I)V", line = 871)
    private final void method1513(int arg0) {
        if (arg0 == 0) {
            if (this.field3230 == null) {
                this.field3253 = this.field3367 = 0;
            } else {
                Dimension var2 = this.field3230.getSize();
                this.field3253 = var2.width;
                this.field3367 = var2.height;
            }
            ++field3211;
            if (this.field3415 == null) {
                this.field3332 = this.field3367;
                this.field3232 = this.field3253;
                this.method1543(arg0 + 34162);
            }
            this.method1528(arg0 + -98);
            this.method152();
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)I", line = 900)
    public final int method1514(int arg0, int arg1) {
        if (arg1 >= -7) {
            return -47;
        } else {
            ++field3298;
            if (~arg0 != -6407 && arg0 != 6409) {
                if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                    if (~arg0 == -6408) {
                        return 3;
                    } else if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (~arg0 == -34843) {
                            return 8;
                        } else if (~arg0 == -6403) {
                            return 3;
                        } else if (arg0 == 6401) {
                            return 1;
                        } else {
                            throw new IllegalArgumentException("");
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
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I", line = 943)
    public final int method172(int arg0, int arg1) {
        ++field3321;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ok", name = "BA", descriptor = "()I", line = 951)
    public final int method110() {
        ++field3306;
        return this.field3536;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FFF)V", line = 962)
    public final void method205(float arg0, float arg1, float arg2) {
        class563.field7932 = arg0;
        class163.field2350 = arg2;
        class664.field9378 = arg1;
        ++field3358;
    }

    @OriginalMember(owner = "client!ok", name = "ya", descriptor = "()V", line = 974)
    public final void method194() {
        this.method1534(118, true);
        ++field3379;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "(IIII)V", line = 985)
    public final void method107(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3449 > arg3) {
            this.field3449 = arg3;
        }
        ++field3335;
        if (arg0 > this.field3468) {
            this.field3468 = arg0;
        }
        if (this.field3446 < arg1) {
            this.field3446 = arg1;
        }
        if (this.field3488 > arg2) {
            this.field3488 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method1544((byte) -124);
        this.method1519(0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZ)Lf;", line = 1015)
    public final class702 method175(int arg0, int arg1, boolean arg2) {
        ++field3205;
        return new class123(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lfg;Z)Lf;", line = 1024)
    public final class702 method138(class113 arg0, boolean arg1) {
        ++field3356;
        int[] var3 = new int[arg0.field1708 * arg0.field1706];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1701 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field1708; ++var6) {
                for (int var7 = 0; ~arg0.field1706 < ~var7; ++var7) {
                    int var8 = arg0.field1702[255 & arg0.field1709[var4++]];
                    var3[var5++] = ~var8 == -1 ? 0 : class486.method2826(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field1708 < ~var9; ++var9) {
                for (int var11 = 0; arg0.field1706 > var11; ++var11) {
                    var3[var5++] = class486.method2826(arg0.field1701[var4] << 24, arg0.field1702[class689.method3797(arg0.field1709[var4], 255)]);
                    ++var4;
                }
            }
        }
        class702 var10 = this.method209(var3, 0, arg0.field1706, arg0.field1706, arg0.field1708);
        var10.method935(arg0.field1704, arg0.field1707, arg0.field1705, arg0.field1703);
        return var10;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V", line = 1085)
    public final void method176(int arg0, int arg1, int arg2, int arg3) {
        ++field3308;
        this.field3395.method3690(arg1, arg2, 0, arg0, arg3);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lvi;I)V", line = 1099)
    public final void method165(class499 arg0, int arg1) {
        this.field3397.method2690(arg0, this, arg1, -1);
        ++field3204;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)V", line = 1108)
    public final synchronized void method1515(int arg0, int arg1) {
        ++field3275;
        class665 var3 = new class665();
        var3.field9386 = (long) arg0;
        this.field3429.method474(var3, 6);
        if (arg1 != 0) {
            this.method123();
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V", line = 1122)
    private final void method1516(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field3327;
        OpenGL.glMultMatrixf(this.field3440.method3886(11230), 0);
        if (this.field3534) {
            this.field3392.field4542.method2168((byte) -126);
        }
        this.method1517(4);
        if (arg0 > -65) {
            this.method1517(-114);
        }
        this.method1566(0);
    }

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "(I)V", line = 1139)
    public final void method1517(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field3517, 0);
        ++field3310;
        OpenGL.glLightfv(16385, 4611, this.field3511, 0);
        if (arg0 != 4) {
            this.method1509((class696) null, 53);
        }
    }

    @OriginalMember(owner = "client!ok", name = "pa", descriptor = "(III)V", line = 1151)
    public final void method122(int arg0, int arg1, int arg2) {
        ++field3326;
        if (~this.field3506 != ~arg0 || ~this.field3442 != ~arg1 || ~this.field3483 != ~arg2) {
            this.field3506 = arg0;
            this.field3442 = arg1;
            this.field3483 = arg2;
            this.method1556(true);
            this.method1552(83);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V", line = 1171)
    public final void method1518(int arg0, int arg1, byte arg2) {
        ++field3246;
        this.field3496 = arg0;
        this.field3542 = arg1;
        this.method1543(34162);
        if (arg2 <= 16) {
            this.method1516((byte) 20);
        }
        this.method1519(0);
    }

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)V", line = 1187)
    private final void method1519(int arg0) {
        ++field3341;
        if (arg0 != 0) {
            this.method1565(53, (class79) null);
        }
        if (this.field3468 <= this.field3488 && ~this.field3446 >= ~this.field3449) {
            OpenGL.glScissor(this.field3542 + this.field3468, this.field3496 + this.field3332 + -this.field3449, -this.field3468 + this.field3488, -this.field3446 + this.field3449);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V", line = 1204)
    public final void method1520(byte arg0, int arg1) {
        class50.field1028[2] = (float) class689.method3797(255, arg1) / 255.0F;
        class50.field1028[0] = (float) class689.method3797(arg1, 16711680) / 1.671168E7F;
        if (arg0 != -71) {
            this.field3515 = true;
        }
        ++field3383;
        class50.field1028[1] = (float) class689.method3797(arg1, 65280) / 65280.0F;
        class50.field1028[3] = (float) (arg1 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class50.field1028, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V", line = 1220)
    public final void method1521(int arg0, boolean arg1) {
        if (arg0 != 770) {
            this.field3469 = null;
        }
        if (!arg1 == this.field3474) {
            this.field3474 = arg1;
            this.method1507((byte) -26);
        }
        ++field3213;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIILua;II)V", line = 1236)
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        ++field3290;
        class448 var10 = (class448) arg6;
        class546 var11 = var10.field6481;
        this.method1494(-87);
        this.method1505(-2, var10.field6481);
        this.method1536(0, arg5);
        this.method1527(1, 7681, 8448);
        this.method1503(0, 34167, (byte) 2, 768);
        float var12 = var11.field7676 / (float) var11.field7681;
        float var13 = var11.field7682 / (float) var11.field7677;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method1503(0, 5890, (byte) 2, 768);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I", line = 1274)
    public final int method160(int arg0, int arg1) {
        ++field3280;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "()Lis;", line = 1283)
    public final class463 method140() {
        ++field3302;
        int var1 = -1;
        if (~this.field3531.indexOf("nvidia") == 0) {
            if (~this.field3531.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (this.field3531.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class463(var1, "OpenGL", this.field3520, this.field3467, 0L);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIILvu;I)V", line = 1306)
    public final void method1522(byte arg0, int arg1, int arg2, class306 arg3, int arg4) {
        ++field3340;
        int var6 = arg3.method1950(-82);
        int var7 = arg1 * this.method1553(var6, 102);
        this.method1538(arg3, 768);
        if (arg0 != 31) {
            this.field3554 = 108;
        }
        OpenGL.glDrawElements(arg2, arg4, var6, (long) var7 + arg3.method1951(-27189));
    }

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "()[I", line = 1329)
    public final int[] method145() {
        ++field3307;
        return new int[] { this.field3512, this.field3456, this.field3452, this.field3507 };
    }

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "()V", line = 1338)
    public final void method183() {
        ++field3281;
        if (this.field3445 && ~this.field3232 < -1 && ~this.field3332 < -1) {
            int var1 = this.field3468;
            int var2 = this.field3488;
            int var3 = this.field3446;
            int var4 = this.field3449;
            this.method152();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method1528(-121);
            this.method1539(false, false);
            this.method1493(false, -80);
            this.method1571(false, 1);
            this.method1534(115, false);
            this.method1505(-2, (class657) null);
            this.method1510((byte) -37, -2);
            this.method1497(1, (byte) -29);
            this.method1536(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field3232, this.field3332, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method168(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lhda;I)V", line = 1382)
    public final void method1523(class696 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method3886(11230), 0);
        if (arg1 != -13003) {
            this.field3429 = null;
        }
        ++field3350;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()Z", line = 1393)
    public final boolean method104() {
        ++field3287;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "ZA", descriptor = "(Z)V", line = 1402)
    public final void method178(boolean arg0) {
        ++field3273;
        this.field3498 = arg0;
        this.method1531(115);
    }

    @OriginalMember(owner = "client!ok", name = "YA", descriptor = "(IIII)V", line = 1414)
    public final void method195(int arg0, int arg1, int arg2, int arg3) {
        ++field3393;
        if (!this.field3479) {
            throw new RuntimeException("");
        } else {
            this.field3487 = arg1;
            this.field3545 = arg2;
            this.field3459 = arg0;
            this.field3509 = arg3;
            if (this.field3534) {
                this.field3392.field4542.method2168((byte) 15);
                this.field3392.field4542.method2164(127);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "da", descriptor = "(IIII)V", line = 1438)
    public final void method168(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg2 < ~this.field3232) {
            arg2 = this.field3232;
        }
        if (arg3 > this.field3332) {
            arg3 = this.field3332;
        }
        ++field3255;
        this.field3449 = arg3;
        this.field3446 = arg1;
        this.field3468 = arg0;
        this.field3488 = arg2;
        OpenGL.glEnable(3089);
        this.method1544((byte) -124);
        this.method1519(0);
    }

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "()Z", line = 1469)
    public final boolean method127() {
        ++field3296;
        return this.field3396 != null && this.field3396.method1136(-8857);
    }

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "()V", line = 1479)
    public static final void method1524() {
        for (int var0 = 0; var0 < class513.field7248.length; ++var0) {
            class513.field7248[var0].method3057();
        }
        class513.field7248 = null;
    }

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "()I", line = 1492)
    public final int method200() {
        ++field3241;
        int var1 = this.field3554;
        this.field3554 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V", line = 1504)
    public final synchronized void method1525(int arg0, byte arg1, int arg2) {
        ++field3222;
        class111 var4 = new class111(arg2);
        var4.field9386 = (long) arg0;
        this.field3428.method474(var4, 6);
        int var5 = 86 / ((arg1 - -17) / 59);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V", line = 1519)
    public final void method163(int arg0) {
        ++field3278;
        this.method1563((byte) -2);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z[BIZI)Lvu;", line = 1534)
    public final class306 method1526(boolean arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg0) {
            this.field3542 = -57;
        }
        ++field3361;
        return (class306) (!this.field3539 || arg3 && !this.field3448 ? new class636(this, arg2, arg1, arg4) : new class437(this, arg2, arg1, arg4, arg3));
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V", line = 1553)
    public final void method1527(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            ++field3365;
            if (this.field3447 != 0) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                OpenGL.glTexEnvi(8960, 34162, arg2);
            } else {
                boolean var4 = false;
                if (~this.field3458 != ~arg1) {
                    OpenGL.glTexEnvi(8960, 34161, arg1);
                    this.field3458 = arg1;
                    var4 = true;
                }
                if (this.field3485 != arg2) {
                    OpenGL.glTexEnvi(8960, 34162, arg2);
                    var4 = true;
                    this.field3485 = arg2;
                }
                if (var4) {
                    this.field3438 &= -30;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "(I)V", line = 1595)
    public final void method1528(int arg0) {
        if (arg0 >= -95) {
            this.method168(58, 10, -35, 73);
        }
        if (~this.field3543 != -1) {
            this.field3438 &= -32;
            this.field3543 = 0;
        }
        ++field3295;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V", line = 1612)
    public final void method1529(byte arg0) {
        if (arg0 > -52) {
            this.method1532(3, -27, -58, 120);
        }
        OpenGL.glPushMatrix();
        ++field3291;
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "()Lq;", line = 1626)
    public final class391 method130() {
        ++field3353;
        return this.field3399;
    }

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "(IIIIII)V", line = 1635)
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3254;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1546((byte) -124);
        this.method1536(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3540) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field3540) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "(I)V", line = 1668)
    private final void method1530(int arg0) {
        ++field3235;
        float var2 = (float) (-this.field3512) * this.field3529 / (float) this.field3452;
        float var3 = (float) (-this.field3456) * this.field3529 / (float) this.field3507;
        float var4 = (float) (-this.field3512 + this.field3232) * this.field3529 / (float) this.field3452;
        float var5 = (float) (-this.field3456 + this.field3332) * this.field3529 / (float) this.field3507;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field3536, (double) this.field3513);
        }
        OpenGL.glMatrixMode(5888);
        if (arg0 != -13900) {
            this.method1532(107, -73, 116, 15);
        }
    }

    @OriginalMember(owner = "client!ok", name = "AA", descriptor = "(III[I)V", line = 1693)
    public final void method197(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3209;
        float var5 = (float) arg2 * this.field3434.field9832 + (float) arg0 * this.field3434.field9829 + (float) arg1 * this.field3434.field9849 + this.field3434.field9841;
        if (!(var5 < (float) this.field3536) && !((float) this.field3513 < var5)) {
            int var6 = (int) (((float) arg2 * this.field3434.field9852 + (float) arg0 * this.field3434.field9838 + (float) arg1 * this.field3434.field9847 + this.field3434.field9840) * (float) this.field3452 / var5);
            int var7 = (int) (((float) arg2 * this.field3434.field9856 + (float) arg0 * this.field3434.field9834 + (float) arg1 * this.field3434.field9837 + this.field3434.field9824) * (float) this.field3507 / var5);
            if ((float) var6 >= this.field3501 && this.field3480 >= (float) var6 && this.field3519 <= (float) var7 && this.field3454 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field3501);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field3519);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "()Lq;", line = 1724)
    public final class391 method100() {
        ++field3375;
        return new class696();
    }

    @OriginalMember(owner = "client!ok", name = "VA", descriptor = "(IFFFFF)V", line = 1732)
    public final void method185(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3212;
        boolean var7 = this.field3461 != arg0;
        if (var7 || this.field3455 != arg1 || this.field3466 != arg2) {
            this.field3466 = arg2;
            this.field3461 = arg0;
            this.field3455 = arg1;
            if (var7) {
                this.field3503 = (float) (255 & this.field3461) / 255.0F;
                this.field3497 = (float) (this.field3461 & 65280) / 65280.0F;
                this.field3451 = (float) (this.field3461 & 16711680) / 1.671168E7F;
                this.method1564((byte) -29);
            }
            this.method1577(8448);
        }
        if (this.field3475[0] != arg3 || this.field3475[1] != arg4 || this.field3475[2] != arg5) {
            this.field3475[2] = arg5;
            this.field3475[0] = arg3;
            this.field3475[1] = arg4;
            this.field3532[0] = -arg3;
            this.field3532[2] = -arg5;
            this.field3532[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3517[0] = arg3 * var8;
            this.field3517[2] = arg5 * var8;
            this.field3517[1] = arg4 * var8;
            this.field3511[0] = -this.field3517[0];
            this.field3511[1] = -this.field3517[1];
            this.field3511[2] = -this.field3517[2];
            this.method1517(4);
            this.field3516 = (int) (arg3 * 256.0F / arg4);
            this.field3518 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "(I)V", line = 1785)
    private final void method1531(int arg0) {
        ++field3264;
        OpenGL.glDepthMask(this.field3431 && this.field3498);
        if (arg0 <= 65) {
            this.field3460 = 44;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIII)V", line = 1797)
    public final void method1532(int arg0, int arg1, int arg2, int arg3) {
        ++field3257;
        if (arg0 == -22319) {
            OpenGL.glDrawArrays(arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljaclib/memory/Buffer;IIBZ)Lcd;", line = 1810)
    public final class283 method1533(Buffer arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        ++field3294;
        if (!this.field3539 || arg4 && !this.field3448) {
            return arg3 != 36 ? null : new class658(this, arg2, arg0);
        } else {
            return new class165(this, arg2, arg0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "(IIIIII)Z", line = 1827)
    public final boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3207;
        float var7 = (float) arg2 * this.field3434.field9832 + (float) arg0 * this.field3434.field9829 + (float) arg1 * this.field3434.field9849 + this.field3434.field9841;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3434.field9832 + (float) arg3 * this.field3434.field9829 + (float) arg4 * this.field3434.field9849 + this.field3434.field9841;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field3536) || !(var8 < (float) this.field3536)) && (!(var7 > (float) this.field3513) || !(var8 > (float) this.field3513))) {
            int var9 = (int) (((float) arg2 * this.field3434.field9852 + (float) arg0 * this.field3434.field9838 + (float) arg1 * this.field3434.field9847 + this.field3434.field9840) * (float) this.field3452 / var7);
            int var10 = (int) (((float) arg5 * this.field3434.field9852 + (float) arg3 * this.field3434.field9838 + (float) arg4 * this.field3434.field9847 + this.field3434.field9840) * (float) this.field3452 / var8);
            if (this.field3501 > (float) var9 && (float) var10 < this.field3501 || (float) var9 > this.field3480 && (float) var10 > this.field3480) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field3434.field9856 + (float) arg0 * this.field3434.field9834 + (float) arg1 * this.field3434.field9837 + this.field3434.field9824) * (float) this.field3507 / var7);
                int var12 = (int) (((float) arg5 * this.field3434.field9856 + (float) arg3 * this.field3434.field9834 + (float) arg4 * this.field3434.field9837 + this.field3434.field9824) * (float) this.field3507 / var8);
                return (!(this.field3519 > (float) var11) || !((float) var12 < this.field3519)) && (!((float) var11 > this.field3454) || !(this.field3454 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "va", descriptor = "(I)V", line = 1867)
    public final void method154(int arg0) {
        this.field3404 = 0;
        ++field3376;
        while (~arg0 < -2) {
            ++this.field3404;
            arg0 >>= 1;
        }
        this.field3402 = 1 << this.field3404;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lvi;)V", line = 1882)
    public final void method156(class499 arg0) {
        this.field3397.method2690(arg0, this, -1, -1);
        ++field3386;
    }

    @OriginalMember(owner = "client!ok", name = "GA", descriptor = "(II)V", line = 1890)
    public final void method142(int arg0, int arg1) {
        ++field3288;
        if (this.field3536 != arg0 || ~this.field3513 != ~arg1) {
            this.field3513 = arg1;
            this.field3536 = arg0;
            this.method1557((byte) 103);
            this.method1556(true);
            if (~this.field3543 == -4) {
                this.method1530(-13900);
                return;
            }
            if (~this.field3543 != -3) {
                return;
            }
            this.method1568(0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IZ)V", line = 1915)
    public final void method1534(int arg0, boolean arg1) {
        ++field3351;
        if (arg0 >= 17) {
            if (arg1 == !this.field3431) {
                this.field3431 = arg1;
                this.method1531(114);
                this.field3438 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Le;", line = 1937)
    public final class492 method120(int arg0) {
        ++field3323;
        class705 var2 = new class705(arg0);
        this.field3401.method474(var2, 6);
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILr;)V", line = 1948)
    public static final void method1535(int arg0, int arg1, int arg2, class166 arg3) {
        ++field3282;
        class115.field1765 = new class248[arg2][arg1];
        class512.field7202 = arg3;
        if (class46.field720 != null) {
            class53.field1050 = class202.method1338(class46.field720[4], class46.field720[3], class46.field720[2], class46.field720[5], true, class46.field720[1], class46.field720[0]);
        }
        class439.field6403 = new class248();
        class300.method1931(0);
        if (arg0 != 3) {
            field3304 = 24;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lf;Z)V", line = 1968)
    public final void method188(class702 arg0, boolean arg1) {
        ++field3285;
        this.field3413 = (class123) arg0;
        if (this.field3515) {
            if (this.field3412 == null) {
                this.field3412 = new class139(this);
            }
            if (this.field3415 == this.field3412) {
                throw new RuntimeException();
            }
            this.method1578(0, this.field3412);
            if (arg1) {
                class462 var3 = (class462) this.field3419.method1405((long) (this.field3413.method927() << 16 | this.field3413.method939()), (byte) -44);
                if (var3 == null) {
                    var3 = new class462(this, 6402, this.field3413.method927(), this.field3413.method939());
                    class462 var5;
                    for (this.field3421 += var3.field6658; ~this.field3421 < -2097153; this.field3421 -= var5.field6658) {
                        class375 var4 = this.field3409.method848((byte) -68);
                        if (var4 == null) {
                            break;
                        }
                        var5 = (class462) var4;
                        var5.method2258((byte) 119);
                        var5.method3678(-1);
                        var5.method2727((byte) 108);
                    }
                    this.field3419.method1403((byte) -18, var3, (long) (this.field3413.method927() << 16 | this.field3413.method939()));
                }
                this.field3409.method850(var3, 4);
                this.field3412.method1014(8, -5253, var3);
            }
            this.field3412.method1011(this.field3413.field1836, 0, (byte) -74);
        } else {
            if (!this.field3472) {
                throw new RuntimeException("");
            }
            class523 var6 = (class523) this.field3419.method1405((long) (this.field3413.method927() << 16 | this.field3413.method939()), (byte) -106);
            if (var6 == null) {
                var6 = new class523(this, this.field3413.method927(), this.field3413.method939());
                class523 var8;
                for (this.field3421 += var6.field7386 * 4; ~this.field3421 < -2097153; this.field3421 -= var8.field7386) {
                    class375 var7 = this.field3409.method848((byte) -82);
                    if (var7 == null) {
                        break;
                    }
                    var8 = (class523) var7;
                    var8.method2258((byte) 123);
                    var8.method3678(-1);
                    this.field3220.releasePbuffer(var8.method3012((byte) 62));
                }
                this.field3419.method1403((byte) -18, var6, (long) (this.field3413.method927() << 16 | this.field3413.method939()));
            }
            this.field3409.method850(var6, 4);
            this.field3220.setPbuffer(var6.method3012((byte) 92));
        }
        this.field3232 = arg0.method927();
        this.field3332 = arg0.method939();
        this.method1528(-112);
        this.method1543(34162);
        this.method152();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljba;)V", line = 2066)
    public final void method116(class363 arg0) {
        ++field3330;
        this.field3551 = (class340) arg0;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2077)
    public final void method124(Canvas arg0) {
        ++field3377;
        if (this.field3223 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3266.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field3220.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field3266.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(II)V", line = 2117)
    public final void method1536(int arg0, int arg1) {
        ++field3268;
        if (~this.field3436 != ~arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    var3 = true;
                    var4 = false;
                    var5 = 2;
                } else if (~arg1 == -129) {
                    var3 = true;
                    var4 = true;
                    var5 = 3;
                } else {
                    var5 = 0;
                    var3 = true;
                    var4 = false;
                }
            } else {
                var3 = true;
                var5 = 1;
                var4 = true;
            }
            if (!this.field3439 == var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field3439 = var3;
            }
            if (this.field3433 != var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field3433 = var4;
            }
            if (this.field3432 != var5) {
                if (~var5 != -2) {
                    if (var5 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field3432 = var5;
            }
            this.field3436 = arg1;
            this.field3438 &= -29;
        }
        if (arg0 != 0) {
            this.field3445 = false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "(I)V", line = 2209)
    private final void method1537(int arg0) {
        ++field3210;
        if (this.field3543 != arg0) {
            this.field3543 = 3;
            this.method1530(-13900);
            this.method1516((byte) -84);
            this.field3438 &= -8;
        }
    }

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "()Z", line = 2226)
    public final boolean method167() {
        ++field3314;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lvu;I)V", line = 2235)
    public final void method1538(class306 arg0, int arg1) {
        ++field3317;
        if (arg1 != 768) {
            this.method135(-127);
        }
        if (this.field3526 != arg0) {
            if (this.field3539) {
                OpenGL.glBindBufferARB(34963, arg0.method1949(arg1 + -690));
            }
            this.field3526 = arg0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZZ)V", line = 2254)
    public final void method1539(boolean arg0, boolean arg1) {
        ++field3309;
        if (!arg0 == this.field3478) {
            this.field3478 = arg0;
            this.method1552(-112);
            this.field3438 &= -32;
        }
        if (arg1) {
            this.field3436 = -98;
        }
    }

    @OriginalMember(owner = "client!ok", name = "la", descriptor = "(IIII)V", line = 2271)
    public final void method184(int arg0, int arg1, int arg2, int arg3) {
        this.field3456 = arg1;
        ++field3381;
        this.field3512 = arg0;
        this.field3507 = arg3;
        this.field3452 = arg2;
        this.method1557((byte) 103);
        this.method1544((byte) -124);
        if (this.field3543 == 3) {
            this.method1530(-13900);
        } else if (~this.field3543 == -3) {
            this.method1568(0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)V", line = 2293)
    public final void method1540(byte arg0) {
        if (~this.field3438 != -5) {
            this.method1512((byte) -77);
            this.method1539(false, false);
            this.method1493(false, -59);
            this.method1571(false, 1);
            this.method1534(56, false);
            this.method1510((byte) -105, -2);
            this.method1536(0, 1);
            this.field3438 = 4;
        }
        ++field3337;
        if (arg0 < 111) {
            this.field3369 = -44L;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2315)
    public final class37 method215(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3203;
        return new class623(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(IIII)V", line = 2324)
    public static final void method1541(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -110 / ((-39 - arg2) / 53);
        int var5 = class287.field4270.field3701 * arg3 >> 8;
        ++field3313;
        if (~var5 != -1 && ~arg0 != 0) {
            class345.method2142(var5, 0, 0, class540.field7559, false, arg0);
            class43.field701 = true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "XA", descriptor = "(IIIII)V", line = 2343)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3229;
        this.method1546((byte) -75);
        this.method1536(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2364)
    public final void method182(Canvas arg0) {
        ++field3256;
        long var2 = 0L;
        if (arg0 != null && this.field3223 != arg0) {
            if (this.field3266.containsKey(arg0)) {
                Long var4 = (Long) this.field3266.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field3336;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field3220.surfaceResized(var2);
            if (this.field3230 == arg0) {
                this.method1513(0);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "(I)V", line = 2397)
    private final void method1542(int arg0) {
        ++field3360;
        if (this.field3463) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field3463 = false;
        }
        if (arg0 != 12877) {
            this.field3434 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "(I)V", line = 2418)
    private final void method1543(int arg0) {
        ++field3372;
        OpenGL.glViewport(this.field3542, this.field3496, this.field3232, this.field3332);
        if (arg0 != 34162) {
            this.field3488 = 50;
        }
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "(B)V", line = 2429)
    private final void method1544(byte arg0) {
        this.field3501 = (float) (-this.field3512 + this.field3468);
        if (arg0 == -124) {
            this.field3480 = (float) (-this.field3512 + this.field3488);
            this.field3519 = (float) (-this.field3456 + this.field3446);
            ++field3293;
            this.field3454 = (float) (-this.field3456 + this.field3449);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 2445)
    public static final void method1545(boolean arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        ++field3201;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class452.field6508.field496 : class452.field6508.field503);
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class239 var11 = class452.field6508.method361(-111, var8);
            if (var11.field3730 && var11.method1629(-9598).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class111.field1687 = -1;
                    class462.field6664 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class462.field6664 = var4;
        class35.field615 = 0;
        class111.field1687 = var5;
        if (arg2) {
            field3243 = null;
        }
        String[] var9 = new String[class111.field1687];
        for (int var10 = 0; ~class111.field1687 < ~var10; ++var10) {
            var9[var10] = class452.field6508.method361(-125, var4[var10]).method1629(-9598);
        }
        class318.method1998(class462.field6664, (byte) -124, var9);
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(B)V", line = 2519)
    private final void method1546(byte arg0) {
        ++field3194;
        if (~this.field3438 != -2) {
            this.method1512((byte) 106);
            this.method1539(false, false);
            this.method1493(false, -92);
            this.method1571(false, 1);
            this.method1534(109, false);
            this.method1505(-2, (class657) null);
            this.method1510((byte) -33, -2);
            this.method1497(1, (byte) -29);
            this.field3438 = 1;
        }
        if (arg0 > -42) {
            this.method121();
        }
    }

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "()Z", line = 2542)
    public final boolean method166() {
        ++field3238;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZ)Lf;", line = 2550)
    public final class702 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3378;
        return new class123(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[I[I)Lua;", line = 2562)
    public final class617 method164(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3339;
        return class617.method3426(arg2, 0, arg1, arg3, this, arg0);
    }

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "()Z", line = 2570)
    public final boolean method108() {
        ++field3300;
        return this.field3392.method1953((byte) 19, 3);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ldba;Z)V", line = 2579)
    public final void method1547(class79 arg0, boolean arg1) {
        if (!arg1) {
            this.field3511 = null;
        }
        ++field3271;
        if (this.field3414 >= 0 && this.field3418[this.field3414] == arg0) {
            this.field3418[this.field3414--] = null;
            arg0.method728((byte) -51);
            if (this.field3414 >= 0) {
                this.field3417 = this.field3418[this.field3414];
                this.field3417.method723((byte) 38);
            } else {
                this.field3417 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 2602)
    public class228(Canvas arg0, class209 arg1, int arg2) {
        super(arg1);
        this.field3394 = arg2;
        this.field3230 = this.field3223 = arg0;
        if (!class271.method1788("jaclib", -61)) {
            throw new RuntimeException("");
        } else if (!class271.method1788("jaggl", -104)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field3220 = new OpenGL();
                this.field3369 = this.field3336 = this.field3220.init(arg0, 8, 8, 8, 24, 0, this.field3394);
                if (~this.field3336 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method1567(-16357);
                    int var4 = this.method1559(2);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field3547 = this.field3514 ? 33639 : 5121;
                        if (this.field3467.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class208.method1377(' ', (byte) -112, this.field3467.replace('/', ' '));
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class645.method3583(98, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class645.method3583(87, var10.substring(0, 4))) {
                                                var5 = class440.method2607(7330, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field3539 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field3494 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field3522 = false;
                            }
                            this.field3471 &= this.field3220.method3279("GL_ARB_half_float_pixel");
                            this.field3448 = this.field3539;
                            this.field3504 = true;
                        }
                        if (~this.field3531.indexOf("intel") != 0) {
                            this.field3515 = false;
                        }
                        this.field3445 = !this.field3531.equals("s3 graphics");
                        if (this.field3539) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class489.method2838(false, true, (byte) 58);
                        this.field3407 = true;
                        this.field3398 = new class219(this, super.field2384);
                        this.method1555(1);
                        this.field3403 = new class358(this);
                        this.field3395 = new class667(this);
                        if (this.field3395.method3689((byte) -106)) {
                            this.field3396 = new class601(this);
                            if (!this.field3396.method3397((byte) -101)) {
                                this.field3396.method1129((byte) 100);
                                this.field3396 = null;
                            }
                        }
                        this.field3392 = new class307(this);
                        this.method1569((byte) -116);
                        this.method1513(0);
                        this.method183();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method158();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILcd;)V", line = 2748)
    public final void method1548(int arg0, class283 arg1) {
        if (this.field3549 != arg1) {
            if (this.field3539) {
                OpenGL.glBindBufferARB(34962, arg1.method1142(-22806));
            }
            this.field3549 = arg1;
        }
        ++field3219;
        if (arg0 != 34962) {
            this.method165((class499) null, -107);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIB)V", line = 2767)
    public final synchronized void method1549(int arg0, int arg1, byte arg2) {
        if (arg2 != -38) {
            this.field3400 = null;
        }
        ++field3355;
        class111 var4 = new class111(arg0);
        var4.field9386 = (long) arg1;
        this.field3425.method474(var4, 6);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FZFFF)V", line = 2781)
    public final void method1550(float arg0, boolean arg1, float arg2, float arg3, float arg4) {
        class50.field1028[0] = arg2;
        ++field3297;
        class50.field1028[1] = arg0;
        class50.field1028[3] = arg3;
        class50.field1028[2] = arg4;
        if (!arg1) {
            this.field3543 = -18;
        }
        OpenGL.glTexEnvfv(8960, 8705, class50.field1028, 0);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()Z", line = 2797)
    public final boolean method161() {
        ++field3239;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2810)
    public final void method111(Canvas arg0) {
        ++field3364;
        if (this.field3223 == arg0) {
            throw new RuntimeException();
        } else if (this.field3266.containsKey(arg0)) {
            Long var2 = (Long) this.field3266.get(arg0);
            this.field3220.releaseSurface(arg0, var2);
            this.field3266.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZJ)V", line = 2831)
    public final synchronized void method1551(boolean arg0, long arg1) {
        ++field3303;
        if (!arg0) {
            this.method1515(81, -7);
        }
        class665 var4 = new class665();
        var4.field9386 = arg1;
        this.field3430.method474(var4, 6);
    }

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "(I)V", line = 2849)
    private final void method1552(int arg0) {
        int var2 = 87 % ((-48 - arg0) / 48);
        if (this.field3478 && this.field3442 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field3328;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I", line = 2864)
    public final int method147() {
        ++field3200;
        return this.field3424 + this.field3420 + this.field3423;
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "(II)I", line = 2872)
    public final int method1553(int arg0, int arg1) {
        if (arg1 <= 2) {
            this.method1561(33);
        }
        ++field3382;
        if (arg0 != 5121 && arg0 != 5120) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (arg0 != 5125 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(II)V", line = 2898)
    public final synchronized void method1554(int arg0, int arg1) {
        ++field3267;
        class111 var3 = new class111(arg1);
        if (arg0 < 69) {
            this.field3367 = -42;
        }
        this.field3427.method474(var3, 6);
    }

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "(I)V", line = 2912)
    private final void method1555(int arg0) {
        ++field3274;
        this.field3491 = new class657[this.field3460];
        this.field3544 = new class673(this, 3553, 6408, 1, 1);
        new class673(this, 3553, 6408, 1, 1);
        new class673(this, 3553, 6408, 1, arg0);
        this.field3502 = new class633(this);
        this.field3533 = new class633(this);
        this.field3492 = new class633(this);
        this.field3527 = new class633(this);
        this.field3444 = new class633(this);
        this.field3530 = new class633(this);
        this.field3548 = new class633(this);
        this.field3457 = new class633(this);
        this.field3535 = new class633(this);
        this.field3525 = new class633(this);
        if (this.field3515) {
            this.field3486 = new class139(this);
            new class139(this);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)Ljba;", line = 2946)
    public final class363 method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3245;
        return this.field3493 ? new class339(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V", line = 2954)
    public final void method210() {
        ++field3366;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Z)V", line = 2961)
    private final void method1556(boolean arg0) {
        this.field3462 = (float) (this.field3513 - this.field3483) - this.field3505;
        ++field3385;
        if (!arg0) {
            this.method135(-28);
        }
        this.field3490 = -((float) this.field3442 * this.field3482) + this.field3462;
        if ((float) this.field3536 > this.field3490) {
            this.field3490 = (float) this.field3536;
        }
        OpenGL.glFogf(2915, this.field3490);
        OpenGL.glFogf(2916, this.field3462);
        class50.field1028[0] = (float) class689.method3797(16711680, this.field3506) / 1.671168E7F;
        class50.field1028[1] = (float) class689.method3797(65280, this.field3506) / 65280.0F;
        class50.field1028[2] = (float) class689.method3797(255, this.field3506) / 255.0F;
        OpenGL.glFogfv(2918, class50.field1028, 0);
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "(B)V", line = 2984)
    private final void method1557(byte arg0) {
        ++field3258;
        float[] var2 = this.field3524;
        int var3 = 102 / ((arg0 - 8) / 63);
        float var4 = (float) (-this.field3512 * this.field3536) / (float) this.field3452;
        float var5 = (float) ((-this.field3512 + this.field3232) * this.field3536) / (float) this.field3452;
        float var6 = (float) (this.field3536 * this.field3456) / (float) this.field3507;
        float var7 = (float) ((-this.field3332 + this.field3456) * this.field3536) / (float) this.field3507;
        if (var4 != var5 && var6 != var7) {
            float var8 = (float) this.field3536 * 2.0F;
            var2[3] = 0.0F;
            var2[15] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[6] = 0.0F;
            var2[11] = -1.0F;
            var2[0] = var8 / (var5 - var4);
            var2[8] = (var4 + var5) / (var5 - var4);
            var2[5] = var8 / (var6 - var7);
            var2[9] = (var6 + var7) / (var6 - var7);
            var2[10] = this.field3465 = (float) (-(this.field3536 + this.field3513)) / (float) (-this.field3536 + this.field3513);
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[14] = this.field3499 = -((float) this.field3513 * var8) / (float) (-this.field3536 + this.field3513);
        } else {
            var2[12] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[15] = 1.0F;
            var2[7] = 0.0F;
            var2[6] = 0.0F;
            var2[14] = 0.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[0] = 1.0F;
            var2[10] = 1.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[8] = 0.0F;
        }
        this.method1576(16711680);
    }

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "(I)V", line = 3045)
    public static void method1558(int arg0) {
        field3284 = null;
        if (arg0 != -5819) {
            field3284 = null;
        }
        field3243 = null;
    }

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "(I)I", line = 3065)
    private final int method1559(int arg0) {
        ++field3227;
        this.field3531 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field3467 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field3531.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field3531.indexOf("brian paul") != -1 || this.field3531.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class208.method1377(' ', (byte) -112, var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class440.method2607(7330, var4[0]);
                int var6 = class440.method2607(arg0 + 7328, var4[1]);
                this.field3520 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field3520 < 12) {
            var2 |= 2;
        }
        if (!this.field3220.method3279("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field3220.method3279("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field3460 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field3500 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field3528 = var7[0];
        if (this.field3460 < arg0 || this.field3500 < 2 || this.field3528 < 2) {
            var2 |= 16;
        }
        this.field3514 = Stream.method3483();
        this.field3472 = this.field3220.arePbuffersAvailable();
        this.field3539 = this.field3220.method3279("GL_ARB_vertex_buffer_object");
        this.field3540 = this.field3220.method3279("GL_ARB_multisample");
        this.field3489 = this.field3220.method3279("GL_ARB_vertex_program");
        this.field3220.method3279("GL_ARB_fragment_program");
        this.field3481 = this.field3220.method3279("GL_ARB_vertex_shader");
        this.field3464 = this.field3220.method3279("GL_ARB_fragment_shader");
        this.field3494 = this.field3220.method3279("GL_EXT_texture3D");
        this.field3471 = this.field3220.method3279("GL_ARB_texture_rectangle");
        this.field3493 = this.field3220.method3279("GL_ARB_texture_cube_map");
        this.field3522 = this.field3220.method3279("GL_ARB_texture_float");
        this.field3521 = false;
        this.field3515 = this.field3220.method3279("GL_EXT_framebuffer_object");
        this.field3541 = this.field3220.method3279("GL_EXT_framebuffer_blit");
        this.field3546 = this.field3220.method3279("GL_EXT_framebuffer_multisample");
        this.field3537 = this.field3546 & this.field3541;
        OpenGL.glGetFloatv(2834, class50.field1028, 0);
        this.field3453 = class50.field1028[1];
        this.field3508 = class50.field1028[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(FBF)V", line = 3148)
    public final void method1560(float arg0, byte arg1, float arg2) {
        this.field3505 = arg2;
        ++field3384;
        this.field3482 = arg0;
        this.method1556(true);
        if (arg1 != -99) {
            this.method1564((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "(I)V", line = 3162)
    public final void method1561(int arg0) {
        if (arg0 != 1) {
            this.field3550 = 0.5121662F;
        }
        if (this.field3438 != 8) {
            this.method1495((byte) -74);
            this.method1539(true, false);
            this.method1571(true, 1);
            this.method1534(92, true);
            this.method1536(arg0 ^ 1, 1);
            this.field3438 = 8;
        }
        ++field3279;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLlq;Llq;Llq;Llq;)V", line = 3182)
    public final void method1562(byte arg0, class512 arg1, class512 arg2, class512 arg3, class512 arg4) {
        ++field3342;
        if (arg4 != null) {
            this.method1548(34962, arg4.field7199);
            OpenGL.glVertexPointer(arg4.field7195, arg4.field7201, this.field3549.method1140((byte) -48), this.field3549.method1138(-19664) - -((long) arg4.field7194));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg2 != null) {
            this.method1548(34962, arg2.field7199);
            OpenGL.glNormalPointer(arg2.field7201, this.field3549.method1140((byte) -32), this.field3549.method1138(-19664) + (long) arg2.field7194);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 != -12) {
            this.field3423 = -19;
        }
        if (arg3 != null) {
            this.method1548(34962, arg3.field7199);
            OpenGL.glColorPointer(arg3.field7195, arg3.field7201, this.field3549.method1140((byte) 127), this.field3549.method1138(-19664) - -((long) arg3.field7194));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg1 != null) {
            this.method1548(34962, arg1.field7199);
            OpenGL.glTexCoordPointer(arg1.field7195, arg1.field7201, this.field3549.method1140((byte) -72), this.field3549.method1138(-19664) + (long) arg1.field7194);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "(B)V", line = 3231)
    private final void method1563(byte arg0) {
        if (arg0 != -2) {
            method1575(-35, -80, -9, -100);
        }
        ++field3277;
        this.field3220.method3277();
    }

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "(B)V", line = 3245)
    private final void method1564(byte arg0) {
        class50.field1028[2] = this.field3538 * this.field3503;
        if (arg0 != -29) {
            this.field3230 = null;
        }
        class50.field1028[1] = this.field3538 * this.field3497;
        ++field3338;
        class50.field1028[3] = 1.0F;
        class50.field1028[0] = this.field3538 * this.field3451;
        OpenGL.glLightModelfv(2899, class50.field1028, 0);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILdba;)V", line = 3261)
    public final void method1565(int arg0, class79 arg1) {
        if (arg0 != -13986) {
            this.field3468 = -47;
        }
        ++field3318;
        if (this.field3541) {
            this.method1547(arg1, true);
            this.method1572(2903, arg1);
        } else if (~this.field3411 <= -1 && this.field3416[this.field3411] == arg1) {
            this.field3416[this.field3411--] = null;
            arg1.method724(-24640);
            if (this.field3411 >= 0) {
                this.field3417 = this.field3415 = this.field3416[this.field3411];
                this.field3417.method726(20174);
            } else {
                this.field3417 = this.field3415 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 3298)
    public final synchronized void method151(int arg0) {
        ++field3199;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field3425.method481((byte) -57)) {
            class111 var12 = (class111) this.field3425.method483((byte) -126);
            class389.field5767[var3++] = (int) var12.field9386;
            this.field3423 -= var12.field1683;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class389.field5767, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class389.field5767, 0);
            var3 = 0;
        }
        while (!this.field3426.method481((byte) -57)) {
            class111 var11 = (class111) this.field3426.method483((byte) -112);
            class389.field5767[var3++] = (int) var11.field9386;
            this.field3420 -= var11.field1683;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class389.field5767, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class389.field5767, 0);
            var3 = 0;
        }
        while (!this.field3427.method481((byte) -57)) {
            class111 var10 = (class111) this.field3427.method483((byte) -117);
            class389.field5767[var3++] = var10.field1683;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class389.field5767, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class389.field5767, 0);
            var3 = 0;
        }
        while (!this.field3428.method481((byte) -57)) {
            class111 var9 = (class111) this.field3428.method483((byte) -120);
            class389.field5767[var3++] = (int) var9.field9386;
            this.field3424 -= var9.field1683;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class389.field5767, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class389.field5767, 0);
            boolean var4 = false;
        }
        while (!this.field3422.method481((byte) -57)) {
            class111 var8 = (class111) this.field3422.method483((byte) -128);
            OpenGL.glDeleteLists((int) var8.field9386, var8.field1683);
        }
        while (!this.field3429.method481((byte) -57)) {
            class665 var7 = this.field3429.method483((byte) -126);
            OpenGL.glDeleteProgramARB((int) var7.field9386);
        }
        while (!this.field3430.method481((byte) -57)) {
            class665 var6 = this.field3430.method483((byte) -119);
            OpenGL.glDeleteObjectARB(var6.field9386);
        }
        while (!this.field3422.method481((byte) -57)) {
            class111 var5 = (class111) this.field3422.method483((byte) -123);
            OpenGL.glDeleteLists((int) var5.field9386, var5.field1683);
        }
        this.field3398.method1437(true);
        if (this.method147() > 100663296 && ~class490.method2840(true) < ~(this.field3435 - -60000L)) {
            System.gc();
            this.field3435 = class490.method2840(true);
        }
        this.field3405 = var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Luq;[Lfg;Z)Lla;", line = 3462)
    public final class416 method128(class146 arg0, class113[] arg1, boolean arg2) {
        ++field3228;
        return new class419(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "()V", line = 3470)
    public final void method203() throws class621 {
        try {
            this.field3220.swapBuffers();
        } catch (Exception var1) {
        }
        ++field3388;
    }

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "(I)V", line = 3487)
    private final void method1566(int arg0) {
        ++field3325;
        int var2;
        for (var2 = arg0; ~var2 > ~this.field3476; ++var2) {
            class498 var3 = this.field3484[var2];
            class272.field4102[0] = (float) var3.method2883(127);
            int var4 = var2 + 16386;
            class272.field4102[1] = (float) var3.method2877(-1);
            class272.field4102[2] = (float) var3.method2875(true);
            class272.field4102[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class272.field4102, 0);
            int var5 = var3.method2878((byte) -111);
            float var6 = var3.method2876(arg0 + 1) / 255.0F;
            class272.field4102[1] = (float) (class689.method3797(65287, var5) >> 8) * var6;
            class272.field4102[0] = var6 * (float) class689.method3797(255, var5 >> 16);
            class272.field4102[2] = (float) class689.method3797(var5, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class272.field4102, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2880(-15) * var3.method2880(-15)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field3443) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field3443 = this.field3476;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(IIIII)V", line = 3529)
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field3197;
        if (arg0 - -arg2 >= this.field3468 && ~(-arg2 + arg0) >= ~this.field3488 && ~this.field3446 >= ~(arg1 + arg2) && ~(-arg2 + arg1) >= ~this.field3449) {
            this.method1546((byte) -110);
            this.method1536(0, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field3508 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field3453 >= (float) var8) {
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
                if (~var9 < -65) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class405.method2458(var9, -619912415);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class542.field7612[var11] * (float) arg2 + var6, class542.field7599[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Llm;IIII)Lda;", line = 3601)
    public final class55 method171(class461 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3371;
        return new class633(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "(I)V", line = 3611)
    private final void method1567(int arg0) {
        ++field3250;
        int var2 = 0;
        while (!this.field3220.method3278()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class561.method3202(1000L, (byte) -71);
        }
        if (arg0 != -16357) {
            this.method1561(-16);
        }
    }

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "(I)V", line = 3636)
    private final void method1568(int arg0) {
        ++field3263;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field3524, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ok", name = "CA", descriptor = "(IIII)V", line = 3648)
    public final void method133(int arg0, int arg1, int arg2, int arg3) {
        this.field3509 = arg3;
        this.field3487 = arg1;
        ++field3316;
        this.field3459 = arg0;
        this.field3479 = true;
        this.field3545 = arg2;
    }

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "(B)V", line = 3668)
    private final void method1569(byte arg0) {
        ++field3247;
        this.method1510((byte) 127, -2);
        for (int var2 = this.field3460 + -1; var2 >= 0; --var2) {
            this.method1500(33984, var2);
            this.method1505(-2, (class657) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method1527(1, 8448, 8448);
        this.method1503(2, 34168, (byte) 2, 770);
        this.method1542(12877);
        this.field3436 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field3432 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field3433 = true;
        if (arg0 < -99) {
            OpenGL.glColorMask(true, true, true, true);
            this.field3439 = true;
            this.method1539(true, false);
            this.method1493(true, -99);
            this.method1571(true, 1);
            this.method1534(39, true);
            this.method1528(-113);
            this.field3220.setSwapInterval(0);
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
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field3461 = this.field3506 = -1;
            this.method152();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIZ)V", line = 3740)
    public final void method1570(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (this.field3470 != arg2 || !this.field3534 != !this.field3479) {
            class673 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field3479 ? 3 : 0;
            if (arg2 < 0) {
                this.method1542(arg1 ^ 12877);
            } else {
                var5 = this.field3398.method1435(99, arg2);
                class159 var10 = super.field2384.method1386(arg2, -6514);
                if (var10.field2298 == 0 && var10.field2293 == 0) {
                    this.method1542(12877);
                } else {
                    int var11 = var10.field2304 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method1501((float) (this.field3405 % var12 * var10.field2298) / (float) var12, 0.0F, (float) (this.field3405 % var12 * var10.field2293) / (float) var12, 1);
                }
                if (!this.field3479) {
                    var8 = var10.field2294;
                    var9 = var10.field2300;
                    var7 = var10.field2291;
                }
                var6 = var10.field2284;
            }
            this.field3392.method1955(arg1 + 114, arg3, arg0, var9, var8, var7);
            if (!this.field3392.method1957(Integer.MAX_VALUE, var5, var6)) {
                this.method1505(-2, var5);
                this.method1497(var6, (byte) -29);
            }
            this.field3470 = arg2;
            this.field3534 = this.field3479;
        }
        ++field3217;
        this.field3438 &= -8;
        if (arg1 != 0) {
            this.method158();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIF)Lrc;", line = 3804)
    public final class498 method181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3354;
        return new class487(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "()I", line = 3813)
    public final int method115() {
        ++field3272;
        return this.field3513;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(ZI)V", line = 3821)
    public final void method1571(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.field3500 = 63;
        }
        if (!arg0 == this.field3437) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field3437 = arg0;
            this.field3438 &= -32;
        }
        ++field3370;
    }

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "()V", line = 3843)
    public final void method157() {
        ++field3236;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "()Z", line = 3852)
    public final boolean method162() {
        ++field3251;
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(Z)V", line = 3860)
    public final void method125(boolean arg0) {
        ++field3334;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(ILdba;)V", line = 3867)
    public final void method1572(int arg0, class79 arg1) {
        ++field3260;
        if (~this.field3408 <= -1 && this.field3410[this.field3408] == arg1) {
            if (arg0 == 2903) {
                this.field3410[this.field3408--] = null;
                arg1.method725((byte) -107);
                if (this.field3408 < 0) {
                    this.field3415 = null;
                } else {
                    this.field3415 = this.field3410[this.field3408];
                    this.field3415.method727(false);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "JA", descriptor = "()V", line = 3891)
    public final void method152() {
        ++field3292;
        this.field3446 = 0;
        this.field3488 = this.field3232;
        this.field3468 = 0;
        this.field3449 = this.field3332;
        OpenGL.glDisable(3089);
        this.method1544((byte) -124);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[Lrc;)V", line = 3907)
    public final void method134(int arg0, class498[] arg1) {
        ++field3214;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3484[var3] = arg1[var3];
        }
        this.field3476 = arg0;
        if (~this.field3543 != -2) {
            this.method1566(0);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIZ[B)Lcd;", line = 3928)
    public final class283 method1573(boolean arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field3345;
        if (arg3) {
            return null;
        } else {
            return (class283) (!this.field3539 || arg0 && !this.field3448 ? new class658(this, arg2, arg4, arg1) : new class165(this, arg2, arg4, arg1, arg0));
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 3947)
    public final void method179(boolean arg0) {
        ++field3265;
    }

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "()V", line = 3956)
    public final void method121() {
        this.field3479 = false;
        ++field3322;
    }

    @OriginalMember(owner = "client!ok", name = "DA", descriptor = "()I", line = 3972)
    public final int method192() {
        ++field3311;
        int var1 = this.field3552;
        this.field3552 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ok", name = "MA", descriptor = "(III[I)V", line = 3984)
    public final void method214(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3244;
        float var5 = (float) arg2 * this.field3434.field9832 + (float) arg0 * this.field3434.field9829 + (float) arg1 * this.field3434.field9849 + this.field3434.field9841;
        if (!((float) this.field3536 > var5) && !(var5 > (float) this.field3513)) {
            int var6 = (int) (((float) arg2 * this.field3434.field9852 + (float) arg0 * this.field3434.field9838 + (float) arg1 * this.field3434.field9847 + this.field3434.field9840) * (float) this.field3452 / var5);
            arg3[0] = (int) ((float) var6 - this.field3501);
            int var7 = (int) (((float) arg2 * this.field3434.field9856 + (float) arg0 * this.field3434.field9834 + (float) arg1 * this.field3434.field9837 + this.field3434.field9824) * (float) this.field3507 / var5);
            arg3[1] = (int) ((float) var7 + -this.field3519);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBII)V", line = 4006)
    public final void method1574(int arg0, byte arg1, int arg2, int arg3) {
        ++field3362;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        if (arg1 != -128) {
            this.field3332 = 28;
        }
        OpenGL.glTexEnvi(8960, 34200 - -arg3, arg2);
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(IIII)V", line = 4019)
    public static final void method1575(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 12229) {
            field3304 = 95;
        }
        if (arg0 == 1003) {
            class220.method1450(class239.field3742, arg2, arg1);
        } else if (~arg0 != -1005) {
            if (~arg0 == -1013) {
                class220.method1450(class31.field491, arg2, arg1);
            } else if (~arg0 != -1012) {
                if (arg0 == 1008) {
                    class220.method1450(class331.field4895, arg2, arg1);
                }
            } else {
                class220.method1450(class206.field2903, arg2, arg1);
            }
        } else {
            class220.method1450(class303.field4522, arg2, arg1);
        }
        ++field3349;
    }

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "(I)V", line = 4050)
    private final void method1576(int arg0) {
        this.field3524[14] = this.field3499;
        this.field3524[10] = this.field3465;
        ++field3299;
        this.field3550 = (float) this.field3513;
        if (arg0 != 16711680) {
            this.field3551 = null;
        }
        this.field3477 = (this.field3524[14] - (float) this.field3513) / this.field3524[10];
    }

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "(I)V", line = 4068)
    private final void method1577(int arg0) {
        ++field3319;
        class50.field1028[1] = this.field3497 * this.field3455;
        if (arg0 != 8448) {
            this.field3522 = true;
        }
        class50.field1028[2] = this.field3503 * this.field3455;
        class50.field1028[0] = this.field3455 * this.field3451;
        class50.field1028[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class50.field1028, 0);
        class50.field1028[3] = 1.0F;
        class50.field1028[2] = -this.field3466 * this.field3503;
        class50.field1028[0] = -this.field3466 * this.field3451;
        class50.field1028[1] = -this.field3466 * this.field3497;
        OpenGL.glLightfv(16385, 4609, class50.field1028, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V", line = 4090)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method1546((byte) -81);
        ++field3363;
        this.method1536(0, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "()V", line = 4109)
    public final void method213() {
        ++field3387;
        if (this.field3515) {
            if (this.field3415 != this.field3412) {
                throw new RuntimeException();
            }
            this.field3412.method1003(0, -99);
            this.field3412.method1003(8, -116);
            this.method1565(-13986, this.field3412);
        } else {
            if (!this.field3472) {
                throw new RuntimeException("");
            }
            this.field3413.method942(0, 0, this.field3232, this.field3332, 0, 0);
            this.field3220.setSurface(this.field3369);
        }
        this.field3413 = null;
        this.field3232 = this.field3253;
        this.field3332 = this.field3367;
        this.method1528(-104);
        this.method1543(34162);
        this.method152();
    }

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "()I", line = 4141)
    public final int method173() {
        ++field3333;
        return 4;
    }

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "(IIIII)V", line = 4149)
    public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1546((byte) -82);
        ++field3202;
        this.method1536(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "()Z", line = 4169)
    public final boolean method216() {
        ++field3226;
        return this.field3396 != null && (this.field3394 <= 1 || this.field3537);
    }

    @OriginalMember(owner = "client!ok", name = "IA", descriptor = "(IIIIII[BII)V", line = 4178)
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3373;
        float var10;
        float var11;
        if (this.field3450 != null && this.field3450.field9511 >= arg2 && ~this.field3450.field9515 <= ~arg3) {
            this.field3450.method3732(arg6, -6577, arg2, 0, 0, false, 0, 0, 6406, arg3);
            var10 = (float) arg3 * this.field3450.field7682 / (float) this.field3450.field9515;
            var11 = (float) arg2 * this.field3450.field7676 / (float) this.field3450.field9511;
        } else {
            this.field3450 = class568.method3231(arg3, 100, arg2, arg6, 6406, false, this, 6406);
            this.field3450.method3736(-85, false, false);
            var11 = this.field3450.field7676;
            var10 = this.field3450.field7682;
        }
        this.method1494(-72);
        this.method1505(-2, this.field3450);
        this.method1536(0, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1520((byte) -71, arg5);
        this.method1527(1, 34165, 34165);
        this.method1503(0, 34166, (byte) 2, 768);
        this.method1503(2, 5890, (byte) 2, 770);
        this.method1574(34166, (byte) -128, 770, 0);
        this.method1574(5890, (byte) -128, 770, 2);
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
        this.method1503(0, 5890, (byte) 2, 768);
        this.method1503(2, 34166, (byte) 2, 770);
        this.method1574(5890, (byte) -128, 770, 0);
        this.method1574(34166, (byte) -128, 770, 2);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(IIIIII)V", line = 4238)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1546((byte) -97);
        ++field3221;
        this.method1536(0, arg5);
        float var7 = (float) arg2 - (float) arg0;
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

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 4270)
    public final void method135(int arg0) {
        ++field3389;
        this.method1567(-16357);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V", line = 4278)
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field3347;
        this.method149(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lq;)V", line = 4290)
    public final void method155(class391 arg0) {
        ++field3324;
        this.field3434.method274(arg0);
        this.field3440.method274(this.field3434);
        this.field3440.method3884(1);
        this.field3441.method3888(0, this.field3440);
        if (this.field3543 != 1) {
            this.method1516((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "()Z", line = 4310)
    public final boolean method148() {
        ++field3286;
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 4318)
    public final void method101(int arg0) {
        ++field3344;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field3391 = arg0;
            this.field3398.method1434(71);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(ILdba;)V", line = 4332)
    public final void method1578(int arg0, class79 arg1) {
        ++field3224;
        if (this.field3541) {
            this.method1502(-1, arg1);
            this.method1498(arg1, 17741);
        } else {
            if (~this.field3411 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field3411 <= -1) {
                this.field3416[this.field3411].method724(-24640);
            }
            this.field3417 = this.field3415 = this.field3416[++this.field3411] = arg1;
            this.field3417.method726(20174);
        }
        if (arg0 != 0) {
            this.field3457 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "(B)Lqe;", line = 4371)
    public final class431 method1579(byte arg0) {
        ++field3320;
        if (arg0 >= -104) {
            return null;
        } else {
            return this.field3551 != null ? this.field3551.method733((byte) 20) : null;
        }
    }
}
