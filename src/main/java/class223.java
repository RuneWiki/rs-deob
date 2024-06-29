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

@OriginalClass("client!lba")
public abstract class class223 extends class473 {

    @OriginalMember(owner = "client!lba", name = "Fb", descriptor = "Lv;")
    private class165 field3144 = new class165();

    @OriginalMember(owner = "client!lba", name = "ge", descriptor = "Z")
    public boolean field3275 = true;

    @OriginalMember(owner = "client!lba", name = "ce", descriptor = "Luf;")
    public class517 field3271 = new class517();

    @OriginalMember(owner = "client!lba", name = "je", descriptor = "Luf;")
    public class517 field3278 = new class517();

    @OriginalMember(owner = "client!lba", name = "ke", descriptor = "Luf;")
    public class517 field3279 = new class517();

    @OriginalMember(owner = "client!lba", name = "le", descriptor = "Luf;")
    public class517 field3280 = new class517();

    @OriginalMember(owner = "client!lba", name = "me", descriptor = "Luf;")
    private class517 field3281 = new class517();

    @OriginalMember(owner = "client!lba", name = "ne", descriptor = "Luf;")
    private class517 field3282 = new class517();

    @OriginalMember(owner = "client!lba", name = "ze", descriptor = "Z")
    private boolean field3294 = false;

    @OriginalMember(owner = "client!lba", name = "ye", descriptor = "[F")
    private float[] field3293 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!lba", name = "se", descriptor = "I")
    private int field3287 = 16777215;

    @OriginalMember(owner = "client!lba", name = "qe", descriptor = "[F")
    private float[] field3285 = new float[16];

    @OriginalMember(owner = "client!lba", name = "Qe", descriptor = "Z")
    public boolean field3311 = false;

    @OriginalMember(owner = "client!lba", name = "Ge", descriptor = "Z")
    public boolean field3301 = true;

    @OriginalMember(owner = "client!lba", name = "Me", descriptor = "I")
    public int field3307 = 0;

    @OriginalMember(owner = "client!lba", name = "qf", descriptor = "F")
    public float field3336 = 3584.0F;

    @OriginalMember(owner = "client!lba", name = "of", descriptor = "I")
    public int field3334 = -1;

    @OriginalMember(owner = "client!lba", name = "uf", descriptor = "Z")
    public boolean field3340 = true;

    @OriginalMember(owner = "client!lba", name = "xe", descriptor = "I")
    private int field3292 = 0;

    @OriginalMember(owner = "client!lba", name = "Fe", descriptor = "Z")
    public boolean field3300 = false;

    @OriginalMember(owner = "client!lba", name = "Te", descriptor = "[F")
    public float[] field3314 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!lba", name = "cf", descriptor = "F")
    public float field3323 = 1.0F;

    @OriginalMember(owner = "client!lba", name = "tf", descriptor = "I")
    public int field3339 = 0;

    @OriginalMember(owner = "client!lba", name = "af", descriptor = "I")
    public int field3321 = 512;

    @OriginalMember(owner = "client!lba", name = "ve", descriptor = "F")
    private float field3290 = 1.0F;

    @OriginalMember(owner = "client!lba", name = "If", descriptor = "Ltq;")
    public class397 field3354 = class250.field3722;

    @OriginalMember(owner = "client!lba", name = "zf", descriptor = "Z")
    public boolean field3345 = false;

    @OriginalMember(owner = "client!lba", name = "We", descriptor = "Z")
    private boolean field3317 = false;

    @OriginalMember(owner = "client!lba", name = "bf", descriptor = "I")
    public int field3322 = 50;

    @OriginalMember(owner = "client!lba", name = "Ee", descriptor = "I")
    private int field3299 = -1;

    @OriginalMember(owner = "client!lba", name = "Ze", descriptor = "I")
    public int field3320 = 0;

    @OriginalMember(owner = "client!lba", name = "Mf", descriptor = "F")
    public float field3358 = -1.0F;

    @OriginalMember(owner = "client!lba", name = "hf", descriptor = "I")
    public int field3328 = 0;

    @OriginalMember(owner = "client!lba", name = "Df", descriptor = "I")
    private int field3349 = 1;

    @OriginalMember(owner = "client!lba", name = "Ie", descriptor = "I")
    private int field3303 = 0;

    @OriginalMember(owner = "client!lba", name = "gf", descriptor = "Z")
    public boolean field3327 = false;

    @OriginalMember(owner = "client!lba", name = "Bf", descriptor = "F")
    public float field3347 = 3584.0F;

    @OriginalMember(owner = "client!lba", name = "Le", descriptor = "Lhba;")
    public class719 field3306 = class327.field4593;

    @OriginalMember(owner = "client!lba", name = "rf", descriptor = "Z")
    public boolean field3337 = true;

    @OriginalMember(owner = "client!lba", name = "Nf", descriptor = "F")
    public float field3359 = 1.0F;

    @OriginalMember(owner = "client!lba", name = "Xe", descriptor = "[F")
    private float[] field3318 = new float[16];

    @OriginalMember(owner = "client!lba", name = "Ke", descriptor = "F")
    public float field3305 = 1.0F;

    @OriginalMember(owner = "client!lba", name = "Zf", descriptor = "I")
    public int field3371 = 0;

    @OriginalMember(owner = "client!lba", name = "Ae", descriptor = "I")
    public int field3295 = 0;

    @OriginalMember(owner = "client!lba", name = "Cf", descriptor = "I")
    private int field3348 = -1;

    @OriginalMember(owner = "client!lba", name = "Ue", descriptor = "I")
    public int field3315 = 0;

    @OriginalMember(owner = "client!lba", name = "Jf", descriptor = "I")
    private int field3355 = 0;

    @OriginalMember(owner = "client!lba", name = "sf", descriptor = "Z")
    private boolean field3338 = false;

    @OriginalMember(owner = "client!lba", name = "Xf", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!lba", name = "nf", descriptor = "I")
    private int field3333 = -1;

    @OriginalMember(owner = "client!lba", name = "Tf", descriptor = "I")
    public int field3365 = 128;

    @OriginalMember(owner = "client!lba", name = "Oe", descriptor = "F")
    public float field3309 = -1.0F;

    @OriginalMember(owner = "client!lba", name = "Qf", descriptor = "Z")
    public boolean field3362 = true;

    @OriginalMember(owner = "client!lba", name = "eg", descriptor = "[F")
    private float[] field3376 = new float[16];

    @OriginalMember(owner = "client!lba", name = "Wf", descriptor = "Z")
    public boolean field3368 = true;

    @OriginalMember(owner = "client!lba", name = "fg", descriptor = "I")
    public int field3377 = -1;

    @OriginalMember(owner = "client!lba", name = "Yf", descriptor = "[F")
    private float[] field3370 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lba", name = "Hf", descriptor = "I")
    public int field3353 = 8;

    @OriginalMember(owner = "client!lba", name = "dg", descriptor = "F")
    public float field3375 = 1.0F;

    @OriginalMember(owner = "client!lba", name = "gg", descriptor = "Z")
    private boolean field3378 = false;

    @OriginalMember(owner = "client!lba", name = "Ye", descriptor = "[F")
    public float[] field3319 = this.field3370;

    @OriginalMember(owner = "client!lba", name = "Ef", descriptor = "I")
    public int field3350 = 512;

    @OriginalMember(owner = "client!lba", name = "cg", descriptor = "I")
    public int field3374 = 0;

    @OriginalMember(owner = "client!lba", name = "ue", descriptor = "I")
    public int field3289 = 0;

    @OriginalMember(owner = "client!lba", name = "ig", descriptor = "I")
    public int field3380 = 3584;

    @OriginalMember(owner = "client!lba", name = "kg", descriptor = "[F")
    public float[] field3382 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!lba", name = "hg", descriptor = "I")
    public int field3379 = 0;

    @OriginalMember(owner = "client!lba", name = "De", descriptor = "[F")
    private float[] field3298 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!lba", name = "pe", descriptor = "I")
    public int field3284 = 3;

    @OriginalMember(owner = "client!lba", name = "ag", descriptor = "Z")
    private boolean field3372 = false;

    @OriginalMember(owner = "client!lba", name = "jf", descriptor = "Z")
    private boolean field3329 = false;

    @OriginalMember(owner = "client!lba", name = "Sf", descriptor = "[Lqs;")
    private class741[] field3364 = new class741[10];

    @OriginalMember(owner = "client!lba", name = "Re", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3312 = new Stream();

    @OriginalMember(owner = "client!lba", name = "Hg", descriptor = "Luf;")
    private class517 field3405 = new class517();

    @OriginalMember(owner = "client!lba", name = "wf", descriptor = "I")
    public int field3342;

    @OriginalMember(owner = "client!lba", name = "Z", descriptor = "Lae;")
    public class283 field3112;

    @OriginalMember(owner = "client!lba", name = "db", descriptor = "Ljava/lang/Object;")
    public Object field3116;

    @OriginalMember(owner = "client!lba", name = "Jd", descriptor = "Ljava/lang/Object;")
    private Object field3252;

    @OriginalMember(owner = "client!lba", name = "Wb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3161;

    @OriginalMember(owner = "client!lba", name = "zb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3138;

    @OriginalMember(owner = "client!lba", name = "rb", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!lba", name = "pd", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!lba", name = "ff", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!lba", name = "qc", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!lba", name = "Kc", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!lba", name = "lf", descriptor = "Lcm;")
    private class669 field3331;

    @OriginalMember(owner = "client!lba", name = "Fc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field3196;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "Lqk;")
    public static class1 field3090 = new class1(74, -1);

    @OriginalMember(owner = "client!lba", name = "Ic", descriptor = "Z")
    public static boolean field3199 = false;

    @OriginalMember(owner = "client!lba", name = "oe", descriptor = "F")
    public float field3283;

    @OriginalMember(owner = "client!lba", name = "we", descriptor = "F")
    public float field3291;

    @OriginalMember(owner = "client!lba", name = "Be", descriptor = "F")
    public float field3296;

    @OriginalMember(owner = "client!lba", name = "Je", descriptor = "F")
    public float field3304;

    @OriginalMember(owner = "client!lba", name = "Pe", descriptor = "F")
    private float field3310;

    @OriginalMember(owner = "client!lba", name = "pf", descriptor = "F")
    private float field3335;

    @OriginalMember(owner = "client!lba", name = "xf", descriptor = "F")
    public float field3343;

    @OriginalMember(owner = "client!lba", name = "Vf", descriptor = "F")
    public float field3367;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!lba", name = "P", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!lba", name = "Q", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!lba", name = "R", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!lba", name = "S", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!lba", name = "T", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!lba", name = "U", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!lba", name = "V", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!lba", name = "W", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!lba", name = "X", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!lba", name = "Y", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!lba", name = "ab", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!lba", name = "bb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!lba", name = "cb", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!lba", name = "eb", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!lba", name = "fb", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!lba", name = "gb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!lba", name = "hb", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!lba", name = "ib", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!lba", name = "jb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!lba", name = "kb", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!lba", name = "lb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!lba", name = "mb", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!lba", name = "nb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!lba", name = "ob", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!lba", name = "pb", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!lba", name = "qb", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!lba", name = "tb", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!lba", name = "vb", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!lba", name = "wb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!lba", name = "xb", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!lba", name = "yb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!lba", name = "Ab", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!lba", name = "Cb", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!lba", name = "Db", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!lba", name = "Eb", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!lba", name = "Gb", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!lba", name = "Hb", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!lba", name = "Ib", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!lba", name = "Jb", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!lba", name = "Kb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!lba", name = "Lb", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!lba", name = "Nb", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!lba", name = "Ob", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!lba", name = "Pb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!lba", name = "Qb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!lba", name = "Rb", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!lba", name = "Sb", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!lba", name = "Tb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!lba", name = "Ub", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!lba", name = "Vb", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!lba", name = "Xb", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lba", name = "Yb", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lba", name = "Zb", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lba", name = "ac", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!lba", name = "bc", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!lba", name = "cc", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!lba", name = "dc", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!lba", name = "ec", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!lba", name = "fc", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!lba", name = "gc", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!lba", name = "ic", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!lba", name = "jc", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!lba", name = "kc", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!lba", name = "lc", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!lba", name = "mc", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!lba", name = "nc", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!lba", name = "oc", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!lba", name = "pc", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!lba", name = "rc", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!lba", name = "sc", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!lba", name = "tc", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!lba", name = "uc", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!lba", name = "vc", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!lba", name = "wc", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!lba", name = "xc", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!lba", name = "yc", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!lba", name = "zc", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!lba", name = "Ac", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!lba", name = "Bc", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!lba", name = "Cc", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!lba", name = "Dc", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!lba", name = "Ec", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!lba", name = "Gc", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!lba", name = "Hc", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!lba", name = "Jc", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!lba", name = "Lc", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!lba", name = "Mc", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!lba", name = "Nc", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!lba", name = "Oc", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!lba", name = "Pc", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!lba", name = "Qc", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!lba", name = "Rc", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!lba", name = "Sc", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!lba", name = "Tc", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!lba", name = "Uc", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!lba", name = "Vc", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!lba", name = "Wc", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!lba", name = "Xc", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!lba", name = "Yc", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!lba", name = "Zc", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!lba", name = "ad", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!lba", name = "bd", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!lba", name = "cd", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!lba", name = "dd", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!lba", name = "ed", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!lba", name = "fd", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!lba", name = "gd", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!lba", name = "hd", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!lba", name = "id", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!lba", name = "jd", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!lba", name = "kd", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!lba", name = "ld", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!lba", name = "md", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!lba", name = "nd", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!lba", name = "od", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!lba", name = "qd", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!lba", name = "rd", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!lba", name = "sd", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!lba", name = "td", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!lba", name = "ud", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!lba", name = "vd", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!lba", name = "wd", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!lba", name = "xd", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!lba", name = "yd", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!lba", name = "zd", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!lba", name = "Ad", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!lba", name = "Bd", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!lba", name = "Cd", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!lba", name = "Dd", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!lba", name = "Ed", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!lba", name = "Fd", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!lba", name = "Gd", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!lba", name = "Hd", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!lba", name = "Id", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!lba", name = "Kd", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!lba", name = "Ld", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!lba", name = "Md", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!lba", name = "Nd", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!lba", name = "Od", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!lba", name = "Pd", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!lba", name = "Qd", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!lba", name = "Rd", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lba", name = "Sd", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!lba", name = "Td", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!lba", name = "Ud", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!lba", name = "Vd", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!lba", name = "Wd", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!lba", name = "Xd", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!lba", name = "Yd", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!lba", name = "Zd", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lba", name = "ae", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!lba", name = "be", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!lba", name = "de", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!lba", name = "ee", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!lba", name = "fe", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!lba", name = "he", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!lba", name = "ie", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!lba", name = "re", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!lba", name = "df", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!lba", name = "ef", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!lba", name = "vf", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!lba", name = "yf", descriptor = "I")
    public int field3344;

    @OriginalMember(owner = "client!lba", name = "Lf", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!lba", name = "Of", descriptor = "I")
    private int field3360;

    @OriginalMember(owner = "client!lba", name = "Pf", descriptor = "I")
    public int field3361;

    @OriginalMember(owner = "client!lba", name = "bg", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!lba", name = "lg", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!lba", name = "Jg", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!lba", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!lba", name = "qg", descriptor = "Lbfa;")
    public class262 field3388;

    @OriginalMember(owner = "client!lba", name = "sg", descriptor = "Lbfa;")
    private class262 field3390;

    @OriginalMember(owner = "client!lba", name = "ug", descriptor = "Lbfa;")
    private class262 field3392;

    @OriginalMember(owner = "client!lba", name = "xg", descriptor = "Lbfa;")
    public class262 field3395;

    @OriginalMember(owner = "client!lba", name = "yg", descriptor = "Lbfa;")
    public class262 field3396;

    @OriginalMember(owner = "client!lba", name = "Cg", descriptor = "Lbfa;")
    public class262 field3400;

    @OriginalMember(owner = "client!lba", name = "Gg", descriptor = "Lbfa;")
    private class262 field3404;

    @OriginalMember(owner = "client!lba", name = "mg", descriptor = "Lvea;")
    public class338 field3384;

    @OriginalMember(owner = "client!lba", name = "ng", descriptor = "Lvea;")
    public class338 field3385;

    @OriginalMember(owner = "client!lba", name = "rg", descriptor = "Lvea;")
    public class338 field3389;

    @OriginalMember(owner = "client!lba", name = "tg", descriptor = "Lvea;")
    public class338 field3391;

    @OriginalMember(owner = "client!lba", name = "vg", descriptor = "Lvea;")
    public class338 field3393;

    @OriginalMember(owner = "client!lba", name = "zg", descriptor = "Lvea;")
    public class338 field3397;

    @OriginalMember(owner = "client!lba", name = "Ag", descriptor = "Lvea;")
    public class338 field3398;

    @OriginalMember(owner = "client!lba", name = "Bg", descriptor = "Lvea;")
    public class338 field3399;

    @OriginalMember(owner = "client!lba", name = "Dg", descriptor = "Lvea;")
    public class338 field3401;

    @OriginalMember(owner = "client!lba", name = "Fg", descriptor = "Lvea;")
    public class338 field3403;

    @OriginalMember(owner = "client!lba", name = "Af", descriptor = "Lml;")
    public class34 field3346;

    @OriginalMember(owner = "client!lba", name = "te", descriptor = "Lar;")
    private class586 field3288;

    @OriginalMember(owner = "client!lba", name = "wg", descriptor = "Lpm;")
    private class614 field3394;

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "Loca;")
    public class639 field3100;

    @OriginalMember(owner = "client!lba", name = "og", descriptor = "Lfw;")
    private class716 field3386;

    @OriginalMember(owner = "client!lba", name = "pg", descriptor = "Lfw;")
    private class716 field3387;

    @OriginalMember(owner = "client!lba", name = "Eg", descriptor = "Lfw;")
    private class716 field3402;

    @OriginalMember(owner = "client!lba", name = "Ne", descriptor = "Lqs;")
    private class741 field3308;

    @OriginalMember(owner = "client!lba", name = "hc", descriptor = "Lqf;")
    public static class783 field3172;

    @OriginalMember(owner = "client!lba", name = "Ce", descriptor = "Lsl;")
    private class97 field3297;

    @OriginalMember(owner = "client!lba", name = "Bb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3140;

    @OriginalMember(owner = "client!lba", name = "ub", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field3133;

    @OriginalMember(owner = "client!lba", name = "sb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3131;

    @OriginalMember(owner = "client!lba", name = "Se", descriptor = "Z")
    public boolean field3313;

    @OriginalMember(owner = "client!lba", name = "Ve", descriptor = "Z")
    public boolean field3316;

    @OriginalMember(owner = "client!lba", name = "Ff", descriptor = "Z")
    public boolean field3351;

    @OriginalMember(owner = "client!lba", name = "Kf", descriptor = "Z")
    public boolean field3356;

    @OriginalMember(owner = "client!lba", name = "Rf", descriptor = "Z")
    public boolean field3363;

    @OriginalMember(owner = "client!lba", name = "Ig", descriptor = "Z")
    public boolean field3406;

    @OriginalMember(owner = "client!lba", name = "Mb", descriptor = "[I")
    public static int[] field3151;

    @OriginalMember(owner = "client!lba", name = "mf", descriptor = "[Loja;")
    public class124[] field3332;

    @OriginalMember(owner = "client!lba", name = "Gf", descriptor = "[Lsca;")
    public class251[] field3352;

    @OriginalMember(owner = "client!lba", name = "jg", descriptor = "[Lml;")
    private class34[] field3381;

    @OriginalMember(owner = "client!lba", name = "kf", descriptor = "[Luf;")
    public class517[] field3330;

    @OriginalMember(owner = "client!lba", name = "He", descriptor = "[Lsi;")
    public class769[] field3302;

    @OriginalMember(owner = "client!lba", name = "Uf", descriptor = "[Lsi;")
    public class769[] field3366;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(Z)V")
    public final void method1377(boolean arg0) {
        if (!arg0) {
            this.field3346 = null;
        }
        if (this.field3332[this.field3289] != class467.field6494) {
            this.field3332[this.field3289] = class467.field6494;
            this.field3330[this.field3289].method42();
            this.method1405((byte) -125);
        }
        ++field3221;
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "()V")
    public final void method184() {
        ++field3226;
        if (this.field3331 != null) {
            this.field3331.method3819(-1);
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IB)Lqs;")
    public class741 method1378(int arg0, byte arg1) {
        if (arg1 <= 7) {
            this.field3377 = -88;
        }
        ++field3266;
        if (~arg0 != -7) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return ~arg0 == -8 ? new class591(this) : new class499(this);
                } else {
                    return new class120(this, this.field3100);
                }
            } else {
                return new class793(this);
            }
        } else {
            return new class92(this);
        }
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(II)V")
    public final void method140(int arg0, int arg1) {
        ++field3251;
        if (~this.field3322 != ~arg0 || this.field3380 != arg1) {
            this.field3380 = arg1;
            this.field3322 = arg0;
            this.method1506(123);
            this.method1382(0);
            this.method1401(-3624);
        }
    }

    @OriginalMember(owner = "client!lba", name = "X", descriptor = "(I)V")
    public final void method166(int arg0) {
        this.field3284 = 0;
        ++field3220;
        while (~arg0 < -2) {
            ++this.field3284;
            arg0 >>= 1;
        }
        this.field3353 = 1 << this.field3284;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)V")
    public final void method1379(byte arg0) {
        ++field3267;
        if (arg0 != -102) {
            this.field3383 = -61;
        }
        if (this.field3325 != 4) {
            this.method1446(20343);
            this.method1499(false, arg0 + 105);
            this.method1393(false, 0);
            this.method1480(arg0 ^ -47, false);
            this.method1479(false, 7);
            this.method1467(false, false, -2, (byte) 89);
            this.method1404((byte) -117, 1);
            this.method1509(arg0 ^ -98, 0);
            this.field3325 = 4;
        }
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
    public void method232(int arg0) {
        ++field3253;
        if (this.field3331 != null) {
            this.field3331.method3820(true);
        }
        this.field3373 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "()Z")
    public final boolean method161() {
        ++field3135;
        return this.field3313;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
        ++field3094;
    }

    @OriginalMember(owner = "client!lba", name = "DA", descriptor = "(IIII)V")
    public final void method242(int arg0, int arg1, int arg2, int arg3) {
        this.field3379 = arg1;
        this.field3307 = arg0;
        this.field3321 = arg3;
        this.field3350 = arg2;
        ++field3157;
        this.method1382(0);
        this.method1506(80);
        this.method1397(-120);
        this.method1493(7233);
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
    private final void method1380(int arg0) {
        if (arg0 != 24057) {
            this.field3374 = -36;
        }
        ++field3143;
        if (class748.field10335 != this.field3354) {
            class397 var2 = this.field3354;
            this.field3354 = class748.field10335;
            if (!var2.method2443((byte) -65)) {
                this.method1490(arg0 ^ 24057);
            }
            this.method1440(arg0 ^ 24056);
            this.field3319 = this.field3376;
            this.method1496(false);
            this.field3325 &= -8;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lok;)V")
    public final void method173(class255 arg0) {
        ++field3111;
        this.field3288 = (class586) arg0;
    }

    @OriginalMember(owner = "client!lba", name = "za", descriptor = "(IIIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3258;
        this.method1465(false);
        this.method1468((byte) 67, arg3);
        this.method1409(class41.field423, 0, -114);
        this.method1455(0, -3, class41.field423);
        this.method1404((byte) -115, arg4);
        this.field3271.method3096((float) arg2, (float) arg2, 1.0F, -9950);
        this.field3271.method47(arg0, arg1, 0);
        this.method1428(0);
        this.method1441((byte) -30, false);
        this.method1386((byte) -124, this.field3387, 0);
        this.method1485(this.field3392, 32);
        this.method1403(126, class224.field3417, 0, 256);
        this.method1441((byte) -80, true);
        this.method1455(0, -3, class157.field2039);
        this.method1409(class157.field2039, 0, -114);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1381(int arg0, boolean arg1, int arg2) {
        ++field3114;
        return arg0 >= -34 ? null : this.field3140.method2333(arg2, arg1);
    }

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "(I)V")
    private final void method1382(int arg0) {
        if (arg0 != 0) {
            this.method1398(-63);
        }
        this.field3372 = false;
        ++field3182;
        this.method1456((byte) -119);
        if (class146.field1882 == this.field3354) {
            this.method1496(false);
        }
    }

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "(I)V")
    public final void method1383(int arg0) {
        ++field3105;
        this.field3366 = new class769[this.field3361];
        this.field3332 = new class124[this.field3361];
        this.field3381 = new class34[this.field3361];
        this.field3302 = new class769[this.field3361];
        this.field3330 = new class517[this.field3361];
        for (int var2 = 0; ~this.field3361 < ~var2; ++var2) {
            this.field3366[var2] = class785.field10763;
            this.field3302[var2] = class785.field10763;
            this.field3332[var2] = class467.field6494;
            this.field3330[var2] = new class517();
        }
        this.field3352 = new class251[this.field3341 + -2];
        this.field3346 = this.method1495(class75.field837, 1, class612.field8616, (byte) 115, 1);
        this.method165(new class672(262144));
        this.field3400 = this.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477 }) });
        this.field3396 = this.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5475 }) });
        this.field3395 = this.method1406((byte) 6, new class435[] { new class435(class382.field5466), new class435(class382.field5475), new class435(class382.field5477), new class435(class382.field5473) });
        this.field3388 = this.method1406((byte) 6, new class435[] { new class435(class382.field5466), new class435(class382.field5475), new class435(class382.field5477) });
        this.field3385 = new class338(this, 0, 0, false, false);
        this.field3403 = new class338(this, 0, 0, true, true);
        this.field3398 = new class338(this, 0, 0, false, false);
        this.field3389 = new class338(this, 0, 0, true, true);
        this.field3397 = new class338(this, 0, 0, false, false);
        this.field3384 = new class338(this, 0, 0, true, true);
        this.field3399 = new class338(this, 0, 0, false, false);
        if (arg0 <= 27) {
            this.field3381 = null;
        }
        this.field3391 = new class338(this, 0, 0, true, true);
        this.field3393 = new class338(this, 0, 0, false, false);
        this.field3401 = new class338(this, 0, 0, true, true);
        this.field3297 = new class97(this);
        this.field3394 = this.method1389(9, true);
        this.method1443(0);
        this.field3100 = new class639(this);
        this.field3364[1] = this.method1378(1, (byte) 11);
        this.field3364[2] = this.method1378(2, (byte) 19);
        this.field3364[4] = this.method1378(4, (byte) 44);
        this.field3364[5] = this.method1378(5, (byte) 97);
        this.field3364[6] = this.method1378(6, (byte) 22);
        this.field3364[7] = this.method1378(7, (byte) 105);
        this.field3364[3] = this.method1378(3, (byte) 19);
        this.field3364[8] = this.method1378(8, (byte) 39);
        this.field3364[9] = this.method1378(9, (byte) 41);
        if (!this.field3364[2].method425((byte) -79)) {
            this.field3364[2] = this.method1378(0, (byte) 37);
        }
        if (!this.field3364[4].method425((byte) -46)) {
            this.field3364[4] = this.field3364[2];
        }
        if (!this.field3364[8].method425((byte) -79)) {
            this.field3364[8] = this.field3364[4];
        }
        if (!this.field3364[9].method425((byte) -70)) {
            this.field3364[9] = this.field3364[8];
        }
        this.method1476((byte) 108);
        this.method208();
        this.method250();
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(Z)V")
    public abstract void method1384(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIB[[I)Lfp;")
    public abstract class596 method1385(boolean arg0, int arg1, byte arg2, int[][] arg3);

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "()Z")
    public final boolean method200() {
        ++field3184;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLfw;I)V")
    public abstract void method1386(byte arg0, class716 arg1, int arg2);

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "()Loo;")
    public final class12 method187() {
        ++field3269;
        return this.field3278;
    }

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "(I)I")
    public final int method1387(int arg0) {
        ++field3264;
        if (arg0 >= -53) {
            this.method1381(88, true, -77);
        }
        return this.field3303;
    }

    @OriginalMember(owner = "client!lba", name = "XA", descriptor = "()I")
    public final int method177() {
        ++field3209;
        return this.field3380;
    }

    @OriginalMember(owner = "client!lba", name = "KA", descriptor = "(IIII)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        ++field3104;
        if (arg0 <= 0 && this.field3232 + -1 <= arg2 && arg1 <= 0 && this.field3201 + -1 <= arg3) {
            this.method208();
        } else {
            this.field3374 = ~arg0 <= -1 ? arg0 : 0;
            this.field3339 = this.field3232 < arg2 ? 0 : arg2;
            this.field3315 = ~arg1 > -1 ? 0 : arg1;
            this.field3371 = arg3 <= this.field3232 ? arg3 : 0;
            if (!this.field3406) {
                this.field3406 = true;
                this.method1384(false);
            }
            this.method1412(false);
            this.method1493(7233);
        }
    }

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "(I)V")
    public final void method1388(int arg0) {
        int var2 = 103 / ((45 - arg0) / 61);
        if (~this.field3325 != -9) {
            this.method1380(24057);
            this.method1499(true, 3);
            this.method1480(61, true);
            this.method1479(true, 7);
            this.method1404((byte) -116, 1);
            this.field3325 = 8;
        }
        ++field3256;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZ)Lpm;")
    public abstract class614 method1389(int arg0, boolean arg1);

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(B)Luf;")
    public final class517 method1390(byte arg0) {
        int var2 = 63 % ((10 - arg0) / 48);
        ++field3150;
        return this.field3281;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method1391(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field3212;
        if (arg6 != -25) {
            return false;
        } else {
            Buffer var8 = this.field3386.method2276(true, false);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method1449(arg6 + 39, var8);
                if (!Stream.method2346()) {
                    var9.method2350(arg2);
                    var9.method2350(arg3);
                    var9.method2350(arg5);
                    var9.method2350(arg1);
                    var9.method2350(arg0);
                    var9.method2350(arg4);
                } else {
                    var9.method2340(arg2);
                    var9.method2340(arg3);
                    var9.method2340(arg5);
                    var9.method2340(arg1);
                    var9.method2340(arg0);
                    var9.method2340(arg4);
                }
                var9.method2351();
                return this.field3386.method2281(-14567);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "la", descriptor = "()V")
    public final void method208() {
        this.field3339 = this.field3232;
        this.field3374 = 0;
        this.field3315 = 0;
        this.field3371 = this.field3201;
        ++field3216;
        if (this.field3406) {
            this.field3406 = false;
            this.method1384(false);
        }
        this.method1493(7233);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Loo;)V")
    public final void method194(class12 arg0) {
        ++field3142;
        this.field3278 = (class517) arg0;
        this.field3280.method49(this.field3278);
        this.field3280.method3082((byte) 29);
        this.field3281.method3085(-20563, this.field3280);
        this.field3279.method3085(-20563, this.field3278);
        if (this.field3354.method2443((byte) -65)) {
            this.method1490(0);
        }
    }

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "()Loo;")
    public final class12 method153() {
        ++field3134;
        return this.field3405;
    }

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "(I)V")
    public abstract void method1392(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)V")
    public final void method1393(boolean arg0, int arg1) {
        if (!this.field3311 == arg0) {
            this.field3311 = arg0;
            this.method1415(arg1 + 99);
            this.field3325 &= -8;
        }
        ++field3206;
        if (arg1 != 0) {
            this.method1451((byte) -81);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZ)Lho;")
    public final class318 method183(int arg0, int arg1, boolean arg2) {
        ++field3243;
        return new class149(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "(I)V")
    public abstract void method1394(int arg0);

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "(I)V")
    private final void method1395(int arg0) {
        ++field3194;
        if (!this.field3294) {
            float[] var2 = this.field3318;
            this.field3294 = true;
            if (this.field3232 != 0 && ~this.field3201 != -1) {
                var2[11] = 0.0F;
                var2[5] = -2.0F / (float) this.field3201;
                var2[13] = 1.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = 0.5F;
                var2[2] = 0.0F;
                var2[10] = 0.5F;
                var2[12] = -1.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = 2.0F / (float) this.field3232;
            } else {
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
            }
        }
        if (arg0 > -53) {
            field3090 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[I[I)Laa;")
    public final class87 method248(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3158;
        return class53.method458(arg3, this, arg0, arg1, arg2, (byte) -120);
    }

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "(III[I)V")
    public final void method196(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3115;
        float var5 = this.field3278.method3083((float) arg1, (float) arg2, (float) arg0, (byte) 38);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3307;
            var7 = this.field3379;
        } else {
            var6 = (int) ((float) this.field3350 * this.field3278.method3075((float) arg2, (float) arg1, (byte) -116, (float) arg0) / var5);
            var7 = (int) ((float) this.field3321 * this.field3278.method3089((float) arg1, (float) arg2, (float) arg0, (byte) 107) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field3304);
        arg3[1] = (int) ((float) var7 - this.field3343);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "()Z")
    public final boolean method162() {
        ++field3139;
        return false;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLuf;)V")
    public final void method1396(byte arg0, class517 arg1) {
        if (arg0 >= -114) {
            this.field3286 = 8;
        }
        ++field3118;
        this.field3271.method49(arg1);
        this.field3275 = false;
        this.method1450((byte) 109);
    }

    @OriginalMember(owner = "client!lba", name = "HA", descriptor = "(IIII[I)V")
    public final void method251(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3200;
        float var6 = this.field3278.method3083((float) arg1, (float) arg2, (float) arg0, (byte) 46);
        if (!(var6 < (float) this.field3322) && !(var6 > (float) this.field3380)) {
            int var7 = (int) ((float) this.field3350 * this.field3278.method3075((float) arg2, (float) arg1, (byte) -111, (float) arg0) / (float) arg3);
            int var8 = (int) ((float) this.field3321 * this.field3278.method3089((float) arg1, (float) arg2, (float) arg0, (byte) 111) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field3304);
            arg4[1] = (int) ((float) var8 - this.field3343);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIZ)Lho;")
    public final class318 method228(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3214;
        class149 var6 = new class149(this, arg2, arg3, arg4);
        var6.method988(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "(I)V")
    public final void method1397(int arg0) {
        if (class250.field3722 != this.field3354) {
            class397 var2 = this.field3354;
            this.field3354 = class250.field3722;
            if (var2.method2443((byte) -65)) {
                this.method1490(0);
            }
            this.field3325 &= -32;
            this.field3319 = this.field3370;
        }
        ++field3120;
        if (arg0 >= -117) {
            field3146 = -14;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lhw;[Lfm;Z)Lda;")
    public final class442 method179(class300 arg0, class279[] arg1, boolean arg2) {
        ++field3106;
        return new class619(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "(I)V")
    public final void method1398(int arg0) {
        int var2 = 53 / ((-46 - arg0) / 33);
        if (~this.field3325 != -3) {
            this.method1446(20343);
            this.method1499(false, 3);
            this.method1393(false, 0);
            this.method1480(75, false);
            this.method1479(false, 7);
            this.method1467(false, false, -2, (byte) -61);
            this.field3325 = 2;
        }
        ++field3092;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lza;)V")
    public final void method165(class731 arg0) {
        this.field3140 = ((class672) arg0).field9442;
        ++field3247;
        this.field3133 = this.field3140.method2333(32768, false);
    }

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "(I)Luf;")
    public final class517 method1399(int arg0) {
        ++field3259;
        return arg0 != 0 ? null : this.field3280;
    }

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "(I)V")
    public final void method1400(int arg0) {
        this.method1471(arg0, class224.field3417, false);
        ++field3165;
    }

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "(I)V")
    private final void method1401(int arg0) {
        if (this.field3308 != null) {
            this.field3308.method424(-90);
        }
        if (arg0 != -3624) {
            this.field3116 = null;
        }
        ++field3218;
        this.method1420((byte) -83);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([FIIZLpb;Z)Lbw;")
    public final class28 method1402(float[] arg0, int arg1, int arg2, boolean arg3, class2 arg4, boolean arg5) {
        ++field3191;
        if (arg5) {
            this.method239(true);
        }
        return this.method1448(arg2, 0, arg3, 0, 0, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILdaa;II)V")
    public abstract void method1403(int arg0, class453 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)V")
    public final void method1404(byte arg0, int arg1) {
        ++field3195;
        if (arg0 <= -111) {
            if (~this.field3349 != ~arg1) {
                class719 var3;
                boolean var4;
                boolean var5;
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 == 128) {
                            var3 = class467.field6491;
                            var4 = true;
                            var5 = true;
                        } else {
                            var4 = false;
                            var3 = class717.field9934;
                            var5 = false;
                        }
                    } else {
                        var4 = true;
                        var5 = false;
                        var3 = class329.field4618;
                    }
                } else {
                    var4 = true;
                    var5 = true;
                    var3 = class327.field4593;
                }
                if (!var5 != !this.field3368) {
                    this.field3368 = var5;
                    this.method1394(-78);
                }
                if (var4 == !this.field3362) {
                    this.field3362 = var4;
                    this.method1451((byte) -122);
                }
                if (this.field3306 != var3) {
                    this.field3306 = var3;
                    this.method1461(-107);
                }
                this.field3325 &= -29;
                this.field3349 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)V")
    private final void method1405(byte arg0) {
        ++field3103;
        this.method1411(106);
        if (this.field3308 != null) {
            this.field3308.method426((byte) -102);
        }
        int var2 = -125 / ((arg0 - -66) / 57);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B[Lim;)Lbfa;")
    public abstract class262 method1406(byte arg0, class435[] arg1);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[BBZLpb;)Lbw;")
    public final class28 method1407(int arg0, int arg1, byte[] arg2, byte arg3, boolean arg4, class2 arg5) {
        if (arg3 != 92) {
            this.field3306 = null;
        }
        ++field3260;
        return this.method1483(arg2, arg5, arg4, arg0, 0, arg1, false, 0);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lfm;Z)Lho;")
    public final class318 method192(class279 arg0, boolean arg1) {
        ++field3097;
        class318 var10;
        if (~arg0.field4014 != -1 && ~arg0.field4008 != -1) {
            int[] var3 = new int[arg0.field4014 * arg0.field4008];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field4009 == null) {
                for (int var6 = 0; arg0.field4008 > var6; ++var6) {
                    for (int var7 = 0; arg0.field4014 > var7; ++var7) {
                        int var8 = arg0.field4012[255 & arg0.field4010[var4++]];
                        var3[var5++] = var8 != 0 ? class613.method3544(-16777216, var8) : 0;
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field4008; ++var9) {
                    for (int var11 = 0; ~arg0.field4014 < ~var11; ++var11) {
                        var3[var5++] = class613.method3544(arg0.field4009[var4] << 24, arg0.field4012[class407.method2490(arg0.field4010[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method2815(var3, (byte) -39, arg0.field4014, arg0.field4008, arg0.field4014, 0);
        } else {
            var10 = this.method2815(new int[1], (byte) -39, 1, 1, 1, 0);
        }
        var10.method741(arg0.field4016, arg0.field4011, arg0.field4013, arg0.field4015);
        return var10;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V")
    public final void method1408(int arg0, boolean arg1) {
        if (arg0 >= -127) {
            this.field3341 = 16;
        }
        ++field3107;
        if (this.field3301 != arg1) {
            this.field3301 = arg1;
            this.method1508(114);
        }
    }

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "()Z")
    public final boolean method193() {
        ++field3244;
        return this.field3364[3].method425((byte) -78);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lvq;II)V")
    public final void method1409(class500 arg0, int arg1, int arg2) {
        ++field3255;
        if (arg2 < -105) {
            this.method1469(false, arg1, false, arg0, false);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3185;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method1465(false);
        this.method1468((byte) 67, arg4);
        this.method1409(class41.field423, 0, -113);
        this.method1455(0, -3, class41.field423);
        this.method1404((byte) -120, arg6);
        this.field3271.method3096(var11, (float) arg5, 1.0F, -9950);
        this.field3271.method47(0, -arg5 / 2, 0);
        this.field3271.method45(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field3271.method47(arg0, arg1, 0);
        this.method1428(0);
        this.method1441((byte) -49, false);
        this.method1400(2);
        this.method1441((byte) -66, true);
        this.method1455(0, -3, class157.field2039);
        this.method1409(class157.field2039, 0, -109);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lao;IIII)Lka;")
    public final class231 method231(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3250;
        return new class338(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(B)V")
    private final void method1410(byte arg0) {
        if (class146.field1882 != this.field3354) {
            class397 var2 = this.field3354;
            this.field3354 = class146.field1882;
            if (!var2.method2443((byte) -65)) {
                this.method1490(0);
            }
            this.method1456((byte) -119);
            this.field3319 = this.field3285;
            this.method1496(false);
            this.field3325 &= -8;
        }
        ++field3128;
        int var3 = -7 % ((-19 - arg0) / 61);
    }

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "(I)V")
    public abstract void method1411(int arg0);

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(Z)V")
    public abstract void method1412(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method221(Canvas arg0, int arg1, int arg2) {
        ++field3085;
        if (this.field3161 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3131.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1436((byte) -65, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field3131.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(Z)V")
    public abstract void method1413(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(I)V")
    public final void method195(int arg0) {
        ++field3239;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZF)V")
    public final void method1414(boolean arg0, float arg1) {
        ++field3122;
        if (this.field3290 != arg1) {
            this.field3290 = arg1;
            this.method1382(0);
        }
        if (arg0) {
            this.field3196 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "aa", descriptor = "(IIIIII)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3096;
        this.method1465(false);
        this.method1468((byte) 67, arg4);
        this.method1409(class41.field423, 0, -115);
        this.method1455(0, -3, class41.field423);
        this.method1404((byte) -116, arg5);
        this.field3271.method3096((float) arg2, (float) arg3, 1.0F, -9950);
        this.field3271.method47(arg0, arg1, 0);
        this.method1428(0);
        this.method1441((byte) -99, false);
        this.method1400(2);
        this.method1441((byte) -58, true);
        this.method1455(0, -3, class157.field2039);
        this.method1409(class157.field2039, 0, -108);
    }

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "(I)V")
    public abstract void method1415(int arg0);

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "(Z)V")
    public final void method1416(boolean arg0) {
        ++field3222;
        Enumeration var2 = this.field3131.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1497(this.field3131.get(var3), var3, !arg0);
        }
        this.field3402.method1125(51);
        this.field3386.method1125(75);
        this.field3387.method1125(53);
        if (!arg0) {
            this.method1502((byte) 112, true);
        }
        this.field3403.method2146(-76);
        this.field3389.method2146(-112);
        this.field3384.method2146(-63);
        this.field3391.method2146(-43);
        this.field3401.method2146(-114);
        this.field3297.method699(700);
        this.field3394.method1125(24);
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(BI)V")
    public abstract void method1417(byte arg0, int arg1);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIIIZI)V")
    private final void method1418(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field3229;
        boolean var7 = arg4 & this.method193();
        int var8 = -20 % ((arg2 - -2) / 46);
        if (!var7 && (~arg3 == -5 || ~arg3 == -9 || arg3 == 9)) {
            arg3 = 2;
            arg1 = arg3 == 4 ? arg5 & 1 : 1;
            arg5 = 0;
        }
        if (~arg3 != -1 && arg0) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field3369 == arg3) {
            if (this.field3369 != 0) {
                this.field3364[this.field3369 & Integer.MAX_VALUE].method430(99, arg0);
                if (~this.field3355 != ~arg5 || this.field3292 != arg1) {
                    this.field3364[this.field3369 & Integer.MAX_VALUE].method432(arg5, arg1, -124);
                    this.field3355 = arg5;
                    this.field3292 = arg1;
                }
                return;
            }
        } else {
            if (this.field3369 != 0) {
                this.field3364[this.field3369 & Integer.MAX_VALUE].method434(87);
            }
            if (arg3 == 0) {
                this.field3308 = null;
            } else {
                this.field3308 = this.field3364[arg3 & Integer.MAX_VALUE];
                this.field3308.method429((byte) 29, arg0);
                this.field3308.method430(104, arg0);
                this.field3308.method432(arg5, arg1, 94);
            }
            this.field3292 = arg1;
            this.field3355 = arg5;
            this.field3369 = arg3;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method190(Canvas arg0, int arg1, int arg2) {
        ++field3176;
        Object var4 = null;
        if (arg0 != null && this.field3161 != arg0) {
            if (this.field3131.containsKey(arg0)) {
                var4 = this.field3131.get(arg0);
            }
        } else {
            var4 = this.field3252;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1435(1, var4, arg0);
            if (this.field3138 == arg0) {
                this.method1503(1);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "(Z)V")
    public abstract void method1419(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(B)V")
    public abstract void method1420(byte arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZ)Lfw;")
    public abstract class716 method1421(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!lba", name = "Y", descriptor = "()[I")
    public final int[] method238() {
        ++field3102;
        return new int[] { this.field3307, this.field3379, this.field3350, this.field3321 };
    }

    @OriginalMember(owner = "client!lba", name = "x", descriptor = "(I)V")
    private final void method1422(int arg0) {
        ++field3268;
        if (arg0 != 9534) {
            this.field3361 = 47;
        }
        this.field3347 = (float) this.field3380;
    }

    @OriginalMember(owner = "client!lba", name = "y", descriptor = "(I)Luf;")
    public final class517 method1423(int arg0) {
        if (arg0 != 1) {
            this.method1393(true, 66);
        }
        ++field3215;
        if (!this.field3378) {
            this.field3282.method3080(this.field3280, this.field3271);
            this.field3378 = true;
        }
        return this.field3282;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class418 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3231;
        return new class671(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(II)I")
    public final int method188(int arg0, int arg1) {
        ++field3254;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "(I)V")
    public abstract void method1424(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZLvq;IZ)V")
    public abstract void method1425(boolean arg0, class500 arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lhda;)V")
    public final void method253(class714 arg0) {
        this.field3297.method695(-83, arg0, -1, this);
        ++field3136;
    }

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "(I)V")
    public abstract void method1426(int arg0);

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "(I)V")
    public void method1427(int arg0) {
        this.field3383 = this.field3344;
        ++field3187;
        this.field3344 = 0;
        if (arg0 != 3) {
            this.method156();
        }
    }

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "(I)V")
    public final void method1428(int arg0) {
        ++field3129;
        this.field3275 = false;
        this.method1450((byte) 49);
        if (arg0 != 0) {
            this.method1427(61);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "()Z")
    public final boolean method222() {
        ++field3132;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(BI)V")
    public final void method1429(byte arg0, int arg1) {
        if (arg1 != 1) {
            this.field3281 = null;
        }
        this.method1468((byte) 67, arg0 | arg0 << 16 | arg0 << 24 | arg0 << 8);
        ++field3152;
    }

    @OriginalMember(owner = "client!lba", name = "T", descriptor = "(IIII)V")
    public final void method252(int arg0, int arg1, int arg2, int arg3) {
        ++field3265;
        boolean var5 = false;
        if (this.field3374 < arg0) {
            var5 = true;
            this.field3374 = arg0;
        }
        if (~arg2 > ~this.field3339) {
            var5 = true;
            this.field3339 = arg2;
        }
        if (arg1 > this.field3315) {
            var5 = true;
            this.field3315 = arg1;
        }
        if (this.field3371 > arg3) {
            var5 = true;
            this.field3371 = arg3;
        }
        if (var5) {
            if (!this.field3406) {
                this.field3406 = true;
                this.method1384(false);
            }
            this.method1412(false);
            this.method1493(7233);
        }
    }

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "()Z")
    public final boolean method201() {
        ++field3095;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BILdaa;Lpm;III)V")
    public abstract void method1430(byte arg0, int arg1, class453 arg2, class614 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIII)Lok;")
    public final class255 method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3108;
        return new class640(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method1431(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILpb;[BIII)Lat;")
    public abstract class162 method1432(int arg0, class2 arg1, byte[] arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "()I")
    public final int method143() {
        ++field3180;
        return this.field3341 + -2;
    }

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "(I)V")
    public static void method1433(int arg0) {
        field3151 = null;
        if (arg0 <= 1) {
            method1433(-96);
        }
        field3090 = null;
        field3172 = null;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lrh;B)V")
    public abstract void method1434(class718 arg0, byte arg1);

    @OriginalMember(owner = "client!lba", name = "P", descriptor = "(IIIII)V")
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method139(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field3177;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1435(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1436(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "(I)V")
    public abstract void method1437(int arg0);

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "()Z")
    public final boolean method206() {
        ++field3166;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "(I)V")
    private final void method1438(int arg0) {
        this.field3386 = this.method1421(true, true);
        ++field3238;
        this.field3386.method2277(24, 12, false);
        if (arg0 != 0) {
            this.method249(86, -1, -121, -23, -10, -58, (class87) null, 44, -43, 127, -128, 26);
        }
        this.field3390 = this.method1406((byte) 6, new class435[] { new class435(class382.field5466) });
    }

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "(I)I")
    public final int method1439(int arg0) {
        if (arg0 != 3) {
            this.method1394(-3);
        }
        ++field3088;
        return this.field3348;
    }

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "(I)V")
    private final void method1440(int arg0) {
        if (!this.field3317) {
            float[] var2 = this.field3376;
            float var3 = (float) (-this.field3307 * this.field3322) / (float) this.field3350;
            float var4 = (float) ((-this.field3307 + this.field3232) * this.field3322) / (float) this.field3350;
            float var5 = (float) (this.field3379 * this.field3322) / (float) this.field3321;
            float var6 = (float) ((-this.field3201 + this.field3379) * this.field3322) / (float) this.field3321;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field3322 * 2.0F;
                var2[3] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[15] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = this.field3335 = (float) this.field3380 / (float) (-this.field3380 + this.field3322);
                var2[0] = var7 / (-var3 + var4);
                var2[2] = 0.0F;
                var2[11] = -1.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[14] = this.field3310 = (float) (this.field3380 * this.field3322) / (float) (-this.field3380 + this.field3322);
            } else {
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
            }
            this.method1501(arg0 + 7439);
            this.field3317 = true;
        }
        if (arg0 == 1) {
            ++field3125;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BZ)V")
    public abstract void method1441(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Loea;Lpb;B)Z")
    public abstract boolean method1442(class612 arg0, class2 arg1, byte arg2);

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "(I)V")
    public final void method1443(int arg0) {
        ++field3173;
        Hashtable var2 = new Hashtable();
        if (this.field3131 != null && !this.field3131.isEmpty()) {
            Enumeration var3 = this.field3131.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1436((byte) -65, var4));
            }
        }
        this.field3131 = var2;
        this.method1460(0);
        this.method1438(arg0);
        this.method1510((byte) 93);
        this.field3297.method701(-1, this);
    }

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "(I)[F")
    public final float[] method1444(int arg0) {
        ++field3171;
        if (arg0 != -1) {
            this.method1420((byte) -111);
        }
        return this.field3370;
    }

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "(III)V")
    public final void method255(int arg0, int arg1, int arg2) {
        if (~this.field3334 != ~arg0 || ~this.field3377 != ~arg1 || ~this.field3328 != ~arg2) {
            this.field3328 = arg2;
            this.field3334 = arg0;
            this.field3377 = arg1;
            this.method1401(-3624);
            this.method1419(false);
        }
        ++field3208;
    }

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(B)V")
    public abstract void method1445(byte arg0);

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "(I)V")
    private final void method1446(int arg0) {
        if (arg0 == 20343) {
            ++field3204;
            if (class392.field5578 != this.field3354) {
                class397 var2 = this.field3354;
                this.field3354 = class392.field5578;
                if (var2.method2443((byte) -65)) {
                    this.method1490(0);
                }
                this.method1395(-91);
                this.field3319 = this.field3318;
                this.method1496(false);
                this.field3325 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "()Z")
    public final boolean method135() {
        ++field3202;
        return false;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(BIIZ[I)Lbw;")
    public final class28 method1447(byte arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        if (arg0 != -60) {
            return null;
        } else {
            ++field3198;
            return this.method1507(arg2, arg1, arg3, 0, 0, 0, arg4);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZIII[FLpb;)Lbw;")
    public abstract class28 method1448(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, float[] arg6, class2 arg7);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method1449(int arg0, Buffer arg1) {
        ++field3101;
        if (arg0 != 14) {
            this.method180(35);
        }
        this.field3312.method2342(arg1);
        return this.field3312;
    }

    @OriginalMember(owner = "client!lba", name = "EA", descriptor = "(IIII)V")
    public final void method217(int arg0, int arg1, int arg2, int arg3) {
        ++field3087;
        if (!this.field3316) {
            throw new RuntimeException("");
        } else {
            this.field3303 = arg3;
            this.field3333 = arg2;
            this.field3348 = arg1;
            this.field3360 = arg0;
            if (this.field3329) {
                this.field3364[3].method1950((byte) 111);
                this.field3364[3].method424(-71);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "(B)V")
    private final void method1450(byte arg0) {
        if (class392.field5578 == this.field3354) {
            float var2 = this.method1474((byte) -114);
            this.field3271.method3072(8929, 0.0F, var2, var2);
        }
        ++field3234;
        this.field3378 = false;
        this.method1489(false);
        if (this.field3308 != null) {
            this.field3308.method427(0);
        }
        if (arg0 <= 13) {
            this.field3131 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "(B)V")
    public abstract void method1451(byte arg0);

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(IZ)V")
    public final void method1452(int arg0, boolean arg1) {
        ++field3145;
        if (arg0 < 123) {
            this.field3196 = null;
        }
        if (arg1 == !this.field3340) {
            this.field3340 = arg1;
            this.method1419(false);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B[F)[F")
    public final float[] method1453(byte arg0, float[] arg1) {
        arg1[0] = this.field3319[0];
        arg1[4] = this.field3319[1];
        ++field3261;
        arg1[12] = this.field3319[3];
        arg1[8] = this.field3319[2];
        arg1[13] = this.field3319[7];
        if (arg0 != 61) {
            this.field3335 = -1.7800521F;
        }
        arg1[5] = this.field3319[5];
        arg1[2] = this.field3319[8];
        arg1[1] = this.field3319[4];
        arg1[9] = this.field3319[6];
        arg1[3] = this.field3319[12];
        arg1[7] = this.field3319[13];
        arg1[10] = this.field3319[10];
        arg1[14] = this.field3319[11];
        arg1[6] = this.field3319[9];
        arg1[15] = this.field3319[15];
        arg1[11] = this.field3319[14];
        return arg1;
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)Lza;")
    public final class731 method178(int arg0) {
        ++field3217;
        class672 var2 = new class672(arg0);
        this.field3144.method1039(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([IIIIIZ)Lho;")
    public final class318 method182(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3121;
        return new class149(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "(I)I")
    public final int method1454(int arg0) {
        if (arg0 != 0) {
            return -18;
        } else {
            ++field3242;
            return this.field3333;
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)I")
    public final int method198(int arg0, int arg1) {
        ++field3117;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!lba", name = "JA", descriptor = "(IIIIII)I")
    public final int method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3205;
        int var7 = 0;
        float var8 = (float) arg2 * this.field3278.field7090 + (float) arg0 * this.field3278.field7132 + (float) arg1 * this.field3278.field7134 + this.field3278.field7112;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3278.field7090 + (float) arg3 * this.field3278.field7132 + (float) arg4 * this.field3278.field7134 + this.field3278.field7112;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field3322 > var8 && (float) this.field3322 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field3380 && (float) this.field3380 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3278.field7094 + (float) arg0 * this.field3278.field7140 + (float) arg1 * this.field3278.field7092 + this.field3278.field7139) * (float) this.field3350 / var8);
        int var11 = (int) (((float) arg5 * this.field3278.field7094 + (float) arg3 * this.field3278.field7140 + (float) arg4 * this.field3278.field7092 + this.field3278.field7139) * (float) this.field3350 / var9);
        if (this.field3304 > (float) var10 && this.field3304 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field3367 && (float) var11 > this.field3367) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3278.field7093 + (float) arg0 * this.field3278.field7122 + (float) arg1 * this.field3278.field7108 + this.field3278.field7119) * (float) this.field3321 / var8);
        int var13 = (int) (((float) arg5 * this.field3278.field7093 + (float) arg3 * this.field3278.field7122 + (float) arg4 * this.field3278.field7108 + this.field3278.field7119) * (float) this.field3321 / var9);
        if (this.field3343 > (float) var12 && this.field3343 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field3283 && this.field3283 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILvq;)V")
    public final void method1455(int arg0, int arg1, class500 arg2) {
        ++field3119;
        if (arg1 == -3) {
            this.method1425(false, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "(B)V")
    private final void method1456(byte arg0) {
        ++field3086;
        if (arg0 == -119) {
            if (!this.field3372) {
                float[] var2 = this.field3285;
                float var3 = (float) this.field3322;
                float var4 = (float) this.field3380;
                float var5 = (float) (-this.field3379) * this.field3290 / (float) this.field3321;
                float var6 = (float) (-this.field3307) * this.field3290 / (float) this.field3350;
                float var7 = (float) (-this.field3307 + this.field3232) * this.field3290 / (float) this.field3350;
                float var8 = (float) (-this.field3379 + this.field3201) * this.field3290 / (float) this.field3321;
                if (var6 != var7 && var5 != var8) {
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[6] = 0.0F;
                    var2[1] = 0.0F;
                    var2[14] = var3 / (-var4 + var3);
                    var2[3] = 0.0F;
                    var2[15] = 1.0F;
                    var2[13] = (var5 + var8) / (-var5 + var8);
                    var2[4] = 0.0F;
                    var2[8] = 0.0F;
                    var2[10] = 1.0F / (var3 - var4);
                    var2[5] = 2.0F / (var8 - var5);
                    var2[0] = 2.0F / (var7 - var6);
                    var2[9] = 0.0F;
                    var2[12] = (var6 + var7) / (-var7 + var6);
                    var2[11] = 0.0F;
                } else {
                    var2[8] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = 1.0F;
                    var2[13] = 0.0F;
                    var2[6] = 0.0F;
                    var2[9] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[7] = 0.0F;
                    var2[11] = 0.0F;
                    var2[4] = 0.0F;
                    var2[14] = 0.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[1] = 0.0F;
                    var2[5] = 1.0F;
                }
                this.method1422(9534);
                this.field3372 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3164;
    }

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "(I)I")
    public final int method1457(int arg0) {
        if (arg0 != 1) {
            this.method1467(false, false, 64, (byte) 61);
        }
        ++field3262;
        return this.field3360;
    }

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "(I)V")
    public final void method1458(int arg0) {
        if (arg0 < 125) {
            this.field3351 = false;
        }
        ++field3169;
        if (~this.field3325 != -17) {
            this.method1410((byte) -93);
            this.method1499(true, 3);
            this.method1480(54, true);
            this.method1479(true, 7);
            this.method1404((byte) -123, 1);
            this.field3325 = 16;
        }
    }

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "(I)V")
    public abstract void method1459(int arg0);

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "(IIIIIII)I")
    public final int method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3263;
        int var8 = 0;
        float var9 = (float) arg2 * this.field3278.field7090 + (float) arg0 * this.field3278.field7132 + (float) arg1 * this.field3278.field7134 + this.field3278.field7112;
        float var10 = (float) arg5 * this.field3278.field7090 + (float) arg3 * this.field3278.field7132 + (float) arg4 * this.field3278.field7134 + this.field3278.field7112;
        if (var9 < (float) this.field3322 && var10 < (float) this.field3322) {
            var8 |= 16;
        } else if ((float) this.field3380 < var9 && (float) this.field3380 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3278.field7094 + (float) arg0 * this.field3278.field7140 + (float) arg1 * this.field3278.field7092 + this.field3278.field7139) * (float) this.field3350 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3278.field7094 + (float) arg3 * this.field3278.field7140 + (float) arg4 * this.field3278.field7092 + this.field3278.field7139) * (float) this.field3350 / (float) arg6);
        if ((float) var11 < this.field3304 && this.field3304 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field3367 && this.field3367 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3278.field7093 + (float) arg0 * this.field3278.field7122 + (float) arg1 * this.field3278.field7108 + this.field3278.field7119) * (float) this.field3321 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3278.field7093 + (float) arg3 * this.field3278.field7122 + (float) arg4 * this.field3278.field7108 + this.field3278.field7119) * (float) this.field3321 / (float) arg6);
        if ((float) var13 < this.field3343 && (float) var14 < this.field3343) {
            var8 |= 4;
        } else if ((float) var13 > this.field3283 && this.field3283 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!lba", name = "P", descriptor = "(I)V")
    private final void method1460(int arg0) {
        this.field3402 = this.method1421(false, true);
        ++field3155;
        this.field3402.method2277(140, 28, false);
        for (int var2 = arg0; var2 < 4; ++var2) {
            Buffer var3 = this.field3402.method2276(true, false);
            if (var3 != null) {
                Stream var4 = this.method1449(14, var3);
                if (Stream.method2346()) {
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(1.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                    var4.method2340(0.0F);
                } else {
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(1.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                    var4.method2350(0.0F);
                }
                var4.method2351();
                if (this.field3402.method2281(-14567)) {
                    break;
                }
            }
        }
        this.field3404 = this.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477, class382.field5477 }) });
    }

    @OriginalMember(owner = "client!lba", name = "Q", descriptor = "(I)V")
    public abstract void method1461(int arg0);

    @OriginalMember(owner = "client!lba", name = "R", descriptor = "(I)V")
    public abstract void method1462(int arg0);

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(II)Lpm;")
    public final class614 method1463(int arg0, int arg1) {
        if (this.field3394.method1124(22913) < arg0 * 2) {
            this.field3394.method1119(arg0, -27671);
        }
        if (arg1 < 21) {
            return null;
        } else {
            ++field3236;
            return this.field3394;
        }
    }

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "(Z)V")
    public abstract void method1464(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "(Z)V")
    private final void method1465(boolean arg0) {
        if (arg0) {
            this.method1472(-30);
        }
        if (~this.field3325 != -2) {
            this.method1446(20343);
            this.method1499(false, 3);
            this.method1393(false, 0);
            this.method1480(92, false);
            this.method1479(false, 7);
            this.method1467(false, false, -2, (byte) -111);
            this.method1509(4, 1);
            this.method1492(this.field3346, 2);
            this.field3325 = 1;
        }
        ++field3211;
    }

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "(Z)Luf;")
    public final class517 method1466(boolean arg0) {
        ++field3246;
        if (!arg0) {
            this.method1509(-64, -115);
        }
        return this.field3271;
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V")
    public final void method185(int arg0) {
        ++field3127;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            if (this.field3331 != null) {
                this.field3331.method3819(-1);
            }
            this.field3365 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lba", name = "ra", descriptor = "(IIII)V")
    public final void method245(int arg0, int arg1, int arg2, int arg3) {
        this.field3360 = arg0;
        this.field3348 = arg1;
        ++field3093;
        this.field3333 = arg2;
        this.field3303 = arg3;
        this.field3316 = true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZZIB)V")
    public final void method1467(boolean arg0, boolean arg1, int arg2, byte arg3) {
        ++field3225;
        if (~this.field3299 != ~arg2 || this.field3329 != this.field3316) {
            class28 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field3316 ? 0 : 3;
            if (arg2 < 0) {
                this.method1377(true);
            } else {
                var5 = this.field3331.method3823(arg2, -50);
                class744 var10 = super.field6556.method581(-21732, arg2);
                if (var10.field10259 == 0 && var10.field10268 == 0) {
                    this.method1377(true);
                } else {
                    int var11 = !var10.field10265 ? 128 : 64;
                    int var12 = var11 * 50;
                    class517 var13 = this.method1470(62);
                    var13.method3092(0.0F, 106, (float) (this.field3373 % var12 * var10.field10268) / (float) var12, (float) (this.field3373 % var12 * var10.field10259) / (float) var12);
                    this.method1475(115, class304.field4414);
                }
                if (!this.field3316) {
                    var8 = var10.field10267;
                    var7 = var10.field10257;
                    var9 = var10.field10273;
                }
                var6 = var10.field10256;
            }
            this.method1418(arg1, var8, -103, var9, arg0, var7);
            if (this.field3308 == null) {
                this.method1492(var5, 2);
                this.method1509(4, var6);
            } else {
                this.field3308.method433(-1, var6, var5);
            }
            this.field3299 = arg2;
            this.field3329 = this.field3316;
        }
        this.field3325 &= -8;
        int var14 = -107 / ((arg3 - 20) / 59);
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(BI)V")
    public final void method1468(byte arg0, int arg1) {
        if (this.field3357 != arg1) {
            this.field3357 = arg1;
            this.method1413(false);
        }
        if (arg0 != 67) {
            this.method1444(-24);
        }
        ++field3123;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZIZLvq;Z)V")
    public abstract void method1469(boolean arg0, int arg1, boolean arg2, class500 arg3, boolean arg4);

    @OriginalMember(owner = "client!lba", name = "S", descriptor = "(I)Luf;")
    public final class517 method1470(int arg0) {
        if (arg0 < 44) {
            return null;
        } else {
            ++field3178;
            return this.field3330[this.field3289];
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([I)V")
    public final void method218(int[] arg0) {
        arg0[0] = this.field3232;
        ++field3240;
        arg0[1] = this.field3201;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILdaa;Z)V")
    private final void method1471(int arg0, class453 arg1, boolean arg2) {
        if (arg2) {
            this.method143();
        }
        this.method1386((byte) -107, this.field3402, 0);
        ++field3237;
        this.method1485(this.field3404, 32);
        this.method1403(126, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!lba", name = "T", descriptor = "(I)V")
    public final void method1472(int arg0) {
        ++field3272;
        if (arg0 != 0) {
            this.method1405((byte) -101);
        }
        this.method1397(-120);
        this.method1496(false);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(IB)V")
    public final void method1473(int arg0, byte arg1) {
        ++field3124;
        if (arg1 < 11) {
            this.method1424(-126);
        }
        if (~this.field3289 != ~arg0) {
            this.field3289 = arg0;
            this.method1459(64);
        }
    }

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "()Z")
    public final boolean method223() {
        ++field3126;
        return false;
    }

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "()Loo;")
    public final class12 method159() {
        ++field3274;
        return new class517();
    }

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "(B)F")
    public abstract float method1474(byte arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILoja;)V")
    public final void method1475(int arg0, class124 arg1) {
        this.field3332[this.field3289] = arg1;
        ++field3099;
        if (arg0 <= 35) {
            this.field3278 = null;
        }
        this.method1405((byte) -126);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(Z)V")
    public final void method239(boolean arg0) {
        ++field3175;
    }

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "(B)V")
    public void method1476(byte arg0) {
        ++field3235;
        this.method1505(false);
        int var2 = 43 % ((arg0 - 37) / 63);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIF)Lsca;")
    public final class251 method138(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3141;
        return new class153(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "()V")
    public void method205() {
        ++field3091;
        if (!this.field3338) {
            for (class69 var1 = this.field3144.method1041(1048832); var1 != null; var1 = this.field3144.method1033(-1)) {
                ((class672) var1).method3834(-115);
            }
            Enumeration var2 = this.field3131.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1497(this.field3131.get(var3), var3, false);
            }
            class153.method1003(false, -2, true);
            this.field3196.release();
            this.field3338 = true;
        }
    }

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field3159;
    }

    @OriginalMember(owner = "client!lba", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3270;
        boolean var7 = ~this.field3287 != ~arg0;
        if (var7 || this.field3358 != arg1 || this.field3309 != arg2) {
            this.field3358 = arg1;
            this.field3309 = arg2;
            this.field3287 = arg0;
            if (var7) {
                this.field3323 = (float) (this.field3287 & 65280) / 65280.0F;
                this.field3305 = (float) (16711680 & this.field3287) / 1.671168E7F;
                this.field3375 = (float) (255 & this.field3287) / 255.0F;
                this.method1504((byte) 48);
            }
            this.field3196.setSunColour(this.field3305, this.field3323, this.field3375, arg1, arg2);
            this.method1484(0);
        }
        if (this.field3298[0] != arg3 || this.field3298[1] != arg4 || this.field3298[2] != arg5) {
            this.field3298[2] = arg5;
            this.field3298[1] = arg4;
            this.field3298[0] = arg3;
            this.field3293[2] = -arg5;
            this.field3293[0] = -arg3;
            this.field3293[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3314[1] = arg4 * var8;
            this.field3314[0] = arg3 * var8;
            this.field3314[2] = arg5 * var8;
            this.field3382[1] = -this.field3314[1];
            this.field3382[2] = -this.field3314[2];
            this.field3382[0] = -this.field3314[0];
            this.field3196.setSunDirection(this.field3314[0], this.field3314[1], this.field3314[2]);
            this.method1437(12093);
            this.field3286 = (int) (arg3 * 256.0F / arg4);
            this.field3324 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1462(99);
    }

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "()I")
    public final int method241() {
        ++field3162;
        return this.field3322;
    }

    @OriginalMember(owner = "client!lba", name = "U", descriptor = "(I)V")
    private final void method1477(int arg0) {
        this.method1386((byte) -125, this.field3386, arg0);
        ++field3228;
        this.method1485(this.field3390, 32);
        this.method1403(126, class219.field2999, 0, 1);
    }

    @OriginalMember(owner = "client!lba", name = "V", descriptor = "(I)V")
    public abstract void method1478(int arg0);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(ZI)V")
    public final void method1479(boolean arg0, int arg1) {
        ++field3163;
        if (arg1 != 7) {
            this.method214();
        }
        if (!this.field3327 == arg0) {
            this.field3327 = arg0;
            this.method1392(arg1 ^ 23319);
            this.field3325 &= -32;
        }
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)V")
    public final void method237(int arg0) {
        ++field3147;
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(IZ)V")
    public final void method1480(int arg0, boolean arg1) {
        ++field3156;
        if (!arg1 != !this.field3345) {
            this.field3345 = arg1;
            this.method1424(6048);
            this.field3325 &= -32;
        }
        if (arg0 <= 52) {
            this.method208();
        }
    }

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "(Z)V")
    public abstract void method1481(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "W", descriptor = "(I)V")
    public abstract void method1482(int arg0);

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(IIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3183;
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
        if (this.method1391((float) arg3 + var8, (float) arg2 + var9, (float) arg0, (float) arg1, 0.0F, 0.0F, -25)) {
            this.method1465(false);
            this.method1468((byte) 67, arg4);
            this.method1409(class41.field423, 0, -123);
            this.method1455(0, -3, class41.field423);
            this.method1404((byte) -120, arg5);
            this.method1498(true);
            this.method1441((byte) -109, false);
            this.method1477(0);
            this.method1441((byte) -68, true);
            this.method1455(0, -3, class157.field2039);
            this.method1409(class157.field2039, 0, -128);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "([BLpb;ZIIIZI)Lbw;")
    public abstract class28 method1483(byte[] arg0, class2 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "()Z")
    public final boolean method175() {
        ++field3188;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[Lsca;)V")
    public final void method163(int arg0, class251[] arg1) {
        ++field3189;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field3352[var3] = arg1[var3];
        }
        this.field3344 = arg0;
        if (this.field3354.method2443((byte) -65)) {
            this.method1427(3);
        }
    }

    @OriginalMember(owner = "client!lba", name = "Y", descriptor = "(I)V")
    public abstract void method1484(int arg0);

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lbfa;I)V")
    public abstract void method1485(class262 arg0, int arg1);

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "(B)I")
    public final int method1486(byte arg0) {
        if (arg0 < 35) {
            this.method170(95);
        }
        ++field3210;
        return this.field3289;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lae;II)V")
    public class223(Canvas arg0, Object arg1, class101 arg2, class283 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field3342 = arg4;
            this.field3112 = arg3;
            this.field3252 = this.field3116 = arg1;
            this.field3138 = this.field3161 = arg0;
            Dimension var7 = arg0.getSize();
            this.field3232 = this.field3130 = var7.width;
            this.field3326 = arg5;
            this.field3201 = this.field3181 = var7.height;
            class691.method3920(true, false, -94557789);
            if (super.field6556 != null) {
                this.field3331 = new class669(this, super.field6556);
                this.field3196 = new NativeInterface(super.field6556.method580(-31778), this.field3326);
                for (int var8 = 0; var8 < super.field6556.method580(-31778); ++var8) {
                    class744 var9 = super.field6556.method581(-21732, var8);
                    if (var9 != null) {
                        this.field3196.initTextureMetrics(var8, var9.field10269, var9.field10262);
                    }
                }
            } else {
                this.field3196 = new NativeInterface(0, this.field3326);
                this.field3331 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method2821((byte) 102);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lba", name = "Z", descriptor = "(I)Lfp;")
    public final class596 method1487(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3154;
            return this.field3288 == null ? null : this.field3288.method3440(-122);
        }
    }

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "(B)V")
    private final void method1488(byte arg0) {
        this.field3294 = false;
        ++field3197;
        if (class392.field5578 == this.field3354) {
            this.method1395(-126);
            this.method1496(false);
        }
        if (arg0 <= 30) {
            this.method204(-74, -7, (int[][]) null, (int[][]) null, 6, 95, -89);
        }
    }

    @OriginalMember(owner = "client!lba", name = "A", descriptor = "(ILaa;II)V")
    public final void method176(int arg0, class87 arg1, int arg2, int arg3) {
        ++field3170;
        class592 var5 = (class592) arg1;
        class28 var6 = var5.field8340;
        this.method1398(90);
        this.method1492(var6, 2);
        this.method1404((byte) -119, 1);
        this.method1494(class92.field1073, 775, class92.field1073);
        this.method1409(class41.field423, 0, -123);
        this.method1468((byte) 67, arg0);
        this.field3271.method3096((float) this.field3232, (float) this.field3201, 0.0F, -9950);
        this.method1428(0);
        this.field3330[0].method3096(var6.method126((float) this.field3232, 5263), var6.method128((float) this.field3201, true), 1.0F, -9950);
        this.field3330[0].method3072(8929, 0.0F, var6.method126((float) (-arg2), 5263), var6.method128((float) (-arg3), true));
        this.field3332[0] = class304.field4414;
        this.method1405((byte) 53);
        this.method1400(2);
        this.method1377(true);
        this.method1409(class157.field2039, 0, -116);
    }

    @OriginalMember(owner = "client!lba", name = "da", descriptor = "(III[I)V")
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3167;
        float var5 = this.field3278.method3083((float) arg1, (float) arg2, (float) arg0, (byte) 101);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3307;
            var7 = this.field3379;
        } else {
            var6 = (int) ((float) this.field3350 * this.field3278.method3075((float) arg2, (float) arg1, (byte) -32, (float) arg0) / var5);
            var7 = (int) ((float) this.field3321 * this.field3278.method3089((float) arg1, (float) arg2, (float) arg0, (byte) 104) / var5);
        }
        arg3[1] = (int) ((float) var7 + -this.field3343);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var6 - this.field3304);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3190;
    }

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "(Z)V")
    public abstract void method1489(boolean arg0);

    @OriginalMember(owner = "client!lba", name = "ab", descriptor = "(I)V")
    private final void method1490(int arg0) {
        if (arg0 == 0) {
            this.field3378 = false;
            ++field3083;
            if (this.field3308 != null) {
                this.field3308.method428(true);
            }
            this.method1482(arg0 ^ -122);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Loea;ILpb;)Z")
    public abstract boolean method1491(class612 arg0, int arg1, class2 arg2);

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(IIIIII)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3207;
        float var7 = this.method1474((byte) -114);
        this.method1465(false);
        this.method1468((byte) 67, arg4);
        this.method1409(class41.field423, 0, -107);
        this.method1455(0, -3, class41.field423);
        this.method1404((byte) -127, arg5);
        this.field3271.method3096((float) (arg2 + -1), (float) (arg3 + -1), 1.0F, -9950);
        this.field3271.method3072(8929, 0.0F, (float) arg0 + -var7, (float) arg1 + -var7);
        this.method1428(0);
        this.method1441((byte) -40, false);
        this.method1471(4, class657.field9269, false);
        this.method1441((byte) -44, true);
        this.method1455(0, -3, class157.field2039);
        this.method1409(class157.field2039, 0, -109);
    }

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "()I")
    public final int method181() {
        ++field3245;
        return this.field3277 + this.field3276 + this.field3273;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lml;I)V")
    public final void method1492(class34 arg0, int arg1) {
        if (arg1 != 2) {
            this.field3391 = null;
        }
        if (this.field3381[this.field3289] != arg0) {
            this.field3381[this.field3289] = arg0;
            if (arg0 == null) {
                this.method1481(true);
            } else {
                arg0.method279(15320);
            }
            this.field3325 &= -2;
        }
        ++field3230;
    }

    @OriginalMember(owner = "client!lba", name = "z", descriptor = "()Z")
    public final boolean method156() {
        ++field3203;
        return true;
    }

    @OriginalMember(owner = "client!lba", name = "bb", descriptor = "(I)V")
    private final void method1493(int arg0) {
        this.field3343 = (float) (-this.field3379 + this.field3315);
        this.field3304 = (float) (-this.field3307 + this.field3374);
        ++field3160;
        this.field3367 = (float) (this.field3339 - this.field3307);
        this.field3283 = (float) (-this.field3379 + this.field3371);
        if (arg0 != 7233) {
            this.field3297 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3233;
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
        this.method1465(false);
        this.method1468((byte) 67, arg4);
        this.method1409(class41.field423, 0, -125);
        this.method1455(0, -3, class41.field423);
        this.method1404((byte) -128, arg5);
        this.method1498(true);
        int var14 = arg8 % (arg7 - -arg6);
        this.method1441((byte) -28, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (var14 <= arg6) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var18 = (float) (-var14 + arg6 + arg7) * var11;
            var17 = (float) (arg6 + arg7 - var14) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 <= arg0) {
                if ((float) arg2 > var21) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 >= arg3) {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method1391(var20 + var22, var19 + var21, var21, var22, 0.0F, 0.0F, -25)) {
                return;
            }
            var21 += var19 + var23;
            this.method1477(0);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method1441((byte) -93, true);
        this.method1455(0, -3, class157.field2039);
        this.method1409(class157.field2039, 0, -115);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lsi;ILsi;)V")
    public final void method1494(class769 arg0, int arg1, class769 arg2) {
        if (arg1 != 775) {
            field3090 = null;
        }
        ++field3137;
        boolean var4 = false;
        if (this.field3302[this.field3289] != arg0) {
            this.field3302[this.field3289] = arg0;
            this.method1445((byte) 68);
            var4 = true;
        }
        if (this.field3366[this.field3289] != arg2) {
            this.field3366[this.field3289] = arg2;
            this.method1426(8);
            var4 = true;
        }
        if (var4) {
            this.field3325 &= -30;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lpb;ILoea;BI)Lbw;")
    public abstract class28 method1495(class2 arg0, int arg1, class612 arg2, byte arg3, int arg4);

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "(Z)V")
    private final void method1496(boolean arg0) {
        this.method1464(!arg0);
        ++field3098;
        if (this.field3308 != null) {
            this.field3308.method431(-1);
        }
        if (arg0) {
            this.method242(83, 7, 122, 66);
        }
    }

    @OriginalMember(owner = "client!lba", name = "U", descriptor = "(IIIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3148;
        this.method139(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method168(Canvas arg0) {
        ++field3153;
        if (this.field3161 == arg0) {
            throw new RuntimeException();
        } else if (this.field3131.containsKey(arg0)) {
            this.method1497(this.field3131.get(arg0), arg0, false);
            this.field3131.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public abstract void method1497(Object arg0, Canvas arg1, boolean arg2);

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "(Z)V")
    public final void method1498(boolean arg0) {
        ++field3192;
        this.field3271.method42();
        this.field3275 = arg0;
        this.method1450((byte) 30);
    }

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "(I)V")
    public final void method180(int arg0) {
        ++field3213;
    }

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "()I")
    public final int method214() {
        ++field3084;
        return this.field3407;
    }

    @OriginalMember(owner = "client!lba", name = "xa", descriptor = "(F)V")
    public final void method202(float arg0) {
        ++field3186;
        if (this.field3359 != arg0) {
            this.field3359 = arg0;
            this.field3196.setAmbient(arg0);
            this.method1504((byte) 48);
            this.method1462(90);
        }
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(ZI)V")
    public final void method1499(boolean arg0, int arg1) {
        if (arg1 == 3) {
            ++field3227;
            if (!arg0 == this.field3351) {
                this.field3351 = arg0;
                this.method1419(false);
                this.field3325 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "cb", descriptor = "(I)Luf;")
    public final class517 method1500(int arg0) {
        ++field3179;
        if (arg0 != 15720) {
            this.field3308 = null;
        }
        return this.field3330[this.field3289];
    }

    @OriginalMember(owner = "client!lba", name = "db", descriptor = "(I)V")
    private final void method1501(int arg0) {
        this.field3376[14] = this.field3310;
        ++field3193;
        this.field3376[10] = this.field3335;
        this.field3336 = (this.field3376[14] + (float) (-this.field3380)) / this.field3376[10];
        if (arg0 != 7440) {
            this.method1459(-104);
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method155(Canvas arg0) {
        this.field3138 = null;
        this.field3252 = null;
        ++field3110;
        if (arg0 != null && this.field3161 != arg0) {
            if (this.field3131.containsKey(arg0)) {
                this.field3252 = this.field3131.get(arg0);
                this.field3138 = arg0;
            }
        } else {
            this.field3252 = this.field3116;
            this.field3138 = this.field3161;
        }
        if (this.field3138 != null && this.field3252 != null) {
            this.method1431(this.field3252, this.field3138, (byte) -119);
            this.method1503(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "(BZ)V")
    public final void method1502(byte arg0, boolean arg1) {
        if (this.field3300 == !arg1) {
            this.field3300 = arg1;
            this.method1415(79);
        }
        int var3 = -44 % ((arg0 - 57) / 62);
        ++field3241;
    }

    @OriginalMember(owner = "client!lba", name = "eb", descriptor = "(I)V")
    private final void method1503(int arg0) {
        if (this.field3138 != null) {
            Dimension var2 = this.field3138.getSize();
            this.field3130 = var2.width;
            this.field3181 = var2.height;
        } else {
            this.field3130 = this.field3181 = 1;
        }
        ++field3109;
        this.field3201 = this.field3181;
        this.field3232 = this.field3130;
        this.method1488((byte) 38);
        this.method1506(53);
        this.method1382(0);
        if (arg0 == 1) {
            this.method1478(0);
            this.method1493(7233);
            this.method1397(-127);
            this.method208();
        }
    }

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "(B)V")
    public abstract void method1504(byte arg0);

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "(Z)V")
    private final void method1505(boolean arg0) {
        this.method1504((byte) 48);
        ++field3219;
        this.method1484(0);
        this.method1415(98);
        this.method1427(3);
        this.method1437(12093);
        this.method1462(97);
        this.method1508(-125);
        this.method1424(6048);
        this.method1392(23312);
        this.method1419(false);
        this.method1420((byte) -108);
        this.method1451((byte) -100);
        this.method1461(-98);
        this.method1394(-126);
        for (int var2 = this.field3361 + -1; var2 >= 0; --var2) {
            this.method1473(var2, (byte) 119);
            this.method1445((byte) 79);
            this.method1426(8);
            this.method1377(true);
        }
        this.method1413(false);
        this.method1478(0);
        this.method1464(!arg0);
        this.method1489(arg0);
        this.method1482(-127);
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lhda;I)V")
    public final void method134(class714 arg0, int arg1) {
        ++field3257;
        this.field3297.method695(74, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!lba", name = "fb", descriptor = "(I)V")
    private final void method1506(int arg0) {
        ++field3089;
        this.field3317 = false;
        if (arg0 > 51) {
            this.method1440(1);
            if (class748.field10335 == this.field3354) {
                this.method1496(false);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIZIII[I)Lbw;")
    public abstract class28 method1507(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6);

    @OriginalMember(owner = "client!lba", name = "gb", descriptor = "(I)V")
    public abstract void method1508(int arg0);

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "([I)V")
    public final void method160(int[] arg0) {
        ++field3149;
        arg0[1] = this.field3315;
        arg0[0] = this.field3374;
        arg0[2] = this.field3339;
        arg0[3] = this.field3371;
    }

    @OriginalMember(owner = "client!lba", name = "C", descriptor = "(Z)V")
    public final void method211(boolean arg0) {
        this.field3337 = arg0;
        ++field3249;
        this.method1392(23312);
    }

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "(II)V")
    public final void method1509(int arg0, int arg1) {
        if (~arg1 == -2) {
            this.method1494(class92.field1073, 775, class92.field1073);
        } else if (~arg1 != -1) {
            if (~arg1 == -3) {
                this.method1494(class495.field6817, 775, class92.field1073);
            } else if (arg1 != 3) {
                if (arg1 == 4) {
                    this.method1494(class202.field2835, 775, class202.field2835);
                }
            } else {
                this.method1494(class587.field8280, 775, class785.field10763);
            }
        } else {
            this.method1494(class785.field10763, 775, class785.field10763);
        }
        ++field3224;
        if (arg0 != 4) {
            this.field3387 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "(B)V")
    private final void method1510(byte arg0) {
        this.field3387 = this.method1421(false, true);
        ++field3248;
        this.field3387.method2277(3096, 12, false);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field3387.method2276(true, false);
            if (var3 != null) {
                Stream var4 = this.method1449(14, var3);
                var4.method2340(0.0F);
                var4.method2340(0.0F);
                var4.method2340(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method2346()) {
                        var4.method2340(var9);
                        var4.method2340(var8);
                        var4.method2340(0.0F);
                    } else {
                        var4.method2350(var9);
                        var4.method2350(var8);
                        var4.method2350(0.0F);
                    }
                }
                var4.method2351();
                if (this.field3387.method2281(-14567)) {
                    break;
                }
            }
        }
        this.field3392 = this.method1406((byte) 6, new class435[] { new class435(class382.field5466) });
        if (arg0 != 93) {
            this.field3353 = -97;
        }
    }

    @OriginalMember(owner = "client!lba", name = "pa", descriptor = "()V")
    public final void method244() {
        this.field3316 = false;
        ++field3168;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3223;
    }
}
