import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class246 extends class280 implements class7 {

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ldu;")
    private class393 field3338 = new class393();

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Lbd;")
    private class327 field3349 = new class338();

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Z")
    private boolean field3356 = false;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    private int field3354 = -1;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public int field3351 = 8;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public int field3361 = 3;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "[Lti;")
    private class7[] field3363 = new class7[4];

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lvf;")
    private class166 field3360 = new class166();

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lvf;")
    private class166 field3364 = new class166();

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lvf;")
    private class166 field3365 = new class166();

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lvf;")
    private class166 field3366 = new class166();

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lvf;")
    private class166 field3367 = new class166();

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lvf;")
    private class166 field3368 = new class166();

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Lvf;")
    private class166 field3369 = new class166();

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    private int field3376 = 0;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "[F")
    public float[] field3385 = new float[4];

    @OriginalMember(owner = "client!ic", name = "qb", descriptor = "I")
    public int field3390 = 3584;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    public int field3383 = 512;

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "[F")
    private float[] field3389 = new float[4];

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "F")
    public float field3371 = -1.0F;

    @OriginalMember(owner = "client!ic", name = "tb", descriptor = "F")
    private float field3393 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "Ob", descriptor = "I")
    private int field3414 = 8448;

    @OriginalMember(owner = "client!ic", name = "Rb", descriptor = "I")
    private int field3417 = -1;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public int field3382 = 50;

    @OriginalMember(owner = "client!ic", name = "Cb", descriptor = "I")
    public int field3402 = 0;

    @OriginalMember(owner = "client!ic", name = "nc", descriptor = "F")
    private float field3439 = 0.0F;

    @OriginalMember(owner = "client!ic", name = "Kb", descriptor = "I")
    public int field3410 = -1;

    @OriginalMember(owner = "client!ic", name = "Ub", descriptor = "I")
    private int field3420 = 0;

    @OriginalMember(owner = "client!ic", name = "yb", descriptor = "F")
    public float field3398 = -1.0F;

    @OriginalMember(owner = "client!ic", name = "ic", descriptor = "F")
    public float field3434 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "Nb", descriptor = "F")
    public float field3413 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "Ib", descriptor = "[F")
    private float[] field3408 = new float[4];

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    private int field3374 = 0;

    @OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
    private int field3396 = 0;

    @OriginalMember(owner = "client!ic", name = "bc", descriptor = "I")
    public int field3427 = -1;

    @OriginalMember(owner = "client!ic", name = "Gb", descriptor = "F")
    public float field3406 = 3584.0F;

    @OriginalMember(owner = "client!ic", name = "kc", descriptor = "[F")
    private float[] field3436 = new float[4];

    @OriginalMember(owner = "client!ic", name = "Xb", descriptor = "I")
    public int field3423 = 512;

    @OriginalMember(owner = "client!ic", name = "Ac", descriptor = "F")
    public float field3452 = 3584.0F;

    @OriginalMember(owner = "client!ic", name = "Hc", descriptor = "F")
    private float field3459 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "Mc", descriptor = "I")
    private int field3464 = 8448;

    @OriginalMember(owner = "client!ic", name = "Pc", descriptor = "I")
    private int field3467 = 0;

    @OriginalMember(owner = "client!ic", name = "Rc", descriptor = "I")
    public int field3469 = 0;

    @OriginalMember(owner = "client!ic", name = "Oc", descriptor = "I")
    private int field3466 = 0;

    @OriginalMember(owner = "client!ic", name = "Bc", descriptor = "I")
    public int field3453 = 0;

    @OriginalMember(owner = "client!ic", name = "uc", descriptor = "I")
    private int field3446 = -1;

    @OriginalMember(owner = "client!ic", name = "Jc", descriptor = "Z")
    private boolean field3461 = true;

    @OriginalMember(owner = "client!ic", name = "Jb", descriptor = "I")
    private int field3409 = 0;

    @OriginalMember(owner = "client!ic", name = "Wc", descriptor = "F")
    public float field3474 = 1.0F;

    @OriginalMember(owner = "client!ic", name = "Tc", descriptor = "[F")
    private float[] field3471 = new float[16];

    @OriginalMember(owner = "client!ic", name = "Yc", descriptor = "I")
    public int field3476 = -1;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3346;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Ljaggl/context;")
    private context field3341;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Ljaggl/opengl;")
    public opengl field3342;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Z")
    public boolean field3370;

    @OriginalMember(owner = "client!ic", name = "zc", descriptor = "I")
    public int field3451;

    @OriginalMember(owner = "client!ic", name = "Lc", descriptor = "Ljava/lang/String;")
    private String field3463;

    @OriginalMember(owner = "client!ic", name = "qc", descriptor = "Ljava/lang/String;")
    private String field3442;

    @OriginalMember(owner = "client!ic", name = "oc", descriptor = "Z")
    private boolean field3440;

    @OriginalMember(owner = "client!ic", name = "Fc", descriptor = "Z")
    public boolean field3457;

    @OriginalMember(owner = "client!ic", name = "Kc", descriptor = "Z")
    public boolean field3462;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "Z")
    public boolean field3386;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "Z")
    private boolean field3384;

    @OriginalMember(owner = "client!ic", name = "cc", descriptor = "Z")
    public boolean field3428;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lhp;")
    public class95 field3345;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lwf;")
    private class1 field3339;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lwp;")
    private class266 field3348;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Ljn;")
    private class431 field3344;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "[I")
    private static int[] field3340 = new int[1000];

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field3347 = Boolean.FALSE;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[F")
    private static float[] field3343 = new float[4];

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "[F")
    private static float[] field3357 = new float[4];

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "F")
    private float field3373;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "F")
    public float field3378;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "F")
    public float field3379;

    @OriginalMember(owner = "client!ic", name = "sb", descriptor = "F")
    public float field3392;

    @OriginalMember(owner = "client!ic", name = "ub", descriptor = "F")
    private float field3394;

    @OriginalMember(owner = "client!ic", name = "Lb", descriptor = "F")
    private float field3411;

    @OriginalMember(owner = "client!ic", name = "Vb", descriptor = "F")
    public float field3421;

    @OriginalMember(owner = "client!ic", name = "Yb", descriptor = "F")
    public float field3424;

    @OriginalMember(owner = "client!ic", name = "gc", descriptor = "F")
    public float field3432;

    @OriginalMember(owner = "client!ic", name = "xc", descriptor = "F")
    public float field3449;

    @OriginalMember(owner = "client!ic", name = "Uc", descriptor = "F")
    public float field3472;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    private int field3355;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!ic", name = "Bb", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!ic", name = "Eb", descriptor = "I")
    private int field3404;

    @OriginalMember(owner = "client!ic", name = "Fb", descriptor = "I")
    private int field3405;

    @OriginalMember(owner = "client!ic", name = "ac", descriptor = "I")
    private int field3426;

    @OriginalMember(owner = "client!ic", name = "mc", descriptor = "I")
    private int field3438;

    @OriginalMember(owner = "client!ic", name = "rc", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!ic", name = "tc", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!ic", name = "wc", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!ic", name = "Ec", descriptor = "I")
    private int field3456;

    @OriginalMember(owner = "client!ic", name = "Ic", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!ic", name = "Qc", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!ic", name = "Vc", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!ic", name = "dc", descriptor = "J")
    private long field3429;

    @OriginalMember(owner = "client!ic", name = "Sb", descriptor = "Ltr;")
    public class151 field3418;

    @OriginalMember(owner = "client!ic", name = "hc", descriptor = "Ltr;")
    public class151 field3433;

    @OriginalMember(owner = "client!ic", name = "vc", descriptor = "Ltr;")
    public class151 field3447;

    @OriginalMember(owner = "client!ic", name = "lc", descriptor = "Ljs;")
    public class161 field3437;

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "Len;")
    private class271 field3387;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "Lrl;")
    public class286 field3375;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lrl;")
    public class286 field3380;

    @OriginalMember(owner = "client!ic", name = "Db", descriptor = "Lrl;")
    public class286 field3403;

    @OriginalMember(owner = "client!ic", name = "Mb", descriptor = "Lrl;")
    public class286 field3412;

    @OriginalMember(owner = "client!ic", name = "Qb", descriptor = "Lrl;")
    public class286 field3416;

    @OriginalMember(owner = "client!ic", name = "fc", descriptor = "Lrl;")
    public class286 field3431;

    @OriginalMember(owner = "client!ic", name = "pc", descriptor = "Lrl;")
    public class286 field3441;

    @OriginalMember(owner = "client!ic", name = "Gc", descriptor = "Lrl;")
    public class286 field3458;

    @OriginalMember(owner = "client!ic", name = "xb", descriptor = "Lij;")
    public class338 field3397;

    @OriginalMember(owner = "client!ic", name = "Pb", descriptor = "Lij;")
    public class338 field3415;

    @OriginalMember(owner = "client!ic", name = "Cc", descriptor = "Llm;")
    private class374 field3454;

    @OriginalMember(owner = "client!ic", name = "zb", descriptor = "Leb;")
    private class416 field3399;

    @OriginalMember(owner = "client!ic", name = "Sc", descriptor = "Lhs;")
    private class455 field3470;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lti;")
    private class7 field3352;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Z")
    private boolean field3372;

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "Z")
    private boolean field3388;

    @OriginalMember(owner = "client!ic", name = "rb", descriptor = "Z")
    private boolean field3391;

    @OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Z")
    private boolean field3400;

    @OriginalMember(owner = "client!ic", name = "Hb", descriptor = "Z")
    public boolean field3407;

    @OriginalMember(owner = "client!ic", name = "Tb", descriptor = "Z")
    public boolean field3419;

    @OriginalMember(owner = "client!ic", name = "Wb", descriptor = "Z")
    public boolean field3422;

    @OriginalMember(owner = "client!ic", name = "Zb", descriptor = "Z")
    private boolean field3425;

    @OriginalMember(owner = "client!ic", name = "ec", descriptor = "Z")
    private boolean field3430;

    @OriginalMember(owner = "client!ic", name = "jc", descriptor = "Z")
    private boolean field3435;

    @OriginalMember(owner = "client!ic", name = "sc", descriptor = "Z")
    private boolean field3444;

    @OriginalMember(owner = "client!ic", name = "yc", descriptor = "Z")
    private boolean field3450;

    @OriginalMember(owner = "client!ic", name = "Dc", descriptor = "Z")
    public boolean field3455;

    @OriginalMember(owner = "client!ic", name = "Nc", descriptor = "Z")
    public boolean field3465;

    @OriginalMember(owner = "client!ic", name = "Xc", descriptor = "Z")
    private boolean field3475;

    @OriginalMember(owner = "client!ic", name = "vb", descriptor = "[Lvd;")
    private class5[] field3395;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "()V")
    private final void method1337() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field3341.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class85.method433(1000L, 89);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public final void method1339(int arg0, boolean arg1) {
        this.method1446(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public final void method1340(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3376 < arg0) {
            this.field3376 = arg0;
        }
        if (this.field3466 > arg2) {
            this.field3466 = arg2;
        }
        if (this.field3409 < arg1) {
            this.field3409 = arg1;
        }
        if (this.field3374 > arg3) {
            this.field3374 = arg3;
        }
        this.field3342.glEnable(3089);
        this.method1423();
        this.method1368();
    }

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "()V")
    public final void method1341() {
        this.method1441(true);
        this.field3342.glClear(256);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public final void method1342(boolean arg0) {
    }

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "()V")
    private final void method1343() {
        if (this.field3438 == 1) {
            return;
        }
        this.field3342.glMatrixMode(5889);
        this.field3342.glLoadIdentity();
        if (this.field3362 > 0 && this.field3350 > 0) {
            this.field3342.glOrtho(0.0D, (double) this.field3362, (double) this.field3350, 0.0D, -1.0D, 1.0D);
        }
        this.field3342.glMatrixMode(5888);
        this.field3342.glLoadIdentity();
        this.field3438 = 1;
        this.field3456 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "()Lbd;")
    public final class327 method1344() {
        return new class338();
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
    public final int method1345() {
        return 4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lkp;IIII)Lqh;")
    public final class352 method1346(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class286(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIIIII)Z")
    public final boolean method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field3397.field4859 + (float) arg0 * this.field3397.field4861 + (float) arg1 * this.field3397.field4866 + this.field3397.field4864;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3397.field4859 + (float) arg3 * this.field3397.field4861 + (float) arg4 * this.field3397.field4866 + this.field3397.field4864;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field3382) || !(var8 < (float) this.field3382)) || !(!(var7 > (float) this.field3390) || !(var8 > (float) this.field3390))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field3397.field4868 + (float) arg0 * this.field3397.field4863 + (float) arg1 * this.field3397.field4867 + this.field3397.field4858) * (float) this.field3383 / var7);
        int var10 = (int) (((float) arg5 * this.field3397.field4868 + (float) arg3 * this.field3397.field4863 + (float) arg4 * this.field3397.field4867 + this.field3397.field4858) * (float) this.field3383 / var8);
        if ((float) var9 < this.field3432 && (float) var10 < this.field3432 || (float) var9 > this.field3378 && (float) var10 > this.field3378) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field3397.field4869 + (float) arg0 * this.field3397.field4857 + (float) arg1 * this.field3397.field4860 + this.field3397.field4862) * (float) this.field3423 / var7);
            int var12 = (int) (((float) arg5 * this.field3397.field4869 + (float) arg3 * this.field3397.field4857 + (float) arg4 * this.field3397.field4860 + this.field3397.field4862) * (float) this.field3423 / var8);
            return (!((float) var11 < this.field3449) || !((float) var12 < this.field3449)) && (!((float) var11 > this.field3379) || !((float) var12 > this.field3379));
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lti;)V")
    public final void method1348(class7 arg0) {
        if (this.field3354 >= 3) {
            throw new RuntimeException();
        }
        if (this.field3354 >= 0) {
            this.field3363[this.field3354].method50();
        }
        this.field3352 = this.field3363[++this.field3354] = arg0;
        this.field3352.method48();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Leb;")
    public final class416 method1349(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class416) (this.field3440 && !arg2 || this.field3384 ? new class235(this, arg0, arg1, arg2) : new class389(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public final synchronized void method1350(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3364.method812((byte) 38)) {
            class363 var4 = (class363) this.field3364.method810(26315);
            field3340[var2++] = (int) var4.field1776;
            this.field3358 -= var4.field5221;
            if (var2 == 1000) {
                this.field3342.glDeleteBuffersARB(var2, field3340, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3342.glDeleteBuffersARB(var2, field3340, 0);
            var2 = 0;
        }
        while (!this.field3365.method812((byte) 42)) {
            class363 var5 = (class363) this.field3365.method810(26315);
            field3340[var2++] = (int) var5.field1776;
            this.field3353 -= var5.field5221;
            if (var2 == 1000) {
                this.field3342.glDeleteTextures(var2, field3340, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3342.glDeleteTextures(var2, field3340, 0);
            var2 = 0;
        }
        while (!this.field3366.method812((byte) 90)) {
            class363 var6 = (class363) this.field3366.method810(26315);
            field3340[var2++] = var6.field5221;
            if (var2 == 1000) {
                this.field3342.glDeleteFramebuffersEXT(var2, field3340, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3342.glDeleteFramebuffersEXT(var2, field3340, 0);
            var2 = 0;
        }
        while (!this.field3367.method812((byte) -87)) {
            class363 var7 = (class363) this.field3367.method810(26315);
            field3340[var2++] = (int) var7.field1776;
            this.field3355 -= var7.field5221;
            if (var2 == 1000) {
                this.field3342.glDeleteRenderbuffersEXT(var2, field3340, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3342.glDeleteRenderbuffersEXT(var2, field3340, 0);
            var2 = 0;
        }
        while (!this.field3368.method812((byte) 86)) {
            class363 var8 = (class363) this.field3368.method810(26315);
            field3340[var2++] = (int) var8.field1776;
            if (var2 == 1000) {
                this.field3342.glDeleteProgramsARB(var2, field3340, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3342.glDeleteProgramsARB(var2, field3340, 0);
            boolean var9 = false;
        }
        while (!this.field3360.method812((byte) 109)) {
            class363 var10 = (class363) this.field3360.method810(26315);
            this.field3342.glDeleteLists((int) var10.field1776, var10.field5221);
        }
        while (!this.field3369.method812((byte) 78)) {
            class363 var11 = (class363) this.field3369.method810(26315);
            this.field3342.glDeleteObjectARB(var11.field5221);
        }
        while (!this.field3360.method812((byte) -50)) {
            class363 var12 = (class363) this.field3360.method810(26315);
            this.field3342.glDeleteLists((int) var12.field1776, var12.field5221);
        }
        if (this.method1409() > 100663296 && class434.method2591(-19310) > this.field3429 + 60000L) {
            System.gc();
            this.field3429 = class434.method2591(-19310);
        }
        this.field3359 = var3;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(IIII)V")
    public final void method1351(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field3362) {
            arg2 = this.field3362;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field3350) {
            arg3 = this.field3350;
        }
        this.field3376 = arg0;
        this.field3409 = arg1;
        this.field3466 = arg2;
        this.field3374 = arg3;
        this.field3342.glEnable(3089);
        this.method1423();
        this.method1368();
    }

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "()V")
    public final void method1352() {
        this.field3376 = 0;
        this.field3409 = 0;
        this.field3466 = this.field3362;
        this.field3374 = this.field3350;
        this.field3342.glDisable(3089);
        this.method1423();
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
    public final void method1353(boolean arg0) {
        if (this.field3425 != arg0) {
            this.field3425 = arg0;
            this.method1406();
            this.field3456 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "()V")
    private final void method1354() {
        field3343[0] = this.field3472 * this.field3413;
        field3343[1] = this.field3472 * this.field3434;
        field3343[2] = this.field3474 * this.field3472;
        field3343[3] = 1.0F;
        this.field3342.glLightModelfv(2899, field3343, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIIII)Lrg;")
    public final class395 method1355(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class439(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "()Lti;")
    public final class7 method1356() {
        return this.field3352;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)V")
    public final synchronized void method1357(int arg0, int arg1) {
        class363 var3 = new class363(arg1);
        var3.field1776 = (long) arg0;
        this.field3364.method803(var3, 50);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lhs;)V")
    public final void method1358(class455 arg0) {
        if (this.field3470 != arg0 && this.field3440) {
            this.field3342.glBindBufferARB(34963, arg0.method747());
            this.field3470 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "()Z")
    public final boolean method1359() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)V")
    public final void method1360(int arg0, int arg1) {
        if (this.field3460 != 0) {
            this.field3342.glTexEnvi(8960, 34161, arg0);
            this.field3342.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field3414 != arg0) {
            this.field3342.glTexEnvi(8960, 34161, arg0);
            this.field3414 = arg0;
            var3 = true;
        }
        if (this.field3464 != arg1) {
            this.field3342.glTexEnvi(8960, 34162, arg1);
            this.field3464 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field3456 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BIZ)Leb;")
    public final class416 method1361(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class416) (this.field3440 && !arg3 || this.field3384 ? new class235(this, arg0, arg1, arg2, arg3) : new class389(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "()V")
    public final void method1362() {
        this.field3342.glPopMatrix();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lqh;Lcd;Lbd;[Lqt;I)V")
    public final void method1363(class352[] arg0, class46 arg1, class327 arg2, class465[] arg3, int arg4) {
        this.method1451(arg0, arg2, arg3, arg4);
        this.method1434(arg1);
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIII)V")
    public final void method1364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1491();
        this.method1371(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3342.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3342.glBegin(1);
        this.field3342.glVertex2f(var6, var7);
        this.field3342.glVertex2f((float) arg2 + var6, var7);
        this.field3342.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
    public final void method1365(int arg0) {
        if (this.field3460 != arg0) {
            this.field3342.glActiveTexture(arg0 + 33984);
            this.field3460 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "()V")
    private final void method1366() {
        this.method1418(-2);
        for (int var1 = this.field3445 - 1; var1 >= 0; var1--) {
            this.method1365(var1);
            this.method1379((class5) null);
            this.field3342.glTexEnvi(8960, 8704, 34160);
        }
        this.method1360(8448, 8448);
        this.method1458(2, 34168, 770);
        this.method1487();
        this.field3426 = 1;
        this.field3342.glEnable(3042);
        this.field3342.glBlendFunc(770, 771);
        this.field3405 = 1;
        this.field3342.glEnable(3008);
        this.field3342.glAlphaFunc(516, 0.0F);
        this.field3435 = true;
        this.field3342.glColorMask(true, true, true, true);
        this.field3391 = true;
        this.method1437(true);
        this.method1353(true);
        this.method1402(true);
        this.method1441(true);
        this.method1391();
        this.field3342.setSwapInterval(0);
        this.field3342.glShadeModel(7425);
        this.field3342.glClearDepth(1.0F);
        this.field3342.glDepthFunc(515);
        this.field3342.glPolygonMode(1028, 6914);
        this.field3342.glEnable(2884);
        this.field3342.glCullFace(1029);
        this.field3342.glMatrixMode(5888);
        this.field3342.glLoadIdentity();
        this.field3342.glColorMaterial(1028, 5634);
        this.field3342.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field3342.glLightfv(var4, 4608, var2, 0);
            this.field3342.glLightf(var4, 4615, 0.0F);
            this.field3342.glLightf(var4, 4616, 0.0F);
        }
        this.field3342.glEnable(16384);
        this.field3342.glEnable(16385);
        this.field3342.glFogf(2914, 0.95F);
        this.field3342.glFogi(2917, 9729);
        this.field3342.glHint(3156, 4353);
        this.field3417 = this.field3476 = -1;
        this.method1352();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field3454 == null || this.field3454.field1826 < arg2 || this.field3454.field1825 < arg3) {
            this.field3454 = class374.method2259(6406, arg2, (byte) -70, arg6, this, false, 6406, arg3);
            this.field3454.method733(false, false);
            var10 = this.field3454.field5339;
            var11 = this.field3454.field5341;
        } else {
            this.field3454.method732(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field3454.field5339 / (float) this.field3454.field1825;
            var11 = (float) arg2 * this.field3454.field5341 / (float) this.field3454.field1826;
        }
        this.method1389();
        this.method1379(this.field3454);
        this.method1371(arg8);
        this.field3342.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1411(arg5);
        this.method1360(34165, 34165);
        this.method1458(0, 34166, 768);
        this.method1458(2, 5890, 770);
        this.method1384(0, 34166, 770);
        this.method1384(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field3342.glBegin(7);
        this.field3342.glTexCoord2f(0.0F, 0.0F);
        this.field3342.glVertex2f(var12, var13);
        this.field3342.glTexCoord2f(0.0F, var11);
        this.field3342.glVertex2f(var12, var15);
        this.field3342.glTexCoord2f(var10, var11);
        this.field3342.glVertex2f(var14, var15);
        this.field3342.glTexCoord2f(var10, 0.0F);
        this.field3342.glVertex2f(var14, var13);
        this.field3342.glEnd();
        this.method1458(0, 5890, 768);
        this.method1458(2, 34166, 770);
        this.method1384(0, 5890, 770);
        this.method1384(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "()V")
    private final void method1368() {
        if (this.field3376 <= this.field3466 && this.field3409 <= this.field3374) {
            this.field3342.glScissor(this.field3420 + this.field3376, this.field3396 + this.field3350 - this.field3374, this.field3466 - this.field3376, this.field3374 - this.field3409);
        } else {
            this.field3342.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILhg;II)V")
    public final void method1369(int arg0, class313 arg1, int arg2, int arg3) {
        class124 var5 = (class124) arg1;
        class374 var6 = var5.field1533;
        this.method1389();
        this.method1379(var5.field1533);
        this.method1371(1);
        this.method1360(7681, 8448);
        this.method1458(0, 34167, 768);
        float var7 = var6.field5341 / (float) var6.field5338;
        float var8 = var6.field5339 / (float) var6.field5340;
        this.field3342.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field3342.glBegin(7);
        this.field3342.glTexCoord2f((float) (this.field3376 - arg2) * var7, (float) (this.field3409 - arg3) * var8);
        this.field3342.glVertex2i(this.field3376, this.field3409);
        this.field3342.glTexCoord2f((float) (this.field3376 - arg2) * var7, (float) (this.field3374 - arg3) * var8);
        this.field3342.glVertex2i(this.field3376, this.field3374);
        this.field3342.glTexCoord2f((float) (this.field3466 - arg2) * var7, (float) (this.field3374 - arg3) * var8);
        this.field3342.glVertex2i(this.field3466, this.field3374);
        this.field3342.glTexCoord2f((float) (this.field3466 - arg2) * var7, (float) (this.field3409 - arg3) * var8);
        this.field3342.glVertex2i(this.field3466, this.field3409);
        this.field3342.glEnd();
        this.method1458(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[Lhq;)V")
    public final void method1370(int arg0, class190[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class190 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field3357[0] = (float) var4.field2607;
            field3357[1] = (float) var4.field2602;
            field3357[2] = (float) var4.field2605;
            field3357[3] = 1.0F;
            this.field3342.glLightfv(var5, 4611, field3357, 0);
            int var6 = var4.field2606;
            float var7 = var4.field2604 / 255.0F;
            field3357[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field3357[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field3357[2] = (float) (var6 & 0xFF) * var7;
            this.field3342.glLightfv(var5, 4609, field3357, 0);
            this.field3342.glLightf(var5, 4617, 1.0F / (float) (var4.field2601 * var4.field2601));
            this.field3342.glEnable(var5);
        }
        while (var3 < this.field3467) {
            this.field3342.glDisable(var3 + 16386);
            var3++;
        }
        this.field3467 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
    public final void method1371(int arg0) {
        if (this.field3426 == arg0) {
            return;
        }
        byte var2;
        boolean var3;
        boolean var4;
        if (arg0 == 1) {
            var2 = 1;
            var3 = true;
            var4 = true;
        } else if (arg0 == 2) {
            var2 = 2;
            var3 = true;
            var4 = false;
        } else if (arg0 == 128) {
            var2 = 2;
            var3 = false;
            var4 = true;
        } else if (arg0 == 129) {
            var2 = 3;
            var3 = false;
            var4 = true;
        } else if (arg0 == 130) {
            var2 = 4;
            var3 = true;
            var4 = true;
        } else {
            var2 = 0;
            var3 = true;
            var4 = false;
        }
        if (this.field3391 != var3) {
            this.field3342.glColorMask(var3, var3, var3, true);
            this.field3391 = var3;
        }
        if (this.field3435 != var4) {
            if (var4) {
                this.field3342.glEnable(3008);
            } else {
                this.field3342.glDisable(3008);
            }
            this.field3435 = var4;
        }
        if (this.field3405 != var2) {
            if (var2 == 1) {
                this.field3342.glEnable(3042);
                this.field3342.glBlendEquation(32774);
                this.field3342.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field3342.glEnable(3042);
                this.field3342.glBlendEquation(32774);
                this.field3342.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field3342.glEnable(3042);
                this.field3342.glBlendEquation(32778);
                this.field3342.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field3342.glEnable(3042);
                this.field3342.glBlendEquation(32774);
                this.field3342.glBlendFunc(774, 1);
            } else {
                this.field3342.glDisable(3042);
            }
            this.field3405 = var2;
        }
        this.field3426 = arg0;
        this.field3456 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lij;)V")
    public final void method1372(class338 arg0) {
        this.field3342.glPushMatrix();
        this.field3342.glMultMatrixf(arg0.method2050((byte) 70), 0);
    }

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "()Z")
    public final boolean method1373() {
        return this.field3344.method1854((byte) -107);
    }

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "()V")
    public final void method1374() {
        if (this.field3362 <= 0 && this.field3350 <= 0) {
            return;
        }
        int var1 = this.field3376;
        int var2 = this.field3466;
        int var3 = this.field3409;
        int var4 = this.field3374;
        this.method1352();
        this.field3342.glReadBuffer(1028);
        this.field3342.glDrawBuffer(1029);
        this.method1391();
        this.method1437(false);
        this.method1353(false);
        this.method1402(false);
        this.method1441(false);
        this.method1379((class5) null);
        this.method1418(-2);
        this.method1455(0);
        this.method1371(0);
        this.field3342.glMatrixMode(5889);
        this.field3342.glLoadIdentity();
        this.field3342.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field3342.glMatrixMode(5888);
        this.field3342.glLoadIdentity();
        this.field3342.glRasterPos2i(0, 0);
        this.field3342.glCopyPixels(0, 0, this.field3362, this.field3350, 6144);
        this.field3342.glFlush();
        this.field3342.glReadBuffer(1029);
        this.field3342.glDrawBuffer(1029);
        this.method1351(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
    public final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3342.glLineWidth((float) arg5);
        this.method1392(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field3342.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public final void method1376(boolean arg0) {
        this.field3461 = arg0;
        this.method1433();
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(FF)V")
    public final void method1377(float arg0, float arg1) {
        this.field3393 = arg0;
        this.field3439 = arg1;
        if (!this.field3465) {
            this.method1494();
        }
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V")
    public final synchronized void method1378(int arg0) {
        class363 var2 = new class363(arg0);
        this.field3369.method803(var2, 50);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
    public final void method50() {
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lvd;)V")
    public final void method1379(class5 arg0) {
        class5 var2 = this.field3395[this.field3460];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field3342.glDisable(var2.field56);
            } else {
                if (var2 == null) {
                    this.field3342.glEnable(arg0.field56);
                } else if (arg0.field56 != var2.field56) {
                    this.field3342.glDisable(var2.field56);
                    this.field3342.glEnable(arg0.field56);
                }
                this.field3342.glBindTexture(arg0.field56, arg0.method40());
            }
            this.field3395[this.field3460] = arg0;
        }
        this.field3456 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)V")
    public final synchronized void method1380(int arg0) {
        class363 var2 = new class363(arg0);
        this.field3368.method803(var2, 50);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
    public final void method1381(int arg0) {
        this.method1337();
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIII)V")
    public final void method1382(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3465) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field3446 = arg1;
        this.field3410 = arg2;
        this.field3469 = arg3;
        this.method1494();
        this.field3339.method3(21626, arg0, true);
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "()F")
    public final float method1383() {
        return this.field3424;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final void method1384(int arg0, int arg1, int arg2) {
        this.field3342.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field3342.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Laj;Laj;FLaj;)Laj;")
    public final class77 method1385(class77 arg0, class77 arg1, float arg2, class77 arg3) {
        if (arg0 != null && arg1 != null && this.field3455 && this.field3428) {
            class341 var5 = null;
            class271 var6 = (class271) arg0;
            class271 var7 = (class271) arg1;
            class359 var8 = var6.method456(-122);
            class359 var9 = var7.method456(-114);
            if (var8 != null && var9 != null) {
                int var10 = var8.field5175 > var9.field5175 ? var8.field5175 : var9.field5175;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class341) {
                    class341 var11 = (class341) arg3;
                    if (var11.method2072(121) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class341(this, var10);
                }
                var5.method2071(106, var8, arg2, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "()Z")
    public final boolean method1386() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "()F")
    public final float method1387() {
        return this.field3421;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)V")
    public final void method1388(float arg0) {
        if (this.field3472 != arg0) {
            this.field3472 = arg0;
            this.method1354();
        }
    }

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "()V")
    public final void method1389() {
        if (this.field3456 == 2) {
            return;
        }
        this.method1343();
        this.method1437(false);
        this.method1353(false);
        this.method1402(false);
        this.method1441(false);
        this.method1418(-2);
        this.field3456 = 2;
    }

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "()V")
    public final void method1390() {
        if (this.field3456 == 4) {
            return;
        }
        this.method1343();
        this.method1437(false);
        this.method1353(false);
        this.method1402(false);
        this.method1441(false);
        this.method1418(-2);
        this.method1371(1);
        this.method1455(1);
        this.field3456 = 4;
    }

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "()V")
    public final void method1391() {
        if (this.field3438 != 0) {
            this.field3438 = 0;
            this.field3456 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIIII)V")
    public final void method1392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1491();
        this.method1371(arg5);
        this.field3342.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3342.glBegin(2);
        this.field3342.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3342.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3342.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()Z")
    public final boolean method1393() {
        if (!this.field3344.method1854((byte) 17)) {
            if (!this.field3348.method1614(this.field3344)) {
                return false;
            }
            this.field3345.method469((byte) 6);
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "()Z")
    public final boolean method1394() {
        return this.field3400;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final void method1395(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Lwt;")
    public final class345 method1396(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "()V")
    private final void method1397() {
        if (this.field3438 != 3) {
            this.field3438 = 3;
            this.method1436();
            this.method1401();
            this.field3456 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "()V")
    public final void method1398() {
        if (this.field3344.method1854((byte) 49)) {
            this.field3348.method1612(this.field3344);
            this.field3345.method469((byte) 6);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lhs;III)V")
    public final void method1399(class455 arg0, int arg1, int arg2, int arg3) {
        this.method1358(arg0);
        arg0.method749(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "()Z")
    public final boolean method1400() {
        return this.field3339.method1(3, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "()V")
    private final void method1401() {
        this.field3342.glLoadIdentity();
        this.field3342.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field3342.glMultMatrixf(this.field3397.method2050((byte) 70), 0);
        this.method1499();
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(Z)V")
    public final void method1402(boolean arg0) {
        if (this.field3372 == arg0) {
            return;
        }
        if (arg0) {
            this.field3342.glEnable(2929);
        } else {
            this.field3342.glDisable(2929);
        }
        this.field3372 = arg0;
        this.field3456 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "()I")
    public final int method1403() {
        return this.field3390;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbd;)V")
    public final void method1404(class327 arg0) {
        this.field3397 = (class338) arg0;
        this.field3415.method2053(-66, this.field3397);
        if (this.field3438 != 1) {
            this.method1401();
        }
    }

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "()V")
    private final void method1405() {
        this.field3342.glMatrixMode(5889);
        this.field3342.glLoadMatrixf(this.field3471, 0);
        this.field3342.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "()V")
    private final void method1406() {
        if (this.field3425 && !this.field3450) {
            this.field3342.glEnable(2896);
        } else {
            this.field3342.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "()Z")
    public final boolean method1407() {
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method1408(int arg0) {
        this.method1439();
    }

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "()I")
    public final int method1409() {
        return this.field3358 + this.field3353 + this.field3355;
    }

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "()Z")
    public final boolean method1410() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "(I)V")
    public final void method1411(int arg0) {
        field3343[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field3343[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field3343[2] = (float) (arg0 & 0xFF) / 255.0F;
        field3343[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field3342.glTexEnvfv(8960, 8705, field3343, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public final void method48() {
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfh;Lfh;Lfh;Lfh;)V")
    public final void method1412(class228 arg0, class228 arg1, class228 arg2, class228 arg3) {
        if (arg0 == null) {
            this.field3342.glDisableClientState(32884);
        } else {
            this.field3342.glEnableClientState(32884);
            arg0.method1260(-126);
        }
        if (arg1 == null) {
            this.field3342.glDisableClientState(32885);
        } else {
            this.field3342.glEnableClientState(32885);
            arg1.method1261(116);
        }
        if (arg2 == null) {
            this.field3342.glDisableClientState(32886);
        } else {
            this.field3342.glEnableClientState(32886);
            arg2.method1258(104);
        }
        if (arg3 == null) {
            this.field3342.glDisableClientState(32888);
        } else {
            this.field3342.glEnableClientState(32888);
            arg3.method1259(-128);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1413(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "(I)V")
    public final synchronized void method1414(int arg0) {
        class363 var2 = new class363(arg0);
        this.field3366.method803(var2, 50);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[[I[[IIII)Lmi;")
    public final class443 method1415(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class296(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(FFF)V")
    private final void method1416(float arg0, float arg1, float arg2) {
        this.field3342.glMatrixMode(5890);
        if (this.field3430) {
            this.field3342.glLoadIdentity();
        }
        this.field3342.glTranslatef(arg0, arg1, arg2);
        this.field3342.glMatrixMode(5888);
        this.field3430 = true;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
    public final void method1417(int arg0, int arg1) {
        if (this.field3476 == arg0 && this.field3427 == arg1) {
            return;
        }
        this.field3476 = arg0;
        this.field3427 = arg1;
        if (!this.field3465) {
            this.method1494();
            this.method1497();
        }
    }

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)V")
    public final void method1418(int arg0) {
        this.method1339(arg0, true);
    }

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "(I)I")
    public final int method1419(int arg0) {
        if (arg0 == 6406 || arg0 == 6409) {
            return 1;
        } else if (arg0 == 6410 || arg0 == 34846 || arg0 == 34844) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408 || arg0 == 34847) {
            return 4;
        } else if (arg0 == 34843) {
            return 6;
        } else if (arg0 == 34842) {
            return 8;
        } else if (arg0 == 6402) {
            return 3;
        } else if (arg0 == 6401) {
            return 1;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)Laj;")
    public final class77 method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field3455 ? new class91(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "()Z")
    public final boolean method1421() {
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
    public final void method1422(int arg0, int arg1) {
        if (this.field3382 == arg0 && this.field3390 == arg1) {
            return;
        }
        this.field3382 = arg0;
        this.field3390 = arg1;
        this.method1479();
        this.method1494();
        if (this.field3438 == 3) {
            this.method1436();
        } else if (this.field3438 == 2) {
            this.method1405();
        }
    }

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "()V")
    private final void method1423() {
        this.field3432 = (float) (this.field3376 - this.field3453);
        this.field3378 = (float) (this.field3466 - this.field3453);
        this.field3449 = (float) (this.field3409 - this.field3402);
        this.field3379 = (float) (this.field3374 - this.field3402);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Laj;)V")
    public final void method1424(class77 arg0) {
        this.field3387 = (class271) arg0;
    }

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "()V")
    public final void method1425() {
        if (this.field3456 == 8) {
            return;
        }
        this.method1466();
        this.method1437(true);
        this.method1402(true);
        this.method1441(true);
        this.method1371(1);
        this.method1455(1);
        this.field3456 = 8;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lkm;Z)Lrg;")
    public final class395 method1426(class473 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field6649 * arg0.field6646];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6648 == null) {
            for (int var8 = 0; var8 < arg0.field6646; var8++) {
                for (int var9 = 0; var9 < arg0.field6649; var9++) {
                    int var10 = arg0.field6650[arg0.field6652[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field6646; var6++) {
                for (int var7 = 0; var7 < arg0.field6649; var7++) {
                    var3[var5++] = arg0.field6648[var4] << 24 | arg0.field6650[arg0.field6652[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class395 var11 = this.method1355(var3, 0, arg0.field6649, arg0.field6649, arg0.field6646);
        var11.method219(arg0.field6651, arg0.field6647, arg0.field6653, arg0.field6645);
        return var11;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(II)V")
    public final synchronized void method1427(int arg0, int arg1) {
        class363 var3 = new class363(arg1);
        var3.field1776 = (long) arg0;
        this.field3365.method803(var3, 50);
    }

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "()V")
    private final void method1428() {
        this.field3397 = new class338();
        this.field3415 = new class338();
        this.field3395 = new class5[this.field3445];
        this.field3418 = new class151(this, 3553, 6408, 1, 1);
        this.field3433 = new class151(this, 3553, 6408, 1, 1);
        this.field3447 = new class151(this, 3553, 6408, 1, 1);
        this.field3380 = new class286(this);
        this.field3431 = new class286(this);
        this.field3458 = new class286(this);
        this.field3375 = new class286(this);
        this.field3403 = new class286(this);
        this.field3416 = new class286(this);
        this.field3412 = new class286(this);
        this.field3441 = new class286(this);
        if (this.field3428) {
            this.field3437 = new class161(this);
        }
        this.field3338.method2361(this);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1429(Rectangle[] arg0, int arg1) {
        this.method1477();
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(II)V")
    public final void method1430(int arg0, int arg1) {
        this.field3420 = arg0;
        this.field3396 = arg1;
        this.field3342.glViewport(arg0, arg1, this.field3362, this.field3350);
        this.method1368();
    }

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "()I")
    public final int method1431() {
        int var1 = this.field3377;
        this.field3377 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "()V")
    private final void method1432() {
        field3343[0] = this.field3413 * this.field3371;
        field3343[1] = this.field3434 * this.field3371;
        field3343[2] = this.field3474 * this.field3371;
        field3343[3] = 1.0F;
        this.field3342.glLightfv(16384, 4609, field3343, 0);
        field3343[0] = -this.field3398 * this.field3413;
        field3343[1] = -this.field3398 * this.field3434;
        field3343[2] = -this.field3398 * this.field3474;
        field3343[3] = 1.0F;
        this.field3342.glLightfv(16385, 4609, field3343, 0);
    }

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "()V")
    private final void method1433() {
        this.field3342.glDepthMask(this.field3388 && this.field3461);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lcd;)V")
    public final void method1434(class46 arg0) {
        this.field3338.method2357(this, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I[BIZ)Lhs;")
    public final class455 method1435(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class455) (this.field3440 && !arg3 || this.field3384 ? new class155(this, arg0, arg1, arg2, arg3) : new class489(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "()V")
    private final void method1436() {
        float var1 = (float) (-this.field3453) * this.field3459 / (float) this.field3383;
        float var2 = (float) (-this.field3402) * this.field3459 / (float) this.field3423;
        float var3 = (float) (this.field3362 - this.field3453) * this.field3459 / (float) this.field3383;
        float var4 = (float) (this.field3350 - this.field3402) * this.field3459 / (float) this.field3423;
        this.field3342.glMatrixMode(5889);
        this.field3342.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field3342.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field3382 - this.field3421), (double) ((float) this.field3390 - this.field3421));
        }
        this.field3342.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(Z)V")
    public final void method1437(boolean arg0) {
        if (this.field3444 != arg0) {
            this.field3444 = arg0;
            this.method1497();
            this.field3456 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "()Z")
    public final boolean method1438() {
        return !this.field3475;
    }

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "()V")
    private final void method1439() {
        try {
            this.field3341.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "()V")
    private final void method1440() {
        if (this.field3421 == 0.0F) {
            this.field3471[10] = this.field3373;
            this.field3471[14] = this.field3394;
        } else {
            float var1 = this.field3424 / (this.field3424 + this.field3421);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field3394 * (1.0F - var1) / this.field3421;
            this.field3471[10] = this.field3373 + var3;
            this.field3471[14] = this.field3394 * var2;
        }
        this.field3406 = (this.field3471[14] - (float) this.field3390) / this.field3471[10];
        this.field3452 = (float) this.field3390 - this.field3421;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(Z)V")
    public final void method1441(boolean arg0) {
        if (this.field3388 != arg0) {
            this.field3388 = arg0;
            this.method1433();
            this.field3456 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(Z)V")
    public final void method1442(boolean arg0) {
        if (this.field3450 != arg0) {
            this.field3450 = arg0;
            this.method1406();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
    public final int method1443(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public final void method1444(int arg0) {
        this.method1371(0);
        this.field3342.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field3342.glClear(16384);
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "()V")
    public final void method1445() {
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZZ)V")
    public final void method1446(int arg0, boolean arg1, boolean arg2) {
        if (this.field3468 != arg0) {
            if (arg0 < 0) {
                this.method1487();
                this.method1379((class5) null);
                if (!this.field3465) {
                    this.field3339.method2(arg2, arg1, 0, false);
                }
            } else {
                class151 var4 = this.field3345.method468(-1, arg0);
                class189 var5 = this.field4073.method577(arg0, -123);
                if (var5.field2574 == 0 && var5.field2586 == 0) {
                    this.method1487();
                } else {
                    int var6 = var5.field2592 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1416((float) (this.field3359 % var7 * var5.field2574) / (float) var7, (float) (this.field3359 % var7 * var5.field2586) / (float) var7, 0.0F);
                }
                if (this.field3465) {
                    this.field3339.method2(arg2, arg1, 3, false);
                    this.method1379(var4);
                } else {
                    this.field3339.method2(arg2, arg1, var5.field2576, false);
                    this.field3339.method3(21626, var5.field2575, false);
                    if (!this.field3339.method4((byte) 65, var4)) {
                        this.method1379(var4);
                    }
                }
            }
            this.field3468 = arg0;
        }
        this.field3456 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIILhg;II)V")
    public final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class313 arg6, int arg7, int arg8) {
        class124 var10 = (class124) arg6;
        class374 var11 = var10.field1533;
        this.method1389();
        this.method1379(var10.field1533);
        this.method1371(arg5);
        this.method1360(7681, 8448);
        this.method1458(0, 34167, 768);
        float var12 = var11.field5341 / (float) var11.field5338;
        float var13 = var11.field5339 / (float) var11.field5340;
        this.field3342.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3342.glBegin(1);
        this.field3342.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field3342.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3342.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field3342.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3342.glEnd();
        this.method1458(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public final void method1448(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFFFF)V")
    public final void method1449(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field3417 != arg0;
        if (var7 || this.field3371 != arg1 || this.field3398 != arg2) {
            this.field3417 = arg0;
            this.field3371 = arg1;
            this.field3398 = arg2;
            if (var7) {
                this.field3413 = (float) (this.field3417 & 0xFF0000) / 1.671168E7F;
                this.field3434 = (float) (this.field3417 & 0xFFFF) / 65535.0F;
                this.field3474 = (float) (this.field3417 & 0xFF) / 255.0F;
                this.method1354();
            }
            this.method1432();
        }
        if (this.field3436[0] == arg3 && this.field3436[1] == arg4 && this.field3436[2] == arg5) {
            return;
        }
        this.field3436[0] = arg3;
        this.field3436[1] = arg4;
        this.field3436[2] = arg5;
        this.field3389[0] = -arg3;
        this.field3389[1] = -arg4;
        this.field3389[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field3385[0] = arg3 * var8;
        this.field3385[1] = arg4 * var8;
        this.field3385[2] = arg5 * var8;
        this.field3408[0] = -this.field3385[0];
        this.field3408[1] = -this.field3385[1];
        this.field3408[2] = -this.field3385[2];
        this.method1499();
        this.field3473 = (int) (arg3 * 256.0F / arg4);
        this.field3443 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "()V")
    public final void method1450() {
        this.field3348.method1610();
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lqh;Lbd;[Lqt;I)V")
    public final void method1451(class352[] arg0, class327 arg1, class465[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1716(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/awt/Canvas;Leg;IILkd;)V")
    public class246(Canvas arg0, class394 arg1, int arg2, int arg3, class355 arg4) {
        super(arg2, arg1);
        this.field3346 = arg0;
        int var6 = 0;
        while (!this.field3346.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class85.method433(1000L, -84);
        }
        this.field3346.setIgnoreRepaint(true);
        try {
            if (field3347 == null || !field3347) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field3347 = Boolean.TRUE;
                } else {
                    class405 var7 = arg4.method2160(0, this.getClass());
                    while (var7.field5759 == 0) {
                        class85.method433(100L, -47);
                    }
                    if (var7.field5759 == 1) {
                        field3347 = Boolean.TRUE;
                    }
                }
            }
            if (field3347 == null || !field3347) {
                throw new RuntimeException("");
            }
            this.field3341 = new context();
            if (!this.field3341.choosePixelFormat(this.field3346, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field3341.createContext()) {
                this.method1337();
                this.field3342 = this.field3341.getGL();
                int var8 = this.method1460();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field3451 = this.field3370 ? 33639 : 5121;
                String var9 = this.field3463.toLowerCase();
                String var10 = this.field3442.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class217.method1214((byte) 46, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class80.method401(false, var16.substring(1, 3))) {
                                    var16 = var16.substring(1);
                                    var13 = true;
                                }
                                if (var16.equals("hd")) {
                                    var12 = true;
                                } else {
                                    if (var16.startsWith("hd")) {
                                        var16 = var16.substring(2);
                                        var12 = true;
                                    }
                                    if (var16.length() >= 4 && class80.method401(false, var16.substring(0, 4))) {
                                        var11 = class184.method997(var16.substring(0, 4), false);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field3440 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field3457 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field3462 = false;
                    }
                    this.field3386 &= this.field3342.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field3384 = this.field3440;
                }
                if (var9.contains("intel")) {
                    this.field3428 = false;
                }
                if (this.field3440) {
                    try {
                        int[] var18 = new int[1];
                        this.field3342.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1348(this);
                this.method1467();
                this.method1428();
                new class165(this);
                this.field3345 = new class95(this, this.field4073);
                class192.method1047(true, true, (byte) -78);
                this.field3356 = true;
                this.field3339 = new class1(this);
                this.field3348 = new class266(this);
                this.field3344 = new class431(this);
                this.method1366();
                this.field3342.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field3341.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class85.method433(100L, -88);
                    }
                }
                this.field3342.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method1475();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FFFF)V")
    public final void method1452(float arg0, float arg1, float arg2, float arg3) {
        field3343[0] = arg0;
        field3343[1] = arg1;
        field3343[2] = arg2;
        field3343[3] = arg3;
        this.field3342.glTexEnvfv(8960, 8705, field3343, 0);
    }

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "()V")
    public final void method1453() {
        if (this.field3456 == 16) {
            return;
        }
        this.method1397();
        this.method1437(true);
        this.method1402(true);
        this.method1441(true);
        this.method1371(1);
        this.method1455(1);
        this.field3456 = 16;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lti;)V")
    public final void method1454(class7 arg0) {
        if (this.field3354 < 0 || this.field3363[this.field3354] != arg0) {
            throw new RuntimeException();
        }
        this.field3363[this.field3354--] = null;
        arg0.method50();
        if (this.field3354 >= 0) {
            this.field3352 = this.field3363[this.field3354];
            this.field3352.method48();
        }
    }

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "(I)V")
    public final void method1455(int arg0) {
        if (arg0 == 0) {
            this.method1360(7681, 7681);
        } else if (arg0 == 1) {
            this.method1360(8448, 8448);
        } else if (arg0 == 2) {
            this.method1360(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lbd;")
    public final class327 method1456() {
        return this.field3349;
    }

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "(I)I")
    public final int method1457(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
    public final void method1458(int arg0, int arg1, int arg2) {
        this.field3342.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field3342.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(IIIIII)V")
    public final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1491();
        this.method1371(arg5);
        this.field3342.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3400) {
            this.field3342.glDisable(32925);
        }
        this.field3342.glBegin(2);
        this.field3342.glVertex2f(var7, var8);
        this.field3342.glVertex2f(var7, var10);
        this.field3342.glVertex2f(var9, var10);
        this.field3342.glVertex2f(var9, var8);
        this.field3342.glEnd();
        if (this.field3400) {
            this.field3342.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "()I")
    private final int method1460() {
        int var1 = 0;
        this.field3463 = this.field3342.glGetString(7936);
        this.field3442 = this.field3342.glGetString(7937);
        String var2 = this.field3463.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field3342.glGetString(7938);
        String[] var4 = class217.method1214((byte) 107, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class184.method997(var4[0], false);
                int var6 = class184.method997(var4[1], false);
                this.field3381 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field3381 < 12) {
            var1 |= 0x2;
        }
        if (!this.field3342.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field3342.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field3342.glGetIntegerv(34018, var8, 0);
        this.field3445 = var8[0];
        this.field3342.glGetIntegerv(34929, var8, 0);
        this.field3401 = var8[0];
        this.field3342.glGetIntegerv(34930, var8, 0);
        this.field3404 = var8[0];
        if (this.field3445 < 2 || this.field3401 < 2 || this.field3404 < 2) {
            var1 |= 0x10;
        }
        this.field3475 = class355.field5105 != null && class355.field5105.startsWith("mac");
        this.field3370 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field3440 = this.field3342.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3400 = this.field3342.isExtensionAvailable("GL_ARB_multisample");
        this.field3407 = this.field3342.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3342.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3342.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3419 = this.field3342.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3457 = this.field3342.isExtensionAvailable("GL_EXT_texture3D");
        this.field3386 = this.field3342.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3455 = this.field3342.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3462 = this.field3342.isExtensionAvailable("GL_ARB_texture_float");
        this.field3422 = false;
        this.field3428 = this.field3342.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIZ)Lrg;")
    public final class395 method1461(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class439(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "()I")
    public final int method1462() {
        int var1 = this.field3448;
        this.field3448 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqh;Lcd;Lbd;Lqt;I)V")
    public final void method1463(class352 arg0, class46 arg1, class327 arg2, class465 arg3, int arg4) {
        arg0.method1716(arg2, arg3, arg4);
        this.method1434(arg1);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
    public final int method49() {
        return this.field3350;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(F)V")
    public final void method1464(float arg0) {
        if (this.field3459 != arg0) {
            this.field3459 = arg0;
            if (this.field3438 == 3) {
                this.method1436();
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Leb;)V")
    public final void method1465(class416 arg0) {
        if (this.field3399 != arg0 && this.field3440) {
            this.field3342.glBindBufferARB(34962, arg0.method747());
            this.field3399 = arg0;
        }
    }

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "()V")
    public final void method1466() {
        if (this.field3438 != 2) {
            this.field3438 = 2;
            this.method1405();
            this.method1401();
            this.field3456 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "()V")
    public final void method1467() {
        this.field3362 = this.field3346.getWidth();
        this.field3350 = this.field3346.getHeight();
        this.field3342.glViewport(this.field3420, this.field3396, this.field3362, this.field3350);
        this.method1391();
        this.method1352();
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIII)V")
    public final void method1468(int arg0, int arg1, int arg2, int arg3) {
        this.field3453 = arg0;
        this.field3402 = arg1;
        this.field3383 = arg2;
        this.field3423 = arg3;
        this.method1479();
        this.method1423();
        if (this.field3438 == 3) {
            this.method1436();
        } else if (this.field3438 == 2) {
            this.method1405();
        }
    }

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "()Lnb;")
    public final class359 method1469() {
        return this.field3387 == null ? null : this.field3387.method456(-114);
    }

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "()I")
    public final int method1470() {
        return this.field3382;
    }

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "(I)I")
    public final int method1471(int arg0) {
        if (arg0 == 0) {
            return 7681;
        } else if (arg0 == 1) {
            return 8448;
        } else if (arg0 == 2) {
            return 34165;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[I[I)Lhg;")
    public final class313 method1472(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class124.method595(arg1, 0, arg0, this, arg2, arg3);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public final int method1473(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "()Z")
    public final boolean method1474() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "()V")
    public final void method1475() {
        if (this.field3342 != null) {
            try {
                this.field3348.method1616();
            } catch (Throwable var4) {
            }
            this.field3342 = null;
        }
        if (this.field3341 != null) {
            this.method1439();
            try {
                this.field3341.destroy();
            } catch (Throwable var3) {
            }
            this.field3341 = null;
        }
        if (this.field3356) {
            class340.method2068(true, (byte) 96, true);
            this.field3356 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "()Z")
    public final boolean method1476() {
        return this.field3344.method2580();
    }

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "()V")
    public final void method1477() {
        try {
            this.field3341.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[I)V")
    public final void method1478(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3397.field4859 + (float) arg0 * this.field3397.field4861 + (float) arg1 * this.field3397.field4866 + this.field3397.field4864;
        if ((var5 < (float) this.field3382) || (var5 > (float) this.field3390)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field3397.field4868 + (float) arg0 * this.field3397.field4863 + (float) arg1 * this.field3397.field4867 + this.field3397.field4858) * (float) this.field3383 / var5);
        int var7 = (int) (((float) arg2 * this.field3397.field4869 + (float) arg0 * this.field3397.field4857 + (float) arg1 * this.field3397.field4860 + this.field3397.field4862) * (float) this.field3423 / var5);
        if ((float) var6 >= this.field3432 && (float) var6 <= this.field3378 && (float) var7 >= this.field3449 && (float) var7 <= this.field3379) {
            arg3[0] = (int) ((float) var6 - this.field3432);
            arg3[1] = (int) ((float) var7 - this.field3449);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "()V")
    private final void method1479() {
        float[] var1 = this.field3471;
        float var2 = (float) (-this.field3453 * this.field3382) / (float) this.field3383;
        float var3 = (float) ((this.field3362 - this.field3453) * this.field3382) / (float) this.field3383;
        float var4 = (float) (this.field3402 * this.field3382) / (float) this.field3423;
        float var5 = (float) ((this.field3402 - this.field3350) * this.field3382) / (float) this.field3423;
        if (var2 == var3 || var4 == var5) {
            var1[0] = 1.0F;
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = 1.0F;
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = 0.0F;
            var1[9] = 0.0F;
            var1[10] = 1.0F;
            var1[11] = 0.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = 0.0F;
            var1[15] = 1.0F;
        } else {
            float var6 = (float) this.field3382 * 2.0F;
            var1[0] = var6 / (var3 - var2);
            var1[1] = 0.0F;
            var1[2] = 0.0F;
            var1[3] = 0.0F;
            var1[4] = 0.0F;
            var1[5] = var6 / (var4 - var5);
            var1[6] = 0.0F;
            var1[7] = 0.0F;
            var1[8] = (var2 + var3) / (var3 - var2);
            var1[9] = (var4 + var5) / (var4 - var5);
            var1[10] = this.field3373 = (float) (-(this.field3390 + this.field3382)) / (float) (this.field3390 - this.field3382);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field3394 = -((float) this.field3390 * var6) / (float) (this.field3390 - this.field3382);
            var1[15] = 0.0F;
        }
        this.method1440();
    }

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "()V")
    public final void method1480() {
        this.field3339.method2(false, false, 0, false);
        this.field3465 = false;
        this.method1494();
        this.method1497();
    }

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "()Z")
    public final boolean method1481() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(IIII)V")
    public final void method1482(int arg0, int arg1, int arg2, int arg3) {
        this.field3465 = true;
        this.field3446 = arg1;
        this.field3410 = arg2;
        this.field3469 = arg3;
        this.method1494();
        this.method1497();
        this.field3339.method2(false, false, 3, false);
        this.field3339.method3(21626, arg0, true);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
    public final void method1483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1491();
        this.method1371(arg5);
        this.field3342.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3400) {
            this.field3342.glDisable(32925);
        }
        this.field3342.glBegin(7);
        this.field3342.glVertex2f(var7, var8);
        this.field3342.glVertex2f(var7, var10);
        this.field3342.glVertex2f(var9, var10);
        this.field3342.glVertex2f(var9, var8);
        this.field3342.glEnd();
        if (this.field3400) {
            this.field3342.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbg;[Lkm;Z)Lcr;")
    public final class206 method1484(class406 arg0, class473[] arg1, boolean arg2) {
        return new class152(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "()Z")
    public final boolean method1485() {
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V")
    public final void method1486(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1491();
        this.method1371(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3342.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3342.glBegin(1);
        this.field3342.glVertex2f(var6, var7);
        this.field3342.glVertex2f(var6, (float) arg2 + var7);
        this.field3342.glEnd();
    }

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "()V")
    private final void method1487() {
        if (this.field3430) {
            this.field3342.glMatrixMode(5890);
            this.field3342.glLoadIdentity();
            this.field3342.glMatrixMode(5888);
            this.field3430 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIII)V")
    public final void method1488(int arg0, int arg1, int arg2, int arg3) {
        this.field3348.method1611(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
    public final void method1489(boolean arg0) {
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwt;)V")
    public final void method1490(class345 arg0) {
    }

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "()V")
    private final void method1491() {
        if (this.field3456 == 1) {
            return;
        }
        this.method1343();
        this.method1437(false);
        this.method1353(false);
        this.method1402(false);
        this.method1441(false);
        this.method1379((class5) null);
        this.method1418(-2);
        this.method1455(0);
        this.field3456 = 1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FFF)V")
    public final void method1492(float arg0, float arg1, float arg2) {
        class431.field6236 = arg0;
        class431.field6230 = arg1;
        class431.field6234 = arg2;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(II)V")
    public final synchronized void method1493(int arg0, int arg1) {
        class363 var3 = new class363(arg1);
        var3.field1776 = (long) arg0;
        this.field3366.method803(var3, 50);
    }

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "()V")
    private final void method1494() {
        int var1;
        if (this.field3465) {
            this.field3342.glFogf(2915, 0.0F);
            this.field3342.glFogf(2916, 1.0F);
            var1 = this.field3446;
        } else {
            this.field3411 = (float) (this.field3390 - 256) - this.field3439;
            this.field3392 = this.field3411 - (float) this.field3427 * this.field3393;
            if (this.field3392 < (float) this.field3382) {
                this.field3392 = (float) this.field3382;
            }
            this.field3342.glFogf(2915, this.field3392);
            this.field3342.glFogf(2916, this.field3411);
            var1 = this.field3476;
        }
        field3343[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field3343[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field3343[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field3342.glFogfv(2918, field3343, 0);
    }

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "()Z")
    public final boolean method1495() {
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)V")
    public final void method1496(int arg0, int arg1, int arg2) {
        this.field3342.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "qb", descriptor = "()V")
    private final void method1497() {
        if (this.field3444 && this.field3465 | this.field3427 >= 0) {
            this.field3342.glEnable(2912);
        } else {
            this.field3342.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FF)V")
    public final void method1498(float arg0, float arg1) {
        if (this.field3424 == arg0 && this.field3421 == arg1) {
            return;
        }
        this.field3424 = arg0;
        this.field3421 = arg1;
        this.method1440();
        if (this.field3438 == 3) {
            this.method1436();
        } else if (this.field3438 == 2) {
            this.method1405();
        }
    }

    @OriginalMember(owner = "client!ic", name = "rb", descriptor = "()V")
    public final void method1499() {
        this.field3342.glLightfv(16384, 4611, this.field3385, 0);
        this.field3342.glLightfv(16385, 4611, this.field3408, 0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([I)V")
    public final void method1500(int[] arg0) {
        arg0[0] = this.field3376;
        arg0[1] = this.field3409;
        arg0[2] = this.field3466;
        arg0[3] = this.field3374;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)[I")
    public final int[] method1501(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field3342.glReadPixels(arg0, this.field3350 - arg1 - var6, arg2, 1, 32993, this.field3451, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }
}
