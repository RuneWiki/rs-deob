import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class393 extends class261 implements class231 {

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lvr;")
    private class166 field5778 = new class166();

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljd;")
    private class361 field5784 = new class93();

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public int field5787 = 8;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    private int field5790 = -1;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Z")
    private boolean field5795 = false;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "[Lvd;")
    private class231[] field5788 = new class231[4];

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public int field5797 = 3;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Lsf;")
    private class398 field5785 = new class398();

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "Lsf;")
    private class398 field5798 = new class398();

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "Lsf;")
    private class398 field5799 = new class398();

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "Lsf;")
    private class398 field5800 = new class398();

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lsf;")
    private class398 field5801 = new class398();

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "Lsf;")
    private class398 field5802 = new class398();

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "Lsf;")
    private class398 field5803 = new class398();

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    private int field5806 = -1;

    @OriginalMember(owner = "client!cg", name = "wb", descriptor = "I")
    private int field5823 = 0;

    @OriginalMember(owner = "client!cg", name = "tb", descriptor = "I")
    public int field5820 = 512;

    @OriginalMember(owner = "client!cg", name = "Lb", descriptor = "[F")
    public float[] field5838 = new float[4];

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "[F")
    private float[] field5807 = new float[4];

    @OriginalMember(owner = "client!cg", name = "Pb", descriptor = "F")
    public float field5842 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "Nb", descriptor = "I")
    private int field5840 = 0;

    @OriginalMember(owner = "client!cg", name = "Jb", descriptor = "F")
    private float field5836 = 0.0F;

    @OriginalMember(owner = "client!cg", name = "Vb", descriptor = "I")
    private int field5848 = 0;

    @OriginalMember(owner = "client!cg", name = "sb", descriptor = "I")
    private int field5819 = -1;

    @OriginalMember(owner = "client!cg", name = "rb", descriptor = "I")
    public int field5818 = -1;

    @OriginalMember(owner = "client!cg", name = "Eb", descriptor = "[F")
    private float[] field5831 = new float[4];

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public int field5810 = 512;

    @OriginalMember(owner = "client!cg", name = "Ub", descriptor = "F")
    public float field5847 = 3584.0F;

    @OriginalMember(owner = "client!cg", name = "lc", descriptor = "I")
    private int field5864 = 8448;

    @OriginalMember(owner = "client!cg", name = "sc", descriptor = "I")
    public int field5871 = -1;

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "I")
    public int field5811 = 50;

    @OriginalMember(owner = "client!cg", name = "ec", descriptor = "F")
    private float field5857 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "oc", descriptor = "Z")
    private boolean field5867 = true;

    @OriginalMember(owner = "client!cg", name = "Rb", descriptor = "[F")
    private float[] field5844 = new float[16];

    @OriginalMember(owner = "client!cg", name = "Sb", descriptor = "I")
    private int field5845 = 0;

    @OriginalMember(owner = "client!cg", name = "qb", descriptor = "F")
    private float field5817 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "qc", descriptor = "I")
    private int field5869 = 0;

    @OriginalMember(owner = "client!cg", name = "nc", descriptor = "F")
    public float field5866 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "tc", descriptor = "F")
    public float field5872 = 3584.0F;

    @OriginalMember(owner = "client!cg", name = "Ab", descriptor = "I")
    public int field5827 = 0;

    @OriginalMember(owner = "client!cg", name = "Pc", descriptor = "I")
    private int field5894 = 0;

    @OriginalMember(owner = "client!cg", name = "Gc", descriptor = "F")
    public float field5885 = -1.0F;

    @OriginalMember(owner = "client!cg", name = "Oc", descriptor = "[F")
    private float[] field5893 = new float[4];

    @OriginalMember(owner = "client!cg", name = "ic", descriptor = "I")
    private int field5861 = 8448;

    @OriginalMember(owner = "client!cg", name = "Gb", descriptor = "I")
    public int field5833 = -1;

    @OriginalMember(owner = "client!cg", name = "Lc", descriptor = "F")
    public float field5890 = -1.0F;

    @OriginalMember(owner = "client!cg", name = "Fc", descriptor = "F")
    public float field5884 = 1.0F;

    @OriginalMember(owner = "client!cg", name = "Sc", descriptor = "I")
    private int field5897 = 0;

    @OriginalMember(owner = "client!cg", name = "fc", descriptor = "I")
    public int field5858 = 0;

    @OriginalMember(owner = "client!cg", name = "ac", descriptor = "I")
    public int field5853 = 3584;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5779;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Lec;")
    public class96 field5773;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "Ljaggl/context;")
    private context field5777;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Ljaggl/opengl;")
    public opengl field5783;

    @OriginalMember(owner = "client!cg", name = "Ac", descriptor = "Z")
    public boolean field5879;

    @OriginalMember(owner = "client!cg", name = "xc", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!cg", name = "pb", descriptor = "Ljava/lang/String;")
    private String field5816;

    @OriginalMember(owner = "client!cg", name = "Xc", descriptor = "Ljava/lang/String;")
    private String field5902;

    @OriginalMember(owner = "client!cg", name = "Fb", descriptor = "Z")
    private boolean field5832;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "Z")
    public boolean field5805;

    @OriginalMember(owner = "client!cg", name = "Nc", descriptor = "Z")
    public boolean field5892;

    @OriginalMember(owner = "client!cg", name = "cc", descriptor = "Z")
    public boolean field5855;

    @OriginalMember(owner = "client!cg", name = "Yb", descriptor = "Z")
    private boolean field5851;

    @OriginalMember(owner = "client!cg", name = "Qc", descriptor = "Z")
    public boolean field5895;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lre;")
    public class421 field5774;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lrn;")
    private class218 field5771;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lcc;")
    private class305 field5772;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "Luc;")
    private class179 field5780;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "[I")
    private static int[] field5776 = new int[1000];

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "[F")
    private static float[] field5782 = new float[4];

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "[F")
    private static float[] field5781 = new float[4];

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field5775 = Boolean.FALSE;

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "F")
    public float field5812;

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "F")
    private float field5814;

    @OriginalMember(owner = "client!cg", name = "xb", descriptor = "F")
    public float field5824;

    @OriginalMember(owner = "client!cg", name = "zb", descriptor = "F")
    public float field5826;

    @OriginalMember(owner = "client!cg", name = "Wb", descriptor = "F")
    private float field5849;

    @OriginalMember(owner = "client!cg", name = "mc", descriptor = "F")
    public float field5865;

    @OriginalMember(owner = "client!cg", name = "Mc", descriptor = "F")
    public float field5891;

    @OriginalMember(owner = "client!cg", name = "Tc", descriptor = "F")
    private float field5898;

    @OriginalMember(owner = "client!cg", name = "Uc", descriptor = "F")
    public float field5899;

    @OriginalMember(owner = "client!cg", name = "Vc", descriptor = "F")
    public float field5900;

    @OriginalMember(owner = "client!cg", name = "cd", descriptor = "F")
    public float field5907;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    private int field5786;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int field5789;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "I")
    public int field5793;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public int field5794;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public int field5808;

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "I")
    private int field5813;

    @OriginalMember(owner = "client!cg", name = "ob", descriptor = "I")
    private int field5815;

    @OriginalMember(owner = "client!cg", name = "ub", descriptor = "I")
    private int field5821;

    @OriginalMember(owner = "client!cg", name = "vb", descriptor = "I")
    private int field5822;

    @OriginalMember(owner = "client!cg", name = "yb", descriptor = "I")
    private int field5825;

    @OriginalMember(owner = "client!cg", name = "Hb", descriptor = "I")
    private int field5834;

    @OriginalMember(owner = "client!cg", name = "Kb", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!cg", name = "Mb", descriptor = "I")
    private int field5839;

    @OriginalMember(owner = "client!cg", name = "Zb", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!cg", name = "jc", descriptor = "I")
    private int field5862;

    @OriginalMember(owner = "client!cg", name = "uc", descriptor = "I")
    private int field5873;

    @OriginalMember(owner = "client!cg", name = "dd", descriptor = "I")
    private int field5908;

    @OriginalMember(owner = "client!cg", name = "ed", descriptor = "I")
    private int field5909;

    @OriginalMember(owner = "client!cg", name = "Bc", descriptor = "J")
    private long field5880;

    @OriginalMember(owner = "client!cg", name = "bd", descriptor = "Lio;")
    private class104 field5906;

    @OriginalMember(owner = "client!cg", name = "Jc", descriptor = "Ldi;")
    private class157 field5888;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Ld;")
    public class214 field5804;

    @OriginalMember(owner = "client!cg", name = "Tb", descriptor = "Ld;")
    public class214 field5846;

    @OriginalMember(owner = "client!cg", name = "Xb", descriptor = "Ld;")
    public class214 field5850;

    @OriginalMember(owner = "client!cg", name = "gc", descriptor = "Ld;")
    public class214 field5859;

    @OriginalMember(owner = "client!cg", name = "hc", descriptor = "Ld;")
    public class214 field5860;

    @OriginalMember(owner = "client!cg", name = "Dc", descriptor = "Ld;")
    public class214 field5882;

    @OriginalMember(owner = "client!cg", name = "Hc", descriptor = "Ld;")
    public class214 field5886;

    @OriginalMember(owner = "client!cg", name = "Yc", descriptor = "Ld;")
    public class214 field5903;

    @OriginalMember(owner = "client!cg", name = "yc", descriptor = "Lna;")
    private class226 field5877;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "Lvd;")
    private class231 field5796;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "Lbh;")
    public class366 field5809;

    @OriginalMember(owner = "client!cg", name = "pc", descriptor = "Lqq;")
    private class434 field5868;

    @OriginalMember(owner = "client!cg", name = "bc", descriptor = "Lpq;")
    public class46 field5854;

    @OriginalMember(owner = "client!cg", name = "vc", descriptor = "Lpq;")
    public class46 field5874;

    @OriginalMember(owner = "client!cg", name = "ad", descriptor = "Lpq;")
    public class46 field5905;

    @OriginalMember(owner = "client!cg", name = "dc", descriptor = "Lpm;")
    public class93 field5856;

    @OriginalMember(owner = "client!cg", name = "Rc", descriptor = "Lpm;")
    public class93 field5896;

    @OriginalMember(owner = "client!cg", name = "Bb", descriptor = "Z")
    public boolean field5828;

    @OriginalMember(owner = "client!cg", name = "Cb", descriptor = "Z")
    public boolean field5829;

    @OriginalMember(owner = "client!cg", name = "Db", descriptor = "Z")
    private boolean field5830;

    @OriginalMember(owner = "client!cg", name = "Ib", descriptor = "Z")
    private boolean field5835;

    @OriginalMember(owner = "client!cg", name = "Ob", descriptor = "Z")
    private boolean field5841;

    @OriginalMember(owner = "client!cg", name = "Qb", descriptor = "Z")
    private boolean field5843;

    @OriginalMember(owner = "client!cg", name = "kc", descriptor = "Z")
    public boolean field5863;

    @OriginalMember(owner = "client!cg", name = "rc", descriptor = "Z")
    public boolean field5870;

    @OriginalMember(owner = "client!cg", name = "wc", descriptor = "Z")
    private boolean field5875;

    @OriginalMember(owner = "client!cg", name = "zc", descriptor = "Z")
    private boolean field5878;

    @OriginalMember(owner = "client!cg", name = "Cc", descriptor = "Z")
    public boolean field5881;

    @OriginalMember(owner = "client!cg", name = "Ic", descriptor = "Z")
    private boolean field5887;

    @OriginalMember(owner = "client!cg", name = "Kc", descriptor = "Z")
    private boolean field5889;

    @OriginalMember(owner = "client!cg", name = "Wc", descriptor = "Z")
    private boolean field5901;

    @OriginalMember(owner = "client!cg", name = "Zc", descriptor = "Z")
    private boolean field5904;

    @OriginalMember(owner = "client!cg", name = "Ec", descriptor = "[Lq;")
    private class325[] field5883;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "()V")
    private final void method2423() {
        field5781[0] = this.field5890 * this.field5884;
        field5781[1] = this.field5890 * this.field5866;
        field5781[2] = this.field5890 * this.field5842;
        field5781[3] = 1.0F;
        this.field5783.glLightfv(16384, 4609, field5781, 0);
        field5781[0] = -this.field5885 * this.field5884;
        field5781[1] = -this.field5885 * this.field5866;
        field5781[2] = -this.field5885 * this.field5842;
        field5781[3] = 1.0F;
        this.field5783.glLightfv(16385, 4609, field5781, 0);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public final void method437(int arg0) {
        this.method2424(0);
        this.field5783.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field5783.glClear(16384);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lgo;[Lck;Z)Llp;")
    public final class137 method410(class272 arg0, class4[] arg1, boolean arg2) {
        return new class460(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V")
    public final void method2424(int arg0) {
        if (this.field5873 == arg0) {
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
        if (this.field5841 != var3) {
            this.field5783.glColorMask(var3, var3, var3, true);
            this.field5841 = var3;
        }
        if (this.field5889 != var4) {
            if (var4) {
                this.field5783.glEnable(3008);
            } else {
                this.field5783.glDisable(3008);
            }
            this.field5889 = var4;
        }
        if (this.field5839 != var2) {
            if (var2 == 1) {
                this.field5783.glEnable(3042);
                this.field5783.glBlendEquation(32774);
                this.field5783.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field5783.glEnable(3042);
                this.field5783.glBlendEquation(32774);
                this.field5783.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field5783.glEnable(3042);
                this.field5783.glBlendEquation(32778);
                this.field5783.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field5783.glEnable(3042);
                this.field5783.glBlendEquation(32774);
                this.field5783.glBlendFunc(774, 1);
            } else {
                this.field5783.glDisable(3042);
            }
            this.field5839 = var2;
        }
        this.field5873 = arg0;
        this.field5813 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)I")
    public final int method372(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIZ)Lkr;")
    public final class234 method373(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class323(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field5791) {
            arg2 = this.field5791;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field5793) {
            arg3 = this.field5793;
        }
        this.field5869 = arg0;
        this.field5897 = arg1;
        this.field5845 = arg2;
        this.field5894 = arg3;
        this.field5783.glEnable(3089);
        this.method2449();
        this.method2432();
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "()I")
    public final int method442() {
        int var1 = this.field5909;
        this.field5909 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "()Z")
    public final boolean method427() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method428(int arg0) {
        this.method2451();
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIIIII)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2472();
        this.method2424(arg5);
        this.field5783.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5843) {
            this.field5783.glDisable(32925);
        }
        this.field5783.glBegin(2);
        this.field5783.glVertex2f(var7, var8);
        this.field5783.glVertex2f(var7, var10);
        this.field5783.glVertex2f(var9, var10);
        this.field5783.glVertex2f(var9, var8);
        this.field5783.glEnd();
        if (this.field5843) {
            this.field5783.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(III)V")
    public final void method2425(int arg0, int arg1, int arg2) {
        this.field5783.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field5783.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)V")
    public final synchronized void method2426(int arg0, int arg1) {
        class350 var3 = new class350(arg1);
        var3.field1339 = (long) arg0;
        this.field5798.method2504(42, var3);
    }

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "()V")
    public final void method2427() {
        if (this.field5813 == 16) {
            return;
        }
        this.method2448();
        this.method2481(true);
        this.method2483(true);
        this.method2465(true);
        this.method2424(1);
        this.method2467(1);
        this.field5813 = 16;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)V")
    public final void method356(boolean arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "()Ljd;")
    public final class361 method388() {
        return new class93();
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(II)V")
    public final void method2428(int arg0, int arg1) {
        if (this.field5834 != 0) {
            this.field5783.glTexEnvi(8960, 34161, arg0);
            this.field5783.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field5861 != arg0) {
            this.field5783.glTexEnvi(8960, 34161, arg0);
            this.field5861 = arg0;
            var3 = true;
        }
        if (this.field5864 != arg1) {
            this.field5783.glTexEnvi(8960, 34162, arg1);
            this.field5864 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field5813 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Ldt;)V")
    public final void method408(int arg0, class147[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class147 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field5782[0] = (float) var4.field2033;
            field5782[1] = (float) var4.field2040;
            field5782[2] = (float) var4.field2038;
            field5782[3] = 1.0F;
            this.field5783.glLightfv(var5, 4611, field5782, 0);
            int var6 = var4.field2035;
            float var7 = var4.field2036 / 255.0F;
            field5782[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field5782[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field5782[2] = (float) (var6 & 0xFF) * var7;
            this.field5783.glLightfv(var5, 4609, field5782, 0);
            this.field5783.glLightf(var5, 4617, 1.0F / (float) (var4.field2037 * var4.field2037));
            this.field5783.glEnable(var5);
        }
        while (var3 < this.field5823) {
            this.field5783.glDisable(var3 + 16386);
            var3++;
        }
        this.field5823 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(II)V")
    public final synchronized void method2429(int arg0, int arg1) {
        class350 var3 = new class350(arg1);
        var3.field1339 = (long) arg0;
        this.field5799.method2504(42, var3);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltf;Ltf;Ltf;Ltf;)V")
    public final void method2430(class464 arg0, class464 arg1, class464 arg2, class464 arg3) {
        if (arg0 == null) {
            this.field5783.glDisableClientState(32884);
        } else {
            this.field5783.glEnableClientState(32884);
            arg0.method2861(-24933);
        }
        if (arg1 == null) {
            this.field5783.glDisableClientState(32885);
        } else {
            this.field5783.glEnableClientState(32885);
            arg1.method2860(-30436);
        }
        if (arg2 == null) {
            this.field5783.glDisableClientState(32886);
        } else {
            this.field5783.glEnableClientState(32886);
            arg2.method2859(18393);
        }
        if (arg3 == null) {
            this.field5783.glDisableClientState(32888);
        } else {
            this.field5783.glEnableClientState(32888);
            arg3.method2862(117);
        }
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V")
    public final void method2431(int arg0) {
        field5781[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field5781[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field5781[2] = (float) (arg0 & 0xFF) / 255.0F;
        field5781[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field5783.glTexEnvfv(8960, 8705, field5781, 0);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIII)V")
    public final void method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2472();
        this.method2424(arg5);
        this.field5783.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field5783.glBegin(2);
        this.field5783.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field5783.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field5783.glEnd();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public final void method418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2472();
        this.method2424(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field5783.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field5783.glBegin(1);
        this.field5783.glVertex2f(var6, var7);
        this.field5783.glVertex2f((float) arg2 + var6, var7);
        this.field5783.glEnd();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
    public final int method407(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "()V")
    private final void method2432() {
        if (this.field5869 <= this.field5845 && this.field5897 <= this.field5894) {
            this.field5783.glScissor(this.field5869 + this.field5840, this.field5848 + this.field5793 - this.field5894, this.field5845 - this.field5869, this.field5894 - this.field5897);
        } else {
            this.field5783.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "()V")
    public final void method445() {
        this.field5772.method1875();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
    public final void method364(int arg0, int arg1, int arg2) {
        this.field5870 = true;
        this.field5819 = arg1;
        this.field5871 = arg2;
        this.method2487();
        this.method2478();
        this.field5771.method1328(false, false, 3, true);
        this.field5771.method1327(arg0, (byte) -93, true);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(FFF)V")
    private final void method2433(float arg0, float arg1, float arg2) {
        this.field5783.glMatrixMode(5890);
        if (this.field5878) {
            this.field5783.glLoadIdentity();
        }
        this.field5783.glTranslatef(arg0, arg1, arg2);
        this.field5783.glMatrixMode(5888);
        this.field5878 = true;
    }

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "()V")
    public final void method2434() {
        if (this.field5862 != 2) {
            this.field5862 = 2;
            this.method2450();
            this.method2442();
            this.field5813 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    public final synchronized void method403(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5798.method2506(false)) {
            class350 var4 = (class350) this.field5798.method2509(false);
            field5776[var2++] = (int) var4.field1339;
            this.field5789 -= var4.field5202;
            if (var2 == 1000) {
                this.field5783.glDeleteBuffersARB(var2, field5776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field5783.glDeleteBuffersARB(var2, field5776, 0);
            var2 = 0;
        }
        while (!this.field5799.method2506(false)) {
            class350 var5 = (class350) this.field5799.method2509(false);
            field5776[var2++] = (int) var5.field1339;
            this.field5792 -= var5.field5202;
            if (var2 == 1000) {
                this.field5783.glDeleteTextures(var2, field5776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field5783.glDeleteTextures(var2, field5776, 0);
            var2 = 0;
        }
        while (!this.field5800.method2506(false)) {
            class350 var6 = (class350) this.field5800.method2509(false);
            field5776[var2++] = var6.field5202;
            if (var2 == 1000) {
                this.field5783.glDeleteFramebuffersEXT(var2, field5776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field5783.glDeleteFramebuffersEXT(var2, field5776, 0);
            var2 = 0;
        }
        while (!this.field5801.method2506(false)) {
            class350 var7 = (class350) this.field5801.method2509(false);
            field5776[var2++] = (int) var7.field1339;
            this.field5786 -= var7.field5202;
            if (var2 == 1000) {
                this.field5783.glDeleteRenderbuffersEXT(var2, field5776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field5783.glDeleteRenderbuffersEXT(var2, field5776, 0);
            var2 = 0;
        }
        while (!this.field5802.method2506(false)) {
            class350 var8 = (class350) this.field5802.method2509(false);
            field5776[var2++] = (int) var8.field1339;
            if (var2 == 1000) {
                this.field5783.glDeleteProgramsARB(var2, field5776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field5783.glDeleteProgramsARB(var2, field5776, 0);
            boolean var9 = false;
        }
        while (!this.field5785.method2506(false)) {
            class350 var10 = (class350) this.field5785.method2509(false);
            this.field5783.glDeleteLists((int) var10.field1339, var10.field5202);
        }
        while (!this.field5803.method2506(false)) {
            class350 var11 = (class350) this.field5803.method2509(false);
            this.field5783.glDeleteObjectARB(var11.field5202);
        }
        while (!this.field5785.method2506(false)) {
            class350 var12 = (class350) this.field5785.method2509(false);
            this.field5783.glDeleteLists((int) var12.field1339, var12.field5202);
        }
        if (this.method430() > 100663296 && class445.method2750(-27580) > this.field5880 + 60000L) {
            System.gc();
            this.field5880 = class445.method2750(-27580);
        }
        this.field5794 = var3;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
    public final void method440() {
        if (this.field5780.method1162(false)) {
            this.field5772.method1873(this.field5780);
            this.field5774.method2605(3553);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lgf;)V")
    public final void method416(class351 arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method347(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIII)V")
    public final void method396(int arg0, int arg1, int arg2, int arg3) {
        this.field5772.method1880(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "()V")
    private final void method2435() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field5777.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class109.method674((byte) 99, 1000L);
        }
    }

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "()Lgm;")
    public final class92 method2436() {
        return this.field5888 == null ? null : this.field5888.method967(-18478);
    }

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "()Z")
    public final boolean method384() {
        return this.field5843;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "()V")
    private final void method2437() {
        this.method2474(-2);
        for (int var1 = this.field5808 - 1; var1 >= 0; var1--) {
            this.method2452(var1);
            this.method2460((class325) null);
            this.field5783.glTexEnvi(8960, 8704, 34160);
        }
        this.method2428(8448, 8448);
        this.method2425(2, 34168, 770);
        this.method2471();
        this.field5873 = 1;
        this.field5783.glEnable(3042);
        this.field5783.glBlendFunc(770, 771);
        this.field5839 = 1;
        this.field5783.glEnable(3008);
        this.field5783.glAlphaFunc(516, 0.0F);
        this.field5889 = true;
        this.field5783.glColorMask(true, true, true, true);
        this.field5841 = true;
        this.method2481(true);
        this.method2486(true);
        this.method2483(true);
        this.method2465(true);
        this.method2466();
        this.field5783.setSwapInterval(0);
        this.field5783.glShadeModel(7425);
        this.field5783.glClearDepth(1.0F);
        this.field5783.glDepthFunc(515);
        this.field5783.glPolygonMode(1028, 6914);
        this.field5783.glEnable(2884);
        this.field5783.glCullFace(1029);
        this.field5783.glMatrixMode(5888);
        this.field5783.glLoadIdentity();
        this.field5783.glColorMaterial(1028, 5634);
        this.field5783.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field5783.glLightfv(var4, 4608, var2, 0);
            this.field5783.glLightf(var4, 4615, 0.0F);
            this.field5783.glLightf(var4, 4616, 0.0F);
        }
        this.field5783.glEnable(16384);
        this.field5783.glEnable(16385);
        this.field5783.glFogf(2914, 0.95F);
        this.field5783.glFogi(2917, 9729);
        this.field5783.glHint(3156, 4353);
        this.field5806 = this.field5818 = -1;
        this.method433();
    }

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "()V")
    private final void method2438() {
        this.field5856 = new class93();
        this.field5896 = new class93();
        this.field5883 = new class325[this.field5808];
        this.field5874 = new class46(this, 3553, 6408, 1, 1);
        this.field5905 = new class46(this, 3553, 6408, 1, 1);
        this.field5854 = new class46(this, 3553, 6408, 1, 1);
        this.field5850 = new class214(this);
        this.field5846 = new class214(this);
        this.field5804 = new class214(this);
        this.field5903 = new class214(this);
        this.field5860 = new class214(this);
        this.field5882 = new class214(this);
        this.field5886 = new class214(this);
        this.field5859 = new class214(this);
        if (this.field5895) {
            this.field5809 = new class366(this);
        }
        this.field5778.method993(this);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljp;IIII)Lwp;")
    public final class292 method390(class49 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class214(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[BIZ)Lna;")
    public final class226 method2439(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class226) (this.field5832 && !arg3 || this.field5851 ? new class420(this, arg0, arg1, arg2, arg3) : new class263(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "(I)I")
    public final int method2440(int arg0) {
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

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lwa;)V")
    public final void method349(class439 arg0) {
        this.field5778.method996(this, arg0);
    }

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "()I")
    public final int method342() {
        return 4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lio;)V")
    public final void method2441(class104 arg0) {
        if (this.field5906 != arg0 && this.field5832) {
            this.field5783.glBindBufferARB(34963, arg0.method586());
            this.field5906 = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()V")
    public final void method1400() {
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIII)[I")
    public final int[] method371(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field5783.glReadPixels(arg0, this.field5793 - arg1 - var6, arg2, 1, 32993, this.field5876, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "()V")
    private final void method2442() {
        this.field5783.glLoadIdentity();
        this.field5783.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field5783.glMultMatrixf(this.field5856.method616((byte) 11), 0);
        this.method2454();
    }

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "()F")
    public final float method413() {
        return this.field5907;
    }

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "()V")
    private final void method2443() {
        float var1 = (float) (-this.field5858) * this.field5857 / (float) this.field5820;
        float var2 = (float) (-this.field5827) * this.field5857 / (float) this.field5810;
        float var3 = (float) (this.field5791 - this.field5858) * this.field5857 / (float) this.field5820;
        float var4 = (float) (this.field5793 - this.field5827) * this.field5857 / (float) this.field5810;
        this.field5783.glMatrixMode(5889);
        this.field5783.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field5783.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field5811 - this.field5824), (double) ((float) this.field5853 - this.field5824));
        }
        this.field5783.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "()V")
    public final void method2444() {
        if (this.field5813 == 8) {
            return;
        }
        this.method2434();
        this.method2481(true);
        this.method2483(true);
        this.method2465(true);
        this.method2424(1);
        this.method2467(1);
        this.field5813 = 8;
    }

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "()V")
    public final void method2445() {
        this.field5783.glPopMatrix();
    }

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "()V")
    private final void method2446() {
        this.field5783.glDepthMask(this.field5835 && this.field5867);
    }

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "()V")
    public final void method2447() {
        if (this.field5813 == 2) {
            return;
        }
        this.method2495();
        this.method2481(false);
        this.method2486(false);
        this.method2483(false);
        this.method2465(false);
        this.method2474(-2);
        this.field5813 = 2;
    }

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "()V")
    private final void method2448() {
        if (this.field5862 != 3) {
            this.field5862 = 3;
            this.method2443();
            this.method2442();
            this.field5813 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljd;)V")
    public final void method397(class361 arg0) {
        this.field5856 = (class93) arg0;
        this.field5896.method613(this.field5856, (byte) -122);
        if (this.field5862 != 1) {
            this.method2442();
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(IIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3) {
        this.field5858 = arg0;
        this.field5827 = arg1;
        this.field5820 = arg2;
        this.field5810 = arg3;
        this.method2488();
        this.method2449();
        if (this.field5862 == 3) {
            this.method2443();
        } else if (this.field5862 == 2) {
            this.method2450();
        }
    }

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "()V")
    private final void method2449() {
        this.field5900 = (float) (this.field5869 - this.field5858);
        this.field5812 = (float) (this.field5845 - this.field5858);
        this.field5891 = (float) (this.field5897 - this.field5827);
        this.field5826 = (float) (this.field5894 - this.field5827);
    }

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "()V")
    private final void method2450() {
        this.field5783.glMatrixMode(5889);
        this.field5783.glLoadMatrixf(this.field5844, 0);
        this.field5783.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field5868 == null || this.field5868.field569 < arg2 || this.field5868.field567 < arg3) {
            this.field5868 = class434.method2666(6406, arg2, arg3, false, 6406, false, arg6, this);
            this.field5868.method258(false, false);
            var10 = this.field5868.field6398;
            var11 = this.field5868.field6397;
        } else {
            this.field5868.method259(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field5868.field6398 / (float) this.field5868.field567;
            var11 = (float) arg2 * this.field5868.field6397 / (float) this.field5868.field569;
        }
        this.method2447();
        this.method2460(this.field5868);
        this.method2424(arg8);
        this.field5783.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2431(arg5);
        this.method2428(34165, 34165);
        this.method2425(0, 34166, 768);
        this.method2425(2, 5890, 770);
        this.method2462(0, 34166, 770);
        this.method2462(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field5783.glBegin(7);
        this.field5783.glTexCoord2f(0.0F, 0.0F);
        this.field5783.glVertex2f(var12, var13);
        this.field5783.glTexCoord2f(0.0F, var11);
        this.field5783.glVertex2f(var12, var15);
        this.field5783.glTexCoord2f(var10, var11);
        this.field5783.glVertex2f(var14, var15);
        this.field5783.glTexCoord2f(var10, 0.0F);
        this.field5783.glVertex2f(var14, var13);
        this.field5783.glEnd();
        this.method2425(0, 5890, 768);
        this.method2425(2, 34166, 770);
        this.method2462(0, 5890, 770);
        this.method2462(2, 34166, 770);
    }

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "()V")
    private final void method2451() {
        try {
            this.field5777.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5783.glLineWidth((float) arg5);
        this.method382(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field5783.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILor;II)V")
    public final void method419(int arg0, class153 arg1, int arg2, int arg3) {
        class76 var5 = (class76) arg1;
        class434 var6 = var5.field1023;
        this.method2447();
        this.method2460(var5.field1023);
        this.method2424(1);
        this.method2428(7681, 8448);
        this.method2425(0, 34167, 768);
        float var7 = var6.field6397 / (float) var6.field6400;
        float var8 = var6.field6398 / (float) var6.field6399;
        this.field5783.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field5783.glBegin(7);
        this.field5783.glTexCoord2f((float) (this.field5869 - arg2) * var7, (float) (this.field5897 - arg3) * var8);
        this.field5783.glVertex2i(this.field5869, this.field5897);
        this.field5783.glTexCoord2f((float) (this.field5869 - arg2) * var7, (float) (this.field5894 - arg3) * var8);
        this.field5783.glVertex2i(this.field5869, this.field5894);
        this.field5783.glTexCoord2f((float) (this.field5845 - arg2) * var7, (float) (this.field5894 - arg3) * var8);
        this.field5783.glVertex2i(this.field5845, this.field5894);
        this.field5783.glTexCoord2f((float) (this.field5845 - arg2) * var7, (float) (this.field5897 - arg3) * var8);
        this.field5783.glVertex2i(this.field5845, this.field5897);
        this.field5783.glEnd();
        this.method2425(0, 5890, 768);
    }

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "()V")
    public final void method357() {
        if (this.field5783 != null) {
            try {
                this.field5772.method1879();
            } catch (Throwable var4) {
            }
            this.field5783 = null;
        }
        if (this.field5777 != null) {
            this.method2451();
            try {
                this.field5777.destroy();
            } catch (Throwable var3) {
            }
            this.field5777 = null;
        }
        if (this.field5795) {
            class147.method917(true, -1, true);
            this.field5795 = false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "(I)V")
    public final void method2452(int arg0) {
        if (this.field5834 != arg0) {
            this.field5783.glActiveTexture(arg0 + 33984);
            this.field5834 = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public final void method379(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lna;")
    public final class226 method2453(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class226) (this.field5832 && !arg2 || this.field5851 ? new class420(this, arg0, arg1, arg2) : new class263(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIILor;II)V")
    public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class153 arg6, int arg7, int arg8) {
        class76 var10 = (class76) arg6;
        class434 var11 = var10.field1023;
        this.method2447();
        this.method2460(var10.field1023);
        this.method2424(arg5);
        this.method2428(7681, 8448);
        this.method2425(0, 34167, 768);
        float var12 = var11.field6397 / (float) var11.field6400;
        float var13 = var11.field6398 / (float) var11.field6399;
        this.field5783.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field5783.glBegin(1);
        this.field5783.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field5783.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field5783.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field5783.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field5783.glEnd();
        this.method2425(0, 5890, 768);
    }

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "()V")
    public final void method2454() {
        this.field5783.glLightfv(16384, 4611, this.field5838, 0);
        this.field5783.glLightfv(16385, 4611, this.field5893, 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class143 method438(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class156(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIII)V")
    public final void method439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2472();
        this.method2424(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field5783.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field5783.glBegin(1);
        this.field5783.glVertex2f(var6, var7);
        this.field5783.glVertex2f(var6, (float) arg2 + var7);
        this.field5783.glEnd();
    }

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "()Z")
    public final boolean method398() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([Lwp;Lwa;Ljd;[Lid;I)V")
    public final void method343(class292[] arg0, class439 arg1, class361 arg2, class158[] arg3, int arg4) {
        this.method431(arg0, arg2, arg3, arg4);
        this.method349(arg1);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIIII)V")
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "(I)V")
    public final synchronized void method2455(int arg0) {
        class350 var2 = new class350(arg0);
        this.field5802.method2504(42, var2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([Lwp;Ljd;[Lid;I)V")
    public final void method431(class292[] arg0, class361 arg1, class158[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method1282(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(III)V")
    public final void method2456(int arg0, int arg1, int arg2) {
        this.field5783.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(Z)V")
    public final void method2457(boolean arg0) {
        if (this.field5904 != arg0) {
            this.field5904 = arg0;
            this.method2493();
        }
    }

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "()Z")
    public final boolean method346() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lio;III)V")
    public final void method2458(class104 arg0, int arg1, int arg2, int arg3) {
        this.method2441(arg0);
        arg0.method654(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(II)V")
    public final void method2459(int arg0, int arg1) {
        this.field5840 = arg0;
        this.field5848 = arg1;
        this.field5783.glViewport(arg0, arg1, this.field5791, this.field5793);
        this.method2432();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lq;)V")
    public final void method2460(class325 arg0) {
        class325 var2 = this.field5883[this.field5834];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field5783.glDisable(var2.field4879);
            } else {
                if (var2 == null) {
                    this.field5783.glEnable(arg0.field4879);
                } else if (arg0.field4879 != var2.field4879) {
                    this.field5783.glDisable(var2.field4879);
                    this.field5783.glEnable(arg0.field4879);
                }
                this.field5783.glBindTexture(arg0.field4879, arg0.method2004());
            }
            this.field5883[this.field5834] = arg0;
        }
        this.field5813 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I)V")
    public final void method415(int[] arg0) {
        arg0[0] = this.field5869;
        arg0[1] = this.field5897;
        arg0[2] = this.field5845;
        arg0[3] = this.field5894;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "()I")
    public final int method430() {
        return this.field5792 + this.field5789 + this.field5786;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[I[I)Lor;")
    public final class153 method355(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class76.method496(arg1, (byte) 101, arg0, arg2, this, arg3);
    }

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "()V")
    public final void method429() {
        this.field5771.method1328(false, false, 0, true);
        this.field5870 = false;
        this.method2487();
        this.method2478();
    }

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "()Z")
    public final boolean method420() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "()V")
    public final void method433() {
        this.field5869 = 0;
        this.field5897 = 0;
        this.field5845 = this.field5791;
        this.field5894 = this.field5793;
        this.field5783.glDisable(3089);
        this.method2449();
    }

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "()V")
    private final void method2461() {
        field5781[0] = this.field5899 * this.field5884;
        field5781[1] = this.field5899 * this.field5866;
        field5781[2] = this.field5899 * this.field5842;
        field5781[3] = 1.0F;
        this.field5783.glLightModelfv(2899, field5781, 0);
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
    public final void method383(int arg0) {
        this.method2435();
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
    public final void method405(int arg0, int arg1, int arg2) {
        if (!this.field5870) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field5819 = arg1;
        this.field5871 = arg2;
        this.method2487();
        this.field5771.method1327(arg0, (byte) 126, true);
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(III)V")
    public final void method2462(int arg0, int arg1, int arg2) {
        this.field5783.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field5783.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltc;)V")
    public final void method380(class396 arg0) {
        this.field5888 = (class157) arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lna;)V")
    public final void method2463(class226 arg0) {
        if (this.field5877 != arg0 && this.field5832) {
            this.field5783.glBindBufferARB(34962, arg0.method586());
            this.field5877 = arg0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "()I")
    public final int method361() {
        int var1 = this.field5908;
        this.field5908 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZZ)V")
    public final void method2464(int arg0, boolean arg1, boolean arg2) {
        if (this.field5822 != arg0) {
            if (arg0 < 0) {
                this.method2471();
                this.method2460((class325) null);
                if (!this.field5870) {
                    this.field5771.method1328(arg2, arg1, 0, true);
                }
            } else {
                class46 var4 = this.field5774.method2604(true, arg0);
                class154 var5 = this.field5773.method180(arg0, -126);
                if (var5.field2110 == 0 && var5.field2127 == 0) {
                    this.method2471();
                } else {
                    int var6 = var5.field2126 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2433((float) (this.field5794 % var7 * var5.field2110) / (float) var7, (float) (this.field5794 % var7 * var5.field2127) / (float) var7, 0.0F);
                }
                if (this.field5870) {
                    this.field5771.method1328(arg2, arg1, 3, true);
                    this.method2460(var4);
                } else {
                    this.field5771.method1328(arg2, arg1, var5.field2125, true);
                    this.field5771.method1327(var5.field2128, (byte) -19, false);
                    if (!this.field5771.method1329(var4, 95)) {
                        this.method2460(var4);
                    }
                }
            }
            this.field5822 = arg0;
        }
        this.field5813 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "()V")
    public final void method424() {
    }

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "()Z")
    public final boolean method376() {
        if (!this.field5780.method1162(false)) {
            if (!this.field5772.method1874(this.field5780)) {
                return false;
            }
            this.field5774.method2605(3553);
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFF)V")
    public final void method367(float arg0, float arg1, float arg2) {
        class179.field2701 = arg0;
        class179.field2704 = arg1;
        class179.field2702 = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(Z)V")
    public final void method2465(boolean arg0) {
        if (this.field5835 != arg0) {
            this.field5835 = arg0;
            this.method2446();
            this.field5813 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(F)V")
    public final void method365(float arg0) {
        if (this.field5899 != arg0) {
            this.field5899 = arg0;
            this.method2461();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIIII)Lkr;")
    public final class234 method401(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class323(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "()V")
    public final void method2466() {
        if (this.field5862 != 0) {
            this.field5862 = 0;
            this.field5813 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "(I)V")
    public final void method2467(int arg0) {
        if (arg0 == 0) {
            this.method2428(7681, 7681);
        } else if (arg0 == 1) {
            this.method2428(8448, 8448);
        } else if (arg0 == 2) {
            this.method2428(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "()Lvd;")
    public final class231 method2468() {
        return this.field5796;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V")
    public final void method2469(int arg0, boolean arg1) {
        this.method2464(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "()Z")
    public final boolean method404() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ltc;Ltc;FLtc;)Ltc;")
    public final class396 method432(class396 arg0, class396 arg1, float arg2, class396 arg3) {
        if (arg0 != null && arg1 != null && this.field5828 && this.field5895) {
            class297 var5 = null;
            class157 var6 = (class157) arg0;
            class157 var7 = (class157) arg1;
            class92 var8 = var6.method967(-18478);
            class92 var9 = var7.method967(-18478);
            if (var8 != null && var9 != null) {
                int var10 = var8.field1294 > var9.field1294 ? var8.field1294 : var9.field1294;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class297) {
                    class297 var11 = (class297) arg3;
                    if (var11.method1839(-62) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class297(this, var10);
                }
                var5.method1838(var8, var9, (byte) -118, arg2);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[I)V")
    public final void method402(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field5856.field1298 + (float) arg0 * this.field5856.field1297 + (float) arg1 * this.field5856.field1296 + this.field5856.field1295;
        if ((var5 < (float) this.field5811) || (var5 > (float) this.field5853)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field5856.field1304 + (float) arg0 * this.field5856.field1299 + (float) arg1 * this.field5856.field1303 + this.field5856.field1302) * (float) this.field5820 / var5);
        int var7 = (int) (((float) arg2 * this.field5856.field1301 + (float) arg0 * this.field5856.field1307 + (float) arg1 * this.field5856.field1306 + this.field5856.field1305) * (float) this.field5810 / var5);
        if ((float) var6 >= this.field5900 && (float) var6 <= this.field5812 && (float) var7 >= this.field5891 && (float) var7 <= this.field5826) {
            arg3[0] = (int) ((float) var6 - this.field5900);
            arg3[1] = (int) ((float) var7 - this.field5891);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "()I")
    public final int method444() {
        return this.field5811;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)Ltc;")
    public final class396 method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field5828 ? new class206(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I[BIZ)Lio;")
    public final class104 method2470(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class104) (this.field5832 && !arg3 || this.field5851 ? new class202(this, arg0, arg1, arg2, arg3) : new class237(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Lgf;")
    public final class351 method417(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)V")
    public final void method344(int arg0, int arg1) {
        if (this.field5818 == arg0 && this.field5833 == arg1) {
            return;
        }
        this.field5818 = arg0;
        this.field5833 = arg1;
        if (!this.field5870) {
            this.method2487();
            this.method2478();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lck;Z)Lkr;")
    public final class234 method378(class4 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field46 * arg0.field41];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field42 == null) {
            for (int var8 = 0; var8 < arg0.field41; var8++) {
                for (int var9 = 0; var9 < arg0.field46; var9++) {
                    int var10 = arg0.field48[arg0.field43[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field41; var6++) {
                for (int var7 = 0; var7 < arg0.field46; var7++) {
                    var3[var5++] = arg0.field42[var4] << 24 | arg0.field48[arg0.field43[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class234 var11 = this.method401(var3, 0, arg0.field46, arg0.field46, arg0.field41);
        var11.method1220(arg0.field45, arg0.field49, arg0.field47, arg0.field44);
        return var11;
    }

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "()V")
    private final void method2471() {
        if (this.field5878) {
            this.field5783.glMatrixMode(5890);
            this.field5783.glLoadIdentity();
            this.field5783.glMatrixMode(5888);
            this.field5878 = false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "()V")
    private final void method2472() {
        if (this.field5813 == 1) {
            return;
        }
        this.method2495();
        this.method2481(false);
        this.method2486(false);
        this.method2483(false);
        this.method2465(false);
        this.method2460((class325) null);
        this.method2474(-2);
        this.method2467(0);
        this.field5813 = 1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
    public final void method1399() {
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "()V")
    public final void method391() {
        this.field5791 = this.field5779.getWidth();
        this.field5793 = this.field5779.getHeight();
        this.field5783.glViewport(this.field5840, this.field5848, this.field5791, this.field5793);
        this.method2466();
        this.method433();
    }

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "()Z")
    public final boolean method386() {
        return !this.field5830;
    }

    @OriginalMember(owner = "client!cg", name = "kb", descriptor = "()V")
    public final void method2473() {
        if (this.field5813 == 4) {
            return;
        }
        this.method2495();
        this.method2481(false);
        this.method2486(false);
        this.method2483(false);
        this.method2465(false);
        this.method2474(-2);
        this.method2424(1);
        this.method2467(1);
        this.field5813 = 4;
    }

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "(I)V")
    public final void method2474(int arg0) {
        this.method2469(arg0, true);
    }

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "()Z")
    public final boolean method345() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "()Z")
    public final boolean method387() {
        return this.field5780.method1162(false);
    }

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "()Z")
    public final boolean method359() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lvd;)V")
    public final void method2475(class231 arg0) {
        if (this.field5790 < 0 || this.field5788[this.field5790] != arg0) {
            throw new RuntimeException();
        }
        this.field5788[this.field5790--] = null;
        arg0.method1400();
        if (this.field5790 >= 0) {
            this.field5796 = this.field5788[this.field5790];
            this.field5796.method1399();
        }
    }

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "(I)V")
    public final synchronized void method2476(int arg0) {
        class350 var2 = new class350(arg0);
        this.field5800.method2504(42, var2);
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "(II)V")
    public final synchronized void method2477(int arg0, int arg1) {
        class350 var3 = new class350(arg1);
        var3.field1339 = (long) arg0;
        this.field5800.method2504(42, var3);
    }

    @OriginalMember(owner = "client!cg", name = "lb", descriptor = "()V")
    private final void method2478() {
        if (this.field5887 && this.field5870 | this.field5833 >= 0) {
            this.field5783.glEnable(2912);
        } else {
            this.field5783.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(FF)V")
    public final void method2479(float arg0, float arg1) {
        this.field5817 = arg0;
        this.field5836 = arg1;
        if (!this.field5870) {
            this.method2487();
        }
    }

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "()V")
    public final void method435() {
        try {
            this.field5777.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FFFF)V")
    public final void method2480(float arg0, float arg1, float arg2, float arg3) {
        field5781[0] = arg0;
        field5781[1] = arg1;
        field5781[2] = arg2;
        field5781[3] = arg3;
        this.field5783.glTexEnvfv(8960, 8705, field5781, 0);
    }

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "()Z")
    public final boolean method393() {
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(Z)V")
    public final void method2481(boolean arg0) {
        if (this.field5887 != arg0) {
            this.field5887 = arg0;
            this.method2478();
            this.field5813 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "()Z")
    public final boolean method400() {
        return this.field5780.method1090();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lpm;)V")
    public final void method2482(class93 arg0) {
        this.field5783.glPushMatrix();
        this.field5783.glMultMatrixf(arg0.method616((byte) 4), 0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method392(Rectangle[] arg0, int arg1) {
        this.method435();
    }

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "()Z")
    public final boolean method425() {
        return this.field5771.method1326((byte) -1, 3);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(FF)V")
    public final void method423(float arg0, float arg1) {
        if (this.field5907 == arg0 && this.field5824 == arg1) {
            return;
        }
        this.field5907 = arg0;
        this.field5824 = arg1;
        this.method2490();
        if (this.field5862 == 3) {
            this.method2443();
        } else if (this.field5862 == 2) {
            this.method2450();
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(Z)V")
    public final void method2483(boolean arg0) {
        if (this.field5875 == arg0) {
            return;
        }
        if (arg0) {
            this.field5783.glEnable(2929);
        } else {
            this.field5783.glDisable(2929);
        }
        this.field5875 = arg0;
        this.field5813 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!cg", name = "mb", descriptor = "()I")
    private final int method2484() {
        int var1 = 0;
        this.field5816 = this.field5783.glGetString(7936);
        this.field5902 = this.field5783.glGetString(7937);
        String var2 = this.field5816.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field5783.glGetString(7938);
        String[] var4 = class110.method677(' ', var3.replace('.', ' '), (byte) -109);
        if (var4.length >= 2) {
            try {
                int var5 = class25.method154(var4[0], (byte) 126);
                int var6 = class25.method154(var4[1], (byte) -44);
                this.field5821 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field5821 < 12) {
            var1 |= 0x2;
        }
        if (!this.field5783.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field5783.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field5783.glGetIntegerv(34018, var8, 0);
        this.field5808 = var8[0];
        this.field5783.glGetIntegerv(34929, var8, 0);
        this.field5815 = var8[0];
        this.field5783.glGetIntegerv(34930, var8, 0);
        this.field5825 = var8[0];
        if (this.field5808 < 2 || this.field5815 < 2 || this.field5825 < 2) {
            var1 |= 0x10;
        }
        this.field5830 = class239.field3574 != null && class239.field3574.startsWith("mac");
        this.field5879 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field5832 = this.field5783.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field5843 = this.field5783.isExtensionAvailable("GL_ARB_multisample");
        this.field5863 = this.field5783.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5783.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5783.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5829 = this.field5783.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5805 = this.field5783.isExtensionAvailable("GL_EXT_texture3D");
        this.field5855 = this.field5783.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5828 = this.field5783.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field5892 = this.field5783.isExtensionAvailable("GL_ARB_texture_float");
        this.field5881 = false;
        this.field5895 = this.field5783.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "(I)I")
    public final int method2485(int arg0) {
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

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(IIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5869 < arg0) {
            this.field5869 = arg0;
        }
        if (this.field5845 > arg2) {
            this.field5845 = arg2;
        }
        if (this.field5897 < arg1) {
            this.field5897 = arg1;
        }
        if (this.field5894 > arg3) {
            this.field5894 = arg3;
        }
        this.field5783.glEnable(3089);
        this.method2449();
        this.method2432();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IFFFFF)V")
    public final void method360(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field5806 != arg0;
        if (var7 || this.field5890 != arg1 || this.field5885 != arg2) {
            this.field5806 = arg0;
            this.field5890 = arg1;
            this.field5885 = arg2;
            if (var7) {
                this.field5884 = (float) (this.field5806 & 0xFF0000) / 1.671168E7F;
                this.field5866 = (float) (this.field5806 & 0xFFFF) / 65535.0F;
                this.field5842 = (float) (this.field5806 & 0xFF) / 255.0F;
                this.method2461();
            }
            this.method2423();
        }
        if (this.field5831[0] == arg3 && this.field5831[1] == arg4 && this.field5831[2] == arg5) {
            return;
        }
        this.field5831[0] = arg3;
        this.field5831[1] = arg4;
        this.field5831[2] = arg5;
        this.field5807[0] = -arg3;
        this.field5807[1] = -arg4;
        this.field5807[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field5838[0] = arg3 * var8;
        this.field5838[1] = arg4 * var8;
        this.field5838[2] = arg5 * var8;
        this.field5893[0] = -this.field5838[0];
        this.field5893[1] = -this.field5838[1];
        this.field5893[2] = -this.field5838[2];
        this.method2454();
        this.field5852 = (int) (arg3 * 256.0F / arg4);
        this.field5837 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(IIIIII)Z")
    public final boolean method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field5856.field1298 + (float) arg0 * this.field5856.field1297 + (float) arg1 * this.field5856.field1296 + this.field5856.field1295;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5856.field1298 + (float) arg3 * this.field5856.field1297 + (float) arg4 * this.field5856.field1296 + this.field5856.field1295;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field5811) || !(var8 < (float) this.field5811)) || !(!(var7 > (float) this.field5853) || !(var8 > (float) this.field5853))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field5856.field1304 + (float) arg0 * this.field5856.field1299 + (float) arg1 * this.field5856.field1303 + this.field5856.field1302) * (float) this.field5820 / var7);
        int var10 = (int) (((float) arg5 * this.field5856.field1304 + (float) arg3 * this.field5856.field1299 + (float) arg4 * this.field5856.field1303 + this.field5856.field1302) * (float) this.field5820 / var8);
        if ((float) var9 < this.field5900 && (float) var10 < this.field5900 || (float) var9 > this.field5812 && (float) var10 > this.field5812) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field5856.field1301 + (float) arg0 * this.field5856.field1307 + (float) arg1 * this.field5856.field1306 + this.field5856.field1305) * (float) this.field5810 / var7);
            int var12 = (int) (((float) arg5 * this.field5856.field1301 + (float) arg3 * this.field5856.field1307 + (float) arg4 * this.field5856.field1306 + this.field5856.field1305) * (float) this.field5810 / var8);
            return (!((float) var11 < this.field5891) || !((float) var12 < this.field5891)) && (!((float) var11 > this.field5826) || !((float) var12 > this.field5826));
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(IIIIII)V")
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2472();
        this.method2424(arg5);
        this.field5783.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5843) {
            this.field5783.glDisable(32925);
        }
        this.field5783.glBegin(7);
        this.field5783.glVertex2f(var7, var8);
        this.field5783.glVertex2f(var7, var10);
        this.field5783.glVertex2f(var9, var10);
        this.field5783.glVertex2f(var9, var8);
        this.field5783.glEnd();
        if (this.field5843) {
            this.field5783.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "()V")
    public final void method353() {
        this.method2465(true);
        this.field5783.glClear(256);
    }

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "(Z)V")
    public final void method2486(boolean arg0) {
        if (this.field5901 != arg0) {
            this.field5901 = arg0;
            this.method2493();
            this.field5813 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "()F")
    public final float method366() {
        return this.field5824;
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "()Z")
    public final boolean method421() {
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "nb", descriptor = "()V")
    private final void method2487() {
        int var1;
        if (this.field5870) {
            this.field5783.glFogf(2915, 0.0F);
            this.field5783.glFogf(2916, 1.0F);
            var1 = this.field5819;
        } else {
            this.field5849 = (float) (this.field5853 - 256) - this.field5836;
            this.field5865 = this.field5849 - (float) this.field5833 * this.field5817;
            if (this.field5865 < (float) this.field5811) {
                this.field5865 = (float) this.field5811;
            }
            this.field5783.glFogf(2915, this.field5865);
            this.field5783.glFogf(2916, this.field5849);
            var1 = this.field5818;
        }
        field5781[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field5781[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field5781[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field5783.glFogfv(2918, field5781, 0);
    }

    @OriginalMember(owner = "client!cg", name = "ob", descriptor = "()V")
    private final void method2488() {
        float[] var1 = this.field5844;
        float var2 = (float) (-this.field5858 * this.field5811) / (float) this.field5820;
        float var3 = (float) ((this.field5791 - this.field5858) * this.field5811) / (float) this.field5820;
        float var4 = (float) (this.field5827 * this.field5811) / (float) this.field5810;
        float var5 = (float) ((this.field5827 - this.field5793) * this.field5811) / (float) this.field5810;
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
            float var6 = (float) this.field5811 * 2.0F;
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
            var1[10] = this.field5898 = (float) (-(this.field5853 + this.field5811)) / (float) (this.field5853 - this.field5811);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field5814 = -((float) this.field5853 * var6) / (float) (this.field5853 - this.field5811);
            var1[15] = 0.0F;
        }
        this.method2490();
    }

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "()Ljd;")
    public final class361 method434() {
        return this.field5784;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(F)V")
    public final void method2489(float arg0) {
        if (this.field5857 != arg0) {
            this.field5857 = arg0;
            if (this.field5862 == 3) {
                this.method2443();
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "pb", descriptor = "()V")
    private final void method2490() {
        if (this.field5824 == 0.0F) {
            this.field5844[10] = this.field5898;
            this.field5844[14] = this.field5814;
        } else {
            float var1 = this.field5907 / (this.field5907 + this.field5824);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field5814 * (1.0F - var1) / this.field5824;
            this.field5844[10] = this.field5898 + var3;
            this.field5844[14] = this.field5814 * var2;
        }
        this.field5872 = (this.field5844[14] - (float) this.field5853) / this.field5844[10];
        this.field5847 = (float) this.field5853 - this.field5824;
    }

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "()I")
    public final int method381() {
        return this.field5853;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)V")
    public final void method350(int arg0, int arg1) {
        if (this.field5811 == arg0 && this.field5853 == arg1) {
            return;
        }
        this.field5811 = arg0;
        this.field5853 = arg1;
        this.method2488();
        this.method2487();
        if (this.field5862 == 3) {
            this.method2443();
        } else if (this.field5862 == 2) {
            this.method2450();
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lvd;)V")
    public final void method2491(class231 arg0) {
        if (this.field5790 >= 3) {
            throw new RuntimeException();
        }
        if (this.field5790 >= 0) {
            this.field5788[this.field5790].method1400();
        }
        this.field5796 = this.field5788[++this.field5790] = arg0;
        this.field5796.method1399();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lwp;Lwa;Ljd;Lid;I)V")
    public final void method369(class292 arg0, class439 arg1, class361 arg2, class158 arg3, int arg4) {
        arg0.method1282(arg2, arg3, arg4);
        this.method349(arg1);
    }

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "(I)V")
    public final synchronized void method2492(int arg0) {
        class350 var2 = new class350(arg0);
        this.field5803.method2504(42, var2);
    }

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "()V")
    public final void method374() {
        if (this.field5791 <= 0 && this.field5793 <= 0) {
            return;
        }
        int var1 = this.field5869;
        int var2 = this.field5845;
        int var3 = this.field5897;
        int var4 = this.field5894;
        this.method433();
        this.field5783.glReadBuffer(1028);
        this.field5783.glDrawBuffer(1029);
        this.method2466();
        this.method2481(false);
        this.method2486(false);
        this.method2483(false);
        this.method2465(false);
        this.method2460((class325) null);
        this.method2474(-2);
        this.method2467(0);
        this.method2424(0);
        this.field5783.glMatrixMode(5889);
        this.field5783.glLoadIdentity();
        this.field5783.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field5783.glMatrixMode(5888);
        this.field5783.glLoadIdentity();
        this.field5783.glRasterPos2i(0, 0);
        this.field5783.glCopyPixels(0, 0, this.field5791, this.field5793, 6144);
        this.field5783.glFlush();
        this.field5783.glReadBuffer(1029);
        this.field5783.glDrawBuffer(1029);
        this.method436(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public final void method443(boolean arg0) {
        this.field5867 = arg0;
        this.method2446();
    }

    @OriginalMember(owner = "client!cg", name = "qb", descriptor = "()V")
    private final void method2493() {
        if (this.field5901 && !this.field5904) {
            this.field5783.glEnable(2896);
        } else {
            this.field5783.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "(I)I")
    public final int method2494(int arg0) {
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

    @OriginalMember(owner = "client!cg", name = "rb", descriptor = "()V")
    private final void method2495() {
        if (this.field5862 == 1) {
            return;
        }
        this.field5783.glMatrixMode(5889);
        this.field5783.glLoadIdentity();
        if (this.field5791 > 0 && this.field5793 > 0) {
            this.field5783.glOrtho(0.0D, (double) this.field5791, (double) this.field5793, 0.0D, -1.0D, 1.0D);
        }
        this.field5783.glMatrixMode(5888);
        this.field5783.glLoadIdentity();
        this.field5862 = 1;
        this.field5813 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()I")
    public final int method1401() {
        return this.field5793;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lec;IILsc;)V")
    public class393(Canvas arg0, class96 arg1, int arg2, int arg3, class239 arg4) {
        this.field5779 = arg0;
        this.field5773 = arg1;
        this.field3971 = arg2;
        int var6 = 0;
        while (!this.field5779.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class109.method674((byte) 99, 1000L);
        }
        this.field5779.setIgnoreRepaint(true);
        try {
            if (field5775 == null || !field5775) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field5775 = Boolean.TRUE;
                } else {
                    class211 var7 = arg4.method1457(-11733, this.getClass());
                    while (var7.field3172 == 0) {
                        class109.method674((byte) 99, 100L);
                    }
                    if (var7.field3172 == 1) {
                        field5775 = Boolean.TRUE;
                    }
                }
            }
            if (field5775 == null || !field5775) {
                throw new RuntimeException("");
            }
            this.field5777 = new context();
            if (!this.field5777.choosePixelFormat(this.field5779, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field5777.createContext()) {
                this.method2435();
                this.field5783 = this.field5777.getGL();
                int var8 = this.method2484();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field5876 = this.field5879 ? 33639 : 5121;
                String var9 = this.field5816.toLowerCase();
                String var10 = this.field5902.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class110.method677(' ', var10.replace('/', ' '), (byte) -120);
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class272.method1695(62, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class272.method1695(-50, var16.substring(0, 4))) {
                                        var11 = class25.method154(var16.substring(0, 4), (byte) -115);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field5832 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field5805 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field5892 = false;
                    }
                    this.field5855 &= this.field5783.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field5851 = this.field5832;
                }
                if (var9.contains("intel")) {
                    this.field5895 = false;
                }
                if (this.field5832) {
                    try {
                        int[] var18 = new int[1];
                        this.field5783.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2491(this);
                this.method391();
                this.method2438();
                new class395(this);
                this.field5774 = new class421(this, this.field5773);
                class15.method86(true, true, 99);
                this.field5795 = true;
                this.field5771 = new class218(this);
                this.field5772 = new class305(this);
                this.field5780 = new class179(this);
                this.method2437();
                this.field5783.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field5777.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class109.method674((byte) 99, 100L);
                    }
                }
                this.field5783.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method357();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
