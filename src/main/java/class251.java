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

@OriginalClass("client!sr")
public abstract class class251 extends class58 {

    @OriginalMember(owner = "client!sr", name = "dd", descriptor = "Lbg;")
    private class464 field3473 = new class464();

    @OriginalMember(owner = "client!sr", name = "Vd", descriptor = "Z")
    public boolean field3517 = true;

    @OriginalMember(owner = "client!sr", name = "ce", descriptor = "Lofa;")
    public class328 field3524 = new class328();

    @OriginalMember(owner = "client!sr", name = "ee", descriptor = "Lofa;")
    public class328 field3526 = new class328();

    @OriginalMember(owner = "client!sr", name = "ge", descriptor = "Lofa;")
    public class328 field3528 = new class328();

    @OriginalMember(owner = "client!sr", name = "he", descriptor = "Lofa;")
    public class328 field3529 = new class328();

    @OriginalMember(owner = "client!sr", name = "ie", descriptor = "Lofa;")
    private class328 field3530 = new class328();

    @OriginalMember(owner = "client!sr", name = "je", descriptor = "Lofa;")
    private class328 field3531 = new class328();

    @OriginalMember(owner = "client!sr", name = "le", descriptor = "Z")
    private boolean field3533 = false;

    @OriginalMember(owner = "client!sr", name = "Ae", descriptor = "Z")
    private boolean field3548 = false;

    @OriginalMember(owner = "client!sr", name = "qe", descriptor = "Z")
    public boolean field3538 = false;

    @OriginalMember(owner = "client!sr", name = "Ce", descriptor = "Z")
    public boolean field3550 = true;

    @OriginalMember(owner = "client!sr", name = "Qe", descriptor = "I")
    public int field3564 = 0;

    @OriginalMember(owner = "client!sr", name = "Xe", descriptor = "I")
    public int field3571 = 0;

    @OriginalMember(owner = "client!sr", name = "we", descriptor = "I")
    public int field3544 = 512;

    @OriginalMember(owner = "client!sr", name = "De", descriptor = "Lpw;")
    public class705 field3551 = class557.field7810;

    @OriginalMember(owner = "client!sr", name = "Ye", descriptor = "I")
    private int field3572 = 0;

    @OriginalMember(owner = "client!sr", name = "Ze", descriptor = "Z")
    public boolean field3573 = false;

    @OriginalMember(owner = "client!sr", name = "Ve", descriptor = "[F")
    public float[] field3569 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sr", name = "ne", descriptor = "I")
    private int field3535 = -1;

    @OriginalMember(owner = "client!sr", name = "He", descriptor = "Ltia;")
    public class266 field3555 = class8.field124;

    @OriginalMember(owner = "client!sr", name = "Me", descriptor = "I")
    public int field3560 = 3584;

    @OriginalMember(owner = "client!sr", name = "tf", descriptor = "Z")
    private boolean field3592 = false;

    @OriginalMember(owner = "client!sr", name = "Ie", descriptor = "I")
    private int field3556 = 0;

    @OriginalMember(owner = "client!sr", name = "Ke", descriptor = "[F")
    private float[] field3558 = new float[16];

    @OriginalMember(owner = "client!sr", name = "gf", descriptor = "F")
    public float field3580 = -1.0F;

    @OriginalMember(owner = "client!sr", name = "oe", descriptor = "I")
    private int field3536 = 0;

    @OriginalMember(owner = "client!sr", name = "xf", descriptor = "Z")
    public boolean field3596 = false;

    @OriginalMember(owner = "client!sr", name = "re", descriptor = "I")
    public int field3539 = 512;

    @OriginalMember(owner = "client!sr", name = "te", descriptor = "F")
    public float field3541 = 3584.0F;

    @OriginalMember(owner = "client!sr", name = "of", descriptor = "I")
    private int field3587 = -1;

    @OriginalMember(owner = "client!sr", name = "ye", descriptor = "[F")
    public float[] field3546 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!sr", name = "me", descriptor = "I")
    public int field3534 = 0;

    @OriginalMember(owner = "client!sr", name = "ff", descriptor = "F")
    public float field3579 = -1.0F;

    @OriginalMember(owner = "client!sr", name = "We", descriptor = "F")
    public float field3570 = 3584.0F;

    @OriginalMember(owner = "client!sr", name = "Se", descriptor = "Z")
    public boolean field3566 = true;

    @OriginalMember(owner = "client!sr", name = "xe", descriptor = "I")
    public int field3545 = 0;

    @OriginalMember(owner = "client!sr", name = "Cf", descriptor = "I")
    public int field3601 = 0;

    @OriginalMember(owner = "client!sr", name = "Ff", descriptor = "F")
    public float field3604 = 1.0F;

    @OriginalMember(owner = "client!sr", name = "ve", descriptor = "I")
    public int field3543 = 128;

    @OriginalMember(owner = "client!sr", name = "Uf", descriptor = "I")
    public int field3619 = 0;

    @OriginalMember(owner = "client!sr", name = "uf", descriptor = "Z")
    public boolean field3593 = false;

    @OriginalMember(owner = "client!sr", name = "yf", descriptor = "F")
    public float field3597 = 1.0F;

    @OriginalMember(owner = "client!sr", name = "Rf", descriptor = "I")
    private int field3616 = 1;

    @OriginalMember(owner = "client!sr", name = "lf", descriptor = "Z")
    private boolean field3584 = false;

    @OriginalMember(owner = "client!sr", name = "Oe", descriptor = "I")
    public int field3562 = 50;

    @OriginalMember(owner = "client!sr", name = "Vf", descriptor = "I")
    private int field3620 = 16777215;

    @OriginalMember(owner = "client!sr", name = "df", descriptor = "[F")
    private float[] field3577 = new float[16];

    @OriginalMember(owner = "client!sr", name = "Gf", descriptor = "I")
    public int field3605 = 0;

    @OriginalMember(owner = "client!sr", name = "Ue", descriptor = "I")
    private int field3568 = -1;

    @OriginalMember(owner = "client!sr", name = "Xf", descriptor = "I")
    public int field3622 = 0;

    @OriginalMember(owner = "client!sr", name = "bg", descriptor = "[F")
    private float[] field3626 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!sr", name = "Sf", descriptor = "F")
    public float field3617 = 1.0F;

    @OriginalMember(owner = "client!sr", name = "Fe", descriptor = "[F")
    public float[] field3553 = this.field3626;

    @OriginalMember(owner = "client!sr", name = "Je", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!sr", name = "Of", descriptor = "[Lraa;")
    private class606[] field3613 = new class606[10];

    @OriginalMember(owner = "client!sr", name = "Ne", descriptor = "I")
    public int field3561 = 0;

    @OriginalMember(owner = "client!sr", name = "wf", descriptor = "F")
    private float field3595 = 1.0F;

    @OriginalMember(owner = "client!sr", name = "Zf", descriptor = "F")
    public float field3624 = 1.0F;

    @OriginalMember(owner = "client!sr", name = "gg", descriptor = "Z")
    public boolean field3631 = true;

    @OriginalMember(owner = "client!sr", name = "vf", descriptor = "I")
    public int field3594 = 8;

    @OriginalMember(owner = "client!sr", name = "sf", descriptor = "I")
    public int field3591 = -1;

    @OriginalMember(owner = "client!sr", name = "pf", descriptor = "Z")
    private boolean field3588 = false;

    @OriginalMember(owner = "client!sr", name = "cf", descriptor = "Z")
    private boolean field3576 = false;

    @OriginalMember(owner = "client!sr", name = "fg", descriptor = "[F")
    private float[] field3630 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sr", name = "Tf", descriptor = "[F")
    private float[] field3618 = new float[16];

    @OriginalMember(owner = "client!sr", name = "cg", descriptor = "I")
    public int field3627 = -1;

    @OriginalMember(owner = "client!sr", name = "eg", descriptor = "Z")
    public boolean field3629 = true;

    @OriginalMember(owner = "client!sr", name = "ag", descriptor = "I")
    public int field3625 = 3;

    @OriginalMember(owner = "client!sr", name = "hg", descriptor = "[F")
    private float[] field3632 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!sr", name = "nf", descriptor = "I")
    public int field3586 = 0;

    @OriginalMember(owner = "client!sr", name = "hf", descriptor = "Z")
    public boolean field3581 = true;

    @OriginalMember(owner = "client!sr", name = "Mf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3611 = new Stream();

    @OriginalMember(owner = "client!sr", name = "mg", descriptor = "Lofa;")
    private class328 field3637 = new class328();

    @OriginalMember(owner = "client!sr", name = "Kc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field3454;

    @OriginalMember(owner = "client!sr", name = "ob", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3380;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "Ljava/lang/Object;")
    public Object field3339;

    @OriginalMember(owner = "client!sr", name = "Pc", descriptor = "Ljava/lang/Object;")
    private Object field3459;

    @OriginalMember(owner = "client!sr", name = "af", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!sr", name = "Id", descriptor = "Lfp;")
    public class323 field3504;

    @OriginalMember(owner = "client!sr", name = "Af", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!sr", name = "xd", descriptor = "I")
    private int field3493;

    @OriginalMember(owner = "client!sr", name = "sb", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!sr", name = "ub", descriptor = "I")
    private int field3386;

    @OriginalMember(owner = "client!sr", name = "Ub", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!sr", name = "yd", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field3494;

    @OriginalMember(owner = "client!sr", name = "Nf", descriptor = "Ler;")
    private class106 field3612;

    @OriginalMember(owner = "client!sr", name = "db", descriptor = "Leh;")
    public static class360 field3369 = new class360();

    @OriginalMember(owner = "client!sr", name = "pc", descriptor = "I")
    public static int field3433 = 0;

    @OriginalMember(owner = "client!sr", name = "ke", descriptor = "F")
    public float field3532;

    @OriginalMember(owner = "client!sr", name = "Ge", descriptor = "F")
    public float field3554;

    @OriginalMember(owner = "client!sr", name = "mf", descriptor = "F")
    private float field3585;

    @OriginalMember(owner = "client!sr", name = "zf", descriptor = "F")
    public float field3598;

    @OriginalMember(owner = "client!sr", name = "Hf", descriptor = "F")
    public float field3606;

    @OriginalMember(owner = "client!sr", name = "If", descriptor = "F")
    private float field3607;

    @OriginalMember(owner = "client!sr", name = "Wf", descriptor = "F")
    public float field3621;

    @OriginalMember(owner = "client!sr", name = "Yf", descriptor = "F")
    public float field3623;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!sr", name = "Q", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!sr", name = "S", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!sr", name = "T", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!sr", name = "U", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!sr", name = "V", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!sr", name = "W", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!sr", name = "X", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!sr", name = "Y", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!sr", name = "Z", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!sr", name = "ab", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!sr", name = "bb", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!sr", name = "cb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sr", name = "eb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!sr", name = "fb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sr", name = "gb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sr", name = "hb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sr", name = "ib", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!sr", name = "jb", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!sr", name = "kb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!sr", name = "lb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!sr", name = "mb", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!sr", name = "nb", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!sr", name = "pb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!sr", name = "rb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!sr", name = "tb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!sr", name = "vb", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!sr", name = "wb", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!sr", name = "xb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!sr", name = "yb", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!sr", name = "zb", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!sr", name = "Ab", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sr", name = "Bb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sr", name = "Cb", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!sr", name = "Db", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!sr", name = "Eb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!sr", name = "Fb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!sr", name = "Gb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!sr", name = "Ib", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sr", name = "Jb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!sr", name = "Kb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!sr", name = "Lb", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!sr", name = "Mb", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!sr", name = "Nb", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!sr", name = "Ob", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!sr", name = "Pb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!sr", name = "Qb", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sr", name = "Sb", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sr", name = "Tb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sr", name = "Vb", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!sr", name = "Wb", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!sr", name = "Xb", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!sr", name = "Yb", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!sr", name = "ac", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!sr", name = "bc", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!sr", name = "cc", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!sr", name = "dc", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!sr", name = "ec", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!sr", name = "fc", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!sr", name = "gc", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!sr", name = "hc", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!sr", name = "ic", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!sr", name = "jc", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!sr", name = "kc", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!sr", name = "lc", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!sr", name = "mc", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!sr", name = "nc", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!sr", name = "oc", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!sr", name = "qc", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!sr", name = "rc", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!sr", name = "sc", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!sr", name = "tc", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!sr", name = "uc", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!sr", name = "vc", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!sr", name = "wc", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!sr", name = "xc", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!sr", name = "yc", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!sr", name = "zc", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!sr", name = "Ac", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!sr", name = "Bc", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!sr", name = "Cc", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!sr", name = "Dc", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!sr", name = "Ec", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!sr", name = "Fc", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!sr", name = "Gc", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!sr", name = "Hc", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!sr", name = "Ic", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!sr", name = "Jc", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!sr", name = "Lc", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!sr", name = "Mc", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!sr", name = "Nc", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!sr", name = "Oc", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!sr", name = "Qc", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!sr", name = "Rc", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!sr", name = "Sc", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!sr", name = "Tc", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!sr", name = "Uc", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!sr", name = "Vc", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sr", name = "Wc", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!sr", name = "Xc", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sr", name = "Yc", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!sr", name = "Zc", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!sr", name = "ad", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sr", name = "bd", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!sr", name = "cd", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!sr", name = "ed", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!sr", name = "fd", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!sr", name = "gd", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sr", name = "hd", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!sr", name = "id", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sr", name = "jd", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sr", name = "kd", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!sr", name = "ld", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!sr", name = "md", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!sr", name = "nd", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!sr", name = "od", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!sr", name = "pd", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sr", name = "qd", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!sr", name = "rd", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!sr", name = "sd", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sr", name = "td", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sr", name = "ud", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!sr", name = "vd", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sr", name = "wd", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sr", name = "zd", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sr", name = "Ad", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sr", name = "Bd", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sr", name = "Cd", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sr", name = "Dd", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sr", name = "Ed", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!sr", name = "Fd", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sr", name = "Gd", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sr", name = "Hd", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!sr", name = "Jd", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!sr", name = "Kd", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!sr", name = "Ld", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sr", name = "Md", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!sr", name = "Nd", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!sr", name = "Od", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!sr", name = "Pd", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!sr", name = "Qd", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!sr", name = "Rd", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!sr", name = "Sd", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!sr", name = "Td", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!sr", name = "Ud", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!sr", name = "Wd", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!sr", name = "Xd", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!sr", name = "Yd", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!sr", name = "Zd", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!sr", name = "ae", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!sr", name = "be", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!sr", name = "de", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!sr", name = "fe", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!sr", name = "ue", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!sr", name = "ze", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!sr", name = "Te", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!sr", name = "ef", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!sr", name = "qf", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!sr", name = "Bf", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!sr", name = "Df", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!sr", name = "Jf", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!sr", name = "Lf", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!sr", name = "Qf", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!sr", name = "Fg", descriptor = "I")
    private int field3656;

    @OriginalMember(owner = "client!sr", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!sr", name = "Ee", descriptor = "Lbm;")
    private class112 field3552;

    @OriginalMember(owner = "client!sr", name = "dg", descriptor = "Lma;")
    public class12 field3628;

    @OriginalMember(owner = "client!sr", name = "lg", descriptor = "Lada;")
    private class161 field3636;

    @OriginalMember(owner = "client!sr", name = "sg", descriptor = "Lada;")
    private class161 field3643;

    @OriginalMember(owner = "client!sr", name = "Dg", descriptor = "Lada;")
    private class161 field3654;

    @OriginalMember(owner = "client!sr", name = "Rb", descriptor = "Lvj;")
    public static class441 field3409;

    @OriginalMember(owner = "client!sr", name = "ig", descriptor = "Llb;")
    public class542 field3633;

    @OriginalMember(owner = "client!sr", name = "jg", descriptor = "Llb;")
    public class542 field3634;

    @OriginalMember(owner = "client!sr", name = "qg", descriptor = "Llb;")
    private class542 field3641;

    @OriginalMember(owner = "client!sr", name = "vg", descriptor = "Llb;")
    private class542 field3646;

    @OriginalMember(owner = "client!sr", name = "wg", descriptor = "Llb;")
    public class542 field3647;

    @OriginalMember(owner = "client!sr", name = "xg", descriptor = "Llb;")
    private class542 field3648;

    @OriginalMember(owner = "client!sr", name = "Cg", descriptor = "Llb;")
    public class542 field3653;

    @OriginalMember(owner = "client!sr", name = "Kf", descriptor = "Lraa;")
    private class606 field3609;

    @OriginalMember(owner = "client!sr", name = "Re", descriptor = "Lufa;")
    private class679 field3565;

    @OriginalMember(owner = "client!sr", name = "Hb", descriptor = "Lic;")
    public class698 field3399;

    @OriginalMember(owner = "client!sr", name = "kg", descriptor = "Lih;")
    public class699 field3635;

    @OriginalMember(owner = "client!sr", name = "ng", descriptor = "Lih;")
    public class699 field3638;

    @OriginalMember(owner = "client!sr", name = "og", descriptor = "Lih;")
    public class699 field3639;

    @OriginalMember(owner = "client!sr", name = "pg", descriptor = "Lih;")
    public class699 field3640;

    @OriginalMember(owner = "client!sr", name = "rg", descriptor = "Lih;")
    public class699 field3642;

    @OriginalMember(owner = "client!sr", name = "tg", descriptor = "Lih;")
    public class699 field3644;

    @OriginalMember(owner = "client!sr", name = "yg", descriptor = "Lih;")
    public class699 field3649;

    @OriginalMember(owner = "client!sr", name = "zg", descriptor = "Lih;")
    public class699 field3650;

    @OriginalMember(owner = "client!sr", name = "Ag", descriptor = "Lih;")
    public class699 field3651;

    @OriginalMember(owner = "client!sr", name = "Bg", descriptor = "Lih;")
    public class699 field3652;

    @OriginalMember(owner = "client!sr", name = "ug", descriptor = "Lgfa;")
    private class749 field3645;

    @OriginalMember(owner = "client!sr", name = "Zb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3417;

    @OriginalMember(owner = "client!sr", name = "qb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field3382;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field3337;

    @OriginalMember(owner = "client!sr", name = "se", descriptor = "Z")
    public boolean field3540;

    @OriginalMember(owner = "client!sr", name = "Be", descriptor = "Z")
    public boolean field3549;

    @OriginalMember(owner = "client!sr", name = "jf", descriptor = "Z")
    public boolean field3582;

    @OriginalMember(owner = "client!sr", name = "Ef", descriptor = "Z")
    public boolean field3603;

    @OriginalMember(owner = "client!sr", name = "Pf", descriptor = "Z")
    public boolean field3614;

    @OriginalMember(owner = "client!sr", name = "Eg", descriptor = "Z")
    public boolean field3655;

    @OriginalMember(owner = "client!sr", name = "bf", descriptor = "[Lma;")
    private class12[] field3575;

    @OriginalMember(owner = "client!sr", name = "Le", descriptor = "[Lofa;")
    public class328[] field3559;

    @OriginalMember(owner = "client!sr", name = "pe", descriptor = "[Lwi;")
    public class465[] field3537;

    @OriginalMember(owner = "client!sr", name = "Pe", descriptor = "[Lsi;")
    public class559[] field3563;

    @OriginalMember(owner = "client!sr", name = "kf", descriptor = "[Lsi;")
    public class559[] field3583;

    @OriginalMember(owner = "client!sr", name = "rf", descriptor = "[Lms;")
    public class758[] field3590;

    @OriginalMember(owner = "client!sr", name = "X", descriptor = "(I)V")
    public final void method457(int arg0) {
        this.field3625 = 0;
        ++field3450;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field3625;
        }
        this.field3594 = 1 << this.field3625;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)Lofa;")
    public final class328 method1587(int arg0) {
        ++field3370;
        if (arg0 != 3) {
            this.method1459(77);
        }
        return this.field3524;
    }

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)V")
    private final void method1588(int arg0) {
        ++field3497;
        if (this.field3615 != 1) {
            this.method1665(0);
            this.method1638(false, 8406);
            this.method1645(false, arg0 + -5686);
            this.method1634(false, arg0 + 16324);
            this.method1629(false, (byte) -103);
            this.method1605(false, -2, 32242, false);
            this.method1628((byte) 121, 1);
            this.method1663(this.field3628, -2);
            this.field3615 = 1;
        }
        if (arg0 != -16356) {
            this.field3521 = -65;
        }
    }

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "(I)I")
    public final int method1589(int arg0) {
        ++field3468;
        int var2 = 56 / ((arg0 - 54) / 62);
        return this.field3556;
    }

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "()Z")
    public final boolean method441() {
        ++field3379;
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "(I)Lgw;")
    public final class168 method1590(int arg0) {
        int var2 = -122 / ((arg0 - -34) / 48);
        ++field3397;
        return this.field3552 != null ? this.field3552.method794(14) : null;
    }

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "(I)I")
    public final int method1591(int arg0) {
        ++field3437;
        if (arg0 != 0) {
            this.field3565 = null;
        }
        return this.field3610;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V")
    public final void method1592(byte arg0) {
        this.field3559 = new class328[this.field3542];
        ++field3391;
        this.field3583 = new class559[this.field3542];
        this.field3575 = new class12[this.field3542];
        this.field3563 = new class559[this.field3542];
        this.field3590 = new class758[this.field3542];
        int var2 = 0;
        if (arg0 == 55) {
            while (var2 < this.field3542) {
                this.field3563[var2] = class502.field7202;
                this.field3583[var2] = class502.field7202;
                this.field3590[var2] = class245.field3269;
                this.field3559[var2] = new class328();
                ++var2;
            }
            this.field3537 = new class465[this.field3608 + -2];
            this.field3628 = this.method1473(1, 1, class165.field2263, arg0 ^ -20655, class309.field4305);
            this.method460(new class130(262144));
            this.field3647 = this.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158 }) }, (byte) -77);
            this.field3634 = this.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4156 }) }, (byte) 114);
            this.field3633 = this.method1466(new class459[] { new class459(class295.field4149), new class459(class295.field4156), new class459(class295.field4158), new class459(class295.field4155) }, (byte) -81);
            this.field3653 = this.method1466(new class459[] { new class459(class295.field4149), new class459(class295.field4156), new class459(class295.field4158) }, (byte) -59);
            this.field3650 = new class699(this, 0, 0, false, false);
            this.field3639 = new class699(this, 0, 0, true, true);
            this.field3644 = new class699(this, 0, 0, false, false);
            this.field3642 = new class699(this, 0, 0, true, true);
            this.field3652 = new class699(this, 0, 0, false, false);
            this.field3638 = new class699(this, 0, 0, true, true);
            this.field3651 = new class699(this, 0, 0, false, false);
            this.field3635 = new class699(this, 0, 0, true, true);
            this.field3640 = new class699(this, 0, 0, false, false);
            this.field3649 = new class699(this, 0, 0, true, true);
            this.field3565 = new class679(this);
            this.field3645 = this.method1485((byte) 37, true);
            this.method1643(0);
            this.field3399 = new class698(this);
            this.field3613[1] = this.method1451((byte) -120, 1);
            this.field3613[2] = this.method1451((byte) -102, 2);
            this.field3613[4] = this.method1451((byte) -104, 4);
            this.field3613[5] = this.method1451((byte) -105, 5);
            this.field3613[6] = this.method1451((byte) -106, 6);
            this.field3613[7] = this.method1451((byte) 32, 7);
            this.field3613[3] = this.method1451((byte) -110, 3);
            this.field3613[8] = this.method1451((byte) -97, 8);
            this.field3613[9] = this.method1451((byte) 26, 9);
            if (!this.field3613[2].method525(36)) {
                this.field3613[2] = this.method1451((byte) 114, 0);
            }
            if (!this.field3613[4].method525(98)) {
                this.field3613[4] = this.field3613[2];
            }
            if (!this.field3613[8].method525(58)) {
                this.field3613[8] = this.field3613[4];
            }
            if (!this.field3613[9].method525(58)) {
                this.field3613[9] = this.field3613[8];
            }
            this.method1461((byte) 39);
            this.method424();
            this.method432();
        }
    }

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "(I)Lofa;")
    public final class328 method1593(int arg0) {
        ++field3478;
        int var2 = 95 % ((67 - arg0) / 37);
        return this.field3559[this.field3561];
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)V")
    public abstract void method1447(boolean arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lwt;Lbda;I)Z")
    public abstract boolean method1439(class309 arg0, class505 arg1, int arg2);

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "(I)V")
    private final void method1594(int arg0) {
        if (!this.field3548) {
            float[] var2 = this.field3558;
            this.field3548 = true;
            if (~this.field3384 != -1 && this.field3412 != 0) {
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.5F;
                var2[11] = 0.0F;
                var2[13] = 1.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = -1.0F;
                var2[5] = -2.0F / (float) this.field3412;
                var2[0] = 2.0F / (float) this.field3384;
                var2[7] = 0.0F;
                var2[10] = 0.5F;
                var2[8] = 0.0F;
            } else {
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
            }
        }
        if (arg0 <= 55) {
            this.field3608 = -108;
        }
        ++field3368;
    }

    @OriginalMember(owner = "client!sr", name = "la", descriptor = "()V")
    public final void method424() {
        this.field3605 = 0;
        this.field3534 = 0;
        this.field3622 = this.field3384;
        ++field3343;
        this.field3545 = this.field3412;
        if (this.field3655) {
            this.field3655 = false;
            this.method1426(3);
        }
        this.method1624(9);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lofa;Z)V")
    public final void method1595(class328 arg0, boolean arg1) {
        ++field3480;
        this.field3524.method344(arg0);
        this.field3517 = false;
        if (!arg1) {
            this.field3607 = -0.022191063F;
        }
        this.method1599(-12912);
    }

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "()I")
    public final int method387() {
        ++field3421;
        return this.field3562;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "()Z")
    public final boolean method396() {
        ++field3455;
        return this.field3613[3].method525(92);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[Ljava/lang/String;)V")
    public static final void method1596(int arg0, String[] arg1) {
        ++field3373;
        if (arg0 != -13841) {
            method1596(-97, (String[]) null);
        }
        if (~arg1.length >= -2) {
            class185.field2500 = class185.field2500 + arg1[0];
            class115.field1387 += arg1[0].length();
        } else {
            for (int var2 = 0; ~arg1.length < ~var2; ++var2) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class559.method3221("Pausing for " + var3 + " seconds...", (byte) 79);
                    class720.field9999 = arg1;
                    class562.field7886 = var2 + 1;
                    class139.field2011 = (long) (var3 * 1000) + class479.method2864((byte) -110);
                    return;
                }
                class185.field2500 = arg1[var2];
                class63.method537(false, (byte) 67);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILbda;ILwt;)Ldh;")
    public abstract class320 method1473(int arg0, int arg1, class505 arg2, int arg3, class309 arg4);

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)V")
    public final void method443(int arg0) {
        ++field3445;
    }

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "(I)V")
    public static void method1597(int arg0) {
        field3369 = null;
        if (arg0 != 0) {
            field3369 = null;
        }
        field3409 = null;
    }

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "(I)V")
    public abstract void method1477(int arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lza;)V")
    public final void method460(class413 arg0) {
        this.field3417 = ((class130) arg0).field1569;
        ++field3332;
        this.field3382 = this.field3417.method3649(32768, false);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(FFIFFFF)Z")
    private final boolean method1598(float arg0, float arg1, int arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field3365;
        Buffer var8 = this.field3654.method1063(-5419, true);
        if (var8 == null) {
            return false;
        } else {
            if (arg2 != 0) {
                this.method468();
            }
            Stream var9 = this.method1666(var8, true);
            if (Stream.method3662()) {
                var9.method3666(arg4);
                var9.method3666(arg3);
                var9.method3666(arg1);
                var9.method3666(arg6);
                var9.method3666(arg0);
                var9.method3666(arg5);
            } else {
                var9.method3658(arg4);
                var9.method3658(arg3);
                var9.method3658(arg1);
                var9.method3658(arg6);
                var9.method3658(arg0);
                var9.method3658(arg5);
            }
            var9.method3656();
            return this.field3654.method1060(-17151);
        }
    }

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "(I)V")
    public abstract void method1448(int arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII[IZ)Ldh;")
    public abstract class320 method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, boolean arg6);

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "(I)F")
    public abstract float method1459(int arg0);

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "()Lnga;")
    public final class513 method436() {
        ++field3429;
        return this.field3526;
    }

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "(I)V")
    private final void method1599(int arg0) {
        ++field3442;
        if (class357.field5086 == this.field3555) {
            float var2 = this.method1459(76);
            this.field3524.method2132(var2, 0.0F, (byte) 86, var2);
        }
        this.field3588 = false;
        if (arg0 != -12912) {
            this.method396();
        }
        this.method1434(true);
        if (this.field3609 != null) {
            this.field3609.method1988((byte) -128);
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)I")
    public final int method466(int arg0, int arg1) {
        ++field3448;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLms;)V")
    public final void method1600(byte arg0, class758 arg1) {
        this.field3590[this.field3561] = arg1;
        if (arg0 != 95) {
            this.method1479((class542) null, 77);
        }
        ++field3507;
        this.method1610(arg0 + 28225);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lmf;)V")
    public final void method405(class418 arg0) {
        ++field3393;
        this.field3552 = (class112) arg0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lht;I)V")
    public abstract void method1478(class581 arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "()V")
    public final void method376() {
        if (this.field3612 != null) {
            this.field3612.method759(3969);
        }
        ++field3463;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method1435(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "(I)V")
    public abstract void method1470(int arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lkt;II)V")
    public final void method1601(class155 arg0, int arg1, int arg2) {
        this.method1438(false, arg0, (byte) -128, arg1);
        if (arg2 == 256) {
            ++field3503;
        }
    }

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "([I)V")
    public final void method398(int[] arg0) {
        arg0[1] = this.field3534;
        arg0[3] = this.field3545;
        arg0[2] = this.field3622;
        ++field3490;
        arg0[0] = this.field3605;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[Lwi;)V")
    public final void method372(int arg0, class465[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field3537[var3] = arg1[var3];
        }
        ++field3347;
        this.field3589 = arg0;
        if (this.field3555.method1735(true)) {
            this.method1453((byte) -89);
        }
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(II)V")
    public final void method1602(int arg0, int arg1) {
        ++field3418;
        if (arg0 == -1) {
            if (~this.field3616 != ~arg1) {
                boolean var3;
                class705 var4;
                boolean var5;
                if (arg1 == 1) {
                    var3 = true;
                    var4 = class557.field7810;
                    var5 = true;
                } else if (~arg1 != -3) {
                    if (~arg1 != -129) {
                        var3 = false;
                        var5 = false;
                        var4 = class97.field1166;
                    } else {
                        var4 = class498.field7159;
                        var5 = true;
                        var3 = true;
                    }
                } else {
                    var4 = class246.field3286;
                    var5 = true;
                    var3 = false;
                }
                if (!var3 != !this.field3629) {
                    this.field3629 = var3;
                    this.method1449(-101);
                }
                if (!this.field3550 != !var5) {
                    this.field3550 = var5;
                    this.method1487(true);
                }
                if (this.field3551 != var4) {
                    this.field3551 = var4;
                    this.method1432((byte) -83);
                }
                this.field3616 = arg1;
                this.field3615 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "(I)V")
    public final void method1603(int arg0) {
        if (arg0 != 1) {
            this.field3599 = 123;
        }
        if (~this.field3615 != -17) {
            this.method1609(1);
            this.method1638(true, 8406);
            this.method1634(true, arg0 ^ -31);
            this.method1629(true, (byte) -117);
            this.method1602(-1, 1);
            this.field3615 = 16;
        }
        ++field3518;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILada;)V")
    public abstract void method1460(int arg0, int arg1, class161 arg2);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(Z)V")
    public final void method1604(boolean arg0) {
        ++field3366;
        if (!arg0) {
            if (~this.field3615 != -9) {
                this.method1614(false);
                this.method1638(true, 8406);
                this.method1634(true, -32);
                this.method1629(true, (byte) -102);
                this.method1602(-1, 1);
                this.field3615 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[I[I)Laa;")
    public final class486 method489(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field3362;
        return class415.method2554(this, arg3, arg0, arg2, 2871, arg1);
    }

    @OriginalMember(owner = "client!sr", name = "JA", descriptor = "(IIIIII)I")
    public final int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3458;
        int var7 = 0;
        float var8 = (float) arg2 * this.field3526.field4559 + (float) arg0 * this.field3526.field4546 + (float) arg1 * this.field3526.field4535 + this.field3526.field4577;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field3526.field4559 + (float) arg3 * this.field3526.field4546 + (float) arg4 * this.field3526.field4535 + this.field3526.field4577;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field3562 && var9 < (float) this.field3562) {
            var7 |= 16;
        } else if ((float) this.field3560 < var8 && var9 > (float) this.field3560) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field3526.field4556 + (float) arg0 * this.field3526.field4531 + (float) arg1 * this.field3526.field4541 + this.field3526.field4573) * (float) this.field3544 / var8);
        int var11 = (int) (((float) arg5 * this.field3526.field4556 + (float) arg3 * this.field3526.field4531 + (float) arg4 * this.field3526.field4541 + this.field3526.field4573) * (float) this.field3544 / var9);
        if (this.field3621 > (float) var10 && this.field3621 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field3554 && (float) var11 > this.field3554) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field3526.field4571 + (float) arg0 * this.field3526.field4558 + (float) arg1 * this.field3526.field4562 + this.field3526.field4533) * (float) this.field3539 / var8);
        int var13 = (int) (((float) arg5 * this.field3526.field4571 + (float) arg3 * this.field3526.field4558 + (float) arg4 * this.field3526.field4562 + this.field3526.field4533) * (float) this.field3539 / var9);
        if ((float) var12 < this.field3606 && (float) var13 < this.field3606) {
            var7 |= 4;
        } else if (this.field3532 < (float) var12 && (float) var13 > this.field3532) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3410;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method1598((float) arg3 + var8, 0.0F, 0, (float) arg1, (float) arg0, 0.0F, (float) arg2 + var9)) {
            this.method1588(-16356);
            this.method1640(true, arg4);
            this.method1664((byte) -112, class679.field9315, 0);
            this.method1601(class679.field9315, 0, 256);
            this.method1602(-1, arg5);
            this.method1659((byte) 103);
            this.method1467((byte) 115, false);
            this.method1647(3584);
            this.method1467((byte) 115, true);
            this.method1601(class597.field8397, 0, 256);
            this.method1664((byte) -109, class597.field8397, 0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIIZ)V")
    public final void method1605(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field3443;
        if (this.field3587 != arg1 || this.field3582 == !this.field3584) {
            class320 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field3582 ? 0 : 3;
            if (arg1 < 0) {
                this.method1632((byte) -117);
            } else {
                var5 = this.field3612.method761(arg1, true);
                class502 var10 = super.field715.method532((byte) 127, arg1);
                if (var10.field7207 == 0 && ~var10.field7193 == -1) {
                    this.method1632((byte) -103);
                } else {
                    int var11 = !var10.field7208 ? 128 : 64;
                    int var12 = var11 * 50;
                    class328 var13 = this.method1593(18);
                    var13.method2139((float) (this.field3567 % var12 * var10.field7207) / (float) var12, 0.0F, (byte) 43, (float) (this.field3567 % var12 * var10.field7193) / (float) var12);
                    this.method1600((byte) 95, class184.field2497);
                }
                if (!this.field3582) {
                    var8 = var10.field7199;
                    var7 = var10.field7195;
                    var9 = var10.field7204;
                }
                var6 = var10.field7189;
            }
            this.method1637(var8, arg3, arg0, 66, var7, var9);
            if (this.field3609 != null) {
                this.field3609.method523(var5, var6, 3);
            } else {
                this.method1663(var5, -2);
                this.method1628((byte) -103, var6);
            }
            this.field3584 = this.field3582;
            this.field3587 = arg1;
        }
        this.field3615 &= -8;
        if (arg2 != 32242) {
            this.field3595 = -0.16240549F;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method477(Canvas arg0) {
        ++field3377;
        if (this.field3454 == arg0) {
            throw new RuntimeException();
        } else if (this.field3337.containsKey(arg0)) {
            this.method1428(arg0, this.field3337.get(arg0), true);
            this.field3337.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "(I)V")
    private final void method1606(int arg0) {
        if (arg0 >= 47) {
            ++field3527;
            this.field3643 = this.method1429(false, 30519);
            this.field3643.method1061(-126, 28, 140);
            for (int var2 = 0; ~var2 > -5; ++var2) {
                Buffer var3 = this.field3643.method1063(-5419, true);
                if (var3 != null) {
                    Stream var4 = this.method1666(var3, true);
                    if (!Stream.method3662()) {
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(1.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                        var4.method3658(0.0F);
                    } else {
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(1.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                        var4.method3666(0.0F);
                    }
                    var4.method3656();
                    if (this.field3643.method1060(-17151)) {
                        break;
                    }
                }
            }
            this.field3641 = this.method1466(new class459[] { new class459(new class295[] { class295.field4149, class295.field4158, class295.field4158 }) }, (byte) 115);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;B)Ljava/lang/Object;")
    public abstract Object method1465(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
    public abstract void method1443(byte arg0);

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "()Z")
    public final boolean method476() {
        ++field3499;
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)V")
    private final void method1607(byte arg0) {
        this.field3577[10] = this.field3607;
        ++field3434;
        this.field3577[14] = this.field3585;
        if (arg0 <= -75) {
            this.field3541 = (this.field3577[14] + (float) (-this.field3560)) / this.field3577[10];
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IB)V")
    public final void method1608(int arg0, byte arg1) {
        this.method1640(true, arg1 | arg1 << 16 | arg1 << 24 | arg1 << 8);
        ++field3456;
        if (arg0 > -26) {
            this.field3619 = -59;
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)V")
    public abstract void method1432(byte arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)Lada;")
    public abstract class161 method1429(boolean arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3513;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method1588(-16356);
        this.method1640(true, arg4);
        this.method1664((byte) -51, class679.field9315, 0);
        this.method1601(class679.field9315, 0, 256);
        this.method1602(-1, arg5);
        this.method1659((byte) 112);
        int var14 = arg8 % (arg6 + arg7);
        this.method1467((byte) 115, false);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~arg6 > ~var14) {
            var18 = (float) (-var14 + arg6 + arg7) * var11;
            var17 = (float) (arg6 + arg7 - var14) * var12;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (arg6 - var14) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 > ~arg2) {
                if (var21 > (float) arg2) {
                    break;
                }
                if (var19 + var21 > (float) arg2) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if ((float) arg2 > var21) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (~arg1 <= ~arg3) {
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
            if (!this.method1598(var20 + var22, 0.0F, 0, var22, var21, 0.0F, var19 + var21)) {
                return;
            }
            var22 += var20 + var24;
            this.method1647(3584);
            var21 += var19 + var23;
            var20 = var16;
            var19 = var15;
        }
        this.method1467((byte) 115, true);
        this.method1601(class597.field8397, 0, 256);
        this.method1664((byte) -103, class597.field8397, 0);
    }

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "()Z")
    public final boolean method468() {
        ++field3381;
        return this.field3614;
    }

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "()Z")
    public final boolean method438() {
        ++field3441;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "(I)V")
    private final void method1609(int arg0) {
        ++field3414;
        if (arg0 != 1) {
            this.field3614 = false;
        }
        if (class125.field1519 != this.field3555) {
            class266 var2 = this.field3555;
            this.field3555 = class125.field1519;
            if (!var2.method1735(true)) {
                this.method1633(arg0 ^ 11074);
            }
            this.method1627((byte) 96);
            this.field3553 = this.field3618;
            this.method1621(-3011);
            this.field3615 &= -8;
        }
    }

    @OriginalMember(owner = "client!sr", name = "KA", descriptor = "(IIII)V")
    public final void method469(int arg0, int arg1, int arg2, int arg3) {
        ++field3452;
        if (arg0 <= 0 && this.field3384 - 1 <= arg2 && ~arg1 >= -1 && ~arg3 <= ~(this.field3412 - 1)) {
            this.method424();
        } else {
            this.field3534 = arg1 < 0 ? 0 : arg1;
            this.field3622 = ~arg2 >= ~this.field3384 ? arg2 : 0;
            this.field3545 = this.field3384 >= arg3 ? arg3 : 0;
            this.field3605 = arg0 < 0 ? 0 : arg0;
            if (!this.field3655) {
                this.field3655 = true;
                this.method1426(3);
            }
            this.method1446(0);
            this.method1624(9);
        }
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "(I)V")
    private final void method1610(int arg0) {
        this.method1433(arg0 + -15095);
        ++field3344;
        if (arg0 == 28320) {
            if (this.field3609 != null) {
                this.field3609.method1052((byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lza;")
    public final class413 method371(int arg0) {
        ++field3371;
        class130 var2 = new class130(arg0);
        this.field3473.method2770((byte) -13, var2);
        return var2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method385(Canvas arg0, int arg1, int arg2) {
        ++field3487;
        Object var4 = null;
        if (arg0 != null && this.field3454 != arg0) {
            if (this.field3337.containsKey(arg0)) {
                var4 = this.field3337.get(arg0);
            }
        } else {
            var4 = this.field3459;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1435(arg0, 125, var4);
            if (this.field3380 == arg0) {
                this.method1642((byte) -53);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILik;)V")
    public abstract void method1481(int arg0, int arg1, int arg2, class207 arg3);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lwt;Lbda;B)Z")
    public abstract boolean method1444(class309 arg0, class505 arg1, byte arg2);

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "(I)V")
    private final void method1611(int arg0) {
        this.method1462((byte) -57);
        ++field3461;
        this.method1445(false);
        this.method1442((byte) -124);
        this.method1453((byte) -85);
        this.method1456(1);
        this.method1477(-117);
        this.method1464((byte) 55);
        this.method1447(true);
        this.method1448(-106);
        this.method1480(58);
        this.method1470(5);
        this.method1487(true);
        this.method1432((byte) -83);
        this.method1449(-41);
        int var2 = -95 % ((20 - arg0) / 60);
        for (int var3 = this.field3542 + -1; ~var3 <= -1; --var3) {
            this.method1648(var3, (byte) 66);
            this.method1436(26776);
            this.method1455((byte) -128);
            this.method1632((byte) -111);
        }
        this.method1472(-5617);
        this.method1474(13);
        this.method1427(11);
        this.method1434(true);
        this.method1440((byte) 20);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLbda;[BIII)Ldh;")
    public final class320 method1612(boolean arg0, class505 arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field3506;
        return arg3 < 73 ? null : this.method1489(arg4, 0, arg5, arg2, arg0, arg1, (byte) -77, 0);
    }

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "(IIIIIII)I")
    public final int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3488;
        int var8 = 0;
        float var9 = (float) arg2 * this.field3526.field4559 + (float) arg0 * this.field3526.field4546 + (float) arg1 * this.field3526.field4535 + this.field3526.field4577;
        float var10 = (float) arg5 * this.field3526.field4559 + (float) arg3 * this.field3526.field4546 + (float) arg4 * this.field3526.field4535 + this.field3526.field4577;
        if (var9 < (float) this.field3562 && var10 < (float) this.field3562) {
            var8 |= 16;
        } else if ((float) this.field3560 < var9 && (float) this.field3560 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field3526.field4556 + (float) arg0 * this.field3526.field4531 + (float) arg1 * this.field3526.field4541 + this.field3526.field4573) * (float) this.field3544 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field3526.field4556 + (float) arg3 * this.field3526.field4531 + (float) arg4 * this.field3526.field4541 + this.field3526.field4573) * (float) this.field3544 / (float) arg6);
        if ((float) var11 < this.field3621 && (float) var12 < this.field3621) {
            var8 |= 1;
        } else if ((float) var11 > this.field3554 && this.field3554 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field3526.field4571 + (float) arg0 * this.field3526.field4558 + (float) arg1 * this.field3526.field4562 + this.field3526.field4533) * (float) this.field3539 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field3526.field4571 + (float) arg3 * this.field3526.field4558 + (float) arg4 * this.field3526.field4562 + this.field3526.field4533) * (float) this.field3539 / (float) arg6);
        if (this.field3606 > (float) var13 && (float) var14 < this.field3606) {
            var8 |= 4;
        } else if ((float) var13 > this.field3532 && (float) var14 > this.field3532) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Llb;I)V")
    public abstract void method1479(class542 arg0, int arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILsi;Lsi;)V")
    public final void method1613(int arg0, class559 arg1, class559 arg2) {
        ++field3390;
        boolean var4 = false;
        if (this.field3583[this.field3561] != arg1) {
            this.field3583[this.field3561] = arg1;
            this.method1436(arg0 ^ -26758);
            var4 = true;
        }
        if (this.field3563[this.field3561] != arg2) {
            this.field3563[this.field3561] = arg2;
            this.method1455((byte) 96);
            var4 = true;
        }
        if (var4) {
            this.field3615 &= -30;
        }
        if (arg0 != -30) {
            this.field3644 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(Z)V")
    private final void method1614(boolean arg0) {
        if (arg0) {
            this.field3526 = null;
        }
        if (class228.field3061 != this.field3555) {
            class266 var2 = this.field3555;
            this.field3555 = class228.field3061;
            if (!var2.method1735(true)) {
                this.method1633(11075);
            }
            this.method1630(-121);
            this.field3553 = this.field3577;
            this.method1621(-3011);
            this.field3615 &= -8;
        }
        ++field3351;
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V")
    public final void method408(int arg0) {
        ++field3345;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field3612 != null) {
                this.field3612.method759(3969);
            }
            this.field3543 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(IIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3396;
        float var7 = this.method1459(-86);
        this.method1588(-16356);
        this.method1640(true, arg4);
        this.method1664((byte) -104, class679.field9315, 0);
        this.method1601(class679.field9315, 0, 256);
        this.method1602(-1, arg5);
        this.field3524.method2144((float) (arg3 + -1), 0, (float) (arg2 + -1), 1.0F);
        this.field3524.method2132((float) arg0 + -var7, 0.0F, (byte) 86, (float) arg1 - var7);
        this.method1662(2);
        this.method1467((byte) 115, false);
        this.method1641(class397.field5601, 4, true);
        this.method1467((byte) 115, true);
        this.method1601(class597.field8397, 0, 256);
        this.method1664((byte) -83, class597.field8397, 0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V")
    public final void method1615(int arg0, boolean arg1) {
        if (this.field3631 != arg1) {
            this.field3631 = arg1;
            this.method1464((byte) 55);
        }
        ++field3348;
        if (arg0 != 0) {
            this.field3634 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BZ)Lgfa;")
    public abstract class749 method1485(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "()Z")
    public final boolean method463() {
        ++field3462;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "(I)V")
    public final void method1616(int arg0) {
        ++field3472;
        int var2 = -18 % ((18 - arg0) / 37);
        this.method1641(class166.field2284, 2, true);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method450(Canvas arg0) {
        this.field3380 = null;
        this.field3459 = null;
        ++field3512;
        if (arg0 != null && this.field3454 != arg0) {
            if (this.field3337.containsKey(arg0)) {
                this.field3459 = this.field3337.get(arg0);
                this.field3380 = arg0;
            }
        } else {
            this.field3459 = this.field3339;
            this.field3380 = this.field3454;
        }
        if (this.field3380 != null && this.field3459 != null) {
            this.method1468(0, this.field3380, this.field3459);
            this.method1642((byte) -5);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIZ)Loia;")
    public final class88 method386(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3336;
        class697 var6 = new class697(this, arg2, arg3, arg4);
        var6.method659(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "(III[I)V")
    public final void method446(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3340;
        float var5 = this.field3526.method2129(true, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3571;
            var7 = this.field3586;
        } else {
            var7 = (int) ((float) this.field3544 * this.field3526.method2136(-4957, (float) arg0, (float) arg1, (float) arg2) / var5);
            var6 = (int) ((float) this.field3539 * this.field3526.method2140((float) arg0, (float) arg1, true, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field3621);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field3606);
    }

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "(I)V")
    public final void method470(int arg0) {
        ++field3482;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([Lsj;B)Llb;")
    public abstract class542 method1466(class459[] arg0, byte arg1);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8) {
        ++field3403;
    }

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "(Z)V")
    public final void method490(boolean arg0) {
        ++field3385;
        this.field3566 = arg0;
        this.method1448(-93);
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(Z)V")
    public final void method1617(boolean arg0) {
        if (!arg0) {
            ++field3427;
            if (class8.field124 != this.field3555) {
                class266 var2 = this.field3555;
                this.field3555 = class8.field124;
                if (var2.method1735(!arg0)) {
                    this.method1633(11075);
                }
                this.field3553 = this.field3626;
                this.field3615 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lee;B)Luha;")
    public static final class242 method1618(class675 arg0, byte arg1) {
        int var2 = 117 % ((arg1 - 36) / 51);
        ++field3525;
        class220 var3 = class283.method1855(arg0, (byte) -85);
        int var4 = arg0.method3703(113);
        int var5 = arg0.method3703(94);
        int var6 = arg0.method3757((byte) -65);
        return new class242(var3.field2867, var3.field2876, var3.field2871, var3.field2875, var3.field2873, var3.field2874, var3.field2865, var3.field2864, var3.field2872, var4, var5, var6);
    }

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "()Z")
    public final boolean method471() {
        ++field3364;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(B)V")
    public void method1461(byte arg0) {
        ++field3416;
        if (arg0 != 39) {
            this.field3651 = null;
        }
        this.method1611(92);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "()Z")
    public final boolean method374() {
        ++field3359;
        return false;
    }

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "(I)V")
    public abstract void method1426(int arg0);

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "(IIIII)V")
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method378(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field3471;
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(Z)V")
    public abstract void method1445(boolean arg0);

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "(I)Lofa;")
    public final class328 method1619(int arg0) {
        if (arg0 > -44) {
            this.method427();
        }
        ++field3346;
        return this.field3529;
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(IIIIII)Lmf;")
    public final class418 method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3415;
        return new class135(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method1620(int arg0, int arg1, boolean arg2) {
        if (arg0 != -16455) {
            this.field3578 = 0;
        }
        ++field3405;
        return this.field3417.method3649(arg1, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "XA", descriptor = "()I")
    public final int method434() {
        ++field3486;
        return this.field3560;
    }

    @OriginalMember(owner = "client!sr", name = "pa", descriptor = "()V")
    public final void method414() {
        this.field3582 = false;
        ++field3496;
    }

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "(I)V")
    private final void method1621(int arg0) {
        if (arg0 != -3011) {
            this.field3535 = 25;
        }
        ++field3519;
        this.method1427(arg0 + 3022);
        if (this.field3609 != null) {
            this.field3609.method1985(true);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ldga;Z)Loia;")
    public final class88 method484(class204 arg0, boolean arg1) {
        ++field3394;
        class88 var9;
        if (arg0.field2657 != 0 && ~arg0.field2664 != -1) {
            int[] var3 = new int[arg0.field2664 * arg0.field2657];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2660 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field2664; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field2657; ++var7) {
                        var3[var5++] = class325.method2116(arg0.field2660[var4] << 24, arg0.field2656[class286.method1877(arg0.field2661[var4], 255)]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~arg0.field2664 < ~var8; ++var8) {
                    for (int var10 = 0; ~arg0.field2657 < ~var10; ++var10) {
                        int var11 = arg0.field2656[arg0.field2661[var4++] & 255];
                        var3[var5++] = var11 == 0 ? 0 : class325.method2116(var11, -16777216);
                    }
                }
            }
            var9 = this.method426(arg0.field2657, arg0.field2664, var3, -1, arg0.field2657, 0);
        } else {
            var9 = this.method426(1, 1, new int[1], -1, 1, 0);
        }
        var9.method655(arg0.field2662, arg0.field2659, arg0.field2658, arg0.field2663);
        return var9;
    }

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "(I)V")
    public abstract void method1433(int arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBILbda;I[B)Lpa;")
    public abstract class369 method1469(int arg0, byte arg1, int arg2, class505 arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(CB)Z")
    public static final boolean method1622(char arg0, byte arg1) {
        if (arg1 > -61) {
            method1596(121, (String[]) null);
        }
        ++field3491;
        return ~arg0 <= -66 && arg0 <= 'Z' || arg0 >= 'a' && ~arg0 >= -123;
    }

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "(I)V")
    public abstract void method1480(int arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IZ)V")
    public final void method1623(int arg0, boolean arg1) {
        ++field3511;
        if (this.field3573 != arg1) {
            this.field3573 = arg1;
            this.method1442((byte) -124);
        }
        int var3 = 11 / ((arg0 - 63) / 53);
    }

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "(I)V")
    private final void method1624(int arg0) {
        this.field3621 = (float) (-this.field3586 + this.field3605);
        this.field3554 = (float) (-this.field3586 + this.field3622);
        this.field3532 = (float) (this.field3545 - this.field3571);
        this.field3606 = (float) (-this.field3571 + this.field3534);
        if (arg0 != 9) {
            this.method1606(122);
        }
        ++field3510;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
    public void method399(int arg0) {
        ++field3438;
        if (this.field3612 != null) {
            this.field3612.method757(true);
        }
        this.field3567 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(B)V")
    private final void method1625(byte arg0) {
        this.field3636 = this.method1429(false, 30519);
        ++field3444;
        this.field3636.method1061(arg0 ^ -105, 12, 3096);
        int var2 = 0;
        if (arg0 != 107) {
            this.method1425((byte) 18);
        }
        while (~var2 > -5) {
            Buffer var3 = this.field3636.method1063(-5419, true);
            if (var3 != null) {
                Stream var4 = this.method1666(var3, true);
                var4.method3666(0.0F);
                var4.method3666(0.0F);
                var4.method3666(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method3662()) {
                        var4.method3666(var9);
                        var4.method3666(var8);
                        var4.method3666(0.0F);
                    } else {
                        var4.method3658(var9);
                        var4.method3658(var8);
                        var4.method3658(0.0F);
                    }
                }
                var4.method3656();
                if (this.field3636.method1060(arg0 ^ -17046)) {
                    break;
                }
            }
            ++var2;
        }
        this.field3648 = this.method1466(new class459[] { new class459(class295.field4149) }, (byte) 112);
    }

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "(I)V")
    public abstract void method1474(int arg0);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "()V")
    public void method389() {
        if (!this.field3576) {
            for (class189 var1 = this.field3473.method2765(-12261); var1 != null; var1 = this.field3473.method2759(-15361)) {
                ((class130) var1).method874(3);
            }
            Enumeration var2 = this.field3337.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1428(var3, this.field3337.get(var3), true);
            }
            class19.method116(true, false, (byte) 66);
            this.field3494.release();
            this.field3576 = true;
        }
        ++field3431;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIZ)Loia;")
    public final class88 method380(int arg0, int arg1, boolean arg2) {
        ++field3425;
        return new class697(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lfp;II)V")
    public class251(Canvas arg0, Object arg1, class149 arg2, class323 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field3380 = this.field3454 = arg0;
            this.field3459 = this.field3339 = arg1;
            this.field3574 = arg4;
            this.field3504 = arg3;
            Dimension var7 = arg0.getSize();
            this.field3599 = arg5;
            this.field3384 = this.field3493 = var7.width;
            this.field3412 = this.field3386 = var7.height;
            class621.method3486(-103, false, true);
            if (super.field715 == null) {
                this.field3494 = new NativeInterface(0, this.field3599);
                this.field3612 = null;
            } else {
                this.field3612 = new class106(this, super.field715);
                this.field3494 = new NativeInterface(super.field715.method528((byte) -121), this.field3599);
                for (int var8 = 0; ~super.field715.method528((byte) -121) < ~var8; ++var8) {
                    class502 var9 = super.field715.method532((byte) 127, var8);
                    if (var9 != null) {
                        this.field3494.initTextureMetrics(var8, var9.field7192, var9.field7196);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method474(1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "(I)V")
    private final void method1626(int arg0) {
        this.field3654 = this.method1429(true, arg0 + 30519);
        ++field3407;
        if (arg0 != 0) {
            this.field3600 = 1;
        }
        this.field3654.method1061(-128, 12, 24);
        this.field3646 = this.method1466(new class459[] { new class459(class295.field4149) }, (byte) 113);
    }

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "(ILaa;II)V")
    public final void method447(int arg0, class486 arg1, int arg2, int arg3) {
        ++field3470;
        class173 var5 = (class173) arg1;
        class320 var6 = var5.field2352;
        this.method1669(false);
        this.method1663(var6, -2);
        this.method1602(-1, 1);
        this.method1613(-30, class719.field9987, class719.field9987);
        this.method1664((byte) -53, class679.field9315, 0);
        this.method1640(true, arg0);
        this.field3524.method2144((float) this.field3412, 0, (float) this.field3384, 0.0F);
        this.method1662(2);
        this.field3559[0].method2144(var6.method1318(true, (float) this.field3412), 0, var6.method1322((byte) 7, (float) this.field3384), 1.0F);
        this.field3559[0].method2132(var6.method1322((byte) -53, (float) (-arg2)), 0.0F, (byte) 86, var6.method1318(true, (float) (-arg3)));
        this.field3590[0] = class184.field2497;
        this.method1610(28320);
        this.method1616(118);
        this.method1632((byte) -109);
        this.method1664((byte) -95, class597.field8397, 0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lie;IIII)Lka;")
    public final class471 method397(class6 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3374;
        return new class699(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(B)V")
    private final void method1627(byte arg0) {
        ++field3424;
        if (!this.field3533) {
            float[] var2 = this.field3618;
            float var3 = (float) this.field3562;
            float var4 = (float) this.field3560;
            float var5 = (float) (-this.field3571) * this.field3595 / (float) this.field3539;
            float var6 = (float) (-this.field3586) * this.field3595 / (float) this.field3544;
            float var7 = (float) (-this.field3586 + this.field3384) * this.field3595 / (float) this.field3544;
            float var8 = (float) (this.field3412 - this.field3571) * this.field3595 / (float) this.field3539;
            if (var6 != var7 && var5 != var8) {
                var2[10] = 1.0F / (var3 - var4);
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[0] = 2.0F / (var7 - var6);
                var2[7] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[9] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
            } else {
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method1660((byte) 75);
            this.field3533 = true;
        }
        if (arg0 != 96) {
            this.method1605(true, -77, 36, false);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V")
    public final void method1628(byte arg0, int arg1) {
        if (arg1 == 1) {
            this.method1613(-30, class719.field9987, class719.field9987);
        } else if (~arg1 != -1) {
            if (~arg1 != -3) {
                if (arg1 != 3) {
                    if (arg1 == 4) {
                        this.method1613(-30, class116.field1400, class116.field1400);
                    }
                } else {
                    this.method1613(-30, class170.field2330, class502.field7202);
                }
            } else {
                this.method1613(-30, class589.field8300, class719.field9987);
            }
        } else {
            this.method1613(-30, class502.field7202, class502.field7202);
        }
        int var3 = 113 % ((arg0 - 64) / 43);
        ++field3334;
    }

    @OriginalMember(owner = "client!sr", name = "za", descriptor = "(IIIII)V")
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3378;
        this.method1588(-16356);
        this.method1640(true, arg3);
        this.method1664((byte) -102, class679.field9315, 0);
        this.method1601(class679.field9315, 0, 256);
        this.method1602(-1, arg4);
        this.field3524.method2144((float) arg2, 0, (float) arg2, 1.0F);
        this.field3524.method360(arg0, arg1, 0);
        this.method1662(2);
        this.method1467((byte) 115, false);
        this.method1460(0, 1, this.field3636);
        this.method1479(this.field3648, 16);
        this.method1481(256, 0, -112, class166.field2284);
        this.method1467((byte) 115, true);
        this.method1601(class597.field8397, 0, 256);
        this.method1664((byte) -52, class597.field8397, 0);
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(BI)Lraa;")
    public class606 method1451(byte arg0, int arg1) {
        int var3 = 51 % ((-37 - arg0) / 54);
        ++field3435;
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class367(this) : new class61(this);
                } else {
                    return new class158(this, this.field3399);
                }
            } else {
                return new class552(this);
            }
        } else {
            return new class570(this);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZB)V")
    public final void method1629(boolean arg0, byte arg1) {
        if (!arg0 != !this.field3538) {
            this.field3538 = arg0;
            this.method1448(-92);
            this.field3615 &= -32;
        }
        if (arg1 > -11) {
            this.method1603(-80);
        }
        ++field3402;
    }

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "(I)V")
    public abstract void method1472(int arg0);

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "(B)V")
    public abstract void method1440(byte arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(BZ)V")
    public abstract void method1467(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "(I)V")
    private final void method1630(int arg0) {
        ++field3457;
        if (!this.field3592) {
            float[] var2 = this.field3577;
            float var3 = (float) (-this.field3586 * this.field3562) / (float) this.field3544;
            float var4 = (float) ((-this.field3586 + this.field3384) * this.field3562) / (float) this.field3544;
            float var5 = (float) (this.field3571 * this.field3562) / (float) this.field3539;
            float var6 = (float) ((-this.field3412 + this.field3571) * this.field3562) / (float) this.field3539;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field3562 * 2.0F;
                var2[1] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[12] = 0.0F;
                var2[10] = this.field3607 = (float) this.field3560 / (float) (-this.field3560 + this.field3562);
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[0] = var7 / (var4 - var3);
                var2[15] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[14] = this.field3585 = (float) (this.field3562 * this.field3560) / (float) (-this.field3560 + this.field3562);
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = -1.0F;
                var2[3] = 0.0F;
            } else {
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
            }
            this.method1607((byte) -81);
            this.field3592 = true;
        }
        int var8 = -99 % ((arg0 - -49) / 43);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field3411;
        return new class726(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "(I)V")
    public abstract void method1436(int arg0);

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "()I")
    public final int method404() {
        ++field3389;
        return this.field3608 + -2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ldm;I)V")
    public final void method379(class50 arg0, int arg1) {
        ++field3422;
        this.field3565.method3805(this, arg0, arg1, (byte) -49);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III[BZLbda;BI)Ldh;")
    public abstract class320 method1489(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class505 arg5, byte arg6, int arg7);

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "()I")
    public final int method465() {
        ++field3508;
        return this.field3516 - (-this.field3521 + -this.field3515);
    }

    @OriginalMember(owner = "client!sr", name = "N", descriptor = "(I)V")
    public abstract void method1449(int arg0);

    @OriginalMember(owner = "client!sr", name = "U", descriptor = "(IIIII)V")
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method378(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field3376;
    }

    @OriginalMember(owner = "client!sr", name = "T", descriptor = "(IIII)V")
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        ++field3357;
        boolean var5 = false;
        if (~this.field3605 > ~arg0) {
            this.field3605 = arg0;
            var5 = true;
        }
        if (~this.field3622 < ~arg2) {
            this.field3622 = arg2;
            var5 = true;
        }
        if (~this.field3534 > ~arg1) {
            var5 = true;
            this.field3534 = arg1;
        }
        if (~arg3 > ~this.field3545) {
            this.field3545 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field3655) {
                this.field3655 = true;
                this.method1426(3);
            }
            this.method1446(0);
            this.method1624(9);
        }
    }

    @OriginalMember(owner = "client!sr", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field3522;
        boolean var7 = ~this.field3620 != ~arg0;
        if (var7 || this.field3580 != arg1 || this.field3579 != arg2) {
            this.field3620 = arg0;
            this.field3580 = arg1;
            this.field3579 = arg2;
            if (var7) {
                this.field3604 = (float) (this.field3620 & 65280) / 65280.0F;
                this.field3617 = (float) (this.field3620 & 16711680) / 1.671168E7F;
                this.field3624 = (float) (this.field3620 & 255) / 255.0F;
                this.method1462((byte) -57);
            }
            this.field3494.setSunColour(this.field3617, this.field3604, this.field3624, arg1, arg2);
            this.method1445(false);
        }
        if (this.field3630[0] != arg3 || this.field3630[1] != arg4 || this.field3630[2] != arg5) {
            this.field3630[0] = arg3;
            this.field3630[2] = arg5;
            this.field3630[1] = arg4;
            this.field3632[0] = -arg3;
            this.field3632[1] = -arg4;
            this.field3632[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field3569[0] = arg3 * var8;
            this.field3569[2] = arg5 * var8;
            this.field3569[1] = arg4 * var8;
            this.field3546[0] = -this.field3569[0];
            this.field3546[2] = -this.field3569[2];
            this.field3546[1] = -this.field3569[1];
            this.field3494.setSunDirection(this.field3569[0], this.field3569[1], this.field3569[2]);
            this.method1456(1);
            this.field3578 = (int) (arg5 * 256.0F / arg4);
            this.field3602 = (int) (arg3 * 256.0F / arg4);
        }
        this.method1477(-101);
    }

    @OriginalMember(owner = "client!sr", name = "HA", descriptor = "(IIII[I)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field3474;
        float var6 = this.field3526.method2129(true, (float) arg0, (float) arg2, (float) arg1);
        if (!((float) this.field3562 > var6) && !((float) this.field3560 < var6)) {
            int var7 = (int) ((float) this.field3544 * this.field3526.method2136(-4957, (float) arg0, (float) arg1, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field3539 * this.field3526.method2140((float) arg0, (float) arg1, true, (float) arg2) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field3621);
            arg4[1] = (int) ((float) var8 + -this.field3606);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!sr", name = "O", descriptor = "(I)Lofa;")
    public final class328 method1631(int arg0) {
        ++field3505;
        if (arg0 != 0) {
            this.field3552 = null;
        }
        return this.field3530;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lnga;)V")
    public final void method483(class513 arg0) {
        ++field3398;
        this.field3526 = (class328) arg0;
        this.field3529.method344(this.field3526);
        this.field3529.method2142(61);
        this.field3530.method2147(30188, this.field3529);
        this.field3528.method2147(30188, this.field3526);
        if (this.field3555.method1735(true)) {
            this.method1633(11075);
        }
    }

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "(B)V")
    public final void method1632(byte arg0) {
        ++field3341;
        if (this.field3590[this.field3561] != class245.field3269) {
            this.field3590[this.field3561] = class245.field3269;
            this.field3559[this.field3561].method351();
            this.method1610(28320);
        }
        if (arg0 > -90) {
            this.field3386 = -80;
        }
    }

    @OriginalMember(owner = "client!sr", name = "P", descriptor = "(I)V")
    private final void method1633(int arg0) {
        ++field3333;
        this.field3588 = false;
        if (arg0 != 11075) {
            this.field3553 = null;
        }
        if (this.field3609 != null) {
            this.field3609.method1986(arg0 ^ 11011);
        }
        this.method1440((byte) 20);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3400;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(ZI)V")
    public final void method1634(boolean arg0, int arg1) {
        if (this.field3596 != arg0) {
            this.field3596 = arg0;
            this.method1447(true);
            this.field3615 &= -32;
        }
        ++field3492;
        if (arg1 != -32) {
            this.method488(66, 97, 69, -88, -28, 74, (byte[]) null, 65, -10);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1468(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(II)Lgfa;")
    public final class749 method1635(int arg0, int arg1) {
        if (arg0 != -14589) {
            this.method414();
        }
        ++field3498;
        if (~this.field3645.method1564(true) > ~(arg1 * 2)) {
            this.field3645.method2157(arg1, (byte) -66);
        }
        return this.field3645;
    }

    @OriginalMember(owner = "client!sr", name = "xa", descriptor = "(F)V")
    public final void method406(float arg0) {
        ++field3476;
        if (this.field3597 != arg0) {
            this.field3597 = arg0;
            this.field3494.setAmbient(arg0);
            this.method1462((byte) -57);
            this.method1477(-76);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLkt;BI)V")
    public abstract void method1438(boolean arg0, class155 arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "(B)V")
    public abstract void method1455(byte arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(ZB)V")
    public final void method1636(boolean arg0, byte arg1) {
        if (this.field3581 == !arg0) {
            this.field3581 = arg0;
            this.method1480(119);
        }
        ++field3439;
        if (arg1 != 20) {
            this.method1438(true, (class155) null, (byte) -104, 36);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZZIII)V")
    private final void method1637(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field3520;
        boolean var7 = arg2 & this.method396();
        if (!var7 && (~arg5 == -5 || arg5 == 8 || arg5 == 9)) {
            arg5 = 2;
            arg0 = ~arg5 != -5 ? 1 : 1 & arg4;
            arg4 = 0;
        }
        if (arg5 != 0 && arg1) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (~this.field3557 != ~arg5) {
            if (~this.field3557 != -1) {
                this.field3613[this.field3557 & Integer.MAX_VALUE].method521((byte) 93);
            }
            if (arg5 != 0) {
                this.field3609 = this.field3613[Integer.MAX_VALUE & arg5];
                this.field3609.method517(arg1, -107);
                this.field3609.method518(5486, arg1);
                this.field3609.method516(arg0, 118, arg4);
            } else {
                this.field3609 = null;
            }
            this.field3572 = arg0;
            this.field3557 = arg5;
            this.field3536 = arg4;
        } else if (this.field3557 != 0) {
            this.field3613[this.field3557 & Integer.MAX_VALUE].method518(5486, arg1);
            if (this.field3536 != arg4 || ~this.field3572 != ~arg0) {
                this.field3613[Integer.MAX_VALUE & this.field3557].method516(arg0, 123, arg4);
                this.field3536 = arg4;
                this.field3572 = arg0;
            }
        }
        int var8 = 97 / ((-27 - arg3) / 40);
    }

    @OriginalMember(owner = "client!sr", name = "DA", descriptor = "(IIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3) {
        this.field3586 = arg0;
        ++field3363;
        this.field3571 = arg1;
        this.field3539 = arg3;
        this.field3544 = arg2;
        this.method1644(2);
        this.method1652(-35);
        this.method1617(false);
        this.method1624(9);
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(ZI)V")
    public final void method1638(boolean arg0, int arg1) {
        if (this.field3549 != arg0) {
            this.field3549 = arg0;
            this.method1480(60);
            this.field3615 &= -32;
        }
        ++field3453;
        if (arg1 != 8406) {
            this.field3579 = -1.7779076F;
        }
    }

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "(B)V")
    public abstract void method1464(byte arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3420;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([IIIIIZ)Loia;")
    public final class88 method421(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3419;
        return new class697(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "(B)V")
    public abstract void method1442(byte arg0);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[[IBZ)Lgw;")
    public abstract class168 method1483(int arg0, int[][] arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!sr", name = "Q", descriptor = "(I)V")
    public final void method1639(int arg0) {
        if (arg0 == 256) {
            ++field3383;
            if (~this.field3615 != -5) {
                this.method1665(0);
                this.method1638(false, 8406);
                this.method1645(false, -22042);
                this.method1634(false, -32);
                this.method1629(false, (byte) -29);
                this.method1605(false, -2, arg0 + 31986, false);
                this.method1602(arg0 + -257, 1);
                this.method1628((byte) -36, 0);
                this.field3615 = 4;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(ZI)V")
    public final void method1640(boolean arg0, int arg1) {
        ++field3484;
        if (arg0) {
            if (this.field3547 != arg1) {
                this.field3547 = arg1;
                this.method1472(-5617);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILik;IILgfa;I)V")
    public abstract void method1475(int arg0, int arg1, class207 arg2, int arg3, int arg4, class749 arg5, int arg6);

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([I)V")
    public final void method420(int[] arg0) {
        arg0[1] = this.field3412;
        ++field3489;
        arg0[0] = this.field3384;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lik;IZ)V")
    private final void method1641(class207 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field3538 = false;
        }
        ++field3451;
        this.method1460(0, 1, this.field3643);
        this.method1479(this.field3641, 16);
        this.method1481(arg1, 0, 127, arg0);
    }

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "(B)V")
    private final void method1642(byte arg0) {
        int var2 = 89 / ((60 - arg0) / 59);
        ++field3514;
        if (this.field3380 == null) {
            this.field3493 = this.field3386 = 1;
        } else {
            Dimension var3 = this.field3380.getSize();
            this.field3386 = var3.height;
            this.field3493 = var3.width;
        }
        this.field3384 = this.field3493;
        this.field3412 = this.field3386;
        this.method1656(-123);
        this.method1652(-13);
        this.method1644(2);
        this.method1474(13);
        this.method1624(9);
        this.method1617(false);
        this.method424();
    }

    @OriginalMember(owner = "client!sr", name = "aa", descriptor = "(IIIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1588(-16356);
        ++field3338;
        this.method1640(true, arg4);
        this.method1664((byte) -81, class679.field9315, 0);
        this.method1601(class679.field9315, 0, 256);
        this.method1602(-1, arg5);
        this.field3524.method2144((float) arg3, 0, (float) arg2, 1.0F);
        this.field3524.method360(arg0, arg1, 0);
        this.method1662(2);
        this.method1467((byte) 115, false);
        this.method1616(60);
        this.method1467((byte) 115, true);
        this.method1601(class597.field8397, 0, 256);
        this.method1664((byte) -108, class597.field8397, 0);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lqm;[Ldga;Z)Lda;")
    public final class59 method459(class143 arg0, class204[] arg1, boolean arg2) {
        ++field3509;
        return new class550(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "R", descriptor = "(I)V")
    public final void method1643(int arg0) {
        ++field3485;
        Hashtable var2 = new Hashtable();
        if (this.field3337 != null && !this.field3337.isEmpty()) {
            Enumeration var3 = this.field3337.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1465(var4, (byte) -91));
            }
        }
        this.field3337 = var2;
        this.method1606(arg0 ^ 92);
        this.method1626(arg0 + arg0);
        this.method1625((byte) 107);
        this.field3565.method3809((byte) 125, this);
    }

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        ++field3449;
        if (~this.field3627 != ~arg0 || ~this.field3591 != ~arg1 || ~this.field3619 != ~arg2) {
            this.field3591 = arg1;
            this.field3627 = arg0;
            this.field3619 = arg2;
            this.method1653(1);
            this.method1480(75);
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
    public final void method402(int arg0) {
        ++field3502;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sr", name = "S", descriptor = "(I)V")
    private final void method1644(int arg0) {
        if (arg0 != 2) {
            this.field3542 = -18;
        }
        ++field3353;
        this.field3533 = false;
        this.method1627((byte) 96);
        if (class125.field1519 == this.field3555) {
            this.method1621(arg0 ^ -3009);
        }
    }

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "()Lnga;")
    public final class513 method427() {
        ++field3395;
        return new class328();
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(ZI)V")
    public final void method1645(boolean arg0, int arg1) {
        if (arg1 != -22042) {
            this.method381((class50) null);
        }
        if (!arg0 != !this.field3593) {
            this.field3593 = arg0;
            this.method1442((byte) -124);
            this.field3615 &= -8;
        }
        ++field3352;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(FI)V")
    public final void method1646(float arg0, int arg1) {
        if (this.field3595 != arg0) {
            this.field3595 = arg0;
            this.method1644(2);
        }
        if (arg1 == 31823) {
            ++field3349;
        }
    }

    @OriginalMember(owner = "client!sr", name = "T", descriptor = "(I)V")
    private final void method1647(int arg0) {
        ++field3483;
        if (arg0 == 3584) {
            this.method1460(0, arg0 ^ 3585, this.field3654);
            this.method1479(this.field3646, 16);
            this.method1481(1, 0, 119, class658.field9019);
        }
    }

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(Z)V")
    public abstract void method1487(boolean arg0);

    @OriginalMember(owner = "client!sr", name = "U", descriptor = "(I)V")
    public abstract void method1427(int arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(IB)V")
    public final void method1648(int arg0, byte arg1) {
        if (arg1 == 66) {
            if (~this.field3561 != ~arg0) {
                this.field3561 = arg0;
                this.method1443((byte) -127);
            }
            ++field3392;
        }
    }

    @OriginalMember(owner = "client!sr", name = "V", descriptor = "(I)I")
    public final int method1649(int arg0) {
        if (arg0 != 3) {
            this.method1459(-99);
        }
        ++field3466;
        return this.field3568;
    }

    @OriginalMember(owner = "client!sr", name = "Y", descriptor = "()[I")
    public final int[] method395() {
        ++field3428;
        return new int[] { this.field3586, this.field3571, this.field3544, this.field3539 };
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[IZIZ)Ldh;")
    public final class320 method1650(int arg0, int[] arg1, boolean arg2, int arg3, boolean arg4) {
        ++field3401;
        if (arg4) {
            this.field3532 = 0.6237492F;
        }
        return this.method1458(0, -20, arg3, arg0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "()Z")
    public final boolean method462() {
        ++field3440;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "(Z)V")
    public abstract void method1434(boolean arg0);

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "(B)I")
    public final int method1651(byte arg0) {
        if (arg0 >= -121) {
            this.field3656 = -95;
        }
        ++field3432;
        return this.field3535;
    }

    @OriginalMember(owner = "client!sr", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field3469;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
    public final void method416(int arg0) {
        ++field3495;
    }

    @OriginalMember(owner = "client!sr", name = "W", descriptor = "(I)V")
    private final void method1652(int arg0) {
        int var2 = -48 % ((67 - arg0) / 54);
        this.field3592 = false;
        ++field3501;
        this.method1630(33);
        if (class228.field3061 == this.field3555) {
            this.method1621(-3011);
        }
    }

    @OriginalMember(owner = "client!sr", name = "Y", descriptor = "(I)V")
    private final void method1653(int arg0) {
        if (this.field3609 != null) {
            this.field3609.method1984(arg0 + 25410);
        }
        if (arg0 != 1) {
            this.method1667((byte) -3);
        }
        ++field3360;
        this.method1470(5);
    }

    @OriginalMember(owner = "client!sr", name = "Z", descriptor = "(I)V")
    public abstract void method1456(int arg0);

    @OriginalMember(owner = "client!sr", name = "EA", descriptor = "(IIII)V")
    public final void method444(int arg0, int arg1, int arg2, int arg3) {
        ++field3436;
        if (!this.field3582) {
            throw new RuntimeException("");
        } else {
            this.field3610 = arg0;
            this.field3568 = arg1;
            this.field3556 = arg3;
            this.field3535 = arg2;
            if (this.field3584) {
                this.field3613[3].method1989(-119);
                this.field3613[3].method1984(25411);
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "ab", descriptor = "(I)Lofa;")
    public final class328 method1654(int arg0) {
        ++field3477;
        int var2 = 48 % ((-7 - arg0) / 45);
        if (!this.field3588) {
            this.field3531.method2131(this.field3529, this.field3524);
            this.field3588 = true;
        }
        return this.field3531;
    }

    @OriginalMember(owner = "client!sr", name = "bb", descriptor = "(I)V")
    public abstract void method1446(int arg0);

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "(B)I")
    public final int method1655(byte arg0) {
        ++field3523;
        if (arg0 != 123) {
            this.field3585 = -1.6976256F;
        }
        return this.field3561;
    }

    @OriginalMember(owner = "client!sr", name = "cb", descriptor = "(I)V")
    private final void method1656(int arg0) {
        ++field3388;
        int var2 = -117 % ((-32 - arg0) / 48);
        this.field3548 = false;
        if (class357.field5086 == this.field3555) {
            this.method1594(77);
            this.method1621(-3011);
        }
    }

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "()Lnga;")
    public final class513 method439() {
        ++field3464;
        return this.field3637;
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(IB)V")
    public abstract void method1430(int arg0, byte arg1);

    @OriginalMember(owner = "client!sr", name = "ra", descriptor = "(IIII)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3) {
        ++field3406;
        this.field3582 = true;
        this.field3568 = arg1;
        this.field3556 = arg3;
        this.field3610 = arg0;
        this.field3535 = arg2;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[F)[F")
    public final float[] method1657(int arg0, float[] arg1) {
        arg1[4] = this.field3553[1];
        ++field3430;
        arg1[0] = this.field3553[0];
        arg1[8] = this.field3553[2];
        if (arg0 != -20248) {
            this.method1458(126, 34, 4, 34, -122, (int[]) null, false);
        }
        arg1[12] = this.field3553[3];
        arg1[2] = this.field3553[8];
        arg1[5] = this.field3553[5];
        arg1[13] = this.field3553[7];
        arg1[9] = this.field3553[6];
        arg1[1] = this.field3553[4];
        arg1[14] = this.field3553[11];
        arg1[6] = this.field3553[9];
        arg1[10] = this.field3553[10];
        arg1[3] = this.field3553[12];
        arg1[7] = this.field3553[13];
        arg1[15] = this.field3553[15];
        arg1[11] = this.field3553[14];
        return arg1;
    }

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "(Z)Lofa;")
    public final class328 method1658(boolean arg0) {
        if (arg0) {
            this.method1474(-100);
        }
        ++field3355;
        return this.field3559[this.field3561];
    }

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "(B)V")
    public void method1453(byte arg0) {
        if (arg0 > -56) {
            this.field3550 = false;
        }
        this.field3600 = this.field3589;
        ++field3408;
        this.field3589 = 0;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLkt;IZZ)V")
    public abstract void method1450(boolean arg0, class155 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "(B)V")
    public final void method1659(byte arg0) {
        ++field3375;
        this.field3524.method351();
        this.field3517 = true;
        this.method1599(-12912);
        if (arg0 <= 95) {
            this.field3526 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method403(Canvas arg0, int arg1, int arg2) {
        ++field3475;
        if (this.field3454 == arg0) {
            throw new RuntimeException();
        } else if (!this.field3337.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1465(arg0, (byte) -123);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field3337.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "(B)V")
    private final void method1660(byte arg0) {
        this.field3570 = (float) this.field3560;
        if (arg0 != 75) {
            this.method1665(49);
        }
        ++field3467;
    }

    @OriginalMember(owner = "client!sr", name = "db", descriptor = "(I)[F")
    public final float[] method1661(int arg0) {
        ++field3413;
        if (arg0 != -10579) {
            this.field3587 = 77;
        }
        return this.field3626;
    }

    @OriginalMember(owner = "client!sr", name = "eb", descriptor = "(I)V")
    public final void method1662(int arg0) {
        if (arg0 != 2) {
            this.method1653(-46);
        }
        ++field3367;
        this.field3517 = false;
        this.method1599(-12912);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lma;I)V")
    public final void method1663(class12 arg0, int arg1) {
        ++field3500;
        if (this.field3575[this.field3561] != arg0) {
            this.field3575[this.field3561] = arg0;
            if (arg0 == null) {
                this.method1425((byte) -45);
            } else {
                arg0.method80(20276);
            }
            this.field3615 &= -2;
        }
        if (arg1 != -2) {
            this.method1592((byte) 115);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLkt;I)V")
    public final void method1664(byte arg0, class155 arg1, int arg2) {
        ++field3481;
        this.method1450(false, arg1, arg2, false, false);
        if (arg0 > -42) {
            this.method436();
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3350;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Z)V")
    public abstract void method1428(Canvas arg0, Object arg1, boolean arg2);

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(II)V")
    public final void method455(int arg0, int arg1) {
        if (~this.field3562 != ~arg0 || this.field3560 != arg1) {
            this.field3562 = arg0;
            this.field3560 = arg1;
            this.method1652(121);
            this.method1644(2);
            this.method1653(1);
        }
        ++field3460;
    }

    @OriginalMember(owner = "client!sr", name = "fb", descriptor = "(I)V")
    private final void method1665(int arg0) {
        if (class357.field5086 != this.field3555) {
            class266 var2 = this.field3555;
            this.field3555 = class357.field5086;
            if (var2.method1735(true)) {
                this.method1633(11075);
            }
            this.method1594(arg0 ^ 114);
            this.field3553 = this.field3558;
            this.method1621(arg0 ^ -3011);
            this.field3615 &= -25;
        }
        if (arg0 != 0) {
            this.method1427(-25);
        }
        ++field3465;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIF)Lwi;")
    public final class465 method475(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field3446;
        return new class573(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public final void method373(boolean arg0) {
        ++field3426;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljaclib/memory/Buffer;Z)Ljaclib/memory/Stream;")
    public final Stream method1666(Buffer arg0, boolean arg1) {
        ++field3361;
        this.field3611.method3659(arg0);
        if (!arg1) {
            this.field3631 = false;
        }
        return this.field3611;
    }

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "(B)V")
    public abstract void method1425(byte arg0);

    @OriginalMember(owner = "client!sr", name = "M", descriptor = "()I")
    public final int method407() {
        ++field3404;
        return this.field3656;
    }

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "(B)V")
    public final void method1667(byte arg0) {
        if (arg0 >= 76) {
            this.method1617(false);
            ++field3356;
            this.method1621(-3011);
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(II)I")
    public final int method479(int arg0, int arg1) {
        ++field3358;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "(B)V")
    public final void method1668(byte arg0) {
        ++field3423;
        Enumeration var2 = this.field3337.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1428(var3, this.field3337.get(var3), true);
        }
        this.field3643.method1059(arg0 + 5369);
        this.field3654.method1059(5342);
        this.field3636.method1059(5342);
        this.field3639.method3932((byte) 25);
        this.field3642.method3932((byte) 25);
        this.field3638.method3932((byte) 25);
        this.field3635.method3932((byte) 25);
        if (arg0 == -27) {
            this.field3649.method3932((byte) 25);
            this.field3565.method3807(112);
            this.field3645.method1059(5342);
        }
    }

    @OriginalMember(owner = "client!sr", name = "da", descriptor = "(III[I)V")
    public final void method423(int arg0, int arg1, int arg2, int[] arg3) {
        ++field3387;
        float var5 = this.field3526.method2129(true, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field3586;
            var7 = this.field3571;
        } else {
            var6 = (int) ((float) this.field3544 * this.field3526.method2136(-4957, (float) arg0, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field3539 * this.field3526.method2140((float) arg0, (float) arg1, true, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field3621);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 + -this.field3606);
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "()Z")
    public final boolean method392() {
        ++field3342;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "(B)V")
    public abstract void method1462(byte arg0);

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "()Z")
    public final boolean method487() {
        ++field3372;
        return true;
    }

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "(Z)V")
    public final void method1669(boolean arg0) {
        if (arg0) {
            this.field3542 = -7;
        }
        ++field3335;
        if (~this.field3615 != -3) {
            this.method1665(0);
            this.method1638(false, 8406);
            this.method1645(false, -22042);
            this.method1634(false, -32);
            this.method1629(false, (byte) -53);
            this.method1605(false, -2, 32242, false);
            this.field3615 = 2;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILbda;ZIB[F)Ldh;")
    public final class320 method1670(int arg0, class505 arg1, boolean arg2, int arg3, byte arg4, float[] arg5) {
        if (arg4 != -53) {
            this.field3559 = null;
        }
        ++field3479;
        return this.method1441(111, 0, arg0, arg1, 0, arg3, arg5, arg2);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ldm;)V")
    public final void method381(class50 arg0) {
        this.field3565.method3805(this, arg0, -1, (byte) -49);
        ++field3354;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILbda;II[FZ)Ldh;")
    public abstract class320 method1441(int arg0, int arg1, int arg2, class505 arg3, int arg4, int arg5, float[] arg6, boolean arg7);
}
