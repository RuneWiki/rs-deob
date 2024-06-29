import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class346 extends class322 implements class378 {

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "Lhf;")
    private class217 field4704 = new class217();

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "Lib;")
    private class247 field4708 = new class137();

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    private int field4713 = -1;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public int field4714 = 8;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "Z")
    private boolean field4715 = false;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "[Ld;")
    private class378[] field4718 = new class378[4];

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public int field4719 = 3;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Lmk;")
    private class154 field4717 = new class154();

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "Lmk;")
    private class154 field4722 = new class154();

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "Lmk;")
    private class154 field4723 = new class154();

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "Lmk;")
    private class154 field4724 = new class154();

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "Lmk;")
    private class154 field4725 = new class154();

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "Lmk;")
    private class154 field4726 = new class154();

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "Lmk;")
    private class154 field4727 = new class154();

    @OriginalMember(owner = "client!ql", name = "hb", descriptor = "[F")
    private float[] field4739 = new float[4];

    @OriginalMember(owner = "client!ql", name = "ub", descriptor = "I")
    public int field4752 = 3584;

    @OriginalMember(owner = "client!ql", name = "Ab", descriptor = "F")
    public float field4758 = 1.0F;

    @OriginalMember(owner = "client!ql", name = "tb", descriptor = "Z")
    private boolean field4751 = true;

    @OriginalMember(owner = "client!ql", name = "rb", descriptor = "I")
    public int field4749 = 50;

    @OriginalMember(owner = "client!ql", name = "Vb", descriptor = "F")
    public float field4779 = 3584.0F;

    @OriginalMember(owner = "client!ql", name = "Sb", descriptor = "I")
    private int field4776 = 0;

    @OriginalMember(owner = "client!ql", name = "hc", descriptor = "I")
    public int field4791 = 0;

    @OriginalMember(owner = "client!ql", name = "ic", descriptor = "I")
    public int field4792 = 0;

    @OriginalMember(owner = "client!ql", name = "lc", descriptor = "I")
    private int field4795 = 0;

    @OriginalMember(owner = "client!ql", name = "Gb", descriptor = "I")
    private int field4764 = 8448;

    @OriginalMember(owner = "client!ql", name = "jc", descriptor = "I")
    private int field4793 = 0;

    @OriginalMember(owner = "client!ql", name = "Zb", descriptor = "I")
    private int field4783 = -1;

    @OriginalMember(owner = "client!ql", name = "vc", descriptor = "I")
    public int field4805 = 512;

    @OriginalMember(owner = "client!ql", name = "qb", descriptor = "[F")
    private float[] field4748 = new float[4];

    @OriginalMember(owner = "client!ql", name = "sb", descriptor = "I")
    private int field4750 = -1;

    @OriginalMember(owner = "client!ql", name = "Kb", descriptor = "[F")
    public float[] field4768 = new float[4];

    @OriginalMember(owner = "client!ql", name = "Yb", descriptor = "I")
    private int field4782 = 0;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
    public int field4732 = -1;

    @OriginalMember(owner = "client!ql", name = "Jc", descriptor = "[F")
    private float[] field4819 = new float[16];

    @OriginalMember(owner = "client!ql", name = "lb", descriptor = "F")
    public float field4743 = -1.0F;

    @OriginalMember(owner = "client!ql", name = "wc", descriptor = "I")
    private int field4806 = 0;

    @OriginalMember(owner = "client!ql", name = "Qc", descriptor = "F")
    public float field4826 = 1.0F;

    @OriginalMember(owner = "client!ql", name = "Lc", descriptor = "I")
    private int field4821 = 8448;

    @OriginalMember(owner = "client!ql", name = "Nc", descriptor = "I")
    public int field4823 = -1;

    @OriginalMember(owner = "client!ql", name = "ob", descriptor = "I")
    public int field4746 = 512;

    @OriginalMember(owner = "client!ql", name = "dc", descriptor = "F")
    public float field4787 = 3584.0F;

    @OriginalMember(owner = "client!ql", name = "zc", descriptor = "F")
    private float field4809 = 0.0F;

    @OriginalMember(owner = "client!ql", name = "Cc", descriptor = "I")
    public int field4812 = -1;

    @OriginalMember(owner = "client!ql", name = "Ac", descriptor = "I")
    private int field4810 = 0;

    @OriginalMember(owner = "client!ql", name = "Gc", descriptor = "F")
    private float field4816 = 1.0F;

    @OriginalMember(owner = "client!ql", name = "Mc", descriptor = "[F")
    private float[] field4822 = new float[4];

    @OriginalMember(owner = "client!ql", name = "Rb", descriptor = "F")
    public float field4775 = -1.0F;

    @OriginalMember(owner = "client!ql", name = "Wc", descriptor = "I")
    private int field4832 = 0;

    @OriginalMember(owner = "client!ql", name = "bd", descriptor = "F")
    private float field4837 = 1.0F;

    @OriginalMember(owner = "client!ql", name = "ad", descriptor = "F")
    public float field4836 = 1.0F;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4696;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lal;")
    public class369 field4699;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Ljaggl/context;")
    private context field4700;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Ljaggl/opengl;")
    public opengl field4697;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "Z")
    public boolean field4736;

    @OriginalMember(owner = "client!ql", name = "Bc", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!ql", name = "fc", descriptor = "Ljava/lang/String;")
    private String field4789;

    @OriginalMember(owner = "client!ql", name = "jb", descriptor = "Ljava/lang/String;")
    private String field4741;

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "Z")
    private boolean field4733;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "Z")
    public boolean field4729;

    @OriginalMember(owner = "client!ql", name = "pb", descriptor = "Z")
    public boolean field4747;

    @OriginalMember(owner = "client!ql", name = "Vc", descriptor = "Z")
    private boolean field4831;

    @OriginalMember(owner = "client!ql", name = "wb", descriptor = "Z")
    public boolean field4754;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "Lis;")
    public class39 field4695;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "Lih;")
    private class329 field4698;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "Lfo;")
    private class226 field4703;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Lbh;")
    private class11 field4705;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "[I")
    private static int[] field4702 = new int[1000];

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4701 = Boolean.FALSE;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[F")
    private static float[] field4706 = new float[4];

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "[F")
    private static float[] field4707 = new float[4];

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "F")
    public float field4730;

    @OriginalMember(owner = "client!ql", name = "mb", descriptor = "F")
    public float field4744;

    @OriginalMember(owner = "client!ql", name = "vb", descriptor = "F")
    private float field4753;

    @OriginalMember(owner = "client!ql", name = "yb", descriptor = "F")
    public float field4756;

    @OriginalMember(owner = "client!ql", name = "Pb", descriptor = "F")
    public float field4773;

    @OriginalMember(owner = "client!ql", name = "Xb", descriptor = "F")
    public float field4781;

    @OriginalMember(owner = "client!ql", name = "gc", descriptor = "F")
    public float field4790;

    @OriginalMember(owner = "client!ql", name = "qc", descriptor = "F")
    private float field4800;

    @OriginalMember(owner = "client!ql", name = "Fc", descriptor = "F")
    public float field4815;

    @OriginalMember(owner = "client!ql", name = "Hc", descriptor = "F")
    private float field4817;

    @OriginalMember(owner = "client!ql", name = "Oc", descriptor = "F")
    public float field4824;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public int field4711;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public int field4720;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "I")
    private int field4734;

    @OriginalMember(owner = "client!ql", name = "kb", descriptor = "I")
    private int field4742;

    @OriginalMember(owner = "client!ql", name = "xb", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!ql", name = "Eb", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!ql", name = "Fb", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!ql", name = "Ob", descriptor = "I")
    private int field4772;

    @OriginalMember(owner = "client!ql", name = "mc", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!ql", name = "uc", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!ql", name = "Kc", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!ql", name = "Pc", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!ql", name = "Rc", descriptor = "I")
    private int field4827;

    @OriginalMember(owner = "client!ql", name = "Xc", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!ql", name = "cd", descriptor = "I")
    private int field4838;

    @OriginalMember(owner = "client!ql", name = "dd", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "J")
    private long field4728;

    @OriginalMember(owner = "client!ql", name = "gb", descriptor = "Lbb;")
    private class135 field4738;

    @OriginalMember(owner = "client!ql", name = "oc", descriptor = "Lbb;")
    private class135 field4798;

    @OriginalMember(owner = "client!ql", name = "Zc", descriptor = "Lbb;")
    private class135 field4835;

    @OriginalMember(owner = "client!ql", name = "Cb", descriptor = "Lbi;")
    public class137 field4760;

    @OriginalMember(owner = "client!ql", name = "Qb", descriptor = "Lbi;")
    public class137 field4774;

    @OriginalMember(owner = "client!ql", name = "sc", descriptor = "Lgn;")
    private class170 field4802;

    @OriginalMember(owner = "client!ql", name = "Nb", descriptor = "Ldh;")
    private class190 field4771;

    @OriginalMember(owner = "client!ql", name = "Bb", descriptor = "Ljo;")
    public class218 field4759;

    @OriginalMember(owner = "client!ql", name = "nc", descriptor = "Ljo;")
    public class218 field4797;

    @OriginalMember(owner = "client!ql", name = "tc", descriptor = "Ljo;")
    public class218 field4803;

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "Lcl;")
    private class313 field4737;

    @OriginalMember(owner = "client!ql", name = "Db", descriptor = "Lcl;")
    public class313 field4761;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "Los;")
    public class377 field4731;

    @OriginalMember(owner = "client!ql", name = "Lb", descriptor = "Los;")
    public class377 field4769;

    @OriginalMember(owner = "client!ql", name = "Mb", descriptor = "Los;")
    public class377 field4770;

    @OriginalMember(owner = "client!ql", name = "bc", descriptor = "Los;")
    public class377 field4785;

    @OriginalMember(owner = "client!ql", name = "kc", descriptor = "Los;")
    public class377 field4794;

    @OriginalMember(owner = "client!ql", name = "Ec", descriptor = "Los;")
    public class377 field4814;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "Ld;")
    private class378 field4712;

    @OriginalMember(owner = "client!ql", name = "cc", descriptor = "Lvr;")
    public class415 field4786;

    @OriginalMember(owner = "client!ql", name = "Ib", descriptor = "Lip;")
    private class49 field4766;

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "Z")
    public boolean field4735;

    @OriginalMember(owner = "client!ql", name = "ib", descriptor = "Z")
    public boolean field4740;

    @OriginalMember(owner = "client!ql", name = "nb", descriptor = "Z")
    private boolean field4745;

    @OriginalMember(owner = "client!ql", name = "Hb", descriptor = "Z")
    private boolean field4765;

    @OriginalMember(owner = "client!ql", name = "Jb", descriptor = "Z")
    public boolean field4767;

    @OriginalMember(owner = "client!ql", name = "Ub", descriptor = "Z")
    private boolean field4778;

    @OriginalMember(owner = "client!ql", name = "ac", descriptor = "Z")
    private boolean field4784;

    @OriginalMember(owner = "client!ql", name = "ec", descriptor = "Z")
    private boolean field4788;

    @OriginalMember(owner = "client!ql", name = "pc", descriptor = "Z")
    private boolean field4799;

    @OriginalMember(owner = "client!ql", name = "rc", descriptor = "Z")
    private boolean field4801;

    @OriginalMember(owner = "client!ql", name = "xc", descriptor = "Z")
    public boolean field4807;

    @OriginalMember(owner = "client!ql", name = "yc", descriptor = "Z")
    public boolean field4808;

    @OriginalMember(owner = "client!ql", name = "Dc", descriptor = "Z")
    private boolean field4813;

    @OriginalMember(owner = "client!ql", name = "Ic", descriptor = "Z")
    private boolean field4818;

    @OriginalMember(owner = "client!ql", name = "Sc", descriptor = "Z")
    private boolean field4828;

    @OriginalMember(owner = "client!ql", name = "Tc", descriptor = "Z")
    private boolean field4829;

    @OriginalMember(owner = "client!ql", name = "Uc", descriptor = "Z")
    public boolean field4830;

    @OriginalMember(owner = "client!ql", name = "Yc", descriptor = "Z")
    private boolean field4834;

    @OriginalMember(owner = "client!ql", name = "Wb", descriptor = "[Lbb;")
    private class135[] field4780;

    @OriginalMember(owner = "client!ql", name = "zb", descriptor = "[Lna;")
    private class50[] field4757;

    @OriginalMember(owner = "client!ql", name = "Tb", descriptor = "[Z")
    private boolean[] field4777;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Lue;")
    public final class130 method1595(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(FF)V")
    public final void method2027(float arg0, float arg1) {
        this.field4837 = arg0;
        this.field4809 = arg1;
        if (!this.field4735) {
            this.method2057();
        }
    }

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "()V")
    private final void method2028() {
        if (this.field4782 <= this.field4810 && this.field4793 <= this.field4806) {
            this.field4697.glScissor(this.field4832 + this.field4782, this.field4795 + this.field4709 - this.field4806, this.field4810 - this.field4782, this.field4806 - this.field4793);
        } else {
            this.field4697.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lpe;IIII)Ljn;")
    public final class396 method1651(class390 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class377(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIIII)Lmc;")
    public final class316 method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4767 ? new class426(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "()V")
    private final void method2029() {
        if (this.field4828) {
            this.field4697.glMatrixMode(5890);
            this.field4697.glLoadIdentity();
            this.field4697.glMatrixMode(5888);
            this.field4828 = false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "()Z")
    public final boolean method1643() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "()V")
    private final void method2030() {
        if (this.field4829 && this.field4735 | this.field4812 >= 0) {
            this.field4697.glEnable(2912);
        } else {
            this.field4697.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "()Z")
    public final boolean method1653() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "()V")
    private final void method2031() {
        if (this.field4820 == 1) {
            return;
        }
        this.method2066();
        this.method2075(false);
        this.method2094(false);
        this.method2093(false);
        this.method2080(false);
        this.method2032((class50) null);
        this.method2091(-2);
        this.method2054(0);
        this.field4820 = 1;
    }

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "()I")
    public final int method1590() {
        return 4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lna;)V")
    public final void method2032(class50 arg0) {
        class50 var2 = this.field4757[this.field4825];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4697.glDisable(var2.field484);
            } else {
                if (var2 == null) {
                    this.field4697.glEnable(arg0.field484);
                } else if (arg0.field484 != var2.field484) {
                    this.field4697.glDisable(var2.field484);
                    this.field4697.glEnable(arg0.field484);
                }
                this.field4697.glBindTexture(arg0.field484, arg0.method230());
            }
            this.field4757[this.field4825] = arg0;
        }
        this.field4820 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    public final synchronized void method1579(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4722.method823(126)) {
            class310 var4 = (class310) this.field4722.method815(12256);
            field4702[var2++] = (int) var4.field4510;
            this.field4721 -= var4.field4186;
            if (var2 == 1000) {
                this.field4697.glDeleteBuffersARB(var2, field4702, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4697.glDeleteBuffersARB(var2, field4702, 0);
            var2 = 0;
        }
        while (!this.field4723.method823(127)) {
            class310 var5 = (class310) this.field4723.method815(12256);
            field4702[var2++] = (int) var5.field4510;
            this.field4710 -= var5.field4186;
            if (var2 == 1000) {
                this.field4697.glDeleteTextures(var2, field4702, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4697.glDeleteTextures(var2, field4702, 0);
            var2 = 0;
        }
        while (!this.field4724.method823(127)) {
            class310 var6 = (class310) this.field4724.method815(12256);
            field4702[var2++] = var6.field4186;
            if (var2 == 1000) {
                this.field4697.glDeleteFramebuffersEXT(var2, field4702, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4697.glDeleteFramebuffersEXT(var2, field4702, 0);
            var2 = 0;
        }
        while (!this.field4725.method823(126)) {
            class310 var7 = (class310) this.field4725.method815(12256);
            field4702[var2++] = (int) var7.field4510;
            this.field4716 -= var7.field4186;
            if (var2 == 1000) {
                this.field4697.glDeleteRenderbuffersEXT(var2, field4702, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4697.glDeleteRenderbuffersEXT(var2, field4702, 0);
            var2 = 0;
        }
        while (!this.field4726.method823(126)) {
            class310 var8 = (class310) this.field4726.method815(12256);
            field4702[var2++] = (int) var8.field4510;
            if (var2 == 1000) {
                this.field4697.glDeleteProgramsARB(var2, field4702, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4697.glDeleteProgramsARB(var2, field4702, 0);
            boolean var9 = false;
        }
        while (!this.field4717.method823(126)) {
            class310 var10 = (class310) this.field4717.method815(12256);
            this.field4697.glDeleteLists((int) var10.field4510, var10.field4186);
        }
        while (!this.field4727.method823(127)) {
            class310 var11 = (class310) this.field4727.method815(12256);
            this.field4697.glDeleteObjectARB(var11.field4186);
        }
        while (!this.field4717.method823(127)) {
            class310 var12 = (class310) this.field4717.method815(12256);
            this.field4697.glDeleteLists((int) var12.field4510, var12.field4186);
        }
        if (this.method1567() > 100663296 && class442.method2730(25207) > this.field4728 + 60000L) {
            System.gc();
            this.field4728 = class442.method2730(25207);
        }
        this.field4720 = var3;
    }

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "()Z")
    public final boolean method1563() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "()I")
    public final int method1567() {
        return this.field4721 + this.field4710 + this.field4716;
    }

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "()V")
    public final void method1623() {
    }

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "()V")
    private final void method2033() {
        float var1 = (float) (-this.field4791) * this.field4816 / (float) this.field4805;
        float var2 = (float) (-this.field4792) * this.field4816 / (float) this.field4746;
        float var3 = (float) (this.field4711 - this.field4791) * this.field4816 / (float) this.field4805;
        float var4 = (float) (this.field4709 - this.field4792) * this.field4816 / (float) this.field4746;
        this.field4697.glMatrixMode(5889);
        this.field4697.glLoadIdentity();
        this.field4697.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4749 - this.field4790), (double) ((float) this.field4752 - this.field4790));
        this.field4697.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[BIZ)Lip;")
    public final class49 method2034(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class49) (this.field4733 && !arg3 || this.field4831 ? new class261(this, arg0, arg1, arg2, arg3) : new class403(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "()V")
    public final void method2035() {
        if (this.field4820 == 8) {
            return;
        }
        this.method2068();
        this.method2075(true);
        this.method2093(true);
        this.method2080(true);
        this.method2044(1);
        this.method2054(1);
        this.field4820 = 8;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lip;")
    public final class49 method2036(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class49) (this.field4733 && !arg2 || this.field4831 ? new class261(this, arg0, arg1, arg2) : new class403(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lmc;Lmc;FLmc;)Lmc;")
    public final class316 method1602(class316 arg0, class316 arg1, float arg2, class316 arg3) {
        if (arg0 != null && arg1 != null && this.field4767 && this.field4754) {
            class287 var5 = null;
            class190 var6 = (class190) arg0;
            class190 var7 = (class190) arg1;
            class433 var8 = var6.method1021(-95);
            class433 var9 = var7.method1021(-68);
            if (var8 != null && var9 != null) {
                int var10 = var8.field6343 > var9.field6343 ? var8.field6343 : var9.field6343;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class287) {
                    class287 var11 = (class287) arg3;
                    if (var11.method1704((byte) 18) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class287(this, var10);
                }
                var5.method1705(var8, (byte) 111, var9, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILgo;II)V")
    public final void method1615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class175 arg6, int arg7, int arg8) {
        class113 var10 = (class113) arg6;
        class170 var11 = var10.field1409;
        this.method2106();
        this.method2032(var10.field1409);
        this.method2044(arg5);
        this.method2053(7681, 8448);
        this.method2062(0, 34167, 768);
        float var12 = var11.field2144 / (float) var11.field2143;
        float var13 = var11.field2141 / (float) var11.field2142;
        this.field4697.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4697.glBegin(1);
        this.field4697.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4697.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4697.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4697.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4697.glEnd();
        this.method2062(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lbb;)V")
    public final void method2037(class135 arg0) {
        class49 var2 = arg0.field1726;
        this.method2046(var2);
        var2.method228(arg0);
        this.field4798 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "()V")
    public final void method1599() {
        if (this.field4697 != null) {
            try {
                this.field4703.method1222();
            } catch (Throwable var4) {
            }
            this.field4697 = null;
        }
        if (this.field4700 != null) {
            this.method2103();
            try {
                this.field4700.destroy();
            } catch (Throwable var3) {
            }
            this.field4700 = null;
        }
        if (this.field4715) {
            class418.method2597(true, (byte) -95, true);
            this.field4715 = false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "()V")
    public final void method1555() {
        int var1 = this.field4782;
        int var2 = this.field4810;
        int var3 = this.field4793;
        int var4 = this.field4806;
        this.method1584();
        this.field4697.glReadBuffer(1028);
        this.field4697.glDrawBuffer(1029);
        this.method2047();
        this.method2075(false);
        this.method2094(false);
        this.method2093(false);
        this.method2080(false);
        this.method2032((class50) null);
        this.method2091(-2);
        this.method2054(0);
        this.method2044(0);
        this.field4697.glMatrixMode(5889);
        this.field4697.glLoadIdentity();
        this.field4697.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4697.glMatrixMode(5888);
        this.field4697.glLoadIdentity();
        this.field4697.glRasterPos2i(0, 0);
        this.field4697.glCopyPixels(0, 0, this.field4711, this.field4709, 6144);
        this.field4697.glFlush();
        this.field4697.glReadBuffer(1029);
        this.field4697.glDrawBuffer(1029);
        this.method1648(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
    public final void method2038(int arg0, boolean arg1) {
        this.method2085(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "()V")
    public final void method2039() {
        if (this.field4820 == 16) {
            return;
        }
        this.method2107();
        this.method2075(true);
        this.method2093(true);
        this.method2080(true);
        this.method2044(1);
        this.method2054(1);
        this.field4820 = 16;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "()I")
    public final int method1596() {
        int var1 = this.field4838;
        this.field4838 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I[I)Lgo;")
    public final class175 method1593(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class113.method603((byte) -1, arg0, arg3, arg1, this, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(III)V")
    public final void method2040(int arg0, int arg1, int arg2) {
        this.field4697.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4697.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lcl;III)V")
    public final void method2041(class313 arg0, int arg1, int arg2, int arg3) {
        this.method2055(arg0);
        arg0.method790(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIII)V")
    public final void method1616(int arg0, int arg1, int arg2, int arg3) {
        this.field4703.method1225(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "()V")
    private final void method2042() {
        this.field4730 = (float) (this.field4782 - this.field4791);
        this.field4815 = (float) (this.field4810 - this.field4791);
        this.field4744 = (float) (this.field4793 - this.field4792);
        this.field4756 = (float) (this.field4806 - this.field4792);
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(II)I")
    public final int method1620(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[[I[[IIII)Lbl;")
    public final class54 method1552(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class103(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "()F")
    public final float method1564() {
        return this.field4781;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFFFF)V")
    private final void method2043(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field4819;
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
        var8[10] = this.field4753 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field4800 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method2072();
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V")
    public final void method2044(int arg0) {
        if (this.field4772 == arg0) {
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
        if (this.field4818 != var3) {
            this.field4697.glColorMask(var3, var3, var3, true);
            this.field4818 = var3;
        }
        if (this.field4788 != var4) {
            if (var4) {
                this.field4697.glEnable(3008);
            } else {
                this.field4697.glDisable(3008);
            }
            this.field4788 = var4;
        }
        if (this.field4762 != var2) {
            if (var2 == 1) {
                this.field4697.glEnable(3042);
                this.field4697.glBlendEquation(32774);
                this.field4697.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4697.glEnable(3042);
                this.field4697.glBlendEquation(32774);
                this.field4697.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4697.glEnable(3042);
                this.field4697.glBlendEquation(32778);
                this.field4697.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4697.glEnable(3042);
                this.field4697.glBlendEquation(32774);
                this.field4697.glBlendFunc(774, 1);
            } else {
                this.field4697.glDisable(3042);
            }
            this.field4762 = var2;
        }
        this.field4772 = arg0;
        this.field4820 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "()Z")
    public final boolean method1562() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIII)V")
    public final void method1604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(III)V")
    public final void method2045(int arg0, int arg1, int arg2) {
        this.field4697.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lmc;)V")
    public final void method1561(class316 arg0) {
        this.field4771 = (class190) arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lip;)V")
    public final void method2046(class49 arg0) {
        if (this.field4766 != arg0 && this.field4733) {
            this.field4697.glBindBufferARB(34962, arg0.method225());
            this.field4766 = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "()V")
    public final void method2047() {
        if (this.field4742 != 0) {
            this.field4742 = 0;
            this.field4820 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "()V")
    private final void method2048() {
        this.field4697.glMatrixMode(5889);
        this.field4697.glLoadMatrixf(this.field4819, 0);
        this.field4697.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "()Lg;")
    public final class433 method2049() {
        return this.field4771 == null ? null : this.field4771.method1021(-41);
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)V")
    public final synchronized void method2050(int arg0) {
        class310 var2 = new class310(arg0);
        this.field4724.method825(-79, var2);
    }

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "()V")
    private final void method2051() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4700.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class370.method2235(1000L, 10);
        }
    }

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)V")
    public final void method2052(int arg0) {
        if (this.field4825 != arg0) {
            this.field4697.glActiveTexture(arg0 + 33984);
            this.field4825 = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(II)V")
    public final void method2053(int arg0, int arg1) {
        if (this.field4825 != 0) {
            this.field4697.glTexEnvi(8960, 34161, arg0);
            this.field4697.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4821 != arg0) {
            this.field4697.glTexEnvi(8960, 34161, arg0);
            this.field4821 = arg0;
            var3 = true;
        }
        if (this.field4764 != arg1) {
            this.field4697.glTexEnvi(8960, 34162, arg1);
            this.field4764 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4820 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "()Z")
    public final boolean method1624() {
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIIII)Llg;")
    public final class20 method1637(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class202(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
    public final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4697.glLineWidth((float) arg5);
        this.method1592(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4697.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public final void method1571(boolean arg0) {
        this.field4751 = arg0;
        this.method2087();
    }

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "(I)V")
    public final void method2054(int arg0) {
        if (arg0 == 0) {
            this.method2053(7681, 7681);
        } else if (arg0 == 1) {
            this.method2053(8448, 8448);
        } else if (arg0 == 2) {
            this.method2053(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lcl;)V")
    public final void method2055(class313 arg0) {
        if (this.field4737 != arg0 && this.field4733) {
            this.field4697.glBindBufferARB(34963, arg0.method225());
            this.field4737 = arg0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "()V")
    public final void method1609() {
        if (this.field4705.method436((byte) 97)) {
            this.field4703.method1228(this.field4705);
            this.field4695.method186(-91);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)V")
    public final void method1568(float arg0) {
        if (this.field4824 != arg0) {
            this.field4824 = arg0;
            this.method2098();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lib;)V")
    public final void method1611(class247 arg0) {
        this.field4774 = (class137) arg0;
        this.field4760.method748(this.field4774, 123);
        if (this.field4742 != 1) {
            this.method2078();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFFF)V")
    public final void method2056(float arg0, float arg1, float arg2, float arg3) {
        field4706[0] = arg0;
        field4706[1] = arg1;
        field4706[2] = arg2;
        field4706[3] = arg3;
        this.field4697.glTexEnvfv(8960, 8705, field4706, 0);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(IIII)V")
    public final void method1580(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4782 < arg0) {
            this.field4782 = arg0;
        }
        if (this.field4810 > arg2) {
            this.field4810 = arg2;
        }
        if (this.field4793 < arg1) {
            this.field4793 = arg1;
        }
        if (this.field4806 > arg3) {
            this.field4806 = arg3;
        }
        this.field4697.glEnable(3089);
        this.method2042();
        this.method2028();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lue;)V")
    public final void method1582(class130 arg0) {
    }

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "()V")
    private final void method2057() {
        int var1;
        if (this.field4735) {
            this.field4697.glFogf(2915, 0.0F);
            this.field4697.glFogf(2916, 1.0F);
            var1 = this.field4750;
        } else {
            this.field4817 = (float) (this.field4752 - 256) - this.field4809;
            this.field4773 = this.field4817 - (float) this.field4812 * this.field4837;
            if (this.field4773 < (float) this.field4749) {
                this.field4773 = (float) this.field4749;
            }
            this.field4697.glFogf(2915, this.field4773);
            this.field4697.glFogf(2916, this.field4817);
            var1 = this.field4823;
        }
        field4706[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4706[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4706[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4697.glFogfv(2918, field4706, 0);
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(II)V")
    public final synchronized void method2058(int arg0, int arg1) {
        class310 var3 = new class310(arg1);
        var3.field4510 = (long) arg0;
        this.field4724.method825(53, var3);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1649(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "()V")
    public final void method2059() {
        if (this.field4820 == 4) {
            return;
        }
        this.method2066();
        this.method2075(false);
        this.method2094(false);
        this.method2093(false);
        this.method2080(false);
        this.method2091(-2);
        this.method2044(1);
        this.method2054(1);
        this.field4820 = 4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IFFFFF)V")
    public final void method1587(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4783 != arg0;
        if (var7 || this.field4743 != arg1 || this.field4775 != arg2) {
            this.field4783 = arg0;
            this.field4743 = arg1;
            this.field4775 = arg2;
            if (var7) {
                this.field4826 = (float) (this.field4783 & 0xFF0000) / 1.671168E7F;
                this.field4758 = (float) (this.field4783 & 0xFFFF) / 65535.0F;
                this.field4836 = (float) (this.field4783 & 0xFF) / 255.0F;
                this.method2098();
            }
            this.method2101();
        }
        if (this.field4748[0] == arg3 && this.field4748[1] == arg4 && this.field4748[2] == arg5) {
            return;
        }
        this.field4748[0] = arg3;
        this.field4748[1] = arg4;
        this.field4748[2] = arg5;
        this.field4822[0] = -arg3;
        this.field4822[1] = -arg4;
        this.field4822[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4768[0] = arg3 * var8;
        this.field4768[1] = arg4 * var8;
        this.field4768[2] = arg5 * var8;
        this.field4739[0] = -this.field4768[0];
        this.field4739[1] = -this.field4768[1];
        this.field4739[2] = -this.field4768[2];
        this.method2095();
        this.field4833 = (int) (arg3 * 256.0F / arg4);
        this.field4755 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "()V")
    public final void method1638() {
        this.field4711 = this.field4696.getWidth();
        this.field4709 = this.field4696.getHeight();
        this.field4697.glViewport(this.field4832, this.field4795, this.field4711, this.field4709);
        this.method2047();
        this.method1584();
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public final void method1627(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "()Z")
    public final boolean method1654() {
        return class450.field6539 == null || !class450.field6539.startsWith("mac");
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([Ljn;Lib;[Lpf;I)V")
    public final void method1581(class396[] arg0, class247 arg1, class447[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method2284(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "()Z")
    public final boolean method1625() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(F)V")
    public final void method2060(float arg0) {
        if (this.field4816 != arg0) {
            this.field4816 = arg0;
            if (this.field4742 == 3) {
                this.method2033();
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(II)V")
    public final synchronized void method2061(int arg0, int arg1) {
        class310 var3 = new class310(arg1);
        var3.field4510 = (long) arg0;
        this.field4723.method825(-93, var3);
    }

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "()V")
    public final void method1613() {
        this.method2080(true);
        this.field4697.glClear(256);
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(III)V")
    public final void method2062(int arg0, int arg1, int arg2) {
        this.field4697.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4697.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V")
    public final void method1572(boolean arg0) {
    }

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "()Lib;")
    public final class247 method1586() {
        return new class137();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lhc;)V")
    public final void method1635(class366 arg0) {
        this.field4704.method1165(this, arg0);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIZ)Llg;")
    public final class20 method1569(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class202(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII)V")
    public final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2031();
        this.method2044(arg5);
        this.field4697.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4765) {
            this.field4697.glDisable(32925);
        }
        this.field4697.glBegin(7);
        this.field4697.glVertex2f(var7, var8);
        this.field4697.glVertex2f(var7, var10);
        this.field4697.glVertex2f(var9, var10);
        this.field4697.glVertex2f(var9, var8);
        this.field4697.glEnd();
        if (this.field4765) {
            this.field4697.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "()Z")
    public final boolean method1585() {
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
    public final void method2063() {
    }

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "()Z")
    public final boolean method1619() {
        return this.field4705.method52();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFF)V")
    public final void method1560(float arg0, float arg1, float arg2) {
        class11.field103 = arg0;
        class11.field105 = arg1;
        class11.field100 = arg2;
    }

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "(I)I")
    public final int method2064(int arg0) {
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

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "()V")
    public final void method1551() {
        this.field4698.method1886(false, 5, false, 0);
        this.field4735 = false;
        this.method2057();
        this.method2030();
    }

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "()I")
    public final int method1621() {
        return this.field4752;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
    public final int method2065() {
        return this.field4709;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public final void method1618(int arg0) {
        this.method2051();
    }

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "()V")
    private final void method2066() {
        if (this.field4742 == 1) {
            return;
        }
        this.field4697.glMatrixMode(5889);
        this.field4697.glLoadIdentity();
        this.field4697.glOrtho(0.0D, (double) this.field4711, (double) this.field4709, 0.0D, -1.0D, 1.0D);
        this.field4697.glMatrixMode(5888);
        this.field4697.glLoadIdentity();
        this.field4742 = 1;
        this.field4820 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljp;[Lv;Z)Lwm;")
    public final class298 method1601(class402 arg0, class241[] arg1, boolean arg2) {
        return new class445(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "()V")
    private final void method2067() {
        if (this.field4799 && !this.field4745) {
            this.field4697.glEnable(2896);
        } else {
            this.field4697.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "()V")
    public final void method2068() {
        if (this.field4742 != 2) {
            this.field4742 = 2;
            this.method2048();
            this.method2078();
            this.field4820 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(II)V")
    public final void method1603(int arg0, int arg1) {
        if (this.field4823 == arg0 && this.field4812 == arg1) {
            return;
        }
        this.field4823 = arg0;
        this.field4812 = arg1;
        if (!this.field4735) {
            this.method2057();
            this.method2030();
        }
    }

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "(II)V")
    public final void method2069(int arg0, int arg1) {
        this.field4832 = arg0;
        this.field4795 = arg1;
        this.field4697.glViewport(arg0, arg1, this.field4711, this.field4709);
        this.method2028();
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lbb;)V")
    public final void method2070(class135 arg0) {
        class49 var2 = arg0.field1726;
        this.method2046(var2);
        var2.method229(arg0);
        this.field4835 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(FFF)V")
    private final void method2071(float arg0, float arg1, float arg2) {
        this.field4697.glMatrixMode(5890);
        if (this.field4828) {
            this.field4697.glLoadIdentity();
        }
        this.field4697.glTranslatef(arg0, arg1, arg2);
        this.field4697.glMatrixMode(5888);
        this.field4828 = true;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public final void method1600(int arg0, int arg1) {
        if (this.field4749 == arg0 && this.field4752 == arg1) {
            return;
        }
        this.field4749 = arg0;
        this.field4752 = arg1;
        this.method2047();
        this.method2086();
        this.method2057();
    }

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "()V")
    private final void method2072() {
        if (this.field4790 == 0.0F) {
            this.field4819[10] = this.field4753;
            this.field4819[14] = this.field4800;
        } else {
            float var1 = this.field4781 / (this.field4790 + this.field4781);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4800 * (1.0F - var1) / this.field4790;
            this.field4819[10] = this.field4753 + var3;
            this.field4819[14] = this.field4800 * var2;
        }
        this.method2086();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
    public final void method2073() {
    }

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "()V")
    private final void method2074() {
        this.method2091(-2);
        for (int var1 = this.field4796 - 1; var1 >= 0; var1--) {
            this.method2052(var1);
            this.method2032((class50) null);
            this.field4697.glTexEnvi(8960, 8704, 34160);
        }
        this.method2053(8448, 8448);
        this.method2062(2, 34168, 770);
        this.method2029();
        this.field4697.glEnable(3042);
        this.field4697.glBlendFunc(770, 771);
        this.field4762 = 1;
        this.field4697.glEnable(3008);
        this.field4697.glAlphaFunc(516, 0.0F);
        this.field4788 = true;
        this.field4697.glColorMask(true, true, true, true);
        this.field4818 = true;
        this.method2075(true);
        this.method2094(true);
        this.method2093(true);
        this.method2080(true);
        this.method2047();
        this.field4697.setSwapInterval(0);
        this.field4697.glShadeModel(7425);
        this.field4697.glClearDepth(1.0F);
        this.field4697.glDepthFunc(515);
        this.field4697.glPolygonMode(1028, 6914);
        this.field4697.glEnable(2884);
        this.field4697.glCullFace(1029);
        this.field4697.glMatrixMode(5888);
        this.field4697.glLoadIdentity();
        this.field4697.glColorMaterial(1028, 5634);
        this.field4697.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4697.glLightfv(var4, 4608, var2, 0);
            this.field4697.glLightf(var4, 4615, 0.0F);
            this.field4697.glLightf(var4, 4616, 0.0F);
        }
        this.field4697.glEnable(16384);
        this.field4697.glEnable(16385);
        this.field4697.glFogf(2914, 0.95F);
        this.field4697.glFogi(2917, 9729);
        this.field4697.glHint(3156, 4353);
        this.field4783 = this.field4823 = -1;
        this.method1584();
    }

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "()I")
    public final int method1617() {
        return this.field4749;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)V")
    public final void method1630(int arg0, int arg1, int arg2) {
        if (!this.field4735) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4750 = arg1;
        this.field4732 = arg2;
        this.method2057();
        this.field4698.method1887(true, arg0, true);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)V")
    public final void method2075(boolean arg0) {
        if (this.field4829 != arg0) {
            this.field4829 = arg0;
            this.method2030();
            this.field4820 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "()F")
    public final float method1641() {
        return this.field4790;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I[BIZ)Lcl;")
    public final class313 method2076(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class313) (this.field4733 && !arg3 || this.field4831 ? new class223(this, arg0, arg1, arg2, arg3) : new class146(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "(I)V")
    public final void method2077(int arg0) {
        field4706[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4706[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4706[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4706[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4697.glTexEnvfv(8960, 8705, field4706, 0);
    }

    @OriginalMember(owner = "client!ql", name = "fb", descriptor = "()V")
    private final void method2078() {
        this.field4697.glLoadIdentity();
        this.field4697.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4697.glMultMatrixf(this.field4774.method737((byte) 21), 0);
        this.method2095();
    }

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "()V")
    public final void method1584() {
        this.field4782 = 0;
        this.field4793 = 0;
        this.field4810 = this.field4711;
        this.field4806 = this.field4709;
        this.field4697.glDisable(3089);
        this.method2042();
    }

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "(I)I")
    public final int method2079(int arg0) {
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

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(Z)V")
    public final void method2080(boolean arg0) {
        if (this.field4834 != arg0) {
            this.field4834 = arg0;
            this.method2087();
            this.field4820 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(Z)V")
    public final void method2081(boolean arg0) {
        if (this.field4745 != arg0) {
            this.field4745 = arg0;
            this.method2067();
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Lbb;)V")
    public final void method2082(class135 arg0) {
        class49 var2 = arg0.field1726;
        this.method2046(var2);
        var2.method224(arg0);
        this.field4738 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "gb", descriptor = "()I")
    private final int method2083() {
        int var1 = 0;
        this.field4789 = this.field4697.glGetString(7936);
        this.field4741 = this.field4697.glGetString(7937);
        String var2 = this.field4789.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4697.glGetString(7938);
        String[] var4 = class167.method889(100, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class359.method2196((byte) 109, var4[0]);
                int var6 = class359.method2196((byte) 97, var4[1]);
                this.field4734 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4734 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4697.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4697.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4697.glGetIntegerv(34018, var8, 0);
        this.field4796 = var8[0];
        this.field4697.glGetIntegerv(34929, var8, 0);
        this.field4763 = var8[0];
        this.field4697.glGetIntegerv(34930, var8, 0);
        this.field4827 = var8[0];
        if (this.field4796 < 2 || this.field4763 < 2 || this.field4827 < 2) {
            var1 |= 0x10;
        }
        this.field4736 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4733 = this.field4697.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4765 = this.field4697.isExtensionAvailable("GL_ARB_multisample");
        this.field4830 = this.field4697.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4697.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4697.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4740 = this.field4697.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4729 = this.field4697.isExtensionAvailable("GL_EXT_texture3D");
        this.field4808 = this.field4697.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4767 = this.field4697.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4747 = this.field4697.isExtensionAvailable("GL_ARB_texture_float");
        this.field4807 = false;
        this.field4754 = this.field4697.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)[I")
    public final int[] method1642(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4697.glReadPixels(arg0, this.field4709 - arg1 - var6, arg2, 1, 32993, this.field4811, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ql", name = "hb", descriptor = "()V")
    public final void method2084() {
        this.field4697.glPopMatrix();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZZ)V")
    public final void method2085(int arg0, boolean arg1, boolean arg2) {
        if (this.field4804 != arg0) {
            if (arg0 < 0) {
                this.method2029();
                this.method2032((class50) null);
                if (!this.field4735) {
                    this.field4698.method1886(arg1, 5, arg2, 0);
                }
            } else {
                class218 var4 = this.field4695.method185(-120, arg0);
                class75 var5 = this.field4699.method1660(arg0, (byte) -94);
                if (var5.field835 == 0 && var5.field845 == 0) {
                    this.method2029();
                } else {
                    int var6 = var5.field825 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2071((float) (this.field4720 % var7 * var5.field835) / (float) var7, (float) (this.field4720 % var7 * var5.field845) / (float) var7, 0.0F);
                }
                if (this.field4735) {
                    this.field4698.method1886(arg1, 5, arg2, 3);
                    this.method2032(var4);
                } else {
                    this.field4698.method1886(arg1, 5, arg2, var5.field824);
                    this.field4698.method1887(false, var5.field829, true);
                    if (!this.field4698.method1885(var4, (byte) -10)) {
                        this.method2032(var4);
                    }
                }
            }
            this.field4804 = arg0;
        }
        this.field4820 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ql", name = "ib", descriptor = "()V")
    private final void method2086() {
        this.field4779 = (this.field4819[14] - (float) this.field4752) / this.field4819[10];
        this.field4787 = (float) this.field4752 - this.field4790;
    }

    @OriginalMember(owner = "client!ql", name = "jb", descriptor = "()V")
    private final void method2087() {
        this.field4697.glDepthMask(this.field4834 && this.field4751);
    }

    @OriginalMember(owner = "client!ql", name = "kb", descriptor = "()V")
    public final void method2088() {
        boolean var1 = this.field4798 != null;
        if (this.field4813 != var1) {
            if (var1) {
                this.field4697.glEnableClientState(32884);
            } else {
                this.field4697.glDisableClientState(32884);
            }
            this.field4813 = var1;
        }
        this.field4798 = null;
        boolean var2 = this.field4835 != null;
        if (this.field4778 != var2) {
            if (var2) {
                this.field4697.glEnableClientState(32885);
            } else {
                this.field4697.glDisableClientState(32885);
            }
            this.field4778 = var2;
        }
        this.field4835 = null;
        boolean var3 = this.field4738 != null;
        if (this.field4801 != var3) {
            if (var3) {
                this.field4697.glEnableClientState(32886);
            } else {
                this.field4697.glDisableClientState(32886);
            }
            this.field4801 = var3;
        }
        this.field4738 = null;
        for (int var4 = 0; var4 < this.field4763; var4++) {
            boolean var5 = this.field4780[var4] != null;
            if (this.field4777[var4] != var5) {
                this.field4697.glClientActiveTexture(var4 + 33984);
                if (var5) {
                    this.field4697.glEnableClientState(32888);
                } else {
                    this.field4697.glDisableClientState(32888);
                }
                this.field4777[var4] = var5;
            }
            this.field4780[var4] = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "(I)I")
    public final int method2089(int arg0) {
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

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIIIII)V")
    public final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2031();
        this.method2044(arg5);
        this.field4697.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4765) {
            this.field4697.glDisable(32925);
        }
        this.field4697.glBegin(2);
        this.field4697.glVertex2f(var7, var8);
        this.field4697.glVertex2f(var7, var10);
        this.field4697.glVertex2f(var9, var10);
        this.field4697.glVertex2f(var9, var8);
        this.field4697.glEnd();
        if (this.field4765) {
            this.field4697.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIII)V")
    public final void method1589(int arg0, int arg1, int arg2, int arg3) {
        this.field4791 = arg0;
        this.field4792 = arg1;
        this.field4805 = arg2;
        this.field4746 = arg3;
        float var5 = (float) (-this.field4791 * this.field4749) / (float) this.field4805;
        float var6 = (float) (-this.field4792 * this.field4749) / (float) this.field4746;
        float var7 = (float) ((this.field4711 - this.field4791) * this.field4749) / (float) this.field4805;
        float var8 = (float) ((this.field4709 - this.field4792) * this.field4749) / (float) this.field4746;
        this.method2043(var5, var7, -var8, -var6, (float) this.field4749, (float) this.field4752);
        if (this.field4742 != 1) {
            this.method2047();
        }
        this.method2086();
        this.method2042();
    }

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "(I)V")
    public final synchronized void method2090(int arg0) {
        class310 var2 = new class310(arg0);
        this.field4726.method825(-80, var2);
    }

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "(I)V")
    public final void method2091(int arg0) {
        this.method2038(arg0, true);
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(II)I")
    public final int method1634(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(IIIIII)Z")
    public final boolean method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4774.field1749 + (float) arg0 * this.field4774.field1750 + (float) arg1 * this.field4774.field1757 + this.field4774.field1753;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4774.field1749 + (float) arg3 * this.field4774.field1750 + (float) arg4 * this.field4774.field1757 + this.field4774.field1753;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4749) || !(var8 < (float) this.field4749)) || !(!(var7 > (float) this.field4752) || !(var8 > (float) this.field4752))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4774.field1747 + (float) arg0 * this.field4774.field1758 + (float) arg1 * this.field4774.field1759 + this.field4774.field1754) * (float) this.field4805 / var7);
        int var10 = (int) (((float) arg5 * this.field4774.field1747 + (float) arg3 * this.field4774.field1758 + (float) arg4 * this.field4774.field1759 + this.field4774.field1754) * (float) this.field4805 / var8);
        if ((float) var9 < this.field4730 && (float) var10 < this.field4730 || (float) var9 > this.field4815 && (float) var10 > this.field4815) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4774.field1756 + (float) arg0 * this.field4774.field1752 + (float) arg1 * this.field4774.field1748 + this.field4774.field1751) * (float) this.field4746 / var7);
            int var12 = (int) (((float) arg5 * this.field4774.field1756 + (float) arg3 * this.field4774.field1752 + (float) arg4 * this.field4774.field1748 + this.field4774.field1751) * (float) this.field4746 / var8);
            return (!((float) var11 < this.field4744) || !((float) var12 < this.field4744)) && (!((float) var11 > this.field4756) || !((float) var12 > this.field4756));
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lbi;)V")
    public final void method2092(class137 arg0) {
        this.field4697.glPushMatrix();
        this.field4697.glMultMatrixf(arg0.method737((byte) 26), 0);
    }

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "()Lib;")
    public final class247 method1650() {
        return this.field4708;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
    public final void method1558(boolean arg0) {
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V")
    public final void method1578(int arg0) {
        this.method2044(0);
        this.field4697.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4697.glClear(16384);
    }

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "(Z)V")
    public final void method2093(boolean arg0) {
        if (this.field4784 == arg0) {
            return;
        }
        if (arg0) {
            this.field4697.glEnable(2929);
        } else {
            this.field4697.glDisable(2929);
        }
        this.field4784 = arg0;
        this.field4820 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
    public final void method1631(int arg0, int arg1, int arg2) {
        this.field4735 = true;
        this.field4750 = arg1;
        this.field4732 = arg2;
        this.method2057();
        this.method2030();
        this.field4698.method1886(false, 5, false, 3);
        this.field4698.method1887(true, arg0, true);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lv;Z)Llg;")
    public final class20 method1633(class241 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field3282 * arg0.field3280];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3281 == null) {
            for (int var8 = 0; var8 < arg0.field3280; var8++) {
                for (int var9 = 0; var9 < arg0.field3282; var9++) {
                    int var10 = arg0.field3284[arg0.field3285[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field3280; var6++) {
                for (int var7 = 0; var7 < arg0.field3282; var7++) {
                    var3[var5++] = arg0.field3281[var4] << 24 | arg0.field3284[arg0.field3285[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class20 var11 = this.method1637(var3, 0, arg0.field3282, arg0.field3282, arg0.field3280);
        var11.method108(arg0.field3278, arg0.field3283, arg0.field3279, arg0.field3277);
        return var11;
    }

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "()V")
    public final void method1605() {
        this.field4703.method1221();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([Ljn;Lhc;Lib;[Lpf;I)V")
    public final void method1559(class396[] arg0, class366 arg1, class247 arg2, class447[] arg3, int arg4) {
        this.method1581(arg0, arg2, arg3, arg4);
        this.method1635(arg1);
    }

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "()I")
    public final int method1573() {
        int var1 = this.field4839;
        this.field4839 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(Z)V")
    public final void method2094(boolean arg0) {
        if (this.field4799 != arg0) {
            this.field4799 = arg0;
            this.method2067();
            this.field4820 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ql", name = "lb", descriptor = "()V")
    public final void method2095() {
        this.field4697.glLightfv(16384, 4611, this.field4748, 0);
        this.field4697.glLightfv(16385, 4611, this.field4822, 0);
    }

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "()Z")
    public final boolean method1612() {
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "(I)V")
    public final synchronized void method2096(int arg0) {
        class310 var2 = new class310(arg0);
        this.field4727.method825(94, var2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(FF)V")
    public final void method1583(float arg0, float arg1) {
        if (this.field4781 == arg0 && this.field4790 == arg1) {
            return;
        }
        this.field4781 = arg0;
        this.field4790 = arg1;
        this.method2072();
        this.method2086();
        if (this.field4742 == 3) {
            this.method2033();
        } else if (this.field4742 == 2) {
            this.method2048();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1574(Rectangle[] arg0, int arg1) {
        this.method1646();
    }

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "(II)V")
    public final synchronized void method2097(int arg0, int arg1) {
        class310 var3 = new class310(arg1);
        var3.field4510 = (long) arg0;
        this.field4722.method825(122, var3);
    }

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "()Z")
    public final boolean method1636() {
        return this.field4705.method436((byte) 52);
    }

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "()Z")
    public final boolean method1570() {
        return this.field4765;
    }

    @OriginalMember(owner = "client!ql", name = "mb", descriptor = "()V")
    private final void method2098() {
        field4706[0] = this.field4826 * this.field4824;
        field4706[1] = this.field4824 * this.field4758;
        field4706[2] = this.field4836 * this.field4824;
        field4706[3] = 1.0F;
        this.field4697.glLightModelfv(2899, field4706, 0);
    }

    @OriginalMember(owner = "client!ql", name = "nb", descriptor = "()V")
    private final void method2099() {
        this.field4774 = new class137();
        this.field4760 = new class137();
        this.field4757 = new class50[this.field4796];
        this.field4777 = new boolean[this.field4763];
        this.field4780 = new class135[this.field4763];
        this.field4797 = new class218(this, 3553, 6408, 1, 1);
        this.field4803 = new class218(this, 3553, 6408, 1, 1);
        this.field4759 = new class218(this, 3553, 6408, 1, 1);
        this.field4731 = new class377(this);
        this.field4769 = new class377(this);
        this.field4770 = new class377(this);
        this.field4794 = new class377(this);
        this.field4785 = new class377(this);
        this.field4814 = new class377(this);
        this.field4761 = this.method2076(5123, (byte[]) null, 1024, true);
        if (this.field4754) {
            this.field4786 = new class415(this);
        }
        this.field4704.method1167(this);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ld;)V")
    public final void method2100(class378 arg0) {
        if (this.field4713 < 0 || this.field4718[this.field4713] != arg0) {
            throw new RuntimeException();
        }
        this.field4718[this.field4713--] = null;
        arg0.method2063();
        if (this.field4713 >= 0) {
            this.field4712 = this.field4718[this.field4713];
            this.field4712.method2073();
        }
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "()V")
    public final void method1646() {
        try {
            this.field4700.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIII)V")
    public final void method1591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2031();
        this.method2044(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4697.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4697.glBegin(1);
        this.field4697.glVertex2f(var6, var7);
        this.field4697.glVertex2f((float) arg2 + var6, var7);
        this.field4697.glEnd();
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
    public final void method1648(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4711) {
            arg2 = this.field4711;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4709) {
            arg3 = this.field4709;
        }
        this.field4782 = arg0;
        this.field4793 = arg1;
        this.field4810 = arg2;
        this.field4806 = arg3;
        this.field4697.glEnable(3089);
        this.method2042();
        this.method2028();
    }

    @OriginalMember(owner = "client!ql", name = "ob", descriptor = "()V")
    private final void method2101() {
        field4706[0] = this.field4826 * this.field4743;
        field4706[1] = this.field4758 * this.field4743;
        field4706[2] = this.field4836 * this.field4743;
        field4706[3] = 1.0F;
        this.field4697.glLightfv(16384, 4609, field4706, 0);
        field4706[0] = -this.field4775 * this.field4826;
        field4706[1] = -this.field4775 * this.field4758;
        field4706[2] = -this.field4775 * this.field4836;
        field4706[3] = 1.0F;
        this.field4697.glLightfv(16385, 4609, field4706, 0);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Ld;)V")
    public final void method2102(class378 arg0) {
        if (this.field4713 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4713 >= 0) {
            this.field4718[this.field4713].method2063();
        }
        this.field4712 = this.field4718[++this.field4713] = arg0;
        this.field4712.method2073();
    }

    @OriginalMember(owner = "client!ql", name = "pb", descriptor = "()V")
    private final void method2103() {
        try {
            this.field4700.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[Lfs;)V")
    public final void method1607(int arg0, class349[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class349 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4707[0] = (float) var4.field4853;
            field4707[1] = (float) var4.field4849;
            field4707[2] = (float) var4.field4851;
            field4707[3] = 1.0F;
            this.field4697.glLightfv(var5, 4611, field4707, 0);
            int var6 = var4.field4848;
            float var7 = var4.field4852 / 255.0F;
            field4707[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4707[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4707[2] = (float) (var6 & 0xFF) * var7;
            this.field4697.glLightfv(var5, 4609, field4707, 0);
            this.field4697.glLightf(var5, 4617, 1.0F / (float) (var4.field4855 * var4.field4855));
            this.field4697.glEnable(var5);
        }
        while (var3 < this.field4776) {
            this.field4697.glDisable(var3 + 16386);
            var3++;
        }
        this.field4776 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljn;Lhc;Lib;Lpf;I)V")
    public final void method1622(class396 arg0, class366 arg1, class247 arg2, class447 arg3, int arg4) {
        arg0.method2284(arg2, arg3, arg4);
        this.method1635(arg1);
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
    public final void method1588(int arg0) {
        this.method2103();
    }

    @OriginalMember(owner = "client!ql", name = "qb", descriptor = "()Ld;")
    public final class378 method2104() {
        return this.field4712;
    }

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "()Z")
    public final boolean method1598() {
        if (!this.field4705.method436((byte) 110)) {
            if (!this.field4703.method1227(this.field4705)) {
                return false;
            }
            this.field4695.method186(-86);
        }
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILbb;)V")
    public final void method2105(int arg0, class135 arg1) {
        class49 var3 = arg1.field1726;
        this.method2046(var3);
        var3.method226(arg0, arg1);
        this.field4780[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIIII)V")
    public final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2031();
        this.method2044(arg5);
        this.field4697.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4697.glBegin(2);
        this.field4697.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4697.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4697.glEnd();
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIIII)V")
    public final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2031();
        this.method2044(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4697.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4697.glBegin(1);
        this.field4697.glVertex2f(var6, var7);
        this.field4697.glVertex2f(var6, (float) arg2 + var7);
        this.field4697.glEnd();
    }

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "()Z")
    public final boolean method1632() {
        return this.field4698.method1884(3, (byte) 50);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILgo;II)V")
    public final void method1566(int arg0, class175 arg1, int arg2, int arg3) {
        class113 var5 = (class113) arg1;
        class170 var6 = var5.field1409;
        this.method2106();
        this.method2032(var5.field1409);
        this.method2044(1);
        this.method2053(7681, 8448);
        this.method2062(0, 34167, 768);
        float var7 = var6.field2144 / (float) var6.field2143;
        float var8 = var6.field2141 / (float) var6.field2142;
        this.field4697.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4697.glBegin(7);
        this.field4697.glTexCoord2f((float) (this.field4782 - arg2) * var7, (float) (this.field4793 - arg3) * var8);
        this.field4697.glVertex2i(this.field4782, this.field4793);
        this.field4697.glTexCoord2f((float) (this.field4782 - arg2) * var7, (float) (this.field4806 - arg3) * var8);
        this.field4697.glVertex2i(this.field4782, this.field4806);
        this.field4697.glTexCoord2f((float) (this.field4810 - arg2) * var7, (float) (this.field4806 - arg3) * var8);
        this.field4697.glVertex2i(this.field4810, this.field4806);
        this.field4697.glTexCoord2f((float) (this.field4810 - arg2) * var7, (float) (this.field4793 - arg3) * var8);
        this.field4697.glVertex2i(this.field4810, this.field4793);
        this.field4697.glEnd();
        this.method2062(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ql", name = "rb", descriptor = "()V")
    public final void method2106() {
        if (this.field4820 == 2) {
            return;
        }
        this.method2066();
        this.method2075(false);
        this.method2094(false);
        this.method2093(false);
        this.method2080(false);
        this.method2091(-2);
        this.field4820 = 2;
    }

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "()Z")
    public final boolean method1557() {
        return false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4802 == null || this.field4802.field2924 < arg2 || this.field4802.field2923 < arg3) {
            this.field4802 = class170.method897((byte) 57, 6406, 6406, arg3, arg6, arg2, this, false);
            this.field4802.method1171(false, false);
            var10 = this.field4802.field2141;
            var11 = this.field4802.field2144;
        } else {
            this.field4802.method1172(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4802.field2141 / (float) this.field4802.field2923;
            var11 = (float) arg2 * this.field4802.field2144 / (float) this.field4802.field2924;
        }
        this.method2106();
        this.method2032(this.field4802);
        this.method2044(arg8);
        this.field4697.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2077(arg5);
        this.method2053(34165, 34165);
        this.method2062(0, 34166, 768);
        this.method2062(2, 5890, 770);
        this.method2040(0, 34166, 770);
        this.method2040(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4697.glBegin(7);
        this.field4697.glTexCoord2f(0.0F, 0.0F);
        this.field4697.glVertex2f(var12, var13);
        this.field4697.glTexCoord2f(0.0F, var11);
        this.field4697.glVertex2f(var12, var15);
        this.field4697.glTexCoord2f(var10, var11);
        this.field4697.glVertex2f(var14, var15);
        this.field4697.glTexCoord2f(var10, 0.0F);
        this.field4697.glVertex2f(var14, var13);
        this.field4697.glEnd();
        this.method2062(0, 5890, 768);
        this.method2062(2, 34166, 770);
        this.method2040(0, 5890, 770);
        this.method2040(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[I)V")
    public final void method1553(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4774.field1749 + (float) arg0 * this.field4774.field1750 + (float) arg1 * this.field4774.field1757 + this.field4774.field1753;
        if ((var5 < (float) this.field4749) || (var5 > (float) this.field4752)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4774.field1747 + (float) arg0 * this.field4774.field1758 + (float) arg1 * this.field4774.field1759 + this.field4774.field1754) * (float) this.field4805 / var5);
        int var7 = (int) (((float) arg2 * this.field4774.field1756 + (float) arg0 * this.field4774.field1752 + (float) arg1 * this.field4774.field1748 + this.field4774.field1751) * (float) this.field4746 / var5);
        if ((float) var6 >= this.field4730 && (float) var6 <= this.field4815 && (float) var7 >= this.field4744 && (float) var7 <= this.field4756) {
            arg3[0] = (int) ((float) var6 - this.field4730);
            arg3[1] = (int) ((float) var7 - this.field4744);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)V")
    public final void method1629(int[] arg0) {
        arg0[0] = this.field4782;
        arg0[1] = this.field4793;
        arg0[2] = this.field4810;
        arg0[3] = this.field4806;
    }

    @OriginalMember(owner = "client!ql", name = "sb", descriptor = "()V")
    private final void method2107() {
        if (this.field4742 != 3) {
            this.field4742 = 3;
            this.method2033();
            this.method2078();
            this.field4820 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lal;IILlh;)V")
    public class346(Canvas arg0, class369 arg1, int arg2, int arg3, class450 arg4) {
        this.field4696 = arg0;
        this.field4699 = arg1;
        this.field4307 = arg2;
        int var6 = 0;
        while (!this.field4696.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class370.method2235(1000L, 10);
        }
        this.field4696.setIgnoreRepaint(true);
        try {
            if (!field4701) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4701 = Boolean.TRUE;
                } else {
                    class304 var7 = arg4.method2778(124, this.getClass());
                    while (var7.field4123 == 0) {
                        class370.method2235(100L, 10);
                    }
                    if (var7.field4123 == 1) {
                        field4701 = Boolean.TRUE;
                    }
                }
            }
            if (!field4701) {
                throw new RuntimeException("");
            }
            this.field4700 = new context();
            if (!this.field4700.choosePixelFormat(this.field4696, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4700.createContext()) {
                this.method2051();
                this.field4697 = this.field4700.getGL();
                int var8 = this.method2083();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4811 = this.field4736 ? 33639 : 5121;
                String var9 = this.field4789.toLowerCase();
                String var10 = this.field4741.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class167.method889(100, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class125.method672(true, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class125.method672(true, var16.substring(0, 4))) {
                                        var11 = class359.method2196((byte) 113, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4733 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4729 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4747 = false;
                    }
                    this.field4831 = this.field4733;
                }
                if (var9.contains("intel")) {
                    this.field4754 = false;
                }
                if (this.field4733) {
                    try {
                        int[] var18 = new int[1];
                        this.field4697.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2102(this);
                this.method1638();
                this.method2099();
                new class215(this);
                this.field4695 = new class39(this, this.field4699);
                class67.method382(120, true, true);
                this.field4715 = true;
                this.field4698 = new class329(this);
                this.field4703 = new class226(this);
                this.field4705 = new class11(this);
                this.method2074();
                this.field4697.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4700.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class370.method2235(100L, 10);
                    }
                }
                this.field4697.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method1599();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
