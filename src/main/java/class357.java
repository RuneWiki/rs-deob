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

@OriginalClass("client!eq")
public class class357 extends class454 {

    @OriginalMember(owner = "client!eq", name = "Vb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4822 = new Hashtable();

    @OriginalMember(owner = "client!eq", name = "ne", descriptor = "I")
    public int field4944 = 128;

    @OriginalMember(owner = "client!eq", name = "ve", descriptor = "Leba;")
    private class270 field4952 = new class270();

    @OriginalMember(owner = "client!eq", name = "we", descriptor = "Lfw;")
    private class688 field4953 = new class688();

    @OriginalMember(owner = "client!eq", name = "xe", descriptor = "Lfw;")
    public class688 field4954 = new class688();

    @OriginalMember(owner = "client!eq", name = "ze", descriptor = "I")
    public int field4956 = 3;

    @OriginalMember(owner = "client!eq", name = "De", descriptor = "Z")
    private boolean field4960 = false;

    @OriginalMember(owner = "client!eq", name = "Ce", descriptor = "I")
    public int field4959 = 8;

    @OriginalMember(owner = "client!eq", name = "Be", descriptor = "Lqia;")
    private class547 field4958 = new class547();

    @OriginalMember(owner = "client!eq", name = "He", descriptor = "[Lqv;")
    private class72[] field4964 = new class72[4];

    @OriginalMember(owner = "client!eq", name = "Ge", descriptor = "[Lqv;")
    private class72[] field4963 = new class72[4];

    @OriginalMember(owner = "client!eq", name = "Je", descriptor = "I")
    private int field4966 = -1;

    @OriginalMember(owner = "client!eq", name = "Oe", descriptor = "I")
    private int field4971 = -1;

    @OriginalMember(owner = "client!eq", name = "Me", descriptor = "I")
    private int field4969 = -1;

    @OriginalMember(owner = "client!eq", name = "Ne", descriptor = "[Lqv;")
    private class72[] field4970 = new class72[4];

    @OriginalMember(owner = "client!eq", name = "Se", descriptor = "Lqia;")
    private class547 field4975;

    @OriginalMember(owner = "client!eq", name = "Te", descriptor = "Lqia;")
    private class547 field4976;

    @OriginalMember(owner = "client!eq", name = "Ue", descriptor = "Lqia;")
    private class547 field4977;

    @OriginalMember(owner = "client!eq", name = "Ve", descriptor = "Lqia;")
    private class547 field4978;

    @OriginalMember(owner = "client!eq", name = "We", descriptor = "Lqia;")
    private class547 field4979;

    @OriginalMember(owner = "client!eq", name = "Xe", descriptor = "Lqia;")
    private class547 field4980;

    @OriginalMember(owner = "client!eq", name = "Ye", descriptor = "Lqia;")
    private class547 field4981;

    @OriginalMember(owner = "client!eq", name = "ef", descriptor = "Lfw;")
    public class688 field4987;

    @OriginalMember(owner = "client!eq", name = "jf", descriptor = "Lfw;")
    public class688 field4991;

    @OriginalMember(owner = "client!eq", name = "kf", descriptor = "Lfw;")
    public class688 field4992;

    @OriginalMember(owner = "client!eq", name = "mf", descriptor = "F")
    public float field4994;

    @OriginalMember(owner = "client!eq", name = "Ff", descriptor = "F")
    private float field5013;

    @OriginalMember(owner = "client!eq", name = "Kf", descriptor = "F")
    public float field5018;

    @OriginalMember(owner = "client!eq", name = "Xf", descriptor = "[F")
    public float[] field5031;

    @OriginalMember(owner = "client!eq", name = "If", descriptor = "I")
    public int field5016;

    @OriginalMember(owner = "client!eq", name = "pf", descriptor = "Z")
    private boolean field4997;

    @OriginalMember(owner = "client!eq", name = "Mf", descriptor = "[F")
    private float[] field5020;

    @OriginalMember(owner = "client!eq", name = "Sf", descriptor = "I")
    private int field5026;

    @OriginalMember(owner = "client!eq", name = "Ag", descriptor = "I")
    public int field5060;

    @OriginalMember(owner = "client!eq", name = "uf", descriptor = "F")
    public float field5002;

    @OriginalMember(owner = "client!eq", name = "yg", descriptor = "F")
    private float field5058;

    @OriginalMember(owner = "client!eq", name = "ng", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!eq", name = "vg", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!eq", name = "Hg", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!eq", name = "Lg", descriptor = "I")
    private int field5071;

    @OriginalMember(owner = "client!eq", name = "tg", descriptor = "F")
    private float field5053;

    @OriginalMember(owner = "client!eq", name = "Qf", descriptor = "I")
    public int field5024;

    @OriginalMember(owner = "client!eq", name = "Ig", descriptor = "F")
    private float field5068;

    @OriginalMember(owner = "client!eq", name = "Tg", descriptor = "I")
    private int field5079;

    @OriginalMember(owner = "client!eq", name = "xg", descriptor = "I")
    private int field5057;

    @OriginalMember(owner = "client!eq", name = "wg", descriptor = "[Lpk;")
    private class621[] field5056;

    @OriginalMember(owner = "client!eq", name = "fg", descriptor = "I")
    private int field5039;

    @OriginalMember(owner = "client!eq", name = "sf", descriptor = "F")
    private float field5000;

    @OriginalMember(owner = "client!eq", name = "Qg", descriptor = "I")
    private int field5076;

    @OriginalMember(owner = "client!eq", name = "Lf", descriptor = "F")
    public float field5019;

    @OriginalMember(owner = "client!eq", name = "Dg", descriptor = "I")
    public int field5063;

    @OriginalMember(owner = "client!eq", name = "Mg", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!eq", name = "Jg", descriptor = "I")
    private int field5069;

    @OriginalMember(owner = "client!eq", name = "Ug", descriptor = "F")
    public float field5080;

    @OriginalMember(owner = "client!eq", name = "gh", descriptor = "I")
    private int field5092;

    @OriginalMember(owner = "client!eq", name = "Af", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!eq", name = "tf", descriptor = "I")
    public int field5001;

    @OriginalMember(owner = "client!eq", name = "eg", descriptor = "Z")
    private boolean field5038;

    @OriginalMember(owner = "client!eq", name = "Gg", descriptor = "[F")
    private float[] field5066;

    @OriginalMember(owner = "client!eq", name = "lh", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!eq", name = "fh", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!eq", name = "ih", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!eq", name = "ph", descriptor = "F")
    public float field5101;

    @OriginalMember(owner = "client!eq", name = "Vf", descriptor = "[F")
    private float[] field5029;

    @OriginalMember(owner = "client!eq", name = "Sg", descriptor = "[F")
    private float[] field5078;

    @OriginalMember(owner = "client!eq", name = "qh", descriptor = "F")
    public float field5102;

    @OriginalMember(owner = "client!eq", name = "kg", descriptor = "Lwb;")
    public class552 field5044;

    @OriginalMember(owner = "client!eq", name = "vh", descriptor = "[I")
    public int[] field5107;

    @OriginalMember(owner = "client!eq", name = "uh", descriptor = "[B")
    public byte[] field5106;

    @OriginalMember(owner = "client!eq", name = "th", descriptor = "[I")
    public int[] field5105;

    @OriginalMember(owner = "client!eq", name = "xh", descriptor = "[I")
    public int[] field5109;

    @OriginalMember(owner = "client!eq", name = "ue", descriptor = "I")
    public int field4951;

    @OriginalMember(owner = "client!eq", name = "Cc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4855;

    @OriginalMember(owner = "client!eq", name = "Ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4801;

    @OriginalMember(owner = "client!eq", name = "be", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4932;

    @OriginalMember(owner = "client!eq", name = "Xc", descriptor = "J")
    private long field4876;

    @OriginalMember(owner = "client!eq", name = "me", descriptor = "J")
    private long field4943;

    @OriginalMember(owner = "client!eq", name = "Rf", descriptor = "Z")
    public boolean field5025;

    @OriginalMember(owner = "client!eq", name = "Zf", descriptor = "I")
    public int field5033;

    @OriginalMember(owner = "client!eq", name = "vf", descriptor = "Ljava/lang/String;")
    private String field5003;

    @OriginalMember(owner = "client!eq", name = "gg", descriptor = "Z")
    private boolean field5040;

    @OriginalMember(owner = "client!eq", name = "bh", descriptor = "Z")
    public boolean field5087;

    @OriginalMember(owner = "client!eq", name = "Of", descriptor = "Z")
    public boolean field5022;

    @OriginalMember(owner = "client!eq", name = "Jf", descriptor = "Z")
    public boolean field5017;

    @OriginalMember(owner = "client!eq", name = "mh", descriptor = "Z")
    public boolean field5098;

    @OriginalMember(owner = "client!eq", name = "wf", descriptor = "Z")
    private boolean field5004;

    @OriginalMember(owner = "client!eq", name = "Kg", descriptor = "Ljava/lang/String;")
    private String field5070;

    @OriginalMember(owner = "client!eq", name = "Ng", descriptor = "Z")
    public boolean field5073;

    @OriginalMember(owner = "client!eq", name = "Cf", descriptor = "Z")
    private boolean field5010;

    @OriginalMember(owner = "client!eq", name = "se", descriptor = "Lks;")
    private class450 field4949;

    @OriginalMember(owner = "client!eq", name = "Ae", descriptor = "Lwaa;")
    public class172 field4957;

    @OriginalMember(owner = "client!eq", name = "oe", descriptor = "Lvd;")
    private class682 field4945;

    @OriginalMember(owner = "client!eq", name = "te", descriptor = "Lfr;")
    private class317 field4950;

    @OriginalMember(owner = "client!eq", name = "pe", descriptor = "Lkv;")
    private class18 field4946;

    @OriginalMember(owner = "client!eq", name = "nf", descriptor = "F")
    public float field4995;

    @OriginalMember(owner = "client!eq", name = "zf", descriptor = "F")
    private float field5007;

    @OriginalMember(owner = "client!eq", name = "Yf", descriptor = "F")
    public float field5032;

    @OriginalMember(owner = "client!eq", name = "ig", descriptor = "F")
    private float field5042;

    @OriginalMember(owner = "client!eq", name = "jg", descriptor = "F")
    public float field5043;

    @OriginalMember(owner = "client!eq", name = "sg", descriptor = "F")
    public float field5052;

    @OriginalMember(owner = "client!eq", name = "Og", descriptor = "F")
    public float field5074;

    @OriginalMember(owner = "client!eq", name = "Xg", descriptor = "F")
    private float field5083;

    @OriginalMember(owner = "client!eq", name = "dh", descriptor = "F")
    public float field5089;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    private int field4744;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!eq", name = "O", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!eq", name = "S", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!eq", name = "V", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!eq", name = "W", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!eq", name = "Z", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!eq", name = "ab", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!eq", name = "bb", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!eq", name = "cb", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!eq", name = "db", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!eq", name = "eb", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!eq", name = "fb", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!eq", name = "gb", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!eq", name = "ib", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!eq", name = "jb", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!eq", name = "kb", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!eq", name = "lb", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!eq", name = "mb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!eq", name = "nb", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!eq", name = "ob", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!eq", name = "pb", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!eq", name = "qb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!eq", name = "rb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!eq", name = "sb", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!eq", name = "tb", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!eq", name = "ub", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!eq", name = "vb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!eq", name = "wb", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!eq", name = "xb", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!eq", name = "yb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!eq", name = "zb", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!eq", name = "Bb", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!eq", name = "Cb", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!eq", name = "Db", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!eq", name = "Eb", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!eq", name = "Fb", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!eq", name = "Gb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!eq", name = "Hb", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!eq", name = "Ib", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!eq", name = "Jb", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!eq", name = "Kb", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!eq", name = "Lb", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!eq", name = "Mb", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!eq", name = "Nb", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!eq", name = "Ob", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!eq", name = "Pb", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!eq", name = "Qb", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!eq", name = "Rb", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!eq", name = "Sb", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!eq", name = "Tb", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!eq", name = "Ub", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!eq", name = "Wb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!eq", name = "Xb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!eq", name = "Yb", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!eq", name = "Zb", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!eq", name = "ac", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!eq", name = "bc", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!eq", name = "cc", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!eq", name = "dc", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!eq", name = "ec", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!eq", name = "fc", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!eq", name = "gc", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!eq", name = "hc", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!eq", name = "ic", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!eq", name = "jc", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!eq", name = "kc", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!eq", name = "lc", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!eq", name = "mc", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!eq", name = "nc", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!eq", name = "oc", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!eq", name = "pc", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!eq", name = "qc", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!eq", name = "rc", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!eq", name = "sc", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!eq", name = "tc", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!eq", name = "uc", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!eq", name = "vc", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!eq", name = "wc", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!eq", name = "xc", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!eq", name = "yc", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!eq", name = "zc", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!eq", name = "Ac", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!eq", name = "Bc", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!eq", name = "Dc", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!eq", name = "Ec", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!eq", name = "Fc", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!eq", name = "Gc", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!eq", name = "Hc", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!eq", name = "Ic", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!eq", name = "Jc", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!eq", name = "Kc", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!eq", name = "Lc", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!eq", name = "Mc", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!eq", name = "Nc", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!eq", name = "Oc", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!eq", name = "Pc", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!eq", name = "Qc", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!eq", name = "Rc", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!eq", name = "Sc", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!eq", name = "Tc", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!eq", name = "Uc", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!eq", name = "Vc", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!eq", name = "Wc", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!eq", name = "Yc", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!eq", name = "Zc", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!eq", name = "ad", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!eq", name = "bd", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!eq", name = "cd", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!eq", name = "dd", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!eq", name = "ed", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!eq", name = "fd", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!eq", name = "gd", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!eq", name = "hd", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!eq", name = "id", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!eq", name = "jd", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!eq", name = "kd", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!eq", name = "ld", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!eq", name = "md", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!eq", name = "nd", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!eq", name = "od", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!eq", name = "pd", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!eq", name = "qd", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!eq", name = "rd", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!eq", name = "sd", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!eq", name = "td", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!eq", name = "ud", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!eq", name = "vd", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!eq", name = "wd", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!eq", name = "xd", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!eq", name = "yd", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!eq", name = "zd", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!eq", name = "Ad", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!eq", name = "Bd", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!eq", name = "Cd", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!eq", name = "Dd", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!eq", name = "Ed", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!eq", name = "Fd", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!eq", name = "Gd", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!eq", name = "Hd", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!eq", name = "Id", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!eq", name = "Jd", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!eq", name = "Kd", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!eq", name = "Ld", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!eq", name = "Md", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!eq", name = "Nd", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!eq", name = "Od", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!eq", name = "Pd", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!eq", name = "Qd", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!eq", name = "Rd", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!eq", name = "Sd", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!eq", name = "Td", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!eq", name = "Ud", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!eq", name = "Vd", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!eq", name = "Wd", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!eq", name = "Xd", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!eq", name = "Yd", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!eq", name = "Zd", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!eq", name = "ae", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!eq", name = "ce", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!eq", name = "de", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!eq", name = "ee", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!eq", name = "fe", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!eq", name = "ge", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!eq", name = "he", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!eq", name = "ie", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!eq", name = "je", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!eq", name = "ke", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!eq", name = "le", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!eq", name = "qe", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!eq", name = "re", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!eq", name = "Ee", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!eq", name = "Pe", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!eq", name = "Qe", descriptor = "I")
    private int field4973;

    @OriginalMember(owner = "client!eq", name = "Re", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!eq", name = "Ze", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!eq", name = "cf", descriptor = "I")
    private int field4985;

    @OriginalMember(owner = "client!eq", name = "ff", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!eq", name = "yf", descriptor = "I")
    public int field5006;

    @OriginalMember(owner = "client!eq", name = "Bf", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!eq", name = "Df", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!eq", name = "Nf", descriptor = "I")
    private int field5021;

    @OriginalMember(owner = "client!eq", name = "Pf", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!eq", name = "Wf", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!eq", name = "bg", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!eq", name = "zg", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!eq", name = "Vg", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!eq", name = "kh", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!eq", name = "oh", descriptor = "I")
    private int field5100;

    @OriginalMember(owner = "client!eq", name = "rh", descriptor = "I")
    private int field5103;

    @OriginalMember(owner = "client!eq", name = "sh", descriptor = "I")
    private int field5104;

    @OriginalMember(owner = "client!eq", name = "wh", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!eq", name = "bf", descriptor = "J")
    private long field4984;

    @OriginalMember(owner = "client!eq", name = "dg", descriptor = "Lhga;")
    public class185 field5037;

    @OriginalMember(owner = "client!eq", name = "of", descriptor = "Lur;")
    private class355 field4996;

    @OriginalMember(owner = "client!eq", name = "Pg", descriptor = "Lur;")
    private class355 field5075;

    @OriginalMember(owner = "client!eq", name = "qf", descriptor = "Lhn;")
    public class403 field4998;

    @OriginalMember(owner = "client!eq", name = "Hf", descriptor = "Lhn;")
    public class403 field5015;

    @OriginalMember(owner = "client!eq", name = "Tf", descriptor = "Lhn;")
    public class403 field5027;

    @OriginalMember(owner = "client!eq", name = "cg", descriptor = "Lhn;")
    public class403 field5036;

    @OriginalMember(owner = "client!eq", name = "hg", descriptor = "Lhn;")
    public class403 field5041;

    @OriginalMember(owner = "client!eq", name = "ug", descriptor = "Lhn;")
    public class403 field5054;

    @OriginalMember(owner = "client!eq", name = "Cg", descriptor = "Lhn;")
    public class403 field5062;

    @OriginalMember(owner = "client!eq", name = "Eg", descriptor = "Lhn;")
    public class403 field5064;

    @OriginalMember(owner = "client!eq", name = "eh", descriptor = "Lhn;")
    public class403 field5090;

    @OriginalMember(owner = "client!eq", name = "nh", descriptor = "Lhn;")
    public class403 field5099;

    @OriginalMember(owner = "client!eq", name = "Fe", descriptor = "Ltt;")
    private class504 field4962;

    @OriginalMember(owner = "client!eq", name = "xf", descriptor = "Ltt;")
    public class504 field5005;

    @OriginalMember(owner = "client!eq", name = "Uf", descriptor = "Lkc;")
    private class66 field5028;

    @OriginalMember(owner = "client!eq", name = "mg", descriptor = "Ljb;")
    private class719 field5046;

    @OriginalMember(owner = "client!eq", name = "Ie", descriptor = "Lqv;")
    private class72 field4965;

    @OriginalMember(owner = "client!eq", name = "Le", descriptor = "Lqv;")
    private class72 field4968;

    @OriginalMember(owner = "client!eq", name = "Ke", descriptor = "Lau;")
    private class746 field4967;

    @OriginalMember(owner = "client!eq", name = "rf", descriptor = "Lmba;")
    private class77 field4999;

    @OriginalMember(owner = "client!eq", name = "rg", descriptor = "Lqe;")
    public class88 field5051;

    @OriginalMember(owner = "client!eq", name = "Yg", descriptor = "Lqe;")
    public class88 field5084;

    @OriginalMember(owner = "client!eq", name = "ye", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4955;

    @OriginalMember(owner = "client!eq", name = "af", descriptor = "Z")
    private boolean field4983;

    @OriginalMember(owner = "client!eq", name = "df", descriptor = "Z")
    private boolean field4986;

    @OriginalMember(owner = "client!eq", name = "gf", descriptor = "Z")
    private boolean field4989;

    @OriginalMember(owner = "client!eq", name = "hf", descriptor = "Z")
    private boolean field4990;

    @OriginalMember(owner = "client!eq", name = "lf", descriptor = "Z")
    public boolean field4993;

    @OriginalMember(owner = "client!eq", name = "Ef", descriptor = "Z")
    private boolean field5012;

    @OriginalMember(owner = "client!eq", name = "Gf", descriptor = "Z")
    public boolean field5014;

    @OriginalMember(owner = "client!eq", name = "ag", descriptor = "Z")
    public boolean field5034;

    @OriginalMember(owner = "client!eq", name = "lg", descriptor = "Z")
    public boolean field5045;

    @OriginalMember(owner = "client!eq", name = "og", descriptor = "Z")
    public boolean field5048;

    @OriginalMember(owner = "client!eq", name = "pg", descriptor = "Z")
    private boolean field5049;

    @OriginalMember(owner = "client!eq", name = "qg", descriptor = "Z")
    private boolean field5050;

    @OriginalMember(owner = "client!eq", name = "Fg", descriptor = "Z")
    public boolean field5065;

    @OriginalMember(owner = "client!eq", name = "Rg", descriptor = "Z")
    public boolean field5077;

    @OriginalMember(owner = "client!eq", name = "Wg", descriptor = "Z")
    public boolean field5082;

    @OriginalMember(owner = "client!eq", name = "Zg", descriptor = "Z")
    public boolean field5085;

    @OriginalMember(owner = "client!eq", name = "ah", descriptor = "Z")
    private boolean field5086;

    @OriginalMember(owner = "client!eq", name = "ch", descriptor = "Z")
    private boolean field5088;

    @OriginalMember(owner = "client!eq", name = "hh", descriptor = "Z")
    private boolean field5093;

    @OriginalMember(owner = "client!eq", name = "jh", descriptor = "Z")
    private boolean field5095;

    @OriginalMember(owner = "client!eq", name = "hb", descriptor = "[Lmb;")
    public static class410[] field4782;

    @OriginalMember(owner = "client!eq", name = "Bg", descriptor = "[Lkp;")
    private class411[] field5061;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "()Z", line = 5)
    public final boolean method113() {
        ++field4838;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(B)V", line = 13)
    public static void method2113(byte arg0) {
        field4782 = null;
        if (arg0 != -36) {
            field4782 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)V", line = 23)
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        this.field4945.method3703(arg0, arg2, arg3, 0, arg1);
        ++field4923;
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(II)V", line = 33)
    public final synchronized void method2114(int arg0, int arg1) {
        int var3 = -33 / ((arg1 - 74) / 32);
        ++field4853;
        class627 var4 = new class627();
        var4.field8746 = (long) arg0;
        this.field4980.method3110(var4, 1);
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V", line = 46)
    public final void method2115(int arg0) {
        ++field4874;
        OpenGL.glLightfv(16384, 4611, this.field5031, 0);
        OpenGL.glLightfv(16385, 4611, this.field5020, arg0);
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(II)V", line = 55)
    public final void method118(int arg0, int arg1) {
        if (this.field5060 != arg0 || this.field5039 != arg1) {
            this.field5060 = arg0;
            this.field5039 = arg1;
            this.method2161(-113);
            this.method2145((byte) -79);
            if (this.field5011 != 3) {
                if (~this.field5011 == -3) {
                    this.method2162(106);
                }
            } else {
                this.method2154(-17081);
            }
        }
        ++field4910;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lpea;Lst;)Lmk;", line = 81)
    public final class344 method154(class594 arg0, class675 arg1) {
        ++field4844;
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V", line = 91)
    public final void method2116(int arg0) {
        if (this.field4982 != 2) {
            this.method2141(24725);
            this.method2148(arg0 + -32, false);
            this.method2188(false, false);
            this.method2139(2929, false);
            this.method2125(arg0, false);
            this.method2140(0, -2);
            this.field4982 = 2;
        }
        if (arg0 == 0) {
            ++field4889;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 114)
    public final void method151(Canvas arg0, int arg1, int arg2) {
        ++field4757;
        long var4 = 0L;
        if (arg0 != null && this.field4855 != arg0) {
            if (this.field4822.containsKey(arg0)) {
                Long var6 = (Long) this.field4822.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field4876;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field4932.surfaceResized(var4);
            if (this.field4801 == arg0) {
                this.method2190((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)V", line = 146)
    private final void method2117(byte arg0) {
        int var2 = 94 % ((arg0 - 28) / 41);
        if (this.field5050 && !this.field5088) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4897;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "()V", line = 160)
    public final void method172() {
        ++field4862;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(II)V", line = 168)
    public final void method2118(int arg0, int arg1) {
        class65.field877[1] = (float) class272.method1629(65280, arg0) / 65280.0F;
        ++field4788;
        class65.field877[3] = (float) (arg0 >>> 24) / 255.0F;
        class65.field877[0] = (float) class272.method1629(16711680, arg0) / 1.671168E7F;
        if (arg1 == -15182) {
            class65.field877[2] = (float) class272.method1629(arg0, 255) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class65.field877, 0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lcd;I)V", line = 183)
    public final void method155(class603 arg0, int arg1) {
        this.field4952.method1616(this, 8902, arg1, arg0);
        ++field4859;
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)V", line = 201)
    private final void method2119(byte arg0) {
        ++field4933;
        int var2 = 0;
        if (arg0 >= -93) {
            this.field4949 = null;
        }
        while (this.field5009 > var2) {
            class621 var3 = this.field5056[var2];
            class584.field8113[0] = (float) var3.method3402(true);
            int var4 = var2 + 16386;
            class584.field8113[1] = (float) var3.method3403((byte) 116);
            class584.field8113[2] = (float) var3.method3404(-1);
            class584.field8113[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class584.field8113, 0);
            int var5 = var3.method3401(4);
            float var6 = var3.method3405(false) / 255.0F;
            class584.field8113[0] = (float) (class272.method1629(16744837, var5) >> 16) * var6;
            class584.field8113[1] = (float) class272.method1629(255, var5 >> 8) * var6;
            class584.field8113[2] = var6 * (float) class272.method1629(255, var5);
            OpenGL.glLightfv(var4, 4609, class584.field8113, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3399((byte) -108) * var3.method3399((byte) -108)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (this.field5100 > var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field5100 = this.field5009;
    }

    @OriginalMember(owner = "client!eq", name = "Q", descriptor = "(IIIIII[BII)V", line = 247)
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4931;
        float var10;
        float var11;
        if (this.field4999 != null && ~this.field4999.field2433 <= ~arg2 && ~arg3 >= ~this.field4999.field2435) {
            this.field4999.method1187(arg2, arg3, false, arg6, 0, 3317, 6406, 0, 0, 0);
            var10 = (float) arg3 * this.field4999.field1031 / (float) this.field4999.field2435;
            var11 = (float) arg2 * this.field4999.field1028 / (float) this.field4999.field2433;
        } else {
            this.field4999 = class714.method3957(arg3, (byte) 38, 6406, arg6, false, 6406, arg2, this);
            this.field4999.method1188(10242, false, false);
            var10 = this.field4999.field1031;
            var11 = this.field4999.field1028;
        }
        this.method2116(0);
        this.method2120(-1, this.field4999);
        this.method2195(65, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2118(arg5, -15182);
        this.method2165((byte) 74, 34165, 34165);
        this.method2132(768, (byte) 20, 34166, 0);
        this.method2132(770, (byte) -26, 5890, 2);
        this.method2189(34166, true, 0, 770);
        this.method2189(5890, true, 2, 770);
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
        this.method2132(768, (byte) 104, 5890, 0);
        this.method2132(770, (byte) -65, 34166, 2);
        this.method2189(5890, true, 0, 770);
        this.method2189(34166, true, 2, 770);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILkp;)V", line = 304)
    public final void method2120(int arg0, class411 arg1) {
        ++field4754;
        if (arg0 != -1) {
            this.field4946 = null;
        }
        class411 var3 = this.field5061[this.field5021];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field5794);
                } else if (~arg1.field5794 != ~var3.field5794) {
                    OpenGL.glDisable(var3.field5794);
                    OpenGL.glEnable(arg1.field5794);
                }
                OpenGL.glBindTexture(arg1.field5794, arg1.method2439(true));
            } else {
                OpenGL.glDisable(var3.field5794);
            }
            this.field5061[this.field5021] = arg1;
        }
        this.field4982 &= -2;
    }

    @OriginalMember(owner = "client!eq", name = "GA", descriptor = "(I)V", line = 345)
    public final void method166(int arg0) {
        ++field4905;
        this.method2195(44, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lwc;)V", line = 363)
    public final void method77(class376 arg0) {
        ++field4861;
        this.field4987.method1961(arg0);
        this.field4991.method1961(this.field4987);
        this.field4991.method3846(2);
        this.field4992.method3844(this.field4991, (byte) 114);
        if (this.field5011 != 1) {
            this.method2143(70);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I", line = 379)
    public final int method100(int arg0, int arg1) {
        ++field4806;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "()Z", line = 387)
    public final boolean method107() {
        ++field4901;
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)V", line = 395)
    public final void method2121(byte arg0) {
        if (arg0 <= 52) {
            this.method76((int[]) null);
        }
        if (~this.field4982 != -5) {
            this.method2141(24725);
            this.method2148(-32, false);
            this.method2188(false, false);
            this.method2139(2929, false);
            this.method2125(0, false);
            this.method2140(0, -2);
            this.method2195(-99, 1);
            this.field4982 = 4;
        }
        ++field4752;
    }

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "()Lwc;", line = 417)
    public final class376 method114() {
        ++field4810;
        return this.field4953;
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(B)V", line = 429)
    private final void method2122(byte arg0) {
        ++field4830;
        int var2 = 84 % ((66 - arg0) / 33);
        OpenGL.glViewport(this.field5076, this.field5057, this.field4917, this.field4882);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 440)
    public final void method98(Canvas arg0, int arg1, int arg2) {
        ++field4781;
        if (this.field4855 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4822.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field4932.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field4822.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(Z)V", line = 477)
    private final void method2123(boolean arg0) {
        class65.field877[3] = 1.0F;
        class65.field877[1] = this.field5052 * this.field5019;
        ++field4864;
        class65.field877[2] = this.field5052 * this.field5018;
        if (!arg0) {
            this.field5054 = null;
        }
        class65.field877[0] = this.field5102 * this.field5052;
        OpenGL.glLightModelfv(2899, class65.field877, 0);
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(Z)V", line = 494)
    private final void method2124(boolean arg0) {
        ++field4834;
        if (this.field5086 && this.field5063 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (!arg0) {
            this.method155((class603) null, 116);
        }
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "()V", line = 511)
    public final void method62() {
        ++field4894;
        if (this.field5073) {
            if (this.field4968 != this.field4962) {
                throw new RuntimeException();
            }
            this.field4962.method2904(0, (byte) 74);
            this.field4962.method2904(8, (byte) 61);
            this.method2142(-76, this.field4962);
        } else {
            if (!this.field5049) {
                throw new RuntimeException("");
            }
            this.field4967.method688(0, 0, this.field4917, this.field4882, 0, 0);
            this.field4932.setSurface(this.field4943);
        }
        this.field4917 = this.field4744;
        this.field4967 = null;
        this.field4882 = this.field4811;
        this.method2193(8448);
        this.method2122((byte) 101);
        this.method59();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ltba;[Lbe;Z)Lda;", line = 543)
    public final class423 method156(class56 arg0, class196[] arg1, boolean arg2) {
        ++field4795;
        return new class628(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)Lac;", line = 551)
    public final class712 method157(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4870;
        return new class746(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZ)V", line = 560)
    public final void method2125(int arg0, boolean arg1) {
        ++field4920;
        if (this.field4990 != arg1) {
            this.field4990 = arg1;
            this.method2136((byte) 70);
            this.field4982 &= -32;
        }
        if (arg0 != 0) {
            this.field4970 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "(I)V", line = 577)
    public final void method2126(int arg0) {
        ++field4784;
        if (arg0 != 1) {
            this.field4997 = true;
        }
        if (~this.field4982 != -9) {
            this.method2167(120);
            this.method2148(-32, true);
            this.method2139(2929, true);
            this.method2125(0, true);
            this.method2195(arg0 + 77, 1);
            this.field4982 = 8;
        }
    }

    @OriginalMember(owner = "client!eq", name = "K", descriptor = "([I)V", line = 598)
    public final void method76(int[] arg0) {
        arg0[0] = this.field5092;
        ++field4762;
        arg0[2] = this.field5008;
        arg0[1] = this.field5071;
        arg0[3] = this.field5026;
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V", line = 609)
    public final void method164(int arg0) {
        ++field4809;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V", line = 618)
    public final synchronized void method2127(int arg0, int arg1, int arg2) {
        ++field4868;
        class394 var4 = new class394(arg1);
        int var5 = -36 % ((arg2 - -40) / 58);
        var4.field8746 = (long) arg0;
        this.field4979.method3110(var4, 1);
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "(I)V", line = 631)
    private final void method2128(int arg0) {
        this.field5029[14] = this.field5083;
        this.field5029[10] = this.field5042;
        ++field4852;
        this.field5002 = (float) this.field5039;
        this.field5080 = (this.field5029[14] + (float) (-this.field5039)) / this.field5029[10];
        if (arg0 != 6941) {
            this.method2133((byte) -32, 63, 31, -40);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZ)Lac;", line = 650)
    public final class712 method70(int arg0, int arg1, boolean arg2) {
        ++field4764;
        return new class746(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 662)
    public final void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field4756;
        this.method2150(-2);
        this.method2195(62, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([I)V", line = 681)
    public final void method141(int[] arg0) {
        arg0[1] = this.field4882;
        ++field4928;
        arg0[0] = this.field4917;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IJ)V", line = 691)
    public final synchronized void method2129(int arg0, long arg1) {
        if (arg0 == 11642) {
            ++field4743;
            class627 var4 = new class627();
            var4.field8746 = arg1;
            this.field4981.method3110(var4, arg0 + -11641);
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V", line = 707)
    public final void method65(boolean arg0) {
        ++field4869;
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(II)I", line = 715)
    public final int method2130(int arg0, int arg1) {
        if (arg1 != -8695) {
            return -18;
        } else {
            ++field4748;
            if (~arg0 == -2) {
                return 7681;
            } else if (arg0 == 0) {
                return 8448;
            } else if (~arg0 == -3) {
                return 34165;
            } else if (~arg0 == -4) {
                return 260;
            } else if (~arg0 == -5) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "()Z", line = 745)
    public final boolean method123() {
        ++field4871;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "()I", line = 753)
    public final int method178() {
        ++field4789;
        return this.field4973 + this.field4972 + this.field4974;
    }

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "(I)V", line = 763)
    private final void method2131(int arg0) {
        class65.field877[3] = 1.0F;
        ++field4888;
        class65.field877[1] = this.field5019 * this.field4994;
        class65.field877[2] = this.field5018 * this.field4994;
        class65.field877[0] = this.field5102 * this.field4994;
        OpenGL.glLightfv(16384, 4609, class65.field877, 0);
        class65.field877[0] = -this.field5101 * this.field5102;
        class65.field877[1] = -this.field5101 * this.field5019;
        class65.field877[2] = -this.field5101 * this.field5018;
        int var2 = 6 % ((50 - arg0) / 61);
        class65.field877[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class65.field877, 0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBII)V", line = 782)
    public final void method2132(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg2);
        ++field4829;
        int var5 = -46 % ((arg1 - 58) / 38);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lid;IIII)Lka;", line = 793)
    public final class219 method150(class415 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4808;
        return new class403(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lcd;)V", line = 801)
    public final void method102(class603 arg0) {
        ++field4831;
        this.field4952.method1616(this, 8902, -1, arg0);
    }

    @OriginalMember(owner = "client!eq", name = "Y", descriptor = "()[I", line = 809)
    public final int[] method71() {
        ++field4841;
        return new int[] { this.field5067, this.field5016, this.field5055, this.field5001 };
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIII)V", line = 818)
    public final void method2133(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 11) {
            this.method2151((byte) 3, -0.60419035F, -1.5230641F);
        }
        OpenGL.glDrawArrays(arg1, arg3, arg2);
        ++field4934;
    }

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "()Z", line = 835)
    public final boolean method171() {
        ++field4828;
        return this.field4950 != null && (~this.field4951 >= -2 || this.field5093);
    }

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "(I)V", line = 843)
    private final void method2134(int arg0) {
        if (arg0 == 5) {
            ++field4791;
            int var2 = 0;
            while (!this.field4932.method278()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class517.method2965(1000L, -112);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "()V", line = 868)
    public final void method175() {
        ++field4774;
        if (this.field4950 != null && this.field4950.method2643(0)) {
            this.field4945.method3701(this.field4950, (byte) 108);
            this.field4949.method2650((byte) -125);
        }
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(II)V", line = 884)
    public final void method2135(int arg0, int arg1) {
        if (arg1 != -5027) {
            this.method2139(-26, false);
        }
        if (~this.field5021 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5021 = arg0;
        }
        ++field4873;
    }

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "(B)V", line = 903)
    private final void method2136(byte arg0) {
        ++field4884;
        OpenGL.glDepthMask(this.field4990 && this.field4997);
        if (arg0 <= 24) {
            this.method91();
        }
    }

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "()Loj;", line = 917)
    public final class633 method79() {
        ++field4875;
        int var1 = -1;
        if (this.field5070.indexOf("nvidia") == -1) {
            if (~this.field5070.indexOf("intel") != 0) {
                var1 = 32902;
            } else if (this.field5070.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class633(var1, "OpenGL", this.field5059, this.field5003, 0L);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZZ)V", line = 944)
    public final void method2137(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field4773;
        if (arg0 != -26379) {
            this.method127();
        }
        if (~this.field5096 != ~arg1 || this.field5048 != this.field5038) {
            class185 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5048 ? 0 : 3;
            if (~arg1 > -1) {
                this.method2159(arg0 ^ -26443);
            } else {
                var5 = this.field4949.method2648(-56, arg1);
                class91 var10 = super.field6364.method389(arg0 + 35938, arg1);
                if (var10.field1148 == 0 && ~var10.field1161 == -1) {
                    this.method2159(58);
                } else {
                    int var11 = var10.field1159 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2146(14649, 0.0F, (float) (this.field4961 % var12 * var10.field1148) / (float) var12, (float) (this.field4961 % var12 * var10.field1161) / (float) var12);
                }
                var6 = var10.field1154;
                if (!this.field5048) {
                    var8 = var10.field1163;
                    var9 = var10.field1149;
                    var7 = var10.field1160;
                }
            }
            this.field4946.method213(var7, arg3, arg0 ^ 26431, var9, var8, arg2);
            if (!this.field4946.method212(Integer.MAX_VALUE, var5, var6)) {
                this.method2120(-1, var5);
                this.method2153(82, var6);
            }
            this.field5038 = this.field5048;
            this.field5096 = arg1;
        }
        this.field4982 &= -8;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILjb;)V", line = 1007)
    public final void method2138(int arg0, class719 arg1) {
        if (arg0 != 28419) {
            this.method173(30, 81, -100, -50, (int[]) null);
        }
        if (this.field5046 != arg1) {
            if (this.field5040) {
                OpenGL.glBindBufferARB(34963, arg1.method2404(-10550));
            }
            this.field5046 = arg1;
        }
        ++field4794;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[I[I)Laa;", line = 1027)
    public final class81 method87(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4922;
        return class333.method1957(arg0, arg2, arg3, true, arg1, this);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IZ)V", line = 1036)
    public final void method2139(int arg0, boolean arg1) {
        if (this.field4983 != arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field4983 = arg1;
            this.field4982 &= -32;
        }
        if (arg0 == 2929) {
            ++field4826;
        }
    }

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "(II)V", line = 1059)
    public final void method2140(int arg0, int arg1) {
        ++field4849;
        this.method2160(arg1, arg0, true);
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V", line = 1068)
    public final void method169(boolean arg0) {
        ++field4904;
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "()Z", line = 1077)
    public final boolean method73() {
        ++field4766;
        return this.field4946.method214(3, -122);
    }

    @OriginalMember(owner = "client!eq", name = "ra", descriptor = "(IIII)V", line = 1085)
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        ++field4785;
        this.field5072 = arg2;
        this.field5030 = arg0;
        this.field5091 = arg1;
        this.field5097 = arg3;
        this.field5048 = true;
    }

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "()V", line = 1101)
    public final void method84() {
        for (class627 var1 = this.field4958.method3111(73); var1 != null; var1 = this.field4958.method3116(-112)) {
            ((class479) var1).method2808(-108);
        }
        ++field4771;
        if (this.field4945 != null) {
            this.field4945.method3698(1);
        }
        if (this.field4932 != null) {
            this.method2149((byte) -63);
            Enumeration var2 = this.field4822.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4822.get(var3);
                this.field4932.releaseSurface(var3, var4);
            }
            this.field4932.release();
            this.field4932 = null;
        }
        if (this.field4960) {
            class283.method1700(0, false, true);
            this.field4960 = false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIIII)Ltj;", line = 1145)
    public final class662 method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4913;
        return this.field5034 ? new class134(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!eq", name = "ya", descriptor = "()V", line = 1154)
    public final void method99() {
        ++field4851;
        this.method2125(0, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!eq", name = "xa", descriptor = "(F)V", line = 1167)
    public final void method139(float arg0) {
        ++field4763;
        if (this.field5052 != arg0) {
            this.field5052 = arg0;
            this.method2123(true);
        }
    }

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "(I)V", line = 1182)
    private final void method2141(int arg0) {
        if (~this.field5011 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field4917 < -1 && ~this.field4882 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field4917, (double) this.field4882, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5011 = 1;
            this.field4982 &= -25;
        }
        if (arg0 != 24725) {
            this.field5062 = null;
        }
        ++field4807;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILqv;)V", line = 1208)
    public final void method2142(int arg0, class72 arg1) {
        if (arg0 < -50) {
            ++field4817;
            if (!this.field5045) {
                if (this.field4966 >= 0 && this.field4964[this.field4966] == arg1) {
                    this.field4964[this.field4966--] = null;
                    arg1.method531((byte) -64);
                    if (this.field4966 >= 0) {
                        this.field4965 = this.field4968 = this.field4964[this.field4966];
                        this.field4965.method534(82);
                    } else {
                        this.field4965 = this.field4968 = null;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method2173(arg1, 20444);
                this.method2192(95, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(II)Lpea;", line = 1245)
    public final class594 method174(int arg0, int arg1) {
        ++field4833;
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "(I)V", line = 1253)
    private final void method2143(int arg0) {
        OpenGL.glLoadIdentity();
        ++field4780;
        if (arg0 > 67) {
            OpenGL.glMultMatrixf(this.field4991.method3847(1), 0);
            if (this.field5038) {
                this.field4946.field244.method854((byte) -95);
            }
            this.method2115(0);
            this.method2119((byte) -115);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ltj;Ltj;FLtj;)Ltj;", line = 1271)
    public final class662 method119(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        ++field4820;
        if (arg0 != null && arg1 != null && this.field5034 && this.field5073) {
            class570 var5 = null;
            class66 var6 = (class66) arg0;
            class66 var7 = (class66) arg1;
            class45 var8 = var6.method501(-95);
            class45 var9 = var7.method501(-90);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field670 <= ~var8.field670 ? var9.field670 : var8.field670;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class570) {
                    class570 var11 = (class570) arg3;
                    if (var11.method3206(88) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class570(this, var10);
                }
                if (var5.method3208(arg2, var8, (byte) 6, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!eq", name = "T", descriptor = "(IIII)V", line = 1317)
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5008 > arg2) {
            this.field5008 = arg2;
        }
        if (arg3 < this.field5026) {
            this.field5026 = arg3;
        }
        if (~this.field5092 > ~arg0) {
            this.field5092 = arg0;
        }
        ++field4935;
        if (~this.field5071 > ~arg1) {
            this.field5071 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method2152((byte) 25);
        this.method2174(78);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 1345)
    public final void method122(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class510 {
        ++field4854;
        this.method89(arg2, arg3);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILjaclib/memory/Buffer;ZB)Lur;", line = 1353)
    public final class355 method2144(int arg0, int arg1, Buffer arg2, boolean arg3, byte arg4) {
        ++field4843;
        if (arg4 != -91) {
            this.field5022 = true;
        }
        return (class355) (!this.field5040 || arg3 && !this.field5004 ? new class562(this, arg0, arg2) : new class554(this, arg0, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ltj;)V", line = 1375)
    public final void method170(class662 arg0) {
        this.field5028 = (class66) arg0;
        ++field4865;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIF)Lpk;", line = 1390)
    public final class621 method90(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4937;
        return new class643(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(B)V", line = 1398)
    private final void method2145(byte arg0) {
        this.field5007 = (float) (-this.field5047 + this.field5039) - this.field5013;
        ++field4908;
        if (arg0 == -79) {
            this.field5043 = -((float) this.field5063 * this.field5068) + this.field5007;
            if ((float) this.field5060 > this.field5043) {
                this.field5043 = (float) this.field5060;
            }
            OpenGL.glFogf(2915, this.field5043);
            OpenGL.glFogf(2916, this.field5007);
            class65.field877[1] = (float) class272.method1629(65280, this.field5024) / 65280.0F;
            class65.field877[0] = (float) class272.method1629(this.field5024, 16711680) / 1.671168E7F;
            class65.field877[2] = (float) class272.method1629(255, this.field5024) / 255.0F;
            OpenGL.glFogfv(2918, class65.field877, 0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "KA", descriptor = "(IIII)V", line = 1420)
    public final void method131(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~this.field4917 > ~arg2) {
            arg2 = this.field4917;
        }
        ++field4921;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (this.field4882 < arg3) {
            arg3 = this.field4882;
        }
        this.field5071 = arg1;
        this.field5026 = arg3;
        this.field5092 = arg0;
        this.field5008 = arg2;
        OpenGL.glEnable(3089);
        this.method2152((byte) 25);
        this.method2174(79);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IFFF)V", line = 1452)
    private final void method2146(int arg0, float arg1, float arg2, float arg3) {
        ++field4746;
        OpenGL.glMatrixMode(5890);
        if (this.field5012) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg3, arg1);
        OpenGL.glMatrixMode(5888);
        this.field5012 = true;
        if (arg0 != 14649) {
            this.field4983 = true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "()Z", line = 1472)
    public final boolean method57() {
        ++field4798;
        return this.field4950 != null && this.field4950.method2643(0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BF)V", line = 1480)
    public final void method2147(byte arg0, float arg1) {
        if (this.field5000 != arg1) {
            this.field5000 = arg1;
            if (~this.field5011 == -4) {
                this.method2154(-17081);
            }
        }
        if (arg0 != 112) {
            this.method166(39);
        }
        ++field4755;
    }

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "()Z", line = 1499)
    public final boolean method66() {
        ++field4799;
        return this.field5095 && (!this.method57() || this.field5093);
    }

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "()I", line = 1514)
    public final int method115() {
        ++field4892;
        return 4;
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IZ)V", line = 1524)
    public final void method2148(int arg0, boolean arg1) {
        if (!arg1 != !this.field5086) {
            this.field5086 = arg1;
            this.method2124(true);
            this.field4982 &= -32;
        }
        if (arg0 != -32) {
            this.method142();
        }
        ++field4819;
    }

    @OriginalMember(owner = "client!eq", name = "HA", descriptor = "(IIII[I)V", line = 1545)
    public final void method173(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4938;
        float var6 = (float) arg2 * this.field4987.field9756 + (float) arg0 * this.field4987.field9776 + (float) arg1 * this.field4987.field9764 + this.field4987.field9774;
        if (!(var6 < (float) this.field5060) && !((float) this.field5039 < var6)) {
            int var7 = (int) (((float) arg2 * this.field4987.field9773 + (float) arg0 * this.field4987.field9763 + (float) arg1 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4987.field9758 + (float) arg0 * this.field4987.field9753 + (float) arg1 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / (float) arg3);
            if (this.field5074 <= (float) var7 && (float) var7 <= this.field5089 && this.field4995 <= (float) var8 && this.field5032 >= (float) var8) {
                arg4[0] = (int) ((float) var7 - this.field5074);
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 - this.field4995);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lmk;)V", line = 1578)
    public final void method111(class344 arg0) {
        ++field4759;
    }

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)V", line = 1586)
    public final synchronized void method97(int arg0) {
        ++field4907;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field4976.method3112(-4)) {
            class394 var12 = (class394) this.field4976.method3115(1210318848);
            class296.field3851[var2++] = (int) var12.field8746;
            this.field4974 -= var12.field5494;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class296.field3851, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class296.field3851, 0);
            var2 = 0;
        }
        while (!this.field4977.method3112(-4)) {
            class394 var11 = (class394) this.field4977.method3115(1210318848);
            class296.field3851[var2++] = (int) var11.field8746;
            this.field4972 -= var11.field5494;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class296.field3851, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class296.field3851, 0);
            var2 = 0;
        }
        while (!this.field4978.method3112(-4)) {
            class394 var10 = (class394) this.field4978.method3115(1210318848);
            class296.field3851[var2++] = var10.field5494;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class296.field3851, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class296.field3851, 0);
            var2 = 0;
        }
        while (!this.field4979.method3112(-4)) {
            class394 var9 = (class394) this.field4979.method3115(1210318848);
            class296.field3851[var2++] = (int) var9.field8746;
            this.field4973 -= var9.field5494;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class296.field3851, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class296.field3851, 0);
            boolean var4 = false;
        }
        while (!this.field4975.method3112(-4)) {
            class394 var8 = (class394) this.field4975.method3115(1210318848);
            OpenGL.glDeleteLists((int) var8.field8746, var8.field5494);
        }
        while (!this.field4980.method3112(-4)) {
            class627 var7 = this.field4980.method3115(1210318848);
            OpenGL.glDeleteProgramARB((int) var7.field8746);
        }
        while (!this.field4981.method3112(-4)) {
            class627 var6 = this.field4981.method3115(1210318848);
            OpenGL.glDeleteObjectARB(var6.field8746);
        }
        while (!this.field4975.method3112(-4)) {
            class394 var5 = (class394) this.field4975.method3115(1210318848);
            OpenGL.glDeleteLists((int) var5.field8746, var5.field5494);
        }
        this.field4949.method2647(true);
        if (~this.method178() < -100663297 && this.field4984 + 60000L < class97.method654((byte) 44)) {
            System.gc();
            this.field4984 = class97.method654((byte) 44);
        }
        this.field4961 = var3;
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "(B)V", line = 1753)
    private final void method2149(byte arg0) {
        if (arg0 != -63) {
            this.field5005 = null;
        }
        ++field4787;
        this.field4932.method280();
    }

    @OriginalMember(owner = "client!eq", name = "pa", descriptor = "()V", line = 1765)
    public final void method179() {
        ++field4927;
        this.field5048 = false;
    }

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "(I)V", line = 1776)
    private final void method2150(int arg0) {
        ++field4778;
        if (~this.field4982 != arg0) {
            this.method2141(24725);
            this.method2148(-32, false);
            this.method2188(false, false);
            this.method2139(arg0 + 2931, false);
            this.method2125(0, false);
            this.method2120(arg0 + 1, (class411) null);
            this.method2140(arg0 ^ -2, -2);
            this.method2153(arg0 + 97, 1);
            this.field4982 = 1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BFF)V", line = 1798)
    public final void method2151(byte arg0, float arg1, float arg2) {
        this.field5013 = arg1;
        this.field5068 = arg2;
        if (arg0 > -105) {
            this.method174(-73, -33);
        }
        ++field4818;
        this.method2145((byte) -79);
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIIII)V", line = 1811)
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4813;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2150(-2);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2195(-128, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5095) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5095) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!eq", name = "na", descriptor = "(IIII)[I", line = 1843)
    public final int[] method143(int arg0, int arg1, int arg2, int arg3) {
        ++field4768;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field4882 - var6, arg2, 1, 32993, this.field5033, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "(B)V", line = 1867)
    private final void method2152(byte arg0) {
        this.field4995 = (float) (this.field5071 - this.field5016);
        ++field4814;
        this.field5032 = (float) (-this.field5016 + this.field5026);
        this.field5089 = (float) (-this.field5067 + this.field5008);
        if (arg0 != 25) {
            this.method74(-7, 24, -22, 96, 125, -53, -6);
        }
        this.field5074 = (float) (-this.field5067 + this.field5092);
    }

    @OriginalMember(owner = "client!eq", name = "X", descriptor = "(I)V", line = 1882)
    public final void method64(int arg0) {
        ++field4924;
        this.field4956 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field4956;
        }
        this.field4959 = 1 << this.field4956;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1899)
    public final class402 method101(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4891;
        return new class74(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "(II)V", line = 1910)
    public final void method2153(int arg0, int arg1) {
        ++field4872;
        if (arg1 == 1) {
            this.method2165((byte) 74, 7681, 7681);
        } else if (arg1 == 0) {
            this.method2165((byte) 74, 8448, 8448);
        } else if (~arg1 == -3) {
            this.method2165((byte) 74, 7681, 34165);
        } else if (arg1 != 3) {
            if (~arg1 == -5) {
                this.method2165((byte) 74, 34023, 34023);
            }
        } else {
            this.method2165((byte) 74, 8448, 260);
        }
        int var3 = 32 % ((26 - arg0) / 41);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V", line = 1939)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4815;
        OpenGL.glLineWidth((float) arg5);
        this.method134(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "(I)V", line = 1952)
    private final void method2154(int arg0) {
        ++field4895;
        if (arg0 == -17081) {
            float var2 = (float) (-this.field5067) * this.field5000 / (float) this.field5055;
            float var3 = (float) (-this.field5016) * this.field5000 / (float) this.field5001;
            float var4 = (float) (-this.field5067 + this.field4917) * this.field5000 / (float) this.field5055;
            float var5 = (float) (-this.field5016 + this.field4882) * this.field5000 / (float) this.field5001;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field5060, (double) this.field5039);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lbe;Z)Lac;", line = 1980)
    public final class712 method60(class196 arg0, boolean arg1) {
        ++field4900;
        int[] var3 = new int[arg0.field2527 * arg0.field2525];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2523 != null) {
            for (int var6 = 0; var6 < arg0.field2525; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field2527; ++var7) {
                    var3[var5++] = class216.method1308(arg0.field2529[class272.method1629(255, arg0.field2521[var4])], arg0.field2523[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field2525 > var8; ++var8) {
                for (int var10 = 0; arg0.field2527 > var10; ++var10) {
                    int var11 = arg0.field2529[arg0.field2521[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class216.method1308(var11, -16777216) : 0;
                }
            }
        }
        class712 var9 = this.method2666(arg0.field2525, arg0.field2527, (byte) -48, var3, 0, arg0.field2527);
        var9.method1874(arg0.field2526, arg0.field2522, arg0.field2528, arg0.field2524);
        return var9;
    }

    @OriginalMember(owner = "client!eq", name = "za", descriptor = "(IIIII)V", line = 2047)
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4779;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 >= this.field5092 && ~this.field5008 <= ~(-arg2 + arg0) && ~this.field5071 >= ~(arg1 + arg2) && this.field5026 >= -arg2 + arg1) {
            this.method2150(-2);
            this.method2195(71, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field5058 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field5053) {
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
                if (~var9 < -65) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class568.method3199(false, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class555.field7786[var11] * (float) arg2 + var6, class555.field7796[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "()V", line = 2124)
    public final void method93() {
        ++field4805;
        this.field4945.method3704(24426);
    }

    @OriginalMember(owner = "client!eq", name = "L", descriptor = "(III)V", line = 2135)
    public final void method130(int arg0, int arg1, int arg2) {
        if (this.field5024 != arg0 || this.field5063 != arg1 || this.field5047 != arg2) {
            this.field5024 = arg0;
            this.field5063 = arg1;
            this.field5047 = arg2;
            this.method2145((byte) -79);
            this.method2124(true);
        }
        ++field4796;
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(II)V", line = 2157)
    public final void method89(int arg0, int arg1) throws class510 {
        ++field4886;
        try {
            this.field4932.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "(B)V", line = 2174)
    private final void method2155(byte arg0) {
        if (arg0 <= -5) {
            if (this.field5011 != 3) {
                this.field5011 = 3;
                this.method2154(-17081);
                this.method2143(100);
                this.field4982 &= -8;
            }
            ++field4793;
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "()Z", line = 2192)
    public final boolean method88() {
        ++field4947;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "(B)I", line = 2202)
    private final int method2156(byte arg0) {
        ++field4896;
        this.field5070 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5003 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field5070.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (arg0 < 109) {
            this.method104(127, -28, 33, 69);
        }
        if (this.field5070.indexOf("brian paul") != -1 || this.field5070.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class124.method809(' ', 117, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class337.method1980(-27187, var4[0]);
                int var6 = class337.method1980(-27187, var4[1]);
                this.field5059 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field5059 > -13) {
            var2 |= 2;
        }
        if (!this.field4932.method279("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4932.method279("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5006 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5103 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5081 = var7[0];
        if (this.field5006 < 2 || ~this.field5103 > -3 || ~this.field5081 > -3) {
            var2 |= 16;
        }
        this.field5025 = Stream.method2226();
        this.field5049 = this.field4932.arePbuffersAvailable();
        this.field5040 = this.field4932.method279("GL_ARB_vertex_buffer_object");
        this.field5095 = this.field4932.method279("GL_ARB_multisample");
        this.field5077 = this.field4932.method279("GL_ARB_vertex_program");
        this.field4932.method279("GL_ARB_fragment_program");
        this.field5085 = this.field4932.method279("GL_ARB_vertex_shader");
        this.field5065 = this.field4932.method279("GL_ARB_fragment_shader");
        this.field5087 = this.field4932.method279("GL_EXT_texture3D");
        this.field5017 = this.field4932.method279("GL_ARB_texture_rectangle");
        this.field5034 = this.field4932.method279("GL_ARB_texture_cube_map");
        this.field5022 = this.field4932.method279("GL_ARB_texture_float");
        this.field5082 = false;
        this.field5073 = this.field4932.method279("GL_EXT_framebuffer_object");
        this.field5045 = this.field4932.method279("GL_EXT_framebuffer_blit");
        this.field5014 = this.field4932.method279("GL_EXT_framebuffer_multisample");
        this.field5093 = this.field5045 & this.field5014;
        this.field4993 = class525.field7419.startsWith("mac");
        OpenGL.glGetFloatv(2834, class65.field877, 0);
        this.field5053 = class65.field877[1];
        this.field5058 = class65.field877[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "()Z", line = 2288)
    public final boolean method86() {
        ++field4783;
        if (this.field4950 != null) {
            if (!this.field4950.method2643(0)) {
                if (!this.field4945.method3702(this.field4950, -1)) {
                    return false;
                }
                this.field4949.method2650((byte) -119);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "(I)V", line = 2316)
    public final void method2157(int arg0) {
        ++field4930;
        OpenGL.glPopMatrix();
        if (arg0 != -16937) {
            this.method88();
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(ILqv;)V", line = 2331)
    public final void method2158(int arg0, class72 arg1) {
        ++field4767;
        if (!this.field5045) {
            if (~this.field4966 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field4966 <= -1) {
                this.field4964[this.field4966].method531((byte) -107);
            }
            this.field4965 = this.field4968 = this.field4964[++this.field4966] = arg1;
            this.field4965.method534(arg0 ^ 29784);
        } else {
            this.method2197(-4915, arg1);
            this.method2191(true, arg1);
        }
        if (arg0 != -29780) {
            this.field5070 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "(I)V", line = 2359)
    private final void method2159(int arg0) {
        ++field4758;
        if (this.field5012) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5012 = false;
        }
        int var2 = -56 / ((arg0 - -42) / 61);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIZ)V", line = 2378)
    public final void method2160(int arg0, int arg1, boolean arg2) {
        ++field4881;
        this.method2137(arg1 ^ -26379, arg0, true, arg2);
        if (arg1 != 0) {
            this.method2149((byte) -3);
        }
    }

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "(I)V", line = 2392)
    private final void method2161(int arg0) {
        ++field4824;
        float[] var2 = this.field5029;
        float var3 = (float) (-this.field5067 * this.field5060) / (float) this.field5055;
        float var4 = (float) ((this.field4917 - this.field5067) * this.field5060) / (float) this.field5055;
        float var5 = (float) (this.field5060 * this.field5016) / (float) this.field5001;
        float var6 = (float) ((this.field5016 - this.field4882) * this.field5060) / (float) this.field5001;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5060 * 2.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[10] = this.field5042 = (float) (-(this.field5060 + this.field5039)) / (float) (-this.field5060 + this.field5039);
            var2[12] = 0.0F;
            var2[11] = -1.0F;
            var2[6] = 0.0F;
            var2[14] = this.field5083 = -((float) this.field5039 * var7) / (float) (-this.field5060 + this.field5039);
            var2[13] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[4] = 0.0F;
            var2[2] = 0.0F;
            var2[1] = 0.0F;
            var2[15] = 0.0F;
            var2[3] = 0.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[8] = (var3 + var4) / (var4 - var3);
        } else {
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[5] = 1.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[14] = 0.0F;
            var2[2] = 0.0F;
            var2[12] = 0.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[7] = 0.0F;
            var2[9] = 0.0F;
            var2[3] = 0.0F;
        }
        this.method2128(6941);
        if (arg0 > -36) {
            this.method164(113);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIII)V", line = 2458)
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4911;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            this.method2150(-2);
            this.method2195(94, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var13;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var15 >= ~arg6) {
                var20 = (float) (-var15 + arg6) * var13;
                var21 = (float) (-var15 + arg6) * var14;
            } else {
                var19 = (float) (arg6 - -arg7 + -var15) * var14;
                var18 = (float) (arg6 - (-arg7 - -var15)) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (~arg2 >= ~arg0) {
                    if ((float) arg2 + 0.35F > var22) {
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
                if (arg3 > arg1) {
                    if (var23 > (float) arg3 + 0.35F) {
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
                var22 += var20 + var24;
                var23 += var21 + var25;
                OpenGL.glEnd();
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIIIIZ)Lac;", line = 2570)
    public final class712 method75(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4769;
        return new class746(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "(I)V", line = 2578)
    private final void method2162(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 >= 29) {
            ++field4918;
            OpenGL.glLoadMatrixf(this.field5029, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FIFFF)V", line = 2591)
    public final void method2163(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class65.field877[3] = arg3;
        class65.field877[0] = arg2;
        class65.field877[1] = arg4;
        class65.field877[2] = arg0;
        if (arg1 != -13857) {
            this.method2172((byte[]) null, 74, 19, true, 95);
        }
        ++field4848;
        OpenGL.glTexEnvfv(8960, 8705, class65.field877, 0);
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(Z)V", line = 2606)
    public final void method2164(boolean arg0) {
        ++field4936;
        if (this.field4982 != 16) {
            this.method2155((byte) -42);
            this.method2148(-32, true);
            this.method2139(2929, true);
            this.method2125(0, true);
            this.method2195(-115, 1);
            this.field4982 = 16;
        }
        if (!arg0) {
            this.field4982 = -128;
        }
    }

    @OriginalMember(owner = "client!eq", name = "EA", descriptor = "(IIII)V", line = 2628)
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        ++field4775;
        if (!this.field5048) {
            throw new RuntimeException("");
        } else {
            this.field5030 = arg0;
            this.field5097 = arg3;
            this.field5091 = arg1;
            this.field5072 = arg2;
            if (this.field5038) {
                this.field4946.field244.method854((byte) -95);
                this.field4946.field244.method855(-65);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)V", line = 2656)
    public final void method2165(byte arg0, int arg1, int arg2) {
        if (~this.field5021 == -1) {
            boolean var4 = false;
            if (this.field5094 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field5094 = arg2;
                var4 = true;
            }
            if (this.field5069 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field5069 = arg1;
            }
            if (var4) {
                this.field4982 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
        if (arg0 != 74) {
            this.field4992 = null;
        }
        ++field4926;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)I", line = 2697)
    public final int method2166(byte arg0, int arg1) {
        ++field4835;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (~arg1 != -5124 && arg1 != 5122) {
                if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
                    if (arg0 != 68) {
                        this.field4952 = null;
                    }
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

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "()Z", line = 2720)
    public final boolean method176() {
        ++field4847;
        return false;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V", line = 2728)
    public final void method124(int arg0) {
        ++field4765;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "(I)V", line = 2740)
    private final void method2167(int arg0) {
        if (arg0 < 47) {
            this.method117(-44, 71, 58, 101);
        }
        ++field4761;
        if (~this.field5011 != -3) {
            this.field5011 = 2;
            this.method2162(57);
            this.method2143(119);
            this.field4982 &= -8;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lza;)V", line = 2758)
    public final void method133(class702 arg0) {
        ++field4790;
        this.field4955 = ((class479) arg0).field6846;
        if (this.field4996 == null) {
            class552 var2 = new class552(80);
            if (!this.field5025) {
                var2.method3145(-1.0F, -1);
                var2.method3145(-1.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(-1.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(-1.0F, -1);
                var2.method3145(1.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(0.0F, -1);
                var2.method3145(0.0F, -1);
            } else {
                var2.method3144(-1.0F, false);
                var2.method3144(-1.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(-1.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(-1.0F, false);
                var2.method3144(1.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(0.0F, false);
                var2.method3144(0.0F, false);
            }
            this.field4996 = this.method2180(20, var2.field2354, var2.field2325, true, false);
            this.field5051 = new class88(this.field4996, 5126, 3, 0);
            this.field5084 = new class88(this.field4996, 5126, 2, 12);
            this.field4952.method1623(this, -124);
        }
    }

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "(I)Lgv;", line = 2824)
    public final class45 method2168(int arg0) {
        ++field4878;
        if (arg0 > -71) {
            this.field5045 = true;
        }
        return this.field5028 != null ? this.field5028.method501(-125) : null;
    }

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "(I)V", line = 2835)
    private final void method2169(int arg0) {
        ++field4827;
        this.method2140(arg0 ^ arg0, -2);
        for (int var2 = this.field5006 + -1; var2 >= 0; --var2) {
            this.method2135(var2, -5027);
            this.method2120(-1, (class411) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2165((byte) 74, 8448, 8448);
        this.method2132(770, (byte) 14, 34168, 2);
        this.method2159(50);
        this.field4985 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field4988 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field4989 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field4986 = true;
        this.method2148(-32, true);
        this.method2188(false, true);
        this.method2139(2929, true);
        this.method2125(arg0 ^ 1, true);
        this.method2193(8448);
        this.field4932.setSwapInterval(0);
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
        this.field5079 = this.field5024 = -1;
        this.method59();
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V", line = 2906)
    public final void method82(int arg0) {
        this.method2149((byte) -63);
        ++field4942;
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V", line = 2914)
    public final void method68(int arg0) {
        ++field4802;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field4944 = arg0;
            this.field4949.method2650((byte) -128);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V", line = 2928)
    public final void method112(int arg0) {
        this.method2134(5);
        ++field4816;
    }

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "(I)V", line = 2936)
    public final void method2170(int arg0) {
        ++field4940;
        if (arg0 <= 98) {
            this.method2154(-94);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lfw;I)V", line = 2949)
    public final void method2171(class688 arg0, int arg1) {
        ++field4857;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method3847(1), 0);
        if (arg1 != -639156592) {
            this.method2152((byte) 58);
        }
    }

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "()Z", line = 2961)
    public final boolean method91() {
        ++field4742;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "()Lwc;", line = 2971)
    public final class376 method94() {
        ++field4919;
        return this.field4987;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([BIIZI)Ljb;", line = 2979)
    public final class719 method2172(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field4880;
        if (!this.field5040 || arg3 && !this.field5004) {
            if (arg2 != -1) {
                this.field5006 = -65;
            }
            return new class584(this, arg1, arg0, arg4);
        } else {
            return new class406(this, arg1, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!eq", name = "JA", descriptor = "(IIIIII)I", line = 2997)
    public final int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4893;
        int var7 = 0;
        float var8 = (float) arg2 * this.field4987.field9756 + (float) arg0 * this.field4987.field9776 + (float) arg1 * this.field4987.field9764 + this.field4987.field9774;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4987.field9756 + (float) arg3 * this.field4987.field9776 + (float) arg4 * this.field4987.field9764 + this.field4987.field9774;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field5060 && var9 < (float) this.field5060) {
            var7 |= 16;
        } else if (var8 > (float) this.field5039 && (float) this.field5039 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4987.field9773 + (float) arg0 * this.field4987.field9763 + (float) arg1 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / var8);
        int var11 = (int) (((float) arg5 * this.field4987.field9773 + (float) arg3 * this.field4987.field9763 + (float) arg4 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / var9);
        if (this.field5074 > (float) var10 && (float) var11 < this.field5074) {
            var7 |= 1;
        } else if ((float) var10 > this.field5089 && (float) var11 > this.field5089) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4987.field9758 + (float) arg0 * this.field4987.field9753 + (float) arg1 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / var8);
        int var13 = (int) (((float) arg5 * this.field4987.field9758 + (float) arg3 * this.field4987.field9753 + (float) arg4 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / var9);
        if ((float) var12 < this.field4995 && this.field4995 > (float) var13) {
            var7 |= 4;
        } else if (this.field5032 < (float) var12 && (float) var13 > this.field5032) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!eq", name = "XA", descriptor = "()I", line = 3048)
    public final int method108() {
        ++field4832;
        return this.field5039;
    }

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "()V", line = 3056)
    public final void method116() {
        ++field4909;
        if (this.field5010 && this.field4917 > 0 && this.field4882 > 0) {
            int var1 = this.field5092;
            int var2 = this.field5008;
            int var3 = this.field5071;
            int var4 = this.field5026;
            this.method59();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2193(8448);
            this.method2148(-32, false);
            this.method2188(false, false);
            this.method2139(2929, false);
            this.method2125(0, false);
            this.method2120(-1, (class411) null);
            this.method2140(0, -2);
            this.method2153(117, 1);
            this.method2195(45, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4917, this.field4882, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method131(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqv;I)V", line = 3102)
    public final void method2173(class72 arg0, int arg1) {
        ++field4845;
        if (arg1 == 20444) {
            if (~this.field4971 <= -1 && this.field4970[this.field4971] == arg0) {
                this.field4970[this.field4971--] = null;
                arg0.method530(-15772);
                if (~this.field4971 > -1) {
                    this.field4965 = null;
                } else {
                    this.field4965 = this.field4970[this.field4971];
                    this.field4965.method533((byte) -124);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "(I)V", line = 3125)
    private final void method2174(int arg0) {
        int var2 = 17 % ((13 - arg0) / 60);
        if (~this.field5008 <= ~this.field5092 && this.field5026 >= this.field5071) {
            OpenGL.glScissor(this.field5076 - -this.field5092, -this.field5026 + this.field5057 + this.field4882, -this.field5092 + this.field5008, this.field5026 - this.field5071);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field4883;
    }

    @OriginalMember(owner = "client!eq", name = "P", descriptor = "(IIIII)V", line = 3139)
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4821;
        this.method2150(-2);
        this.method2195(-99, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3160)
    public final void method95(Canvas arg0) {
        this.field4801 = null;
        ++field4741;
        this.field4943 = 0L;
        if (arg0 != null && this.field4855 != arg0) {
            if (this.field4822.containsKey(arg0)) {
                Long var2 = (Long) this.field4822.get(arg0);
                this.field4943 = var2;
                this.field4801 = arg0;
            }
        } else {
            this.field4943 = this.field4876;
            this.field4801 = this.field4855;
        }
        if (this.field4801 != null && ~this.field4943 != -1L) {
            this.field4932.setSurface(this.field4943);
            this.method2190((byte) -101);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "aa", descriptor = "(IIIIII)V", line = 3191)
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4863;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2150(-2);
        float var10 = (float) arg3 + var8;
        this.method2195(-106, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5095) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5095) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Lpk;)V", line = 3225)
    public final void method146(int arg0, class621[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5056[var3] = arg1[var3];
        }
        ++field4760;
        this.field5009 = arg0;
        if (~this.field5011 != -2) {
            this.method2119((byte) -94);
        }
    }

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "()I", line = 3247)
    public final int method147() {
        ++field4915;
        return this.field5060;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V", line = 3255)
    public final synchronized void method2175(int arg0, int arg1, int arg2) {
        ++field4751;
        class394 var4 = new class394(arg0);
        var4.field8746 = (long) arg1;
        this.field4976.method3110(var4, arg2);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFF)V", line = 3266)
    public final void method163(float arg0, float arg1, float arg2) {
        class437.field6140 = arg0;
        class651.field8941 = arg2;
        class202.field2581 = arg1;
        ++field4941;
    }

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "(ILaa;II)V", line = 3279)
    public final void method83(int arg0, class81 arg1, int arg2, int arg3) {
        ++field4898;
        class553 var5 = (class553) arg1;
        class77 var6 = var5.field7766;
        this.method2116(0);
        this.method2120(-1, var5.field7766);
        this.method2195(49, 1);
        this.method2165((byte) 74, 8448, 7681);
        this.method2132(768, (byte) 123, 34167, 0);
        float var7 = var6.field1028 / (float) var6.field1033;
        float var8 = var6.field1031 / (float) var6.field1023;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5092) * var7, (float) (this.field5071 - arg3) * var8);
        OpenGL.glVertex2i(this.field5092, this.field5071);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5092) * var7, (float) (-arg3 + this.field5026) * var8);
        OpenGL.glVertex2i(this.field5092, this.field5026);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5008) * var7, (float) (-arg3 + this.field5026) * var8);
        OpenGL.glVertex2i(this.field5008, this.field5026);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5008) * var7, (float) (this.field5071 - arg3) * var8);
        OpenGL.glVertex2i(this.field5008, this.field5071);
        OpenGL.glEnd();
        this.method2132(768, (byte) 102, 5890, 0);
    }

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "()V", line = 3311)
    public final void method142() {
        ++field4948;
    }

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "(II)V", line = 3318)
    public final synchronized void method2176(int arg0, int arg1) {
        if (arg1 != 23481) {
            this.method2189(85, true, -59, 11);
        }
        ++field4786;
        class394 var3 = new class394(arg0);
        this.field4978.method3110(var3, arg1 ^ 23480);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BZ)V", line = 3333)
    public final void method2177(byte arg0, boolean arg1) {
        if (!arg1 != !this.field5088) {
            this.field5088 = arg1;
            this.method2117((byte) -74);
        }
        ++field4912;
        if (arg0 != -62) {
            this.method78(-28, 75, 85, 35);
        }
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(II)I", line = 3351)
    public final int method135(int arg0, int arg1) {
        ++field4753;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIID)V", line = 3360)
    public final void method120(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field4858;
    }

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "()Z", line = 3368)
    public final boolean method152() {
        ++field4837;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIB)V", line = 3377)
    public final void method2178(int arg0, int arg1, byte arg2) {
        this.field5057 = arg1;
        ++field4890;
        if (arg2 > -118) {
            this.field5055 = -114;
        }
        this.field5076 = arg0;
        this.method2122((byte) 126);
        this.method2174(85);
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 3391)
    public class357(Canvas arg0, class96 arg1, int arg2) {
        super(arg1);
        new class430();
        new class583(16);
        this.field4975 = new class547();
        this.field4976 = new class547();
        this.field4977 = new class547();
        this.field4978 = new class547();
        this.field4979 = new class547();
        this.field4980 = new class547();
        this.field4981 = new class547();
        this.field4987 = new class688();
        this.field4991 = new class688();
        this.field4992 = new class688();
        this.field4994 = -1.0F;
        this.field5013 = 0.0F;
        this.field5018 = 1.0F;
        this.field5031 = new float[4];
        this.field5016 = 0;
        this.field4997 = true;
        this.field5020 = new float[4];
        this.field5026 = 0;
        this.field5060 = 50;
        this.field5002 = 3584.0F;
        this.field5058 = -1.0F;
        this.field5047 = 0;
        this.field5055 = 512;
        this.field5067 = 0;
        this.field5071 = 0;
        this.field5053 = -1.0F;
        this.field5024 = -1;
        this.field5068 = 1.0F;
        this.field5079 = -1;
        this.field5057 = 0;
        this.field5056 = new class621[class325.field4146];
        this.field5039 = 3584;
        this.field5000 = 1.0F;
        this.field5076 = 0;
        this.field5019 = 1.0F;
        this.field5063 = -1;
        this.field5072 = -1;
        this.field5069 = 8448;
        this.field5080 = 3584.0F;
        this.field5092 = 0;
        this.field5008 = 0;
        this.field5001 = 512;
        this.field5038 = false;
        this.field5066 = new float[4];
        this.field5097 = 0;
        this.field5091 = -1;
        this.field5094 = 8448;
        this.field5101 = -1.0F;
        this.field5029 = new float[16];
        this.field5078 = new float[4];
        this.field5102 = 1.0F;
        this.field5044 = new class552(8192);
        this.field5107 = new int[1];
        this.field5106 = new byte[16384];
        this.field5105 = new int[1];
        this.field5109 = new int[1];
        this.field4951 = arg2;
        this.field4801 = this.field4855 = arg0;
        if (!class10.method50("jaclib", (byte) -72)) {
            throw new RuntimeException("");
        } else if (!class10.method50("jaggl", (byte) -72)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4932 = new OpenGL();
                this.field4943 = this.field4876 = this.field4932.init(arg0, 8, 8, 8, 24, 0, this.field4951);
                if (this.field4876 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2134(5);
                    int var4 = this.method2156((byte) 127);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field5033 = this.field5025 ? 33639 : 5121;
                        if (this.field5003.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class124.method809(' ', -12, this.field5003.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class575.method3223(var10.substring(1, 3), 32145)) {
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
                                            if (~var10.length() <= -5 && class575.method3223(var10.substring(0, 4), 32145)) {
                                                var5 = class337.method1980(-27187, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field5040 = false;
                                }
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field5087 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5022 = false;
                            }
                            this.field5017 &= this.field4932.method279("GL_ARB_half_float_pixel");
                            this.field5098 = true;
                            this.field5004 = this.field5040;
                        }
                        if (this.field5070.indexOf("intel") != -1) {
                            this.field5073 = false;
                        }
                        this.field5010 = !this.field5070.equals("s3 graphics");
                        if (this.field5040) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class651.method3514(false, true, true);
                        this.field4960 = true;
                        this.field4949 = new class450(this, super.field6364);
                        this.method2186((byte) -76);
                        this.field4957 = new class172(this);
                        this.field4945 = new class682(this);
                        if (this.field4945.method3706((byte) 63)) {
                            this.field4950 = new class317(this);
                            if (!this.field4950.method1862((byte) 121)) {
                                this.field4950.method1857(-76);
                                this.field4950 = null;
                            }
                        }
                        this.field4946 = new class18(this);
                        this.method2169(1);
                        this.method2190((byte) -101);
                        this.method116();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method84();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)I", line = 3539)
    public final int method2179(int arg0, byte arg1) {
        ++field4823;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (~arg0 != -6408) {
                    if (~arg0 != -6409 && arg0 != 34847) {
                        if (~arg0 != -34844) {
                            if (arg0 != 34842) {
                                if (arg0 != 6402) {
                                    if (arg0 == 6401) {
                                        return 1;
                                    } else {
                                        int var3 = -32 / ((arg1 - 19) / 55);
                                        throw new IllegalArgumentException("");
                                    }
                                } else {
                                    return 3;
                                }
                            } else {
                                return 8;
                            }
                        } else {
                            return 6;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)Lza;", line = 3580)
    public final class702 method161(int arg0) {
        ++field4899;
        class479 var2 = new class479(arg0);
        this.field4958.method3110(var2, 1);
        return var2;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[BZZ)Lur;", line = 3593)
    public final class355 method2180(int arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4) {
        ++field4842;
        if (!arg3) {
            this.method2168(101);
        }
        return (class355) (!this.field5040 || arg4 && !this.field5004 ? new class562(this, arg0, arg2, arg1) : new class554(this, arg0, arg2, arg1, arg4));
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lqe;Lqe;Lqe;Lqe;I)V", line = 3610)
    public final void method2181(class88 arg0, class88 arg1, class88 arg2, class88 arg3, int arg4) {
        if (arg1 != null) {
            this.method2187(-21610, arg1.field1118);
            OpenGL.glVertexPointer(arg1.field1114, arg1.field1119, this.field5075.method2111((byte) 124), this.field5075.method2110(true) + (long) arg1.field1117);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg4 == 15063) {
            ++field4885;
            if (arg0 != null) {
                this.method2187(arg4 ^ -28351, arg0.field1118);
                OpenGL.glNormalPointer(arg0.field1119, this.field5075.method2111((byte) 124), this.field5075.method2110(true) - -((long) arg0.field1117));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg2 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method2187(arg4 ^ -28351, arg2.field1118);
                OpenGL.glColorPointer(arg2.field1114, arg2.field1119, this.field5075.method2111((byte) 124), this.field5075.method2110(true) - -((long) arg2.field1117));
                OpenGL.glEnableClientState(32886);
            }
            if (arg3 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2187(-21610, arg3.field1118);
                OpenGL.glTexCoordPointer(arg3.field1114, arg3.field1119, this.field5075.method2111((byte) 124), this.field5075.method2110(true) - -((long) arg3.field1117));
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IBLha;IIIII)V", line = 3657)
    public static final void method2182(int arg0, byte arg1, class454 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 == 46) {
            class422.field5998 = arg2;
            ++field4812;
            class351.field4604 = class422.field5998.method125();
            class593.field8260 = class422.field5998.method125();
            class128.field1554 = class422.field5998.method125();
            class509.field7192 = arg6;
            class297.field3856 = null;
            class117.field1427 = 0;
            class304.field3930 = 0;
            class112.field1383 = arg4;
            class286.field3625 = arg0;
            class664.field9087 = arg5;
            class709.field9973 = 1;
            class181.method1165(arg7, arg3, arg1 ^ 111);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIILjb;)V", line = 3680)
    public final void method2183(int arg0, int arg1, int arg2, int arg3, class719 arg4) {
        ++field4825;
        int var6 = arg4.method2405(-14757);
        int var7 = arg1 * this.method2166((byte) 68, var6);
        this.method2138(28419, arg4);
        OpenGL.glDrawElements(arg3, arg0, var6, arg4.method2410((byte) 80) + (long) var7);
        if (arg2 != -30308) {
            this.field4801 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "()Lwc;", line = 3701)
    public final class376 method125() {
        ++field4856;
        return new class688();
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)Z", line = 3710)
    public static final boolean method2184(int arg0, int arg1, int arg2) {
        ++field4777;
        if (arg2 >= -61) {
            return false;
        } else {
            return (1048832 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 3721)
    public static final void method2185(String arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4782 = null;
        }
        ++field4750;
        class548 var3 = class696.method3872(arg1, 3, -1633381944);
        var3.method3130(53);
        var3.field7727 = arg0;
    }

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "(B)V", line = 3735)
    private final void method2186(byte arg0) {
        this.field5061 = new class411[this.field5006];
        ++field4903;
        this.field5037 = new class185(this, 3553, 6408, 1, 1);
        int var2 = -67 % ((arg0 - 56) / 34);
        new class185(this, 3553, 6408, 1, 1);
        new class185(this, 3553, 6408, 1, 1);
        this.field5027 = new class403(this);
        this.field5041 = new class403(this);
        this.field5054 = new class403(this);
        this.field5036 = new class403(this);
        this.field5015 = new class403(this);
        this.field5099 = new class403(this);
        this.field4998 = new class403(this);
        this.field5090 = new class403(this);
        this.field5064 = new class403(this);
        this.field5062 = new class403(this);
        if (this.field5073) {
            this.field5005 = new class504(this);
            new class504(this);
        }
    }

    @OriginalMember(owner = "client!eq", name = "DA", descriptor = "(IIII)V", line = 3775)
    public final void method117(int arg0, int arg1, int arg2, int arg3) {
        this.field5016 = arg1;
        this.field5055 = arg2;
        this.field5001 = arg3;
        this.field5067 = arg0;
        ++field4747;
        this.method2161(-124);
        this.method2152((byte) 25);
        if (this.field5011 == 3) {
            this.method2154(-17081);
        } else if (this.field5011 == 2) {
            this.method2162(71);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILur;)V", line = 3798)
    public final void method2187(int arg0, class355 arg1) {
        if (this.field5075 != arg1) {
            if (this.field5040) {
                OpenGL.glBindBufferARB(34962, arg1.method2112(89));
            }
            this.field5075 = arg1;
        }
        ++field4916;
        if (arg0 != -21610) {
            this.method140((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILaa;II)V", line = 3817)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8) {
        ++field4914;
        class553 var10 = (class553) arg6;
        class77 var11 = var10.field7766;
        this.method2116(0);
        this.method2120(-1, var10.field7766);
        this.method2195(-86, arg5);
        this.method2165((byte) 74, 8448, 7681);
        this.method2132(768, (byte) 105, 34167, 0);
        float var12 = var11.field1028 / (float) var11.field1033;
        float var13 = var11.field1031 / (float) var11.field1023;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2132(768, (byte) 112, 5890, 0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZ)V", line = 3855)
    public final void method2188(boolean arg0, boolean arg1) {
        if (this.field5050 == !arg1) {
            this.field5050 = arg1;
            this.method2117((byte) 87);
            this.field4982 &= -8;
        }
        ++field4840;
        if (arg0) {
            this.field5013 = 0.9781914F;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZII)V", line = 3873)
    public final void method2189(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4745;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg3);
        if (!arg1) {
            this.field5038 = true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "(B)V", line = 3886)
    private final void method2190(byte arg0) {
        ++field4906;
        if (this.field4801 == null) {
            this.field4744 = this.field4811 = 0;
        } else {
            Dimension var2 = this.field4801.getSize();
            this.field4811 = var2.height;
            this.field4744 = var2.width;
        }
        if (this.field4968 == null) {
            this.field4917 = this.field4744;
            this.field4882 = this.field4811;
            this.method2122((byte) -124);
        }
        if (arg0 != -101) {
            this.method2161(-10);
        }
        this.method2193(arg0 ^ -8549);
        this.method59();
    }

    @OriginalMember(owner = "client!eq", name = "da", descriptor = "(III[I)V", line = 3916)
    public final void method109(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4836;
        float var5 = (float) arg2 * this.field4987.field9756 + (float) arg0 * this.field4987.field9776 + (float) arg1 * this.field4987.field9764 + this.field4987.field9774;
        if (!(var5 < (float) this.field5060) && !(var5 > (float) this.field5039)) {
            int var6 = (int) (((float) arg2 * this.field4987.field9773 + (float) arg0 * this.field4987.field9763 + (float) arg1 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / var5);
            int var7 = (int) (((float) arg2 * this.field4987.field9758 + (float) arg0 * this.field4987.field9753 + (float) arg1 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / var5);
            if ((float) var6 >= this.field5074 && this.field5089 >= (float) var6 && (float) var7 >= this.field4995 && (float) var7 <= this.field5032) {
                arg3[0] = (int) ((float) var6 - this.field5074);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field4995);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "()Z", line = 3950)
    public final boolean method149() {
        ++field4850;
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3963)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4867;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            class553 var13 = (class553) arg6;
            class77 var14 = var13.field7766;
            this.method2116(0);
            this.method2120(-1, var13.field7766);
            this.method2195(70, arg5);
            this.method2165((byte) 74, 8448, 7681);
            this.method2132(768, (byte) 100, 34167, 0);
            float var15 = var14.field1028 / (float) var14.field1033;
            float var16 = var14.field1031 / (float) var14.field1023;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            int var22 = arg11 % (arg9 + arg10);
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var22 > arg9) {
                var26 = (float) (-var22 + arg10 + arg9) * var21;
                var25 = (float) (-var22 + arg9 + arg10) * var20;
            } else {
                var28 = (float) (-var22 + arg9) * var21;
                var27 = (float) (arg9 - var22) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg2 <= arg0) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg3 < ~arg1) {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                var30 += var28 + var32;
                OpenGL.glEnd();
                var28 = var24;
                var27 = var23;
            }
            this.method2132(768, (byte) 126, 5890, 0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZLqv;)V", line = 4088)
    public final void method2191(boolean arg0, class72 arg1) {
        ++field4877;
        if (~this.field4969 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4969 >= 0) {
                this.field4963[this.field4969].method532((byte) -41);
            }
            this.field4968 = this.field4963[++this.field4969] = arg1;
            this.field4968.method529(arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(ILqv;)V", line = 4105)
    public final void method2192(int arg0, class72 arg1) {
        ++field4804;
        if (this.field4969 >= 0 && this.field4963[this.field4969] == arg1) {
            this.field4963[this.field4969--] = null;
            if (arg0 <= 77) {
                this.method67(-23, -4, -118, -27, 76, -110, 47, 106, 66, -32, 45, 83, 114);
            }
            arg1.method532((byte) -41);
            if (~this.field4969 > -1) {
                this.field4968 = null;
            } else {
                this.field4968 = this.field4963[this.field4969];
                this.field4968.method529(true);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "ZA", descriptor = "(IFFFFF)V", line = 4129)
    public final void method85(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4770;
        boolean var7 = this.field5079 != arg0;
        if (var7 || this.field4994 != arg1 || this.field5101 != arg2) {
            this.field4994 = arg1;
            this.field5101 = arg2;
            this.field5079 = arg0;
            if (var7) {
                this.field5102 = (float) (this.field5079 & 16711680) / 1.671168E7F;
                this.field5019 = (float) (65280 & this.field5079) / 65280.0F;
                this.field5018 = (float) (this.field5079 & 255) / 255.0F;
                this.method2123(true);
            }
            this.method2131(121);
        }
        if (this.field5066[0] != arg3 || this.field5066[1] != arg4 || this.field5066[2] != arg5) {
            this.field5066[0] = arg3;
            this.field5066[1] = arg4;
            this.field5066[2] = arg5;
            this.field5078[0] = -arg3;
            this.field5078[2] = -arg5;
            this.field5078[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5031[1] = arg4 * var8;
            this.field5031[0] = arg3 * var8;
            this.field5031[2] = arg5 * var8;
            this.field5020[0] = -this.field5031[0];
            this.field5020[1] = -this.field5031[1];
            this.field5020[2] = -this.field5031[2];
            this.method2115(0);
            this.field5035 = (int) (arg3 * 256.0F / arg4);
            this.field5023 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "(II)V", line = 4180)
    public final void method105(int arg0, int arg1) {
        ++field4792;
    }

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "(I)V", line = 4189)
    public final void method2193(int arg0) {
        if (this.field5011 != 0) {
            this.field5011 = 0;
            this.field4982 &= -32;
        }
        ++field4839;
        if (arg0 != 8448) {
            this.field5081 = 1;
        }
    }

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "(III[I)V", line = 4210)
    public final void method162(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4929;
        float var5 = (float) arg2 * this.field4987.field9756 + (float) arg0 * this.field4987.field9776 + (float) arg1 * this.field4987.field9764 + this.field4987.field9774;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4987.field9773 + (float) arg0 * this.field4987.field9763 + (float) arg1 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / var5);
            int var7 = (int) (((float) arg2 * this.field4987.field9758 + (float) arg0 * this.field4987.field9753 + (float) arg1 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / var5);
            arg3[0] = (int) ((float) var6 - this.field5074);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 - this.field4995);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLfw;)V", line = 4232)
    public final void method2194(byte arg0, class688 arg1) {
        ++field4925;
        if (arg0 != -28) {
            this.method94();
        }
        OpenGL.glLoadMatrixf(arg1.method3847(arg0 + 29), 0);
    }

    @OriginalMember(owner = "client!eq", name = "U", descriptor = "(IIIII)V", line = 4245)
    public final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4772;
        this.method2150(-2);
        this.method2195(-92, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "(II)V", line = 4265)
    public final void method2195(int arg0, int arg1) {
        int var3 = -77 % ((arg0 - -13) / 54);
        if (this.field4985 != arg1) {
            boolean var4;
            boolean var5;
            byte var6;
            if (~arg1 == -2) {
                var4 = true;
                var5 = true;
                var6 = 1;
            } else if (arg1 != 2) {
                if (~arg1 != -129) {
                    var4 = true;
                    var6 = 0;
                    var5 = false;
                } else {
                    var4 = true;
                    var5 = true;
                    var6 = 3;
                }
            } else {
                var4 = true;
                var5 = false;
                var6 = 2;
            }
            if (this.field4986 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field4986 = var4;
            }
            if (!var5 != !this.field4989) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field4989 = var5;
            }
            if (this.field4988 != var6) {
                if (var6 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var6 != 2) {
                    if (var6 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field4988 = var6;
            }
            this.field4985 = arg1;
            this.field4982 &= -29;
        }
        ++field4803;
    }

    @OriginalMember(owner = "client!eq", name = "la", descriptor = "()V", line = 4363)
    public final void method59() {
        this.field5092 = 0;
        this.field5071 = 0;
        this.field5026 = this.field4882;
        ++field4887;
        this.field5008 = this.field4917;
        OpenGL.glDisable(3089);
        this.method2152((byte) 25);
    }

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "()I", line = 4378)
    public final int method127() {
        ++field4800;
        int var1 = this.field5104;
        this.field5104 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIII)V", line = 4389)
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4939;
        this.method2150(-2);
        this.method2195(99, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
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

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "()I", line = 4421)
    public final int method126() {
        ++field4776;
        int var1 = this.field5108;
        this.field5108 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIB)V", line = 4434)
    public final synchronized void method2196(int arg0, int arg1, byte arg2) {
        if (arg2 != 32) {
            this.method75((int[]) null, 23, -91, -64, -96, false);
        }
        ++field4749;
        class394 var4 = new class394(arg0);
        var4.field8746 = (long) arg1;
        this.field4977.method3110(var4, 1);
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 4449)
    public final void method140(Canvas arg0) {
        ++field4866;
        if (this.field4855 == arg0) {
            throw new RuntimeException();
        } else if (this.field4822.containsKey(arg0)) {
            Long var2 = (Long) this.field4822.get(arg0);
            this.field4932.releaseSurface(arg0, var2);
            this.field4822.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(ILqv;)V", line = 4474)
    public final void method2197(int arg0, class72 arg1) {
        ++field4879;
        if (this.field4971 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4971 <= -1) {
                this.field4970[this.field4971].method530(arg0 + -10857);
            }
            this.field4965 = this.field4970[++this.field4971] = arg1;
            this.field4965.method533((byte) -124);
            if (arg0 != -4915) {
                this.field4980 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lst;", line = 4496)
    public final class675 method148(int arg0, int arg1) {
        ++field4846;
        return null;
    }

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "(IIIIIII)I", line = 4506)
    public final int method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4902;
        float var8 = (float) arg2 * this.field4987.field9756 + (float) arg0 * this.field4987.field9776 + (float) arg1 * this.field4987.field9764 + this.field4987.field9774;
        float var9 = (float) arg5 * this.field4987.field9756 + (float) arg3 * this.field4987.field9776 + (float) arg4 * this.field4987.field9764 + this.field4987.field9774;
        int var10 = 0;
        if (var8 < (float) this.field5060 && var9 < (float) this.field5060) {
            var10 |= 16;
        } else if ((float) this.field5039 < var8 && (float) this.field5039 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4987.field9773 + (float) arg0 * this.field4987.field9763 + (float) arg1 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4987.field9773 + (float) arg3 * this.field4987.field9763 + (float) arg4 * this.field4987.field9755 + this.field4987.field9782) * (float) this.field5055 / (float) arg6);
        if (this.field5074 > (float) var11 && (float) var12 < this.field5074) {
            var10 |= 1;
        } else if ((float) var11 > this.field5089 && (float) var12 > this.field5089) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4987.field9758 + (float) arg0 * this.field4987.field9753 + (float) arg1 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4987.field9758 + (float) arg3 * this.field4987.field9753 + (float) arg4 * this.field4987.field9771 + this.field4987.field9775) * (float) this.field5001 / (float) arg6);
        if ((float) var13 < this.field4995 && this.field4995 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field5032 && (float) var14 > this.field5032) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "(Z)V", line = 4564)
    public final void method129(boolean arg0) {
        ++field4797;
        this.field4997 = arg0;
        this.method2136((byte) 31);
    }
}
