import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class325 extends class165 {

    @OriginalMember(owner = "client!nq", name = "xb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4744 = new Hashtable();

    @OriginalMember(owner = "client!nq", name = "me", descriptor = "I")
    public int field4889 = 128;

    @OriginalMember(owner = "client!nq", name = "je", descriptor = "Lch;")
    private class328 field4886 = new class328();

    @OriginalMember(owner = "client!nq", name = "oe", descriptor = "Lgu;")
    private class416 field4891 = new class416();

    @OriginalMember(owner = "client!nq", name = "pe", descriptor = "Lgu;")
    public class416 field4892 = new class416();

    @OriginalMember(owner = "client!nq", name = "qe", descriptor = "Z")
    private boolean field4893 = false;

    @OriginalMember(owner = "client!nq", name = "ue", descriptor = "I")
    public int field4897 = 8;

    @OriginalMember(owner = "client!nq", name = "se", descriptor = "I")
    public int field4895 = 3;

    @OriginalMember(owner = "client!nq", name = "re", descriptor = "Lps;")
    private class63 field4894 = new class63();

    @OriginalMember(owner = "client!nq", name = "ze", descriptor = "[Lbf;")
    private class379[] field4902 = new class379[4];

    @OriginalMember(owner = "client!nq", name = "Ae", descriptor = "[Lbf;")
    private class379[] field4903 = new class379[4];

    @OriginalMember(owner = "client!nq", name = "Be", descriptor = "I")
    private int field4904 = -1;

    @OriginalMember(owner = "client!nq", name = "ye", descriptor = "I")
    private int field4901 = -1;

    @OriginalMember(owner = "client!nq", name = "xe", descriptor = "I")
    private int field4900 = -1;

    @OriginalMember(owner = "client!nq", name = "De", descriptor = "[Lbf;")
    private class379[] field4906 = new class379[4];

    @OriginalMember(owner = "client!nq", name = "Ie", descriptor = "Lps;")
    private class63 field4911;

    @OriginalMember(owner = "client!nq", name = "Je", descriptor = "Lps;")
    private class63 field4912;

    @OriginalMember(owner = "client!nq", name = "Ke", descriptor = "Lps;")
    private class63 field4913;

    @OriginalMember(owner = "client!nq", name = "Le", descriptor = "Lps;")
    private class63 field4914;

    @OriginalMember(owner = "client!nq", name = "Me", descriptor = "Lps;")
    private class63 field4915;

    @OriginalMember(owner = "client!nq", name = "Ne", descriptor = "Lps;")
    private class63 field4916;

    @OriginalMember(owner = "client!nq", name = "Oe", descriptor = "Lps;")
    private class63 field4917;

    @OriginalMember(owner = "client!nq", name = "bf", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!nq", name = "Pe", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!nq", name = "kf", descriptor = "F")
    public float field4938;

    @OriginalMember(owner = "client!nq", name = "Ze", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!nq", name = "Ve", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!nq", name = "Ef", descriptor = "I")
    public int field4958;

    @OriginalMember(owner = "client!nq", name = "eg", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!nq", name = "xf", descriptor = "F")
    public float field4951;

    @OriginalMember(owner = "client!nq", name = "bg", descriptor = "F")
    public float field4981;

    @OriginalMember(owner = "client!nq", name = "vf", descriptor = "F")
    private float field4949;

    @OriginalMember(owner = "client!nq", name = "Gf", descriptor = "I")
    public int field4960;

    @OriginalMember(owner = "client!nq", name = "mg", descriptor = "I")
    private int field4992;

    @OriginalMember(owner = "client!nq", name = "Yf", descriptor = "F")
    public float field4978;

    @OriginalMember(owner = "client!nq", name = "wg", descriptor = "F")
    private float field5002;

    @OriginalMember(owner = "client!nq", name = "Mf", descriptor = "[F")
    private float[] field4966;

    @OriginalMember(owner = "client!nq", name = "qf", descriptor = "I")
    private int field4944;

    @OriginalMember(owner = "client!nq", name = "ug", descriptor = "F")
    public float field5000;

    @OriginalMember(owner = "client!nq", name = "ef", descriptor = "[F")
    private float[] field4933;

    @OriginalMember(owner = "client!nq", name = "Xf", descriptor = "Z")
    private boolean field4977;

    @OriginalMember(owner = "client!nq", name = "yg", descriptor = "F")
    public float field5004;

    @OriginalMember(owner = "client!nq", name = "Ff", descriptor = "[F")
    public float[] field4959;

    @OriginalMember(owner = "client!nq", name = "Ig", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!nq", name = "ng", descriptor = "I")
    private int field4993;

    @OriginalMember(owner = "client!nq", name = "Pf", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!nq", name = "Sg", descriptor = "I")
    private int field5024;

    @OriginalMember(owner = "client!nq", name = "jf", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!nq", name = "Eg", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!nq", name = "Yg", descriptor = "F")
    private float field5030;

    @OriginalMember(owner = "client!nq", name = "Pg", descriptor = "I")
    public int field5021;

    @OriginalMember(owner = "client!nq", name = "sf", descriptor = "[F")
    private float[] field4946;

    @OriginalMember(owner = "client!nq", name = "mf", descriptor = "[Lbe;")
    private class28[] field4940;

    @OriginalMember(owner = "client!nq", name = "Qe", descriptor = "I")
    private int field4919;

    @OriginalMember(owner = "client!nq", name = "Hf", descriptor = "F")
    public float field4961;

    @OriginalMember(owner = "client!nq", name = "wf", descriptor = "[F")
    private float[] field4950;

    @OriginalMember(owner = "client!nq", name = "Wg", descriptor = "I")
    private int field5028;

    @OriginalMember(owner = "client!nq", name = "Gg", descriptor = "F")
    public float field5012;

    @OriginalMember(owner = "client!nq", name = "Kg", descriptor = "I")
    public int field5016;

    @OriginalMember(owner = "client!nq", name = "Bf", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!nq", name = "ah", descriptor = "I")
    private int field5032;

    @OriginalMember(owner = "client!nq", name = "pf", descriptor = "Lns;")
    public class283 field4943;

    @OriginalMember(owner = "client!nq", name = "hh", descriptor = "[I")
    public int[] field5039;

    @OriginalMember(owner = "client!nq", name = "fh", descriptor = "[B")
    public byte[] field5037;

    @OriginalMember(owner = "client!nq", name = "ih", descriptor = "[I")
    public int[] field5040;

    @OriginalMember(owner = "client!nq", name = "jh", descriptor = "[I")
    public int[] field5041;

    @OriginalMember(owner = "client!nq", name = "fe", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!nq", name = "dd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4828;

    @OriginalMember(owner = "client!nq", name = "Ic", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4807;

    @OriginalMember(owner = "client!nq", name = "ee", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4881;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "J")
    private long field4715;

    @OriginalMember(owner = "client!nq", name = "qc", descriptor = "J")
    private long field4789;

    @OriginalMember(owner = "client!nq", name = "Uf", descriptor = "Z")
    public boolean field4974;

    @OriginalMember(owner = "client!nq", name = "We", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!nq", name = "lg", descriptor = "Ljava/lang/String;")
    private String field4991;

    @OriginalMember(owner = "client!nq", name = "Kf", descriptor = "Z")
    public boolean field4964;

    @OriginalMember(owner = "client!nq", name = "yf", descriptor = "Z")
    private boolean field4952;

    @OriginalMember(owner = "client!nq", name = "rg", descriptor = "Z")
    public boolean field4997;

    @OriginalMember(owner = "client!nq", name = "Vg", descriptor = "Z")
    public boolean field5027;

    @OriginalMember(owner = "client!nq", name = "Ug", descriptor = "Z")
    private boolean field5026;

    @OriginalMember(owner = "client!nq", name = "tf", descriptor = "Z")
    public boolean field4947;

    @OriginalMember(owner = "client!nq", name = "dg", descriptor = "Ljava/lang/String;")
    private String field4983;

    @OriginalMember(owner = "client!nq", name = "lf", descriptor = "Z")
    public boolean field4939;

    @OriginalMember(owner = "client!nq", name = "qg", descriptor = "Z")
    private boolean field4996;

    @OriginalMember(owner = "client!nq", name = "he", descriptor = "Ljr;")
    public class73 field4884;

    @OriginalMember(owner = "client!nq", name = "ve", descriptor = "Lra;")
    public class71 field4898;

    @OriginalMember(owner = "client!nq", name = "le", descriptor = "Lmc;")
    private class89 field4888;

    @OriginalMember(owner = "client!nq", name = "ie", descriptor = "Lrc;")
    private class381 field4885;

    @OriginalMember(owner = "client!nq", name = "ne", descriptor = "Lhf;")
    private class276 field4890;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "[I")
    public static int[] field4711 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nq", name = "Te", descriptor = "F")
    public float field4922;

    @OriginalMember(owner = "client!nq", name = "zf", descriptor = "F")
    public float field4953;

    @OriginalMember(owner = "client!nq", name = "Of", descriptor = "F")
    public float field4968;

    @OriginalMember(owner = "client!nq", name = "Zf", descriptor = "F")
    public float field4979;

    @OriginalMember(owner = "client!nq", name = "hg", descriptor = "F")
    public float field4987;

    @OriginalMember(owner = "client!nq", name = "sg", descriptor = "F")
    public float field4998;

    @OriginalMember(owner = "client!nq", name = "Ag", descriptor = "F")
    public float field5006;

    @OriginalMember(owner = "client!nq", name = "Ng", descriptor = "F")
    private float field5019;

    @OriginalMember(owner = "client!nq", name = "Xg", descriptor = "F")
    private float field5029;

    @OriginalMember(owner = "client!nq", name = "Zg", descriptor = "F")
    private float field5031;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!nq", name = "db", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!nq", name = "eb", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!nq", name = "fb", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!nq", name = "gb", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!nq", name = "hb", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!nq", name = "ib", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!nq", name = "jb", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!nq", name = "kb", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!nq", name = "lb", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!nq", name = "mb", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!nq", name = "nb", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!nq", name = "pb", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!nq", name = "qb", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!nq", name = "rb", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!nq", name = "sb", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!nq", name = "tb", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!nq", name = "ub", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!nq", name = "vb", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!nq", name = "wb", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!nq", name = "yb", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!nq", name = "zb", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!nq", name = "Ab", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!nq", name = "Bb", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!nq", name = "Cb", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!nq", name = "Db", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!nq", name = "Eb", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!nq", name = "Fb", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!nq", name = "Gb", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!nq", name = "Hb", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!nq", name = "Ib", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!nq", name = "Jb", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!nq", name = "Kb", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!nq", name = "Lb", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!nq", name = "Mb", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!nq", name = "Nb", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!nq", name = "Ob", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!nq", name = "Pb", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!nq", name = "Qb", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!nq", name = "Rb", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!nq", name = "Sb", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!nq", name = "Tb", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!nq", name = "Ub", descriptor = "I")
    private int field4767;

    @OriginalMember(owner = "client!nq", name = "Vb", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!nq", name = "Wb", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!nq", name = "Xb", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!nq", name = "Yb", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!nq", name = "Zb", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!nq", name = "ac", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!nq", name = "bc", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!nq", name = "cc", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!nq", name = "dc", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!nq", name = "ec", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!nq", name = "fc", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!nq", name = "gc", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!nq", name = "hc", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!nq", name = "ic", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nq", name = "jc", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!nq", name = "kc", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!nq", name = "lc", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!nq", name = "mc", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!nq", name = "nc", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!nq", name = "oc", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!nq", name = "pc", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!nq", name = "rc", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!nq", name = "sc", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!nq", name = "tc", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!nq", name = "uc", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!nq", name = "vc", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!nq", name = "wc", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!nq", name = "xc", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!nq", name = "yc", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!nq", name = "zc", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!nq", name = "Ac", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!nq", name = "Bc", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!nq", name = "Cc", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!nq", name = "Dc", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!nq", name = "Ec", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!nq", name = "Fc", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!nq", name = "Gc", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!nq", name = "Hc", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!nq", name = "Jc", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!nq", name = "Kc", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!nq", name = "Lc", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!nq", name = "Mc", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!nq", name = "Nc", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!nq", name = "Oc", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!nq", name = "Pc", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!nq", name = "Qc", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!nq", name = "Rc", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!nq", name = "Sc", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!nq", name = "Tc", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!nq", name = "Uc", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!nq", name = "Vc", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!nq", name = "Wc", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!nq", name = "Xc", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!nq", name = "Yc", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!nq", name = "Zc", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!nq", name = "ad", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!nq", name = "bd", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!nq", name = "cd", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!nq", name = "ed", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!nq", name = "fd", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!nq", name = "gd", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!nq", name = "hd", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!nq", name = "id", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!nq", name = "jd", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!nq", name = "kd", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nq", name = "ld", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!nq", name = "md", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!nq", name = "nd", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!nq", name = "od", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!nq", name = "pd", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!nq", name = "qd", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!nq", name = "rd", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!nq", name = "sd", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!nq", name = "td", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!nq", name = "ud", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!nq", name = "vd", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!nq", name = "wd", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!nq", name = "xd", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!nq", name = "yd", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!nq", name = "zd", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!nq", name = "Ad", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!nq", name = "Bd", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!nq", name = "Cd", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!nq", name = "Dd", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!nq", name = "Ed", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!nq", name = "Fd", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!nq", name = "Gd", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!nq", name = "Hd", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!nq", name = "Id", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!nq", name = "Jd", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!nq", name = "Kd", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!nq", name = "Ld", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!nq", name = "Md", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!nq", name = "Nd", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!nq", name = "Od", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!nq", name = "Pd", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!nq", name = "Qd", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!nq", name = "Rd", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!nq", name = "Sd", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!nq", name = "Td", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!nq", name = "Ud", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!nq", name = "Vd", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!nq", name = "Wd", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!nq", name = "Xd", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!nq", name = "Yd", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!nq", name = "Zd", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!nq", name = "ae", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!nq", name = "be", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!nq", name = "ce", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!nq", name = "de", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!nq", name = "ge", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!nq", name = "ke", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!nq", name = "we", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!nq", name = "Fe", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!nq", name = "Ge", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!nq", name = "He", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!nq", name = "ff", descriptor = "I")
    private int field4934;

    @OriginalMember(owner = "client!nq", name = "nf", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!nq", name = "Lf", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!nq", name = "Nf", descriptor = "I")
    public int field4967;

    @OriginalMember(owner = "client!nq", name = "Qf", descriptor = "I")
    private int field4970;

    @OriginalMember(owner = "client!nq", name = "Rf", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!nq", name = "Tf", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!nq", name = "kg", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!nq", name = "Cg", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!nq", name = "Lg", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!nq", name = "Og", descriptor = "I")
    private int field5020;

    @OriginalMember(owner = "client!nq", name = "Qg", descriptor = "I")
    private int field5022;

    @OriginalMember(owner = "client!nq", name = "Rg", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!nq", name = "bh", descriptor = "I")
    private int field5033;

    @OriginalMember(owner = "client!nq", name = "ch", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!nq", name = "eh", descriptor = "I")
    private int field5036;

    @OriginalMember(owner = "client!nq", name = "gh", descriptor = "I")
    private int field5038;

    @OriginalMember(owner = "client!nq", name = "df", descriptor = "J")
    private long field4932;

    @OriginalMember(owner = "client!nq", name = "Wf", descriptor = "Lvf;")
    private class105 field4976;

    @OriginalMember(owner = "client!nq", name = "hf", descriptor = "Lld;")
    private class116 field4936;

    @OriginalMember(owner = "client!nq", name = "uf", descriptor = "Lm;")
    public class129 field4948;

    @OriginalMember(owner = "client!nq", name = "Mg", descriptor = "Lm;")
    public class129 field5018;

    @OriginalMember(owner = "client!nq", name = "jg", descriptor = "Lvt;")
    private class201 field4989;

    @OriginalMember(owner = "client!nq", name = "Ye", descriptor = "Lrd;")
    public class226 field4927;

    @OriginalMember(owner = "client!nq", name = "of", descriptor = "Lrd;")
    public class226 field4942;

    @OriginalMember(owner = "client!nq", name = "Af", descriptor = "Lrd;")
    public class226 field4954;

    @OriginalMember(owner = "client!nq", name = "Cf", descriptor = "Lrd;")
    public class226 field4956;

    @OriginalMember(owner = "client!nq", name = "Df", descriptor = "Lrd;")
    public class226 field4957;

    @OriginalMember(owner = "client!nq", name = "Jf", descriptor = "Lrd;")
    public class226 field4963;

    @OriginalMember(owner = "client!nq", name = "Sf", descriptor = "Lrd;")
    public class226 field4972;

    @OriginalMember(owner = "client!nq", name = "fg", descriptor = "Lrd;")
    public class226 field4985;

    @OriginalMember(owner = "client!nq", name = "Dg", descriptor = "Lrd;")
    public class226 field5009;

    @OriginalMember(owner = "client!nq", name = "Jg", descriptor = "Lrd;")
    public class226 field5015;

    @OriginalMember(owner = "client!nq", name = "Xe", descriptor = "Lwv;")
    public class25 field4926;

    @OriginalMember(owner = "client!nq", name = "Ce", descriptor = "Lbf;")
    private class379 field4905;

    @OriginalMember(owner = "client!nq", name = "Ee", descriptor = "Lbf;")
    private class379 field4907;

    @OriginalMember(owner = "client!nq", name = "gf", descriptor = "Lgu;")
    public class416 field4935;

    @OriginalMember(owner = "client!nq", name = "gg", descriptor = "Lgu;")
    public class416 field4986;

    @OriginalMember(owner = "client!nq", name = "Hg", descriptor = "Lsk;")
    public class447 field5013;

    @OriginalMember(owner = "client!nq", name = "Se", descriptor = "Lms;")
    private class541 field4921;

    @OriginalMember(owner = "client!nq", name = "ig", descriptor = "Lms;")
    private class541 field4988;

    @OriginalMember(owner = "client!nq", name = "te", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4896;

    @OriginalMember(owner = "client!nq", name = "Re", descriptor = "Z")
    private boolean field4920;

    @OriginalMember(owner = "client!nq", name = "Ue", descriptor = "Z")
    public boolean field4923;

    @OriginalMember(owner = "client!nq", name = "af", descriptor = "Z")
    private boolean field4929;

    @OriginalMember(owner = "client!nq", name = "cf", descriptor = "Z")
    public boolean field4931;

    @OriginalMember(owner = "client!nq", name = "rf", descriptor = "Z")
    private boolean field4945;

    @OriginalMember(owner = "client!nq", name = "If", descriptor = "Z")
    private boolean field4962;

    @OriginalMember(owner = "client!nq", name = "ag", descriptor = "Z")
    private boolean field4980;

    @OriginalMember(owner = "client!nq", name = "cg", descriptor = "Z")
    public boolean field4982;

    @OriginalMember(owner = "client!nq", name = "og", descriptor = "Z")
    private boolean field4994;

    @OriginalMember(owner = "client!nq", name = "pg", descriptor = "Z")
    public boolean field4995;

    @OriginalMember(owner = "client!nq", name = "tg", descriptor = "Z")
    public boolean field4999;

    @OriginalMember(owner = "client!nq", name = "vg", descriptor = "Z")
    private boolean field5001;

    @OriginalMember(owner = "client!nq", name = "xg", descriptor = "Z")
    public boolean field5003;

    @OriginalMember(owner = "client!nq", name = "zg", descriptor = "Z")
    public boolean field5005;

    @OriginalMember(owner = "client!nq", name = "Bg", descriptor = "Z")
    private boolean field5007;

    @OriginalMember(owner = "client!nq", name = "Fg", descriptor = "Z")
    private boolean field5011;

    @OriginalMember(owner = "client!nq", name = "Tg", descriptor = "Z")
    public boolean field5025;

    @OriginalMember(owner = "client!nq", name = "dh", descriptor = "Z")
    private boolean field5035;

    @OriginalMember(owner = "client!nq", name = "ob", descriptor = "[Lgp;")
    public static class35[] field4735;

    @OriginalMember(owner = "client!nq", name = "Vf", descriptor = "[Llr;")
    private class538[] field4975;

    static {
        new class446("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "(IIII)[I", line = 5)
    public final int[] method813(int arg0, int arg1, int arg2, int arg3) {
        ++field4704;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field4811 + -var6, arg2, 1, 32993, this.field4925, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V", line = 26)
    public final void method2013(int arg0) {
        if (this.field4970 != arg0) {
            this.method2060((byte) -98);
            this.method2069(true, (byte) 113);
            this.method2064(arg0 + 107, true);
            this.method2083((byte) 44, true);
            this.method2087(1, 16711935);
            this.method2045(arg0 + 34007, 0);
            this.field4970 = 16;
        }
        ++field4691;
    }

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "()Z", line = 47)
    public final boolean method803() {
        ++field4818;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "()V", line = 55)
    public final void method831() {
        ++field4854;
        this.method2083((byte) -111, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "()F", line = 66)
    public final float method741() {
        ++field4880;
        return this.field4979;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(B)I", line = 77)
    public static final int method2014(byte arg0) {
        if (arg0 <= 46) {
            field4735 = null;
        }
        ++field4846;
        if (class461.field6896 != null) {
            return 3;
        } else {
            return class439.field6629 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lfq;)V", line = 94)
    public final void method798(class137 arg0) {
        ++field4832;
        this.field4886.method2114(arg0, (byte) -121, this);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIF)Lbe;", line = 109)
    public final class28 method815(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4697;
        return new class340(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V", line = 119)
    public final void method2015(int arg0, byte arg1) {
        this.method2085(arg0, true, 0);
        ++field4765;
        if (arg1 != -121) {
            this.field4907 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILdq;)V", line = 130)
    public class325(int arg0, Canvas arg1, class15 arg2, int arg3, class500 arg4) {
        super(arg0, arg2);
        new class428();
        new class272(16);
        this.field4911 = new class63();
        this.field4912 = new class63();
        this.field4913 = new class63();
        this.field4914 = new class63();
        this.field4915 = new class63();
        this.field4916 = new class63();
        this.field4917 = new class63();
        this.field4930 = 0;
        this.field4918 = 512;
        this.field4938 = 3584.0F;
        this.field4928 = 8448;
        this.field4924 = -1;
        this.field4958 = 50;
        this.field4984 = -1;
        this.field4951 = -1.0F;
        this.field4981 = 1.0F;
        this.field4949 = 0.0F;
        this.field4960 = 0;
        this.field4992 = 0;
        this.field4978 = 1.0F;
        this.field5002 = 1.0F;
        this.field4966 = new float[4];
        this.field4944 = 0;
        this.field5000 = -1.0F;
        this.field4933 = new float[16];
        this.field4977 = true;
        this.field5004 = 3000.0F;
        this.field4959 = new float[4];
        this.field5014 = 0;
        this.field4993 = -1;
        this.field4969 = 3584;
        this.field5024 = 0;
        this.field4937 = 512;
        this.field5010 = 0;
        this.field5030 = 1.0F;
        this.field5021 = 0;
        this.field4946 = new float[4];
        this.field4940 = new class28[class416.field6352];
        this.field4919 = 8448;
        this.field4961 = 3584.0F;
        this.field4950 = new float[4];
        this.field5028 = -1;
        this.field5012 = 1.0F;
        this.field5016 = -1;
        this.field4955 = 0;
        this.field5032 = 0;
        this.field4943 = new class283(8192);
        this.field5039 = new int[1];
        this.field5037 = new byte[16384];
        this.field5040 = new int[1];
        this.field5041 = new int[1];
        this.field4882 = arg3;
        this.field4807 = this.field4828 = arg1;
        try {
            if (class86.field1255 == null || !class86.field1255) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class86.field1255 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2978(false, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2978(false, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method2978(false, "libjaggl.so").toString());
                    }
                    class86.field1255 = Boolean.TRUE;
                }
            }
            if (class86.field1255 != null && class86.field1255) {
                this.field4881 = new OpenGL();
                this.field4789 = this.field4715 = this.field4881.init(arg1, 8, 8, 8, 24, 0, this.field4882);
                if (this.field4715 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2047((byte) 77);
                    int var7 = this.method2097(0);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field4925 = this.field4974 ? 33639 : 5121;
                        if (~this.field4991.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class61.method437(this.field4991.replace('/', ' '), ' ', 243);
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (~var13.charAt(0) == -121 && ~var13.length() <= -4 && class32.method273(var13.substring(1, 3), 118)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (~var13.length() <= -5 && class32.method273(var13.substring(0, 4), 89)) {
                                                var8 = class370.method2349(10, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field4964 = false;
                                }
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field4952 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field4997 = false;
                            }
                            this.field5027 &= this.field4881.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5026 = this.field4952;
                            this.field4947 = true;
                        }
                        if (this.field4983.indexOf("intel") != -1) {
                            this.field4939 = false;
                        }
                        this.field4996 = !this.field4983.equals("s3 graphics");
                        if (this.field4952) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class409.method2526(0, false, true);
                        this.field4893 = true;
                        this.field4884 = new class73(this, super.field2235);
                        this.method2050(1);
                        this.field4898 = new class71(this);
                        this.field4888 = new class89(this);
                        if (this.field4888.method604((byte) -101)) {
                            this.field4885 = new class381(this);
                            if (!this.field4885.method2397((byte) -73)) {
                                this.field4885.method2391(-10748);
                                this.field4885 = null;
                            }
                        }
                        this.field4890 = new class276(this);
                        this.method2079(-128);
                        this.method2042((byte) -97);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field4881.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class388.method2433(100L, -74);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
            this.method802();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)V", line = 329)
    public static void method2016(int arg0) {
        field4711 = null;
        field4735 = null;
        if (arg0 != -8082) {
            method2043(94);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I", line = 342)
    public static final int method2017(int arg0, int arg1, int arg2) {
        if (arg2 >= -74) {
            method2017(-93, -52, -84);
        }
        ++field4859;
        int var3 = arg0 >>> 24;
        int var4 = ((65280 & arg0) * var3 & 16711680 | (16711935 & arg0) * var3 & -16711936) >>> 8;
        int var5 = -var3 + 255;
        return ((-16711936 & (arg1 & 16711935) * var5 | 16711680 & (arg1 & 65280) * var5) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)V", line = 358)
    public final void method777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field4858;
        this.method772(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "()Z", line = 370)
    public final boolean method838() {
        ++field4731;
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "()I", line = 379)
    public final int method824() {
        ++field4863;
        int var1 = this.field5038;
        this.field5038 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V", line = 390)
    public final void method2018(boolean arg0, byte arg1) {
        ++field4690;
        if (!arg0 == this.field5011) {
            this.field5011 = arg0;
            this.method2029(31792);
            this.field4970 &= -8;
        }
        if (arg1 != 99) {
            this.method2035(true);
        }
    }

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V", line = 409)
    public final void method2019(int arg0) {
        if (this.field5017 != 0) {
            this.field4970 &= -32;
            this.field5017 = 0;
        }
        ++field4796;
        if (arg0 <= 85) {
            this.field4966 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "(IIII)V", line = 425)
    public final void method739(int arg0, int arg1, int arg2, int arg3) {
        ++field4829;
        if (~arg3 < ~this.field4811) {
            arg3 = this.field4811;
        }
        if (arg2 > this.field4809) {
            arg2 = this.field4809;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field5024 = arg1;
        this.field4944 = arg3;
        this.field5032 = arg0;
        this.field4992 = arg2;
        OpenGL.glEnable(3089);
        this.method2057(0);
        this.method2088(0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BFFFF)V", line = 456)
    public final void method2020(byte arg0, float arg1, float arg2, float arg3, float arg4) {
        if (arg0 == 75) {
            class1.field10[2] = arg4;
            class1.field10[3] = arg3;
            class1.field10[1] = arg1;
            class1.field10[0] = arg2;
            ++field4876;
            OpenGL.glTexEnvfv(8960, 8705, class1.field10, 0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBI)V", line = 472)
    public final void method2021(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 105) {
            this.method2028((class416) null, 44);
        }
        ++field4724;
        OpenGL.glDrawArrays(arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)I", line = 485)
    public final int method775(int arg0, int arg1) {
        ++field4732;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!nq", name = "XA", descriptor = "(III[I)V", line = 494)
    public final void method793(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4839;
        float var5 = (float) arg2 * this.field4935.field6332 + (float) arg0 * this.field4935.field6354 + (float) arg1 * this.field4935.field6351 + this.field4935.field6329;
        if (!((float) this.field4958 > var5) && !((float) this.field4969 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4935.field6348 + (float) arg0 * this.field4935.field6340 + (float) arg1 * this.field4935.field6324 + this.field4935.field6353) * (float) this.field4918 / var5);
            int var7 = (int) (((float) arg2 * this.field4935.field6330 + (float) arg0 * this.field4935.field6334 + (float) arg1 * this.field4935.field6347 + this.field4935.field6322) * (float) this.field4937 / var5);
            if (this.field4998 <= (float) var6 && this.field4968 >= (float) var6 && this.field4922 <= (float) var7 && (float) var7 <= this.field5006) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field4998);
                arg3[1] = (int) ((float) var7 + -this.field4922);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "GA", descriptor = "(ILi;II)V", line = 526)
    public final void method779(int arg0, class30 arg1, int arg2, int arg3) {
        ++field4857;
        class261 var5 = (class261) arg1;
        class116 var6 = var5.field3678;
        this.method2096(-29861);
        this.method2075(var5.field3678, 0);
        this.method2087(1, 16711935);
        this.method2030(7681, 8448, (byte) 71);
        this.method2059(34167, 768, 0, -31277);
        float var7 = var6.field1602 / (float) var6.field1594;
        float var8 = var6.field1598 / (float) var6.field1595;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5032) * var7, (float) (-arg3 + this.field5024) * var8);
        OpenGL.glVertex2i(this.field5032, this.field5024);
        OpenGL.glTexCoord2f((float) (this.field5032 - arg2) * var7, (float) (-arg3 + this.field4944) * var8);
        OpenGL.glVertex2i(this.field5032, this.field4944);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4992) * var7, (float) (-arg3 + this.field4944) * var8);
        OpenGL.glVertex2i(this.field4992, this.field4944);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field4992) * var7, (float) (-arg3 + this.field5024) * var8);
        OpenGL.glVertex2i(this.field4992, this.field5024);
        OpenGL.glEnd();
        this.method2059(5890, 768, 0, -31277);
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(Z)V", line = 558)
    public final void method2022(boolean arg0) {
        ++field4804;
        OpenGL.glPopMatrix();
        if (arg0) {
            this.method751();
        }
    }

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "(I)V", line = 569)
    private final void method2023(int arg0) {
        if (this.field4979 == 0.0F) {
            this.field4933[10] = this.field5029;
            this.field4933[14] = this.field5031;
        } else {
            float var2 = this.field5004 / (this.field5004 + this.field4979);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field5031 * (-var2 + 1.0F) / this.field4979;
            this.field4933[10] = this.field5029 + var4;
            this.field4933[14] = this.field5031 * var3;
        }
        ++field4813;
        this.field4961 = (float) this.field4969 + -this.field4979;
        this.field4938 = (this.field4933[14] + (float) (-this.field4969)) / this.field4933[10];
        int var5 = -69 % ((12 - arg0) / 46);
    }

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "()Z", line = 601)
    public final boolean method848() {
        ++field4733;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V", line = 616)
    public final void method2024(int arg0, boolean arg1) {
        if (!arg1 == this.field5007) {
            this.field5007 = arg1;
            this.method2029(31792);
        }
        ++field4757;
        if (arg0 != 21690) {
            this.method2075((class538) null, -119);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)I", line = 634)
    public final int method2025(byte arg0, int arg1) {
        ++field4719;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (arg0 < 4) {
                method2016(97);
            }
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (~arg1 != -5126 && arg1 != 5124 && arg1 != 5126) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILmk;Lfb;Lqa;ILgw;II)V", line = 657)
    public static final void method2026(int arg0, class38 arg1, class484 arg2, class165 arg3, int arg4, class117 arg5, int arg6, int arg7) {
        ++field4694;
        int var8 = -(arg7 / 2) + arg2.field7133 + -5;
        if (arg4 != -29982) {
            method2026(49, (class38) null, (class484) null, (class165) null, -1, (class117) null, -66, 74);
        }
        int var9 = arg6 + 2;
        if (~arg1.field533 != -1) {
            arg3.method1117(-var9 + arg6 - (-(arg5.method719() * arg0) + -1), var9, arg1.field533, var8, arg7 + 10, (byte) 73);
        }
        if (~arg1.field544 != -1) {
            arg3.method1128(var8, 1 + arg0 * arg5.method719() + (arg6 - var9), arg1.field544, -4, arg7 + 10, var9);
        }
        int var10 = arg1.field552;
        if (arg2.field7131 && arg1.field540 != -1) {
            var10 = arg1.field540;
        }
        for (int var11 = 0; ~arg0 < ~var11; ++var11) {
            String var12 = class306.field4445[var11];
            if (var11 < arg0 - 1) {
                var12 = var12.substring(0, -4 + var12.length());
            }
            arg5.method722(arg3, var12, arg2.field7133, arg6, var10, true);
            arg6 += arg5.method719();
        }
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V", line = 702)
    public final synchronized void method766(int arg0) {
        ++field4793;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4912.method455(true)) {
            class160 var12 = (class160) this.field4912.method447(8);
            class78.field1123[var2++] = (int) var12.field35;
            this.field4908 -= var12.field2088;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class78.field1123, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class78.field1123, 0);
            var2 = 0;
        }
        while (!this.field4913.method455(true)) {
            class160 var11 = (class160) this.field4913.method447(8);
            class78.field1123[var2++] = (int) var11.field35;
            this.field4910 -= var11.field2088;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class78.field1123, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class78.field1123, 0);
            var2 = 0;
        }
        while (!this.field4914.method455(true)) {
            class160 var10 = (class160) this.field4914.method447(8);
            class78.field1123[var2++] = var10.field2088;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class78.field1123, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class78.field1123, 0);
            var2 = 0;
        }
        while (!this.field4915.method455(true)) {
            class160 var9 = (class160) this.field4915.method447(8);
            class78.field1123[var2++] = (int) var9.field35;
            this.field4909 -= var9.field2088;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class78.field1123, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class78.field1123, 0);
            boolean var4 = false;
        }
        while (!this.field4911.method455(true)) {
            class160 var8 = (class160) this.field4911.method447(8);
            OpenGL.glDeleteLists((int) var8.field35, var8.field2088);
        }
        while (!this.field4916.method455(true)) {
            class5 var7 = this.field4916.method447(8);
            OpenGL.glDeleteProgramARB((int) var7.field35);
        }
        while (!this.field4917.method455(true)) {
            class5 var6 = this.field4917.method447(8);
            OpenGL.glDeleteObjectARB(var6.field35);
        }
        while (!this.field4911.method455(true)) {
            class160 var5 = (class160) this.field4911.method447(8);
            OpenGL.glDeleteLists((int) var5.field35, var5.field2088);
        }
        this.field4884.method502((byte) -120);
        if (~this.method837() < -100663297 && this.field4932 + 60000L < class58.method427((byte) -19)) {
            System.gc();
            this.field4932 = class58.method427((byte) -19);
        }
        this.field4899 = var3;
    }

    @OriginalMember(owner = "client!nq", name = "xa", descriptor = "()I", line = 867)
    public final int method837() {
        ++field4836;
        return this.field4910 + this.field4909 + this.field4908;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(B)V", line = 875)
    private final void method2027(byte arg0) {
        ++field4869;
        float[] var2 = this.field4933;
        float var3 = (float) (-this.field5021 * this.field4958) / (float) this.field4918;
        if (arg0 == -40) {
            float var4 = (float) ((-this.field5021 + this.field4809) * this.field4958) / (float) this.field4918;
            float var5 = (float) (this.field5014 * this.field4958) / (float) this.field4937;
            float var6 = (float) ((-this.field4811 + this.field5014) * this.field4958) / (float) this.field4937;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field4958 * 2.0F;
                var2[13] = 0.0F;
                var2[15] = 0.0F;
                var2[14] = this.field5031 = -((float) this.field4969 * var7) / (float) (-this.field4958 + this.field4969);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[5] = var7 / (var5 - var6);
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[11] = -1.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[4] = 0.0F;
                var2[10] = this.field5029 = (float) (-(this.field4969 - -this.field4958)) / (float) (-this.field4958 + this.field4969);
            } else {
                var2[14] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = 1.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
            }
            this.method2023(86);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgu;I)V", line = 938)
    public final void method2028(class416 arg0, int arg1) {
        ++field4734;
        if (arg1 != -10709) {
            this.method799((class539) null);
        }
        OpenGL.glLoadMatrixf(arg0.method2550((byte) 123), 0);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V", line = 950)
    public final void method814(boolean arg0) {
        ++field4742;
        this.field4977 = arg0;
        this.method2099((byte) -96);
    }

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "(I)V", line = 961)
    private final void method2029(int arg0) {
        ++field4698;
        if (this.field5011 && !this.field5007) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 31792) {
            this.field4910 = -55;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIB)V", line = 977)
    public final void method2030(int arg0, int arg1, byte arg2) {
        if (~this.field5022 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field4928 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field4928 = arg0;
            }
            if (this.field4919 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field4919 = arg1;
            }
            if (var4) {
                this.field4970 &= -30;
            }
        }
        ++field4774;
        if (arg2 != 71) {
            this.field4888 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILvf;)V", line = 1019)
    public final void method2031(int arg0, class105 arg1) {
        if (arg0 != -25866) {
            this.method2059(-31, -49, -104, -5);
        }
        ++field4848;
        if (this.field4976 != arg1) {
            if (this.field4952) {
                OpenGL.glBindBufferARB(34963, arg1.method677(-9737));
            }
            this.field4976 = arg1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "la", descriptor = "(IFFFFF)V", line = 1038)
    public final void method759(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4845;
        boolean var7 = ~this.field4993 != ~arg0;
        if (var7 || this.field5000 != arg1 || this.field4951 != arg2) {
            this.field5000 = arg1;
            this.field4951 = arg2;
            this.field4993 = arg0;
            if (var7) {
                this.field4981 = (float) (16711680 & this.field4993) / 1.671168E7F;
                this.field4978 = (float) (this.field4993 & 255) / 255.0F;
                this.field5012 = (float) (65280 & this.field4993) / 65280.0F;
                this.method2058((byte) -103);
            }
            this.method2038((byte) 118);
        }
        if (this.field4946[0] != arg3 || this.field4946[1] != arg4 || this.field4946[2] != arg5) {
            this.field4946[0] = arg3;
            this.field4946[2] = arg5;
            this.field4946[1] = arg4;
            this.field4950[0] = -arg3;
            this.field4950[1] = -arg4;
            this.field4950[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field4959[2] = arg5 * var8;
            this.field4959[0] = arg3 * var8;
            this.field4959[1] = arg4 * var8;
            this.field4966[1] = -this.field4959[1];
            this.field4966[2] = -this.field4959[2];
            this.field4966[0] = -this.field4959[0];
            this.method2041((byte) -125);
            this.field4990 = (int) (arg3 * 256.0F / arg4);
            this.field4941 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "()Z", line = 1086)
    public final boolean method823() {
        ++field4689;
        return this.field4885 != null && this.field4885.method3150((byte) 33);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZII)V", line = 1094)
    public final synchronized void method2032(boolean arg0, int arg1, int arg2) {
        ++field4706;
        class160 var4 = new class160(arg1);
        if (!arg0) {
            method2056((short[]) null, (String[]) null, 9, 39, -74);
        }
        var4.field35 = (long) arg2;
        this.field4912.method453((byte) 122, var4);
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(B)V", line = 1108)
    private final void method2033(byte arg0) {
        if (arg0 < -11) {
            this.field4881.detach();
            ++field4743;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZZB)V", line = 1119)
    public final void method2034(int arg0, boolean arg1, boolean arg2, byte arg3) {
        if (~this.field4965 != ~arg0) {
            if (~arg0 > -1) {
                this.method2098((byte) 123);
                this.method2075((class538) null, 0);
                this.method2045(34023, 0);
                if (!this.field4931) {
                    this.field4890.method1777(0, 0, arg1, arg2, 3, 0);
                }
            } else {
                class25 var5 = this.field4884.method505((byte) -117, arg0);
                class107 var6 = super.field2235.method157((byte) 112, arg0);
                if (~var6.field1520 == -1 && var6.field1507 == 0) {
                    this.method2098((byte) 121);
                } else {
                    int var7 = !var6.field1516 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method2084(0.0F, true, (float) (this.field4899 % var8 * var6.field1520) / (float) var8, (float) (this.field4899 % var8 * var6.field1507) / (float) var8);
                }
                if (!this.field4931) {
                    this.field4890.method1777(var6.field1513, var6.field1506, arg1, arg2, 3, var6.field1524);
                    if (!this.field4890.method1775(var5, var6.field1512, 123)) {
                        this.method2075(var5, 0);
                        this.method2045(34023, var6.field1512);
                    }
                } else {
                    this.method2075(var5, 0);
                    this.method2045(34023, var6.field1512);
                }
            }
            this.field4965 = arg0;
        }
        if (arg3 > -124) {
            this.method810(-79, 109, 84, 8, -1, -125);
        }
        ++field4761;
        this.field4970 &= -8;
    }

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "()I", line = 1181)
    public final int method796() {
        ++field4830;
        int var1 = this.field5036;
        this.field5036 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "()Z", line = 1193)
    public final boolean method755() {
        ++field4760;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(Z)V", line = 1202)
    private final void method2035(boolean arg0) {
        OpenGL.glLoadIdentity();
        ++field4850;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0) {
            this.method834(24);
        }
        OpenGL.glMultMatrixf(this.field4935.method2550((byte) 118), 0);
        if (this.field4931) {
            this.field4890.field3922.method1550(0);
        }
        this.method2041((byte) -110);
        this.method2074(1528);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIZLjaggl/memory/NativeBuffer;I)Lms;", line = 1222)
    public final class541 method2036(byte arg0, int arg1, boolean arg2, NativeBuffer arg3, int arg4) {
        if (arg0 != 117) {
            this.method2065(-94, 105, 113, (class105) null, 81);
        }
        ++field4754;
        return (class541) (!this.field4952 || arg2 && !this.field5026 ? new class503(this, arg1, arg3) : new class66(this, arg1, arg3, arg4, arg2));
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V", line = 1240)
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        this.field4888.method597(arg1, arg3, 6408, arg0, arg2);
        ++field4707;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLbf;)V", line = 1250)
    public final void method2037(byte arg0, class379 arg1) {
        ++field4808;
        if (this.field4904 >= 3) {
            throw new RuntimeException();
        } else if (arg0 >= 37) {
            if (~this.field4904 <= -1) {
                this.field4906[this.field4904].method2377(486);
            }
            this.field4905 = this.field4906[++this.field4904] = arg1;
            this.field4905.method2374((byte) 78);
        }
    }

    @OriginalMember(owner = "client!nq", name = "MA", descriptor = "(F)V", line = 1269)
    public final void method829(float arg0) {
        ++field4810;
        if (this.field4953 != arg0) {
            this.field4953 = arg0;
            this.method2058((byte) -103);
        }
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(B)V", line = 1284)
    private final void method2038(byte arg0) {
        class1.field10[0] = this.field5000 * this.field4981;
        if (arg0 != 118) {
            this.method2015(47, (byte) -87);
        }
        class1.field10[3] = 1.0F;
        ++field4864;
        class1.field10[1] = this.field5012 * this.field5000;
        class1.field10[2] = this.field5000 * this.field4978;
        OpenGL.glLightfv(16384, 4609, class1.field10, 0);
        class1.field10[0] = -this.field4951 * this.field4981;
        class1.field10[2] = -this.field4951 * this.field4978;
        class1.field10[3] = 1.0F;
        class1.field10[1] = -this.field4951 * this.field5012;
        OpenGL.glLightfv(16385, 4609, class1.field10, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lbf;Z)V", line = 1306)
    public final void method2039(class379 arg0, boolean arg1) {
        if (!arg1) {
            this.field4987 = 1.9363505F;
        }
        ++field4878;
        if (this.field4901 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4901 <= -1) {
                this.field4903[this.field4901].method2376(-126);
            }
            this.field4907 = this.field4903[++this.field4901] = arg0;
            this.field4907.method2372(-90);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(BI)V", line = 1326)
    public final void method2040(byte arg0, int arg1) {
        int var3 = 26 / ((arg0 - -48) / 37);
        ++field4740;
        if (this.field5022 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field5022 = arg1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V", line = 1341)
    public final void method801(boolean arg0) {
        ++field4825;
    }

    @OriginalMember(owner = "client!nq", name = "ha", descriptor = "(III)V", line = 1351)
    public final void method760(int arg0, int arg1, int arg2) {
        if (this.field4984 != arg0 || ~this.field5016 != ~arg1 || ~this.field5010 != ~arg2) {
            this.field5010 = arg2;
            this.field5016 = arg1;
            this.field4984 = arg0;
            if (!this.field4931) {
                this.method2095(-10685);
                this.method2066(false);
            }
        }
        ++field4842;
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(B)V", line = 1375)
    public final void method2041(byte arg0) {
        int var2 = -42 / ((-27 - arg0) / 51);
        OpenGL.glLightfv(16384, 4611, this.field4959, 0);
        ++field4745;
        OpenGL.glLightfv(16385, 4611, this.field4966, 0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)Llo;", line = 1387)
    public final class539 method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4879;
        return !this.field5025 ? null : new class278(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[[I[[IIII)Lo;", line = 1400)
    public final class23 method752(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4833;
        return new class376(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(B)V", line = 1410)
    private final void method2042(byte arg0) {
        ++field4837;
        if (this.field4807 != null) {
            Dimension var2 = this.field4807.getSize();
            this.field4767 = var2.width;
            this.field4801 = var2.height;
        } else {
            this.field4767 = this.field4801 = 0;
        }
        if (this.field4905 == null) {
            this.field4809 = this.field4767;
            this.field4811 = this.field4801;
            this.method2051(0);
        }
        this.method2019(106);
        if (arg0 >= -59) {
            this.field4903 = null;
        }
        this.method753();
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)V", line = 1439)
    public final void method780(int arg0) {
        ++field4847;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "(I)V", line = 1450)
    public static final void method2043(int arg0) {
        ++field4768;
        class315.field4587.field2559 = 1;
        class128.method873((byte) 127);
        class28.field410 = 0;
        class527.field7731 = 0;
        class209.field2896 = 0;
        class47.field673 = 0;
        class340.field5266 = 0;
        class151.field1977 = 0;
        class254.field3527 = 0;
        class55.field780 = 0;
        class439.field6626 = 0;
        class230.field3294 = 0;
        class538.field7887 = 0;
        class296.field4324 = 0;
        class235.field3328 = 0;
        class46.field657 = 0;
        class5.field37 = 0;
        class489.field7223 = 0;
        class229.field3272 = 0;
        class462.field6916 = 0;
        class26.field374 = 0;
        class163.field2134 = 0;
        class38.field538 = 0;
        class226.field3158 = 0;
        class143.field1913 = 0;
        class189.field2529 = 0;
        class229.field3265 = 0;
        class99.field1445 = 0;
        class173.field2325 = 0;
        class82.field1194 = 0;
        class84.field1233 = 0;
        field4802 = 0;
        class230.field3283 = 0;
        class376.field5707 = 0;
        class74.field1078 = 0;
        class420.field6385 = 0;
        class538.field7876 = 0;
        class528.field7742 = 0;
        class177.field2370 = 0;
        class351.field5405 = 0;
        class46.field658 = 0;
        class168.field2257 = 0;
        class112.field1563 = 0;
        class181.field2452 = 0;
        class412.field6258 = 0;
        class152.field1990 = 0;
        class81.field1147 = 0;
        class164.field2189 = 0;
        field4834 = 0;
        class319.field4622 = 0;
        class221.field3079 = 0;
        class191.field2563 = 0;
        class343.field5293 = 0;
        class441.field6639 = 0;
        class195.field2607 = 0;
        class164.field2164 = 0;
        class275.field3905 = 0;
        class530.field7771 = 0;
        class530.field7761 = 0;
        class110.field1548 = 0;
        class20.field303 = 0;
        class8.field153 = 0;
        class377.field5756 = 0;
        class206.field2777 = 0;
        class491.field7248 = 0;
        class27.field396 = 0;
        class354.field5465 = 0;
        class275.field3831 = 0;
        class296.field4309 = 0;
        class141.field1888 = 0;
        class339.field5252 = 0;
        class429.field6507 = 0;
        class395.field6034 = 0;
        class154.field2012 = 0;
        class215.field3043 = 0;
        class521.field7677 = 0;
        class92.field1348 = 0;
        class163.field2133 = 0;
        class275.field3832 = 0;
        field4790 = 0;
        class539.field7901 = 0;
        class273.field3796 = 0;
        class498.field7345 = 0;
        class209.field2900 = 0;
        class226.field3130 = 0;
        field4742 = 0;
        class152.field1988 = 0;
        field4812 = 0;
        class135.field1806 = 0;
        class530.field7788 = 0;
        class256.field3538 = 0;
        class23.field335 = 0;
        class455.field6841 = 0;
        class136.field1820 = 0;
        class539.field7903 = 0;
        class431.field6563 = 0;
        class74.field1094 = 0;
        class520.field7651 = 0;
        field4879 = 0;
        class432.field6574 = 0;
        class20.field305 = 0;
        class310.field4519 = 0;
        class178.field2383 = 0;
        class480.field7089 = 0;
        class475.field7047 = 0;
        class244.field3433 = 0;
        class516.field7580 = 0;
        class502.field7405 = 0;
        class467.field6979 = 0;
        field4840 = 0;
        class18.field294 = 0;
        class48.field688 = 0;
        class418.field6375 = 0;
        class339.field5256 = 0;
        class330.field5161 = 0;
        class376.field5735 = 0;
        class499.field7359 = 0;
        class89.field1278 = 0;
        class351.field5416 = 0;
        class263.field3689 = 0;
        class126.field1706 = 0;
        class226.field3161 = 0;
        class164.field2175 = 0;
        class13.field250 = 0;
        class340.field5263 = 0;
        class530.field7768 = 0;
        class138.field1844 = 0;
        class191.field2574 = 0;
        class159.field2062 = 0;
        class473.field7032 = 0;
        class141.field1882 = 0;
        class266.field3710 = 0;
        class83.field1216 = 0;
        class447.field6711 = 0;
        class118.field1613 = 0;
        class361.field5530 = 0;
        class369.field5627 = 0;
        class204.field2725 = 0;
        class33.field510 = 0;
        field4837 = 0;
        class82.field1200 = 0;
        class421.field6405 = 0;
        class48.field686 = 0;
        class361.field5556 = 0;
        class44.field634 = 0;
        class335.field5204 = 0;
        class409.field6208 = 0;
        class294.field4288 = 0;
        field4835 = 0;
        class125.field1689 = 0;
        class61.field879 = 0;
        class73.field1010 = 0;
        class429.field6532 = 0;
        class520.field7644 = 0;
        class503.field7422 = 0;
        class222.field3094 = 0;
        field4691 = 0;
        class425.field6467 = 0;
        class290.field4240 = 0;
        class63.field901 = 0;
        class417.field6358 = 0;
        class516.field7591 = 0;
        class409.field6201 = 0;
        class92.field1355 = 0;
        class243.field3409 = 0;
        class467.field6992 = 0;
        class17.field281 = 0;
        class310.field4518 = 0;
        field4836 = 0;
        class199.field2643 = 0;
        class199.field2639 = 0;
        class165.field2230 = 0;
        class411.field6248 = 0;
        class229.field3269 = 0;
        class277.field3938 = 0;
        class437.field6607 = 0;
        class4.field24 = 0;
        class164.field2206 = 0;
        client.field2672 = 0;
        field4743 = 0;
        class226.field3194 = 0;
        class521.field7663 = 0;
        class482.field7113 = 0;
        class361.field5545 = 0;
        class120.field1644 = 0;
        class248.field3455 = 0;
        class391.field5975 = 0;
        class404.field6127 = 0;
        class507.field7461 = 0;
        class475.field7050 = 0;
        class532.field7818 = 0;
        class507.field7460 = 0;
        class164.field2159 = 0;
        class311.field4539 = 0;
        class63.field903 = 0;
        class507.field7471 = 0;
        class300.field4407 = 0;
        class2.field15 = 0;
        class528.field7733 = 0;
        class319.field4618 = 0;
        class47.field674 = 0;
        class76.field1108 = 0;
        class26.field377 = 0;
        class226.field3143 = 0;
        class530.field7790 = 0;
        class66.field944 = 0;
        class222.field3100 = 0;
        class206.field2758 = 0;
        class392.field6000 = 0;
        class107.field1503 = 0;
        class405.field6138 = 0;
        class447.field6720 = 0;
        class226.field3177 = 0;
        field4817 = 0;
        class294.field4286 = 0;
        class29.field435 = 0;
        class182.field2460 = 0;
        class55.field769 = 0;
        class52.field728 = 0;
        class209.field2965 = 0;
        class66.field938 = 0;
        class319.field4624 = 0;
        class275.field3889 = 0;
        class194.field2586 = 0;
        class311.field4550 = 0;
        class329.field5131 = 0;
        class432.field6569 = 0;
        class4.field33 = 0;
        class103.field1482 = 0;
        class421.field6409 = 0;
        class125.field1685 = 0;
        class523.field7702 = 0;
        class293.field4265 = 0;
        class211.field2981 = 0;
        class82.field1188 = 0;
        class530.field7795 = 0;
        class445.field6685 = 0;
        class289.field4227 = 0;
        class492.field7262 = 0;
        class498.field7349 = 0;
        class33.field485 = 0;
        class533.field7837 = 0;
        field4765 = 0;
        class121.field1656 = 0;
        class80.field1133 = 0;
        field4694 = 0;
        class307.field4450 = 0;
        class53.field750 = 0;
        class337.field5222 = 0;
        class28.field412 = 0;
        class191.field2577 = 0;
        class432.field6568 = 0;
        class163.field2122 = 0;
        class270.field3759 = 0;
        class244.field3428 = 0;
        class22.field325 = 0;
        class414.field6306 = 0;
        class259.field3662 = 0;
        class380.field5776 = 0;
        class351.field5414 = 0;
        class164.field2205 = 0;
        class437.field6615 = 0;
        class213.field3008 = 0;
        class180.field2428 = 0;
        class516.field7582 = 0;
        class110.field1554 = 0;
        class300.field4402 = 0;
        class17.field280 = 0;
        class351.field5404 = 0;
        class425.field6470 = 0;
        class523.field7698 = 0;
        class32.field472 = 0;
        class343.field5286 = 0;
        class402.field6117 = 0;
        class229.field3275 = 0;
        class507.field7472 = 0;
        class126.field1707 = 0;
        class244.field3422 = 0;
        class109.field1528 = 0;
        client.field2662 = 0;
        class485.field7174 = 0;
        class269.field3752 = 0;
        class533.field7832 = 0;
        class200.field2695 = 0;
        class318.field4616 = 0;
        class191.field2569 = 0;
        class254.field3524 = 0;
        class131.field1765 = 0;
        field4887 = 0;
        class428.field6490 = 0;
        class250.field3481 = 0;
        field4734 = 0;
        class322.field4664 = 0;
        class471.field7021 = 0;
        class147.field1946 = 0;
        class258.field3595 = 0;
        class89.field1290 = 0;
        class466.field6953 = 0;
        class521.field7671 = 0;
        class286.field4179 = 0;
        class361.field5551 = 0;
        class181.field2439 = 0;
        class373.field5675 = 0;
        class263.field3683 = 0;
        class336.field5216 = 0;
        class52.field719 = 0;
        class240.field3367 = 0;
        class151.field1976 = 0;
        class66.field939 = 0;
        class296.field4310 = 0;
        class85.field1246 = 0;
        class182.field2463 = 0;
        class431.field6555 = 0;
        class56.field820 = 0;
        class462.field6912 = 0;
        class315.field4589 = 0;
        field4803 = 0;
        class206.field2782 = 0;
        class387.field5914 = 0;
        class378.field5773 = 0;
        class244.field3415 = 0;
        class165.field2238 = 0;
        class63.field904 = 0;
        class340.field5262 = 0;
        class405.field6143 = 0;
        class308.field4453 = 0;
        class429.field6530 = 0;
        class109.field1540 = 0;
        class530.field7783 = 0;
        class402.field6118 = 0;
        class361.field5543 = 0;
        class445.field6683 = 0;
        class206.field2773 = 0;
        class28.field416 = 0;
        class48.field681 = 0;
        class150.field1971 = 0;
        class489.field7237 = 0;
        field4861 = 0;
        class193.field2584 = 0;
        class259.field3658 = 0;
        class273.field3791 = 0;
        class465.field6931 = 0;
        class458.field6863 = 0;
        field4707 = 0;
        class232.field3309 = 0;
        class64.field912 = 0;
        class102.field1477 = 0;
        class44.field630 = 0;
        field4798 = 0;
        class77.field1114 = 0;
        class320.field4629 = 0;
        class72.field996 = 0;
        class462.field6915 = 0;
        class355.field5496 = 0;
        class291.field4258 = 0;
        class343.field5294 = 0;
        class431.field6566 = 0;
        class164.field2167 = 0;
        class351.field5411 = 0;
        client.field2657 = 0;
        field4757 = 0;
        class13.field254 = 0;
        class94.field1376 = 0;
        class244.field3429 = 0;
        field4738 = 0;
        class303.field4432 = 0;
        class330.field5152 = 0;
        class362.field5566 = 0;
        class537.field7873 = 0;
        class414.field6312 = 0;
        class361.field5538 = 0;
        class429.field6513 = 0;
        class101.field1465 = 0;
        class502.field7402 = 0;
        class333.field5180 = 0;
        class131.field1766 = 0;
        class322.field4667 = 0;
        class46.field660 = 0;
        class376.field5721 = 0;
        class74.field1065 = 0;
        class497.field7327 = 0;
        class142.field1896 = 0;
        class126.field1709 = 0;
        class527.field7727 = 0;
        class20.field301 = 0;
        class273.field3788 = 0;
        class159.field2070 = 0;
        class38.field543 = 0;
        class282.field3987 = 0;
        class447.field6713 = 0;
        class335.field5201 = 0;
        class74.field1087 = 0;
        class143.field1908 = 0;
        class254.field3523 = 0;
        class154.field2007 = 0;
        class496.field7316 = 0;
        class429.field6525 = 0;
        class206.field2763 = 0;
        class159.field2076 = 0;
        class164.field2157 = 0;
        class532.field7824 = 0;
        class11.field197 = 0;
        class275.field3845 = 0;
        class149.field1966 = 0;
        class487.field7207 = 0;
        field4827 = 0;
        class164.field2176 = 0;
        class17.field284 = 0;
        field4874 = 0;
        class184.field2494 = 0;
        class502.field7399 = 0;
        class467.field6970 = 0;
        class315.field4582 = 0;
        class163.field2124 = 0;
        class164.field2183 = 0;
        class498.field7339 = 0;
        class451.field6780 = 0;
        class374.field5691 = 0;
        class308.field4452 = 0;
        class113.field1569 = 0;
        class354.field5459 = 0;
        class41.field594 = 0;
        class525.field7709 = 0;
        class489.field7233 = 0;
        class416.field6346 = 0;
        class482.field7120 = 0;
        class311.field4547 = 0;
        class191.field2570 = 0;
        class534.field7850 = 0;
        class489.field7227 = 0;
        class300.field4401 = 0;
        class206.field2804 = 0;
        class308.field4455 = 0;
        class103.field1487 = 0;
        class410.field6217 = 0;
        class84.field1236 = 0;
        class206.field2797 = 0;
        class118.field1623 = 0;
        class33.field501 = 0;
        field4875 = 0;
        class206.field2800 = 0;
        field4810 = 0;
        class226.field3160 = 0;
        class307.field4449 = 0;
        class487.field7214 = 0;
        class526.field7721 = 0;
        class365.field5604 = 0;
        class167.field2255 = 0;
        class55.field779 = 0;
        class182.field2467 = 0;
        class191.field2564 = 0;
        class513.field7539 = 0;
        class350.field5393 = 0;
        class272.field3780 = 0;
        class200.field2685 = 0;
        class52.field729 = 0;
        class335.field5209 = 0;
        class357.field5503 = 0;
        class308.field4456 = 0;
        class496.field7309 = 0;
        field4745 = 0;
        class308.field4454 = 0;
        class29.field426 = 0;
        class293.field4268 = 0;
        class211.field2991 = 0;
        class466.field6945 = 0;
        class491.field7247 = 0;
        class4.field23 = 0;
        class414.field6318 = 0;
        class176.field2353 = 0;
        class428.field6493 = 0;
        class8.field158 = 0;
        class32.field471 = 0;
        class184.field2495 = 0;
        class312.field4556 = 0;
        class528.field7743 = 0;
        class322.field4659 = 0;
        field4740 = 0;
        class485.field7145 = 0;
        class167.field2254 = 0;
        class191.field2568 = 0;
        class334.field5198 = 0;
        class300.field4400 = 0;
        class391.field5966 = 0;
        class353.field5450 = 0;
        field4793 = 0;
        class208.field2873 = 0;
        class165.field2226 = 0;
        class345.field5315 = 0;
        class21.field312 = 0;
        class200.field2686 = 0;
        class310.field4511 = 0;
        class515.field7562 = 0;
        class466.field6943 = 0;
        class522.field7682 = 0;
        class17.field290 = 0;
        field4857 = 0;
        class503.field7419 = 0;
        class215.field3042 = 0;
        client.field2661 = 0;
        class226.field3208 = 0;
        class82.field1203 = 0;
        class180.field2415 = 0;
        class268.field3739 = 0;
        class409.field6204 = 0;
        class350.field5384 = 0;
        class406.field6154 = 0;
        class257.field3545 = 0;
        class71.field995 = 0;
        class56.field807 = 0;
        class74.field1027 = 0;
        class27.field400 = 0;
        class226.field3154 = 0;
        class138.field1843 = 0;
        class416.field6326 = 0;
        class286.field4178 = 0;
        class226.field3120 = 0;
        class164.field2158 = 0;
        class63.field910 = 0;
        class226.field3221 = 0;
        class259.field3638 = 0;
        class165.field2237 = 0;
        class162.field2109 = 0;
        class207.field2818 = 0;
        class276.field3927 = 0;
        class467.field6966 = 0;
        class515.field7561 = 0;
        class466.field6941 = 0;
        class21.field323 = 0;
        class131.field1758 = 0;
        class221.field3085 = 0;
        class159.field2050 = 0;
        class83.field1214 = 0;
        class347.field5362 = 0;
        class170.field2289 = 0;
        class394.field6024 = 0;
        field4814 = 0;
        class178.field2380 = 0;
        class136.field1809 = 0;
        class381.field5810 = 0;
        class1.field2 = 0;
        class480.field7093 = 0;
        class18.field296 = 0;
        class111.field1555 = 0;
        class165.field2223 = 0;
        class521.field7658 = 0;
        class271.field3767 = 0;
        class334.field5196 = 0;
        class420.field6402 = 0;
        class203.field2715 = 0;
        class152.field1983 = 0;
        class164.field2191 = 0;
        class52.field739 = 0;
        class451.field6781 = 0;
        class470.field7012 = 0;
        field4821 = 0;
        class165.field2229 = 0;
        class329.field5123 = 0;
        class170.field2300 = 0;
        class137.field1823 = 0;
        class134.field1794 = 0;
        class532.field7819 = 0;
        class14.field263 = 0;
        class55.field766 = 0;
        class337.field5225 = 0;
        class354.field5460 = 0;
        class31.field461 = 0;
        class461.field6904 = 0;
        class445.field6687 = 0;
        class334.field5192 = 0;
        class226.field3129 = 0;
        class162.field2113 = 0;
        class385.field5846 = 0;
        class82.field1192 = 0;
        class311.field4527 = 0;
        class345.field5321 = 0;
        class310.field4521 = 0;
        class429.field6511 = 0;
        class461.field6895 = 0;
        class454.field6830 = 0;
        class276.field3925 = 0;
        class203.field2714 = 0;
        class208.field2877 = 0;
        class527.field7726 = 0;
        class206.field2766 = 0;
        class85.field1242 = 0;
        class534.field7853 = 0;
        class429.field6522 = 0;
        class189.field2534 = 0;
        class521.field7670 = 0;
        class110.field1549 = 0;
        client.field2665 = 0;
        class482.field7121 = 0;
        class43.field622 = 0;
        class236.field3338 = 0;
        field4832 = 0;
        class282.field4051 = 0;
        class213.field3016 = 0;
        class235.field3327 = 0;
        class520.field7638 = 0;
        class74.field1075 = 0;
        class511.field7505 = 0;
        class71.field992 = 0;
        class101.field1466 = 0;
        class81.field1144 = 0;
        class164.field2178 = 0;
        class457.field6848 = 0;
        class391.field5971 = 0;
        class398.field6069 = 0;
        class66.field937 = 0;
        class88.field1268 = 0;
        class513.field7547 = 0;
        class141.field1886 = 0;
        class177.field2363 = 0;
        class531.field7813 = 0;
        class133.field1789 = 0;
        class45.field643 = 0;
        class125.field1687 = 0;
        field4867 = 0;
        class33.field507 = 0;
        class391.field5972 = 0;
        class361.field5547 = 0;
        class13.field257 = 0;
        class22.field326 = 0;
        class268.field3726 = 0;
        class205.field2730 = 0;
        class350.field5396 = 0;
        class165.field2224 = 0;
        class112.field1565 = 0;
        class164.field2169 = 0;
        class533.field7835 = 0;
        class451.field6776 = 0;
        class253.field3516 = 0;
        class24.field345 = 0;
        class335.field5202 = 0;
        class173.field2327 = 0;
        class114.field1584 = 0;
        class164.field2202 = 0;
        class474.field7040 = 0;
        class439.field6624 = 0;
        class352.field5435 = 0;
        class362.field5568 = 0;
        class206.field2775 = 0;
        class328.field5113 = 0;
        class164.field2208 = 0;
        class406.field6162 = 0;
        class96.field1408 = 0;
        class369.field5629 = 0;
        class33.field489 = 0;
        class5.field40 = 0;
        class91.field1330 = 0;
        class21.field317 = 0;
        class132.field1782 = 0;
        class64.field917 = 0;
        class530.field7777 = 0;
        class96.field1384 = 0;
        class506.field7451 = 0;
        class362.field5567 = 0;
        field4724 = 0;
        class134.field1798 = 0;
        class410.field6220 = 0;
        class206.field2791 = 0;
        class194.field2588 = 0;
        class291.field4255 = 0;
        class419.field6383 = 0;
        class503.field7426 = 0;
        class226.field3219 = 0;
        class475.field7059 = 0;
        class268.field3721 = 0;
        class421.field6406 = 0;
        class432.field6572 = 0;
        class352.field5436 = 0;
        class515.field7565 = 0;
        class308.field4463 = 0;
        class447.field6717 = 0;
        class200.field2683 = 0;
        class194.field2600 = 0;
        class347.field5365 = 0;
        class138.field1838 = 0;
        class329.field5130 = 0;
        class206.field2805 = 0;
        class507.field7465 = 0;
        class127.field1720 = 0;
        class322.field4655 = 0;
        class330.field5156 = 0;
        class296.field4331 = 0;
        class343.field5287 = 0;
        class459.field6874 = 0;
        class230.field3292 = 0;
        class206.field2789 = 0;
        class414.field6305 = 0;
        class212.field2999 = 0;
        class378.field5770 = 0;
        class311.field4537 = 0;
        class441.field6638 = 0;
        class380.field5779 = 0;
        class351.field5408 = 0;
        class208.field2875 = 0;
        class312.field4569 = 0;
        class226.field3191 = 0;
        class57.field825 = 0;
        class420.field6387 = 0;
        class330.field5159 = 0;
        class414.field6315 = 0;
        class159.field2052 = 0;
        class354.field5473 = 0;
        class138.field1835 = 0;
        class140.field1865 = 0;
        class269.field3748 = 0;
        class435.field6593 = 0;
        class445.field6682 = 0;
        class351.field5425 = 0;
        class312.field4565 = 0;
        class434.field6587 = 0;
        class253.field3520 = 0;
        class275.field3813 = 0;
        class482.field7114 = 0;
        class513.field7544 = 0;
        class391.field5967 = 0;
        class141.field1884 = 0;
        class96.field1431 = 0;
        client.field2670 = 0;
        class448.field6746 = 0;
        class214.field3028 = 0;
        class318.field4612 = 0;
        field4825 = 0;
        class103.field1485 = 0;
        class297.field4383 = 0;
        class320.field4630 = 0;
        class321.field4645 = 0;
        class521.field7673 = 0;
        class26.field373 = 0;
        class351.field5410 = 0;
        class451.field6775 = 0;
        class131.field1761 = 0;
        int var1 = 55 / ((-51 - arg0) / 36);
        class528.field7735 = 0;
        class86.field1249 = 0;
        class424.field6460 = 0;
        class41.field591 = 0;
        class91.field1316 = 0;
        class164.field2204 = 0;
        class61.field878 = 0;
        class330.field5148 = 0;
        class416.field6339 = 0;
        class164.field2172 = 0;
        class351.field5423 = 0;
        class226.field3166 = 0;
        class390.field5952 = 0;
        class331.field5163 = 0;
        class230.field3287 = 0;
        class48.field692 = 0;
        class251.field3483 = 0;
        class414.field6302 = 0;
        class259.field3664 = 0;
        class46.field659 = 0;
        class89.field1299 = 0;
        class282.field4079 = 0;
        field4805 = 0;
        class384.field5831 = 0;
        class310.field4512 = 0;
        class205.field2733 = 0;
        class429.field6534 = 0;
        class63.field909 = 0;
        class209.field2941 = 0;
        class149.field1965 = 0;
        class527.field7730 = 0;
        class357.field5506 = 0;
        class351.field5413 = 0;
        class139.field1856 = 0;
        class176.field2350 = 0;
        class83.field1210 = 0;
        class89.field1288 = 0;
        class526.field7719 = 0;
        class424.field6457 = 0;
        class421.field6414 = 0;
        class310.field4508 = 0;
        class317.field4607 = 0;
        class257.field3554 = 0;
        class96.field1429 = 0;
        field4760 = 0;
        class334.field5195 = 0;
        class222.field3089 = 0;
        class109.field1533 = 0;
        class268.field3729 = 0;
        class43.field620 = 0;
        class416.field6349 = 0;
        class179.field2390 = 0;
        class96.field1411 = 0;
        class78.field1126 = 0;
        field4846 = 0;
        class181.field2450 = 0;
        class354.field5458 = 0;
        class225.field3119 = 0;
        class31.field464 = 0;
        class511.field7503 = 0;
        class418.field6369 = 0;
        class496.field7311 = 0;
        class244.field3417 = 0;
        class452.field6791 = 0;
        class277.field3939 = 0;
        class55.field775 = 0;
        class451.field6779 = 0;
        class387.field5923 = 0;
        class199.field2641 = 0;
        class52.field727 = 0;
        class411.field6245 = 0;
        class64.field915 = 0;
        class361.field5546 = 0;
        class52.field734 = 0;
        class109.field1539 = 0;
        class272.field3769 = 0;
        field4729 = 0;
        class75.field1098 = 0;
        class128.field1732 = 0;
        class283.field4162 = 0;
        class199.field2645 = 0;
        class206.field2787 = 0;
        class156.field2034 = 0;
        class35.field517 = 0;
        class204.field2724 = 0;
        class329.field5129 = 0;
        class364.field5590 = 0;
        field4712 = 0;
        class191.field2556 = 0;
        class385.field5840 = 0;
        class156.field2024 = 0;
        class177.field2368 = 0;
        class236.field3336 = 0;
        class293.field4269 = 0;
        class92.field1364 = 0;
        class21.field313 = 0;
        class214.field3029 = 0;
        class244.field3432 = 0;
        class337.field5224 = 0;
        field4854 = 0;
        class288.field4209 = 0;
        class205.field2738 = 0;
        class28.field405 = 0;
        class141.field1890 = 0;
        class52.field726 = 0;
        class487.field7208 = 0;
        class272.field3783 = 0;
        class41.field596 = 0;
        field4718 = 0;
        class530.field7774 = 0;
        class61.field876 = 0;
        class321.field4641 = 0;
        class33.field493 = 0;
        class159.field2073 = 0;
        class226.field3189 = 0;
        class257.field3552 = 0;
        class491.field7245 = 0;
        class360.field5523 = 0;
        class170.field2303 = 0;
        class82.field1202 = 0;
        class402.field6121 = 0;
        class288.field4207 = 0;
        class411.field6249 = 0;
        class52.field721 = 0;
        class226.field3164 = 0;
        class128.field1733 = 0;
        class281.field3977 = 0;
        class380.field5777 = 0;
        class459.field6867 = 0;
        class511.field7501 = 0;
        class421.field6411 = 0;
        class162.field2110 = 0;
        class405.field6133 = 0;
        class36.field525 = 0;
        class191.field2553 = 0;
        class330.field5160 = 0;
        class99.field1444 = 0;
        class328.field5105 = 0;
        class536.field7869 = 0;
        class482.field7115 = 0;
        class418.field6380 = 0;
        class226.field3226 = 0;
        class21.field314 = 0;
        class355.field5497 = 0;
        class200.field2694 = 0;
        field4878 = 0;
        class344.field5313 = 0;
        class74.field1014 = 0;
        class485.field7156 = 0;
        class424.field6461 = 0;
        field4848 = 0;
        class470.field7010 = 0;
        class476.field7068 = 0;
        class514.field7551 = 0;
        class20.field304 = 0;
        class291.field4256 = 0;
        class401.field6102 = 0;
        class290.field4237 = 0;
        class191.field2573 = 0;
        class191.field2576 = 0;
        class165.field2228 = 0;
        class381.field5796 = 0;
        class376.field5729 = 0;
        class322.field4665 = 0;
        class28.field415 = 0;
        class432.field6576 = 0;
        class101.field1468 = 0;
        class268.field3735 = 0;
        class430.field6551 = 0;
        class96.field1405 = 0;
        class159.field2077 = 0;
        field4772 = 0;
        class328.field5103 = 0;
        class62.field885 = 0;
        class416.field6343 = 0;
        class83.field1206 = 0;
        class446.field6693 = 0;
        class289.field4218 = 0;
        class43.field625 = 0;
        class351.field5412 = 0;
        class529.field7751 = 0;
        class214.field3031 = 0;
        class164.field2165 = 0;
        class330.field5145 = 0;
        class330.field5141 = 0;
        class376.field5718 = 0;
        class329.field5125 = 0;
        class164.field2216 = 0;
        class150.field1968 = 0;
        field4746 = 0;
        class208.field2880 = 0;
        class221.field3076 = 0;
        class41.field607 = 0;
        class26.field380 = 0;
        class452.field6790 = 0;
        class311.field4543 = 0;
        class485.field7148 = 0;
        class125.field1699 = 0;
        class245.field3443 = 0;
        class168.field2269 = 0;
        class25.field367 = 0;
        class503.field7425 = 0;
        field4824 = 0;
        class532.field7823 = 0;
        class101.field1464 = 0;
        class420.field6396 = 0;
        class357.field5501 = 0;
        class206.field2756 = 0;
        class487.field7210 = 0;
        class276.field3932 = 0;
        class405.field6136 = 0;
        field4815 = 0;
        class200.field2688 = 0;
        class138.field1836 = 0;
        class164.field2173 = 0;
        class26.field369 = 0;
        class476.field7067 = 0;
        class276.field3924 = 0;
        class282.field4095 = 0;
        class71.field991 = 0;
        class385.field5852 = 0;
        class33.field477 = 0;
        class393.field6010 = 0;
        class380.field5784 = 0;
        class328.field5107 = 0;
        class275.field3848 = 0;
        class121.field1653 = 0;
        class411.field6242 = 0;
        field4771 = 0;
        class531.field7805 = 0;
        class424.field6463 = 0;
        class407.field6186 = 0;
        class282.field4093 = 0;
        class211.field2992 = 0;
        class290.field4235 = 0;
        class222.field3107 = 0;
        field4797 = 0;
        class280.field3969 = 0;
        class351.field5421 = 0;
        class282.field4046 = 0;
        class451.field6767 = 0;
        class165.field2234 = 0;
        class388.field5927 = 0;
        class467.field6977 = 0;
        class335.field5205 = 0;
        class385.field5853 = 0;
        field4799 = 0;
        class206.field2742 = 0;
        class18.field295 = 0;
        class378.field5769 = 0;
        class381.field5807 = 0;
        class532.field7822 = 0;
        class179.field2398 = 0;
        class297.field4382 = 0;
        class63.field905 = 0;
        class380.field5787 = 0;
        class289.field4229 = 0;
        class91.field1329 = 0;
        class530.field7770 = 0;
        class194.field2592 = 0;
        class249.field3460 = 0;
        field4708 = 0;
        class445.field6679 = 0;
        class354.field5463 = 0;
        class388.field5932 = 0;
        class321.field4647 = 0;
        field4741 = 0;
        class391.field5969 = 0;
        class82.field1189 = 0;
        class388.field5929 = 0;
        field4870 = 0;
        class520.field7640 = 0;
        field4776 = 0;
        class164.field2201 = 0;
        class343.field5304 = 0;
        field4690 = 0;
        class74.field1084 = 0;
        class407.field6170 = 0;
        class373.field5677 = 0;
        class137.field1826 = 0;
        class257.field3560 = 0;
        class35.field521 = 0;
        class28.field407 = 0;
        class206.field2794 = 0;
        class374.field5690 = 0;
        class163.field2132 = 0;
        class55.field783 = 0;
        class195.field2609 = 0;
        class194.field2599 = 0;
        class213.field3014 = 0;
        class278.field3941 = 0;
        class385.field5855 = 0;
        class96.field1400 = 0;
        class48.field684 = 0;
        class429.field6535 = 0;
        class480.field7086 = 0;
        class191.field2547 = 0;
        class74.field1066 = 0;
        class17.field278 = 0;
        class323.field4677 = 0;
        field4829 = 0;
        class96.field1397 = 0;
        class244.field3426 = 0;
        class199.field2640 = 0;
        class533.field7836 = 0;
        class301.field4410 = 0;
        class226.field3224 = 0;
        class330.field5158 = 0;
        class70.field984 = 0;
        class163.field2140 = 0;
        class70.field980 = 0;
        class496.field7315 = 0;
        class361.field5536 = 0;
        class92.field1349 = 0;
        class244.field3421 = 0;
        class236.field3333 = 0;
        class498.field7338 = 0;
        class520.field7637 = 0;
        class520.field7649 = 0;
        class182.field2465 = 0;
        class131.field1749 = 0;
        class96.field1399 = 0;
        class310.field4515 = 0;
        class170.field2298 = 0;
        class144.field1918 = 0;
        class444.field6677 = 0;
        field4820 = 0;
        class222.field3099 = 0;
        field4693 = 0;
        class530.field7785 = 0;
        class53.field749 = 0;
        class376.field5731 = 0;
        class362.field5564 = 0;
        class131.field1757 = 0;
        class538.field7896 = 0;
        class96.field1428 = 0;
        class532.field7821 = 0;
        class17.field276 = 0;
        class429.field6523 = 0;
        class159.field2081 = 0;
        class131.field1759 = 0;
        class244.field3425 = 0;
        class152.field1987 = 0;
        class264.field3702 = 0;
        class526.field7716 = 0;
        class44.field631 = 0;
        class173.field2326 = 0;
        class530.field7765 = 0;
        class243.field3407 = 0;
        class55.field771 = 0;
        class35.field513 = 0;
        class17.field291 = 0;
        class489.field7229 = 0;
        class81.field1186 = 0;
        class55.field772 = 0;
        class391.field5961 = 0;
        class187.field2516 = 0;
        class165.field2239 = 0;
        field4699 = 0;
        class401.field6113 = 0;
        field4752 = 0;
        class226.field3139 = 0;
        class11.field181 = 0;
        class96.field1414 = 0;
        class498.field7351 = 0;
        class466.field6952 = 0;
        class251.field3495 = 0;
        class209.field2954 = 0;
        class350.field5386 = 0;
        class226.field3218 = 0;
        class319.field4619 = 0;
        class176.field2354 = 0;
        class131.field1756 = 0;
        class191.field2583 = 0;
        class272.field3775 = 0;
        class334.field5191 = 0;
        class181.field2445 = 0;
        class33.field499 = 0;
        class473.field7034 = 0;
        field4749 = 0;
        class433.field6579 = 0;
        class447.field6706 = 0;
        class131.field1754 = 0;
        class492.field7265 = 0;
        class386.field5860 = 0;
        field4754 = 0;
        class441.field6636 = 0;
        class429.field6526 = 0;
        field4701 = 0;
        class447.field6723 = 0;
        class416.field6336 = 0;
        class489.field7226 = 0;
        class446.field6692 = 0;
        class60.field866 = 0;
        class32.field466 = 0;
        class467.field6982 = 0;
        class57.field831 = 0;
        class221.field3082 = 0;
        field4777 = 0;
        class154.field2006 = 0;
        class159.field2053 = 0;
        class275.field3872 = 0;
        class78.field1125 = 0;
        class515.field7560 = 0;
        class134.field1792 = 0;
        class208.field2882 = 0;
        class178.field2375 = 0;
        class458.field6858 = 0;
        class206.field2785 = 0;
        class74.field1082 = 0;
        class118.field1627 = 0;
        class191.field2557 = 0;
        class116.field1596 = 0;
        class405.field6134 = 0;
        field4786 = 0;
        class211.field2986 = 0;
        class367.field5617 = 0;
        class333.field5179 = 0;
        class27.field389 = 0;
        class235.field3326 = 0;
        class521.field7661 = 0;
        class56.field801 = 0;
        class47.field672 = 0;
        class503.field7424 = 0;
        class244.field3431 = 0;
        class414.field6316 = 0;
        class424.field6466 = 0;
        class439.field6628 = 0;
        class507.field7464 = 0;
        class498.field7336 = 0;
        class206.field2746 = 0;
        field4766 = 0;
        class342.field5276 = 0;
        class268.field3718 = 0;
        class502.field7401 = 0;
        class275.field3875 = 0;
        field4727 = 0;
        class337.field5218 = 0;
        class27.field387 = 0;
        class82.field1193 = 0;
        class272.field3782 = 0;
        class447.field6710 = 0;
        class141.field1881 = 0;
        class31.field455 = 0;
        class429.field6515 = 0;
        class215.field3040 = 0;
        class428.field6494 = 0;
        class226.field3174 = 0;
        class418.field6368 = 0;
        class125.field1694 = 0;
        class205.field2736 = 0;
        class466.field6950 = 0;
        class515.field7563 = 0;
        class493.field7272 = 0;
        class432.field6570 = 0;
        class239.field3362 = 0;
        field4785 = 0;
        class447.field6707 = 0;
        class282.field4109 = 0;
        class294.field4291 = 0;
        class491.field7246 = 0;
        class109.field1536 = 0;
        class362.field5565 = 0;
        class258.field3570 = 0;
        class507.field7469 = 0;
        class221.field3086 = 0;
        class95.field1381 = 0;
        class448.field6742 = 0;
        class127.field1723 = 0;
        class259.field3634 = 0;
        class164.field2156 = 0;
        class429.field6537 = 0;
        class431.field6562 = 0;
        class328.field5101 = 0;
        class436.field6597 = 0;
        class505.field7442 = 0;
        class33.field505 = 0;
        class354.field5476 = 0;
        class52.field713 = 0;
        class365.field5602 = 0;
        class41.field600 = 0;
        class391.field5974 = 0;
        field4794 = 0;
        class172.field2322 = 0;
        class401.field6107 = 0;
        class293.field4266 = 0;
        class411.field6244 = 0;
        class146.field1941 = 0;
        class4.field25 = 0;
        class412.field6266 = 0;
        class159.field2059 = 0;
        field4753 = 0;
        class490.field7240 = 0;
        class360.field5527 = 0;
        class369.field5633 = 0;
        class506.field7456 = 0;
        class272.field3781 = 0;
        class466.field6944 = 0;
        class147.field1953 = 0;
        class395.field6038 = 0;
        field4838 = 0;
        class191.field2561 = 0;
        class184.field2492 = 0;
        class351.field5431 = 0;
        class24.field343 = 0;
        class348.field5372 = 0;
        class20.field309 = 0;
        class38.field545 = 0;
        class295.field4297 = 0;
        class269.field3751 = 0;
        class211.field2988 = 0;
        field4696 = 0;
        class55.field784 = 0;
        class361.field5559 = 0;
        class55.field773 = 0;
        field4750 = 0;
        class65.field929 = 0;
        class163.field2136 = 0;
        class401.field6100 = 0;
        class96.field1409 = 0;
        class259.field3642 = 0;
        class275.field3868 = 0;
        class200.field2703 = 0;
        class529.field7753 = 0;
        class316.field4597 = 0;
        class391.field5979 = 0;
        class386.field5861 = 0;
        class311.field4542 = 0;
        class425.field6469 = 0;
        class301.field4412 = 0;
        class293.field4280 = 0;
        class511.field7504 = 0;
        class447.field6719 = 0;
        class387.field5882 = 0;
        class226.field3211 = 0;
        class418.field6371 = 0;
        class330.field5147 = 0;
        class312.field4564 = 0;
        class239.field3363 = 0;
        class46.field655 = 0;
        class524.field7705 = 0;
        class206.field2803 = 0;
        class141.field1880 = 0;
        class353.field5448 = 0;
        class421.field6415 = 0;
        class441.field6648 = 0;
        class328.field5100 = 0;
        class101.field1472 = 0;
        class177.field2364 = 0;
        class530.field7767 = 0;
        class175.field2341 = 0;
        class294.field4293 = 0;
        class467.field6991 = 0;
        class164.field2174 = 0;
        class273.field3804 = 0;
        class164.field2168 = 0;
        class257.field3557 = 0;
        class268.field3723 = 0;
        class461.field6901 = 0;
        class284.field4166 = 0;
        class64.field928 = 0;
        class61.field874 = 0;
        class432.field6571 = 0;
        class513.field7541 = 0;
        class174.field2331 = 0;
        class350.field5389 = 0;
        class226.field3169 = 0;
        field4841 = 0;
        class72.field999 = 0;
        class109.field1534 = 0;
        class63.field898 = 0;
        class322.field4662 = 0;
        class346.field5340 = 0;
        class429.field6519 = 0;
        field4770 = 0;
        class366.field5608 = 0;
        class125.field1692 = 0;
        class56.field806 = 0;
        class407.field6179 = 0;
        class22.field329 = 0;
        class453.field6823 = 0;
        class296.field4323 = 0;
        class489.field7232 = 0;
        class240.field3373 = 0;
        class107.field1501 = 0;
        class146.field1939 = 0;
        class461.field6902 = 0;
        class211.field2983 = 0;
        class461.field6898 = 0;
        class52.field738 = 0;
        class408.field6194 = 0;
        class180.field2414 = 0;
        field4704 = 0;
        class467.field6959 = 0;
        class306.field4442 = 0;
        class394.field6023 = 0;
        class273.field3793 = 0;
        field4818 = 0;
        class184.field2489 = 0;
        class91.field1322 = 0;
        class191.field2551 = 0;
        class221.field3077 = 0;
        class290.field4241 = 0;
        class239.field3361 = 0;
        client.field2660 = 0;
        class268.field3722 = 0;
        class410.field6226 = 0;
        class499.field7354 = 0;
        class74.field1092 = 0;
        class391.field5978 = 0;
        class542.field7922 = 0;
        class55.field787 = 0;
        class164.field2220 = 0;
        class17.field289 = 0;
        field4725 = 0;
        class385.field5848 = 0;
        class118.field1624 = 0;
        class182.field2472 = 0;
        class319.field4627 = 0;
        field4730 = 0;
        class419.field6384 = 0;
        class530.field7793 = 0;
        class83.field1212 = 0;
        class332.field5175 = 0;
        class402.field6116 = 0;
        class447.field6724 = 0;
        class404.field6126 = 0;
        class292.field4263 = 0;
        class530.field7779 = 0;
        class416.field6325 = 0;
        class40.field588 = 0;
        class66.field941 = 0;
        class289.field4226 = 0;
        class77.field1113 = 0;
        class387.field5915 = 0;
        class354.field5468 = 0;
        class125.field1700 = 0;
        class538.field7893 = 0;
        class518.field7618 = 0;
        class352.field5434 = 0;
        class507.field7466 = 0;
        class164.field2187 = 0;
        class405.field6132 = 0;
        class226.field3212 = 0;
        class308.field4457 = 0;
        class538.field7898 = 0;
        field4717 = 0;
        class131.field1760 = 0;
        class268.field3738 = 0;
        class131.field1762 = 0;
        class191.field2580 = 0;
        class33.field504 = 0;
        class475.field7052 = 0;
        class241.field3384 = 0;
        class414.field6319 = 0;
        class268.field3736 = 0;
        class209.field2962 = 0;
        class209.field2921 = 0;
        class408.field6199 = 0;
        class4.field30 = 0;
        class322.field4663 = 0;
        class350.field5390 = 0;
        class229.field3262 = 0;
        class521.field7662 = 0;
        class431.field6557 = 0;
        class467.field6974 = 0;
        class84.field1232 = 0;
        class310.field4514 = 0;
        field4720 = 0;
        class521.field7668 = 0;
        class289.field4222 = 0;
        class177.field2373 = 0;
        class181.field2443 = 0;
        class275.field3843 = 0;
        class416.field6342 = 0;
        class296.field4346 = 0;
        class52.field722 = 0;
        class521.field7676 = 0;
        class209.field2907 = 0;
        class359.field5515 = 0;
        class2.field12 = 0;
        class5.field38 = 0;
        class258.field3563 = 0;
        class53.field746 = 0;
        field4787 = 0;
        class407.field6187 = 0;
        class159.field2054 = 0;
        field4710 = 0;
        class540.field7914 = 0;
        class414.field6301 = 0;
        class2.field14 = 0;
        class164.field2199 = 0;
        class398.field6067 = 0;
        class264.field3696 = 0;
        class163.field2137 = 0;
        class520.field7654 = 0;
        class420.field6394 = 0;
        field4800 = 0;
        class520.field7643 = 0;
        class109.field1538 = 0;
        class164.field2210 = 0;
        class229.field3250 = 0;
        class136.field1812 = 0;
        class222.field3088 = 0;
        class11.field183 = 0;
        class175.field2337 = 0;
        class258.field3602 = 0;
        class519.field7631 = 0;
        class431.field6558 = 0;
        class206.field2759 = 0;
        class405.field6135 = 0;
        class289.field4219 = 0;
        class268.field3733 = 0;
        class520.field7635 = 0;
        class258.field3623 = 0;
        class521.field7664 = 0;
        class206.field2780 = 0;
        class331.field5165 = 0;
        class528.field7736 = 0;
        class401.field6099 = 0;
        class164.field2194 = 0;
        class226.field3214 = 0;
        class241.field3387 = 0;
        field4714 = 0;
        class224.field3109 = 0;
        class113.field1573 = 0;
        class333.field5182 = 0;
        class147.field1955 = 0;
        class342.field5273 = 0;
        class513.field7538 = 0;
        class226.field3152 = 0;
        class89.field1284 = 0;
        class267.field3716 = 0;
        class222.field3097 = 0;
        class27.field397 = 0;
        class540.field7911 = 0;
        class141.field1876 = 0;
        class136.field1816 = 0;
        class63.field902 = 0;
        class311.field4533 = 0;
        class91.field1345 = 0;
        class38.field537 = 0;
        class281.field3981 = 0;
        class226.field3225 = 0;
        class278.field3942 = 0;
        class290.field4248 = 0;
        class88.field1273 = 0;
        field4698 = 0;
        class322.field4666 = 0;
        class354.field5471 = 0;
        class343.field5283 = 0;
        class38.field557 = 0;
        class200.field2692 = 0;
        class191.field2552 = 0;
        class322.field4672 = 0;
        class233.field3310 = 0;
        class155.field2021 = 0;
        class32.field467 = 0;
        class249.field3463 = 0;
        field4703 = 0;
        class428.field6492 = 0;
        class77.field1115 = 0;
        class294.field4289 = 0;
        class354.field5464 = 0;
        field4856 = 0;
        class310.field4523 = 0;
        class461.field6894 = 0;
        class170.field2292 = 0;
        class354.field5467 = 0;
        field4755 = 0;
        class295.field4300 = 0;
        class258.field3594 = 0;
        class459.field6875 = 0;
        class394.field6027 = 0;
        class20.field300 = 0;
        field4855 = 0;
        class226.field3121 = 0;
        class25.field357 = 0;
        class523.field7690 = 0;
        class147.field1947 = 0;
        class386.field5869 = 0;
        class189.field2522 = 0;
        class230.field3291 = 0;
        class294.field4292 = 0;
        class520.field7652 = 0;
        class163.field2138 = 0;
        class475.field7046 = 0;
        class47.field679 = 0;
        class498.field7342 = 0;
        class74.field1088 = 0;
        class249.field3466 = 0;
        class27.field391 = 0;
        class411.field6243 = 0;
        class170.field2291 = 0;
        class74.field1025 = 0;
        class213.field3019 = 0;
        class222.field3092 = 0;
        class429.field6514 = 0;
        field4864 = 0;
        class511.field7496 = 0;
        field4697 = 0;
        field4880 = 0;
        class502.field7408 = 0;
        class91.field1318 = 0;
        class69.field960 = 0;
        class540.field7908 = 0;
        class376.field5713 = 0;
        class503.field7420 = 0;
        class96.field1419 = 0;
        field4722 = 0;
        class337.field5223 = 0;
        class144.field1926 = 0;
        class213.field3010 = 0;
        class323.field4681 = 0;
        class222.field3102 = 0;
        class4.field27 = 0;
        class521.field7669 = 0;
        class275.field3860 = 0;
        class507.field7458 = 0;
        class361.field5532 = 0;
        class181.field2453 = 0;
        class125.field1686 = 0;
        class429.field6528 = 0;
        class55.field765 = 0;
        class345.field5320 = 0;
        class359.field5516 = 0;
        class380.field5783 = 0;
        class4.field26 = 0;
        class520.field7639 = 0;
        class370.field5639 = 0;
        class109.field1544 = 0;
        class181.field2438 = 0;
        class74.field1031 = 0;
        class230.field3301 = 0;
        class233.field3312 = 0;
        class289.field4224 = 0;
        class191.field2555 = 0;
        class530.field7762 = 0;
        class159.field2064 = 0;
        class310.field4513 = 0;
        class516.field7570 = 0;
        class172.field2321 = 0;
        class414.field6314 = 0;
        class337.field5219 = 0;
        class511.field7494 = 0;
        class534.field7847 = 0;
        class424.field6462 = 0;
        class41.field599 = 0;
        class447.field6718 = 0;
        class100.field1460 = 0;
        class387.field5883 = 0;
        field4852 = 0;
        class52.field716 = 0;
        class387.field5918 = 0;
        class316.field4599 = 0;
        class156.field2032 = 0;
        class348.field5373 = 0;
        class181.field2440 = 0;
        class81.field1143 = 0;
        class451.field6783 = 0;
        class101.field1467 = 0;
        class453.field6820 = 0;
        class407.field6180 = 0;
        class280.field3968 = 0;
        class342.field5279 = 0;
        class293.field4267 = 0;
        class120.field1647 = 0;
        field4876 = 0;
        class209.field2906 = 0;
        class164.field2212 = 0;
        class216.field3045 = 0;
        class427.field6488 = 0;
        class337.field5226 = 0;
        class204.field2723 = 0;
        class409.field6212 = 0;
        class286.field4193 = 0;
        class180.field2419 = 0;
        class147.field1948 = 0;
        class282.field4038 = 0;
        class257.field3546 = 0;
        class164.field2184 = 0;
        class489.field7225 = 0;
        class370.field5636 = 0;
        class44.field632 = 0;
        class134.field1802 = 0;
        class232.field3308 = 0;
        class164.field2186 = 0;
        class388.field5926 = 0;
        class230.field3284 = 0;
        class64.field914 = 0;
        class76.field1107 = 0;
        class441.field6640 = 0;
        class189.field2533 = 0;
        class298.field4386 = 0;
        class499.field7361 = 0;
        class411.field6234 = 0;
        class489.field7235 = 0;
        class337.field5233 = 0;
        class194.field2591 = 0;
        class540.field7909 = 0;
        class106.field1494 = 0;
        class330.field5143 = 0;
        class96.field1418 = 0;
        class389.field5945 = 0;
        class89.field1285 = 0;
        class52.field724 = 0;
        class85.field1244 = 0;
        class502.field7413 = 0;
        class91.field1346 = 0;
        class64.field911 = 0;
        class25.field364 = 0;
        field4779 = 0;
        class350.field5387 = 0;
        class445.field6690 = 0;
        class92.field1359 = 0;
        class528.field7732 = 0;
        class276.field3926 = 0;
        class447.field6696 = 0;
        class164.field2190 = 0;
        class28.field413 = 0;
        class391.field5965 = 0;
        class72.field1000 = 0;
        class226.field3168 = 0;
        class480.field7081 = 0;
        class54.field761 = 0;
        class168.field2258 = 0;
        class330.field5146 = 0;
        class293.field4284 = 0;
        field4851 = 0;
        class181.field2444 = 0;
        field4713 = 0;
        class33.field508 = 0;
        class233.field3317 = 0;
        class447.field6705 = 0;
        class159.field2067 = 0;
        class303.field4431 = 0;
        class206.field2778 = 0;
        class96.field1403 = 0;
        class176.field2352 = 0;
        class372.field5661 = 0;
        class258.field3629 = 0;
        class191.field2550 = 0;
        class335.field5208 = 0;
        class337.field5229 = 0;
        class519.field7622 = 0;
        class243.field3405 = 0;
        class248.field3456 = 0;
        class240.field3369 = 0;
        class139.field1853 = 0;
        class109.field1542 = 0;
        class181.field2454 = 0;
        field4871 = 0;
        class310.field4524 = 0;
        class351.field5424 = 0;
        class156.field2025 = 0;
        class70.field974 = 0;
        class38.field549 = 0;
        class373.field5682 = 0;
        class131.field1755 = 0;
        class282.field4024 = 0;
        class405.field6140 = 0;
        class361.field5537 = 0;
        class308.field4458 = 0;
        class31.field459 = 0;
        class321.field4649 = 0;
        class339.field5255 = 0;
        class164.field2170 = 0;
        class126.field1715 = 0;
        field4763 = 0;
        class17.field277 = 0;
        class420.field6386 = 0;
        class163.field2118 = 0;
        class191.field2560 = 0;
        field4728 = 0;
        class397.field6057 = 0;
        class56.field811 = 0;
        class164.field2154 = 0;
        class427.field6484 = 0;
        class451.field6769 = 0;
        class447.field6702 = 0;
        field4782 = 0;
        class84.field1222 = 0;
        class391.field5973 = 0;
        class159.field2056 = 0;
        class200.field2693 = 0;
        class376.field5730 = 0;
        class387.field5890 = 0;
        class530.field7775 = 0;
        class184.field2488 = 0;
        class195.field2604 = 0;
        class387.field5906 = 0;
        field4726 = 0;
        class376.field5704 = 0;
        class128.field1729 = 0;
        class241.field3383 = 0;
        class118.field1615 = 0;
        class376.field5714 = 0;
        class276.field3920 = 0;
        class390.field5950 = 0;
        class298.field4389 = 0;
        class293.field4277 = 0;
        class31.field462 = 0;
        class289.field4223 = 0;
        class486.field7198 = 0;
        class159.field2080 = 0;
        class81.field1176 = 0;
        class31.field458 = 0;
        class83.field1217 = 0;
        class417.field6360 = 0;
        class410.field6227 = 0;
        class324.field4682 = 0;
        class41.field597 = 0;
        class520.field7647 = 0;
        class239.field3366 = 0;
        class336.field5214 = 0;
        class60.field872 = 0;
        class164.field2215 = 0;
        class367.field5616 = 0;
        class96.field1410 = 0;
        class164.field2197 = 0;
        class503.field7421 = 0;
        class177.field2365 = 0;
        class106.field1491 = 0;
        field4764 = 0;
        class431.field6556 = 0;
        class342.field5275 = 0;
        class269.field3754 = 0;
        class125.field1696 = 0;
        class480.field7084 = 0;
        class423.field6451 = 0;
        class430.field6550 = 0;
        class226.field3136 = 0;
        class96.field1413 = 0;
        class240.field3372 = 0;
        class498.field7334 = 0;
        class233.field3315 = 0;
        class164.field2162 = 0;
        class387.field5884 = 0;
        class56.field805 = 0;
        class387.field5872 = 0;
        class332.field5171 = 0;
        class177.field2366 = 0;
        class25.field360 = 0;
        class209.field2912 = 0;
        class31.field454 = 0;
        class507.field7470 = 0;
        class343.field5284 = 0;
        class144.field1917 = 0;
        class226.field3213 = 0;
        class528.field7740 = 0;
        class29.field434 = 0;
        class259.field3648 = 0;
        class381.field5817 = 0;
        class365.field5605 = 0;
        class283.field4164 = 0;
        class354.field5461 = 0;
        field4716 = 0;
        class505.field7444 = 0;
        class136.field1808 = 0;
        class275.field3820 = 0;
        class478.field7074 = 0;
        class79.field1128 = 0;
        class463.field6928 = 0;
        class387.field5921 = 0;
        class416.field6333 = 0;
        class120.field1642 = 0;
        class322.field4661 = 0;
        field4868 = 0;
        class212.field3004 = 0;
        class191.field2548 = 0;
        class164.field2153 = 0;
        class52.field718 = 0;
        class184.field2497 = 0;
        class461.field6899 = 0;
        class55.field767 = 0;
        class377.field5761 = 0;
        class282.field4126 = 0;
        class482.field7112 = 0;
        class263.field3692 = 0;
        class145.field1928 = 0;
        class28.field409 = 0;
        class23.field339 = 0;
        class366.field5611 = 0;
        class316.field4594 = 0;
        class140.field1872 = 0;
        class428.field6496 = 0;
        class346.field5339 = 0;
        class520.field7645 = 0;
        class222.field3106 = 0;
        class374.field5684 = 0;
        class282.field4067 = 0;
        class17.field275 = 0;
        class48.field689 = 0;
        class226.field3204 = 0;
        class109.field1532 = 0;
        class53.field747 = 0;
        class300.field4405 = 0;
        class528.field7744 = 0;
        class114.field1583 = 0;
        class530.field7781 = 0;
        field4737 = 0;
        class180.field2413 = 0;
        class71.field993 = 0;
        class375.field5698 = 0;
        class206.field2747 = 0;
        class535.field7856 = 0;
        class181.field2447 = 0;
        field4883 = 0;
        class67.field949 = 0;
        class209.field2967 = 0;
        class496.field7318 = 0;
        class47.field667 = 0;
        class369.field5632 = 0;
        class233.field3316 = 0;
        class177.field2359 = 0;
        class451.field6773 = 0;
        class150.field1969 = 0;
        class56.field817 = 0;
        class41.field613 = 0;
        class410.field6223 = 0;
        class174.field2333 = 0;
        class102.field1479 = 0;
        class243.field3412 = 0;
        class420.field6388 = 0;
        class201.field2706 = 0;
        class298.field4395 = 0;
        class155.field2017 = 0;
        class259.field3663 = 0;
        class337.field5230 = 0;
        class376.field5727 = 0;
        class345.field5314 = 0;
        class417.field6359 = 0;
        class380.field5778 = 0;
        field4773 = 0;
        class191.field2579 = 0;
        class4.field29 = 0;
        class530.field7792 = 0;
        class268.field3725 = 0;
        class273.field3792 = 0;
        class383.field5825 = 0;
        class416.field6323 = 0;
        class398.field6062 = 0;
        class85.field1241 = 0;
        class211.field2987 = 0;
        client.field2667 = 0;
        class17.field293 = 0;
        class359.field5519 = 0;
        class351.field5415 = 0;
        class191.field2582 = 0;
        class137.field1822 = 0;
        class534.field7849 = 0;
        class57.field829 = 0;
        class57.field830 = 0;
        class201.field2708 = 0;
        class125.field1690 = 0;
        class226.field3142 = 0;
        class144.field1920 = 0;
        class418.field6374 = 0;
        client.field2658 = 0;
        class268.field3732 = 0;
        field4774 = 0;
        class290.field4244 = 0;
        class427.field6486 = 0;
        class357.field5505 = 0;
        class200.field2691 = 0;
        field4816 = 0;
        field4695 = 0;
        class429.field6524 = 0;
        class107.field1508 = 0;
        class236.field3335 = 0;
        class251.field3488 = 0;
        class41.field609 = 0;
        class177.field2362 = 0;
        class523.field7688 = 0;
        class26.field372 = 0;
        class424.field6465 = 0;
        field4702 = 0;
        class367.field5615 = 0;
        class96.field1426 = 0;
        class362.field5562 = 0;
        class391.field5981 = 0;
        class309.field4495 = 0;
        class431.field6565 = 0;
        class164.field2195 = 0;
        class412.field6267 = 0;
        class116.field1597 = 0;
        class416.field6350 = 0;
        class392.field5990 = 0;
        class5.field42 = 0;
        class482.field7119 = 0;
        class498.field7348 = 0;
        class536.field7868 = 0;
        class44.field635 = 0;
        class354.field5470 = 0;
        class226.field3124 = 0;
        class478.field7076 = 0;
        class425.field6475 = 0;
        client.field2664 = 0;
        class366.field5610 = 0;
        class282.field4123 = 0;
        class530.field7787 = 0;
        class278.field3945 = 0;
        class212.field2997 = 0;
        class275.field3835 = 0;
        class385.field5838 = 0;
        class273.field3794 = 0;
        class230.field3302 = 0;
        field4845 = 0;
        class281.field3980 = 0;
        class206.field2745 = 0;
        class412.field6259 = 0;
        class492.field7260 = 0;
        class20.field306 = 0;
        class74.field1024 = 0;
        class530.field7776 = 0;
        class385.field5841 = 0;
        class131.field1753 = 0;
        field4736 = 0;
        class215.field3037 = 0;
        class360.field5525 = 0;
        class387.field5920 = 0;
        class521.field7678 = 0;
        class101.field1463 = 0;
        class429.field6518 = 0;
        class283.field4161 = 0;
        class539.field7900 = 0;
        class45.field645 = 0;
        class393.field6012 = 0;
        class416.field6331 = 0;
        class523.field7691 = 0;
        class194.field2587 = 0;
        client.field2659 = 0;
        class70.field978 = 0;
        class47.field665 = 0;
        class465.field6932 = 0;
        class312.field4568 = 0;
        field4847 = 0;
        class226.field3137 = 0;
        class67.field954 = 0;
        class416.field6338 = 0;
        class271.field3765 = 0;
        class249.field3471 = 0;
        class288.field4213 = 0;
        class281.field3985 = 0;
        class159.field2069 = 0;
        class74.field1021 = 0;
        class391.field5970 = 0;
        class47.field666 = 0;
        class268.field3731 = 0;
        class212.field2994 = 0;
        class57.field827 = 0;
        class206.field2767 = 0;
        class109.field1529 = 0;
        class82.field1197 = 0;
        class416.field6328 = 0;
        class82.field1187 = 0;
        class181.field2436 = 0;
        class206.field2776 = 0;
        class45.field646 = 0;
        class194.field2593 = 0;
        class538.field7888 = 0;
        class467.field6995 = 0;
        class21.field318 = 0;
        class63.field899 = 0;
        class334.field5194 = 0;
        class343.field5281 = 0;
        field4709 = 0;
        class329.field5128 = 0;
        class191.field2572 = 0;
        field4756 = 0;
        class353.field5449 = 0;
        class348.field5376 = 0;
        class140.field1859 = 0;
        class307.field4448 = 0;
        class73.field1007 = 0;
        class22.field330 = 0;
        field4858 = 0;
        class424.field6455 = 0;
        class516.field7578 = 0;
        class9.field171 = 0;
        class405.field6148 = 0;
        class319.field4625 = 0;
        class21.field321 = 0;
        class309.field4479 = 0;
        field4721 = 0;
        class329.field5121 = 0;
        field4761 = 0;
        class353.field5457 = 0;
        class147.field1956 = 0;
        class110.field1553 = 0;
        class222.field3098 = 0;
        class159.field2079 = 0;
        class293.field4278 = 0;
        field4791 = 0;
        class485.field7141 = 0;
        class474.field7038 = 0;
        class391.field5977 = 0;
        class127.field1722 = 0;
        class429.field6529 = 0;
        class89.field1282 = 0;
        class164.field2192 = 0;
        class275.field3819 = 0;
        field4769 = 0;
        class525.field7710 = 0;
        class253.field3518 = 0;
        class275.field3823 = 0;
        class84.field1225 = 0;
        class91.field1321 = 0;
        class226.field3222 = 0;
        class127.field1718 = 0;
        class11.field187 = 0;
        class27.field390 = 0;
        class377.field5763 = 0;
        class170.field2296 = 0;
        class226.field3138 = 0;
        class353.field5453 = 0;
        class21.field316 = 0;
        field4872 = 0;
        class92.field1363 = 0;
        class164.field2182 = 0;
        class63.field896 = 0;
        class530.field7789 = 0;
        class355.field5486 = 0;
        class360.field5528 = 0;
        class17.field287 = 0;
        class43.field618 = 0;
        class445.field6680 = 0;
        class313.field4575 = 0;
        field4723 = 0;
        class343.field5296 = 0;
        class330.field5142 = 0;
        class109.field1535 = 0;
        class159.field2072 = 0;
        class226.field3127 = 0;
        class447.field6704 = 0;
        class164.field2161 = 0;
        class420.field6403 = 0;
        class46.field653 = 0;
        class521.field7674 = 0;
        client.field2674 = 0;
        class388.field5930 = 0;
        class41.field601 = 0;
        class441.field6649 = 0;
        class470.field7015 = 0;
        class86.field1250 = 0;
        class311.field4544 = 0;
        class194.field2598 = 0;
        class84.field1224 = 0;
        class208.field2876 = 0;
        class400.field6086 = 0;
        class230.field3288 = 0;
        class361.field5552 = 0;
        class456.field6847 = 0;
        class340.field5265 = 0;
        class279.field3958 = 0;
        class164.field2179 = 0;
        class159.field2058 = 0;
        class352.field5438 = 0;
        class226.field3217 = 0;
        class200.field2701 = 0;
        class141.field1883 = 0;
        class498.field7343 = 0;
        class410.field6232 = 0;
        class436.field6601 = 0;
        class311.field4526 = 0;
        class103.field1490 = 0;
        class44.field629 = 0;
        class63.field892 = 0;
        class145.field1927 = 0;
        class181.field2448 = 0;
        class258.field3581 = 0;
        class296.field4362 = 0;
        class180.field2417 = 0;
        class447.field6716 = 0;
        class301.field4415 = 0;
        class397.field6056 = 0;
        class439.field6621 = 0;
        class13.field249 = 0;
        class279.field3959 = 0;
        class88.field1267 = 0;
        class376.field5753 = 0;
        class535.field7859 = 0;
        class113.field1575 = 0;
        class353.field5455 = 0;
        class523.field7693 = 0;
        class475.field7058 = 0;
        class453.field6824 = 0;
        class89.field1279 = 0;
        class109.field1541 = 0;
        class226.field3206 = 0;
        class189.field2532 = 0;
        class49.field697 = 0;
        class480.field7083 = 0;
        class278.field3946 = 0;
        class267.field3714 = 0;
        class311.field4531 = 0;
        class395.field6035 = 0;
        field4731 = 0;
        client.field2669 = 0;
        class391.field5968 = 0;
        class53.field743 = 0;
        class298.field4385 = 0;
        class110.field1552 = 0;
        class321.field4642 = 0;
        class154.field2010 = 0;
        class258.field3608 = 0;
        class263.field3687 = 0;
        class428.field6497 = 0;
        class429.field6520 = 0;
        class269.field3750 = 0;
        class92.field1353 = 0;
        class64.field920 = 0;
        class374.field5685 = 0;
        field4843 = 0;
        class38.field562 = 0;
        class377.field5759 = 0;
        class25.field356 = 0;
        class170.field2299 = 0;
        class507.field7459 = 0;
        class200.field2702 = 0;
        class147.field1950 = 0;
        field4759 = 0;
        class530.field7763 = 0;
        class134.field1796 = 0;
        class263.field3691 = 0;
        class334.field5189 = 0;
        class319.field4621 = 0;
        field4826 = 0;
        class311.field4534 = 0;
        class337.field5220 = 0;
        class330.field5151 = 0;
        class536.field7866 = 0;
        class514.field7548 = 0;
        class490.field7239 = 0;
        class516.field7594 = 0;
        class273.field3786 = 0;
        class407.field6171 = 0;
        class66.field946 = 0;
        class380.field5785 = 0;
        class8.field155 = 0;
        class63.field893 = 0;
        class200.field2699 = 0;
        class322.field4673 = 0;
        class259.field3659 = 0;
        class351.field5407 = 0;
        class236.field3334 = 0;
        class489.field7234 = 0;
        class89.field1292 = 0;
        class322.field4656 = 0;
        class516.field7590 = 0;
        class164.field2166 = 0;
        class489.field7236 = 0;
        class164.field2163 = 0;
        class328.field5102 = 0;
        class377.field5762 = 0;
        class109.field1545 = 0;
        class164.field2177 = 0;
        class421.field6408 = 0;
        class278.field3949 = 0;
        class337.field5221 = 0;
        class454.field6831 = 0;
        class191.field2558 = 0;
        class136.field1814 = 0;
        class69.field968 = 0;
        class311.field4528 = 0;
        class203.field2713 = 0;
        class182.field2473 = 0;
        class26.field376 = 0;
        class226.field3146 = 0;
        class533.field7833 = 0;
        class63.field897 = 0;
        class458.field6860 = 0;
        class146.field1943 = 0;
        class400.field6098 = 0;
        class163.field2126 = 0;
        class165.field2232 = 0;
        class56.field808 = 0;
        class182.field2457 = 0;
        class142.field1895 = 0;
        class200.field2700 = 0;
        class83.field1211 = 0;
        class206.field2768 = 0;
        class204.field2722 = 0;
        class530.field7786 = 0;
        class454.field6828 = 0;
        field4788 = 0;
        class416.field6344 = 0;
        class441.field6651 = 0;
        class86.field1247 = 0;
        class226.field3185 = 0;
        class516.field7577 = 0;
        class159.field2071 = 0;
        class381.field5798 = 0;
        class293.field4271 = 0;
        class364.field5588 = 0;
        class395.field6049 = 0;
        field4813 = 0;
        class126.field1710 = 0;
        class164.field2188 = 0;
        class467.field6958 = 0;
        class163.field2135 = 0;
        class37.field530 = 0;
        class250.field3477 = 0;
        class540.field7912 = 0;
        class189.field2524 = 0;
        class451.field6768 = 0;
        class423.field6447 = 0;
        field4804 = 0;
        class206.field2786 = 0;
        class320.field4635 = 0;
        field4778 = 0;
        class56.field821 = 0;
        class332.field5173 = 0;
        field4784 = 0;
        class384.field5836 = 0;
        class451.field6766 = 0;
        class76.field1105 = 0;
        class361.field5554 = 0;
        class377.field5757 = 0;
        class533.field7831 = 0;
        class5.field34 = 0;
        class335.field5206 = 0;
        class463.field6919 = 0;
        field4796 = 0;
        class387.field5916 = 0;
        class126.field1713 = 0;
        class410.field6225 = 0;
        class55.field781 = 0;
        class181.field2431 = 0;
        class372.field5671 = 0;
        class181.field2442 = 0;
        class138.field1837 = 0;
        class206.field2795 = 0;
        class516.field7588 = 0;
        class66.field945 = 0;
        class329.field5127 = 0;
        class354.field5469 = 0;
        class273.field3797 = 0;
        class467.field6972 = 0;
        class382.field5823 = 0;
        class398.field6066 = 0;
        class276.field3934 = 0;
        class437.field6611 = 0;
        class400.field6084 = 0;
        class107.field1502 = 0;
        class163.field2125 = 0;
        class362.field5569 = 0;
        class493.field7271 = 0;
        class164.field2214 = 0;
        class467.field6968 = 0;
        class530.field7764 = 0;
        class29.field422 = 0;
        class41.field595 = 0;
        field4873 = 0;
        class62.field882 = 0;
        class485.field7170 = 0;
        class206.field2790 = 0;
        class164.field2155 = 0;
        class322.field4657 = 0;
        class120.field1641 = 0;
        field4795 = 0;
        field4775 = 0;
        class489.field7228 = 0;
        class460.field6886 = 0;
        class362.field5560 = 0;
        class33.field498 = 0;
        class361.field5533 = 0;
        class376.field5723 = 0;
        class451.field6785 = 0;
        class448.field6740 = 0;
        class164.field2203 = 0;
        class351.field5428 = 0;
        class452.field6789 = 0;
        class131.field1752 = 0;
        class330.field5155 = 0;
        class164.field2209 = 0;
        class416.field6345 = 0;
        class74.field1083 = 0;
        class352.field5446 = 0;
        class436.field6602 = 0;
        class301.field4417 = 0;
        class324.field4688 = 0;
        class418.field6378 = 0;
        class114.field1581 = 0;
        class11.field186 = 0;
        class337.field5228 = 0;
        class37.field531 = 0;
        class273.field3789 = 0;
        class206.field2761 = 0;
        field4689 = 0;
        class165.field2231 = 0;
        class416.field6337 = 0;
        class91.field1342 = 0;
        class497.field7332 = 0;
        field4780 = 0;
        class164.field2198 = 0;
        class385.field5857 = 0;
        class151.field1979 = 0;
        class206.field2801 = 0;
        class348.field5374 = 0;
        class275.field3902 = 0;
        class170.field2305 = 0;
        class502.field7411 = 0;
        class165.field2236 = 0;
        class467.field6984 = 0;
        field4865 = 0;
        field4747 = 0;
        field4758 = 0;
        class261.field3677 = 0;
        class4.field21 = 0;
        class424.field6456 = 0;
        client.field2671 = 0;
        class206.field2764 = 0;
        class69.field967 = 0;
        class303.field4429 = 0;
        class538.field7889 = 0;
        field4844 = 0;
        class345.field5330 = 0;
        class344.field5311 = 0;
        class342.field5277 = 0;
        class360.field5529 = 0;
        class13.field259 = 0;
        class88.field1263 = 0;
        class467.field6978 = 0;
        class459.field6877 = 0;
        class407.field6173 = 0;
        field4849 = 0;
        class230.field3298 = 0;
        field4806 = 0;
        client.field2666 = 0;
        class109.field1526 = 0;
        class206.field2770 = 0;
        field4877 = 0;
        class155.field2018 = 0;
        class41.field590 = 0;
        class10.field178 = 0;
        class88.field1274 = 0;
        class387.field5889 = 0;
        class70.field979 = 0;
        class163.field2145 = 0;
        class45.field642 = 0;
        class160.field2084 = 0;
        class70.field976 = 0;
        class258.field3591 = 0;
        class447.field6703 = 0;
        class94.field1375 = 0;
        class310.field4520 = 0;
        class374.field5689 = 0;
        class518.field7617 = 0;
        class405.field6131 = 0;
        class24.field344 = 0;
        class179.field2395 = 0;
        class530.field7769 = 0;
        class70.field977 = 0;
        class259.field3635 = 0;
        class380.field5790 = 0;
        class75.field1102 = 0;
        class320.field4634 = 0;
        class206.field2750 = 0;
        class164.field2196 = 0;
        class311.field4551 = 0;
        class163.field2121 = 0;
        class10.field175 = 0;
        class268.field3724 = 0;
        class482.field7117 = 0;
        class249.field3461 = 0;
        class292.field4262 = 0;
        class182.field2462 = 0;
        class156.field2031 = 0;
        class80.field1137 = 0;
        class65.field934 = 0;
        class395.field6039 = 0;
        class94.field1374 = 0;
        class191.field2549 = 0;
        class323.field4675 = 0;
        class301.field4419 = 0;
        class212.field3005 = 0;
        class57.field828 = 0;
        class240.field3370 = 0;
        class451.field6782 = 0;
        class63.field900 = 0;
        class501.field7393 = 0;
        class271.field3762 = 0;
        class530.field7773 = 0;
        field4719 = 0;
        class96.field1398 = 0;
        class370.field5637 = 0;
        class516.field7579 = 0;
        class245.field3444 = 0;
        class410.field6222 = 0;
        class209.field2894 = 0;
        class427.field6489 = 0;
        class515.field7557 = 0;
        class216.field3049 = 0;
        class251.field3490 = 0;
        class516.field7589 = 0;
        class181.field2437 = 0;
        class11.field198 = 0;
        class343.field5299 = 0;
        class191.field2566 = 0;
        class475.field7045 = 0;
        class137.field1824 = 0;
        class410.field6219 = 0;
        class361.field5550 = 0;
        class533.field7838 = 0;
        class101.field1473 = 0;
        class397.field6060 = 0;
        class113.field1577 = 0;
        class180.field2416 = 0;
        class251.field3493 = 0;
        class428.field6498 = 0;
        class343.field5300 = 0;
        class56.field803 = 0;
        class322.field4671 = 0;
        class339.field5249 = 0;
        class447.field6715 = 0;
        class520.field7641 = 0;
        class41.field592 = 0;
        class156.field2027 = 0;
        class365.field5596 = 0;
        class381.field5795 = 0;
        class355.field5492 = 0;
        class183.field2486 = 0;
        class498.field7341 = 0;
        class331.field5164 = 0;
        field4733 = 0;
        class457.field6856 = 0;
        class532.field7817 = 0;
        class310.field4509 = 0;
        class164.field2222 = 0;
        class498.field7337 = 0;
        class530.field7766 = 0;
        class506.field7453 = 0;
        class336.field5217 = 0;
        class10.field176 = 0;
        class505.field7443 = 0;
        class498.field7344 = 0;
        class113.field1571 = 0;
        class357.field5499 = 0;
        class487.field7213 = 0;
        class206.field2744 = 0;
        class448.field6741 = 0;
        class420.field6404 = 0;
        class527.field7725 = 0;
        class482.field7116 = 0;
        class38.field539 = 0;
        class283.field4159 = 0;
        class272.field3773 = 0;
        class74.field1062 = 0;
        class412.field6262 = 0;
        class164.field2207 = 0;
        class71.field990 = 0;
        class448.field6738 = 0;
        class74.field1041 = 0;
        class180.field2420 = 0;
        class233.field3314 = 0;
        class542.field7923 = 0;
        class268.field3728 = 0;
        class195.field2612 = 0;
        class200.field2684 = 0;
        class206.field2752 = 0;
        class194.field2590 = 0;
        class200.field2689 = 0;
        class417.field6361 = 0;
        class359.field5508 = 0;
        class499.field7353 = 0;
        class282.field4017 = 0;
        class229.field3260 = 0;
        class191.field2581 = 0;
        class404.field6130 = 0;
        class298.field4392 = 0;
        class195.field2610 = 0;
        class226.field3192 = 0;
        class463.field6921 = 0;
        class109.field1527 = 0;
        class375.field5699 = 0;
        class366.field5612 = 0;
        class244.field3414 = 0;
        class182.field2470 = 0;
        field4768 = 0;
        class447.field6708 = 0;
        class226.field3171 = 0;
        class533.field7844 = 0;
        class529.field7755 = 0;
        class398.field6065 = 0;
        class281.field3976 = 0;
        class466.field6954 = 0;
        class308.field4462 = 0;
        class498.field7352 = 0;
        class530.field7772 = 0;
        class388.field5928 = 0;
        class273.field3805 = 0;
        class164.field2200 = 0;
        class405.field6137 = 0;
        class71.field989 = 0;
        class207.field2817 = 0;
        class410.field6218 = 0;
        class60.field867 = 0;
        class189.field2535 = 0;
        class89.field1293 = 0;
        class487.field7216 = 0;
        class436.field6600 = 0;
        class420.field6390 = 0;
        class186.field2506 = 0;
        class73.field1003 = 0;
        class164.field2218 = 0;
        class272.field3778 = 0;
        class275.field3838 = 0;
        class380.field5789 = 0;
        field4808 = 0;
        class520.field7646 = 0;
        class322.field4668 = 0;
        class268.field3730 = 0;
        class418.field6377 = 0;
        class17.field285 = 0;
        class411.field6237 = 0;
        class29.field440 = 0;
        class530.field7791 = 0;
        class301.field4418 = 0;
        class251.field3491 = 0;
        class209.field2940 = 0;
        class248.field3459 = 0;
        class336.field5210 = 0;
        class164.field2152 = 0;
        field4833 = 0;
        class333.field5185 = 0;
        class163.field2141 = 0;
        field4866 = 0;
        class521.field7675 = 0;
        class17.field273 = 0;
        class300.field4408 = 0;
        class251.field3489 = 0;
        class387.field5907 = 0;
        class311.field4553 = 0;
        class206.field2793 = 0;
        class191.field2544 = 0;
        class106.field1493 = 0;
        class83.field1215 = 0;
        class376.field5711 = 0;
        class429.field6510 = 0;
        class431.field6559 = 0;
        class168.field2270 = 0;
        class263.field3686 = 0;
        class221.field3083 = 0;
        class538.field7891 = 0;
        class522.field7679 = 0;
        class510.field7493 = 0;
        class2.field13 = 0;
        class226.field3184 = 0;
        class520.field7648 = 0;
        class40.field589 = 0;
        class181.field2432 = 0;
        class71.field994 = 0;
        class96.field1424 = 0;
        class410.field6216 = 0;
        class226.field3149 = 0;
        class467.field6962 = 0;
        class141.field1877 = 0;
        class66.field942 = 0;
        class182.field2471 = 0;
        class159.field2082 = 0;
        class425.field6468 = 0;
        class52.field730 = 0;
        class164.field2180 = 0;
        class516.field7576 = 0;
        class508.field7474 = 0;
        class498.field7347 = 0;
        class384.field5837 = 0;
        class201.field2709 = 0;
        class17.field283 = 0;
        class74.field1069 = 0;
        class209.field2902 = 0;
        class163.field2128 = 0;
        class208.field2883 = 0;
        class191.field2546 = 0;
        class170.field2293 = 0;
        class47.field668 = 0;
        class109.field1530 = 0;
        class199.field2651 = 0;
        class134.field1791 = 0;
        class276.field3935 = 0;
        class422.field6445 = 0;
        field4862 = 0;
        class416.field6327 = 0;
        class103.field1488 = 0;
        class423.field6448 = 0;
        class164.field2193 = 0;
        class21.field319 = 0;
        class340.field5260 = 0;
        class229.field3254 = 0;
        class272.field3774 = 0;
        class25.field365 = 0;
        class451.field6778 = 0;
        class355.field5494 = 0;
        class369.field5634 = 0;
        class213.field3018 = 0;
        class44.field633 = 0;
        class60.field861 = 0;
        class96.field1422 = 0;
        class376.field5739 = 0;
        class259.field3646 = 0;
        class191.field2575 = 0;
        class429.field6512 = 0;
        class376.field5728 = 0;
        class211.field2985 = 0;
        class279.field3961 = 0;
        class420.field6401 = 0;
        class516.field7572 = 0;
        field4792 = 0;
        class243.field3406 = 0;
        class168.field2256 = 0;
        class79.field1130 = 0;
        class151.field1978 = 0;
        field4830 = 0;
        class376.field5706 = 0;
        class425.field6477 = 0;
        class226.field3187 = 0;
        class26.field371 = 0;
        class348.field5370 = 0;
        class56.field819 = 0;
        class209.field2918 = 0;
        class140.field1864 = 0;
        class230.field3297 = 0;
        class421.field6410 = 0;
        field4819 = 0;
        class100.field1461 = 0;
        class445.field6689 = 0;
        class486.field7195 = 0;
        class41.field610 = 0;
        class141.field1887 = 0;
        class33.field509 = 0;
        class47.field680 = 0;
        field4783 = 0;
        class507.field7468 = 0;
        class191.field2571 = 0;
        class141.field1879 = 0;
        class257.field3553 = 0;
        class400.field6088 = 0;
        class429.field6527 = 0;
        client.field2668 = 0;
        client.field2663 = 0;
        class315.field4583 = 0;
        class391.field5963 = 0;
        field4705 = 0;
        field4781 = 0;
        class226.field3199 = 0;
        class41.field598 = 0;
        field4839 = 0;
        class83.field1213 = 0;
        class36.field522 = 0;
        class282.field3986 = 0;
        class475.field7060 = 0;
        class452.field6794 = 0;
        class264.field3698 = 0;
        class416.field6321 = 0;
        class17.field279 = 0;
        class385.field5839 = 0;
        class164.field2171 = 0;
        class43.field628 = 0;
        class447.field6722 = 0;
        class395.field6046 = 0;
        class33.field488 = 0;
        class52.field725 = 0;
        class387.field5881 = 0;
        field4823 = 0;
        field4859 = 0;
        class521.field7666 = 0;
        class17.field292 = 0;
        class259.field3655 = 0;
        class92.field1367 = 0;
        class164.field2160 = 0;
        field4751 = 0;
        class529.field7749 = 0;
        class411.field6235 = 0;
        class272.field3779 = 0;
        class56.field810 = 0;
        class247.field3451 = 0;
        class261.field3679 = 0;
        class475.field7053 = 0;
        class273.field3798 = 0;
        field4732 = 0;
        class82.field1204 = 0;
        class411.field6241 = 0;
        class187.field2509 = 0;
        class392.field5996 = 0;
        class141.field1878 = 0;
        class320.field4637 = 0;
        class263.field3695 = 0;
        class347.field5357 = 0;
        field4831 = 0;
        field4822 = 0;
        class282.field4138 = 0;
        class45.field647 = 0;
        class306.field4444 = 0;
        class159.field2060 = 0;
        class344.field5310 = 0;
        class333.field5183 = 0;
        class200.field2696 = 0;
        class268.field3720 = 0;
        class163.field2131 = 0;
        class1.field4 = 0;
        class163.field2143 = 0;
        class538.field7880 = 0;
        class259.field3641 = 0;
        class205.field2734 = 0;
        class67.field950 = 0;
        class416.field6335 = 0;
        field4762 = 0;
        class381.field5819 = 0;
        class527.field7724 = 0;
        class301.field4421 = 0;
        class409.field6205 = 0;
        class7.field150 = 0;
        class372.field5664 = 0;
        field4853 = 0;
        field4850 = 0;
        class52.field717 = 0;
        class487.field7209 = 0;
        class516.field7571 = 0;
        class530.field7778 = 0;
        class129.field1743 = 0;
        class355.field5487 = 0;
        class435.field6595 = 0;
        class386.field5867 = 0;
        class17.field272 = 0;
        class41.field593 = 0;
        field4863 = 0;
        field4842 = 0;
        field4692 = 0;
        class451.field6772 = 0;
        class4.field28 = 0;
        class38.field560 = 0;
        class475.field7054 = 0;
        field4869 = 0;
        class345.field5326 = 0;
        class43.field623 = 0;
        class170.field2297 = 0;
        class347.field5351 = 0;
        class486.field7205 = 0;
        class311.field4529 = 0;
        field4748 = 0;
        class465.field6929 = 0;
        class65.field931 = 0;
        class64.field926 = 0;
        class381.field5812 = 0;
        class414.field6309 = 0;
        class406.field6161 = 0;
        class289.field4216 = 0;
        class81.field1160 = 0;
        class131.field1751 = 0;
        class244.field3423 = 0;
        field4706 = 0;
        class144.field1923 = 0;
        class465.field6934 = 0;
        field4860 = 0;
        class165.field2227 = 0;
        class498.field7340 = 0;
        class226.field3156 = 0;
        class406.field6157 = 0;
        class89.field1291 = 0;
        class11.field206 = 0;
        class226.field3181 = 0;
        class380.field5774 = 0;
        class515.field7558 = 0;
        field4700 = 0;
        class206.field2760 = 0;
        class9.field172 = 0;
        class240.field3374 = 0;
        field4739 = 0;
        class38.field575 = 0;
        class376.field5751 = 0;
        class457.field6851 = 0;
        class451.field6784 = 0;
        class73.field1012 = 0;
        class206.field2802 = 0;
        class180.field2430 = 0;
        class206.field2743 = 0;
        class539.field7899 = 0;
        class429.field6516 = 0;
        class376.field5725 = true;
        class519.field7632 = true;
        class485.method2908(false);
        for (int var2 = 0; ~class361.field5531.length < ~var2; ++var2) {
            class361.field5531[var2] = null;
        }
        class44.field641 = false;
        class259.method1671(50);
        class514.field7549 = (int) (30.0D * Math.random()) - 20;
        class147.field1957 = (int) (Math.random() * 80.0D) - 40;
        class53.field744 = (float) (16383 & (int) (Math.random() * 160.0D) + -80);
        class303.field4433 = -60 + (int) (120.0D * Math.random());
        class434.field6591 = (int) (110.0D * Math.random()) - 55;
        class76.field1109 = -50 + (int) (Math.random() * 100.0D);
        class292.method1865((byte) 97);
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class241.field3398[var3] = null;
        }
        class333.field5187 = 0;
        class515.field7566 = 0;
        class406.field6158.method1745(-75);
        client.field2679.method450((byte) 73);
        class422.field6436.method450((byte) 73);
        class145.field1931.method3046(101);
        class392.field6005.method1745(-53);
        class460.field6887 = new class63();
        class288.field4208.method569(43);
        class352.method2262(-4);
        class360.field5524 = 0;
        class503.field7423 = 0;
        class350.field5391 = 0;
        class507.field7462 = 0;
        class388.field5936 = 0;
        class174.field2332 = 0;
        class425.field6474 = 0;
        class24.field355 = 0;
        class486.field7194 = 0;
        class354.field5477 = 0;
        for (int var4 = 0; ~var4 > ~class331.field5170.length; ++var4) {
            if (!class534.field7852[var4]) {
                class331.field5170[var4] = -1;
            }
        }
        if (class337.field5232 != -1) {
            class138.method927((byte) 80, class337.field5232);
        }
        for (class436 var5 = (class436) class312.field4570.method1743(false); var5 != null; var5 = (class436) class312.field4570.method1742(-100)) {
            if (!var5.method24(-25618)) {
                var5 = (class436) class312.field4570.method1743(false);
                if (var5 == null) {
                    break;
                }
            }
            class486.method2910(var5, false, true, 0);
        }
        class337.field5232 = -1;
        class312.field4570 = new class272(8);
        class313.method1973((byte) 81);
        class201.field2705 = null;
        for (int var6 = 0; ~var6 > -9; ++var6) {
            class428.field6500[var6] = null;
            class416.field6341[var6] = false;
            class418.field6373[var6] = -1;
        }
        class458.method2778(-124);
        class215.field3039 = true;
        for (int var7 = 0; var7 < 100; ++var7) {
            class430.field6553[var7] = true;
        }
        for (int var8 = 0; var8 < 6; ++var8) {
            class446.field6691[var8] = new class212();
        }
        for (int var9 = 0; ~var9 > -26; ++var9) {
            class166.field2251[var9] = 0;
            class213.field3023[var9] = 0;
            class451.field6774[var9] = 0;
        }
        class173.method1171((byte) -32);
        class508.field7475 = true;
        class88.field1275 = class52.field720 = class280.field3973 = class490.field7244 = new short[256];
        class179.field2410 = class147.field1960.method2705((byte) 69, class257.field3556);
        class203.field2716.field20 = false;
        class508.field7476 = 0;
        class203.field2716.field32 = false;
        class513.method3064(0);
        class365.method2331(true);
        class515.field7569 = 0L;
        class203.field2719 = null;
        class315.field4587.field2559 = 2;
    }

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "()V", line = 4412)
    public final void method817() {
        ++field4875;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ln;)V", line = 4421)
    public final void method821(class14 arg0) {
        ++field4738;
        this.field4935 = (class416) arg0;
        this.field4986.method2553(this.field4935, 21394);
        if (this.field5017 != 1) {
            this.method2035(false);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIBI)V", line = 4438)
    public final void method2044(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 64) {
            OpenGL.glTexEnvi(8960, arg0 + 34184, arg3);
            ++field4699;
            OpenGL.glTexEnvi(8960, arg0 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([IIIII)Laa;", line = 4450)
    public final class341 method767(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4812;
        return new class351(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V", line = 4458)
    public final void method2045(int arg0, int arg1) {
        if (arg0 != 34023) {
            this.method2036((byte) -76, -39, true, (NativeBuffer) null, 95);
        }
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method2030(8448, 8448, (byte) 71);
            } else if (~arg1 != -3) {
                if (arg1 != 3) {
                    if (~arg1 == -5) {
                        this.method2030(34023, 34023, (byte) 71);
                    }
                } else {
                    this.method2030(260, 8448, (byte) 71);
                }
            } else {
                this.method2030(34165, 7681, (byte) 71);
            }
        } else {
            this.method2030(7681, 7681, (byte) 71);
        }
        ++field4871;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(II)V", line = 4489)
    public final synchronized void method2046(int arg0, int arg1) {
        ++field4755;
        class5 var3 = new class5();
        var3.field35 = (long) arg0;
        this.field4916.method453((byte) 127, var3);
        if (arg1 != 0) {
            this.method763();
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIII)V", line = 4503)
    public final void method762(int arg0, int arg1, int arg2, int arg3) {
        this.field4918 = arg2;
        ++field4696;
        this.field4937 = arg3;
        this.field5014 = arg1;
        this.field5021 = arg0;
        this.method2027((byte) -40);
        this.method2057(0);
        if (this.field5017 != 3) {
            if (this.field5017 == 2) {
                this.method2089(0);
                return;
            }
        } else {
            this.method2061(16098);
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(Z)V", line = 4528)
    public final void method843(boolean arg0) {
        ++field4799;
    }

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "(B)V", line = 4541)
    private final void method2047(byte arg0) {
        ++field4778;
        int var2 = 0;
        while (!this.field4881.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class388.method2433(1000L, -117);
        }
        if (arg0 < 31) {
            this.method807((class334[]) null, (class137) null, (class14) null, (class302[]) null, 61);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([BIIZI)Lms;", line = 4564)
    public final class541 method2048(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4872;
        if (arg2 != -1) {
            this.field4976 = null;
        }
        return (class541) (!this.field4952 || arg3 && !this.field5026 ? new class503(this, arg4, arg0, arg1) : new class66(this, arg4, arg0, arg1, arg3));
    }

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "(IIII)V", line = 4582)
    public final void method830(int arg0, int arg1, int arg2, int arg3) {
        this.field5028 = arg1;
        this.field5023 = arg0;
        this.field4924 = arg2;
        this.field4960 = arg3;
        ++field4776;
        this.field4931 = true;
        this.field4890.method1777(0, 3, false, false, 3, 0);
        this.field4890.field3922.method1550(0);
        this.method2095(-10685);
        this.method2066(false);
    }

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "(B)V", line = 4603)
    private final void method2049(byte arg0) {
        int var2 = -107 % ((-11 - arg0) / 62);
        if (~this.field4970 != -2) {
            this.method2063(29260);
            this.method2069(false, (byte) 54);
            this.method2018(false, (byte) 99);
            this.method2064(127, false);
            this.method2083((byte) -128, false);
            this.method2075((class538) null, 0);
            this.method2015(-2, (byte) -121);
            this.method2045(34023, 1);
            this.field4970 = 1;
        }
        ++field4764;
    }

    @OriginalMember(owner = "client!nq", name = "IA", descriptor = "(IIII)V", line = 4629)
    public final void method828(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4992 > arg2) {
            this.field4992 = arg2;
        }
        if (arg1 > this.field5024) {
            this.field5024 = arg1;
        }
        if (~this.field4944 < ~arg3) {
            this.field4944 = arg3;
        }
        if (~this.field5032 > ~arg0) {
            this.field5032 = arg0;
        }
        ++field4887;
        OpenGL.glEnable(3089);
        this.method2057(0);
        this.method2088(0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFF)V", line = 4655)
    public final void method789(float arg0, float arg1, float arg2) {
        class419.field6381 = arg0;
        ++field4806;
        class263.field3693 = arg2;
        class411.field6254 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "()Z", line = 4670)
    public final boolean method786() {
        ++field4862;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "(I)V", line = 4678)
    private final void method2050(int arg0) {
        this.field4935 = new class416();
        ++field4798;
        this.field4986 = new class416();
        this.field4975 = new class538[this.field4967];
        this.field4926 = new class25(this, 3553, 6408, 1, 1);
        new class25(this, 3553, 6408, 1, arg0);
        new class25(this, 3553, 6408, 1, 1);
        this.field4972 = new class226(this);
        this.field4956 = new class226(this);
        this.field4954 = new class226(this);
        this.field4985 = new class226(this);
        this.field4927 = new class226(this);
        this.field4942 = new class226(this);
        this.field4963 = new class226(this);
        this.field5009 = new class226(this);
        this.field4957 = new class226(this);
        this.field5015 = new class226(this);
        if (this.field4939) {
            this.field5013 = new class447(this);
            new class447(this);
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(IIIII)V", line = 4713)
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2049((byte) -99);
        ++field4758;
        this.method2087(arg4, 16711935);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I", line = 4734)
    public final int method781(int arg0, int arg1) {
        ++field4820;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "(I)V", line = 4742)
    private final void method2051(int arg0) {
        if (arg0 != 0) {
            this.method815(76, 16, 103, -46, 51, 0.13680954F);
        }
        ++field4710;
        OpenGL.glViewport(this.field4955, this.field4930, this.field4809, this.field4811);
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "()Z", line = 4755)
    public final boolean method797() {
        ++field4794;
        return this.field4890.method1776(3, -119);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lnd;IIII)Lka;", line = 4766)
    public final class334 method833(class387 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4860;
        return new class226(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIIIIII)V", line = 4775)
    public final void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4815;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIZ)Laa;", line = 4783)
    public final class341 method816(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4763;
        return new class351(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 4793)
    public final void method851(Rectangle[] arg0, int arg1) {
        this.method757();
        ++field4803;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(III)V", line = 4804)
    public final void method2052(int arg0, int arg1, int arg2) {
        this.field4930 = arg2;
        ++field4841;
        if (arg0 >= -42) {
            this.field4986 = null;
        }
        this.field4955 = arg1;
        this.method2051(0);
        this.method2088(0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lbf;I)V", line = 4819)
    public final void method2053(class379 arg0, int arg1) {
        ++field4822;
        if (~this.field4904 <= -1 && this.field4906[this.field4904] == arg0) {
            this.field4906[this.field4904--] = null;
            if (arg1 == 0) {
                arg0.method2377(486);
                if (~this.field4904 <= -1) {
                    this.field4905 = this.field4906[this.field4904];
                    this.field4905.method2374((byte) 5);
                } else {
                    this.field4905 = null;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IJ)V", line = 4846)
    public final synchronized void method2054(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method742(-29, 0, 107, -46, 103);
        }
        ++field4843;
        class5 var4 = new class5();
        var4.field35 = arg1;
        this.field4917.method453((byte) 122, var4);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lbf;I)V", line = 4860)
    public final void method2055(class379 arg0, int arg1) {
        ++field4736;
        int var3 = 98 / ((arg1 - 42) / 49);
        if (this.field4995) {
            this.method2082(-123, arg0);
            this.method2053(arg0, 0);
        } else if (~this.field4900 <= -1 && this.field4902[this.field4900] == arg0) {
            this.field4902[this.field4900--] = null;
            arg0.method2375((byte) 98);
            if (this.field4900 >= 0) {
                this.field4907 = this.field4905 = this.field4902[this.field4900];
                this.field4907.method2373(23993);
            } else {
                this.field4907 = this.field4905 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "(I)V", line = 4894)
    public final void method834(int arg0) {
        ++field4750;
        this.method2087(0, 16711935);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([S[Ljava/lang/String;III)V", line = 4906)
    public static final void method2056(short[] arg0, String[] arg1, int arg2, int arg3, int arg4) {
        if (~arg3 < ~arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg4; ~var9 > ~arg3; ++var9) {
                if (var7 == null || arg1[var9] != null && (var9 & 1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2056(arg0, arg1, 97, var6 + -1, arg4);
            method2056(arg0, arg1, 82, arg3, var6 + 1);
        }
        if (arg2 < 44) {
            method2056((short[]) null, (String[]) null, 25, 111, 32);
        }
        ++field4771;
    }

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "(I)V", line = 4960)
    private final void method2057(int arg0) {
        this.field4922 = (float) (-this.field5014 + this.field5024);
        if (arg0 == 0) {
            this.field4968 = (float) (this.field4992 - this.field5021);
            this.field5006 = (float) (-this.field5014 + this.field4944);
            this.field4998 = (float) (this.field5032 - this.field5021);
            ++field4772;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIIIII)V", line = 4975)
    public final void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2049((byte) -81);
        ++field4739;
        this.method2087(arg5, 16711935);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "(B)V", line = 4993)
    private final void method2058(byte arg0) {
        class1.field10[0] = this.field4981 * this.field4953;
        class1.field10[1] = this.field5012 * this.field4953;
        ++field4728;
        class1.field10[3] = 1.0F;
        class1.field10[2] = this.field4978 * this.field4953;
        OpenGL.glLightModelfv(2899, class1.field10, 0);
        if (arg0 != -103) {
            this.method828(104, -86, 67, 57);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lju;[Lmn;Z)Lba;", line = 5009)
    public final class268 method839(class82 arg0, class252[] arg1, boolean arg2) {
        ++field4868;
        return new class219(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "()V", line = 5019)
    public final void method802() {
        for (class5 var1 = this.field4894.method445(33); var1 != null; var1 = this.field4894.method451(false)) {
            ((class111) var1).method697(0);
        }
        ++field4717;
        if (this.field4888 != null) {
            this.field4888.method599((byte) 101);
        }
        if (this.field4881 != null) {
            this.method2033((byte) -81);
            Enumeration var2 = this.field4744.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4744.get(var3);
                this.field4881.releaseSurface(var3, var4);
            }
            this.field4881.release();
            this.field4881 = null;
        }
        if (this.field4893) {
            class476.method2840(false, true, 0);
            this.field4893 = false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "()I", line = 5064)
    public final int method811() {
        ++field4835;
        return 4;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIILi;II)V", line = 5077)
    public final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class30 arg6, int arg7, int arg8) {
        ++field4746;
        class261 var10 = (class261) arg6;
        class116 var11 = var10.field3678;
        this.method2096(-29861);
        this.method2075(var10.field3678, 0);
        this.method2087(arg5, 16711935);
        this.method2030(7681, 8448, (byte) 71);
        this.method2059(34167, 768, 0, -31277);
        float var12 = var11.field1602 / (float) var11.field1594;
        float var13 = var11.field1598 / (float) var11.field1595;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2059(5890, 768, 0, -31277);
    }

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "(IIIII)V", line = 5107)
    public final void method742(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4729;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(IIII)V", line = 5120)
    public final void method2059(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg2, arg0);
        ++field4852;
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
        if (arg3 != -31277) {
            this.field5026 = true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "(B)V", line = 5133)
    private final void method2060(byte arg0) {
        int var2 = -24 / ((arg0 - 67) / 48);
        if (this.field5017 != 3) {
            this.field5017 = 3;
            this.method2061(16098);
            this.method2035(false);
            this.field4970 &= -8;
        }
        ++field4749;
    }

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "(I)V", line = 5151)
    private final void method2061(int arg0) {
        ++field4695;
        float var2 = (float) (-this.field5021) * this.field5030 / (float) this.field4918;
        float var3 = (float) (-this.field5014) * this.field5030 / (float) this.field4937;
        float var4 = (float) (-this.field5021 + this.field4809) * this.field5030 / (float) this.field4918;
        float var5 = (float) (this.field4811 - this.field5014) * this.field5030 / (float) this.field4937;
        if (arg0 != 16098) {
            this.field4988 = null;
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field4958 + -this.field4979), (double) ((float) this.field4969 - this.field4979));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "()V", line = 5176)
    public final void method852() {
        ++field4883;
        if (this.field4996 && ~this.field4809 < -1 && this.field4811 > 0) {
            int var1 = this.field5032;
            int var2 = this.field4992;
            int var3 = this.field5024;
            int var4 = this.field4944;
            this.method753();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2019(124);
            this.method2069(false, (byte) 102);
            this.method2018(false, (byte) 99);
            this.method2064(125, false);
            this.method2083((byte) -61, false);
            this.method2075((class538) null, 0);
            this.method2015(-2, (byte) -121);
            this.method2045(34023, 1);
            this.method2087(0, 16711935);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4809, this.field4811, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method739(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lms;I)V", line = 5224)
    public final void method2062(class541 arg0, int arg1) {
        if (this.field4988 != arg0) {
            if (this.field4952) {
                OpenGL.glBindBufferARB(34962, arg0.method471(arg1 ^ 26492));
            }
            this.field4988 = arg0;
        }
        ++field4725;
        if (arg1 != 1) {
            this.method755();
        }
    }

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "()V", line = 5243)
    public final void method757() {
        ++field4701;
        try {
            this.field4881.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "()Z", line = 5266)
    public final boolean method841() {
        ++field4777;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lmn;Z)Laa;", line = 5277)
    public final class341 method774(class252 arg0, boolean arg1) {
        ++field4751;
        int[] var3 = new int[arg0.field3513 * arg0.field3512];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3511 == null) {
            for (int var6 = 0; arg0.field3513 > var6; ++var6) {
                for (int var7 = 0; arg0.field3512 > var7; ++var7) {
                    int var8 = arg0.field3508[255 & arg0.field3506[var4++]];
                    var3[var5++] = ~var8 != -1 ? class311.method1956(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field3513; ++var9) {
                for (int var11 = 0; var11 < arg0.field3512; ++var11) {
                    var3[var5++] = class311.method1956(arg0.field3511[var4] << 24, arg0.field3508[class519.method3092(255, arg0.field3506[var4])]);
                    ++var4;
                }
            }
        }
        class341 var10 = this.method767(var3, 0, arg0.field3512, arg0.field3512, arg0.field3513);
        var10.method294(arg0.field3509, arg0.field3505, arg0.field3510, arg0.field3507);
        return var10;
    }

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "(I)V", line = 5338)
    private final void method2063(int arg0) {
        if (arg0 != 29260) {
            this.method774((class252) null, false);
        }
        if (this.field5017 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4809 < -1 && ~this.field4811 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field4809, (double) this.field4811, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field4970 &= -25;
            this.field5017 = 1;
        }
        ++field4779;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)V", line = 5363)
    public final void method2064(int arg0, boolean arg1) {
        ++field4700;
        if (!this.field4980 != !arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4970 &= -32;
            this.field4980 = arg1;
        }
        if (arg0 <= 121) {
            this.method740(16);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIILvf;I)V", line = 5386)
    public final void method2065(int arg0, int arg1, int arg2, class105 arg3, int arg4) {
        ++field4714;
        int var6 = arg3.method674(true);
        int var7 = arg1 * this.method2025((byte) 90, var6);
        if (arg4 <= 48) {
            this.field4891 = null;
        }
        this.method2031(-25866, arg3);
        OpenGL.glDrawElements(arg0, arg2, var6, (long) var7 + arg3.method676(false));
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(Z)V", line = 5405)
    private final void method2066(boolean arg0) {
        ++field4866;
        if (this.field4920 && this.field5016 >= 0 | this.field4931) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0) {
            this.method2087(103, 71);
        }
    }

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "(B)V", line = 5422)
    public final void method2067(byte arg0) {
        if (arg0 != 15) {
            this.field4957 = null;
        }
        ++field4709;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(IZ)V", line = 5438)
    public final synchronized void method2068(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2023(-8);
        }
        ++field4720;
        class160 var3 = new class160(arg0);
        this.field4914.method453((byte) 116, var3);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 5451)
    public final void method794(int arg0) {
        ++field4766;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field4889 = arg0;
            this.field4884.method503(98);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ZB)V", line = 5464)
    public final void method2069(boolean arg0, byte arg1) {
        ++field4721;
        if (!arg0 == this.field4920) {
            this.field4920 = arg0;
            this.method2066(false);
            this.field4970 &= -32;
        }
        if (arg1 < 27) {
            this.field5019 = -2.1049652F;
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(II)I", line = 5485)
    public final int method2070(int arg0, int arg1) {
        if (arg1 >= -43) {
            this.method2044(62, 6, (byte) 108, 44);
        }
        ++field4844;
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    return 34165;
                } else if (~arg0 == -4) {
                    return 260;
                } else if (~arg0 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "(I)V", line = 5517)
    public final void method769(int arg0) {
        this.field4895 = 0;
        ++field4861;
        while (arg0 > 1) {
            ++this.field4895;
            arg0 >>= 1;
        }
        this.field4897 = 1 << this.field4895;
    }

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "()V", line = 5533)
    public final void method792() {
        this.field4888.method596((byte) 77);
        ++field4748;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILbf;)V", line = 5545)
    public final void method2071(int arg0, class379 arg1) {
        if (arg0 <= 72) {
            this.method822((Canvas) null);
        }
        ++field4727;
        if (!this.field4995) {
            if (this.field4900 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field4900 <= -1) {
                    this.field4902[this.field4900].method2375((byte) 126);
                }
                this.field4907 = this.field4905 = this.field4902[++this.field4900] = arg1;
                this.field4907.method2373(23993);
            }
        } else {
            this.method2039(arg1, true);
            this.method2037((byte) 73, arg1);
        }
    }

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "(I)V", line = 5573)
    public final void method2072(int arg0) {
        ++field4712;
        if (arg0 != 0) {
            this.field5011 = false;
        }
        if (~this.field4970 != -5) {
            this.method2063(29260);
            this.method2069(false, (byte) 80);
            this.method2018(false, (byte) 99);
            this.method2064(arg0 + 122, false);
            this.method2083((byte) 87, false);
            this.method2015(-2, (byte) -121);
            this.method2087(1, arg0 + 16711935);
            this.method2045(34023, 0);
            this.field4970 = 4;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([Lka;Ln;[Lst;I)V", line = 5601)
    public final void method809(class334[] arg0, class14 arg1, class302[] arg2, int arg3) {
        ++field4752;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method53(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 5624)
    public final void method791(Canvas arg0) {
        ++field4780;
        long var2 = 0L;
        if (arg0 != null && this.field4828 != arg0) {
            if (this.field4744.containsKey(arg0)) {
                Long var4 = (Long) this.field4744.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field4715;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4881.surfaceResized(var2);
            if (this.field4807 == arg0) {
                this.method2042((byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "(IIIIII)V", line = 5658)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4784;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2049((byte) 58);
        float var10 = (float) arg3 + var8;
        this.method2087(arg5, 16711935);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4994) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4994) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!nq", name = "PA", descriptor = "(FF)V", line = 5693)
    public final void method748(float arg0, float arg1) {
        ++field4702;
        if (this.field5004 != arg0 || this.field4979 != arg1) {
            this.field5004 = arg0;
            this.field4979 = arg1;
            this.method2023(120);
            if (~this.field5017 == -4) {
                this.method2061(16098);
                return;
            }
            if (this.field5017 != 2) {
                return;
            }
            this.method2089(0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "()Z", line = 5723)
    public final boolean method818() {
        ++field4790;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "()Ln;", line = 5734)
    public final class14 method795() {
        ++field4759;
        return new class416();
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[I[I)Li;", line = 5747)
    public final class30 method782(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4834;
        return class239.method1575(arg2, arg3, this, arg0, 89, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 5755)
    public final void method826(Canvas arg0) {
        this.field4789 = 0L;
        ++field4873;
        this.field4807 = null;
        if (arg0 != null && this.field4828 != arg0) {
            if (this.field4744.containsKey(arg0)) {
                Long var2 = (Long) this.field4744.get(arg0);
                this.field4789 = var2;
                this.field4807 = arg0;
            }
        } else {
            this.field4807 = this.field4828;
            this.field4789 = this.field4715;
        }
        if (this.field4807 != null && ~this.field4789 != -1L) {
            this.field4881.setSurface(this.field4789);
            this.method2042((byte) -99);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Llo;)V", line = 5785)
    public final void method799(class539 arg0) {
        ++field4856;
        this.field4989 = (class201) arg0;
    }

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "()V", line = 5794)
    public final void method788() {
        this.field4931 = false;
        ++field4775;
        this.field4890.method1777(0, 0, false, false, 3, 0);
        this.method2095(-10685);
        this.method2066(false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([Lka;Lfq;Ln;[Lst;I)V", line = 5807)
    public final void method807(class334[] arg0, class137 arg1, class14 arg2, class302[] arg3, int arg4) {
        this.method809(arg0, arg2, arg3, arg4);
        ++field4756;
        this.method798(arg1);
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "()Z", line = 5821)
    public final boolean method836() {
        ++field4762;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(BI)V", line = 5831)
    public final void method2073(byte arg0, int arg1) {
        class1.field10[2] = (float) class519.method3092(arg1, 255) / 255.0F;
        class1.field10[0] = (float) class519.method3092(arg1, 16711680) / 1.671168E7F;
        class1.field10[1] = (float) class519.method3092(65280, arg1) / 65280.0F;
        class1.field10[3] = (float) (arg1 >>> 24) / 255.0F;
        ++field4819;
        if (arg0 != -114) {
            this.field4976 = null;
        }
        OpenGL.glTexEnvfv(8960, 8705, class1.field10, 0);
    }

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "(I)V", line = 5846)
    private final void method2074(int arg0) {
        ++field4788;
        int var2;
        for (var2 = 0; ~var2 > ~this.field5020; ++var2) {
            class28 var3 = this.field4940[var2];
            int var4 = var2 + 16386;
            class211.field2990[0] = (float) var3.method257(-70);
            class211.field2990[1] = (float) var3.method250((byte) 51);
            class211.field2990[2] = (float) var3.method255(-7164);
            class211.field2990[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class211.field2990, 0);
            int var5 = var3.method254(true);
            float var6 = var3.method253(true) / 255.0F;
            class211.field2990[2] = (float) class519.method3092(255, var5) * var6;
            class211.field2990[1] = (float) class519.method3092(255, var5 >> 8) * var6;
            class211.field2990[0] = (float) (class519.method3092(var5, 16724566) >> 16) * var6;
            OpenGL.glLightfv(var4, 4609, class211.field2990, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method252(100) * var3.method252(104)));
            OpenGL.glEnable(var4);
        }
        if (arg0 != 1528) {
            this.field4920 = false;
        }
        while (var2 < this.field5033) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field5033 = this.field5020;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Llr;I)V", line = 5891)
    public final void method2075(class538 arg0, int arg1) {
        ++field4824;
        class538 var3 = this.field4975[this.field5022];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field7881);
                } else if (~arg0.field7881 != ~var3.field7881) {
                    OpenGL.glDisable(var3.field7881);
                    OpenGL.glEnable(arg0.field7881);
                }
                OpenGL.glBindTexture(arg0.field7881, arg0.method3178((byte) 44));
            } else {
                OpenGL.glDisable(var3.field7881);
            }
            this.field4975[this.field5022] = arg0;
        }
        this.field4970 &= -2;
        if (arg1 != 0) {
            this.method2027((byte) -11);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBI)V", line = 5929)
    public final synchronized void method2076(int arg0, byte arg1, int arg2) {
        if (arg1 != 29) {
            this.field4924 = -6;
        }
        ++field4787;
        class160 var4 = new class160(arg2);
        var4.field35 = (long) arg0;
        this.field4913.method453((byte) 116, var4);
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(II)I", line = 5944)
    public final int method2077(int arg0, int arg1) {
        ++field4693;
        if (arg1 != 34847) {
            return -11;
        } else if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (~arg0 != -6409 && arg0 != 34847) {
                    if (arg0 == 34843) {
                        return 6;
                    } else if (arg0 == 34842) {
                        return 8;
                    } else if (~arg0 == -6403) {
                        return 3;
                    } else if (arg0 == 6401) {
                        return 1;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "()Z", line = 5987)
    public final boolean method846() {
        ++field4821;
        return this.field4994 && (!this.method823() || this.field5001);
    }

    @OriginalMember(owner = "client!nq", name = "na", descriptor = "()I", line = 5997)
    public final int method756() {
        ++field4741;
        return this.field4958;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lw;)V", line = 6005)
    public final void method800(class198 arg0) {
        this.field4896 = ((class111) arg0).field1557;
        ++field4718;
        if (this.field4921 == null) {
            class283 var2 = new class283(80);
            if (this.field4974) {
                var2.method1821(-8443, -1.0F);
                var2.method1821(-8443, -1.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, -1.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, -1.0F);
                var2.method1821(-8443, 1.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 0.0F);
                var2.method1821(-8443, 0.0F);
            } else {
                var2.method1823(32, -1.0F);
                var2.method1823(32, -1.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, -1.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, -1.0F);
                var2.method1823(32, 1.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 0.0F);
                var2.method1823(32, 0.0F);
            }
            this.field4921 = this.method2048(var2.field2219, var2.field2185, -1, false, 20);
            this.field5018 = new class129(this.field4921, 5126, 3, 0);
            this.field4948 = new class129(this.field4921, 5126, 2, 12);
            this.field4886.method2116(this, 124);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Llo;Llo;FLlo;)Llo;", line = 6073)
    public final class539 method844(class539 arg0, class539 arg1, float arg2, class539 arg3) {
        ++field4849;
        if (arg0 != null && arg1 != null && this.field5025 && this.field4939) {
            class397 var5 = null;
            class201 var6 = (class201) arg0;
            class201 var7 = (class201) arg1;
            class1 var8 = var6.method1364(116);
            class1 var9 = var7.method1364(106);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field5 >= ~var9.field5 ? var9.field5 : var8.field5;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class397) {
                    class397 var11 = (class397) arg3;
                    if (~var11.method2463(108) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class397(this, var10);
                }
                if (var5.method2462(var9, -94, var8, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!nq", name = "sa", descriptor = "()I", line = 6120)
    public final int method820() {
        ++field4853;
        return this.field4969;
    }

    @OriginalMember(owner = "client!nq", name = "BA", descriptor = "(IIIII)V", line = 6128)
    public final void method787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4781;
        this.method2049((byte) 122);
        this.method2087(arg4, 16711935);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "(B)V", line = 6148)
    public final void method2078(byte arg0) {
        ++field4827;
        if (arg0 != -60) {
            this.method2089(80);
        }
        if (~this.field4970 != -9) {
            this.method2093(127);
            this.method2069(true, (byte) 99);
            this.method2064(arg0 ^ -71, true);
            this.method2083((byte) 47, true);
            this.method2087(1, arg0 ^ -16711877);
            this.method2045(34023, 0);
            this.field4970 = 8;
        }
    }

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "(I)V", line = 6172)
    private final void method2079(int arg0) {
        ++field4795;
        this.method2015(-2, (byte) -121);
        if (arg0 < -120) {
            for (int var2 = this.field4967 + -1; var2 >= 0; --var2) {
                this.method2040((byte) -97, var2);
                this.method2075((class538) null, 0);
                OpenGL.glTexEnvi(8960, 8704, 34160);
            }
            this.method2030(8448, 8448, (byte) 71);
            this.method2059(34168, 770, 2, -31277);
            this.method2098((byte) -117);
            this.field5008 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field4934 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field5035 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field4962 = true;
            this.method2069(true, (byte) 99);
            this.method2018(true, (byte) 99);
            this.method2064(126, true);
            this.method2083((byte) 80, true);
            this.method2019(121);
            this.field4881.setSwapInterval(0);
            OpenGL.glShadeModel(7425);
            OpenGL.glClearDepth(1.0F);
            OpenGL.glDepthFunc(515);
            OpenGL.glPolygonMode(1028, 6914);
            OpenGL.glEnable(2884);
            OpenGL.glCullFace(1029);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glColorMaterial(1028, 5634);
            OpenGL.glEnable(2903);
            float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
            for (int var4 = 0; ~var4 > -9; ++var4) {
                int var5 = var4 + 16384;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field4993 = this.field4984 = -1;
            this.method753();
        }
    }

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "(I)Lus;", line = 6244)
    public final class1 method2080(int arg0) {
        ++field4867;
        if (arg0 != 27094) {
            this.method2093(-62);
        }
        return this.field4989 != null ? this.field4989.method1364(114) : null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFZ)V", line = 6257)
    public final void method2081(float arg0, float arg1, boolean arg2) {
        ++field4769;
        if (arg2) {
            this.field4949 = arg1;
            this.field5002 = arg0;
            if (!this.field4931) {
                this.method2095(-10685);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(ILbf;)V", line = 6272)
    public final void method2082(int arg0, class379 arg1) {
        ++field4870;
        int var3 = -122 % ((arg0 - 28) / 45);
        if (this.field4901 >= 0 && this.field4903[this.field4901] == arg1) {
            this.field4903[this.field4901--] = null;
            arg1.method2376(-125);
            if (this.field4901 < 0) {
                this.field4907 = null;
            } else {
                this.field4907 = this.field4903[this.field4901];
                this.field4907.method2372(116);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZ)V", line = 6295)
    public final void method2083(byte arg0, boolean arg1) {
        ++field4838;
        int var3 = -114 / ((-20 - arg0) / 35);
        if (this.field4929 != arg1) {
            this.field4929 = arg1;
            this.method2099((byte) -96);
            this.field4970 &= -32;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(FZFF)V", line = 6314)
    private final void method2084(float arg0, boolean arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field4817;
        if (this.field4945) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg3, arg0);
        OpenGL.glMatrixMode(5888);
        this.field4945 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "()V", line = 6329)
    public final void method845() {
        ++field4797;
        if (this.field4885 != null && this.field4885.method3150((byte) 33)) {
            this.field4888.method602(this.field4885, -2814);
            this.field4884.method503(107);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZI)V", line = 6346)
    public final void method2085(int arg0, boolean arg1, int arg2) {
        this.method2034(arg0, true, arg1, (byte) -128);
        if (arg2 != 0) {
            this.method2097(52);
        }
        ++field4874;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lgu;I)V", line = 6357)
    public final void method2086(class416 arg0, int arg1) {
        OpenGL.glPushMatrix();
        if (arg1 != 8915) {
            this.method2028((class416) null, -43);
        }
        ++field4791;
        OpenGL.glMultMatrixf(arg0.method2550((byte) 122), 0);
    }

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "([I)V", line = 6370)
    public final void method850(int[] arg0) {
        arg0[3] = this.field4944;
        arg0[0] = this.field5032;
        ++field4703;
        arg0[1] = this.field5024;
        arg0[2] = this.field4992;
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "(II)V", line = 6382)
    public final void method2087(int arg0, int arg1) {
        if (arg1 != 16711935) {
            this.method836();
        }
        if (this.field5008 != arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    var3 = 2;
                    var4 = false;
                    var5 = true;
                } else if (arg0 != 128) {
                    var5 = true;
                    var4 = false;
                    var3 = 0;
                } else {
                    var4 = true;
                    var5 = true;
                    var3 = 3;
                }
            } else {
                var3 = 1;
                var4 = true;
                var5 = true;
            }
            if (this.field4962 == !var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field4962 = var5;
            }
            if (!this.field5035 != !var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5035 = var4;
            }
            if (~this.field4934 != ~var3) {
                if (var3 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 != 2) {
                    if (~var3 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field4934 = var3;
            }
            this.field5008 = arg0;
            this.field4970 &= -29;
        }
        ++field4737;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V", line = 6475)
    public final void method740(int arg0) {
        this.method2047((byte) 51);
        ++field4802;
    }

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "(I)V", line = 6483)
    private final void method2088(int arg0) {
        if (~this.field4992 <= ~this.field5032 && ~this.field5024 >= ~this.field4944) {
            OpenGL.glScissor(this.field5032 + this.field4955, this.field4930 - (-this.field4811 - -this.field4944), -this.field5032 + this.field4992, -this.field5024 + this.field4944);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field4716;
        if (arg0 != 0) {
            this.field4898 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "(II)V", line = 6499)
    public final void method761(int arg0, int arg1) {
        ++field4722;
        if (this.field4958 != arg0 || this.field4969 != arg1) {
            this.field4969 = arg1;
            this.field4958 = arg0;
            this.method2027((byte) -40);
            this.method2095(-10685);
            if (this.field5017 != 3) {
                if (this.field5017 == 2) {
                    this.method2089(0);
                    return;
                }
            } else {
                this.method2061(16098);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "TA", descriptor = "(IIIIII)Z", line = 6525)
    public final boolean method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4877;
        float var7 = (float) arg2 * this.field4935.field6332 + (float) arg0 * this.field4935.field6354 + (float) arg1 * this.field4935.field6351 + this.field4935.field6329;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field4935.field6332 + (float) arg3 * this.field4935.field6354 + (float) arg4 * this.field4935.field6351 + this.field4935.field6329;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field4958) || !((float) this.field4958 > var8)) && (!((float) this.field4969 < var7) || !((float) this.field4969 < var8))) {
            int var9 = (int) (((float) arg2 * this.field4935.field6348 + (float) arg0 * this.field4935.field6340 + (float) arg1 * this.field4935.field6324 + this.field4935.field6353) * (float) this.field4918 / var7);
            int var10 = (int) (((float) arg5 * this.field4935.field6348 + (float) arg3 * this.field4935.field6340 + (float) arg4 * this.field4935.field6324 + this.field4935.field6353) * (float) this.field4918 / var8);
            if (this.field4998 > (float) var9 && (float) var10 < this.field4998 || this.field4968 < (float) var9 && this.field4968 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field4935.field6330 + (float) arg0 * this.field4935.field6334 + (float) arg1 * this.field4935.field6347 + this.field4935.field6322) * (float) this.field4937 / var7);
                int var12 = (int) (((float) arg5 * this.field4935.field6330 + (float) arg3 * this.field4935.field6334 + (float) arg4 * this.field4935.field6347 + this.field4935.field6322) * (float) this.field4937 / var8);
                return (!((float) var11 < this.field4922) || !(this.field4922 > (float) var12)) && (!((float) var11 > this.field5006) || !((float) var12 > this.field5006));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "()Z", line = 6567)
    public final boolean method778() {
        ++field4747;
        return true;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)Lw;", line = 6575)
    public final class198 method749(int arg0) {
        ++field4713;
        class111 var2 = new class111(arg0);
        this.field4894.method453((byte) 110, var2);
        return var2;
    }

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "(I)V", line = 6586)
    private final void method2089(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field4805;
        OpenGL.glLoadMatrixf(this.field4933, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IBI)V", line = 6598)
    public final synchronized void method2090(int arg0, byte arg1, int arg2) {
        ++field4783;
        class160 var4 = new class160(arg2);
        int var5 = -42 / ((-81 - arg1) / 33);
        var4.field35 = (long) arg0;
        this.field4915.method453((byte) 121, var4);
    }

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "()Ln;", line = 6611)
    public final class14 method751() {
        ++field4814;
        return this.field4891;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 6620)
    public final void method744(Canvas arg0) {
        ++field4723;
        if (this.field4828 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4744.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field4881.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4744.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BF)V", line = 6654)
    public final void method2091(byte arg0, float arg1) {
        if (arg0 != -31) {
            this.method2087(-91, -71);
        }
        ++field4865;
        if (this.field5030 != arg1) {
            this.field5030 = arg1;
            if (this.field5017 == 3) {
                this.method2061(16098);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lm;Lm;Lm;Lm;I)V", line = 6672)
    public final void method2092(class129 arg0, class129 arg1, class129 arg2, class129 arg3, int arg4) {
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2062(arg0.field1742, 1);
            OpenGL.glVertexPointer(arg0.field1738, arg0.field1737, this.field4988.method468((byte) -41), this.field4988.method474(10) - -((long) arg0.field1740));
            OpenGL.glEnableClientState(32884);
        }
        ++field4786;
        if (arg1 != null) {
            this.method2062(arg1.field1742, 1);
            OpenGL.glNormalPointer(arg1.field1737, this.field4988.method468((byte) -41), this.field4988.method474(88) - -((long) arg1.field1740));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 != 18504) {
            this.field4984 = -54;
        }
        if (arg3 != null) {
            this.method2062(arg3.field1742, arg4 ^ 18505);
            OpenGL.glColorPointer(arg3.field1738, arg3.field1737, this.field4988.method468((byte) -41), this.field4988.method474(22) + (long) arg3.field1740);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 != null) {
            this.method2062(arg2.field1742, 1);
            OpenGL.glTexCoordPointer(arg2.field1738, arg2.field1737, this.field4988.method468((byte) -41), this.field4988.method474(53) - -((long) arg2.field1740));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "(I)V", line = 6719)
    private final void method2093(int arg0) {
        ++field4705;
        if (this.field5017 != 2) {
            this.field5017 = 2;
            this.method2089(0);
            this.method2035(false);
            this.field4970 &= -8;
        }
        if (arg0 <= 125) {
            this.method846();
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIZ[B)Lvf;", line = 6739)
    public final class105 method2094(boolean arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field4708;
        if (!arg3) {
            method2017(-4, 24, 77);
        }
        return (class105) (!this.field4952 || arg0 && !this.field5026 ? new class300(this, arg2, arg4, arg1) : new class466(this, arg2, arg4, arg1, arg0));
    }

    @OriginalMember(owner = "client!nq", name = "ua", descriptor = "(IIIIII[BII)V", line = 6756)
    public final void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4840;
        float var10;
        float var11;
        if (this.field4936 != null && this.field4936.field361 >= arg2 && ~this.field4936.field366 <= ~arg3) {
            this.field4936.method233(arg3, 0, 22711, arg6, 0, 0, arg2, 6406, 0, false);
            var10 = (float) arg3 * this.field4936.field1598 / (float) this.field4936.field366;
            var11 = (float) arg2 * this.field4936.field1602 / (float) this.field4936.field361;
        } else {
            this.field4936 = class194.method1312(arg2, 6406, 91, this, arg3, 6406, arg6, false);
            this.field4936.method229((byte) 77, false, false);
            var10 = this.field4936.field1598;
            var11 = this.field4936.field1602;
        }
        this.method2096(-29861);
        this.method2075(this.field4936, 0);
        this.method2087(arg8, 16711935);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2073((byte) -114, arg5);
        this.method2030(34165, 34165, (byte) 71);
        this.method2059(34166, 768, 0, -31277);
        this.method2059(5890, 770, 2, -31277);
        this.method2044(0, 770, (byte) 64, 34166);
        this.method2044(2, 770, (byte) 64, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2059(5890, 768, 0, -31277);
        this.method2059(34166, 770, 2, -31277);
        this.method2044(0, 770, (byte) 64, 5890);
        this.method2044(2, 770, (byte) 64, 34166);
    }

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "(I)V", line = 6813)
    private final void method2095(int arg0) {
        if (arg0 == -10685) {
            ++field4792;
            int var2;
            if (!this.field4931) {
                this.field5019 = (float) (-this.field5010 + this.field4969) + -this.field4949;
                this.field4987 = this.field5019 - (float) this.field5016 * this.field5002;
                if (this.field4987 < (float) this.field4958) {
                    this.field4987 = (float) this.field4958;
                }
                OpenGL.glFogf(2915, this.field4987);
                OpenGL.glFogf(2916, this.field5019);
                var2 = this.field4984;
            } else {
                OpenGL.glFogf(2915, 0.0F);
                OpenGL.glFogf(2916, 1.0F);
                var2 = this.field5028;
            }
            class1.field10[2] = (float) class519.method3092(var2, 255) / 255.0F;
            class1.field10[0] = (float) class519.method3092(var2, 16711680) / 1.671168E7F;
            class1.field10[1] = (float) class519.method3092(65280, var2) / 65280.0F;
            OpenGL.glFogfv(2918, class1.field10, 0);
            if (this.field4931) {
                this.field4890.field3922.method1551(1);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "(I)V", line = 6857)
    public final void method2096(int arg0) {
        if (arg0 != -29861) {
            this.method787(-87, -38, 102, -7, -96);
        }
        ++field4753;
        if (this.field4970 != 2) {
            this.method2063(29260);
            this.method2069(false, (byte) 90);
            this.method2018(false, (byte) 99);
            this.method2064(125, false);
            this.method2083((byte) 27, false);
            this.method2015(-2, (byte) -121);
            this.field4970 = 2;
        }
    }

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "()Z", line = 6880)
    public final boolean method763() {
        ++field4823;
        return false;
    }

    @OriginalMember(owner = "client!nq", name = "KA", descriptor = "(IIII)V", line = 6892)
    public final void method754(int arg0, int arg1, int arg2, int arg3) {
        ++field4826;
        if (!this.field4931) {
            throw new RuntimeException("");
        } else {
            this.field5028 = arg1;
            this.field5023 = arg0;
            this.field4960 = arg3;
            this.field4924 = arg2;
            this.field4890.field3922.method1550(0);
            this.method2095(-10685);
        }
    }

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "()Z", line = 6914)
    public final boolean method827() {
        ++field4785;
        return this.field4885 != null && (this.field4882 <= 1 || this.field5001);
    }

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "(I)I", line = 6922)
    private final int method2097(int arg0) {
        ++field4726;
        int var2 = 0;
        this.field4983 = OpenGL.glGetString(7936).toLowerCase();
        this.field4991 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field4983.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field4983.indexOf("brian paul") != 0 || this.field4983.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class61.method437(var3.replace('.', ' '), ' ', 243);
        if (var4.length >= 2) {
            try {
                int var5 = class370.method2349(arg0 + 10, var4[0]);
                int var6 = class370.method2349(10, var4[1]);
                this.field4971 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field4971 > -13) {
            var2 |= 2;
        }
        if (!this.field4881.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4881.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field4967 = var7[arg0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field4973 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5034 = var7[0];
        if (this.field4967 < 2 || this.field4973 < 2 || ~this.field5034 > -3) {
            var2 |= 16;
        }
        this.field4974 = NativeStream.method2727();
        this.field4881.arePbuffersAvailable();
        this.field4952 = this.field4881.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field4994 = this.field4881.isExtensionAvailable("GL_ARB_multisample");
        this.field5003 = this.field4881.isExtensionAvailable("GL_ARB_vertex_program");
        this.field4881.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5005 = this.field4881.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field4923 = this.field4881.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field4964 = this.field4881.isExtensionAvailable("GL_EXT_texture3D");
        this.field5027 = this.field4881.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5025 = this.field4881.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field4997 = this.field4881.isExtensionAvailable("GL_ARB_texture_float");
        this.field4999 = false;
        this.field4939 = this.field4881.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field4995 = this.field4881.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field4982 = this.field4881.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5001 = this.field4982 & this.field4995;
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "()V", line = 7006)
    public final void method753() {
        this.field4944 = this.field4811;
        ++field4831;
        this.field5032 = 0;
        this.field5024 = 0;
        this.field4992 = this.field4809;
        OpenGL.glDisable(3089);
        this.method2057(0);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[Lbe;)V", line = 7021)
    public final void method849(int arg0, class28[] arg1) {
        ++field4855;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field4940[var3] = arg1[var3];
        }
        this.field5020 = arg0;
        if (this.field5017 != 1) {
            this.method2074(1528);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lka;Lfq;Ln;Lst;I)V", line = 7046)
    public final void method840(class334 arg0, class137 arg1, class14 arg2, class302 arg3, int arg4) {
        ++field4851;
        arg0.method53(arg2, arg3, arg4);
        this.method798(arg1);
    }

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "(B)V", line = 7057)
    private final void method2098(byte arg0) {
        if (this.field4945) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field4945 = false;
        }
        ++field4770;
        int var2 = 56 % ((22 - arg0) / 57);
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V", line = 7076)
    public final void method785(int arg0) {
        ++field4730;
        this.method2033((byte) -86);
    }

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "(B)V", line = 7086)
    private final void method2099(byte arg0) {
        if (arg0 == -96) {
            ++field4800;
            OpenGL.glDepthMask(this.field4929 && this.field4977);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 7099)
    public final void method822(Canvas arg0) {
        ++field4816;
        if (this.field4828 == arg0) {
            throw new RuntimeException();
        } else if (this.field4744.containsKey(arg0)) {
            Long var2 = (Long) this.field4744.get(arg0);
            this.field4881.releaseSurface(arg0, var2);
            this.field4744.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "()Z", line = 7118)
    public final boolean method771() {
        ++field4782;
        if (this.field4885 != null) {
            if (!this.field4885.method3150((byte) 33)) {
                if (!this.field4888.method607(this.field4885, (byte) 40)) {
                    return false;
                }
                this.field4884.method503(97);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "()F", line = 7155)
    public final float method784() {
        ++field4692;
        return this.field5004;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIIII)V", line = 7166)
    public final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4773;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2049((byte) 85);
        this.method2087(arg5, 16711935);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field4994) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field4994) {
            OpenGL.glEnable(32925);
        }
    }
}
