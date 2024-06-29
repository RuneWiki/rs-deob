import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class256 extends class405 implements class409 {

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Lsb;")
    private class361 field3639 = new class361();

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Lvj;")
    private class177 field3640 = new class258();

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public int field3645 = 8;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "[Lik;")
    private class409[] field3644 = new class409[4];

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Z")
    private boolean field3649 = false;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public int field3650 = 3;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    private int field3652 = -1;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lar;")
    private class47 field3647 = new class47();

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "Lar;")
    private class47 field3654 = new class47();

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "Lar;")
    private class47 field3655 = new class47();

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "Lar;")
    private class47 field3656 = new class47();

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Lar;")
    private class47 field3657 = new class47();

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Lar;")
    private class47 field3658 = new class47();

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Lar;")
    private class47 field3659 = new class47();

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
    private int field3673 = 0;

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "I")
    public int field3678 = 512;

    @OriginalMember(owner = "client!nf", name = "Ib", descriptor = "F")
    public float field3699 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "Mb", descriptor = "[F")
    public float[] field3703 = new float[4];

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "I")
    private int field3683 = 0;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "F")
    public float field3669 = -1.0F;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "[F")
    private float[] field3661 = new float[4];

    @OriginalMember(owner = "client!nf", name = "fc", descriptor = "F")
    private float field3722 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "I")
    private int field3672 = 0;

    @OriginalMember(owner = "client!nf", name = "hc", descriptor = "F")
    public float field3724 = 3584.0F;

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "F")
    private float field3679 = 0.0F;

    @OriginalMember(owner = "client!nf", name = "ic", descriptor = "I")
    private int field3725 = 8448;

    @OriginalMember(owner = "client!nf", name = "xb", descriptor = "I")
    private int field3688 = -1;

    @OriginalMember(owner = "client!nf", name = "Yb", descriptor = "I")
    private int field3715 = 8448;

    @OriginalMember(owner = "client!nf", name = "rc", descriptor = "I")
    public int field3734 = 512;

    @OriginalMember(owner = "client!nf", name = "Jb", descriptor = "F")
    private float field3700 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "tc", descriptor = "I")
    public int field3736 = 3584;

    @OriginalMember(owner = "client!nf", name = "mc", descriptor = "I")
    public int field3729 = 0;

    @OriginalMember(owner = "client!nf", name = "Nb", descriptor = "[F")
    private float[] field3704 = new float[4];

    @OriginalMember(owner = "client!nf", name = "Db", descriptor = "[F")
    private float[] field3694 = new float[16];

    @OriginalMember(owner = "client!nf", name = "pc", descriptor = "I")
    public int field3732 = 50;

    @OriginalMember(owner = "client!nf", name = "Ob", descriptor = "I")
    public int field3705 = 0;

    @OriginalMember(owner = "client!nf", name = "Wb", descriptor = "[F")
    private float[] field3713 = new float[4];

    @OriginalMember(owner = "client!nf", name = "Ec", descriptor = "F")
    public float field3747 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "yc", descriptor = "I")
    private int field3741 = -1;

    @OriginalMember(owner = "client!nf", name = "Cc", descriptor = "F")
    public float field3745 = -1.0F;

    @OriginalMember(owner = "client!nf", name = "vc", descriptor = "Z")
    private boolean field3738 = true;

    @OriginalMember(owner = "client!nf", name = "lc", descriptor = "I")
    public int field3728 = -1;

    @OriginalMember(owner = "client!nf", name = "Xb", descriptor = "I")
    private int field3714 = 0;

    @OriginalMember(owner = "client!nf", name = "Kc", descriptor = "I")
    private int field3753 = 0;

    @OriginalMember(owner = "client!nf", name = "Bc", descriptor = "I")
    private int field3744 = 0;

    @OriginalMember(owner = "client!nf", name = "qc", descriptor = "F")
    public float field3733 = 1.0F;

    @OriginalMember(owner = "client!nf", name = "Dc", descriptor = "F")
    public float field3746 = 3584.0F;

    @OriginalMember(owner = "client!nf", name = "Rc", descriptor = "I")
    private int field3760 = 0;

    @OriginalMember(owner = "client!nf", name = "Sc", descriptor = "I")
    public int field3761 = -1;

    @OriginalMember(owner = "client!nf", name = "Nc", descriptor = "I")
    public int field3756 = -1;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3633;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lfh;")
    public class210 field3631;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "Ljaggl/context;")
    private context field3636;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "Ljaggl/opengl;")
    public opengl field3634;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "Z")
    public boolean field3663;

    @OriginalMember(owner = "client!nf", name = "Ic", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!nf", name = "Jc", descriptor = "Ljava/lang/String;")
    private String field3752;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "Ljava/lang/String;")
    private String field3677;

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Z")
    private boolean field3676;

    @OriginalMember(owner = "client!nf", name = "Tc", descriptor = "Z")
    public boolean field3762;

    @OriginalMember(owner = "client!nf", name = "cc", descriptor = "Z")
    public boolean field3719;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Z")
    public boolean field3670;

    @OriginalMember(owner = "client!nf", name = "yb", descriptor = "Z")
    private boolean field3689;

    @OriginalMember(owner = "client!nf", name = "bc", descriptor = "Z")
    public boolean field3718;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Ltc;")
    public class290 field3629;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Llk;")
    private class121 field3632;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lq;")
    private class203 field3630;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lg;")
    private class433 field3628;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[F")
    private static float[] field3627 = new float[4];

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
    private static int[] field3638 = new int[1000];

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[F")
    private static float[] field3635 = new float[4];

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field3637 = Boolean.FALSE;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "F")
    public float field3665;

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "F")
    public float field3680;

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "F")
    private float field3682;

    @OriginalMember(owner = "client!nf", name = "ub", descriptor = "F")
    public float field3685;

    @OriginalMember(owner = "client!nf", name = "Bb", descriptor = "F")
    public float field3692;

    @OriginalMember(owner = "client!nf", name = "Hb", descriptor = "F")
    public float field3698;

    @OriginalMember(owner = "client!nf", name = "Tb", descriptor = "F")
    public float field3710;

    @OriginalMember(owner = "client!nf", name = "Vb", descriptor = "F")
    public float field3712;

    @OriginalMember(owner = "client!nf", name = "jc", descriptor = "F")
    private float field3726;

    @OriginalMember(owner = "client!nf", name = "uc", descriptor = "F")
    private float field3737;

    @OriginalMember(owner = "client!nf", name = "Hc", descriptor = "F")
    public float field3750;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public int field3641;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    private int field3664;

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!nf", name = "tb", descriptor = "I")
    private int field3684;

    @OriginalMember(owner = "client!nf", name = "vb", descriptor = "I")
    private int field3686;

    @OriginalMember(owner = "client!nf", name = "zb", descriptor = "I")
    private int field3690;

    @OriginalMember(owner = "client!nf", name = "Ab", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!nf", name = "Gb", descriptor = "I")
    private int field3697;

    @OriginalMember(owner = "client!nf", name = "Sb", descriptor = "I")
    private int field3709;

    @OriginalMember(owner = "client!nf", name = "nc", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!nf", name = "sc", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!nf", name = "Uc", descriptor = "I")
    private int field3763;

    @OriginalMember(owner = "client!nf", name = "Vc", descriptor = "I")
    private int field3764;

    @OriginalMember(owner = "client!nf", name = "zc", descriptor = "J")
    private long field3742;

    @OriginalMember(owner = "client!nf", name = "Gc", descriptor = "Lgd;")
    private class111 field3749;

    @OriginalMember(owner = "client!nf", name = "Qc", descriptor = "Ldh;")
    private class190 field3759;

    @OriginalMember(owner = "client!nf", name = "ec", descriptor = "Lko;")
    private class19 field3721;

    @OriginalMember(owner = "client!nf", name = "Oc", descriptor = "Lko;")
    public class19 field3757;

    @OriginalMember(owner = "client!nf", name = "Pb", descriptor = "Lir;")
    public class216 field3706;

    @OriginalMember(owner = "client!nf", name = "oc", descriptor = "Lir;")
    public class216 field3731;

    @OriginalMember(owner = "client!nf", name = "Lc", descriptor = "Lir;")
    public class216 field3754;

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "Lmb;")
    public class258 field3674;

    @OriginalMember(owner = "client!nf", name = "Fb", descriptor = "Lmb;")
    public class258 field3696;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "Lik;")
    private class409 field3653;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Lrd;")
    public class417 field3662;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lrd;")
    public class417 field3666;

    @OriginalMember(owner = "client!nf", name = "wb", descriptor = "Lrd;")
    public class417 field3687;

    @OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lrd;")
    public class417 field3695;

    @OriginalMember(owner = "client!nf", name = "Lb", descriptor = "Lrd;")
    public class417 field3702;

    @OriginalMember(owner = "client!nf", name = "Ac", descriptor = "Lrd;")
    public class417 field3743;

    @OriginalMember(owner = "client!nf", name = "Zb", descriptor = "Lna;")
    private class50 field3716;

    @OriginalMember(owner = "client!nf", name = "Qb", descriptor = "Lej;")
    public class74 field3707;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "Z")
    public boolean field3660;

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Z")
    private boolean field3675;

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "Z")
    private boolean field3681;

    @OriginalMember(owner = "client!nf", name = "Cb", descriptor = "Z")
    private boolean field3693;

    @OriginalMember(owner = "client!nf", name = "Kb", descriptor = "Z")
    private boolean field3701;

    @OriginalMember(owner = "client!nf", name = "Rb", descriptor = "Z")
    public boolean field3708;

    @OriginalMember(owner = "client!nf", name = "Ub", descriptor = "Z")
    public boolean field3711;

    @OriginalMember(owner = "client!nf", name = "ac", descriptor = "Z")
    private boolean field3717;

    @OriginalMember(owner = "client!nf", name = "dc", descriptor = "Z")
    public boolean field3720;

    @OriginalMember(owner = "client!nf", name = "gc", descriptor = "Z")
    private boolean field3723;

    @OriginalMember(owner = "client!nf", name = "kc", descriptor = "Z")
    private boolean field3727;

    @OriginalMember(owner = "client!nf", name = "xc", descriptor = "Z")
    private boolean field3740;

    @OriginalMember(owner = "client!nf", name = "Fc", descriptor = "Z")
    private boolean field3748;

    @OriginalMember(owner = "client!nf", name = "Mc", descriptor = "Z")
    public boolean field3755;

    @OriginalMember(owner = "client!nf", name = "Pc", descriptor = "Z")
    private boolean field3758;

    @OriginalMember(owner = "client!nf", name = "wc", descriptor = "[Lme;")
    private class360[] field3739;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "()F", line = 9)
    public final float method1619() {
        return this.field3665;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I", line = 12)
    public final int method1620(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "()V", line = 16)
    private final void method1621() {
        try {
            this.field3636.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "()V", line = 23)
    public final void method1622() {
        if (this.field3709 == 8) {
            return;
        }
        this.method1716();
        this.method1674(true);
        this.method1754(true);
        this.method1667(true);
        this.method1701(1);
        this.method1745(1);
        this.field3709 = 8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[BII)V", line = 40)
    public final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field3759 == null || this.field3759.field2874 < arg2 || this.field3759.field2876 < arg3) {
            this.field3759 = class190.method1148(34037, arg6, 6406, this, arg2, arg3, 6406, false);
            this.field3759.method1271(false, false);
            var10 = this.field3759.field2553;
            var11 = this.field3759.field2552;
        } else {
            this.field3759.method1270(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field3759.field2553 / (float) this.field3759.field2876;
            var11 = (float) arg2 * this.field3759.field2552 / (float) this.field3759.field2874;
        }
        this.method1672();
        this.method1669(this.field3759);
        this.method1701(arg8);
        this.field3634.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1762(arg5);
        this.method1627(34165, 34165);
        this.method1634(0, 34166, 768);
        this.method1634(2, 5890, 770);
        this.method1763(0, 34166, 770);
        this.method1763(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field3634.glBegin(7);
        this.field3634.glTexCoord2f(0.0F, 0.0F);
        this.field3634.glVertex2f(var12, var13);
        this.field3634.glTexCoord2f(0.0F, var11);
        this.field3634.glVertex2f(var12, var15);
        this.field3634.glTexCoord2f(var10, var11);
        this.field3634.glVertex2f(var14, var15);
        this.field3634.glTexCoord2f(var10, 0.0F);
        this.field3634.glVertex2f(var14, var13);
        this.field3634.glEnd();
        this.method1634(0, 5890, 768);
        this.method1634(2, 34166, 770);
        this.method1763(0, 5890, 770);
        this.method1763(2, 34166, 770);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([IIIII)Lcq;", line = 90)
    public final class67 method1624(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class58(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "()Z", line = 93)
    public final boolean method1625() {
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[Lwc;)V", line = 101)
    public final void method1626(int arg0, class367[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class367 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field3635[0] = (float) var4.field5308;
            field3635[1] = (float) var4.field5307;
            field3635[2] = (float) var4.field5310;
            field3635[3] = 1.0F;
            this.field3634.glLightfv(var5, 4611, field3635, 0);
            int var6 = var4.field5309;
            float var7 = var4.field5299 / 255.0F;
            field3635[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field3635[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field3635[2] = (float) (var6 & 0xFF) * var7;
            this.field3634.glLightfv(var5, 4609, field3635, 0);
            this.field3634.glLightf(var5, 4617, 1.0F / (float) (var4.field5303 * var4.field5303));
            this.field3634.glEnable(var5);
        }
        while (var3 < this.field3744) {
            this.field3634.glDisable(var3 + 16386);
            var3++;
        }
        this.field3744 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(II)V", line = 137)
    public final void method1627(int arg0, int arg1) {
        if (this.field3664 != 0) {
            this.field3634.glTexEnvi(8960, 34161, arg0);
            this.field3634.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field3725 != arg0) {
            this.field3634.glTexEnvi(8960, 34161, arg0);
            this.field3725 = arg0;
            var3 = true;
        }
        if (this.field3715 != arg1) {
            this.field3634.glTexEnvi(8960, 34162, arg1);
            this.field3715 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field3709 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(I)I", line = 169)
    public final int method1628(int arg0) {
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
            return 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lna;", line = 203)
    public final class50 method1629(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class50) (this.field3676 && !arg2 || this.field3689 ? new class452(this, arg0, arg1, arg2) : new class150(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "()V", line = 217)
    private final void method1630() {
        if (this.field3727 && this.field3708 | this.field3761 >= 0) {
            this.field3634.glEnable(2912);
        } else {
            this.field3634.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(II)V", line = 225)
    public final synchronized void method1631(int arg0, int arg1) {
        class279 var3 = new class279(arg1);
        var3.field640 = (long) arg0;
        this.field3654.method330(var3, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIIIII)V", line = 233)
    public final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1768();
        this.method1701(arg5);
        this.field3634.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3723) {
            this.field3634.glDisable(32925);
        }
        this.field3634.glBegin(7);
        this.field3634.glVertex2f(var7, var8);
        this.field3634.glVertex2f(var7, var10);
        this.field3634.glVertex2f(var9, var10);
        this.field3634.glVertex2f(var9, var8);
        this.field3634.glEnd();
        if (this.field3723) {
            this.field3634.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "()V", line = 257)
    public final void method1633() {
        this.field3634.glLightfv(16384, 4611, this.field3713, 0);
        this.field3634.glLightfv(16385, 4611, this.field3661, 0);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)V", line = 262)
    public final void method1634(int arg0, int arg1, int arg2) {
        this.field3634.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field3634.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lgm;)V", line = 266)
    public final void method1635(class336 arg0) {
        this.field3634.glEnableClientState(32886);
        arg0.method2209((byte) 125);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(Z)V", line = 271)
    public final void method1636(boolean arg0) {
        if (this.field3740 != arg0) {
            this.field3740 = arg0;
            this.method1750();
            this.field3709 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lmb;)V", line = 281)
    public final void method1637(class258 arg0) {
        this.field3634.glPushMatrix();
        this.field3634.glMultMatrixf(arg0.method1792(13), 0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 287)
    public final void method1638(boolean arg0) {
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(III)V", line = 291)
    public final void method1639(int arg0, int arg1, int arg2) {
        this.field3634.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "()Z", line = 297)
    public final boolean method1640() {
        return this.field3723;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(FFF)V", line = 300)
    private final void method1641(float arg0, float arg1, float arg2) {
        this.field3634.glMatrixMode(5890);
        if (this.field3758) {
            this.field3634.glLoadIdentity();
        }
        this.field3634.glTranslatef(arg0, arg1, arg2);
        this.field3634.glMatrixMode(5888);
        this.field3758 = true;
    }

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "()V", line = 310)
    public final void method1642() {
        this.field3634.glPopMatrix();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)I", line = 315)
    public final int method1643(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "(I)V", line = 319)
    public final synchronized void method1644(int arg0) {
        class279 var2 = new class279(arg0);
        this.field3659.method330(var2, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "()Lvj;", line = 323)
    public final class177 method1645() {
        return new class258();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(FF)V", line = 326)
    public final void method1646(float arg0, float arg1) {
        this.field3700 = arg0;
        this.field3679 = arg1;
        if (!this.field3708) {
            this.method1758();
        }
    }

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "()I", line = 333)
    public final int method1647() {
        return this.field3736;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lvj;)V", line = 339)
    public final void method1648(class177 arg0) {
        this.field3696 = (class258) arg0;
        this.field3674.method1790((byte) 59, this.field3696);
        if (this.field3684 != 1) {
            this.method1753();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 346)
    public final void method1649(int arg0) {
        this.method1714();
    }

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "()V", line = 349)
    private final void method1650() {
        this.field3724 = (this.field3694[14] - (float) this.field3736) / this.field3694[10];
        this.field3746 = (float) this.field3736 - this.field3692;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lgm;)V", line = 354)
    public final void method1651(class336 arg0) {
        this.field3634.glEnableClientState(32884);
        arg0.method2212((byte) 31);
    }

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "()V", line = 361)
    public final void method1652() {
        this.field3683 = 0;
        this.field3714 = 0;
        this.field3753 = this.field3646;
        this.field3673 = this.field3648;
        this.field3634.glDisable(3089);
        this.method1713();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ldc;Lop;Lvj;Lkd;I)V", line = 369)
    public final void method1653(class375 arg0, class352 arg1, class177 arg2, class330 arg3, int arg4) {
        arg0.method1601(arg2, arg3, arg4);
        this.method1700(arg1);
    }

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "()V", line = 373)
    public final void method1654() {
        if (this.field3709 == 16) {
            return;
        }
        this.method1680();
        this.method1674(true);
        this.method1754(true);
        this.method1667(true);
        this.method1701(1);
        this.method1745(1);
        this.field3709 = 16;
    }

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "()Lik;", line = 387)
    public final class409 method1655() {
        return this.field3653;
    }

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "(I)V", line = 392)
    public final synchronized void method1656(int arg0) {
        class279 var2 = new class279(arg0);
        this.field3656.method330(var2, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Lgm;)V", line = 397)
    public final void method1657(class336 arg0) {
        this.field3634.glEnableClientState(32885);
        arg0.method2211(72);
    }

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "(I)I", line = 401)
    public final int method1658(int arg0) {
        if (arg0 == 5121 || arg0 == 5120) {
            return 1;
        } else if (arg0 == 5123 || arg0 == 5122) {
            return 2;
        } else if (arg0 == 5125 || arg0 == 5124 || arg0 == 5126) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "()V", line = 415)
    private final void method1659() {
        this.field3634.glMatrixMode(5889);
        this.field3634.glLoadMatrixf(this.field3694, 0);
        this.field3634.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "()V", line = 420)
    private final void method1660() {
        this.field3634.glDepthMask(this.field3675 && this.field3738);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFF)V", line = 423)
    public final void method1661(float arg0, float arg1, float arg2, float arg3) {
        field3627[0] = arg0;
        field3627[1] = arg1;
        field3627[2] = arg2;
        field3627[3] = arg3;
        this.field3634.glTexEnvfv(8960, 8705, field3627, 0);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(F)V", line = 431)
    public final void method1662(float arg0) {
        if (this.field3722 != arg0) {
            this.field3722 = arg0;
            if (this.field3684 == 3) {
                this.method1772();
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIZ)Lcq;", line = 441)
    public final class67 method1663(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class58(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "()Lvm;", line = 444)
    public final class322 method1664() {
        return this.field3749 == null ? null : this.field3749.method729((byte) 70);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIII)V", line = 450)
    public final void method1665(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3683 < arg0) {
            this.field3683 = arg0;
        }
        if (this.field3753 > arg2) {
            this.field3753 = arg2;
        }
        if (this.field3714 < arg1) {
            this.field3714 = arg1;
        }
        if (this.field3673 > arg3) {
            this.field3673 = arg3;
        }
        this.field3634.glEnable(3089);
        this.method1713();
        this.method1755();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIII)V", line = 469)
    public final void method1666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1768();
        this.method1701(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3634.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3634.glBegin(1);
        this.field3634.glVertex2f(var6, var7);
        this.field3634.glVertex2f(var6, (float) arg2 + var7);
        this.field3634.glEnd();
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(Z)V", line = 482)
    public final void method1667(boolean arg0) {
        if (this.field3675 != arg0) {
            this.field3675 = arg0;
            this.method1660();
            this.field3709 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lko;III)V", line = 493)
    public final void method1668(class19 arg0, int arg1, int arg2, int arg3) {
        this.method1738(arg0);
        arg0.method140(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lme;)V", line = 500)
    public final void method1669(class360 arg0) {
        class360 var2 = this.field3739[this.field3664];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field3634.glDisable(var2.field5204);
            } else {
                if (var2 == null) {
                    this.field3634.glEnable(arg0.field5204);
                } else if (arg0.field5204 != var2.field5204) {
                    this.field3634.glDisable(var2.field5204);
                    this.field3634.glEnable(arg0.field5204);
                }
                this.field3634.glBindTexture(arg0.field5204, arg0.method2348());
            }
            this.field3739[this.field3664] = arg0;
        }
        this.field3709 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "()V", line = 530)
    public final void method1670() {
        this.field3646 = this.field3633.getWidth();
        this.field3648 = this.field3633.getHeight();
        this.field3634.glViewport(this.field3672, this.field3760, this.field3646, this.field3648);
        this.method1677();
        this.method1652();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhs;)V", line = 537)
    public final void method1671(class420 arg0) {
        this.field3749 = (class111) arg0;
    }

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "()V", line = 540)
    public final void method1672() {
        if (this.field3709 == 2) {
            return;
        }
        this.method1742();
        this.method1674(false);
        this.method1636(false);
        this.method1754(false);
        this.method1667(false);
        this.method1722(-2);
        this.field3709 = 2;
    }

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "()V", line = 557)
    private final void method1673() {
        this.field3696 = new class258();
        this.field3674 = new class258();
        this.field3739 = new class360[this.field3667];
        this.field3754 = new class216(this, 3553, 6408, 1, 1);
        this.field3706 = new class216(this, 3553, 6408, 1, 1);
        this.field3731 = new class216(this, 3553, 6408, 1, 1);
        this.field3695 = new class417(this);
        this.field3702 = new class417(this);
        this.field3662 = new class417(this);
        this.field3743 = new class417(this);
        this.field3666 = new class417(this);
        this.field3687 = new class417(this);
        this.field3757 = this.method1687(5123, (byte[]) null, 1024, true);
        if (this.field3718) {
            this.field3707 = new class74(this);
        }
        this.field3639.method2360(this);
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(Z)V", line = 579)
    public final void method1674(boolean arg0) {
        if (this.field3727 != arg0) {
            this.field3727 = arg0;
            this.method1630();
            this.field3709 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "(I)V", line = 591)
    public final synchronized void method1675(int arg0) {
        class279 var2 = new class279(arg0);
        this.field3658.method330(var2, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([I)V", line = 596)
    public final void method1676(int[] arg0) {
        arg0[0] = this.field3683;
        arg0[1] = this.field3714;
        arg0[2] = this.field3753;
        arg0[3] = this.field3673;
    }

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "()V", line = 602)
    public final void method1677() {
        if (this.field3684 != 0) {
            this.field3684 = 0;
            this.field3709 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "()I", line = 612)
    public final int method1678() {
        int var1 = this.field3763;
        this.field3763 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Ldc;Lvj;[Lkd;I)V", line = 620)
    public final void method1679(class375[] arg0, class177 arg1, class330[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1601(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "()V", line = 631)
    private final void method1680() {
        if (this.field3684 != 3) {
            this.field3684 = 3;
            this.method1772();
            this.method1753();
            this.field3709 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhs;Lhs;FLhs;)Lhs;", line = 643)
    public final class420 method1681(class420 arg0, class420 arg1, float arg2, class420 arg3) {
        if (arg0 != null && arg1 != null && this.field3660 && this.field3718) {
            class127 var5 = null;
            class111 var6 = (class111) arg0;
            class111 var7 = (class111) arg1;
            class322 var8 = var6.method729((byte) 70);
            class322 var9 = var7.method729((byte) 70);
            if (var8 != null && var9 != null) {
                int var10 = var8.field4735 > var9.field4735 ? var8.field4735 : var9.field4735;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class127) {
                    class127 var11 = (class127) arg3;
                    if (var11.method805((byte) -34) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class127(this, var10);
                }
                var5.method804(var8, arg2, var9, 0);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 680)
    public final void method1682(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lcl;[Lup;Z)Lwl;", line = 686)
    public final class273 method1683(class313 arg0, class441[] arg1, boolean arg2) {
        return new class348(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "()Z", line = 689)
    public final boolean method1684() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V", line = 693)
    public final void method1685(int arg0, int arg1, int arg2) {
        if (!this.field3708) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field3688 = arg1;
        this.field3756 = arg2;
        this.method1758();
        this.field3632.method775(arg0, true, (byte) -123);
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V", line = 706)
    public final void method1686(int arg0) {
        this.method1701(0);
        this.field3634.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field3634.glClear(16384);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BIZ)Lko;", line = 712)
    public final class19 method1687(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class19) (this.field3676 && !arg3 || this.field3689 ? new class311(this, arg0, arg1, arg2, arg3) : new class136(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[[I[[IIII)Lck;", line = 728)
    public final class351 method1688(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class371(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "()V", line = 733)
    public final void method1689() {
        if (this.field3709 == 4) {
            return;
        }
        this.method1742();
        this.method1674(false);
        this.method1636(false);
        this.method1754(false);
        this.method1667(false);
        this.method1722(-2);
        this.method1701(1);
        this.method1745(1);
        this.field3709 = 4;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(II)V", line = 750)
    public final synchronized void method1690(int arg0, int arg1) {
        class279 var3 = new class279(arg1);
        var3.field640 = (long) arg0;
        this.field3655.method330(var3, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "()V", line = 757)
    private final void method1691() {
        this.method1722(-2);
        for (int var1 = this.field3667 - 1; var1 >= 0; var1--) {
            this.method1777(var1);
            this.method1669((class360) null);
            this.field3634.glTexEnvi(8960, 8704, 34160);
        }
        this.method1627(8448, 8448);
        this.method1634(2, 34168, 770);
        this.method1706();
        this.field3634.glEnable(3042);
        this.field3634.glBlendFunc(770, 771);
        this.field3690 = 1;
        this.field3634.glEnable(3008);
        this.field3634.glAlphaFunc(516, 0.0F);
        this.field3701 = true;
        this.field3634.glColorMask(true, true, true, true);
        this.field3717 = true;
        this.field3686 = 1;
        this.method1674(true);
        this.method1636(true);
        this.method1754(true);
        this.method1667(true);
        this.method1677();
        this.field3634.setSwapInterval(0);
        this.field3634.glShadeModel(7425);
        this.field3634.glClearDepth(1.0F);
        this.field3634.glDepthFunc(515);
        this.field3634.glPolygonMode(1028, 6914);
        this.field3634.glEnable(2884);
        this.field3634.glCullFace(1029);
        this.field3634.glMatrixMode(5888);
        this.field3634.glLoadIdentity();
        this.field3634.glColorMaterial(1028, 5634);
        this.field3634.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field3634.glLightfv(var4, 4608, var2, 0);
            this.field3634.glLightf(var4, 4615, 0.0F);
            this.field3634.glLightf(var4, 4616, 0.0F);
        }
        this.field3634.glEnable(16384);
        this.field3634.glEnable(16385);
        this.field3634.glFogf(2914, 0.95F);
        this.field3634.glFogi(2917, 9729);
        this.field3634.glHint(3156, 4353);
        this.field3741 = this.field3728 = -1;
        this.method1652();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Ldc;Lop;Lvj;[Lkd;I)V", line = 821)
    public final void method1692(class375[] arg0, class352 arg1, class177 arg2, class330[] arg3, int arg4) {
        this.method1679(arg0, arg2, arg3, arg4);
        this.method1700(arg1);
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)Ltr;", line = 825)
    public final class139 method1693(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "()V", line = 828)
    public final void method1694() {
        if (this.field3634 != null) {
            try {
                this.field3630.method1212();
            } catch (Throwable var4) {
            }
            this.field3634 = null;
        }
        if (this.field3636 != null) {
            this.method1621();
            try {
                this.field3636.destroy();
            } catch (Throwable var3) {
            }
            this.field3636 = null;
        }
        if (this.field3649) {
            class294.method2009(true, true, (byte) -81);
            this.field3649 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "()Z", line = 859)
    public final boolean method1695() {
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(Z)V", line = 864)
    public final void method1696(boolean arg0) {
        if (this.field3748 != arg0) {
            this.field3748 = arg0;
            this.method1750();
        }
    }

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "()V", line = 874)
    public final void method1697() {
        this.method1667(true);
        this.field3634.glClear(256);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V", line = 881)
    public final void method1698(boolean arg0) {
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V", line = 886)
    public final synchronized void method1699(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3654.method338(16091)) {
            class279 var4 = (class279) this.field3654.method340(false);
            field3638[var2++] = (int) var4.field640;
            this.field3651 -= var4.field4054;
            if (var2 == 1000) {
                this.field3634.glDeleteBuffersARB(var2, field3638, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3634.glDeleteBuffersARB(var2, field3638, 0);
            var2 = 0;
        }
        while (!this.field3655.method338(16091)) {
            class279 var5 = (class279) this.field3655.method340(false);
            field3638[var2++] = (int) var5.field640;
            this.field3643 -= var5.field4054;
            if (var2 == 1000) {
                this.field3634.glDeleteTextures(var2, field3638, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3634.glDeleteTextures(var2, field3638, 0);
            var2 = 0;
        }
        while (!this.field3656.method338(16091)) {
            class279 var6 = (class279) this.field3656.method340(false);
            field3638[var2++] = var6.field4054;
            if (var2 == 1000) {
                this.field3634.glDeleteFramebuffersEXT(var2, field3638, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3634.glDeleteFramebuffersEXT(var2, field3638, 0);
            var2 = 0;
        }
        while (!this.field3657.method338(16091)) {
            class279 var7 = (class279) this.field3657.method340(false);
            field3638[var2++] = (int) var7.field640;
            this.field3642 -= var7.field4054;
            if (var2 == 1000) {
                this.field3634.glDeleteRenderbuffersEXT(var2, field3638, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3634.glDeleteRenderbuffersEXT(var2, field3638, 0);
            var2 = 0;
        }
        while (!this.field3658.method338(16091)) {
            class279 var8 = (class279) this.field3658.method340(false);
            field3638[var2++] = (int) var8.field640;
            if (var2 == 1000) {
                this.field3634.glDeleteProgramsARB(var2, field3638, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3634.glDeleteProgramsARB(var2, field3638, 0);
            boolean var9 = false;
        }
        while (!this.field3647.method338(16091)) {
            class279 var10 = (class279) this.field3647.method340(false);
            this.field3634.glDeleteLists((int) var10.field640, var10.field4054);
        }
        while (!this.field3659.method338(16091)) {
            class279 var11 = (class279) this.field3659.method340(false);
            this.field3634.glDeleteObjectARB(var11.field4054);
        }
        while (!this.field3647.method338(16091)) {
            class279 var12 = (class279) this.field3647.method340(false);
            this.field3634.glDeleteLists((int) var12.field640, var12.field4054);
        }
        if (this.method1779() > 100663296 && class114.method735(108) > this.field3742 + 60000L) {
            System.gc();
            this.field3742 = class114.method735(124);
        }
        this.field3641 = var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lop;)V", line = 1052)
    public final void method1700(class352 arg0) {
        this.field3639.method2362(this, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "(I)V", line = 1055)
    public final void method1701(int arg0) {
        if (this.field3686 == arg0) {
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
        if (this.field3717 != var3) {
            this.field3634.glColorMask(var3, var3, var3, true);
            this.field3717 = var3;
        }
        if (this.field3701 != var4) {
            if (var4) {
                this.field3634.glEnable(3008);
            } else {
                this.field3634.glDisable(3008);
            }
            this.field3701 = var4;
        }
        if (this.field3690 != var2) {
            if (var2 == 1) {
                this.field3634.glEnable(3042);
                this.field3634.glBlendEquation(32774);
                this.field3634.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field3634.glEnable(3042);
                this.field3634.glBlendEquation(32774);
                this.field3634.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field3634.glEnable(3042);
                this.field3634.glBlendEquation(32778);
                this.field3634.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field3634.glEnable(3042);
                this.field3634.glBlendEquation(32774);
                this.field3634.glBlendFunc(774, 1);
            } else {
                this.field3634.glDisable(3042);
            }
            this.field3690 = var2;
        }
        this.field3686 = arg0;
        this.field3709 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFF)V", line = 1169)
    public final void method1702(float arg0, float arg1, float arg2) {
        class433.field6363 = arg0;
        class433.field6374 = arg1;
        class433.field6369 = arg2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FFFFFF)V", line = 1176)
    private final void method1703(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field3694;
        var8[0] = var7 / (arg1 - arg0);
        var8[1] = 0.0F;
        var8[2] = 0.0F;
        var8[3] = 0.0F;
        var8[4] = 0.0F;
        var8[5] = var7 / (arg3 - arg2);
        var8[6] = 0.0F;
        var8[7] = 0.0F;
        var8[8] = (arg0 + arg1) / (arg1 - arg0);
        var8[9] = (arg2 + arg3) / (arg3 - arg2);
        var8[10] = this.field3737 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field3726 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method1708();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V", line = 1200)
    public final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3634.glLineWidth((float) arg5);
        this.method1782(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field3634.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1206)
    public final void method1705(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "()V", line = 1210)
    private final void method1706() {
        if (this.field3758) {
            this.field3634.glMatrixMode(5890);
            this.field3634.glLoadIdentity();
            this.field3634.glMatrixMode(5888);
            this.field3758 = false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "()V", line = 1224)
    public final void method1707() {
        if (this.field3628.method1034(true)) {
            this.field3630.method1207(this.field3628);
            this.field3629.method1979((byte) 63);
        }
    }

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "()V", line = 1233)
    private final void method1708() {
        if (this.field3692 == 0.0F) {
            this.field3694[10] = this.field3737;
            this.field3694[14] = this.field3726;
        } else {
            float var1 = this.field3665 / (this.field3692 + this.field3665);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field3726 * (1.0F - var1) / this.field3692;
            this.field3694[10] = this.field3737 + var3;
            this.field3694[14] = this.field3726 * var2;
        }
        this.method1650();
    }

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "()I", line = 1253)
    public final int method1709() {
        return 4;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()I", line = 1258)
    public final int method541() {
        return this.field3648;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lup;Z)Lcq;", line = 1262)
    public final class67 method1710(class441 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field6466 * arg0.field6462];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6460 == null) {
            for (int var8 = 0; var8 < arg0.field6462; var8++) {
                for (int var9 = 0; var9 < arg0.field6466; var9++) {
                    int var10 = arg0.field6468[arg0.field6464[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field6462; var6++) {
                for (int var7 = 0; var7 < arg0.field6466; var7++) {
                    var3[var5++] = arg0.field6460[var4] << 24 | arg0.field6468[arg0.field6464[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class67 var11 = this.method1624(var3, 0, arg0.field6466, arg0.field6466, arg0.field6462);
        var11.method410(arg0.field6461, arg0.field6467, arg0.field6465, arg0.field6463);
        return var11;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lna;)V", line = 1317)
    public final void method1711(class50 arg0) {
        if (this.field3716 != arg0 && this.field3676) {
            this.field3634.glBindBufferARB(34962, arg0.method139());
            this.field3716 = arg0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[I[I)Lud;", line = 1325)
    public final class2 method1712(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class176.method1077(this, arg0, arg1, arg3, arg2, (byte) -1);
    }

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "()V", line = 1333)
    private final void method1713() {
        this.field3710 = (float) (this.field3683 - this.field3729);
        this.field3698 = (float) (this.field3753 - this.field3729);
        this.field3712 = (float) (this.field3714 - this.field3705);
        this.field3750 = (float) (this.field3673 - this.field3705);
    }

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "()V", line = 1341)
    private final void method1714() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field3636.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class144.method918(1000L, true);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lwp;IIII)Ldc;", line = 1362)
    public final class375 method1715(class245 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class417(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "()V", line = 1365)
    public final void method1716() {
        if (this.field3684 != 2) {
            this.field3684 = 2;
            this.method1659();
            this.method1753();
            this.field3709 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "()Z", line = 1377)
    public final boolean method1717() {
        return this.field3628.method1034(true);
    }

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "()V", line = 1380)
    public final void method1718() {
        this.field3634.glDisableClientState(32886);
        this.field3634.glDisableClientState(32885);
        this.field3634.glDisableClientState(32884);
        for (int var1 = this.field3697 - 1; var1 >= 0; var1--) {
            this.field3634.glClientActiveTexture(var1 + 33984);
            this.field3634.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1395)
    public final void method1719(Rectangle[] arg0, int arg1) {
        this.method1748();
    }

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "()Z", line = 1399)
    public final boolean method1720() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(II)V", line = 1402)
    public final void method1721(int arg0, int arg1) {
        this.field3672 = arg0;
        this.field3760 = arg1;
        this.field3634.glViewport(arg0, arg1, this.field3646, this.field3648);
        this.method1755();
    }

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "(I)V", line = 1408)
    public final void method1722(int arg0) {
        this.method1766(arg0, true);
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIII)V", line = 1413)
    public final void method1723(int arg0, int arg1, int arg2, int arg3) {
        this.field3729 = arg0;
        this.field3705 = arg1;
        this.field3678 = arg2;
        this.field3734 = arg3;
        float var5 = (float) (-this.field3729 * this.field3732) / (float) this.field3678;
        float var6 = (float) (-this.field3705 * this.field3732) / (float) this.field3734;
        float var7 = (float) ((this.field3646 - this.field3729) * this.field3732) / (float) this.field3678;
        float var8 = (float) ((this.field3648 - this.field3705) * this.field3732) / (float) this.field3734;
        this.method1703(var5, var7, -var8, -var6, (float) this.field3732, (float) this.field3736);
        if (this.field3684 != 1) {
            this.method1677();
        }
        this.method1650();
        this.method1713();
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "()F", line = 1433)
    public final float method1724() {
        return this.field3692;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lik;)V", line = 1436)
    public final void method1725(class409 arg0) {
        if (this.field3652 >= 3) {
            throw new RuntimeException();
        }
        if (this.field3652 >= 0) {
            this.field3644[this.field3652].method548();
        }
        this.field3653 = this.field3644[++this.field3652] = arg0;
        this.field3653.method550();
    }

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "()Z", line = 1448)
    public final boolean method1726() {
        if (!this.field3628.method1034(true)) {
            if (!this.field3630.method1213(this.field3628)) {
                return false;
            }
            this.field3629.method1979((byte) 73);
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V", line = 1460)
    public final void method1727(int arg0) {
        this.method1621();
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "()Z", line = 1465)
    public final boolean method1728() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIII)[I", line = 1471)
    public final int[] method1729(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field3634.glReadPixels(arg0, this.field3648 - arg1 - var6, arg2, 1, 32993, this.field3751, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "()Z", line = 1485)
    public final boolean method1730() {
        return this.field3628.method2738();
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIIIII)V", line = 1491)
    public final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1768();
        this.method1701(arg5);
        this.field3634.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3723) {
            this.field3634.glDisable(32925);
        }
        this.field3634.glBegin(2);
        this.field3634.glVertex2f(var7, var8);
        this.field3634.glVertex2f(var7, var10);
        this.field3634.glVertex2f(var9, var10);
        this.field3634.glVertex2f(var9, var8);
        this.field3634.glEnd();
        if (this.field3723) {
            this.field3634.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)V", line = 1517)
    public final void method1732(int arg0, int arg1, int arg2, int arg3) {
        this.field3630.method1206(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I[BIZ)Lna;", line = 1521)
    public final class50 method1733(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class50) (this.field3676 && !arg3 || this.field3689 ? new class452(this, arg0, arg1, arg2, arg3) : new class150(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()V", line = 1530)
    public final void method550() {
    }

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "()Z", line = 1532)
    public final boolean method1734() {
        return this.field3632.method774(3973, 3);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()V", line = 1535)
    public final void method548() {
    }

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "()Lvj;", line = 1537)
    public final class177 method1735() {
        return this.field3640;
    }

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "()Z", line = 1540)
    public final boolean method1736() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FF)V", line = 1545)
    public final void method1737(float arg0, float arg1) {
        if (this.field3665 == arg0 && this.field3692 == arg1) {
            return;
        }
        this.field3665 = arg0;
        this.field3692 = arg1;
        this.method1708();
        this.method1650();
        if (this.field3684 == 3) {
            this.method1772();
        } else if (this.field3684 == 2) {
            this.method1659();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lko;)V", line = 1563)
    public final void method1738(class19 arg0) {
        if (this.field3721 != arg0 && this.field3676) {
            this.field3634.glBindBufferARB(34963, arg0.method139());
            this.field3721 = arg0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIIII)V", line = 1574)
    public final void method1739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1768();
        this.method1701(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3634.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3634.glBegin(1);
        this.field3634.glVertex2f(var6, var7);
        this.field3634.glVertex2f((float) arg2 + var6, var7);
        this.field3634.glEnd();
    }

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "()Z", line = 1588)
    public final boolean method1740() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(IIIII)V", line = 1593)
    public final void method1741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "()V", line = 1596)
    private final void method1742() {
        if (this.field3684 == 1) {
            return;
        }
        this.field3634.glMatrixMode(5889);
        this.field3634.glLoadIdentity();
        this.field3634.glOrtho(0.0D, (double) this.field3646, (double) this.field3648, 0.0D, -1.0D, 1.0D);
        this.field3634.glMatrixMode(5888);
        this.field3634.glLoadIdentity();
        this.field3684 = 1;
        this.field3709 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "()Z", line = 1610)
    public final boolean method1743() {
        return !this.field3693;
    }

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "()V", line = 1619)
    public final void method1744() {
        int var1 = this.field3683;
        int var2 = this.field3753;
        int var3 = this.field3714;
        int var4 = this.field3673;
        this.method1652();
        this.field3634.glReadBuffer(1028);
        this.field3634.glDrawBuffer(1029);
        this.method1677();
        this.method1674(false);
        this.method1636(false);
        this.method1754(false);
        this.method1667(false);
        this.method1669((class360) null);
        this.method1722(-2);
        this.method1745(0);
        this.method1701(0);
        this.field3634.glMatrixMode(5889);
        this.field3634.glLoadIdentity();
        this.field3634.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field3634.glMatrixMode(5888);
        this.field3634.glLoadIdentity();
        this.field3634.glRasterPos2i(0, 0);
        this.field3634.glCopyPixels(0, 0, this.field3646, this.field3648, 6144);
        this.field3634.glFlush();
        this.field3634.glReadBuffer(1029);
        this.field3634.glDrawBuffer(1029);
        this.method1767(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "(I)V", line = 1651)
    public final void method1745(int arg0) {
        if (arg0 == 0) {
            this.method1627(7681, 7681);
        } else if (arg0 == 1) {
            this.method1627(8448, 8448);
        } else if (arg0 == 2) {
            this.method1627(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V", line = 1666)
    public final void method1746(int arg0, int arg1, int arg2) {
        this.field3708 = true;
        this.field3688 = arg1;
        this.field3756 = arg2;
        this.method1758();
        this.method1630();
        this.field3632.method776(3, false, false, (byte) -103);
        this.field3632.method775(arg0, true, (byte) -95);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIIII)V", line = 1675)
    public final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "()V", line = 1680)
    public final void method1748() {
        try {
            this.field3636.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "()V", line = 1691)
    public final void method1749() {
        this.field3632.method776(0, false, false, (byte) -103);
        this.field3708 = false;
        this.method1758();
        this.method1630();
    }

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "()V", line = 1698)
    private final void method1750() {
        if (this.field3740 && !this.field3748) {
            this.field3634.glEnable(2896);
        } else {
            this.field3634.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "()V", line = 1706)
    public final void method1751() {
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFFFFF)V", line = 1711)
    public final void method1752(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field3741 != arg0;
        if (var7 || this.field3669 != arg1 || this.field3745 != arg2) {
            this.field3741 = arg0;
            this.field3669 = arg1;
            this.field3745 = arg2;
            if (var7) {
                this.field3733 = (float) (this.field3741 & 0xFF0000) / 1.671168E7F;
                this.field3747 = (float) (this.field3741 & 0xFFFF) / 65535.0F;
                this.field3699 = (float) (this.field3741 & 0xFF) / 255.0F;
                this.method1786();
            }
            this.method1759();
        }
        if (this.field3713[0] == arg3 && this.field3713[1] == arg4 && this.field3713[2] == arg5) {
            return;
        }
        this.field3713[0] = arg3;
        this.field3713[1] = arg4;
        this.field3713[2] = arg5;
        this.field3661[0] = -arg3;
        this.field3661[1] = -arg4;
        this.field3661[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field3703[0] = arg3 * var8;
        this.field3703[1] = arg4 * var8;
        this.field3703[2] = arg5 * var8;
        this.field3704[0] = -this.field3703[0];
        this.field3704[1] = -this.field3703[1];
        this.field3704[2] = -this.field3703[2];
        this.method1633();
        this.field3671 = (int) (arg3 * 256.0F / arg4);
        this.field3691 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "()V", line = 1751)
    private final void method1753() {
        this.field3634.glLoadIdentity();
        this.field3634.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field3634.glMultMatrixf(this.field3696.method1792(13), 0);
        this.method1633();
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(Z)V", line = 1759)
    public final void method1754(boolean arg0) {
        if (this.field3681 == arg0) {
            return;
        }
        if (arg0) {
            this.field3634.glEnable(2929);
        } else {
            this.field3634.glDisable(2929);
        }
        this.field3681 = arg0;
        this.field3709 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "()V", line = 1772)
    private final void method1755() {
        if (this.field3683 <= this.field3753 && this.field3714 <= this.field3673) {
            this.field3634.glScissor(this.field3683 + this.field3672, this.field3760 + this.field3648 - this.field3673, this.field3753 - this.field3683, this.field3673 - this.field3714);
        } else {
            this.field3634.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(F)V", line = 1783)
    public final void method1756(float arg0) {
        if (this.field3680 != arg0) {
            this.field3680 = arg0;
            this.method1786();
        }
    }

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "()V", line = 1793)
    public final void method1757() {
        this.field3630.method1211();
    }

    @OriginalMember(owner = "client!nf", name = "nb", descriptor = "()V", line = 1797)
    private final void method1758() {
        int var1;
        if (this.field3708) {
            this.field3634.glFogf(2915, 0.0F);
            this.field3634.glFogf(2916, 1.0F);
            var1 = this.field3688;
        } else {
            this.field3682 = (float) (this.field3736 - 256) - this.field3679;
            this.field3685 = this.field3682 - (float) this.field3761 * this.field3700;
            if (this.field3685 < (float) this.field3732) {
                this.field3685 = (float) this.field3732;
            }
            this.field3634.glFogf(2915, this.field3685);
            this.field3634.glFogf(2916, this.field3682);
            var1 = this.field3728;
        }
        field3627[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field3627[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field3627[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field3634.glFogfv(2918, field3627, 0);
    }

    @OriginalMember(owner = "client!nf", name = "ob", descriptor = "()V", line = 1821)
    private final void method1759() {
        field3627[0] = this.field3733 * this.field3669;
        field3627[1] = this.field3747 * this.field3669;
        field3627[2] = this.field3699 * this.field3669;
        field3627[3] = 1.0F;
        this.field3634.glLightfv(16384, 4609, field3627, 0);
        field3627[0] = -this.field3745 * this.field3733;
        field3627[1] = -this.field3745 * this.field3747;
        field3627[2] = -this.field3745 * this.field3699;
        field3627[3] = 1.0F;
        this.field3634.glLightfv(16385, 4609, field3627, 0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILgm;)V", line = 1836)
    public final void method1760(int arg0, class336 arg1) {
        this.field3634.glClientActiveTexture(arg0 + 33984);
        this.field3634.glEnableClientState(32888);
        arg1.method2210(9281);
    }

    @OriginalMember(owner = "client!nf", name = "pb", descriptor = "()I", line = 1842)
    private final int method1761() {
        int var1 = 0;
        this.field3752 = this.field3634.glGetString(7936);
        this.field3677 = this.field3634.glGetString(7937);
        String var2 = this.field3752.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field3634.glGetString(7938);
        String[] var4 = class243.method1459(var3.replace('.', ' '), ' ', 0);
        if (var4.length >= 2) {
            try {
                int var5 = class351.method2312(-1035, var4[0]);
                int var6 = class351.method2312(-1035, var4[1]);
                this.field3730 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field3730 < 12) {
            var1 |= 0x2;
        }
        if (!this.field3634.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field3634.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field3634.glGetIntegerv(34018, var8, 0);
        this.field3667 = var8[0];
        this.field3634.glGetIntegerv(34929, var8, 0);
        this.field3697 = var8[0];
        this.field3634.glGetIntegerv(34930, var8, 0);
        this.field3735 = var8[0];
        if (this.field3667 < 2 || this.field3697 < 2 || this.field3735 < 2) {
            var1 |= 0x10;
        }
        this.field3693 = class36.field516 != null && class36.field516.startsWith("mac");
        this.field3663 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field3676 = this.field3634.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3723 = this.field3634.isExtensionAvailable("GL_ARB_multisample");
        this.field3711 = this.field3634.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3634.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3634.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3755 = this.field3634.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3762 = this.field3634.isExtensionAvailable("GL_EXT_texture3D");
        this.field3670 = this.field3634.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3660 = this.field3634.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3719 = this.field3634.isExtensionAvailable("GL_ARB_texture_float");
        this.field3720 = false;
        this.field3718 = this.field3634.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "(I)V", line = 1913)
    public final void method1762(int arg0) {
        field3627[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field3627[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field3627[2] = (float) (arg0 & 0xFF) / 255.0F;
        field3627[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field3634.glTexEnvfv(8960, 8705, field3627, 0);
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(III)V", line = 1920)
    public final void method1763(int arg0, int arg1, int arg2) {
        this.field3634.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field3634.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V", line = 1927)
    public final void method1764(int arg0, int arg1) {
        if (this.field3732 == arg0 && this.field3736 == arg1) {
            return;
        }
        this.field3732 = arg0;
        this.field3736 = arg1;
        this.method1677();
        this.method1650();
        this.method1758();
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lik;)V", line = 1938)
    public final void method1765(class409 arg0) {
        if (this.field3652 < 0 || this.field3644[this.field3652] != arg0) {
            throw new RuntimeException();
        }
        this.field3644[this.field3652--] = null;
        arg0.method548();
        if (this.field3652 >= 0) {
            this.field3653 = this.field3644[this.field3652];
            this.field3653.method550();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)V", line = 1951)
    public final void method1766(int arg0, boolean arg1) {
        this.method1775(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(IIII)V", line = 1958)
    public final void method1767(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field3646) {
            arg2 = this.field3646;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field3648) {
            arg3 = this.field3648;
        }
        this.field3683 = arg0;
        this.field3714 = arg1;
        this.field3753 = arg2;
        this.field3673 = arg3;
        this.field3634.glEnable(3089);
        this.method1713();
        this.method1755();
    }

    @OriginalMember(owner = "client!nf", name = "qb", descriptor = "()V", line = 1979)
    private final void method1768() {
        if (this.field3709 == 1) {
            return;
        }
        this.method1742();
        this.method1674(false);
        this.method1636(false);
        this.method1754(false);
        this.method1667(false);
        this.method1669((class360) null);
        this.method1722(-2);
        this.method1745(0);
        this.field3709 = 1;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 1996)
    public final void method1769(boolean arg0) {
        this.field3738 = arg0;
        this.method1660();
    }

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "()Z", line = 2001)
    public final boolean method1770() {
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "()I", line = 2007)
    public final int method1771() {
        return this.field3732;
    }

    @OriginalMember(owner = "client!nf", name = "rb", descriptor = "()V", line = 2011)
    private final void method1772() {
        float var1 = (float) (-this.field3729) * this.field3722 / (float) this.field3678;
        float var2 = (float) (-this.field3705) * this.field3722 / (float) this.field3734;
        float var3 = (float) (this.field3646 - this.field3729) * this.field3722 / (float) this.field3678;
        float var4 = (float) (this.field3648 - this.field3705) * this.field3722 / (float) this.field3734;
        this.field3634.glMatrixMode(5889);
        this.field3634.glLoadIdentity();
        this.field3634.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field3732 - this.field3692), (double) ((float) this.field3736 - this.field3692));
        this.field3634.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "()Z", line = 2025)
    public final boolean method1773() {
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)Lhs;", line = 2031)
    public final class420 method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field3660 ? new class204(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZZ)V", line = 2035)
    public final void method1775(int arg0, boolean arg1, boolean arg2) {
        if (this.field3668 != arg0) {
            if (arg0 < 0) {
                this.method1706();
                this.method1669((class360) null);
                if (!this.field3708) {
                    this.field3632.method776(0, arg2, arg1, (byte) -103);
                }
            } else {
                class216 var4 = this.field3629.method1978(arg0, (byte) -91);
                class444 var5 = this.field3631.method186(arg0, -9590);
                if (var5.field6493 == 0 && var5.field6510 == 0) {
                    this.method1706();
                } else {
                    int var6 = var5.field6509 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1641((float) (this.field3641 % var7 * var5.field6493) / (float) var7, (float) (this.field3641 % var7 * var5.field6510) / (float) var7, 0.0F);
                }
                if (this.field3708) {
                    this.field3632.method776(3, arg2, arg1, (byte) -103);
                    this.method1669(var4);
                } else {
                    this.field3632.method776(var5.field6506, arg2, arg1, (byte) -103);
                    this.field3632.method775(var5.field6499, false, (byte) 95);
                    if (!this.field3632.method777(false, var4)) {
                        this.method1669(var4);
                    }
                }
            }
            this.field3668 = arg0;
        }
        this.field3709 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIILud;II)V", line = 2087)
    public final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, int arg8) {
        class176 var10 = (class176) arg6;
        class190 var11 = var10.field2335;
        this.method1672();
        this.method1669(var10.field2335);
        this.method1701(arg5);
        this.method1627(7681, 8448);
        this.method1634(0, 34167, 768);
        float var12 = var11.field2552 / (float) var11.field2555;
        float var13 = var11.field2553 / (float) var11.field2556;
        this.field3634.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3634.glBegin(1);
        this.field3634.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field3634.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3634.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field3634.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3634.glEnd();
        this.method1634(0, 5890, 768);
    }

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "(I)V", line = 2109)
    public final void method1777(int arg0) {
        if (this.field3664 != arg0) {
            this.field3634.glActiveTexture(arg0 + 33984);
            this.field3664 = arg0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfh;IILwd;)V", line = 2553)
    public class256(Canvas arg0, class210 arg1, int arg2, int arg3, class36 arg4) {
        this.field3633 = arg0;
        this.field3631 = arg1;
        this.field6028 = arg2;
        int var6 = 0;
        while (!this.field3633.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class144.method918(1000L, true);
        }
        this.field3633.setIgnoreRepaint(true);
        try {
            if (field3637 == null || !field3637) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field3637 = Boolean.TRUE;
                } else {
                    class429 var7 = arg4.method267((byte) -78, this.getClass());
                    while (var7.field6308 == 0) {
                        class144.method918(100L, true);
                    }
                    if (var7.field6308 == 1) {
                        field3637 = Boolean.TRUE;
                    }
                }
            }
            if (field3637 == null || !field3637) {
                throw new RuntimeException("");
            }
            this.field3636 = new context();
            if (!this.field3636.choosePixelFormat(this.field3633, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field3636.createContext()) {
                this.method1714();
                this.field3634 = this.field3636.getGL();
                int var8 = this.method1761();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field3751 = this.field3663 ? 33639 : 5121;
                String var9 = this.field3752.toLowerCase();
                String var10 = this.field3677.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class243.method1459(var10.replace('/', ' '), ' ', 0);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class43.method311(-124, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class43.method311(-122, var16.substring(0, 4))) {
                                        var11 = class351.method2312(-1035, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field3676 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field3762 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field3719 = false;
                    }
                    this.field3670 &= this.field3634.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field3689 = this.field3676;
                }
                if (var9.contains("intel")) {
                    this.field3718 = false;
                }
                if (this.field3676) {
                    try {
                        int[] var18 = new int[1];
                        this.field3634.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1725(this);
                this.method1670();
                this.method1673();
                new class101(this);
                this.field3629 = new class290(this, this.field3631);
                class226.method1312(120, true, true);
                this.field3649 = true;
                this.field3632 = new class121(this);
                this.field3630 = new class203(this);
                this.field3628 = new class433(this);
                this.method1691();
                this.field3634.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field3636.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class144.method918(100L, true);
                    }
                }
                this.field3634.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method1694();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "(I)I", line = 2120)
    public final int method1778(int arg0) {
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

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "()I", line = 2134)
    public final int method1779() {
        return this.field3651 + this.field3643 + this.field3642;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ltr;)V", line = 2138)
    public final void method1780(class139 arg0) {
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(IIIIII)Z", line = 2141)
    public final boolean method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field3696.field3774 + (float) arg0 * this.field3696.field3780 + (float) arg1 * this.field3696.field3778 + this.field3696.field3782;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3696.field3774 + (float) arg3 * this.field3696.field3780 + (float) arg4 * this.field3696.field3778 + this.field3696.field3782;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field3732) || !(var8 < (float) this.field3732)) || !(!(var7 > (float) this.field3736) || !(var8 > (float) this.field3736))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field3696.field3772 + (float) arg0 * this.field3696.field3777 + (float) arg1 * this.field3696.field3770 + this.field3696.field3781) * (float) this.field3678 / var7);
        int var10 = (int) (((float) arg5 * this.field3696.field3772 + (float) arg3 * this.field3696.field3777 + (float) arg4 * this.field3696.field3770 + this.field3696.field3781) * (float) this.field3678 / var8);
        if ((float) var9 < this.field3710 && (float) var10 < this.field3710 || (float) var9 > this.field3698 && (float) var10 > this.field3698) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field3696.field3773 + (float) arg0 * this.field3696.field3775 + (float) arg1 * this.field3696.field3776 + this.field3696.field3771) * (float) this.field3734 / var7);
            int var12 = (int) (((float) arg5 * this.field3696.field3773 + (float) arg3 * this.field3696.field3775 + (float) arg4 * this.field3696.field3776 + this.field3696.field3771) * (float) this.field3734 / var8);
            return (!((float) var11 < this.field3712) || !((float) var12 < this.field3712)) && (!((float) var11 > this.field3750) || !((float) var12 > this.field3750));
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(IIIIII)V", line = 2179)
    public final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1768();
        this.method1701(arg5);
        this.field3634.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3634.glBegin(2);
        this.field3634.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3634.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3634.glEnd();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[I)V", line = 2191)
    public final void method1783(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3696.field3774 + (float) arg0 * this.field3696.field3780 + (float) arg1 * this.field3696.field3778 + this.field3696.field3782;
        if ((var5 < (float) this.field3732) || (var5 > (float) this.field3736)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field3696.field3772 + (float) arg0 * this.field3696.field3777 + (float) arg1 * this.field3696.field3770 + this.field3696.field3781) * (float) this.field3678 / var5);
        int var7 = (int) (((float) arg2 * this.field3696.field3773 + (float) arg0 * this.field3696.field3775 + (float) arg1 * this.field3696.field3776 + this.field3696.field3771) * (float) this.field3734 / var5);
        if ((float) var6 >= this.field3710 && (float) var6 <= this.field3698 && (float) var7 >= this.field3712 && (float) var7 <= this.field3750) {
            arg3[0] = (int) ((float) var6 - this.field3710);
            arg3[1] = (int) ((float) var7 - this.field3712);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILud;II)V", line = 2219)
    public final void method1784(int arg0, class2 arg1, int arg2, int arg3) {
        class176 var5 = (class176) arg1;
        class190 var6 = var5.field2335;
        this.method1672();
        this.method1669(var5.field2335);
        this.method1701(1);
        this.method1627(7681, 8448);
        this.method1634(0, 34167, 768);
        float var7 = var6.field2552 / (float) var6.field2555;
        float var8 = var6.field2553 / (float) var6.field2556;
        this.field3634.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field3634.glBegin(7);
        this.field3634.glTexCoord2f((float) (this.field3683 - arg2) * var7, (float) (this.field3714 - arg3) * var8);
        this.field3634.glVertex2i(this.field3683, this.field3714);
        this.field3634.glTexCoord2f((float) (this.field3683 - arg2) * var7, (float) (this.field3673 - arg3) * var8);
        this.field3634.glVertex2i(this.field3683, this.field3673);
        this.field3634.glTexCoord2f((float) (this.field3753 - arg2) * var7, (float) (this.field3673 - arg3) * var8);
        this.field3634.glVertex2i(this.field3753, this.field3673);
        this.field3634.glTexCoord2f((float) (this.field3753 - arg2) * var7, (float) (this.field3714 - arg3) * var8);
        this.field3634.glVertex2i(this.field3753, this.field3714);
        this.field3634.glEnd();
        this.method1634(0, 5890, 768);
    }

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "(II)V", line = 2251)
    public final synchronized void method1785(int arg0, int arg1) {
        class279 var3 = new class279(arg1);
        var3.field640 = (long) arg0;
        this.field3656.method330(var3, -2130841184);
    }

    @OriginalMember(owner = "client!nf", name = "sb", descriptor = "()V", line = 2259)
    private final void method1786() {
        field3627[0] = this.field3733 * this.field3680;
        field3627[1] = this.field3747 * this.field3680;
        field3627[2] = this.field3699 * this.field3680;
        field3627[3] = 1.0F;
        this.field3634.glLightModelfv(2899, field3627, 0);
    }

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "()I", line = 2269)
    public final int method1787() {
        int var1 = this.field3764;
        this.field3764 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(II)V", line = 2278)
    public final void method1788(int arg0, int arg1) {
        if (this.field3728 == arg0 && this.field3761 == arg1) {
            return;
        }
        this.field3728 = arg0;
        this.field3761 = arg1;
        if (!this.field3708) {
            this.method1758();
            this.method1630();
        }
    }
}
