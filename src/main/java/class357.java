import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class357 extends class58 implements class73 {

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Ls;")
    private class382 field4799 = new class382();

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Lve;")
    private class309 field4805 = new class433();

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    private int field4809 = -1;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public int field4806 = 3;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public int field4811 = 8;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "[Lsj;")
    private class73[] field4816 = new class73[4];

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "Z")
    private boolean field4818 = false;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Ljm;")
    private class162 field4808 = new class162();

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "Ljm;")
    private class162 field4819 = new class162();

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Ljm;")
    private class162 field4820 = new class162();

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "Ljm;")
    private class162 field4821 = new class162();

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "Ljm;")
    private class162 field4822 = new class162();

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "Ljm;")
    private class162 field4823 = new class162();

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "Ljm;")
    private class162 field4824 = new class162();

    @OriginalMember(owner = "client!mm", name = "lb", descriptor = "F")
    public float field4838 = 1.0F;

    @OriginalMember(owner = "client!mm", name = "jb", descriptor = "F")
    public float field4836 = 3584.0F;

    @OriginalMember(owner = "client!mm", name = "Cb", descriptor = "F")
    private float field4855 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "ob", descriptor = "Z")
    private boolean field4841 = true;

    @OriginalMember(owner = "client!mm", name = "Lb", descriptor = "I")
    private int field4864 = 0;

    @OriginalMember(owner = "client!mm", name = "Kb", descriptor = "I")
    public int field4863 = -1;

    @OriginalMember(owner = "client!mm", name = "Ib", descriptor = "I")
    private int field4861 = 0;

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "[F")
    public float[] field4828 = new float[4];

    @OriginalMember(owner = "client!mm", name = "hb", descriptor = "I")
    private int field4834 = 0;

    @OriginalMember(owner = "client!mm", name = "wb", descriptor = "I")
    public int field4849 = 512;

    @OriginalMember(owner = "client!mm", name = "Sb", descriptor = "F")
    private float field4871 = 1.0F;

    @OriginalMember(owner = "client!mm", name = "Nb", descriptor = "I")
    private int field4866 = 8448;

    @OriginalMember(owner = "client!mm", name = "Xb", descriptor = "I")
    private int field4876 = -1;

    @OriginalMember(owner = "client!mm", name = "Qb", descriptor = "I")
    private int field4869 = 0;

    @OriginalMember(owner = "client!mm", name = "Yb", descriptor = "[F")
    private float[] field4877 = new float[4];

    @OriginalMember(owner = "client!mm", name = "cc", descriptor = "I")
    private int field4881 = 0;

    @OriginalMember(owner = "client!mm", name = "Ob", descriptor = "I")
    private int field4867 = 0;

    @OriginalMember(owner = "client!mm", name = "Mb", descriptor = "I")
    public int field4865 = 0;

    @OriginalMember(owner = "client!mm", name = "mb", descriptor = "F")
    private float field4839 = 1.0F;

    @OriginalMember(owner = "client!mm", name = "zb", descriptor = "F")
    public float field4852 = -1.0F;

    @OriginalMember(owner = "client!mm", name = "Tb", descriptor = "[F")
    private float[] field4872 = new float[4];

    @OriginalMember(owner = "client!mm", name = "fc", descriptor = "I")
    private int field4884 = 8448;

    @OriginalMember(owner = "client!mm", name = "hc", descriptor = "F")
    public float field4886 = 1.0F;

    @OriginalMember(owner = "client!mm", name = "dc", descriptor = "I")
    private int field4882 = 0;

    @OriginalMember(owner = "client!mm", name = "Jc", descriptor = "F")
    public float field4914 = 1.0F;

    @OriginalMember(owner = "client!mm", name = "Hc", descriptor = "F")
    public float field4912 = 3584.0F;

    @OriginalMember(owner = "client!mm", name = "rc", descriptor = "I")
    public int field4896 = -1;

    @OriginalMember(owner = "client!mm", name = "Fc", descriptor = "F")
    public float field4910 = -1.0F;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    public int field4826 = 50;

    @OriginalMember(owner = "client!mm", name = "tc", descriptor = "I")
    public int field4898 = 0;

    @OriginalMember(owner = "client!mm", name = "Rc", descriptor = "I")
    private int field4922 = -1;

    @OriginalMember(owner = "client!mm", name = "Bc", descriptor = "I")
    public int field4906 = 3584;

    @OriginalMember(owner = "client!mm", name = "oc", descriptor = "[F")
    private float[] field4893 = new float[16];

    @OriginalMember(owner = "client!mm", name = "Kc", descriptor = "I")
    public int field4915 = -1;

    @OriginalMember(owner = "client!mm", name = "Uc", descriptor = "I")
    public int field4925 = 512;

    @OriginalMember(owner = "client!mm", name = "Oc", descriptor = "[F")
    private float[] field4919 = new float[4];

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4802;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Lgf;")
    public class202 field4797;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Ljaggl/context;")
    private context field4795;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Ljaggl/opengl;")
    public opengl field4794;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "Z")
    public boolean field4829;

    @OriginalMember(owner = "client!mm", name = "Jb", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "Ljava/lang/String;")
    private String field4827;

    @OriginalMember(owner = "client!mm", name = "Ic", descriptor = "Ljava/lang/String;")
    private String field4913;

    @OriginalMember(owner = "client!mm", name = "gc", descriptor = "Z")
    private boolean field4885;

    @OriginalMember(owner = "client!mm", name = "qc", descriptor = "Z")
    public boolean field4895;

    @OriginalMember(owner = "client!mm", name = "Dc", descriptor = "Z")
    public boolean field4908;

    @OriginalMember(owner = "client!mm", name = "Db", descriptor = "Z")
    public boolean field4856;

    @OriginalMember(owner = "client!mm", name = "kb", descriptor = "Z")
    private boolean field4837;

    @OriginalMember(owner = "client!mm", name = "gb", descriptor = "Z")
    public boolean field4833;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "Lkq;")
    public class89 field4804;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Lba;")
    private class272 field4800;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "Lkc;")
    private class437 field4801;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "Lam;")
    private class288 field4796;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "[I")
    private static int[] field4793 = new int[1000];

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "[F")
    private static float[] field4798 = new float[4];

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4803 = Boolean.FALSE;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "[F")
    private static float[] field4792 = new float[4];

    @OriginalMember(owner = "client!mm", name = "eb", descriptor = "F")
    private float field4831;

    @OriginalMember(owner = "client!mm", name = "ib", descriptor = "F")
    private float field4835;

    @OriginalMember(owner = "client!mm", name = "pb", descriptor = "F")
    public float field4842;

    @OriginalMember(owner = "client!mm", name = "qb", descriptor = "F")
    public float field4843;

    @OriginalMember(owner = "client!mm", name = "vb", descriptor = "F")
    public float field4848;

    @OriginalMember(owner = "client!mm", name = "Pb", descriptor = "F")
    public float field4868;

    @OriginalMember(owner = "client!mm", name = "jc", descriptor = "F")
    public float field4888;

    @OriginalMember(owner = "client!mm", name = "vc", descriptor = "F")
    public float field4900;

    @OriginalMember(owner = "client!mm", name = "xc", descriptor = "F")
    public float field4902;

    @OriginalMember(owner = "client!mm", name = "Ac", descriptor = "F")
    public float field4905;

    @OriginalMember(owner = "client!mm", name = "Pc", descriptor = "F")
    private float field4920;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public int field4807;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    private int field4810;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public int field4813;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public int field4815;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!mm", name = "db", descriptor = "I")
    private int field4830;

    @OriginalMember(owner = "client!mm", name = "rb", descriptor = "I")
    private int field4844;

    @OriginalMember(owner = "client!mm", name = "sb", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!mm", name = "tb", descriptor = "I")
    public int field4846;

    @OriginalMember(owner = "client!mm", name = "xb", descriptor = "I")
    private int field4850;

    @OriginalMember(owner = "client!mm", name = "Ab", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!mm", name = "Fb", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!mm", name = "ic", descriptor = "I")
    public int field4887;

    @OriginalMember(owner = "client!mm", name = "pc", descriptor = "I")
    private int field4894;

    @OriginalMember(owner = "client!mm", name = "yc", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!mm", name = "Cc", descriptor = "I")
    private int field4907;

    @OriginalMember(owner = "client!mm", name = "Wc", descriptor = "I")
    private int field4927;

    @OriginalMember(owner = "client!mm", name = "Xc", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!mm", name = "kc", descriptor = "J")
    private long field4889;

    @OriginalMember(owner = "client!mm", name = "Wb", descriptor = "Lke;")
    private class164 field4875;

    @OriginalMember(owner = "client!mm", name = "Vb", descriptor = "Lvj;")
    private class179 field4874;

    @OriginalMember(owner = "client!mm", name = "Mc", descriptor = "Lq;")
    private class205 field4917;

    @OriginalMember(owner = "client!mm", name = "bc", descriptor = "Lhn;")
    public class257 field4880;

    @OriginalMember(owner = "client!mm", name = "mc", descriptor = "Lhn;")
    public class257 field4891;

    @OriginalMember(owner = "client!mm", name = "Vc", descriptor = "Lhn;")
    public class257 field4926;

    @OriginalMember(owner = "client!mm", name = "fb", descriptor = "Lkf;")
    public class295 field4832;

    @OriginalMember(owner = "client!mm", name = "ub", descriptor = "Lkf;")
    public class295 field4847;

    @OriginalMember(owner = "client!mm", name = "Ub", descriptor = "Lkf;")
    public class295 field4873;

    @OriginalMember(owner = "client!mm", name = "sc", descriptor = "Lkf;")
    public class295 field4897;

    @OriginalMember(owner = "client!mm", name = "Gc", descriptor = "Lkf;")
    public class295 field4911;

    @OriginalMember(owner = "client!mm", name = "Tc", descriptor = "Lkf;")
    public class295 field4924;

    @OriginalMember(owner = "client!mm", name = "uc", descriptor = "Ldc;")
    private class377 field4899;

    @OriginalMember(owner = "client!mm", name = "Sc", descriptor = "Lqd;")
    public class3 field4923;

    @OriginalMember(owner = "client!mm", name = "Lc", descriptor = "Lvh;")
    public class433 field4916;

    @OriginalMember(owner = "client!mm", name = "Nc", descriptor = "Lvh;")
    public class433 field4918;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "Lsj;")
    private class73 field4812;

    @OriginalMember(owner = "client!mm", name = "nb", descriptor = "Z")
    private boolean field4840;

    @OriginalMember(owner = "client!mm", name = "yb", descriptor = "Z")
    public boolean field4851;

    @OriginalMember(owner = "client!mm", name = "Bb", descriptor = "Z")
    private boolean field4854;

    @OriginalMember(owner = "client!mm", name = "Eb", descriptor = "Z")
    private boolean field4857;

    @OriginalMember(owner = "client!mm", name = "Hb", descriptor = "Z")
    private boolean field4860;

    @OriginalMember(owner = "client!mm", name = "Rb", descriptor = "Z")
    public boolean field4870;

    @OriginalMember(owner = "client!mm", name = "Zb", descriptor = "Z")
    private boolean field4878;

    @OriginalMember(owner = "client!mm", name = "ac", descriptor = "Z")
    public boolean field4879;

    @OriginalMember(owner = "client!mm", name = "ec", descriptor = "Z")
    private boolean field4883;

    @OriginalMember(owner = "client!mm", name = "lc", descriptor = "Z")
    private boolean field4890;

    @OriginalMember(owner = "client!mm", name = "nc", descriptor = "Z")
    private boolean field4892;

    @OriginalMember(owner = "client!mm", name = "wc", descriptor = "Z")
    public boolean field4901;

    @OriginalMember(owner = "client!mm", name = "zc", descriptor = "Z")
    private boolean field4904;

    @OriginalMember(owner = "client!mm", name = "Ec", descriptor = "Z")
    private boolean field4909;

    @OriginalMember(owner = "client!mm", name = "Qc", descriptor = "Z")
    public boolean field4921;

    @OriginalMember(owner = "client!mm", name = "Gb", descriptor = "[Lt;")
    private class321[] field4859;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(Z)V", line = 6)
    public final void method2140(boolean arg0) {
        if (this.field4878 != arg0) {
            this.field4878 = arg0;
            this.method2189();
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(Z)V", line = 14)
    public final void method2141(boolean arg0) {
        if (this.field4890 != arg0) {
            this.field4890 = arg0;
            this.method2161();
            this.field4894 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "()V", line = 23)
    private final void method2142() {
        this.field4918 = new class433();
        this.field4916 = new class433();
        this.field4859 = new class321[this.field4845];
        this.field4880 = new class257(this, 3553, 6408, 1, 1);
        this.field4891 = new class257(this, 3553, 6408, 1, 1);
        this.field4926 = new class257(this, 3553, 6408, 1, 1);
        this.field4911 = new class295(this);
        this.field4924 = new class295(this);
        this.field4873 = new class295(this);
        this.field4897 = new class295(this);
        this.field4832 = new class295(this);
        this.field4847 = new class295(this);
        if (this.field4833) {
            this.field4923 = new class3(this);
        }
        this.field4799.method2361(this);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lvl;Lvl;Lvl;Lvl;)V", line = 44)
    public final void method2143(class376 arg0, class376 arg1, class376 arg2, class376 arg3) {
        if (arg0 == null) {
            this.field4794.glDisableClientState(32884);
        } else {
            this.field4794.glEnableClientState(32884);
            arg0.method2350(true);
        }
        if (arg1 == null) {
            this.field4794.glDisableClientState(32885);
        } else {
            this.field4794.glEnableClientState(32885);
            arg1.method2352(-22955);
        }
        if (arg2 == null) {
            this.field4794.glDisableClientState(32886);
        } else {
            this.field4794.glEnableClientState(32886);
            arg2.method2349((byte) -125);
        }
        if (arg3 == null) {
            this.field4794.glDisableClientState(32888);
        } else {
            this.field4794.glEnableClientState(32888);
            arg3.method2351((byte) -122);
        }
    }

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "()Z", line = 78)
    public final boolean method223() {
        return this.field4860;
    }

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "()Z", line = 81)
    public final boolean method226() {
        return this.field4796.method470((byte) -76);
    }

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "()Lve;", line = 85)
    public final class309 method210() {
        return this.field4805;
    }

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "()I", line = 90)
    public final int method203() {
        int var1 = this.field4927;
        this.field4927 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lts;Lns;Lve;Luh;I)V", line = 95)
    public final void method172(class116 arg0, class174 arg1, class309 arg2, class153 arg3, int arg4) {
        arg0.method896(arg2, arg3, arg4);
        this.method219(arg1);
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(I)V", line = 102)
    public final synchronized void method2144(int arg0) {
        class166 var2 = new class166(arg0);
        this.field4821.method1162(112, var2);
    }

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "()V", line = 107)
    private final void method2145() {
        float[] var1 = this.field4893;
        float var2 = (float) (-this.field4898 * this.field4826) / (float) this.field4849;
        float var3 = (float) ((this.field4813 - this.field4898) * this.field4826) / (float) this.field4849;
        float var4 = (float) (this.field4865 * this.field4826) / (float) this.field4925;
        float var5 = (float) ((this.field4865 - this.field4814) * this.field4826) / (float) this.field4925;
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
            float var6 = (float) this.field4826 * 2.0F;
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
            var1[10] = this.field4835 = (float) (-(this.field4906 + this.field4826)) / (float) (this.field4906 - this.field4826);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field4920 = -((float) this.field4906 * var6) / (float) (this.field4906 - this.field4826);
            var1[15] = 0.0F;
        }
        this.method2175();
    }

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "()Lfq;", line = 160)
    public final class180 method2146() {
        return this.field4875 == null ? null : this.field4875.method755(-17479);
    }

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "()V", line = 163)
    private final void method2147() {
        field4798[0] = this.field4886 * this.field4852;
        field4798[1] = this.field4914 * this.field4852;
        field4798[2] = this.field4852 * this.field4838;
        field4798[3] = 1.0F;
        this.field4794.glLightfv(16384, 4609, field4798, 0);
        field4798[0] = -this.field4910 * this.field4886;
        field4798[1] = -this.field4910 * this.field4914;
        field4798[2] = -this.field4910 * this.field4838;
        field4798[3] = 1.0F;
        this.field4794.glLightfv(16385, 4609, field4798, 0);
    }

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "()V", line = 178)
    private final void method2148() {
        int var1;
        if (this.field4879) {
            this.field4794.glFogf(2915, 0.0F);
            this.field4794.glFogf(2916, 1.0F);
            var1 = this.field4876;
        } else {
            this.field4831 = (float) (this.field4906 - 256) - this.field4855;
            this.field4902 = this.field4831 - (float) this.field4915 * this.field4871;
            if (this.field4902 < (float) this.field4826) {
                this.field4902 = (float) this.field4826;
            }
            this.field4794.glFogf(2915, this.field4902);
            this.field4794.glFogf(2916, this.field4831);
            var1 = this.field4863;
        }
        field4798[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4798[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4798[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4794.glFogfv(2918, field4798, 0);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIII)V", line = 204)
    public final void method206(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4861 < arg0) {
            this.field4861 = arg0;
        }
        if (this.field4867 > arg2) {
            this.field4867 = arg2;
        }
        if (this.field4834 < arg1) {
            this.field4834 = arg1;
        }
        if (this.field4864 > arg3) {
            this.field4864 = arg3;
        }
        this.field4794.glEnable(3089);
        this.method2199();
        this.method2160();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III[I)V", line = 222)
    public final void method243(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4918.field6131 + (float) arg0 * this.field4918.field6125 + (float) arg1 * this.field4918.field6133 + this.field4918.field6132;
        if ((var5 < (float) this.field4826) || (var5 > (float) this.field4906)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4918.field6137 + (float) arg0 * this.field4918.field6130 + (float) arg1 * this.field4918.field6128 + this.field4918.field6127) * (float) this.field4849 / var5);
        int var7 = (int) (((float) arg2 * this.field4918.field6126 + (float) arg0 * this.field4918.field6129 + (float) arg1 * this.field4918.field6134 + this.field4918.field6135) * (float) this.field4925 / var5);
        if ((float) var6 >= this.field4868 && (float) var6 <= this.field4843 && (float) var7 >= this.field4888 && (float) var7 <= this.field4842) {
            arg3[0] = (int) ((float) var6 - this.field4868);
            arg3[1] = (int) ((float) var7 - this.field4888);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)V", line = 248)
    public final void method175(int arg0, int arg1, int arg2) {
        this.field4879 = true;
        this.field4876 = arg1;
        this.field4896 = arg2;
        this.method2148();
        this.method2161();
        this.field4800.method1725(false, false, 3, (byte) -101);
        this.field4800.method1728(true, arg0, 110);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIII)V", line = 259)
    public final void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4794.glLineWidth((float) arg5);
        this.method250(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4794.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "()V", line = 266)
    private final void method2149() {
        if (this.field4894 == 1) {
            return;
        }
        this.method2154();
        this.method2141(false);
        this.method2198(false);
        this.method2204(false);
        this.method2174(false);
        this.method2180((class321) null);
        this.method2169(-2);
        this.method2158(0);
        this.field4894 = 1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lq;", line = 281)
    public final class205 method2150(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class205) (this.field4885 && !arg2 || this.field4837 ? new class74(this, arg0, arg1, arg2) : new class315(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(FF)V", line = 291)
    public final void method2151(float arg0, float arg1) {
        this.field4871 = arg0;
        this.field4855 = arg1;
        if (!this.field4879) {
            this.method2148();
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIIIII)V", line = 303)
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2149();
        this.method2195(arg5);
        this.field4794.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4860) {
            this.field4794.glDisable(32925);
        }
        this.field4794.glBegin(2);
        this.field4794.glVertex2f(var7, var8);
        this.field4794.glVertex2f(var7, var10);
        this.field4794.glVertex2f(var9, var10);
        this.field4794.glVertex2f(var9, var8);
        this.field4794.glEnd();
        if (this.field4860) {
            this.field4794.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 327)
    public final void method240(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 332)
    public final void method185(Rectangle[] arg0, int arg1) {
        this.method169();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(F)V", line = 337)
    public final void method248(float arg0) {
        if (this.field4900 != arg0) {
            this.field4900 = arg0;
            this.method2162();
        }
    }

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "()V", line = 347)
    public final void method257() {
        this.field4801.method2693();
    }

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "()V", line = 355)
    public final void method2152() {
        this.field4794.glLightfv(16384, 4611, this.field4828, 0);
        this.field4794.glLightfv(16385, 4611, this.field4877, 0);
    }

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "()V", line = 360)
    public final void method2153() {
        if (this.field4830 != 2) {
            this.field4830 = 2;
            this.method2200();
            this.method2206();
            this.field4894 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "()Z", line = 371)
    public final boolean method259() {
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([Lts;Lve;[Luh;I)V", line = 377)
    public final void method167(class116[] arg0, class309 arg1, class153[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method896(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "()V", line = 390)
    public final void method202() {
        this.method2174(true);
        this.field4794.glClear(256);
    }

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "()V", line = 394)
    private final void method2154() {
        if (this.field4830 == 1) {
            return;
        }
        this.field4794.glMatrixMode(5889);
        this.field4794.glLoadIdentity();
        if (this.field4813 > 0 && this.field4814 > 0) {
            this.field4794.glOrtho(0.0D, (double) this.field4813, (double) this.field4814, 0.0D, -1.0D, 1.0D);
        }
        this.field4794.glMatrixMode(5888);
        this.field4794.glLoadIdentity();
        this.field4830 = 1;
        this.field4894 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IFFFFF)V", line = 412)
    public final void method171(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4922 != arg0;
        if (var7 || this.field4852 != arg1 || this.field4910 != arg2) {
            this.field4922 = arg0;
            this.field4852 = arg1;
            this.field4910 = arg2;
            if (var7) {
                this.field4886 = (float) (this.field4922 & 0xFF0000) / 1.671168E7F;
                this.field4914 = (float) (this.field4922 & 0xFFFF) / 65535.0F;
                this.field4838 = (float) (this.field4922 & 0xFF) / 255.0F;
                this.method2162();
            }
            this.method2147();
        }
        if (this.field4919[0] == arg3 && this.field4919[1] == arg4 && this.field4919[2] == arg5) {
            return;
        }
        this.field4919[0] = arg3;
        this.field4919[1] = arg4;
        this.field4919[2] = arg5;
        this.field4872[0] = -arg3;
        this.field4872[1] = -arg4;
        this.field4872[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4828[0] = arg3 * var8;
        this.field4828[1] = arg4 * var8;
        this.field4828[2] = arg5 * var8;
        this.field4877[0] = -this.field4828[0];
        this.field4877[1] = -this.field4828[1];
        this.field4877[2] = -this.field4828[2];
        this.method2152();
        this.field4887 = (int) (arg3 * 256.0F / arg4);
        this.field4846 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Llf;)V", line = 452)
    public final void method231(class341 arg0) {
    }

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "()I", line = 455)
    public final int method200() {
        return this.field4815 + this.field4807 + this.field4810;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILde;II)V", line = 460)
    public final void method214(int arg0, class165 arg1, int arg2, int arg3) {
        class360 var5 = (class360) arg1;
        class179 var6 = var5.field4976;
        this.method2173();
        this.method2180(var5.field4976);
        this.method2195(1);
        this.method2212(7681, 8448);
        this.method2187(0, 34167, 768);
        float var7 = var6.field2552 / (float) var6.field2551;
        float var8 = var6.field2548 / (float) var6.field2549;
        this.field4794.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4794.glBegin(7);
        this.field4794.glTexCoord2f((float) (this.field4861 - arg2) * var7, (float) (this.field4834 - arg3) * var8);
        this.field4794.glVertex2i(this.field4861, this.field4834);
        this.field4794.glTexCoord2f((float) (this.field4861 - arg2) * var7, (float) (this.field4864 - arg3) * var8);
        this.field4794.glVertex2i(this.field4861, this.field4864);
        this.field4794.glTexCoord2f((float) (this.field4867 - arg2) * var7, (float) (this.field4864 - arg3) * var8);
        this.field4794.glVertex2i(this.field4867, this.field4864);
        this.field4794.glTexCoord2f((float) (this.field4867 - arg2) * var7, (float) (this.field4834 - arg3) * var8);
        this.field4794.glVertex2i(this.field4867, this.field4834);
        this.field4794.glEnd();
        this.method2187(0, 5890, 768);
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(II)V", line = 487)
    public final synchronized void method2155(int arg0, int arg1) {
        class166 var3 = new class166(arg1);
        var3.field4226 = (long) arg0;
        this.field4819.method1162(115, var3);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIII)V", line = 494)
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        this.field4801.method2692(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "()I", line = 498)
    public final int method253() {
        return this.field4906;
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(II)V", line = 504)
    public final synchronized void method2156(int arg0, int arg1) {
        class166 var3 = new class166(arg1);
        var3.field4226 = (long) arg0;
        this.field4821.method1162(125, var3);
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "()Lve;", line = 509)
    public final class309 method220() {
        return new class433();
    }

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "()Z", line = 515)
    public final boolean method192() {
        if (!this.field4796.method470((byte) -93)) {
            if (!this.field4801.method2689(this.field4796)) {
                return false;
            }
            this.field4804.method712(2989);
        }
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "()V", line = 530)
    public final void method204() {
        this.field4861 = 0;
        this.field4834 = 0;
        this.field4867 = this.field4813;
        this.field4864 = this.field4814;
        this.field4794.glDisable(3089);
        this.method2199();
    }

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "()V", line = 539)
    public final void method2157() {
        if (this.field4894 == 4) {
            return;
        }
        this.method2154();
        this.method2141(false);
        this.method2198(false);
        this.method2204(false);
        this.method2174(false);
        this.method2169(-2);
        this.method2195(1);
        this.method2158(1);
        this.field4894 = 4;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[[I[[IIII)Ldn;", line = 555)
    public final class323 method230(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class384(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 560)
    public final void method194(int arg0, int arg1, int arg2, int arg3) {
        this.field4898 = arg0;
        this.field4865 = arg1;
        this.field4849 = arg2;
        this.field4925 = arg3;
        this.method2145();
        this.method2199();
        if (this.field4830 == 3) {
            this.method2186();
        } else if (this.field4830 == 2) {
            this.method2200();
        }
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "(I)V", line = 575)
    public final void method2158(int arg0) {
        if (arg0 == 0) {
            this.method2212(7681, 7681);
        } else if (arg0 == 1) {
            this.method2212(8448, 8448);
        } else if (arg0 == 2) {
            this.method2212(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIII)V", line = 588)
    public final void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "()Z", line = 590)
    public final boolean method197() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "()V", line = 594)
    public final void method2159() {
        if (this.field4830 != 0) {
            this.field4830 = 0;
            this.field4894 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "()V", line = 602)
    private final void method2160() {
        if (this.field4861 <= this.field4867 && this.field4834 <= this.field4864) {
            this.field4794.glScissor(this.field4869 + this.field4861, this.field4881 + this.field4814 - this.field4864, this.field4867 - this.field4861, this.field4864 - this.field4834);
        } else {
            this.field4794.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 609)
    public final void method181(int arg0) {
        this.method2194();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIIII)V", line = 614)
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2149();
        this.method2195(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4794.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4794.glBegin(1);
        this.field4794.glVertex2f(var6, var7);
        this.field4794.glVertex2f(var6, (float) arg2 + var7);
        this.field4794.glEnd();
    }

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "()V", line = 627)
    private final void method2161() {
        if (this.field4890 && this.field4879 | this.field4915 >= 0) {
            this.field4794.glEnable(2912);
        } else {
            this.field4794.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "()V", line = 634)
    private final void method2162() {
        field4798[0] = this.field4900 * this.field4886;
        field4798[1] = this.field4914 * this.field4900;
        field4798[2] = this.field4900 * this.field4838;
        field4798[3] = 1.0F;
        this.field4794.glLightModelfv(2899, field4798, 0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V", line = 645)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "()V", line = 649)
    private final void method2163() {
        try {
            this.field4795.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "()V", line = 658)
    public final void method228() {
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "(I)V", line = 661)
    public final synchronized void method2164(int arg0) {
        class166 var2 = new class166(arg0);
        this.field4823.method1162(112, var2);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()Z", line = 665)
    public final boolean method252() {
        return !this.field4904;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)Z", line = 669)
    public final boolean method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4918.field6131 + (float) arg0 * this.field4918.field6125 + (float) arg1 * this.field4918.field6133 + this.field4918.field6132;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4918.field6131 + (float) arg3 * this.field4918.field6125 + (float) arg4 * this.field4918.field6133 + this.field4918.field6132;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4826) || !(var8 < (float) this.field4826)) || !(!(var7 > (float) this.field4906) || !(var8 > (float) this.field4906))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4918.field6137 + (float) arg0 * this.field4918.field6130 + (float) arg1 * this.field4918.field6128 + this.field4918.field6127) * (float) this.field4849 / var7);
        int var10 = (int) (((float) arg5 * this.field4918.field6137 + (float) arg3 * this.field4918.field6130 + (float) arg4 * this.field4918.field6128 + this.field4918.field6127) * (float) this.field4849 / var8);
        if ((float) var9 < this.field4868 && (float) var10 < this.field4868 || (float) var9 > this.field4843 && (float) var10 > this.field4843) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4918.field6126 + (float) arg0 * this.field4918.field6129 + (float) arg1 * this.field4918.field6134 + this.field4918.field6135) * (float) this.field4925 / var7);
            int var12 = (int) (((float) arg5 * this.field4918.field6126 + (float) arg3 * this.field4918.field6129 + (float) arg4 * this.field4918.field6134 + this.field4918.field6135) * (float) this.field4925 / var8);
            return (!((float) var11 < this.field4888) || !((float) var12 < this.field4888)) && (!((float) var11 > this.field4842) || !((float) var12 > this.field4842));
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V", line = 699)
    public final void method207(boolean arg0) {
    }

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "()I", line = 703)
    private final int method2165() {
        int var1 = 0;
        this.field4827 = this.field4794.glGetString(7936);
        this.field4913 = this.field4794.glGetString(7937);
        String var2 = this.field4827.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4794.glGetString(7938);
        String[] var4 = class6.method27((byte) 74, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class388.method2418(108, var4[0]);
                int var6 = class388.method2418(86, var4[1]);
                this.field4825 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4825 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4794.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4794.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4794.glGetIntegerv(34018, var8, 0);
        this.field4845 = var8[0];
        this.field4794.glGetIntegerv(34929, var8, 0);
        this.field4903 = var8[0];
        this.field4794.glGetIntegerv(34930, var8, 0);
        this.field4858 = var8[0];
        if (this.field4845 < 2 || this.field4903 < 2 || this.field4858 < 2) {
            var1 |= 0x10;
        }
        this.field4904 = class76.field1083 != null && class76.field1083.startsWith("mac");
        this.field4829 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4885 = this.field4794.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4860 = this.field4794.isExtensionAvailable("GL_ARB_multisample");
        this.field4921 = this.field4794.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4794.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4794.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4851 = this.field4794.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4895 = this.field4794.isExtensionAvailable("GL_EXT_texture3D");
        this.field4856 = this.field4794.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4870 = this.field4794.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4908 = this.field4794.isExtensionAvailable("GL_ARB_texture_float");
        this.field4901 = false;
        this.field4833 = this.field4794.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 776)
    public final void method165(boolean arg0) {
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(III)V", line = 778)
    public final void method2166(int arg0, int arg1, int arg2) {
        this.field4794.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I", line = 787)
    public final int method213(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "()V", line = 790)
    private final void method2167() {
        if (this.field4830 != 3) {
            this.field4830 = 3;
            this.method2186();
            this.method2206();
            this.field4894 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V", line = 802)
    public final void method235(boolean arg0) {
        this.field4841 = arg0;
        this.method2171();
    }

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "()V", line = 808)
    public final void method201() {
        this.field4800.method1725(false, false, 0, (byte) -110);
        this.field4879 = false;
        this.method2148();
        this.method2161();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lve;)V", line = 816)
    public final void method168(class309 arg0) {
        this.field4918 = (class433) arg0;
        this.field4916.method2672((byte) -116, this.field4918);
        if (this.field4830 != 1) {
            this.method2206();
        }
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()Z", line = 823)
    public final boolean method218() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "()I", line = 827)
    public final int method264() {
        return 4;
    }

    @OriginalMember(owner = "client!mm", name = "db", descriptor = "()V", line = 830)
    public final void method2168() {
        this.field4794.glPopMatrix();
    }

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "()Z", line = 835)
    public final boolean method216() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "(I)V", line = 842)
    public final void method2169(int arg0) {
        this.method2183(arg0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lci;[Ljf;Z)Lok;", line = 847)
    public final class61 method262(class389 arg0, class96[] arg1, boolean arg2) {
        return new class44(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "(I)V", line = 850)
    public final void method2170(int arg0) {
        field4798[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4798[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4798[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4798[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4794.glTexEnvfv(8960, 8705, field4798, 0);
    }

    @OriginalMember(owner = "client!mm", name = "eb", descriptor = "()V", line = 859)
    private final void method2171() {
        this.field4794.glDepthMask(this.field4857 && this.field4841);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZZ)V", line = 862)
    public final void method2172(int arg0, boolean arg1, boolean arg2) {
        if (this.field4907 != arg0) {
            if (arg0 < 0) {
                this.method2185();
                this.method2180((class321) null);
                if (!this.field4879) {
                    this.field4800.method1725(arg2, arg1, 0, (byte) -76);
                }
            } else {
                class257 var4 = this.field4804.method713(arg0, 64);
                class55 var5 = this.field4797.method1366(arg0, -11039);
                if (var5.field722 == 0 && var5.field721 == 0) {
                    this.method2185();
                } else {
                    int var6 = var5.field708 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2197((float) (this.field4817 % var7 * var5.field722) / (float) var7, (float) (this.field4817 % var7 * var5.field721) / (float) var7, 0.0F);
                }
                if (this.field4879) {
                    this.field4800.method1725(arg2, arg1, 3, (byte) -76);
                    this.method2180(var4);
                } else {
                    this.field4800.method1725(arg2, arg1, var5.field707, (byte) -119);
                    this.field4800.method1728(false, var5.field710, 115);
                    if (!this.field4800.method1727(var4, (byte) 118)) {
                        this.method2180(var4);
                    }
                }
            }
            this.field4907 = arg0;
        }
        this.field4894 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsg;Lsg;FLsg;)Lsg;", line = 912)
    public final class267 method255(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        if (arg0 != null && arg1 != null && this.field4870 && this.field4833) {
            class97 var5 = null;
            class164 var6 = (class164) arg0;
            class164 var7 = (class164) arg1;
            class180 var8 = var6.method755(-17479);
            class180 var9 = var7.method755(-17479);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2553 > var9.field2553 ? var8.field2553 : var9.field2553;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class97) {
                    class97 var11 = (class97) arg3;
                    if (var11.method754(3553) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class97(this, var10);
                }
                var5.method753(6408, var8, var9, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "()I", line = 952)
    public final int method215() {
        int var1 = this.field4928;
        this.field4928 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "()I", line = 957)
    public final int method258() {
        return this.field4826;
    }

    @OriginalMember(owner = "client!mm", name = "fb", descriptor = "()V", line = 960)
    public final void method2173() {
        if (this.field4894 == 2) {
            return;
        }
        this.method2154();
        this.method2141(false);
        this.method2198(false);
        this.method2204(false);
        this.method2174(false);
        this.method2169(-2);
        this.field4894 = 2;
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(Z)V", line = 973)
    public final void method2174(boolean arg0) {
        if (this.field4857 != arg0) {
            this.field4857 = arg0;
            this.method2171();
            this.field4894 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsg;)V", line = 982)
    public final void method256(class267 arg0) {
        this.field4875 = (class164) arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIZ)Lwn;", line = 985)
    public final class77 method177(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class197(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "()Z", line = 988)
    public final boolean method211() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "gb", descriptor = "()V", line = 991)
    private final void method2175() {
        if (this.field4848 == 0.0F) {
            this.field4893[10] = this.field4835;
            this.field4893[14] = this.field4920;
        } else {
            float var1 = this.field4905 / (this.field4905 + this.field4848);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4920 * (1.0F - var1) / this.field4848;
            this.field4893[10] = this.field4835 + var3;
            this.field4893[14] = this.field4920 * var2;
        }
        this.field4836 = (this.field4893[14] - (float) this.field4906) / this.field4893[10];
        this.field4912 = (float) this.field4906 - this.field4848;
    }

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "()Z", line = 1016)
    public final boolean method263() {
        return this.field4796.method1778();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ldc;III)V", line = 1021)
    public final void method2176(class377 arg0, int arg1, int arg2, int arg3) {
        this.method2178(arg0);
        arg0.method1532(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BIZ)Lq;", line = 1027)
    public final class205 method2177(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class205) (this.field4885 && !arg3 || this.field4837 ? new class74(this, arg0, arg1, arg2, arg3) : new class315(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ldc;)V", line = 1035)
    public final void method2178(class377 arg0) {
        if (this.field4899 != arg0 && this.field4885) {
            this.field4794.glBindBufferARB(34963, arg0.method578());
            this.field4899 = arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)I", line = 1044)
    public final int method187(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()V", line = 1050)
    public final void method169() {
        try {
            this.field4795.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFFF)V", line = 1059)
    public final void method2179(float arg0, float arg1, float arg2, float arg3) {
        field4798[0] = arg0;
        field4798[1] = arg1;
        field4798[2] = arg2;
        field4798[3] = arg3;
        this.field4794.glTexEnvfv(8960, 8705, field4798, 0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lt;)V", line = 1069)
    public final void method2180(class321 arg0) {
        class321 var2 = this.field4859[this.field4844];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4794.glDisable(var2.field4369);
            } else {
                if (var2 == null) {
                    this.field4794.glEnable(arg0.field4369);
                } else if (arg0.field4369 != var2.field4369) {
                    this.field4794.glDisable(var2.field4369);
                    this.field4794.glEnable(arg0.field4369);
                }
                this.field4794.glBindTexture(arg0.field4369, arg0.method1964());
            }
            this.field4859[this.field4844] = arg0;
        }
        this.field4894 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(F)V", line = 1100)
    public final void method2181(float arg0) {
        if (this.field4839 != arg0) {
            this.field4839 = arg0;
            if (this.field4830 == 3) {
                this.method2186();
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "()F", line = 1110)
    public final float method268() {
        return this.field4905;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[Lbn;)V", line = 1116)
    public final void method247(int arg0, class155[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class155 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4792[0] = (float) var4.field2204;
            field4792[1] = (float) var4.field2205;
            field4792[2] = (float) var4.field2212;
            field4792[3] = 1.0F;
            this.field4794.glLightfv(var5, 4611, field4792, 0);
            int var6 = var4.field2203;
            float var7 = var4.field2209 / 255.0F;
            field4792[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4792[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4792[2] = (float) (var6 & 0xFF) * var7;
            this.field4794.glLightfv(var5, 4609, field4792, 0);
            this.field4794.glLightf(var5, 4617, 1.0F / (float) (var4.field2206 * var4.field2206));
            this.field4794.glEnable(var5);
        }
        while (var3 < this.field4882) {
            this.field4794.glDisable(var3 + 16386);
            var3++;
        }
        this.field4882 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "hb", descriptor = "()V", line = 1155)
    private final void method2182() {
        this.method2169(-2);
        for (int var1 = this.field4845 - 1; var1 >= 0; var1--) {
            this.method2196(var1);
            this.method2180((class321) null);
            this.field4794.glTexEnvi(8960, 8704, 34160);
        }
        this.method2212(8448, 8448);
        this.method2187(2, 34168, 770);
        this.method2185();
        this.field4850 = 1;
        this.field4794.glEnable(3042);
        this.field4794.glBlendFunc(770, 771);
        this.field4853 = 1;
        this.field4794.glEnable(3008);
        this.field4794.glAlphaFunc(516, 0.0F);
        this.field4892 = true;
        this.field4794.glColorMask(true, true, true, true);
        this.field4854 = true;
        this.method2141(true);
        this.method2198(true);
        this.method2204(true);
        this.method2174(true);
        this.method2159();
        this.field4794.setSwapInterval(0);
        this.field4794.glShadeModel(7425);
        this.field4794.glClearDepth(1.0F);
        this.field4794.glDepthFunc(515);
        this.field4794.glPolygonMode(1028, 6914);
        this.field4794.glEnable(2884);
        this.field4794.glCullFace(1029);
        this.field4794.glMatrixMode(5888);
        this.field4794.glLoadIdentity();
        this.field4794.glColorMaterial(1028, 5634);
        this.field4794.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4794.glLightfv(var4, 4608, var2, 0);
            this.field4794.glLightf(var4, 4615, 0.0F);
            this.field4794.glLightf(var4, 4616, 0.0F);
        }
        this.field4794.glEnable(16384);
        this.field4794.glEnable(16385);
        this.field4794.glFogf(2914, 0.95F);
        this.field4794.glFogi(2917, 9729);
        this.field4794.glHint(3156, 4353);
        this.field4922 = this.field4863 = -1;
        this.method204();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V", line = 1226)
    public final void method2183(int arg0, boolean arg1) {
        this.method2172(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "(I)I", line = 1229)
    public final int method2184(int arg0) {
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

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 1265)
    public final void method183(int arg0) {
        this.method2195(0);
        this.field4794.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4794.glClear(16384);
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(IIIIII)Lsg;", line = 1270)
    public final class267 method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4870 ? new class175(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!mm", name = "ib", descriptor = "()V", line = 1273)
    private final void method2185() {
        if (this.field4883) {
            this.field4794.glMatrixMode(5890);
            this.field4794.glLoadIdentity();
            this.field4794.glMatrixMode(5888);
            this.field4883 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "jb", descriptor = "()V", line = 1285)
    private final void method2186() {
        float var1 = (float) (-this.field4898) * this.field4839 / (float) this.field4849;
        float var2 = (float) (-this.field4865) * this.field4839 / (float) this.field4925;
        float var3 = (float) (this.field4813 - this.field4898) * this.field4839 / (float) this.field4849;
        float var4 = (float) (this.field4814 - this.field4865) * this.field4839 / (float) this.field4925;
        this.field4794.glMatrixMode(5889);
        this.field4794.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field4794.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4826 - this.field4848), (double) ((float) this.field4906 - this.field4848));
        }
        this.field4794.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(III)V", line = 1301)
    public final void method2187(int arg0, int arg1, int arg2) {
        this.field4794.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4794.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([I)V", line = 1307)
    public final void method173(int[] arg0) {
        arg0[0] = this.field4861;
        arg0[1] = this.field4834;
        arg0[2] = this.field4867;
        arg0[3] = this.field4864;
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "()Z", line = 1313)
    public final boolean method186() {
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsj;)V", line = 1316)
    public final void method2188(class73 arg0) {
        if (this.field4809 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4809 >= 0) {
            this.field4816[this.field4809].method17();
        }
        this.field4812 = this.field4816[++this.field4809] = arg0;
        this.field4812.method11();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([IIIII)Lwn;", line = 1326)
    public final class77 method232(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class197(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "kb", descriptor = "()V", line = 1329)
    private final void method2189() {
        if (this.field4840 && !this.field4878) {
            this.field4794.glEnable(2896);
        } else {
            this.field4794.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "(I)I", line = 1339)
    public final int method2190(int arg0) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 1351)
    public final void method229(int arg0, int arg1, int arg2) {
        if (!this.field4879) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4876 = arg1;
        this.field4896 = arg2;
        this.method2148();
        this.field4800.method1728(true, arg0, -125);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()I", line = 1362)
    public final int method12() {
        return this.field4814;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lns;)V", line = 1366)
    public final void method219(class174 arg0) {
        this.field4799.method2362(this, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "()V", line = 1372)
    public final void method209() {
        if (this.field4796.method470((byte) -99)) {
            this.field4801.method2690(this.field4796);
            this.field4804.method712(2989);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII[BII)V", line = 1384)
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4874 == null || this.field4874.field3570 < arg2 || this.field4874.field3571 < arg3) {
            this.field4874 = class179.method1267(6408, false, arg3, arg6, 6406, 6406, arg2, this);
            this.field4874.method1659(false, false);
            var10 = this.field4874.field2548;
            var11 = this.field4874.field2552;
        } else {
            this.field4874.method1657(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4874.field2548 / (float) this.field4874.field3571;
            var11 = (float) arg2 * this.field4874.field2552 / (float) this.field4874.field3570;
        }
        this.method2173();
        this.method2180(this.field4874);
        this.method2195(arg8);
        this.field4794.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2170(arg5);
        this.method2212(34165, 34165);
        this.method2187(0, 34166, 768);
        this.method2187(2, 5890, 770);
        this.method2192(0, 34166, 770);
        this.method2192(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4794.glBegin(7);
        this.field4794.glTexCoord2f(0.0F, 0.0F);
        this.field4794.glVertex2f(var12, var13);
        this.field4794.glTexCoord2f(0.0F, var11);
        this.field4794.glVertex2f(var12, var15);
        this.field4794.glTexCoord2f(var10, var11);
        this.field4794.glVertex2f(var14, var15);
        this.field4794.glTexCoord2f(var10, 0.0F);
        this.field4794.glVertex2f(var14, var13);
        this.field4794.glEnd();
        this.method2187(0, 5890, 768);
        this.method2187(2, 34166, 770);
        this.method2192(0, 5890, 770);
        this.method2192(2, 34166, 770);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lsj;)V", line = 1433)
    public final void method2191(class73 arg0) {
        if (this.field4809 < 0 || this.field4816[this.field4809] != arg0) {
            throw new RuntimeException();
        }
        this.field4816[this.field4809--] = null;
        arg0.method17();
        if (this.field4809 >= 0) {
            this.field4812 = this.field4816[this.field4809];
            this.field4812.method11();
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 1446)
    public final void method265(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "()V", line = 1453)
    public final void method266() {
        this.field4813 = this.field4802.getWidth();
        this.field4814 = this.field4802.getHeight();
        this.field4794.glViewport(this.field4869, this.field4881, this.field4813, this.field4814);
        this.method2159();
        this.method204();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(IIIII)V", line = 1463)
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2149();
        this.method2195(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4794.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4794.glBegin(1);
        this.field4794.glVertex2f(var6, var7);
        this.field4794.glVertex2f((float) arg2 + var6, var7);
        this.field4794.glEnd();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(IIIIII)V", line = 1480)
    public final void method245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2149();
        this.method2195(arg5);
        this.field4794.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4860) {
            this.field4794.glDisable(32925);
        }
        this.field4794.glBegin(7);
        this.field4794.glVertex2f(var7, var8);
        this.field4794.glVertex2f(var7, var10);
        this.field4794.glVertex2f(var9, var10);
        this.field4794.glVertex2f(var9, var8);
        this.field4794.glEnd();
        if (this.field4860) {
            this.field4794.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(III)V", line = 1505)
    public final void method2192(int arg0, int arg1, int arg2) {
        this.field4794.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4794.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 1511)
    public final void method176(int arg0, int arg1) {
        if (this.field4863 == arg0 && this.field4915 == arg1) {
            return;
        }
        this.field4863 = arg0;
        this.field4915 = arg1;
        if (!this.field4879) {
            this.method2148();
            this.method2161();
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 1531)
    public final synchronized void method233(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4819.method1167(-80)) {
            class166 var4 = (class166) this.field4819.method1160((byte) -54);
            field4793[var2++] = (int) var4.field4226;
            this.field4807 -= var4.field2342;
            if (var2 == 1000) {
                this.field4794.glDeleteBuffersARB(var2, field4793, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4794.glDeleteBuffersARB(var2, field4793, 0);
            var2 = 0;
        }
        while (!this.field4820.method1167(-125)) {
            class166 var5 = (class166) this.field4820.method1160((byte) 25);
            field4793[var2++] = (int) var5.field4226;
            this.field4815 -= var5.field2342;
            if (var2 == 1000) {
                this.field4794.glDeleteTextures(var2, field4793, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4794.glDeleteTextures(var2, field4793, 0);
            var2 = 0;
        }
        while (!this.field4821.method1167(-82)) {
            class166 var6 = (class166) this.field4821.method1160((byte) -66);
            field4793[var2++] = var6.field2342;
            if (var2 == 1000) {
                this.field4794.glDeleteFramebuffersEXT(var2, field4793, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4794.glDeleteFramebuffersEXT(var2, field4793, 0);
            var2 = 0;
        }
        while (!this.field4822.method1167(-37)) {
            class166 var7 = (class166) this.field4822.method1160((byte) 50);
            field4793[var2++] = (int) var7.field4226;
            this.field4810 -= var7.field2342;
            if (var2 == 1000) {
                this.field4794.glDeleteRenderbuffersEXT(var2, field4793, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4794.glDeleteRenderbuffersEXT(var2, field4793, 0);
            var2 = 0;
        }
        while (!this.field4823.method1167(-112)) {
            class166 var8 = (class166) this.field4823.method1160((byte) -124);
            field4793[var2++] = (int) var8.field4226;
            if (var2 == 1000) {
                this.field4794.glDeleteProgramsARB(var2, field4793, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4794.glDeleteProgramsARB(var2, field4793, 0);
            boolean var9 = false;
        }
        while (!this.field4808.method1167(-57)) {
            class166 var10 = (class166) this.field4808.method1160((byte) 36);
            this.field4794.glDeleteLists((int) var10.field4226, var10.field2342);
        }
        while (!this.field4824.method1167(-83)) {
            class166 var11 = (class166) this.field4824.method1160((byte) 84);
            this.field4794.glDeleteObjectARB(var11.field2342);
        }
        while (!this.field4808.method1167(-85)) {
            class166 var12 = (class166) this.field4808.method1160((byte) 24);
            this.field4794.glDeleteLists((int) var12.field4226, var12.field2342);
        }
        if (this.method200() > 100663296 && class199.method1372(30938) > this.field4889 + 60000L) {
            System.gc();
            this.field4889 = class199.method1372(30938);
        }
        this.field4817 = var3;
    }

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "(I)I", line = 1697)
    public final int method2193(int arg0) {
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

    @OriginalMember(owner = "client!mm", name = "lb", descriptor = "()V", line = 1714)
    private final void method2194() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4795.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class328.method1999(0, 1000L);
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(II)V", line = 1737)
    public final void method238(int arg0, int arg1) {
        if (this.field4826 == arg0 && this.field4906 == arg1) {
            return;
        }
        this.field4826 = arg0;
        this.field4906 = arg1;
        this.method2145();
        this.method2148();
        if (this.field4830 == 3) {
            this.method2186();
        } else if (this.field4830 == 2) {
            this.method2200();
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Llf;", line = 1757)
    public final class341 method236(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "(I)V", line = 1764)
    public final void method2195(int arg0) {
        if (this.field4850 == arg0) {
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
        if (this.field4854 != var3) {
            this.field4794.glColorMask(var3, var3, var3, true);
            this.field4854 = var3;
        }
        if (this.field4892 != var4) {
            if (var4) {
                this.field4794.glEnable(3008);
            } else {
                this.field4794.glDisable(3008);
            }
            this.field4892 = var4;
        }
        if (this.field4853 != var2) {
            if (var2 == 1) {
                this.field4794.glEnable(3042);
                this.field4794.glBlendEquation(32774);
                this.field4794.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4794.glEnable(3042);
                this.field4794.glBlendEquation(32774);
                this.field4794.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4794.glEnable(3042);
                this.field4794.glBlendEquation(32778);
                this.field4794.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4794.glEnable(3042);
                this.field4794.glBlendEquation(32774);
                this.field4794.glBlendFunc(774, 1);
            } else {
                this.field4794.glDisable(3042);
            }
            this.field4853 = var2;
        }
        this.field4850 = arg0;
        this.field4894 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "(I)V", line = 1874)
    public final void method2196(int arg0) {
        if (this.field4844 != arg0) {
            this.field4794.glActiveTexture(arg0 + 33984);
            this.field4844 = arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "()F", line = 1886)
    public final float method188() {
        return this.field4848;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(FFF)V", line = 1889)
    private final void method2197(float arg0, float arg1, float arg2) {
        this.field4794.glMatrixMode(5890);
        if (this.field4883) {
            this.field4794.glLoadIdentity();
        }
        this.field4794.glTranslatef(arg0, arg1, arg2);
        this.field4794.glMatrixMode(5888);
        this.field4883 = true;
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(Z)V", line = 1899)
    public final void method2198(boolean arg0) {
        if (this.field4840 != arg0) {
            this.field4840 = arg0;
            this.method2189();
            this.field4894 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "()Z", line = 1909)
    public final boolean method217() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(IIII)[I", line = 1915)
    public final int[] method239(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4794.glReadPixels(arg0, this.field4814 - arg1 - var6, arg2, 1, 32993, this.field4862, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!mm", name = "mb", descriptor = "()V", line = 1930)
    private final void method2199() {
        this.field4868 = (float) (this.field4861 - this.field4898);
        this.field4843 = (float) (this.field4867 - this.field4898);
        this.field4888 = (float) (this.field4834 - this.field4865);
        this.field4842 = (float) (this.field4864 - this.field4865);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljf;Z)Lwn;", line = 1937)
    public final class77 method199(class96 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field1327 * arg0.field1326];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1321 == null) {
            for (int var8 = 0; var8 < arg0.field1326; var8++) {
                for (int var9 = 0; var9 < arg0.field1327; var9++) {
                    int var10 = arg0.field1324[arg0.field1325[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field1326; var6++) {
                for (int var7 = 0; var7 < arg0.field1327; var7++) {
                    var3[var5++] = arg0.field1321[var4] << 24 | arg0.field1324[arg0.field1325[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class77 var11 = this.method232(var3, 0, arg0.field1327, arg0.field1327, arg0.field1326);
        var11.method621(arg0.field1319, arg0.field1322, arg0.field1323, arg0.field1320);
        return var11;
    }

    @OriginalMember(owner = "client!mm", name = "nb", descriptor = "()V", line = 1992)
    private final void method2200() {
        this.field4794.glMatrixMode(5889);
        this.field4794.glLoadMatrixf(this.field4893, 0);
        this.field4794.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "()Z", line = 2002)
    public final boolean method166() {
        return true;
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "()Z", line = 2005)
    public final boolean method205() {
        return this.field4800.method1726((byte) -42, 3);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V", line = 2011)
    public final void method11() {
    }

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "()V", line = 2016)
    public final void method191() {
        if (this.field4813 <= 0 && this.field4814 <= 0) {
            return;
        }
        int var1 = this.field4861;
        int var2 = this.field4867;
        int var3 = this.field4834;
        int var4 = this.field4864;
        this.method204();
        this.field4794.glReadBuffer(1028);
        this.field4794.glDrawBuffer(1029);
        this.method2159();
        this.method2141(false);
        this.method2198(false);
        this.method2204(false);
        this.method2174(false);
        this.method2180((class321) null);
        this.method2169(-2);
        this.method2158(0);
        this.method2195(0);
        this.field4794.glMatrixMode(5889);
        this.field4794.glLoadIdentity();
        this.field4794.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4794.glMatrixMode(5888);
        this.field4794.glLoadIdentity();
        this.field4794.glRasterPos2i(0, 0);
        this.field4794.glCopyPixels(0, 0, this.field4813, this.field4814, 6144);
        this.field4794.glFlush();
        this.field4794.glReadBuffer(1029);
        this.field4794.glDrawBuffer(1029);
        this.method227(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "(II)V", line = 2053)
    public final synchronized void method2201(int arg0, int arg1) {
        class166 var3 = new class166(arg1);
        var3.field4226 = (long) arg0;
        this.field4820.method1162(126, var3);
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(IIIIII)V", line = 2060)
    public final void method250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2149();
        this.method2195(arg5);
        this.field4794.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4794.glBegin(2);
        this.field4794.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4794.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4794.glEnd();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lq;)V", line = 2069)
    public final void method2202(class205 arg0) {
        if (this.field4917 != arg0 && this.field4885) {
            this.field4794.glBindBufferARB(34962, arg0.method578());
            this.field4917 = arg0;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lvh;)V", line = 2077)
    public final void method2203(class433 arg0) {
        this.field4794.glPushMatrix();
        this.field4794.glMultMatrixf(arg0.method2674((byte) -126), 0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIILde;II)V", line = 2084)
    public final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7, int arg8) {
        class360 var10 = (class360) arg6;
        class179 var11 = var10.field4976;
        this.method2173();
        this.method2180(var10.field4976);
        this.method2195(arg5);
        this.method2212(7681, 8448);
        this.method2187(0, 34167, 768);
        float var12 = var11.field2552 / (float) var11.field2551;
        float var13 = var11.field2548 / (float) var11.field2549;
        this.field4794.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4794.glBegin(1);
        this.field4794.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4794.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4794.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4794.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4794.glEnd();
        this.method2187(0, 5890, 768);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([Lts;Lns;Lve;[Luh;I)V", line = 2110)
    public final void method225(class116[] arg0, class174 arg1, class309 arg2, class153[] arg3, int arg4) {
        this.method167(arg0, arg2, arg3, arg4);
        this.method219(arg1);
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "(Z)V", line = 2114)
    public final void method2204(boolean arg0) {
        if (this.field4909 == arg0) {
            return;
        }
        if (arg0) {
            this.field4794.glEnable(2929);
        } else {
            this.field4794.glDisable(2929);
        }
        this.field4909 = arg0;
        this.field4894 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!mm", name = "ob", descriptor = "()V", line = 2127)
    public final void method2205() {
        if (this.field4894 == 16) {
            return;
        }
        this.method2167();
        this.method2141(true);
        this.method2204(true);
        this.method2174(true);
        this.method2195(1);
        this.method2158(1);
        this.field4894 = 16;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[I[I)Lde;", line = 2143)
    public final class165 method193(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class360.method2221(this, arg3, arg2, arg1, arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V", line = 2146)
    public final void method237(int arg0) {
        this.method2163();
    }

    @OriginalMember(owner = "client!mm", name = "pb", descriptor = "()V", line = 2149)
    private final void method2206() {
        this.field4794.glLoadIdentity();
        this.field4794.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4794.glMultMatrixf(this.field4918.method2674((byte) -77), 0);
        this.method2152();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I[BIZ)Ldc;", line = 2155)
    public final class377 method2207(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class377) (this.field4885 && !arg3 || this.field4837 ? new class443(this, arg0, arg1, arg2, arg3) : new class234(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FF)V", line = 2166)
    public final void method180(float arg0, float arg1) {
        if (this.field4905 == arg0 && this.field4848 == arg1) {
            return;
        }
        this.field4905 = arg0;
        this.field4848 = arg1;
        this.method2175();
        if (this.field4830 == 3) {
            this.method2186();
        } else if (this.field4830 == 2) {
            this.method2200();
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lgf;IILne;)V", line = 2602)
    public class357(Canvas arg0, class202 arg1, int arg2, int arg3, class76 arg4) {
        this.field4802 = arg0;
        this.field4797 = arg1;
        this.field744 = arg2;
        int var6 = 0;
        while (!this.field4802.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class328.method1999(0, 1000L);
        }
        this.field4802.setIgnoreRepaint(true);
        try {
            if (field4803 == null || !field4803) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4803 = Boolean.TRUE;
                } else {
                    class285 var7 = arg4.method604(this.getClass(), 11);
                    while (var7.field3875 == 0) {
                        class328.method1999(0, 100L);
                    }
                    if (var7.field3875 == 1) {
                        field4803 = Boolean.TRUE;
                    }
                }
            }
            if (field4803 == null || !field4803) {
                throw new RuntimeException("");
            }
            this.field4795 = new context();
            if (!this.field4795.choosePixelFormat(this.field4802, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4795.createContext()) {
                this.method2194();
                this.field4794 = this.field4795.getGL();
                int var8 = this.method2165();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4862 = this.field4829 ? 33639 : 5121;
                String var9 = this.field4827.toLowerCase();
                String var10 = this.field4913.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class6.method27((byte) 44, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class43.method369(var16.substring(1, 3), 10)) {
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
                                    if (var16.length() >= 4 && class43.method369(var16.substring(0, 4), 10)) {
                                        var11 = class388.method2418(108, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4885 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4895 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4908 = false;
                    }
                    this.field4856 &= this.field4794.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4837 = this.field4885;
                }
                if (var9.contains("intel")) {
                    this.field4833 = false;
                }
                if (this.field4885) {
                    try {
                        int[] var18 = new int[1];
                        this.field4794.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2188(this);
                this.method266();
                this.method2142();
                new class36(this);
                this.field4804 = new class89(this, this.field4797);
                class165.method1182(true, true, (byte) 82);
                this.field4818 = true;
                this.field4800 = new class272(this);
                this.field4801 = new class437(this);
                this.field4796 = new class288(this);
                this.method2182();
                this.field4794.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4795.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class328.method1999(0, 100L);
                    }
                }
                this.field4794.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method267();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(IIII)V", line = 2189)
    public final void method227(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4813) {
            arg2 = this.field4813;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4814) {
            arg3 = this.field4814;
        }
        this.field4861 = arg0;
        this.field4834 = arg1;
        this.field4867 = arg2;
        this.field4864 = arg3;
        this.field4794.glEnable(3089);
        this.method2199();
        this.method2160();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lri;IIII)Lts;", line = 2212)
    public final class116 method254(class98 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class295(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "(I)V", line = 2216)
    public final synchronized void method2208(int arg0) {
        class166 var2 = new class166(arg0);
        this.field4824.method1162(125, var2);
    }

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "()Z", line = 2220)
    public final boolean method241() {
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "(II)V", line = 2225)
    public final void method2209(int arg0, int arg1) {
        this.field4869 = arg0;
        this.field4881 = arg1;
        this.field4794.glViewport(arg0, arg1, this.field4813, this.field4814);
        this.method2160();
    }

    @OriginalMember(owner = "client!mm", name = "qb", descriptor = "()V", line = 2236)
    public final void method2210() {
        if (this.field4894 == 8) {
            return;
        }
        this.method2153();
        this.method2141(true);
        this.method2204(true);
        this.method2174(true);
        this.method2195(1);
        this.method2158(1);
        this.field4894 = 8;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 2249)
    public final void method17() {
    }

    @OriginalMember(owner = "client!mm", name = "rb", descriptor = "()Lsj;", line = 2252)
    public final class73 method2211() {
        return this.field4812;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFF)V", line = 2257)
    public final void method249(float arg0, float arg1, float arg2) {
        class288.field3912 = arg0;
        class288.field3915 = arg1;
        class288.field3914 = arg2;
    }

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "()V", line = 2262)
    public final void method267() {
        if (this.field4794 != null) {
            try {
                this.field4801.method2688();
            } catch (Throwable var4) {
            }
            this.field4794 = null;
        }
        if (this.field4795 != null) {
            this.method2163();
            try {
                this.field4795.destroy();
            } catch (Throwable var3) {
            }
            this.field4795 = null;
        }
        if (this.field4818) {
            class303.method1838(true, (byte) 51, true);
            this.field4818 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "(II)V", line = 2293)
    public final void method2212(int arg0, int arg1) {
        if (this.field4844 != 0) {
            this.field4794.glTexEnvi(8960, 34161, arg0);
            this.field4794.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4884 != arg0) {
            this.field4794.glTexEnvi(8960, 34161, arg0);
            this.field4884 = arg0;
            var3 = true;
        }
        if (this.field4866 != arg1) {
            this.field4794.glTexEnvi(8960, 34162, arg1);
            this.field4866 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4894 &= 0xFFFFFFE2;
        }
    }
}
