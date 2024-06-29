import jaggl.context;
import jaggl.opengl;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class338 extends class281 implements class177 {

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Lsn;")
    private class375 field4604 = new class375();

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Lci;")
    private class261 field4613 = new class131();

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    private int field4618 = -1;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public int field4621 = 8;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "[Lfp;")
    private class177[] field4622 = new class177[4];

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "Z")
    private boolean field4617 = false;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public int field4625 = 3;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Ltc;")
    private class196 field4626 = new class196();

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Ltc;")
    private class196 field4627 = new class196();

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "Ltc;")
    private class196 field4628 = new class196();

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "Ltc;")
    private class196 field4629 = new class196();

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "Ltc;")
    private class196 field4630 = new class196();

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "Ltc;")
    private class196 field4631 = new class196();

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "Ltc;")
    private class196 field4632 = new class196();

    @OriginalMember(owner = "client!hj", name = "kb", descriptor = "F")
    private float field4645 = 0.0F;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "Z")
    private boolean field4634 = true;

    @OriginalMember(owner = "client!hj", name = "mb", descriptor = "[F")
    private float[] field4647 = new float[4];

    @OriginalMember(owner = "client!hj", name = "rb", descriptor = "[F")
    private float[] field4652 = new float[4];

    @OriginalMember(owner = "client!hj", name = "pb", descriptor = "F")
    private float field4650 = 1.0F;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    private int field4639 = 8448;

    @OriginalMember(owner = "client!hj", name = "xb", descriptor = "[F")
    private float[] field4658 = new float[16];

    @OriginalMember(owner = "client!hj", name = "Nb", descriptor = "F")
    private float field4674 = 1.0F;

    @OriginalMember(owner = "client!hj", name = "Kb", descriptor = "I")
    private int field4671 = 0;

    @OriginalMember(owner = "client!hj", name = "Ib", descriptor = "F")
    public float field4669 = -1.0F;

    @OriginalMember(owner = "client!hj", name = "Zb", descriptor = "I")
    public int field4686 = -1;

    @OriginalMember(owner = "client!hj", name = "Yb", descriptor = "F")
    public float field4685 = 1.0F;

    @OriginalMember(owner = "client!hj", name = "fc", descriptor = "I")
    public int field4692 = 3584;

    @OriginalMember(owner = "client!hj", name = "Pb", descriptor = "F")
    public float field4676 = 1.0F;

    @OriginalMember(owner = "client!hj", name = "Dc", descriptor = "[F")
    private float[] field4716 = new float[4];

    @OriginalMember(owner = "client!hj", name = "Jb", descriptor = "F")
    public float field4670 = 1.0F;

    @OriginalMember(owner = "client!hj", name = "Ec", descriptor = "I")
    private int field4717 = 0;

    @OriginalMember(owner = "client!hj", name = "Jc", descriptor = "F")
    public float field4722 = 3584.0F;

    @OriginalMember(owner = "client!hj", name = "Bb", descriptor = "I")
    public int field4662 = 50;

    @OriginalMember(owner = "client!hj", name = "Ac", descriptor = "I")
    private int field4713 = -1;

    @OriginalMember(owner = "client!hj", name = "Kc", descriptor = "I")
    private int field4723 = 0;

    @OriginalMember(owner = "client!hj", name = "Bc", descriptor = "[F")
    public float[] field4714 = new float[4];

    @OriginalMember(owner = "client!hj", name = "Sb", descriptor = "F")
    public float field4679 = -1.0F;

    @OriginalMember(owner = "client!hj", name = "Oc", descriptor = "I")
    public int field4727 = 512;

    @OriginalMember(owner = "client!hj", name = "Xb", descriptor = "I")
    public int field4684 = 0;

    @OriginalMember(owner = "client!hj", name = "Lc", descriptor = "I")
    private int field4724 = -1;

    @OriginalMember(owner = "client!hj", name = "nc", descriptor = "F")
    public float field4700 = 3584.0F;

    @OriginalMember(owner = "client!hj", name = "Nc", descriptor = "I")
    public int field4726 = -1;

    @OriginalMember(owner = "client!hj", name = "Sc", descriptor = "I")
    private int field4731 = 0;

    @OriginalMember(owner = "client!hj", name = "Tc", descriptor = "I")
    private int field4732 = 0;

    @OriginalMember(owner = "client!hj", name = "bc", descriptor = "I")
    public int field4688 = 0;

    @OriginalMember(owner = "client!hj", name = "Pc", descriptor = "I")
    public int field4728 = 512;

    @OriginalMember(owner = "client!hj", name = "oc", descriptor = "I")
    private int field4701 = 0;

    @OriginalMember(owner = "client!hj", name = "Mc", descriptor = "I")
    public int field4725 = -1;

    @OriginalMember(owner = "client!hj", name = "Fb", descriptor = "I")
    private int field4666 = 8448;

    @OriginalMember(owner = "client!hj", name = "Qc", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4605;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "Lsr;")
    public class136 field4611;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Ljaggl/context;")
    private context field4601;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "Ljaggl/opengl;")
    public opengl field4607;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "Z")
    public boolean field4640;

    @OriginalMember(owner = "client!hj", name = "ub", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "Ljava/lang/String;")
    private String field4633;

    @OriginalMember(owner = "client!hj", name = "Eb", descriptor = "Ljava/lang/String;")
    private String field4665;

    @OriginalMember(owner = "client!hj", name = "Hc", descriptor = "Z")
    private boolean field4720;

    @OriginalMember(owner = "client!hj", name = "hc", descriptor = "Z")
    public boolean field4694;

    @OriginalMember(owner = "client!hj", name = "vc", descriptor = "Z")
    public boolean field4708;

    @OriginalMember(owner = "client!hj", name = "gc", descriptor = "Z")
    public boolean field4693;

    @OriginalMember(owner = "client!hj", name = "qb", descriptor = "Z")
    private boolean field4651;

    @OriginalMember(owner = "client!hj", name = "sc", descriptor = "Z")
    public boolean field4705;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lri;")
    public class59 field4612;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Lee;")
    private class402 field4600;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Lrl;")
    private class428 field4602;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Lvp;")
    private class101 field4603;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "[F")
    private static float[] field4606 = new float[4];

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "Ljava/lang/Boolean;")
    private static Boolean field4608 = Boolean.FALSE;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[F")
    private static float[] field4609 = new float[4];

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "[I")
    private static int[] field4610 = new int[1000];

    @OriginalMember(owner = "client!hj", name = "nb", descriptor = "F")
    public float field4648;

    @OriginalMember(owner = "client!hj", name = "wb", descriptor = "F")
    private float field4657;

    @OriginalMember(owner = "client!hj", name = "Mb", descriptor = "F")
    public float field4673;

    @OriginalMember(owner = "client!hj", name = "Ub", descriptor = "F")
    public float field4681;

    @OriginalMember(owner = "client!hj", name = "Wb", descriptor = "F")
    public float field4683;

    @OriginalMember(owner = "client!hj", name = "ac", descriptor = "F")
    public float field4687;

    @OriginalMember(owner = "client!hj", name = "mc", descriptor = "F")
    public float field4699;

    @OriginalMember(owner = "client!hj", name = "pc", descriptor = "F")
    public float field4702;

    @OriginalMember(owner = "client!hj", name = "tc", descriptor = "F")
    private float field4706;

    @OriginalMember(owner = "client!hj", name = "yc", descriptor = "F")
    private float field4711;

    @OriginalMember(owner = "client!hj", name = "Ic", descriptor = "F")
    public float field4721;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    private int field4623;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!hj", name = "ob", descriptor = "I")
    private int field4649;

    @OriginalMember(owner = "client!hj", name = "tb", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!hj", name = "zb", descriptor = "I")
    private int field4660;

    @OriginalMember(owner = "client!hj", name = "Hb", descriptor = "I")
    private int field4668;

    @OriginalMember(owner = "client!hj", name = "Lb", descriptor = "I")
    private int field4672;

    @OriginalMember(owner = "client!hj", name = "Tb", descriptor = "I")
    private int field4680;

    @OriginalMember(owner = "client!hj", name = "kc", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!hj", name = "lc", descriptor = "I")
    private int field4698;

    @OriginalMember(owner = "client!hj", name = "qc", descriptor = "I")
    public int field4703;

    @OriginalMember(owner = "client!hj", name = "uc", descriptor = "I")
    private int field4707;

    @OriginalMember(owner = "client!hj", name = "Wc", descriptor = "I")
    private int field4735;

    @OriginalMember(owner = "client!hj", name = "Xc", descriptor = "I")
    private int field4736;

    @OriginalMember(owner = "client!hj", name = "Vb", descriptor = "J")
    private long field4682;

    @OriginalMember(owner = "client!hj", name = "Gb", descriptor = "Loc;")
    private class112 field4667;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "Lbj;")
    public class131 field4636;

    @OriginalMember(owner = "client!hj", name = "vb", descriptor = "Lbj;")
    public class131 field4656;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "Lqa;")
    public class134 field4638;

    @OriginalMember(owner = "client!hj", name = "yb", descriptor = "Lqa;")
    public class134 field4659;

    @OriginalMember(owner = "client!hj", name = "jc", descriptor = "Lqa;")
    public class134 field4696;

    @OriginalMember(owner = "client!hj", name = "xc", descriptor = "Lqa;")
    public class134 field4710;

    @OriginalMember(owner = "client!hj", name = "Cc", descriptor = "Lqa;")
    public class134 field4715;

    @OriginalMember(owner = "client!hj", name = "Fc", descriptor = "Lqa;")
    public class134 field4718;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "Lfp;")
    private class177 field4614;

    @OriginalMember(owner = "client!hj", name = "sb", descriptor = "Lrq;")
    public class195 field4653;

    @OriginalMember(owner = "client!hj", name = "zc", descriptor = "Lrq;")
    public class195 field4712;

    @OriginalMember(owner = "client!hj", name = "Vc", descriptor = "Lrq;")
    public class195 field4734;

    @OriginalMember(owner = "client!hj", name = "ic", descriptor = "Lbc;")
    private class205 field4695;

    @OriginalMember(owner = "client!hj", name = "ec", descriptor = "Lsg;")
    private class226 field4691;

    @OriginalMember(owner = "client!hj", name = "Rb", descriptor = "Lvi;")
    public class317 field4678;

    @OriginalMember(owner = "client!hj", name = "Uc", descriptor = "Loo;")
    private class372 field4733;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "Z")
    public boolean field4635;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "Z")
    private boolean field4637;

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "Z")
    public boolean field4643;

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "Z")
    private boolean field4644;

    @OriginalMember(owner = "client!hj", name = "lb", descriptor = "Z")
    private boolean field4646;

    @OriginalMember(owner = "client!hj", name = "Ab", descriptor = "Z")
    public boolean field4661;

    @OriginalMember(owner = "client!hj", name = "Db", descriptor = "Z")
    public boolean field4664;

    @OriginalMember(owner = "client!hj", name = "Ob", descriptor = "Z")
    private boolean field4675;

    @OriginalMember(owner = "client!hj", name = "Qb", descriptor = "Z")
    private boolean field4677;

    @OriginalMember(owner = "client!hj", name = "cc", descriptor = "Z")
    private boolean field4689;

    @OriginalMember(owner = "client!hj", name = "dc", descriptor = "Z")
    private boolean field4690;

    @OriginalMember(owner = "client!hj", name = "rc", descriptor = "Z")
    private boolean field4704;

    @OriginalMember(owner = "client!hj", name = "wc", descriptor = "Z")
    private boolean field4709;

    @OriginalMember(owner = "client!hj", name = "Gc", descriptor = "Z")
    private boolean field4719;

    @OriginalMember(owner = "client!hj", name = "Rc", descriptor = "Z")
    public boolean field4730;

    @OriginalMember(owner = "client!hj", name = "Cb", descriptor = "[Lnj;")
    private class133[] field4663;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ler;)V")
    public final void method1823(class55 arg0) {
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhc;Lqd;Lci;Lbd;I)V")
    public final void method1721(class75 arg0, class260 arg1, class261 arg2, class38 arg3, int arg4) {
        arg0.method514(arg2, arg3, arg4);
        this.method1737(arg1);
    }

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "()V")
    public final void method2101() {
        if (this.field4660 == 4) {
            return;
        }
        this.method2121();
        this.method2122(false);
        this.method2147(false);
        this.method2159(false);
        this.method2133(false);
        this.method2146(-2);
        this.method2125(1);
        this.method2129(1);
        this.field4660 = 4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbj;)V")
    public final void method2102(class131 arg0) {
        this.field4607.glPushMatrix();
        this.field4607.glMultMatrixf(arg0.method895(0), 0);
    }

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "()V")
    public final void method2103() {
        this.field4607.glLightfv(16384, 4611, this.field4647, 0);
        this.field4607.glLightfv(16385, 4611, this.field4652, 0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1772(Canvas arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFFF)V")
    public final void method2104(float arg0, float arg1, float arg2, float arg3) {
        field4609[0] = arg0;
        field4609[1] = arg1;
        field4609[2] = arg2;
        field4609[3] = arg3;
        this.field4607.glTexEnvfv(8960, 8705, field4609, 0);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(II)V")
    public final void method2105(int arg0, int arg1) {
        this.field4671 = arg0;
        this.field4732 = arg1;
        this.field4607.glViewport(arg0, arg1, this.field4620, this.field4616);
        this.method2115();
    }

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "()V")
    private final void method2106() {
        this.field4656 = new class131();
        this.field4636 = new class131();
        this.field4663 = new class133[this.field4697];
        this.field4734 = new class195(this, 3553, 6408, 1, 1);
        this.field4653 = new class195(this, 3553, 6408, 1, 1);
        this.field4712 = new class195(this, 3553, 6408, 1, 1);
        this.field4710 = new class134(this);
        this.field4659 = new class134(this);
        this.field4715 = new class134(this);
        this.field4718 = new class134(this);
        this.field4638 = new class134(this);
        this.field4696 = new class134(this);
        if (this.field4705) {
            this.field4678 = new class317(this);
        }
        this.field4604.method2454(this);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BIZ)Loc;")
    public final class112 method2107(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class112) (this.field4720 && !arg3 || this.field4651 ? new class388(this, arg0, arg1, arg2, arg3) : new class251(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[I)V")
    public final void method1742(int arg0, int arg1, int arg2, int[] arg3) {
        float var5 = (float) arg2 * this.field4656.field1820 + (float) arg0 * this.field4656.field1819 + (float) arg1 * this.field4656.field1829 + this.field4656.field1818;
        if ((var5 < (float) this.field4662) || (var5 > (float) this.field4692)) {
            arg3[0] = arg3[1] = arg3[2] = -1;
            return;
        }
        int var6 = (int) (((float) arg2 * this.field4656.field1823 + (float) arg0 * this.field4656.field1824 + (float) arg1 * this.field4656.field1826 + this.field4656.field1817) * (float) this.field4727 / var5);
        int var7 = (int) (((float) arg2 * this.field4656.field1825 + (float) arg0 * this.field4656.field1827 + (float) arg1 * this.field4656.field1828 + this.field4656.field1822) * (float) this.field4728 / var5);
        if ((float) var6 >= this.field4683 && (float) var6 <= this.field4673 && (float) var7 >= this.field4699 && (float) var7 <= this.field4681) {
            arg3[0] = (int) ((float) var6 - this.field4683);
            arg3[1] = (int) ((float) var7 - this.field4699);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIII)V")
    public final void method1731(int arg0, int arg1, int arg2, int arg3) {
        this.field4602.method2699(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(II)I")
    public final int method1777(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
    public final synchronized void method2108(int arg0) {
        class23 var2 = new class23(arg0);
        this.field4632.method1301(50, var2);
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)I")
    public final int method2109(int arg0) {
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

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z")
    public final boolean method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg2 * this.field4656.field1820 + (float) arg0 * this.field4656.field1819 + (float) arg1 * this.field4656.field1829 + this.field4656.field1818;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4656.field1820 + (float) arg3 * this.field4656.field1819 + (float) arg4 * this.field4656.field1829 + this.field4656.field1818;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if (!(!(var7 < (float) this.field4662) || !(var8 < (float) this.field4662)) || !(!(var7 > (float) this.field4692) || !(var8 > (float) this.field4692))) {
            return false;
        }
        int var9 = (int) (((float) arg2 * this.field4656.field1823 + (float) arg0 * this.field4656.field1824 + (float) arg1 * this.field4656.field1826 + this.field4656.field1817) * (float) this.field4727 / var7);
        int var10 = (int) (((float) arg5 * this.field4656.field1823 + (float) arg3 * this.field4656.field1824 + (float) arg4 * this.field4656.field1826 + this.field4656.field1817) * (float) this.field4727 / var8);
        if ((float) var9 < this.field4683 && (float) var10 < this.field4683 || (float) var9 > this.field4673 && (float) var10 > this.field4673) {
            return false;
        } else {
            int var11 = (int) (((float) arg2 * this.field4656.field1825 + (float) arg0 * this.field4656.field1827 + (float) arg1 * this.field4656.field1828 + this.field4656.field1822) * (float) this.field4728 / var7);
            int var12 = (int) (((float) arg5 * this.field4656.field1825 + (float) arg3 * this.field4656.field1827 + (float) arg4 * this.field4656.field1828 + this.field4656.field1822) * (float) this.field4728 / var8);
            return (!((float) var11 < this.field4699) || !((float) var12 < this.field4699)) && (!((float) var11 > this.field4681) || !((float) var12 > this.field4681));
        }
    }

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "()F")
    public final float method1767() {
        return this.field4702;
    }

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "()V")
    public final void method1811() {
    }

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "()Lci;")
    public final class261 method1769() {
        return this.field4613;
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V")
    public final synchronized void method2110(int arg0) {
        class23 var2 = new class23(arg0);
        this.field4631.method1301(50, var2);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZZ)V")
    public final void method2111(int arg0, boolean arg1, boolean arg2) {
        if (this.field4668 != arg0) {
            if (arg0 < 0) {
                this.method2155();
                this.method2165((class133) null);
                if (!this.field4661) {
                    this.field4600.method2596(arg1, 0, arg2, 106);
                }
            } else {
                class195 var4 = this.field4612.method391(arg0, 256);
                class164 var5 = this.field4611.method607(false, arg0);
                if (var5.field2315 == 0 && var5.field2309 == 0) {
                    this.method2155();
                } else {
                    int var6 = var5.field2301 ? 64 : 128;
                    int var7 = var6 * 50;
                    this.method2123((float) (this.field4615 % var7 * var5.field2315) / (float) var7, (float) (this.field4615 % var7 * var5.field2309) / (float) var7, 0.0F);
                }
                if (this.field4661) {
                    this.field4600.method2596(arg1, 3, arg2, 115);
                    this.method2165(var4);
                } else {
                    this.field4600.method2596(arg1, var5.field2299, arg2, 114);
                    this.field4600.method2594(var5.field2326, false, true);
                    if (!this.field4600.method2593((byte) 111, var4)) {
                        this.method2165(var4);
                    }
                }
            }
            this.field4668 = arg0;
        }
        this.field4660 &= 0xFFFFFFF8;
    }

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "()Z")
    public final boolean method1780() {
        return this.field4603.method350((byte) -34);
    }

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "()V")
    private final void method2112() {
        float var1 = (float) (-this.field4684) * this.field4650 / (float) this.field4727;
        float var2 = (float) (-this.field4688) * this.field4650 / (float) this.field4728;
        float var3 = (float) (this.field4620 - this.field4684) * this.field4650 / (float) this.field4727;
        float var4 = (float) (this.field4616 - this.field4688) * this.field4650 / (float) this.field4728;
        this.field4607.glMatrixMode(5889);
        this.field4607.glLoadIdentity();
        if (var1 != var3 && var2 != var4) {
            this.field4607.glOrtho((double) var1, (double) var3, (double) (-var4), (double) (-var2), (double) ((float) this.field4662 - this.field4702), (double) ((float) this.field4692 - this.field4702));
        }
        this.field4607.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "()V")
    private final void method2113() {
        int var1;
        if (this.field4661) {
            this.field4607.glFogf(2915, 0.0F);
            this.field4607.glFogf(2916, 1.0F);
            var1 = this.field4724;
        } else {
            this.field4711 = (float) (this.field4692 - 256) - this.field4645;
            this.field4687 = this.field4711 - (float) this.field4726 * this.field4674;
            if (this.field4687 < (float) this.field4662) {
                this.field4687 = (float) this.field4662;
            }
            this.field4607.glFogf(2915, this.field4687);
            this.field4607.glFogf(2916, this.field4711);
            var1 = this.field4686;
        }
        field4609[0] = (float) (var1 & 0xFF0000) / 1.671168E7F;
        field4609[1] = (float) (var1 & 0xFFFF) / 65535.0F;
        field4609[2] = (float) (var1 & 0xFF) / 255.0F;
        this.field4607.glFogfv(2918, field4609, 0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
    public final int method1181() {
        return this.field4616;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lsg;")
    public final class226 method2114(int arg0, ByteBuffer arg1, boolean arg2) {
        return (class226) (this.field4720 && !arg2 || this.field4651 ? new class391(this, arg0, arg1, arg2) : new class420(this, arg0, arg1));
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FF)V")
    public final void method1805(float arg0, float arg1) {
        if (this.field4648 == arg0 && this.field4702 == arg1) {
            return;
        }
        this.field4648 = arg0;
        this.field4702 = arg1;
        this.method2138();
        if (this.field4672 == 3) {
            this.method2112();
        } else if (this.field4672 == 2) {
            this.method2132();
        }
    }

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "()V")
    private final void method2115() {
        if (this.field4701 <= this.field4717 && this.field4723 <= this.field4729) {
            this.field4607.glScissor(this.field4701 + this.field4671, this.field4732 + this.field4616 - this.field4729, this.field4717 - this.field4701, this.field4729 - this.field4723);
        } else {
            this.field4607.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZ)Llf;")
    public final class130 method1751(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class172(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIIII)V")
    public final void method1810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2143();
        this.method2125(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4607.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4607.glBegin(1);
        this.field4607.glVertex2f(var6, var7);
        this.field4607.glVertex2f(var6, (float) arg2 + var7);
        this.field4607.glEnd();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIII)V")
    public final void method1771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2143();
        this.method2125(arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        this.field4607.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        this.field4607.glBegin(1);
        this.field4607.glVertex2f(var6, var7);
        this.field4607.glVertex2f((float) arg2 + var6, var7);
        this.field4607.glEnd();
    }

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "()V")
    public final void method2116() {
        if (this.field4660 == 16) {
            return;
        }
        this.method2157();
        this.method2122(true);
        this.method2159(true);
        this.method2133(true);
        this.method2125(1);
        this.method2129(1);
        this.field4660 = 16;
    }

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "()V")
    private final void method2117() {
        this.field4683 = (float) (this.field4701 - this.field4684);
        this.field4673 = (float) (this.field4717 - this.field4684);
        this.field4699 = (float) (this.field4723 - this.field4688);
        this.field4681 = (float) (this.field4729 - this.field4688);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(F)V")
    public final void method1826(float arg0) {
        if (this.field4721 != arg0) {
            this.field4721 = arg0;
            this.method2169();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([I)V")
    public final void method1796(int[] arg0) {
        arg0[0] = this.field4701;
        arg0[1] = this.field4723;
        arg0[2] = this.field4717;
        arg0[3] = this.field4729;
    }

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "()V")
    public final void method2118() {
        if (this.field4660 == 2) {
            return;
        }
        this.method2121();
        this.method2122(false);
        this.method2147(false);
        this.method2159(false);
        this.method2133(false);
        this.method2146(-2);
        this.field4660 = 2;
    }

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "()V")
    public final void method1816() {
        if (this.field4620 <= 0 && this.field4616 <= 0) {
            return;
        }
        int var1 = this.field4701;
        int var2 = this.field4717;
        int var3 = this.field4723;
        int var4 = this.field4729;
        this.method1812();
        this.field4607.glReadBuffer(1028);
        this.field4607.glDrawBuffer(1029);
        this.method2141();
        this.method2122(false);
        this.method2147(false);
        this.method2159(false);
        this.method2133(false);
        this.method2165((class133) null);
        this.method2146(-2);
        this.method2129(0);
        this.method2125(0);
        this.field4607.glMatrixMode(5889);
        this.field4607.glLoadIdentity();
        this.field4607.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        this.field4607.glMatrixMode(5888);
        this.field4607.glLoadIdentity();
        this.field4607.glRasterPos2i(0, 0);
        this.field4607.glCopyPixels(0, 0, this.field4620, this.field4616, 6144);
        this.field4607.glFlush();
        this.field4607.glReadBuffer(1029);
        this.field4607.glDrawBuffer(1029);
        this.method1735(var1, var3, var2, var4);
    }

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "()V")
    public final void method1761() {
        this.field4620 = this.field4605.getWidth();
        this.field4616 = this.field4605.getHeight();
        this.field4607.glViewport(this.field4671, this.field4732, this.field4620, this.field4616);
        this.method2141();
        this.method1812();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I[BIZ)Lsg;")
    public final class226 method2119(int arg0, byte[] arg1, int arg2, boolean arg3) {
        return (class226) (this.field4720 && !arg3 || this.field4651 ? new class391(this, arg0, arg1, arg2, arg3) : new class420(this, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V")
    public final void method1801(int arg0) {
        if (arg0 != 1) {
            throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)V")
    public final void method2120(int arg0, int arg1, int arg2) {
        this.field4607.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "()I")
    public final int method1750() {
        int var1 = this.field4735;
        this.field4735 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIIIII)V")
    public final void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2143();
        this.method2125(arg5);
        this.field4607.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4607.glBegin(2);
        this.field4607.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4607.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4607.glEnd();
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIIIII)V")
    public final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2143();
        this.method2125(arg5);
        this.field4607.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4646) {
            this.field4607.glDisable(32925);
        }
        this.field4607.glBegin(7);
        this.field4607.glVertex2f(var7, var8);
        this.field4607.glVertex2f(var7, var10);
        this.field4607.glVertex2f(var9, var10);
        this.field4607.glVertex2f(var9, var8);
        this.field4607.glEnd();
        if (this.field4646) {
            this.field4607.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Ler;")
    public final class55 method1760(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[I[I)Ltm;")
    public final class220 method1784(int arg0, int arg1, int[] arg2, int[] arg3) {
        return class19.method121((byte) -58, this, arg3, arg1, arg0, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "()V")
    private final void method2121() {
        if (this.field4672 == 1) {
            return;
        }
        this.field4607.glMatrixMode(5889);
        this.field4607.glLoadIdentity();
        if (this.field4620 > 0 && this.field4616 > 0) {
            this.field4607.glOrtho(0.0D, (double) this.field4620, (double) this.field4616, 0.0D, -1.0D, 1.0D);
        }
        this.field4607.glMatrixMode(5888);
        this.field4607.glLoadIdentity();
        this.field4672 = 1;
        this.field4660 &= 0xFFFFFFE7;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(Z)V")
    public final void method2122(boolean arg0) {
        if (this.field4675 != arg0) {
            this.field4675 = arg0;
            this.method2164();
            this.field4660 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(FFF)V")
    private final void method2123(float arg0, float arg1, float arg2) {
        this.field4607.glMatrixMode(5890);
        if (this.field4644) {
            this.field4607.glLoadIdentity();
        }
        this.field4607.glTranslatef(arg0, arg1, arg2);
        this.field4607.glMatrixMode(5888);
        this.field4644 = true;
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "()Z")
    public final boolean method1729() {
        return this.field4646;
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "()V")
    public final void method1741() {
        this.field4600.method2596(false, 0, false, 103);
        this.field4661 = false;
        this.method2113();
        this.method2164();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[[I[[IIII)Lsm;")
    public final class156 method1821(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class39(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ldi;[Lnc;Z)Lrj;")
    public final class352 method1791(class65 arg0, class18[] arg1, boolean arg2) {
        return new class90(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)I")
    public final int method2124(int arg0) {
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

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "()V")
    public final void method1813() {
        this.field4602.method2698();
    }

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "()Z")
    public final boolean method1759() {
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)V")
    public final void method2125(int arg0) {
        if (this.field4680 == arg0) {
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
        if (this.field4637 != var3) {
            this.field4607.glColorMask(var3, var3, var3, true);
            this.field4637 = var3;
        }
        if (this.field4709 != var4) {
            if (var4) {
                this.field4607.glEnable(3008);
            } else {
                this.field4607.glDisable(3008);
            }
            this.field4709 = var4;
        }
        if (this.field4707 != var2) {
            if (var2 == 1) {
                this.field4607.glEnable(3042);
                this.field4607.glBlendEquation(32774);
                this.field4607.glBlendFunc(770, 771);
            } else if (var2 == 2) {
                this.field4607.glEnable(3042);
                this.field4607.glBlendEquation(32774);
                this.field4607.glBlendFunc(1, 1);
            } else if (var2 == 3) {
                this.field4607.glEnable(3042);
                this.field4607.glBlendEquation(32778);
                this.field4607.glBlendFunc(1, 1);
            } else if (var2 == 4) {
                this.field4607.glEnable(3042);
                this.field4607.glBlendEquation(32774);
                this.field4607.glBlendFunc(774, 1);
            } else {
                this.field4607.glDisable(3042);
            }
            this.field4707 = var2;
        }
        this.field4680 = arg0;
        this.field4660 &= 0xFFFFFFE3;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(F)V")
    public final void method2126(float arg0) {
        if (this.field4650 != arg0) {
            this.field4650 = arg0;
            if (this.field4672 == 3) {
                this.method2112();
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "()V")
    private final void method2127() {
        this.field4607.glDepthMask(this.field4704 && this.field4634);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILtm;II)V")
    public final void method1819(int arg0, class220 arg1, int arg2, int arg3) {
        class19 var5 = (class19) arg1;
        class205 var6 = var5.field249;
        this.method2118();
        this.method2165(var5.field249);
        this.method2125(1);
        this.method2140(7681, 8448);
        this.method2161(0, 34167, 768);
        float var7 = var6.field2776 / (float) var6.field2775;
        float var8 = var6.field2777 / (float) var6.field2774;
        this.field4607.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        this.field4607.glBegin(7);
        this.field4607.glTexCoord2f((float) (this.field4701 - arg2) * var7, (float) (this.field4723 - arg3) * var8);
        this.field4607.glVertex2i(this.field4701, this.field4723);
        this.field4607.glTexCoord2f((float) (this.field4701 - arg2) * var7, (float) (this.field4729 - arg3) * var8);
        this.field4607.glVertex2i(this.field4701, this.field4729);
        this.field4607.glTexCoord2f((float) (this.field4717 - arg2) * var7, (float) (this.field4729 - arg3) * var8);
        this.field4607.glVertex2i(this.field4717, this.field4729);
        this.field4607.glTexCoord2f((float) (this.field4717 - arg2) * var7, (float) (this.field4723 - arg3) * var8);
        this.field4607.glVertex2i(this.field4717, this.field4723);
        this.field4607.glEnd();
        this.method2161(0, 5890, 768);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lfp;)V")
    public final void method2128(class177 arg0) {
        if (this.field4618 >= 3) {
            throw new RuntimeException();
        }
        if (this.field4618 >= 0) {
            this.field4622[this.field4618].method1182();
        }
        this.field4614 = this.field4622[++this.field4618] = arg0;
        this.field4614.method1180();
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "()Z")
    public final boolean method1728() {
        return this.field4600.method2595(3, 8);
    }

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "()Lci;")
    public final class261 method1783() {
        return new class131();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public final int method1732(int arg0, int arg1) {
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)V")
    public final void method2129(int arg0) {
        if (arg0 == 0) {
            this.method2140(7681, 7681);
        } else if (arg0 == 1) {
            this.method2140(8448, 8448);
        } else if (arg0 == 2) {
            this.method2140(34165, 7681);
        }
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)I")
    public final int method2130(int arg0) {
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

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "()I")
    public final int method1797() {
        return 4;
    }

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "()F")
    public final float method1802() {
        return this.field4648;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IIIII)Llf;")
    public final class130 method1773(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class172(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public final void method1794(int arg0) {
        this.method2125(0);
        this.field4607.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        this.field4607.glClear(16384);
    }

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "()V")
    private final void method2131() {
        if (this.field4677 && !this.field4689) {
            this.field4607.glEnable(2896);
        } else {
            this.field4607.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILtm;II)V")
    public final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class220 arg6, int arg7, int arg8) {
        class19 var10 = (class19) arg6;
        class205 var11 = var10.field249;
        this.method2118();
        this.method2165(var10.field249);
        this.method2125(arg5);
        this.method2140(7681, 8448);
        this.method2161(0, 34167, 768);
        float var12 = var11.field2776 / (float) var11.field2775;
        float var13 = var11.field2777 / (float) var11.field2774;
        this.field4607.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.field4607.glBegin(1);
        this.field4607.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        this.field4607.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        this.field4607.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        this.field4607.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        this.field4607.glEnd();
        this.method2161(0, 5890, 768);
    }

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "()V")
    private final void method2132() {
        this.field4607.glMatrixMode(5889);
        this.field4607.glLoadMatrixf(this.field4658, 0);
        this.field4607.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnc;Z)Llf;")
    public final class130 method1807(class18 arg0, boolean arg1) {
        int[] var3 = new int[arg0.field247 * arg0.field242];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field243 == null) {
            for (int var8 = 0; var8 < arg0.field242; var8++) {
                for (int var9 = 0; var9 < arg0.field247; var9++) {
                    int var10 = arg0.field246[arg0.field240[var4++] & 0xFF];
                    var3[var5++] = var10 == 0 ? 0 : var10 | 0xFF000000;
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0.field242; var6++) {
                for (int var7 = 0; var7 < arg0.field247; var7++) {
                    var3[var5++] = arg0.field243[var4] << 24 | arg0.field246[arg0.field240[var4] & 0xFF];
                    var4++;
                }
            }
        }
        class130 var11 = this.method1773(var3, 0, arg0.field247, arg0.field247, arg0.field242);
        var11.method868(arg0.field244, arg0.field245, arg0.field241, arg0.field248);
        return var11;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(Z)V")
    public final void method2133(boolean arg0) {
        if (this.field4704 != arg0) {
            this.field4704 = arg0;
            this.method2127();
            this.field4660 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "()Lih;")
    public final class416 method2134() {
        return this.field4733 == null ? null : this.field4733.method2030((byte) -124);
    }

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "()Z")
    public final boolean method1790() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "()Z")
    public final boolean method1774() {
        if (!this.field4603.method350((byte) -119)) {
            if (!this.field4602.method2696(this.field4603)) {
                return false;
            }
            this.field4612.method392(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lqd;)V")
    public final void method1737(class260 arg0) {
        this.field4604.method2452(this, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "()V")
    public final void method1815() {
        if (this.field4607 != null) {
            try {
                this.field4602.method2693();
            } catch (Throwable var4) {
            }
            this.field4607 = null;
        }
        if (this.field4601 != null) {
            this.method2145();
            try {
                this.field4601.destroy();
            } catch (Throwable var3) {
            }
            this.field4601 = null;
        }
        if (this.field4617) {
            class236.method1488((byte) 81, true, true);
            this.field4617 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public final void method1798(int arg0) {
        this.method2172();
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)V")
    public final void method2135(int arg0, int arg1, int arg2) {
        this.field4607.glTexEnvi(8960, arg0 + 34184, arg1);
        this.field4607.glTexEnvi(8960, arg0 + 34200, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "()V")
    public final void method1779() {
        this.method2133(true);
        this.field4607.glClear(256);
    }

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "()V")
    private final void method2136() {
        this.method2146(-2);
        for (int var1 = this.field4697 - 1; var1 >= 0; var1--) {
            this.method2162(var1);
            this.method2165((class133) null);
            this.field4607.glTexEnvi(8960, 8704, 34160);
        }
        this.method2140(8448, 8448);
        this.method2161(2, 34168, 770);
        this.method2155();
        this.field4680 = 1;
        this.field4607.glEnable(3042);
        this.field4607.glBlendFunc(770, 771);
        this.field4707 = 1;
        this.field4607.glEnable(3008);
        this.field4607.glAlphaFunc(516, 0.0F);
        this.field4709 = true;
        this.field4607.glColorMask(true, true, true, true);
        this.field4637 = true;
        this.method2122(true);
        this.method2147(true);
        this.method2159(true);
        this.method2133(true);
        this.method2141();
        this.field4607.setSwapInterval(0);
        this.field4607.glShadeModel(7425);
        this.field4607.glClearDepth(1.0F);
        this.field4607.glDepthFunc(515);
        this.field4607.glPolygonMode(1028, 6914);
        this.field4607.glEnable(2884);
        this.field4607.glCullFace(1029);
        this.field4607.glMatrixMode(5888);
        this.field4607.glLoadIdentity();
        this.field4607.glColorMaterial(1028, 5634);
        this.field4607.glEnable(2903);
        float[] var2 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var3 = 0; var3 < 8; var3++) {
            int var4 = var3 + 16384;
            this.field4607.glLightfv(var4, 4608, var2, 0);
            this.field4607.glLightf(var4, 4615, 0.0F);
            this.field4607.glLightf(var4, 4616, 0.0F);
        }
        this.field4607.glEnable(16384);
        this.field4607.glEnable(16385);
        this.field4607.glFogf(2914, 0.95F);
        this.field4607.glFogi(2917, 9729);
        this.field4607.glHint(3156, 4353);
        this.field4713 = this.field4686 = -1;
        this.method1812();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V")
    public final void method1817(int arg0, int arg1, int arg2) {
        this.field4661 = true;
        this.field4724 = arg1;
        this.field4725 = arg2;
        this.method2113();
        this.method2164();
        this.field4600.method2596(false, 3, false, 126);
        this.field4600.method2594(arg0, true, true);
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(IIIIII)Lvm;")
    public final class407 method1818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return this.field4635 ? new class320(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public final void method1757(int arg0) {
        this.method2145();
    }

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "(I)V")
    public final synchronized void method2137(int arg0) {
        class23 var2 = new class23(arg0);
        this.field4629.method1301(50, var2);
    }

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "()V")
    public final void method1749() {
        try {
            this.field4601.swapBuffers();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "()Z")
    public final boolean method1746() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "()V")
    private final void method2138() {
        if (this.field4702 == 0.0F) {
            this.field4658[10] = this.field4706;
            this.field4658[14] = this.field4657;
        } else {
            float var1 = this.field4648 / (this.field4702 + this.field4648);
            float var2 = var1 * var1;
            float var3 = (1.0F - var1) * -this.field4657 * (1.0F - var1) / this.field4702;
            this.field4658[10] = this.field4706 + var3;
            this.field4658[14] = this.field4657 * var2;
        }
        this.field4700 = (this.field4658[14] - (float) this.field4692) / this.field4658[10];
        this.field4722 = (float) this.field4692 - this.field4702;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(II)V")
    public final synchronized void method2139(int arg0, int arg1) {
        class23 var3 = new class23(arg1);
        var3.field5363 = (long) arg0;
        this.field4627.method1301(50, var3);
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(II)V")
    public final void method2140(int arg0, int arg1) {
        if (this.field4654 != 0) {
            this.field4607.glTexEnvi(8960, 34161, arg0);
            this.field4607.glTexEnvi(8960, 34162, arg1);
            return;
        }
        boolean var3 = false;
        if (this.field4666 != arg0) {
            this.field4607.glTexEnvi(8960, 34161, arg0);
            this.field4666 = arg0;
            var3 = true;
        }
        if (this.field4639 != arg1) {
            this.field4607.glTexEnvi(8960, 34162, arg1);
            this.field4639 = arg1;
            var3 = true;
        }
        if (var3) {
            this.field4660 &= 0xFFFFFFE2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "()V")
    public final void method2141() {
        if (this.field4672 != 0) {
            this.field4672 = 0;
            this.field4660 &= 0xFFFFFFE0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[Lvb;)V")
    public final void method1745(int arg0, class107[] arg1) {
        int var3;
        for (var3 = 0; var3 < arg0; var3++) {
            class107 var4 = arg1[var3];
            int var5 = var3 + 16386;
            field4606[0] = (float) var4.field1583;
            field4606[1] = (float) var4.field1588;
            field4606[2] = (float) var4.field1591;
            field4606[3] = 1.0F;
            this.field4607.glLightfv(var5, 4611, field4606, 0);
            int var6 = var4.field1587;
            float var7 = var4.field1594 / 255.0F;
            field4606[0] = (float) (var6 >> 16 & 0xFF) * var7;
            field4606[1] = (float) (var6 >> 8 & 0xFF) * var7;
            field4606[2] = (float) (var6 & 0xFF) * var7;
            this.field4607.glLightfv(var5, 4609, field4606, 0);
            this.field4607.glLightf(var5, 4617, 1.0F / (float) (var4.field1584 * var4.field1584));
            this.field4607.glEnable(var5);
        }
        while (var3 < this.field4731) {
            this.field4607.glDisable(var3 + 16386);
            var3++;
        }
        this.field4731 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIIII)V")
    public final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2143();
        this.method2125(arg5);
        this.field4607.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4646) {
            this.field4607.glDisable(32925);
        }
        this.field4607.glBegin(2);
        this.field4607.glVertex2f(var7, var8);
        this.field4607.glVertex2f(var7, var10);
        this.field4607.glVertex2f(var9, var10);
        this.field4607.glVertex2f(var9, var8);
        this.field4607.glEnd();
        if (this.field4646) {
            this.field4607.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public final synchronized void method1726(int arg0) {
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4627.method1300((byte) -121)) {
            class23 var4 = (class23) this.field4627.method1314((byte) -124);
            field4610[var2++] = (int) var4.field5363;
            this.field4624 -= var4.field316;
            if (var2 == 1000) {
                this.field4607.glDeleteBuffersARB(var2, field4610, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4607.glDeleteBuffersARB(var2, field4610, 0);
            var2 = 0;
        }
        while (!this.field4628.method1300((byte) -70)) {
            class23 var5 = (class23) this.field4628.method1314((byte) -128);
            field4610[var2++] = (int) var5.field5363;
            this.field4619 -= var5.field316;
            if (var2 == 1000) {
                this.field4607.glDeleteTextures(var2, field4610, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4607.glDeleteTextures(var2, field4610, 0);
            var2 = 0;
        }
        while (!this.field4629.method1300((byte) 103)) {
            class23 var6 = (class23) this.field4629.method1314((byte) -121);
            field4610[var2++] = var6.field316;
            if (var2 == 1000) {
                this.field4607.glDeleteFramebuffersEXT(var2, field4610, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4607.glDeleteFramebuffersEXT(var2, field4610, 0);
            var2 = 0;
        }
        while (!this.field4630.method1300((byte) -62)) {
            class23 var7 = (class23) this.field4630.method1314((byte) -120);
            field4610[var2++] = (int) var7.field5363;
            this.field4623 -= var7.field316;
            if (var2 == 1000) {
                this.field4607.glDeleteRenderbuffersEXT(var2, field4610, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4607.glDeleteRenderbuffersEXT(var2, field4610, 0);
            var2 = 0;
        }
        while (!this.field4631.method1300((byte) -20)) {
            class23 var8 = (class23) this.field4631.method1314((byte) -122);
            field4610[var2++] = (int) var8.field5363;
            if (var2 == 1000) {
                this.field4607.glDeleteProgramsARB(var2, field4610, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            this.field4607.glDeleteProgramsARB(var2, field4610, 0);
            boolean var9 = false;
        }
        while (!this.field4626.method1300((byte) 107)) {
            class23 var10 = (class23) this.field4626.method1314((byte) 97);
            this.field4607.glDeleteLists((int) var10.field5363, var10.field316);
        }
        while (!this.field4632.method1300((byte) 124)) {
            class23 var11 = (class23) this.field4632.method1314((byte) 47);
            this.field4607.glDeleteObjectARB(var11.field316);
        }
        while (!this.field4626.method1300((byte) -23)) {
            class23 var12 = (class23) this.field4626.method1314((byte) 14);
            this.field4607.glDeleteLists((int) var12.field5363, var12.field316);
        }
        if (this.method1747() > 100663296 && class224.method1425(-26805) > this.field4682 + 60000L) {
            System.gc();
            this.field4682 = class224.method1425(-26805);
        }
        this.field4615 = var3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public final void method1766(int arg0, int arg1, int arg2) {
        if (!this.field4661) {
            throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
        }
        this.field4724 = arg1;
        this.field4725 = arg2;
        this.method2113();
        this.field4600.method2594(arg0, true, true);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIII)V")
    public final void method1735(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg2 > this.field4620) {
            arg2 = this.field4620;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field4616) {
            arg3 = this.field4616;
        }
        this.field4701 = arg0;
        this.field4723 = arg1;
        this.field4717 = arg2;
        this.field4729 = arg3;
        this.field4607.glEnable(3089);
        this.method2117();
        this.method2115();
    }

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "()I")
    private final int method2142() {
        int var1 = 0;
        this.field4633 = this.field4607.glGetString(7936);
        this.field4665 = this.field4607.glGetString(7937);
        String var2 = this.field4633.toLowerCase();
        if (var2.indexOf("microsoft") != -1) {
            var1 |= 0x1;
        }
        if (var2.indexOf("brian paul") != -1 || var2.indexOf("mesa") != -1) {
            var1 |= 0x1;
        }
        String var3 = this.field4607.glGetString(7938);
        String[] var4 = class65.method449((byte) -118, var3.replace('.', ' '), ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class160.method1062(false, var4[0]);
                int var6 = class160.method1062(false, var4[1]);
                this.field4642 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var1 |= 0x4;
            }
        } else {
            var1 |= 0x4;
        }
        if (this.field4642 < 12) {
            var1 |= 0x2;
        }
        if (!this.field4607.isExtensionAvailable("GL_ARB_multitexture")) {
            var1 |= 0x8;
        }
        if (!this.field4607.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var1 |= 0x20;
        }
        int[] var8 = new int[1];
        this.field4607.glGetIntegerv(34018, var8, 0);
        this.field4697 = var8[0];
        this.field4607.glGetIntegerv(34929, var8, 0);
        this.field4698 = var8[0];
        this.field4607.glGetIntegerv(34930, var8, 0);
        this.field4649 = var8[0];
        if (this.field4697 < 2 || this.field4698 < 2 || this.field4649 < 2) {
            var1 |= 0x10;
        }
        this.field4719 = class351.field4895 != null && class351.field4895.startsWith("mac");
        this.field4640 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        this.field4720 = this.field4607.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4646 = this.field4607.isExtensionAvailable("GL_ARB_multisample");
        this.field4643 = this.field4607.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4607.isExtensionAvailable("GL_ARB_fragment_program");
        this.field4607.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4664 = this.field4607.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4694 = this.field4607.isExtensionAvailable("GL_EXT_texture3D");
        this.field4693 = this.field4607.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field4635 = this.field4607.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4708 = this.field4607.isExtensionAvailable("GL_ARB_texture_float");
        this.field4730 = false;
        this.field4705 = this.field4607.isExtensionAvailable("GL_EXT_framebuffer_object");
        return var1 == 0 ? 0 : var1;
    }

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "()V")
    private final void method2143() {
        if (this.field4660 == 1) {
            return;
        }
        this.method2121();
        this.method2122(false);
        this.method2147(false);
        this.method2159(false);
        this.method2133(false);
        this.method2165((class133) null);
        this.method2146(-2);
        this.method2129(0);
        this.field4660 = 1;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "()Z")
    public final boolean method1725() {
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
    public final void method1789(boolean arg0) {
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(Z)V")
    public final void method2144(boolean arg0) {
        if (this.field4689 != arg0) {
            this.field4689 = arg0;
            this.method2131();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
    public final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4607.glLineWidth((float) arg5);
        this.method1752(arg0, arg1, arg2, arg3, arg4, arg6);
        this.field4607.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIII)[I")
    public final int[] method1744(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; var6++) {
            this.field4607.glReadPixels(arg0, this.field4616 - arg1 - var6, arg2, 1, 32993, this.field4655, IntBuffer.wrap(var5, arg2 * var6, arg2));
        }
        return var5;
    }

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "()V")
    private final void method2145() {
        try {
            this.field4601.releaseContext();
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;")
    public final class407 method1808(class407 arg0, class407 arg1, float arg2, class407 arg3) {
        if (arg0 != null && arg1 != null && this.field4635 && this.field4705) {
            class384 var5 = null;
            class372 var6 = (class372) arg0;
            class372 var7 = (class372) arg1;
            class416 var8 = var6.method2030((byte) -67);
            class416 var9 = var7.method2030((byte) -46);
            if (var8 != null && var9 != null) {
                int var10 = var8.field6021 > var9.field6021 ? var8.field6021 : var9.field6021;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class384) {
                    class384 var11 = (class384) arg3;
                    if (var11.method2515(-15853) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class384(this, var10);
                }
                var5.method2514(arg2, var8, -23862, var9);
                return var5;
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "(I)V")
    public final void method2146(int arg0) {
        this.method2152(arg0, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lap;IIII)Lhc;")
    public final class75 method1736(class279 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class134(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "()I")
    public final int method1738() {
        int var1 = this.field4736;
        this.field4736 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lhc;Lqd;Lci;[Lbd;I)V")
    public final void method1803(class75[] arg0, class260 arg1, class261 arg2, class38[] arg3, int arg4) {
        this.method1770(arg0, arg2, arg3, arg4);
        this.method1737(arg1);
    }

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "()Z")
    public final boolean method1755() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "()V")
    public final void method1182() {
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(Z)V")
    public final void method2147(boolean arg0) {
        if (this.field4677 != arg0) {
            this.field4677 = arg0;
            this.method2131();
            this.field4660 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "()V")
    public final void method1812() {
        this.field4701 = 0;
        this.field4723 = 0;
        this.field4717 = this.field4620;
        this.field4729 = this.field4616;
        this.field4607.glDisable(3089);
        this.method2117();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IFFFFF)V")
    public final void method1814(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        boolean var7 = this.field4713 != arg0;
        if (var7 || this.field4679 != arg1 || this.field4669 != arg2) {
            this.field4713 = arg0;
            this.field4679 = arg1;
            this.field4669 = arg2;
            if (var7) {
                this.field4685 = (float) (this.field4713 & 0xFF0000) / 1.671168E7F;
                this.field4676 = (float) (this.field4713 & 0xFFFF) / 65535.0F;
                this.field4670 = (float) (this.field4713 & 0xFF) / 255.0F;
                this.method2169();
            }
            this.method2153();
        }
        if (this.field4647[0] == arg3 && this.field4647[1] == arg4 && this.field4647[2] == arg5) {
            return;
        }
        this.field4647[0] = arg3;
        this.field4647[1] = arg4;
        this.field4647[2] = arg5;
        this.field4652[0] = -arg3;
        this.field4652[1] = -arg4;
        this.field4652[2] = -arg5;
        float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
        this.field4714[0] = arg3 * var8;
        this.field4714[1] = arg4 * var8;
        this.field4714[2] = arg5 * var8;
        this.field4716[0] = -this.field4714[0];
        this.field4716[1] = -this.field4714[1];
        this.field4716[2] = -this.field4714[2];
        this.method2103();
        this.field4641 = (int) (arg3 * 256.0F / arg4);
        this.field4703 = (int) (arg5 * 256.0F / arg4);
    }

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "()Z")
    public final boolean method1806() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "()V")
    public final void method1804() {
        if (this.field4603.method350((byte) -90)) {
            this.field4602.method2694(this.field4603);
            this.field4612.method392(true);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "()Z")
    public final boolean method1722() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lsg;)V")
    public final void method2148(class226 arg0) {
        if (this.field4691 != arg0 && this.field4720) {
            this.field4607.glBindBufferARB(34962, arg0.method641());
            this.field4691 = arg0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "()V")
    public final void method2149() {
        this.field4607.glPopMatrix();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
    public final void method1765(int arg0, int arg1) {
        if (this.field4662 == arg0 && this.field4692 == arg1) {
            return;
        }
        this.field4662 = arg0;
        this.field4692 = arg1;
        this.method2168();
        this.method2113();
        if (this.field4672 == 3) {
            this.method2112();
        } else if (this.field4672 == 2) {
            this.method2132();
        }
    }

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "()V")
    public final void method2150() {
        if (this.field4672 != 2) {
            this.field4672 = 2;
            this.method2132();
            this.method2173();
            this.field4660 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(II)V")
    public final synchronized void method2151(int arg0, int arg1) {
        class23 var3 = new class23(arg1);
        var3.field5363 = (long) arg0;
        this.field4628.method1301(50, var3);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
    public final void method2152(int arg0, boolean arg1) {
        this.method2111(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(IIII)V")
    public final void method1763(int arg0, int arg1, int arg2, int arg3) {
        this.field4684 = arg0;
        this.field4688 = arg1;
        this.field4727 = arg2;
        this.field4728 = arg3;
        this.method2168();
        this.method2117();
        if (this.field4672 == 3) {
            this.method2112();
        } else if (this.field4672 == 2) {
            this.method2132();
        }
    }

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "()V")
    private final void method2153() {
        field4609[0] = this.field4685 * this.field4679;
        field4609[1] = this.field4679 * this.field4676;
        field4609[2] = this.field4679 * this.field4670;
        field4609[3] = 1.0F;
        this.field4607.glLightfv(16384, 4609, field4609, 0);
        field4609[0] = -this.field4669 * this.field4685;
        field4609[1] = -this.field4669 * this.field4676;
        field4609[2] = -this.field4669 * this.field4670;
        field4609[3] = 1.0F;
        this.field4607.glLightfv(16385, 4609, field4609, 0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(FF)V")
    public final void method2154(float arg0, float arg1) {
        this.field4674 = arg0;
        this.field4645 = arg1;
        if (!this.field4661) {
            this.method2113();
        }
    }

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "()V")
    private final void method2155() {
        if (this.field4644) {
            this.field4607.glMatrixMode(5890);
            this.field4607.glLoadIdentity();
            this.field4607.glMatrixMode(5888);
            this.field4644 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "kb", descriptor = "()V")
    public final void method2156() {
        if (this.field4660 == 8) {
            return;
        }
        this.method2150();
        this.method2122(true);
        this.method2159(true);
        this.method2133(true);
        this.method2125(1);
        this.method2129(1);
        this.field4660 = 8;
    }

    @OriginalMember(owner = "client!hj", name = "lb", descriptor = "()V")
    private final void method2157() {
        if (this.field4672 != 3) {
            this.field4672 = 3;
            this.method2112();
            this.method2173();
            this.field4660 &= 0xFFFFFFF8;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lln;Lln;Lln;Lln;)V")
    public final void method2158(class212 arg0, class212 arg1, class212 arg2, class212 arg3) {
        if (arg0 == null) {
            this.field4607.glDisableClientState(32884);
        } else {
            this.field4607.glEnableClientState(32884);
            arg0.method1368(10286);
        }
        if (arg1 == null) {
            this.field4607.glDisableClientState(32885);
        } else {
            this.field4607.glEnableClientState(32885);
            arg1.method1367(-20221);
        }
        if (arg2 == null) {
            this.field4607.glDisableClientState(32886);
        } else {
            this.field4607.glEnableClientState(32886);
            arg2.method1370(-84);
        }
        if (arg3 == null) {
            this.field4607.glDisableClientState(32888);
        } else {
            this.field4607.glEnableClientState(32888);
            arg3.method1369(125);
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V")
    public final void method1822(boolean arg0) {
        this.field4634 = arg0;
        this.method2127();
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "()Z")
    public final boolean method1723() {
        return this.field4603.method707();
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(Z)V")
    public final void method2159(boolean arg0) {
        if (this.field4690 == arg0) {
            return;
        }
        if (arg0) {
            this.field4607.glEnable(2929);
        } else {
            this.field4607.glDisable(2929);
        }
        this.field4690 = arg0;
        this.field4660 &= 0xFFFFFFE0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loc;III)V")
    public final void method2160(class112 arg0, int arg1, int arg2, int arg3) {
        this.method2167(arg0);
        arg0.method744(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "()I")
    public final int method1825() {
        return this.field4662;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFF)V")
    public final void method1733(float arg0, float arg1, float arg2) {
        class101.field1530 = arg0;
        class101.field1533 = arg1;
        class101.field1523 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(III)V")
    public final void method2161(int arg0, int arg1, int arg2) {
        this.field4607.glTexEnvi(8960, arg0 + 34176, arg1);
        this.field4607.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "(I)V")
    public final void method2162(int arg0) {
        if (this.field4654 != arg0) {
            this.field4607.glActiveTexture(arg0 + 33984);
            this.field4654 = arg0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lhc;Lci;[Lbd;I)V")
    public final void method1770(class75[] arg0, class261 arg1, class38[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            if (arg0[var5] != null) {
                arg0[var5].method514(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(IIII)V")
    public final void method1776(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4701 < arg0) {
            this.field4701 = arg0;
        }
        if (this.field4717 > arg2) {
            this.field4717 = arg2;
        }
        if (this.field4723 < arg1) {
            this.field4723 = arg1;
        }
        if (this.field4729 > arg3) {
            this.field4729 = arg3;
        }
        this.field4607.glEnable(3089);
        this.method2117();
        this.method2115();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        float var10;
        float var11;
        if (this.field4695 == null || this.field4695.field2701 < arg2 || this.field4695.field2699 < arg3) {
            this.field4695 = class205.method1343(this, false, 6406, arg3, arg6, 1673, 6406, arg2);
            this.field4695.method1295(false, false);
            var10 = this.field4695.field2777;
            var11 = this.field4695.field2776;
        } else {
            this.field4695.method1297(0, 0, arg2, arg3, arg6, 6406, 0, 0, false);
            var10 = (float) arg3 * this.field4695.field2777 / (float) this.field4695.field2699;
            var11 = (float) arg2 * this.field4695.field2776 / (float) this.field4695.field2701;
        }
        this.method2118();
        this.method2165(this.field4695);
        this.method2125(arg8);
        this.field4607.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2166(arg5);
        this.method2140(34165, 34165);
        this.method2161(0, 34166, 768);
        this.method2161(2, 5890, 770);
        this.method2135(0, 34166, 770);
        this.method2135(2, 5890, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        this.field4607.glBegin(7);
        this.field4607.glTexCoord2f(0.0F, 0.0F);
        this.field4607.glVertex2f(var12, var13);
        this.field4607.glTexCoord2f(0.0F, var11);
        this.field4607.glVertex2f(var12, var15);
        this.field4607.glTexCoord2f(var10, var11);
        this.field4607.glVertex2f(var14, var15);
        this.field4607.glTexCoord2f(var10, 0.0F);
        this.field4607.glVertex2f(var14, var13);
        this.field4607.glEnd();
        this.method2161(0, 5890, 768);
        this.method2161(2, 34166, 770);
        this.method2135(0, 5890, 770);
        this.method2135(2, 34166, 770);
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(II)V")
    public final synchronized void method2163(int arg0, int arg1) {
        class23 var3 = new class23(arg1);
        var3.field5363 = (long) arg0;
        this.field4629.method1301(50, var3);
    }

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "()Z")
    public final boolean method1778() {
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "mb", descriptor = "()V")
    private final void method2164() {
        if (this.field4675 && this.field4661 | this.field4726 >= 0) {
            this.field4607.glEnable(2912);
        } else {
            this.field4607.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lnj;)V")
    public final void method2165(class133 arg0) {
        class133 var2 = this.field4663[this.field4654];
        if (arg0 != var2) {
            if (arg0 == null) {
                this.field4607.glDisable(var2.field1839);
            } else {
                if (var2 == null) {
                    this.field4607.glEnable(arg0.field1839);
                } else if (arg0.field1839 != var2.field1839) {
                    this.field4607.glDisable(var2.field1839);
                    this.field4607.glEnable(arg0.field1839);
                }
                this.field4607.glBindTexture(arg0.field1839, arg0.method905());
            }
            this.field4663[this.field4654] = arg0;
        }
        this.field4660 &= 0xFFFFFFFE;
    }

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "(I)V")
    public final void method2166(int arg0) {
        field4609[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
        field4609[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
        field4609[2] = (float) (arg0 & 0xFF) / 255.0F;
        field4609[3] = (float) (arg0 >>> 24) / 255.0F;
        this.field4607.glTexEnvfv(8960, 8705, field4609, 0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Loc;)V")
    public final void method2167(class112 arg0) {
        if (this.field4667 != arg0 && this.field4720) {
            this.field4607.glBindBufferARB(34963, arg0.method641());
            this.field4667 = arg0;
        }
    }

    @OriginalMember(owner = "client!hj", name = "nb", descriptor = "()V")
    private final void method2168() {
        float[] var1 = this.field4658;
        float var2 = (float) (-this.field4684 * this.field4662) / (float) this.field4727;
        float var3 = (float) ((this.field4620 - this.field4684) * this.field4662) / (float) this.field4727;
        float var4 = (float) (this.field4688 * this.field4662) / (float) this.field4728;
        float var5 = (float) ((this.field4688 - this.field4616) * this.field4662) / (float) this.field4728;
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
            float var6 = (float) this.field4662 * 2.0F;
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
            var1[10] = this.field4706 = (float) (-(this.field4692 + this.field4662)) / (float) (this.field4692 - this.field4662);
            var1[11] = -1.0F;
            var1[12] = 0.0F;
            var1[13] = 0.0F;
            var1[14] = this.field4657 = -((float) this.field4692 * var6) / (float) (this.field4692 - this.field4662);
            var1[15] = 0.0F;
        }
        this.method2138();
    }

    @OriginalMember(owner = "client!hj", name = "ob", descriptor = "()V")
    private final void method2169() {
        field4609[0] = this.field4721 * this.field4685;
        field4609[1] = this.field4721 * this.field4676;
        field4609[2] = this.field4721 * this.field4670;
        field4609[3] = 1.0F;
        this.field4607.glLightModelfv(2899, field4609, 0);
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(IIIII)V")
    public final void method1824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1799(Rectangle[] arg0, int arg1) {
        this.method1749();
    }

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "()I")
    public final int method1792() {
        return this.field4692;
    }

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "()Z")
    public final boolean method1740() {
        return !this.field4719;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lci;)V")
    public final void method1724(class261 arg0) {
        this.field4656 = (class131) arg0;
        this.field4636.method885(this.field4656, 94);
        if (this.field4672 != 1) {
            this.method2173();
        }
    }

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "()Z")
    public final boolean method1753() {
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "()I")
    public final int method1747() {
        return this.field4624 + this.field4619 + this.field4623;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lvm;)V")
    public final void method1756(class407 arg0) {
        this.field4733 = (class372) arg0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lfp;)V")
    public final void method2170(class177 arg0) {
        if (this.field4618 < 0 || this.field4622[this.field4618] != arg0) {
            throw new RuntimeException();
        }
        this.field4622[this.field4618--] = null;
        arg0.method1182();
        if (this.field4618 >= 0) {
            this.field4614 = this.field4622[this.field4618];
            this.field4614.method1180();
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public final void method1764(boolean arg0) {
    }

    @OriginalMember(owner = "client!hj", name = "pb", descriptor = "()Lfp;")
    public final class177 method2171() {
        return this.field4614;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public final void method1180() {
    }

    @OriginalMember(owner = "client!hj", name = "qb", descriptor = "()V")
    private final void method2172() {
        int var1 = 0;
        while (true) {
            try {
                if (this.field4601.makeCurrent()) {
                    return;
                }
            } catch (Exception var3) {
            }
            if (var1++ > 5) {
                throw new RuntimeException("");
            }
            class4.method28(1000L, -124);
        }
    }

    @OriginalMember(owner = "client!hj", name = "rb", descriptor = "()V")
    private final void method2173() {
        this.field4607.glLoadIdentity();
        this.field4607.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        this.field4607.glMultMatrixf(this.field4656.method895(0), 0);
        this.method2103();
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)V")
    public final void method1787(int arg0, int arg1) {
        if (this.field4686 == arg0 && this.field4726 == arg1) {
            return;
        }
        this.field4686 = arg0;
        this.field4726 = arg1;
        if (!this.field4661) {
            this.method2113();
            this.method2164();
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lsr;IILkq;)V")
    public class338(Canvas arg0, class136 arg1, int arg2, int arg3, class351 arg4) {
        this.field4605 = arg0;
        this.field4611 = arg1;
        this.field3847 = arg2;
        int var6 = 0;
        while (!this.field4605.isShowing()) {
            if (var6++ > 5) {
                throw new RuntimeException("");
            }
            class4.method28(1000L, 108);
        }
        this.field4605.setIgnoreRepaint(true);
        try {
            if (field4608 == null || !field4608) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    field4608 = Boolean.TRUE;
                } else {
                    class295 var7 = arg4.method2258(0, this.getClass());
                    while (var7.field4068 == 0) {
                        class4.method28(100L, -98);
                    }
                    if (var7.field4068 == 1) {
                        field4608 = Boolean.TRUE;
                    }
                }
            }
            if (field4608 == null || !field4608) {
                throw new RuntimeException("");
            }
            this.field4601 = new context();
            if (!this.field4601.choosePixelFormat(this.field4605, arg3, 0)) {
                throw new RuntimeException("");
            } else if (this.field4601.createContext()) {
                this.method2172();
                this.field4607 = this.field4601.getGL();
                int var8 = this.method2142();
                if (var8 != 0) {
                    throw new RuntimeException("");
                }
                this.field4655 = this.field4640 ? 33639 : 5121;
                String var9 = this.field4633.toLowerCase();
                String var10 = this.field4665.toLowerCase();
                if (var10.indexOf("radeon") != -1) {
                    int var11 = 0;
                    boolean var12 = false;
                    boolean var13 = false;
                    String[] var14 = class65.method449((byte) -113, var10.replace('/', ' '), ' ');
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        String var16 = var14[var15];
                        try {
                            if (var16.length() > 0) {
                                if (var16.charAt(0) == 'x' && var16.length() >= 3 && class28.method224(61, var16.substring(1, 3))) {
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
                                    if (var16.length() >= 4 && class28.method224(-128, var16.substring(0, 4))) {
                                        var11 = class160.method1062(false, var16.substring(0, 4));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception var25) {
                        }
                    }
                    if (!var13 && !var12) {
                        if (var11 >= 7000 && var11 <= 7999) {
                            this.field4720 = false;
                        }
                        if (var11 >= 7000 && var11 <= 9250) {
                            this.field4694 = false;
                        }
                    }
                    if (!var12 || var11 < 4000) {
                        this.field4708 = false;
                    }
                    this.field4693 &= this.field4607.isExtensionAvailable("GL_ARB_half_float_pixel");
                    this.field4651 = this.field4720;
                }
                if (var9.contains("intel")) {
                    this.field4705 = false;
                }
                if (this.field4720) {
                    try {
                        int[] var18 = new int[1];
                        this.field4607.glGenBuffersARB(1, var18, 0);
                    } catch (Throwable var23) {
                        throw new RuntimeException("", var23);
                    }
                }
                this.method2128(this);
                this.method1761();
                this.method2106();
                new class422(this);
                this.field4612 = new class59(this, this.field4611);
                class396.method2566(true, true, -16653);
                this.field4617 = true;
                this.field4600 = new class402(this);
                this.field4602 = new class428(this);
                this.field4603 = new class101(this);
                this.method2136();
                this.field4607.glClear(16640);
                int var20 = 0;
                while (true) {
                    try {
                        this.field4601.swapBuffers();
                        break;
                    } catch (Exception var24) {
                        if (var20++ > 5) {
                            throw new RuntimeException("");
                        }
                        class4.method28(100L, -99);
                    }
                }
                this.field4607.glClear(16384);
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var26) {
            var26.printStackTrace();
            this.method1815();
            throw new RuntimeException("OpenGL toolkit initialisation failed", var26);
        }
    }
}
