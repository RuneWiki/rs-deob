import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class330 extends class437 implements class418 {

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "Lrp;")
    private class245 field4747 = new class245();

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Lao;")
    private class116 field4749 = new class303();

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public int field4751 = 8;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    private int field4757 = -1;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public int field4758 = 3;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[Lgq;")
    private class418[] field4759 = new class418[4];

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "Z")
    private boolean field4754 = false;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "Lmi;")
    private class408 field4756 = new class408();

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "Lmi;")
    private class408 field4763 = new class408();

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "Lmi;")
    private class408 field4764 = new class408();

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "Lmi;")
    private class408 field4765 = new class408();

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "Lmi;")
    private class408 field4766 = new class408();

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "Lmi;")
    private class408 field4767 = new class408();

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "Lmi;")
    private class408 field4768 = new class408();

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "I")
    private int field4772 = 0;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "F")
    public float field4780 = 3584.0F;

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "I")
    private int field4786 = 0;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "Z")
    private boolean field4776 = true;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "F")
    public float field4769 = -1.0F;

    @OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
    public int field4809 = 512;

    @OriginalMember(owner = "client!ih", name = "sb", descriptor = "[F")
    private float[] field4787 = new float[16];

    @OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
    public int field4812 = 512;

    @OriginalMember(owner = "client!ih", name = "Kb", descriptor = "[F")
    public float[] field4805 = new float[4];

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    public int field4781 = -1;

    @OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
    private int field4807 = 0;

    @OriginalMember(owner = "client!ih", name = "fc", descriptor = "F")
    public float field4826 = -1.0F;

    @OriginalMember(owner = "client!ih", name = "dc", descriptor = "I")
    public int field4824 = -1;

    @OriginalMember(owner = "client!ih", name = "Xb", descriptor = "I")
    private int field4818 = 8448;

    @OriginalMember(owner = "client!ih", name = "yc", descriptor = "[F")
    private float[] field4845 = new float[4];

    @OriginalMember(owner = "client!ih", name = "Sb", descriptor = "I")
    private int field4813 = -1;

    @OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
    public int field4802 = 0;

    @OriginalMember(owner = "client!ih", name = "lc", descriptor = "F")
    public float field4832 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "[F")
    private float[] field4774 = new float[4];

    @OriginalMember(owner = "client!ih", name = "Ab", descriptor = "F")
    public float field4795 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "vc", descriptor = "I")
    public int field4842 = 0;

    @OriginalMember(owner = "client!ih", name = "Lb", descriptor = "[F")
    private float[] field4806 = new float[4];

    @OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
    private int field4801 = 0;

    @OriginalMember(owner = "client!ih", name = "Ic", descriptor = "F")
    public float field4855 = 3584.0F;

    @OriginalMember(owner = "client!ih", name = "qc", descriptor = "I")
    private int field4837 = 0;

    @OriginalMember(owner = "client!ih", name = "Yb", descriptor = "I")
    public int field4819 = 50;

    @OriginalMember(owner = "client!ih", name = "nc", descriptor = "F")
    public float field4834 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "Nc", descriptor = "F")
    private float field4860 = 0.0F;

    @OriginalMember(owner = "client!ih", name = "Sc", descriptor = "I")
    public int field4865 = 3584;

    @OriginalMember(owner = "client!ih", name = "Ec", descriptor = "I")
    private int field4851 = -1;

    @OriginalMember(owner = "client!ih", name = "Zb", descriptor = "F")
    private float field4820 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "Ac", descriptor = "F")
    private float field4847 = 1.0F;

    @OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
    private int field4861 = 0;

    @OriginalMember(owner = "client!ih", name = "vb", descriptor = "I")
    public int field4790 = -1;

    @OriginalMember(owner = "client!ih", name = "ec", descriptor = "I")
    private int field4825 = 8448;

    @OriginalMember(owner = "client!ih", name = "Xc", descriptor = "I")
    private int field4870 = 0;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4746;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lfl;")
    public class386 field4740;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "Ljaggl/context;")
    private context field4737;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Ljaggl/opengl;")
    public opengl field4741;

    @OriginalMember(owner = "client!ih", name = "Cb", descriptor = "Z")
    public boolean field4797;

    @OriginalMember(owner = "client!ih", name = "Wc", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!ih", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field4866;

    @OriginalMember(owner = "client!ih", name = "zb", descriptor = "Ljava/lang/String;")
    private String field4794;

    @OriginalMember(owner = "client!ih", name = "oc", descriptor = "Z")
    private boolean field4835;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "Z")
    public boolean field4770;

    @OriginalMember(owner = "client!ih", name = "Lc", descriptor = "Z")
    public boolean field4858;

    @OriginalMember(owner = "client!ih", name = "Bb", descriptor = "Z")
    public boolean field4796;

    @OriginalMember(owner = "client!ih", name = "bc", descriptor = "Z")
    private boolean field4822;

    @OriginalMember(owner = "client!ih", name = "wb", descriptor = "Z")
    public boolean field4791;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "Lmc;")
    public class317 field4742;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Ljc;")
    private class382 field4744;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Lmm;")
    private class356 field4739;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "Lnb;")
    private class334 field4738;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "[F")
    private static float[] field4736 = new float[4];

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4743 = Boolean.FALSE;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[F")
    private static float[] field4745 = new float[4];

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "[I")
    private static int[] field4748 = new int[1000];

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "F")
    public float field4778;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "F")
    public float field4779;

    @OriginalMember(owner = "client!ih", name = "Db", descriptor = "F")
    public float field4798;

    @OriginalMember(owner = "client!ih", name = "Fb", descriptor = "F")
    private float field4800;

    @OriginalMember(owner = "client!ih", name = "Nb", descriptor = "F")
    private float field4808;

    @OriginalMember(owner = "client!ih", name = "ac", descriptor = "F")
    public float field4821;

    @OriginalMember(owner = "client!ih", name = "xc", descriptor = "F")
    public float field4844;

    @OriginalMember(owner = "client!ih", name = "Cc", descriptor = "F")
    public float field4849;

    @OriginalMember(owner = "client!ih", name = "Dc", descriptor = "F")
    public float field4850;

    @OriginalMember(owner = "client!ih", name = "Hc", descriptor = "F")
    private float field4854;

    @OriginalMember(owner = "client!ih", name = "Qc", descriptor = "F")
    public float field4863;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    private int field4752;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public int field4760;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    private int field4773;

    @OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!ih", name = "ub", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!ih", name = "yb", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!ih", name = "Ib", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!ih", name = "kc", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!ih", name = "mc", descriptor = "I")
    private int field4833;

    @OriginalMember(owner = "client!ih", name = "pc", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!ih", name = "Kc", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!ih", name = "Pc", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!ih", name = "Rc", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!ih", name = "Zc", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
    private int field4873;

    @OriginalMember(owner = "client!ih", name = "Vb", descriptor = "J")
    private long field4816;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "Leq;")
    public class140 field4777;

    @OriginalMember(owner = "client!ih", name = "rc", descriptor = "Leq;")
    public class140 field4838;

    @OriginalMember(owner = "client!ih", name = "Yc", descriptor = "Leq;")
    public class140 field4871;

    @OriginalMember(owner = "client!ih", name = "Fc", descriptor = "Lns;")
    private class173 field4852;

    @OriginalMember(owner = "client!ih", name = "Vc", descriptor = "Lcj;")
    private class182 field4868;

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "Lhk;")
    public class202 field4783;

    @OriginalMember(owner = "client!ih", name = "Qb", descriptor = "Lhk;")
    public class202 field4811;

    @OriginalMember(owner = "client!ih", name = "Ub", descriptor = "Lhk;")
    public class202 field4815;

    @OriginalMember(owner = "client!ih", name = "hc", descriptor = "Lhk;")
    public class202 field4828;

    @OriginalMember(owner = "client!ih", name = "ic", descriptor = "Lhk;")
    public class202 field4829;

    @OriginalMember(owner = "client!ih", name = "sc", descriptor = "Lhk;")
    public class202 field4839;

    @OriginalMember(owner = "client!ih", name = "Jc", descriptor = "Lir;")
    private class217 field4856;

    @OriginalMember(owner = "client!ih", name = "Uc", descriptor = "Lir;")
    public class217 field4867;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "Lkf;")
    private class294 field4771;

    @OriginalMember(owner = "client!ih", name = "Pb", descriptor = "Lda;")
    public class303 field4810;

    @OriginalMember(owner = "client!ih", name = "uc", descriptor = "Lda;")
    public class303 field4841;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Lgq;")
    private class418 field4750;

    @OriginalMember(owner = "client!ih", name = "Tb", descriptor = "Lkq;")
    public class89 field4814;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "Z")
    private boolean field4775;

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "Z")
    public boolean field4782;

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "Z")
    private boolean field4784;

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "Z")
    private boolean field4785;

    @OriginalMember(owner = "client!ih", name = "Eb", descriptor = "Z")
    public boolean field4799;

    @OriginalMember(owner = "client!ih", name = "Wb", descriptor = "Z")
    private boolean field4817;

    @OriginalMember(owner = "client!ih", name = "cc", descriptor = "Z")
    public boolean field4823;

    @OriginalMember(owner = "client!ih", name = "gc", descriptor = "Z")
    private boolean field4827;

    @OriginalMember(owner = "client!ih", name = "jc", descriptor = "Z")
    private boolean field4830;

    @OriginalMember(owner = "client!ih", name = "tc", descriptor = "Z")
    public boolean field4840;

    @OriginalMember(owner = "client!ih", name = "wc", descriptor = "Z")
    private boolean field4843;

    @OriginalMember(owner = "client!ih", name = "zc", descriptor = "Z")
    private boolean field4846;

    @OriginalMember(owner = "client!ih", name = "Bc", descriptor = "Z")
    private boolean field4848;

    @OriginalMember(owner = "client!ih", name = "Gc", descriptor = "Z")
    public boolean field4853;

    @OriginalMember(owner = "client!ih", name = "Mc", descriptor = "Z")
    private boolean field4859;

    @OriginalMember(owner = "client!ih", name = "xb", descriptor = "[Ldg;")
    private class223[] field4792;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V", line = 6)
    public final void method2025() {
        if (this.field4741 != null) {
            try {
                this.field4739.method2340();
            } catch (Throwable var4) {
            }
            this.field4741 = null;
        }
        if (this.field4737 != null) {
            this.method2062();
            try {
                this.field4737.destroy();
            } catch (Throwable var3) {
            }
            this.field4737 = null;
        }
        if (this.field4754) {
            class288.method1821(true, true, -1);
            this.field4754 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "()Lao;", line = 38)
    public final class116 method2026() {
        return this.field4749;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lj;Lj;FLj;)Lj;", line = 42)
    public final class269 method2027(class269 arg0, class269 arg1, float arg2, class269 arg3) {
        if (arg0 != null && arg1 != null && this.field4823 && this.field4791) {
            class426 var5 = null;
            class294 var6 = (class294) arg0;
            class294 var7 = (class294) arg1;
            class266 var8 = var6.method292(-1457);
            class266 var9 = var7.method292(-1457);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3921 > var9.field3921 ? var8.field3921 : var9.field3921;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class426) {
                    class426 var11 = (class426) arg3;
                    if (var11.method2735(true) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class426(this, var10);
                }
                var5.method2734(0, var8, var9, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "()V", line = 80)
    private final void method2028() {
        int var1;
        if (this.field4799) {
            this.field4741.glFogf(2915, 0.0F);
            this.field4741.glFogf(2916, 1.0F);
            var1 = this.field4813;
        } else {
            this.field4854 = (float) (this.field4865 - 256) - this.field4860;
            this.field4863 = this.field4854 - (float) this.field4790 * this.field4820;
            if (this.field4863 < (float) this.field4819) {
                this.field4863 = (float) this.field4819;
            }
            this.field4741.glFogf(2915, this.field4863);
            this.field4741.glFogf(2916, this.field4854);
            var1 = this.field4824;
        }
        field4745[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4745[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4745[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4741.glFogfv(2918, field4745, 0);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V", line = 105)
    public final void method2029(int arg0, int arg1, int arg2) {
        this.field4741.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4741.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)V", line = 111)
    public final void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2156();
        this.method2044(arg5);
        this.field4741.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4741.glBegin(2);
        this.field4741.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4741.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4741.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)V", line = 124)
    public final synchronized void method2031(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4763.method2657(-97)) {
            class231 var4 = (class231) this.field4763.method2647((byte) 93);
            field4748[var2++] = (int) var4.field5903;
            this.field4753 -= var4.field3258;
            if (var2 == 1000) {
                this.field4741.glDeleteBuffersARB(var2, field4748, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4741.glDeleteBuffersARB(var2, field4748, 0);
            var2 = 0;
        }
        while (!this.field4764.method2657(122)) {
            class231 var5 = (class231) this.field4764.method2647((byte) 93);
            field4748[var2++] = (int) var5.field5903;
            this.field4762 -= var5.field3258;
            if (var2 == 1000) {
                this.field4741.glDeleteTextures(var2, field4748, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4741.glDeleteTextures(var2, field4748, 0);
            var2 = 0;
        }
        while (!this.field4765.method2657(127)) {
            class231 var6 = (class231) this.field4765.method2647((byte) 93);
            field4748[var2++] = var6.field3258;
            if (var2 == 1000) {
                this.field4741.glDeleteFramebuffersEXT(var2, field4748, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4741.glDeleteFramebuffersEXT(var2, field4748, 0);
            var2 = 0;
        }
        while (!this.field4766.method2657(-18)) {
            class231 var7 = (class231) this.field4766.method2647((byte) 93);
            field4748[var2++] = (int) var7.field5903;
            this.field4752 -= var7.field3258;
            if (var2 == 1000) {
                this.field4741.glDeleteRenderbuffersEXT(var2, field4748, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4741.glDeleteRenderbuffersEXT(var2, field4748, 0);
            var2 = 0;
        }
        while (!this.field4767.method2657(12)) {
            class231 var8 = (class231) this.field4767.method2647((byte) 93);
            field4748[var2++] = (int) var8.field5903;
            if (var2 == 1000) {
                this.field4741.glDeleteProgramsARB(var2, field4748, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4741.glDeleteProgramsARB(var2, field4748, 0);
            boolean var9 = false;
        }
        while (!this.field4756.method2657(122)) {
            class231 var10 = (class231) this.field4756.method2647((byte) 93);
            this.field4741.glDeleteLists((int) var10.field5903, var10.field3258);
        }
        while (!this.field4768.method2657(-85)) {
            class231 var11 = (class231) this.field4768.method2647((byte) 93);
            this.field4741.glDeleteObjectARB(var11.field3258);
        }
        while (!this.field4756.method2657(-107)) {
            class231 var12 = (class231) this.field4756.method2647((byte) 93);
            this.field4741.glDeleteLists((int) var12.field5903, var12.field3258);
        }
        if (this.method2039() > 100663296 && class55.method375(-3913) > this.field4816 + 60000L) {
            System.gc();
            this.field4816 = class55.method375(-3913);
        }
        this.field4761 = var3;
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "()I", line = 291)
    public final int method2032() {
        int var1 = this.field4872;
        this.field4872 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "()V", line = 300)
    public final void method2033() {
        this.method2184(true);
        this.field4741.glClear(256);
    }

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "()V", line = 306)
    public final void method2034() {
        this.field4801 = 0;
        this.field4837 = 0;
        this.field4786 = this.field4760;
        this.field4870 = this.field4755;
        this.field4741.glDisable(3089);
        this.method2142();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lcj;)V", line = 314)
    public final void method2035(class182 arg0) {
        if (this.field4868 != arg0 && this.field4835) {
            this.field4741.glBindBufferARB(34962, arg0.method90());
            this.field4868 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "()V", line = 322)
    private final void method2036() {
        if (this.field4843 && this.field4799 | this.field4790 >= 0) {
            this.field4741.glEnable(2912);
        } else {
            this.field4741.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V", line = 329)
    public final void method2037(int arg0) {
        if (this.field4864 != arg0) {
            this.field4741.glActiveTexture(arg0 + 33984);
            this.field4864 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "()V", line = 338)
    private final void method2038() {
        this.method2127(-2);
        for (int var1 = this.field4788 - 1; var1 >= 0; var1--) {
            this.method2037(var1);
            this.method2186((class223) null);
            this.field4741.glTexEnvi(8960, 8704, 34160);
        }
        this.method2109(8448, 8448);
        this.method2072(2, 34168, 770);
        this.method2160();
        this.field4741.glEnable(3042);
        this.field4741.glBlendFunc(770, 771);
        this.field4836 = 1;
        this.field4741.glEnable(3008);
        this.field4741.glAlphaFunc(516, 0.0F);
        this.field4785 = true;
        this.field4741.glColorMask(true, true, true, true);
        this.field4784 = true;
        this.field4773 = 1;
        this.method2157(true);
        this.method2134(true);
        this.method2061(true);
        this.method2184(true);
        this.method2126();
        this.field4741.setSwapInterval(0);
        this.field4741.glShadeModel(7425);
        this.field4741.glClearDepth(1.0F);
        this.field4741.glDepthFunc(515);
        this.field4741.glPolygonMode(1028, 6914);
        this.field4741.glEnable(2884);
        this.field4741.glCullFace(1029);
        this.field4741.glMatrixMode(5888);
        this.field4741.glLoadIdentity();
        this.field4741.glColorMaterial(1028, 5634);
        this.field4741.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4741.glLightfv(var4, 4608, var2, 0);
            this.field4741.glLightf(var4, 4615, 0.0F);
            this.field4741.glLightf(var4, 4616, 0.0F);
        }
        this.field4741.glEnable(16384);
        this.field4741.glEnable(16385);
        this.field4741.glFogf(2914, 0.95F);
        this.field4741.glFogi(2917, 9729);
        this.field4741.glHint(3156, 4353);
        this.field4851 = this.field4824 = -1;
        this.method2034();
    }

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "()I", line = 402)
    public final int method2039() {
        return this.field4762 + this.field4753 + this.field4752;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)V", line = 405)
    public final void method2040(int arg0, int arg1) {
        this.field4807 = arg0;
        this.field4861 = arg1;
        this.field4741.glViewport(arg0, arg1, this.field4760, this.field4755);
        this.method2088();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V", line = 413)
    public final void method2041(int arg0, int arg1, int arg2) {
        if (!this.field4799) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4813 = arg1;
        this.field4781 = arg2;
        this.method2028();
        this.field4744.method2515(true, arg0, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILsn;II)V", line = 427)
    public final void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class449 arg6, int arg7, int arg8) {
        class221 var10 = (class221) arg6;
        class173 var11 = var10.field3143;
        this.method2076();
        this.method2186(var10.field3143);
        this.method2044(arg5);
        this.method2109(7681, 8448);
        this.method2072(0, 34167, 768);
        float var12 = var11.field2260 / (float) var11.field2264;
        float var13 = var11.field2263 / (float) var11.field2261;
        this.field4741.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4741.glBegin(1);
        this.field4741.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4741.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4741.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4741.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4741.glEnd();
        this.method2072(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lcj;", line = 451)
    public final class182 method2043(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class182) (this.field4835 && !arg2 || this.field4822 ? new class121(this, arg0, arg1, arg2) : new class13(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V", line = 460)
    public final void method2044(int arg0) {
        if (this.field4773 == arg0) {
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
        if (this.field4784 != var3) {
            this.field4741.glColorMask(var3, var3, var3, true);
            this.field4784 = var3;
        }
        if (this.field4785 != var4) {
            if (var4) {
                this.field4741.glEnable(3008);
            } else {
                this.field4741.glDisable(3008);
            }
            this.field4785 = var4;
        }
        if (this.field4836 != var2) {
            if (var2 == 1) {
                this.field4741.glEnable(3042);
                this.field4741.glBlendEquation(32774);
                this.field4741.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4741.glEnable(3042);
                this.field4741.glBlendEquation(32774);
                this.field4741.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4741.glEnable(3042);
                this.field4741.glBlendEquation(32778);
                this.field4741.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4741.glEnable(3042);
                this.field4741.glBlendEquation(32774);
                this.field4741.glBlendFunc(774, 1);
            } else {
                this.field4741.glDisable(3042);
            }
            this.field4836 = var2;
        }
        this.field4773 = arg0;
        this.field4793 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 572)
    public final void method2045(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "()Lgq;", line = 575)
    public final class418 method2046() {
        return this.field4750;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lj;)V", line = 582)
    public final void method2047(class269 arg0) {
        this.field4771 = (class294) arg0;
    }

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "()V", line = 586)
    private final void method2048() {
        if (this.field4857 == 1) {
            return;
        }
        this.field4741.glMatrixMode(5889);
        this.field4741.glLoadIdentity();
        this.field4741.glOrtho(0.0D, (double) this.field4760, (double) this.field4755, 0.0D, -1.0D, 1.0D);
        this.field4741.glMatrixMode(5888);
        this.field4741.glLoadIdentity();
        this.field4857 = 1;
        this.field4793 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[BIZ)Lir;", line = 606)
    public final class217 method2049(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class217) (this.field4835 && !arg3 || this.field4822 ? new class289(this, arg0, arg1, arg2, arg3) : new class283(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "()I", line = 615)
    private final int method2050() {
        int var1 = 0;
        this.field4866 = this.field4741.glGetString(7936);
        this.field4794 = this.field4741.glGetString(7937);
        String var2 = this.field4866.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4741.glGetString(7938);
        String[] var4 = class369.method2436((byte) 111, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class15.method105(var4[0], (byte) 20);
                int var6 = class15.method105(var4[1], (byte) 20);
                this.field4833 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4833 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4741.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4741.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4741.glGetIntegerv(34018, var8, 0);
        this.field4788 = var8[0];
        this.field4741.glGetIntegerv(34929, var8, 0);
        this.field4862 = var8[0];
        this.field4741.glGetIntegerv(34930, var8, 0);
        this.field4789 = var8[0];
        if (this.field4788 < 2 || this.field4862 < 2 || this.field4789 < 2) {
            var1 |= 0x10;
        }
        this.field4848 = class2.field17 != null && class2.field17.startsWith("mac");
        this.field4797 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4835 = this.field4741.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4830 = this.field4741.isExtensionAvailable("GL_ARB_multisample");
        this.field4840 = this.field4741.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4741.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4741.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4782 = this.field4741.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4770 = this.field4741.isExtensionAvailable("GL_EXT_texture3D");
        this.field4796 = this.field4741.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4823 = this.field4741.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4858 = this.field4741.isExtensionAvailable("GL_ARB_texture_float");
        this.field4853 = false;
        this.field4791 = this.field4741.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "()Z", line = 686)
    public final boolean method2051() {
        return this.field4738.method2685(true);
    }

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "()V", line = 690)
    private final void method2052() {
        if (this.field4857 != 3) {
            this.field4857 = 3;
            this.method2137();
            this.method2144();
            this.field4793 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "()V", line = 700)
    private final void method2053() {
        if (this.field4850 == 0.0F) {
            this.field4787[10] = this.field4800;
            this.field4787[14] = this.field4808;
        } else {
            float var1 = this.field4821 / (this.field4850 + this.field4821);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4808 * (1.0F - var1) / this.field4850;
            this.field4787[10] = this.field4800 + var3;
            this.field4787[14] = this.field4808 * var2;
        }
        this.method2136();
    }

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "()V", line = 722)
    public final void method2054() {
        this.field4744.method2512(false, 0, false, 0);
        this.field4799 = false;
        this.method2028();
        this.method2036();
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)I", line = 728)
    public final int method2055(int arg0) {
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

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "()Z", line = 762)
    public final boolean method2056() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)V", line = 768)
    public final void method2057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2156();
        this.method2044(arg5);
        this.field4741.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4830) {
            this.field4741.glDisable(32925);
        }
        this.field4741.glBegin(2);
        this.field4741.glVertex2f(var7, var8);
        this.field4741.glVertex2f(var7, var10);
        this.field4741.glVertex2f(var9, var10);
        this.field4741.glVertex2f(var9, var8);
        this.field4741.glEnd();
        if (this.field4830) {
            this.field4741.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(F)V", line = 792)
    public final void method2058(float arg0) {
        if (this.field4847 != arg0) {
            this.field4847 = arg0;
            if (this.field4857 == 3) {
                this.method2137();
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lao;)V", line = 804)
    public final void method2059(class116 arg0) {
        this.field4841 = (class303) arg0;
        this.field4810.method1915(0, this.field4841);
        if (this.field4857 != 1) {
            this.method2144();
        }
    }

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "()Lao;", line = 813)
    public final class116 method2060() {
        return new class303();
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V", line = 816)
    public final void method2061(boolean arg0) {
        if (this.field4859 == arg0) {
            return;
        }
        if (arg0) {
            this.field4741.glEnable(2929);
        } else {
            this.field4741.glDisable(2929);
        }
        this.field4859 = arg0;
        this.field4793 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "()V", line = 832)
    private final void method2062() {
        try {
            this.field4737.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(F)V", line = 841)
    public final void method2063(float arg0) {
        if (this.field4844 != arg0) {
            this.field4844 = arg0;
            this.method2152();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 851)
    public final void method2064(boolean arg0) {
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII[BII)V", line = 857)
    public final void method2065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4852 == null || this.field4852.field1864 < arg2 || this.field4852.field1863 < arg3) {
            this.field4852 = class173.method1059(this, arg2, arg6, 6406, false, 6406, arg3, 28);
            this.field4852.method944(false, false);
            var10 = this.field4852.field2263;
            var11 = this.field4852.field2260;
        } else {
            this.field4852.method941(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4852.field2263 / (float) this.field4852.field1863;
            var11 = (float) arg2 * this.field4852.field2260 / (float) this.field4852.field1864;
        }
        this.method2076();
        this.method2186(this.field4852);
        this.method2044(arg8);
        this.field4741.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2115(arg5);
        this.method2109(34165, 34165);
        this.method2072(0, 34166, 768);
        this.method2072(2, 5890, 770);
        this.method2029(0, 34166, 770);
        this.method2029(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4741.glBegin(7);
        this.field4741.glTexCoord2f(0.0F, 0.0F);
        this.field4741.glVertex2f(var12, var13);
        this.field4741.glTexCoord2f(0.0F, var11);
        this.field4741.glVertex2f(var12, var15);
        this.field4741.glTexCoord2f(var10, var11);
        this.field4741.glVertex2f(var14, var15);
        this.field4741.glTexCoord2f(var10, 0.0F);
        this.field4741.glVertex2f(var14, var13);
        this.field4741.glEnd();
        this.method2072(0, 5890, 768);
        this.method2072(2, 34166, 770);
        this.method2029(0, 5890, 770);
        this.method2029(2, 34166, 770);
    }

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "()V", line = 908)
    private final void method2066() {
        this.field4741.glDepthMask(this.field4817 && this.field4776);
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "()V", line = 914)
    public final void method2067() {
        try {
            this.field4737.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I", line = 923)
    public final int method2068(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "()Z", line = 926)
    public final boolean method2069() {
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)V", line = 930)
    public final synchronized void method2070(int arg0, int arg1) {
        class231 var3 = new class231(arg1);
        var3.field5903 = (long) arg0;
        this.field4765.method2660((byte) -123, var3);
    }

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "()V", line = 937)
    private final void method2071() {
        if (this.field4846 && !this.field4775) {
            this.field4741.glEnable(2896);
        } else {
            this.field4741.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V", line = 945)
    public final void method2072(int arg0, int arg1, int arg2) {
        this.field4741.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4741.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z", line = 949)
    public final boolean method2073() {
        return !this.field4848;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V", line = 954)
    public final void method2074(int arg0, int arg1, int arg2, int arg3) {
        this.field4802 = arg0;
        this.field4842 = arg1;
        this.field4812 = arg2;
        this.field4809 = arg3;
        float var5 = (float) (-this.field4802 * this.field4819) / (float) this.field4812;
        float var6 = (float) (-this.field4842 * this.field4819) / (float) this.field4809;
        float var7 = (float) ((this.field4760 - this.field4802) * this.field4819) / (float) this.field4812;
        float var8 = (float) ((this.field4755 - this.field4842) * this.field4819) / (float) this.field4809;
        this.method2121(var5, var7, -var8, -var6, (float) this.field4819, (float) this.field4865);
        if (this.field4857 != 1) {
            this.method2126();
        }
        this.method2136();
        this.method2142();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V", line = 975)
    public final void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "()V", line = 979)
    public final void method2076() {
        if (this.field4793 == 2) {
            return;
        }
        this.method2048();
        this.method2157(false);
        this.method2134(false);
        this.method2061(false);
        this.method2184(false);
        this.method2127(-2);
        this.field4793 = 2;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V", line = 994)
    public final void method2077(boolean arg0) {
    }

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "()V", line = 996)
    public final void method2078() {
        this.field4741.glPopMatrix();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I[BIZ)Lcj;", line = 1001)
    public final class182 method2079(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class182) (this.field4835 && !arg3 || this.field4822 ? new class121(this, arg0, arg1, arg2, arg3) : new class13(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lqc;Lao;[Lnp;I)V", line = 1011)
    public final void method2080(class95[] arg0, class116 arg1, class206[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method602(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Lqc;Llc;Lao;[Lnp;I)V", line = 1022)
    public final void method2081(class95[] arg0, class125 arg1, class116 arg2, class206[] arg3, int arg4) {
        this.method2080(arg0, arg2, arg3, arg4);
        this.method2083(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "()V", line = 1026)
    private final void method2082() {
        this.field4841 = new class303();
        this.field4810 = new class303();
        this.field4792 = new class223[this.field4788];
        this.field4838 = new class140(this, 3553, 6408, 1, 1);
        this.field4777 = new class140(this, 3553, 6408, 1, 1);
        this.field4871 = new class140(this, 3553, 6408, 1, 1);
        this.field4829 = new class202(this);
        this.field4839 = new class202(this);
        this.field4815 = new class202(this);
        this.field4811 = new class202(this);
        this.field4828 = new class202(this);
        this.field4783 = new class202(this);
        this.field4867 = this.method2049(5123, (byte[]) null, 1024, true);
        if (this.field4791) {
            this.field4814 = new class89(this);
        }
        this.field4747.method1507(this);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Llc;)V", line = 1049)
    public final void method2083(class125 arg0) {
        this.field4747.method1509(this, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(III)V", line = 1054)
    public final void method2084(int arg0, int arg1, int arg2) {
        this.field4741.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V", line = 1061)
    public final synchronized void method2085(int arg0, int arg1) {
        class231 var3 = new class231(arg1);
        var3.field5903 = (long) arg0;
        this.field4763.method2660((byte) -120, var3);
    }

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "()Z", line = 1066)
    public final boolean method2086() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lam;Lam;Lam;Lam;)V", line = 1070)
    public final void method2087(class287 arg0, class287 arg1, class287 arg2, class287 arg3) {
        if (arg0 == null) {
            this.field4741.glDisableClientState(32884);
        } else {
            this.field4741.glEnableClientState(32884);
            arg0.method1817(-28301);
        }
        if (arg1 == null) {
            this.field4741.glDisableClientState(32885);
        } else {
            this.field4741.glEnableClientState(32885);
            arg1.method1814(-80);
        }
        if (arg2 == null) {
            this.field4741.glDisableClientState(32886);
        } else {
            this.field4741.glEnableClientState(32886);
            arg2.method1816(true);
        }
        if (arg3 == null) {
            this.field4741.glDisableClientState(32888);
        } else {
            this.field4741.glEnableClientState(32888);
            arg3.method1815(-113);
        }
    }

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "()V", line = 1104)
    private final void method2088() {
        if (this.field4801 <= this.field4786 && this.field4837 <= this.field4870) {
            this.field4741.glScissor(this.field4807 + this.field4801, this.field4861 + this.field4755 - this.field4870, this.field4786 - this.field4801, this.field4870 - this.field4837);
        } else {
            this.field4741.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "()Z", line = 1111)
    public final boolean method2089() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V", line = 1115)
    public final synchronized void method2090(int arg0) {
        class231 var2 = new class231(arg0);
        this.field4765.method2660((byte) -127, var2);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "()F", line = 1120)
    public final float method2091() {
        return this.field4821;
    }

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "()I", line = 1124)
    public final int method2092() {
        int var1 = this.field4873;
        this.field4873 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIII)V", line = 1131)
    public final void method2093(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2156();
        this.method2044(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4741.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4741.glBegin(1);
        this.field4741.glVertex2f(var6, var7);
        this.field4741.glVertex2f((float) arg2 + var6, var7);
        this.field4741.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFF)V", line = 1144)
    public final void method2094(float arg0, float arg1, float arg2, float arg3) {
        field4745[0] = arg0;
        field4745[1] = arg1;
        field4745[2] = arg2;
        field4745[3] = arg3;
        this.field4741.glTexEnvfv(8960, 8705, field4745, 0);
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V", line = 1152)
    public final synchronized void method2095(int arg0) {
        class231 var2 = new class231(arg0);
        this.field4767.method2660((byte) -124, var2);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lir;)V", line = 1156)
    public final void method2096(class217 arg0) {
        if (this.field4856 != arg0 && this.field4835) {
            this.field4741.glBindBufferARB(34963, arg0.method90());
            this.field4856 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V", line = 1167)
    public final void method2097(int arg0, int arg1) {
        if (this.field4819 == arg0 && this.field4865 == arg1) {
            return;
        }
        this.field4819 = arg0;
        this.field4865 = arg1;
        this.method2126();
        this.method2136();
        this.method2028();
    }

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "()V", line = 1179)
    private final void method2098() {
        this.field4741.glMatrixMode(5889);
        this.field4741.glLoadMatrixf(this.field4787, 0);
        this.field4741.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "()I", line = 1184)
    public final int method2099() {
        return this.field4865;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lir;III)V", line = 1187)
    public final void method2100(class217 arg0, int arg1, int arg2, int arg3) {
        this.method2096(arg0);
        arg0.method1355(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([I)V", line = 1195)
    public final void method2101(int[] arg0) {
        arg0[0] = this.field4801;
        arg0[1] = this.field4837;
        arg0[2] = this.field4786;
        arg0[3] = this.field4870;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V", line = 1204)
    public final void method2102(int arg0, int arg1) {
        if (this.field4824 == arg0 && this.field4790 == arg1) {
            return;
        }
        this.field4824 = arg0;
        this.field4790 = arg1;
        if (!this.field4799) {
            this.method2028();
            this.method2036();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lgq;)V", line = 1220)
    public final void method2103(class418 arg0) {
        if (this.field4757 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4757 >= 0) {
            this.field4759[this.field4757].method550();
        }
        this.field4750 = this.field4759[++this.field4757] = arg0;
        this.field4750.method549();
    }

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "()V", line = 1232)
    public final void method2104() {
        this.field4760 = this.field4746.getWidth();
        this.field4755 = this.field4746.getHeight();
        this.field4741.glViewport(this.field4807, this.field4861, this.field4760, this.field4755);
        this.method2126();
        this.method2034();
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)Lqm;", line = 1239)
    public final class288 method2105(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILsn;II)V", line = 1244)
    public final void method2106(int arg0, class449 arg1, int arg2, int arg3) {
        class221 var5 = (class221) arg1;
        class173 var6 = var5.field3143;
        this.method2076();
        this.method2186(var5.field3143);
        this.method2044(1);
        this.method2109(7681, 8448);
        this.method2072(0, 34167, 768);
        float var7 = var6.field2260 / (float) var6.field2264;
        float var8 = var6.field2263 / (float) var6.field2261;
        this.field4741.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4741.glBegin(7);
        this.field4741.glTexCoord2f((float) (this.field4801 - arg2) * var7, (float) (this.field4837 - arg3) * var8);
        this.field4741.glVertex2i(this.field4801, this.field4837);
        this.field4741.glTexCoord2f((float) (this.field4801 - arg2) * var7, (float) (this.field4870 - arg3) * var8);
        this.field4741.glVertex2i(this.field4801, this.field4870);
        this.field4741.glTexCoord2f((float) (this.field4786 - arg2) * var7, (float) (this.field4870 - arg3) * var8);
        this.field4741.glVertex2i(this.field4786, this.field4870);
        this.field4741.glTexCoord2f((float) (this.field4786 - arg2) * var7, (float) (this.field4837 - arg3) * var8);
        this.field4741.glVertex2i(this.field4786, this.field4837);
        this.field4741.glEnd();
        this.method2072(0, 5890, 768);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FF)V", line = 1272)
    public final void method2107(float arg0, float arg1) {
        if (this.field4821 == arg0 && this.field4850 == arg1) {
            return;
        }
        this.field4821 = arg0;
        this.field4850 = arg1;
        this.method2053();
        this.method2136();
        if (this.field4857 == 3) {
            this.method2137();
        } else if (this.field4857 == 2) {
            this.method2098();
        }
    }

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "()V", line = 1291)
    public final void method2108() {
        if (this.field4738.method2685(true)) {
            this.field4739.method2334(this.field4738);
            this.field4742.method1973(3553);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)V", line = 1307)
    public final void method2109(int arg0, int arg1) {
        if (this.field4864 != 0) {
            this.field4741.glTexEnvi(8960, 34161, arg0);
            this.field4741.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4818 != arg0) {
            this.field4741.glTexEnvi(8960, 34161, arg0);
            this.field4818 = arg0;
            var3 = true;
        }
        if (this.field4825 != arg1) {
            this.field4741.glTexEnvi(8960, 34162, arg1);
            this.field4825 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4793 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "()I", line = 1339)
    public final int method2110() {
        return 4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V", line = 1342)
    public final void method2111(int arg0, boolean arg1) {
        this.method2175(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "()Z", line = 1345)
    public final boolean method2112() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1349)
    public final void method2113(Rectangle[] arg0, int arg1) {
        this.method2067();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V", line = 1354)
    public final void method2114(int arg0, int arg1, int arg2) {
        this.field4799 = true;
        this.field4813 = arg1;
        this.field4781 = arg2;
        this.method2028();
        this.method2036();
        this.field4744.method2512(false, 3, false, 0);
        this.field4744.method2515(true, arg0, false);
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V", line = 1363)
    public final void method2115(int arg0) {
        field4745[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4745[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4745[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4745[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4741.glTexEnvfv(8960, 8705, field4745, 0);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIII)V", line = 1372)
    public final void method2116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "()V", line = 1375)
    public final void method2117() {
        if (this.field4793 == 4) {
            return;
        }
        this.method2048();
        this.method2157(false);
        this.method2134(false);
        this.method2061(false);
        this.method2184(false);
        this.method2127(-2);
        this.method2044(1);
        this.method2171(1);
        this.field4793 = 4;
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V", line = 1394)
    public final void method2118(int arg0) {
        this.method2044(0);
        this.field4741.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4741.glClear(16384);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)[I", line = 1403)
    public final int[] method2119(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4741.glReadPixels(arg0, this.field4755 - arg1 - var6, arg2, 1, 32993, this.field4869, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 1416)
    public final void method2120(int arg0) {
        this.method2062();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFFF)V", line = 1421)
    private final void method2121(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field4787;
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
        var8[10] = this.field4800 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field4808 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method2053();
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "()Z", line = 1445)
    public final boolean method2122() {
        return this.field4738.method2214();
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V", line = 1450)
    public final void method2123(int arg0, int arg1, int arg2, int arg3) {
        this.field4739.method2341(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)I", line = 1453)
    public final int method2124(int arg0) {
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

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(FF)V", line = 1466)
    public final void method2125(float arg0, float arg1) {
        this.field4820 = arg0;
        this.field4860 = arg1;
        if (!this.field4799) {
            this.method2028();
        }
    }

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "()V", line = 1474)
    public final void method2126() {
        if (this.field4857 != 0) {
            this.field4857 = 0;
            this.field4793 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V", line = 1482)
    public final void method2127(int arg0) {
        this.method2111(arg0, true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V", line = 1487)
    public final void method2128(float arg0, float arg1, float arg2) {
        class334.field4932 = arg0;
        class334.field4944 = arg1;
        class334.field4940 = arg2;
    }

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "()Lsg;", line = 1492)
    public final class266 method2129() {
        return this.field4771 == null ? null : this.field4771.method292(-1457);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "()V", line = 1497)
    public final void method2130() {
    }

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "()V", line = 1500)
    private final void method2131() {
        field4745[0] = this.field4795 * this.field4769;
        field4745[1] = this.field4834 * this.field4769;
        field4745[2] = this.field4832 * this.field4769;
        field4745[3] = 1.0F;
        this.field4741.glLightfv(16384, 4609, field4745, 0);
        field4745[0] = -this.field4826 * this.field4795;
        field4745[1] = -this.field4826 * this.field4834;
        field4745[2] = -this.field4826 * this.field4832;
        field4745[3] = 1.0F;
        this.field4741.glLightfv(16385, 4609, field4745, 0);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I", line = 1512)
    public final int method2132(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 1517)
    public final void method2133(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V", line = 1522)
    public final void method2134(boolean arg0) {
        if (this.field4846 != arg0) {
            this.field4846 = arg0;
            this.method2071();
            this.field4793 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V", line = 1536)
    public final synchronized void method2135(int arg0) {
        class231 var2 = new class231(arg0);
        this.field4768.method2660((byte) -124, var2);
    }

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "()V", line = 1540)
    private final void method2136() {
        this.field4855 = (this.field4787[14] - (float) this.field4865) / this.field4787[10];
        this.field4780 = (float) this.field4865 - this.field4850;
    }

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "()V", line = 1545)
    private final void method2137() {
        float var1 = (float) (-this.field4802) * this.field4847 / (float) this.field4812;
        float var2 = (float) (-this.field4842) * this.field4847 / (float) this.field4809;
        float var3 = (float) (this.field4760 - this.field4802) * this.field4847 / (float) this.field4812;
        float var4 = (float) (this.field4755 - this.field4842) * this.field4847 / (float) this.field4809;
        this.field4741.glMatrixMode(5889);
        this.field4741.glLoadIdentity();
        this.field4741.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4819 - this.field4850), (double) ((float) this.field4865 - this.field4850));
        this.field4741.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqm;)V", line = 1559)
    public final void method2138(class288 arg0) {
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFFFFF)V", line = 1565)
    public final void method2139(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4851 != arg0;
        if (var7 || this.field4769 != arg1 || this.field4826 != arg2) {
            this.field4851 = arg0;
            this.field4769 = arg1;
            this.field4826 = arg2;
            if (var7) {
                this.field4795 = (float) (this.field4851 & 0xFF0000) / 1.671168E7F;
                this.field4834 = (float) (this.field4851 & 0xFFFF) / 65535.0F;
                this.field4832 = (float) (this.field4851 & 0xFF) / 255.0F;
                this.method2152();
            }
            this.method2131();
        }
        if (this.field4845[0] == arg3 && this.field4845[1] == arg4 && this.field4845[2] == arg5) {
            return;
        }
        this.field4845[0] = arg3;
        this.field4845[1] = arg4;
        this.field4845[2] = arg5;
        this.field4806[0] = -arg3;
        this.field4806[1] = -arg4;
        this.field4806[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4805[0] = arg3 * var8;
        this.field4805[1] = arg4 * var8;
        this.field4805[2] = arg5 * var8;
        this.field4774[0] = -this.field4805[0];
        this.field4774[1] = -this.field4805[1];
        this.field4774[2] = -this.field4805[2];
        this.method2189();
        this.field4804 = (int) (arg3 * 256.0F / arg4);
        this.field4831 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "()V", line = 1605)
    public final void method2140() {
        if (this.field4793 == 8) {
            return;
        }
        this.method2187();
        this.method2157(true);
        this.method2061(true);
        this.method2184(true);
        this.method2044(1);
        this.method2171(1);
        this.field4793 = 8;
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)I", line = 1618)
    public final int method2141(int arg0) {
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

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "()V", line = 1633)
    private final void method2142() {
        this.field4849 = (float) (this.field4801 - this.field4802);
        this.field4798 = (float) (this.field4786 - this.field4802);
        this.field4779 = (float) (this.field4837 - this.field4842);
        this.field4778 = (float) (this.field4870 - this.field4842);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[I)V", line = 1640)
    public final void method2143(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4841.field4341 + (float) arg0 * this.field4841.field4343 + (float) arg1 * this.field4841.field4346 + this.field4841.field4347;
        if ((var5 < (float) this.field4819) || (var5 > (float) this.field4865)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4841.field4337 + (float) arg0 * this.field4841.field4344 + (float) arg1 * this.field4841.field4342 + this.field4841.field4349) * (float) this.field4812 / var5);
        int var7 = (int) (((float) arg2 * this.field4841.field4345 + (float) arg0 * this.field4841.field4338 + (float) arg1 * this.field4841.field4339 + this.field4841.field4340) * (float) this.field4809 / var5);
        if ((float) var6 >= this.field4849 && (float) var6 <= this.field4798 && (float) var7 >= this.field4779 && (float) var7 <= this.field4778) {
            arg3[0] = (int) ((float) var6 - this.field4849);
            arg3[1] = (int) ((float) var7 - this.field4779);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "()V", line = 1664)
    private final void method2144() {
        this.field4741.glLoadIdentity();
        this.field4741.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4741.glMultMatrixf(this.field4841.method1914((byte) 106), 0);
        this.method2189();
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(IIIIII)Z", line = 1672)
    public final boolean method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4841.field4341 + (float) arg0 * this.field4841.field4343 + (float) arg1 * this.field4841.field4346 + this.field4841.field4347;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4841.field4341 + (float) arg3 * this.field4841.field4343 + (float) arg4 * this.field4841.field4346 + this.field4841.field4347;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4819) || !(var8 < (float) this.field4819)) || !(!(var7 > (float) this.field4865) || !(var8 > (float) this.field4865))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4841.field4337 + (float) arg0 * this.field4841.field4344 + (float) arg1 * this.field4841.field4342 + this.field4841.field4349) * (float) this.field4812 / var7);
        int var10 = (int) (((float) arg5 * this.field4841.field4337 + (float) arg3 * this.field4841.field4344 + (float) arg4 * this.field4841.field4342 + this.field4841.field4349) * (float) this.field4812 / var8);
        if ((float) var9 < this.field4849 && (float) var10 < this.field4849 || (float) var9 > this.field4798 && (float) var10 > this.field4798) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4841.field4345 + (float) arg0 * this.field4841.field4338 + (float) arg1 * this.field4841.field4339 + this.field4841.field4340) * (float) this.field4809 / var7);
            int var12 = (int) (((float) arg5 * this.field4841.field4345 + (float) arg3 * this.field4841.field4338 + (float) arg4 * this.field4841.field4339 + this.field4841.field4340) * (float) this.field4809 / var8);
            return (!((float) var11 < this.field4779) || !((float) var12 < this.field4779)) && (!((float) var11 > this.field4778) || !((float) var12 > this.field4778));
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "()Z", line = 1702)
    public final boolean method2146() {
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "()Z", line = 1707)
    public final boolean method2147() {
        return this.field4830;
    }

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "()V", line = 1711)
    private final void method2148() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4737.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class404.method2628(-94, 1000L);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(FFF)V", line = 1732)
    private final void method2149(float arg0, float arg1, float arg2) {
        this.field4741.glMatrixMode(5890);
        if (this.field4827) {
            this.field4741.glLoadIdentity();
        }
        this.field4741.glTranslatef(arg0, arg1, arg2);
        this.field4741.glMatrixMode(5888);
        this.field4827 = true;
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z", line = 1741)
    public final boolean method2150() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lfe;)V", line = 1747)
    public final void method2151(int arg0, class403[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class403 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4736[0] = (float) var4.field5994;
            field4736[1] = (float) var4.field5984;
            field4736[2] = (float) var4.field5990;
            field4736[3] = 1.0F;
            this.field4741.glLightfv(var5, 4611, field4736, 0);
            int var6 = var4.field5988;
            float var7 = var4.field5986 / 255.0F;
            field4736[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4736[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4736[2] = (float) (var6 & 0xFF) * var7;
            this.field4741.glLightfv(var5, 4609, field4736, 0);
            this.field4741.glLightf(var5, 4617, 1.0F / (float) (var4.field5991 * var4.field5991));
            this.field4741.glEnable(var5);
        }
        while (var3 < this.field4772) {
            this.field4741.glDisable(var3 + 16386);
            var3++;
        }
        this.field4772 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "()V", line = 1784)
    private final void method2152() {
        field4745[0] = this.field4844 * this.field4795;
        field4745[1] = this.field4844 * this.field4834;
        field4745[2] = this.field4844 * this.field4832;
        field4745[3] = 1.0F;
        this.field4741.glLightModelfv(2899, field4745, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lgm;", line = 1792)
    public final class337 method2153(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class448(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "()V", line = 1795)
    public final void method2154() {
        if (this.field4793 == 16) {
            return;
        }
        this.method2052();
        this.method2157(true);
        this.method2061(true);
        this.method2184(true);
        this.method2044(1);
        this.method2171(1);
        this.field4793 = 16;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V", line = 1810)
    public final void method2155(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4760) {
            arg2 = this.field4760;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4755) {
            arg3 = this.field4755;
        }
        this.field4801 = arg0;
        this.field4837 = arg1;
        this.field4786 = arg2;
        this.field4870 = arg3;
        this.field4741.glEnable(3089);
        this.method2142();
        this.method2088();
    }

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "()V", line = 1831)
    private final void method2156() {
        if (this.field4793 == 1) {
            return;
        }
        this.method2048();
        this.method2157(false);
        this.method2134(false);
        this.method2061(false);
        this.method2184(false);
        this.method2186((class223) null);
        this.method2127(-2);
        this.method2171(0);
        this.field4793 = 1;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)V", line = 1846)
    public final void method2157(boolean arg0) {
        if (this.field4843 != arg0) {
            this.field4843 = arg0;
            this.method2036();
            this.field4793 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lqa;", line = 1855)
    public final class243 method2158(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class178(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Lgq;)V", line = 1858)
    public final void method2159(class418 arg0) {
        if (this.field4757 < 0 || this.field4759[this.field4757] != arg0) {
            throw new RuntimeException();
        }
        this.field4759[this.field4757--] = null;
        arg0.method550();
        if (this.field4757 >= 0) {
            this.field4750 = this.field4759[this.field4757];
            this.field4750.method549();
        }
    }

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "()V", line = 1871)
    private final void method2160() {
        if (this.field4827) {
            this.field4741.glMatrixMode(5890);
            this.field4741.glLoadIdentity();
            this.field4741.glMatrixMode(5888);
            this.field4827 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V", line = 1881)
    public final void method2161(int arg0) {
        this.method2148();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqc;Llc;Lao;Lnp;I)V", line = 1885)
    public final void method2162(class95 arg0, class125 arg1, class116 arg2, class206 arg3, int arg4) {
        arg0.method602(arg2, arg3, arg4);
        this.method2083(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(IIII)V", line = 1891)
    public final void method2163(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4801 < arg0) {
            this.field4801 = arg0;
        }
        if (this.field4786 > arg2) {
            this.field4786 = arg2;
        }
        if (this.field4837 < arg1) {
            this.field4837 = arg1;
        }
        if (this.field4870 > arg3) {
            this.field4870 = arg3;
        }
        this.field4741.glEnable(3089);
        this.method2142();
        this.method2088();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lm;IIII)Lqc;", line = 1908)
    public final class95 method2164(class180 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class202(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "()Z", line = 1911)
    public final boolean method2165() {
        return this.field4744.method2513((byte) 126, 3);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ln;Z)Lqa;", line = 1916)
    public final class243 method2166(class25 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field442 * arg0.field438];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field441 == null) {
            for (int var8 = 0; var8 < arg0.field438; var8++) {
                for (int var9 = 0; var9 < arg0.field442; var9++) {
                    int var10 = arg0.field443[arg0.field445[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field438; var6++) {
                for (int var7 = 0; var7 < arg0.field442; var7++) {
                    var3[var5++] = arg0.field441[var4] << 24 | arg0.field443[arg0.field445[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class243 var11 = this.method2158(var3, 0, arg0.field442, arg0.field442, arg0.field438);
        var11.method1089(arg0.field444, arg0.field437, arg0.field439, arg0.field440);
        return var11;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V", line = 1973)
    public final void method2167(boolean arg0) {
        this.field4776 = arg0;
        this.method2066();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lda;)V", line = 1977)
    public final void method2168(class303 arg0) {
        this.field4741.glPushMatrix();
        this.field4741.glMultMatrixf(arg0.method1914((byte) 127), 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lsn;", line = 1982)
    public final class449 method2169(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class221.method1376(6406, this, arg2, arg3, arg1, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "()V", line = 1988)
    public final void method2170() {
        int var1 = this.field4801;
        int var2 = this.field4786;
        int var3 = this.field4837;
        int var4 = this.field4870;
        this.method2034();
        this.field4741.glReadBuffer(1028);
        this.field4741.glDrawBuffer(1029);
        this.method2126();
        this.method2157(false);
        this.method2134(false);
        this.method2061(false);
        this.method2184(false);
        this.method2186((class223) null);
        this.method2127(-2);
        this.method2171(0);
        this.method2044(0);
        this.field4741.glMatrixMode(5889);
        this.field4741.glLoadIdentity();
        this.field4741.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4741.glMatrixMode(5888);
        this.field4741.glLoadIdentity();
        this.field4741.glRasterPos2i(0, 0);
        this.field4741.glCopyPixels(0, 0, this.field4760, this.field4755, 6144);
        this.field4741.glFlush();
        this.field4741.glReadBuffer(1029);
        this.field4741.glDrawBuffer(1029);
        this.method2155(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V", line = 2021)
    public final void method2171(int arg0) {
        if (arg0 == 0) {
            this.method2109(7681, 7681);
        } else if (arg0 == 1) {
            this.method2109(8448, 8448);
        } else if (arg0 == 2) {
            this.method2109(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "()Z", line = 2035)
    public final boolean method2172() {
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lqa;", line = 2038)
    public final class243 method2173(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class178(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "()V", line = 2043)
    public final void method2174() {
        this.field4739.method2337();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZZ)V", line = 2046)
    public final void method2175(int arg0, boolean arg1, boolean arg2) {
        if (this.field4803 != arg0) {
            if (arg0 < 0) {
                this.method2160();
                this.method2186((class223) null);
                if (!this.field4799) {
                    this.field4744.method2512(arg1, 0, arg2, 0);
                }
            } else {
                class140 var4 = this.field4742.method1972(false, arg0);
                class175 var5 = this.field4740.method1760(-19907, arg0);
                if (var5.field2282 == 0 && var5.field2276 == 0) {
                    this.method2160();
                } else {
                    int var6 = var5.field2281 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2149((float) (this.field4761 % var7 * var5.field2282) / (float) var7, (float) (this.field4761 % var7 * var5.field2276) / (float) var7, 0.0F);
                }
                if (this.field4799) {
                    this.field4744.method2512(arg1, 3, arg2, 0);
                    this.method2186(var4);
                } else {
                    this.field4744.method2512(arg1, var5.field2293, arg2, 0);
                    this.field4744.method2515(false, var5.field2279, false);
                    if (!this.field4744.method2514(0, var4)) {
                        this.method2186(var4);
                    }
                }
            }
            this.field4803 = arg0;
        }
        this.field4793 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z", line = 2097)
    public final boolean method2176() {
        if (!this.field4738.method2685(true)) {
            if (!this.field4739.method2338(this.field4738)) {
                return false;
            }
            this.field4742.method1973(3553);
        }
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "()F", line = 2110)
    public final float method2177() {
        return this.field4850;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)Lj;", line = 2113)
    public final class269 method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4823 ? new class36(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lfi;[Ln;Z)Ldr;", line = 2116)
    public final class213 method2179(class165 arg0, class25[] arg1, boolean arg2) {
        return new class209(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIIII)V", line = 2121)
    public final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4741.glLineWidth((float) arg5);
        this.method2030(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4741.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(II)V", line = 2127)
    public final synchronized void method2181(int arg0, int arg1) {
        class231 var3 = new class231(arg1);
        var3.field5903 = (long) arg0;
        this.field4764.method2660((byte) -128, var3);
    }

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "()I", line = 2133)
    public final int method2182() {
        return this.field4819;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 2141)
    public final void method550() {
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "()Z", line = 2143)
    public final boolean method2183() {
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(Z)V", line = 2147)
    public final void method2184(boolean arg0) {
        if (this.field4817 != arg0) {
            this.field4817 = arg0;
            this.method2066();
            this.field4793 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(Z)V", line = 2157)
    public final void method2185(boolean arg0) {
        if (this.field4775 != arg0) {
            this.field4775 = arg0;
            this.method2071();
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V", line = 2166)
    public final void method549() {
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ldg;)V", line = 2169)
    public final void method2186(class223 arg0) {
        class223 var2 = this.field4792[this.field4864];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4741.glDisable(var2.field3156);
            } else {
                if (var2 == null) {
                    this.field4741.glEnable(arg0.field3156);
                } else if (arg0.field3156 != var2.field3156) {
                    this.field4741.glDisable(var2.field3156);
                    this.field4741.glEnable(arg0.field3156);
                }
                this.field4741.glBindTexture(arg0.field3156, arg0.method1384());
            }
            this.field4792[this.field4864] = arg0;
        }
        this.field4793 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "()V", line = 2206)
    public final void method2187() {
        if (this.field4857 != 2) {
            this.field4857 = 2;
            this.method2098();
            this.method2144();
            this.field4793 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V", line = 2219)
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2156();
        this.method2044(arg5);
        this.field4741.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4830) {
            this.field4741.glDisable(32925);
        }
        this.field4741.glBegin(7);
        this.field4741.glVertex2f(var7, var8);
        this.field4741.glVertex2f(var7, var10);
        this.field4741.glVertex2f(var9, var10);
        this.field4741.glVertex2f(var9, var8);
        this.field4741.glEnd();
        if (this.field4830) {
            this.field4741.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfl;IILud;)V", line = 2555)
    public class330(Canvas arg0, class386 arg1, int arg2, int arg3, class2 arg4) {
        this.field4746 = arg0;
        this.field4740 = arg1;
        this.field6424 = arg2;
        int var6 = 0;
        while (!this.field4746.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class404.method2628(-40, 1000L);
        }
        this.field4746.setIgnoreRepaint(true);
        try {
            if (field4743 == null || !field4743) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4743 = Boolean.TRUE;
                } else {
                    class296 var7 = arg4.method5(this.getClass(), 10);
                    while (var7.field4259 == 0) {
                        class404.method2628(-31, 100L);
                    }
                    if (var7.field4259 == 1) {
                        field4743 = Boolean.TRUE;
                    }
                }
            }
            if (field4743 == null || !field4743) {
                throw new RuntimeException("");
            }
            this.field4737 = new context();
            if (!this.field4737.choosePixelFormat(this.field4746, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4737.createContext()) {
                this.method2148();
                this.field4741 = this.field4737.getGL();
                int var8 = this.method2050();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4869 = this.field4797 ? 33639 : 5121;
                String var9 = this.field4866.toLowerCase();
                String var10 = this.field4794.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class369.method2436((byte) 109, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class79.method500(var16.substring(1, 3), (byte) -38)) {
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
                                    if (var16.length() >= 4 && class79.method500(var16.substring(0, 4), (byte) -38)) {
                                        var11 = class15.method105(var16.substring(0, 4), (byte) 20);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4835 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4770 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4858 = false;
                    }
                    this.field4796 &= this.field4741.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4822 = this.field4835;
                }
                if (var9.contains("intel")) {
                    this.field4791 = false;
                }
                if (this.field4835) {
                    try {
                        int[] var18 = new int[1];
                        this.field4741.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2103(this);
                this.method2104();
                this.method2082();
                new class201(this);
                this.field4742 = new class317(this, this.field4740);
                class203.method1285(-32, true, true);
                this.field4754 = true;
                this.field4744 = new class382(this);
                this.field4739 = new class356(this);
                this.field4738 = new class334(this);
                this.method2038();
                this.field4741.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4737.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class404.method2628(-40, 100L);
                    }
                }
                this.field4741.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method2025();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "()V", line = 2252)
    public final void method2189() {
        this.field4741.glLightfv(16384, 4611, this.field4845, 0);
        this.field4741.glLightfv(16385, 4611, this.field4806, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)V", line = 2258)
    public final void method2190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2156();
        this.method2044(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4741.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4741.glBegin(1);
        this.field4741.glVertex2f(var6, var7);
        this.field4741.glVertex2f(var6, (float) arg2 + var7);
        this.field4741.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()I", line = 2296)
    public final int method554() {
        return this.field4755;
    }
}
