import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class332 extends class174 implements class47 {

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Lgo;")
    private class374 field4741 = new class374();

    @OriginalMember(owner = "client!po", name = "D", descriptor = "Lvr;")
    private class71 field4753 = new class18();

    @OriginalMember(owner = "client!po", name = "G", descriptor = "I")
    private int field4756 = -1;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "Z")
    private boolean field4755 = false;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "I")
    public int field4754 = 8;

    @OriginalMember(owner = "client!po", name = "N", descriptor = "[Lkl;")
    private class47[] field4763 = new class47[4];

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public int field4762 = 3;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "Lvn;")
    private class169 field4759 = new class169();

    @OriginalMember(owner = "client!po", name = "R", descriptor = "Lvn;")
    private class169 field4767 = new class169();

    @OriginalMember(owner = "client!po", name = "S", descriptor = "Lvn;")
    private class169 field4768 = new class169();

    @OriginalMember(owner = "client!po", name = "T", descriptor = "Lvn;")
    private class169 field4769 = new class169();

    @OriginalMember(owner = "client!po", name = "U", descriptor = "Lvn;")
    private class169 field4770 = new class169();

    @OriginalMember(owner = "client!po", name = "V", descriptor = "Lvn;")
    private class169 field4771 = new class169();

    @OriginalMember(owner = "client!po", name = "W", descriptor = "Lvn;")
    private class169 field4772 = new class169();

    @OriginalMember(owner = "client!po", name = "pb", descriptor = "I")
    public int field4791 = 50;

    @OriginalMember(owner = "client!po", name = "ub", descriptor = "I")
    private int field4796 = 0;

    @OriginalMember(owner = "client!po", name = "ab", descriptor = "I")
    public int field4776 = -1;

    @OriginalMember(owner = "client!po", name = "nb", descriptor = "I")
    private int field4789 = -1;

    @OriginalMember(owner = "client!po", name = "zb", descriptor = "Z")
    private boolean field4801 = true;

    @OriginalMember(owner = "client!po", name = "mb", descriptor = "F")
    public float field4788 = 1.0F;

    @OriginalMember(owner = "client!po", name = "cc", descriptor = "I")
    private int field4830 = 0;

    @OriginalMember(owner = "client!po", name = "Db", descriptor = "I")
    public int field4805 = -1;

    @OriginalMember(owner = "client!po", name = "Z", descriptor = "[F")
    private float[] field4775 = new float[4];

    @OriginalMember(owner = "client!po", name = "gc", descriptor = "F")
    private float field4834 = 1.0F;

    @OriginalMember(owner = "client!po", name = "Nb", descriptor = "I")
    private int field4815 = 0;

    @OriginalMember(owner = "client!po", name = "Pb", descriptor = "I")
    public int field4817 = -1;

    @OriginalMember(owner = "client!po", name = "ec", descriptor = "I")
    public int field4832 = 512;

    @OriginalMember(owner = "client!po", name = "tc", descriptor = "F")
    public float field4847 = 3584.0F;

    @OriginalMember(owner = "client!po", name = "jb", descriptor = "I")
    private int field4785 = 0;

    @OriginalMember(owner = "client!po", name = "Xb", descriptor = "[F")
    public float[] field4825 = new float[4];

    @OriginalMember(owner = "client!po", name = "lb", descriptor = "I")
    private int field4787 = 8448;

    @OriginalMember(owner = "client!po", name = "ac", descriptor = "I")
    public int field4828 = 0;

    @OriginalMember(owner = "client!po", name = "Eb", descriptor = "I")
    public int field4806 = 3584;

    @OriginalMember(owner = "client!po", name = "ic", descriptor = "I")
    public int field4836 = 512;

    @OriginalMember(owner = "client!po", name = "bc", descriptor = "I")
    private int field4829 = -1;

    @OriginalMember(owner = "client!po", name = "ob", descriptor = "F")
    public float field4790 = -1.0F;

    @OriginalMember(owner = "client!po", name = "vc", descriptor = "F")
    private float field4849 = 0.0F;

    @OriginalMember(owner = "client!po", name = "Tb", descriptor = "F")
    public float field4821 = 3584.0F;

    @OriginalMember(owner = "client!po", name = "zc", descriptor = "F")
    public float field4853 = 1.0F;

    @OriginalMember(owner = "client!po", name = "tb", descriptor = "I")
    private int field4795 = 0;

    @OriginalMember(owner = "client!po", name = "Kc", descriptor = "I")
    public int field4864 = 0;

    @OriginalMember(owner = "client!po", name = "Oc", descriptor = "F")
    private float field4868 = 1.0F;

    @OriginalMember(owner = "client!po", name = "Rb", descriptor = "[F")
    private float[] field4819 = new float[4];

    @OriginalMember(owner = "client!po", name = "sc", descriptor = "I")
    private int field4846 = 0;

    @OriginalMember(owner = "client!po", name = "Gc", descriptor = "F")
    public float field4860 = -1.0F;

    @OriginalMember(owner = "client!po", name = "Qc", descriptor = "[F")
    private float[] field4870 = new float[16];

    @OriginalMember(owner = "client!po", name = "Gb", descriptor = "[F")
    private float[] field4808 = new float[4];

    @OriginalMember(owner = "client!po", name = "Uc", descriptor = "I")
    private int field4874 = 0;

    @OriginalMember(owner = "client!po", name = "Ib", descriptor = "I")
    private int field4810 = 8448;

    @OriginalMember(owner = "client!po", name = "Ab", descriptor = "F")
    public float field4802 = 1.0F;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4749;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Lbm;")
    public class60 field4744;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "Ljaggl/context;")
    private context field4751;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "Ljaggl/opengl;")
    public opengl field4752;

    @OriginalMember(owner = "client!po", name = "db", descriptor = "Z")
    public boolean field4779;

    @OriginalMember(owner = "client!po", name = "Dc", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!po", name = "Cc", descriptor = "Ljava/lang/String;")
    private String field4856;

    @OriginalMember(owner = "client!po", name = "fb", descriptor = "Ljava/lang/String;")
    private String field4781;

    @OriginalMember(owner = "client!po", name = "yc", descriptor = "Z")
    private boolean field4852;

    @OriginalMember(owner = "client!po", name = "hb", descriptor = "Z")
    public boolean field4783;

    @OriginalMember(owner = "client!po", name = "xc", descriptor = "Z")
    public boolean field4851;

    @OriginalMember(owner = "client!po", name = "jc", descriptor = "Z")
    public boolean field4837;

    @OriginalMember(owner = "client!po", name = "Pc", descriptor = "Z")
    private boolean field4869;

    @OriginalMember(owner = "client!po", name = "Ic", descriptor = "Z")
    public boolean field4862;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "Lun;")
    public class243 field4750;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "Lpf;")
    private class347 field4748;

    @OriginalMember(owner = "client!po", name = "v", descriptor = "Lub;")
    private class15 field4745;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lcb;")
    private class304 field4743;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "[F")
    private static float[] field4740 = new float[4];

    @OriginalMember(owner = "client!po", name = "w", descriptor = "[F")
    private static float[] field4746 = new float[4];

    @OriginalMember(owner = "client!po", name = "s", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4742 = Boolean.FALSE;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "[I")
    private static int[] field4747 = new int[1000];

    @OriginalMember(owner = "client!po", name = "eb", descriptor = "F")
    public float field4780;

    @OriginalMember(owner = "client!po", name = "kb", descriptor = "F")
    private float field4786;

    @OriginalMember(owner = "client!po", name = "Fb", descriptor = "F")
    public float field4807;

    @OriginalMember(owner = "client!po", name = "Lb", descriptor = "F")
    public float field4813;

    @OriginalMember(owner = "client!po", name = "Vb", descriptor = "F")
    public float field4823;

    @OriginalMember(owner = "client!po", name = "Wb", descriptor = "F")
    private float field4824;

    @OriginalMember(owner = "client!po", name = "Yb", descriptor = "F")
    public float field4826;

    @OriginalMember(owner = "client!po", name = "Zb", descriptor = "F")
    public float field4827;

    @OriginalMember(owner = "client!po", name = "Ac", descriptor = "F")
    private float field4854;

    @OriginalMember(owner = "client!po", name = "Fc", descriptor = "F")
    public float field4859;

    @OriginalMember(owner = "client!po", name = "Jc", descriptor = "F")
    public float field4863;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "I")
    public int field4757;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "I")
    public int field4758;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!po", name = "O", descriptor = "I")
    public int field4764;

    @OriginalMember(owner = "client!po", name = "P", descriptor = "I")
    public int field4765;

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "I")
    private int field4766;

    @OriginalMember(owner = "client!po", name = "cb", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!po", name = "rb", descriptor = "I")
    private int field4793;

    @OriginalMember(owner = "client!po", name = "sb", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!po", name = "Bb", descriptor = "I")
    private int field4803;

    @OriginalMember(owner = "client!po", name = "Mb", descriptor = "I")
    private int field4814;

    @OriginalMember(owner = "client!po", name = "dc", descriptor = "I")
    public int field4831;

    @OriginalMember(owner = "client!po", name = "nc", descriptor = "I")
    private int field4841;

    @OriginalMember(owner = "client!po", name = "oc", descriptor = "I")
    public int field4842;

    @OriginalMember(owner = "client!po", name = "pc", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!po", name = "Hc", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!po", name = "Rc", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!po", name = "Sc", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!po", name = "dd", descriptor = "I")
    private int field4883;

    @OriginalMember(owner = "client!po", name = "ed", descriptor = "I")
    private int field4884;

    @OriginalMember(owner = "client!po", name = "Vc", descriptor = "J")
    private long field4875;

    @OriginalMember(owner = "client!po", name = "xb", descriptor = "Lfc;")
    public class141 field4799;

    @OriginalMember(owner = "client!po", name = "Ub", descriptor = "Lfc;")
    public class141 field4822;

    @OriginalMember(owner = "client!po", name = "Yc", descriptor = "Lfc;")
    public class141 field4878;

    @OriginalMember(owner = "client!po", name = "Bc", descriptor = "Leo;")
    public class163 field4855;

    @OriginalMember(owner = "client!po", name = "bd", descriptor = "Leo;")
    private class163 field4881;

    @OriginalMember(owner = "client!po", name = "wc", descriptor = "Lan;")
    private class17 field4850;

    @OriginalMember(owner = "client!po", name = "X", descriptor = "Lnc;")
    public class18 field4773;

    @OriginalMember(owner = "client!po", name = "Lc", descriptor = "Lnc;")
    public class18 field4865;

    @OriginalMember(owner = "client!po", name = "qc", descriptor = "Lti;")
    private class254 field4844;

    @OriginalMember(owner = "client!po", name = "lc", descriptor = "Luf;")
    private class259 field4839;

    @OriginalMember(owner = "client!po", name = "Mc", descriptor = "Lpe;")
    private class363 field4866;

    @OriginalMember(owner = "client!po", name = "Wc", descriptor = "Lpe;")
    private class363 field4876;

    @OriginalMember(owner = "client!po", name = "cd", descriptor = "Lpe;")
    private class363 field4882;

    @OriginalMember(owner = "client!po", name = "qb", descriptor = "Ljn;")
    public class425 field4792;

    @OriginalMember(owner = "client!po", name = "yb", descriptor = "Ljn;")
    public class425 field4800;

    @OriginalMember(owner = "client!po", name = "Ob", descriptor = "Ljn;")
    public class425 field4816;

    @OriginalMember(owner = "client!po", name = "rc", descriptor = "Ljn;")
    public class425 field4845;

    @OriginalMember(owner = "client!po", name = "Ec", descriptor = "Ljn;")
    public class425 field4858;

    @OriginalMember(owner = "client!po", name = "Zc", descriptor = "Ljn;")
    public class425 field4879;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "Lkl;")
    private class47 field4760;

    @OriginalMember(owner = "client!po", name = "uc", descriptor = "Lib;")
    public class86 field4848;

    @OriginalMember(owner = "client!po", name = "Y", descriptor = "Z")
    private boolean field4774;

    @OriginalMember(owner = "client!po", name = "bb", descriptor = "Z")
    private boolean field4777;

    @OriginalMember(owner = "client!po", name = "gb", descriptor = "Z")
    private boolean field4782;

    @OriginalMember(owner = "client!po", name = "ib", descriptor = "Z")
    public boolean field4784;

    @OriginalMember(owner = "client!po", name = "vb", descriptor = "Z")
    public boolean field4797;

    @OriginalMember(owner = "client!po", name = "wb", descriptor = "Z")
    private boolean field4798;

    @OriginalMember(owner = "client!po", name = "Cb", descriptor = "Z")
    private boolean field4804;

    @OriginalMember(owner = "client!po", name = "Kb", descriptor = "Z")
    private boolean field4812;

    @OriginalMember(owner = "client!po", name = "Sb", descriptor = "Z")
    private boolean field4820;

    @OriginalMember(owner = "client!po", name = "fc", descriptor = "Z")
    private boolean field4833;

    @OriginalMember(owner = "client!po", name = "hc", descriptor = "Z")
    public boolean field4835;

    @OriginalMember(owner = "client!po", name = "kc", descriptor = "Z")
    public boolean field4838;

    @OriginalMember(owner = "client!po", name = "mc", descriptor = "Z")
    public boolean field4840;

    @OriginalMember(owner = "client!po", name = "Nc", descriptor = "Z")
    private boolean field4867;

    @OriginalMember(owner = "client!po", name = "Tc", descriptor = "Z")
    private boolean field4873;

    @OriginalMember(owner = "client!po", name = "Xc", descriptor = "Z")
    private boolean field4877;

    @OriginalMember(owner = "client!po", name = "ad", descriptor = "Z")
    private boolean field4880;

    @OriginalMember(owner = "client!po", name = "Jb", descriptor = "[Lpe;")
    private class363[] field4811;

    @OriginalMember(owner = "client!po", name = "Qb", descriptor = "[Lfl;")
    private class439[] field4818;

    @OriginalMember(owner = "client!po", name = "Hb", descriptor = "[Z")
    private boolean[] field4809;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lti;)V")
    public final void method2055(class254 arg0) {
        if (this.field4844 != arg0 && this.field4852) {
            this.field4752.glBindBufferARB(34962, arg0.method380());
            this.field4844 = arg0;
        }
    }

    @OriginalMember(owner = "client!po", name = "H", descriptor = "()I")
    public final int method959() {
        return this.field4806;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([Lmj;Lvr;[Lue;I)V")
    public final void method984(class393[] arg0, class71 arg1, class127[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method775(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(Z)V")
    public final void method2056(boolean arg0) {
        if (this.field4867 == arg0) {
            return;
        }
        if (arg0) {
            this.field4752.glEnable(2929);
        } else {
            this.field4752.glDisable(2929);
        }
        this.field4867 = arg0;
        this.field4861 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!po", name = "B", descriptor = "()V")
    public final void method924() {
        this.field4748.method2211(0, (byte) -105, false, false);
        this.field4838 = false;
        this.method2118();
        this.method2095();
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "()I")
    public final int method994() {
        return 4;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FF)V")
    public final void method1017(float arg0, float arg1) {
        if (this.field4823 == arg0 && this.field4780 == arg1) {
            return;
        }
        this.field4823 = arg0;
        this.field4780 = arg1;
        this.method2108();
        this.method2093();
        if (this.field4814 == 3) {
            this.method2121();
        } else if (this.field4814 == 2) {
            this.method2102();
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
    public final void method998(int arg0) {
        this.method2125();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbd;)V")
    public final void method1024(class38 arg0) {
        this.field4839 = (class259) arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lpe;)V")
    public final void method2057(class363 arg0) {
        class254 var2 = arg0.field5289;
        this.method2055(var2);
        var2.method445(arg0);
        this.field4882 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(IIIII)V")
    public final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2123();
        this.method2131(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4752.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4752.glBegin(1);
        this.field4752.glVertex2f(var6, var7);
        this.field4752.glVertex2f(var6, (float) arg2 + var7);
        this.field4752.glEnd();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
    public final void method933(int arg0, int arg1) {
        if (this.field4776 == arg0 && this.field4817 == arg1) {
            return;
        }
        this.field4776 = arg0;
        this.field4817 = arg1;
        if (!this.field4838) {
            this.method2118();
            this.method2095();
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(FFF)V")
    private final void method2058(float arg0, float arg1, float arg2) {
        this.field4752.glMatrixMode(5890);
        if (this.field4873) {
            this.field4752.glLoadIdentity();
        }
        this.field4752.glTranslatef(arg0, arg1, arg2);
        this.field4752.glMatrixMode(5888);
        this.field4873 = true;
    }

    @OriginalMember(owner = "client!po", name = "h", descriptor = "(I)V")
    public final synchronized void method2059(int arg0) {
        class193 var2 = new class193(arg0);
        this.field4772.method1125(-1, var2);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FFF)V")
    public final void method987(float arg0, float arg1, float arg2) {
        class304.field4353 = arg0;
        class304.field4339 = arg1;
        class304.field4351 = arg2;
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "(I)V")
    public final synchronized void method2060(int arg0) {
        class193 var2 = new class193(arg0);
        this.field4769.method1125(-1, var2);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIILhm;II)V")
    public final void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class121 arg6, int arg7, int arg8) {
        class405 var10 = (class405) arg6;
        class17 var11 = var10.field5894;
        this.method2094();
        this.method2085(var10.field5894);
        this.method2131(arg5);
        this.method2100(7681, 8448);
        this.method2086(0, 34167, 768);
        float var12 = var11.field172 / (float) var11.field175;
        float var13 = var11.field171 / (float) var11.field174;
        this.field4752.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4752.glBegin(1);
        this.field4752.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4752.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4752.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4752.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4752.glEnd();
        this.method2086(0, 5890, 768);
    }

    @OriginalMember(owner = "client!po", name = "M", descriptor = "()V")
    private final void method2061() {
        if (this.field4846 <= this.field4874 && this.field4796 <= this.field4785) {
            this.field4752.glScissor(this.field4846 + this.field4815, this.field4830 + this.field4764 - this.field4785, this.field4874 - this.field4846, this.field4785 - this.field4796);
        } else {
            this.field4752.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "()Lvr;")
    public final class71 method1015() {
        return this.field4753;
    }

    @OriginalMember(owner = "client!po", name = "j", descriptor = "(I)V")
    public final void method2062(int arg0) {
        if (this.field4843 != arg0) {
            this.field4752.glActiveTexture(arg0 + 33984);
            this.field4843 = arg0;
        }
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(Z)V")
    public final void method2063(boolean arg0) {
        if (this.field4774 != arg0) {
            this.field4774 = arg0;
            this.method2092();
            this.field4861 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILpe;)V")
    public final void method2064(int arg0, class363 arg1) {
        class254 var3 = arg1.field5289;
        this.method2055(var3);
        var3.method448(arg0, arg1);
        this.field4811[arg0] = arg1;
    }

    @OriginalMember(owner = "client!po", name = "A", descriptor = "()Z")
    public final boolean method931() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(F)V")
    public final void method2065(float arg0) {
        if (this.field4834 != arg0) {
            this.field4834 = arg0;
            if (this.field4814 == 3) {
                this.method2121();
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "L", descriptor = "()V")
    public final void method1006() {
        this.field4761 = this.field4749.getWidth();
        this.field4764 = this.field4749.getHeight();
        this.field4752.glViewport(this.field4815, this.field4830, this.field4761, this.field4764);
        this.method2132();
        this.method957();
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(IIIII)V")
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2123();
        this.method2131(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4752.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4752.glBegin(1);
        this.field4752.glVertex2f(var6, var7);
        this.field4752.glVertex2f((float) arg2 + var6, var7);
        this.field4752.glEnd();
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(II)V")
    public final void method2066(int arg0, int arg1) {
        this.field4815 = arg0;
        this.field4830 = arg1;
        this.field4752.glViewport(arg0, arg1, this.field4761, this.field4764);
        this.method2061();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Loq;IIII)Lmj;")
    public final class393 method991(class200 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class425(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!po", name = "z", descriptor = "()I")
    public final int method954() {
        int var1 = this.field4883;
        this.field4883 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!po", name = "N", descriptor = "()V")
    private final void method2067() {
        this.field4773 = new class18();
        this.field4865 = new class18();
        this.field4818 = new class439[this.field4842];
        this.field4809 = new boolean[this.field4793];
        this.field4811 = new class363[this.field4793];
        this.field4878 = new class141(this, 3553, 6408, 1, 1);
        this.field4822 = new class141(this, 3553, 6408, 1, 1);
        this.field4799 = new class141(this, 3553, 6408, 1, 1);
        this.field4800 = new class425(this);
        this.field4792 = new class425(this);
        this.field4858 = new class425(this);
        this.field4816 = new class425(this);
        this.field4845 = new class425(this);
        this.field4879 = new class425(this);
        this.field4855 = this.method2101(5123, (byte[]) null, 1024, true);
        if (this.field4862) {
            this.field4848 = new class86(this);
        }
        this.field4741.method2349(this);
    }

    @OriginalMember(owner = "client!po", name = "s", descriptor = "()V")
    public final void method942() {
        if (this.field4752 != null) {
            try {
                this.field4745.method100();
            } catch (Throwable var4) {
            }
            this.field4752 = null;
        }
        if (this.field4751 != null) {
            this.method2125();
            try {
                this.field4751.destroy();
            } catch (Throwable var3) {
            }
            this.field4751 = null;
        }
        if (this.field4755) {
            class235.method1497(true, true, true);
            this.field4755 = false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lnc;)V")
    public final void method2068(class18 arg0) {
        this.field4752.glPushMatrix();
        this.field4752.glMultMatrixf(arg0.method122((byte) 10), 0);
    }

    @OriginalMember(owner = "client!po", name = "k", descriptor = "(I)I")
    public final int method2069(int arg0) {
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

    @OriginalMember(owner = "client!po", name = "O", descriptor = "()V")
    private final void method2070() {
        field4740[0] = this.field4826 * this.field4802;
        field4740[1] = this.field4826 * this.field4788;
        field4740[2] = this.field4853 * this.field4826;
        field4740[3] = 1.0F;
        this.field4752.glLightModelfv(2899, field4740, 0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([Lmj;Lbg;Lvr;[Lue;I)V")
    public final void method943(class393[] arg0, class271 arg1, class71 arg2, class127[] arg3, int arg4) {
        this.method984(arg0, arg2, arg3, arg4);
        this.method921(arg1);
    }

    @OriginalMember(owner = "client!po", name = "P", descriptor = "()I")
    private final int method2071() {
        int var1 = 0;
        this.field4856 = this.field4752.glGetString(7936);
        this.field4781 = this.field4752.glGetString(7937);
        String var2 = this.field4856.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4752.glGetString(7938);
        String[] var4 = class112.method617(' ', var3.replace('.', ' '), 16777215);
        if (var4.length >= 2) {
            try {
                int var5 = class99.method531(var4[0], (byte) -126);
                int var6 = class99.method531(var4[1], (byte) 127);
                this.field4803 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4803 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4752.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4752.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4752.glGetIntegerv(34018, var8, 0);
        this.field4842 = var8[0];
        this.field4752.glGetIntegerv(34929, var8, 0);
        this.field4793 = var8[0];
        this.field4752.glGetIntegerv(34930, var8, 0);
        this.field4778 = var8[0];
        if (this.field4842 < 2 || this.field4793 < 2 || this.field4778 < 2) {
            var1 |= 0x10;
        }
        this.field4779 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4852 = this.field4752.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4777 = this.field4752.isExtensionAvailable("GL_ARB_multisample");
        this.field4784 = this.field4752.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4752.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4752.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4835 = this.field4752.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4783 = this.field4752.isExtensionAvailable("GL_EXT_texture3D");
        this.field4837 = this.field4752.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4797 = this.field4752.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4851 = this.field4752.isExtensionAvailable("GL_ARB_texture_float");
        this.field4840 = false;
        this.field4862 = this.field4752.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(IIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        this.field4828 = arg0;
        this.field4864 = arg1;
        this.field4836 = arg2;
        this.field4832 = arg3;
        float var5 = (float) (-this.field4828 * this.field4791) / (float) this.field4836;
        float var6 = (float) (-this.field4864 * this.field4791) / (float) this.field4832;
        float var7 = (float) ((this.field4761 - this.field4828) * this.field4791) / (float) this.field4836;
        float var8 = (float) ((this.field4764 - this.field4864) * this.field4791) / (float) this.field4832;
        this.method2122(var5, var7, -var8, -var6, (float) this.field4791, (float) this.field4806);
        if (this.field4814 != 1) {
            this.method2132();
        }
        this.method2093();
        this.method2072();
    }

    @OriginalMember(owner = "client!po", name = "Q", descriptor = "()V")
    private final void method2072() {
        this.field4813 = (float) (this.field4846 - this.field4828);
        this.field4827 = (float) (this.field4874 - this.field4828);
        this.field4807 = (float) (this.field4796 - this.field4864);
        this.field4859 = (float) (this.field4785 - this.field4864);
    }

    @OriginalMember(owner = "client!po", name = "E", descriptor = "()Z")
    public final boolean method969() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "y", descriptor = "()V")
    public final void method1022() {
        try {
            this.field4751.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()I")
    public final int method294() {
        return this.field4764;
    }

    @OriginalMember(owner = "client!po", name = "R", descriptor = "()V")
    private final void method2073() {
        if (this.field4798 && !this.field4877) {
            this.field4752.glEnable(2896);
        } else {
            this.field4752.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()V")
    public final void method295() {
    }

    @OriginalMember(owner = "client!po", name = "S", descriptor = "()V")
    public final void method2074() {
        if (this.field4861 == 8) {
            return;
        }
        this.method2083();
        this.method2099(true);
        this.method2056(true);
        this.method2063(true);
        this.method2131(1);
        this.method2116(1);
        this.field4861 = 8;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(F)V")
    public final void method999(float arg0) {
        if (this.field4826 != arg0) {
            this.field4826 = arg0;
            this.method2070();
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "()Lvr;")
    public final class71 method922() {
        return new class18();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method950(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!po", name = "D", descriptor = "()Z")
    public final boolean method996() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method978(Rectangle[] arg0, int arg1) {
        this.method1022();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method952(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!po", name = "C", descriptor = "()V")
    public final void method934() {
        this.method2063(true);
        this.field4752.glClear(256);
    }

    @OriginalMember(owner = "client!po", name = "f", descriptor = "(II)V")
    public final synchronized void method2075(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5248 = (long) arg0;
        this.field4768.method1125(-1, var3);
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "()I")
    public final int method1021() {
        int var1 = this.field4884;
        this.field4884 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III[I)V")
    public final void method1020(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4773.field180 + (float) arg0 * this.field4773.field183 + (float) arg1 * this.field4773.field181 + this.field4773.field188;
        if ((var5 < (float) this.field4791) || (var5 > (float) this.field4806)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4773.field187 + (float) arg0 * this.field4773.field176 + (float) arg1 * this.field4773.field182 + this.field4773.field186) * (float) this.field4836 / var5);
        int var7 = (int) (((float) arg2 * this.field4773.field178 + (float) arg0 * this.field4773.field185 + (float) arg1 * this.field4773.field177 + this.field4773.field184) * (float) this.field4832 / var5);
        if ((float) var6 >= this.field4813 && (float) var6 <= this.field4827 && (float) var7 >= this.field4807 && (float) var7 <= this.field4859) {
            arg3[0] = (int) ((float) var6 - this.field4813);
            arg3[1] = (int) ((float) var7 - this.field4807);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([IIIII)Lkh;")
    public final class11 method1008(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class5(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!po", name = "l", descriptor = "()V")
    public final void method957() {
        this.field4846 = 0;
        this.field4796 = 0;
        this.field4874 = this.field4761;
        this.field4785 = this.field4764;
        this.field4752.glDisable(3089);
        this.method2072();
    }

    @OriginalMember(owner = "client!po", name = "u", descriptor = "()I")
    public final int method992() {
        return this.field4791;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Z)V")
    public final void method956(boolean arg0) {
        this.field4801 = arg0;
        this.method2092();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFF)V")
    public final void method2076(float arg0, float arg1, float arg2, float arg3) {
        field4740[0] = arg0;
        field4740[1] = arg1;
        field4740[2] = arg2;
        field4740[3] = arg3;
        this.field4752.glTexEnvfv(8960, 8705, field4740, 0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)Z")
    public final boolean method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4773.field180 + (float) arg0 * this.field4773.field183 + (float) arg1 * this.field4773.field181 + this.field4773.field188;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4773.field180 + (float) arg3 * this.field4773.field183 + (float) arg4 * this.field4773.field181 + this.field4773.field188;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4791) || !(var8 < (float) this.field4791)) || !(!(var7 > (float) this.field4806) || !(var8 > (float) this.field4806))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4773.field187 + (float) arg0 * this.field4773.field176 + (float) arg1 * this.field4773.field182 + this.field4773.field186) * (float) this.field4836 / var7);
        int var10 = (int) (((float) arg5 * this.field4773.field187 + (float) arg3 * this.field4773.field176 + (float) arg4 * this.field4773.field182 + this.field4773.field186) * (float) this.field4836 / var8);
        if ((float) var9 < this.field4813 && (float) var10 < this.field4813 || (float) var9 > this.field4827 && (float) var10 > this.field4827) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4773.field178 + (float) arg0 * this.field4773.field185 + (float) arg1 * this.field4773.field177 + this.field4773.field184) * (float) this.field4832 / var7);
            int var12 = (int) (((float) arg5 * this.field4773.field178 + (float) arg3 * this.field4773.field185 + (float) arg4 * this.field4773.field177 + this.field4773.field184) * (float) this.field4832 / var8);
            return (!((float) var11 < this.field4807) || !((float) var12 < this.field4807)) && (!((float) var11 > this.field4859) || !((float) var12 > this.field4859));
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(IIIIII)Lbd;")
    public final class38 method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4797 ? new class352(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lfn;)V")
    public final void method997(class73 arg0) {
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Lpe;)V")
    public final void method2077(class363 arg0) {
        class254 var2 = arg0.field5289;
        this.method2055(var2);
        var2.method447(arg0);
        this.field4866 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II[I[I)Lhm;")
    public final class121 method1003(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class405.method2562(arg1, this, arg0, arg2, (byte) -39, arg3);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public final void method944(boolean arg0) {
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lkl;)V")
    public final void method2078(class47 arg0) {
        if (this.field4756 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4756 >= 0) {
            this.field4763[this.field4756].method295();
        }
        this.field4760 = this.field4763[++this.field4756] = arg0;
        this.field4760.method293();
    }

    @OriginalMember(owner = "client!po", name = "T", descriptor = "()Lkl;")
    public final class47 method2079() {
        return this.field4760;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lcl;Z)Lkh;")
    public final class11 method955(class145 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field2043 * arg0.field2038];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2042 == null) {
            for (int var8 = 0; var8 < arg0.field2038; var8++) {
                for (int var9 = 0; var9 < arg0.field2043; var9++) {
                    int var10 = arg0.field2044[arg0.field2045[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field2038; var6++) {
                for (int var7 = 0; var7 < arg0.field2043; var7++) {
                    var3[var5++] = arg0.field2042[var4] << 24 | arg0.field2044[arg0.field2045[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class11 var11 = this.method1008(var3, 0, arg0.field2043, arg0.field2043, arg0.field2038);
        var11.method44(arg0.field2041, arg0.field2046, arg0.field2040, arg0.field2039);
        return var11;
    }

    @OriginalMember(owner = "client!po", name = "h", descriptor = "(Z)V")
    public final void method2080(boolean arg0) {
        if (this.field4877 != arg0) {
            this.field4877 = arg0;
            this.method2073();
        }
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(II)V")
    public final synchronized void method2081(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5248 = (long) arg0;
        this.field4767.method1125(-1, var3);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZZ)V")
    public final void method2082(int arg0, boolean arg1, boolean arg2) {
        if (this.field4841 != arg0) {
            if (arg0 < 0) {
                this.method2129();
                this.method2085((class439) null);
                if (!this.field4838) {
                    this.field4748.method2211(0, (byte) -119, arg1, arg2);
                }
            } else {
                class141 var4 = this.field4750.method1537(arg0, 128);
                class311 var5 = this.field4744.method371(arg0, (byte) 96);
                if (var5.field4429 == 0 && var5.field4441 == 0) {
                    this.method2129();
                } else {
                    int var6 = var5.field4442 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2058((float) (this.field4758 % var7 * var5.field4429) / (float) var7, (float) (this.field4758 % var7 * var5.field4441) / (float) var7, 0.0F);
                }
                if (this.field4838) {
                    this.field4748.method2211(3, (byte) -72, arg1, arg2);
                    this.method2085(var4);
                } else {
                    this.field4748.method2211(var5.field4447, (byte) -102, arg1, arg2);
                    this.field4748.method2210(false, false, var5.field4440);
                    if (!this.field4748.method2209((byte) 5, var4)) {
                        this.method2085(var4);
                    }
                }
            }
            this.field4841 = arg0;
        }
        this.field4861 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)V")
    public final void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4752.glLineWidth((float) arg5);
        this.method973(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4752.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!po", name = "U", descriptor = "()V")
    public final void method2083() {
        if (this.field4814 != 2) {
            this.field4814 = 2;
            this.method2102();
            this.method2124();
            this.field4861 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!po", name = "V", descriptor = "()V")
    private final void method2084() {
        if (this.field4814 == 1) {
            return;
        }
        this.field4752.glMatrixMode(5889);
        this.field4752.glLoadIdentity();
        this.field4752.glOrtho(0.0D, (double) this.field4761, (double) this.field4764, 0.0D, -1.0D, 1.0D);
        this.field4752.glMatrixMode(5888);
        this.field4752.glLoadIdentity();
        this.field4814 = 1;
        this.field4861 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lfl;)V")
    public final void method2085(class439 arg0) {
        class439 var2 = this.field4818[this.field4843];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4752.glDisable(var2.field6438);
            } else {
                if (var2 == null) {
                    this.field4752.glEnable(arg0.field6438);
                } else if (arg0.field6438 != var2.field6438) {
                    this.field4752.glDisable(var2.field6438);
                    this.field4752.glEnable(arg0.field6438);
                }
                this.field4752.glBindTexture(arg0.field6438, arg0.method2729());
            }
            this.field4818[this.field4843] = arg0;
        }
        this.field4861 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(III)V")
    public final void method2086(int arg0, int arg1, int arg2) {
        this.field4752.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4752.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIII)V")
    public final void method962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!po", name = "g", descriptor = "(I)Lfn;")
    public final class73 method1001(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!po", name = "o", descriptor = "()Z")
    public final boolean method951() {
        return this.field4748.method2212(3, 82);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILhm;II)V")
    public final void method980(int arg0, class121 arg1, int arg2, int arg3) {
        class405 var5 = (class405) arg1;
        class17 var6 = var5.field5894;
        this.method2094();
        this.method2085(var5.field5894);
        this.method2131(1);
        this.method2100(7681, 8448);
        this.method2086(0, 34167, 768);
        float var7 = var6.field172 / (float) var6.field175;
        float var8 = var6.field171 / (float) var6.field174;
        this.field4752.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4752.glBegin(7);
        this.field4752.glTexCoord2f((float) (this.field4846 - arg2) * var7, (float) (this.field4796 - arg3) * var8);
        this.field4752.glVertex2i(this.field4846, this.field4796);
        this.field4752.glTexCoord2f((float) (this.field4846 - arg2) * var7, (float) (this.field4785 - arg3) * var8);
        this.field4752.glVertex2i(this.field4846, this.field4785);
        this.field4752.glTexCoord2f((float) (this.field4874 - arg2) * var7, (float) (this.field4785 - arg3) * var8);
        this.field4752.glVertex2i(this.field4874, this.field4785);
        this.field4752.glTexCoord2f((float) (this.field4874 - arg2) * var7, (float) (this.field4796 - arg3) * var8);
        this.field4752.glVertex2i(this.field4874, this.field4796);
        this.field4752.glEnd();
        this.method2086(0, 5890, 768);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([I)V")
    public final void method1004(int[] arg0) {
        arg0[0] = this.field4846;
        arg0[1] = this.field4796;
        arg0[2] = this.field4874;
        arg0[3] = this.field4785;
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(III)V")
    public final void method2087(int arg0, int arg1, int arg2) {
        this.field4752.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4752.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!po", name = "W", descriptor = "()V")
    public final void method2088() {
        if (this.field4861 == 16) {
            return;
        }
        this.method2117();
        this.method2099(true);
        this.method2056(true);
        this.method2063(true);
        this.method2131(1);
        this.method2116(1);
        this.field4861 = 16;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIII)V")
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2123();
        this.method2131(arg5);
        this.field4752.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4752.glBegin(2);
        this.field4752.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4752.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4752.glEnd();
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public final void method929(int arg0) {
        this.method2131(0);
        this.field4752.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4752.glClear(16384);
    }

    @OriginalMember(owner = "client!po", name = "G", descriptor = "()V")
    public final void method930() {
        this.field4745.method107();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lti;")
    public final class254 method2089(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class254) (this.field4852 && !arg2 || this.field4869 ? new class80(this, arg0, arg1, arg2) : new class293(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!po", name = "l", descriptor = "(I)V")
    public final void method2090(int arg0) {
        field4740[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4740[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4740[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4740[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4752.glTexEnvfv(8960, 8705, field4740, 0);
    }

    @OriginalMember(owner = "client!po", name = "v", descriptor = "()Z")
    public final boolean method940() {
        return false;
    }

    @OriginalMember(owner = "client!po", name = "X", descriptor = "()V")
    public final void method2091() {
        this.field4752.glPopMatrix();
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "()Z")
    public final boolean method935() {
        return class378.field5549 == null || !class378.field5549.startsWith("mac");
    }

    @OriginalMember(owner = "client!po", name = "Y", descriptor = "()V")
    private final void method2092() {
        this.field4752.glDepthMask(this.field4774 && this.field4801);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(II)V")
    public final void method1011(int arg0, int arg1) {
        if (this.field4791 == arg0 && this.field4806 == arg1) {
            return;
        }
        this.field4791 = arg0;
        this.field4806 = arg1;
        this.method2132();
        this.method2093();
        this.method2118();
    }

    @OriginalMember(owner = "client!po", name = "K", descriptor = "()V")
    public final void method970() {
        if (this.field4743.method1329(-12506)) {
            this.field4745.method103(this.field4743);
            this.field4750.method1538(126);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lnm;[Lcl;Z)Ltc;")
    public final class196 method966(class277 arg0, class145[] arg1, boolean arg2) {
        return new class416(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!po", name = "Z", descriptor = "()V")
    private final void method2093() {
        this.field4847 = (this.field4870[14] - (float) this.field4806) / this.field4870[10];
        this.field4821 = (float) this.field4806 - this.field4780;
    }

    @OriginalMember(owner = "client!po", name = "ab", descriptor = "()V")
    public final void method2094() {
        if (this.field4861 == 2) {
            return;
        }
        this.method2084();
        this.method2099(false);
        this.method2110(false);
        this.method2056(false);
        this.method2063(false);
        this.method2109(-2);
        this.field4861 = 2;
    }

    @OriginalMember(owner = "client!po", name = "bb", descriptor = "()V")
    private final void method2095() {
        if (this.field4812 && this.field4838 | this.field4817 >= 0) {
            this.field4752.glEnable(2912);
        } else {
            this.field4752.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!po", name = "t", descriptor = "()Z")
    public final boolean method937() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "x", descriptor = "()Z")
    public final boolean method925() {
        return this.field4743.method1329(-12506);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(IIII)V")
    public final void method948(int arg0, int arg1, int arg2, int arg3) {
        this.field4745.method105(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!po", name = "h", descriptor = "(II)V")
    public final synchronized void method2096(int arg0, int arg1) {
        class193 var3 = new class193(arg1);
        var3.field5248 = (long) arg0;
        this.field4769.method1125(-1, var3);
    }

    @OriginalMember(owner = "client!po", name = "cb", descriptor = "()V")
    public final void method2097() {
        if (this.field4861 == 4) {
            return;
        }
        this.method2084();
        this.method2099(false);
        this.method2110(false);
        this.method2056(false);
        this.method2063(false);
        this.method2109(-2);
        this.method2131(1);
        this.method2116(1);
        this.field4861 = 4;
    }

    @OriginalMember(owner = "client!po", name = "m", descriptor = "(I)I")
    public final int method2098(int arg0) {
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

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIZ)Lkh;")
    public final class11 method983(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class5(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()V")
    public final void method293() {
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lvr;)V")
    public final void method949(class71 arg0) {
        this.field4773 = (class18) arg0;
        this.field4865.method128(this.field4773, 2);
        if (this.field4814 != 1) {
            this.method2124();
        }
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "(Z)V")
    public final void method2099(boolean arg0) {
        if (this.field4812 != arg0) {
            this.field4812 = arg0;
            this.method2095();
            this.field4861 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!po", name = "n", descriptor = "()V")
    public final void method947() {
    }

    @OriginalMember(owner = "client!po", name = "i", descriptor = "(II)V")
    public final void method2100(int arg0, int arg1) {
        if (this.field4843 != 0) {
            this.field4752.glTexEnvi(8960, 34161, arg0);
            this.field4752.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4810 != arg0) {
            this.field4752.glTexEnvi(8960, 34161, arg0);
            this.field4810 = arg0;
            var3 = true;
        }
        if (this.field4787 != arg1) {
            this.field4752.glTexEnvi(8960, 34162, arg1);
            this.field4787 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4861 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I[BIZ)Leo;")
    public final class163 method2101(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class163) (this.field4852 && !arg3 || this.field4869 ? new class62(this, arg0, arg1, arg2, arg3) : new class320(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbg;)V")
    public final void method921(class271 arg0) {
        this.field4741.method2350(this, arg0);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(IIIIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2123();
        this.method2131(arg5);
        this.field4752.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4777) {
            this.field4752.glDisable(32925);
        }
        this.field4752.glBegin(7);
        this.field4752.glVertex2f(var7, var8);
        this.field4752.glVertex2f(var7, var10);
        this.field4752.glVertex2f(var9, var10);
        this.field4752.glVertex2f(var9, var8);
        this.field4752.glEnd();
        if (this.field4777) {
            this.field4752.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!po", name = "J", descriptor = "()V")
    public final void method977() {
        int var1 = this.field4846;
        int var2 = this.field4874;
        int var3 = this.field4796;
        int var4 = this.field4785;
        this.method957();
        this.field4752.glReadBuffer(1028);
        this.field4752.glDrawBuffer(1029);
        this.method2132();
        this.method2099(false);
        this.method2110(false);
        this.method2056(false);
        this.method2063(false);
        this.method2085((class439) null);
        this.method2109(-2);
        this.method2116(0);
        this.method2131(0);
        this.field4752.glMatrixMode(5889);
        this.field4752.glLoadIdentity();
        this.field4752.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4752.glMatrixMode(5888);
        this.field4752.glLoadIdentity();
        this.field4752.glRasterPos2i(0, 0);
        this.field4752.glCopyPixels(0, 0, this.field4761, this.field4764, 6144);
        this.field4752.glFlush();
        this.field4752.glReadBuffer(1029);
        this.field4752.glDrawBuffer(1029);
        this.method968(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!po", name = "db", descriptor = "()V")
    private final void method2102() {
        this.field4752.glMatrixMode(5889);
        this.field4752.glLoadMatrixf(this.field4870, 0);
        this.field4752.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbd;Lbd;FLbd;)Lbd;")
    public final class38 method1002(class38 arg0, class38 arg1, float arg2, class38 arg3) {
        if (arg0 != null && arg1 != null && this.field4797 && this.field4862) {
            class398 var5 = null;
            class259 var6 = (class259) arg0;
            class259 var7 = (class259) arg1;
            class205 var8 = var6.method1619((byte) -94);
            class205 var9 = var7.method1619((byte) 75);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2801 > var9.field2801 ? var8.field2801 : var9.field2801;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class398) {
                    class398 var11 = (class398) arg3;
                    if (var11.method2529(1) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class398(this, var10);
                }
                var5.method2528(5889, var9, var8, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!po", name = "n", descriptor = "(I)V")
    public final synchronized void method2103(int arg0) {
        class193 var2 = new class193(arg0);
        this.field4771.method1125(-1, var2);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Lkl;)V")
    public final void method2104(class47 arg0) {
        if (this.field4756 < 0 || this.field4763[this.field4756] != arg0) {
            throw new RuntimeException();
        }
        this.field4763[this.field4756--] = null;
        arg0.method295();
        if (this.field4756 >= 0) {
            this.field4760 = this.field4763[this.field4756];
            this.field4760.method293();
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII)V")
    public final void method968(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4761) {
            arg2 = this.field4761;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4764) {
            arg3 = this.field4764;
        }
        this.field4846 = arg0;
        this.field4796 = arg1;
        this.field4874 = arg2;
        this.field4785 = arg3;
        this.field4752.glEnable(3089);
        this.method2072();
        this.method2061();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
    public final void method2105(int arg0, boolean arg1) {
        this.method2082(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!po", name = "F", descriptor = "()Z")
    public final boolean method927() {
        return false;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public final synchronized void method1007(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4767.method1122(-5874)) {
            class193 var4 = (class193) this.field4767.method1112(-1);
            field4747[var2++] = (int) var4.field5248;
            this.field4765 -= var4.field2631;
            if (var2 == 1000) {
                this.field4752.glDeleteBuffersARB(var2, field4747, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4752.glDeleteBuffersARB(var2, field4747, 0);
            var2 = 0;
        }
        while (!this.field4768.method1122(-5874)) {
            class193 var5 = (class193) this.field4768.method1112(-1);
            field4747[var2++] = (int) var5.field5248;
            this.field4757 -= var5.field2631;
            if (var2 == 1000) {
                this.field4752.glDeleteTextures(var2, field4747, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4752.glDeleteTextures(var2, field4747, 0);
            var2 = 0;
        }
        while (!this.field4769.method1122(-5874)) {
            class193 var6 = (class193) this.field4769.method1112(-1);
            field4747[var2++] = var6.field2631;
            if (var2 == 1000) {
                this.field4752.glDeleteFramebuffersEXT(var2, field4747, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4752.glDeleteFramebuffersEXT(var2, field4747, 0);
            var2 = 0;
        }
        while (!this.field4770.method1122(-5874)) {
            class193 var7 = (class193) this.field4770.method1112(-1);
            field4747[var2++] = (int) var7.field5248;
            this.field4766 -= var7.field2631;
            if (var2 == 1000) {
                this.field4752.glDeleteRenderbuffersEXT(var2, field4747, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4752.glDeleteRenderbuffersEXT(var2, field4747, 0);
            var2 = 0;
        }
        while (!this.field4771.method1122(-5874)) {
            class193 var8 = (class193) this.field4771.method1112(-1);
            field4747[var2++] = (int) var8.field5248;
            if (var2 == 1000) {
                this.field4752.glDeleteProgramsARB(var2, field4747, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4752.glDeleteProgramsARB(var2, field4747, 0);
            boolean var9 = false;
        }
        while (!this.field4759.method1122(-5874)) {
            class193 var10 = (class193) this.field4759.method1112(-1);
            this.field4752.glDeleteLists((int) var10.field5248, var10.field2631);
        }
        while (!this.field4772.method1122(-5874)) {
            class193 var11 = (class193) this.field4772.method1112(-1);
            this.field4752.glDeleteObjectARB(var11.field2631);
        }
        while (!this.field4759.method1122(-5874)) {
            class193 var12 = (class193) this.field4759.method1112(-1);
            this.field4752.glDeleteLists((int) var12.field5248, var12.field2631);
        }
        if (this.method989() > 100663296 && class203.method1299((byte) 5) > this.field4875 + 60000L) {
            System.gc();
            this.field4875 = class203.method1299((byte) 5);
        }
        this.field4758 = var3;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        if (!this.field4838) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4789 = arg1;
        this.field4805 = arg2;
        this.method2118();
        this.field4748.method2210(true, false, arg0);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I[BIZ)Lti;")
    public final class254 method2106(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class254) (this.field4852 && !arg3 || this.field4869 ? new class80(this, arg0, arg1, arg2, arg3) : new class293(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!po", name = "h", descriptor = "()Z")
    public final boolean method979() {
        return false;
    }

    @OriginalMember(owner = "client!po", name = "r", descriptor = "()Z")
    public final boolean method988() {
        return this.field4777;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I[Lvg;)V")
    public final void method926(int arg0, class33[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class33 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4746[0] = (float) var4.field309;
            field4746[1] = (float) var4.field304;
            field4746[2] = (float) var4.field311;
            field4746[3] = 1.0F;
            this.field4752.glLightfv(var5, 4611, field4746, 0);
            int var6 = var4.field305;
            float var7 = var4.field312 / 255.0F;
            field4746[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4746[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4746[2] = (float) (var6 & 0xFF) * var7;
            this.field4752.glLightfv(var5, 4609, field4746, 0);
            this.field4752.glLightf(var5, 4617, 1.0F / (float) (var4.field307 * var4.field307));
            this.field4752.glEnable(var5);
        }
        while (var3 < this.field4795) {
            this.field4752.glDisable(var3 + 16386);
            var3++;
        }
        this.field4795 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Leo;III)V")
    public final void method2107(class163 arg0, int arg1, int arg2, int arg3) {
        this.method2120(arg0);
        arg0.method381(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!po", name = "eb", descriptor = "()V")
    private final void method2108() {
        if (this.field4780 == 0.0F) {
            this.field4870[10] = this.field4854;
            this.field4870[14] = this.field4786;
        } else {
            float var1 = this.field4823 / (this.field4823 + this.field4780);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4786 * (1.0F - var1) / this.field4780;
            this.field4870[10] = this.field4854 + var3;
            this.field4870[14] = this.field4786 * var2;
        }
        this.method2093();
    }

    @OriginalMember(owner = "client!po", name = "o", descriptor = "(I)V")
    public final void method2109(int arg0) {
        this.method2105(arg0, true);
    }

    @OriginalMember(owner = "client!po", name = "q", descriptor = "()Z")
    public final boolean method960() {
        if (!this.field4743.method1329(-12506)) {
            if (!this.field4745.method101(this.field4743)) {
                return false;
            }
            this.field4750.method1538(119);
        }
        return true;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(IIII)V")
    public final void method1010(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4846 < arg0) {
            this.field4846 = arg0;
        }
        if (this.field4874 > arg2) {
            this.field4874 = arg2;
        }
        if (this.field4796 < arg1) {
            this.field4796 = arg1;
        }
        if (this.field4785 > arg3) {
            this.field4785 = arg3;
        }
        this.field4752.glEnable(3089);
        this.method2072();
        this.method2061();
    }

    @OriginalMember(owner = "client!po", name = "m", descriptor = "()F")
    public final float method1019() {
        return this.field4780;
    }

    @OriginalMember(owner = "client!po", name = "p", descriptor = "()Z")
    public final boolean method975() {
        return this.field4743.method1912();
    }

    @OriginalMember(owner = "client!po", name = "j", descriptor = "(Z)V")
    public final void method2110(boolean arg0) {
        if (this.field4798 != arg0) {
            this.field4798 = arg0;
            this.method2073();
            this.field4861 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(Lpe;)V")
    public final void method2111(class363 arg0) {
        class254 var2 = arg0.field5289;
        this.method2055(var2);
        var2.method446(arg0);
        this.field4876 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II[[I[[IIII)Lac;")
    public final class319 method941(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class365(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!po", name = "fb", descriptor = "()V")
    private final void method2112() {
        field4740[0] = this.field4802 * this.field4790;
        field4740[1] = this.field4790 * this.field4788;
        field4740[2] = this.field4853 * this.field4790;
        field4740[3] = 1.0F;
        this.field4752.glLightfv(16384, 4609, field4740, 0);
        field4740[0] = -this.field4860 * this.field4802;
        field4740[1] = -this.field4860 * this.field4788;
        field4740[2] = -this.field4860 * this.field4853;
        field4740[3] = 1.0F;
        this.field4752.glLightfv(16385, 4609, field4740, 0);
    }

    @OriginalMember(owner = "client!po", name = "j", descriptor = "()Z")
    public final boolean method974() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "I", descriptor = "()I")
    public final int method989() {
        return this.field4765 + this.field4757 + this.field4766;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(IIIIII)V")
    public final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2123();
        this.method2131(arg5);
        this.field4752.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4777) {
            this.field4752.glDisable(32925);
        }
        this.field4752.glBegin(2);
        this.field4752.glVertex2f(var7, var8);
        this.field4752.glVertex2f(var7, var10);
        this.field4752.glVertex2f(var9, var10);
        this.field4752.glVertex2f(var9, var8);
        this.field4752.glEnd();
        if (this.field4777) {
            this.field4752.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!po", name = "gb", descriptor = "()V")
    private final void method2113() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4751.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class278.method1757(1000L, 0);
        }
    }

    @OriginalMember(owner = "client!po", name = "hb", descriptor = "()V")
    public final void method2114() {
        boolean var1 = this.field4866 != null;
        if (this.field4820 != var1) {
            if (var1) {
                this.field4752.glEnableClientState(32884);
            } else {
                this.field4752.glDisableClientState(32884);
            }
            this.field4820 = var1;
        }
        this.field4866 = null;
        boolean var2 = this.field4882 != null;
        if (this.field4804 != var2) {
            if (var2) {
                this.field4752.glEnableClientState(32885);
            } else {
                this.field4752.glDisableClientState(32885);
            }
            this.field4804 = var2;
        }
        this.field4882 = null;
        boolean var3 = this.field4876 != null;
        if (this.field4782 != var3) {
            if (var3) {
                this.field4752.glEnableClientState(32886);
            } else {
                this.field4752.glDisableClientState(32886);
            }
            this.field4782 = var3;
        }
        this.field4876 = null;
        for (int var4 = 0; var4 < this.field4793; var4++) {
            boolean var5 = this.field4811[var4] != null;
            if (this.field4809[var4] != var5) {
                this.field4752.glClientActiveTexture(var4 + 33984);
                if (var5) {
                    this.field4752.glEnableClientState(32888);
                } else {
                    this.field4752.glDisableClientState(32888);
                }
                this.field4809[var4] = var5;
            }
            this.field4811[var4] = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.method2113();
    }

    @OriginalMember(owner = "client!po", name = "w", descriptor = "()Z")
    public final boolean method963() {
        return true;
    }

    @OriginalMember(owner = "client!po", name = "ib", descriptor = "()Lbc;")
    public final class205 method2115() {
        return this.field4839 == null ? null : this.field4839.method1619((byte) 81);
    }

    @OriginalMember(owner = "client!po", name = "p", descriptor = "(I)V")
    public final void method2116(int arg0) {
        if (arg0 == 0) {
            this.method2100(7681, 7681);
        } else if (arg0 == 1) {
            this.method2100(8448, 8448);
        } else if (arg0 == 2) {
            this.method2100(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!po", name = "jb", descriptor = "()V")
    private final void method2117() {
        if (this.field4814 != 3) {
            this.field4814 = 3;
            this.method2121();
            this.method2124();
            this.field4861 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!po", name = "kb", descriptor = "()V")
    private final void method2118() {
        int var1;
        if (this.field4838) {
            this.field4752.glFogf(2915, 0.0F);
            this.field4752.glFogf(2916, 1.0F);
            var1 = this.field4789;
        } else {
            this.field4824 = (float) (this.field4806 - 256) - this.field4849;
            this.field4863 = this.field4824 - (float) this.field4817 * this.field4868;
            if (this.field4863 < (float) this.field4791) {
                this.field4863 = (float) this.field4791;
            }
            this.field4752.glFogf(2915, this.field4863);
            this.field4752.glFogf(2916, this.field4824);
            var1 = this.field4776;
        }
        field4740[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4740[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4740[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4752.glFogfv(2918, field4740, 0);
    }

    @OriginalMember(owner = "client!po", name = "lb", descriptor = "()V")
    public final void method2119() {
        this.field4752.glLightfv(16384, 4611, this.field4808, 0);
        this.field4752.glLightfv(16385, 4611, this.field4819, 0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method961(int arg0, int arg1, int arg2) {
        this.field4838 = true;
        this.field4789 = arg1;
        this.field4805 = arg2;
        this.method2118();
        this.method2095();
        this.field4748.method2211(3, (byte) -127, false, false);
        this.field4748.method2210(true, false, arg0);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Leo;)V")
    public final void method2120(class163 arg0) {
        if (this.field4881 != arg0 && this.field4852) {
            this.field4752.glBindBufferARB(34963, arg0.method380());
            this.field4881 = arg0;
        }
    }

    @OriginalMember(owner = "client!po", name = "mb", descriptor = "()V")
    private final void method2121() {
        float var1 = (float) (-this.field4828) * this.field4834 / (float) this.field4836;
        float var2 = (float) (-this.field4864) * this.field4834 / (float) this.field4832;
        float var3 = (float) (this.field4761 - this.field4828) * this.field4834 / (float) this.field4836;
        float var4 = (float) (this.field4764 - this.field4864) * this.field4834 / (float) this.field4832;
        this.field4752.glMatrixMode(5889);
        this.field4752.glLoadIdentity();
        this.field4752.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4791 - this.field4780), (double) ((float) this.field4806 - this.field4780));
        this.field4752.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFF)V")
    private final void method2122(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var7 = arg4 * 2.0F;
        float[] var8 = this.field4870;
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
        var8[10] = this.field4854 = -(arg4 + arg5) / (arg5 - arg4);
        var8[11] = -1.0F;
        var8[12] = 0.0F;
        var8[13] = 0.0F;
        var8[14] = this.field4786 = -(arg5 * var7) / (arg5 - arg4);
        var8[15] = 0.0F;
        this.method2108();
    }

    @OriginalMember(owner = "client!po", name = "nb", descriptor = "()V")
    private final void method2123() {
        if (this.field4861 == 1) {
            return;
        }
        this.method2084();
        this.method2099(false);
        this.method2110(false);
        this.method2056(false);
        this.method2063(false);
        this.method2085((class439) null);
        this.method2109(-2);
        this.method2116(0);
        this.field4861 = 1;
    }

    @OriginalMember(owner = "client!po", name = "k", descriptor = "()F")
    public final float method936() {
        return this.field4823;
    }

    @OriginalMember(owner = "client!po", name = "ob", descriptor = "()V")
    private final void method2124() {
        this.field4752.glLoadIdentity();
        this.field4752.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4752.glMultMatrixf(this.field4773.method122((byte) 10), 0);
        this.method2119();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IFFFFF)V")
    public final void method1018(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4829 != arg0;
        if (var7 || this.field4790 != arg1 || this.field4860 != arg2) {
            this.field4829 = arg0;
            this.field4790 = arg1;
            this.field4860 = arg2;
            if (var7) {
                this.field4802 = (float) (this.field4829 & 0xFF0000) / 1.671168E7F;
                this.field4788 = (float) (this.field4829 & 0xFFFF) / 65535.0F;
                this.field4853 = (float) (this.field4829 & 0xFF) / 255.0F;
                this.method2070();
            }
            this.method2112();
        }
        if (this.field4808[0] == arg3 && this.field4808[1] == arg4 && this.field4808[2] == arg5) {
            return;
        }
        this.field4808[0] = arg3;
        this.field4808[1] = arg4;
        this.field4808[2] = arg5;
        this.field4819[0] = -arg3;
        this.field4819[1] = -arg4;
        this.field4819[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4825[0] = arg3 * var8;
        this.field4825[1] = arg4 * var8;
        this.field4825[2] = arg5 * var8;
        this.field4775[0] = -this.field4825[0];
        this.field4775[1] = -this.field4825[1];
        this.field4775[2] = -this.field4825[2];
        this.method2119();
        this.field4872 = (int) (arg3 * 256.0F / arg4);
        this.field4831 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!po", name = "pb", descriptor = "()V")
    private final void method2125() {
        try {
            this.field4751.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)I")
    public final int method1016(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(FF)V")
    public final void method2126(float arg0, float arg1) {
        this.field4868 = arg0;
        this.field4849 = arg1;
        if (!this.field4838) {
            this.method2118();
        }
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(III)V")
    public final void method2127(int arg0, int arg1, int arg2) {
        this.field4752.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(II)I")
    public final int method1013(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!po", name = "q", descriptor = "(I)I")
    public final int method2128(int arg0) {
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

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lmj;Lbg;Lvr;Lue;I)V")
    public final void method964(class393 arg0, class271 arg1, class71 arg2, class127 arg3, int arg4) {
        arg0.method775(arg2, arg3, arg4);
        this.method921(arg1);
    }

    @OriginalMember(owner = "client!po", name = "qb", descriptor = "()V")
    private final void method2129() {
        if (this.field4873) {
            this.field4752.glMatrixMode(5890);
            this.field4752.glLoadIdentity();
            this.field4752.glMatrixMode(5888);
            this.field4873 = false;
        }
    }

    @OriginalMember(owner = "client!po", name = "rb", descriptor = "()V")
    private final void method2130() {
        this.method2109(-2);
        for (int var1 = this.field4842 - 1; var1 >= 0; var1--) {
            this.method2062(var1);
            this.method2085((class439) null);
            this.field4752.glTexEnvi(8960, 8704, 34160);
        }
        this.method2100(8448, 8448);
        this.method2086(2, 34168, 770);
        this.method2129();
        this.field4752.glEnable(3042);
        this.field4752.glBlendFunc(770, 771);
        this.field4871 = 1;
        this.field4752.glEnable(3008);
        this.field4752.glAlphaFunc(516, 0.0F);
        this.field4833 = true;
        this.field4752.glColorMask(true, true, true, true);
        this.field4880 = true;
        this.field4794 = 1;
        this.method2099(true);
        this.method2110(true);
        this.method2056(true);
        this.method2063(true);
        this.method2132();
        this.field4752.setSwapInterval(0);
        this.field4752.glShadeModel(7425);
        this.field4752.glClearDepth(1.0F);
        this.field4752.glDepthFunc(515);
        this.field4752.glPolygonMode(1028, 6914);
        this.field4752.glEnable(2884);
        this.field4752.glCullFace(1029);
        this.field4752.glMatrixMode(5888);
        this.field4752.glLoadIdentity();
        this.field4752.glColorMaterial(1028, 5634);
        this.field4752.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4752.glLightfv(var4, 4608, var2, 0);
            this.field4752.glLightf(var4, 4615, 0.0F);
            this.field4752.glLightf(var4, 4616, 0.0F);
        }
        this.field4752.glEnable(16384);
        this.field4752.glEnable(16385);
        this.field4752.glFogf(2914, 0.95F);
        this.field4752.glFogi(2917, 9729);
        this.field4752.glHint(3156, 4353);
        this.field4829 = this.field4776 = -1;
        this.method957();
    }

    @OriginalMember(owner = "client!po", name = "e", descriptor = "(Z)V")
    public final void method945(boolean arg0) {
    }

    @OriginalMember(owner = "client!po", name = "r", descriptor = "(I)V")
    public final void method2131(int arg0) {
        if (this.field4794 == arg0) {
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
        if (this.field4880 != var3) {
            this.field4752.glColorMask(var3, var3, var3, true);
            this.field4880 = var3;
        }
        if (this.field4833 != var4) {
            if (var4) {
                this.field4752.glEnable(3008);
            } else {
                this.field4752.glDisable(3008);
            }
            this.field4833 = var4;
        }
        if (this.field4871 != var2) {
            if (var2 == 1) {
                this.field4752.glEnable(3042);
                this.field4752.glBlendEquation(32774);
                this.field4752.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4752.glEnable(3042);
                this.field4752.glBlendEquation(32774);
                this.field4752.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4752.glEnable(3042);
                this.field4752.glBlendEquation(32778);
                this.field4752.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4752.glEnable(3042);
                this.field4752.glBlendEquation(32774);
                this.field4752.glBlendFunc(774, 1);
            } else {
                this.field4752.glDisable(3042);
            }
            this.field4871 = var2;
        }
        this.field4794 = arg0;
        this.field4861 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!po", name = "sb", descriptor = "()V")
    public final void method2132() {
        if (this.field4814 != 0) {
            this.field4814 = 0;
            this.field4861 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIII)[I")
    public final int[] method932(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4752.glReadPixels(arg0, this.field4764 - arg1 - var6, arg2, 1, 32993, this.field4857, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4850 == null || this.field4850.field1990 < arg2 || this.field4850.field1992 < arg3) {
            this.field4850 = class17.method113(6406, 3553, this, arg3, arg6, 6406, false, arg2);
            this.field4850.method837(false, false);
            var10 = this.field4850.field171;
            var11 = this.field4850.field172;
        } else {
            this.field4850.method838(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4850.field171 / (float) this.field4850.field1992;
            var11 = (float) arg2 * this.field4850.field172 / (float) this.field4850.field1990;
        }
        this.method2094();
        this.method2085(this.field4850);
        this.method2131(arg8);
        this.field4752.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2090(arg5);
        this.method2100(34165, 34165);
        this.method2086(0, 34166, 768);
        this.method2086(2, 5890, 770);
        this.method2087(0, 34166, 770);
        this.method2087(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4752.glBegin(7);
        this.field4752.glTexCoord2f(0.0F, 0.0F);
        this.field4752.glVertex2f(var12, var13);
        this.field4752.glTexCoord2f(0.0F, var11);
        this.field4752.glVertex2f(var12, var15);
        this.field4752.glTexCoord2f(var10, var11);
        this.field4752.glVertex2f(var14, var15);
        this.field4752.glTexCoord2f(var10, 0.0F);
        this.field4752.glVertex2f(var14, var13);
        this.field4752.glEnd();
        this.method2086(0, 5890, 768);
        this.method2086(2, 34166, 770);
        this.method2087(0, 5890, 770);
        this.method2087(2, 34166, 770);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lbm;IILam;)V")
    public class332(Canvas arg0, class60 arg1, int arg2, int arg3, class378 arg4) {
        this.field4749 = arg0;
        this.field4744 = arg1;
        this.field2424 = arg2;
        int var6 = 0;
        while (!this.field4749.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class278.method1757(1000L, 0);
        }
        this.field4749.setIgnoreRepaint(true);
        try {
            if (!field4742) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4742 = Boolean.TRUE;
                } else {
                    class241 var7 = arg4.method2391((byte) -128, this.getClass());
                    while (var7.field3268 == 0) {
                        class278.method1757(100L, 0);
                    }
                    if (var7.field3268 == 1) {
                        field4742 = Boolean.TRUE;
                    }
                }
            }
            if (!field4742) {
                throw new RuntimeException("");
            }
            this.field4751 = new context();
            if (!this.field4751.choosePixelFormat(this.field4749, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4751.createContext()) {
                this.method2113();
                this.field4752 = this.field4751.getGL();
                int var8 = this.method2071();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4857 = this.field4779 ? 33639 : 5121;
                String var9 = this.field4856.toLowerCase();
                String var10 = this.field4781.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class112.method617(' ', var10.replace('/', ' '), 16777215);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class228.method1467(var16.substring(1, 3), -6)) {
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
                                    if (var16.length() >= 4 && class228.method1467(var16.substring(0, 4), -6)) {
                                        var11 = class99.method531(var16.substring(0, 4), (byte) 108);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4852 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4783 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4851 = false;
                    }
                    this.field4837 &= this.field4752.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4869 = this.field4852;
                }
                if (var9.contains("intel")) {
                    this.field4862 = false;
                }
                if (this.field4852) {
                    try {
                        int[] var18 = new int[1];
                        this.field4752.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2078(this);
                this.method1006();
                this.method2067();
                new class64(this);
                this.field4750 = new class243(this, this.field4744);
                class390.method2495(true, true, false);
                this.field4755 = true;
                this.field4748 = new class347(this);
                this.field4745 = new class15(this);
                this.field4743 = new class304(this);
                this.method2130();
                this.field4752.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4751.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class278.method1757(100L, 0);
                    }
                }
                this.field4752.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method942();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
