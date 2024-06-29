import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class232 extends class548 {

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "Lmba;")
    private class646 field3168 = new class646();

    @OriginalMember(owner = "client!rl", name = "fe", descriptor = "Z")
    public boolean field3335 = true;

    @OriginalMember(owner = "client!rl", name = "he", descriptor = "Lsp;")
    public class474 field3337 = new class474();

    @OriginalMember(owner = "client!rl", name = "ie", descriptor = "Lsp;")
    public class474 field3338 = new class474();

    @OriginalMember(owner = "client!rl", name = "je", descriptor = "Lsp;")
    public class474 field3339 = new class474();

    @OriginalMember(owner = "client!rl", name = "ke", descriptor = "Lsp;")
    public class474 field3340 = new class474();

    @OriginalMember(owner = "client!rl", name = "le", descriptor = "Lsp;")
    private class474 field3341 = new class474();

    @OriginalMember(owner = "client!rl", name = "me", descriptor = "Lsp;")
    private class474 field3342 = new class474();

    @OriginalMember(owner = "client!rl", name = "ne", descriptor = "Z")
    public boolean field3343 = true;

    @OriginalMember(owner = "client!rl", name = "ye", descriptor = "F")
    public float field3354 = 1.0F;

    @OriginalMember(owner = "client!rl", name = "se", descriptor = "I")
    private int field3348 = 0;

    @OriginalMember(owner = "client!rl", name = "Je", descriptor = "F")
    public float field3365 = 1.0F;

    @OriginalMember(owner = "client!rl", name = "Ce", descriptor = "Z")
    public boolean field3358 = true;

    @OriginalMember(owner = "client!rl", name = "ve", descriptor = "I")
    private int field3351 = 16777215;

    @OriginalMember(owner = "client!rl", name = "Ge", descriptor = "I")
    private int field3362 = 1;

    @OriginalMember(owner = "client!rl", name = "Fe", descriptor = "I")
    private int field3361 = -1;

    @OriginalMember(owner = "client!rl", name = "ue", descriptor = "I")
    public int field3350 = 0;

    @OriginalMember(owner = "client!rl", name = "Ze", descriptor = "[F")
    public float[] field3381 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!rl", name = "Be", descriptor = "I")
    public int field3357 = 0;

    @OriginalMember(owner = "client!rl", name = "xe", descriptor = "I")
    public int field3353 = 50;

    @OriginalMember(owner = "client!rl", name = "Ae", descriptor = "I")
    private int field3356 = 0;

    @OriginalMember(owner = "client!rl", name = "hf", descriptor = "[F")
    private float[] field3389 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rl", name = "Ne", descriptor = "F")
    public float field3369 = 3584.0F;

    @OriginalMember(owner = "client!rl", name = "He", descriptor = "I")
    public int field3363 = 0;

    @OriginalMember(owner = "client!rl", name = "ff", descriptor = "I")
    public int field3387 = 0;

    @OriginalMember(owner = "client!rl", name = "uf", descriptor = "Z")
    public boolean field3401 = false;

    @OriginalMember(owner = "client!rl", name = "kf", descriptor = "[F")
    private float[] field3391 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rl", name = "Me", descriptor = "Z")
    public boolean field3368 = false;

    @OriginalMember(owner = "client!rl", name = "of", descriptor = "Z")
    private boolean field3395 = false;

    @OriginalMember(owner = "client!rl", name = "xf", descriptor = "Z")
    private boolean field3404 = false;

    @OriginalMember(owner = "client!rl", name = "Oe", descriptor = "I")
    public int field3370 = 512;

    @OriginalMember(owner = "client!rl", name = "jf", descriptor = "Z")
    public boolean field3390 = true;

    @OriginalMember(owner = "client!rl", name = "Ff", descriptor = "Z")
    public boolean field3412 = false;

    @OriginalMember(owner = "client!rl", name = "Qf", descriptor = "Z")
    public boolean field3423 = true;

    @OriginalMember(owner = "client!rl", name = "Lf", descriptor = "F")
    public float field3418 = -1.0F;

    @OriginalMember(owner = "client!rl", name = "If", descriptor = "I")
    public int field3415 = 0;

    @OriginalMember(owner = "client!rl", name = "rf", descriptor = "Lfv;")
    public class718 field3398 = class269.field3932;

    @OriginalMember(owner = "client!rl", name = "Kf", descriptor = "I")
    public int field3417 = 0;

    @OriginalMember(owner = "client!rl", name = "Ie", descriptor = "I")
    private int field3364 = -1;

    @OriginalMember(owner = "client!rl", name = "Ef", descriptor = "I")
    public int field3411 = 512;

    @OriginalMember(owner = "client!rl", name = "bf", descriptor = "I")
    public int field3383 = 128;

    @OriginalMember(owner = "client!rl", name = "yf", descriptor = "I")
    public int field3405 = -1;

    @OriginalMember(owner = "client!rl", name = "Df", descriptor = "I")
    private int field3410 = 0;

    @OriginalMember(owner = "client!rl", name = "Pf", descriptor = "I")
    public int field3422 = 0;

    @OriginalMember(owner = "client!rl", name = "Of", descriptor = "[F")
    public float[] field3421 = this.field3389;

    @OriginalMember(owner = "client!rl", name = "zf", descriptor = "I")
    public int field3406 = -1;

    @OriginalMember(owner = "client!rl", name = "vf", descriptor = "I")
    public int field3402 = 0;

    @OriginalMember(owner = "client!rl", name = "Zf", descriptor = "Lcj;")
    public class445 field3432 = class596.field8092;

    @OriginalMember(owner = "client!rl", name = "Rf", descriptor = "Z")
    private boolean field3424 = false;

    @OriginalMember(owner = "client!rl", name = "Ue", descriptor = "F")
    public float field3376 = 3584.0F;

    @OriginalMember(owner = "client!rl", name = "Cf", descriptor = "Z")
    private boolean field3409 = false;

    @OriginalMember(owner = "client!rl", name = "Nf", descriptor = "F")
    public float field3420 = 1.0F;

    @OriginalMember(owner = "client!rl", name = "Hf", descriptor = "I")
    public int field3414 = 0;

    @OriginalMember(owner = "client!rl", name = "bg", descriptor = "[F")
    private float[] field3434 = new float[16];

    @OriginalMember(owner = "client!rl", name = "te", descriptor = "Z")
    public boolean field3349 = false;

    @OriginalMember(owner = "client!rl", name = "Gf", descriptor = "F")
    public float field3413 = 1.0F;

    @OriginalMember(owner = "client!rl", name = "we", descriptor = "I")
    public int field3352 = 3584;

    @OriginalMember(owner = "client!rl", name = "fg", descriptor = "[F")
    private float[] field3438 = new float[16];

    @OriginalMember(owner = "client!rl", name = "Tf", descriptor = "F")
    public float field3426 = -1.0F;

    @OriginalMember(owner = "client!rl", name = "Vf", descriptor = "I")
    public int field3428 = 8;

    @OriginalMember(owner = "client!rl", name = "cf", descriptor = "Z")
    private boolean field3384 = false;

    @OriginalMember(owner = "client!rl", name = "mf", descriptor = "[F")
    private float[] field3393 = new float[16];

    @OriginalMember(owner = "client!rl", name = "Mf", descriptor = "Z")
    public boolean field3419 = true;

    @OriginalMember(owner = "client!rl", name = "eg", descriptor = "I")
    private int field3437 = -1;

    @OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
    public int field3433 = 3;

    @OriginalMember(owner = "client!rl", name = "dg", descriptor = "Z")
    private boolean field3436 = false;

    @OriginalMember(owner = "client!rl", name = "kg", descriptor = "[F")
    private float[] field3443 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rl", name = "jg", descriptor = "I")
    private int field3442 = 0;

    @OriginalMember(owner = "client!rl", name = "Wf", descriptor = "I")
    public int field3429 = 0;

    @OriginalMember(owner = "client!rl", name = "ze", descriptor = "[F")
    public float[] field3355 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rl", name = "df", descriptor = "F")
    private float field3385 = 1.0F;

    @OriginalMember(owner = "client!rl", name = "ig", descriptor = "[Lkl;")
    private class712[] field3441 = new class712[10];

    @OriginalMember(owner = "client!rl", name = "Ee", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3360 = new Stream();

    @OriginalMember(owner = "client!rl", name = "mg", descriptor = "Lsp;")
    private class474 field3445 = new class474();

    @OriginalMember(owner = "client!rl", name = "Af", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "Ljava/lang/Object;")
    public Object field3149;

    @OriginalMember(owner = "client!rl", name = "Kd", descriptor = "Ljava/lang/Object;")
    private Object field3314;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3160;

    @OriginalMember(owner = "client!rl", name = "Ic", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3260;

    @OriginalMember(owner = "client!rl", name = "ec", descriptor = "Luu;")
    public class237 field3230;

    @OriginalMember(owner = "client!rl", name = "Ld", descriptor = "I")
    private int field3315;

    @OriginalMember(owner = "client!rl", name = "pd", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!rl", name = "cg", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!rl", name = "Lc", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!rl", name = "vb", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!rl", name = "ib", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field3182;

    @OriginalMember(owner = "client!rl", name = "Ve", descriptor = "Lfja;")
    private class466 field3377;

    @OriginalMember(owner = "client!rl", name = "pe", descriptor = "F")
    public float field3345;

    @OriginalMember(owner = "client!rl", name = "Ke", descriptor = "F")
    public float field3366;

    @OriginalMember(owner = "client!rl", name = "Xe", descriptor = "F")
    public float field3379;

    @OriginalMember(owner = "client!rl", name = "pf", descriptor = "F")
    private float field3396;

    @OriginalMember(owner = "client!rl", name = "qf", descriptor = "F")
    private float field3397;

    @OriginalMember(owner = "client!rl", name = "sf", descriptor = "F")
    public float field3399;

    @OriginalMember(owner = "client!rl", name = "wf", descriptor = "F")
    public float field3403;

    @OriginalMember(owner = "client!rl", name = "Bf", descriptor = "F")
    public float field3408;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rl", name = "jb", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rl", name = "kb", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!rl", name = "mb", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!rl", name = "nb", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!rl", name = "ob", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!rl", name = "pb", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!rl", name = "qb", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!rl", name = "rb", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rl", name = "sb", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rl", name = "tb", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!rl", name = "ub", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!rl", name = "wb", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rl", name = "xb", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!rl", name = "yb", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rl", name = "zb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!rl", name = "Ab", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!rl", name = "Cb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rl", name = "Db", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!rl", name = "Eb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!rl", name = "Fb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!rl", name = "Gb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!rl", name = "Hb", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!rl", name = "Ib", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!rl", name = "Jb", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!rl", name = "Kb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!rl", name = "Lb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!rl", name = "Mb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rl", name = "Nb", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rl", name = "Ob", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rl", name = "Pb", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rl", name = "Qb", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!rl", name = "Rb", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rl", name = "Sb", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!rl", name = "Tb", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rl", name = "Ub", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!rl", name = "Vb", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!rl", name = "Wb", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rl", name = "Xb", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!rl", name = "Yb", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!rl", name = "Zb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rl", name = "ac", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rl", name = "bc", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!rl", name = "cc", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!rl", name = "dc", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rl", name = "fc", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!rl", name = "gc", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!rl", name = "hc", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!rl", name = "ic", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!rl", name = "jc", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!rl", name = "kc", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rl", name = "lc", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!rl", name = "mc", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rl", name = "nc", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!rl", name = "oc", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!rl", name = "pc", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rl", name = "qc", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rl", name = "rc", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!rl", name = "sc", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!rl", name = "uc", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!rl", name = "vc", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rl", name = "wc", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rl", name = "xc", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!rl", name = "yc", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rl", name = "zc", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!rl", name = "Ac", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rl", name = "Bc", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!rl", name = "Cc", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!rl", name = "Dc", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!rl", name = "Ec", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!rl", name = "Fc", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!rl", name = "Gc", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rl", name = "Hc", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!rl", name = "Jc", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!rl", name = "Kc", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rl", name = "Mc", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!rl", name = "Nc", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!rl", name = "Oc", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!rl", name = "Pc", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!rl", name = "Qc", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!rl", name = "Rc", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!rl", name = "Sc", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!rl", name = "Tc", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!rl", name = "Uc", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!rl", name = "Vc", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!rl", name = "Wc", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!rl", name = "Xc", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!rl", name = "Yc", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!rl", name = "Zc", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!rl", name = "ad", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!rl", name = "bd", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!rl", name = "cd", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!rl", name = "dd", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!rl", name = "ed", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rl", name = "fd", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!rl", name = "gd", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!rl", name = "hd", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!rl", name = "id", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!rl", name = "jd", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!rl", name = "kd", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!rl", name = "ld", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!rl", name = "md", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!rl", name = "nd", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!rl", name = "od", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!rl", name = "qd", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!rl", name = "rd", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!rl", name = "sd", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!rl", name = "td", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!rl", name = "ud", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!rl", name = "vd", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!rl", name = "wd", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!rl", name = "xd", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!rl", name = "yd", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!rl", name = "zd", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!rl", name = "Bd", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rl", name = "Cd", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rl", name = "Dd", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rl", name = "Ed", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!rl", name = "Fd", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!rl", name = "Gd", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!rl", name = "Hd", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!rl", name = "Id", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!rl", name = "Jd", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!rl", name = "Md", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rl", name = "Nd", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!rl", name = "Od", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!rl", name = "Pd", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!rl", name = "Qd", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!rl", name = "Rd", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!rl", name = "Sd", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!rl", name = "Td", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!rl", name = "Ud", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!rl", name = "Vd", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!rl", name = "Wd", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!rl", name = "Xd", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rl", name = "Yd", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!rl", name = "Zd", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rl", name = "ae", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rl", name = "be", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!rl", name = "ce", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rl", name = "de", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!rl", name = "ee", descriptor = "I")
    public int field3334;

    @OriginalMember(owner = "client!rl", name = "ge", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rl", name = "oe", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!rl", name = "Pe", descriptor = "I")
    private int field3371;

    @OriginalMember(owner = "client!rl", name = "We", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!rl", name = "Ye", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!rl", name = "gf", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!rl", name = "tf", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!rl", name = "Jf", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!rl", name = "Xf", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!rl", name = "Yf", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!rl", name = "hg", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!rl", name = "Ig", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!rl", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!rl", name = "wg", descriptor = "Ljs;")
    private class174 field3455;

    @OriginalMember(owner = "client!rl", name = "Uf", descriptor = "Lhba;")
    public class190 field3427;

    @OriginalMember(owner = "client!rl", name = "Te", descriptor = "Lko;")
    private class320 field3375;

    @OriginalMember(owner = "client!rl", name = "lg", descriptor = "Lqfa;")
    public class328 field3444;

    @OriginalMember(owner = "client!rl", name = "ng", descriptor = "Lqfa;")
    public class328 field3446;

    @OriginalMember(owner = "client!rl", name = "rg", descriptor = "Lqfa;")
    public class328 field3450;

    @OriginalMember(owner = "client!rl", name = "ug", descriptor = "Lqfa;")
    public class328 field3453;

    @OriginalMember(owner = "client!rl", name = "vg", descriptor = "Lqfa;")
    public class328 field3454;

    @OriginalMember(owner = "client!rl", name = "xg", descriptor = "Lqfa;")
    public class328 field3456;

    @OriginalMember(owner = "client!rl", name = "yg", descriptor = "Lqfa;")
    public class328 field3457;

    @OriginalMember(owner = "client!rl", name = "Ag", descriptor = "Lqfa;")
    public class328 field3459;

    @OriginalMember(owner = "client!rl", name = "Bg", descriptor = "Lqfa;")
    public class328 field3460;

    @OriginalMember(owner = "client!rl", name = "Gg", descriptor = "Lqfa;")
    public class328 field3465;

    @OriginalMember(owner = "client!rl", name = "lb", descriptor = "Lep;")
    public class374 field3185;

    @OriginalMember(owner = "client!rl", name = "af", descriptor = "Lhl;")
    private class398 field3382;

    @OriginalMember(owner = "client!rl", name = "og", descriptor = "Lrv;")
    private class440 field3447;

    @OriginalMember(owner = "client!rl", name = "sg", descriptor = "Lrv;")
    private class440 field3451;

    @OriginalMember(owner = "client!rl", name = "Cg", descriptor = "Lrv;")
    private class440 field3461;

    @OriginalMember(owner = "client!rl", name = "pg", descriptor = "Lcc;")
    public class579 field3448;

    @OriginalMember(owner = "client!rl", name = "qg", descriptor = "Lcc;")
    public class579 field3449;

    @OriginalMember(owner = "client!rl", name = "tg", descriptor = "Lcc;")
    private class579 field3452;

    @OriginalMember(owner = "client!rl", name = "zg", descriptor = "Lcc;")
    private class579 field3458;

    @OriginalMember(owner = "client!rl", name = "Dg", descriptor = "Lcc;")
    public class579 field3462;

    @OriginalMember(owner = "client!rl", name = "Eg", descriptor = "Lcc;")
    public class579 field3463;

    @OriginalMember(owner = "client!rl", name = "Fg", descriptor = "Lcc;")
    private class579 field3464;

    @OriginalMember(owner = "client!rl", name = "Re", descriptor = "Lkl;")
    private class712 field3373;

    @OriginalMember(owner = "client!rl", name = "tc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3245;

    @OriginalMember(owner = "client!rl", name = "Ad", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field3304;

    @OriginalMember(owner = "client!rl", name = "Bb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3201;

    @OriginalMember(owner = "client!rl", name = "De", descriptor = "Z")
    public boolean field3359;

    @OriginalMember(owner = "client!rl", name = "Qe", descriptor = "Z")
    public boolean field3372;

    @OriginalMember(owner = "client!rl", name = "Se", descriptor = "Z")
    public boolean field3374;

    @OriginalMember(owner = "client!rl", name = "nf", descriptor = "Z")
    public boolean field3394;

    @OriginalMember(owner = "client!rl", name = "Sf", descriptor = "Z")
    public boolean field3425;

    @OriginalMember(owner = "client!rl", name = "Hg", descriptor = "Z")
    public boolean field3466;

    @OriginalMember(owner = "client!rl", name = "Le", descriptor = "[Lhba;")
    private class190[] field3367;

    @OriginalMember(owner = "client!rl", name = "ef", descriptor = "[Lef;")
    public class263[] field3386;

    @OriginalMember(owner = "client!rl", name = "gg", descriptor = "[Lef;")
    public class263[] field3439;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "[Lfd;")
    public static class298[] field3147;

    @OriginalMember(owner = "client!rl", name = "lf", descriptor = "[Lkq;")
    public class345[] field3392;

    @OriginalMember(owner = "client!rl", name = "re", descriptor = "[Lsp;")
    public class474[] field3347;

    @OriginalMember(owner = "client!rl", name = "qe", descriptor = "[Ltj;")
    public class687[] field3346;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([FI)[F")
    public final float[] method1384(float[] arg0, int arg1) {
        arg0[12] = this.field3421[3];
        arg0[8] = this.field3421[2];
        ++field3216;
        arg0[0] = this.field3421[0];
        arg0[4] = this.field3421[1];
        arg0[5] = this.field3421[5];
        arg0[1] = this.field3421[4];
        arg0[9] = this.field3421[6];
        arg0[2] = this.field3421[8];
        arg0[13] = this.field3421[7];
        arg0[3] = this.field3421[12];
        arg0[6] = this.field3421[arg1];
        arg0[10] = this.field3421[10];
        arg0[14] = this.field3421[11];
        arg0[7] = this.field3421[13];
        arg0[15] = this.field3421[15];
        arg0[11] = this.field3421[14];
        return arg0;
    }

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "()Lih;")
    public final class744 method1385() {
        ++field3232;
        return this.field3338;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V")
    private final void method1386(int arg0) {
        int var2 = 93 % ((arg0 - -78) / 47);
        ++field3262;
        if (~this.field3344 != -2) {
            this.method1493(-25);
            this.method1467(false, -32);
            this.method1530((byte) -95, false);
            this.method1491(-32, false);
            this.method1453(false, 51);
            this.method1477(false, false, -65, -2);
            this.method1503(1, (byte) 106);
            this.method1458(399403340, this.field3427);
            this.field3344 = 1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "()Z")
    public final boolean method1387() {
        ++field3282;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lef;BLef;)V")
    public final void method1388(class263 arg0, byte arg1, class263 arg2) {
        if (arg1 != 52) {
            this.method1389();
        }
        ++field3292;
        boolean var4 = false;
        if (this.field3386[this.field3350] != arg2) {
            this.field3386[this.field3350] = arg2;
            this.method267(true);
            var4 = true;
        }
        if (this.field3439[this.field3350] != arg0) {
            this.field3439[this.field3350] = arg0;
            var4 = true;
            this.method301((byte) 7);
        }
        if (var4) {
            this.field3344 &= -30;
        }
    }

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "()Z")
    public final boolean method1389() {
        ++field3328;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(I)V")
    public abstract void method286(int arg0);

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)I")
    public final int method1390(int arg0, int arg1) {
        ++field3163;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lhe;)V")
    public final void method1391(class577 arg0) {
        ++field3203;
        this.field3375 = (class320) arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lej;[Loia;Z)Lda;")
    public final class402 method1392(class179 arg0, class52[] arg1, boolean arg2) {
        ++field3169;
        return new class132(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "()V")
    public void method312() {
        if (!this.field3436) {
            for (class71 var1 = this.field3168.method3618(113); var1 != null; var1 = this.field3168.method3619(0)) {
                ((class516) var1).method3089(-834900382);
            }
            Enumeration var2 = this.field3201.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method285(this.field3201.get(var3), var3, 35);
            }
            class394.method2462(103, false, true);
            this.field3182.release();
            this.field3436 = true;
        }
        ++field3148;
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)V")
    public abstract void method335(int arg0);

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(I)V")
    public abstract void method276(int arg0);

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
    public abstract void method301(byte arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Liv;[FIZIB)Ldg;")
    public final class19 method1393(class25 arg0, float[] arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        ++field3215;
        int var7 = 63 % ((19 - arg5) / 47);
        return this.method345(0, arg2, arg3, 0, (byte) -59, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
    public abstract void method321(int arg0);

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)V")
    private final void method1394(int arg0) {
        if (!this.field3395) {
            float[] var2 = this.field3393;
            float var3 = (float) (-this.field3387 * this.field3353) / (float) this.field3370;
            float var4 = (float) ((-this.field3387 + this.field3195) * this.field3353) / (float) this.field3370;
            float var5 = (float) (this.field3402 * this.field3353) / (float) this.field3411;
            float var6 = (float) ((-this.field3293 + this.field3402) * this.field3353) / (float) this.field3411;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field3353 * 2.0F;
                var2[2] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[14] = this.field3397 = (float) (this.field3353 * this.field3352) / (float) (-this.field3352 + this.field3353);
                var2[3] = 0.0F;
                var2[11] = -1.0F;
                var2[0] = var7 / (var4 - var3);
                var2[10] = this.field3396 = (float) this.field3352 / (float) (-this.field3352 + this.field3353);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[7] = 0.0F;
                var2[6] = 0.0F;
            } else {
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method1452((byte) 46);
            this.field3395 = true;
        }
        ++field3297;
        if (arg0 != -5449) {
            this.method305(-32, (Canvas) null, (Object) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()Z")
    public final boolean method1395() {
        ++field3224;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    private final void method1396(byte arg0) {
        if (arg0 != -111) {
            this.field3442 = 14;
        }
        if (!this.field3409) {
            float[] var2 = this.field3438;
            float var3 = (float) this.field3353;
            float var4 = (float) this.field3352;
            float var5 = (float) (-this.field3402) * this.field3385 / (float) this.field3411;
            float var6 = (float) (-this.field3387) * this.field3385 / (float) this.field3370;
            float var7 = (float) (this.field3195 - this.field3387) * this.field3385 / (float) this.field3370;
            float var8 = (float) (-this.field3402 + this.field3293) * this.field3385 / (float) this.field3411;
            if (var6 != var7 && var5 != var8) {
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[14] = var3 / (-var4 + var3);
                var2[0] = 2.0F / (-var6 + var7);
                var2[8] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[10] = 1.0F / (var3 - var4);
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = 0.0F;
            } else {
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
            }
            this.method1489((byte) -126);
            this.field3409 = true;
        }
        ++field3198;
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)V")
    private final void method1397(int arg0) {
        this.field3451 = this.method319((byte) 77, true);
        ++field3309;
        this.field3451.method2140((byte) -30, 12, 24);
        this.field3452 = this.method331(new class40[] { new class40(class385.field5515) }, 4982);
        if (arg0 >= -110) {
            this.field3365 = -0.84336966F;
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
    public final void method1398(int arg0) {
        ++field3161;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field3377 != null) {
                this.field3377.method2846((byte) -112);
            }
            this.field3383 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "(I)V")
    public final void method1399(int arg0) {
        this.field3433 = 0;
        ++field3302;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field3433;
        }
        this.field3428 = 1 << this.field3433;
    }

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)V")
    public final void method1400(int arg0) {
        ++field3318;
        int var2 = 61 / ((-48 - arg0) / 53);
        if (class269.field3932 != this.field3398) {
            class718 var3 = this.field3398;
            this.field3398 = class269.field3932;
            if (var3.method4026(126)) {
                this.method1455(5);
            }
            this.field3344 &= -32;
            this.field3421 = this.field3389;
        }
    }

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)I")
    public final int method1401(int arg0) {
        ++field3268;
        if (arg0 > -25) {
            this.method1391((class577) null);
        }
        return this.field3442;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BZ)V")
    public abstract void method266(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)V")
    public abstract void method298(int arg0);

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "(ILaa;II)V")
    public final void method1402(int arg0, class573 arg1, int arg2, int arg3) {
        ++field3313;
        class297 var5 = (class297) arg1;
        class19 var6 = var5.field4229;
        this.method1546((byte) -104);
        this.method1458(399403340, var6);
        this.method1422(11665, 1);
        this.method1388(class87.field1239, (byte) 52, class87.field1239);
        this.method1408(0, 0, class520.field7247);
        this.method1414(arg0, (byte) -100);
        this.field3337.method2886(0.0F, (float) this.field3293, (float) this.field3195, (byte) -65);
        this.method1443(0);
        this.field3347[0].method2886(1.0F, var6.method97(-28409, (float) this.field3293), var6.method96((float) this.field3195, -21696), (byte) -65);
        this.field3347[0].method2875(0.0F, var6.method96((float) (-arg2), -21696), var6.method97(-28409, (float) (-arg3)), -3758);
        this.field3392[0] = class393.field5647;
        this.method1432(-76);
        this.method1440((byte) -111);
        this.method1459(0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZ[III)Ldg;")
    public abstract class19 method343(int arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(Z)V")
    public abstract void method267(boolean arg0);

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "(I)Lsp;")
    public final class474 method1403(int arg0) {
        int var2 = -86 / ((-34 - arg0) / 51);
        ++field3279;
        if (!this.field3384) {
            this.field3342.method2892(this.field3340, this.field3337);
            this.field3384 = true;
        }
        return this.field3342;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(BZ)Lrv;")
    public abstract class440 method319(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public void method310(int arg0) {
        ++field3267;
        if (this.field3377 != null) {
            this.field3377.method2847(5);
        }
        this.field3380 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "()Lih;")
    public final class744 method1404() {
        ++field3316;
        return this.field3445;
    }

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V")
    public final void method1405(int arg0) {
        ++field3220;
        Hashtable var2 = new Hashtable();
        if (this.field3201 != null && !this.field3201.isEmpty()) {
            Enumeration var3 = this.field3201.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method337(var4, true));
            }
        }
        this.field3201 = var2;
        this.method1508(-7985);
        this.method1397(-124);
        int var5 = -90 % ((-58 - arg0) / 55);
        this.method1505((byte) 75);
        this.field3382.method2480(this, false);
    }

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)V")
    private final void method1406(int arg0) {
        this.method307(arg0);
        ++field3294;
        this.method339(0);
        this.method279((byte) -3);
        this.method291((byte) 49);
        this.method292(-120);
        this.method328((byte) 30);
        this.method297((byte) 85);
        this.method335(18075);
        this.method270(-119);
        this.method321(9840);
        this.method276(1457265324);
        this.method286(3);
        this.method327((byte) 127);
        this.method341(-27246);
        for (int var2 = this.field3416 + -1; ~var2 <= -1; --var2) {
            this.method1431(~arg0, var2);
            this.method267(true);
            this.method301((byte) 7);
            this.method1459(0);
        }
        this.method333(true);
        this.method336(9);
        this.method320(0);
        this.method287(18169);
        this.method274((byte) 101);
    }

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "()[I")
    public final int[] method1407() {
        ++field3336;
        return new int[] { this.field3387, this.field3402, this.field3370, this.field3411 };
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILip;)V")
    public final void method1408(int arg0, int arg1, class306 arg2) {
        ++field3181;
        this.method324(arg0, false, -9608, arg2, false);
        if (arg1 != 0) {
            this.method1444((class744) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "(I)V")
    public abstract void method295(int arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
    public final void method1409(boolean arg0, int arg1) {
        if (arg1 != -10521) {
            this.method1441();
        }
        if (this.field3390 != arg0) {
            this.field3390 = arg0;
            this.method321(9840);
        }
        ++field3276;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)Lsp;")
    public final class474 method1410(byte arg0) {
        ++field3284;
        return arg0 > -109 ? null : this.field3347[this.field3350];
    }

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)V")
    public abstract void method339(int arg0);

    @OriginalMember(owner = "client!rl", name = "ra", descriptor = "(IIII)V")
    public final void method1411(int arg0, int arg1, int arg2, int arg3) {
        this.field3437 = arg1;
        this.field3442 = arg3;
        this.field3371 = arg0;
        ++field3283;
        this.field3374 = true;
        this.field3364 = arg2;
    }

    @OriginalMember(owner = "client!rl", name = "aa", descriptor = "(IIIIII)V")
    public final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1386(-125);
        ++field3320;
        this.method1414(arg4, (byte) -100);
        this.method1408(0, 0, class520.field7247);
        this.method1528(class520.field7247, false, 0);
        this.method1422(11665, arg5);
        this.field3337.method2886(1.0F, (float) arg3, (float) arg2, (byte) -65);
        this.field3337.method882(arg0, arg1, 0);
        this.method1443(0);
        this.method266((byte) 89, false);
        this.method1440((byte) 76);
        this.method266((byte) 115, true);
        this.method1528(class15.field140, false, 0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lik;)V")
    public final void method1413(class100 arg0) {
        ++field3165;
        this.field3382.method2484(arg0, -1, (byte) 124, this);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
    public final void method1414(int arg0, byte arg1) {
        if (this.field3430 != arg0) {
            this.field3430 = arg0;
            this.method333(true);
        }
        if (arg1 != -100) {
            this.field3390 = false;
        }
        ++field3269;
    }

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "(IIII)V")
    public final void method1415(int arg0, int arg1, int arg2, int arg3) {
        ++field3287;
        boolean var5 = false;
        if (~arg0 < ~this.field3414) {
            var5 = true;
            this.field3414 = arg0;
        }
        if (arg2 < this.field3363) {
            var5 = true;
            this.field3363 = arg2;
        }
        if (~arg1 < ~this.field3422) {
            this.field3422 = arg1;
            var5 = true;
        }
        if (this.field3415 > arg3) {
            var5 = true;
            this.field3415 = arg3;
        }
        if (var5) {
            if (!this.field3466) {
                this.field3466 = true;
                this.method303(-1);
            }
            this.method295(123);
            this.method1448(0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Liv;IZZ[BI)Ldg;")
    public final class19 method1416(class25 arg0, int arg1, boolean arg2, boolean arg3, byte[] arg4, int arg5) {
        if (!arg3) {
            this.field3431 = 106;
        }
        ++field3288;
        return this.method322(arg5, arg4, 0, 0, arg0, arg1, (byte) 127, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZIII)V")
    private final void method1417(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg1 & this.method1419();
        ++field3254;
        if (arg0 == -30318) {
            if (!var7 && (arg5 == 4 || ~arg5 == -9 || arg5 == 9)) {
                arg5 = 2;
                arg3 = ~arg5 == -5 ? 1 & arg4 : 1;
                arg4 = 0;
            }
            if (~arg5 != -1 && arg2) {
                arg5 |= Integer.MIN_VALUE;
            }
            if (this.field3410 == arg5) {
                if (this.field3410 != 0) {
                    this.field3441[Integer.MAX_VALUE & this.field3410].method394((byte) 47, arg2);
                    if (~this.field3348 != ~arg4 || ~this.field3356 != ~arg3) {
                        this.field3441[Integer.MAX_VALUE & this.field3410].method393(arg3, arg4, 120);
                        this.field3356 = arg3;
                        this.field3348 = arg4;
                    }
                    return;
                }
            } else {
                if (this.field3410 != 0) {
                    this.field3441[this.field3410 & Integer.MAX_VALUE].method389(false);
                }
                if (arg5 == 0) {
                    this.field3373 = null;
                } else {
                    this.field3373 = this.field3441[Integer.MAX_VALUE & arg5];
                    this.field3373.method399(arg2, (byte) 80);
                    this.field3373.method394((byte) 119, arg2);
                    this.field3373.method393(arg3, arg4, 98);
                }
                this.field3348 = arg4;
                this.field3410 = arg5;
                this.field3356 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "(I)V")
    private final void method1418(int arg0) {
        if (arg0 != 14) {
            this.field3451 = null;
        }
        ++field3280;
        if (this.field3373 != null) {
            this.field3373.method395(false);
        }
        this.method276(arg0 ^ 1457265314);
    }

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "()Z")
    public final boolean method1419() {
        ++field3239;
        return this.field3441[3].method396(false);
    }

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)V")
    private final void method1420(int arg0) {
        this.field3395 = false;
        ++field3172;
        this.method1394(-5449);
        if (class331.field4702 == this.field3398) {
            this.method1464((byte) 111);
        }
        int var2 = -19 % ((61 - arg0) / 56);
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "(I)V")
    public abstract void method280(int arg0);

    @OriginalMember(owner = "client!rl", name = "DA", descriptor = "(IIII)V")
    public final void method1421(int arg0, int arg1, int arg2, int arg3) {
        this.field3402 = arg1;
        this.field3370 = arg2;
        ++field3296;
        this.field3411 = arg3;
        this.field3387 = arg0;
        this.method1515((byte) 89);
        this.method1420(-108);
        this.method1400(-104);
        this.method1448(0);
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(II)V")
    public final void method1422(int arg0, int arg1) {
        if (~this.field3362 != ~arg1) {
            boolean var3;
            class445 var4;
            boolean var5;
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 128) {
                        var3 = false;
                        var4 = class321.field4456;
                        var5 = false;
                    } else {
                        var3 = true;
                        var4 = class227.field3038;
                        var5 = true;
                    }
                } else {
                    var3 = false;
                    var4 = class57.field805;
                    var5 = true;
                }
            } else {
                var5 = true;
                var3 = true;
                var4 = class596.field8092;
            }
            if (!var3 == this.field3343) {
                this.field3343 = var3;
                this.method341(-27246);
            }
            if (!var5 != !this.field3419) {
                this.field3419 = var5;
                this.method286(arg0 + -11662);
            }
            if (this.field3432 != var4) {
                this.field3432 = var4;
                this.method327((byte) 127);
            }
            this.field3362 = arg1;
            this.field3344 &= -29;
        }
        ++field3307;
        if (arg0 != 11665) {
            this.field3376 = -0.056357596F;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3253;
    }

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "(III[I)V")
    public final void method1424(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3270;
        float var5 = this.field3338.method2885((float) arg2, (float) arg0, (float) arg1, (byte) 93);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3402;
            var7 = this.field3387;
        } else {
            var7 = (int) ((float) this.field3370 * this.field3338.method2881((float) arg0, 1, (float) arg1, (float) arg2) / var5);
            var6 = (int) ((float) this.field3411 * this.field3338.method2877((float) arg1, (float) arg0, -78, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field3403);
        arg3[1] = (int) ((float) var6 - this.field3408);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "(I)V")
    public abstract void method320(int arg0);

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "(I)V")
    public final void method1425(int arg0) {
        ++field3261;
        this.field3337.method889();
        this.field3335 = true;
        if (arg0 != -2) {
            this.field3410 = -83;
        }
        this.method1537(true);
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "()I")
    public final int method1426() {
        ++field3300;
        return this.field3353;
    }

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "(IIIII)V")
    public final void method1427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1434(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field3251;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Ljava/lang/Object;")
    public abstract Object method337(Canvas arg0, boolean arg1);

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "(I)V")
    public abstract void method303(int arg0);

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(B)Lsp;")
    public final class474 method1428(byte arg0) {
        ++field3222;
        return arg0 <= 54 ? null : this.field3337;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(Z)V")
    public static void method1429(boolean arg0) {
        field3147 = null;
        if (arg0) {
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "()Z")
    public final boolean method1430() {
        ++field3317;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(II)V")
    public final void method1431(int arg0, int arg1) {
        if (arg0 == 0) {
            if (this.field3350 != arg1) {
                this.field3350 = arg1;
                this.method271(arg0 ^ 1);
            }
            ++field3242;
        }
    }

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "(I)V")
    private final void method1432(int arg0) {
        if (arg0 != -76) {
            this.field3417 = -96;
        }
        ++field3223;
        this.method298(-79);
        if (this.field3373 != null) {
            this.field3373.method398(arg0 + 10776);
        }
    }

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "(I)Lsp;")
    public final class474 method1433(int arg0) {
        if (arg0 != 2784) {
            this.field3436 = false;
        }
        ++field3176;
        return this.field3341;
    }

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(IIIIII)V")
    public final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3275;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method1541((float) arg2 + var9, 0.0F, (float) arg3 + var8, (float) arg0, (byte) 118, 0.0F, (float) arg1)) {
            this.method1386(1);
            this.method1414(arg4, (byte) -100);
            this.method1408(0, 0, class520.field7247);
            this.method1528(class520.field7247, false, 0);
            this.method1422(11665, arg5);
            this.method1425(-2);
            this.method266((byte) -79, false);
            this.method1465(0);
            this.method266((byte) -13, true);
            this.method1528(class15.field140, false, 0);
            this.method1408(0, 0, class15.field140);
        }
    }

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "(I)V")
    public abstract void method292(int arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
    public final void method1435(byte arg0, int arg1) {
        if (arg1 == 688583916) {
            ++field3204;
            this.method1414(arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "(I)Lpda;")
    public final class492 method1436(int arg0) {
        if (arg0 != 0) {
            this.method1466(-53);
        }
        ++field3180;
        return this.field3375 == null ? null : this.field3375.method638(false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZLip;)V")
    public abstract void method330(int arg0, int arg1, boolean arg2, class306 arg3);

    @OriginalMember(owner = "client!rl", name = "la", descriptor = "()V")
    public final void method1437() {
        this.field3422 = 0;
        this.field3363 = this.field3195;
        this.field3415 = this.field3293;
        this.field3414 = 0;
        ++field3240;
        if (this.field3466) {
            this.field3466 = false;
            this.method303(-1);
        }
        this.method1448(0);
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(B)V")
    public void method291(byte arg0) {
        ++field3286;
        this.field3378 = this.field3440;
        if (arg0 == 49) {
            this.field3440 = 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V")
    public abstract void method274(byte arg0);

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "(I)[F")
    public final float[] method1438(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3151;
            return this.field3389;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method305(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!rl", name = "za", descriptor = "(IIIII)V")
    public final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3155;
        this.method1386(-126);
        this.method1414(arg3, (byte) -100);
        this.method1408(0, 0, class520.field7247);
        this.method1528(class520.field7247, false, 0);
        this.method1422(11665, arg4);
        this.field3337.method2886(1.0F, (float) arg2, (float) arg2, (byte) -65);
        this.field3337.method882(arg0, arg1, 0);
        this.method1443(0);
        this.method266((byte) 108, false);
        this.method314(115, 0, this.field3447);
        this.method265(1024, this.field3458);
        this.method347(115, class151.field2082, 256, 0);
        this.method266((byte) -42, true);
        this.method1528(class15.field140, false, 0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)V")
    public final void method1440(byte arg0) {
        int var2 = -103 / ((-73 - arg0) / 34);
        this.method1502((byte) -105, 2, class151.field2082);
        ++field3177;
    }

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "()Z")
    public final boolean method1441() {
        ++field3233;
        return this.field3372;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3187;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) (-arg1) + (float) arg3;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method1386(2);
        this.method1414(arg4, (byte) -100);
        this.method1408(0, 0, class520.field7247);
        this.method1528(class520.field7247, false, 0);
        this.method1422(11665, arg6);
        this.field3337.method2886(1.0F, (float) arg5, var11, (byte) -65);
        this.field3337.method882(0, -arg5 / 2, 0);
        this.field3337.method898((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field3337.method882(arg0, arg1, 0);
        this.method1443(0);
        this.method266((byte) 114, false);
        this.method1440((byte) 107);
        this.method266((byte) -105, true);
        this.method1528(class15.field140, false, 0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "(I)V")
    public abstract void method336(int arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILcc;)V")
    public abstract void method265(int arg0, class579 arg1);

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "(I)V")
    public final void method1443(int arg0) {
        this.field3335 = false;
        ++field3323;
        if (arg0 == 0) {
            this.method1537(true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lih;)V")
    public final void method1444(class744 arg0) {
        ++field3174;
        this.field3338 = (class474) arg0;
        this.field3340.method900(this.field3338);
        this.field3340.method2883((byte) 76);
        this.field3341.method2880(this.field3340, 2);
        this.field3339.method2880(this.field3338, 2);
        if (this.field3398.method4026(126)) {
            this.method1455(5);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method344(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public final void method1445(int arg0) {
        ++field3301;
    }

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "()Z")
    public final boolean method1446() {
        ++field3211;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "()Z")
    public final boolean method1447() {
        ++field3164;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsga;I)V")
    public abstract void method338(class651 arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "(I)V")
    private final void method1448(int arg0) {
        this.field3403 = (float) (-this.field3387 + this.field3414);
        this.field3366 = (float) (-this.field3387 + this.field3363);
        ++field3243;
        if (arg0 != 0) {
            this.method1396((byte) 125);
        }
        this.field3379 = (float) (this.field3415 - this.field3402);
        this.field3408 = (float) (-this.field3402 + this.field3422);
    }

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3264;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLsp;)V")
    public final void method1450(byte arg0, class474 arg1) {
        ++field3277;
        this.field3337.method900(arg1);
        this.field3335 = false;
        if (arg0 == 96) {
            this.method1537(true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1451(Canvas arg0) {
        this.field3260 = null;
        ++field3259;
        this.field3314 = null;
        if (arg0 != null && this.field3160 != arg0) {
            if (this.field3201.containsKey(arg0)) {
                this.field3314 = this.field3201.get(arg0);
                this.field3260 = arg0;
            }
        } else {
            this.field3260 = this.field3160;
            this.field3314 = this.field3149;
        }
        if (this.field3260 != null && this.field3314 != null) {
            this.method305(66, this.field3260, this.field3314);
            this.method1512(111);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(II)Lkl;")
    public class712 method309(int arg0, int arg1) {
        ++field3235;
        if (arg0 != 13492) {
            this.method343(10, -51, -90, false, (int[]) null, 0, -94);
        }
        if (~arg1 != -7) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return arg1 == 7 ? new class434(this) : new class417(this);
                } else {
                    return new class68(this, this.field3185);
                }
            } else {
                return new class587(this);
            }
        } else {
            return new class499(this);
        }
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(B)V")
    private final void method1452(byte arg0) {
        this.field3393[10] = this.field3396;
        this.field3393[14] = this.field3397;
        ++field3332;
        this.field3369 = (this.field3393[14] - (float) this.field3352) / this.field3393[10];
        if (arg0 <= 36) {
            this.field3343 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZI)V")
    public final void method1453(boolean arg0, int arg1) {
        ++field3250;
        if (!arg0 != !this.field3349) {
            this.field3349 = arg0;
            this.method270(112);
            this.field3344 &= -32;
        }
        int var3 = -112 % ((-34 - arg1) / 50);
    }

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "([I)V")
    public final void method1454(int[] arg0) {
        arg0[0] = this.field3414;
        arg0[2] = this.field3363;
        arg0[3] = this.field3415;
        arg0[1] = this.field3422;
        ++field3183;
    }

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "(I)V")
    private final void method1455(int arg0) {
        this.field3384 = false;
        ++field3153;
        if (arg0 != 5) {
            this.field3351 = 2;
        }
        if (this.field3373 != null) {
            this.field3373.method397(-1);
        }
        this.method274((byte) 108);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[BILiv;)Lrj;")
    public abstract class361 method300(int arg0, int arg1, int arg2, byte[] arg3, int arg4, class25 arg5);

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "(I)Lsp;")
    public final class474 method1456(int arg0) {
        ++field3273;
        if (arg0 != 15903) {
            this.field3409 = true;
        }
        return this.field3340;
    }

    @OriginalMember(owner = "client!rl", name = "xa", descriptor = "(F)V")
    public final void method1457(float arg0) {
        if (this.field3354 != arg0) {
            this.field3354 = arg0;
            this.field3182.setAmbient(arg0);
            this.method307(-1);
            this.method328((byte) 74);
        }
        ++field3207;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILhba;)V")
    public final void method1458(int arg0, class190 arg1) {
        ++field3231;
        if (this.field3367[this.field3350] != arg1) {
            this.field3367[this.field3350] = arg1;
            if (arg1 != null) {
                arg1.method1118(117);
            } else {
                this.method280(16);
            }
            this.field3344 &= -2;
        }
        if (arg0 != 399403340) {
            this.field3400 = 91;
        }
    }

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "(I)V")
    public final void method1459(int arg0) {
        if (this.field3392[this.field3350] != class149.field2065) {
            this.field3392[this.field3350] = class149.field2065;
            this.field3347[this.field3350].method889();
            this.method1432(-76);
        }
        if (arg0 != 0) {
            this.method1399(12);
        }
        ++field3192;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lkq;I)V")
    public final void method1460(class345 arg0, int arg1) {
        ++field3289;
        this.field3392[this.field3350] = arg0;
        this.method1432(-76);
        if (arg1 > -123) {
            this.method1546((byte) -112);
        }
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(B)V")
    public abstract void method297(byte arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[I[I)Laa;")
    public final class573 method1461(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3310;
        return class310.method2037(arg0, (byte) 15, this, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3299;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method1386(41);
        this.method1414(arg4, (byte) -100);
        this.method1408(0, 0, class520.field7247);
        this.method1528(class520.field7247, false, 0);
        this.method1422(11665, arg5);
        this.method1425(-2);
        this.method266((byte) 116, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 > ~var14) {
            var17 = (float) (arg6 + arg7 + -var14) * var12;
            var18 = (float) (arg6 + arg7 - var14) * var11;
        } else {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 <= ~arg2) {
                if (var21 < (float) arg2) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (~arg1 <= ~arg3) {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method1541(var19 + var21, 0.0F, var20 + var22, var21, (byte) 120, 0.0F, var22)) {
                return;
            }
            var22 += var20 + var24;
            this.method1465(0);
            var21 += var19 + var23;
            var19 = var15;
            var20 = var16;
        }
        this.method266((byte) -93, true);
        this.method1528(class15.field140, false, 0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lvo;IIII)Lka;")
    public final class284 method1463(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3258;
        return new class328(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lpj;I)Lcc;")
    public abstract class579 method331(class40[] arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "(B)V")
    private final void method1464(byte arg0) {
        this.method320(0);
        int var2 = 102 % ((66 - arg0) / 40);
        ++field3210;
        if (this.field3373 != null) {
            this.field3373.method392((byte) -109);
        }
    }

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "(I)V")
    public abstract void method341(int arg0);

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "(I)V")
    private final void method1465(int arg0) {
        ++field3229;
        this.method314(80, 0, this.field3451);
        this.method265(1024, this.field3452);
        this.method347(-127, class348.field4949, 1, arg0);
    }

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "(I)Lsp;")
    public final class474 method1466(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field3225;
            return this.field3347[this.field3350];
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(ZI)V")
    public final void method1467(boolean arg0, int arg1) {
        ++field3162;
        if (this.field3425 != arg0) {
            this.field3425 = arg0;
            this.method321(9840);
            this.field3344 &= -32;
        }
        if (arg1 != -32) {
            this.method1500(false, -88, true);
        }
    }

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "(B)I")
    public final int method1468(byte arg0) {
        if (arg0 != -31) {
            this.field3396 = 1.305355F;
        }
        ++field3241;
        return this.field3371;
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "()Z")
    public final boolean method1469() {
        ++field3252;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8) {
        ++field3152;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIBLiv;[FI)Ldg;")
    public abstract class19 method345(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class25 arg5, float[] arg6, int arg7);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)Lfd;")
    public final class298 method1471(int arg0, int arg1, boolean arg2) {
        ++field3178;
        return new class728(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()Z")
    public final boolean method1472() {
        ++field3238;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)Ljs;")
    public abstract class174 method294(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1473(int arg0, Buffer arg1) {
        this.field3360.method2612(arg1);
        if (arg0 != -1969469652) {
            this.method1452((byte) 45);
        }
        ++field3247;
        return this.field3360;
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "(B)V")
    public abstract void method327(byte arg0);

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "(III)V")
    public final void method1474(int arg0, int arg1, int arg2) {
        ++field3324;
        if (this.field3405 != arg0 || this.field3406 != arg1 || this.field3357 != arg2) {
            this.field3405 = arg0;
            this.field3406 = arg1;
            this.field3357 = arg2;
            this.method1418(14);
            this.method321(9840);
        }
    }

    @OriginalMember(owner = "client!rl", name = "HA", descriptor = "(IIII[I)V")
    public final void method1475(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3257;
        float var6 = this.field3338.method2885((float) arg2, (float) arg0, (float) arg1, (byte) 60);
        if (!((float) this.field3353 > var6) && !((float) this.field3352 < var6)) {
            int var7 = (int) ((float) this.field3370 * this.field3338.method2881((float) arg0, 1, (float) arg1, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field3411 * this.field3338.method2877((float) arg1, (float) arg0, -95, (float) arg2) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 - this.field3408);
            arg4[0] = (int) ((float) var7 + -this.field3403);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIF)Ltj;")
    public final class687 method1476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3217;
        return new class254(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZII)V")
    public final void method1477(boolean arg0, boolean arg1, int arg2, int arg3) {
        ++field3303;
        if (~this.field3361 != ~arg3 || this.field3424 == !this.field3374) {
            class19 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field3374 ? 3 : 0;
            if (arg3 < 0) {
                this.method1459(0);
            } else {
                var5 = this.field3377.method2848(arg3, 0);
                class239 var10 = super.field7623.method521(arg3, 115);
                if (~var10.field3579 == -1 && ~var10.field3573 == -1) {
                    this.method1459(0);
                } else {
                    int var11 = !var10.field3556 ? 128 : 64;
                    int var12 = var11 * 50;
                    class474 var13 = this.method1410((byte) -112);
                    var13.method2873(1, (float) (this.field3380 % var12 * var10.field3573) / (float) var12, (float) (this.field3380 % var12 * var10.field3579) / (float) var12, 0.0F);
                    this.method1460(class393.field5647, -128);
                }
                if (!this.field3374) {
                    var8 = var10.field3565;
                    var7 = var10.field3567;
                    var9 = var10.field3561;
                }
                var6 = var10.field3564;
            }
            this.method1417(-30318, arg1, arg0, var8, var7, var9);
            if (this.field3373 == null) {
                this.method1458(399403340, var5);
                this.method1503(var6, (byte) 101);
            } else {
                this.field3373.method391(var6, 0, var5);
            }
            this.field3361 = arg3;
            this.field3424 = this.field3374;
        }
        this.field3344 &= -8;
        if (arg2 > -59) {
            this.field3331 = -61;
        }
    }

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "(I)V")
    public final void method1478(int arg0) {
        if (arg0 == -1610404404) {
            ++field3278;
            if (~this.field3344 != -5) {
                this.method1493(-25);
                this.method1467(false, -32);
                this.method1530((byte) -124, false);
                this.method1491(-32, false);
                this.method1453(false, 37);
                this.method1477(false, false, -83, -2);
                this.method1422(11665, 1);
                this.method1503(0, (byte) 98);
                this.field3344 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lik;I)V")
    public final void method1479(class100 arg0, int arg1) {
        this.field3382.method2484(arg0, arg1, (byte) 126, this);
        ++field3208;
    }

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "(I)V")
    private final void method1480(int arg0) {
        int var2 = 10 / ((arg0 - 45) / 61);
        ++field3173;
        if (class331.field4702 != this.field3398) {
            class718 var3 = this.field3398;
            this.field3398 = class331.field4702;
            if (!var3.method4026(126)) {
                this.method1455(5);
            }
            this.method1394(-5449);
            this.field3421 = this.field3393;
            this.method1464((byte) 13);
            this.field3344 &= -8;
        }
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "()I")
    public final int method1481() {
        ++field3156;
        return this.field3431 + -2;
    }

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "()I")
    public final int method1482() {
        ++field3305;
        return this.field3467;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([I)V")
    public final void method1483(int[] arg0) {
        arg0[0] = this.field3195;
        arg0[1] = this.field3293;
        ++field3285;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I")
    public final int method1484(int arg0, int arg1) {
        ++field3213;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
    public final void method1485(int arg0, boolean arg1) {
        ++field3154;
        if (!this.field3423 == arg1) {
            this.field3423 = arg1;
            this.method297((byte) 119);
        }
        if (arg0 != -1) {
            this.method1403(-42);
        }
    }

    @OriginalMember(owner = "client!rl", name = "da", descriptor = "(III[I)V")
    public final void method1486(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3290;
        float var5 = this.field3338.method2885((float) arg2, (float) arg0, (float) arg1, (byte) 74);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3387;
            var7 = this.field3402;
        } else {
            var6 = (int) ((float) this.field3370 * this.field3338.method2881((float) arg0, 1, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field3411 * this.field3338.method2877((float) arg1, (float) arg0, -75, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field3403);
        arg3[1] = (int) ((float) var7 + -this.field3408);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "(IIIII)V")
    public final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3145;
        this.method1434(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "(IIIIIII)I")
    public final int method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3312;
        int var8 = 0;
        float var9 = (float) arg2 * this.field3338.field6570 + (float) arg0 * this.field3338.field6592 + (float) arg1 * this.field3338.field6599 + this.field3338.field6589;
        float var10 = (float) arg5 * this.field3338.field6570 + (float) arg3 * this.field3338.field6592 + (float) arg4 * this.field3338.field6599 + this.field3338.field6589;
        if (var9 < (float) this.field3353 && (float) this.field3353 > var10) {
            var8 |= 16;
        } else if ((float) this.field3352 < var9 && (float) this.field3352 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3338.field6597 + (float) arg0 * this.field3338.field6594 + (float) arg1 * this.field3338.field6581 + this.field3338.field6609) * (float) this.field3370 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3338.field6597 + (float) arg3 * this.field3338.field6594 + (float) arg4 * this.field3338.field6581 + this.field3338.field6609) * (float) this.field3370 / (float) arg6);
        if (this.field3403 > (float) var11 && this.field3403 > (float) var12) {
            var8 |= 1;
        } else if (this.field3366 < (float) var11 && this.field3366 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3338.field6611 + (float) arg0 * this.field3338.field6576 + (float) arg1 * this.field3338.field6567 + this.field3338.field6578) * (float) this.field3411 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3338.field6611 + (float) arg3 * this.field3338.field6576 + (float) arg4 * this.field3338.field6567 + this.field3338.field6578) * (float) this.field3411 / (float) arg6);
        if ((float) var13 < this.field3408 && this.field3408 > (float) var14) {
            var8 |= 4;
        } else if (this.field3379 < (float) var13 && this.field3379 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method285(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjs;Lwi;III)V")
    public abstract void method342(int arg0, int arg1, class174 arg2, class202 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Liv;Ljt;I)Z")
    public abstract boolean method288(class25 arg0, class38 arg1, int arg2);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILrv;)V")
    public abstract void method314(int arg0, int arg1, class440 arg2);

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "(B)V")
    private final void method1489(byte arg0) {
        int var2 = -50 % ((23 - arg0) / 53);
        this.field3376 = (float) this.field3352;
        ++field3246;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()Z")
    public final boolean method1490() {
        ++field3325;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IZ)V")
    public final void method1491(int arg0, boolean arg1) {
        if (!this.field3401 == arg1) {
            this.field3401 = arg1;
            this.method335(18075);
            this.field3344 &= -32;
        }
        ++field3234;
        if (arg0 != -32) {
            field3271 = 11;
        }
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
    public final void method1492(int arg0) {
        ++field3322;
    }

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "(I)V")
    private final void method1493(int arg0) {
        ++field3311;
        if (arg0 != -25) {
            this.method1409(false, 68);
        }
        if (class610.field8213 != this.field3398) {
            class718 var2 = this.field3398;
            this.field3398 = class610.field8213;
            if (var2.method4026(126)) {
                this.method1455(5);
            }
            this.method1507(6);
            this.field3421 = this.field3434;
            this.method1464((byte) 106);
            this.field3344 &= -25;
        }
    }

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "(B)I")
    public final int method1494(byte arg0) {
        if (arg0 != -123) {
            this.method1430();
        }
        ++field3321;
        return this.field3350;
    }

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "()Lih;")
    public final class744 method1495() {
        ++field3212;
        return new class474();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Loia;Z)Lfd;")
    public final class298 method1496(class52 arg0, boolean arg1) {
        ++field3272;
        class298 var10;
        if (arg0.field767 != 0 && arg0.field766 != 0) {
            int[] var3 = new int[arg0.field767 * arg0.field766];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field759 == null) {
                for (int var6 = 0; ~var6 > ~arg0.field766; ++var6) {
                    for (int var7 = 0; var7 < arg0.field767; ++var7) {
                        int var8 = arg0.field760[255 & arg0.field763[var4++]];
                        var3[var5++] = var8 != 0 ? class678.method3817(-16777216, var8) : 0;
                    }
                }
            } else {
                for (int var9 = 0; arg0.field766 > var9; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field767; ++var11) {
                        var3[var5++] = class678.method3817(arg0.field760[class665.method3759(arg0.field763[var4], 255)], arg0.field759[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method3244(arg0.field766, var3, (byte) -90, arg0.field767, 0, arg0.field767);
        } else {
            var10 = this.method3244(1, new int[1], (byte) -73, 1, 0, 1);
        }
        var10.method1953(arg0.field765, arg0.field761, arg0.field762, arg0.field764);
        return var10;
    }

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "(I)V")
    public abstract void method271(int arg0);

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(II)V")
    public static final void method1497(int arg0, int arg1) {
        if (~arg0 > -1 || ~arg0 < -3) {
            arg0 = 0;
        }
        ++field3184;
        class709.field9896 = arg0;
        class139.field1983 = new class689[class253.field3708[class709.field9896] + 1];
        class173.field2400 = arg1;
        class409.field5846 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method1498(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3197;
        boolean var7 = this.field3351 != arg0;
        if (var7 || this.field3426 != arg1 || this.field3418 != arg2) {
            this.field3351 = arg0;
            this.field3426 = arg1;
            this.field3418 = arg2;
            if (var7) {
                this.field3413 = (float) (65280 & this.field3351) / 65280.0F;
                this.field3420 = (float) (this.field3351 & 16711680) / 1.671168E7F;
                this.field3365 = (float) (this.field3351 & 255) / 255.0F;
                this.method307(-1);
            }
            this.field3182.setSunColour(this.field3420, this.field3413, this.field3365, arg1, arg2);
            this.method339(0);
        }
        if (this.field3443[0] != arg3 || this.field3443[1] != arg4 || this.field3443[2] != arg5) {
            this.field3443[0] = arg3;
            this.field3443[2] = arg5;
            this.field3443[1] = arg4;
            this.field3391[1] = -arg4;
            this.field3391[0] = -arg3;
            this.field3391[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3355[1] = arg4 * var8;
            this.field3355[2] = arg5 * var8;
            this.field3355[0] = arg3 * var8;
            this.field3381[1] = -this.field3355[1];
            this.field3381[2] = -this.field3355[2];
            this.field3381[0] = -this.field3355[0];
            this.field3182.setSunDirection(this.field3355[0], this.field3355[1], this.field3355[2]);
            this.method292(-111);
            this.field3400 = (int) (arg3 * 256.0F / arg4);
            this.field3388 = (int) (arg5 * 256.0F / arg4);
        }
        this.method328((byte) 112);
    }

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "(B)V")
    public final void method1499(byte arg0) {
        if (arg0 != 92) {
            this.method1514(-58, 20, -62, -78, true);
        }
        ++field3221;
        if (this.field3344 != 8) {
            this.method1480(-125);
            this.method1467(true, arg0 ^ -68);
            this.method1491(-32, true);
            this.method1453(true, -115);
            this.method1422(11665, 1);
            this.field3344 = 8;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB[[IZ)Lpda;")
    public abstract class492 method329(int arg0, byte arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1500(boolean arg0, int arg1, boolean arg2) {
        ++field3150;
        return arg2 ? null : this.field3245.method2623(arg1, arg0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljt;Liv;B)Z")
    public abstract boolean method323(class38 arg0, class25 arg1, byte arg2);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BIILiv;IBZ)Ldg;")
    public abstract class19 method322(int arg0, byte[] arg1, int arg2, int arg3, class25 arg4, int arg5, byte arg6, boolean arg7);

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "(B)V")
    public abstract void method328(byte arg0);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILjt;Liv;I)Ldg;")
    public abstract class19 method304(int arg0, int arg1, class38 arg2, class25 arg3, int arg4);

    @OriginalMember(owner = "client!rl", name = "EA", descriptor = "(IIII)V")
    public final void method1501(int arg0, int arg1, int arg2, int arg3) {
        ++field3308;
        if (!this.field3374) {
            throw new RuntimeException("");
        } else {
            this.field3371 = arg0;
            this.field3437 = arg1;
            this.field3364 = arg2;
            this.field3442 = arg3;
            if (this.field3424) {
                this.field3441[3].method604(true);
                this.field3441[3].method395(false);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILwi;)V")
    private final void method1502(byte arg0, int arg1, class202 arg2) {
        this.method314(48, 0, this.field3461);
        ++field3219;
        this.method265(1024, this.field3464);
        this.method347(41, arg2, arg1, 0);
        if (arg0 > -102) {
            this.method1387();
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IB)V")
    public final void method1503(int arg0, byte arg1) {
        ++field3193;
        if (~arg0 != -2) {
            if (arg0 == 0) {
                this.method1388(class179.field2467, (byte) 52, class179.field2467);
            } else if (~arg0 != -3) {
                if (arg0 == 3) {
                    this.method1388(class179.field2467, (byte) 52, class161.field2237);
                } else if (~arg0 == -5) {
                    this.method1388(class339.field4803, (byte) 52, class339.field4803);
                }
            } else {
                this.method1388(class87.field1239, (byte) 52, class370.field5228);
            }
        } else {
            this.method1388(class87.field1239, (byte) 52, class87.field1239);
        }
        if (arg1 < 95) {
            this.field3350 = -64;
        }
    }

    @OriginalMember(owner = "client!rl", name = "XA", descriptor = "()I")
    public final int method1504() {
        ++field3188;
        return this.field3352;
    }

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "(B)V")
    private final void method1505(byte arg0) {
        this.field3447 = this.method319((byte) 82, false);
        ++field3205;
        this.field3447.method2140((byte) 117, 12, 3096);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field3447.method2145(true, 27425);
            if (var3 != null) {
                Stream var4 = this.method1473(-1969469652, var3);
                var4.method2608(0.0F);
                var4.method2608(0.0F);
                var4.method2608(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method2614()) {
                        var4.method2608(var9);
                        var4.method2608(var8);
                        var4.method2608(0.0F);
                    } else {
                        var4.method2617(var9);
                        var4.method2617(var8);
                        var4.method2617(0.0F);
                    }
                }
                var4.method2613();
                if (this.field3447.method2143(-104)) {
                    break;
                }
            }
        }
        if (arg0 <= 50) {
            this.method1481();
        }
        this.field3458 = this.method331(new class40[] { new class40(class385.field5515) }, 4982);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(IZ)V")
    public final void method1506(int arg0, boolean arg1) {
        if (!this.field3368 != !arg1) {
            this.field3368 = arg1;
            this.method279((byte) -3);
        }
        if (arg0 != 16) {
            this.method1439(-106, 71, 64, -111, 0);
        }
        ++field3200;
    }

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "(I)V")
    private final void method1507(int arg0) {
        if (!this.field3404) {
            float[] var2 = this.field3434;
            this.field3404 = true;
            if (~this.field3195 != -1 && ~this.field3293 != -1) {
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = -2.0F / (float) this.field3293;
                var2[12] = -1.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[10] = 0.5F;
                var2[0] = 2.0F / (float) this.field3195;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 1.0F;
            } else {
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
            }
        }
        ++field3171;
        if (arg0 != 6) {
            this.method1486(-26, -127, -33, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "(I)V")
    private final void method1508(int arg0) {
        this.field3461 = this.method319((byte) 72, false);
        ++field3295;
        this.field3461.method2140((byte) 17, 28, 140);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field3461.method2145(true, 27425);
            if (var3 != null) {
                Stream var4 = this.method1473(-1969469652, var3);
                if (!Stream.method2614()) {
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(1.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                    var4.method2617(0.0F);
                } else {
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(1.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                    var4.method2608(0.0F);
                }
                var4.method2613();
                if (this.field3461.method2143(arg0 ^ 8049)) {
                    break;
                }
            }
        }
        this.field3464 = this.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526, class385.field5526 }) }, 4982);
        if (arg0 != -7985) {
            this.method1466(102);
        }
    }

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "()I")
    public final int method1509() {
        ++field3158;
        return this.field3334 + this.field3331 + this.field3333;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1510(Canvas arg0) {
        ++field3281;
        if (this.field3160 == arg0) {
            throw new RuntimeException();
        } else if (this.field3201.containsKey(arg0)) {
            this.method285(this.field3201.get(arg0), arg0, 55);
            this.field3201.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "(I)F")
    public abstract float method313(int arg0);

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(II)V")
    public final void method1511(int arg0, int arg1) {
        ++field3199;
        if (~this.field3353 != ~arg0 || ~this.field3352 != ~arg1) {
            this.field3353 = arg0;
            this.field3352 = arg1;
            this.method1420(125);
            this.method1515((byte) 62);
            this.method1418(14);
        }
    }

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "(I)V")
    private final void method1512(int arg0) {
        if (this.field3260 == null) {
            this.field3263 = this.field3315 = 1;
        } else {
            Dimension var2 = this.field3260.getSize();
            this.field3315 = var2.height;
            this.field3263 = var2.width;
        }
        if (arg0 < 73) {
            this.method1495();
        }
        ++field3226;
        this.field3195 = this.field3263;
        this.field3293 = this.field3315;
        this.method1527(120);
        this.method1420(-103);
        this.method1515((byte) 57);
        this.method336(9);
        this.method1448(0);
        this.method1400(-113);
        this.method1437();
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "()V")
    public final void method1513() {
        ++field3190;
        if (this.field3377 != null) {
            this.field3377.method2846((byte) -112);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIZ)Lfd;")
    public final class298 method1514(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3256;
        class728 var6 = new class728(this, arg2, arg3, arg4);
        var6.method1015(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "(B)V")
    private final void method1515(byte arg0) {
        int var2 = -62 % ((arg0 - -5) / 56);
        this.field3409 = false;
        ++field3274;
        this.method1396((byte) -111);
        if (class347.field4936 == this.field3398) {
            this.method1464((byte) -10);
        }
    }

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "(I)V")
    private final void method1516(int arg0) {
        if (class347.field4936 != this.field3398) {
            class718 var2 = this.field3398;
            this.field3398 = class347.field4936;
            if (!var2.method4026(126)) {
                this.method1455(5);
            }
            this.method1396((byte) -111);
            this.field3421 = this.field3438;
            this.method1464((byte) 113);
            this.field3344 &= -8;
        }
        if (arg0 == -8) {
            ++field3186;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IF)V")
    public final void method1517(int arg0, float arg1) {
        ++field3237;
        if (this.field3385 != arg1) {
            this.field3385 = arg1;
            this.method1515((byte) 53);
        }
        if (arg0 != 0) {
            this.field3431 = -53;
        }
    }

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "(B)V")
    public final void method1518(byte arg0) {
        ++field3196;
        if (~this.field3344 != -17) {
            this.method1516(-8);
            this.method1467(true, -32);
            this.method1491(-32, true);
            this.method1453(true, -104);
            this.method1422(11665, 1);
            this.field3344 = 16;
        }
        int var2 = -73 % ((arg0 - -33) / 35);
    }

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "(I)I")
    public final int method1519(int arg0) {
        ++field3209;
        int var2 = -127 / ((arg0 - 43) / 47);
        return this.field3364;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIZIB)Ldg;")
    public final class19 method1520(int[] arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 >= -99) {
            return null;
        } else {
            ++field3265;
            return this.method343(0, 0, arg3, arg2, arg0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
    public final void method1521(int arg0) {
        ++field3166;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3191;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lza;)V")
    public final void method1523(class257 arg0) {
        this.field3245 = ((class516) arg0).field7208;
        ++field3236;
        this.field3304 = this.field3245.method2623(32768, false);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILwi;II)V")
    public abstract void method347(int arg0, class202 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIBIIIII)Z")
    public static final boolean method1524(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3244;
        if (arg0 <= 2000 && ~arg9 >= -2001 && ~arg7 >= -2001 && arg1 <= 2000 && arg5 <= 2000 && arg2 <= 2000) {
            if (~arg0 <= 1999 && arg9 >= -2000 && ~arg7 <= 1999 && arg1 >= -2000 && ~arg5 <= 1999 && ~arg2 <= 1999) {
                if (class139.field1982 == 2) {
                    int var10 = class702.field9783 * arg0 + arg1;
                    if (var10 >= 0 && class87.field1241.length > var10 && (arg6 << 8) + -38400 < class87.field1241[var10]) {
                        return false;
                    }
                    int var11 = class702.field9783 * arg9 + arg5;
                    if (var11 >= 0 && var11 < class87.field1241.length && ~((arg3 << 8) - 38400) > ~class87.field1241[var11]) {
                        return false;
                    }
                    int var12 = class702.field9783 * arg7 + arg2;
                    if (~var12 <= -1 && class87.field1241.length > var12 && (arg8 << 8) - 38400 < class87.field1241[var12]) {
                        return false;
                    }
                }
                int var13 = -arg1 + arg5;
                int var14 = -arg0 + arg9;
                int var15 = -arg1 + arg2;
                int var16 = arg7 - arg0;
                int var17 = -arg6 + arg3;
                if (arg9 > arg0 && arg7 < arg7) {
                    if (arg9 > arg7) {
                        ++arg9;
                    } else {
                        ++arg7;
                    }
                    --arg0;
                } else if (~arg7 >= ~arg9) {
                    if (~arg9 > ~arg0) {
                        ++arg0;
                    } else {
                        ++arg9;
                    }
                    --arg7;
                } else {
                    --arg9;
                    if (~arg0 >= ~arg7) {
                        ++arg7;
                    } else {
                        ++arg0;
                    }
                }
                int var18 = arg8 - arg6;
                int var19 = 0;
                if (arg0 != arg9) {
                    var19 = (-arg1 + arg5 << 12) / (-arg0 + arg9);
                }
                int var20 = 0;
                if (arg7 != arg9) {
                    var20 = (-arg5 + arg2 << 12) / (-arg9 + arg7);
                }
                int var21 = 0;
                if (~arg0 != ~arg7) {
                    var21 = (-arg2 + arg1 << 12) / (arg0 - arg7);
                }
                int var22 = var13 * var16 - var14 * var15;
                if (~var22 == -1) {
                    return false;
                } else {
                    int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
                    if (arg4 != 34) {
                        method1429(false);
                    }
                    int var24 = (var13 * var18 + -(var15 * var17) << 8) / var22;
                    if (arg0 <= arg9 && arg7 >= arg0) {
                        if (arg0 >= class466.field6481) {
                            return true;
                        } else {
                            if (class466.field6481 < arg7) {
                                arg7 = class466.field6481;
                            }
                            int var25 = (arg6 << 8) + -(arg1 * var23) + var23;
                            if (arg9 > class466.field6481) {
                                arg9 = class466.field6481;
                            }
                            if (arg7 <= arg9) {
                                int var26;
                                int var27 = var26 = arg1 << 12;
                                int var28 = arg2 << 12;
                                if (~arg0 > -1) {
                                    var25 -= arg0 * var24;
                                    var27 -= arg0 * var21;
                                    var26 -= arg0 * var19;
                                    arg0 = 0;
                                }
                                if (~arg7 > -1) {
                                    var28 -= arg7 * var20;
                                    arg7 = 0;
                                }
                                if ((~arg0 == ~arg7 || var21 >= var19) && (~arg0 != ~arg7 || var19 >= var20)) {
                                    int var32 = arg9 - arg7;
                                    int var33 = arg7 - arg0;
                                    int var34 = class702.field9783 * arg0;
                                    while (true) {
                                        --var33;
                                        if (~var33 > -1) {
                                            while (true) {
                                                --var32;
                                                if (var32 < 0) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var28 >> 12) - -1, (var26 >> 12) - 1, class87.field1241, var34, var23, var25, -17575)) {
                                                    return false;
                                                }
                                                var28 += var20;
                                                var25 += var24;
                                                var34 += class702.field9783;
                                                var26 += var19;
                                            }
                                        }
                                        if (!class402.method2516(0, (var27 >> 12) + 1, (var26 >> 12) + -1, class87.field1241, var34, var23, var25, -17575)) {
                                            return false;
                                        }
                                        var25 += var24;
                                        var27 += var21;
                                        var34 += class702.field9783;
                                        var26 += var19;
                                    }
                                } else {
                                    int var29 = arg9 - arg7;
                                    int var30 = arg7 - arg0;
                                    int var31 = class702.field9783 * arg0;
                                    while (true) {
                                        --var30;
                                        if (var30 < 0) {
                                            while (true) {
                                                --var29;
                                                if (~var29 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var26 >> 12) + 1, (var28 >> 12) + -1, class87.field1241, var31, var23, var25, -17575)) {
                                                    return false;
                                                }
                                                var31 += class702.field9783;
                                                var25 += var24;
                                                var26 += var19;
                                                var28 += var20;
                                            }
                                        }
                                        if (!class402.method2516(0, (var26 >> 12) + 1, (var27 >> 12) + -1, class87.field1241, var31, var23, var25, -17575)) {
                                            return false;
                                        }
                                        var25 += var24;
                                        var26 += var19;
                                        var27 += var21;
                                        var31 += class702.field9783;
                                    }
                                }
                            } else {
                                int var35;
                                int var36 = var35 = arg1 << 12;
                                int var37 = arg5 << 12;
                                if (arg0 < 0) {
                                    var25 -= arg0 * var24;
                                    var36 -= arg0 * var21;
                                    var35 -= arg0 * var19;
                                    arg0 = 0;
                                }
                                if (arg9 < 0) {
                                    var37 -= arg9 * var20;
                                    arg9 = 0;
                                }
                                if ((~arg0 == ~arg9 || ~var19 >= ~var21) && (arg0 != arg9 || var20 >= var21)) {
                                    int var41 = arg7 - arg9;
                                    int var42 = arg9 - arg0;
                                    int var43 = class702.field9783 * arg0;
                                    while (true) {
                                        --var42;
                                        if (var42 < 0) {
                                            while (true) {
                                                --var41;
                                                if (~var41 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var36 >> 12) + 1, (var37 >> 12) + -1, class87.field1241, var43, var23, var25, arg4 ^ -17541)) {
                                                    return false;
                                                }
                                                var37 += var20;
                                                var43 += class702.field9783;
                                                var36 += var21;
                                                var25 += var24;
                                            }
                                        }
                                        if (!class402.method2516(0, (var36 >> 12) + 1, (var35 >> 12) + -1, class87.field1241, var43, var23, var25, -17575)) {
                                            return false;
                                        }
                                        var35 += var19;
                                        var43 += class702.field9783;
                                        var36 += var21;
                                        var25 += var24;
                                    }
                                } else {
                                    int var38 = arg7 - arg9;
                                    int var39 = arg9 - arg0;
                                    int var40 = class702.field9783 * arg0;
                                    while (true) {
                                        --var39;
                                        if (~var39 > -1) {
                                            while (true) {
                                                --var38;
                                                if (var38 < 0) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var37 >> 12) + 1, (var36 >> 12) - 1, class87.field1241, var40, var23, var25, -17575)) {
                                                    return false;
                                                }
                                                var36 += var21;
                                                var40 += class702.field9783;
                                                var25 += var24;
                                                var37 += var20;
                                            }
                                        }
                                        if (!class402.method2516(0, (var35 >> 12) + 1, (var36 >> 12) + -1, class87.field1241, var40, var23, var25, -17575)) {
                                            return false;
                                        }
                                        var36 += var21;
                                        var40 += class702.field9783;
                                        var35 += var19;
                                        var25 += var24;
                                    }
                                }
                            }
                        }
                    } else if (~arg9 < ~arg7) {
                        if (class466.field6481 <= arg7) {
                            return true;
                        } else {
                            if (arg9 > class466.field6481) {
                                arg9 = class466.field6481;
                            }
                            if (~class466.field6481 > ~arg0) {
                                arg0 = class466.field6481;
                            }
                            int var44 = (arg8 << 8) + -(arg2 * var23) + var23;
                            if (~arg0 > ~arg9) {
                                int var45;
                                int var46 = var45 = arg2 << 12;
                                if (~arg7 > -1) {
                                    var45 -= arg7 * var21;
                                    var46 -= arg7 * var20;
                                    var44 -= arg7 * var24;
                                    arg7 = 0;
                                }
                                int var47 = arg1 << 12;
                                if (~arg0 > -1) {
                                    var47 -= arg0 * var19;
                                    arg0 = 0;
                                }
                                if (var20 >= var21) {
                                    int var48 = arg9 - arg0;
                                    int var49 = arg0 - arg7;
                                    int var50 = class702.field9783 * arg7;
                                    while (true) {
                                        --var49;
                                        if (~var49 > -1) {
                                            while (true) {
                                                --var48;
                                                if (~var48 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var46 >> 12) + 1, (var47 >> 12) + -1, class87.field1241, var50, var23, var44, arg4 ^ -17541)) {
                                                    return false;
                                                }
                                                var46 += var20;
                                                var50 += class702.field9783;
                                                var47 += var19;
                                                var44 += var24;
                                            }
                                        }
                                        if (!class402.method2516(0, (var46 >> 12) + 1, (var45 >> 12) - 1, class87.field1241, var50, var23, var44, -17575)) {
                                            return false;
                                        }
                                        var46 += var20;
                                        var44 += var24;
                                        var50 += class702.field9783;
                                        var45 += var21;
                                    }
                                } else {
                                    int var51 = arg9 - arg0;
                                    int var52 = arg0 - arg7;
                                    int var53 = class702.field9783 * arg7;
                                    while (true) {
                                        --var52;
                                        if (var52 < 0) {
                                            while (true) {
                                                --var51;
                                                if (~var51 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var47 >> 12) + 1, (var46 >> 12) + -1, class87.field1241, var53, var23, var44, -17575)) {
                                                    return false;
                                                }
                                                var53 += class702.field9783;
                                                var46 += var20;
                                                var47 += var19;
                                                var44 += var24;
                                            }
                                        }
                                        if (!class402.method2516(0, (var45 >> 12) + 1, (var46 >> 12) - 1, class87.field1241, var53, var23, var44, -17575)) {
                                            return false;
                                        }
                                        var45 += var21;
                                        var46 += var20;
                                        var44 += var24;
                                        var53 += class702.field9783;
                                    }
                                }
                            } else {
                                int var54;
                                int var55 = var54 = arg2 << 12;
                                if (arg7 < 0) {
                                    var44 -= arg7 * var24;
                                    var54 -= arg7 * var21;
                                    var55 -= arg7 * var20;
                                    arg7 = 0;
                                }
                                int var56 = arg5 << 12;
                                if (arg9 < 0) {
                                    var56 -= arg9 * var19;
                                    arg9 = 0;
                                }
                                if (var20 >= var21) {
                                    int var57 = arg0 - arg9;
                                    int var58 = arg9 - arg7;
                                    int var59 = class702.field9783 * arg7;
                                    while (true) {
                                        --var58;
                                        if (~var58 > -1) {
                                            while (true) {
                                                --var57;
                                                if (~var57 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var56 >> 12) + 1, (var54 >> 12) - 1, class87.field1241, var59, var23, var44, -17575)) {
                                                    return false;
                                                }
                                                var44 += var24;
                                                var54 += var21;
                                                var59 += class702.field9783;
                                                var56 += var19;
                                            }
                                        }
                                        if (!class402.method2516(0, (var55 >> 12) - -1, (var54 >> 12) + -1, class87.field1241, var59, var23, var44, -17575)) {
                                            return false;
                                        }
                                        var54 += var21;
                                        var55 += var20;
                                        var59 += class702.field9783;
                                        var44 += var24;
                                    }
                                } else {
                                    int var60 = arg0 - arg9;
                                    int var61 = arg9 - arg7;
                                    int var62 = class702.field9783 * arg7;
                                    while (true) {
                                        --var61;
                                        if (var61 < 0) {
                                            while (true) {
                                                --var60;
                                                if (~var60 > -1) {
                                                    return true;
                                                }
                                                if (!class402.method2516(0, (var54 >> 12) + 1, (var56 >> 12) + -1, class87.field1241, var62, var23, var44, -17575)) {
                                                    return false;
                                                }
                                                var54 += var21;
                                                var62 += class702.field9783;
                                                var56 += var19;
                                                var44 += var24;
                                            }
                                        }
                                        if (!class402.method2516(0, (var54 >> 12) - -1, (var55 >> 12) + -1, class87.field1241, var62, var23, var44, arg4 ^ -17541)) {
                                            return false;
                                        }
                                        var44 += var24;
                                        var62 += class702.field9783;
                                        var54 += var21;
                                        var55 += var20;
                                    }
                                }
                            }
                        }
                    } else if (~arg9 <= ~class466.field6481) {
                        return true;
                    } else {
                        if (class466.field6481 < arg7) {
                            arg7 = class466.field6481;
                        }
                        int var63 = (arg3 << 8) + -(arg5 * var23) - -var23;
                        if (~arg0 < ~class466.field6481) {
                            arg0 = class466.field6481;
                        }
                        if (arg0 <= arg7) {
                            int var64;
                            int var65 = var64 = arg5 << 12;
                            if (~arg9 > -1) {
                                var63 -= arg9 * var24;
                                var65 -= arg9 * var19;
                                var64 -= arg9 * var20;
                                arg9 = 0;
                            }
                            int var66 = arg1 << 12;
                            if (arg0 < 0) {
                                var66 -= arg0 * var21;
                                arg0 = 0;
                            }
                            if (~var19 <= ~var20) {
                                int var67 = arg7 - arg0;
                                int var68 = arg0 - arg9;
                                int var69 = class702.field9783 * arg9;
                                while (true) {
                                    --var68;
                                    if (var68 < 0) {
                                        while (true) {
                                            --var67;
                                            if (var67 < 0) {
                                                return true;
                                            }
                                            if (!class402.method2516(0, (var66 >> 12) + 1, (var64 >> 12) + -1, class87.field1241, var69, var23, var63, -17575)) {
                                                return false;
                                            }
                                            var69 += class702.field9783;
                                            var64 += var20;
                                            var63 += var24;
                                            var66 += var21;
                                        }
                                    }
                                    if (!class402.method2516(0, (var65 >> 12) - -1, (var64 >> 12) - 1, class87.field1241, var69, var23, var63, -17575)) {
                                        return false;
                                    }
                                    var69 += class702.field9783;
                                    var64 += var20;
                                    var65 += var19;
                                    var63 += var24;
                                }
                            } else {
                                int var70 = arg7 - arg0;
                                int var71 = arg0 - arg9;
                                int var72 = class702.field9783 * arg9;
                                while (true) {
                                    --var71;
                                    if (~var71 > -1) {
                                        while (true) {
                                            --var70;
                                            if (~var70 > -1) {
                                                return true;
                                            }
                                            if (!class402.method2516(0, (var64 >> 12) - -1, (var66 >> 12) - 1, class87.field1241, var72, var23, var63, -17575)) {
                                                return false;
                                            }
                                            var63 += var24;
                                            var64 += var20;
                                            var72 += class702.field9783;
                                            var66 += var21;
                                        }
                                    }
                                    if (!class402.method2516(0, (var64 >> 12) + 1, (var65 >> 12) + -1, class87.field1241, var72, var23, var63, -17575)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var72 += class702.field9783;
                                    var64 += var20;
                                    var65 += var19;
                                }
                            }
                        } else {
                            int var73;
                            int var74 = var73 = arg5 << 12;
                            int var75 = arg2 << 12;
                            if (arg9 < 0) {
                                var74 -= arg9 * var19;
                                var73 -= arg9 * var20;
                                var63 -= arg9 * var24;
                                arg9 = 0;
                            }
                            if (~arg7 > -1) {
                                var75 -= arg7 * var21;
                                arg7 = 0;
                            }
                            if (~arg7 != ~arg9 && var19 < var20 || arg7 == arg9 && ~var21 > ~var19) {
                                int var76 = arg0 - arg7;
                                int var77 = arg7 - arg9;
                                int var78 = class702.field9783 * arg9;
                                while (true) {
                                    --var77;
                                    if (var77 < 0) {
                                        while (true) {
                                            --var76;
                                            if (var76 < 0) {
                                                return true;
                                            }
                                            if (!class402.method2516(0, (var75 >> 12) - -1, (var74 >> 12) + -1, class87.field1241, var78, var23, var63, -17575)) {
                                                return false;
                                            }
                                            var75 += var21;
                                            var63 += var24;
                                            var74 += var19;
                                            var78 += class702.field9783;
                                        }
                                    }
                                    if (!class402.method2516(0, (var73 >> 12) + 1, (var74 >> 12) + -1, class87.field1241, var78, var23, var63, -17575)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var74 += var19;
                                    var73 += var20;
                                    var78 += class702.field9783;
                                }
                            } else {
                                int var79 = arg0 - arg7;
                                int var80 = arg7 - arg9;
                                int var81 = class702.field9783 * arg9;
                                while (true) {
                                    --var80;
                                    if (~var80 > -1) {
                                        while (true) {
                                            --var79;
                                            if (var79 < 0) {
                                                return true;
                                            }
                                            if (!class402.method2516(0, (var74 >> 12) + 1, (var75 >> 12) - 1, class87.field1241, var81, var23, var63, -17575)) {
                                                return false;
                                            }
                                            var81 += class702.field9783;
                                            var63 += var24;
                                            var74 += var19;
                                            var75 += var21;
                                        }
                                    }
                                    if (!class402.method2516(0, (var74 >> 12) + 1, (var73 >> 12) + -1, class87.field1241, var81, var23, var63, arg4 ^ -17541)) {
                                        return false;
                                    }
                                    var73 += var20;
                                    var81 += class702.field9783;
                                    var63 += var24;
                                    var74 += var19;
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "(I)I")
    public final int method1525(int arg0) {
        if (arg0 != 0) {
            return 125;
        } else {
            ++field3194;
            return this.field3437;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(IB)Ljs;")
    public final class174 method1526(int arg0, byte arg1) {
        if (~this.field3455.method971(-127) > ~(arg0 * 2)) {
            this.field3455.method969(false, arg0);
        }
        if (arg1 != -41) {
            this.field3394 = false;
        }
        ++field3330;
        return this.field3455;
    }

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "(I)V")
    private final void method1527(int arg0) {
        this.field3404 = false;
        if (arg0 <= 106) {
            this.field3362 = -111;
        }
        ++field3298;
        if (class610.field8213 == this.field3398) {
            this.method1507(6);
            this.method1464((byte) 125);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lip;ZI)V")
    public final void method1528(class306 arg0, boolean arg1, int arg2) {
        this.method330(-19072, arg2, arg1, arg0);
        ++field3327;
    }

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        this.field3358 = arg0;
        ++field3157;
        this.method270(82);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(BZ)V")
    public final void method1530(byte arg0, boolean arg1) {
        if (this.field3412 != arg1) {
            this.field3412 = arg1;
            this.method279((byte) -3);
            this.field3344 &= -8;
        }
        int var3 = 24 % ((arg0 - 46) / 49);
        ++field3146;
    }

    @OriginalMember(owner = "client!rl", name = "pa", descriptor = "()V")
    public final void method1531() {
        ++field3227;
        this.field3374 = false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[Ltj;)V")
    public final void method1532(int arg0, class687[] arg1) {
        ++field3266;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3346[var3] = arg1[var3];
        }
        this.field3440 = arg0;
        if (this.field3398.method4026(126)) {
            this.method291((byte) 49);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Luu;II)V")
    public class232(Canvas arg0, Object arg1, class270 arg2, class237 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field3407 = arg4;
            this.field3314 = this.field3149 = arg1;
            this.field3260 = this.field3160 = arg0;
            this.field3230 = arg3;
            Dimension var7 = arg0.getSize();
            this.field3293 = this.field3315 = var7.height;
            this.field3435 = arg5;
            this.field3195 = this.field3263 = var7.width;
            class612.method3470(true, false, (byte) -22);
            if (super.field7623 == null) {
                this.field3182 = new NativeInterface(0, this.field3435);
                this.field3377 = null;
            } else {
                this.field3377 = new class466(this, super.field7623);
                this.field3182 = new NativeInterface(super.field7623.method515((byte) -127), this.field3435);
                for (int var8 = 0; super.field7623.method515((byte) -127) > var8; ++var8) {
                    class239 var9 = super.field7623.method521(var8, 117);
                    if (var9 != null) {
                        this.field3182.initTextureMetrics(var8, var9.field3570, var9.field3578);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method3248((byte) -88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1533(Canvas arg0, int arg1, int arg2) {
        ++field3170;
        Object var4 = null;
        if (arg0 != null && this.field3160 != arg0) {
            if (this.field3201.containsKey(arg0)) {
                var4 = this.field3201.get(arg0);
            }
        } else {
            var4 = this.field3314;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method344(var4, (byte) 108, arg0);
            if (this.field3260 == arg0) {
                this.method1512(75);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "(B)V")
    public abstract void method279(byte arg0);

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIIII)V")
    public final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3214;
        float var7 = this.method313(-93);
        this.method1386(-128);
        this.method1414(arg4, (byte) -100);
        this.method1408(0, 0, class520.field7247);
        this.method1528(class520.field7247, false, 0);
        this.method1422(11665, arg5);
        this.field3337.method2886(1.0F, (float) (arg3 + -1), (float) (arg2 - 1), (byte) -65);
        this.field3337.method2875(0.0F, (float) arg0 - var7, (float) arg1 - var7, -3758);
        this.method1443(0);
        this.method266((byte) 110, false);
        this.method1502((byte) -118, 4, class542.field7532);
        this.method266((byte) -58, true);
        this.method1528(class15.field140, false, 0);
        this.method1408(0, 0, class15.field140);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1535(Canvas arg0, int arg1, int arg2) {
        ++field3206;
        if (this.field3160 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3201.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method337(arg0, true);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field3201.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(II)Z")
    public static final boolean method1536(int arg0, int arg1) {
        ++field3248;
        if (arg1 != 0) {
            return false;
        } else {
            return arg0 == 0 || ~arg0 == -2 || ~arg0 == -3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(Z)V")
    private final void method1537(boolean arg0) {
        if (class610.field8213 == this.field3398) {
            float var2 = this.method313(-78);
            this.field3337.method2875(0.0F, var2, var2, -3758);
        }
        if (!arg0) {
            this.field3426 = -0.77417535F;
        }
        ++field3167;
        this.field3384 = false;
        this.method287(18169);
        if (this.field3373 != null) {
            this.field3373.method390(!arg0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(Z)V")
    public final void method1538(boolean arg0) {
        this.field3386 = new class263[this.field3416];
        this.field3392 = new class345[this.field3416];
        this.field3439 = new class263[this.field3416];
        this.field3347 = new class474[this.field3416];
        ++field3218;
        this.field3367 = new class190[this.field3416];
        for (int var2 = 0; ~this.field3416 < ~var2; ++var2) {
            this.field3439[var2] = class179.field2467;
            this.field3386[var2] = class179.field2467;
            this.field3392[var2] = class149.field2065;
            this.field3347[var2] = new class474();
        }
        this.field3346 = new class687[this.field3431 + -2];
        this.field3427 = this.method304(1, 1, class38.field472, class623.field8394, 2);
        this.method1523(new class516(262144));
        this.field3463 = this.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5526 }) }, 4982);
        this.field3448 = this.method331(new class40[] { new class40(new class385[] { class385.field5515, class385.field5523 }) }, 4982);
        this.field3462 = this.method331(new class40[] { new class40(class385.field5515), new class40(class385.field5523), new class40(class385.field5526), new class40(class385.field5522) }, 4982);
        this.field3449 = this.method331(new class40[] { new class40(class385.field5515), new class40(class385.field5523), new class40(class385.field5526) }, 4982);
        this.field3457 = new class328(this, 0, 0, false, false);
        this.field3465 = new class328(this, 0, 0, true, true);
        this.field3446 = new class328(this, 0, 0, false, false);
        this.field3459 = new class328(this, 0, 0, true, true);
        this.field3444 = new class328(this, 0, 0, false, false);
        this.field3456 = new class328(this, 0, 0, true, true);
        this.field3454 = new class328(this, 0, 0, false, false);
        this.field3450 = new class328(this, 0, 0, true, true);
        this.field3453 = new class328(this, 0, 0, arg0, false);
        this.field3460 = new class328(this, 0, 0, true, true);
        this.field3382 = new class398(this);
        this.field3455 = this.method294(true, (byte) -106);
        this.method1405(-114);
        this.field3185 = new class374(this);
        this.field3441[1] = this.method309(13492, 1);
        this.field3441[2] = this.method309(13492, 2);
        this.field3441[4] = this.method309(13492, 4);
        this.field3441[5] = this.method309(13492, 5);
        this.field3441[6] = this.method309(13492, 6);
        this.field3441[7] = this.method309(13492, 7);
        this.field3441[3] = this.method309(13492, 3);
        this.field3441[8] = this.method309(13492, 8);
        this.field3441[9] = this.method309(13492, 9);
        if (!this.field3441[2].method396(false)) {
            this.field3441[2] = this.method309(13492, 0);
        }
        if (!this.field3441[4].method396(false)) {
            this.field3441[4] = this.field3441[2];
        }
        if (!this.field3441[8].method396(false)) {
            this.field3441[8] = this.field3441[4];
        }
        if (!this.field3441[9].method396(arg0)) {
            this.field3441[9] = this.field3441[8];
        }
        this.method332(-102);
        this.method1437();
        this.method281();
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Lza;")
    public final class257 method1539(int arg0) {
        ++field3189;
        class516 var2 = new class516(arg0);
        this.field3168.method3610(9289, var2);
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZILip;Z)V")
    public abstract void method324(int arg0, boolean arg1, int arg2, class306 arg3, boolean arg4);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method1540(int arg0) {
        ++field3175;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFFFBFF)Z")
    private final boolean method1541(float arg0, float arg1, float arg2, float arg3, byte arg4, float arg5, float arg6) {
        ++field3202;
        Buffer var8 = this.field3451.method2145(true, 27425);
        if (var8 == null) {
            return false;
        } else {
            if (arg4 <= 61) {
                this.method328((byte) -21);
            }
            Stream var9 = this.method1473(-1969469652, var8);
            if (!Stream.method2614()) {
                var9.method2617(arg3);
                var9.method2617(arg6);
                var9.method2617(arg5);
                var9.method2617(arg0);
                var9.method2617(arg2);
                var9.method2617(arg1);
            } else {
                var9.method2608(arg3);
                var9.method2608(arg6);
                var9.method2608(arg5);
                var9.method2608(arg0);
                var9.method2608(arg2);
                var9.method2608(arg1);
            }
            var9.method2613();
            return this.field3451.method2143(-83);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class341 method1542(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3319;
        return new class166(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "(I)V")
    public final void method1543(int arg0) {
        ++field3159;
        Enumeration var2 = this.field3201.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method285(this.field3201.get(var3), var3, -124);
        }
        this.field3461.method970(-116);
        this.field3451.method970(-111);
        this.field3447.method970(-113);
        this.field3465.method2101(28167);
        this.field3459.method2101(28167);
        this.field3456.method2101(28167);
        if (arg0 <= 92) {
            this.method319((byte) -109, true);
        }
        this.field3450.method2101(28167);
        this.field3460.method2101(28167);
        this.field3382.method2483((byte) 68);
        this.field3455.method970(-103);
    }

    @OriginalMember(owner = "client!rl", name = "KA", descriptor = "(IIII)V")
    public final void method1544(int arg0, int arg1, int arg2, int arg3) {
        ++field3179;
        if (~arg0 >= -1 && ~(this.field3195 + -1) >= ~arg2 && arg1 <= 0 && arg3 >= this.field3293 + -1) {
            this.method1437();
        } else {
            this.field3414 = arg0 < 0 ? 0 : arg0;
            this.field3415 = ~arg3 >= ~this.field3195 ? arg3 : 0;
            this.field3422 = arg1 < 0 ? 0 : arg1;
            this.field3363 = this.field3195 < arg2 ? 0 : arg2;
            if (!this.field3466) {
                this.field3466 = true;
                this.method303(-1);
            }
            this.method295(116);
            this.method1448(0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "(I)V")
    public void method332(int arg0) {
        ++field3249;
        this.method1406(-1);
        int var2 = -56 / ((arg0 - -60) / 39);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
    public final void method1545(boolean arg0) {
        ++field3329;
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(II)V")
    public abstract void method326(int arg0, int arg1);

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "(B)V")
    public final void method1546(byte arg0) {
        if (arg0 != -104) {
            this.field3397 = 0.23002167F;
        }
        ++field3228;
        if (this.field3344 != 2) {
            this.method1493(arg0 + 79);
            this.method1467(false, -32);
            this.method1530((byte) 116, false);
            this.method1491(-32, false);
            this.method1453(false, 33);
            this.method1477(false, false, arg0 + -2, -2);
            this.field3344 = 2;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIIII)Lhe;")
    public final class577 method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3306;
        return new class95(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rl", name = "JA", descriptor = "(IIIIII)I")
    public final int method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3326;
        int var7 = 0;
        float var8 = (float) arg2 * this.field3338.field6570 + (float) arg0 * this.field3338.field6592 + (float) arg1 * this.field3338.field6599 + this.field3338.field6589;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3338.field6570 + (float) arg3 * this.field3338.field6592 + (float) arg4 * this.field3338.field6599 + this.field3338.field6589;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field3353 > var8 && var9 < (float) this.field3353) {
            var7 |= 16;
        } else if ((float) this.field3352 < var8 && var9 > (float) this.field3352) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3338.field6597 + (float) arg0 * this.field3338.field6594 + (float) arg1 * this.field3338.field6581 + this.field3338.field6609) * (float) this.field3370 / var8);
        int var11 = (int) (((float) arg5 * this.field3338.field6597 + (float) arg3 * this.field3338.field6594 + (float) arg4 * this.field3338.field6581 + this.field3338.field6609) * (float) this.field3370 / var9);
        if ((float) var10 < this.field3403 && (float) var11 < this.field3403) {
            var7 |= 1;
        } else if (this.field3366 < (float) var10 && this.field3366 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3338.field6611 + (float) arg0 * this.field3338.field6576 + (float) arg1 * this.field3338.field6567 + this.field3338.field6578) * (float) this.field3411 / var8);
        int var13 = (int) (((float) arg5 * this.field3338.field6611 + (float) arg3 * this.field3338.field6576 + (float) arg4 * this.field3338.field6567 + this.field3338.field6578) * (float) this.field3411 / var9);
        if (this.field3408 > (float) var12 && this.field3408 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field3379 && this.field3379 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIIIZ)Lfd;")
    public final class298 method1549(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3291;
        return new class728(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(Z)V")
    public abstract void method333(boolean arg0);

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "(B)V")
    public final void method1550(byte arg0) {
        ++field3255;
        this.method1400(-110);
        this.method1464((byte) -95);
        int var2 = -75 % ((24 - arg0) / 59);
    }
}
