import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class371 extends class545 {

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4753 = new Hashtable();

    @OriginalMember(owner = "client!ep", name = "se", descriptor = "I")
    public int field4938 = 128;

    @OriginalMember(owner = "client!ep", name = "xe", descriptor = "Luw;")
    private class197 field4943 = new class197();

    @OriginalMember(owner = "client!ep", name = "ze", descriptor = "Luj;")
    private class437 field4945 = new class437();

    @OriginalMember(owner = "client!ep", name = "Ae", descriptor = "Luj;")
    public class437 field4946 = new class437();

    @OriginalMember(owner = "client!ep", name = "Ge", descriptor = "I")
    public int field4952 = 8;

    @OriginalMember(owner = "client!ep", name = "Ee", descriptor = "Z")
    private boolean field4950 = false;

    @OriginalMember(owner = "client!ep", name = "He", descriptor = "I")
    public int field4953 = 3;

    @OriginalMember(owner = "client!ep", name = "Fe", descriptor = "Lfha;")
    private class522 field4951 = new class522();

    @OriginalMember(owner = "client!ep", name = "Ke", descriptor = "[Lcg;")
    private class386[] field4956 = new class386[4];

    @OriginalMember(owner = "client!ep", name = "Ne", descriptor = "I")
    private int field4959 = -1;

    @OriginalMember(owner = "client!ep", name = "Me", descriptor = "I")
    private int field4958 = -1;

    @OriginalMember(owner = "client!ep", name = "Le", descriptor = "[Lcg;")
    private class386[] field4957 = new class386[4];

    @OriginalMember(owner = "client!ep", name = "Ie", descriptor = "[Lcg;")
    private class386[] field4954 = new class386[4];

    @OriginalMember(owner = "client!ep", name = "Pe", descriptor = "I")
    private int field4961 = -1;

    @OriginalMember(owner = "client!ep", name = "Ue", descriptor = "Lfha;")
    private class522 field4966;

    @OriginalMember(owner = "client!ep", name = "We", descriptor = "Lfha;")
    private class522 field4968;

    @OriginalMember(owner = "client!ep", name = "Xe", descriptor = "Lfha;")
    private class522 field4969;

    @OriginalMember(owner = "client!ep", name = "Ye", descriptor = "Lfha;")
    private class522 field4970;

    @OriginalMember(owner = "client!ep", name = "Ze", descriptor = "Lfha;")
    private class522 field4971;

    @OriginalMember(owner = "client!ep", name = "af", descriptor = "Lfha;")
    private class522 field4972;

    @OriginalMember(owner = "client!ep", name = "bf", descriptor = "Lfha;")
    private class522 field4973;

    @OriginalMember(owner = "client!ep", name = "hf", descriptor = "Luj;")
    public class437 field4979;

    @OriginalMember(owner = "client!ep", name = "mf", descriptor = "Luj;")
    public class437 field4983;

    @OriginalMember(owner = "client!ep", name = "nf", descriptor = "Luj;")
    public class437 field4984;

    @OriginalMember(owner = "client!ep", name = "zf", descriptor = "I")
    private int field4996;

    @OriginalMember(owner = "client!ep", name = "Jf", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!ep", name = "Ff", descriptor = "Z")
    private boolean field5002;

    @OriginalMember(owner = "client!ep", name = "Nf", descriptor = "I")
    private int field5010;

    @OriginalMember(owner = "client!ep", name = "rf", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!ep", name = "Kf", descriptor = "F")
    private float field5007;

    @OriginalMember(owner = "client!ep", name = "of", descriptor = "I")
    private int field4985;

    @OriginalMember(owner = "client!ep", name = "gg", descriptor = "I")
    public int field5029;

    @OriginalMember(owner = "client!ep", name = "sf", descriptor = "I")
    private int field4989;

    @OriginalMember(owner = "client!ep", name = "tf", descriptor = "I")
    private int field4990;

    @OriginalMember(owner = "client!ep", name = "xf", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!ep", name = "Sf", descriptor = "F")
    public float field5015;

    @OriginalMember(owner = "client!ep", name = "ag", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!ep", name = "Lg", descriptor = "F")
    private float field5060;

    @OriginalMember(owner = "client!ep", name = "Qg", descriptor = "F")
    public float field5065;

    @OriginalMember(owner = "client!ep", name = "Ig", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!ep", name = "ng", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!ep", name = "Lf", descriptor = "F")
    public float field5008;

    @OriginalMember(owner = "client!ep", name = "qf", descriptor = "F")
    public float field4987;

    @OriginalMember(owner = "client!ep", name = "yg", descriptor = "F")
    private float field5047;

    @OriginalMember(owner = "client!ep", name = "Xf", descriptor = "I")
    private int field5020;

    @OriginalMember(owner = "client!ep", name = "Vg", descriptor = "I")
    public int field5070;

    @OriginalMember(owner = "client!ep", name = "Yg", descriptor = "[Lkb;")
    private class757[] field5073;

    @OriginalMember(owner = "client!ep", name = "Wg", descriptor = "[F")
    private float[] field5071;

    @OriginalMember(owner = "client!ep", name = "Kg", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!ep", name = "Zf", descriptor = "[F")
    public float[] field5022;

    @OriginalMember(owner = "client!ep", name = "tg", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!ep", name = "mg", descriptor = "F")
    public float field5035;

    @OriginalMember(owner = "client!ep", name = "Gf", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!ep", name = "kh", descriptor = "[F")
    private float[] field5085;

    @OriginalMember(owner = "client!ep", name = "fh", descriptor = "I")
    private int field5080;

    @OriginalMember(owner = "client!ep", name = "hh", descriptor = "F")
    private float field5082;

    @OriginalMember(owner = "client!ep", name = "jh", descriptor = "I")
    private int field5084;

    @OriginalMember(owner = "client!ep", name = "Gg", descriptor = "F")
    private float field5055;

    @OriginalMember(owner = "client!ep", name = "bg", descriptor = "F")
    public float field5024;

    @OriginalMember(owner = "client!ep", name = "yf", descriptor = "Z")
    private boolean field4995;

    @OriginalMember(owner = "client!ep", name = "zg", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!ep", name = "oh", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!ep", name = "Eg", descriptor = "[F")
    private float[] field5053;

    @OriginalMember(owner = "client!ep", name = "qh", descriptor = "F")
    public float field5091;

    @OriginalMember(owner = "client!ep", name = "th", descriptor = "[F")
    private float[] field5094;

    @OriginalMember(owner = "client!ep", name = "kg", descriptor = "Ljga;")
    public class128 field5033;

    @OriginalMember(owner = "client!ep", name = "xh", descriptor = "[I")
    public int[] field5098;

    @OriginalMember(owner = "client!ep", name = "vh", descriptor = "[B")
    public byte[] field5096;

    @OriginalMember(owner = "client!ep", name = "zh", descriptor = "[I")
    public int[] field5100;

    @OriginalMember(owner = "client!ep", name = "yh", descriptor = "[I")
    public int[] field5099;

    @OriginalMember(owner = "client!ep", name = "hd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4875;

    @OriginalMember(owner = "client!ep", name = "X", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4761;

    @OriginalMember(owner = "client!ep", name = "ue", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!ep", name = "bc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4817;

    @OriginalMember(owner = "client!ep", name = "qe", descriptor = "J")
    private long field4936;

    @OriginalMember(owner = "client!ep", name = "ed", descriptor = "J")
    private long field4872;

    @OriginalMember(owner = "client!ep", name = "vf", descriptor = "Z")
    public boolean field4992;

    @OriginalMember(owner = "client!ep", name = "ah", descriptor = "I")
    public int field5075;

    @OriginalMember(owner = "client!ep", name = "dh", descriptor = "Ljava/lang/String;")
    private String field5078;

    @OriginalMember(owner = "client!ep", name = "ig", descriptor = "Z")
    public boolean field5031;

    @OriginalMember(owner = "client!ep", name = "Vf", descriptor = "Z")
    public boolean field5018;

    @OriginalMember(owner = "client!ep", name = "Mf", descriptor = "Z")
    private boolean field5009;

    @OriginalMember(owner = "client!ep", name = "Ef", descriptor = "Z")
    public boolean field5001;

    @OriginalMember(owner = "client!ep", name = "Hf", descriptor = "Z")
    private boolean field5004;

    @OriginalMember(owner = "client!ep", name = "Rg", descriptor = "Z")
    public boolean field5066;

    @OriginalMember(owner = "client!ep", name = "Bf", descriptor = "Ljava/lang/String;")
    private String field4998;

    @OriginalMember(owner = "client!ep", name = "fg", descriptor = "Z")
    public boolean field5028;

    @OriginalMember(owner = "client!ep", name = "pg", descriptor = "Z")
    private boolean field5038;

    @OriginalMember(owner = "client!ep", name = "te", descriptor = "Lht;")
    private class393 field4939;

    @OriginalMember(owner = "client!ep", name = "Ce", descriptor = "Lkj;")
    public class290 field4948;

    @OriginalMember(owner = "client!ep", name = "ve", descriptor = "Lkg;")
    private class408 field4941;

    @OriginalMember(owner = "client!ep", name = "ye", descriptor = "Lud;")
    private class136 field4944;

    @OriginalMember(owner = "client!ep", name = "we", descriptor = "Lpea;")
    private class457 field4942;

    @OriginalMember(owner = "client!ep", name = "Dc", descriptor = "I")
    public static int field4845 = 52;

    @OriginalMember(owner = "client!ep", name = "Df", descriptor = "F")
    public float field5000;

    @OriginalMember(owner = "client!ep", name = "Qf", descriptor = "F")
    public float field5013;

    @OriginalMember(owner = "client!ep", name = "Uf", descriptor = "F")
    public float field5017;

    @OriginalMember(owner = "client!ep", name = "jg", descriptor = "F")
    private float field5032;

    @OriginalMember(owner = "client!ep", name = "lg", descriptor = "F")
    private float field5034;

    @OriginalMember(owner = "client!ep", name = "xg", descriptor = "F")
    public float field5046;

    @OriginalMember(owner = "client!ep", name = "Jg", descriptor = "F")
    public float field5058;

    @OriginalMember(owner = "client!ep", name = "Og", descriptor = "F")
    public float field5063;

    @OriginalMember(owner = "client!ep", name = "Ug", descriptor = "F")
    private float field5069;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!ep", name = "U", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!ep", name = "V", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!ep", name = "W", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!ep", name = "Y", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ep", name = "Z", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ep", name = "ab", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!ep", name = "bb", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!ep", name = "cb", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!ep", name = "db", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ep", name = "eb", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ep", name = "fb", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ep", name = "gb", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ep", name = "hb", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ep", name = "ib", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ep", name = "jb", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ep", name = "kb", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ep", name = "lb", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ep", name = "mb", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!ep", name = "nb", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ep", name = "ob", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ep", name = "pb", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ep", name = "qb", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ep", name = "rb", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ep", name = "sb", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ep", name = "tb", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ep", name = "ub", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ep", name = "vb", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ep", name = "wb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ep", name = "xb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ep", name = "yb", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ep", name = "zb", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ep", name = "Ab", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ep", name = "Bb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ep", name = "Cb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ep", name = "Db", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ep", name = "Eb", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!ep", name = "Fb", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ep", name = "Gb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ep", name = "Hb", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ep", name = "Ib", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!ep", name = "Jb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ep", name = "Kb", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ep", name = "Lb", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ep", name = "Mb", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ep", name = "Nb", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!ep", name = "Ob", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ep", name = "Pb", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ep", name = "Qb", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ep", name = "Rb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ep", name = "Sb", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ep", name = "Tb", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ep", name = "Ub", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ep", name = "Vb", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ep", name = "Wb", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ep", name = "Xb", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ep", name = "Yb", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ep", name = "Zb", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ep", name = "ac", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!ep", name = "cc", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!ep", name = "dc", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ep", name = "ec", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!ep", name = "fc", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ep", name = "gc", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ep", name = "hc", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ep", name = "ic", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ep", name = "jc", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ep", name = "kc", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ep", name = "lc", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ep", name = "mc", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ep", name = "nc", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ep", name = "oc", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ep", name = "pc", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ep", name = "qc", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!ep", name = "rc", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ep", name = "sc", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ep", name = "tc", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ep", name = "uc", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!ep", name = "vc", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ep", name = "wc", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ep", name = "xc", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ep", name = "yc", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ep", name = "zc", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ep", name = "Ac", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ep", name = "Bc", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ep", name = "Cc", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ep", name = "Ec", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ep", name = "Fc", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!ep", name = "Gc", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!ep", name = "Hc", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ep", name = "Ic", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!ep", name = "Jc", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ep", name = "Kc", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ep", name = "Lc", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ep", name = "Mc", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ep", name = "Nc", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ep", name = "Oc", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ep", name = "Pc", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ep", name = "Qc", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!ep", name = "Rc", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ep", name = "Sc", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ep", name = "Tc", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ep", name = "Uc", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ep", name = "Vc", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ep", name = "Wc", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ep", name = "Xc", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ep", name = "Yc", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!ep", name = "Zc", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ep", name = "ad", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ep", name = "bd", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ep", name = "cd", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ep", name = "dd", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ep", name = "fd", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ep", name = "gd", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ep", name = "id", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!ep", name = "jd", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ep", name = "kd", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ep", name = "ld", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ep", name = "md", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!ep", name = "nd", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ep", name = "od", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!ep", name = "pd", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ep", name = "qd", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ep", name = "rd", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!ep", name = "sd", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ep", name = "td", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!ep", name = "ud", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!ep", name = "vd", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ep", name = "wd", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!ep", name = "xd", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!ep", name = "yd", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ep", name = "zd", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!ep", name = "Ad", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!ep", name = "Bd", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ep", name = "Dd", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ep", name = "Ed", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ep", name = "Fd", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ep", name = "Gd", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!ep", name = "Hd", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ep", name = "Id", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ep", name = "Jd", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ep", name = "Kd", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ep", name = "Ld", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ep", name = "Md", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ep", name = "Nd", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!ep", name = "Od", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ep", name = "Pd", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ep", name = "Qd", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ep", name = "Rd", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!ep", name = "Sd", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ep", name = "Td", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ep", name = "Ud", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!ep", name = "Vd", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!ep", name = "Wd", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ep", name = "Xd", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!ep", name = "Yd", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ep", name = "Zd", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!ep", name = "ae", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!ep", name = "be", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!ep", name = "ce", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!ep", name = "de", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ep", name = "ee", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!ep", name = "fe", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ep", name = "ge", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!ep", name = "he", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ep", name = "ie", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ep", name = "je", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!ep", name = "ke", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ep", name = "le", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!ep", name = "me", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!ep", name = "ne", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ep", name = "oe", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ep", name = "pe", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ep", name = "re", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!ep", name = "Be", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!ep", name = "Se", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!ep", name = "Te", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!ep", name = "Ve", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!ep", name = "cf", descriptor = "I")
    private int field4974;

    @OriginalMember(owner = "client!ep", name = "df", descriptor = "I")
    private int field4975;

    @OriginalMember(owner = "client!ep", name = "lf", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!ep", name = "Cf", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!ep", name = "hg", descriptor = "I")
    private int field5030;

    @OriginalMember(owner = "client!ep", name = "Ag", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!ep", name = "Ng", descriptor = "I")
    private int field5062;

    @OriginalMember(owner = "client!ep", name = "Tg", descriptor = "I")
    private int field5068;

    @OriginalMember(owner = "client!ep", name = "Xg", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!ep", name = "Zg", descriptor = "I")
    public int field5074;

    @OriginalMember(owner = "client!ep", name = "bh", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!ep", name = "ch", descriptor = "I")
    private int field5077;

    @OriginalMember(owner = "client!ep", name = "mh", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!ep", name = "nh", descriptor = "I")
    private int field5088;

    @OriginalMember(owner = "client!ep", name = "rh", descriptor = "I")
    public int field5092;

    @OriginalMember(owner = "client!ep", name = "uh", descriptor = "I")
    private int field5095;

    @OriginalMember(owner = "client!ep", name = "wh", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!ep", name = "gf", descriptor = "J")
    private long field4978;

    @OriginalMember(owner = "client!ep", name = "sg", descriptor = "Len;")
    private class111 field5041;

    @OriginalMember(owner = "client!ep", name = "Tf", descriptor = "Ldd;")
    private class146 field5016;

    @OriginalMember(owner = "client!ep", name = "wf", descriptor = "Lml;")
    public class178 field4993;

    @OriginalMember(owner = "client!ep", name = "Af", descriptor = "Lml;")
    public class178 field4997;

    @OriginalMember(owner = "client!ep", name = "Of", descriptor = "Lml;")
    public class178 field5011;

    @OriginalMember(owner = "client!ep", name = "Yf", descriptor = "Lml;")
    public class178 field5021;

    @OriginalMember(owner = "client!ep", name = "dg", descriptor = "Lml;")
    public class178 field5026;

    @OriginalMember(owner = "client!ep", name = "eg", descriptor = "Lml;")
    public class178 field5027;

    @OriginalMember(owner = "client!ep", name = "og", descriptor = "Lml;")
    public class178 field5037;

    @OriginalMember(owner = "client!ep", name = "qg", descriptor = "Lml;")
    public class178 field5039;

    @OriginalMember(owner = "client!ep", name = "wg", descriptor = "Lml;")
    public class178 field5045;

    @OriginalMember(owner = "client!ep", name = "Sg", descriptor = "Lml;")
    public class178 field5067;

    @OriginalMember(owner = "client!ep", name = "Hg", descriptor = "Lfq;")
    public class204 field5056;

    @OriginalMember(owner = "client!ep", name = "pf", descriptor = "Lhu;")
    private class227 field4986;

    @OriginalMember(owner = "client!ep", name = "gh", descriptor = "Lhu;")
    private class227 field5081;

    @OriginalMember(owner = "client!ep", name = "cg", descriptor = "Leca;")
    public class329 field5025;

    @OriginalMember(owner = "client!ep", name = "Mg", descriptor = "Leca;")
    public class329 field5061;

    @OriginalMember(owner = "client!ep", name = "Pg", descriptor = "Lvi;")
    private class368 field5064;

    @OriginalMember(owner = "client!ep", name = "Qe", descriptor = "Lcg;")
    private class386 field4962;

    @OriginalMember(owner = "client!ep", name = "Re", descriptor = "Lcg;")
    private class386 field4963;

    @OriginalMember(owner = "client!ep", name = "Je", descriptor = "Lkn;")
    private class517 field4955;

    @OriginalMember(owner = "client!ep", name = "Oe", descriptor = "Ltea;")
    private class564 field4960;

    @OriginalMember(owner = "client!ep", name = "rg", descriptor = "Ltea;")
    public class564 field5040;

    @OriginalMember(owner = "client!ep", name = "De", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4949;

    @OriginalMember(owner = "client!ep", name = "ef", descriptor = "Z")
    private boolean field4976;

    @OriginalMember(owner = "client!ep", name = "ff", descriptor = "Z")
    private boolean field4977;

    @OriginalMember(owner = "client!ep", name = "jf", descriptor = "Z")
    private boolean field4980;

    @OriginalMember(owner = "client!ep", name = "kf", descriptor = "Z")
    private boolean field4981;

    @OriginalMember(owner = "client!ep", name = "uf", descriptor = "Z")
    public boolean field4991;

    @OriginalMember(owner = "client!ep", name = "If", descriptor = "Z")
    public boolean field5005;

    @OriginalMember(owner = "client!ep", name = "Pf", descriptor = "Z")
    public boolean field5012;

    @OriginalMember(owner = "client!ep", name = "Wf", descriptor = "Z")
    public boolean field5019;

    @OriginalMember(owner = "client!ep", name = "ug", descriptor = "Z")
    private boolean field5043;

    @OriginalMember(owner = "client!ep", name = "vg", descriptor = "Z")
    private boolean field5044;

    @OriginalMember(owner = "client!ep", name = "Bg", descriptor = "Z")
    private boolean field5050;

    @OriginalMember(owner = "client!ep", name = "Cg", descriptor = "Z")
    private boolean field5051;

    @OriginalMember(owner = "client!ep", name = "Dg", descriptor = "Z")
    private boolean field5052;

    @OriginalMember(owner = "client!ep", name = "Fg", descriptor = "Z")
    public boolean field5054;

    @OriginalMember(owner = "client!ep", name = "eh", descriptor = "Z")
    public boolean field5079;

    @OriginalMember(owner = "client!ep", name = "ih", descriptor = "Z")
    public boolean field5083;

    @OriginalMember(owner = "client!ep", name = "lh", descriptor = "Z")
    private boolean field5086;

    @OriginalMember(owner = "client!ep", name = "ph", descriptor = "Z")
    private boolean field5090;

    @OriginalMember(owner = "client!ep", name = "sh", descriptor = "Z")
    public boolean field5093;

    @OriginalMember(owner = "client!ep", name = "Rf", descriptor = "[Lhl;")
    private class396[] field5014;

    @OriginalMember(owner = "client!ep", name = "Cd", descriptor = "[Ljava/lang/String;")
    public static String[] field4896;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIBI)V")
    public final void method2067(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = -29 / ((-6 - arg2) / 45);
        ++field4827;
        OpenGL.glDrawArrays(arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Luha;)V")
    public final void method2068(class723 arg0) {
        ++field4874;
        this.field4979.method864(arg0);
        this.field4983.method864(this.field4979);
        this.field4983.method2622(false);
        this.field4984.method2625(this.field4983, true);
        if (this.field5068 != 1) {
            this.method2215(103);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcha;)V")
    public final void method595(class279 arg0) {
        ++field4916;
    }

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "(III)V")
    public final void method2069(int arg0, int arg1, int arg2) {
        if (this.field5036 != arg0 || this.field5042 != arg1 || ~this.field5048 != ~arg2) {
            this.field5042 = arg1;
            this.field5036 = arg0;
            this.field5048 = arg2;
            this.method2088((byte) 39);
            this.method2076(false);
        }
        ++field4901;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([IIIIIZ)Lcw;")
    public final class21 method2070(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4910;
        return new class517(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "(I)V")
    public final void method2071(int arg0) {
        ++field4742;
        this.method2083((byte) -37);
    }

    @OriginalMember(owner = "client!ep", name = "GA", descriptor = "(I)V")
    public final void method563(int arg0) {
        this.method2121(0, 1);
        ++field4778;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8) {
        ++field4891;
        class669 var10 = (class669) arg6;
        class146 var11 = var10.field9416;
        this.method2185((byte) 63);
        this.method2154(var10.field9416, -2);
        this.method2121(arg5, 1);
        this.method2207(7681, 8448, -25248);
        this.method2202(390803672, 768, 34167, 0);
        float var12 = var11.field2025 / (float) var11.field2023;
        float var13 = var11.field2019 / (float) var11.field2028;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2202(390803672, 768, 5890, 0);
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)V")
    public final void method2073(int arg0) {
        ++field4828;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field4938 = arg0;
            this.field4939.method2396(73);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
    private final void method2074(int arg0) {
        ++field4799;
        float var2 = (float) (-this.field5070) * this.field5082 / (float) this.field5023;
        float var3 = (float) (-this.field5057) * this.field5082 / (float) this.field5006;
        float var4 = (float) (-this.field5070 + this.field4820) * this.field5082 / (float) this.field5023;
        float var5 = (float) (this.field4894 - this.field5057) * this.field5082 / (float) this.field5006;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field4988, (double) this.field4985);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FB)V")
    public final void method2075(float arg0, byte arg1) {
        ++field4906;
        if (this.field5082 != arg0) {
            this.field5082 = arg0;
            if (~this.field5068 == -4) {
                this.method2074(5889);
            }
        }
        if (arg1 > -127) {
            this.field5099 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(Z)V")
    private final void method2076(boolean arg0) {
        ++field4892;
        if (this.field5043 && ~this.field5042 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0) {
            this.method2072(-85, 69, -48, 43, 87, 106, (class571) null, -97, -81);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZILjaclib/memory/Buffer;II)Lhu;")
    public final class227 method2077(boolean arg0, int arg1, Buffer arg2, int arg3, int arg4) {
        int var6 = -114 / ((-24 - arg1) / 47);
        ++field4829;
        return (class227) (!this.field5009 || arg0 && !this.field5004 ? new class660(this, arg4, arg2) : new class714(this, arg4, arg2, arg3, arg0));
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)V")
    public final synchronized void method2078(byte arg0, int arg1) {
        ++field4934;
        if (arg0 != -85) {
            this.method2128(-118, -47, -20);
        }
        class513 var3 = new class513();
        var3.field7166 = (long) arg1;
        this.field4972.method3116(29066, var3);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "()Z")
    public final boolean method2079() {
        ++field4902;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)Lmp;")
    public final class315 method628(int arg0, int arg1) {
        ++field4878;
        return null;
    }

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "(I)V")
    private final void method2080(int arg0) {
        class400.field5530[3] = 1.0F;
        if (arg0 < -7) {
            class400.field5530[1] = this.field5046 * this.field5024;
            class400.field5530[2] = this.field5046 * this.field5035;
            ++field4773;
            class400.field5530[0] = this.field5046 * this.field5015;
            OpenGL.glLightModelfv(2899, class400.field5530, 0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "DA", descriptor = "(IIII)V")
    public final void method2081(int arg0, int arg1, int arg2, int arg3) {
        ++field4810;
        this.field5023 = arg2;
        this.field5006 = arg3;
        this.field5070 = arg0;
        this.field5057 = arg1;
        this.method2089(8638);
        this.method2217(true);
        if (~this.field5068 != -4) {
            if (~this.field5068 == -3) {
                this.method2158((byte) -84);
                return;
            }
        } else {
            this.method2074(5889);
        }
    }

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "()I")
    public final int method593() {
        ++field4860;
        int var1 = this.field5097;
        this.field5097 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "(I)V")
    private final void method2082(int arg0) {
        if (arg0 != 2) {
            this.method2206(-52);
        }
        if (this.field5084 <= this.field5020 && ~this.field5010 <= ~this.field5003) {
            OpenGL.glScissor(this.field5084 + this.field4989, this.field4996 + this.field4894 + -this.field5010, -this.field5084 + this.field5020, -this.field5003 + this.field5010);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field4932;
    }

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "()V")
    public final void method556() {
        ++field4813;
        if (this.field5038 && this.field4820 > 0 && this.field4894 > 0) {
            int var1 = this.field5084;
            int var2 = this.field5020;
            int var3 = this.field5003;
            int var4 = this.field5010;
            this.method2198();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2111(-12787);
            this.method2150(false, 0);
            this.method2197(false, (byte) -88);
            this.method2204(false, false);
            this.method2192(-17, false);
            this.method2154((class396) null, -2);
            this.method2103((byte) 123, -2);
            this.method2208(1, 6406);
            this.method2121(0, 1);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4820, this.field4894, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method2097(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    private final void method2083(byte arg0) {
        ++field4748;
        int var2 = 0;
        if (arg0 != -37) {
            this.method2070((int[]) null, -67, -4, -48, -95, false);
        }
        while (!this.field4817.method3381()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class740.method4124(1000L, 47);
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(Z)V")
    private final void method2084(boolean arg0) {
        ++field4745;
        if (arg0) {
            this.method2071(104);
        }
        int var2;
        for (var2 = 0; var2 < this.field4999; ++var2) {
            class757 var3 = this.field5073[var2];
            int var4 = var2 + 16386;
            class689.field9663[0] = (float) var3.method4203(20918);
            class689.field9663[1] = (float) var3.method4212(-54);
            class689.field9663[2] = (float) var3.method4205((byte) 8);
            class689.field9663[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class689.field9663, 0);
            int var5 = var3.method4209((byte) -66);
            float var6 = var3.method4211((byte) -111) / 255.0F;
            class689.field9663[1] = var6 * (float) class136.method878(var5 >> 8, 255);
            class689.field9663[2] = var6 * (float) class136.method878(255, var5);
            class689.field9663[0] = var6 * (float) (class136.method878(var5, 16740682) >> 16);
            OpenGL.glLightfv(var4, 4609, class689.field9663, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method4206((byte) -22) * var3.method4206((byte) 117)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field5077) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field5077 = this.field4999;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Loq;[Ltba;Z)Lda;")
    public final class400 method2085(class742 arg0, class320[] arg1, boolean arg2) {
        ++field4853;
        return new class489(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()Z")
    public final boolean method2086() {
        ++field4907;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "()V")
    public final void method625() {
        ++field4876;
        if (this.field4944 != null && this.field4944.method1464(1)) {
            this.field4941.method2486(this.field4944, true);
            this.field4939.method2396(71);
        }
    }

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "()Luha;")
    public final class723 method2087() {
        ++field4756;
        return this.field4945;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
    private final void method2088(byte arg0) {
        ++field4795;
        this.field5069 = (float) (this.field4985 - this.field5048) + -this.field5055;
        this.field5063 = this.field5069 - (float) this.field5042 * this.field5007;
        if (this.field5063 < (float) this.field4988) {
            this.field5063 = (float) this.field4988;
        }
        OpenGL.glFogf(2915, this.field5063);
        OpenGL.glFogf(2916, this.field5069);
        class400.field5530[1] = (float) class136.method878(this.field5036, 65280) / 65280.0F;
        int var2 = 87 % ((-76 - arg0) / 48);
        class400.field5530[2] = (float) class136.method878(this.field5036, 255) / 255.0F;
        class400.field5530[0] = (float) class136.method878(16711680, this.field5036) / 1.671168E7F;
        OpenGL.glFogfv(2918, class400.field5530, 0);
    }

    @OriginalMember(owner = "client!ep", name = "ya", descriptor = "()V")
    public final void method610() {
        this.method2192(102, true);
        ++field4832;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "(I)V")
    private final void method2089(int arg0) {
        ++field4849;
        float[] var2 = this.field5053;
        if (arg0 != 8638) {
            this.method2184((byte) 58);
        }
        float var3 = (float) (-this.field5070 * this.field4988) / (float) this.field5023;
        float var4 = (float) ((this.field4820 - this.field5070) * this.field4988) / (float) this.field5023;
        float var5 = (float) (this.field5057 * this.field4988) / (float) this.field5006;
        float var6 = (float) ((-this.field4894 + this.field5057) * this.field4988) / (float) this.field5006;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field4988 * 2.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field5034 = (float) (-(this.field4988 + this.field4985)) / (float) (-this.field4988 + this.field4985);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[11] = -1.0F;
            var2[0] = var7 / (var4 - var3);
            var2[15] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = this.field5032 = -((float) this.field4985 * var7) / (float) (-this.field4988 + this.field4985);
        } else {
            var2[10] = 1.0F;
            var2[1] = 0.0F;
            var2[11] = 0.0F;
            var2[8] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = 1.0F;
            var2[13] = 0.0F;
            var2[5] = 1.0F;
            var2[3] = 0.0F;
            var2[15] = 1.0F;
        }
        this.method2231(10);
    }

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "(IIII)V")
    public final void method2090(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field5010 < ~arg3) {
            this.field5010 = arg3;
        }
        if (~arg2 > ~this.field5020) {
            this.field5020 = arg2;
        }
        if (this.field5084 < arg0) {
            this.field5084 = arg0;
        }
        ++field4933;
        if (~arg1 < ~this.field5003) {
            this.field5003 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method2217(true);
        this.method2082(2);
    }

    @OriginalMember(owner = "client!ep", name = "za", descriptor = "(IIIII)V")
    public final void method2091(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field4775;
        if (~(arg0 + arg2) <= ~this.field5084 && this.field5020 >= arg0 - arg2 && arg1 - -arg2 >= this.field5003 && this.field5010 >= -arg2 + arg1) {
            this.method2165((byte) -9);
            this.method2121(arg4, 1);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field5047) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field5060 >= (float) var8) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (var9 <= 64) {
                    var9 = 64;
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class655.method3787((byte) 116, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class543.field7598[var11] * (float) arg2 + var6, class543.field7588[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[I[I)Laa;")
    public final class571 method2092(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4736;
        return class312.method1822(this, arg0, arg1, -1089, arg3, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(II)V")
    public final void method632(int arg0, int arg1) throws class425 {
        ++field4903;
        try {
            this.field4817.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "(ILaa;II)V")
    public final void method2093(int arg0, class571 arg1, int arg2, int arg3) {
        ++field4869;
        class669 var5 = (class669) arg1;
        class146 var6 = var5.field9416;
        this.method2185((byte) 104);
        this.method2154(var5.field9416, -2);
        this.method2121(1, 1);
        this.method2207(7681, 8448, -25248);
        this.method2202(390803672, 768, 34167, 0);
        float var7 = var6.field2025 / (float) var6.field2023;
        float var8 = var6.field2019 / (float) var6.field2028;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5084) * var7, (float) (-arg3 + this.field5003) * var8);
        OpenGL.glVertex2i(this.field5084, this.field5003);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5084) * var7, (float) (this.field5010 - arg3) * var8);
        OpenGL.glVertex2i(this.field5084, this.field5010);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5020) * var7, (float) (-arg3 + this.field5010) * var8);
        OpenGL.glVertex2i(this.field5020, this.field5010);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5020) * var7, (float) (this.field5003 - arg3) * var8);
        OpenGL.glVertex2i(this.field5020, this.field5003);
        OpenGL.glEnd();
        this.method2202(390803672, 768, 5890, 0);
    }

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "(I)V")
    private final void method2094(int arg0) {
        this.field5014 = new class396[this.field5074];
        ++field4800;
        this.field5056 = new class204(this, 3553, 6408, 1, 1);
        new class204(this, 3553, 6408, 1, 1);
        if (arg0 == 32569) {
            new class204(this, 3553, 6408, 1, 1);
            this.field5021 = new class178(this);
            this.field4993 = new class178(this);
            this.field5067 = new class178(this);
            this.field4997 = new class178(this);
            this.field5037 = new class178(this);
            this.field5011 = new class178(this);
            this.field5045 = new class178(this);
            this.field5039 = new class178(this);
            this.field5027 = new class178(this);
            this.field5026 = new class178(this);
            if (this.field5028) {
                this.field5040 = new class564(this);
                new class564(this);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2095(Canvas arg0) {
        this.field4872 = 0L;
        this.field4761 = null;
        ++field4790;
        if (arg0 != null && this.field4875 != arg0) {
            if (this.field4753.containsKey(arg0)) {
                Long var2 = (Long) this.field4753.get(arg0);
                this.field4872 = var2;
                this.field4761 = arg0;
            }
        } else {
            this.field4872 = this.field4936;
            this.field4761 = this.field4875;
        }
        if (this.field4761 != null && this.field4872 != 0L) {
            this.field4817.setSurface(this.field4872);
            this.method2175(-90);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "()V")
    public final void method589() {
        ++field4905;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIZ)V")
    public final void method2096(int arg0, int arg1, boolean arg2) {
        this.method2199(-26468, arg0, true, arg2);
        if (arg1 != 12575) {
            this.field4981 = false;
        }
        ++field4743;
    }

    @OriginalMember(owner = "client!ep", name = "KA", descriptor = "(IIII)V")
    public final void method2097(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 < ~this.field4894) {
            arg3 = this.field4894;
        }
        ++field4925;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg2 < ~this.field4820) {
            arg2 = this.field4820;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        this.field5010 = arg3;
        this.field5003 = arg1;
        this.field5084 = arg0;
        this.field5020 = arg2;
        OpenGL.glEnable(3089);
        this.method2217(true);
        this.method2082(2);
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    public final void method2098(int arg0) {
        ++field4771;
    }

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "()Z")
    public final boolean method2099() {
        ++field4758;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "()Z")
    public final boolean method2100() {
        ++field4879;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(II)I")
    public final int method2101(int arg0, int arg1) {
        ++field4814;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(Z)Lrh;")
    public final class633 method2102(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field4924;
            return this.field5041 != null ? this.field5041.method748(8448) : null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(BI)V")
    public final void method2103(byte arg0, int arg1) {
        ++field4927;
        this.method2096(arg1, 12575, true);
        int var3 = -128 % ((arg0 - 57) / 57);
    }

    @OriginalMember(owner = "client!ep", name = "X", descriptor = "(I)V")
    public final void method2104(int arg0) {
        ++field4840;
        this.field4953 = 0;
        while (arg0 > 1) {
            ++this.field4953;
            arg0 >>= 1;
        }
        this.field4952 = 1 << this.field4953;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I")
    public final int method2105(int arg0, int arg1) {
        ++field4744;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I[Lkb;)V")
    public final void method2106(int arg0, class757[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5073[var3] = arg1[var3];
        }
        ++field4926;
        this.field4999 = arg0;
        if (~this.field5068 != -2) {
            this.method2084(false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "Y", descriptor = "()[I")
    public final int[] method2107() {
        ++field4868;
        return new int[] { this.field5070, this.field5057, this.field5023, this.field5006 };
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)V")
    public final void method574(int arg0, int arg1, int arg2, int arg3) {
        this.field4941.method2487(arg0, arg2, arg3, arg1, false);
        ++field4915;
    }

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "(I)V")
    public final void method2108(int arg0) {
        ++field4914;
        OpenGL.glLightfv(16384, 4611, this.field5022, arg0);
        OpenGL.glLightfv(16385, 4611, this.field5071, 0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FIFF)V")
    private final void method2109(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 <= -38) {
            ++field4883;
            OpenGL.glMatrixMode(5890);
            if (this.field5050) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg0, arg3, arg2);
            OpenGL.glMatrixMode(5888);
            this.field5050 = true;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method2165((byte) -9);
        ++field4858;
        this.method2121(arg12, 1);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "(I)V")
    public final void method2111(int arg0) {
        ++field4873;
        if (this.field5068 != 0) {
            this.field5068 = 0;
            this.field4975 &= -32;
        }
        if (arg0 != -12787) {
            this.method2224((Canvas) null, -14, 45);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lev;I)V")
    public final void method2112(class347 arg0, int arg1) {
        ++field4801;
        this.field4943.method1327(-28861, arg1, this, arg0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZ)Lcw;")
    public final class21 method2113(int arg0, int arg1, boolean arg2) {
        ++field4864;
        return new class517(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILvi;)V")
    public final void method2114(int arg0, class368 arg1) {
        if (arg0 != -2059453976) {
            this.field5037 = null;
        }
        ++field4895;
        if (this.field5064 != arg1) {
            if (this.field5009) {
                OpenGL.glBindBufferARB(34963, arg1.method1854(655));
            }
            this.field5064 = arg1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4909;
        float var10;
        float var11;
        if (this.field5016 != null && ~arg2 >= ~this.field5016.field2934 && ~arg3 >= ~this.field5016.field2924) {
            this.field5016.method1366(0, (byte) 20, 0, 0, false, arg6, arg2, arg3, 0, 6406);
            var10 = (float) arg3 * this.field5016.field2019 / (float) this.field5016.field2924;
            var11 = (float) arg2 * this.field5016.field2025 / (float) this.field5016.field2934;
        } else {
            this.field5016 = class60.method392(arg6, false, (byte) 89, 6406, this, arg2, arg3, 6406);
            this.field5016.method1364(false, false, 10242);
            var10 = this.field5016.field2019;
            var11 = this.field5016.field2025;
        }
        this.method2185((byte) 62);
        this.method2154(this.field5016, -2);
        this.method2121(arg8, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2212((byte) -90, arg5);
        this.method2207(34165, 34165, -25248);
        this.method2202(390803672, 768, 34166, 0);
        this.method2202(390803672, 770, 5890, 2);
        this.method2190(0, 770, true, 34166);
        this.method2190(2, 770, true, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2202(390803672, 768, 5890, 0);
        this.method2202(390803672, 770, 34166, 2);
        this.method2190(0, 770, true, 5890);
        this.method2190(2, 770, true, 34166);
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
    private final void method2116(byte arg0) {
        if (arg0 >= -40) {
            this.method2203();
        }
        this.field4817.method3383();
        ++field4740;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public final void method559(boolean arg0) {
        ++field4766;
    }

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "(I)V")
    private final void method2117(int arg0) {
        if (arg0 != 0) {
            this.field5002 = true;
        }
        if (~this.field5068 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4820 < -1 && ~this.field4894 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field4820, (double) this.field4894, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5068 = 1;
            this.field4975 &= -25;
        }
        ++field4768;
    }

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "(I)V")
    public final void method2118(int arg0) {
        if (this.field4975 != 8) {
            this.method2167(false);
            this.method2150(true, 0);
            this.method2204(true, false);
            this.method2192(-11, true);
            this.method2121(1, 1);
            this.field4975 = 8;
        }
        ++field4897;
        if (arg0 >= -120) {
            this.field5037 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class371(Canvas arg0, class268 arg1, int arg2) {
        super(arg1);
        new class98();
        new class209(16);
        this.field4966 = new class522();
        this.field4968 = new class522();
        this.field4969 = new class522();
        this.field4970 = new class522();
        this.field4971 = new class522();
        this.field4972 = new class522();
        this.field4973 = new class522();
        this.field4979 = new class437();
        this.field4983 = new class437();
        this.field4984 = new class437();
        this.field4996 = 0;
        this.field5006 = 512;
        this.field5002 = false;
        this.field5010 = 0;
        this.field4988 = 50;
        this.field5007 = 1.0F;
        this.field4985 = 3584;
        this.field5029 = -1;
        this.field4989 = 0;
        this.field4990 = 8448;
        this.field4994 = -1;
        this.field5015 = 1.0F;
        this.field5023 = 512;
        this.field5060 = -1.0F;
        this.field5065 = 3584.0F;
        this.field5057 = 0;
        this.field5036 = -1;
        this.field5008 = -1.0F;
        this.field4987 = -1.0F;
        this.field5047 = -1.0F;
        this.field5020 = 0;
        this.field5070 = 0;
        this.field5073 = new class757[class503.field7034];
        this.field5071 = new float[4];
        this.field5059 = 0;
        this.field5022 = new float[4];
        this.field5042 = -1;
        this.field5035 = 1.0F;
        this.field5003 = 0;
        this.field5085 = new float[4];
        this.field5080 = 8448;
        this.field5082 = 1.0F;
        this.field5084 = 0;
        this.field5055 = 0.0F;
        this.field5024 = 1.0F;
        this.field4995 = true;
        this.field5048 = 0;
        this.field5089 = -1;
        this.field5053 = new float[16];
        this.field5091 = 3584.0F;
        this.field5094 = new float[4];
        this.field5033 = new class128(8192);
        this.field5098 = new int[1];
        this.field5096 = new byte[16384];
        this.field5100 = new int[1];
        this.field5099 = new int[1];
        this.field4761 = this.field4875 = arg0;
        this.field4940 = arg2;
        if (!class389.method2365("jaclib", (byte) -67)) {
            throw new RuntimeException("");
        } else if (!class389.method2365("jaggl", (byte) -108)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4817 = new OpenGL();
                this.field4872 = this.field4936 = this.field4817.init(arg0, 8, 8, 8, 24, 0, this.field4940);
                if (~this.field4936 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2083((byte) -37);
                    int var4 = this.method2138((byte) 73);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field5075 = this.field4992 ? 33639 : 5121;
                        if (this.field5078.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class498.method2984(this.field5078.replace('/', ' '), ' ', -97);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class264.method1628(var10.substring(1, 3), 0)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class264.method1628(var10.substring(0, 4), 0)) {
                                                var5 = class665.method3815(var10.substring(0, 4), -127);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field5031 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field5018 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field5009 = false;
                                }
                            }
                            this.field5001 &= this.field4817.method3382("GL_ARB_half_float_pixel");
                            this.field5004 = this.field5009;
                            this.field5066 = true;
                        }
                        if (~this.field4998.indexOf("intel") != 0) {
                            this.field5028 = false;
                        }
                        this.field5038 = !this.field4998.equals("s3 graphics");
                        if (this.field5009) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class594.method3523(false, (byte) -127, true);
                        this.field4950 = true;
                        this.field4939 = new class393(this, super.field7694);
                        this.method2094(32569);
                        this.field4948 = new class290(this);
                        this.field4941 = new class408(this);
                        if (this.field4941.method2492(-33)) {
                            this.field4944 = new class136(this);
                            if (!this.field4944.method880(16847)) {
                                this.field4944.method881(0);
                                this.field4944 = null;
                            }
                        }
                        this.field4942 = new class457(this);
                        this.method2216(10837);
                        this.method2175(-104);
                        this.method556();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method587();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIZ)Lcw;")
    public final class21 method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4764;
        return new class517(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2120(int arg0, long arg1) {
        if (arg0 != 6408) {
            this.field5066 = false;
        }
        ++field4911;
        class513 var4 = new class513();
        var4.field7166 = arg1;
        this.field4973.method3116(arg0 + 22658, var4);
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(II)V")
    public final void method2121(int arg0, int arg1) {
        ++field4789;
        if (this.field4974 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg0 == -3) {
                var4 = true;
                var3 = false;
                var5 = 2;
            } else if (~arg0 != -129) {
                var5 = 0;
                var3 = false;
                var4 = true;
            } else {
                var5 = 3;
                var4 = true;
                var3 = true;
            }
            if (this.field4980 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field4980 = var4;
            }
            if (!this.field4976 == var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field4976 = var3;
            }
            if (this.field4982 != var5) {
                if (var5 != 1) {
                    if (var5 != 2) {
                        if (var5 == 3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field4982 = var5;
            }
            this.field4975 &= -29;
            this.field4974 = arg0;
        }
        if (arg1 != 1) {
            this.method2117(-80);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lev;)V")
    public final void method2122(class347 arg0) {
        this.field4943.method1327(-28861, -1, this, arg0);
        ++field4821;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIIID)V")
    public final void method614(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field4922;
    }

    @OriginalMember(owner = "client!ep", name = "da", descriptor = "(III[I)V")
    public final void method2123(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4776;
        float var5 = (float) arg2 * this.field4979.field6000 + (float) arg0 * this.field4979.field6007 + (float) arg1 * this.field4979.field6008 + this.field4979.field6001;
        if (!((float) this.field4988 > var5) && !(var5 > (float) this.field4985)) {
            int var6 = (int) (((float) arg2 * this.field4979.field5996 + (float) arg0 * this.field4979.field5989 + (float) arg1 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / var5);
            int var7 = (int) (((float) arg2 * this.field4979.field5980 + (float) arg0 * this.field4979.field5993 + (float) arg1 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / var5);
            if ((float) var6 >= this.field5013 && (float) var6 <= this.field5017 && (float) var7 >= this.field5000 && this.field5058 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field5000);
                arg3[0] = (int) ((float) var6 + -this.field5013);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "()I")
    public final int method2124() {
        ++field4818;
        return 4;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)V")
    public final void method2125(byte arg0) {
        if (~this.field4975 != -17) {
            this.method2181(122);
            this.method2150(true, 0);
            this.method2204(true, false);
            this.method2192(0, true);
            this.method2121(1, 1);
            this.field4975 = 16;
        }
        if (arg0 <= -15) {
            ++field4762;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ltba;Z)Lcw;")
    public final class21 method2126(class320 arg0, boolean arg1) {
        ++field4848;
        int[] var3 = new int[arg0.field4122 * arg0.field4121];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4124 != null) {
            for (int var6 = 0; var6 < arg0.field4121; ++var6) {
                for (int var7 = 0; ~arg0.field4122 < ~var7; ++var7) {
                    var3[var5++] = class747.method4153(arg0.field4124[var4] << 24, arg0.field4128[class136.method878(255, arg0.field4125[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field4121 > var8; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field4122; ++var10) {
                    int var11 = arg0.field4128[arg0.field4125[var4++] & 255];
                    var3[var5++] = var11 != 0 ? class747.method4153(-16777216, var11) : 0;
                }
            }
        }
        class21 var9 = this.method3258(var3, 1, 0, arg0.field4122, arg0.field4122, arg0.field4121);
        var9.method106(arg0.field4127, arg0.field4123, arg0.field4126, arg0.field4120);
        return var9;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([I)V")
    public final void method2127(int[] arg0) {
        ++field4918;
        arg0[0] = this.field4820;
        arg0[1] = this.field4894;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(III)V")
    public final synchronized void method2128(int arg0, int arg1, int arg2) {
        ++field4917;
        class285 var4 = new class285(arg2);
        var4.field7166 = (long) arg1;
        if (arg0 != 8146) {
            this.field5052 = false;
        }
        this.field4968.method3116(29066, var4);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFF)V")
    public final void method570(float arg0, float arg1, float arg2) {
        class409.field5692 = arg2;
        class123.field1686 = arg0;
        ++field4888;
        class238.field3307 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(Z)V")
    public static void method2129(boolean arg0) {
        field4896 = null;
        if (!arg0) {
            method2129(false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "(I)V")
    private final void method2130(int arg0) {
        if (this.field5090 && !this.field5051) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 == 2896) {
            ++field4777;
        }
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "()Z")
    public final boolean method608() {
        ++field4760;
        if (this.field4944 != null) {
            if (!this.field4944.method1464(1)) {
                if (!this.field4941.method2488(this.field4944, 2)) {
                    return false;
                }
                this.field4939.method2396(76);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "(III[I)V")
    public final void method2131(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4826;
        float var5 = (float) arg2 * this.field4979.field6000 + (float) arg0 * this.field4979.field6007 + (float) arg1 * this.field4979.field6008 + this.field4979.field6001;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4979.field5996 + (float) arg0 * this.field4979.field5989 + (float) arg1 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / var5);
            arg3[0] = (int) ((float) var6 - this.field5013);
            int var7 = (int) (((float) arg2 * this.field4979.field5980 + (float) arg0 * this.field4979.field5993 + (float) arg1 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field5000);
        }
    }

    @OriginalMember(owner = "client!ep", name = "xa", descriptor = "(F)V")
    public final void method2132(float arg0) {
        if (this.field5046 != arg0) {
            this.field5046 = arg0;
            this.method2080(-73);
        }
        ++field4772;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcg;B)V")
    public final void method2133(class386 arg0, byte arg1) {
        int var3 = 32 % ((43 - arg1) / 44);
        ++field4737;
        if (~this.field4961 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field4961 <= -1) {
                this.field4957[this.field4961].method2355(13095);
            }
            this.field4963 = this.field4957[++this.field4961] = arg0;
            this.field4963.method2354(21064);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIIIII)Lcd;")
    public final class22 method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4908;
        return this.field5019 ? new class476(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "()V")
    public final void method587() {
        ++field4859;
        for (class513 var1 = this.field4951.method3118((byte) 73); var1 != null; var1 = this.field4951.method3111(121)) {
            ((class477) var1).method2826((byte) -71);
        }
        if (this.field4941 != null) {
            this.field4941.method2491(1);
        }
        if (this.field4817 != null) {
            this.method2116((byte) -119);
            Enumeration var2 = this.field4753.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4753.get(var3);
                this.field4817.releaseSurface(var3, var4);
            }
            this.field4817.release();
            this.field4817 = null;
        }
        if (this.field4950) {
            class729.method4066(true, false, -2679);
            this.field4950 = false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "()Luha;")
    public final class723 method2135() {
        ++field4812;
        return this.field4979;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcd;)V")
    public final void method2136(class22 arg0) {
        this.field5041 = (class111) arg0;
        ++field4774;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method2137(Canvas arg0, int arg1, int arg2) {
        ++field4822;
        if (this.field4875 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4753.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field4817.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field4753.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)I")
    private final int method2138(byte arg0) {
        ++field4919;
        this.field4998 = OpenGL.glGetString(7936).toLowerCase();
        if (arg0 != 73) {
            this.method2155(-0.37233284F, -1.218528F, 0.17291963F, 94, -1.1060984F);
        }
        int var2 = 0;
        this.field5078 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field4998.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field4998.indexOf("brian paul") != -1 || ~this.field4998.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class498.method2984(var3.replace('.', ' '), ' ', -97);
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class665.method3815(var4[0], arg0 ^ -51);
                int var6 = class665.method3815(var4[1], -126);
                this.field5030 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field5030 > -13) {
            var2 |= 2;
        }
        if (!this.field4817.method3382("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4817.method3382("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5074 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5087 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5076 = var7[0];
        if (this.field5074 < 2 || ~this.field5087 > -3 || this.field5076 < 2) {
            var2 |= 16;
        }
        this.field4992 = Stream.method2541();
        this.field5052 = this.field4817.arePbuffersAvailable();
        this.field5009 = this.field4817.method3382("GL_ARB_vertex_buffer_object");
        this.field5086 = this.field4817.method3382("GL_ARB_multisample");
        this.field5054 = this.field4817.method3382("GL_ARB_vertex_program");
        this.field4817.method3382("GL_ARB_fragment_program");
        this.field5093 = this.field4817.method3382("GL_ARB_vertex_shader");
        this.field5005 = this.field4817.method3382("GL_ARB_fragment_shader");
        this.field5018 = this.field4817.method3382("GL_EXT_texture3D");
        this.field5001 = this.field4817.method3382("GL_ARB_texture_rectangle");
        this.field5019 = this.field4817.method3382("GL_ARB_texture_cube_map");
        this.field5031 = this.field4817.method3382("GL_ARB_texture_float");
        this.field4991 = false;
        this.field5028 = this.field4817.method3382("GL_EXT_framebuffer_object");
        this.field5012 = this.field4817.method3382("GL_EXT_framebuffer_blit");
        this.field5079 = this.field4817.method3382("GL_EXT_framebuffer_multisample");
        this.field5044 = this.field5079 & this.field5012;
        OpenGL.glGetFloatv(2834, class400.field5530, 0);
        this.field5060 = class400.field5530[1];
        this.field5047 = class400.field5530[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "(I)V")
    public final void method2139(int arg0) {
        OpenGL.glPushMatrix();
        if (arg0 != 1004) {
            this.field4970 = null;
        }
        ++field4779;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "()Z")
    public final boolean method2140() {
        ++field4757;
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)Lhs;")
    public final class358 method600(int arg0, int arg1) {
        ++field4797;
        return null;
    }

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "()Luha;")
    public final class723 method2141() {
        ++field4862;
        return new class437();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLcg;)V")
    public final void method2142(byte arg0, class386 arg1) {
        if (arg0 > -69) {
            this.field4979 = null;
        }
        ++field4746;
        if (!this.field5012) {
            if (~this.field4959 <= -1 && this.field4956[this.field4959] == arg1) {
                this.field4956[this.field4959--] = null;
                arg1.method2351(3498);
                if (this.field4959 < 0) {
                    this.field4963 = this.field4962 = null;
                } else {
                    this.field4963 = this.field4962 = this.field4956[this.field4959];
                    this.field4963.method2352((byte) -60);
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2159(arg1, 104);
            this.method2152(arg1, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(II)V")
    public final void method2143(int arg0, int arg1) {
        if (this.field4988 != arg0 || ~this.field4985 != ~arg1) {
            this.field4985 = arg1;
            this.field4988 = arg0;
            this.method2089(8638);
            this.method2088((byte) 11);
            if (this.field5068 != 3) {
                if (this.field5068 == 2) {
                    this.method2158((byte) -109);
                }
            } else {
                this.method2074(5889);
            }
        }
        ++field4929;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ[BII)Lhu;")
    public final class227 method2144(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        ++field4823;
        if (arg4 > -7) {
            this.method2111(72);
        }
        return (class227) (!this.field5009 || arg1 && !this.field5004 ? new class660(this, arg3, arg2, arg0) : new class714(this, arg3, arg2, arg0, arg1));
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final synchronized void method639(int arg0) {
        ++field4755;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4968.method3121((byte) 5)) {
            class285 var12 = (class285) this.field4968.method3115(true);
            class7.field66[var2++] = (int) var12.field7166;
            this.field4965 -= var12.field3770;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class7.field66, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class7.field66, 0);
            var2 = 0;
        }
        while (!this.field4969.method3121((byte) 32)) {
            class285 var11 = (class285) this.field4969.method3115(true);
            class7.field66[var2++] = (int) var11.field7166;
            this.field4964 -= var11.field3770;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class7.field66, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class7.field66, 0);
            var2 = 0;
        }
        while (!this.field4970.method3121((byte) 14)) {
            class285 var10 = (class285) this.field4970.method3115(true);
            class7.field66[var2++] = var10.field3770;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class7.field66, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class7.field66, 0);
            var2 = 0;
        }
        while (!this.field4971.method3121((byte) 124)) {
            class285 var9 = (class285) this.field4971.method3115(true);
            class7.field66[var2++] = (int) var9.field7166;
            this.field4967 -= var9.field3770;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class7.field66, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class7.field66, 0);
            boolean var4 = false;
        }
        while (!this.field4966.method3121((byte) -128)) {
            class285 var8 = (class285) this.field4966.method3115(true);
            OpenGL.glDeleteLists((int) var8.field7166, var8.field3770);
        }
        while (!this.field4972.method3121((byte) -122)) {
            class513 var7 = this.field4972.method3115(true);
            OpenGL.glDeleteProgramARB((int) var7.field7166);
        }
        while (!this.field4973.method3121((byte) 80)) {
            class513 var6 = this.field4973.method3115(true);
            OpenGL.glDeleteObjectARB(var6.field7166);
        }
        while (!this.field4966.method3121((byte) 126)) {
            class285 var5 = (class285) this.field4966.method3115(true);
            OpenGL.glDeleteLists((int) var5.field7166, var5.field3770);
        }
        this.field4939.method2397(9672);
        if (~this.method2179() < -100663297 && this.field4978 + 60000L < class224.method1457((byte) -62)) {
            System.gc();
            this.field4978 = class224.method1457((byte) -62);
        }
        this.field4947 = var3;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2145(int arg0, byte arg1, int arg2) {
        ++field4912;
        if (arg1 <= -101) {
            class285 var4 = new class285(arg0);
            var4.field7166 = (long) arg2;
            this.field4971.method3116(29066, var4);
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(Z)V")
    public final void method2146(boolean arg0) {
        ++field4805;
        if (!arg0) {
            this.field4866 = 119;
        }
        if (this.field4975 != 4) {
            this.method2117(0);
            this.method2150(false, 0);
            this.method2197(false, (byte) -88);
            this.method2204(false, !arg0);
            this.method2192(100, false);
            this.method2103((byte) 118, -2);
            this.method2121(1, 1);
            this.field4975 = 4;
        }
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "()Lgba;")
    public final class702 method568() {
        ++field4751;
        int var1 = -1;
        if (~this.field4998.indexOf("nvidia") == 0) {
            if (this.field4998.indexOf("intel") == -1) {
                if (~this.field4998.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class702(var1, "OpenGL", this.field5030, this.field5078, 0L);
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
    public final void method2147(int arg0) {
        ++field4815;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "(Z)V")
    public final void method2148(boolean arg0) {
        ++field4877;
        this.field4995 = arg0;
        this.method2193(-31);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)V")
    public final void method2149(boolean arg0) {
        ++field4841;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;")
    public final class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3) {
        ++field4781;
        if (arg0 != null && arg1 != null && this.field5019 && this.field5028) {
            class357 var5 = null;
            class111 var6 = (class111) arg0;
            class111 var7 = (class111) arg1;
            class633 var8 = var6.method748(8448);
            class633 var9 = var7.method748(8448);
            if (var8 != null && var9 != null) {
                int var10 = var8.field9009 <= var9.field9009 ? var9.field9009 : var8.field9009;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class357) {
                    class357 var11 = (class357) arg3;
                    if (var10 == var11.method2018(65534)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class357(this, var10);
                }
                if (var5.method2017(var8, var9, (byte) 11, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(ZI)V")
    public final void method2150(boolean arg0, int arg1) {
        ++field4900;
        if (this.field5043 != arg0) {
            this.field5043 = arg0;
            this.method2076(false);
            this.field4975 &= -32;
        }
        if (arg1 != 0) {
            this.method2088((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ep", name = "ra", descriptor = "(IIII)V")
    public final void method2151(int arg0, int arg1, int arg2, int arg3) {
        this.field5049 = arg0;
        this.field5059 = arg3;
        this.field5083 = true;
        this.field5029 = arg1;
        this.field5089 = arg2;
        ++field4798;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lcg;B)V")
    public final void method2152(class386 arg0, byte arg1) {
        if (arg1 != -75) {
            this.field5000 = 1.6653129F;
        }
        ++field4930;
        if (this.field4958 >= 0 && this.field4954[this.field4958] == arg0) {
            this.field4954[this.field4958--] = null;
            arg0.method2356(-4718);
            if (~this.field4958 > -1) {
                this.field4962 = null;
            } else {
                this.field4962 = this.field4954[this.field4958];
                this.field4962.method2353(126);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Luj;B)V")
    public final void method2153(class437 arg0, byte arg1) {
        OpenGL.glPushMatrix();
        if (arg1 != 15) {
            this.field4938 = 3;
        }
        ++field4871;
        OpenGL.glMultMatrixf(arg0.method2624(-8914), 0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lhl;I)V")
    public final void method2154(class396 arg0, int arg1) {
        ++field4796;
        class396 var3 = this.field5014[this.field5088];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field5510);
            } else {
                if (var3 != null) {
                    if (~arg0.field5510 != ~var3.field5510) {
                        OpenGL.glDisable(var3.field5510);
                        OpenGL.glEnable(arg0.field5510);
                    }
                } else {
                    OpenGL.glEnable(arg0.field5510);
                }
                OpenGL.glBindTexture(arg0.field5510, arg0.method2416(107));
            }
            this.field5014[this.field5088] = arg0;
        }
        this.field4975 &= arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFFIF)V")
    public final void method2155(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class400.field5530[3] = arg4;
        class400.field5530[0] = arg1;
        class400.field5530[1] = arg0;
        if (arg3 >= 2) {
            ++field4881;
            class400.field5530[2] = arg2;
            OpenGL.glTexEnvfv(8960, 8705, class400.field5530, 0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "(IIIIIII)I")
    public final int method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4842;
        float var8 = (float) arg2 * this.field4979.field6000 + (float) arg0 * this.field4979.field6007 + (float) arg1 * this.field4979.field6008 + this.field4979.field6001;
        float var9 = (float) arg5 * this.field4979.field6000 + (float) arg3 * this.field4979.field6007 + (float) arg4 * this.field4979.field6008 + this.field4979.field6001;
        int var10 = 0;
        if (var8 < (float) this.field4988 && (float) this.field4988 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field4985 && var9 > (float) this.field4985) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4979.field5996 + (float) arg0 * this.field4979.field5989 + (float) arg1 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4979.field5996 + (float) arg3 * this.field4979.field5989 + (float) arg4 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / (float) arg6);
        if (this.field5013 > (float) var11 && this.field5013 > (float) var12) {
            var10 |= 1;
        } else if (this.field5017 < (float) var11 && this.field5017 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4979.field5980 + (float) arg0 * this.field4979.field5993 + (float) arg1 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4979.field5980 + (float) arg3 * this.field4979.field5993 + (float) arg4 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / (float) arg6);
        if (this.field5000 > (float) var13 && this.field5000 > (float) var14) {
            var10 |= 4;
        } else if (this.field5058 < (float) var13 && (float) var14 > this.field5058) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "()Z")
    public final boolean method2157() {
        ++field4770;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(B)V")
    private final void method2158(byte arg0) {
        ++field4831;
        OpenGL.glMatrixMode(5889);
        if (arg0 > -13) {
            this.method2100();
        }
        OpenGL.glLoadMatrixf(this.field5053, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lcg;I)V")
    public final void method2159(class386 arg0, int arg1) {
        if (arg1 >= 43) {
            ++field4884;
            if (~this.field4961 <= -1 && this.field4957[this.field4961] == arg0) {
                this.field4957[this.field4961--] = null;
                arg0.method2355(13095);
                if (this.field4961 >= 0) {
                    this.field4963 = this.field4957[this.field4961];
                    this.field4963.method2354(21064);
                } else {
                    this.field4963 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "XA", descriptor = "()I")
    public final int method2160() {
        ++field4807;
        return this.field4985;
    }

    @OriginalMember(owner = "client!ep", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method2161(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4738;
        boolean var7 = this.field4994 != arg0;
        if (var7 || this.field4987 != arg1 || this.field5008 != arg2) {
            this.field4987 = arg1;
            this.field4994 = arg0;
            this.field5008 = arg2;
            if (var7) {
                this.field5015 = (float) (this.field4994 & 16711680) / 1.671168E7F;
                this.field5035 = (float) (255 & this.field4994) / 255.0F;
                this.field5024 = (float) (this.field4994 & 65280) / 65280.0F;
                this.method2080(-67);
            }
            this.method2184((byte) 10);
        }
        if (this.field5085[0] != arg3 || this.field5085[1] != arg4 || this.field5085[2] != arg5) {
            this.field5085[0] = arg3;
            this.field5085[2] = arg5;
            this.field5085[1] = arg4;
            this.field5094[1] = -arg4;
            this.field5094[2] = -arg5;
            this.field5094[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5022[1] = arg4 * var8;
            this.field5022[0] = arg3 * var8;
            this.field5022[2] = arg5 * var8;
            this.field5071[1] = -this.field5022[1];
            this.field5071[2] = -this.field5022[2];
            this.field5071[0] = -this.field5022[0];
            this.method2108(0);
            this.field5072 = (int) (arg5 * 256.0F / arg4);
            this.field5092 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "()Z")
    public final boolean method2162() {
        ++field4920;
        return this.field5086 && (!this.method569() || this.field5044);
    }

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "([I)V")
    public final void method2163(int[] arg0) {
        arg0[2] = this.field5020;
        ++field4782;
        arg0[1] = this.field5003;
        arg0[3] = this.field5010;
        arg0[0] = this.field5084;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(ZI)V")
    public final void method2164(boolean arg0, int arg1) {
        ++field4792;
        if (!this.field5051 != !arg0) {
            this.field5051 = arg0;
            this.method2130(arg1 ^ 1713);
        }
        if (arg1 != 3553) {
            this.method2153((class437) null, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(B)V")
    private final void method2165(byte arg0) {
        if (~this.field4975 != -2) {
            this.method2117(0);
            this.method2150(false, 0);
            this.method2197(false, (byte) -88);
            this.method2204(false, false);
            this.method2192(126, false);
            this.method2154((class396) null, arg0 ^ 9);
            this.method2103((byte) -18, -2);
            this.method2208(1, arg0 ^ -6415);
            this.field4975 = 1;
        }
        ++field4838;
        if (arg0 != -9) {
            this.method2144(-52, false, (byte[]) null, 51, -89);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(IIIIII)V")
    public final void method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4809;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2165((byte) -9);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2121(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5086) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5086) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(Z)V")
    private final void method2167(boolean arg0) {
        if (this.field5068 != 2) {
            this.field5068 = 2;
            this.method2158((byte) -109);
            this.method2215(-101);
            this.field4975 &= -8;
        }
        ++field4839;
        if (arg0) {
            this.method2112((class347) null, -88);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIII)V")
    public final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4870;
        this.method2165((byte) -9);
        this.method2121(arg5, 1);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(FFI)V")
    public final void method2169(float arg0, float arg1, int arg2) {
        this.field5007 = arg1;
        if (arg2 == 7425) {
            ++field4834;
            this.field5055 = arg0;
            this.method2088((byte) 40);
        }
    }

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "()Z")
    public final boolean method2170() {
        ++field4769;
        return this.field4942.method2742((byte) -94, 3);
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(II)V")
    public final synchronized void method2171(int arg0, int arg1) {
        ++field4904;
        class285 var3 = new class285(arg0);
        if (arg1 == -16915) {
            this.field4970.method3116(arg1 + 45981, var3);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Leca;ILeca;Leca;Leca;)V")
    public final void method2172(class329 arg0, int arg1, class329 arg2, class329 arg3, class329 arg4) {
        ++field4886;
        if (arg1 == 32886) {
            if (arg2 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method2205(arg2.field4220, (byte) -71);
                OpenGL.glVertexPointer(arg2.field4217, arg2.field4221, this.field5081.method1473(-30695), this.field5081.method1472((byte) -91) - -((long) arg2.field4222));
                OpenGL.glEnableClientState(32884);
            }
            if (arg4 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method2205(arg4.field4220, (byte) -61);
                OpenGL.glNormalPointer(arg4.field4221, this.field5081.method1473(arg1 + -63581), this.field5081.method1472((byte) -79) - -((long) arg4.field4222));
                OpenGL.glEnableClientState(32885);
            }
            if (arg0 != null) {
                this.method2205(arg0.field4220, (byte) -94);
                OpenGL.glColorPointer(arg0.field4217, arg0.field4221, this.field5081.method1473(-30695), this.field5081.method1472((byte) -120) - -((long) arg0.field4222));
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg3 != null) {
                this.method2205(arg3.field4220, (byte) -118);
                OpenGL.glTexCoordPointer(arg3.field4217, arg3.field4221, this.field5081.method1473(-30695), this.field5081.method1472((byte) -118) - -((long) arg3.field4222));
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "U", descriptor = "(IIIII)V")
    public final void method2173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4885;
        this.method2165((byte) -9);
        this.method2121(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "()Z")
    public final boolean method2174() {
        ++field4852;
        return this.field4944 != null && (~this.field4940 >= -2 || this.field5044);
    }

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "(I)V")
    private final void method2175(int arg0) {
        if (this.field4761 != null) {
            Dimension var2 = this.field4761.getSize();
            this.field4866 = var2.height;
            this.field4937 = var2.width;
        } else {
            this.field4937 = this.field4866 = 0;
        }
        ++field4752;
        if (this.field4962 == null) {
            this.field4894 = this.field4866;
            this.field4820 = this.field4937;
            this.method2206(2);
        }
        int var3 = -102 / ((-24 - arg0) / 55);
        this.method2111(-12787);
        this.method2198();
    }

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "(I)V")
    private final void method2176(int arg0) {
        ++field4835;
        if (arg0 != -892153072) {
            this.method2215(-31);
        }
        if (this.field5050) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5050 = false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lza;)V")
    public final void method2177(class256 arg0) {
        ++field4854;
        this.field4949 = ((class477) arg0).field6504;
        if (this.field4986 == null) {
            class128 var2 = new class128(80);
            if (this.field4992) {
                var2.method821(-1.0F, 856244488);
                var2.method821(-1.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(-1.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(-1.0F, 856244488);
                var2.method821(1.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(0.0F, 856244488);
                var2.method821(0.0F, 856244488);
            } else {
                var2.method820((byte) 125, -1.0F);
                var2.method820((byte) 117, -1.0F);
                var2.method820((byte) 106, 0.0F);
                var2.method820((byte) 113, 0.0F);
                var2.method820((byte) 105, 1.0F);
                var2.method820((byte) 118, 1.0F);
                var2.method820((byte) 92, -1.0F);
                var2.method820((byte) 110, 0.0F);
                var2.method820((byte) 81, 1.0F);
                var2.method820((byte) 96, 1.0F);
                var2.method820((byte) 116, 1.0F);
                var2.method820((byte) 89, 1.0F);
                var2.method820((byte) 108, 0.0F);
                var2.method820((byte) 127, 1.0F);
                var2.method820((byte) 114, 0.0F);
                var2.method820((byte) 90, -1.0F);
                var2.method820((byte) 101, 1.0F);
                var2.method820((byte) 117, 0.0F);
                var2.method820((byte) 126, 0.0F);
                var2.method820((byte) 84, 0.0F);
            }
            this.field4986 = this.method2144(var2.field330, false, var2.field279, 20, -118);
            this.field5025 = new class329(this.field4986, 5126, 3, 0);
            this.field5061 = new class329(this.field4986, 5126, 2, 12);
            this.field4943.method1332(this, -28441);
        }
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(I)V")
    public final void method2178(int arg0) {
        this.method2116((byte) -102);
        ++field4928;
    }

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "()I")
    public final int method2179() {
        ++field4793;
        return this.field4965 + this.field4964 + this.field4967;
    }

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "()Z")
    public final boolean method2180() {
        ++field4861;
        return false;
    }

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "(I)V")
    private final void method2181(int arg0) {
        ++field4899;
        int var2 = -87 % ((62 - arg0) / 58);
        if (~this.field5068 != -4) {
            this.field5068 = 3;
            this.method2074(5889);
            this.method2215(-123);
            this.field4975 &= -8;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(Lcg;B)V")
    public final void method2182(class386 arg0, byte arg1) {
        ++field4747;
        if (!this.field5012) {
            if (~this.field4959 <= -4) {
                throw new RuntimeException();
            }
            if (this.field4959 >= 0) {
                this.field4956[this.field4959].method2351(3498);
            }
            this.field4963 = this.field4962 = this.field4956[++this.field4959] = arg0;
            this.field4963.method2352((byte) -60);
        } else {
            this.method2133(arg0, (byte) 119);
            this.method2183(arg0, -23365);
        }
        int var3 = 26 % ((arg1 - -27) / 63);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lcg;I)V")
    public final void method2183(class386 arg0, int arg1) {
        ++field4750;
        if (this.field4958 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4958 <= -1) {
                this.field4954[this.field4958].method2356(-4718);
            }
            if (arg1 == -23365) {
                this.field4962 = this.field4954[++this.field4958] = arg0;
                this.field4962.method2353(98);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "(B)V")
    private final void method2184(byte arg0) {
        if (arg0 > 3) {
            ++field4787;
            class400.field5530[3] = 1.0F;
            class400.field5530[1] = this.field5024 * this.field4987;
            class400.field5530[2] = this.field5035 * this.field4987;
            class400.field5530[0] = this.field5015 * this.field4987;
            OpenGL.glLightfv(16384, 4609, class400.field5530, 0);
            class400.field5530[2] = -this.field5008 * this.field5035;
            class400.field5530[1] = -this.field5008 * this.field5024;
            class400.field5530[3] = 1.0F;
            class400.field5530[0] = -this.field5008 * this.field5015;
            OpenGL.glLightfv(16385, 4609, class400.field5530, 0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "(B)V")
    public final void method2185(byte arg0) {
        if (this.field4975 != 2) {
            this.method2117(0);
            this.method2150(false, 0);
            this.method2197(false, (byte) -88);
            this.method2204(false, false);
            this.method2192(94, false);
            this.method2103((byte) 126, -2);
            this.field4975 = 2;
        }
        if (arg0 <= 57) {
            this.method2130(-4);
        }
        ++field4825;
    }

    @OriginalMember(owner = "client!ep", name = "EA", descriptor = "(IIII)V")
    public final void method2186(int arg0, int arg1, int arg2, int arg3) {
        ++field4931;
        if (!this.field5083) {
            throw new RuntimeException("");
        } else {
            this.field5049 = arg0;
            this.field5089 = arg2;
            this.field5029 = arg1;
            this.field5059 = arg3;
            if (this.field5002) {
                this.field4942.field6289.method1494(0);
                this.field4942.field6289.method1496(-30565);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(III)V")
    public final synchronized void method2187(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field4957 = null;
        }
        ++field4785;
        class285 var4 = new class285(arg1);
        var4.field7166 = (long) arg0;
        this.field4969.method3116(29066, var4);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIII)V")
    public final void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4786;
        OpenGL.glLineWidth((float) arg5);
        this.method2168(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ep", name = "JA", descriptor = "(IIIIII)I")
    public final int method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4811;
        int var7 = 0;
        float var8 = (float) arg2 * this.field4979.field6000 + (float) arg0 * this.field4979.field6007 + (float) arg1 * this.field4979.field6008 + this.field4979.field6001;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4979.field6000 + (float) arg3 * this.field4979.field6007 + (float) arg4 * this.field4979.field6008 + this.field4979.field6001;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field4988 > var8 && var9 < (float) this.field4988) {
            var7 |= 16;
        } else if ((float) this.field4985 < var8 && var9 > (float) this.field4985) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4979.field5996 + (float) arg0 * this.field4979.field5989 + (float) arg1 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / var8);
        int var11 = (int) (((float) arg5 * this.field4979.field5996 + (float) arg3 * this.field4979.field5989 + (float) arg4 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / var9);
        if ((float) var10 < this.field5013 && (float) var11 < this.field5013) {
            var7 |= 1;
        } else if ((float) var10 > this.field5017 && (float) var11 > this.field5017) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4979.field5980 + (float) arg0 * this.field4979.field5993 + (float) arg1 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / var8);
        int var13 = (int) (((float) arg5 * this.field4979.field5980 + (float) arg3 * this.field4979.field5993 + (float) arg4 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / var9);
        if ((float) var12 < this.field5000 && this.field5000 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field5058 && this.field5058 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZI)V")
    public final void method2190(int arg0, int arg1, boolean arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg3);
        if (!arg2) {
            this.method584((class358) null, (class315) null);
        }
        ++field4893;
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "(IIIII)V")
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4837;
        this.method2165((byte) -9);
        this.method2121(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)V")
    public final void method2192(int arg0, boolean arg1) {
        ++field4816;
        if (arg1 == !this.field4981) {
            this.field4981 = arg1;
            this.method2193(-89);
            this.field4975 &= -32;
        }
        int var3 = -115 % ((arg0 - 47) / 43);
    }

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "(I)V")
    private final void method2193(int arg0) {
        ++field4921;
        if (arg0 >= -1) {
            this.method2170();
        }
        OpenGL.glDepthMask(this.field4981 && this.field4995);
    }

    @OriginalMember(owner = "client!ep", name = "aa", descriptor = "(IIIIII)V")
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4739;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2165((byte) -9);
        this.method2121(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5086) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5086) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "()Z")
    public final boolean method569() {
        ++field4763;
        return this.field4944 != null && this.field4944.method1464(1);
    }

    @OriginalMember(owner = "client!ep", name = "HA", descriptor = "(IIII[I)V")
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4843;
        float var6 = (float) arg2 * this.field4979.field6000 + (float) arg0 * this.field4979.field6007 + (float) arg1 * this.field4979.field6008 + this.field4979.field6001;
        if (!(var6 < (float) this.field4988) && !((float) this.field4985 < var6)) {
            int var7 = (int) (((float) arg2 * this.field4979.field5996 + (float) arg0 * this.field4979.field5989 + (float) arg1 * this.field4979.field5979 + this.field4979.field5998) * (float) this.field5023 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4979.field5980 + (float) arg0 * this.field4979.field5993 + (float) arg1 * this.field4979.field6009 + this.field4979.field6012) * (float) this.field5006 / (float) arg3);
            if ((float) var7 >= this.field5013 && this.field5017 >= (float) var7 && this.field5000 <= (float) var8 && (float) var8 <= this.field5058) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 - this.field5000);
                arg4[0] = (int) ((float) var7 - this.field5013);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)V")
    public final void method2196(int arg0, byte arg1) {
        ++field4856;
        if (~this.field5088 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5088 = arg0;
        }
        if (arg1 != 89) {
            this.field5020 = 100;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZB)V")
    public final void method2197(boolean arg0, byte arg1) {
        ++field4913;
        if (arg1 != -88) {
            this.field4997 = null;
        }
        if (!arg0 == this.field5090) {
            this.field5090 = arg0;
            this.method2130(arg1 ^ -2824);
            this.field4975 &= -8;
        }
    }

    @OriginalMember(owner = "client!ep", name = "la", descriptor = "()V")
    public final void method2198() {
        this.field5010 = this.field4894;
        this.field5084 = 0;
        this.field5003 = 0;
        this.field5020 = this.field4820;
        ++field4855;
        OpenGL.glDisable(3089);
        this.method2217(true);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZZ)V")
    public final void method2199(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (~this.field5062 != ~arg1 || !this.field5083 == this.field5002) {
            class204 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field5083 ? 3 : 0;
            if (arg1 < 0) {
                this.method2176(-892153072);
            } else {
                var5 = this.field4939.method2395(3553, arg1);
                class468 var10 = super.field7694.method91(arg1, -22805);
                if (var10.field6388 == 0 && var10.field6390 == 0) {
                    this.method2176(-892153072);
                } else {
                    int var11 = var10.field6391 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2109((float) (this.field4947 % var12 * var10.field6388) / (float) var12, arg0 + 26426, 0.0F, (float) (this.field4947 % var12 * var10.field6390) / (float) var12);
                }
                var6 = var10.field6384;
                if (!this.field5083) {
                    var9 = var10.field6386;
                    var7 = var10.field6398;
                    var8 = var10.field6392;
                }
            }
            this.field4942.method2745(var7, arg2, var9, 9, var8, arg3);
            if (!this.field4942.method2746(var5, var6, arg0 ^ -26398)) {
                this.method2154(var5, -2);
                this.method2208(var6, 6406);
            }
            this.field5062 = arg1;
            this.field5002 = this.field5083;
        }
        if (arg0 != -26468) {
            this.method2073(101);
        }
        ++field4863;
        this.field4975 &= -8;
    }

    @OriginalMember(owner = "client!ep", name = "pa", descriptor = "()V")
    public final void method2200() {
        ++field4808;
        this.field5083 = false;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4847;
        if (arg0 != arg2 || arg1 != arg3) {
            this.method2165((byte) -9);
            this.method2121(arg5, 1);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg6 + arg7);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var14 = var11 * var12;
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~arg6 <= ~var13) {
                var21 = (float) (-var13 + arg6) * var14;
                var20 = (float) (arg6 - var13) * var15;
            } else {
                var19 = (float) (arg6 + arg7 - var13) * var14;
                var18 = (float) (-var13 + arg6 + arg7) * var15;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg0 >= arg2) {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (~arg3 < ~arg1) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var22 += var20 + var24;
                var23 += var21 + var25;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(IIII)V")
    public final void method2202(int arg0, int arg1, int arg2, int arg3) {
        ++field4780;
        if (arg0 == 390803672) {
            OpenGL.glTexEnvi(8960, arg3 + 34176, arg2);
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "()V")
    public final void method2203() {
        ++field4749;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZ)V")
    public final void method2204(boolean arg0, boolean arg1) {
        ++field4833;
        if (this.field4977 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field4977 = arg0;
            this.field4975 &= -32;
        }
        if (arg1) {
            this.field4949 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lhu;B)V")
    public final void method2205(class227 arg0, byte arg1) {
        ++field4830;
        if (arg1 > -27) {
            this.field4972 = null;
        }
        if (this.field5081 != arg0) {
            if (this.field5009) {
                OpenGL.glBindBufferARB(34962, arg0.method1470(10059));
            }
            this.field5081 = arg0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "(I)V")
    private final void method2206(int arg0) {
        ++field4802;
        OpenGL.glViewport(this.field4989, this.field4996, this.field4820, this.field4894);
        if (arg0 != 2) {
            this.field5045 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(III)V")
    public final void method2207(int arg0, int arg1, int arg2) {
        if (arg2 != -25248) {
            this.field4942 = null;
        }
        if (~this.field5088 == -1) {
            boolean var4 = false;
            if (~this.field5080 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field5080 = arg0;
            }
            if (~this.field4990 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field4990 = arg1;
            }
            if (var4) {
                this.field4975 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
        ++field4784;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425 {
        ++field4819;
        this.method632(arg2, arg3);
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "(II)V")
    public final void method2208(int arg0, int arg1) {
        ++field4783;
        if (arg1 != 6406) {
            this.method570(-0.2164479F, 0.42477843F, -0.6582947F);
        }
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.method2207(260, 8448, -25248);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.method2207(34023, 34023, arg1 ^ -31642);
                        return;
                    }
                } else {
                    this.method2207(34165, 7681, -25248);
                }
            } else {
                this.method2207(8448, 8448, -25248);
            }
        } else {
            this.method2207(7681, 7681, -25248);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BIZ)Lvi;")
    public final class368 method2209(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        if (arg1 >= -103) {
            this.field5092 = -84;
        }
        ++field4824;
        return (class368) (!this.field5009 || arg4 && !this.field5004 ? new class319(this, arg3, arg2, arg0) : new class532(this, arg3, arg2, arg0, arg4));
    }

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "(II)I")
    public final int method2210(int arg0, int arg1) {
        ++field4846;
        if (arg0 != 1) {
            if (~arg0 == -1) {
                return 8448;
            } else if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 != -4) {
                if (~arg0 == -5) {
                    return 34023;
                } else {
                    if (arg1 > -4) {
                        this.field4990 = 15;
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method2211(Canvas arg0) {
        ++field4851;
        if (this.field4875 == arg0) {
            throw new RuntimeException();
        } else if (this.field4753.containsKey(arg0)) {
            Long var2 = (Long) this.field4753.get(arg0);
            this.field4817.releaseSurface(arg0, var2);
            this.field4753.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(BI)V")
    public final void method2212(byte arg0, int arg1) {
        class400.field5530[1] = (float) class136.method878(65280, arg1) / 65280.0F;
        class400.field5530[2] = (float) class136.method878(255, arg1) / 255.0F;
        class400.field5530[0] = (float) class136.method878(16711680, arg1) / 1.671168E7F;
        class400.field5530[3] = (float) (arg1 >>> 24) / 255.0F;
        ++field4889;
        if (arg0 > -41) {
            this.field4966 = null;
        }
        OpenGL.glTexEnvfv(8960, 8705, class400.field5530, 0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class339 method2213(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4890;
        return new class375(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "()V")
    public final void method617() {
        this.field4941.method2489(66);
        ++field4935;
    }

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "()Z")
    public final boolean method2214() {
        ++field4754;
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "(I)V")
    private final void method2215(int arg0) {
        OpenGL.glLoadIdentity();
        ++field4767;
        OpenGL.glMultMatrixf(this.field4983.method2624(-8914), 0);
        int var2 = -9 / ((arg0 - -35) / 62);
        if (this.field5002) {
            this.field4942.field6289.method1494(0);
        }
        this.method2108(0);
        this.method2084(false);
    }

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "(I)V")
    private final void method2216(int arg0) {
        this.method2103((byte) -13, -2);
        ++field4882;
        for (int var2 = this.field5074 - 1; ~var2 <= -1; --var2) {
            this.method2196(var2, (byte) 89);
            this.method2154((class396) null, arg0 + -10839);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2207(8448, 8448, -25248);
        this.method2202(390803672, 770, 34168, 2);
        this.method2176(-892153072);
        this.field4974 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4982 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4976 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4980 = true;
        this.method2150(true, 0);
        this.method2197(true, (byte) -88);
        this.method2204(true, false);
        this.method2192(arg0 ^ -10777, true);
        this.method2111(arg0 + -23624);
        this.field4817.setSwapInterval(0);
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
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = var4 + 16384;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        if (arg0 != 10837) {
            this.field4957 = null;
        }
        OpenGL.glHint(3156, 4353);
        this.field4994 = this.field5036 = -1;
        this.method2198();
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "(Z)V")
    private final void method2217(boolean arg0) {
        this.field5013 = (float) (-this.field5070 + this.field5084);
        if (!arg0) {
            this.method2142((byte) 119, (class386) null);
        }
        this.field5017 = (float) (-this.field5070 + this.field5020);
        ++field4865;
        this.field5058 = (float) (this.field5010 - this.field5057);
        this.field5000 = (float) (-this.field5057 + this.field5003);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILuj;)V")
    public final void method2218(int arg0, class437 arg1) {
        OpenGL.glLoadMatrixf(arg1.method2624(-8914), arg0);
        ++field4880;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(ZI)I")
    public final int method2219(boolean arg0, int arg1) {
        if (!arg0) {
            this.field5055 = -0.7845523F;
        }
        ++field4806;
        if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (arg1 != 34843) {
                        if (~arg1 == -34843) {
                            return 8;
                        } else if (arg1 != 6402) {
                            if (arg1 == 6401) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
                        }
                    } else {
                        return 6;
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

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "(II)V")
    public final void method572(int arg0, int arg1) {
        ++field4759;
    }

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "(I)V")
    public final void method2220(int arg0) {
        OpenGL.glPopMatrix();
        ++field4867;
        int var2 = 120 % ((arg0 - -52) / 37);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lhs;Lmp;)Lcha;")
    public final class279 method584(class358 arg0, class315 arg1) {
        ++field4741;
        return null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4791;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class669 var13 = (class669) arg6;
            class146 var14 = var13.field9416;
            this.method2185((byte) 91);
            this.method2154(var13.field9416, -2);
            this.method2121(arg5, 1);
            this.method2207(7681, 8448, -25248);
            this.method2202(390803672, 768, 34167, 0);
            float var15 = var14.field2025 / (float) var14.field2023;
            float var16 = var14.field2019 / (float) var14.field2028;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var20 = var18 * var19;
            int var21 = arg11 % (arg9 + arg10);
            float var22 = var17 * var19;
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var20;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var21 > arg9) {
                var25 = (float) (-var21 + arg10 + arg9) * var22;
                var26 = (float) (arg9 + arg10 + -var21) * var20;
            } else {
                var27 = (float) (-var21 + arg9) * var22;
                var28 = (float) (-var21 + arg9) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var20;
            while (true) {
                if (~arg2 >= ~arg0) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var29) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg1 >= arg3) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var30 += var28 + var32;
                var29 += var27 + var31;
                var27 = var23;
                var28 = var24;
            }
            this.method2202(390803672, 768, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lkda;IIII)Lka;")
    public final class283 method2222(class64 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4836;
        return new class178(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "()I")
    public final int method2223() {
        ++field4898;
        int var1 = this.field5095;
        this.field5095 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method2224(Canvas arg0, int arg1, int arg2) {
        ++field4923;
        long var4 = 0L;
        if (arg0 != null && this.field4875 != arg0) {
            if (this.field4753.containsKey(arg0)) {
                Long var6 = (Long) this.field4753.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field4936;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4817.surfaceResized(var4);
            if (this.field4761 == arg0) {
                this.method2175(98);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "na", descriptor = "(IIII)[I")
    public final int[] method590(int arg0, int arg1, int arg2, int arg3) {
        ++field4850;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field4894 - arg1 + -var6, arg2, 1, 32993, this.field5075, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIF)Lkb;")
    public final class757 method2225(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4857;
        return new class603(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "(I)Lza;")
    public final class256 method2226(int arg0) {
        ++field4794;
        class477 var2 = new class477(arg0);
        this.field4951.method3116(29066, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(III)V")
    public final void method2227(int arg0, int arg1, int arg2) {
        ++field4788;
        if (arg1 <= 109) {
            this.method2175(111);
        }
        this.field4996 = arg0;
        this.field4989 = arg2;
        this.method2206(2);
        this.method2082(2);
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(BI)I")
    public final int method2228(byte arg0, int arg1) {
        if (arg0 != -97) {
            this.method2114(80, (class368) null);
        }
        ++field4803;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (~arg1 != -5126 && ~arg1 != -5125 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "()V")
    public final void method635() {
        ++field4804;
        if (!this.field5028) {
            if (!this.field5052) {
                throw new RuntimeException("");
            }
            this.field4955.method118(0, 0, this.field4820, this.field4894, 0, 0);
            this.field4817.setSurface(this.field4872);
        } else {
            if (this.field4960 != this.field4962) {
                throw new RuntimeException();
            }
            this.field4960.method3372(0, 36009);
            this.field4960.method3372(8, 36009);
            this.method2142((byte) -70, this.field4960);
        }
        this.field4955 = null;
        this.field4820 = this.field4937;
        this.field4894 = this.field4866;
        this.method2111(-12787);
        this.method2206(2);
        this.method2198();
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIILvi;)V")
    public final void method2229(int arg0, int arg1, int arg2, int arg3, class368 arg4) {
        ++field4887;
        int var6 = arg4.method1853(8645);
        int var7 = arg3 * this.method2228((byte) -97, var6);
        if (arg1 != 32) {
            this.field5037 = null;
        }
        this.method2114(-2059453976, arg4);
        OpenGL.glDrawElements(arg0, arg2, var6, arg4.method1852(arg1 ^ 5469) + (long) var7);
    }

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "()I")
    public final int method2230() {
        ++field4765;
        return this.field4988;
    }

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "(I)V")
    private final void method2231(int arg0) {
        this.field5053[14] = this.field5032;
        ++field4844;
        this.field5053[10] = this.field5034;
        this.field5065 = (float) this.field4985;
        this.field5091 = (this.field5053[14] - (float) this.field4985) / this.field5053[arg0];
    }
}
