import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class254 extends class63 implements class221 {

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Lpb;")
    private class276 field3651 = new class276();

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Lmu;")
    private class315 field3652 = new class79();

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "[Lbl;")
    private class221[] field3656 = new class221[4];

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public int field3660 = 8;

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
    public int field3665 = 3;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    private int field3659 = -1;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "Z")
    private boolean field3667 = false;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "Lat;")
    private class412 field3661 = new class412();

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "Lat;")
    private class412 field3669 = new class412();

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "Lat;")
    private class412 field3670 = new class412();

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "Lat;")
    private class412 field3671 = new class412();

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "Lat;")
    private class412 field3672 = new class412();

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "Lat;")
    private class412 field3673 = new class412();

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "Lat;")
    private class412 field3674 = new class412();

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "I")
    public int field3677 = -1;

    @OriginalMember(owner = "client!nm", name = "Eb", descriptor = "[F")
    public float[] field3710 = new float[4];

    @OriginalMember(owner = "client!nm", name = "mb", descriptor = "F")
    public float field3692 = 3584.0F;

    @OriginalMember(owner = "client!nm", name = "pb", descriptor = "I")
    public int field3695 = 0;

    @OriginalMember(owner = "client!nm", name = "Fb", descriptor = "[F")
    private float[] field3711 = new float[4];

    @OriginalMember(owner = "client!nm", name = "mc", descriptor = "Z")
    private boolean field3744 = true;

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "I")
    public int field3680 = 0;

    @OriginalMember(owner = "client!nm", name = "fc", descriptor = "[F")
    private float[] field3737 = new float[16];

    @OriginalMember(owner = "client!nm", name = "Qb", descriptor = "F")
    public float field3722 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "Lb", descriptor = "F")
    public float field3717 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "pc", descriptor = "I")
    public int field3747 = -1;

    @OriginalMember(owner = "client!nm", name = "Sb", descriptor = "I")
    private int field3724 = 0;

    @OriginalMember(owner = "client!nm", name = "vc", descriptor = "I")
    public int field3753 = 3584;

    @OriginalMember(owner = "client!nm", name = "rb", descriptor = "F")
    private float field3697 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "Nb", descriptor = "I")
    private int field3719 = -1;

    @OriginalMember(owner = "client!nm", name = "qb", descriptor = "I")
    public int field3696 = -1;

    @OriginalMember(owner = "client!nm", name = "Ec", descriptor = "I")
    public int field3762 = 512;

    @OriginalMember(owner = "client!nm", name = "Gc", descriptor = "I")
    private int field3764 = 8448;

    @OriginalMember(owner = "client!nm", name = "Ib", descriptor = "F")
    public float field3714 = -1.0F;

    @OriginalMember(owner = "client!nm", name = "Mc", descriptor = "F")
    public float field3770 = -1.0F;

    @OriginalMember(owner = "client!nm", name = "cc", descriptor = "[F")
    private float[] field3734 = new float[4];

    @OriginalMember(owner = "client!nm", name = "gb", descriptor = "I")
    public int field3686 = 50;

    @OriginalMember(owner = "client!nm", name = "lc", descriptor = "F")
    private float field3743 = 0.0F;

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "F")
    public float field3675 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "tc", descriptor = "F")
    public float field3751 = 3584.0F;

    @OriginalMember(owner = "client!nm", name = "Pc", descriptor = "F")
    private float field3773 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "nb", descriptor = "I")
    private int field3693 = -1;

    @OriginalMember(owner = "client!nm", name = "Oc", descriptor = "I")
    private int field3772 = 8448;

    @OriginalMember(owner = "client!nm", name = "Dc", descriptor = "I")
    private int field3761 = 0;

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "I")
    private int field3679 = 0;

    @OriginalMember(owner = "client!nm", name = "Hc", descriptor = "I")
    public int field3765 = 0;

    @OriginalMember(owner = "client!nm", name = "Uc", descriptor = "I")
    public int field3778 = 512;

    @OriginalMember(owner = "client!nm", name = "Tc", descriptor = "I")
    private int field3777 = 0;

    @OriginalMember(owner = "client!nm", name = "Vc", descriptor = "I")
    private int field3779 = 0;

    @OriginalMember(owner = "client!nm", name = "Kc", descriptor = "[F")
    private float[] field3768 = new float[4];

    @OriginalMember(owner = "client!nm", name = "Wc", descriptor = "I")
    private int field3780 = 0;

    @OriginalMember(owner = "client!nm", name = "Ub", descriptor = "I")
    private int field3726 = 0;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3650;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Ljaggl/context;")
    private context field3649;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Ljaggl/opengl;")
    public opengl field3648;

    @OriginalMember(owner = "client!nm", name = "kc", descriptor = "Z")
    public boolean field3742;

    @OriginalMember(owner = "client!nm", name = "jc", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "Ljava/lang/String;")
    private String field3684;

    @OriginalMember(owner = "client!nm", name = "Rb", descriptor = "Ljava/lang/String;")
    private String field3723;

    @OriginalMember(owner = "client!nm", name = "wb", descriptor = "Z")
    private boolean field3702;

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "Z")
    public boolean field3682;

    @OriginalMember(owner = "client!nm", name = "tb", descriptor = "Z")
    public boolean field3699;

    @OriginalMember(owner = "client!nm", name = "fb", descriptor = "Z")
    public boolean field3685;

    @OriginalMember(owner = "client!nm", name = "Cc", descriptor = "Z")
    private boolean field3760;

    @OriginalMember(owner = "client!nm", name = "Sc", descriptor = "Z")
    public boolean field3776;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lpe;")
    public class114 field3644;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Ll;")
    private class118 field3646;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Ljl;")
    private class91 field3647;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "Ljd;")
    private class383 field3645;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[I")
    private static int[] field3643 = new int[1000];

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field3653 = Boolean.FALSE;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "[F")
    private static float[] field3654 = new float[4];

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "[F")
    private static float[] field3655 = new float[4];

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "F")
    private float field3678;

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "F")
    public float field3681;

    @OriginalMember(owner = "client!nm", name = "hb", descriptor = "F")
    private float field3687;

    @OriginalMember(owner = "client!nm", name = "kb", descriptor = "F")
    public float field3690;

    @OriginalMember(owner = "client!nm", name = "ob", descriptor = "F")
    public float field3694;

    @OriginalMember(owner = "client!nm", name = "Pb", descriptor = "F")
    public float field3721;

    @OriginalMember(owner = "client!nm", name = "bc", descriptor = "F")
    public float field3733;

    @OriginalMember(owner = "client!nm", name = "hc", descriptor = "F")
    public float field3739;

    @OriginalMember(owner = "client!nm", name = "nc", descriptor = "F")
    private float field3745;

    @OriginalMember(owner = "client!nm", name = "sc", descriptor = "F")
    public float field3750;

    @OriginalMember(owner = "client!nm", name = "Xc", descriptor = "F")
    public float field3781;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!nm", name = "ib", descriptor = "I")
    private int field3688;

    @OriginalMember(owner = "client!nm", name = "xb", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!nm", name = "yb", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!nm", name = "Ab", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!nm", name = "Jb", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!nm", name = "Yb", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!nm", name = "gc", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!nm", name = "ic", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!nm", name = "oc", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!nm", name = "uc", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!nm", name = "xc", descriptor = "I")
    private int field3755;

    @OriginalMember(owner = "client!nm", name = "Fc", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!nm", name = "Jc", descriptor = "I")
    private int field3767;

    @OriginalMember(owner = "client!nm", name = "Qc", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!nm", name = "Lc", descriptor = "J")
    private long field3769;

    @OriginalMember(owner = "client!nm", name = "ac", descriptor = "Lec;")
    private class101 field3732;

    @OriginalMember(owner = "client!nm", name = "Ob", descriptor = "Lgg;")
    public class202 field3720;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "Lbl;")
    private class221 field3668;

    @OriginalMember(owner = "client!nm", name = "yc", descriptor = "Lup;")
    private class259 field3756;

    @OriginalMember(owner = "client!nm", name = "Vb", descriptor = "Lop;")
    private class274 field3727;

    @OriginalMember(owner = "client!nm", name = "Bb", descriptor = "Lfu;")
    public class343 field3707;

    @OriginalMember(owner = "client!nm", name = "Db", descriptor = "Lfu;")
    public class343 field3709;

    @OriginalMember(owner = "client!nm", name = "Tb", descriptor = "Lfu;")
    public class343 field3725;

    @OriginalMember(owner = "client!nm", name = "Zb", descriptor = "Lfu;")
    public class343 field3731;

    @OriginalMember(owner = "client!nm", name = "dc", descriptor = "Lfu;")
    public class343 field3735;

    @OriginalMember(owner = "client!nm", name = "ec", descriptor = "Lfu;")
    public class343 field3736;

    @OriginalMember(owner = "client!nm", name = "qc", descriptor = "Lfu;")
    public class343 field3748;

    @OriginalMember(owner = "client!nm", name = "rc", descriptor = "Lfu;")
    public class343 field3749;

    @OriginalMember(owner = "client!nm", name = "Xb", descriptor = "Lgs;")
    private class407 field3729;

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "Lhi;")
    public class41 field3683;

    @OriginalMember(owner = "client!nm", name = "wc", descriptor = "Lhi;")
    public class41 field3754;

    @OriginalMember(owner = "client!nm", name = "Ac", descriptor = "Lhi;")
    public class41 field3758;

    @OriginalMember(owner = "client!nm", name = "ub", descriptor = "Lvp;")
    public class79 field3700;

    @OriginalMember(owner = "client!nm", name = "Ic", descriptor = "Lvp;")
    public class79 field3766;

    @OriginalMember(owner = "client!nm", name = "jb", descriptor = "Z")
    private boolean field3689;

    @OriginalMember(owner = "client!nm", name = "lb", descriptor = "Z")
    private boolean field3691;

    @OriginalMember(owner = "client!nm", name = "sb", descriptor = "Z")
    private boolean field3698;

    @OriginalMember(owner = "client!nm", name = "vb", descriptor = "Z")
    private boolean field3701;

    @OriginalMember(owner = "client!nm", name = "zb", descriptor = "Z")
    private boolean field3705;

    @OriginalMember(owner = "client!nm", name = "Cb", descriptor = "Z")
    public boolean field3708;

    @OriginalMember(owner = "client!nm", name = "Gb", descriptor = "Z")
    public boolean field3712;

    @OriginalMember(owner = "client!nm", name = "Hb", descriptor = "Z")
    private boolean field3713;

    @OriginalMember(owner = "client!nm", name = "Kb", descriptor = "Z")
    private boolean field3716;

    @OriginalMember(owner = "client!nm", name = "Mb", descriptor = "Z")
    public boolean field3718;

    @OriginalMember(owner = "client!nm", name = "Wb", descriptor = "Z")
    private boolean field3728;

    @OriginalMember(owner = "client!nm", name = "zc", descriptor = "Z")
    private boolean field3757;

    @OriginalMember(owner = "client!nm", name = "Bc", descriptor = "Z")
    public boolean field3759;

    @OriginalMember(owner = "client!nm", name = "Nc", descriptor = "Z")
    private boolean field3771;

    @OriginalMember(owner = "client!nm", name = "Rc", descriptor = "Z")
    public boolean field3775;

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "[Lap;")
    private class26[] field3676;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(II)V", line = 7)
    public final synchronized void method1610(int arg0, int arg1) {
        class145 var3 = new class145(arg1);
        var3.field436 = (long) arg0;
        this.field3671.method2453((byte) -99, var3);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[Lma;)V", line = 16)
    public final void method542(int arg0, class233[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class233 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field3654[0] = (float) var4.field3414;
            field3654[1] = (float) var4.field3416;
            field3654[2] = (float) var4.field3413;
            field3654[3] = 1.0F;
            this.field3648.glLightfv(var5, 4611, field3654, 0);
            int var6 = var4.field3409;
            float var7 = var4.field3418 / 255.0F;
            field3654[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field3654[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field3654[2] = (float) (var6 & 0xFF) * var7;
            this.field3648.glLightfv(var5, 4609, field3654, 0);
            this.field3648.glLightf(var5, 4617, 1.0F / (float) (var4.field3407 * var4.field3407));
            this.field3648.glEnable(var5);
        }
        while (var3 < this.field3780) {
            this.field3648.glDisable(var3 + 16386);
            var3++;
        }
        this.field3780 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "()Lmu;", line = 53)
    public final class315 method580() {
        return new class79();
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 59)
    public final void method513(boolean arg0) {
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "()V", line = 61)
    public final void method1379() {
    }

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "()I", line = 64)
    private final int method1611() {
        int var1 = 0;
        this.field3684 = this.field3648.glGetString(7936);
        this.field3723 = this.field3648.glGetString(7937);
        String var2 = this.field3684.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field3648.glGetString(7938);
        String[] var4 = class3.method17(var3.replace('.', ' '), 11205, ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class427.method2512(10, var4[0]);
                int var6 = class427.method2512(10, var4[1]);
                this.field3715 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field3715 < 12) {
            var1 |= 0x2;
        }
        if (!this.field3648.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field3648.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field3648.glGetIntegerv(34018, var8, 0);
        this.field3763 = var8[0];
        this.field3648.glGetIntegerv(34929, var8, 0);
        this.field3703 = var8[0];
        this.field3648.glGetIntegerv(34930, var8, 0);
        this.field3738 = var8[0];
        if (this.field3763 < 2 || this.field3703 < 2 || this.field3738 < 2) {
            var1 |= 0x10;
        }
        this.field3713 = class153.field2123 != null && class153.field2123.startsWith("mac");
        this.field3742 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field3702 = this.field3648.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field3771 = this.field3648.isExtensionAvailable("GL_ARB_multisample");
        this.field3712 = this.field3648.isExtensionAvailable("GL_ARB_vertex_program");
        this.field3648.isExtensionAvailable("GL_ARB_fragment_program");
        this.field3648.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field3759 = this.field3648.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field3682 = this.field3648.isExtensionAvailable("GL_EXT_texture3D");
        this.field3685 = this.field3648.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field3718 = this.field3648.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field3699 = this.field3648.isExtensionAvailable("GL_ARB_texture_float");
        this.field3708 = false;
        this.field3776 = this.field3648.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lbl;)V", line = 135)
    public final void method1612(class221 arg0) {
        if (this.field3659 >= 3) {
            throw new RuntimeException();
        }
        if (this.field3659 >= 0) {
            this.field3656[this.field3659].method1373();
        }
        this.field3668 = this.field3656[++this.field3659] = arg0;
        this.field3668.method1379();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[I[I)Lus;", line = 145)
    public final class401 method506(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class445.method2579(arg3, arg2, arg0, (byte) -74, arg1, this);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIII)V", line = 150)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        this.field3765 = arg0;
        this.field3680 = arg1;
        this.field3778 = arg2;
        this.field3762 = arg3;
        this.method1660();
        this.method1649();
        if (this.field3774 == 3) {
            this.method1614();
        } else if (this.field3774 == 2) {
            this.method1672();
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 168)
    public final void method532(int arg0) {
        this.method1651();
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)V", line = 172)
    public final void method1613(boolean arg0) {
        if (this.field3689 == arg0) {
            return;
        }
        if (arg0) {
            this.field3648.glEnable(2929);
        } else {
            this.field3648.glDisable(2929);
        }
        this.field3689 = arg0;
        this.field3767 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "()V", line = 186)
    private final void method1614() {
        float var1 = (float) (-this.field3765) * this.field3773 / (float) this.field3778;
        float var2 = (float) (-this.field3680) * this.field3773 / (float) this.field3762;
        float var3 = (float) (this.field3666 - this.field3765) * this.field3773 / (float) this.field3778;
        float var4 = (float) (this.field3664 - this.field3680) * this.field3773 / (float) this.field3762;
        this.field3648.glMatrixMode(5889);
        this.field3648.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field3648.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field3686 - this.field3733), (double) ((float) this.field3753 - this.field3733));
        }
        this.field3648.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "()V", line = 201)
    private final void method1615() {
        if (this.field3701 && this.field3775 | this.field3696 >= 0) {
            this.field3648.glEnable(2912);
        } else {
            this.field3648.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "()V", line = 210)
    public final void method546() {
        this.field3666 = this.field3650.getWidth();
        this.field3664 = this.field3650.getHeight();
        this.field3648.glViewport(this.field3679, this.field3761, this.field3666, this.field3664);
        this.method1682();
        this.method493();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFF)V", line = 217)
    public final void method1616(float arg0, float arg1, float arg2, float arg3) {
        field3655[0] = arg0;
        field3655[1] = arg1;
        field3655[2] = arg2;
        field3655[3] = arg3;
        this.field3648.glTexEnvfv(8960, 8705, field3655, 0);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(IIII)V", line = 226)
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
        this.field3647.method702(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "()V", line = 230)
    private final void method1617() {
        field3655[0] = this.field3714 * this.field3675;
        field3655[1] = this.field3717 * this.field3714;
        field3655[2] = this.field3722 * this.field3714;
        field3655[3] = 1.0F;
        this.field3648.glLightfv(16384, 4609, field3655, 0);
        field3655[0] = -this.field3770 * this.field3675;
        field3655[1] = -this.field3770 * this.field3717;
        field3655[2] = -this.field3770 * this.field3722;
        field3655[3] = 1.0F;
        this.field3648.glLightfv(16385, 4609, field3655, 0);
    }

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "()I", line = 243)
    public final int method562() {
        int var1 = this.field3746;
        this.field3746 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "()I", line = 248)
    public final int method534() {
        return this.field3686;
    }

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "()V", line = 255)
    public final void method591() {
        try {
            this.field3649.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "()I", line = 265)
    public final int method1382() {
        return this.field3664;
    }

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "()I", line = 268)
    public final int method510() {
        return this.field3663 + this.field3657 + this.field3662;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lec;", line = 272)
    public final class101 method1618(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class101) (this.field3702 && !arg2 || this.field3760 ? new class125(this, arg0, arg1, arg2) : new class11(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V", line = 280)
    public final void method1619(int arg0, int arg1, int arg2) {
        this.field3648.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "()Z", line = 287)
    public final boolean method566() {
        return this.field3646.method842(-79, 3);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lis;[Lff;Z)Ltr;", line = 290)
    public final class229 method539(class1 arg0, class368[] arg1, boolean arg2) {
        return new class242(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V", line = 300)
    public final void method577(int arg0, int arg1) {
        if (this.field3686 == arg0 && this.field3753 == arg1) {
            return;
        }
        this.field3686 = arg0;
        this.field3753 = arg1;
        this.method1660();
        this.method1638();
        if (this.field3774 == 3) {
            this.method1614();
        } else if (this.field3774 == 2) {
            this.method1672();
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(II)V", line = 318)
    public final void method1620(int arg0, int arg1) {
        this.field3679 = arg0;
        this.field3761 = arg1;
        this.field3648.glViewport(arg0, arg1, this.field3666, this.field3664);
        this.method1626();
    }

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "()F", line = 325)
    public final float method520() {
        return this.field3733;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII[BII)V", line = 332)
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field3756 == null || this.field3756.field566 < arg2 || this.field3756.field567 < arg3) {
            this.field3756 = class259.method1713(arg6, 6406, false, 6406, -34038, arg2, this, arg3);
            this.field3756.method312(false, false);
            var10 = this.field3756.field3861;
            var11 = this.field3756.field3860;
        } else {
            this.field3756.method310(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field3756.field3861 / (float) this.field3756.field567;
            var11 = (float) arg2 * this.field3756.field3860 / (float) this.field3756.field566;
        }
        this.method1673();
        this.method1653(this.field3756);
        this.method1657(arg8);
        this.field3648.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method1677(arg5);
        this.method1679(34165, 34165);
        this.method1621(0, 34166, 768);
        this.method1621(2, 5890, 770);
        this.method1662(0, 34166, 770);
        this.method1662(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field3648.glBegin(7);
        this.field3648.glTexCoord2f(0.0F, 0.0F);
        this.field3648.glVertex2f(var12, var13);
        this.field3648.glTexCoord2f(0.0F, var11);
        this.field3648.glVertex2f(var12, var15);
        this.field3648.glTexCoord2f(var10, var11);
        this.field3648.glVertex2f(var14, var15);
        this.field3648.glTexCoord2f(var10, 0.0F);
        this.field3648.glVertex2f(var14, var13);
        this.field3648.glEnd();
        this.method1621(0, 5890, 768);
        this.method1621(2, 34166, 770);
        this.method1662(0, 5890, 770);
        this.method1662(2, 34166, 770);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V", line = 381)
    public final void method1621(int arg0, int arg1, int arg2) {
        this.field3648.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field3648.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)V", line = 385)
    public final void method564(int arg0) {
        this.method1624();
    }

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "()V", line = 388)
    private final void method1622() {
        this.field3648.glLoadIdentity();
        this.field3648.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field3648.glMultMatrixf(this.field3766.method660(-95), 0);
        this.method1623();
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIIII)V", line = 396)
    public final void method579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1633();
        this.method1657(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3648.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3648.glBegin(1);
        this.field3648.glVertex2f(var6, var7);
        this.field3648.glVertex2f(var6, (float) arg2 + var7);
        this.field3648.glEnd();
    }

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "()V", line = 411)
    public final void method1623() {
        this.field3648.glLightfv(16384, 4611, this.field3710, 0);
        this.field3648.glLightfv(16385, 4611, this.field3734, 0);
    }

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "()V", line = 418)
    private final void method1624() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field3649.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class325.method2005(true, 1000L);
        }
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(I)I", line = 439)
    public final int method1625(int arg0) {
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

    @OriginalMember(owner = "client!nm", name = "T", descriptor = "()V", line = 475)
    private final void method1626() {
        if (this.field3724 <= this.field3779 && this.field3726 <= this.field3777) {
            this.field3648.glScissor(this.field3724 + this.field3679, this.field3761 + this.field3664 - this.field3777, this.field3779 - this.field3724, this.field3777 - this.field3726);
        } else {
            this.field3648.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 482)
    public final void method553(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(FFF)V", line = 487)
    private final void method1627(float arg0, float arg1, float arg2) {
        this.field3648.glMatrixMode(5890);
        if (this.field3698) {
            this.field3648.glLoadIdentity();
        }
        this.field3648.glTranslatef(arg0, arg1, arg2);
        this.field3648.glMatrixMode(5888);
        this.field3698 = true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V", line = 496)
    public final void method1628(int arg0, boolean arg1) {
        this.method1666(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!nm", name = "U", descriptor = "()V", line = 501)
    private final void method1629() {
        this.field3766 = new class79();
        this.field3700 = new class79();
        this.field3676 = new class26[this.field3763];
        this.field3754 = new class41(this, 3553, 6408, 1, 1);
        this.field3683 = new class41(this, 3553, 6408, 1, 1);
        this.field3758 = new class41(this, 3553, 6408, 1, 1);
        this.field3749 = new class343(this);
        this.field3731 = new class343(this);
        this.field3707 = new class343(this);
        this.field3725 = new class343(this);
        this.field3748 = new class343(this);
        this.field3736 = new class343(this);
        this.field3735 = new class343(this);
        this.field3709 = new class343(this);
        if (this.field3776) {
            this.field3720 = new class202(this);
        }
        this.field3651.method1791(this);
    }

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "()V", line = 528)
    public final void method533() {
        if (this.field3648 != null) {
            try {
                this.field3647.method708();
            } catch (Throwable var4) {
            }
            this.field3648 = null;
        }
        if (this.field3649 != null) {
            this.method1651();
            try {
                this.field3649.destroy();
            } catch (Throwable var3) {
            }
            this.field3649 = null;
        }
        if (this.field3667) {
            class120.method850(-1, true, true);
            this.field3667 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "()V", line = 561)
    public final void method511() {
        this.field3646.method841(false, 111, false, 0);
        this.field3775 = false;
        this.method1638();
        this.method1615();
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "(I)I", line = 567)
    public final int method1630(int arg0) {
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

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IFFFFF)V", line = 584)
    public final void method575(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field3693 != arg0;
        if (var7 || this.field3714 != arg1 || this.field3770 != arg2) {
            this.field3693 = arg0;
            this.field3714 = arg1;
            this.field3770 = arg2;
            if (var7) {
                this.field3675 = (float) (this.field3693 & 0xFF0000) / 1.671168E7F;
                this.field3717 = (float) (this.field3693 & 0xFFFF) / 65535.0F;
                this.field3722 = (float) (this.field3693 & 0xFF) / 255.0F;
                this.method1678();
            }
            this.method1617();
        }
        if (this.field3768[0] == arg3 && this.field3768[1] == arg4 && this.field3768[2] == arg5) {
            return;
        }
        this.field3768[0] = arg3;
        this.field3768[1] = arg4;
        this.field3768[2] = arg5;
        this.field3711[0] = -arg3;
        this.field3711[1] = -arg4;
        this.field3711[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field3710[0] = arg3 * var8;
        this.field3710[1] = arg4 * var8;
        this.field3710[2] = arg5 * var8;
        this.field3734[0] = -this.field3710[0];
        this.field3734[1] = -this.field3710[1];
        this.field3734[2] = -this.field3710[2];
        this.method1623();
        this.field3752 = (int) (arg3 * 256.0F / arg4);
        this.field3704 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[[I[[IIII)Lcl;", line = 624)
    public final class48 method590(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class22(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(IIII)V", line = 627)
    public final void method570(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3775) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field3719 = arg1;
        this.field3747 = arg2;
        this.field3695 = arg3;
        this.method1638();
        this.field3646.method843(true, 0, arg0);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)I", line = 640)
    public final int method583(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "()I", line = 645)
    public final int method535() {
        return this.field3753;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lns;Lim;Lmu;Lro;I)V", line = 648)
    public final void method552(class57 arg0, class268 arg1, class315 arg2, class117 arg3, int arg4) {
        arg0.method404(arg2, arg3, arg4);
        this.method502(arg1);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lmu;)V", line = 655)
    public final void method544(class315 arg0) {
        this.field3766 = (class79) arg0;
        this.field3700.method659((byte) -67, this.field3766);
        if (this.field3774 != 1) {
            this.method1622();
        }
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(IIII)V", line = 665)
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3724 < arg0) {
            this.field3724 = arg0;
        }
        if (this.field3779 > arg2) {
            this.field3779 = arg2;
        }
        if (this.field3726 < arg1) {
            this.field3726 = arg1;
        }
        if (this.field3777 > arg3) {
            this.field3777 = arg3;
        }
        this.field3648.glEnable(3089);
        this.method1649();
        this.method1626();
    }

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "()Z", line = 682)
    public final boolean method571() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lku;)V", line = 685)
    public final void method561(class381 arg0) {
    }

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "()Z", line = 689)
    public final boolean method515() {
        return false;
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "()Z", line = 692)
    public final boolean method496() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIIII)Ldp;", line = 695)
    public final class319 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class420(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "()Z", line = 702)
    public final boolean method495() {
        return !this.field3713;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(Z)V", line = 706)
    public final void method1631(boolean arg0) {
        if (this.field3728 != arg0) {
            this.field3728 = arg0;
            this.method1646();
            this.field3767 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "()F", line = 715)
    public final float method525() {
        return this.field3739;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 722)
    public final void method509(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILus;II)V", line = 726)
    public final void method499(int arg0, class401 arg1, int arg2, int arg3) {
        class445 var5 = (class445) arg1;
        class259 var6 = var5.field6264;
        this.method1673();
        this.method1653(var5.field6264);
        this.method1657(1);
        this.method1679(7681, 8448);
        this.method1621(0, 34167, 768);
        float var7 = var6.field3860 / (float) var6.field3863;
        float var8 = var6.field3861 / (float) var6.field3859;
        this.field3648.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field3648.glBegin(7);
        this.field3648.glTexCoord2f((float) (this.field3724 - arg2) * var7, (float) (this.field3726 - arg3) * var8);
        this.field3648.glVertex2i(this.field3724, this.field3726);
        this.field3648.glTexCoord2f((float) (this.field3724 - arg2) * var7, (float) (this.field3777 - arg3) * var8);
        this.field3648.glVertex2i(this.field3724, this.field3777);
        this.field3648.glTexCoord2f((float) (this.field3779 - arg2) * var7, (float) (this.field3777 - arg3) * var8);
        this.field3648.glVertex2i(this.field3779, this.field3777);
        this.field3648.glTexCoord2f((float) (this.field3779 - arg2) * var7, (float) (this.field3726 - arg3) * var8);
        this.field3648.glVertex2i(this.field3779, this.field3726);
        this.field3648.glEnd();
        this.method1621(0, 5890, 768);
    }

    @OriginalMember(owner = "client!nm", name = "V", descriptor = "()V", line = 754)
    public final void method1632() {
        if (this.field3767 == 8) {
            return;
        }
        this.method1639();
        this.method1652(true);
        this.method1613(true);
        this.method1656(true);
        this.method1657(1);
        this.method1636(1);
        this.field3767 = 8;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Lku;", line = 767)
    public final class381 method505(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "W", descriptor = "()V", line = 770)
    private final void method1633() {
        if (this.field3767 == 1) {
            return;
        }
        this.method1658();
        this.method1652(false);
        this.method1631(false);
        this.method1613(false);
        this.method1656(false);
        this.method1653((class26) null);
        this.method1680(-2);
        this.method1636(0);
        this.field3767 = 1;
    }

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "(I)V", line = 787)
    public final void method1634(int arg0) {
        if (this.field3706 != arg0) {
            this.field3648.glActiveTexture(arg0 + 33984);
            this.field3706 = arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "X", descriptor = "()V", line = 795)
    private final void method1635() {
        if (this.field3698) {
            this.field3648.glMatrixMode(5890);
            this.field3648.glLoadIdentity();
            this.field3648.glMatrixMode(5888);
            this.field3698 = false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "(I)V", line = 807)
    public final void method1636(int arg0) {
        if (arg0 == 0) {
            this.method1679(7681, 7681);
        } else if (arg0 == 1) {
            this.method1679(8448, 8448);
        } else if (arg0 == 2) {
            this.method1679(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!nm", name = "Y", descriptor = "()V", line = 820)
    public final void method1637() {
        if (this.field3767 == 4) {
            return;
        }
        this.method1658();
        this.method1652(false);
        this.method1631(false);
        this.method1613(false);
        this.method1656(false);
        this.method1680(-2);
        this.method1657(1);
        this.method1636(1);
        this.field3767 = 4;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "()Z", line = 836)
    public final boolean method491() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "Z", descriptor = "()V", line = 840)
    private final void method1638() {
        int var1;
        if (this.field3775) {
            this.field3648.glFogf(2915, 0.0F);
            this.field3648.glFogf(2916, 1.0F);
            var1 = this.field3719;
        } else {
            this.field3745 = (float) (this.field3753 - 256) - this.field3743;
            this.field3721 = this.field3745 - (float) this.field3696 * this.field3697;
            if (this.field3721 < (float) this.field3686) {
                this.field3721 = (float) this.field3686;
            }
            this.field3648.glFogf(2915, this.field3721);
            this.field3648.glFogf(2916, this.field3745);
            var1 = this.field3677;
        }
        field3655[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field3655[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field3655[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field3648.glFogfv(2918, field3655, 0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([Lns;Lmu;[Lro;I)V", line = 866)
    public final void method557(class57[] arg0, class315 arg1, class117[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method404(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "ab", descriptor = "()V", line = 878)
    public final void method1639() {
        if (this.field3774 != 2) {
            this.field3774 = 2;
            this.method1672();
            this.method1622();
            this.field3767 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 890)
    public final void method548(int arg0, int arg1) {
        if (this.field3677 == arg0 && this.field3696 == arg1) {
            return;
        }
        this.field3677 = arg0;
        this.field3696 = arg1;
        if (!this.field3775) {
            this.method1638();
            this.method1615();
        }
    }

    @OriginalMember(owner = "client!nm", name = "bb", descriptor = "()V", line = 904)
    private final void method1640() {
        if (this.field3733 == 0.0F) {
            this.field3737[10] = this.field3687;
            this.field3737[14] = this.field3678;
        } else {
            float var1 = this.field3739 / (this.field3739 + this.field3733);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field3678 * (1.0F - var1) / this.field3733;
            this.field3737[10] = this.field3687 + var3;
            this.field3737[14] = this.field3678 * var2;
        }
        this.field3751 = (this.field3737[14] - (float) this.field3753) / this.field3737[10];
        this.field3692 = (float) this.field3753 - this.field3733;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III[I)V", line = 934)
    public final void method518(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field3766.field1120 + (float) arg0 * this.field3766.field1110 + (float) arg1 * this.field3766.field1111 + this.field3766.field1113;
        if ((var5 < (float) this.field3686) || (var5 > (float) this.field3753)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field3766.field1115 + (float) arg0 * this.field3766.field1114 + (float) arg1 * this.field3766.field1109 + this.field3766.field1119) * (float) this.field3778 / var5);
        int var7 = (int) (((float) arg2 * this.field3766.field1116 + (float) arg0 * this.field3766.field1117 + (float) arg1 * this.field3766.field1118 + this.field3766.field1121) * (float) this.field3762 / var5);
        if ((float) var6 >= this.field3750 && (float) var6 <= this.field3690 && (float) var7 >= this.field3694 && (float) var7 <= this.field3681) {
            arg3[0] = (int) ((float) var6 - this.field3750);
            arg3[1] = (int) ((float) var7 - this.field3694);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "cb", descriptor = "()Lbl;", line = 958)
    public final class221 method1641() {
        return this.field3668;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 963)
    public final void method494(boolean arg0) {
        this.field3744 = arg0;
        this.method1663();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lff;Z)Ldp;", line = 969)
    public final class319 method547(class368 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field5561 * arg0.field5559];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5557 == null) {
            for (int var8 = 0; var8 < arg0.field5559; var8++) {
                for (int var9 = 0; var9 < arg0.field5561; var9++) {
                    int var10 = arg0.field5553[arg0.field5554[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field5559; var6++) {
                for (int var7 = 0; var7 < arg0.field5561; var7++) {
                    var3[var5++] = arg0.field5557[var4] << 24 | arg0.field5553[arg0.field5554[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class319 var11 = this.method536(var3, 0, arg0.field5561, arg0.field5561, arg0.field5559);
        var11.method797(arg0.field5560, arg0.field5555, arg0.field5556, arg0.field5558);
        return var11;
    }

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "()Z", line = 1024)
    public final boolean method523() {
        return false;
    }

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "()Z", line = 1030)
    public final boolean method576() {
        return false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lvn;IIII)Lns;", line = 1036)
    public final class57 method555(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class343(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "(I)I", line = 1039)
    public final int method1642(int arg0) {
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

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V", line = 1054)
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method1633();
        this.method1657(arg5);
        this.field3648.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3771) {
            this.field3648.glDisable(32925);
        }
        this.field3648.glBegin(7);
        this.field3648.glVertex2f(var7, var8);
        this.field3648.glVertex2f(var7, var10);
        this.field3648.glVertex2f(var9, var10);
        this.field3648.glVertex2f(var9, var8);
        this.field3648.glEnd();
        if (this.field3771) {
            this.field3648.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(Z)V", line = 1079)
    public final void method1643(boolean arg0) {
        if (this.field3691 != arg0) {
            this.field3691 = arg0;
            this.method1646();
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BIZ)Lec;", line = 1088)
    public final class101 method1644(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class101) (this.field3702 && !arg3 || this.field3760 ? new class125(this, arg0, arg1, arg2, arg3) : new class11(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!nm", name = "db", descriptor = "()V", line = 1096)
    private final void method1645() {
        if (this.field3774 != 3) {
            this.field3774 = 3;
            this.method1614();
            this.method1622();
            this.field3767 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!nm", name = "eb", descriptor = "()V", line = 1108)
    private final void method1646() {
        if (this.field3728 && !this.field3691) {
            this.field3648.glEnable(2896);
        } else {
            this.field3648.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(Z)V", line = 1117)
    public final void method527(boolean arg0) {
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "()V", line = 1122)
    public final void method490() {
        if (this.field3666 <= 0 && this.field3664 <= 0) {
            return;
        }
        int var1 = this.field3724;
        int var2 = this.field3779;
        int var3 = this.field3726;
        int var4 = this.field3777;
        this.method493();
        this.field3648.glReadBuffer(1028);
        this.field3648.glDrawBuffer(1029);
        this.method1682();
        this.method1652(false);
        this.method1631(false);
        this.method1613(false);
        this.method1656(false);
        this.method1653((class26) null);
        this.method1680(-2);
        this.method1636(0);
        this.method1657(0);
        this.field3648.glMatrixMode(5889);
        this.field3648.glLoadIdentity();
        this.field3648.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field3648.glMatrixMode(5888);
        this.field3648.glLoadIdentity();
        this.field3648.glRasterPos2i(0, 0);
        this.field3648.glCopyPixels(0, 0, this.field3666, this.field3664, 6144);
        this.field3648.glFlush();
        this.field3648.glReadBuffer(1029);
        this.field3648.glDrawBuffer(1029);
        this.method500(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!nm", name = "fb", descriptor = "()V", line = 1159)
    public final void method1647() {
        this.field3648.glPopMatrix();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lvp;)V", line = 1163)
    public final void method1648(class79 arg0) {
        this.field3648.glPushMatrix();
        this.field3648.glMultMatrixf(arg0.method660(-19), 0);
    }

    @OriginalMember(owner = "client!nm", name = "gb", descriptor = "()V", line = 1167)
    private final void method1649() {
        this.field3750 = (float) (this.field3724 - this.field3765);
        this.field3690 = (float) (this.field3779 - this.field3765);
        this.field3694 = (float) (this.field3726 - this.field3680);
        this.field3681 = (float) (this.field3777 - this.field3680);
    }

    @OriginalMember(owner = "client!nm", name = "hb", descriptor = "()V", line = 1173)
    private final void method1650() {
        this.method1680(-2);
        for (int var1 = this.field3763 - 1; var1 >= 0; var1--) {
            this.method1634(var1);
            this.method1653((class26) null);
            this.field3648.glTexEnvi(8960, 8704, 34160);
        }
        this.method1679(8448, 8448);
        this.method1621(2, 34168, 770);
        this.method1635();
        this.field3740 = 1;
        this.field3648.glEnable(3042);
        this.field3648.glBlendFunc(770, 771);
        this.field3755 = 1;
        this.field3648.glEnable(3008);
        this.field3648.glAlphaFunc(516, 0.0F);
        this.field3757 = true;
        this.field3648.glColorMask(true, true, true, true);
        this.field3716 = true;
        this.method1652(true);
        this.method1631(true);
        this.method1613(true);
        this.method1656(true);
        this.method1682();
        this.field3648.setSwapInterval(0);
        this.field3648.glShadeModel(7425);
        this.field3648.glClearDepth(1.0F);
        this.field3648.glDepthFunc(515);
        this.field3648.glPolygonMode(1028, 6914);
        this.field3648.glEnable(2884);
        this.field3648.glCullFace(1029);
        this.field3648.glMatrixMode(5888);
        this.field3648.glLoadIdentity();
        this.field3648.glColorMaterial(1028, 5634);
        this.field3648.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field3648.glLightfv(var4, 4608, var2, 0);
            this.field3648.glLightf(var4, 4615, 0.0F);
            this.field3648.glLightf(var4, 4616, 0.0F);
        }
        this.field3648.glEnable(16384);
        this.field3648.glEnable(16385);
        this.field3648.glFogf(2914, 0.95F);
        this.field3648.glFogi(2917, 9729);
        this.field3648.glHint(3156, 4353);
        this.field3693 = this.field3677 = -1;
        this.method493();
    }

    @OriginalMember(owner = "client!nm", name = "ib", descriptor = "()V", line = 1238)
    private final void method1651() {
        try {
            this.field3649.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIIIII)Z", line = 1246)
    public final boolean method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field3766.field1120 + (float) arg0 * this.field3766.field1110 + (float) arg1 * this.field3766.field1111 + this.field3766.field1113;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field3766.field1120 + (float) arg3 * this.field3766.field1110 + (float) arg4 * this.field3766.field1111 + this.field3766.field1113;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field3686) || !(var8 < (float) this.field3686)) || !(!(var7 > (float) this.field3753) || !(var8 > (float) this.field3753))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field3766.field1115 + (float) arg0 * this.field3766.field1114 + (float) arg1 * this.field3766.field1109 + this.field3766.field1119) * (float) this.field3778 / var7);
        int var10 = (int) (((float) arg5 * this.field3766.field1115 + (float) arg3 * this.field3766.field1114 + (float) arg4 * this.field3766.field1109 + this.field3766.field1119) * (float) this.field3778 / var8);
        if ((float) var9 < this.field3750 && (float) var10 < this.field3750 || (float) var9 > this.field3690 && (float) var10 > this.field3690) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field3766.field1116 + (float) arg0 * this.field3766.field1117 + (float) arg1 * this.field3766.field1118 + this.field3766.field1121) * (float) this.field3762 / var7);
            int var12 = (int) (((float) arg5 * this.field3766.field1116 + (float) arg3 * this.field3766.field1117 + (float) arg4 * this.field3766.field1118 + this.field3766.field1121) * (float) this.field3762 / var8);
            return (!((float) var11 < this.field3694) || !((float) var12 < this.field3694)) && (!((float) var11 > this.field3681) || !((float) var12 > this.field3681));
        }
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(Z)V", line = 1275)
    public final void method1652(boolean arg0) {
        if (this.field3701 != arg0) {
            this.field3701 = arg0;
            this.method1615();
            this.field3767 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "()Z", line = 1288)
    public final boolean method592() {
        if (!this.field3645.method2279(1)) {
            if (!this.field3647.method706(this.field3645)) {
                return false;
            }
            this.field3644.method817(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lap;)V", line = 1301)
    public final void method1653(class26 arg0) {
        class26 var2 = this.field3676[this.field3706];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field3648.glDisable(var2.field330);
            } else {
                if (var2 == null) {
                    this.field3648.glEnable(arg0.field330);
                } else if (arg0.field330 != var2.field330) {
                    this.field3648.glDisable(var2.field330);
                    this.field3648.glEnable(arg0.field330);
                }
                this.field3648.glBindTexture(arg0.field330, arg0.method233());
            }
            this.field3676[this.field3706] = arg0;
        }
        this.field3767 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(II)V", line = 1330)
    public final synchronized void method1654(int arg0, int arg1) {
        class145 var3 = new class145(arg1);
        var3.field436 = (long) arg0;
        this.field3669.method2453((byte) -121, var3);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgs;)V", line = 1337)
    public final void method1655(class407 arg0) {
        if (this.field3729 != arg0 && this.field3702) {
            this.field3648.glBindBufferARB(34963, arg0.method114());
            this.field3729 = arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "()Z", line = 1345)
    public final boolean method514() {
        return this.field3771;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lcp;IILng;)V", line = 1348)
    public class254(Canvas arg0, class481 arg1, int arg2, int arg3, class153 arg4) {
        super(arg2, arg1);
        this.field3650 = arg0;
        int var6 = 0;
        while (!this.field3650.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class325.method2005(true, 1000L);
        }
        this.field3650.setIgnoreRepaint(true);
        try {
            if (field3653 == null || !field3653) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field3653 = Boolean.TRUE;
                } else {
                    class397 var7 = arg4.method1024((byte) -21, this.getClass());
                    while (var7.field5822 == 0) {
                        class325.method2005(true, 100L);
                    }
                    if (var7.field5822 == 1) {
                        field3653 = Boolean.TRUE;
                    }
                }
            }
            if (field3653 == null || !field3653) {
                throw new RuntimeException("");
            }
            this.field3649 = new context();
            if (!this.field3649.choosePixelFormat(this.field3650, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field3649.createContext()) {
                this.method1624();
                this.field3648 = this.field3649.getGL();
                int var8 = this.method1611();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field3741 = this.field3742 ? 33639 : 5121;
                String var9 = this.field3684.toLowerCase();
                String var10 = this.field3723.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class3.method17(var10.replace('/', ' '), 11205, ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class43.method315(15154, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class43.method315(15154, var16.substring(0, 4))) {
                                        var11 = class427.method2512(10, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field3702 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field3682 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field3699 = false;
                    }
                    this.field3685 &= this.field3648.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field3760 = this.field3702;
                }
                if (var9.contains("intel")) {
                    this.field3776 = false;
                }
                if (this.field3702) {
                    try {
                        int[] var18 = new int[1];
                        this.field3648.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method1612(this);
                this.method546();
                this.method1629();
                new class148(this);
                this.field3644 = new class114(this, this.field871);
                class200.method1359(true, -51, true);
                this.field3667 = true;
                this.field3646 = new class118(this);
                this.field3647 = new class91(this);
                this.field3645 = new class383(this);
                this.method1650();
                this.field3648.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field3649.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class325.method2005(true, 100L);
                    }
                }
                this.field3648.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method533();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(IIIIII)V", line = 1534)
    public final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method1633();
        this.method1657(arg5);
        this.field3648.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field3771) {
            this.field3648.glDisable(32925);
        }
        this.field3648.glBegin(2);
        this.field3648.glVertex2f(var7, var8);
        this.field3648.glVertex2f(var7, var10);
        this.field3648.glVertex2f(var9, var10);
        this.field3648.glVertex2f(var9, var8);
        this.field3648.glEnd();
        if (this.field3771) {
            this.field3648.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "()V", line = 1560)
    public final void method492() {
        if (this.field3645.method2279(1)) {
            this.field3647.method703(this.field3645);
            this.field3644.method817(true);
        }
    }

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "()Z", line = 1569)
    public final boolean method504() {
        return this.field3645.method2279(1);
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(Z)V", line = 1572)
    public final void method1656(boolean arg0) {
        if (this.field3705 != arg0) {
            this.field3705 = arg0;
            this.method1663();
            this.field3767 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "(I)V", line = 1581)
    public final void method1657(int arg0) {
        if (this.field3740 == arg0) {
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
        if (this.field3716 != var3) {
            this.field3648.glColorMask(var3, var3, var3, true);
            this.field3716 = var3;
        }
        if (this.field3757 != var4) {
            if (var4) {
                this.field3648.glEnable(3008);
            } else {
                this.field3648.glDisable(3008);
            }
            this.field3757 = var4;
        }
        if (this.field3755 != var2) {
            if (var2 == 1) {
                this.field3648.glEnable(3042);
                this.field3648.glBlendEquation(32774);
                this.field3648.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field3648.glEnable(3042);
                this.field3648.glBlendEquation(32774);
                this.field3648.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field3648.glEnable(3042);
                this.field3648.glBlendEquation(32778);
                this.field3648.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field3648.glEnable(3042);
                this.field3648.glBlendEquation(32774);
                this.field3648.glBlendFunc(774, 1);
            } else {
                this.field3648.glDisable(3042);
            }
            this.field3755 = var2;
        }
        this.field3740 = arg0;
        this.field3767 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!nm", name = "jb", descriptor = "()V", line = 1697)
    private final void method1658() {
        if (this.field3774 == 1) {
            return;
        }
        this.field3648.glMatrixMode(5889);
        this.field3648.glLoadIdentity();
        if (this.field3666 > 0 && this.field3664 > 0) {
            this.field3648.glOrtho(0.0D, (double) this.field3666, (double) this.field3664, 0.0D, -1.0D, 1.0D);
        }
        this.field3648.glMatrixMode(5888);
        this.field3648.glLoadIdentity();
        this.field3774 = 1;
        this.field3767 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "()V", line = 1713)
    public final void method587() {
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Lbl;)V", line = 1715)
    public final void method1659(class221 arg0) {
        if (this.field3659 < 0 || this.field3656[this.field3659] != arg0) {
            throw new RuntimeException();
        }
        this.field3656[this.field3659--] = null;
        arg0.method1373();
        if (this.field3659 >= 0) {
            this.field3668 = this.field3656[this.field3659];
            this.field3668.method1379();
        }
    }

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "()I", line = 1729)
    public final int method559() {
        int var1 = this.field3688;
        this.field3688 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "()Z", line = 1734)
    public final boolean method556() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "kb", descriptor = "()V", line = 1738)
    private final void method1660() {
        float[] var1 = this.field3737;
        float var2 = (float) (-this.field3765 * this.field3686) / (float) this.field3778;
        float var3 = (float) ((this.field3666 - this.field3765) * this.field3686) / (float) this.field3778;
        float var4 = (float) (this.field3686 * this.field3680) / (float) this.field3762;
        float var5 = (float) ((this.field3680 - this.field3664) * this.field3686) / (float) this.field3762;
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
            float var6 = (float) this.field3686 * 2.0F;
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
            var1[10] = this.field3687 = (float) (-(this.field3753 + this.field3686)) / (float) (this.field3753 - this.field3686);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field3678 = -((float) this.field3753 * var6) / (float) (this.field3753 - this.field3686);
            var1[15] = 0.0F;
        }
        this.method1640();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lec;)V", line = 1791)
    public final void method1661(class101 arg0) {
        if (this.field3732 != arg0 && this.field3702) {
            this.field3648.glBindBufferARB(34962, arg0.method114());
            this.field3732 = arg0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(IIIII)V", line = 1801)
    public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1633();
        this.method1657(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field3648.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field3648.glBegin(1);
        this.field3648.glVertex2f(var6, var7);
        this.field3648.glVertex2f((float) arg2 + var6, var7);
        this.field3648.glEnd();
    }

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "()V", line = 1816)
    public final void method563() {
        this.method1656(true);
        this.field3648.glClear(256);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)V", line = 1820)
    public final void method1662(int arg0, int arg1, int arg2) {
        this.field3648.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field3648.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FF)V", line = 1826)
    public final void method501(float arg0, float arg1) {
        if (this.field3739 == arg0 && this.field3733 == arg1) {
            return;
        }
        this.field3739 = arg0;
        this.field3733 = arg1;
        this.method1640();
        if (this.field3774 == 3) {
            this.method1614();
        } else if (this.field3774 == 2) {
            this.method1672();
        }
    }

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "()Z", line = 1844)
    public final boolean method581() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "lb", descriptor = "()V", line = 1847)
    private final void method1663() {
        this.field3648.glDepthMask(this.field3705 && this.field3744);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lim;)V", line = 1850)
    public final void method502(class268 arg0) {
        this.field3651.method1794(this, arg0);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lgs;III)V", line = 1853)
    public final void method1664(class407 arg0, int arg1, int arg2, int arg3) {
        this.method1655(arg0);
        arg0.method1529(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nm", name = "mb", descriptor = "()V", line = 1859)
    public final void method1665() {
        if (this.field3767 == 16) {
            return;
        }
        this.method1645();
        this.method1652(true);
        this.method1613(true);
        this.method1656(true);
        this.method1657(1);
        this.method1636(1);
        this.field3767 = 16;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZZ)V", line = 1872)
    public final void method1666(int arg0, boolean arg1, boolean arg2) {
        if (this.field3730 != arg0) {
            if (arg0 < 0) {
                this.method1635();
                this.method1653((class26) null);
                if (!this.field3775) {
                    this.field3646.method841(arg2, 120, arg1, 0);
                }
            } else {
                class41 var4 = this.field3644.method816(arg0, -114);
                class85 var5 = this.field871.method1331(9386, arg0);
                if (var5.field1208 == 0 && var5.field1195 == 0) {
                    this.method1635();
                } else {
                    int var6 = var5.field1197 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method1627((float) (this.field3658 % var7 * var5.field1208) / (float) var7, (float) (this.field3658 % var7 * var5.field1195) / (float) var7, 0.0F);
                }
                if (this.field3775) {
                    this.field3646.method841(arg2, 116, arg1, 3);
                    this.method1653(var4);
                } else {
                    this.field3646.method841(arg2, 96, arg1, var5.field1218);
                    this.field3646.method843(false, 0, var5.field1216);
                    if (!this.field3646.method844(var4, (byte) -116)) {
                        this.method1653(var4);
                    }
                }
            }
            this.field3730 = arg0;
        }
        this.field3767 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "()Z", line = 1922)
    public final boolean method568() {
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "(I)V", line = 1926)
    public final synchronized void method1667(int arg0) {
        class145 var2 = new class145(arg0);
        this.field3673.method2453((byte) -83, var2);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 1934)
    public final synchronized void method554(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field3669.method2458(-57)) {
            class145 var4 = (class145) this.field3669.method2457((byte) 75);
            field3643[var2++] = (int) var4.field436;
            this.field3657 -= var4.field2054;
            if (var2 == 1000) {
                this.field3648.glDeleteBuffersARB(var2, field3643, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3648.glDeleteBuffersARB(var2, field3643, 0);
            var2 = 0;
        }
        while (!this.field3670.method2458(-82)) {
            class145 var5 = (class145) this.field3670.method2457((byte) 75);
            field3643[var2++] = (int) var5.field436;
            this.field3663 -= var5.field2054;
            if (var2 == 1000) {
                this.field3648.glDeleteTextures(var2, field3643, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3648.glDeleteTextures(var2, field3643, 0);
            var2 = 0;
        }
        while (!this.field3671.method2458(-47)) {
            class145 var6 = (class145) this.field3671.method2457((byte) 75);
            field3643[var2++] = var6.field2054;
            if (var2 == 1000) {
                this.field3648.glDeleteFramebuffersEXT(var2, field3643, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3648.glDeleteFramebuffersEXT(var2, field3643, 0);
            var2 = 0;
        }
        while (!this.field3672.method2458(94)) {
            class145 var7 = (class145) this.field3672.method2457((byte) 75);
            field3643[var2++] = (int) var7.field436;
            this.field3662 -= var7.field2054;
            if (var2 == 1000) {
                this.field3648.glDeleteRenderbuffersEXT(var2, field3643, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3648.glDeleteRenderbuffersEXT(var2, field3643, 0);
            var2 = 0;
        }
        while (!this.field3673.method2458(-104)) {
            class145 var8 = (class145) this.field3673.method2457((byte) 75);
            field3643[var2++] = (int) var8.field436;
            if (var2 == 1000) {
                this.field3648.glDeleteProgramsARB(var2, field3643, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field3648.glDeleteProgramsARB(var2, field3643, 0);
            boolean var9 = false;
        }
        while (!this.field3661.method2458(89)) {
            class145 var10 = (class145) this.field3661.method2457((byte) 75);
            this.field3648.glDeleteLists((int) var10.field436, var10.field2054);
        }
        while (!this.field3674.method2458(-116)) {
            class145 var11 = (class145) this.field3674.method2457((byte) 75);
            this.field3648.glDeleteObjectARB(var11.field2054);
        }
        while (!this.field3661.method2458(-87)) {
            class145 var12 = (class145) this.field3661.method2457((byte) 75);
            this.field3648.glDeleteLists((int) var12.field436, var12.field2054);
        }
        if (this.method510() > 100663296 && class435.method2539(-10659) > this.field3769 + 60000L) {
            System.gc();
            this.field3769 = class435.method2539(-10659);
        }
        this.field3658 = var3;
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)V", line = 2102)
    public final void method589(int arg0) {
        this.method1657(0);
        this.field3648.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field3648.glClear(16384);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Las;)V", line = 2107)
    public final void method498(class15 arg0) {
        this.field3727 = (class274) arg0;
    }

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "(I)V", line = 2111)
    public final synchronized void method1668(int arg0) {
        class145 var2 = new class145(arg0);
        this.field3671.method2453((byte) -114, var2);
    }

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "()V", line = 2119)
    public final void method573() {
        this.field3647.method705();
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(F)V", line = 2123)
    public final void method1669(float arg0) {
        if (this.field3773 != arg0) {
            this.field3773 = arg0;
            if (this.field3774 == 3) {
                this.method1614();
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "()Z", line = 2135)
    public final boolean method528() {
        return this.field3645.method2332();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIII)V", line = 2138)
    public final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "()V", line = 2142)
    public final void method493() {
        this.field3724 = 0;
        this.field3726 = 0;
        this.field3779 = this.field3666;
        this.field3777 = this.field3664;
        this.field3648.glDisable(3089);
        this.method1649();
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I[BIZ)Lgs;", line = 2152)
    public final class407 method1670(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class407) (this.field3702 && !arg3 || this.field3760 ? new class234(this, arg0, arg1, arg2, arg3) : new class289(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!nm", name = "nb", descriptor = "()Lcd;", line = 2160)
    public final class60 method1671() {
        return this.field3727 == null ? null : this.field3727.method399((byte) -95);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIIIII)Las;", line = 2165)
    public final class15 method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field3718 ? new class56(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(IIII)[I", line = 2171)
    public final int[] method560(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field3648.glReadPixels(arg0, this.field3664 - arg1 - var6, arg2, 1, 32993, this.field3741, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([I)V", line = 2184)
    public final void method540(int[] arg0) {
        arg0[0] = this.field3724;
        arg0[1] = this.field3726;
        arg0[2] = this.field3779;
        arg0[3] = this.field3777;
    }

    @OriginalMember(owner = "client!nm", name = "ob", descriptor = "()V", line = 2190)
    private final void method1672() {
        this.field3648.glMatrixMode(5889);
        this.field3648.glLoadMatrixf(this.field3737, 0);
        this.field3648.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nm", name = "pb", descriptor = "()V", line = 2197)
    public final void method1673() {
        if (this.field3767 == 2) {
            return;
        }
        this.method1658();
        this.method1652(false);
        this.method1631(false);
        this.method1613(false);
        this.method1656(false);
        this.method1680(-2);
        this.field3767 = 2;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "()V", line = 2212)
    public final void method1373() {
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljt;Ljt;Ljt;Ljt;)V", line = 2216)
    public final void method1674(class377 arg0, class377 arg1, class377 arg2, class377 arg3) {
        if (arg0 == null) {
            this.field3648.glDisableClientState(32884);
        } else {
            this.field3648.glEnableClientState(32884);
            arg0.method2314(3530);
        }
        if (arg1 == null) {
            this.field3648.glDisableClientState(32885);
        } else {
            this.field3648.glEnableClientState(32885);
            arg1.method2316(6185);
        }
        if (arg2 == null) {
            this.field3648.glDisableClientState(32886);
        } else {
            this.field3648.glEnableClientState(32886);
            arg2.method2313(-21825);
        }
        if (arg3 == null) {
            this.field3648.glDisableClientState(32888);
        } else {
            this.field3648.glEnableClientState(32888);
            arg3.method2315(-10573);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2251)
    public final void method537(Rectangle[] arg0, int arg1) {
        this.method591();
    }

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "(I)V", line = 2255)
    public final synchronized void method1675(int arg0) {
        class145 var2 = new class145(arg0);
        this.field3674.method2453((byte) -99, var2);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(F)V", line = 2261)
    public final void method585(float arg0) {
        if (this.field3781 != arg0) {
            this.field3781 = arg0;
            this.method1678();
        }
    }

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "(II)V", line = 2271)
    public final synchronized void method1676(int arg0, int arg1) {
        class145 var3 = new class145(arg1);
        var3.field436 = (long) arg0;
        this.field3670.method2453((byte) -108, var3);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(IIII)V", line = 2282)
    public final void method517(int arg0, int arg1, int arg2, int arg3) {
        this.field3775 = true;
        this.field3719 = arg1;
        this.field3747 = arg2;
        this.field3695 = arg3;
        this.method1638();
        this.method1615();
        this.field3646.method841(false, 90, false, 3);
        this.field3646.method843(true, 0, arg0);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(IIIIII)V", line = 2294)
    public final void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1633();
        this.method1657(arg5);
        this.field3648.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3648.glBegin(2);
        this.field3648.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3648.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3648.glEnd();
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I", line = 2304)
    public final int method578(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIILus;II)V", line = 2310)
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8) {
        class445 var10 = (class445) arg6;
        class259 var11 = var10.field6264;
        this.method1673();
        this.method1653(var10.field6264);
        this.method1657(arg5);
        this.method1679(7681, 8448);
        this.method1621(0, 34167, 768);
        float var12 = var11.field3860 / (float) var11.field3863;
        float var13 = var11.field3861 / (float) var11.field3859;
        this.field3648.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field3648.glBegin(1);
        this.field3648.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field3648.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field3648.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field3648.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field3648.glEnd();
        this.method1621(0, 5890, 768);
    }

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "(I)V", line = 2332)
    public final void method1677(int arg0) {
        field3655[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field3655[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field3655[2] = (float) (arg0 & 0xFF) / 255.0F;
        field3655[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field3648.glTexEnvfv(8960, 8705, field3655, 0);
    }

    @OriginalMember(owner = "client!nm", name = "qb", descriptor = "()V", line = 2339)
    private final void method1678() {
        field3655[0] = this.field3781 * this.field3675;
        field3655[1] = this.field3781 * this.field3717;
        field3655[2] = this.field3781 * this.field3722;
        field3655[3] = 1.0F;
        this.field3648.glLightModelfv(2899, field3655, 0);
    }

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "()Lmu;", line = 2346)
    public final class315 method565() {
        return this.field3652;
    }

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "(II)V", line = 2349)
    public final void method1679(int arg0, int arg1) {
        if (this.field3706 != 0) {
            this.field3648.glTexEnvi(8960, 34161, arg0);
            this.field3648.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field3772 != arg0) {
            this.field3648.glTexEnvi(8960, 34161, arg0);
            this.field3772 = arg0;
            var3 = true;
        }
        if (this.field3764 != arg1) {
            this.field3648.glTexEnvi(8960, 34162, arg1);
            this.field3764 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field3767 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 2383)
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([Lns;Lim;Lmu;[Lro;I)V", line = 2389)
    public final void method503(class57[] arg0, class268 arg1, class315 arg2, class117[] arg3, int arg4) {
        this.method557(arg0, arg2, arg3, arg4);
        this.method502(arg1);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V", line = 2395)
    public final void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3648.glLineWidth((float) arg5);
        this.method551(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field3648.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFF)V", line = 2402)
    public final void method586(float arg0, float arg1, float arg2) {
        class383.field5668 = arg0;
        class383.field5670 = arg1;
        class383.field5666 = arg2;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII)V", line = 2414)
    public final void method500(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field3666) {
            arg2 = this.field3666;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field3664) {
            arg3 = this.field3664;
        }
        this.field3724 = arg0;
        this.field3726 = arg1;
        this.field3779 = arg2;
        this.field3777 = arg3;
        this.field3648.glEnable(3089);
        this.method1649();
        this.method1626();
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIZ)Ldp;", line = 2437)
    public final class319 method574(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class420(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "(I)V", line = 2441)
    public final void method1680(int arg0) {
        this.method1628(arg0, true);
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(FF)V", line = 2444)
    public final void method1681(float arg0, float arg1) {
        this.field3697 = arg0;
        this.field3743 = arg1;
        if (!this.field3775) {
            this.method1638();
        }
    }

    @OriginalMember(owner = "client!nm", name = "rb", descriptor = "()V", line = 2451)
    public final void method1682() {
        if (this.field3774 != 0) {
            this.field3774 = 0;
            this.field3767 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "()I", line = 2459)
    public final int method524() {
        return 4;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Las;Las;FLas;)Las;", line = 2462)
    public final class15 method529(class15 arg0, class15 arg1, float arg2, class15 arg3) {
        if (arg0 != null && arg1 != null && this.field3718 && this.field3776) {
            class364 var5 = null;
            class274 var6 = (class274) arg0;
            class274 var7 = (class274) arg1;
            class60 var8 = var6.method399((byte) 86);
            class60 var9 = var7.method399((byte) -68);
            if (var8 != null && var9 != null) {
                int var10 = var8.field832 > var9.field832 ? var8.field832 : var9.field832;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class364) {
                    class364 var11 = (class364) arg3;
                    if (var11.method2236(0) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class364(this, var10);
                }
                var5.method2237(97, var8, var9, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }
}
